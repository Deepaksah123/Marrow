package kotlin;

import kotlin.Metadata;
import kotlin._handleOddName;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ#\u0010\u000e\u001a\u00020\r*\u00020\n2\u0006\u0010\u0004\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0013\u001a\u00020\u00038\u0006@\u0007X\u0086\u000e¢\u0006\f\n\u0004\b\u000e\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0014\u001a\u00020\u00058\u0006@\u0007X\u0087\u000e¢\u0006\f\n\u0004\b\u0014\u0010\u0015\"\u0004\b\u0013\u0010\u0016R\u001c\u0010\u0011\u001a\u00020\u00058\u0006@\u0007X\u0087\u000e¢\u0006\f\n\u0004\b\u0013\u0010\u0015\"\u0004\b\u0017\u0010\u0016"}, d2 = {"Lo/WindowInsetsCompatImpl28;", "Lo/_initForReading;", "Lo/_handleOddName$IconCompatParcelizer;", "Lo/weirdNumberException;", "p0", "Lo/assignParameter;", "p1", "p2", "<init>", "(Lo/weirdNumberException;FFLo/MagicModuleRepositoryImplExternalSyntheticLambda0;)V", "Lo/withContentValueHandler;", "Lo/isTypeOrSuperTypeOf;", "Lo/PropertyValueAny;", "Lo/withHandlersFrom;", "read", "(Lo/withContentValueHandler;Lo/isTypeOrSuperTypeOf;J)Lo/withHandlersFrom;", "Lo/weirdNumberException;", "IconCompatParcelizer", "(Lo/weirdNumberException;)V", "RemoteActionCompatParcelizer", "AudioAttributesCompatParcelizer", "F", "(F)V", "write"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class WindowInsetsCompatImpl28 extends _handleOddName.IconCompatParcelizer implements _initForReading {
    private float AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private float IconCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private weirdNumberException RemoteActionCompatParcelizer;

    private WindowInsetsCompatImpl28(weirdNumberException weirdnumberexception, float f, float f2) {
        this.RemoteActionCompatParcelizer = weirdnumberexception;
        this.AudioAttributesCompatParcelizer = f;
        this.IconCompatParcelizer = f2;
    }

    public final void IconCompatParcelizer(weirdNumberException weirdnumberexception) {
        this.RemoteActionCompatParcelizer = weirdnumberexception;
    }

    public final void RemoteActionCompatParcelizer(float f) {
        this.AudioAttributesCompatParcelizer = f;
    }

    public final void write(float f) {
        this.IconCompatParcelizer = f;
    }

    @Override // kotlin._initForReading
    public final withHandlersFrom read(withContentValueHandler withcontentvaluehandler, isTypeOrSuperTypeOf istypeorsupertypeof, long j) {
        return WindowInsetsCompatImpl21.AudioAttributesCompatParcelizer(withcontentvaluehandler, this.RemoteActionCompatParcelizer, this.AudioAttributesCompatParcelizer, this.IconCompatParcelizer, istypeorsupertypeof, j);
    }

    public /* synthetic */ WindowInsetsCompatImpl28(weirdNumberException weirdnumberexception, float f, float f2, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(weirdnumberexception, f, f2);
    }
}
