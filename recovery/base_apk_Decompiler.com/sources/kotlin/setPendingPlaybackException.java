package kotlin;

import com.google.firebase.perf.injection.modules.FirebasePerformanceModule;

/* JADX INFO: loaded from: classes5.dex */
public final class setPendingPlaybackException implements getSubmittedOn<onInputBufferAvailable<ChapterTocFrame1>> {
    private final FirebasePerformanceModule read;

    private setPendingPlaybackException(FirebasePerformanceModule firebasePerformanceModule) {
        this.read = firebasePerformanceModule;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.setDescriptionList
    /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public onInputBufferAvailable<ChapterTocFrame1> get() {
        return RemoteActionCompatParcelizer(this.read);
    }

    public static setPendingPlaybackException write(FirebasePerformanceModule firebasePerformanceModule) {
        return new setPendingPlaybackException(firebasePerformanceModule);
    }

    private static onInputBufferAvailable<ChapterTocFrame1> RemoteActionCompatParcelizer(FirebasePerformanceModule firebasePerformanceModule) {
        return (onInputBufferAvailable) setPossibleScore.write(firebasePerformanceModule.IconCompatParcelizer(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
