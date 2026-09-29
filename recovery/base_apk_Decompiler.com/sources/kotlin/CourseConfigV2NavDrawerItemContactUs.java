package kotlin;

/* JADX INFO: loaded from: classes4.dex */
public final class CourseConfigV2NavDrawerItemContactUs {
    public static final CourseConfigV2CustomModuleQuestionSource write(getTopSection gettopsection, getNotesCount getnotescount, getTimeStamp gettimestamp) {
        getQuestionLimit getquestionlimitAudioAttributesCompatParcelizer;
        setTags settagsOnSeekTo;
        toMagicModuleMetaRepoModel.write(gettopsection, "");
        toMagicModuleMetaRepoModel.write(getnotescount, "");
        toMagicModuleMetaRepoModel.write(gettimestamp, "");
        if (getnotescount.read()) {
            return null;
        }
        getNotesCount getnotescountAudioAttributesCompatParcelizer = getnotescount.AudioAttributesCompatParcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getnotescountAudioAttributesCompatParcelizer, "");
        setTags settagsIconCompatParcelizer = gettopsection.RemoteActionCompatParcelizer(getnotescountAudioAttributesCompatParcelizer).IconCompatParcelizer();
        getRelatedLessonId getrelatedlessonidIconCompatParcelizer = getnotescount.IconCompatParcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getrelatedlessonidIconCompatParcelizer, "");
        getQuestionLimit getquestionlimitAudioAttributesCompatParcelizer2 = settagsIconCompatParcelizer.AudioAttributesCompatParcelizer(getrelatedlessonidIconCompatParcelizer, gettimestamp);
        CourseConfigV2CustomModuleQuestionSource courseConfigV2CustomModuleQuestionSource = getquestionlimitAudioAttributesCompatParcelizer2 instanceof CourseConfigV2CustomModuleQuestionSource ? (CourseConfigV2CustomModuleQuestionSource) getquestionlimitAudioAttributesCompatParcelizer2 : null;
        if (courseConfigV2CustomModuleQuestionSource != null) {
            return courseConfigV2CustomModuleQuestionSource;
        }
        getNotesCount getnotescountAudioAttributesCompatParcelizer2 = getnotescount.AudioAttributesCompatParcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getnotescountAudioAttributesCompatParcelizer2, "");
        CourseConfigV2CustomModuleQuestionSource courseConfigV2CustomModuleQuestionSourceWrite = write(gettopsection, getnotescountAudioAttributesCompatParcelizer2, gettimestamp);
        if (courseConfigV2CustomModuleQuestionSourceWrite == null || (settagsOnSeekTo = courseConfigV2CustomModuleQuestionSourceWrite.onSeekTo()) == null) {
            getquestionlimitAudioAttributesCompatParcelizer = null;
        } else {
            getRelatedLessonId getrelatedlessonidIconCompatParcelizer2 = getnotescount.IconCompatParcelizer();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getrelatedlessonidIconCompatParcelizer2, "");
            getquestionlimitAudioAttributesCompatParcelizer = settagsOnSeekTo.AudioAttributesCompatParcelizer(getrelatedlessonidIconCompatParcelizer2, gettimestamp);
        }
        if (getquestionlimitAudioAttributesCompatParcelizer instanceof CourseConfigV2CustomModuleQuestionSource) {
            return (CourseConfigV2CustomModuleQuestionSource) getquestionlimitAudioAttributesCompatParcelizer;
        }
        return null;
    }

    private static boolean write(getVariant getvariant) {
        toMagicModuleMetaRepoModel.write(getvariant, "");
        return getvariant.onPlayFromMediaId() instanceof getShouldShowEmptyPlanScreen;
    }

    public static final getQuestionLimit read(getVariant getvariant) {
        toMagicModuleMetaRepoModel.write(getvariant, "");
        getVariant getvariantAudioAttributesImplApi21Parcelizer = getvariant.onPlayFromMediaId();
        if (getvariantAudioAttributesImplApi21Parcelizer == null || (getvariant instanceof getShouldShowEmptyPlanScreen)) {
            return null;
        }
        if (!write(getvariantAudioAttributesImplApi21Parcelizer)) {
            return read(getvariantAudioAttributesImplApi21Parcelizer);
        }
        if (getvariantAudioAttributesImplApi21Parcelizer instanceof getQuestionLimit) {
            return (getQuestionLimit) getvariantAudioAttributesImplApi21Parcelizer;
        }
        return null;
    }

    public static final boolean read(CourseConfigV2NavDrawerItemRateUs courseConfigV2NavDrawerItemRateUs) {
        getHref gethrefAP_;
        getLink getlinkMediaDescriptionCompat;
        getLink getlinkAudioAttributesImplBaseParcelizer;
        toMagicModuleMetaRepoModel.write(courseConfigV2NavDrawerItemRateUs, "");
        getVariant getvariantAudioAttributesImplApi21Parcelizer = courseConfigV2NavDrawerItemRateUs.onPlayFromMediaId();
        CourseConfigV2CustomModuleQuestionSource courseConfigV2CustomModuleQuestionSource = getvariantAudioAttributesImplApi21Parcelizer instanceof CourseConfigV2CustomModuleQuestionSource ? (CourseConfigV2CustomModuleQuestionSource) getvariantAudioAttributesImplApi21Parcelizer : null;
        if (courseConfigV2CustomModuleQuestionSource != null) {
            CourseConfigV2CustomModuleQuestionSource courseConfigV2CustomModuleQuestionSource2 = getOption3.RemoteActionCompatParcelizer(courseConfigV2CustomModuleQuestionSource) ? courseConfigV2CustomModuleQuestionSource : null;
            if (courseConfigV2CustomModuleQuestionSource2 != null && (gethrefAP_ = courseConfigV2CustomModuleQuestionSource2.aP_()) != null && (getlinkMediaDescriptionCompat = getSearchTimes.MediaDescriptionCompat(gethrefAP_)) != null && (getlinkAudioAttributesImplBaseParcelizer = courseConfigV2NavDrawerItemRateUs.AudioAttributesImplBaseParcelizer()) != null && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(courseConfigV2NavDrawerItemRateUs.aQ_(), setSuggestedSubjects.AudioAttributesImplBaseParcelizer) && ((getSearchTimes.IconCompatParcelizer(getlinkAudioAttributesImplBaseParcelizer) || getSearchTimes.AudioAttributesImplApi21Parcelizer(getlinkAudioAttributesImplBaseParcelizer)) && courseConfigV2NavDrawerItemRateUs.aX_().size() == 1)) {
                getLink getlinkOnPrepareFromMediaId = courseConfigV2NavDrawerItemRateUs.aX_().get(0).onPrepareFromMediaId();
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getlinkOnPrepareFromMediaId, "");
                if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(getSearchTimes.MediaDescriptionCompat(getlinkOnPrepareFromMediaId), getlinkMediaDescriptionCompat) && courseConfigV2NavDrawerItemRateUs.read().isEmpty() && courseConfigV2NavDrawerItemRateUs.MediaBrowserCompatCustomActionResultReceiver() == null) {
                    return true;
                }
            }
        }
        return false;
    }
}
