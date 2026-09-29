package com.marrow.data.models.common;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.marrow.data.models.pearl.PearlMini;
import java.util.List;
import kotlin.MagicModuleRepositoryImplExternalSyntheticLambda0;
import kotlin.Metadata;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes.dex */
@JsonIgnoreProperties(ignoreUnknown = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b/\b\u0087\b\u0018\u00002\u00020\u0001Bg\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0010\b\u0003\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007\u0012\b\b\u0001\u0010\n\u001a\u00020\t\u0012\b\b\u0001\u0010\f\u001a\u00020\u000b\u0012\b\b\u0001\u0010\r\u001a\u00020\u0002\u0012\u0010\b\u0003\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0012J\u0010\u0010\u0016\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0012J\u0018\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0014Jp\u0010\u001e\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\u0010\b\u0003\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00042\b\b\u0003\u0010\u0006\u001a\u00020\u00022\b\b\u0003\u0010\b\u001a\u00020\u00072\b\b\u0003\u0010\n\u001a\u00020\t2\b\b\u0003\u0010\f\u001a\u00020\u000b2\b\b\u0003\u0010\r\u001a\u00020\u00022\u0010\b\u0003\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010 \u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\"\u0010\u001bJ\u0010\u0010#\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b#\u0010\u0012R\u0017\u0010$\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010\u0012R\"\u0010'\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010\u0014R\u001a\u0010*\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010%\u001a\u0004\b+\u0010\u0012R\u001a\u0010,\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010\u0017R\u001a\u0010/\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b/\u0010\u0019R\u001a\u00101\u001a\u00020\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u0010\u001bR\u001a\u00104\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b4\u0010%\u001a\u0004\b5\u0010\u0012R\"\u00106\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b6\u0010(\u001a\u0004\b7\u0010\u0014R\"\u00108\u001a\u00020\t8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b8\u00100\u001a\u0004\b8\u0010\u0019\"\u0004\b9\u0010:"}, d2 = {"Lcom/marrow/data/models/common/Schema;", "", "", "p0", "", "p1", "p2", "", "p3", "", "p4", "", "p5", "p6", "p7", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;JZILjava/lang/String;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "component3", "component4", "()J", "component5", "()Z", "component6", "()I", "component7", "component8", "copy", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;JZILjava/lang/String;Ljava/util/List;)Lcom/marrow/data/models/common/Schema;", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "id", "Ljava/lang/String;", "getId", "rootSubjectIds", "Ljava/util/List;", "getRootSubjectIds", "title", "getTitle", "lastUpdated", "J", "getLastUpdated", "isHyt", "Z", "mcqCount", "I", "getMcqCount", "publishedStatus", "getPublishedStatus", "exams", "getExams", "isServerContentUpdated", "setServerContentUpdated", "(Z)V"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class Schema {
    private final List<String> exams;
    private final String id;
    private final boolean isHyt;

    @JsonIgnore
    private boolean isServerContentUpdated;
    private final long lastUpdated;
    private final int mcqCount;
    private final String publishedStatus;
    private final List<String> rootSubjectIds;
    private final String title;

    public Schema(@JsonProperty("_id") String str, @JsonProperty(PearlMini.KEY_ROOT_SUBJECT_IDS) List<String> list, @JsonProperty("title") String str2, @JsonProperty("last_updated") long j, @JsonProperty("is_hyt") boolean z, @JsonProperty("hyt_mcq_count") int i, @JsonProperty("published_status") String str3, @JsonProperty("exams") List<String> list2) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        toMagicModuleMetaRepoModel.write(str3, "");
        this.id = str;
        this.rootSubjectIds = list;
        this.title = str2;
        this.lastUpdated = j;
        this.isHyt = z;
        this.mcqCount = i;
        this.publishedStatus = str3;
        this.exams = list2;
    }

    public /* synthetic */ Schema(String str, List list, String str2, long j, boolean z, int i, String str3, List list2, int i2, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(str, (i2 & 2) != 0 ? null : list, str2, j, z, i, str3, (i2 & 128) != 0 ? null : list2);
    }

    public final String getId() {
        return this.id;
    }

    public final List<String> getRootSubjectIds() {
        return this.rootSubjectIds;
    }

    public final String getTitle() {
        return this.title;
    }

    public final long getLastUpdated() {
        return this.lastUpdated;
    }

    public final boolean isHyt() {
        return this.isHyt;
    }

    public final int getMcqCount() {
        return this.mcqCount;
    }

    public final String getPublishedStatus() {
        return this.publishedStatus;
    }

    public final List<String> getExams() {
        return this.exams;
    }

    /* JADX INFO: renamed from: isServerContentUpdated, reason: from getter */
    public final boolean getIsServerContentUpdated() {
        return this.isServerContentUpdated;
    }

    public final void setServerContentUpdated(boolean z) {
        this.isServerContentUpdated = z;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    public final List<String> component2() {
        return this.rootSubjectIds;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getLastUpdated() {
        return this.lastUpdated;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getIsHyt() {
        return this.isHyt;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getMcqCount() {
        return this.mcqCount;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getPublishedStatus() {
        return this.publishedStatus;
    }

    public final List<String> component8() {
        return this.exams;
    }

    public final Schema copy(@JsonProperty("_id") String p0, @JsonProperty(PearlMini.KEY_ROOT_SUBJECT_IDS) List<String> p1, @JsonProperty("title") String p2, @JsonProperty("last_updated") long p3, @JsonProperty("is_hyt") boolean p4, @JsonProperty("hyt_mcq_count") int p5, @JsonProperty("published_status") String p6, @JsonProperty("exams") List<String> p7) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p2, "");
        toMagicModuleMetaRepoModel.write(p6, "");
        return new Schema(p0, p1, p2, p3, p4, p5, p6, p7);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof Schema)) {
            return false;
        }
        Schema schema = (Schema) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.id, (Object) schema.id) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.rootSubjectIds, schema.rootSubjectIds) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.title, (Object) schema.title) && this.lastUpdated == schema.lastUpdated && this.isHyt == schema.isHyt && this.mcqCount == schema.mcqCount && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.publishedStatus, (Object) schema.publishedStatus) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.exams, schema.exams);
    }

    public final int hashCode() {
        int iHashCode = this.id.hashCode();
        List<String> list = this.rootSubjectIds;
        int iHashCode2 = list == null ? 0 : list.hashCode();
        int iHashCode3 = this.title.hashCode();
        int iHashCode4 = Long.hashCode(this.lastUpdated);
        int iHashCode5 = Boolean.hashCode(this.isHyt);
        int iHashCode6 = Integer.hashCode(this.mcqCount);
        int iHashCode7 = this.publishedStatus.hashCode();
        List<String> list2 = this.exams;
        return (((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        String str = this.id;
        List<String> list = this.rootSubjectIds;
        String str2 = this.title;
        long j = this.lastUpdated;
        boolean z = this.isHyt;
        int i = this.mcqCount;
        String str3 = this.publishedStatus;
        List<String> list2 = this.exams;
        StringBuilder sb = new StringBuilder("Schema(id=");
        sb.append(str);
        sb.append(", rootSubjectIds=");
        sb.append(list);
        sb.append(", title=");
        sb.append(str2);
        sb.append(", lastUpdated=");
        sb.append(j);
        sb.append(", isHyt=");
        sb.append(z);
        sb.append(", mcqCount=");
        sb.append(i);
        sb.append(", publishedStatus=");
        sb.append(str3);
        sb.append(", exams=");
        sb.append(list2);
        sb.append(")");
        return sb.toString();
    }
}
