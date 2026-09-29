package kotlin;

import java.util.Iterator;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00010\u0002B'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\rH\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0004\u001a\u0004\u0018\u00010\u0010H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0018\u001a\u00020\u00038\u0006¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0011\u0010\u001b\u001a\u00020\u00058\u0006¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0019\u001a\u00020\u00078\u0006¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0011\u0010\u001c\u001a\u00020\t8\u0006¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001a\u0010\u001e\u001a\u00020\u00108\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010 \u001a\u0004\b\u0019\u0010!R\u0016\u0010%\u001a\u0004\u0018\u00010\"8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0016\u0010&\u001a\u0004\u0018\u00010\u00108WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010!R\u001c\u0010(\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u00028WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010'R \u0010#\u001a\b\u0012\u0004\u0012\u00020\u00010\u00028\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u001b\u0010)\u001a\u0004\b\u001b\u0010'R\u0014\u0010\u0016\u001a\u00020\u00108WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010!"}, d2 = {"Lo/NumberInput;", "Lo/JsonReadFeature;", "", "Lo/releaseTokenBuffer;", "p0", "", "p1", "Lo/filterFinishObject;", "p2", "Lo/inLongRange;", "p3", "<init>", "(Lo/releaseTokenBuffer;ILo/filterFinishObject;Lo/inLongRange;)V", "", "iterator", "()Ljava/util/Iterator;", "", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "AudioAttributesImplApi26Parcelizer", "Lo/releaseTokenBuffer;", "AudioAttributesCompatParcelizer", "RemoteActionCompatParcelizer", "I", "read", "IconCompatParcelizer", "Lo/filterFinishObject;", "write", "Lo/inLongRange;", "Ljava/lang/Object;", "()Ljava/lang/Object;", "", "AudioAttributesImplBaseParcelizer", "()Ljava/lang/String;", "MediaBrowserCompatCustomActionResultReceiver", "AudioAttributesImplApi21Parcelizer", "()Ljava/lang/Iterable;", "MediaBrowserCompatItemReceiver", "Ljava/lang/Iterable;"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class NumberInput implements JsonReadFeature, Iterable<JsonReadFeature>, getCurrentAnsweredMcqProgress {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final Object write;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private final releaseTokenBuffer AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final filterFinishObject RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final int read;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final Iterable<JsonReadFeature> AudioAttributesImplBaseParcelizer = this;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final inLongRange IconCompatParcelizer;

    @Override // kotlin.JsonReadFeature
    public final Object IconCompatParcelizer() {
        return null;
    }

    public NumberInput(releaseTokenBuffer releasetokenbuffer, int i, filterFinishObject filterfinishobject, inLongRange inlongrange) {
        this.AudioAttributesCompatParcelizer = releasetokenbuffer;
        this.read = i;
        this.RemoteActionCompatParcelizer = filterfinishobject;
        this.IconCompatParcelizer = inlongrange;
        this.write = Integer.valueOf(filterfinishobject.getRemoteActionCompatParcelizer());
    }

    @Override // kotlin.JsonReadFeature
    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final Object getWrite() {
        return this.write;
    }

    @Override // kotlin.JsonReadFeature
    public final String AudioAttributesImplBaseParcelizer() {
        return this.RemoteActionCompatParcelizer.getMediaBrowserCompatCustomActionResultReceiver();
    }

    @Override // kotlin.JsonReadFeature
    public final Iterable<Object> AudioAttributesCompatParcelizer() {
        return new parseAsLong(this.AudioAttributesCompatParcelizer, this.read, this.RemoteActionCompatParcelizer);
    }

    @Override // kotlin.JsonReadContext
    public final Iterable<JsonReadFeature> read() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    @Override // kotlin.JsonReadFeature
    public final Object write() {
        return this.IconCompatParcelizer.IconCompatParcelizer(this.AudioAttributesCompatParcelizer);
    }

    @Override // java.lang.Iterable
    public final Iterator<JsonReadFeature> iterator() {
        return new parseAsDouble(this.AudioAttributesCompatParcelizer, this.read, this.RemoteActionCompatParcelizer, this.IconCompatParcelizer);
    }

    public final boolean equals(Object p0) {
        if (!(p0 instanceof NumberInput)) {
            return false;
        }
        NumberInput numberInput = (NumberInput) p0;
        return numberInput.read == this.read && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(numberInput.AudioAttributesCompatParcelizer, this.AudioAttributesCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(numberInput.IconCompatParcelizer, this.IconCompatParcelizer);
    }

    public final int hashCode() {
        return (((this.read * 31) + this.AudioAttributesCompatParcelizer.hashCode()) * 31) + this.IconCompatParcelizer.hashCode();
    }
}
