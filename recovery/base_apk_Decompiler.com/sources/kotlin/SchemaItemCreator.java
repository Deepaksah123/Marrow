package kotlin;

import kotlin.getTestHeaderTitle;
import kotlin.setActiveRecallQbankId;

/* JADX INFO: loaded from: classes4.dex */
public final class SchemaItemCreator extends getRootSubjectId implements getListOfSchemaQbankItems {
    private final setActiveRecallQbankId.MediaBrowserCompatMediaItem AudioAttributesCompatParcelizer;
    private final setVideoId AudioAttributesImplBaseParcelizer;
    private final setTagActive MediaBrowserCompatItemReceiver;
    private final setQuestions RemoteActionCompatParcelizer;
    private final setRatingCount read;

    @Override // kotlin.getStepId
    /* JADX INFO: renamed from: onSetShuffleMode, reason: merged with bridge method [inline-methods] */
    public final setActiveRecallQbankId.MediaBrowserCompatMediaItem onSetRepeatMode() {
        return this.AudioAttributesCompatParcelizer;
    }

    @Override // kotlin.getStepId
    public final setRatingCount onSetCaptioningEnabled() {
        return this.read;
    }

    @Override // kotlin.getStepId
    public final setTagActive onSetPlaybackSpeed() {
        return this.MediaBrowserCompatItemReceiver;
    }

    private setVideoId setSessionImpl() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    @Override // kotlin.getStepId
    public final setQuestions onSetRating() {
        return this.RemoteActionCompatParcelizer;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SchemaItemCreator(getVariant getvariant, CourseConfigV2SettingsItems courseConfigV2SettingsItems, getQuote getquote, CourseConfigV2NavDrawerItems courseConfigV2NavDrawerItems, CourseConfigV2NavDrawerItemFreeExtension courseConfigV2NavDrawerItemFreeExtension, boolean z, getRelatedLessonId getrelatedlessonid, getTestHeaderTitle.RemoteActionCompatParcelizer remoteActionCompatParcelizer, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, setActiveRecallQbankId.MediaBrowserCompatMediaItem mediaBrowserCompatMediaItem, setRatingCount setratingcount, setTagActive settagactive, setVideoId setvideoid, setQuestions setquestions) {
        super(getvariant, courseConfigV2SettingsItems, getquote, courseConfigV2NavDrawerItems, courseConfigV2NavDrawerItemFreeExtension, z, getrelatedlessonid, remoteActionCompatParcelizer, getIntroDurationSeconds.AudioAttributesCompatParcelizer, z2, z3, z6, false, z4, z5);
        toMagicModuleMetaRepoModel.write(getvariant, "");
        toMagicModuleMetaRepoModel.write(getquote, "");
        toMagicModuleMetaRepoModel.write(courseConfigV2NavDrawerItems, "");
        toMagicModuleMetaRepoModel.write(courseConfigV2NavDrawerItemFreeExtension, "");
        toMagicModuleMetaRepoModel.write(getrelatedlessonid, "");
        toMagicModuleMetaRepoModel.write(remoteActionCompatParcelizer, "");
        toMagicModuleMetaRepoModel.write(mediaBrowserCompatMediaItem, "");
        toMagicModuleMetaRepoModel.write(setratingcount, "");
        toMagicModuleMetaRepoModel.write(settagactive, "");
        toMagicModuleMetaRepoModel.write(setvideoid, "");
        this.AudioAttributesCompatParcelizer = mediaBrowserCompatMediaItem;
        this.read = setratingcount;
        this.MediaBrowserCompatItemReceiver = settagactive;
        this.AudioAttributesImplBaseParcelizer = setvideoid;
        this.RemoteActionCompatParcelizer = setquestions;
    }

    @Override // kotlin.getRootSubjectId
    public final getRootSubjectId IconCompatParcelizer(getVariant getvariant, CourseConfigV2NavDrawerItems courseConfigV2NavDrawerItems, CourseConfigV2NavDrawerItemFreeExtension courseConfigV2NavDrawerItemFreeExtension, CourseConfigV2SettingsItems courseConfigV2SettingsItems, getTestHeaderTitle.RemoteActionCompatParcelizer remoteActionCompatParcelizer, getRelatedLessonId getrelatedlessonid, getIntroDurationSeconds getintrodurationseconds) {
        toMagicModuleMetaRepoModel.write(getvariant, "");
        toMagicModuleMetaRepoModel.write(courseConfigV2NavDrawerItems, "");
        toMagicModuleMetaRepoModel.write(courseConfigV2NavDrawerItemFreeExtension, "");
        toMagicModuleMetaRepoModel.write(remoteActionCompatParcelizer, "");
        toMagicModuleMetaRepoModel.write(getrelatedlessonid, "");
        toMagicModuleMetaRepoModel.write(getintrodurationseconds, "");
        return new SchemaItemCreator(getvariant, courseConfigV2SettingsItems, RemoteActionCompatParcelizer(), courseConfigV2NavDrawerItems, courseConfigV2NavDrawerItemFreeExtension, onRewind(), getrelatedlessonid, remoteActionCompatParcelizer, onPrepare(), onPlayFromUri(), onMediaButtonEvent(), onSeekTo(), onPause(), onSetRepeatMode(), onSetCaptioningEnabled(), onSetPlaybackSpeed(), setSessionImpl(), onSetRating());
    }

    @Override // kotlin.getRootSubjectId, kotlin.CourseConfigV2NavDrawerItemYourCourse
    public final boolean onMediaButtonEvent() {
        Boolean boolIconCompatParcelizer = setPeopleSolved.onCommand.IconCompatParcelizer(onSetRepeatMode().AudioAttributesCompatParcelizer());
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(boolIconCompatParcelizer, "");
        return boolIconCompatParcelizer.booleanValue();
    }
}
