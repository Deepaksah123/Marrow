package com.marrow2.data.test.remote.model;

import java.util.List;
import kotlin.IntermediateLoginResponseBody;
import kotlin.MagicModuleRepositoryImplExternalSyntheticLambda0;
import kotlin.Metadata;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ0\u0010\f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\nR \u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0018\u001a\u0004\b\u001b\u0010\n"}, d2 = {"Lcom/marrow2/data/test/remote/model/GTAnalyticsV2RSModel;", "", "", "Lcom/marrow2/data/test/remote/model/TestProgressV2RSModel;", "p0", "Lcom/marrow2/data/test/remote/model/SubjectStatV2RSModel;", "p1", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "component1", "()Ljava/util/List;", "component2", "copy", "(Ljava/util/List;Ljava/util/List;)Lcom/marrow2/data/test/remote/model/GTAnalyticsV2RSModel;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "testProgressData", "Ljava/util/List;", "getTestProgressData", "subjectStat", "getSubjectStat"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class GTAnalyticsV2RSModel {
    public static final int $stable = 8;
    private final List<SubjectStatV2RSModel> subjectStat;
    private final List<TestProgressV2RSModel> testProgressData;

    public GTAnalyticsV2RSModel(List<TestProgressV2RSModel> list, List<SubjectStatV2RSModel> list2) {
        toMagicModuleMetaRepoModel.write(list, "");
        toMagicModuleMetaRepoModel.write(list2, "");
        this.testProgressData = list;
        this.subjectStat = list2;
    }

    public /* synthetic */ GTAnalyticsV2RSModel(List list, List list2, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i & 1) != 0 ? IntermediateLoginResponseBody.RemoteActionCompatParcelizer() : list, (i & 2) != 0 ? IntermediateLoginResponseBody.RemoteActionCompatParcelizer() : list2);
    }

    public final List<TestProgressV2RSModel> getTestProgressData() {
        return this.testProgressData;
    }

    public final List<SubjectStatV2RSModel> getSubjectStat() {
        return this.subjectStat;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public GTAnalyticsV2RSModel() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GTAnalyticsV2RSModel copy$default(GTAnalyticsV2RSModel gTAnalyticsV2RSModel, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = gTAnalyticsV2RSModel.testProgressData;
        }
        if ((i & 2) != 0) {
            list2 = gTAnalyticsV2RSModel.subjectStat;
        }
        return gTAnalyticsV2RSModel.copy(list, list2);
    }

    public final List<TestProgressV2RSModel> component1() {
        return this.testProgressData;
    }

    public final List<SubjectStatV2RSModel> component2() {
        return this.subjectStat;
    }

    public final GTAnalyticsV2RSModel copy(List<TestProgressV2RSModel> p0, List<SubjectStatV2RSModel> p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        return new GTAnalyticsV2RSModel(p0, p1);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof GTAnalyticsV2RSModel)) {
            return false;
        }
        GTAnalyticsV2RSModel gTAnalyticsV2RSModel = (GTAnalyticsV2RSModel) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.testProgressData, gTAnalyticsV2RSModel.testProgressData) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.subjectStat, gTAnalyticsV2RSModel.subjectStat);
    }

    public final int hashCode() {
        return (this.testProgressData.hashCode() * 31) + this.subjectStat.hashCode();
    }

    public final String toString() {
        List<TestProgressV2RSModel> list = this.testProgressData;
        List<SubjectStatV2RSModel> list2 = this.subjectStat;
        StringBuilder sb = new StringBuilder("GTAnalyticsV2RSModel(testProgressData=");
        sb.append(list);
        sb.append(", subjectStat=");
        sb.append(list2);
        sb.append(")");
        return sb.toString();
    }
}
