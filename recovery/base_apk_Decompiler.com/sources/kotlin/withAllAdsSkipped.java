package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow.data.models.common.FeaturedCard;
import com.marrow.data.models.home.HomeCardModel;
import com.marrow.data.models.home.HomeMainModel;
import com.marrow.data.models.home.HomeRefreshInfoModel;
import com.marrow.data.models.home.qbank.HomeQbankModel;
import com.marrow.data.models.home.test.HomeTestModel;
import com.marrow.data.models.home.video.HomeVideoModel;
import com.marrow.data.models.lesson.LessonIndex;
import com.marrow.data.models.lesson.home.HomeLessonIndexV2;
import com.marrow.data.models.test.TestIndex;
import java.util.List;
import kotlin.parseCea708AccessibilityChannel;

/* JADX INFO: loaded from: classes3.dex */
public final class withAllAdsSkipped implements AdPlaybackStateAdGroupExternalSyntheticLambda0 {
    private final withRemovedAdGroupCount AudioAttributesCompatParcelizer;
    private final ChunkHolder AudioAttributesImplApi21Parcelizer;
    private final BundledChunkExtractorExternalSyntheticLambda0 AudioAttributesImplApi26Parcelizer;
    private final getStreamIndexToTrackGroupIndex AudioAttributesImplBaseParcelizer;
    private final resolveUtcTimingElement IconCompatParcelizer;
    private final getNextChunk MediaBrowserCompatCustomActionResultReceiver;
    private final getDataSpec RemoteActionCompatParcelizer;
    private final hasMediaSource read;
    private final getStreamPositionUsForContent write;

    @setSdkPayload
    public withAllAdsSkipped(BundledChunkExtractorExternalSyntheticLambda0 bundledChunkExtractorExternalSyntheticLambda0, getNextChunk getnextchunk, getDataSpec getdataspec, withRemovedAdGroupCount withremovedadgroupcount, resolveUtcTimingElement resolveutctimingelement, ChunkHolder chunkHolder, hasMediaSource hasmediasource, getStreamIndexToTrackGroupIndex getstreamindextotrackgroupindex, getStreamPositionUsForContent getstreampositionusforcontent) {
        this.MediaBrowserCompatCustomActionResultReceiver = getnextchunk;
        this.AudioAttributesImplApi26Parcelizer = bundledChunkExtractorExternalSyntheticLambda0;
        this.read = hasmediasource;
        this.RemoteActionCompatParcelizer = getdataspec;
        this.AudioAttributesCompatParcelizer = withremovedadgroupcount;
        this.AudioAttributesImplApi21Parcelizer = chunkHolder;
        this.IconCompatParcelizer = resolveutctimingelement;
        this.AudioAttributesImplBaseParcelizer = getstreamindextotrackgroupindex;
        this.write = getstreampositionusforcontent;
    }

    @Override // kotlin.AdPlaybackStateAdGroupExternalSyntheticLambda0
    public final accessgetEmptyStatecp<HomeMainModel> AudioAttributesImplBaseParcelizer() {
        return parseCea708AccessibilityChannel.AudioAttributesCompatParcelizer(new parseCea708AccessibilityChannel.RemoteActionCompatParcelizer() { // from class: o.AdPlaybackStateAdState
            @Override // o.parseCea708AccessibilityChannel.RemoteActionCompatParcelizer
            public final Object write() {
                return this.RemoteActionCompatParcelizer.AudioAttributesImplApi21Parcelizer();
            }
        }).RemoteActionCompatParcelizer(new getSubjectTitle() { // from class: o.withTimeUs
            @Override // kotlin.getSubjectTitle
            public final Object apply(Object obj) {
                return ((HomeRefreshInfoModel) obj).getMainModel();
            }
        });
    }

