package com.marrow2.ui.custom_module.join_by_code;

import com.marrow.data.api.models.response.custommodule.CustomModuleQuotaResponseBody;
import com.marrow2.domain.custom_module.model.CustomModuleUCModel;
import com.marrow2.ui.custom_module.join_by_code.CustomModuleJoinByCodeViewModel;
import kotlin.CmcdHeadersFactoryCmcdObjectBuilder;
import kotlin.DataSourceBitmapLoaderExternalSyntheticLambda0;
import kotlin.GetPhoneNumberHintIntentRequestBuilder;
import kotlin.IntermediateLoginResponseBody;
import kotlin.MagicModuleSubmissionRequestBody;
import kotlin.Metadata;
import kotlin.POJOPropertyBuilder5;
import kotlin.POJOPropertyBuilderWithMember;
import kotlin.Pair;
import kotlin.SampleVideos;
import kotlin.SdkPayloadData;
import kotlin.TypeResolutionContextBasic;
import kotlin.VerifyNewNumberRequest;
import kotlin.decodeBitmap;
import kotlin.getAnswerMap;
import kotlin.getArray;
import kotlin.getColorInfo;
import kotlin.getDisplaySizeV17;
import kotlin.getMagicModuleStats;
import kotlin.getMagicModuleTimeline;
import kotlin.getResolutionSize;
import kotlin.getShowPopup;
import kotlin.getTotalMcq;
import kotlin.getYear;
import kotlin.isSeekPending;
import kotlin.newYearNameItem;
import kotlin.setSdkPayload;
import kotlin.setStartTime;
import kotlin.setStreamingFormat;
import kotlin.setTopBitrateKbps;
import kotlin.setUpdatedStatus;
import kotlin.toMagicModuleMetaRepoModel;
import kotlin.updateLoadingFinished;
import kotlin.updatePitchMatrix;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 %2\u00020\u0001:\u0002#%B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u000f¢\u0006\u0004\b\u0014\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u000fH\u0086@¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0018\u001a\u00020\u00172\b\u0010\u0003\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u0010\u001a\u00020\u000fH\u0082@¢\u0006\u0004\b\u0010\u0010\u001aJ2\u0010\u0015\u001a\u0014\u0012\u0004\u0012\u00020\u001e\u0012\b\u0012\u00060\u001bj\u0002`\u001c\u0018\u00010\u001d2\u000e\u0010\u0003\u001a\n\u0018\u00010\u001bj\u0004\u0018\u0001`\u001cH\u0082@¢\u0006\u0004\b\u0015\u0010\u001fJ\r\u0010 \u001a\u00020\u000f¢\u0006\u0004\b \u0010\u0013R\u0014\u0010#\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010%\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010$R\u0014\u0010\u0010\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\u0015\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010\u0018\u001a\u00020\u000e8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0015\u0010*R\"\u0010\u0012\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020-\u0018\u00010,0+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010.R%\u0010\u0014\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020-\u0018\u00010,0+8\u0007¢\u0006\f\n\u0004\b/\u0010.\u001a\u0004\b#\u00100R0\u0010/\u001a\u001e\u0012\u001a\u0012\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u001e\u0012\b\u0012\u00060\u001bj\u0002`\u001c0\u001d0,0+8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010.R6\u0010(\u001a\u001e\u0012\u001a\u0012\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u001e\u0012\b\u0012\u00060\u001bj\u0002`\u001c0\u001d0,0+8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b1\u0010.\u001a\u0004\b\u0018\u00100R\u001a\u0010 \u001a\b\u0012\u0004\u0012\u0002020+8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010.R \u0010!\u001a\b\u0012\u0004\u0012\u000202038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b(\u00106R\u001a\u00107\u001a\b\u0012\u0004\u0012\u00020\u000e0+8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b#\u0010.R\u001a\u00101\u001a\b\u0012\u0004\u0012\u00020\u000e038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b7\u00105R\u0016\u00104\u001a\u00020\u00178\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0012\u00108R\u0016\u00109\u001a\u00020\u000e8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b9\u0010*"}, d2 = {"Lcom/marrow2/ui/custom_module/join_by_code/CustomModuleJoinByCodeViewModel;", "Lo/POJOPropertyBuilderWithMember;", "Lo/getArray;", "p0", "Lo/getColorInfo;", "p1", "Lo/getDisplaySizeV17;", "p2", "Lo/isSeekPending;", "p3", "Lo/POJOPropertyBuilder5;", "p4", "<init>", "(Lo/getArray;Lo/getColorInfo;Lo/getDisplaySizeV17;Lo/isSeekPending;Lo/POJOPropertyBuilder5;)V", "", "", "write", "(Ljava/lang/String;)V", "AudioAttributesImplBaseParcelizer", "()V", "AudioAttributesImplApi21Parcelizer", "IconCompatParcelizer", "()Ljava/lang/Object;", "", "read", "(Ljava/lang/String;)Z", "(Lo/SampleVideos;)Ljava/lang/Object;", "Lcom/marrow/data/api/models/response/custommodule/CustomModuleQuotaResponseBody;", "Lcom/marrow2/data/custom_module/remote/model/CustomModuleQuotaModel;", "Lo/getSubscriptionExpiresOn;", "Lcom/marrow2/ui/custom_module/join_by_code/CustomModuleJoinByCodeViewModel$AudioAttributesCompatParcelizer;", "(Lcom/marrow/data/api/models/response/custommodule/CustomModuleQuotaResponseBody;Lo/SampleVideos;)Ljava/lang/Object;", "AudioAttributesImplApi26Parcelizer", "MediaDescriptionCompat", "Lo/getArray;", "AudioAttributesCompatParcelizer", "Lo/getColorInfo;", "RemoteActionCompatParcelizer", "onCommand", "Lo/getDisplaySizeV17;", "MediaBrowserCompatItemReceiver", "Lo/isSeekPending;", "Ljava/lang/String;", "Lo/getResolutionSize;", "Lo/DataSourceBitmapLoaderExternalSyntheticLambda0;", "Lcom/marrow2/domain/custom_module/model/CustomModuleUCModel;", "Lo/getResolutionSize;", "MediaBrowserCompatCustomActionResultReceiver", "()Lo/getResolutionSize;", "MediaMetadataCompat", "Lo/GetPhoneNumberHintIntentRequestBuilder;", "Lo/setUpdatedStatus;", "RatingCompat", "Lo/setUpdatedStatus;", "()Lo/setUpdatedStatus;", "MediaBrowserCompatMediaItem", "Z", "MediaBrowserCompatSearchResultReceiver"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CustomModuleJoinByCodeViewModel extends POJOPropertyBuilderWithMember {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final getResolutionSize<String> MediaBrowserCompatMediaItem;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private final getResolutionSize<GetPhoneNumberHintIntentRequestBuilder> AudioAttributesImplApi26Parcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private final getColorInfo RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private boolean RatingCompat;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final String read;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private final getResolutionSize<DataSourceBitmapLoaderExternalSyntheticLambda0<CustomModuleUCModel>> AudioAttributesImplApi21Parcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private final isSeekPending IconCompatParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatMediaItem, reason: from kotlin metadata */
    private final setUpdatedStatus<String> MediaMetadataCompat;
    private String MediaBrowserCompatSearchResultReceiver;

    /* JADX INFO: renamed from: MediaDescriptionCompat, reason: from kotlin metadata */
    private final getArray AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: MediaMetadataCompat, reason: from kotlin metadata */
    private final getResolutionSize<DataSourceBitmapLoaderExternalSyntheticLambda0<Pair<AudioAttributesCompatParcelizer, CustomModuleQuotaResponseBody>>> MediaBrowserCompatItemReceiver;

    /* JADX INFO: renamed from: RatingCompat, reason: from kotlin metadata */
    private final setUpdatedStatus<GetPhoneNumberHintIntentRequestBuilder> MediaDescriptionCompat;

    /* JADX INFO: renamed from: onCommand, reason: from kotlin metadata */
    private final getDisplaySizeV17 write;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final getResolutionSize<DataSourceBitmapLoaderExternalSyntheticLambda0<Pair<AudioAttributesCompatParcelizer, CustomModuleQuotaResponseBody>>> MediaBrowserCompatCustomActionResultReceiver;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final getResolutionSize<DataSourceBitmapLoaderExternalSyntheticLambda0<CustomModuleUCModel>> AudioAttributesImplBaseParcelizer;

    static final class IconCompatParcelizer extends getTotalMcq {
        /* synthetic */ Object AudioAttributesCompatParcelizer;
        int RemoteActionCompatParcelizer;
        Object write;

        IconCompatParcelizer(SampleVideos<? super IconCompatParcelizer> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.AudioAttributesCompatParcelizer = obj;
            this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
            return CustomModuleJoinByCodeViewModel.IconCompatParcelizer(CustomModuleJoinByCodeViewModel.this, this);
        }
    }

    static final class write extends getTotalMcq {
        Object IconCompatParcelizer;
        int RemoteActionCompatParcelizer;
        /* synthetic */ Object write;

        write(SampleVideos<? super write> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.write = obj;
            this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
            return CustomModuleJoinByCodeViewModel.this.write(this);
        }
    }

    @setSdkPayload
    public CustomModuleJoinByCodeViewModel(getArray getarray, getColorInfo getcolorinfo, getDisplaySizeV17 getdisplaysizev17, isSeekPending isseekpending, POJOPropertyBuilder5 pOJOPropertyBuilder5) {
        toMagicModuleMetaRepoModel.write(getarray, "");
        toMagicModuleMetaRepoModel.write(getcolorinfo, "");
        toMagicModuleMetaRepoModel.write(getdisplaysizev17, "");
        toMagicModuleMetaRepoModel.write(isseekpending, "");
        toMagicModuleMetaRepoModel.write(pOJOPropertyBuilder5, "");
        this.AudioAttributesCompatParcelizer = getarray;
        this.RemoteActionCompatParcelizer = getcolorinfo;
        this.write = getdisplaysizev17;
        this.IconCompatParcelizer = isseekpending;
        this.read = "^[A-Z0-9]+$";
        getResolutionSize<DataSourceBitmapLoaderExternalSyntheticLambda0<CustomModuleUCModel>> getresolutionsizeRemoteActionCompatParcelizer = setStartTime.RemoteActionCompatParcelizer(null);
        this.AudioAttributesImplBaseParcelizer = getresolutionsizeRemoteActionCompatParcelizer;
        this.AudioAttributesImplApi21Parcelizer = getresolutionsizeRemoteActionCompatParcelizer;
        getResolutionSize<DataSourceBitmapLoaderExternalSyntheticLambda0<Pair<AudioAttributesCompatParcelizer, CustomModuleQuotaResponseBody>>> getresolutionsizeRemoteActionCompatParcelizer2 = setStartTime.RemoteActionCompatParcelizer(new setStreamingFormat(null, 1, null));
        this.MediaBrowserCompatCustomActionResultReceiver = getresolutionsizeRemoteActionCompatParcelizer2;
        this.MediaBrowserCompatItemReceiver = getresolutionsizeRemoteActionCompatParcelizer2;
        getResolutionSize<GetPhoneNumberHintIntentRequestBuilder> getresolutionsizeRemoteActionCompatParcelizer3 = setStartTime.RemoteActionCompatParcelizer(GetPhoneNumberHintIntentRequestBuilder.RemoteActionCompatParcelizer.INSTANCE);
        this.AudioAttributesImplApi26Parcelizer = getresolutionsizeRemoteActionCompatParcelizer3;
        this.MediaDescriptionCompat = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer3);
        getResolutionSize<String> getresolutionsizeRemoteActionCompatParcelizer4 = setStartTime.RemoteActionCompatParcelizer("");
        this.MediaBrowserCompatMediaItem = getresolutionsizeRemoteActionCompatParcelizer4;
        this.MediaMetadataCompat = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer4);
        this.MediaBrowserCompatSearchResultReceiver = "";
        String str = (String) pOJOPropertyBuilder5.write("arg_invite_code");
        this.MediaBrowserCompatSearchResultReceiver = str != null ? str : "";
    }

    public static final /* synthetic */ Object IconCompatParcelizer(CustomModuleJoinByCodeViewModel customModuleJoinByCodeViewModel, SampleVideos sampleVideos) {
        return customModuleJoinByCodeViewModel.IconCompatParcelizer((CustomModuleQuotaResponseBody) null, (SampleVideos<? super Pair<? extends AudioAttributesCompatParcelizer, ? extends CustomModuleQuotaResponseBody>>) sampleVideos);
    }

    public final getResolutionSize<DataSourceBitmapLoaderExternalSyntheticLambda0<CustomModuleUCModel>> AudioAttributesCompatParcelizer() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    public final getResolutionSize<DataSourceBitmapLoaderExternalSyntheticLambda0<Pair<AudioAttributesCompatParcelizer, CustomModuleQuotaResponseBody>>> read() {
        return this.MediaBrowserCompatItemReceiver;
    }

    public final setUpdatedStatus<GetPhoneNumberHintIntentRequestBuilder> MediaBrowserCompatItemReceiver() {
        return this.MediaDescriptionCompat;
    }

    public final void write(String p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        this.AudioAttributesImplBaseParcelizer.write(new setStreamingFormat(null, 1, null));
        if (this.RatingCompat) {
            return;
        }
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new read(p0, null), new MagicModuleSubmissionRequestBody() { // from class: o.CredentialSavingClient
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return CustomModuleJoinByCodeViewModel.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, ((Integer) obj).intValue(), (String) obj2);
            }
        });
    }

    static final class read extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int IconCompatParcelizer;
        private /* synthetic */ String write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.IconCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                CustomModuleJoinByCodeViewModel.this.RatingCompat = true;
                CustomModuleJoinByCodeViewModel.this.AudioAttributesImplBaseParcelizer.write(new setStreamingFormat(null, 1, null));
                this.IconCompatParcelizer = 1;
                obj = CustomModuleJoinByCodeViewModel.this.RemoteActionCompatParcelizer.write(this.write, this);
                if (obj == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            CustomModuleJoinByCodeViewModel.this.AudioAttributesImplBaseParcelizer.write(new decodeBitmap((CustomModuleUCModel) obj));
            CustomModuleJoinByCodeViewModel.this.RatingCompat = false;
            return getShowPopup.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        read(String str, SampleVideos<? super read> sampleVideos) {
            super(1, sampleVideos);
            this.write = str;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return CustomModuleJoinByCodeViewModel.this.new read(this.write, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((read) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin.getShowPopup RemoteActionCompatParcelizer(com.marrow2.ui.custom_module.join_by_code.CustomModuleJoinByCodeViewModel r8, int r9, java.lang.String r10) {
        /*
            java.lang.String r0 = ""
            kotlin.toMagicModuleMetaRepoModel.write(r10, r0)
            r0 = 0
            r8.RatingCompat = r0
            o.getResolutionSize<o.DataSourceBitmapLoaderExternalSyntheticLambda0<com.marrow2.domain.custom_module.model.CustomModuleUCModel>> r0 = r8.AudioAttributesImplBaseParcelizer
            o.setTopBitrateKbps r7 = new o.setTopBitrateKbps
            r4 = 0
            r5 = 4
            r6 = 0
            r1 = r7
            r2 = r9
            r3 = r10
            r1.<init>(r2, r3, r4, r5, r6)
            r0.write(r7)
            r0 = 404(0x194, float:5.66E-43)
            if (r9 == r0) goto L41
            r0 = 1315(0x523, float:1.843E-42)
            if (r9 == r0) goto L39
            r0 = 1311(0x51f, float:1.837E-42)
            if (r9 == r0) goto L2e
            r0 = 1312(0x520, float:1.839E-42)
            if (r9 == r0) goto L41
            o.getResolutionSize<java.lang.String> r8 = r8.MediaBrowserCompatMediaItem
            r8.write(r10)
            goto L4b
        L2e:
            o.getResolutionSize<o.GetPhoneNumberHintIntentRequestBuilder> r8 = r8.AudioAttributesImplApi26Parcelizer
            o.GetPhoneNumberHintIntentRequestBuilder$AudioAttributesCompatParcelizer r0 = new o.GetPhoneNumberHintIntentRequestBuilder$AudioAttributesCompatParcelizer
            r0.<init>(r10)
            r8.write(r0)
            goto L4b
        L39:
            o.getResolutionSize<o.GetPhoneNumberHintIntentRequestBuilder> r8 = r8.AudioAttributesImplApi26Parcelizer
            o.GetPhoneNumberHintIntentRequestBuilder$read r10 = o.GetPhoneNumberHintIntentRequestBuilder.read.INSTANCE
            r8.write(r10)
            goto L4b
        L41:
            o.getResolutionSize<o.GetPhoneNumberHintIntentRequestBuilder> r8 = r8.AudioAttributesImplApi26Parcelizer
            o.GetPhoneNumberHintIntentRequestBuilder$write r0 = new o.GetPhoneNumberHintIntentRequestBuilder$write
            r0.<init>(r10)
            r8.write(r0)
        L4b:
            java.util.HashMap r8 = new java.util.HashMap
            r8.<init>()
            java.util.Map r8 = (java.util.Map) r8
            java.lang.String r10 = "error_code"
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r8.put(r10, r9)
            o.getShowPopup r8 = kotlin.getShowPopup.INSTANCE
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.custom_module.join_by_code.CustomModuleJoinByCodeViewModel.RemoteActionCompatParcelizer(com.marrow2.ui.custom_module.join_by_code.CustomModuleJoinByCodeViewModel, int, java.lang.String):o.getShowPopup");
    }

    public final void AudioAttributesImplBaseParcelizer() {
        this.AudioAttributesImplBaseParcelizer.write(new setTopBitrateKbps(200, "Enter code", null, 4, null));
    }

    static final class MediaBrowserCompatCustomActionResultReceiver extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.write;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                CustomModuleJoinByCodeViewModel customModuleJoinByCodeViewModel = CustomModuleJoinByCodeViewModel.this;
                this.write = 1;
                customModuleJoinByCodeViewModel.IconCompatParcelizer();
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    SdkPayloadData.IconCompatParcelizer(obj);
                    return getShowPopup.INSTANCE;
                }
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            this.write = 2;
            if (CustomModuleJoinByCodeViewModel.this.write(this) == objIconCompatParcelizer) {
                return objIconCompatParcelizer;
            }
            return getShowPopup.INSTANCE;
        }

        MediaBrowserCompatCustomActionResultReceiver(SampleVideos<? super MediaBrowserCompatCustomActionResultReceiver> sampleVideos) {
            super(1, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return CustomModuleJoinByCodeViewModel.this.new MediaBrowserCompatCustomActionResultReceiver(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((MediaBrowserCompatCustomActionResultReceiver) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    public final void AudioAttributesImplApi21Parcelizer() {
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new MediaBrowserCompatCustomActionResultReceiver(null), new MagicModuleSubmissionRequestBody() { // from class: o.BeginSignInRequestPasswordRequestOptionsBuilder
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return CustomModuleJoinByCodeViewModel.write(this.IconCompatParcelizer, (String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup write(CustomModuleJoinByCodeViewModel customModuleJoinByCodeViewModel, String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        customModuleJoinByCodeViewModel.MediaBrowserCompatMediaItem.write(str);
        return getShowPopup.INSTANCE;
    }

    public final Object IconCompatParcelizer() {
        if (read(this.MediaBrowserCompatSearchResultReceiver)) {
            this.AudioAttributesImplApi26Parcelizer.write(new GetPhoneNumberHintIntentRequestBuilder.IconCompatParcelizer(this.MediaBrowserCompatSearchResultReceiver));
        }
        return getShowPopup.INSTANCE;
    }

    private final boolean read(String p0) {
        String str = p0;
        return (str == null || str.length() == 0 || !new newYearNameItem(this.read).write(str)) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0058, code lost:
    
        if (r6 == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object write(kotlin.SampleVideos<? super kotlin.getShowPopup> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.marrow2.ui.custom_module.join_by_code.CustomModuleJoinByCodeViewModel.write
            if (r0 == 0) goto L14
            r0 = r6
            com.marrow2.ui.custom_module.join_by_code.CustomModuleJoinByCodeViewModel$write r0 = (com.marrow2.ui.custom_module.join_by_code.CustomModuleJoinByCodeViewModel.write) r0
            int r1 = r0.RemoteActionCompatParcelizer
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r6 = r0.RemoteActionCompatParcelizer
            int r6 = r6 + r2
            r0.RemoteActionCompatParcelizer = r6
            goto L19
        L14:
            com.marrow2.ui.custom_module.join_by_code.CustomModuleJoinByCodeViewModel$write r0 = new com.marrow2.ui.custom_module.join_by_code.CustomModuleJoinByCodeViewModel$write
            r0.<init>(r6)
        L19:
            java.lang.Object r6 = r0.write
            java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
            int r2 = r0.RemoteActionCompatParcelizer
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3d
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            kotlin.SdkPayloadData.IconCompatParcelizer(r6)
            goto L5b
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            java.lang.Object r2 = r0.IconCompatParcelizer
            com.marrow2.ui.custom_module.join_by_code.CustomModuleJoinByCodeViewModel r2 = (com.marrow2.ui.custom_module.join_by_code.CustomModuleJoinByCodeViewModel) r2
            kotlin.SdkPayloadData.IconCompatParcelizer(r6)
            goto L4d
        L3d:
            kotlin.SdkPayloadData.IconCompatParcelizer(r6)
            o.getArray r6 = r5.AudioAttributesCompatParcelizer
            r0.IconCompatParcelizer = r5
            r0.RemoteActionCompatParcelizer = r4
            java.lang.Object r6 = r6.write(r0)
            if (r6 == r1) goto L67
            r2 = r5
        L4d:
            com.marrow.data.api.models.response.custommodule.CustomModuleQuotaResponseBody r6 = (com.marrow.data.api.models.response.custommodule.CustomModuleQuotaResponseBody) r6
            r4 = 0
            r0.IconCompatParcelizer = r4
            r0.RemoteActionCompatParcelizer = r3
            java.lang.Object r6 = r2.IconCompatParcelizer(r6, r0)
            if (r6 != r1) goto L5b
            goto L67
        L5b:
            o.getSubscriptionExpiresOn r6 = (kotlin.Pair) r6
            if (r6 == 0) goto L64
            o.getResolutionSize<o.DataSourceBitmapLoaderExternalSyntheticLambda0<o.getSubscriptionExpiresOn<com.marrow2.ui.custom_module.join_by_code.CustomModuleJoinByCodeViewModel$AudioAttributesCompatParcelizer, com.marrow.data.api.models.response.custommodule.CustomModuleQuotaResponseBody>>> r5 = r5.MediaBrowserCompatCustomActionResultReceiver
            kotlin.lambdaloadBitmap2comgoogleandroidexoplayer2upstreamDataSourceBitmapLoader.IconCompatParcelizer(r5, r6)
        L64:
            o.getShowPopup r5 = kotlin.getShowPopup.INSTANCE
            return r5
        L67:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.custom_module.join_by_code.CustomModuleJoinByCodeViewModel.write(o.SampleVideos):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object IconCompatParcelizer(com.marrow.data.api.models.response.custommodule.CustomModuleQuotaResponseBody r6, kotlin.SampleVideos<? super kotlin.Pair<? extends com.marrow2.ui.custom_module.join_by_code.CustomModuleJoinByCodeViewModel.AudioAttributesCompatParcelizer, ? extends com.marrow.data.api.models.response.custommodule.CustomModuleQuotaResponseBody>> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.marrow2.ui.custom_module.join_by_code.CustomModuleJoinByCodeViewModel.IconCompatParcelizer
            if (r0 == 0) goto L14
            r0 = r7
            com.marrow2.ui.custom_module.join_by_code.CustomModuleJoinByCodeViewModel$IconCompatParcelizer r0 = (com.marrow2.ui.custom_module.join_by_code.CustomModuleJoinByCodeViewModel.IconCompatParcelizer) r0
            int r1 = r0.RemoteActionCompatParcelizer
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r7 = r0.RemoteActionCompatParcelizer
            int r7 = r7 + r2
            r0.RemoteActionCompatParcelizer = r7
            goto L19
        L14:
            com.marrow2.ui.custom_module.join_by_code.CustomModuleJoinByCodeViewModel$IconCompatParcelizer r0 = new com.marrow2.ui.custom_module.join_by_code.CustomModuleJoinByCodeViewModel$IconCompatParcelizer
            r0.<init>(r7)
        L19:
            java.lang.Object r7 = r0.AudioAttributesCompatParcelizer
            java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
            int r2 = r0.RemoteActionCompatParcelizer
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L41
            if (r2 == r4) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r5 = r0.write
            com.marrow.data.api.models.response.custommodule.CustomModuleQuotaResponseBody r5 = (com.marrow.data.api.models.response.custommodule.CustomModuleQuotaResponseBody) r5
            kotlin.SdkPayloadData.IconCompatParcelizer(r7)
            goto L68
        L31:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L39:
            java.lang.Object r6 = r0.write
            com.marrow.data.api.models.response.custommodule.CustomModuleQuotaResponseBody r6 = (com.marrow.data.api.models.response.custommodule.CustomModuleQuotaResponseBody) r6
            kotlin.SdkPayloadData.IconCompatParcelizer(r7)
            goto L52
        L41:
            kotlin.SdkPayloadData.IconCompatParcelizer(r7)
            if (r6 == 0) goto Lab
            o.getDisplaySizeV17 r7 = r5.write
            r0.write = r6
            r0.RemoteActionCompatParcelizer = r4
            java.lang.Object r7 = r7.onRemoveQueueItemAt(r0)
            if (r7 == r1) goto Laa
        L52:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 != 0) goto L88
            o.getDisplaySizeV17 r5 = r5.write
            r0.write = r6
            r0.RemoteActionCompatParcelizer = r3
            java.lang.Object r7 = r5.onPlayFromUri(r0)
            if (r7 != r1) goto L67
            goto Laa
        L67:
            r5 = r6
        L68:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r6 = r7.booleanValue()
            if (r6 == 0) goto L72
            r6 = r5
            goto L88
        L72:
            int r6 = r5.totalCustomModuleCreated
            int r7 = r5.freeUserAllowed
            if (r6 >= r7) goto L80
            o.getSubscriptionExpiresOn r6 = new o.getSubscriptionExpiresOn
            com.marrow2.ui.custom_module.join_by_code.CustomModuleJoinByCodeViewModel$AudioAttributesCompatParcelizer r7 = com.marrow2.ui.custom_module.join_by_code.CustomModuleJoinByCodeViewModel.AudioAttributesCompatParcelizer.IconCompatParcelizer
            r6.<init>(r7, r5)
            return r6
        L80:
            o.getSubscriptionExpiresOn r6 = new o.getSubscriptionExpiresOn
            com.marrow2.ui.custom_module.join_by_code.CustomModuleJoinByCodeViewModel$AudioAttributesCompatParcelizer r7 = com.marrow2.ui.custom_module.join_by_code.CustomModuleJoinByCodeViewModel.AudioAttributesCompatParcelizer.read
            r6.<init>(r7, r5)
            return r6
        L88:
            int r5 = r6.monthlyCreated
            if (r5 != 0) goto L94
            o.getSubscriptionExpiresOn r5 = new o.getSubscriptionExpiresOn
            com.marrow2.ui.custom_module.join_by_code.CustomModuleJoinByCodeViewModel$AudioAttributesCompatParcelizer r7 = com.marrow2.ui.custom_module.join_by_code.CustomModuleJoinByCodeViewModel.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer
            r5.<init>(r7, r6)
            return r5
        L94:
            int r5 = r6.monthlyCreated
            int r7 = r6.monthlyAllowed
            if (r5 >= r7) goto La2
            o.getSubscriptionExpiresOn r5 = new o.getSubscriptionExpiresOn
            com.marrow2.ui.custom_module.join_by_code.CustomModuleJoinByCodeViewModel$AudioAttributesCompatParcelizer r7 = com.marrow2.ui.custom_module.join_by_code.CustomModuleJoinByCodeViewModel.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer
            r5.<init>(r7, r6)
            return r5
        La2:
            o.getSubscriptionExpiresOn r5 = new o.getSubscriptionExpiresOn
            com.marrow2.ui.custom_module.join_by_code.CustomModuleJoinByCodeViewModel$AudioAttributesCompatParcelizer r7 = com.marrow2.ui.custom_module.join_by_code.CustomModuleJoinByCodeViewModel.AudioAttributesCompatParcelizer.read
            r5.<init>(r7, r6)
            return r5
        Laa:
            return r1
        Lab:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.custom_module.join_by_code.CustomModuleJoinByCodeViewModel.IconCompatParcelizer(com.marrow.data.api.models.response.custommodule.CustomModuleQuotaResponseBody, o.SampleVideos):java.lang.Object");
    }

    public final void AudioAttributesImplApi26Parcelizer() {
        isSeekPending isseekpending = this.IconCompatParcelizer;
        updatePitchMatrix updatepitchmatrix = updatePitchMatrix.INSTANCE;
        isseekpending.write(updatePitchMatrix.RemoteActionCompatParcelizer(), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(updateLoadingFinished.IconCompatParcelizer));
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007"}, d2 = {"Lcom/marrow2/ui/custom_module/join_by_code/CustomModuleJoinByCodeViewModel$AudioAttributesCompatParcelizer;", "", "<init>", "(Ljava/lang/String;I)V", "AudioAttributesCompatParcelizer", "RemoteActionCompatParcelizer", "read", "IconCompatParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AudioAttributesCompatParcelizer {
        private static final /* synthetic */ AudioAttributesCompatParcelizer[] write;
        public static final AudioAttributesCompatParcelizer AudioAttributesCompatParcelizer = new AudioAttributesCompatParcelizer("MONTHLY_0", 0);
        public static final AudioAttributesCompatParcelizer RemoteActionCompatParcelizer = new AudioAttributesCompatParcelizer("MONTHLY_REMAINING", 1);
        public static final AudioAttributesCompatParcelizer read = new AudioAttributesCompatParcelizer("LIMIT_EXHAUSTED", 2);
        public static final AudioAttributesCompatParcelizer IconCompatParcelizer = new AudioAttributesCompatParcelizer("FREE_REMAINING", 3);

        private AudioAttributesCompatParcelizer(String str, int i) {
        }

        static {
            AudioAttributesCompatParcelizer[] audioAttributesCompatParcelizerArr = read();
            write = audioAttributesCompatParcelizerArr;
            getMagicModuleTimeline.IconCompatParcelizer(audioAttributesCompatParcelizerArr);
        }

        private static final /* synthetic */ AudioAttributesCompatParcelizer[] read() {
            return new AudioAttributesCompatParcelizer[]{AudioAttributesCompatParcelizer, RemoteActionCompatParcelizer, read, IconCompatParcelizer};
        }

        public static AudioAttributesCompatParcelizer valueOf(String str) {
            return (AudioAttributesCompatParcelizer) Enum.valueOf(AudioAttributesCompatParcelizer.class, str);
        }

        public static AudioAttributesCompatParcelizer[] values() {
            return (AudioAttributesCompatParcelizer[]) write.clone();
        }
    }
}
