package kotlin;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.getGroupDescription;
import kotlin.getQuote;
import kotlin.setActiveRecallQbankId;

/* JADX INFO: loaded from: classes4.dex */
public final class SchemaCompletionState {
    private final String AudioAttributesCompatParcelizer;
    private final Map<Integer, getBadgeText> AudioAttributesImplApi26Parcelizer;
    private final McqTimeSpent IconCompatParcelizer;
    private final getAnswerMap<Integer, getQuestionLimit> MediaBrowserCompatItemReceiver;
    private final getAnswerMap<Integer, getQuestionLimit> RemoteActionCompatParcelizer;
    private final String read;
    private final SchemaCompletionState write;

    public SchemaCompletionState(McqTimeSpent mcqTimeSpent, SchemaCompletionState schemaCompletionState, List<setActiveRecallQbankId.onCustomAction> list, String str, String str2) {
        LinkedHashMap linkedHashMap;
        toMagicModuleMetaRepoModel.write(mcqTimeSpent, "");
        toMagicModuleMetaRepoModel.write(list, "");
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        this.IconCompatParcelizer = mcqTimeSpent;
        this.write = schemaCompletionState;
        this.read = str;
        this.AudioAttributesCompatParcelizer = str2;
        this.RemoteActionCompatParcelizer = mcqTimeSpent.AudioAttributesImplApi21Parcelizer().IconCompatParcelizer(new RemoteActionCompatParcelizer());
        this.MediaBrowserCompatItemReceiver = mcqTimeSpent.AudioAttributesImplApi21Parcelizer().IconCompatParcelizer(new AudioAttributesCompatParcelizer());
        if (list.isEmpty()) {
            linkedHashMap = VideoTimelineResponseBody.read();
        } else {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            int i = 0;
            for (setActiveRecallQbankId.onCustomAction oncustomaction : list) {
                linkedHashMap2.put(Integer.valueOf(oncustomaction.write()), new getCompletedComparator(this.IconCompatParcelizer, oncustomaction, i));
                i++;
            }
            linkedHashMap = linkedHashMap2;
        }
        this.AudioAttributesImplApi26Parcelizer = linkedHashMap;
    }

    static final class RemoteActionCompatParcelizer extends MagicModuleUseCase implements getAnswerMap<Integer, getQuestionLimit> {
        @Override // kotlin.getAnswerMap
        public final /* synthetic */ getQuestionLimit invoke(Integer num) {
            return read(num.intValue());
        }

        private getQuestionLimit read(int i) {
            return SchemaCompletionState.this.AudioAttributesCompatParcelizer(i);
        }

        RemoteActionCompatParcelizer() {
            super(1);
        }
    }

    static final class AudioAttributesCompatParcelizer extends MagicModuleUseCase implements getAnswerMap<Integer, getQuestionLimit> {
        @Override // kotlin.getAnswerMap
        public final /* synthetic */ getQuestionLimit invoke(Integer num) {
            return RemoteActionCompatParcelizer(num.intValue());
        }

        private getQuestionLimit RemoteActionCompatParcelizer(int i) {
            return SchemaCompletionState.this.write(i);
        }

        AudioAttributesCompatParcelizer() {
            super(1);
        }
    }

    public final List<getBadgeText> IconCompatParcelizer() {
        return IntermediateLoginResponseBody.onPlay(this.AudioAttributesImplApi26Parcelizer.values());
    }

    public final getLink AudioAttributesCompatParcelizer(setActiveRecallQbankId.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) {
        toMagicModuleMetaRepoModel.write(mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, "");
        if (mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.onPrepareFromMediaId()) {
            String strAudioAttributesCompatParcelizer = this.IconCompatParcelizer.write().AudioAttributesCompatParcelizer(mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.MediaMetadataCompat());
            getHref gethrefIconCompatParcelizer = IconCompatParcelizer(this, mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver);
            setActiveRecallQbankId.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiverIconCompatParcelizer = setTagExpiryMs.IconCompatParcelizer(mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, this.IconCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver());
            toMagicModuleMetaRepoModel.write(mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiverIconCompatParcelizer);
            return this.IconCompatParcelizer.AudioAttributesCompatParcelizer().MediaBrowserCompatItemReceiver().write(mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, strAudioAttributesCompatParcelizer, gethrefIconCompatParcelizer, IconCompatParcelizer(this, mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiverIconCompatParcelizer));
        }
        return write(mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, true);
    }

