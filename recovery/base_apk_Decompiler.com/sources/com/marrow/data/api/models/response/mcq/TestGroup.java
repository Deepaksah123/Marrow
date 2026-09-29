package com.marrow.data.api.models.response.mcq;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import kotlin.Metadata;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes.dex */
@JsonIgnoreProperties(ignoreUnknown = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001BS\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0001\u0010\b\u001a\u00020\u0005\u0012\b\b\u0001\u0010\t\u001a\u00020\u0005\u0012\u000e\b\u0001\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0012J\u0010\u0010\u0015\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0012J\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\nHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\\\u0010\u0018\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u00022\b\b\u0003\u0010\u0006\u001a\u00020\u00052\b\b\u0003\u0010\u0007\u001a\u00020\u00052\b\b\u0003\u0010\b\u001a\u00020\u00052\b\b\u0003\u0010\t\u001a\u00020\u00052\u000e\b\u0003\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\nHÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0012J\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u000fR\u0017\u0010\u001f\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\u000fR\u001a\u0010\"\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010 \u001a\u0004\b#\u0010\u000fR\u001a\u0010$\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010\u0012R\u001a\u0010'\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010%\u001a\u0004\b(\u0010\u0012R\u001a\u0010)\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010%\u001a\u0004\b*\u0010\u0012R\u001a\u0010+\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010%\u001a\u0004\b,\u0010\u0012R \u0010-\u001a\b\u0012\u0004\u0012\u00020\u00020\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u0010\u0017"}, d2 = {"Lcom/marrow/data/api/models/response/mcq/TestGroup;", "", "", "p0", "p1", "", "p2", "p3", "p4", "p5", "", "p6", "<init>", "(Ljava/lang/String;Ljava/lang/String;IIIILjava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()I", "component4", "component5", "component6", "component7", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/lang/String;IIIILjava/util/List;)Lcom/marrow/data/api/models/response/mcq/TestGroup;", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "id", "Ljava/lang/String;", "getId", "name", "getName", "type", "I", "getType", "questionCount", "getQuestionCount", "sectionTimeInSec", "getSectionTimeInSec", "cutOffTime", "getCutOffTime", "groupMcqId", "Ljava/util/List;", "getGroupMcqId"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TestGroup {
    private final int cutOffTime;
    private final List<String> groupMcqId;
    private final String id;
    private final String name;
    private final int questionCount;
    private final int sectionTimeInSec;
    private final int type;

    public TestGroup(@JsonProperty("id") String str, @JsonProperty("name") String str2, @JsonProperty("type") int i, @JsonProperty("question_count") int i2, @JsonProperty("section_time") int i3, @JsonProperty("cutoff_time") int i4, @JsonProperty("group_mcq_ids") List<String> list) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        toMagicModuleMetaRepoModel.write(list, "");
        this.id = str;
        this.name = str2;
        this.type = i;
        this.questionCount = i2;
        this.sectionTimeInSec = i3;
        this.cutOffTime = i4;
        this.groupMcqId = list;
    }

    public final String getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public final int getType() {
        return this.type;
    }

    public final int getQuestionCount() {
        return this.questionCount;
    }

    public final int getSectionTimeInSec() {
        return this.sectionTimeInSec;
    }

    public final int getCutOffTime() {
        return this.cutOffTime;
    }

    public final List<String> getGroupMcqId() {
        return this.groupMcqId;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TestGroup copy$default(TestGroup testGroup, String str, String str2, int i, int i2, int i3, int i4, List list, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            str = testGroup.id;
        }
        if ((i5 & 2) != 0) {
            str2 = testGroup.name;
        }
        String str3 = str2;
        if ((i5 & 4) != 0) {
            i = testGroup.type;
        }
        int i6 = i;
        if ((i5 & 8) != 0) {
            i2 = testGroup.questionCount;
        }
        int i7 = i2;
        if ((i5 & 16) != 0) {
            i3 = testGroup.sectionTimeInSec;
        }
        int i8 = i3;
        if ((i5 & 32) != 0) {
            i4 = testGroup.cutOffTime;
        }
        int i9 = i4;
        if ((i5 & 64) != 0) {
            list = testGroup.groupMcqId;
        }
        return testGroup.copy(str, str3, i6, i7, i8, i9, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getQuestionCount() {
        return this.questionCount;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getSectionTimeInSec() {
        return this.sectionTimeInSec;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getCutOffTime() {
        return this.cutOffTime;
    }

    public final List<String> component7() {
        return this.groupMcqId;
    }

    public final TestGroup copy(@JsonProperty("id") String p0, @JsonProperty("name") String p1, @JsonProperty("type") int p2, @JsonProperty("question_count") int p3, @JsonProperty("section_time") int p4, @JsonProperty("cutoff_time") int p5, @JsonProperty("group_mcq_ids") List<String> p6) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        toMagicModuleMetaRepoModel.write(p6, "");
        return new TestGroup(p0, p1, p2, p3, p4, p5, p6);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof TestGroup)) {
            return false;
        }
        TestGroup testGroup = (TestGroup) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.id, (Object) testGroup.id) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.name, (Object) testGroup.name) && this.type == testGroup.type && this.questionCount == testGroup.questionCount && this.sectionTimeInSec == testGroup.sectionTimeInSec && this.cutOffTime == testGroup.cutOffTime && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.groupMcqId, testGroup.groupMcqId);
    }

    public final int hashCode() {
        return (((((((((((this.id.hashCode() * 31) + this.name.hashCode()) * 31) + Integer.hashCode(this.type)) * 31) + Integer.hashCode(this.questionCount)) * 31) + Integer.hashCode(this.sectionTimeInSec)) * 31) + Integer.hashCode(this.cutOffTime)) * 31) + this.groupMcqId.hashCode();
    }

    public final String toString() {
        String str = this.id;
        String str2 = this.name;
        int i = this.type;
        int i2 = this.questionCount;
        int i3 = this.sectionTimeInSec;
        int i4 = this.cutOffTime;
        List<String> list = this.groupMcqId;
        StringBuilder sb = new StringBuilder("TestGroup(id=");
        sb.append(str);
        sb.append(", name=");
        sb.append(str2);
        sb.append(", type=");
        sb.append(i);
        sb.append(", questionCount=");
        sb.append(i2);
        sb.append(", sectionTimeInSec=");
        sb.append(i3);
        sb.append(", cutOffTime=");
        sb.append(i4);
        sb.append(", groupMcqId=");
        sb.append(list);
        sb.append(")");
        return sb.toString();
    }
}
