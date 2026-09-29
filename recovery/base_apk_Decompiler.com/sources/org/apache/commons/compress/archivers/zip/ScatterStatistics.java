package org.apache.commons.compress.archivers.zip;

/* JADX INFO: loaded from: classes5.dex */
public class ScatterStatistics {
    private final long compressionElapsed;
    private final long mergingElapsed;

    ScatterStatistics(long j, long j2) {
        this.compressionElapsed = j;
        this.mergingElapsed = j2;
    }

    public long getCompressionElapsed() {
        return this.compressionElapsed;
    }

    public long getMergingElapsed() {
        return this.mergingElapsed;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("compressionElapsed=");
        sb.append(this.compressionElapsed);
        sb.append("ms, mergingElapsed=");
        sb.append(this.mergingElapsed);
        sb.append("ms");
        return sb.toString();
    }
}
