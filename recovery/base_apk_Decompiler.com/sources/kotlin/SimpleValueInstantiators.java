package kotlin;

/* JADX INFO: loaded from: classes2.dex */
final class SimpleValueInstantiators implements putArray {
    private final AudioAttributesCompatParcelizer AudioAttributesCompatParcelizer;
    private boolean IconCompatParcelizer = true;
    private boolean MediaBrowserCompatItemReceiver;
    private buildIndexedListSerializer RemoteActionCompatParcelizer;
    private final findOptionalStdSerializer read;
    private putArray write;

    public interface AudioAttributesCompatParcelizer {
        void AudioAttributesCompatParcelizer(DefaultBaseTypeLimitingValidatorUnsafeBaseTypes defaultBaseTypeLimitingValidatorUnsafeBaseTypes);
    }

    public SimpleValueInstantiators(AudioAttributesCompatParcelizer audioAttributesCompatParcelizer, buildTypeDeserializer buildtypedeserializer) {
        this.AudioAttributesCompatParcelizer = audioAttributesCompatParcelizer;
        this.read = new findOptionalStdSerializer(buildtypedeserializer);
    }

    public final void RemoteActionCompatParcelizer() {
        this.MediaBrowserCompatItemReceiver = true;
        this.read.RemoteActionCompatParcelizer();
    }

    public final void write() {
        this.MediaBrowserCompatItemReceiver = false;
        this.read.write();
    }

    public final void IconCompatParcelizer(long j) {
        this.read.write(j);
    }

    public final void RemoteActionCompatParcelizer(buildIndexedListSerializer buildindexedlistserializer) throws addNull {
        putArray putarray;
        putArray putarrayAudioAttributesImplBaseParcelizer = buildindexedlistserializer.AudioAttributesImplBaseParcelizer();
        if (putarrayAudioAttributesImplBaseParcelizer == null || putarrayAudioAttributesImplBaseParcelizer == (putarray = this.write)) {
            return;
        }
        if (putarray != null) {
            throw addNull.RemoteActionCompatParcelizer(new IllegalStateException("Multiple renderer media clocks enabled."), 1000);
        }
        this.write = putarrayAudioAttributesImplBaseParcelizer;
        this.RemoteActionCompatParcelizer = buildindexedlistserializer;
        putarrayAudioAttributesImplBaseParcelizer.IconCompatParcelizer(this.read.IconCompatParcelizer());
    }

    public final void AudioAttributesCompatParcelizer(buildIndexedListSerializer buildindexedlistserializer) {
        if (buildindexedlistserializer == this.RemoteActionCompatParcelizer) {
            this.write = null;
            this.RemoteActionCompatParcelizer = null;
            this.IconCompatParcelizer = true;
        }
    }

    public final long IconCompatParcelizer(boolean z) {
        write(z);
        return read();
    }

    @Override // kotlin.putArray
    public final long read() {
        if (this.IconCompatParcelizer) {
            return this.read.read();
        }
        return ((putArray) buildTypeSerializer.IconCompatParcelizer(this.write)).read();
    }

    @Override // kotlin.putArray
    public final boolean AudioAttributesCompatParcelizer() {
        if (this.IconCompatParcelizer) {
            return this.read.AudioAttributesCompatParcelizer();
        }
        return ((putArray) buildTypeSerializer.IconCompatParcelizer(this.write)).AudioAttributesCompatParcelizer();
    }

    @Override // kotlin.putArray
    public final void IconCompatParcelizer(DefaultBaseTypeLimitingValidatorUnsafeBaseTypes defaultBaseTypeLimitingValidatorUnsafeBaseTypes) {
        putArray putarray = this.write;
        if (putarray != null) {
            putarray.IconCompatParcelizer(defaultBaseTypeLimitingValidatorUnsafeBaseTypes);
            defaultBaseTypeLimitingValidatorUnsafeBaseTypes = this.write.IconCompatParcelizer();
        }
        this.read.IconCompatParcelizer(defaultBaseTypeLimitingValidatorUnsafeBaseTypes);
    }

    @Override // kotlin.putArray
    public final DefaultBaseTypeLimitingValidatorUnsafeBaseTypes IconCompatParcelizer() {
        putArray putarray = this.write;
        if (putarray != null) {
            return putarray.IconCompatParcelizer();
        }
        return this.read.IconCompatParcelizer();
    }

    private void write(boolean z) {
        if (RemoteActionCompatParcelizer(z)) {
            this.IconCompatParcelizer = true;
            if (this.MediaBrowserCompatItemReceiver) {
                this.read.RemoteActionCompatParcelizer();
                return;
            }
            return;
        }
        putArray putarray = (putArray) buildTypeSerializer.IconCompatParcelizer(this.write);
        long j = putarray.read();
        if (this.IconCompatParcelizer) {
            if (j < this.read.read()) {
                this.read.write();
                return;
            } else {
                this.IconCompatParcelizer = false;
                if (this.MediaBrowserCompatItemReceiver) {
                    this.read.RemoteActionCompatParcelizer();
                }
            }
        }
        this.read.write(j);
        DefaultBaseTypeLimitingValidatorUnsafeBaseTypes defaultBaseTypeLimitingValidatorUnsafeBaseTypesIconCompatParcelizer = putarray.IconCompatParcelizer();
        if (defaultBaseTypeLimitingValidatorUnsafeBaseTypesIconCompatParcelizer.equals(this.read.IconCompatParcelizer())) {
            return;
        }
        this.read.IconCompatParcelizer(defaultBaseTypeLimitingValidatorUnsafeBaseTypesIconCompatParcelizer);
        this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(defaultBaseTypeLimitingValidatorUnsafeBaseTypesIconCompatParcelizer);
    }

    private boolean RemoteActionCompatParcelizer(boolean z) {
        buildIndexedListSerializer buildindexedlistserializer = this.RemoteActionCompatParcelizer;
        if (buildindexedlistserializer == null || buildindexedlistserializer.onRemoveQueueItemAt()) {
            return true;
        }
        if (z && this.RemoteActionCompatParcelizer.RatingCompat() != 2) {
            return true;
        }
        if (this.RemoteActionCompatParcelizer.onRemoveQueueItem()) {
            return false;
        }
        return z || this.RemoteActionCompatParcelizer.MediaMetadataCompat();
    }
}
