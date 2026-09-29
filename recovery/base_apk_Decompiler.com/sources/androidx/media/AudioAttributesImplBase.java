package androidx.media;

import androidx.media.AudioAttributesImpl;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public class AudioAttributesImplBase implements AudioAttributesImpl {
    public int IconCompatParcelizer;
    public int RemoteActionCompatParcelizer;
    public int read;
    public int write;

    static int AudioAttributesCompatParcelizer(int i) {
        switch (i) {
        }
        return 2;
    }

    public AudioAttributesImplBase() {
        this.read = 0;
        this.write = 0;
        this.RemoteActionCompatParcelizer = 0;
        this.IconCompatParcelizer = -1;
    }

    AudioAttributesImplBase(int i, int i2, int i3, int i4) {
        this.write = i;
        this.RemoteActionCompatParcelizer = i2;
        this.read = i3;
        this.IconCompatParcelizer = i4;
    }

    private int write() {
        int i = this.IconCompatParcelizer;
        return i != -1 ? i : AudioAttributesCompat.write(false, this.RemoteActionCompatParcelizer, this.read);
    }

    private int read() {
        return this.write;
    }

    private int IconCompatParcelizer() {
        return this.read;
    }

    private int AudioAttributesCompatParcelizer() {
        int i = this.RemoteActionCompatParcelizer;
        int iWrite = write();
        if (iWrite == 6) {
            i |= 4;
        } else if (iWrite == 7) {
            i |= 1;
        }
        return i & 273;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.write), Integer.valueOf(this.RemoteActionCompatParcelizer), Integer.valueOf(this.read), Integer.valueOf(this.IconCompatParcelizer)});
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesImplBase)) {
            return false;
        }
        AudioAttributesImplBase audioAttributesImplBase = (AudioAttributesImplBase) obj;
        return this.write == audioAttributesImplBase.read() && this.RemoteActionCompatParcelizer == audioAttributesImplBase.AudioAttributesCompatParcelizer() && this.read == audioAttributesImplBase.IconCompatParcelizer() && this.IconCompatParcelizer == audioAttributesImplBase.IconCompatParcelizer;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AudioAttributesCompat:");
        if (this.IconCompatParcelizer != -1) {
            sb.append(" stream=");
            sb.append(this.IconCompatParcelizer);
            sb.append(" derived");
        }
        sb.append(" usage=");
        sb.append(AudioAttributesCompat.write(this.read));
        sb.append(" content=");
        sb.append(this.write);
        sb.append(" flags=0x");
        sb.append(Integer.toHexString(this.RemoteActionCompatParcelizer).toUpperCase());
        return sb.toString();
    }

    static class write implements AudioAttributesImpl.write {
        private int AudioAttributesCompatParcelizer = 0;
        private int read = 0;
        private int RemoteActionCompatParcelizer = 0;
        private int write = -1;

        write() {
        }

        @Override // androidx.media.AudioAttributesImpl.write
        public final AudioAttributesImpl RemoteActionCompatParcelizer() {
            return new AudioAttributesImplBase(this.read, this.RemoteActionCompatParcelizer, this.AudioAttributesCompatParcelizer, this.write);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // androidx.media.AudioAttributesImpl.write
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public write read(int i) {
            if (i == 10) {
                throw new IllegalArgumentException("STREAM_ACCESSIBILITY is not a legacy stream type that was used for audio playback");
            }
            this.write = i;
            return RemoteActionCompatParcelizer(i);
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        private write RemoteActionCompatParcelizer(int i) {
            switch (i) {
                case 0:
                    this.read = 1;
                    break;
                case 1:
                    this.read = 4;
                    break;
                case 2:
                    this.read = 4;
                    break;
                case 3:
                    this.read = 2;
                    break;
                case 4:
                    this.read = 4;
                    break;
                case 5:
                    this.read = 4;
                    break;
                case 6:
                    this.read = 1;
                    this.RemoteActionCompatParcelizer |= 4;
                    break;
                case 7:
                    this.RemoteActionCompatParcelizer = 1 | this.RemoteActionCompatParcelizer;
                    this.read = 4;
                    break;
                case 8:
                    this.read = 4;
                    break;
                case 9:
                    this.read = 4;
                    break;
                case 10:
                    this.read = 1;
                    break;
            }
            this.AudioAttributesCompatParcelizer = AudioAttributesImplBase.AudioAttributesCompatParcelizer(i);
            return this;
        }
    }
}
