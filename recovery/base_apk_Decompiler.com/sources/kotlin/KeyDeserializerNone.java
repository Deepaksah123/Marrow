package kotlin;

import java.util.Arrays;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0083@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0006H\u0086\u0002¢\u0006\u0004\b\u0007\u0010\bJ \u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H\u0086\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0015\u001a\u00020\u00068CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0017\u0088\u0001\u0018\u0092\u0001\u00020\u0002"}, d2 = {"Lo/KeyDeserializerNone;", "", "", "p0", "IconCompatParcelizer", "([I)[I", "", "write", "([II)I", "p1", "", "RemoteActionCompatParcelizer", "([III)V", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "AudioAttributesCompatParcelizer", "[I", "([I)I", "data"}, k = 1, mv = {2, 0, 0}, xi = 48)
@submitMagicModule
final class KeyDeserializerNone {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final int[] write;

    public static int[] IconCompatParcelizer(int[] iArr) {
        return iArr;
    }

    private static final int AudioAttributesCompatParcelizer(int[] iArr) {
        return iArr.length / 2;
    }

    public static final int write(int[] iArr, int i) {
        return iArr[i + AudioAttributesCompatParcelizer(iArr)];
    }

    public static final void RemoteActionCompatParcelizer(int[] iArr, int i, int i2) {
        iArr[i + AudioAttributesCompatParcelizer(iArr)] = i2;
    }

    public static boolean AudioAttributesCompatParcelizer(int[] iArr, Object obj) {
        return (obj instanceof KeyDeserializerNone) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(iArr, ((KeyDeserializerNone) obj).getWrite());
    }

    public static int write(int[] iArr) {
        return Arrays.hashCode(iArr);
    }

    public static String RemoteActionCompatParcelizer(int[] iArr) {
        StringBuilder sb = new StringBuilder("CenteredArray(data=");
        sb.append(Arrays.toString(iArr));
        sb.append(')');
        return sb.toString();
    }

    public final boolean equals(Object p0) {
        return AudioAttributesCompatParcelizer(this.write, p0);
    }

    public final int hashCode() {
        return write(this.write);
    }

    public final String toString() {
        return RemoteActionCompatParcelizer(this.write);
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final /* synthetic */ int[] getWrite() {
        return this.write;
    }
}
