package kotlin;

/* JADX INFO: loaded from: classes5.dex */
public final class setEnabledPlaybackActions implements FrameworkMediaDrmExternalSyntheticLambda3<Integer> {
    @Override // kotlin.setDescriptionList
    public final /* synthetic */ Object get() {
        return RemoteActionCompatParcelizer();
    }

    private static Integer RemoteActionCompatParcelizer() {
        return Integer.valueOf(read());
    }

    public static setEnabledPlaybackActions AudioAttributesCompatParcelizer() {
        return RemoteActionCompatParcelizer.read;
    }

    private static int read() {
        return invalidateMediaSessionPlaybackState.RemoteActionCompatParcelizer();
    }

    static final class RemoteActionCompatParcelizer {
        private static final setEnabledPlaybackActions read = new setEnabledPlaybackActions();
    }
}
