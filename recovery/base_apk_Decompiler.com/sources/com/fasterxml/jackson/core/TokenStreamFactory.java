package com.fasterxml.jackson.core;

import android.content.Context;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public abstract class TokenStreamFactory implements Serializable {
    public static int IconCompatParcelizer;
    public static int write;

    protected void _checkRangeBoundsForByteArray(byte[] bArr, int i, int i2) throws IllegalArgumentException {
        if (bArr == null) {
            _reportRangeError("Invalid `byte[]` argument: `null`");
        }
        int length = bArr.length;
        int i3 = i + i2;
        if ((i3 | i | i2 | (length - i3)) < 0) {
            _reportRangeError(String.format("Invalid 'offset' (%d) and/or 'len' (%d) arguments for `byte[]` of length %d", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(length)));
        }
    }

    protected <T> T _reportRangeError(String str) throws IllegalArgumentException {
        throw new IllegalArgumentException(str);
    }

    public static int IconCompatParcelizer() {
        int i = write;
        int i2 = i % 7038762;
        write = i + 1;
        if (i2 != 0) {
            return IconCompatParcelizer;
        }
        int i3 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().uiMode;
        IconCompatParcelizer = i3;
        return i3;
    }
}
