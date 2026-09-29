package kotlin;

/* JADX INFO: loaded from: classes5.dex */
public final class onCurrentMediaItemIndexChanged implements FrameworkMediaDrmExternalSyntheticLambda3<setMapStateIdleToSessionStateStopped> {
    private final setDescriptionList<TimelineQueueEditor> AudioAttributesCompatParcelizer;
    private final setDescriptionList<BinarySearchSeeker> IconCompatParcelizer;
    private final setDescriptionList<registerCustomCommandReceiver> RemoteActionCompatParcelizer;
    private final setDescriptionList<BinarySearchSeeker> read;
    private final setDescriptionList<String> write;

    private onCurrentMediaItemIndexChanged(setDescriptionList<BinarySearchSeeker> setdescriptionlist, setDescriptionList<BinarySearchSeeker> setdescriptionlist2, setDescriptionList<registerCustomCommandReceiver> setdescriptionlist3, setDescriptionList<TimelineQueueEditor> setdescriptionlist4, setDescriptionList<String> setdescriptionlist5) {
        this.read = setdescriptionlist;
        this.IconCompatParcelizer = setdescriptionlist2;
        this.RemoteActionCompatParcelizer = setdescriptionlist3;
        this.AudioAttributesCompatParcelizer = setdescriptionlist4;
        this.write = setdescriptionlist5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.setDescriptionList
    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public setMapStateIdleToSessionStateStopped get() {
        return AudioAttributesCompatParcelizer(this.read.get(), this.IconCompatParcelizer.get(), this.RemoteActionCompatParcelizer.get(), this.AudioAttributesCompatParcelizer.get(), this.write);
    }

    public static onCurrentMediaItemIndexChanged read(setDescriptionList<BinarySearchSeeker> setdescriptionlist, setDescriptionList<BinarySearchSeeker> setdescriptionlist2, setDescriptionList<registerCustomCommandReceiver> setdescriptionlist3, setDescriptionList<TimelineQueueEditor> setdescriptionlist4, setDescriptionList<String> setdescriptionlist5) {
        return new onCurrentMediaItemIndexChanged(setdescriptionlist, setdescriptionlist2, setdescriptionlist3, setdescriptionlist4, setdescriptionlist5);
    }

    private static setMapStateIdleToSessionStateStopped AudioAttributesCompatParcelizer(BinarySearchSeeker binarySearchSeeker, BinarySearchSeeker binarySearchSeeker2, Object obj, Object obj2, setDescriptionList<String> setdescriptionlist) {
        return new setMapStateIdleToSessionStateStopped(binarySearchSeeker, binarySearchSeeker2, (registerCustomCommandReceiver) obj, (TimelineQueueEditor) obj2, setdescriptionlist);
    }
}
