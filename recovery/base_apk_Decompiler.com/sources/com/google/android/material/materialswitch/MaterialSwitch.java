package com.google.android.material.materialswitch;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.SwitchCompat;
import kotlin.DefaultExtractorsFactoryExtensionLoader;
import kotlin._verifyNumberForScalarCoercion;
import kotlin.calculateNextSearchBytePosition;
import kotlin.checkAndPeekStreamMarker;
import kotlin.findFormatOverrides;
import kotlin.getDefaultViewModelCreationExtras;
import kotlin.readFrames;
import kotlin.readId3Metadata;
import kotlin.setTitle;

/* JADX INFO: loaded from: classes5.dex */
public class MaterialSwitch extends SwitchCompat {
    private int[] AudioAttributesCompatParcelizer;
    private int[] AudioAttributesImplApi21Parcelizer;
    private Drawable AudioAttributesImplApi26Parcelizer;
    private int AudioAttributesImplBaseParcelizer;
    private Drawable MediaBrowserCompatCustomActionResultReceiver;
    private ColorStateList MediaBrowserCompatItemReceiver;
    private ColorStateList MediaBrowserCompatMediaItem;
    private ColorStateList MediaBrowserCompatSearchResultReceiver;
    private PorterDuff.Mode MediaDescriptionCompat;
    private Drawable MediaMetadataCompat;
    private PorterDuff.Mode RatingCompat;
    private Drawable handleMediaPlayPauseIfPendingOnHandler;
    private ColorStateList onCommand;
    private static final int write = calculateNextSearchBytePosition.MediaBrowserCompatMediaItem.Widget_Material3_CompoundButton_MaterialSwitch;
    private static final int[] RemoteActionCompatParcelizer = {calculateNextSearchBytePosition.IconCompatParcelizer.state_with_icon};

    public MaterialSwitch(Context context) {
        this(context, null);
    }

