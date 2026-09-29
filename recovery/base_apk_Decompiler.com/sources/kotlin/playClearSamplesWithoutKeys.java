package kotlin;

import android.graphics.drawable.Drawable;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX INFO: loaded from: classes.dex */
public abstract class playClearSamplesWithoutKeys {
    private Drawable RemoteActionCompatParcelizer;
    private float read;
    private Object write;

    public playClearSamplesWithoutKeys() {
        this.read = BitmapDescriptorFactory.HUE_RED;
        this.write = null;
        this.RemoteActionCompatParcelizer = null;
    }

    public playClearSamplesWithoutKeys(float f) {
        this.write = null;
        this.RemoteActionCompatParcelizer = null;
        this.read = f;
    }

    public float read() {
        return this.read;
    }

    public final Drawable AudioAttributesImplApi21Parcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public final void AudioAttributesCompatParcelizer(float f) {
        this.read = f;
    }

    public final Object IconCompatParcelizer() {
        return this.write;
    }

    public final void RemoteActionCompatParcelizer(Object obj) {
        this.write = obj;
    }
}
