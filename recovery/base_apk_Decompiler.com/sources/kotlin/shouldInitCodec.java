package kotlin;

import com.google.firebase.perf.injection.modules.FirebasePerformanceModule;

/* JADX INFO: loaded from: classes5.dex */
public final class shouldInitCodec implements getSubmittedOn<hasSamples> {
    private final FirebasePerformanceModule RemoteActionCompatParcelizer;

    private shouldInitCodec(FirebasePerformanceModule firebasePerformanceModule) {
        this.RemoteActionCompatParcelizer = firebasePerformanceModule;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.setDescriptionList
    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public hasSamples get() {
        return RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer);
    }

    public static shouldInitCodec read(FirebasePerformanceModule firebasePerformanceModule) {
        return new shouldInitCodec(firebasePerformanceModule);
    }

    private static hasSamples RemoteActionCompatParcelizer(FirebasePerformanceModule firebasePerformanceModule) {
        return (hasSamples) setPossibleScore.write(firebasePerformanceModule.read(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
