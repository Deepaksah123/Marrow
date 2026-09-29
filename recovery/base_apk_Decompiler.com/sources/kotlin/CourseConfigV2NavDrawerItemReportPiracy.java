package kotlin;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class CourseConfigV2NavDrawerItemReportPiracy {
    public static final CourseConfigV2CustomModuleQuestionSource AudioAttributesCompatParcelizer(getTopSection gettopsection, RevisionSubjectStatusModel revisionSubjectStatusModel) {
        toMagicModuleMetaRepoModel.write(gettopsection, "");
        toMagicModuleMetaRepoModel.write(revisionSubjectStatusModel, "");
        getQuestionLimit getquestionlimit = read(gettopsection, revisionSubjectStatusModel);
        if (getquestionlimit instanceof CourseConfigV2CustomModuleQuestionSource) {
            return (CourseConfigV2CustomModuleQuestionSource) getquestionlimit;
        }
        return null;
    }

    public static final CourseConfigV2CustomModuleQuestionSource IconCompatParcelizer(getTopSection gettopsection, RevisionSubjectStatusModel revisionSubjectStatusModel, CourseConfigV2PlanScreenConfig courseConfigV2PlanScreenConfig) {
        toMagicModuleMetaRepoModel.write(gettopsection, "");
        toMagicModuleMetaRepoModel.write(revisionSubjectStatusModel, "");
        toMagicModuleMetaRepoModel.write(courseConfigV2PlanScreenConfig, "");
        CourseConfigV2CustomModuleQuestionSource courseConfigV2CustomModuleQuestionSourceAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(gettopsection, revisionSubjectStatusModel);
        return courseConfigV2CustomModuleQuestionSourceAudioAttributesCompatParcelizer != null ? courseConfigV2CustomModuleQuestionSourceAudioAttributesCompatParcelizer : courseConfigV2PlanScreenConfig.AudioAttributesCompatParcelizer(revisionSubjectStatusModel, StateResult.MediaBrowserCompatItemReceiver(StateResult.write(StateResult.RemoteActionCompatParcelizer(revisionSubjectStatusModel, IconCompatParcelizer.read), read.AudioAttributesCompatParcelizer)));
    }

    final /* synthetic */ class IconCompatParcelizer extends MagicModuleRepoModelsKt implements getAnswerMap<RevisionSubjectStatusModel, RevisionSubjectStatusModel> {
        public static final IconCompatParcelizer read = new IconCompatParcelizer();

        private static RevisionSubjectStatusModel RemoteActionCompatParcelizer(RevisionSubjectStatusModel revisionSubjectStatusModel) {
            toMagicModuleMetaRepoModel.write(revisionSubjectStatusModel, "");
            return revisionSubjectStatusModel.write();
        }

        @Override // kotlin.r8lambdawOOzi0yme1vxdgON3UOSQJBjUQA, kotlin.isKycAuditIncomplete
        public final String MediaBrowserCompatCustomActionResultReceiver() {
            return "getOuterClassId";
        }

        @Override // kotlin.r8lambdawOOzi0yme1vxdgON3UOSQJBjUQA
        public final isAuthError MediaDescriptionCompat() {
            return toMagicModuleMetaDataUcModel.write(RevisionSubjectStatusModel.class);
        }

        @Override // kotlin.getAnswerMap
        public final /* synthetic */ RevisionSubjectStatusModel invoke(RevisionSubjectStatusModel revisionSubjectStatusModel) {
            return RemoteActionCompatParcelizer(revisionSubjectStatusModel);
        }

        IconCompatParcelizer() {
            super(1);
        }

        @Override // kotlin.r8lambdawOOzi0yme1vxdgON3UOSQJBjUQA
        public final String MediaBrowserCompatMediaItem() {
            return "getOuterClassId()Lorg/jetbrains/kotlin/name/ClassId;";
        }
    }

    static final class read extends MagicModuleUseCase implements getAnswerMap<RevisionSubjectStatusModel, Integer> {
        public static final read AudioAttributesCompatParcelizer = new read();

        private static Integer read(RevisionSubjectStatusModel revisionSubjectStatusModel) {
            toMagicModuleMetaRepoModel.write(revisionSubjectStatusModel, "");
            return 0;
        }

        @Override // kotlin.getAnswerMap
        public final /* synthetic */ Integer invoke(RevisionSubjectStatusModel revisionSubjectStatusModel) {
            return read(revisionSubjectStatusModel);
        }

        read() {
            super(1);
        }
    }

    public static final CourseConfigV2VideoProperties RemoteActionCompatParcelizer(getTopSection gettopsection, RevisionSubjectStatusModel revisionSubjectStatusModel) {
        toMagicModuleMetaRepoModel.write(gettopsection, "");
        toMagicModuleMetaRepoModel.write(revisionSubjectStatusModel, "");
        getQuestionLimit getquestionlimit = read(gettopsection, revisionSubjectStatusModel);
        if (getquestionlimit instanceof CourseConfigV2VideoProperties) {
            return (CourseConfigV2VideoProperties) getquestionlimit;
        }
        return null;
    }

    public static final getQuestionLimit read(getTopSection gettopsection, RevisionSubjectStatusModel revisionSubjectStatusModel) {
        toMagicModuleMetaRepoModel.write(gettopsection, "");
        toMagicModuleMetaRepoModel.write(revisionSubjectStatusModel, "");
        getTopSection gettopsectionAudioAttributesCompatParcelizer = setQuestionDescription.AudioAttributesCompatParcelizer(gettopsection);
        if (gettopsectionAudioAttributesCompatParcelizer == null) {
            getNotesCount getnotescountRemoteActionCompatParcelizer = revisionSubjectStatusModel.RemoteActionCompatParcelizer();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getnotescountRemoteActionCompatParcelizer, "");
            CourseConfigV2SearchItem courseConfigV2SearchItemRemoteActionCompatParcelizer = gettopsection.RemoteActionCompatParcelizer(getnotescountRemoteActionCompatParcelizer);
            List<getRelatedLessonId> listWrite = revisionSubjectStatusModel.IconCompatParcelizer().write();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(listWrite, "");
            setTags settagsIconCompatParcelizer = courseConfigV2SearchItemRemoteActionCompatParcelizer.IconCompatParcelizer();
            Object objRatingCompat = IntermediateLoginResponseBody.RatingCompat((List<? extends Object>) listWrite);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(objRatingCompat, "");
            CourseConfigV2CustomModuleQuestionSource courseConfigV2CustomModuleQuestionSourceAudioAttributesCompatParcelizer = settagsIconCompatParcelizer.AudioAttributesCompatParcelizer((getRelatedLessonId) objRatingCompat, isCollapsible.FROM_DESERIALIZATION);
            if (courseConfigV2CustomModuleQuestionSourceAudioAttributesCompatParcelizer == null) {
                return null;
            }
            for (getRelatedLessonId getrelatedlessonid : listWrite.subList(1, listWrite.size())) {
                if (!(courseConfigV2CustomModuleQuestionSourceAudioAttributesCompatParcelizer instanceof CourseConfigV2CustomModuleQuestionSource)) {
                    return null;
                }
                setTags settagsOnSeekTo = ((CourseConfigV2CustomModuleQuestionSource) courseConfigV2CustomModuleQuestionSourceAudioAttributesCompatParcelizer).onSeekTo();
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getrelatedlessonid, "");
                getQuestionLimit getquestionlimitAudioAttributesCompatParcelizer = settagsOnSeekTo.AudioAttributesCompatParcelizer(getrelatedlessonid, isCollapsible.FROM_DESERIALIZATION);
                CourseConfigV2CustomModuleQuestionSource courseConfigV2CustomModuleQuestionSource = getquestionlimitAudioAttributesCompatParcelizer instanceof CourseConfigV2CustomModuleQuestionSource ? (CourseConfigV2CustomModuleQuestionSource) getquestionlimitAudioAttributesCompatParcelizer : null;
                if (courseConfigV2CustomModuleQuestionSource == null) {
                    return null;
                }
                courseConfigV2CustomModuleQuestionSourceAudioAttributesCompatParcelizer = courseConfigV2CustomModuleQuestionSource;
            }
            return courseConfigV2CustomModuleQuestionSourceAudioAttributesCompatParcelizer;
        }
        getNotesCount getnotescountRemoteActionCompatParcelizer2 = revisionSubjectStatusModel.RemoteActionCompatParcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getnotescountRemoteActionCompatParcelizer2, "");
        CourseConfigV2SearchItem courseConfigV2SearchItemRemoteActionCompatParcelizer2 = gettopsectionAudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(getnotescountRemoteActionCompatParcelizer2);
        List<getRelatedLessonId> listWrite2 = revisionSubjectStatusModel.IconCompatParcelizer().write();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(listWrite2, "");
        setTags settagsIconCompatParcelizer2 = courseConfigV2SearchItemRemoteActionCompatParcelizer2.IconCompatParcelizer();
        Object objRatingCompat2 = IntermediateLoginResponseBody.RatingCompat((List<? extends Object>) listWrite2);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(objRatingCompat2, "");
        CourseConfigV2CustomModuleQuestionSource courseConfigV2CustomModuleQuestionSourceAudioAttributesCompatParcelizer2 = settagsIconCompatParcelizer2.AudioAttributesCompatParcelizer((getRelatedLessonId) objRatingCompat2, isCollapsible.FROM_DESERIALIZATION);
        if (courseConfigV2CustomModuleQuestionSourceAudioAttributesCompatParcelizer2 == null) {
            courseConfigV2CustomModuleQuestionSourceAudioAttributesCompatParcelizer2 = null;
            break;
        }
        for (getRelatedLessonId getrelatedlessonid2 : listWrite2.subList(1, listWrite2.size())) {
            if (courseConfigV2CustomModuleQuestionSourceAudioAttributesCompatParcelizer2 instanceof CourseConfigV2CustomModuleQuestionSource) {
                setTags settagsOnSeekTo2 = ((CourseConfigV2CustomModuleQuestionSource) courseConfigV2CustomModuleQuestionSourceAudioAttributesCompatParcelizer2).onSeekTo();
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getrelatedlessonid2, "");
                getQuestionLimit getquestionlimitAudioAttributesCompatParcelizer2 = settagsOnSeekTo2.AudioAttributesCompatParcelizer(getrelatedlessonid2, isCollapsible.FROM_DESERIALIZATION);
                CourseConfigV2CustomModuleQuestionSource courseConfigV2CustomModuleQuestionSource2 = getquestionlimitAudioAttributesCompatParcelizer2 instanceof CourseConfigV2CustomModuleQuestionSource ? (CourseConfigV2CustomModuleQuestionSource) getquestionlimitAudioAttributesCompatParcelizer2 : null;
                if (courseConfigV2CustomModuleQuestionSource2 != null) {
                    courseConfigV2CustomModuleQuestionSourceAudioAttributesCompatParcelizer2 = courseConfigV2CustomModuleQuestionSource2;
                }
            }
            courseConfigV2CustomModuleQuestionSourceAudioAttributesCompatParcelizer2 = null;
        }
        if (courseConfigV2CustomModuleQuestionSourceAudioAttributesCompatParcelizer2 != null) {
            return courseConfigV2CustomModuleQuestionSourceAudioAttributesCompatParcelizer2;
        }
        getNotesCount getnotescountRemoteActionCompatParcelizer3 = revisionSubjectStatusModel.RemoteActionCompatParcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getnotescountRemoteActionCompatParcelizer3, "");
        CourseConfigV2SearchItem courseConfigV2SearchItemRemoteActionCompatParcelizer3 = gettopsection.RemoteActionCompatParcelizer(getnotescountRemoteActionCompatParcelizer3);
        List<getRelatedLessonId> listWrite3 = revisionSubjectStatusModel.IconCompatParcelizer().write();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(listWrite3, "");
        setTags settagsIconCompatParcelizer3 = courseConfigV2SearchItemRemoteActionCompatParcelizer3.IconCompatParcelizer();
        Object objRatingCompat3 = IntermediateLoginResponseBody.RatingCompat((List<? extends Object>) listWrite3);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(objRatingCompat3, "");
        CourseConfigV2CustomModuleQuestionSource courseConfigV2CustomModuleQuestionSourceAudioAttributesCompatParcelizer3 = settagsIconCompatParcelizer3.AudioAttributesCompatParcelizer((getRelatedLessonId) objRatingCompat3, isCollapsible.FROM_DESERIALIZATION);
        if (courseConfigV2CustomModuleQuestionSourceAudioAttributesCompatParcelizer3 == null) {
            return null;
        }
        for (getRelatedLessonId getrelatedlessonid3 : listWrite3.subList(1, listWrite3.size())) {
            if (!(courseConfigV2CustomModuleQuestionSourceAudioAttributesCompatParcelizer3 instanceof CourseConfigV2CustomModuleQuestionSource)) {
                return null;
            }
            setTags settagsOnSeekTo3 = ((CourseConfigV2CustomModuleQuestionSource) courseConfigV2CustomModuleQuestionSourceAudioAttributesCompatParcelizer3).onSeekTo();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getrelatedlessonid3, "");
            getQuestionLimit getquestionlimitAudioAttributesCompatParcelizer3 = settagsOnSeekTo3.AudioAttributesCompatParcelizer(getrelatedlessonid3, isCollapsible.FROM_DESERIALIZATION);
            CourseConfigV2CustomModuleQuestionSource courseConfigV2CustomModuleQuestionSource3 = getquestionlimitAudioAttributesCompatParcelizer3 instanceof CourseConfigV2CustomModuleQuestionSource ? (CourseConfigV2CustomModuleQuestionSource) getquestionlimitAudioAttributesCompatParcelizer3 : null;
            if (courseConfigV2CustomModuleQuestionSource3 == null) {
                return null;
            }
            courseConfigV2CustomModuleQuestionSourceAudioAttributesCompatParcelizer3 = courseConfigV2CustomModuleQuestionSource3;
        }
        return courseConfigV2CustomModuleQuestionSourceAudioAttributesCompatParcelizer3;
    }
}
