package kotlin;

import android.content.Context;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.setSubsampleOffsetUs;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public abstract class MediaPeriodQueueExternalSyntheticLambda0<T extends View, Z> extends removeAfter<Z> {
    private static int write = setSubsampleOffsetUs.AudioAttributesCompatParcelizer.glide_custom_view_target_tag;
    private boolean AudioAttributesCompatParcelizer;
    private final IconCompatParcelizer IconCompatParcelizer;
    protected final T RemoteActionCompatParcelizer;

    public MediaPeriodQueueExternalSyntheticLambda0(T t) {
        this.RemoteActionCompatParcelizer = (T) moveMediaSource.AudioAttributesCompatParcelizer(t);
        this.IconCompatParcelizer = new IconCompatParcelizer(t);
    }

    @Override // kotlin.removeAfter, kotlin.MediaSourceInfoHolder
    public void write(Drawable drawable) {
        super.write(drawable);
    }

    @Override // kotlin.MediaSourceInfoHolder
    public final void read(updateRepeatMode updaterepeatmode) {
        this.IconCompatParcelizer.read(updaterepeatmode);
    }

    @Override // kotlin.MediaSourceInfoHolder
    public final void IconCompatParcelizer(updateRepeatMode updaterepeatmode) {
        this.IconCompatParcelizer.write(updaterepeatmode);
    }

    @Override // kotlin.removeAfter, kotlin.MediaSourceInfoHolder
    public void AudioAttributesCompatParcelizer(Drawable drawable) {
        super.AudioAttributesCompatParcelizer(drawable);
        this.IconCompatParcelizer.write();
    }

    @Override // kotlin.removeAfter, kotlin.MediaSourceInfoHolder
    public final void write(enqueueNextMediaPeriodHolder enqueuenextmediaperiodholder) {
        read(enqueuenextmediaperiodholder);
    }

    @Override // kotlin.removeAfter, kotlin.MediaSourceInfoHolder
    public final enqueueNextMediaPeriodHolder AudioAttributesCompatParcelizer() {
        Object objRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
        if (objRemoteActionCompatParcelizer == null) {
            return null;
        }
        if (objRemoteActionCompatParcelizer instanceof enqueueNextMediaPeriodHolder) {
            return (enqueueNextMediaPeriodHolder) objRemoteActionCompatParcelizer;
        }
        throw new IllegalArgumentException("You must not call setTag() on a view Glide is targeting");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Target for: ");
        sb.append(this.RemoteActionCompatParcelizer);
        return sb.toString();
    }

    private void read(Object obj) {
        this.RemoteActionCompatParcelizer.setTag(write, obj);
    }

    private Object RemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer.getTag(write);
    }

    static final class IconCompatParcelizer {
        private static Integer write;
        private final List<updateRepeatMode> AudioAttributesCompatParcelizer = new ArrayList();
        private final View IconCompatParcelizer;
        private boolean RemoteActionCompatParcelizer;
        private write read;

        private static boolean AudioAttributesCompatParcelizer(int i) {
            return i > 0 || i == Integer.MIN_VALUE;
        }

        IconCompatParcelizer(View view) {
            this.IconCompatParcelizer = view;
        }

        private static int AudioAttributesCompatParcelizer(Context context) {
            if (write == null) {
                Display defaultDisplay = ((WindowManager) moveMediaSource.AudioAttributesCompatParcelizer((WindowManager) context.getSystemService("window"))).getDefaultDisplay();
                Point point = new Point();
                defaultDisplay.getSize(point);
                write = Integer.valueOf(Math.max(point.x, point.y));
            }
            return write.intValue();
        }

        private void read(int i, int i2) {
            Iterator it = new ArrayList(this.AudioAttributesCompatParcelizer).iterator();
            while (it.hasNext()) {
                ((updateRepeatMode) it.next()).RemoteActionCompatParcelizer(i, i2);
            }
        }

        final void AudioAttributesCompatParcelizer() {
            if (this.AudioAttributesCompatParcelizer.isEmpty()) {
                return;
            }
            int i = read();
            int iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
            if (RemoteActionCompatParcelizer(i, iRemoteActionCompatParcelizer)) {
                read(i, iRemoteActionCompatParcelizer);
                write();
            }
        }

        final void read(updateRepeatMode updaterepeatmode) {
            int i = read();
            int iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
            if (RemoteActionCompatParcelizer(i, iRemoteActionCompatParcelizer)) {
                updaterepeatmode.RemoteActionCompatParcelizer(i, iRemoteActionCompatParcelizer);
                return;
            }
            if (!this.AudioAttributesCompatParcelizer.contains(updaterepeatmode)) {
                this.AudioAttributesCompatParcelizer.add(updaterepeatmode);
            }
            if (this.read == null) {
                ViewTreeObserver viewTreeObserver = this.IconCompatParcelizer.getViewTreeObserver();
                write writeVar = new write(this);
                this.read = writeVar;
                viewTreeObserver.addOnPreDrawListener(writeVar);
            }
        }

        final void write(updateRepeatMode updaterepeatmode) {
            this.AudioAttributesCompatParcelizer.remove(updaterepeatmode);
        }

        final void write() {
            ViewTreeObserver viewTreeObserver = this.IconCompatParcelizer.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this.read);
            }
            this.read = null;
            this.AudioAttributesCompatParcelizer.clear();
        }

        private static boolean RemoteActionCompatParcelizer(int i, int i2) {
            return AudioAttributesCompatParcelizer(i) && AudioAttributesCompatParcelizer(i2);
        }

        private int RemoteActionCompatParcelizer() {
            int paddingTop = this.IconCompatParcelizer.getPaddingTop();
            int paddingBottom = this.IconCompatParcelizer.getPaddingBottom();
            ViewGroup.LayoutParams layoutParams = this.IconCompatParcelizer.getLayoutParams();
            return AudioAttributesCompatParcelizer(this.IconCompatParcelizer.getHeight(), layoutParams != null ? layoutParams.height : 0, paddingTop + paddingBottom);
        }

        private int read() {
            int paddingLeft = this.IconCompatParcelizer.getPaddingLeft();
            int paddingRight = this.IconCompatParcelizer.getPaddingRight();
            ViewGroup.LayoutParams layoutParams = this.IconCompatParcelizer.getLayoutParams();
            return AudioAttributesCompatParcelizer(this.IconCompatParcelizer.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingLeft + paddingRight);
        }

        private int AudioAttributesCompatParcelizer(int i, int i2, int i3) {
            int i4 = i2 - i3;
            if (i4 > 0) {
                return i4;
            }
            int i5 = i - i3;
            if (i5 > 0) {
                return i5;
            }
            if (this.IconCompatParcelizer.isLayoutRequested() || i2 != -2) {
                return 0;
            }
            return AudioAttributesCompatParcelizer(this.IconCompatParcelizer.getContext());
        }

        static final class write implements ViewTreeObserver.OnPreDrawListener {
            private final WeakReference<IconCompatParcelizer> write;

            write(IconCompatParcelizer iconCompatParcelizer) {
                this.write = new WeakReference<>(iconCompatParcelizer);
            }

            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                if (Log.isLoggable("ViewTarget", 2)) {
                    toString();
                }
                IconCompatParcelizer iconCompatParcelizer = this.write.get();
                if (iconCompatParcelizer == null) {
                    return true;
                }
                iconCompatParcelizer.AudioAttributesCompatParcelizer();
                return true;
            }
        }
    }
}
