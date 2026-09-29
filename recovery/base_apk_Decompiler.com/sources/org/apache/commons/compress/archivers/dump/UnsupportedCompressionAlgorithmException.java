package org.apache.commons.compress.archivers.dump;

/* JADX INFO: loaded from: classes5.dex */
public class UnsupportedCompressionAlgorithmException extends DumpArchiveException {
    private static final long serialVersionUID = 1;

    public UnsupportedCompressionAlgorithmException() {
        super("this file uses an unsupported compression algorithm.");
    }

    public UnsupportedCompressionAlgorithmException(String str) {
        StringBuilder sb = new StringBuilder("this file uses an unsupported compression algorithm: ");
        sb.append(str);
        sb.append(".");
        super(sb.toString());
    }
}
