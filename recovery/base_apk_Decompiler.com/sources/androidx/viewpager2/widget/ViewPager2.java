package androidx.viewpager2.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.InvalidTypeIdException;
import kotlin.UByteSerializer;
import kotlin.getApplicationLogo;
import kotlin.getInstalledApplications;
import kotlin.getInstallerPackageName;
import kotlin.getLaunchIntentForPackage;
import kotlin.getNameForUid;
import kotlin.getPackageInfo;
import kotlin.hasSuperClassStartingWith;
import kotlin.modifyFieldName;

/* JADX INFO: loaded from: classes2.dex */
public final class ViewPager2 extends ViewGroup {
    LinearLayoutManager AudioAttributesCompatParcelizer;
    private getInstalledApplications AudioAttributesImplApi21Parcelizer;
    private RecyclerView.read AudioAttributesImplApi26Parcelizer;
    private int AudioAttributesImplBaseParcelizer;
    boolean IconCompatParcelizer;
    private getPackageInfo MediaBrowserCompatCustomActionResultReceiver;
    getLaunchIntentForPackage MediaBrowserCompatItemReceiver;
    private int MediaBrowserCompatMediaItem;
    private getInstalledApplications MediaBrowserCompatSearchResultReceiver;
    private final Rect MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    private UByteSerializer MediaDescriptionCompat;
    private getNameForUid MediaMetadataCompat;
    private Parcelable RatingCompat;
    RemoteActionCompatParcelizer RemoteActionCompatParcelizer;
    private final Rect handleMediaPlayPauseIfPendingOnHandler;
    private RecyclerView.AudioAttributesImplApi26Parcelizer onAddQueueItem;
    private boolean onCommand;
    private boolean onCustomAction;
    int read;
    public RecyclerView write;

    public interface AudioAttributesCompatParcelizer {
    }

    public static abstract class write {
        public void AudioAttributesCompatParcelizer(int i) {
        }

        public void AudioAttributesCompatParcelizer(int i, float f, int i2) {
        }

        public void RemoteActionCompatParcelizer(int i) {
        }
    }

    public ViewPager2(Context context) {
        super(context);
        this.handleMediaPlayPauseIfPendingOnHandler = new Rect();
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = new Rect();
        this.AudioAttributesImplApi21Parcelizer = new getInstalledApplications();
        this.IconCompatParcelizer = false;
        this.AudioAttributesImplApi26Parcelizer = new IconCompatParcelizer() { // from class: androidx.viewpager2.widget.ViewPager2.2
            @Override // androidx.recyclerview.widget.RecyclerView.read
            public final void read() {
                ViewPager2.this.IconCompatParcelizer = true;
                ViewPager2.this.MediaBrowserCompatItemReceiver.IconCompatParcelizer();
            }
        };
        this.MediaBrowserCompatMediaItem = -1;
        this.onAddQueueItem = null;
        this.onCommand = false;
        this.onCustomAction = true;
        this.AudioAttributesImplBaseParcelizer = -1;
        read(context, null);
    }

