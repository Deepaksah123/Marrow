package com.google.android.exoplayer2.analytics;

import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.source.rtsp.RtspMediaSource;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
@Deprecated
public final class PlaybackStats {
    public static final PlaybackStats EMPTY = merge(new PlaybackStats[0]);
    public static final int PLAYBACK_STATE_ABANDONED = 15;
    public static final int PLAYBACK_STATE_BUFFERING = 6;
    static final int PLAYBACK_STATE_COUNT = 16;
    public static final int PLAYBACK_STATE_ENDED = 11;
    public static final int PLAYBACK_STATE_FAILED = 13;
    public static final int PLAYBACK_STATE_INTERRUPTED_BY_AD = 14;
    public static final int PLAYBACK_STATE_JOINING_BACKGROUND = 1;
    public static final int PLAYBACK_STATE_JOINING_FOREGROUND = 2;
    public static final int PLAYBACK_STATE_NOT_STARTED = 0;
    public static final int PLAYBACK_STATE_PAUSED = 4;
    public static final int PLAYBACK_STATE_PAUSED_BUFFERING = 7;
    public static final int PLAYBACK_STATE_PLAYING = 3;
    public static final int PLAYBACK_STATE_SEEKING = 5;
    public static final int PLAYBACK_STATE_STOPPED = 12;
    public static final int PLAYBACK_STATE_SUPPRESSED = 9;
    public static final int PLAYBACK_STATE_SUPPRESSED_BUFFERING = 10;
    public final int abandonedBeforeReadyCount;
    public final int adPlaybackCount;
    public final List<EventTimeAndFormat> audioFormatHistory;
    public final int backgroundJoiningCount;
    public final int endedCount;
    public final int fatalErrorCount;
    public final List<EventTimeAndException> fatalErrorHistory;
    public final int fatalErrorPlaybackCount;
    public final long firstReportedTimeMs;
    public final int foregroundPlaybackCount;
    public final int initialAudioFormatBitrateCount;
    public final int initialVideoFormatBitrateCount;
    public final int initialVideoFormatHeightCount;
    public final long maxRebufferTimeMs;
    public final List<long[]> mediaTimeHistory;
    public final int nonFatalErrorCount;
    public final List<EventTimeAndException> nonFatalErrorHistory;
    public final int playbackCount;
    private final long[] playbackStateDurationsMs;
    public final List<EventTimeAndPlaybackState> playbackStateHistory;
    public final long totalAudioFormatBitrateTimeProduct;
    public final long totalAudioFormatTimeMs;
    public final long totalAudioUnderruns;
    public final long totalBandwidthBytes;
    public final long totalBandwidthTimeMs;
    public final long totalDroppedFrames;
    public final long totalInitialAudioFormatBitrate;
    public final long totalInitialVideoFormatBitrate;
    public final int totalInitialVideoFormatHeight;
    public final int totalPauseBufferCount;
    public final int totalPauseCount;
    public final int totalRebufferCount;
    public final int totalSeekCount;
    public final long totalValidJoinTimeMs;
    public final long totalVideoFormatBitrateTimeMs;
    public final long totalVideoFormatBitrateTimeProduct;
    public final long totalVideoFormatHeightTimeMs;
    public final long totalVideoFormatHeightTimeProduct;
    public final int validJoinTimeCount;
    public final List<EventTimeAndFormat> videoFormatHistory;

    public static final class EventTimeAndPlaybackState {
        public final AnalyticsListener.EventTime eventTime;
        public final int playbackState;

        public EventTimeAndPlaybackState(AnalyticsListener.EventTime eventTime, int i) {
            this.eventTime = eventTime;
            this.playbackState = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            EventTimeAndPlaybackState eventTimeAndPlaybackState = (EventTimeAndPlaybackState) obj;
            if (this.playbackState != eventTimeAndPlaybackState.playbackState) {
                return false;
            }
            return this.eventTime.equals(eventTimeAndPlaybackState.eventTime);
        }

        public final int hashCode() {
            return (this.eventTime.hashCode() * 31) + this.playbackState;
        }
    }

