package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import kotlin._addSuperTypes;
import kotlin._init_lambda5;
import kotlin.addCancellable;
import kotlin.getDefaultViewModelCreationExtras;
import kotlin.getEnabledChangedCallbackactivity_release;
import kotlin.handleOnBackProgressed;
import kotlin.reportFullyDrawn;
import kotlin.setCheckable;
import kotlin.setEnabled;
import kotlin.setPositiveButton;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatCheckedTextView extends CheckedTextView {
    private getEnabledChangedCallbackactivity_release AudioAttributesCompatParcelizer;
    private final addCancellable RemoteActionCompatParcelizer;
    private final setEnabled read;
    private final reportFullyDrawn write;

    public AppCompatCheckedTextView(Context context) {
        this(context, null);
    }

    public AppCompatCheckedTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, _init_lambda5.read.checkedTextViewStyle);
    }

    public AppCompatCheckedTextView(Context context, AttributeSet attributeSet, int i) {
        super(setCheckable.read(context), attributeSet, i);
        setPositiveButton.IconCompatParcelizer(this, getContext());
        setEnabled setenabled = new setEnabled(this);
        this.read = setenabled;
        setenabled.read(attributeSet, i);
        setenabled.AudioAttributesCompatParcelizer();
        addCancellable addcancellable = new addCancellable(this);
        this.RemoteActionCompatParcelizer = addcancellable;
        addcancellable.IconCompatParcelizer(attributeSet, i);
        reportFullyDrawn reportfullydrawn = new reportFullyDrawn(this);
        this.write = reportfullydrawn;
        reportfullydrawn.write(attributeSet, i);
        RemoteActionCompatParcelizer().AudioAttributesCompatParcelizer(attributeSet, i);
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        reportFullyDrawn reportfullydrawn = this.write;
        if (reportfullydrawn != null) {
            reportfullydrawn.write();
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i) {
        setCheckMarkDrawable(getDefaultViewModelCreationExtras.write(getContext(), i));
    }

    public void setSupportCheckMarkTintList(ColorStateList colorStateList) {
        reportFullyDrawn reportfullydrawn = this.write;
        if (reportfullydrawn != null) {
            reportfullydrawn.write(colorStateList);
        }
    }

    public void setSupportCheckMarkTintMode(PorterDuff.Mode mode) {
        reportFullyDrawn reportfullydrawn = this.write;
        if (reportfullydrawn != null) {
            reportfullydrawn.AudioAttributesCompatParcelizer(mode);
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

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        addCancellable addcancellable = this.RemoteActionCompatParcelizer;
        if (addcancellable != null) {
            addcancellable.AudioAttributesCompatParcelizer(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        addCancellable addcancellable = this.RemoteActionCompatParcelizer;
        if (addcancellable != null) {
            addcancellable.write(i);
        }
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        setEnabled setenabled = this.read;
        if (setenabled != null) {
            setenabled.read(context, i);
        }
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        setEnabled setenabled = this.read;
        if (setenabled != null) {
            setenabled.AudioAttributesCompatParcelizer();
        }
        addCancellable addcancellable = this.RemoteActionCompatParcelizer;
        if (addcancellable != null) {
            addcancellable.read();
        }
        reportFullyDrawn reportfullydrawn = this.write;
        if (reportfullydrawn != null) {
            reportfullydrawn.RemoteActionCompatParcelizer();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return handleOnBackProgressed.IconCompatParcelizer(super.onCreateInputConnection(editorInfo), editorInfo, this);
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(_addSuperTypes.write(this, callback));
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return _addSuperTypes.AudioAttributesCompatParcelizer(super.getCustomSelectionActionModeCallback());
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
        setEnabled setenabled = this.read;
        if (setenabled != null) {
            setenabled.AudioAttributesImplApi26Parcelizer();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        setEnabled setenabled = this.read;
        if (setenabled != null) {
            setenabled.AudioAttributesImplApi26Parcelizer();
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.read.RemoteActionCompatParcelizer(colorStateList);
        this.read.AudioAttributesCompatParcelizer();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.read.RemoteActionCompatParcelizer(mode);
        this.read.AudioAttributesCompatParcelizer();
    }
}
