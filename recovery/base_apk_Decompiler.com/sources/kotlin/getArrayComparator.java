package kotlin;

import android.content.Context;
import android.view.Surface;
import com.google.android.exoplayer2.C;

/* JADX INFO: loaded from: classes2.dex */
public final class getArrayComparator {
    private long AudioAttributesImplApi21Parcelizer;
    private boolean AudioAttributesImplApi26Parcelizer;
    private boolean MediaBrowserCompatSearchResultReceiver;
    private final pushBack RemoteActionCompatParcelizer;
    private final long read;
    private final AudioAttributesCompatParcelizer write;
    private int AudioAttributesCompatParcelizer = 0;
    private long MediaBrowserCompatItemReceiver = C.TIME_UNSET;
    private long MediaBrowserCompatCustomActionResultReceiver = C.TIME_UNSET;
    private long AudioAttributesImplBaseParcelizer = C.TIME_UNSET;
    private float MediaDescriptionCompat = 1.0f;
    private buildTypeDeserializer IconCompatParcelizer = buildTypeDeserializer.write;

    public interface AudioAttributesCompatParcelizer {
        boolean RemoteActionCompatParcelizer(long j, long j2, boolean z, boolean z2) throws addNull;

        boolean RemoteActionCompatParcelizer(long j, boolean z);

        boolean write(long j, long j2);
    }

    public static class RemoteActionCompatParcelizer {
        private long IconCompatParcelizer = C.TIME_UNSET;
        private long AudioAttributesCompatParcelizer = C.TIME_UNSET;

        public final long AudioAttributesCompatParcelizer() {
            return this.IconCompatParcelizer;
        }

        public final long IconCompatParcelizer() {
            return this.AudioAttributesCompatParcelizer;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void read() {
            this.IconCompatParcelizer = C.TIME_UNSET;
            this.AudioAttributesCompatParcelizer = C.TIME_UNSET;
        }
    }

    public getArrayComparator(Context context, AudioAttributesCompatParcelizer audioAttributesCompatParcelizer, long j) {
        this.write = audioAttributesCompatParcelizer;
        this.read = j;
        this.RemoteActionCompatParcelizer = new pushBack(context);
    }

    public final void AudioAttributesCompatParcelizer(boolean z) {
        this.AudioAttributesCompatParcelizer = z ? 1 : 0;
    }

    public final void RemoteActionCompatParcelizer() {
        AudioAttributesCompatParcelizer(0);
    }

    public final void AudioAttributesCompatParcelizer() {
        this.MediaBrowserCompatSearchResultReceiver = true;
        this.AudioAttributesImplApi21Parcelizer = LaissezFaireSubTypeValidator.IconCompatParcelizer(this.IconCompatParcelizer.RemoteActionCompatParcelizer());
        this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer();
    }

    public final void AudioAttributesImplApi26Parcelizer() {
        this.MediaBrowserCompatSearchResultReceiver = false;
        this.AudioAttributesImplBaseParcelizer = C.TIME_UNSET;
        this.RemoteActionCompatParcelizer.IconCompatParcelizer();
    }

    public final void IconCompatParcelizer() {
        AudioAttributesCompatParcelizer(2);
    }

    public final void AudioAttributesCompatParcelizer(Surface surface) {
        this.RemoteActionCompatParcelizer.read(surface);
        AudioAttributesCompatParcelizer(1);
    }

    public final void RemoteActionCompatParcelizer(float f) {
        this.RemoteActionCompatParcelizer.IconCompatParcelizer(f);
    }

    public final boolean read() {
        boolean z = this.AudioAttributesCompatParcelizer != 3;
        this.AudioAttributesCompatParcelizer = 3;
        this.AudioAttributesImplApi21Parcelizer = LaissezFaireSubTypeValidator.IconCompatParcelizer(this.IconCompatParcelizer.RemoteActionCompatParcelizer());
        return z;
    }

    public final void RemoteActionCompatParcelizer(buildTypeDeserializer buildtypedeserializer) {
        this.IconCompatParcelizer = buildtypedeserializer;
    }

    public final void write() {
        if (this.AudioAttributesCompatParcelizer == 0) {
            this.AudioAttributesCompatParcelizer = 1;
        }
    }

    public final boolean read(boolean z) {
        if (z && this.AudioAttributesCompatParcelizer == 3) {
            this.AudioAttributesImplBaseParcelizer = C.TIME_UNSET;
            return true;
        }
        if (this.AudioAttributesImplBaseParcelizer == C.TIME_UNSET) {
            return false;
        }
        if (this.IconCompatParcelizer.RemoteActionCompatParcelizer() < this.AudioAttributesImplBaseParcelizer) {
            return true;
        }
        this.AudioAttributesImplBaseParcelizer = C.TIME_UNSET;
        return false;
    }

