package kotlin;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\n\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\bj\u0002\b\u000bj\u0002\b\f"}, d2 = {"Lo/readExactly;", "", "", "p0", "<init>", "(Ljava/lang/String;II)V", "IconCompatParcelizer", "I", "write", "()I", "RemoteActionCompatParcelizer", "read", "AudioAttributesCompatParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class readExactly {
    private static final /* synthetic */ readExactly[] RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final int RemoteActionCompatParcelizer;
    public static final readExactly write = new readExactly("STATUS_NOT_ATTEMPTED", 0, 0);
    public static final readExactly read = new readExactly("STATUS_IN_PROGRESS", 1, 1);
    public static final readExactly AudioAttributesCompatParcelizer = new readExactly("STATUS_COMPLETED", 2, 2);

    private readExactly(String str, int i, int i2) {
        this.RemoteActionCompatParcelizer = i2;
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final int getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    static {
        readExactly[] readexactlyArrIconCompatParcelizer = IconCompatParcelizer();
        RemoteActionCompatParcelizer = readexactlyArrIconCompatParcelizer;
        getMagicModuleTimeline.IconCompatParcelizer(readexactlyArrIconCompatParcelizer);
    }

    private static final /* synthetic */ readExactly[] IconCompatParcelizer() {
        return new readExactly[]{write, read, AudioAttributesCompatParcelizer};
    }

    public static readExactly valueOf(String str) {
        return (readExactly) Enum.valueOf(readExactly.class, str);
    }

    public static readExactly[] values() {
        return (readExactly[]) RemoteActionCompatParcelizer.clone();
    }
}
