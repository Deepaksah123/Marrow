package androidx.viewpager.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import androidx.core.view.WindowInsetsCompat;
import androidx.customview.view.AbsSavedState;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import kotlin.InvalidTypeIdException;
import kotlin._isNaN;
import kotlin.deserializeUsingCustom;
import kotlin.finishBranchObject;
import kotlin.getComponentEnabledSetting;
import kotlin.hasSuperClassStartingWith;

/* JADX INFO: loaded from: classes2.dex */
public class ViewPager extends ViewGroup {
    int AudioAttributesCompatParcelizer;
    private int AudioAttributesImplApi21Parcelizer;
    private boolean AudioAttributesImplApi26Parcelizer;
    private List<IconCompatParcelizer> AudioAttributesImplBaseParcelizer;
    getComponentEnabledSetting IconCompatParcelizer;
    private int MediaBrowserCompatItemReceiver;
    private int MediaBrowserCompatMediaItem;
    private int MediaBrowserCompatSearchResultReceiver;
    private boolean MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    private int MediaDescriptionCompat;
    private int MediaMetadataCompat;
    private ClassLoader MediaSessionCompatQueueItem;
    private boolean MediaSessionCompatResultReceiverWrapper;
    private int MediaSessionCompatToken;
    private Parcelable ParcelableVolumeInfo;
    private AudioAttributesImplBaseParcelizer PlaybackStateCompat;
    private EdgeEffect PlaybackStateCompatCustomAction;
    private int RatingCompat;
    private int ResultReceiver;
    private final AudioAttributesCompatParcelizer _init_lambda2;
    private int _init_lambda3;
    private int handleMediaPlayPauseIfPendingOnHandler;
    private int onAddQueueItem;
    private ArrayList<View> onCommand;
    private final Runnable onCustomAction;
    private boolean onFastForward;
    private float onMediaButtonEvent;
    private int onPause;
    private int onPlay;
    private boolean onPlayFromMediaId;
    private boolean onPlayFromSearch;
    private float onPlayFromUri;
    private boolean onPrepare;
    private RemoteActionCompatParcelizer onPrepareFromMediaId;
    private float onPrepareFromSearch;
    private float onPrepareFromUri;
    private boolean onRemoveQueueItem;
    private float onRemoveQueueItemAt;
    private float onRewind;
    private final ArrayList<AudioAttributesCompatParcelizer> onSeekTo;
    private boolean onSetCaptioningEnabled;
    private EdgeEffect onSetPlaybackSpeed;
    private int onSetRating;
    private int onSetRepeatMode;
    private Drawable onSetShuffleMode;
    private int onSkipToNext;
    private RemoteActionCompatParcelizer onSkipToPrevious;
    private AudioAttributesImplApi21Parcelizer onSkipToQueueItem;
    private List<RemoteActionCompatParcelizer> onStop;
    private boolean r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw;
    private Scroller r8lambdaKUbBm7ckfqTc9QCgukC86fguu4;
    private int r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
    private VelocityTracker r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28;
    private int r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8;
    private final Rect r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0;
    private int setSessionImpl;
    static final int[] read = {R.attr.layout_gravity};
    private static final Comparator<AudioAttributesCompatParcelizer> RemoteActionCompatParcelizer = new Comparator<AudioAttributesCompatParcelizer>() { // from class: androidx.viewpager.widget.ViewPager.3
        @Override // java.util.Comparator
        public final /* synthetic */ int compare(AudioAttributesCompatParcelizer audioAttributesCompatParcelizer, AudioAttributesCompatParcelizer audioAttributesCompatParcelizer2) {
            return RemoteActionCompatParcelizer(audioAttributesCompatParcelizer, audioAttributesCompatParcelizer2);
        }

        private static int RemoteActionCompatParcelizer(AudioAttributesCompatParcelizer audioAttributesCompatParcelizer, AudioAttributesCompatParcelizer audioAttributesCompatParcelizer2) {
            return audioAttributesCompatParcelizer.read - audioAttributesCompatParcelizer2.read;
        }
    };
    private static final Interpolator write = new Interpolator() { // from class: androidx.viewpager.widget.ViewPager.4
        @Override // android.animation.TimeInterpolator
        public final float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    };
    private static final MediaBrowserCompatCustomActionResultReceiver MediaBrowserCompatCustomActionResultReceiver = new MediaBrowserCompatCustomActionResultReceiver();

    public interface AudioAttributesImplBaseParcelizer {
    }

    public interface IconCompatParcelizer {
        void RemoteActionCompatParcelizer(ViewPager viewPager, getComponentEnabledSetting getcomponentenabledsetting, getComponentEnabledSetting getcomponentenabledsetting2);
    }

    public interface RemoteActionCompatParcelizer {
        void IconCompatParcelizer(int i);

        void RemoteActionCompatParcelizer(int i);

        void read(int i, float f);
    }

    /* JADX INFO: loaded from: classes.dex */
    @Target({ElementType.TYPE})
    @Inherited
    @Retention(RetentionPolicy.RUNTIME)
    public @interface write {
    }

    static class AudioAttributesCompatParcelizer {
        float AudioAttributesCompatParcelizer;
        boolean IconCompatParcelizer;
        float RemoteActionCompatParcelizer;
        int read;
        Object write;

        AudioAttributesCompatParcelizer() {
        }
    }

    public ViewPager(Context context) {
        super(context);
        this.onSeekTo = new ArrayList<>();
        this._init_lambda2 = new AudioAttributesCompatParcelizer();
        this.r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0 = new Rect();
        this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = -1;
        this.ParcelableVolumeInfo = null;
        this.MediaSessionCompatQueueItem = null;
        this.onMediaButtonEvent = -3.4028235E38f;
        this.onRemoveQueueItemAt = Float.MAX_VALUE;
        this.setSessionImpl = 1;
        this.MediaBrowserCompatItemReceiver = -1;
        this.onPlayFromMediaId = true;
        this.onSetCaptioningEnabled = false;
        this.onCustomAction = new Runnable() { // from class: androidx.viewpager.widget.ViewPager.1
            @Override // java.lang.Runnable
            public final void run() {
                ViewPager.this.IconCompatParcelizer(0);
                ViewPager.this.IconCompatParcelizer();
            }
        };
        this.ResultReceiver = 0;
        MediaMetadataCompat();
    }

