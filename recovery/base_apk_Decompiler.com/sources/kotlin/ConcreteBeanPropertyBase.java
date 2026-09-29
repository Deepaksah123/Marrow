package kotlin;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.findAliases;

/* JADX INFO: loaded from: classes2.dex */
public final class ConcreteBeanPropertyBase extends findAliases<ConcreteBeanPropertyBase> {
    private boolean AudioAttributesImplApi21Parcelizer;
    private float MediaBrowserCompatCustomActionResultReceiver;
    private legacyManglePropertyName MediaBrowserCompatItemReceiver;

    public ConcreteBeanPropertyBase(collectDefaultFromBundle collectdefaultfrombundle) {
        super(collectdefaultfrombundle);
        this.MediaBrowserCompatItemReceiver = null;
        this.MediaBrowserCompatCustomActionResultReceiver = Float.MAX_VALUE;
        this.AudioAttributesImplApi21Parcelizer = false;
    }

    public <K> ConcreteBeanPropertyBase(K k, collectFromBundle<K> collectfrombundle) {
        super(k, collectfrombundle);
        this.MediaBrowserCompatItemReceiver = null;
        this.MediaBrowserCompatCustomActionResultReceiver = Float.MAX_VALUE;
        this.AudioAttributesImplApi21Parcelizer = false;
    }

    public final ConcreteBeanPropertyBase IconCompatParcelizer(legacyManglePropertyName legacymanglepropertyname) {
        this.MediaBrowserCompatItemReceiver = legacymanglepropertyname;
        return this;
    }

    @Override // kotlin.findAliases
    public final void write() {
        AudioAttributesImplApi26Parcelizer();
        this.MediaBrowserCompatItemReceiver.AudioAttributesCompatParcelizer(RemoteActionCompatParcelizer());
        super.write();
    }

    public final void IconCompatParcelizer(float f) {
        if (AudioAttributesCompatParcelizer()) {
            this.MediaBrowserCompatCustomActionResultReceiver = f;
            return;
        }
        if (this.MediaBrowserCompatItemReceiver == null) {
            this.MediaBrowserCompatItemReceiver = new legacyManglePropertyName(f);
        }
        this.MediaBrowserCompatItemReceiver.IconCompatParcelizer(f);
        write();
    }

    public final void AudioAttributesImplBaseParcelizer() {
        if (!AudioAttributesImplApi21Parcelizer()) {
            throw new UnsupportedOperationException("Spring animations can only come to an end when there is damping");
        }
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new AndroidRuntimeException("Animations may only be started on the main thread");
        }
        if (this.write) {
            this.AudioAttributesImplApi21Parcelizer = true;
        }
    }

    private boolean AudioAttributesImplApi21Parcelizer() {
        return this.MediaBrowserCompatItemReceiver.RemoteActionCompatParcelizer > 0.0d;
    }

    private void AudioAttributesImplApi26Parcelizer() {
        legacyManglePropertyName legacymanglepropertyname = this.MediaBrowserCompatItemReceiver;
        if (legacymanglepropertyname == null) {
            throw new UnsupportedOperationException("Incomplete SpringAnimation: Either final position or a spring force needs to be set.");
        }
        double dRemoteActionCompatParcelizer = legacymanglepropertyname.RemoteActionCompatParcelizer();
        if (dRemoteActionCompatParcelizer > this.AudioAttributesCompatParcelizer) {
            throw new UnsupportedOperationException("Final position of the spring cannot be greater than the max value.");
        }
        if (dRemoteActionCompatParcelizer < this.RemoteActionCompatParcelizer) {
            throw new UnsupportedOperationException("Final position of the spring cannot be less than the min value.");
        }
    }

    @Override // kotlin.findAliases
    final boolean write(long j) {
        if (this.AudioAttributesImplApi21Parcelizer) {
            float f = this.MediaBrowserCompatCustomActionResultReceiver;
            if (f != Float.MAX_VALUE) {
                this.MediaBrowserCompatItemReceiver.IconCompatParcelizer(f);
                this.MediaBrowserCompatCustomActionResultReceiver = Float.MAX_VALUE;
            }
            this.AudioAttributesImplBaseParcelizer = this.MediaBrowserCompatItemReceiver.RemoteActionCompatParcelizer();
            this.AudioAttributesImplApi26Parcelizer = BitmapDescriptorFactory.HUE_RED;
            this.AudioAttributesImplApi21Parcelizer = false;
            return true;
        }
        if (this.MediaBrowserCompatCustomActionResultReceiver != Float.MAX_VALUE) {
            this.MediaBrowserCompatItemReceiver.RemoteActionCompatParcelizer();
            long j2 = j / 2;
            findAliases.read readVarRemoteActionCompatParcelizer = this.MediaBrowserCompatItemReceiver.RemoteActionCompatParcelizer(this.AudioAttributesImplBaseParcelizer, this.AudioAttributesImplApi26Parcelizer, j2);
            this.MediaBrowserCompatItemReceiver.IconCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver);
            this.MediaBrowserCompatCustomActionResultReceiver = Float.MAX_VALUE;
            findAliases.read readVarRemoteActionCompatParcelizer2 = this.MediaBrowserCompatItemReceiver.RemoteActionCompatParcelizer(readVarRemoteActionCompatParcelizer.IconCompatParcelizer, readVarRemoteActionCompatParcelizer.RemoteActionCompatParcelizer, j2);
            this.AudioAttributesImplBaseParcelizer = readVarRemoteActionCompatParcelizer2.IconCompatParcelizer;
            this.AudioAttributesImplApi26Parcelizer = readVarRemoteActionCompatParcelizer2.RemoteActionCompatParcelizer;
        } else {
            findAliases.read readVarRemoteActionCompatParcelizer3 = this.MediaBrowserCompatItemReceiver.RemoteActionCompatParcelizer(this.AudioAttributesImplBaseParcelizer, this.AudioAttributesImplApi26Parcelizer, j);
            this.AudioAttributesImplBaseParcelizer = readVarRemoteActionCompatParcelizer3.IconCompatParcelizer;
            this.AudioAttributesImplApi26Parcelizer = readVarRemoteActionCompatParcelizer3.RemoteActionCompatParcelizer;
        }
        this.AudioAttributesImplBaseParcelizer = Math.max(this.AudioAttributesImplBaseParcelizer, this.RemoteActionCompatParcelizer);
        this.AudioAttributesImplBaseParcelizer = Math.min(this.AudioAttributesImplBaseParcelizer, this.AudioAttributesCompatParcelizer);
        if (!write(this.AudioAttributesImplBaseParcelizer, this.AudioAttributesImplApi26Parcelizer)) {
            return false;
        }
        this.AudioAttributesImplBaseParcelizer = this.MediaBrowserCompatItemReceiver.RemoteActionCompatParcelizer();
        this.AudioAttributesImplApi26Parcelizer = BitmapDescriptorFactory.HUE_RED;
        return true;
    }

    @Override // kotlin.findAliases
    final boolean write(float f, float f2) {
        return this.MediaBrowserCompatItemReceiver.AudioAttributesCompatParcelizer(f, f2);
    }
}
