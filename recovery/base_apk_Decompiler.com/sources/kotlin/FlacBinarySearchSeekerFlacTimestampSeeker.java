package kotlin;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import kotlin.calculateNextSearchBytePosition;

/* JADX INFO: loaded from: classes3.dex */
public final class FlacBinarySearchSeekerFlacTimestampSeeker extends LinearLayout {
    private int AudioAttributesCompatParcelizer;
    private ColorStateList AudioAttributesImplApi21Parcelizer;
    private final TextInputLayout AudioAttributesImplApi26Parcelizer;
    private final CheckableImageButton AudioAttributesImplBaseParcelizer;
    private final TextView IconCompatParcelizer;
    private PorterDuff.Mode MediaBrowserCompatCustomActionResultReceiver;
    private ImageView.ScaleType MediaBrowserCompatItemReceiver;
    private boolean RemoteActionCompatParcelizer;
    private CharSequence read;
    private View.OnLongClickListener write;

    public FlacBinarySearchSeekerFlacTimestampSeeker(TextInputLayout textInputLayout, setTitle settitle) {
        super(textInputLayout.getContext());
        this.AudioAttributesImplApi26Parcelizer = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(calculateNextSearchBytePosition.MediaBrowserCompatCustomActionResultReceiver.design_text_input_start_icon, (ViewGroup) this, false);
        this.AudioAttributesImplBaseParcelizer = checkableImageButton;
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
        this.IconCompatParcelizer = appCompatTextView;
        AudioAttributesCompatParcelizer(settitle);
        write(settitle);
        addView(checkableImageButton);
        addView(appCompatTextView);
    }

    private void AudioAttributesCompatParcelizer(setTitle settitle) {
        if (SeekMap.IconCompatParcelizer(getContext())) {
            mapArray.RemoteActionCompatParcelizer((ViewGroup.MarginLayoutParams) this.AudioAttributesImplBaseParcelizer.getLayoutParams(), 0);
        }
        AudioAttributesCompatParcelizer((View.OnClickListener) null);
        RemoteActionCompatParcelizer((View.OnLongClickListener) null);
        if (settitle.AudioAttributesImplApi26Parcelizer(calculateNextSearchBytePosition.MediaMetadataCompat.TextInputLayout_startIconTint)) {
            this.AudioAttributesImplApi21Parcelizer = SeekMap.IconCompatParcelizer(getContext(), settitle, calculateNextSearchBytePosition.MediaMetadataCompat.TextInputLayout_startIconTint);
        }
        if (settitle.AudioAttributesImplApi26Parcelizer(calculateNextSearchBytePosition.MediaMetadataCompat.TextInputLayout_startIconTintMode)) {
            this.MediaBrowserCompatCustomActionResultReceiver = checkAndPeekStreamMarker.RemoteActionCompatParcelizer(settitle.read(calculateNextSearchBytePosition.MediaMetadataCompat.TextInputLayout_startIconTintMode, -1), (PorterDuff.Mode) null);
        }
        if (settitle.AudioAttributesImplApi26Parcelizer(calculateNextSearchBytePosition.MediaMetadataCompat.TextInputLayout_startIconDrawable)) {
            read(settitle.IconCompatParcelizer(calculateNextSearchBytePosition.MediaMetadataCompat.TextInputLayout_startIconDrawable));
            if (settitle.AudioAttributesImplApi26Parcelizer(calculateNextSearchBytePosition.MediaMetadataCompat.TextInputLayout_startIconContentDescription)) {
                write(settitle.AudioAttributesImplBaseParcelizer(calculateNextSearchBytePosition.MediaMetadataCompat.TextInputLayout_startIconContentDescription));
            }
            read(settitle.AudioAttributesCompatParcelizer(calculateNextSearchBytePosition.MediaMetadataCompat.TextInputLayout_startIconCheckable, true));
        }
        read(settitle.AudioAttributesCompatParcelizer(calculateNextSearchBytePosition.MediaMetadataCompat.TextInputLayout_startIconMinSize, getResources().getDimensionPixelSize(calculateNextSearchBytePosition.write.mtrl_min_touch_target_size)));
        if (settitle.AudioAttributesImplApi26Parcelizer(calculateNextSearchBytePosition.MediaMetadataCompat.TextInputLayout_startIconScaleType)) {
            IconCompatParcelizer(parseWaveFormatEx.IconCompatParcelizer(settitle.read(calculateNextSearchBytePosition.MediaMetadataCompat.TextInputLayout_startIconScaleType, -1)));
        }
    }

