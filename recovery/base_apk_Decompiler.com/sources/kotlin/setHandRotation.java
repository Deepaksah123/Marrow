package kotlin;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ/\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012R\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0012R\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0012"}, d2 = {"Lo/setHandRotation;", "Landroidx/recyclerview/widget/RecyclerView$AudioAttributesImplBaseParcelizer;", "", "p0", "p1", "p2", "p3", "p4", "<init>", "(IIIII)V", "Landroid/graphics/Rect;", "Landroid/view/View;", "Landroidx/recyclerview/widget/RecyclerView;", "Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;", "", "IconCompatParcelizer", "(Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;)V", "read", "I", "AudioAttributesCompatParcelizer", "write", "RemoteActionCompatParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class setHandRotation extends RecyclerView.AudioAttributesImplBaseParcelizer {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final int write;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final int RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final int IconCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final int AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final int read;

    private setHandRotation(int i, int i2, int i3, int i4, int i5) {
        this.AudioAttributesCompatParcelizer = i;
        this.write = i2;
        this.IconCompatParcelizer = i3;
        this.read = i4;
        this.RemoteActionCompatParcelizer = i5;
    }

    public /* synthetic */ setHandRotation(int i, int i2, int i3, int i4, int i5, int i6, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i6 & 1) != 0 ? 0 : i, (i6 & 2) != 0 ? 0 : i2, (i6 & 4) != 0 ? 0 : i3, (i6 & 8) != 0 ? 0 : i4, (i6 & 16) != 0 ? 0 : i5);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AudioAttributesImplBaseParcelizer
    public final void IconCompatParcelizer(Rect p0, View p1, RecyclerView p2, RecyclerView.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver p3) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        toMagicModuleMetaRepoModel.write(p2, "");
        toMagicModuleMetaRepoModel.write(p3, "");
        int iMediaBrowserCompatItemReceiver = RecyclerView.MediaBrowserCompatItemReceiver(p1);
        if (iMediaBrowserCompatItemReceiver == -1) {
            return;
        }
        RecyclerView.IconCompatParcelizer IconCompatParcelizer = p2.IconCompatParcelizer();
        if (IconCompatParcelizer != null && IconCompatParcelizer.getItemViewType(iMediaBrowserCompatItemReceiver) == 10) {
            p0.left = -p2.getPaddingLeft();
            p0.right = -p2.getPaddingRight();
            p0.top = this.AudioAttributesCompatParcelizer;
            p0.bottom = this.write;
            return;
        }
        p0.left = this.IconCompatParcelizer;
        p0.right = this.read;
        p0.top = iMediaBrowserCompatItemReceiver == 0 ? this.RemoteActionCompatParcelizer : this.AudioAttributesCompatParcelizer;
        p0.bottom = this.write;
    }

    public setHandRotation() {
        this(0, 0, 0, 0, 0, 31, null);
    }
}
