package kotlin;

/* JADX INFO: loaded from: classes2.dex */
public final class flushSinkIfActive extends MagicModuleUseCase implements getCreatedOnDateMs {
    public static final flushSinkIfActive write = new flushSinkIfActive();

    public flushSinkIfActive() {
        super(0);
    }

    @Override // kotlin.getCreatedOnDateMs
    public final Object invoke() {
        return AudioTrackPositionTrackerListener.RemoteActionCompatParcelizer.write();
    }
}
