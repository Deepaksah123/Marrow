package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B-\u0012$\b\u0002\u0010\u0003\u001a\u001e\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\u0006¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\u000b\u001a\u001e\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\u0006HÆ\u0003J5\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002$\b\u0002\u0010\u0003\u001a\u001e\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\u0006HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R-\u0010\u0003\u001a\u001e\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lorg/koin/core/definition/Callbacks;", "T", "", "onClose", "Lkotlin/Function1;", "", "Lorg/koin/core/definition/OnCloseCallback;", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "getOnClose", "()Lkotlin/jvm/functions/Function1;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "koin-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class McqService<T> {
    private final getAnswerMap<T, getShowPopup> RemoteActionCompatParcelizer;

    /* JADX WARN: Multi-variable type inference failed */
    private McqService(getAnswerMap<? super T, getShowPopup> getanswermap) {
        this.RemoteActionCompatParcelizer = getanswermap;
    }

    public /* synthetic */ McqService(getAnswerMap getanswermap, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i & 1) != 0 ? null : getanswermap);
    }

    public final getAnswerMap<T, getShowPopup> read() {
        return this.RemoteActionCompatParcelizer;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public McqService() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof McqService) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, ((McqService) other).RemoteActionCompatParcelizer);
    }

    public final int hashCode() {
        getAnswerMap<T, getShowPopup> getanswermap = this.RemoteActionCompatParcelizer;
        if (getanswermap == null) {
            return 0;
        }
        return getanswermap.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Callbacks(onClose=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(')');
        return sb.toString();
    }
}
