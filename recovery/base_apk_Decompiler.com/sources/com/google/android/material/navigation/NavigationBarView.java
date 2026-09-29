package com.google.android.material.navigation;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import androidx.customview.view.AbsSavedState;
import kotlin.DefaultExtractorsFactoryExtensionLoader;
import kotlin.InvalidTypeIdException;
import kotlin.SeekMap;
import kotlin.calculateNextSearchBytePosition;
import kotlin.copyWithVorbisComments;
import kotlin.findFormatOverrides;
import kotlin.frameSizeBytesByTypeNb;
import kotlin.getConstantBitrateSeekMap;
import kotlin.isValidFrameType;
import kotlin.onMenuItemSelected;
import kotlin.onRequestPermissionsResult;
import kotlin.readFrames;
import kotlin.readId3Metadata;
import kotlin.registerForActivityResult;
import kotlin.setTitle;

/* JADX INFO: loaded from: classes5.dex */
public abstract class NavigationBarView extends FrameLayout {
    private MenuInflater AudioAttributesCompatParcelizer;
    private AudioAttributesCompatParcelizer AudioAttributesImplApi26Parcelizer;
    private IconCompatParcelizer IconCompatParcelizer;
    private final NavigationBarMenuView RemoteActionCompatParcelizer;
    private final copyWithVorbisComments read;
    private final NavigationBarPresenter write;

    public interface AudioAttributesCompatParcelizer {
        boolean IconCompatParcelizer();
    }

    public interface IconCompatParcelizer {
    }

    public abstract int RemoteActionCompatParcelizer();

    protected abstract NavigationBarMenuView read(Context context);

