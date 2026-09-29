package com.google.android.exoplayer2.util;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;
import kotlin.onEmsgLeafAtomRead;
import kotlin.parseIndexAndCountAttribute;
import kotlin.parseMdtaFromMeta;
import kotlin.parseUint8Attribute;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class ParsableByteArray {
    private static final char[] CR_AND_LF = {'\r', '\n'};
    private static final char[] LF = {'\n'};
    private static final onEmsgLeafAtomRead<Charset> SUPPORTED_CHARSETS_FOR_READLINE = onEmsgLeafAtomRead.write(parseMdtaFromMeta.RemoteActionCompatParcelizer, parseMdtaFromMeta.AudioAttributesImplApi26Parcelizer, parseMdtaFromMeta.write, parseMdtaFromMeta.IconCompatParcelizer, parseMdtaFromMeta.read);
    private byte[] data;
    private int limit;
    private int position;

    public ParsableByteArray() {
        this.data = Util.EMPTY_BYTE_ARRAY;
    }

    public ParsableByteArray(int i) {
        this.data = new byte[i];
        this.limit = i;
    }

    public ParsableByteArray(byte[] bArr) {
        this.data = bArr;
        this.limit = bArr.length;
    }

    public ParsableByteArray(byte[] bArr, int i) {
        this.data = bArr;
        this.limit = i;
    }

    public final void reset(int i) {
        reset(capacity() < i ? new byte[i] : this.data, i);
    }

    public final void reset(byte[] bArr) {
        reset(bArr, bArr.length);
    }

    public final void reset(byte[] bArr, int i) {
        this.data = bArr;
        this.limit = i;
        this.position = 0;
    }

    public final void ensureCapacity(int i) {
        if (i > capacity()) {
            this.data = Arrays.copyOf(this.data, i);
        }
    }

    public final int bytesLeft() {
        return this.limit - this.position;
    }

    public final int limit() {
        return this.limit;
    }

    public final void setLimit(int i) {
        Assertions.checkArgument(i >= 0 && i <= this.data.length);
        this.limit = i;
    }

    public final int getPosition() {
        return this.position;
    }

    public final void setPosition(int i) {
        Assertions.checkArgument(i >= 0 && i <= this.limit);
        this.position = i;
    }

    public final byte[] getData() {
        return this.data;
    }

    public final int capacity() {
        return this.data.length;
    }

    public final void skipBytes(int i) {
        setPosition(this.position + i);
    }

    public final void readBytes(ParsableBitArray parsableBitArray, int i) {
        readBytes(parsableBitArray.data, 0, i);
        parsableBitArray.setPosition(0);
    }

    public final void readBytes(byte[] bArr, int i, int i2) {
        System.arraycopy(this.data, this.position, bArr, i, i2);
        this.position += i2;
    }

    public final void readBytes(ByteBuffer byteBuffer, int i) {
        byteBuffer.put(this.data, this.position, i);
        this.position += i;
    }

    public final int peekUnsignedByte() {
        return this.data[this.position] & 255;
    }

    public final char peekChar() {
        byte[] bArr = this.data;
        int i = this.position;
        return (char) ((bArr[i + 1] & 255) | ((bArr[i] & 255) << 8));
    }

    public final char peekChar(Charset charset) {
        Assertions.checkArgument(SUPPORTED_CHARSETS_FOR_READLINE.contains(charset), "Unsupported charset: ".concat(String.valueOf(charset)));
        return (char) (peekCharacterAndSize(charset) >> 16);
    }

    public final int readUnsignedByte() {
        byte[] bArr = this.data;
        int i = this.position;
        this.position = i + 1;
        return bArr[i] & 255;
    }

    public final int readUnsignedShort() {
        byte[] bArr = this.data;
        int i = this.position;
        int i2 = i + 1;
        byte b = bArr[i];
        this.position = i + 2;
        return (bArr[i2] & 255) | ((b & 255) << 8);
    }

    public final int readLittleEndianUnsignedShort() {
        byte[] bArr = this.data;
        int i = this.position;
        int i2 = i + 1;
        byte b = bArr[i];
        this.position = i + 2;
        return ((bArr[i2] & 255) << 8) | (b & 255);
    }

    public final short readShort() {
        byte[] bArr = this.data;
        int i = this.position;
        int i2 = i + 1;
        byte b = bArr[i];
        this.position = i + 2;
        return (short) ((bArr[i2] & 255) | ((b & 255) << 8));
    }

    public final short readLittleEndianShort() {
        byte[] bArr = this.data;
        int i = this.position;
        int i2 = i + 1;
        byte b = bArr[i];
        this.position = i + 2;
        return (short) (((bArr[i2] & 255) << 8) | (b & 255));
    }

    public final int readUnsignedInt24() {
        byte[] bArr = this.data;
        int i = this.position;
        byte b = bArr[i];
        int i2 = i + 2;
        byte b2 = bArr[i + 1];
        this.position = i + 3;
        return (bArr[i2] & 255) | ((b2 & 255) << 8) | ((b & 255) << 16);
    }

    public final int readInt24() {
        byte[] bArr = this.data;
        int i = this.position;
        byte b = bArr[i];
        int i2 = i + 2;
        byte b2 = bArr[i + 1];
        this.position = i + 3;
        return (bArr[i2] & 255) | ((b2 & 255) << 8) | (((b & 255) << 24) >> 8);
    }

    public final int readLittleEndianInt24() {
        byte[] bArr = this.data;
        int i = this.position;
        byte b = bArr[i];
        int i2 = i + 2;
        byte b2 = bArr[i + 1];
        this.position = i + 3;
        return ((bArr[i2] & 255) << 16) | ((b2 & 255) << 8) | (b & 255);
    }

    public final int readLittleEndianUnsignedInt24() {
        byte[] bArr = this.data;
        int i = this.position;
        byte b = bArr[i];
        int i2 = i + 2;
        byte b2 = bArr[i + 1];
        this.position = i + 3;
        return ((bArr[i2] & 255) << 16) | ((b2 & 255) << 8) | (b & 255);
    }

    public final long readUnsignedInt() {
        byte[] bArr = this.data;
        int i = this.position;
        long j = bArr[i];
        long j2 = bArr[i + 1];
        int i2 = i + 3;
        long j3 = bArr[i + 2];
        this.position = i + 4;
        return (((long) bArr[i2]) & 255) | ((j & 255) << 24) | ((j2 & 255) << 16) | ((j3 & 255) << 8);
    }

    public final long readLittleEndianUnsignedInt() {
        byte[] bArr = this.data;
        int i = this.position;
        long j = bArr[i];
        long j2 = bArr[i + 1];
        int i2 = i + 3;
        long j3 = bArr[i + 2];
        this.position = i + 4;
        return ((((long) bArr[i2]) & 255) << 24) | (j & 255) | ((j2 & 255) << 8) | ((j3 & 255) << 16);
    }

    public final int readInt() {
        byte[] bArr = this.data;
        int i = this.position;
        byte b = bArr[i];
        byte b2 = bArr[i + 1];
        int i2 = i + 3;
        byte b3 = bArr[i + 2];
        this.position = i + 4;
        return (bArr[i2] & 255) | ((b2 & 255) << 16) | ((b & 255) << 24) | ((b3 & 255) << 8);
    }

    public final int readLittleEndianInt() {
        byte[] bArr = this.data;
        int i = this.position;
        byte b = bArr[i];
        byte b2 = bArr[i + 1];
        int i2 = i + 3;
        byte b3 = bArr[i + 2];
        this.position = i + 4;
        return ((bArr[i2] & 255) << 24) | ((b2 & 255) << 8) | (b & 255) | ((b3 & 255) << 16);
    }

    public final long readLong() {
        byte[] bArr = this.data;
        int i = this.position;
        long j = bArr[i];
        long j2 = bArr[i + 1];
        long j3 = bArr[i + 2];
        long j4 = bArr[i + 3];
        long j5 = bArr[i + 4];
        long j6 = bArr[i + 5];
        int i2 = i + 7;
        long j7 = bArr[i + 6];
        this.position = i + 8;
        return (((long) bArr[i2]) & 255) | ((255 & j7) << 8) | ((j & 255) << 56) | ((j2 & 255) << 48) | ((j3 & 255) << 40) | ((j4 & 255) << 32) | ((j5 & 255) << 24) | ((j6 & 255) << 16);
    }

    public final long readLittleEndianLong() {
        byte[] bArr = this.data;
        int i = this.position;
        long j = bArr[i];
        long j2 = bArr[i + 1];
        long j3 = bArr[i + 2];
        long j4 = bArr[i + 3];
        long j5 = bArr[i + 4];
        long j6 = bArr[i + 5];
        int i2 = i + 7;
        long j7 = bArr[i + 6];
        this.position = i + 8;
        return ((((long) bArr[i2]) & 255) << 56) | ((255 & j7) << 48) | (j & 255) | ((j2 & 255) << 8) | ((j3 & 255) << 16) | ((j4 & 255) << 24) | ((j5 & 255) << 32) | ((j6 & 255) << 40);
    }

    public final int readUnsignedFixedPoint1616() {
        byte[] bArr = this.data;
        int i = this.position;
        byte b = bArr[i];
        byte b2 = bArr[i + 1];
        this.position = i + 4;
        return (b2 & 255) | ((b & 255) << 8);
    }

    public final int readSynchSafeInt() {
        return readUnsignedByte() | (readUnsignedByte() << 21) | (readUnsignedByte() << 14) | (readUnsignedByte() << 7);
    }

    public final int readUnsignedIntToInt() {
        int i = readInt();
        if (i >= 0) {
            return i;
        }
        throw new IllegalStateException("Top bit not zero: ".concat(String.valueOf(i)));
    }

    public final int readLittleEndianUnsignedIntToInt() {
        int littleEndianInt = readLittleEndianInt();
        if (littleEndianInt >= 0) {
            return littleEndianInt;
        }
        throw new IllegalStateException("Top bit not zero: ".concat(String.valueOf(littleEndianInt)));
    }

    public final long readUnsignedLongToLong() {
        long j = readLong();
        if (j >= 0) {
            return j;
        }
        throw new IllegalStateException("Top bit not zero: ".concat(String.valueOf(j)));
    }

    public final float readFloat() {
        return Float.intBitsToFloat(readInt());
    }

    public final double readDouble() {
        return Double.longBitsToDouble(readLong());
    }

    public final String readString(int i) {
        return readString(i, parseMdtaFromMeta.AudioAttributesImplApi26Parcelizer);
    }

    public final String readString(int i, Charset charset) {
        String str = new String(this.data, this.position, i, charset);
        this.position += i;
        return str;
    }

    public final String readNullTerminatedString(int i) {
        if (i == 0) {
            return "";
        }
        int i2 = this.position;
        int i3 = (i2 + i) - 1;
        String strFromUtf8Bytes = Util.fromUtf8Bytes(this.data, i2, (i3 >= this.limit || this.data[i3] != 0) ? i : i - 1);
        this.position += i;
        return strFromUtf8Bytes;
    }

    public final String readNullTerminatedString() {
        return readDelimiterTerminatedString((char) 0);
    }

    public final String readDelimiterTerminatedString(char c) {
        if (bytesLeft() == 0) {
            return null;
        }
        int i = this.position;
        while (i < this.limit && this.data[i] != c) {
            i++;
        }
        byte[] bArr = this.data;
        int i2 = this.position;
        String strFromUtf8Bytes = Util.fromUtf8Bytes(bArr, i2, i - i2);
        this.position = i;
        if (i < this.limit) {
            this.position = i + 1;
        }
        return strFromUtf8Bytes;
    }

    public final String readLine() {
        return readLine(parseMdtaFromMeta.AudioAttributesImplApi26Parcelizer);
    }

    public final String readLine(Charset charset) {
        Assertions.checkArgument(SUPPORTED_CHARSETS_FOR_READLINE.contains(charset), "Unsupported charset: ".concat(String.valueOf(charset)));
        if (bytesLeft() == 0) {
            return null;
        }
        if (!charset.equals(parseMdtaFromMeta.RemoteActionCompatParcelizer)) {
            readUtfCharsetFromBom();
        }
        String string = readString(findNextLineTerminator(charset) - this.position, charset);
        if (this.position == this.limit) {
            return string;
        }
        skipLineTerminator(charset);
        return string;
    }

    public final long readUtf8EncodedLong() {
        int i;
        int i2;
        long j = this.data[this.position];
        int i3 = 7;
        while (true) {
            if (i3 < 0) {
                break;
            }
            int i4 = 1 << i3;
            if ((((long) i4) & j) != 0) {
                i3--;
            } else if (i3 < 6) {
                j &= (long) (i4 - 1);
                i2 = 7 - i3;
            } else if (i3 == 7) {
                i2 = 1;
            }
        }
        i2 = 0;
        if (i2 == 0) {
            throw new NumberFormatException("Invalid UTF-8 sequence first byte: ".concat(String.valueOf(j)));
        }
        for (i = 1; i < i2; i++) {
            byte b = this.data[this.position + i];
            if ((b & 192) != 128) {
                throw new NumberFormatException("Invalid UTF-8 sequence continuation byte: ".concat(String.valueOf(j)));
            }
            j = (j << 6) | ((long) (b & 63));
        }
        this.position += i2;
        return j;
    }

    public final Charset readUtfCharsetFromBom() {
        if (bytesLeft() >= 3) {
            byte[] bArr = this.data;
            int i = this.position;
            if (bArr[i] == -17 && bArr[i + 1] == -69 && bArr[i + 2] == -65) {
                this.position = i + 3;
                return parseMdtaFromMeta.AudioAttributesImplApi26Parcelizer;
            }
        }
        if (bytesLeft() < 2) {
            return null;
        }
        byte[] bArr2 = this.data;
        int i2 = this.position;
        byte b = bArr2[i2];
        if (b == -2 && bArr2[i2 + 1] == -1) {
            this.position = i2 + 2;
            return parseMdtaFromMeta.IconCompatParcelizer;
        }
        if (b != -1 || bArr2[i2 + 1] != -2) {
            return null;
        }
        this.position = i2 + 2;
        return parseMdtaFromMeta.read;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0080  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int findNextLineTerminator(java.nio.charset.Charset r5) {
        /*
            r4 = this;
            java.nio.charset.Charset r0 = kotlin.parseMdtaFromMeta.AudioAttributesImplApi26Parcelizer
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L3b
            java.nio.charset.Charset r0 = kotlin.parseMdtaFromMeta.RemoteActionCompatParcelizer
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L3b
            java.nio.charset.Charset r0 = kotlin.parseMdtaFromMeta.write
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L39
            java.nio.charset.Charset r0 = kotlin.parseMdtaFromMeta.read
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L39
            java.nio.charset.Charset r0 = kotlin.parseMdtaFromMeta.IconCompatParcelizer
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L29
            goto L39
        L29:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Unsupported charset: "
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.String r5 = r0.concat(r5)
            r4.<init>(r5)
            throw r4
        L39:
            r0 = 2
            goto L3c
        L3b:
            r0 = 1
        L3c:
            int r1 = r4.position
        L3e:
            int r2 = r4.limit
            int r3 = r0 + (-1)
            int r3 = r2 - r3
            if (r1 >= r3) goto L9c
            java.nio.charset.Charset r2 = kotlin.parseMdtaFromMeta.AudioAttributesImplApi26Parcelizer
            boolean r2 = r5.equals(r2)
            if (r2 != 0) goto L56
            java.nio.charset.Charset r2 = kotlin.parseMdtaFromMeta.RemoteActionCompatParcelizer
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L60
        L56:
            byte[] r2 = r4.data
            r2 = r2[r1]
            boolean r2 = com.google.android.exoplayer2.util.Util.isLinebreak(r2)
            if (r2 != 0) goto L9b
        L60:
            java.nio.charset.Charset r2 = kotlin.parseMdtaFromMeta.write
            boolean r2 = r5.equals(r2)
            if (r2 != 0) goto L70
            java.nio.charset.Charset r2 = kotlin.parseMdtaFromMeta.IconCompatParcelizer
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L80
        L70:
            byte[] r2 = r4.data
            r3 = r2[r1]
            if (r3 != 0) goto L80
            int r3 = r1 + 1
            r2 = r2[r3]
            boolean r2 = com.google.android.exoplayer2.util.Util.isLinebreak(r2)
            if (r2 != 0) goto L9b
        L80:
            java.nio.charset.Charset r2 = kotlin.parseMdtaFromMeta.read
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L99
            byte[] r2 = r4.data
            int r3 = r1 + 1
            r3 = r2[r3]
            if (r3 != 0) goto L99
            r2 = r2[r1]
            boolean r2 = com.google.android.exoplayer2.util.Util.isLinebreak(r2)
            if (r2 == 0) goto L99
            goto L9b
        L99:
            int r1 = r1 + r0
            goto L3e
        L9b:
            return r1
        L9c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.util.ParsableByteArray.findNextLineTerminator(java.nio.charset.Charset):int");
    }

    private void skipLineTerminator(Charset charset) {
        if (readCharacterIfInList(charset, CR_AND_LF) == '\r') {
            readCharacterIfInList(charset, LF);
        }
    }

    private char readCharacterIfInList(Charset charset, char[] cArr) {
        int iPeekCharacterAndSize = peekCharacterAndSize(charset);
        if (iPeekCharacterAndSize == 0) {
            return (char) 0;
        }
        char c = (char) (iPeekCharacterAndSize >> 16);
        if (!parseIndexAndCountAttribute.write(cArr, c)) {
            return (char) 0;
        }
        this.position += iPeekCharacterAndSize & 65535;
        return c;
    }

    private int peekCharacterAndSize(Charset charset) {
        byte bAudioAttributesCompatParcelizer;
        char cIconCompatParcelizer;
        int i = 1;
        if ((charset.equals(parseMdtaFromMeta.AudioAttributesImplApi26Parcelizer) || charset.equals(parseMdtaFromMeta.RemoteActionCompatParcelizer)) && bytesLeft() > 0) {
            bAudioAttributesCompatParcelizer = (byte) parseIndexAndCountAttribute.AudioAttributesCompatParcelizer(parseUint8Attribute.write(this.data[this.position]));
        } else {
            if ((charset.equals(parseMdtaFromMeta.write) || charset.equals(parseMdtaFromMeta.IconCompatParcelizer)) && bytesLeft() >= 2) {
                byte[] bArr = this.data;
                int i2 = this.position;
                cIconCompatParcelizer = parseIndexAndCountAttribute.IconCompatParcelizer(bArr[i2], bArr[i2 + 1]);
            } else {
                if (!charset.equals(parseMdtaFromMeta.read) || bytesLeft() < 2) {
                    return 0;
                }
                byte[] bArr2 = this.data;
                int i3 = this.position;
                cIconCompatParcelizer = parseIndexAndCountAttribute.IconCompatParcelizer(bArr2[i3 + 1], bArr2[i3]);
            }
            bAudioAttributesCompatParcelizer = (byte) cIconCompatParcelizer;
            i = 2;
        }
        return (parseIndexAndCountAttribute.AudioAttributesCompatParcelizer(bAudioAttributesCompatParcelizer) << 16) + i;
    }
}
