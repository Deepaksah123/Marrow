package com.fasterxml.jackson.core.io;

import com.fasterxml.jackson.core.io.doubleparser.JavaBigIntegerParser;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes2.dex */
public final class BigIntegerParser {
    public static BigInteger parseWithFastParser(String str) {
        try {
            return JavaBigIntegerParser.parseBigInteger(str);
        } catch (NumberFormatException e) {
            if (str.length() > 1000) {
                StringBuilder sb = new StringBuilder();
                sb.append(str.substring(0, 1000));
                sb.append(" [truncated]");
                str = sb.toString();
            }
            StringBuilder sb2 = new StringBuilder("Value \"");
            sb2.append(str);
            sb2.append("\" can not be represented as `java.math.BigInteger`, reason: ");
            sb2.append(e.getMessage());
            throw new NumberFormatException(sb2.toString());
        }
    }
}
