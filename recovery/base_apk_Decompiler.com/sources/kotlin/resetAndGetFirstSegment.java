package kotlin;

import android.graphics.Path;
import android.graphics.PathMeasure;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J/\u0010\f\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0003\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00068WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014"}, d2 = {"Lo/resetAndGetFirstSegment;", "Lo/setCurrentAndReturn;", "Landroid/graphics/PathMeasure;", "p0", "<init>", "(Landroid/graphics/PathMeasure;)V", "", "p1", "Lo/removeSoftRefsClearedByGc;", "p2", "", "p3", "read", "(FFLo/removeSoftRefsClearedByGc;Z)Z", "", "AudioAttributesCompatParcelizer", "(Lo/removeSoftRefsClearedByGc;Z)V", "IconCompatParcelizer", "Landroid/graphics/PathMeasure;", "RemoteActionCompatParcelizer", "()F", "write"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class resetAndGetFirstSegment implements setCurrentAndReturn {
    private final PathMeasure IconCompatParcelizer;

    public resetAndGetFirstSegment(PathMeasure pathMeasure) {
        this.IconCompatParcelizer = pathMeasure;
    }

    @Override // kotlin.setCurrentAndReturn
    public final float RemoteActionCompatParcelizer() {
        return this.IconCompatParcelizer.getLength();
    }

    @Override // kotlin.setCurrentAndReturn
    public final boolean read(float p0, float p1, removeSoftRefsClearedByGc p2, boolean p3) {
        PathMeasure pathMeasure = this.IconCompatParcelizer;
        if (p2 instanceof getCurrentSegment) {
            return pathMeasure.getSegment(p0, p1, ((getCurrentSegment) p2).getRemoteActionCompatParcelizer(), p3);
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    @Override // kotlin.setCurrentAndReturn
    public final void AudioAttributesCompatParcelizer(removeSoftRefsClearedByGc p0, boolean p1) {
        Path remoteActionCompatParcelizer;
        PathMeasure pathMeasure = this.IconCompatParcelizer;
        if (p0 == null) {
            remoteActionCompatParcelizer = null;
        } else if (p0 instanceof getCurrentSegment) {
            remoteActionCompatParcelizer = ((getCurrentSegment) p0).getRemoteActionCompatParcelizer();
        } else {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        pathMeasure.setPath(remoteActionCompatParcelizer, p1);
    }
}
