package com.marrow.data.models.home.qbank;

import com.marrow.data.models.home.HomeCardModel;
import com.marrow.data.models.pearl.PearlMini;
import kotlin.MagicModuleRepositoryImplExternalSyntheticLambda0;
import kotlin.Metadata;
import kotlin.getMagicModuleMeta;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b2\u0018\u0000 >2\u00020\u0001:\u0001>B\u0091\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\t\u0012\b\b\u0002\u0010\u000f\u001a\u00020\t\u0012\b\b\u0002\u0010\u0010\u001a\u00020\t\u0012\b\b\u0002\u0010\u0011\u001a\u00020\f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\t\u0012\u0006\u0010\u0013\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\u00020\f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0018\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R$\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u0019\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019R\u0016\u0010 \u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b \u0010\u0019R\"\u0010!\u001a\u00020\u00078\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\"\u0010'\u001a\u00020\t8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u0016\u0010-\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b-\u0010(R\u0016\u0010.\u001a\u00020\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u00100\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b0\u0010(R\u0016\u00101\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b1\u0010(R\u0016\u00102\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b2\u0010(R\u0016\u00103\u001a\u00020\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b3\u0010/R\u0016\u00104\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b4\u0010(R\"\u00105\u001a\u00020\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b5\u0010\u0019\u001a\u0004\b6\u0010\u001c\"\u0004\b7\u0010\u001eR\u0011\u00109\u001a\u00020\u00028G¢\u0006\u0006\u001a\u0004\b8\u0010\u001cR\u0011\u0010:\u001a\u00020\f8G¢\u0006\u0006\u001a\u0004\b:\u0010;R\u0011\u0010<\u001a\u00020\f8G¢\u0006\u0006\u001a\u0004\b<\u0010;R\u0011\u0010=\u001a\u00020\f8G¢\u0006\u0006\u001a\u0004\b=\u0010;"}, d2 = {"Lcom/marrow/data/models/home/qbank/HomeQbankModel;", "", "", "p0", "p1", "p2", "p3", "", "p4", "", "p5", "p6", "", "p7", "p8", "p9", "p10", "p11", "p12", "p13", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;FIIZIIIZILjava/lang/String;)V", "equals", "(Ljava/lang/Object;)Z", "id", "Ljava/lang/String;", PearlMini.KEY_THUMBNAIL, "getThumbnail", "()Ljava/lang/String;", "setThumbnail", "(Ljava/lang/String;)V", "title", "subject", "rating", "F", "getRating", "()F", "setRating", "(F)V", "count", "I", "getCount", "()I", "setCount", "(I)V", "status", "isPaid", "Z", "reason", "updatedMcqCount", "newMcqCount", "isUnlocked", "mcqCount", "subjectId", "getSubjectId", "setSubjectId", "getReasonString", "reasonString", "isCompleted", "()Z", "isPaused", "isUnattempted", "Companion"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class HomeQbankModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private int count;
    public String id;
    public boolean isPaid;
    public boolean isUnlocked;
    public int mcqCount;
    public int newMcqCount;
    private float rating;
    public int reason;
    public int status;
    public String subject;
    private String subjectId;
    private String thumbnail;
    public String title;
    public int updatedMcqCount;

    public HomeQbankModel(String str, String str2, String str3, String str4, float f, int i, int i2, boolean z, int i3, int i4, int i5, boolean z2, int i6, String str5) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str4, "");
        toMagicModuleMetaRepoModel.write(str5, "");
        this.id = str;
        this.thumbnail = str2;
        this.title = str3;
        this.subject = str4;
        this.rating = f;
        this.count = i;
        this.status = i2;
        this.isPaid = z;
        this.reason = i3;
        this.updatedMcqCount = i4;
        this.newMcqCount = i5;
        this.isUnlocked = z2;
        this.mcqCount = i6;
        this.subjectId = str5;
    }

    public /* synthetic */ HomeQbankModel(String str, String str2, String str3, String str4, float f, int i, int i2, boolean z, int i3, int i4, int i5, boolean z2, int i6, String str5, int i7, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(str, (i7 & 2) != 0 ? null : str2, (i7 & 4) != 0 ? null : str3, str4, (i7 & 16) != 0 ? 0.0f : f, (i7 & 32) != 0 ? 0 : i, (i7 & 64) != 0 ? 0 : i2, (i7 & 128) != 0 ? false : z, (i7 & 256) != 0 ? 0 : i3, (i7 & 512) != 0 ? 0 : i4, (i7 & 1024) != 0 ? 0 : i5, (i7 & 2048) != 0 ? false : z2, (i7 & 4096) != 0 ? 0 : i6, str5);
    }

    public final String getThumbnail() {
        return this.thumbnail;
    }

    public final void setThumbnail(String str) {
        this.thumbnail = str;
    }

    public final float getRating() {
        return this.rating;
    }

    public final void setRating(float f) {
        this.rating = f;
    }

    public final int getCount() {
        return this.count;
    }

    public final void setCount(int i) {
        this.count = i;
    }

    public final String getSubjectId() {
        return this.subjectId;
    }

    public final void setSubjectId(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        this.subjectId = str;
    }

    public final boolean equals(Object p0) {
        if (!(p0 instanceof HomeQbankModel)) {
            return super.equals(p0);
        }
        HomeQbankModel homeQbankModel = (HomeQbankModel) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.id, (Object) homeQbankModel.id) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.thumbnail, (Object) homeQbankModel.thumbnail) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.title, (Object) homeQbankModel.title) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.subject, (Object) homeQbankModel.subject) && this.rating == homeQbankModel.rating && this.count == homeQbankModel.count && this.reason == homeQbankModel.reason && this.isPaid == homeQbankModel.isPaid && this.status == homeQbankModel.status && this.isUnlocked == homeQbankModel.isUnlocked && this.updatedMcqCount == homeQbankModel.updatedMcqCount && this.newMcqCount == homeQbankModel.newMcqCount && this.mcqCount == homeQbankModel.mcqCount;
    }

    public final String getReasonString() {
        int i = this.reason;
        if (i == 1) {
            return "This is where you paused your last module";
        }
        if (i == 2) {
            return "Based on your last solved module";
        }
        if (i == 6) {
            return "Recently updated";
        }
        return "";
    }

    public final boolean isCompleted() {
        return this.reason == 2;
    }

    public final boolean isPaused() {
        return this.reason == 1;
    }

    public final boolean isUnattempted() {
        return this.reason == 0;
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/marrow/data/models/home/qbank/HomeQbankModel$Companion;", "", "<init>", "()V", "Lcom/marrow/data/models/home/HomeCardModel;", "p0", "Lcom/marrow/data/models/home/qbank/HomeQbankModel;", "from", "(Lcom/marrow/data/models/home/HomeCardModel;)Lcom/marrow/data/models/home/qbank/HomeQbankModel;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @getMagicModuleMeta
        public final HomeQbankModel from(HomeCardModel p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            QbankSubModel qbankSubModelExtract = QbankSubModel.extract(p0.rest);
            String str = p0.contentId;
            String str2 = str == null ? "" : str;
            String str3 = p0.thumbnail;
            String str4 = p0.subTitle;
            String str5 = str4 == null ? "" : str4;
            String str6 = p0.contentTitle;
            int i = qbankSubModelExtract.count;
            float f = qbankSubModelExtract.rating;
            int i2 = qbankSubModelExtract.status;
            boolean z = qbankSubModelExtract.isPaid;
            int i3 = qbankSubModelExtract.reason;
            int i4 = qbankSubModelExtract.newCount;
            int i5 = qbankSubModelExtract.updatedCount;
            boolean z2 = qbankSubModelExtract.isUnlocked;
            int i6 = qbankSubModelExtract.mcqCount;
            String str7 = p0.subjectId;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str7, "");
            return new HomeQbankModel(str2, str3, str6, str5, f, i, i2, z, i3, i5, i4, z2, i6, str7);
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    @getMagicModuleMeta
    public static final HomeQbankModel from(HomeCardModel homeCardModel) {
        return INSTANCE.from(homeCardModel);
    }
}
