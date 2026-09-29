package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0004\u0010\u0005B\t\b\u0016¢\u0006\u0004\b\u0004\u0010\u0006B\u0013\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0004\u0010\u0007J\u0017\u0010\b\u001a\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\n\u0010\tR\u0019\u0010\r\u001a\u0004\u0018\u00010\u00018\u0007¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u000b\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\n\u001a\u00020\u000f8G¢\u0006\u0006\u001a\u0004\b\b\u0010\u0010R\u0011\u0010\b\u001a\u00020\u000f8G¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0010"}, d2 = {"Lo/hexFloatLiteralToFloat;", "", "p0", "p1", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;)V", "()V", "(Ljava/lang/Object;)V", "write", "(Ljava/lang/Object;)Lo/hexFloatLiteralToFloat;", "RemoteActionCompatParcelizer", "Ljava/lang/Object;", "()Ljava/lang/Object;", "AudioAttributesCompatParcelizer", "IconCompatParcelizer", "", "()Z", "read"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class hexFloatLiteralToFloat {

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final Object AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final Object IconCompatParcelizer;

    public hexFloatLiteralToFloat(Object obj, Object obj2) {
        this.AudioAttributesCompatParcelizer = obj;
        this.IconCompatParcelizer = obj2;
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final Object getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final Object getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public hexFloatLiteralToFloat() {
        computePowerOfTen computepoweroften = computePowerOfTen.INSTANCE;
        this(computepoweroften, computepoweroften);
    }

    public hexFloatLiteralToFloat(Object obj) {
        this(obj, computePowerOfTen.INSTANCE);
    }

    public final hexFloatLiteralToFloat write(Object p0) {
        return new hexFloatLiteralToFloat(this.AudioAttributesCompatParcelizer, p0);
    }

    public final hexFloatLiteralToFloat RemoteActionCompatParcelizer(Object p0) {
        return new hexFloatLiteralToFloat(p0, this.IconCompatParcelizer);
    }

    public final boolean write() {
        return this.IconCompatParcelizer != computePowerOfTen.INSTANCE;
    }

    public final boolean read() {
        return this.AudioAttributesCompatParcelizer != computePowerOfTen.INSTANCE;
    }
}
