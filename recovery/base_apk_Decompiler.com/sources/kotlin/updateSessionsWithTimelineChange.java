package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001B\u001f\b\u0004\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\b\u001a\u0004\b\f\u0010\n\u0082\u0001\u0017\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#"}, d2 = {"Lo/updateSessionsWithTimelineChange;", "", "", "p0", "p1", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "AudioAttributesCompatParcelizer", "Ljava/lang/String;", "write", "()Ljava/lang/String;", "RemoteActionCompatParcelizer", "IconCompatParcelizer", "Lo/updateCurrentSession;", "Lo/getSessionForMediaPeriodId;", "Lo/belongsToSession;", "Lo/finishAllSessions;", "Lo/updateSessionsWithDiscontinuity;", "Lo/resolveWindowIndexToNewTimeline;", "Lo/maybeSetWindowSequenceNumber;", "Lo/isFinishedAtEventTime;", "Lo/MediaMetricsListener;", "Lo/canReportPendingFormatUpdate;", "Lo/finishCurrentSession;", "Lo/getDrmInitData;", "Lo/getStreamType;", "Lo/getLanguageAndRegion;", "Lo/getErrorInfo;", "Lo/getNetworkType;", "Lo/getDrmType;", "Lo/maybeAddSessions;", "Lo/maybeReportPlaybackError;", "Lo/maybeReportPlaybackStateChange;", "Lo/getTrackChangeReason;", "Lo/maybeUpdateTimelineMetadata;", "Lo/maybeUpdateAudioFormat;"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class updateSessionsWithTimelineChange {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final String write;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final String IconCompatParcelizer;

    public /* synthetic */ updateSessionsWithTimelineChange(String str, String str2, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(str, str2);
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final String getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final String getWrite() {
        return this.write;
    }

    private updateSessionsWithTimelineChange(String str, String str2) {
        this.IconCompatParcelizer = str;
        this.write = str2;
    }

    public /* synthetic */ updateSessionsWithTimelineChange(String str, String str2, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i & 1) != 0 ? "Unknown" : str, (i & 2) != 0 ? "Unknown" : str2, null);
    }
}
