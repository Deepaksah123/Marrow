package kotlin;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import kotlin._init_lambda5;

/* JADX INFO: loaded from: classes.dex */
public class addCancellable {
    private final View AudioAttributesImplApi26Parcelizer;
    private setView RemoteActionCompatParcelizer;
    private setView read;
    private setView write;
    private int AudioAttributesCompatParcelizer = -1;
    private final startIntentSenderForResult IconCompatParcelizer = startIntentSenderForResult.write();

    public addCancellable(View view) {
        this.AudioAttributesImplApi26Parcelizer = view;
    }

    public void IconCompatParcelizer(AttributeSet attributeSet, int i) {
        setTitle settitle = setTitle.read(this.AudioAttributesImplApi26Parcelizer.getContext(), attributeSet, _init_lambda5.AudioAttributesImplApi26Parcelizer.ViewBackgroundHelper, i, 0);
        View view = this.AudioAttributesImplApi26Parcelizer;
        InvalidTypeIdException.IconCompatParcelizer(view, view.getContext(), _init_lambda5.AudioAttributesImplApi26Parcelizer.ViewBackgroundHelper, attributeSet, settitle.AudioAttributesCompatParcelizer(), i, 0);
        try {
            if (settitle.AudioAttributesImplApi26Parcelizer(_init_lambda5.AudioAttributesImplApi26Parcelizer.ViewBackgroundHelper_android_background)) {
                this.AudioAttributesCompatParcelizer = settitle.MediaBrowserCompatItemReceiver(_init_lambda5.AudioAttributesImplApi26Parcelizer.ViewBackgroundHelper_android_background, -1);
                ColorStateList colorStateListWrite = this.IconCompatParcelizer.write(this.AudioAttributesImplApi26Parcelizer.getContext(), this.AudioAttributesCompatParcelizer);
                if (colorStateListWrite != null) {
                    IconCompatParcelizer(colorStateListWrite);
                }
            }
            if (settitle.AudioAttributesImplApi26Parcelizer(_init_lambda5.AudioAttributesImplApi26Parcelizer.ViewBackgroundHelper_backgroundTint)) {
                InvalidTypeIdException.RemoteActionCompatParcelizer(this.AudioAttributesImplApi26Parcelizer, settitle.write(_init_lambda5.AudioAttributesImplApi26Parcelizer.ViewBackgroundHelper_backgroundTint));
            }
            if (settitle.AudioAttributesImplApi26Parcelizer(_init_lambda5.AudioAttributesImplApi26Parcelizer.ViewBackgroundHelper_backgroundTintMode)) {
                InvalidTypeIdException.AudioAttributesCompatParcelizer(this.AudioAttributesImplApi26Parcelizer, IntentSenderRequest.write(settitle.read(_init_lambda5.AudioAttributesImplApi26Parcelizer.ViewBackgroundHelper_backgroundTintMode, -1), null));
            }
        } finally {
            settitle.write();
        }
    }

    public void write(int i) {
        this.AudioAttributesCompatParcelizer = i;
        startIntentSenderForResult startintentsenderforresult = this.IconCompatParcelizer;
        IconCompatParcelizer(startintentsenderforresult != null ? startintentsenderforresult.write(this.AudioAttributesImplApi26Parcelizer.getContext(), i) : null);
        read();
    }

    public void AudioAttributesCompatParcelizer(Drawable drawable) {
        this.AudioAttributesCompatParcelizer = -1;
        IconCompatParcelizer(null);
        read();
    }

    public void AudioAttributesCompatParcelizer(ColorStateList colorStateList) {
        if (this.read == null) {
            this.read = new setView();
        }
        this.read.RemoteActionCompatParcelizer = colorStateList;
        this.read.AudioAttributesCompatParcelizer = true;
        read();
    }

    public ColorStateList RemoteActionCompatParcelizer() {
        setView setview = this.read;
        if (setview != null) {
            return setview.RemoteActionCompatParcelizer;
        }
        return null;
    }

    public void RemoteActionCompatParcelizer(PorterDuff.Mode mode) {
        if (this.read == null) {
            this.read = new setView();
        }
        this.read.write = mode;
        this.read.IconCompatParcelizer = true;
        read();
    }

    public PorterDuff.Mode write() {
        setView setview = this.read;
        if (setview != null) {
            return setview.write;
        }
        return null;
    }

    public void read() {
        Drawable background = this.AudioAttributesImplApi26Parcelizer.getBackground();
        if (background != null) {
            if (IconCompatParcelizer() && write(background)) {
                return;
            }
            setView setview = this.read;
            if (setview != null) {
                startIntentSenderForResult.AudioAttributesCompatParcelizer(background, setview, this.AudioAttributesImplApi26Parcelizer.getDrawableState());
                return;
            }
            setView setview2 = this.RemoteActionCompatParcelizer;
            if (setview2 != null) {
                startIntentSenderForResult.AudioAttributesCompatParcelizer(background, setview2, this.AudioAttributesImplApi26Parcelizer.getDrawableState());
            }
        }
    }

    void IconCompatParcelizer(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.RemoteActionCompatParcelizer == null) {
                this.RemoteActionCompatParcelizer = new setView();
            }
            this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer = colorStateList;
            this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer = true;
        } else {
            this.RemoteActionCompatParcelizer = null;
        }
        read();
    }

    private boolean IconCompatParcelizer() {
        return this.RemoteActionCompatParcelizer != null;
    }

    private boolean write(Drawable drawable) {
        if (this.write == null) {
            this.write = new setView();
        }
        setView setview = this.write;
        setview.read();
        ColorStateList colorStateListWrite = InvalidTypeIdException.write(this.AudioAttributesImplApi26Parcelizer);
        if (colorStateListWrite != null) {
            setview.AudioAttributesCompatParcelizer = true;
            setview.RemoteActionCompatParcelizer = colorStateListWrite;
        }
        PorterDuff.Mode modeAudioAttributesImplApi21Parcelizer = InvalidTypeIdException.AudioAttributesImplApi21Parcelizer(this.AudioAttributesImplApi26Parcelizer);
        if (modeAudioAttributesImplApi21Parcelizer != null) {
            setview.IconCompatParcelizer = true;
            setview.write = modeAudioAttributesImplApi21Parcelizer;
        }
        if (!setview.AudioAttributesCompatParcelizer && !setview.IconCompatParcelizer) {
            return false;
        }
        startIntentSenderForResult.AudioAttributesCompatParcelizer(drawable, setview, this.AudioAttributesImplApi26Parcelizer.getDrawableState());
        return true;
    }
}
