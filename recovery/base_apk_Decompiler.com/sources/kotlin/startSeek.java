package kotlin;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final class startSeek implements Callable {
    private /* synthetic */ FirebaseAnalytics RemoteActionCompatParcelizer;

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() throws Exception {
        return this.RemoteActionCompatParcelizer.zzb.zzh();
    }

    public startSeek(FirebaseAnalytics firebaseAnalytics) {
        this.RemoteActionCompatParcelizer = firebaseAnalytics;
    }
}
