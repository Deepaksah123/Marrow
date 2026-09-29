package kotlin;

import java.io.IOException;
import java.util.Arrays;
import kotlin.CollectorBase;

/* JADX INFO: loaded from: classes4.dex */
public final class isExplicitlyIncluded {
    private static final isExplicitlyIncluded RemoteActionCompatParcelizer = new isExplicitlyIncluded(0, new int[0], new Object[0], false);
    private Object[] AudioAttributesCompatParcelizer;
    private int IconCompatParcelizer;
    private int[] MediaBrowserCompatItemReceiver;
    private boolean read;
    private int write;

    public static isExplicitlyIncluded IconCompatParcelizer() {
        return RemoteActionCompatParcelizer;
    }

    static isExplicitlyIncluded write() {
        return new isExplicitlyIncluded();
    }

    static isExplicitlyIncluded IconCompatParcelizer(isExplicitlyIncluded isexplicitlyincluded, isExplicitlyIncluded isexplicitlyincluded2) {
        int i = isexplicitlyincluded.IconCompatParcelizer + isexplicitlyincluded2.IconCompatParcelizer;
        int[] iArrCopyOf = Arrays.copyOf(isexplicitlyincluded.MediaBrowserCompatItemReceiver, i);
        System.arraycopy(isexplicitlyincluded2.MediaBrowserCompatItemReceiver, 0, iArrCopyOf, isexplicitlyincluded.IconCompatParcelizer, isexplicitlyincluded2.IconCompatParcelizer);
        Object[] objArrCopyOf = Arrays.copyOf(isexplicitlyincluded.AudioAttributesCompatParcelizer, i);
        System.arraycopy(isexplicitlyincluded2.AudioAttributesCompatParcelizer, 0, objArrCopyOf, isexplicitlyincluded.IconCompatParcelizer, isexplicitlyincluded2.IconCompatParcelizer);
        return new isExplicitlyIncluded(i, iArrCopyOf, objArrCopyOf, true);
    }

    private isExplicitlyIncluded() {
        this(0, new int[8], new Object[8], true);
    }

    private isExplicitlyIncluded(int i, int[] iArr, Object[] objArr, boolean z) {
        this.write = -1;
        this.IconCompatParcelizer = i;
        this.MediaBrowserCompatItemReceiver = iArr;
        this.AudioAttributesCompatParcelizer = objArr;
        this.read = z;
    }

    public final void AudioAttributesCompatParcelizer() {
        this.read = false;
    }

    private void AudioAttributesImplApi21Parcelizer() {
        if (!this.read) {
            throw new UnsupportedOperationException();
        }
    }

    final void read(CollectorBase collectorBase) throws IOException {
        if (collectorBase.write() == CollectorBase.IconCompatParcelizer.DESCENDING) {
            for (int i = this.IconCompatParcelizer - 1; i >= 0; i--) {
                collectorBase.read(_ignorableAnnotation.read(this.MediaBrowserCompatItemReceiver[i]), this.AudioAttributesCompatParcelizer[i]);
            }
            return;
        }
        for (int i2 = 0; i2 < this.IconCompatParcelizer; i2++) {
            collectorBase.read(_ignorableAnnotation.read(this.MediaBrowserCompatItemReceiver[i2]), this.AudioAttributesCompatParcelizer[i2]);
        }
    }

    public final void AudioAttributesCompatParcelizer(CollectorBase collectorBase) throws IOException {
        if (this.IconCompatParcelizer != 0) {
            if (collectorBase.write() == CollectorBase.IconCompatParcelizer.ASCENDING) {
                for (int i = 0; i < this.IconCompatParcelizer; i++) {
                    RemoteActionCompatParcelizer(this.MediaBrowserCompatItemReceiver[i], this.AudioAttributesCompatParcelizer[i], collectorBase);
                }
                return;
            }
            for (int i2 = this.IconCompatParcelizer - 1; i2 >= 0; i2--) {
                RemoteActionCompatParcelizer(this.MediaBrowserCompatItemReceiver[i2], this.AudioAttributesCompatParcelizer[i2], collectorBase);
            }
        }
    }

    private static void RemoteActionCompatParcelizer(int i, Object obj, CollectorBase collectorBase) throws IOException {
        int i2 = _ignorableAnnotation.read(i);
        int iRemoteActionCompatParcelizer = _ignorableAnnotation.RemoteActionCompatParcelizer(i);
        if (iRemoteActionCompatParcelizer == 0) {
            collectorBase.IconCompatParcelizer(i2, ((Long) obj).longValue());
            return;
        }
        if (iRemoteActionCompatParcelizer == 1) {
            collectorBase.RemoteActionCompatParcelizer(i2, ((Long) obj).longValue());
            return;
        }
        if (iRemoteActionCompatParcelizer == 2) {
            collectorBase.IconCompatParcelizer(i2, (AnnotatedWithParams) obj);
            return;
        }
        if (iRemoteActionCompatParcelizer != 3) {
            if (iRemoteActionCompatParcelizer == 5) {
                collectorBase.RemoteActionCompatParcelizer(i2, ((Integer) obj).intValue());
                return;
            }
            throw new RuntimeException(_add.write());
        }
        if (collectorBase.write() == CollectorBase.IconCompatParcelizer.ASCENDING) {
            collectorBase.read(i2);
            ((isExplicitlyIncluded) obj).AudioAttributesCompatParcelizer(collectorBase);
            collectorBase.IconCompatParcelizer(i2);
        } else {
            collectorBase.IconCompatParcelizer(i2);
            ((isExplicitlyIncluded) obj).AudioAttributesCompatParcelizer(collectorBase);
            collectorBase.read(i2);
        }
    }

