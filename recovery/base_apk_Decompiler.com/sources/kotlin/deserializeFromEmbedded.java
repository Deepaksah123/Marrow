package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\n\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0013\u0010\u0012R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0010\u001a\u0004\b\u0014\u0010\u0012R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0010\u001a\u0004\b\u000f\u0010\u0012"}, d2 = {"Lo/deserializeFromEmbedded;", "", "Lo/_findPropertyUnwrapper;", "p0", "p1", "p2", "p3", "<init>", "(Lo/_findPropertyUnwrapper;Lo/_findPropertyUnwrapper;Lo/_findPropertyUnwrapper;Lo/_findPropertyUnwrapper;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "AudioAttributesCompatParcelizer", "Lo/_findPropertyUnwrapper;", "IconCompatParcelizer", "()Lo/_findPropertyUnwrapper;", "write", "RemoteActionCompatParcelizer", "read"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class deserializeFromEmbedded {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final _findPropertyUnwrapper IconCompatParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final _findPropertyUnwrapper write;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final _findPropertyUnwrapper read;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final _findPropertyUnwrapper AudioAttributesCompatParcelizer;

    public deserializeFromEmbedded(_findPropertyUnwrapper _findpropertyunwrapper, _findPropertyUnwrapper _findpropertyunwrapper2, _findPropertyUnwrapper _findpropertyunwrapper3, _findPropertyUnwrapper _findpropertyunwrapper4) {
        this.IconCompatParcelizer = _findpropertyunwrapper;
        this.AudioAttributesCompatParcelizer = _findpropertyunwrapper2;
        this.read = _findpropertyunwrapper3;
        this.write = _findpropertyunwrapper4;
    }

    public /* synthetic */ deserializeFromEmbedded(_findPropertyUnwrapper _findpropertyunwrapper, _findPropertyUnwrapper _findpropertyunwrapper2, _findPropertyUnwrapper _findpropertyunwrapper3, _findPropertyUnwrapper _findpropertyunwrapper4, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i & 1) != 0 ? null : _findpropertyunwrapper, (i & 2) != 0 ? null : _findpropertyunwrapper2, (i & 4) != 0 ? null : _findpropertyunwrapper3, (i & 8) != 0 ? null : _findpropertyunwrapper4);
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final _findPropertyUnwrapper getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final _findPropertyUnwrapper getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final _findPropertyUnwrapper getRead() {
        return this.read;
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final _findPropertyUnwrapper getWrite() {
        return this.write;
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (p0 == null || !(p0 instanceof deserializeFromEmbedded)) {
            return false;
        }
        deserializeFromEmbedded deserializefromembedded = (deserializeFromEmbedded) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.IconCompatParcelizer, deserializefromembedded.IconCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, deserializefromembedded.AudioAttributesCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.read, deserializefromembedded.read) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.write, deserializefromembedded.write);
    }

    public final int hashCode() {
        _findPropertyUnwrapper _findpropertyunwrapper = this.IconCompatParcelizer;
        int iHashCode = _findpropertyunwrapper != null ? _findpropertyunwrapper.hashCode() : 0;
        _findPropertyUnwrapper _findpropertyunwrapper2 = this.AudioAttributesCompatParcelizer;
        int iHashCode2 = _findpropertyunwrapper2 != null ? _findpropertyunwrapper2.hashCode() : 0;
        _findPropertyUnwrapper _findpropertyunwrapper3 = this.read;
        int iHashCode3 = _findpropertyunwrapper3 != null ? _findpropertyunwrapper3.hashCode() : 0;
        _findPropertyUnwrapper _findpropertyunwrapper4 = this.write;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (_findpropertyunwrapper4 != null ? _findpropertyunwrapper4.hashCode() : 0);
    }

    public deserializeFromEmbedded() {
        this(null, null, null, null, 15, null);
    }
}
