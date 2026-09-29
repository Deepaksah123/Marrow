package kotlin;

import com.marrow.data.models.test.TestIndex;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u0012\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\bHÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\u0004\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001c"}, d2 = {"Lcom/marrow2/domain/video/lesson_list/model/RevisionCompletedUCModel;", "", "avgScorePercentage", "", "suggestedGrandTest", "Lcom/marrow/data/models/test/TestIndex;", "Lcom/marrow2/domain/test/model/TestIndexUCModel;", "suggestedSubject", "Lcom/marrow2/domain/qbank/model/SubjectInfoUCModel;", "<init>", "(FLcom/marrow/data/models/test/TestIndex;Lcom/marrow2/domain/qbank/model/SubjectInfoUCModel;)V", "getAvgScorePercentage", "()F", "getSuggestedGrandTest", "()Lcom/marrow/data/models/test/TestIndex;", "getSuggestedSubject", "()Lcom/marrow2/domain/qbank/model/SubjectInfoUCModel;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class lambdatransformFutureAsync1 {
    private final TestIndex AudioAttributesCompatParcelizer;
    private final proceedNonBlocking RemoteActionCompatParcelizer;
    private final float write;

    public lambdatransformFutureAsync1(float f, TestIndex testIndex, proceedNonBlocking proceednonblocking) {
        this.write = f;
        this.AudioAttributesCompatParcelizer = testIndex;
        this.RemoteActionCompatParcelizer = proceednonblocking;
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final float getWrite() {
        return this.write;
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final TestIndex getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final proceedNonBlocking getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof lambdatransformFutureAsync1)) {
            return false;
        }
        lambdatransformFutureAsync1 lambdatransformfutureasync1 = (lambdatransformFutureAsync1) other;
        return Float.compare(this.write, lambdatransformfutureasync1.write) == 0 && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, lambdatransformfutureasync1.AudioAttributesCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, lambdatransformfutureasync1.RemoteActionCompatParcelizer);
    }

    public final int hashCode() {
        int iHashCode = Float.hashCode(this.write);
        TestIndex testIndex = this.AudioAttributesCompatParcelizer;
        int iHashCode2 = testIndex == null ? 0 : testIndex.hashCode();
        proceedNonBlocking proceednonblocking = this.RemoteActionCompatParcelizer;
        return (((iHashCode * 31) + iHashCode2) * 31) + (proceednonblocking != null ? proceednonblocking.hashCode() : 0);
    }

    public final String toString() {
        float f = this.write;
        TestIndex testIndex = this.AudioAttributesCompatParcelizer;
        proceedNonBlocking proceednonblocking = this.RemoteActionCompatParcelizer;
        StringBuilder sb = new StringBuilder("RevisionCompletedUCModel(avgScorePercentage=");
        sb.append(f);
        sb.append(", suggestedGrandTest=");
        sb.append(testIndex);
        sb.append(", suggestedSubject=");
        sb.append(proceednonblocking);
        sb.append(")");
        return sb.toString();
    }
}
