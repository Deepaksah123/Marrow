package kotlin;

/* JADX INFO: loaded from: classes5.dex */
public final class setCaptionCallback implements FrameworkMediaDrmExternalSyntheticLambda3<String> {
    @Override // kotlin.setDescriptionList
    public final /* synthetic */ Object get() {
        return IconCompatParcelizer();
    }

    private static String IconCompatParcelizer() {
        return write();
    }

    public static setCaptionCallback RemoteActionCompatParcelizer() {
        return RemoteActionCompatParcelizer.IconCompatParcelizer;
    }

    private static String write() {
        return (String) executePost.IconCompatParcelizer(invalidateMediaSessionPlaybackState.read(), "Cannot return null from a non-@Nullable @Provides method");
    }

    static final class RemoteActionCompatParcelizer {
        private static final setCaptionCallback IconCompatParcelizer = new setCaptionCallback();
    }
}
