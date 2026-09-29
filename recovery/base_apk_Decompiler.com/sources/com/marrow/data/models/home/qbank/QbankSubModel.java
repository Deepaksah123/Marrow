package com.marrow.data.models.home.qbank;

import com.marrow.data.models.lesson.LessonIndex;
import com.marrow.data.models.lesson.home.HomeLessonIndexV2;
import java.util.Locale;
import kotlin.parseDolbyChannelConfiguration;

/* JADX INFO: loaded from: classes3.dex */
public class QbankSubModel {
    private static final String SEPERATOR = ",";
    public int count;
    public boolean isPaid;
    public boolean isUnlocked;
    public int mcqCount;
    public int newCount;
    public float rating;
    public int reason;
    public int status;
    public int updatedCount;

    public static QbankSubModel extract(String str) {
        QbankSubModel qbankSubModel = new QbankSubModel();
        if (str != null) {
            String[] strArrSplit = str.split(SEPERATOR);
            if (strArrSplit.length == 9) {
                qbankSubModel.reason = parseDolbyChannelConfiguration.write(strArrSplit[0]);
                qbankSubModel.rating = parseDolbyChannelConfiguration.RemoteActionCompatParcelizer(strArrSplit[1]);
                qbankSubModel.count = parseDolbyChannelConfiguration.write(strArrSplit[2]);
                qbankSubModel.isPaid = parseDolbyChannelConfiguration.IconCompatParcelizer(strArrSplit[3], true);
                qbankSubModel.status = parseDolbyChannelConfiguration.write(strArrSplit[4]);
                qbankSubModel.newCount = parseDolbyChannelConfiguration.write(strArrSplit[5]);
                qbankSubModel.updatedCount = parseDolbyChannelConfiguration.write(strArrSplit[6]);
                qbankSubModel.isUnlocked = parseDolbyChannelConfiguration.IconCompatParcelizer(strArrSplit[7], false);
                qbankSubModel.mcqCount = parseDolbyChannelConfiguration.write(strArrSplit[8]);
            }
        }
        return qbankSubModel;
    }

    public String toString() {
        return String.format(Locale.getDefault(), "%d %s %.2f %s %d %s %d %s %d %s %d %s %d %s %d %s %d", Integer.valueOf(this.reason), SEPERATOR, Float.valueOf(this.rating), SEPERATOR, Integer.valueOf(this.count), SEPERATOR, Integer.valueOf(this.isPaid ? 1 : 0), SEPERATOR, Integer.valueOf(this.status), SEPERATOR, Integer.valueOf(this.newCount), SEPERATOR, Integer.valueOf(this.updatedCount), SEPERATOR, Integer.valueOf(this.isUnlocked ? 1 : 0), SEPERATOR, Integer.valueOf(this.mcqCount));
    }

    public void load(HomeLessonIndexV2 homeLessonIndexV2, int i) {
        LessonIndex lessonIndex = homeLessonIndexV2.getLessonIndex();
        this.reason = i;
        this.rating = lessonIndex.getAverageRating();
        this.count = lessonIndex.getTotalPeopleRated();
        this.isPaid = lessonIndex.isPaid();
        this.status = lessonIndex.getStatus();
        this.newCount = homeLessonIndexV2.newCount;
        this.updatedCount = homeLessonIndexV2.updatedCount;
        this.mcqCount = lessonIndex.getMCQCount();
    }
}
