package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B3\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\u00062\b\u0010\u0004\u001a\u0004\u0018\u00010\u0011H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0011\u0010\u000e\u001a\u00020\u00038\u0006¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0011\u0010\u001c\u001a\u00020\u00038\u0006¢\u0006\u0006\n\u0004\b\u001c\u0010\u001bR\u0011\u0010\u001d\u001a\u00020\u00068\u0006¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001d\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b8\u0006¢\u0006\u0006\n\u0004\b\u001f\u0010 "}, d2 = {"Lo/getExitTransitionCallback;", "Lo/writerFor;", "Lo/getHost;", "Lo/assignParameter;", "p0", "p1", "", "p2", "Lkotlin/Function1;", "Lo/as;", "", "p3", "<init>", "(FFZLo/getAnswerMap;Lo/MagicModuleRepositoryImplExternalSyntheticLambda0;)V", "AudioAttributesCompatParcelizer", "()Lo/getHost;", "(Lo/getHost;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "read", "F", "IconCompatParcelizer", "write", "Z", "RemoteActionCompatParcelizer", "Lo/getAnswerMap;"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class getExitTransitionCallback extends writerFor<getHost> {
    private final float IconCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final getAnswerMap<as, getShowPopup> read;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final float AudioAttributesCompatParcelizer;
    private final boolean write;

    /* JADX WARN: Multi-variable type inference failed */
    private getExitTransitionCallback(float f, float f2, boolean z, getAnswerMap<? super as, getShowPopup> getanswermap) {
        this.AudioAttributesCompatParcelizer = f;
        this.IconCompatParcelizer = f2;
        this.write = z;
        this.read = getanswermap;
    }

    @Override // kotlin.writerFor
    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public final getHost IconCompatParcelizer() {
        return new getHost(this.AudioAttributesCompatParcelizer, this.IconCompatParcelizer, this.write, null);
    }

    @Override // kotlin.writerFor
    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public final void IconCompatParcelizer(getHost p0) {
        p0.write(this.AudioAttributesCompatParcelizer, this.IconCompatParcelizer, this.write);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        getExitTransitionCallback getexittransitioncallback = p0 instanceof getExitTransitionCallback ? (getExitTransitionCallback) p0 : null;
        return getexittransitioncallback != null && assignParameter.IconCompatParcelizer(this.AudioAttributesCompatParcelizer, getexittransitioncallback.AudioAttributesCompatParcelizer) && assignParameter.IconCompatParcelizer(this.IconCompatParcelizer, getexittransitioncallback.IconCompatParcelizer) && this.write == getexittransitioncallback.write;
    }

    public final int hashCode() {
        return (((assignParameter.AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer) * 31) + assignParameter.AudioAttributesCompatParcelizer(this.IconCompatParcelizer)) * 31) + Boolean.hashCode(this.write);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OffsetModifierElement(x=");
        sb.append((Object) assignParameter.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer));
        sb.append(", y=");
        sb.append((Object) assignParameter.RemoteActionCompatParcelizer(this.IconCompatParcelizer));
        sb.append(", rtlAware=");
        sb.append(this.write);
        sb.append(')');
        return sb.toString();
    }

    public /* synthetic */ getExitTransitionCallback(float f, float f2, boolean z, getAnswerMap getanswermap, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(f, f2, z, getanswermap);
    }
}
