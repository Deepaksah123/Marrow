package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u0004\u001a\u0004\u0018\u00010\u000fH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014"}, d2 = {"Lo/setSavedStateRegistryOwner;", "Lo/writerFor;", "Lo/getResetBlock;", "Lo/hashCode;", "p0", "<init>", "(Lo/hashCode;)V", "read", "()Lo/getResetBlock;", "", "IconCompatParcelizer", "(Lo/getResetBlock;)V", "", "hashCode", "()I", "", "", "equals", "(Ljava/lang/Object;)Z", "write", "Lo/hashCode;", "AudioAttributesCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class setSavedStateRegistryOwner extends writerFor<getResetBlock> {

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final hashCode AudioAttributesCompatParcelizer;

    public setSavedStateRegistryOwner(hashCode hashcode) {
        this.AudioAttributesCompatParcelizer = hashcode;
    }

    @Override // kotlin.writerFor
    /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
    public final getResetBlock IconCompatParcelizer() {
        return new getResetBlock(this.AudioAttributesCompatParcelizer);
    }

    @Override // kotlin.writerFor
    public final void IconCompatParcelizer(getResetBlock p0) {
        p0.IconCompatParcelizer(this.AudioAttributesCompatParcelizer);
    }

    public final int hashCode() {
        return this.AudioAttributesCompatParcelizer.hashCode() * 31;
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        return (p0 instanceof setSavedStateRegistryOwner) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(((setSavedStateRegistryOwner) p0).AudioAttributesCompatParcelizer, this.AudioAttributesCompatParcelizer);
    }
}
