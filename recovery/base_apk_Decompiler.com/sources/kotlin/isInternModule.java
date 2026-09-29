package kotlin;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class isInternModule {
    private static final getQuote AudioAttributesCompatParcelizer;
    private static final isDownloaded write;

    public final /* synthetic */ class read {
        public static final /* synthetic */ int[] read;

        static {
            int[] iArr = new int[VideoSubModel.values().length];
            try {
                iArr[VideoSubModel.NULLABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VideoSubModel.NOT_NULL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            read = iArr;
        }
    }

    public static final boolean write(getLink getlink) {
        toMagicModuleMetaRepoModel.write(getlink, "");
        return LessonIndex.RemoteActionCompatParcelizer(getPlanGroups.RemoteActionCompatParcelizer, getlink);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getQuote read(List<? extends getQuote> list) {
        int size = list.size();
        if (size == 0) {
            throw new IllegalStateException("At least one Annotations object expected".toString());
        }
        if (size == 1) {
            return (getQuote) IntermediateLoginResponseBody.onCommand((List) list);
        }
        return new getPublishedStatus((List<? extends getQuote>) IntermediateLoginResponseBody.onPlay(list));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getQuestionLimit RemoteActionCompatParcelizer(getQuestionLimit getquestionlimit, getSubject getsubject, AssociatedLessonIndex associatedLessonIndex) {
        getPopup getpopup = getPopup.IconCompatParcelizer;
        if (!AssociatedLessonIndexCompanion.IconCompatParcelizer(associatedLessonIndex) || !(getquestionlimit instanceof CourseConfigV2CustomModuleQuestionSource)) {
            return null;
        }
        if (getsubject.AudioAttributesCompatParcelizer() == HomeVideoModel.READ_ONLY && associatedLessonIndex == AssociatedLessonIndex.FLEXIBLE_LOWER) {
            CourseConfigV2CustomModuleQuestionSource courseConfigV2CustomModuleQuestionSource = (CourseConfigV2CustomModuleQuestionSource) getquestionlimit;
            if (getPopup.RemoteActionCompatParcelizer(courseConfigV2CustomModuleQuestionSource)) {
                return getPopup.write(courseConfigV2CustomModuleQuestionSource);
            }
        }
        if (getsubject.AudioAttributesCompatParcelizer() == HomeVideoModel.MUTABLE && associatedLessonIndex == AssociatedLessonIndex.FLEXIBLE_UPPER) {
            CourseConfigV2CustomModuleQuestionSource courseConfigV2CustomModuleQuestionSource2 = (CourseConfigV2CustomModuleQuestionSource) getquestionlimit;
            if (getPopup.read(courseConfigV2CustomModuleQuestionSource2)) {
                return getPopup.AudioAttributesCompatParcelizer(courseConfigV2CustomModuleQuestionSource2);
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Boolean write(getSubject getsubject, AssociatedLessonIndex associatedLessonIndex) {
        if (!AssociatedLessonIndexCompanion.IconCompatParcelizer(associatedLessonIndex)) {
            return null;
        }
        VideoSubModel videoSubModelIconCompatParcelizer = getsubject.IconCompatParcelizer();
        int i = videoSubModelIconCompatParcelizer == null ? -1 : read.read[videoSubModelIconCompatParcelizer.ordinal()];
        if (i == 1) {
            return Boolean.TRUE;
        }
        if (i != 2) {
            return null;
        }
        return Boolean.FALSE;
    }

    static {
        getNotesCount getnotescount = getPsshData.read;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getnotescount, "");
        AudioAttributesCompatParcelizer = new isDownloaded(getnotescount);
        getNotesCount getnotescount2 = getPsshData.RemoteActionCompatParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getnotescount2, "");
        write = new isDownloaded(getnotescount2);
    }

    public static final getQuote IconCompatParcelizer() {
        return AudioAttributesCompatParcelizer;
    }
}