    public static final class EventTimeAndFormat {
        public final AnalyticsListener.EventTime eventTime;
        public final Format format;

        public EventTimeAndFormat(AnalyticsListener.EventTime eventTime, Format format) {
            this.eventTime = eventTime;
            this.format = format;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass()) {
                EventTimeAndFormat eventTimeAndFormat = (EventTimeAndFormat) obj;
                if (!this.eventTime.equals(eventTimeAndFormat.eventTime)) {
                    return false;
                }
                Format format = this.format;
                if (format != null) {
                    return format.equals(eventTimeAndFormat.format);
                }
                if (eventTimeAndFormat.format == null) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            int iHashCode = this.eventTime.hashCode();
            Format format = this.format;
            return (iHashCode * 31) + (format != null ? format.hashCode() : 0);
        }
    }

    public static final class EventTimeAndException {
        public final AnalyticsListener.EventTime eventTime;
        public final Exception exception;

        public EventTimeAndException(AnalyticsListener.EventTime eventTime, Exception exc) {
            this.eventTime = eventTime;
            this.exception = exc;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            EventTimeAndException eventTimeAndException = (EventTimeAndException) obj;
            if (this.eventTime.equals(eventTimeAndException.eventTime)) {
                return this.exception.equals(eventTimeAndException.exception);
            }
            return false;
        }

        public final int hashCode() {
            return (this.eventTime.hashCode() * 31) + this.exception.hashCode();
        }
    }

    public static PlaybackStats merge(PlaybackStats... playbackStatsArr) {
        PlaybackStats[] playbackStatsArr2 = playbackStatsArr;
        int i = 16;
        long[] jArr = new long[16];
        int length = playbackStatsArr2.length;
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        long j4 = 0;
        long j5 = 0;
        long j6 = 0;
        long j7 = 0;
        long j8 = 0;
        long j9 = 0;
        long j10 = 0;
        long jMax = -9223372036854775807L;
        long jMin = -9223372036854775807L;
        long j11 = -9223372036854775807L;
        int i2 = -1;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        long j12 = -1;
        int i17 = 0;
        long j13 = -1;
        int i18 = 0;
        int i19 = 0;
        int i20 = 0;
        while (i3 < length) {
            PlaybackStats playbackStats = playbackStatsArr2[i3];
            i4 += playbackStats.playbackCount;
            int i21 = 0;
            while (i21 < i) {
                jArr[i21] = jArr[i21] + playbackStats.playbackStateDurationsMs[i21];
                i21++;
                i = 16;
            }
            if (jMin == C.TIME_UNSET) {
                jMin = playbackStats.firstReportedTimeMs;
            } else {
                long j14 = playbackStats.firstReportedTimeMs;
                if (j14 != C.TIME_UNSET) {
                    jMin = Math.min(jMin, j14);
                }
            }
            i5 += playbackStats.foregroundPlaybackCount;
            i6 += playbackStats.abandonedBeforeReadyCount;
            i7 += playbackStats.endedCount;
            i8 += playbackStats.backgroundJoiningCount;
            if (j11 == C.TIME_UNSET) {
                j11 = playbackStats.totalValidJoinTimeMs;
            } else {
                long j15 = playbackStats.totalValidJoinTimeMs;
                if (j15 != C.TIME_UNSET) {
                    j11 += j15;
                }
            }
            i9 += playbackStats.validJoinTimeCount;
            i10 += playbackStats.totalPauseCount;
            i11 += playbackStats.totalPauseBufferCount;
            i12 += playbackStats.totalSeekCount;
            i13 += playbackStats.totalRebufferCount;
            if (jMax == C.TIME_UNSET) {
                jMax = playbackStats.maxRebufferTimeMs;
            } else {
                long j16 = playbackStats.maxRebufferTimeMs;
                if (j16 != C.TIME_UNSET) {
                    jMax = Math.max(jMax, j16);
                }
            }
            i14 += playbackStats.adPlaybackCount;
            j += playbackStats.totalVideoFormatHeightTimeMs;
            j2 += playbackStats.totalVideoFormatHeightTimeProduct;
            j3 += playbackStats.totalVideoFormatBitrateTimeMs;
            j4 += playbackStats.totalVideoFormatBitrateTimeProduct;
            j5 += playbackStats.totalAudioFormatTimeMs;
            j6 += playbackStats.totalAudioFormatBitrateTimeProduct;
            i15 += playbackStats.initialVideoFormatHeightCount;
            i16 += playbackStats.initialVideoFormatBitrateCount;
            if (i2 == -1) {
                i2 = playbackStats.totalInitialVideoFormatHeight;
            } else {
                int i22 = playbackStats.totalInitialVideoFormatHeight;
                if (i22 != -1) {
                    i2 += i22;
                }
            }
            if (j12 == -1) {
                j12 = playbackStats.totalInitialVideoFormatBitrate;
            } else {
                long j17 = playbackStats.totalInitialVideoFormatBitrate;
                if (j17 != -1) {
                    j12 += j17;
                }
            }
            i17 += playbackStats.initialAudioFormatBitrateCount;
            if (j13 == -1) {
                j13 = playbackStats.totalInitialAudioFormatBitrate;
            } else {
                long j18 = playbackStats.totalInitialAudioFormatBitrate;
                if (j18 != -1) {
                    j13 += j18;
                }
            }
            j7 += playbackStats.totalBandwidthTimeMs;
            j8 += playbackStats.totalBandwidthBytes;
            j9 += playbackStats.totalDroppedFrames;
            j10 += playbackStats.totalAudioUnderruns;
            i18 += playbackStats.fatalErrorPlaybackCount;
            i19 += playbackStats.fatalErrorCount;
            i20 += playbackStats.nonFatalErrorCount;
            i3++;
            playbackStatsArr2 = playbackStatsArr;
            i = 16;
        }
        return new PlaybackStats(i4, jArr, Collections.emptyList(), Collections.emptyList(), jMin, i5, i6, i7, i8, j11, i9, i10, i11, i12, i13, jMax, i14, Collections.emptyList(), Collections.emptyList(), j, j2, j3, j4, j5, j6, i15, i16, i2, j12, i17, j13, j7, j8, j9, j10, i18, i19, i20, Collections.emptyList(), Collections.emptyList());
    }

