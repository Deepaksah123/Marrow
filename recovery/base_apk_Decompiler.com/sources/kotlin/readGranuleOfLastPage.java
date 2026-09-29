package kotlin;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final class readGranuleOfLastPage implements Callable {
    private /* synthetic */ FirebaseAnalytics AudioAttributesCompatParcelizer;

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() throws Exception {
        return this.AudioAttributesCompatParcelizer.zzb.zzl();
    }

    public readGranuleOfLastPage(FirebaseAnalytics firebaseAnalytics) {
        this.AudioAttributesCompatParcelizer = firebaseAnalytics;
    }
}
