package kotlin;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import java.util.LinkedHashSet;
import kotlin.AccessorNamingStrategy;
import kotlin.calculateNextSearchBytePosition;

/* JADX INFO: loaded from: classes3.dex */
public final class parseBitmapInfoHeader extends LinearLayout {
    private final TextWatcher AudioAttributesCompatParcelizer;
    private View.OnLongClickListener AudioAttributesImplApi21Parcelizer;
    private final RemoteActionCompatParcelizer AudioAttributesImplApi26Parcelizer;
    private final FrameLayout AudioAttributesImplBaseParcelizer;
    private final LinkedHashSet<TextInputLayout.RemoteActionCompatParcelizer> IconCompatParcelizer;
    private int MediaBrowserCompatCustomActionResultReceiver;
    private int MediaBrowserCompatItemReceiver;
    private View.OnLongClickListener MediaBrowserCompatMediaItem;
    private ImageView.ScaleType MediaBrowserCompatSearchResultReceiver;
    private ColorStateList MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    private ColorStateList MediaDescriptionCompat;
    private final CheckableImageButton MediaMetadataCompat;
    private PorterDuff.Mode RatingCompat;
    private EditText RemoteActionCompatParcelizer;
    private boolean handleMediaPlayPauseIfPendingOnHandler;
    private PorterDuff.Mode onAddQueueItem;
    private final TextInputLayout.IconCompatParcelizer onCommand;
    private final CheckableImageButton onCustomAction;
    private final TextView onFastForward;
    private CharSequence onPause;
    private AccessorNamingStrategy.IconCompatParcelizer onPlayFromMediaId;
    private final AccessibilityManager read;
    final TextInputLayout write;

