package kotlin;

import kotlin.getTestHeaderTitle;
import kotlin.setActiveRecallQbankId;

/* JADX INFO: loaded from: classes4.dex */
public final class SchemaLessonCompletionMcqMap extends getAttemptedCount implements getListOfSchemaQbankItems {
    private final setVideoId AudioAttributesImplApi26Parcelizer;
    private final setActiveRecallQbankId.AudioAttributesImplApi26Parcelizer IconCompatParcelizer;
    private final setQuestions RemoteActionCompatParcelizer;
    private final setTagActive read;
    private final setRatingCount write;

    public /* synthetic */ SchemaLessonCompletionMcqMap(getVariant getvariant, getQuote getquote, getRelatedLessonId getrelatedlessonid, getTestHeaderTitle.RemoteActionCompatParcelizer remoteActionCompatParcelizer, setActiveRecallQbankId.AudioAttributesImplApi26Parcelizer audioAttributesImplApi26Parcelizer, setRatingCount setratingcount, setTagActive settagactive, setVideoId setvideoid, setQuestions setquestions) {
        this(getvariant, null, getquote, getrelatedlessonid, remoteActionCompatParcelizer, audioAttributesImplApi26Parcelizer, setratingcount, settagactive, setvideoid, setquestions, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.getStepId
    /* JADX INFO: renamed from: onPlay, reason: merged with bridge method [inline-methods] */
    public setActiveRecallQbankId.AudioAttributesImplApi26Parcelizer onSetRepeatMode() {
        return this.IconCompatParcelizer;
    }

    @Override // kotlin.getStepId
    public final setRatingCount onSetCaptioningEnabled() {
        return this.write;
    }

    @Override // kotlin.getStepId
    public final setTagActive onSetPlaybackSpeed() {
        return this.read;
    }

    private setVideoId onFastForward() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    @Override // kotlin.getStepId
    public final setQuestions onSetRating() {
        return this.RemoteActionCompatParcelizer;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private SchemaLessonCompletionMcqMap(getVariant getvariant, CourseConfigV2SupportItem courseConfigV2SupportItem, getQuote getquote, getRelatedLessonId getrelatedlessonid, getTestHeaderTitle.RemoteActionCompatParcelizer remoteActionCompatParcelizer, setActiveRecallQbankId.AudioAttributesImplApi26Parcelizer audioAttributesImplApi26Parcelizer, setRatingCount setratingcount, setTagActive settagactive, setVideoId setvideoid, setQuestions setquestions, getIntroDurationSeconds getintrodurationseconds) {
        super(getvariant, courseConfigV2SupportItem, getquote, getrelatedlessonid, remoteActionCompatParcelizer, getintrodurationseconds == null ? getIntroDurationSeconds.AudioAttributesCompatParcelizer : getintrodurationseconds);
        toMagicModuleMetaRepoModel.write(getvariant, "");
        toMagicModuleMetaRepoModel.write(getquote, "");
        toMagicModuleMetaRepoModel.write(getrelatedlessonid, "");
        toMagicModuleMetaRepoModel.write(remoteActionCompatParcelizer, "");
        toMagicModuleMetaRepoModel.write(audioAttributesImplApi26Parcelizer, "");
        toMagicModuleMetaRepoModel.write(setratingcount, "");
        toMagicModuleMetaRepoModel.write(settagactive, "");
        toMagicModuleMetaRepoModel.write(setvideoid, "");
        this.IconCompatParcelizer = audioAttributesImplApi26Parcelizer;
        this.write = setratingcount;
        this.read = settagactive;
        this.AudioAttributesImplApi26Parcelizer = setvideoid;
        this.RemoteActionCompatParcelizer = setquestions;
    }

    @Override // kotlin.getAttemptedCount, kotlin.getIntegerMap
    public final getIntegerMap read(getVariant getvariant, CourseConfigV2NavDrawerItemRateUs courseConfigV2NavDrawerItemRateUs, getTestHeaderTitle.RemoteActionCompatParcelizer remoteActionCompatParcelizer, getRelatedLessonId getrelatedlessonid, getQuote getquote, getIntroDurationSeconds getintrodurationseconds) {
        getRelatedLessonId getrelatedlessonid2;
        toMagicModuleMetaRepoModel.write(getvariant, "");
        toMagicModuleMetaRepoModel.write(remoteActionCompatParcelizer, "");
        toMagicModuleMetaRepoModel.write(getquote, "");
        toMagicModuleMetaRepoModel.write(getintrodurationseconds, "");
        CourseConfigV2SupportItem courseConfigV2SupportItem = (CourseConfigV2SupportItem) courseConfigV2NavDrawerItemRateUs;
        if (getrelatedlessonid == null) {
            getRelatedLessonId getrelatedlessonidAQ_ = aQ_();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getrelatedlessonidAQ_, "");
            getrelatedlessonid2 = getrelatedlessonidAQ_;
        } else {
            getrelatedlessonid2 = getrelatedlessonid;
        }
        SchemaLessonCompletionMcqMap schemaLessonCompletionMcqMap = new SchemaLessonCompletionMcqMap(getvariant, courseConfigV2SupportItem, getquote, getrelatedlessonid2, remoteActionCompatParcelizer, onSetRepeatMode(), onSetCaptioningEnabled(), onSetPlaybackSpeed(), onFastForward(), onSetRating(), getintrodurationseconds);
        schemaLessonCompletionMcqMap.AudioAttributesCompatParcelizer(onRewind());
        return schemaLessonCompletionMcqMap;
    }
}
