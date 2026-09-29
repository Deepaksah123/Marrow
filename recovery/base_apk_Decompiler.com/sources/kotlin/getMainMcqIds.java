package kotlin;

/* JADX INFO: loaded from: classes4.dex */
public final class getMainMcqIds extends getOriginalPosition implements getTotal {
    private final getVideoPageNotesTitle AudioAttributesCompatParcelizer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getMainMcqIds(getVideoPageNotesTitle getvideopagenotestitle, getLink getlink, getStartIndex getstartindex) {
        super(getlink, getstartindex);
        if (getvideopagenotestitle == null) {
            IconCompatParcelizer(0);
        }
        if (getlink == null) {
            IconCompatParcelizer(1);
        }
        this.AudioAttributesCompatParcelizer = getvideopagenotestitle;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(write());
        sb.append(": Ext {");
        sb.append(this.AudioAttributesCompatParcelizer);
        sb.append("}");
        return sb.toString();
    }

    private static /* synthetic */ void IconCompatParcelizer(int i) {
        String str = i != 2 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i != 2 ? 3 : 2];
        if (i == 1) {
            objArr[0] = "receiverType";
        } else if (i == 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/ExtensionReceiver";
        } else if (i != 3) {
            objArr[0] = "callableDescriptor";
        } else {
            objArr[0] = "newType";
        }
        if (i != 2) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/ExtensionReceiver";
        } else {
            objArr[1] = "getDeclarationDescriptor";
        }
        if (i != 2) {
            if (i != 3) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "replaceType";
            }
        }
        String str2 = String.format(str, objArr);
        if (i == 2) {
            throw new IllegalStateException(str2);
        }
    }
}
