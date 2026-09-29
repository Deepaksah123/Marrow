package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import androidx.core.view.WindowInsetsCompat;
import androidx.customview.view.AbsSavedState;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.InvalidTypeIdException;
import kotlin.StdDeserializer;
import kotlin._checkCoercionFail;
import kotlin._clearIfStdImpl;
import kotlin._handleIncompatibleUpdateValue;
import kotlin._isNaN;
import kotlin.configureFromStringCreator;
import kotlin.findFormatOverrides;
import kotlin.finishBranchObject;
import kotlin.resetAsArray;
import kotlin.resetAsObject;
import kotlin.rewrapCtorProblem;
import kotlin.rootArrayScope;

/* JADX INFO: loaded from: classes2.dex */
public class CoordinatorLayout extends ViewGroup implements resetAsArray, resetAsObject {
    private static Class<?>[] AudioAttributesCompatParcelizer;
    private static ThreadLocal<Map<String, Constructor<Behavior>>> IconCompatParcelizer;
    private static final rewrapCtorProblem.IconCompatParcelizer<Rect> MediaBrowserCompatItemReceiver;
    private static String RemoteActionCompatParcelizer;
    private static Comparator<View> write;
    private final int[] AudioAttributesImplApi21Parcelizer;
    private View AudioAttributesImplApi26Parcelizer;
    private finishBranchObject AudioAttributesImplBaseParcelizer;
    private final _handleIncompatibleUpdateValue<View> MediaBrowserCompatCustomActionResultReceiver;
    private boolean MediaBrowserCompatMediaItem;
    private boolean MediaBrowserCompatSearchResultReceiver;
    private View MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    private int[] MediaDescriptionCompat;
    private final List<View> MediaMetadataCompat;
    private boolean RatingCompat;
    private final int[] handleMediaPlayPauseIfPendingOnHandler;
    private final rootArrayScope onAddQueueItem;
    private boolean onCommand;
    private WindowInsetsCompat onCustomAction;
    private final List<View> onFastForward;
    private Drawable onMediaButtonEvent;
    private final List<View> onPlay;
    private AudioAttributesCompatParcelizer onPlayFromMediaId;
    ViewGroup.OnHierarchyChangeListener read;

    public interface read {
        Behavior write();
    }

    /* JADX INFO: loaded from: classes.dex */
    @Retention(RetentionPolicy.RUNTIME)
    @Deprecated
    public @interface write {
        Class<? extends Behavior> read();
    }

    private static int AudioAttributesCompatParcelizer(int i) {
        if (i == 0) {
            return 17;
        }
        return i;
    }

    private static int read(int i) {
        if ((i & 7) == 0) {
            i |= 8388611;
        }
        return (i & 112) == 0 ? i | 48 : i;
    }

    private static int write(int i) {
        if (i == 0) {
            return 8388661;
        }
        return i;
    }

