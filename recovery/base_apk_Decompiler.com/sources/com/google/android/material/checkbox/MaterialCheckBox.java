package com.google.android.material.checkbox;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.AnimatedStateListDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.autofill.AutofillManager;
import android.widget.CompoundButton;
import androidx.appcompat.widget.AppCompatCheckBox;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import in.juspay.hyper.constants.LogSubCategory;
import java.util.LinkedHashSet;
import kotlin.DefaultExtractorsFactoryExtensionLoader;
import kotlin.SeekMap;
import kotlin._methods;
import kotlin.calculateNextSearchBytePosition;
import kotlin.checkAndPeekStreamMarker;
import kotlin.createExtractors;
import kotlin.findFormatOverrides;
import kotlin.getActivityBanner;
import kotlin.getActivityIcon;
import kotlin.getDefaultViewModelCreationExtras;
import kotlin.readFrames;
import kotlin.readId3Metadata;
import kotlin.setTitle;

/* JADX INFO: loaded from: classes5.dex */
public class MaterialCheckBox extends AppCompatCheckBox {
    ColorStateList AudioAttributesCompatParcelizer;
    private Drawable AudioAttributesImplApi21Parcelizer;
    private Drawable AudioAttributesImplApi26Parcelizer;
    private ColorStateList AudioAttributesImplBaseParcelizer;
    private boolean MediaBrowserCompatCustomActionResultReceiver;
    private CharSequence MediaBrowserCompatMediaItem;
    private int[] MediaBrowserCompatSearchResultReceiver;
    private final LinkedHashSet<write> MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    private int MediaDescriptionCompat;
    private PorterDuff.Mode MediaMetadataCompat;
    private boolean RatingCompat;
    private CharSequence handleMediaPlayPauseIfPendingOnHandler;
    private CompoundButton.OnCheckedChangeListener onAddQueueItem;
    private ColorStateList onCommand;
    private boolean onCustomAction;
    private boolean onFastForward;
    private boolean onMediaButtonEvent;
    private final getActivityIcon onPause;
    private final getActivityBanner.RemoteActionCompatParcelizer onPlay;
    private final LinkedHashSet<RemoteActionCompatParcelizer> onPlayFromMediaId;
    private static final int write = calculateNextSearchBytePosition.MediaBrowserCompatMediaItem.Widget_MaterialComponents_CompoundButton_CheckBox;
    private static final int[] MediaBrowserCompatItemReceiver = {calculateNextSearchBytePosition.IconCompatParcelizer.state_indeterminate};
    private static final int[] RemoteActionCompatParcelizer = {calculateNextSearchBytePosition.IconCompatParcelizer.state_error};
    private static final int[][] read = {new int[]{R.attr.state_enabled, calculateNextSearchBytePosition.IconCompatParcelizer.state_error}, new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};
    private static final int IconCompatParcelizer = Resources.getSystem().getIdentifier("btn_check_material_anim", "drawable", LogSubCategory.LifeCycle.ANDROID);

    public interface RemoteActionCompatParcelizer {
    }

    public interface write {
    }

    public MaterialCheckBox(Context context) {
        this(context, null);
    }

