package com.marrow2.data.test.remote.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import kotlin.MagicModuleRepositoryImplExternalSyntheticLambda0;
import kotlin.Metadata;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes.dex */
@JsonIgnoreProperties(ignoreUnknown = true)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0003\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ.\u0010\r\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0010\b\u0003\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\nR\"\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\f"}, d2 = {"Lcom/marrow2/data/test/remote/model/TestScoreRSModel;", "", "Lcom/marrow2/data/test/remote/model/StateResultRSModel;", "p0", "", "Lcom/marrow2/data/test/remote/model/TopUserRSModel;", "p1", "<init>", "(Lcom/marrow2/data/test/remote/model/StateResultRSModel;Ljava/util/List;)V", "component1", "()Lcom/marrow2/data/test/remote/model/StateResultRSModel;", "component2", "()Ljava/util/List;", "copy", "(Lcom/marrow2/data/test/remote/model/StateResultRSModel;Ljava/util/List;)Lcom/marrow2/data/test/remote/model/TestScoreRSModel;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "stateResultRSModel", "Lcom/marrow2/data/test/remote/model/StateResultRSModel;", "getStateResultRSModel", "topRankers", "Ljava/util/List;", "getTopRankers"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TestScoreRSModel {
    public static final int $stable = 8;
    private final StateResultRSModel stateResultRSModel;
    private final List<TopUserRSModel> topRankers;

    public TestScoreRSModel(@JsonProperty("state_result") StateResultRSModel stateResultRSModel, @JsonProperty("top_rankers") List<TopUserRSModel> list) {
        this.stateResultRSModel = stateResultRSModel;
        this.topRankers = list;
    }

    public /* synthetic */ TestScoreRSModel(StateResultRSModel stateResultRSModel, List list, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(stateResultRSModel, (i & 2) != 0 ? null : list);
    }

    public final StateResultRSModel getStateResultRSModel() {
        return this.stateResultRSModel;
    }

    public final List<TopUserRSModel> getTopRankers() {
        return this.topRankers;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TestScoreRSModel copy$default(TestScoreRSModel testScoreRSModel, StateResultRSModel stateResultRSModel, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            stateResultRSModel = testScoreRSModel.stateResultRSModel;
        }
        if ((i & 2) != 0) {
            list = testScoreRSModel.topRankers;
        }
        return testScoreRSModel.copy(stateResultRSModel, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final StateResultRSModel getStateResultRSModel() {
        return this.stateResultRSModel;
    }

    public final List<TopUserRSModel> component2() {
        return this.topRankers;
    }

    public final TestScoreRSModel copy(@JsonProperty("state_result") StateResultRSModel p0, @JsonProperty("top_rankers") List<TopUserRSModel> p1) {
        return new TestScoreRSModel(p0, p1);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof TestScoreRSModel)) {
            return false;
        }
        TestScoreRSModel testScoreRSModel = (TestScoreRSModel) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.stateResultRSModel, testScoreRSModel.stateResultRSModel) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.topRankers, testScoreRSModel.topRankers);
    }

    public final int hashCode() {
        StateResultRSModel stateResultRSModel = this.stateResultRSModel;
        int iHashCode = stateResultRSModel == null ? 0 : stateResultRSModel.hashCode();
        List<TopUserRSModel> list = this.topRankers;
        return (iHashCode * 31) + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StateResultRSModel stateResultRSModel = this.stateResultRSModel;
        List<TopUserRSModel> list = this.topRankers;
        StringBuilder sb = new StringBuilder("TestScoreRSModel(stateResultRSModel=");
        sb.append(stateResultRSModel);
        sb.append(", topRankers=");
        sb.append(list);
        sb.append(")");
        return sb.toString();
    }
}
