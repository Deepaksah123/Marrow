package org.apache.commons.compress.archivers.zip;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes5.dex */
class ExplodingInputStream extends InputStream {
    private BitStream bits;
    private final CircularBuffer buffer = new CircularBuffer(32768);
    private final int dictionarySize;
    private BinaryTree distanceTree;

    /* JADX INFO: renamed from: in, reason: collision with root package name */
    private final InputStream f5in;
    private BinaryTree lengthTree;
    private BinaryTree literalTree;
    private final int minimumMatchLength;
    private final int numberOfTrees;

    public ExplodingInputStream(int i, int i2, InputStream inputStream) {
        if (i != 4096 && i != 8192) {
            throw new IllegalArgumentException("The dictionary size must be 4096 or 8192");
        }
        if (i2 != 2 && i2 != 3) {
            throw new IllegalArgumentException("The number of trees must be 2 or 3");
        }
        this.dictionarySize = i;
        this.numberOfTrees = i2;
        this.minimumMatchLength = i2;
        this.f5in = inputStream;
    }

    private void init() throws IOException {
        if (this.bits == null) {
            if (this.numberOfTrees == 3) {
                this.literalTree = BinaryTree.decode(this.f5in, 256);
            }
            this.lengthTree = BinaryTree.decode(this.f5in, 64);
            this.distanceTree = BinaryTree.decode(this.f5in, 64);
            this.bits = new BitStream(this.f5in);
        }
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (!this.buffer.available()) {
            fillBuffer();
        }
        return this.buffer.get();
    }

    private void fillBuffer() throws IOException {
        int iNextByte;
        init();
        int iNextBit = this.bits.nextBit();
        if (iNextBit == 1) {
            BinaryTree binaryTree = this.literalTree;
            if (binaryTree != null) {
                iNextByte = binaryTree.read(this.bits);
            } else {
                iNextByte = this.bits.nextByte();
            }
            if (iNextByte != -1) {
                this.buffer.put(iNextByte);
                return;
            }
            return;
        }
        if (iNextBit == 0) {
            int i = this.dictionarySize == 4096 ? 6 : 7;
            int iNextBits = (int) this.bits.nextBits(i);
            int i2 = this.distanceTree.read(this.bits);
            if (i2 != -1 || iNextBits > 0) {
                int iNextBits2 = this.lengthTree.read(this.bits);
                if (iNextBits2 == 63) {
                    iNextBits2 = (int) (((long) iNextBits2) + this.bits.nextBits(8));
                }
                this.buffer.copy(((i2 << i) | iNextBits) + 1, iNextBits2 + this.minimumMatchLength);
            }
        }
    }
}
