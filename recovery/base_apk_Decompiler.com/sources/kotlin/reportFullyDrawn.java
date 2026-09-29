package kotlin;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CheckedTextView;
import kotlin._init_lambda5;

/* JADX INFO: loaded from: classes.dex */
public class reportFullyDrawn {
    private final CheckedTextView MediaBrowserCompatItemReceiver;
    private boolean write;
    private ColorStateList IconCompatParcelizer = null;
    private PorterDuff.Mode AudioAttributesCompatParcelizer = null;
    private boolean RemoteActionCompatParcelizer = false;
    private boolean read = false;

    public reportFullyDrawn(CheckedTextView checkedTextView) {
        this.MediaBrowserCompatItemReceiver = checkedTextView;
    }

    public void write(AttributeSet attributeSet, int i) {
        int iMediaBrowserCompatItemReceiver;
        int iMediaBrowserCompatItemReceiver2;
        setTitle settitle = setTitle.read(this.MediaBrowserCompatItemReceiver.getContext(), attributeSet, _init_lambda5.AudioAttributesImplApi26Parcelizer.CheckedTextView, i, 0);
        CheckedTextView checkedTextView = this.MediaBrowserCompatItemReceiver;
        InvalidTypeIdException.IconCompatParcelizer(checkedTextView, checkedTextView.getContext(), _init_lambda5.AudioAttributesImplApi26Parcelizer.CheckedTextView, attributeSet, settitle.AudioAttributesCompatParcelizer(), i, 0);
        try {
            if (settitle.AudioAttributesImplApi26Parcelizer(_init_lambda5.AudioAttributesImplApi26Parcelizer.CheckedTextView_checkMarkCompat) && (iMediaBrowserCompatItemReceiver2 = settitle.MediaBrowserCompatItemReceiver(_init_lambda5.AudioAttributesImplApi26Parcelizer.CheckedTextView_checkMarkCompat, 0)) != 0) {
                try {
                    CheckedTextView checkedTextView2 = this.MediaBrowserCompatItemReceiver;
                    checkedTextView2.setCheckMarkDrawable(getDefaultViewModelCreationExtras.write(checkedTextView2.getContext(), iMediaBrowserCompatItemReceiver2));
                } catch (Resources.NotFoundException unused) {
                    if (settitle.AudioAttributesImplApi26Parcelizer(_init_lambda5.AudioAttributesImplApi26Parcelizer.CheckedTextView_android_checkMark)) {
                        CheckedTextView checkedTextView3 = this.MediaBrowserCompatItemReceiver;
                        checkedTextView3.setCheckMarkDrawable(getDefaultViewModelCreationExtras.write(checkedTextView3.getContext(), iMediaBrowserCompatItemReceiver));
                    }
                }
            } else if (settitle.AudioAttributesImplApi26Parcelizer(_init_lambda5.AudioAttributesImplApi26Parcelizer.CheckedTextView_android_checkMark) && (iMediaBrowserCompatItemReceiver = settitle.MediaBrowserCompatItemReceiver(_init_lambda5.AudioAttributesImplApi26Parcelizer.CheckedTextView_android_checkMark, 0)) != 0) {
                CheckedTextView checkedTextView32 = this.MediaBrowserCompatItemReceiver;
                checkedTextView32.setCheckMarkDrawable(getDefaultViewModelCreationExtras.write(checkedTextView32.getContext(), iMediaBrowserCompatItemReceiver));
            }
            if (settitle.AudioAttributesImplApi26Parcelizer(_init_lambda5.AudioAttributesImplApi26Parcelizer.CheckedTextView_checkMarkTint)) {
                getDefaultConstructor.AudioAttributesCompatParcelizer(this.MediaBrowserCompatItemReceiver, settitle.write(_init_lambda5.AudioAttributesImplApi26Parcelizer.CheckedTextView_checkMarkTint));
            }
            if (settitle.AudioAttributesImplApi26Parcelizer(_init_lambda5.AudioAttributesImplApi26Parcelizer.CheckedTextView_checkMarkTintMode)) {
                getDefaultConstructor.read(this.MediaBrowserCompatItemReceiver, IntentSenderRequest.write(settitle.read(_init_lambda5.AudioAttributesImplApi26Parcelizer.CheckedTextView_checkMarkTintMode, -1), null));
            }
        } finally {
            settitle.write();
        }
    }

    public void write(ColorStateList colorStateList) {
        this.IconCompatParcelizer = colorStateList;
        this.RemoteActionCompatParcelizer = true;
        RemoteActionCompatParcelizer();
    }

    public void AudioAttributesCompatParcelizer(PorterDuff.Mode mode) {
        this.AudioAttributesCompatParcelizer = mode;
        this.read = true;
        RemoteActionCompatParcelizer();
    }

    public void write() {
        if (this.write) {
            this.write = false;
        } else {
            this.write = true;
            RemoteActionCompatParcelizer();
        }
    }

    public void RemoteActionCompatParcelizer() {
        Drawable drawableIconCompatParcelizer = getDefaultConstructor.IconCompatParcelizer(this.MediaBrowserCompatItemReceiver);
        if (drawableIconCompatParcelizer != null) {
            if (this.RemoteActionCompatParcelizer || this.read) {
                Drawable drawableMutate = findFormatOverrides.AudioAttributesImplApi26Parcelizer(drawableIconCompatParcelizer).mutate();
                if (this.RemoteActionCompatParcelizer) {
                    findFormatOverrides.AudioAttributesCompatParcelizer(drawableMutate, this.IconCompatParcelizer);
                }
                if (this.read) {
                    findFormatOverrides.read(drawableMutate, this.AudioAttributesCompatParcelizer);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(this.MediaBrowserCompatItemReceiver.getDrawableState());
                }
                this.MediaBrowserCompatItemReceiver.setCheckMarkDrawable(drawableMutate);
            }
        }
    }
}
