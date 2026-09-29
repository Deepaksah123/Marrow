package com.google.android.exoplayer2.source.dash.manifest;

import com.google.android.exoplayer2.util.Util;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public final class Descriptor {
    public final String id;
    public final String schemeIdUri;
    public final String value;

    public Descriptor(String str, String str2, String str3) {
        this.schemeIdUri = str;
        this.value = str2;
        this.id = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Descriptor descriptor = (Descriptor) obj;
        return Util.areEqual(this.schemeIdUri, descriptor.schemeIdUri) && Util.areEqual(this.value, descriptor.value) && Util.areEqual(this.id, descriptor.id);
    }

    public final int hashCode() {
        int iHashCode = this.schemeIdUri.hashCode();
        String str = this.value;
        int iHashCode2 = str != null ? str.hashCode() : 0;
        String str2 = this.id;
        return (((iHashCode * 31) + iHashCode2) * 31) + (str2 != null ? str2.hashCode() : 0);
    }
}
