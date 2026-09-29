package org.apache.commons.compress.archivers.sevenz;

import java.util.LinkedList;

/* JADX INFO: loaded from: classes5.dex */
class Folder {
    BindPair[] bindPairs;
    Coder[] coders;
    long crc;
    boolean hasCrc;
    int numUnpackSubStreams;
    long[] packedStreams;
    long totalInputStreams;
    long totalOutputStreams;
    long[] unpackSizes;

    Folder() {
    }

    Iterable<Coder> getOrderedCoders() {
        int iFindBindPairForOutStream;
        LinkedList linkedList = new LinkedList();
        long j = this.packedStreams[0];
        while (true) {
            for (int i = (int) j; i != -1; i = -1) {
                linkedList.addLast(this.coders[i]);
                iFindBindPairForOutStream = findBindPairForOutStream(i);
                if (iFindBindPairForOutStream != -1) {
                    break;
                }
            }
            return linkedList;
            j = this.bindPairs[iFindBindPairForOutStream].inIndex;
        }
    }

    int findBindPairForInStream(int i) {
        int i2 = 0;
        while (true) {
            BindPair[] bindPairArr = this.bindPairs;
            if (i2 >= bindPairArr.length) {
                return -1;
            }
            if (bindPairArr[i2].inIndex == i) {
                return i2;
            }
            i2++;
        }
    }

    int findBindPairForOutStream(int i) {
        int i2 = 0;
        while (true) {
            BindPair[] bindPairArr = this.bindPairs;
            if (i2 >= bindPairArr.length) {
                return -1;
            }
            if (bindPairArr[i2].outIndex == i) {
                return i2;
            }
            i2++;
        }
    }

    long getUnpackSize() {
        long j = this.totalOutputStreams;
        if (j == 0) {
            return 0L;
        }
        for (int i = ((int) j) - 1; i >= 0; i--) {
            if (findBindPairForOutStream(i) < 0) {
                return this.unpackSizes[i];
            }
        }
        return 0L;
    }

    long getUnpackSizeForCoder(Coder coder) {
        if (this.coders == null) {
            return 0L;
        }
        int i = 0;
        while (true) {
            Coder[] coderArr = this.coders;
            if (i >= coderArr.length) {
                return 0L;
            }
            if (coderArr[i] == coder) {
                return this.unpackSizes[i];
            }
            i++;
        }
    }

    public String toString() {
        String string;
        StringBuilder sb = new StringBuilder("Folder with ");
        sb.append(this.coders.length);
        sb.append(" coders, ");
        sb.append(this.totalInputStreams);
        sb.append(" input streams, ");
        sb.append(this.totalOutputStreams);
        sb.append(" output streams, ");
        sb.append(this.bindPairs.length);
        sb.append(" bind pairs, ");
        sb.append(this.packedStreams.length);
        sb.append(" packed streams, ");
        sb.append(this.unpackSizes.length);
        sb.append(" unpack sizes, ");
        if (this.hasCrc) {
            StringBuilder sb2 = new StringBuilder("with CRC ");
            sb2.append(this.crc);
            string = sb2.toString();
        } else {
            string = "without CRC";
        }
        sb.append(string);
        sb.append(" and ");
        sb.append(this.numUnpackSubStreams);
        sb.append(" unpack streams");
        return sb.toString();
    }
}
