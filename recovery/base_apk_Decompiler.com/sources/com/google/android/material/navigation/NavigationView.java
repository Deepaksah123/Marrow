package com.google.android.material.navigation;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Pair;
import android.util.TypedValue;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import androidx.core.view.WindowInsetsCompat;
import androidx.customview.view.AbsSavedState;
import androidx.drawerlayout.widget.DrawerLayout;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.internal.ScrimInsetsFrameLayout;
import java.util.Objects;
import kotlin.AudioAttributesImplApi26Parcelizer;
import kotlin.DefaultExtractorsFactoryExtensionLoader;
import kotlin.ExtractorReadResult;
import kotlin.FlacStreamMetadata;
import kotlin.InvalidTypeIdException;
import kotlin.SeekMap;
import kotlin._clearIfStdImpl;
import kotlin._init_lambda5;
import kotlin._isNaN;
import kotlin.calculateNextSearchBytePosition;
import kotlin.checkAndReadBlockSizeSamples;
import kotlin.checkBitsPerSample;
import kotlin.copyWithSeekTable;
import kotlin.frameSizeBytesByTypeNb;
import kotlin.getApproxBytesPerFrame;
import kotlin.getConstantBitrateSeekMap;
import kotlin.getDefaultViewModelCreationExtras;
import kotlin.getTimeUsAtPosition;
import kotlin.isValidFrameType;
import kotlin.onMenuItemSelected;
import kotlin.onRequestPermissionsResult;
import kotlin.onRetainNonConfigurationInstance;
import kotlin.outputPendingSampleMetadata;
import kotlin.readAmrHeader;
import kotlin.readFrames;
import kotlin.readId3Metadata;
import kotlin.readStreamInfoBlock;
import kotlin.readStreamMarker;
import kotlin.setTitle;

/* JADX INFO: loaded from: classes5.dex */
public class NavigationView extends ScrimInsetsFrameLayout implements readStreamInfoBlock {
    private int AudioAttributesImplApi21Parcelizer;
    private final DrawerLayout.RemoteActionCompatParcelizer AudioAttributesImplApi26Parcelizer;
    private final FlacStreamMetadata AudioAttributesImplBaseParcelizer;
    private boolean MediaBrowserCompatCustomActionResultReceiver;
    private final int MediaBrowserCompatMediaItem;
    private ViewTreeObserver.OnGlobalLayoutListener MediaBrowserCompatSearchResultReceiver;
    private boolean MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    private MenuInflater MediaDescriptionCompat;
    private final checkBitsPerSample MediaMetadataCompat;
    private final checkAndReadBlockSizeSamples RatingCompat;
    private final readAmrHeader onAddQueueItem;
    private final getApproxBytesPerFrame onCommand;
    private final int[] onCustomAction;
    RemoteActionCompatParcelizer write;
    private static final int[] RemoteActionCompatParcelizer = {R.attr.state_checked};
    private static final int[] MediaBrowserCompatItemReceiver = {-16842910};
    private static final int read = calculateNextSearchBytePosition.MediaBrowserCompatMediaItem.Widget_Design_NavigationView;

    public interface RemoteActionCompatParcelizer {
        boolean write();
    }

    public NavigationView(Context context) {
        this(context, null);
    }

