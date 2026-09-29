package com.marrow.data.dataprovider.magic_module.remote.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.MagicModuleRepositoryImplExternalSyntheticLambda0;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@JsonIgnoreProperties(ignoreUnknown = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ.\u0010\f\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\tJ\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0015\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0018\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0019\u0010\tR\u001a\u0010\u001a\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u001b\u0010\t"}, d2 = {"Lcom/marrow/data/dataprovider/magic_module/remote/model/MagicModuleStatsRSModel;", "", "", "p0", "p1", "p2", "<init>", "(III)V", "component1", "()I", "component2", "component3", "copy", "(III)Lcom/marrow/data/dataprovider/magic_module/remote/model/MagicModuleStatsRSModel;", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", "moduleCompleted", "I", "getModuleCompleted", "corrected", "getCorrected", "needRevision", "getNeedRevision"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class MagicModuleStatsRSModel {
    private final int corrected;
    private final int moduleCompleted;
    private final int needRevision;

    public MagicModuleStatsRSModel(@JsonProperty("modules_completed") int i, @JsonProperty("corrected") int i2, @JsonProperty("need_revision") int i3) {
        this.moduleCompleted = i;
        this.corrected = i2;
        this.needRevision = i3;
    }

    public /* synthetic */ MagicModuleStatsRSModel(int i, int i2, int i3, int i4, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i4 & 1) != 0 ? 0 : i, (i4 & 2) != 0 ? 0 : i2, (i4 & 4) != 0 ? 0 : i3);
    }

    public final int getModuleCompleted() {
        return this.moduleCompleted;
    }

    public final int getCorrected() {
        return this.corrected;
    }

    public final int getNeedRevision() {
        return this.needRevision;
    }

    public MagicModuleStatsRSModel() {
        this(0, 0, 0, 7, null);
    }

    public static /* synthetic */ MagicModuleStatsRSModel copy$default(MagicModuleStatsRSModel magicModuleStatsRSModel, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = magicModuleStatsRSModel.moduleCompleted;
        }
        if ((i4 & 2) != 0) {
            i2 = magicModuleStatsRSModel.corrected;
        }
        if ((i4 & 4) != 0) {
            i3 = magicModuleStatsRSModel.needRevision;
        }
        return magicModuleStatsRSModel.copy(i, i2, i3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getModuleCompleted() {
        return this.moduleCompleted;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getCorrected() {
        return this.corrected;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getNeedRevision() {
        return this.needRevision;
    }

    public final MagicModuleStatsRSModel copy(@JsonProperty("modules_completed") int p0, @JsonProperty("corrected") int p1, @JsonProperty("need_revision") int p2) {
        return new MagicModuleStatsRSModel(p0, p1, p2);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof MagicModuleStatsRSModel)) {
            return false;
        }
        MagicModuleStatsRSModel magicModuleStatsRSModel = (MagicModuleStatsRSModel) p0;
        return this.moduleCompleted == magicModuleStatsRSModel.moduleCompleted && this.corrected == magicModuleStatsRSModel.corrected && this.needRevision == magicModuleStatsRSModel.needRevision;
    }

    public final int hashCode() {
        return (((Integer.hashCode(this.moduleCompleted) * 31) + Integer.hashCode(this.corrected)) * 31) + Integer.hashCode(this.needRevision);
    }

    public final String toString() {
        int i = this.moduleCompleted;
        int i2 = this.corrected;
        int i3 = this.needRevision;
        StringBuilder sb = new StringBuilder("MagicModuleStatsRSModel(moduleCompleted=");
        sb.append(i);
        sb.append(", corrected=");
        sb.append(i2);
        sb.append(", needRevision=");
        sb.append(i3);
        sb.append(")");
        return sb.toString();
    }
}
