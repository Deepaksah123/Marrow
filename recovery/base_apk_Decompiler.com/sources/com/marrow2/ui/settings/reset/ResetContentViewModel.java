package com.marrow2.ui.settings.reset;

import com.marrow2.data.user.remote.model.ResetContentInfoResponse;
import com.marrow2.ui.settings.reset.ResetContentViewModel;
import java.util.List;
import kotlin.CmcdHeadersFactoryCmcdObjectBuilder;
import kotlin.CmcdHeadersFactoryCmcdStatus;
import kotlin.MagicModuleSubmissionRequestBody;
import kotlin.Metadata;
import kotlin.POJOPropertyBuilderWithMember;
import kotlin.QBankStatsResponse;
import kotlin.RenewEligibleCreator;
import kotlin.SampleVideos;
import kotlin.SdkPayloadData;
import kotlin.StreetViewPanoramaViewzzb;
import kotlin.SupportMapFragmentzza;
import kotlin.SupportMapFragmentzzb;
import kotlin.SupportStreetViewPanoramaFragmentzza;
import kotlin.ThemeState;
import kotlin.TypeResolutionContextBasic;
import kotlin.VerifyNewNumberRequest;
import kotlin.beginSection;
import kotlin.getAnswerMap;
import kotlin.getDisplaySizeV17;
import kotlin.getMagicModuleStats;
import kotlin.getResolutionSize;
import kotlin.getShowPopup;
import kotlin.getYear;
import kotlin.isDark;
import kotlin.isIndoorLevelPickerEnabled;
import kotlin.isMapToolbarEnabled;
import kotlin.isSeekPending;
import kotlin.postAtFrontOfQueue;
import kotlin.setSdkPayload;
import kotlin.setStartTime;
import kotlin.setUpdatedStatus;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0016R\u0014\u0010\f\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0018R\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001bR\u001d\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001a0\u001c8\u0007¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\f\u0010\u001fR\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u00198\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u001bR \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020 0\"8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b\u0017\u0010%R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020'0&8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\f\u0010(R \u0010#\u001a\b\u0012\u0004\u0012\u00020'0\"8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010$\u001a\u0004\b\u000f\u0010%"}, d2 = {"Lcom/marrow2/ui/settings/reset/ResetContentViewModel;", "Lo/POJOPropertyBuilderWithMember;", "Lo/beginSection;", "p0", "Lo/getDisplaySizeV17;", "p1", "Lo/isSeekPending;", "p2", "<init>", "(Lo/beginSection;Lo/getDisplaySizeV17;Lo/isSeekPending;)V", "Lo/SupportMapFragmentzza;", "", "read", "(Lo/SupportMapFragmentzza;)V", "Lo/StreetViewPanoramaViewzzb;", "AudioAttributesCompatParcelizer", "(Lo/StreetViewPanoramaViewzzb;)V", "AudioAttributesImplApi21Parcelizer", "()V", "MediaBrowserCompatCustomActionResultReceiver", "Lo/beginSection;", "write", "Lo/getDisplaySizeV17;", "IconCompatParcelizer", "Lo/isSeekPending;", "Lo/getResolutionSize;", "", "Lo/getResolutionSize;", "Lo/setUpdatedStatus;", "RemoteActionCompatParcelizer", "Lo/setUpdatedStatus;", "()Lo/setUpdatedStatus;", "Lo/SupportStreetViewPanoramaFragmentzza;", "AudioAttributesImplBaseParcelizer", "Lo/isDark;", "AudioAttributesImplApi26Parcelizer", "Lo/isDark;", "()Lo/isDark;", "Lo/CmcdHeadersFactoryCmcdStatus;", "Lo/SupportMapFragmentzzb;", "Lo/CmcdHeadersFactoryCmcdStatus;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ResetContentViewModel extends POJOPropertyBuilderWithMember {
    private final getResolutionSize<Boolean> AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private final getDisplaySizeV17 IconCompatParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private final isDark<SupportStreetViewPanoramaFragmentzza> AudioAttributesImplApi21Parcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private final isDark<SupportMapFragmentzzb> AudioAttributesImplApi26Parcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final getResolutionSize<SupportStreetViewPanoramaFragmentzza> AudioAttributesImplBaseParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private final beginSection write;
    private final setUpdatedStatus<Boolean> RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final CmcdHeadersFactoryCmcdStatus<SupportMapFragmentzzb> MediaBrowserCompatCustomActionResultReceiver;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final isSeekPending read;

    @setSdkPayload
    public ResetContentViewModel(beginSection beginsection, getDisplaySizeV17 getdisplaysizev17, isSeekPending isseekpending) {
        toMagicModuleMetaRepoModel.write(beginsection, "");
        toMagicModuleMetaRepoModel.write(getdisplaysizev17, "");
        toMagicModuleMetaRepoModel.write(isseekpending, "");
        this.write = beginsection;
        this.IconCompatParcelizer = getdisplaysizev17;
        this.read = isseekpending;
        getResolutionSize<Boolean> getresolutionsizeRemoteActionCompatParcelizer = setStartTime.RemoteActionCompatParcelizer(Boolean.FALSE);
        this.AudioAttributesCompatParcelizer = getresolutionsizeRemoteActionCompatParcelizer;
        this.RemoteActionCompatParcelizer = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer);
        getResolutionSize<SupportStreetViewPanoramaFragmentzza> getresolutionsizeRemoteActionCompatParcelizer2 = setStartTime.RemoteActionCompatParcelizer(new SupportStreetViewPanoramaFragmentzza(null, null, 3, null));
        this.AudioAttributesImplBaseParcelizer = getresolutionsizeRemoteActionCompatParcelizer2;
        this.AudioAttributesImplApi21Parcelizer = VerifyNewNumberRequest.IconCompatParcelizer((ThemeState) getresolutionsizeRemoteActionCompatParcelizer2);
        CmcdHeadersFactoryCmcdStatus<SupportMapFragmentzzb> cmcdHeadersFactoryCmcdStatus = new CmcdHeadersFactoryCmcdStatus<>(SupportMapFragmentzzb.read.INSTANCE);
        this.MediaBrowserCompatCustomActionResultReceiver = cmcdHeadersFactoryCmcdStatus;
        this.AudioAttributesImplApi26Parcelizer = cmcdHeadersFactoryCmcdStatus.AudioAttributesCompatParcelizer();
        getresolutionsizeRemoteActionCompatParcelizer.write(Boolean.TRUE);
        AudioAttributesImplApi21Parcelizer();
    }

    public final setUpdatedStatus<Boolean> read() {
        return this.RemoteActionCompatParcelizer;
    }

    public final isDark<SupportStreetViewPanoramaFragmentzza> IconCompatParcelizer() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    public final isDark<SupportMapFragmentzzb> AudioAttributesCompatParcelizer() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    public final void read(SupportMapFragmentzza p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        if (!(p0 instanceof SupportMapFragmentzza.read)) {
            throw new RenewEligibleCreator();
        }
        AudioAttributesCompatParcelizer(((SupportMapFragmentzza.read) p0).write());
    }

    static final class IconCompatParcelizer extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int RemoteActionCompatParcelizer;
        private /* synthetic */ StreetViewPanoramaViewzzb write;

        public static final /* synthetic */ class read {
            public static final /* synthetic */ int[] write;

            static {
                int[] iArr = new int[StreetViewPanoramaViewzzb.values().length];
                try {
                    iArr[StreetViewPanoramaViewzzb.RemoteActionCompatParcelizer.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[StreetViewPanoramaViewzzb.read.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[StreetViewPanoramaViewzzb.write.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[StreetViewPanoramaViewzzb.IconCompatParcelizer.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                write = iArr;
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x0072, code lost:
        
            if (r7.IconCompatParcelizer.write.MediaBrowserCompatCustomActionResultReceiver(r7) != r0) goto L32;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x008a, code lost:
        
            if (r7.IconCompatParcelizer.write.IconCompatParcelizer(r7) == r0) goto L30;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x009c, code lost:
        
            if (r7.IconCompatParcelizer.write.MediaBrowserCompatCustomActionResultReceiver(r7) == r0) goto L30;
         */
        @Override // kotlin.getMonthName
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = kotlin.getYear.IconCompatParcelizer()
                int r1 = r7.RemoteActionCompatParcelizer
                r2 = 4
                r3 = 3
                r4 = 2
                r5 = 1
                if (r1 == 0) goto L26
                if (r1 == r5) goto L21
                if (r1 == r4) goto L21
                if (r1 == r3) goto L1d
                if (r1 != r2) goto L15
                goto L21
            L15:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L1d:
                kotlin.SdkPayloadData.IconCompatParcelizer(r8)
                goto L63
            L21:
                kotlin.SdkPayloadData.IconCompatParcelizer(r8)
                goto La1
            L26:
                kotlin.SdkPayloadData.IconCompatParcelizer(r8)
                com.marrow2.ui.settings.reset.ResetContentViewModel r8 = com.marrow2.ui.settings.reset.ResetContentViewModel.this
                o.isSeekPending r8 = com.marrow2.ui.settings.reset.ResetContentViewModel.AudioAttributesCompatParcelizer(r8)
                o.isPassive r1 = kotlin.isPassive.INSTANCE
                o.StreetViewPanoramaViewzzb r1 = r7.write
                o.getSubscriptionExpiresOn r1 = kotlin.isPassive.RemoteActionCompatParcelizer(r1)
                o.updateLoadingFinished r6 = kotlin.updateLoadingFinished.IconCompatParcelizer
                java.util.List r6 = kotlin.IntermediateLoginResponseBody.RemoteActionCompatParcelizer(r6)
                r8.write(r1, r6)
                o.StreetViewPanoramaViewzzb r8 = r7.write
                int[] r1 = com.marrow2.ui.settings.reset.ResetContentViewModel.IconCompatParcelizer.read.write
                int r8 = r8.ordinal()
                r8 = r1[r8]
                if (r8 == r5) goto L9f
                if (r8 == r4) goto L8d
                if (r8 == r3) goto L7b
                if (r8 != r2) goto L75
                com.marrow2.ui.settings.reset.ResetContentViewModel r8 = com.marrow2.ui.settings.reset.ResetContentViewModel.this
                o.beginSection r8 = com.marrow2.ui.settings.reset.ResetContentViewModel.write(r8)
                r1 = r7
                o.SampleVideos r1 = (kotlin.SampleVideos) r1
                r7.RemoteActionCompatParcelizer = r3
                java.lang.Object r8 = r8.IconCompatParcelizer(r1)
                if (r8 == r0) goto L9e
            L63:
                com.marrow2.ui.settings.reset.ResetContentViewModel r8 = com.marrow2.ui.settings.reset.ResetContentViewModel.this
                o.beginSection r8 = com.marrow2.ui.settings.reset.ResetContentViewModel.write(r8)
                r1 = r7
                o.SampleVideos r1 = (kotlin.SampleVideos) r1
                r7.RemoteActionCompatParcelizer = r2
                java.lang.Object r8 = r8.MediaBrowserCompatCustomActionResultReceiver(r1)
                if (r8 != r0) goto La1
                goto L9e
            L75:
                o.RenewEligibleCreator r7 = new o.RenewEligibleCreator
                r7.<init>()
                throw r7
            L7b:
                com.marrow2.ui.settings.reset.ResetContentViewModel r8 = com.marrow2.ui.settings.reset.ResetContentViewModel.this
                o.beginSection r8 = com.marrow2.ui.settings.reset.ResetContentViewModel.write(r8)
                r1 = r7
                o.SampleVideos r1 = (kotlin.SampleVideos) r1
                r7.RemoteActionCompatParcelizer = r4
                java.lang.Object r8 = r8.IconCompatParcelizer(r1)
                if (r8 != r0) goto La1
                goto L9e
            L8d:
                com.marrow2.ui.settings.reset.ResetContentViewModel r8 = com.marrow2.ui.settings.reset.ResetContentViewModel.this
                o.beginSection r8 = com.marrow2.ui.settings.reset.ResetContentViewModel.write(r8)
                r1 = r7
                o.SampleVideos r1 = (kotlin.SampleVideos) r1
                r7.RemoteActionCompatParcelizer = r5
                java.lang.Object r8 = r8.MediaBrowserCompatCustomActionResultReceiver(r1)
                if (r8 != r0) goto La1
            L9e:
                return r0
            L9f:
                o.getShowPopup r8 = kotlin.getShowPopup.INSTANCE
            La1:
                com.marrow2.ui.settings.reset.ResetContentViewModel r7 = com.marrow2.ui.settings.reset.ResetContentViewModel.this
                o.CmcdHeadersFactoryCmcdStatus r7 = com.marrow2.ui.settings.reset.ResetContentViewModel.MediaBrowserCompatItemReceiver(r7)
                o.SupportMapFragmentzzb$write r8 = o.SupportMapFragmentzzb.write.INSTANCE
                r7.IconCompatParcelizer(r8)
                o.getShowPopup r7 = kotlin.getShowPopup.INSTANCE
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.settings.reset.ResetContentViewModel.IconCompatParcelizer.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IconCompatParcelizer(StreetViewPanoramaViewzzb streetViewPanoramaViewzzb, SampleVideos<? super IconCompatParcelizer> sampleVideos) {
            super(1, sampleVideos);
            this.write = streetViewPanoramaViewzzb;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return ResetContentViewModel.this.new IconCompatParcelizer(this.write, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((IconCompatParcelizer) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void AudioAttributesCompatParcelizer(StreetViewPanoramaViewzzb p0) {
        this.MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer(SupportMapFragmentzzb.RemoteActionCompatParcelizer.INSTANCE);
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new IconCompatParcelizer(p0, null), new MagicModuleSubmissionRequestBody() { // from class: o.streetNamesEnabled
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return ResetContentViewModel.write(this.RemoteActionCompatParcelizer, (String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup write(ResetContentViewModel resetContentViewModel, String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        resetContentViewModel.MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer(new SupportMapFragmentzzb.IconCompatParcelizer(str));
        return getShowPopup.INSTANCE;
    }

    static final class RemoteActionCompatParcelizer extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int AudioAttributesCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.AudioAttributesCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.AudioAttributesCompatParcelizer = 1;
                obj = ResetContentViewModel.this.IconCompatParcelizer.AudioAttributesImplBaseParcelizer(this);
                if (obj == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            postAtFrontOfQueue postatfrontofqueue = (postAtFrontOfQueue) obj;
            List<isMapToolbarEnabled> listAudioAttributesCompatParcelizer = isIndoorLevelPickerEnabled.AudioAttributesCompatParcelizer(postatfrontofqueue);
            ResetContentViewModel.this.AudioAttributesCompatParcelizer.write(QBankStatsResponse.AudioAttributesCompatParcelizer(false));
            getResolutionSize getresolutionsize = ResetContentViewModel.this.AudioAttributesImplBaseParcelizer;
            ResetContentInfoResponse.ScreenCopy screenCopyRemoteActionCompatParcelizer = postatfrontofqueue.RemoteActionCompatParcelizer();
            String screenTitle = screenCopyRemoteActionCompatParcelizer != null ? screenCopyRemoteActionCompatParcelizer.getScreenTitle() : null;
            if (screenTitle == null) {
                screenTitle = "";
            }
            getresolutionsize.write(SupportStreetViewPanoramaFragmentzza.IconCompatParcelizer(screenTitle, listAudioAttributesCompatParcelizer));
            return getShowPopup.INSTANCE;
        }

        RemoteActionCompatParcelizer(SampleVideos<? super RemoteActionCompatParcelizer> sampleVideos) {
            super(1, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return ResetContentViewModel.this.new RemoteActionCompatParcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((RemoteActionCompatParcelizer) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void AudioAttributesImplApi21Parcelizer() {
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new RemoteActionCompatParcelizer(null), new MagicModuleSubmissionRequestBody() { // from class: o.userNavigationEnabled
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return ResetContentViewModel.AudioAttributesCompatParcelizer(this.read, (String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesCompatParcelizer(ResetContentViewModel resetContentViewModel, String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        resetContentViewModel.AudioAttributesCompatParcelizer.write(Boolean.FALSE);
        resetContentViewModel.MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer(new SupportMapFragmentzzb.IconCompatParcelizer(str));
        return getShowPopup.INSTANCE;
    }
}
