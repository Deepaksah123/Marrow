package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J1\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00032\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\n¨\u0006\u0017"}, d2 = {"Lcom/marrow2/ui/video/lesson_list/model/VideoListUIState;", "", "isInternModeBannerVisible", "", "isAuthorDescriptionExpanded", "selectedIndexPosition", "", "isBackPressed", "<init>", "(ZZIZ)V", "()Z", "getSelectedIndexPosition", "()I", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "toString", "", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class getTasksClient {
    private final boolean AudioAttributesCompatParcelizer;
    private final boolean IconCompatParcelizer;
    private final boolean RemoteActionCompatParcelizer;
    private final int write;

    private getTasksClient(boolean z, boolean z2, int i, boolean z3) {
        this.AudioAttributesCompatParcelizer = z;
        this.RemoteActionCompatParcelizer = z2;
        this.write = i;
        this.IconCompatParcelizer = z3;
    }

    public /* synthetic */ getTasksClient(boolean z, boolean z2, int i, boolean z3, int i2, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? false : z2, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? false : z3);
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final boolean getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final boolean getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final boolean getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public getTasksClient() {
        this(false, false, 0, false, 15, null);
    }

    public static /* synthetic */ getTasksClient IconCompatParcelizer(getTasksClient gettasksclient, boolean z, boolean z2, int i, boolean z3, int i2) {
        if ((i2 & 1) != 0) {
            z = gettasksclient.AudioAttributesCompatParcelizer;
        }
        if ((i2 & 2) != 0) {
            z2 = gettasksclient.RemoteActionCompatParcelizer;
        }
        if ((i2 & 4) != 0) {
            i = gettasksclient.write;
        }
        if ((i2 & 8) != 0) {
            z3 = gettasksclient.IconCompatParcelizer;
        }
        return AudioAttributesCompatParcelizer(z, z2, i, z3);
    }

    private static getTasksClient AudioAttributesCompatParcelizer(boolean z, boolean z2, int i, boolean z3) {
        return new getTasksClient(z, z2, i, z3);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof getTasksClient)) {
            return false;
        }
        getTasksClient gettasksclient = (getTasksClient) other;
        return this.AudioAttributesCompatParcelizer == gettasksclient.AudioAttributesCompatParcelizer && this.RemoteActionCompatParcelizer == gettasksclient.RemoteActionCompatParcelizer && this.write == gettasksclient.write && this.IconCompatParcelizer == gettasksclient.IconCompatParcelizer;
    }

    public final int hashCode() {
        return (((((Boolean.hashCode(this.AudioAttributesCompatParcelizer) * 31) + Boolean.hashCode(this.RemoteActionCompatParcelizer)) * 31) + Integer.hashCode(this.write)) * 31) + Boolean.hashCode(this.IconCompatParcelizer);
    }

    public final String toString() {
        boolean z = this.AudioAttributesCompatParcelizer;
        boolean z2 = this.RemoteActionCompatParcelizer;
        int i = this.write;
        boolean z3 = this.IconCompatParcelizer;
        StringBuilder sb = new StringBuilder("VideoListUIState(isInternModeBannerVisible=");
        sb.append(z);
        sb.append(", isAuthorDescriptionExpanded=");
        sb.append(z2);
        sb.append(", selectedIndexPosition=");
        sb.append(i);
        sb.append(", isBackPressed=");
        sb.append(z3);
        sb.append(")");
        return sb.toString();
    }
}
