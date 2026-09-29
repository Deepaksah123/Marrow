package com.marrow.data.api.models.response.lesson;

import kotlin.Metadata;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0010\u0010\u000e\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\fJB\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u000fJ\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\fR\u0017\u0010\u0019\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\fR\u001a\u0010\u001c\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001a\u001a\u0004\b\u001d\u0010\fR\u001a\u0010\u001e\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\u000fR\u001a\u0010!\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\u001f\u001a\u0004\b\"\u0010\u000fR\u001a\u0010#\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010\u001a\u001a\u0004\b$\u0010\f"}, d2 = {"Lcom/marrow/data/api/models/response/lesson/InteractiveVideoElementLSModel;", "", "", "p0", "p1", "", "p2", "p3", "p4", "<init>", "(Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()I", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;)Lcom/marrow/data/api/models/response/lesson/InteractiveVideoElementLSModel;", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "id", "Ljava/lang/String;", "getId", "lessonId", "getLessonId", "startTime", "I", "getStartTime", "endTime", "getEndTime", "answer", "getAnswer"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class InteractiveVideoElementLSModel {
    private final String answer;
    private final int endTime;
    private final String id;
    private final String lessonId;
    private final int startTime;

    public InteractiveVideoElementLSModel(String str, String str2, int i, int i2, String str3) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        toMagicModuleMetaRepoModel.write(str3, "");
        this.id = str;
        this.lessonId = str2;
        this.startTime = i;
        this.endTime = i2;
        this.answer = str3;
    }

    public final String getId() {
        return this.id;
    }

    public final String getLessonId() {
        return this.lessonId;
    }

    public final int getStartTime() {
        return this.startTime;
    }

    public final int getEndTime() {
        return this.endTime;
    }

    public final String getAnswer() {
        return this.answer;
    }

    public static /* synthetic */ InteractiveVideoElementLSModel copy$default(InteractiveVideoElementLSModel interactiveVideoElementLSModel, String str, String str2, int i, int i2, String str3, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = interactiveVideoElementLSModel.id;
        }
        if ((i3 & 2) != 0) {
            str2 = interactiveVideoElementLSModel.lessonId;
        }
        String str4 = str2;
        if ((i3 & 4) != 0) {
            i = interactiveVideoElementLSModel.startTime;
        }
        int i4 = i;
        if ((i3 & 8) != 0) {
            i2 = interactiveVideoElementLSModel.endTime;
        }
        int i5 = i2;
        if ((i3 & 16) != 0) {
            str3 = interactiveVideoElementLSModel.answer;
        }
        return interactiveVideoElementLSModel.copy(str, str4, i4, i5, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getLessonId() {
        return this.lessonId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getStartTime() {
        return this.startTime;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getEndTime() {
        return this.endTime;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getAnswer() {
        return this.answer;
    }

    public final InteractiveVideoElementLSModel copy(String p0, String p1, int p2, int p3, String p4) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        toMagicModuleMetaRepoModel.write(p4, "");
        return new InteractiveVideoElementLSModel(p0, p1, p2, p3, p4);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof InteractiveVideoElementLSModel)) {
            return false;
        }
        InteractiveVideoElementLSModel interactiveVideoElementLSModel = (InteractiveVideoElementLSModel) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.id, (Object) interactiveVideoElementLSModel.id) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.lessonId, (Object) interactiveVideoElementLSModel.lessonId) && this.startTime == interactiveVideoElementLSModel.startTime && this.endTime == interactiveVideoElementLSModel.endTime && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.answer, (Object) interactiveVideoElementLSModel.answer);
    }

    public final int hashCode() {
        return (((((((this.id.hashCode() * 31) + this.lessonId.hashCode()) * 31) + Integer.hashCode(this.startTime)) * 31) + Integer.hashCode(this.endTime)) * 31) + this.answer.hashCode();
    }

    public final String toString() {
        String str = this.id;
        String str2 = this.lessonId;
        int i = this.startTime;
        int i2 = this.endTime;
        String str3 = this.answer;
        StringBuilder sb = new StringBuilder("InteractiveVideoElementLSModel(id=");
        sb.append(str);
        sb.append(", lessonId=");
        sb.append(str2);
        sb.append(", startTime=");
        sb.append(i);
        sb.append(", endTime=");
        sb.append(i2);
        sb.append(", answer=");
        sb.append(str3);
        sb.append(")");
        return sb.toString();
    }
}
