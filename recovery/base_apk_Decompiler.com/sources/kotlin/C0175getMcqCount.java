package kotlin;

import java.io.ByteArrayOutputStream;

/* JADX INFO: renamed from: o.getMcqCount, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
final class C0175getMcqCount extends ByteArrayOutputStream {
    public C0175getMcqCount() {
        super(8193);
    }

    public final byte[] AudioAttributesCompatParcelizer() {
        byte[] bArr = ((ByteArrayOutputStream) this).buf;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(bArr, "");
        return bArr;
    }
}
