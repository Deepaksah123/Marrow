package com.marrow2.data.test.remote.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.marrow.data.models.custommodule.FilterParams;
import kotlin.MagicModuleRepositoryImplExternalSyntheticLambda0;
import kotlin.Metadata;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes.dex */
@JsonIgnoreProperties(ignoreUnknown = true)
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u000bJ\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\tR\u001a\u0010\u0013\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\tR\u001a\u0010\u0016\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u000b"}, d2 = {"Lcom/marrow2/data/test/remote/model/GTNudgeRequestModel;", "", "", "p0", "", "p1", "<init>", "(Ljava/lang/String;I)V", "component1", "()Ljava/lang/String;", "component2", "()I", "copy", "(Ljava/lang/String;I)Lcom/marrow2/data/test/remote/model/GTNudgeRequestModel;", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "testId", "Ljava/lang/String;", "getTestId", "courseId", "I", "getCourseId"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class GTNudgeRequestModel {
    public static final int $stable = 0;

    @JsonProperty(FilterParams.KEY_COURSE_ID)
    private final int courseId;

    @JsonProperty("test_id")
    private final String testId;

    public GTNudgeRequestModel(String str, int i) {
        toMagicModuleMetaRepoModel.write(str, "");
        this.testId = str;
        this.courseId = i;
    }

    public /* synthetic */ GTNudgeRequestModel(String str, int i, int i2, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? 0 : i);
    }

    public final String getTestId() {
        return this.testId;
    }

    public final int getCourseId() {
        return this.courseId;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public GTNudgeRequestModel() {
        this(null, 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ GTNudgeRequestModel copy$default(GTNudgeRequestModel gTNudgeRequestModel, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = gTNudgeRequestModel.testId;
        }
        if ((i2 & 2) != 0) {
            i = gTNudgeRequestModel.courseId;
        }
        return gTNudgeRequestModel.copy(str, i);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTestId() {
        return this.testId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getCourseId() {
        return this.courseId;
    }

    public final GTNudgeRequestModel copy(String p0, int p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return new GTNudgeRequestModel(p0, p1);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof GTNudgeRequestModel)) {
            return false;
        }
        GTNudgeRequestModel gTNudgeRequestModel = (GTNudgeRequestModel) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.testId, (Object) gTNudgeRequestModel.testId) && this.courseId == gTNudgeRequestModel.courseId;
    }

    public final int hashCode() {
        return (this.testId.hashCode() * 31) + Integer.hashCode(this.courseId);
    }

    public final String toString() {
        String str = this.testId;
        int i = this.courseId;
        StringBuilder sb = new StringBuilder("GTNudgeRequestModel(testId=");
        sb.append(str);
        sb.append(", courseId=");
        sb.append(i);
        sb.append(")");
        return sb.toString();
    }
}