    public MaterialSwitch(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, calculateNextSearchBytePosition.IconCompatParcelizer.materialSwitchStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialSwitch(Context context, AttributeSet attributeSet, int i) {
        int i2 = write;
        super(readFrames.IconCompatParcelizer(context, attributeSet, i, i2), attributeSet, i);
        this.AudioAttributesImplBaseParcelizer = -1;
        Context context2 = getContext();
        this.AudioAttributesImplApi26Parcelizer = super.IconCompatParcelizer();
        this.MediaBrowserCompatSearchResultReceiver = super.write();
        super.setThumbTintList(null);
        this.handleMediaPlayPauseIfPendingOnHandler = super.RemoteActionCompatParcelizer();
        this.onCommand = super.MediaBrowserCompatCustomActionResultReceiver();
        super.setTrackTintList(null);
        setTitle settitle = readId3Metadata.read(context2, attributeSet, calculateNextSearchBytePosition.MediaMetadataCompat.MaterialSwitch, i, i2, new int[0]);
        this.MediaBrowserCompatCustomActionResultReceiver = settitle.IconCompatParcelizer(calculateNextSearchBytePosition.MediaMetadataCompat.MaterialSwitch_thumbIcon);
        this.AudioAttributesImplBaseParcelizer = settitle.AudioAttributesCompatParcelizer(calculateNextSearchBytePosition.MediaMetadataCompat.MaterialSwitch_thumbIconSize, -1);
        this.MediaBrowserCompatItemReceiver = settitle.write(calculateNextSearchBytePosition.MediaMetadataCompat.MaterialSwitch_thumbIconTint);
        this.RatingCompat = checkAndPeekStreamMarker.RemoteActionCompatParcelizer(settitle.read(calculateNextSearchBytePosition.MediaMetadataCompat.MaterialSwitch_thumbIconTintMode, -1), PorterDuff.Mode.SRC_IN);
        this.MediaMetadataCompat = settitle.IconCompatParcelizer(calculateNextSearchBytePosition.MediaMetadataCompat.MaterialSwitch_trackDecoration);
        this.MediaBrowserCompatMediaItem = settitle.write(calculateNextSearchBytePosition.MediaMetadataCompat.MaterialSwitch_trackDecorationTint);
        this.MediaDescriptionCompat = checkAndPeekStreamMarker.RemoteActionCompatParcelizer(settitle.read(calculateNextSearchBytePosition.MediaMetadataCompat.MaterialSwitch_trackDecorationTintMode, -1), PorterDuff.Mode.SRC_IN);
        settitle.write();
        read(false);
        MediaBrowserCompatItemReceiver();
        AudioAttributesImplBaseParcelizer();
    }

    @Override // android.view.View
    public void invalidate() {
        MediaBrowserCompatSearchResultReceiver();
        super.invalidate();
    }

    @Override // androidx.appcompat.widget.SwitchCompat, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (this.MediaBrowserCompatCustomActionResultReceiver != null) {
            mergeDrawableStates(iArrOnCreateDrawableState, RemoteActionCompatParcelizer);
        }
        this.AudioAttributesImplApi21Parcelizer = DefaultExtractorsFactoryExtensionLoader.AudioAttributesCompatParcelizer(iArrOnCreateDrawableState);
        this.AudioAttributesCompatParcelizer = DefaultExtractorsFactoryExtensionLoader.write(iArrOnCreateDrawableState);
        return iArrOnCreateDrawableState;
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setThumbDrawable(Drawable drawable) {
        this.AudioAttributesImplApi26Parcelizer = drawable;
        MediaBrowserCompatItemReceiver();
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public Drawable IconCompatParcelizer() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setThumbTintList(ColorStateList colorStateList) {
        this.MediaBrowserCompatSearchResultReceiver = colorStateList;
        MediaBrowserCompatItemReceiver();
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public ColorStateList write() {
        return this.MediaBrowserCompatSearchResultReceiver;
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setThumbTintMode(PorterDuff.Mode mode) {
        super.setThumbTintMode(mode);
        MediaBrowserCompatItemReceiver();
    }

    public void setThumbIconResource(int i) {
        setThumbIconDrawable(getDefaultViewModelCreationExtras.write(getContext(), i));
    }

    public void setThumbIconDrawable(Drawable drawable) {
        this.MediaBrowserCompatCustomActionResultReceiver = drawable;
        MediaBrowserCompatItemReceiver();
    }

    public void setThumbIconSize(int i) {
        if (this.AudioAttributesImplBaseParcelizer != i) {
            this.AudioAttributesImplBaseParcelizer = i;
            MediaBrowserCompatItemReceiver();
        }
    }

    public void setThumbIconTintList(ColorStateList colorStateList) {
        this.MediaBrowserCompatItemReceiver = colorStateList;
        MediaBrowserCompatItemReceiver();
    }

    public void setThumbIconTintMode(PorterDuff.Mode mode) {
        this.RatingCompat = mode;
        MediaBrowserCompatItemReceiver();
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setTrackDrawable(Drawable drawable) {
        this.handleMediaPlayPauseIfPendingOnHandler = drawable;
        AudioAttributesImplBaseParcelizer();
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public Drawable RemoteActionCompatParcelizer() {
        return this.handleMediaPlayPauseIfPendingOnHandler;
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setTrackTintList(ColorStateList colorStateList) {
        this.onCommand = colorStateList;
        AudioAttributesImplBaseParcelizer();
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public ColorStateList MediaBrowserCompatCustomActionResultReceiver() {
        return this.onCommand;
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setTrackTintMode(PorterDuff.Mode mode) {
        super.setTrackTintMode(mode);
        AudioAttributesImplBaseParcelizer();
    }

    public void setTrackDecorationResource(int i) {
        setTrackDecorationDrawable(getDefaultViewModelCreationExtras.write(getContext(), i));
    }

    public void setTrackDecorationDrawable(Drawable drawable) {
        this.MediaMetadataCompat = drawable;
        AudioAttributesImplBaseParcelizer();
    }

    public void setTrackDecorationTintList(ColorStateList colorStateList) {
        this.MediaBrowserCompatMediaItem = colorStateList;
        AudioAttributesImplBaseParcelizer();
    }

    public void setTrackDecorationTintMode(PorterDuff.Mode mode) {
        this.MediaDescriptionCompat = mode;
        AudioAttributesImplBaseParcelizer();
    }

    private void MediaBrowserCompatItemReceiver() {
        this.AudioAttributesImplApi26Parcelizer = DefaultExtractorsFactoryExtensionLoader.RemoteActionCompatParcelizer(this.AudioAttributesImplApi26Parcelizer, this.MediaBrowserCompatSearchResultReceiver, read());
        this.MediaBrowserCompatCustomActionResultReceiver = DefaultExtractorsFactoryExtensionLoader.RemoteActionCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver, this.MediaBrowserCompatItemReceiver, this.RatingCompat);
        MediaBrowserCompatSearchResultReceiver();
        Drawable drawable = this.AudioAttributesImplApi26Parcelizer;
        Drawable drawable2 = this.MediaBrowserCompatCustomActionResultReceiver;
        int i = this.AudioAttributesImplBaseParcelizer;
        super.setThumbDrawable(DefaultExtractorsFactoryExtensionLoader.write(drawable, drawable2, i, i));
        refreshDrawableState();
    }

    private void AudioAttributesImplBaseParcelizer() {
        Drawable drawable;
        this.handleMediaPlayPauseIfPendingOnHandler = DefaultExtractorsFactoryExtensionLoader.RemoteActionCompatParcelizer(this.handleMediaPlayPauseIfPendingOnHandler, this.onCommand, AudioAttributesImplApi21Parcelizer());
        this.MediaMetadataCompat = DefaultExtractorsFactoryExtensionLoader.RemoteActionCompatParcelizer(this.MediaMetadataCompat, this.MediaBrowserCompatMediaItem, this.MediaDescriptionCompat);
        MediaBrowserCompatSearchResultReceiver();
        Drawable layerDrawable = this.handleMediaPlayPauseIfPendingOnHandler;
        if (layerDrawable != null && (drawable = this.MediaMetadataCompat) != null) {
            layerDrawable = new LayerDrawable(new Drawable[]{layerDrawable, drawable});
        } else if (layerDrawable == null) {
            layerDrawable = this.MediaMetadataCompat;
        }
        if (layerDrawable != null) {
            setSwitchMinWidth(layerDrawable.getIntrinsicWidth());
        }
        super.setTrackDrawable(layerDrawable);
    }

    private void MediaBrowserCompatSearchResultReceiver() {
        if (this.MediaBrowserCompatSearchResultReceiver == null && this.MediaBrowserCompatItemReceiver == null && this.onCommand == null && this.MediaBrowserCompatMediaItem == null) {
            return;
        }
        float fAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer();
        ColorStateList colorStateList = this.MediaBrowserCompatSearchResultReceiver;
        if (colorStateList != null) {
            read(this.AudioAttributesImplApi26Parcelizer, colorStateList, this.AudioAttributesImplApi21Parcelizer, this.AudioAttributesCompatParcelizer, fAudioAttributesCompatParcelizer);
        }
        ColorStateList colorStateList2 = this.MediaBrowserCompatItemReceiver;
        if (colorStateList2 != null) {
            read(this.MediaBrowserCompatCustomActionResultReceiver, colorStateList2, this.AudioAttributesImplApi21Parcelizer, this.AudioAttributesCompatParcelizer, fAudioAttributesCompatParcelizer);
        }
        ColorStateList colorStateList3 = this.onCommand;
        if (colorStateList3 != null) {
            read(this.handleMediaPlayPauseIfPendingOnHandler, colorStateList3, this.AudioAttributesImplApi21Parcelizer, this.AudioAttributesCompatParcelizer, fAudioAttributesCompatParcelizer);
        }
        ColorStateList colorStateList4 = this.MediaBrowserCompatMediaItem;
        if (colorStateList4 != null) {
            read(this.MediaMetadataCompat, colorStateList4, this.AudioAttributesImplApi21Parcelizer, this.AudioAttributesCompatParcelizer, fAudioAttributesCompatParcelizer);
        }
    }

    private static void read(Drawable drawable, ColorStateList colorStateList, int[] iArr, int[] iArr2, float f) {
        if (drawable == null || colorStateList == null) {
            return;
        }
        findFormatOverrides.AudioAttributesCompatParcelizer(drawable, _verifyNumberForScalarCoercion.RemoteActionCompatParcelizer(colorStateList.getColorForState(iArr, 0), colorStateList.getColorForState(iArr2, 0), f));
    }
}
