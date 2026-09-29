package com.marrow.data.models.pearl;

import kotlin.Metadata;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\fJ\u0010\u0010\u000f\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\fJB\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0010J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\fR\u0017\u0010\u0019\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\fR\u001a\u0010\u001c\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001a\u001a\u0004\b\u001d\u0010\fR\u001a\u0010\u001e\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001a\u001a\u0004\b\u001f\u0010\fR\"\u0010 \u001a\u00020\u00068\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b \u0010\u0010\"\u0004\b\"\u0010#R\u001a\u0010$\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010\u001a\u001a\u0004\b%\u0010\f"}, d2 = {"Lcom/marrow/data/models/pearl/PearlListModel;", "", "", "p0", "p1", "p2", "", "p3", "p4", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()I", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)Lcom/marrow/data/models/pearl/PearlListModel;", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "pearId", "Ljava/lang/String;", "getPearId", "pearlDisplayId", "getPearlDisplayId", "pearlTitle", "getPearlTitle", "isBookmarked", "I", "setBookmarked", "(I)V", "subjectTitle", "getSubjectTitle"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PearlListModel {
    private int isBookmarked;
    private final String pearId;
    private final String pearlDisplayId;
    private final String pearlTitle;
    private final String subjectTitle;

    public PearlListModel(String str, String str2, String str3, int i, String str4) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        toMagicModuleMetaRepoModel.write(str3, "");
        toMagicModuleMetaRepoModel.write(str4, "");
        this.pearId = str;
        this.pearlDisplayId = str2;
        this.pearlTitle = str3;
        this.isBookmarked = i;
        this.subjectTitle = str4;
    }

    public final String getPearId() {
        return this.pearId;
    }

    public final String getPearlDisplayId() {
        return this.pearlDisplayId;
    }

    public final String getPearlTitle() {
        return this.pearlTitle;
    }

    public final int isBookmarked() {
        return this.isBookmarked;
    }

    public final void setBookmarked(int i) {
        this.isBookmarked = i;
    }

    public final String getSubjectTitle() {
        return this.subjectTitle;
    }

    public static /* synthetic */ PearlListModel copy$default(PearlListModel pearlListModel, String str, String str2, String str3, int i, String str4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = pearlListModel.pearId;
        }
        if ((i2 & 2) != 0) {
            str2 = pearlListModel.pearlDisplayId;
        }
        String str5 = str2;
        if ((i2 & 4) != 0) {
            str3 = pearlListModel.pearlTitle;
        }
        String str6 = str3;
        if ((i2 & 8) != 0) {
            i = pearlListModel.isBookmarked;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            str4 = pearlListModel.subjectTitle;
        }
        return pearlListModel.copy(str, str5, str6, i3, str4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPearId() {
        return this.pearId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPearlDisplayId() {
        return this.pearlDisplayId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getPearlTitle() {
        return this.pearlTitle;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getIsBookmarked() {
        return this.isBookmarked;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getSubjectTitle() {
        return this.subjectTitle;
    }

    public final PearlListModel copy(String p0, String p1, String p2, int p3, String p4) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        toMagicModuleMetaRepoModel.write(p2, "");
        toMagicModuleMetaRepoModel.write(p4, "");
        return new PearlListModel(p0, p1, p2, p3, p4);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof PearlListModel)) {
            return false;
        }
        PearlListModel pearlListModel = (PearlListModel) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.pearId, (Object) pearlListModel.pearId) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.pearlDisplayId, (Object) pearlListModel.pearlDisplayId) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.pearlTitle, (Object) pearlListModel.pearlTitle) && this.isBookmarked == pearlListModel.isBookmarked && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.subjectTitle, (Object) pearlListModel.subjectTitle);
    }

    public final int hashCode() {
        return (((((((this.pearId.hashCode() * 31) + this.pearlDisplayId.hashCode()) * 31) + this.pearlTitle.hashCode()) * 31) + Integer.hashCode(this.isBookmarked)) * 31) + this.subjectTitle.hashCode();
    }

    public final String toString() {
        String str = this.pearId;
        String str2 = this.pearlDisplayId;
        String str3 = this.pearlTitle;
        int i = this.isBookmarked;
        String str4 = this.subjectTitle;
        StringBuilder sb = new StringBuilder("PearlListModel(pearId=");
        sb.append(str);
        sb.append(", pearlDisplayId=");
        sb.append(str2);
        sb.append(", pearlTitle=");
        sb.append(str3);
        sb.append(", isBookmarked=");
        sb.append(i);
        sb.append(", subjectTitle=");
        sb.append(str4);
        sb.append(")");
        return sb.toString();
    }
}
