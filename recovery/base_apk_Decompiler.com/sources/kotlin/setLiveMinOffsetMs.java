package kotlin;

/* JADX INFO: loaded from: classes2.dex */
final class setLiveMinOffsetMs<Z> implements setMimeType<Z> {
    private final boolean AudioAttributesCompatParcelizer;
    private final setMimeType<Z> AudioAttributesImplApi21Parcelizer;
    private final onVolumeChanged IconCompatParcelizer;
    private final IconCompatParcelizer MediaBrowserCompatItemReceiver;
    private final boolean RemoteActionCompatParcelizer;
    private int read;
    private boolean write;

    interface IconCompatParcelizer {
        void RemoteActionCompatParcelizer(onVolumeChanged onvolumechanged, setLiveMinOffsetMs<?> setliveminoffsetms);
    }

    setLiveMinOffsetMs(setMimeType<Z> setmimetype, boolean z, boolean z2, onVolumeChanged onvolumechanged, IconCompatParcelizer iconCompatParcelizer) {
        this.AudioAttributesImplApi21Parcelizer = (setMimeType) moveMediaSource.AudioAttributesCompatParcelizer(setmimetype);
        this.RemoteActionCompatParcelizer = z;
        this.AudioAttributesCompatParcelizer = z2;
        this.IconCompatParcelizer = onvolumechanged;
        this.MediaBrowserCompatItemReceiver = (IconCompatParcelizer) moveMediaSource.AudioAttributesCompatParcelizer(iconCompatParcelizer);
    }

    final setMimeType<Z> IconCompatParcelizer() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    final boolean AudioAttributesImplApi21Parcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    @Override // kotlin.setMimeType
    public final Class<Z> read() {
        return this.AudioAttributesImplApi21Parcelizer.read();
    }

    @Override // kotlin.setMimeType
    public final Z RemoteActionCompatParcelizer() {
        return this.AudioAttributesImplApi21Parcelizer.RemoteActionCompatParcelizer();
    }

    @Override // kotlin.setMimeType
    public final int write() {
        return this.AudioAttributesImplApi21Parcelizer.write();
    }

    @Override // kotlin.setMimeType
    public final void MediaBrowserCompatCustomActionResultReceiver() {
        synchronized (this) {
            if (this.read > 0) {
                throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
            }
            if (this.write) {
                throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
            }
            this.write = true;
            if (this.AudioAttributesCompatParcelizer) {
                this.AudioAttributesImplApi21Parcelizer.MediaBrowserCompatCustomActionResultReceiver();
            }
        }
    }

    final void AudioAttributesCompatParcelizer() {
        synchronized (this) {
            if (this.write) {
                throw new IllegalStateException("Cannot acquire a recycled resource");
            }
            this.read++;
        }
    }

    final void AudioAttributesImplApi26Parcelizer() {
        boolean z;
        synchronized (this) {
            int i = this.read;
            if (i <= 0) {
                throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
            }
            int i2 = i - 1;
            this.read = i2;
            z = i2 == 0;
        }
        if (z) {
            this.MediaBrowserCompatItemReceiver.RemoteActionCompatParcelizer(this.IconCompatParcelizer, this);
        }
    }

    public final String toString() {
        String string;
        synchronized (this) {
            StringBuilder sb = new StringBuilder("EngineResource{isMemoryCacheable=");
            sb.append(this.RemoteActionCompatParcelizer);
            sb.append(", listener=");
            sb.append(this.MediaBrowserCompatItemReceiver);
            sb.append(", key=");
            sb.append(this.IconCompatParcelizer);
            sb.append(", acquired=");
            sb.append(this.read);
            sb.append(", isRecycled=");
            sb.append(this.write);
            sb.append(", resource=");
            sb.append(this.AudioAttributesImplApi21Parcelizer);
            sb.append('}');
            string = sb.toString();
        }
        return string;
    }
}
