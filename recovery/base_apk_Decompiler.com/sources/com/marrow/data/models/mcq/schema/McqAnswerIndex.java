package com.marrow.data.models.mcq.schema;

import com.marrow.data.models.mcq.McqIndex;
import kotlin.Metadata;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ$\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u000eJ\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0015\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\fR\u001a\u0010\u0018\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u000e"}, d2 = {"Lcom/marrow/data/models/mcq/schema/McqAnswerIndex;", "", "Lcom/marrow/data/models/mcq/McqIndex;", "p0", "", "p1", "<init>", "(Lcom/marrow/data/models/mcq/McqIndex;I)V", "", "equals", "(Ljava/lang/Object;)Z", "component1", "()Lcom/marrow/data/models/mcq/McqIndex;", "component2", "()I", "copy", "(Lcom/marrow/data/models/mcq/McqIndex;I)Lcom/marrow/data/models/mcq/schema/McqAnswerIndex;", "hashCode", "", "toString", "()Ljava/lang/String;", "mcqIndex", "Lcom/marrow/data/models/mcq/McqIndex;", "getMcqIndex", "myAnswer", "I", "getMyAnswer"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class McqAnswerIndex {
    private final McqIndex mcqIndex;
    private final int myAnswer;

    public McqAnswerIndex(McqIndex mcqIndex, int i) {
        toMagicModuleMetaRepoModel.write(mcqIndex, "");
        this.mcqIndex = mcqIndex;
        this.myAnswer = i;
    }

    public final McqIndex getMcqIndex() {
        return this.mcqIndex;
    }

    public final int getMyAnswer() {
        return this.myAnswer;
    }

    public final boolean equals(Object p0) {
        return p0 instanceof McqAnswerIndex ? toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.mcqIndex, ((McqAnswerIndex) p0).mcqIndex) : super.equals(p0);
    }

    public static /* synthetic */ McqAnswerIndex copy$default(McqAnswerIndex mcqAnswerIndex, McqIndex mcqIndex, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            mcqIndex = mcqAnswerIndex.mcqIndex;
        }
        if ((i2 & 2) != 0) {
            i = mcqAnswerIndex.myAnswer;
        }
        return mcqAnswerIndex.copy(mcqIndex, i);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final McqIndex getMcqIndex() {
        return this.mcqIndex;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getMyAnswer() {
        return this.myAnswer;
    }

    public final McqAnswerIndex copy(McqIndex p0, int p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return new McqAnswerIndex(p0, p1);
    }

    public final int hashCode() {
        return (this.mcqIndex.hashCode() * 31) + Integer.hashCode(this.myAnswer);
    }

    public final String toString() {
        McqIndex mcqIndex = this.mcqIndex;
        int i = this.myAnswer;
        StringBuilder sb = new StringBuilder("McqAnswerIndex(mcqIndex=");
        sb.append(mcqIndex);
        sb.append(", myAnswer=");
        sb.append(i);
        sb.append(")");
        return sb.toString();
    }
}
