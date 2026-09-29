package com.marrow2.data.test.remote.model;

import java.util.List;
import kotlin.IntermediateLoginResponseBody;
import kotlin.MagicModuleRepositoryImplExternalSyntheticLambda0;
import kotlin.Metadata;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ2\u0010\f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\"\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0018\u001a\u0004\b\u001b\u0010\n"}, d2 = {"Lcom/marrow2/data/test/remote/model/GTSubjectAnalyticsV2RSModel;", "", "", "Lcom/marrow2/data/test/remote/model/TestProgressV2RSModel;", "p0", "Lcom/marrow2/data/test/remote/model/TopicStatV2RSModel;", "p1", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "component1", "()Ljava/util/List;", "component2", "copy", "(Ljava/util/List;Ljava/util/List;)Lcom/marrow2/data/test/remote/model/GTSubjectAnalyticsV2RSModel;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "testProgressData", "Ljava/util/List;", "getTestProgressData", "topicStat", "getTopicStat"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class GTSubjectAnalyticsV2RSModel {
    public static final int $stable = 8;
    private final List<TestProgressV2RSModel> testProgressData;
    private final List<TopicStatV2RSModel> topicStat;

    public GTSubjectAnalyticsV2RSModel(List<TestProgressV2RSModel> list, List<TopicStatV2RSModel> list2) {
        toMagicModuleMetaRepoModel.write(list, "");
        this.testProgressData = list;
        this.topicStat = list2;
    }

    public /* synthetic */ GTSubjectAnalyticsV2RSModel(List list, List list2, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i & 1) != 0 ? IntermediateLoginResponseBody.RemoteActionCompatParcelizer() : list, (i & 2) != 0 ? null : list2);
    }

    public final List<TestProgressV2RSModel> getTestProgressData() {
        return this.testProgressData;
    }

    public final List<TopicStatV2RSModel> getTopicStat() {
        return this.topicStat;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public GTSubjectAnalyticsV2RSModel() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GTSubjectAnalyticsV2RSModel copy$default(GTSubjectAnalyticsV2RSModel gTSubjectAnalyticsV2RSModel, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = gTSubjectAnalyticsV2RSModel.testProgressData;
        }
        if ((i & 2) != 0) {
            list2 = gTSubjectAnalyticsV2RSModel.topicStat;
        }
        return gTSubjectAnalyticsV2RSModel.copy(list, list2);
    }

    public final List<TestProgressV2RSModel> component1() {
        return this.testProgressData;
    }

    public final List<TopicStatV2RSModel> component2() {
        return this.topicStat;
    }

    public final GTSubjectAnalyticsV2RSModel copy(List<TestProgressV2RSModel> p0, List<TopicStatV2RSModel> p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return new GTSubjectAnalyticsV2RSModel(p0, p1);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof GTSubjectAnalyticsV2RSModel)) {
            return false;
        }
        GTSubjectAnalyticsV2RSModel gTSubjectAnalyticsV2RSModel = (GTSubjectAnalyticsV2RSModel) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.testProgressData, gTSubjectAnalyticsV2RSModel.testProgressData) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.topicStat, gTSubjectAnalyticsV2RSModel.topicStat);
    }

    public final int hashCode() {
        int iHashCode = this.testProgressData.hashCode();
        List<TopicStatV2RSModel> list = this.topicStat;
        return (iHashCode * 31) + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        List<TestProgressV2RSModel> list = this.testProgressData;
        List<TopicStatV2RSModel> list2 = this.topicStat;
        StringBuilder sb = new StringBuilder("GTSubjectAnalyticsV2RSModel(testProgressData=");
        sb.append(list);
        sb.append(", topicStat=");
        sb.append(list2);
        sb.append(")");
        return sb.toString();
    }
}
