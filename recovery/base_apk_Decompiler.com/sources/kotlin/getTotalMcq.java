package kotlin;

import in.juspay.hyper.constants.LogCategory;
import kotlin.CurrentQuery;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\b\b \u0018\u00002\u00020\u0001B#\u0012\u0010\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB\u001b\b\u0016\u0012\u0010\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\tJ\u0015\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\r\u0010\u000eR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00058WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R \u0010\n\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u00028\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u0014"}, d2 = {"Lo/getTotalMcq;", "Lo/getMonthName;", "Lo/SampleVideos;", "", "p0", "Lo/CurrentQuery;", "p1", "<init>", "(Lo/SampleVideos;Lo/CurrentQuery;)V", "(Lo/SampleVideos;)V", "intercepted", "()Lo/SampleVideos;", "", "releaseIntercepted", "()V", "_context", "Lo/CurrentQuery;", "getContext", "()Lo/CurrentQuery;", LogCategory.CONTEXT, "Lo/SampleVideos;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class getTotalMcq extends getMonthName {
    private final CurrentQuery _context;
    private transient SampleVideos<Object> intercepted;

    public getTotalMcq(SampleVideos<Object> sampleVideos, CurrentQuery currentQuery) {
        super(sampleVideos);
        this._context = currentQuery;
    }

    public getTotalMcq(SampleVideos<Object> sampleVideos) {
        this(sampleVideos, sampleVideos != null ? sampleVideos.getWrite() : null);
    }

    @Override // kotlin.SampleVideos
    /* JADX INFO: renamed from: getContext */
    public CurrentQuery getWrite() {
        CurrentQuery currentQuery = this._context;
        toMagicModuleMetaRepoModel.write(currentQuery);
        return currentQuery;
    }

    public final SampleVideos<Object> intercepted() {
        getTotalMcq gettotalmcqRemoteActionCompatParcelizer = this.intercepted;
        if (gettotalmcqRemoteActionCompatParcelizer == null) {
            getPlaybackInterval getplaybackinterval = (getPlaybackInterval) getWrite().get(getPlaybackInterval.INSTANCE);
            if (getplaybackinterval == null || (gettotalmcqRemoteActionCompatParcelizer = getplaybackinterval.RemoteActionCompatParcelizer(this)) == null) {
                gettotalmcqRemoteActionCompatParcelizer = this;
            }
            this.intercepted = gettotalmcqRemoteActionCompatParcelizer;
        }
        return gettotalmcqRemoteActionCompatParcelizer;
    }

    @Override // kotlin.getMonthName
    public void releaseIntercepted() {
        SampleVideos<?> sampleVideos = this.intercepted;
        if (sampleVideos != null && sampleVideos != this) {
            CurrentQuery.write writeVar = getWrite().get(getPlaybackInterval.INSTANCE);
            toMagicModuleMetaRepoModel.write(writeVar);
            ((getPlaybackInterval) writeVar).AudioAttributesCompatParcelizer(sampleVideos);
        }
        this.intercepted = getPrevQuery.INSTANCE;
    }
}
