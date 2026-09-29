package com.marrow2.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RatingBar;
import com.marrow.R;
import com.marrow2.ui.LottieRatingBarBigV2;
import kotlin.Metadata;
import kotlin.PlayerControlViewExternalSyntheticLambda1;
import kotlin.onDraw;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bB#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\r\u0010\u0005J\u0017\u0010\u000f\u001a\u00020\f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0013\u0010\u0012J\u001f\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0014¢\u0006\u0004\b\u0017\u0010\u0018R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0019R\u0016\u0010\u0011\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u001bR$\u0010\u001f\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\t8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u0012"}, d2 = {"Lcom/marrow2/ui/LottieRatingBarBigV2;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "p0", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "p1", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "p2", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "IconCompatParcelizer", "Landroid/widget/RatingBar$OnRatingBarChangeListener;", "setOnRatingBarChangedListener", "(Landroid/widget/RatingBar$OnRatingBarChangeListener;)V", "write", "(I)V", "AudioAttributesCompatParcelizer", "", "read", "(IZ)V", "setRatingChangeAllowed", "(Z)V", "Landroid/widget/RatingBar$OnRatingBarChangeListener;", "RemoteActionCompatParcelizer", "Z", "getRating", "()I", "setRating", "rating"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class LottieRatingBarBigV2 extends LinearLayout {

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private boolean write;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private RatingBar.OnRatingBarChangeListener RemoteActionCompatParcelizer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LottieRatingBarBigV2(Context context) {
        super(context);
        toMagicModuleMetaRepoModel.write(context, "");
        this.write = true;
        IconCompatParcelizer(context);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LottieRatingBarBigV2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        toMagicModuleMetaRepoModel.write(context, "");
        this.write = true;
        IconCompatParcelizer(context);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LottieRatingBarBigV2(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        toMagicModuleMetaRepoModel.write(context, "");
        this.write = true;
        IconCompatParcelizer(context);
    }

    private final void IconCompatParcelizer(Context p0) {
        LayoutInflater.from(p0).inflate(R.layout.custom_lottie_rating_bar_big_v2, (ViewGroup) this, true);
        int childCount = getChildCount();
        int i = 0;
        while (i < childCount) {
            final int i2 = i + 1;
            getChildAt(i).setOnClickListener(new View.OnClickListener() { // from class: o.registerReceiverNotExported
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    LottieRatingBarBigV2.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, i2);
                }
            });
            i = i2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void RemoteActionCompatParcelizer(LottieRatingBarBigV2 lottieRatingBarBigV2, int i) {
        lottieRatingBarBigV2.write(i);
    }

    public final int getRating() {
        Object tag = getTag();
        if (tag instanceof Integer) {
            return ((Number) tag).intValue();
        }
        return 0;
    }

    public final void setRating(int i) {
        read(i, false);
        AudioAttributesCompatParcelizer(i);
    }

    public final void setOnRatingBarChangedListener(RatingBar.OnRatingBarChangeListener p0) {
        this.RemoteActionCompatParcelizer = p0;
    }

    private final void write(int p0) {
        if (this.write) {
            read(p0, true);
            AudioAttributesCompatParcelizer(p0);
        }
    }

    private final void AudioAttributesCompatParcelizer(int p0) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            final ImageView imageView = (ImageView) childAt.findViewById(R.id.rating_star);
            final ImageView imageView2 = (ImageView) childAt.findViewById(R.id.rating_normal_state);
            if (i < p0) {
                postDelayed(new Runnable() { // from class: o.readBoolean
                    @Override // java.lang.Runnable
                    public final void run() {
                        LottieRatingBarBigV2.AudioAttributesCompatParcelizer(imageView2, imageView);
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AudioAttributesCompatParcelizer(ImageView imageView, ImageView imageView2) {
        toMagicModuleMetaRepoModel.write(imageView);
        PlayerControlViewExternalSyntheticLambda1.AudioAttributesCompatParcelizer(imageView);
        toMagicModuleMetaRepoModel.write(imageView2);
        ImageView imageView3 = imageView2;
        PlayerControlViewExternalSyntheticLambda1.write(imageView3);
        onDraw.write(imageView3, 200L, 1.2f, 1.0f, 1.0f);
    }

    private final void read(int p0, boolean p1) {
        setTag(Integer.valueOf(p0));
        RatingBar.OnRatingBarChangeListener onRatingBarChangeListener = this.RemoteActionCompatParcelizer;
        if (onRatingBarChangeListener != null) {
            onRatingBarChangeListener.onRatingChanged(null, p0, p1);
        }
    }

    public final void setRatingChangeAllowed(boolean p0) {
        this.write = p0;
    }
}
