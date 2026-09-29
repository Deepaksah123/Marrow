package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import kotlin._addSuperTypes;
import kotlin.addCancellable;
import kotlin.configureFromLongCreator;
import kotlin.findConvertingContentDeserializer;
import kotlin.getDefaultViewModelCreationExtras;
import kotlin.getEnabledChangedCallbackactivity_release;
import kotlin.handleOnBackProgressed;
import kotlin.isEnabled;
import kotlin.setCheckable;
import kotlin.setChecked;
import kotlin.setEnabled;
import kotlin.setPositiveButton;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatTextView extends TextView {
    private IconCompatParcelizer AudioAttributesCompatParcelizer;
    private final isEnabled AudioAttributesImplBaseParcelizer;
    private boolean IconCompatParcelizer;
    private final setEnabled MediaBrowserCompatCustomActionResultReceiver;
    private Future<configureFromLongCreator> RemoteActionCompatParcelizer;
    private getEnabledChangedCallbackactivity_release read;
    private final addCancellable write;

    interface IconCompatParcelizer {
        int AudioAttributesCompatParcelizer();

        void AudioAttributesCompatParcelizer(int i);

        TextClassifier AudioAttributesImplApi26Parcelizer();

        int IconCompatParcelizer();

        void IconCompatParcelizer(int i);

        void IconCompatParcelizer(int i, int i2, int i3, int i4);

        int RemoteActionCompatParcelizer();

        void RemoteActionCompatParcelizer(int i);

        void RemoteActionCompatParcelizer(int[] iArr, int i);

        void read(TextClassifier textClassifier);

        int[] read();

        int write();
    }

    public AppCompatTextView(Context context) {
        this(context, null);
    }

    public AppCompatTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    public AppCompatTextView(Context context, AttributeSet attributeSet, int i) {
        super(setCheckable.read(context), attributeSet, i);
        this.IconCompatParcelizer = false;
        this.AudioAttributesCompatParcelizer = null;
        setPositiveButton.IconCompatParcelizer(this, getContext());
        addCancellable addcancellable = new addCancellable(this);
        this.write = addcancellable;
        addcancellable.IconCompatParcelizer(attributeSet, i);
        setEnabled setenabled = new setEnabled(this);
        this.MediaBrowserCompatCustomActionResultReceiver = setenabled;
        setenabled.read(attributeSet, i);
        setenabled.AudioAttributesCompatParcelizer();
        this.AudioAttributesImplBaseParcelizer = new isEnabled(this);
        RemoteActionCompatParcelizer().AudioAttributesCompatParcelizer(attributeSet, i);
    }

    private getEnabledChangedCallbackactivity_release RemoteActionCompatParcelizer() {
        if (this.read == null) {
            this.read = new getEnabledChangedCallbackactivity_release(this);
        }
        return this.read;
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        addCancellable addcancellable = this.write;
        if (addcancellable != null) {
            addcancellable.write(i);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        addCancellable addcancellable = this.write;
        if (addcancellable != null) {
            addcancellable.AudioAttributesCompatParcelizer(drawable);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        addCancellable addcancellable = this.write;
        if (addcancellable != null) {
            addcancellable.AudioAttributesCompatParcelizer(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        addCancellable addcancellable = this.write;
        if (addcancellable != null) {
            addcancellable.RemoteActionCompatParcelizer(mode);
        }
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        setEnabled setenabled = this.MediaBrowserCompatCustomActionResultReceiver;
        if (setenabled != null) {
            setenabled.read(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(RemoteActionCompatParcelizer().AudioAttributesCompatParcelizer(inputFilterArr));
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        RemoteActionCompatParcelizer().write(z);
    }

    public void setEmojiCompatEnabled(boolean z) {
        RemoteActionCompatParcelizer().read(z);
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        addCancellable addcancellable = this.write;
        if (addcancellable != null) {
            addcancellable.read();
        }
        setEnabled setenabled = this.MediaBrowserCompatCustomActionResultReceiver;
        if (setenabled != null) {
            setenabled.AudioAttributesCompatParcelizer();
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        setEnabled setenabled = this.MediaBrowserCompatCustomActionResultReceiver;
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
        setEnabled setenabled = this.MediaBrowserCompatCustomActionResultReceiver;
        if (setenabled != null) {
            setenabled.AudioAttributesCompatParcelizer(i, f);
        }
    }

    @Override // android.widget.TextView
    protected void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        if (this.MediaBrowserCompatCustomActionResultReceiver == null || setChecked.RemoteActionCompatParcelizer || !this.MediaBrowserCompatCustomActionResultReceiver.MediaBrowserCompatItemReceiver()) {
            return;
        }
        this.MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer();
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (setChecked.RemoteActionCompatParcelizer) {
            AudioAttributesImplApi21Parcelizer().AudioAttributesCompatParcelizer(i);
            return;
        }
        setEnabled setenabled = this.MediaBrowserCompatCustomActionResultReceiver;
        if (setenabled != null) {
            setenabled.write(i);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) throws IllegalArgumentException {
        if (setChecked.RemoteActionCompatParcelizer) {
            AudioAttributesImplApi21Parcelizer().IconCompatParcelizer(i, i2, i3, i4);
            return;
        }
        setEnabled setenabled = this.MediaBrowserCompatCustomActionResultReceiver;
        if (setenabled != null) {
            setenabled.read(i, i2, i3, i4);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) throws IllegalArgumentException {
        if (setChecked.RemoteActionCompatParcelizer) {
            AudioAttributesImplApi21Parcelizer().RemoteActionCompatParcelizer(iArr, i);
            return;
        }
        setEnabled setenabled = this.MediaBrowserCompatCustomActionResultReceiver;
        if (setenabled != null) {
            setenabled.read(iArr, i);
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeTextType() {
        if (setChecked.RemoteActionCompatParcelizer) {
            return AudioAttributesImplApi21Parcelizer().AudioAttributesCompatParcelizer() == 1 ? 1 : 0;
        }
        setEnabled setenabled = this.MediaBrowserCompatCustomActionResultReceiver;
        if (setenabled != null) {
            return setenabled.MediaBrowserCompatCustomActionResultReceiver();
        }
        return 0;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (setChecked.RemoteActionCompatParcelizer) {
            return AudioAttributesImplApi21Parcelizer().IconCompatParcelizer();
        }
        setEnabled setenabled = this.MediaBrowserCompatCustomActionResultReceiver;
        if (setenabled != null) {
            return setenabled.RemoteActionCompatParcelizer();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (setChecked.RemoteActionCompatParcelizer) {
            return AudioAttributesImplApi21Parcelizer().RemoteActionCompatParcelizer();
        }
        setEnabled setenabled = this.MediaBrowserCompatCustomActionResultReceiver;
        if (setenabled != null) {
            return setenabled.read();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (setChecked.RemoteActionCompatParcelizer) {
            return AudioAttributesImplApi21Parcelizer().write();
        }
        setEnabled setenabled = this.MediaBrowserCompatCustomActionResultReceiver;
        if (setenabled != null) {
            return setenabled.write();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (setChecked.RemoteActionCompatParcelizer) {
            return AudioAttributesImplApi21Parcelizer().read();
        }
        setEnabled setenabled = this.MediaBrowserCompatCustomActionResultReceiver;
        if (setenabled != null) {
            return setenabled.AudioAttributesImplBaseParcelizer();
        }
        return new int[0];
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.MediaBrowserCompatCustomActionResultReceiver.write(this, inputConnectionOnCreateInputConnection, editorInfo);
        return handleOnBackProgressed.IconCompatParcelizer(inputConnectionOnCreateInputConnection, editorInfo, this);
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i) {
        AudioAttributesImplApi21Parcelizer().IconCompatParcelizer(i);
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i) {
        AudioAttributesImplApi21Parcelizer().RemoteActionCompatParcelizer(i);
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return _addSuperTypes.write(this);
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return _addSuperTypes.IconCompatParcelizer(this);
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i) {
        _addSuperTypes.read(this, i);
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(_addSuperTypes.write(this, callback));
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return _addSuperTypes.AudioAttributesCompatParcelizer(super.getCustomSelectionActionModeCallback());
    }

    public void setTextMetricsParamsCompat(configureFromLongCreator.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
        _addSuperTypes.IconCompatParcelizer(this, audioAttributesCompatParcelizer);
    }

    public void setPrecomputedText(configureFromLongCreator configurefromlongcreator) {
        _addSuperTypes.write(this, configurefromlongcreator);
    }

    private void write() {
        Future<configureFromLongCreator> future = this.RemoteActionCompatParcelizer;
        if (future != null) {
            try {
                this.RemoteActionCompatParcelizer = null;
                _addSuperTypes.write(this, future.get());
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        write();
        return super.getText();
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        AudioAttributesImplApi21Parcelizer().read(textClassifier);
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        return AudioAttributesImplApi21Parcelizer().AudioAttributesImplApi26Parcelizer();
    }

    public void setTextFuture(Future<configureFromLongCreator> future) {
        this.RemoteActionCompatParcelizer = future;
        if (future != null) {
            requestLayout();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        write();
        super.onMeasure(i, i2);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        setEnabled setenabled = this.MediaBrowserCompatCustomActionResultReceiver;
        if (setenabled != null) {
            setenabled.AudioAttributesImplApi26Parcelizer();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        setEnabled setenabled = this.MediaBrowserCompatCustomActionResultReceiver;
        if (setenabled != null) {
            setenabled.AudioAttributesImplApi26Parcelizer();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        setEnabled setenabled = this.MediaBrowserCompatCustomActionResultReceiver;
        if (setenabled != null) {
            setenabled.AudioAttributesImplApi26Parcelizer();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i != 0 ? getDefaultViewModelCreationExtras.write(context, i) : null, i2 != 0 ? getDefaultViewModelCreationExtras.write(context, i2) : null, i3 != 0 ? getDefaultViewModelCreationExtras.write(context, i3) : null, i4 != 0 ? getDefaultViewModelCreationExtras.write(context, i4) : null);
        setEnabled setenabled = this.MediaBrowserCompatCustomActionResultReceiver;
        if (setenabled != null) {
            setenabled.AudioAttributesImplApi26Parcelizer();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        setEnabled setenabled = this.MediaBrowserCompatCustomActionResultReceiver;
        if (setenabled != null) {
            setenabled.AudioAttributesImplApi26Parcelizer();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i != 0 ? getDefaultViewModelCreationExtras.write(context, i) : null, i2 != 0 ? getDefaultViewModelCreationExtras.write(context, i2) : null, i3 != 0 ? getDefaultViewModelCreationExtras.write(context, i3) : null, i4 != 0 ? getDefaultViewModelCreationExtras.write(context, i4) : null);
        setEnabled setenabled = this.MediaBrowserCompatCustomActionResultReceiver;
        if (setenabled != null) {
            setenabled.AudioAttributesImplApi26Parcelizer();
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.MediaBrowserCompatCustomActionResultReceiver.RemoteActionCompatParcelizer(colorStateList);
        this.MediaBrowserCompatCustomActionResultReceiver.AudioAttributesCompatParcelizer();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.MediaBrowserCompatCustomActionResultReceiver.RemoteActionCompatParcelizer(mode);
        this.MediaBrowserCompatCustomActionResultReceiver.AudioAttributesCompatParcelizer();
    }

    @Override // android.widget.TextView
    public void setTypeface(Typeface typeface, int i) {
        if (this.IconCompatParcelizer) {
            return;
        }
        Typeface typeface2 = (typeface == null || i <= 0) ? null : findConvertingContentDeserializer.read(getContext(), typeface, i);
        this.IconCompatParcelizer = true;
        if (typeface2 != null) {
            typeface = typeface2;
        }
        try {
            super.setTypeface(typeface, i);
        } finally {
            this.IconCompatParcelizer = false;
        }
    }

    IconCompatParcelizer AudioAttributesImplApi21Parcelizer() {
        if (this.AudioAttributesCompatParcelizer == null) {
            this.AudioAttributesCompatParcelizer = new read();
        }
        return this.AudioAttributesCompatParcelizer;
    }

    class write implements IconCompatParcelizer {
        @Override // androidx.appcompat.widget.AppCompatTextView.IconCompatParcelizer
        public void IconCompatParcelizer(int i) {
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.IconCompatParcelizer
        public void RemoteActionCompatParcelizer(int i) {
        }

        write() {
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.IconCompatParcelizer
        public int write() {
            return AppCompatTextView.super.getAutoSizeMaxTextSize();
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.IconCompatParcelizer
        public int RemoteActionCompatParcelizer() {
            return AppCompatTextView.super.getAutoSizeMinTextSize();
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.IconCompatParcelizer
        public int IconCompatParcelizer() {
            return AppCompatTextView.super.getAutoSizeStepGranularity();
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.IconCompatParcelizer
        public int[] read() {
            return AppCompatTextView.super.getAutoSizeTextAvailableSizes();
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.IconCompatParcelizer
        public int AudioAttributesCompatParcelizer() {
            return AppCompatTextView.super.getAutoSizeTextType();
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.IconCompatParcelizer
        public TextClassifier AudioAttributesImplApi26Parcelizer() {
            return AppCompatTextView.super.getTextClassifier();
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.IconCompatParcelizer
        public void IconCompatParcelizer(int i, int i2, int i3, int i4) {
            AppCompatTextView.super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.IconCompatParcelizer
        public void RemoteActionCompatParcelizer(int[] iArr, int i) {
            AppCompatTextView.super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.IconCompatParcelizer
        public void AudioAttributesCompatParcelizer(int i) {
            AppCompatTextView.super.setAutoSizeTextTypeWithDefaults(i);
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.IconCompatParcelizer
        public void read(TextClassifier textClassifier) {
            AppCompatTextView.super.setTextClassifier(textClassifier);
        }
    }

    class read extends write {
        read() {
            super();
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.write, androidx.appcompat.widget.AppCompatTextView.IconCompatParcelizer
        public void IconCompatParcelizer(int i) {
            AppCompatTextView.super.setFirstBaselineToTopHeight(i);
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.write, androidx.appcompat.widget.AppCompatTextView.IconCompatParcelizer
        public void RemoteActionCompatParcelizer(int i) {
            AppCompatTextView.super.setLastBaselineToBottomHeight(i);
        }
    }
}
