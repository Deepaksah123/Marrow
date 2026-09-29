package org.apache.commons.compress.archivers.zip;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
class BinaryTree {
    private static final int NODE = -2;
    private static final int UNDEFINED = -1;
    private final int[] tree;

    public BinaryTree(int i) {
        int[] iArr = new int[(1 << (i + 1)) - 1];
        this.tree = iArr;
        Arrays.fill(iArr, -1);
    }

    public void addLeaf(int i, int i2, int i3, int i4) {
        if (i3 == 0) {
            int[] iArr = this.tree;
            if (iArr[i] == -1) {
                iArr[i] = i4;
                return;
            }
            StringBuilder sb = new StringBuilder("Tree value at index ");
            sb.append(i);
            sb.append(" has already been assigned (");
            sb.append(this.tree[i]);
            sb.append(")");
            throw new IllegalArgumentException(sb.toString());
        }
        this.tree[i] = -2;
        addLeaf((i << 1) + 1 + (i2 & 1), i2 >>> 1, i3 - 1, i4);
    }

    public int read(BitStream bitStream) throws IOException {
        int i = 0;
        while (true) {
            int iNextBit = bitStream.nextBit();
            if (iNextBit == -1) {
                return -1;
            }
            int i2 = (i << 1) + 1 + iNextBit;
            int i3 = this.tree[i2];
            if (i3 != -2) {
                if (i3 != -1) {
                    return i3;
                }
                StringBuilder sb = new StringBuilder("The child ");
                sb.append(iNextBit);
                sb.append(" of node at index ");
                sb.append(i);
                sb.append(" is not defined");
                throw new IOException(sb.toString());
            }
            i = i2;
        }
    }

    static BinaryTree decode(InputStream inputStream, int i) throws IOException {
        int i2 = inputStream.read() + 1;
        if (i2 == 0) {
            throw new IOException("Cannot read the size of the encoded tree, unexpected end of stream");
        }
        byte[] bArr = new byte[i2];
        new DataInputStream(inputStream).readFully(bArr);
        int[] iArr = new int[i];
        int iMax = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            byte b = bArr[i4];
            int i5 = (b & 15) + 1;
            int i6 = 0;
            while (i6 < ((b & 240) >> 4) + 1) {
                iArr[i3] = i5;
                i6++;
                i3++;
            }
            iMax = Math.max(iMax, i5);
        }
        int[] iArr2 = new int[i];
        for (int i7 = 0; i7 < i; i7++) {
            iArr2[i7] = i7;
        }
        int[] iArr3 = new int[i];
        int i8 = 0;
        for (int i9 = 0; i9 < i; i9++) {
            for (int i10 = 0; i10 < i; i10++) {
                if (iArr[i10] == i9) {
                    iArr3[i8] = i9;
                    iArr2[i8] = i10;
                    i8++;
                }
            }
        }
        int[] iArr4 = new int[i];
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        for (int i14 = i - 1; i14 >= 0; i14--) {
            i11 += i12;
            int i15 = iArr3[i14];
            if (i15 != i13) {
                i12 = 1 << (16 - i15);
                i13 = i15;
            }
            iArr4[iArr2[i14]] = i11;
        }
        BinaryTree binaryTree = new BinaryTree(iMax);
        for (int i16 = 0; i16 < i; i16++) {
            int i17 = iArr[i16];
            if (i17 > 0) {
                binaryTree.addLeaf(0, Integer.reverse(iArr4[i16] << 16), i17, i16);
            }
        }
        return binaryTree;
    }
}
