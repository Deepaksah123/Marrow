package com.google.android.material.navigation;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.transition.AutoTransition;
import androidx.transition.TransitionSet;
import java.util.HashSet;
import kotlin.BinarySearchSeekerSeekOperationParams;
import kotlin.BinarySearchSeekerTimestampSeeker;
import kotlin.FlacMetadataReader;
import kotlin.InvalidTypeIdException;
import kotlin._init_lambda5;
import kotlin.calculateNextSearchBytePosition;
import kotlin.frameSizeBytesByTypeNb;
import kotlin.getDefaultViewModelCreationExtras;
import kotlin.getSampleRateLookupKey;
import kotlin.hasSuperClassStartingWith;
import kotlin.isValidFrameType;
import kotlin.onRequestPermissionsResult;
import kotlin.onRetainNonConfigurationInstance;
import kotlin.registerForActivityResult;
import kotlin.reportWithProductId;
import kotlin.rewrapCtorProblem;

/* JADX INFO: loaded from: classes5.dex */
public abstract class NavigationBarMenuView extends ViewGroup implements registerForActivityResult {
    private boolean AudioAttributesImplApi21Parcelizer;
    private int AudioAttributesImplApi26Parcelizer;
    private int AudioAttributesImplBaseParcelizer;
    private ColorStateList IconCompatParcelizer;
    private boolean MediaBrowserCompatCustomActionResultReceiver;
    private int MediaBrowserCompatItemReceiver;
    private Drawable MediaBrowserCompatMediaItem;
    private int MediaBrowserCompatSearchResultReceiver;
    private ColorStateList MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    private int MediaDescriptionCompat;
    private isValidFrameType MediaMetadataCompat;
    private int RatingCompat;
    private NavigationBarItemView[] RemoteActionCompatParcelizer;
    private int handleMediaPlayPauseIfPendingOnHandler;
    private int onAddQueueItem;
    private ColorStateList onCommand;
    private final rewrapCtorProblem.IconCompatParcelizer<NavigationBarItemView> onCustomAction;
    private boolean onFastForward;
    private int onMediaButtonEvent;
    private int onPause;
    private final ColorStateList onPlay;
    private ColorStateList onPlayFromMediaId;
    private final SparseArray<View.OnTouchListener> onPlayFromSearch;
    private NavigationBarPresenter onPlayFromUri;
    private int onPrepare;
    private final View.OnClickListener onPrepareFromMediaId;
    private onRequestPermissionsResult onPrepareFromSearch;
    private final TransitionSet onPrepareFromUri;
    private int onRemoveQueueItemAt;
    private int onSeekTo;
    private final SparseArray<BinarySearchSeekerTimestampSeeker> write;
    private static final int[] read = {R.attr.state_checked};
    private static final int[] AudioAttributesCompatParcelizer = {-16842910};

    protected static boolean AudioAttributesCompatParcelizer(int i, int i2) {
        return i == -1 ? i2 > 3 : i == 0;
    }

    private static boolean RemoteActionCompatParcelizer(int i) {
        return i != -1;
    }

    protected abstract NavigationBarItemView read(Context context);

