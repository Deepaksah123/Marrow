package kotlin;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000b"}, d2 = {"Lo/writeIBinderList;", "", "", "p0", "<init>", "(Ljava/lang/String;II)V", "read", "I", "write", "()I", "RemoteActionCompatParcelizer", "AudioAttributesCompatParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class writeIBinderList {
    private static final /* synthetic */ writeIBinderList[] write;
    private final int read;
    public static final writeIBinderList RemoteActionCompatParcelizer = new writeIBinderList("PHONE_NUMBER", 0, 0);
    public static final writeIBinderList AudioAttributesCompatParcelizer = new writeIBinderList("VERIFY_OTP", 1, 1);

    private writeIBinderList(String str, int i, int i2) {
        this.read = i2;
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final int getRead() {
        return this.read;
    }

    static {
        writeIBinderList[] writeibinderlistArrIconCompatParcelizer = IconCompatParcelizer();
        write = writeibinderlistArrIconCompatParcelizer;
        getMagicModuleTimeline.IconCompatParcelizer(writeibinderlistArrIconCompatParcelizer);
    }

    private static final /* synthetic */ writeIBinderList[] IconCompatParcelizer() {
        return new writeIBinderList[]{RemoteActionCompatParcelizer, AudioAttributesCompatParcelizer};
    }

    public static writeIBinderList valueOf(String str) {
        return (writeIBinderList) Enum.valueOf(writeIBinderList.class, str);
    }

    public static writeIBinderList[] values() {
        return (writeIBinderList[]) write.clone();
    }
}
