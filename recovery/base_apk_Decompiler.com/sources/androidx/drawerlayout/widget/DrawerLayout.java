package androidx.drawerlayout.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.view.WindowInsetsCompat;
import androidx.customview.view.AbsSavedState;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.List;
import kotlin.InvalidTypeIdException;
import kotlin._clearIfStdImpl;
import kotlin._emptyAnnotationMap;
import kotlin._isNaN;
import kotlin._verifyEndArrayForSingle;
import kotlin.call;
import kotlin.deserializeUsingCustom;
import kotlin.findFormatOverrides;
import kotlin.hasSuperClassStartingWith;
import kotlin.modifyFieldName;

/* JADX INFO: loaded from: classes.dex */
public class DrawerLayout extends ViewGroup {
    private Matrix AudioAttributesImplApi21Parcelizer;
    private final write AudioAttributesImplApi26Parcelizer;
    private boolean AudioAttributesImplBaseParcelizer;
    private final modifyFieldName MediaBrowserCompatCustomActionResultReceiver;
    private Rect MediaBrowserCompatItemReceiver;
    private boolean MediaBrowserCompatMediaItem;
    private boolean MediaBrowserCompatSearchResultReceiver;
    private final read MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    private int MediaDescriptionCompat;
    private float MediaMetadataCompat;
    private boolean RatingCompat;
    private float handleMediaPlayPauseIfPendingOnHandler;
    private float onAddQueueItem;
    private final call onCommand;
    private Object onCustomAction;
    private List<RemoteActionCompatParcelizer> onFastForward;
    private int onMediaButtonEvent;
    private RemoteActionCompatParcelizer onPause;
    private int onPlay;
    private int onPlayFromMediaId;
    private int onPlayFromSearch;
    private final read onPlayFromUri;
    private final call onPrepare;
    private int onPrepareFromMediaId;
    private final ArrayList<View> onPrepareFromSearch;
    private Drawable onPrepareFromUri;
    private Paint onRemoveQueueItem;
    private int onRemoveQueueItemAt;
    private float onRewind;
    private Drawable onSeekTo;
    private Drawable onSetCaptioningEnabled;
    private Drawable onSetPlaybackSpeed;
    private Drawable onSetRating;
    private Drawable onSetRepeatMode;
    private Drawable onSetShuffleMode;
    private CharSequence onSkipToQueueItem;
    private CharSequence onStop;
    private static final int[] IconCompatParcelizer = {R.attr.colorPrimaryDark};
    static final int[] AudioAttributesCompatParcelizer = {R.attr.layout_gravity};
    static final boolean RemoteActionCompatParcelizer = true;
    private static final boolean write = true;
    private static boolean read = true;

    /* JADX INFO: loaded from: classes4.dex */
    public static abstract class AudioAttributesCompatParcelizer implements RemoteActionCompatParcelizer {
        @Override // androidx.drawerlayout.widget.DrawerLayout.RemoteActionCompatParcelizer
        public void AudioAttributesCompatParcelizer(View view) {
        }

        @Override // androidx.drawerlayout.widget.DrawerLayout.RemoteActionCompatParcelizer
        public final void IconCompatParcelizer(View view) {
        }

        @Override // androidx.drawerlayout.widget.DrawerLayout.RemoteActionCompatParcelizer
        public void RemoteActionCompatParcelizer(View view) {
        }
    }

    public interface RemoteActionCompatParcelizer {
        void AudioAttributesCompatParcelizer(View view);

        void IconCompatParcelizer(View view);

        void RemoteActionCompatParcelizer(View view);
    }

    public DrawerLayout(Context context) {
        this(context, null);
    }

