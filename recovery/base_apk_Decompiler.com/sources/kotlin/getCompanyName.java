package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0087\b\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB9\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\tHÆ\u0003J;\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\t2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001d\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001f"}, d2 = {"Lcom/marrow2/ui/qbank/play/model/QBankSteakInfoModel;", "", "steakCount", "", "steakTitle", "", "steakType", "steakNumber", "steakVisibility", "", "<init>", "(ILjava/lang/String;IIZ)V", "getSteakCount", "()I", "getSteakTitle", "()Ljava/lang/String;", "getSteakType", "getSteakNumber", "getSteakVisibility", "()Z", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "toString", "Companion", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class getCompanyName {
    public static final RemoteActionCompatParcelizer read = new RemoteActionCompatParcelizer(null);
    private final String AudioAttributesCompatParcelizer;
    private final boolean AudioAttributesImplApi26Parcelizer;
    private final int IconCompatParcelizer;
    private final int RemoteActionCompatParcelizer;
    private final int write;

    private getCompanyName(int i, String str, int i2, int i3, boolean z) {
        toMagicModuleMetaRepoModel.write(str, "");
        this.RemoteActionCompatParcelizer = i;
        this.AudioAttributesCompatParcelizer = str;
        this.write = i2;
        this.IconCompatParcelizer = i3;
        this.AudioAttributesImplApi26Parcelizer = z;
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final int getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public /* synthetic */ getCompanyName(int i, String str, int i2, int i3, boolean z, int i4, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i4 & 1) != 0 ? 0 : i, (i4 & 2) != 0 ? "" : str, (i4 & 4) != 0 ? 1 : i2, (i4 & 8) != 0 ? 0 : i3, (i4 & 16) != 0 ? false : z);
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final int getWrite() {
        return this.write;
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final int getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final boolean getAudioAttributesImplApi26Parcelizer() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/getCompanyName$RemoteActionCompatParcelizer;", "", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class RemoteActionCompatParcelizer {
        private RemoteActionCompatParcelizer() {
        }

        public /* synthetic */ RemoteActionCompatParcelizer(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    public getCompanyName() {
        this(0, null, 0, 0, false, 31, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static getCompanyName AudioAttributesCompatParcelizer(int i, String str, int i2, int i3, boolean z) {
        toMagicModuleMetaRepoModel.write(str, "");
        return new getCompanyName(i, str, i2, i3, z);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof getCompanyName)) {
            return false;
        }
        getCompanyName getcompanyname = (getCompanyName) other;
        return this.RemoteActionCompatParcelizer == getcompanyname.RemoteActionCompatParcelizer && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesCompatParcelizer, (Object) getcompanyname.AudioAttributesCompatParcelizer) && this.write == getcompanyname.write && this.IconCompatParcelizer == getcompanyname.IconCompatParcelizer && this.AudioAttributesImplApi26Parcelizer == getcompanyname.AudioAttributesImplApi26Parcelizer;
    }

    public final int hashCode() {
        return (((((((Integer.hashCode(this.RemoteActionCompatParcelizer) * 31) + this.AudioAttributesCompatParcelizer.hashCode()) * 31) + Integer.hashCode(this.write)) * 31) + Integer.hashCode(this.IconCompatParcelizer)) * 31) + Boolean.hashCode(this.AudioAttributesImplApi26Parcelizer);
    }

    public final String toString() {
        int i = this.RemoteActionCompatParcelizer;
        String str = this.AudioAttributesCompatParcelizer;
        int i2 = this.write;
        int i3 = this.IconCompatParcelizer;
        boolean z = this.AudioAttributesImplApi26Parcelizer;
        StringBuilder sb = new StringBuilder("QBankSteakInfoModel(steakCount=");
        sb.append(i);
        sb.append(", steakTitle=");
        sb.append(str);
        sb.append(", steakType=");
        sb.append(i2);
        sb.append(", steakNumber=");
        sb.append(i3);
        sb.append(", steakVisibility=");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }
}
