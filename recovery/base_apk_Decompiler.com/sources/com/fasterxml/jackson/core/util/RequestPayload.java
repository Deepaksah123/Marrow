package com.fasterxml.jackson.core.util;

import java.io.IOException;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public class RequestPayload implements Serializable {
    protected String _charset;
    protected byte[] _payloadAsBytes;
    protected CharSequence _payloadAsText;

    public String toString() {
        byte[] bArr = this._payloadAsBytes;
        if (bArr != null) {
            try {
                return new String(bArr, this._charset);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return this._payloadAsText.toString();
    }
}
