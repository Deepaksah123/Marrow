package kotlin;

/* JADX INFO: loaded from: classes5.dex */
public final class createSeekParamsForTargetTimeUs implements FrameworkMediaDrmExternalSyntheticLambda3<BinarySearchSeeker> {
    @Override // kotlin.setDescriptionList
    public final /* synthetic */ Object get() {
        return read();
    }

    private static BinarySearchSeeker read() {
        return RemoteActionCompatParcelizer();
    }

    public static createSeekParamsForTargetTimeUs write() {
        return write.write;
    }

    private static BinarySearchSeeker RemoteActionCompatParcelizer() {
        return (BinarySearchSeeker) executePost.IconCompatParcelizer(publishFloatingQueueWindow.RemoteActionCompatParcelizer(), "Cannot return null from a non-@Nullable @Provides method");
    }

    static final class write {
        private static final createSeekParamsForTargetTimeUs write = new createSeekParamsForTargetTimeUs();
    }
}
