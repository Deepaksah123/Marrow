package kotlin;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.marrow.R;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ'\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017"}, d2 = {"Lo/CmcdHeadersFactoryCmcdObject;", "Landroidx/recyclerview/widget/RecyclerView$AudioAttributesImplBaseParcelizer;", "Landroid/content/Context;", "p0", "", "p1", "", "p2", "<init>", "(Landroid/content/Context;IZ)V", "Landroid/graphics/Canvas;", "Landroidx/recyclerview/widget/RecyclerView;", "Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;", "", "IconCompatParcelizer", "(Landroid/graphics/Canvas;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;)V", "AudioAttributesCompatParcelizer", "I", "RemoteActionCompatParcelizer", "Z", "read", "Landroid/graphics/drawable/Drawable;", "write", "Landroid/graphics/drawable/Drawable;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CmcdHeadersFactoryCmcdObject extends RecyclerView.AudioAttributesImplBaseParcelizer {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final int IconCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final boolean read;
    private final Drawable write;

    public CmcdHeadersFactoryCmcdObject(Context context, int i, boolean z) {
        toMagicModuleMetaRepoModel.write(context, "");
        this.IconCompatParcelizer = i;
        this.read = z;
        Drawable drawable = _isNaN.getDrawable(context, R.drawable.ic_divider);
        toMagicModuleMetaRepoModel.write(drawable);
        this.write = drawable;
    }

    public /* synthetic */ CmcdHeadersFactoryCmcdObject(Context context, int i, boolean z, int i2, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(context, i, (i2 & 4) != 0 ? false : z);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AudioAttributesImplBaseParcelizer
    public final void IconCompatParcelizer(Canvas p0, RecyclerView p1, RecyclerView.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver p2) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        toMagicModuleMetaRepoModel.write(p2, "");
        int i = this.IconCompatParcelizer;
        int width = p1.getWidth();
        int i2 = this.IconCompatParcelizer;
        RecyclerView.IconCompatParcelizer IconCompatParcelizer = p1.IconCompatParcelizer();
        int itemCount = IconCompatParcelizer != null ? IconCompatParcelizer.getItemCount() : 0;
        int childCount = p1.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = p1.getChildAt(i3);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(childAt, "");
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            toMagicModuleMetaRepoModel.read(layoutParams, "");
            RecyclerView.LayoutParams layoutParams2 = (RecyclerView.LayoutParams) layoutParams;
            int iMediaBrowserCompatItemReceiver = RecyclerView.MediaBrowserCompatItemReceiver(childAt);
            if (!this.read || iMediaBrowserCompatItemReceiver != itemCount - 1) {
                int bottom = childAt.getBottom() + ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin;
                this.write.setBounds(i, bottom, width - i2, this.write.getIntrinsicHeight() + bottom);
                this.write.draw(p0);
            }
        }
    }
}
