package com.fasterxml.jackson.core.io.doubleparser;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
abstract class AbstractNumberParser {
    static final byte[] CHAR_TO_HEX_MAP;

    AbstractNumberParser() {
    }

    static {
        byte[] bArr = new byte[256];
        CHAR_TO_HEX_MAP = bArr;
        Arrays.fill(bArr, (byte) -1);
        for (char c = '0'; c <= '9'; c = (char) (c + 1)) {
            CHAR_TO_HEX_MAP[c] = (byte) (c - '0');
        }
        for (char c2 = 'A'; c2 <= 'F'; c2 = (char) (c2 + 1)) {
            CHAR_TO_HEX_MAP[c2] = (byte) (c2 - '7');
        }
        for (char c3 = 'a'; c3 <= 'f'; c3 = (char) (c3 + 1)) {
            CHAR_TO_HEX_MAP[c3] = (byte) (c3 - 'W');
        }
        CHAR_TO_HEX_MAP[46] = -4;
    }

    protected static char charAt(CharSequence charSequence, int i, int i2) {
        if (i < i2) {
            return charSequence.charAt(i);
        }
        return (char) 0;
    }

    protected static int lookupHex(char c) {
        if (c < 128) {
            return CHAR_TO_HEX_MAP[c];
        }
        return -1;
    }
}
