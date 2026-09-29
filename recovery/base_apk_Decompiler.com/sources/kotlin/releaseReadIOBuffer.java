package kotlin;

import java.util.Iterator;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00010\u0002B!\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\nH\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0004\u001a\u0004\u0018\u00010\u0010H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0016\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u00108WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001cR\u0016\u0010 \u001a\u0004\u0018\u00010\u001d8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0016\u0010!\u001a\u0004\u0018\u00010\u00108WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u001cR\u001c\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u00028WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\"R\u0014\u0010\u000e\u001a\u00020\u00108WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010\u001cR\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00010\u00028WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\""}, d2 = {"Lo/releaseReadIOBuffer;", "Lo/JsonReadFeature;", "", "Lo/releaseTokenBuffer;", "p0", "", "p1", "p2", "<init>", "(Lo/releaseTokenBuffer;II)V", "", "iterator", "()Ljava/util/Iterator;", "", "MediaBrowserCompatItemReceiver", "()V", "", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "read", "Lo/releaseTokenBuffer;", "IconCompatParcelizer", "I", "RemoteActionCompatParcelizer", "AudioAttributesCompatParcelizer", "()Ljava/lang/Object;", "", "AudioAttributesImplBaseParcelizer", "()Ljava/lang/String;", "write", "AudioAttributesImplApi21Parcelizer", "()Ljava/lang/Iterable;", "MediaBrowserCompatCustomActionResultReceiver"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class releaseReadIOBuffer implements JsonReadFeature, Iterable<JsonReadFeature>, getCurrentAnsweredMcqProgress {

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final int read;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final int AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final releaseTokenBuffer IconCompatParcelizer;

    public releaseReadIOBuffer(releaseTokenBuffer releasetokenbuffer, int i, int i2) {
        this.IconCompatParcelizer = releasetokenbuffer;
        this.read = i;
        this.AudioAttributesCompatParcelizer = i2;
    }

    @Override // kotlin.JsonReadFeature
    public final Object RemoteActionCompatParcelizer() {
        if ((this.IconCompatParcelizer.getRead()[(this.read * 5) + 1] & 536870912) != 0) {
            Object obj = this.IconCompatParcelizer.getMediaBrowserCompatCustomActionResultReceiver()[InputDecorator.AudioAttributesImplApi26Parcelizer(this.IconCompatParcelizer.getRead(), this.read)];
            toMagicModuleMetaRepoModel.write(obj);
            return obj;
        }
        return Integer.valueOf(this.IconCompatParcelizer.getRead()[this.read * 5]);
    }

    @Override // kotlin.JsonReadFeature
    public final String AudioAttributesImplBaseParcelizer() {
        filterFinishObject filterfinishobjectRemoteActionCompatParcelizer = this.IconCompatParcelizer.RemoteActionCompatParcelizer(this.read);
        if (filterfinishobjectRemoteActionCompatParcelizer != null) {
            return filterfinishobjectRemoteActionCompatParcelizer.getMediaBrowserCompatCustomActionResultReceiver();
        }
        return null;
    }

    @Override // kotlin.JsonReadFeature
    public final Object IconCompatParcelizer() {
        if ((this.IconCompatParcelizer.getRead()[(this.read * 5) + 1] & 1073741824) != 0) {
            return this.IconCompatParcelizer.getMediaBrowserCompatCustomActionResultReceiver()[this.IconCompatParcelizer.getRead()[(this.read * 5) + 4]];
        }
        return null;
    }

    @Override // kotlin.JsonReadFeature
    public final Iterable<Object> AudioAttributesCompatParcelizer() {
        filterFinishObject filterfinishobjectRemoteActionCompatParcelizer = this.IconCompatParcelizer.RemoteActionCompatParcelizer(this.read);
        if (filterfinishobjectRemoteActionCompatParcelizer != null) {
            return new parseAsLong(this.IconCompatParcelizer, this.read, filterfinishobjectRemoteActionCompatParcelizer);
        }
        return new _throwInvalidSpace(this.IconCompatParcelizer, this.read);
    }

    @Override // kotlin.JsonReadFeature
    public final Object write() {
        MediaBrowserCompatItemReceiver();
        releaseBase64Buffer releasebase64bufferMediaBrowserCompatMediaItem = this.IconCompatParcelizer.MediaBrowserCompatMediaItem();
        try {
            return releasebase64bufferMediaBrowserCompatMediaItem.IconCompatParcelizer(this.read);
        } finally {
            releasebase64bufferMediaBrowserCompatMediaItem.IconCompatParcelizer();
        }
    }

    @Override // kotlin.JsonReadContext
    public final Iterable<JsonReadFeature> read() {
        return this;
    }

    @Override // java.lang.Iterable
    public final Iterator<JsonReadFeature> iterator() {
        MediaBrowserCompatItemReceiver();
        filterFinishObject filterfinishobjectRemoteActionCompatParcelizer = this.IconCompatParcelizer.RemoteActionCompatParcelizer(this.read);
        if (filterfinishobjectRemoteActionCompatParcelizer != null) {
            releaseTokenBuffer releasetokenbuffer = this.IconCompatParcelizer;
            int i = this.read;
            return new parseAsDouble(releasetokenbuffer, i, filterfinishobjectRemoteActionCompatParcelizer, new _parseSlowInt(i));
        }
        releaseTokenBuffer releasetokenbuffer2 = this.IconCompatParcelizer;
        int i2 = this.read;
        return new TokenFilter(releasetokenbuffer2, i2 + 1, i2 + InputDecorator.AudioAttributesImplApi21Parcelizer(releasetokenbuffer2.getRead(), this.read));
    }

    private final void MediaBrowserCompatItemReceiver() {
        if (this.IconCompatParcelizer.getAudioAttributesImplApi26Parcelizer() != this.AudioAttributesCompatParcelizer) {
            InputDecorator.IconCompatParcelizer();
        }
    }

    public final boolean equals(Object p0) {
        if (!(p0 instanceof releaseReadIOBuffer)) {
            return false;
        }
        releaseReadIOBuffer releasereadiobuffer = (releaseReadIOBuffer) p0;
        return releasereadiobuffer.read == this.read && releasereadiobuffer.AudioAttributesCompatParcelizer == this.AudioAttributesCompatParcelizer && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(releasereadiobuffer.IconCompatParcelizer, this.IconCompatParcelizer);
    }

    public final int hashCode() {
        return this.read + (this.IconCompatParcelizer.hashCode() * 31);
    }
}
