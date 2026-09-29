package kotlin;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00028\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\u0004R \u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\r0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000eR\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0011"}, d2 = {"Lo/_isScalarType;", "T", "", "<init>", "()V", "p0", "", "IconCompatParcelizer", "(Ljava/lang/Object;)V", "AudioAttributesCompatParcelizer", "()Ljava/lang/Object;", "write", "Lo/UTF32Reader;", "Ljava/lang/ref/Reference;", "Lo/UTF32Reader;", "read", "Ljava/lang/ref/ReferenceQueue;", "Ljava/lang/ref/ReferenceQueue;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class _isScalarType<T> {

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final UTF32Reader<Reference<T>> read = new UTF32Reader<>(new Reference[16], 0);

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final ReferenceQueue<T> AudioAttributesCompatParcelizer = new ReferenceQueue<>();

    public final void IconCompatParcelizer(T p0) {
        write();
        this.read.read(new WeakReference(p0, this.AudioAttributesCompatParcelizer));
    }

    public final T AudioAttributesCompatParcelizer() {
        write();
        while (this.read.getAudioAttributesCompatParcelizer() != 0) {
            T t = this.read.RemoteActionCompatParcelizer(r0.getAudioAttributesCompatParcelizer() - 1).get();
            if (t != null) {
                return t;
            }
        }
        return null;
    }

    private final void write() {
        Reference<? extends T> referencePoll;
        do {
            referencePoll = this.AudioAttributesCompatParcelizer.poll();
            if (referencePoll != null) {
                this.read.IconCompatParcelizer(referencePoll);
            }
        } while (referencePoll != null);
    }
}
