package com.fasterxml.jackson.core.io.doubleparser;

import java.math.BigDecimal;

/* JADX INFO: loaded from: classes2.dex */
public class JavaBigDecimalParser {
    private static final JavaBigDecimalFromByteArray BYTE_ARRAY_PARSER = new JavaBigDecimalFromByteArray();
    private static final JavaBigDecimalFromCharArray CHAR_ARRAY_PARSER = new JavaBigDecimalFromCharArray();
    private static final JavaBigDecimalFromCharSequence CHAR_SEQUENCE_PARSER = new JavaBigDecimalFromCharSequence();

    public static BigDecimal parseBigDecimal(CharSequence charSequence) throws NumberFormatException {
        return parseBigDecimal(charSequence, 0, charSequence.length());
    }

    public static BigDecimal parseBigDecimal(CharSequence charSequence, int i, int i2) throws NumberFormatException {
        return CHAR_SEQUENCE_PARSER.parseBigDecimalString(charSequence, i, i2);
    }
}
