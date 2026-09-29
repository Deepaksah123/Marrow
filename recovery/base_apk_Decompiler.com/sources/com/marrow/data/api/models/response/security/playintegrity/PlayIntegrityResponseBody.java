package com.marrow.data.api.models.response.security.playintegrity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import kotlin.MagicModuleRepositoryImplExternalSyntheticLambda0;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@JsonIgnoreProperties(ignoreUnknown = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\r\u001a\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0017\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0016"}, d2 = {"Lcom/marrow/data/api/models/response/security/playintegrity/PlayIntegrityResponseBody;", "Ljava/io/Serializable;", "", "p0", "p1", "<init>", "(ZZ)V", "component1", "()Z", "component2", "copy", "(ZZ)Lcom/marrow/data/api/models/response/security/playintegrity/PlayIntegrityResponseBody;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "isAccepted", "Z", "isAllowed"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PlayIntegrityResponseBody implements Serializable {
    public boolean isAccepted;
    public boolean isAllowed;

    public PlayIntegrityResponseBody(@JsonProperty("accepted") boolean z, @JsonProperty("allowed") boolean z2) {
        this.isAccepted = z;
        this.isAllowed = z2;
    }

    public /* synthetic */ PlayIntegrityResponseBody(boolean z, boolean z2, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public PlayIntegrityResponseBody() {
        boolean z = false;
        this(z, z, 3, null);
    }

    public static /* synthetic */ PlayIntegrityResponseBody copy$default(PlayIntegrityResponseBody playIntegrityResponseBody, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = playIntegrityResponseBody.isAccepted;
        }
        if ((i & 2) != 0) {
            z2 = playIntegrityResponseBody.isAllowed;
        }
        return playIntegrityResponseBody.copy(z, z2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getIsAccepted() {
        return this.isAccepted;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getIsAllowed() {
        return this.isAllowed;
    }

    public final PlayIntegrityResponseBody copy(@JsonProperty("accepted") boolean p0, @JsonProperty("allowed") boolean p1) {
        return new PlayIntegrityResponseBody(p0, p1);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof PlayIntegrityResponseBody)) {
            return false;
        }
        PlayIntegrityResponseBody playIntegrityResponseBody = (PlayIntegrityResponseBody) p0;
        return this.isAccepted == playIntegrityResponseBody.isAccepted && this.isAllowed == playIntegrityResponseBody.isAllowed;
    }

    public final int hashCode() {
        return (Boolean.hashCode(this.isAccepted) * 31) + Boolean.hashCode(this.isAllowed);
    }

    public final String toString() {
        boolean z = this.isAccepted;
        boolean z2 = this.isAllowed;
        StringBuilder sb = new StringBuilder("PlayIntegrityResponseBody(isAccepted=");
        sb.append(z);
        sb.append(", isAllowed=");
        sb.append(z2);
        sb.append(")");
        return sb.toString();
    }
}
