package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import kotlin.Annotated;
import kotlin.InvalidTypeIdException;
import kotlin.StringDeserializer;
import kotlin._addClassMixIns;
import kotlin._addSuperTypes;
import kotlin._init_lambda5;
import kotlin.addCancellable;
import kotlin.finishRootArray;
import kotlin.forRecord;
import kotlin.handleOnBackPressed;
import kotlin.handleOnBackProgressed;
import kotlin.isEnabled;
import kotlin.setCheckable;
import kotlin.setContentView;
import kotlin.setEnabled;
import kotlin.setPositiveButton;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatEditText extends EditText implements finishRootArray {
    private read AudioAttributesCompatParcelizer;
    private final setEnabled AudioAttributesImplApi21Parcelizer;
    private final _addClassMixIns IconCompatParcelizer;
    private final isEnabled RemoteActionCompatParcelizer;
    private final addCancellable read;
    private final setContentView write;

    @Override // android.widget.EditText, android.widget.TextView
    public /* bridge */ /* synthetic */ CharSequence getText() {
        return getText();
    }

    public AppCompatEditText(Context context) {
        this(context, null);
    }

    public AppCompatEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, _init_lambda5.read.editTextStyle);
    }

    public AppCompatEditText(Context context, AttributeSet attributeSet, int i) {
        super(setCheckable.read(context), attributeSet, i);
        setPositiveButton.IconCompatParcelizer(this, getContext());
        addCancellable addcancellable = new addCancellable(this);
        this.read = addcancellable;
        addcancellable.IconCompatParcelizer(attributeSet, i);
        setEnabled setenabled = new setEnabled(this);
        this.AudioAttributesImplApi21Parcelizer = setenabled;
        setenabled.read(attributeSet, i);
        setenabled.AudioAttributesCompatParcelizer();
        this.RemoteActionCompatParcelizer = new isEnabled(this);
        this.IconCompatParcelizer = new _addClassMixIns();
        setContentView setcontentview = new setContentView(this);
        this.write = setcontentview;
        setcontentview.write(attributeSet, i);
        RemoteActionCompatParcelizer(setcontentview);
    }

    void RemoteActionCompatParcelizer(setContentView setcontentview) {
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

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        return super.getText();
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        addCancellable addcancellable = this.read;
        if (addcancellable != null) {
            addcancellable.write(i);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        addCancellable addcancellable = this.read;
        if (addcancellable != null) {
            addcancellable.AudioAttributesCompatParcelizer(drawable);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        addCancellable addcancellable = this.read;
        if (addcancellable != null) {
            addcancellable.AudioAttributesCompatParcelizer(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        addCancellable addcancellable = this.read;
        if (addcancellable != null) {
            addcancellable.RemoteActionCompatParcelizer(mode);
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        addCancellable addcancellable = this.read;
        if (addcancellable != null) {
            addcancellable.read();
        }
        setEnabled setenabled = this.AudioAttributesImplApi21Parcelizer;
        if (setenabled != null) {
            setenabled.AudioAttributesCompatParcelizer();
        }
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        setEnabled setenabled = this.AudioAttributesImplApi21Parcelizer;
        if (setenabled != null) {
            setenabled.read(context, i);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        String[] strArrMediaDescriptionCompat;
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.AudioAttributesImplApi21Parcelizer.write(this, inputConnectionOnCreateInputConnection, editorInfo);
        InputConnection inputConnectionIconCompatParcelizer = handleOnBackProgressed.IconCompatParcelizer(inputConnectionOnCreateInputConnection, editorInfo, this);
        if (inputConnectionIconCompatParcelizer != null && Build.VERSION.SDK_INT <= 30 && (strArrMediaDescriptionCompat = InvalidTypeIdException.MediaDescriptionCompat(this)) != null) {
            forRecord.write(editorInfo, strArrMediaDescriptionCompat);
            inputConnectionIconCompatParcelizer = Annotated.IconCompatParcelizer(this, inputConnectionIconCompatParcelizer, editorInfo);
        }
        return this.write.read(inputConnectionIconCompatParcelizer, editorInfo);
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(_addSuperTypes.write(this, callback));
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return _addSuperTypes.AudioAttributesCompatParcelizer(super.getCustomSelectionActionModeCallback());
    }

    private read AudioAttributesCompatParcelizer() {
        if (this.AudioAttributesCompatParcelizer == null) {
            this.AudioAttributesCompatParcelizer = new read();
        }
        return this.AudioAttributesCompatParcelizer;
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        AudioAttributesCompatParcelizer().RemoteActionCompatParcelizer(textClassifier);
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        return AudioAttributesCompatParcelizer().RemoteActionCompatParcelizer();
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onDragEvent(DragEvent dragEvent) {
        if (handleOnBackPressed.write(this, dragEvent)) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public boolean onTextContextMenuItem(int i) {
        if (handleOnBackPressed.RemoteActionCompatParcelizer(this, i)) {
            return true;
        }
        return super.onTextContextMenuItem(i);
    }

    @Override // kotlin.finishRootArray
    public StringDeserializer RemoteActionCompatParcelizer(StringDeserializer stringDeserializer) {
        return this.IconCompatParcelizer.read(this, stringDeserializer);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.write.RemoteActionCompatParcelizer(keyListener));
    }

    public void setEmojiCompatEnabled(boolean z) {
        this.write.AudioAttributesCompatParcelizer(z);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        setEnabled setenabled = this.AudioAttributesImplApi21Parcelizer;
        if (setenabled != null) {
            setenabled.AudioAttributesImplApi26Parcelizer();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        setEnabled setenabled = this.AudioAttributesImplApi21Parcelizer;
        if (setenabled != null) {
            setenabled.AudioAttributesImplApi26Parcelizer();
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.AudioAttributesImplApi21Parcelizer.RemoteActionCompatParcelizer(colorStateList);
        this.AudioAttributesImplApi21Parcelizer.AudioAttributesCompatParcelizer();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.AudioAttributesImplApi21Parcelizer.RemoteActionCompatParcelizer(mode);
        this.AudioAttributesImplApi21Parcelizer.AudioAttributesCompatParcelizer();
    }

    class read {
        read() {
        }

        public TextClassifier RemoteActionCompatParcelizer() {
            return AppCompatEditText.super.getTextClassifier();
        }

        public void RemoteActionCompatParcelizer(TextClassifier textClassifier) {
            AppCompatEditText.super.setTextClassifier(textClassifier);
        }
    }
}
