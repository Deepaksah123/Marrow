package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B7\u0012\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007R%\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR(\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\t\u001a\u0004\b\b\u0010\u000b"}, d2 = {"Lo/rootDetector;", "", "Lkotlin/Function1;", "", "p0", "p1", "<init>", "(Lo/getAnswerMap;Lo/getAnswerMap;)V", "read", "Lo/getAnswerMap;", "write", "()Lo/getAnswerMap;", "RemoteActionCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class rootDetector {

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final getAnswerMap<Object, getShowPopup> read;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final getAnswerMap<Object, getShowPopup> RemoteActionCompatParcelizer;

    public rootDetector(getAnswerMap<Object, getShowPopup> getanswermap, getAnswerMap<Object, getShowPopup> getanswermap2) {
        this.RemoteActionCompatParcelizer = getanswermap;
        this.read = getanswermap2;
    }

    public /* synthetic */ rootDetector(getAnswerMap getanswermap, getAnswerMap getanswermap2, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i & 1) != 0 ? null : getanswermap, (i & 2) != 0 ? null : getanswermap2);
    }

    public final getAnswerMap<Object, getShowPopup> write() {
        return this.RemoteActionCompatParcelizer;
    }

    public final getAnswerMap<Object, getShowPopup> read() {
        return this.read;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public rootDetector() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
