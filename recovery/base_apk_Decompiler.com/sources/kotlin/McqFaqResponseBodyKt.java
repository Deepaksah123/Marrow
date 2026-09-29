package kotlin;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u001b\u0010\u0012\u001a\u00020\r8WX\u0097\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011"}, d2 = {"Lo/McqFaqResponseBodyKt;", "Landroidx/fragment/app/Fragment;", "Lo/transformToVMModel;", "", "p0", "<init>", "(I)V", "Landroid/view/View;", "Landroid/os/Bundle;", "p1", "", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Lo/RecentUpdatesFilterResponse;", "read", "Lo/RenewEligible;", "IconCompatParcelizer", "()Lo/RecentUpdatesFilterResponse;", "write"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class McqFaqResponseBodyKt extends Fragment implements transformToVMModel {

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final RenewEligible write;

    public /* synthetic */ McqFaqResponseBodyKt(int i, int i2, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i2 & 1) != 0 ? 0 : i);
    }

    private McqFaqResponseBodyKt(int i) {
        super(i);
        this.write = MagicModuleMetaUCData.IconCompatParcelizer(this, true);
    }

    @Override // kotlin.transformToVMModel
    public final RecentUpdatesFilterResponse IconCompatParcelizer() {
        return (RecentUpdatesFilterResponse) this.write.RemoteActionCompatParcelizer();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View p0, Bundle p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        super.onViewCreated(p0, p1);
        if (IconCompatParcelizer() == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
    }

    public McqFaqResponseBodyKt() {
        this(0, 1, null);
    }
}
