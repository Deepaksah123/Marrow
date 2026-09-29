package kotlin;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.getBookmarkCount;
import kotlin.getQuote;
import kotlin.getTestHeaderTitle;
import kotlin.getVideoPageNotesTitle;
import kotlin.setActiveRecallQbankId;
import kotlin.setVideoId;

/* JADX INFO: loaded from: classes4.dex */
public final class allFilterItem {
    private final McqTimeSpent RemoteActionCompatParcelizer;
    private final setMCQId read;

    private static int read(int i) {
        return (i & 63) + ((i >> 8) << 6);
    }

    public allFilterItem(McqTimeSpent mcqTimeSpent) {
        toMagicModuleMetaRepoModel.write(mcqTimeSpent, "");
        this.RemoteActionCompatParcelizer = mcqTimeSpent;
        this.read = new setMCQId(mcqTimeSpent.AudioAttributesCompatParcelizer().MediaBrowserCompatMediaItem(), mcqTimeSpent.AudioAttributesCompatParcelizer().MediaDescriptionCompat());
    }

    public final CourseConfigV2SettingsItems read(setActiveRecallQbankId.MediaBrowserCompatMediaItem mediaBrowserCompatMediaItem) {
        setActiveRecallQbankId.MediaBrowserCompatMediaItem mediaBrowserCompatMediaItem2;
        getQuote getquoteAudioAttributesCompatParcelizer;
        SchemaKt schemaKtWrite;
        getSchemaId getschemaidAudioAttributesCompatParcelizer;
        getLink getlinkAudioAttributesCompatParcelizer;
        toMagicModuleMetaRepoModel.write(mediaBrowserCompatMediaItem, "");
        int iAudioAttributesCompatParcelizer = mediaBrowserCompatMediaItem.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() ? mediaBrowserCompatMediaItem.AudioAttributesCompatParcelizer() : read(mediaBrowserCompatMediaItem.MediaDescriptionCompat());
        getVariant getvariantIconCompatParcelizer = this.RemoteActionCompatParcelizer.IconCompatParcelizer();
        setActiveRecallQbankId.MediaBrowserCompatMediaItem mediaBrowserCompatMediaItem3 = mediaBrowserCompatMediaItem;
        getQuote getquote = read(mediaBrowserCompatMediaItem3, iAudioAttributesCompatParcelizer, getMCQId.PROPERTY);
        MultiBookmarkCounter multiBookmarkCounter = MultiBookmarkCounter.AudioAttributesCompatParcelizer;
        CourseConfigV2NavDrawerItems courseConfigV2NavDrawerItemsAudioAttributesCompatParcelizer = MultiBookmarkCounter.AudioAttributesCompatParcelizer(setPeopleSolved.onSetShuffleMode.IconCompatParcelizer(iAudioAttributesCompatParcelizer));
        CourseConfigV2NavDrawerItemFreeExtension courseConfigV2NavDrawerItemFreeExtensionWrite = getLessonName.write(MultiBookmarkCounter.AudioAttributesCompatParcelizer, setPeopleSolved.onSetRating.IconCompatParcelizer(iAudioAttributesCompatParcelizer));
        Boolean boolIconCompatParcelizer = setPeopleSolved.onPrepareFromUri.IconCompatParcelizer(iAudioAttributesCompatParcelizer);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(boolIconCompatParcelizer, "");
        boolean zBooleanValue = boolIconCompatParcelizer.booleanValue();
        getRelatedLessonId getrelatedlessonid = FilterItemRecordCreator.read(this.RemoteActionCompatParcelizer.write(), mediaBrowserCompatMediaItem.MediaBrowserCompatItemReceiver());
        getTestHeaderTitle.RemoteActionCompatParcelizer remoteActionCompatParcelizer = getLessonName.read(MultiBookmarkCounter.AudioAttributesCompatParcelizer, setPeopleSolved.onSetRepeatMode.IconCompatParcelizer(iAudioAttributesCompatParcelizer));
        Boolean boolIconCompatParcelizer2 = setPeopleSolved.onPrepareFromMediaId.IconCompatParcelizer(iAudioAttributesCompatParcelizer);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(boolIconCompatParcelizer2, "");
        boolean zBooleanValue2 = boolIconCompatParcelizer2.booleanValue();
        Boolean boolIconCompatParcelizer3 = setPeopleSolved.AudioAttributesImplBaseParcelizer.IconCompatParcelizer(iAudioAttributesCompatParcelizer);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(boolIconCompatParcelizer3, "");
        boolean zBooleanValue3 = boolIconCompatParcelizer3.booleanValue();
        Boolean boolIconCompatParcelizer4 = setPeopleSolved.onCommand.IconCompatParcelizer(iAudioAttributesCompatParcelizer);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(boolIconCompatParcelizer4, "");
        boolean zBooleanValue4 = boolIconCompatParcelizer4.booleanValue();
        Boolean boolIconCompatParcelizer5 = setPeopleSolved.MediaBrowserCompatSearchResultReceiver.IconCompatParcelizer(iAudioAttributesCompatParcelizer);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(boolIconCompatParcelizer5, "");
        boolean zBooleanValue5 = boolIconCompatParcelizer5.booleanValue();
        Boolean boolIconCompatParcelizer6 = setPeopleSolved.MediaDescriptionCompat.IconCompatParcelizer(iAudioAttributesCompatParcelizer);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(boolIconCompatParcelizer6, "");
        int i = iAudioAttributesCompatParcelizer;
        SchemaItemCreator schemaItemCreator = new SchemaItemCreator(getvariantIconCompatParcelizer, null, getquote, courseConfigV2NavDrawerItemsAudioAttributesCompatParcelizer, courseConfigV2NavDrawerItemFreeExtensionWrite, zBooleanValue, getrelatedlessonid, remoteActionCompatParcelizer, zBooleanValue2, zBooleanValue3, zBooleanValue4, zBooleanValue5, boolIconCompatParcelizer6.booleanValue(), mediaBrowserCompatMediaItem, this.RemoteActionCompatParcelizer.write(), this.RemoteActionCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver(), this.RemoteActionCompatParcelizer.AudioAttributesImplBaseParcelizer(), this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer());
        McqTimeSpent mcqTimeSpent = this.RemoteActionCompatParcelizer;
        List<setActiveRecallQbankId.onCustomAction> listOnCustomAction = mediaBrowserCompatMediaItem.onCustomAction();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(listOnCustomAction, "");
        McqTimeSpent mcqTimeSpentWrite = mcqTimeSpent.write(schemaItemCreator, listOnCustomAction, mcqTimeSpent.AudioAttributesImplApi26Parcelizer, mcqTimeSpent.AudioAttributesImplApi21Parcelizer, mcqTimeSpent.MediaBrowserCompatItemReceiver, mcqTimeSpent.RemoteActionCompatParcelizer);
        Boolean boolIconCompatParcelizer7 = setPeopleSolved.AudioAttributesImplApi21Parcelizer.IconCompatParcelizer(i);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(boolIconCompatParcelizer7, "");
        boolean zBooleanValue6 = boolIconCompatParcelizer7.booleanValue();
        if (zBooleanValue6 && setTagExpiryMs.read(mediaBrowserCompatMediaItem)) {
            mediaBrowserCompatMediaItem2 = mediaBrowserCompatMediaItem3;
            getquoteAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(mediaBrowserCompatMediaItem2, getMCQId.PROPERTY_GETTER);
        } else {
            mediaBrowserCompatMediaItem2 = mediaBrowserCompatMediaItem3;
            getQuote.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = getQuote.IconCompatParcelizer;
            getquoteAudioAttributesCompatParcelizer = getQuote.AudioAttributesCompatParcelizer.read();
        }
        getLink getlinkAudioAttributesCompatParcelizer2 = mcqTimeSpentWrite.MediaBrowserCompatItemReceiver().AudioAttributesCompatParcelizer(setTagExpiryMs.write(mediaBrowserCompatMediaItem, this.RemoteActionCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver()));
        List<getBadgeText> listIconCompatParcelizer = mcqTimeSpentWrite.MediaBrowserCompatItemReceiver().IconCompatParcelizer();
        CourseConfigV2TestTabItem courseConfigV2TestTabItemIconCompatParcelizer = IconCompatParcelizer();
        setActiveRecallQbankId.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiverAudioAttributesCompatParcelizer = setTagExpiryMs.AudioAttributesCompatParcelizer(mediaBrowserCompatMediaItem, this.RemoteActionCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver());
        CourseConfigV2TestTabItem courseConfigV2TestTabItemAudioAttributesCompatParcelizer = (mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiverAudioAttributesCompatParcelizer == null || (getlinkAudioAttributesCompatParcelizer = mcqTimeSpentWrite.MediaBrowserCompatItemReceiver().AudioAttributesCompatParcelizer(mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiverAudioAttributesCompatParcelizer)) == null) ? null : getOption2.AudioAttributesCompatParcelizer(schemaItemCreator, getlinkAudioAttributesCompatParcelizer, getquoteAudioAttributesCompatParcelizer);
        List<setActiveRecallQbankId.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver> listRemoteActionCompatParcelizer = setTagExpiryMs.RemoteActionCompatParcelizer(mediaBrowserCompatMediaItem, this.RemoteActionCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver());
        ArrayList arrayList = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) listRemoteActionCompatParcelizer, 10));
        int i2 = 0;
        for (Object obj : listRemoteActionCompatParcelizer) {
            if (i2 < 0) {
                IntermediateLoginResponseBody.read();
            }
            arrayList.add(read((setActiveRecallQbankId.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) obj, mcqTimeSpentWrite, schemaItemCreator, i2));
            i2++;
        }
        schemaItemCreator.write(getlinkAudioAttributesCompatParcelizer2, listIconCompatParcelizer, courseConfigV2TestTabItemIconCompatParcelizer, courseConfigV2TestTabItemAudioAttributesCompatParcelizer, arrayList);
        Boolean boolIconCompatParcelizer8 = setPeopleSolved.read.IconCompatParcelizer(i);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(boolIconCompatParcelizer8, "");
        int iOnCommand = setPeopleSolved.read(boolIconCompatParcelizer8.booleanValue(), setPeopleSolved.onSetRating.IconCompatParcelizer(i), setPeopleSolved.onSetShuffleMode.IconCompatParcelizer(i));
        if (zBooleanValue6) {
            int iAudioAttributesImplBaseParcelizer = mediaBrowserCompatMediaItem.onPlayFromMediaId() ? mediaBrowserCompatMediaItem.AudioAttributesImplBaseParcelizer() : iOnCommand;
            Boolean boolIconCompatParcelizer9 = setPeopleSolved.onPrepareFromSearch.IconCompatParcelizer(iAudioAttributesImplBaseParcelizer);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(boolIconCompatParcelizer9, "");
            boolean zBooleanValue7 = boolIconCompatParcelizer9.booleanValue();
            Boolean boolIconCompatParcelizer10 = setPeopleSolved.onCustomAction.IconCompatParcelizer(iAudioAttributesImplBaseParcelizer);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(boolIconCompatParcelizer10, "");
            boolean zBooleanValue8 = boolIconCompatParcelizer10.booleanValue();
            Boolean boolIconCompatParcelizer11 = setPeopleSolved.onPlay.IconCompatParcelizer(iAudioAttributesImplBaseParcelizer);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(boolIconCompatParcelizer11, "");
            boolean zBooleanValue9 = boolIconCompatParcelizer11.booleanValue();
            getQuote getquote2 = read(mediaBrowserCompatMediaItem2, iAudioAttributesImplBaseParcelizer, getMCQId.PROPERTY_GETTER);
            if (zBooleanValue7) {
                MultiBookmarkCounter multiBookmarkCounter2 = MultiBookmarkCounter.AudioAttributesCompatParcelizer;
                schemaKtWrite = new SchemaKt(schemaItemCreator, getquote2, MultiBookmarkCounter.AudioAttributesCompatParcelizer(setPeopleSolved.onSetShuffleMode.IconCompatParcelizer(iAudioAttributesImplBaseParcelizer)), getLessonName.write(MultiBookmarkCounter.AudioAttributesCompatParcelizer, setPeopleSolved.onSetRating.IconCompatParcelizer(iAudioAttributesImplBaseParcelizer)), !zBooleanValue7, zBooleanValue8, zBooleanValue9, schemaItemCreator.handleMediaPlayPauseIfPendingOnHandler(), null, getIntroDurationSeconds.AudioAttributesCompatParcelizer);
            } else {
                schemaKtWrite = getOption2.write(schemaItemCreator, getquote2);
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(schemaKtWrite, "");
            }
            schemaKtWrite.write(schemaItemCreator.AudioAttributesImplBaseParcelizer());
        } else {
            schemaKtWrite = null;
        }
        Boolean boolIconCompatParcelizer12 = setPeopleSolved.MediaBrowserCompatItemReceiver.IconCompatParcelizer(i);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(boolIconCompatParcelizer12, "");
        if (boolIconCompatParcelizer12.booleanValue()) {
            if (mediaBrowserCompatMediaItem.onPrepareFromMediaId()) {
                iOnCommand = mediaBrowserCompatMediaItem.onCommand();
            }
            Boolean boolIconCompatParcelizer13 = setPeopleSolved.onPrepareFromSearch.IconCompatParcelizer(iOnCommand);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(boolIconCompatParcelizer13, "");
            boolean zBooleanValue10 = boolIconCompatParcelizer13.booleanValue();
            Boolean boolIconCompatParcelizer14 = setPeopleSolved.onCustomAction.IconCompatParcelizer(iOnCommand);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(boolIconCompatParcelizer14, "");
            boolean zBooleanValue11 = boolIconCompatParcelizer14.booleanValue();
            Boolean boolIconCompatParcelizer15 = setPeopleSolved.onPlay.IconCompatParcelizer(iOnCommand);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(boolIconCompatParcelizer15, "");
            boolean zBooleanValue12 = boolIconCompatParcelizer15.booleanValue();
            getQuote getquote3 = read(mediaBrowserCompatMediaItem2, iOnCommand, getMCQId.PROPERTY_SETTER);
            if (zBooleanValue10) {
                MultiBookmarkCounter multiBookmarkCounter3 = MultiBookmarkCounter.AudioAttributesCompatParcelizer;
                getschemaidAudioAttributesCompatParcelizer = new getSchemaId(schemaItemCreator, getquote3, MultiBookmarkCounter.AudioAttributesCompatParcelizer(setPeopleSolved.onSetShuffleMode.IconCompatParcelizer(iOnCommand)), getLessonName.write(MultiBookmarkCounter.AudioAttributesCompatParcelizer, setPeopleSolved.onSetRating.IconCompatParcelizer(iOnCommand)), !zBooleanValue10, zBooleanValue11, zBooleanValue12, schemaItemCreator.handleMediaPlayPauseIfPendingOnHandler(), null, getIntroDurationSeconds.AudioAttributesCompatParcelizer);
                getschemaidAudioAttributesCompatParcelizer.IconCompatParcelizer((getMeta) IntermediateLoginResponseBody.onCommand((List) mcqTimeSpentWrite.write(getschemaidAudioAttributesCompatParcelizer, IntermediateLoginResponseBody.RemoteActionCompatParcelizer(), mcqTimeSpentWrite.AudioAttributesImplApi26Parcelizer, mcqTimeSpentWrite.AudioAttributesImplApi21Parcelizer, mcqTimeSpentWrite.MediaBrowserCompatItemReceiver, mcqTimeSpentWrite.RemoteActionCompatParcelizer).read().write(IntermediateLoginResponseBody.RemoteActionCompatParcelizer(mediaBrowserCompatMediaItem.handleMediaPlayPauseIfPendingOnHandler()), mediaBrowserCompatMediaItem2, getMCQId.PROPERTY_SETTER)));
            } else {
                getQuote.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer2 = getQuote.IconCompatParcelizer;
                getschemaidAudioAttributesCompatParcelizer = getOption2.AudioAttributesCompatParcelizer(schemaItemCreator, getquote3, getQuote.AudioAttributesCompatParcelizer.read());
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getschemaidAudioAttributesCompatParcelizer, "");
            }
        } else {
            getschemaidAudioAttributesCompatParcelizer = null;
        }
        Boolean boolIconCompatParcelizer16 = setPeopleSolved.IconCompatParcelizer.IconCompatParcelizer(i);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(boolIconCompatParcelizer16, "");
        if (boolIconCompatParcelizer16.booleanValue()) {
            schemaItemCreator.IconCompatParcelizer(new write(mediaBrowserCompatMediaItem, schemaItemCreator));
        }
        getVariant getvariantIconCompatParcelizer2 = this.RemoteActionCompatParcelizer.IconCompatParcelizer();
        CourseConfigV2CustomModuleQuestionSource courseConfigV2CustomModuleQuestionSource = getvariantIconCompatParcelizer2 instanceof CourseConfigV2CustomModuleQuestionSource ? (CourseConfigV2CustomModuleQuestionSource) getvariantIconCompatParcelizer2 : null;
        if ((courseConfigV2CustomModuleQuestionSource != null ? courseConfigV2CustomModuleQuestionSource.AudioAttributesImplBaseParcelizer() : null) == getQuestionSource.ANNOTATION_CLASS) {
            schemaItemCreator.IconCompatParcelizer(new RemoteActionCompatParcelizer(mediaBrowserCompatMediaItem, schemaItemCreator));
        }
        SchemaItemCreator schemaItemCreator2 = schemaItemCreator;
        schemaItemCreator.write(schemaKtWrite, getschemaidAudioAttributesCompatParcelizer, new getSerializableMap(RemoteActionCompatParcelizer(mediaBrowserCompatMediaItem, false), schemaItemCreator2), new getSerializableMap(RemoteActionCompatParcelizer(mediaBrowserCompatMediaItem, true), schemaItemCreator2));
        return schemaItemCreator2;
    }

    static final class write extends MagicModuleUseCase implements getCreatedOnDateMs<SchemaLessonStatusResponse<? extends getMagicLine<?>>> {
        private /* synthetic */ setActiveRecallQbankId.MediaBrowserCompatMediaItem IconCompatParcelizer;
        private /* synthetic */ SchemaItemCreator write;

        /* JADX INFO: renamed from: o.allFilterItem$write$1, reason: invalid class name */
        static final class AnonymousClass1 extends MagicModuleUseCase implements getCreatedOnDateMs<getMagicLine<?>> {
            private /* synthetic */ setActiveRecallQbankId.MediaBrowserCompatMediaItem AudioAttributesCompatParcelizer;
            private /* synthetic */ allFilterItem read;
            private /* synthetic */ SchemaItemCreator write;

            /* JADX INFO: Access modifiers changed from: private */
            @Override // kotlin.getCreatedOnDateMs
            /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
            public getMagicLine<?> invoke() {
                allFilterItem allfilteritem = this.read;
                getBookmarkCount getbookmarkcountAudioAttributesCompatParcelizer = allfilteritem.AudioAttributesCompatParcelizer(allfilteritem.RemoteActionCompatParcelizer.IconCompatParcelizer());
                toMagicModuleMetaRepoModel.write(getbookmarkcountAudioAttributesCompatParcelizer);
                setStartIndex<dummyEditor, getMagicLine<?>> setstartindexAudioAttributesCompatParcelizer = this.read.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer().AudioAttributesCompatParcelizer();
                setActiveRecallQbankId.MediaBrowserCompatMediaItem mediaBrowserCompatMediaItem = this.AudioAttributesCompatParcelizer;
                getLink getlinkAudioAttributesImplBaseParcelizer = this.write.AudioAttributesImplBaseParcelizer();
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getlinkAudioAttributesImplBaseParcelizer, "");
                return setstartindexAudioAttributesCompatParcelizer.IconCompatParcelizer(getbookmarkcountAudioAttributesCompatParcelizer, mediaBrowserCompatMediaItem, getlinkAudioAttributesImplBaseParcelizer);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(allFilterItem allfilteritem, setActiveRecallQbankId.MediaBrowserCompatMediaItem mediaBrowserCompatMediaItem, SchemaItemCreator schemaItemCreator) {
                super(0);
                this.read = allfilteritem;
                this.AudioAttributesCompatParcelizer = mediaBrowserCompatMediaItem;
                this.write = schemaItemCreator;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public SchemaLessonStatusResponse<getMagicLine<?>> invoke() {
            return allFilterItem.this.RemoteActionCompatParcelizer.AudioAttributesImplApi21Parcelizer().AudioAttributesCompatParcelizer(new AnonymousClass1(allFilterItem.this, this.IconCompatParcelizer, this.write));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        write(setActiveRecallQbankId.MediaBrowserCompatMediaItem mediaBrowserCompatMediaItem, SchemaItemCreator schemaItemCreator) {
            super(0);
            this.IconCompatParcelizer = mediaBrowserCompatMediaItem;
            this.write = schemaItemCreator;
        }
    }

    static final class RemoteActionCompatParcelizer extends MagicModuleUseCase implements getCreatedOnDateMs<SchemaLessonStatusResponse<? extends getMagicLine<?>>> {
        private /* synthetic */ SchemaItemCreator IconCompatParcelizer;
        private /* synthetic */ setActiveRecallQbankId.MediaBrowserCompatMediaItem RemoteActionCompatParcelizer;

        /* JADX INFO: renamed from: o.allFilterItem$RemoteActionCompatParcelizer$5, reason: invalid class name */
        static final class AnonymousClass5 extends MagicModuleUseCase implements getCreatedOnDateMs<getMagicLine<?>> {
            private /* synthetic */ SchemaItemCreator AudioAttributesCompatParcelizer;
            private /* synthetic */ allFilterItem IconCompatParcelizer;
            private /* synthetic */ setActiveRecallQbankId.MediaBrowserCompatMediaItem write;

            /* JADX INFO: Access modifiers changed from: private */
            @Override // kotlin.getCreatedOnDateMs
            /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
            public getMagicLine<?> invoke() {
                allFilterItem allfilteritem = this.IconCompatParcelizer;
                getBookmarkCount getbookmarkcountAudioAttributesCompatParcelizer = allfilteritem.AudioAttributesCompatParcelizer(allfilteritem.RemoteActionCompatParcelizer.IconCompatParcelizer());
                toMagicModuleMetaRepoModel.write(getbookmarkcountAudioAttributesCompatParcelizer);
                setStartIndex<dummyEditor, getMagicLine<?>> setstartindexAudioAttributesCompatParcelizer = this.IconCompatParcelizer.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer().AudioAttributesCompatParcelizer();
                setActiveRecallQbankId.MediaBrowserCompatMediaItem mediaBrowserCompatMediaItem = this.write;
                getLink getlinkAudioAttributesImplBaseParcelizer = this.AudioAttributesCompatParcelizer.AudioAttributesImplBaseParcelizer();
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getlinkAudioAttributesImplBaseParcelizer, "");
                return setstartindexAudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(getbookmarkcountAudioAttributesCompatParcelizer, mediaBrowserCompatMediaItem, getlinkAudioAttributesImplBaseParcelizer);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass5(allFilterItem allfilteritem, setActiveRecallQbankId.MediaBrowserCompatMediaItem mediaBrowserCompatMediaItem, SchemaItemCreator schemaItemCreator) {
                super(0);
                this.IconCompatParcelizer = allfilteritem;
                this.write = mediaBrowserCompatMediaItem;
                this.AudioAttributesCompatParcelizer = schemaItemCreator;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public SchemaLessonStatusResponse<getMagicLine<?>> invoke() {
            return allFilterItem.this.RemoteActionCompatParcelizer.AudioAttributesImplApi21Parcelizer().AudioAttributesCompatParcelizer(new AnonymousClass5(allFilterItem.this, this.RemoteActionCompatParcelizer, this.IconCompatParcelizer));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        RemoteActionCompatParcelizer(setActiveRecallQbankId.MediaBrowserCompatMediaItem mediaBrowserCompatMediaItem, SchemaItemCreator schemaItemCreator) {
            super(0);
            this.RemoteActionCompatParcelizer = mediaBrowserCompatMediaItem;
            this.IconCompatParcelizer = schemaItemCreator;
        }
    }

    private static void AudioAttributesCompatParcelizer(SchemaLessonCompletionMcqMap schemaLessonCompletionMcqMap, CourseConfigV2TestTabItem courseConfigV2TestTabItem, CourseConfigV2TestTabItem courseConfigV2TestTabItem2, List<? extends CourseConfigV2TestTabItem> list, List<? extends getBadgeText> list2, List<? extends getMeta> list3, getLink getlink, CourseConfigV2NavDrawerItems courseConfigV2NavDrawerItems, CourseConfigV2NavDrawerItemFreeExtension courseConfigV2NavDrawerItemFreeExtension, Map<? extends getVideoPageNotesTitle.RemoteActionCompatParcelizer<?>, ?> map) {
        schemaLessonCompletionMcqMap.read(courseConfigV2TestTabItem, courseConfigV2TestTabItem2, list, list2, list3, getlink, courseConfigV2NavDrawerItems, courseConfigV2NavDrawerItemFreeExtension, map);
    }

    public final CourseConfigV2SupportItem AudioAttributesCompatParcelizer(setActiveRecallQbankId.AudioAttributesImplApi26Parcelizer audioAttributesImplApi26Parcelizer) {
        getQuote getquoteAudioAttributesCompatParcelizer;
        setVideoId setvideoidAudioAttributesImplBaseParcelizer;
        getLink getlinkAudioAttributesCompatParcelizer;
        toMagicModuleMetaRepoModel.write(audioAttributesImplApi26Parcelizer, "");
        int iMediaBrowserCompatItemReceiver = audioAttributesImplApi26Parcelizer.onPause() ? audioAttributesImplApi26Parcelizer.MediaBrowserCompatItemReceiver() : read(audioAttributesImplApi26Parcelizer.MediaDescriptionCompat());
        setActiveRecallQbankId.AudioAttributesImplApi26Parcelizer audioAttributesImplApi26Parcelizer2 = audioAttributesImplApi26Parcelizer;
        getQuote getquote = read(audioAttributesImplApi26Parcelizer2, iMediaBrowserCompatItemReceiver, getMCQId.FUNCTION);
        if (setTagExpiryMs.write(audioAttributesImplApi26Parcelizer)) {
            getquoteAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(audioAttributesImplApi26Parcelizer2, getMCQId.FUNCTION);
        } else {
            getQuote.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = getQuote.IconCompatParcelizer;
            getquoteAudioAttributesCompatParcelizer = getQuote.AudioAttributesCompatParcelizer.read();
        }
        getQuote getquote2 = getquoteAudioAttributesCompatParcelizer;
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(setLocked.write(this.RemoteActionCompatParcelizer.IconCompatParcelizer()).write(FilterItemRecordCreator.read(this.RemoteActionCompatParcelizer.write(), audioAttributesImplApi26Parcelizer.AudioAttributesImplBaseParcelizer())), isQbankSolved.read)) {
            setVideoId.IconCompatParcelizer iconCompatParcelizer = setVideoId.AudioAttributesCompatParcelizer;
            setvideoidAudioAttributesImplBaseParcelizer = setVideoId.IconCompatParcelizer.RemoteActionCompatParcelizer();
        } else {
            setvideoidAudioAttributesImplBaseParcelizer = this.RemoteActionCompatParcelizer.AudioAttributesImplBaseParcelizer();
        }
        SchemaLessonCompletionMcqMap schemaLessonCompletionMcqMap = new SchemaLessonCompletionMcqMap(this.RemoteActionCompatParcelizer.IconCompatParcelizer(), getquote, FilterItemRecordCreator.read(this.RemoteActionCompatParcelizer.write(), audioAttributesImplApi26Parcelizer.AudioAttributesImplBaseParcelizer()), getLessonName.read(MultiBookmarkCounter.AudioAttributesCompatParcelizer, setPeopleSolved.onSetRepeatMode.IconCompatParcelizer(iMediaBrowserCompatItemReceiver)), audioAttributesImplApi26Parcelizer, this.RemoteActionCompatParcelizer.write(), this.RemoteActionCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver(), setvideoidAudioAttributesImplBaseParcelizer, this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer());
        McqTimeSpent mcqTimeSpent = this.RemoteActionCompatParcelizer;
        List<setActiveRecallQbankId.onCustomAction> listOnCommand = audioAttributesImplApi26Parcelizer.onCommand();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(listOnCommand, "");
        McqTimeSpent mcqTimeSpentWrite = mcqTimeSpent.write(schemaLessonCompletionMcqMap, listOnCommand, mcqTimeSpent.AudioAttributesImplApi26Parcelizer, mcqTimeSpent.AudioAttributesImplApi21Parcelizer, mcqTimeSpent.MediaBrowserCompatItemReceiver, mcqTimeSpent.RemoteActionCompatParcelizer);
        setActiveRecallQbankId.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiverRemoteActionCompatParcelizer = setTagExpiryMs.RemoteActionCompatParcelizer(audioAttributesImplApi26Parcelizer, this.RemoteActionCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver());
        CourseConfigV2TestTabItem courseConfigV2TestTabItemAudioAttributesCompatParcelizer = (mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiverRemoteActionCompatParcelizer == null || (getlinkAudioAttributesCompatParcelizer = mcqTimeSpentWrite.MediaBrowserCompatItemReceiver().AudioAttributesCompatParcelizer(mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiverRemoteActionCompatParcelizer)) == null) ? null : getOption2.AudioAttributesCompatParcelizer(schemaLessonCompletionMcqMap, getlinkAudioAttributesCompatParcelizer, getquote2);
        CourseConfigV2TestTabItem courseConfigV2TestTabItemIconCompatParcelizer = IconCompatParcelizer();
        List<setActiveRecallQbankId.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver> listAudioAttributesCompatParcelizer = setTagExpiryMs.AudioAttributesCompatParcelizer(audioAttributesImplApi26Parcelizer, this.RemoteActionCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver());
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Object obj : listAudioAttributesCompatParcelizer) {
            if (i < 0) {
                IntermediateLoginResponseBody.read();
            }
            CourseConfigV2TestTabItem courseConfigV2TestTabItem = read((setActiveRecallQbankId.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) obj, mcqTimeSpentWrite, schemaLessonCompletionMcqMap, i);
            if (courseConfigV2TestTabItem != null) {
                arrayList.add(courseConfigV2TestTabItem);
            }
            i++;
        }
        ArrayList arrayList2 = arrayList;
        List<getBadgeText> listIconCompatParcelizer = mcqTimeSpentWrite.MediaBrowserCompatItemReceiver().IconCompatParcelizer();
        allFilterItem allfilteritem = mcqTimeSpentWrite.read();
        List<setActiveRecallQbankId.handleMediaPlayPauseIfPendingOnHandler> listMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = audioAttributesImplApi26Parcelizer.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(listMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, "");
        List<getMeta> listWrite = allfilteritem.write(listMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, audioAttributesImplApi26Parcelizer2, getMCQId.FUNCTION);
        getLink getlinkAudioAttributesCompatParcelizer2 = mcqTimeSpentWrite.MediaBrowserCompatItemReceiver().AudioAttributesCompatParcelizer(setTagExpiryMs.write(audioAttributesImplApi26Parcelizer, this.RemoteActionCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver()));
        MultiBookmarkCounter multiBookmarkCounter = MultiBookmarkCounter.AudioAttributesCompatParcelizer;
        AudioAttributesCompatParcelizer(schemaLessonCompletionMcqMap, courseConfigV2TestTabItemAudioAttributesCompatParcelizer, courseConfigV2TestTabItemIconCompatParcelizer, arrayList2, listIconCompatParcelizer, listWrite, getlinkAudioAttributesCompatParcelizer2, MultiBookmarkCounter.AudioAttributesCompatParcelizer(setPeopleSolved.onSetShuffleMode.IconCompatParcelizer(iMediaBrowserCompatItemReceiver)), getLessonName.write(MultiBookmarkCounter.AudioAttributesCompatParcelizer, setPeopleSolved.onSetRating.IconCompatParcelizer(iMediaBrowserCompatItemReceiver)), VideoTimelineResponseBody.read());
        Boolean boolIconCompatParcelizer = setPeopleSolved.onPlayFromSearch.IconCompatParcelizer(iMediaBrowserCompatItemReceiver);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(boolIconCompatParcelizer, "");
        schemaLessonCompletionMcqMap.AudioAttributesImplBaseParcelizer(boolIconCompatParcelizer.booleanValue());
        Boolean boolIconCompatParcelizer2 = setPeopleSolved.onMediaButtonEvent.IconCompatParcelizer(iMediaBrowserCompatItemReceiver);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(boolIconCompatParcelizer2, "");
        schemaLessonCompletionMcqMap.MediaBrowserCompatCustomActionResultReceiver(boolIconCompatParcelizer2.booleanValue());
        Boolean boolIconCompatParcelizer3 = setPeopleSolved.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.IconCompatParcelizer(iMediaBrowserCompatItemReceiver);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(boolIconCompatParcelizer3, "");
        schemaLessonCompletionMcqMap.read(boolIconCompatParcelizer3.booleanValue());
        Boolean boolIconCompatParcelizer4 = setPeopleSolved.onFastForward.IconCompatParcelizer(iMediaBrowserCompatItemReceiver);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(boolIconCompatParcelizer4, "");
        schemaLessonCompletionMcqMap.AudioAttributesImplApi21Parcelizer(boolIconCompatParcelizer4.booleanValue());
        Boolean boolIconCompatParcelizer5 = setPeopleSolved.onRemoveQueueItem.IconCompatParcelizer(iMediaBrowserCompatItemReceiver);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(boolIconCompatParcelizer5, "");
        schemaLessonCompletionMcqMap.AudioAttributesImplApi26Parcelizer(boolIconCompatParcelizer5.booleanValue());
        Boolean boolIconCompatParcelizer6 = setPeopleSolved.onRewind.IconCompatParcelizer(iMediaBrowserCompatItemReceiver);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(boolIconCompatParcelizer6, "");
        schemaLessonCompletionMcqMap.MediaBrowserCompatItemReceiver(boolIconCompatParcelizer6.booleanValue());
        Boolean boolIconCompatParcelizer7 = setPeopleSolved.RatingCompat.IconCompatParcelizer(iMediaBrowserCompatItemReceiver);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(boolIconCompatParcelizer7, "");
        schemaLessonCompletionMcqMap.RemoteActionCompatParcelizer(boolIconCompatParcelizer7.booleanValue());
        schemaLessonCompletionMcqMap.AudioAttributesCompatParcelizer(!setPeopleSolved.onAddQueueItem.IconCompatParcelizer(iMediaBrowserCompatItemReceiver).booleanValue());
        this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer().MediaBrowserCompatCustomActionResultReceiver().read(audioAttributesImplApi26Parcelizer, schemaLessonCompletionMcqMap, this.RemoteActionCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver(), mcqTimeSpentWrite.MediaBrowserCompatItemReceiver());
        return schemaLessonCompletionMcqMap;
    }

    public final CourseConfigV2VideoProperties AudioAttributesCompatParcelizer(setActiveRecallQbankId.onCommand oncommand) {
        toMagicModuleMetaRepoModel.write(oncommand, "");
        getQuote.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = getQuote.IconCompatParcelizer;
        List<setActiveRecallQbankId.IconCompatParcelizer> listAudioAttributesCompatParcelizer = oncommand.AudioAttributesCompatParcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(listAudioAttributesCompatParcelizer, "");
        List<setActiveRecallQbankId.IconCompatParcelizer> list = listAudioAttributesCompatParcelizer;
        ArrayList arrayList = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) list, 10));
        for (setActiveRecallQbankId.IconCompatParcelizer iconCompatParcelizer : list) {
            setMCQId setmcqid = this.read;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(iconCompatParcelizer, "");
            arrayList.add(setmcqid.RemoteActionCompatParcelizer(iconCompatParcelizer, this.RemoteActionCompatParcelizer.write()));
        }
        getSchemaMcqCount getschemamcqcount = new getSchemaMcqCount(this.RemoteActionCompatParcelizer.AudioAttributesImplApi21Parcelizer(), this.RemoteActionCompatParcelizer.IconCompatParcelizer(), getQuote.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(arrayList), FilterItemRecordCreator.read(this.RemoteActionCompatParcelizer.write(), oncommand.AudioAttributesImplBaseParcelizer()), getLessonName.write(MultiBookmarkCounter.AudioAttributesCompatParcelizer, setPeopleSolved.onSetRating.IconCompatParcelizer(oncommand.MediaBrowserCompatItemReceiver())), oncommand, this.RemoteActionCompatParcelizer.write(), this.RemoteActionCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver(), this.RemoteActionCompatParcelizer.AudioAttributesImplBaseParcelizer(), this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer());
        McqTimeSpent mcqTimeSpent = this.RemoteActionCompatParcelizer;
        List<setActiveRecallQbankId.onCustomAction> listMediaMetadataCompat = oncommand.MediaMetadataCompat();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(listMediaMetadataCompat, "");
        McqTimeSpent mcqTimeSpentWrite = mcqTimeSpent.write(getschemamcqcount, listMediaMetadataCompat, mcqTimeSpent.AudioAttributesImplApi26Parcelizer, mcqTimeSpent.AudioAttributesImplApi21Parcelizer, mcqTimeSpent.MediaBrowserCompatItemReceiver, mcqTimeSpent.RemoteActionCompatParcelizer);
        getschemamcqcount.IconCompatParcelizer(mcqTimeSpentWrite.MediaBrowserCompatItemReceiver().IconCompatParcelizer(), mcqTimeSpentWrite.MediaBrowserCompatItemReceiver().write(setTagExpiryMs.write(oncommand, this.RemoteActionCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver()), false), mcqTimeSpentWrite.MediaBrowserCompatItemReceiver().write(setTagExpiryMs.IconCompatParcelizer(oncommand, this.RemoteActionCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver()), false));
        return getschemamcqcount;
    }

    private final CourseConfigV2TestTabItem IconCompatParcelizer() {
        getVariant getvariantIconCompatParcelizer = this.RemoteActionCompatParcelizer.IconCompatParcelizer();
        CourseConfigV2CustomModuleQuestionSource courseConfigV2CustomModuleQuestionSource = getvariantIconCompatParcelizer instanceof CourseConfigV2CustomModuleQuestionSource ? (CourseConfigV2CustomModuleQuestionSource) getvariantIconCompatParcelizer : null;
        if (courseConfigV2CustomModuleQuestionSource != null) {
            return courseConfigV2CustomModuleQuestionSource.onPlayFromSearch();
        }
        return null;
    }

    public final CourseConfigV2EditionSwitch read(setActiveRecallQbankId.write writeVar, boolean z) {
        toMagicModuleMetaRepoModel.write(writeVar, "");
        getVariant getvariantIconCompatParcelizer = this.RemoteActionCompatParcelizer.IconCompatParcelizer();
        toMagicModuleMetaRepoModel.read(getvariantIconCompatParcelizer, "");
        CourseConfigV2CustomModuleQuestionSource courseConfigV2CustomModuleQuestionSource = (CourseConfigV2CustomModuleQuestionSource) getvariantIconCompatParcelizer;
        setActiveRecallQbankId.write writeVar2 = writeVar;
        SchemaDetail schemaDetail = new SchemaDetail(courseConfigV2CustomModuleQuestionSource, read(writeVar2, writeVar.AudioAttributesCompatParcelizer(), getMCQId.FUNCTION), z, getTestHeaderTitle.RemoteActionCompatParcelizer.DECLARATION, writeVar, this.RemoteActionCompatParcelizer.write(), this.RemoteActionCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver(), this.RemoteActionCompatParcelizer.AudioAttributesImplBaseParcelizer(), this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer());
        McqTimeSpent mcqTimeSpent = this.RemoteActionCompatParcelizer;
        allFilterItem allfilteritem = mcqTimeSpent.write(schemaDetail, IntermediateLoginResponseBody.RemoteActionCompatParcelizer(), mcqTimeSpent.AudioAttributesImplApi26Parcelizer, mcqTimeSpent.AudioAttributesImplApi21Parcelizer, mcqTimeSpent.MediaBrowserCompatItemReceiver, mcqTimeSpent.RemoteActionCompatParcelizer).read();
        List<setActiveRecallQbankId.handleMediaPlayPauseIfPendingOnHandler> listWrite = writeVar.write();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(listWrite, "");
        schemaDetail.read(allfilteritem.write(listWrite, writeVar2, getMCQId.FUNCTION), getLessonName.write(MultiBookmarkCounter.AudioAttributesCompatParcelizer, setPeopleSolved.onSetRating.IconCompatParcelizer(writeVar.AudioAttributesCompatParcelizer())));
        schemaDetail.write(courseConfigV2CustomModuleQuestionSource.aP_());
        schemaDetail.RemoteActionCompatParcelizer(courseConfigV2CustomModuleQuestionSource.onPause());
        schemaDetail.AudioAttributesCompatParcelizer(!setPeopleSolved.MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer(writeVar.AudioAttributesCompatParcelizer()).booleanValue());
        return schemaDetail;
    }

    private final getQuote read(BookReference bookReference, int i, getMCQId getmcqid) {
        if (!setPeopleSolved.read.IconCompatParcelizer(i).booleanValue()) {
            getQuote.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = getQuote.IconCompatParcelizer;
            return getQuote.AudioAttributesCompatParcelizer.read();
        }
        return new SchemaLessonItem(this.RemoteActionCompatParcelizer.AudioAttributesImplApi21Parcelizer(), new read(bookReference, getmcqid));
    }

    static final class read extends MagicModuleUseCase implements getCreatedOnDateMs<List<? extends dummyEditor>> {
        private /* synthetic */ BookReference AudioAttributesCompatParcelizer;
        private /* synthetic */ getMCQId RemoteActionCompatParcelizer;

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public List<dummyEditor> invoke() {
            List<dummyEditor> listOnPlay;
            allFilterItem allfilteritem = allFilterItem.this;
            getBookmarkCount getbookmarkcountAudioAttributesCompatParcelizer = allfilteritem.AudioAttributesCompatParcelizer(allfilteritem.RemoteActionCompatParcelizer.IconCompatParcelizer());
            if (getbookmarkcountAudioAttributesCompatParcelizer != null) {
                listOnPlay = IntermediateLoginResponseBody.onPlay(allFilterItem.this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer().AudioAttributesCompatParcelizer().IconCompatParcelizer(getbookmarkcountAudioAttributesCompatParcelizer, this.AudioAttributesCompatParcelizer, this.RemoteActionCompatParcelizer));
            } else {
                listOnPlay = null;
            }
            return listOnPlay == null ? IntermediateLoginResponseBody.RemoteActionCompatParcelizer() : listOnPlay;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        read(BookReference bookReference, getMCQId getmcqid) {
            super(0);
            this.AudioAttributesCompatParcelizer = bookReference;
            this.RemoteActionCompatParcelizer = getmcqid;
        }
    }

    private final getQuote RemoteActionCompatParcelizer(setActiveRecallQbankId.MediaBrowserCompatMediaItem mediaBrowserCompatMediaItem, boolean z) {
        if (!setPeopleSolved.read.IconCompatParcelizer(mediaBrowserCompatMediaItem.AudioAttributesCompatParcelizer()).booleanValue()) {
            getQuote.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = getQuote.IconCompatParcelizer;
            return getQuote.AudioAttributesCompatParcelizer.read();
        }
        return new SchemaLessonItem(this.RemoteActionCompatParcelizer.AudioAttributesImplApi21Parcelizer(), new IconCompatParcelizer(z, mediaBrowserCompatMediaItem));
    }

    static final class IconCompatParcelizer extends MagicModuleUseCase implements getCreatedOnDateMs<List<? extends dummyEditor>> {
        private /* synthetic */ setActiveRecallQbankId.MediaBrowserCompatMediaItem AudioAttributesCompatParcelizer;
        private /* synthetic */ boolean RemoteActionCompatParcelizer;

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public List<dummyEditor> invoke() {
            List<dummyEditor> listOnPlay;
            allFilterItem allfilteritem = allFilterItem.this;
            getBookmarkCount getbookmarkcountAudioAttributesCompatParcelizer = allfilteritem.AudioAttributesCompatParcelizer(allfilteritem.RemoteActionCompatParcelizer.IconCompatParcelizer());
            if (getbookmarkcountAudioAttributesCompatParcelizer != null) {
                boolean z = this.RemoteActionCompatParcelizer;
                allFilterItem allfilteritem2 = allFilterItem.this;
                setActiveRecallQbankId.MediaBrowserCompatMediaItem mediaBrowserCompatMediaItem = this.AudioAttributesCompatParcelizer;
                listOnPlay = z ? IntermediateLoginResponseBody.onPlay(allfilteritem2.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer().AudioAttributesCompatParcelizer().AudioAttributesCompatParcelizer(getbookmarkcountAudioAttributesCompatParcelizer, mediaBrowserCompatMediaItem)) : IntermediateLoginResponseBody.onPlay(allfilteritem2.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer().AudioAttributesCompatParcelizer().write(getbookmarkcountAudioAttributesCompatParcelizer, mediaBrowserCompatMediaItem));
            } else {
                listOnPlay = null;
            }
            return listOnPlay == null ? IntermediateLoginResponseBody.RemoteActionCompatParcelizer() : listOnPlay;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IconCompatParcelizer(boolean z, setActiveRecallQbankId.MediaBrowserCompatMediaItem mediaBrowserCompatMediaItem) {
            super(0);
            this.RemoteActionCompatParcelizer = z;
            this.AudioAttributesCompatParcelizer = mediaBrowserCompatMediaItem;
        }
    }

    static final class AudioAttributesCompatParcelizer extends MagicModuleUseCase implements getCreatedOnDateMs<List<? extends dummyEditor>> {
        private /* synthetic */ getMCQId read;
        private /* synthetic */ BookReference write;

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public List<dummyEditor> invoke() {
            List<dummyEditor> list;
            allFilterItem allfilteritem = allFilterItem.this;
            getBookmarkCount getbookmarkcountAudioAttributesCompatParcelizer = allfilteritem.AudioAttributesCompatParcelizer(allfilteritem.RemoteActionCompatParcelizer.IconCompatParcelizer());
            if (getbookmarkcountAudioAttributesCompatParcelizer != null) {
                list = allFilterItem.this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer().AudioAttributesCompatParcelizer().read(getbookmarkcountAudioAttributesCompatParcelizer, this.write, this.read);
            } else {
                list = null;
            }
            return list == null ? IntermediateLoginResponseBody.RemoteActionCompatParcelizer() : list;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AudioAttributesCompatParcelizer(BookReference bookReference, getMCQId getmcqid) {
            super(0);
            this.write = bookReference;
            this.read = getmcqid;
        }
    }

    private final getQuote AudioAttributesCompatParcelizer(BookReference bookReference, getMCQId getmcqid) {
        return new getUserContext(this.RemoteActionCompatParcelizer.AudioAttributesImplApi21Parcelizer(), new AudioAttributesCompatParcelizer(bookReference, getmcqid));
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0088  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.util.List<kotlin.getMeta> write(java.util.List<o.setActiveRecallQbankId.handleMediaPlayPauseIfPendingOnHandler> r27, kotlin.BookReference r28, kotlin.getMCQId r29) {
        /*
            Method dump skipped, instruction units count: 281
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.allFilterItem.write(java.util.List, o.BookReference, o.getMCQId):java.util.List");
    }

    static final class AudioAttributesImplBaseParcelizer extends MagicModuleUseCase implements getCreatedOnDateMs<List<? extends dummyEditor>> {
        private /* synthetic */ setActiveRecallQbankId.handleMediaPlayPauseIfPendingOnHandler AudioAttributesCompatParcelizer;
        private /* synthetic */ getMCQId IconCompatParcelizer;
        private /* synthetic */ BookReference RemoteActionCompatParcelizer;
        private /* synthetic */ getBookmarkCount read;
        private /* synthetic */ int write;

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public List<dummyEditor> invoke() {
            return IntermediateLoginResponseBody.onPlay(allFilterItem.this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer().AudioAttributesCompatParcelizer().RemoteActionCompatParcelizer(this.read, this.RemoteActionCompatParcelizer, this.IconCompatParcelizer, this.write, this.AudioAttributesCompatParcelizer));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AudioAttributesImplBaseParcelizer(getBookmarkCount getbookmarkcount, BookReference bookReference, getMCQId getmcqid, int i, setActiveRecallQbankId.handleMediaPlayPauseIfPendingOnHandler handlemediaplaypauseifpendingonhandler) {
            super(0);
            this.read = getbookmarkcount;
            this.RemoteActionCompatParcelizer = bookReference;
            this.IconCompatParcelizer = getmcqid;
            this.write = i;
            this.AudioAttributesCompatParcelizer = handlemediaplaypauseifpendingonhandler;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final getBookmarkCount AudioAttributesCompatParcelizer(getVariant getvariant) {
        if (getvariant instanceof getShouldShowEmptyPlanScreen) {
            return new getBookmarkCount.IconCompatParcelizer(((getShouldShowEmptyPlanScreen) getvariant).IconCompatParcelizer(), this.RemoteActionCompatParcelizer.write(), this.RemoteActionCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver(), this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer());
        }
        if (getvariant instanceof SchemaItem) {
            return ((SchemaItem) getvariant).onPrepareFromUri();
        }
        return null;
    }

    private static CourseConfigV2TestTabItem read(setActiveRecallQbankId.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, McqTimeSpent mcqTimeSpent, getVideoPageNotesTitle getvideopagenotestitle, int i) {
        getLink getlinkAudioAttributesCompatParcelizer = mcqTimeSpent.MediaBrowserCompatItemReceiver().AudioAttributesCompatParcelizer(mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver);
        getQuote.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = getQuote.IconCompatParcelizer;
        return getOption2.read(getvideopagenotestitle, getlinkAudioAttributesCompatParcelizer, (getRelatedLessonId) null, getQuote.AudioAttributesCompatParcelizer.read(), i);
    }
}
