package kotlin;

/* JADX INFO: loaded from: classes5.dex */
public final class acquireSessionAndGetOfflineLicenseKeySetIdOnHandlerThread implements FrameworkMediaDrmExternalSyntheticLambda3<renewLicense> {
    private final setDescriptionList<BinarySearchSeeker> RemoteActionCompatParcelizer;

    private acquireSessionAndGetOfflineLicenseKeySetIdOnHandlerThread(setDescriptionList<BinarySearchSeeker> setdescriptionlist) {
        this.RemoteActionCompatParcelizer = setdescriptionlist;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.setDescriptionList
    /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
    public renewLicense get() {
        return read(this.RemoteActionCompatParcelizer.get());
    }

    public static acquireSessionAndGetOfflineLicenseKeySetIdOnHandlerThread AudioAttributesCompatParcelizer(setDescriptionList<BinarySearchSeeker> setdescriptionlist) {
        return new acquireSessionAndGetOfflineLicenseKeySetIdOnHandlerThread(setdescriptionlist);
    }

    private static renewLicense read(BinarySearchSeeker binarySearchSeeker) {
        return (renewLicense) executePost.IconCompatParcelizer(releaseManagerOnHandlerThread.read(binarySearchSeeker), "Cannot return null from a non-@Nullable @Provides method");
    }
}
