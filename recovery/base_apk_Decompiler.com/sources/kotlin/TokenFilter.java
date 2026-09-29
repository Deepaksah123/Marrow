package kotlin;

import java.util.Iterator;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nH\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0014\u001a\u00020\u00038\u0006¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0015\u001a\u00020\u00058\u0006¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0010\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0016R\u0014\u0010\r\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0016"}, d2 = {"Lo/TokenFilter;", "", "Lo/JsonReadFeature;", "Lo/releaseTokenBuffer;", "p0", "", "p1", "p2", "<init>", "(Lo/releaseTokenBuffer;II)V", "", "hasNext", "()Z", "RemoteActionCompatParcelizer", "()Lo/JsonReadFeature;", "", "read", "()V", "IconCompatParcelizer", "Lo/releaseTokenBuffer;", "AudioAttributesCompatParcelizer", "write", "I"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class TokenFilter implements Iterator<JsonReadFeature>, getCurrentAnsweredMcqProgress {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private int read;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final releaseTokenBuffer AudioAttributesCompatParcelizer;
    private final int RemoteActionCompatParcelizer;
    private final int write;

    public TokenFilter(releaseTokenBuffer releasetokenbuffer, int i, int i2) {
        this.AudioAttributesCompatParcelizer = releasetokenbuffer;
        this.write = i2;
        this.read = i;
        this.RemoteActionCompatParcelizer = releasetokenbuffer.getAudioAttributesImplApi26Parcelizer();
        if (releasetokenbuffer.getMediaMetadataCompat()) {
            InputDecorator.IconCompatParcelizer();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.read < this.write;
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public final JsonReadFeature next() {
        read();
        int i = this.read;
        this.read = InputDecorator.AudioAttributesImplApi21Parcelizer(this.AudioAttributesCompatParcelizer.getRead(), i) + i;
        return new releaseReadIOBuffer(this.AudioAttributesCompatParcelizer, i, this.RemoteActionCompatParcelizer);
    }

    private final void read() {
        if (this.AudioAttributesCompatParcelizer.getAudioAttributesImplApi26Parcelizer() != this.RemoteActionCompatParcelizer) {
            InputDecorator.IconCompatParcelizer();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
