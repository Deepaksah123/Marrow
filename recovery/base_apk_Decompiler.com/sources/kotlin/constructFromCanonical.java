package kotlin;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import kotlin.constructFromCanonical;

/* JADX INFO: loaded from: classes2.dex */
public final class constructFromCanonical {
    private final int AudioAttributesCompatParcelizer;
    private int MediaBrowserCompatCustomActionResultReceiver;
    private int MediaBrowserCompatItemReceiver;
    private int write;
    private static final Comparator<AudioAttributesCompatParcelizer> read = new Comparator() { // from class: o.constructMapType
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return constructFromCanonical.AudioAttributesCompatParcelizer((constructFromCanonical.AudioAttributesCompatParcelizer) obj, (constructFromCanonical.AudioAttributesCompatParcelizer) obj2);
        }
    };
    private static final Comparator<AudioAttributesCompatParcelizer> IconCompatParcelizer = new Comparator() { // from class: o.findTypeParameters
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return Float.compare(((constructFromCanonical.AudioAttributesCompatParcelizer) obj).read, ((constructFromCanonical.AudioAttributesCompatParcelizer) obj2).read);
        }
    };
    private final AudioAttributesCompatParcelizer[] AudioAttributesImplBaseParcelizer = new AudioAttributesCompatParcelizer[5];
    private final ArrayList<AudioAttributesCompatParcelizer> AudioAttributesImplApi21Parcelizer = new ArrayList<>();
    private int RemoteActionCompatParcelizer = -1;

    static /* synthetic */ int AudioAttributesCompatParcelizer(AudioAttributesCompatParcelizer audioAttributesCompatParcelizer, AudioAttributesCompatParcelizer audioAttributesCompatParcelizer2) {
        return audioAttributesCompatParcelizer.AudioAttributesCompatParcelizer - audioAttributesCompatParcelizer2.AudioAttributesCompatParcelizer;
    }

    public constructFromCanonical(int i) {
        this.AudioAttributesCompatParcelizer = i;
    }

    public final void RemoteActionCompatParcelizer() {
        this.AudioAttributesImplApi21Parcelizer.clear();
        this.RemoteActionCompatParcelizer = -1;
        this.write = 0;
        this.MediaBrowserCompatCustomActionResultReceiver = 0;
    }

    public final void RemoteActionCompatParcelizer(int i, float f) {
        AudioAttributesCompatParcelizer audioAttributesCompatParcelizer;
        AudioAttributesCompatParcelizer();
        int i2 = this.MediaBrowserCompatItemReceiver;
        byte b = 0;
        if (i2 > 0) {
            AudioAttributesCompatParcelizer[] audioAttributesCompatParcelizerArr = this.AudioAttributesImplBaseParcelizer;
            int i3 = i2 - 1;
            this.MediaBrowserCompatItemReceiver = i3;
            audioAttributesCompatParcelizer = audioAttributesCompatParcelizerArr[i3];
        } else {
            audioAttributesCompatParcelizer = new AudioAttributesCompatParcelizer(b);
        }
        int i4 = this.write;
        this.write = i4 + 1;
        audioAttributesCompatParcelizer.AudioAttributesCompatParcelizer = i4;
        audioAttributesCompatParcelizer.IconCompatParcelizer = i;
        audioAttributesCompatParcelizer.read = f;
        this.AudioAttributesImplApi21Parcelizer.add(audioAttributesCompatParcelizer);
        this.MediaBrowserCompatCustomActionResultReceiver += i;
        while (true) {
            int i5 = this.MediaBrowserCompatCustomActionResultReceiver;
            int i6 = this.AudioAttributesCompatParcelizer;
            if (i5 <= i6) {
                return;
            }
            int i7 = i5 - i6;
            AudioAttributesCompatParcelizer audioAttributesCompatParcelizer2 = this.AudioAttributesImplApi21Parcelizer.get(0);
            if (audioAttributesCompatParcelizer2.IconCompatParcelizer <= i7) {
                this.MediaBrowserCompatCustomActionResultReceiver -= audioAttributesCompatParcelizer2.IconCompatParcelizer;
                this.AudioAttributesImplApi21Parcelizer.remove(0);
                int i8 = this.MediaBrowserCompatItemReceiver;
                if (i8 < 5) {
                    AudioAttributesCompatParcelizer[] audioAttributesCompatParcelizerArr2 = this.AudioAttributesImplBaseParcelizer;
                    this.MediaBrowserCompatItemReceiver = i8 + 1;
                    audioAttributesCompatParcelizerArr2[i8] = audioAttributesCompatParcelizer2;
                }
            } else {
                audioAttributesCompatParcelizer2.IconCompatParcelizer -= i7;
                this.MediaBrowserCompatCustomActionResultReceiver -= i7;
            }
        }
    }

    public final float IconCompatParcelizer() {
        read();
        float f = this.MediaBrowserCompatCustomActionResultReceiver;
        int i = 0;
        for (int i2 = 0; i2 < this.AudioAttributesImplApi21Parcelizer.size(); i2++) {
            AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = this.AudioAttributesImplApi21Parcelizer.get(i2);
            i += audioAttributesCompatParcelizer.IconCompatParcelizer;
            if (i >= 0.5f * f) {
                return audioAttributesCompatParcelizer.read;
            }
        }
        if (this.AudioAttributesImplApi21Parcelizer.isEmpty()) {
            return Float.NaN;
        }
        return this.AudioAttributesImplApi21Parcelizer.get(r6.size() - 1).read;
    }

    private void AudioAttributesCompatParcelizer() {
        if (this.RemoteActionCompatParcelizer != 1) {
            Collections.sort(this.AudioAttributesImplApi21Parcelizer, read);
            this.RemoteActionCompatParcelizer = 1;
        }
    }

    private void read() {
        if (this.RemoteActionCompatParcelizer != 0) {
            Collections.sort(this.AudioAttributesImplApi21Parcelizer, IconCompatParcelizer);
            this.RemoteActionCompatParcelizer = 0;
        }
    }

    static class AudioAttributesCompatParcelizer {
        public int AudioAttributesCompatParcelizer;
        public int IconCompatParcelizer;
        public float read;

        private AudioAttributesCompatParcelizer() {
        }

        /* synthetic */ AudioAttributesCompatParcelizer(byte b) {
            this();
        }
    }
}
