package org.apache.commons.compress.archivers;

/* JADX INFO: loaded from: classes5.dex */
public class StreamingNotSupportedException extends ArchiveException {
    private static final long serialVersionUID = 1;
    private final String format;

    public StreamingNotSupportedException(String str) {
        StringBuilder sb = new StringBuilder("The ");
        sb.append(str);
        sb.append(" doesn't support streaming.");
        super(sb.toString());
        this.format = str;
    }

    public String getFormat() {
        return this.format;
    }
}
