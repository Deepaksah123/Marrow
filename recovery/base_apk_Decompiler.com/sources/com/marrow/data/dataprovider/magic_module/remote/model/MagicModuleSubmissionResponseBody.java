package com.marrow.data.dataprovider.magic_module.remote.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import kotlin.MagicModuleRepositoryImplExternalSyntheticLambda0;
import kotlin.Metadata;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes.dex */
@JsonIgnoreProperties(ignoreUnknown = true)
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0010\b\u0003\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J6\u0010\u0011\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00042\u0010\b\u0003\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001c\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\fR\u001a\u0010\u001f\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\u000eR\"\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010\u0010"}, d2 = {"Lcom/marrow/data/dataprovider/magic_module/remote/model/MagicModuleSubmissionResponseBody;", "", "Lcom/marrow/data/dataprovider/magic_module/remote/model/MagicModuleStatsRSModel;", "p0", "Lcom/marrow/data/dataprovider/magic_module/remote/model/MagicModuleModel;", "p1", "", "Lcom/marrow/data/dataprovider/magic_module/remote/model/MagicModuleTimelineRSModel;", "p2", "<init>", "(Lcom/marrow/data/dataprovider/magic_module/remote/model/MagicModuleStatsRSModel;Lcom/marrow/data/dataprovider/magic_module/remote/model/MagicModuleModel;Ljava/util/List;)V", "component1", "()Lcom/marrow/data/dataprovider/magic_module/remote/model/MagicModuleStatsRSModel;", "component2", "()Lcom/marrow/data/dataprovider/magic_module/remote/model/MagicModuleModel;", "component3", "()Ljava/util/List;", "copy", "(Lcom/marrow/data/dataprovider/magic_module/remote/model/MagicModuleStatsRSModel;Lcom/marrow/data/dataprovider/magic_module/remote/model/MagicModuleModel;Ljava/util/List;)Lcom/marrow/data/dataprovider/magic_module/remote/model/MagicModuleSubmissionResponseBody;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "magicModuleStat", "Lcom/marrow/data/dataprovider/magic_module/remote/model/MagicModuleStatsRSModel;", "getMagicModuleStat", "moduleData", "Lcom/marrow/data/dataprovider/magic_module/remote/model/MagicModuleModel;", "getModuleData", "timeline", "Ljava/util/List;", "getTimeline"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class MagicModuleSubmissionResponseBody {
    private final MagicModuleStatsRSModel magicModuleStat;
    private final MagicModuleModel moduleData;
    private final List<MagicModuleTimelineRSModel> timeline;

    public MagicModuleSubmissionResponseBody(@JsonProperty("smart_recall_stats") MagicModuleStatsRSModel magicModuleStatsRSModel, @JsonProperty("module_data") MagicModuleModel magicModuleModel, @JsonProperty("timeline") List<MagicModuleTimelineRSModel> list) {
        toMagicModuleMetaRepoModel.write(magicModuleStatsRSModel, "");
        toMagicModuleMetaRepoModel.write(magicModuleModel, "");
        this.magicModuleStat = magicModuleStatsRSModel;
        this.moduleData = magicModuleModel;
        this.timeline = list;
    }

    public /* synthetic */ MagicModuleSubmissionResponseBody(MagicModuleStatsRSModel magicModuleStatsRSModel, MagicModuleModel magicModuleModel, List list, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(magicModuleStatsRSModel, magicModuleModel, (i & 4) != 0 ? null : list);
    }

    public final MagicModuleStatsRSModel getMagicModuleStat() {
        return this.magicModuleStat;
    }

    public final MagicModuleModel getModuleData() {
        return this.moduleData;
    }

    public final List<MagicModuleTimelineRSModel> getTimeline() {
        return this.timeline;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MagicModuleSubmissionResponseBody copy$default(MagicModuleSubmissionResponseBody magicModuleSubmissionResponseBody, MagicModuleStatsRSModel magicModuleStatsRSModel, MagicModuleModel magicModuleModel, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            magicModuleStatsRSModel = magicModuleSubmissionResponseBody.magicModuleStat;
        }
        if ((i & 2) != 0) {
            magicModuleModel = magicModuleSubmissionResponseBody.moduleData;
        }
        if ((i & 4) != 0) {
            list = magicModuleSubmissionResponseBody.timeline;
        }
        return magicModuleSubmissionResponseBody.copy(magicModuleStatsRSModel, magicModuleModel, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final MagicModuleStatsRSModel getMagicModuleStat() {
        return this.magicModuleStat;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final MagicModuleModel getModuleData() {
        return this.moduleData;
    }

    public final List<MagicModuleTimelineRSModel> component3() {
        return this.timeline;
    }

    public final MagicModuleSubmissionResponseBody copy(@JsonProperty("smart_recall_stats") MagicModuleStatsRSModel p0, @JsonProperty("module_data") MagicModuleModel p1, @JsonProperty("timeline") List<MagicModuleTimelineRSModel> p2) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        return new MagicModuleSubmissionResponseBody(p0, p1, p2);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof MagicModuleSubmissionResponseBody)) {
            return false;
        }
        MagicModuleSubmissionResponseBody magicModuleSubmissionResponseBody = (MagicModuleSubmissionResponseBody) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.magicModuleStat, magicModuleSubmissionResponseBody.magicModuleStat) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.moduleData, magicModuleSubmissionResponseBody.moduleData) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.timeline, magicModuleSubmissionResponseBody.timeline);
    }

    public final int hashCode() {
        int iHashCode = this.magicModuleStat.hashCode();
        int iHashCode2 = this.moduleData.hashCode();
        List<MagicModuleTimelineRSModel> list = this.timeline;
        return (((iHashCode * 31) + iHashCode2) * 31) + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        MagicModuleStatsRSModel magicModuleStatsRSModel = this.magicModuleStat;
        MagicModuleModel magicModuleModel = this.moduleData;
        List<MagicModuleTimelineRSModel> list = this.timeline;
        StringBuilder sb = new StringBuilder("MagicModuleSubmissionResponseBody(magicModuleStat=");
        sb.append(magicModuleStatsRSModel);
        sb.append(", moduleData=");
        sb.append(magicModuleModel);
        sb.append(", timeline=");
        sb.append(list);
        sb.append(")");
        return sb.toString();
    }
}
