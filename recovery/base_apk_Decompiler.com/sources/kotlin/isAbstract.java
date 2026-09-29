package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0006\u0010\u0005J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0007\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\b\u0010\u0005J\u0017\u0010\t\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\t\u0010\u0005J\u001f\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0002H&¢\u0006\u0004\b\u0006\u0010\u000bJ+\u0010\t\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\fH&¢\u0006\u0004\b\t\u0010\u000eJ!\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\fH&¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\b\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0012H&¢\u0006\u0004\b\b\u0010\u0014J\u0017\u0010\u0004\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u0012H&¢\u0006\u0004\b\u0004\u0010\u0015R\u0014\u0010\t\u001a\u00020\u00168'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0017R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00008'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0018R\u0014\u0010\u0006\u001a\u00020\f8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0003"}, d2 = {"Lo/isAbstract;", "", "Lo/getReferencedType;", "p0", "AudioAttributesCompatParcelizer", "(J)J", "RemoteActionCompatParcelizer", "AudioAttributesImplBaseParcelizer", "read", "IconCompatParcelizer", "p1", "(Lo/isAbstract;J)J", "", "p2", "(Lo/isAbstract;JZ)J", "Lo/WritableTypeIdInclusion;", "write", "(Lo/isAbstract;Z)Lo/WritableTypeIdInclusion;", "Lo/resetWithShared;", "", "(Lo/isAbstract;[F)V", "([F)V", "Lo/getKey;", "()J", "()Lo/isAbstract;", "MediaBrowserCompatItemReceiver", "()Z"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface isAbstract {
    long AudioAttributesImplBaseParcelizer(long p0);

    long IconCompatParcelizer(long p0);

    boolean MediaBrowserCompatItemReceiver();

    long RemoteActionCompatParcelizer(isAbstract p0, long p1);

    isAbstract RemoteActionCompatParcelizer();

    long read(long p0);

    long write();

    WritableTypeIdInclusion write(isAbstract p0, boolean p1);

    default long AudioAttributesCompatParcelizer(long p0) {
        return getReferencedType.INSTANCE.read();
    }

    default long RemoteActionCompatParcelizer(long p0) {
        return getReferencedType.INSTANCE.read();
    }

    static /* synthetic */ long IconCompatParcelizer$default(isAbstract isabstract, isAbstract isabstract2, long j, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: localPositionOf-S_NoaFU");
        }
        if ((i & 2) != 0) {
            j = getReferencedType.INSTANCE.write();
        }
        if ((i & 4) != 0) {
            z = true;
        }
        return isabstract.IconCompatParcelizer(isabstract2, j, z);
    }

    default long IconCompatParcelizer(isAbstract p0, long p1, boolean p2) {
        throw new UnsupportedOperationException("localPositionOf is not implemented on this LayoutCoordinates");
    }

    static /* synthetic */ WritableTypeIdInclusion write$default(isAbstract isabstract, isAbstract isabstract2, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: localBoundingBoxOf");
        }
        if ((i & 2) != 0) {
            z = true;
        }
        return isabstract.write(isabstract2, z);
    }

    default void read(isAbstract p0, float[] p1) {
        reportWrongTokenException.RemoteActionCompatParcelizer("transformFrom is not implemented on this LayoutCoordinates");
    }

    default void AudioAttributesCompatParcelizer(float[] p0) {
        throw new UnsupportedOperationException("transformToScreen is not implemented on this LayoutCoordinates");
    }
}