    public parseBitmapInfoHeader(TextInputLayout textInputLayout, setTitle settitle) {
        super(textInputLayout.getContext());
        this.MediaBrowserCompatCustomActionResultReceiver = 0;
        this.IconCompatParcelizer = new LinkedHashSet<>();
        this.AudioAttributesCompatParcelizer = new checkFrameHeaderFromPeek() { // from class: o.parseBitmapInfoHeader.2
            @Override // kotlin.checkFrameHeaderFromPeek, android.text.TextWatcher
            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                parseBitmapInfoHeader.this.AudioAttributesCompatParcelizer().onAddQueueItem();
            }

            @Override // kotlin.checkFrameHeaderFromPeek, android.text.TextWatcher
            public final void afterTextChanged(Editable editable) {
                parseBitmapInfoHeader.this.AudioAttributesCompatParcelizer().read();
            }
        };
        TextInputLayout.IconCompatParcelizer iconCompatParcelizer = new TextInputLayout.IconCompatParcelizer() { // from class: o.parseBitmapInfoHeader.3
            @Override // com.google.android.material.textfield.TextInputLayout.IconCompatParcelizer
            public final void write(TextInputLayout textInputLayout2) {
                if (parseBitmapInfoHeader.this.RemoteActionCompatParcelizer == textInputLayout2.AudioAttributesCompatParcelizer()) {
                    return;
                }
                if (parseBitmapInfoHeader.this.RemoteActionCompatParcelizer != null) {
                    parseBitmapInfoHeader.this.RemoteActionCompatParcelizer.removeTextChangedListener(parseBitmapInfoHeader.this.AudioAttributesCompatParcelizer);
                    if (parseBitmapInfoHeader.this.RemoteActionCompatParcelizer.getOnFocusChangeListener() == parseBitmapInfoHeader.this.AudioAttributesCompatParcelizer().write()) {
                        parseBitmapInfoHeader.this.RemoteActionCompatParcelizer.setOnFocusChangeListener(null);
                    }
                }
                parseBitmapInfoHeader.this.RemoteActionCompatParcelizer = textInputLayout2.AudioAttributesCompatParcelizer();
                if (parseBitmapInfoHeader.this.RemoteActionCompatParcelizer != null) {
                    parseBitmapInfoHeader.this.RemoteActionCompatParcelizer.addTextChangedListener(parseBitmapInfoHeader.this.AudioAttributesCompatParcelizer);
                }
                parseBitmapInfoHeader.this.AudioAttributesCompatParcelizer().AudioAttributesCompatParcelizer(parseBitmapInfoHeader.this.RemoteActionCompatParcelizer);
                parseBitmapInfoHeader parsebitmapinfoheader = parseBitmapInfoHeader.this;
                parsebitmapinfoheader.write(parsebitmapinfoheader.AudioAttributesCompatParcelizer());
            }
        };
        this.onCommand = iconCompatParcelizer;
        this.read = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.write = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.AudioAttributesImplBaseParcelizer = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        CheckableImageButton checkableImageButtonWrite = write(this, layoutInflaterFrom, calculateNextSearchBytePosition.AudioAttributesImplApi26Parcelizer.text_input_error_icon);
        this.onCustomAction = checkableImageButtonWrite;
        CheckableImageButton checkableImageButtonWrite2 = write(frameLayout, layoutInflaterFrom, calculateNextSearchBytePosition.AudioAttributesImplApi26Parcelizer.text_input_end_icon);
        this.MediaMetadataCompat = checkableImageButtonWrite2;
        this.AudioAttributesImplApi26Parcelizer = new RemoteActionCompatParcelizer(this, settitle);
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
        this.onFastForward = appCompatTextView;
        write(settitle);
        IconCompatParcelizer(settitle);
        RemoteActionCompatParcelizer(settitle);
        frameLayout.addView(checkableImageButtonWrite2);
        addView(appCompatTextView);
        addView(frameLayout);
        addView(checkableImageButtonWrite);
        textInputLayout.IconCompatParcelizer(iconCompatParcelizer);
        addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: o.parseBitmapInfoHeader.4
            @Override // android.view.View.OnAttachStateChangeListener
            public final void onViewAttachedToWindow(View view) {
                parseBitmapInfoHeader.this.MediaDescriptionCompat();
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public final void onViewDetachedFromWindow(View view) {
                parseBitmapInfoHeader.this.onCommand();
            }
        });
    }

    private CheckableImageButton write(ViewGroup viewGroup, LayoutInflater layoutInflater, int i) {
        CheckableImageButton checkableImageButton = (CheckableImageButton) layoutInflater.inflate(calculateNextSearchBytePosition.MediaBrowserCompatCustomActionResultReceiver.design_text_input_end_icon, viewGroup, false);
        checkableImageButton.setId(i);
        if (SeekMap.IconCompatParcelizer(getContext())) {
            mapArray.AudioAttributesCompatParcelizer((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams(), 0);
        }
        return checkableImageButton;
    }

    private void write(setTitle settitle) {
        if (settitle.AudioAttributesImplApi26Parcelizer(calculateNextSearchBytePosition.MediaMetadataCompat.TextInputLayout_errorIconTint)) {
            this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = SeekMap.IconCompatParcelizer(getContext(), settitle, calculateNextSearchBytePosition.MediaMetadataCompat.TextInputLayout_errorIconTint);
        }
        if (settitle.AudioAttributesImplApi26Parcelizer(calculateNextSearchBytePosition.MediaMetadataCompat.TextInputLayout_errorIconTintMode)) {
            this.onAddQueueItem = checkAndPeekStreamMarker.RemoteActionCompatParcelizer(settitle.read(calculateNextSearchBytePosition.MediaMetadataCompat.TextInputLayout_errorIconTintMode, -1), (PorterDuff.Mode) null);
        }
        if (settitle.AudioAttributesImplApi26Parcelizer(calculateNextSearchBytePosition.MediaMetadataCompat.TextInputLayout_errorIconDrawable)) {
            read(settitle.IconCompatParcelizer(calculateNextSearchBytePosition.MediaMetadataCompat.TextInputLayout_errorIconDrawable));
        }
        this.onCustomAction.setContentDescription(getResources().getText(calculateNextSearchBytePosition.MediaBrowserCompatSearchResultReceiver.error_icon_content_description));
        InvalidTypeIdException.AudioAttributesImplBaseParcelizer(this.onCustomAction, 2);
        this.onCustomAction.setClickable(false);
        this.onCustomAction.setPressable(false);
        this.onCustomAction.setFocusable(false);
    }

    private void IconCompatParcelizer(setTitle settitle) {
        if (!settitle.AudioAttributesImplApi26Parcelizer(calculateNextSearchBytePosition.MediaMetadataCompat.TextInputLayout_passwordToggleEnabled)) {
            if (settitle.AudioAttributesImplApi26Parcelizer(calculateNextSearchBytePosition.MediaMetadataCompat.TextInputLayout_endIconTint)) {
                this.MediaDescriptionCompat = SeekMap.IconCompatParcelizer(getContext(), settitle, calculateNextSearchBytePosition.MediaMetadataCompat.TextInputLayout_endIconTint);
            }
            if (settitle.AudioAttributesImplApi26Parcelizer(calculateNextSearchBytePosition.MediaMetadataCompat.TextInputLayout_endIconTintMode)) {
                this.RatingCompat = checkAndPeekStreamMarker.RemoteActionCompatParcelizer(settitle.read(calculateNextSearchBytePosition.MediaMetadataCompat.TextInputLayout_endIconTintMode, -1), (PorterDuff.Mode) null);
            }
        }
        if (settitle.AudioAttributesImplApi26Parcelizer(calculateNextSearchBytePosition.MediaMetadataCompat.TextInputLayout_endIconMode)) {
            RemoteActionCompatParcelizer(settitle.read(calculateNextSearchBytePosition.MediaMetadataCompat.TextInputLayout_endIconMode, 0));
            if (settitle.AudioAttributesImplApi26Parcelizer(calculateNextSearchBytePosition.MediaMetadataCompat.TextInputLayout_endIconContentDescription)) {
                read(settitle.AudioAttributesImplBaseParcelizer(calculateNextSearchBytePosition.MediaMetadataCompat.TextInputLayout_endIconContentDescription));
            }
            RemoteActionCompatParcelizer(settitle.AudioAttributesCompatParcelizer(calculateNextSearchBytePosition.MediaMetadataCompat.TextInputLayout_endIconCheckable, true));
        } else if (settitle.AudioAttributesImplApi26Parcelizer(calculateNextSearchBytePosition.MediaMetadataCompat.TextInputLayout_passwordToggleEnabled)) {
            if (settitle.AudioAttributesImplApi26Parcelizer(calculateNextSearchBytePosition.MediaMetadataCompat.TextInputLayout_passwordToggleTint)) {
                this.MediaDescriptionCompat = SeekMap.IconCompatParcelizer(getContext(), settitle, calculateNextSearchBytePosition.MediaMetadataCompat.TextInputLayout_passwordToggleTint);
            }
            if (settitle.AudioAttributesImplApi26Parcelizer(calculateNextSearchBytePosition.MediaMetadataCompat.TextInputLayout_passwordToggleTintMode)) {
                this.RatingCompat = checkAndPeekStreamMarker.RemoteActionCompatParcelizer(settitle.read(calculateNextSearchBytePosition.MediaMetadataCompat.TextInputLayout_passwordToggleTintMode, -1), (PorterDuff.Mode) null);
            }
            RemoteActionCompatParcelizer(settitle.AudioAttributesCompatParcelizer(calculateNextSearchBytePosition.MediaMetadataCompat.TextInputLayout_passwordToggleEnabled, false) ? 1 : 0);
            read(settitle.AudioAttributesImplBaseParcelizer(calculateNextSearchBytePosition.MediaMetadataCompat.TextInputLayout_passwordToggleContentDescription));
        }
        AudioAttributesCompatParcelizer(settitle.AudioAttributesCompatParcelizer(calculateNextSearchBytePosition.MediaMetadataCompat.TextInputLayout_endIconMinSize, getResources().getDimensionPixelSize(calculateNextSearchBytePosition.write.mtrl_min_touch_target_size)));
        if (settitle.AudioAttributesImplApi26Parcelizer(calculateNextSearchBytePosition.MediaMetadataCompat.TextInputLayout_endIconScaleType)) {
            RemoteActionCompatParcelizer(parseWaveFormatEx.IconCompatParcelizer(settitle.read(calculateNextSearchBytePosition.MediaMetadataCompat.TextInputLayout_endIconScaleType, -1)));
        }
    }

    private void RemoteActionCompatParcelizer(setTitle settitle) {
        this.onFastForward.setVisibility(8);
        this.onFastForward.setId(calculateNextSearchBytePosition.AudioAttributesImplApi26Parcelizer.textinput_suffix_text);
        this.onFastForward.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 80.0f));
        InvalidTypeIdException.AudioAttributesImplApi21Parcelizer(this.onFastForward, 1);
        AudioAttributesImplApi26Parcelizer(settitle.MediaBrowserCompatItemReceiver(calculateNextSearchBytePosition.MediaMetadataCompat.TextInputLayout_suffixTextAppearance, 0));
        if (settitle.AudioAttributesImplApi26Parcelizer(calculateNextSearchBytePosition.MediaMetadataCompat.TextInputLayout_suffixTextColor)) {
            write(settitle.write(calculateNextSearchBytePosition.MediaMetadataCompat.TextInputLayout_suffixTextColor));
        }
        RemoteActionCompatParcelizer(settitle.AudioAttributesImplBaseParcelizer(calculateNextSearchBytePosition.MediaMetadataCompat.TextInputLayout_suffixText));
    }

    public final void IconCompatParcelizer(int i) {
        read(i != 0 ? getDefaultViewModelCreationExtras.write(getContext(), i) : null);
        onPlay();
    }

    public final void read(Drawable drawable) {
        this.onCustomAction.setImageDrawable(drawable);
        onCustomAction();
        parseWaveFormatEx.write(this.write, this.onCustomAction, this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, this.onAddQueueItem);
    }

    private Drawable onPlayFromMediaId() {
        return this.onCustomAction.getDrawable();
    }

    public final void IconCompatParcelizer(ColorStateList colorStateList) {
        if (this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver != colorStateList) {
            this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = colorStateList;
            parseWaveFormatEx.write(this.write, this.onCustomAction, colorStateList, this.onAddQueueItem);
        }
    }

    public final void IconCompatParcelizer(PorterDuff.Mode mode) {
        if (this.onAddQueueItem != mode) {
            this.onAddQueueItem = mode;
            parseWaveFormatEx.write(this.write, this.onCustomAction, this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, mode);
        }
    }

    public final void write(View.OnClickListener onClickListener) {
        parseWaveFormatEx.IconCompatParcelizer(this.onCustomAction, onClickListener, this.MediaBrowserCompatMediaItem);
    }

    public final CheckableImageButton RemoteActionCompatParcelizer() {
        return this.MediaMetadataCompat;
    }

    public final getMimeTypeFromTag AudioAttributesCompatParcelizer() {
        return this.AudioAttributesImplApi26Parcelizer.write(this.MediaBrowserCompatCustomActionResultReceiver);
    }

    public final int IconCompatParcelizer() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    public final void RemoteActionCompatParcelizer(int i) {
        if (this.MediaBrowserCompatCustomActionResultReceiver == i) {
            return;
        }
        IconCompatParcelizer(AudioAttributesCompatParcelizer());
        this.MediaBrowserCompatCustomActionResultReceiver = i;
        handleMediaPlayPauseIfPendingOnHandler();
        write(i != 0);
        getMimeTypeFromTag getmimetypefromtagAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer();
        read(AudioAttributesCompatParcelizer(getmimetypefromtagAudioAttributesCompatParcelizer));
        write(getmimetypefromtagAudioAttributesCompatParcelizer.RemoteActionCompatParcelizer());
        RemoteActionCompatParcelizer(getmimetypefromtagAudioAttributesCompatParcelizer.MediaMetadataCompat());
        if (getmimetypefromtagAudioAttributesCompatParcelizer.write(this.write.write())) {
            read(getmimetypefromtagAudioAttributesCompatParcelizer);
            AudioAttributesCompatParcelizer(getmimetypefromtagAudioAttributesCompatParcelizer.IconCompatParcelizer());
            EditText editText = this.RemoteActionCompatParcelizer;
            if (editText != null) {
                getmimetypefromtagAudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(editText);
                write(getmimetypefromtagAudioAttributesCompatParcelizer);
            }
            parseWaveFormatEx.write(this.write, this.MediaMetadataCompat, this.MediaDescriptionCompat, this.RatingCompat);
            read(true);
            return;
        }
        StringBuilder sb = new StringBuilder("The current box background mode ");
        sb.append(this.write.write());
        sb.append(" is not supported by the end icon mode ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    final void read(boolean z) {
        boolean z2;
        boolean zIsActivated;
        boolean zIsChecked;
        getMimeTypeFromTag getmimetypefromtagAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer();
        boolean z3 = true;
        if (!getmimetypefromtagAudioAttributesCompatParcelizer.MediaMetadataCompat() || (zIsChecked = this.MediaMetadataCompat.isChecked()) == getmimetypefromtagAudioAttributesCompatParcelizer.MediaDescriptionCompat()) {
            z2 = false;
        } else {
            this.MediaMetadataCompat.setChecked(!zIsChecked);
            z2 = true;
        }
        if (!getmimetypefromtagAudioAttributesCompatParcelizer.ab_() || (zIsActivated = this.MediaMetadataCompat.isActivated()) == getmimetypefromtagAudioAttributesCompatParcelizer.ac_()) {
            z3 = z2;
        } else {
            IconCompatParcelizer(!zIsActivated);
        }
        if (z || z3) {
            onMediaButtonEvent();
        }
    }

    private void read(getMimeTypeFromTag getmimetypefromtag) {
        getmimetypefromtag.MediaBrowserCompatCustomActionResultReceiver();
        this.onPlayFromMediaId = getmimetypefromtag.aa_();
        MediaDescriptionCompat();
    }

    private void IconCompatParcelizer(getMimeTypeFromTag getmimetypefromtag) {
        onCommand();
        this.onPlayFromMediaId = null;
        getmimetypefromtag.RatingCompat();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void MediaDescriptionCompat() {
        if (this.onPlayFromMediaId == null || this.read == null || !InvalidTypeIdException.onPlayFromSearch(this)) {
            return;
        }
        AccessorNamingStrategy.AudioAttributesCompatParcelizer(this.read, this.onPlayFromMediaId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onCommand() {
        AccessibilityManager accessibilityManager;
        AccessorNamingStrategy.IconCompatParcelizer iconCompatParcelizer = this.onPlayFromMediaId;
        if (iconCompatParcelizer == null || (accessibilityManager = this.read) == null) {
            return;
        }
        AccessorNamingStrategy.RemoteActionCompatParcelizer(accessibilityManager, iconCompatParcelizer);
    }

    private int AudioAttributesCompatParcelizer(getMimeTypeFromTag getmimetypefromtag) {
        int i = this.AudioAttributesImplApi26Parcelizer.write;
        return i == 0 ? getmimetypefromtag.AudioAttributesCompatParcelizer() : i;
    }

    public final void AudioAttributesCompatParcelizer(View.OnClickListener onClickListener) {
        parseWaveFormatEx.IconCompatParcelizer(this.MediaMetadataCompat, onClickListener, this.AudioAttributesImplApi21Parcelizer);
    }

    public final void RemoteActionCompatParcelizer(View.OnLongClickListener onLongClickListener) {
        this.AudioAttributesImplApi21Parcelizer = onLongClickListener;
        parseWaveFormatEx.RemoteActionCompatParcelizer(this.MediaMetadataCompat, onLongClickListener);
    }

    public final void IconCompatParcelizer(View.OnLongClickListener onLongClickListener) {
        this.MediaBrowserCompatMediaItem = onLongClickListener;
        parseWaveFormatEx.RemoteActionCompatParcelizer(this.onCustomAction, onLongClickListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void write(getMimeTypeFromTag getmimetypefromtag) {
        if (this.RemoteActionCompatParcelizer != null) {
            if (getmimetypefromtag.write() != null) {
                this.RemoteActionCompatParcelizer.setOnFocusChangeListener(getmimetypefromtag.write());
            }
            if (getmimetypefromtag.MediaBrowserCompatItemReceiver() != null) {
                this.MediaMetadataCompat.setOnFocusChangeListener(getmimetypefromtag.MediaBrowserCompatItemReceiver());
            }
        }
    }

    private void onPlay() {
        parseWaveFormatEx.read(this.write, this.onCustomAction, this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver);
    }

    public final void write(boolean z) {
        if (MediaBrowserCompatSearchResultReceiver() != z) {
            this.MediaMetadataCompat.setVisibility(z ? 0 : 8);
            MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
            MediaMetadataCompat();
            this.write.MediaBrowserCompatSearchResultReceiver();
        }
    }

    public final boolean MediaBrowserCompatSearchResultReceiver() {
        return this.AudioAttributesImplBaseParcelizer.getVisibility() == 0 && this.MediaMetadataCompat.getVisibility() == 0;
    }

    public final void IconCompatParcelizer(boolean z) {
        this.MediaMetadataCompat.setActivated(z);
    }

    private void onMediaButtonEvent() {
        parseWaveFormatEx.read(this.write, this.MediaMetadataCompat, this.MediaDescriptionCompat);
    }

    public final void RemoteActionCompatParcelizer(boolean z) {
        this.MediaMetadataCompat.setCheckable(z);
    }

    public final boolean MediaBrowserCompatCustomActionResultReceiver() {
        return AudioAttributesImplBaseParcelizer() && this.MediaMetadataCompat.isChecked();
    }

    public final void read() {
        this.MediaMetadataCompat.performClick();
        this.MediaMetadataCompat.jumpDrawablesToCurrentState();
    }

    public final void read(int i) {
        write(i != 0 ? getDefaultViewModelCreationExtras.write(getContext(), i) : null);
    }

    public final void write(Drawable drawable) {
        this.MediaMetadataCompat.setImageDrawable(drawable);
        if (drawable != null) {
            parseWaveFormatEx.write(this.write, this.MediaMetadataCompat, this.MediaDescriptionCompat, this.RatingCompat);
            onMediaButtonEvent();
        }
    }

    private Drawable onPause() {
        return this.MediaMetadataCompat.getDrawable();
    }

    public final void write(int i) {
        read(i != 0 ? getResources().getText(i) : null);
    }

    public final void read(CharSequence charSequence) {
        if (onFastForward() != charSequence) {
            this.MediaMetadataCompat.setContentDescription(charSequence);
        }
    }

    private CharSequence onFastForward() {
        return this.MediaMetadataCompat.getContentDescription();
    }

    public final void read(ColorStateList colorStateList) {
        if (this.MediaDescriptionCompat != colorStateList) {
            this.MediaDescriptionCompat = colorStateList;
            parseWaveFormatEx.write(this.write, this.MediaMetadataCompat, colorStateList, this.RatingCompat);
        }
    }

    public final void AudioAttributesCompatParcelizer(PorterDuff.Mode mode) {
        if (this.RatingCompat != mode) {
            this.RatingCompat = mode;
            parseWaveFormatEx.write(this.write, this.MediaMetadataCompat, this.MediaDescriptionCompat, mode);
        }
    }

    public final void AudioAttributesCompatParcelizer(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        }
        if (i != this.MediaBrowserCompatItemReceiver) {
            this.MediaBrowserCompatItemReceiver = i;
            parseWaveFormatEx.read(this.MediaMetadataCompat, i);
            parseWaveFormatEx.read(this.onCustomAction, i);
        }
    }

    public final void RemoteActionCompatParcelizer(ImageView.ScaleType scaleType) {
        this.MediaBrowserCompatSearchResultReceiver = scaleType;
        parseWaveFormatEx.IconCompatParcelizer(this.MediaMetadataCompat, scaleType);
        parseWaveFormatEx.IconCompatParcelizer(this.onCustomAction, scaleType);
    }

    public final boolean AudioAttributesImplBaseParcelizer() {
        return this.MediaBrowserCompatCustomActionResultReceiver != 0;
    }

    public final TextView AudioAttributesImplApi21Parcelizer() {
        return this.onFastForward;
    }

    public final void RemoteActionCompatParcelizer(CharSequence charSequence) {
        this.onPause = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.onFastForward.setText(charSequence);
        onAddQueueItem();
    }

    public final CharSequence AudioAttributesImplApi26Parcelizer() {
        return this.onPause;
    }

    public final void AudioAttributesImplApi26Parcelizer(int i) {
        _addSuperTypes.RemoteActionCompatParcelizer(this.onFastForward, i);
    }

    public final void write(ColorStateList colorStateList) {
        this.onFastForward.setTextColor(colorStateList);
    }

    public final void AudioAttributesImplBaseParcelizer(int i) {
        AudioAttributesCompatParcelizer(i != 0 ? getDefaultViewModelCreationExtras.write(getContext(), i) : null);
    }

    public final void AudioAttributesCompatParcelizer(Drawable drawable) {
        this.MediaMetadataCompat.setImageDrawable(drawable);
    }

    public final void AudioAttributesImplApi21Parcelizer(int i) {
        IconCompatParcelizer(i != 0 ? getResources().getText(i) : null);
    }

    public final void IconCompatParcelizer(CharSequence charSequence) {
        this.MediaMetadataCompat.setContentDescription(charSequence);
    }

    public final void AudioAttributesImplApi26Parcelizer(boolean z) {
        if (z && this.MediaBrowserCompatCustomActionResultReceiver != 1) {
            RemoteActionCompatParcelizer(1);
        } else {
            if (z) {
                return;
            }
            RemoteActionCompatParcelizer(0);
        }
    }

    public final void RemoteActionCompatParcelizer(ColorStateList colorStateList) {
        this.MediaDescriptionCompat = colorStateList;
        parseWaveFormatEx.write(this.write, this.MediaMetadataCompat, colorStateList, this.RatingCompat);
    }

    public final void RemoteActionCompatParcelizer(PorterDuff.Mode mode) {
        this.RatingCompat = mode;
        parseWaveFormatEx.write(this.write, this.MediaMetadataCompat, this.MediaDescriptionCompat, mode);
    }

    public final void AudioAttributesCompatParcelizer(boolean z) {
        this.handleMediaPlayPauseIfPendingOnHandler = z;
        onAddQueueItem();
    }

    public final void RatingCompat() {
        onCustomAction();
        onPlay();
        onMediaButtonEvent();
        if (AudioAttributesCompatParcelizer().onCommand()) {
            MediaBrowserCompatItemReceiver(this.write.MediaBrowserCompatMediaItem());
        }
    }

    private void onAddQueueItem() {
        int visibility = this.onFastForward.getVisibility();
        int i = (this.onPause == null || this.handleMediaPlayPauseIfPendingOnHandler) ? 8 : 0;
        if (visibility != i) {
            AudioAttributesCompatParcelizer().read(i == 0);
        }
        MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
        this.onFastForward.setVisibility(i);
        this.write.MediaBrowserCompatSearchResultReceiver();
    }

    public final void MediaMetadataCompat() {
        if (this.write.IconCompatParcelizer == null) {
            return;
        }
        InvalidTypeIdException.read(this.onFastForward, getContext().getResources().getDimensionPixelSize(calculateNextSearchBytePosition.write.material_input_text_to_prefix_suffix_padding), this.write.IconCompatParcelizer.getPaddingTop(), (MediaBrowserCompatSearchResultReceiver() || MediaBrowserCompatMediaItem()) ? 0 : InvalidTypeIdException.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(this.write.IconCompatParcelizer), this.write.IconCompatParcelizer.getPaddingBottom());
    }

    public final int MediaBrowserCompatItemReceiver() {
        return InvalidTypeIdException.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(this) + InvalidTypeIdException.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(this.onFastForward) + ((MediaBrowserCompatSearchResultReceiver() || MediaBrowserCompatMediaItem()) ? this.MediaMetadataCompat.getMeasuredWidth() + mapArray.write((ViewGroup.MarginLayoutParams) this.MediaMetadataCompat.getLayoutParams()) : 0);
    }

    public final CheckableImageButton write() {
        if (MediaBrowserCompatMediaItem()) {
            return this.onCustomAction;
        }
        if (AudioAttributesImplBaseParcelizer() && MediaBrowserCompatSearchResultReceiver()) {
            return this.MediaMetadataCompat;
        }
        return null;
    }

    public final boolean MediaBrowserCompatMediaItem() {
        return this.onCustomAction.getVisibility() == 0;
    }

    private void onCustomAction() {
        this.onCustomAction.setVisibility(onPlayFromMediaId() != null && this.write.MediaBrowserCompatCustomActionResultReceiver() && this.write.MediaBrowserCompatMediaItem() ? 0 : 8);
        MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
        MediaMetadataCompat();
        if (AudioAttributesImplBaseParcelizer()) {
            return;
        }
        this.write.MediaBrowserCompatSearchResultReceiver();
    }

    private void MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
        this.AudioAttributesImplBaseParcelizer.setVisibility((this.MediaMetadataCompat.getVisibility() != 0 || MediaBrowserCompatMediaItem()) ? 8 : 0);
        setVisibility((MediaBrowserCompatSearchResultReceiver() || MediaBrowserCompatMediaItem() || ((this.onPause == null || this.handleMediaPlayPauseIfPendingOnHandler) ? '\b' : (char) 0) == 0) ? 0 : 8);
    }

    private void handleMediaPlayPauseIfPendingOnHandler() {
        for (TextInputLayout.RemoteActionCompatParcelizer remoteActionCompatParcelizer : this.IconCompatParcelizer) {
        }
    }

    private void MediaBrowserCompatItemReceiver(boolean z) {
        if (z && onPause() != null) {
            Drawable drawableMutate = findFormatOverrides.AudioAttributesImplApi26Parcelizer(onPause()).mutate();
            findFormatOverrides.AudioAttributesCompatParcelizer(drawableMutate, this.write.MediaBrowserCompatItemReceiver());
            this.MediaMetadataCompat.setImageDrawable(drawableMutate);
            return;
        }
        parseWaveFormatEx.write(this.write, this.MediaMetadataCompat, this.MediaDescriptionCompat, this.RatingCompat);
    }

    static class RemoteActionCompatParcelizer {
        private final parseBitmapInfoHeader IconCompatParcelizer;
        private final int RemoteActionCompatParcelizer;
        private final SparseArray<getMimeTypeFromTag> read = new SparseArray<>();
        private final int write;

        RemoteActionCompatParcelizer(parseBitmapInfoHeader parsebitmapinfoheader, setTitle settitle) {
            this.IconCompatParcelizer = parsebitmapinfoheader;
            this.write = settitle.MediaBrowserCompatItemReceiver(calculateNextSearchBytePosition.MediaMetadataCompat.TextInputLayout_endIconDrawable, 0);
            this.RemoteActionCompatParcelizer = settitle.MediaBrowserCompatItemReceiver(calculateNextSearchBytePosition.MediaMetadataCompat.TextInputLayout_passwordToggleDrawable, 0);
        }

        final getMimeTypeFromTag write(int i) {
            getMimeTypeFromTag getmimetypefromtag = this.read.get(i);
            if (getmimetypefromtag != null) {
                return getmimetypefromtag;
            }
            getMimeTypeFromTag getmimetypefromtagRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(i);
            this.read.append(i, getmimetypefromtagRemoteActionCompatParcelizer);
            return getmimetypefromtagRemoteActionCompatParcelizer;
        }

        private getMimeTypeFromTag RemoteActionCompatParcelizer(int i) {
            if (i == -1) {
                return new handlesChunkId(this.IconCompatParcelizer);
            }
            if (i == 0) {
                return new FlacBinarySearchSeeker(this.IconCompatParcelizer);
            }
            if (i == 1) {
                return new FlacBinarySearchSeeker1(this.IconCompatParcelizer, this.RemoteActionCompatParcelizer);
            }
            if (i == 2) {
                return new getChunkIdFourCc(this.IconCompatParcelizer);
            }
            if (i == 3) {
                return new isAudio(this.IconCompatParcelizer);
            }
            throw new IllegalArgumentException("Invalid end icon mode: ".concat(String.valueOf(i)));
        }
    }
}
