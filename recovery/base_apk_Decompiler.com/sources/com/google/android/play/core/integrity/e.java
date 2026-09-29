package com.google.android.play.core.integrity;

import com.google.android.play.core.integrity.StandardIntegrityManager;

/* JADX INFO: loaded from: classes5.dex */
final class e extends StandardIntegrityManager.PrepareIntegrityTokenRequest {
    private final long a;

    @Override // com.google.android.play.core.integrity.StandardIntegrityManager.PrepareIntegrityTokenRequest
    final int a() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof StandardIntegrityManager.PrepareIntegrityTokenRequest)) {
            return false;
        }
        StandardIntegrityManager.PrepareIntegrityTokenRequest prepareIntegrityTokenRequest = (StandardIntegrityManager.PrepareIntegrityTokenRequest) obj;
        if (this.a != prepareIntegrityTokenRequest.b()) {
            return false;
        }
        prepareIntegrityTokenRequest.a();
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PrepareIntegrityTokenRequest{cloudProjectNumber=");
        sb.append(this.a);
        sb.append(", webViewRequestMode=0}");
        return sb.toString();
    }

    /* synthetic */ e(long j, int i, d dVar) {
        this.a = j;
    }

    @Override // com.google.android.play.core.integrity.StandardIntegrityManager.PrepareIntegrityTokenRequest
    public final long b() {
        return this.a;
    }

    public final int hashCode() {
        long j = this.a;
        return (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
    }
}
