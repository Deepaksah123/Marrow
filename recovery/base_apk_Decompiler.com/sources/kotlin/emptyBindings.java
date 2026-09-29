package kotlin;

import android.os.SystemClock;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class emptyBindings implements _verifyAndResolvePlaceholders {
    public final int AudioAttributesCompatParcelizer;
    private int AudioAttributesImplApi21Parcelizer;
    protected final setName IconCompatParcelizer;
    private final int MediaBrowserCompatCustomActionResultReceiver;
    private final long[] RemoteActionCompatParcelizer;
    protected final int[] read;
    private final C0170format[] write;

    @Override // kotlin._verifyAndResolvePlaceholders
    public void IconCompatParcelizer() {
    }

    @Override // kotlin._verifyAndResolvePlaceholders
    public void RemoteActionCompatParcelizer() {
    }

    @Override // kotlin._verifyAndResolvePlaceholders
    public void write(float f) {
    }

    public emptyBindings(setName setname, int... iArr) {
        this(setname, iArr, 0);
    }

    public emptyBindings(setName setname, int[] iArr, int i) {
        int i2 = 0;
        buildTypeSerializer.write(iArr.length > 0);
        this.MediaBrowserCompatCustomActionResultReceiver = i;
        this.IconCompatParcelizer = (setName) buildTypeSerializer.IconCompatParcelizer(setname);
        int length = iArr.length;
        this.AudioAttributesCompatParcelizer = length;
        this.write = new C0170format[length];
        for (int i3 = 0; i3 < iArr.length; i3++) {
            this.write[i3] = setname.AudioAttributesCompatParcelizer(iArr[i3]);
        }
        Arrays.sort(this.write, new Comparator() { // from class: o.asKey
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return emptyBindings.write((C0170format) obj, (C0170format) obj2);
            }
        });
        this.read = new int[this.AudioAttributesCompatParcelizer];
        while (true) {
            int i4 = this.AudioAttributesCompatParcelizer;
            if (i2 < i4) {
                this.read[i2] = setname.read(this.write[i2]);
                i2++;
            } else {
                this.RemoteActionCompatParcelizer = new long[i4];
                return;
            }
        }
    }

    static /* synthetic */ int write(C0170format c0170format, C0170format c0170format2) {
        return c0170format2.read - c0170format.read;
    }

    @Override // kotlin._referenceType
    public final setName AudioAttributesImplBaseParcelizer() {
        return this.IconCompatParcelizer;
    }

    @Override // kotlin._referenceType
    public final int MediaBrowserCompatCustomActionResultReceiver() {
        return this.read.length;
    }

    @Override // kotlin._referenceType
    public final C0170format read(int i) {
        return this.write[i];
    }

    @Override // kotlin._referenceType
    public final int IconCompatParcelizer(int i) {
        return this.read[i];
    }

    @Override // kotlin._referenceType
    public final int RemoteActionCompatParcelizer(C0170format c0170format) {
        for (int i = 0; i < this.AudioAttributesCompatParcelizer; i++) {
            if (this.write[i] == c0170format) {
                return i;
            }
        }
        return -1;
    }

    @Override // kotlin._referenceType
    public final int RemoteActionCompatParcelizer(int i) {
        for (int i2 = 0; i2 < this.AudioAttributesCompatParcelizer; i2++) {
            if (this.read[i2] == i) {
                return i2;
            }
        }
        return -1;
    }

    @Override // kotlin._verifyAndResolvePlaceholders
    public final C0170format MediaBrowserCompatItemReceiver() {
        return this.write[read()];
    }

    @Override // kotlin._verifyAndResolvePlaceholders
    public final int AudioAttributesImplApi21Parcelizer() {
        return this.read[read()];
    }

    @Override // kotlin._verifyAndResolvePlaceholders
    public int AudioAttributesCompatParcelizer(long j, List<? extends getSelfReferencedType> list) {
        return list.size();
    }

    @Override // kotlin._verifyAndResolvePlaceholders
    public final boolean RemoteActionCompatParcelizer(int i, long j) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean zWrite = write(i, jElapsedRealtime);
        int i2 = 0;
        while (i2 < this.AudioAttributesCompatParcelizer && !zWrite) {
            zWrite = (i2 == i || write(i2, jElapsedRealtime)) ? false : true;
            i2++;
        }
        if (!zWrite) {
            return false;
        }
        long[] jArr = this.RemoteActionCompatParcelizer;
        jArr[i] = Math.max(jArr[i], LaissezFaireSubTypeValidator.IconCompatParcelizer(jElapsedRealtime, j));
        return true;
    }

    @Override // kotlin._verifyAndResolvePlaceholders
    public final boolean write(int i, long j) {
        return this.RemoteActionCompatParcelizer[i] > j;
    }

    public int hashCode() {
        if (this.AudioAttributesImplApi21Parcelizer == 0) {
            this.AudioAttributesImplApi21Parcelizer = (System.identityHashCode(this.IconCompatParcelizer) * 31) + Arrays.hashCode(this.read);
        }
        return this.AudioAttributesImplApi21Parcelizer;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        emptyBindings emptybindings = (emptyBindings) obj;
        return this.IconCompatParcelizer.equals(emptybindings.IconCompatParcelizer) && Arrays.equals(this.read, emptybindings.read);
    }
}
