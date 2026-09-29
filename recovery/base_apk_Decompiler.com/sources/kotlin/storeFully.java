package kotlin;

import com.marrow.data.models.pearl.Pearl;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class storeFully implements onRemove {
    private final getMediaPeriodPositionUsWithEndOfSourceHandling write;

    @setSdkPayload
    public storeFully(getMediaPeriodPositionUsWithEndOfSourceHandling getmediaperiodpositionuswithendofsourcehandling) {
        toMagicModuleMetaRepoModel.write(getmediaperiodpositionuswithendofsourcehandling, "");
        this.write = getmediaperiodpositionuswithendofsourcehandling;
    }

    @Override // kotlin.onRemove
    public final void write(List<? extends Pearl> list) {
        toMagicModuleMetaRepoModel.write(list, "");
        this.write.RemoteActionCompatParcelizer((Pearl[]) list.toArray(new Pearl[0]));
    }

    @Override // kotlin.onRemove
    public final void write() {
        this.write.read();
    }
}
