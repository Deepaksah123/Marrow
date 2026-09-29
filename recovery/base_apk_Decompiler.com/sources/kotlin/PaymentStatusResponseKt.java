package kotlin;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes4.dex */
public final class PaymentStatusResponseKt<T> implements toUiModel<T> {
    private static int read = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096).intValue();
    private static final Object write = new Object();
    private int AudioAttributesImplApi21Parcelizer;
    private AtomicReferenceArray<Object> AudioAttributesImplBaseParcelizer;
    private AtomicReferenceArray<Object> IconCompatParcelizer;
    private long MediaBrowserCompatCustomActionResultReceiver;
    private int MediaBrowserCompatItemReceiver;
    private int RemoteActionCompatParcelizer;
    private AtomicLong AudioAttributesImplApi26Parcelizer = new AtomicLong();
    private AtomicLong AudioAttributesCompatParcelizer = new AtomicLong();

    private static int read(int i) {
        return i;
    }

    public PaymentStatusResponseKt(int i) {
        int iAudioAttributesCompatParcelizer = getExpiresOn.AudioAttributesCompatParcelizer(Math.max(8, i));
        int i2 = iAudioAttributesCompatParcelizer - 1;
        AtomicReferenceArray<Object> atomicReferenceArray = new AtomicReferenceArray<>(iAudioAttributesCompatParcelizer + 1);
        this.AudioAttributesImplBaseParcelizer = atomicReferenceArray;
        this.AudioAttributesImplApi21Parcelizer = i2;
        write(iAudioAttributesCompatParcelizer);
        this.IconCompatParcelizer = atomicReferenceArray;
        this.RemoteActionCompatParcelizer = i2;
        this.MediaBrowserCompatCustomActionResultReceiver = iAudioAttributesCompatParcelizer - 2;
        read(0L);
    }

    @Override // kotlin.toLSModel
    public final boolean RemoteActionCompatParcelizer(T t) {
        if (t == null) {
            throw new NullPointerException("Null is not a valid element");
        }
        AtomicReferenceArray<Object> atomicReferenceArray = this.AudioAttributesImplBaseParcelizer;
        long jWrite = write();
        int i = this.AudioAttributesImplApi21Parcelizer;
        int iIconCompatParcelizer = IconCompatParcelizer(jWrite, i);
        if (jWrite < this.MediaBrowserCompatCustomActionResultReceiver) {
            return IconCompatParcelizer(atomicReferenceArray, t, jWrite, iIconCompatParcelizer);
        }
        long j = ((long) this.MediaBrowserCompatItemReceiver) + jWrite;
        if (RemoteActionCompatParcelizer(atomicReferenceArray, IconCompatParcelizer(j, i)) == null) {
            this.MediaBrowserCompatCustomActionResultReceiver = j - 1;
            return IconCompatParcelizer(atomicReferenceArray, t, jWrite, iIconCompatParcelizer);
        }
        if (RemoteActionCompatParcelizer(atomicReferenceArray, IconCompatParcelizer(1 + jWrite, i)) == null) {
            return IconCompatParcelizer(atomicReferenceArray, t, jWrite, iIconCompatParcelizer);
        }
        AudioAttributesCompatParcelizer(atomicReferenceArray, jWrite, iIconCompatParcelizer, t, i);
        return true;
    }

    private boolean IconCompatParcelizer(AtomicReferenceArray<Object> atomicReferenceArray, T t, long j, int i) {
        IconCompatParcelizer(atomicReferenceArray, i, t);
        read(j + 1);
        return true;
    }

    private void AudioAttributesCompatParcelizer(AtomicReferenceArray<Object> atomicReferenceArray, long j, int i, T t, long j2) {
        AtomicReferenceArray<Object> atomicReferenceArray2 = new AtomicReferenceArray<>(atomicReferenceArray.length());
        this.AudioAttributesImplBaseParcelizer = atomicReferenceArray2;
        this.MediaBrowserCompatCustomActionResultReceiver = (j2 + j) - 1;
        IconCompatParcelizer(atomicReferenceArray2, i, t);
        RemoteActionCompatParcelizer(atomicReferenceArray, atomicReferenceArray2);
        IconCompatParcelizer(atomicReferenceArray, i, write);
        read(j + 1);
    }

    private static void RemoteActionCompatParcelizer(AtomicReferenceArray<Object> atomicReferenceArray, AtomicReferenceArray<Object> atomicReferenceArray2) {
        IconCompatParcelizer(atomicReferenceArray, read(atomicReferenceArray.length() - 1), atomicReferenceArray2);
    }

    private static AtomicReferenceArray<Object> write(AtomicReferenceArray<Object> atomicReferenceArray, int i) {
        int i2 = read(i);
        AtomicReferenceArray<Object> atomicReferenceArray2 = (AtomicReferenceArray) RemoteActionCompatParcelizer(atomicReferenceArray, i2);
        IconCompatParcelizer(atomicReferenceArray, i2, (Object) null);
        return atomicReferenceArray2;
    }

    @Override // kotlin.toUiModel, kotlin.toLSModel
    public final T read() {
        AtomicReferenceArray<Object> atomicReferenceArray = this.IconCompatParcelizer;
        long jAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer();
        int i = this.RemoteActionCompatParcelizer;
        int iIconCompatParcelizer = IconCompatParcelizer(jAudioAttributesCompatParcelizer, i);
        T t = (T) RemoteActionCompatParcelizer(atomicReferenceArray, iIconCompatParcelizer);
        boolean z = t == write;
        if (t == null || z) {
            if (z) {
                return IconCompatParcelizer(write(atomicReferenceArray, i + 1), jAudioAttributesCompatParcelizer, i);
            }
            return null;
        }
        IconCompatParcelizer(atomicReferenceArray, iIconCompatParcelizer, (Object) null);
        write(jAudioAttributesCompatParcelizer + 1);
        return t;
    }

    private T IconCompatParcelizer(AtomicReferenceArray<Object> atomicReferenceArray, long j, int i) {
        this.IconCompatParcelizer = atomicReferenceArray;
        int iIconCompatParcelizer = IconCompatParcelizer(j, i);
        T t = (T) RemoteActionCompatParcelizer(atomicReferenceArray, iIconCompatParcelizer);
        if (t != null) {
            IconCompatParcelizer(atomicReferenceArray, iIconCompatParcelizer, (Object) null);
            write(j + 1);
        }
        return t;
    }

    @Override // kotlin.toLSModel
    public final void RemoteActionCompatParcelizer() {
        while (true) {
            if (read() == null && IconCompatParcelizer()) {
                return;
            }
        }
    }

    @Override // kotlin.toLSModel
    public final boolean IconCompatParcelizer() {
        return AudioAttributesImplBaseParcelizer() == MediaBrowserCompatCustomActionResultReceiver();
    }

    private void write(int i) {
        this.MediaBrowserCompatItemReceiver = Math.min(i / 4, read);
    }

    private long AudioAttributesImplBaseParcelizer() {
        return this.AudioAttributesImplApi26Parcelizer.get();
    }

    private long MediaBrowserCompatCustomActionResultReceiver() {
        return this.AudioAttributesCompatParcelizer.get();
    }

    private long write() {
        return this.AudioAttributesImplApi26Parcelizer.get();
    }

    private long AudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer.get();
    }

    private void read(long j) {
        this.AudioAttributesImplApi26Parcelizer.lazySet(j);
    }

    private void write(long j) {
        this.AudioAttributesCompatParcelizer.lazySet(j);
    }

    private static int IconCompatParcelizer(long j, int i) {
        return read(((int) j) & i);
    }

    private static void IconCompatParcelizer(AtomicReferenceArray<Object> atomicReferenceArray, int i, Object obj) {
        atomicReferenceArray.lazySet(i, obj);
    }

    private static <E> Object RemoteActionCompatParcelizer(AtomicReferenceArray<Object> atomicReferenceArray, int i) {
        return atomicReferenceArray.get(i);
    }

    public final boolean IconCompatParcelizer(T t, T t2) {
        AtomicReferenceArray<Object> atomicReferenceArray = this.AudioAttributesImplBaseParcelizer;
        long jAudioAttributesImplBaseParcelizer = AudioAttributesImplBaseParcelizer();
        int i = this.AudioAttributesImplApi21Parcelizer;
        long j = 2 + jAudioAttributesImplBaseParcelizer;
        if (RemoteActionCompatParcelizer(atomicReferenceArray, IconCompatParcelizer(j, i)) == null) {
            int iIconCompatParcelizer = IconCompatParcelizer(jAudioAttributesImplBaseParcelizer, i);
            IconCompatParcelizer(atomicReferenceArray, iIconCompatParcelizer + 1, t2);
            IconCompatParcelizer(atomicReferenceArray, iIconCompatParcelizer, t);
            read(j);
            return true;
        }
        AtomicReferenceArray<Object> atomicReferenceArray2 = new AtomicReferenceArray<>(atomicReferenceArray.length());
        this.AudioAttributesImplBaseParcelizer = atomicReferenceArray2;
        int iIconCompatParcelizer2 = IconCompatParcelizer(jAudioAttributesImplBaseParcelizer, i);
        IconCompatParcelizer(atomicReferenceArray2, iIconCompatParcelizer2 + 1, t2);
        IconCompatParcelizer(atomicReferenceArray2, iIconCompatParcelizer2, t);
        RemoteActionCompatParcelizer(atomicReferenceArray, atomicReferenceArray2);
        IconCompatParcelizer(atomicReferenceArray, iIconCompatParcelizer2, write);
        read(j);
        return true;
    }
}
