package com.marrow2.data.magic_module.remote.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes.dex */
@JsonIgnoreProperties(ignoreUnknown = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\rJJ\u0010\u0014\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\rR\u001a\u0010\u001c\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\rR\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\u000fR\u001c\u0010\"\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010 \u001a\u0004\b#\u0010\u000fR\u001c\u0010$\u001a\u0004\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010\u0012R\u001c\u0010'\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010\u001d\u001a\u0004\b(\u0010\r"}, d2 = {"Lcom/marrow2/data/magic_module/remote/model/MagicModuleTimelineRSModel;", "", "", "p0", "", "p1", "p2", "", "p3", "p4", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Integer;", "component3", "component4", "()Ljava/lang/Long;", "component5", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/String;)Lcom/marrow2/data/magic_module/remote/model/MagicModuleTimelineRSModel;", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "id", "Ljava/lang/String;", "getId", "correctCount", "Ljava/lang/Integer;", "getCorrectCount", "mcqCount", "getMcqCount", "submittedOn", "Ljava/lang/Long;", "getSubmittedOn", "title", "getTitle"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class MagicModuleTimelineRSModel {
    public static final int $stable = 0;
    private final Integer correctCount;
    private final String id;
    private final Integer mcqCount;
    private final Long submittedOn;
    private final String title;

    public MagicModuleTimelineRSModel(@JsonProperty("_id") String str, @JsonProperty("correct_count") Integer num, @JsonProperty("mcq_count") Integer num2, @JsonProperty("submitted_on") Long l, @JsonProperty("title") String str2) {
        toMagicModuleMetaRepoModel.write(str, "");
        this.id = str;
        this.correctCount = num;
        this.mcqCount = num2;
        this.submittedOn = l;
        this.title = str2;
    }

    public final String getId() {
        return this.id;
    }

    public final Integer getCorrectCount() {
        return this.correctCount;
    }

    public final Integer getMcqCount() {
        return this.mcqCount;
    }

    public final Long getSubmittedOn() {
        return this.submittedOn;
    }

    public final String getTitle() {
        return this.title;
    }

    public static /* synthetic */ MagicModuleTimelineRSModel copy$default(MagicModuleTimelineRSModel magicModuleTimelineRSModel, String str, Integer num, Integer num2, Long l, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = magicModuleTimelineRSModel.id;
        }
        if ((i & 2) != 0) {
            num = magicModuleTimelineRSModel.correctCount;
        }
        Integer num3 = num;
        if ((i & 4) != 0) {
            num2 = magicModuleTimelineRSModel.mcqCount;
        }
        Integer num4 = num2;
        if ((i & 8) != 0) {
            l = magicModuleTimelineRSModel.submittedOn;
        }
        Long l2 = l;
        if ((i & 16) != 0) {
            str2 = magicModuleTimelineRSModel.title;
        }
        return magicModuleTimelineRSModel.copy(str, num3, num4, l2, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getCorrectCount() {
        return this.correctCount;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getMcqCount() {
        return this.mcqCount;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Long getSubmittedOn() {
        return this.submittedOn;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final MagicModuleTimelineRSModel copy(@JsonProperty("_id") String p0, @JsonProperty("correct_count") Integer p1, @JsonProperty("mcq_count") Integer p2, @JsonProperty("submitted_on") Long p3, @JsonProperty("title") String p4) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return new MagicModuleTimelineRSModel(p0, p1, p2, p3, p4);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof MagicModuleTimelineRSModel)) {
            return false;
        }
        MagicModuleTimelineRSModel magicModuleTimelineRSModel = (MagicModuleTimelineRSModel) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.id, (Object) magicModuleTimelineRSModel.id) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.correctCount, magicModuleTimelineRSModel.correctCount) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.mcqCount, magicModuleTimelineRSModel.mcqCount) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.submittedOn, magicModuleTimelineRSModel.submittedOn) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.title, (Object) magicModuleTimelineRSModel.title);
    }

    public final int hashCode() {
        int iHashCode = this.id.hashCode();
        Integer num = this.correctCount;
        int iHashCode2 = num == null ? 0 : num.hashCode();
        Integer num2 = this.mcqCount;
        int iHashCode3 = num2 == null ? 0 : num2.hashCode();
        Long l = this.submittedOn;
        int iHashCode4 = l == null ? 0 : l.hashCode();
        String str = this.title;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        String str = this.id;
        Integer num = this.correctCount;
        Integer num2 = this.mcqCount;
        Long l = this.submittedOn;
        String str2 = this.title;
        StringBuilder sb = new StringBuilder("MagicModuleTimelineRSModel(id=");
        sb.append(str);
        sb.append(", correctCount=");
        sb.append(num);
        sb.append(", mcqCount=");
        sb.append(num2);
        sb.append(", submittedOn=");
        sb.append(l);
        sb.append(", title=");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }
}
