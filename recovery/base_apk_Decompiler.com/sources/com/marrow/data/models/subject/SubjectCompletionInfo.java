package com.marrow.data.models.subject;

import kotlin.Metadata;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\n\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nR\u0016\u0010\f\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u000e\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\rR\u0016\u0010\u0010\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0012\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011R\u0016\u0010\u0014\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0016\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0011R\u0016\u0010\u0017\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0011R\u0016\u0010\u0018\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001a\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u0016\u0010\u001b\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u0015R\u0016\u0010\u001c\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u0011"}, d2 = {"Lcom/marrow/data/models/subject/SubjectCompletionInfo;", "", "<init>", "()V", "p0", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "id", "Ljava/lang/String;", "title", "imageUrl", "totalLessons", "I", "completedCount", "", "lastOpened", "J", "cardType", "totalNewLessons", "isInteractive", "Z", "allNewActive", "allNewExpiresOn", "allNewActiveEdition", "Companion"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SubjectCompletionInfo {
    public static final int CARD_TYPE_SUBJECT_QBANK = 3;
    public static final int CARD_TYPE_SUBJECT_VIDEO = 2;
    public boolean allNewActive;
    public int allNewActiveEdition;
    public long allNewExpiresOn;
    public int cardType;
    public int completedCount;
    public String imageUrl;
    public boolean isInteractive;
    public long lastOpened;
    public int totalLessons;
    public int totalNewLessons;
    public String id = "";
    public String title = "";

    public final boolean equals(Object p0) {
        if (!(p0 instanceof SubjectCompletionInfo)) {
            return super.equals(p0);
        }
        SubjectCompletionInfo subjectCompletionInfo = (SubjectCompletionInfo) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.id, (Object) subjectCompletionInfo.id) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.title, (Object) subjectCompletionInfo.title) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.imageUrl, (Object) subjectCompletionInfo.imageUrl) && this.totalLessons == subjectCompletionInfo.totalLessons && this.cardType == subjectCompletionInfo.cardType && this.completedCount == subjectCompletionInfo.completedCount && this.totalNewLessons == subjectCompletionInfo.totalNewLessons && this.isInteractive == subjectCompletionInfo.isInteractive && this.allNewActive == subjectCompletionInfo.allNewActive && this.allNewExpiresOn == subjectCompletionInfo.allNewExpiresOn && this.allNewActiveEdition == subjectCompletionInfo.allNewActiveEdition;
    }

    public final int hashCode() {
        int iHashCode = this.id.hashCode();
        int iHashCode2 = this.title.hashCode();
        String str = this.imageUrl;
        int iHashCode3 = str != null ? str.hashCode() : 0;
        int i = this.totalLessons;
        int i2 = this.cardType;
        int i3 = this.completedCount;
        int i4 = this.totalNewLessons;
        return (((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + i) * 31) + i2) * 31) + i3) * 31) + i4) * 31) + Boolean.hashCode(this.isInteractive)) * 31) + Boolean.hashCode(this.allNewActive)) * 31) + Long.hashCode(this.allNewExpiresOn)) * 31) + this.allNewActiveEdition;
    }
}
