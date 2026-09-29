package androidx.media3.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import kotlin.maximumCapacity;

/* JADX INFO: loaded from: classes2.dex */
public final class AspectRatioFrameLayout extends FrameLayout {
    private final AudioAttributesCompatParcelizer IconCompatParcelizer;
    private IconCompatParcelizer RemoteActionCompatParcelizer;
    private float read;
    private int write;

    public interface IconCompatParcelizer {
    }

    public AspectRatioFrameLayout(Context context) {
        this(context, null);
    }

    public AspectRatioFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        byte b = 0;
        this.write = 0;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, maximumCapacity.MediaDescriptionCompat.AspectRatioFrameLayout, 0, 0);
            try {
                this.write = typedArrayObtainStyledAttributes.getInt(maximumCapacity.MediaDescriptionCompat.AspectRatioFrameLayout_resize_mode, 0);
            } finally {
                typedArrayObtainStyledAttributes.recycle();
            }
        }
        this.IconCompatParcelizer = new AudioAttributesCompatParcelizer(this, b);
    }

    public final void setAspectRatio(float f) {
        if (this.read != f) {
            this.read = f;
            requestLayout();
        }
    }

    public final void setAspectRatioListener(IconCompatParcelizer iconCompatParcelizer) {
        this.RemoteActionCompatParcelizer = iconCompatParcelizer;
    }

    public final int AudioAttributesCompatParcelizer() {
        return this.write;
    }

    public final void setResizeMode(int i) {
        if (this.write != i) {
            this.write = i;
            requestLayout();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004c  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void onMeasure(int r9, int r10) {
        /*
            r8 = this;
            super.onMeasure(r9, r10)
            float r9 = r8.read
            r10 = 0
            int r9 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
            if (r9 > 0) goto Lb
            return
        Lb:
            int r9 = r8.getMeasuredWidth()
            int r0 = r8.getMeasuredHeight()
            float r1 = (float) r9
            float r2 = (float) r0
            float r3 = r1 / r2
            float r4 = r8.read
            float r4 = r4 / r3
            r5 = 1065353216(0x3f800000, float:1.0)
            float r4 = r4 - r5
            float r5 = java.lang.Math.abs(r4)
            r6 = 1008981770(0x3c23d70a, float:0.01)
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 > 0) goto L31
            androidx.media3.ui.AspectRatioFrameLayout$AudioAttributesCompatParcelizer r9 = r8.IconCompatParcelizer
            float r8 = r8.read
            r10 = 0
            r9.IconCompatParcelizer(r8, r3, r10)
            return
        L31:
            int r5 = r8.write
            r6 = 1
            if (r5 == 0) goto L43
            if (r5 == r6) goto L4c
            r7 = 2
            if (r5 == r7) goto L47
            r7 = 4
            if (r5 != r7) goto L50
            int r10 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r10 <= 0) goto L4c
            goto L47
        L43:
            int r10 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r10 > 0) goto L4c
        L47:
            float r9 = r8.read
            float r2 = r2 * r9
            int r9 = (int) r2
            goto L50
        L4c:
            float r10 = r8.read
            float r1 = r1 / r10
            int r0 = (int) r1
        L50:
            androidx.media3.ui.AspectRatioFrameLayout$AudioAttributesCompatParcelizer r10 = r8.IconCompatParcelizer
            float r1 = r8.read
            r10.IconCompatParcelizer(r1, r3, r6)
            r10 = 1073741824(0x40000000, float:2.0)
            int r9 = android.view.View.MeasureSpec.makeMeasureSpec(r9, r10)
            int r10 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r10)
            super.onMeasure(r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.ui.AspectRatioFrameLayout.onMeasure(int, int):void");
    }

    final class AudioAttributesCompatParcelizer implements Runnable {
        private float IconCompatParcelizer;
        private boolean RemoteActionCompatParcelizer;
        private boolean read;
        private float write;

        private AudioAttributesCompatParcelizer() {
        }

        /* synthetic */ AudioAttributesCompatParcelizer(AspectRatioFrameLayout aspectRatioFrameLayout, byte b) {
            this();
        }

        public final void IconCompatParcelizer(float f, float f2, boolean z) {
            this.write = f;
            this.IconCompatParcelizer = f2;
            this.read = z;
            if (this.RemoteActionCompatParcelizer) {
                return;
            }
            this.RemoteActionCompatParcelizer = true;
            AspectRatioFrameLayout.this.post(this);
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.RemoteActionCompatParcelizer = false;
            if (AspectRatioFrameLayout.this.RemoteActionCompatParcelizer == null) {
                return;
            }
            IconCompatParcelizer unused = AspectRatioFrameLayout.this.RemoteActionCompatParcelizer;
        }
    }
}
