package com.google.android.play.core.integrity;

import com.google.android.play.core.integrity.StandardIntegrityManager;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
final class h extends StandardIntegrityManager.StandardIntegrityTokenRequest {
    private final String a;
    private final Set b;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof StandardIntegrityManager.StandardIntegrityTokenRequest)) {
            return false;
        }
        StandardIntegrityManager.StandardIntegrityTokenRequest standardIntegrityTokenRequest = (StandardIntegrityManager.StandardIntegrityTokenRequest) obj;
        String str = this.a;
        if (str == null) {
            if (standardIntegrityTokenRequest.requestHash() != null) {
                return false;
            }
        } else if (!str.equals(standardIntegrityTokenRequest.requestHash())) {
            return false;
        }
        return this.b.equals(standardIntegrityTokenRequest.verdictOptOut());
    }

    public final String toString() {
        String string = this.b.toString();
        StringBuilder sb = new StringBuilder("StandardIntegrityTokenRequest{requestHash=");
        sb.append(this.a);
        sb.append(", verdictOptOut=");
        sb.append(string);
        sb.append("}");
        return sb.toString();
    }

    public final int hashCode() {
        String str = this.a;
        return this.b.hashCode() ^ (((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003);
    }

    /* synthetic */ h(String str, Set set, g gVar) {
        this.a = str;
        this.b = set;
    }

    @Override // com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityTokenRequest
    public final String requestHash() {
        return this.a;
    }

    @Override // com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityTokenRequest
    public final Set<Integer> verdictOptOut() {
        return this.b;
    }
}
