package kotlin;

import android.os.Process;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u000e\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\r"}, d2 = {"Lo/getCountryCode;", "", "", "p0", "<init>", "(Ljava/lang/String;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "read", "Ljava/lang/String;", "write"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class getCountryCode {
    public static int AudioAttributesCompatParcelizer;
    public static int IconCompatParcelizer;
    private final String read;

    public getCountryCode(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        this.read = str;
    }

    public /* synthetic */ getCountryCode(String str, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i & 1) != 0 ? "" : str);
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final String getRead() {
        return this.read;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public getCountryCode() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        return (p0 instanceof getCountryCode) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.read, (Object) ((getCountryCode) p0).read);
    }

    public final int hashCode() {
        return this.read.hashCode();
    }

    public final String toString() {
        String str = this.read;
        StringBuilder sb = new StringBuilder("getCountryCode(read=");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }

    public static int read() {
        int i = IconCompatParcelizer;
        int i2 = i % 7668151;
        IconCompatParcelizer = i + 1;
        if (i2 != 0) {
            return AudioAttributesCompatParcelizer;
        }
        int iMyUid = Process.myUid();
        AudioAttributesCompatParcelizer = iMyUid;
        return iMyUid;
    }
}