    PlaybackStats(int i, long[] jArr, List<EventTimeAndPlaybackState> list, List<long[]> list2, long j, int i2, int i3, int i4, int i5, long j2, int i6, int i7, int i8, int i9, int i10, long j3, int i11, List<EventTimeAndFormat> list3, List<EventTimeAndFormat> list4, long j4, long j5, long j6, long j7, long j8, long j9, int i12, int i13, int i14, long j10, int i15, long j11, long j12, long j13, long j14, long j15, int i16, int i17, int i18, List<EventTimeAndException> list5, List<EventTimeAndException> list6) {
        this.playbackCount = i;
        this.playbackStateDurationsMs = jArr;
        this.playbackStateHistory = Collections.unmodifiableList(list);
        this.mediaTimeHistory = Collections.unmodifiableList(list2);
        this.firstReportedTimeMs = j;
        this.foregroundPlaybackCount = i2;
        this.abandonedBeforeReadyCount = i3;
        this.endedCount = i4;
        this.backgroundJoiningCount = i5;
        this.totalValidJoinTimeMs = j2;
        this.validJoinTimeCount = i6;
        this.totalPauseCount = i7;
        this.totalPauseBufferCount = i8;
        this.totalSeekCount = i9;
        this.totalRebufferCount = i10;
        this.maxRebufferTimeMs = j3;
        this.adPlaybackCount = i11;
        this.videoFormatHistory = Collections.unmodifiableList(list3);
        this.audioFormatHistory = Collections.unmodifiableList(list4);
        this.totalVideoFormatHeightTimeMs = j4;
        this.totalVideoFormatHeightTimeProduct = j5;
        this.totalVideoFormatBitrateTimeMs = j6;
        this.totalVideoFormatBitrateTimeProduct = j7;
        this.totalAudioFormatTimeMs = j8;
        this.totalAudioFormatBitrateTimeProduct = j9;
        this.initialVideoFormatHeightCount = i12;
        this.initialVideoFormatBitrateCount = i13;
        this.totalInitialVideoFormatHeight = i14;
        this.totalInitialVideoFormatBitrate = j10;
        this.initialAudioFormatBitrateCount = i15;
        this.totalInitialAudioFormatBitrate = j11;
        this.totalBandwidthTimeMs = j12;
        this.totalBandwidthBytes = j13;
        this.totalDroppedFrames = j14;
        this.totalAudioUnderruns = j15;
        this.fatalErrorPlaybackCount = i16;
        this.fatalErrorCount = i17;
        this.nonFatalErrorCount = i18;
        this.fatalErrorHistory = Collections.unmodifiableList(list5);
        this.nonFatalErrorHistory = Collections.unmodifiableList(list6);
    }

