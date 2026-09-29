package androidx.graphics.path;

import android.graphics.Path;
import kotlin.Metadata;
import kotlin._removeNonVisible;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001J(\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0082 ¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\bH\u0082 ¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\bH\u0083 ¢\u0006\u0004\b\u0011\u0010\u0012J(\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00132\u0006\u0010\u0007\u001a\u00020\u0004H\u0083 ¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\bH\u0083 ¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\bH\u0083 ¢\u0006\u0004\b\u0018\u0010\u0017J\u0018\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\bH\u0083 ¢\u0006\u0004\b\u0019\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b"}, d2 = {"Landroidx/graphics/path/PathIteratorPreApi34Impl;", "Lo/_removeNonVisible;", "Landroid/graphics/Path;", "p0", "", "p1", "", "p2", "", "createInternalPathIterator", "(Landroid/graphics/Path;IF)J", "", "destroyInternalPathIterator", "(J)V", "finalize", "()V", "", "internalPathIteratorHasNext", "(J)Z", "", "internalPathIteratorNext", "(J[FI)I", "internalPathIteratorPeek", "(J)I", "internalPathIteratorRawSize", "internalPathIteratorSize", "AudioAttributesCompatParcelizer", "J", "RemoteActionCompatParcelizer"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PathIteratorPreApi34Impl extends _removeNonVisible {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final long RemoteActionCompatParcelizer;

    private final native long createInternalPathIterator(Path p0, int p1, float p2);

    private final native void destroyInternalPathIterator(long p0);

    private final native boolean internalPathIteratorHasNext(long p0);

    private final native int internalPathIteratorNext(long p0, float[] p1, int p2);

    private final native int internalPathIteratorPeek(long p0);

    private final native int internalPathIteratorRawSize(long p0);

    private final native int internalPathIteratorSize(long p0);

    protected final void finalize() {
        destroyInternalPathIterator(this.RemoteActionCompatParcelizer);
    }
}
