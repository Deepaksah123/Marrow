package kotlin;

import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ6\u0010\f\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0017\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\f\u0010\u0015\u001a\u0004\b\u0016\u0010\u0014R\u001a\u0010\u001a\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u0012R\u001a\u0010\u0018\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0019\u001a\u0004\b\u0017\u0010\u0012R \u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u001b\u001a\u0004\b\u0018\u0010\u001c"}, d2 = {"Lo/getApplicationLabelAndIcon;", "", "", "p0", "", "p1", "p2", "", "Lo/PackageManagerWrapper;", "p3", "<init>", "(Ljava/lang/String;IILjava/util/List;)V", "IconCompatParcelizer", "(Ljava/lang/String;IILjava/util/List;)Lo/getApplicationLabelAndIcon;", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Ljava/lang/String;", "write", "read", "RemoteActionCompatParcelizer", "I", "AudioAttributesCompatParcelizer", "Ljava/util/List;", "()Ljava/util/List;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class getApplicationLabelAndIcon {

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final String read;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final int AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final List<PackageManagerWrapper> IconCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final int RemoteActionCompatParcelizer;

    private getApplicationLabelAndIcon(String str, int i, int i2, List<PackageManagerWrapper> list) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(list, "");
        this.read = str;
        this.AudioAttributesCompatParcelizer = i;
        this.RemoteActionCompatParcelizer = i2;
        this.IconCompatParcelizer = list;
    }

    public /* synthetic */ getApplicationLabelAndIcon(String str, int i, int i2, List list, int i3, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? 0 : i, (i3 & 4) != 0 ? 0 : i2, (i3 & 8) != 0 ? IntermediateLoginResponseBody.RemoteActionCompatParcelizer() : list);
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final String getRead() {
        return this.read;
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final int getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final int getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public final List<PackageManagerWrapper> RemoteActionCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public getApplicationLabelAndIcon() {
        this(null, 0, 0, null, 15, null);
    }

    public static getApplicationLabelAndIcon IconCompatParcelizer(String p0, int p1, int p2, List<PackageManagerWrapper> p3) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p3, "");
        return new getApplicationLabelAndIcon(p0, p1, p2, p3);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof getApplicationLabelAndIcon)) {
            return false;
        }
        getApplicationLabelAndIcon getapplicationlabelandicon = (getApplicationLabelAndIcon) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.read, (Object) getapplicationlabelandicon.read) && this.AudioAttributesCompatParcelizer == getapplicationlabelandicon.AudioAttributesCompatParcelizer && this.RemoteActionCompatParcelizer == getapplicationlabelandicon.RemoteActionCompatParcelizer && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.IconCompatParcelizer, getapplicationlabelandicon.IconCompatParcelizer);
    }

    public final int hashCode() {
        return (((((this.read.hashCode() * 31) + Integer.hashCode(this.AudioAttributesCompatParcelizer)) * 31) + Integer.hashCode(this.RemoteActionCompatParcelizer)) * 31) + this.IconCompatParcelizer.hashCode();
    }

    public final String toString() {
        String str = this.read;
        int i = this.AudioAttributesCompatParcelizer;
        int i2 = this.RemoteActionCompatParcelizer;
        List<PackageManagerWrapper> list = this.IconCompatParcelizer;
        StringBuilder sb = new StringBuilder("getApplicationLabelAndIcon(read=");
        sb.append(str);
        sb.append(", AudioAttributesCompatParcelizer=");
        sb.append(i);
        sb.append(", RemoteActionCompatParcelizer=");
        sb.append(i2);
        sb.append(", IconCompatParcelizer=");
        sb.append(list);
        sb.append(")");
        return sb.toString();
    }
}
