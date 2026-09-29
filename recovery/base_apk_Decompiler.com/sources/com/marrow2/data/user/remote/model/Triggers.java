package com.marrow2.data.user.remote.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;
import kotlin.MagicModuleRepositoryImplExternalSyntheticLambda0;
import kotlin.Metadata;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes.dex */
@JsonIgnoreProperties(ignoreUnknown = true)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\fJ\u001e\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010JL\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0013\u001a\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\fR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001b\u001a\u0004\b\u001e\u0010\fR\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u001b\u001a\u0004\b \u0010\fR(\u0010!\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010\u0010"}, d2 = {"Lcom/marrow2/data/user/remote/model/Triggers;", "", "", "p0", "p1", "p2", "", "", "p3", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/Map;)V", "component1", "()Ljava/lang/Boolean;", "component2", "component3", "component4", "()Ljava/util/Map;", "copy", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/Map;)Lcom/marrow2/data/user/remote/model/Triggers;", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "practicalCornerInteracted", "Ljava/lang/Boolean;", "getPracticalCornerInteracted", "cadavericVideosPopupAcknowledged", "getCadavericVideosPopupAcknowledged", "worMcqDiscussionAck", "getWorMcqDiscussionAck", "popupAck", "Ljava/util/Map;", "getPopupAck"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class Triggers {
    public static final int $stable = 8;

    @JsonProperty("cadaveric_video_pop_up_ack")
    private final Boolean cadavericVideosPopupAcknowledged;

    @JsonProperty("popup_ack")
    private final Map<String, Boolean> popupAck;

    @JsonProperty("practical_corner_ack")
    private final Boolean practicalCornerInteracted;

    @JsonProperty("wor_mcq_discussion_ack")
    private final Boolean worMcqDiscussionAck;

    public Triggers(Boolean bool, Boolean bool2, Boolean bool3, Map<String, Boolean> map) {
        this.practicalCornerInteracted = bool;
        this.cadavericVideosPopupAcknowledged = bool2;
        this.worMcqDiscussionAck = bool3;
        this.popupAck = map;
    }

    public /* synthetic */ Triggers(Boolean bool, Boolean bool2, Boolean bool3, Map map, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : bool2, (i & 4) != 0 ? null : bool3, (i & 8) != 0 ? null : map);
    }

    public final Boolean getPracticalCornerInteracted() {
        return this.practicalCornerInteracted;
    }

    public final Boolean getCadavericVideosPopupAcknowledged() {
        return this.cadavericVideosPopupAcknowledged;
    }

    public final Boolean getWorMcqDiscussionAck() {
        return this.worMcqDiscussionAck;
    }

    public final Map<String, Boolean> getPopupAck() {
        return this.popupAck;
    }

    public Triggers() {
        this(null, null, null, null, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Triggers copy$default(Triggers triggers, Boolean bool, Boolean bool2, Boolean bool3, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = triggers.practicalCornerInteracted;
        }
        if ((i & 2) != 0) {
            bool2 = triggers.cadavericVideosPopupAcknowledged;
        }
        if ((i & 4) != 0) {
            bool3 = triggers.worMcqDiscussionAck;
        }
        if ((i & 8) != 0) {
            map = triggers.popupAck;
        }
        return triggers.copy(bool, bool2, bool3, map);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Boolean getPracticalCornerInteracted() {
        return this.practicalCornerInteracted;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Boolean getCadavericVideosPopupAcknowledged() {
        return this.cadavericVideosPopupAcknowledged;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Boolean getWorMcqDiscussionAck() {
        return this.worMcqDiscussionAck;
    }

    public final Map<String, Boolean> component4() {
        return this.popupAck;
    }

    public final Triggers copy(Boolean p0, Boolean p1, Boolean p2, Map<String, Boolean> p3) {
        return new Triggers(p0, p1, p2, p3);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof Triggers)) {
            return false;
        }
        Triggers triggers = (Triggers) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.practicalCornerInteracted, triggers.practicalCornerInteracted) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.cadavericVideosPopupAcknowledged, triggers.cadavericVideosPopupAcknowledged) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.worMcqDiscussionAck, triggers.worMcqDiscussionAck) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.popupAck, triggers.popupAck);
    }

    public final int hashCode() {
        Boolean bool = this.practicalCornerInteracted;
        int iHashCode = bool == null ? 0 : bool.hashCode();
        Boolean bool2 = this.cadavericVideosPopupAcknowledged;
        int iHashCode2 = bool2 == null ? 0 : bool2.hashCode();
        Boolean bool3 = this.worMcqDiscussionAck;
        int iHashCode3 = bool3 == null ? 0 : bool3.hashCode();
        Map<String, Boolean> map = this.popupAck;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        Boolean bool = this.practicalCornerInteracted;
        Boolean bool2 = this.cadavericVideosPopupAcknowledged;
        Boolean bool3 = this.worMcqDiscussionAck;
        Map<String, Boolean> map = this.popupAck;
        StringBuilder sb = new StringBuilder("Triggers(practicalCornerInteracted=");
        sb.append(bool);
        sb.append(", cadavericVideosPopupAcknowledged=");
        sb.append(bool2);
        sb.append(", worMcqDiscussionAck=");
        sb.append(bool3);
        sb.append(", popupAck=");
        sb.append(map);
        sb.append(")");
        return sb.toString();
    }
}
