package androidx.media;

import android.media.AudioAttributes;
import androidx.media.AudioAttributesImpl;

/* JADX INFO: loaded from: classes2.dex */
public class AudioAttributesImplApi21 implements AudioAttributesImpl {
    public int AudioAttributesCompatParcelizer;
    public AudioAttributes RemoteActionCompatParcelizer;

    public AudioAttributesImplApi21() {
        this.AudioAttributesCompatParcelizer = -1;
    }

    AudioAttributesImplApi21(AudioAttributes audioAttributes) {
        this(audioAttributes, -1);
    }

    AudioAttributesImplApi21(AudioAttributes audioAttributes, int i) {
        this.RemoteActionCompatParcelizer = audioAttributes;
        this.AudioAttributesCompatParcelizer = i;
    }

    public int hashCode() {
        return this.RemoteActionCompatParcelizer.hashCode();
    }

    public boolean equals(Object obj) {
        if (obj instanceof AudioAttributesImplApi21) {
            return this.RemoteActionCompatParcelizer.equals(((AudioAttributesImplApi21) obj).RemoteActionCompatParcelizer);
        }
        return false;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AudioAttributesCompat: audioattributes=");
        sb.append(this.RemoteActionCompatParcelizer);
        return sb.toString();
    }

    static class RemoteActionCompatParcelizer implements AudioAttributesImpl.write {
        final AudioAttributes.Builder IconCompatParcelizer = new AudioAttributes.Builder();

        RemoteActionCompatParcelizer() {
        }

        @Override // androidx.media.AudioAttributesImpl.write
        public AudioAttributesImpl RemoteActionCompatParcelizer() {
            return new AudioAttributesImplApi21(this.IconCompatParcelizer.build());
        }

        @Override // androidx.media.AudioAttributesImpl.write
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public RemoteActionCompatParcelizer read(int i) {
            this.IconCompatParcelizer.setLegacyStreamType(i);
            return this;
        }
    }
}
