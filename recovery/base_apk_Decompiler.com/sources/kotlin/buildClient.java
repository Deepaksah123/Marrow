package kotlin;

import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002¢\u0006\u0004\b\t\u0010\nJ:\u0010\u000b\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00022\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u000b\u0010\u0018R \u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00070\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u0015\u0010\u0018"}, d2 = {"Lo/buildClient;", "", "", "", "p0", "Lo/AuthProxyOptions;", "p1", "Lo/putInt;", "p2", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "write", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;)Lo/buildClient;", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "IconCompatParcelizer", "Ljava/util/List;", "AudioAttributesCompatParcelizer", "()Ljava/util/List;", "read", "RemoteActionCompatParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class buildClient {

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final List<Integer> read;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final List<putInt> IconCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final List<AuthProxyOptions> AudioAttributesCompatParcelizer;

    private buildClient(List<Integer> list, List<AuthProxyOptions> list2, List<putInt> list3) {
        toMagicModuleMetaRepoModel.write(list, "");
        toMagicModuleMetaRepoModel.write(list2, "");
        toMagicModuleMetaRepoModel.write(list3, "");
        this.read = list;
        this.AudioAttributesCompatParcelizer = list2;
        this.IconCompatParcelizer = list3;
    }

    public /* synthetic */ buildClient(List list, List list2, List list3, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i & 1) != 0 ? IntermediateLoginResponseBody.RemoteActionCompatParcelizer() : list, (i & 2) != 0 ? IntermediateLoginResponseBody.RemoteActionCompatParcelizer() : list2, (i & 4) != 0 ? IntermediateLoginResponseBody.RemoteActionCompatParcelizer() : list3);
    }

    public final List<Integer> AudioAttributesCompatParcelizer() {
        return this.read;
    }

    public final List<AuthProxyOptions> write() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final List<putInt> IconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public buildClient() {
        this(null, null, null, 7, null);
    }

    public static buildClient write(List<Integer> p0, List<AuthProxyOptions> p1, List<putInt> p2) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        toMagicModuleMetaRepoModel.write(p2, "");
        return new buildClient(p0, p1, p2);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof buildClient)) {
            return false;
        }
        buildClient buildclient = (buildClient) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.read, buildclient.read) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, buildclient.AudioAttributesCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.IconCompatParcelizer, buildclient.IconCompatParcelizer);
    }

    public final int hashCode() {
        return (((this.read.hashCode() * 31) + this.AudioAttributesCompatParcelizer.hashCode()) * 31) + this.IconCompatParcelizer.hashCode();
    }

    public final String toString() {
        List<Integer> list = this.read;
        List<AuthProxyOptions> list2 = this.AudioAttributesCompatParcelizer;
        List<putInt> list3 = this.IconCompatParcelizer;
        StringBuilder sb = new StringBuilder("buildClient(read=");
        sb.append(list);
        sb.append(", AudioAttributesCompatParcelizer=");
        sb.append(list2);
        sb.append(", IconCompatParcelizer=");
        sb.append(list3);
        sb.append(")");
        return sb.toString();
    }
}
