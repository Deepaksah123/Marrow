package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u001d\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0013\b\u0016\u0012\b\b\u0002\u0010\u0003\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\r\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019"}, d2 = {"Lo/_getSetterInfo;", "", "Lo/_findCustomReferenceDeserializer;", "p0", "Lo/_findCustomTreeNodeDeserializer;", "p1", "<init>", "(Lo/_findCustomReferenceDeserializer;Lo/_findCustomTreeNodeDeserializer;)V", "", "(Z)V", "", "hashCode", "()I", "equals", "(Ljava/lang/Object;)Z", "", "toString", "()Ljava/lang/String;", "AudioAttributesCompatParcelizer", "Lo/_findCustomReferenceDeserializer;", "IconCompatParcelizer", "()Lo/_findCustomReferenceDeserializer;", "write", "Lo/_findCustomTreeNodeDeserializer;", "read", "()Lo/_findCustomTreeNodeDeserializer;", "RemoteActionCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class _getSetterInfo {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final _findCustomReferenceDeserializer IconCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final _findCustomTreeNodeDeserializer RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final _findCustomReferenceDeserializer getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final _findCustomTreeNodeDeserializer getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public _getSetterInfo(_findCustomReferenceDeserializer _findcustomreferencedeserializer, _findCustomTreeNodeDeserializer _findcustomtreenodedeserializer) {
        this.IconCompatParcelizer = _findcustomreferencedeserializer;
        this.RemoteActionCompatParcelizer = _findcustomtreenodedeserializer;
    }

    public _getSetterInfo(boolean z) {
        this(null, new _findCustomTreeNodeDeserializer(z));
    }

    public final int hashCode() {
        _findCustomReferenceDeserializer _findcustomreferencedeserializer = this.IconCompatParcelizer;
        int iHashCode = _findcustomreferencedeserializer != null ? _findcustomreferencedeserializer.hashCode() : 0;
        _findCustomTreeNodeDeserializer _findcustomtreenodedeserializer = this.RemoteActionCompatParcelizer;
        return (iHashCode * 31) + (_findcustomtreenodedeserializer != null ? _findcustomtreenodedeserializer.hashCode() : 0);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof _getSetterInfo)) {
            return false;
        }
        _getSetterInfo _getsetterinfo = (_getSetterInfo) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, _getsetterinfo.RemoteActionCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.IconCompatParcelizer, _getsetterinfo.IconCompatParcelizer);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlatformTextStyle(spanStyle=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", paragraphSyle=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(')');
        return sb.toString();
    }
}
