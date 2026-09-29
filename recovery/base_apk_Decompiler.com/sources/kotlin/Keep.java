package kotlin;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin._init_lambda5;

/* JADX INFO: loaded from: classes.dex */
public class Keep extends ListView {
    AudioAttributesImplApi26Parcelizer AudioAttributesCompatParcelizer;
    private _addAnnotationsIfNotPresent AudioAttributesImplApi21Parcelizer;
    private int AudioAttributesImplApi26Parcelizer;
    private int AudioAttributesImplBaseParcelizer;
    private boolean IconCompatParcelizer;
    private int MediaBrowserCompatCustomActionResultReceiver;
    private int MediaBrowserCompatItemReceiver;
    private final Rect MediaBrowserCompatSearchResultReceiver;
    private AudioAttributesCompatParcelizer MediaDescriptionCompat;
    private int MediaMetadataCompat;
    private boolean RemoteActionCompatParcelizer;
    private boolean read;
    private findTransient write;

    public Keep(Context context, boolean z) {
        super(context, null, _init_lambda5.read.dropDownListViewStyle);
        this.MediaBrowserCompatSearchResultReceiver = new Rect();
        this.AudioAttributesImplBaseParcelizer = 0;
        this.MediaMetadataCompat = 0;
        this.MediaBrowserCompatCustomActionResultReceiver = 0;
        this.MediaBrowserCompatItemReceiver = 0;
        this.read = z;
        setCacheColorHint(0);
    }

    private boolean RemoteActionCompatParcelizer() {
        if (_getToStringResolver.write()) {
            return RemoteActionCompatParcelizer.write(this);
        }
        return IconCompatParcelizer.RemoteActionCompatParcelizer(this);
    }

    private void read(boolean z) {
        if (_getToStringResolver.write()) {
            RemoteActionCompatParcelizer.IconCompatParcelizer(this, z);
        } else {
            IconCompatParcelizer.read(this, z);
        }
    }

    @Override // android.view.View
    public boolean isInTouchMode() {
        return (this.read && this.IconCompatParcelizer) || super.isInTouchMode();
    }

    @Override // android.view.View
    public boolean hasWindowFocus() {
        return this.read || super.hasWindowFocus();
    }

