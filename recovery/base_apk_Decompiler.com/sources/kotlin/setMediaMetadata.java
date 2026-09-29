package kotlin;

import kotlin.isPrepared;
import kotlin.rewrapCtorProblem;

/* JADX INFO: loaded from: classes2.dex */
final class setMediaMetadata<Z> implements setMimeType<Z>, isPrepared.read {
    private static final rewrapCtorProblem.IconCompatParcelizer<setMediaMetadata<?>> read = isPrepared.read(20, new isPrepared.IconCompatParcelizer<setMediaMetadata<?>>() { // from class: o.setMediaMetadata.3
        @Override // o.isPrepared.IconCompatParcelizer
        public final /* synthetic */ setMediaMetadata<?> write() {
            return read();
        }

        private static setMediaMetadata<?> read() {
            return new setMediaMetadata<>();
        }
    });
    private boolean AudioAttributesCompatParcelizer;
    private boolean IconCompatParcelizer;
    private setMimeType<Z> RemoteActionCompatParcelizer;
    private final lambdaprepareChildSource0comgoogleandroidexoplayer2MediaSourceList write = lambdaprepareChildSource0comgoogleandroidexoplayer2MediaSourceList.write();

    static <Z> setMediaMetadata<Z> write(setMimeType<Z> setmimetype) {
        setMediaMetadata<Z> setmediametadata = (setMediaMetadata) moveMediaSource.AudioAttributesCompatParcelizer(read.RemoteActionCompatParcelizer());
        setmediametadata.RemoteActionCompatParcelizer(setmimetype);
        return setmediametadata;
    }

    setMediaMetadata() {
    }

    private void RemoteActionCompatParcelizer(setMimeType<Z> setmimetype) {
        this.IconCompatParcelizer = false;
        this.AudioAttributesCompatParcelizer = true;
        this.RemoteActionCompatParcelizer = setmimetype;
    }

    private void IconCompatParcelizer() {
        this.RemoteActionCompatParcelizer = null;
        read.RemoteActionCompatParcelizer(this);
    }

    final void AudioAttributesCompatParcelizer() {
        synchronized (this) {
            this.write.read();
            if (!this.AudioAttributesCompatParcelizer) {
                throw new IllegalStateException("Already unlocked");
            }
            this.AudioAttributesCompatParcelizer = false;
            if (this.IconCompatParcelizer) {
                MediaBrowserCompatCustomActionResultReceiver();
            }
        }
    }

    @Override // kotlin.setMimeType
    public final Class<Z> read() {
        return this.RemoteActionCompatParcelizer.read();
    }

    @Override // kotlin.setMimeType
    public final Z RemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer();
    }

    @Override // kotlin.setMimeType
    public final int write() {
        return this.RemoteActionCompatParcelizer.write();
    }

    @Override // kotlin.setMimeType
    public final void MediaBrowserCompatCustomActionResultReceiver() {
        synchronized (this) {
            this.write.read();
            this.IconCompatParcelizer = true;
            if (!this.AudioAttributesCompatParcelizer) {
                this.RemoteActionCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver();
                IconCompatParcelizer();
            }
        }
    }

    @Override // o.isPrepared.read
    public final lambdaprepareChildSource0comgoogleandroidexoplayer2MediaSourceList I_() {
        return this.write;
    }
}
