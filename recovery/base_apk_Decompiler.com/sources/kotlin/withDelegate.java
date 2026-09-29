package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0013\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018"}, d2 = {"Lo/withDelegate;", "", "Lo/AbstractDeserializer;", "p0", "Lo/SettableBeanProperty;", "p1", "<init>", "(Lo/AbstractDeserializer;Lo/SettableBeanProperty;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "write", "Lo/AbstractDeserializer;", "AudioAttributesCompatParcelizer", "()Lo/AbstractDeserializer;", "read", "Lo/SettableBeanProperty;", "RemoteActionCompatParcelizer", "()Lo/SettableBeanProperty;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class withDelegate {
    private final SettableBeanProperty read;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final AbstractDeserializer AudioAttributesCompatParcelizer;

    public withDelegate(AbstractDeserializer abstractDeserializer, SettableBeanProperty settableBeanProperty) {
        this.AudioAttributesCompatParcelizer = abstractDeserializer;
        this.read = settableBeanProperty;
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final AbstractDeserializer getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final SettableBeanProperty getRead() {
        return this.read;
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof withDelegate)) {
            return false;
        }
        withDelegate withdelegate = (withDelegate) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, withdelegate.AudioAttributesCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.read, withdelegate.read);
    }

    public final int hashCode() {
        return (this.AudioAttributesCompatParcelizer.hashCode() * 31) + this.read.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TransformedText(text=");
        sb.append((Object) this.AudioAttributesCompatParcelizer);
        sb.append(", offsetMapping=");
        sb.append(this.read);
        sb.append(')');
        return sb.toString();
    }
}
