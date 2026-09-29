package com.fasterxml.jackson.core.util;

import java.io.IOException;
import java.io.OutputStream;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes2.dex */
public final class ByteArrayBuilder extends OutputStream {
    public static final byte[] NO_BYTES = new byte[0];
    private final BufferRecycler _bufferRecycler;
    private byte[] _currBlock;
    private int _currBlockPtr;
    private final LinkedList<byte[]> _pastBlocks;
    private int _pastLen;

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() {
    }

    public ByteArrayBuilder() {
        this((BufferRecycler) null);
    }

    public ByteArrayBuilder(BufferRecycler bufferRecycler) {
        this(bufferRecycler, 500);
    }

    public ByteArrayBuilder(int i) {
        this(null, i);
    }

    public ByteArrayBuilder(BufferRecycler bufferRecycler, int i) {
        this._pastBlocks = new LinkedList<>();
        this._bufferRecycler = bufferRecycler;
        this._currBlock = bufferRecycler == null ? new byte[i > 131072 ? 131072 : i] : bufferRecycler.allocByteBuffer(2);
    }

    private ByteArrayBuilder(BufferRecycler bufferRecycler, byte[] bArr, int i) {
        this._pastBlocks = new LinkedList<>();
        this._bufferRecycler = null;
        this._currBlock = bArr;
        this._currBlockPtr = i;
    }

    public static ByteArrayBuilder fromInitial(byte[] bArr, int i) {
        return new ByteArrayBuilder(null, bArr, i);
    }

    public final void reset() {
        this._pastLen = 0;
        this._currBlockPtr = 0;
        if (this._pastBlocks.isEmpty()) {
            return;
        }
        this._pastBlocks.clear();
    }

    public final void release() {
        byte[] bArr;
        reset();
        BufferRecycler bufferRecycler = this._bufferRecycler;
        if (bufferRecycler == null || (bArr = this._currBlock) == null) {
            return;
        }
        bufferRecycler.releaseByteBuffer(2, bArr);
        this._currBlock = null;
    }

    public final void append(int i) {
        if (this._currBlockPtr >= this._currBlock.length) {
            _allocMore();
        }
        byte[] bArr = this._currBlock;
        int i2 = this._currBlockPtr;
        this._currBlockPtr = i2 + 1;
        bArr[i2] = (byte) i;
    }

    public final void appendTwoBytes(int i) {
        int i2 = this._currBlockPtr;
        byte[] bArr = this._currBlock;
        int i3 = i2 + 1;
        if (i3 < bArr.length) {
            bArr[i2] = (byte) (i >> 8);
            this._currBlockPtr = i2 + 2;
            bArr[i3] = (byte) i;
        } else {
            append(i >> 8);
            append(i);
        }
    }

    public final void appendThreeBytes(int i) {
        int i2 = this._currBlockPtr;
        byte[] bArr = this._currBlock;
        int i3 = i2 + 2;
        if (i3 < bArr.length) {
            bArr[i2] = (byte) (i >> 16);
            bArr[i2 + 1] = (byte) (i >> 8);
            this._currBlockPtr = i2 + 3;
            bArr[i3] = (byte) i;
            return;
        }
        append(i >> 16);
        append(i >> 8);
        append(i);
    }

    public final byte[] toByteArray() {
        int i = this._pastLen + this._currBlockPtr;
        if (i == 0) {
            return NO_BYTES;
        }
        byte[] bArr = new byte[i];
        int i2 = 0;
        for (byte[] bArr2 : this._pastBlocks) {
            int length = bArr2.length;
            System.arraycopy(bArr2, 0, bArr, i2, length);
            i2 += length;
        }
        System.arraycopy(this._currBlock, 0, bArr, i2, this._currBlockPtr);
        int i3 = i2 + this._currBlockPtr;
        if (i3 != i) {
            StringBuilder sb = new StringBuilder("Internal error: total len assumed to be ");
            sb.append(i);
            sb.append(", copied ");
            sb.append(i3);
            sb.append(" bytes");
            throw new RuntimeException(sb.toString());
        }
        if (!this._pastBlocks.isEmpty()) {
            reset();
        }
        return bArr;
    }

    public final byte[] resetAndGetFirstSegment() {
        reset();
        return this._currBlock;
    }

    public final byte[] finishCurrentSegment() {
        _allocMore();
        return this._currBlock;
    }

    public final byte[] completeAndCoalesce(int i) {
        this._currBlockPtr = i;
        return toByteArray();
    }

    public final byte[] getCurrentSegment() {
        return this._currBlock;
    }

    public final void setCurrentSegmentLength(int i) {
        this._currBlockPtr = i;
    }

    public final int getCurrentSegmentLength() {
        return this._currBlockPtr;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        while (true) {
            int iMin = Math.min(this._currBlock.length - this._currBlockPtr, i2);
            if (iMin > 0) {
                System.arraycopy(bArr, i, this._currBlock, this._currBlockPtr, iMin);
                i += iMin;
                this._currBlockPtr += iMin;
                i2 -= iMin;
            }
            if (i2 <= 0) {
                return;
            } else {
                _allocMore();
            }
        }
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        append(i);
    }

    private void _allocMore() {
        int length = this._pastLen + this._currBlock.length;
        if (length < 0) {
            throw new IllegalStateException("Maximum Java array size (2GB) exceeded by `ByteArrayBuilder`");
        }
        this._pastLen = length;
        int iMax = Math.max(length >> 1, 1000);
        if (iMax > 131072) {
            iMax = 131072;
        }
        this._pastBlocks.add(this._currBlock);
        this._currBlock = new byte[iMax];
        this._currBlockPtr = 0;
    }
}
