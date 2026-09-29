package com.marrow2.data.user.remote.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.MagicModuleRepositoryImplExternalSyntheticLambda0;
import kotlin.Metadata;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes.dex */
@JsonIgnoreProperties(ignoreUnknown = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000bJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ@\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0012\u001a\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u000fR\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u000bR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0019\u001a\u0004\b\u001c\u0010\u000bR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0019\u001a\u0004\b\u001e\u0010\u000bR\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\u000f"}, d2 = {"Lcom/marrow2/data/user/remote/model/SaveUserAcknowledgementsRequestBody;", "", "", "p0", "p1", "p2", "", "p3", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;)V", "component1", "()Ljava/lang/Boolean;", "component2", "component3", "component4", "()Ljava/lang/String;", "copy", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;)Lcom/marrow2/data/user/remote/model/SaveUserAcknowledgementsRequestBody;", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "practicalCornerAck", "Ljava/lang/Boolean;", "getPracticalCornerAck", "cadavericVideosPopupAcknowledged", "getCadavericVideosPopupAcknowledged", "worMcqDiscussionAck", "getWorMcqDiscussionAck", "popupAckKey", "Ljava/lang/String;", "getPopupAckKey"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SaveUserAcknowledgementsRequestBody {
    public static final int $stable = 0;

    @JsonProperty("cadaveric_video_pop_up_ack")
    private final Boolean cadavericVideosPopupAcknowledged;

    @JsonProperty("popup_ack_key")
    private final String popupAckKey;

    @JsonProperty("practical_corner_ack")
    private final Boolean practicalCornerAck;

    @JsonProperty("wor_mcq_discussion_ack")
    private final Boolean worMcqDiscussionAck;

    public SaveUserAcknowledgementsRequestBody(Boolean bool, Boolean bool2, Boolean bool3, String str) {
        this.practicalCornerAck = bool;
        this.cadavericVideosPopupAcknowledged = bool2;
        this.worMcqDiscussionAck = bool3;
        this.popupAckKey = str;
    }

    public /* synthetic */ SaveUserAcknowledgementsRequestBody(Boolean bool, Boolean bool2, Boolean bool3, String str, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : bool2, (i & 4) != 0 ? null : bool3, (i & 8) != 0 ? null : str);
    }

    public final Boolean getPracticalCornerAck() {
        return this.practicalCornerAck;
    }

    public final Boolean getCadavericVideosPopupAcknowledged() {
        return this.cadavericVideosPopupAcknowledged;
    }

    public final Boolean getWorMcqDiscussionAck() {
        return this.worMcqDiscussionAck;
    }

    public final String getPopupAckKey() {
        return this.popupAckKey;
    }

    public SaveUserAcknowledgementsRequestBody() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ SaveUserAcknowledgementsRequestBody copy$default(SaveUserAcknowledgementsRequestBody saveUserAcknowledgementsRequestBody, Boolean bool, Boolean bool2, Boolean bool3, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = saveUserAcknowledgementsRequestBody.practicalCornerAck;
        }
        if ((i & 2) != 0) {
            bool2 = saveUserAcknowledgementsRequestBody.cadavericVideosPopupAcknowledged;
        }
        if ((i & 4) != 0) {
            bool3 = saveUserAcknowledgementsRequestBody.worMcqDiscussionAck;
        }
        if ((i & 8) != 0) {
            str = saveUserAcknowledgementsRequestBody.popupAckKey;
        }
        return saveUserAcknowledgementsRequestBody.copy(bool, bool2, bool3, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Boolean getPracticalCornerAck() {
        return this.practicalCornerAck;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Boolean getCadavericVideosPopupAcknowledged() {
        return this.cadavericVideosPopupAcknowledged;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Boolean getWorMcqDiscussionAck() {
        return this.worMcqDiscussionAck;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getPopupAckKey() {
        return this.popupAckKey;
    }

    public final SaveUserAcknowledgementsRequestBody copy(Boolean p0, Boolean p1, Boolean p2, String p3) {
        return new SaveUserAcknowledgementsRequestBody(p0, p1, p2, p3);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof SaveUserAcknowledgementsRequestBody)) {
            return false;
        }
        SaveUserAcknowledgementsRequestBody saveUserAcknowledgementsRequestBody = (SaveUserAcknowledgementsRequestBody) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.practicalCornerAck, saveUserAcknowledgementsRequestBody.practicalCornerAck) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.cadavericVideosPopupAcknowledged, saveUserAcknowledgementsRequestBody.cadavericVideosPopupAcknowledged) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.worMcqDiscussionAck, saveUserAcknowledgementsRequestBody.worMcqDiscussionAck) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.popupAckKey, (Object) saveUserAcknowledgementsRequestBody.popupAckKey);
    }

    public final int hashCode() {
        Boolean bool = this.practicalCornerAck;
        int iHashCode = bool == null ? 0 : bool.hashCode();
        Boolean bool2 = this.cadavericVideosPopupAcknowledged;
        int iHashCode2 = bool2 == null ? 0 : bool2.hashCode();
        Boolean bool3 = this.worMcqDiscussionAck;
        int iHashCode3 = bool3 == null ? 0 : bool3.hashCode();
        String str = this.popupAckKey;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        Boolean bool = this.practicalCornerAck;
        Boolean bool2 = this.cadavericVideosPopupAcknowledged;
        Boolean bool3 = this.worMcqDiscussionAck;
        String str = this.popupAckKey;
        StringBuilder sb = new StringBuilder("SaveUserAcknowledgementsRequestBody(practicalCornerAck=");
        sb.append(bool);
        sb.append(", cadavericVideosPopupAcknowledged=");
        sb.append(bool2);
        sb.append(", worMcqDiscussionAck=");
        sb.append(bool3);
        sb.append(", popupAckKey=");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }
}
