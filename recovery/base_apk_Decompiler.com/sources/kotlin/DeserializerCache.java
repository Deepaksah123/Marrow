package kotlin;

import kotlin.Metadata;
import kotlin.getReader;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\r\u0018\u00002\u00020\u0001B9\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u000eH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0017\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u0013R\u001a\u0010\u001e\u001a\u00020\u00048\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0019\u001a\u00020\u00068\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u0018\u001a\u0004\b\u001f\u0010\u0013R\u001a\u0010\u001c\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010 \u001a\u0004\b\u001e\u0010!R\u001a\u0010\u001f\u001a\u00020\n8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u0018\u001a\u0004\b\u0017\u0010\u0013"}, d2 = {"Lo/DeserializerCache;", "Lo/deserializeAndSet;", "", "p0", "Lo/getDataStream;", "p1", "Lo/withValueDeserializer;", "p2", "Lo/getReader$read;", "p3", "Lo/DataFormatReaders;", "p4", "<init>", "(ILo/getDataStream;ILo/getReader$read;ILo/MagicModuleRepositoryImplExternalSyntheticLambda0;)V", "", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "RemoteActionCompatParcelizer", "I", "write", "MediaBrowserCompatItemReceiver", "Lo/getDataStream;", "read", "()Lo/getDataStream;", "AudioAttributesCompatParcelizer", "IconCompatParcelizer", "Lo/getReader$read;", "()Lo/getReader$read;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DeserializerCache implements deserializeAndSet {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final int write;
    private final int IconCompatParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private final getDataStream AudioAttributesCompatParcelizer;
    private final int RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final getReader.read read;

    private DeserializerCache(int i, getDataStream getdatastream, int i2, getReader.read readVar, int i3) {
        this.RemoteActionCompatParcelizer = i;
        this.AudioAttributesCompatParcelizer = getdatastream;
        this.write = i2;
        this.read = readVar;
        this.IconCompatParcelizer = i3;
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final int getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    @Override // kotlin.deserializeAndSet
    /* JADX INFO: renamed from: read, reason: from getter */
    public final getDataStream getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    @Override // kotlin.deserializeAndSet
    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final int getWrite() {
        return this.write;
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final getReader.read getRead() {
        return this.read;
    }

    @Override // kotlin.deserializeAndSet
    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final int getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof DeserializerCache)) {
            return false;
        }
        DeserializerCache deserializerCache = (DeserializerCache) p0;
        return this.RemoteActionCompatParcelizer == deserializerCache.RemoteActionCompatParcelizer && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(getAudioAttributesCompatParcelizer(), deserializerCache.getAudioAttributesCompatParcelizer()) && withValueDeserializer.write(getWrite(), deserializerCache.getWrite()) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.read, deserializerCache.read) && DataFormatReaders.read(getIconCompatParcelizer(), deserializerCache.getIconCompatParcelizer());
    }

    public final int hashCode() {
        int i = this.RemoteActionCompatParcelizer;
        int iHashCode = getAudioAttributesCompatParcelizer().hashCode();
        return (((((((i * 31) + iHashCode) * 31) + withValueDeserializer.RemoteActionCompatParcelizer(getWrite())) * 31) + DataFormatReaders.read(getIconCompatParcelizer())) * 31) + this.read.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ResourceFont(resId=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", weight=");
        sb.append(getAudioAttributesCompatParcelizer());
        sb.append(", style=");
        sb.append((Object) withValueDeserializer.AudioAttributesCompatParcelizer(getWrite()));
        sb.append(", loadingStrategy=");
        sb.append((Object) DataFormatReaders.RemoteActionCompatParcelizer(getIconCompatParcelizer()));
        sb.append(')');
        return sb.toString();
    }

    public /* synthetic */ DeserializerCache(int i, getDataStream getdatastream, int i2, getReader.read readVar, int i3, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(i, getdatastream, i2, readVar, i3);
    }
}
