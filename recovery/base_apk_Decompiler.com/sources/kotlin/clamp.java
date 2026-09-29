package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002BI\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012*\u0010\u000b\u001a&\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0016\u0012\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n\u0012\u0004\u0012\u00028\u00000\t0\u0006\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0013\u001a\u00020\u00122\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0005\u001a\u0004\u0018\u00010\u0015H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR8\u0010\u001c\u001a&\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0016\u0012\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n\u0012\u0004\u0012\u00028\u00000\t0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0010\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010 "}, d2 = {"Lo/clamp;", "T", "Lo/writerFor;", "Lo/build;", "Lo/Glide;", "p0", "Lkotlin/Function2;", "Lo/getKey;", "Lo/PropertyValueAny;", "Lo/getSubscriptionExpiresOn;", "Lo/copyFrom;", "p1", "Lo/superDispatchKeyEvent;", "p2", "<init>", "(Lo/Glide;Lo/MagicModuleSubmissionRequestBody;Lo/superDispatchKeyEvent;)V", "write", "()Lo/build;", "", "RemoteActionCompatParcelizer", "(Lo/build;)V", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "read", "Lo/Glide;", "IconCompatParcelizer", "Lo/MagicModuleSubmissionRequestBody;", "Lo/superDispatchKeyEvent;"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class clamp<T> extends writerFor<build<T>> {

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final MagicModuleSubmissionRequestBody<getKey, PropertyValueAny, Pair<copyFrom<T>, T>> read;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final Glide<T> RemoteActionCompatParcelizer;
    private final superDispatchKeyEvent write;

    /* JADX WARN: Multi-variable type inference failed */
    public clamp(Glide<T> glide, MagicModuleSubmissionRequestBody<? super getKey, ? super PropertyValueAny, ? extends Pair<? extends copyFrom<T>, ? extends T>> magicModuleSubmissionRequestBody, superDispatchKeyEvent superdispatchkeyevent) {
        this.RemoteActionCompatParcelizer = glide;
        this.read = magicModuleSubmissionRequestBody;
        this.write = superdispatchkeyevent;
    }

    @Override // kotlin.writerFor
    /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
    public final build<T> IconCompatParcelizer() {
        return new build<>(this.RemoteActionCompatParcelizer, this.read, this.write);
    }

    @Override // kotlin.writerFor
    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public final void IconCompatParcelizer(build<T> p0) {
        p0.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer);
        p0.IconCompatParcelizer(this.read);
        p0.RemoteActionCompatParcelizer(this.write);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof clamp)) {
            return false;
        }
        clamp clampVar = (clamp) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, clampVar.RemoteActionCompatParcelizer) && this.read == clampVar.read && this.write == clampVar.write;
    }

    public final int hashCode() {
        return (((this.RemoteActionCompatParcelizer.hashCode() * 31) + this.read.hashCode()) * 31) + this.write.hashCode();
    }
}
