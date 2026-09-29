package kotlin;

import java.util.ArrayList;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0007\u0010\u0005J\u000f\u0010\b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\tJ\u000f\u0010\n\u001a\u00020\u0006H$¢\u0006\u0004\b\n\u0010\tR\u001a\u0010\u0007\u001a\u00028\u00008\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\rR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R*\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u0003\u001a\u00028\u00008\u0017@UX\u0097\u000e¢\u0006\u0012\n\u0004\b\b\u0010\f\u001a\u0004\b\u000f\u0010\r\"\u0004\b\n\u0010\u0005"}, d2 = {"Lo/_checkRangeBoundsForCharArray;", "T", "Lo/_closeInput;", "p0", "<init>", "(Ljava/lang/Object;)V", "", "AudioAttributesCompatParcelizer", "IconCompatParcelizer", "()V", "read", "RemoteActionCompatParcelizer", "Ljava/lang/Object;", "()Ljava/lang/Object;", "Lo/parseLong;", "write", "Ljava/util/ArrayList;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class _checkRangeBoundsForCharArray<T> implements _closeInput<T> {
    public static final int read = 8;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private T write;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final T AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final ArrayList<T> RemoteActionCompatParcelizer = parseLong.IconCompatParcelizer(null, 1, null);

    protected abstract void read();

    public _checkRangeBoundsForCharArray(T t) {
        this.AudioAttributesCompatParcelizer = t;
        this.write = t;
    }

    public final T RemoteActionCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    @Override // kotlin._closeInput
    public T write() {
        return this.write;
    }

    protected void read(T t) {
        this.write = t;
    }

    @Override // kotlin._closeInput
    public void AudioAttributesCompatParcelizer(T p0) {
        parseLong.write(this.RemoteActionCompatParcelizer, write());
        read(p0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin._closeInput
    public void IconCompatParcelizer() {
        read(parseLong.AudioAttributesImplBaseParcelizer(this.RemoteActionCompatParcelizer));
    }

    @Override // kotlin._closeInput
    public final void AudioAttributesCompatParcelizer() {
        parseLong.read(this.RemoteActionCompatParcelizer);
        read(this.AudioAttributesCompatParcelizer);
        read();
    }
}
