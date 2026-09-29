package kotlin;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import kotlin._init_lambda5;

/* JADX INFO: loaded from: classes.dex */
public class handleOnBackCancelled {
    private setView AudioAttributesCompatParcelizer;
    private setView IconCompatParcelizer;
    private int RemoteActionCompatParcelizer = 0;
    private final ImageView read;
    private setView write;

    public handleOnBackCancelled(ImageView imageView) {
        this.read = imageView;
    }

    public void RemoteActionCompatParcelizer(AttributeSet attributeSet, int i) {
        int iMediaBrowserCompatItemReceiver;
        setTitle settitle = setTitle.read(this.read.getContext(), attributeSet, _init_lambda5.AudioAttributesImplApi26Parcelizer.AppCompatImageView, i, 0);
        ImageView imageView = this.read;
        InvalidTypeIdException.IconCompatParcelizer(imageView, imageView.getContext(), _init_lambda5.AudioAttributesImplApi26Parcelizer.AppCompatImageView, attributeSet, settitle.AudioAttributesCompatParcelizer(), i, 0);
        try {
            Drawable drawable = this.read.getDrawable();
            if (drawable == null && (iMediaBrowserCompatItemReceiver = settitle.MediaBrowserCompatItemReceiver(_init_lambda5.AudioAttributesImplApi26Parcelizer.AppCompatImageView_srcCompat, -1)) != -1 && (drawable = getDefaultViewModelCreationExtras.write(this.read.getContext(), iMediaBrowserCompatItemReceiver)) != null) {
                this.read.setImageDrawable(drawable);
            }
            if (drawable != null) {
                IntentSenderRequest.read(drawable);
            }
            if (settitle.AudioAttributesImplApi26Parcelizer(_init_lambda5.AudioAttributesImplApi26Parcelizer.AppCompatImageView_tint)) {
                resolveType.AudioAttributesCompatParcelizer(this.read, settitle.write(_init_lambda5.AudioAttributesImplApi26Parcelizer.AppCompatImageView_tint));
            }
            if (settitle.AudioAttributesImplApi26Parcelizer(_init_lambda5.AudioAttributesImplApi26Parcelizer.AppCompatImageView_tintMode)) {
                resolveType.read(this.read, IntentSenderRequest.write(settitle.read(_init_lambda5.AudioAttributesImplApi26Parcelizer.AppCompatImageView_tintMode, -1), null));
            }
        } finally {
            settitle.write();
        }
    }

    public void IconCompatParcelizer(int i) {
        if (i != 0) {
            Drawable drawableWrite = getDefaultViewModelCreationExtras.write(this.read.getContext(), i);
            if (drawableWrite != null) {
                IntentSenderRequest.read(drawableWrite);
            }
            this.read.setImageDrawable(drawableWrite);
        } else {
            this.read.setImageDrawable(null);
        }
        IconCompatParcelizer();
    }

    public boolean RemoteActionCompatParcelizer() {
        return !(this.read.getBackground() instanceof RippleDrawable);
    }

    public void RemoteActionCompatParcelizer(ColorStateList colorStateList) {
        if (this.IconCompatParcelizer == null) {
            this.IconCompatParcelizer = new setView();
        }
        this.IconCompatParcelizer.RemoteActionCompatParcelizer = colorStateList;
        this.IconCompatParcelizer.AudioAttributesCompatParcelizer = true;
        IconCompatParcelizer();
    }

    public void IconCompatParcelizer(PorterDuff.Mode mode) {
        if (this.IconCompatParcelizer == null) {
            this.IconCompatParcelizer = new setView();
        }
        this.IconCompatParcelizer.write = mode;
        this.IconCompatParcelizer.IconCompatParcelizer = true;
        IconCompatParcelizer();
    }

    public void IconCompatParcelizer() {
        Drawable drawable = this.read.getDrawable();
        if (drawable != null) {
            IntentSenderRequest.read(drawable);
        }
        if (drawable != null) {
            if (write() && RemoteActionCompatParcelizer(drawable)) {
                return;
            }
            setView setview = this.IconCompatParcelizer;
            if (setview != null) {
                startIntentSenderForResult.AudioAttributesCompatParcelizer(drawable, setview, this.read.getDrawableState());
                return;
            }
            setView setview2 = this.AudioAttributesCompatParcelizer;
            if (setview2 != null) {
                startIntentSenderForResult.AudioAttributesCompatParcelizer(drawable, setview2, this.read.getDrawableState());
            }
        }
    }

    private boolean write() {
        return this.AudioAttributesCompatParcelizer != null;
    }

    private boolean RemoteActionCompatParcelizer(Drawable drawable) {
        if (this.write == null) {
            this.write = new setView();
        }
        setView setview = this.write;
        setview.read();
        ColorStateList colorStateListWrite = resolveType.write(this.read);
        if (colorStateListWrite != null) {
            setview.AudioAttributesCompatParcelizer = true;
            setview.RemoteActionCompatParcelizer = colorStateListWrite;
        }
        PorterDuff.Mode mode = resolveType.read(this.read);
        if (mode != null) {
            setview.IconCompatParcelizer = true;
            setview.write = mode;
        }
        if (!setview.AudioAttributesCompatParcelizer && !setview.IconCompatParcelizer) {
            return false;
        }
        startIntentSenderForResult.AudioAttributesCompatParcelizer(drawable, setview, this.read.getDrawableState());
        return true;
    }

    public void AudioAttributesCompatParcelizer(Drawable drawable) {
        this.RemoteActionCompatParcelizer = drawable.getLevel();
    }

    public void read() {
        if (this.read.getDrawable() != null) {
            this.read.getDrawable().setLevel(this.RemoteActionCompatParcelizer);
        }
    }
}
