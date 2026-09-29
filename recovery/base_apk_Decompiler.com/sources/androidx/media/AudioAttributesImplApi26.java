package androidx.media;

import android.media.AudioAttributes;
import androidx.media.AudioAttributesImplApi21;

/* JADX INFO: loaded from: classes2.dex */
public class AudioAttributesImplApi26 extends AudioAttributesImplApi21 {
    public AudioAttributesImplApi26() {
    }

    AudioAttributesImplApi26(AudioAttributes audioAttributes) {
        super(audioAttributes, -1);
    }

    static class read extends AudioAttributesImplApi21.RemoteActionCompatParcelizer {
        read() {
        }

        @Override // androidx.media.AudioAttributesImplApi21.RemoteActionCompatParcelizer, androidx.media.AudioAttributesImpl.write
        public AudioAttributesImpl RemoteActionCompatParcelizer() {
            return new AudioAttributesImplApi26(this.IconCompatParcelizer.build());
        }
    }
}
