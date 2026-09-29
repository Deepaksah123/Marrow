package kotlin;

import android.app.ActivityOptions;
import android.app.PendingIntent;
import java.util.Objects;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lo/setOnRefreshListener;", "", "<init>", "()V", "Landroid/app/PendingIntent;", "p0", "", "IconCompatParcelizer", "(Landroid/app/PendingIntent;)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class setOnRefreshListener {
    public static final setOnRefreshListener INSTANCE = new setOnRefreshListener();

    private setOnRefreshListener() {
    }

    public final void IconCompatParcelizer(PendingIntent p0) {
        try {
            p0.send(ActivityOptions.makeBasic().setPendingIntentBackgroundActivityStartMode(1).toBundle());
        } catch (PendingIntent.CanceledException e) {
            Objects.toString(p0);
            e.toString();
        }
    }
}
