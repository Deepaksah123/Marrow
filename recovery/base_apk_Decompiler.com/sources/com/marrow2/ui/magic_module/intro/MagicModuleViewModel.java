package com.marrow2.ui.magic_module.intro;

import com.marrow2.ui.magic_module.intro.MagicModuleViewModel;
import kotlin.CmcdHeadersFactoryCmcdObjectBuilder;
import kotlin.IntermediateLoginResponseBody;
import kotlin.LogLogLevel;
import kotlin.MagicModuleSubmissionRequestBody;
import kotlin.Metadata;
import kotlin.POJOPropertyBuilderWithMember;
import kotlin.RenewEligibleCreator;
import kotlin.SampleVideos;
import kotlin.SdkPayloadData;
import kotlin.TypeResolutionContextBasic;
import kotlin.VerifyNewNumberRequest;
import kotlin.getAnswerMap;
import kotlin.getMagicModuleStats;
import kotlin.getResolutionSize;
import kotlin.getShowPopup;
import kotlin.getTotalMcq;
import kotlin.getYear;
import kotlin.isSeekPending;
import kotlin.lambdaregister0comgoogleandroidexoplayer2utilNetworkTypeObserver;
import kotlin.onConnectionFailed;
import kotlin.resetForTests;
import kotlin.setNoBytesRemainingAndMaybeStoreLength;
import kotlin.setSdkPayload;
import kotlin.setStartTime;
import kotlin.setUpdatedStatus;
import kotlin.toMagicModuleMetaRepoModel;
import kotlin.updateLoadingFinished;
import kotlin.zaaj;
import kotlin.zaao;
import kotlin.zaap;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\fH\u0082@¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0015\u0010\u000eJ\u0018\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0016H\u0082@¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0019\u0010\u000eJ\u000f\u0010\u001a\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001a\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001bR\u0014\u0010\u0013\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0017\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001eR\u0014\u0010!\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00160\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u001d\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00160&8\u0007¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b\u001f\u0010)R\u001c\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010*0\"8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b%\u0010$R\"\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010*0&8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010(\u001a\u0004\b\u0013\u0010)R\u001c\u0010,\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010+0\"8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010$R\"\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010+0&8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010(\u001a\u0004\b\u0017\u0010)R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020.0\"8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010$R \u0010-\u001a\b\u0012\u0004\u0012\u00020.0&8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010(\u001a\u0004\b%\u0010)R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\"8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b,\u0010$R \u00100\u001a\b\u0012\u0004\u0012\u00020\u00160&8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b/\u0010(\u001a\u0004\b#\u0010)R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u0002010\"8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010$R\u001a\u0010'\u001a\b\u0012\u0004\u0012\u0002010&8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010(R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00160\"8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b!\u0010$R \u0010/\u001a\b\u0012\u0004\u0012\u00020\u00160&8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b0\u0010(\u001a\u0004\b,\u0010)"}, d2 = {"Lcom/marrow2/ui/magic_module/intro/MagicModuleViewModel;", "Lo/POJOPropertyBuilderWithMember;", "Lo/LogLogLevel;", "p0", "Lo/lambdaregister0comgoogleandroidexoplayer2utilNetworkTypeObserver;", "p1", "Lo/resetForTests;", "p2", "Lo/isSeekPending;", "p3", "<init>", "(Lo/LogLogLevel;Lo/lambdaregister0comgoogleandroidexoplayer2utilNetworkTypeObserver;Lo/resetForTests;Lo/isSeekPending;)V", "", "RatingCompat", "()V", "MediaBrowserCompatItemReceiver", "Lo/zaao;", "write", "(Lo/zaao;)V", "AudioAttributesCompatParcelizer", "(Lo/SampleVideos;)Ljava/lang/Object;", "MediaDescriptionCompat", "", "read", "(ZLo/SampleVideos;)Ljava/lang/Object;", "AudioAttributesImplApi26Parcelizer", "MediaBrowserCompatMediaItem", "Lo/LogLogLevel;", "MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver", "Lo/lambdaregister0comgoogleandroidexoplayer2utilNetworkTypeObserver;", "Lo/resetForTests;", "AudioAttributesImplApi21Parcelizer", "Lo/isSeekPending;", "RemoteActionCompatParcelizer", "Lo/getResolutionSize;", "AudioAttributesImplBaseParcelizer", "Lo/getResolutionSize;", "IconCompatParcelizer", "Lo/setUpdatedStatus;", "handleMediaPlayPauseIfPendingOnHandler", "Lo/setUpdatedStatus;", "()Lo/setUpdatedStatus;", "Lo/zaap;", "Lo/setNoBytesRemainingAndMaybeStoreLength;", "MediaBrowserCompatCustomActionResultReceiver", "MediaBrowserCompatSearchResultReceiver", "Lo/zaaj;", "onCommand", "MediaMetadataCompat", ""}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class MagicModuleViewModel extends POJOPropertyBuilderWithMember {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final getResolutionSize<zaaj> RatingCompat;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private final isSeekPending RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private final LogLogLevel write;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private final getResolutionSize<Boolean> IconCompatParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final getResolutionSize<zaap> AudioAttributesImplApi26Parcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private final getResolutionSize<Boolean> MediaDescriptionCompat;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private final resetForTests read;

    /* JADX INFO: renamed from: MediaBrowserCompatMediaItem, reason: from kotlin metadata */
    private final setUpdatedStatus<zaaj> MediaBrowserCompatSearchResultReceiver;

    /* JADX INFO: renamed from: MediaBrowserCompatSearchResultReceiver, reason: from kotlin metadata */
    private final setUpdatedStatus<setNoBytesRemainingAndMaybeStoreLength> AudioAttributesImplApi21Parcelizer;

    /* JADX INFO: renamed from: MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, reason: from kotlin metadata */
    private final lambdaregister0comgoogleandroidexoplayer2utilNetworkTypeObserver AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: MediaDescriptionCompat, reason: from kotlin metadata */
    private final setUpdatedStatus<zaap> MediaBrowserCompatItemReceiver;

    /* JADX INFO: renamed from: MediaMetadataCompat, reason: from kotlin metadata */
    private final setUpdatedStatus<Boolean> onCommand;

    /* JADX INFO: renamed from: RatingCompat, reason: from kotlin metadata */
    private final setUpdatedStatus<String> handleMediaPlayPauseIfPendingOnHandler;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final getResolutionSize<Boolean> MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;

    /* JADX INFO: renamed from: handleMediaPlayPauseIfPendingOnHandler, reason: from kotlin metadata */
    private final setUpdatedStatus<Boolean> AudioAttributesImplBaseParcelizer;

    /* JADX INFO: renamed from: onCommand, reason: from kotlin metadata */
    private final setUpdatedStatus<Boolean> MediaMetadataCompat;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final getResolutionSize<setNoBytesRemainingAndMaybeStoreLength> MediaBrowserCompatCustomActionResultReceiver;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final getResolutionSize<String> MediaBrowserCompatMediaItem;

    static final class IconCompatParcelizer extends getTotalMcq {
        int AudioAttributesCompatParcelizer;
        Object IconCompatParcelizer;
        int RemoteActionCompatParcelizer;
        /* synthetic */ Object read;
        Object write;

        IconCompatParcelizer(SampleVideos<? super IconCompatParcelizer> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.read = obj;
            this.AudioAttributesCompatParcelizer |= Integer.MIN_VALUE;
            return MagicModuleViewModel.this.AudioAttributesCompatParcelizer(this);
        }
    }

    static final class write extends getTotalMcq {
        /* synthetic */ Object AudioAttributesCompatParcelizer;
        int read;
        boolean write;

        write(SampleVideos<? super write> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.AudioAttributesCompatParcelizer = obj;
            this.read |= Integer.MIN_VALUE;
            return MagicModuleViewModel.IconCompatParcelizer(MagicModuleViewModel.this, this);
        }
    }

    @setSdkPayload
    public MagicModuleViewModel(LogLogLevel logLogLevel, lambdaregister0comgoogleandroidexoplayer2utilNetworkTypeObserver lambdaregister0comgoogleandroidexoplayer2utilnetworktypeobserver, resetForTests resetfortests, isSeekPending isseekpending) {
        toMagicModuleMetaRepoModel.write(logLogLevel, "");
        toMagicModuleMetaRepoModel.write(lambdaregister0comgoogleandroidexoplayer2utilnetworktypeobserver, "");
        toMagicModuleMetaRepoModel.write(resetfortests, "");
        toMagicModuleMetaRepoModel.write(isseekpending, "");
        this.write = logLogLevel;
        this.AudioAttributesCompatParcelizer = lambdaregister0comgoogleandroidexoplayer2utilnetworktypeobserver;
        this.read = resetfortests;
        this.RemoteActionCompatParcelizer = isseekpending;
        getResolutionSize<Boolean> getresolutionsizeRemoteActionCompatParcelizer = setStartTime.RemoteActionCompatParcelizer(Boolean.TRUE);
        this.IconCompatParcelizer = getresolutionsizeRemoteActionCompatParcelizer;
        this.AudioAttributesImplBaseParcelizer = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer);
        getResolutionSize<zaap> getresolutionsizeRemoteActionCompatParcelizer2 = setStartTime.RemoteActionCompatParcelizer(null);
        this.AudioAttributesImplApi26Parcelizer = getresolutionsizeRemoteActionCompatParcelizer2;
        this.MediaBrowserCompatItemReceiver = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer2);
        getResolutionSize<setNoBytesRemainingAndMaybeStoreLength> getresolutionsizeRemoteActionCompatParcelizer3 = setStartTime.RemoteActionCompatParcelizer(null);
        this.MediaBrowserCompatCustomActionResultReceiver = getresolutionsizeRemoteActionCompatParcelizer3;
        this.AudioAttributesImplApi21Parcelizer = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer3);
        getResolutionSize<zaaj> getresolutionsizeRemoteActionCompatParcelizer4 = setStartTime.RemoteActionCompatParcelizer(zaaj.AudioAttributesCompatParcelizer.INSTANCE);
        this.RatingCompat = getresolutionsizeRemoteActionCompatParcelizer4;
        this.MediaBrowserCompatSearchResultReceiver = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer4);
        Boolean bool = Boolean.FALSE;
        getResolutionSize<Boolean> getresolutionsizeRemoteActionCompatParcelizer5 = setStartTime.RemoteActionCompatParcelizer(bool);
        this.MediaDescriptionCompat = getresolutionsizeRemoteActionCompatParcelizer5;
        this.MediaMetadataCompat = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer5);
        getResolutionSize<String> getresolutionsizeRemoteActionCompatParcelizer6 = setStartTime.RemoteActionCompatParcelizer("");
        this.MediaBrowserCompatMediaItem = getresolutionsizeRemoteActionCompatParcelizer6;
        this.handleMediaPlayPauseIfPendingOnHandler = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer6);
        getResolutionSize<Boolean> getresolutionsizeRemoteActionCompatParcelizer7 = setStartTime.RemoteActionCompatParcelizer(bool);
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = getresolutionsizeRemoteActionCompatParcelizer7;
        this.onCommand = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer7);
    }

    public static final /* synthetic */ Object IconCompatParcelizer(MagicModuleViewModel magicModuleViewModel, SampleVideos sampleVideos) {
        return magicModuleViewModel.read(false, (SampleVideos<? super getShowPopup>) sampleVideos);
    }

    public final setUpdatedStatus<Boolean> AudioAttributesImplApi21Parcelizer() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    public final setUpdatedStatus<zaap> AudioAttributesCompatParcelizer() {
        return this.MediaBrowserCompatItemReceiver;
    }

    public final setUpdatedStatus<setNoBytesRemainingAndMaybeStoreLength> read() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    public final setUpdatedStatus<zaaj> IconCompatParcelizer() {
        return this.MediaBrowserCompatSearchResultReceiver;
    }

    public final setUpdatedStatus<Boolean> AudioAttributesImplBaseParcelizer() {
        return this.MediaMetadataCompat;
    }

    public final setUpdatedStatus<Boolean> MediaBrowserCompatCustomActionResultReceiver() {
        return this.onCommand;
    }

    static final class AudioAttributesCompatParcelizer extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int AudioAttributesCompatParcelizer;
        private Object IconCompatParcelizer;
        private int RemoteActionCompatParcelizer;
        private Object read;

        /* JADX WARN: Code restructure failed: missing block: B:27:0x008b, code lost:
        
            if (r1.IconCompatParcelizer(r7, r6) == r0) goto L32;
         */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0062  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0077  */
        @Override // kotlin.getMonthName
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = kotlin.getYear.IconCompatParcelizer()
                int r1 = r6.AudioAttributesCompatParcelizer
                r2 = 4
                r3 = 3
                r4 = 2
                r5 = 1
                if (r1 == 0) goto L2d
                if (r1 == r5) goto L29
                if (r1 == r4) goto L25
                if (r1 == r3) goto L21
                if (r1 != r2) goto L19
                kotlin.SdkPayloadData.IconCompatParcelizer(r7)
                goto L8e
            L19:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L21:
                kotlin.SdkPayloadData.IconCompatParcelizer(r7)
                goto L73
            L25:
                kotlin.SdkPayloadData.IconCompatParcelizer(r7)
                goto L5a
            L29:
                kotlin.SdkPayloadData.IconCompatParcelizer(r7)
                goto L41
            L2d:
                kotlin.SdkPayloadData.IconCompatParcelizer(r7)
                com.marrow2.ui.magic_module.intro.MagicModuleViewModel r7 = com.marrow2.ui.magic_module.intro.MagicModuleViewModel.this
                o.lambdaregister0comgoogleandroidexoplayer2utilNetworkTypeObserver r7 = com.marrow2.ui.magic_module.intro.MagicModuleViewModel.AudioAttributesCompatParcelizer(r7)
                r1 = r6
                o.SampleVideos r1 = (kotlin.SampleVideos) r1
                r6.AudioAttributesCompatParcelizer = r5
                java.lang.Object r7 = r7.AudioAttributesImplApi21Parcelizer(r1)
                if (r7 == r0) goto L96
            L41:
                java.lang.Boolean r7 = (java.lang.Boolean) r7
                boolean r7 = r7.booleanValue()
                if (r7 == 0) goto L93
                com.marrow2.ui.magic_module.intro.MagicModuleViewModel r7 = com.marrow2.ui.magic_module.intro.MagicModuleViewModel.this
                o.lambdaregister0comgoogleandroidexoplayer2utilNetworkTypeObserver r7 = com.marrow2.ui.magic_module.intro.MagicModuleViewModel.AudioAttributesCompatParcelizer(r7)
                r1 = r6
                o.SampleVideos r1 = (kotlin.SampleVideos) r1
                r6.AudioAttributesCompatParcelizer = r4
                java.lang.Object r7 = r7.IconCompatParcelizer(r1)
                if (r7 == r0) goto L96
            L5a:
                java.lang.Boolean r7 = (java.lang.Boolean) r7
                boolean r7 = r7.booleanValue()
                if (r7 != 0) goto L8e
                com.marrow2.ui.magic_module.intro.MagicModuleViewModel r7 = com.marrow2.ui.magic_module.intro.MagicModuleViewModel.this
                o.lambdaregister0comgoogleandroidexoplayer2utilNetworkTypeObserver r7 = com.marrow2.ui.magic_module.intro.MagicModuleViewModel.AudioAttributesCompatParcelizer(r7)
                r1 = r6
                o.SampleVideos r1 = (kotlin.SampleVideos) r1
                r6.AudioAttributesCompatParcelizer = r3
                java.lang.Object r7 = r7.read(r1)
                if (r7 == r0) goto L96
            L73:
                java.lang.String r7 = (java.lang.String) r7
                if (r7 == 0) goto L8e
                com.marrow2.ui.magic_module.intro.MagicModuleViewModel r1 = com.marrow2.ui.magic_module.intro.MagicModuleViewModel.this
                o.resetForTests r1 = com.marrow2.ui.magic_module.intro.MagicModuleViewModel.read(r1)
                r3 = 0
                r6.IconCompatParcelizer = r3
                r6.read = r3
                r3 = 0
                r6.RemoteActionCompatParcelizer = r3
                r6.AudioAttributesCompatParcelizer = r2
                java.lang.Object r7 = r1.IconCompatParcelizer(r7, r6)
                if (r7 != r0) goto L8e
                goto L96
            L8e:
                com.marrow2.ui.magic_module.intro.MagicModuleViewModel r6 = com.marrow2.ui.magic_module.intro.MagicModuleViewModel.this
                com.marrow2.ui.magic_module.intro.MagicModuleViewModel.RemoteActionCompatParcelizer(r6)
            L93:
                o.getShowPopup r6 = kotlin.getShowPopup.INSTANCE
                return r6
            L96:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.magic_module.intro.MagicModuleViewModel.AudioAttributesCompatParcelizer.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        AudioAttributesCompatParcelizer(SampleVideos<? super AudioAttributesCompatParcelizer> sampleVideos) {
            super(1, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return MagicModuleViewModel.this.new AudioAttributesCompatParcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AudioAttributesCompatParcelizer) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void RatingCompat() {
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new AudioAttributesCompatParcelizer(null), new MagicModuleSubmissionRequestBody() { // from class: o.zaas
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return MagicModuleViewModel.read(this.write, (String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(MagicModuleViewModel magicModuleViewModel, String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        magicModuleViewModel.MediaBrowserCompatMediaItem.write(str);
        return getShowPopup.INSTANCE;
    }

    static final class read extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private Object AudioAttributesCompatParcelizer;
        private Object AudioAttributesImplApi21Parcelizer;
        private Object AudioAttributesImplApi26Parcelizer;
        private int AudioAttributesImplBaseParcelizer;
        private Object IconCompatParcelizer;
        private Object MediaBrowserCompatCustomActionResultReceiver;
        private boolean MediaBrowserCompatItemReceiver;
        private Object RemoteActionCompatParcelizer;
        private int read;
        private Object write;

        /* JADX WARN: Code restructure failed: missing block: B:23:0x00e5, code lost:
        
            if (r7 != r1) goto L24;
         */
        /* JADX WARN: Removed duplicated region for block: B:16:0x00ad A[PHI: r2 r7
          0x00ad: PHI (r2v8 boolean) = (r2v6 boolean), (r2v9 boolean) binds: [B:15:0x00ab, B:10:0x0071] A[DONT_GENERATE, DONT_INLINE]
          0x00ad: PHI (r7v5 java.lang.Object) = (r7v4 java.lang.Object), (r7v11 java.lang.Object) binds: [B:15:0x00ab, B:10:0x0071] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:18:0x00b5  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x00d1  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x00ed  */
        /* JADX WARN: Removed duplicated region for block: B:59:0x01ec  */
        /* JADX WARN: Removed duplicated region for block: B:65:0x0208  */
        @Override // kotlin.getMonthName
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r28) {
            /*
                Method dump skipped, instruction units count: 632
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.magic_module.intro.MagicModuleViewModel.read.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        read(SampleVideos<? super read> sampleVideos) {
            super(1, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return MagicModuleViewModel.this.new read(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((read) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void MediaBrowserCompatItemReceiver() {
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new read(null), new MagicModuleSubmissionRequestBody() { // from class: o.zaan
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return MagicModuleViewModel.AudioAttributesCompatParcelizer(this.read, (String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesCompatParcelizer(MagicModuleViewModel magicModuleViewModel, String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        magicModuleViewModel.IconCompatParcelizer.write(Boolean.FALSE);
        return getShowPopup.INSTANCE;
    }

    public final void write(zaao p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, zaao.AudioAttributesCompatParcelizer.INSTANCE)) {
            RatingCompat();
            return;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, zaao.RemoteActionCompatParcelizer.INSTANCE)) {
            MediaDescriptionCompat();
            return;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, zaao.write.INSTANCE)) {
            this.RatingCompat.write(zaaj.AudioAttributesCompatParcelizer.INSTANCE);
            return;
        }
        zaap zaapVar = null;
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, zaao.MediaBrowserCompatItemReceiver.INSTANCE)) {
            CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new RemoteActionCompatParcelizer(null), new MagicModuleSubmissionRequestBody() { // from class: o.zaar
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return MagicModuleViewModel.AudioAttributesCompatParcelizer((String) obj2);
                }
            });
            return;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, zaao.AudioAttributesImplApi26Parcelizer.INSTANCE)) {
            zaap zaapVarIconCompatParcelizer = this.AudioAttributesImplApi26Parcelizer.IconCompatParcelizer();
            Boolean boolValueOf = zaapVarIconCompatParcelizer != null ? Boolean.valueOf(zaapVarIconCompatParcelizer.getRemoteActionCompatParcelizer()) : null;
            if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(boolValueOf, Boolean.FALSE)) {
                getResolutionSize<zaap> getresolutionsize = this.AudioAttributesImplApi26Parcelizer;
                zaap zaapVarIconCompatParcelizer2 = getresolutionsize.IconCompatParcelizer();
                if (zaapVarIconCompatParcelizer2 != null) {
                    toMagicModuleMetaRepoModel.write(boolValueOf);
                    zaapVar = zaap.read(zaapVarIconCompatParcelizer2.MediaBrowserCompatItemReceiver, zaapVarIconCompatParcelizer2.AudioAttributesImplApi21Parcelizer, zaapVarIconCompatParcelizer2.AudioAttributesImplApi26Parcelizer, zaapVarIconCompatParcelizer2.IconCompatParcelizer, zaapVarIconCompatParcelizer2.read, zaapVarIconCompatParcelizer2.AudioAttributesImplBaseParcelizer, !boolValueOf.booleanValue(), zaapVarIconCompatParcelizer2.write, zaapVarIconCompatParcelizer2.AudioAttributesCompatParcelizer, zaapVarIconCompatParcelizer2.MediaBrowserCompatCustomActionResultReceiver);
                }
                getresolutionsize.write(zaapVar);
                return;
            }
            return;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, zaao.read.INSTANCE)) {
            this.RatingCompat.write(zaaj.AudioAttributesCompatParcelizer.INSTANCE);
        } else if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, zaao.IconCompatParcelizer.INSTANCE)) {
            this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.write(Boolean.FALSE);
        } else {
            if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, zaao.AudioAttributesImplApi21Parcelizer.INSTANCE)) {
                throw new RenewEligibleCreator();
            }
            this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.write(Boolean.TRUE);
        }
    }

    static final class RemoteActionCompatParcelizer extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.write;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.write = 1;
                if (MagicModuleViewModel.this.AudioAttributesCompatParcelizer(this) == objIconCompatParcelizer) {
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

        RemoteActionCompatParcelizer(SampleVideos<? super RemoteActionCompatParcelizer> sampleVideos) {
            super(1, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return MagicModuleViewModel.this.new RemoteActionCompatParcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((RemoteActionCompatParcelizer) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesCompatParcelizer(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00bd, code lost:
    
        if (read(r7, r0) != r1) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object AudioAttributesCompatParcelizer(kotlin.SampleVideos<? super kotlin.getShowPopup> r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof com.marrow2.ui.magic_module.intro.MagicModuleViewModel.IconCompatParcelizer
            if (r0 == 0) goto L14
            r0 = r11
            com.marrow2.ui.magic_module.intro.MagicModuleViewModel$IconCompatParcelizer r0 = (com.marrow2.ui.magic_module.intro.MagicModuleViewModel.IconCompatParcelizer) r0
            int r1 = r0.AudioAttributesCompatParcelizer
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r11 = r0.AudioAttributesCompatParcelizer
            int r11 = r11 + r2
            r0.AudioAttributesCompatParcelizer = r11
            goto L19
        L14:
            com.marrow2.ui.magic_module.intro.MagicModuleViewModel$IconCompatParcelizer r0 = new com.marrow2.ui.magic_module.intro.MagicModuleViewModel$IconCompatParcelizer
            r0.<init>(r11)
        L19:
            java.lang.Object r11 = r0.read
            java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
            int r2 = r0.AudioAttributesCompatParcelizer
            r3 = 5
            r4 = 4
            r5 = 3
            r6 = 2
            r7 = 0
            r8 = 1
            r9 = 0
            if (r2 == 0) goto L57
            if (r2 == r8) goto L53
            if (r2 == r6) goto L4f
            if (r2 == r5) goto L4b
            if (r2 == r4) goto L41
            if (r2 != r3) goto L39
            kotlin.SdkPayloadData.IconCompatParcelizer(r11)
            goto Lc0
        L39:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L41:
            int r2 = r0.RemoteActionCompatParcelizer
            java.lang.Object r2 = r0.IconCompatParcelizer
            java.lang.Object r2 = r0.write
            kotlin.SdkPayloadData.IconCompatParcelizer(r11)
            goto L9c
        L4b:
            kotlin.SdkPayloadData.IconCompatParcelizer(r11)
            goto L88
        L4f:
            kotlin.SdkPayloadData.IconCompatParcelizer(r11)
            goto L76
        L53:
            kotlin.SdkPayloadData.IconCompatParcelizer(r11)
            goto L64
        L57:
            kotlin.SdkPayloadData.IconCompatParcelizer(r11)
            o.lambdaregister0comgoogleandroidexoplayer2utilNetworkTypeObserver r11 = r10.AudioAttributesCompatParcelizer
            r0.AudioAttributesCompatParcelizer = r8
            java.lang.Object r11 = r11.AudioAttributesImplApi21Parcelizer(r0)
            if (r11 == r1) goto Lc6
        L64:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 == 0) goto Lc3
            o.lambdaregister0comgoogleandroidexoplayer2utilNetworkTypeObserver r11 = r10.AudioAttributesCompatParcelizer
            r0.AudioAttributesCompatParcelizer = r6
            java.lang.Object r11 = r11.IconCompatParcelizer(r0)
            if (r11 == r1) goto Lc6
        L76:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 != 0) goto L9c
            o.lambdaregister0comgoogleandroidexoplayer2utilNetworkTypeObserver r11 = r10.AudioAttributesCompatParcelizer
            r0.AudioAttributesCompatParcelizer = r5
            java.lang.Object r11 = r11.read(r0)
            if (r11 == r1) goto Lc6
        L88:
            java.lang.String r11 = (java.lang.String) r11
            if (r11 == 0) goto L9c
            o.resetForTests r2 = r10.read
            r0.write = r9
            r0.IconCompatParcelizer = r9
            r0.RemoteActionCompatParcelizer = r7
            r0.AudioAttributesCompatParcelizer = r4
            java.lang.Object r11 = r2.IconCompatParcelizer(r11, r0)
            if (r11 == r1) goto Lc6
        L9c:
            o.getResolutionSize<o.zaap> r11 = r10.AudioAttributesImplApi26Parcelizer
            java.lang.Object r11 = r11.IconCompatParcelizer()
            o.zaap r11 = (kotlin.zaap) r11
            if (r11 == 0) goto Lb3
            int r11 = r11.getAudioAttributesImplApi26Parcelizer()
            o.readExactly r2 = kotlin.readExactly.AudioAttributesCompatParcelizer
            int r2 = r2.getRemoteActionCompatParcelizer()
            if (r11 != r2) goto Lb3
            r7 = r8
        Lb3:
            r0.write = r9
            r0.IconCompatParcelizer = r9
            r0.AudioAttributesCompatParcelizer = r3
            java.lang.Object r10 = r10.read(r7, r0)
            if (r10 != r1) goto Lc0
            goto Lc6
        Lc0:
            o.getShowPopup r10 = kotlin.getShowPopup.INSTANCE
            return r10
        Lc3:
            o.getShowPopup r10 = kotlin.getShowPopup.INSTANCE
            return r10
        Lc6:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.magic_module.intro.MagicModuleViewModel.AudioAttributesCompatParcelizer(o.SampleVideos):java.lang.Object");
    }

    static final class MediaBrowserCompatItemReceiver extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.write;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.write = 1;
                if (MagicModuleViewModel.this.AudioAttributesCompatParcelizer.AudioAttributesImplApi26Parcelizer(this) == objIconCompatParcelizer) {
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

        MediaBrowserCompatItemReceiver(SampleVideos<? super MediaBrowserCompatItemReceiver> sampleVideos) {
            super(1, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return MagicModuleViewModel.this.new MediaBrowserCompatItemReceiver(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((MediaBrowserCompatItemReceiver) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void MediaDescriptionCompat() {
        this.MediaDescriptionCompat.write(Boolean.FALSE);
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new MediaBrowserCompatItemReceiver(null), new MagicModuleSubmissionRequestBody() { // from class: o.zaaq
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return MagicModuleViewModel.write((String) obj2);
            }
        });
        this.RatingCompat.write(zaaj.AudioAttributesCompatParcelizer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup write(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return getShowPopup.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object read(boolean r5, kotlin.SampleVideos<? super kotlin.getShowPopup> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.marrow2.ui.magic_module.intro.MagicModuleViewModel.write
            if (r0 == 0) goto L14
            r0 = r6
            com.marrow2.ui.magic_module.intro.MagicModuleViewModel$write r0 = (com.marrow2.ui.magic_module.intro.MagicModuleViewModel.write) r0
            int r1 = r0.read
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r6 = r0.read
            int r6 = r6 + r2
            r0.read = r6
            goto L19
        L14:
            com.marrow2.ui.magic_module.intro.MagicModuleViewModel$write r0 = new com.marrow2.ui.magic_module.intro.MagicModuleViewModel$write
            r0.<init>(r6)
        L19:
            java.lang.Object r6 = r0.AudioAttributesCompatParcelizer
            java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
            int r2 = r0.read
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            boolean r5 = r0.write
            kotlin.SdkPayloadData.IconCompatParcelizer(r6)
            goto L4c
        L2c:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L34:
            kotlin.SdkPayloadData.IconCompatParcelizer(r6)
            if (r5 == 0) goto L3d
            r4.AudioAttributesImplApi26Parcelizer()
            goto L4f
        L3d:
            o.lambdaregister0comgoogleandroidexoplayer2utilNetworkTypeObserver r6 = r4.AudioAttributesCompatParcelizer
            o.readExactly r2 = kotlin.readExactly.read
            r0.write = r5
            r0.read = r3
            java.lang.Object r5 = r6.write(r2, r0)
            if (r5 != r1) goto L4c
            return r1
        L4c:
            r4.MediaBrowserCompatMediaItem()
        L4f:
            o.getShowPopup r4 = kotlin.getShowPopup.INSTANCE
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.magic_module.intro.MagicModuleViewModel.read(boolean, o.SampleVideos):java.lang.Object");
    }

    private final void AudioAttributesImplApi26Parcelizer() {
        isSeekPending isseekpending = this.RemoteActionCompatParcelizer;
        onConnectionFailed onconnectionfailed = onConnectionFailed.INSTANCE;
        isseekpending.write(onConnectionFailed.write(), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(updateLoadingFinished.IconCompatParcelizer));
        getResolutionSize<zaaj> getresolutionsize = this.RatingCompat;
        zaap zaapVarIconCompatParcelizer = this.AudioAttributesImplApi26Parcelizer.IconCompatParcelizer();
        String mediaBrowserCompatItemReceiver = zaapVarIconCompatParcelizer != null ? zaapVarIconCompatParcelizer.getMediaBrowserCompatItemReceiver() : null;
        toMagicModuleMetaRepoModel.write((Object) mediaBrowserCompatItemReceiver);
        getresolutionsize.write(new zaaj.read(mediaBrowserCompatItemReceiver));
    }

    private final void MediaBrowserCompatMediaItem() {
        isSeekPending isseekpending = this.RemoteActionCompatParcelizer;
        onConnectionFailed onconnectionfailed = onConnectionFailed.INSTANCE;
        isseekpending.write(onConnectionFailed.RemoteActionCompatParcelizer(), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(updateLoadingFinished.IconCompatParcelizer));
        getResolutionSize<zaaj> getresolutionsize = this.RatingCompat;
        zaap zaapVarIconCompatParcelizer = this.AudioAttributesImplApi26Parcelizer.IconCompatParcelizer();
        String mediaBrowserCompatItemReceiver = zaapVarIconCompatParcelizer != null ? zaapVarIconCompatParcelizer.getMediaBrowserCompatItemReceiver() : null;
        toMagicModuleMetaRepoModel.write((Object) mediaBrowserCompatItemReceiver);
        getresolutionsize.write(new zaaj.write(mediaBrowserCompatItemReceiver));
    }
}
