package kotlin;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\n\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\bj\u0002\b\u000bj\u0002\b\nj\u0002\b\f"}, d2 = {"Lo/createByteArray;", "", "", "p0", "<init>", "(Ljava/lang/String;II)V", "MediaBrowserCompatItemReceiver", "I", "AudioAttributesCompatParcelizer", "()I", "RemoteActionCompatParcelizer", "write", "read"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class createByteArray {
    private static final /* synthetic */ createByteArray[] IconCompatParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private final int RemoteActionCompatParcelizer;
    public static final createByteArray AudioAttributesCompatParcelizer = new createByteArray("EMAIL_ID", 0, 0);
    public static final createByteArray write = new createByteArray("PASSWORD", 1, 1);
    public static final createByteArray RemoteActionCompatParcelizer = new createByteArray("OTP", 2, 2);
    public static final createByteArray read = new createByteArray("FORGOT_PASSWORD", 3, 3);

    private createByteArray(String str, int i, int i2) {
        this.RemoteActionCompatParcelizer = i2;
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final int getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    static {
        createByteArray[] createbytearrayArrIconCompatParcelizer = IconCompatParcelizer();
        IconCompatParcelizer = createbytearrayArrIconCompatParcelizer;
        getMagicModuleTimeline.IconCompatParcelizer(createbytearrayArrIconCompatParcelizer);
    }

    private static final /* synthetic */ createByteArray[] IconCompatParcelizer() {
        return new createByteArray[]{AudioAttributesCompatParcelizer, write, RemoteActionCompatParcelizer, read};
    }

    public static createByteArray valueOf(String str) {
        return (createByteArray) Enum.valueOf(createByteArray.class, str);
    }

    public static createByteArray[] values() {
        return (createByteArray[]) IconCompatParcelizer.clone();
    }
}
