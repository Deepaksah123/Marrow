package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\b\u0010\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0003\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ%\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\f\u0010\rR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\n\u0010\u000e\u001a\u0004\b\f\u0010\u000fR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\n\u0010\u0013R\u0014\u0010\f\u001a\u00020\u00148WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0015"}, d2 = {"Lo/Worker;", "", "Lo/isAbstract;", "p0", "Lo/deserializeFromNumber;", "p1", "<init>", "(Lo/isAbstract;Lo/deserializeFromNumber;)V", "", "Lo/removeSoftRefsClearedByGc;", "RemoteActionCompatParcelizer", "(II)Lo/removeSoftRefsClearedByGc;", "IconCompatParcelizer", "(Lo/isAbstract;Lo/deserializeFromNumber;)Lo/Worker;", "Lo/isAbstract;", "()Lo/isAbstract;", "AudioAttributesCompatParcelizer", "write", "Lo/deserializeFromNumber;", "()Lo/deserializeFromNumber;", "", "()Z"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class Worker {

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final isAbstract AudioAttributesCompatParcelizer;
    private final deserializeFromNumber write;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int read = 8;
    private static final Worker AudioAttributesCompatParcelizer = new Worker(null, null);

    public Worker(isAbstract isabstract, deserializeFromNumber deserializefromnumber) {
        this.AudioAttributesCompatParcelizer = isabstract;
        this.write = deserializefromnumber;
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final isAbstract getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final deserializeFromNumber getWrite() {
        return this.write;
    }

    /* JADX INFO: renamed from: o.Worker$IconCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0007\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Lo/Worker$IconCompatParcelizer;", "", "<init>", "()V", "Lo/Worker;", "AudioAttributesCompatParcelizer", "Lo/Worker;", "RemoteActionCompatParcelizer", "()Lo/Worker;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final Worker RemoteActionCompatParcelizer() {
            return Worker.AudioAttributesCompatParcelizer;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    public removeSoftRefsClearedByGc RemoteActionCompatParcelizer(int p0, int p1) {
        deserializeFromNumber deserializefromnumber = this.write;
        if (deserializefromnumber != null) {
            return deserializefromnumber.RemoteActionCompatParcelizer(p0, p1);
        }
        return null;
    }

    public boolean write() {
        deserializeFromNumber deserializefromnumber = this.write;
        return (deserializefromnumber == null || paramName.write(deserializefromnumber.getIconCompatParcelizer().getMediaBrowserCompatCustomActionResultReceiver(), paramName.INSTANCE.IconCompatParcelizer()) || !deserializefromnumber.RemoteActionCompatParcelizer()) ? false : true;
    }

    public static /* synthetic */ Worker IconCompatParcelizer$default(Worker worker, isAbstract isabstract, deserializeFromNumber deserializefromnumber, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: copy");
        }
        if ((i & 1) != 0) {
            isabstract = worker.AudioAttributesCompatParcelizer;
        }
        if ((i & 2) != 0) {
            deserializefromnumber = worker.write;
        }
        return worker.IconCompatParcelizer(isabstract, deserializefromnumber);
    }

    public final Worker IconCompatParcelizer(isAbstract p0, deserializeFromNumber p1) {
        return new Worker(p0, p1);
    }
}
