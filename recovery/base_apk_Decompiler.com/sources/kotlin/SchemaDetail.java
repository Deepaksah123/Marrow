package kotlin;

import kotlin.getTestHeaderTitle;
import kotlin.setActiveRecallQbankId;

/* JADX INFO: loaded from: classes4.dex */
public final class SchemaDetail extends NetworkStat implements getListOfSchemaQbankItems {
    private final setTagActive AudioAttributesImplApi21Parcelizer;
    private final setVideoId AudioAttributesImplBaseParcelizer;
    private final setActiveRecallQbankId.write IconCompatParcelizer;
    private final setRatingCount RemoteActionCompatParcelizer;
    private final setQuestions read;

    @Override // kotlin.getIntegerMap, kotlin.CourseConfigV2NavDrawerItemRateUs
    public final boolean AudioAttributesCompatParcelizer() {
        return false;
    }

    @Override // kotlin.getIntegerMap, kotlin.CourseConfigV2NavDrawerItemRateUs
    public final boolean IconCompatParcelizer() {
        return false;
    }

    @Override // kotlin.getIntegerMap, kotlin.CourseConfigV2NavDrawerItemYourCourse
    public final boolean onMediaButtonEvent() {
        return false;
    }

    @Override // kotlin.getIntegerMap, kotlin.CourseConfigV2NavDrawerItemRateUs
    public final boolean onSeekTo() {
        return false;
    }

    public /* synthetic */ SchemaDetail(CourseConfigV2CustomModuleQuestionSource courseConfigV2CustomModuleQuestionSource, getQuote getquote, boolean z, getTestHeaderTitle.RemoteActionCompatParcelizer remoteActionCompatParcelizer, setActiveRecallQbankId.write writeVar, setRatingCount setratingcount, setTagActive settagactive, setVideoId setvideoid, setQuestions setquestions) {
        this(courseConfigV2CustomModuleQuestionSource, null, getquote, z, remoteActionCompatParcelizer, writeVar, setratingcount, settagactive, setvideoid, setquestions, null);
    }

    @Override // kotlin.NetworkStat, kotlin.getIntegerMap
    public final /* synthetic */ getIntegerMap read(getVariant getvariant, CourseConfigV2NavDrawerItemRateUs courseConfigV2NavDrawerItemRateUs, getTestHeaderTitle.RemoteActionCompatParcelizer remoteActionCompatParcelizer, getRelatedLessonId getrelatedlessonid, getQuote getquote, getIntroDurationSeconds getintrodurationseconds) {
        return write(getvariant, courseConfigV2NavDrawerItemRateUs, remoteActionCompatParcelizer, getquote, getintrodurationseconds);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.getStepId
    /* JADX INFO: renamed from: onSetShuffleMode, reason: merged with bridge method [inline-methods] */
    public setActiveRecallQbankId.write onSetRepeatMode() {
        return this.IconCompatParcelizer;
    }

    @Override // kotlin.getStepId
    public final setRatingCount onSetCaptioningEnabled() {
        return this.RemoteActionCompatParcelizer;
    }

    @Override // kotlin.getStepId
    public final setTagActive onSetPlaybackSpeed() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    private setVideoId onStop() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    @Override // kotlin.getStepId
    public final setQuestions onSetRating() {
        return this.read;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private SchemaDetail(CourseConfigV2CustomModuleQuestionSource courseConfigV2CustomModuleQuestionSource, CourseConfigV2GtAnalyticsCard courseConfigV2GtAnalyticsCard, getQuote getquote, boolean z, getTestHeaderTitle.RemoteActionCompatParcelizer remoteActionCompatParcelizer, setActiveRecallQbankId.write writeVar, setRatingCount setratingcount, setTagActive settagactive, setVideoId setvideoid, setQuestions setquestions, getIntroDurationSeconds getintrodurationseconds) {
        super(courseConfigV2CustomModuleQuestionSource, courseConfigV2GtAnalyticsCard, getquote, z, remoteActionCompatParcelizer, getintrodurationseconds == null ? getIntroDurationSeconds.AudioAttributesCompatParcelizer : getintrodurationseconds);
        toMagicModuleMetaRepoModel.write(courseConfigV2CustomModuleQuestionSource, "");
        toMagicModuleMetaRepoModel.write(getquote, "");
        toMagicModuleMetaRepoModel.write(remoteActionCompatParcelizer, "");
        toMagicModuleMetaRepoModel.write(writeVar, "");
        toMagicModuleMetaRepoModel.write(setratingcount, "");
        toMagicModuleMetaRepoModel.write(settagactive, "");
        toMagicModuleMetaRepoModel.write(setvideoid, "");
        this.IconCompatParcelizer = writeVar;
        this.RemoteActionCompatParcelizer = setratingcount;
        this.AudioAttributesImplApi21Parcelizer = settagactive;
        this.AudioAttributesImplBaseParcelizer = setvideoid;
        this.read = setquestions;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.NetworkStat
    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public SchemaDetail write(getVariant getvariant, CourseConfigV2NavDrawerItemRateUs courseConfigV2NavDrawerItemRateUs, getTestHeaderTitle.RemoteActionCompatParcelizer remoteActionCompatParcelizer, getQuote getquote, getIntroDurationSeconds getintrodurationseconds) {
        toMagicModuleMetaRepoModel.write(getvariant, "");
        toMagicModuleMetaRepoModel.write(remoteActionCompatParcelizer, "");
        toMagicModuleMetaRepoModel.write(getquote, "");
        toMagicModuleMetaRepoModel.write(getintrodurationseconds, "");
        SchemaDetail schemaDetail = new SchemaDetail((CourseConfigV2CustomModuleQuestionSource) getvariant, (CourseConfigV2GtAnalyticsCard) courseConfigV2NavDrawerItemRateUs, getquote, ((NetworkStat) this).write, remoteActionCompatParcelizer, onSetRepeatMode(), onSetCaptioningEnabled(), onSetPlaybackSpeed(), onStop(), onSetRating(), getintrodurationseconds);
        schemaDetail.AudioAttributesCompatParcelizer(onRewind());
        return schemaDetail;
    }
}