    public final long getPlaybackStateDurationMs(int i) {
        return this.playbackStateDurationsMs[i];
    }

    public final int getPlaybackStateAtTime(long j) {
        int i = 0;
        for (EventTimeAndPlaybackState eventTimeAndPlaybackState : this.playbackStateHistory) {
            if (eventTimeAndPlaybackState.eventTime.realtimeMs > j) {
                break;
            }
            i = eventTimeAndPlaybackState.playbackState;
        }
        return i;
    }

    public final long getMediaTimeMsAtRealtimeMs(long j) {
        if (this.mediaTimeHistory.isEmpty()) {
            return C.TIME_UNSET;
        }
        int i = 0;
        while (i < this.mediaTimeHistory.size() && this.mediaTimeHistory.get(i)[0] <= j) {
            i++;
        }
        if (i == 0) {
            return this.mediaTimeHistory.get(0)[1];
        }
        if (i == this.mediaTimeHistory.size()) {
            List<long[]> list = this.mediaTimeHistory;
            return list.get(list.size() - 1)[1];
        }
        int i2 = i - 1;
        long j2 = this.mediaTimeHistory.get(i2)[0];
        long j3 = this.mediaTimeHistory.get(i2)[1];
        long j4 = this.mediaTimeHistory.get(i)[0];
        long j5 = this.mediaTimeHistory.get(i)[1];
        long j6 = j4 - j2;
        if (j6 == 0) {
            return j3;
        }
        return j3 + ((long) ((j5 - j3) * ((j - j2) / j6)));
    }

    public final long getMeanJoinTimeMs() {
        int i = this.validJoinTimeCount;
        return i == 0 ? C.TIME_UNSET : this.totalValidJoinTimeMs / ((long) i);
    }

    public final long getTotalJoinTimeMs() {
        return getPlaybackStateDurationMs(2);
    }

    public final long getTotalPlayTimeMs() {
        return getPlaybackStateDurationMs(3);
    }

    public final long getMeanPlayTimeMs() {
        return this.foregroundPlaybackCount == 0 ? C.TIME_UNSET : getTotalPlayTimeMs() / ((long) this.foregroundPlaybackCount);
    }

    public final long getTotalPausedTimeMs() {
        return getPlaybackStateDurationMs(4) + getPlaybackStateDurationMs(7);
    }

    public final long getMeanPausedTimeMs() {
        return this.foregroundPlaybackCount == 0 ? C.TIME_UNSET : getTotalPausedTimeMs() / ((long) this.foregroundPlaybackCount);
    }

    public final long getTotalRebufferTimeMs() {
        return getPlaybackStateDurationMs(6);
    }

    public final long getMeanRebufferTimeMs() {
        return this.foregroundPlaybackCount == 0 ? C.TIME_UNSET : getTotalRebufferTimeMs() / ((long) this.foregroundPlaybackCount);
    }

    public final long getMeanSingleRebufferTimeMs() {
        return this.totalRebufferCount == 0 ? C.TIME_UNSET : (getPlaybackStateDurationMs(6) + getPlaybackStateDurationMs(7)) / ((long) this.totalRebufferCount);
    }

    public final long getTotalSeekTimeMs() {
        return getPlaybackStateDurationMs(5);
    }

