package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\f\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\b\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u000eH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0018\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0019\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0016\u0010\u0013R\u0011\u0010\u001b\u001a\u00020\b8G¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0015"}, d2 = {"Lo/Deserializers;", "Lo/findBeanDeserializer;", "Lo/AbstractDeserializer;", "p0", "", "p1", "<init>", "(Lo/AbstractDeserializer;I)V", "", "(Ljava/lang/String;I)V", "Lo/findReferenceDeserializer;", "", "read", "(Lo/findReferenceDeserializer;)V", "", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "AudioAttributesCompatParcelizer", "Lo/AbstractDeserializer;", "IconCompatParcelizer", "RemoteActionCompatParcelizer", "I", "write"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Deserializers implements findBeanDeserializer {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final AbstractDeserializer IconCompatParcelizer;
    private final int RemoteActionCompatParcelizer;

    public Deserializers(AbstractDeserializer abstractDeserializer, int i) {
        this.IconCompatParcelizer = abstractDeserializer;
        this.RemoteActionCompatParcelizer = i;
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final int getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Deserializers(String str, int i) {
        this(new AbstractDeserializer(str, null, 2, 0 == true ? 1 : 0), i);
    }

    public final String write() {
        return this.IconCompatParcelizer.getIconCompatParcelizer();
    }

    @Override // kotlin.findBeanDeserializer
    public final void read(findReferenceDeserializer p0) {
        if (p0.AudioAttributesImplApi21Parcelizer()) {
            p0.read(p0.getIconCompatParcelizer(), p0.getWrite(), write());
        } else {
            p0.read(p0.getRemoteActionCompatParcelizer(), p0.getAudioAttributesCompatParcelizer(), write());
        }
        int iRemoteActionCompatParcelizer = p0.RemoteActionCompatParcelizer();
        int i = this.RemoteActionCompatParcelizer;
        p0.write(getQues.write(i > 0 ? (iRemoteActionCompatParcelizer + i) - 1 : (iRemoteActionCompatParcelizer + i) - write().length(), 0, p0.AudioAttributesImplApi26Parcelizer()));
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof Deserializers)) {
            return false;
        }
        Deserializers deserializers = (Deserializers) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) write(), (Object) deserializers.write()) && this.RemoteActionCompatParcelizer == deserializers.RemoteActionCompatParcelizer;
    }

    public final int hashCode() {
        return (write().hashCode() * 31) + this.RemoteActionCompatParcelizer;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CommitTextCommand(text='");
        sb.append(write());
        sb.append("', newCursorPosition=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(')');
        return sb.toString();
    }
}
