package com.marrow.data.models.subject;

import kotlin.Metadata;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u000bJ\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\tR\u0017\u0010\u0013\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\tR\u001a\u0010\u0016\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u000b"}, d2 = {"Lcom/marrow/data/models/subject/SubjectIntroSkip;", "", "", "p0", "", "p1", "<init>", "(Ljava/lang/String;I)V", "component1", "()Ljava/lang/String;", "component2", "()I", "copy", "(Ljava/lang/String;I)Lcom/marrow/data/models/subject/SubjectIntroSkip;", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "subjectId", "Ljava/lang/String;", "getSubjectId", "skippedCount", "I", "getSkippedCount"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SubjectIntroSkip {
    private final int skippedCount;
    private final String subjectId;

    public SubjectIntroSkip(String str, int i) {
        toMagicModuleMetaRepoModel.write(str, "");
        this.subjectId = str;
        this.skippedCount = i;
    }

    public final String getSubjectId() {
        return this.subjectId;
    }

    public final int getSkippedCount() {
        return this.skippedCount;
    }

    public static /* synthetic */ SubjectIntroSkip copy$default(SubjectIntroSkip subjectIntroSkip, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = subjectIntroSkip.subjectId;
        }
        if ((i2 & 2) != 0) {
            i = subjectIntroSkip.skippedCount;
        }
        return subjectIntroSkip.copy(str, i);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSubjectId() {
        return this.subjectId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getSkippedCount() {
        return this.skippedCount;
    }

    public final SubjectIntroSkip copy(String p0, int p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return new SubjectIntroSkip(p0, p1);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof SubjectIntroSkip)) {
            return false;
        }
        SubjectIntroSkip subjectIntroSkip = (SubjectIntroSkip) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.subjectId, (Object) subjectIntroSkip.subjectId) && this.skippedCount == subjectIntroSkip.skippedCount;
    }

    public final int hashCode() {
        return (this.subjectId.hashCode() * 31) + Integer.hashCode(this.skippedCount);
    }

    public final String toString() {
        String str = this.subjectId;
        int i = this.skippedCount;
        StringBuilder sb = new StringBuilder("SubjectIntroSkip(subjectId=");
        sb.append(str);
        sb.append(", skippedCount=");
        sb.append(i);
        sb.append(")");
        return sb.toString();
    }
}
