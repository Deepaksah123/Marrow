package kotlin;

import kotlin.Metadata;
import kotlin.ScrollingTabContainerView;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u00022\u00020\u0004B#\u0012\u0006\u0010\u0005\u001a\u00028\u0000\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001c\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006H\u0086\u0002¢\u0006\u0004\b\f\u0010\rR\u0011\u0010\u0010\u001a\u00028\u00008\u0006¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR#\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00068\u0007¢\u0006\f\n\u0004\b\f\u0010\u0011\u001a\u0004\b\u0012\u0010\r"}, d2 = {"Lo/sendAccessibilityEventUnchecked;", "T", "Lo/ScrollingTabContainerView;", "V", "", "p0", "Lo/setShowDividers;", "p1", "<init>", "(Ljava/lang/Object;Lo/setShowDividers;)V", "write", "()Ljava/lang/Object;", "RemoteActionCompatParcelizer", "()Lo/setShowDividers;", "IconCompatParcelizer", "Ljava/lang/Object;", "AudioAttributesCompatParcelizer", "Lo/setShowDividers;", "read"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class sendAccessibilityEventUnchecked<T, V extends ScrollingTabContainerView> {

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final T AudioAttributesCompatParcelizer;
    private final setShowDividers<T, V> RemoteActionCompatParcelizer;

    public sendAccessibilityEventUnchecked(T t, setShowDividers<T, V> setshowdividers) {
        this.AudioAttributesCompatParcelizer = t;
        this.RemoteActionCompatParcelizer = setshowdividers;
    }

    public final setShowDividers<T, V> read() {
        return this.RemoteActionCompatParcelizer;
    }

    public final T write() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final setShowDividers<T, V> RemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }
}
