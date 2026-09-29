package kotlin;

import com.marrow.data.models.test.TestMini;

/* JADX INFO: loaded from: classes3.dex */
public final class FlagSetBuilder {
    public static final FileTypesType AudioAttributesCompatParcelizer(TestMini testMini) {
        toMagicModuleMetaRepoModel.write(testMini, "");
        String id = testMini.getId();
        String str = id == null ? "" : id;
        String testType = testMini.getTestType();
        String str2 = testType == null ? "" : testType;
        String subjectId = testMini.getSubjectId();
        String str3 = subjectId == null ? "" : subjectId;
        String title = testMini.getTitle();
        return new FileTypesType(str, str2, str3, title == null ? "" : title, testMini.getDuration(), testMini.getMcqCount(), testMini.isPaid(), testMini.getRank(), testMini.getStatus(), testMini.getStartTimestamp(), testMini.getEndTimestamp(), testMini.getModifiedEndTimestampMs(), testMini.getTestPattern(), testMini.getAvailabilityType(), testMini.getUserStartedTimestampMs(), testMini.getUserSubmittedTimestampMs(), testMini.getTestStatus(), testMini.getIsMockTest(), testMini.getMaxMcqCount());
    }
}
