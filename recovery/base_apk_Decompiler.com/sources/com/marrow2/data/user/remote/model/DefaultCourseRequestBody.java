package com.marrow2.data.user.remote.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.MagicModuleRepositoryImplExternalSyntheticLambda0;
import kotlin.Metadata;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes.dex */
@JsonIgnoreProperties(ignoreUnknown = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0007R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0007"}, d2 = {"Lcom/marrow2/data/user/remote/model/DefaultCourseRequestBody;", "", "", "p0", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/marrow2/data/user/remote/model/DefaultCourseRequestBody;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "defaultCourseId", "Ljava/lang/String;", "getDefaultCourseId"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DefaultCourseRequestBody {
    public static final int $stable = 0;

    @JsonProperty("default_course_id")
    private final String defaultCourseId;

    public DefaultCourseRequestBody(String str) {
        this.defaultCourseId = str;
    }

    public /* synthetic */ DefaultCourseRequestBody(String str, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i & 1) != 0 ? null : str);
    }

    public final String getDefaultCourseId() {
        return this.defaultCourseId;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DefaultCourseRequestBody() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ DefaultCourseRequestBody copy$default(DefaultCourseRequestBody defaultCourseRequestBody, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = defaultCourseRequestBody.defaultCourseId;
        }
        return defaultCourseRequestBody.copy(str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDefaultCourseId() {
        return this.defaultCourseId;
    }

    public final DefaultCourseRequestBody copy(String p0) {
        return new DefaultCourseRequestBody(p0);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        return (p0 instanceof DefaultCourseRequestBody) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.defaultCourseId, (Object) ((DefaultCourseRequestBody) p0).defaultCourseId);
    }

    public final int hashCode() {
        String str = this.defaultCourseId;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        String str = this.defaultCourseId;
        StringBuilder sb = new StringBuilder("DefaultCourseRequestBody(defaultCourseId=");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }
}
