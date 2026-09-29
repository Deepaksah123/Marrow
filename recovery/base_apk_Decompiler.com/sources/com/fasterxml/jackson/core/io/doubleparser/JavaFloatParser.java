package com.fasterxml.jackson.core.io.doubleparser;

/* JADX INFO: loaded from: classes2.dex */
public class JavaFloatParser {
    private static final JavaFloatBitsFromByteArray BYTE_ARRAY_PARSER = new JavaFloatBitsFromByteArray();
    private static final JavaFloatBitsFromCharArray CHAR_ARRAY_PARSER = new JavaFloatBitsFromCharArray();
    private static final JavaFloatBitsFromCharSequence CHAR_SEQUENCE_PARSER = new JavaFloatBitsFromCharSequence();

    public static float parseFloat(CharSequence charSequence) throws NumberFormatException {
        return parseFloat(charSequence, 0, charSequence.length());
    }

    public static float parseFloat(CharSequence charSequence, int i, int i2) throws NumberFormatException {
        return Float.intBitsToFloat((int) CHAR_SEQUENCE_PARSER.parseFloatingPointLiteral(charSequence, i, i2));
    }
}
