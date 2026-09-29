package kotlin;

import android.os.Handler;
import android.os.Looper;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a%\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u0019\u0010\u0001\u001a\u00020\u00052\b\u0010\u0003\u001a\u0004\u0018\u00010\u0007H\u0000¢\u0006\u0004\b\u0001\u0010\n\"\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r"}, d2 = {"", "write", "()J", "p0", "Lkotlin/Function0;", "", "p1", "", "read", "(JLo/getCreatedOnDateMs;)Ljava/lang/Object;", "(Ljava/lang/Object;)V", "Landroid/os/Handler;", "RemoteActionCompatParcelizer", "Landroid/os/Handler;", "AudioAttributesCompatParcelizer"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class _skipLine {
    private static final Handler RemoteActionCompatParcelizer = new Handler(Looper.getMainLooper());

    public static final long write() {
        return System.currentTimeMillis();
    }

    public static final Object read(long j, final getCreatedOnDateMs<getShowPopup> getcreatedondatems) {
        Runnable runnable = new Runnable() { // from class: o._skipComment
            @Override // java.lang.Runnable
            public final void run() {
                _skipLine.write(getcreatedondatems);
            }
        };
        RemoteActionCompatParcelizer.postDelayed(runnable, j);
        return runnable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void write(getCreatedOnDateMs getcreatedondatems) {
        getcreatedondatems.invoke();
    }

    public static final void write(Object obj) {
        if ((obj instanceof Runnable ? (Runnable) obj : null) == null) {
            return;
        }
        RemoteActionCompatParcelizer.removeCallbacks((Runnable) obj);
    }
}