    public ViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.onSeekTo = new ArrayList<>();
        this._init_lambda2 = new AudioAttributesCompatParcelizer();
        this.r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0 = new Rect();
        this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = -1;
        this.ParcelableVolumeInfo = null;
        this.MediaSessionCompatQueueItem = null;
        this.onMediaButtonEvent = -3.4028235E38f;
        this.onRemoveQueueItemAt = Float.MAX_VALUE;
        this.setSessionImpl = 1;
        this.MediaBrowserCompatItemReceiver = -1;
        this.onPlayFromMediaId = true;
        this.onSetCaptioningEnabled = false;
        this.onCustomAction = new Runnable() { // from class: androidx.viewpager.widget.ViewPager.1
            @Override // java.lang.Runnable
            public final void run() {
                ViewPager.this.IconCompatParcelizer(0);
                ViewPager.this.IconCompatParcelizer();
            }
        };
        this.ResultReceiver = 0;
        MediaMetadataCompat();
    }

    private void MediaMetadataCompat() {
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context = getContext();
        this.r8lambdaKUbBm7ckfqTc9QCgukC86fguu4 = new Scroller(context, write);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f = context.getResources().getDisplayMetrics().density;
        this.r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8 = viewConfiguration.getScaledPagingTouchSlop();
        this.onSetRepeatMode = (int) (400.0f * f);
        this.onSetRating = viewConfiguration.getScaledMaximumFlingVelocity();
        this.onSetPlaybackSpeed = new EdgeEffect(context);
        this.PlaybackStateCompatCustomAction = new EdgeEffect(context);
        this.onPlay = (int) (25.0f * f);
        this.MediaMetadataCompat = (int) (2.0f * f);
        this.RatingCompat = (int) (f * 16.0f);
        InvalidTypeIdException.AudioAttributesCompatParcelizer(this, new read());
        if (InvalidTypeIdException.MediaBrowserCompatItemReceiver(this) == 0) {
            InvalidTypeIdException.AudioAttributesImplBaseParcelizer(this, 1);
        }
        InvalidTypeIdException.read(this, new finishBranchObject() { // from class: androidx.viewpager.widget.ViewPager.2
            private final Rect IconCompatParcelizer = new Rect();

            @Override // kotlin.finishBranchObject
            public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                WindowInsetsCompat windowInsetsCompatAudioAttributesCompatParcelizer = InvalidTypeIdException.AudioAttributesCompatParcelizer(view, windowInsetsCompat);
                if (windowInsetsCompatAudioAttributesCompatParcelizer.MediaBrowserCompatSearchResultReceiver()) {
                    return windowInsetsCompatAudioAttributesCompatParcelizer;
                }
                Rect rect = this.IconCompatParcelizer;
                rect.left = windowInsetsCompatAudioAttributesCompatParcelizer.AudioAttributesImplApi21Parcelizer();
                rect.top = windowInsetsCompatAudioAttributesCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver();
                rect.right = windowInsetsCompatAudioAttributesCompatParcelizer.MediaBrowserCompatItemReceiver();
                rect.bottom = windowInsetsCompatAudioAttributesCompatParcelizer.AudioAttributesImplBaseParcelizer();
                int childCount = ViewPager.this.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    WindowInsetsCompat windowInsetsCompatWrite = InvalidTypeIdException.write(ViewPager.this.getChildAt(i), windowInsetsCompatAudioAttributesCompatParcelizer);
                    rect.left = Math.min(windowInsetsCompatWrite.AudioAttributesImplApi21Parcelizer(), rect.left);
                    rect.top = Math.min(windowInsetsCompatWrite.MediaBrowserCompatCustomActionResultReceiver(), rect.top);
                    rect.right = Math.min(windowInsetsCompatWrite.MediaBrowserCompatItemReceiver(), rect.right);
                    rect.bottom = Math.min(windowInsetsCompatWrite.AudioAttributesImplBaseParcelizer(), rect.bottom);
                }
                return windowInsetsCompatAudioAttributesCompatParcelizer.read(rect.left, rect.top, rect.right, rect.bottom);
            }
        });
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        removeCallbacks(this.onCustomAction);
        Scroller scroller = this.r8lambdaKUbBm7ckfqTc9QCgukC86fguu4;
        if (scroller != null && !scroller.isFinished()) {
            this.r8lambdaKUbBm7ckfqTc9QCgukC86fguu4.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    final void IconCompatParcelizer(int i) {
        if (this.ResultReceiver == i) {
            return;
        }
        this.ResultReceiver = i;
        if (this.PlaybackStateCompat != null) {
            IconCompatParcelizer(i != 0);
        }
        RemoteActionCompatParcelizer(i);
    }

    public void setAdapter(getComponentEnabledSetting getcomponentenabledsetting) {
        getComponentEnabledSetting getcomponentenabledsetting2 = this.IconCompatParcelizer;
        if (getcomponentenabledsetting2 != null) {
            getcomponentenabledsetting2.AudioAttributesCompatParcelizer(null);
            this.IconCompatParcelizer.IconCompatParcelizer(this);
            for (int i = 0; i < this.onSeekTo.size(); i++) {
                AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = this.onSeekTo.get(i);
                getComponentEnabledSetting getcomponentenabledsetting3 = this.IconCompatParcelizer;
                int i2 = audioAttributesCompatParcelizer.read;
                getcomponentenabledsetting3.IconCompatParcelizer(this, audioAttributesCompatParcelizer.write);
            }
            this.IconCompatParcelizer.write();
            this.onSeekTo.clear();
            AudioAttributesImplBaseParcelizer();
            this.AudioAttributesCompatParcelizer = 0;
            scrollTo(0, 0);
        }
        getComponentEnabledSetting getcomponentenabledsetting4 = this.IconCompatParcelizer;
        this.IconCompatParcelizer = getcomponentenabledsetting;
        this.handleMediaPlayPauseIfPendingOnHandler = 0;
        if (getcomponentenabledsetting != null) {
            if (this.onSkipToQueueItem == null) {
                this.onSkipToQueueItem = new AudioAttributesImplApi21Parcelizer();
            }
            this.IconCompatParcelizer.AudioAttributesCompatParcelizer(this.onSkipToQueueItem);
            this.MediaSessionCompatResultReceiverWrapper = false;
            boolean z = this.onPlayFromMediaId;
            this.onPlayFromMediaId = true;
            this.handleMediaPlayPauseIfPendingOnHandler = this.IconCompatParcelizer.AudioAttributesCompatParcelizer();
            int i3 = this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
            if (i3 >= 0) {
                read(i3, false, true);
                this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = -1;
                this.ParcelableVolumeInfo = null;
                this.MediaSessionCompatQueueItem = null;
            } else if (!z) {
                IconCompatParcelizer();
            } else {
                requestLayout();
            }
        }
        List<IconCompatParcelizer> list = this.AudioAttributesImplBaseParcelizer;
        if (list == null || list.isEmpty()) {
            return;
        }
        int size = this.AudioAttributesImplBaseParcelizer.size();
        for (int i4 = 0; i4 < size; i4++) {
            this.AudioAttributesImplBaseParcelizer.get(i4).RemoteActionCompatParcelizer(this, getcomponentenabledsetting4, getcomponentenabledsetting);
        }
    }

    private void AudioAttributesImplBaseParcelizer() {
        int i = 0;
        while (i < getChildCount()) {
            if (!((LayoutParams) getChildAt(i).getLayoutParams()).read) {
                removeViewAt(i);
                i--;
            }
            i++;
        }
    }

    public final getComponentEnabledSetting read() {
        return this.IconCompatParcelizer;
    }

    public final void write(IconCompatParcelizer iconCompatParcelizer) {
        if (this.AudioAttributesImplBaseParcelizer == null) {
            this.AudioAttributesImplBaseParcelizer = new ArrayList();
        }
        this.AudioAttributesImplBaseParcelizer.add(iconCompatParcelizer);
    }

    public final void AudioAttributesCompatParcelizer(IconCompatParcelizer iconCompatParcelizer) {
        List<IconCompatParcelizer> list = this.AudioAttributesImplBaseParcelizer;
        if (list != null) {
            list.remove(iconCompatParcelizer);
        }
    }

    private int AudioAttributesImplApi21Parcelizer() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    public void setCurrentItem(int i) {
        this.MediaSessionCompatResultReceiverWrapper = false;
        read(i, !this.onPlayFromMediaId, false);
    }

    public void setCurrentItem(int i, boolean z) {
        this.MediaSessionCompatResultReceiverWrapper = false;
        read(i, z, false);
    }

    public final int write() {
        return this.AudioAttributesCompatParcelizer;
    }

    private void read(int i, boolean z, boolean z2) {
        write(i, z, z2, 0);
    }

    private void write(int i, boolean z, boolean z2, int i2) {
        getComponentEnabledSetting getcomponentenabledsetting = this.IconCompatParcelizer;
        if (getcomponentenabledsetting == null || getcomponentenabledsetting.AudioAttributesCompatParcelizer() <= 0) {
            AudioAttributesCompatParcelizer(false);
            return;
        }
        if (!z2 && this.AudioAttributesCompatParcelizer == i && this.onSeekTo.size() != 0) {
            AudioAttributesCompatParcelizer(false);
            return;
        }
        if (i < 0) {
            i = 0;
        } else if (i >= this.IconCompatParcelizer.AudioAttributesCompatParcelizer()) {
            i = this.IconCompatParcelizer.AudioAttributesCompatParcelizer() - 1;
        }
        int i3 = this.setSessionImpl;
        int i4 = this.AudioAttributesCompatParcelizer;
        if (i > i4 + i3 || i < i4 - i3) {
            for (int i5 = 0; i5 < this.onSeekTo.size(); i5++) {
                this.onSeekTo.get(i5).IconCompatParcelizer = true;
            }
        }
        boolean z3 = this.AudioAttributesCompatParcelizer != i;
        if (this.onPlayFromMediaId) {
            this.AudioAttributesCompatParcelizer = i;
            if (z3) {
                AudioAttributesCompatParcelizer(i);
            }
            requestLayout();
            return;
        }
        MediaBrowserCompatItemReceiver(i);
        read(i, z, i2, z3);
    }

    private void read(int i, boolean z, int i2, boolean z2) {
        AudioAttributesCompatParcelizer audioAttributesCompatParcelizerAudioAttributesImplApi21Parcelizer = AudioAttributesImplApi21Parcelizer(i);
        int iAudioAttributesImplApi21Parcelizer = audioAttributesCompatParcelizerAudioAttributesImplApi21Parcelizer != null ? (int) (AudioAttributesImplApi21Parcelizer() * Math.max(this.onMediaButtonEvent, Math.min(audioAttributesCompatParcelizerAudioAttributesImplApi21Parcelizer.RemoteActionCompatParcelizer, this.onRemoveQueueItemAt))) : 0;
        if (z) {
            write(iAudioAttributesImplApi21Parcelizer, i2);
            if (z2) {
                AudioAttributesCompatParcelizer(i);
                return;
            }
            return;
        }
        if (z2) {
            AudioAttributesCompatParcelizer(i);
        }
        write(false);
        scrollTo(iAudioAttributesImplApi21Parcelizer, 0);
        read(iAudioAttributesImplApi21Parcelizer);
    }

    @Deprecated
    public void setOnPageChangeListener(RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        this.onSkipToPrevious = remoteActionCompatParcelizer;
    }

    public final void read(RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        if (this.onStop == null) {
            this.onStop = new ArrayList();
        }
        this.onStop.add(remoteActionCompatParcelizer);
    }

    public final void IconCompatParcelizer(RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        List<RemoteActionCompatParcelizer> list = this.onStop;
        if (list != null) {
            list.remove(remoteActionCompatParcelizer);
        }
    }

    public void setPageTransformer(boolean z, AudioAttributesImplBaseParcelizer audioAttributesImplBaseParcelizer) {
        setPageTransformer(z, audioAttributesImplBaseParcelizer, 2);
    }

    public void setPageTransformer(boolean z, AudioAttributesImplBaseParcelizer audioAttributesImplBaseParcelizer, int i) {
        boolean z2 = audioAttributesImplBaseParcelizer != null;
        boolean z3 = z2 != (this.PlaybackStateCompat != null);
        this.PlaybackStateCompat = audioAttributesImplBaseParcelizer;
        setChildrenDrawingOrderEnabled(z2);
        if (z2) {
            this.onAddQueueItem = z ? 2 : 1;
            this.MediaSessionCompatToken = i;
        } else {
            this.onAddQueueItem = 0;
        }
        if (z3) {
            IconCompatParcelizer();
        }
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int i, int i2) {
        if (this.onAddQueueItem == 2) {
            i2 = (i - 1) - i2;
        }
        return ((LayoutParams) this.onCommand.get(i2).getLayoutParams()).AudioAttributesCompatParcelizer;
    }

    final RemoteActionCompatParcelizer RemoteActionCompatParcelizer(RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        RemoteActionCompatParcelizer remoteActionCompatParcelizer2 = this.onPrepareFromMediaId;
        this.onPrepareFromMediaId = remoteActionCompatParcelizer;
        return remoteActionCompatParcelizer2;
    }

    public void setOffscreenPageLimit(int i) {
        if (i <= 0) {
            i = 1;
        }
        if (i != this.setSessionImpl) {
            this.setSessionImpl = i;
            IconCompatParcelizer();
        }
    }

    public void setPageMargin(int i) {
        int i2 = this.onSkipToNext;
        this.onSkipToNext = i;
        int width = getWidth();
        AudioAttributesCompatParcelizer(width, width, i, i2);
        requestLayout();
    }

    public void setPageMarginDrawable(Drawable drawable) {
        this.onSetShuffleMode = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    public void setPageMarginDrawable(int i) {
        setPageMarginDrawable(_isNaN.getDrawable(getContext(), i));
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.onSetShuffleMode;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.onSetShuffleMode;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        drawable.setState(getDrawableState());
    }

    private static float write(float f) {
        return (float) Math.sin((f - 0.5f) * 0.47123894f);
    }

    private void write(int i, int i2) {
        int scrollX;
        int iAbs;
        if (getChildCount() == 0) {
            AudioAttributesCompatParcelizer(false);
            return;
        }
        Scroller scroller = this.r8lambdaKUbBm7ckfqTc9QCgukC86fguu4;
        if (scroller != null && !scroller.isFinished()) {
            scrollX = this.onPlayFromSearch ? this.r8lambdaKUbBm7ckfqTc9QCgukC86fguu4.getCurrX() : this.r8lambdaKUbBm7ckfqTc9QCgukC86fguu4.getStartX();
            this.r8lambdaKUbBm7ckfqTc9QCgukC86fguu4.abortAnimation();
            AudioAttributesCompatParcelizer(false);
        } else {
            scrollX = getScrollX();
        }
        int i3 = scrollX;
        int scrollY = getScrollY();
        int i4 = i - i3;
        int i5 = 0 - scrollY;
        if (i4 == 0 && i5 == 0) {
            write(false);
            IconCompatParcelizer();
            IconCompatParcelizer(0);
            return;
        }
        AudioAttributesCompatParcelizer(true);
        IconCompatParcelizer(2);
        int iAudioAttributesImplApi21Parcelizer = AudioAttributesImplApi21Parcelizer();
        int i6 = iAudioAttributesImplApi21Parcelizer / 2;
        float f = iAudioAttributesImplApi21Parcelizer;
        float f2 = i6;
        float fWrite = write(Math.min(1.0f, Math.abs(i4) / f));
        int iAbs2 = Math.abs(i2);
        if (iAbs2 > 0) {
            iAbs = Math.round(Math.abs((f2 + (fWrite * f2)) / iAbs2) * 1000.0f) << 2;
        } else {
            iAbs = (int) (((Math.abs(i4) / (f + this.onSkipToNext)) + 1.0f) * 100.0f);
        }
        int iMin = Math.min(iAbs, 600);
        this.onPlayFromSearch = false;
        this.r8lambdaKUbBm7ckfqTc9QCgukC86fguu4.startScroll(i3, scrollY, i4, i5, iMin);
        InvalidTypeIdException.onRemoveQueueItem(this);
    }

    private AudioAttributesCompatParcelizer AudioAttributesCompatParcelizer(int i, int i2) {
        AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = new AudioAttributesCompatParcelizer();
        audioAttributesCompatParcelizer.read = i;
        audioAttributesCompatParcelizer.write = this.IconCompatParcelizer.read(this, i);
        audioAttributesCompatParcelizer.AudioAttributesCompatParcelizer = getComponentEnabledSetting.IconCompatParcelizer();
        if (i2 < 0 || i2 >= this.onSeekTo.size()) {
            this.onSeekTo.add(audioAttributesCompatParcelizer);
            return audioAttributesCompatParcelizer;
        }
        this.onSeekTo.add(i2, audioAttributesCompatParcelizer);
        return audioAttributesCompatParcelizer;
    }

    final void RemoteActionCompatParcelizer() {
        int iAudioAttributesCompatParcelizer = this.IconCompatParcelizer.AudioAttributesCompatParcelizer();
        this.handleMediaPlayPauseIfPendingOnHandler = iAudioAttributesCompatParcelizer;
        boolean z = this.onSeekTo.size() < (this.setSessionImpl << 1) + 1 && this.onSeekTo.size() < iAudioAttributesCompatParcelizer;
        int i = this.AudioAttributesCompatParcelizer;
        for (int i2 = 0; i2 < this.onSeekTo.size(); i2++) {
            Object obj = this.onSeekTo.get(i2).write;
        }
        Collections.sort(this.onSeekTo, RemoteActionCompatParcelizer);
        if (z) {
            int childCount = getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                LayoutParams layoutParams = (LayoutParams) getChildAt(i3).getLayoutParams();
                if (!layoutParams.read) {
                    layoutParams.AudioAttributesImplApi21Parcelizer = BitmapDescriptorFactory.HUE_RED;
                }
            }
            read(i, false, true);
            requestLayout();
        }
    }

    final void IconCompatParcelizer() {
        MediaBrowserCompatItemReceiver(this.AudioAttributesCompatParcelizer);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0069, code lost:
    
        r8 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00f9 A[PHI: r7 r10 r15
      0x00f9: PHI (r7v6 int) = (r7v5 int), (r7v4 int), (r7v9 int) binds: [B:61:0x00ee, B:58:0x00d8, B:52:0x00c2] A[DONT_GENERATE, DONT_INLINE]
      0x00f9: PHI (r10v9 int) = (r10v1 int), (r10v8 int), (r10v12 int) binds: [B:61:0x00ee, B:58:0x00d8, B:52:0x00c2] A[DONT_GENERATE, DONT_INLINE]
      0x00f9: PHI (r15v7 float) = (r15v5 float), (r15v6 float), (r15v4 float) binds: [B:61:0x00ee, B:58:0x00d8, B:52:0x00c2] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void MediaBrowserCompatItemReceiver(int r18) {
        /*
            Method dump skipped, instruction units count: 609
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.MediaBrowserCompatItemReceiver(int):void");
    }

    private void RatingCompat() {
        if (this.onAddQueueItem != 0) {
            ArrayList<View> arrayList = this.onCommand;
            if (arrayList == null) {
                this.onCommand = new ArrayList<>();
            } else {
                arrayList.clear();
            }
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                this.onCommand.add(getChildAt(i));
            }
            Collections.sort(this.onCommand, MediaBrowserCompatCustomActionResultReceiver);
        }
    }

    private void read(AudioAttributesCompatParcelizer audioAttributesCompatParcelizer, int i, AudioAttributesCompatParcelizer audioAttributesCompatParcelizer2) {
        AudioAttributesCompatParcelizer audioAttributesCompatParcelizer3;
        AudioAttributesCompatParcelizer audioAttributesCompatParcelizer4;
        int iAudioAttributesCompatParcelizer = this.IconCompatParcelizer.AudioAttributesCompatParcelizer();
        int iAudioAttributesImplApi21Parcelizer = AudioAttributesImplApi21Parcelizer();
        float f = iAudioAttributesImplApi21Parcelizer > 0 ? this.onSkipToNext / iAudioAttributesImplApi21Parcelizer : BitmapDescriptorFactory.HUE_RED;
        if (audioAttributesCompatParcelizer2 != null) {
            int i2 = audioAttributesCompatParcelizer2.read;
            if (i2 < audioAttributesCompatParcelizer.read) {
                float fIconCompatParcelizer = audioAttributesCompatParcelizer2.RemoteActionCompatParcelizer + audioAttributesCompatParcelizer2.AudioAttributesCompatParcelizer + f;
                int i3 = i2 + 1;
                int i4 = 0;
                while (i3 <= audioAttributesCompatParcelizer.read && i4 < this.onSeekTo.size()) {
                    AudioAttributesCompatParcelizer audioAttributesCompatParcelizer5 = this.onSeekTo.get(i4);
                    while (true) {
                        audioAttributesCompatParcelizer4 = audioAttributesCompatParcelizer5;
                        if (i3 <= audioAttributesCompatParcelizer4.read || i4 >= this.onSeekTo.size() - 1) {
                            break;
                        }
                        i4++;
                        audioAttributesCompatParcelizer5 = this.onSeekTo.get(i4);
                    }
                    while (i3 < audioAttributesCompatParcelizer4.read) {
                        fIconCompatParcelizer += getComponentEnabledSetting.IconCompatParcelizer() + f;
                        i3++;
                    }
                    audioAttributesCompatParcelizer4.RemoteActionCompatParcelizer = fIconCompatParcelizer;
                    fIconCompatParcelizer += audioAttributesCompatParcelizer4.AudioAttributesCompatParcelizer + f;
                    i3++;
                }
            } else if (i2 > audioAttributesCompatParcelizer.read) {
                int size = this.onSeekTo.size() - 1;
                float fIconCompatParcelizer2 = audioAttributesCompatParcelizer2.RemoteActionCompatParcelizer;
                while (true) {
                    i2--;
                    if (i2 < audioAttributesCompatParcelizer.read || size < 0) {
                        break;
                    }
                    AudioAttributesCompatParcelizer audioAttributesCompatParcelizer6 = this.onSeekTo.get(size);
                    while (true) {
                        audioAttributesCompatParcelizer3 = audioAttributesCompatParcelizer6;
                        if (i2 >= audioAttributesCompatParcelizer3.read || size <= 0) {
                            break;
                        }
                        size--;
                        audioAttributesCompatParcelizer6 = this.onSeekTo.get(size);
                    }
                    while (i2 > audioAttributesCompatParcelizer3.read) {
                        fIconCompatParcelizer2 -= getComponentEnabledSetting.IconCompatParcelizer() + f;
                        i2--;
                    }
                    fIconCompatParcelizer2 -= audioAttributesCompatParcelizer3.AudioAttributesCompatParcelizer + f;
                    audioAttributesCompatParcelizer3.RemoteActionCompatParcelizer = fIconCompatParcelizer2;
                }
            }
        }
        int size2 = this.onSeekTo.size();
        float fIconCompatParcelizer3 = audioAttributesCompatParcelizer.RemoteActionCompatParcelizer;
        int i5 = audioAttributesCompatParcelizer.read - 1;
        this.onMediaButtonEvent = audioAttributesCompatParcelizer.read == 0 ? audioAttributesCompatParcelizer.RemoteActionCompatParcelizer : -3.4028235E38f;
        int i6 = iAudioAttributesCompatParcelizer - 1;
        this.onRemoveQueueItemAt = audioAttributesCompatParcelizer.read == i6 ? (audioAttributesCompatParcelizer.RemoteActionCompatParcelizer + audioAttributesCompatParcelizer.AudioAttributesCompatParcelizer) - 1.0f : Float.MAX_VALUE;
        int i7 = i - 1;
        while (i7 >= 0) {
            AudioAttributesCompatParcelizer audioAttributesCompatParcelizer7 = this.onSeekTo.get(i7);
            while (i5 > audioAttributesCompatParcelizer7.read) {
                fIconCompatParcelizer3 -= getComponentEnabledSetting.IconCompatParcelizer() + f;
                i5--;
            }
            fIconCompatParcelizer3 -= audioAttributesCompatParcelizer7.AudioAttributesCompatParcelizer + f;
            audioAttributesCompatParcelizer7.RemoteActionCompatParcelizer = fIconCompatParcelizer3;
            if (audioAttributesCompatParcelizer7.read == 0) {
                this.onMediaButtonEvent = fIconCompatParcelizer3;
            }
            i7--;
            i5--;
        }
        float fIconCompatParcelizer4 = audioAttributesCompatParcelizer.RemoteActionCompatParcelizer + audioAttributesCompatParcelizer.AudioAttributesCompatParcelizer + f;
        int i8 = audioAttributesCompatParcelizer.read + 1;
        int i9 = i + 1;
        while (i9 < size2) {
            AudioAttributesCompatParcelizer audioAttributesCompatParcelizer8 = this.onSeekTo.get(i9);
            while (i8 < audioAttributesCompatParcelizer8.read) {
                fIconCompatParcelizer4 += getComponentEnabledSetting.IconCompatParcelizer() + f;
                i8++;
            }
            if (audioAttributesCompatParcelizer8.read == i6) {
                this.onRemoveQueueItemAt = (audioAttributesCompatParcelizer8.AudioAttributesCompatParcelizer + fIconCompatParcelizer4) - 1.0f;
            }
            audioAttributesCompatParcelizer8.RemoteActionCompatParcelizer = fIconCompatParcelizer4;
            fIconCompatParcelizer4 += audioAttributesCompatParcelizer8.AudioAttributesCompatParcelizer + f;
            i9++;
            i8++;
        }
        this.onSetCaptioningEnabled = false;
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: androidx.viewpager.widget.ViewPager.SavedState.2
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return RemoteActionCompatParcelizer(parcel);
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

            private static SavedState RemoteActionCompatParcelizer(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            private static SavedState[] IconCompatParcelizer(int i) {
                return new SavedState[i];
            }
        };
        ClassLoader AudioAttributesCompatParcelizer;
        int RemoteActionCompatParcelizer;
        Parcelable read;

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.RemoteActionCompatParcelizer);
            parcel.writeParcelable(this.read, i);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("FragmentPager.SavedState{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" position=");
            sb.append(this.RemoteActionCompatParcelizer);
            sb.append("}");
            return sb.toString();
        }

        SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            classLoader = classLoader == null ? getClass().getClassLoader() : classLoader;
            this.RemoteActionCompatParcelizer = parcel.readInt();
            this.read = parcel.readParcelable(classLoader);
            this.AudioAttributesCompatParcelizer = classLoader;
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.RemoteActionCompatParcelizer = this.AudioAttributesCompatParcelizer;
        getComponentEnabledSetting getcomponentenabledsetting = this.IconCompatParcelizer;
        if (getcomponentenabledsetting != null) {
            savedState.read = getcomponentenabledsetting.RemoteActionCompatParcelizer();
        }
        return savedState;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.read());
        if (this.IconCompatParcelizer != null) {
            Parcelable parcelable2 = savedState.read;
            ClassLoader classLoader = savedState.AudioAttributesCompatParcelizer;
            read(savedState.RemoteActionCompatParcelizer, false, true);
        } else {
            this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = savedState.RemoteActionCompatParcelizer;
            this.ParcelableVolumeInfo = savedState.read;
            this.MediaSessionCompatQueueItem = savedState.AudioAttributesCompatParcelizer;
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateLayoutParams(layoutParams);
        }
        LayoutParams layoutParams2 = (LayoutParams) layoutParams;
        layoutParams2.read |= IconCompatParcelizer(view);
        if (this.onFastForward) {
            if (layoutParams2 != null && layoutParams2.read) {
                throw new IllegalStateException("Cannot add pager decor view during layout");
            }
            layoutParams2.write = true;
            addViewInLayout(view, i, layoutParams);
            return;
        }
        super.addView(view, i, layoutParams);
    }

    private static boolean IconCompatParcelizer(View view) {
        return view.getClass().getAnnotation(write.class) != null;
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        if (this.onFastForward) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    private AudioAttributesCompatParcelizer AudioAttributesCompatParcelizer(View view) {
        for (int i = 0; i < this.onSeekTo.size(); i++) {
            AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = this.onSeekTo.get(i);
            if (this.IconCompatParcelizer.RemoteActionCompatParcelizer(view, audioAttributesCompatParcelizer.write)) {
                return audioAttributesCompatParcelizer;
            }
        }
        return null;
    }

    private AudioAttributesCompatParcelizer write(View view) {
        while (true) {
            Object parent = view.getParent();
            if (parent != this) {
                if (parent == null || !(parent instanceof View)) {
                    return null;
                }
                view = (View) parent;
            } else {
                return AudioAttributesCompatParcelizer(view);
            }
        }
    }

    private AudioAttributesCompatParcelizer AudioAttributesImplApi21Parcelizer(int i) {
        for (int i2 = 0; i2 < this.onSeekTo.size(); i2++) {
            AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = this.onSeekTo.get(i2);
            if (audioAttributesCompatParcelizer.read == i) {
                return audioAttributesCompatParcelizer;
            }
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.onPlayFromMediaId = true;
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        LayoutParams layoutParams;
        LayoutParams layoutParams2;
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z = false;
        setMeasuredDimension(getDefaultSize(0, i), getDefaultSize(0, i2));
        int measuredWidth = getMeasuredWidth();
        this.onPause = Math.min(measuredWidth / 10, this.RatingCompat);
        int paddingLeft = (measuredWidth - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        int i7 = 0;
        while (true) {
            boolean z2 = true;
            int i8 = 1073741824;
            if (i7 >= childCount) {
                break;
            }
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8 && (layoutParams2 = (LayoutParams) childAt.getLayoutParams()) != null && layoutParams2.read) {
                int i9 = layoutParams2.RemoteActionCompatParcelizer & 7;
                int i10 = layoutParams2.RemoteActionCompatParcelizer & 112;
                boolean z3 = (i10 == 48 || i10 == 80) ? true : z;
                if (i9 != 3 && i9 != 5) {
                    z2 = z;
                }
                int i11 = Integer.MIN_VALUE;
                if (z3) {
                    i3 = Integer.MIN_VALUE;
                    i11 = 1073741824;
                } else {
                    i3 = z2 ? 1073741824 : Integer.MIN_VALUE;
                }
                if (((ViewGroup.LayoutParams) layoutParams2).width != -2) {
                    i5 = ((ViewGroup.LayoutParams) layoutParams2).width != -1 ? ((ViewGroup.LayoutParams) layoutParams2).width : paddingLeft;
                    i4 = 1073741824;
                } else {
                    i4 = i11;
                    i5 = paddingLeft;
                }
                if (((ViewGroup.LayoutParams) layoutParams2).height != -2) {
                    i6 = ((ViewGroup.LayoutParams) layoutParams2).height != -1 ? ((ViewGroup.LayoutParams) layoutParams2).height : measuredHeight;
                } else {
                    i6 = measuredHeight;
                    i8 = i3;
                }
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i5, i4), View.MeasureSpec.makeMeasureSpec(i6, i8));
                if (z3) {
                    measuredHeight -= childAt.getMeasuredHeight();
                } else if (z2) {
                    paddingLeft -= childAt.getMeasuredWidth();
                }
            }
            i7++;
            z = false;
        }
        this.MediaDescriptionCompat = View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824);
        this.MediaBrowserCompatSearchResultReceiver = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        this.onFastForward = true;
        IconCompatParcelizer();
        this.onFastForward = false;
        int childCount2 = getChildCount();
        for (int i12 = 0; i12 < childCount2; i12++) {
            View childAt2 = getChildAt(i12);
            if (childAt2.getVisibility() != 8 && ((layoutParams = (LayoutParams) childAt2.getLayoutParams()) == null || !layoutParams.read)) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (paddingLeft * layoutParams.AudioAttributesImplApi21Parcelizer), 1073741824), this.MediaBrowserCompatSearchResultReceiver);
            }
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            int i5 = this.onSkipToNext;
            AudioAttributesCompatParcelizer(i, i3, i5, i5);
        }
    }

    private void AudioAttributesCompatParcelizer(int i, int i2, int i3, int i4) {
        if (i2 > 0 && !this.onSeekTo.isEmpty()) {
            if (!this.r8lambdaKUbBm7ckfqTc9QCgukC86fguu4.isFinished()) {
                this.r8lambdaKUbBm7ckfqTc9QCgukC86fguu4.setFinalX(write() * AudioAttributesImplApi21Parcelizer());
                return;
            }
            int paddingLeft = getPaddingLeft();
            int paddingRight = getPaddingRight();
            scrollTo((int) ((getScrollX() / (((i2 - getPaddingLeft()) - getPaddingRight()) + i4)) * (((i - paddingLeft) - paddingRight) + i3)), getScrollY());
            return;
        }
        AudioAttributesCompatParcelizer audioAttributesCompatParcelizerAudioAttributesImplApi21Parcelizer = AudioAttributesImplApi21Parcelizer(this.AudioAttributesCompatParcelizer);
        int iMin = (int) ((audioAttributesCompatParcelizerAudioAttributesImplApi21Parcelizer != null ? Math.min(audioAttributesCompatParcelizerAudioAttributesImplApi21Parcelizer.RemoteActionCompatParcelizer, this.onRemoveQueueItemAt) : BitmapDescriptorFactory.HUE_RED) * ((i - getPaddingLeft()) - getPaddingRight()));
        if (iMin != getScrollX()) {
            write(false);
            scrollTo(iMin, getScrollY());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0090  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void onLayout(boolean r19, int r20, int r21, int r22, int r23) {
        /*
            Method dump skipped, instruction units count: 287
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.view.View
    public void computeScroll() {
        this.onPlayFromSearch = true;
        if (!this.r8lambdaKUbBm7ckfqTc9QCgukC86fguu4.isFinished() && this.r8lambdaKUbBm7ckfqTc9QCgukC86fguu4.computeScrollOffset()) {
            int scrollX = getScrollX();
            int scrollY = getScrollY();
            int currX = this.r8lambdaKUbBm7ckfqTc9QCgukC86fguu4.getCurrX();
            int currY = this.r8lambdaKUbBm7ckfqTc9QCgukC86fguu4.getCurrY();
            if (scrollX != currX || scrollY != currY) {
                scrollTo(currX, currY);
                if (!read(currX)) {
                    this.r8lambdaKUbBm7ckfqTc9QCgukC86fguu4.abortAnimation();
                    scrollTo(0, currY);
                }
            }
            InvalidTypeIdException.onRemoveQueueItem(this);
            return;
        }
        write(true);
    }

    private boolean read(int i) {
        if (this.onSeekTo.size() == 0) {
            if (this.onPlayFromMediaId) {
                return false;
            }
            this.AudioAttributesImplApi26Parcelizer = false;
            IconCompatParcelizer(0, BitmapDescriptorFactory.HUE_RED, 0);
            if (this.AudioAttributesImplApi26Parcelizer) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
        AudioAttributesCompatParcelizer audioAttributesCompatParcelizerMediaBrowserCompatItemReceiver = MediaBrowserCompatItemReceiver();
        int iAudioAttributesImplApi21Parcelizer = AudioAttributesImplApi21Parcelizer();
        int i2 = this.onSkipToNext;
        float f = iAudioAttributesImplApi21Parcelizer;
        int i3 = audioAttributesCompatParcelizerMediaBrowserCompatItemReceiver.read;
        float f2 = ((i / f) - audioAttributesCompatParcelizerMediaBrowserCompatItemReceiver.RemoteActionCompatParcelizer) / (audioAttributesCompatParcelizerMediaBrowserCompatItemReceiver.AudioAttributesCompatParcelizer + (i2 / f));
        this.AudioAttributesImplApi26Parcelizer = false;
        IconCompatParcelizer(i3, f2, (int) ((iAudioAttributesImplApi21Parcelizer + i2) * f2));
        if (this.AudioAttributesImplApi26Parcelizer) {
            return true;
        }
        throw new IllegalStateException("onPageScrolled did not call superclass implementation");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void IconCompatParcelizer(int r12, float r13, int r14) {
        /*
            r11 = this;
            int r14 = r11.MediaBrowserCompatMediaItem
            r0 = 0
            r1 = 1
            if (r14 <= 0) goto L6a
            int r14 = r11.getScrollX()
            int r2 = r11.getPaddingLeft()
            int r3 = r11.getPaddingRight()
            int r4 = r11.getWidth()
            int r5 = r11.getChildCount()
            r6 = r0
        L1b:
            if (r6 >= r5) goto L6a
            android.view.View r7 = r11.getChildAt(r6)
            android.view.ViewGroup$LayoutParams r8 = r7.getLayoutParams()
            androidx.viewpager.widget.ViewPager$LayoutParams r8 = (androidx.viewpager.widget.ViewPager.LayoutParams) r8
            boolean r9 = r8.read
            if (r9 == 0) goto L67
            int r8 = r8.RemoteActionCompatParcelizer
            r8 = r8 & 7
            if (r8 == r1) goto L4c
            r9 = 3
            if (r8 == r9) goto L46
            r9 = 5
            if (r8 == r9) goto L39
            r8 = r2
            goto L5b
        L39:
            int r8 = r4 - r3
            int r9 = r7.getMeasuredWidth()
            int r8 = r8 - r9
            int r9 = r7.getMeasuredWidth()
            int r3 = r3 + r9
            goto L58
        L46:
            int r8 = r7.getWidth()
            int r8 = r8 + r2
            goto L5b
        L4c:
            int r8 = r7.getMeasuredWidth()
            int r8 = r4 - r8
            int r8 = r8 / 2
            int r8 = java.lang.Math.max(r8, r2)
        L58:
            r10 = r8
            r8 = r2
            r2 = r10
        L5b:
            int r2 = r2 + r14
            int r9 = r7.getLeft()
            int r2 = r2 - r9
            if (r2 == 0) goto L66
            r7.offsetLeftAndRight(r2)
        L66:
            r2 = r8
        L67:
            int r6 = r6 + 1
            goto L1b
        L6a:
            r11.IconCompatParcelizer(r12, r13)
            androidx.viewpager.widget.ViewPager$AudioAttributesImplBaseParcelizer r12 = r11.PlaybackStateCompat
            if (r12 == 0) goto L91
            r11.getScrollX()
            int r12 = r11.getChildCount()
        L78:
            if (r0 >= r12) goto L91
            android.view.View r13 = r11.getChildAt(r0)
            android.view.ViewGroup$LayoutParams r14 = r13.getLayoutParams()
            androidx.viewpager.widget.ViewPager$LayoutParams r14 = (androidx.viewpager.widget.ViewPager.LayoutParams) r14
            boolean r14 = r14.read
            if (r14 != 0) goto L8e
            r13.getLeft()
            r11.AudioAttributesImplApi21Parcelizer()
        L8e:
            int r0 = r0 + 1
            goto L78
        L91:
            r11.AudioAttributesImplApi26Parcelizer = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.IconCompatParcelizer(int, float, int):void");
    }

    private void IconCompatParcelizer(int i, float f) {
        RemoteActionCompatParcelizer remoteActionCompatParcelizer = this.onSkipToPrevious;
        if (remoteActionCompatParcelizer != null) {
            remoteActionCompatParcelizer.read(i, f);
        }
        List<RemoteActionCompatParcelizer> list = this.onStop;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                RemoteActionCompatParcelizer remoteActionCompatParcelizer2 = this.onStop.get(i2);
                if (remoteActionCompatParcelizer2 != null) {
                    remoteActionCompatParcelizer2.read(i, f);
                }
            }
        }
        RemoteActionCompatParcelizer remoteActionCompatParcelizer3 = this.onPrepareFromMediaId;
        if (remoteActionCompatParcelizer3 != null) {
            remoteActionCompatParcelizer3.read(i, f);
        }
    }

    private void AudioAttributesCompatParcelizer(int i) {
        RemoteActionCompatParcelizer remoteActionCompatParcelizer = this.onSkipToPrevious;
        if (remoteActionCompatParcelizer != null) {
            remoteActionCompatParcelizer.RemoteActionCompatParcelizer(i);
        }
        List<RemoteActionCompatParcelizer> list = this.onStop;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                RemoteActionCompatParcelizer remoteActionCompatParcelizer2 = this.onStop.get(i2);
                if (remoteActionCompatParcelizer2 != null) {
                    remoteActionCompatParcelizer2.RemoteActionCompatParcelizer(i);
                }
            }
        }
        RemoteActionCompatParcelizer remoteActionCompatParcelizer3 = this.onPrepareFromMediaId;
        if (remoteActionCompatParcelizer3 != null) {
            remoteActionCompatParcelizer3.RemoteActionCompatParcelizer(i);
        }
    }

    private void RemoteActionCompatParcelizer(int i) {
        RemoteActionCompatParcelizer remoteActionCompatParcelizer = this.onSkipToPrevious;
        if (remoteActionCompatParcelizer != null) {
            remoteActionCompatParcelizer.IconCompatParcelizer(i);
        }
        List<RemoteActionCompatParcelizer> list = this.onStop;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                RemoteActionCompatParcelizer remoteActionCompatParcelizer2 = this.onStop.get(i2);
                if (remoteActionCompatParcelizer2 != null) {
                    remoteActionCompatParcelizer2.IconCompatParcelizer(i);
                }
            }
        }
        RemoteActionCompatParcelizer remoteActionCompatParcelizer3 = this.onPrepareFromMediaId;
        if (remoteActionCompatParcelizer3 != null) {
            remoteActionCompatParcelizer3.IconCompatParcelizer(i);
        }
    }

    private void write(boolean z) {
        boolean z2 = this.ResultReceiver == 2;
        if (z2) {
            AudioAttributesCompatParcelizer(false);
            if (!this.r8lambdaKUbBm7ckfqTc9QCgukC86fguu4.isFinished()) {
                this.r8lambdaKUbBm7ckfqTc9QCgukC86fguu4.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.r8lambdaKUbBm7ckfqTc9QCgukC86fguu4.getCurrX();
                int currY = this.r8lambdaKUbBm7ckfqTc9QCgukC86fguu4.getCurrY();
                if (scrollX != currX || scrollY != currY) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        read(currX);
                    }
                }
            }
        }
        this.MediaSessionCompatResultReceiverWrapper = false;
        for (int i = 0; i < this.onSeekTo.size(); i++) {
            AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = this.onSeekTo.get(i);
            if (audioAttributesCompatParcelizer.IconCompatParcelizer) {
                audioAttributesCompatParcelizer.IconCompatParcelizer = false;
                z2 = true;
            }
        }
        if (z2) {
            if (z) {
                InvalidTypeIdException.AudioAttributesCompatParcelizer(this, this.onCustomAction);
            } else {
                this.onCustomAction.run();
            }
        }
    }

    private boolean RemoteActionCompatParcelizer(float f, float f2) {
        if (f >= this.onPause || f2 <= BitmapDescriptorFactory.HUE_RED) {
            return f > ((float) (getWidth() - this.onPause)) && f2 < BitmapDescriptorFactory.HUE_RED;
        }
        return true;
    }

    private void IconCompatParcelizer(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            getChildAt(i).setLayerType(z ? this.MediaSessionCompatToken : 0, null);
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1) {
            AudioAttributesImplApi26Parcelizer();
            return false;
        }
        if (action != 0) {
            if (this.onPrepare) {
                return true;
            }
            if (this.onRemoveQueueItem) {
                return false;
            }
        }
        if (action == 0) {
            float x = motionEvent.getX();
            this.onPlayFromUri = x;
            this.onPrepareFromUri = x;
            float y = motionEvent.getY();
            this.onPrepareFromSearch = y;
            this.onRewind = y;
            this.MediaBrowserCompatItemReceiver = motionEvent.getPointerId(0);
            this.onRemoveQueueItem = false;
            this.onPlayFromSearch = true;
            this.r8lambdaKUbBm7ckfqTc9QCgukC86fguu4.computeScrollOffset();
            if (this.ResultReceiver == 2 && Math.abs(this.r8lambdaKUbBm7ckfqTc9QCgukC86fguu4.getFinalX() - this.r8lambdaKUbBm7ckfqTc9QCgukC86fguu4.getCurrX()) > this.MediaMetadataCompat) {
                this.r8lambdaKUbBm7ckfqTc9QCgukC86fguu4.abortAnimation();
                this.MediaSessionCompatResultReceiverWrapper = false;
                IconCompatParcelizer();
                this.onPrepare = true;
                MediaBrowserCompatCustomActionResultReceiver();
                IconCompatParcelizer(1);
            } else {
                write(false);
                this.onPrepare = false;
            }
        } else if (action == 2) {
            int i = this.MediaBrowserCompatItemReceiver;
            if (i != -1) {
                int iFindPointerIndex = motionEvent.findPointerIndex(i);
                float x2 = motionEvent.getX(iFindPointerIndex);
                float f = x2 - this.onPrepareFromUri;
                float fAbs = Math.abs(f);
                float y2 = motionEvent.getY(iFindPointerIndex);
                float fAbs2 = Math.abs(y2 - this.onPrepareFromSearch);
                if (f != BitmapDescriptorFactory.HUE_RED && !RemoteActionCompatParcelizer(this.onPrepareFromUri, f) && IconCompatParcelizer(this, false, (int) f, (int) x2, (int) y2)) {
                    this.onPrepareFromUri = x2;
                    this.onRewind = y2;
                    this.onRemoveQueueItem = true;
                    return false;
                }
                float f2 = this.r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8;
                if (fAbs > f2 && fAbs * 0.5f > fAbs2) {
                    this.onPrepare = true;
                    MediaBrowserCompatCustomActionResultReceiver();
                    IconCompatParcelizer(1);
                    float f3 = this.onPlayFromUri;
                    float f4 = this.r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8;
                    this.onPrepareFromUri = f > BitmapDescriptorFactory.HUE_RED ? f3 + f4 : f3 - f4;
                    this.onRewind = y2;
                    AudioAttributesCompatParcelizer(true);
                } else if (fAbs2 > f2) {
                    this.onRemoveQueueItem = true;
                }
                if (this.onPrepare && read(x2)) {
                    InvalidTypeIdException.onRemoveQueueItem(this);
                }
            }
        } else if (action == 6) {
            IconCompatParcelizer(motionEvent);
        }
        if (this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 == null) {
            this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = VelocityTracker.obtain();
        }
        this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28.addMovement(motionEvent);
        return this.onPrepare;
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0130  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r8) {
        /*
            Method dump skipped, instruction units count: 342
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onTouchEvent(android.view.MotionEvent):boolean");
    }

    private boolean AudioAttributesImplApi26Parcelizer() {
        this.MediaBrowserCompatItemReceiver = -1;
        AudioAttributesCompatParcelizer();
        this.onSetPlaybackSpeed.onRelease();
        this.PlaybackStateCompatCustomAction.onRelease();
        return this.onSetPlaybackSpeed.isFinished() || this.PlaybackStateCompatCustomAction.isFinished();
    }

    private void MediaBrowserCompatCustomActionResultReceiver() {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
    }

    private boolean read(float f) {
        boolean z;
        boolean z2;
        float f2 = this.onPrepareFromUri;
        this.onPrepareFromUri = f;
        float scrollX = getScrollX() + (f2 - f);
        float fAudioAttributesImplApi21Parcelizer = AudioAttributesImplApi21Parcelizer();
        float f3 = this.onMediaButtonEvent * fAudioAttributesImplApi21Parcelizer;
        float f4 = this.onRemoveQueueItemAt * fAudioAttributesImplApi21Parcelizer;
        boolean z3 = false;
        AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = this.onSeekTo.get(0);
        ArrayList<AudioAttributesCompatParcelizer> arrayList = this.onSeekTo;
        AudioAttributesCompatParcelizer audioAttributesCompatParcelizer2 = arrayList.get(arrayList.size() - 1);
        if (audioAttributesCompatParcelizer.read != 0) {
            f3 = audioAttributesCompatParcelizer.RemoteActionCompatParcelizer * fAudioAttributesImplApi21Parcelizer;
            z = false;
        } else {
            z = true;
        }
        if (audioAttributesCompatParcelizer2.read != this.IconCompatParcelizer.AudioAttributesCompatParcelizer() - 1) {
            f4 = audioAttributesCompatParcelizer2.RemoteActionCompatParcelizer * fAudioAttributesImplApi21Parcelizer;
            z2 = false;
        } else {
            z2 = true;
        }
        if (scrollX < f3) {
            if (z) {
                this.onSetPlaybackSpeed.onPull(Math.abs(f3 - scrollX) / fAudioAttributesImplApi21Parcelizer);
                z3 = true;
            }
            scrollX = f3;
        } else if (scrollX > f4) {
            if (z2) {
                this.PlaybackStateCompatCustomAction.onPull(Math.abs(scrollX - f4) / fAudioAttributesImplApi21Parcelizer);
                z3 = true;
            }
            scrollX = f4;
        }
        int i = (int) scrollX;
        this.onPrepareFromUri += scrollX - i;
        scrollTo(i, getScrollY());
        read(i);
        return z3;
    }

    private AudioAttributesCompatParcelizer MediaBrowserCompatItemReceiver() {
        int i;
        int iAudioAttributesImplApi21Parcelizer = AudioAttributesImplApi21Parcelizer();
        float f = BitmapDescriptorFactory.HUE_RED;
        float scrollX = iAudioAttributesImplApi21Parcelizer > 0 ? getScrollX() / iAudioAttributesImplApi21Parcelizer : 0.0f;
        float f2 = iAudioAttributesImplApi21Parcelizer > 0 ? this.onSkipToNext / iAudioAttributesImplApi21Parcelizer : 0.0f;
        int i2 = 0;
        boolean z = true;
        int i3 = -1;
        AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = null;
        float f3 = 0.0f;
        while (i2 < this.onSeekTo.size()) {
            AudioAttributesCompatParcelizer audioAttributesCompatParcelizer2 = this.onSeekTo.get(i2);
            if (!z && audioAttributesCompatParcelizer2.read != (i = i3 + 1)) {
                audioAttributesCompatParcelizer2 = this._init_lambda2;
                audioAttributesCompatParcelizer2.RemoteActionCompatParcelizer = f + f3 + f2;
                audioAttributesCompatParcelizer2.read = i;
                int i4 = audioAttributesCompatParcelizer2.read;
                audioAttributesCompatParcelizer2.AudioAttributesCompatParcelizer = getComponentEnabledSetting.IconCompatParcelizer();
                i2--;
            }
            AudioAttributesCompatParcelizer audioAttributesCompatParcelizer3 = audioAttributesCompatParcelizer2;
            f = audioAttributesCompatParcelizer3.RemoteActionCompatParcelizer;
            float f4 = audioAttributesCompatParcelizer3.AudioAttributesCompatParcelizer;
            if (!z && scrollX < f) {
                break;
            }
            if (scrollX < f4 + f + f2 || i2 == this.onSeekTo.size() - 1) {
                return audioAttributesCompatParcelizer3;
            }
            i3 = audioAttributesCompatParcelizer3.read;
            i2++;
            z = false;
            audioAttributesCompatParcelizer = audioAttributesCompatParcelizer3;
            f3 = audioAttributesCompatParcelizer3.AudioAttributesCompatParcelizer;
        }
        return audioAttributesCompatParcelizer;
    }

    private int IconCompatParcelizer(int i, float f, int i2, int i3) {
        if (Math.abs(i3) <= this.onPlay || Math.abs(i2) <= this.onSetRepeatMode) {
            i += (int) (f + (i >= this.AudioAttributesCompatParcelizer ? 0.4f : 0.6f));
        } else if (i2 <= 0) {
            i++;
        }
        if (this.onSeekTo.size() <= 0) {
            return i;
        }
        return Math.max(this.onSeekTo.get(0).read, Math.min(i, this.onSeekTo.get(r1.size() - 1).read));
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        boolean zDraw;
        getComponentEnabledSetting getcomponentenabledsetting;
        super.draw(canvas);
        int overScrollMode = getOverScrollMode();
        if (overScrollMode == 0 || (overScrollMode == 1 && (getcomponentenabledsetting = this.IconCompatParcelizer) != null && getcomponentenabledsetting.AudioAttributesCompatParcelizer() > 1)) {
            if (this.onSetPlaybackSpeed.isFinished()) {
                zDraw = false;
            } else {
                int iSave = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate((-height) + getPaddingTop(), this.onMediaButtonEvent * width);
                this.onSetPlaybackSpeed.setSize(height, width);
                zDraw = this.onSetPlaybackSpeed.draw(canvas);
                canvas.restoreToCount(iSave);
            }
            if (!this.PlaybackStateCompatCustomAction.isFinished()) {
                int iSave2 = canvas.save();
                int width2 = getWidth();
                int height2 = getHeight();
                int paddingTop = getPaddingTop();
                int paddingBottom = getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate(-getPaddingTop(), (-(this.onRemoveQueueItemAt + 1.0f)) * width2);
                this.PlaybackStateCompatCustomAction.setSize((height2 - paddingTop) - paddingBottom, width2);
                zDraw |= this.PlaybackStateCompatCustomAction.draw(canvas);
                canvas.restoreToCount(iSave2);
            }
            if (zDraw) {
                InvalidTypeIdException.onRemoveQueueItem(this);
                return;
            }
            return;
        }
        this.onSetPlaybackSpeed.finish();
        this.PlaybackStateCompatCustomAction.finish();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        float f;
        float f2;
        float f3;
        super.onDraw(canvas);
        if (this.onSkipToNext <= 0 || this.onSetShuffleMode == null || this.onSeekTo.size() <= 0 || this.IconCompatParcelizer == null) {
            return;
        }
        int scrollX = getScrollX();
        float width = getWidth();
        float f4 = this.onSkipToNext / width;
        int i = 0;
        AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = this.onSeekTo.get(0);
        float f5 = audioAttributesCompatParcelizer.RemoteActionCompatParcelizer;
        int size = this.onSeekTo.size();
        int i2 = audioAttributesCompatParcelizer.read;
        int i3 = this.onSeekTo.get(size - 1).read;
        while (i2 < i3) {
            while (i2 > audioAttributesCompatParcelizer.read && i < size) {
                i++;
                audioAttributesCompatParcelizer = this.onSeekTo.get(i);
            }
            if (i2 == audioAttributesCompatParcelizer.read) {
                f = (audioAttributesCompatParcelizer.RemoteActionCompatParcelizer + audioAttributesCompatParcelizer.AudioAttributesCompatParcelizer) * width;
                f2 = audioAttributesCompatParcelizer.RemoteActionCompatParcelizer + audioAttributesCompatParcelizer.AudioAttributesCompatParcelizer + f4;
            } else {
                float f6 = f4 + 1.0f + f5;
                f = (f5 + 1.0f) * width;
                f2 = f6;
            }
            if (this.onSkipToNext + f > scrollX) {
                f3 = f4;
                this.onSetShuffleMode.setBounds(Math.round(f), this._init_lambda3, Math.round(this.onSkipToNext + f), this.AudioAttributesImplApi21Parcelizer);
                this.onSetShuffleMode.draw(canvas);
            } else {
                f3 = f4;
            }
            if (f > scrollX + r2) {
                return;
            }
            i2++;
            f5 = f2;
            f4 = f3;
        }
    }

    private void IconCompatParcelizer(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.MediaBrowserCompatItemReceiver) {
            int i = actionIndex == 0 ? 1 : 0;
            this.onPrepareFromUri = motionEvent.getX(i);
            this.MediaBrowserCompatItemReceiver = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    private void AudioAttributesCompatParcelizer() {
        this.onPrepare = false;
        this.onRemoveQueueItem = false;
        VelocityTracker velocityTracker = this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = null;
        }
    }

    private void AudioAttributesCompatParcelizer(boolean z) {
        if (this.r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw != z) {
            this.r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw = z;
        }
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i) {
        if (this.IconCompatParcelizer == null) {
            return false;
        }
        int iAudioAttributesImplApi21Parcelizer = AudioAttributesImplApi21Parcelizer();
        int scrollX = getScrollX();
        return i < 0 ? scrollX > ((int) (((float) iAudioAttributesImplApi21Parcelizer) * this.onMediaButtonEvent)) : i > 0 && scrollX < ((int) (((float) iAudioAttributesImplApi21Parcelizer) * this.onRemoveQueueItemAt));
    }

    private boolean IconCompatParcelizer(View view, boolean z, int i, int i2, int i3) {
        int i4;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i5 = i2 + scrollX;
                if (i5 >= childAt.getLeft() && i5 < childAt.getRight() && (i4 = i3 + scrollY) >= childAt.getTop() && i4 < childAt.getBottom()) {
                    if (IconCompatParcelizer(childAt, true, i, i5 - childAt.getLeft(), i4 - childAt.getTop())) {
                        return true;
                    }
                }
            }
        }
        return z && view.canScrollHorizontally(-i);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || IconCompatParcelizer(keyEvent);
    }

    private boolean IconCompatParcelizer(KeyEvent keyEvent) {
        if (keyEvent.getAction() != 0) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 21) {
            if (keyEvent.hasModifiers(2)) {
                return MediaDescriptionCompat();
            }
            return write(17);
        }
        if (keyCode == 22) {
            if (keyEvent.hasModifiers(2)) {
                return MediaBrowserCompatMediaItem();
            }
            return write(66);
        }
        if (keyCode != 61) {
            return false;
        }
        if (keyEvent.hasNoModifiers()) {
            return write(2);
        }
        if (keyEvent.hasModifiers(1)) {
            return write(1);
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean write(int r5) {
        /*
            r4 = this;
            android.view.View r0 = r4.findFocus()
            if (r0 != r4) goto L7
            goto L40
        L7:
            if (r0 == 0) goto L41
            android.view.ViewParent r1 = r0.getParent()
        Ld:
            boolean r2 = r1 instanceof android.view.ViewGroup
            if (r2 == 0) goto L19
            if (r1 != r4) goto L14
            goto L41
        L14:
            android.view.ViewParent r1 = r1.getParent()
            goto Ld
        L19:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.Class r2 = r0.getClass()
            java.lang.String r2 = r2.getSimpleName()
            r1.append(r2)
            android.view.ViewParent r0 = r0.getParent()
        L2d:
            boolean r2 = r0 instanceof android.view.ViewGroup
            if (r2 == 0) goto L3d
            java.lang.Class r2 = r0.getClass()
            r2.getSimpleName()
            android.view.ViewParent r0 = r0.getParent()
            goto L2d
        L3d:
            r1.toString()
        L40:
            r0 = 0
        L41:
            android.view.FocusFinder r1 = android.view.FocusFinder.getInstance()
            android.view.View r1 = r1.findNextFocus(r4, r0, r5)
            r2 = 66
            r3 = 17
            if (r1 == 0) goto L8c
            if (r1 == r0) goto L8c
            if (r5 != r3) goto L6c
            android.graphics.Rect r2 = r4.r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0
            android.graphics.Rect r2 = r4.read(r2, r1)
            int r2 = r2.left
            android.graphics.Rect r3 = r4.r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0
            android.graphics.Rect r3 = r4.read(r3, r0)
            int r3 = r3.left
            if (r0 == 0) goto L67
            if (r2 >= r3) goto L9d
        L67:
            boolean r0 = r1.requestFocus()
            goto La1
        L6c:
            if (r5 != r2) goto L96
            android.graphics.Rect r2 = r4.r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0
            android.graphics.Rect r2 = r4.read(r2, r1)
            int r2 = r2.left
            android.graphics.Rect r3 = r4.r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0
            android.graphics.Rect r3 = r4.read(r3, r0)
            int r3 = r3.left
            if (r0 == 0) goto L87
            if (r2 > r3) goto L87
            boolean r0 = r4.MediaBrowserCompatMediaItem()
            goto La1
        L87:
            boolean r0 = r1.requestFocus()
            goto La1
        L8c:
            if (r5 == r3) goto L9d
            r0 = 1
            if (r5 == r0) goto L9d
            if (r5 == r2) goto L98
            r0 = 2
            if (r5 == r0) goto L98
        L96:
            r0 = 0
            goto La1
        L98:
            boolean r0 = r4.MediaBrowserCompatMediaItem()
            goto La1
        L9d:
            boolean r0 = r4.MediaDescriptionCompat()
        La1:
            if (r0 == 0) goto Laa
            int r5 = android.view.SoundEffectConstants.getContantForFocusDirection(r5)
            r4.playSoundEffect(r5)
        Laa:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.write(int):boolean");
    }

    private Rect read(Rect rect, View view) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        ViewParent parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = (ViewGroup) parent;
            rect.left += viewGroup.getLeft();
            rect.right += viewGroup.getRight();
            rect.top += viewGroup.getTop();
            rect.bottom += viewGroup.getBottom();
            parent = viewGroup.getParent();
        }
        return rect;
    }

    private boolean MediaDescriptionCompat() {
        int i = this.AudioAttributesCompatParcelizer;
        if (i <= 0) {
            return false;
        }
        setCurrentItem(i - 1, true);
        return true;
    }

    private boolean MediaBrowserCompatMediaItem() {
        getComponentEnabledSetting getcomponentenabledsetting = this.IconCompatParcelizer;
        if (getcomponentenabledsetting == null || this.AudioAttributesCompatParcelizer >= getcomponentenabledsetting.AudioAttributesCompatParcelizer() - 1) {
            return false;
        }
        setCurrentItem(this.AudioAttributesCompatParcelizer + 1, true);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        AudioAttributesCompatParcelizer AudioAttributesCompatParcelizer2;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getVisibility() == 0 && (AudioAttributesCompatParcelizer2 = AudioAttributesCompatParcelizer(childAt)) != null && AudioAttributesCompatParcelizer2.read == this.AudioAttributesCompatParcelizer) {
                    childAt.addFocusables(arrayList, i, i2);
                }
            }
        }
        if ((descendantFocusability != 262144 || size == arrayList.size()) && isFocusable()) {
            if (((i2 & 1) == 1 && isInTouchMode() && !isFocusableInTouchMode()) || arrayList == null) {
                return;
            }
            arrayList.add(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addTouchables(ArrayList<View> arrayList) {
        AudioAttributesCompatParcelizer AudioAttributesCompatParcelizer2;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (AudioAttributesCompatParcelizer2 = AudioAttributesCompatParcelizer(childAt)) != null && AudioAttributesCompatParcelizer2.read == this.AudioAttributesCompatParcelizer) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    @Override // android.view.ViewGroup
    protected boolean onRequestFocusInDescendants(int i, Rect rect) {
        int i2;
        int i3;
        int i4;
        AudioAttributesCompatParcelizer AudioAttributesCompatParcelizer2;
        int childCount = getChildCount();
        if ((i & 2) != 0) {
            i3 = childCount;
            i2 = 0;
            i4 = 1;
        } else {
            i2 = childCount - 1;
            i3 = -1;
            i4 = -1;
        }
        while (i2 != i3) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() == 0 && (AudioAttributesCompatParcelizer2 = AudioAttributesCompatParcelizer(childAt)) != null && AudioAttributesCompatParcelizer2.read == this.AudioAttributesCompatParcelizer && childAt.requestFocus(i, rect)) {
                return true;
            }
            i2 += i4;
        }
        return false;
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        AudioAttributesCompatParcelizer AudioAttributesCompatParcelizer2;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (AudioAttributesCompatParcelizer2 = AudioAttributesCompatParcelizer(childAt)) != null && AudioAttributesCompatParcelizer2.read == this.AudioAttributesCompatParcelizer && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams();
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof LayoutParams) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    /* JADX INFO: loaded from: classes4.dex */
    class read extends deserializeUsingCustom {
        read() {
        }

        @Override // kotlin.deserializeUsingCustom
        public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            accessibilityEvent.setClassName(ViewPager.class.getName());
            accessibilityEvent.setScrollable(read());
            if (accessibilityEvent.getEventType() != 4096 || ViewPager.this.IconCompatParcelizer == null) {
                return;
            }
            accessibilityEvent.setItemCount(ViewPager.this.IconCompatParcelizer.AudioAttributesCompatParcelizer());
            accessibilityEvent.setFromIndex(ViewPager.this.AudioAttributesCompatParcelizer);
            accessibilityEvent.setToIndex(ViewPager.this.AudioAttributesCompatParcelizer);
        }

        @Override // kotlin.deserializeUsingCustom
        public final void onInitializeAccessibilityNodeInfo(View view, hasSuperClassStartingWith hassuperclassstartingwith) {
            super.onInitializeAccessibilityNodeInfo(view, hassuperclassstartingwith);
            hassuperclassstartingwith.AudioAttributesCompatParcelizer((CharSequence) ViewPager.class.getName());
            hassuperclassstartingwith.handleMediaPlayPauseIfPendingOnHandler(read());
            if (ViewPager.this.canScrollHorizontally(1)) {
                hassuperclassstartingwith.AudioAttributesCompatParcelizer(4096);
            }
            if (ViewPager.this.canScrollHorizontally(-1)) {
                hassuperclassstartingwith.AudioAttributesCompatParcelizer(8192);
            }
        }

        @Override // kotlin.deserializeUsingCustom
        public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
            if (super.performAccessibilityAction(view, i, bundle)) {
                return true;
            }
            if (i == 4096) {
                if (!ViewPager.this.canScrollHorizontally(1)) {
                    return false;
                }
                ViewPager viewPager = ViewPager.this;
                viewPager.setCurrentItem(viewPager.AudioAttributesCompatParcelizer + 1);
                return true;
            }
            if (i != 8192 || !ViewPager.this.canScrollHorizontally(-1)) {
                return false;
            }
            ViewPager viewPager2 = ViewPager.this;
            viewPager2.setCurrentItem(viewPager2.AudioAttributesCompatParcelizer - 1);
            return true;
        }

        private boolean read() {
            return ViewPager.this.IconCompatParcelizer != null && ViewPager.this.IconCompatParcelizer.AudioAttributesCompatParcelizer() > 1;
        }
    }

    class AudioAttributesImplApi21Parcelizer extends DataSetObserver {
        AudioAttributesImplApi21Parcelizer() {
        }

        @Override // android.database.DataSetObserver
        public final void onChanged() {
            ViewPager.this.RemoteActionCompatParcelizer();
        }

        @Override // android.database.DataSetObserver
        public final void onInvalidated() {
            ViewPager.this.RemoteActionCompatParcelizer();
        }
    }

    public static class LayoutParams extends ViewGroup.LayoutParams {
        int AudioAttributesCompatParcelizer;
        float AudioAttributesImplApi21Parcelizer;
        int IconCompatParcelizer;
        public int RemoteActionCompatParcelizer;
        public boolean read;
        boolean write;

        public LayoutParams() {
            super(-1, -1);
            this.AudioAttributesImplApi21Parcelizer = BitmapDescriptorFactory.HUE_RED;
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.AudioAttributesImplApi21Parcelizer = BitmapDescriptorFactory.HUE_RED;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ViewPager.read);
            this.RemoteActionCompatParcelizer = typedArrayObtainStyledAttributes.getInteger(0, 48);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    static class MediaBrowserCompatCustomActionResultReceiver implements Comparator<View> {
        MediaBrowserCompatCustomActionResultReceiver() {
        }

        @Override // java.util.Comparator
        public final /* synthetic */ int compare(View view, View view2) {
            return read(view, view2);
        }

        private static int read(View view, View view2) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            LayoutParams layoutParams2 = (LayoutParams) view2.getLayoutParams();
            if (layoutParams.read != layoutParams2.read) {
                return layoutParams.read ? 1 : -1;
            }
            return layoutParams.IconCompatParcelizer - layoutParams2.IconCompatParcelizer;
        }
    }
}
