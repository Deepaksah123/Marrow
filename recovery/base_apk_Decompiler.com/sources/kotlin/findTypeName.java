package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J/\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H&¢\u0006\u0004\b\b\u0010\tJA\u0010\f\u001a\u00020\u00072\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\f\u0010\rJ!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u000e2\b\b\u0002\u0010\u0004\u001a\u00020\nH&¢\u0006\u0004\b\b\u0010\u000fJ#\u0010\u0010\u001a\u00020\u00072\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002H&¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0012H&¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0012H&¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0017H&¢\u0006\u0004\b\u0015\u0010\u0018R\u0014\u0010\u0013\u001a\u00020\u00198'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u001aø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0003"}, d2 = {"Lo/findTypeName;", "", "", "p0", "p1", "p2", "p3", "", "write", "(FFFF)V", "Lo/ReadConstrainedTextBuffer;", "p4", "AudioAttributesCompatParcelizer", "(FFFFI)V", "Lo/removeSoftRefsClearedByGc;", "(Lo/removeSoftRefsClearedByGc;I)V", "RemoteActionCompatParcelizer", "(FF)V", "Lo/getReferencedType;", "IconCompatParcelizer", "(FJ)V", "read", "(FFJ)V", "Lo/resetWithShared;", "([F)V", "Lo/calloc;", "()J"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface findTypeName {
    void AudioAttributesCompatParcelizer(float p0, float p1, float p2, float p3, int p4);

    void IconCompatParcelizer(float p0, long p1);

    long RemoteActionCompatParcelizer();

    void RemoteActionCompatParcelizer(float p0, float p1);

    void read(float p0, float p1, long p2);

    void read(float[] p0);

    void write(float p0, float p1, float p2, float p3);

    void write(removeSoftRefsClearedByGc p0, int p1);

    static /* synthetic */ void AudioAttributesCompatParcelizer$default(findTypeName findtypename, float f, float f2, float f3, float f4, int i, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clipRect-N_I0leg");
        }
        if ((i2 & 1) != 0) {
            f = 0.0f;
        }
        if ((i2 & 2) != 0) {
            f2 = 0.0f;
        }
        if ((i2 & 4) != 0) {
            f3 = Float.intBitsToFloat((int) (findtypename.RemoteActionCompatParcelizer() >> 32));
        }
        if ((i2 & 8) != 0) {
            f4 = Float.intBitsToFloat((int) findtypename.RemoteActionCompatParcelizer());
        }
        if ((i2 & 16) != 0) {
            i = ReadConstrainedTextBuffer.INSTANCE.IconCompatParcelizer();
        }
        findtypename.AudioAttributesCompatParcelizer(f, f2, f3, f4, i);
    }

    static /* synthetic */ void write$default(findTypeName findtypename, removeSoftRefsClearedByGc removesoftrefsclearedbygc, int i, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clipPath-mtrdD-E");
        }
        if ((i2 & 2) != 0) {
            i = ReadConstrainedTextBuffer.INSTANCE.IconCompatParcelizer();
        }
        findtypename.write(removesoftrefsclearedbygc, i);
    }

    static /* synthetic */ void RemoteActionCompatParcelizer$default(findTypeName findtypename, float f, float f2, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: translate");
        }
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        findtypename.RemoteActionCompatParcelizer(f, f2);
    }
}
