package kotlin;

import java.util.Iterator;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0010\u0000\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0002\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0003B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fH\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002H\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0013\u001a\u00020\u00048\u0006¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0014\u001a\u00020\u00068\u0006¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0017\u001a\u00020\u00068\u0006¢\u0006\u0006\n\u0004\b\u0016\u0010\u0015R\u0016\u0010\u0011\u001a\u00020\u00068\u0006@\u0006X\u0086\f¢\u0006\u0006\n\u0004\b\u0013\u0010\u0015"}, d2 = {"Lo/_throwInvalidSpace;", "", "", "", "Lo/releaseTokenBuffer;", "p0", "", "p1", "<init>", "(Lo/releaseTokenBuffer;I)V", "iterator", "()Ljava/util/Iterator;", "", "hasNext", "()Z", "next", "()Ljava/lang/Object;", "RemoteActionCompatParcelizer", "Lo/releaseTokenBuffer;", "AudioAttributesCompatParcelizer", "IconCompatParcelizer", "I", "write", "read"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class _throwInvalidSpace implements Iterable<Object>, Iterator<Object>, getCurrentAnsweredMcqProgress {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    public int RemoteActionCompatParcelizer;
    private final int IconCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final releaseTokenBuffer AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final int read;

    public _throwInvalidSpace(releaseTokenBuffer releasetokenbuffer, int i) {
        int audioAttributesImplBaseParcelizer;
        this.AudioAttributesCompatParcelizer = releasetokenbuffer;
        int i2 = releasetokenbuffer.getRead()[(i * 5) + 4];
        this.IconCompatParcelizer = i2;
        int i3 = i + 1;
        if (i3 >= releasetokenbuffer.getRemoteActionCompatParcelizer()) {
            audioAttributesImplBaseParcelizer = releasetokenbuffer.getAudioAttributesImplBaseParcelizer();
        } else {
            audioAttributesImplBaseParcelizer = releasetokenbuffer.getRead()[(i3 * 5) + 4];
        }
        this.read = audioAttributesImplBaseParcelizer;
        this.RemoteActionCompatParcelizer = i2;
    }

    @Override // java.lang.Iterable
    public final Iterator<Object> iterator() {
        return this;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.RemoteActionCompatParcelizer < this.read;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.RemoteActionCompatParcelizer;
        Object obj = (i < 0 || i >= this.AudioAttributesCompatParcelizer.getMediaBrowserCompatCustomActionResultReceiver().length) ? null : this.AudioAttributesCompatParcelizer.getMediaBrowserCompatCustomActionResultReceiver()[this.RemoteActionCompatParcelizer];
        this.RemoteActionCompatParcelizer++;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
