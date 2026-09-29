package kotlin;

import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0012\b\u0002\u0010\u0004\u001a\f\u0012\b\u0012\u00060\u0006j\u0002`\u00070\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u0013\u001a\f\u0012\b\u0012\u00060\u0006j\u0002`\u00070\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\tHÆ\u0003J1\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0012\b\u0002\u0010\u0004\u001a\f\u0012\b\u0012\u00060\u0006j\u0002`\u00070\u00052\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0004\u001a\f\u0012\b\u0012\u00060\u0006j\u0002`\u00070\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001c"}, d2 = {"Lcom/marrow2/data/magic_module/MagicModuleTimelineUIModel;", "", "totalSolvedModules", "", "timelines", "", "Lcom/marrow2/data/magic_module/MagicModuleTimeline;", "Lcom/marrow2/data/magic_module/MagicModule;", "upcomingModuleStatus", "Lcom/marrow2/data/magic_module/UpcomingModuleStatus;", "<init>", "(ILjava/util/List;Lcom/marrow2/data/magic_module/UpcomingModuleStatus;)V", "getTotalSolvedModules", "()I", "getTimelines", "()Ljava/util/List;", "getUpcomingModuleStatus", "()Lcom/marrow2/data/magic_module/UpcomingModuleStatus;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class setNoBytesRemainingAndMaybeStoreLength {
    private final shouldIgnoreCacheForRequest RemoteActionCompatParcelizer;
    private final int read;
    private final List<notifyCacheIgnored> write;

    public setNoBytesRemainingAndMaybeStoreLength(int i, List<notifyCacheIgnored> list, shouldIgnoreCacheForRequest shouldignorecacheforrequest) {
        toMagicModuleMetaRepoModel.write(list, "");
        toMagicModuleMetaRepoModel.write(shouldignorecacheforrequest, "");
        this.read = i;
        this.write = list;
        this.RemoteActionCompatParcelizer = shouldignorecacheforrequest;
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final int getRead() {
        return this.read;
    }

    public /* synthetic */ setNoBytesRemainingAndMaybeStoreLength(int i, List list, shouldIgnoreCacheForRequest shouldignorecacheforrequest, int i2, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? IntermediateLoginResponseBody.RemoteActionCompatParcelizer() : list, (i2 & 4) != 0 ? shouldIgnoreCacheForRequest.AudioAttributesCompatParcelizer : shouldignorecacheforrequest);
    }

    public final List<notifyCacheIgnored> read() {
        return this.write;
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final shouldIgnoreCacheForRequest getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public setNoBytesRemainingAndMaybeStoreLength() {
        this(0, null, null, 7, null);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof setNoBytesRemainingAndMaybeStoreLength)) {
            return false;
        }
        setNoBytesRemainingAndMaybeStoreLength setnobytesremainingandmaybestorelength = (setNoBytesRemainingAndMaybeStoreLength) other;
        return this.read == setnobytesremainingandmaybestorelength.read && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.write, setnobytesremainingandmaybestorelength.write) && this.RemoteActionCompatParcelizer == setnobytesremainingandmaybestorelength.RemoteActionCompatParcelizer;
    }

    public final int hashCode() {
        return (((Integer.hashCode(this.read) * 31) + this.write.hashCode()) * 31) + this.RemoteActionCompatParcelizer.hashCode();
    }

    public final String toString() {
        int i = this.read;
        List<notifyCacheIgnored> list = this.write;
        shouldIgnoreCacheForRequest shouldignorecacheforrequest = this.RemoteActionCompatParcelizer;
        StringBuilder sb = new StringBuilder("MagicModuleTimelineUIModel(totalSolvedModules=");
        sb.append(i);
        sb.append(", timelines=");
        sb.append(list);
        sb.append(", upcomingModuleStatus=");
        sb.append(shouldignorecacheforrequest);
        sb.append(")");
        return sb.toString();
    }
}
