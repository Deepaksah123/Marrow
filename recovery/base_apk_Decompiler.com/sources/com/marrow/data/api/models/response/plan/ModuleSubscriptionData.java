package com.marrow.data.api.models.response.plan;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.android.exoplayer2.offline.DownloadService;
import com.marrow.data.api.models.response.user.LoggedUserResponse;
import com.marrow.data.models.custommodule.FilterParams;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.isFirst;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b.\b\u0086\b\u0018\u00002\u00020\u0001B³\u0001\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010\t\u001a\u00020\u0003\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\u001c\b\u0001\u0010\u000f\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0010j\n\u0012\u0004\u0012\u00020\u0003\u0018\u0001`\u0011\u0012\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010-\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u001aJ\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00101\u001a\u00020\u0003HÆ\u0003J\u0010\u00102\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010!J\u0010\u00103\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010!J\u0010\u00104\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0002\u0010%J\u001d\u00105\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0010j\n\u0012\u0004\u0012\u00020\u0003\u0018\u0001`\u0011HÆ\u0003J\u0010\u00106\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u001aJ\u0010\u00107\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010!J\u000b\u00108\u001a\u0004\u0018\u00010\u0003HÆ\u0003Jº\u0001\u00109\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\t\u001a\u00020\u00032\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u000e2\u001c\b\u0003\u0010\u000f\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0010j\n\u0012\u0004\u0012\u00020\u0003\u0018\u0001`\u00112\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u000b2\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010:J\u0013\u0010;\u001a\u00020\u000e2\b\u0010<\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010=\u001a\u00020\u0005HÖ\u0001J\t\u0010>\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u0019\u0010\u001aR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0018R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0018R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0018R\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0018R\u001a\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\"\u001a\u0004\b \u0010!R\u001a\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\"\u001a\u0004\b#\u0010!R\u001a\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010&\u001a\u0004\b$\u0010%R*\u0010\u000f\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0010j\n\u0012\u0004\u0012\u00020\u0003\u0018\u0001`\u00118\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u001a\u0010\u0012\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b)\u0010\u001aR\u001a\u0010\u0013\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\"\u001a\u0004\b*\u0010!R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u0018¨\u0006?"}, d2 = {"Lcom/marrow/data/api/models/response/plan/ModuleSubscriptionData;", "", "id", "", "accessLevel", "", "contentId", "contentNameForEvent", "contentType", "courseId", "createdOn", "", "expiresOn", "paymentFlag", "", "paymentRefIds", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "sortOrder", "startedOn", "userId", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/util/ArrayList;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getAccessLevel", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getContentId", "getContentNameForEvent", "getContentType", "getCourseId", "getCreatedOn", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getExpiresOn", "getPaymentFlag", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getPaymentRefIds", "()Ljava/util/ArrayList;", "getSortOrder", "getStartedOn", "getUserId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/util/ArrayList;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/String;)Lcom/marrow/data/api/models/response/plan/ModuleSubscriptionData;", "equals", "other", "hashCode", "toString", "data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ModuleSubscriptionData {

    @isFirst(RemoteActionCompatParcelizer = "access_level")
    private final Integer accessLevel;

    @isFirst(RemoteActionCompatParcelizer = DownloadService.KEY_CONTENT_ID)
    private final String contentId;

    @isFirst(RemoteActionCompatParcelizer = "content_name_for_event")
    private final String contentNameForEvent;

    @isFirst(RemoteActionCompatParcelizer = "content_type")
    private final String contentType;

    @isFirst(RemoteActionCompatParcelizer = FilterParams.KEY_COURSE_ID)
    private final String courseId;

    @isFirst(RemoteActionCompatParcelizer = LoggedUserResponse.KEY_CREATED_ON)
    private final Long createdOn;

    @isFirst(RemoteActionCompatParcelizer = "expires_on")
    private final Long expiresOn;

    @isFirst(RemoteActionCompatParcelizer = "_id")
    private final String id;

    @isFirst(RemoteActionCompatParcelizer = "payment_flag")
    private final Boolean paymentFlag;

    @isFirst(RemoteActionCompatParcelizer = "payment_ref_ids")
    private final ArrayList<String> paymentRefIds;

    @isFirst(RemoteActionCompatParcelizer = "sort_order")
    private final Integer sortOrder;

    @isFirst(RemoteActionCompatParcelizer = "started_on")
    private final Long startedOn;

    @isFirst(RemoteActionCompatParcelizer = "user_id")
    private final String userId;

    public ModuleSubscriptionData(@JsonProperty("_id") String str, @JsonProperty("access_level") Integer num, @JsonProperty(DownloadService.KEY_CONTENT_ID) String str2, @JsonProperty("content_name_for_event") String str3, @JsonProperty("content_type") String str4, @JsonProperty(FilterParams.KEY_COURSE_ID) String str5, @JsonProperty(LoggedUserResponse.KEY_CREATED_ON) Long l, @JsonProperty("expires_on") Long l2, @JsonProperty("payment_flag") Boolean bool, @JsonProperty("payment_ref_ids") ArrayList<String> arrayList, @JsonProperty("sort_order") Integer num2, @JsonProperty("started_on") Long l3, @JsonProperty("user_id") String str6) {
        toMagicModuleMetaRepoModel.write(str5, "");
        this.id = str;
        this.accessLevel = num;
        this.contentId = str2;
        this.contentNameForEvent = str3;
        this.contentType = str4;
        this.courseId = str5;
        this.createdOn = l;
        this.expiresOn = l2;
        this.paymentFlag = bool;
        this.paymentRefIds = arrayList;
        this.sortOrder = num2;
        this.startedOn = l3;
        this.userId = str6;
    }

    public final String getId() {
        return this.id;
    }

    public final Integer getAccessLevel() {
        return this.accessLevel;
    }

    public final String getContentId() {
        return this.contentId;
    }

    public final String getContentNameForEvent() {
        return this.contentNameForEvent;
    }

    public final String getContentType() {
        return this.contentType;
    }

    public final String getCourseId() {
        return this.courseId;
    }

    public final Long getCreatedOn() {
        return this.createdOn;
    }

    public final Long getExpiresOn() {
        return this.expiresOn;
    }

    public final Boolean getPaymentFlag() {
        return this.paymentFlag;
    }

    public final ArrayList<String> getPaymentRefIds() {
        return this.paymentRefIds;
    }

    public final Integer getSortOrder() {
        return this.sortOrder;
    }

    public final Long getStartedOn() {
        return this.startedOn;
    }

    public final String getUserId() {
        return this.userId;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    public final ArrayList<String> component10() {
        return this.paymentRefIds;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final Integer getSortOrder() {
        return this.sortOrder;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final Long getStartedOn() {
        return this.startedOn;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getAccessLevel() {
        return this.accessLevel;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getContentId() {
        return this.contentId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getContentNameForEvent() {
        return this.contentNameForEvent;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getContentType() {
        return this.contentType;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getCourseId() {
        return this.courseId;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Long getCreatedOn() {
        return this.createdOn;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Long getExpiresOn() {
        return this.expiresOn;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Boolean getPaymentFlag() {
        return this.paymentFlag;
    }

    public final ModuleSubscriptionData copy(@JsonProperty("_id") String id, @JsonProperty("access_level") Integer accessLevel, @JsonProperty(DownloadService.KEY_CONTENT_ID) String contentId, @JsonProperty("content_name_for_event") String contentNameForEvent, @JsonProperty("content_type") String contentType, @JsonProperty(FilterParams.KEY_COURSE_ID) String courseId, @JsonProperty(LoggedUserResponse.KEY_CREATED_ON) Long createdOn, @JsonProperty("expires_on") Long expiresOn, @JsonProperty("payment_flag") Boolean paymentFlag, @JsonProperty("payment_ref_ids") ArrayList<String> paymentRefIds, @JsonProperty("sort_order") Integer sortOrder, @JsonProperty("started_on") Long startedOn, @JsonProperty("user_id") String userId) {
        toMagicModuleMetaRepoModel.write(courseId, "");
        return new ModuleSubscriptionData(id, accessLevel, contentId, contentNameForEvent, contentType, courseId, createdOn, expiresOn, paymentFlag, paymentRefIds, sortOrder, startedOn, userId);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ModuleSubscriptionData)) {
            return false;
        }
        ModuleSubscriptionData moduleSubscriptionData = (ModuleSubscriptionData) other;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.id, (Object) moduleSubscriptionData.id) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.accessLevel, moduleSubscriptionData.accessLevel) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.contentId, (Object) moduleSubscriptionData.contentId) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.contentNameForEvent, (Object) moduleSubscriptionData.contentNameForEvent) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.contentType, (Object) moduleSubscriptionData.contentType) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.courseId, (Object) moduleSubscriptionData.courseId) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.createdOn, moduleSubscriptionData.createdOn) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.expiresOn, moduleSubscriptionData.expiresOn) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.paymentFlag, moduleSubscriptionData.paymentFlag) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.paymentRefIds, moduleSubscriptionData.paymentRefIds) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.sortOrder, moduleSubscriptionData.sortOrder) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.startedOn, moduleSubscriptionData.startedOn) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.userId, (Object) moduleSubscriptionData.userId);
    }

    public final int hashCode() {
        String str = this.id;
        int iHashCode = str == null ? 0 : str.hashCode();
        Integer num = this.accessLevel;
        int iHashCode2 = num == null ? 0 : num.hashCode();
        String str2 = this.contentId;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.contentNameForEvent;
        int iHashCode4 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.contentType;
        int iHashCode5 = str4 == null ? 0 : str4.hashCode();
        int iHashCode6 = this.courseId.hashCode();
        Long l = this.createdOn;
        int iHashCode7 = l == null ? 0 : l.hashCode();
        Long l2 = this.expiresOn;
        int iHashCode8 = l2 == null ? 0 : l2.hashCode();
        Boolean bool = this.paymentFlag;
        int iHashCode9 = bool == null ? 0 : bool.hashCode();
        ArrayList<String> arrayList = this.paymentRefIds;
        int iHashCode10 = arrayList == null ? 0 : arrayList.hashCode();
        Integer num2 = this.sortOrder;
        int iHashCode11 = num2 == null ? 0 : num2.hashCode();
        Long l3 = this.startedOn;
        int iHashCode12 = l3 == null ? 0 : l3.hashCode();
        String str5 = this.userId;
        return (((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        String str = this.id;
        Integer num = this.accessLevel;
        String str2 = this.contentId;
        String str3 = this.contentNameForEvent;
        String str4 = this.contentType;
        String str5 = this.courseId;
        Long l = this.createdOn;
        Long l2 = this.expiresOn;
        Boolean bool = this.paymentFlag;
        ArrayList<String> arrayList = this.paymentRefIds;
        Integer num2 = this.sortOrder;
        Long l3 = this.startedOn;
        String str6 = this.userId;
        StringBuilder sb = new StringBuilder("ModuleSubscriptionData(id=");
        sb.append(str);
        sb.append(", accessLevel=");
        sb.append(num);
        sb.append(", contentId=");
        sb.append(str2);
        sb.append(", contentNameForEvent=");
        sb.append(str3);
        sb.append(", contentType=");
        sb.append(str4);
        sb.append(", courseId=");
        sb.append(str5);
        sb.append(", createdOn=");
        sb.append(l);
        sb.append(", expiresOn=");
        sb.append(l2);
        sb.append(", paymentFlag=");
        sb.append(bool);
        sb.append(", paymentRefIds=");
        sb.append(arrayList);
        sb.append(", sortOrder=");
        sb.append(num2);
        sb.append(", startedOn=");
        sb.append(l3);
        sb.append(", userId=");
        sb.append(str6);
        sb.append(")");
        return sb.toString();
    }
}
