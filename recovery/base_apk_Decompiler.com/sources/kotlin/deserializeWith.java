package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\u0003\u001a\u0004\u0018\u00010\nH\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0013\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012"}, d2 = {"Lo/deserializeWith;", "Lo/addUnresolvedId;", "", "p0", "<init>", "(C)V", "Lo/AbstractDeserializer;", "Lo/withDelegate;", "AudioAttributesCompatParcelizer", "(Lo/AbstractDeserializer;)Lo/withDelegate;", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "RemoteActionCompatParcelizer", "C", "read"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class deserializeWith implements addUnresolvedId {

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final char read;

    public deserializeWith(char c) {
        this.read = c;
    }

    public /* synthetic */ deserializeWith(char c, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i & 1) != 0 ? (char) 8226 : c);
    }

    @Override // kotlin.addUnresolvedId
    public final withDelegate AudioAttributesCompatParcelizer(AbstractDeserializer p0) {
        return new withDelegate(new AbstractDeserializer(TestGroupLSModel.read((CharSequence) String.valueOf(this.read), p0.getIconCompatParcelizer().length()), null, 2, null), SettableBeanProperty.INSTANCE.RemoteActionCompatParcelizer());
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        return (p0 instanceof deserializeWith) && this.read == ((deserializeWith) p0).read;
    }

    public final int hashCode() {
        return Character.hashCode(this.read);
    }

    public deserializeWith() {
        this((char) 0, 1, null);
    }
}
