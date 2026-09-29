package kotlin;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import kotlin._init_lambda5;

/* JADX INFO: loaded from: classes.dex */
public class startActivityForResult {
    private boolean AudioAttributesCompatParcelizer;
    private final CompoundButton AudioAttributesImplBaseParcelizer;
    private ColorStateList read = null;
    private PorterDuff.Mode RemoteActionCompatParcelizer = null;
    private boolean write = false;
    private boolean IconCompatParcelizer = false;

    public int read(int i) {
        return i;
    }

    public startActivityForResult(CompoundButton compoundButton) {
        this.AudioAttributesImplBaseParcelizer = compoundButton;
    }

    public void AudioAttributesCompatParcelizer(AttributeSet attributeSet, int i) {
        int iMediaBrowserCompatItemReceiver;
        int iMediaBrowserCompatItemReceiver2;
        setTitle settitle = setTitle.read(this.AudioAttributesImplBaseParcelizer.getContext(), attributeSet, _init_lambda5.AudioAttributesImplApi26Parcelizer.CompoundButton, i, 0);
        CompoundButton compoundButton = this.AudioAttributesImplBaseParcelizer;
        InvalidTypeIdException.IconCompatParcelizer(compoundButton, compoundButton.getContext(), _init_lambda5.AudioAttributesImplApi26Parcelizer.CompoundButton, attributeSet, settitle.AudioAttributesCompatParcelizer(), i, 0);
        try {
            if (settitle.AudioAttributesImplApi26Parcelizer(_init_lambda5.AudioAttributesImplApi26Parcelizer.CompoundButton_buttonCompat) && (iMediaBrowserCompatItemReceiver2 = settitle.MediaBrowserCompatItemReceiver(_init_lambda5.AudioAttributesImplApi26Parcelizer.CompoundButton_buttonCompat, 0)) != 0) {
                try {
                    CompoundButton compoundButton2 = this.AudioAttributesImplBaseParcelizer;
                    compoundButton2.setButtonDrawable(getDefaultViewModelCreationExtras.write(compoundButton2.getContext(), iMediaBrowserCompatItemReceiver2));
                } catch (Resources.NotFoundException unused) {
                    if (settitle.AudioAttributesImplApi26Parcelizer(_init_lambda5.AudioAttributesImplApi26Parcelizer.CompoundButton_android_button)) {
                        CompoundButton compoundButton3 = this.AudioAttributesImplBaseParcelizer;
                        compoundButton3.setButtonDrawable(getDefaultViewModelCreationExtras.write(compoundButton3.getContext(), iMediaBrowserCompatItemReceiver));
                    }
                }
            } else if (settitle.AudioAttributesImplApi26Parcelizer(_init_lambda5.AudioAttributesImplApi26Parcelizer.CompoundButton_android_button) && (iMediaBrowserCompatItemReceiver = settitle.MediaBrowserCompatItemReceiver(_init_lambda5.AudioAttributesImplApi26Parcelizer.CompoundButton_android_button, 0)) != 0) {
                CompoundButton compoundButton32 = this.AudioAttributesImplBaseParcelizer;
                compoundButton32.setButtonDrawable(getDefaultViewModelCreationExtras.write(compoundButton32.getContext(), iMediaBrowserCompatItemReceiver));
            }
            if (settitle.AudioAttributesImplApi26Parcelizer(_init_lambda5.AudioAttributesImplApi26Parcelizer.CompoundButton_buttonTint)) {
                _methods.write(this.AudioAttributesImplBaseParcelizer, settitle.write(_init_lambda5.AudioAttributesImplApi26Parcelizer.CompoundButton_buttonTint));
            }
            if (settitle.AudioAttributesImplApi26Parcelizer(_init_lambda5.AudioAttributesImplApi26Parcelizer.CompoundButton_buttonTintMode)) {
                _methods.RemoteActionCompatParcelizer(this.AudioAttributesImplBaseParcelizer, IntentSenderRequest.write(settitle.read(_init_lambda5.AudioAttributesImplApi26Parcelizer.CompoundButton_buttonTintMode, -1), null));
            }
        } finally {
            settitle.write();
        }
    }

    public void write(ColorStateList colorStateList) {
        this.read = colorStateList;
        this.write = true;
        AudioAttributesCompatParcelizer();
    }

    public ColorStateList read() {
        return this.read;
    }

    public void write(PorterDuff.Mode mode) {
        this.RemoteActionCompatParcelizer = mode;
        this.IconCompatParcelizer = true;
        AudioAttributesCompatParcelizer();
    }

    public void IconCompatParcelizer() {
        if (this.AudioAttributesCompatParcelizer) {
            this.AudioAttributesCompatParcelizer = false;
        } else {
            this.AudioAttributesCompatParcelizer = true;
            AudioAttributesCompatParcelizer();
        }
    }

    void AudioAttributesCompatParcelizer() {
        Drawable drawableIconCompatParcelizer = _methods.IconCompatParcelizer(this.AudioAttributesImplBaseParcelizer);
        if (drawableIconCompatParcelizer != null) {
            if (this.write || this.IconCompatParcelizer) {
                Drawable drawableMutate = findFormatOverrides.AudioAttributesImplApi26Parcelizer(drawableIconCompatParcelizer).mutate();
                if (this.write) {
                    findFormatOverrides.AudioAttributesCompatParcelizer(drawableMutate, this.read);
                }
                if (this.IconCompatParcelizer) {
                    findFormatOverrides.read(drawableMutate, this.RemoteActionCompatParcelizer);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(this.AudioAttributesImplBaseParcelizer.getDrawableState());
                }
                this.AudioAttributesImplBaseParcelizer.setButtonDrawable(drawableMutate);
            }
        }
    }
}
