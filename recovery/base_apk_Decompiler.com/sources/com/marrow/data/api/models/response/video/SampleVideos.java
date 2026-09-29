package com.marrow.data.api.models.response.video;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.marrow.data.api.models.response.firebase.freevideo.FreeVideoListResponse;
import com.marrow.data.api.models.response.firebase.freevideo.FreeVideoPromotionResponse;
import in.juspay.hypersdk.core.PaymentConstants;
import java.util.List;
import kotlin.IntermediateLoginResponseBody;
import kotlin.MagicModuleRepositoryImplExternalSyntheticLambda0;
import kotlin.Metadata;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes.dex */
@JsonIgnoreProperties(ignoreUnknown = true)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u000e\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ,\u0010\r\u001a\u00020\u00002\u000e\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\nR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\f"}, d2 = {"Lcom/marrow/data/api/models/response/video/SampleVideos;", "", "", "Lcom/marrow/data/api/models/response/firebase/freevideo/FreeVideoListResponse;", "p0", "Lcom/marrow/data/api/models/response/firebase/freevideo/FreeVideoPromotionResponse;", "p1", "<init>", "(Ljava/util/List;Lcom/marrow/data/api/models/response/firebase/freevideo/FreeVideoPromotionResponse;)V", "component1", "()Ljava/util/List;", "component2", "()Lcom/marrow/data/api/models/response/firebase/freevideo/FreeVideoPromotionResponse;", "copy", "(Ljava/util/List;Lcom/marrow/data/api/models/response/firebase/freevideo/FreeVideoPromotionResponse;)Lcom/marrow/data/api/models/response/video/SampleVideos;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "list", "Ljava/util/List;", "getList", PaymentConstants.Event.SCREEN, "Lcom/marrow/data/api/models/response/firebase/freevideo/FreeVideoPromotionResponse;", "getScreen"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SampleVideos {
    private final List<FreeVideoListResponse> list;
    private final FreeVideoPromotionResponse screen;

    public SampleVideos(@JsonProperty("list") List<FreeVideoListResponse> list, @JsonProperty(PaymentConstants.Event.SCREEN) FreeVideoPromotionResponse freeVideoPromotionResponse) {
        toMagicModuleMetaRepoModel.write(list, "");
        this.list = list;
        this.screen = freeVideoPromotionResponse;
    }

    public /* synthetic */ SampleVideos(List list, FreeVideoPromotionResponse freeVideoPromotionResponse, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i & 1) != 0 ? IntermediateLoginResponseBody.RemoteActionCompatParcelizer() : list, (i & 2) != 0 ? null : freeVideoPromotionResponse);
    }

    public final List<FreeVideoListResponse> getList() {
        return this.list;
    }

    public final FreeVideoPromotionResponse getScreen() {
        return this.screen;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SampleVideos() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SampleVideos copy$default(SampleVideos sampleVideos, List list, FreeVideoPromotionResponse freeVideoPromotionResponse, int i, Object obj) {
        if ((i & 1) != 0) {
            list = sampleVideos.list;
        }
        if ((i & 2) != 0) {
            freeVideoPromotionResponse = sampleVideos.screen;
        }
        return sampleVideos.copy(list, freeVideoPromotionResponse);
    }

    public final List<FreeVideoListResponse> component1() {
        return this.list;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final FreeVideoPromotionResponse getScreen() {
        return this.screen;
    }

    public final SampleVideos copy(@JsonProperty("list") List<FreeVideoListResponse> p0, @JsonProperty(PaymentConstants.Event.SCREEN) FreeVideoPromotionResponse p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return new SampleVideos(p0, p1);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof SampleVideos)) {
            return false;
        }
        SampleVideos sampleVideos = (SampleVideos) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.list, sampleVideos.list) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.screen, sampleVideos.screen);
    }

    public final int hashCode() {
        int iHashCode = this.list.hashCode();
        FreeVideoPromotionResponse freeVideoPromotionResponse = this.screen;
        return (iHashCode * 31) + (freeVideoPromotionResponse == null ? 0 : freeVideoPromotionResponse.hashCode());
    }

    public final String toString() {
        List<FreeVideoListResponse> list = this.list;
        FreeVideoPromotionResponse freeVideoPromotionResponse = this.screen;
        StringBuilder sb = new StringBuilder("SampleVideos(list=");
        sb.append(list);
        sb.append(", screen=");
        sb.append(freeVideoPromotionResponse);
        sb.append(")");
        return sb.toString();
    }
}
