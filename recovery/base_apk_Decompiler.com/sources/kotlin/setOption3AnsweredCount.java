package kotlin;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class setOption3AnsweredCount {
    private final fromQbank AudioAttributesCompatParcelizer;
    private final setModuleMessage IconCompatParcelizer;

    public setOption3AnsweredCount(fromQbank fromqbank, setModuleMessage setmodulemessage) {
        toMagicModuleMetaRepoModel.write(fromqbank, "");
        toMagicModuleMetaRepoModel.write(setmodulemessage, "");
        this.AudioAttributesCompatParcelizer = fromqbank;
        this.IconCompatParcelizer = setmodulemessage;
    }

    public final fromQbank AudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final CourseConfigV2CustomModuleQuestionSource write(isPaused ispaused) {
        toMagicModuleMetaRepoModel.write(ispaused, "");
        getNotesCount getnotescountAudioAttributesImplApi21Parcelizer = ispaused.AudioAttributesImplApi21Parcelizer();
        if (getnotescountAudioAttributesImplApi21Parcelizer != null && ispaused.MediaBrowserCompatCustomActionResultReceiver() == setUserStartedTimestamp.SOURCE) {
            return this.IconCompatParcelizer.IconCompatParcelizer(getnotescountAudioAttributesImplApi21Parcelizer);
        }
        isPaused ispausedMediaDescriptionCompat = ispaused.MediaDescriptionCompat();
        if (ispausedMediaDescriptionCompat != null) {
            CourseConfigV2CustomModuleQuestionSource courseConfigV2CustomModuleQuestionSourceWrite = write(ispausedMediaDescriptionCompat);
            setTags settagsOnSeekTo = courseConfigV2CustomModuleQuestionSourceWrite != null ? courseConfigV2CustomModuleQuestionSourceWrite.onSeekTo() : null;
            getQuestionLimit getquestionlimitAudioAttributesCompatParcelizer = settagsOnSeekTo != null ? settagsOnSeekTo.AudioAttributesCompatParcelizer(ispaused.RatingCompat(), isCollapsible.FROM_JAVA_LOADER) : null;
            if (getquestionlimitAudioAttributesCompatParcelizer instanceof CourseConfigV2CustomModuleQuestionSource) {
                return (CourseConfigV2CustomModuleQuestionSource) getquestionlimitAudioAttributesCompatParcelizer;
            }
            return null;
        }
        if (getnotescountAudioAttributesImplApi21Parcelizer == null) {
            return null;
        }
        fromQbank fromqbank = this.AudioAttributesCompatParcelizer;
        getNotesCount getnotescountAudioAttributesCompatParcelizer = getnotescountAudioAttributesImplApi21Parcelizer.AudioAttributesCompatParcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getnotescountAudioAttributesCompatParcelizer, "");
        RecentUpdatesFilters recentUpdatesFilters = (RecentUpdatesFilters) IntermediateLoginResponseBody.MediaBrowserCompatSearchResultReceiver((List) fromqbank.IconCompatParcelizer(getnotescountAudioAttributesCompatParcelizer));
        if (recentUpdatesFilters != null) {
            return recentUpdatesFilters.RemoteActionCompatParcelizer(ispaused);
        }
        return null;
    }
}
