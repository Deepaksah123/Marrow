package kotlin;

import com.google.firebase.FirebaseApp;
import com.google.firebase.perf.injection.modules.FirebasePerformanceModule;

/* JADX INFO: loaded from: classes5.dex */
public final class setPendingOutputEndOfStream implements getSubmittedOn<FirebaseApp> {
    private final FirebasePerformanceModule write;

    private setPendingOutputEndOfStream(FirebasePerformanceModule firebasePerformanceModule) {
        this.write = firebasePerformanceModule;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.setDescriptionList
    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public FirebaseApp get() {
        return IconCompatParcelizer(this.write);
    }

    public static setPendingOutputEndOfStream RemoteActionCompatParcelizer(FirebasePerformanceModule firebasePerformanceModule) {
        return new setPendingOutputEndOfStream(firebasePerformanceModule);
    }

    private static FirebaseApp IconCompatParcelizer(FirebasePerformanceModule firebasePerformanceModule) {
        return (FirebaseApp) setPossibleScore.write(firebasePerformanceModule.write(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
