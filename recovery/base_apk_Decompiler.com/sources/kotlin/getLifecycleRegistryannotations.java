package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0010"}, d2 = {"Lo/getLifecycleRegistryannotations;", "", "<init>", "()V", "", "p0", "Lo/getReferencedType;", "p1", "", "write", "(JJ)V", "Lo/UnsupportedTypeDeserializer;", "RemoteActionCompatParcelizer", "()J", "Lo/reportInputMismatch;", "AudioAttributesCompatParcelizer", "Lo/reportInputMismatch;"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class getLifecycleRegistryannotations {
    private final reportInputMismatch AudioAttributesCompatParcelizer = new reportInputMismatch(true);

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final reportInputMismatch RemoteActionCompatParcelizer = new reportInputMismatch(true);

    public final void write(long p0, long p1) {
        this.AudioAttributesCompatParcelizer.write(p0, Float.intBitsToFloat((int) (p1 >> 32)));
        this.RemoteActionCompatParcelizer.write(p0, Float.intBitsToFloat((int) p1));
    }

    public final long RemoteActionCompatParcelizer() {
        return ValueInjector.read(this.AudioAttributesCompatParcelizer.write(Float.MAX_VALUE), this.RemoteActionCompatParcelizer.write(Float.MAX_VALUE));
    }
}
