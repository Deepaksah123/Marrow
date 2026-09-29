package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\b\u0080\b\u0018\u00002\u00020\u0001B3\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u000b\u0010\fJF\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0001HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\r\u0010\u0018\u001a\u0004\b\r\u0010\u0019R\u001a\u0010\u001e\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001f\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001e\u0010\u0014R\u001a\u0010\u001c\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010 \u001a\u0004\b\u001a\u0010\u0014R\u0016\u0010\r\u001a\u0004\u0018\u00010\u00018\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010!"}, d2 = {"Lo/_createDeserializer;", "", "Lo/_reportMissingSetter;", "p0", "Lo/getDataStream;", "p1", "Lo/withValueDeserializer;", "p2", "Lo/_findFormat;", "p3", "p4", "<init>", "(Lo/_reportMissingSetter;Lo/getDataStream;IILjava/lang/Object;Lo/MagicModuleRepositoryImplExternalSyntheticLambda0;)V", "write", "(Lo/_reportMissingSetter;Lo/getDataStream;IILjava/lang/Object;)Lo/_createDeserializer;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lo/_reportMissingSetter;", "()Lo/_reportMissingSetter;", "read", "Lo/getDataStream;", "RemoteActionCompatParcelizer", "()Lo/getDataStream;", "AudioAttributesCompatParcelizer", "IconCompatParcelizer", "I", "Ljava/lang/Object;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class _createDeserializer {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final int RemoteActionCompatParcelizer;
    private final int IconCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final Object write;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final getDataStream AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final _reportMissingSetter read;

    private _createDeserializer(_reportMissingSetter _reportmissingsetter, getDataStream getdatastream, int i, int i2, Object obj) {
        this.read = _reportmissingsetter;
        this.AudioAttributesCompatParcelizer = getdatastream;
        this.IconCompatParcelizer = i;
        this.RemoteActionCompatParcelizer = i2;
        this.write = obj;
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final _reportMissingSetter getRead() {
        return this.read;
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final getDataStream getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final int getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final int getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public /* synthetic */ _createDeserializer(_reportMissingSetter _reportmissingsetter, getDataStream getdatastream, int i, int i2, Object obj, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(_reportmissingsetter, getdatastream, i, i2, obj);
    }

    public static /* synthetic */ _createDeserializer write$default(_createDeserializer _createdeserializer, _reportMissingSetter _reportmissingsetter, getDataStream getdatastream, int i, int i2, Object obj, int i3, Object obj2) {
        if ((i3 & 1) != 0) {
            _reportmissingsetter = _createdeserializer.read;
        }
        if ((i3 & 2) != 0) {
            getdatastream = _createdeserializer.AudioAttributesCompatParcelizer;
        }
        getDataStream getdatastream2 = getdatastream;
        if ((i3 & 4) != 0) {
            i = _createdeserializer.IconCompatParcelizer;
        }
        int i4 = i;
        if ((i3 & 8) != 0) {
            i2 = _createdeserializer.RemoteActionCompatParcelizer;
        }
        int i5 = i2;
        if ((i3 & 16) != 0) {
            obj = _createdeserializer.write;
        }
        return _createdeserializer.write(_reportmissingsetter, getdatastream2, i4, i5, obj);
    }

    public final _createDeserializer write(_reportMissingSetter p0, getDataStream p1, int p2, int p3, Object p4) {
        return new _createDeserializer(p0, p1, p2, p3, p4, null);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof _createDeserializer)) {
            return false;
        }
        _createDeserializer _createdeserializer = (_createDeserializer) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.read, _createdeserializer.read) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, _createdeserializer.AudioAttributesCompatParcelizer) && withValueDeserializer.write(this.IconCompatParcelizer, _createdeserializer.IconCompatParcelizer) && _findFormat.AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer, _createdeserializer.RemoteActionCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.write, _createdeserializer.write);
    }

    public final int hashCode() {
        _reportMissingSetter _reportmissingsetter = this.read;
        int iHashCode = _reportmissingsetter == null ? 0 : _reportmissingsetter.hashCode();
        int iHashCode2 = this.AudioAttributesCompatParcelizer.hashCode();
        int iRemoteActionCompatParcelizer = withValueDeserializer.RemoteActionCompatParcelizer(this.IconCompatParcelizer);
        int iAudioAttributesCompatParcelizer = _findFormat.AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer);
        Object obj = this.write;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iRemoteActionCompatParcelizer) * 31) + iAudioAttributesCompatParcelizer) * 31) + (obj != null ? obj.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("_createDeserializer(read=");
        sb.append(this.read);
        sb.append(", AudioAttributesCompatParcelizer=");
        sb.append(this.AudioAttributesCompatParcelizer);
        sb.append(", IconCompatParcelizer=");
        sb.append((Object) withValueDeserializer.AudioAttributesCompatParcelizer(this.IconCompatParcelizer));
        sb.append(", RemoteActionCompatParcelizer=");
        sb.append((Object) _findFormat.AudioAttributesImplApi26Parcelizer(this.RemoteActionCompatParcelizer));
        sb.append(", write=");
        sb.append(this.write);
        sb.append(')');
        return sb.toString();
    }
}
