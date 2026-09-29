package com.marrow.data.models.magicModule;

import kotlin.Metadata;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013JB\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0010J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\rR\u0017\u0010\u001b\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u001a\u0010\u001e\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001c\u001a\u0004\b\u001f\u0010\rR\u001a\u0010 \u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010\u0010R\u001a\u0010#\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010!\u001a\u0004\b$\u0010\u0010R\u001a\u0010%\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010\u0013"}, d2 = {"Lcom/marrow/data/models/magicModule/MagicModuleTimeline;", "", "", "p0", "p1", "", "p2", "p3", "", "p4", "<init>", "(Ljava/lang/String;Ljava/lang/String;IIJ)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()I", "component4", "component5", "()J", "copy", "(Ljava/lang/String;Ljava/lang/String;IIJ)Lcom/marrow/data/models/magicModule/MagicModuleTimeline;", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "id", "Ljava/lang/String;", "getId", "title", "getTitle", "correctCount", "I", "getCorrectCount", "mcqCount", "getMcqCount", "submittedOn", "J", "getSubmittedOn"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class MagicModuleTimeline {
    private final int correctCount;
    private final String id;
    private final int mcqCount;
    private final long submittedOn;
    private final String title;

    public MagicModuleTimeline(String str, String str2, int i, int i2, long j) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        this.id = str;
        this.title = str2;
        this.correctCount = i;
        this.mcqCount = i2;
        this.submittedOn = j;
    }

    public final String getId() {
        return this.id;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int getCorrectCount() {
        return this.correctCount;
    }

    public final int getMcqCount() {
        return this.mcqCount;
    }

    public final long getSubmittedOn() {
        return this.submittedOn;
    }

    public static /* synthetic */ MagicModuleTimeline copy$default(MagicModuleTimeline magicModuleTimeline, String str, String str2, int i, int i2, long j, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = magicModuleTimeline.id;
        }
        if ((i3 & 2) != 0) {
            str2 = magicModuleTimeline.title;
        }
        String str3 = str2;
        if ((i3 & 4) != 0) {
            i = magicModuleTimeline.correctCount;
        }
        int i4 = i;
        if ((i3 & 8) != 0) {
            i2 = magicModuleTimeline.mcqCount;
        }
        int i5 = i2;
        if ((i3 & 16) != 0) {
            j = magicModuleTimeline.submittedOn;
        }
        return magicModuleTimeline.copy(str, str3, i4, i5, j);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getCorrectCount() {
        return this.correctCount;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getMcqCount() {
        return this.mcqCount;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final long getSubmittedOn() {
        return this.submittedOn;
    }

    public final MagicModuleTimeline copy(String p0, String p1, int p2, int p3, long p4) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        return new MagicModuleTimeline(p0, p1, p2, p3, p4);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof MagicModuleTimeline)) {
            return false;
        }
        MagicModuleTimeline magicModuleTimeline = (MagicModuleTimeline) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.id, (Object) magicModuleTimeline.id) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.title, (Object) magicModuleTimeline.title) && this.correctCount == magicModuleTimeline.correctCount && this.mcqCount == magicModuleTimeline.mcqCount && this.submittedOn == magicModuleTimeline.submittedOn;
    }

    public final int hashCode() {
        return (((((((this.id.hashCode() * 31) + this.title.hashCode()) * 31) + Integer.hashCode(this.correctCount)) * 31) + Integer.hashCode(this.mcqCount)) * 31) + Long.hashCode(this.submittedOn);
    }

    public final String toString() {
        String str = this.id;
        String str2 = this.title;
        int i = this.correctCount;
        int i2 = this.mcqCount;
        long j = this.submittedOn;
        StringBuilder sb = new StringBuilder("MagicModuleTimeline(id=");
        sb.append(str);
        sb.append(", title=");
        sb.append(str2);
        sb.append(", correctCount=");
        sb.append(i);
        sb.append(", mcqCount=");
        sb.append(i2);
        sb.append(", submittedOn=");
        sb.append(j);
        sb.append(")");
        return sb.toString();
    }
}
