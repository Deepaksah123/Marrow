package kotlin;

import com.marrow.R;
import com.marrow.data.models.common.PresenterBundle;
import kotlin.BandwidthMeterEventListenerEventDispatcherHandlerAndListener;
import kotlin.Metadata;
import kotlin.allocate;
import kotlin.getIndividualAllocationLength;
import kotlin.setMap;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u0000 62\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u00016B]\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0001\u0010\b\u001a\u00020\t\u0012\b\b\u0001\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\b\u0010 \u001a\u00020!H\u0016J\b\u0010\"\u001a\u00020!H\u0002J\"\u0010#\u001a\u00020!2\b\u0010$\u001a\u0004\u0018\u00010%2\u000e\u0010&\u001a\n\u0018\u00010'j\u0004\u0018\u0001`(H\u0002J\b\u0010)\u001a\u00020!H\u0016J\u0012\u0010*\u001a\u00020!2\b\u0010+\u001a\u0004\u0018\u00010,H\u0016J\b\u0010-\u001a\u00020,H\u0016J\u000e\u0010.\u001a\b\u0012\u0004\u0012\u00020\u001d0/H\u0016J\u0010\u00100\u001a\u00020!2\u0006\u00101\u001a\u000202H\u0016J\u000e\u00103\u001a\u00020!H\u0096@¢\u0006\u0002\u00104J\b\u00105\u001a\u00020!H\u0016R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u00067"}, d2 = {"Lcom/marrow/kt/ui/activities/sync/SyncActivityPresenterImpl;", "Lcom/marrow/mvp/BasePresenter2;", "Lcom/marrow/kt/ui/activities/sync/SyncActivityView;", "Lcom/marrow/kt/ui/activities/sync/SyncActivityPresenter;", "crashDataProvider", "Lcom/marrow/dataprovider/crash/ICrashDataProvider;", "resourceProvider", "Lcom/marrow/data/dataprovider/common/IResourceProvider;", "computationScheduler", "Lio/reactivex/Scheduler;", "uiScheduler", "view", "preferenceDataProvider", "Lcom/marrow/data/dataprovider/preference/IPreferenceDataProvider;", "connectivity", "Lcom/marrow/mvp/Connectivity;", "remoteConfigUseCase", "Lcom/marrow2/domain/remoteconfig/RemoteConfigUseCase;", "orchestrator", "Lcom/marrow2/core/sync/MainSyncOrchestrator;", "syncEventBus", "Lcom/marrow2/core/sync/MainSyncEventBus;", "<init>", "(Lcom/marrow/dataprovider/crash/ICrashDataProvider;Lcom/marrow/data/dataprovider/common/IResourceProvider;Lio/reactivex/Scheduler;Lio/reactivex/Scheduler;Lcom/marrow/kt/ui/activities/sync/SyncActivityView;Lcom/marrow/data/dataprovider/preference/IPreferenceDataProvider;Lcom/marrow/mvp/Connectivity;Lcom/marrow2/domain/remoteconfig/RemoteConfigUseCase;Lcom/marrow2/core/sync/MainSyncOrchestrator;Lcom/marrow2/core/sync/MainSyncEventBus;)V", "getPreferenceDataProvider", "()Lcom/marrow/data/dataprovider/preference/IPreferenceDataProvider;", "getConnectivity", "()Lcom/marrow/mvp/Connectivity;", "isRetryDialogShown", "", "presenterScope", "Lkotlinx/coroutines/CoroutineScope;", "onCreate", "", "observeSyncEvents", "onSyncFailed", "task", "Lcom/marrow2/core/sync/MainSyncIdentifier;", "cause", "Ljava/lang/Exception;", "Lkotlin/Exception;", "checkFirstSyncDone", "restoreStateVariable", "stateVariable", "Lcom/marrow/data/models/common/PresenterBundle;", "getStateVariable", "onErrorDialogButtonClick", "Lkotlin/Function0;", "onBulkDownloadComplete", "type", "", "setMarrowRevampConfig", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onDestroy", "Companion", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SsManifestParserElementParser extends getCurrentEventTimeUs<addChild> implements getChunkDurationUs {
    public static final write read = new write(null);
    private final getStreamPositionUsForContent AudioAttributesImplApi21Parcelizer;
    private final getChannel AudioAttributesImplApi26Parcelizer;
    private boolean AudioAttributesImplBaseParcelizer;
    private final AssetDataSourceAssetDataSourceException MediaBrowserCompatItemReceiver;
    private final TopUserCompanion MediaBrowserCompatSearchResultReceiver;
    private final Allocator MediaMetadataCompat;
    private final readTimestamp RatingCompat;

    public static final /* synthetic */ String AudioAttributesCompatParcelizer(SsManifestParserElementParser ssManifestParserElementParser) {
        return ssManifestParserElementParser.RemoteActionCompatParcelizer(R.string.app_error_no_internet);
    }

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from getter */
    public final getStreamPositionUsForContent getAudioAttributesImplApi21Parcelizer() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final getChannel getAudioAttributesImplApi26Parcelizer() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @setSdkPayload
    public SsManifestParserElementParser(parseLongAttr parselongattr, endsWithLivePostrollPlaceHolder endswithlivepostrollplaceholder, getIds getids, getIds getids2, addChild addchild, getStreamPositionUsForContent getstreampositionusforcontent, getChannel getchannel, readTimestamp readtimestamp, AssetDataSourceAssetDataSourceException assetDataSourceAssetDataSourceException, Allocator allocator) {
        super(parselongattr, endswithlivepostrollplaceholder, getids, getids2, addchild);
        toMagicModuleMetaRepoModel.write(parselongattr, "");
        toMagicModuleMetaRepoModel.write(endswithlivepostrollplaceholder, "");
        toMagicModuleMetaRepoModel.write(getids, "");
        toMagicModuleMetaRepoModel.write(getids2, "");
        toMagicModuleMetaRepoModel.write(addchild, "");
        toMagicModuleMetaRepoModel.write(getstreampositionusforcontent, "");
        toMagicModuleMetaRepoModel.write(getchannel, "");
        toMagicModuleMetaRepoModel.write(readtimestamp, "");
        toMagicModuleMetaRepoModel.write(assetDataSourceAssetDataSourceException, "");
        toMagicModuleMetaRepoModel.write(allocator, "");
        this.AudioAttributesImplApi21Parcelizer = getstreampositionusforcontent;
        this.AudioAttributesImplApi26Parcelizer = getchannel;
        this.RatingCompat = readtimestamp;
        this.MediaBrowserCompatItemReceiver = assetDataSourceAssetDataSourceException;
        this.MediaMetadataCompat = allocator;
        this.MediaBrowserCompatSearchResultReceiver = College.AudioAttributesCompatParcelizer(getAltContact.read(null).plus(setMbbsVerificationYear.RemoteActionCompatParcelizer()));
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/SsManifestParserElementParser$write;", "", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class write {
        private write() {
        }

        public /* synthetic */ write(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    @Override // kotlin.getChunkDurationUs
    public final void RemoteActionCompatParcelizer() {
        ((addChild) this.MediaBrowserCompatCustomActionResultReceiver).AudioAttributesCompatParcelizer();
        RatingCompat();
    }

    static final class AudioAttributesCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int AudioAttributesCompatParcelizer;
        private /* synthetic */ Object RemoteActionCompatParcelizer;

        /* JADX INFO: renamed from: o.SsManifestParserElementParser$AudioAttributesCompatParcelizer$2, reason: invalid class name */
        static final class AnonymousClass2 extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
            private int RemoteActionCompatParcelizer;
            private /* synthetic */ SsManifestParserElementParser write;

            @Override // kotlin.getMonthName
            public final Object invokeSuspend(Object obj) {
                Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
                int i = this.RemoteActionCompatParcelizer;
                if (i == 0) {
                    SdkPayloadData.IconCompatParcelizer(obj);
                    Object[] objArr = {this.write.MediaBrowserCompatItemReceiver};
                    int i2 = setMap.AudioAttributesCompatParcelizer.read();
                    NewNumberOtpResendRequest newNumberOtpResendRequest = (NewNumberOtpResendRequest) AssetDataSourceAssetDataSourceException.read(setMap.AudioAttributesCompatParcelizer.read(), setMap.AudioAttributesCompatParcelizer.read(), 1198211602, -1198211591, objArr, setMap.AudioAttributesCompatParcelizer.read(), i2);
                    final SsManifestParserElementParser ssManifestParserElementParser = this.write;
                    this.RemoteActionCompatParcelizer = 1;
                    if (newNumberOtpResendRequest.write(new getValidationToken() { // from class: o.SsManifestParserElementParser.AudioAttributesCompatParcelizer.2.4
                        @Override // kotlin.getValidationToken
                        public final /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                            return write((getIndividualAllocationLength) obj2);
                        }

                        private Object write(getIndividualAllocationLength getindividualallocationlength) {
                            if (!(getindividualallocationlength instanceof getIndividualAllocationLength.AudioAttributesCompatParcelizer)) {
                                throw new RenewEligibleCreator();
                            }
                            ssManifestParserElementParser.AudioAttributesCompatParcelizer();
                            return getShowPopup.INSTANCE;
                        }
                    }, this) == objIconCompatParcelizer) {
                        return objIconCompatParcelizer;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    SdkPayloadData.IconCompatParcelizer(obj);
                }
                return getShowPopup.INSTANCE;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(SsManifestParserElementParser ssManifestParserElementParser, SampleVideos<? super AnonymousClass2> sampleVideos) {
                super(2, sampleVideos);
                this.write = ssManifestParserElementParser;
            }

            @Override // kotlin.getMonthName
            public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
                return new AnonymousClass2(this.write, sampleVideos);
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // kotlin.MagicModuleSubmissionRequestBody
            /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
            public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
                return ((AnonymousClass2) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
            }
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            TopUserCompanion topUserCompanion = (TopUserCompanion) this.RemoteActionCompatParcelizer;
            getYear.IconCompatParcelizer();
            SdkPayloadData.IconCompatParcelizer(obj);
            C0201setMcqCount.IconCompatParcelizer(topUserCompanion, null, null, new AnonymousClass2(SsManifestParserElementParser.this, null), 3);
            C0201setMcqCount.IconCompatParcelizer(topUserCompanion, null, null, new AnonymousClass1(SsManifestParserElementParser.this, null), 3);
            return getShowPopup.INSTANCE;
        }

        /* JADX INFO: renamed from: o.SsManifestParserElementParser$AudioAttributesCompatParcelizer$1, reason: invalid class name */
        static final class AnonymousClass1 extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
            private int AudioAttributesCompatParcelizer;
            private /* synthetic */ SsManifestParserElementParser read;

            @Override // kotlin.getMonthName
            public final Object invokeSuspend(Object obj) {
                Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
                int i = this.AudioAttributesCompatParcelizer;
                if (i == 0) {
                    SdkPayloadData.IconCompatParcelizer(obj);
                    Object[] objArr = {this.read.MediaMetadataCompat};
                    isDark isdark = (isDark) Allocator.IconCompatParcelizer(setScheme.IconCompatParcelizer(), setScheme.IconCompatParcelizer(), 1850090459, setScheme.IconCompatParcelizer(), -1850090458, objArr, setScheme.IconCompatParcelizer());
                    final SsManifestParserElementParser ssManifestParserElementParser = this.read;
                    this.AudioAttributesCompatParcelizer = 1;
                    if (isdark.write(new getValidationToken() { // from class: o.SsManifestParserElementParser.AudioAttributesCompatParcelizer.1.3
                        @Override // kotlin.getValidationToken
                        public final /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                            return RemoteActionCompatParcelizer((allocate) obj2);
                        }

                        private Object RemoteActionCompatParcelizer(allocate allocateVar) {
                            if (allocateVar instanceof allocate.write) {
                                SsManifestParserElementParser ssManifestParserElementParser2 = ssManifestParserElementParser;
                                allocate.write writeVar = (allocate.write) allocateVar;
                                int iIconCompatParcelizer = setScheme.IconCompatParcelizer();
                                int iIconCompatParcelizer2 = setScheme.IconCompatParcelizer();
                                int iIconCompatParcelizer3 = setScheme.IconCompatParcelizer();
                                AllocatorAllocationNode allocatorAllocationNode = (AllocatorAllocationNode) allocate.write.RemoteActionCompatParcelizer(iIconCompatParcelizer2, setScheme.IconCompatParcelizer(), 918403904, iIconCompatParcelizer, new Object[]{writeVar}, iIconCompatParcelizer3, -918403904);
                                int iIconCompatParcelizer4 = setScheme.IconCompatParcelizer();
                                int iIconCompatParcelizer5 = setScheme.IconCompatParcelizer();
                                int iIconCompatParcelizer6 = setScheme.IconCompatParcelizer();
                                ssManifestParserElementParser2.AudioAttributesCompatParcelizer(allocatorAllocationNode, (Exception) allocate.write.RemoteActionCompatParcelizer(iIconCompatParcelizer5, setScheme.IconCompatParcelizer(), -1850110835, iIconCompatParcelizer4, new Object[]{writeVar}, iIconCompatParcelizer6, 1850110839));
                            } else if (allocateVar instanceof allocate.RemoteActionCompatParcelizer) {
                                int iWrite = HlsSampleStream.write();
                                int iWrite2 = HlsSampleStream.write();
                                int iWrite3 = HlsSampleStream.write();
                                if (((AllocatorAllocationNode) allocate.RemoteActionCompatParcelizer.read(HlsSampleStream.write(), -92781229, iWrite, 92781232, iWrite2, iWrite3, new Object[]{(allocate.RemoteActionCompatParcelizer) allocateVar})) == AllocatorAllocationNode.AudioAttributesImplBaseParcelizer) {
                                    ssManifestParserElementParser.AudioAttributesCompatParcelizer();
                                }
                            }
                            return getShowPopup.INSTANCE;
                        }
                    }, this) == objIconCompatParcelizer) {
                        return objIconCompatParcelizer;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    SdkPayloadData.IconCompatParcelizer(obj);
                }
                throw new PlanDetailsCreator();
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(SsManifestParserElementParser ssManifestParserElementParser, SampleVideos<? super AnonymousClass1> sampleVideos) {
                super(2, sampleVideos);
                this.read = ssManifestParserElementParser;
            }

            @Override // kotlin.getMonthName
            public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
                return new AnonymousClass1(this.read, sampleVideos);
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // kotlin.MagicModuleSubmissionRequestBody
            /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
            public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
                return ((AnonymousClass1) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
            }
        }

        AudioAttributesCompatParcelizer(SampleVideos<? super AudioAttributesCompatParcelizer> sampleVideos) {
            super(2, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = SsManifestParserElementParser.this.new AudioAttributesCompatParcelizer(sampleVideos);
            audioAttributesCompatParcelizer.RemoteActionCompatParcelizer = obj;
            return audioAttributesCompatParcelizer;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AudioAttributesCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void RatingCompat() {
        C0201setMcqCount.IconCompatParcelizer(this.MediaBrowserCompatSearchResultReceiver, null, null, new AudioAttributesCompatParcelizer(null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void AudioAttributesCompatParcelizer(AllocatorAllocationNode allocatorAllocationNode, Exception exc) {
        String strName = allocatorAllocationNode != null ? allocatorAllocationNode.name() : null;
        String message = exc != null ? exc.getMessage() : null;
        StringBuilder sb = new StringBuilder("Sync failed — task: ");
        sb.append(strName);
        sb.append(", cause: ");
        sb.append(message);
        buildResolutionString.IconCompatParcelizer("SyncLogger", sb.toString());
        if (this.AudioAttributesImplBaseParcelizer) {
            return;
        }
        if ((allocatorAllocationNode == null || !allocatorAllocationNode.IconCompatParcelizer()) && (allocatorAllocationNode == null || !allocatorAllocationNode.write())) {
            return;
        }
        ((addChild) this.MediaBrowserCompatCustomActionResultReceiver).AudioAttributesCompatParcelizer(Integer.valueOf(R.string.error_sync_failed_title), R.string.error_sync_failed_subtitle);
        this.AudioAttributesImplBaseParcelizer = true;
    }

    static final class IconCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int read;

        static final class write extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super Boolean>, Object> {
            private /* synthetic */ SsManifestParserElementParser AudioAttributesCompatParcelizer;
            private int read;

            @Override // kotlin.getMonthName
            public final Object invokeSuspend(Object obj) {
                getYear.IconCompatParcelizer();
                SdkPayloadData.IconCompatParcelizer(obj);
                int iOnPrepareFromUri = this.AudioAttributesCompatParcelizer.getAudioAttributesImplApi21Parcelizer().onPrepareFromUri();
                boolean zAudioAttributesCompatParcelizer = this.AudioAttributesCompatParcelizer.getAudioAttributesImplApi21Parcelizer().AudioAttributesCompatParcelizer(iOnPrepareFromUri);
                StringBuilder sb = new StringBuilder("checkFirstSyncDone | edition=");
                sb.append(iOnPrepareFromUri);
                sb.append(" isFirstSyncComplete=");
                sb.append(zAudioAttributesCompatParcelizer);
                buildResolutionString.IconCompatParcelizer("SyncLogger", sb.toString());
                return QBankStatsResponse.AudioAttributesCompatParcelizer(zAudioAttributesCompatParcelizer);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            write(SsManifestParserElementParser ssManifestParserElementParser, SampleVideos<? super write> sampleVideos) {
                super(2, sampleVideos);
                this.AudioAttributesCompatParcelizer = ssManifestParserElementParser;
            }

            @Override // kotlin.getMonthName
            public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
                return new write(this.AudioAttributesCompatParcelizer, sampleVideos);
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // kotlin.MagicModuleSubmissionRequestBody
            /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
            public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super Boolean> sampleVideos) {
                return ((write) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
            }
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.read;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.read = 1;
                obj = setModifiedEndTimestampMs.RemoteActionCompatParcelizer(setMbbsVerificationYear.write(), new write(SsManifestParserElementParser.this, null), this);
                if (obj == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            if (((Boolean) obj).booleanValue()) {
                buildResolutionString.IconCompatParcelizer("SyncLogger", "checkFirstSyncDone | navigating to home");
                ((addChild) SsManifestParserElementParser.this.MediaBrowserCompatCustomActionResultReceiver).read();
            } else if (!SsManifestParserElementParser.this.getAudioAttributesImplApi26Parcelizer().aC_() && !SsManifestParserElementParser.this.AudioAttributesImplBaseParcelizer) {
                ((addChild) SsManifestParserElementParser.this.MediaBrowserCompatCustomActionResultReceiver).AudioAttributesCompatParcelizer(null, R.string.error_no_internet_sync_lessons);
                SsManifestParserElementParser.this.AudioAttributesImplBaseParcelizer = true;
            }
            return getShowPopup.INSTANCE;
        }

        IconCompatParcelizer(SampleVideos<? super IconCompatParcelizer> sampleVideos) {
            super(2, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return SsManifestParserElementParser.this.new IconCompatParcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((IconCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    @Override // kotlin.getChunkDurationUs
    public final void AudioAttributesCompatParcelizer() {
        C0201setMcqCount.IconCompatParcelizer(this.MediaBrowserCompatSearchResultReceiver, null, null, new IconCompatParcelizer(null), 3);
    }

    @Override // kotlin.getCurrentEventTimeUs, kotlin.getExtendedEsFrChar
    public final void write(PresenterBundle presenterBundle) {
        super.write(presenterBundle);
        this.AudioAttributesImplBaseParcelizer = presenterBundle != null ? presenterBundle.getBoolean("retyr_dlg_shown") : false;
    }

    @Override // kotlin.getCurrentEventTimeUs, kotlin.getExtendedEsFrChar
    public final PresenterBundle AudioAttributesImplBaseParcelizer() {
        PresenterBundle presenterBundleAudioAttributesImplBaseParcelizer = super.AudioAttributesImplBaseParcelizer();
        presenterBundleAudioAttributesImplBaseParcelizer.put("retyr_dlg_shown", this.AudioAttributesImplBaseParcelizer);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(presenterBundleAudioAttributesImplBaseParcelizer, "");
        return presenterBundleAudioAttributesImplBaseParcelizer;
    }

    public static final class RemoteActionCompatParcelizer implements getCreatedOnDateMs<Boolean> {
        RemoteActionCompatParcelizer() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Boolean invoke() {
            boolean z = false;
            if (!SsManifestParserElementParser.this.getAudioAttributesImplApi26Parcelizer().aC_()) {
                ((addChild) SsManifestParserElementParser.this.MediaBrowserCompatCustomActionResultReceiver).AudioAttributesCompatParcelizer(SsManifestParserElementParser.AudioAttributesCompatParcelizer(SsManifestParserElementParser.this));
            } else {
                BandwidthMeterEventListenerEventDispatcherHandlerAndListener.Companion companion = BandwidthMeterEventListenerEventDispatcherHandlerAndListener.INSTANCE;
                BandwidthMeterEventListenerEventDispatcherHandlerAndListener.Companion.RemoteActionCompatParcelizer();
                SsManifestParserElementParser.this.AudioAttributesImplBaseParcelizer = false;
                ((addChild) SsManifestParserElementParser.this.MediaBrowserCompatCustomActionResultReceiver).write();
                SsManifestParserElementParser.this.AudioAttributesCompatParcelizer();
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    @Override // kotlin.getChunkDurationUs
    public final getCreatedOnDateMs<Boolean> IconCompatParcelizer() {
        return new RemoteActionCompatParcelizer();
    }

    @Override // kotlin.getChunkDurationUs
    public final void read() {
        if (this.AudioAttributesImplApi21Parcelizer.onCustomAction()) {
            AudioAttributesCompatParcelizer();
        }
    }

    @Override // kotlin.getChunkDurationUs
    public final Object AudioAttributesCompatParcelizer(SampleVideos<? super getShowPopup> sampleVideos) {
        setBandwidthStatistic setbandwidthstatistic = setBandwidthStatistic.INSTANCE;
        Object objIconCompatParcelizer = setBandwidthStatistic.IconCompatParcelizer(this.RatingCompat, this.AudioAttributesImplApi21Parcelizer.onRemoveQueueItem(), this.AudioAttributesImplApi21Parcelizer.onPrepareFromUri(), sampleVideos);
        return objIconCompatParcelizer == getYear.IconCompatParcelizer() ? objIconCompatParcelizer : getShowPopup.INSTANCE;
    }

    @Override // kotlin.getCurrentEventTimeUs, kotlin.getExtendedEsFrChar
    public final void AudioAttributesImplApi26Parcelizer() {
        super.AudioAttributesImplApi26Parcelizer();
        College.AudioAttributesCompatParcelizer(this.MediaBrowserCompatSearchResultReceiver, null);
    }
}
