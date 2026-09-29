package com.marrow2.ui.settings.landing;

import com.marrow.data.models.common.ApplicationData;
import com.marrow.data.models.common.CourseConfigV2;
import com.marrow2.ui.settings.landing.ProfileLandingViewModel;
import kotlin.CmcdHeadersFactoryCmcdObjectBuilder;
import kotlin.CmcdHeadersFactoryCmcdStatus;
import kotlin.DataSourceBitmapLoaderExternalSyntheticLambda0;
import kotlin.IntermediateLoginResponseBody;
import kotlin.LogLogLevel;
import kotlin.MagicModuleSubmissionRequestBody;
import kotlin.Metadata;
import kotlin.POJOPropertyBuilderWithMember;
import kotlin.QBankStatsResponse;
import kotlin.RenewEligibleCreator;
import kotlin.SampleVideos;
import kotlin.SdkPayloadData;
import kotlin.StreetViewPanoramaFragment;
import kotlin.StreetViewPanoramaFragmentzzb;
import kotlin.StreetViewPanoramaOptions;
import kotlin.TypeResolutionContextBasic;
import kotlin.VerifyNewNumberRequest;
import kotlin.beginSection;
import kotlin.getAnswerMap;
import kotlin.getDisplaySizeV17;
import kotlin.getLocaleLanguageTagV21;
import kotlin.getMagicModuleStats;
import kotlin.getMaxPendingFramesCountForMediaCodecDecoders;
import kotlin.getOrderDetails;
import kotlin.getResolutionSize;
import kotlin.getShowPopup;
import kotlin.getStreetViewPanoramaAsync;
import kotlin.getYear;
import kotlin.isDark;
import kotlin.isPassive;
import kotlin.isSeekPending;
import kotlin.lambdaloadBitmap2comgoogleandroidexoplayer2upstreamDataSourceBitmapLoader;
import kotlin.setFastestInterval;
import kotlin.setSdkPayload;
import kotlin.setStartTime;
import kotlin.setStreamingFormat;
import kotlin.setUpdatedStatus;
import kotlin.toMagicModuleMetaRepoModel;
import kotlin.updateLoadingFinished;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u000e\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(J\b\u0010)\u001a\u00020&H\u0002J\b\u0010*\u001a\u00020&H\u0002J\b\u0010+\u001a\u00020&H\u0002J\u0010\u0010,\u001a\u00020&2\u0006\u0010-\u001a\u00020\u0018H\u0002J\b\u0010.\u001a\u00020&H\u0002J\b\u0010/\u001a\u00020&H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u000e\u001a\f\u0012\b\u0012\u00060\u0010j\u0002`\u00110\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0012\u001a\f\u0012\b\u0012\u00060\u0010j\u0002`\u00110\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u001a¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001bR\u0014\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001a¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001bR\u001a\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0!0\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0!0\u001a¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001b¨\u00060"}, d2 = {"Lcom/marrow2/ui/settings/landing/ProfileLandingViewModel;", "Landroidx/lifecycle/ViewModel;", "courseConfigUseCase", "Lcom/marrow2/domain/courseConfig/CourseConfigUseCase;", "settingsUseCase", "Lcom/marrow2/domain/settings/SettingsUseCase;", "userUseCase", "Lcom/marrow2/domain/user/UserUseCase;", "appData", "Lcom/marrow/data/models/common/ApplicationData;", "analytics", "Lcom/marrow/dranalytics/base/AnalyticPublisher;", "<init>", "(Lcom/marrow2/domain/courseConfig/CourseConfigUseCase;Lcom/marrow2/domain/settings/SettingsUseCase;Lcom/marrow2/domain/user/UserUseCase;Lcom/marrow/data/models/common/ApplicationData;Lcom/marrow/dranalytics/base/AnalyticPublisher;)V", "_settingsState", "Lcom/marrow2/core/utils/MarrowFlow;", "Lcom/marrow/data/models/common/CourseConfigV2$SettingsItems;", "Lcom/marrow2/domain/courseConfig/model/MainSettingsUCModel;", "settingsState", "Lkotlinx/coroutines/flow/SharedFlow;", "getSettingsState", "()Lkotlinx/coroutines/flow/SharedFlow;", "_isLoading", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "isLoading", "Lkotlinx/coroutines/flow/StateFlow;", "()Lkotlinx/coroutines/flow/StateFlow;", "_profileUiNavigationEvents", "Lcom/marrow2/ui/settings/landing/model/ProfileLandingNavigationEvents;", "profileUiNavigationEvents", "getProfileUiNavigationEvents", "_profileData", "Lcom/marrow2/core/utils/VMState;", "Lcom/marrow2/ui/settings/landing/model/UserVMModel;", "profileData", "getProfileData", "notifyEvent", "", "event", "Lcom/marrow2/ui/settings/landing/model/ProfileLandingUiEvents;", "handleKycClick", "handleLogoutEvent", "handleChangePasswordEvent", "handleVibrationChangeEvent", "isVibration", "getUserData", "loadData", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ProfileLandingViewModel extends POJOPropertyBuilderWithMember {
    private final getResolutionSize<getStreetViewPanoramaAsync> AudioAttributesCompatParcelizer;
    private final ApplicationData AudioAttributesImplApi21Parcelizer;
    private final LogLogLevel AudioAttributesImplApi26Parcelizer;
    private final setUpdatedStatus<Boolean> AudioAttributesImplBaseParcelizer;
    private final isSeekPending IconCompatParcelizer;
    private final setUpdatedStatus<DataSourceBitmapLoaderExternalSyntheticLambda0<StreetViewPanoramaFragment>> MediaBrowserCompatCustomActionResultReceiver;
    private final setUpdatedStatus<getStreetViewPanoramaAsync> MediaBrowserCompatItemReceiver;
    private final isDark<CourseConfigV2.SettingsItems> MediaBrowserCompatMediaItem;
    private final getDisplaySizeV17 MediaBrowserCompatSearchResultReceiver;
    private final beginSection MediaDescriptionCompat;
    private final getResolutionSize<Boolean> RemoteActionCompatParcelizer;
    private final getResolutionSize<DataSourceBitmapLoaderExternalSyntheticLambda0<StreetViewPanoramaFragment>> read;
    private final CmcdHeadersFactoryCmcdStatus<CourseConfigV2.SettingsItems> write;

    @setSdkPayload
    public ProfileLandingViewModel(LogLogLevel logLogLevel, beginSection beginsection, getDisplaySizeV17 getdisplaysizev17, ApplicationData applicationData, isSeekPending isseekpending) {
        toMagicModuleMetaRepoModel.write(logLogLevel, "");
        toMagicModuleMetaRepoModel.write(beginsection, "");
        toMagicModuleMetaRepoModel.write(getdisplaysizev17, "");
        toMagicModuleMetaRepoModel.write(applicationData, "");
        toMagicModuleMetaRepoModel.write(isseekpending, "");
        this.AudioAttributesImplApi26Parcelizer = logLogLevel;
        this.MediaDescriptionCompat = beginsection;
        this.MediaBrowserCompatSearchResultReceiver = getdisplaysizev17;
        this.AudioAttributesImplApi21Parcelizer = applicationData;
        this.IconCompatParcelizer = isseekpending;
        CmcdHeadersFactoryCmcdStatus<CourseConfigV2.SettingsItems> cmcdHeadersFactoryCmcdStatus = new CmcdHeadersFactoryCmcdStatus<>(new CourseConfigV2.SettingsItems(null, null, null, 7, null));
        this.write = cmcdHeadersFactoryCmcdStatus;
        this.MediaBrowserCompatMediaItem = cmcdHeadersFactoryCmcdStatus.AudioAttributesCompatParcelizer();
        getResolutionSize<Boolean> getresolutionsizeRemoteActionCompatParcelizer = setStartTime.RemoteActionCompatParcelizer(Boolean.FALSE);
        this.RemoteActionCompatParcelizer = getresolutionsizeRemoteActionCompatParcelizer;
        this.AudioAttributesImplBaseParcelizer = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer);
        getResolutionSize<getStreetViewPanoramaAsync> getresolutionsizeRemoteActionCompatParcelizer2 = setStartTime.RemoteActionCompatParcelizer(getStreetViewPanoramaAsync.read.INSTANCE);
        this.AudioAttributesCompatParcelizer = getresolutionsizeRemoteActionCompatParcelizer2;
        this.MediaBrowserCompatItemReceiver = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer2);
        getResolutionSize<DataSourceBitmapLoaderExternalSyntheticLambda0<StreetViewPanoramaFragment>> getresolutionsizeRemoteActionCompatParcelizer3 = setStartTime.RemoteActionCompatParcelizer(new setStreamingFormat(null, 1, null));
        this.read = getresolutionsizeRemoteActionCompatParcelizer3;
        this.MediaBrowserCompatCustomActionResultReceiver = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer3);
        RatingCompat();
    }

    public final isDark<CourseConfigV2.SettingsItems> read() {
        return this.MediaBrowserCompatMediaItem;
    }

    public final setUpdatedStatus<Boolean> AudioAttributesImplApi21Parcelizer() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    public final setUpdatedStatus<getStreetViewPanoramaAsync> IconCompatParcelizer() {
        return this.MediaBrowserCompatItemReceiver;
    }

    public final setUpdatedStatus<DataSourceBitmapLoaderExternalSyntheticLambda0<StreetViewPanoramaFragment>> AudioAttributesCompatParcelizer() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    public final void read(StreetViewPanoramaFragmentzzb streetViewPanoramaFragmentzzb) {
        toMagicModuleMetaRepoModel.write(streetViewPanoramaFragmentzzb, "");
        if (streetViewPanoramaFragmentzzb instanceof StreetViewPanoramaFragmentzzb.MediaBrowserCompatCustomActionResultReceiver) {
            IconCompatParcelizer(((StreetViewPanoramaFragmentzzb.MediaBrowserCompatCustomActionResultReceiver) streetViewPanoramaFragmentzzb).read());
        } else if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(streetViewPanoramaFragmentzzb, StreetViewPanoramaFragmentzzb.AudioAttributesCompatParcelizer.INSTANCE)) {
            AudioAttributesImplApi26Parcelizer();
        } else if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(streetViewPanoramaFragmentzzb, StreetViewPanoramaFragmentzzb.read.INSTANCE)) {
            AudioAttributesImplBaseParcelizer();
        } else if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(streetViewPanoramaFragmentzzb, StreetViewPanoramaFragmentzzb.IconCompatParcelizer.INSTANCE)) {
            MediaBrowserCompatCustomActionResultReceiver();
        } else if (streetViewPanoramaFragmentzzb instanceof StreetViewPanoramaFragmentzzb.write) {
            MediaBrowserCompatItemReceiver();
        } else if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(streetViewPanoramaFragmentzzb, StreetViewPanoramaFragmentzzb.RemoteActionCompatParcelizer.INSTANCE)) {
            this.AudioAttributesCompatParcelizer.write(getStreetViewPanoramaAsync.read.INSTANCE);
        } else if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(streetViewPanoramaFragmentzzb, StreetViewPanoramaFragmentzzb.AudioAttributesImplApi21Parcelizer.INSTANCE)) {
            this.AudioAttributesCompatParcelizer.write(getStreetViewPanoramaAsync.IconCompatParcelizer.INSTANCE);
        } else {
            if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(streetViewPanoramaFragmentzzb, StreetViewPanoramaFragmentzzb.AudioAttributesImplBaseParcelizer.INSTANCE)) {
                throw new RenewEligibleCreator();
            }
            isSeekPending isseekpending = this.IconCompatParcelizer;
            setFastestInterval setfastestinterval = setFastestInterval.INSTANCE;
            isseekpending.write(setFastestInterval.AudioAttributesCompatParcelizer(setFastestInterval.write.AudioAttributesCompatParcelizer), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(updateLoadingFinished.IconCompatParcelizer));
        }
        this.AudioAttributesCompatParcelizer.write(getStreetViewPanoramaAsync.read.INSTANCE);
    }

    private final void MediaBrowserCompatCustomActionResultReceiver() {
        int remoteActionCompatParcelizer = this.read.IconCompatParcelizer().read().getRemoteActionCompatParcelizer();
        if (getOrderDetails.write(new int[]{2, 1, 0, 6, 7}, remoteActionCompatParcelizer)) {
            this.AudioAttributesCompatParcelizer.write(new getStreetViewPanoramaAsync.write(remoteActionCompatParcelizer));
        } else if (remoteActionCompatParcelizer == 3) {
            this.AudioAttributesCompatParcelizer.write(getStreetViewPanoramaAsync.AudioAttributesCompatParcelizer.INSTANCE);
        }
    }

    private final void AudioAttributesImplBaseParcelizer() {
        this.AudioAttributesImplApi21Parcelizer.logout(1, null);
        this.AudioAttributesCompatParcelizer.write(getStreetViewPanoramaAsync.RemoteActionCompatParcelizer.INSTANCE);
    }

    private final void AudioAttributesImplApi26Parcelizer() {
        this.RemoteActionCompatParcelizer.write(Boolean.TRUE);
        StreetViewPanoramaFragment streetViewPanoramaFragmentRemoteActionCompatParcelizer = this.read.IconCompatParcelizer().RemoteActionCompatParcelizer();
        if (streetViewPanoramaFragmentRemoteActionCompatParcelizer != null) {
            CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new write(streetViewPanoramaFragmentRemoteActionCompatParcelizer, null), new MagicModuleSubmissionRequestBody() { // from class: o.StreetViewPanoramaOnStreetViewPanoramaClickListener
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return ProfileLandingViewModel.IconCompatParcelizer(this.RemoteActionCompatParcelizer, (String) obj2);
                }
            });
        }
    }

    static final class write extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private /* synthetic */ StreetViewPanoramaFragment IconCompatParcelizer;
        private int write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.write;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                isSeekPending isseekpending = ProfileLandingViewModel.this.IconCompatParcelizer;
                isPassive ispassive = isPassive.INSTANCE;
                isseekpending.write(isPassive.write(), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(updateLoadingFinished.IconCompatParcelizer));
                this.write = 1;
                obj = ProfileLandingViewModel.this.MediaBrowserCompatSearchResultReceiver.write(new getMaxPendingFramesCountForMediaCodecDecoders(this.IconCompatParcelizer.getAudioAttributesCompatParcelizer(), this.IconCompatParcelizer.getAudioAttributesImplApi21Parcelizer()), this);
                if (obj == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            ProfileLandingViewModel.this.RemoteActionCompatParcelizer.write(QBankStatsResponse.AudioAttributesCompatParcelizer(false));
            ProfileLandingViewModel.this.AudioAttributesCompatParcelizer.write(new getStreetViewPanoramaAsync.AudioAttributesImplBaseParcelizer((String) obj));
            return getShowPopup.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        write(StreetViewPanoramaFragment streetViewPanoramaFragment, SampleVideos<? super write> sampleVideos) {
            super(1, sampleVideos);
            this.IconCompatParcelizer = streetViewPanoramaFragment;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return ProfileLandingViewModel.this.new write(this.IconCompatParcelizer, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((write) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup IconCompatParcelizer(ProfileLandingViewModel profileLandingViewModel, String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        profileLandingViewModel.RemoteActionCompatParcelizer.write(Boolean.FALSE);
        profileLandingViewModel.AudioAttributesCompatParcelizer.write(new getStreetViewPanoramaAsync.AudioAttributesImplApi21Parcelizer(str));
        profileLandingViewModel.AudioAttributesCompatParcelizer.write(getStreetViewPanoramaAsync.read.INSTANCE);
        return getShowPopup.INSTANCE;
    }

    static final class read extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private /* synthetic */ boolean AudioAttributesCompatParcelizer;
        private int write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.write;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                isSeekPending isseekpending = ProfileLandingViewModel.this.IconCompatParcelizer;
                isPassive ispassive = isPassive.INSTANCE;
                isseekpending.write(isPassive.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(updateLoadingFinished.IconCompatParcelizer));
                this.write = 1;
                if (ProfileLandingViewModel.this.MediaDescriptionCompat.write(this.AudioAttributesCompatParcelizer, this) == objIconCompatParcelizer) {
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
        read(boolean z, SampleVideos<? super read> sampleVideos) {
            super(1, sampleVideos);
            this.AudioAttributesCompatParcelizer = z;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return ProfileLandingViewModel.this.new read(this.AudioAttributesCompatParcelizer, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((read) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void IconCompatParcelizer(boolean z) {
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new read(z, null), new MagicModuleSubmissionRequestBody() { // from class: o.StreetViewPanoramaOnStreetViewPanoramaLongClickListener
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return ProfileLandingViewModel.AudioAttributesCompatParcelizer(this.write, (String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesCompatParcelizer(ProfileLandingViewModel profileLandingViewModel, String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        CmcdHeadersFactoryCmcdStatus<CourseConfigV2.SettingsItems> cmcdHeadersFactoryCmcdStatus = profileLandingViewModel.write;
        return getShowPopup.INSTANCE;
    }

    static final class AudioAttributesCompatParcelizer extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private Object AudioAttributesCompatParcelizer;
        private int IconCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            getResolutionSize getresolutionsize;
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.IconCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                lambdaloadBitmap2comgoogleandroidexoplayer2upstreamDataSourceBitmapLoader.RemoteActionCompatParcelizer(ProfileLandingViewModel.this.read, null);
                getResolutionSize getresolutionsize2 = ProfileLandingViewModel.this.read;
                this.AudioAttributesCompatParcelizer = getresolutionsize2;
                this.IconCompatParcelizer = 1;
                Object objOnPlay = ProfileLandingViewModel.this.MediaBrowserCompatSearchResultReceiver.onPlay(this);
                if (objOnPlay == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
                obj = objOnPlay;
                getresolutionsize = getresolutionsize2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                getresolutionsize = (getResolutionSize) this.AudioAttributesCompatParcelizer;
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            lambdaloadBitmap2comgoogleandroidexoplayer2upstreamDataSourceBitmapLoader.IconCompatParcelizer(getresolutionsize, StreetViewPanoramaOptions.read((getLocaleLanguageTagV21) obj));
            return getShowPopup.INSTANCE;
        }

        AudioAttributesCompatParcelizer(SampleVideos<? super AudioAttributesCompatParcelizer> sampleVideos) {
            super(1, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return ProfileLandingViewModel.this.new AudioAttributesCompatParcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AudioAttributesCompatParcelizer) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void MediaBrowserCompatItemReceiver() {
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new AudioAttributesCompatParcelizer(null), new MagicModuleSubmissionRequestBody() { // from class: o.setUserNavigationEnabled
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return ProfileLandingViewModel.RemoteActionCompatParcelizer(this.write, ((Integer) obj).intValue(), (String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup RemoteActionCompatParcelizer(ProfileLandingViewModel profileLandingViewModel, int i, String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        lambdaloadBitmap2comgoogleandroidexoplayer2upstreamDataSourceBitmapLoader.read(profileLandingViewModel.read, i, str, null);
        profileLandingViewModel.AudioAttributesCompatParcelizer.write(new getStreetViewPanoramaAsync.AudioAttributesImplApi21Parcelizer(str));
        profileLandingViewModel.AudioAttributesCompatParcelizer.write(getStreetViewPanoramaAsync.read.INSTANCE);
        return getShowPopup.INSTANCE;
    }

    static final class RemoteActionCompatParcelizer extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private Object AudioAttributesCompatParcelizer;
        private int write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            CmcdHeadersFactoryCmcdStatus cmcdHeadersFactoryCmcdStatus;
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.write;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                CmcdHeadersFactoryCmcdStatus cmcdHeadersFactoryCmcdStatus2 = ProfileLandingViewModel.this.write;
                this.AudioAttributesCompatParcelizer = cmcdHeadersFactoryCmcdStatus2;
                this.write = 1;
                Object objWrite = ProfileLandingViewModel.this.AudioAttributesImplApi26Parcelizer.write(this);
                if (objWrite == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
                cmcdHeadersFactoryCmcdStatus = cmcdHeadersFactoryCmcdStatus2;
                obj = objWrite;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                cmcdHeadersFactoryCmcdStatus = (CmcdHeadersFactoryCmcdStatus) this.AudioAttributesCompatParcelizer;
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            cmcdHeadersFactoryCmcdStatus.IconCompatParcelizer(((CourseConfigV2) obj).getSettingsItems());
            ProfileLandingViewModel.this.MediaBrowserCompatItemReceiver();
            return getShowPopup.INSTANCE;
        }

        RemoteActionCompatParcelizer(SampleVideos<? super RemoteActionCompatParcelizer> sampleVideos) {
            super(1, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return ProfileLandingViewModel.this.new RemoteActionCompatParcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((RemoteActionCompatParcelizer) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void RatingCompat() {
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new RemoteActionCompatParcelizer(null), new MagicModuleSubmissionRequestBody() { // from class: o.StreetViewPanoramaOnStreetViewPanoramaChangeListener
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return ProfileLandingViewModel.AudioAttributesImplApi21Parcelizer(this.AudioAttributesCompatParcelizer, (String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesImplApi21Parcelizer(ProfileLandingViewModel profileLandingViewModel, String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        profileLandingViewModel.AudioAttributesCompatParcelizer.write(new getStreetViewPanoramaAsync.AudioAttributesImplApi21Parcelizer(str));
        profileLandingViewModel.AudioAttributesCompatParcelizer.write(getStreetViewPanoramaAsync.read.INSTANCE);
        return getShowPopup.INSTANCE;
    }
}