    public MaterialCheckBox(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, calculateNextSearchBytePosition.IconCompatParcelizer.checkboxStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialCheckBox(Context context, AttributeSet attributeSet, int i) {
        int i2 = write;
        super(readFrames.IconCompatParcelizer(context, attributeSet, i, i2), attributeSet, i);
        this.onPlayFromMediaId = new LinkedHashSet<>();
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = new LinkedHashSet<>();
        this.onPause = getActivityIcon.read(getContext(), calculateNextSearchBytePosition.MediaBrowserCompatItemReceiver.mtrl_checkbox_button_checked_unchecked);
        this.onPlay = new getActivityBanner.RemoteActionCompatParcelizer() { // from class: com.google.android.material.checkbox.MaterialCheckBox.4
            @Override // o.getActivityBanner.RemoteActionCompatParcelizer
            public final void read(Drawable drawable) {
                super.read(drawable);
                if (MaterialCheckBox.this.AudioAttributesCompatParcelizer != null) {
                    findFormatOverrides.AudioAttributesCompatParcelizer(drawable, MaterialCheckBox.this.AudioAttributesCompatParcelizer.getColorForState(MaterialCheckBox.this.MediaBrowserCompatSearchResultReceiver, MaterialCheckBox.this.AudioAttributesCompatParcelizer.getDefaultColor()));
                }
            }

            @Override // o.getActivityBanner.RemoteActionCompatParcelizer
            public final void AudioAttributesCompatParcelizer(Drawable drawable) {
                super.AudioAttributesCompatParcelizer(drawable);
                if (MaterialCheckBox.this.AudioAttributesCompatParcelizer != null) {
                    findFormatOverrides.AudioAttributesCompatParcelizer(drawable, MaterialCheckBox.this.AudioAttributesCompatParcelizer);
                }
            }
        };
        Context context2 = getContext();
        this.AudioAttributesImplApi26Parcelizer = _methods.IconCompatParcelizer(this);
        this.AudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer();
        setSupportButtonTintList(null);
        setTitle settitle = readId3Metadata.read(context2, attributeSet, calculateNextSearchBytePosition.MediaMetadataCompat.MaterialCheckBox, i, i2, new int[0]);
        this.AudioAttributesImplApi21Parcelizer = settitle.IconCompatParcelizer(calculateNextSearchBytePosition.MediaMetadataCompat.MaterialCheckBox_buttonIcon);
        if (this.AudioAttributesImplApi26Parcelizer != null && readId3Metadata.write(context2) && AudioAttributesCompatParcelizer(settitle)) {
            super.setButtonDrawable((Drawable) null);
            this.AudioAttributesImplApi26Parcelizer = getDefaultViewModelCreationExtras.write(context2, calculateNextSearchBytePosition.MediaBrowserCompatItemReceiver.mtrl_checkbox_button);
            this.onFastForward = true;
            if (this.AudioAttributesImplApi21Parcelizer == null) {
                this.AudioAttributesImplApi21Parcelizer = getDefaultViewModelCreationExtras.write(context2, calculateNextSearchBytePosition.MediaBrowserCompatItemReceiver.mtrl_checkbox_button_icon);
            }
        }
        this.AudioAttributesImplBaseParcelizer = SeekMap.IconCompatParcelizer(context2, settitle, calculateNextSearchBytePosition.MediaMetadataCompat.MaterialCheckBox_buttonIconTint);
        this.MediaMetadataCompat = checkAndPeekStreamMarker.RemoteActionCompatParcelizer(settitle.read(calculateNextSearchBytePosition.MediaMetadataCompat.MaterialCheckBox_buttonIconTintMode, -1), PorterDuff.Mode.SRC_IN);
        this.onMediaButtonEvent = settitle.AudioAttributesCompatParcelizer(calculateNextSearchBytePosition.MediaMetadataCompat.MaterialCheckBox_useMaterialThemeColors, false);
        this.RatingCompat = settitle.AudioAttributesCompatParcelizer(calculateNextSearchBytePosition.MediaMetadataCompat.MaterialCheckBox_centerIfNoTextEnabled, true);
        this.onCustomAction = settitle.AudioAttributesCompatParcelizer(calculateNextSearchBytePosition.MediaMetadataCompat.MaterialCheckBox_errorShown, false);
        this.handleMediaPlayPauseIfPendingOnHandler = settitle.AudioAttributesImplBaseParcelizer(calculateNextSearchBytePosition.MediaMetadataCompat.MaterialCheckBox_errorAccessibilityLabel);
        if (settitle.AudioAttributesImplApi26Parcelizer(calculateNextSearchBytePosition.MediaMetadataCompat.MaterialCheckBox_checkedState)) {
            setCheckedState(settitle.read(calculateNextSearchBytePosition.MediaMetadataCompat.MaterialCheckBox_checkedState, 0));
        }
        settitle.write();
        write();
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        Drawable drawableIconCompatParcelizer;
        if (this.RatingCompat && TextUtils.isEmpty(getText()) && (drawableIconCompatParcelizer = _methods.IconCompatParcelizer(this)) != null) {
            int width = ((getWidth() - drawableIconCompatParcelizer.getIntrinsicWidth()) / 2) * (checkAndPeekStreamMarker.AudioAttributesImplBaseParcelizer(this) ? -1 : 1);
            int iSave = canvas.save();
            canvas.translate(width, BitmapDescriptorFactory.HUE_RED);
            super.onDraw(canvas);
            canvas.restoreToCount(iSave);
            if (getBackground() != null) {
                Rect bounds = drawableIconCompatParcelizer.getBounds();
                findFormatOverrides.write(getBackground(), bounds.left + width, bounds.top, bounds.right + width, bounds.bottom);
                return;
            }
            return;
        }
        super.onDraw(canvas);
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.onMediaButtonEvent && this.AudioAttributesCompatParcelizer == null && this.AudioAttributesImplBaseParcelizer == null) {
            setUseMaterialThemeColors(true);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (AudioAttributesImplApi26Parcelizer() == 2) {
            mergeDrawableStates(iArrOnCreateDrawableState, MediaBrowserCompatItemReceiver);
        }
        if (MediaBrowserCompatCustomActionResultReceiver()) {
            mergeDrawableStates(iArrOnCreateDrawableState, RemoteActionCompatParcelizer);
        }
        this.MediaBrowserCompatSearchResultReceiver = DefaultExtractorsFactoryExtensionLoader.write(iArrOnCreateDrawableState);
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        setCheckedState(z ? 1 : 0);
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public boolean isChecked() {
        return this.MediaDescriptionCompat == 1;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void toggle() {
        setChecked(!isChecked());
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.onAddQueueItem = onCheckedChangeListener;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (accessibilityNodeInfo == null || !MediaBrowserCompatCustomActionResultReceiver()) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append((Object) accessibilityNodeInfo.getText());
        sb.append(", ");
        sb.append((Object) this.handleMediaPlayPauseIfPendingOnHandler);
        accessibilityNodeInfo.setText(sb.toString());
    }

    public void setCheckedState(int i) {
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        if (this.MediaDescriptionCompat != i) {
            this.MediaDescriptionCompat = i;
            super.setChecked(i == 1);
            refreshDrawableState();
            MediaBrowserCompatItemReceiver();
            if (this.MediaBrowserCompatCustomActionResultReceiver) {
                return;
            }
            this.MediaBrowserCompatCustomActionResultReceiver = true;
            LinkedHashSet<write> linkedHashSet = this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
            if (linkedHashSet != null) {
                for (write writeVar : linkedHashSet) {
                }
            }
            if (this.MediaDescriptionCompat != 2 && (onCheckedChangeListener = this.onAddQueueItem) != null) {
                onCheckedChangeListener.onCheckedChanged(this, isChecked());
            }
            AutofillManager autofillManager = (AutofillManager) getContext().getSystemService(AutofillManager.class);
            if (autofillManager != null) {
                autofillManager.notifyValueChanged(this);
            }
            this.MediaBrowserCompatCustomActionResultReceiver = false;
        }
    }

    private int AudioAttributesImplApi26Parcelizer() {
        return this.MediaDescriptionCompat;
    }

    public void setErrorShown(boolean z) {
        if (this.onCustomAction != z) {
            this.onCustomAction = z;
            refreshDrawableState();
            for (RemoteActionCompatParcelizer remoteActionCompatParcelizer : this.onPlayFromMediaId) {
            }
        }
    }

    private boolean MediaBrowserCompatCustomActionResultReceiver() {
        return this.onCustomAction;
    }

    public void setErrorAccessibilityLabelResource(int i) {
        setErrorAccessibilityLabel(i != 0 ? getResources().getText(i) : null);
    }

    public void setErrorAccessibilityLabel(CharSequence charSequence) {
        this.handleMediaPlayPauseIfPendingOnHandler = charSequence;
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(getDefaultViewModelCreationExtras.write(getContext(), i));
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        this.AudioAttributesImplApi26Parcelizer = drawable;
        this.onFastForward = false;
        write();
    }

    @Override // android.widget.CompoundButton
    public Drawable getButtonDrawable() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintList(ColorStateList colorStateList) {
        if (this.AudioAttributesCompatParcelizer == colorStateList) {
            return;
        }
        this.AudioAttributesCompatParcelizer = colorStateList;
        write();
    }

    @Override // android.widget.CompoundButton
    public ColorStateList getButtonTintList() {
        return this.AudioAttributesCompatParcelizer;
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintMode(PorterDuff.Mode mode) {
        setSupportButtonTintMode(mode);
        write();
    }

    public void setButtonIconDrawableResource(int i) {
        setButtonIconDrawable(getDefaultViewModelCreationExtras.write(getContext(), i));
    }

    public void setButtonIconDrawable(Drawable drawable) {
        this.AudioAttributesImplApi21Parcelizer = drawable;
        write();
    }

    public void setButtonIconTintList(ColorStateList colorStateList) {
        if (this.AudioAttributesImplBaseParcelizer == colorStateList) {
            return;
        }
        this.AudioAttributesImplBaseParcelizer = colorStateList;
        write();
    }

    public void setButtonIconTintMode(PorterDuff.Mode mode) {
        if (this.MediaMetadataCompat == mode) {
            return;
        }
        this.MediaMetadataCompat = mode;
        write();
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.onMediaButtonEvent = z;
        if (z) {
            _methods.write(this, IconCompatParcelizer());
        } else {
            _methods.write(this, null);
        }
    }

    public void setCenterIfNoTextEnabled(boolean z) {
        this.RatingCompat = z;
    }

    private void write() {
        this.AudioAttributesImplApi26Parcelizer = DefaultExtractorsFactoryExtensionLoader.IconCompatParcelizer(this.AudioAttributesImplApi26Parcelizer, this.AudioAttributesCompatParcelizer, _methods.read(this));
        this.AudioAttributesImplApi21Parcelizer = DefaultExtractorsFactoryExtensionLoader.IconCompatParcelizer(this.AudioAttributesImplApi21Parcelizer, this.AudioAttributesImplBaseParcelizer, this.MediaMetadataCompat);
        AudioAttributesImplApi21Parcelizer();
        AudioAttributesImplBaseParcelizer();
        super.setButtonDrawable(DefaultExtractorsFactoryExtensionLoader.read(this.AudioAttributesImplApi26Parcelizer, this.AudioAttributesImplApi21Parcelizer));
        refreshDrawableState();
    }

    private void AudioAttributesImplApi21Parcelizer() {
        if (this.onFastForward) {
            getActivityIcon getactivityicon = this.onPause;
            if (getactivityicon != null) {
                getactivityicon.read(this.onPlay);
                this.onPause.RemoteActionCompatParcelizer(this.onPlay);
            }
            Drawable drawable = this.AudioAttributesImplApi26Parcelizer;
            if (!(drawable instanceof AnimatedStateListDrawable) || this.onPause == null) {
                return;
            }
            ((AnimatedStateListDrawable) drawable).addTransition(calculateNextSearchBytePosition.AudioAttributesImplApi26Parcelizer.checked, calculateNextSearchBytePosition.AudioAttributesImplApi26Parcelizer.unchecked, this.onPause, false);
            ((AnimatedStateListDrawable) this.AudioAttributesImplApi26Parcelizer).addTransition(calculateNextSearchBytePosition.AudioAttributesImplApi26Parcelizer.indeterminate, calculateNextSearchBytePosition.AudioAttributesImplApi26Parcelizer.unchecked, this.onPause, false);
        }
    }

    private void AudioAttributesImplBaseParcelizer() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        Drawable drawable = this.AudioAttributesImplApi26Parcelizer;
        if (drawable != null && (colorStateList2 = this.AudioAttributesCompatParcelizer) != null) {
            findFormatOverrides.AudioAttributesCompatParcelizer(drawable, colorStateList2);
        }
        Drawable drawable2 = this.AudioAttributesImplApi21Parcelizer;
        if (drawable2 == null || (colorStateList = this.AudioAttributesImplBaseParcelizer) == null) {
            return;
        }
        findFormatOverrides.AudioAttributesCompatParcelizer(drawable2, colorStateList);
    }

    @Override // android.widget.CompoundButton, android.view.View
    public void setStateDescription(CharSequence charSequence) {
        this.MediaBrowserCompatMediaItem = charSequence;
        if (charSequence == null) {
            MediaBrowserCompatItemReceiver();
        } else {
            super.setStateDescription(charSequence);
        }
    }

    private void MediaBrowserCompatItemReceiver() {
        if (Build.VERSION.SDK_INT < 30 || this.MediaBrowserCompatMediaItem != null) {
            return;
        }
        super.setStateDescription(RemoteActionCompatParcelizer());
    }

    private String RemoteActionCompatParcelizer() {
        int i = this.MediaDescriptionCompat;
        if (i == 1) {
            return getResources().getString(calculateNextSearchBytePosition.MediaBrowserCompatSearchResultReceiver.mtrl_checkbox_state_description_checked);
        }
        if (i == 0) {
            return getResources().getString(calculateNextSearchBytePosition.MediaBrowserCompatSearchResultReceiver.mtrl_checkbox_state_description_unchecked);
        }
        return getResources().getString(calculateNextSearchBytePosition.MediaBrowserCompatSearchResultReceiver.mtrl_checkbox_state_description_indeterminate);
    }

    private ColorStateList AudioAttributesCompatParcelizer() {
        ColorStateList colorStateList = this.AudioAttributesCompatParcelizer;
        if (colorStateList != null) {
            return colorStateList;
        }
        if (super.getButtonTintList() != null) {
            return super.getButtonTintList();
        }
        return read();
    }

    private static boolean AudioAttributesCompatParcelizer(setTitle settitle) {
        return settitle.MediaBrowserCompatItemReceiver(calculateNextSearchBytePosition.MediaMetadataCompat.MaterialCheckBox_android_button, 0) == IconCompatParcelizer && settitle.MediaBrowserCompatItemReceiver(calculateNextSearchBytePosition.MediaMetadataCompat.MaterialCheckBox_buttonCompat, 0) == 0;
    }

    private ColorStateList IconCompatParcelizer() {
        if (this.onCommand == null) {
            int[][] iArr = read;
            int[] iArr2 = new int[iArr.length];
            int iRemoteActionCompatParcelizer = createExtractors.RemoteActionCompatParcelizer(this, calculateNextSearchBytePosition.IconCompatParcelizer.colorControlActivated);
            int iRemoteActionCompatParcelizer2 = createExtractors.RemoteActionCompatParcelizer(this, calculateNextSearchBytePosition.IconCompatParcelizer.colorError);
            int iRemoteActionCompatParcelizer3 = createExtractors.RemoteActionCompatParcelizer(this, calculateNextSearchBytePosition.IconCompatParcelizer.colorSurface);
            int iRemoteActionCompatParcelizer4 = createExtractors.RemoteActionCompatParcelizer(this, calculateNextSearchBytePosition.IconCompatParcelizer.colorOnSurface);
            iArr2[0] = createExtractors.write(iRemoteActionCompatParcelizer3, iRemoteActionCompatParcelizer2, 1.0f);
            iArr2[1] = createExtractors.write(iRemoteActionCompatParcelizer3, iRemoteActionCompatParcelizer, 1.0f);
            iArr2[2] = createExtractors.write(iRemoteActionCompatParcelizer3, iRemoteActionCompatParcelizer4, 0.54f);
            iArr2[3] = createExtractors.write(iRemoteActionCompatParcelizer3, iRemoteActionCompatParcelizer4, 0.38f);
            iArr2[4] = createExtractors.write(iRemoteActionCompatParcelizer3, iRemoteActionCompatParcelizer4, 0.38f);
            this.onCommand = new ColorStateList(iArr, iArr2);
        }
        return this.onCommand;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.write = AudioAttributesImplApi26Parcelizer();
        return savedState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setCheckedState(savedState.write);
    }

    static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() { // from class: com.google.android.material.checkbox.MaterialCheckBox.SavedState.1
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ SavedState createFromParcel(Parcel parcel) {
                return IconCompatParcelizer(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ SavedState[] newArray(int i) {
                return AudioAttributesCompatParcelizer(i);
            }

            private static SavedState IconCompatParcelizer(Parcel parcel) {
                return new SavedState(parcel, (byte) 0);
            }

            private static SavedState[] AudioAttributesCompatParcelizer(int i) {
                return new SavedState[i];
            }
        };
        int write;

        /* synthetic */ SavedState(Parcel parcel, byte b) {
            this(parcel);
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        private SavedState(Parcel parcel) {
            super(parcel);
            this.write = ((Integer) parcel.readValue(getClass().getClassLoader())).intValue();
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeValue(Integer.valueOf(this.write));
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("MaterialCheckBox.SavedState{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" CheckedState=");
            sb.append(read());
            sb.append("}");
            return sb.toString();
        }

        private String read() {
            int i = this.write;
            if (i == 1) {
                return "checked";
            }
            if (i == 2) {
                return "indeterminate";
            }
            return "unchecked";
        }
    }
}
