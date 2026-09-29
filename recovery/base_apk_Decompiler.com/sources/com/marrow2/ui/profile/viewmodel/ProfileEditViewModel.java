package com.marrow2.ui.profile.viewmodel;

import android.graphics.Bitmap;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import com.marrow.data.models.common.ApplicationData;
import com.marrow2.ui.profile.viewmodel.ProfileEditViewModel;
import kotlin.BlockingViewModel_HiltModulesKeyModule;
import kotlin.CmcdHeadersFactoryCmcdObjectBuilder;
import kotlin.CmcdHeadersFactoryCmcdStatus;
import kotlin.MagicModuleSubmissionRequestBody;
import kotlin.Metadata;
import kotlin.POJOPropertyBuilderWithMember;
import kotlin.QBankStatsResponse;
import kotlin.RenewEligibleCreator;
import kotlin.SampleVideos;
import kotlin.SdkPayloadData;
import kotlin.TestGroupLSModel;
import kotlin.TypeResolutionContextBasic;
import kotlin.VerifyNewNumberRequest;
import kotlin.getAnswerMap;
import kotlin.getAttestationConveyancePreference;
import kotlin.getDisplaySizeV17;
import kotlin.getLocaleLanguageTagV21;
import kotlin.getMagicModuleStats;
import kotlin.getResolutionSize;
import kotlin.getShowPopup;
import kotlin.getYear;
import kotlin.isDark;
import kotlin.newYearNameItem;
import kotlin.setAuthenticationExtensionsClientOutputs;
import kotlin.setAuthenticatorAttachment;
import kotlin.setResponse;
import kotlin.setSdkPayload;
import kotlin.setStartTime;
import kotlin.setUpdatedStatus;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0015R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001a8\u0007¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0016\u0010\u001dR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010 R \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u001f0!8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\"\u001a\u0004\b\u0014\u0010#R\u0016\u0010'\u001a\u00020$8\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b%\u0010&R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020(0\u00178\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0019R \u0010\u001b\u001a\b\u0012\u0004\u0012\u00020(0\u001a8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010\u001c\u001a\u0004\b\n\u0010\u001d"}, d2 = {"Lcom/marrow2/ui/profile/viewmodel/ProfileEditViewModel;", "Lo/POJOPropertyBuilderWithMember;", "Lo/getDisplaySizeV17;", "p0", "Lcom/marrow/data/models/common/ApplicationData;", "p1", "<init>", "(Lo/getDisplaySizeV17;Lcom/marrow/data/models/common/ApplicationData;)V", "Lo/setAuthenticationExtensionsClientOutputs;", "", "AudioAttributesCompatParcelizer", "(Lo/setAuthenticationExtensionsClientOutputs;)V", "AudioAttributesImplApi26Parcelizer", "()V", "", "", "write", "(Ljava/lang/String;)Z", "MediaBrowserCompatCustomActionResultReceiver", "Lo/getDisplaySizeV17;", "read", "Lcom/marrow/data/models/common/ApplicationData;", "IconCompatParcelizer", "Lo/getResolutionSize;", "RemoteActionCompatParcelizer", "Lo/getResolutionSize;", "Lo/setUpdatedStatus;", "AudioAttributesImplBaseParcelizer", "Lo/setUpdatedStatus;", "()Lo/setUpdatedStatus;", "Lo/CmcdHeadersFactoryCmcdStatus;", "Lo/getAttestationConveyancePreference;", "Lo/CmcdHeadersFactoryCmcdStatus;", "Lo/isDark;", "Lo/isDark;", "()Lo/isDark;", "Lo/getLocaleLanguageTagV21;", "MediaBrowserCompatItemReceiver", "Lo/getLocaleLanguageTagV21;", "AudioAttributesImplApi21Parcelizer", ""}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ProfileEditViewModel extends POJOPropertyBuilderWithMember {

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private final setUpdatedStatus<Integer> AudioAttributesImplBaseParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private final isDark<getAttestationConveyancePreference> MediaBrowserCompatCustomActionResultReceiver;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private final setUpdatedStatus<Boolean> AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final CmcdHeadersFactoryCmcdStatus<getAttestationConveyancePreference> write;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private final getDisplaySizeV17 read;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private getLocaleLanguageTagV21 AudioAttributesImplApi21Parcelizer;
    private final getResolutionSize<Boolean> RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final getResolutionSize<Integer> AudioAttributesImplApi26Parcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final ApplicationData IconCompatParcelizer;

    @setSdkPayload
    public ProfileEditViewModel(getDisplaySizeV17 getdisplaysizev17, ApplicationData applicationData) {
        toMagicModuleMetaRepoModel.write(getdisplaysizev17, "");
        toMagicModuleMetaRepoModel.write(applicationData, "");
        this.read = getdisplaysizev17;
        this.IconCompatParcelizer = applicationData;
        getResolutionSize<Boolean> getresolutionsizeRemoteActionCompatParcelizer = setStartTime.RemoteActionCompatParcelizer(Boolean.FALSE);
        this.RemoteActionCompatParcelizer = getresolutionsizeRemoteActionCompatParcelizer;
        this.AudioAttributesCompatParcelizer = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer);
        CmcdHeadersFactoryCmcdStatus<getAttestationConveyancePreference> cmcdHeadersFactoryCmcdStatus = new CmcdHeadersFactoryCmcdStatus<>(getAttestationConveyancePreference.RemoteActionCompatParcelizer.INSTANCE);
        this.write = cmcdHeadersFactoryCmcdStatus;
        this.MediaBrowserCompatCustomActionResultReceiver = cmcdHeadersFactoryCmcdStatus.AudioAttributesCompatParcelizer();
        getResolutionSize<Integer> getresolutionsizeRemoteActionCompatParcelizer2 = setStartTime.RemoteActionCompatParcelizer(1);
        this.AudioAttributesImplApi26Parcelizer = getresolutionsizeRemoteActionCompatParcelizer2;
        this.AudioAttributesImplBaseParcelizer = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer2);
        getresolutionsizeRemoteActionCompatParcelizer.write(Boolean.TRUE);
        AudioAttributesImplApi26Parcelizer();
    }

    public final setUpdatedStatus<Boolean> IconCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final isDark<getAttestationConveyancePreference> read() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    public final setUpdatedStatus<Integer> AudioAttributesCompatParcelizer() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    public final void AudioAttributesCompatParcelizer(setAuthenticationExtensionsClientOutputs p0) {
        getLocaleLanguageTagV21 getlocalelanguagetagv21;
        toMagicModuleMetaRepoModel.write(p0, "");
        getLocaleLanguageTagV21 getlocalelanguagetagv212 = null;
        if (p0 instanceof setAuthenticationExtensionsClientOutputs.read) {
            setAuthenticationExtensionsClientOutputs.read readVar = (setAuthenticationExtensionsClientOutputs.read) p0;
            if (!write(readVar.write().getRead())) {
                this.write.IconCompatParcelizer(getAttestationConveyancePreference.AudioAttributesImplApi21Parcelizer.INSTANCE);
                return;
            }
            this.RemoteActionCompatParcelizer.write(Boolean.TRUE);
            getLocaleLanguageTagV21 getlocalelanguagetagv213 = this.AudioAttributesImplApi21Parcelizer;
            if (getlocalelanguagetagv213 == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                getlocalelanguagetagv21 = null;
            } else {
                getlocalelanguagetagv21 = getlocalelanguagetagv213;
            }
            this.AudioAttributesImplApi21Parcelizer = getLocaleLanguageTagV21.write((536870639 & 1) != 0 ? getlocalelanguagetagv21.onMediaButtonEvent : null, (536870639 & 2) != 0 ? getlocalelanguagetagv21.AudioAttributesImplBaseParcelizer : null, (536870639 & 4) != 0 ? getlocalelanguagetagv21.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver : null, (536870639 & 8) != 0 ? getlocalelanguagetagv21.onPause : null, (536870639 & 16) != 0 ? getlocalelanguagetagv21.onPlay : readVar.write().getWrite(), (536870639 & 32) != 0 ? getlocalelanguagetagv21.onCustomAction : 0, (536870639 & 64) != 0 ? getlocalelanguagetagv21.onCommand : 0, (536870639 & 128) != 0 ? getlocalelanguagetagv21.IconCompatParcelizer : 0L, (536870639 & 256) != 0 ? getlocalelanguagetagv21.onPrepareFromSearch : readVar.write().getRead(), (536870639 & 512) != 0 ? getlocalelanguagetagv21.read : null, (536870639 & 1024) != 0 ? getlocalelanguagetagv21.AudioAttributesImplApi21Parcelizer : null, (536870639 & 2048) != 0 ? getlocalelanguagetagv21.AudioAttributesImplApi26Parcelizer : null, (536870639 & 4096) != 0 ? getlocalelanguagetagv21.write : 0, (536870639 & 8192) != 0 ? getlocalelanguagetagv21.MediaBrowserCompatItemReceiver : 0, (536870639 & 16384) != 0 ? getlocalelanguagetagv21.onPrepareFromMediaId : null, (536870639 & 32768) != 0 ? getlocalelanguagetagv21.MediaMetadataCompat : false, (536870639 & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0 ? getlocalelanguagetagv21.MediaDescriptionCompat : false, (536870639 & 131072) != 0 ? getlocalelanguagetagv21.MediaBrowserCompatCustomActionResultReceiver : false, (536870639 & 262144) != 0 ? getlocalelanguagetagv21.RatingCompat : false, (536870639 & 524288) != 0 ? getlocalelanguagetagv21.onFastForward : null, (536870639 & ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? getlocalelanguagetagv21.RemoteActionCompatParcelizer : null, (536870639 & 2097152) != 0 ? getlocalelanguagetagv21.AudioAttributesCompatParcelizer : null, (536870639 & 4194304) != 0 ? getlocalelanguagetagv21.onPlayFromSearch : null, (536870639 & 8388608) != 0 ? getlocalelanguagetagv21.onPrepare : 0, (536870639 & BlockingViewModel_HiltModulesKeyModule.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? getlocalelanguagetagv21.handleMediaPlayPauseIfPendingOnHandler : 0, (536870639 & 33554432) != 0 ? getlocalelanguagetagv21.onPlayFromUri : 0L, (536870639 & 67108864) != 0 ? getlocalelanguagetagv21.onPlayFromMediaId : null, (134217728 & 536870639) != 0 ? getlocalelanguagetagv21.MediaBrowserCompatMediaItem : false, (536870639 & 268435456) != 0 ? getlocalelanguagetagv21.onAddQueueItem : false);
            CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new write(p0, null), new MagicModuleSubmissionRequestBody() { // from class: o.setRawId
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return ProfileEditViewModel.read(this.IconCompatParcelizer, (String) obj2);
                }
            });
            return;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, setAuthenticationExtensionsClientOutputs.write.INSTANCE)) {
            this.write.IconCompatParcelizer(getAttestationConveyancePreference.read.INSTANCE);
            return;
        }
        if (p0 instanceof setAuthenticationExtensionsClientOutputs.IconCompatParcelizer) {
            getLocaleLanguageTagV21 getlocalelanguagetagv214 = this.AudioAttributesImplApi21Parcelizer;
            if (getlocalelanguagetagv214 == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            } else {
                getlocalelanguagetagv212 = getlocalelanguagetagv214;
            }
            setAuthenticatorAttachment setauthenticatorattachment = setResponse.read(getlocalelanguagetagv212);
            this.write.IconCompatParcelizer(new getAttestationConveyancePreference.IconCompatParcelizer(((setAuthenticationExtensionsClientOutputs.IconCompatParcelizer) p0).write(), setauthenticatorattachment.getAudioAttributesImplApi21Parcelizer(), setauthenticatorattachment.getAudioAttributesCompatParcelizer()));
            return;
        }
        if (!(p0 instanceof setAuthenticationExtensionsClientOutputs.RemoteActionCompatParcelizer)) {
            throw new RenewEligibleCreator();
        }
        CmcdHeadersFactoryCmcdStatus<getAttestationConveyancePreference> cmcdHeadersFactoryCmcdStatus = this.write;
        getLocaleLanguageTagV21 getlocalelanguagetagv215 = this.AudioAttributesImplApi21Parcelizer;
        if (getlocalelanguagetagv215 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
        } else {
            getlocalelanguagetagv212 = getlocalelanguagetagv215;
        }
        cmcdHeadersFactoryCmcdStatus.IconCompatParcelizer(new getAttestationConveyancePreference.AudioAttributesCompatParcelizer(getlocalelanguagetagv212.onMediaButtonEvent()));
    }

    static final class write extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private /* synthetic */ setAuthenticationExtensionsClientOutputs RemoteActionCompatParcelizer;
        private int read;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.read;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                ProfileEditViewModel.this.RemoteActionCompatParcelizer.write(QBankStatsResponse.AudioAttributesCompatParcelizer(true));
                getDisplaySizeV17 getdisplaysizev17 = ProfileEditViewModel.this.read;
                Bitmap audioAttributesImplBaseParcelizer = ((setAuthenticationExtensionsClientOutputs.read) this.RemoteActionCompatParcelizer).write().getAudioAttributesImplBaseParcelizer();
                getLocaleLanguageTagV21 getlocalelanguagetagv21 = ProfileEditViewModel.this.AudioAttributesImplApi21Parcelizer;
                if (getlocalelanguagetagv21 == null) {
                    toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                    getlocalelanguagetagv21 = null;
                }
                this.read = 1;
                if (getdisplaysizev17.RemoteActionCompatParcelizer(audioAttributesImplBaseParcelizer, getlocalelanguagetagv21, this) == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            ProfileEditViewModel.this.write.IconCompatParcelizer(getAttestationConveyancePreference.write.INSTANCE);
            ProfileEditViewModel.this.IconCompatParcelizer.onProfileUpdated(false);
            return getShowPopup.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        write(setAuthenticationExtensionsClientOutputs setauthenticationextensionsclientoutputs, SampleVideos<? super write> sampleVideos) {
            super(1, sampleVideos);
            this.RemoteActionCompatParcelizer = setauthenticationextensionsclientoutputs;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return ProfileEditViewModel.this.new write(this.RemoteActionCompatParcelizer, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((write) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(ProfileEditViewModel profileEditViewModel, String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        profileEditViewModel.RemoteActionCompatParcelizer.write(Boolean.FALSE);
        profileEditViewModel.write.IconCompatParcelizer(new getAttestationConveyancePreference.AudioAttributesImplBaseParcelizer(str));
        return getShowPopup.INSTANCE;
    }

    static final class read extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int IconCompatParcelizer;
        private Object RemoteActionCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            ProfileEditViewModel profileEditViewModel;
            getResolutionSize getresolutionsize;
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.IconCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                profileEditViewModel = ProfileEditViewModel.this;
                this.RemoteActionCompatParcelizer = profileEditViewModel;
                this.IconCompatParcelizer = 1;
                obj = profileEditViewModel.read.onPlay(this);
                if (obj != objIconCompatParcelizer) {
                }
                return objIconCompatParcelizer;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                getresolutionsize = (getResolutionSize) this.RemoteActionCompatParcelizer;
                SdkPayloadData.IconCompatParcelizer(obj);
                getresolutionsize.write(QBankStatsResponse.RemoteActionCompatParcelizer(((getLocaleLanguageTagV21) obj).RatingCompat()));
                return getShowPopup.INSTANCE;
            }
            profileEditViewModel = (ProfileEditViewModel) this.RemoteActionCompatParcelizer;
            SdkPayloadData.IconCompatParcelizer(obj);
            profileEditViewModel.AudioAttributesImplApi21Parcelizer = (getLocaleLanguageTagV21) obj;
            ProfileEditViewModel.this.RemoteActionCompatParcelizer.write(QBankStatsResponse.AudioAttributesCompatParcelizer(false));
            CmcdHeadersFactoryCmcdStatus cmcdHeadersFactoryCmcdStatus = ProfileEditViewModel.this.write;
            getLocaleLanguageTagV21 getlocalelanguagetagv21 = ProfileEditViewModel.this.AudioAttributesImplApi21Parcelizer;
            if (getlocalelanguagetagv21 == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                getlocalelanguagetagv21 = null;
            }
            cmcdHeadersFactoryCmcdStatus.IconCompatParcelizer(new getAttestationConveyancePreference.AudioAttributesImplApi26Parcelizer(setResponse.read(getlocalelanguagetagv21)));
            getResolutionSize getresolutionsize2 = ProfileEditViewModel.this.AudioAttributesImplApi26Parcelizer;
            this.RemoteActionCompatParcelizer = getresolutionsize2;
            this.IconCompatParcelizer = 2;
            Object objOnPlay = ProfileEditViewModel.this.read.onPlay(this);
            if (objOnPlay != objIconCompatParcelizer) {
                obj = objOnPlay;
                getresolutionsize = getresolutionsize2;
                getresolutionsize.write(QBankStatsResponse.RemoteActionCompatParcelizer(((getLocaleLanguageTagV21) obj).RatingCompat()));
                return getShowPopup.INSTANCE;
            }
            return objIconCompatParcelizer;
        }

        read(SampleVideos<? super read> sampleVideos) {
            super(1, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return ProfileEditViewModel.this.new read(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((read) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void AudioAttributesImplApi26Parcelizer() {
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new read(null), new MagicModuleSubmissionRequestBody() { // from class: o.PublicKeyCredentialCreationOptions
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return ProfileEditViewModel.RemoteActionCompatParcelizer(this.IconCompatParcelizer, (String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup RemoteActionCompatParcelizer(ProfileEditViewModel profileEditViewModel, String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        profileEditViewModel.RemoteActionCompatParcelizer.write(Boolean.FALSE);
        profileEditViewModel.write.IconCompatParcelizer(new getAttestationConveyancePreference.AudioAttributesImplBaseParcelizer(str));
        return getShowPopup.INSTANCE;
    }

    private static boolean write(String p0) {
        String str = TestGroupLSModel.read(p0, " ", "", false);
        String str2 = str;
        return str2.length() > 0 && str.length() >= 2 && new newYearNameItem("^[a-zA-Z]+[a-zA-Z-,.']*$").write(str2);
    }
}
