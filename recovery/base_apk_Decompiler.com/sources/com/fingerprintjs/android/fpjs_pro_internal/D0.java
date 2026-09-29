package com.fingerprintjs.android.fpjs_pro_internal;

/* JADX INFO: loaded from: classes2.dex */
public final class D0 {
    public final long AudioAttributesCompatParcelizer;
    public final long IconCompatParcelizer;
    public final long read;

    public D0(long j, long j2, long j3) {
        this.read = j;
        this.AudioAttributesCompatParcelizer = j2;
        this.IconCompatParcelizer = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof D0)) {
            return false;
        }
        D0 d0 = (D0) obj;
        return this.read == d0.read && this.AudioAttributesCompatParcelizer == d0.AudioAttributesCompatParcelizer && this.IconCompatParcelizer == d0.IconCompatParcelizer;
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.read);
        return Long.hashCode(this.IconCompatParcelizer) + ((Long.hashCode(this.AudioAttributesCompatParcelizer) + (iHashCode * 31)) * 31);
    }

    public final String toString() {
        return "";
    }
}
