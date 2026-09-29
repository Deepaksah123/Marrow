package kotlin;

/* JADX INFO: loaded from: classes4.dex */
public final class setMainMcqIds extends getOriginalPosition {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public setMainMcqIds(getLink getlink) {
        this(getlink, (byte) 0);
        if (getlink == null) {
            RemoteActionCompatParcelizer(0);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private setMainMcqIds(getLink getlink, byte b) {
        super(getlink, null);
        if (getlink == null) {
            RemoteActionCompatParcelizer(1);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{Transient} : ");
        sb.append(write());
        return sb.toString();
    }

    private static /* synthetic */ void RemoteActionCompatParcelizer(int i) {
        Object[] objArr = new Object[3];
        if (i != 2) {
            objArr[0] = "type";
        } else {
            objArr[0] = "newType";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/TransientReceiver";
        if (i != 2) {
            objArr[2] = "<init>";
        } else {
            objArr[2] = "replaceType";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }
}
