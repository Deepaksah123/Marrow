package kotlin;

/* JADX INFO: loaded from: classes5.dex */
public final class getMediaDescription implements FrameworkMediaDrmExternalSyntheticLambda3<BinarySearchSeeker> {
    @Override // kotlin.setDescriptionList
    public final /* synthetic */ Object get() {
        return write();
    }

    private static BinarySearchSeeker write() {
        return AudioAttributesCompatParcelizer();
    }

    public static getMediaDescription read() {
        return IconCompatParcelizer.read;
    }

    private static BinarySearchSeeker AudioAttributesCompatParcelizer() {
        return (BinarySearchSeeker) executePost.IconCompatParcelizer(publishFloatingQueueWindow.AudioAttributesCompatParcelizer(), "Cannot return null from a non-@Nullable @Provides method");
    }

    static final class IconCompatParcelizer {
        private static final getMediaDescription read = new getMediaDescription();
    }
}
