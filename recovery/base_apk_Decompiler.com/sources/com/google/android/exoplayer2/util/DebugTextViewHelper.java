package com.google.android.exoplayer2.util;

import android.os.Looper;
import android.widget.TextView;
import com.google.android.exoplayer2.ExoPlayer;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.decoder.DecoderCounters;
import com.google.android.exoplayer2.video.ColorInfo;
import java.util.Locale;

/* JADX INFO: loaded from: classes5.dex */
@Deprecated
public class DebugTextViewHelper {
    private static final int REFRESH_INTERVAL_MS = 1000;
    private final ExoPlayer player;
    private boolean started;
    private final TextView textView;
    private final Updater updater;

    public DebugTextViewHelper(ExoPlayer exoPlayer, TextView textView) {
        Assertions.checkArgument(exoPlayer.getApplicationLooper() == Looper.getMainLooper());
        this.player = exoPlayer;
        this.textView = textView;
        this.updater = new Updater();
    }

    public final void start() {
        if (this.started) {
            return;
        }
        this.started = true;
        this.player.addListener(this.updater);
        updateAndPost();
    }

    public final void stop() {
        if (this.started) {
            this.started = false;
            this.player.removeListener(this.updater);
            this.textView.removeCallbacks(this.updater);
        }
    }

    protected final void updateAndPost() {
        this.textView.setText(getDebugString());
        this.textView.removeCallbacks(this.updater);
        this.textView.postDelayed(this.updater, 1000L);
    }

    protected String getDebugString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getPlayerStateString());
        sb.append(getVideoString());
        sb.append(getAudioString());
        return sb.toString();
    }

    protected String getPlayerStateString() {
        String str;
        int playbackState = this.player.getPlaybackState();
        if (playbackState == 1) {
            str = "idle";
        } else if (playbackState == 2) {
            str = "buffering";
        } else if (playbackState == 3) {
            str = "ready";
        } else if (playbackState == 4) {
            str = "ended";
        } else {
            str = "unknown";
        }
        return String.format("playWhenReady:%s playbackState:%s item:%s", Boolean.valueOf(this.player.getPlayWhenReady()), str, Integer.valueOf(this.player.getCurrentMediaItemIndex()));
    }

    protected String getVideoString() {
        Format videoFormat = this.player.getVideoFormat();
        DecoderCounters videoDecoderCounters = this.player.getVideoDecoderCounters();
        if (videoFormat == null || videoDecoderCounters == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder("\n");
        sb.append(videoFormat.sampleMimeType);
        sb.append("(id:");
        sb.append(videoFormat.id);
        sb.append(" r:");
        sb.append(videoFormat.width);
        sb.append("x");
        sb.append(videoFormat.height);
        sb.append(getColorInfoString(videoFormat.colorInfo));
        sb.append(getPixelAspectRatioString(videoFormat.pixelWidthHeightRatio));
        sb.append(getDecoderCountersBufferCountString(videoDecoderCounters));
        sb.append(" vfpo: ");
        sb.append(getVideoFrameProcessingOffsetAverageString(videoDecoderCounters.totalVideoFrameProcessingOffsetUs, videoDecoderCounters.videoFrameProcessingOffsetCount));
        sb.append(")");
        return sb.toString();
    }

    protected String getAudioString() {
        Format audioFormat = this.player.getAudioFormat();
        DecoderCounters audioDecoderCounters = this.player.getAudioDecoderCounters();
        if (audioFormat == null || audioDecoderCounters == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder("\n");
        sb.append(audioFormat.sampleMimeType);
        sb.append("(id:");
        sb.append(audioFormat.id);
        sb.append(" hz:");
        sb.append(audioFormat.sampleRate);
        sb.append(" ch:");
        sb.append(audioFormat.channelCount);
        sb.append(getDecoderCountersBufferCountString(audioDecoderCounters));
        sb.append(")");
        return sb.toString();
    }

    private static String getDecoderCountersBufferCountString(DecoderCounters decoderCounters) {
        if (decoderCounters == null) {
            return "";
        }
        decoderCounters.ensureUpdated();
        StringBuilder sb = new StringBuilder(" sib:");
        sb.append(decoderCounters.skippedInputBufferCount);
        sb.append(" sb:");
        sb.append(decoderCounters.skippedOutputBufferCount);
        sb.append(" rb:");
        sb.append(decoderCounters.renderedOutputBufferCount);
        sb.append(" db:");
        sb.append(decoderCounters.droppedBufferCount);
        sb.append(" mcdb:");
        sb.append(decoderCounters.maxConsecutiveDroppedBufferCount);
        sb.append(" dk:");
        sb.append(decoderCounters.droppedToKeyframeCount);
        return sb.toString();
    }

    private static String getColorInfoString(ColorInfo colorInfo) {
        if (colorInfo == null || !colorInfo.isValid()) {
            return "";
        }
        StringBuilder sb = new StringBuilder(" colr:");
        sb.append(colorInfo.toLogString());
        return sb.toString();
    }

    private static String getPixelAspectRatioString(float f) {
        if (f == -1.0f || f == 1.0f) {
            return "";
        }
        StringBuilder sb = new StringBuilder(" par:");
        sb.append(String.format(Locale.US, "%.02f", Float.valueOf(f)));
        return sb.toString();
    }

    private static String getVideoFrameProcessingOffsetAverageString(long j, int i) {
        if (i == 0) {
            return "N/A";
        }
        return String.valueOf((long) (j / ((double) i)));
    }

    final class Updater implements Player.Listener, Runnable {
        private Updater() {
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public final void onPlaybackStateChanged(int i) {
            DebugTextViewHelper.this.updateAndPost();
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public final void onPlayWhenReadyChanged(boolean z, int i) {
            DebugTextViewHelper.this.updateAndPost();
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public final void onPositionDiscontinuity(Player.PositionInfo positionInfo, Player.PositionInfo positionInfo2, int i) {
            DebugTextViewHelper.this.updateAndPost();
        }

        @Override // java.lang.Runnable
        public final void run() {
            DebugTextViewHelper.this.updateAndPost();
        }
    }
}
