package kotlin;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class call {
    private static final Interpolator RemoteActionCompatParcelizer = new Interpolator() { // from class: o.call.3
        @Override // android.animation.TimeInterpolator
        public final float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    };
    private View AudioAttributesCompatParcelizer;
    private int AudioAttributesImplApi21Parcelizer;
    private int[] AudioAttributesImplApi26Parcelizer;
    private int[] AudioAttributesImplBaseParcelizer;
    private final int IconCompatParcelizer;
    private int[] MediaBrowserCompatCustomActionResultReceiver;
    private int MediaBrowserCompatItemReceiver;
    private float[] MediaBrowserCompatMediaItem;
    private float[] MediaBrowserCompatSearchResultReceiver;
    private int MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    private float[] MediaDescriptionCompat;
    private float[] MediaMetadataCompat;
    private float RatingCompat;
    private boolean handleMediaPlayPauseIfPendingOnHandler;
    private float onAddQueueItem;
    private final ViewGroup onCommand;
    private OverScroller onCustomAction;
    private int onFastForward;
    private VelocityTracker onPlay;
    private int onPlayFromMediaId;
    private final IconCompatParcelizer read;
    private int write = -1;
    private final Runnable onMediaButtonEvent = new Runnable() { // from class: o.call.5
        @Override // java.lang.Runnable
        public final void run() {
            call.this.IconCompatParcelizer(0);
        }
    };

    public static abstract class IconCompatParcelizer {
        public static int write(int i) {
            return i;
        }

        public int AudioAttributesCompatParcelizer(View view) {
            return 0;
        }

        public int AudioAttributesCompatParcelizer(View view, int i) {
            return 0;
        }

        public void AudioAttributesCompatParcelizer(View view, int i, int i2) {
        }

        public int IconCompatParcelizer() {
            return 0;
        }

        public int IconCompatParcelizer(View view, int i) {
            return 0;
        }

        public void IconCompatParcelizer(int i) {
        }

        public void IconCompatParcelizer(int i, int i2) {
        }

        public void RemoteActionCompatParcelizer(View view, int i) {
        }

        public void read(View view, float f, float f2) {
        }

        public abstract boolean read(View view, int i);

        public void write() {
        }
    }

    public static call AudioAttributesCompatParcelizer(ViewGroup viewGroup, IconCompatParcelizer iconCompatParcelizer) {
        return new call(viewGroup.getContext(), viewGroup, iconCompatParcelizer);
    }

    public static call AudioAttributesCompatParcelizer(ViewGroup viewGroup, float f, IconCompatParcelizer iconCompatParcelizer) {
        call callVarAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(viewGroup, iconCompatParcelizer);
        callVarAudioAttributesCompatParcelizer.onFastForward = (int) (callVarAudioAttributesCompatParcelizer.onFastForward * (1.0f / f));
        return callVarAudioAttributesCompatParcelizer;
    }

    private call(Context context, ViewGroup viewGroup, IconCompatParcelizer iconCompatParcelizer) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        }
        if (iconCompatParcelizer == null) {
            throw new IllegalArgumentException("Callback may not be null");
        }
        this.onCommand = viewGroup;
        this.read = iconCompatParcelizer;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        int i = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
        this.IconCompatParcelizer = i;
        this.AudioAttributesImplApi21Parcelizer = i;
        this.onFastForward = viewConfiguration.getScaledTouchSlop();
        this.RatingCompat = viewConfiguration.getScaledMaximumFlingVelocity();
        this.onAddQueueItem = viewConfiguration.getScaledMinimumFlingVelocity();
        this.onCustomAction = new OverScroller(context, RemoteActionCompatParcelizer);
    }

    public final void write(float f) {
        this.onAddQueueItem = f;
    }

    public final int MediaBrowserCompatItemReceiver() {
        return this.MediaBrowserCompatItemReceiver;
    }

    public final void RemoteActionCompatParcelizer(int i) {
        this.onPlayFromMediaId = i;
    }

    public final int AudioAttributesImplApi26Parcelizer() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    public final void AudioAttributesCompatParcelizer(int i) {
        this.AudioAttributesImplApi21Parcelizer = i;
    }

    public final int MediaBrowserCompatCustomActionResultReceiver() {
        return this.IconCompatParcelizer;
    }

    public final void read(View view, int i) {
        if (view.getParent() != this.onCommand) {
            StringBuilder sb = new StringBuilder("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (");
            sb.append(this.onCommand);
            sb.append(")");
            throw new IllegalArgumentException(sb.toString());
        }
        this.AudioAttributesCompatParcelizer = view;
        this.write = i;
        this.read.RemoteActionCompatParcelizer(view, i);
        IconCompatParcelizer(1);
    }

    public final View AudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final int AudioAttributesImplBaseParcelizer() {
        return this.onFastForward;
    }

    public final void write() {
        this.write = -1;
        AudioAttributesImplApi21Parcelizer();
        VelocityTracker velocityTracker = this.onPlay;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.onPlay = null;
        }
    }

    public final void RemoteActionCompatParcelizer() {
        write();
        if (this.MediaBrowserCompatItemReceiver == 2) {
            this.onCustomAction.getCurrX();
            this.onCustomAction.getCurrY();
            this.onCustomAction.abortAnimation();
            this.read.AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer, this.onCustomAction.getCurrX(), this.onCustomAction.getCurrY());
        }
        IconCompatParcelizer(0);
    }

    public final boolean AudioAttributesCompatParcelizer(View view, int i, int i2) {
        this.AudioAttributesCompatParcelizer = view;
        this.write = -1;
        boolean zAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(i, i2, 0, 0);
        if (!zAudioAttributesCompatParcelizer && this.MediaBrowserCompatItemReceiver == 0 && this.AudioAttributesCompatParcelizer != null) {
            this.AudioAttributesCompatParcelizer = null;
        }
        return zAudioAttributesCompatParcelizer;
    }

    public final boolean RemoteActionCompatParcelizer(int i, int i2) {
        if (!this.handleMediaPlayPauseIfPendingOnHandler) {
            throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
        }
        return AudioAttributesCompatParcelizer(i, i2, (int) this.onPlay.getXVelocity(this.write), (int) this.onPlay.getYVelocity(this.write));
    }

    private boolean AudioAttributesCompatParcelizer(int i, int i2, int i3, int i4) {
        int left = this.AudioAttributesCompatParcelizer.getLeft();
        int top = this.AudioAttributesCompatParcelizer.getTop();
        int i5 = i - left;
        int i6 = i2 - top;
        if (i5 == 0 && i6 == 0) {
            this.onCustomAction.abortAnimation();
            IconCompatParcelizer(0);
            return false;
        }
        this.onCustomAction.startScroll(left, top, i5, i6, AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer, i5, i6, i3, i4));
        IconCompatParcelizer(2);
        return true;
    }

    private int AudioAttributesCompatParcelizer(View view, int i, int i2, int i3, int i4) {
        float f;
        float f2;
        float f3;
        float f4;
        int i5 = read(i3, (int) this.onAddQueueItem, (int) this.RatingCompat);
        int i6 = read(i4, (int) this.onAddQueueItem, (int) this.RatingCompat);
        int iAbs = Math.abs(i);
        int iAbs2 = Math.abs(i2);
        int iAbs3 = Math.abs(i5);
        int iAbs4 = Math.abs(i6);
        int i7 = iAbs3 + iAbs4;
        int i8 = iAbs + iAbs2;
        if (i5 != 0) {
            f = iAbs3;
            f2 = i7;
        } else {
            f = iAbs;
            f2 = i8;
        }
        float f5 = f / f2;
        if (i6 != 0) {
            f3 = iAbs4;
            f4 = i7;
        } else {
            f3 = iAbs2;
            f4 = i8;
        }
        return (int) ((IconCompatParcelizer(i, i5, this.read.AudioAttributesCompatParcelizer(view)) * f5) + (IconCompatParcelizer(i2, i6, this.read.IconCompatParcelizer()) * (f3 / f4)));
    }

    private int IconCompatParcelizer(int i, int i2, int i3) {
        int iAbs;
        if (i == 0) {
            return 0;
        }
        int width = this.onCommand.getWidth();
        float f = width / 2;
        float fAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(Math.min(1.0f, Math.abs(i) / width));
        int iAbs2 = Math.abs(i2);
        if (iAbs2 > 0) {
            iAbs = Math.round(Math.abs((f + (fAudioAttributesCompatParcelizer * f)) / iAbs2) * 1000.0f) << 2;
        } else {
            iAbs = (int) (((Math.abs(i) / i3) + 1.0f) * 256.0f);
        }
        return Math.min(iAbs, 600);
    }

    private static int read(int i, int i2, int i3) {
        int iAbs = Math.abs(i);
        if (iAbs < i2) {
            return 0;
        }
        return iAbs > i3 ? i > 0 ? i3 : -i3 : i;
    }

    private static float IconCompatParcelizer(float f, float f2, float f3) {
        float fAbs = Math.abs(f);
        return fAbs < f2 ? BitmapDescriptorFactory.HUE_RED : fAbs > f3 ? f > BitmapDescriptorFactory.HUE_RED ? f3 : -f3 : f;
    }

    private static float AudioAttributesCompatParcelizer(float f) {
        return (float) Math.sin((f - 0.5f) * 0.47123894f);
    }

    public final boolean IconCompatParcelizer() {
        if (this.MediaBrowserCompatItemReceiver == 2) {
            boolean zComputeScrollOffset = this.onCustomAction.computeScrollOffset();
            int currX = this.onCustomAction.getCurrX();
            int currY = this.onCustomAction.getCurrY();
            int left = currX - this.AudioAttributesCompatParcelizer.getLeft();
            int top = currY - this.AudioAttributesCompatParcelizer.getTop();
            if (left != 0) {
                InvalidTypeIdException.AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer, left);
            }
            if (top != 0) {
                InvalidTypeIdException.IconCompatParcelizer(this.AudioAttributesCompatParcelizer, top);
            }
            if (left != 0 || top != 0) {
                this.read.AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer, currX, currY);
            }
            if (zComputeScrollOffset && currX == this.onCustomAction.getFinalX() && currY == this.onCustomAction.getFinalY()) {
                this.onCustomAction.abortAnimation();
            } else if (!zComputeScrollOffset) {
            }
            this.onCommand.post(this.onMediaButtonEvent);
        }
        return this.MediaBrowserCompatItemReceiver == 2;
    }

    private void write(float f, float f2) {
        this.handleMediaPlayPauseIfPendingOnHandler = true;
        this.read.read(this.AudioAttributesCompatParcelizer, f, f2);
        this.handleMediaPlayPauseIfPendingOnHandler = false;
        if (this.MediaBrowserCompatItemReceiver == 1) {
            IconCompatParcelizer(0);
        }
    }

    private void AudioAttributesImplApi21Parcelizer() {
        float[] fArr = this.MediaBrowserCompatSearchResultReceiver;
        if (fArr == null) {
            return;
        }
        Arrays.fill(fArr, BitmapDescriptorFactory.HUE_RED);
        Arrays.fill(this.MediaBrowserCompatMediaItem, BitmapDescriptorFactory.HUE_RED);
        Arrays.fill(this.MediaMetadataCompat, BitmapDescriptorFactory.HUE_RED);
        Arrays.fill(this.MediaDescriptionCompat, BitmapDescriptorFactory.HUE_RED);
        Arrays.fill(this.AudioAttributesImplApi26Parcelizer, 0);
        Arrays.fill(this.MediaBrowserCompatCustomActionResultReceiver, 0);
        Arrays.fill(this.AudioAttributesImplBaseParcelizer, 0);
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = 0;
    }

    private void read(int i) {
        if (this.MediaBrowserCompatSearchResultReceiver == null || !MediaBrowserCompatCustomActionResultReceiver(i)) {
            return;
        }
        this.MediaBrowserCompatSearchResultReceiver[i] = 0.0f;
        this.MediaBrowserCompatMediaItem[i] = 0.0f;
        this.MediaMetadataCompat[i] = 0.0f;
        this.MediaDescriptionCompat[i] = 0.0f;
        this.AudioAttributesImplApi26Parcelizer[i] = 0;
        this.MediaBrowserCompatCustomActionResultReceiver[i] = 0;
        this.AudioAttributesImplBaseParcelizer[i] = 0;
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = (~(1 << i)) & this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    }

    private void write(int i) {
        float[] fArr = this.MediaBrowserCompatSearchResultReceiver;
        if (fArr == null || fArr.length <= i) {
            int i2 = i + 1;
            float[] fArr2 = new float[i2];
            float[] fArr3 = new float[i2];
            float[] fArr4 = new float[i2];
            float[] fArr5 = new float[i2];
            int[] iArr = new int[i2];
            int[] iArr2 = new int[i2];
            int[] iArr3 = new int[i2];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.MediaBrowserCompatMediaItem;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.MediaMetadataCompat;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.MediaDescriptionCompat;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.AudioAttributesImplApi26Parcelizer;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.MediaBrowserCompatCustomActionResultReceiver;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.AudioAttributesImplBaseParcelizer;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.MediaBrowserCompatSearchResultReceiver = fArr2;
            this.MediaBrowserCompatMediaItem = fArr3;
            this.MediaMetadataCompat = fArr4;
            this.MediaDescriptionCompat = fArr5;
            this.AudioAttributesImplApi26Parcelizer = iArr;
            this.MediaBrowserCompatCustomActionResultReceiver = iArr2;
            this.AudioAttributesImplBaseParcelizer = iArr3;
        }
    }

    private void IconCompatParcelizer(float f, float f2, int i) {
        write(i);
        float[] fArr = this.MediaBrowserCompatSearchResultReceiver;
        this.MediaMetadataCompat[i] = f;
        fArr[i] = f;
        float[] fArr2 = this.MediaBrowserCompatMediaItem;
        this.MediaDescriptionCompat[i] = f2;
        fArr2[i] = f2;
        this.AudioAttributesImplApi26Parcelizer[i] = AudioAttributesCompatParcelizer((int) f, (int) f2);
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver |= 1 << i;
    }

    private void AudioAttributesCompatParcelizer(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i = 0; i < pointerCount; i++) {
            int pointerId = motionEvent.getPointerId(i);
            if (AudioAttributesImplBaseParcelizer(pointerId)) {
                float x = motionEvent.getX(i);
                float y = motionEvent.getY(i);
                this.MediaMetadataCompat[pointerId] = x;
                this.MediaDescriptionCompat[pointerId] = y;
            }
        }
    }

    private boolean MediaBrowserCompatCustomActionResultReceiver(int i) {
        return (this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver & (1 << i)) != 0;
    }

    final void IconCompatParcelizer(int i) {
        this.onCommand.removeCallbacks(this.onMediaButtonEvent);
        if (this.MediaBrowserCompatItemReceiver != i) {
            this.MediaBrowserCompatItemReceiver = i;
            this.read.IconCompatParcelizer(i);
            if (this.MediaBrowserCompatItemReceiver == 0) {
                this.AudioAttributesCompatParcelizer = null;
            }
        }
    }

    private boolean IconCompatParcelizer(View view, int i) {
        if (view == this.AudioAttributesCompatParcelizer && this.write == i) {
            return true;
        }
        if (view == null || !this.read.read(view, i)) {
            return false;
        }
        this.write = i;
        read(view, i);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00f4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean read(android.view.MotionEvent r17) {
        /*
            Method dump skipped, instruction units count: 302
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.call.read(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0069, code lost:
    
        MediaBrowserCompatMediaItem();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void IconCompatParcelizer(android.view.MotionEvent r10) {
        /*
            Method dump skipped, instruction units count: 360
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.call.IconCompatParcelizer(android.view.MotionEvent):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [o.call$IconCompatParcelizer] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private void write(float f, float f2, int i) {
        boolean z = read(f, f2, i, 1);
        ?? r0 = z;
        if (read(f2, f, i, 4)) {
            r0 = (z ? 1 : 0) | 4;
        }
        ?? r02 = r0;
        if (read(f, f2, i, 2)) {
            r02 = (r0 == true ? 1 : 0) | 2;
        }
        ?? r03 = r02;
        if (read(f2, f, i, 8)) {
            r03 = (r02 == true ? 1 : 0) | 8;
        }
        if (r03 != 0) {
            int[] iArr = this.MediaBrowserCompatCustomActionResultReceiver;
            iArr[i] = iArr[i] | r03;
            this.read.IconCompatParcelizer(r03, i);
        }
    }

    private boolean read(float f, float f2, int i, int i2) {
        float fAbs = Math.abs(f);
        float fAbs2 = Math.abs(f2);
        if ((this.AudioAttributesImplApi26Parcelizer[i] & i2) != i2 || (this.onPlayFromMediaId & i2) == 0 || (this.AudioAttributesImplBaseParcelizer[i] & i2) == i2) {
            return false;
        }
        int i3 = this.MediaBrowserCompatCustomActionResultReceiver[i];
        if ((i3 & i2) == i2) {
            return false;
        }
        int i4 = this.onFastForward;
        float f3 = i4;
        return (fAbs > f3 || fAbs2 > f3) && (i3 & i2) == 0 && fAbs > ((float) i4);
    }

    private boolean RemoteActionCompatParcelizer(View view, float f, float f2) {
        if (view == null) {
            return false;
        }
        boolean z = this.read.AudioAttributesCompatParcelizer(view) > 0;
        boolean z2 = this.read.IconCompatParcelizer() > 0;
        if (!z || !z2) {
            return z ? Math.abs(f) > ((float) this.onFastForward) : z2 && Math.abs(f2) > ((float) this.onFastForward);
        }
        int i = this.onFastForward;
        return (f * f) + (f2 * f2) > ((float) (i * i));
    }

    public final boolean read() {
        int length = this.MediaBrowserCompatSearchResultReceiver.length;
        for (int i = 0; i < length; i++) {
            if (IconCompatParcelizer(3, i)) {
                return true;
            }
        }
        return false;
    }

    private boolean IconCompatParcelizer(int i, int i2) {
        if (!MediaBrowserCompatCustomActionResultReceiver(i2)) {
            return false;
        }
        float f = this.MediaMetadataCompat[i2] - this.MediaBrowserCompatSearchResultReceiver[i2];
        float f2 = this.MediaDescriptionCompat[i2] - this.MediaBrowserCompatMediaItem[i2];
        int i3 = this.onFastForward;
        return (f * f) + (f2 * f2) > ((float) (i3 * i3));
    }

    private void MediaBrowserCompatMediaItem() {
        this.onPlay.computeCurrentVelocity(1000, this.RatingCompat);
        write(IconCompatParcelizer(this.onPlay.getXVelocity(this.write), this.onAddQueueItem, this.RatingCompat), IconCompatParcelizer(this.onPlay.getYVelocity(this.write), this.onAddQueueItem, this.RatingCompat));
    }

    private void RemoteActionCompatParcelizer(int i, int i2, int i3, int i4) {
        int left = this.AudioAttributesCompatParcelizer.getLeft();
        int top = this.AudioAttributesCompatParcelizer.getTop();
        if (i3 != 0) {
            i = this.read.IconCompatParcelizer(this.AudioAttributesCompatParcelizer, i);
            InvalidTypeIdException.AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer, i - left);
        }
        if (i4 != 0) {
            i2 = this.read.AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer, i2);
            InvalidTypeIdException.IconCompatParcelizer(this.AudioAttributesCompatParcelizer, i2 - top);
        }
        if (i3 == 0 && i4 == 0) {
            return;
        }
        this.read.AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer, i, i2);
    }

    private boolean write(int i, int i2) {
        return RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, i, i2);
    }

    public static boolean RemoteActionCompatParcelizer(View view, int i, int i2) {
        return view != null && i >= view.getLeft() && i < view.getRight() && i2 >= view.getTop() && i2 < view.getBottom();
    }

    public final View read(int i, int i2) {
        for (int childCount = this.onCommand.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = this.onCommand.getChildAt(IconCompatParcelizer.write(childCount));
            if (i >= childAt.getLeft() && i < childAt.getRight() && i2 >= childAt.getTop() && i2 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    private int AudioAttributesCompatParcelizer(int i, int i2) {
        int i3 = i < this.onCommand.getLeft() + this.AudioAttributesImplApi21Parcelizer ? 1 : 0;
        if (i2 < this.onCommand.getTop() + this.AudioAttributesImplApi21Parcelizer) {
            i3 |= 4;
        }
        if (i > this.onCommand.getRight() - this.AudioAttributesImplApi21Parcelizer) {
            i3 |= 2;
        }
        return i2 > this.onCommand.getBottom() - this.AudioAttributesImplApi21Parcelizer ? i3 | 8 : i3;
    }

    private boolean AudioAttributesImplBaseParcelizer(int i) {
        return MediaBrowserCompatCustomActionResultReceiver(i);
    }
}
