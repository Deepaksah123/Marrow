package com.marrow.data.models.pearl;

import kotlin.Metadata;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ.\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\tR\u0017\u0010\u0015\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0018\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0019\u0010\tR\u001a\u0010\u001a\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u001b\u0010\t"}, d2 = {"Lcom/marrow/data/models/pearl/PearlTopicInfo;", "", "", "p0", "p1", "p2", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/marrow/data/models/pearl/PearlTopicInfo;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "pearlId", "Ljava/lang/String;", "getPearlId", "topicId", "getTopicId", "rootSubjectId", "getRootSubjectId"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PearlTopicInfo {
    private final String pearlId;
    private final String rootSubjectId;
    private final String topicId;

    public PearlTopicInfo(String str, String str2, String str3) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        toMagicModuleMetaRepoModel.write(str3, "");
        this.pearlId = str;
        this.topicId = str2;
        this.rootSubjectId = str3;
    }

    public final String getPearlId() {
        return this.pearlId;
    }

    public final String getTopicId() {
        return this.topicId;
    }

    public final String getRootSubjectId() {
        return this.rootSubjectId;
    }

    public static /* synthetic */ PearlTopicInfo copy$default(PearlTopicInfo pearlTopicInfo, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = pearlTopicInfo.pearlId;
        }
        if ((i & 2) != 0) {
            str2 = pearlTopicInfo.topicId;
        }
        if ((i & 4) != 0) {
            str3 = pearlTopicInfo.rootSubjectId;
        }
        return pearlTopicInfo.copy(str, str2, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPearlId() {
        return this.pearlId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTopicId() {
        return this.topicId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getRootSubjectId() {
        return this.rootSubjectId;
    }

    public final PearlTopicInfo copy(String p0, String p1, String p2) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        toMagicModuleMetaRepoModel.write(p2, "");
        return new PearlTopicInfo(p0, p1, p2);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof PearlTopicInfo)) {
            return false;
        }
        PearlTopicInfo pearlTopicInfo = (PearlTopicInfo) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.pearlId, (Object) pearlTopicInfo.pearlId) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.topicId, (Object) pearlTopicInfo.topicId) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.rootSubjectId, (Object) pearlTopicInfo.rootSubjectId);
    }

    public final int hashCode() {
        return (((this.pearlId.hashCode() * 31) + this.topicId.hashCode()) * 31) + this.rootSubjectId.hashCode();
    }

    public final String toString() {
        String str = this.pearlId;
        String str2 = this.topicId;
        String str3 = this.rootSubjectId;
        StringBuilder sb = new StringBuilder("PearlTopicInfo(pearlId=");
        sb.append(str);
        sb.append(", topicId=");
        sb.append(str2);
        sb.append(", rootSubjectId=");
        sb.append(str3);
        sb.append(")");
        return sb.toString();
    }
}
