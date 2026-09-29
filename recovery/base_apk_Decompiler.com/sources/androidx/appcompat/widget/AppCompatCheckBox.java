package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.CheckBox;
import kotlin._addFromBundleIfNotPresent;
import kotlin._init_lambda5;
import kotlin.addCancellable;
import kotlin.getDefaultViewModelCreationExtras;
import kotlin.getEnabledChangedCallbackactivity_release;
import kotlin.setCheckable;
import kotlin.setEnabled;
import kotlin.setPositiveButton;
import kotlin.startActivityForResult;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatCheckBox extends CheckBox implements _addFromBundleIfNotPresent {
    private final addCancellable AudioAttributesCompatParcelizer;
    private final setEnabled IconCompatParcelizer;
    private final startActivityForResult read;
    private getEnabledChangedCallbackactivity_release write;

    public AppCompatCheckBox(Context context) {
        this(context, null);
    }

    public AppCompatCheckBox(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, _init_lambda5.read.checkboxStyle);
    }

    public AppCompatCheckBox(Context context, AttributeSet attributeSet, int i) {
        super(setCheckable.read(context), attributeSet, i);
        setPositiveButton.IconCompatParcelizer(this, getContext());
        startActivityForResult startactivityforresult = new startActivityForResult(this);
        this.read = startactivityforresult;
        startactivityforresult.AudioAttributesCompatParcelizer(attributeSet, i);
        addCancellable addcancellable = new addCancellable(this);
        this.AudioAttributesCompatParcelizer = addcancellable;
        addcancellable.IconCompatParcelizer(attributeSet, i);
        setEnabled setenabled = new setEnabled(this);
        this.IconCompatParcelizer = setenabled;
        setenabled.read(attributeSet, i);
        write().AudioAttributesCompatParcelizer(attributeSet, i);
    }

    private getEnabledChangedCallbackactivity_release write() {
        if (this.write == null) {
            this.write = new getEnabledChangedCallbackactivity_release(this);
        }
        return this.write;
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        startActivityForResult startactivityforresult = this.read;
        if (startactivityforresult != null) {
            startactivityforresult.IconCompatParcelizer();
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(getDefaultViewModelCreationExtras.write(getContext(), i));
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        startActivityForResult startactivityforresult = this.read;
        return startactivityforresult != null ? startactivityforresult.read(compoundPaddingLeft) : compoundPaddingLeft;
    }

    @Override // kotlin._addFromBundleIfNotPresent
    public void setSupportButtonTintList(ColorStateList colorStateList) {
        startActivityForResult startactivityforresult = this.read;
        if (startactivityforresult != null) {
            startactivityforresult.write(colorStateList);
        }
    }

    @Override // kotlin._addFromBundleIfNotPresent
    public ColorStateList read() {
        startActivityForResult startactivityforresult = this.read;
        if (startactivityforresult != null) {
            return startactivityforresult.read();
        }
        return null;
    }

    @Override // kotlin._addFromBundleIfNotPresent
    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        startActivityForResult startactivityforresult = this.read;
        if (startactivityforresult != null) {
            startactivityforresult.write(mode);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        addCancellable addcancellable = this.AudioAttributesCompatParcelizer;
        if (addcancellable != null) {
            addcancellable.AudioAttributesCompatParcelizer(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        addCancellable addcancellable = this.AudioAttributesCompatParcelizer;
        if (addcancellable != null) {
            addcancellable.RemoteActionCompatParcelizer(mode);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        addCancellable addcancellable = this.AudioAttributesCompatParcelizer;
        if (addcancellable != null) {
            addcancellable.AudioAttributesCompatParcelizer(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        addCancellable addcancellable = this.AudioAttributesCompatParcelizer;
        if (addcancellable != null) {
            addcancellable.write(i);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        addCancellable addcancellable = this.AudioAttributesCompatParcelizer;
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
        super.setFilters(write().AudioAttributesCompatParcelizer(inputFilterArr));
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        write().write(z);
    }

    public void setEmojiCompatEnabled(boolean z) {
        write().read(z);
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
