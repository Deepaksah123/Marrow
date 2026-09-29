package kotlin;

import java.util.Arrays;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0015\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0086\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ-\u0010\t\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\u000fJ%\u0010\u0006\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0010J\r\u0010\u0011\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0006\u001a\u00020\u0013¢\u0006\u0004\b\u0006\u0010\u0014J\r\u0010\u0015\u001a\u00020\u000e¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0015\u0010\u0010J'\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0011\u0010\u0017J\u001f\u0010\u0006\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0006\u0010\u0018J\u001f\u0010\t\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\t\u0010\u0019R\u0016\u0010\u0011\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u001aR\u0016\u0010\u001c\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u001bR\u0011\u0010\t\u001a\u00020\u00028G¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0012"}, d2 = {"Lo/appendAnnotationIntrospector;", "", "", "p0", "<init>", "(I)V", "AudioAttributesCompatParcelizer", "(I)I", "", "IconCompatParcelizer", "([I)[I", "p1", "p2", "p3", "", "(IIII)V", "(III)V", "read", "()I", "", "()Z", "write", "()V", "(III)I", "(II)V", "(II)Z", "[I", "I", "RemoteActionCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class appendAnnotationIntrospector {

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private int[] read;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private int RemoteActionCompatParcelizer;

    public appendAnnotationIntrospector(int i) {
        this.read = new int[i];
    }

    public final int AudioAttributesCompatParcelizer(int p0) {
        return this.read[p0];
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final int getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    private final int[] IconCompatParcelizer(int[] p0) {
        int[] iArrCopyOf = Arrays.copyOf(p0, p0.length << 1);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(iArrCopyOf, "");
        this.read = iArrCopyOf;
        return iArrCopyOf;
    }

    public final void IconCompatParcelizer(int p0, int p1, int p2, int p3) {
        int i = this.RemoteActionCompatParcelizer;
        int[] iArrIconCompatParcelizer = this.read;
        int i2 = i + 4;
        if (i2 >= iArrIconCompatParcelizer.length) {
            iArrIconCompatParcelizer = IconCompatParcelizer(iArrIconCompatParcelizer);
        }
        iArrIconCompatParcelizer[i] = p0;
        iArrIconCompatParcelizer[i + 1] = p1;
        iArrIconCompatParcelizer[i + 2] = p2;
        iArrIconCompatParcelizer[i + 3] = p3;
        this.RemoteActionCompatParcelizer = i2;
    }

    public final void AudioAttributesCompatParcelizer(int p0, int p1, int p2) {
        int i = this.RemoteActionCompatParcelizer;
        int[] iArrIconCompatParcelizer = this.read;
        int i2 = i + 3;
        if (i2 >= iArrIconCompatParcelizer.length) {
            iArrIconCompatParcelizer = IconCompatParcelizer(iArrIconCompatParcelizer);
        }
        iArrIconCompatParcelizer[i] = p0 + p2;
        iArrIconCompatParcelizer[i + 1] = p1 + p2;
        iArrIconCompatParcelizer[i + 2] = p2;
        this.RemoteActionCompatParcelizer = i2;
    }

    public final int read() {
        int[] iArr = this.read;
        int i = this.RemoteActionCompatParcelizer - 1;
        this.RemoteActionCompatParcelizer = i;
        return iArr[i];
    }

    public final boolean AudioAttributesCompatParcelizer() {
        return this.RemoteActionCompatParcelizer != 0;
    }

    public final void write() {
        int i = this.RemoteActionCompatParcelizer;
        if (i % 3 != 0) {
            reportWrongTokenException.read("Array size not a multiple of 3");
        }
        if (i > 3) {
            write(0, i - 3, 3);
        }
    }

    private final void write(int p0, int p1, int p2) {
        if (p0 < p1) {
            int i = read(p0, p1, p2);
            write(p0, i - p2, p2);
            write(i + p2, p1, p2);
        }
    }

    private final int read(int p0, int p1, int p2) {
        int i = p0 - p2;
        while (p0 < p1) {
            if (IconCompatParcelizer(p0, p1)) {
                i += p2;
                AudioAttributesCompatParcelizer(i, p0);
            }
            p0 += p2;
        }
        int i2 = i + p2;
        AudioAttributesCompatParcelizer(i2, p1);
        return i2;
    }

    private final void AudioAttributesCompatParcelizer(int p0, int p1) {
        int[] iArr = this.read;
        writeValueAsBytes.read(iArr, p0, p1);
        writeValueAsBytes.read(iArr, p0 + 1, p1 + 1);
        writeValueAsBytes.read(iArr, p0 + 2, p1 + 2);
    }

    private final boolean IconCompatParcelizer(int p0, int p1) {
        int[] iArr = this.read;
        int i = iArr[p0];
        int i2 = iArr[p1];
        return i < i2 || (i == i2 && iArr[p0 + 1] <= iArr[p1 + 1]);
    }
}