    public final long getMeanSeekTimeMs() {
        return this.foregroundPlaybackCount == 0 ? C.TIME_UNSET : getTotalSeekTimeMs() / ((long) this.foregroundPlaybackCount);
    }

    public final long getMeanSingleSeekTimeMs() {
        return this.totalSeekCount == 0 ? C.TIME_UNSET : getTotalSeekTimeMs() / ((long) this.totalSeekCount);
    }

    public final long getTotalWaitTimeMs() {
        return getPlaybackStateDurationMs(2) + getPlaybackStateDurationMs(6) + getPlaybackStateDurationMs(5);
    }

    public final long getMeanWaitTimeMs() {
        return this.foregroundPlaybackCount == 0 ? C.TIME_UNSET : getTotalWaitTimeMs() / ((long) this.foregroundPlaybackCount);
    }

    public final long getTotalPlayAndWaitTimeMs() {
        return getTotalPlayTimeMs() + getTotalWaitTimeMs();
    }

    public final long getMeanPlayAndWaitTimeMs() {
        return this.foregroundPlaybackCount == 0 ? C.TIME_UNSET : getTotalPlayAndWaitTimeMs() / ((long) this.foregroundPlaybackCount);
    }

    public final long getTotalElapsedTimeMs() {
        long j = 0;
        for (int i = 0; i < 16; i++) {
            j += this.playbackStateDurationsMs[i];
        }
        return j;
    }

    public final long getMeanElapsedTimeMs() {
        return this.playbackCount == 0 ? C.TIME_UNSET : getTotalElapsedTimeMs() / ((long) this.playbackCount);
    }

    public final float getAbandonedBeforeReadyRatio() {
        int i = this.abandonedBeforeReadyCount;
        int i2 = this.playbackCount;
        int i3 = this.foregroundPlaybackCount;
        return i3 == 0 ? BitmapDescriptorFactory.HUE_RED : (i - (i2 - i3)) / i3;
    }

    public final float getEndedRatio() {
        int i = this.foregroundPlaybackCount;
        return i == 0 ? BitmapDescriptorFactory.HUE_RED : this.endedCount / i;
    }

    public final float getMeanPauseCount() {
        int i = this.foregroundPlaybackCount;
        return i == 0 ? BitmapDescriptorFactory.HUE_RED : this.totalPauseCount / i;
    }

    public final float getMeanPauseBufferCount() {
        int i = this.foregroundPlaybackCount;
        return i == 0 ? BitmapDescriptorFactory.HUE_RED : this.totalPauseBufferCount / i;
    }

    public final float getMeanSeekCount() {
        int i = this.foregroundPlaybackCount;
        return i == 0 ? BitmapDescriptorFactory.HUE_RED : this.totalSeekCount / i;
    }

    public final float getMeanRebufferCount() {
        int i = this.foregroundPlaybackCount;
        return i == 0 ? BitmapDescriptorFactory.HUE_RED : this.totalRebufferCount / i;
    }

    public final float getWaitTimeRatio() {
        long totalPlayAndWaitTimeMs = getTotalPlayAndWaitTimeMs();
        return totalPlayAndWaitTimeMs == 0 ? BitmapDescriptorFactory.HUE_RED : getTotalWaitTimeMs() / totalPlayAndWaitTimeMs;
    }

    public final float getJoinTimeRatio() {
        long totalPlayAndWaitTimeMs = getTotalPlayAndWaitTimeMs();
        return totalPlayAndWaitTimeMs == 0 ? BitmapDescriptorFactory.HUE_RED : getTotalJoinTimeMs() / totalPlayAndWaitTimeMs;
    }

    public final float getRebufferTimeRatio() {
        long totalPlayAndWaitTimeMs = getTotalPlayAndWaitTimeMs();
        return totalPlayAndWaitTimeMs == 0 ? BitmapDescriptorFactory.HUE_RED : getTotalRebufferTimeMs() / totalPlayAndWaitTimeMs;
    }

    public final float getSeekTimeRatio() {
        long totalPlayAndWaitTimeMs = getTotalPlayAndWaitTimeMs();
        return totalPlayAndWaitTimeMs == 0 ? BitmapDescriptorFactory.HUE_RED : getTotalSeekTimeMs() / totalPlayAndWaitTimeMs;
    }

