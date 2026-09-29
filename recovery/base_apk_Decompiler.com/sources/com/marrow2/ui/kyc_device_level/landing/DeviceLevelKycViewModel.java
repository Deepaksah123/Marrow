package com.marrow2.ui.kyc_device_level.landing;

import com.marrow.data.api.models.response.user.LoggedUserResponse;
import com.marrow2.ui.kyc_device_level.landing.DeviceLevelKycViewModel;
import kotlin.CmcdHeadersFactoryCmcdObjectBuilder;
import kotlin.DataSourceBitmapLoaderExternalSyntheticLambda0;
import kotlin.IntermediateLoginResponseBody;
import kotlin.MagicModuleSubmissionRequestBody;
import kotlin.Metadata;
import kotlin.POJOPropertyBuilder5;
import kotlin.POJOPropertyBuilderWithMember;
import kotlin.RenewEligibleCreator;
import kotlin.SampleVideos;
import kotlin.SdkPayloadData;
import kotlin.ThemeState;
import kotlin.TypeResolutionContextBasic;
import kotlin.VerifyNewNumberRequest;
import kotlin.getAnswerMap;
import kotlin.getDisplaySizeV17;
import kotlin.getMagicModuleStats;
import kotlin.getResolutionSize;
import kotlin.getShowPopup;
import kotlin.getUserAgent;
import kotlin.getYear;
import kotlin.isDark;
import kotlin.isSeekPending;
import kotlin.lambdaloadBitmap2comgoogleandroidexoplayer2upstreamDataSourceBitmapLoader;
import kotlin.setSdkPayload;
import kotlin.setStartTime;
import kotlin.setStreamingFormat;
import kotlin.setUpdatedStatus;
import kotlin.toMagicModuleMetaRepoModel;
import kotlin.updateLoadingFinished;
import kotlin.zaA;
import kotlin.zaB;
import kotlin.zaF;
import kotlin.zaI;
import kotlin.zaJ;
import kotlin.zar;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0012\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\f\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R \u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u001b0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u001dR#\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u001b0\u001e8\u0007¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\f\u0010!R\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\n0\u001a8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u001dR \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\n0\u001e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010 \u001a\u0004\b\u000f\u0010!R\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020%0\u001a8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u001dR \u0010'\u001a\b\u0012\u0004\u0012\u00020%0&8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b\u0019\u0010)R\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020*0\u001a8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001dR\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020*0\u001e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b#\u0010 "}, d2 = {"Lcom/marrow2/ui/kyc_device_level/landing/DeviceLevelKycViewModel;", "Lo/POJOPropertyBuilderWithMember;", "Lo/POJOPropertyBuilder5;", "p0", "Lo/getDisplaySizeV17;", "p1", "Lo/isSeekPending;", "p2", "<init>", "(Lo/POJOPropertyBuilder5;Lo/getDisplaySizeV17;Lo/isSeekPending;)V", "Lo/zaJ;", "", "read", "(Lo/zaJ;)V", "Lo/zaA;", "AudioAttributesCompatParcelizer", "(Lo/zaA;)V", "Lo/zaB;", "write", "(Lo/POJOPropertyBuilder5;)Lo/zaB;", "MediaMetadataCompat", "Lo/getDisplaySizeV17;", "Lo/isSeekPending;", "MediaBrowserCompatCustomActionResultReceiver", "Lo/zaB;", "IconCompatParcelizer", "Lo/getResolutionSize;", "Lo/DataSourceBitmapLoaderExternalSyntheticLambda0;", "Lo/zaI;", "Lo/getResolutionSize;", "Lo/isDark;", "MediaBrowserCompatItemReceiver", "Lo/isDark;", "()Lo/isDark;", "RemoteActionCompatParcelizer", "AudioAttributesImplApi21Parcelizer", "AudioAttributesImplApi26Parcelizer", "Lo/zar;", "Lo/setUpdatedStatus;", "AudioAttributesImplBaseParcelizer", "Lo/setUpdatedStatus;", "()Lo/setUpdatedStatus;", "", "MediaDescriptionCompat"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class DeviceLevelKycViewModel extends POJOPropertyBuilderWithMember {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final isSeekPending read;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private final isDark<String> MediaDescriptionCompat;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private final isDark<zaJ> MediaBrowserCompatCustomActionResultReceiver;
    private final setUpdatedStatus<zar> AudioAttributesImplBaseParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final getResolutionSize<String> MediaBrowserCompatItemReceiver;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private final zaB IconCompatParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private final isDark<DataSourceBitmapLoaderExternalSyntheticLambda0<zaI>> RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: MediaMetadataCompat, reason: from kotlin metadata */
    private final getDisplaySizeV17 write;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final getResolutionSize<zaJ> AudioAttributesImplApi21Parcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final getResolutionSize<zar> AudioAttributesImplApi26Parcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final getResolutionSize<DataSourceBitmapLoaderExternalSyntheticLambda0<zaI>> AudioAttributesCompatParcelizer;

    @setSdkPayload
    public DeviceLevelKycViewModel(POJOPropertyBuilder5 pOJOPropertyBuilder5, getDisplaySizeV17 getdisplaysizev17, isSeekPending isseekpending) {
        toMagicModuleMetaRepoModel.write(pOJOPropertyBuilder5, "");
        toMagicModuleMetaRepoModel.write(getdisplaysizev17, "");
        toMagicModuleMetaRepoModel.write(isseekpending, "");
        this.write = getdisplaysizev17;
        this.read = isseekpending;
        this.IconCompatParcelizer = write(pOJOPropertyBuilder5);
        getResolutionSize<DataSourceBitmapLoaderExternalSyntheticLambda0<zaI>> getresolutionsizeRemoteActionCompatParcelizer = setStartTime.RemoteActionCompatParcelizer(new setStreamingFormat(null, 1, null));
        this.AudioAttributesCompatParcelizer = getresolutionsizeRemoteActionCompatParcelizer;
        this.RemoteActionCompatParcelizer = VerifyNewNumberRequest.IconCompatParcelizer((ThemeState) getresolutionsizeRemoteActionCompatParcelizer);
        getResolutionSize<zaJ> getresolutionsizeRemoteActionCompatParcelizer2 = setStartTime.RemoteActionCompatParcelizer(zaJ.MediaBrowserCompatItemReceiver.INSTANCE);
        this.AudioAttributesImplApi21Parcelizer = getresolutionsizeRemoteActionCompatParcelizer2;
        this.MediaBrowserCompatCustomActionResultReceiver = VerifyNewNumberRequest.IconCompatParcelizer((ThemeState) getresolutionsizeRemoteActionCompatParcelizer2);
        getResolutionSize<zar> getresolutionsizeRemoteActionCompatParcelizer3 = setStartTime.RemoteActionCompatParcelizer(zar.read.INSTANCE);
        this.AudioAttributesImplApi26Parcelizer = getresolutionsizeRemoteActionCompatParcelizer3;
        this.AudioAttributesImplBaseParcelizer = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer3);
        getResolutionSize<String> getresolutionsizeRemoteActionCompatParcelizer4 = setStartTime.RemoteActionCompatParcelizer("");
        this.MediaBrowserCompatItemReceiver = getresolutionsizeRemoteActionCompatParcelizer4;
        this.MediaDescriptionCompat = VerifyNewNumberRequest.IconCompatParcelizer((ThemeState) getresolutionsizeRemoteActionCompatParcelizer4);
        read(zaJ.write.INSTANCE);
    }

    public final isDark<DataSourceBitmapLoaderExternalSyntheticLambda0<zaI>> read() {
        return this.RemoteActionCompatParcelizer;
    }

    public final isDark<zaJ> AudioAttributesCompatParcelizer() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    public final setUpdatedStatus<zar> IconCompatParcelizer() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    public final void read(zaJ p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        if (p0 instanceof zaJ.AudioAttributesImplApi21Parcelizer) {
            isSeekPending isseekpending = this.read;
            zaF zaf = zaF.INSTANCE;
            isseekpending.write(zaF.IconCompatParcelizer(this.IconCompatParcelizer.getUserId()), IntermediateLoginResponseBody.RemoteActionCompatParcelizer());
            AudioAttributesCompatParcelizer(new zaA(((zaJ.AudioAttributesImplApi21Parcelizer) p0).AudioAttributesCompatParcelizer(), this.IconCompatParcelizer.getTransactionId()));
            return;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, zaJ.write.INSTANCE)) {
            isSeekPending isseekpending2 = this.read;
            zaF zaf2 = zaF.INSTANCE;
            isseekpending2.write(zaF.read(this.IconCompatParcelizer.getUserId(), this.IconCompatParcelizer.getDeviceCount()), IntermediateLoginResponseBody.RemoteActionCompatParcelizer());
            return;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, zaJ.IconCompatParcelizer.INSTANCE)) {
            isSeekPending isseekpending3 = this.read;
            zaF zaf3 = zaF.INSTANCE;
            isseekpending3.write(zaF.RemoteActionCompatParcelizer(this.IconCompatParcelizer.getUserId()), IntermediateLoginResponseBody.RemoteActionCompatParcelizer());
            return;
        }
        if (p0 instanceof zaJ.read) {
            this.AudioAttributesImplApi26Parcelizer.write(new zar.RemoteActionCompatParcelizer(((zaJ.read) p0).write()));
            return;
        }
        if (p0 instanceof zaJ.AudioAttributesCompatParcelizer) {
            zaB zab = this.IconCompatParcelizer;
            getResolutionSize<DataSourceBitmapLoaderExternalSyntheticLambda0<zaI>> getresolutionsize = this.AudioAttributesCompatParcelizer;
            String workFlowId = zab.getWorkFlowId();
            String transactionId = zab.getTransactionId();
            String dkycToken = zab.getDkycToken();
            lambdaloadBitmap2comgoogleandroidexoplayer2upstreamDataSourceBitmapLoader.IconCompatParcelizer(getresolutionsize, new zaI(workFlowId, transactionId, dkycToken != null ? dkycToken : ""));
            return;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, zaJ.MediaBrowserCompatItemReceiver.INSTANCE)) {
            this.AudioAttributesImplApi21Parcelizer.write(zaJ.MediaBrowserCompatItemReceiver.INSTANCE);
            this.AudioAttributesImplApi26Parcelizer.write(zar.read.INSTANCE);
        } else {
            if (!(p0 instanceof zaJ.RemoteActionCompatParcelizer)) {
                throw new RenewEligibleCreator();
            }
            isSeekPending isseekpending4 = this.read;
            zaF zaf4 = zaF.INSTANCE;
            isseekpending4.write(zaF.RemoteActionCompatParcelizer(((zaJ.RemoteActionCompatParcelizer) p0).read(), this.IconCompatParcelizer.getTransactionId()), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(updateLoadingFinished.RemoteActionCompatParcelizer));
        }
    }

    static final class IconCompatParcelizer extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int AudioAttributesCompatParcelizer;
        private /* synthetic */ zaA read;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.AudioAttributesCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.AudioAttributesCompatParcelizer = 1;
                if (DeviceLevelKycViewModel.this.write.RemoteActionCompatParcelizer(getUserAgent.write(this.read), DeviceLevelKycViewModel.this.IconCompatParcelizer.getToken(), this) == objIconCompatParcelizer) {
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
        IconCompatParcelizer(zaA zaa, SampleVideos<? super IconCompatParcelizer> sampleVideos) {
            super(1, sampleVideos);
            this.read = zaa;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return DeviceLevelKycViewModel.this.new IconCompatParcelizer(this.read, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((IconCompatParcelizer) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void AudioAttributesCompatParcelizer(zaA p0) {
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new IconCompatParcelizer(p0, null), new MagicModuleSubmissionRequestBody() { // from class: o.setFailedResult
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return DeviceLevelKycViewModel.RemoteActionCompatParcelizer(this.IconCompatParcelizer, (String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup RemoteActionCompatParcelizer(DeviceLevelKycViewModel deviceLevelKycViewModel, String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        deviceLevelKycViewModel.MediaBrowserCompatItemReceiver.write(str);
        deviceLevelKycViewModel.read(new zaJ.read(str));
        return getShowPopup.INSTANCE;
    }

    private static zaB write(POJOPropertyBuilder5 p0) {
        Boolean bool = (Boolean) p0.write("initiate_kyc");
        boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
        String str = (String) p0.write(LoggedUserResponse.KEY_REFRESH_TOKEN);
        String str2 = str == null ? "" : str;
        String str3 = (String) p0.write(LoggedUserResponse.KEY_TOKEN);
        String str4 = str3 == null ? "" : str3;
        String str5 = (String) p0.write("transaction_id");
        String str6 = str5 == null ? "" : str5;
        String str7 = (String) p0.write("user_device_kyc_status");
        String str8 = str7 == null ? "" : str7;
        String str9 = (String) p0.write("workflow_id");
        String str10 = str9 == null ? "" : str9;
        String str11 = (String) p0.write("dkyc_token");
        String str12 = str11 == null ? "" : str11;
        String str13 = (String) p0.write("_id");
        String str14 = str13 == null ? "" : str13;
        Integer num = (Integer) p0.write("current_allowed_devices_count");
        return new zaB(zBooleanValue, str2, str4, str6, str8, str10, str12, num != null ? num.intValue() : 0, str14);
    }
}
