package com.marrow.ui.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B+\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u0004\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ+\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\b2\n\u0010\u0007\u001a\u00060\u0010R\u00020\f2\u0006\u0010\t\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\u0014H\u0014¢\u0006\u0004\b\u0012\u0010\u0015R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u0086\f¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018"}, d2 = {"Lcom/marrow/ui/views/ZoomableLinearLayoutManager;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "Landroid/content/Context;", "p0", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "p1", "", "p2", "p3", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "Landroidx/recyclerview/widget/RecyclerView;", "", "AudioAttributesCompatParcelizer", "(Landroidx/recyclerview/widget/RecyclerView;)V", "Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;", "Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;", "RemoteActionCompatParcelizer", "(ILandroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;)I", "", "(Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;[I)V", "Lcom/marrow/ui/views/ZoomableRecyclerView;", "IconCompatParcelizer", "Lcom/marrow/ui/views/ZoomableRecyclerView;", "write"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ZoomableLinearLayoutManager extends LinearLayoutManager {

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    public ZoomableRecyclerView write;

    public ZoomableLinearLayoutManager(Context context) {
        toMagicModuleMetaRepoModel.write(context, "");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ZoomableLinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        toMagicModuleMetaRepoModel.write(context, "");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.MediaBrowserCompatItemReceiver
    public final void AudioAttributesCompatParcelizer(RecyclerView p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        super.AudioAttributesCompatParcelizer(p0);
        if (p0 instanceof ZoomableRecyclerView) {
            this.write = (ZoomableRecyclerView) p0;
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.MediaBrowserCompatItemReceiver
    public final int RemoteActionCompatParcelizer(int p0, RecyclerView.MediaDescriptionCompat p1, RecyclerView.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver p2) {
        toMagicModuleMetaRepoModel.write(p1, "");
        toMagicModuleMetaRepoModel.write(p2, "");
        ZoomableRecyclerView zoomableRecyclerView = this.write;
        if (zoomableRecyclerView != null) {
            p0 = zoomableRecyclerView.RatingCompat(p0);
        }
        return super.RemoteActionCompatParcelizer(p0, p1, p2);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void RemoteActionCompatParcelizer(RecyclerView.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver p0, int[] p1) {
        RecyclerView.onMediaButtonEvent onmediabuttoneventIconCompatParcelizer;
        View view;
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        ZoomableRecyclerView zoomableRecyclerView = this.write;
        if (zoomableRecyclerView == null) {
            return;
        }
        int height = (zoomableRecyclerView.getMediaBrowserCompatItemReceiver() <= 1.0f || (onmediabuttoneventIconCompatParcelizer = zoomableRecyclerView.IconCompatParcelizer(MediaBrowserCompatItemReceiver())) == null || (view = onmediabuttoneventIconCompatParcelizer.itemView) == null) ? 0 : view.getHeight();
        p1[0] = height;
        p1[1] = height;
    }
}