    public NavigationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, calculateNextSearchBytePosition.IconCompatParcelizer.navigationViewStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public NavigationView(Context context, AttributeSet attributeSet, int i) {
        ColorStateList colorStateListWrite;
        int i2;
        int i3;
        int i4 = read;
        super(readFrames.IconCompatParcelizer(context, attributeSet, i, i4), attributeSet, i);
        checkBitsPerSample checkbitspersample = new checkBitsPerSample();
        this.MediaMetadataCompat = checkbitspersample;
        this.onCustomAction = new int[2];
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = true;
        this.MediaBrowserCompatCustomActionResultReceiver = true;
        this.AudioAttributesImplApi21Parcelizer = 0;
        this.onAddQueueItem = readAmrHeader.IconCompatParcelizer(this);
        this.onCommand = new getApproxBytesPerFrame(this);
        this.AudioAttributesImplBaseParcelizer = new FlacStreamMetadata(this);
        this.AudioAttributesImplApi26Parcelizer = new DrawerLayout.AudioAttributesCompatParcelizer() { // from class: com.google.android.material.navigation.NavigationView.1
            @Override // androidx.drawerlayout.widget.DrawerLayout.AudioAttributesCompatParcelizer, androidx.drawerlayout.widget.DrawerLayout.RemoteActionCompatParcelizer
            public final void RemoteActionCompatParcelizer(View view) {
                NavigationView navigationView = NavigationView.this;
                if (view == navigationView) {
                    final FlacStreamMetadata flacStreamMetadata = navigationView.AudioAttributesImplBaseParcelizer;
                    Objects.requireNonNull(flacStreamMetadata);
                    view.post(new Runnable() { // from class: o.getDecodedBitrate
                        @Override // java.lang.Runnable
                        public final void run() {
                            flacStreamMetadata.read();
                        }
                    });
                }
            }

            @Override // androidx.drawerlayout.widget.DrawerLayout.AudioAttributesCompatParcelizer, androidx.drawerlayout.widget.DrawerLayout.RemoteActionCompatParcelizer
            public final void AudioAttributesCompatParcelizer(View view) {
                NavigationView navigationView = NavigationView.this;
                if (view == navigationView) {
                    navigationView.AudioAttributesImplBaseParcelizer.IconCompatParcelizer();
                }
            }
        };
        Context context2 = getContext();
        checkAndReadBlockSizeSamples checkandreadblocksizesamples = new checkAndReadBlockSizeSamples(context2);
        this.RatingCompat = checkandreadblocksizesamples;
        setTitle settitle = readId3Metadata.read(context2, attributeSet, calculateNextSearchBytePosition.MediaMetadataCompat.NavigationView, i, i4, new int[0]);
        if (settitle.AudioAttributesImplApi26Parcelizer(calculateNextSearchBytePosition.MediaMetadataCompat.NavigationView_android_background)) {
            InvalidTypeIdException.read(this, settitle.IconCompatParcelizer(calculateNextSearchBytePosition.MediaMetadataCompat.NavigationView_android_background));
        }
        this.AudioAttributesImplApi21Parcelizer = settitle.AudioAttributesCompatParcelizer(calculateNextSearchBytePosition.MediaMetadataCompat.NavigationView_drawerLayoutCornerSize, 0);
        Drawable background = getBackground();
        ColorStateList colorStateListIconCompatParcelizer = DefaultExtractorsFactoryExtensionLoader.IconCompatParcelizer(background);
        if (background == null || colorStateListIconCompatParcelizer != null) {
            frameSizeBytesByTypeNb framesizebytesbytypenb = new frameSizeBytesByTypeNb(isValidFrameType.read(context2, attributeSet, i, i4).RemoteActionCompatParcelizer());
            if (colorStateListIconCompatParcelizer != null) {
                framesizebytesbytypenb.AudioAttributesImplApi21Parcelizer(colorStateListIconCompatParcelizer);
            }
            framesizebytesbytypenb.RemoteActionCompatParcelizer(context2);
            InvalidTypeIdException.read(this, framesizebytesbytypenb);
        }
        if (settitle.AudioAttributesImplApi26Parcelizer(calculateNextSearchBytePosition.MediaMetadataCompat.NavigationView_elevation)) {
            setElevation(settitle.AudioAttributesCompatParcelizer(calculateNextSearchBytePosition.MediaMetadataCompat.NavigationView_elevation, 0));
        }
        setFitsSystemWindows(settitle.AudioAttributesCompatParcelizer(calculateNextSearchBytePosition.MediaMetadataCompat.NavigationView_android_fitsSystemWindows, false));
        this.MediaBrowserCompatMediaItem = settitle.AudioAttributesCompatParcelizer(calculateNextSearchBytePosition.MediaMetadataCompat.NavigationView_android_maxWidth, 0);
        ColorStateList colorStateListWrite2 = settitle.AudioAttributesImplApi26Parcelizer(calculateNextSearchBytePosition.MediaMetadataCompat.NavigationView_subheaderColor) ? settitle.write(calculateNextSearchBytePosition.MediaMetadataCompat.NavigationView_subheaderColor) : null;
        int iMediaBrowserCompatItemReceiver = settitle.AudioAttributesImplApi26Parcelizer(calculateNextSearchBytePosition.MediaMetadataCompat.NavigationView_subheaderTextAppearance) ? settitle.MediaBrowserCompatItemReceiver(calculateNextSearchBytePosition.MediaMetadataCompat.NavigationView_subheaderTextAppearance, 0) : 0;
        if (iMediaBrowserCompatItemReceiver == 0 && colorStateListWrite2 == null) {
            colorStateListWrite2 = read(R.attr.textColorSecondary);
        }
        if (settitle.AudioAttributesImplApi26Parcelizer(calculateNextSearchBytePosition.MediaMetadataCompat.NavigationView_itemIconTint)) {
            colorStateListWrite = settitle.write(calculateNextSearchBytePosition.MediaMetadataCompat.NavigationView_itemIconTint);
        } else {
            colorStateListWrite = read(R.attr.textColorSecondary);
        }
        int iMediaBrowserCompatItemReceiver2 = settitle.AudioAttributesImplApi26Parcelizer(calculateNextSearchBytePosition.MediaMetadataCompat.NavigationView_itemTextAppearance) ? settitle.MediaBrowserCompatItemReceiver(calculateNextSearchBytePosition.MediaMetadataCompat.NavigationView_itemTextAppearance, 0) : 0;
        boolean zAudioAttributesCompatParcelizer = settitle.AudioAttributesCompatParcelizer(calculateNextSearchBytePosition.MediaMetadataCompat.NavigationView_itemTextAppearanceActiveBoldEnabled, true);
        if (settitle.AudioAttributesImplApi26Parcelizer(calculateNextSearchBytePosition.MediaMetadataCompat.NavigationView_itemIconSize)) {
            setItemIconSize(settitle.AudioAttributesCompatParcelizer(calculateNextSearchBytePosition.MediaMetadataCompat.NavigationView_itemIconSize, 0));
        }
        ColorStateList colorStateListWrite3 = settitle.AudioAttributesImplApi26Parcelizer(calculateNextSearchBytePosition.MediaMetadataCompat.NavigationView_itemTextColor) ? settitle.write(calculateNextSearchBytePosition.MediaMetadataCompat.NavigationView_itemTextColor) : null;
        if (iMediaBrowserCompatItemReceiver2 == 0 && colorStateListWrite3 == null) {
            colorStateListWrite3 = read(R.attr.textColorPrimary);
        }
        Drawable drawableIconCompatParcelizer = settitle.IconCompatParcelizer(calculateNextSearchBytePosition.MediaMetadataCompat.NavigationView_itemBackground);
        if (drawableIconCompatParcelizer == null && read(settitle)) {
            drawableIconCompatParcelizer = AudioAttributesCompatParcelizer(settitle);
            ColorStateList colorStateListIconCompatParcelizer2 = SeekMap.IconCompatParcelizer(context2, settitle, calculateNextSearchBytePosition.MediaMetadataCompat.NavigationView_itemRippleColor);
            if (colorStateListIconCompatParcelizer2 != null) {
                checkbitspersample.write(new RippleDrawable(outputPendingSampleMetadata.RemoteActionCompatParcelizer(colorStateListIconCompatParcelizer2), null, IconCompatParcelizer(settitle, null)));
            }
        }
        if (settitle.AudioAttributesImplApi26Parcelizer(calculateNextSearchBytePosition.MediaMetadataCompat.NavigationView_itemHorizontalPadding)) {
            i2 = 0;
            setItemHorizontalPadding(settitle.AudioAttributesCompatParcelizer(calculateNextSearchBytePosition.MediaMetadataCompat.NavigationView_itemHorizontalPadding, 0));
        } else {
            i2 = 0;
        }
        if (settitle.AudioAttributesImplApi26Parcelizer(calculateNextSearchBytePosition.MediaMetadataCompat.NavigationView_itemVerticalPadding)) {
            setItemVerticalPadding(settitle.AudioAttributesCompatParcelizer(calculateNextSearchBytePosition.MediaMetadataCompat.NavigationView_itemVerticalPadding, i2));
        }
        setDividerInsetStart(settitle.AudioAttributesCompatParcelizer(calculateNextSearchBytePosition.MediaMetadataCompat.NavigationView_dividerInsetStart, i2));
        setDividerInsetEnd(settitle.AudioAttributesCompatParcelizer(calculateNextSearchBytePosition.MediaMetadataCompat.NavigationView_dividerInsetEnd, i2));
        setSubheaderInsetStart(settitle.AudioAttributesCompatParcelizer(calculateNextSearchBytePosition.MediaMetadataCompat.NavigationView_subheaderInsetStart, i2));
        setSubheaderInsetEnd(settitle.AudioAttributesCompatParcelizer(calculateNextSearchBytePosition.MediaMetadataCompat.NavigationView_subheaderInsetEnd, i2));
        setTopInsetScrimEnabled(settitle.AudioAttributesCompatParcelizer(calculateNextSearchBytePosition.MediaMetadataCompat.NavigationView_topInsetScrimEnabled, this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver));
        setBottomInsetScrimEnabled(settitle.AudioAttributesCompatParcelizer(calculateNextSearchBytePosition.MediaMetadataCompat.NavigationView_bottomInsetScrimEnabled, this.MediaBrowserCompatCustomActionResultReceiver));
        int iAudioAttributesCompatParcelizer = settitle.AudioAttributesCompatParcelizer(calculateNextSearchBytePosition.MediaMetadataCompat.NavigationView_itemIconPadding, i2);
        setItemMaxLines(settitle.read(calculateNextSearchBytePosition.MediaMetadataCompat.NavigationView_itemMaxLines, 1));
        checkandreadblocksizesamples.IconCompatParcelizer(new onRequestPermissionsResult.RemoteActionCompatParcelizer() { // from class: com.google.android.material.navigation.NavigationView.5
            @Override // o.onRequestPermissionsResult.RemoteActionCompatParcelizer
            public final void read(onRequestPermissionsResult onrequestpermissionsresult) {
            }

            @Override // o.onRequestPermissionsResult.RemoteActionCompatParcelizer
            public final boolean write(onRequestPermissionsResult onrequestpermissionsresult, MenuItem menuItem) {
                return NavigationView.this.write != null && NavigationView.this.write.write();
            }
        });
        checkbitspersample.read();
        checkbitspersample.read(context2, checkandreadblocksizesamples);
        if (iMediaBrowserCompatItemReceiver != 0) {
            checkbitspersample.MediaBrowserCompatSearchResultReceiver(iMediaBrowserCompatItemReceiver);
        }
        checkbitspersample.IconCompatParcelizer(colorStateListWrite2);
        checkbitspersample.write(colorStateListWrite);
        checkbitspersample.AudioAttributesImplApi21Parcelizer(getOverScrollMode());
        if (iMediaBrowserCompatItemReceiver2 != 0) {
            checkbitspersample.MediaBrowserCompatItemReceiver(iMediaBrowserCompatItemReceiver2);
        }
        checkbitspersample.IconCompatParcelizer(zAudioAttributesCompatParcelizer);
        checkbitspersample.AudioAttributesCompatParcelizer(colorStateListWrite3);
        checkbitspersample.read(drawableIconCompatParcelizer);
        checkbitspersample.RemoteActionCompatParcelizer(iAudioAttributesCompatParcelizer);
        checkandreadblocksizesamples.AudioAttributesCompatParcelizer(checkbitspersample);
        addView((View) checkbitspersample.RemoteActionCompatParcelizer(this));
        if (settitle.AudioAttributesImplApi26Parcelizer(calculateNextSearchBytePosition.MediaMetadataCompat.NavigationView_menu)) {
            i3 = 0;
            RemoteActionCompatParcelizer(settitle.MediaBrowserCompatItemReceiver(calculateNextSearchBytePosition.MediaMetadataCompat.NavigationView_menu, 0));
        } else {
            i3 = 0;
        }
        if (settitle.AudioAttributesImplApi26Parcelizer(calculateNextSearchBytePosition.MediaMetadataCompat.NavigationView_headerLayout)) {
            write(settitle.MediaBrowserCompatItemReceiver(calculateNextSearchBytePosition.MediaMetadataCompat.NavigationView_headerLayout, i3));
        }
        settitle.write();
        MediaBrowserCompatCustomActionResultReceiver();
    }

