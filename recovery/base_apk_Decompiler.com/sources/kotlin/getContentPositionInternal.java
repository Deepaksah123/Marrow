package kotlin;

/* JADX INFO: loaded from: classes2.dex */
public final class getContentPositionInternal extends RuntimeException {
    private final C0156TypeKt RemoteActionCompatParcelizer;

    public getContentPositionInternal(C0156TypeKt c0156TypeKt) {
        toMagicModuleMetaRepoModel.write(c0156TypeKt, "");
        StringBuilder sb = new StringBuilder("HTTP ");
        sb.append(c0156TypeKt.getCode());
        sb.append(": ");
        sb.append((Object) c0156TypeKt.getMessage());
        super(sb.toString());
        this.RemoteActionCompatParcelizer = c0156TypeKt;
    }
}
