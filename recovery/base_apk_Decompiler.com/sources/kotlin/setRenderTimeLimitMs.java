package kotlin;

import com.google.firebase.perf.injection.modules.FirebasePerformanceModule;

/* JADX INFO: loaded from: classes5.dex */
public final class setRenderTimeLimitMs implements getSubmittedOn<maybeInitCodecOrBypass> {
    private final FirebasePerformanceModule write;

    private setRenderTimeLimitMs(FirebasePerformanceModule firebasePerformanceModule) {
        this.write = firebasePerformanceModule;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.setDescriptionList
    /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
    public maybeInitCodecOrBypass get() {
        return RemoteActionCompatParcelizer(this.write);
    }

    public static setRenderTimeLimitMs write(FirebasePerformanceModule firebasePerformanceModule) {
        return new setRenderTimeLimitMs(firebasePerformanceModule);
    }

    private static maybeInitCodecOrBypass RemoteActionCompatParcelizer(FirebasePerformanceModule firebasePerformanceModule) {
        return (maybeInitCodecOrBypass) setPossibleScore.write(firebasePerformanceModule.RemoteActionCompatParcelizer(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
