package kotlin;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX INFO: loaded from: classes.dex */
public abstract class ActivityResult implements View.OnTouchListener, View.OnAttachStateChangeListener {
    private final int AudioAttributesCompatParcelizer;
    private final int[] AudioAttributesImplApi21Parcelizer = new int[2];
    private final int AudioAttributesImplApi26Parcelizer;
    final View IconCompatParcelizer;
    private Runnable MediaBrowserCompatCustomActionResultReceiver;
    private final float MediaBrowserCompatItemReceiver;
    private boolean RemoteActionCompatParcelizer;
    private Runnable read;
    private int write;

    public abstract removeOnContextAvailableListener AudioAttributesCompatParcelizer();

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }

    public ActivityResult(View view) {
        this.IconCompatParcelizer = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.MediaBrowserCompatItemReceiver = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.AudioAttributesImplApi26Parcelizer = tapTimeout;
        this.AudioAttributesCompatParcelizer = (tapTimeout + ViewConfiguration.getLongPressTimeout()) / 2;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z;
        boolean z2 = this.RemoteActionCompatParcelizer;
        if (z2) {
            z = IconCompatParcelizer(motionEvent) || !write();
        } else {
            z = RemoteActionCompatParcelizer(motionEvent) && read();
            if (z) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 0);
                this.IconCompatParcelizer.onTouchEvent(motionEventObtain);
                motionEventObtain.recycle();
            }
        }
        this.RemoteActionCompatParcelizer = z;
        return z || z2;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        this.RemoteActionCompatParcelizer = false;
        this.write = -1;
        Runnable runnable = this.read;
        if (runnable != null) {
            this.IconCompatParcelizer.removeCallbacks(runnable);
        }
    }

    protected boolean read() {
        removeOnContextAvailableListener removeoncontextavailablelistenerAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer();
        if (removeoncontextavailablelistenerAudioAttributesCompatParcelizer == null || removeoncontextavailablelistenerAudioAttributesCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver()) {
            return true;
        }
        removeoncontextavailablelistenerAudioAttributesCompatParcelizer.AudioAttributesImplBaseParcelizer();
        return true;
    }

    protected boolean write() {
        removeOnContextAvailableListener removeoncontextavailablelistenerAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer();
        if (removeoncontextavailablelistenerAudioAttributesCompatParcelizer == null || !removeoncontextavailablelistenerAudioAttributesCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver()) {
            return true;
        }
        removeoncontextavailablelistenerAudioAttributesCompatParcelizer.write();
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean RemoteActionCompatParcelizer(android.view.MotionEvent r6) {
        /*
            r5 = this;
            android.view.View r0 = r5.IconCompatParcelizer
            boolean r1 = r0.isEnabled()
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            int r1 = r6.getActionMasked()
            if (r1 == 0) goto L41
            r3 = 1
            if (r1 == r3) goto L3d
            r4 = 2
            if (r1 == r4) goto L1a
            r6 = 3
            if (r1 == r6) goto L3d
            goto L6d
        L1a:
            int r1 = r5.write
            int r1 = r6.findPointerIndex(r1)
            if (r1 < 0) goto L6d
            float r4 = r6.getX(r1)
            float r6 = r6.getY(r1)
            float r1 = r5.MediaBrowserCompatItemReceiver
            boolean r6 = read(r0, r4, r6, r1)
            if (r6 != 0) goto L6d
            r5.IconCompatParcelizer()
            android.view.ViewParent r5 = r0.getParent()
            r5.requestDisallowInterceptTouchEvent(r3)
            return r3
        L3d:
            r5.IconCompatParcelizer()
            goto L6d
        L41:
            int r6 = r6.getPointerId(r2)
            r5.write = r6
            java.lang.Runnable r6 = r5.read
            if (r6 != 0) goto L52
            o.ActivityResult$IconCompatParcelizer r6 = new o.ActivityResult$IconCompatParcelizer
            r6.<init>()
            r5.read = r6
        L52:
            java.lang.Runnable r6 = r5.read
            int r1 = r5.AudioAttributesImplApi26Parcelizer
            long r3 = (long) r1
            r0.postDelayed(r6, r3)
            java.lang.Runnable r6 = r5.MediaBrowserCompatCustomActionResultReceiver
            if (r6 != 0) goto L65
            o.ActivityResult$RemoteActionCompatParcelizer r6 = new o.ActivityResult$RemoteActionCompatParcelizer
            r6.<init>()
            r5.MediaBrowserCompatCustomActionResultReceiver = r6
        L65:
            java.lang.Runnable r6 = r5.MediaBrowserCompatCustomActionResultReceiver
            int r5 = r5.AudioAttributesCompatParcelizer
            long r3 = (long) r5
            r0.postDelayed(r6, r3)
        L6d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.ActivityResult.RemoteActionCompatParcelizer(android.view.MotionEvent):boolean");
    }

    private void IconCompatParcelizer() {
        Runnable runnable = this.MediaBrowserCompatCustomActionResultReceiver;
        if (runnable != null) {
            this.IconCompatParcelizer.removeCallbacks(runnable);
        }
        Runnable runnable2 = this.read;
        if (runnable2 != null) {
            this.IconCompatParcelizer.removeCallbacks(runnable2);
        }
    }

    void RemoteActionCompatParcelizer() {
        IconCompatParcelizer();
        View view = this.IconCompatParcelizer;
        if (view.isEnabled() && !view.isLongClickable() && read()) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
            long jUptimeMillis = SystemClock.uptimeMillis();
            MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 0);
            view.onTouchEvent(motionEventObtain);
            motionEventObtain.recycle();
            this.RemoteActionCompatParcelizer = true;
        }
    }

    private boolean IconCompatParcelizer(MotionEvent motionEvent) {
        Keep keep;
        View view = this.IconCompatParcelizer;
        removeOnContextAvailableListener removeoncontextavailablelistenerAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer();
        if (removeoncontextavailablelistenerAudioAttributesCompatParcelizer != null && removeoncontextavailablelistenerAudioAttributesCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver() && (keep = (Keep) removeoncontextavailablelistenerAudioAttributesCompatParcelizer.a_()) != null && keep.isShown()) {
            MotionEvent motionEventObtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
            read(view, motionEventObtainNoHistory);
            write(keep, motionEventObtainNoHistory);
            boolean zIconCompatParcelizer = keep.IconCompatParcelizer(motionEventObtainNoHistory, this.write);
            motionEventObtainNoHistory.recycle();
            int actionMasked = motionEvent.getActionMasked();
            boolean z = (actionMasked == 1 || actionMasked == 3) ? false : true;
            if (zIconCompatParcelizer && z) {
                return true;
            }
        }
        return false;
    }

    private static boolean read(View view, float f, float f2, float f3) {
        float f4 = -f3;
        return f >= f4 && f2 >= f4 && f < ((float) (view.getRight() - view.getLeft())) + f3 && f2 < ((float) (view.getBottom() - view.getTop())) + f3;
    }

    private boolean write(View view, MotionEvent motionEvent) {
        view.getLocationOnScreen(this.AudioAttributesImplApi21Parcelizer);
        motionEvent.offsetLocation(-r1[0], -r1[1]);
        return true;
    }

    private boolean read(View view, MotionEvent motionEvent) {
        view.getLocationOnScreen(this.AudioAttributesImplApi21Parcelizer);
        motionEvent.offsetLocation(r1[0], r1[1]);
        return true;
    }

    class IconCompatParcelizer implements Runnable {
        IconCompatParcelizer() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ViewParent parent = ActivityResult.this.IconCompatParcelizer.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
    }

    class RemoteActionCompatParcelizer implements Runnable {
        RemoteActionCompatParcelizer() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ActivityResult.this.RemoteActionCompatParcelizer();
        }
    }
}