    public final void write(boolean z) {
        this.AudioAttributesImplApi26Parcelizer = z;
        this.AudioAttributesImplBaseParcelizer = this.read > 0 ? this.IconCompatParcelizer.RemoteActionCompatParcelizer() + this.read : C.TIME_UNSET;
    }

    public final int read(long j, long j2, long j3, long j4, boolean z, RemoteActionCompatParcelizer remoteActionCompatParcelizer) throws addNull {
        remoteActionCompatParcelizer.read();
        if (this.MediaBrowserCompatItemReceiver == C.TIME_UNSET) {
            this.MediaBrowserCompatItemReceiver = j2;
        }
        if (this.MediaBrowserCompatCustomActionResultReceiver != j) {
            this.RemoteActionCompatParcelizer.write(j);
            this.MediaBrowserCompatCustomActionResultReceiver = j;
        }
        remoteActionCompatParcelizer.IconCompatParcelizer = AudioAttributesCompatParcelizer(j2, j3, j);
        if (RemoteActionCompatParcelizer(j2, remoteActionCompatParcelizer.IconCompatParcelizer, j4)) {
            return 0;
        }
        if (!this.MediaBrowserCompatSearchResultReceiver || j2 == this.MediaBrowserCompatItemReceiver) {
            return 5;
        }
        long j5 = this.IconCompatParcelizer.read();
        remoteActionCompatParcelizer.AudioAttributesCompatParcelizer = this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer((remoteActionCompatParcelizer.IconCompatParcelizer * 1000) + j5);
        remoteActionCompatParcelizer.IconCompatParcelizer = (remoteActionCompatParcelizer.AudioAttributesCompatParcelizer - j5) / 1000;
        boolean z2 = (this.AudioAttributesImplBaseParcelizer == C.TIME_UNSET || this.AudioAttributesImplApi26Parcelizer) ? false : true;
        if (this.write.RemoteActionCompatParcelizer(remoteActionCompatParcelizer.IconCompatParcelizer, j2, z, z2)) {
            return 4;
        }
        return this.write.RemoteActionCompatParcelizer(remoteActionCompatParcelizer.IconCompatParcelizer, z) ? z2 ? 3 : 2 : remoteActionCompatParcelizer.IconCompatParcelizer > 50000 ? 5 : 1;
    }

    public final void MediaBrowserCompatItemReceiver() {
        this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer();
        this.MediaBrowserCompatCustomActionResultReceiver = C.TIME_UNSET;
        this.MediaBrowserCompatItemReceiver = C.TIME_UNSET;
        AudioAttributesCompatParcelizer(1);
        this.AudioAttributesImplBaseParcelizer = C.TIME_UNSET;
    }

    public final void write(int i) {
        this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(i);
    }

    public final void write(float f) {
        if (f == this.MediaDescriptionCompat) {
            return;
        }
        this.MediaDescriptionCompat = f;
        this.RemoteActionCompatParcelizer.read(f);
    }

    private void AudioAttributesCompatParcelizer(int i) {
        this.AudioAttributesCompatParcelizer = Math.min(this.AudioAttributesCompatParcelizer, i);
    }

    private long AudioAttributesCompatParcelizer(long j, long j2, long j3) {
        long j4 = (long) ((j3 - j) / ((double) this.MediaDescriptionCompat));
        return this.MediaBrowserCompatSearchResultReceiver ? j4 - (LaissezFaireSubTypeValidator.IconCompatParcelizer(this.IconCompatParcelizer.RemoteActionCompatParcelizer()) - j2) : j4;
    }

    private boolean RemoteActionCompatParcelizer(long j, long j2, long j3) {
        if (this.AudioAttributesImplBaseParcelizer != C.TIME_UNSET && !this.AudioAttributesImplApi26Parcelizer) {
            return false;
        }
        int i = this.AudioAttributesCompatParcelizer;
        if (i == 0) {
            return this.MediaBrowserCompatSearchResultReceiver;
        }
        if (i == 1) {
            return true;
        }
        if (i == 2) {
            return j >= j3;
        }
        if (i == 3) {
            return this.MediaBrowserCompatSearchResultReceiver && this.write.write(j2, LaissezFaireSubTypeValidator.IconCompatParcelizer(this.IconCompatParcelizer.RemoteActionCompatParcelizer()) - this.AudioAttributesImplApi21Parcelizer);
        }
        throw new IllegalStateException();
    }
}
