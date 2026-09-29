package kotlin;

import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ(\u0010\t\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0012R \u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019"}, d2 = {"Lo/SupportStreetViewPanoramaFragmentzza;", "", "", "p0", "", "Lo/isMapToolbarEnabled;", "p1", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "IconCompatParcelizer", "(Ljava/lang/String;Ljava/util/List;)Lo/SupportStreetViewPanoramaFragmentzza;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "read", "Ljava/lang/String;", "write", "RemoteActionCompatParcelizer", "Ljava/util/List;", "AudioAttributesCompatParcelizer", "()Ljava/util/List;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SupportStreetViewPanoramaFragmentzza {

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final List<isMapToolbarEnabled> write;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final String RemoteActionCompatParcelizer;

    private SupportStreetViewPanoramaFragmentzza(String str, List<isMapToolbarEnabled> list) {
        toMagicModuleMetaRepoModel.write(list, "");
        this.RemoteActionCompatParcelizer = str;
        this.write = list;
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final String getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public /* synthetic */ SupportStreetViewPanoramaFragmentzza(String str, List list, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? IntermediateLoginResponseBody.RemoteActionCompatParcelizer() : list);
    }

    public final List<isMapToolbarEnabled> AudioAttributesCompatParcelizer() {
        return this.write;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SupportStreetViewPanoramaFragmentzza() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static SupportStreetViewPanoramaFragmentzza IconCompatParcelizer(String p0, List<isMapToolbarEnabled> p1) {
        toMagicModuleMetaRepoModel.write(p1, "");
        return new SupportStreetViewPanoramaFragmentzza(p0, p1);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof SupportStreetViewPanoramaFragmentzza)) {
            return false;
        }
        SupportStreetViewPanoramaFragmentzza supportStreetViewPanoramaFragmentzza = (SupportStreetViewPanoramaFragmentzza) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.RemoteActionCompatParcelizer, (Object) supportStreetViewPanoramaFragmentzza.RemoteActionCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.write, supportStreetViewPanoramaFragmentzza.write);
    }

    public final int hashCode() {
        String str = this.RemoteActionCompatParcelizer;
        return ((str == null ? 0 : str.hashCode()) * 31) + this.write.hashCode();
    }

    public final String toString() {
        String str = this.RemoteActionCompatParcelizer;
        List<isMapToolbarEnabled> list = this.write;
        StringBuilder sb = new StringBuilder("SupportStreetViewPanoramaFragmentzza(RemoteActionCompatParcelizer=");
        sb.append(str);
        sb.append(", write=");
        sb.append(list);
        sb.append(")");
        return sb.toString();
    }
}
