package kotlin;

import com.google.firebase.perf.injection.modules.FirebasePerformanceModule;

/* JADX INFO: loaded from: classes5.dex */
public final class shouldReinitCodec implements getSubmittedOn<onProcessedOutputBuffer> {
    private final FirebasePerformanceModule read;

    private shouldReinitCodec(FirebasePerformanceModule firebasePerformanceModule) {
        this.read = firebasePerformanceModule;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.setDescriptionList
    /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
    public onProcessedOutputBuffer get() {
        return AudioAttributesCompatParcelizer(this.read);
    }

    public static shouldReinitCodec read(FirebasePerformanceModule firebasePerformanceModule) {
        return new shouldReinitCodec(firebasePerformanceModule);
    }

    private static onProcessedOutputBuffer AudioAttributesCompatParcelizer(FirebasePerformanceModule firebasePerformanceModule) {
        return (onProcessedOutputBuffer) setPossibleScore.write(firebasePerformanceModule.AudioAttributesCompatParcelizer(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
