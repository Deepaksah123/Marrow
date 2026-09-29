package kotlin;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\n\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\bj\u0002\b\fj\u0002\b\rj\u0002\b\n"}, d2 = {"Lo/getTrackTypeString;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "MediaBrowserCompatCustomActionResultReceiver", "Ljava/lang/String;", "IconCompatParcelizer", "()Ljava/lang/String;", "RemoteActionCompatParcelizer", "read", "write", "AudioAttributesCompatParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class getTrackTypeString {
    private static final /* synthetic */ getTrackTypeString[] AudioAttributesImplApi26Parcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private final String RemoteActionCompatParcelizer;
    public static final getTrackTypeString read = new getTrackTypeString("VIDEO", 0, "video");
    public static final getTrackTypeString IconCompatParcelizer = new getTrackTypeString("MCQ", 1, "mcq");
    public static final getTrackTypeString write = new getTrackTypeString("TEST", 2, "test");
    public static final getTrackTypeString AudioAttributesCompatParcelizer = new getTrackTypeString("MCQ_SUBJECT", 3, "mcq_subj");
    public static final getTrackTypeString RemoteActionCompatParcelizer = new getTrackTypeString("VIDEO_SUBJECT", 4, "video_subj");

    private getTrackTypeString(String str, int i, String str2) {
        this.RemoteActionCompatParcelizer = str2;
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final String getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    static {
        getTrackTypeString[] gettracktypestringArr = read();
        AudioAttributesImplApi26Parcelizer = gettracktypestringArr;
        getMagicModuleTimeline.IconCompatParcelizer(gettracktypestringArr);
    }

    private static final /* synthetic */ getTrackTypeString[] read() {
        return new getTrackTypeString[]{read, IconCompatParcelizer, write, AudioAttributesCompatParcelizer, RemoteActionCompatParcelizer};
    }

    public static getTrackTypeString valueOf(String str) {
        return (getTrackTypeString) Enum.valueOf(getTrackTypeString.class, str);
    }

    public static getTrackTypeString[] values() {
        return (getTrackTypeString[]) AudioAttributesImplApi26Parcelizer.clone();
    }
}