    private void write(setTitle settitle) {
        this.IconCompatParcelizer.setVisibility(8);
        this.IconCompatParcelizer.setId(calculateNextSearchBytePosition.AudioAttributesImplApi26Parcelizer.textinput_prefix_text);
        this.IconCompatParcelizer.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        InvalidTypeIdException.AudioAttributesImplApi21Parcelizer(this.IconCompatParcelizer, 1);
        AudioAttributesCompatParcelizer(settitle.MediaBrowserCompatItemReceiver(calculateNextSearchBytePosition.MediaMetadataCompat.TextInputLayout_prefixTextAppearance, 0));
        if (settitle.AudioAttributesImplApi26Parcelizer(calculateNextSearchBytePosition.MediaMetadataCompat.TextInputLayout_prefixTextColor)) {
            IconCompatParcelizer(settitle.write(calculateNextSearchBytePosition.MediaMetadataCompat.TextInputLayout_prefixTextColor));
        }
        AudioAttributesCompatParcelizer(settitle.AudioAttributesImplBaseParcelizer(calculateNextSearchBytePosition.MediaMetadataCompat.TextInputLayout_prefixText));
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        MediaBrowserCompatCustomActionResultReceiver();
    }

    public final TextView write() {
        return this.IconCompatParcelizer;
    }

    public final void AudioAttributesCompatParcelizer(CharSequence charSequence) {
        this.read = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.IconCompatParcelizer.setText(charSequence);
        AudioAttributesImplBaseParcelizer();
    }

    public final CharSequence read() {
        return this.read;
    }

    public final void IconCompatParcelizer(ColorStateList colorStateList) {
        this.IconCompatParcelizer.setTextColor(colorStateList);
    }

    public final void AudioAttributesCompatParcelizer(int i) {
        _addSuperTypes.RemoteActionCompatParcelizer(this.IconCompatParcelizer, i);
    }

    public final void read(Drawable drawable) {
        this.AudioAttributesImplBaseParcelizer.setImageDrawable(drawable);
        if (drawable != null) {
            parseWaveFormatEx.write(this.AudioAttributesImplApi26Parcelizer, this.AudioAttributesImplBaseParcelizer, this.AudioAttributesImplApi21Parcelizer, this.MediaBrowserCompatCustomActionResultReceiver);
            RemoteActionCompatParcelizer(true);
            IconCompatParcelizer();
        } else {
            RemoteActionCompatParcelizer(false);
            AudioAttributesCompatParcelizer((View.OnClickListener) null);
            RemoteActionCompatParcelizer((View.OnLongClickListener) null);
            write((CharSequence) null);
        }
    }

    public final Drawable AudioAttributesCompatParcelizer() {
        return this.AudioAttributesImplBaseParcelizer.getDrawable();
    }

    public final void AudioAttributesCompatParcelizer(View.OnClickListener onClickListener) {
        parseWaveFormatEx.IconCompatParcelizer(this.AudioAttributesImplBaseParcelizer, onClickListener, this.write);
    }

    public final void RemoteActionCompatParcelizer(View.OnLongClickListener onLongClickListener) {
        this.write = onLongClickListener;
        parseWaveFormatEx.RemoteActionCompatParcelizer(this.AudioAttributesImplBaseParcelizer, onLongClickListener);
    }

    public final void RemoteActionCompatParcelizer(boolean z) {
        if (MediaBrowserCompatItemReceiver() != z) {
            this.AudioAttributesImplBaseParcelizer.setVisibility(z ? 0 : 8);
            MediaBrowserCompatCustomActionResultReceiver();
            AudioAttributesImplBaseParcelizer();
        }
    }

    private boolean MediaBrowserCompatItemReceiver() {
        return this.AudioAttributesImplBaseParcelizer.getVisibility() == 0;
    }

    public final void IconCompatParcelizer() {
        parseWaveFormatEx.read(this.AudioAttributesImplApi26Parcelizer, this.AudioAttributesImplBaseParcelizer, this.AudioAttributesImplApi21Parcelizer);
    }

