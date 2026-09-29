package kotlin;

import java.io.Serializable;
import kotlin.C0177getRfBanners;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b \u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\u00020\u00032\u00020\u0004B\u0019\u0012\u0010\u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\n\u001a\u00020\t2\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\f\u001a\u0004\u0018\u00010\u00022\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\bH$¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\tH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\u00012\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J+\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\u00012\b\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\u0010\u0012\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0016¢\u0006\u0004\b\u0010\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0011\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R!\u0010\u001a\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u00018\u0007¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010 \u001a\u0004\u0018\u00010\u00038WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f"}, d2 = {"Lo/getMonthName;", "Lo/SampleVideos;", "", "Lo/getNextQuery;", "Ljava/io/Serializable;", "p0", "<init>", "(Lo/SampleVideos;)V", "Lo/getRfBanners;", "", "resumeWith", "(Ljava/lang/Object;)V", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "releaseIntercepted", "()V", "create", "(Lo/SampleVideos;)Lo/SampleVideos;", "p1", "(Ljava/lang/Object;Lo/SampleVideos;)Lo/SampleVideos;", "", "toString", "()Ljava/lang/String;", "Ljava/lang/StackTraceElement;", "getStackTraceElement", "()Ljava/lang/StackTraceElement;", "completion", "Lo/SampleVideos;", "getCompletion", "()Lo/SampleVideos;", "getCallerFrame", "()Lo/getNextQuery;", "callerFrame"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class getMonthName implements SampleVideos<Object>, getNextQuery, Serializable {
    private final SampleVideos<Object> completion;

    protected abstract Object invokeSuspend(Object p0);

    protected void releaseIntercepted() {
    }

    public getMonthName(SampleVideos<Object> sampleVideos) {
        this.completion = sampleVideos;
    }

    public final SampleVideos<Object> getCompletion() {
        return this.completion;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [o.SampleVideos] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    @Override // kotlin.SampleVideos
    public final void resumeWith(Object p0) {
        Object objInvokeSuspend;
        ?? r2 = this;
        while (true) {
            getAnsweredMcqCount.IconCompatParcelizer(r2);
            getMonthName getmonthname = (getMonthName) r2;
            SampleVideos<Object> sampleVideos = getmonthname.completion;
            toMagicModuleMetaRepoModel.write(sampleVideos);
            try {
                objInvokeSuspend = getmonthname.invokeSuspend(p0);
            } catch (Throwable th) {
                C0177getRfBanners.IconCompatParcelizer iconCompatParcelizer = C0177getRfBanners.IconCompatParcelizer;
                p0 = C0177getRfBanners.read(SdkPayloadData.write(th));
            }
            if (objInvokeSuspend == getYear.IconCompatParcelizer()) {
                return;
            }
            C0177getRfBanners.IconCompatParcelizer iconCompatParcelizer2 = C0177getRfBanners.IconCompatParcelizer;
            p0 = C0177getRfBanners.read(objInvokeSuspend);
            getmonthname.releaseIntercepted();
            if (!(sampleVideos instanceof getMonthName)) {
                sampleVideos.resumeWith(p0);
                return;
            }
            r2 = sampleVideos;
        }
    }

    public SampleVideos<getShowPopup> create(SampleVideos<?> p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    public SampleVideos<getShowPopup> create(Object p0, SampleVideos<?> p1) {
        toMagicModuleMetaRepoModel.write(p1, "");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Continuation at ");
        Object stackTraceElement = getStackTraceElement();
        if (stackTraceElement == null) {
            stackTraceElement = getClass().getName();
        }
        sb.append(stackTraceElement);
        return sb.toString();
    }

    @Override // kotlin.getNextQuery
    public getNextQuery getCallerFrame() {
        SampleVideos<Object> sampleVideos = this.completion;
        if (sampleVideos instanceof getNextQuery) {
            return (getNextQuery) sampleVideos;
        }
        return null;
    }

    @Override // kotlin.getNextQuery
    public StackTraceElement getStackTraceElement() {
        return getTotalModule.RemoteActionCompatParcelizer(this);
    }
}
