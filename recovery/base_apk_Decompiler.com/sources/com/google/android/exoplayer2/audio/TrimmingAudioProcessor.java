package com.google.android.exoplayer2.audio;

import com.google.android.exoplayer2.audio.AudioProcessor;
import com.google.android.exoplayer2.util.Util;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
final class TrimmingAudioProcessor extends BaseAudioProcessor {
    private static final int OUTPUT_ENCODING = 2;
    private byte[] endBuffer = Util.EMPTY_BYTE_ARRAY;
    private int endBufferSize;
    private int pendingTrimStartBytes;
    private boolean reconfigurationPending;
    private int trimEndFrames;
    private int trimStartFrames;
    private long trimmedFrameCount;

    public final void setTrimFrameCount(int i, int i2) {
        this.trimStartFrames = i;
        this.trimEndFrames = i2;
    }

    public final void resetTrimmedFrameCount() {
        this.trimmedFrameCount = 0L;
    }

    public final long getTrimmedFrameCount() {
        return this.trimmedFrameCount;
    }

    @Override // com.google.android.exoplayer2.audio.BaseAudioProcessor
    public final AudioProcessor.AudioFormat onConfigure(AudioProcessor.AudioFormat audioFormat) throws AudioProcessor.UnhandledAudioFormatException {
        if (audioFormat.encoding != 2) {
            throw new AudioProcessor.UnhandledAudioFormatException(audioFormat);
        }
        this.reconfigurationPending = true;
        return (this.trimStartFrames == 0 && this.trimEndFrames == 0) ? AudioProcessor.AudioFormat.NOT_SET : audioFormat;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public final void queueInput(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i = iLimit - iPosition;
        if (i != 0) {
            int iMin = Math.min(i, this.pendingTrimStartBytes);
            this.trimmedFrameCount += (long) (iMin / this.inputAudioFormat.bytesPerFrame);
            this.pendingTrimStartBytes -= iMin;
            byteBuffer.position(iPosition + iMin);
            if (this.pendingTrimStartBytes > 0) {
                return;
            }
            int i2 = i - iMin;
            int length = (this.endBufferSize + i2) - this.endBuffer.length;
            ByteBuffer byteBufferReplaceOutputBuffer = replaceOutputBuffer(length);
            int iConstrainValue = Util.constrainValue(length, 0, this.endBufferSize);
            byteBufferReplaceOutputBuffer.put(this.endBuffer, 0, iConstrainValue);
            int iConstrainValue2 = Util.constrainValue(length - iConstrainValue, 0, i2);
            byteBuffer.limit(byteBuffer.position() + iConstrainValue2);
            byteBufferReplaceOutputBuffer.put(byteBuffer);
            byteBuffer.limit(iLimit);
            int i3 = i2 - iConstrainValue2;
            int i4 = this.endBufferSize - iConstrainValue;
            this.endBufferSize = i4;
            byte[] bArr = this.endBuffer;
            System.arraycopy(bArr, iConstrainValue, bArr, 0, i4);
            byteBuffer.get(this.endBuffer, this.endBufferSize, i3);
            this.endBufferSize += i3;
            byteBufferReplaceOutputBuffer.flip();
        }
    }

    @Override // com.google.android.exoplayer2.audio.BaseAudioProcessor, com.google.android.exoplayer2.audio.AudioProcessor
    public final ByteBuffer getOutput() {
        int i;
        if (super.isEnded() && (i = this.endBufferSize) > 0) {
            replaceOutputBuffer(i).put(this.endBuffer, 0, this.endBufferSize).flip();
            this.endBufferSize = 0;
        }
        return super.getOutput();
    }

    @Override // com.google.android.exoplayer2.audio.BaseAudioProcessor, com.google.android.exoplayer2.audio.AudioProcessor
    public final boolean isEnded() {
        return super.isEnded() && this.endBufferSize == 0;
    }

    @Override // com.google.android.exoplayer2.audio.BaseAudioProcessor
    protected final void onQueueEndOfStream() {
        if (this.reconfigurationPending) {
            int i = this.endBufferSize;
            if (i > 0) {
                this.trimmedFrameCount += (long) (i / this.inputAudioFormat.bytesPerFrame);
            }
            this.endBufferSize = 0;
        }
    }

    @Override // com.google.android.exoplayer2.audio.BaseAudioProcessor
    protected final void onFlush() {
        if (this.reconfigurationPending) {
            this.reconfigurationPending = false;
            this.endBuffer = new byte[this.trimEndFrames * this.inputAudioFormat.bytesPerFrame];
            this.pendingTrimStartBytes = this.trimStartFrames * this.inputAudioFormat.bytesPerFrame;
        }
        this.endBufferSize = 0;
    }

    @Override // com.google.android.exoplayer2.audio.BaseAudioProcessor
    protected final void onReset() {
        this.endBuffer = Util.EMPTY_BYTE_ARRAY;
    }
}
