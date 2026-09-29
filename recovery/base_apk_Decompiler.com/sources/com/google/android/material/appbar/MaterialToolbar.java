package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import kotlin.DefaultExtractorsFactoryExtensionLoader;
import kotlin.InvalidTypeIdException;
import kotlin.calculateNextSearchBytePosition;
import kotlin.findFormatOverrides;
import kotlin.frameSizeBytesByTypeNb;
import kotlin.getConstantBitrateSeekMap;
import kotlin.onRequestPermissionsResult;
import kotlin.readFrames;
import kotlin.readId3Metadata;
import kotlin.readMetadataBlock;

/* JADX INFO: loaded from: classes3.dex */
public class MaterialToolbar extends Toolbar {
    private Boolean AudioAttributesImplApi26Parcelizer;
    private boolean MediaBrowserCompatMediaItem;
    private boolean MediaDescriptionCompat;
    private Integer MediaMetadataCompat;
    private ImageView.ScaleType RatingCompat;
    private static final int AudioAttributesImplBaseParcelizer = calculateNextSearchBytePosition.MediaBrowserCompatMediaItem.Widget_MaterialComponents_Toolbar;
    private static final ImageView.ScaleType[] AudioAttributesImplApi21Parcelizer = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};

    public MaterialToolbar(Context context) {
        this(context, null);
    }

    public MaterialToolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, calculateNextSearchBytePosition.IconCompatParcelizer.toolbarStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialToolbar(Context context, AttributeSet attributeSet, int i) {
        int i2 = AudioAttributesImplBaseParcelizer;
        super(readFrames.IconCompatParcelizer(context, attributeSet, i, i2), attributeSet, i);
        Context context2 = getContext();
        TypedArray typedArrayWrite = readId3Metadata.write(context2, attributeSet, calculateNextSearchBytePosition.MediaMetadataCompat.MaterialToolbar, i, i2, new int[0]);
        if (typedArrayWrite.hasValue(calculateNextSearchBytePosition.MediaMetadataCompat.MaterialToolbar_navigationIconTint)) {
            setNavigationIconTint(typedArrayWrite.getColor(calculateNextSearchBytePosition.MediaMetadataCompat.MaterialToolbar_navigationIconTint, -1));
        }
        this.MediaBrowserCompatMediaItem = typedArrayWrite.getBoolean(calculateNextSearchBytePosition.MediaMetadataCompat.MaterialToolbar_titleCentered, false);
        this.MediaDescriptionCompat = typedArrayWrite.getBoolean(calculateNextSearchBytePosition.MediaMetadataCompat.MaterialToolbar_subtitleCentered, false);
        int i3 = typedArrayWrite.getInt(calculateNextSearchBytePosition.MediaMetadataCompat.MaterialToolbar_logoScaleType, -1);
        if (i3 >= 0) {
            ImageView.ScaleType[] scaleTypeArr = AudioAttributesImplApi21Parcelizer;
            if (i3 < scaleTypeArr.length) {
                this.RatingCompat = scaleTypeArr[i3];
            }
        }
        if (typedArrayWrite.hasValue(calculateNextSearchBytePosition.MediaMetadataCompat.MaterialToolbar_logoAdjustViewBounds)) {
            this.AudioAttributesImplApi26Parcelizer = Boolean.valueOf(typedArrayWrite.getBoolean(calculateNextSearchBytePosition.MediaMetadataCompat.MaterialToolbar_logoAdjustViewBounds, false));
        }
        typedArrayWrite.recycle();
        read(context2);
    }

    @Override // androidx.appcompat.widget.Toolbar
    public final void write(int i) {
        Menu menuMediaBrowserCompatCustomActionResultReceiver = MediaBrowserCompatCustomActionResultReceiver();
        boolean z = menuMediaBrowserCompatCustomActionResultReceiver instanceof onRequestPermissionsResult;
        if (z) {
            ((onRequestPermissionsResult) menuMediaBrowserCompatCustomActionResultReceiver).onFastForward();
        }
        super.write(i);
        if (z) {
            ((onRequestPermissionsResult) menuMediaBrowserCompatCustomActionResultReceiver).onCustomAction();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        onPlayFromUri();
        onPrepareFromSearch();
    }

    private void onPlayFromUri() {
        if (this.MediaBrowserCompatMediaItem || this.MediaDescriptionCompat) {
            TextView textView = readMetadataBlock.read(this);
            TextView textViewRemoteActionCompatParcelizer = readMetadataBlock.RemoteActionCompatParcelizer(this);
            if (textView == null && textViewRemoteActionCompatParcelizer == null) {
                return;
            }
            Pair<Integer, Integer> pairWrite = write(textView, textViewRemoteActionCompatParcelizer);
            if (this.MediaBrowserCompatMediaItem && textView != null) {
                RemoteActionCompatParcelizer(textView, pairWrite);
            }
            if (!this.MediaDescriptionCompat || textViewRemoteActionCompatParcelizer == null) {
                return;
            }
            RemoteActionCompatParcelizer(textViewRemoteActionCompatParcelizer, pairWrite);
        }
    }

    private Pair<Integer, Integer> write(TextView textView, TextView textView2) {
        int measuredWidth = getMeasuredWidth();
        int i = measuredWidth / 2;
        int paddingLeft = getPaddingLeft();
        int paddingRight = measuredWidth - getPaddingRight();
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8 && childAt != textView && childAt != textView2) {
                if (childAt.getRight() < i && childAt.getRight() > paddingLeft) {
                    paddingLeft = childAt.getRight();
                }
                if (childAt.getLeft() > i && childAt.getLeft() < paddingRight) {
                    paddingRight = childAt.getLeft();
                }
            }
        }
        return new Pair<>(Integer.valueOf(paddingLeft), Integer.valueOf(paddingRight));
    }

    private void RemoteActionCompatParcelizer(View view, Pair<Integer, Integer> pair) {
        int measuredWidth = getMeasuredWidth();
        int measuredWidth2 = view.getMeasuredWidth();
        int i = (measuredWidth / 2) - (measuredWidth2 / 2);
        int i2 = measuredWidth2 + i;
        int iMax = Math.max(Math.max(((Integer) pair.first).intValue() - i, 0), Math.max(i2 - ((Integer) pair.second).intValue(), 0));
        if (iMax > 0) {
            i += iMax;
            i2 -= iMax;
            view.measure(View.MeasureSpec.makeMeasureSpec(i2 - i, 1073741824), view.getMeasuredHeightAndState());
        }
        view.layout(i, view.getTop(), i2, view.getBottom());
    }

    private void onPrepareFromSearch() {
        ImageView imageViewAudioAttributesCompatParcelizer = readMetadataBlock.AudioAttributesCompatParcelizer(this);
        if (imageViewAudioAttributesCompatParcelizer != null) {
            Boolean bool = this.AudioAttributesImplApi26Parcelizer;
            if (bool != null) {
                imageViewAudioAttributesCompatParcelizer.setAdjustViewBounds(bool.booleanValue());
            }
            ImageView.ScaleType scaleType = this.RatingCompat;
            if (scaleType != null) {
                imageViewAudioAttributesCompatParcelizer.setScaleType(scaleType);
            }
        }
    }

    public void setLogoScaleType(ImageView.ScaleType scaleType) {
        if (this.RatingCompat != scaleType) {
            this.RatingCompat = scaleType;
            requestLayout();
        }
    }

    public void setLogoAdjustViewBounds(boolean z) {
        Boolean bool = this.AudioAttributesImplApi26Parcelizer;
        if (bool == null || bool.booleanValue() != z) {
            this.AudioAttributesImplApi26Parcelizer = Boolean.valueOf(z);
            requestLayout();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getConstantBitrateSeekMap.IconCompatParcelizer(this);
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        getConstantBitrateSeekMap.read(this, f);
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        super.setNavigationIcon(read(drawable));
    }

    public void setNavigationIconTint(int i) {
        this.MediaMetadataCompat = Integer.valueOf(i);
        Drawable drawableAudioAttributesImplApi21Parcelizer = AudioAttributesImplApi21Parcelizer();
        if (drawableAudioAttributesImplApi21Parcelizer != null) {
            setNavigationIcon(drawableAudioAttributesImplApi21Parcelizer);
        }
    }

    public final Integer onPrepare() {
        return this.MediaMetadataCompat;
    }

    public void setTitleCentered(boolean z) {
        if (this.MediaBrowserCompatMediaItem != z) {
            this.MediaBrowserCompatMediaItem = z;
            requestLayout();
        }
    }

    public void setSubtitleCentered(boolean z) {
        if (this.MediaDescriptionCompat != z) {
            this.MediaDescriptionCompat = z;
            requestLayout();
        }
    }

    private void read(Context context) {
        ColorStateList colorStateListIconCompatParcelizer;
        Drawable background = getBackground();
        if (background == null) {
            colorStateListIconCompatParcelizer = ColorStateList.valueOf(0);
        } else {
            colorStateListIconCompatParcelizer = DefaultExtractorsFactoryExtensionLoader.IconCompatParcelizer(background);
        }
        if (colorStateListIconCompatParcelizer != null) {
            frameSizeBytesByTypeNb framesizebytesbytypenb = new frameSizeBytesByTypeNb();
            framesizebytesbytypenb.AudioAttributesImplApi21Parcelizer(colorStateListIconCompatParcelizer);
            framesizebytesbytypenb.RemoteActionCompatParcelizer(context);
            framesizebytesbytypenb.handleMediaPlayPauseIfPendingOnHandler(InvalidTypeIdException.AudioAttributesImplBaseParcelizer(this));
            InvalidTypeIdException.read(this, framesizebytesbytypenb);
        }
    }

    private Drawable read(Drawable drawable) {
        if (drawable == null || this.MediaMetadataCompat == null) {
            return drawable;
        }
        Drawable drawableAudioAttributesImplApi26Parcelizer = findFormatOverrides.AudioAttributesImplApi26Parcelizer(drawable.mutate());
        findFormatOverrides.AudioAttributesCompatParcelizer(drawableAudioAttributesImplApi26Parcelizer, this.MediaMetadataCompat.intValue());
        return drawableAudioAttributesImplApi26Parcelizer;
    }
}
