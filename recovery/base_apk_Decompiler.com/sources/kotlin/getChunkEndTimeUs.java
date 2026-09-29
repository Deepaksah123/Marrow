package kotlin;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\n\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\bj\u0002\b\u000b"}, d2 = {"Lo/getChunkEndTimeUs;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "AudioAttributesCompatParcelizer", "Ljava/lang/String;", "read", "()Ljava/lang/String;", "write", "RemoteActionCompatParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class getChunkEndTimeUs {
    private static final /* synthetic */ getChunkEndTimeUs[] IconCompatParcelizer;

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final String write;
    public static final getChunkEndTimeUs write = new getChunkEndTimeUs("LOW", 0, "low");
    public static final getChunkEndTimeUs read = new getChunkEndTimeUs("MEDIUM", 1, "medium");
    public static final getChunkEndTimeUs RemoteActionCompatParcelizer = new getChunkEndTimeUs("HD", 2, "hd");

    private getChunkEndTimeUs(String str, int i, String str2) {
        this.write = str2;
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final String getWrite() {
        return this.write;
    }

    static {
        getChunkEndTimeUs[] getchunkendtimeusArrWrite = write();
        IconCompatParcelizer = getchunkendtimeusArrWrite;
        getMagicModuleTimeline.IconCompatParcelizer(getchunkendtimeusArrWrite);
    }

    private static final /* synthetic */ getChunkEndTimeUs[] write() {
        return new getChunkEndTimeUs[]{write, read, RemoteActionCompatParcelizer};
    }

    public static getChunkEndTimeUs valueOf(String str) {
        return (getChunkEndTimeUs) Enum.valueOf(getChunkEndTimeUs.class, str);
    }

    public static getChunkEndTimeUs[] values() {
        return (getChunkEndTimeUs[]) IconCompatParcelizer.clone();
    }
}
