package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ExoPlayerImplComponentListenerExternalSyntheticLambda5<K, A> {
    private final write<K> AudioAttributesImplApi21Parcelizer;
    protected setDrmInitData<A> IconCompatParcelizer;
    final List<RemoteActionCompatParcelizer> RemoteActionCompatParcelizer = new ArrayList(1);
    private boolean AudioAttributesImplApi26Parcelizer = false;
    protected float AudioAttributesCompatParcelizer = BitmapDescriptorFactory.HUE_RED;
    private A write = null;
    private float MediaBrowserCompatCustomActionResultReceiver = -1.0f;
    private float read = -1.0f;

    public interface RemoteActionCompatParcelizer {
        void RemoteActionCompatParcelizer();
    }

    interface write<T> {
        boolean AudioAttributesCompatParcelizer();

        boolean AudioAttributesCompatParcelizer(float f);

        float IconCompatParcelizer();

        boolean IconCompatParcelizer(float f);

        setEncoderDelay<T> RemoteActionCompatParcelizer();

        float write();
    }

    protected boolean MediaBrowserCompatCustomActionResultReceiver() {
        return false;
    }

    abstract A read(setEncoderDelay<K> setencoderdelay, float f);

    ExoPlayerImplComponentListenerExternalSyntheticLambda5(List<? extends setEncoderDelay<K>> list) {
        this.AudioAttributesImplApi21Parcelizer = write(list);
    }

    public final void MediaBrowserCompatItemReceiver() {
        this.AudioAttributesImplApi26Parcelizer = true;
    }

    public final void RemoteActionCompatParcelizer(RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        this.RemoteActionCompatParcelizer.add(remoteActionCompatParcelizer);
    }

    public void AudioAttributesCompatParcelizer(float f) {
        ExoPlayerImplExternalSyntheticLambda18.AudioAttributesImplBaseParcelizer();
        if (this.AudioAttributesImplApi21Parcelizer.AudioAttributesCompatParcelizer()) {
            ExoPlayerImplExternalSyntheticLambda18.AudioAttributesImplBaseParcelizer();
            return;
        }
        if (f < MediaMetadataCompat()) {
            f = MediaMetadataCompat();
        } else if (f > read()) {
            f = read();
        }
        if (f == this.AudioAttributesCompatParcelizer) {
            ExoPlayerImplExternalSyntheticLambda18.AudioAttributesImplBaseParcelizer();
            return;
        }
        this.AudioAttributesCompatParcelizer = f;
        if (this.AudioAttributesImplApi21Parcelizer.IconCompatParcelizer(f)) {
            AudioAttributesImplApi21Parcelizer();
        }
        ExoPlayerImplExternalSyntheticLambda18.AudioAttributesImplBaseParcelizer();
    }

    public void AudioAttributesImplApi21Parcelizer() {
        ExoPlayerImplExternalSyntheticLambda18.AudioAttributesImplBaseParcelizer();
        for (int i = 0; i < this.RemoteActionCompatParcelizer.size(); i++) {
            this.RemoteActionCompatParcelizer.get(i).RemoteActionCompatParcelizer();
        }
        ExoPlayerImplExternalSyntheticLambda18.AudioAttributesImplBaseParcelizer();
    }

    protected final setEncoderDelay<K> IconCompatParcelizer() {
        ExoPlayerImplExternalSyntheticLambda18.AudioAttributesImplBaseParcelizer();
        setEncoderDelay<K> setencoderdelayRemoteActionCompatParcelizer = this.AudioAttributesImplApi21Parcelizer.RemoteActionCompatParcelizer();
        ExoPlayerImplExternalSyntheticLambda18.AudioAttributesImplBaseParcelizer();
        return setencoderdelayRemoteActionCompatParcelizer;
    }

    final float write() {
        if (this.AudioAttributesImplApi26Parcelizer) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        setEncoderDelay<K> setencoderdelayIconCompatParcelizer = IconCompatParcelizer();
        return setencoderdelayIconCompatParcelizer.MediaBrowserCompatItemReceiver() ? BitmapDescriptorFactory.HUE_RED : (this.AudioAttributesCompatParcelizer - setencoderdelayIconCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver()) / (setencoderdelayIconCompatParcelizer.RemoteActionCompatParcelizer() - setencoderdelayIconCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver());
    }

    protected final float AudioAttributesCompatParcelizer() {
        setEncoderDelay<K> setencoderdelayIconCompatParcelizer = IconCompatParcelizer();
        return (setencoderdelayIconCompatParcelizer == null || setencoderdelayIconCompatParcelizer.MediaBrowserCompatItemReceiver() || setencoderdelayIconCompatParcelizer.read == null) ? BitmapDescriptorFactory.HUE_RED : setencoderdelayIconCompatParcelizer.read.getInterpolation(write());
    }

    private float MediaMetadataCompat() {
        if (this.MediaBrowserCompatCustomActionResultReceiver == -1.0f) {
            this.MediaBrowserCompatCustomActionResultReceiver = this.AudioAttributesImplApi21Parcelizer.write();
        }
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    float read() {
        if (this.read == -1.0f) {
            this.read = this.AudioAttributesImplApi21Parcelizer.IconCompatParcelizer();
        }
        return this.read;
    }

    public A AudioAttributesImplApi26Parcelizer() {
        A aRemoteActionCompatParcelizer;
        float fWrite = write();
        if (this.IconCompatParcelizer == null && this.AudioAttributesImplApi21Parcelizer.AudioAttributesCompatParcelizer(fWrite) && !MediaBrowserCompatCustomActionResultReceiver()) {
            return this.write;
        }
        setEncoderDelay<K> setencoderdelayIconCompatParcelizer = IconCompatParcelizer();
        if (setencoderdelayIconCompatParcelizer.AudioAttributesImplBaseParcelizer != null && setencoderdelayIconCompatParcelizer.MediaBrowserCompatItemReceiver != null) {
            aRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(setencoderdelayIconCompatParcelizer, fWrite, setencoderdelayIconCompatParcelizer.AudioAttributesImplBaseParcelizer.getInterpolation(fWrite), setencoderdelayIconCompatParcelizer.MediaBrowserCompatItemReceiver.getInterpolation(fWrite));
        } else {
            aRemoteActionCompatParcelizer = read(setencoderdelayIconCompatParcelizer, AudioAttributesCompatParcelizer());
        }
        this.write = aRemoteActionCompatParcelizer;
        return aRemoteActionCompatParcelizer;
    }

    public final float RemoteActionCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final void AudioAttributesCompatParcelizer(setDrmInitData<A> setdrminitdata) {
        this.IconCompatParcelizer = setdrminitdata;
    }

    public final boolean AudioAttributesImplBaseParcelizer() {
        return this.IconCompatParcelizer != null;
    }

    protected A RemoteActionCompatParcelizer(setEncoderDelay<K> setencoderdelay, float f, float f2, float f3) {
        throw new UnsupportedOperationException("This animation does not support split dimensions!");
    }

    private static <T> write<T> write(List<? extends setEncoderDelay<T>> list) {
        if (list.isEmpty()) {
            return new IconCompatParcelizer((byte) 0);
        }
        if (list.size() == 1) {
            return new AudioAttributesCompatParcelizer(list);
        }
        return new read(list);
    }

    static final class IconCompatParcelizer<T> implements write<T> {
        @Override // o.ExoPlayerImplComponentListenerExternalSyntheticLambda5.write
        public final boolean AudioAttributesCompatParcelizer() {
            return true;
        }

        @Override // o.ExoPlayerImplComponentListenerExternalSyntheticLambda5.write
        public final float IconCompatParcelizer() {
            return 1.0f;
        }

        @Override // o.ExoPlayerImplComponentListenerExternalSyntheticLambda5.write
        public final boolean IconCompatParcelizer(float f) {
            return false;
        }

        @Override // o.ExoPlayerImplComponentListenerExternalSyntheticLambda5.write
        public final float write() {
            return BitmapDescriptorFactory.HUE_RED;
        }

        private IconCompatParcelizer() {
        }

        /* synthetic */ IconCompatParcelizer(byte b) {
            this();
        }

        @Override // o.ExoPlayerImplComponentListenerExternalSyntheticLambda5.write
        public final setEncoderDelay<T> RemoteActionCompatParcelizer() {
            throw new IllegalStateException("not implemented");
        }

        @Override // o.ExoPlayerImplComponentListenerExternalSyntheticLambda5.write
        public final boolean AudioAttributesCompatParcelizer(float f) {
            throw new IllegalStateException("not implemented");
        }
    }

    static final class AudioAttributesCompatParcelizer<T> implements write<T> {
        private final setEncoderDelay<T> AudioAttributesCompatParcelizer;
        private float RemoteActionCompatParcelizer = -1.0f;

        @Override // o.ExoPlayerImplComponentListenerExternalSyntheticLambda5.write
        public final boolean AudioAttributesCompatParcelizer() {
            return false;
        }

        AudioAttributesCompatParcelizer(List<? extends setEncoderDelay<T>> list) {
            this.AudioAttributesCompatParcelizer = list.get(0);
        }

        @Override // o.ExoPlayerImplComponentListenerExternalSyntheticLambda5.write
        public final boolean IconCompatParcelizer(float f) {
            return !this.AudioAttributesCompatParcelizer.MediaBrowserCompatItemReceiver();
        }

        @Override // o.ExoPlayerImplComponentListenerExternalSyntheticLambda5.write
        public final setEncoderDelay<T> RemoteActionCompatParcelizer() {
            return this.AudioAttributesCompatParcelizer;
        }

        @Override // o.ExoPlayerImplComponentListenerExternalSyntheticLambda5.write
        public final float write() {
            return this.AudioAttributesCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver();
        }

        @Override // o.ExoPlayerImplComponentListenerExternalSyntheticLambda5.write
        public final float IconCompatParcelizer() {
            return this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer();
        }

        @Override // o.ExoPlayerImplComponentListenerExternalSyntheticLambda5.write
        public final boolean AudioAttributesCompatParcelizer(float f) {
            if (this.RemoteActionCompatParcelizer == f) {
                return true;
            }
            this.RemoteActionCompatParcelizer = f;
            return false;
        }
    }

    static final class read<T> implements write<T> {
        private final List<? extends setEncoderDelay<T>> AudioAttributesCompatParcelizer;
        private setEncoderDelay<T> write = null;
        private float IconCompatParcelizer = -1.0f;
        private setEncoderDelay<T> read = write(BitmapDescriptorFactory.HUE_RED);

        @Override // o.ExoPlayerImplComponentListenerExternalSyntheticLambda5.write
        public final boolean AudioAttributesCompatParcelizer() {
            return false;
        }

        read(List<? extends setEncoderDelay<T>> list) {
            this.AudioAttributesCompatParcelizer = list;
        }

        @Override // o.ExoPlayerImplComponentListenerExternalSyntheticLambda5.write
        public final boolean IconCompatParcelizer(float f) {
            if (this.read.read(f)) {
                return !this.read.MediaBrowserCompatItemReceiver();
            }
            this.read = write(f);
            return true;
        }

        private setEncoderDelay<T> write(float f) {
            setEncoderDelay<T> setencoderdelay = this.AudioAttributesCompatParcelizer.get(r0.size() - 1);
            if (f >= setencoderdelay.MediaBrowserCompatCustomActionResultReceiver()) {
                return setencoderdelay;
            }
            for (int size = this.AudioAttributesCompatParcelizer.size() - 2; size > 0; size--) {
                setEncoderDelay<T> setencoderdelay2 = this.AudioAttributesCompatParcelizer.get(size);
                if (this.read != setencoderdelay2 && setencoderdelay2.read(f)) {
                    return setencoderdelay2;
                }
            }
            return this.AudioAttributesCompatParcelizer.get(0);
        }

        @Override // o.ExoPlayerImplComponentListenerExternalSyntheticLambda5.write
        public final setEncoderDelay<T> RemoteActionCompatParcelizer() {
            return this.read;
        }

        @Override // o.ExoPlayerImplComponentListenerExternalSyntheticLambda5.write
        public final float write() {
            return this.AudioAttributesCompatParcelizer.get(0).MediaBrowserCompatCustomActionResultReceiver();
        }

        @Override // o.ExoPlayerImplComponentListenerExternalSyntheticLambda5.write
        public final float IconCompatParcelizer() {
            return this.AudioAttributesCompatParcelizer.get(r1.size() - 1).RemoteActionCompatParcelizer();
        }

        @Override // o.ExoPlayerImplComponentListenerExternalSyntheticLambda5.write
        public final boolean AudioAttributesCompatParcelizer(float f) {
            setEncoderDelay<T> setencoderdelay = this.write;
            setEncoderDelay<T> setencoderdelay2 = this.read;
            if (setencoderdelay == setencoderdelay2 && this.IconCompatParcelizer == f) {
                return true;
            }
            this.write = setencoderdelay2;
            this.IconCompatParcelizer = f;
            return false;
        }
    }
}
