package kotlin;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lo/getChunkStartTimeUs;", "", "<init>", "(Ljava/lang/String;I)V", "write", "AudioAttributesCompatParcelizer", "read"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class getChunkStartTimeUs {
    private static final /* synthetic */ getChunkStartTimeUs[] RemoteActionCompatParcelizer;
    public static final getChunkStartTimeUs write = new getChunkStartTimeUs("VIDEO", 0);
    public static final getChunkStartTimeUs AudioAttributesCompatParcelizer = new getChunkStartTimeUs("DOWNLOAD", 1);
    public static final getChunkStartTimeUs read = new getChunkStartTimeUs("USER_SEEN_VIDEO_ERROR", 2);

    private getChunkStartTimeUs(String str, int i) {
    }

    static {
        getChunkStartTimeUs[] getchunkstarttimeusArr = read();
        RemoteActionCompatParcelizer = getchunkstarttimeusArr;
        getMagicModuleTimeline.IconCompatParcelizer(getchunkstarttimeusArr);
    }

    private static final /* synthetic */ getChunkStartTimeUs[] read() {
        return new getChunkStartTimeUs[]{write, AudioAttributesCompatParcelizer, read};
    }

    public static getChunkStartTimeUs valueOf(String str) {
        return (getChunkStartTimeUs) Enum.valueOf(getChunkStartTimeUs.class, str);
    }

    public static getChunkStartTimeUs[] values() {
        return (getChunkStartTimeUs[]) RemoteActionCompatParcelizer.clone();
    }
}
