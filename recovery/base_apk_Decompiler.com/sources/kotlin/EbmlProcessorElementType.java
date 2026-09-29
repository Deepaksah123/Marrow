package kotlin;

/* JADX INFO: loaded from: classes3.dex */
final class EbmlProcessorElementType implements parseMotionPhotoFlagFromDescription {
    private final EbmlProcessorElementType AudioAttributesCompatParcelizer = this;
    private final readAmfString AudioAttributesImplBaseParcelizer;
    private final readAmfString IconCompatParcelizer;
    private final readAmfString MediaBrowserCompatItemReceiver;
    private final readAmfString RemoteActionCompatParcelizer;
    private final readAmfString read;
    private final readAmfString write;

    /* synthetic */ EbmlProcessorElementType(DefaultEbmlReader defaultEbmlReader) {
        readString readstring = new readString(defaultEbmlReader);
        this.IconCompatParcelizer = readstring;
        readAmfString readamfstring = readAmfData.read(new startMasterElement(readstring));
        this.RemoteActionCompatParcelizer = readamfstring;
        readAmfString readamfstring2 = readAmfData.read(new getElementType(readstring, readamfstring));
        this.write = readamfstring2;
        readAmfString readamfstring3 = readAmfData.read(new StartOffsetExtractorOutput1(readstring));
        this.read = readamfstring3;
        readAmfString readamfstring4 = readAmfData.read(new maybeResyncToNextLevel1Element(readamfstring2, readamfstring3, readstring));
        this.MediaBrowserCompatItemReceiver = readamfstring4;
        this.AudioAttributesImplBaseParcelizer = readAmfData.read(new parseMotionPhotoPresentationTimestampUsFromDescription(readamfstring4));
    }

    @Override // kotlin.parseMotionPhotoFlagFromDescription
    public final readTagData read() {
        return (readTagData) this.AudioAttributesImplBaseParcelizer.IconCompatParcelizer();
    }
}
