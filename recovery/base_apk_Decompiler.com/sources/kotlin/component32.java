package kotlin;

import java.lang.reflect.Method;
import kotlin.ContentResetResponseLesson;
import kotlin.CourseConfigDeserializer;
import kotlin.HomeLessonIndexV2;
import kotlin.getSchemaTitle;
import kotlin.getSubjectIds;
import kotlin.getZenArea;
import kotlin.setActiveRecallQbankId;
import kotlin.toHomeLessonIndex;

/* JADX INFO: loaded from: classes4.dex */
public final class component32 {
    public static final component32 AudioAttributesCompatParcelizer = new component32();
    private static final RevisionSubjectStatusModel read;

    private component32() {
    }

    static {
        RevisionSubjectStatusModel revisionSubjectStatusModelRemoteActionCompatParcelizer = RevisionSubjectStatusModel.RemoteActionCompatParcelizer(new getNotesCount("java.lang.Void"));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(revisionSubjectStatusModelRemoteActionCompatParcelizer, "");
        read = revisionSubjectStatusModelRemoteActionCompatParcelizer;
    }

    public final ContentResetResponseLesson IconCompatParcelizer(CourseConfigV2NavDrawerItemRateUs courseConfigV2NavDrawerItemRateUs) {
        Method methodMediaBrowserCompatCustomActionResultReceiver;
        toMagicModuleMetaRepoModel.write(courseConfigV2NavDrawerItemRateUs, "");
        CourseConfigV2NavDrawerItemRateUs courseConfigV2NavDrawerItemRateUsOnPrepareFromMediaId = ((CourseConfigV2NavDrawerItemRateUs) getAnswerDescription.read(courseConfigV2NavDrawerItemRateUs)).onPrepareFromMediaId();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(courseConfigV2NavDrawerItemRateUsOnPrepareFromMediaId, "");
        if (courseConfigV2NavDrawerItemRateUsOnPrepareFromMediaId instanceof getListOfSchemaQbankItems) {
            getListOfSchemaQbankItems getlistofschemaqbankitems = (getListOfSchemaQbankItems) courseConfigV2NavDrawerItemRateUsOnPrepareFromMediaId;
            BookReference bookReferenceOnSetRepeatMode = getlistofschemaqbankitems.onSetRepeatMode();
            if (bookReferenceOnSetRepeatMode instanceof setActiveRecallQbankId.AudioAttributesImplApi26Parcelizer) {
                getCompletedARQBankCount getcompletedarqbankcount = getCompletedARQBankCount.IconCompatParcelizer;
                getSchemaTitle.IconCompatParcelizer iconCompatParcelizerAudioAttributesCompatParcelizer = getCompletedARQBankCount.AudioAttributesCompatParcelizer((setActiveRecallQbankId.AudioAttributesImplApi26Parcelizer) bookReferenceOnSetRepeatMode, getlistofschemaqbankitems.onSetCaptioningEnabled(), getlistofschemaqbankitems.onSetPlaybackSpeed());
                if (iconCompatParcelizerAudioAttributesCompatParcelizer != null) {
                    return new ContentResetResponseLesson.IconCompatParcelizer(iconCompatParcelizerAudioAttributesCompatParcelizer);
                }
            }
            if (bookReferenceOnSetRepeatMode instanceof setActiveRecallQbankId.write) {
                getCompletedARQBankCount getcompletedarqbankcount2 = getCompletedARQBankCount.IconCompatParcelizer;
                getSchemaTitle.IconCompatParcelizer iconCompatParcelizerAudioAttributesCompatParcelizer2 = getCompletedARQBankCount.AudioAttributesCompatParcelizer((setActiveRecallQbankId.write) bookReferenceOnSetRepeatMode, getlistofschemaqbankitems.onSetCaptioningEnabled(), getlistofschemaqbankitems.onSetPlaybackSpeed());
                if (iconCompatParcelizerAudioAttributesCompatParcelizer2 != null) {
                    getVariant getvariantAudioAttributesImplApi21Parcelizer = courseConfigV2NavDrawerItemRateUs.onPlayFromMediaId();
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getvariantAudioAttributesImplApi21Parcelizer, "");
                    if (getOption3.IconCompatParcelizer(getvariantAudioAttributesImplApi21Parcelizer)) {
                        return new ContentResetResponseLesson.IconCompatParcelizer(iconCompatParcelizerAudioAttributesCompatParcelizer2);
                    }
                    return new ContentResetResponseLesson.AudioAttributesCompatParcelizer(iconCompatParcelizerAudioAttributesCompatParcelizer2);
                }
            }
            return AudioAttributesCompatParcelizer(courseConfigV2NavDrawerItemRateUsOnPrepareFromMediaId);
        }
        if (courseConfigV2NavDrawerItemRateUsOnPrepareFromMediaId instanceof setUserInitiatedExamStartedOn) {
            getIntroDurationSeconds getintrodurationsecondsRatingCompat = ((setUserInitiatedExamStartedOn) courseConfigV2NavDrawerItemRateUsOnPrepareFromMediaId).RatingCompat();
            RecentUpdatesReferencesCreator recentUpdatesReferencesCreator = getintrodurationsecondsRatingCompat instanceof RecentUpdatesReferencesCreator ? (RecentUpdatesReferencesCreator) getintrodurationsecondsRatingCompat : null;
            HomeQbankModelCompanion homeQbankModelCompanionWrite = recentUpdatesReferencesCreator != null ? recentUpdatesReferencesCreator.write() : null;
            setImageTitle setimagetitle = homeQbankModelCompanionWrite instanceof setImageTitle ? (setImageTitle) homeQbankModelCompanionWrite : null;
            if (setimagetitle == null || (methodMediaBrowserCompatCustomActionResultReceiver = setimagetitle.write()) == null) {
                throw new component28("Incorrect resolution sequence for Java method ".concat(String.valueOf(courseConfigV2NavDrawerItemRateUsOnPrepareFromMediaId)));
            }
            return new ContentResetResponseLesson.RemoteActionCompatParcelizer(methodMediaBrowserCompatCustomActionResultReceiver);
        }
        if (courseConfigV2NavDrawerItemRateUsOnPrepareFromMediaId instanceof CustomModuleCompanion) {
            getIntroDurationSeconds getintrodurationsecondsRatingCompat2 = ((CustomModuleCompanion) courseConfigV2NavDrawerItemRateUsOnPrepareFromMediaId).RatingCompat();
            RecentUpdatesReferencesCreator recentUpdatesReferencesCreator2 = getintrodurationsecondsRatingCompat2 instanceof RecentUpdatesReferencesCreator ? (RecentUpdatesReferencesCreator) getintrodurationsecondsRatingCompat2 : null;
            HomeQbankModelCompanion homeQbankModelCompanionWrite2 = recentUpdatesReferencesCreator2 != null ? recentUpdatesReferencesCreator2.write() : null;
            if (homeQbankModelCompanionWrite2 instanceof setImageCitationAuthor) {
                return new ContentResetResponseLesson.read(((setImageCitationAuthor) homeQbankModelCompanionWrite2).write());
            }
            if (homeQbankModelCompanionWrite2 instanceof getImageCitation) {
                getImageCitation getimagecitation = (getImageCitation) homeQbankModelCompanionWrite2;
                if (getimagecitation.onAddQueueItem()) {
                    return new ContentResetResponseLesson.write(getimagecitation.RemoteActionCompatParcelizer());
                }
            }
            StringBuilder sb = new StringBuilder("Incorrect resolution sequence for Java constructor ");
            sb.append(courseConfigV2NavDrawerItemRateUsOnPrepareFromMediaId);
            sb.append(" (");
            sb.append(homeQbankModelCompanionWrite2);
            sb.append(')');
            throw new component28(sb.toString());
        }
        if (RemoteActionCompatParcelizer(courseConfigV2NavDrawerItemRateUsOnPrepareFromMediaId)) {
            return AudioAttributesCompatParcelizer(courseConfigV2NavDrawerItemRateUsOnPrepareFromMediaId);
        }
        StringBuilder sb2 = new StringBuilder("Unknown origin of ");
        sb2.append(courseConfigV2NavDrawerItemRateUsOnPrepareFromMediaId);
        sb2.append(" (");
        sb2.append(courseConfigV2NavDrawerItemRateUsOnPrepareFromMediaId.getClass());
        sb2.append(')');
        throw new component28(sb2.toString());
    }

    public final CourseConfigDeserializer AudioAttributesCompatParcelizer(CourseConfigV2SettingsItems courseConfigV2SettingsItems) {
        toMagicModuleMetaRepoModel.write(courseConfigV2SettingsItems, "");
        CourseConfigV2SettingsItems courseConfigV2SettingsItemsOnPlay = ((CourseConfigV2SettingsItems) getAnswerDescription.read(courseConfigV2SettingsItems)).onAddQueueItem();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(courseConfigV2SettingsItemsOnPlay, "");
        if (courseConfigV2SettingsItemsOnPlay instanceof SchemaItemCreator) {
            SchemaItemCreator schemaItemCreator = (SchemaItemCreator) courseConfigV2SettingsItemsOnPlay;
            setActiveRecallQbankId.MediaBrowserCompatMediaItem mediaBrowserCompatMediaItemOnSetShuffleMode = schemaItemCreator.onSetRepeatMode();
            HomeLessonIndexV2.IconCompatParcelizer<setActiveRecallQbankId.MediaBrowserCompatMediaItem, toHomeLessonIndex.AudioAttributesCompatParcelizer> iconCompatParcelizer = toHomeLessonIndex.AudioAttributesImplBaseParcelizer;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(iconCompatParcelizer, "");
            toHomeLessonIndex.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = (toHomeLessonIndex.AudioAttributesCompatParcelizer) setTagLabel.read(mediaBrowserCompatMediaItemOnSetShuffleMode, iconCompatParcelizer);
            if (audioAttributesCompatParcelizer != null) {
                return new CourseConfigDeserializer.write(courseConfigV2SettingsItemsOnPlay, mediaBrowserCompatMediaItemOnSetShuffleMode, audioAttributesCompatParcelizer, schemaItemCreator.onSetCaptioningEnabled(), schemaItemCreator.onSetPlaybackSpeed());
            }
        } else if (courseConfigV2SettingsItemsOnPlay instanceof setWarningMsg) {
            getIntroDurationSeconds getintrodurationsecondsRatingCompat = ((setWarningMsg) courseConfigV2SettingsItemsOnPlay).RatingCompat();
            RecentUpdatesReferencesCreator recentUpdatesReferencesCreator = getintrodurationsecondsRatingCompat instanceof RecentUpdatesReferencesCreator ? (RecentUpdatesReferencesCreator) getintrodurationsecondsRatingCompat : null;
            HomeQbankModelCompanion homeQbankModelCompanionWrite = recentUpdatesReferencesCreator != null ? recentUpdatesReferencesCreator.write() : null;
            if (homeQbankModelCompanionWrite instanceof setImageUrlV2) {
                return new CourseConfigDeserializer.RemoteActionCompatParcelizer(((setImageUrlV2) homeQbankModelCompanionWrite).write());
            }
            if (homeQbankModelCompanionWrite instanceof setImageTitle) {
                Method methodMediaBrowserCompatCustomActionResultReceiver = ((setImageTitle) homeQbankModelCompanionWrite).write();
                getAppSettings getappsettingsOnPlayFromSearch = courseConfigV2SettingsItemsOnPlay.onPlayFromSearch();
                getIntroDurationSeconds getintrodurationsecondsRatingCompat2 = getappsettingsOnPlayFromSearch != null ? getappsettingsOnPlayFromSearch.RatingCompat() : null;
                RecentUpdatesReferencesCreator recentUpdatesReferencesCreator2 = getintrodurationsecondsRatingCompat2 instanceof RecentUpdatesReferencesCreator ? (RecentUpdatesReferencesCreator) getintrodurationsecondsRatingCompat2 : null;
                HomeQbankModelCompanion homeQbankModelCompanionWrite2 = recentUpdatesReferencesCreator2 != null ? recentUpdatesReferencesCreator2.write() : null;
                setImageTitle setimagetitle = homeQbankModelCompanionWrite2 instanceof setImageTitle ? (setImageTitle) homeQbankModelCompanionWrite2 : null;
                return new CourseConfigDeserializer.AudioAttributesCompatParcelizer(methodMediaBrowserCompatCustomActionResultReceiver, setimagetitle != null ? setimagetitle.write() : null);
            }
            StringBuilder sb = new StringBuilder("Incorrect resolution sequence for Java field ");
            sb.append(courseConfigV2SettingsItemsOnPlay);
            sb.append(" (source = ");
            sb.append(homeQbankModelCompanionWrite);
            sb.append(')');
            throw new component28(sb.toString());
        }
        CourseConfigV2TestItem courseConfigV2TestItemOnPlayFromMediaId = courseConfigV2SettingsItemsOnPlay.onPlayFromMediaId();
        toMagicModuleMetaRepoModel.write(courseConfigV2TestItemOnPlayFromMediaId);
        ContentResetResponseLesson.IconCompatParcelizer iconCompatParcelizerAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(courseConfigV2TestItemOnPlayFromMediaId);
        getAppSettings getappsettingsOnPlayFromSearch2 = courseConfigV2SettingsItemsOnPlay.onPlayFromSearch();
        return new CourseConfigDeserializer.read(iconCompatParcelizerAudioAttributesCompatParcelizer, getappsettingsOnPlayFromSearch2 != null ? AudioAttributesCompatParcelizer(getappsettingsOnPlayFromSearch2) : null);
    }

    private static boolean RemoteActionCompatParcelizer(CourseConfigV2NavDrawerItemRateUs courseConfigV2NavDrawerItemRateUs) {
        if (getOption2.IconCompatParcelizer(courseConfigV2NavDrawerItemRateUs) || getOption2.write(courseConfigV2NavDrawerItemRateUs)) {
            return true;
        }
        getRelatedLessonId getrelatedlessonidAQ_ = courseConfigV2NavDrawerItemRateUs.aQ_();
        getSubjectIds.IconCompatParcelizer iconCompatParcelizer = getSubjectIds.IconCompatParcelizer;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(getrelatedlessonidAQ_, getSubjectIds.IconCompatParcelizer.write()) && courseConfigV2NavDrawerItemRateUs.aX_().isEmpty();
    }

    private static ContentResetResponseLesson.IconCompatParcelizer AudioAttributesCompatParcelizer(CourseConfigV2NavDrawerItemRateUs courseConfigV2NavDrawerItemRateUs) {
        return new ContentResetResponseLesson.IconCompatParcelizer(new getSchemaTitle.IconCompatParcelizer(write(courseConfigV2NavDrawerItemRateUs), getPublishedTime.RemoteActionCompatParcelizer(courseConfigV2NavDrawerItemRateUs, false, false, 1)));
    }

    private static String write(getTestHeaderTitle gettestheadertitle) {
        String strWrite = getModuleOwner.write(gettestheadertitle);
        if (strWrite != null) {
            return strWrite;
        }
        if (gettestheadertitle instanceof CourseConfigV2TestItem) {
            String strAudioAttributesCompatParcelizer = setLocked.AudioAttributesCompatParcelizer(gettestheadertitle).aQ_().AudioAttributesCompatParcelizer();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strAudioAttributesCompatParcelizer, "");
            return VideoInfoMini.write(strAudioAttributesCompatParcelizer);
        }
        if (gettestheadertitle instanceof getAppSettings) {
            String strAudioAttributesCompatParcelizer2 = setLocked.AudioAttributesCompatParcelizer(gettestheadertitle).aQ_().AudioAttributesCompatParcelizer();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strAudioAttributesCompatParcelizer2, "");
            return VideoInfoMini.AudioAttributesCompatParcelizer(strAudioAttributesCompatParcelizer2);
        }
        String strAudioAttributesCompatParcelizer3 = gettestheadertitle.aQ_().AudioAttributesCompatParcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strAudioAttributesCompatParcelizer3, "");
        return strAudioAttributesCompatParcelizer3;
    }

    public static RevisionSubjectStatusModel write(Class<?> cls) {
        toMagicModuleMetaRepoModel.write(cls, "");
        if (cls.isArray()) {
            Class<?> componentType = cls.getComponentType();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(componentType, "");
            getShowNotesWatermark getshownoteswatermark = read(componentType);
            if (getshownoteswatermark != null) {
                return new RevisionSubjectStatusModel(getZenArea.IconCompatParcelizer, getshownoteswatermark.read());
            }
            RevisionSubjectStatusModel revisionSubjectStatusModelRemoteActionCompatParcelizer = RevisionSubjectStatusModel.RemoteActionCompatParcelizer(getZenArea.RemoteActionCompatParcelizer.AudioAttributesImplApi26Parcelizer.MediaBrowserCompatItemReceiver());
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(revisionSubjectStatusModelRemoteActionCompatParcelizer, "");
            return revisionSubjectStatusModelRemoteActionCompatParcelizer;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(cls, Void.TYPE)) {
            return read;
        }
        getShowNotesWatermark getshownoteswatermark2 = read(cls);
        if (getshownoteswatermark2 != null) {
            return new RevisionSubjectStatusModel(getZenArea.IconCompatParcelizer, getshownoteswatermark2.write());
        }
        RevisionSubjectStatusModel revisionSubjectStatusModelAudioAttributesCompatParcelizer = getFinalImageUrl.AudioAttributesCompatParcelizer(cls);
        if (!revisionSubjectStatusModelAudioAttributesCompatParcelizer.AudioAttributesImplApi21Parcelizer()) {
            CourseConfigV2AnnouncementBanner courseConfigV2AnnouncementBanner = CourseConfigV2AnnouncementBanner.write;
            getNotesCount getnotescountAudioAttributesCompatParcelizer = revisionSubjectStatusModelAudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getnotescountAudioAttributesCompatParcelizer, "");
            RevisionSubjectStatusModel revisionSubjectStatusModelWrite = CourseConfigV2AnnouncementBanner.write(getnotescountAudioAttributesCompatParcelizer);
            if (revisionSubjectStatusModelWrite != null) {
                return revisionSubjectStatusModelWrite;
            }
        }
        return revisionSubjectStatusModelAudioAttributesCompatParcelizer;
    }

    private static getShowNotesWatermark read(Class<?> cls) {
        if (cls.isPrimitive()) {
            return setOption2AnsweredCount.RemoteActionCompatParcelizer(cls.getSimpleName()).write();
        }
        return null;
    }
}
