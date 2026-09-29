package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J1\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00052\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\f¨\u0006\u0018"}, d2 = {"Lcom/marrow2/ui/home/model/PearlInfoVMModel;", "Lcom/marrow2/ui/home/model/HomeCardVMModel;", "pearlCount", "", "isSyncOn", "", "isPearlVisible", "isCountVisible", "<init>", "(IZZZ)V", "getPearlCount", "()I", "()Z", "component1", "component2", "component3", "component4", "copy", "equals", "other", "", "hashCode", "toString", "", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class hasApi extends getApiKey {
    private final boolean AudioAttributesCompatParcelizer;
    private final boolean IconCompatParcelizer;
    private final boolean RemoteActionCompatParcelizer;
    private final int write;

    private hasApi(int i, boolean z, boolean z2, boolean z3) {
        super(11);
        this.write = i;
        this.RemoteActionCompatParcelizer = z;
        this.IconCompatParcelizer = z2;
        this.AudioAttributesCompatParcelizer = z3;
    }

    public /* synthetic */ hasApi(int i, boolean z, boolean z2, boolean z3, int i2, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? false : z, (i2 & 4) != 0 ? false : z2, (i2 & 8) != 0 ? true : z3);
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final int getWrite() {
        return this.write;
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final boolean getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final boolean getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public hasApi() {
        this(0, false, false, false, 15, null);
    }

    public static hasApi AudioAttributesCompatParcelizer(int i, boolean z, boolean z2, boolean z3) {
        return new hasApi(i, z, true, z3);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof hasApi)) {
            return false;
        }
        hasApi hasapi = (hasApi) other;
        return this.write == hasapi.write && this.RemoteActionCompatParcelizer == hasapi.RemoteActionCompatParcelizer && this.IconCompatParcelizer == hasapi.IconCompatParcelizer && this.AudioAttributesCompatParcelizer == hasapi.AudioAttributesCompatParcelizer;
    }

    public final int hashCode() {
        return (((((Integer.hashCode(this.write) * 31) + Boolean.hashCode(this.RemoteActionCompatParcelizer)) * 31) + Boolean.hashCode(this.IconCompatParcelizer)) * 31) + Boolean.hashCode(this.AudioAttributesCompatParcelizer);
    }

    public final String toString() {
        int i = this.write;
        boolean z = this.RemoteActionCompatParcelizer;
        boolean z2 = this.IconCompatParcelizer;
        boolean z3 = this.AudioAttributesCompatParcelizer;
        StringBuilder sb = new StringBuilder("PearlInfoVMModel(pearlCount=");
        sb.append(i);
        sb.append(", isSyncOn=");
        sb.append(z);
        sb.append(", isPearlVisible=");
        sb.append(z2);
        sb.append(", isCountVisible=");
        sb.append(z3);
        sb.append(")");
        return sb.toString();
    }
}
