package com.marrow2.data.user.remote.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.marrow.data.api.models.response.user.LoggedUserResponse;
import kotlin.Metadata;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes.dex */
@JsonIgnoreProperties(ignoreUnknown = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\tR\u0017\u0010\u0015\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0018\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/marrow2/data/user/remote/model/ImageTokenRSModel;", "", "", "p0", "", "p1", "<init>", "(Ljava/lang/String;J)V", "component1", "()Ljava/lang/String;", "component2", "()J", "copy", "(Ljava/lang/String;J)Lcom/marrow2/data/user/remote/model/ImageTokenRSModel;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", LoggedUserResponse.KEY_TOKEN, "Ljava/lang/String;", "getToken", "expiryTimestamp", "J", "getExpiryTimestamp"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ImageTokenRSModel {
    public static final int $stable = 0;
    private final long expiryTimestamp;
    private final String token;

    public ImageTokenRSModel(@JsonProperty(LoggedUserResponse.KEY_TOKEN) String str, @JsonProperty("expiry") long j) {
        toMagicModuleMetaRepoModel.write(str, "");
        this.token = str;
        this.expiryTimestamp = j;
    }

    public final String getToken() {
        return this.token;
    }

    public final long getExpiryTimestamp() {
        return this.expiryTimestamp;
    }

    public static /* synthetic */ ImageTokenRSModel copy$default(ImageTokenRSModel imageTokenRSModel, String str, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = imageTokenRSModel.token;
        }
        if ((i & 2) != 0) {
            j = imageTokenRSModel.expiryTimestamp;
        }
        return imageTokenRSModel.copy(str, j);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getToken() {
        return this.token;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getExpiryTimestamp() {
        return this.expiryTimestamp;
    }

    public final ImageTokenRSModel copy(@JsonProperty(LoggedUserResponse.KEY_TOKEN) String p0, @JsonProperty("expiry") long p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return new ImageTokenRSModel(p0, p1);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof ImageTokenRSModel)) {
            return false;
        }
        ImageTokenRSModel imageTokenRSModel = (ImageTokenRSModel) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.token, (Object) imageTokenRSModel.token) && this.expiryTimestamp == imageTokenRSModel.expiryTimestamp;
    }

    public final int hashCode() {
        return (this.token.hashCode() * 31) + Long.hashCode(this.expiryTimestamp);
    }

    public final String toString() {
        String str = this.token;
        long j = this.expiryTimestamp;
        StringBuilder sb = new StringBuilder("ImageTokenRSModel(token=");
        sb.append(str);
        sb.append(", expiryTimestamp=");
        sb.append(j);
        sb.append(")");
        return sb.toString();
    }
}
