package kotlin;

import com.google.android.exoplayer2.C;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX INFO: loaded from: classes2.dex */
public final class _put {
    public final long AudioAttributesCompatParcelizer;
    public final float RemoteActionCompatParcelizer;
    public final long write;

    /* synthetic */ _put(AudioAttributesCompatParcelizer audioAttributesCompatParcelizer, byte b) {
        this(audioAttributesCompatParcelizer);
    }

    public static final class AudioAttributesCompatParcelizer {
        private float IconCompatParcelizer;
        private long RemoteActionCompatParcelizer;
        private long write;

        /* synthetic */ AudioAttributesCompatParcelizer(_put _putVar, byte b) {
            this(_putVar);
        }

        public AudioAttributesCompatParcelizer() {
            this.RemoteActionCompatParcelizer = C.TIME_UNSET;
            this.IconCompatParcelizer = -3.4028235E38f;
            this.write = C.TIME_UNSET;
        }

        private AudioAttributesCompatParcelizer(_put _putVar) {
            this.RemoteActionCompatParcelizer = _putVar.write;
            this.IconCompatParcelizer = _putVar.RemoteActionCompatParcelizer;
            this.write = _putVar.AudioAttributesCompatParcelizer;
        }

        public final AudioAttributesCompatParcelizer IconCompatParcelizer(long j) {
            this.RemoteActionCompatParcelizer = j;
            return this;
        }

        public final AudioAttributesCompatParcelizer read(float f) {
            buildTypeSerializer.IconCompatParcelizer(f > BitmapDescriptorFactory.HUE_RED || f == -3.4028235E38f);
            this.IconCompatParcelizer = f;
            return this;
        }

        public final AudioAttributesCompatParcelizer AudioAttributesCompatParcelizer(long j) {
            buildTypeSerializer.IconCompatParcelizer(j >= 0 || j == C.TIME_UNSET);
            this.write = j;
            return this;
        }

        public final _put write() {
            return new _put(this, (byte) 0);
        }
    }

    private _put(AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
        this.write = audioAttributesCompatParcelizer.RemoteActionCompatParcelizer;
        this.RemoteActionCompatParcelizer = audioAttributesCompatParcelizer.IconCompatParcelizer;
        this.AudioAttributesCompatParcelizer = audioAttributesCompatParcelizer.write;
    }

    public final AudioAttributesCompatParcelizer write() {
        return new AudioAttributesCompatParcelizer(this, (byte) 0);
    }

    public final boolean write(long j) {
        long j2 = this.AudioAttributesCompatParcelizer;
        return (j2 == C.TIME_UNSET || j == C.TIME_UNSET || j2 < j) ? false : true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof _put)) {
            return false;
        }
        _put _putVar = (_put) obj;
        return this.write == _putVar.write && this.RemoteActionCompatParcelizer == _putVar.RemoteActionCompatParcelizer && this.AudioAttributesCompatParcelizer == _putVar.AudioAttributesCompatParcelizer;
    }

    public final int hashCode() {
        return parseSmta.read(Long.valueOf(this.write), Float.valueOf(this.RemoteActionCompatParcelizer), Long.valueOf(this.AudioAttributesCompatParcelizer));
    }
}