    @Override // android.view.View
    public boolean isFocused() {
        return this.read || super.isFocused();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean hasFocus() {
        return this.read || super.hasFocus();
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = drawable != null ? new AudioAttributesCompatParcelizer(drawable) : null;
        this.MediaDescriptionCompat = audioAttributesCompatParcelizer;
        super.setSelector(audioAttributesCompatParcelizer);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.AudioAttributesImplBaseParcelizer = rect.left;
        this.MediaMetadataCompat = rect.top;
        this.MediaBrowserCompatCustomActionResultReceiver = rect.right;
        this.MediaBrowserCompatItemReceiver = rect.bottom;
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        if (this.AudioAttributesCompatParcelizer != null) {
            return;
        }
        super.drawableStateChanged();
        write(true);
        IconCompatParcelizer();
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        AudioAttributesCompatParcelizer(canvas);
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.AudioAttributesImplApi26Parcelizer = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        AudioAttributesImplApi26Parcelizer audioAttributesImplApi26Parcelizer = this.AudioAttributesCompatParcelizer;
        if (audioAttributesImplApi26Parcelizer != null) {
            audioAttributesImplApi26Parcelizer.IconCompatParcelizer();
        }
        return super.onTouchEvent(motionEvent);
    }

    public int read(int i, int i2, int i3, int i4, int i5) {
        int iMakeMeasureSpec;
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        int measuredHeight = listPaddingTop + listPaddingBottom;
        if (adapter == null) {
            return measuredHeight;
        }
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        View view = null;
        while (i6 < count) {
            int itemViewType = adapter.getItemViewType(i6);
            if (itemViewType != i7) {
                view = null;
                i7 = itemViewType;
            }
            view = adapter.getView(i6, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            if (layoutParams.height > 0) {
                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(layoutParams.height, 1073741824);
            } else {
                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            }
            view.measure(i, iMakeMeasureSpec);
            view.forceLayout();
            if (i6 > 0) {
                measuredHeight += dividerHeight;
            }
            measuredHeight += view.getMeasuredHeight();
            if (measuredHeight >= i4) {
                return (i5 < 0 || i6 <= i5 || i8 <= 0 || measuredHeight == i4) ? i4 : i8;
            }
            if (i5 >= 0 && i6 >= i5) {
                i8 = measuredHeight;
            }
            i6++;
        }
        return measuredHeight;
    }

    private void write(boolean z) {
        AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = this.MediaDescriptionCompat;
        if (audioAttributesCompatParcelizer != null) {
            audioAttributesCompatParcelizer.RemoteActionCompatParcelizer(z);
        }
    }

    static class AudioAttributesCompatParcelizer extends getLastCustomNonConfigurationInstance {
        private boolean AudioAttributesCompatParcelizer;

        AudioAttributesCompatParcelizer(Drawable drawable) {
            super(drawable);
            this.AudioAttributesCompatParcelizer = true;
        }

        final void RemoteActionCompatParcelizer(boolean z) {
            this.AudioAttributesCompatParcelizer = z;
        }

        @Override // kotlin.getLastCustomNonConfigurationInstance, android.graphics.drawable.Drawable
        public final boolean setState(int[] iArr) {
            if (this.AudioAttributesCompatParcelizer) {
                return super.setState(iArr);
            }
            return false;
        }

        @Override // kotlin.getLastCustomNonConfigurationInstance, android.graphics.drawable.Drawable
        public final void draw(Canvas canvas) {
            if (this.AudioAttributesCompatParcelizer) {
                super.draw(canvas);
            }
        }

        @Override // kotlin.getLastCustomNonConfigurationInstance, android.graphics.drawable.Drawable
        public final void setHotspot(float f, float f2) {
            if (this.AudioAttributesCompatParcelizer) {
                super.setHotspot(f, f2);
            }
        }

        @Override // kotlin.getLastCustomNonConfigurationInstance, android.graphics.drawable.Drawable
        public final void setHotspotBounds(int i, int i2, int i3, int i4) {
            if (this.AudioAttributesCompatParcelizer) {
                super.setHotspotBounds(i, i2, i3, i4);
            }
        }

        @Override // kotlin.getLastCustomNonConfigurationInstance, android.graphics.drawable.Drawable
        public final boolean setVisible(boolean z, boolean z2) {
            if (this.AudioAttributesCompatParcelizer) {
                return super.setVisible(z, z2);
            }
            return false;
        }
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.AudioAttributesCompatParcelizer == null) {
            AudioAttributesImplApi26Parcelizer audioAttributesImplApi26Parcelizer = new AudioAttributesImplApi26Parcelizer();
            this.AudioAttributesCompatParcelizer = audioAttributesImplApi26Parcelizer;
            audioAttributesImplApi26Parcelizer.read();
        }
        boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked == 9 || actionMasked == 7) {
            int iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (iPointToPosition != -1 && iPointToPosition != getSelectedItemPosition()) {
                View childAt = getChildAt(iPointToPosition - getFirstVisiblePosition());
                if (childAt.isEnabled()) {
                    requestFocus();
                    if (Build.VERSION.SDK_INT >= 30 && write.read()) {
                        write.read(this, iPointToPosition, childAt);
                    } else {
                        setSelectionFromTop(iPointToPosition, childAt.getTop() - getTop());
                    }
                }
                IconCompatParcelizer();
            }
            return zOnHoverEvent;
        }
        setSelection(-1);
        return zOnHoverEvent;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        this.AudioAttributesCompatParcelizer = null;
        super.onDetachedFromWindow();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean IconCompatParcelizer(android.view.MotionEvent r8, int r9) {
        /*
            r7 = this;
            int r0 = r8.getActionMasked()
            r1 = 0
            r2 = 1
            if (r0 == r2) goto L11
            r3 = 2
            if (r0 == r3) goto Lf
            r9 = 3
            if (r0 == r9) goto L42
            goto L3f
        Lf:
            r3 = r2
            goto L12
        L11:
            r3 = r1
        L12:
            int r9 = r8.findPointerIndex(r9)
            if (r9 < 0) goto L42
            float r4 = r8.getX(r9)
            int r4 = (int) r4
            float r9 = r8.getY(r9)
            int r9 = (int) r9
            int r5 = r7.pointToPosition(r4, r9)
            r6 = -1
            if (r5 != r6) goto L2b
            r9 = r2
            goto L44
        L2b:
            int r3 = r7.getFirstVisiblePosition()
            int r3 = r5 - r3
            android.view.View r3 = r7.getChildAt(r3)
            float r4 = (float) r4
            float r9 = (float) r9
            r7.read(r3, r5, r4, r9)
            if (r0 != r2) goto L3f
            r7.read(r3, r5)
        L3f:
            r9 = r1
            r3 = r2
            goto L44
        L42:
            r9 = r1
            r3 = r9
        L44:
            if (r3 == 0) goto L48
            if (r9 == 0) goto L4b
        L48:
            r7.write()
        L4b:
            if (r3 == 0) goto L63
            o._addAnnotationsIfNotPresent r9 = r7.AudioAttributesImplApi21Parcelizer
            if (r9 != 0) goto L58
            o._addAnnotationsIfNotPresent r9 = new o._addAnnotationsIfNotPresent
            r9.<init>(r7)
            r7.AudioAttributesImplApi21Parcelizer = r9
        L58:
            o._addAnnotationsIfNotPresent r9 = r7.AudioAttributesImplApi21Parcelizer
            r9.RemoteActionCompatParcelizer(r2)
            o._addAnnotationsIfNotPresent r9 = r7.AudioAttributesImplApi21Parcelizer
            r9.onTouch(r7, r8)
            return r3
        L63:
            o._addAnnotationsIfNotPresent r7 = r7.AudioAttributesImplApi21Parcelizer
            if (r7 == 0) goto L6a
            r7.RemoteActionCompatParcelizer(r1)
        L6a:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.Keep.IconCompatParcelizer(android.view.MotionEvent, int):boolean");
    }

    private void read(View view, int i) {
        performItemClick(view, i, getItemIdAtPosition(i));
    }

    public final void RemoteActionCompatParcelizer(boolean z) {
        this.IconCompatParcelizer = z;
    }

    private void IconCompatParcelizer() {
        Drawable selector = getSelector();
        if (selector != null && read() && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    private void AudioAttributesCompatParcelizer(Canvas canvas) {
        Drawable selector;
        if (this.MediaBrowserCompatSearchResultReceiver.isEmpty() || (selector = getSelector()) == null) {
            return;
        }
        selector.setBounds(this.MediaBrowserCompatSearchResultReceiver);
        selector.draw(canvas);
    }

    private void write(int i, View view, float f, float f2) {
        write(i, view);
        Drawable selector = getSelector();
        if (selector == null || i == -1) {
            return;
        }
        findFormatOverrides.AudioAttributesCompatParcelizer(selector, f, f2);
    }

    private void write(int i, View view) {
        Drawable selector = getSelector();
        boolean z = (selector == null || i == -1) ? false : true;
        if (z) {
            selector.setVisible(false, false);
        }
        IconCompatParcelizer(i, view);
        if (z) {
            Rect rect = this.MediaBrowserCompatSearchResultReceiver;
            float fExactCenterX = rect.exactCenterX();
            float fExactCenterY = rect.exactCenterY();
            selector.setVisible(getVisibility() == 0, false);
            findFormatOverrides.AudioAttributesCompatParcelizer(selector, fExactCenterX, fExactCenterY);
        }
    }

    private void IconCompatParcelizer(int i, View view) {
        Rect rect = this.MediaBrowserCompatSearchResultReceiver;
        rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        rect.left -= this.AudioAttributesImplBaseParcelizer;
        rect.top -= this.MediaMetadataCompat;
        rect.right += this.MediaBrowserCompatCustomActionResultReceiver;
        rect.bottom += this.MediaBrowserCompatItemReceiver;
        boolean zRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
        if (view.isEnabled() != zRemoteActionCompatParcelizer) {
            read(!zRemoteActionCompatParcelizer);
            if (i != -1) {
                refreshDrawableState();
            }
        }
    }

    private void write() {
        this.RemoteActionCompatParcelizer = false;
        setPressed(false);
        drawableStateChanged();
        View childAt = getChildAt(this.AudioAttributesImplApi26Parcelizer - getFirstVisiblePosition());
        if (childAt != null) {
            childAt.setPressed(false);
        }
    }

    private void read(View view, int i, float f, float f2) {
        View childAt;
        this.RemoteActionCompatParcelizer = true;
        read.IconCompatParcelizer(this, f, f2);
        if (!isPressed()) {
            setPressed(true);
        }
        layoutChildren();
        int i2 = this.AudioAttributesImplApi26Parcelizer;
        if (i2 != -1 && (childAt = getChildAt(i2 - getFirstVisiblePosition())) != null && childAt != view && childAt.isPressed()) {
            childAt.setPressed(false);
        }
        this.AudioAttributesImplApi26Parcelizer = i;
        read.IconCompatParcelizer(view, f - view.getLeft(), f2 - view.getTop());
        if (!view.isPressed()) {
            view.setPressed(true);
        }
        write(i, view, f, f2);
        write(false);
        refreshDrawableState();
    }

    private boolean read() {
        return this.RemoteActionCompatParcelizer;
    }

    class AudioAttributesImplApi26Parcelizer implements Runnable {
        AudioAttributesImplApi26Parcelizer() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            Keep.this.AudioAttributesCompatParcelizer = null;
            Keep.this.drawableStateChanged();
        }

        public final void IconCompatParcelizer() {
            Keep.this.AudioAttributesCompatParcelizer = null;
            Keep.this.removeCallbacks(this);
        }

        public final void read() {
            Keep.this.post(this);
        }
    }

    static class write {
        private static Method AudioAttributesCompatParcelizer;
        private static boolean IconCompatParcelizer;
        private static Method RemoteActionCompatParcelizer;
        private static Method write;

        static {
            try {
                Method declaredMethod = AbsListView.class.getDeclaredMethod("positionSelector", Integer.TYPE, View.class, Boolean.TYPE, Float.TYPE, Float.TYPE);
                write = declaredMethod;
                declaredMethod.setAccessible(true);
                Method declaredMethod2 = AdapterView.class.getDeclaredMethod("setSelectedPositionInt", Integer.TYPE);
                RemoteActionCompatParcelizer = declaredMethod2;
                declaredMethod2.setAccessible(true);
                Method declaredMethod3 = AdapterView.class.getDeclaredMethod("setNextSelectedPositionInt", Integer.TYPE);
                AudioAttributesCompatParcelizer = declaredMethod3;
                declaredMethod3.setAccessible(true);
                IconCompatParcelizer = true;
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            }
        }

        static boolean read() {
            return IconCompatParcelizer;
        }

        static void read(Keep keep, int i, View view) {
            try {
                write.invoke(keep, Integer.valueOf(i), view, Boolean.FALSE, -1, -1);
                RemoteActionCompatParcelizer.invoke(keep, Integer.valueOf(i));
                AudioAttributesCompatParcelizer.invoke(keep, Integer.valueOf(i));
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e2) {
                e2.printStackTrace();
            }
        }
    }

    static class read {
        static void IconCompatParcelizer(View view, float f, float f2) {
            view.drawableHotspotChanged(f, f2);
        }
    }

    static class IconCompatParcelizer {
        private static final Field RemoteActionCompatParcelizer;

        static {
            Field declaredField = null;
            try {
                declaredField = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e) {
                e.printStackTrace();
            }
            RemoteActionCompatParcelizer = declaredField;
        }

        static boolean RemoteActionCompatParcelizer(AbsListView absListView) {
            Field field = RemoteActionCompatParcelizer;
            if (field == null) {
                return false;
            }
            try {
                return field.getBoolean(absListView);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
                return false;
            }
        }

        static void read(AbsListView absListView, boolean z) {
            Field field = RemoteActionCompatParcelizer;
            if (field != null) {
                try {
                    field.set(absListView, Boolean.valueOf(z));
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    static class RemoteActionCompatParcelizer {
        static boolean write(AbsListView absListView) {
            return absListView.isSelectedChildViewEnabled();
        }

        static void IconCompatParcelizer(AbsListView absListView, boolean z) {
            absListView.setSelectedChildViewEnabled(z);
        }
    }
}
