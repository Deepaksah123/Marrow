package org.apache.commons.compress.archivers.sevenz;

/* JADX INFO: loaded from: classes5.dex */
class BindPair {
    long inIndex;
    long outIndex;

    BindPair() {
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("BindPair binding input ");
        sb.append(this.inIndex);
        sb.append(" to output ");
        sb.append(this.outIndex);
        return sb.toString();
    }
}
