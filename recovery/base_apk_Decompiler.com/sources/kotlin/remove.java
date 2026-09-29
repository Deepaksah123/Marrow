package kotlin;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin._init_lambda5;

/* JADX INFO: loaded from: classes.dex */
public class remove extends handleOnBackStarted {
    private boolean AudioAttributesCompatParcelizer;
    private final SeekBar AudioAttributesImplApi21Parcelizer;
    private boolean IconCompatParcelizer;
    private ColorStateList RemoteActionCompatParcelizer;
    private PorterDuff.Mode read;
    private Drawable write;

    public remove(SeekBar seekBar) {
        super(seekBar);
        this.RemoteActionCompatParcelizer = null;
        this.read = null;
        this.AudioAttributesCompatParcelizer = false;
        this.IconCompatParcelizer = false;
        this.AudioAttributesImplApi21Parcelizer = seekBar;
    }

    @Override // kotlin.handleOnBackStarted
    public void AudioAttributesCompatParcelizer(AttributeSet attributeSet, int i) {
        super.AudioAttributesCompatParcelizer(attributeSet, i);
        setTitle settitle = setTitle.read(this.AudioAttributesImplApi21Parcelizer.getContext(), attributeSet, _init_lambda5.AudioAttributesImplApi26Parcelizer.AppCompatSeekBar, i, 0);
        SeekBar seekBar = this.AudioAttributesImplApi21Parcelizer;
        InvalidTypeIdException.IconCompatParcelizer(seekBar, seekBar.getContext(), _init_lambda5.AudioAttributesImplApi26Parcelizer.AppCompatSeekBar, attributeSet, settitle.AudioAttributesCompatParcelizer(), i, 0);
        Drawable drawableRemoteActionCompatParcelizer = settitle.RemoteActionCompatParcelizer(_init_lambda5.AudioAttributesImplApi26Parcelizer.AppCompatSeekBar_android_thumb);
        if (drawableRemoteActionCompatParcelizer != null) {
            this.AudioAttributesImplApi21Parcelizer.setThumb(drawableRemoteActionCompatParcelizer);
        }
        IconCompatParcelizer(settitle.IconCompatParcelizer(_init_lambda5.AudioAttributesImplApi26Parcelizer.AppCompatSeekBar_tickMark));
        if (settitle.AudioAttributesImplApi26Parcelizer(_init_lambda5.AudioAttributesImplApi26Parcelizer.AppCompatSeekBar_tickMarkTintMode)) {
            this.read = IntentSenderRequest.write(settitle.read(_init_lambda5.AudioAttributesImplApi26Parcelizer.AppCompatSeekBar_tickMarkTintMode, -1), this.read);
            this.IconCompatParcelizer = true;
        }
        if (settitle.AudioAttributesImplApi26Parcelizer(_init_lambda5.AudioAttributesImplApi26Parcelizer.AppCompatSeekBar_tickMarkTint)) {
            this.RemoteActionCompatParcelizer = settitle.write(_init_lambda5.AudioAttributesImplApi26Parcelizer.AppCompatSeekBar_tickMarkTint);
            this.AudioAttributesCompatParcelizer = true;
        }
        settitle.write();
        AudioAttributesCompatParcelizer();
    }

    void IconCompatParcelizer(Drawable drawable) {
        Drawable drawable2 = this.write;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.write = drawable;
        if (drawable != null) {
            drawable.setCallback(this.AudioAttributesImplApi21Parcelizer);
            findFormatOverrides.RemoteActionCompatParcelizer(drawable, InvalidTypeIdException.MediaBrowserCompatMediaItem(this.AudioAttributesImplApi21Parcelizer));
            if (drawable.isStateful()) {
                drawable.setState(this.AudioAttributesImplApi21Parcelizer.getDrawableState());
            }
            AudioAttributesCompatParcelizer();
        }
        this.AudioAttributesImplApi21Parcelizer.invalidate();
    }

    private void AudioAttributesCompatParcelizer() {
        Drawable drawable = this.write;
        if (drawable != null) {
            if (this.AudioAttributesCompatParcelizer || this.IconCompatParcelizer) {
                Drawable drawableAudioAttributesImplApi26Parcelizer = findFormatOverrides.AudioAttributesImplApi26Parcelizer(drawable.mutate());
                this.write = drawableAudioAttributesImplApi26Parcelizer;
                if (this.AudioAttributesCompatParcelizer) {
                    findFormatOverrides.AudioAttributesCompatParcelizer(drawableAudioAttributesImplApi26Parcelizer, this.RemoteActionCompatParcelizer);
                }
                if (this.IconCompatParcelizer) {
                    findFormatOverrides.read(this.write, this.read);
                }
                if (this.write.isStateful()) {
                    this.write.setState(this.AudioAttributesImplApi21Parcelizer.getDrawableState());
                }
            }
        }
    }

    public void RemoteActionCompatParcelizer() {
        Drawable drawable = this.write;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    public void IconCompatParcelizer() {
        Drawable drawable = this.write;
        if (drawable != null && drawable.isStateful() && drawable.setState(this.AudioAttributesImplApi21Parcelizer.getDrawableState())) {
            this.AudioAttributesImplApi21Parcelizer.invalidateDrawable(drawable);
        }
    }

    public void RemoteActionCompatParcelizer(Canvas canvas) {
        if (this.write != null) {
            int max = this.AudioAttributesImplApi21Parcelizer.getMax();
            if (max > 1) {
                int intrinsicWidth = this.write.getIntrinsicWidth();
                int intrinsicHeight = this.write.getIntrinsicHeight();
                int i = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i2 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.write.setBounds(-i, -i2, i, i2);
                float width = ((this.AudioAttributesImplApi21Parcelizer.getWidth() - this.AudioAttributesImplApi21Parcelizer.getPaddingLeft()) - this.AudioAttributesImplApi21Parcelizer.getPaddingRight()) / max;
                int iSave = canvas.save();
                canvas.translate(this.AudioAttributesImplApi21Parcelizer.getPaddingLeft(), this.AudioAttributesImplApi21Parcelizer.getHeight() / 2);
                for (int i3 = 0; i3 <= max; i3++) {
                    this.write.draw(canvas);
                    canvas.translate(width, BitmapDescriptorFactory.HUE_RED);
                }
                canvas.restoreToCount(iSave);
            }
        }
    }
}
