package kotlin;

/* JADX INFO: loaded from: classes4.dex */
public final class setMarkers {
    public static final String AudioAttributesCompatParcelizer(byte[] bArr) {
        toMagicModuleMetaRepoModel.write(bArr, "");
        return new String(bArr, getSubmissionTimestamp.IconCompatParcelizer);
    }

    public static final byte[] read(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        byte[] bytes = str.getBytes(getSubmissionTimestamp.IconCompatParcelizer);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(bytes, "");
        return bytes;
    }
}
