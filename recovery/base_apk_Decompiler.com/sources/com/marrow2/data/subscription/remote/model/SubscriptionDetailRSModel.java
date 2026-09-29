package com.marrow2.data.subscription.remote.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.android.exoplayer2.offline.DownloadService;
import kotlin.MagicModuleRepositoryImplExternalSyntheticLambda0;
import kotlin.Metadata;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ.\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\tR\u001a\u0010\u0015\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0018\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0019\u0010\tR\"\u0010\u001a\u001a\u00020\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u001b\u0010\t\"\u0004\b\u001c\u0010\u001d"}, d2 = {"Lcom/marrow2/data/subscription/remote/model/SubscriptionDetailRSModel;", "", "", "p0", "p1", "p2", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/marrow2/data/subscription/remote/model/SubscriptionDetailRSModel;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "contentId", "Ljava/lang/String;", "getContentId", "contentType", "getContentType", "contentNameForEvent", "getContentNameForEvent", "setContentNameForEvent", "(Ljava/lang/String;)V"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SubscriptionDetailRSModel {
    public static final int $stable = 8;

    @JsonProperty(DownloadService.KEY_CONTENT_ID)
    private final String contentId;

    @JsonProperty("content_name_for_event")
    private String contentNameForEvent;

    @JsonProperty("content_type")
    private final String contentType;

    public SubscriptionDetailRSModel(String str, String str2, String str3) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        toMagicModuleMetaRepoModel.write(str3, "");
        this.contentId = str;
        this.contentType = str2;
        this.contentNameForEvent = str3;
    }

    public /* synthetic */ SubscriptionDetailRSModel(String str, String str2, String str3, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3);
    }

    public final String getContentId() {
        return this.contentId;
    }

    public final String getContentType() {
        return this.contentType;
    }

    public final String getContentNameForEvent() {
        return this.contentNameForEvent;
    }

    public final void setContentNameForEvent(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        this.contentNameForEvent = str;
    }

    public SubscriptionDetailRSModel() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ SubscriptionDetailRSModel copy$default(SubscriptionDetailRSModel subscriptionDetailRSModel, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = subscriptionDetailRSModel.contentId;
        }
        if ((i & 2) != 0) {
            str2 = subscriptionDetailRSModel.contentType;
        }
        if ((i & 4) != 0) {
            str3 = subscriptionDetailRSModel.contentNameForEvent;
        }
        return subscriptionDetailRSModel.copy(str, str2, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getContentId() {
        return this.contentId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getContentType() {
        return this.contentType;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getContentNameForEvent() {
        return this.contentNameForEvent;
    }

    public final SubscriptionDetailRSModel copy(String p0, String p1, String p2) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        toMagicModuleMetaRepoModel.write(p2, "");
        return new SubscriptionDetailRSModel(p0, p1, p2);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof SubscriptionDetailRSModel)) {
            return false;
        }
        SubscriptionDetailRSModel subscriptionDetailRSModel = (SubscriptionDetailRSModel) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.contentId, (Object) subscriptionDetailRSModel.contentId) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.contentType, (Object) subscriptionDetailRSModel.contentType) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.contentNameForEvent, (Object) subscriptionDetailRSModel.contentNameForEvent);
    }

    public final int hashCode() {
        return (((this.contentId.hashCode() * 31) + this.contentType.hashCode()) * 31) + this.contentNameForEvent.hashCode();
    }

    public final String toString() {
        String str = this.contentId;
        String str2 = this.contentType;
        String str3 = this.contentNameForEvent;
        StringBuilder sb = new StringBuilder("SubscriptionDetailRSModel(contentId=");
        sb.append(str);
        sb.append(", contentType=");
        sb.append(str2);
        sb.append(", contentNameForEvent=");
        sb.append(str3);
        sb.append(")");
        return sb.toString();
    }
}
