package com.marrow2.data.course_config.remote.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import in.juspay.hypersdk.core.PaymentConstants;
import java.io.Serializable;
import java.util.List;
import kotlin.IntermediateLoginResponseBody;
import kotlin.MagicModuleRepositoryImplExternalSyntheticLambda0;
import kotlin.Metadata;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes.dex */
@JsonIgnoreProperties(ignoreUnknown = true)
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ,\u0010\r\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u0004\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R \u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\nR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\f"}, d2 = {"Lcom/marrow2/data/course_config/remote/model/SampleVideosRSModel;", "Ljava/io/Serializable;", "", "Lcom/marrow2/data/course_config/remote/model/FreeVideoListRSModel;", "p0", "Lcom/marrow2/data/course_config/remote/model/FreeVideoPromotionRSModel;", "p1", "<init>", "(Ljava/util/List;Lcom/marrow2/data/course_config/remote/model/FreeVideoPromotionRSModel;)V", "component1", "()Ljava/util/List;", "component2", "()Lcom/marrow2/data/course_config/remote/model/FreeVideoPromotionRSModel;", "copy", "(Ljava/util/List;Lcom/marrow2/data/course_config/remote/model/FreeVideoPromotionRSModel;)Lcom/marrow2/data/course_config/remote/model/SampleVideosRSModel;", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "list", "Ljava/util/List;", "getList", PaymentConstants.Event.SCREEN, "Lcom/marrow2/data/course_config/remote/model/FreeVideoPromotionRSModel;", "getScreen"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SampleVideosRSModel implements Serializable {
    public static final int $stable = 8;
    private final List<FreeVideoListRSModel> list;
    private final FreeVideoPromotionRSModel screen;

    public SampleVideosRSModel(List<FreeVideoListRSModel> list, FreeVideoPromotionRSModel freeVideoPromotionRSModel) {
        toMagicModuleMetaRepoModel.write(list, "");
        this.list = list;
        this.screen = freeVideoPromotionRSModel;
    }

    public /* synthetic */ SampleVideosRSModel(List list, FreeVideoPromotionRSModel freeVideoPromotionRSModel, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i & 1) != 0 ? IntermediateLoginResponseBody.RemoteActionCompatParcelizer() : list, (i & 2) != 0 ? null : freeVideoPromotionRSModel);
    }

    @JsonProperty("list")
    public final List<FreeVideoListRSModel> getList() {
        return this.list;
    }

    @JsonProperty(PaymentConstants.Event.SCREEN)
    public final FreeVideoPromotionRSModel getScreen() {
        return this.screen;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SampleVideosRSModel() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SampleVideosRSModel copy$default(SampleVideosRSModel sampleVideosRSModel, List list, FreeVideoPromotionRSModel freeVideoPromotionRSModel, int i, Object obj) {
        if ((i & 1) != 0) {
            list = sampleVideosRSModel.list;
        }
        if ((i & 2) != 0) {
            freeVideoPromotionRSModel = sampleVideosRSModel.screen;
        }
        return sampleVideosRSModel.copy(list, freeVideoPromotionRSModel);
    }

    public final List<FreeVideoListRSModel> component1() {
        return this.list;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final FreeVideoPromotionRSModel getScreen() {
        return this.screen;
    }

    public final SampleVideosRSModel copy(List<FreeVideoListRSModel> p0, FreeVideoPromotionRSModel p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return new SampleVideosRSModel(p0, p1);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof SampleVideosRSModel)) {
            return false;
        }
        SampleVideosRSModel sampleVideosRSModel = (SampleVideosRSModel) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.list, sampleVideosRSModel.list) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.screen, sampleVideosRSModel.screen);
    }

    public final int hashCode() {
        int iHashCode = this.list.hashCode();
        FreeVideoPromotionRSModel freeVideoPromotionRSModel = this.screen;
        return (iHashCode * 31) + (freeVideoPromotionRSModel == null ? 0 : freeVideoPromotionRSModel.hashCode());
    }

    public final String toString() {
        List<FreeVideoListRSModel> list = this.list;
        FreeVideoPromotionRSModel freeVideoPromotionRSModel = this.screen;
        StringBuilder sb = new StringBuilder("SampleVideosRSModel(list=");
        sb.append(list);
        sb.append(", screen=");
        sb.append(freeVideoPromotionRSModel);
        sb.append(")");
        return sb.toString();
    }
}
