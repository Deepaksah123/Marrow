package com.marrow.data.models.lesson.tab;

import com.marrow.data.models.lesson.LessonIndex;
import com.marrow.data.models.lesson.home.HomeLessonIndexV2;
import java.io.Serializable;
import kotlin.AdaptationSet;
import kotlin.parseDolbyChannelConfiguration;

/* JADX INFO: loaded from: classes3.dex */
public class LessonTabItem<T> implements Serializable {
    public static final int TYPE_HEADER = 1;
    public static final int TYPE_LESSON = 2;
    public static final int TYPE_LESSON_CONCISED = 3;
    public static final int TYPE_LESSON_DESC = 5;
    public static final int TYPE_LESSON_SUGGESTION = 7;
    public static final int TYPE_RELATED_LESSON = 4;
    public static final int TYPE_WATCH_COUNT = 6;
    public String authorDesc;
    public String authorSubTitle;
    public String authorTitle;
    public float averageRating;
    public String downloadLessonId;
    public int downloadPercentage;
    public int downloadStatus;
    public String id;
    public boolean isComingSoon;
    public boolean isConciseMode;
    public boolean isConcisedItem;
    public boolean isFree;
    public boolean isInDownloadedList;
    public boolean isMcqLesson;
    public boolean isOptional;
    public boolean isPaid;
    public T item;
    public String lessonImageUrl;
    public String lessonReadTimeText;
    public float lessonScorePercentage;
    public int mcqCount;
    public long msCompletionTime;
    public int newMcqCount;
    public float percentile;
    public int status;
    public String title;
    public int totalNumberOfVideos;
    public int totalNumberOfWatchedVideos;
    public int type;
    public int typePosition;
    public int updatedMcqCount;
    public int totalNumberOfOptionalVideos = 0;
    public int totalNumberOfOptionalWatchedVideos = 0;
    public int pytCount = 0;
    public boolean isLessonUnlocked = false;

    public boolean equals(Object obj) {
        if (!(obj instanceof LessonTabItem)) {
            return super.equals(obj);
        }
        LessonTabItem lessonTabItem = (LessonTabItem) obj;
        return this.type == lessonTabItem.type && this.status == lessonTabItem.status && this.isFree == lessonTabItem.isFree && this.typePosition == lessonTabItem.typePosition && this.newMcqCount == lessonTabItem.newMcqCount && this.updatedMcqCount == lessonTabItem.updatedMcqCount && this.isOptional == lessonTabItem.isOptional && this.isInDownloadedList == lessonTabItem.isInDownloadedList && this.downloadStatus == lessonTabItem.downloadStatus && this.downloadPercentage == lessonTabItem.downloadPercentage && parseDolbyChannelConfiguration.RemoteActionCompatParcelizer(this.id, lessonTabItem.id) && parseDolbyChannelConfiguration.RemoteActionCompatParcelizer(this.lessonReadTimeText, lessonTabItem.lessonReadTimeText);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static LessonTabItem newInstance(String str, LessonIndex lessonIndex) {
        LessonTabItem lessonTabItem = new LessonTabItem();
        lessonTabItem.type = 2;
        lessonTabItem.item = lessonIndex;
        lessonTabItem.id = str;
        lessonTabItem.status = lessonIndex.getStatus();
        lessonTabItem.isFree = !lessonIndex.isPaid();
        lessonTabItem.isOptional = lessonIndex.isOptional();
        lessonTabItem.title = lessonIndex.getTitle();
        lessonTabItem.isPaid = lessonIndex.isPaid();
        lessonTabItem.averageRating = lessonIndex.getAverageRating();
        lessonTabItem.isComingSoon = lessonIndex.isComingSoon();
        lessonTabItem.lessonImageUrl = lessonIndex.getImageUrl();
        lessonTabItem.lessonReadTimeText = lessonIndex.getLessonReadTimeText();
        lessonTabItem.mcqCount = lessonIndex.getMCQCount();
        lessonTabItem.percentile = lessonIndex.getPercentile();
        lessonTabItem.lessonScorePercentage = AdaptationSet.IconCompatParcelizer(Integer.valueOf(lessonIndex.getScore()), Integer.valueOf(lessonIndex.getPossibleScore()));
        lessonTabItem.msCompletionTime = lessonIndex.getCompletionTimeMs();
        lessonTabItem.isMcqLesson = !lessonIndex.hasVideo();
        lessonTabItem.pytCount = lessonIndex.getPytMcqCount();
        return lessonTabItem;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static LessonTabItem newInstance(String str, String str2) {
        LessonTabItem lessonTabItem = new LessonTabItem();
        lessonTabItem.type = 1;
        lessonTabItem.item = str2;
        lessonTabItem.id = str;
        return lessonTabItem;
    }

    public static LessonTabItem newInstance(String str, String str2, String str3) {
        LessonTabItem lessonTabItem = new LessonTabItem();
        lessonTabItem.type = 5;
        lessonTabItem.authorTitle = str;
        lessonTabItem.authorSubTitle = str2;
        lessonTabItem.authorDesc = str3;
        return lessonTabItem;
    }

    public static LessonTabItem newInstance(int i, int i2, int i3, int i4, boolean z) {
        LessonTabItem lessonTabItem = new LessonTabItem();
        lessonTabItem.type = 6;
        lessonTabItem.totalNumberOfVideos = i;
        lessonTabItem.totalNumberOfWatchedVideos = i2;
        lessonTabItem.totalNumberOfOptionalVideos = i3;
        lessonTabItem.totalNumberOfOptionalWatchedVideos = i4;
        lessonTabItem.isConciseMode = z;
        return lessonTabItem;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static LessonTabItem newLessonSuggestionInstance(HomeLessonIndexV2 homeLessonIndexV2) {
        LessonTabItem lessonTabItem = new LessonTabItem();
        lessonTabItem.item = homeLessonIndexV2;
        lessonTabItem.type = 7;
        return lessonTabItem;
    }
}
