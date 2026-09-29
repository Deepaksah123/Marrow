package com.fasterxml.jackson.core.format;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes4.dex */
public interface InputAccessor {
    boolean hasMoreBytes() throws IOException;

    byte nextByte() throws IOException;

    public static class Std implements InputAccessor {
        public final byte[] _buffer;
        public int _bufferedEnd;
        public final int _bufferedStart;
        public final InputStream _in = null;
        protected int _ptr;

        public Std(byte[] bArr, int i, int i2) {
            this._buffer = bArr;
            this._ptr = i;
            this._bufferedStart = i;
            this._bufferedEnd = i + i2;
        }

        @Override // com.fasterxml.jackson.core.format.InputAccessor
        public boolean hasMoreBytes() throws IOException {
            int i;
            int i2 = this._ptr;
            if (i2 < this._bufferedEnd) {
                return true;
            }
            InputStream inputStream = this._in;
            if (inputStream == null) {
                return false;
            }
            byte[] bArr = this._buffer;
            int length = bArr.length - i2;
            if (length <= 0 || (i = inputStream.read(bArr, i2, length)) <= 0) {
                return false;
            }
            this._bufferedEnd += i;
            return true;
        }

        @Override // com.fasterxml.jackson.core.format.InputAccessor
        public byte nextByte() throws IOException {
            if (this._ptr >= this._bufferedEnd && !hasMoreBytes()) {
                StringBuilder sb = new StringBuilder("Failed auto-detect: could not read more than ");
                sb.append(this._ptr);
                sb.append(" bytes (max buffer size: ");
                sb.append(this._buffer.length);
                sb.append(")");
                throw new EOFException(sb.toString());
            }
            byte[] bArr = this._buffer;
            int i = this._ptr;
            this._ptr = i + 1;
            return bArr[i];
        }

        public void reset() {
            this._ptr = this._bufferedStart;
        }
    }
}
