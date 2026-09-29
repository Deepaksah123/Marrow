package kotlin;

/* JADX INFO: loaded from: classes3.dex */
public final class parseUint8Attribute {
    public static int write(byte b) {
        return b & 255;
    }

    public static byte write(long j) {
        parseStsd.AudioAttributesCompatParcelizer((j >> 8) == 0, "out of range: %s", j);
        return (byte) j;
    }
}
