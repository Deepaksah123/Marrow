package kotlin;

import com.google.firebase.perf.injection.modules.FirebasePerformanceModule;

/* JADX INFO: loaded from: classes5.dex */
public final class buildCustomDiagnosticInfo implements getSubmittedOn<onInputBufferAvailable<DrmUtilApi18>> {
    private final FirebasePerformanceModule read;

    private buildCustomDiagnosticInfo(FirebasePerformanceModule firebasePerformanceModule) {
        this.read = firebasePerformanceModule;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.setDescriptionList
    /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
    public onInputBufferAvailable<DrmUtilApi18> get() {
        return read(this.read);
    }

    public static buildCustomDiagnosticInfo AudioAttributesCompatParcelizer(FirebasePerformanceModule firebasePerformanceModule) {
        return new buildCustomDiagnosticInfo(firebasePerformanceModule);
    }

    private static onInputBufferAvailable<DrmUtilApi18> read(FirebasePerformanceModule firebasePerformanceModule) {
        return (onInputBufferAvailable) setPossibleScore.write(firebasePerformanceModule.AudioAttributesImplApi26Parcelizer(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
