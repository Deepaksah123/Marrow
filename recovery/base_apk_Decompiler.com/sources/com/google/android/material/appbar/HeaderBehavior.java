package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import kotlin.InvalidTypeIdException;
import kotlin.StdKeyDeserializer;

/* JADX INFO: loaded from: classes3.dex */
abstract class HeaderBehavior<V extends View> extends ViewOffsetBehavior<V> {
    private boolean AudioAttributesCompatParcelizer;
    private VelocityTracker AudioAttributesImplApi21Parcelizer;
    OverScroller IconCompatParcelizer;
    private int MediaBrowserCompatItemReceiver;
    private int RemoteActionCompatParcelizer;
    private int read;
    private Runnable write;

    void AudioAttributesCompatParcelizer(CoordinatorLayout coordinatorLayout, V v) {
    }

    boolean IconCompatParcelizer(V v) {
        return false;
    }

    public HeaderBehavior() {
        this.RemoteActionCompatParcelizer = -1;
        this.MediaBrowserCompatItemReceiver = -1;
    }

    public HeaderBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.RemoteActionCompatParcelizer = -1;
        this.MediaBrowserCompatItemReceiver = -1;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean read(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        int iFindPointerIndex;
        if (this.MediaBrowserCompatItemReceiver < 0) {
            this.MediaBrowserCompatItemReceiver = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.AudioAttributesCompatParcelizer) {
            int i = this.RemoteActionCompatParcelizer;
            if (i == -1 || (iFindPointerIndex = motionEvent.findPointerIndex(i)) == -1) {
                return false;
            }
            int y = (int) motionEvent.getY(iFindPointerIndex);
            if (Math.abs(y - this.read) > this.MediaBrowserCompatItemReceiver) {
                this.read = y;
                return true;
            }
        }
        if (motionEvent.getActionMasked() == 0) {
            this.RemoteActionCompatParcelizer = -1;
            int x = (int) motionEvent.getX();
            int y2 = (int) motionEvent.getY();
            boolean z = IconCompatParcelizer(v) && coordinatorLayout.IconCompatParcelizer(v, x, y2);
            this.AudioAttributesCompatParcelizer = z;
            if (z) {
                this.read = y2;
                this.RemoteActionCompatParcelizer = motionEvent.getPointerId(0);
                write();
                OverScroller overScroller = this.IconCompatParcelizer;
                if (overScroller != null && !overScroller.isFinished()) {
                    this.IconCompatParcelizer.abortAnimation();
                    return true;
                }
            }
        }
        VelocityTracker velocityTracker = this.AudioAttributesImplApi21Parcelizer;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0087 A[ADDED_TO_REGION] */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean AudioAttributesCompatParcelizer(androidx.coordinatorlayout.widget.CoordinatorLayout r11, V r12, android.view.MotionEvent r13) {
        /*
            r10 = this;
            int r0 = r13.getActionMasked()
            r1 = -1
            r2 = 0
            r3 = 1
            if (r0 == r3) goto L4d
            r4 = 2
            if (r0 == r4) goto L2c
            r11 = 3
            if (r0 == r11) goto L6d
            r11 = 6
            if (r0 != r11) goto L4b
            int r11 = r13.getActionIndex()
            if (r11 != 0) goto L1a
            r11 = r3
            goto L1b
        L1a:
            r11 = r2
        L1b:
            int r12 = r13.getPointerId(r11)
            r10.RemoteActionCompatParcelizer = r12
            float r11 = r13.getY(r11)
            r12 = 1056964608(0x3f000000, float:0.5)
            float r11 = r11 + r12
            int r11 = (int) r11
            r10.read = r11
            goto L4b
        L2c:
            int r0 = r10.RemoteActionCompatParcelizer
            int r0 = r13.findPointerIndex(r0)
            if (r0 != r1) goto L35
            return r2
        L35:
            float r0 = r13.getY(r0)
            int r0 = (int) r0
            int r1 = r10.read
            r10.read = r0
            int r7 = r1 - r0
            int r8 = r10.RemoteActionCompatParcelizer(r12)
            r9 = 0
            r4 = r10
            r5 = r11
            r6 = r12
            r4.RemoteActionCompatParcelizer(r5, r6, r7, r8, r9)
        L4b:
            r11 = r2
            goto L7c
        L4d:
            android.view.VelocityTracker r0 = r10.AudioAttributesImplApi21Parcelizer
            if (r0 == 0) goto L6d
            r0.addMovement(r13)
            android.view.VelocityTracker r0 = r10.AudioAttributesImplApi21Parcelizer
            r4 = 1000(0x3e8, float:1.401E-42)
            r0.computeCurrentVelocity(r4)
            android.view.VelocityTracker r0 = r10.AudioAttributesImplApi21Parcelizer
            int r4 = r10.RemoteActionCompatParcelizer
            float r0 = r0.getYVelocity(r4)
            int r4 = r10.write(r12)
            int r4 = -r4
            r10.IconCompatParcelizer(r11, r12, r4, r0)
            r11 = r3
            goto L6e
        L6d:
            r11 = r2
        L6e:
            r10.AudioAttributesCompatParcelizer = r2
            r10.RemoteActionCompatParcelizer = r1
            android.view.VelocityTracker r12 = r10.AudioAttributesImplApi21Parcelizer
            if (r12 == 0) goto L7c
            r12.recycle()
            r12 = 0
            r10.AudioAttributesImplApi21Parcelizer = r12
        L7c:
            android.view.VelocityTracker r12 = r10.AudioAttributesImplApi21Parcelizer
            if (r12 == 0) goto L83
            r12.addMovement(r13)
        L83:
            boolean r10 = r10.AudioAttributesCompatParcelizer
            if (r10 != 0) goto L8a
            if (r11 != 0) goto L8a
            return r2
        L8a:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.HeaderBehavior.AudioAttributesCompatParcelizer(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    final int IconCompatParcelizer(CoordinatorLayout coordinatorLayout, V v, int i) {
        return read(coordinatorLayout, v, i, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    int read(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3) {
        int i4;
        int i5 = read();
        if (i2 == 0 || i5 < i2 || i5 > i3 || i5 == (i4 = StdKeyDeserializer.read(i, i2, i3))) {
            return 0;
        }
        RemoteActionCompatParcelizer(i4);
        return i5 - i4;
    }

    int RemoteActionCompatParcelizer() {
        return read();
    }

    final int RemoteActionCompatParcelizer(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3) {
        return read(coordinatorLayout, v, RemoteActionCompatParcelizer() - i, i2, i3);
    }

    private boolean IconCompatParcelizer(CoordinatorLayout coordinatorLayout, V v, int i, float f) {
        Runnable runnable = this.write;
        if (runnable != null) {
            v.removeCallbacks(runnable);
            this.write = null;
        }
        if (this.IconCompatParcelizer == null) {
            this.IconCompatParcelizer = new OverScroller(v.getContext());
        }
        this.IconCompatParcelizer.fling(0, read(), 0, Math.round(f), 0, 0, i, 0);
        if (this.IconCompatParcelizer.computeScrollOffset()) {
            read readVar = new read(coordinatorLayout, v);
            this.write = readVar;
            InvalidTypeIdException.AudioAttributesCompatParcelizer(v, readVar);
            return true;
        }
        AudioAttributesCompatParcelizer(coordinatorLayout, v);
        return false;
    }

    int RemoteActionCompatParcelizer(V v) {
        return -v.getHeight();
    }

    int write(V v) {
        return v.getHeight();
    }

    private void write() {
        if (this.AudioAttributesImplApi21Parcelizer == null) {
            this.AudioAttributesImplApi21Parcelizer = VelocityTracker.obtain();
        }
    }

    class read implements Runnable {
        private final CoordinatorLayout RemoteActionCompatParcelizer;
        private final V read;

        read(CoordinatorLayout coordinatorLayout, V v) {
            this.RemoteActionCompatParcelizer = coordinatorLayout;
            this.read = v;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.read == null || HeaderBehavior.this.IconCompatParcelizer == null) {
                return;
            }
            if (HeaderBehavior.this.IconCompatParcelizer.computeScrollOffset()) {
                HeaderBehavior headerBehavior = HeaderBehavior.this;
                headerBehavior.IconCompatParcelizer(this.RemoteActionCompatParcelizer, this.read, headerBehavior.IconCompatParcelizer.getCurrY());
                InvalidTypeIdException.AudioAttributesCompatParcelizer(this.read, this);
                return;
            }
            HeaderBehavior.this.AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer, this.read);
        }
    }
}
