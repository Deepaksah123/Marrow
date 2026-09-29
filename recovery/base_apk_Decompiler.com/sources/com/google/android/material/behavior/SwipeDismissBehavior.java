package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.InvalidTypeIdException;
import kotlin.call;
import kotlin.hasSuperClassStartingWith;
import kotlin.modifyFieldName;

/* JADX INFO: loaded from: classes3.dex */
public class SwipeDismissBehavior<V extends View> extends CoordinatorLayout.Behavior<V> {
    private boolean AudioAttributesImplApi21Parcelizer;
    call AudioAttributesImplApi26Parcelizer;
    private boolean MediaBrowserCompatItemReceiver;
    private boolean MediaDescriptionCompat;
    IconCompatParcelizer read;
    private float AudioAttributesImplBaseParcelizer = BitmapDescriptorFactory.HUE_RED;
    int write = 2;
    float AudioAttributesCompatParcelizer = 0.5f;
    float RemoteActionCompatParcelizer = BitmapDescriptorFactory.HUE_RED;
    float IconCompatParcelizer = 0.5f;
    private final call.IconCompatParcelizer MediaBrowserCompatCustomActionResultReceiver = new call.IconCompatParcelizer() { // from class: com.google.android.material.behavior.SwipeDismissBehavior.5
        private int RemoteActionCompatParcelizer;
        private int read = -1;

        @Override // o.call.IconCompatParcelizer
        public final boolean read(View view, int i) {
            int i2 = this.read;
            return (i2 == -1 || i2 == i) && SwipeDismissBehavior.this.IconCompatParcelizer(view);
        }

        @Override // o.call.IconCompatParcelizer
        public final void RemoteActionCompatParcelizer(View view, int i) {
            this.read = i;
            this.RemoteActionCompatParcelizer = view.getLeft();
            ViewParent parent = view.getParent();
            if (parent != null) {
                SwipeDismissBehavior.this.AudioAttributesImplApi21Parcelizer = true;
                parent.requestDisallowInterceptTouchEvent(true);
                SwipeDismissBehavior.this.AudioAttributesImplApi21Parcelizer = false;
            }
        }

        @Override // o.call.IconCompatParcelizer
        public final void IconCompatParcelizer(int i) {
            if (SwipeDismissBehavior.this.read != null) {
                SwipeDismissBehavior.this.read.AudioAttributesCompatParcelizer(i);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:9:0x001c  */
        @Override // o.call.IconCompatParcelizer
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void read(android.view.View r3, float r4, float r5) {
            /*
                r2 = this;
                r5 = -1
                r2.read = r5
                int r5 = r3.getWidth()
                boolean r0 = r2.read(r3, r4)
                if (r0 == 0) goto L22
                r0 = 0
                int r4 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r4 < 0) goto L1c
                int r4 = r3.getLeft()
                int r0 = r2.RemoteActionCompatParcelizer
                if (r4 < r0) goto L1c
                int r0 = r0 + r5
                goto L20
            L1c:
                int r4 = r2.RemoteActionCompatParcelizer
                int r0 = r4 - r5
            L20:
                r4 = 1
                goto L25
            L22:
                int r0 = r2.RemoteActionCompatParcelizer
                r4 = 0
            L25:
                com.google.android.material.behavior.SwipeDismissBehavior r5 = com.google.android.material.behavior.SwipeDismissBehavior.this
                o.call r5 = r5.AudioAttributesImplApi26Parcelizer
                int r1 = r3.getTop()
                boolean r5 = r5.RemoteActionCompatParcelizer(r0, r1)
                if (r5 == 0) goto L3e
                com.google.android.material.behavior.SwipeDismissBehavior$RemoteActionCompatParcelizer r5 = new com.google.android.material.behavior.SwipeDismissBehavior$RemoteActionCompatParcelizer
                com.google.android.material.behavior.SwipeDismissBehavior r2 = com.google.android.material.behavior.SwipeDismissBehavior.this
                r5.<init>(r3, r4)
                kotlin.InvalidTypeIdException.AudioAttributesCompatParcelizer(r3, r5)
                return
            L3e:
                if (r4 == 0) goto L4d
                com.google.android.material.behavior.SwipeDismissBehavior r4 = com.google.android.material.behavior.SwipeDismissBehavior.this
                com.google.android.material.behavior.SwipeDismissBehavior$IconCompatParcelizer r4 = r4.read
                if (r4 == 0) goto L4d
                com.google.android.material.behavior.SwipeDismissBehavior r2 = com.google.android.material.behavior.SwipeDismissBehavior.this
                com.google.android.material.behavior.SwipeDismissBehavior$IconCompatParcelizer r2 = r2.read
                r2.read(r3)
            L4d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.behavior.SwipeDismissBehavior.AnonymousClass5.read(android.view.View, float, float):void");
        }

        private boolean read(View view, float f) {
            if (f == BitmapDescriptorFactory.HUE_RED) {
                return Math.abs(view.getLeft() - this.RemoteActionCompatParcelizer) >= Math.round(((float) view.getWidth()) * SwipeDismissBehavior.this.AudioAttributesCompatParcelizer);
            }
            boolean z = InvalidTypeIdException.MediaBrowserCompatMediaItem(view) == 1;
            if (SwipeDismissBehavior.this.write == 2) {
                return true;
            }
            if (SwipeDismissBehavior.this.write == 0) {
                return z ? f < BitmapDescriptorFactory.HUE_RED : f > BitmapDescriptorFactory.HUE_RED;
            }
            if (SwipeDismissBehavior.this.write == 1) {
                if (z) {
                    return f > BitmapDescriptorFactory.HUE_RED;
                }
                if (f < BitmapDescriptorFactory.HUE_RED) {
                    return true;
                }
            }
            return false;
        }

        @Override // o.call.IconCompatParcelizer
        public final int AudioAttributesCompatParcelizer(View view) {
            return view.getWidth();
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
        @Override // o.call.IconCompatParcelizer
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final int IconCompatParcelizer(android.view.View r4, int r5) {
            /*
                r3 = this;
                int r0 = kotlin.InvalidTypeIdException.MediaBrowserCompatMediaItem(r4)
                r1 = 1
                if (r0 != r1) goto L9
                r0 = r1
                goto La
            L9:
                r0 = 0
            La:
                com.google.android.material.behavior.SwipeDismissBehavior r2 = com.google.android.material.behavior.SwipeDismissBehavior.this
                int r2 = r2.write
                if (r2 != 0) goto L1c
                if (r0 == 0) goto L2e
                int r0 = r3.RemoteActionCompatParcelizer
                int r4 = r4.getWidth()
                int r0 = r0 - r4
                int r3 = r3.RemoteActionCompatParcelizer
                goto L44
            L1c:
                com.google.android.material.behavior.SwipeDismissBehavior r2 = com.google.android.material.behavior.SwipeDismissBehavior.this
                int r2 = r2.write
                if (r2 != r1) goto L36
                if (r0 != 0) goto L2e
                int r0 = r3.RemoteActionCompatParcelizer
                int r4 = r4.getWidth()
                int r0 = r0 - r4
                int r3 = r3.RemoteActionCompatParcelizer
                goto L44
            L2e:
                int r0 = r3.RemoteActionCompatParcelizer
                int r3 = r4.getWidth()
                int r3 = r3 + r0
                goto L44
            L36:
                int r0 = r3.RemoteActionCompatParcelizer
                int r1 = r4.getWidth()
                int r0 = r0 - r1
                int r3 = r3.RemoteActionCompatParcelizer
                int r4 = r4.getWidth()
                int r3 = r3 + r4
            L44:
                int r3 = com.google.android.material.behavior.SwipeDismissBehavior.RemoteActionCompatParcelizer(r0, r5, r3)
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.behavior.SwipeDismissBehavior.AnonymousClass5.IconCompatParcelizer(android.view.View, int):int");
        }

        @Override // o.call.IconCompatParcelizer
        public final int AudioAttributesCompatParcelizer(View view, int i) {
            return view.getTop();
        }

        @Override // o.call.IconCompatParcelizer
        public final void AudioAttributesCompatParcelizer(View view, int i, int i2) {
            float width = view.getWidth() * SwipeDismissBehavior.this.RemoteActionCompatParcelizer;
            float width2 = view.getWidth() * SwipeDismissBehavior.this.IconCompatParcelizer;
            float fAbs = Math.abs(i - this.RemoteActionCompatParcelizer);
            if (fAbs <= width) {
                view.setAlpha(1.0f);
            } else if (fAbs >= width2) {
                view.setAlpha(BitmapDescriptorFactory.HUE_RED);
            } else {
                view.setAlpha(SwipeDismissBehavior.IconCompatParcelizer(1.0f - SwipeDismissBehavior.read(width, width2, fAbs)));
            }
        }
    };

    public interface IconCompatParcelizer {
        void AudioAttributesCompatParcelizer(int i);

        void read(View view);
    }

    static float read(float f, float f2, float f3) {
        return (f3 - f) / (f2 - f);
    }

    public boolean IconCompatParcelizer(View view) {
        return true;
    }

    public final void AudioAttributesCompatParcelizer(IconCompatParcelizer iconCompatParcelizer) {
        this.read = iconCompatParcelizer;
    }

    public final void write() {
        this.write = 0;
    }

    public final void RemoteActionCompatParcelizer() {
        this.RemoteActionCompatParcelizer = IconCompatParcelizer(0.1f);
    }

    public final void read() {
        this.IconCompatParcelizer = IconCompatParcelizer(0.6f);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean write(CoordinatorLayout coordinatorLayout, V v, int i) {
        boolean zWrite = super.write(coordinatorLayout, v, i);
        if (InvalidTypeIdException.MediaBrowserCompatItemReceiver(v) == 0) {
            InvalidTypeIdException.AudioAttributesImplBaseParcelizer(v, 1);
            write(v);
        }
        return zWrite;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean read(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        boolean zIconCompatParcelizer = this.MediaBrowserCompatItemReceiver;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            zIconCompatParcelizer = coordinatorLayout.IconCompatParcelizer(v, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.MediaBrowserCompatItemReceiver = zIconCompatParcelizer;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.MediaBrowserCompatItemReceiver = false;
        }
        if (zIconCompatParcelizer) {
            write((ViewGroup) coordinatorLayout);
            if (!this.AudioAttributesImplApi21Parcelizer && this.AudioAttributesImplApi26Parcelizer.read(motionEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean AudioAttributesCompatParcelizer(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        if (this.AudioAttributesImplApi26Parcelizer == null) {
            return false;
        }
        if (this.AudioAttributesImplApi21Parcelizer && motionEvent.getActionMasked() == 3) {
            return true;
        }
        this.AudioAttributesImplApi26Parcelizer.IconCompatParcelizer(motionEvent);
        return true;
    }

    private void write(ViewGroup viewGroup) {
        if (this.AudioAttributesImplApi26Parcelizer == null) {
            this.AudioAttributesImplApi26Parcelizer = call.AudioAttributesCompatParcelizer(viewGroup, this.MediaBrowserCompatCustomActionResultReceiver);
        }
    }

    class RemoteActionCompatParcelizer implements Runnable {
        private final View read;
        private final boolean write;

        RemoteActionCompatParcelizer(View view, boolean z) {
            this.read = view;
            this.write = z;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (SwipeDismissBehavior.this.AudioAttributesImplApi26Parcelizer != null && SwipeDismissBehavior.this.AudioAttributesImplApi26Parcelizer.IconCompatParcelizer()) {
                InvalidTypeIdException.AudioAttributesCompatParcelizer(this.read, this);
            } else {
                if (!this.write || SwipeDismissBehavior.this.read == null) {
                    return;
                }
                SwipeDismissBehavior.this.read.read(this.read);
            }
        }
    }

    private void write(View view) {
        InvalidTypeIdException.RemoteActionCompatParcelizer(view, ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES);
        if (IconCompatParcelizer(view)) {
            InvalidTypeIdException.IconCompatParcelizer(view, hasSuperClassStartingWith.read.AudioAttributesImplApi26Parcelizer, null, new modifyFieldName() { // from class: com.google.android.material.behavior.SwipeDismissBehavior.3
                @Override // kotlin.modifyFieldName
                public final boolean read(View view2) {
                    if (!SwipeDismissBehavior.this.IconCompatParcelizer(view2)) {
                        return false;
                    }
                    boolean z = InvalidTypeIdException.MediaBrowserCompatMediaItem(view2) == 1;
                    InvalidTypeIdException.AudioAttributesCompatParcelizer(view2, (!(SwipeDismissBehavior.this.write == 0 && z) && (SwipeDismissBehavior.this.write != 1 || z)) ? view2.getWidth() : -view2.getWidth());
                    view2.setAlpha(BitmapDescriptorFactory.HUE_RED);
                    if (SwipeDismissBehavior.this.read != null) {
                        SwipeDismissBehavior.this.read.read(view2);
                    }
                    return true;
                }
            });
        }
    }

    static float IconCompatParcelizer(float f) {
        return Math.min(Math.max(BitmapDescriptorFactory.HUE_RED, f), 1.0f);
    }

    static int RemoteActionCompatParcelizer(int i, int i2, int i3) {
        return Math.min(Math.max(i, i2), i3);
    }
}
