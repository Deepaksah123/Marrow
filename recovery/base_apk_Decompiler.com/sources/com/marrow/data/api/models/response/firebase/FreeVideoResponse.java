package com.marrow.data.api.models.response.firebase;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.marrow.data.api.models.response.firebase.freevideo.FreeVideoListResponse;
import com.marrow.data.api.models.response.firebase.freevideo.FreeVideoPromotionResponse;
import in.juspay.hypersdk.core.PaymentConstants;
import java.io.Serializable;
import java.util.Arrays;
import kotlin.MagicModuleRepositoryImplExternalSyntheticLambda0;
import kotlin.Metadata;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes.dex */
@JsonIgnoreProperties(ignoreUnknown = true)
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\u0010\b\u0003\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0003\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000eJL\u0010\u0011\u001a\u00020\u00002\u0010\b\u0003\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0010\b\u0003\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0004\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cR\u001e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001e\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b!\u0010\u001eR\u0018\u0010\"\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\"\u0010 "}, d2 = {"Lcom/marrow/data/api/models/response/firebase/FreeVideoResponse;", "Ljava/io/Serializable;", "", "Lcom/marrow/data/api/models/response/firebase/freevideo/FreeVideoListResponse;", "p0", "Lcom/marrow/data/api/models/response/firebase/freevideo/FreeVideoPromotionResponse;", "p1", "p2", "p3", "<init>", "([Lcom/marrow/data/api/models/response/firebase/freevideo/FreeVideoListResponse;Lcom/marrow/data/api/models/response/firebase/freevideo/FreeVideoPromotionResponse;[Lcom/marrow/data/api/models/response/firebase/freevideo/FreeVideoListResponse;Lcom/marrow/data/api/models/response/firebase/freevideo/FreeVideoPromotionResponse;)V", "component1", "()[Lcom/marrow/data/api/models/response/firebase/freevideo/FreeVideoListResponse;", "component2", "()Lcom/marrow/data/api/models/response/firebase/freevideo/FreeVideoPromotionResponse;", "component3", "component4", "copy", "([Lcom/marrow/data/api/models/response/firebase/freevideo/FreeVideoListResponse;Lcom/marrow/data/api/models/response/firebase/freevideo/FreeVideoPromotionResponse;[Lcom/marrow/data/api/models/response/firebase/freevideo/FreeVideoListResponse;Lcom/marrow/data/api/models/response/firebase/freevideo/FreeVideoPromotionResponse;)Lcom/marrow/data/api/models/response/firebase/FreeVideoResponse;", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "freeVideoListResponseV5", "[Lcom/marrow/data/api/models/response/firebase/freevideo/FreeVideoListResponse;", "freeVideoPromotionResponseEdition5V2", "Lcom/marrow/data/api/models/response/firebase/freevideo/FreeVideoPromotionResponse;", "freeVideoResponseList", "freeVideoPromotion"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class FreeVideoResponse implements Serializable {
    public FreeVideoListResponse[] freeVideoListResponseV5;
    public FreeVideoPromotionResponse freeVideoPromotion;
    public FreeVideoPromotionResponse freeVideoPromotionResponseEdition5V2;
    public FreeVideoListResponse[] freeVideoResponseList;

    public FreeVideoResponse(@JsonProperty("listV5") FreeVideoListResponse[] freeVideoListResponseArr, @JsonProperty("screenEd5V2") FreeVideoPromotionResponse freeVideoPromotionResponse, @JsonProperty("list") FreeVideoListResponse[] freeVideoListResponseArr2, @JsonProperty(PaymentConstants.Event.SCREEN) FreeVideoPromotionResponse freeVideoPromotionResponse2) {
        this.freeVideoListResponseV5 = freeVideoListResponseArr;
        this.freeVideoPromotionResponseEdition5V2 = freeVideoPromotionResponse;
        this.freeVideoResponseList = freeVideoListResponseArr2;
        this.freeVideoPromotion = freeVideoPromotionResponse2;
    }

    public /* synthetic */ FreeVideoResponse(FreeVideoListResponse[] freeVideoListResponseArr, FreeVideoPromotionResponse freeVideoPromotionResponse, FreeVideoListResponse[] freeVideoListResponseArr2, FreeVideoPromotionResponse freeVideoPromotionResponse2, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i & 1) != 0 ? null : freeVideoListResponseArr, (i & 2) != 0 ? null : freeVideoPromotionResponse, (i & 4) != 0 ? null : freeVideoListResponseArr2, (i & 8) != 0 ? null : freeVideoPromotionResponse2);
    }

    public FreeVideoResponse() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ FreeVideoResponse copy$default(FreeVideoResponse freeVideoResponse, FreeVideoListResponse[] freeVideoListResponseArr, FreeVideoPromotionResponse freeVideoPromotionResponse, FreeVideoListResponse[] freeVideoListResponseArr2, FreeVideoPromotionResponse freeVideoPromotionResponse2, int i, Object obj) {
        if ((i & 1) != 0) {
            freeVideoListResponseArr = freeVideoResponse.freeVideoListResponseV5;
        }
        if ((i & 2) != 0) {
            freeVideoPromotionResponse = freeVideoResponse.freeVideoPromotionResponseEdition5V2;
        }
        if ((i & 4) != 0) {
            freeVideoListResponseArr2 = freeVideoResponse.freeVideoResponseList;
        }
        if ((i & 8) != 0) {
            freeVideoPromotionResponse2 = freeVideoResponse.freeVideoPromotion;
        }
        return freeVideoResponse.copy(freeVideoListResponseArr, freeVideoPromotionResponse, freeVideoListResponseArr2, freeVideoPromotionResponse2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final FreeVideoListResponse[] getFreeVideoListResponseV5() {
        return this.freeVideoListResponseV5;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final FreeVideoPromotionResponse getFreeVideoPromotionResponseEdition5V2() {
        return this.freeVideoPromotionResponseEdition5V2;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final FreeVideoListResponse[] getFreeVideoResponseList() {
        return this.freeVideoResponseList;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final FreeVideoPromotionResponse getFreeVideoPromotion() {
        return this.freeVideoPromotion;
    }

    public final FreeVideoResponse copy(@JsonProperty("listV5") FreeVideoListResponse[] p0, @JsonProperty("screenEd5V2") FreeVideoPromotionResponse p1, @JsonProperty("list") FreeVideoListResponse[] p2, @JsonProperty(PaymentConstants.Event.SCREEN) FreeVideoPromotionResponse p3) {
        return new FreeVideoResponse(p0, p1, p2, p3);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof FreeVideoResponse)) {
            return false;
        }
        FreeVideoResponse freeVideoResponse = (FreeVideoResponse) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.freeVideoListResponseV5, freeVideoResponse.freeVideoListResponseV5) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.freeVideoPromotionResponseEdition5V2, freeVideoResponse.freeVideoPromotionResponseEdition5V2) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.freeVideoResponseList, freeVideoResponse.freeVideoResponseList) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.freeVideoPromotion, freeVideoResponse.freeVideoPromotion);
    }

    public final int hashCode() {
        FreeVideoListResponse[] freeVideoListResponseArr = this.freeVideoListResponseV5;
        int iHashCode = freeVideoListResponseArr == null ? 0 : Arrays.hashCode(freeVideoListResponseArr);
        FreeVideoPromotionResponse freeVideoPromotionResponse = this.freeVideoPromotionResponseEdition5V2;
        int iHashCode2 = freeVideoPromotionResponse == null ? 0 : freeVideoPromotionResponse.hashCode();
        FreeVideoListResponse[] freeVideoListResponseArr2 = this.freeVideoResponseList;
        int iHashCode3 = freeVideoListResponseArr2 == null ? 0 : Arrays.hashCode(freeVideoListResponseArr2);
        FreeVideoPromotionResponse freeVideoPromotionResponse2 = this.freeVideoPromotion;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (freeVideoPromotionResponse2 != null ? freeVideoPromotionResponse2.hashCode() : 0);
    }

    public final String toString() {
        String string = Arrays.toString(this.freeVideoListResponseV5);
        FreeVideoPromotionResponse freeVideoPromotionResponse = this.freeVideoPromotionResponseEdition5V2;
        String string2 = Arrays.toString(this.freeVideoResponseList);
        FreeVideoPromotionResponse freeVideoPromotionResponse2 = this.freeVideoPromotion;
        StringBuilder sb = new StringBuilder("FreeVideoResponse(freeVideoListResponseV5=");
        sb.append(string);
        sb.append(", freeVideoPromotionResponseEdition5V2=");
        sb.append(freeVideoPromotionResponse);
        sb.append(", freeVideoResponseList=");
        sb.append(string2);
        sb.append(", freeVideoPromotion=");
        sb.append(freeVideoPromotionResponse2);
        sb.append(")");
        return sb.toString();
    }
}
