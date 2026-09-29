package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.MultiAutoCompleteTextView;
import kotlin._init_lambda5;
import kotlin.addCancellable;
import kotlin.getDefaultViewModelCreationExtras;
import kotlin.handleOnBackProgressed;
import kotlin.setCheckable;
import kotlin.setContentView;
import kotlin.setEnabled;
import kotlin.setPositiveButton;
import kotlin.setTitle;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatMultiAutoCompleteTextView extends MultiAutoCompleteTextView {
    private static final int[] read = {R.attr.popupBackground};
    private final addCancellable IconCompatParcelizer;
    private final setContentView RemoteActionCompatParcelizer;
    private final setEnabled write;

    public AppCompatMultiAutoCompleteTextView(Context context) {
        this(context, null);
    }

    public AppCompatMultiAutoCompleteTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, _init_lambda5.read.autoCompleteTextViewStyle);
    }

    public AppCompatMultiAutoCompleteTextView(Context context, AttributeSet attributeSet, int i) {
        super(setCheckable.read(context), attributeSet, i);
        setPositiveButton.IconCompatParcelizer(this, getContext());
        setTitle settitle = setTitle.read(getContext(), attributeSet, read, i, 0);
        if (settitle.AudioAttributesImplApi26Parcelizer(0)) {
            setDropDownBackgroundDrawable(settitle.IconCompatParcelizer(0));
        }
        settitle.write();
        addCancellable addcancellable = new addCancellable(this);
        this.IconCompatParcelizer = addcancellable;
        addcancellable.IconCompatParcelizer(attributeSet, i);
        setEnabled setenabled = new setEnabled(this);
        this.write = setenabled;
        setenabled.read(attributeSet, i);
        setenabled.AudioAttributesCompatParcelizer();
        setContentView setcontentview = new setContentView(this);
        this.RemoteActionCompatParcelizer = setcontentview;
        setcontentview.write(attributeSet, i);
        AudioAttributesCompatParcelizer(setcontentview);
    }

    void AudioAttributesCompatParcelizer(setContentView setcontentview) {
        KeyListener keyListener = getKeyListener();
        if (setcontentview.write(keyListener)) {
            boolean zIsFocusable = super.isFocusable();
            boolean zIsClickable = super.isClickable();
            boolean zIsLongClickable = super.isLongClickable();
            int inputType = super.getInputType();
            KeyListener keyListenerRemoteActionCompatParcelizer = setcontentview.RemoteActionCompatParcelizer(keyListener);
            if (keyListenerRemoteActionCompatParcelizer != keyListener) {
                super.setKeyListener(keyListenerRemoteActionCompatParcelizer);
                super.setRawInputType(inputType);
                super.setFocusable(zIsFocusable);
                super.setClickable(zIsClickable);
                super.setLongClickable(zIsLongClickable);
            }
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(getDefaultViewModelCreationExtras.write(getContext(), i));
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        addCancellable addcancellable = this.IconCompatParcelizer;
        if (addcancellable != null) {
            addcancellable.write(i);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        addCancellable addcancellable = this.IconCompatParcelizer;
        if (addcancellable != null) {
            addcancellable.AudioAttributesCompatParcelizer(drawable);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        addCancellable addcancellable = this.IconCompatParcelizer;
        if (addcancellable != null) {
            addcancellable.AudioAttributesCompatParcelizer(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        addCancellable addcancellable = this.IconCompatParcelizer;
        if (addcancellable != null) {
            addcancellable.RemoteActionCompatParcelizer(mode);
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        addCancellable addcancellable = this.IconCompatParcelizer;
        if (addcancellable != null) {
            addcancellable.read();
        }
        setEnabled setenabled = this.write;
        if (setenabled != null) {
            setenabled.AudioAttributesCompatParcelizer();
        }
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        setEnabled setenabled = this.write;
        if (setenabled != null) {
            setenabled.read(context, i);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return this.RemoteActionCompatParcelizer.read(handleOnBackProgressed.IconCompatParcelizer(super.onCreateInputConnection(editorInfo), editorInfo, this), editorInfo);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(keyListener));
    }

    public void setEmojiCompatEnabled(boolean z) {
        this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(z);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        setEnabled setenabled = this.write;
        if (setenabled != null) {
            setenabled.AudioAttributesImplApi26Parcelizer();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        setEnabled setenabled = this.write;
        if (setenabled != null) {
            setenabled.AudioAttributesImplApi26Parcelizer();
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.write.RemoteActionCompatParcelizer(colorStateList);
        this.write.AudioAttributesCompatParcelizer();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.write.RemoteActionCompatParcelizer(mode);
        this.write.AudioAttributesCompatParcelizer();
    }
}
