package kotlin;

import kotlin.Metadata;
import kotlin.ScrollingTabContainerView;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004B/\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\b\u0010\tR&\u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00058\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR&\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00000\u00058\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\u000f\u0010\f"}, d2 = {"Lo/evictAll;", "T", "Lo/ScrollingTabContainerView;", "V", "Lo/evictionCount;", "Lkotlin/Function1;", "p0", "p1", "<init>", "(Lo/getAnswerMap;Lo/getAnswerMap;)V", "RemoteActionCompatParcelizer", "Lo/getAnswerMap;", "()Lo/getAnswerMap;", "AudioAttributesCompatParcelizer", "write", "read"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class evictAll<T, V extends ScrollingTabContainerView> implements evictionCount<T, V> {

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final getAnswerMap<T, V> AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final getAnswerMap<V, T> read;

    /* JADX WARN: Multi-variable type inference failed */
    public evictAll(getAnswerMap<? super T, ? extends V> getanswermap, getAnswerMap<? super V, ? extends T> getanswermap2) {
        this.AudioAttributesCompatParcelizer = getanswermap;
        this.read = getanswermap2;
    }

    @Override // kotlin.evictionCount
    public final getAnswerMap<T, V> RemoteActionCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    @Override // kotlin.evictionCount
    public final getAnswerMap<V, T> read() {
        return this.read;
    }
}
