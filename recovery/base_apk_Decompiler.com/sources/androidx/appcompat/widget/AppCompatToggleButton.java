package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.ToggleButton;
import kotlin.addCancellable;
import kotlin.getEnabledChangedCallbackactivity_release;
import kotlin.setEnabled;
import kotlin.setPositiveButton;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatToggleButton extends ToggleButton {
    private getEnabledChangedCallbackactivity_release AudioAttributesCompatParcelizer;
    private final setEnabled IconCompatParcelizer;
    private final addCancellable RemoteActionCompatParcelizer;

    public AppCompatToggleButton(Context context) {
        this(context, null);
    }

    public AppCompatToggleButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.buttonStyleToggle);
    }

    public AppCompatToggleButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setPositiveButton.IconCompatParcelizer(this, getContext());
        addCancellable addcancellable = new addCancellable(this);
        this.RemoteActionCompatParcelizer = addcancellable;
        addcancellable.IconCompatParcelizer(attributeSet, i);
        setEnabled setenabled = new setEnabled(this);
        this.IconCompatParcelizer = setenabled;
        setenabled.read(attributeSet, i);
        RemoteActionCompatParcelizer().AudioAttributesCompatParcelizer(attributeSet, i);
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        addCancellable addcancellable = this.RemoteActionCompatParcelizer;
        if (addcancellable != null) {
            addcancellable.write(i);
        }
    }

    @Override // android.widget.ToggleButton, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        addCancellable addcancellable = this.RemoteActionCompatParcelizer;
        if (addcancellable != null) {
            addcancellable.AudioAttributesCompatParcelizer(drawable);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        addCancellable addcancellable = this.RemoteActionCompatParcelizer;
        if (addcancellable != null) {
            addcancellable.AudioAttributesCompatParcelizer(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        addCancellable addcancellable = this.RemoteActionCompatParcelizer;
        if (addcancellable != null) {
            addcancellable.RemoteActionCompatParcelizer(mode);
        }
    }

    @Override // android.widget.ToggleButton, android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        addCancellable addcancellable = this.RemoteActionCompatParcelizer;
        if (addcancellable != null) {
            addcancellable.read();
        }
        setEnabled setenabled = this.IconCompatParcelizer;
        if (setenabled != null) {
            setenabled.AudioAttributesCompatParcelizer();
        }
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(RemoteActionCompatParcelizer().AudioAttributesCompatParcelizer(inputFilterArr));
    }

    private getEnabledChangedCallbackactivity_release RemoteActionCompatParcelizer() {
        if (this.AudioAttributesCompatParcelizer == null) {
            this.AudioAttributesCompatParcelizer = new getEnabledChangedCallbackactivity_release(this);
        }
        return this.AudioAttributesCompatParcelizer;
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        RemoteActionCompatParcelizer().write(z);
    }

    public void setEmojiCompatEnabled(boolean z) {
        RemoteActionCompatParcelizer().read(z);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        setEnabled setenabled = this.IconCompatParcelizer;
        if (setenabled != null) {
            setenabled.AudioAttributesImplApi26Parcelizer();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        setEnabled setenabled = this.IconCompatParcelizer;
        if (setenabled != null) {
            setenabled.AudioAttributesImplApi26Parcelizer();
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.IconCompatParcelizer.RemoteActionCompatParcelizer(colorStateList);
        this.IconCompatParcelizer.AudioAttributesCompatParcelizer();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.IconCompatParcelizer.RemoteActionCompatParcelizer(mode);
        this.IconCompatParcelizer.AudioAttributesCompatParcelizer();
    }
}
