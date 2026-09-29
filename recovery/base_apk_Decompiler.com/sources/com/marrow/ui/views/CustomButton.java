package com.marrow.ui.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.Button;
import kotlin.MediaPeriodId;
import kotlin.Metadata;
import kotlin.getDefaultViewModelCreationExtras;
import kotlin.scrubIncrementally;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bB#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bJ!\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\r\u0010\bJ-\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/marrow/ui/views/CustomButton;", "Landroid/widget/Button;", "Landroid/content/Context;", "p0", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "p1", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "p2", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "RemoteActionCompatParcelizer", "p3", "setCompoundDrawablesWithIntrinsicBoundsCompat", "(IIII)V"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CustomButton extends Button {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomButton(Context context) {
        super(context);
        toMagicModuleMetaRepoModel.write(context, "");
        scrubIncrementally.IconCompatParcelizer(this, context, null);
        RemoteActionCompatParcelizer(context, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        toMagicModuleMetaRepoModel.write(context, "");
        scrubIncrementally.IconCompatParcelizer(this, context, attributeSet);
        RemoteActionCompatParcelizer(context, attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        toMagicModuleMetaRepoModel.write(context, "");
        scrubIncrementally.IconCompatParcelizer(this, context, attributeSet);
        RemoteActionCompatParcelizer(context, attributeSet);
    }

    private final void RemoteActionCompatParcelizer(Context p0, AttributeSet p1) {
        if (p1 != null) {
            TypedArray typedArrayObtainStyledAttributes = p0.obtainStyledAttributes(p1, MediaPeriodId.AudioAttributesCompatParcelizer.CustomView);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(typedArrayObtainStyledAttributes, "");
            setCompoundDrawablesWithIntrinsicBounds(typedArrayObtainStyledAttributes.getDrawable(3), typedArrayObtainStyledAttributes.getDrawable(5), typedArrayObtainStyledAttributes.getDrawable(4), typedArrayObtainStyledAttributes.getDrawable(2));
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public final void setCompoundDrawablesWithIntrinsicBoundsCompat(int p0, int p1, int p2, int p3) {
        setCompoundDrawablesWithIntrinsicBounds(p0 != -1 ? getDefaultViewModelCreationExtras.write(getContext(), p0) : null, p1 != -1 ? getDefaultViewModelCreationExtras.write(getContext(), p1) : null, p2 != -1 ? getDefaultViewModelCreationExtras.write(getContext(), p2) : null, p3 != -1 ? getDefaultViewModelCreationExtras.write(getContext(), p3) : null);
    }
}
