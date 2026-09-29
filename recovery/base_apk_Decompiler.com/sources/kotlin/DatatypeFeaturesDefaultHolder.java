package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B#\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u000fH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0011\u0010\f\u001a\u00020\u00048\u0006¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00068\u0006¢\u0006\u0006\n\u0004\b\f\u0010\u0017R\u0014\u0010\u0015\u001a\u00020\u00198WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u001a"}, d2 = {"Lo/DatatypeFeaturesDefaultHolder;", "Lo/writerFor;", "Lo/DeserializerFactoryConfig;", "Lo/HandlerInstantiator;", "", "p0", "Lkotlin/Function1;", "Lo/getConfigOverride;", "", "p1", "<init>", "(ZLo/getAnswerMap;)V", "RemoteActionCompatParcelizer", "()Lo/DeserializerFactoryConfig;", "(Lo/DeserializerFactoryConfig;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "write", "Z", "Lo/getAnswerMap;", "IconCompatParcelizer", "Lo/valueInstantiators;", "()Lo/valueInstantiators;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DatatypeFeaturesDefaultHolder extends writerFor<DeserializerFactoryConfig> implements HandlerInstantiator {

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final getAnswerMap<getConfigOverride, getShowPopup> IconCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final boolean RemoteActionCompatParcelizer;

    /* JADX WARN: Multi-variable type inference failed */
    public DatatypeFeaturesDefaultHolder(boolean z, getAnswerMap<? super getConfigOverride, getShowPopup> getanswermap) {
        this.RemoteActionCompatParcelizer = z;
        this.IconCompatParcelizer = getanswermap;
    }

    @Override // kotlin.HandlerInstantiator
    public final C0216valueInstantiators write() {
        C0216valueInstantiators c0216valueInstantiators = new C0216valueInstantiators();
        c0216valueInstantiators.read(this.RemoteActionCompatParcelizer);
        this.IconCompatParcelizer.invoke(c0216valueInstantiators);
        return c0216valueInstantiators;
    }

    @Override // kotlin.writerFor
    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public final DeserializerFactoryConfig IconCompatParcelizer() {
        return new DeserializerFactoryConfig(this.RemoteActionCompatParcelizer, false, this.IconCompatParcelizer);
    }

    @Override // kotlin.writerFor
    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public final void IconCompatParcelizer(DeserializerFactoryConfig p0) {
        p0.AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer);
        p0.write(this.IconCompatParcelizer);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof DatatypeFeaturesDefaultHolder)) {
            return false;
        }
        DatatypeFeaturesDefaultHolder datatypeFeaturesDefaultHolder = (DatatypeFeaturesDefaultHolder) p0;
        return this.RemoteActionCompatParcelizer == datatypeFeaturesDefaultHolder.RemoteActionCompatParcelizer && this.IconCompatParcelizer == datatypeFeaturesDefaultHolder.IconCompatParcelizer;
    }

    public final int hashCode() {
        return (Boolean.hashCode(this.RemoteActionCompatParcelizer) * 31) + this.IconCompatParcelizer.hashCode();
    }
}
