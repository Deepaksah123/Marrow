package org.apache.commons.compress.utils;

import java.io.InputStream;
import java.util.zip.CRC32;

/* JADX INFO: loaded from: classes5.dex */
public class CRC32VerifyingInputStream extends ChecksumVerifyingInputStream {
    /* JADX WARN: Illegal instructions before constructor call */
    public CRC32VerifyingInputStream(InputStream inputStream, long j, int i) {
        long j2 = -1;
        this(inputStream, j, ((long) i) & ((((long) 0) << 32) | (j2 - ((j2 >> 63) << 32))));
    }

    public CRC32VerifyingInputStream(InputStream inputStream, long j, long j2) {
        super(new CRC32(), inputStream, j, j2);
    }
}