    public ViewPager2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.handleMediaPlayPauseIfPendingOnHandler = new Rect();
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = new Rect();
        this.AudioAttributesImplApi21Parcelizer = new getInstalledApplications();
        this.IconCompatParcelizer = false;
        this.AudioAttributesImplApi26Parcelizer = new IconCompatParcelizer() { // from class: androidx.viewpager2.widget.ViewPager2.2
            @Override // androidx.recyclerview.widget.RecyclerView.read
            public final void read() {
                ViewPager2.this.IconCompatParcelizer = true;
                ViewPager2.this.MediaBrowserCompatItemReceiver.IconCompatParcelizer();
            }
        };
        this.MediaBrowserCompatMediaItem = -1;
        this.onAddQueueItem = null;
        this.onCommand = false;
        this.onCustomAction = true;
        this.AudioAttributesImplBaseParcelizer = -1;
        read(context, attributeSet);
    }

    public ViewPager2(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.handleMediaPlayPauseIfPendingOnHandler = new Rect();
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = new Rect();
        this.AudioAttributesImplApi21Parcelizer = new getInstalledApplications();
        this.IconCompatParcelizer = false;
        this.AudioAttributesImplApi26Parcelizer = new IconCompatParcelizer() { // from class: androidx.viewpager2.widget.ViewPager2.2
            @Override // androidx.recyclerview.widget.RecyclerView.read
            public final void read() {
                ViewPager2.this.IconCompatParcelizer = true;
                ViewPager2.this.MediaBrowserCompatItemReceiver.IconCompatParcelizer();
            }
        };
        this.MediaBrowserCompatMediaItem = -1;
        this.onAddQueueItem = null;
        this.onCommand = false;
        this.onCustomAction = true;
        this.AudioAttributesImplBaseParcelizer = -1;
        read(context, attributeSet);
    }

    private void read(Context context, AttributeSet attributeSet) {
        this.RemoteActionCompatParcelizer = new read();
        AudioAttributesImplApi26Parcelizer audioAttributesImplApi26Parcelizer = new AudioAttributesImplApi26Parcelizer(context);
        this.write = audioAttributesImplApi26Parcelizer;
        audioAttributesImplApi26Parcelizer.setId(InvalidTypeIdException.read());
        this.write.setDescendantFocusability(131072);
        LinearLayoutManagerImpl linearLayoutManagerImpl = new LinearLayoutManagerImpl(context);
        this.AudioAttributesCompatParcelizer = linearLayoutManagerImpl;
        this.write.setLayoutManager(linearLayoutManagerImpl);
        this.write.setScrollingTouchSlop(1);
        AudioAttributesCompatParcelizer(context, attributeSet);
        this.write.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.write.read(MediaDescriptionCompat());
        getLaunchIntentForPackage getlaunchintentforpackage = new getLaunchIntentForPackage(this);
        this.MediaBrowserCompatItemReceiver = getlaunchintentforpackage;
        this.MediaBrowserCompatCustomActionResultReceiver = new getPackageInfo(this, getlaunchintentforpackage, this.write);
        MediaBrowserCompatCustomActionResultReceiver mediaBrowserCompatCustomActionResultReceiver = new MediaBrowserCompatCustomActionResultReceiver();
        this.MediaDescriptionCompat = mediaBrowserCompatCustomActionResultReceiver;
        mediaBrowserCompatCustomActionResultReceiver.read(this.write);
        this.write.RemoteActionCompatParcelizer(this.MediaBrowserCompatItemReceiver);
        getInstalledApplications getinstalledapplications = new getInstalledApplications();
        this.MediaBrowserCompatSearchResultReceiver = getinstalledapplications;
        this.MediaBrowserCompatItemReceiver.RemoteActionCompatParcelizer(getinstalledapplications);
        write writeVar = new write() { // from class: androidx.viewpager2.widget.ViewPager2.5
            @Override // androidx.viewpager2.widget.ViewPager2.write
            public final void RemoteActionCompatParcelizer(int i) {
                if (ViewPager2.this.read != i) {
                    ViewPager2.this.read = i;
                    ViewPager2.this.RemoteActionCompatParcelizer.IconCompatParcelizer();
                }
            }

            @Override // androidx.viewpager2.widget.ViewPager2.write
            public final void AudioAttributesCompatParcelizer(int i) {
                if (i == 0) {
                    ViewPager2.this.AudioAttributesImplBaseParcelizer();
                }
            }
        };
        write writeVar2 = new write() { // from class: androidx.viewpager2.widget.ViewPager2.3
            @Override // androidx.viewpager2.widget.ViewPager2.write
            public final void RemoteActionCompatParcelizer(int i) {
                ViewPager2.this.clearFocus();
                if (ViewPager2.this.hasFocus()) {
                    ViewPager2.this.write.requestFocus(2);
                }
            }
        };
        this.MediaBrowserCompatSearchResultReceiver.RemoteActionCompatParcelizer(writeVar);
        this.MediaBrowserCompatSearchResultReceiver.RemoteActionCompatParcelizer(writeVar2);
        this.RemoteActionCompatParcelizer.IconCompatParcelizer(this.write);
        this.MediaBrowserCompatSearchResultReceiver.RemoteActionCompatParcelizer(this.AudioAttributesImplApi21Parcelizer);
        getNameForUid getnameforuid = new getNameForUid(this.AudioAttributesCompatParcelizer);
        this.MediaMetadataCompat = getnameforuid;
        this.MediaBrowserCompatSearchResultReceiver.RemoteActionCompatParcelizer(getnameforuid);
        RecyclerView recyclerView = this.write;
        attachViewToParent(recyclerView, 0, recyclerView.getLayoutParams());
    }

    private RecyclerView.AudioAttributesImplApi21Parcelizer MediaDescriptionCompat() {
        return new RecyclerView.AudioAttributesImplApi21Parcelizer() { // from class: androidx.viewpager2.widget.ViewPager2.1
            @Override // androidx.recyclerview.widget.RecyclerView.AudioAttributesImplApi21Parcelizer
            public final void read(View view) {
            }

            @Override // androidx.recyclerview.widget.RecyclerView.AudioAttributesImplApi21Parcelizer
            public final void RemoteActionCompatParcelizer(View view) {
                RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
                if (((ViewGroup.LayoutParams) layoutParams).width != -1 || ((ViewGroup.LayoutParams) layoutParams).height != -1) {
                    throw new IllegalStateException("Pages must fill the whole ViewPager2 (use match_parent)");
                }
            }
        };
    }

    @Override // android.view.ViewGroup, android.view.View
    public final CharSequence getAccessibilityClassName() {
        if (this.RemoteActionCompatParcelizer.write()) {
            return this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer();
        }
        return super.getAccessibilityClassName();
    }

    private void AudioAttributesCompatParcelizer(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, getApplicationLogo.read.ViewPager2);
        InvalidTypeIdException.IconCompatParcelizer(this, context, getApplicationLogo.read.ViewPager2, attributeSet, typedArrayObtainStyledAttributes, 0, 0);
        try {
            setOrientation(typedArrayObtainStyledAttributes.getInt(getApplicationLogo.read.ViewPager2_android_orientation, 0));
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // android.view.View
    protected final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.RemoteActionCompatParcelizer = this.write.getId();
        int i = this.MediaBrowserCompatMediaItem;
        if (i == -1) {
            i = this.read;
        }
        savedState.IconCompatParcelizer = i;
        Parcelable parcelable = this.RatingCompat;
        if (parcelable != null) {
            savedState.AudioAttributesCompatParcelizer = parcelable;
            return savedState;
        }
        Object objIconCompatParcelizer = this.write.IconCompatParcelizer();
        if (objIconCompatParcelizer instanceof getInstallerPackageName) {
            savedState.AudioAttributesCompatParcelizer = ((getInstallerPackageName) objIconCompatParcelizer).RemoteActionCompatParcelizer();
        }
        return savedState;
    }

    @Override // android.view.View
    protected final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.MediaBrowserCompatMediaItem = savedState.IconCompatParcelizer;
        this.RatingCompat = savedState.AudioAttributesCompatParcelizer;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void MediaMetadataCompat() {
        RecyclerView.IconCompatParcelizer iconCompatParcelizerRemoteActionCompatParcelizer;
        if (this.MediaBrowserCompatMediaItem == -1 || (iconCompatParcelizerRemoteActionCompatParcelizer = RemoteActionCompatParcelizer()) == 0) {
            return;
        }
        Parcelable parcelable = this.RatingCompat;
        if (parcelable != null) {
            if (iconCompatParcelizerRemoteActionCompatParcelizer instanceof getInstallerPackageName) {
                ((getInstallerPackageName) iconCompatParcelizerRemoteActionCompatParcelizer).AudioAttributesCompatParcelizer(parcelable);
            }
            this.RatingCompat = null;
        }
        int iMax = Math.max(0, Math.min(this.MediaBrowserCompatMediaItem, iconCompatParcelizerRemoteActionCompatParcelizer.getItemCount() - 1));
        this.read = iMax;
        this.MediaBrowserCompatMediaItem = -1;
        this.write.AudioAttributesImplApi21Parcelizer(iMax);
        this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        Parcelable parcelable = sparseArray.get(getId());
        if (parcelable instanceof SavedState) {
            int i = ((SavedState) parcelable).RemoteActionCompatParcelizer;
            sparseArray.put(this.write.getId(), sparseArray.get(i));
            sparseArray.remove(i);
        }
        super.dispatchRestoreInstanceState(sparseArray);
        MediaMetadataCompat();
    }

    static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: androidx.viewpager2.widget.ViewPager2.SavedState.5
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return write(parcel);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public final /* synthetic */ SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return RemoteActionCompatParcelizer(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ Object[] newArray(int i) {
                return RemoteActionCompatParcelizer(i);
            }

            private static SavedState RemoteActionCompatParcelizer(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            private static SavedState write(Parcel parcel) {
                return RemoteActionCompatParcelizer(parcel, null);
            }

            private static SavedState[] RemoteActionCompatParcelizer(int i) {
                return new SavedState[i];
            }
        };
        Parcelable AudioAttributesCompatParcelizer;
        int IconCompatParcelizer;
        int RemoteActionCompatParcelizer;

        SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            read(parcel, classLoader);
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        private void read(Parcel parcel, ClassLoader classLoader) {
            this.RemoteActionCompatParcelizer = parcel.readInt();
            this.IconCompatParcelizer = parcel.readInt();
            this.AudioAttributesCompatParcelizer = parcel.readParcelable(classLoader);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.RemoteActionCompatParcelizer);
            parcel.writeInt(this.IconCompatParcelizer);
            parcel.writeParcelable(this.AudioAttributesCompatParcelizer, i);
        }
    }

    public final void setAdapter(RecyclerView.IconCompatParcelizer iconCompatParcelizer) {
        RecyclerView.IconCompatParcelizer IconCompatParcelizer2 = this.write.IconCompatParcelizer();
        this.RemoteActionCompatParcelizer.IconCompatParcelizer((RecyclerView.IconCompatParcelizer<?>) IconCompatParcelizer2);
        write((RecyclerView.IconCompatParcelizer<?>) IconCompatParcelizer2);
        this.write.setAdapter(iconCompatParcelizer);
        this.read = 0;
        MediaMetadataCompat();
        this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer((RecyclerView.IconCompatParcelizer<?>) iconCompatParcelizer);
        IconCompatParcelizer(iconCompatParcelizer);
    }

    private void IconCompatParcelizer(RecyclerView.IconCompatParcelizer<?> iconCompatParcelizer) {
        if (iconCompatParcelizer != null) {
            iconCompatParcelizer.registerAdapterDataObserver(this.AudioAttributesImplApi26Parcelizer);
        }
    }

    private void write(RecyclerView.IconCompatParcelizer<?> iconCompatParcelizer) {
        if (iconCompatParcelizer != null) {
            iconCompatParcelizer.unregisterAdapterDataObserver(this.AudioAttributesImplApi26Parcelizer);
        }
    }

    public final RecyclerView.IconCompatParcelizer RemoteActionCompatParcelizer() {
        return this.write.IconCompatParcelizer();
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" does not support direct child views");
        throw new IllegalStateException(sb.toString());
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        measureChild(this.write, i, i2);
        int measuredWidth = this.write.getMeasuredWidth();
        int measuredHeight = this.write.getMeasuredHeight();
        int measuredState = this.write.getMeasuredState();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        setMeasuredDimension(resolveSizeAndState(Math.max(measuredWidth + paddingLeft + paddingRight, getSuggestedMinimumWidth()), i, measuredState), resolveSizeAndState(Math.max(measuredHeight + paddingTop + paddingBottom, getSuggestedMinimumHeight()), i2, measuredState << 16));
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth = this.write.getMeasuredWidth();
        int measuredHeight = this.write.getMeasuredHeight();
        this.handleMediaPlayPauseIfPendingOnHandler.left = getPaddingLeft();
        this.handleMediaPlayPauseIfPendingOnHandler.right = (i3 - i) - getPaddingRight();
        this.handleMediaPlayPauseIfPendingOnHandler.top = getPaddingTop();
        this.handleMediaPlayPauseIfPendingOnHandler.bottom = (i4 - i2) - getPaddingBottom();
        Gravity.apply(8388659, measuredWidth, measuredHeight, this.handleMediaPlayPauseIfPendingOnHandler, this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver);
        this.write.layout(this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.left, this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.top, this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.right, this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.bottom);
        if (this.IconCompatParcelizer) {
            AudioAttributesImplBaseParcelizer();
        }
    }

    final void AudioAttributesImplBaseParcelizer() {
        UByteSerializer uByteSerializer = this.MediaDescriptionCompat;
        if (uByteSerializer == null) {
            throw new IllegalStateException("Design assumption violated.");
        }
        View viewAudioAttributesCompatParcelizer = uByteSerializer.AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer);
        if (viewAudioAttributesCompatParcelizer == null) {
            return;
        }
        int iMediaDescriptionCompat = LinearLayoutManager.MediaDescriptionCompat(viewAudioAttributesCompatParcelizer);
        if (iMediaDescriptionCompat != this.read && AudioAttributesImplApi21Parcelizer() == 0) {
            this.MediaBrowserCompatSearchResultReceiver.RemoteActionCompatParcelizer(iMediaDescriptionCompat);
        }
        this.IconCompatParcelizer = false;
    }

    final int AudioAttributesCompatParcelizer() {
        int height;
        int paddingBottom;
        RecyclerView recyclerView = this.write;
        if (IconCompatParcelizer() == 0) {
            height = recyclerView.getWidth() - recyclerView.getPaddingLeft();
            paddingBottom = recyclerView.getPaddingRight();
        } else {
            height = recyclerView.getHeight() - recyclerView.getPaddingTop();
            paddingBottom = recyclerView.getPaddingBottom();
        }
        return height - paddingBottom;
    }

    public final void setOrientation(int i) {
        this.AudioAttributesCompatParcelizer.AudioAttributesImplApi21Parcelizer(i);
        this.RemoteActionCompatParcelizer.AudioAttributesImplApi21Parcelizer();
    }

    public final int IconCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer.MediaBrowserCompatSearchResultReceiver() == 1 ? 1 : 0;
    }

    public final boolean AudioAttributesImplApi26Parcelizer() {
        return this.AudioAttributesCompatParcelizer.onPlayFromSearch() == 1;
    }

    public final void setCurrentItem(int i) {
        setCurrentItem(i, true);
    }

    public final void setCurrentItem(int i, boolean z) {
        if (MediaBrowserCompatCustomActionResultReceiver()) {
            throw new IllegalStateException("Cannot change current item when ViewPager2 is fake dragging");
        }
        AudioAttributesCompatParcelizer(i, z);
    }

    final void AudioAttributesCompatParcelizer(int i, boolean z) {
        RecyclerView.IconCompatParcelizer iconCompatParcelizerRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
        if (iconCompatParcelizerRemoteActionCompatParcelizer == null) {
            if (this.MediaBrowserCompatMediaItem != -1) {
                this.MediaBrowserCompatMediaItem = Math.max(i, 0);
                return;
            }
            return;
        }
        if (iconCompatParcelizerRemoteActionCompatParcelizer.getItemCount() > 0) {
            int iMin = Math.min(Math.max(i, 0), iconCompatParcelizerRemoteActionCompatParcelizer.getItemCount() - 1);
            if (iMin == this.read && this.MediaBrowserCompatItemReceiver.read()) {
                return;
            }
            int i2 = this.read;
            if (iMin == i2 && z) {
                return;
            }
            double dAudioAttributesCompatParcelizer = i2;
            this.read = iMin;
            this.RemoteActionCompatParcelizer.IconCompatParcelizer();
            if (!this.MediaBrowserCompatItemReceiver.read()) {
                dAudioAttributesCompatParcelizer = this.MediaBrowserCompatItemReceiver.AudioAttributesCompatParcelizer();
            }
            this.MediaBrowserCompatItemReceiver.write(iMin, z);
            if (!z) {
                this.write.AudioAttributesImplApi21Parcelizer(iMin);
                return;
            }
            double d = iMin;
            if (Math.abs(d - dAudioAttributesCompatParcelizer) > 3.0d) {
                this.write.AudioAttributesImplApi21Parcelizer(d > dAudioAttributesCompatParcelizer ? iMin - 3 : iMin + 3);
                RecyclerView recyclerView = this.write;
                recyclerView.post(new AudioAttributesImplApi21Parcelizer(iMin, recyclerView));
                return;
            }
            this.write.AudioAttributesImplBaseParcelizer(iMin);
        }
    }

    public final int read() {
        return this.read;
    }

    public final int AudioAttributesImplApi21Parcelizer() {
        return this.MediaBrowserCompatItemReceiver.RemoteActionCompatParcelizer();
    }

    public final boolean MediaBrowserCompatCustomActionResultReceiver() {
        return this.MediaBrowserCompatCustomActionResultReceiver.write();
    }

    public final void setUserInputEnabled(boolean z) {
        this.onCustomAction = z;
        this.RemoteActionCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver();
    }

    public final boolean MediaBrowserCompatItemReceiver() {
        return this.onCustomAction;
    }

    public final void setOffscreenPageLimit(int i) {
        if (i <= 0 && i != -1) {
            throw new IllegalArgumentException("Offscreen page limit must be OFFSCREEN_PAGE_LIMIT_DEFAULT or a number > 0");
        }
        this.AudioAttributesImplBaseParcelizer = i;
        this.write.requestLayout();
    }

    public final int write() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i) {
        return this.write.canScrollHorizontally(i);
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i) {
        return this.write.canScrollVertically(i);
    }

    public final void AudioAttributesCompatParcelizer(write writeVar) {
        this.AudioAttributesImplApi21Parcelizer.RemoteActionCompatParcelizer(writeVar);
    }

    public final void write(write writeVar) {
        this.AudioAttributesImplApi21Parcelizer.write(writeVar);
    }

    public final void setPageTransformer(AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
        if (audioAttributesCompatParcelizer != null) {
            if (!this.onCommand) {
                this.onAddQueueItem = this.write.RemoteActionCompatParcelizer();
                this.onCommand = true;
            }
            this.write.setItemAnimator(null);
        } else if (this.onCommand) {
            this.write.setItemAnimator(this.onAddQueueItem);
            this.onAddQueueItem = null;
            this.onCommand = false;
        }
        if (audioAttributesCompatParcelizer == this.MediaMetadataCompat.write()) {
            return;
        }
        this.MediaMetadataCompat.read(audioAttributesCompatParcelizer);
        RatingCompat();
    }

    private void RatingCompat() {
        if (this.MediaMetadataCompat.write() == null) {
            return;
        }
        double dAudioAttributesCompatParcelizer = this.MediaBrowserCompatItemReceiver.AudioAttributesCompatParcelizer();
        int i = (int) dAudioAttributesCompatParcelizer;
        float f = (float) (dAudioAttributesCompatParcelizer - ((double) i));
        this.MediaMetadataCompat.AudioAttributesCompatParcelizer(i, f, Math.round(AudioAttributesCompatParcelizer() * f));
    }

    @Override // android.view.View
    public final void setLayoutDirection(int i) {
        super.setLayoutDirection(i);
        this.RemoteActionCompatParcelizer.read();
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.RemoteActionCompatParcelizer.IconCompatParcelizer(accessibilityNodeInfo);
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i, Bundle bundle) {
        if (this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(i)) {
            return this.RemoteActionCompatParcelizer.read(i);
        }
        return super.performAccessibilityAction(i, bundle);
    }

    class AudioAttributesImplApi26Parcelizer extends RecyclerView {
        AudioAttributesImplApi26Parcelizer(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
        public final CharSequence getAccessibilityClassName() {
            RemoteActionCompatParcelizer remoteActionCompatParcelizer = ViewPager2.this.RemoteActionCompatParcelizer;
            return super.getAccessibilityClassName();
        }

        @Override // android.view.View
        public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setFromIndex(ViewPager2.this.read);
            accessibilityEvent.setToIndex(ViewPager2.this.read);
            ViewPager2.this.RemoteActionCompatParcelizer.read(accessibilityEvent);
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
        public final boolean onTouchEvent(MotionEvent motionEvent) {
            return ViewPager2.this.MediaBrowserCompatItemReceiver() && super.onTouchEvent(motionEvent);
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
        public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            return ViewPager2.this.MediaBrowserCompatItemReceiver() && super.onInterceptTouchEvent(motionEvent);
        }
    }

    class LinearLayoutManagerImpl extends LinearLayoutManager {
        @Override // androidx.recyclerview.widget.RecyclerView.MediaBrowserCompatItemReceiver
        public final boolean IconCompatParcelizer(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
            return false;
        }

        LinearLayoutManagerImpl(Context context) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.MediaBrowserCompatItemReceiver
        public final boolean write(RecyclerView.MediaDescriptionCompat mediaDescriptionCompat, RecyclerView.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, int i, Bundle bundle) {
            RemoteActionCompatParcelizer remoteActionCompatParcelizer = ViewPager2.this.RemoteActionCompatParcelizer;
            return super.write(mediaDescriptionCompat, mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, i, bundle);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.MediaBrowserCompatItemReceiver
        public final void IconCompatParcelizer(RecyclerView.MediaDescriptionCompat mediaDescriptionCompat, RecyclerView.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, hasSuperClassStartingWith hassuperclassstartingwith) {
            super.IconCompatParcelizer(mediaDescriptionCompat, mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, hassuperclassstartingwith);
            RemoteActionCompatParcelizer remoteActionCompatParcelizer = ViewPager2.this.RemoteActionCompatParcelizer;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.MediaBrowserCompatItemReceiver
        public final void IconCompatParcelizer(RecyclerView.MediaDescriptionCompat mediaDescriptionCompat, RecyclerView.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, View view, hasSuperClassStartingWith hassuperclassstartingwith) {
            ViewPager2.this.RemoteActionCompatParcelizer.write(view, hassuperclassstartingwith);
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager
        public final void RemoteActionCompatParcelizer(RecyclerView.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, int[] iArr) {
            int iWrite = ViewPager2.this.write();
            if (iWrite == -1) {
                super.RemoteActionCompatParcelizer(mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, iArr);
                return;
            }
            int iAudioAttributesCompatParcelizer = ViewPager2.this.AudioAttributesCompatParcelizer() * iWrite;
            iArr[0] = iAudioAttributesCompatParcelizer;
            iArr[1] = iAudioAttributesCompatParcelizer;
        }
    }

    class MediaBrowserCompatCustomActionResultReceiver extends UByteSerializer {
        MediaBrowserCompatCustomActionResultReceiver() {
        }

        @Override // kotlin.UByteSerializer, kotlin.serializeOzbTUA
        public final View AudioAttributesCompatParcelizer(RecyclerView.MediaBrowserCompatItemReceiver mediaBrowserCompatItemReceiver) {
            if (ViewPager2.this.MediaBrowserCompatCustomActionResultReceiver()) {
                return null;
            }
            return super.AudioAttributesCompatParcelizer(mediaBrowserCompatItemReceiver);
        }
    }

    static class AudioAttributesImplApi21Parcelizer implements Runnable {
        private final int RemoteActionCompatParcelizer;
        private final RecyclerView read;

        AudioAttributesImplApi21Parcelizer(int i, RecyclerView recyclerView) {
            this.RemoteActionCompatParcelizer = i;
            this.read = recyclerView;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.read.AudioAttributesImplBaseParcelizer(this.RemoteActionCompatParcelizer);
        }
    }

    abstract class RemoteActionCompatParcelizer {
        void AudioAttributesCompatParcelizer() {
        }

        void AudioAttributesImplApi21Parcelizer() {
        }

        void IconCompatParcelizer() {
        }

        void IconCompatParcelizer(AccessibilityNodeInfo accessibilityNodeInfo) {
        }

        void IconCompatParcelizer(RecyclerView.IconCompatParcelizer<?> iconCompatParcelizer) {
        }

        void IconCompatParcelizer(RecyclerView recyclerView) {
        }

        void MediaBrowserCompatCustomActionResultReceiver() {
        }

        void RemoteActionCompatParcelizer(RecyclerView.IconCompatParcelizer<?> iconCompatParcelizer) {
        }

        boolean RemoteActionCompatParcelizer(int i) {
            return false;
        }

        void read() {
        }

        void read(AccessibilityEvent accessibilityEvent) {
        }

        void write(View view, hasSuperClassStartingWith hassuperclassstartingwith) {
        }

        boolean write() {
            return false;
        }

        private RemoteActionCompatParcelizer() {
        }

        /* synthetic */ RemoteActionCompatParcelizer(ViewPager2 viewPager2, byte b) {
            this();
        }

        String RemoteActionCompatParcelizer() {
            throw new IllegalStateException("Not implemented.");
        }

        boolean read(int i) {
            throw new IllegalStateException("Not implemented.");
        }
    }

    class read extends RemoteActionCompatParcelizer {
        private final modifyFieldName RemoteActionCompatParcelizer;
        private RecyclerView.read read;
        private final modifyFieldName write;

        @Override // androidx.viewpager2.widget.ViewPager2.RemoteActionCompatParcelizer
        public final boolean RemoteActionCompatParcelizer(int i) {
            return i == 8192 || i == 4096;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.RemoteActionCompatParcelizer
        public final boolean write() {
            return true;
        }

        read() {
            super(ViewPager2.this, (byte) 0);
            this.write = new modifyFieldName() { // from class: androidx.viewpager2.widget.ViewPager2.read.5
                @Override // kotlin.modifyFieldName
                public final boolean read(View view) {
                    read.this.AudioAttributesCompatParcelizer(((ViewPager2) view).read() + 1);
                    return true;
                }
            };
            this.RemoteActionCompatParcelizer = new modifyFieldName() { // from class: androidx.viewpager2.widget.ViewPager2.read.4
                @Override // kotlin.modifyFieldName
                public final boolean read(View view) {
                    read.this.AudioAttributesCompatParcelizer(((ViewPager2) view).read() - 1);
                    return true;
                }
            };
        }

        @Override // androidx.viewpager2.widget.ViewPager2.RemoteActionCompatParcelizer
        public final void IconCompatParcelizer(RecyclerView recyclerView) {
            InvalidTypeIdException.AudioAttributesImplBaseParcelizer(recyclerView, 2);
            this.read = new IconCompatParcelizer() { // from class: androidx.viewpager2.widget.ViewPager2.read.1
                @Override // androidx.recyclerview.widget.RecyclerView.read
                public final void read() {
                    read.this.AudioAttributesImplApi26Parcelizer();
                }
            };
            if (InvalidTypeIdException.MediaBrowserCompatItemReceiver(ViewPager2.this) == 0) {
                InvalidTypeIdException.AudioAttributesImplBaseParcelizer(ViewPager2.this, 1);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.RemoteActionCompatParcelizer
        public final String RemoteActionCompatParcelizer() {
            if (!write()) {
                throw new IllegalStateException();
            }
            return "androidx.viewpager.widget.ViewPager";
        }

        @Override // androidx.viewpager2.widget.ViewPager2.RemoteActionCompatParcelizer
        public final void AudioAttributesCompatParcelizer() {
            AudioAttributesImplApi26Parcelizer();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.RemoteActionCompatParcelizer
        public final void RemoteActionCompatParcelizer(RecyclerView.IconCompatParcelizer<?> iconCompatParcelizer) {
            AudioAttributesImplApi26Parcelizer();
            if (iconCompatParcelizer != null) {
                iconCompatParcelizer.registerAdapterDataObserver(this.read);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.RemoteActionCompatParcelizer
        public final void IconCompatParcelizer(RecyclerView.IconCompatParcelizer<?> iconCompatParcelizer) {
            if (iconCompatParcelizer != null) {
                iconCompatParcelizer.unregisterAdapterDataObserver(this.read);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.RemoteActionCompatParcelizer
        public final void AudioAttributesImplApi21Parcelizer() {
            AudioAttributesImplApi26Parcelizer();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.RemoteActionCompatParcelizer
        public final void IconCompatParcelizer() {
            AudioAttributesImplApi26Parcelizer();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.RemoteActionCompatParcelizer
        public final void MediaBrowserCompatCustomActionResultReceiver() {
            AudioAttributesImplApi26Parcelizer();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.RemoteActionCompatParcelizer
        public final void read() {
            AudioAttributesImplApi26Parcelizer();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.RemoteActionCompatParcelizer
        public final void IconCompatParcelizer(AccessibilityNodeInfo accessibilityNodeInfo) {
            hasSuperClassStartingWith hassuperclassstartingwithWrite = hasSuperClassStartingWith.write(accessibilityNodeInfo);
            write(hassuperclassstartingwithWrite);
            AudioAttributesCompatParcelizer(hassuperclassstartingwithWrite);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.RemoteActionCompatParcelizer
        final void write(View view, hasSuperClassStartingWith hassuperclassstartingwith) {
            RemoteActionCompatParcelizer(view, hassuperclassstartingwith);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.RemoteActionCompatParcelizer
        public final boolean read(int i) {
            int i2;
            if (!RemoteActionCompatParcelizer(i)) {
                throw new IllegalStateException();
            }
            if (i == 8192) {
                i2 = ViewPager2.this.read() - 1;
            } else {
                i2 = ViewPager2.this.read() + 1;
            }
            AudioAttributesCompatParcelizer(i2);
            return true;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.RemoteActionCompatParcelizer
        public final void read(AccessibilityEvent accessibilityEvent) {
            accessibilityEvent.setSource(ViewPager2.this);
            accessibilityEvent.setClassName(RemoteActionCompatParcelizer());
        }

        final void AudioAttributesCompatParcelizer(int i) {
            if (ViewPager2.this.MediaBrowserCompatItemReceiver()) {
                ViewPager2.this.AudioAttributesCompatParcelizer(i, true);
            }
        }

        final void AudioAttributesImplApi26Parcelizer() {
            int itemCount;
            ViewPager2 viewPager2 = ViewPager2.this;
            int i = R.id.accessibilityActionPageLeft;
            InvalidTypeIdException.RemoteActionCompatParcelizer((View) viewPager2, R.id.accessibilityActionPageLeft);
            InvalidTypeIdException.RemoteActionCompatParcelizer((View) viewPager2, R.id.accessibilityActionPageRight);
            InvalidTypeIdException.RemoteActionCompatParcelizer((View) viewPager2, R.id.accessibilityActionPageUp);
            InvalidTypeIdException.RemoteActionCompatParcelizer((View) viewPager2, R.id.accessibilityActionPageDown);
            if (ViewPager2.this.RemoteActionCompatParcelizer() == null || (itemCount = ViewPager2.this.RemoteActionCompatParcelizer().getItemCount()) == 0 || !ViewPager2.this.MediaBrowserCompatItemReceiver()) {
                return;
            }
            if (ViewPager2.this.IconCompatParcelizer() == 0) {
                boolean zAudioAttributesImplApi26Parcelizer = ViewPager2.this.AudioAttributesImplApi26Parcelizer();
                int i2 = zAudioAttributesImplApi26Parcelizer ? 16908360 : 16908361;
                if (zAudioAttributesImplApi26Parcelizer) {
                    i = 16908361;
                }
                if (ViewPager2.this.read < itemCount - 1) {
                    InvalidTypeIdException.IconCompatParcelizer(viewPager2, new hasSuperClassStartingWith.read(i2, null), null, this.write);
                }
                if (ViewPager2.this.read > 0) {
                    InvalidTypeIdException.IconCompatParcelizer(viewPager2, new hasSuperClassStartingWith.read(i, null), null, this.RemoteActionCompatParcelizer);
                    return;
                }
                return;
            }
            if (ViewPager2.this.read < itemCount - 1) {
                InvalidTypeIdException.IconCompatParcelizer(viewPager2, new hasSuperClassStartingWith.read(R.id.accessibilityActionPageDown, null), null, this.write);
            }
            if (ViewPager2.this.read > 0) {
                InvalidTypeIdException.IconCompatParcelizer(viewPager2, new hasSuperClassStartingWith.read(R.id.accessibilityActionPageUp, null), null, this.RemoteActionCompatParcelizer);
            }
        }

        private void write(hasSuperClassStartingWith hassuperclassstartingwith) {
            int itemCount;
            int itemCount2;
            if (ViewPager2.this.RemoteActionCompatParcelizer() != null) {
                itemCount2 = 1;
                if (ViewPager2.this.IconCompatParcelizer() == 1) {
                    itemCount2 = ViewPager2.this.RemoteActionCompatParcelizer().getItemCount();
                    itemCount = 1;
                } else {
                    itemCount = ViewPager2.this.RemoteActionCompatParcelizer().getItemCount();
                }
            } else {
                itemCount = 0;
                itemCount2 = 0;
            }
            hassuperclassstartingwith.RemoteActionCompatParcelizer(hasSuperClassStartingWith.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(itemCount2, itemCount, false, 0));
        }

        private void RemoteActionCompatParcelizer(View view, hasSuperClassStartingWith hassuperclassstartingwith) {
            int iMediaDescriptionCompat;
            int iMediaDescriptionCompat2 = 0;
            if (ViewPager2.this.IconCompatParcelizer() == 1) {
                LinearLayoutManager linearLayoutManager = ViewPager2.this.AudioAttributesCompatParcelizer;
                iMediaDescriptionCompat = LinearLayoutManager.MediaDescriptionCompat(view);
            } else {
                iMediaDescriptionCompat = 0;
            }
            if (ViewPager2.this.IconCompatParcelizer() == 0) {
                LinearLayoutManager linearLayoutManager2 = ViewPager2.this.AudioAttributesCompatParcelizer;
                iMediaDescriptionCompat2 = LinearLayoutManager.MediaDescriptionCompat(view);
            }
            hassuperclassstartingwith.AudioAttributesCompatParcelizer(hasSuperClassStartingWith.AudioAttributesImplBaseParcelizer.read(iMediaDescriptionCompat, 1, iMediaDescriptionCompat2, 1, false, false));
        }

        private void AudioAttributesCompatParcelizer(hasSuperClassStartingWith hassuperclassstartingwith) {
            int itemCount;
            RecyclerView.IconCompatParcelizer iconCompatParcelizerRemoteActionCompatParcelizer = ViewPager2.this.RemoteActionCompatParcelizer();
            if (iconCompatParcelizerRemoteActionCompatParcelizer == null || (itemCount = iconCompatParcelizerRemoteActionCompatParcelizer.getItemCount()) == 0 || !ViewPager2.this.MediaBrowserCompatItemReceiver()) {
                return;
            }
            if (ViewPager2.this.read > 0) {
                hassuperclassstartingwith.AudioAttributesCompatParcelizer(8192);
            }
            if (ViewPager2.this.read < itemCount - 1) {
                hassuperclassstartingwith.AudioAttributesCompatParcelizer(4096);
            }
            hassuperclassstartingwith.handleMediaPlayPauseIfPendingOnHandler(true);
        }
    }

    static abstract class IconCompatParcelizer extends RecyclerView.read {
        private IconCompatParcelizer() {
        }

        /* synthetic */ IconCompatParcelizer(byte b) {
            this();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.read
        public final void IconCompatParcelizer(int i, int i2) {
            read();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.read
        public final void AudioAttributesCompatParcelizer(int i, int i2, Object obj) {
            read();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.read
        public final void AudioAttributesCompatParcelizer(int i, int i2) {
            read();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.read
        public final void read(int i, int i2) {
            read();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.read
        public final void RemoteActionCompatParcelizer(int i, int i2) {
            read();
        }
    }
}
