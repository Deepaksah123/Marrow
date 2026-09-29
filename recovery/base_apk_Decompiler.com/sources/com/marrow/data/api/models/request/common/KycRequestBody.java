package com.marrow.data.api.models.request.common;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes.dex */
@JsonIgnoreProperties(ignoreUnknown = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0010\u0010\u000e\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\fJ\u0010\u0010\u0011\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u000fJB\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u000fJ\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\fR\"\u0010\u0019\u001a\u00020\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\f\"\u0004\b\u001c\u0010\u001dR\"\u0010\u001e\u001a\u00020\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001a\u001a\u0004\b\u001f\u0010\f\"\u0004\b \u0010\u001dR\u001a\u0010!\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010\u000fR\u001a\u0010$\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010\u001a\u001a\u0004\b%\u0010\fR\u001a\u0010&\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010\"\u001a\u0004\b'\u0010\u000f"}, d2 = {"Lcom/marrow/data/api/models/request/common/KycRequestBody;", "", "", "p0", "p1", "", "p2", "p3", "p4", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;I)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()I", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;I)Lcom/marrow/data/api/models/request/common/KycRequestBody;", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "base64", "Ljava/lang/String;", "getBase64", "setBase64", "(Ljava/lang/String;)V", "key", "getKey", "setKey", "docType", "I", "getDocType", "docId", "getDocId", "docSide", "getDocSide"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class KycRequestBody {

    @JsonProperty("image")
    private String base64;

    @JsonProperty("doc_id")
    private final String docId;

    @JsonProperty("side")
    private final int docSide;

    @JsonProperty("doc_type")
    private final int docType;

    @JsonProperty("key")
    private String key;

    public KycRequestBody(String str, String str2, int i, String str3, int i2) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        toMagicModuleMetaRepoModel.write(str3, "");
        this.base64 = str;
        this.key = str2;
        this.docType = i;
        this.docId = str3;
        this.docSide = i2;
    }

    public final String getBase64() {
        return this.base64;
    }

    public final void setBase64(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        this.base64 = str;
    }

    public final String getKey() {
        return this.key;
    }

    public final void setKey(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        this.key = str;
    }

    public final int getDocType() {
        return this.docType;
    }

    public final String getDocId() {
        return this.docId;
    }

    public final int getDocSide() {
        return this.docSide;
    }

    public static /* synthetic */ KycRequestBody copy$default(KycRequestBody kycRequestBody, String str, String str2, int i, String str3, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = kycRequestBody.base64;
        }
        if ((i3 & 2) != 0) {
            str2 = kycRequestBody.key;
        }
        String str4 = str2;
        if ((i3 & 4) != 0) {
            i = kycRequestBody.docType;
        }
        int i4 = i;
        if ((i3 & 8) != 0) {
            str3 = kycRequestBody.docId;
        }
        String str5 = str3;
        if ((i3 & 16) != 0) {
            i2 = kycRequestBody.docSide;
        }
        return kycRequestBody.copy(str, str4, i4, str5, i2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getBase64() {
        return this.base64;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getKey() {
        return this.key;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getDocType() {
        return this.docType;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getDocId() {
        return this.docId;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getDocSide() {
        return this.docSide;
    }

    public final KycRequestBody copy(String p0, String p1, int p2, String p3, int p4) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        toMagicModuleMetaRepoModel.write(p3, "");
        return new KycRequestBody(p0, p1, p2, p3, p4);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof KycRequestBody)) {
            return false;
        }
        KycRequestBody kycRequestBody = (KycRequestBody) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.base64, (Object) kycRequestBody.base64) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.key, (Object) kycRequestBody.key) && this.docType == kycRequestBody.docType && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.docId, (Object) kycRequestBody.docId) && this.docSide == kycRequestBody.docSide;
    }

    public final int hashCode() {
        return (((((((this.base64.hashCode() * 31) + this.key.hashCode()) * 31) + Integer.hashCode(this.docType)) * 31) + this.docId.hashCode()) * 31) + Integer.hashCode(this.docSide);
    }

    public final String toString() {
        String str = this.base64;
        String str2 = this.key;
        int i = this.docType;
        String str3 = this.docId;
        int i2 = this.docSide;
        StringBuilder sb = new StringBuilder("KycRequestBody(base64=");
        sb.append(str);
        sb.append(", key=");
        sb.append(str2);
        sb.append(", docType=");
        sb.append(i);
        sb.append(", docId=");
        sb.append(str3);
        sb.append(", docSide=");
        sb.append(i2);
        sb.append(")");
        return sb.toString();
    }
}
