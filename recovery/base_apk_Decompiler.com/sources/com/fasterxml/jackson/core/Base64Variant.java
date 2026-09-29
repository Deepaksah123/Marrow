package com.fasterxml.jackson.core;

import com.fasterxml.jackson.core.util.ByteArrayBuilder;
import java.io.Serializable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class Base64Variant implements Serializable {
    private final transient int[] _asciiToBase64;
    private final transient byte[] _base64ToAsciiB;
    private final transient char[] _base64ToAsciiC;
    private final int _maxLineLength;
    final String _name;
    private final char _paddingChar;
    private final PaddingReadBehaviour _paddingReadBehaviour;
    private final boolean _writePadding;

    public enum PaddingReadBehaviour {
        PADDING_FORBIDDEN,
        PADDING_REQUIRED,
        PADDING_ALLOWED
    }

    public Base64Variant(String str, String str2, boolean z, char c, int i) {
        int[] iArr = new int[128];
        this._asciiToBase64 = iArr;
        char[] cArr = new char[64];
        this._base64ToAsciiC = cArr;
        this._base64ToAsciiB = new byte[64];
        this._name = str;
        this._writePadding = z;
        this._paddingChar = c;
        this._maxLineLength = i;
        int length = str2.length();
        if (length != 64) {
            StringBuilder sb = new StringBuilder("Base64Alphabet length must be exactly 64 (was ");
            sb.append(length);
            sb.append(")");
            throw new IllegalArgumentException(sb.toString());
        }
        str2.getChars(0, length, cArr, 0);
        Arrays.fill(iArr, -1);
        for (int i2 = 0; i2 < length; i2++) {
            char c2 = this._base64ToAsciiC[i2];
            this._base64ToAsciiB[i2] = (byte) c2;
            this._asciiToBase64[c2] = i2;
        }
        if (z) {
            this._asciiToBase64[c] = -2;
        }
        this._paddingReadBehaviour = z ? PaddingReadBehaviour.PADDING_REQUIRED : PaddingReadBehaviour.PADDING_FORBIDDEN;
    }

    public Base64Variant(Base64Variant base64Variant, String str, int i) {
        this(base64Variant, str, base64Variant._writePadding, base64Variant._paddingChar, i);
    }

    public Base64Variant(Base64Variant base64Variant, String str, boolean z, char c, int i) {
        this(base64Variant, str, z, c, base64Variant._paddingReadBehaviour, i);
    }

    private Base64Variant(Base64Variant base64Variant, String str, boolean z, char c, PaddingReadBehaviour paddingReadBehaviour, int i) {
        int[] iArr = new int[128];
        this._asciiToBase64 = iArr;
        char[] cArr = new char[64];
        this._base64ToAsciiC = cArr;
        byte[] bArr = new byte[64];
        this._base64ToAsciiB = bArr;
        this._name = str;
        byte[] bArr2 = base64Variant._base64ToAsciiB;
        System.arraycopy(bArr2, 0, bArr, 0, bArr2.length);
        char[] cArr2 = base64Variant._base64ToAsciiC;
        System.arraycopy(cArr2, 0, cArr, 0, cArr2.length);
        int[] iArr2 = base64Variant._asciiToBase64;
        System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
        this._writePadding = z;
        this._paddingChar = c;
        this._maxLineLength = i;
        this._paddingReadBehaviour = paddingReadBehaviour;
    }

    protected final Object readResolve() {
        Base64Variant base64VariantValueOf = Base64Variants.valueOf(this._name);
        boolean z = this._writePadding;
        boolean z2 = base64VariantValueOf._writePadding;
        return (z == z2 && this._paddingChar == base64VariantValueOf._paddingChar && this._paddingReadBehaviour == base64VariantValueOf._paddingReadBehaviour && this._maxLineLength == base64VariantValueOf._maxLineLength && z == z2) ? base64VariantValueOf : new Base64Variant(base64VariantValueOf, this._name, z, this._paddingChar, this._paddingReadBehaviour, this._maxLineLength);
    }

    public final String getName() {
        return this._name;
    }

    public final boolean usesPadding() {
        return this._writePadding;
    }

    public final boolean requiresPaddingOnRead() {
        return this._paddingReadBehaviour == PaddingReadBehaviour.PADDING_REQUIRED;
    }

    public final boolean acceptsPaddingOnRead() {
        return this._paddingReadBehaviour != PaddingReadBehaviour.PADDING_FORBIDDEN;
    }

    public final boolean usesPaddingChar(char c) {
        return c == this._paddingChar;
    }

    public final boolean usesPaddingChar(int i) {
        return i == this._paddingChar;
    }

    public final char getPaddingChar() {
        return this._paddingChar;
    }

    public final int getMaxLineLength() {
        return this._maxLineLength;
    }

    public final int decodeBase64Char(char c) {
        if (c <= 127) {
            return this._asciiToBase64[c];
        }
        return -1;
    }

    public final int decodeBase64Char(int i) {
        if (i <= 127) {
            return this._asciiToBase64[i];
        }
        return -1;
    }

    public final int encodeBase64Chunk(int i, char[] cArr, int i2) {
        char[] cArr2 = this._base64ToAsciiC;
        cArr[i2] = cArr2[(i >> 18) & 63];
        cArr[i2 + 1] = cArr2[(i >> 12) & 63];
        cArr[i2 + 2] = cArr2[(i >> 6) & 63];
        cArr[i2 + 3] = cArr2[i & 63];
        return i2 + 4;
    }

    public final void encodeBase64Chunk(StringBuilder sb, int i) {
        sb.append(this._base64ToAsciiC[(i >> 18) & 63]);
        sb.append(this._base64ToAsciiC[(i >> 12) & 63]);
        sb.append(this._base64ToAsciiC[(i >> 6) & 63]);
        sb.append(this._base64ToAsciiC[i & 63]);
    }

    public final int encodeBase64Partial(int i, int i2, char[] cArr, int i3) {
        char[] cArr2 = this._base64ToAsciiC;
        cArr[i3] = cArr2[(i >> 18) & 63];
        int i4 = i3 + 2;
        cArr[i3 + 1] = cArr2[(i >> 12) & 63];
        if (usesPadding()) {
            cArr[i4] = i2 == 2 ? this._base64ToAsciiC[(i >> 6) & 63] : this._paddingChar;
            cArr[i3 + 3] = this._paddingChar;
            return i3 + 4;
        }
        if (i2 != 2) {
            return i4;
        }
        cArr[i4] = this._base64ToAsciiC[(i >> 6) & 63];
        return i3 + 3;
    }

    public final void encodeBase64Partial(StringBuilder sb, int i, int i2) {
        sb.append(this._base64ToAsciiC[(i >> 18) & 63]);
        sb.append(this._base64ToAsciiC[(i >> 12) & 63]);
        if (usesPadding()) {
            sb.append(i2 == 2 ? this._base64ToAsciiC[(i >> 6) & 63] : this._paddingChar);
            sb.append(this._paddingChar);
        } else if (i2 == 2) {
            sb.append(this._base64ToAsciiC[(i >> 6) & 63]);
        }
    }

    public final int encodeBase64Chunk(int i, byte[] bArr, int i2) {
        byte[] bArr2 = this._base64ToAsciiB;
        bArr[i2] = bArr2[(i >> 18) & 63];
        bArr[i2 + 1] = bArr2[(i >> 12) & 63];
        bArr[i2 + 2] = bArr2[(i >> 6) & 63];
        bArr[i2 + 3] = bArr2[i & 63];
        return i2 + 4;
    }

    public final int encodeBase64Partial(int i, int i2, byte[] bArr, int i3) {
        byte[] bArr2 = this._base64ToAsciiB;
        bArr[i3] = bArr2[(i >> 18) & 63];
        int i4 = i3 + 2;
        bArr[i3 + 1] = bArr2[(i >> 12) & 63];
        if (usesPadding()) {
            byte b = (byte) this._paddingChar;
            bArr[i4] = i2 == 2 ? this._base64ToAsciiB[(i >> 6) & 63] : b;
            bArr[i3 + 3] = b;
            return i3 + 4;
        }
        if (i2 != 2) {
            return i4;
        }
        bArr[i4] = this._base64ToAsciiB[(i >> 6) & 63];
        return i3 + 3;
    }

    public final String encode(byte[] bArr) {
        return encode(bArr, false);
    }

    public final String encode(byte[] bArr, boolean z) {
        int length = bArr.length;
        StringBuilder sb = new StringBuilder((length >> 2) + length + (length >> 3));
        if (z) {
            sb.append('\"');
        }
        int maxLineLength = getMaxLineLength() >> 2;
        int i = 0;
        while (i <= length - 3) {
            byte b = bArr[i];
            byte b2 = bArr[i + 1];
            int i2 = i + 3;
            encodeBase64Chunk(sb, (bArr[i + 2] & 255) | (((b << 8) | (b2 & 255)) << 8));
            maxLineLength--;
            if (maxLineLength <= 0) {
                sb.append('\\');
                sb.append('n');
                maxLineLength = getMaxLineLength() >> 2;
            }
            i = i2;
        }
        int i3 = length - i;
        if (i3 > 0) {
            int i4 = bArr[i] << 16;
            if (i3 == 2) {
                i4 |= (bArr[i + 1] & 255) << 8;
            }
            encodeBase64Partial(sb, i4, i3);
        }
        if (z) {
            sb.append('\"');
        }
        return sb.toString();
    }

    public final byte[] decode(String str) throws IllegalArgumentException {
        ByteArrayBuilder byteArrayBuilder = new ByteArrayBuilder();
        decode(str, byteArrayBuilder);
        return byteArrayBuilder.toByteArray();
    }

    public final void decode(String str, ByteArrayBuilder byteArrayBuilder) throws IllegalArgumentException {
        int length = str.length();
        int i = 0;
        while (i < length) {
            int i2 = i + 1;
            char cCharAt = str.charAt(i);
            if (cCharAt > ' ') {
                int iDecodeBase64Char = decodeBase64Char(cCharAt);
                if (iDecodeBase64Char < 0) {
                    _reportInvalidBase64(cCharAt, 0, null);
                }
                if (i2 >= length) {
                    _reportBase64EOF();
                }
                int i3 = i + 2;
                char cCharAt2 = str.charAt(i2);
                int iDecodeBase64Char2 = decodeBase64Char(cCharAt2);
                if (iDecodeBase64Char2 < 0) {
                    _reportInvalidBase64(cCharAt2, 1, null);
                }
                int i4 = (iDecodeBase64Char << 6) | iDecodeBase64Char2;
                if (i3 >= length) {
                    if (!requiresPaddingOnRead()) {
                        byteArrayBuilder.append(i4 >> 4);
                        return;
                    }
                    _reportBase64EOF();
                }
                int i5 = i + 3;
                char cCharAt3 = str.charAt(i3);
                int iDecodeBase64Char3 = decodeBase64Char(cCharAt3);
                if (iDecodeBase64Char3 < 0) {
                    if (iDecodeBase64Char3 != -2) {
                        _reportInvalidBase64(cCharAt3, 2, null);
                    }
                    if (!acceptsPaddingOnRead()) {
                        _reportBase64UnexpectedPadding();
                    }
                    if (i5 >= length) {
                        _reportBase64EOF();
                    }
                    i += 4;
                    char cCharAt4 = str.charAt(i5);
                    if (!usesPaddingChar(cCharAt4)) {
                        StringBuilder sb = new StringBuilder("expected padding character '");
                        sb.append(getPaddingChar());
                        sb.append("'");
                        _reportInvalidBase64(cCharAt4, 3, sb.toString());
                    }
                    byteArrayBuilder.append(i4 >> 4);
                } else {
                    int i6 = (i4 << 6) | iDecodeBase64Char3;
                    if (i5 >= length) {
                        if (!requiresPaddingOnRead()) {
                            byteArrayBuilder.appendTwoBytes(i6 >> 2);
                            return;
                        }
                        _reportBase64EOF();
                    }
                    i += 4;
                    char cCharAt5 = str.charAt(i5);
                    int iDecodeBase64Char4 = decodeBase64Char(cCharAt5);
                    if (iDecodeBase64Char4 < 0) {
                        if (iDecodeBase64Char4 != -2) {
                            _reportInvalidBase64(cCharAt5, 3, null);
                        }
                        if (!acceptsPaddingOnRead()) {
                            _reportBase64UnexpectedPadding();
                        }
                        byteArrayBuilder.appendTwoBytes(i6 >> 2);
                    } else {
                        byteArrayBuilder.appendThreeBytes((i6 << 6) | iDecodeBase64Char4);
                    }
                }
            } else {
                i = i2;
            }
        }
    }

    public final String toString() {
        return this._name;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        Base64Variant base64Variant = (Base64Variant) obj;
        return base64Variant._paddingChar == this._paddingChar && base64Variant._maxLineLength == this._maxLineLength && base64Variant._writePadding == this._writePadding && base64Variant._paddingReadBehaviour == this._paddingReadBehaviour && this._name.equals(base64Variant._name);
    }

    public final int hashCode() {
        return this._name.hashCode();
    }

    protected final void _reportInvalidBase64(char c, int i, String str) throws IllegalArgumentException {
        String string;
        if (c <= ' ') {
            StringBuilder sb = new StringBuilder("Illegal white space character (code 0x");
            sb.append(Integer.toHexString(c));
            sb.append(") as character #");
            sb.append(i + 1);
            sb.append(" of 4-char base64 unit: can only used between units");
            string = sb.toString();
        } else if (usesPaddingChar(c)) {
            StringBuilder sb2 = new StringBuilder("Unexpected padding character ('");
            sb2.append(getPaddingChar());
            sb2.append("') as character #");
            sb2.append(i + 1);
            sb2.append(" of 4-char base64 unit: padding only legal as 3rd or 4th character");
            string = sb2.toString();
        } else if (!Character.isDefined(c) || Character.isISOControl(c)) {
            StringBuilder sb3 = new StringBuilder("Illegal character (code 0x");
            sb3.append(Integer.toHexString(c));
            sb3.append(") in base64 content");
            string = sb3.toString();
        } else {
            StringBuilder sb4 = new StringBuilder("Illegal character '");
            sb4.append(c);
            sb4.append("' (code 0x");
            sb4.append(Integer.toHexString(c));
            sb4.append(") in base64 content");
            string = sb4.toString();
        }
        if (str != null) {
            StringBuilder sb5 = new StringBuilder();
            sb5.append(string);
            sb5.append(": ");
            sb5.append(str);
            string = sb5.toString();
        }
        throw new IllegalArgumentException(string);
    }

    protected final void _reportBase64EOF() throws IllegalArgumentException {
        throw new IllegalArgumentException(missingPaddingMessage());
    }

    protected final void _reportBase64UnexpectedPadding() throws IllegalArgumentException {
        throw new IllegalArgumentException(unexpectedPaddingMessage());
    }

    protected final String unexpectedPaddingMessage() {
        return String.format("Unexpected end of base64-encoded String: base64 variant '%s' expects no padding at the end while decoding. This Base64Variant might have been incorrectly configured", getName());
    }

    public final String missingPaddingMessage() {
        return String.format("Unexpected end of base64-encoded String: base64 variant '%s' expects padding (one or more '%c' characters) at the end. This Base64Variant might have been incorrectly configured", getName(), Character.valueOf(getPaddingChar()));
    }
}
