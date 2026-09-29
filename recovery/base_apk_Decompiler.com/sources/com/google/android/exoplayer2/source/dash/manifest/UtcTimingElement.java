package com.google.android.exoplayer2.source.dash.manifest;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public final class UtcTimingElement {
    public final String schemeIdUri;
    public final String value;

    public UtcTimingElement(String str, String str2) {
        this.schemeIdUri = str;
        this.value = str2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.schemeIdUri);
        sb.append(", ");
        sb.append(this.value);
        return sb.toString();
    }
}
