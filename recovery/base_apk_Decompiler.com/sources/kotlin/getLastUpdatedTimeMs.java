package kotlin;

import com.marrow.data.models.mcq.bookmark.FilterItemRecord;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B!\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\r\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0011\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\r\u0010\u0010R\u001a\u0010\u0013\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0011\u0010\u0010j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0011j\u0002\b\rj\u0002\b\u000b"}, d2 = {"Lo/getLastUpdatedTimeMs;", "", "", "p0", "", "p1", "p2", "<init>", "(Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;)V", "AudioAttributesImplApi26Parcelizer", "I", "IconCompatParcelizer", "()I", "RemoteActionCompatParcelizer", "MediaBrowserCompatItemReceiver", "Ljava/lang/String;", "()Ljava/lang/String;", "read", "AudioAttributesImplBaseParcelizer", "write", "AudioAttributesCompatParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class getLastUpdatedTimeMs {
    private static final /* synthetic */ getLastUpdatedTimeMs[] MediaBrowserCompatCustomActionResultReceiver;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private final int RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private final String write;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private final String read;
    public static final getLastUpdatedTimeMs write = new getLastUpdatedTimeMs("ALL", 0, -1, FilterItemRecord.filter_all_title, "any");
    public static final getLastUpdatedTimeMs AudioAttributesCompatParcelizer = new getLastUpdatedTimeMs("FREE", 1, 3, "Free", "Free");
    public static final getLastUpdatedTimeMs read = new getLastUpdatedTimeMs("PAUSED", 2, 1, "Paused", "Paused");
    public static final getLastUpdatedTimeMs RemoteActionCompatParcelizer = new getLastUpdatedTimeMs("COMPLETED", 3, 2, "Completed", "Completed");
    public static final getLastUpdatedTimeMs IconCompatParcelizer = new getLastUpdatedTimeMs("UNATTEMPTED", 4, 0, "Unattempted", "Unattempted");

    private getLastUpdatedTimeMs(String str, int i, int i2, String str2, String str3) {
        this.RemoteActionCompatParcelizer = i2;
        this.read = str2;
        this.write = str3;
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final int getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final String getRead() {
        return this.read;
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final String getWrite() {
        return this.write;
    }

    static {
        getLastUpdatedTimeMs[] getlastupdatedtimemsArrAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer();
        MediaBrowserCompatCustomActionResultReceiver = getlastupdatedtimemsArrAudioAttributesCompatParcelizer;
        getMagicModuleTimeline.IconCompatParcelizer(getlastupdatedtimemsArrAudioAttributesCompatParcelizer);
    }

    private static final /* synthetic */ getLastUpdatedTimeMs[] AudioAttributesCompatParcelizer() {
        return new getLastUpdatedTimeMs[]{write, AudioAttributesCompatParcelizer, read, RemoteActionCompatParcelizer, IconCompatParcelizer};
    }

    public static getLastUpdatedTimeMs valueOf(String str) {
        return (getLastUpdatedTimeMs) Enum.valueOf(getLastUpdatedTimeMs.class, str);
    }

    public static getLastUpdatedTimeMs[] values() {
        return (getLastUpdatedTimeMs[]) MediaBrowserCompatCustomActionResultReceiver.clone();
    }
}
