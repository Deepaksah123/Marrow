package org.apache.commons.compress.archivers.sevenz;

import java.util.BitSet;

/* JADX INFO: loaded from: classes5.dex */
class Archive {
    SevenZArchiveEntry[] files;
    Folder[] folders;
    long[] packCrcs;
    BitSet packCrcsDefined;
    long packPos;
    long[] packSizes;
    StreamMap streamMap;
    SubStreamsInfo subStreamsInfo;

    Archive() {
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Archive with packed streams starting at offset ");
        sb.append(this.packPos);
        sb.append(", ");
        sb.append(lengthOf(this.packSizes));
        sb.append(" pack sizes, ");
        sb.append(lengthOf(this.packCrcs));
        sb.append(" CRCs, ");
        sb.append(lengthOf(this.folders));
        sb.append(" folders, ");
        sb.append(lengthOf(this.files));
        sb.append(" files and ");
        sb.append(this.streamMap);
        return sb.toString();
    }

    private static String lengthOf(long[] jArr) {
        return jArr == null ? "(null)" : String.valueOf(jArr.length);
    }

    private static String lengthOf(Object[] objArr) {
        return objArr == null ? "(null)" : String.valueOf(objArr.length);
    }
}