    public NavigationBarView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(readFrames.IconCompatParcelizer(context, attributeSet, i, i2), attributeSet, i);
        NavigationBarPresenter navigationBarPresenter = new NavigationBarPresenter();
        this.write = navigationBarPresenter;
        Context context2 = getContext();
        setTitle settitle = readId3Metadata.read(context2, attributeSet, calculateNextSearchBytePosition.MediaMetadataCompat.NavigationBarView, i, i2, calculateNextSearchBytePosition.MediaMetadataCompat.NavigationBarView_itemTextAppearanceInactive, calculateNextSearchBytePosition.MediaMetadataCompat.NavigationBarView_itemTextAppearanceActive);
        copyWithVorbisComments copywithvorbiscomments = new copyWithVorbisComments(context2, getClass(), RemoteActionCompatParcelizer());
        this.read = copywithvorbiscomments;
        NavigationBarMenuView navigationBarMenuView = read(context2);
        this.RemoteActionCompatParcelizer = navigationBarMenuView;
        navigationBarPresenter.RemoteActionCompatParcelizer(navigationBarMenuView);
        navigationBarPresenter.write();
        navigationBarMenuView.setPresenter(navigationBarPresenter);
        copywithvorbiscomments.AudioAttributesCompatParcelizer(navigationBarPresenter);
        navigationBarPresenter.read(getContext(), copywithvorbiscomments);
        if (settitle.AudioAttributesImplApi26Parcelizer(calculateNextSearchBytePosition.MediaMetadataCompat.NavigationBarView_itemIconTint)) {
            navigationBarMenuView.setIconTintList(settitle.write(calculateNextSearchBytePosition.MediaMetadataCompat.NavigationBarView_itemIconTint));
        } else {
            navigationBarMenuView.setIconTintList(navigationBarMenuView.RemoteActionCompatParcelizer());
        }
        setItemIconSize(settitle.AudioAttributesCompatParcelizer(calculateNextSearchBytePosition.MediaMetadataCompat.NavigationBarView_itemIconSize, getResources().getDimensionPixelSize(calculateNextSearchBytePosition.write.mtrl_navigation_bar_item_default_icon_size)));
        if (settitle.AudioAttributesImplApi26Parcelizer(calculateNextSearchBytePosition.MediaMetadataCompat.NavigationBarView_itemTextAppearanceInactive)) {
            setItemTextAppearanceInactive(settitle.MediaBrowserCompatItemReceiver(calculateNextSearchBytePosition.MediaMetadataCompat.NavigationBarView_itemTextAppearanceInactive, 0));
        }
        if (settitle.AudioAttributesImplApi26Parcelizer(calculateNextSearchBytePosition.MediaMetadataCompat.NavigationBarView_itemTextAppearanceActive)) {
            setItemTextAppearanceActive(settitle.MediaBrowserCompatItemReceiver(calculateNextSearchBytePosition.MediaMetadataCompat.NavigationBarView_itemTextAppearanceActive, 0));
        }
        setItemTextAppearanceActiveBoldEnabled(settitle.AudioAttributesCompatParcelizer(calculateNextSearchBytePosition.MediaMetadataCompat.NavigationBarView_itemTextAppearanceActiveBoldEnabled, true));
        if (settitle.AudioAttributesImplApi26Parcelizer(calculateNextSearchBytePosition.MediaMetadataCompat.NavigationBarView_itemTextColor)) {
            setItemTextColor(settitle.write(calculateNextSearchBytePosition.MediaMetadataCompat.NavigationBarView_itemTextColor));
        }
        Drawable background = getBackground();
        ColorStateList colorStateListIconCompatParcelizer = DefaultExtractorsFactoryExtensionLoader.IconCompatParcelizer(background);
        if (background == null || colorStateListIconCompatParcelizer != null) {
            frameSizeBytesByTypeNb framesizebytesbytypenb = new frameSizeBytesByTypeNb(isValidFrameType.read(context2, attributeSet, i, i2).RemoteActionCompatParcelizer());
            if (colorStateListIconCompatParcelizer != null) {
                framesizebytesbytypenb.AudioAttributesImplApi21Parcelizer(colorStateListIconCompatParcelizer);
            }
            framesizebytesbytypenb.RemoteActionCompatParcelizer(context2);
            InvalidTypeIdException.read(this, framesizebytesbytypenb);
        }
        if (settitle.AudioAttributesImplApi26Parcelizer(calculateNextSearchBytePosition.MediaMetadataCompat.NavigationBarView_itemPaddingTop)) {
            setItemPaddingTop(settitle.AudioAttributesCompatParcelizer(calculateNextSearchBytePosition.MediaMetadataCompat.NavigationBarView_itemPaddingTop, 0));
        }
        if (settitle.AudioAttributesImplApi26Parcelizer(calculateNextSearchBytePosition.MediaMetadataCompat.NavigationBarView_itemPaddingBottom)) {
            setItemPaddingBottom(settitle.AudioAttributesCompatParcelizer(calculateNextSearchBytePosition.MediaMetadataCompat.NavigationBarView_itemPaddingBottom, 0));
        }
        if (settitle.AudioAttributesImplApi26Parcelizer(calculateNextSearchBytePosition.MediaMetadataCompat.NavigationBarView_activeIndicatorLabelPadding)) {
            setActiveIndicatorLabelPadding(settitle.AudioAttributesCompatParcelizer(calculateNextSearchBytePosition.MediaMetadataCompat.NavigationBarView_activeIndicatorLabelPadding, 0));
        }
        if (settitle.AudioAttributesImplApi26Parcelizer(calculateNextSearchBytePosition.MediaMetadataCompat.NavigationBarView_elevation)) {
            setElevation(settitle.AudioAttributesCompatParcelizer(calculateNextSearchBytePosition.MediaMetadataCompat.NavigationBarView_elevation, 0));
        }
        findFormatOverrides.AudioAttributesCompatParcelizer(getBackground().mutate(), SeekMap.IconCompatParcelizer(context2, settitle, calculateNextSearchBytePosition.MediaMetadataCompat.NavigationBarView_backgroundTint));
        setLabelVisibilityMode(settitle.RemoteActionCompatParcelizer(calculateNextSearchBytePosition.MediaMetadataCompat.NavigationBarView_labelVisibilityMode, -1));
        int iMediaBrowserCompatItemReceiver = settitle.MediaBrowserCompatItemReceiver(calculateNextSearchBytePosition.MediaMetadataCompat.NavigationBarView_itemBackground, 0);
        if (iMediaBrowserCompatItemReceiver != 0) {
            navigationBarMenuView.setItemBackgroundRes(iMediaBrowserCompatItemReceiver);
        } else {
            setItemRippleColor(SeekMap.IconCompatParcelizer(context2, settitle, calculateNextSearchBytePosition.MediaMetadataCompat.NavigationBarView_itemRippleColor));
        }
        int iMediaBrowserCompatItemReceiver2 = settitle.MediaBrowserCompatItemReceiver(calculateNextSearchBytePosition.MediaMetadataCompat.NavigationBarView_itemActiveIndicatorStyle, 0);
        if (iMediaBrowserCompatItemReceiver2 != 0) {
            setItemActiveIndicatorEnabled(true);
            TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(iMediaBrowserCompatItemReceiver2, calculateNextSearchBytePosition.MediaMetadataCompat.NavigationBarActiveIndicator);
            setItemActiveIndicatorWidth(typedArrayObtainStyledAttributes.getDimensionPixelSize(calculateNextSearchBytePosition.MediaMetadataCompat.NavigationBarActiveIndicator_android_width, 0));
            setItemActiveIndicatorHeight(typedArrayObtainStyledAttributes.getDimensionPixelSize(calculateNextSearchBytePosition.MediaMetadataCompat.NavigationBarActiveIndicator_android_height, 0));
            setItemActiveIndicatorMarginHorizontal(typedArrayObtainStyledAttributes.getDimensionPixelOffset(calculateNextSearchBytePosition.MediaMetadataCompat.NavigationBarActiveIndicator_marginHorizontal, 0));
            setItemActiveIndicatorColor(SeekMap.IconCompatParcelizer(context2, typedArrayObtainStyledAttributes, calculateNextSearchBytePosition.MediaMetadataCompat.NavigationBarActiveIndicator_android_color));
            setItemActiveIndicatorShapeAppearance(isValidFrameType.read(context2, typedArrayObtainStyledAttributes.getResourceId(calculateNextSearchBytePosition.MediaMetadataCompat.NavigationBarActiveIndicator_shapeAppearance, 0), 0).RemoteActionCompatParcelizer());
            typedArrayObtainStyledAttributes.recycle();
        }
        if (settitle.AudioAttributesImplApi26Parcelizer(calculateNextSearchBytePosition.MediaMetadataCompat.NavigationBarView_menu)) {
            write(settitle.MediaBrowserCompatItemReceiver(calculateNextSearchBytePosition.MediaMetadataCompat.NavigationBarView_menu, 0));
        }
        settitle.write();
        addView(navigationBarMenuView);
        copywithvorbiscomments.IconCompatParcelizer(new onRequestPermissionsResult.RemoteActionCompatParcelizer() { // from class: com.google.android.material.navigation.NavigationBarView.3
            @Override // o.onRequestPermissionsResult.RemoteActionCompatParcelizer
            public final void read(onRequestPermissionsResult onrequestpermissionsresult) {
            }

            @Override // o.onRequestPermissionsResult.RemoteActionCompatParcelizer
            public final boolean write(onRequestPermissionsResult onrequestpermissionsresult, MenuItem menuItem) {
                if (NavigationBarView.this.IconCompatParcelizer == null || menuItem.getItemId() != NavigationBarView.this.AudioAttributesImplBaseParcelizer()) {
                    return (NavigationBarView.this.AudioAttributesImplApi26Parcelizer == null || NavigationBarView.this.AudioAttributesImplApi26Parcelizer.IconCompatParcelizer()) ? false : true;
                }
                IconCompatParcelizer unused = NavigationBarView.this.IconCompatParcelizer;
                return true;
            }
        });
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        getConstantBitrateSeekMap.IconCompatParcelizer(this);
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        getConstantBitrateSeekMap.read(this, f);
    }

    public void setOnItemSelectedListener(AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
        this.AudioAttributesImplApi26Parcelizer = audioAttributesCompatParcelizer;
    }

    public void setOnItemReselectedListener(IconCompatParcelizer iconCompatParcelizer) {
        this.IconCompatParcelizer = iconCompatParcelizer;
    }

    public final registerForActivityResult write() {
        return this.RemoteActionCompatParcelizer;
    }

    private void write(int i) {
        this.write.RemoteActionCompatParcelizer(true);
        MediaBrowserCompatCustomActionResultReceiver().inflate(i, this.read);
        this.write.RemoteActionCompatParcelizer(false);
        this.write.AudioAttributesCompatParcelizer(true);
    }

    public void setItemIconTintList(ColorStateList colorStateList) {
        this.RemoteActionCompatParcelizer.setIconTintList(colorStateList);
    }

    public void setItemIconSize(int i) {
        this.RemoteActionCompatParcelizer.setItemIconSize(i);
    }

    public void setItemIconSizeRes(int i) {
        setItemIconSize(getResources().getDimensionPixelSize(i));
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.RemoteActionCompatParcelizer.setItemTextColor(colorStateList);
    }

    public void setItemBackgroundResource(int i) {
        this.RemoteActionCompatParcelizer.setItemBackgroundRes(i);
    }

    public void setItemBackground(Drawable drawable) {
        this.RemoteActionCompatParcelizer.setItemBackground(drawable);
    }

    public void setItemRippleColor(ColorStateList colorStateList) {
        this.RemoteActionCompatParcelizer.setItemRippleColor(colorStateList);
    }

    public final int AudioAttributesCompatParcelizer() {
        return this.RemoteActionCompatParcelizer.AudioAttributesImplBaseParcelizer();
    }

    public void setItemPaddingTop(int i) {
        this.RemoteActionCompatParcelizer.setItemPaddingTop(i);
    }

    public final int IconCompatParcelizer() {
        return this.RemoteActionCompatParcelizer.write();
    }

    public void setItemPaddingBottom(int i) {
        this.RemoteActionCompatParcelizer.setItemPaddingBottom(i);
    }

    public void setActiveIndicatorLabelPadding(int i) {
        this.RemoteActionCompatParcelizer.setActiveIndicatorLabelPadding(i);
    }

    public void setItemActiveIndicatorEnabled(boolean z) {
        this.RemoteActionCompatParcelizer.setItemActiveIndicatorEnabled(z);
    }

    public void setItemActiveIndicatorWidth(int i) {
        this.RemoteActionCompatParcelizer.setItemActiveIndicatorWidth(i);
    }

    public void setItemActiveIndicatorHeight(int i) {
        this.RemoteActionCompatParcelizer.setItemActiveIndicatorHeight(i);
    }

    public void setItemActiveIndicatorMarginHorizontal(int i) {
        this.RemoteActionCompatParcelizer.setItemActiveIndicatorMarginHorizontal(i);
    }

    public void setItemActiveIndicatorShapeAppearance(isValidFrameType isvalidframetype) {
        this.RemoteActionCompatParcelizer.setItemActiveIndicatorShapeAppearance(isvalidframetype);
    }

    public void setItemActiveIndicatorColor(ColorStateList colorStateList) {
        this.RemoteActionCompatParcelizer.setItemActiveIndicatorColor(colorStateList);
    }

    public final int AudioAttributesImplBaseParcelizer() {
        return this.RemoteActionCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver();
    }

    public void setSelectedItemId(int i) {
        MenuItem menuItemFindItem = this.read.findItem(i);
        if (menuItemFindItem == null || this.read.AudioAttributesCompatParcelizer(menuItemFindItem, this.write, 0)) {
            return;
        }
        menuItemFindItem.setChecked(true);
    }

    public void setLabelVisibilityMode(int i) {
        if (this.RemoteActionCompatParcelizer.AudioAttributesImplApi21Parcelizer() != i) {
            this.RemoteActionCompatParcelizer.setLabelVisibilityMode(i);
            this.write.AudioAttributesCompatParcelizer(false);
        }
    }

    public void setItemTextAppearanceInactive(int i) {
        this.RemoteActionCompatParcelizer.setItemTextAppearanceInactive(i);
    }

    public void setItemTextAppearanceActive(int i) {
        this.RemoteActionCompatParcelizer.setItemTextAppearanceActive(i);
    }

    public void setItemTextAppearanceActiveBoldEnabled(boolean z) {
        this.RemoteActionCompatParcelizer.setItemTextAppearanceActiveBoldEnabled(z);
    }

    public void setItemOnTouchListener(int i, View.OnTouchListener onTouchListener) {
        this.RemoteActionCompatParcelizer.setItemOnTouchListener(i, onTouchListener);
    }

    private MenuInflater MediaBrowserCompatCustomActionResultReceiver() {
        if (this.AudioAttributesCompatParcelizer == null) {
            this.AudioAttributesCompatParcelizer = new onMenuItemSelected(getContext());
        }
        return this.AudioAttributesCompatParcelizer;
    }

    public final NavigationBarPresenter read() {
        return this.write;
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.RemoteActionCompatParcelizer = new Bundle();
        this.read.AudioAttributesCompatParcelizer(savedState.RemoteActionCompatParcelizer);
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
        this.read.write(savedState.RemoteActionCompatParcelizer);
    }

    static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: com.google.android.material.navigation.NavigationBarView.SavedState.3
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return AudioAttributesCompatParcelizer(parcel);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public final /* synthetic */ SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return IconCompatParcelizer(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ Object[] newArray(int i) {
                return IconCompatParcelizer(i);
            }

            private static SavedState IconCompatParcelizer(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            private static SavedState AudioAttributesCompatParcelizer(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            private static SavedState[] IconCompatParcelizer(int i) {
                return new SavedState[i];
            }
        };
        Bundle RemoteActionCompatParcelizer;

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            RemoteActionCompatParcelizer(parcel, classLoader == null ? getClass().getClassLoader() : classLoader);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeBundle(this.RemoteActionCompatParcelizer);
        }

        private void RemoteActionCompatParcelizer(Parcel parcel, ClassLoader classLoader) {
            this.RemoteActionCompatParcelizer = parcel.readBundle(classLoader);
        }
    }
}
