package kotlin;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes.dex */
public final class DefaultAnalyticsCollectorExternalSyntheticLambda50 implements ViewTreeObserver.OnGlobalLayoutListener {
    private static final Map<Integer, DefaultAnalyticsCollectorExternalSyntheticLambda50> write = new HashMap();
    private WeakReference<Activity> read;
    private final Handler RemoteActionCompatParcelizer = new Handler(Looper.getMainLooper());
    private AtomicBoolean AudioAttributesCompatParcelizer = new AtomicBoolean(false);

    static /* synthetic */ WeakReference IconCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda50 defaultAnalyticsCollectorExternalSyntheticLambda50) {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda50.class)) {
            return null;
        }
        try {
            return defaultAnalyticsCollectorExternalSyntheticLambda50.read;
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, DefaultAnalyticsCollectorExternalSyntheticLambda50.class);
            return null;
        }
    }

    static void AudioAttributesCompatParcelizer(Activity activity) {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda50.class)) {
            return;
        }
        try {
            int iHashCode = activity.hashCode();
            Map<Integer, DefaultAnalyticsCollectorExternalSyntheticLambda50> map = write;
            if (map.containsKey(Integer.valueOf(iHashCode))) {
                return;
            }
            DefaultAnalyticsCollectorExternalSyntheticLambda50 defaultAnalyticsCollectorExternalSyntheticLambda50 = new DefaultAnalyticsCollectorExternalSyntheticLambda50(activity);
            map.put(Integer.valueOf(iHashCode), defaultAnalyticsCollectorExternalSyntheticLambda50);
            defaultAnalyticsCollectorExternalSyntheticLambda50.read();
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, DefaultAnalyticsCollectorExternalSyntheticLambda50.class);
        }
    }

    static void IconCompatParcelizer(Activity activity) {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda50.class)) {
            return;
        }
        try {
            int iHashCode = activity.hashCode();
            Map<Integer, DefaultAnalyticsCollectorExternalSyntheticLambda50> map = write;
            if (map.containsKey(Integer.valueOf(iHashCode))) {
                DefaultAnalyticsCollectorExternalSyntheticLambda50 defaultAnalyticsCollectorExternalSyntheticLambda50 = map.get(Integer.valueOf(iHashCode));
                map.remove(Integer.valueOf(iHashCode));
                defaultAnalyticsCollectorExternalSyntheticLambda50.RemoteActionCompatParcelizer();
            }
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, DefaultAnalyticsCollectorExternalSyntheticLambda50.class);
        }
    }

    private DefaultAnalyticsCollectorExternalSyntheticLambda50(Activity activity) {
        this.read = new WeakReference<>(activity);
    }

    private void read() {
        View view;
        if (getMinWindowSequenceNumber.IconCompatParcelizer(this)) {
            return;
        }
        try {
            if (this.AudioAttributesCompatParcelizer.getAndSet(true) || (view = DefaultAnalyticsCollectorExternalSyntheticLambda29.read(this.read.get())) == null) {
                return;
            }
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.addOnGlobalLayoutListener(this);
                write();
                this.read.get();
            }
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, this);
        }
    }

    private void RemoteActionCompatParcelizer() {
        View view;
        if (getMinWindowSequenceNumber.IconCompatParcelizer(this)) {
            return;
        }
        try {
            if (this.AudioAttributesCompatParcelizer.getAndSet(false) && (view = DefaultAnalyticsCollectorExternalSyntheticLambda29.read(this.read.get())) != null) {
                ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                if (viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnGlobalLayoutListener(this);
                }
            }
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, this);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(this)) {
            return;
        }
        try {
            write();
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, this);
        }
    }

    /* JADX INFO: renamed from: o.DefaultAnalyticsCollectorExternalSyntheticLambda50$1, reason: invalid class name */
    public class AnonymousClass1 implements Runnable {
        public static int RemoteActionCompatParcelizer;
        public static int read;

        AnonymousClass1() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (getMinWindowSequenceNumber.IconCompatParcelizer(this)) {
                return;
            }
            try {
                View view = DefaultAnalyticsCollectorExternalSyntheticLambda29.read((Activity) DefaultAnalyticsCollectorExternalSyntheticLambda50.IconCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda50.this).get());
                Activity activity = (Activity) DefaultAnalyticsCollectorExternalSyntheticLambda50.IconCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda50.this).get();
                if (view == null || activity == null) {
                    return;
                }
                for (View view2 : DefaultAnalyticsCollectorExternalSyntheticLambda49.IconCompatParcelizer(view)) {
                    if (!DefaultAnalyticsCollectorExternalSyntheticLambda16.write(view2)) {
                        String strWrite = DefaultAnalyticsCollectorExternalSyntheticLambda49.write(view2);
                        if (!strWrite.isEmpty() && strWrite.length() <= 300) {
                            DefaultAnalyticsCollectorExternalSyntheticLambda52.RemoteActionCompatParcelizer(view2, view, activity.getLocalClassName());
                        }
                    }
                }
            } catch (Exception unused) {
            } catch (Throwable th) {
                getMinWindowSequenceNumber.read(th, this);
            }
        }

        public static int RemoteActionCompatParcelizer() {
            int i = read;
            int i2 = i % 5564848;
            read = i + 1;
            if (i2 != 0) {
                return RemoteActionCompatParcelizer;
            }
            int elapsedCpuTime = (int) Process.getElapsedCpuTime();
            RemoteActionCompatParcelizer = elapsedCpuTime;
            return elapsedCpuTime;
        }
    }

    private void write() {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(this)) {
            return;
        }
        try {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1();
            if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                anonymousClass1.run();
            } else {
                this.RemoteActionCompatParcelizer.post(anonymousClass1);
            }
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, this);
        }
    }
}
