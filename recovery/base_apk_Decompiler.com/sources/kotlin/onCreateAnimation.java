package kotlin;

import kotlin.Metadata;
import kotlin._skipWSOrEnd;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u0004\u001a\u0004\u0018\u00010\u000fH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\u00038\u0006¢\u0006\u0006\n\u0004\b\u0007\u0010\u0013"}, d2 = {"Lo/onCreateAnimation;", "Lo/writerFor;", "Lo/onAttachFragment;", "Lo/_skipWSOrEnd$read;", "p0", "<init>", "(Lo/_skipWSOrEnd$read;)V", "write", "()Lo/onAttachFragment;", "", "RemoteActionCompatParcelizer", "(Lo/onAttachFragment;)V", "", "hashCode", "()I", "", "", "equals", "(Ljava/lang/Object;)Z", "Lo/_skipWSOrEnd$read;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class onCreateAnimation extends writerFor<onAttachFragment> {
    private final _skipWSOrEnd.read write;

    public onCreateAnimation(_skipWSOrEnd.read readVar) {
        this.write = readVar;
    }

    @Override // kotlin.writerFor
    /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
    public final onAttachFragment IconCompatParcelizer() {
        return new onAttachFragment(this.write);
    }

    @Override // kotlin.writerFor
    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public final void IconCompatParcelizer(onAttachFragment p0) {
        p0.AudioAttributesCompatParcelizer(this.write);
    }

    public final int hashCode() {
        return this.write.hashCode();
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        onCreateAnimation oncreateanimation = p0 instanceof onCreateAnimation ? (onCreateAnimation) p0 : null;
        if (oncreateanimation == null) {
            return false;
        }
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.write, oncreateanimation.write);
    }
}
