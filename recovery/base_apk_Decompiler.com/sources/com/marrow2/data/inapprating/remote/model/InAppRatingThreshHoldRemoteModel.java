package com.marrow2.data.inapprating.remote.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.MagicModuleRepositoryImplExternalSyntheticLambda0;
import kotlin.Metadata;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes.dex */
@JsonIgnoreProperties(ignoreUnknown = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ(\u0010\n\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0018\u0010\b"}, d2 = {"Lcom/marrow2/data/inapprating/remote/model/InAppRatingThreshHoldRemoteModel;", "", "", "p0", "p1", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;)V", "component1", "()Ljava/lang/Integer;", "component2", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/marrow2/data/inapprating/remote/model/InAppRatingThreshHoldRemoteModel;", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "qbankThreshold", "Ljava/lang/Integer;", "getQbankThreshold", "videoThreshold", "getVideoThreshold"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class InAppRatingThreshHoldRemoteModel {
    public static final int $stable = 0;
    private final Integer qbankThreshold;
    private final Integer videoThreshold;

    public InAppRatingThreshHoldRemoteModel(@JsonProperty("qbank_threshold") Integer num, @JsonProperty("video_threshold") Integer num2) {
        this.qbankThreshold = num;
        this.videoThreshold = num2;
    }

    public /* synthetic */ InAppRatingThreshHoldRemoteModel(Integer num, Integer num2, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2);
    }

    public final Integer getQbankThreshold() {
        return this.qbankThreshold;
    }

    public final Integer getVideoThreshold() {
        return this.videoThreshold;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public InAppRatingThreshHoldRemoteModel() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ InAppRatingThreshHoldRemoteModel copy$default(InAppRatingThreshHoldRemoteModel inAppRatingThreshHoldRemoteModel, Integer num, Integer num2, int i, Object obj) {
        if ((i & 1) != 0) {
            num = inAppRatingThreshHoldRemoteModel.qbankThreshold;
        }
        if ((i & 2) != 0) {
            num2 = inAppRatingThreshHoldRemoteModel.videoThreshold;
        }
        return inAppRatingThreshHoldRemoteModel.copy(num, num2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getQbankThreshold() {
        return this.qbankThreshold;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getVideoThreshold() {
        return this.videoThreshold;
    }

    public final InAppRatingThreshHoldRemoteModel copy(@JsonProperty("qbank_threshold") Integer p0, @JsonProperty("video_threshold") Integer p1) {
        return new InAppRatingThreshHoldRemoteModel(p0, p1);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof InAppRatingThreshHoldRemoteModel)) {
            return false;
        }
        InAppRatingThreshHoldRemoteModel inAppRatingThreshHoldRemoteModel = (InAppRatingThreshHoldRemoteModel) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.qbankThreshold, inAppRatingThreshHoldRemoteModel.qbankThreshold) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.videoThreshold, inAppRatingThreshHoldRemoteModel.videoThreshold);
    }

    public final int hashCode() {
        Integer num = this.qbankThreshold;
        int iHashCode = num == null ? 0 : num.hashCode();
        Integer num2 = this.videoThreshold;
        return (iHashCode * 31) + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        Integer num = this.qbankThreshold;
        Integer num2 = this.videoThreshold;
        StringBuilder sb = new StringBuilder("InAppRatingThreshHoldRemoteModel(qbankThreshold=");
        sb.append(num);
        sb.append(", videoThreshold=");
        sb.append(num2);
        sb.append(")");
        return sb.toString();
    }
}