    public final void read(boolean z) {
        this.AudioAttributesImplBaseParcelizer.setCheckable(z);
    }

    public final void write(CharSequence charSequence) {
        if (AudioAttributesImplApi26Parcelizer() != charSequence) {
            this.AudioAttributesImplBaseParcelizer.setContentDescription(charSequence);
        }
    }

    private CharSequence AudioAttributesImplApi26Parcelizer() {
        return this.AudioAttributesImplBaseParcelizer.getContentDescription();
    }

    public final void RemoteActionCompatParcelizer(ColorStateList colorStateList) {
        if (this.AudioAttributesImplApi21Parcelizer != colorStateList) {
            this.AudioAttributesImplApi21Parcelizer = colorStateList;
            parseWaveFormatEx.write(this.AudioAttributesImplApi26Parcelizer, this.AudioAttributesImplBaseParcelizer, colorStateList, this.MediaBrowserCompatCustomActionResultReceiver);
        }
    }

    public final void RemoteActionCompatParcelizer(PorterDuff.Mode mode) {
        if (this.MediaBrowserCompatCustomActionResultReceiver != mode) {
            this.MediaBrowserCompatCustomActionResultReceiver = mode;
            parseWaveFormatEx.write(this.AudioAttributesImplApi26Parcelizer, this.AudioAttributesImplBaseParcelizer, this.AudioAttributesImplApi21Parcelizer, mode);
        }
    }

    public final void read(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        }
        if (i != this.AudioAttributesCompatParcelizer) {
            this.AudioAttributesCompatParcelizer = i;
            parseWaveFormatEx.read(this.AudioAttributesImplBaseParcelizer, i);
        }
    }

    public final void IconCompatParcelizer(ImageView.ScaleType scaleType) {
        this.MediaBrowserCompatItemReceiver = scaleType;
        parseWaveFormatEx.IconCompatParcelizer(this.AudioAttributesImplBaseParcelizer, scaleType);
    }

    public final void AudioAttributesCompatParcelizer(hasSuperClassStartingWith hassuperclassstartingwith) {
        if (this.IconCompatParcelizer.getVisibility() == 0) {
            hassuperclassstartingwith.AudioAttributesCompatParcelizer((View) this.IconCompatParcelizer);
            hassuperclassstartingwith.MediaBrowserCompatCustomActionResultReceiver(this.IconCompatParcelizer);
        } else {
            hassuperclassstartingwith.MediaBrowserCompatCustomActionResultReceiver(this.AudioAttributesImplBaseParcelizer);
        }
    }

    private void MediaBrowserCompatCustomActionResultReceiver() {
        EditText editText = this.AudioAttributesImplApi26Parcelizer.IconCompatParcelizer;
        if (editText == null) {
            return;
        }
        InvalidTypeIdException.read(this.IconCompatParcelizer, MediaBrowserCompatItemReceiver() ? 0 : InvalidTypeIdException.onCommand(editText), editText.getCompoundPaddingTop(), getContext().getResources().getDimensionPixelSize(calculateNextSearchBytePosition.write.material_input_text_to_prefix_suffix_padding), editText.getCompoundPaddingBottom());
    }

    public final int RemoteActionCompatParcelizer() {
        return InvalidTypeIdException.onCommand(this) + InvalidTypeIdException.onCommand(this.IconCompatParcelizer) + (MediaBrowserCompatItemReceiver() ? this.AudioAttributesImplBaseParcelizer.getMeasuredWidth() + mapArray.RemoteActionCompatParcelizer((ViewGroup.MarginLayoutParams) this.AudioAttributesImplBaseParcelizer.getLayoutParams()) : 0);
    }

    public final void IconCompatParcelizer(boolean z) {
        this.RemoteActionCompatParcelizer = z;
        AudioAttributesImplBaseParcelizer();
    }

    private void AudioAttributesImplBaseParcelizer() {
        int i = (this.read == null || this.RemoteActionCompatParcelizer) ? 8 : 0;
        setVisibility((this.AudioAttributesImplBaseParcelizer.getVisibility() == 0 || i == 0) ? 0 : 8);
        this.IconCompatParcelizer.setVisibility(i);
        this.AudioAttributesImplApi26Parcelizer.MediaBrowserCompatSearchResultReceiver();
    }
}
