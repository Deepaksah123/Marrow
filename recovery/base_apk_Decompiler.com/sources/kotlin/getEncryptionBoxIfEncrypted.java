package kotlin;

/* JADX INFO: loaded from: classes3.dex */
final class getEncryptionBoxIfEncrypted {
    static long RemoteActionCompatParcelizer(double d) {
        parseStsd.write(write(d), "not a normal value");
        int exponent = Math.getExponent(d);
        long jDoubleToRawLongBits = Double.doubleToRawLongBits(d) & 4503599627370495L;
        return exponent == -1023 ? jDoubleToRawLongBits << 1 : jDoubleToRawLongBits | 4503599627370496L;
    }

    static boolean write(double d) {
        return Math.getExponent(d) <= 1023;
    }
}
