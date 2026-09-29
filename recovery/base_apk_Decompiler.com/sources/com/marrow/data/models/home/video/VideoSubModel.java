package com.marrow.data.models.home.video;

import com.marrow.data.models.lesson.LessonIndex;
import com.marrow.data.models.video.cache.VideoCacheInfo;
import java.util.Arrays;
import java.util.Locale;
import kotlin.MagicModuleRepositoryImplExternalSyntheticLambda0;
import kotlin.Metadata;
import kotlin.TestGroupLSModel;
import kotlin.getOnline;
import kotlin.parseDolbyChannelConfiguration;
import kotlin.toMagicModuleMetaRepoModel;
import kotlin.toMagicModuleStatusUcModel;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J/\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0012\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0014\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0016\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0015R\u0016\u0010\u0018\u001a\u00020\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001a\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u0015R\u0016\u0010\u001b\u001a\u00020\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u0016\u0010\u001c\u001a\u00020\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u0016\u0010\u001d\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u0015"}, d2 = {"Lcom/marrow/data/models/home/video/VideoSubModel;", "", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "Lcom/marrow/data/models/lesson/LessonIndex;", "p0", "Lcom/marrow/data/models/video/cache/VideoCacheInfo;", "p1", "", "p2", "", "p3", "", "load", "(Lcom/marrow/data/models/lesson/LessonIndex;Lcom/marrow/data/models/video/cache/VideoCacheInfo;IF)V", "rating", "F", "count", "I", "reason", "", "isPaid", "Z", "status", "isDownloaded", "isUnlocked", "videoProgress", "Companion"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class VideoSubModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String SEPERATOR = ",";
    public int count;
    public boolean isDownloaded;
    public boolean isPaid;
    public boolean isUnlocked;
    public float rating;
    public int reason;
    public int status;
    public int videoProgress;

    public final String toString() {
        toMagicModuleStatusUcModel tomagicmodulestatusucmodel = toMagicModuleStatusUcModel.INSTANCE;
        String str = String.format(Locale.getDefault(), "%.2f %s %d %s %d %s %d %s %d %s %d %s %d %s %d", Arrays.copyOf(new Object[]{Float.valueOf(this.rating), SEPERATOR, Integer.valueOf(this.count), SEPERATOR, Integer.valueOf(this.reason), SEPERATOR, Integer.valueOf(this.isPaid ? 1 : 0), SEPERATOR, Integer.valueOf(this.isDownloaded ? 1 : 0), SEPERATOR, Integer.valueOf(this.status), SEPERATOR, Integer.valueOf(this.isUnlocked ? 1 : 0), SEPERATOR, Integer.valueOf(this.videoProgress)}, 15));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str, "");
        return str;
    }

    public final void load(LessonIndex p0, VideoCacheInfo p1, int p2, float p3) {
        toMagicModuleMetaRepoModel.write(p0, "");
        this.rating = p0.getAverageRating();
        this.count = p0.getTotalPeopleRated();
        this.reason = p2;
        this.isPaid = p0.isPaid();
        this.status = p0.getStatus();
        this.isDownloaded = p1 != null && p1.getDownloadPercent() > 99.0f;
        this.videoProgress = getOnline.RemoteActionCompatParcelizer(p3 * 100.0f);
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\n"}, d2 = {"Lcom/marrow/data/models/home/video/VideoSubModel$Companion;", "", "<init>", "()V", "", "p0", "Lcom/marrow/data/models/home/video/VideoSubModel;", "extract", "(Ljava/lang/String;)Lcom/marrow/data/models/home/video/VideoSubModel;", "SEPERATOR", "Ljava/lang/String;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final VideoSubModel extract(String p0) {
            VideoSubModel videoSubModel = new VideoSubModel();
            if (p0 != null) {
                String[] strArr = (String[]) TestGroupLSModel.write(p0, new String[]{VideoSubModel.SEPERATOR}, 0, 6).toArray(new String[0]);
                if (strArr.length == 8) {
                    videoSubModel.rating = parseDolbyChannelConfiguration.RemoteActionCompatParcelizer(strArr[0]);
                    videoSubModel.count = parseDolbyChannelConfiguration.write(strArr[1]);
                    videoSubModel.reason = parseDolbyChannelConfiguration.write(strArr[2]);
                    videoSubModel.isPaid = parseDolbyChannelConfiguration.IconCompatParcelizer(strArr[3], false);
                    videoSubModel.isDownloaded = parseDolbyChannelConfiguration.IconCompatParcelizer(strArr[4], false);
                    videoSubModel.status = parseDolbyChannelConfiguration.write(strArr[5]);
                    videoSubModel.isUnlocked = parseDolbyChannelConfiguration.IconCompatParcelizer(strArr[6], false);
                    videoSubModel.videoProgress = parseDolbyChannelConfiguration.write(strArr[7]);
                }
            }
            return videoSubModel;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }
}
