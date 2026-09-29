package com.marrow.ui.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RatingBar;
import com.marrow.R;
import com.marrow.ui.views.LottieRatingBar;
import kotlin.Metadata;
import kotlin.PlayerControlViewExternalSyntheticLambda1;
import kotlin.onDraw;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bB#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\r\u0010\u0005J\u0015\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\r\u0010\u0011J\u001f\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0011J\u0015\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0016\u0010\u0017R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001b\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u001aR$\u0010\u001f\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\t8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u000f"}, d2 = {"Lcom/marrow/ui/views/LottieRatingBar;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "p0", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "p1", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "p2", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "write", "setRatingParticular", "(I)V", "", "(IZ)V", "IconCompatParcelizer", "setRatingChangeAllowed", "(Z)V", "Landroid/widget/RatingBar$OnRatingBarChangeListener;", "setOnRatingBarChangedListener", "(Landroid/widget/RatingBar$OnRatingBarChangeListener;)V", "AudioAttributesCompatParcelizer", "Landroid/widget/RatingBar$OnRatingBarChangeListener;", "Z", "RemoteActionCompatParcelizer", "getRating", "()I", "setRating", "rating"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class LottieRatingBar extends LinearLayout {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private RatingBar.OnRatingBarChangeListener write;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private boolean RemoteActionCompatParcelizer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LottieRatingBar(Context context) {
        super(context);
        toMagicModuleMetaRepoModel.write(context, "");
        this.RemoteActionCompatParcelizer = true;
        write(context);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LottieRatingBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        toMagicModuleMetaRepoModel.write(context, "");
        this.RemoteActionCompatParcelizer = true;
        write(context);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LottieRatingBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        toMagicModuleMetaRepoModel.write(context, "");
        this.RemoteActionCompatParcelizer = true;
        write(context);
    }

    private final void write(Context p0) {
        LayoutInflater.from(p0).inflate(R.layout.custom_lottie_rating_bar, (ViewGroup) this, true);
        int childCount = getChildCount();
        int i = 0;
        while (i < childCount) {
            final int i2 = i + 1;
            getChildAt(i).setOnClickListener(new View.OnClickListener() { // from class: o.resolveRelativeTouchPosition
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    LottieRatingBar.write(this.write, i2);
                }
            });
            i = i2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void write(LottieRatingBar lottieRatingBar, int i) {
        lottieRatingBar.write(i, true);
    }

    public final int getRating() {
        Object tag = getTag();
        if (tag instanceof Integer) {
            return ((Number) tag).intValue();
        }
        return 0;
    }

    public final void setRating(int i) {
        write(i, false);
    }

    public final void setRatingParticular(int p0) {
        setTag(Integer.valueOf(p0));
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            ImageView imageView = (ImageView) childAt.findViewById(R.id.rating_star);
            ImageView imageView2 = (ImageView) childAt.findViewById(R.id.rating_normal_state);
            int i2 = p0 - 1;
            if (i == i2) {
                toMagicModuleMetaRepoModel.write(imageView2);
                PlayerControlViewExternalSyntheticLambda1.AudioAttributesCompatParcelizer(imageView2);
                toMagicModuleMetaRepoModel.write(imageView);
                ImageView imageView3 = imageView;
                PlayerControlViewExternalSyntheticLambda1.write(imageView3);
                onDraw.write(imageView3, 200L, 1.2f, 1.0f, 1.0f);
            } else if (i < i2) {
                toMagicModuleMetaRepoModel.write(imageView2);
                PlayerControlViewExternalSyntheticLambda1.AudioAttributesCompatParcelizer(imageView2);
                toMagicModuleMetaRepoModel.write(imageView);
                PlayerControlViewExternalSyntheticLambda1.write(imageView);
            } else {
                toMagicModuleMetaRepoModel.write(imageView2);
                PlayerControlViewExternalSyntheticLambda1.write(imageView2);
                toMagicModuleMetaRepoModel.write(imageView);
                PlayerControlViewExternalSyntheticLambda1.AudioAttributesCompatParcelizer(imageView);
            }
        }
    }

    private final void write(int p0, boolean p1) {
        if (this.RemoteActionCompatParcelizer) {
            setTag(Integer.valueOf(p0));
            IconCompatParcelizer(p0, p1);
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = getChildAt(i);
                final ImageView imageView = (ImageView) childAt.findViewById(R.id.rating_star);
                final ImageView imageView2 = (ImageView) childAt.findViewById(R.id.rating_normal_state);
                if (i < p0) {
                    postDelayed(new Runnable() { // from class: o.positionScrubber
                        @Override // java.lang.Runnable
                        public final void run() {
                            LottieRatingBar.write(imageView2, imageView);
                        }
                    }, ((long) i) * 30);
                } else {
                    toMagicModuleMetaRepoModel.write(imageView2);
                    PlayerControlViewExternalSyntheticLambda1.write(imageView2);
                    toMagicModuleMetaRepoModel.write(imageView);
                    PlayerControlViewExternalSyntheticLambda1.AudioAttributesCompatParcelizer(imageView);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void write(ImageView imageView, ImageView imageView2) {
        toMagicModuleMetaRepoModel.write(imageView);
        PlayerControlViewExternalSyntheticLambda1.AudioAttributesCompatParcelizer(imageView);
        toMagicModuleMetaRepoModel.write(imageView2);
        ImageView imageView3 = imageView2;
        PlayerControlViewExternalSyntheticLambda1.write(imageView3);
        onDraw.write(imageView3, 200L, 1.2f, 1.0f, 1.0f);
    }

    private final void IconCompatParcelizer(int p0, boolean p1) {
        RatingBar.OnRatingBarChangeListener onRatingBarChangeListener = this.write;
        if (onRatingBarChangeListener != null) {
            onRatingBarChangeListener.onRatingChanged(null, p0, p1);
        }
    }

    public final void setRatingChangeAllowed(boolean p0) {
        this.RemoteActionCompatParcelizer = p0;
    }

    public final void setOnRatingBarChangedListener(RatingBar.OnRatingBarChangeListener p0) {
        this.write = p0;
    }
}
