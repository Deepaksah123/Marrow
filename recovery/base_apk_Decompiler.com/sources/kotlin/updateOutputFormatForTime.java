package kotlin;

import com.google.firebase.perf.injection.modules.FirebasePerformanceModule;

/* JADX INFO: loaded from: classes5.dex */
public final class updateOutputFormatForTime implements getSubmittedOn<getDecoderInfosInternal> {
    private final FirebasePerformanceModule RemoteActionCompatParcelizer;

    private updateOutputFormatForTime(FirebasePerformanceModule firebasePerformanceModule) {
        this.RemoteActionCompatParcelizer = firebasePerformanceModule;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.setDescriptionList
    /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public getDecoderInfosInternal get() {
        return read(this.RemoteActionCompatParcelizer);
    }

    public static updateOutputFormatForTime write(FirebasePerformanceModule firebasePerformanceModule) {
        return new updateOutputFormatForTime(firebasePerformanceModule);
    }

    private static getDecoderInfosInternal read(FirebasePerformanceModule firebasePerformanceModule) {
        return (getDecoderInfosInternal) setPossibleScore.write(firebasePerformanceModule.MediaBrowserCompatItemReceiver(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
