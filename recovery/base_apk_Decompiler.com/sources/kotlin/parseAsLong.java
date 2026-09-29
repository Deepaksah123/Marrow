package kotlin;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0010\u0000\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0003B\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eH\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002H\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0015\u001a\u00020\u00048\u0006¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0016\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001d\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0017"}, d2 = {"Lo/parseAsLong;", "", "", "", "Lo/releaseTokenBuffer;", "p0", "", "p1", "Lo/filterFinishObject;", "p2", "<init>", "(Lo/releaseTokenBuffer;ILo/filterFinishObject;)V", "iterator", "()Ljava/util/Iterator;", "", "hasNext", "()Z", "next", "()Ljava/lang/Object;", "MediaBrowserCompatCustomActionResultReceiver", "Lo/releaseTokenBuffer;", "IconCompatParcelizer", "AudioAttributesCompatParcelizer", "I", "read", "RemoteActionCompatParcelizer", "Lo/growArrayBy;", "write", "Lo/growArrayBy;", "AudioAttributesImplApi26Parcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class parseAsLong implements Iterable<Object>, Iterator<Object>, getCurrentAnsweredMcqProgress {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final int read;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private int AudioAttributesImplApi26Parcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private final releaseTokenBuffer IconCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final int AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final int RemoteActionCompatParcelizer;
    private final growArrayBy write;

    public parseAsLong(releaseTokenBuffer releasetokenbuffer, int i, filterFinishObject filterfinishobject) {
        int audioAttributesImplBaseParcelizer;
        this.IconCompatParcelizer = releasetokenbuffer;
        int i2 = releasetokenbuffer.getRead()[(i * 5) + 4];
        this.read = i2;
        this.AudioAttributesCompatParcelizer = filterfinishobject.getIconCompatParcelizer();
        int read = filterfinishobject.getRead();
        if (read <= 0) {
            int i3 = i + 1;
            if (i3 >= releasetokenbuffer.getRemoteActionCompatParcelizer()) {
                audioAttributesImplBaseParcelizer = releasetokenbuffer.getAudioAttributesImplBaseParcelizer();
            } else {
                audioAttributesImplBaseParcelizer = releasetokenbuffer.getRead()[(i3 * 5) + 4];
            }
            read = audioAttributesImplBaseParcelizer - i2;
        }
        this.RemoteActionCompatParcelizer = read;
        growArrayBy growarrayby = new growArrayBy();
        ArrayList<Object> arrayListRemoteActionCompatParcelizer = filterfinishobject.RemoteActionCompatParcelizer();
        if (arrayListRemoteActionCompatParcelizer != null) {
            ArrayList<Object> arrayList = arrayListRemoteActionCompatParcelizer;
            int size = arrayList.size();
            for (int i4 = 0; i4 < size; i4++) {
                Object obj = arrayList.get(i4);
                if (obj instanceof filterFinishObject) {
                    filterFinishObject filterfinishobject2 = (filterFinishObject) obj;
                    growarrayby.AudioAttributesCompatParcelizer(filterfinishobject2.getIconCompatParcelizer(), filterfinishobject2.getRead());
                }
            }
        }
        this.write = growarrayby;
        this.AudioAttributesImplApi26Parcelizer = growarrayby.AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer);
    }

    @Override // java.lang.Iterable
    public final Iterator<Object> iterator() {
        return this;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.AudioAttributesImplApi26Parcelizer < this.RemoteActionCompatParcelizer;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.RemoteActionCompatParcelizer;
        int i2 = this.AudioAttributesImplApi26Parcelizer;
        Object obj = (i2 < 0 || i2 >= i) ? null : this.IconCompatParcelizer.getMediaBrowserCompatCustomActionResultReceiver()[this.read + this.AudioAttributesImplApi26Parcelizer];
        this.AudioAttributesImplApi26Parcelizer = this.write.AudioAttributesCompatParcelizer(this.AudioAttributesImplApi26Parcelizer + 1);
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
