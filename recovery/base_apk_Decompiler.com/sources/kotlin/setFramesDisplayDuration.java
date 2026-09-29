package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0002\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\r\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0011\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\t\u0010\u0010R\u001a\u0010\t\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\n\u001a\u0004\b\r\u0010\f"}, d2 = {"Lo/setFramesDisplayDuration;", "", "Lo/removeSoftRefsClearedByGc;", "p0", "Lo/setCurrentAndReturn;", "p1", "p2", "<init>", "(Lo/removeSoftRefsClearedByGc;Lo/setCurrentAndReturn;Lo/removeSoftRefsClearedByGc;)V", "IconCompatParcelizer", "Lo/removeSoftRefsClearedByGc;", "read", "()Lo/removeSoftRefsClearedByGc;", "RemoteActionCompatParcelizer", "AudioAttributesCompatParcelizer", "Lo/setCurrentAndReturn;", "()Lo/setCurrentAndReturn;", "write"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class setFramesDisplayDuration {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final setCurrentAndReturn write;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final removeSoftRefsClearedByGc RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final removeSoftRefsClearedByGc IconCompatParcelizer;

    public setFramesDisplayDuration(removeSoftRefsClearedByGc removesoftrefsclearedbygc, setCurrentAndReturn setcurrentandreturn, removeSoftRefsClearedByGc removesoftrefsclearedbygc2) {
        this.RemoteActionCompatParcelizer = removesoftrefsclearedbygc;
        this.write = setcurrentandreturn;
        this.IconCompatParcelizer = removesoftrefsclearedbygc2;
    }

    public /* synthetic */ setFramesDisplayDuration(removeSoftRefsClearedByGc removesoftrefsclearedbygc, setCurrentAndReturn setcurrentandreturn, removeSoftRefsClearedByGc removesoftrefsclearedbygc2, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i & 1) != 0 ? writeIndentation.write() : removesoftrefsclearedbygc, (i & 2) != 0 ? setCurrentSegmentLength.read() : setcurrentandreturn, (i & 4) != 0 ? writeIndentation.write() : removesoftrefsclearedbygc2);
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final removeSoftRefsClearedByGc getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final setCurrentAndReturn getWrite() {
        return this.write;
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final removeSoftRefsClearedByGc getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public setFramesDisplayDuration() {
        this(null, null, null, 7, null);
    }
}
