package kotlin;

import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J7\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00032\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0019\u001a\u00020\bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\f¨\u0006\u001a"}, d2 = {"Lcom/marrow2/ui/feedback/models/FeedbackUiState;", "", "isFiveStarView", "", "rating", "", "selectedTags", "", "", "isSubmitButtonEnabled", "<init>", "(ZILjava/util/List;Z)V", "()Z", "getRating", "()I", "getSelectedTags", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class startResolutionForResult {
    private final int AudioAttributesCompatParcelizer;
    private final boolean RemoteActionCompatParcelizer;
    private final List<String> read;
    private final boolean write;

    private startResolutionForResult(boolean z, int i, List<String> list, boolean z2) {
        toMagicModuleMetaRepoModel.write(list, "");
        this.write = z;
        this.AudioAttributesCompatParcelizer = i;
        this.read = list;
        this.RemoteActionCompatParcelizer = z2;
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final boolean getWrite() {
        return this.write;
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final int getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public /* synthetic */ startResolutionForResult(boolean z, int i, List list, boolean z2, int i2, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? IntermediateLoginResponseBody.RemoteActionCompatParcelizer() : list, (i2 & 8) != 0 ? false : z2);
    }

    public final List<String> write() {
        return this.read;
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final boolean getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public startResolutionForResult() {
        this(false, 0, null, false, 15, null);
    }

    public static /* synthetic */ startResolutionForResult write(startResolutionForResult startresolutionforresult, boolean z, int i, List list, boolean z2, int i2) {
        if ((i2 & 1) != 0) {
            z = startresolutionforresult.write;
        }
        if ((i2 & 2) != 0) {
            i = startresolutionforresult.AudioAttributesCompatParcelizer;
        }
        if ((i2 & 4) != 0) {
            list = startresolutionforresult.read;
        }
        if ((i2 & 8) != 0) {
            z2 = startresolutionforresult.RemoteActionCompatParcelizer;
        }
        return read(z, i, list, z2);
    }

    private static startResolutionForResult read(boolean z, int i, List<String> list, boolean z2) {
        toMagicModuleMetaRepoModel.write(list, "");
        return new startResolutionForResult(z, i, list, z2);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof startResolutionForResult)) {
            return false;
        }
        startResolutionForResult startresolutionforresult = (startResolutionForResult) other;
        return this.write == startresolutionforresult.write && this.AudioAttributesCompatParcelizer == startresolutionforresult.AudioAttributesCompatParcelizer && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.read, startresolutionforresult.read) && this.RemoteActionCompatParcelizer == startresolutionforresult.RemoteActionCompatParcelizer;
    }

    public final int hashCode() {
        return (((((Boolean.hashCode(this.write) * 31) + Integer.hashCode(this.AudioAttributesCompatParcelizer)) * 31) + this.read.hashCode()) * 31) + Boolean.hashCode(this.RemoteActionCompatParcelizer);
    }

    public final String toString() {
        boolean z = this.write;
        int i = this.AudioAttributesCompatParcelizer;
        List<String> list = this.read;
        boolean z2 = this.RemoteActionCompatParcelizer;
        StringBuilder sb = new StringBuilder("FeedbackUiState(isFiveStarView=");
        sb.append(z);
        sb.append(", rating=");
        sb.append(i);
        sb.append(", selectedTags=");
        sb.append(list);
        sb.append(", isSubmitButtonEnabled=");
        sb.append(z2);
        sb.append(")");
        return sb.toString();
    }
}
