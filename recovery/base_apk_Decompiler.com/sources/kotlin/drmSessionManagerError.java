package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import o.drmSessionManagerError.read;

/* JADX INFO: loaded from: classes2.dex */
public class drmSessionManagerError<T extends read> {
    private static int RemoteActionCompatParcelizer;
    private Object[] AudioAttributesCompatParcelizer;
    private float AudioAttributesImplApi26Parcelizer;
    private int AudioAttributesImplBaseParcelizer;
    private int IconCompatParcelizer;
    private int read;
    private T write;

    public static abstract class read {
        int read = -1;

        protected abstract read RemoteActionCompatParcelizer();
    }

    public static drmSessionManagerError IconCompatParcelizer(int i, read readVar) {
        drmSessionManagerError drmsessionmanagererror;
        synchronized (drmSessionManagerError.class) {
            drmsessionmanagererror = new drmSessionManagerError(i, readVar);
            int i2 = RemoteActionCompatParcelizer;
            drmsessionmanagererror.AudioAttributesImplBaseParcelizer = i2;
            RemoteActionCompatParcelizer = i2 + 1;
        }
        return drmsessionmanagererror;
    }

    private drmSessionManagerError(int i, T t) {
        if (i <= 0) {
            throw new IllegalArgumentException("Object Pool must be instantiated with a capacity greater than 0!");
        }
        this.IconCompatParcelizer = i;
        this.AudioAttributesCompatParcelizer = new Object[i];
        this.read = 0;
        this.write = t;
        this.AudioAttributesImplApi26Parcelizer = 1.0f;
        RemoteActionCompatParcelizer();
    }

    public final void IconCompatParcelizer() {
        this.AudioAttributesImplApi26Parcelizer = 0.5f;
    }

    private void RemoteActionCompatParcelizer() {
        write(this.AudioAttributesImplApi26Parcelizer);
    }

    private void write(float f) {
        int i = this.IconCompatParcelizer;
        int i2 = (int) (i * f);
        if (i2 <= 0) {
            i = 1;
        } else if (i2 <= i) {
            i = i2;
        }
        for (int i3 = 0; i3 < i; i3++) {
            this.AudioAttributesCompatParcelizer[i3] = this.write.RemoteActionCompatParcelizer();
        }
        this.read = i - 1;
    }

    public final T write() {
        T t;
        synchronized (this) {
            if (this.read == -1 && this.AudioAttributesImplApi26Parcelizer > BitmapDescriptorFactory.HUE_RED) {
                RemoteActionCompatParcelizer();
            }
            t = (T) this.AudioAttributesCompatParcelizer[this.read];
            t.read = -1;
            this.read--;
        }
        return t;
    }

    public final void AudioAttributesCompatParcelizer(T t) {
        synchronized (this) {
            if (t.read != -1) {
                if (t.read == this.AudioAttributesImplBaseParcelizer) {
                    throw new IllegalArgumentException("The object passed is already stored in this pool!");
                }
                StringBuilder sb = new StringBuilder("The object to recycle already belongs to poolId ");
                sb.append(t.read);
                sb.append(".  Object cannot belong to two different pool instances simultaneously!");
                throw new IllegalArgumentException(sb.toString());
            }
            int i = this.read + 1;
            this.read = i;
            if (i >= this.AudioAttributesCompatParcelizer.length) {
                read();
            }
            t.read = this.AudioAttributesImplBaseParcelizer;
            this.AudioAttributesCompatParcelizer[this.read] = t;
        }
    }

    private void read() {
        int i = this.IconCompatParcelizer;
        int i2 = i << 1;
        this.IconCompatParcelizer = i2;
        Object[] objArr = new Object[i2];
        for (int i3 = 0; i3 < i; i3++) {
            objArr[i3] = this.AudioAttributesCompatParcelizer[i3];
        }
        this.AudioAttributesCompatParcelizer = objArr;
    }
}
