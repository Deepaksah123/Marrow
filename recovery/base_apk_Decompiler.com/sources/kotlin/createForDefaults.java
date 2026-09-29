package kotlin;

import java.util.Arrays;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0083@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\b\u001a\u00020\nH\u0016¢\u0006\u0004\b\b\u0010\u000bJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0014\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0012\u001a\u00020\f8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\b\u001a\u00020\f8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0015\u0088\u0001\u0016\u0092\u0001\u00020\u0002"}, d2 = {"Lo/createForDefaults;", "", "", "p0", "read", "([I)[I", "Lo/appendAnnotationIntrospector;", "", "AudioAttributesCompatParcelizer", "([ILo/appendAnnotationIntrospector;)V", "", "([I)Ljava/lang/String;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "RemoteActionCompatParcelizer", "[I", "IconCompatParcelizer", "([I)Z", "data"}, k = 1, mv = {2, 0, 0}, xi = 48)
@submitMagicModule
final class createForDefaults {

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final int[] IconCompatParcelizer;

    public static int[] read(int[] iArr) {
        return iArr;
    }

    public static String AudioAttributesCompatParcelizer(int[] iArr) {
        StringBuilder sb = new StringBuilder("Snake(");
        sb.append(iArr[0]);
        sb.append(',');
        sb.append(iArr[1]);
        sb.append(',');
        sb.append(iArr[2]);
        sb.append(',');
        sb.append(iArr[3]);
        sb.append(',');
        sb.append(iArr[4] != 0);
        sb.append(')');
        return sb.toString();
    }

    public final String toString() {
        return AudioAttributesCompatParcelizer(this.IconCompatParcelizer);
    }

    private static final boolean IconCompatParcelizer(int[] iArr) {
        return iArr[3] - iArr[1] != iArr[2] - iArr[0];
    }

    private static final boolean RemoteActionCompatParcelizer(int[] iArr) {
        return iArr[3] - iArr[1] > iArr[2] - iArr[0];
    }

    public static final void AudioAttributesCompatParcelizer(int[] iArr, appendAnnotationIntrospector appendannotationintrospector) {
        int iMin;
        int i = iArr[0];
        int i2 = iArr[1];
        if (IconCompatParcelizer(iArr)) {
            iMin = Math.min(iArr[2] - iArr[0], iArr[3] - iArr[1]);
            i += ((iArr[4] != 0 ? 1 : 0) | (RemoteActionCompatParcelizer(iArr) ? 1 : 0)) ^ 1;
            i2 += ((!RemoteActionCompatParcelizer(iArr) ? 1 : 0) | (iArr[4] != 0 ? 1 : 0)) ^ 1;
        } else {
            iMin = iArr[2] - iArr[0];
        }
        appendannotationintrospector.AudioAttributesCompatParcelizer(i, i2, iMin);
    }

    public static boolean write(int[] iArr, Object obj) {
        return (obj instanceof createForDefaults) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(iArr, ((createForDefaults) obj).getIconCompatParcelizer());
    }

    public static int write(int[] iArr) {
        return Arrays.hashCode(iArr);
    }

    public final boolean equals(Object p0) {
        return write(this.IconCompatParcelizer, p0);
    }

    public final int hashCode() {
        return write(this.IconCompatParcelizer);
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final /* synthetic */ int[] getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }
}
