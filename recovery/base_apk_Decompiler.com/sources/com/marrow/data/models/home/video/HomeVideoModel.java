package com.marrow.data.models.home.video;

import com.marrow.data.models.common.CourseResponseKeyConstantsKt;
import com.marrow.data.models.home.HomeCardModel;
import com.marrow.data.models.pearl.PearlMini;
import kotlin.MagicModuleRepositoryImplExternalSyntheticLambda0;
import kotlin.Metadata;
import kotlin.getMagicModuleMeta;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b:\u0018\u0000 H2\u00020\u0001:\u0001HB\u0097\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u000b¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\u00020\u000e2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0018\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R$\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u0019\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR$\u0010\u001f\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u0019\u001a\u0004\b \u0010\u001c\"\u0004\b!\u0010\u001eR$\u0010\"\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\"\u0010\u0019\u001a\u0004\b#\u0010\u001c\"\u0004\b$\u0010\u001eR\"\u0010%\u001a\u00020\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b%\u0010\u0019\u001a\u0004\b&\u0010\u001c\"\u0004\b'\u0010\u001eR$\u0010(\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b(\u0010\u0019\u001a\u0004\b)\u0010\u001c\"\u0004\b*\u0010\u001eR\"\u0010+\u001a\u00020\t8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\"\u00101\u001a\u00020\u000b8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\u0016\u00107\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b7\u00102R\u0016\u00108\u001a\u00020\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b8\u00109R\"\u0010:\u001a\u00020\u000b8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b:\u00102\u001a\u0004\b;\u00104\"\u0004\b<\u00106R\"\u0010=\u001a\u00020\u000e8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b=\u00109\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\u0016\u0010A\u001a\u00020\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bA\u00109R\u0016\u0010B\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bB\u00102R\u0011\u0010D\u001a\u00020\u00028G¢\u0006\u0006\u001a\u0004\bC\u0010\u001cR\u0011\u0010E\u001a\u00020\u000e8G¢\u0006\u0006\u001a\u0004\bE\u0010>R\u0011\u0010F\u001a\u00020\u000e8G¢\u0006\u0006\u001a\u0004\bF\u0010>R\u0011\u0010G\u001a\u00020\u000e8G¢\u0006\u0006\u001a\u0004\bG\u0010>"}, d2 = {"Lcom/marrow/data/models/home/video/HomeVideoModel;", "", "", "p0", "p1", "p2", "p3", "p4", "p5", "", "p6", "", "p7", "p8", "", "p9", "p10", "p11", "p12", "p13", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;FIIZIZZI)V", "equals", "(Ljava/lang/Object;)Z", "id", "Ljava/lang/String;", PearlMini.KEY_THUMBNAIL, "getThumbnail", "()Ljava/lang/String;", "setThumbnail", "(Ljava/lang/String;)V", "title", "getTitle", "setTitle", CourseResponseKeyConstantsKt.KEY_SUBTITLE, "getSubtitle", "setSubtitle", "subject", "getSubject", "setSubject", "durationText", "getDurationText", "setDurationText", "rating", "F", "getRating", "()F", "setRating", "(F)V", "count", "I", "getCount", "()I", "setCount", "(I)V", "reason", "isPaid", "Z", "status", "getStatus", "setStatus", "isDownloaded", "()Z", "setDownloaded", "(Z)V", "isUnlocked", "videoProgress", "getReasonString", "reasonString", "isCompleted", "isPaused", "isUnattempted", "Companion"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class HomeVideoModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private int count;
    private String durationText;
    public String id;
    private boolean isDownloaded;
    public boolean isPaid;
    public boolean isUnlocked;
    private float rating;
    public int reason;
    private int status;
    private String subject;
    private String subtitle;
    private String thumbnail;
    private String title;
    public int videoProgress;

    public HomeVideoModel(String str, String str2, String str3, String str4, String str5, String str6, float f, int i, int i2, boolean z, int i3, boolean z2, boolean z3, int i4) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str5, "");
        this.id = str;
        this.thumbnail = str2;
        this.title = str3;
        this.subtitle = str4;
        this.subject = str5;
        this.durationText = str6;
        this.rating = f;
        this.count = i;
        this.reason = i2;
        this.isPaid = z;
        this.status = i3;
        this.isDownloaded = z2;
        this.isUnlocked = z3;
        this.videoProgress = i4;
    }

    public /* synthetic */ HomeVideoModel(String str, String str2, String str3, String str4, String str5, String str6, float f, int i, int i2, boolean z, int i3, boolean z2, boolean z3, int i4, int i5, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(str, (i5 & 2) != 0 ? null : str2, (i5 & 4) != 0 ? null : str3, (i5 & 8) != 0 ? null : str4, str5, (i5 & 32) != 0 ? null : str6, (i5 & 64) != 0 ? 0.0f : f, (i5 & 128) != 0 ? 0 : i, (i5 & 256) != 0 ? 0 : i2, (i5 & 512) != 0 ? false : z, (i5 & 1024) != 0 ? 0 : i3, (i5 & 2048) != 0 ? false : z2, (i5 & 4096) != 0 ? false : z3, (i5 & 8192) != 0 ? 0 : i4);
    }

    public final String getThumbnail() {
        return this.thumbnail;
    }

    public final void setThumbnail(String str) {
        this.thumbnail = str;
    }

    public final String getTitle() {
        return this.title;
    }

    public final void setTitle(String str) {
        this.title = str;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final void setSubtitle(String str) {
        this.subtitle = str;
    }

    public final String getSubject() {
        return this.subject;
    }

    public final void setSubject(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        this.subject = str;
    }

    public final String getDurationText() {
        return this.durationText;
    }

    public final void setDurationText(String str) {
        this.durationText = str;
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

    public final int getStatus() {
        return this.status;
    }

    public final void setStatus(int i) {
        this.status = i;
    }

    /* JADX INFO: renamed from: isDownloaded, reason: from getter */
    public final boolean getIsDownloaded() {
        return this.isDownloaded;
    }

    public final void setDownloaded(boolean z) {
        this.isDownloaded = z;
    }

    public final boolean equals(Object p0) {
        if (!(p0 instanceof HomeVideoModel)) {
            return super.equals(p0);
        }
        HomeVideoModel homeVideoModel = (HomeVideoModel) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.id, (Object) homeVideoModel.id) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.thumbnail, (Object) homeVideoModel.thumbnail) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.title, (Object) homeVideoModel.title) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.subject, (Object) homeVideoModel.subject) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.durationText, (Object) homeVideoModel.durationText) && this.rating == homeVideoModel.rating && this.count == homeVideoModel.count && this.reason == homeVideoModel.reason && this.isPaid == homeVideoModel.isPaid && this.status == homeVideoModel.status && this.isUnlocked == homeVideoModel.isUnlocked && this.isDownloaded == homeVideoModel.isDownloaded && this.videoProgress == homeVideoModel.videoProgress;
    }

    public final String getReasonString() {
        int i = this.reason;
        if (i == 1) {
            return "This is where you paused your last video";
        }
        if (i == 2) {
            return "Based on your last watched video";
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

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/marrow/data/models/home/video/HomeVideoModel$Companion;", "", "<init>", "()V", "Lcom/marrow/data/models/home/HomeCardModel;", "p0", "Lcom/marrow/data/models/home/video/HomeVideoModel;", "from", "(Lcom/marrow/data/models/home/HomeCardModel;)Lcom/marrow/data/models/home/video/HomeVideoModel;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @getMagicModuleMeta
        public final HomeVideoModel from(HomeCardModel p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            VideoSubModel videoSubModelExtract = VideoSubModel.INSTANCE.extract(p0.rest);
            String str = p0.contentId;
            String str2 = str == null ? "" : str;
            String str3 = p0.thumbnail;
            String str4 = p0.subTitle;
            String str5 = str4 == null ? "" : str4;
            String str6 = p0.contentTitle;
            String str7 = p0.thirdTitle;
            String str8 = p0.subTitle;
            return new HomeVideoModel(str2, str3, str6, str8 == null ? "" : str8, str5, str7, videoSubModelExtract.rating, videoSubModelExtract.count, videoSubModelExtract.reason, videoSubModelExtract.isPaid, videoSubModelExtract.status, videoSubModelExtract.isDownloaded, videoSubModelExtract.isUnlocked, videoSubModelExtract.videoProgress);
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    @getMagicModuleMeta
    public static final HomeVideoModel from(HomeCardModel homeCardModel) {
        return INSTANCE.from(homeCardModel);
    }
}
