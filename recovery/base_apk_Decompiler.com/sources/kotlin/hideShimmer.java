package kotlin;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004R$\u0010\n\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0007\"\u0004\b\b\u0010\tR(\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\f0\u000b8\u0007@\u0006X\u0087\f¢\u0006\f\n\u0004\b\n\u0010\r\u001a\u0004\b\u000e\u0010\u000fR$\u0010\b\u001a\u0004\u0018\u00010\u00108\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u0011\u001a\u0004\b\b\u0010\u0012\"\u0004\b\u000e\u0010\u0013"}, d2 = {"Lo/hideShimmer;", "T", "", "<init>", "()V", "RemoteActionCompatParcelizer", "Ljava/lang/Object;", "()Ljava/lang/Object;", "IconCompatParcelizer", "(Ljava/lang/Object;)V", "write", "", "Lo/ShimmerFrameLayout;", "Ljava/util/List;", "AudioAttributesCompatParcelizer", "()Ljava/util/List;", "Lo/escapesFor;", "Lo/escapesFor;", "()Lo/escapesFor;", "(Lo/escapesFor;)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class hideShimmer<T> {
    private escapesFor IconCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private Object write = new Object();

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private List<ShimmerFrameLayout<T>> AudioAttributesCompatParcelizer = new ArrayList();

    public final void IconCompatParcelizer(Object obj) {
        this.write = obj;
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final Object getWrite() {
        return this.write;
    }

    public final List<ShimmerFrameLayout<T>> AudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final void AudioAttributesCompatParcelizer(escapesFor escapesfor) {
        this.IconCompatParcelizer = escapesfor;
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final escapesFor getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }
}
