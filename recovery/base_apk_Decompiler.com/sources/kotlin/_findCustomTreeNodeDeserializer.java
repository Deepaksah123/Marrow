package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0013\b\u0016\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001d\b\u0016\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\bB\t\b\u0016¢\u0006\u0004\b\u0004\u0010\tJ\u001a\u0010\n\u001a\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0015\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0012\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u000e"}, d2 = {"Lo/_findCustomTreeNodeDeserializer;", "", "", "p0", "<init>", "(Z)V", "Lo/_deserializeIfNatural;", "p1", "(IZLo/MagicModuleRepositoryImplExternalSyntheticLambda0;)V", "()V", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "IconCompatParcelizer", "(Lo/_findCustomTreeNodeDeserializer;)Lo/_findCustomTreeNodeDeserializer;", "Z", "RemoteActionCompatParcelizer", "()Z", "read", "I", "AudioAttributesCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class _findCustomTreeNodeDeserializer {

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final boolean RemoteActionCompatParcelizer;
    private final int read;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final _findCustomTreeNodeDeserializer AudioAttributesCompatParcelizer = new _findCustomTreeNodeDeserializer();

    public final _findCustomTreeNodeDeserializer IconCompatParcelizer(_findCustomTreeNodeDeserializer p0) {
        return p0 == null ? this : p0;
    }

    /* JADX INFO: renamed from: o._findCustomTreeNodeDeserializer$RemoteActionCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0007\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Lo/_findCustomTreeNodeDeserializer$RemoteActionCompatParcelizer;", "", "<init>", "()V", "Lo/_findCustomTreeNodeDeserializer;", "AudioAttributesCompatParcelizer", "Lo/_findCustomTreeNodeDeserializer;", "read", "()Lo/_findCustomTreeNodeDeserializer;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final _findCustomTreeNodeDeserializer read() {
            return _findCustomTreeNodeDeserializer.AudioAttributesCompatParcelizer;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final boolean getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final int getRead() {
        return this.read;
    }

    public _findCustomTreeNodeDeserializer(boolean z) {
        this.RemoteActionCompatParcelizer = z;
        this.read = _deserializeIfNatural.INSTANCE.write();
    }

    private _findCustomTreeNodeDeserializer(int i, boolean z) {
        this.RemoteActionCompatParcelizer = z;
        this.read = i;
    }

    public _findCustomTreeNodeDeserializer() {
        this(_deserializeIfNatural.INSTANCE.write(), false, null);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof _findCustomTreeNodeDeserializer)) {
            return false;
        }
        _findCustomTreeNodeDeserializer _findcustomtreenodedeserializer = (_findCustomTreeNodeDeserializer) p0;
        return this.RemoteActionCompatParcelizer == _findcustomtreenodedeserializer.RemoteActionCompatParcelizer && _deserializeIfNatural.read(this.read, _findcustomtreenodedeserializer.read);
    }

    public final int hashCode() {
        return (Boolean.hashCode(this.RemoteActionCompatParcelizer) * 31) + _deserializeIfNatural.write(this.read);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlatformParagraphStyle(includeFontPadding=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", emojiSupportMatch=");
        sb.append((Object) _deserializeIfNatural.read(this.read));
        sb.append(')');
        return sb.toString();
    }

    public /* synthetic */ _findCustomTreeNodeDeserializer(int i, boolean z, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(i, z);
    }
}
