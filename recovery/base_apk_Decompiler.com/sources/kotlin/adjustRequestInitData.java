package kotlin;

/* JADX INFO: loaded from: classes5.dex */
public final class adjustRequestInitData implements FrameworkMediaDrmExternalSyntheticLambda3<addLaUrlAttributeIfMissing> {
    private final setDescriptionList<canDispatchQueueEdit> AudioAttributesCompatParcelizer;
    private final setDescriptionList<BinarySearchSeeker> IconCompatParcelizer;
    private final setDescriptionList<OfflineLicenseHelperExternalSyntheticLambda1> RemoteActionCompatParcelizer;
    private final setDescriptionList<newWidevineInstance> read;
    private final setDescriptionList<BinarySearchSeeker> write;

    private adjustRequestInitData(setDescriptionList<BinarySearchSeeker> setdescriptionlist, setDescriptionList<BinarySearchSeeker> setdescriptionlist2, setDescriptionList<newWidevineInstance> setdescriptionlist3, setDescriptionList<OfflineLicenseHelperExternalSyntheticLambda1> setdescriptionlist4, setDescriptionList<canDispatchQueueEdit> setdescriptionlist5) {
        this.write = setdescriptionlist;
        this.IconCompatParcelizer = setdescriptionlist2;
        this.read = setdescriptionlist3;
        this.RemoteActionCompatParcelizer = setdescriptionlist4;
        this.AudioAttributesCompatParcelizer = setdescriptionlist5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.setDescriptionList
    /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public addLaUrlAttributeIfMissing get() {
        return read(this.write.get(), this.IconCompatParcelizer.get(), this.read.get(), this.RemoteActionCompatParcelizer.get(), this.AudioAttributesCompatParcelizer.get());
    }

    public static adjustRequestInitData IconCompatParcelizer(setDescriptionList<BinarySearchSeeker> setdescriptionlist, setDescriptionList<BinarySearchSeeker> setdescriptionlist2, setDescriptionList<newWidevineInstance> setdescriptionlist3, setDescriptionList<OfflineLicenseHelperExternalSyntheticLambda1> setdescriptionlist4, setDescriptionList<canDispatchQueueEdit> setdescriptionlist5) {
        return new adjustRequestInitData(setdescriptionlist, setdescriptionlist2, setdescriptionlist3, setdescriptionlist4, setdescriptionlist5);
    }

    private static addLaUrlAttributeIfMissing read(BinarySearchSeeker binarySearchSeeker, BinarySearchSeeker binarySearchSeeker2, newWidevineInstance newwidevineinstance, OfflineLicenseHelperExternalSyntheticLambda1 offlineLicenseHelperExternalSyntheticLambda1, canDispatchQueueEdit candispatchqueueedit) {
        return new addLaUrlAttributeIfMissing(binarySearchSeeker, binarySearchSeeker2, newwidevineinstance, offlineLicenseHelperExternalSyntheticLambda1, candispatchqueueedit);
    }
}
