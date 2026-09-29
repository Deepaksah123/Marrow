package com.marrow.data.api.models.response.payment;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.isFirst;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes.dex */
@JsonIgnoreProperties(ignoreUnknown = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ4\u0010\u000e\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\nR\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0018\u001a\u0004\b\u001b\u0010\nR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\r"}, d2 = {"Lcom/marrow/data/api/models/response/payment/SdkPayload;", "", "", "p0", "p1", "Lcom/marrow/data/api/models/response/payment/Payload;", "p2", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/marrow/data/api/models/response/payment/Payload;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/marrow/data/api/models/response/payment/Payload;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/marrow/data/api/models/response/payment/Payload;)Lcom/marrow/data/api/models/response/payment/SdkPayload;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", SdkPayloadKt.KEY_JP_REQUEST_ID, "Ljava/lang/String;", "getRequestId", "service", "getService", "payload", "Lcom/marrow/data/api/models/response/payment/Payload;", "getPayload"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SdkPayload {

    @isFirst(RemoteActionCompatParcelizer = "payload")
    private final Payload payload;

    @isFirst(RemoteActionCompatParcelizer = SdkPayloadKt.KEY_JP_REQUEST_ID)
    private final String requestId;

    @isFirst(RemoteActionCompatParcelizer = "service")
    private final String service;

    public SdkPayload(@JsonProperty(SdkPayloadKt.KEY_JP_REQUEST_ID) String str, @JsonProperty("service") String str2, @JsonProperty("payload") Payload payload) {
        this.requestId = str;
        this.service = str2;
        this.payload = payload;
    }

    public final String getRequestId() {
        return this.requestId;
    }

    public final String getService() {
        return this.service;
    }

    public final Payload getPayload() {
        return this.payload;
    }

    public static /* synthetic */ SdkPayload copy$default(SdkPayload sdkPayload, String str, String str2, Payload payload, int i, Object obj) {
        if ((i & 1) != 0) {
            str = sdkPayload.requestId;
        }
        if ((i & 2) != 0) {
            str2 = sdkPayload.service;
        }
        if ((i & 4) != 0) {
            payload = sdkPayload.payload;
        }
        return sdkPayload.copy(str, str2, payload);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getRequestId() {
        return this.requestId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getService() {
        return this.service;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Payload getPayload() {
        return this.payload;
    }

    public final SdkPayload copy(@JsonProperty(SdkPayloadKt.KEY_JP_REQUEST_ID) String p0, @JsonProperty("service") String p1, @JsonProperty("payload") Payload p2) {
        return new SdkPayload(p0, p1, p2);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof SdkPayload)) {
            return false;
        }
        SdkPayload sdkPayload = (SdkPayload) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.requestId, (Object) sdkPayload.requestId) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.service, (Object) sdkPayload.service) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.payload, sdkPayload.payload);
    }

    public final int hashCode() {
        String str = this.requestId;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.service;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        Payload payload = this.payload;
        return (((iHashCode * 31) + iHashCode2) * 31) + (payload != null ? payload.hashCode() : 0);
    }

    public final String toString() {
        String str = this.requestId;
        String str2 = this.service;
        Payload payload = this.payload;
        StringBuilder sb = new StringBuilder("SdkPayload(requestId=");
        sb.append(str);
        sb.append(", service=");
        sb.append(str2);
        sb.append(", payload=");
        sb.append(payload);
        sb.append(")");
        return sb.toString();
    }
}