    public NavigationBarMenuView(Context context) {
        super(context);
        this.onCustomAction = new rewrapCtorProblem.read(5);
        this.onPlayFromSearch = new SparseArray<>(5);
        this.onRemoveQueueItemAt = 0;
        this.onSeekTo = 0;
        this.write = new SparseArray<>(5);
        this.onAddQueueItem = -1;
        this.handleMediaPlayPauseIfPendingOnHandler = -1;
        this.AudioAttributesImplApi26Parcelizer = -1;
        this.MediaBrowserCompatCustomActionResultReceiver = false;
        this.onPlay = RemoteActionCompatParcelizer();
        if (isInEditMode()) {
            this.onPrepareFromUri = null;
        } else {
            AutoTransition autoTransition = new AutoTransition();
            this.onPrepareFromUri = autoTransition;
            autoTransition.RemoteActionCompatParcelizer(0);
            autoTransition.RemoteActionCompatParcelizer(getSampleRateLookupKey.write(getContext(), calculateNextSearchBytePosition.IconCompatParcelizer.motionDurationMedium4, getResources().getInteger(calculateNextSearchBytePosition.AudioAttributesImplApi21Parcelizer.material_motion_duration_long_1)));
            autoTransition.write(getSampleRateLookupKey.read(getContext(), calculateNextSearchBytePosition.IconCompatParcelizer.motionEasingStandard, BinarySearchSeekerSeekOperationParams.AudioAttributesCompatParcelizer));
            autoTransition.IconCompatParcelizer(new FlacMetadataReader());
        }
        this.onPrepareFromMediaId = new View.OnClickListener() { // from class: com.google.android.material.navigation.NavigationBarMenuView.4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                onRetainNonConfigurationInstance onretainnonconfigurationinstanceIconCompatParcelizer = ((NavigationBarItemView) view).IconCompatParcelizer();
                if (NavigationBarMenuView.this.onPrepareFromSearch.AudioAttributesCompatParcelizer(onretainnonconfigurationinstanceIconCompatParcelizer, NavigationBarMenuView.this.onPlayFromUri, 0)) {
                    return;
                }
                onretainnonconfigurationinstanceIconCompatParcelizer.setChecked(true);
            }
        };
        InvalidTypeIdException.AudioAttributesImplBaseParcelizer(this, 1);
    }

    @Override // kotlin.registerForActivityResult
    public final void RemoteActionCompatParcelizer(onRequestPermissionsResult onrequestpermissionsresult) {
        this.onPrepareFromSearch = onrequestpermissionsresult;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        hasSuperClassStartingWith.write(accessibilityNodeInfo).RemoteActionCompatParcelizer(hasSuperClassStartingWith.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(1, this.onPrepareFromSearch.MediaDescriptionCompat().size(), false, 1));
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = colorStateList;
        NavigationBarItemView[] navigationBarItemViewArr = this.RemoteActionCompatParcelizer;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setIconTintList(colorStateList);
            }
        }
    }

    public void setItemIconSize(int i) {
        this.RatingCompat = i;
        NavigationBarItemView[] navigationBarItemViewArr = this.RemoteActionCompatParcelizer;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setIconSize(i);
            }
        }
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.onPlayFromMediaId = colorStateList;
        NavigationBarItemView[] navigationBarItemViewArr = this.RemoteActionCompatParcelizer;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setTextColor(colorStateList);
            }
        }
    }

    public void setItemTextAppearanceInactive(int i) {
        this.onPause = i;
        NavigationBarItemView[] navigationBarItemViewArr = this.RemoteActionCompatParcelizer;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setTextAppearanceInactive(i);
                ColorStateList colorStateList = this.onPlayFromMediaId;
                if (colorStateList != null) {
                    navigationBarItemView.setTextColor(colorStateList);
                }
            }
        }
    }

    public void setItemTextAppearanceActive(int i) {
        this.onMediaButtonEvent = i;
        NavigationBarItemView[] navigationBarItemViewArr = this.RemoteActionCompatParcelizer;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setTextAppearanceActive(i);
                ColorStateList colorStateList = this.onPlayFromMediaId;
                if (colorStateList != null) {
                    navigationBarItemView.setTextColor(colorStateList);
                }
            }
        }
    }

    public void setItemTextAppearanceActiveBoldEnabled(boolean z) {
        this.onFastForward = z;
        NavigationBarItemView[] navigationBarItemViewArr = this.RemoteActionCompatParcelizer;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setTextAppearanceActiveBoldEnabled(z);
            }
        }
    }

    public void setItemBackgroundRes(int i) {
        this.MediaDescriptionCompat = i;
        NavigationBarItemView[] navigationBarItemViewArr = this.RemoteActionCompatParcelizer;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setItemBackground(i);
            }
        }
    }

    public final int AudioAttributesImplBaseParcelizer() {
        return this.onAddQueueItem;
    }

    public void setItemPaddingTop(int i) {
        this.onAddQueueItem = i;
        NavigationBarItemView[] navigationBarItemViewArr = this.RemoteActionCompatParcelizer;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setItemPaddingTop(i);
            }
        }
    }

    public final int write() {
        return this.handleMediaPlayPauseIfPendingOnHandler;
    }

    public void setItemPaddingBottom(int i) {
        this.handleMediaPlayPauseIfPendingOnHandler = i;
        NavigationBarItemView[] navigationBarItemViewArr = this.RemoteActionCompatParcelizer;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setItemPaddingBottom(i);
            }
        }
    }

    public void setActiveIndicatorLabelPadding(int i) {
        this.AudioAttributesImplApi26Parcelizer = i;
        NavigationBarItemView[] navigationBarItemViewArr = this.RemoteActionCompatParcelizer;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setActiveIndicatorLabelPadding(i);
            }
        }
    }

    public void setItemActiveIndicatorEnabled(boolean z) {
        this.AudioAttributesImplApi21Parcelizer = z;
        NavigationBarItemView[] navigationBarItemViewArr = this.RemoteActionCompatParcelizer;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setActiveIndicatorEnabled(z);
            }
        }
    }

    public void setItemActiveIndicatorWidth(int i) {
        this.MediaBrowserCompatSearchResultReceiver = i;
        NavigationBarItemView[] navigationBarItemViewArr = this.RemoteActionCompatParcelizer;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setActiveIndicatorWidth(i);
            }
        }
    }

    public void setItemActiveIndicatorHeight(int i) {
        this.MediaBrowserCompatItemReceiver = i;
        NavigationBarItemView[] navigationBarItemViewArr = this.RemoteActionCompatParcelizer;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setActiveIndicatorHeight(i);
            }
        }
    }

    public void setItemActiveIndicatorMarginHorizontal(int i) {
        this.AudioAttributesImplBaseParcelizer = i;
        NavigationBarItemView[] navigationBarItemViewArr = this.RemoteActionCompatParcelizer;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setActiveIndicatorMarginHorizontal(i);
            }
        }
    }

    public void setItemActiveIndicatorShapeAppearance(isValidFrameType isvalidframetype) {
        this.MediaMetadataCompat = isvalidframetype;
        NavigationBarItemView[] navigationBarItemViewArr = this.RemoteActionCompatParcelizer;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setActiveIndicatorDrawable(read());
            }
        }
    }

    protected final void MediaMetadataCompat() {
        this.MediaBrowserCompatCustomActionResultReceiver = true;
        NavigationBarItemView[] navigationBarItemViewArr = this.RemoteActionCompatParcelizer;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setActiveIndicatorResizeable(true);
            }
        }
    }

    public void setItemActiveIndicatorColor(ColorStateList colorStateList) {
        this.IconCompatParcelizer = colorStateList;
        NavigationBarItemView[] navigationBarItemViewArr = this.RemoteActionCompatParcelizer;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setActiveIndicatorDrawable(read());
            }
        }
    }

    private Drawable read() {
        if (this.MediaMetadataCompat == null || this.IconCompatParcelizer == null) {
            return null;
        }
        frameSizeBytesByTypeNb framesizebytesbytypenb = new frameSizeBytesByTypeNb(this.MediaMetadataCompat);
        framesizebytesbytypenb.AudioAttributesImplApi21Parcelizer(this.IconCompatParcelizer);
        return framesizebytesbytypenb;
    }

    public void setItemBackground(Drawable drawable) {
        this.MediaBrowserCompatMediaItem = drawable;
        NavigationBarItemView[] navigationBarItemViewArr = this.RemoteActionCompatParcelizer;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setItemBackground(drawable);
            }
        }
    }

    public void setItemRippleColor(ColorStateList colorStateList) {
        this.onCommand = colorStateList;
        NavigationBarItemView[] navigationBarItemViewArr = this.RemoteActionCompatParcelizer;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setItemRippleColor(colorStateList);
            }
        }
    }

    public void setLabelVisibilityMode(int i) {
        this.onPrepare = i;
    }

    public final int AudioAttributesImplApi21Parcelizer() {
        return this.onPrepare;
    }

    public void setItemOnTouchListener(int i, View.OnTouchListener onTouchListener) {
        if (onTouchListener == null) {
            this.onPlayFromSearch.remove(i);
        } else {
            this.onPlayFromSearch.put(i, onTouchListener);
        }
        NavigationBarItemView[] navigationBarItemViewArr = this.RemoteActionCompatParcelizer;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                if (navigationBarItemView.IconCompatParcelizer().getItemId() == i) {
                    navigationBarItemView.setOnTouchListener(onTouchListener);
                }
            }
        }
    }

    public final ColorStateList RemoteActionCompatParcelizer() {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(R.attr.textColorSecondary, typedValue, true)) {
            return null;
        }
        ColorStateList colorStateListIconCompatParcelizer = getDefaultViewModelCreationExtras.IconCompatParcelizer(getContext(), typedValue.resourceId);
        if (!getContext().getTheme().resolveAttribute(_init_lambda5.read.colorPrimary, typedValue, true)) {
            return null;
        }
        int i = typedValue.data;
        int defaultColor = colorStateListIconCompatParcelizer.getDefaultColor();
        int[] iArr = AudioAttributesCompatParcelizer;
        return new ColorStateList(new int[][]{iArr, read, EMPTY_STATE_SET}, new int[]{colorStateListIconCompatParcelizer.getColorForState(iArr, defaultColor), i, defaultColor});
    }

    public void setPresenter(NavigationBarPresenter navigationBarPresenter) {
        this.onPlayFromUri = navigationBarPresenter;
    }

    public final void IconCompatParcelizer() {
        removeAllViews();
        NavigationBarItemView[] navigationBarItemViewArr = this.RemoteActionCompatParcelizer;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                if (navigationBarItemView != null) {
                    this.onCustomAction.RemoteActionCompatParcelizer(navigationBarItemView);
                    navigationBarItemView.RemoteActionCompatParcelizer();
                }
            }
        }
        if (this.onPrepareFromSearch.size() == 0) {
            this.onRemoveQueueItemAt = 0;
            this.onSeekTo = 0;
            this.RemoteActionCompatParcelizer = null;
            return;
        }
        MediaBrowserCompatSearchResultReceiver();
        this.RemoteActionCompatParcelizer = new NavigationBarItemView[this.onPrepareFromSearch.size()];
        boolean zAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(this.onPrepare, this.onPrepareFromSearch.MediaDescriptionCompat().size());
        for (int i = 0; i < this.onPrepareFromSearch.size(); i++) {
            this.onPlayFromUri.RemoteActionCompatParcelizer(true);
            this.onPrepareFromSearch.getItem(i).setCheckable(true);
            this.onPlayFromUri.RemoteActionCompatParcelizer(false);
            NavigationBarItemView navigationBarItemViewMediaDescriptionCompat = MediaDescriptionCompat();
            this.RemoteActionCompatParcelizer[i] = navigationBarItemViewMediaDescriptionCompat;
            navigationBarItemViewMediaDescriptionCompat.setIconTintList(this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver);
            navigationBarItemViewMediaDescriptionCompat.setIconSize(this.RatingCompat);
            navigationBarItemViewMediaDescriptionCompat.setTextColor(this.onPlay);
            navigationBarItemViewMediaDescriptionCompat.setTextAppearanceInactive(this.onPause);
            navigationBarItemViewMediaDescriptionCompat.setTextAppearanceActive(this.onMediaButtonEvent);
            navigationBarItemViewMediaDescriptionCompat.setTextAppearanceActiveBoldEnabled(this.onFastForward);
            navigationBarItemViewMediaDescriptionCompat.setTextColor(this.onPlayFromMediaId);
            int i2 = this.onAddQueueItem;
            if (i2 != -1) {
                navigationBarItemViewMediaDescriptionCompat.setItemPaddingTop(i2);
            }
            int i3 = this.handleMediaPlayPauseIfPendingOnHandler;
            if (i3 != -1) {
                navigationBarItemViewMediaDescriptionCompat.setItemPaddingBottom(i3);
            }
            int i4 = this.AudioAttributesImplApi26Parcelizer;
            if (i4 != -1) {
                navigationBarItemViewMediaDescriptionCompat.setActiveIndicatorLabelPadding(i4);
            }
            navigationBarItemViewMediaDescriptionCompat.setActiveIndicatorWidth(this.MediaBrowserCompatSearchResultReceiver);
            navigationBarItemViewMediaDescriptionCompat.setActiveIndicatorHeight(this.MediaBrowserCompatItemReceiver);
            navigationBarItemViewMediaDescriptionCompat.setActiveIndicatorMarginHorizontal(this.AudioAttributesImplBaseParcelizer);
            navigationBarItemViewMediaDescriptionCompat.setActiveIndicatorDrawable(read());
            navigationBarItemViewMediaDescriptionCompat.setActiveIndicatorResizeable(this.MediaBrowserCompatCustomActionResultReceiver);
            navigationBarItemViewMediaDescriptionCompat.setActiveIndicatorEnabled(this.AudioAttributesImplApi21Parcelizer);
            Drawable drawable = this.MediaBrowserCompatMediaItem;
            if (drawable != null) {
                navigationBarItemViewMediaDescriptionCompat.setItemBackground(drawable);
            } else {
                navigationBarItemViewMediaDescriptionCompat.setItemBackground(this.MediaDescriptionCompat);
            }
            navigationBarItemViewMediaDescriptionCompat.setItemRippleColor(this.onCommand);
            navigationBarItemViewMediaDescriptionCompat.setShifting(zAudioAttributesCompatParcelizer);
            navigationBarItemViewMediaDescriptionCompat.setLabelVisibilityMode(this.onPrepare);
            onRetainNonConfigurationInstance onretainnonconfigurationinstance = (onRetainNonConfigurationInstance) this.onPrepareFromSearch.getItem(i);
            navigationBarItemViewMediaDescriptionCompat.AudioAttributesCompatParcelizer(onretainnonconfigurationinstance);
            navigationBarItemViewMediaDescriptionCompat.setItemPosition(i);
            int itemId = onretainnonconfigurationinstance.getItemId();
            navigationBarItemViewMediaDescriptionCompat.setOnTouchListener(this.onPlayFromSearch.get(itemId));
            navigationBarItemViewMediaDescriptionCompat.setOnClickListener(this.onPrepareFromMediaId);
            int i5 = this.onRemoveQueueItemAt;
            if (i5 != 0 && itemId == i5) {
                this.onSeekTo = i;
            }
            RemoteActionCompatParcelizer(navigationBarItemViewMediaDescriptionCompat);
            addView(navigationBarItemViewMediaDescriptionCompat);
        }
        int iMin = Math.min(this.onPrepareFromSearch.size() - 1, this.onSeekTo);
        this.onSeekTo = iMin;
        this.onPrepareFromSearch.getItem(iMin).setChecked(true);
    }

    public final void RatingCompat() {
        TransitionSet transitionSet;
        onRequestPermissionsResult onrequestpermissionsresult = this.onPrepareFromSearch;
        if (onrequestpermissionsresult == null || this.RemoteActionCompatParcelizer == null) {
            return;
        }
        int size = onrequestpermissionsresult.size();
        if (size != this.RemoteActionCompatParcelizer.length) {
            IconCompatParcelizer();
            return;
        }
        int i = this.onRemoveQueueItemAt;
        for (int i2 = 0; i2 < size; i2++) {
            MenuItem item = this.onPrepareFromSearch.getItem(i2);
            if (item.isChecked()) {
                this.onRemoveQueueItemAt = item.getItemId();
                this.onSeekTo = i2;
            }
        }
        if (i != this.onRemoveQueueItemAt && (transitionSet = this.onPrepareFromUri) != null) {
            reportWithProductId.RemoteActionCompatParcelizer(this, transitionSet);
        }
        boolean zAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(this.onPrepare, this.onPrepareFromSearch.MediaDescriptionCompat().size());
        for (int i3 = 0; i3 < size; i3++) {
            this.onPlayFromUri.RemoteActionCompatParcelizer(true);
            this.RemoteActionCompatParcelizer[i3].setLabelVisibilityMode(this.onPrepare);
            this.RemoteActionCompatParcelizer[i3].setShifting(zAudioAttributesCompatParcelizer);
            this.RemoteActionCompatParcelizer[i3].AudioAttributesCompatParcelizer((onRetainNonConfigurationInstance) this.onPrepareFromSearch.getItem(i3));
            this.onPlayFromUri.RemoteActionCompatParcelizer(false);
        }
    }

    private NavigationBarItemView MediaDescriptionCompat() {
        NavigationBarItemView navigationBarItemViewRemoteActionCompatParcelizer = this.onCustomAction.RemoteActionCompatParcelizer();
        return navigationBarItemViewRemoteActionCompatParcelizer == null ? read(getContext()) : navigationBarItemViewRemoteActionCompatParcelizer;
    }

    public final int MediaBrowserCompatCustomActionResultReceiver() {
        return this.onRemoveQueueItemAt;
    }

    final void write(int i) {
        int size = this.onPrepareFromSearch.size();
        for (int i2 = 0; i2 < size; i2++) {
            MenuItem item = this.onPrepareFromSearch.getItem(i2);
            if (i == item.getItemId()) {
                this.onRemoveQueueItemAt = i;
                this.onSeekTo = i2;
                item.setChecked(true);
                return;
            }
        }
    }

    final SparseArray<BinarySearchSeekerTimestampSeeker> AudioAttributesCompatParcelizer() {
        return this.write;
    }

    final void IconCompatParcelizer(SparseArray<BinarySearchSeekerTimestampSeeker> sparseArray) {
        for (int i = 0; i < sparseArray.size(); i++) {
            int iKeyAt = sparseArray.keyAt(i);
            if (this.write.indexOfKey(iKeyAt) < 0) {
                this.write.append(iKeyAt, sparseArray.get(iKeyAt));
            }
        }
        NavigationBarItemView[] navigationBarItemViewArr = this.RemoteActionCompatParcelizer;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                BinarySearchSeekerTimestampSeeker binarySearchSeekerTimestampSeeker = this.write.get(navigationBarItemView.getId());
                if (binarySearchSeekerTimestampSeeker != null) {
                    navigationBarItemView.IconCompatParcelizer(binarySearchSeekerTimestampSeeker);
                }
            }
        }
    }

    private void RemoteActionCompatParcelizer(NavigationBarItemView navigationBarItemView) {
        BinarySearchSeekerTimestampSeeker binarySearchSeekerTimestampSeeker;
        int id = navigationBarItemView.getId();
        if (!RemoteActionCompatParcelizer(id) || (binarySearchSeekerTimestampSeeker = this.write.get(id)) == null) {
            return;
        }
        navigationBarItemView.IconCompatParcelizer(binarySearchSeekerTimestampSeeker);
    }

    private void MediaBrowserCompatSearchResultReceiver() {
        HashSet hashSet = new HashSet();
        for (int i = 0; i < this.onPrepareFromSearch.size(); i++) {
            hashSet.add(Integer.valueOf(this.onPrepareFromSearch.getItem(i).getItemId()));
        }
        for (int i2 = 0; i2 < this.write.size(); i2++) {
            int iKeyAt = this.write.keyAt(i2);
            if (!hashSet.contains(Integer.valueOf(iKeyAt))) {
                this.write.delete(iKeyAt);
            }
        }
    }

    protected final int MediaBrowserCompatItemReceiver() {
        return this.onSeekTo;
    }

    protected final onRequestPermissionsResult AudioAttributesImplApi26Parcelizer() {
        return this.onPrepareFromSearch;
    }
}
