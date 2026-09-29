package kotlin;

/* JADX INFO: loaded from: classes2.dex */
public final class StreamVolumeManagerVolumeChangeReceiverExternalSyntheticLambda0 extends ThumbRating {
    private final String RemoteActionCompatParcelizer;
    private final String read;

    public final String IconCompatParcelizer() {
        return this.read;
    }

    public final String write() {
        return this.RemoteActionCompatParcelizer;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StreamVolumeManagerVolumeChangeReceiverExternalSyntheticLambda0(String str, String str2) {
        super(null);
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        this.read = str;
        this.RemoteActionCompatParcelizer = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StreamVolumeManagerVolumeChangeReceiverExternalSyntheticLambda0)) {
            return false;
        }
        StreamVolumeManagerVolumeChangeReceiverExternalSyntheticLambda0 streamVolumeManagerVolumeChangeReceiverExternalSyntheticLambda0 = (StreamVolumeManagerVolumeChangeReceiverExternalSyntheticLambda0) obj;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.read, (Object) streamVolumeManagerVolumeChangeReceiverExternalSyntheticLambda0.read) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.RemoteActionCompatParcelizer, (Object) streamVolumeManagerVolumeChangeReceiverExternalSyntheticLambda0.RemoteActionCompatParcelizer);
    }

    public final int hashCode() {
        return (this.read.hashCode() * 31) + this.RemoteActionCompatParcelizer.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EncryptionSuccess(data=");
        sb.append(this.read);
        sb.append(", iv=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(')');
        return sb.toString();
    }
}
