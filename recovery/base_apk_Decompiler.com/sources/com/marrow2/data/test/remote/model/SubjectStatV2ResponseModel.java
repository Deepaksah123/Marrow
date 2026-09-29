package com.marrow2.data.test.remote.model;

import kotlin.MagicModuleRepositoryImplExternalSyntheticLambda0;
import kotlin.Metadata;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\rJ\u0010\u0010\u0011\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u000fJ\u0010\u0010\u0012\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013JB\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0013J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\rR\u0017\u0010\u001b\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u001a\u0010\u001e\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\u000fR\u001a\u0010!\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\u001c\u001a\u0004\b\"\u0010\rR\u001a\u0010#\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010\u001f\u001a\u0004\b$\u0010\u000fR\u001a\u0010%\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010\u0013"}, d2 = {"Lcom/marrow2/data/test/remote/model/SubjectStatV2ResponseModel;", "", "", "p0", "", "p1", "p2", "p3", "", "p4", "<init>", "(Ljava/lang/String;DLjava/lang/String;DI)V", "component1", "()Ljava/lang/String;", "component2", "()D", "component3", "component4", "component5", "()I", "copy", "(Ljava/lang/String;DLjava/lang/String;DI)Lcom/marrow2/data/test/remote/model/SubjectStatV2ResponseModel;", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "subjectId", "Ljava/lang/String;", "getSubjectId", "percentage", "D", "getPercentage", "title", "getTitle", "percentile", "getPercentile", "totalCount", "I", "getTotalCount"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SubjectStatV2ResponseModel {
    public static final int $stable = 0;
    private final double percentage;
    private final double percentile;
    private final String subjectId;
    private final String title;
    private final int totalCount;

    public SubjectStatV2ResponseModel(String str, double d, String str2, double d2, int i) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        this.subjectId = str;
        this.percentage = d;
        this.title = str2;
        this.percentile = d2;
        this.totalCount = i;
    }

    public /* synthetic */ SubjectStatV2ResponseModel(String str, double d, String str2, double d2, int i, int i2, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? 0.0d : d, (i2 & 4) != 0 ? "" : str2, (i2 & 8) != 0 ? 0.0d : d2, (i2 & 16) != 0 ? 0 : i);
    }

    public final String getSubjectId() {
        return this.subjectId;
    }

    public final double getPercentage() {
        return this.percentage;
    }

    public final String getTitle() {
        return this.title;
    }

    public final double getPercentile() {
        return this.percentile;
    }

    public final int getTotalCount() {
        return this.totalCount;
    }

    public SubjectStatV2ResponseModel() {
        this(null, 0.0d, null, 0.0d, 0, 31, null);
    }

    public static /* synthetic */ SubjectStatV2ResponseModel copy$default(SubjectStatV2ResponseModel subjectStatV2ResponseModel, String str, double d, String str2, double d2, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = subjectStatV2ResponseModel.subjectId;
        }
        if ((i2 & 2) != 0) {
            d = subjectStatV2ResponseModel.percentage;
        }
        double d3 = d;
        if ((i2 & 4) != 0) {
            str2 = subjectStatV2ResponseModel.title;
        }
        String str3 = str2;
        if ((i2 & 8) != 0) {
            d2 = subjectStatV2ResponseModel.percentile;
        }
        double d4 = d2;
        if ((i2 & 16) != 0) {
            i = subjectStatV2ResponseModel.totalCount;
        }
        return subjectStatV2ResponseModel.copy(str, d3, str3, d4, i);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSubjectId() {
        return this.subjectId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final double getPercentage() {
        return this.percentage;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final double getPercentile() {
        return this.percentile;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getTotalCount() {
        return this.totalCount;
    }

    public final SubjectStatV2ResponseModel copy(String p0, double p1, String p2, double p3, int p4) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p2, "");
        return new SubjectStatV2ResponseModel(p0, p1, p2, p3, p4);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof SubjectStatV2ResponseModel)) {
            return false;
        }
        SubjectStatV2ResponseModel subjectStatV2ResponseModel = (SubjectStatV2ResponseModel) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.subjectId, (Object) subjectStatV2ResponseModel.subjectId) && Double.compare(this.percentage, subjectStatV2ResponseModel.percentage) == 0 && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.title, (Object) subjectStatV2ResponseModel.title) && Double.compare(this.percentile, subjectStatV2ResponseModel.percentile) == 0 && this.totalCount == subjectStatV2ResponseModel.totalCount;
    }

    public final int hashCode() {
        return (((((((this.subjectId.hashCode() * 31) + Double.hashCode(this.percentage)) * 31) + this.title.hashCode()) * 31) + Double.hashCode(this.percentile)) * 31) + Integer.hashCode(this.totalCount);
    }

    public final String toString() {
        String str = this.subjectId;
        double d = this.percentage;
        String str2 = this.title;
        double d2 = this.percentile;
        int i = this.totalCount;
        StringBuilder sb = new StringBuilder("SubjectStatV2ResponseModel(subjectId=");
        sb.append(str);
        sb.append(", percentage=");
        sb.append(d);
        sb.append(", title=");
        sb.append(str2);
        sb.append(", percentile=");
        sb.append(d2);
        sb.append(", totalCount=");
        sb.append(i);
        sb.append(")");
        return sb.toString();
    }
}
