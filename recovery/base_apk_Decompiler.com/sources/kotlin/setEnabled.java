package kotlin;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.LocaleList;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.ref.WeakReference;
import kotlin._init_lambda5;
import kotlin._parseDoublePrimitive;

/* JADX INFO: loaded from: classes.dex */
public class setEnabled {
    private setView AudioAttributesCompatParcelizer;
    private setView AudioAttributesImplApi21Parcelizer;
    private Typeface AudioAttributesImplApi26Parcelizer;
    private setView AudioAttributesImplBaseParcelizer;
    private boolean IconCompatParcelizer;
    private setView MediaBrowserCompatCustomActionResultReceiver;
    private setView MediaBrowserCompatItemReceiver;
    private final TextView MediaBrowserCompatMediaItem;
    private int MediaMetadataCompat = 0;
    private int RatingCompat = -1;
    private setView RemoteActionCompatParcelizer;
    private final setEnabledChangedCallbackactivity_release read;
    private setView write;

    public setEnabled(TextView textView) {
        this.MediaBrowserCompatMediaItem = textView;
        this.read = new setEnabledChangedCallbackactivity_release(textView);
    }

    public void read(AttributeSet attributeSet, int i) {
        boolean zAudioAttributesCompatParcelizer;
        boolean z;
        String strAudioAttributesImplApi21Parcelizer;
        String strAudioAttributesImplApi21Parcelizer2;
        Context context = this.MediaBrowserCompatMediaItem.getContext();
        startIntentSenderForResult startintentsenderforresultWrite = startIntentSenderForResult.write();
        setTitle settitle = setTitle.read(context, attributeSet, _init_lambda5.AudioAttributesImplApi26Parcelizer.AppCompatTextHelper, i, 0);
        TextView textView = this.MediaBrowserCompatMediaItem;
        InvalidTypeIdException.IconCompatParcelizer(textView, textView.getContext(), _init_lambda5.AudioAttributesImplApi26Parcelizer.AppCompatTextHelper, attributeSet, settitle.AudioAttributesCompatParcelizer(), i, 0);
        int iMediaBrowserCompatItemReceiver = settitle.MediaBrowserCompatItemReceiver(_init_lambda5.AudioAttributesImplApi26Parcelizer.AppCompatTextHelper_android_textAppearance, -1);
        if (settitle.AudioAttributesImplApi26Parcelizer(_init_lambda5.AudioAttributesImplApi26Parcelizer.AppCompatTextHelper_android_drawableLeft)) {
            this.RemoteActionCompatParcelizer = write(context, startintentsenderforresultWrite, settitle.MediaBrowserCompatItemReceiver(_init_lambda5.AudioAttributesImplApi26Parcelizer.AppCompatTextHelper_android_drawableLeft, 0));
        }
        if (settitle.AudioAttributesImplApi26Parcelizer(_init_lambda5.AudioAttributesImplApi26Parcelizer.AppCompatTextHelper_android_drawableTop)) {
            this.MediaBrowserCompatItemReceiver = write(context, startintentsenderforresultWrite, settitle.MediaBrowserCompatItemReceiver(_init_lambda5.AudioAttributesImplApi26Parcelizer.AppCompatTextHelper_android_drawableTop, 0));
        }
        if (settitle.AudioAttributesImplApi26Parcelizer(_init_lambda5.AudioAttributesImplApi26Parcelizer.AppCompatTextHelper_android_drawableRight)) {
            this.MediaBrowserCompatCustomActionResultReceiver = write(context, startintentsenderforresultWrite, settitle.MediaBrowserCompatItemReceiver(_init_lambda5.AudioAttributesImplApi26Parcelizer.AppCompatTextHelper_android_drawableRight, 0));
        }
        if (settitle.AudioAttributesImplApi26Parcelizer(_init_lambda5.AudioAttributesImplApi26Parcelizer.AppCompatTextHelper_android_drawableBottom)) {
            this.write = write(context, startintentsenderforresultWrite, settitle.MediaBrowserCompatItemReceiver(_init_lambda5.AudioAttributesImplApi26Parcelizer.AppCompatTextHelper_android_drawableBottom, 0));
        }
        if (settitle.AudioAttributesImplApi26Parcelizer(_init_lambda5.AudioAttributesImplApi26Parcelizer.AppCompatTextHelper_android_drawableStart)) {
            this.AudioAttributesImplApi21Parcelizer = write(context, startintentsenderforresultWrite, settitle.MediaBrowserCompatItemReceiver(_init_lambda5.AudioAttributesImplApi26Parcelizer.AppCompatTextHelper_android_drawableStart, 0));
        }
        if (settitle.AudioAttributesImplApi26Parcelizer(_init_lambda5.AudioAttributesImplApi26Parcelizer.AppCompatTextHelper_android_drawableEnd)) {
            this.AudioAttributesCompatParcelizer = write(context, startintentsenderforresultWrite, settitle.MediaBrowserCompatItemReceiver(_init_lambda5.AudioAttributesImplApi26Parcelizer.AppCompatTextHelper_android_drawableEnd, 0));
        }
        settitle.write();
        boolean z2 = this.MediaBrowserCompatMediaItem.getTransformationMethod() instanceof PasswordTransformationMethod;
        boolean z3 = true;
        if (iMediaBrowserCompatItemReceiver != -1) {
            setTitle settitleAudioAttributesCompatParcelizer = setTitle.AudioAttributesCompatParcelizer(context, iMediaBrowserCompatItemReceiver, _init_lambda5.AudioAttributesImplApi26Parcelizer.TextAppearance);
            if (z2 || !settitleAudioAttributesCompatParcelizer.AudioAttributesImplApi26Parcelizer(_init_lambda5.AudioAttributesImplApi26Parcelizer.TextAppearance_textAllCaps)) {
                zAudioAttributesCompatParcelizer = false;
                z = false;
            } else {
                zAudioAttributesCompatParcelizer = settitleAudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(_init_lambda5.AudioAttributesImplApi26Parcelizer.TextAppearance_textAllCaps, false);
                z = true;
            }
            write(context, settitleAudioAttributesCompatParcelizer);
            strAudioAttributesImplApi21Parcelizer = settitleAudioAttributesCompatParcelizer.AudioAttributesImplApi26Parcelizer(_init_lambda5.AudioAttributesImplApi26Parcelizer.TextAppearance_textLocale) ? settitleAudioAttributesCompatParcelizer.AudioAttributesImplApi21Parcelizer(_init_lambda5.AudioAttributesImplApi26Parcelizer.TextAppearance_textLocale) : null;
            strAudioAttributesImplApi21Parcelizer2 = settitleAudioAttributesCompatParcelizer.AudioAttributesImplApi26Parcelizer(_init_lambda5.AudioAttributesImplApi26Parcelizer.TextAppearance_fontVariationSettings) ? settitleAudioAttributesCompatParcelizer.AudioAttributesImplApi21Parcelizer(_init_lambda5.AudioAttributesImplApi26Parcelizer.TextAppearance_fontVariationSettings) : null;
            settitleAudioAttributesCompatParcelizer.write();
        } else {
            zAudioAttributesCompatParcelizer = false;
            z = false;
            strAudioAttributesImplApi21Parcelizer = null;
            strAudioAttributesImplApi21Parcelizer2 = null;
        }
        setTitle settitle2 = setTitle.read(context, attributeSet, _init_lambda5.AudioAttributesImplApi26Parcelizer.TextAppearance, i, 0);
        if (z2 || !settitle2.AudioAttributesImplApi26Parcelizer(_init_lambda5.AudioAttributesImplApi26Parcelizer.TextAppearance_textAllCaps)) {
            z3 = z;
        } else {
            zAudioAttributesCompatParcelizer = settitle2.AudioAttributesCompatParcelizer(_init_lambda5.AudioAttributesImplApi26Parcelizer.TextAppearance_textAllCaps, false);
        }
        if (settitle2.AudioAttributesImplApi26Parcelizer(_init_lambda5.AudioAttributesImplApi26Parcelizer.TextAppearance_textLocale)) {
            strAudioAttributesImplApi21Parcelizer = settitle2.AudioAttributesImplApi21Parcelizer(_init_lambda5.AudioAttributesImplApi26Parcelizer.TextAppearance_textLocale);
        }
        if (settitle2.AudioAttributesImplApi26Parcelizer(_init_lambda5.AudioAttributesImplApi26Parcelizer.TextAppearance_fontVariationSettings)) {
            strAudioAttributesImplApi21Parcelizer2 = settitle2.AudioAttributesImplApi21Parcelizer(_init_lambda5.AudioAttributesImplApi26Parcelizer.TextAppearance_fontVariationSettings);
        }
        if (settitle2.AudioAttributesImplApi26Parcelizer(_init_lambda5.AudioAttributesImplApi26Parcelizer.TextAppearance_android_textSize) && settitle2.AudioAttributesCompatParcelizer(_init_lambda5.AudioAttributesImplApi26Parcelizer.TextAppearance_android_textSize, -1) == 0) {
            this.MediaBrowserCompatMediaItem.setTextSize(0, BitmapDescriptorFactory.HUE_RED);
        }
        write(context, settitle2);
        settitle2.write();
        if (!z2 && z3) {
            read(zAudioAttributesCompatParcelizer);
        }
        Typeface typeface = this.AudioAttributesImplApi26Parcelizer;
        if (typeface != null) {
            if (this.RatingCompat == -1) {
                this.MediaBrowserCompatMediaItem.setTypeface(typeface, this.MediaMetadataCompat);
            } else {
                this.MediaBrowserCompatMediaItem.setTypeface(typeface);
            }
        }
        if (strAudioAttributesImplApi21Parcelizer2 != null) {
            IconCompatParcelizer.RemoteActionCompatParcelizer(this.MediaBrowserCompatMediaItem, strAudioAttributesImplApi21Parcelizer2);
        }
        if (strAudioAttributesImplApi21Parcelizer != null) {
            read.write(this.MediaBrowserCompatMediaItem, read.read(strAudioAttributesImplApi21Parcelizer));
        }
        this.read.read(attributeSet, i);
        if (setChecked.RemoteActionCompatParcelizer && this.read.MediaBrowserCompatItemReceiver() != 0) {
            int[] iArrAudioAttributesCompatParcelizer = this.read.AudioAttributesCompatParcelizer();
            if (iArrAudioAttributesCompatParcelizer.length > 0) {
                if (IconCompatParcelizer.AudioAttributesCompatParcelizer(this.MediaBrowserCompatMediaItem) != -1.0f) {
                    IconCompatParcelizer.read(this.MediaBrowserCompatMediaItem, this.read.write(), this.read.RemoteActionCompatParcelizer(), this.read.IconCompatParcelizer(), 0);
                } else {
                    IconCompatParcelizer.AudioAttributesCompatParcelizer(this.MediaBrowserCompatMediaItem, iArrAudioAttributesCompatParcelizer, 0);
                }
            }
        }
        setTitle settitleIconCompatParcelizer = setTitle.IconCompatParcelizer(context, attributeSet, _init_lambda5.AudioAttributesImplApi26Parcelizer.AppCompatTextView);
        int iMediaBrowserCompatItemReceiver2 = settitleIconCompatParcelizer.MediaBrowserCompatItemReceiver(_init_lambda5.AudioAttributesImplApi26Parcelizer.AppCompatTextView_drawableLeftCompat, -1);
        Drawable drawableAudioAttributesCompatParcelizer = iMediaBrowserCompatItemReceiver2 != -1 ? startintentsenderforresultWrite.AudioAttributesCompatParcelizer(context, iMediaBrowserCompatItemReceiver2) : null;
        int iMediaBrowserCompatItemReceiver3 = settitleIconCompatParcelizer.MediaBrowserCompatItemReceiver(_init_lambda5.AudioAttributesImplApi26Parcelizer.AppCompatTextView_drawableTopCompat, -1);
        Drawable drawableAudioAttributesCompatParcelizer2 = iMediaBrowserCompatItemReceiver3 != -1 ? startintentsenderforresultWrite.AudioAttributesCompatParcelizer(context, iMediaBrowserCompatItemReceiver3) : null;
        int iMediaBrowserCompatItemReceiver4 = settitleIconCompatParcelizer.MediaBrowserCompatItemReceiver(_init_lambda5.AudioAttributesImplApi26Parcelizer.AppCompatTextView_drawableRightCompat, -1);
        Drawable drawableAudioAttributesCompatParcelizer3 = iMediaBrowserCompatItemReceiver4 != -1 ? startintentsenderforresultWrite.AudioAttributesCompatParcelizer(context, iMediaBrowserCompatItemReceiver4) : null;
        int iMediaBrowserCompatItemReceiver5 = settitleIconCompatParcelizer.MediaBrowserCompatItemReceiver(_init_lambda5.AudioAttributesImplApi26Parcelizer.AppCompatTextView_drawableBottomCompat, -1);
        Drawable drawableAudioAttributesCompatParcelizer4 = iMediaBrowserCompatItemReceiver5 != -1 ? startintentsenderforresultWrite.AudioAttributesCompatParcelizer(context, iMediaBrowserCompatItemReceiver5) : null;
        int iMediaBrowserCompatItemReceiver6 = settitleIconCompatParcelizer.MediaBrowserCompatItemReceiver(_init_lambda5.AudioAttributesImplApi26Parcelizer.AppCompatTextView_drawableStartCompat, -1);
        Drawable drawableAudioAttributesCompatParcelizer5 = iMediaBrowserCompatItemReceiver6 != -1 ? startintentsenderforresultWrite.AudioAttributesCompatParcelizer(context, iMediaBrowserCompatItemReceiver6) : null;
        int iMediaBrowserCompatItemReceiver7 = settitleIconCompatParcelizer.MediaBrowserCompatItemReceiver(_init_lambda5.AudioAttributesImplApi26Parcelizer.AppCompatTextView_drawableEndCompat, -1);
        write(drawableAudioAttributesCompatParcelizer, drawableAudioAttributesCompatParcelizer2, drawableAudioAttributesCompatParcelizer3, drawableAudioAttributesCompatParcelizer4, drawableAudioAttributesCompatParcelizer5, iMediaBrowserCompatItemReceiver7 != -1 ? startintentsenderforresultWrite.AudioAttributesCompatParcelizer(context, iMediaBrowserCompatItemReceiver7) : null);
        if (settitleIconCompatParcelizer.AudioAttributesImplApi26Parcelizer(_init_lambda5.AudioAttributesImplApi26Parcelizer.AppCompatTextView_drawableTint)) {
            _addSuperTypes.write(this.MediaBrowserCompatMediaItem, settitleIconCompatParcelizer.write(_init_lambda5.AudioAttributesImplApi26Parcelizer.AppCompatTextView_drawableTint));
        }
        if (settitleIconCompatParcelizer.AudioAttributesImplApi26Parcelizer(_init_lambda5.AudioAttributesImplApi26Parcelizer.AppCompatTextView_drawableTintMode)) {
            _addSuperTypes.AudioAttributesCompatParcelizer(this.MediaBrowserCompatMediaItem, IntentSenderRequest.write(settitleIconCompatParcelizer.read(_init_lambda5.AudioAttributesImplApi26Parcelizer.AppCompatTextView_drawableTintMode, -1), null));
        }
        int iAudioAttributesCompatParcelizer = settitleIconCompatParcelizer.AudioAttributesCompatParcelizer(_init_lambda5.AudioAttributesImplApi26Parcelizer.AppCompatTextView_firstBaselineToTopHeight, -1);
        int iAudioAttributesCompatParcelizer2 = settitleIconCompatParcelizer.AudioAttributesCompatParcelizer(_init_lambda5.AudioAttributesImplApi26Parcelizer.AppCompatTextView_lastBaselineToBottomHeight, -1);
        int iAudioAttributesCompatParcelizer3 = settitleIconCompatParcelizer.AudioAttributesCompatParcelizer(_init_lambda5.AudioAttributesImplApi26Parcelizer.AppCompatTextView_lineHeight, -1);
        settitleIconCompatParcelizer.write();
        if (iAudioAttributesCompatParcelizer != -1) {
            _addSuperTypes.AudioAttributesCompatParcelizer(this.MediaBrowserCompatMediaItem, iAudioAttributesCompatParcelizer);
        }
        if (iAudioAttributesCompatParcelizer2 != -1) {
            _addSuperTypes.write(this.MediaBrowserCompatMediaItem, iAudioAttributesCompatParcelizer2);
        }
        if (iAudioAttributesCompatParcelizer3 != -1) {
            _addSuperTypes.read(this.MediaBrowserCompatMediaItem, iAudioAttributesCompatParcelizer3);
        }
    }

