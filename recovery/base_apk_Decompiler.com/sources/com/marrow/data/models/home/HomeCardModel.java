package com.marrow.data.models.home;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.marrow.data.models.common.FeaturedCard;
import com.marrow.data.models.home.qbank.QbankSubModel;
import com.marrow.data.models.home.test.TestSubModel;
import com.marrow.data.models.home.video.VideoSubModel;
import com.marrow.data.models.lesson.LessonIndex;
import com.marrow.data.models.lesson.home.HomeLessonIndexV2;
import com.marrow.data.models.test.TestIndex;
import com.marrow.data.models.video.cache.VideoCacheInfo;
import kotlin.parseDolbyChannelConfiguration;

/* JADX INFO: loaded from: classes.dex */
@JsonIgnoreProperties(ignoreUnknown = true)
public class HomeCardModel {
    public static final int CATEGORY_FEATURED_CARD = 1;
    public static final int CATEGORY_QBANK = 3;
    public static final int CATEGORY_TEST = 2;
    public static final int CATEGORY_VIDEO = 4;
    public String _id;
    public int category;
    public String contentId;
    public String contentTitle;
    public String contentType;
    public int courseId;
    public boolean isLabelVisibile;
    public String labelBackgroundColor;
    public String labelText;
    public String labelTextColor;
    public String rest;
    public String stepId;
    public String subContentId;
    public String subContentType;
    public String subTitle;
    public String subjectId;
    public String thirdTitle;
    public String thumbnail;

    public boolean equals(Object obj) {
        if (!(obj instanceof HomeCardModel)) {
            return super.equals(obj);
        }
        HomeCardModel homeCardModel = (HomeCardModel) obj;
        return this.courseId == homeCardModel.courseId && this.category == homeCardModel.category && parseDolbyChannelConfiguration.AudioAttributesCompatParcelizer(this._id, homeCardModel._id) && parseDolbyChannelConfiguration.AudioAttributesCompatParcelizer(this.contentType, homeCardModel.contentType) && parseDolbyChannelConfiguration.AudioAttributesCompatParcelizer(this.contentId, homeCardModel.contentId) && parseDolbyChannelConfiguration.AudioAttributesCompatParcelizer(this.subContentType, homeCardModel.subContentType) && parseDolbyChannelConfiguration.AudioAttributesCompatParcelizer(this.subContentId, homeCardModel.subContentId) && parseDolbyChannelConfiguration.AudioAttributesCompatParcelizer(this.contentTitle, homeCardModel.contentTitle) && parseDolbyChannelConfiguration.AudioAttributesCompatParcelizer(this.thirdTitle, homeCardModel.thirdTitle) && parseDolbyChannelConfiguration.AudioAttributesCompatParcelizer(this.thumbnail, homeCardModel.thumbnail) && parseDolbyChannelConfiguration.AudioAttributesCompatParcelizer(this.labelText, homeCardModel.labelText) && parseDolbyChannelConfiguration.AudioAttributesCompatParcelizer(this.rest, homeCardModel.rest) && parseDolbyChannelConfiguration.AudioAttributesCompatParcelizer(this.stepId, homeCardModel.stepId);
    }

    public static HomeCardModel from(FeaturedCard featuredCard) {
        HomeCardModel homeCardModel = new HomeCardModel();
        homeCardModel._id = featuredCard._id;
        homeCardModel.category = 1;
        homeCardModel.courseId = featuredCard.getCourseIdInt();
        homeCardModel.contentType = featuredCard.contentType;
        homeCardModel.contentId = featuredCard.contentId;
        homeCardModel.subContentType = featuredCard.subContentType;
        homeCardModel.subContentId = featuredCard.subContentId;
        homeCardModel.contentTitle = featuredCard.contentTitle;
        homeCardModel.subTitle = featuredCard.subTitle;
        homeCardModel.thumbnail = featuredCard.thumbnail;
        homeCardModel.isLabelVisibile = featuredCard.label != null;
        if (featuredCard.contentStepIds != null) {
            homeCardModel.stepId = featuredCard.contentStepIds[0];
        }
        if (featuredCard.label != null) {
            homeCardModel.labelText = featuredCard.label.text;
            homeCardModel.labelBackgroundColor = featuredCard.label.bgColor;
            homeCardModel.labelTextColor = featuredCard.label.color;
        }
        return homeCardModel;
    }

    public static HomeCardModel from(TestIndex testIndex, boolean z) {
        TestSubModel testSubModel = new TestSubModel();
        testSubModel.load(testIndex);
        testSubModel.hasAccess = !testSubModel.isPaid || z;
        HomeCardModel homeCardModel = new HomeCardModel();
        homeCardModel.category = 2;
        homeCardModel.courseId = testIndex.getCourseId();
        homeCardModel.contentType = "test";
        homeCardModel.contentId = testIndex.getId();
        homeCardModel.contentTitle = testIndex.getTitle();
        homeCardModel.rest = testSubModel.toString();
        homeCardModel.isLabelVisibile = false;
        return homeCardModel;
    }

    public static HomeCardModel fromQbank(HomeLessonIndexV2 homeLessonIndexV2, String str, int i, boolean z) {
        LessonIndex lessonIndex = homeLessonIndexV2.getLessonIndex();
        String id = lessonIndex.getId();
        String title = lessonIndex.getTitle();
        String imageUrl = lessonIndex.getImageUrl();
        QbankSubModel qbankSubModel = new QbankSubModel();
        qbankSubModel.load(homeLessonIndexV2, i);
        qbankSubModel.isUnlocked = z;
        String string = qbankSubModel.toString();
        HomeCardModel homeCardModel = new HomeCardModel();
        homeCardModel.courseId = lessonIndex.getCourseId();
        homeCardModel.contentTitle = title;
        homeCardModel.subTitle = str;
        homeCardModel.thirdTitle = "";
        homeCardModel.thumbnail = imageUrl;
        homeCardModel.contentType = "qbank";
        homeCardModel.contentId = id;
        homeCardModel.rest = string;
        homeCardModel.isLabelVisibile = false;
        homeCardModel.subjectId = homeLessonIndexV2.getLessonIndex().getRootSubjectId();
        return homeCardModel;
    }

    public static HomeCardModel fromVideo(LessonIndex lessonIndex, VideoCacheInfo videoCacheInfo, String str, int i, boolean z, float f) {
        String id = lessonIndex.getId();
        String title = lessonIndex.getTitle();
        String imageUrl = lessonIndex.getImageUrl();
        String lessonReadTimeText = lessonIndex.getLessonReadTimeText();
        VideoSubModel videoSubModel = new VideoSubModel();
        videoSubModel.load(lessonIndex, videoCacheInfo, i, f);
        videoSubModel.isUnlocked = z;
        String string = videoSubModel.toString();
        HomeCardModel homeCardModel = new HomeCardModel();
        homeCardModel.courseId = lessonIndex.getCourseId();
        homeCardModel.contentTitle = title;
        homeCardModel.subTitle = str;
        homeCardModel.thirdTitle = lessonReadTimeText;
        homeCardModel.thumbnail = imageUrl;
        homeCardModel.contentType = "video";
        homeCardModel.contentId = id;
        homeCardModel.rest = string;
        homeCardModel.isLabelVisibile = false;
        return homeCardModel;
    }
}
