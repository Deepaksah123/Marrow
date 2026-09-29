package kotlin;

/* JADX INFO: loaded from: classes4.dex */
public final class logout extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public logout(IllegalAccessException illegalAccessException) {
        super("Cannot obtain the delegate of a non-accessible property. Use \"isAccessible = true\" to make the property accessible", illegalAccessException);
        toMagicModuleMetaRepoModel.write(illegalAccessException, "");
    }
}