    public final float getRebufferRate() {
        long totalPlayTimeMs = getTotalPlayTimeMs();
        return totalPlayTimeMs == 0 ? BitmapDescriptorFactory.HUE_RED : (this.totalRebufferCount * 1000.0f) / totalPlayTimeMs;
    }

    public final float getMeanTimeBetweenRebuffers() {
        return 1.0f / getRebufferRate();
    }

    public final int getMeanInitialVideoFormatHeight() {
        int i = this.initialVideoFormatHeightCount;
        if (i == 0) {
            return -1;
        }
        return this.totalInitialVideoFormatHeight / i;
    }

    public final int getMeanInitialVideoFormatBitrate() {
        int i = this.initialVideoFormatBitrateCount;
        if (i == 0) {
            return -1;
        }
        return (int) (this.totalInitialVideoFormatBitrate / ((long) i));
    }

    public final int getMeanInitialAudioFormatBitrate() {
        int i = this.initialAudioFormatBitrateCount;
        if (i == 0) {
            return -1;
        }
        return (int) (this.totalInitialAudioFormatBitrate / ((long) i));
    }

    public final int getMeanVideoFormatHeight() {
        long j = this.totalVideoFormatHeightTimeMs;
        if (j == 0) {
            return -1;
        }
        return (int) (this.totalVideoFormatHeightTimeProduct / j);
    }

    public final int getMeanVideoFormatBitrate() {
        long j = this.totalVideoFormatBitrateTimeMs;
        if (j == 0) {
            return -1;
        }
        return (int) (this.totalVideoFormatBitrateTimeProduct / j);
    }

    public final int getMeanAudioFormatBitrate() {
        long j = this.totalAudioFormatTimeMs;
        if (j == 0) {
            return -1;
        }
        return (int) (this.totalAudioFormatBitrateTimeProduct / j);
    }

    public final int getMeanBandwidth() {
        long j = this.totalBandwidthTimeMs;
        if (j == 0) {
            return -1;
        }
        return (int) ((this.totalBandwidthBytes * RtspMediaSource.DEFAULT_TIMEOUT_MS) / j);
    }

    public final float getDroppedFramesRate() {
        long totalPlayTimeMs = getTotalPlayTimeMs();
        return totalPlayTimeMs == 0 ? BitmapDescriptorFactory.HUE_RED : (this.totalDroppedFrames * 1000.0f) / totalPlayTimeMs;
    }

    public final float getAudioUnderrunRate() {
        long totalPlayTimeMs = getTotalPlayTimeMs();
        return totalPlayTimeMs == 0 ? BitmapDescriptorFactory.HUE_RED : (this.totalAudioUnderruns * 1000.0f) / totalPlayTimeMs;
    }

    public final float getFatalErrorRatio() {
        int i = this.foregroundPlaybackCount;
        return i == 0 ? BitmapDescriptorFactory.HUE_RED : this.fatalErrorPlaybackCount / i;
    }

    public final float getFatalErrorRate() {
        long totalPlayTimeMs = getTotalPlayTimeMs();
        return totalPlayTimeMs == 0 ? BitmapDescriptorFactory.HUE_RED : (this.fatalErrorCount * 1000.0f) / totalPlayTimeMs;
    }

    public final float getMeanTimeBetweenFatalErrors() {
        return 1.0f / getFatalErrorRate();
    }

    public final float getMeanNonFatalErrorCount() {
        int i = this.foregroundPlaybackCount;
        return i == 0 ? BitmapDescriptorFactory.HUE_RED : this.nonFatalErrorCount / i;
    }

    public final float getNonFatalErrorRate() {
        long totalPlayTimeMs = getTotalPlayTimeMs();
        return totalPlayTimeMs == 0 ? BitmapDescriptorFactory.HUE_RED : (this.nonFatalErrorCount * 1000.0f) / totalPlayTimeMs;
    }

    public final float getMeanTimeBetweenNonFatalErrors() {
        return 1.0f / getNonFatalErrorRate();
    }
}