    @Override // android.view.ViewGroup
    protected /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return MediaBrowserCompatCustomActionResultReceiver();
    }

    @Override // android.view.ViewGroup
    protected /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return write(layoutParams);
    }

    static {
        Package r0 = CoordinatorLayout.class.getPackage();
        RemoteActionCompatParcelizer = r0 != null ? r0.getName() : null;
        write = new MediaBrowserCompatItemReceiver();
        AudioAttributesCompatParcelizer = new Class[]{Context.class, AttributeSet.class};
        IconCompatParcelizer = new ThreadLocal<>();
        MediaBrowserCompatItemReceiver = new rewrapCtorProblem.read(12);
    }

    private static Rect AudioAttributesCompatParcelizer() {
        Rect rectRemoteActionCompatParcelizer = MediaBrowserCompatItemReceiver.RemoteActionCompatParcelizer();
        return rectRemoteActionCompatParcelizer == null ? new Rect() : rectRemoteActionCompatParcelizer;
    }

    private static void RemoteActionCompatParcelizer(Rect rect) {
        rect.setEmpty();
        MediaBrowserCompatItemReceiver.RemoteActionCompatParcelizer(rect);
    }

    public CoordinatorLayout(Context context) {
        this(context, null);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, StdDeserializer.RemoteActionCompatParcelizer.coordinatorLayoutStyle);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet, int i) {
        TypedArray typedArrayObtainStyledAttributes;
        super(context, attributeSet, i);
        this.MediaMetadataCompat = new ArrayList();
        this.MediaBrowserCompatCustomActionResultReceiver = new _handleIncompatibleUpdateValue<>();
        this.onFastForward = new ArrayList();
        this.onPlay = new ArrayList();
        this.AudioAttributesImplApi21Parcelizer = new int[2];
        this.handleMediaPlayPauseIfPendingOnHandler = new int[2];
        this.onAddQueueItem = new rootArrayScope();
        if (i == 0) {
            typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, StdDeserializer.IconCompatParcelizer.CoordinatorLayout, 0, StdDeserializer.write.Widget_Support_CoordinatorLayout);
        } else {
            typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, StdDeserializer.IconCompatParcelizer.CoordinatorLayout, i, 0);
        }
        if (i == 0) {
            saveAttributeDataForStyleable(context, StdDeserializer.IconCompatParcelizer.CoordinatorLayout, attributeSet, typedArrayObtainStyledAttributes, 0, StdDeserializer.write.Widget_Support_CoordinatorLayout);
        } else {
            saveAttributeDataForStyleable(context, StdDeserializer.IconCompatParcelizer.CoordinatorLayout, attributeSet, typedArrayObtainStyledAttributes, i, 0);
        }
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(StdDeserializer.IconCompatParcelizer.CoordinatorLayout_keylines, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            this.MediaDescriptionCompat = resources.getIntArray(resourceId);
            float f = resources.getDisplayMetrics().density;
            int length = this.MediaDescriptionCompat.length;
            for (int i2 = 0; i2 < length; i2++) {
                this.MediaDescriptionCompat[i2] = (int) (r12[i2] * f);
            }
        }
        this.onMediaButtonEvent = typedArrayObtainStyledAttributes.getDrawable(StdDeserializer.IconCompatParcelizer.CoordinatorLayout_statusBarBackground);
        typedArrayObtainStyledAttributes.recycle();
        read();
        super.setOnHierarchyChangeListener(new IconCompatParcelizer());
        if (InvalidTypeIdException.MediaBrowserCompatItemReceiver(this) == 0) {
            InvalidTypeIdException.AudioAttributesImplBaseParcelizer(this, 1);
        }
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.read = onHierarchyChangeListener;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        IconCompatParcelizer(false);
        if (this.onCommand) {
            if (this.onPlayFromMediaId == null) {
                this.onPlayFromMediaId = new AudioAttributesCompatParcelizer();
            }
            getViewTreeObserver().addOnPreDrawListener(this.onPlayFromMediaId);
        }
        if (this.onCustomAction == null && InvalidTypeIdException.MediaBrowserCompatCustomActionResultReceiver(this)) {
            InvalidTypeIdException.onSetRepeatMode(this);
        }
        this.MediaBrowserCompatSearchResultReceiver = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        IconCompatParcelizer(false);
        if (this.onCommand && this.onPlayFromMediaId != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.onPlayFromMediaId);
        }
        View view = this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        if (view != null) {
            onStopNestedScroll(view);
        }
        this.MediaBrowserCompatSearchResultReceiver = false;
    }

    public void setStatusBarBackground(Drawable drawable) {
        Drawable drawable2 = this.onMediaButtonEvent;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.onMediaButtonEvent = drawableMutate;
            if (drawableMutate != null) {
                if (drawableMutate.isStateful()) {
                    this.onMediaButtonEvent.setState(getDrawableState());
                }
                findFormatOverrides.RemoteActionCompatParcelizer(this.onMediaButtonEvent, InvalidTypeIdException.MediaBrowserCompatMediaItem(this));
                this.onMediaButtonEvent.setVisible(getVisibility() == 0, false);
                this.onMediaButtonEvent.setCallback(this);
            }
            InvalidTypeIdException.onRemoveQueueItem(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.onMediaButtonEvent;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidate();
        }
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.onMediaButtonEvent;
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.onMediaButtonEvent;
        if (drawable == null || drawable.isVisible() == z) {
            return;
        }
        this.onMediaButtonEvent.setVisible(z, false);
    }

    public void setStatusBarBackgroundResource(int i) {
        setStatusBarBackground(i != 0 ? _isNaN.getDrawable(getContext(), i) : null);
    }

    public void setStatusBarBackgroundColor(int i) {
        setStatusBarBackground(new ColorDrawable(i));
    }

    final WindowInsetsCompat AudioAttributesCompatParcelizer(WindowInsetsCompat windowInsetsCompat) {
        if (configureFromStringCreator.RemoteActionCompatParcelizer(this.onCustomAction, windowInsetsCompat)) {
            return windowInsetsCompat;
        }
        this.onCustomAction = windowInsetsCompat;
        boolean z = windowInsetsCompat != null && windowInsetsCompat.MediaBrowserCompatCustomActionResultReceiver() > 0;
        this.RatingCompat = z;
        setWillNotDraw(!z && getBackground() == null);
        WindowInsetsCompat windowInsetsCompatWrite = write(windowInsetsCompat);
        requestLayout();
        return windowInsetsCompatWrite;
    }

    public final WindowInsetsCompat Y_() {
        return this.onCustomAction;
    }

    private void IconCompatParcelizer(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            Behavior behaviorWrite = ((RemoteActionCompatParcelizer) childAt.getLayoutParams()).write();
            if (behaviorWrite != null) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 0);
                if (z) {
                    behaviorWrite.read(this, childAt, motionEventObtain);
                } else {
                    behaviorWrite.AudioAttributesCompatParcelizer(this, childAt, motionEventObtain);
                }
                motionEventObtain.recycle();
            }
        }
        for (int i2 = 0; i2 < childCount; i2++) {
            ((RemoteActionCompatParcelizer) getChildAt(i2).getLayoutParams()).AudioAttributesImplApi26Parcelizer();
        }
        this.AudioAttributesImplApi26Parcelizer = null;
        this.MediaBrowserCompatMediaItem = false;
    }

    private void AudioAttributesCompatParcelizer(List<View> list) {
        list.clear();
        boolean zIsChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i = childCount - 1; i >= 0; i--) {
            list.add(getChildAt(zIsChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i) : i));
        }
        Comparator<View> comparator = write;
        if (comparator != null) {
            Collections.sort(list, comparator);
        }
    }

    private boolean write(MotionEvent motionEvent, int i) {
        int actionMasked = motionEvent.getActionMasked();
        List<View> list = this.onFastForward;
        AudioAttributesCompatParcelizer(list);
        int size = list.size();
        MotionEvent motionEventObtain = null;
        boolean zAudioAttributesCompatParcelizer = false;
        boolean z = false;
        for (int i2 = 0; i2 < size; i2++) {
            View view = list.get(i2);
            RemoteActionCompatParcelizer remoteActionCompatParcelizer = (RemoteActionCompatParcelizer) view.getLayoutParams();
            Behavior behaviorWrite = remoteActionCompatParcelizer.write();
            if (!(zAudioAttributesCompatParcelizer || z) || actionMasked == 0) {
                if (!zAudioAttributesCompatParcelizer && behaviorWrite != null) {
                    if (i == 0) {
                        zAudioAttributesCompatParcelizer = behaviorWrite.read(this, view, motionEvent);
                    } else if (i == 1) {
                        zAudioAttributesCompatParcelizer = behaviorWrite.AudioAttributesCompatParcelizer(this, view, motionEvent);
                    }
                    if (zAudioAttributesCompatParcelizer) {
                        this.AudioAttributesImplApi26Parcelizer = view;
                    }
                }
                boolean zAudioAttributesCompatParcelizer2 = remoteActionCompatParcelizer.AudioAttributesCompatParcelizer();
                boolean zWrite = remoteActionCompatParcelizer.write(this, view);
                z = zWrite && !zAudioAttributesCompatParcelizer2;
                if (zWrite && !z) {
                    break;
                }
            } else if (behaviorWrite != null) {
                if (motionEventObtain == null) {
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 0);
                }
                if (i == 0) {
                    behaviorWrite.read(this, view, motionEventObtain);
                } else if (i == 1) {
                    behaviorWrite.AudioAttributesCompatParcelizer(this, view, motionEventObtain);
                }
            }
        }
        list.clear();
        return zAudioAttributesCompatParcelizer;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            IconCompatParcelizer(true);
        }
        boolean zWrite = write(motionEvent, 0);
        if (actionMasked != 1 && actionMasked != 3) {
            return zWrite;
        }
        IconCompatParcelizer(true);
        return zWrite;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002b A[PHI: r3
      0x002b: PHI (r3v4 boolean) = (r3v2 boolean), (r3v5 boolean) binds: [B:9:0x0022, B:5:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004c  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            int r2 = r18.getActionMasked()
            android.view.View r3 = r0.AudioAttributesImplApi26Parcelizer
            r4 = 1
            r5 = 0
            if (r3 != 0) goto L15
            boolean r3 = r0.write(r1, r4)
            if (r3 == 0) goto L2b
            goto L16
        L15:
            r3 = r5
        L16:
            android.view.View r6 = r0.AudioAttributesImplApi26Parcelizer
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$RemoteActionCompatParcelizer r6 = (androidx.coordinatorlayout.widget.CoordinatorLayout.RemoteActionCompatParcelizer) r6
            androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior r6 = r6.write()
            if (r6 == 0) goto L2b
            android.view.View r7 = r0.AudioAttributesImplApi26Parcelizer
            boolean r6 = r6.AudioAttributesCompatParcelizer(r0, r7, r1)
            goto L2c
        L2b:
            r6 = r5
        L2c:
            android.view.View r7 = r0.AudioAttributesImplApi26Parcelizer
            r8 = 0
            if (r7 != 0) goto L37
            boolean r1 = super.onTouchEvent(r18)
            r6 = r6 | r1
            goto L4a
        L37:
            if (r3 == 0) goto L4a
            long r11 = android.os.SystemClock.uptimeMillis()
            r13 = 3
            r14 = 0
            r15 = 0
            r16 = 0
            r9 = r11
            android.view.MotionEvent r8 = android.view.MotionEvent.obtain(r9, r11, r13, r14, r15, r16)
            super.onTouchEvent(r8)
        L4a:
            if (r8 == 0) goto L4f
            r8.recycle()
        L4f:
            if (r2 == r4) goto L55
            r1 = 3
            if (r2 == r1) goto L55
            return r6
        L55:
            r0.IconCompatParcelizer(r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (!z || this.MediaBrowserCompatMediaItem) {
            return;
        }
        IconCompatParcelizer(false);
        this.MediaBrowserCompatMediaItem = true;
    }

    private int RemoteActionCompatParcelizer(int i) {
        int[] iArr = this.MediaDescriptionCompat;
        if (iArr == null) {
            toString();
            return 0;
        }
        if (i < 0 || i >= iArr.length) {
            toString();
            return 0;
        }
        return iArr[i];
    }

    /* JADX WARN: Multi-variable type inference failed */
    static Behavior read(Context context, AttributeSet attributeSet, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.startsWith(".")) {
            StringBuilder sb = new StringBuilder();
            sb.append(context.getPackageName());
            sb.append(str);
            str = sb.toString();
        } else if (str.indexOf(46) < 0) {
            String str2 = RemoteActionCompatParcelizer;
            if (!TextUtils.isEmpty(str2)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str2);
                sb2.append('.');
                sb2.append(str);
                str = sb2.toString();
            }
        }
        try {
            ThreadLocal<Map<String, Constructor<Behavior>>> threadLocal = IconCompatParcelizer;
            Map<String, Constructor<Behavior>> map = threadLocal.get();
            if (map == null) {
                map = new HashMap<>();
                threadLocal.set(map);
            }
            Constructor<Behavior> constructor = map.get(str);
            if (constructor == null) {
                constructor = Class.forName(str, false, context.getClassLoader()).getConstructor(AudioAttributesCompatParcelizer);
                constructor.setAccessible(true);
                map.put(str, constructor);
            }
            return constructor.newInstance(context, attributeSet);
        } catch (Exception e) {
            throw new RuntimeException("Could not inflate Behavior subclass ".concat(String.valueOf(str)), e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static RemoteActionCompatParcelizer write(View view) {
        RemoteActionCompatParcelizer remoteActionCompatParcelizer = (RemoteActionCompatParcelizer) view.getLayoutParams();
        if (!remoteActionCompatParcelizer.AudioAttributesImplBaseParcelizer) {
            if (view instanceof read) {
                remoteActionCompatParcelizer.write(((read) view).write());
                remoteActionCompatParcelizer.AudioAttributesImplBaseParcelizer = true;
                return remoteActionCompatParcelizer;
            }
            write writeVar = null;
            for (Class<?> superclass = view.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
                writeVar = (write) superclass.getAnnotation(write.class);
                if (writeVar != null) {
                    break;
                }
            }
            if (writeVar != null) {
                try {
                    remoteActionCompatParcelizer.write(writeVar.read().getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                } catch (Exception unused) {
                    writeVar.read().getName();
                }
            }
            remoteActionCompatParcelizer.AudioAttributesImplBaseParcelizer = true;
        }
        return remoteActionCompatParcelizer;
    }

    private void IconCompatParcelizer() {
        this.MediaMetadataCompat.clear();
        this.MediaBrowserCompatCustomActionResultReceiver.read();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            RemoteActionCompatParcelizer remoteActionCompatParcelizerWrite = write(childAt);
            remoteActionCompatParcelizerWrite.read(this, childAt);
            this.MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer(childAt);
            for (int i2 = 0; i2 < childCount; i2++) {
                if (i2 != i) {
                    View childAt2 = getChildAt(i2);
                    if (remoteActionCompatParcelizerWrite.IconCompatParcelizer(this, childAt, childAt2)) {
                        if (!this.MediaBrowserCompatCustomActionResultReceiver.RemoteActionCompatParcelizer(childAt2)) {
                            this.MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer(childAt2);
                        }
                        this.MediaBrowserCompatCustomActionResultReceiver.RemoteActionCompatParcelizer(childAt2, childAt);
                    }
                }
            }
        }
        this.MediaMetadataCompat.addAll(this.MediaBrowserCompatCustomActionResultReceiver.write());
        Collections.reverse(this.MediaMetadataCompat);
    }

    private void IconCompatParcelizer(View view, Rect rect) {
        _checkCoercionFail.write(this, view, rect);
    }

    @Override // android.view.View
    protected int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingLeft() + getPaddingRight());
    }

    @Override // android.view.View
    protected int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingTop() + getPaddingBottom());
    }

    public final void write(View view, int i, int i2, int i3, int i4) {
        measureChildWithMargins(view, i, i2, i3, i4);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0129  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void onMeasure(int r32, int r33) {
        /*
            Method dump skipped, instruction units count: 408
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onMeasure(int, int):void");
    }

    private WindowInsetsCompat write(WindowInsetsCompat windowInsetsCompat) {
        if (windowInsetsCompat.MediaBrowserCompatSearchResultReceiver()) {
            return windowInsetsCompat;
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (InvalidTypeIdException.MediaBrowserCompatCustomActionResultReceiver(childAt) && ((RemoteActionCompatParcelizer) childAt.getLayoutParams()).write() != null) {
                windowInsetsCompat = Behavior.AudioAttributesCompatParcelizer(windowInsetsCompat);
                if (windowInsetsCompat.MediaBrowserCompatSearchResultReceiver()) {
                    return windowInsetsCompat;
                }
            }
        }
        return windowInsetsCompat;
    }

    public final void write(View view, int i) {
        RemoteActionCompatParcelizer remoteActionCompatParcelizer = (RemoteActionCompatParcelizer) view.getLayoutParams();
        if (remoteActionCompatParcelizer.IconCompatParcelizer()) {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        }
        if (remoteActionCompatParcelizer.MediaBrowserCompatItemReceiver != null) {
            RemoteActionCompatParcelizer(view, remoteActionCompatParcelizer.MediaBrowserCompatItemReceiver, i);
        } else if (remoteActionCompatParcelizer.AudioAttributesCompatParcelizer >= 0) {
            RemoteActionCompatParcelizer(view, remoteActionCompatParcelizer.AudioAttributesCompatParcelizer, i);
        } else {
            read(view, i);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Behavior behaviorWrite;
        int iMediaBrowserCompatMediaItem = InvalidTypeIdException.MediaBrowserCompatMediaItem(this);
        int size = this.MediaMetadataCompat.size();
        for (int i5 = 0; i5 < size; i5++) {
            View view = this.MediaMetadataCompat.get(i5);
            if (view.getVisibility() != 8 && ((behaviorWrite = ((RemoteActionCompatParcelizer) view.getLayoutParams()).write()) == null || !behaviorWrite.write(this, view, iMediaBrowserCompatMediaItem))) {
                write(view, iMediaBrowserCompatMediaItem);
            }
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.RatingCompat || this.onMediaButtonEvent == null) {
            return;
        }
        WindowInsetsCompat windowInsetsCompat = this.onCustomAction;
        int iMediaBrowserCompatCustomActionResultReceiver = windowInsetsCompat != null ? windowInsetsCompat.MediaBrowserCompatCustomActionResultReceiver() : 0;
        if (iMediaBrowserCompatCustomActionResultReceiver > 0) {
            this.onMediaButtonEvent.setBounds(0, 0, getWidth(), iMediaBrowserCompatCustomActionResultReceiver);
            this.onMediaButtonEvent.draw(canvas);
        }
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z) {
        super.setFitsSystemWindows(z);
        read();
    }

    private static void AudioAttributesCompatParcelizer(View view, Rect rect) {
        ((RemoteActionCompatParcelizer) view.getLayoutParams()).AudioAttributesCompatParcelizer(rect);
    }

    private static void write(View view, Rect rect) {
        rect.set(((RemoteActionCompatParcelizer) view.getLayoutParams()).MediaBrowserCompatItemReceiver());
    }

    private void AudioAttributesCompatParcelizer(View view, boolean z, Rect rect) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z) {
            IconCompatParcelizer(view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    private static void read(int i, Rect rect, Rect rect2, RemoteActionCompatParcelizer remoteActionCompatParcelizer, int i2, int i3) {
        int iWidth;
        int iHeight;
        int iWrite = _clearIfStdImpl.write(AudioAttributesCompatParcelizer(remoteActionCompatParcelizer.write), i);
        int iWrite2 = _clearIfStdImpl.write(read(remoteActionCompatParcelizer.IconCompatParcelizer), i);
        int i4 = iWrite & 7;
        int i5 = iWrite & 112;
        int i6 = iWrite2 & 7;
        int i7 = iWrite2 & 112;
        if (i6 == 1) {
            iWidth = rect.left + (rect.width() / 2);
        } else if (i6 != 5) {
            iWidth = rect.left;
        } else {
            iWidth = rect.right;
        }
        if (i7 == 16) {
            iHeight = rect.top + (rect.height() / 2);
        } else if (i7 != 80) {
            iHeight = rect.top;
        } else {
            iHeight = rect.bottom;
        }
        if (i4 == 1) {
            iWidth -= i2 / 2;
        } else if (i4 != 5) {
            iWidth -= i2;
        }
        if (i5 == 16) {
            iHeight -= i3 / 2;
        } else if (i5 != 80) {
            iHeight -= i3;
        }
        rect2.set(iWidth, iHeight, i2 + iWidth, i3 + iHeight);
    }

    private void AudioAttributesCompatParcelizer(RemoteActionCompatParcelizer remoteActionCompatParcelizer, Rect rect, int i, int i2) {
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int i3 = ((ViewGroup.MarginLayoutParams) remoteActionCompatParcelizer).leftMargin;
        int i4 = paddingLeft + i3;
        int iMax = Math.max(i4, Math.min(rect.left, ((width - getPaddingRight()) - i) - ((ViewGroup.MarginLayoutParams) remoteActionCompatParcelizer).rightMargin));
        int paddingTop = getPaddingTop();
        int i5 = ((ViewGroup.MarginLayoutParams) remoteActionCompatParcelizer).topMargin;
        int i6 = paddingTop + i5;
        int iMax2 = Math.max(i6, Math.min(rect.top, ((height - getPaddingBottom()) - i2) - ((ViewGroup.MarginLayoutParams) remoteActionCompatParcelizer).bottomMargin));
        rect.set(iMax, iMax2, i + iMax, i2 + iMax2);
    }

    private void RemoteActionCompatParcelizer(View view, int i, Rect rect, Rect rect2) {
        RemoteActionCompatParcelizer remoteActionCompatParcelizer = (RemoteActionCompatParcelizer) view.getLayoutParams();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        read(i, rect, rect2, remoteActionCompatParcelizer, measuredWidth, measuredHeight);
        AudioAttributesCompatParcelizer(remoteActionCompatParcelizer, rect2, measuredWidth, measuredHeight);
    }

    private void RemoteActionCompatParcelizer(View view, View view2, int i) {
        Rect rectAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer();
        Rect rectAudioAttributesCompatParcelizer2 = AudioAttributesCompatParcelizer();
        try {
            IconCompatParcelizer(view2, rectAudioAttributesCompatParcelizer);
            RemoteActionCompatParcelizer(view, i, rectAudioAttributesCompatParcelizer, rectAudioAttributesCompatParcelizer2);
            view.layout(rectAudioAttributesCompatParcelizer2.left, rectAudioAttributesCompatParcelizer2.top, rectAudioAttributesCompatParcelizer2.right, rectAudioAttributesCompatParcelizer2.bottom);
        } finally {
            RemoteActionCompatParcelizer(rectAudioAttributesCompatParcelizer);
            RemoteActionCompatParcelizer(rectAudioAttributesCompatParcelizer2);
        }
    }

    private void RemoteActionCompatParcelizer(View view, int i, int i2) {
        int i3;
        RemoteActionCompatParcelizer remoteActionCompatParcelizer = (RemoteActionCompatParcelizer) view.getLayoutParams();
        int iWrite = _clearIfStdImpl.write(write(remoteActionCompatParcelizer.write), i2);
        int i4 = iWrite & 7;
        int i5 = iWrite & 112;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        if (i2 == 1) {
            i = width - i;
        }
        int iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(i) - measuredWidth;
        if (i4 == 1) {
            iRemoteActionCompatParcelizer += measuredWidth / 2;
        } else if (i4 == 5) {
            iRemoteActionCompatParcelizer += measuredWidth;
        }
        if (i5 != 16) {
            i3 = i5 != 80 ? 0 : measuredHeight;
        } else {
            i3 = measuredHeight / 2;
        }
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) remoteActionCompatParcelizer).leftMargin, Math.min(iRemoteActionCompatParcelizer, ((width - getPaddingRight()) - measuredWidth) - ((ViewGroup.MarginLayoutParams) remoteActionCompatParcelizer).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) remoteActionCompatParcelizer).topMargin, Math.min(i3, ((height - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) remoteActionCompatParcelizer).bottomMargin));
        view.layout(iMax, iMax2, measuredWidth + iMax, measuredHeight + iMax2);
    }

    private void read(View view, int i) {
        RemoteActionCompatParcelizer remoteActionCompatParcelizer = (RemoteActionCompatParcelizer) view.getLayoutParams();
        Rect rectAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer();
        rectAudioAttributesCompatParcelizer.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) remoteActionCompatParcelizer).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) remoteActionCompatParcelizer).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) remoteActionCompatParcelizer).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) remoteActionCompatParcelizer).bottomMargin);
        if (this.onCustomAction != null && InvalidTypeIdException.MediaBrowserCompatCustomActionResultReceiver(this) && !InvalidTypeIdException.MediaBrowserCompatCustomActionResultReceiver(view)) {
            rectAudioAttributesCompatParcelizer.left += this.onCustomAction.AudioAttributesImplApi21Parcelizer();
            rectAudioAttributesCompatParcelizer.top += this.onCustomAction.MediaBrowserCompatCustomActionResultReceiver();
            rectAudioAttributesCompatParcelizer.right -= this.onCustomAction.MediaBrowserCompatItemReceiver();
            rectAudioAttributesCompatParcelizer.bottom -= this.onCustomAction.AudioAttributesImplBaseParcelizer();
        }
        Rect rectAudioAttributesCompatParcelizer2 = AudioAttributesCompatParcelizer();
        _clearIfStdImpl.AudioAttributesCompatParcelizer(read(remoteActionCompatParcelizer.write), view.getMeasuredWidth(), view.getMeasuredHeight(), rectAudioAttributesCompatParcelizer, rectAudioAttributesCompatParcelizer2, i);
        view.layout(rectAudioAttributesCompatParcelizer2.left, rectAudioAttributesCompatParcelizer2.top, rectAudioAttributesCompatParcelizer2.right, rectAudioAttributesCompatParcelizer2.bottom);
        RemoteActionCompatParcelizer(rectAudioAttributesCompatParcelizer);
        RemoteActionCompatParcelizer(rectAudioAttributesCompatParcelizer2);
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(Canvas canvas, View view, long j) {
        RemoteActionCompatParcelizer remoteActionCompatParcelizer = (RemoteActionCompatParcelizer) view.getLayoutParams();
        if (remoteActionCompatParcelizer.AudioAttributesImplApi26Parcelizer != null) {
            Behavior behavior = remoteActionCompatParcelizer.AudioAttributesImplApi26Parcelizer;
        }
        return super.drawChild(canvas, view, j);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00c5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final void IconCompatParcelizer(int r18) {
        /*
            Method dump skipped, instruction units count: 268
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.IconCompatParcelizer(int):void");
    }

    private void RemoteActionCompatParcelizer(View view, Rect rect, int i) {
        boolean z;
        int width;
        int i2;
        int height;
        int i3;
        if (!InvalidTypeIdException.onSeekTo(view) || view.getWidth() <= 0 || view.getHeight() <= 0) {
            return;
        }
        RemoteActionCompatParcelizer remoteActionCompatParcelizer = (RemoteActionCompatParcelizer) view.getLayoutParams();
        Behavior behaviorWrite = remoteActionCompatParcelizer.write();
        Rect rectAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer();
        Rect rectAudioAttributesCompatParcelizer2 = AudioAttributesCompatParcelizer();
        rectAudioAttributesCompatParcelizer2.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        if (behaviorWrite != null && behaviorWrite.RemoteActionCompatParcelizer(this, view, rectAudioAttributesCompatParcelizer)) {
            if (!rectAudioAttributesCompatParcelizer2.contains(rectAudioAttributesCompatParcelizer)) {
                StringBuilder sb = new StringBuilder("Rect should be within the child's bounds. Rect:");
                sb.append(rectAudioAttributesCompatParcelizer.toShortString());
                sb.append(" | Bounds:");
                sb.append(rectAudioAttributesCompatParcelizer2.toShortString());
                throw new IllegalArgumentException(sb.toString());
            }
        } else {
            rectAudioAttributesCompatParcelizer.set(rectAudioAttributesCompatParcelizer2);
        }
        RemoteActionCompatParcelizer(rectAudioAttributesCompatParcelizer2);
        if (rectAudioAttributesCompatParcelizer.isEmpty()) {
            RemoteActionCompatParcelizer(rectAudioAttributesCompatParcelizer);
            return;
        }
        int iWrite = _clearIfStdImpl.write(remoteActionCompatParcelizer.RemoteActionCompatParcelizer, i);
        boolean z2 = true;
        if ((iWrite & 48) != 48 || (i3 = (rectAudioAttributesCompatParcelizer.top - ((ViewGroup.MarginLayoutParams) remoteActionCompatParcelizer).topMargin) - remoteActionCompatParcelizer.MediaBrowserCompatMediaItem) >= rect.top) {
            z = false;
        } else {
            AudioAttributesCompatParcelizer(view, rect.top - i3);
            z = true;
        }
        if ((iWrite & 80) == 80 && (height = ((getHeight() - rectAudioAttributesCompatParcelizer.bottom) - ((ViewGroup.MarginLayoutParams) remoteActionCompatParcelizer).bottomMargin) + remoteActionCompatParcelizer.MediaBrowserCompatMediaItem) < rect.bottom) {
            AudioAttributesCompatParcelizer(view, height - rect.bottom);
        } else if (!z) {
            AudioAttributesCompatParcelizer(view, 0);
        }
        if ((iWrite & 3) != 3 || (i2 = (rectAudioAttributesCompatParcelizer.left - ((ViewGroup.MarginLayoutParams) remoteActionCompatParcelizer).leftMargin) - remoteActionCompatParcelizer.AudioAttributesImplApi21Parcelizer) >= rect.left) {
            z2 = false;
        } else {
            IconCompatParcelizer(view, rect.left - i2);
        }
        if ((iWrite & 5) == 5 && (width = ((getWidth() - rectAudioAttributesCompatParcelizer.right) - ((ViewGroup.MarginLayoutParams) remoteActionCompatParcelizer).rightMargin) + remoteActionCompatParcelizer.AudioAttributesImplApi21Parcelizer) < rect.right) {
            IconCompatParcelizer(view, width - rect.right);
        } else if (!z2) {
            IconCompatParcelizer(view, 0);
        }
        RemoteActionCompatParcelizer(rectAudioAttributesCompatParcelizer);
    }

    private static void IconCompatParcelizer(View view, int i) {
        RemoteActionCompatParcelizer remoteActionCompatParcelizer = (RemoteActionCompatParcelizer) view.getLayoutParams();
        if (remoteActionCompatParcelizer.AudioAttributesImplApi21Parcelizer != i) {
            InvalidTypeIdException.AudioAttributesCompatParcelizer(view, i - remoteActionCompatParcelizer.AudioAttributesImplApi21Parcelizer);
            remoteActionCompatParcelizer.AudioAttributesImplApi21Parcelizer = i;
        }
    }

    private static void AudioAttributesCompatParcelizer(View view, int i) {
        RemoteActionCompatParcelizer remoteActionCompatParcelizer = (RemoteActionCompatParcelizer) view.getLayoutParams();
        if (remoteActionCompatParcelizer.MediaBrowserCompatMediaItem != i) {
            InvalidTypeIdException.IconCompatParcelizer(view, i - remoteActionCompatParcelizer.MediaBrowserCompatMediaItem);
            remoteActionCompatParcelizer.MediaBrowserCompatMediaItem = i;
        }
    }

    public final void read(View view) {
        List list = this.MediaBrowserCompatCustomActionResultReceiver.read(view);
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i = 0; i < list.size(); i++) {
            View view2 = (View) list.get(i);
            Behavior behaviorWrite = ((RemoteActionCompatParcelizer) view2.getLayoutParams()).write();
            if (behaviorWrite != null) {
                behaviorWrite.IconCompatParcelizer(this, view2, view);
            }
        }
    }

    public final List<View> RemoteActionCompatParcelizer(View view) {
        List<View> listWrite = this.MediaBrowserCompatCustomActionResultReceiver.write(view);
        this.onPlay.clear();
        if (listWrite != null) {
            this.onPlay.addAll(listWrite);
        }
        return this.onPlay;
    }

    public final List<View> IconCompatParcelizer(View view) {
        List list = this.MediaBrowserCompatCustomActionResultReceiver.read(view);
        this.onPlay.clear();
        if (list != null) {
            this.onPlay.addAll(list);
        }
        return this.onPlay;
    }

    private void AudioAttributesImplBaseParcelizer() {
        int childCount = getChildCount();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= childCount) {
                break;
            }
            if (AudioAttributesCompatParcelizer(getChildAt(i))) {
                z = true;
                break;
            }
            i++;
        }
        if (z != this.onCommand) {
            if (z) {
                RemoteActionCompatParcelizer();
            } else {
                AudioAttributesImplApi26Parcelizer();
            }
        }
    }

    private boolean AudioAttributesCompatParcelizer(View view) {
        return this.MediaBrowserCompatCustomActionResultReceiver.AudioAttributesCompatParcelizer(view);
    }

    private void RemoteActionCompatParcelizer() {
        if (this.MediaBrowserCompatSearchResultReceiver) {
            if (this.onPlayFromMediaId == null) {
                this.onPlayFromMediaId = new AudioAttributesCompatParcelizer();
            }
            getViewTreeObserver().addOnPreDrawListener(this.onPlayFromMediaId);
        }
        this.onCommand = true;
    }

    private void AudioAttributesImplApi26Parcelizer() {
        if (this.MediaBrowserCompatSearchResultReceiver && this.onPlayFromMediaId != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.onPlayFromMediaId);
        }
        this.onCommand = false;
    }

    private void AudioAttributesImplApi26Parcelizer(View view, int i) {
        Behavior behaviorWrite;
        RemoteActionCompatParcelizer remoteActionCompatParcelizer = (RemoteActionCompatParcelizer) view.getLayoutParams();
        if (remoteActionCompatParcelizer.MediaBrowserCompatItemReceiver != null) {
            Rect rectAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer();
            Rect rectAudioAttributesCompatParcelizer2 = AudioAttributesCompatParcelizer();
            Rect rectAudioAttributesCompatParcelizer3 = AudioAttributesCompatParcelizer();
            IconCompatParcelizer(remoteActionCompatParcelizer.MediaBrowserCompatItemReceiver, rectAudioAttributesCompatParcelizer);
            AudioAttributesCompatParcelizer(view, false, rectAudioAttributesCompatParcelizer2);
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            read(i, rectAudioAttributesCompatParcelizer, rectAudioAttributesCompatParcelizer3, remoteActionCompatParcelizer, measuredWidth, measuredHeight);
            boolean z = (rectAudioAttributesCompatParcelizer3.left == rectAudioAttributesCompatParcelizer2.left && rectAudioAttributesCompatParcelizer3.top == rectAudioAttributesCompatParcelizer2.top) ? false : true;
            AudioAttributesCompatParcelizer(remoteActionCompatParcelizer, rectAudioAttributesCompatParcelizer3, measuredWidth, measuredHeight);
            int i2 = rectAudioAttributesCompatParcelizer3.left - rectAudioAttributesCompatParcelizer2.left;
            int i3 = rectAudioAttributesCompatParcelizer3.top - rectAudioAttributesCompatParcelizer2.top;
            if (i2 != 0) {
                InvalidTypeIdException.AudioAttributesCompatParcelizer(view, i2);
            }
            if (i3 != 0) {
                InvalidTypeIdException.IconCompatParcelizer(view, i3);
            }
            if (z && (behaviorWrite = remoteActionCompatParcelizer.write()) != null) {
                behaviorWrite.IconCompatParcelizer(this, view, remoteActionCompatParcelizer.MediaBrowserCompatItemReceiver);
            }
            RemoteActionCompatParcelizer(rectAudioAttributesCompatParcelizer);
            RemoteActionCompatParcelizer(rectAudioAttributesCompatParcelizer2);
            RemoteActionCompatParcelizer(rectAudioAttributesCompatParcelizer3);
        }
    }

    public final boolean IconCompatParcelizer(View view, int i, int i2) {
        Rect rectAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer();
        IconCompatParcelizer(view, rectAudioAttributesCompatParcelizer);
        try {
            return rectAudioAttributesCompatParcelizer.contains(i, i2);
        } finally {
            RemoteActionCompatParcelizer(rectAudioAttributesCompatParcelizer);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public RemoteActionCompatParcelizer generateLayoutParams(AttributeSet attributeSet) {
        return new RemoteActionCompatParcelizer(getContext(), attributeSet);
    }

    private static RemoteActionCompatParcelizer write(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof RemoteActionCompatParcelizer) {
            return new RemoteActionCompatParcelizer((RemoteActionCompatParcelizer) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new RemoteActionCompatParcelizer((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new RemoteActionCompatParcelizer(layoutParams);
    }

    private static RemoteActionCompatParcelizer MediaBrowserCompatCustomActionResultReceiver() {
        return new RemoteActionCompatParcelizer();
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof RemoteActionCompatParcelizer) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i) {
        return IconCompatParcelizer(view, view2, i, 0);
    }

    @Override // kotlin.resetAsArray
    public boolean IconCompatParcelizer(View view, View view2, int i, int i2) {
        int childCount = getChildCount();
        boolean z = false;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                RemoteActionCompatParcelizer remoteActionCompatParcelizer = (RemoteActionCompatParcelizer) childAt.getLayoutParams();
                Behavior behaviorWrite = remoteActionCompatParcelizer.write();
                if (behaviorWrite != null) {
                    boolean zWrite = behaviorWrite.write(this, childAt, view, view2, i, i2);
                    z |= zWrite;
                    remoteActionCompatParcelizer.RemoteActionCompatParcelizer(i2, zWrite);
                } else {
                    remoteActionCompatParcelizer.RemoteActionCompatParcelizer(i2, false);
                }
            }
        }
        return z;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i) {
        read(view, view2, i, 0);
    }

    @Override // kotlin.resetAsArray
    public void read(View view, View view2, int i, int i2) {
        this.onAddQueueItem.write(i, i2);
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = view2;
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            RemoteActionCompatParcelizer remoteActionCompatParcelizer = (RemoteActionCompatParcelizer) getChildAt(i3).getLayoutParams();
            if (remoteActionCompatParcelizer.write(i2)) {
                remoteActionCompatParcelizer.write();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        RemoteActionCompatParcelizer(view, 0);
    }

    @Override // kotlin.resetAsArray
    public void RemoteActionCompatParcelizer(View view, int i) {
        this.onAddQueueItem.read(i);
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            RemoteActionCompatParcelizer remoteActionCompatParcelizer = (RemoteActionCompatParcelizer) childAt.getLayoutParams();
            if (remoteActionCompatParcelizer.write(i)) {
                Behavior behaviorWrite = remoteActionCompatParcelizer.write();
                if (behaviorWrite != null) {
                    behaviorWrite.IconCompatParcelizer(this, childAt, view, i);
                }
                remoteActionCompatParcelizer.AudioAttributesCompatParcelizer(i);
                remoteActionCompatParcelizer.AudioAttributesImplBaseParcelizer();
            }
        }
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        AudioAttributesCompatParcelizer(view, i, i2, i3, i4, 0);
    }

    @Override // kotlin.resetAsArray
    public void AudioAttributesCompatParcelizer(View view, int i, int i2, int i3, int i4, int i5) {
        read(view, i, i2, i3, i4, 0, this.handleMediaPlayPauseIfPendingOnHandler);
    }

    @Override // kotlin.resetAsObject
    public void read(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        Behavior behaviorWrite;
        int childCount = getChildCount();
        boolean z = false;
        int iMax = 0;
        int iMax2 = 0;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                RemoteActionCompatParcelizer remoteActionCompatParcelizer = (RemoteActionCompatParcelizer) childAt.getLayoutParams();
                if (remoteActionCompatParcelizer.write(i5) && (behaviorWrite = remoteActionCompatParcelizer.write()) != null) {
                    int[] iArr2 = this.AudioAttributesImplApi21Parcelizer;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    behaviorWrite.read(this, childAt, view, i, i2, i3, i4, i5, iArr2);
                    int[] iArr3 = this.AudioAttributesImplApi21Parcelizer;
                    iMax = i3 > 0 ? Math.max(iMax, iArr3[0]) : Math.min(iMax, iArr3[0]);
                    int[] iArr4 = this.AudioAttributesImplApi21Parcelizer;
                    iMax2 = i4 > 0 ? Math.max(iMax2, iArr4[1]) : Math.min(iMax2, iArr4[1]);
                    z = true;
                }
            }
        }
        iArr[0] = iArr[0] + iMax;
        iArr[1] = iArr[1] + iMax2;
        if (z) {
            IconCompatParcelizer(1);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        RemoteActionCompatParcelizer(view, i, i2, iArr, 0);
    }

    @Override // kotlin.resetAsArray
    public void RemoteActionCompatParcelizer(View view, int i, int i2, int[] iArr, int i3) {
        Behavior behaviorWrite;
        int childCount = getChildCount();
        boolean z = false;
        int iMax = 0;
        int iMax2 = 0;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                RemoteActionCompatParcelizer remoteActionCompatParcelizer = (RemoteActionCompatParcelizer) childAt.getLayoutParams();
                if (remoteActionCompatParcelizer.write(i3) && (behaviorWrite = remoteActionCompatParcelizer.write()) != null) {
                    int[] iArr2 = this.AudioAttributesImplApi21Parcelizer;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    behaviorWrite.read(this, childAt, view, i, i2, iArr2, i3);
                    int[] iArr3 = this.AudioAttributesImplApi21Parcelizer;
                    iMax = i > 0 ? Math.max(iMax, iArr3[0]) : Math.min(iMax, iArr3[0]);
                    int[] iArr4 = this.AudioAttributesImplApi21Parcelizer;
                    iMax2 = i2 > 0 ? Math.max(iMax2, iArr4[1]) : Math.min(iMax2, iArr4[1]);
                    z = true;
                }
            }
        }
        iArr[0] = iMax;
        iArr[1] = iMax2;
        if (z) {
            IconCompatParcelizer(1);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                RemoteActionCompatParcelizer remoteActionCompatParcelizer = (RemoteActionCompatParcelizer) childAt.getLayoutParams();
                if (remoteActionCompatParcelizer.write(0)) {
                    remoteActionCompatParcelizer.write();
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f, float f2) {
        Behavior behaviorWrite;
        int childCount = getChildCount();
        boolean zWrite = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                RemoteActionCompatParcelizer remoteActionCompatParcelizer = (RemoteActionCompatParcelizer) childAt.getLayoutParams();
                if (remoteActionCompatParcelizer.write(0) && (behaviorWrite = remoteActionCompatParcelizer.write()) != null) {
                    zWrite |= behaviorWrite.write(this, childAt, view, f, f2);
                }
            }
        }
        return zWrite;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.onAddQueueItem.IconCompatParcelizer();
    }

    class AudioAttributesCompatParcelizer implements ViewTreeObserver.OnPreDrawListener {
        AudioAttributesCompatParcelizer() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public final boolean onPreDraw() {
            CoordinatorLayout.this.IconCompatParcelizer(0);
            return true;
        }
    }

    static class MediaBrowserCompatItemReceiver implements Comparator<View> {
        MediaBrowserCompatItemReceiver() {
        }

        @Override // java.util.Comparator
        public final /* synthetic */ int compare(View view, View view2) {
            return IconCompatParcelizer(view, view2);
        }

        private static int IconCompatParcelizer(View view, View view2) {
            float fOnPlayFromMediaId = InvalidTypeIdException.onPlayFromMediaId(view);
            float fOnPlayFromMediaId2 = InvalidTypeIdException.onPlayFromMediaId(view2);
            if (fOnPlayFromMediaId > fOnPlayFromMediaId2) {
                return -1;
            }
            return fOnPlayFromMediaId < fOnPlayFromMediaId2 ? 1 : 0;
        }
    }

    public static abstract class Behavior<V extends View> {
        public static WindowInsetsCompat AudioAttributesCompatParcelizer(WindowInsetsCompat windowInsetsCompat) {
            return windowInsetsCompat;
        }

        public void AudioAttributesCompatParcelizer(CoordinatorLayout coordinatorLayout, V v, Parcelable parcelable) {
        }

        public boolean AudioAttributesCompatParcelizer(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
            return false;
        }

        public void IconCompatParcelizer() {
        }

        public void IconCompatParcelizer(RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        }

        public void IconCompatParcelizer(CoordinatorLayout coordinatorLayout, View view) {
        }

        public void IconCompatParcelizer(CoordinatorLayout coordinatorLayout, V v, View view, int i) {
        }

        public boolean IconCompatParcelizer(CoordinatorLayout coordinatorLayout, V v, Rect rect, boolean z) {
            return false;
        }

        public boolean IconCompatParcelizer(CoordinatorLayout coordinatorLayout, V v, View view) {
            return false;
        }

        public boolean RemoteActionCompatParcelizer(CoordinatorLayout coordinatorLayout, V v, Rect rect) {
            return false;
        }

        public void read(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr, int i3) {
        }

        public boolean read(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
            return false;
        }

        public boolean write(V v, View view) {
            return false;
        }

        public boolean write(CoordinatorLayout coordinatorLayout, V v, int i) {
            return false;
        }

        public boolean write(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3, int i4) {
            return false;
        }

        public boolean write(CoordinatorLayout coordinatorLayout, V v, View view, float f, float f2) {
            return false;
        }

        public boolean write(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i, int i2) {
            return false;
        }

        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
        }

        public void read(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
            iArr[0] = iArr[0] + i3;
            iArr[1] = iArr[1] + i4;
        }

        public Parcelable read(CoordinatorLayout coordinatorLayout, V v) {
            return View.BaseSavedState.EMPTY_STATE;
        }
    }

    public static class RemoteActionCompatParcelizer extends ViewGroup.MarginLayoutParams {
        public int AudioAttributesCompatParcelizer;
        int AudioAttributesImplApi21Parcelizer;
        Behavior AudioAttributesImplApi26Parcelizer;
        boolean AudioAttributesImplBaseParcelizer;
        public int IconCompatParcelizer;
        View MediaBrowserCompatCustomActionResultReceiver;
        View MediaBrowserCompatItemReceiver;
        int MediaBrowserCompatMediaItem;
        private boolean MediaBrowserCompatSearchResultReceiver;
        private int MediaDescriptionCompat;
        final Rect MediaMetadataCompat;
        private Object RatingCompat;
        public int RemoteActionCompatParcelizer;
        private boolean handleMediaPlayPauseIfPendingOnHandler;
        private boolean onAddQueueItem;
        private boolean onCustomAction;
        public int read;
        public int write;

        public RemoteActionCompatParcelizer() {
            super(-2, -2);
            this.AudioAttributesImplBaseParcelizer = false;
            this.write = 0;
            this.IconCompatParcelizer = 0;
            this.AudioAttributesCompatParcelizer = -1;
            this.MediaDescriptionCompat = -1;
            this.read = 0;
            this.RemoteActionCompatParcelizer = 0;
            this.MediaMetadataCompat = new Rect();
        }

        RemoteActionCompatParcelizer(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.AudioAttributesImplBaseParcelizer = false;
            this.write = 0;
            this.IconCompatParcelizer = 0;
            this.AudioAttributesCompatParcelizer = -1;
            this.MediaDescriptionCompat = -1;
            this.read = 0;
            this.RemoteActionCompatParcelizer = 0;
            this.MediaMetadataCompat = new Rect();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, StdDeserializer.IconCompatParcelizer.CoordinatorLayout_Layout);
            this.write = typedArrayObtainStyledAttributes.getInteger(StdDeserializer.IconCompatParcelizer.CoordinatorLayout_Layout_android_layout_gravity, 0);
            this.MediaDescriptionCompat = typedArrayObtainStyledAttributes.getResourceId(StdDeserializer.IconCompatParcelizer.CoordinatorLayout_Layout_layout_anchor, -1);
            this.IconCompatParcelizer = typedArrayObtainStyledAttributes.getInteger(StdDeserializer.IconCompatParcelizer.CoordinatorLayout_Layout_layout_anchorGravity, 0);
            this.AudioAttributesCompatParcelizer = typedArrayObtainStyledAttributes.getInteger(StdDeserializer.IconCompatParcelizer.CoordinatorLayout_Layout_layout_keyline, -1);
            this.read = typedArrayObtainStyledAttributes.getInt(StdDeserializer.IconCompatParcelizer.CoordinatorLayout_Layout_layout_insetEdge, 0);
            this.RemoteActionCompatParcelizer = typedArrayObtainStyledAttributes.getInt(StdDeserializer.IconCompatParcelizer.CoordinatorLayout_Layout_layout_dodgeInsetEdges, 0);
            boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(StdDeserializer.IconCompatParcelizer.CoordinatorLayout_Layout_layout_behavior);
            this.AudioAttributesImplBaseParcelizer = zHasValue;
            if (zHasValue) {
                this.AudioAttributesImplApi26Parcelizer = CoordinatorLayout.read(context, attributeSet, typedArrayObtainStyledAttributes.getString(StdDeserializer.IconCompatParcelizer.CoordinatorLayout_Layout_layout_behavior));
            }
            typedArrayObtainStyledAttributes.recycle();
            Behavior behavior = this.AudioAttributesImplApi26Parcelizer;
            if (behavior != null) {
                behavior.IconCompatParcelizer(this);
            }
        }

        public RemoteActionCompatParcelizer(RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
            super((ViewGroup.MarginLayoutParams) remoteActionCompatParcelizer);
            this.AudioAttributesImplBaseParcelizer = false;
            this.write = 0;
            this.IconCompatParcelizer = 0;
            this.AudioAttributesCompatParcelizer = -1;
            this.MediaDescriptionCompat = -1;
            this.read = 0;
            this.RemoteActionCompatParcelizer = 0;
            this.MediaMetadataCompat = new Rect();
        }

        public RemoteActionCompatParcelizer(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.AudioAttributesImplBaseParcelizer = false;
            this.write = 0;
            this.IconCompatParcelizer = 0;
            this.AudioAttributesCompatParcelizer = -1;
            this.MediaDescriptionCompat = -1;
            this.read = 0;
            this.RemoteActionCompatParcelizer = 0;
            this.MediaMetadataCompat = new Rect();
        }

        public RemoteActionCompatParcelizer(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.AudioAttributesImplBaseParcelizer = false;
            this.write = 0;
            this.IconCompatParcelizer = 0;
            this.AudioAttributesCompatParcelizer = -1;
            this.MediaDescriptionCompat = -1;
            this.read = 0;
            this.RemoteActionCompatParcelizer = 0;
            this.MediaMetadataCompat = new Rect();
        }

        public final int RemoteActionCompatParcelizer() {
            return this.MediaDescriptionCompat;
        }

        public final Behavior write() {
            return this.AudioAttributesImplApi26Parcelizer;
        }

        public final void write(Behavior behavior) {
            Behavior behavior2 = this.AudioAttributesImplApi26Parcelizer;
            if (behavior2 != behavior) {
                if (behavior2 != null) {
                    behavior2.IconCompatParcelizer();
                }
                this.AudioAttributesImplApi26Parcelizer = behavior;
                this.RatingCompat = null;
                this.AudioAttributesImplBaseParcelizer = true;
                if (behavior != null) {
                    behavior.IconCompatParcelizer(this);
                }
            }
        }

        final void AudioAttributesCompatParcelizer(Rect rect) {
            this.MediaMetadataCompat.set(rect);
        }

        final Rect MediaBrowserCompatItemReceiver() {
            return this.MediaMetadataCompat;
        }

        final boolean IconCompatParcelizer() {
            return this.MediaBrowserCompatItemReceiver == null && this.MediaDescriptionCompat != -1;
        }

        final boolean AudioAttributesCompatParcelizer() {
            if (this.AudioAttributesImplApi26Parcelizer == null) {
                this.handleMediaPlayPauseIfPendingOnHandler = false;
            }
            return this.handleMediaPlayPauseIfPendingOnHandler;
        }

        final boolean write(CoordinatorLayout coordinatorLayout, View view) {
            boolean z = this.handleMediaPlayPauseIfPendingOnHandler;
            if (z) {
                return true;
            }
            this.handleMediaPlayPauseIfPendingOnHandler = z;
            return z;
        }

        final void AudioAttributesImplApi26Parcelizer() {
            this.handleMediaPlayPauseIfPendingOnHandler = false;
        }

        final void AudioAttributesCompatParcelizer(int i) {
            RemoteActionCompatParcelizer(i, false);
        }

        final void RemoteActionCompatParcelizer(int i, boolean z) {
            if (i == 0) {
                this.onAddQueueItem = z;
            } else {
                if (i != 1) {
                    return;
                }
                this.MediaBrowserCompatSearchResultReceiver = z;
            }
        }

        final boolean write(int i) {
            if (i == 0) {
                return this.onAddQueueItem;
            }
            if (i != 1) {
                return false;
            }
            return this.MediaBrowserCompatSearchResultReceiver;
        }

        final boolean read() {
            return this.onCustomAction;
        }

        final void IconCompatParcelizer(boolean z) {
            this.onCustomAction = z;
        }

        final void AudioAttributesImplBaseParcelizer() {
            this.onCustomAction = false;
        }

        final boolean IconCompatParcelizer(CoordinatorLayout coordinatorLayout, View view, View view2) {
            if (view2 == this.MediaBrowserCompatCustomActionResultReceiver || RemoteActionCompatParcelizer(view2, InvalidTypeIdException.MediaBrowserCompatMediaItem(coordinatorLayout))) {
                return true;
            }
            Behavior behavior = this.AudioAttributesImplApi26Parcelizer;
            return behavior != null && behavior.write(view, view2);
        }

        final View read(CoordinatorLayout coordinatorLayout, View view) {
            if (this.MediaDescriptionCompat == -1) {
                this.MediaBrowserCompatCustomActionResultReceiver = null;
                this.MediaBrowserCompatItemReceiver = null;
                return null;
            }
            if (this.MediaBrowserCompatItemReceiver == null || !write(view, coordinatorLayout)) {
                IconCompatParcelizer(view, coordinatorLayout);
            }
            return this.MediaBrowserCompatItemReceiver;
        }

        private void IconCompatParcelizer(View view, CoordinatorLayout coordinatorLayout) {
            View viewFindViewById = coordinatorLayout.findViewById(this.MediaDescriptionCompat);
            this.MediaBrowserCompatItemReceiver = viewFindViewById;
            if (viewFindViewById == null) {
                if (coordinatorLayout.isInEditMode()) {
                    this.MediaBrowserCompatCustomActionResultReceiver = null;
                    this.MediaBrowserCompatItemReceiver = null;
                    return;
                } else {
                    StringBuilder sb = new StringBuilder("Could not find CoordinatorLayout descendant view with id ");
                    sb.append(coordinatorLayout.getResources().getResourceName(this.MediaDescriptionCompat));
                    sb.append(" to anchor view ");
                    sb.append(view);
                    throw new IllegalStateException(sb.toString());
                }
            }
            if (viewFindViewById == coordinatorLayout) {
                if (coordinatorLayout.isInEditMode()) {
                    this.MediaBrowserCompatCustomActionResultReceiver = null;
                    this.MediaBrowserCompatItemReceiver = null;
                    return;
                }
                throw new IllegalStateException("View can not be anchored to the the parent CoordinatorLayout");
            }
            for (ViewParent parent = viewFindViewById.getParent(); parent != coordinatorLayout && parent != null; parent = parent.getParent()) {
                if (parent == view) {
                    if (coordinatorLayout.isInEditMode()) {
                        this.MediaBrowserCompatCustomActionResultReceiver = null;
                        this.MediaBrowserCompatItemReceiver = null;
                        return;
                    }
                    throw new IllegalStateException("Anchor must not be a descendant of the anchored view");
                }
                if (parent instanceof View) {
                    viewFindViewById = parent;
                }
            }
            this.MediaBrowserCompatCustomActionResultReceiver = viewFindViewById;
        }

        private boolean write(View view, CoordinatorLayout coordinatorLayout) {
            if (this.MediaBrowserCompatItemReceiver.getId() != this.MediaDescriptionCompat) {
                return false;
            }
            View view2 = this.MediaBrowserCompatItemReceiver;
            for (ViewParent parent = view2.getParent(); parent != coordinatorLayout; parent = parent.getParent()) {
                if (parent == null || parent == view) {
                    this.MediaBrowserCompatCustomActionResultReceiver = null;
                    this.MediaBrowserCompatItemReceiver = null;
                    return false;
                }
                if (parent instanceof View) {
                    view2 = parent;
                }
            }
            this.MediaBrowserCompatCustomActionResultReceiver = view2;
            return true;
        }

        private boolean RemoteActionCompatParcelizer(View view, int i) {
            int iWrite = _clearIfStdImpl.write(((RemoteActionCompatParcelizer) view.getLayoutParams()).read, i);
            return iWrite != 0 && (_clearIfStdImpl.write(this.RemoteActionCompatParcelizer, i) & iWrite) == iWrite;
        }
    }

    /* JADX INFO: loaded from: classes4.dex */
    class IconCompatParcelizer implements ViewGroup.OnHierarchyChangeListener {
        IconCompatParcelizer() {
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public final void onChildViewAdded(View view, View view2) {
            if (CoordinatorLayout.this.read != null) {
                CoordinatorLayout.this.read.onChildViewAdded(view, view2);
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public final void onChildViewRemoved(View view, View view2) {
            CoordinatorLayout.this.IconCompatParcelizer(2);
            if (CoordinatorLayout.this.read != null) {
                CoordinatorLayout.this.read.onChildViewRemoved(view, view2);
            }
        }
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.read());
        SparseArray<Parcelable> sparseArray = savedState.AudioAttributesCompatParcelizer;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            Behavior behaviorWrite = write(childAt).write();
            if (id != -1 && behaviorWrite != null && (parcelable2 = sparseArray.get(id)) != null) {
                behaviorWrite.AudioAttributesCompatParcelizer(this, childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        Parcelable parcelable;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            Behavior behaviorWrite = ((RemoteActionCompatParcelizer) childAt.getLayoutParams()).write();
            if (id != -1 && behaviorWrite != null && (parcelable = behaviorWrite.read(this, childAt)) != null) {
                sparseArray.append(id, parcelable);
            }
        }
        savedState.AudioAttributesCompatParcelizer = sparseArray;
        return savedState;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        Behavior behaviorWrite = ((RemoteActionCompatParcelizer) view.getLayoutParams()).write();
        if (behaviorWrite == null || !behaviorWrite.IconCompatParcelizer(this, view, rect, z)) {
            return super.requestChildRectangleOnScreen(view, rect, z);
        }
        return true;
    }

    private void read() {
        if (InvalidTypeIdException.MediaBrowserCompatCustomActionResultReceiver(this)) {
            if (this.AudioAttributesImplBaseParcelizer == null) {
                this.AudioAttributesImplBaseParcelizer = new finishBranchObject() { // from class: androidx.coordinatorlayout.widget.CoordinatorLayout.2
                    @Override // kotlin.finishBranchObject
                    public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                        return CoordinatorLayout.this.AudioAttributesCompatParcelizer(windowInsetsCompat);
                    }
                };
            }
            InvalidTypeIdException.read(this, this.AudioAttributesImplBaseParcelizer);
            setSystemUiVisibility(1280);
            return;
        }
        InvalidTypeIdException.read(this, (finishBranchObject) null);
    }

    protected static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: androidx.coordinatorlayout.widget.CoordinatorLayout.SavedState.5
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
                return RemoteActionCompatParcelizer(i);
            }

            private static SavedState AudioAttributesCompatParcelizer(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            private static SavedState IconCompatParcelizer(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            private static SavedState[] RemoteActionCompatParcelizer(int i) {
                return new SavedState[i];
            }
        };
        SparseArray<Parcelable> AudioAttributesCompatParcelizer;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            int i = parcel.readInt();
            int[] iArr = new int[i];
            parcel.readIntArray(iArr);
            Parcelable[] parcelableArray = parcel.readParcelableArray(classLoader);
            this.AudioAttributesCompatParcelizer = new SparseArray<>(i);
            for (int i2 = 0; i2 < i; i2++) {
                this.AudioAttributesCompatParcelizer.append(iArr[i2], parcelableArray[i2]);
            }
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            SparseArray<Parcelable> sparseArray = this.AudioAttributesCompatParcelizer;
            int size = sparseArray != null ? sparseArray.size() : 0;
            parcel.writeInt(size);
            int[] iArr = new int[size];
            Parcelable[] parcelableArr = new Parcelable[size];
            for (int i2 = 0; i2 < size; i2++) {
                iArr[i2] = this.AudioAttributesCompatParcelizer.keyAt(i2);
                parcelableArr[i2] = this.AudioAttributesCompatParcelizer.valueAt(i2);
            }
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i);
        }
    }
}
