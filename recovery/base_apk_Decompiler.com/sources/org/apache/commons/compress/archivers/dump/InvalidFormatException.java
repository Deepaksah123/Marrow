package org.apache.commons.compress.archivers.dump;

/* JADX INFO: loaded from: classes5.dex */
public class InvalidFormatException extends DumpArchiveException {
    private static final long serialVersionUID = 1;
    protected long offset;

    public InvalidFormatException() {
        super("there was an error decoding a tape segment");
    }

    public InvalidFormatException(long j) {
        StringBuilder sb = new StringBuilder("there was an error decoding a tape segment header at offset ");
        sb.append(j);
        sb.append(".");
        super(sb.toString());
        this.offset = j;
    }

    public long getOffset() {
        return this.offset;
    }
}