    public final int read() {
        int i = this.write;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.IconCompatParcelizer; i3++) {
            i2 += getParameterAnnotations.read(_ignorableAnnotation.read(this.MediaBrowserCompatItemReceiver[i3]), (AnnotatedWithParams) this.AudioAttributesCompatParcelizer[i3]);
        }
        this.write = i2;
        return i2;
    }

    public final int RemoteActionCompatParcelizer() {
        int iRemoteActionCompatParcelizer;
        int i = this.write;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.IconCompatParcelizer; i3++) {
            int i4 = this.MediaBrowserCompatItemReceiver[i3];
            int i5 = _ignorableAnnotation.read(i4);
            int iRemoteActionCompatParcelizer2 = _ignorableAnnotation.RemoteActionCompatParcelizer(i4);
            if (iRemoteActionCompatParcelizer2 == 0) {
                iRemoteActionCompatParcelizer = getParameterAnnotations.read(i5, ((Long) this.AudioAttributesCompatParcelizer[i3]).longValue());
            } else if (iRemoteActionCompatParcelizer2 == 1) {
                iRemoteActionCompatParcelizer = getParameterAnnotations.RemoteActionCompatParcelizer(i5);
            } else if (iRemoteActionCompatParcelizer2 == 2) {
                iRemoteActionCompatParcelizer = getParameterAnnotations.IconCompatParcelizer(i5, (AnnotatedWithParams) this.AudioAttributesCompatParcelizer[i3]);
            } else if (iRemoteActionCompatParcelizer2 == 3) {
                iRemoteActionCompatParcelizer = (getParameterAnnotations.MediaBrowserCompatSearchResultReceiver(i5) << 1) + ((isExplicitlyIncluded) this.AudioAttributesCompatParcelizer[i3]).RemoteActionCompatParcelizer();
            } else if (iRemoteActionCompatParcelizer2 == 5) {
                iRemoteActionCompatParcelizer = getParameterAnnotations.AudioAttributesCompatParcelizer(i5);
            } else {
                throw new IllegalStateException(_add.write());
            }
            i2 += iRemoteActionCompatParcelizer;
        }
        this.write = i2;
        return i2;
    }

    private static boolean IconCompatParcelizer(int[] iArr, int[] iArr2, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (iArr[i2] != iArr2[i2]) {
                return false;
            }
        }
        return true;
    }

    private static boolean AudioAttributesCompatParcelizer(Object[] objArr, Object[] objArr2, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (!objArr[i2].equals(objArr2[i2])) {
                return false;
            }
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof isExplicitlyIncluded)) {
            return false;
        }
        isExplicitlyIncluded isexplicitlyincluded = (isExplicitlyIncluded) obj;
        int i = this.IconCompatParcelizer;
        return i == isexplicitlyincluded.IconCompatParcelizer && IconCompatParcelizer(this.MediaBrowserCompatItemReceiver, isexplicitlyincluded.MediaBrowserCompatItemReceiver, i) && AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer, isexplicitlyincluded.AudioAttributesCompatParcelizer, this.IconCompatParcelizer);
    }

    private static int write(int[] iArr, int i) {
        int i2 = 17;
        for (int i3 = 0; i3 < i; i3++) {
            i2 = (i2 * 31) + iArr[i3];
        }
        return i2;
    }

    private static int RemoteActionCompatParcelizer(Object[] objArr, int i) {
        int iHashCode = 17;
        for (int i2 = 0; i2 < i; i2++) {
            iHashCode = (iHashCode * 31) + objArr[i2].hashCode();
        }
        return iHashCode;
    }

    public final int hashCode() {
        int i = this.IconCompatParcelizer;
        return ((((i + 527) * 31) + write(this.MediaBrowserCompatItemReceiver, i)) * 31) + RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, this.IconCompatParcelizer);
    }

    final void AudioAttributesCompatParcelizer(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.IconCompatParcelizer; i2++) {
            collectProperties.read(sb, i, String.valueOf(_ignorableAnnotation.read(this.MediaBrowserCompatItemReceiver[i2])), this.AudioAttributesCompatParcelizer[i2]);
        }
    }

    final void read(int i, Object obj) {
        AudioAttributesImplApi21Parcelizer();
        MediaBrowserCompatCustomActionResultReceiver();
        int[] iArr = this.MediaBrowserCompatItemReceiver;
        int i2 = this.IconCompatParcelizer;
        iArr[i2] = i;
        this.AudioAttributesCompatParcelizer[i2] = obj;
        this.IconCompatParcelizer = i2 + 1;
    }

    private void MediaBrowserCompatCustomActionResultReceiver() {
        int i = this.IconCompatParcelizer;
        int[] iArr = this.MediaBrowserCompatItemReceiver;
        if (i == iArr.length) {
            int i2 = i + (i < 4 ? 8 : i >> 1);
            this.MediaBrowserCompatItemReceiver = Arrays.copyOf(iArr, i2);
            this.AudioAttributesCompatParcelizer = Arrays.copyOf(this.AudioAttributesCompatParcelizer, i2);
        }
    }
}
