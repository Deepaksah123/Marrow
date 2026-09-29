package com.marrow.data.api.models.response.common;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import kotlin.MagicModuleRepositoryImplExternalSyntheticLambda0;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@JsonIgnoreProperties(ignoreUnknown = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u000b\u001a\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\"\u0010\u0013\u001a\u00020\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0007\"\u0004\b\u0015\u0010\u0005"}, d2 = {"Lcom/marrow/data/api/models/response/common/AttestationResponseBody;", "Ljava/io/Serializable;", "", "p0", "<init>", "(Z)V", "component1", "()Z", "copy", "(Z)Lcom/marrow/data/api/models/response/common/AttestationResponseBody;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "isAccepted", "Z", "setAccepted"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AttestationResponseBody implements Serializable {
    private boolean isAccepted;

    public AttestationResponseBody(@JsonProperty("accepted") boolean z) {
        this.isAccepted = z;
    }

    public /* synthetic */ AttestationResponseBody(boolean z, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i & 1) != 0 ? false : z);
    }

    public final boolean isAccepted() {
        return this.isAccepted;
    }

    public final void setAccepted(boolean z) {
        this.isAccepted = z;
    }

    public AttestationResponseBody() {
        this(false, 1, null);
    }

    public static /* synthetic */ AttestationResponseBody copy$default(AttestationResponseBody attestationResponseBody, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = attestationResponseBody.isAccepted;
        }
        return attestationResponseBody.copy(z);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getIsAccepted() {
        return this.isAccepted;
    }

    public final AttestationResponseBody copy(@JsonProperty("accepted") boolean p0) {
        return new AttestationResponseBody(p0);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        return (p0 instanceof AttestationResponseBody) && this.isAccepted == ((AttestationResponseBody) p0).isAccepted;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.isAccepted);
    }

    public final String toString() {
        boolean z = this.isAccepted;
        StringBuilder sb = new StringBuilder("AttestationResponseBody(isAccepted=");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }
}
