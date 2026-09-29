package kotlin;

/* JADX INFO: loaded from: classes4.dex */
public abstract class getOriginalPosition implements getStartIndex {
    private final getStartIndex AudioAttributesCompatParcelizer;
    private getLink RemoteActionCompatParcelizer;

    public getOriginalPosition(getLink getlink, getStartIndex getstartindex) {
        if (getlink == null) {
            write(0);
        }
        this.RemoteActionCompatParcelizer = getlink;
        this.AudioAttributesCompatParcelizer = getstartindex == null ? this : getstartindex;
    }

    @Override // kotlin.getStartIndex
    public final getLink write() {
        getLink getlink = this.RemoteActionCompatParcelizer;
        if (getlink == null) {
            write(1);
        }
        return getlink;
    }

    private static /* synthetic */ void write(int i) {
        String str = (i == 1 || i == 2) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 1 || i == 2) ? 2 : 3];
        if (i == 1 || i == 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/AbstractReceiverValue";
        } else {
            objArr[0] = "receiverType";
        }
        if (i == 1) {
            objArr[1] = "getType";
        } else if (i != 2) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/AbstractReceiverValue";
        } else {
            objArr[1] = "getOriginal";
        }
        if (i != 1 && i != 2) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i != 1 && i != 2) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }
}
