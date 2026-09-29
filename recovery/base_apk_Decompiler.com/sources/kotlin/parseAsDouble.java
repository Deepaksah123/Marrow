package kotlin;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rH\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0014\u001a\u00020\u00038\u0006¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0010\u001a\u00020\u00058\u0006¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0018\u001a\u00020\u00078\u0006¢\u0006\u0006\n\u0004\b\u0014\u0010\u0017R\u0011\u0010\u0012\u001a\u00020\t8\u0006¢\u0006\u0006\n\u0004\b\u0010\u0010\u0019R\u0014\u0010\u0015\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0016R\u0016\u0010\u001b\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0016"}, d2 = {"Lo/parseAsDouble;", "", "Lo/JsonReadFeature;", "Lo/releaseTokenBuffer;", "p0", "", "p1", "Lo/filterFinishObject;", "p2", "Lo/inLongRange;", "p3", "<init>", "(Lo/releaseTokenBuffer;ILo/filterFinishObject;Lo/inLongRange;)V", "", "hasNext", "()Z", "RemoteActionCompatParcelizer", "()Lo/JsonReadFeature;", "write", "Lo/releaseTokenBuffer;", "read", "AudioAttributesCompatParcelizer", "I", "Lo/filterFinishObject;", "IconCompatParcelizer", "Lo/inLongRange;", "AudioAttributesImplBaseParcelizer", "MediaBrowserCompatItemReceiver"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class parseAsDouble implements Iterator<JsonReadFeature>, getCurrentAnsweredMcqProgress {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final int RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private final int AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private int MediaBrowserCompatItemReceiver;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final inLongRange write;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final filterFinishObject IconCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final releaseTokenBuffer read;

    public parseAsDouble(releaseTokenBuffer releasetokenbuffer, int i, filterFinishObject filterfinishobject, inLongRange inlongrange) {
        this.read = releasetokenbuffer;
        this.RemoteActionCompatParcelizer = i;
        this.IconCompatParcelizer = filterfinishobject;
        this.write = inlongrange;
        this.AudioAttributesCompatParcelizer = releasetokenbuffer.getAudioAttributesImplApi26Parcelizer();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        ArrayList<Object> arrayListRemoteActionCompatParcelizer = this.IconCompatParcelizer.RemoteActionCompatParcelizer();
        return arrayListRemoteActionCompatParcelizer != null && this.MediaBrowserCompatItemReceiver < arrayListRemoteActionCompatParcelizer.size();
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public final JsonReadFeature next() {
        Object obj;
        ArrayList<Object> arrayListRemoteActionCompatParcelizer = this.IconCompatParcelizer.RemoteActionCompatParcelizer();
        if (arrayListRemoteActionCompatParcelizer != null) {
            int i = this.MediaBrowserCompatItemReceiver;
            this.MediaBrowserCompatItemReceiver = i + 1;
            obj = arrayListRemoteActionCompatParcelizer.get(i);
        } else {
            obj = null;
        }
        if (obj instanceof _parseSlowFloat) {
            return new releaseReadIOBuffer(this.read, ((_parseSlowFloat) obj).getIconCompatParcelizer(), this.AudioAttributesCompatParcelizer);
        }
        if (obj instanceof filterFinishObject) {
            return new NumberInput(this.read, this.RemoteActionCompatParcelizer, (filterFinishObject) obj, new _verifyRelease(this.write, this.MediaBrowserCompatItemReceiver - 1));
        }
        _validJsonValueList.RemoteActionCompatParcelizer("Unexpected group information structure");
        throw new PlanDetailsCreator();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
