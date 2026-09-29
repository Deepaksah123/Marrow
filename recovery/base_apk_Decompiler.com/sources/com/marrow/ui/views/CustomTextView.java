package com.marrow.ui.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.MediaPeriodId;
import kotlin.Metadata;
import kotlin.PlayerControlViewExternalSyntheticLambda1;
import kotlin.getDefaultViewModelCreationExtras;
import kotlin.scrubIncrementally;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bB#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bJ!\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\r\u0010\bJ5\u0010\u000f\u001a\u00020\f2\b\b\u0002\u0010\u0003\u001a\u00020\t2\b\b\u0002\u0010\u0007\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0014\u0010\u0015"}, d2 = {"Lcom/marrow/ui/views/CustomTextView;", "Landroidx/appcompat/widget/AppCompatTextView;", "Landroid/content/Context;", "p0", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "p1", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "p2", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "IconCompatParcelizer", "p3", "setCompoundDrawablesWithIntrinsicBoundsCompat", "(IIII)V", "", "AudioAttributesCompatParcelizer", "()Ljava/lang/String;", "setTextOrHide", "(Ljava/lang/String;)V"}, k = 1, mv = {2, 2, 0}, xi = 48)
public class CustomTextView extends AppCompatTextView {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomTextView(Context context) {
        super(context);
        toMagicModuleMetaRepoModel.write(context, "");
        scrubIncrementally.IconCompatParcelizer(this, context, null);
        IconCompatParcelizer(context, (AttributeSet) null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        toMagicModuleMetaRepoModel.write(context, "");
        scrubIncrementally.IconCompatParcelizer(this, context, attributeSet);
        IconCompatParcelizer(context, attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        toMagicModuleMetaRepoModel.write(context, "");
        scrubIncrementally.IconCompatParcelizer(this, context, attributeSet);
        IconCompatParcelizer(context, attributeSet);
    }

    private final void IconCompatParcelizer(Context p0, AttributeSet p1) {
        if (p1 != null) {
            TypedArray typedArrayObtainStyledAttributes = p0.obtainStyledAttributes(p1, MediaPeriodId.AudioAttributesCompatParcelizer.CustomView);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(typedArrayObtainStyledAttributes, "");
            Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(3);
            Drawable drawable2 = typedArrayObtainStyledAttributes.getDrawable(4);
            Drawable drawable3 = typedArrayObtainStyledAttributes.getDrawable(2);
            Drawable drawable4 = typedArrayObtainStyledAttributes.getDrawable(5);
            Drawable drawable5 = typedArrayObtainStyledAttributes.getDrawable(0);
            setCompoundDrawablesWithIntrinsicBounds(drawable, drawable4, drawable2, drawable3);
            if (drawable5 != null) {
                setBackground(drawable5);
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static /* synthetic */ void setCompoundDrawablesWithIntrinsicBoundsCompat$default(CustomTextView customTextView, int i, int i2, int i3, int i4, int i5, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setCompoundDrawablesWithIntrinsicBoundsCompat");
        }
        if ((i5 & 1) != 0) {
            i = -1;
        }
        if ((i5 & 2) != 0) {
            i2 = -1;
        }
        if ((i5 & 4) != 0) {
            i3 = -1;
        }
        if ((i5 & 8) != 0) {
            i4 = -1;
        }
        customTextView.setCompoundDrawablesWithIntrinsicBoundsCompat(i, i2, i3, i4);
    }

    public final void setCompoundDrawablesWithIntrinsicBoundsCompat(int p0, int p1, int p2, int p3) {
        setCompoundDrawablesWithIntrinsicBounds(p0 != -1 ? getDefaultViewModelCreationExtras.write(getContext(), p0) : null, p1 != -1 ? getDefaultViewModelCreationExtras.write(getContext(), p1) : null, p2 != -1 ? getDefaultViewModelCreationExtras.write(getContext(), p2) : null, p3 != -1 ? getDefaultViewModelCreationExtras.write(getContext(), p3) : null);
    }

    public final String AudioAttributesCompatParcelizer() {
        CharSequence text = getText();
        String string = text != null ? text.toString() : null;
        return string == null ? "" : string;
    }

    public final void setTextOrHide(String p0) {
        if (p0 != null) {
            String str = p0;
            if (str.length() != 0) {
                PlayerControlViewExternalSyntheticLambda1.write((View) this);
                setText(str);
                return;
            }
        }
        PlayerControlViewExternalSyntheticLambda1.AudioAttributesCompatParcelizer(this);
    }

    public final void setCompoundDrawablesWithIntrinsicBoundsCompat() {
        setCompoundDrawablesWithIntrinsicBoundsCompat$default(this, 0, 0, 0, 0, 15, null);
    }

    public final void setCompoundDrawablesWithIntrinsicBoundsCompat(int i) {
        setCompoundDrawablesWithIntrinsicBoundsCompat$default(this, i, 0, 0, 0, 14, null);
    }

    public final void setCompoundDrawablesWithIntrinsicBoundsCompat(int i, int i2) {
        setCompoundDrawablesWithIntrinsicBoundsCompat$default(this, i, i2, 0, 0, 12, null);
    }

    public final void setCompoundDrawablesWithIntrinsicBoundsCompat(int i, int i2, int i3) {
        setCompoundDrawablesWithIntrinsicBoundsCompat$default(this, i, i2, i3, 0, 8, null);
    }
}
