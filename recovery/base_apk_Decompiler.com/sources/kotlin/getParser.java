package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH&¢\u0006\u0004\b\r\u0010\u0003R$\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0001@\u0001X\u0080\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0014\u0010\u000b\u001a\u00020\u00148WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0015R\u0014\u0010\u0010\u001a\u00020\u00148WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0015"}, d2 = {"Lo/getParser;", "", "<init>", "()V", "Lo/DeserializationContext;", "p0", "Lo/_shapeForToken;", "p1", "Lo/getKey;", "p2", "", "RemoteActionCompatParcelizer", "(Lo/DeserializationContext;Lo/_shapeForToken;J)V", "write", "Lo/isAbstract;", "Lo/isAbstract;", "AudioAttributesCompatParcelizer", "()Lo/isAbstract;", "read", "(Lo/isAbstract;)V", "", "()Z"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class getParser {
    private isAbstract write;

    public abstract void RemoteActionCompatParcelizer(DeserializationContext p0, _shapeForToken p1, long p2);

    public boolean RemoteActionCompatParcelizer() {
        return false;
    }

    public boolean read() {
        return false;
    }

    public abstract void write();

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final isAbstract getWrite() {
        return this.write;
    }

    public final void read(isAbstract isabstract) {
        this.write = isabstract;
    }
}
