package com.marrow.ui.views;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Property;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow.R;
import kotlin.MagicModuleRepositoryImplExternalSyntheticLambda0;
import kotlin.Metadata;
import kotlin.setElapsedRealTimeOffsetMs;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\f¢\u0006\u0004\b\u0010\u0010\u000fJ\r\u0010\u0011\u001a\u00020\r¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0013\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0015"}, d2 = {"Lcom/marrow/ui/views/InteractivePanelTextView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "p0", "Landroid/util/AttributeSet;", "p1", "", "p2", "", "p3", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;ILjava/lang/String;)V", "", "", "RemoteActionCompatParcelizer", "(Z)V", "AudioAttributesCompatParcelizer", "IconCompatParcelizer", "()V", "write", "Lo/setElapsedRealTimeOffsetMs;", "Lo/setElapsedRealTimeOffsetMs;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class InteractivePanelTextView extends FrameLayout {

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final setElapsedRealTimeOffsetMs write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private InteractivePanelTextView(Context context, AttributeSet attributeSet, int i, String str) {
        super(context, attributeSet, i);
        toMagicModuleMetaRepoModel.write(context, "");
        toMagicModuleMetaRepoModel.write(str, "");
        setElapsedRealTimeOffsetMs setelapsedrealtimeoffsetmsRemoteActionCompatParcelizer = setElapsedRealTimeOffsetMs.RemoteActionCompatParcelizer(LayoutInflater.from(context), this);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(setelapsedrealtimeoffsetmsRemoteActionCompatParcelizer, "");
        this.write = setelapsedrealtimeoffsetmsRemoteActionCompatParcelizer;
        setelapsedrealtimeoffsetmsRemoteActionCompatParcelizer.RemoteActionCompatParcelizer.setText(str);
        setelapsedrealtimeoffsetmsRemoteActionCompatParcelizer.write.setTranslationX(setelapsedrealtimeoffsetmsRemoteActionCompatParcelizer.write.getLayoutParams().width);
    }

    public /* synthetic */ InteractivePanelTextView(Context context, AttributeSet attributeSet, int i, String str, int i2, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? "" : str);
    }

    public final void RemoteActionCompatParcelizer(boolean p0) {
        this.write.read.setBackgroundResource(R.drawable.rounded_edge_rectangle_green);
        if (p0) {
            this.write.write.setBackgroundResource(R.drawable.gradient_green);
            write();
        }
    }

    public final void AudioAttributesCompatParcelizer(boolean p0) {
        this.write.read.setBackgroundResource(R.drawable.rounded_edge_rectangle_red);
        if (p0) {
            this.write.write.setBackgroundResource(R.drawable.gradient_red);
            write();
        }
    }

    public final void IconCompatParcelizer() {
        this.write.read.setBackgroundResource(R.drawable.rounded_edge_rectangle_grey);
    }

    private final void write() {
        float width = this.write.write.getWidth();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.write.write, (Property<View, Float>) View.TRANSLATION_X, width, BitmapDescriptorFactory.HUE_RED);
        objectAnimatorOfFloat.setDuration(700L);
        objectAnimatorOfFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.write.write, (Property<View, Float>) View.TRANSLATION_X, BitmapDescriptorFactory.HUE_RED, width);
        objectAnimatorOfFloat2.setDuration(1000L);
        objectAnimatorOfFloat2.setInterpolator(new AccelerateDecelerateInterpolator());
        objectAnimatorOfFloat2.setStartDelay(700L);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(objectAnimatorOfFloat, objectAnimatorOfFloat2);
        animatorSet.start();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InteractivePanelTextView(Context context) {
        this(context, null, 0, null, 14, null);
        toMagicModuleMetaRepoModel.write(context, "");
    }

    /* JADX INFO: renamed from: com.marrow.ui.views.InteractivePanelTextView$write, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/marrow/ui/views/InteractivePanelTextView$write;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "", "p1", "", "p2", "Landroid/view/View$OnClickListener;", "p3", "Lcom/marrow/ui/views/InteractivePanelTextView;", "read", "(Landroid/content/Context;Ljava/lang/String;ILandroid/view/View$OnClickListener;)Lcom/marrow/ui/views/InteractivePanelTextView;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static InteractivePanelTextView read(Context p0, String p1, int p2, View.OnClickListener p3) {
            toMagicModuleMetaRepoModel.write(p0, "");
            toMagicModuleMetaRepoModel.write(p1, "");
            InteractivePanelTextView interactivePanelTextView = new InteractivePanelTextView(p0, null, 0, p1, 6, null);
            interactivePanelTextView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            interactivePanelTextView.setTag(Integer.valueOf(p2));
            if (p3 != null) {
                interactivePanelTextView.setOnClickListener(p3);
            }
            return interactivePanelTextView;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InteractivePanelTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, null, 12, null);
        toMagicModuleMetaRepoModel.write(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InteractivePanelTextView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, null, 8, null);
        toMagicModuleMetaRepoModel.write(context, "");
    }
}