    @Override // android.view.View
    public void setOverScrollMode(int i) {
        super.setOverScrollMode(i);
        checkBitsPerSample checkbitspersample = this.MediaMetadataCompat;
        if (checkbitspersample != null) {
            checkbitspersample.AudioAttributesImplApi21Parcelizer(i);
        }
    }

    public void setForceCompatClippingEnabled(boolean z) {
        this.onAddQueueItem.IconCompatParcelizer(this, z);
    }

    private void write(int i, int i2) {
        if ((getParent() instanceof DrawerLayout) && (getLayoutParams() instanceof DrawerLayout.LayoutParams) && this.AudioAttributesImplApi21Parcelizer > 0 && (getBackground() instanceof frameSizeBytesByTypeNb)) {
            boolean z = _clearIfStdImpl.write(((DrawerLayout.LayoutParams) getLayoutParams()).IconCompatParcelizer, InvalidTypeIdException.MediaBrowserCompatMediaItem(this)) == 3;
            frameSizeBytesByTypeNb framesizebytesbytypenb = (frameSizeBytesByTypeNb) getBackground();
            isValidFrameType.write writeVarIconCompatParcelizer = framesizebytesbytypenb.onPlayFromUri().MediaDescriptionCompat().IconCompatParcelizer(this.AudioAttributesImplApi21Parcelizer);
            if (z) {
                writeVarIconCompatParcelizer.MediaBrowserCompatItemReceiver(BitmapDescriptorFactory.HUE_RED);
                writeVarIconCompatParcelizer.write(BitmapDescriptorFactory.HUE_RED);
            } else {
                writeVarIconCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver(BitmapDescriptorFactory.HUE_RED);
                writeVarIconCompatParcelizer.read(BitmapDescriptorFactory.HUE_RED);
            }
            isValidFrameType isvalidframetypeRemoteActionCompatParcelizer = writeVarIconCompatParcelizer.RemoteActionCompatParcelizer();
            framesizebytesbytypenb.setShapeAppearanceModel(isvalidframetypeRemoteActionCompatParcelizer);
            this.onAddQueueItem.write(this, isvalidframetypeRemoteActionCompatParcelizer);
            this.onAddQueueItem.IconCompatParcelizer(this, new RectF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, i, i2));
            this.onAddQueueItem.RemoteActionCompatParcelizer(this);
        }
    }

    private static boolean read(setTitle settitle) {
        return settitle.AudioAttributesImplApi26Parcelizer(calculateNextSearchBytePosition.MediaMetadataCompat.NavigationView_itemShapeAppearance) || settitle.AudioAttributesImplApi26Parcelizer(calculateNextSearchBytePosition.MediaMetadataCompat.NavigationView_itemShapeAppearanceOverlay);
    }

    @Override // com.google.android.material.internal.ScrimInsetsFrameLayout, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getConstantBitrateSeekMap.IconCompatParcelizer(this);
        ViewParent parent = getParent();
        if ((parent instanceof DrawerLayout) && this.AudioAttributesImplBaseParcelizer.AudioAttributesCompatParcelizer()) {
            DrawerLayout drawerLayout = (DrawerLayout) parent;
            drawerLayout.read(this.AudioAttributesImplApi26Parcelizer);
            drawerLayout.IconCompatParcelizer(this.AudioAttributesImplApi26Parcelizer);
            if (DrawerLayout.AudioAttributesImplBaseParcelizer(this)) {
                this.AudioAttributesImplBaseParcelizer.read();
            }
        }
    }

    @Override // com.google.android.material.internal.ScrimInsetsFrameLayout, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnGlobalLayoutListener(this.MediaBrowserCompatSearchResultReceiver);
        ViewParent parent = getParent();
        if (parent instanceof DrawerLayout) {
            ((DrawerLayout) parent).read(this.AudioAttributesImplApi26Parcelizer);
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        write(i, i2);
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        getConstantBitrateSeekMap.read(this, f);
    }

    private Drawable AudioAttributesCompatParcelizer(setTitle settitle) {
        return IconCompatParcelizer(settitle, SeekMap.IconCompatParcelizer(getContext(), settitle, calculateNextSearchBytePosition.MediaMetadataCompat.NavigationView_itemShapeFillColor));
    }

    private Drawable IconCompatParcelizer(setTitle settitle, ColorStateList colorStateList) {
        frameSizeBytesByTypeNb framesizebytesbytypenb = new frameSizeBytesByTypeNb(isValidFrameType.read(getContext(), settitle.MediaBrowserCompatItemReceiver(calculateNextSearchBytePosition.MediaMetadataCompat.NavigationView_itemShapeAppearance, 0), settitle.MediaBrowserCompatItemReceiver(calculateNextSearchBytePosition.MediaMetadataCompat.NavigationView_itemShapeAppearanceOverlay, 0)).RemoteActionCompatParcelizer());
        framesizebytesbytypenb.AudioAttributesImplApi21Parcelizer(colorStateList);
        return new InsetDrawable((Drawable) framesizebytesbytypenb, settitle.AudioAttributesCompatParcelizer(calculateNextSearchBytePosition.MediaMetadataCompat.NavigationView_itemShapeInsetStart, 0), settitle.AudioAttributesCompatParcelizer(calculateNextSearchBytePosition.MediaMetadataCompat.NavigationView_itemShapeInsetTop, 0), settitle.AudioAttributesCompatParcelizer(calculateNextSearchBytePosition.MediaMetadataCompat.NavigationView_itemShapeInsetEnd, 0), settitle.AudioAttributesCompatParcelizer(calculateNextSearchBytePosition.MediaMetadataCompat.NavigationView_itemShapeInsetBottom, 0));
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.read = new Bundle();
        this.RatingCompat.AudioAttributesCompatParcelizer(savedState.read);
        return savedState;
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.read());
        this.RatingCompat.write(savedState.read);
    }

    public void setNavigationItemSelectedListener(RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        this.write = remoteActionCompatParcelizer;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        if (mode == Integer.MIN_VALUE) {
            i = View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i), this.MediaBrowserCompatMediaItem), 1073741824);
        } else if (mode == 0) {
            i = View.MeasureSpec.makeMeasureSpec(this.MediaBrowserCompatMediaItem, 1073741824);
        }
        super.onMeasure(i, i2);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        this.onAddQueueItem.RemoteActionCompatParcelizer(canvas, new getTimeUsAtPosition.IconCompatParcelizer() { // from class: o.getMaxDecodedFrameSize
            @Override // o.getTimeUsAtPosition.IconCompatParcelizer
            public final void RemoteActionCompatParcelizer(Canvas canvas2) {
                this.write.read(canvas2);
            }
        });
    }

    public final /* synthetic */ void read(Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    @Override // com.google.android.material.internal.ScrimInsetsFrameLayout
    public final void RemoteActionCompatParcelizer(WindowInsetsCompat windowInsetsCompat) {
        this.MediaMetadataCompat.read(windowInsetsCompat);
    }

    private void RemoteActionCompatParcelizer(int i) {
        this.MediaMetadataCompat.read(true);
        AudioAttributesCompatParcelizer().inflate(i, this.RatingCompat);
        this.MediaMetadataCompat.read(false);
        this.MediaMetadataCompat.AudioAttributesCompatParcelizer(false);
    }

    private View write(int i) {
        return this.MediaMetadataCompat.IconCompatParcelizer(i);
    }

    public void setItemIconTintList(ColorStateList colorStateList) {
        this.MediaMetadataCompat.write(colorStateList);
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.MediaMetadataCompat.AudioAttributesCompatParcelizer(colorStateList);
    }

    public void setItemBackgroundResource(int i) {
        setItemBackground(_isNaN.getDrawable(getContext(), i));
    }

    public void setItemBackground(Drawable drawable) {
        this.MediaMetadataCompat.read(drawable);
    }

    public void setItemHorizontalPadding(int i) {
        this.MediaMetadataCompat.AudioAttributesCompatParcelizer(i);
    }

    public void setItemHorizontalPaddingResource(int i) {
        this.MediaMetadataCompat.AudioAttributesCompatParcelizer(getResources().getDimensionPixelSize(i));
    }

    public void setItemVerticalPadding(int i) {
        this.MediaMetadataCompat.MediaBrowserCompatCustomActionResultReceiver(i);
    }

    public void setItemVerticalPaddingResource(int i) {
        this.MediaMetadataCompat.MediaBrowserCompatCustomActionResultReceiver(getResources().getDimensionPixelSize(i));
    }

    public void setItemIconPadding(int i) {
        this.MediaMetadataCompat.RemoteActionCompatParcelizer(i);
    }

    public void setItemIconPaddingResource(int i) {
        this.MediaMetadataCompat.RemoteActionCompatParcelizer(getResources().getDimensionPixelSize(i));
    }

    public void setCheckedItem(int i) {
        MenuItem menuItemFindItem = this.RatingCompat.findItem(i);
        if (menuItemFindItem != null) {
            this.MediaMetadataCompat.AudioAttributesCompatParcelizer((onRetainNonConfigurationInstance) menuItemFindItem);
        }
    }

    public void setCheckedItem(MenuItem menuItem) {
        MenuItem menuItemFindItem = this.RatingCompat.findItem(menuItem.getItemId());
        if (menuItemFindItem != null) {
            this.MediaMetadataCompat.AudioAttributesCompatParcelizer((onRetainNonConfigurationInstance) menuItemFindItem);
            return;
        }
        throw new IllegalArgumentException("Called setCheckedItem(MenuItem) with an item that is not in the current menu.");
    }

    public void setItemTextAppearance(int i) {
        this.MediaMetadataCompat.MediaBrowserCompatItemReceiver(i);
    }

    public void setItemTextAppearanceActiveBoldEnabled(boolean z) {
        this.MediaMetadataCompat.IconCompatParcelizer(z);
    }

    public void setItemIconSize(int i) {
        this.MediaMetadataCompat.AudioAttributesImplApi26Parcelizer(i);
    }

    public void setItemMaxLines(int i) {
        this.MediaMetadataCompat.AudioAttributesImplBaseParcelizer(i);
    }

    public final boolean write() {
        return this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    }

    public void setTopInsetScrimEnabled(boolean z) {
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = z;
    }

    public final boolean IconCompatParcelizer() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    public void setBottomInsetScrimEnabled(boolean z) {
        this.MediaBrowserCompatCustomActionResultReceiver = z;
    }

    public void setDividerInsetStart(int i) {
        this.MediaMetadataCompat.read(i);
    }

    public void setDividerInsetEnd(int i) {
        this.MediaMetadataCompat.write(i);
    }

    public void setSubheaderInsetStart(int i) {
        this.MediaMetadataCompat.MediaMetadataCompat(i);
    }

    public void setSubheaderInsetEnd(int i) {
        this.MediaMetadataCompat.MediaDescriptionCompat(i);
    }

    @Override // kotlin.readStreamInfoBlock
    public final void RemoteActionCompatParcelizer(AudioAttributesImplApi26Parcelizer audioAttributesImplApi26Parcelizer) {
        RemoteActionCompatParcelizer();
        this.onCommand.IconCompatParcelizer(audioAttributesImplApi26Parcelizer);
    }

    @Override // kotlin.readStreamInfoBlock
    public final void write(AudioAttributesImplApi26Parcelizer audioAttributesImplApi26Parcelizer) {
        this.onCommand.IconCompatParcelizer(audioAttributesImplApi26Parcelizer, ((DrawerLayout.LayoutParams) RemoteActionCompatParcelizer().second).IconCompatParcelizer);
    }

    @Override // kotlin.readStreamInfoBlock
    public final void AudioAttributesImplApi21Parcelizer() {
        Pair<DrawerLayout, DrawerLayout.LayoutParams> pairRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
        DrawerLayout drawerLayout = (DrawerLayout) pairRemoteActionCompatParcelizer.first;
        AudioAttributesImplApi26Parcelizer audioAttributesImplApi26ParcelizerIconCompatParcelizer = this.onCommand.IconCompatParcelizer();
        if (audioAttributesImplApi26ParcelizerIconCompatParcelizer == null || Build.VERSION.SDK_INT < 34) {
            drawerLayout.read(this);
            return;
        }
        this.onCommand.write(audioAttributesImplApi26ParcelizerIconCompatParcelizer, ((DrawerLayout.LayoutParams) pairRemoteActionCompatParcelizer.second).IconCompatParcelizer, copyWithSeekTable.IconCompatParcelizer(drawerLayout, this), copyWithSeekTable.write(drawerLayout));
    }

    @Override // kotlin.readStreamInfoBlock
    public final void read() {
        RemoteActionCompatParcelizer();
        this.onCommand.write();
    }

    private Pair<DrawerLayout, DrawerLayout.LayoutParams> RemoteActionCompatParcelizer() {
        ViewParent parent = getParent();
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if ((parent instanceof DrawerLayout) && (layoutParams instanceof DrawerLayout.LayoutParams)) {
            return new Pair<>((DrawerLayout) parent, (DrawerLayout.LayoutParams) layoutParams);
        }
        throw new IllegalStateException("NavigationView back progress requires the direct parent view to be a DrawerLayout.");
    }

    private MenuInflater AudioAttributesCompatParcelizer() {
        if (this.MediaDescriptionCompat == null) {
            this.MediaDescriptionCompat = new onMenuItemSelected(getContext());
        }
        return this.MediaDescriptionCompat;
    }

    private ColorStateList read(int i) {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(i, typedValue, true)) {
            return null;
        }
        ColorStateList colorStateListIconCompatParcelizer = getDefaultViewModelCreationExtras.IconCompatParcelizer(getContext(), typedValue.resourceId);
        if (!getContext().getTheme().resolveAttribute(_init_lambda5.read.colorPrimary, typedValue, true)) {
            return null;
        }
        int i2 = typedValue.data;
        int defaultColor = colorStateListIconCompatParcelizer.getDefaultColor();
        int[] iArr = MediaBrowserCompatItemReceiver;
        return new ColorStateList(new int[][]{iArr, RemoteActionCompatParcelizer, EMPTY_STATE_SET}, new int[]{colorStateListIconCompatParcelizer.getColorForState(iArr, defaultColor), i2, defaultColor});
    }

    private void MediaBrowserCompatCustomActionResultReceiver() {
        this.MediaBrowserCompatSearchResultReceiver = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.google.android.material.navigation.NavigationView.4
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                NavigationView navigationView = NavigationView.this;
                navigationView.getLocationOnScreen(navigationView.onCustomAction);
                boolean z = true;
                boolean z2 = NavigationView.this.onCustomAction[1] == 0;
                NavigationView.this.MediaMetadataCompat.RemoteActionCompatParcelizer(z2);
                NavigationView navigationView2 = NavigationView.this;
                navigationView2.setDrawTopInsetForeground(z2 && navigationView2.write());
                NavigationView.this.setDrawLeftInsetForeground(NavigationView.this.onCustomAction[0] == 0 || NavigationView.this.onCustomAction[0] + NavigationView.this.getWidth() == 0);
                Activity activityWrite = ExtractorReadResult.write(NavigationView.this.getContext());
                if (activityWrite != null) {
                    Rect rectAudioAttributesCompatParcelizer = readStreamMarker.AudioAttributesCompatParcelizer(activityWrite);
                    boolean z3 = rectAudioAttributesCompatParcelizer.height() - NavigationView.this.getHeight() == NavigationView.this.onCustomAction[1];
                    boolean z4 = Color.alpha(activityWrite.getWindow().getNavigationBarColor()) != 0;
                    NavigationView navigationView3 = NavigationView.this;
                    navigationView3.setDrawBottomInsetForeground(z3 && z4 && navigationView3.IconCompatParcelizer());
                    if (rectAudioAttributesCompatParcelizer.width() != NavigationView.this.onCustomAction[0] && rectAudioAttributesCompatParcelizer.width() - NavigationView.this.getWidth() != NavigationView.this.onCustomAction[0]) {
                        z = false;
                    }
                    NavigationView.this.setDrawRightInsetForeground(z);
                }
            }
        };
        getViewTreeObserver().addOnGlobalLayoutListener(this.MediaBrowserCompatSearchResultReceiver);
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: com.google.android.material.navigation.NavigationView.SavedState.1
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return IconCompatParcelizer(parcel);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public final /* synthetic */ SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return write(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ Object[] newArray(int i) {
                return AudioAttributesCompatParcelizer(i);
            }

            private static SavedState write(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            private static SavedState IconCompatParcelizer(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            private static SavedState[] AudioAttributesCompatParcelizer(int i) {
                return new SavedState[i];
            }
        };
        public Bundle read;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.read = parcel.readBundle(classLoader);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeBundle(this.read);
        }
    }
}
