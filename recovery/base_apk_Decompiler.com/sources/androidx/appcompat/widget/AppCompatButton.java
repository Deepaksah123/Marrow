package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import kotlin._addSuperTypes;
import kotlin._init_lambda5;
import kotlin.addCancellable;
import kotlin.getEnabledChangedCallbackactivity_release;
import kotlin.setCheckable;
import kotlin.setChecked;
import kotlin.setEnabled;
import kotlin.setPositiveButton;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatButton extends Button {
    private final addCancellable AudioAttributesCompatParcelizer;
    private final setEnabled RemoteActionCompatParcelizer;
    private getEnabledChangedCallbackactivity_release write;

    public AppCompatButton(Context context) {
        this(context, null);
    }

    public AppCompatButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, _init_lambda5.read.buttonStyle);
    }

    public AppCompatButton(Context context, AttributeSet attributeSet, int i) {
        super(setCheckable.read(context), attributeSet, i);
        setPositiveButton.IconCompatParcelizer(this, getContext());
        addCancellable addcancellable = new addCancellable(this);
        this.AudioAttributesCompatParcelizer = addcancellable;
        addcancellable.IconCompatParcelizer(attributeSet, i);
        setEnabled setenabled = new setEnabled(this);
        this.RemoteActionCompatParcelizer = setenabled;
        setenabled.read(attributeSet, i);
        setenabled.AudioAttributesCompatParcelizer();
        RemoteActionCompatParcelizer().AudioAttributesCompatParcelizer(attributeSet, i);
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        addCancellable addcancellable = this.AudioAttributesCompatParcelizer;
        if (addcancellable != null) {
            addcancellable.write(i);
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

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        addCancellable addcancellable = this.AudioAttributesCompatParcelizer;
        if (addcancellable != null) {
            addcancellable.AudioAttributesCompatParcelizer(colorStateList);
        }
    }

    public ColorStateList Z_() {
        addCancellable addcancellable = this.AudioAttributesCompatParcelizer;
        if (addcancellable != null) {
            return addcancellable.RemoteActionCompatParcelizer();
        }
        return null;
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        addCancellable addcancellable = this.AudioAttributesCompatParcelizer;
        if (addcancellable != null) {
            addcancellable.RemoteActionCompatParcelizer(mode);
        }
    }

    public PorterDuff.Mode AudioAttributesCompatParcelizer() {
        addCancellable addcancellable = this.AudioAttributesCompatParcelizer;
        if (addcancellable != null) {
            return addcancellable.write();
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        addCancellable addcancellable = this.AudioAttributesCompatParcelizer;
        if (addcancellable != null) {
            addcancellable.read();
        }
        setEnabled setenabled = this.RemoteActionCompatParcelizer;
        if (setenabled != null) {
            setenabled.AudioAttributesCompatParcelizer();
        }
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        setEnabled setenabled = this.RemoteActionCompatParcelizer;
        if (setenabled != null) {
            setenabled.read(context, i);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        setEnabled setenabled = this.RemoteActionCompatParcelizer;
        if (setenabled != null) {
            setenabled.IconCompatParcelizer(z, i, i2, i3, i4);
        }
    }

    @Override // android.widget.TextView
    public void setTextSize(int i, float f) {
        if (setChecked.RemoteActionCompatParcelizer) {
            super.setTextSize(i, f);
            return;
        }
        setEnabled setenabled = this.RemoteActionCompatParcelizer;
        if (setenabled != null) {
            setenabled.AudioAttributesCompatParcelizer(i, f);
        }
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        if (this.RemoteActionCompatParcelizer == null || setChecked.RemoteActionCompatParcelizer || !this.RemoteActionCompatParcelizer.MediaBrowserCompatItemReceiver()) {
            return;
        }
        this.RemoteActionCompatParcelizer.IconCompatParcelizer();
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (setChecked.RemoteActionCompatParcelizer) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        setEnabled setenabled = this.RemoteActionCompatParcelizer;
        if (setenabled != null) {
            setenabled.write(i);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) throws IllegalArgumentException {
        if (setChecked.RemoteActionCompatParcelizer) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        setEnabled setenabled = this.RemoteActionCompatParcelizer;
        if (setenabled != null) {
            setenabled.read(i, i2, i3, i4);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) throws IllegalArgumentException {
        if (setChecked.RemoteActionCompatParcelizer) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        setEnabled setenabled = this.RemoteActionCompatParcelizer;
        if (setenabled != null) {
            setenabled.read(iArr, i);
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeTextType() {
        if (setChecked.RemoteActionCompatParcelizer) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        setEnabled setenabled = this.RemoteActionCompatParcelizer;
        if (setenabled != null) {
            return setenabled.MediaBrowserCompatCustomActionResultReceiver();
        }
        return 0;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (setChecked.RemoteActionCompatParcelizer) {
            return super.getAutoSizeStepGranularity();
        }
        setEnabled setenabled = this.RemoteActionCompatParcelizer;
        if (setenabled != null) {
            return setenabled.RemoteActionCompatParcelizer();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (setChecked.RemoteActionCompatParcelizer) {
            return super.getAutoSizeMinTextSize();
        }
        setEnabled setenabled = this.RemoteActionCompatParcelizer;
        if (setenabled != null) {
            return setenabled.read();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (setChecked.RemoteActionCompatParcelizer) {
            return super.getAutoSizeMaxTextSize();
        }
        setEnabled setenabled = this.RemoteActionCompatParcelizer;
        if (setenabled != null) {
            return setenabled.write();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (setChecked.RemoteActionCompatParcelizer) {
            return super.getAutoSizeTextAvailableSizes();
        }
        setEnabled setenabled = this.RemoteActionCompatParcelizer;
        if (setenabled != null) {
            return setenabled.AudioAttributesImplBaseParcelizer();
        }
        return new int[0];
    }

    public void setSupportAllCaps(boolean z) {
        setEnabled setenabled = this.RemoteActionCompatParcelizer;
        if (setenabled != null) {
            setenabled.read(z);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(_addSuperTypes.write(this, callback));
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return _addSuperTypes.AudioAttributesCompatParcelizer(super.getCustomSelectionActionModeCallback());
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(colorStateList);
        this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(mode);
        this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer();
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(RemoteActionCompatParcelizer().AudioAttributesCompatParcelizer(inputFilterArr));
    }

    private getEnabledChangedCallbackactivity_release RemoteActionCompatParcelizer() {
        if (this.write == null) {
            this.write = new getEnabledChangedCallbackactivity_release(this);
        }
        return this.write;
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        RemoteActionCompatParcelizer().write(z);
    }

    public void setEmojiCompatEnabled(boolean z) {
        RemoteActionCompatParcelizer().read(z);
    }
}
