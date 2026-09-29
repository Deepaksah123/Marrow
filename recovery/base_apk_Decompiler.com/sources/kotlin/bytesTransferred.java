package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0005\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002B%\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/marrow2/core/sync/SyncApiException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "message", "", "recordCrash", "", "cause", "", "<init>", "(Ljava/lang/String;ZLjava/lang/Throwable;)V", "getRecordCrash", "()Z", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class bytesTransferred extends Exception {
    private static int IconCompatParcelizer = 1;
    private static int read;
    private final boolean RemoteActionCompatParcelizer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bytesTransferred(String str, boolean z, Throwable th) {
        super(str, th);
        toMagicModuleMetaRepoModel.write(str, "");
        this.RemoteActionCompatParcelizer = z;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ bytesTransferred(String str, boolean z, Throwable th, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        if ((i & 2) != 0) {
            int i2 = read;
            int i3 = i2 & 55;
            int i4 = -(-((i2 ^ 55) | i3));
            int i5 = (i3 & i4) + (i4 | i3);
            int i6 = i5 % 128;
            IconCompatParcelizer = i6;
            boolean z2 = i5 % 2 == 0;
            int i7 = (i6 & (-96)) | ((~i6) & 95);
            int i8 = (i6 & 95) << 1;
            int i9 = (i7 ^ i8) + ((i8 & i7) << 1);
            read = i9 % 128;
            if (i9 % 2 == 0) {
                int i10 = 2 % 2;
            }
            z = z2;
        }
        if ((i & 4) != 0) {
            int i11 = IconCompatParcelizer;
            int i12 = (i11 | 69) << 1;
            int i13 = -((i11 & (-70)) | ((~i11) & 69));
            int i14 = (i12 & i13) + (i12 | i13);
            read = i14 % 128;
            int i15 = i14 % 2;
            int i16 = i11 & 17;
            int i17 = (i11 | 17) & (~i16);
            int i18 = i16 << 1;
            int i19 = ((i17 | i18) << 1) - (i17 ^ i18);
            read = i19 % 128;
            int i20 = i19 % 2;
            int i21 = 2 % 2;
            th = null;
        }
        this(str, z, th);
    }

    public final boolean read() {
        int i = 2 % 2;
        int i2 = read;
        int i3 = ((i2 ^ 47) | (i2 & 47)) << 1;
        int i4 = -(((~i2) & 47) | (i2 & (-48)));
        int i5 = (i3 & i4) + (i4 | i3);
        int i6 = i5 % 128;
        IconCompatParcelizer = i6;
        int i7 = i5 % 2;
        boolean z = this.RemoteActionCompatParcelizer;
        int i8 = ((i6 ^ 15) | (i6 & 15)) << 1;
        int i9 = -(((~i6) & 15) | (i6 & (-16)));
        int i10 = ((i8 | i9) << 1) - (i9 ^ i8);
        read = i10 % 128;
        int i11 = i10 % 2;
        return z;
    }
}
