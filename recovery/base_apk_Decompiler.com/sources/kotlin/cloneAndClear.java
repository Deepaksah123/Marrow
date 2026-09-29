package kotlin;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\n\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\nj\u0002\b\f"}, d2 = {"Lo/cloneAndClear;", "", "", "p0", "<init>", "(Ljava/lang/String;II)V", "write", "I", "read", "()I", "IconCompatParcelizer", "AudioAttributesCompatParcelizer", "RemoteActionCompatParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class cloneAndClear {
    public static final cloneAndClear AudioAttributesCompatParcelizer = new cloneAndClear("ONLINE", 0, 1);
    public static final cloneAndClear IconCompatParcelizer = new cloneAndClear("OFFLINE_ZIP", 1, 2);
    public static final cloneAndClear RemoteActionCompatParcelizer = new cloneAndClear("UNKNOWN", 2, -1);
    private static final /* synthetic */ cloneAndClear[] read;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final int IconCompatParcelizer;

    private cloneAndClear(String str, int i, int i2) {
        this.IconCompatParcelizer = i2;
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final int getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    static {
        cloneAndClear[] cloneandclearArrRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
        read = cloneandclearArrRemoteActionCompatParcelizer;
        getMagicModuleTimeline.IconCompatParcelizer(cloneandclearArrRemoteActionCompatParcelizer);
    }

    private static final /* synthetic */ cloneAndClear[] RemoteActionCompatParcelizer() {
        return new cloneAndClear[]{AudioAttributesCompatParcelizer, IconCompatParcelizer, RemoteActionCompatParcelizer};
    }

    public static cloneAndClear valueOf(String str) {
        return (cloneAndClear) Enum.valueOf(cloneAndClear.class, str);
    }

    public static cloneAndClear[] values() {
        return (cloneAndClear[]) read.clone();
    }
}
