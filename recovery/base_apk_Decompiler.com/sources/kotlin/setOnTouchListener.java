package kotlin;

/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class setOnTouchListener {
    public static final Void RemoteActionCompatParcelizer(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        StringBuilder sb = new StringBuilder("No valid saved state was found for the key '");
        sb.append(str);
        sb.append("'. It may be missing, null, or not of the expected type. This can occur if the value was saved with a different type or if the saved state was modified unexpectedly.");
        throw new IllegalArgumentException(sb.toString());
    }
}
