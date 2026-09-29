package com.marrow.data.models.mcq.schema;

import kotlin.Metadata;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ8\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000eJ\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u000bR\u0017\u0010\u0017\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u000bR\u001a\u0010\u001a\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0018\u001a\u0004\b\u001b\u0010\u000bR\u001a\u0010\u001c\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u000eR\u001a\u0010\u001f\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u001d\u001a\u0004\b \u0010\u000eR\u001a\u0010!\u001a\u00020\u00128\u0007X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b!\u0010#"}, d2 = {"Lcom/marrow/data/models/mcq/schema/LessonQbankItem;", "", "", "p0", "p1", "", "p2", "p3", "<init>", "(Ljava/lang/String;Ljava/lang/String;II)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()I", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;II)Lcom/marrow/data/models/mcq/schema/LessonQbankItem;", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "lessonId", "Ljava/lang/String;", "getLessonId", "lessonName", "getLessonName", "status", "I", "getStatus", "mcqCount", "getMcqCount", "isQbankSolved", "Z", "()Z"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class LessonQbankItem {
    private final boolean isQbankSolved;
    private final String lessonId;
    private final String lessonName;
    private final int mcqCount;
    private final int status;

    public LessonQbankItem(String str, String str2, int i, int i2) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        this.lessonId = str;
        this.lessonName = str2;
        this.status = i;
        this.mcqCount = i2;
        this.isQbankSolved = i == 1;
    }

    public final String getLessonId() {
        return this.lessonId;
    }

    public final String getLessonName() {
        return this.lessonName;
    }

    public final int getStatus() {
        return this.status;
    }

    public final int getMcqCount() {
        return this.mcqCount;
    }

    /* JADX INFO: renamed from: isQbankSolved, reason: from getter */
    public final boolean getIsQbankSolved() {
        return this.isQbankSolved;
    }

    public static /* synthetic */ LessonQbankItem copy$default(LessonQbankItem lessonQbankItem, String str, String str2, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = lessonQbankItem.lessonId;
        }
        if ((i3 & 2) != 0) {
            str2 = lessonQbankItem.lessonName;
        }
        if ((i3 & 4) != 0) {
            i = lessonQbankItem.status;
        }
        if ((i3 & 8) != 0) {
            i2 = lessonQbankItem.mcqCount;
        }
        return lessonQbankItem.copy(str, str2, i, i2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getLessonId() {
        return this.lessonId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getLessonName() {
        return this.lessonName;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getMcqCount() {
        return this.mcqCount;
    }

    public final LessonQbankItem copy(String p0, String p1, int p2, int p3) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        return new LessonQbankItem(p0, p1, p2, p3);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof LessonQbankItem)) {
            return false;
        }
        LessonQbankItem lessonQbankItem = (LessonQbankItem) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.lessonId, (Object) lessonQbankItem.lessonId) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.lessonName, (Object) lessonQbankItem.lessonName) && this.status == lessonQbankItem.status && this.mcqCount == lessonQbankItem.mcqCount;
    }

    public final int hashCode() {
        return (((((this.lessonId.hashCode() * 31) + this.lessonName.hashCode()) * 31) + Integer.hashCode(this.status)) * 31) + Integer.hashCode(this.mcqCount);
    }

    public final String toString() {
        String str = this.lessonId;
        String str2 = this.lessonName;
        int i = this.status;
        int i2 = this.mcqCount;
        StringBuilder sb = new StringBuilder("LessonQbankItem(lessonId=");
        sb.append(str);
        sb.append(", lessonName=");
        sb.append(str2);
        sb.append(", status=");
        sb.append(i);
        sb.append(", mcqCount=");
        sb.append(i2);
        sb.append(")");
        return sb.toString();
    }
}
