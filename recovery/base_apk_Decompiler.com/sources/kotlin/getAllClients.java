package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\f\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0012\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0011R\u001a\u0010\u0016\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u000fR\u001a\u0010\u0014\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0018\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0017\u001a\u0004\b\u001a\u0010\u0019"}, d2 = {"Lo/getAllClients;", "Lo/getApiKey;", "", "p0", "", "p1", "", "p2", "p3", "<init>", "(Ljava/lang/String;IZZ)V", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "IconCompatParcelizer", "Ljava/lang/String;", "write", "I", "AudioAttributesCompatParcelizer", "Z", "read", "()Z", "RemoteActionCompatParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class getAllClients extends getApiKey {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final boolean write;
    private final String IconCompatParcelizer;
    private final boolean read;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final int AudioAttributesCompatParcelizer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getAllClients(String str, int i, boolean z, boolean z2) {
        super(13);
        toMagicModuleMetaRepoModel.write(str, "");
        this.IconCompatParcelizer = str;
        this.AudioAttributesCompatParcelizer = i;
        this.write = z;
        this.read = z2;
    }

    public /* synthetic */ getAllClients(String str, int i, boolean z, boolean z2, int i2, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? -1 : i, (i2 & 4) != 0 ? false : z, (i2 & 8) != 0 ? false : z2);
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final String getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final int getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final boolean getWrite() {
        return this.write;
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final boolean getRead() {
        return this.read;
    }

    public getAllClients() {
        this(null, 0, false, false, 15, null);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof getAllClients)) {
            return false;
        }
        getAllClients getallclients = (getAllClients) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.IconCompatParcelizer, (Object) getallclients.IconCompatParcelizer) && this.AudioAttributesCompatParcelizer == getallclients.AudioAttributesCompatParcelizer && this.write == getallclients.write && this.read == getallclients.read;
    }

    public final int hashCode() {
        return (((((this.IconCompatParcelizer.hashCode() * 31) + Integer.hashCode(this.AudioAttributesCompatParcelizer)) * 31) + Boolean.hashCode(this.write)) * 31) + Boolean.hashCode(this.read);
    }

    public final String toString() {
        String str = this.IconCompatParcelizer;
        int i = this.AudioAttributesCompatParcelizer;
        boolean z = this.write;
        boolean z2 = this.read;
        StringBuilder sb = new StringBuilder("getAllClients(IconCompatParcelizer=");
        sb.append(str);
        sb.append(", AudioAttributesCompatParcelizer=");
        sb.append(i);
        sb.append(", write=");
        sb.append(z);
        sb.append(", read=");
        sb.append(z2);
        sb.append(")");
        return sb.toString();
    }
}