    @Override // kotlin.AdPlaybackStateAdGroupExternalSyntheticLambda0
    public final HomeRefreshInfoModel AudioAttributesImplApi21Parcelizer() {
        HomeLessonIndexV2[] homeLessonIndexV2Arr;
        getStreamPositionUsForContent getstreampositionusforcontent = this.write;
        if (!getstreampositionusforcontent.AudioAttributesCompatParcelizer(getstreampositionusforcontent.onPrepareFromUri())) {
            return null;
        }
        List<FeaturedCard> listWrite = this.AudioAttributesCompatParcelizer.write();
        HomeLessonIndexV2 homeLessonIndexV2Write = this.read.write(1);
        HomeLessonIndexV2 homeLessonIndexV2Write2 = this.read.write(2);
        HomeLessonIndexV2[] homeLessonIndexV2Arr2 = homeLessonIndexV2Write != null ? new HomeLessonIndexV2[]{homeLessonIndexV2Write} : null;
        HomeLessonIndexV2[] homeLessonIndexV2Arr3 = homeLessonIndexV2Write2 != null ? new HomeLessonIndexV2[]{homeLessonIndexV2Write2} : null;
        TestIndex[] testIndexArrIconCompatParcelizer = this.MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer();
        int length = testIndexArrIconCompatParcelizer != null ? testIndexArrIconCompatParcelizer.length : 0;
        int length2 = homeLessonIndexV2Arr2 != null ? homeLessonIndexV2Arr2.length : 0;
        int length3 = homeLessonIndexV2Arr3 != null ? homeLessonIndexV2Arr3.length : 0;
        boolean zIconCompatParcelizer = this.AudioAttributesImplApi21Parcelizer.IconCompatParcelizer("mcq");
        boolean zIconCompatParcelizer2 = this.AudioAttributesImplApi21Parcelizer.IconCompatParcelizer("video");
        boolean zIconCompatParcelizer3 = this.AudioAttributesImplApi21Parcelizer.IconCompatParcelizer("test");
        HomeTestModel[] homeTestModelArr = new HomeTestModel[length];
        HomeQbankModel[] homeQbankModelArr = new HomeQbankModel[length2];
        HomeVideoModel[] homeVideoModelArr = new HomeVideoModel[length3];
        int i = 0;
        int i2 = 0;
        while (i < length) {
            HomeCardModel homeCardModelFrom = HomeCardModel.from(testIndexArrIconCompatParcelizer[i], zIconCompatParcelizer3);
            homeCardModelFrom._id = String.valueOf(i2);
            homeCardModelFrom.category = 2;
            homeTestModelArr[i] = HomeTestModel.from(homeCardModelFrom);
            i++;
            i2++;
            testIndexArrIconCompatParcelizer = testIndexArrIconCompatParcelizer;
        }
        int i3 = 0;
        while (i3 < length2) {
            HomeLessonIndexV2 homeLessonIndexV2 = homeLessonIndexV2Arr2[i3];
            LessonIndex lessonIndex = homeLessonIndexV2.getLessonIndex();
            String strRemoteActionCompatParcelizer = this.AudioAttributesImplApi26Parcelizer.RemoteActionCompatParcelizer(lessonIndex.getRootSubjectId());
            if (!lessonIndex.isPaid() || zIconCompatParcelizer) {
                homeLessonIndexV2Arr = homeLessonIndexV2Arr2;
            } else {
                homeLessonIndexV2Arr = homeLessonIndexV2Arr2;
                boolean z = this.AudioAttributesImplApi21Parcelizer.read("mcq_subj", lessonIndex.getRootSubjectId());
                HomeCardModel homeCardModelFromQbank = HomeCardModel.fromQbank(homeLessonIndexV2, strRemoteActionCompatParcelizer, homeLessonIndexV2.getTag(), z);
                homeCardModelFromQbank._id = String.valueOf(i2);
                homeCardModelFromQbank.category = 3;
                homeQbankModelArr[i3] = HomeQbankModel.from(homeCardModelFromQbank);
                i3++;
                i2++;
                homeLessonIndexV2Arr2 = homeLessonIndexV2Arr;
            }
            HomeCardModel homeCardModelFromQbank2 = HomeCardModel.fromQbank(homeLessonIndexV2, strRemoteActionCompatParcelizer, homeLessonIndexV2.getTag(), z);
            homeCardModelFromQbank2._id = String.valueOf(i2);
            homeCardModelFromQbank2.category = 3;
            homeQbankModelArr[i3] = HomeQbankModel.from(homeCardModelFromQbank2);
            i3++;
            i2++;
            homeLessonIndexV2Arr2 = homeLessonIndexV2Arr;
        }
        int i4 = 0;
        while (i4 < length3) {
            HomeLessonIndexV2 homeLessonIndexV22 = homeLessonIndexV2Arr3[i4];
            LessonIndex lessonIndex2 = homeLessonIndexV22.getLessonIndex();
            if (homeLessonIndexV22.getTag() == 1) {
                homeLessonIndexV22.videoProgress = this.AudioAttributesImplBaseParcelizer.write(lessonIndex2.getId()) != null ? r5.getResumeTimeMs() / r5.getTotalDurationMs() : BitmapDescriptorFactory.HUE_RED;
            }
            HomeCardModel homeCardModelFromVideo = HomeCardModel.fromVideo(lessonIndex2, this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(lessonIndex2.getId()), this.AudioAttributesImplApi26Parcelizer.RemoteActionCompatParcelizer(lessonIndex2.getRootSubjectId()), homeLessonIndexV22.getTag(), !lessonIndex2.isPaid() || zIconCompatParcelizer2 || this.AudioAttributesImplApi21Parcelizer.read("video_subj", lessonIndex2.getRootSubjectId()), homeLessonIndexV22.videoProgress);
            homeCardModelFromVideo._id = String.valueOf(i2);
            homeCardModelFromVideo.category = 4;
            homeVideoModelArr[i4] = HomeVideoModel.from(homeCardModelFromVideo);
            i4++;
            i2++;
        }
        HomeMainModel homeMainModel = new HomeMainModel();
        homeMainModel.qbankModels = homeQbankModelArr;
        homeMainModel.testModels = homeTestModelArr;
        homeMainModel.videoModels = homeVideoModelArr;
        homeMainModel.featuredCards = (FeaturedCard[]) listWrite.toArray(new FeaturedCard[0]);
        HomeRefreshInfoModel homeRefreshInfoModel = new HomeRefreshInfoModel();
        homeRefreshInfoModel.mainModel = homeMainModel;
        return homeRefreshInfoModel;
    }
}
