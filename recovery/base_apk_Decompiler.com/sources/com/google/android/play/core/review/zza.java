package com.google.android.play.core.review;

import android.app.PendingIntent;

/* JADX INFO: loaded from: classes3.dex */
public final class zza extends ReviewInfo {
    private final PendingIntent RemoteActionCompatParcelizer;
    private final boolean read;

    public zza(PendingIntent pendingIntent, boolean z) {
        if (pendingIntent == null) {
            throw new NullPointerException("Null pendingIntent");
        }
        this.RemoteActionCompatParcelizer = pendingIntent;
        this.read = z;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ReviewInfo)) {
            return false;
        }
        ReviewInfo reviewInfo = (ReviewInfo) obj;
        return this.RemoteActionCompatParcelizer.equals(reviewInfo.RemoteActionCompatParcelizer()) && this.read == reviewInfo.read();
    }

    public final int hashCode() {
        return (true != this.read ? 1237 : 1231) ^ ((this.RemoteActionCompatParcelizer.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        String string = this.RemoteActionCompatParcelizer.toString();
        boolean z = this.read;
        StringBuilder sb = new StringBuilder("ReviewInfo{pendingIntent=");
        sb.append(string);
        sb.append(", isNoOp=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.play.core.review.ReviewInfo
    public final PendingIntent RemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.play.core.review.ReviewInfo
    public final boolean read() {
        return this.read;
    }
}
