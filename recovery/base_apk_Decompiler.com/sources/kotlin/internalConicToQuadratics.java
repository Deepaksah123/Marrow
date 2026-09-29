package kotlin;

import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b \u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ/\u0010\r\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ5\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0007¢\u0006\u0004\b\u0010\u0010\u0011J_\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00122\b\u0010\b\u001a\u0004\u0018\u00010\u00122\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u00072\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u0007H&¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0019\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u001cR\u0014\u0010\r\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0011\u0010\u001e\u001a\u00020 8G¢\u0006\u0006\u001a\u0004\b\r\u0010!R\u0011\u0010\u0010\u001a\u00020\"8G¢\u0006\u0006\u001a\u0004\b\u001e\u0010#"}, d2 = {"Lo/internalConicToQuadratics;", "Lo/addMediaSource;", "Lo/createInternalPathIterator;", "Lo/onPostResume;", "p0", "Lo/Mp4LocationData;", "p1", "", "p2", "<init>", "(Lo/onPostResume;Lo/Mp4LocationData;I)V", "Lo/PropertyValueAny;", "p3", "IconCompatParcelizer", "(IIIJ)Lo/createInternalPathIterator;", "p4", "AudioAttributesCompatParcelizer", "(IJIII)Lo/createInternalPathIterator;", "", "", "Lo/_parser;", "p5", "p6", "p7", "p8", "read", "(ILjava/lang/Object;Ljava/lang/Object;IILjava/util/List;JII)Lo/createInternalPathIterator;", "Lo/onPostResume;", "Lo/Mp4LocationData;", "write", "RemoteActionCompatParcelizer", "I", "Lo/MdtaMetadataEntry;", "()Lo/MdtaMetadataEntry;", "Lo/setWindowTitle;", "()Lo/setWindowTitle;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class internalConicToQuadratics extends addMediaSource<createInternalPathIterator> {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final onPostResume read;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final Mp4LocationData write;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final int IconCompatParcelizer;

    public abstract createInternalPathIterator read(int p0, Object p1, Object p2, int p3, int p4, List<? extends _parser> p5, long p6, int p7, int p8);

    public internalConicToQuadratics(onPostResume onpostresume, Mp4LocationData mp4LocationData, int i) {
        this.read = onpostresume;
        this.write = mp4LocationData;
        this.IconCompatParcelizer = i;
    }

    @Override // kotlin.addMediaSource
    /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public createInternalPathIterator RemoteActionCompatParcelizer(int p0, int p1, int p2, long p3) {
        return AudioAttributesCompatParcelizer(p0, p3, p1, p2, this.IconCompatParcelizer);
    }

    public final createInternalPathIterator AudioAttributesCompatParcelizer(int p0, long p1, int p2, int p3, int p4) {
        int iMediaBrowserCompatCustomActionResultReceiver;
        Object objIconCompatParcelizer = this.read.IconCompatParcelizer(p0);
        Object objRemoteActionCompatParcelizer = this.read.RemoteActionCompatParcelizer(p0);
        List<_parser> listRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(this.write, p0, p1);
        if (PropertyValueAny.AudioAttributesImplApi26Parcelizer(p1)) {
            iMediaBrowserCompatCustomActionResultReceiver = PropertyValueAny.MediaBrowserCompatItemReceiver(p1);
        } else {
            if (!PropertyValueAny.IconCompatParcelizer(p1)) {
                getRootStableInsets.RemoteActionCompatParcelizer("does not have fixed height");
            }
            iMediaBrowserCompatCustomActionResultReceiver = PropertyValueAny.MediaBrowserCompatCustomActionResultReceiver(p1);
        }
        return read(p0, objIconCompatParcelizer, objRemoteActionCompatParcelizer, iMediaBrowserCompatCustomActionResultReceiver, p4, listRemoteActionCompatParcelizer, p1, p2, p3);
    }

    public final MdtaMetadataEntry IconCompatParcelizer() {
        return this.read.RemoteActionCompatParcelizer();
    }

    public final setWindowTitle RemoteActionCompatParcelizer() {
        return this.read.write();
    }
}
