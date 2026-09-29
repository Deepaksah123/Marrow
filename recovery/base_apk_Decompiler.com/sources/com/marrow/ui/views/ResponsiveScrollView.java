package com.marrow.ui.views;

import android.content.Context;
import android.util.AttributeSet;
import androidx.core.widget.NestedScrollView;
import com.marrow.ui.views.ResponsiveScrollView;
import kotlin.MagicModuleRepositoryImplExternalSyntheticLambda0;
import kotlin.Metadata;
import kotlin.buildResolutionString;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0002\u0019\u0017B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\fJ/\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0017\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001a\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001dR\u0014\u0010\u000b\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 "}, d2 = {"Lcom/marrow/ui/views/ResponsiveScrollView;", "Landroidx/core/widget/NestedScrollView;", "Landroid/content/Context;", "p0", "Landroid/util/AttributeSet;", "p1", "", "p2", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "AudioAttributesCompatParcelizer", "(I)V", "p3", "onScrollChanged", "(IIII)V", "Lcom/marrow/ui/views/ResponsiveScrollView$read;", "setScrollEndListener", "(Lcom/marrow/ui/views/ResponsiveScrollView$read;)V", "Lcom/marrow/ui/views/ResponsiveScrollView$RemoteActionCompatParcelizer;", "setScrollStartListener", "(Lcom/marrow/ui/views/ResponsiveScrollView$RemoteActionCompatParcelizer;)V", "", "RemoteActionCompatParcelizer", "Z", "read", "write", "IconCompatParcelizer", "Lcom/marrow/ui/views/ResponsiveScrollView$read;", "Lcom/marrow/ui/views/ResponsiveScrollView$RemoteActionCompatParcelizer;", "Ljava/lang/Runnable;", "MediaBrowserCompatCustomActionResultReceiver", "Ljava/lang/Runnable;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ResponsiveScrollView extends NestedScrollView {

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private read read;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private final Runnable AudioAttributesCompatParcelizer;
    private boolean RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private boolean write;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private RemoteActionCompatParcelizer IconCompatParcelizer;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\bf\u0018\u00002\u00020\u0001À\u0006\u0003"}, d2 = {"Lcom/marrow/ui/views/ResponsiveScrollView$RemoteActionCompatParcelizer;", ""}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface RemoteActionCompatParcelizer {
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\bf\u0018\u00002\u00020\u0001À\u0006\u0003"}, d2 = {"Lcom/marrow/ui/views/ResponsiveScrollView$read;", ""}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface read {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ResponsiveScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        toMagicModuleMetaRepoModel.write(context, "");
        this.AudioAttributesCompatParcelizer = new Runnable() { // from class: o.stopScrubbing
            @Override // java.lang.Runnable
            public final void run() {
                ResponsiveScrollView.RemoteActionCompatParcelizer(this.read);
            }
        };
    }

    public /* synthetic */ ResponsiveScrollView(Context context, AttributeSet attributeSet, int i, int i2, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void RemoteActionCompatParcelizer(ResponsiveScrollView responsiveScrollView) {
        responsiveScrollView.write = false;
        buildResolutionString.read(responsiveScrollView.getClass(), "ScrollEnded");
        read readVar = responsiveScrollView.read;
    }

    @Override // androidx.core.widget.NestedScrollView
    public final void AudioAttributesCompatParcelizer(int p0) {
        super.AudioAttributesCompatParcelizer(p0);
        this.RemoteActionCompatParcelizer = true;
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.View
    public final void onScrollChanged(int p0, int p1, int p2, int p3) {
        super.onScrollChanged(p0, p1, p2, p3);
        if (this.RemoteActionCompatParcelizer) {
            int i = p1 - p3;
            if (Math.abs(i) > 10) {
                if (!this.write) {
                    this.write = true;
                    Class<?> cls = getClass();
                    StringBuilder sb = new StringBuilder("ScrollStarted ");
                    sb.append(p0);
                    sb.append(", ");
                    sb.append(p1);
                    sb.append(", ");
                    sb.append(p2);
                    sb.append(", ");
                    sb.append(p3);
                    buildResolutionString.read(cls, sb.toString());
                }
                removeCallbacks(this.AudioAttributesCompatParcelizer);
                postDelayed(this.AudioAttributesCompatParcelizer, 300L);
            }
            if (Math.abs(i) < 2 || p1 >= getMeasuredHeight() || p1 == 0) {
                this.RemoteActionCompatParcelizer = false;
            }
        }
    }

    public final void setScrollEndListener(read p0) {
        this.read = p0;
    }

    public final void setScrollStartListener(RemoteActionCompatParcelizer p0) {
        this.IconCompatParcelizer = p0;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ResponsiveScrollView(Context context) {
        this(context, null, 0, 6, null);
        toMagicModuleMetaRepoModel.write(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ResponsiveScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        toMagicModuleMetaRepoModel.write(context, "");
    }
}
