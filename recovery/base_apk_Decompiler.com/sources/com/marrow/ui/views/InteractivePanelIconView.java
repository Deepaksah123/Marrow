package com.marrow.ui.views;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
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
import kotlin.dispatchTouchEvent;
import kotlin.getCreatedOnDateMs;
import kotlin.getShowPopup;
import kotlin.setAllowChunklessPreparation;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\f\u001a\u00020\u000b2\u000e\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/marrow/ui/views/InteractivePanelIconView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "p0", "Landroid/util/AttributeSet;", "p1", "", "p2", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lkotlin/Function0;", "", "IconCompatParcelizer", "(Lo/getCreatedOnDateMs;)V", "Lo/setAllowChunklessPreparation;", "read", "Lo/setAllowChunklessPreparation;", "AudioAttributesCompatParcelizer", "RemoteActionCompatParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class InteractivePanelIconView extends FrameLayout {

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final setAllowChunklessPreparation AudioAttributesCompatParcelizer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InteractivePanelIconView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        toMagicModuleMetaRepoModel.write(context, "");
        setAllowChunklessPreparation setallowchunklesspreparationIconCompatParcelizer = setAllowChunklessPreparation.IconCompatParcelizer(LayoutInflater.from(context), this);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(setallowchunklesspreparationIconCompatParcelizer, "");
        this.AudioAttributesCompatParcelizer = setallowchunklesspreparationIconCompatParcelizer;
        setallowchunklesspreparationIconCompatParcelizer.IconCompatParcelizer.setImageDrawable(context.getDrawable(R.drawable.ic_skip));
        setallowchunklesspreparationIconCompatParcelizer.write.setTranslationX(setallowchunklesspreparationIconCompatParcelizer.write.getLayoutParams().width);
    }

    public /* synthetic */ InteractivePanelIconView(Context context, AttributeSet attributeSet, int i, int i2, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public final void IconCompatParcelizer(getCreatedOnDateMs<getShowPopup> p0) {
        Context context = getContext();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(context, "");
        dispatchTouchEvent.RemoteActionCompatParcelizer(context, 100L);
        float width = this.AudioAttributesCompatParcelizer.write.getWidth();
        this.AudioAttributesCompatParcelizer.write.setBackgroundResource(R.drawable.gradient_grey);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.AudioAttributesCompatParcelizer.write, (Property<View, Float>) View.TRANSLATION_X, width, BitmapDescriptorFactory.HUE_RED);
        objectAnimatorOfFloat.setDuration(100L);
        objectAnimatorOfFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.AudioAttributesCompatParcelizer.write, (Property<View, Float>) View.TRANSLATION_X, BitmapDescriptorFactory.HUE_RED, width);
        objectAnimatorOfFloat2.setDuration(100L);
        objectAnimatorOfFloat2.setInterpolator(new AccelerateDecelerateInterpolator());
        objectAnimatorOfFloat2.setStartDelay(50L);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(objectAnimatorOfFloat, objectAnimatorOfFloat2);
        animatorSet.addListener(new write(p0));
        animatorSet.start();
    }

    public static final class write extends AnimatorListenerAdapter {
        private /* synthetic */ getCreatedOnDateMs<getShowPopup> IconCompatParcelizer;

        write(getCreatedOnDateMs<getShowPopup> getcreatedondatems) {
            this.IconCompatParcelizer = getcreatedondatems;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            toMagicModuleMetaRepoModel.write(animator, "");
            getCreatedOnDateMs<getShowPopup> getcreatedondatems = this.IconCompatParcelizer;
            if (getcreatedondatems != null) {
                getcreatedondatems.invoke();
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InteractivePanelIconView(Context context) {
        this(context, null, 0, 6, null);
        toMagicModuleMetaRepoModel.write(context, "");
    }

    /* JADX INFO: renamed from: com.marrow.ui.views.InteractivePanelIconView$RemoteActionCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/marrow/ui/views/InteractivePanelIconView$RemoteActionCompatParcelizer;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "Landroid/view/View$OnClickListener;", "p1", "Lcom/marrow/ui/views/InteractivePanelIconView;", "write", "(Landroid/content/Context;Landroid/view/View$OnClickListener;)Lcom/marrow/ui/views/InteractivePanelIconView;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static InteractivePanelIconView write(Context p0, View.OnClickListener p1) {
            toMagicModuleMetaRepoModel.write(p0, "");
            InteractivePanelIconView interactivePanelIconView = new InteractivePanelIconView(p0, null, 0, 6, null);
            interactivePanelIconView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            interactivePanelIconView.setTag(-1);
            if (p1 != null) {
                interactivePanelIconView.setOnClickListener(p1);
            }
            return interactivePanelIconView;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InteractivePanelIconView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        toMagicModuleMetaRepoModel.write(context, "");
    }
}
