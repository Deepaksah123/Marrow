package com.marrow2.data.course_config.remote.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import kotlin.MagicModuleRepositoryImplExternalSyntheticLambda0;
import kotlin.Metadata;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes.dex */
@JsonIgnoreProperties(ignoreUnknown = true)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ(\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\u0003\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\bR\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0018\u0010\b"}, d2 = {"Lcom/marrow2/data/course_config/remote/model/AuthorRSModel;", "Ljava/io/Serializable;", "", "p0", "p1", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/marrow2/data/course_config/remote/model/AuthorRSModel;", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "name", "Ljava/lang/String;", "getName", "imageUrl", "getImageUrl"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AuthorRSModel implements Serializable {
    public static final int $stable = 0;
    private final String imageUrl;
    private final String name;

    public AuthorRSModel(String str, String str2) {
        this.name = str;
        this.imageUrl = str2;
    }

    public /* synthetic */ AuthorRSModel(String str, String str2, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }

    @JsonProperty("name")
    public final String getName() {
        return this.name;
    }

    @JsonProperty("image")
    public final String getImageUrl() {
        return this.imageUrl;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AuthorRSModel() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ AuthorRSModel copy$default(AuthorRSModel authorRSModel, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = authorRSModel.name;
        }
        if ((i & 2) != 0) {
            str2 = authorRSModel.imageUrl;
        }
        return authorRSModel.copy(str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final AuthorRSModel copy(String p0, String p1) {
        return new AuthorRSModel(p0, p1);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof AuthorRSModel)) {
            return false;
        }
        AuthorRSModel authorRSModel = (AuthorRSModel) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.name, (Object) authorRSModel.name) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.imageUrl, (Object) authorRSModel.imageUrl);
    }

    public final int hashCode() {
        String str = this.name;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.imageUrl;
        return (iHashCode * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        String str = this.name;
        String str2 = this.imageUrl;
        StringBuilder sb = new StringBuilder("AuthorRSModel(name=");
        sb.append(str);
        sb.append(", imageUrl=");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }
}
