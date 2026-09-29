package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\b\u001a\u00020\u00072\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0010¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0010¢\u0006\u0004\b\n\u0010\u000bR+\u0010\f\u001a\u00028\u00002\u0006\u0010\u0003\u001a\u00028\u00008W@QX\u0097\u008e\u0002¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\b\u0010\u0005R+\u0010\n\u001a\u00028\u00002\u0006\u0010\u0003\u001a\u00028\u00008W@WX\u0097\u008e\u0002¢\u0006\u0012\n\u0004\b\b\u0010\r\u001a\u0004\b\f\u0010\u000f\"\u0004\b\u000e\u0010\u0005"}, d2 = {"Lo/setCollapseIcon;", "S", "Lo/createCount;", "p0", "<init>", "(Ljava/lang/Object;)V", "Lo/setLayoutInflater;", "", "IconCompatParcelizer", "(Lo/setLayoutInflater;)V", "write", "()V", "AudioAttributesCompatParcelizer", "Lo/InputAccessor;", "read", "()Ljava/lang/Object;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class setCollapseIcon<S> extends createCount<S> {
    public static final int write = 0;
    private final InputAccessor AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final InputAccessor write;

    @Override // kotlin.createCount
    public final void IconCompatParcelizer(setLayoutInflater<S> p0) {
    }

    @Override // kotlin.createCount
    public final void write() {
    }

    public setCollapseIcon(S s) {
        super(null);
        this.AudioAttributesCompatParcelizer = available.RemoteActionCompatParcelizer$default(s, null, 2, null);
        this.write = available.RemoteActionCompatParcelizer$default(s, null, 2, null);
    }

    @Override // kotlin.createCount
    public final void IconCompatParcelizer(S s) {
        this.AudioAttributesCompatParcelizer.write(s);
    }

    @Override // kotlin.createCount
    public final S read() {
        return (S) this.AudioAttributesCompatParcelizer.read();
    }

    @Override // kotlin.createCount
    public final S AudioAttributesCompatParcelizer() {
        return (S) this.write.read();
    }

    public final void read(S s) {
        this.write.write(s);
    }
}
