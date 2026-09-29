package com.marrow2.data.test.remote.model;

import java.util.List;
import kotlin.IntermediateLoginResponseBody;
import kotlin.MagicModuleRepositoryImplExternalSyntheticLambda0;
import kotlin.Metadata;
import kotlin.toMagicModuleMetaRepoModel;
import org.apache.commons.compress.archivers.zip.UnixStat;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u001a\b\u0086\b\u0018\u00002\u00020\u0001Bg\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0015J\u0010\u0010\u0018\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0015J\u0010\u0010\u0019\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0013J\u0010\u0010\u001c\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0015J\u0016\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000e0\rHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJp\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00042\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rHÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010\"\u001a\u00020!2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b$\u0010\u0015J\u0010\u0010%\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b%\u0010\u0013R\u0017\u0010&\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010\u0013R\u001a\u0010)\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010\u0015R\u001a\u0010,\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b,\u0010*\u001a\u0004\b-\u0010\u0015R\u001a\u0010.\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b.\u0010*\u001a\u0004\b/\u0010\u0015R\u001a\u00100\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b0\u0010*\u001a\u0004\b1\u0010\u0015R\u001a\u00102\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u0010\u001aR\u001a\u00105\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b5\u0010'\u001a\u0004\b6\u0010\u0013R\u001a\u00107\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b7\u0010*\u001a\u0004\b8\u0010\u0015R \u00109\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010\u001e"}, d2 = {"Lcom/marrow2/data/test/remote/model/TopicStatV2ResponseModel;", "", "", "p0", "", "p1", "p2", "p3", "p4", "", "p5", "p6", "p7", "", "Lcom/marrow2/data/test/remote/model/WeakLessonV2ResponseModel;", "p8", "<init>", "(Ljava/lang/String;IIIIDLjava/lang/String;ILjava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "()I", "component3", "component4", "component5", "component6", "()D", "component7", "component8", "component9", "()Ljava/util/List;", "copy", "(Ljava/lang/String;IIIIDLjava/lang/String;ILjava/util/List;)Lcom/marrow2/data/test/remote/model/TopicStatV2ResponseModel;", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "id", "Ljava/lang/String;", "getId", "correct", "I", "getCorrect", "wrong", "getWrong", "skipped", "getSkipped", "total", "getTotal", "percentage", "D", "getPercentage", "title", "getTitle", "weakLessonCount", "getWeakLessonCount", "weakLessons", "Ljava/util/List;", "getWeakLessons"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TopicStatV2ResponseModel {
    public static final int $stable = 8;
    private final int correct;
    private final String id;
    private final double percentage;
    private final int skipped;
    private final String title;
    private final int total;
    private final int weakLessonCount;
    private final List<WeakLessonV2ResponseModel> weakLessons;
    private final int wrong;

    public TopicStatV2ResponseModel(String str, int i, int i2, int i3, int i4, double d, String str2, int i5, List<WeakLessonV2ResponseModel> list) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        toMagicModuleMetaRepoModel.write(list, "");
        this.id = str;
        this.correct = i;
        this.wrong = i2;
        this.skipped = i3;
        this.total = i4;
        this.percentage = d;
        this.title = str2;
        this.weakLessonCount = i5;
        this.weakLessons = list;
    }

    public /* synthetic */ TopicStatV2ResponseModel(String str, int i, int i2, int i3, int i4, double d, String str2, int i5, List list, int i6, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i6 & 1) != 0 ? "" : str, (i6 & 2) != 0 ? 0 : i, (i6 & 4) != 0 ? 0 : i2, (i6 & 8) != 0 ? 0 : i3, (i6 & 16) != 0 ? 0 : i4, (i6 & 32) != 0 ? 0.0d : d, (i6 & 64) != 0 ? "" : str2, (i6 & 128) != 0 ? 0 : i5, (i6 & 256) != 0 ? IntermediateLoginResponseBody.RemoteActionCompatParcelizer() : list);
    }

    public final String getId() {
        return this.id;
    }

    public final int getCorrect() {
        return this.correct;
    }

    public final int getWrong() {
        return this.wrong;
    }

    public final int getSkipped() {
        return this.skipped;
    }

    public final int getTotal() {
        return this.total;
    }

    public final double getPercentage() {
        return this.percentage;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int getWeakLessonCount() {
        return this.weakLessonCount;
    }

    public final List<WeakLessonV2ResponseModel> getWeakLessons() {
        return this.weakLessons;
    }

    public TopicStatV2ResponseModel() {
        this(null, 0, 0, 0, 0, 0.0d, null, 0, null, UnixStat.DEFAULT_LINK_PERM, null);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getCorrect() {
        return this.correct;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getWrong() {
        return this.wrong;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getSkipped() {
        return this.skipped;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getTotal() {
        return this.total;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final double getPercentage() {
        return this.percentage;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getWeakLessonCount() {
        return this.weakLessonCount;
    }

    public final List<WeakLessonV2ResponseModel> component9() {
        return this.weakLessons;
    }

    public final TopicStatV2ResponseModel copy(String p0, int p1, int p2, int p3, int p4, double p5, String p6, int p7, List<WeakLessonV2ResponseModel> p8) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p6, "");
        toMagicModuleMetaRepoModel.write(p8, "");
        return new TopicStatV2ResponseModel(p0, p1, p2, p3, p4, p5, p6, p7, p8);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof TopicStatV2ResponseModel)) {
            return false;
        }
        TopicStatV2ResponseModel topicStatV2ResponseModel = (TopicStatV2ResponseModel) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.id, (Object) topicStatV2ResponseModel.id) && this.correct == topicStatV2ResponseModel.correct && this.wrong == topicStatV2ResponseModel.wrong && this.skipped == topicStatV2ResponseModel.skipped && this.total == topicStatV2ResponseModel.total && Double.compare(this.percentage, topicStatV2ResponseModel.percentage) == 0 && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.title, (Object) topicStatV2ResponseModel.title) && this.weakLessonCount == topicStatV2ResponseModel.weakLessonCount && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.weakLessons, topicStatV2ResponseModel.weakLessons);
    }

    public final int hashCode() {
        return (((((((((((((((this.id.hashCode() * 31) + Integer.hashCode(this.correct)) * 31) + Integer.hashCode(this.wrong)) * 31) + Integer.hashCode(this.skipped)) * 31) + Integer.hashCode(this.total)) * 31) + Double.hashCode(this.percentage)) * 31) + this.title.hashCode()) * 31) + Integer.hashCode(this.weakLessonCount)) * 31) + this.weakLessons.hashCode();
    }

    public final String toString() {
        String str = this.id;
        int i = this.correct;
        int i2 = this.wrong;
        int i3 = this.skipped;
        int i4 = this.total;
        double d = this.percentage;
        String str2 = this.title;
        int i5 = this.weakLessonCount;
        List<WeakLessonV2ResponseModel> list = this.weakLessons;
        StringBuilder sb = new StringBuilder("TopicStatV2ResponseModel(id=");
        sb.append(str);
        sb.append(", correct=");
        sb.append(i);
        sb.append(", wrong=");
        sb.append(i2);
        sb.append(", skipped=");
        sb.append(i3);
        sb.append(", total=");
        sb.append(i4);
        sb.append(", percentage=");
        sb.append(d);
        sb.append(", title=");
        sb.append(str2);
        sb.append(", weakLessonCount=");
        sb.append(i5);
        sb.append(", weakLessons=");
        sb.append(list);
        sb.append(")");
        return sb.toString();
    }
}
