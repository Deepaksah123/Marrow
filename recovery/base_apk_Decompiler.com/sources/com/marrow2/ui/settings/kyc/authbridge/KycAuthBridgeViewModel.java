package com.marrow2.ui.settings.kyc.authbridge;

import com.marrow2.ui.settings.kyc.authbridge.KycAuthBridgeViewModel;
import kotlin.C0201setMcqCount;
import kotlin.CmcdHeadersFactoryCmcdObjectBuilder;
import kotlin.LocationStatusCodes;
import kotlin.MagicModuleSubmissionRequestBody;
import kotlin.Metadata;
import kotlin.POJOPropertyBuilder5;
import kotlin.POJOPropertyBuilderWithMember;
import kotlin.RenewEligibleCreator;
import kotlin.SampleVideos;
import kotlin.TopUserCompanion;
import kotlin.TypeResolutionContextBasic;
import kotlin.VerifyNewNumberRequest;
import kotlin.getAnswerMap;
import kotlin.getDisplaySizeV17;
import kotlin.getMagicModuleStats;
import kotlin.getResolutionSize;
import kotlin.getShowPopup;
import kotlin.isNetworkLocationPresent;
import kotlin.setIntervalMillis;
import kotlin.setMinUpdateDistanceMeters;
import kotlin.setSdkPayload;
import kotlin.setStartTime;
import kotlin.setUpdatedStatus;
import kotlin.skipShortTermReferencePictureSets;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\u0018\u0000 !2\u00020\u0001:\u0001!B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0010\u0010\fJ\u000f\u0010\u0011\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0011\u0010\fR\u0014\u0010\u000e\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0017R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u001bR\u001d\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001a0\u001d8\u0007¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u0018\u0010 R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\"0\u00198\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001bR \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\"0\u001d8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u001f\u001a\u0004\b\u001c\u0010 R\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020#0\u00198\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u001bR \u0010\u001e\u001a\b\u0012\u0004\u0012\u00020#0\u001d8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u001f\u001a\u0004\b\u000e\u0010 R\u0016\u0010\u000b\u001a\u00020$8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010%"}, d2 = {"Lcom/marrow2/ui/settings/kyc/authbridge/KycAuthBridgeViewModel;", "Lo/POJOPropertyBuilderWithMember;", "Lo/getDisplaySizeV17;", "p0", "Lo/skipShortTermReferencePictureSets;", "p1", "Lo/POJOPropertyBuilder5;", "p2", "<init>", "(Lo/getDisplaySizeV17;Lo/skipShortTermReferencePictureSets;Lo/POJOPropertyBuilder5;)V", "", "AudioAttributesImplApi26Parcelizer", "()V", "Lo/setIntervalMillis;", "read", "(Lo/setIntervalMillis;)V", "AudioAttributesImplApi21Parcelizer", "AudioAttributesImplBaseParcelizer", "RatingCompat", "Lo/getDisplaySizeV17;", "MediaBrowserCompatCustomActionResultReceiver", "Lo/skipShortTermReferencePictureSets;", "write", "Lo/POJOPropertyBuilder5;", "IconCompatParcelizer", "Lo/getResolutionSize;", "Lo/isNetworkLocationPresent;", "Lo/getResolutionSize;", "AudioAttributesCompatParcelizer", "Lo/setUpdatedStatus;", "MediaBrowserCompatItemReceiver", "Lo/setUpdatedStatus;", "()Lo/setUpdatedStatus;", "RemoteActionCompatParcelizer", "", "Lo/setMinUpdateDistanceMeters;", "", "I"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class KycAuthBridgeViewModel extends POJOPropertyBuilderWithMember {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final getResolutionSize<Boolean> MediaBrowserCompatCustomActionResultReceiver;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private final POJOPropertyBuilder5 IconCompatParcelizer;
    private int AudioAttributesImplApi26Parcelizer;
    private final setUpdatedStatus<Boolean> AudioAttributesImplBaseParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final getResolutionSize<isNetworkLocationPresent> AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private final skipShortTermReferencePictureSets write;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private final setUpdatedStatus<isNetworkLocationPresent> RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: RatingCompat, reason: from kotlin metadata */
    private final getDisplaySizeV17 read;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final setUpdatedStatus<setMinUpdateDistanceMeters> MediaBrowserCompatItemReceiver;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final getResolutionSize<setMinUpdateDistanceMeters> AudioAttributesImplApi21Parcelizer;

    @setSdkPayload
    public KycAuthBridgeViewModel(getDisplaySizeV17 getdisplaysizev17, skipShortTermReferencePictureSets skipshorttermreferencepicturesets, POJOPropertyBuilder5 pOJOPropertyBuilder5) {
        toMagicModuleMetaRepoModel.write(getdisplaysizev17, "");
        toMagicModuleMetaRepoModel.write(skipshorttermreferencepicturesets, "");
        toMagicModuleMetaRepoModel.write(pOJOPropertyBuilder5, "");
        this.read = getdisplaysizev17;
        this.write = skipshorttermreferencepicturesets;
        this.IconCompatParcelizer = pOJOPropertyBuilder5;
        getResolutionSize<isNetworkLocationPresent> getresolutionsizeRemoteActionCompatParcelizer = setStartTime.RemoteActionCompatParcelizer(new isNetworkLocationPresent(null, false, null, 0, 0, 31, null));
        this.AudioAttributesCompatParcelizer = getresolutionsizeRemoteActionCompatParcelizer;
        this.RemoteActionCompatParcelizer = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer);
        getResolutionSize<Boolean> getresolutionsizeRemoteActionCompatParcelizer2 = setStartTime.RemoteActionCompatParcelizer(Boolean.FALSE);
        this.MediaBrowserCompatCustomActionResultReceiver = getresolutionsizeRemoteActionCompatParcelizer2;
        this.AudioAttributesImplBaseParcelizer = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer2);
        getResolutionSize<setMinUpdateDistanceMeters> getresolutionsizeRemoteActionCompatParcelizer3 = setStartTime.RemoteActionCompatParcelizer(setMinUpdateDistanceMeters.RemoteActionCompatParcelizer.INSTANCE);
        this.AudioAttributesImplApi21Parcelizer = getresolutionsizeRemoteActionCompatParcelizer3;
        this.MediaBrowserCompatItemReceiver = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer3);
        AudioAttributesImplBaseParcelizer();
        AudioAttributesImplApi26Parcelizer();
    }

    public final setUpdatedStatus<isNetworkLocationPresent> IconCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public final setUpdatedStatus<Boolean> AudioAttributesCompatParcelizer() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    public final setUpdatedStatus<setMinUpdateDistanceMeters> read() {
        return this.MediaBrowserCompatItemReceiver;
    }

    static final class IconCompatParcelizer extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private Object AudioAttributesCompatParcelizer;
        private int IconCompatParcelizer;
        private Object RemoteActionCompatParcelizer;
        private int write;

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0099, code lost:
        
            if (r13.read.write.RemoteActionCompatParcelizer(r14.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(), r13) == r0) goto L20;
         */
        @Override // kotlin.getMonthName
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                r13 = this;
                java.lang.Object r0 = kotlin.getYear.IconCompatParcelizer()
                int r1 = r13.IconCompatParcelizer
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1f
                if (r1 == r3) goto L1b
                if (r1 != r2) goto L13
                kotlin.SdkPayloadData.IconCompatParcelizer(r14)
                goto L9c
            L13:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
                r13.<init>(r14)
                throw r13
            L1b:
                kotlin.SdkPayloadData.IconCompatParcelizer(r14)
                goto L33
            L1f:
                kotlin.SdkPayloadData.IconCompatParcelizer(r14)
                com.marrow2.ui.settings.kyc.authbridge.KycAuthBridgeViewModel r14 = com.marrow2.ui.settings.kyc.authbridge.KycAuthBridgeViewModel.this
                o.getDisplaySizeV17 r14 = com.marrow2.ui.settings.kyc.authbridge.KycAuthBridgeViewModel.write(r14)
                r1 = r13
                o.SampleVideos r1 = (kotlin.SampleVideos) r1
                r13.IconCompatParcelizer = r3
                java.lang.Object r14 = r14.onPlay(r1)
                if (r14 == r0) goto La4
            L33:
                o.getLocaleLanguageTagV21 r14 = (kotlin.getLocaleLanguageTagV21) r14
                com.marrow2.data.user.remote.model.onboarding.PhoneNumberDetails r1 = r14.onAddQueueItem()
                com.marrow2.ui.settings.kyc.authbridge.KycAuthBridgeViewModel r4 = com.marrow2.ui.settings.kyc.authbridge.KycAuthBridgeViewModel.this
                o.POJOPropertyBuilder5 r4 = com.marrow2.ui.settings.kyc.authbridge.KycAuthBridgeViewModel.IconCompatParcelizer(r4)
                java.lang.String r5 = "kyc_status"
                java.lang.Object r4 = r4.write(r5)
                java.lang.Integer r4 = (java.lang.Integer) r4
                if (r4 == 0) goto L4d
                int r3 = r4.intValue()
            L4d:
                com.marrow2.ui.settings.kyc.authbridge.KycAuthBridgeViewModel r4 = com.marrow2.ui.settings.kyc.authbridge.KycAuthBridgeViewModel.this
                o.getResolutionSize r12 = com.marrow2.ui.settings.kyc.authbridge.KycAuthBridgeViewModel.RemoteActionCompatParcelizer(r4)
                java.lang.String r4 = r1.getCountryCode()
                java.lang.String r1 = r1.getNationalNumber()
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                r5.append(r4)
                java.lang.String r4 = " - "
                r5.append(r4)
                r5.append(r1)
                java.lang.String r5 = r5.toString()
                o.isNetworkLocationPresent r1 = new o.isNetworkLocationPresent
                r6 = 0
                r7 = 0
                r8 = 0
                r10 = 14
                r11 = 0
                r4 = r1
                r9 = r3
                r4.<init>(r5, r6, r7, r8, r9, r10, r11)
                r12.write(r1)
                com.marrow2.ui.settings.kyc.authbridge.KycAuthBridgeViewModel r1 = com.marrow2.ui.settings.kyc.authbridge.KycAuthBridgeViewModel.this
                o.skipShortTermReferencePictureSets r1 = com.marrow2.ui.settings.kyc.authbridge.KycAuthBridgeViewModel.AudioAttributesCompatParcelizer(r1)
                java.lang.String r14 = r14.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver()
                r4 = r13
                o.SampleVideos r4 = (kotlin.SampleVideos) r4
                r5 = 0
                r13.RemoteActionCompatParcelizer = r5
                r13.AudioAttributesCompatParcelizer = r5
                r13.write = r3
                r13.IconCompatParcelizer = r2
                java.lang.Object r14 = r1.RemoteActionCompatParcelizer(r14, r4)
                if (r14 != r0) goto L9c
                goto La4
            L9c:
                com.marrow2.ui.settings.kyc.authbridge.KycAuthBridgeViewModel r13 = com.marrow2.ui.settings.kyc.authbridge.KycAuthBridgeViewModel.this
                com.marrow2.ui.settings.kyc.authbridge.KycAuthBridgeViewModel.AudioAttributesImplApi26Parcelizer(r13)
                o.getShowPopup r13 = kotlin.getShowPopup.INSTANCE
                return r13
            La4:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.settings.kyc.authbridge.KycAuthBridgeViewModel.IconCompatParcelizer.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        IconCompatParcelizer(SampleVideos<? super IconCompatParcelizer> sampleVideos) {
            super(1, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return KycAuthBridgeViewModel.this.new IconCompatParcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((IconCompatParcelizer) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void AudioAttributesImplApi26Parcelizer() {
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new IconCompatParcelizer(null), new MagicModuleSubmissionRequestBody() { // from class: o.LocationSettingsStatusCodes
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return KycAuthBridgeViewModel.read(this.RemoteActionCompatParcelizer, (String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(KycAuthBridgeViewModel kycAuthBridgeViewModel, String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        kycAuthBridgeViewModel.AudioAttributesImplApi21Parcelizer.write(new setMinUpdateDistanceMeters.IconCompatParcelizer(str));
        return getShowPopup.INSTANCE;
    }

    public final void read(setIntervalMillis p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, setIntervalMillis.write.INSTANCE)) {
            this.AudioAttributesImplApi21Parcelizer.write(setMinUpdateDistanceMeters.AudioAttributesCompatParcelizer.INSTANCE);
            return;
        }
        if (p0 instanceof setIntervalMillis.read) {
            this.MediaBrowserCompatCustomActionResultReceiver.write(Boolean.TRUE);
            CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new read(p0, null), new MagicModuleSubmissionRequestBody() { // from class: o.isLocationUsable
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return KycAuthBridgeViewModel.RemoteActionCompatParcelizer(this.write, (String) obj2);
                }
            });
        } else if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, setIntervalMillis.AudioAttributesCompatParcelizer.INSTANCE)) {
            AudioAttributesImplApi26Parcelizer();
            AudioAttributesImplApi21Parcelizer();
        } else {
            if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, setIntervalMillis.RemoteActionCompatParcelizer.INSTANCE)) {
                throw new RenewEligibleCreator();
            }
            this.AudioAttributesImplApi21Parcelizer.write(setMinUpdateDistanceMeters.RemoteActionCompatParcelizer.INSTANCE);
        }
    }

    static final class read extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int AudioAttributesCompatParcelizer;
        private /* synthetic */ setIntervalMillis IconCompatParcelizer;

        /* JADX WARN: Code restructure failed: missing block: B:13:0x004a, code lost:
        
            if (r5.RemoteActionCompatParcelizer.read.read(3, r5) == r0) goto L17;
         */
        @Override // kotlin.getMonthName
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = kotlin.getYear.IconCompatParcelizer()
                int r1 = r5.AudioAttributesCompatParcelizer
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                kotlin.SdkPayloadData.IconCompatParcelizer(r6)
                goto L4d
            L12:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L1a:
                kotlin.SdkPayloadData.IconCompatParcelizer(r6)
                goto L3a
            L1e:
                kotlin.SdkPayloadData.IconCompatParcelizer(r6)
                com.marrow2.ui.settings.kyc.authbridge.KycAuthBridgeViewModel r6 = com.marrow2.ui.settings.kyc.authbridge.KycAuthBridgeViewModel.this
                o.skipShortTermReferencePictureSets r6 = com.marrow2.ui.settings.kyc.authbridge.KycAuthBridgeViewModel.AudioAttributesCompatParcelizer(r6)
                o.setIntervalMillis r1 = r5.IconCompatParcelizer
                o.setIntervalMillis$read r1 = (o.setIntervalMillis.read) r1
                java.lang.String r1 = r1.AudioAttributesCompatParcelizer()
                r4 = r5
                o.SampleVideos r4 = (kotlin.SampleVideos) r4
                r5.AudioAttributesCompatParcelizer = r3
                java.lang.Object r6 = r6.AudioAttributesCompatParcelizer(r1, r4)
                if (r6 == r0) goto L69
            L3a:
                com.marrow2.ui.settings.kyc.authbridge.KycAuthBridgeViewModel r6 = com.marrow2.ui.settings.kyc.authbridge.KycAuthBridgeViewModel.this
                o.getDisplaySizeV17 r6 = com.marrow2.ui.settings.kyc.authbridge.KycAuthBridgeViewModel.write(r6)
                r1 = r5
                o.SampleVideos r1 = (kotlin.SampleVideos) r1
                r5.AudioAttributesCompatParcelizer = r2
                r2 = 3
                java.lang.Object r6 = r6.read(r2, r1)
                if (r6 != r0) goto L4d
                goto L69
            L4d:
                com.marrow2.ui.settings.kyc.authbridge.KycAuthBridgeViewModel r6 = com.marrow2.ui.settings.kyc.authbridge.KycAuthBridgeViewModel.this
                o.getResolutionSize r6 = com.marrow2.ui.settings.kyc.authbridge.KycAuthBridgeViewModel.AudioAttributesImplBaseParcelizer(r6)
                r0 = 0
                java.lang.Boolean r0 = kotlin.QBankStatsResponse.AudioAttributesCompatParcelizer(r0)
                r6.write(r0)
                com.marrow2.ui.settings.kyc.authbridge.KycAuthBridgeViewModel r5 = com.marrow2.ui.settings.kyc.authbridge.KycAuthBridgeViewModel.this
                o.getResolutionSize r5 = com.marrow2.ui.settings.kyc.authbridge.KycAuthBridgeViewModel.read(r5)
                o.setMinUpdateDistanceMeters$write r6 = o.setMinUpdateDistanceMeters.write.INSTANCE
                r5.write(r6)
                o.getShowPopup r5 = kotlin.getShowPopup.INSTANCE
                return r5
            L69:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.settings.kyc.authbridge.KycAuthBridgeViewModel.read.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        read(setIntervalMillis setintervalmillis, SampleVideos<? super read> sampleVideos) {
            super(1, sampleVideos);
            this.IconCompatParcelizer = setintervalmillis;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return KycAuthBridgeViewModel.this.new read(this.IconCompatParcelizer, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((read) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup RemoteActionCompatParcelizer(KycAuthBridgeViewModel kycAuthBridgeViewModel, String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        kycAuthBridgeViewModel.AudioAttributesImplApi21Parcelizer.write(new setMinUpdateDistanceMeters.IconCompatParcelizer(str));
        kycAuthBridgeViewModel.MediaBrowserCompatCustomActionResultReceiver.write(Boolean.FALSE);
        return getShowPopup.INSTANCE;
    }

    private final void AudioAttributesImplApi21Parcelizer() {
        if (this.AudioAttributesImplApi26Parcelizer > 2) {
            getResolutionSize<isNetworkLocationPresent> getresolutionsize = this.AudioAttributesCompatParcelizer;
            getresolutionsize.write(isNetworkLocationPresent.read(getresolutionsize.IconCompatParcelizer(), null, false, LocationStatusCodes.RemoteActionCompatParcelizer, 0, 0, 27));
        } else {
            AudioAttributesImplBaseParcelizer();
            getResolutionSize<isNetworkLocationPresent> getresolutionsize2 = this.AudioAttributesCompatParcelizer;
            getresolutionsize2.write(isNetworkLocationPresent.read(getresolutionsize2.IconCompatParcelizer(), null, false, LocationStatusCodes.AudioAttributesCompatParcelizer, 0, 0, 27));
        }
    }

    static final class write extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int AudioAttributesCompatParcelizer;
        private int IconCompatParcelizer;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0054  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x002e -> B:13:0x0031). Please report as a decompilation issue!!! */
        @Override // kotlin.getMonthName
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                r10 = this;
                java.lang.Object r0 = kotlin.getYear.IconCompatParcelizer()
                int r1 = r10.IconCompatParcelizer
                r2 = 1
                if (r1 == 0) goto L19
                if (r1 != r2) goto L11
                int r1 = r10.AudioAttributesCompatParcelizer
                kotlin.SdkPayloadData.IconCompatParcelizer(r11)
                goto L31
            L11:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r11)
                throw r10
            L19:
                kotlin.SdkPayloadData.IconCompatParcelizer(r11)
                r11 = 60
                r1 = r11
            L1f:
                if (r1 < 0) goto L54
                r11 = r10
                o.SampleVideos r11 = (kotlin.SampleVideos) r11
                r10.AudioAttributesCompatParcelizer = r1
                r10.IconCompatParcelizer = r2
                r3 = 1000(0x3e8, double:4.94E-321)
                java.lang.Object r11 = kotlin.setCountry.IconCompatParcelizer(r3, r11)
                if (r11 != r0) goto L31
                return r0
            L31:
                com.marrow2.ui.settings.kyc.authbridge.KycAuthBridgeViewModel r11 = com.marrow2.ui.settings.kyc.authbridge.KycAuthBridgeViewModel.this
                o.getResolutionSize r11 = com.marrow2.ui.settings.kyc.authbridge.KycAuthBridgeViewModel.RemoteActionCompatParcelizer(r11)
                com.marrow2.ui.settings.kyc.authbridge.KycAuthBridgeViewModel r3 = com.marrow2.ui.settings.kyc.authbridge.KycAuthBridgeViewModel.this
                o.getResolutionSize r3 = com.marrow2.ui.settings.kyc.authbridge.KycAuthBridgeViewModel.RemoteActionCompatParcelizer(r3)
                java.lang.Object r3 = r3.IconCompatParcelizer()
                o.isNetworkLocationPresent r3 = (kotlin.isNetworkLocationPresent) r3
                r4 = 0
                r5 = 0
                r6 = 0
                r8 = 0
                r9 = 23
                r7 = r1
                o.isNetworkLocationPresent r3 = kotlin.isNetworkLocationPresent.read(r3, r4, r5, r6, r7, r8, r9)
                r11.write(r3)
                int r1 = r1 + (-1)
                goto L1f
            L54:
                com.marrow2.ui.settings.kyc.authbridge.KycAuthBridgeViewModel r11 = com.marrow2.ui.settings.kyc.authbridge.KycAuthBridgeViewModel.this
                o.getResolutionSize r11 = com.marrow2.ui.settings.kyc.authbridge.KycAuthBridgeViewModel.RemoteActionCompatParcelizer(r11)
                com.marrow2.ui.settings.kyc.authbridge.KycAuthBridgeViewModel r0 = com.marrow2.ui.settings.kyc.authbridge.KycAuthBridgeViewModel.this
                o.getResolutionSize r0 = com.marrow2.ui.settings.kyc.authbridge.KycAuthBridgeViewModel.RemoteActionCompatParcelizer(r0)
                java.lang.Object r0 = r0.IconCompatParcelizer()
                r1 = r0
                o.isNetworkLocationPresent r1 = (kotlin.isNetworkLocationPresent) r1
                o.LocationStatusCodes r4 = kotlin.LocationStatusCodes.AudioAttributesCompatParcelizer
                r2 = 0
                r3 = 0
                r5 = 0
                r6 = 0
                r7 = 27
                o.isNetworkLocationPresent r0 = kotlin.isNetworkLocationPresent.read(r1, r2, r3, r4, r5, r6, r7)
                r11.write(r0)
                com.marrow2.ui.settings.kyc.authbridge.KycAuthBridgeViewModel r10 = com.marrow2.ui.settings.kyc.authbridge.KycAuthBridgeViewModel.this
                o.getResolutionSize r10 = com.marrow2.ui.settings.kyc.authbridge.KycAuthBridgeViewModel.read(r10)
                o.setMinUpdateDistanceMeters$RemoteActionCompatParcelizer r11 = o.setMinUpdateDistanceMeters.RemoteActionCompatParcelizer.INSTANCE
                r10.write(r11)
                o.getShowPopup r10 = kotlin.getShowPopup.INSTANCE
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.settings.kyc.authbridge.KycAuthBridgeViewModel.write.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        write(SampleVideos<? super write> sampleVideos) {
            super(2, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return KycAuthBridgeViewModel.this.new write(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((write) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void AudioAttributesImplBaseParcelizer() {
        this.AudioAttributesImplApi26Parcelizer++;
        C0201setMcqCount.IconCompatParcelizer(TypeResolutionContextBasic.write(this), null, null, new write(null), 3);
    }
}
