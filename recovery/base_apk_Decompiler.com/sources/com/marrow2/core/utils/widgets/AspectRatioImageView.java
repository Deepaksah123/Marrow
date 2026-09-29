package com.marrow2.core.utils.widgets;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import kotlin.MagicModuleRepositoryImplExternalSyntheticLambda0;
import kotlin.MediaPeriodId;
import kotlin.Metadata;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u000b\u0010\fR\"\u0010\u000e\u001a\u00020\r8\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/marrow2/core/utils/widgets/AspectRatioImageView;", "Landroidx/appcompat/widget/AppCompatImageView;", "Landroid/content/Context;", "p0", "Landroid/util/AttributeSet;", "p1", "", "p2", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "onMeasure", "(II)V", "", "aspectRatio", "F", "getAspectRatio", "()F", "setAspectRatio", "(F)V", "write"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AspectRatioImageView extends AppCompatImageView {
    private float aspectRatio;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AspectRatioImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        toMagicModuleMetaRepoModel.write(context, "");
        this.aspectRatio = 0.41f;
        int[] iArr = MediaPeriodId.AudioAttributesCompatParcelizer.AspectRatioImageView;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(iArr, "");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        this.aspectRatio = typedArrayObtainStyledAttributes.getFloat(0, 0.41f);
        typedArrayObtainStyledAttributes.recycle();
    }

    public /* synthetic */ AspectRatioImageView(Context context, AttributeSet attributeSet, int i, int i2, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public final float getAspectRatio() {
        return this.aspectRatio;
    }

    public final void setAspectRatio(float f) {
        this.aspectRatio = f;
    }

    @Override // android.widget.ImageView, android.view.View
    protected final void onMeasure(int p0, int p1) {
        super.onMeasure(p0, View.MeasureSpec.makeMeasureSpec((int) (View.MeasureSpec.getSize(p0) * this.aspectRatio), 1073741824));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AspectRatioImageView(Context context) {
        this(context, null, 0, 6, null);
        toMagicModuleMetaRepoModel.write(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AspectRatioImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        toMagicModuleMetaRepoModel.write(context, "");
    }
}
