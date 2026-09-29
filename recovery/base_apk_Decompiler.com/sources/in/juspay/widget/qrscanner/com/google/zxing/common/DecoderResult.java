package in.juspay.widget.qrscanner.com.google.zxing.common;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class DecoderResult {
    private final byte[] a;
    private int b;
    private final String c;
    private final List<byte[]> d;
    private final String e;
    private Integer f;
    private Integer g;
    private Object h;
    private final int i;
    private final int j;
    private final int k;

    public DecoderResult(byte[] bArr, String str, List<byte[]> list, String str2) {
        this(bArr, str, list, str2, -1, -1, 0);
    }

    public DecoderResult(byte[] bArr, String str, List<byte[]> list, String str2, int i) {
        this(bArr, str, list, str2, -1, -1, i);
    }

    public DecoderResult(byte[] bArr, String str, List<byte[]> list, String str2, int i, int i2) {
        this(bArr, str, list, str2, i, i2, 0);
    }

    public DecoderResult(byte[] bArr, String str, List<byte[]> list, String str2, int i, int i2, int i3) {
        this.a = bArr;
        this.b = bArr == null ? 0 : bArr.length << 3;
        this.c = str;
        this.d = list;
        this.e = str2;
        this.i = i2;
        this.j = i;
        this.k = i3;
    }

    public final List<byte[]> getByteSegments() {
        return this.d;
    }

    public final String getECLevel() {
        return this.e;
    }

    public final Integer getErasures() {
        return this.g;
    }

    public final Integer getErrorsCorrected() {
        return this.f;
    }

    public final int getNumBits() {
        return this.b;
    }

    public final Object getOther() {
        return this.h;
    }

    public final byte[] getRawBytes() {
        return this.a;
    }

    public final int getStructuredAppendParity() {
        return this.i;
    }

    public final int getStructuredAppendSequenceNumber() {
        return this.j;
    }

    public final int getSymbologyModifier() {
        return this.k;
    }

    public final String getText() {
        return this.c;
    }

    public final boolean hasStructuredAppend() {
        return this.i >= 0 && this.j >= 0;
    }

    public final void setErasures(Integer num) {
        this.g = num;
    }

    public final void setErrorsCorrected(Integer num) {
        this.f = num;
    }

    public final void setNumBits(int i) {
        this.b = i;
    }

    public final void setOther(Object obj) {
        this.h = obj;
    }
}