    private void write(Context context, setTitle settitle) {
        int i;
        String strAudioAttributesImplApi21Parcelizer;
        this.MediaMetadataCompat = settitle.read(_init_lambda5.AudioAttributesImplApi26Parcelizer.TextAppearance_android_textStyle, this.MediaMetadataCompat);
        int i2 = settitle.read(_init_lambda5.AudioAttributesImplApi26Parcelizer.TextAppearance_android_textFontWeight, -1);
        this.RatingCompat = i2;
        if (i2 != -1) {
            this.MediaMetadataCompat &= 2;
        }
        if (settitle.AudioAttributesImplApi26Parcelizer(_init_lambda5.AudioAttributesImplApi26Parcelizer.TextAppearance_android_fontFamily) || settitle.AudioAttributesImplApi26Parcelizer(_init_lambda5.AudioAttributesImplApi26Parcelizer.TextAppearance_fontFamily)) {
            this.AudioAttributesImplApi26Parcelizer = null;
            if (settitle.AudioAttributesImplApi26Parcelizer(_init_lambda5.AudioAttributesImplApi26Parcelizer.TextAppearance_fontFamily)) {
                i = _init_lambda5.AudioAttributesImplApi26Parcelizer.TextAppearance_fontFamily;
            } else {
                i = _init_lambda5.AudioAttributesImplApi26Parcelizer.TextAppearance_android_fontFamily;
            }
            final int i3 = this.RatingCompat;
            final int i4 = this.MediaMetadataCompat;
            if (!context.isRestricted()) {
                final WeakReference weakReference = new WeakReference(this.MediaBrowserCompatMediaItem);
                try {
                    Typeface typefaceAudioAttributesCompatParcelizer = settitle.AudioAttributesCompatParcelizer(i, this.MediaMetadataCompat, new _parseDoublePrimitive.IconCompatParcelizer() { // from class: o.setEnabled.2
                        @Override // o._parseDoublePrimitive.IconCompatParcelizer
                        /* JADX INFO: renamed from: RemoteActionCompatParcelizer */
                        public void IconCompatParcelizer(int i5) {
                        }

                        @Override // o._parseDoublePrimitive.IconCompatParcelizer
                        /* JADX INFO: renamed from: read */
                        public void RemoteActionCompatParcelizer(Typeface typeface) {
                            int i5 = i3;
                            if (i5 != -1) {
                                typeface = write.write(typeface, i5, (i4 & 2) != 0);
                            }
                            setEnabled.this.read(weakReference, typeface);
                        }
                    });
                    if (typefaceAudioAttributesCompatParcelizer != null) {
                        if (this.RatingCompat != -1) {
                            this.AudioAttributesImplApi26Parcelizer = write.write(Typeface.create(typefaceAudioAttributesCompatParcelizer, 0), this.RatingCompat, (this.MediaMetadataCompat & 2) != 0);
                        } else {
                            this.AudioAttributesImplApi26Parcelizer = typefaceAudioAttributesCompatParcelizer;
                        }
                    }
                    this.IconCompatParcelizer = this.AudioAttributesImplApi26Parcelizer == null;
                } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
                }
            }
            if (this.AudioAttributesImplApi26Parcelizer != null || (strAudioAttributesImplApi21Parcelizer = settitle.AudioAttributesImplApi21Parcelizer(i)) == null) {
                return;
            }
            if (this.RatingCompat != -1) {
                this.AudioAttributesImplApi26Parcelizer = write.write(Typeface.create(strAudioAttributesImplApi21Parcelizer, 0), this.RatingCompat, (this.MediaMetadataCompat & 2) != 0);
                return;
            } else {
                this.AudioAttributesImplApi26Parcelizer = Typeface.create(strAudioAttributesImplApi21Parcelizer, this.MediaMetadataCompat);
                return;
            }
        }
        if (settitle.AudioAttributesImplApi26Parcelizer(_init_lambda5.AudioAttributesImplApi26Parcelizer.TextAppearance_android_typeface)) {
            this.IconCompatParcelizer = false;
            int i5 = settitle.read(_init_lambda5.AudioAttributesImplApi26Parcelizer.TextAppearance_android_typeface, 1);
            if (i5 == 1) {
                this.AudioAttributesImplApi26Parcelizer = Typeface.SANS_SERIF;
            } else if (i5 == 2) {
                this.AudioAttributesImplApi26Parcelizer = Typeface.SERIF;
            } else if (i5 == 3) {
                this.AudioAttributesImplApi26Parcelizer = Typeface.MONOSPACE;
            }
        }
    }

    void read(WeakReference<TextView> weakReference, final Typeface typeface) {
        if (this.IconCompatParcelizer) {
            this.AudioAttributesImplApi26Parcelizer = typeface;
            final TextView textView = weakReference.get();
            if (textView != null) {
                if (InvalidTypeIdException.onPlayFromSearch(textView)) {
                    final int i = this.MediaMetadataCompat;
                    textView.post(new Runnable() { // from class: o.setEnabled.3
                        @Override // java.lang.Runnable
                        public void run() {
                            textView.setTypeface(typeface, i);
                        }
                    });
                } else {
                    textView.setTypeface(typeface, this.MediaMetadataCompat);
                }
            }
        }
    }

    public void read(Context context, int i) {
        String strAudioAttributesImplApi21Parcelizer;
        setTitle settitleAudioAttributesCompatParcelizer = setTitle.AudioAttributesCompatParcelizer(context, i, _init_lambda5.AudioAttributesImplApi26Parcelizer.TextAppearance);
        if (settitleAudioAttributesCompatParcelizer.AudioAttributesImplApi26Parcelizer(_init_lambda5.AudioAttributesImplApi26Parcelizer.TextAppearance_textAllCaps)) {
            read(settitleAudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(_init_lambda5.AudioAttributesImplApi26Parcelizer.TextAppearance_textAllCaps, false));
        }
        if (settitleAudioAttributesCompatParcelizer.AudioAttributesImplApi26Parcelizer(_init_lambda5.AudioAttributesImplApi26Parcelizer.TextAppearance_android_textSize) && settitleAudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(_init_lambda5.AudioAttributesImplApi26Parcelizer.TextAppearance_android_textSize, -1) == 0) {
            this.MediaBrowserCompatMediaItem.setTextSize(0, BitmapDescriptorFactory.HUE_RED);
        }
        write(context, settitleAudioAttributesCompatParcelizer);
        if (settitleAudioAttributesCompatParcelizer.AudioAttributesImplApi26Parcelizer(_init_lambda5.AudioAttributesImplApi26Parcelizer.TextAppearance_fontVariationSettings) && (strAudioAttributesImplApi21Parcelizer = settitleAudioAttributesCompatParcelizer.AudioAttributesImplApi21Parcelizer(_init_lambda5.AudioAttributesImplApi26Parcelizer.TextAppearance_fontVariationSettings)) != null) {
            IconCompatParcelizer.RemoteActionCompatParcelizer(this.MediaBrowserCompatMediaItem, strAudioAttributesImplApi21Parcelizer);
        }
        settitleAudioAttributesCompatParcelizer.write();
        Typeface typeface = this.AudioAttributesImplApi26Parcelizer;
        if (typeface != null) {
            this.MediaBrowserCompatMediaItem.setTypeface(typeface, this.MediaMetadataCompat);
        }
    }

    public void read(boolean z) {
        this.MediaBrowserCompatMediaItem.setAllCaps(z);
    }

    public void AudioAttributesImplApi26Parcelizer() {
        AudioAttributesCompatParcelizer();
    }

    public void AudioAttributesCompatParcelizer() {
        if (this.RemoteActionCompatParcelizer != null || this.MediaBrowserCompatItemReceiver != null || this.MediaBrowserCompatCustomActionResultReceiver != null || this.write != null) {
            Drawable[] compoundDrawables = this.MediaBrowserCompatMediaItem.getCompoundDrawables();
            IconCompatParcelizer(compoundDrawables[0], this.RemoteActionCompatParcelizer);
            IconCompatParcelizer(compoundDrawables[1], this.MediaBrowserCompatItemReceiver);
            IconCompatParcelizer(compoundDrawables[2], this.MediaBrowserCompatCustomActionResultReceiver);
            IconCompatParcelizer(compoundDrawables[3], this.write);
        }
        if (this.AudioAttributesImplApi21Parcelizer == null && this.AudioAttributesCompatParcelizer == null) {
            return;
        }
        Drawable[] drawableArrWrite = AudioAttributesCompatParcelizer.write(this.MediaBrowserCompatMediaItem);
        IconCompatParcelizer(drawableArrWrite[0], this.AudioAttributesImplApi21Parcelizer);
        IconCompatParcelizer(drawableArrWrite[2], this.AudioAttributesCompatParcelizer);
    }

    private void IconCompatParcelizer(Drawable drawable, setView setview) {
        if (drawable == null || setview == null) {
            return;
        }
        startIntentSenderForResult.AudioAttributesCompatParcelizer(drawable, setview, this.MediaBrowserCompatMediaItem.getDrawableState());
    }

    private static setView write(Context context, startIntentSenderForResult startintentsenderforresult, int i) {
        ColorStateList colorStateListWrite = startintentsenderforresult.write(context, i);
        if (colorStateListWrite == null) {
            return null;
        }
        setView setview = new setView();
        setview.AudioAttributesCompatParcelizer = true;
        setview.RemoteActionCompatParcelizer = colorStateListWrite;
        return setview;
    }

    public void IconCompatParcelizer(boolean z, int i, int i2, int i3, int i4) {
        if (setChecked.RemoteActionCompatParcelizer) {
            return;
        }
        IconCompatParcelizer();
    }

    public void AudioAttributesCompatParcelizer(int i, float f) {
        if (setChecked.RemoteActionCompatParcelizer || MediaBrowserCompatItemReceiver()) {
            return;
        }
        IconCompatParcelizer(i, f);
    }

    public void IconCompatParcelizer() {
        this.read.read();
    }

    public boolean MediaBrowserCompatItemReceiver() {
        return this.read.AudioAttributesImplBaseParcelizer();
    }

    private void IconCompatParcelizer(int i, float f) {
        this.read.write(i, f);
    }

    public void write(int i) {
        this.read.IconCompatParcelizer(i);
    }

    public void read(int i, int i2, int i3, int i4) throws IllegalArgumentException {
        this.read.AudioAttributesCompatParcelizer(i, i2, i3, i4);
    }

    public void read(int[] iArr, int i) throws IllegalArgumentException {
        this.read.write(iArr, i);
    }

    public int MediaBrowserCompatCustomActionResultReceiver() {
        return this.read.MediaBrowserCompatItemReceiver();
    }

    public int RemoteActionCompatParcelizer() {
        return this.read.IconCompatParcelizer();
    }

    public int read() {
        return this.read.write();
    }

    public int write() {
        return this.read.RemoteActionCompatParcelizer();
    }

    public int[] AudioAttributesImplBaseParcelizer() {
        return this.read.AudioAttributesCompatParcelizer();
    }

    public void RemoteActionCompatParcelizer(ColorStateList colorStateList) {
        if (this.AudioAttributesImplBaseParcelizer == null) {
            this.AudioAttributesImplBaseParcelizer = new setView();
        }
        this.AudioAttributesImplBaseParcelizer.RemoteActionCompatParcelizer = colorStateList;
        this.AudioAttributesImplBaseParcelizer.AudioAttributesCompatParcelizer = colorStateList != null;
        AudioAttributesImplApi21Parcelizer();
    }

    public void RemoteActionCompatParcelizer(PorterDuff.Mode mode) {
        if (this.AudioAttributesImplBaseParcelizer == null) {
            this.AudioAttributesImplBaseParcelizer = new setView();
        }
        this.AudioAttributesImplBaseParcelizer.write = mode;
        this.AudioAttributesImplBaseParcelizer.IconCompatParcelizer = mode != null;
        AudioAttributesImplApi21Parcelizer();
    }

    private void AudioAttributesImplApi21Parcelizer() {
        setView setview = this.AudioAttributesImplBaseParcelizer;
        this.RemoteActionCompatParcelizer = setview;
        this.MediaBrowserCompatItemReceiver = setview;
        this.MediaBrowserCompatCustomActionResultReceiver = setview;
        this.write = setview;
        this.AudioAttributesImplApi21Parcelizer = setview;
        this.AudioAttributesCompatParcelizer = setview;
    }

    private void write(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4, Drawable drawable5, Drawable drawable6) {
        if (drawable5 != null || drawable6 != null) {
            Drawable[] drawableArrWrite = AudioAttributesCompatParcelizer.write(this.MediaBrowserCompatMediaItem);
            TextView textView = this.MediaBrowserCompatMediaItem;
            if (drawable5 == null) {
                drawable5 = drawableArrWrite[0];
            }
            if (drawable2 == null) {
                drawable2 = drawableArrWrite[1];
            }
            if (drawable6 == null) {
                drawable6 = drawableArrWrite[2];
            }
            if (drawable4 == null) {
                drawable4 = drawableArrWrite[3];
            }
            AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(textView, drawable5, drawable2, drawable6, drawable4);
            return;
        }
        if (drawable == null && drawable2 == null && drawable3 == null && drawable4 == null) {
            return;
        }
        Drawable[] drawableArrWrite2 = AudioAttributesCompatParcelizer.write(this.MediaBrowserCompatMediaItem);
        Drawable drawable7 = drawableArrWrite2[0];
        if (drawable7 != null || drawableArrWrite2[2] != null) {
            TextView textView2 = this.MediaBrowserCompatMediaItem;
            if (drawable2 == null) {
                drawable2 = drawableArrWrite2[1];
            }
            Drawable drawable8 = drawableArrWrite2[2];
            if (drawable4 == null) {
                drawable4 = drawableArrWrite2[3];
            }
            AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(textView2, drawable7, drawable2, drawable8, drawable4);
            return;
        }
        Drawable[] compoundDrawables = this.MediaBrowserCompatMediaItem.getCompoundDrawables();
        TextView textView3 = this.MediaBrowserCompatMediaItem;
        if (drawable == null) {
            drawable = compoundDrawables[0];
        }
        if (drawable2 == null) {
            drawable2 = compoundDrawables[1];
        }
        if (drawable3 == null) {
            drawable3 = compoundDrawables[2];
        }
        if (drawable4 == null) {
            drawable4 = compoundDrawables[3];
        }
        textView3.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
    }

    public void write(TextView textView, InputConnection inputConnection, EditorInfo editorInfo) {
        if (Build.VERSION.SDK_INT >= 30 || inputConnection == null) {
            return;
        }
        forRecord.RemoteActionCompatParcelizer(editorInfo, textView.getText());
    }

    static class IconCompatParcelizer {
        static boolean RemoteActionCompatParcelizer(TextView textView, String str) {
            return textView.setFontVariationSettings(str);
        }

        static int AudioAttributesCompatParcelizer(TextView textView) {
            return textView.getAutoSizeStepGranularity();
        }

        static void read(TextView textView, int i, int i2, int i3, int i4) {
            textView.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
        }

        static void AudioAttributesCompatParcelizer(TextView textView, int[] iArr, int i) {
            textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
        }
    }

    static class read {
        static void write(TextView textView, LocaleList localeList) {
            textView.setTextLocales(localeList);
        }

        static LocaleList read(String str) {
            return LocaleList.forLanguageTags(str);
        }
    }

    static class AudioAttributesCompatParcelizer {
        static void AudioAttributesCompatParcelizer(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        }

        static Drawable[] write(TextView textView) {
            return textView.getCompoundDrawablesRelative();
        }
    }

    static class write {
        static Typeface write(Typeface typeface, int i, boolean z) {
            return Typeface.create(typeface, i, z);
        }
    }
}
