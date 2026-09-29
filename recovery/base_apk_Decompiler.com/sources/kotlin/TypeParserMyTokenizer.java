package kotlin;

import com.google.android.exoplayer2.C;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
final class TypeParserMyTokenizer {
    private boolean IconCompatParcelizer;
    private boolean MediaBrowserCompatCustomActionResultReceiver;
    private int read;
    private IconCompatParcelizer AudioAttributesCompatParcelizer = new IconCompatParcelizer();
    private IconCompatParcelizer write = new IconCompatParcelizer();
    private long RemoteActionCompatParcelizer = C.TIME_UNSET;

    public final void MediaBrowserCompatItemReceiver() {
        this.AudioAttributesCompatParcelizer.IconCompatParcelizer();
        this.write.IconCompatParcelizer();
        this.IconCompatParcelizer = false;
        this.RemoteActionCompatParcelizer = C.TIME_UNSET;
        this.read = 0;
    }

    public final void IconCompatParcelizer(long j) {
        this.AudioAttributesCompatParcelizer.write(j);
        if (this.AudioAttributesCompatParcelizer.read()) {
            this.IconCompatParcelizer = false;
        } else if (this.RemoteActionCompatParcelizer != C.TIME_UNSET) {
            if (!this.IconCompatParcelizer || this.write.write()) {
                this.write.IconCompatParcelizer();
                this.write.write(this.RemoteActionCompatParcelizer);
            }
            this.IconCompatParcelizer = true;
            this.write.write(j);
        }
        if (this.IconCompatParcelizer && this.write.read()) {
            IconCompatParcelizer iconCompatParcelizer = this.AudioAttributesCompatParcelizer;
            this.AudioAttributesCompatParcelizer = this.write;
            this.write = iconCompatParcelizer;
            this.IconCompatParcelizer = false;
            this.MediaBrowserCompatCustomActionResultReceiver = false;
        }
        this.RemoteActionCompatParcelizer = j;
        this.read = this.AudioAttributesCompatParcelizer.read() ? 0 : this.read + 1;
    }

    public final boolean IconCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer.read();
    }

    public final int RemoteActionCompatParcelizer() {
        return this.read;
    }

    public final long read() {
        return IconCompatParcelizer() ? this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer() : C.TIME_UNSET;
    }

    public final long write() {
        return IconCompatParcelizer() ? this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer() : C.TIME_UNSET;
    }

    public final float AudioAttributesCompatParcelizer() {
        if (IconCompatParcelizer()) {
            return (float) (1.0E9d / this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer());
        }
        return -1.0f;
    }

    static final class IconCompatParcelizer {
        private long AudioAttributesCompatParcelizer;
        private long AudioAttributesImplApi21Parcelizer;
        private long IconCompatParcelizer;
        private int MediaBrowserCompatCustomActionResultReceiver;
        private final boolean[] MediaBrowserCompatItemReceiver = new boolean[15];
        private long RemoteActionCompatParcelizer;
        private long read;
        private long write;

        public final void IconCompatParcelizer() {
            this.AudioAttributesCompatParcelizer = 0L;
            this.write = 0L;
            this.AudioAttributesImplApi21Parcelizer = 0L;
            this.MediaBrowserCompatCustomActionResultReceiver = 0;
            Arrays.fill(this.MediaBrowserCompatItemReceiver, false);
        }

        public final boolean read() {
            return this.AudioAttributesCompatParcelizer > 15 && this.MediaBrowserCompatCustomActionResultReceiver == 0;
        }

        public final boolean write() {
            long j = this.AudioAttributesCompatParcelizer;
            if (j == 0) {
                return false;
            }
            return this.MediaBrowserCompatItemReceiver[AudioAttributesCompatParcelizer(j - 1)];
        }

        public final long AudioAttributesCompatParcelizer() {
            return this.AudioAttributesImplApi21Parcelizer;
        }

        public final long RemoteActionCompatParcelizer() {
            long j = this.write;
            if (j == 0) {
                return 0L;
            }
            return this.AudioAttributesImplApi21Parcelizer / j;
        }

        public final void write(long j) {
            long j2 = this.AudioAttributesCompatParcelizer;
            if (j2 == 0) {
                this.read = j;
            } else if (j2 == 1) {
                long j3 = j - this.read;
                this.RemoteActionCompatParcelizer = j3;
                this.AudioAttributesImplApi21Parcelizer = j3;
                this.write = 1L;
            } else {
                long j4 = j - this.IconCompatParcelizer;
                int iAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(j2);
                if (Math.abs(j4 - this.RemoteActionCompatParcelizer) <= 1000000) {
                    this.write++;
                    this.AudioAttributesImplApi21Parcelizer += j4;
                    boolean[] zArr = this.MediaBrowserCompatItemReceiver;
                    if (zArr[iAudioAttributesCompatParcelizer]) {
                        zArr[iAudioAttributesCompatParcelizer] = false;
                        this.MediaBrowserCompatCustomActionResultReceiver--;
                    }
                } else {
                    boolean[] zArr2 = this.MediaBrowserCompatItemReceiver;
                    if (!zArr2[iAudioAttributesCompatParcelizer]) {
                        zArr2[iAudioAttributesCompatParcelizer] = true;
                        this.MediaBrowserCompatCustomActionResultReceiver++;
                    }
                }
            }
            this.AudioAttributesCompatParcelizer++;
            this.IconCompatParcelizer = j;
        }

        private static int AudioAttributesCompatParcelizer(long j) {
            return (int) (j % 15);
        }
    }
}
