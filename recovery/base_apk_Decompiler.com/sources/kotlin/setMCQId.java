package kotlin;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.getOption1AnsweredCount;
import kotlin.setActiveRecallQbankId;

/* JADX INFO: loaded from: classes4.dex */
public final class setMCQId {
    private final getTopSection AudioAttributesCompatParcelizer;
    private final CourseConfigV2PlanScreenConfig read;

    public final /* synthetic */ class read {
        public static final /* synthetic */ int[] RemoteActionCompatParcelizer;

        static {
            int[] iArr = new int[setActiveRecallQbankId.IconCompatParcelizer.C0132IconCompatParcelizer.RemoteActionCompatParcelizer.EnumC0133IconCompatParcelizer.values().length];
            try {
                iArr[setActiveRecallQbankId.IconCompatParcelizer.C0132IconCompatParcelizer.RemoteActionCompatParcelizer.EnumC0133IconCompatParcelizer.BYTE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[setActiveRecallQbankId.IconCompatParcelizer.C0132IconCompatParcelizer.RemoteActionCompatParcelizer.EnumC0133IconCompatParcelizer.CHAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[setActiveRecallQbankId.IconCompatParcelizer.C0132IconCompatParcelizer.RemoteActionCompatParcelizer.EnumC0133IconCompatParcelizer.SHORT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[setActiveRecallQbankId.IconCompatParcelizer.C0132IconCompatParcelizer.RemoteActionCompatParcelizer.EnumC0133IconCompatParcelizer.INT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[setActiveRecallQbankId.IconCompatParcelizer.C0132IconCompatParcelizer.RemoteActionCompatParcelizer.EnumC0133IconCompatParcelizer.LONG.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[setActiveRecallQbankId.IconCompatParcelizer.C0132IconCompatParcelizer.RemoteActionCompatParcelizer.EnumC0133IconCompatParcelizer.FLOAT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[setActiveRecallQbankId.IconCompatParcelizer.C0132IconCompatParcelizer.RemoteActionCompatParcelizer.EnumC0133IconCompatParcelizer.DOUBLE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[setActiveRecallQbankId.IconCompatParcelizer.C0132IconCompatParcelizer.RemoteActionCompatParcelizer.EnumC0133IconCompatParcelizer.BOOLEAN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[setActiveRecallQbankId.IconCompatParcelizer.C0132IconCompatParcelizer.RemoteActionCompatParcelizer.EnumC0133IconCompatParcelizer.STRING.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[setActiveRecallQbankId.IconCompatParcelizer.C0132IconCompatParcelizer.RemoteActionCompatParcelizer.EnumC0133IconCompatParcelizer.CLASS.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[setActiveRecallQbankId.IconCompatParcelizer.C0132IconCompatParcelizer.RemoteActionCompatParcelizer.EnumC0133IconCompatParcelizer.ENUM.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[setActiveRecallQbankId.IconCompatParcelizer.C0132IconCompatParcelizer.RemoteActionCompatParcelizer.EnumC0133IconCompatParcelizer.ANNOTATION.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[setActiveRecallQbankId.IconCompatParcelizer.C0132IconCompatParcelizer.RemoteActionCompatParcelizer.EnumC0133IconCompatParcelizer.ARRAY.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            RemoteActionCompatParcelizer = iArr;
        }
    }

    public setMCQId(getTopSection gettopsection, CourseConfigV2PlanScreenConfig courseConfigV2PlanScreenConfig) {
        toMagicModuleMetaRepoModel.write(gettopsection, "");
        toMagicModuleMetaRepoModel.write(courseConfigV2PlanScreenConfig, "");
        this.AudioAttributesCompatParcelizer = gettopsection;
        this.read = courseConfigV2PlanScreenConfig;
    }

    private final getTestTabItems RemoteActionCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer.write();
    }

    public final dummyEditor RemoteActionCompatParcelizer(setActiveRecallQbankId.IconCompatParcelizer iconCompatParcelizer, setRatingCount setratingcount) {
        toMagicModuleMetaRepoModel.write(iconCompatParcelizer, "");
        toMagicModuleMetaRepoModel.write(setratingcount, "");
        CourseConfigV2CustomModuleQuestionSource courseConfigV2CustomModuleQuestionSourceAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(FilterItemRecordCreator.AudioAttributesCompatParcelizer(setratingcount, iconCompatParcelizer.AudioAttributesCompatParcelizer()));
        Map map = VideoTimelineResponseBody.read();
        if (iconCompatParcelizer.write() != 0) {
            CourseConfigV2CustomModuleQuestionSource courseConfigV2CustomModuleQuestionSource = courseConfigV2CustomModuleQuestionSourceAudioAttributesCompatParcelizer;
            if (!SubscriptionType.write(courseConfigV2CustomModuleQuestionSource) && getAnswerDescription.AudioAttributesImplBaseParcelizer(courseConfigV2CustomModuleQuestionSource)) {
                Collection<CourseConfigV2EditionSwitch> collectionMediaBrowserCompatCustomActionResultReceiver = courseConfigV2CustomModuleQuestionSourceAudioAttributesCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver();
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(collectionMediaBrowserCompatCustomActionResultReceiver, "");
                CourseConfigV2EditionSwitch courseConfigV2EditionSwitch = (CourseConfigV2EditionSwitch) IntermediateLoginResponseBody.onCommand(collectionMediaBrowserCompatCustomActionResultReceiver);
                if (courseConfigV2EditionSwitch != null) {
                    List<getMeta> listAX_ = courseConfigV2EditionSwitch.aX_();
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(listAX_, "");
                    List<getMeta> list = listAX_;
                    LinkedHashMap linkedHashMap = new LinkedHashMap(getQues.write(VideoTimelineResponseBody.read(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) list, 10)), 16));
                    for (Object obj : list) {
                        linkedHashMap.put(((getMeta) obj).aQ_(), obj);
                    }
                    List<setActiveRecallQbankId.IconCompatParcelizer.C0132IconCompatParcelizer> listRemoteActionCompatParcelizer = iconCompatParcelizer.RemoteActionCompatParcelizer();
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(listRemoteActionCompatParcelizer, "");
                    ArrayList arrayList = new ArrayList();
                    for (setActiveRecallQbankId.IconCompatParcelizer.C0132IconCompatParcelizer c0132IconCompatParcelizer : listRemoteActionCompatParcelizer) {
                        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(c0132IconCompatParcelizer, "");
                        Pair<getRelatedLessonId, getMagicLine<?>> pairIconCompatParcelizer = IconCompatParcelizer(c0132IconCompatParcelizer, linkedHashMap, setratingcount);
                        if (pairIconCompatParcelizer != null) {
                            arrayList.add(pairIconCompatParcelizer);
                        }
                    }
                    map = VideoTimelineResponseBody.read(arrayList);
                }
            }
        }
        return new getDesignation(courseConfigV2CustomModuleQuestionSourceAudioAttributesCompatParcelizer.aP_(), map, getIntroDurationSeconds.AudioAttributesCompatParcelizer);
    }

    private final Pair<getRelatedLessonId, getMagicLine<?>> IconCompatParcelizer(setActiveRecallQbankId.IconCompatParcelizer.C0132IconCompatParcelizer c0132IconCompatParcelizer, Map<getRelatedLessonId, ? extends getMeta> map, setRatingCount setratingcount) {
        getMeta getmeta = map.get(FilterItemRecordCreator.read(setratingcount, c0132IconCompatParcelizer.write()));
        if (getmeta == null) {
            return null;
        }
        getRelatedLessonId getrelatedlessonid = FilterItemRecordCreator.read(setratingcount, c0132IconCompatParcelizer.write());
        getLink getlinkOnPrepareFromMediaId = getmeta.onPrepareFromMediaId();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getlinkOnPrepareFromMediaId, "");
        setActiveRecallQbankId.IconCompatParcelizer.C0132IconCompatParcelizer.RemoteActionCompatParcelizer remoteActionCompatParcelizerAudioAttributesCompatParcelizer = c0132IconCompatParcelizer.AudioAttributesCompatParcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(remoteActionCompatParcelizerAudioAttributesCompatParcelizer, "");
        return new Pair<>(getrelatedlessonid, read(getlinkOnPrepareFromMediaId, remoteActionCompatParcelizerAudioAttributesCompatParcelizer, setratingcount));
    }

    private final getMagicLine<?> read(getLink getlink, setActiveRecallQbankId.IconCompatParcelizer.C0132IconCompatParcelizer.RemoteActionCompatParcelizer remoteActionCompatParcelizer, setRatingCount setratingcount) {
        getMagicLine<?> getmagiclineAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(getlink, remoteActionCompatParcelizer, setratingcount);
        if (!read(getmagiclineAudioAttributesCompatParcelizer, getlink, remoteActionCompatParcelizer)) {
            getmagiclineAudioAttributesCompatParcelizer = null;
        }
        if (getmagiclineAudioAttributesCompatParcelizer != null) {
            return getmagiclineAudioAttributesCompatParcelizer;
        }
        getOption1AnsweredCount.read readVar = getOption1AnsweredCount.IconCompatParcelizer;
        StringBuilder sb = new StringBuilder("Unexpected argument value: actual type ");
        sb.append(remoteActionCompatParcelizer.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver());
        sb.append(" != expected type ");
        sb.append(getlink);
        return getOption1AnsweredCount.read.read(sb.toString());
    }

    public final getMagicLine<?> AudioAttributesCompatParcelizer(getLink getlink, setActiveRecallQbankId.IconCompatParcelizer.C0132IconCompatParcelizer.RemoteActionCompatParcelizer remoteActionCompatParcelizer, setRatingCount setratingcount) {
        toMagicModuleMetaRepoModel.write(getlink, "");
        toMagicModuleMetaRepoModel.write(remoteActionCompatParcelizer, "");
        toMagicModuleMetaRepoModel.write(setratingcount, "");
        Boolean boolIconCompatParcelizer = setPeopleSolved.onRemoveQueueItemAt.IconCompatParcelizer(remoteActionCompatParcelizer.MediaDescriptionCompat());
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(boolIconCompatParcelizer, "");
        boolean zBooleanValue = boolIconCompatParcelizer.booleanValue();
        setActiveRecallQbankId.IconCompatParcelizer.C0132IconCompatParcelizer.RemoteActionCompatParcelizer.EnumC0133IconCompatParcelizer enumC0133IconCompatParcelizerMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = remoteActionCompatParcelizer.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
        switch (enumC0133IconCompatParcelizerMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver == null ? -1 : read.RemoteActionCompatParcelizer[enumC0133IconCompatParcelizerMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.ordinal()]) {
            case 1:
                byte bMediaBrowserCompatMediaItem = (byte) remoteActionCompatParcelizer.MediaBrowserCompatMediaItem();
                return zBooleanValue ? new hasReferences(bMediaBrowserCompatMediaItem) : new getBookmarkLastUpdated(bMediaBrowserCompatMediaItem);
            case 2:
                return new getBookmarkId((char) remoteActionCompatParcelizer.MediaBrowserCompatMediaItem());
            case 3:
                short sMediaBrowserCompatMediaItem = (short) remoteActionCompatParcelizer.MediaBrowserCompatMediaItem();
                return zBooleanValue ? new hasPearls(sMediaBrowserCompatMediaItem) : new getTotalAnswerCount(sMediaBrowserCompatMediaItem);
            case 4:
                int iMediaBrowserCompatMediaItem = (int) remoteActionCompatParcelizer.MediaBrowserCompatMediaItem();
                return zBooleanValue ? new isLocked(iMediaBrowserCompatMediaItem) : new getOption6AnsweredCount(iMediaBrowserCompatMediaItem);
            case 5:
                long jMediaBrowserCompatMediaItem = remoteActionCompatParcelizer.MediaBrowserCompatMediaItem();
                return zBooleanValue ? new isBookmarked(jMediaBrowserCompatMediaItem) : new getStatusUpdateStartTimeMs(jMediaBrowserCompatMediaItem);
            case 6:
                return new getOption4AnsweredCount(remoteActionCompatParcelizer.MediaBrowserCompatSearchResultReceiver());
            case 7:
                return new getOption2AnsweredCount(remoteActionCompatParcelizer.MediaBrowserCompatItemReceiver());
            case 8:
                return new getFeedbackStatus(remoteActionCompatParcelizer.MediaBrowserCompatMediaItem() != 0);
            case 9:
                return new getStatusUpdateEndTimeMs(setratingcount.AudioAttributesCompatParcelizer(remoteActionCompatParcelizer.onCustomAction()));
            case 10:
                return new getOption8AnsweredCount(FilterItemRecordCreator.AudioAttributesCompatParcelizer(setratingcount, remoteActionCompatParcelizer.AudioAttributesImplBaseParcelizer()), remoteActionCompatParcelizer.AudioAttributesCompatParcelizer());
            case 11:
                return new getMcqType(FilterItemRecordCreator.AudioAttributesCompatParcelizer(setratingcount, remoteActionCompatParcelizer.AudioAttributesImplBaseParcelizer()), FilterItemRecordCreator.read(setratingcount, remoteActionCompatParcelizer.MediaMetadataCompat()));
            case 12:
                setActiveRecallQbankId.IconCompatParcelizer iconCompatParcelizerWrite = remoteActionCompatParcelizer.write();
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(iconCompatParcelizerWrite, "");
                return new getActiveLessonId(RemoteActionCompatParcelizer(iconCompatParcelizerWrite, setratingcount));
            case 13:
                getOption3AnsweredCount getoption3answeredcount = getOption3AnsweredCount.AudioAttributesCompatParcelizer;
                List<setActiveRecallQbankId.IconCompatParcelizer.C0132IconCompatParcelizer.RemoteActionCompatParcelizer> listIconCompatParcelizer = remoteActionCompatParcelizer.IconCompatParcelizer();
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(listIconCompatParcelizer, "");
                List<setActiveRecallQbankId.IconCompatParcelizer.C0132IconCompatParcelizer.RemoteActionCompatParcelizer> list = listIconCompatParcelizer;
                ArrayList arrayList = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) list, 10));
                for (setActiveRecallQbankId.IconCompatParcelizer.C0132IconCompatParcelizer.RemoteActionCompatParcelizer remoteActionCompatParcelizer2 : list) {
                    getHref gethrefWrite = RemoteActionCompatParcelizer().write();
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(gethrefWrite, "");
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(remoteActionCompatParcelizer2, "");
                    arrayList.add(AudioAttributesCompatParcelizer(gethrefWrite, remoteActionCompatParcelizer2, setratingcount));
                }
                return getOption3AnsweredCount.AudioAttributesCompatParcelizer(arrayList, getlink);
            default:
                StringBuilder sb = new StringBuilder("Unsupported annotation argument type: ");
                sb.append(remoteActionCompatParcelizer.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver());
                sb.append(" (expected ");
                sb.append(getlink);
                sb.append(')');
                throw new IllegalStateException(sb.toString().toString());
        }
    }

    private final boolean read(getMagicLine<?> getmagicline, getLink getlink, setActiveRecallQbankId.IconCompatParcelizer.C0132IconCompatParcelizer.RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        setActiveRecallQbankId.IconCompatParcelizer.C0132IconCompatParcelizer.RemoteActionCompatParcelizer.EnumC0133IconCompatParcelizer enumC0133IconCompatParcelizerMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = remoteActionCompatParcelizer.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
        int i = enumC0133IconCompatParcelizerMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver == null ? -1 : read.RemoteActionCompatParcelizer[enumC0133IconCompatParcelizerMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.ordinal()];
        if (i == 10) {
            getQuestionLimit getquestionlimitRemoteActionCompatParcelizer = getlink.AudioAttributesImplApi21Parcelizer().RemoteActionCompatParcelizer();
            CourseConfigV2CustomModuleQuestionSource courseConfigV2CustomModuleQuestionSource = getquestionlimitRemoteActionCompatParcelizer instanceof CourseConfigV2CustomModuleQuestionSource ? (CourseConfigV2CustomModuleQuestionSource) getquestionlimitRemoteActionCompatParcelizer : null;
            return courseConfigV2CustomModuleQuestionSource == null || getTestTabItems.RemoteActionCompatParcelizer(courseConfigV2CustomModuleQuestionSource);
        }
        if (i == 13) {
            if (getmagicline instanceof getAnswerPointer) {
                getAnswerPointer getanswerpointer = (getAnswerPointer) getmagicline;
                if (getanswerpointer.AudioAttributesCompatParcelizer().size() == remoteActionCompatParcelizer.IconCompatParcelizer().size()) {
                    getLink getlinkMediaDescriptionCompat = RemoteActionCompatParcelizer().MediaDescriptionCompat(getlink);
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getlinkMediaDescriptionCompat, "");
                    Iterator<Integer> it = IntermediateLoginResponseBody.read((Collection<?>) getanswerpointer.AudioAttributesCompatParcelizer()).iterator();
                    while (it.hasNext()) {
                        int iRemoteActionCompatParcelizer = ((getSINGLE_SYNC_RESULT) it).RemoteActionCompatParcelizer();
                        getMagicLine<?> getmagicline2 = getanswerpointer.AudioAttributesCompatParcelizer().get(iRemoteActionCompatParcelizer);
                        setActiveRecallQbankId.IconCompatParcelizer.C0132IconCompatParcelizer.RemoteActionCompatParcelizer remoteActionCompatParcelizerAudioAttributesCompatParcelizer = remoteActionCompatParcelizer.AudioAttributesCompatParcelizer(iRemoteActionCompatParcelizer);
                        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(remoteActionCompatParcelizerAudioAttributesCompatParcelizer, "");
                        if (!read(getmagicline2, getlinkMediaDescriptionCompat, remoteActionCompatParcelizerAudioAttributesCompatParcelizer)) {
                            return false;
                        }
                    }
                    return true;
                }
            }
            throw new IllegalStateException("Deserialized ArrayValue should have the same number of elements as the original array value: ".concat(String.valueOf(getmagicline)).toString());
        }
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(getmagicline.AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer), getlink);
    }

    private final CourseConfigV2CustomModuleQuestionSource AudioAttributesCompatParcelizer(RevisionSubjectStatusModel revisionSubjectStatusModel) {
        return CourseConfigV2NavDrawerItemReportPiracy.IconCompatParcelizer(this.AudioAttributesCompatParcelizer, revisionSubjectStatusModel, this.read);
    }
}
