package com.marrow2.data.user.remote.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes.dex */
@JsonIgnoreProperties(ignoreUnknown = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\bR\u001a\u0010\u0013\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\bR\u001a\u0010\u0016\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/marrow2/data/user/remote/model/ProCallbackRSModel;", "", "", "p0", "p1", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/marrow2/data/user/remote/model/ProCallbackRSModel;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "id", "Ljava/lang/String;", "getId", "message", "getMessage"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ProCallbackRSModel {
    public static final int $stable = 0;
    private final String id;
    private final String message;

    public ProCallbackRSModel(@JsonProperty("_id") String str, @JsonProperty("msg") String str2) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        this.id = str;
        this.message = str2;
    }

    public final String getId() {
        return this.id;
    }

    public final String getMessage() {
        return this.message;
    }

    public static /* synthetic */ ProCallbackRSModel copy$default(ProCallbackRSModel proCallbackRSModel, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = proCallbackRSModel.id;
        }
        if ((i & 2) != 0) {
            str2 = proCallbackRSModel.message;
        }
        return proCallbackRSModel.copy(str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    public final ProCallbackRSModel copy(@JsonProperty("_id") String p0, @JsonProperty("msg") String p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        return new ProCallbackRSModel(p0, p1);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof ProCallbackRSModel)) {
            return false;
        }
        ProCallbackRSModel proCallbackRSModel = (ProCallbackRSModel) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.id, (Object) proCallbackRSModel.id) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.message, (Object) proCallbackRSModel.message);
    }

    public final int hashCode() {
        return (this.id.hashCode() * 31) + this.message.hashCode();
    }

    public final String toString() {
        String str = this.id;
        String str2 = this.message;
        StringBuilder sb = new StringBuilder("ProCallbackRSModel(id=");
        sb.append(str);
        sb.append(", message=");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }
}
