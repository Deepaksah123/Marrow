package kotlin;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class AtomParsersStszSampleSizeBox<K, V> extends getSampleCount<K, V> {
    private transient int read;

    @Override // kotlin.readNextSampleSize
    public final /* bridge */ /* synthetic */ boolean AudioAttributesCompatParcelizer(Object obj) {
        return super.AudioAttributesCompatParcelizer(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.AtomParsersSampleSizeBox, kotlin.parseMoof
    /* JADX INFO: renamed from: IconCompatParcelizer */
    public final /* bridge */ /* synthetic */ List write(Object obj) {
        return super.write(obj);
    }

    @Override // kotlin.readNextSampleSize, kotlin.outputPendingMetadataSamples
    public final /* bridge */ /* synthetic */ boolean IconCompatParcelizer(Object obj, Object obj2) {
        return super.IconCompatParcelizer(obj, obj2);
    }

    @Override // kotlin.moveNext, kotlin.readNextSampleSize, kotlin.outputPendingMetadataSamples
    public final /* bridge */ /* synthetic */ Collection MediaMetadataCompat() {
        return super.MediaMetadataCompat();
    }

    @Override // kotlin.moveNext, kotlin.outputPendingMetadataSamples
    public final /* bridge */ /* synthetic */ int RatingCompat() {
        return super.RatingCompat();
    }

    @Override // kotlin.AtomParsersSampleSizeBox, kotlin.readNextSampleSize, kotlin.outputPendingMetadataSamples
    public final /* bridge */ /* synthetic */ Map RemoteActionCompatParcelizer() {
        return super.RemoteActionCompatParcelizer();
    }

    @Override // kotlin.AtomParsersSampleSizeBox, kotlin.readNextSampleSize
    public final /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // kotlin.readNextSampleSize, kotlin.outputPendingMetadataSamples
    public final /* bridge */ /* synthetic */ boolean handleMediaPlayPauseIfPendingOnHandler() {
        return super.handleMediaPlayPauseIfPendingOnHandler();
    }

    @Override // kotlin.readNextSampleSize
    public final /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // kotlin.moveNext, kotlin.readNextSampleSize, kotlin.outputPendingMetadataSamples
    public final /* bridge */ /* synthetic */ Collection onAddQueueItem() {
        return super.onAddQueueItem();
    }

    @Override // kotlin.readNextSampleSize, kotlin.outputPendingMetadataSamples
    public final /* bridge */ /* synthetic */ Set onCommand() {
        return super.onCommand();
    }

    @Override // kotlin.moveNext, kotlin.outputPendingMetadataSamples
    public final /* bridge */ /* synthetic */ void read() {
        super.read();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.readNextSampleSize
    public final /* bridge */ /* synthetic */ boolean read(Object obj, Iterable iterable) {
        return super.read(obj, iterable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.AtomParsersSampleSizeBox, kotlin.moveNext, kotlin.readNextSampleSize, kotlin.outputPendingMetadataSamples
    public final /* bridge */ /* synthetic */ boolean read(Object obj, Object obj2) {
        return super.read(obj, obj2);
    }

    @Override // kotlin.readNextSampleSize
    public final /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    @Override // kotlin.readNextSampleSize, kotlin.outputPendingMetadataSamples
    public final /* bridge */ /* synthetic */ boolean write(Object obj, Object obj2) {
        return super.write(obj, obj2);
    }

    public static <K, V> AtomParsersStszSampleSizeBox<K, V> MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
        return new AtomParsersStszSampleSizeBox<>();
    }

    private AtomParsersStszSampleSizeBox() {
        this((byte) 0);
    }

    private AtomParsersStszSampleSizeBox(byte b) {
        super(parseTrex.RemoteActionCompatParcelizer(12));
        FixedSampleSizeRechunker.IconCompatParcelizer(3, "expectedValuesPerKey");
        this.read = 3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // kotlin.AtomParsersSampleSizeBox, kotlin.moveNext
    /* JADX INFO: renamed from: IconCompatParcelizer */
    public final List<V> write() {
        return new ArrayList(this.read);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        readEncryptionData.write(this, objectOutputStream);
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.read = 3;
        int iIconCompatParcelizer = readEncryptionData.IconCompatParcelizer(objectInputStream);
        RemoteActionCompatParcelizer((Map) AtomParsersTkhdData.RemoteActionCompatParcelizer());
        readEncryptionData.RemoteActionCompatParcelizer(this, objectInputStream, iIconCompatParcelizer);
    }
}
