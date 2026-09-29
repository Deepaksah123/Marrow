package kotlin;

/* JADX INFO: loaded from: classes2.dex */
public final class findOptionalStdSerializer implements putArray {
    private long AudioAttributesCompatParcelizer;
    private DefaultBaseTypeLimitingValidatorUnsafeBaseTypes IconCompatParcelizer = DefaultBaseTypeLimitingValidatorUnsafeBaseTypes.write;
    private long RemoteActionCompatParcelizer;
    private final buildTypeDeserializer read;
    private boolean write;

    public findOptionalStdSerializer(buildTypeDeserializer buildtypedeserializer) {
        this.read = buildtypedeserializer;
    }

    public final void RemoteActionCompatParcelizer() {
        if (this.write) {
            return;
        }
        this.RemoteActionCompatParcelizer = this.read.RemoteActionCompatParcelizer();
        this.write = true;
    }

    public final void write() {
        if (this.write) {
            write(read());
            this.write = false;
        }
    }

    public final void write(long j) {
        this.AudioAttributesCompatParcelizer = j;
        if (this.write) {
            this.RemoteActionCompatParcelizer = this.read.RemoteActionCompatParcelizer();
        }
    }

    @Override // kotlin.putArray
    public final long read() {
        long jAudioAttributesCompatParcelizer;
        long j = this.AudioAttributesCompatParcelizer;
        if (!this.write) {
            return j;
        }
        long jRemoteActionCompatParcelizer = this.read.RemoteActionCompatParcelizer() - this.RemoteActionCompatParcelizer;
        if (this.IconCompatParcelizer.AudioAttributesCompatParcelizer == 1.0f) {
            jAudioAttributesCompatParcelizer = LaissezFaireSubTypeValidator.IconCompatParcelizer(jRemoteActionCompatParcelizer);
        } else {
            jAudioAttributesCompatParcelizer = this.IconCompatParcelizer.AudioAttributesCompatParcelizer(jRemoteActionCompatParcelizer);
        }
        return j + jAudioAttributesCompatParcelizer;
    }

    @Override // kotlin.putArray
    public final void IconCompatParcelizer(DefaultBaseTypeLimitingValidatorUnsafeBaseTypes defaultBaseTypeLimitingValidatorUnsafeBaseTypes) {
        if (this.write) {
            write(read());
        }
        this.IconCompatParcelizer = defaultBaseTypeLimitingValidatorUnsafeBaseTypes;
    }

    @Override // kotlin.putArray
    public final DefaultBaseTypeLimitingValidatorUnsafeBaseTypes IconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }
}
