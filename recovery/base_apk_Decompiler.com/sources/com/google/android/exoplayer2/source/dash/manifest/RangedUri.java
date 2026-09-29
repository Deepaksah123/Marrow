package com.google.android.exoplayer2.source.dash.manifest;

import android.net.Uri;
import com.google.android.exoplayer2.util.UriUtil;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public final class RangedUri {
    private int hashCode;
    public final long length;
    private final String referenceUri;
    public final long start;

    public RangedUri(String str, long j, long j2) {
        this.referenceUri = str == null ? "" : str;
        this.start = j;
        this.length = j2;
    }

    public final Uri resolveUri(String str) {
        return UriUtil.resolveToUri(str, this.referenceUri);
    }

    public final String resolveUriString(String str) {
        return UriUtil.resolve(str, this.referenceUri);
    }

    public final RangedUri attemptMerge(RangedUri rangedUri, String str) {
        String strResolveUriString = resolveUriString(str);
        if (rangedUri == null || !strResolveUriString.equals(rangedUri.resolveUriString(str))) {
            return null;
        }
        long j = this.length;
        if (j != -1) {
            long j2 = this.start;
            if (j2 + j == rangedUri.start) {
                long j3 = rangedUri.length;
                return new RangedUri(strResolveUriString, j2, j3 != -1 ? j + j3 : -1L);
            }
        }
        long j4 = rangedUri.length;
        if (j4 == -1) {
            return null;
        }
        long j5 = rangedUri.start;
        if (j5 + j4 == this.start) {
            return new RangedUri(strResolveUriString, j5, j != -1 ? j4 + j : -1L);
        }
        return null;
    }

    public final int hashCode() {
        if (this.hashCode == 0) {
            int i = (int) this.start;
            this.hashCode = ((((i + 527) * 31) + ((int) this.length)) * 31) + this.referenceUri.hashCode();
        }
        return this.hashCode;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RangedUri rangedUri = (RangedUri) obj;
        return this.start == rangedUri.start && this.length == rangedUri.length && this.referenceUri.equals(rangedUri.referenceUri);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RangedUri(referenceUri=");
        sb.append(this.referenceUri);
        sb.append(", start=");
        sb.append(this.start);
        sb.append(", length=");
        sb.append(this.length);
        sb.append(")");
        return sb.toString();
    }
}
