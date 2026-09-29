package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0014\u001a\u00020\bHÆ\u0003J1\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0016\u001a\u00020\b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0010¨\u0006\u001b"}, d2 = {"Lcom/marrow2/ui/home/model/McqFCOptionVMModel;", "", "index", "", "title", "background", "Lcom/marrow2/domain/home/model/OptionBackground;", "isClickable", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/marrow2/domain/home/model/OptionBackground;Z)V", "getIndex", "()Ljava/lang/String;", "getTitle", "getBackground", "()Lcom/marrow2/domain/home/model/OptionBackground;", "()Z", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class GoogleApiClient {
    private final clearPrefixFlags AudioAttributesCompatParcelizer;
    private final boolean IconCompatParcelizer;
    private final String RemoteActionCompatParcelizer;
    private final String write;

    private GoogleApiClient(String str, String str2, clearPrefixFlags clearprefixflags, boolean z) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        toMagicModuleMetaRepoModel.write(clearprefixflags, "");
        this.RemoteActionCompatParcelizer = str;
        this.write = str2;
        this.AudioAttributesCompatParcelizer = clearprefixflags;
        this.IconCompatParcelizer = z;
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final String getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final String getWrite() {
        return this.write;
    }

    public /* synthetic */ GoogleApiClient(String str, String str2, clearPrefixFlags clearprefixflags, boolean z, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(str, str2, (i & 4) != 0 ? clearPrefixFlags.RemoteActionCompatParcelizer : clearprefixflags, (i & 8) != 0 ? true : z);
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final clearPrefixFlags getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final boolean getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static GoogleApiClient RemoteActionCompatParcelizer(String str, String str2, clearPrefixFlags clearprefixflags, boolean z) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        toMagicModuleMetaRepoModel.write(clearprefixflags, "");
        return new GoogleApiClient(str, str2, clearprefixflags, z);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GoogleApiClient)) {
            return false;
        }
        GoogleApiClient googleApiClient = (GoogleApiClient) other;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.RemoteActionCompatParcelizer, (Object) googleApiClient.RemoteActionCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.write, (Object) googleApiClient.write) && this.AudioAttributesCompatParcelizer == googleApiClient.AudioAttributesCompatParcelizer && this.IconCompatParcelizer == googleApiClient.IconCompatParcelizer;
    }

    public final int hashCode() {
        return (((((this.RemoteActionCompatParcelizer.hashCode() * 31) + this.write.hashCode()) * 31) + this.AudioAttributesCompatParcelizer.hashCode()) * 31) + Boolean.hashCode(this.IconCompatParcelizer);
    }

    public final String toString() {
        String str = this.RemoteActionCompatParcelizer;
        String str2 = this.write;
        clearPrefixFlags clearprefixflags = this.AudioAttributesCompatParcelizer;
        boolean z = this.IconCompatParcelizer;
        StringBuilder sb = new StringBuilder("McqFCOptionVMModel(index=");
        sb.append(str);
        sb.append(", title=");
        sb.append(str2);
        sb.append(", background=");
        sb.append(clearprefixflags);
        sb.append(", isClickable=");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }
}
