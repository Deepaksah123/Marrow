package com.google.android.exoplayer2.text;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.exoplayer2.BaseRenderer;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.FormatHolder;
import com.google.android.exoplayer2.RendererCapabilities;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.Util;
import kotlin.initExtraTracks;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public final class TextRenderer extends BaseRenderer implements Handler.Callback {
    private static final int MSG_UPDATE_OUTPUT = 0;
    private static final int REPLACEMENT_STATE_NONE = 0;
    private static final int REPLACEMENT_STATE_SIGNAL_END_OF_STREAM = 1;
    private static final int REPLACEMENT_STATE_WAIT_END_OF_STREAM = 2;
    private static final String TAG = "TextRenderer";
    private SubtitleDecoder decoder;
    private final SubtitleDecoderFactory decoderFactory;
    private int decoderReplacementState;
    private long finalStreamEndPositionUs;
    private final FormatHolder formatHolder;
    private boolean inputStreamEnded;
    private long lastRendererPositionUs;
    private SubtitleInputBuffer nextInputBuffer;
    private SubtitleOutputBuffer nextSubtitle;
    private int nextSubtitleEventIndex;
    private final TextOutput output;
    private final Handler outputHandler;
    private boolean outputStreamEnded;
    private long outputStreamOffsetUs;
    private Format streamFormat;
    private SubtitleOutputBuffer subtitle;
    private boolean waitingForKeyFrame;

    @Override // com.google.android.exoplayer2.Renderer
    public final boolean isReady() {
        return true;
    }

    public TextRenderer(TextOutput textOutput, Looper looper) {
        this(textOutput, looper, SubtitleDecoderFactory.DEFAULT);
    }

    public TextRenderer(TextOutput textOutput, Looper looper, SubtitleDecoderFactory subtitleDecoderFactory) {
        super(3);
        this.output = (TextOutput) Assertions.checkNotNull(textOutput);
        this.outputHandler = looper == null ? null : Util.createHandler(looper, this);
        this.decoderFactory = subtitleDecoderFactory;
        this.formatHolder = new FormatHolder();
        this.finalStreamEndPositionUs = C.TIME_UNSET;
        this.outputStreamOffsetUs = C.TIME_UNSET;
        this.lastRendererPositionUs = C.TIME_UNSET;
    }

    @Override // com.google.android.exoplayer2.Renderer, com.google.android.exoplayer2.RendererCapabilities
    public final String getName() {
        return TAG;
    }

    @Override // com.google.android.exoplayer2.RendererCapabilities
    public final int supportsFormat(Format format) {
        if (this.decoderFactory.supportsFormat(format)) {
            return RendererCapabilities.create(format.cryptoType == 0 ? 4 : 2);
        }
        if (MimeTypes.isText(format.sampleMimeType)) {
            return RendererCapabilities.create(1);
        }
        return RendererCapabilities.create(0);
    }

    public final void setFinalStreamEndPositionUs(long j) {
        Assertions.checkState(isCurrentStreamFinal());
        this.finalStreamEndPositionUs = j;
    }

    @Override // com.google.android.exoplayer2.BaseRenderer
    public final void onStreamChanged(Format[] formatArr, long j, long j2) {
        this.outputStreamOffsetUs = j2;
        this.streamFormat = formatArr[0];
        if (this.decoder != null) {
            this.decoderReplacementState = 1;
        } else {
            initDecoder();
        }
    }

    @Override // com.google.android.exoplayer2.BaseRenderer
    public final void onPositionReset(long j, boolean z) {
        this.lastRendererPositionUs = j;
        clearOutput();
        this.inputStreamEnded = false;
        this.outputStreamEnded = false;
        this.finalStreamEndPositionUs = C.TIME_UNSET;
        if (this.decoderReplacementState != 0) {
            replaceDecoder();
        } else {
            releaseBuffers();
            ((SubtitleDecoder) Assertions.checkNotNull(this.decoder)).flush();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00a9  */
    @Override // com.google.android.exoplayer2.Renderer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void render(long r9, long r11) {
        /*
            Method dump skipped, instruction units count: 320
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.text.TextRenderer.render(long, long):void");
    }

    @Override // com.google.android.exoplayer2.BaseRenderer
    public final void onDisabled() {
        this.streamFormat = null;
        this.finalStreamEndPositionUs = C.TIME_UNSET;
        clearOutput();
        this.outputStreamOffsetUs = C.TIME_UNSET;
        this.lastRendererPositionUs = C.TIME_UNSET;
        releaseDecoder();
    }

    @Override // com.google.android.exoplayer2.Renderer
    public final boolean isEnded() {
        return this.outputStreamEnded;
    }

    private void releaseBuffers() {
        this.nextInputBuffer = null;
        this.nextSubtitleEventIndex = -1;
        SubtitleOutputBuffer subtitleOutputBuffer = this.subtitle;
        if (subtitleOutputBuffer != null) {
            subtitleOutputBuffer.release();
            this.subtitle = null;
        }
        SubtitleOutputBuffer subtitleOutputBuffer2 = this.nextSubtitle;
        if (subtitleOutputBuffer2 != null) {
            subtitleOutputBuffer2.release();
            this.nextSubtitle = null;
        }
    }

    private void releaseDecoder() {
        releaseBuffers();
        ((SubtitleDecoder) Assertions.checkNotNull(this.decoder)).release();
        this.decoder = null;
        this.decoderReplacementState = 0;
    }

    private void initDecoder() {
        this.waitingForKeyFrame = true;
        this.decoder = this.decoderFactory.createDecoder((Format) Assertions.checkNotNull(this.streamFormat));
    }

    private void replaceDecoder() {
        releaseDecoder();
        initDecoder();
    }

    private long getNextEventTime() {
        if (this.nextSubtitleEventIndex == -1) {
            return Long.MAX_VALUE;
        }
        Assertions.checkNotNull(this.subtitle);
        if (this.nextSubtitleEventIndex >= this.subtitle.getEventTimeCount()) {
            return Long.MAX_VALUE;
        }
        return this.subtitle.getEventTime(this.nextSubtitleEventIndex);
    }

    private void updateOutput(CueGroup cueGroup) {
        Handler handler = this.outputHandler;
        if (handler != null) {
            handler.obtainMessage(0, cueGroup).sendToTarget();
        } else {
            invokeUpdateOutputInternal(cueGroup);
        }
    }

    private void clearOutput() {
        updateOutput(new CueGroup(initExtraTracks.AudioAttributesImplApi26Parcelizer(), getPresentationTimeUs(this.lastRendererPositionUs)));
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what == 0) {
            invokeUpdateOutputInternal((CueGroup) message.obj);
            return true;
        }
        throw new IllegalStateException();
    }

    private void invokeUpdateOutputInternal(CueGroup cueGroup) {
        this.output.onCues(cueGroup.cues);
        this.output.onCues(cueGroup);
    }

    private void handleDecoderError(SubtitleDecoderException subtitleDecoderException) {
        StringBuilder sb = new StringBuilder("Subtitle decoding failed. streamFormat=");
        sb.append(this.streamFormat);
        Log.e(TAG, sb.toString(), subtitleDecoderException);
        clearOutput();
        replaceDecoder();
    }

    private long getCurrentEventTimeUs(long j) {
        int nextEventTimeIndex = this.subtitle.getNextEventTimeIndex(j);
        if (nextEventTimeIndex == 0 || this.subtitle.getEventTimeCount() == 0) {
            return this.subtitle.timeUs;
        }
        if (nextEventTimeIndex == -1) {
            return this.subtitle.getEventTime(r1.getEventTimeCount() - 1);
        }
        return this.subtitle.getEventTime(nextEventTimeIndex - 1);
    }

    private long getPresentationTimeUs(long j) {
        Assertions.checkState(j != C.TIME_UNSET);
        Assertions.checkState(this.outputStreamOffsetUs != C.TIME_UNSET);
        return j - this.outputStreamOffsetUs;
    }
}
