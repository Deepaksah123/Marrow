package kotlin;

import kotlin.Metadata;
import kotlin.isUiRequired;
import kotlin.setEmailRequired;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0017\u001a\u00020\tHÆ\u0003J1\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\t2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001e"}, d2 = {"Lcom/marrow2/ui/test/gtanalytics/model/GTAnalyticsUIModel;", "", "limit", "", "top", "Lcom/marrow2/ui/test/gtanalytics/model/GtaTopState;", "bottom", "Lcom/marrow2/ui/test/gtanalytics/model/GtaBottomState;", "popupVisible", "", "<init>", "(ILcom/marrow2/ui/test/gtanalytics/model/GtaTopState;Lcom/marrow2/ui/test/gtanalytics/model/GtaBottomState;Z)V", "getLimit", "()I", "getTop", "()Lcom/marrow2/ui/test/gtanalytics/model/GtaTopState;", "getBottom", "()Lcom/marrow2/ui/test/gtanalytics/model/GtaBottomState;", "getPopupVisible", "()Z", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "toString", "", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class getSavedState {
    private final setEmailRequired AudioAttributesCompatParcelizer;
    private final isUiRequired IconCompatParcelizer;
    private final int read;
    private final boolean write;

    public getSavedState(int i, setEmailRequired setemailrequired, isUiRequired isuirequired, boolean z) {
        toMagicModuleMetaRepoModel.write(setemailrequired, "");
        toMagicModuleMetaRepoModel.write(isuirequired, "");
        this.read = i;
        this.AudioAttributesCompatParcelizer = setemailrequired;
        this.IconCompatParcelizer = isuirequired;
        this.write = z;
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final int getRead() {
        return this.read;
    }

    public /* synthetic */ getSavedState(int i, setEmailRequired.read readVar, isUiRequired.RemoteActionCompatParcelizer remoteActionCompatParcelizer, boolean z, int i2, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i2 & 1) != 0 ? 20 : i, (i2 & 2) != 0 ? setEmailRequired.read.INSTANCE : readVar, (i2 & 4) != 0 ? isUiRequired.RemoteActionCompatParcelizer.INSTANCE : remoteActionCompatParcelizer, (i2 & 8) != 0 ? false : z);
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final setEmailRequired getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final isUiRequired getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final boolean getWrite() {
        return this.write;
    }

    public getSavedState() {
        this(0, null, null, false, 15, null);
    }

    public static /* synthetic */ getSavedState write(getSavedState getsavedstate, int i, setEmailRequired setemailrequired, isUiRequired isuirequired, boolean z, int i2) {
        if ((i2 & 1) != 0) {
            i = getsavedstate.read;
        }
        if ((i2 & 2) != 0) {
            setemailrequired = getsavedstate.AudioAttributesCompatParcelizer;
        }
        if ((i2 & 4) != 0) {
            isuirequired = getsavedstate.IconCompatParcelizer;
        }
        if ((i2 & 8) != 0) {
            z = getsavedstate.write;
        }
        return RemoteActionCompatParcelizer(i, setemailrequired, isuirequired, z);
    }

    private static getSavedState RemoteActionCompatParcelizer(int i, setEmailRequired setemailrequired, isUiRequired isuirequired, boolean z) {
        toMagicModuleMetaRepoModel.write(setemailrequired, "");
        toMagicModuleMetaRepoModel.write(isuirequired, "");
        return new getSavedState(i, setemailrequired, isuirequired, z);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof getSavedState)) {
            return false;
        }
        getSavedState getsavedstate = (getSavedState) other;
        return this.read == getsavedstate.read && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, getsavedstate.AudioAttributesCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.IconCompatParcelizer, getsavedstate.IconCompatParcelizer) && this.write == getsavedstate.write;
    }

    public final int hashCode() {
        return (((((Integer.hashCode(this.read) * 31) + this.AudioAttributesCompatParcelizer.hashCode()) * 31) + this.IconCompatParcelizer.hashCode()) * 31) + Boolean.hashCode(this.write);
    }

    public final String toString() {
        int i = this.read;
        setEmailRequired setemailrequired = this.AudioAttributesCompatParcelizer;
        isUiRequired isuirequired = this.IconCompatParcelizer;
        boolean z = this.write;
        StringBuilder sb = new StringBuilder("GTAnalyticsUIModel(limit=");
        sb.append(i);
        sb.append(", top=");
        sb.append(setemailrequired);
        sb.append(", bottom=");
        sb.append(isuirequired);
        sb.append(", popupVisible=");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }
}