    public DrawerLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, _emptyAnnotationMap.IconCompatParcelizer.drawerLayoutStyle);
    }

    public DrawerLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.AudioAttributesImplApi26Parcelizer = new write();
        this.onRemoveQueueItemAt = -1728053248;
        this.onRemoveQueueItem = new Paint();
        this.MediaBrowserCompatSearchResultReceiver = true;
        this.onPlay = 3;
        this.onMediaButtonEvent = 3;
        this.onPlayFromSearch = 3;
        this.onPlayFromMediaId = 3;
        this.onSetRepeatMode = null;
        this.onSeekTo = null;
        this.onPrepareFromUri = null;
        this.onSetCaptioningEnabled = null;
        this.MediaBrowserCompatCustomActionResultReceiver = new modifyFieldName() { // from class: androidx.drawerlayout.widget.DrawerLayout.3
            @Override // kotlin.modifyFieldName
            public final boolean read(View view) {
                if (!DrawerLayout.AudioAttributesImplBaseParcelizer(view) || DrawerLayout.this.RemoteActionCompatParcelizer(view) == 2) {
                    return false;
                }
                DrawerLayout.this.read(view);
                return true;
            }
        };
        setDescendantFocusability(262144);
        float f = getResources().getDisplayMetrics().density;
        this.onPrepareFromMediaId = (int) ((64.0f * f) + 0.5f);
        float f2 = f * 400.0f;
        read readVar = new read(3);
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = readVar;
        read readVar2 = new read(5);
        this.onPlayFromUri = readVar2;
        call callVarAudioAttributesCompatParcelizer = call.AudioAttributesCompatParcelizer(this, 1.0f, readVar);
        this.onCommand = callVarAudioAttributesCompatParcelizer;
        callVarAudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(1);
        callVarAudioAttributesCompatParcelizer.write(f2);
        readVar.read(callVarAudioAttributesCompatParcelizer);
        call callVarAudioAttributesCompatParcelizer2 = call.AudioAttributesCompatParcelizer(this, 1.0f, readVar2);
        this.onPrepare = callVarAudioAttributesCompatParcelizer2;
        callVarAudioAttributesCompatParcelizer2.RemoteActionCompatParcelizer(2);
        callVarAudioAttributesCompatParcelizer2.write(f2);
        readVar2.read(callVarAudioAttributesCompatParcelizer2);
        setFocusableInTouchMode(true);
        InvalidTypeIdException.AudioAttributesImplBaseParcelizer(this, 1);
        InvalidTypeIdException.AudioAttributesCompatParcelizer(this, new IconCompatParcelizer());
        setMotionEventSplittingEnabled(false);
        if (InvalidTypeIdException.MediaBrowserCompatCustomActionResultReceiver(this)) {
            setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: androidx.drawerlayout.widget.DrawerLayout.1
                @Override // android.view.View.OnApplyWindowInsetsListener
                public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                    ((DrawerLayout) view).setChildInsets(windowInsets, windowInsets.getSystemWindowInsetTop() > 0);
                    return windowInsets.consumeSystemWindowInsets();
                }
            });
            setSystemUiVisibility(1280);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(IconCompatParcelizer);
            try {
                this.onSetRating = typedArrayObtainStyledAttributes.getDrawable(0);
            } finally {
                typedArrayObtainStyledAttributes.recycle();
            }
        }
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, _emptyAnnotationMap.read.DrawerLayout, i, 0);
        try {
            if (typedArrayObtainStyledAttributes2.hasValue(_emptyAnnotationMap.read.DrawerLayout_elevation)) {
                this.MediaMetadataCompat = typedArrayObtainStyledAttributes2.getDimension(_emptyAnnotationMap.read.DrawerLayout_elevation, BitmapDescriptorFactory.HUE_RED);
            } else {
                this.MediaMetadataCompat = getResources().getDimension(_emptyAnnotationMap.write.def_drawer_elevation);
            }
            typedArrayObtainStyledAttributes2.recycle();
            this.onPrepareFromSearch = new ArrayList<>();
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes2.recycle();
            throw th;
        }
    }

    public void setDrawerElevation(float f) {
        this.MediaMetadataCompat = f;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (MediaBrowserCompatItemReceiver(childAt)) {
                InvalidTypeIdException.write(childAt, this.MediaMetadataCompat);
            }
        }
    }

    public void setChildInsets(Object obj, boolean z) {
        this.onCustomAction = obj;
        this.MediaBrowserCompatMediaItem = z;
        setWillNotDraw(!z && getBackground() == null);
        requestLayout();
    }

    public void setDrawerShadow(Drawable drawable, int i) {
        if (write) {
            return;
        }
        if ((i & 8388611) == 8388611) {
            this.onSetRepeatMode = drawable;
        } else if ((i & 8388613) == 8388613) {
            this.onSeekTo = drawable;
        } else if ((i & 3) == 3) {
            this.onPrepareFromUri = drawable;
        } else if ((i & 5) != 5) {
            return;
        } else {
            this.onSetCaptioningEnabled = drawable;
        }
        AudioAttributesImplBaseParcelizer();
        invalidate();
    }

    public void setDrawerShadow(int i, int i2) {
        setDrawerShadow(_isNaN.getDrawable(getContext(), i), i2);
    }

    public void setScrimColor(int i) {
        this.onRemoveQueueItemAt = i;
        invalidate();
    }

    @Deprecated
    public void setDrawerListener(RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        RemoteActionCompatParcelizer remoteActionCompatParcelizer2 = this.onPause;
        if (remoteActionCompatParcelizer2 != null) {
            read(remoteActionCompatParcelizer2);
        }
        if (remoteActionCompatParcelizer != null) {
            IconCompatParcelizer(remoteActionCompatParcelizer);
        }
        this.onPause = remoteActionCompatParcelizer;
    }

    public final void IconCompatParcelizer(RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        if (remoteActionCompatParcelizer == null) {
            return;
        }
        if (this.onFastForward == null) {
            this.onFastForward = new ArrayList();
        }
        this.onFastForward.add(remoteActionCompatParcelizer);
    }

    public final void read(RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        List<RemoteActionCompatParcelizer> list;
        if (remoteActionCompatParcelizer == null || (list = this.onFastForward) == null) {
            return;
        }
        list.remove(remoteActionCompatParcelizer);
    }

    public void setDrawerLockMode(int i) {
        setDrawerLockMode(i, 3);
        setDrawerLockMode(i, 5);
    }

    public void setDrawerLockMode(int i, int i2) {
        View viewIconCompatParcelizer;
        int iWrite = _clearIfStdImpl.write(i2, InvalidTypeIdException.MediaBrowserCompatMediaItem(this));
        if (i2 == 3) {
            this.onPlay = i;
        } else if (i2 == 5) {
            this.onMediaButtonEvent = i;
        } else if (i2 == 8388611) {
            this.onPlayFromSearch = i;
        } else if (i2 == 8388613) {
            this.onPlayFromMediaId = i;
        }
        if (i != 0) {
            (iWrite == 3 ? this.onCommand : this.onPrepare).write();
        }
        if (i != 1) {
            if (i != 2 || (viewIconCompatParcelizer = IconCompatParcelizer(iWrite)) == null) {
                return;
            }
            MediaDescriptionCompat(viewIconCompatParcelizer);
            return;
        }
        View viewIconCompatParcelizer2 = IconCompatParcelizer(iWrite);
        if (viewIconCompatParcelizer2 != null) {
            read(viewIconCompatParcelizer2);
        }
    }

    public void setDrawerLockMode(int i, View view) {
        if (!MediaBrowserCompatItemReceiver(view)) {
            StringBuilder sb = new StringBuilder("View ");
            sb.append(view);
            sb.append(" is not a drawer with appropriate layout_gravity");
            throw new IllegalArgumentException(sb.toString());
        }
        setDrawerLockMode(i, ((LayoutParams) view.getLayoutParams()).IconCompatParcelizer);
    }

    private int RemoteActionCompatParcelizer(int i) {
        int iMediaBrowserCompatMediaItem = InvalidTypeIdException.MediaBrowserCompatMediaItem(this);
        if (i == 3) {
            int i2 = this.onPlay;
            if (i2 != 3) {
                return i2;
            }
            int i3 = iMediaBrowserCompatMediaItem == 0 ? this.onPlayFromSearch : this.onPlayFromMediaId;
            if (i3 != 3) {
                return i3;
            }
            return 0;
        }
        if (i == 5) {
            int i4 = this.onMediaButtonEvent;
            if (i4 != 3) {
                return i4;
            }
            int i5 = iMediaBrowserCompatMediaItem == 0 ? this.onPlayFromMediaId : this.onPlayFromSearch;
            if (i5 != 3) {
                return i5;
            }
            return 0;
        }
        if (i == 8388611) {
            int i6 = this.onPlayFromSearch;
            if (i6 != 3) {
                return i6;
            }
            int i7 = iMediaBrowserCompatMediaItem == 0 ? this.onPlay : this.onMediaButtonEvent;
            if (i7 != 3) {
                return i7;
            }
            return 0;
        }
        if (i != 8388613) {
            return 0;
        }
        int i8 = this.onPlayFromMediaId;
        if (i8 != 3) {
            return i8;
        }
        int i9 = iMediaBrowserCompatMediaItem == 0 ? this.onMediaButtonEvent : this.onPlay;
        if (i9 != 3) {
            return i9;
        }
        return 0;
    }

    public final int RemoteActionCompatParcelizer(View view) {
        if (!MediaBrowserCompatItemReceiver(view)) {
            StringBuilder sb = new StringBuilder("View ");
            sb.append(view);
            sb.append(" is not a drawer");
            throw new IllegalArgumentException(sb.toString());
        }
        return RemoteActionCompatParcelizer(((LayoutParams) view.getLayoutParams()).IconCompatParcelizer);
    }

    public void setDrawerTitle(int i, CharSequence charSequence) {
        int iWrite = _clearIfStdImpl.write(i, InvalidTypeIdException.MediaBrowserCompatMediaItem(this));
        if (iWrite == 3) {
            this.onSkipToQueueItem = charSequence;
        } else if (iWrite == 5) {
            this.onStop = charSequence;
        }
    }

    public final CharSequence read(int i) {
        int iWrite = _clearIfStdImpl.write(i, InvalidTypeIdException.MediaBrowserCompatMediaItem(this));
        if (iWrite == 3) {
            return this.onSkipToQueueItem;
        }
        if (iWrite == 5) {
            return this.onStop;
        }
        return null;
    }

    private boolean AudioAttributesCompatParcelizer(float f, float f2, View view) {
        if (this.MediaBrowserCompatItemReceiver == null) {
            this.MediaBrowserCompatItemReceiver = new Rect();
        }
        view.getHitRect(this.MediaBrowserCompatItemReceiver);
        return this.MediaBrowserCompatItemReceiver.contains((int) f, (int) f2);
    }

    private boolean write(MotionEvent motionEvent, View view) {
        if (!view.getMatrix().isIdentity()) {
            MotionEvent motionEventAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(motionEvent, view);
            boolean zDispatchGenericMotionEvent = view.dispatchGenericMotionEvent(motionEventAudioAttributesCompatParcelizer);
            motionEventAudioAttributesCompatParcelizer.recycle();
            return zDispatchGenericMotionEvent;
        }
        float scrollX = getScrollX() - view.getLeft();
        float scrollY = getScrollY() - view.getTop();
        motionEvent.offsetLocation(scrollX, scrollY);
        boolean zDispatchGenericMotionEvent2 = view.dispatchGenericMotionEvent(motionEvent);
        motionEvent.offsetLocation(-scrollX, -scrollY);
        return zDispatchGenericMotionEvent2;
    }

    private MotionEvent AudioAttributesCompatParcelizer(MotionEvent motionEvent, View view) {
        float scrollX = getScrollX() - view.getLeft();
        float scrollY = getScrollY() - view.getTop();
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        motionEventObtain.offsetLocation(scrollX, scrollY);
        Matrix matrix = view.getMatrix();
        if (!matrix.isIdentity()) {
            if (this.AudioAttributesImplApi21Parcelizer == null) {
                this.AudioAttributesImplApi21Parcelizer = new Matrix();
            }
            matrix.invert(this.AudioAttributesImplApi21Parcelizer);
            motionEventObtain.transform(this.AudioAttributesImplApi21Parcelizer);
        }
        return motionEventObtain;
    }

    final void read(int i, View view) {
        int i2;
        int iMediaBrowserCompatItemReceiver = this.onCommand.MediaBrowserCompatItemReceiver();
        int iMediaBrowserCompatItemReceiver2 = this.onPrepare.MediaBrowserCompatItemReceiver();
        if (iMediaBrowserCompatItemReceiver == 1 || iMediaBrowserCompatItemReceiver2 == 1) {
            i2 = 1;
        } else {
            i2 = 2;
            if (iMediaBrowserCompatItemReceiver != 2 && iMediaBrowserCompatItemReceiver2 != 2) {
                i2 = 0;
            }
        }
        if (view != null && i == 0) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            if (layoutParams.read == BitmapDescriptorFactory.HUE_RED) {
                AudioAttributesImplApi21Parcelizer(view);
            } else if (layoutParams.read == 1.0f) {
                MediaBrowserCompatMediaItem(view);
            }
        }
        if (i2 != this.MediaDescriptionCompat) {
            this.MediaDescriptionCompat = i2;
            List<RemoteActionCompatParcelizer> list = this.onFastForward;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.onFastForward.get(size);
                }
            }
        }
    }

    private void AudioAttributesImplApi21Parcelizer(View view) {
        View rootView;
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if ((layoutParams.write & 1) == 1) {
            layoutParams.write = 0;
            List<RemoteActionCompatParcelizer> list = this.onFastForward;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.onFastForward.get(size).AudioAttributesCompatParcelizer(view);
                }
            }
            RemoteActionCompatParcelizer(view, false);
            MediaBrowserCompatCustomActionResultReceiver(view);
            if (!hasWindowFocus() || (rootView = getRootView()) == null) {
                return;
            }
            rootView.sendAccessibilityEvent(32);
        }
    }

    private void MediaBrowserCompatMediaItem(View view) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if ((layoutParams.write & 1) == 0) {
            layoutParams.write = 1;
            List<RemoteActionCompatParcelizer> list = this.onFastForward;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.onFastForward.get(size).RemoteActionCompatParcelizer(view);
                }
            }
            RemoteActionCompatParcelizer(view, true);
            MediaBrowserCompatCustomActionResultReceiver(view);
            if (hasWindowFocus()) {
                sendAccessibilityEvent(32);
            }
        }
    }

    private void RemoteActionCompatParcelizer(View view, boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if ((!z && !MediaBrowserCompatItemReceiver(childAt)) || (z && childAt == view)) {
                InvalidTypeIdException.AudioAttributesImplBaseParcelizer(childAt, 1);
            } else {
                InvalidTypeIdException.AudioAttributesImplBaseParcelizer(childAt, 4);
            }
        }
    }

    private void MediaBrowserCompatCustomActionResultReceiver(View view) {
        InvalidTypeIdException.RemoteActionCompatParcelizer(view, hasSuperClassStartingWith.read.AudioAttributesImplApi26Parcelizer.RemoteActionCompatParcelizer());
        if (!AudioAttributesImplBaseParcelizer(view) || RemoteActionCompatParcelizer(view) == 2) {
            return;
        }
        InvalidTypeIdException.IconCompatParcelizer(view, hasSuperClassStartingWith.read.AudioAttributesImplApi26Parcelizer, null, this.MediaBrowserCompatCustomActionResultReceiver);
    }

    private void MediaBrowserCompatSearchResultReceiver(View view) {
        List<RemoteActionCompatParcelizer> list = this.onFastForward;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.onFastForward.get(size).IconCompatParcelizer(view);
            }
        }
    }

    final void write(View view, float f) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (f == layoutParams.read) {
            return;
        }
        layoutParams.read = f;
        MediaBrowserCompatSearchResultReceiver(view);
    }

    static float IconCompatParcelizer(View view) {
        return ((LayoutParams) view.getLayoutParams()).read;
    }

    final int AudioAttributesCompatParcelizer(View view) {
        return _clearIfStdImpl.write(((LayoutParams) view.getLayoutParams()).IconCompatParcelizer, InvalidTypeIdException.MediaBrowserCompatMediaItem(this));
    }

    final boolean IconCompatParcelizer(View view, int i) {
        return (AudioAttributesCompatParcelizer(view) & i) == i;
    }

    private View AudioAttributesImplApi21Parcelizer() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if ((((LayoutParams) childAt.getLayoutParams()).write & 1) == 1) {
                return childAt;
            }
        }
        return null;
    }

    private void AudioAttributesCompatParcelizer(View view, float f) {
        float fIconCompatParcelizer = IconCompatParcelizer(view);
        float width = view.getWidth();
        int i = ((int) (width * f)) - ((int) (fIconCompatParcelizer * width));
        if (!IconCompatParcelizer(view, 3)) {
            i = -i;
        }
        view.offsetLeftAndRight(i);
        write(view, f);
    }

    final View IconCompatParcelizer(int i) {
        int iWrite = _clearIfStdImpl.write(i, InvalidTypeIdException.MediaBrowserCompatMediaItem(this));
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if ((AudioAttributesCompatParcelizer(childAt) & 7) == (iWrite & 7)) {
                return childAt;
            }
        }
        return null;
    }

    private static String write(int i) {
        if ((i & 3) == 3) {
            return "LEFT";
        }
        if ((i & 5) == 5) {
            return "RIGHT";
        }
        return Integer.toHexString(i);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.MediaBrowserCompatSearchResultReceiver = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.MediaBrowserCompatSearchResultReceiver = true;
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode != 1073741824 || mode2 != 1073741824) {
            if (!isInEditMode()) {
                throw new IllegalArgumentException("DrawerLayout must be measured with MeasureSpec.EXACTLY.");
            }
            if (mode == 0) {
                size = 300;
            }
            if (mode2 == 0) {
                size2 = 300;
            }
        }
        setMeasuredDimension(size, size2);
        boolean z = this.onCustomAction != null && InvalidTypeIdException.MediaBrowserCompatCustomActionResultReceiver(this);
        int iMediaBrowserCompatMediaItem = InvalidTypeIdException.MediaBrowserCompatMediaItem(this);
        int childCount = getChildCount();
        boolean z2 = false;
        boolean z3 = false;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (z) {
                    int iWrite = _clearIfStdImpl.write(layoutParams.IconCompatParcelizer, iMediaBrowserCompatMediaItem);
                    if (InvalidTypeIdException.MediaBrowserCompatCustomActionResultReceiver(childAt)) {
                        WindowInsets windowInsetsReplaceSystemWindowInsets = (WindowInsets) this.onCustomAction;
                        if (iWrite == 3) {
                            windowInsetsReplaceSystemWindowInsets = windowInsetsReplaceSystemWindowInsets.replaceSystemWindowInsets(windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetLeft(), windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetTop(), 0, windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetBottom());
                        } else if (iWrite == 5) {
                            windowInsetsReplaceSystemWindowInsets = windowInsetsReplaceSystemWindowInsets.replaceSystemWindowInsets(0, windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetTop(), windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetRight(), windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetBottom());
                        }
                        childAt.dispatchApplyWindowInsets(windowInsetsReplaceSystemWindowInsets);
                    } else {
                        WindowInsets windowInsetsReplaceSystemWindowInsets2 = (WindowInsets) this.onCustomAction;
                        if (iWrite == 3) {
                            windowInsetsReplaceSystemWindowInsets2 = windowInsetsReplaceSystemWindowInsets2.replaceSystemWindowInsets(windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetLeft(), windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetTop(), 0, windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetBottom());
                        } else if (iWrite == 5) {
                            windowInsetsReplaceSystemWindowInsets2 = windowInsetsReplaceSystemWindowInsets2.replaceSystemWindowInsets(0, windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetTop(), windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetRight(), windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetBottom());
                        }
                        ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetLeft();
                        ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetTop();
                        ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetRight();
                        ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetBottom();
                    }
                }
                if (MediaMetadataCompat(childAt)) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec((size - ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin) - ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, 1073741824), View.MeasureSpec.makeMeasureSpec((size2 - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin) - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin, 1073741824));
                } else if (MediaBrowserCompatItemReceiver(childAt)) {
                    if (write) {
                        float fAudioAttributesImplBaseParcelizer = InvalidTypeIdException.AudioAttributesImplBaseParcelizer(childAt);
                        float f = this.MediaMetadataCompat;
                        if (fAudioAttributesImplBaseParcelizer != f) {
                            InvalidTypeIdException.write(childAt, f);
                        }
                    }
                    int iAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(childAt) & 7;
                    boolean z4 = iAudioAttributesCompatParcelizer == 3;
                    if ((z4 && z2) || (!z4 && z3)) {
                        StringBuilder sb = new StringBuilder("Child drawer has absolute gravity ");
                        sb.append(write(iAudioAttributesCompatParcelizer));
                        sb.append(" but this DrawerLayout already has a drawer view along that edge");
                        throw new IllegalStateException(sb.toString());
                    }
                    if (z4) {
                        z2 = true;
                    } else {
                        z3 = true;
                    }
                    childAt.measure(getChildMeasureSpec(i, this.onPrepareFromMediaId + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, ((ViewGroup.LayoutParams) layoutParams).width), getChildMeasureSpec(i2, ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin, ((ViewGroup.LayoutParams) layoutParams).height));
                } else {
                    StringBuilder sb2 = new StringBuilder("Child ");
                    sb2.append(childAt);
                    sb2.append(" at index ");
                    sb2.append(i3);
                    sb2.append(" does not have a valid layout_gravity - must be Gravity.LEFT, Gravity.RIGHT or Gravity.NO_GRAVITY");
                    throw new IllegalStateException(sb2.toString());
                }
            }
        }
    }

    private void AudioAttributesImplBaseParcelizer() {
        if (write) {
            return;
        }
        this.onSetShuffleMode = MediaBrowserCompatCustomActionResultReceiver();
        this.onSetPlaybackSpeed = AudioAttributesImplApi26Parcelizer();
    }

    private Drawable MediaBrowserCompatCustomActionResultReceiver() {
        int iMediaBrowserCompatMediaItem = InvalidTypeIdException.MediaBrowserCompatMediaItem(this);
        if (iMediaBrowserCompatMediaItem == 0) {
            Drawable drawable = this.onSetRepeatMode;
            if (drawable != null) {
                read(drawable, iMediaBrowserCompatMediaItem);
                return this.onSetRepeatMode;
            }
        } else {
            Drawable drawable2 = this.onSeekTo;
            if (drawable2 != null) {
                read(drawable2, iMediaBrowserCompatMediaItem);
                return this.onSeekTo;
            }
        }
        return this.onPrepareFromUri;
    }

    private Drawable AudioAttributesImplApi26Parcelizer() {
        int iMediaBrowserCompatMediaItem = InvalidTypeIdException.MediaBrowserCompatMediaItem(this);
        if (iMediaBrowserCompatMediaItem == 0) {
            Drawable drawable = this.onSeekTo;
            if (drawable != null) {
                read(drawable, iMediaBrowserCompatMediaItem);
                return this.onSeekTo;
            }
        } else {
            Drawable drawable2 = this.onSetRepeatMode;
            if (drawable2 != null) {
                read(drawable2, iMediaBrowserCompatMediaItem);
                return this.onSetRepeatMode;
            }
        }
        return this.onSetCaptioningEnabled;
    }

    private static void read(Drawable drawable, int i) {
        if (drawable == null || !findFormatOverrides.MediaBrowserCompatItemReceiver(drawable)) {
            return;
        }
        findFormatOverrides.RemoteActionCompatParcelizer(drawable, i);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        WindowInsets rootWindowInsets;
        float f;
        int i5;
        boolean z2 = true;
        this.RatingCompat = true;
        int i6 = i3 - i;
        int childCount = getChildCount();
        int i7 = 0;
        while (i7 < childCount) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (MediaMetadataCompat(childAt)) {
                    childAt.layout(((ViewGroup.MarginLayoutParams) layoutParams).leftMargin, ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + childAt.getMeasuredWidth(), ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + childAt.getMeasuredHeight());
                } else {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (IconCompatParcelizer(childAt, 3)) {
                        float f2 = measuredWidth;
                        i5 = (-measuredWidth) + ((int) (layoutParams.read * f2));
                        f = (measuredWidth + i5) / f2;
                    } else {
                        float f3 = measuredWidth;
                        f = (i6 - r11) / f3;
                        i5 = i6 - ((int) (layoutParams.read * f3));
                    }
                    boolean z3 = f != layoutParams.read ? z2 : false;
                    int i8 = layoutParams.IconCompatParcelizer & 112;
                    if (i8 == 16) {
                        int i9 = i4 - i2;
                        int i10 = (i9 - measuredHeight) / 2;
                        if (i10 < ((ViewGroup.MarginLayoutParams) layoutParams).topMargin) {
                            i10 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
                        } else if (i10 + measuredHeight > i9 - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin) {
                            i10 = (i9 - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin) - measuredHeight;
                        }
                        childAt.layout(i5, i10, measuredWidth + i5, measuredHeight + i10);
                    } else if (i8 != 80) {
                        childAt.layout(i5, ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, measuredWidth + i5, ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + measuredHeight);
                    } else {
                        int i11 = i4 - i2;
                        childAt.layout(i5, (i11 - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin) - childAt.getMeasuredHeight(), measuredWidth + i5, i11 - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
                    }
                    if (z3) {
                        write(childAt, f);
                    }
                    int i12 = layoutParams.read > BitmapDescriptorFactory.HUE_RED ? 0 : 4;
                    if (childAt.getVisibility() != i12) {
                        childAt.setVisibility(i12);
                    }
                }
            }
            i7++;
            z2 = true;
        }
        if (read && (rootWindowInsets = getRootWindowInsets()) != null) {
            _verifyEndArrayForSingle _verifyendarrayforsingleAudioAttributesImplApi26Parcelizer = WindowInsetsCompat.IconCompatParcelizer(rootWindowInsets).AudioAttributesImplApi26Parcelizer();
            call callVar = this.onCommand;
            callVar.AudioAttributesCompatParcelizer(Math.max(callVar.MediaBrowserCompatCustomActionResultReceiver(), _verifyendarrayforsingleAudioAttributesImplApi26Parcelizer.read));
            call callVar2 = this.onPrepare;
            callVar2.AudioAttributesCompatParcelizer(Math.max(callVar2.MediaBrowserCompatCustomActionResultReceiver(), _verifyendarrayforsingleAudioAttributesImplApi26Parcelizer.IconCompatParcelizer));
        }
        this.RatingCompat = false;
        this.MediaBrowserCompatSearchResultReceiver = false;
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.RatingCompat) {
            return;
        }
        super.requestLayout();
    }

    @Override // android.view.View
    public void computeScroll() {
        int childCount = getChildCount();
        float fMax = BitmapDescriptorFactory.HUE_RED;
        for (int i = 0; i < childCount; i++) {
            fMax = Math.max(fMax, ((LayoutParams) getChildAt(i).getLayoutParams()).read);
        }
        this.onRewind = fMax;
        boolean zIconCompatParcelizer = this.onCommand.IconCompatParcelizer();
        boolean zIconCompatParcelizer2 = this.onPrepare.IconCompatParcelizer();
        if (zIconCompatParcelizer || zIconCompatParcelizer2) {
            InvalidTypeIdException.onRemoveQueueItem(this);
        }
    }

    private static boolean AudioAttributesImplApi26Parcelizer(View view) {
        Drawable background = view.getBackground();
        return background != null && background.getOpacity() == -1;
    }

    public void setStatusBarBackground(Drawable drawable) {
        this.onSetRating = drawable;
        invalidate();
    }

    public void setStatusBarBackground(int i) {
        this.onSetRating = i != 0 ? _isNaN.getDrawable(getContext(), i) : null;
        invalidate();
    }

    public void setStatusBarBackgroundColor(int i) {
        this.onSetRating = new ColorDrawable(i);
        invalidate();
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i) {
        AudioAttributesImplBaseParcelizer();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.MediaBrowserCompatMediaItem || this.onSetRating == null) {
            return;
        }
        Object obj = this.onCustomAction;
        int systemWindowInsetTop = obj != null ? ((WindowInsets) obj).getSystemWindowInsetTop() : 0;
        if (systemWindowInsetTop > 0) {
            this.onSetRating.setBounds(0, 0, getWidth(), systemWindowInsetTop);
            this.onSetRating.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(Canvas canvas, View view, long j) {
        int height = getHeight();
        boolean zMediaMetadataCompat = MediaMetadataCompat(view);
        int width = getWidth();
        int iSave = canvas.save();
        int i = 0;
        if (zMediaMetadataCompat) {
            int childCount = getChildCount();
            int i2 = 0;
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                if (childAt != view && childAt.getVisibility() == 0 && AudioAttributesImplApi26Parcelizer(childAt) && MediaBrowserCompatItemReceiver(childAt) && childAt.getHeight() >= height) {
                    if (IconCompatParcelizer(childAt, 3)) {
                        int right = childAt.getRight();
                        if (right > i2) {
                            i2 = right;
                        }
                    } else {
                        int left = childAt.getLeft();
                        if (left < width) {
                            width = left;
                        }
                    }
                }
            }
            canvas.clipRect(i2, 0, width, getHeight());
            i = i2;
        }
        boolean zDrawChild = super.drawChild(canvas, view, j);
        canvas.restoreToCount(iSave);
        float f = this.onRewind;
        if (f > BitmapDescriptorFactory.HUE_RED && zMediaMetadataCompat) {
            this.onRemoveQueueItem.setColor((this.onRemoveQueueItemAt & 16777215) | (((int) ((((-16777216) & r2) >>> 24) * f)) << 24));
            canvas.drawRect(i, BitmapDescriptorFactory.HUE_RED, width, getHeight(), this.onRemoveQueueItem);
            return zDrawChild;
        }
        if (this.onSetShuffleMode != null && IconCompatParcelizer(view, 3)) {
            int intrinsicWidth = this.onSetShuffleMode.getIntrinsicWidth();
            int right2 = view.getRight();
            float fMax = Math.max(BitmapDescriptorFactory.HUE_RED, Math.min(right2 / this.onCommand.AudioAttributesImplApi26Parcelizer(), 1.0f));
            this.onSetShuffleMode.setBounds(right2, view.getTop(), intrinsicWidth + right2, view.getBottom());
            this.onSetShuffleMode.setAlpha((int) (fMax * 255.0f));
            this.onSetShuffleMode.draw(canvas);
            return zDrawChild;
        }
        if (this.onSetPlaybackSpeed != null && IconCompatParcelizer(view, 5)) {
            int intrinsicWidth2 = this.onSetPlaybackSpeed.getIntrinsicWidth();
            int left2 = view.getLeft();
            float fMax2 = Math.max(BitmapDescriptorFactory.HUE_RED, Math.min((getWidth() - left2) / this.onPrepare.AudioAttributesImplApi26Parcelizer(), 1.0f));
            this.onSetPlaybackSpeed.setBounds(left2 - intrinsicWidth2, view.getTop(), left2, view.getBottom());
            this.onSetPlaybackSpeed.setAlpha((int) (fMax2 * 255.0f));
            this.onSetPlaybackSpeed.draw(canvas);
        }
        return zDrawChild;
    }

    private static boolean MediaMetadataCompat(View view) {
        return ((LayoutParams) view.getLayoutParams()).IconCompatParcelizer == 0;
    }

    static boolean MediaBrowserCompatItemReceiver(View view) {
        int iWrite = _clearIfStdImpl.write(((LayoutParams) view.getLayoutParams()).IconCompatParcelizer, InvalidTypeIdException.MediaBrowserCompatMediaItem(view));
        return ((iWrite & 3) == 0 && (iWrite & 5) == 0) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0030  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r8) {
        /*
            r7 = this;
            int r0 = r8.getActionMasked()
            o.call r1 = r7.onCommand
            boolean r1 = r1.read(r8)
            o.call r2 = r7.onPrepare
            boolean r2 = r2.read(r8)
            r3 = 1
            r4 = 0
            if (r0 == 0) goto L37
            if (r0 == r3) goto L30
            r8 = 2
            if (r0 == r8) goto L1d
            r8 = 3
            if (r0 == r8) goto L30
            goto L35
        L1d:
            o.call r8 = r7.onCommand
            boolean r8 = r8.read()
            if (r8 == 0) goto L35
            androidx.drawerlayout.widget.DrawerLayout$read r8 = r7.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver
            r8.AudioAttributesCompatParcelizer()
            androidx.drawerlayout.widget.DrawerLayout$read r8 = r7.onPlayFromUri
            r8.AudioAttributesCompatParcelizer()
            goto L35
        L30:
            r7.write(r3)
            r7.AudioAttributesImplBaseParcelizer = r4
        L35:
            r8 = r4
            goto L5f
        L37:
            float r0 = r8.getX()
            float r8 = r8.getY()
            r7.onAddQueueItem = r0
            r7.handleMediaPlayPauseIfPendingOnHandler = r8
            float r5 = r7.onRewind
            r6 = 0
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 <= 0) goto L5c
            o.call r5 = r7.onCommand
            int r0 = (int) r0
            int r8 = (int) r8
            android.view.View r8 = r5.read(r0, r8)
            if (r8 == 0) goto L5c
            boolean r8 = MediaMetadataCompat(r8)
            if (r8 == 0) goto L5c
            r8 = r3
            goto L5d
        L5c:
            r8 = r4
        L5d:
            r7.AudioAttributesImplBaseParcelizer = r4
        L5f:
            r0 = r1 | r2
            if (r0 != 0) goto L70
            if (r8 != 0) goto L70
            boolean r8 = r7.IconCompatParcelizer()
            if (r8 != 0) goto L70
            boolean r7 = r7.AudioAttributesImplBaseParcelizer
            if (r7 != 0) goto L70
            return r4
        L70:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.drawerlayout.widget.DrawerLayout.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View
    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        if ((motionEvent.getSource() & 2) == 0 || motionEvent.getAction() == 10 || this.onRewind <= BitmapDescriptorFactory.HUE_RED) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        int childCount = getChildCount();
        if (childCount == 0) {
            return false;
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        while (true) {
            childCount--;
            if (childCount < 0) {
                return false;
            }
            View childAt = getChildAt(childCount);
            if (AudioAttributesCompatParcelizer(x, y, childAt) && !MediaMetadataCompat(childAt) && write(motionEvent, childAt)) {
                return true;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0059  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            o.call r0 = r6.onCommand
            r0.IconCompatParcelizer(r7)
            o.call r0 = r6.onPrepare
            r0.IconCompatParcelizer(r7)
            int r0 = r7.getAction()
            r0 = r0 & 255(0xff, float:3.57E-43)
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L5e
            if (r0 == r1) goto L1f
            r7 = 3
            if (r0 != r7) goto L6c
            r6.write(r1)
            r6.AudioAttributesImplBaseParcelizer = r2
            goto L6c
        L1f:
            float r0 = r7.getX()
            float r7 = r7.getY()
            o.call r3 = r6.onCommand
            int r4 = (int) r0
            int r5 = (int) r7
            android.view.View r3 = r3.read(r4, r5)
            if (r3 == 0) goto L59
            boolean r3 = MediaMetadataCompat(r3)
            if (r3 == 0) goto L59
            float r3 = r6.onAddQueueItem
            float r0 = r0 - r3
            float r3 = r6.handleMediaPlayPauseIfPendingOnHandler
            float r7 = r7 - r3
            o.call r3 = r6.onCommand
            int r3 = r3.AudioAttributesImplBaseParcelizer()
            float r0 = r0 * r0
            float r7 = r7 * r7
            float r0 = r0 + r7
            int r3 = r3 * r3
            float r7 = (float) r3
            int r7 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r7 >= 0) goto L59
            android.view.View r7 = r6.AudioAttributesImplApi21Parcelizer()
            if (r7 == 0) goto L59
            int r7 = r6.RemoteActionCompatParcelizer(r7)
            r0 = 2
            if (r7 != r0) goto L5a
        L59:
            r2 = r1
        L5a:
            r6.write(r2)
            goto L6c
        L5e:
            float r0 = r7.getX()
            float r7 = r7.getY()
            r6.onAddQueueItem = r0
            r6.handleMediaPlayPauseIfPendingOnHandler = r7
            r6.AudioAttributesImplBaseParcelizer = r2
        L6c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.drawerlayout.widget.DrawerLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (z) {
            write(true);
        }
    }

    public final void read() {
        write(false);
    }

    private void write(boolean z) {
        boolean zAudioAttributesCompatParcelizer;
        int childCount = getChildCount();
        boolean z2 = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            if (MediaBrowserCompatItemReceiver(childAt) && (!z || layoutParams.RemoteActionCompatParcelizer)) {
                int width = childAt.getWidth();
                if (IconCompatParcelizer(childAt, 3)) {
                    zAudioAttributesCompatParcelizer = this.onCommand.AudioAttributesCompatParcelizer(childAt, -width, childAt.getTop());
                } else {
                    zAudioAttributesCompatParcelizer = this.onPrepare.AudioAttributesCompatParcelizer(childAt, getWidth(), childAt.getTop());
                }
                z2 |= zAudioAttributesCompatParcelizer;
                layoutParams.RemoteActionCompatParcelizer = false;
            }
        }
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.AudioAttributesCompatParcelizer();
        this.onPlayFromUri.AudioAttributesCompatParcelizer();
        if (z2) {
            invalidate();
        }
    }

    private void MediaDescriptionCompat(View view) {
        AudioAttributesCompatParcelizer(view, true);
    }

    private void AudioAttributesCompatParcelizer(View view, boolean z) {
        if (!MediaBrowserCompatItemReceiver(view)) {
            StringBuilder sb = new StringBuilder("View ");
            sb.append(view);
            sb.append(" is not a sliding drawer");
            throw new IllegalArgumentException(sb.toString());
        }
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (this.MediaBrowserCompatSearchResultReceiver) {
            layoutParams.read = 1.0f;
            layoutParams.write = 1;
            RemoteActionCompatParcelizer(view, true);
            MediaBrowserCompatCustomActionResultReceiver(view);
        } else {
            layoutParams.write |= 2;
            if (IconCompatParcelizer(view, 3)) {
                this.onCommand.AudioAttributesCompatParcelizer(view, 0, view.getTop());
            } else {
                this.onPrepare.AudioAttributesCompatParcelizer(view, getWidth() - view.getWidth(), view.getTop());
            }
        }
        invalidate();
    }

    public final void RemoteActionCompatParcelizer() {
        AudioAttributesCompatParcelizer(8388611);
    }

    private void AudioAttributesCompatParcelizer(int i) {
        View viewIconCompatParcelizer = IconCompatParcelizer(8388611);
        if (viewIconCompatParcelizer == null) {
            StringBuilder sb = new StringBuilder("No drawer view found with gravity ");
            sb.append(write(8388611));
            throw new IllegalArgumentException(sb.toString());
        }
        AudioAttributesCompatParcelizer(viewIconCompatParcelizer, true);
    }

    public final void read(View view) {
        write(view, true);
    }

    public final void write(View view, boolean z) {
        if (!MediaBrowserCompatItemReceiver(view)) {
            StringBuilder sb = new StringBuilder("View ");
            sb.append(view);
            sb.append(" is not a sliding drawer");
            throw new IllegalArgumentException(sb.toString());
        }
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (this.MediaBrowserCompatSearchResultReceiver) {
            layoutParams.read = BitmapDescriptorFactory.HUE_RED;
            layoutParams.write = 0;
        } else if (z) {
            layoutParams.write |= 4;
            if (IconCompatParcelizer(view, 3)) {
                this.onCommand.AudioAttributesCompatParcelizer(view, -view.getWidth(), view.getTop());
            } else {
                this.onPrepare.AudioAttributesCompatParcelizer(view, getWidth(), view.getTop());
            }
        } else {
            AudioAttributesCompatParcelizer(view, BitmapDescriptorFactory.HUE_RED);
            read(0, view);
            view.setVisibility(4);
        }
        invalidate();
    }

    public static boolean AudioAttributesImplBaseParcelizer(View view) {
        if (MediaBrowserCompatItemReceiver(view)) {
            return (((LayoutParams) view.getLayoutParams()).write & 1) == 1;
        }
        StringBuilder sb = new StringBuilder("View ");
        sb.append(view);
        sb.append(" is not a drawer");
        throw new IllegalArgumentException(sb.toString());
    }

    private static boolean RatingCompat(View view) {
        if (MediaBrowserCompatItemReceiver(view)) {
            return ((LayoutParams) view.getLayoutParams()).read > BitmapDescriptorFactory.HUE_RED;
        }
        StringBuilder sb = new StringBuilder("View ");
        sb.append(view);
        sb.append(" is not a drawer");
        throw new IllegalArgumentException(sb.toString());
    }

    private boolean IconCompatParcelizer() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (((LayoutParams) getChildAt(i).getLayoutParams()).RemoteActionCompatParcelizer) {
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
        if (layoutParams instanceof LayoutParams) {
            return new LayoutParams((LayoutParams) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new LayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof LayoutParams) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        if (getDescendantFocusability() == 393216) {
            return;
        }
        int childCount = getChildCount();
        boolean z = false;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (MediaBrowserCompatItemReceiver(childAt)) {
                if (AudioAttributesImplBaseParcelizer(childAt)) {
                    childAt.addFocusables(arrayList, i, i2);
                    z = true;
                }
            } else {
                this.onPrepareFromSearch.add(childAt);
            }
        }
        if (!z) {
            int size = this.onPrepareFromSearch.size();
            for (int i4 = 0; i4 < size; i4++) {
                View view = this.onPrepareFromSearch.get(i4);
                if (view.getVisibility() == 0) {
                    view.addFocusables(arrayList, i, i2);
                }
            }
        }
        this.onPrepareFromSearch.clear();
    }

    private boolean MediaBrowserCompatItemReceiver() {
        return write() != null;
    }

    final View write() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (MediaBrowserCompatItemReceiver(childAt) && RatingCompat(childAt)) {
                return childAt;
            }
        }
        return null;
    }

    final void AudioAttributesCompatParcelizer() {
        if (this.AudioAttributesImplBaseParcelizer) {
            return;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 0);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            getChildAt(i).dispatchTouchEvent(motionEventObtain);
        }
        motionEventObtain.recycle();
        this.AudioAttributesImplBaseParcelizer = true;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4 && MediaBrowserCompatItemReceiver()) {
            keyEvent.startTracking();
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (i == 4) {
            View viewWrite = write();
            if (viewWrite != null && RemoteActionCompatParcelizer(viewWrite) == 0) {
                read();
            }
            return viewWrite != null;
        }
        return super.onKeyUp(i, keyEvent);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        View viewIconCompatParcelizer;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.read());
        if (savedState.AudioAttributesImplApi21Parcelizer != 0 && (viewIconCompatParcelizer = IconCompatParcelizer(savedState.AudioAttributesImplApi21Parcelizer)) != null) {
            MediaDescriptionCompat(viewIconCompatParcelizer);
        }
        if (savedState.RemoteActionCompatParcelizer != 3) {
            setDrawerLockMode(savedState.RemoteActionCompatParcelizer, 3);
        }
        if (savedState.IconCompatParcelizer != 3) {
            setDrawerLockMode(savedState.IconCompatParcelizer, 5);
        }
        if (savedState.read != 3) {
            setDrawerLockMode(savedState.read, 8388611);
        }
        if (savedState.AudioAttributesCompatParcelizer != 3) {
            setDrawerLockMode(savedState.AudioAttributesCompatParcelizer, 8388613);
        }
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            LayoutParams layoutParams = (LayoutParams) getChildAt(i).getLayoutParams();
            boolean z = layoutParams.write == 1;
            boolean z2 = layoutParams.write == 2;
            if (z || z2) {
                savedState.AudioAttributesImplApi21Parcelizer = layoutParams.IconCompatParcelizer;
                break;
            }
        }
        savedState.RemoteActionCompatParcelizer = this.onPlay;
        savedState.IconCompatParcelizer = this.onMediaButtonEvent;
        savedState.read = this.onPlayFromSearch;
        savedState.AudioAttributesCompatParcelizer = this.onPlayFromMediaId;
        return savedState;
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (AudioAttributesImplApi21Parcelizer() != null || MediaBrowserCompatItemReceiver(view)) {
            InvalidTypeIdException.AudioAttributesImplBaseParcelizer(view, 4);
        } else {
            InvalidTypeIdException.AudioAttributesImplBaseParcelizer(view, 1);
        }
        if (RemoteActionCompatParcelizer) {
            return;
        }
        InvalidTypeIdException.AudioAttributesCompatParcelizer(view, this.AudioAttributesImplApi26Parcelizer);
    }

    static boolean write(View view) {
        return (InvalidTypeIdException.MediaBrowserCompatItemReceiver(view) == 4 || InvalidTypeIdException.MediaBrowserCompatItemReceiver(view) == 2) ? false : true;
    }

    /* JADX INFO: loaded from: classes2.dex */
    protected static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: androidx.drawerlayout.widget.DrawerLayout.SavedState.3
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return IconCompatParcelizer(parcel);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public final /* synthetic */ SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return AudioAttributesCompatParcelizer(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ Object[] newArray(int i) {
                return read(i);
            }

            private static SavedState AudioAttributesCompatParcelizer(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            private static SavedState IconCompatParcelizer(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            private static SavedState[] read(int i) {
                return new SavedState[i];
            }
        };
        int AudioAttributesCompatParcelizer;
        int AudioAttributesImplApi21Parcelizer;
        int IconCompatParcelizer;
        int RemoteActionCompatParcelizer;
        int read;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.AudioAttributesImplApi21Parcelizer = 0;
            this.AudioAttributesImplApi21Parcelizer = parcel.readInt();
            this.RemoteActionCompatParcelizer = parcel.readInt();
            this.IconCompatParcelizer = parcel.readInt();
            this.read = parcel.readInt();
            this.AudioAttributesCompatParcelizer = parcel.readInt();
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
            this.AudioAttributesImplApi21Parcelizer = 0;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.AudioAttributesImplApi21Parcelizer);
            parcel.writeInt(this.RemoteActionCompatParcelizer);
            parcel.writeInt(this.IconCompatParcelizer);
            parcel.writeInt(this.read);
            parcel.writeInt(this.AudioAttributesCompatParcelizer);
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    class read extends call.IconCompatParcelizer {
        private final Runnable AudioAttributesCompatParcelizer = new Runnable() { // from class: androidx.drawerlayout.widget.DrawerLayout.read.4
            @Override // java.lang.Runnable
            public final void run() {
                read.this.read();
            }
        };
        private call RemoteActionCompatParcelizer;
        private final int read;

        read(int i) {
            this.read = i;
        }

        public final void read(call callVar) {
            this.RemoteActionCompatParcelizer = callVar;
        }

        public final void AudioAttributesCompatParcelizer() {
            DrawerLayout.this.removeCallbacks(this.AudioAttributesCompatParcelizer);
        }

        @Override // o.call.IconCompatParcelizer
        public final boolean read(View view, int i) {
            return DrawerLayout.MediaBrowserCompatItemReceiver(view) && DrawerLayout.this.IconCompatParcelizer(view, this.read) && DrawerLayout.this.RemoteActionCompatParcelizer(view) == 0;
        }

        @Override // o.call.IconCompatParcelizer
        public final void IconCompatParcelizer(int i) {
            DrawerLayout.this.read(i, this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer());
        }

        @Override // o.call.IconCompatParcelizer
        public final void AudioAttributesCompatParcelizer(View view, int i, int i2) {
            float width = (DrawerLayout.this.IconCompatParcelizer(view, 3) ? i + r5 : DrawerLayout.this.getWidth() - i) / view.getWidth();
            DrawerLayout.this.write(view, width);
            view.setVisibility(width == BitmapDescriptorFactory.HUE_RED ? 4 : 0);
            DrawerLayout.this.invalidate();
        }

        @Override // o.call.IconCompatParcelizer
        public final void RemoteActionCompatParcelizer(View view, int i) {
            ((LayoutParams) view.getLayoutParams()).RemoteActionCompatParcelizer = false;
            RemoteActionCompatParcelizer();
        }

        private void RemoteActionCompatParcelizer() {
            View viewIconCompatParcelizer = DrawerLayout.this.IconCompatParcelizer(this.read == 3 ? 5 : 3);
            if (viewIconCompatParcelizer != null) {
                DrawerLayout.this.read(viewIconCompatParcelizer);
            }
        }

        @Override // o.call.IconCompatParcelizer
        public final void read(View view, float f, float f2) {
            int i;
            float fIconCompatParcelizer = DrawerLayout.IconCompatParcelizer(view);
            int width = view.getWidth();
            if (DrawerLayout.this.IconCompatParcelizer(view, 3)) {
                i = (f > BitmapDescriptorFactory.HUE_RED || (f == BitmapDescriptorFactory.HUE_RED && fIconCompatParcelizer > 0.5f)) ? 0 : -width;
            } else {
                int width2 = DrawerLayout.this.getWidth();
                i = (f < BitmapDescriptorFactory.HUE_RED || (f == BitmapDescriptorFactory.HUE_RED && fIconCompatParcelizer > 0.5f)) ? width2 - width : width2;
            }
            this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(i, view.getTop());
            DrawerLayout.this.invalidate();
        }

        @Override // o.call.IconCompatParcelizer
        public final void write() {
            DrawerLayout.this.postDelayed(this.AudioAttributesCompatParcelizer, 160L);
        }

        final void read() {
            View viewIconCompatParcelizer;
            int width;
            int iAudioAttributesImplApi26Parcelizer = this.RemoteActionCompatParcelizer.AudioAttributesImplApi26Parcelizer();
            boolean z = this.read == 3;
            if (z) {
                viewIconCompatParcelizer = DrawerLayout.this.IconCompatParcelizer(3);
                width = (viewIconCompatParcelizer != null ? -viewIconCompatParcelizer.getWidth() : 0) + iAudioAttributesImplApi26Parcelizer;
            } else {
                viewIconCompatParcelizer = DrawerLayout.this.IconCompatParcelizer(5);
                width = DrawerLayout.this.getWidth() - iAudioAttributesImplApi26Parcelizer;
            }
            if (viewIconCompatParcelizer != null) {
                if (((!z || viewIconCompatParcelizer.getLeft() >= width) && (z || viewIconCompatParcelizer.getLeft() <= width)) || DrawerLayout.this.RemoteActionCompatParcelizer(viewIconCompatParcelizer) != 0) {
                    return;
                }
                LayoutParams layoutParams = (LayoutParams) viewIconCompatParcelizer.getLayoutParams();
                this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(viewIconCompatParcelizer, width, viewIconCompatParcelizer.getTop());
                layoutParams.RemoteActionCompatParcelizer = true;
                DrawerLayout.this.invalidate();
                RemoteActionCompatParcelizer();
                DrawerLayout.this.AudioAttributesCompatParcelizer();
            }
        }

        @Override // o.call.IconCompatParcelizer
        public final void IconCompatParcelizer(int i, int i2) {
            View viewIconCompatParcelizer;
            if ((i & 1) == 1) {
                viewIconCompatParcelizer = DrawerLayout.this.IconCompatParcelizer(3);
            } else {
                viewIconCompatParcelizer = DrawerLayout.this.IconCompatParcelizer(5);
            }
            if (viewIconCompatParcelizer == null || DrawerLayout.this.RemoteActionCompatParcelizer(viewIconCompatParcelizer) != 0) {
                return;
            }
            this.RemoteActionCompatParcelizer.read(viewIconCompatParcelizer, i2);
        }

        @Override // o.call.IconCompatParcelizer
        public final int AudioAttributesCompatParcelizer(View view) {
            if (DrawerLayout.MediaBrowserCompatItemReceiver(view)) {
                return view.getWidth();
            }
            return 0;
        }

        @Override // o.call.IconCompatParcelizer
        public final int IconCompatParcelizer(View view, int i) {
            if (DrawerLayout.this.IconCompatParcelizer(view, 3)) {
                return Math.max(-view.getWidth(), Math.min(i, 0));
            }
            int width = DrawerLayout.this.getWidth();
            return Math.max(width - view.getWidth(), Math.min(i, width));
        }

        @Override // o.call.IconCompatParcelizer
        public final int AudioAttributesCompatParcelizer(View view, int i) {
            return view.getTop();
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static class LayoutParams extends ViewGroup.MarginLayoutParams {
        public int IconCompatParcelizer;
        boolean RemoteActionCompatParcelizer;
        float read;
        int write;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.IconCompatParcelizer = 0;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, DrawerLayout.AudioAttributesCompatParcelizer);
            this.IconCompatParcelizer = typedArrayObtainStyledAttributes.getInt(0, 0);
            typedArrayObtainStyledAttributes.recycle();
        }

        public LayoutParams() {
            super(-1, -1);
            this.IconCompatParcelizer = 0;
        }

        public LayoutParams(LayoutParams layoutParams) {
            super((ViewGroup.MarginLayoutParams) layoutParams);
            this.IconCompatParcelizer = 0;
            this.IconCompatParcelizer = layoutParams.IconCompatParcelizer;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.IconCompatParcelizer = 0;
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.IconCompatParcelizer = 0;
        }
    }

    /* JADX INFO: loaded from: classes4.dex */
    class IconCompatParcelizer extends deserializeUsingCustom {
        private final Rect write = new Rect();

        IconCompatParcelizer() {
        }

        @Override // kotlin.deserializeUsingCustom
        public final void onInitializeAccessibilityNodeInfo(View view, hasSuperClassStartingWith hassuperclassstartingwith) {
            if (DrawerLayout.RemoteActionCompatParcelizer) {
                super.onInitializeAccessibilityNodeInfo(view, hassuperclassstartingwith);
            } else {
                hasSuperClassStartingWith hassuperclassstartingwithAudioAttributesCompatParcelizer = hasSuperClassStartingWith.AudioAttributesCompatParcelizer(hassuperclassstartingwith);
                super.onInitializeAccessibilityNodeInfo(view, hassuperclassstartingwithAudioAttributesCompatParcelizer);
                hassuperclassstartingwith.write(view);
                Object objOnCustomAction = InvalidTypeIdException.onCustomAction(view);
                if (objOnCustomAction instanceof View) {
                    hassuperclassstartingwith.IconCompatParcelizer((View) objOnCustomAction);
                }
                RemoteActionCompatParcelizer(hassuperclassstartingwith, hassuperclassstartingwithAudioAttributesCompatParcelizer);
                hassuperclassstartingwithAudioAttributesCompatParcelizer.onSetCaptioningEnabled();
                read(hassuperclassstartingwith, (ViewGroup) view);
            }
            hassuperclassstartingwith.AudioAttributesCompatParcelizer("androidx.drawerlayout.widget.DrawerLayout");
            hassuperclassstartingwith.MediaDescriptionCompat(false);
            hassuperclassstartingwith.MediaBrowserCompatMediaItem(false);
            hassuperclassstartingwith.IconCompatParcelizer(hasSuperClassStartingWith.read.MediaBrowserCompatSearchResultReceiver);
            hassuperclassstartingwith.IconCompatParcelizer(hasSuperClassStartingWith.read.read);
        }

        @Override // kotlin.deserializeUsingCustom
        public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            accessibilityEvent.setClassName("androidx.drawerlayout.widget.DrawerLayout");
        }

        @Override // kotlin.deserializeUsingCustom
        public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            if (accessibilityEvent.getEventType() == 32) {
                List<CharSequence> text = accessibilityEvent.getText();
                View viewWrite = DrawerLayout.this.write();
                if (viewWrite == null) {
                    return true;
                }
                CharSequence charSequence = DrawerLayout.this.read(DrawerLayout.this.AudioAttributesCompatParcelizer(viewWrite));
                if (charSequence == null) {
                    return true;
                }
                text.add(charSequence);
                return true;
            }
            return super.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
        }

        @Override // kotlin.deserializeUsingCustom
        public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            if (DrawerLayout.RemoteActionCompatParcelizer || DrawerLayout.write(view)) {
                return super.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
            }
            return false;
        }

        private static void read(hasSuperClassStartingWith hassuperclassstartingwith, ViewGroup viewGroup) {
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (DrawerLayout.write(childAt)) {
                    hassuperclassstartingwith.RemoteActionCompatParcelizer(childAt);
                }
            }
        }

        private void RemoteActionCompatParcelizer(hasSuperClassStartingWith hassuperclassstartingwith, hasSuperClassStartingWith hassuperclassstartingwith2) {
            Rect rect = this.write;
            hassuperclassstartingwith2.read(rect);
            hassuperclassstartingwith.IconCompatParcelizer(rect);
            hassuperclassstartingwith.onPlayFromMediaId(hassuperclassstartingwith2.onSetShuffleMode());
            hassuperclassstartingwith.MediaBrowserCompatCustomActionResultReceiver(hassuperclassstartingwith2.MediaDescriptionCompat());
            hassuperclassstartingwith.AudioAttributesCompatParcelizer(hassuperclassstartingwith2.AudioAttributesCompatParcelizer());
            hassuperclassstartingwith.IconCompatParcelizer(hassuperclassstartingwith2.MediaBrowserCompatItemReceiver());
            hassuperclassstartingwith.MediaBrowserCompatCustomActionResultReceiver(hassuperclassstartingwith2.onPlayFromMediaId());
            hassuperclassstartingwith.MediaBrowserCompatMediaItem(hassuperclassstartingwith2.onPlayFromUri());
            hassuperclassstartingwith.RemoteActionCompatParcelizer(hassuperclassstartingwith2.onAddQueueItem());
            hassuperclassstartingwith.onCommand(hassuperclassstartingwith2.onPrepareFromUri());
            hassuperclassstartingwith.AudioAttributesCompatParcelizer(hassuperclassstartingwith2.RemoteActionCompatParcelizer());
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    static final class write extends deserializeUsingCustom {
        write() {
        }

        @Override // kotlin.deserializeUsingCustom
        public final void onInitializeAccessibilityNodeInfo(View view, hasSuperClassStartingWith hassuperclassstartingwith) {
            super.onInitializeAccessibilityNodeInfo(view, hassuperclassstartingwith);
            if (DrawerLayout.write(view)) {
                return;
            }
            hassuperclassstartingwith.IconCompatParcelizer((View) null);
        }
    }
}
