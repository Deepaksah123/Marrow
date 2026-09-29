package kotlin;

import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\rJ\u0015\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u000b¢\u0006\u0004\b\u000f\u0010\rJ\u0015\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\rJ\u0015\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u000b¢\u0006\u0004\b\u0011\u0010\rJ\u0015\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u000b¢\u0006\u0004\b\u0012\u0010\rJ\u0015\u0010\t\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u000b¢\u0006\u0004\b\t\u0010\rJ\u0015\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u000b¢\u0006\u0004\b\u0013\u0010\rR\u0011\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\t\u0010\u0014R+\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048C@CX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u000f\u0010\u0015\u001a\u0004\b\t\u0010\u0016\"\u0004\b\u0010\u0010\n"}, d2 = {"Lo/ObjectMapper;", "", "Lo/_assertNotNull;", "p0", "Lo/withTypeHandler;", "p1", "<init>", "(Lo/_assertNotNull;Lo/withTypeHandler;)V", "", "write", "(Lo/withTypeHandler;)V", "", "MediaBrowserCompatItemReceiver", "(I)I", "IconCompatParcelizer", "RemoteActionCompatParcelizer", "read", "AudioAttributesImplApi21Parcelizer", "AudioAttributesImplBaseParcelizer", "AudioAttributesCompatParcelizer", "Lo/_assertNotNull;", "Lo/InputAccessor;", "()Lo/withTypeHandler;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ObjectMapper {

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final InputAccessor read;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final _assertNotNull RemoteActionCompatParcelizer;

    public ObjectMapper(_assertNotNull _assertnotnull, withTypeHandler withtypehandler) {
        this.RemoteActionCompatParcelizer = _assertnotnull;
        this.read = available.RemoteActionCompatParcelizer$default(withtypehandler, null, 2, null);
    }

    private final void read(withTypeHandler withtypehandler) {
        this.read.write(withtypehandler);
    }

    private final withTypeHandler write() {
        return (withTypeHandler) this.read.getRemoteActionCompatParcelizer();
    }

    public final void write(withTypeHandler p0) {
        read(p0);
    }

    public final int MediaBrowserCompatItemReceiver(int p0) {
        return write().write(this.RemoteActionCompatParcelizer.r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8(), this.RemoteActionCompatParcelizer.onFastForward(), p0);
    }

    public final int IconCompatParcelizer(int p0) {
        return write().AudioAttributesCompatParcelizer((getValueHandler) this.RemoteActionCompatParcelizer.r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8(), (List<? extends hasHandlers>) this.RemoteActionCompatParcelizer.onFastForward(), p0);
    }

    public final int RemoteActionCompatParcelizer(int p0) {
        return write().RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer.r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8(), this.RemoteActionCompatParcelizer.onFastForward(), p0);
    }

    public final int read(int p0) {
        return write().read(this.RemoteActionCompatParcelizer.r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8(), this.RemoteActionCompatParcelizer.onFastForward(), p0);
    }

    public final int AudioAttributesImplApi21Parcelizer(int p0) {
        return write().write(this.RemoteActionCompatParcelizer.r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8(), this.RemoteActionCompatParcelizer.onMediaButtonEvent(), p0);
    }

    public final int AudioAttributesImplBaseParcelizer(int p0) {
        return write().AudioAttributesCompatParcelizer((getValueHandler) this.RemoteActionCompatParcelizer.r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8(), (List<? extends hasHandlers>) this.RemoteActionCompatParcelizer.onMediaButtonEvent(), p0);
    }

    public final int write(int p0) {
        return write().RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer.r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8(), this.RemoteActionCompatParcelizer.onMediaButtonEvent(), p0);
    }

    public final int AudioAttributesCompatParcelizer(int p0) {
        return write().read(this.RemoteActionCompatParcelizer.r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8(), this.RemoteActionCompatParcelizer.onMediaButtonEvent(), p0);
    }
}