    private static getGroupDescription IconCompatParcelizer(List<? extends getGroupSubttile> list, getQuote getquote) {
        List<? extends getGroupSubttile> list2 = list;
        ArrayList arrayList = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((getGroupSubttile) it.next()).AudioAttributesCompatParcelizer(getquote));
        }
        List listRemoteActionCompatParcelizer = IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) arrayList);
        getGroupDescription.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = getGroupDescription.AudioAttributesCompatParcelizer;
        return getGroupDescription.AudioAttributesCompatParcelizer.write((List<? extends getIndividualPlan<?>>) listRemoteActionCompatParcelizer);
    }

    public static /* synthetic */ getHref IconCompatParcelizer(SchemaCompletionState schemaCompletionState, setActiveRecallQbankId.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) {
        return schemaCompletionState.write(mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, true);
    }

    public final getHref write(setActiveRecallQbankId.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, boolean z) {
        getHref gethrefRemoteActionCompatParcelizer;
        setPearlNumber setpearlnumberWrite;
        getHref gethrefIconCompatParcelizer;
        toMagicModuleMetaRepoModel.write(mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, "");
        if (mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.onMediaButtonEvent()) {
            gethrefRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.AudioAttributesImplBaseParcelizer());
        } else {
            gethrefRemoteActionCompatParcelizer = mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.onSeekTo() ? RemoteActionCompatParcelizer(mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.handleMediaPlayPauseIfPendingOnHandler()) : null;
        }
        if (gethrefRemoteActionCompatParcelizer != null) {
            return gethrefRemoteActionCompatParcelizer;
        }
        getPlanAddOns getplanaddons = read(mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver);
        if (SubscriptionType.write(getplanaddons.RemoteActionCompatParcelizer())) {
            SubscriptionType subscriptionType = SubscriptionType.AudioAttributesCompatParcelizer;
            return SubscriptionType.write(setAccessLevel.TYPE_FOR_ERROR_TYPE_CONSTRUCTOR, getplanaddons, getplanaddons.toString());
        }
        getUserContext getusercontext = new getUserContext(this.IconCompatParcelizer.AudioAttributesImplApi21Parcelizer(), new write(mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver));
        this.IconCompatParcelizer.IconCompatParcelizer();
        getGroupDescription getgroupdescriptionIconCompatParcelizer = IconCompatParcelizer(this.IconCompatParcelizer.AudioAttributesCompatParcelizer().onAddQueueItem(), getusercontext);
        List<setActiveRecallQbankId.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.read> listAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, this);
        ArrayList arrayList = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) listAudioAttributesCompatParcelizer, 10));
        int i = 0;
        for (Object obj : listAudioAttributesCompatParcelizer) {
            if (i < 0) {
                IntermediateLoginResponseBody.read();
            }
            List<getBadgeText> listAudioAttributesCompatParcelizer2 = getplanaddons.AudioAttributesCompatParcelizer();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(listAudioAttributesCompatParcelizer2, "");
            arrayList.add(IconCompatParcelizer((getBadgeText) IntermediateLoginResponseBody.read((List) listAudioAttributesCompatParcelizer2, i), (setActiveRecallQbankId.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.read) obj));
            i++;
        }
        List<? extends setDefault> listOnPlay = IntermediateLoginResponseBody.onPlay(arrayList);
        getQuestionLimit getquestionlimitRemoteActionCompatParcelizer = getplanaddons.RemoteActionCompatParcelizer();
        boolean z2 = true;
        if (z && (getquestionlimitRemoteActionCompatParcelizer instanceof CourseConfigV2VideoProperties)) {
            AddOnMetaKt addOnMetaKt = AddOnMetaKt.write;
            getHref gethrefRemoteActionCompatParcelizer2 = AddOnMetaKt.RemoteActionCompatParcelizer((CourseConfigV2VideoProperties) getquestionlimitRemoteActionCompatParcelizer, listOnPlay);
            List<getGroupSubttile> listOnAddQueueItem = this.IconCompatParcelizer.AudioAttributesCompatParcelizer().onAddQueueItem();
            getQuote.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = getQuote.IconCompatParcelizer;
            getQuote getquoteRemoteActionCompatParcelizer = getQuote.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(IntermediateLoginResponseBody.read((Iterable) getusercontext, (Iterable) gethrefRemoteActionCompatParcelizer2.RemoteActionCompatParcelizer()));
            this.IconCompatParcelizer.IconCompatParcelizer();
            getGroupDescription getgroupdescriptionIconCompatParcelizer2 = IconCompatParcelizer(listOnAddQueueItem, getquoteRemoteActionCompatParcelizer);
            if (!Copy.read(gethrefRemoteActionCompatParcelizer2) && !mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.onCommand()) {
                z2 = false;
            }
            setpearlnumberWrite = gethrefRemoteActionCompatParcelizer2.write(z2).read(getgroupdescriptionIconCompatParcelizer2);
        } else {
            Boolean boolIconCompatParcelizer = setPeopleSolved.onSetPlaybackSpeed.IconCompatParcelizer(mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.MediaBrowserCompatMediaItem());
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(boolIconCompatParcelizer, "");
            if (boolIconCompatParcelizer.booleanValue()) {
                setpearlnumberWrite = IconCompatParcelizer(getgroupdescriptionIconCompatParcelizer, getplanaddons, listOnPlay, mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.onCommand());
            } else {
                setpearlnumberWrite = AddOnMetaKt.write(getgroupdescriptionIconCompatParcelizer, getplanaddons, listOnPlay, mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.onCommand());
                Boolean boolIconCompatParcelizer2 = setPeopleSolved.write.IconCompatParcelizer(mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.MediaBrowserCompatMediaItem());
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(boolIconCompatParcelizer2, "");
                if (boolIconCompatParcelizer2.booleanValue()) {
                    setPearlNumber setpearlnumberRemoteActionCompatParcelizer = setPearlNumber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(setpearlnumberWrite, true, false);
                    if (setpearlnumberRemoteActionCompatParcelizer == null) {
                        StringBuilder sb = new StringBuilder("null DefinitelyNotNullType for '");
                        sb.append(setpearlnumberWrite);
                        sb.append('\'');
                        throw new IllegalStateException(sb.toString().toString());
                    }
                    setpearlnumberWrite = setpearlnumberRemoteActionCompatParcelizer;
                }
            }
        }
        setActiveRecallQbankId.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiverRemoteActionCompatParcelizer = setTagExpiryMs.RemoteActionCompatParcelizer(mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, this.IconCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver());
        if (mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiverRemoteActionCompatParcelizer != null && (gethrefIconCompatParcelizer = Meta.IconCompatParcelizer(setpearlnumberWrite, write(mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiverRemoteActionCompatParcelizer, false))) != null) {
            setpearlnumberWrite = gethrefIconCompatParcelizer;
        }
        return mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.onMediaButtonEvent() ? this.IconCompatParcelizer.AudioAttributesCompatParcelizer().onCommand().RemoteActionCompatParcelizer(FilterItemRecordCreator.AudioAttributesCompatParcelizer(this.IconCompatParcelizer.write(), mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.AudioAttributesImplBaseParcelizer()), setpearlnumberWrite) : setpearlnumberWrite;
    }

    static final class write extends MagicModuleUseCase implements getCreatedOnDateMs<List<? extends dummyEditor>> {
        private /* synthetic */ setActiveRecallQbankId.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver IconCompatParcelizer;

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public List<dummyEditor> invoke() {
            return SchemaCompletionState.this.IconCompatParcelizer.AudioAttributesCompatParcelizer().AudioAttributesCompatParcelizer().IconCompatParcelizer(this.IconCompatParcelizer, SchemaCompletionState.this.IconCompatParcelizer.write());
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        write(setActiveRecallQbankId.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) {
            super(0);
            this.IconCompatParcelizer = mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        }
    }

    private static final List<setActiveRecallQbankId.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.read> AudioAttributesCompatParcelizer(setActiveRecallQbankId.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, SchemaCompletionState schemaCompletionState) {
        List<setActiveRecallQbankId.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.read> listMediaBrowserCompatItemReceiver = mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.MediaBrowserCompatItemReceiver();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(listMediaBrowserCompatItemReceiver, "");
        List<setActiveRecallQbankId.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.read> list = listMediaBrowserCompatItemReceiver;
        setActiveRecallQbankId.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver2 = setTagExpiryMs.read(mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, schemaCompletionState.IconCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver());
        List<setActiveRecallQbankId.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.read> listAudioAttributesCompatParcelizer = mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver2 != null ? AudioAttributesCompatParcelizer(mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver2, schemaCompletionState) : null;
        if (listAudioAttributesCompatParcelizer == null) {
            listAudioAttributesCompatParcelizer = IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
        }
        return IntermediateLoginResponseBody.AudioAttributesCompatParcelizer((Collection) list, (Iterable) listAudioAttributesCompatParcelizer);
    }

    static final class IconCompatParcelizer extends MagicModuleUseCase implements getAnswerMap<setActiveRecallQbankId.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, setActiveRecallQbankId.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver> {
        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public setActiveRecallQbankId.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver invoke(setActiveRecallQbankId.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) {
            toMagicModuleMetaRepoModel.write(mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, "");
            return setTagExpiryMs.read(mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, SchemaCompletionState.this.IconCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver());
        }

        IconCompatParcelizer() {
            super(1);
        }
    }

    static final class MediaBrowserCompatCustomActionResultReceiver extends MagicModuleUseCase implements getAnswerMap<setActiveRecallQbankId.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, Integer> {
        public static final MediaBrowserCompatCustomActionResultReceiver read = new MediaBrowserCompatCustomActionResultReceiver();

        private static Integer write(setActiveRecallQbankId.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) {
            toMagicModuleMetaRepoModel.write(mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, "");
            return Integer.valueOf(mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.IconCompatParcelizer());
        }

        @Override // kotlin.getAnswerMap
        public final /* synthetic */ Integer invoke(setActiveRecallQbankId.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) {
            return write(mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver);
        }

        MediaBrowserCompatCustomActionResultReceiver() {
            super(1);
        }
    }

    private static final CourseConfigV2CustomModuleQuestionSource IconCompatParcelizer(SchemaCompletionState schemaCompletionState, setActiveRecallQbankId.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, int i) {
        RevisionSubjectStatusModel revisionSubjectStatusModelAudioAttributesCompatParcelizer = FilterItemRecordCreator.AudioAttributesCompatParcelizer(schemaCompletionState.IconCompatParcelizer.write(), i);
        List<Integer> listRatingCompat = StateResult.RatingCompat(StateResult.write(StateResult.RemoteActionCompatParcelizer(mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, schemaCompletionState.new IconCompatParcelizer()), MediaBrowserCompatCustomActionResultReceiver.read));
        int iAudioAttributesCompatParcelizer = StateResult.AudioAttributesCompatParcelizer(StateResult.RemoteActionCompatParcelizer(revisionSubjectStatusModelAudioAttributesCompatParcelizer, read.AudioAttributesCompatParcelizer));
        while (listRatingCompat.size() < iAudioAttributesCompatParcelizer) {
            listRatingCompat.add(0);
        }
        return schemaCompletionState.IconCompatParcelizer.AudioAttributesCompatParcelizer().MediaDescriptionCompat().AudioAttributesCompatParcelizer(revisionSubjectStatusModelAudioAttributesCompatParcelizer, listRatingCompat);
    }

    final /* synthetic */ class read extends MagicModuleRepoModelsKt implements getAnswerMap<RevisionSubjectStatusModel, RevisionSubjectStatusModel> {
        public static final read AudioAttributesCompatParcelizer = new read();

        private static RevisionSubjectStatusModel AudioAttributesCompatParcelizer(RevisionSubjectStatusModel revisionSubjectStatusModel) {
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
            return AudioAttributesCompatParcelizer(revisionSubjectStatusModel);
        }

        read() {
            super(1);
        }

        @Override // kotlin.r8lambdawOOzi0yme1vxdgON3UOSQJBjUQA
        public final String MediaBrowserCompatMediaItem() {
            return "getOuterClassId()Lorg/jetbrains/kotlin/name/ClassId;";
        }
    }

    private final getPlanAddOns read(setActiveRecallQbankId.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) {
        CourseConfigV2CustomModuleQuestionSource courseConfigV2CustomModuleQuestionSourceInvoke;
        Object next;
        if (mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.onMediaButtonEvent()) {
            courseConfigV2CustomModuleQuestionSourceInvoke = this.RemoteActionCompatParcelizer.invoke(Integer.valueOf(mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.AudioAttributesImplBaseParcelizer()));
            if (courseConfigV2CustomModuleQuestionSourceInvoke == null) {
                courseConfigV2CustomModuleQuestionSourceInvoke = IconCompatParcelizer(this, mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.AudioAttributesImplBaseParcelizer());
            }
        } else if (mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.onPrepareFromUri()) {
            getBadgeText getbadgetextIconCompatParcelizer = IconCompatParcelizer(mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.onAddQueueItem());
            if (getbadgetextIconCompatParcelizer == null) {
                SubscriptionType subscriptionType = SubscriptionType.AudioAttributesCompatParcelizer;
                return SubscriptionType.RemoteActionCompatParcelizer(setAccessLevel.CANNOT_LOAD_DESERIALIZE_TYPE_PARAMETER, String.valueOf(mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.onAddQueueItem()), this.AudioAttributesCompatParcelizer);
            }
            courseConfigV2CustomModuleQuestionSourceInvoke = getbadgetextIconCompatParcelizer;
        } else if (mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.onRemoveQueueItem()) {
            String strAudioAttributesCompatParcelizer = this.IconCompatParcelizer.write().AudioAttributesCompatParcelizer(mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.onPause());
            Iterator<T> it = IconCompatParcelizer().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) ((getBadgeText) next).aQ_().AudioAttributesCompatParcelizer(), (Object) strAudioAttributesCompatParcelizer)) {
                    break;
                }
            }
            getBadgeText getbadgetext = (getBadgeText) next;
            if (getbadgetext == null) {
                SubscriptionType subscriptionType2 = SubscriptionType.AudioAttributesCompatParcelizer;
                return SubscriptionType.RemoteActionCompatParcelizer(setAccessLevel.CANNOT_LOAD_DESERIALIZE_TYPE_PARAMETER_BY_NAME, strAudioAttributesCompatParcelizer, this.IconCompatParcelizer.IconCompatParcelizer().toString());
            }
            courseConfigV2CustomModuleQuestionSourceInvoke = getbadgetext;
        } else if (mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.onSeekTo()) {
            courseConfigV2CustomModuleQuestionSourceInvoke = this.MediaBrowserCompatItemReceiver.invoke(Integer.valueOf(mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.handleMediaPlayPauseIfPendingOnHandler()));
            if (courseConfigV2CustomModuleQuestionSourceInvoke == null) {
                courseConfigV2CustomModuleQuestionSourceInvoke = IconCompatParcelizer(this, mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.handleMediaPlayPauseIfPendingOnHandler());
            }
        } else {
            SubscriptionType subscriptionType3 = SubscriptionType.AudioAttributesCompatParcelizer;
            return SubscriptionType.RemoteActionCompatParcelizer(setAccessLevel.UNKNOWN_TYPE, new String[0]);
        }
        getPlanAddOns getplanaddonsMediaBrowserCompatSearchResultReceiver = courseConfigV2CustomModuleQuestionSourceInvoke.MediaBrowserCompatSearchResultReceiver();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getplanaddonsMediaBrowserCompatSearchResultReceiver, "");
        return getplanaddonsMediaBrowserCompatSearchResultReceiver;
    }

    private final getHref IconCompatParcelizer(getGroupDescription getgroupdescription, getPlanAddOns getplanaddons, List<? extends setDefault> list, boolean z) {
        getHref gethrefAudioAttributesCompatParcelizer;
        int size;
        int size2 = getplanaddons.AudioAttributesCompatParcelizer().size() - list.size();
        if (size2 == 0) {
            gethrefAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(getgroupdescription, getplanaddons, list, z);
        } else if (size2 == 1 && (size = list.size() - 1) >= 0) {
            getPlanAddOns getplanaddonsMediaBrowserCompatSearchResultReceiver = getplanaddons.aU_().RemoteActionCompatParcelizer(size).MediaBrowserCompatSearchResultReceiver();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getplanaddonsMediaBrowserCompatSearchResultReceiver, "");
            gethrefAudioAttributesCompatParcelizer = AddOnMetaKt.write(getgroupdescription, getplanaddonsMediaBrowserCompatSearchResultReceiver, list, z);
        } else {
            gethrefAudioAttributesCompatParcelizer = null;
        }
        if (gethrefAudioAttributesCompatParcelizer != null) {
            return gethrefAudioAttributesCompatParcelizer;
        }
        SubscriptionType subscriptionType = SubscriptionType.AudioAttributesCompatParcelizer;
        return SubscriptionType.read(setAccessLevel.INCONSISTENT_SUSPEND_FUNCTION, list, getplanaddons, new String[0]);
    }

    private final getHref AudioAttributesCompatParcelizer(getGroupDescription getgroupdescription, getPlanAddOns getplanaddons, List<? extends setDefault> list, boolean z) {
        getHref gethrefWrite = AddOnMetaKt.write(getgroupdescription, getplanaddons, list, z);
        if (getTestItems.AudioAttributesImplApi26Parcelizer(gethrefWrite)) {
            return read(gethrefWrite);
        }
        return null;
    }

    private final getHref read(getLink getlink) {
        getLink getlinkAudioAttributesCompatParcelizer;
        setDefault setdefault = (setDefault) IntermediateLoginResponseBody.MediaMetadataCompat((List) getTestItems.write(getlink));
        if (setdefault == null || (getlinkAudioAttributesCompatParcelizer = setdefault.AudioAttributesCompatParcelizer()) == null) {
            return null;
        }
        getQuestionLimit getquestionlimitRemoteActionCompatParcelizer = getlinkAudioAttributesCompatParcelizer.AudioAttributesImplApi21Parcelizer().RemoteActionCompatParcelizer();
        getNotesCount getnotescountWrite = getquestionlimitRemoteActionCompatParcelizer != null ? setLocked.write(getquestionlimitRemoteActionCompatParcelizer) : null;
        if (getlinkAudioAttributesCompatParcelizer.bb_().size() != 1 || (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(getnotescountWrite, getZenArea.MediaBrowserCompatCustomActionResultReceiver) && !toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(getnotescountWrite, getLastLessonSubmittedOn.AudioAttributesCompatParcelizer))) {
            return (getHref) getlink;
        }
        getLink getlinkAudioAttributesCompatParcelizer2 = ((setDefault) IntermediateLoginResponseBody.onCommand((List) getlinkAudioAttributesCompatParcelizer.bb_())).AudioAttributesCompatParcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getlinkAudioAttributesCompatParcelizer2, "");
        getVariant getvariantIconCompatParcelizer = this.IconCompatParcelizer.IconCompatParcelizer();
        getVideoPageNotesTitle getvideopagenotestitle = getvariantIconCompatParcelizer instanceof getVideoPageNotesTitle ? (getVideoPageNotesTitle) getvariantIconCompatParcelizer : null;
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(getvideopagenotestitle != null ? setLocked.RemoteActionCompatParcelizer(getvideopagenotestitle) : null, isQbankSolved.read)) {
            return write(getlink, getlinkAudioAttributesCompatParcelizer2);
        }
        return write(getlink, getlinkAudioAttributesCompatParcelizer2);
    }

    private static getHref write(getLink getlink, getLink getlink2) {
        getTestTabItems gettesttabitems = getSearchTimes.read(getlink);
        getQuote getquoteRemoteActionCompatParcelizer = getlink.RemoteActionCompatParcelizer();
        getLink getlinkRemoteActionCompatParcelizer = getTestItems.RemoteActionCompatParcelizer(getlink);
        List<getLink> listIconCompatParcelizer = getTestItems.IconCompatParcelizer(getlink);
        List listMediaDescriptionCompat = IntermediateLoginResponseBody.MediaDescriptionCompat((List) getTestItems.write(getlink));
        ArrayList arrayList = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) listMediaDescriptionCompat, 10));
        Iterator it = listMediaDescriptionCompat.iterator();
        while (it.hasNext()) {
            arrayList.add(((setDefault) it.next()).AudioAttributesCompatParcelizer());
        }
        return getTestItems.read(gettesttabitems, getquoteRemoteActionCompatParcelizer, getlinkRemoteActionCompatParcelizer, listIconCompatParcelizer, arrayList, null, getlink2, true).write(getlink.ba_());
    }

    private final getBadgeText IconCompatParcelizer(int i) {
        getBadgeText getbadgetext = this.AudioAttributesImplApi26Parcelizer.get(Integer.valueOf(i));
        if (getbadgetext != null) {
            return getbadgetext;
        }
        SchemaCompletionState schemaCompletionState = this.write;
        if (schemaCompletionState != null) {
            return schemaCompletionState.IconCompatParcelizer(i);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final getQuestionLimit AudioAttributesCompatParcelizer(int i) {
        RevisionSubjectStatusModel revisionSubjectStatusModelAudioAttributesCompatParcelizer = FilterItemRecordCreator.AudioAttributesCompatParcelizer(this.IconCompatParcelizer.write(), i);
        if (revisionSubjectStatusModelAudioAttributesCompatParcelizer.AudioAttributesImplApi21Parcelizer()) {
            return this.IconCompatParcelizer.AudioAttributesCompatParcelizer().AudioAttributesCompatParcelizer(revisionSubjectStatusModelAudioAttributesCompatParcelizer);
        }
        return CourseConfigV2NavDrawerItemReportPiracy.read(this.IconCompatParcelizer.AudioAttributesCompatParcelizer().MediaBrowserCompatMediaItem(), revisionSubjectStatusModelAudioAttributesCompatParcelizer);
    }

    private final getHref RemoteActionCompatParcelizer(int i) {
        if (FilterItemRecordCreator.AudioAttributesCompatParcelizer(this.IconCompatParcelizer.write(), i).AudioAttributesImplApi21Parcelizer()) {
            return this.IconCompatParcelizer.AudioAttributesCompatParcelizer().RatingCompat().write();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final getQuestionLimit write(int i) {
        RevisionSubjectStatusModel revisionSubjectStatusModelAudioAttributesCompatParcelizer = FilterItemRecordCreator.AudioAttributesCompatParcelizer(this.IconCompatParcelizer.write(), i);
        if (revisionSubjectStatusModelAudioAttributesCompatParcelizer.AudioAttributesImplApi21Parcelizer()) {
            return null;
        }
        return CourseConfigV2NavDrawerItemReportPiracy.RemoteActionCompatParcelizer(this.IconCompatParcelizer.AudioAttributesCompatParcelizer().MediaBrowserCompatMediaItem(), revisionSubjectStatusModelAudioAttributesCompatParcelizer);
    }

    private final setDefault IconCompatParcelizer(getBadgeText getbadgetext, setActiveRecallQbankId.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.read readVar) {
        if (readVar.RemoteActionCompatParcelizer() == setActiveRecallQbankId.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.read.write.STAR) {
            if (getbadgetext == null) {
                return new isCountryRestrictedForVideo(this.IconCompatParcelizer.AudioAttributesCompatParcelizer().MediaBrowserCompatMediaItem().write());
            }
            return new getDiscountedPrice(getbadgetext);
        }
        MultiBookmarkCounter multiBookmarkCounter = MultiBookmarkCounter.AudioAttributesCompatParcelizer;
        setActiveRecallQbankId.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.read.write writeVarRemoteActionCompatParcelizer = readVar.RemoteActionCompatParcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(writeVarRemoteActionCompatParcelizer, "");
        getTotalSubject gettotalsubject = MultiBookmarkCounter.read(writeVarRemoteActionCompatParcelizer);
        setActiveRecallQbankId.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = setTagExpiryMs.read(readVar, this.IconCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver());
        if (mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver == null) {
            return new isIndividualPlan(SubscriptionType.read(setAccessLevel.NO_RECORDED_TYPE, readVar.toString()));
        }
        return new isIndividualPlan(gettotalsubject, AudioAttributesCompatParcelizer(mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver));
    }

    public final String toString() {
        String string;
        StringBuilder sb = new StringBuilder();
        sb.append(this.read);
        if (this.write == null) {
            string = "";
        } else {
            StringBuilder sb2 = new StringBuilder(". Child of ");
            sb2.append(this.write.read);
            string = sb2.toString();
        }
        sb.append(string);
        return sb.toString();
    }
}
