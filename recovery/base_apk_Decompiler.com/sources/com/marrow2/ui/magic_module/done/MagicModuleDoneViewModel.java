package com.marrow2.ui.magic_module.done;

import com.marrow2.ui.magic_module.done.MagicModuleDoneViewModel;
import kotlin.CmcdHeadersFactoryCmcdObjectBuilder;
import kotlin.IntermediateLoginResponseBody;
import kotlin.LogLogLevel;
import kotlin.MagicModuleSubmissionRequestBody;
import kotlin.Metadata;
import kotlin.POJOPropertyBuilder5;
import kotlin.POJOPropertyBuilderWithMember;
import kotlin.RenewEligibleCreator;
import kotlin.SampleVideos;
import kotlin.StatusCallback;
import kotlin.TaskApiCallBuilder;
import kotlin.TaskUtil;
import kotlin.TypeResolutionContextBasic;
import kotlin.VerifyNewNumberRequest;
import kotlin.getAnswerMap;
import kotlin.getMagicModuleStats;
import kotlin.getResolutionSize;
import kotlin.getShowPopup;
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

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0013\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u001cR\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010 R\u001d\u0010&\u001a\b\u0012\u0004\u0012\u00020\u001f0\"8\u0007¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b!\u0010%R\u001c\u0010(\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010'0\u001e8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010 R\"\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010'0\"8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010$\u001a\u0004\b\u0017\u0010%R\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020*0\u001e8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010 R \u0010\u0015\u001a\b\u0012\u0004\u0012\u00020*0\"8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010$\u001a\u0004\b\u0013\u0010%R\u001a\u0010,\u001a\b\u0012\u0004\u0012\u00020+0\u001e8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b!\u0010 R \u0010)\u001a\b\u0012\u0004\u0012\u00020+0\"8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010$\u001a\u0004\b(\u0010%R\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020.0\u001e8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010 R\u001a\u0010-\u001a\b\u0012\u0004\u0012\u00020.0\"8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b(\u0010$"}, d2 = {"Lcom/marrow2/ui/magic_module/done/MagicModuleDoneViewModel;", "Lo/POJOPropertyBuilderWithMember;", "Lo/POJOPropertyBuilder5;", "p0", "Lo/LogLogLevel;", "p1", "Lo/lambdaregister0comgoogleandroidexoplayer2utilNetworkTypeObserver;", "p2", "Lo/resetForTests;", "p3", "Lo/isSeekPending;", "p4", "<init>", "(Lo/POJOPropertyBuilder5;Lo/LogLogLevel;Lo/lambdaregister0comgoogleandroidexoplayer2utilNetworkTypeObserver;Lo/resetForTests;Lo/isSeekPending;)V", "", "AudioAttributesImplApi26Parcelizer", "()V", "AudioAttributesImplApi21Parcelizer", "Lo/TaskApiCallBuilder;", "IconCompatParcelizer", "(Lo/TaskApiCallBuilder;)V", "MediaBrowserCompatItemReceiver", "Lo/LogLogLevel;", "AudioAttributesCompatParcelizer", "MediaMetadataCompat", "Lo/lambdaregister0comgoogleandroidexoplayer2utilNetworkTypeObserver;", "RemoteActionCompatParcelizer", "Lo/resetForTests;", "Lo/isSeekPending;", "write", "Lo/getResolutionSize;", "Lo/TaskUtil;", "Lo/getResolutionSize;", "read", "Lo/setUpdatedStatus;", "MediaDescriptionCompat", "Lo/setUpdatedStatus;", "()Lo/setUpdatedStatus;", "MediaBrowserCompatCustomActionResultReceiver", "Lo/setNoBytesRemainingAndMaybeStoreLength;", "AudioAttributesImplBaseParcelizer", "RatingCompat", "", "Lo/StatusCallback;", "MediaBrowserCompatSearchResultReceiver", "MediaBrowserCompatMediaItem", ""}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class MagicModuleDoneViewModel extends POJOPropertyBuilderWithMember {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final getResolutionSize<Boolean> AudioAttributesImplApi21Parcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private final isSeekPending write;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private final resetForTests IconCompatParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private final setUpdatedStatus<String> MediaBrowserCompatMediaItem;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final getResolutionSize<String> MediaDescriptionCompat;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private final setUpdatedStatus<Boolean> MediaBrowserCompatItemReceiver;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private final LogLogLevel AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatMediaItem, reason: from kotlin metadata */
    private final setUpdatedStatus<StatusCallback> RatingCompat;

    /* JADX INFO: renamed from: MediaDescriptionCompat, reason: from kotlin metadata */
    private final setUpdatedStatus<TaskUtil> MediaBrowserCompatCustomActionResultReceiver;

    /* JADX INFO: renamed from: MediaMetadataCompat, reason: from kotlin metadata */
    private final lambdaregister0comgoogleandroidexoplayer2utilNetworkTypeObserver RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: RatingCompat, reason: from kotlin metadata */
    private final setUpdatedStatus<setNoBytesRemainingAndMaybeStoreLength> AudioAttributesImplApi26Parcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final getResolutionSize<setNoBytesRemainingAndMaybeStoreLength> AudioAttributesImplBaseParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final getResolutionSize<StatusCallback> MediaBrowserCompatSearchResultReceiver;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final getResolutionSize<TaskUtil> read;

    @setSdkPayload
    public MagicModuleDoneViewModel(POJOPropertyBuilder5 pOJOPropertyBuilder5, LogLogLevel logLogLevel, lambdaregister0comgoogleandroidexoplayer2utilNetworkTypeObserver lambdaregister0comgoogleandroidexoplayer2utilnetworktypeobserver, resetForTests resetfortests, isSeekPending isseekpending) {
        toMagicModuleMetaRepoModel.write(pOJOPropertyBuilder5, "");
        toMagicModuleMetaRepoModel.write(logLogLevel, "");
        toMagicModuleMetaRepoModel.write(lambdaregister0comgoogleandroidexoplayer2utilnetworktypeobserver, "");
        toMagicModuleMetaRepoModel.write(resetfortests, "");
        toMagicModuleMetaRepoModel.write(isseekpending, "");
        this.AudioAttributesCompatParcelizer = logLogLevel;
        this.RemoteActionCompatParcelizer = lambdaregister0comgoogleandroidexoplayer2utilnetworktypeobserver;
        this.IconCompatParcelizer = resetfortests;
        this.write = isseekpending;
        TaskUtil.RemoteActionCompatParcelizer remoteActionCompatParcelizer = TaskUtil.RemoteActionCompatParcelizer;
        getResolutionSize<TaskUtil> getresolutionsizeRemoteActionCompatParcelizer = setStartTime.RemoteActionCompatParcelizer(TaskUtil.RemoteActionCompatParcelizer.IconCompatParcelizer());
        this.read = getresolutionsizeRemoteActionCompatParcelizer;
        this.MediaBrowserCompatCustomActionResultReceiver = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer);
        getResolutionSize<setNoBytesRemainingAndMaybeStoreLength> getresolutionsizeRemoteActionCompatParcelizer2 = setStartTime.RemoteActionCompatParcelizer(null);
        this.AudioAttributesImplBaseParcelizer = getresolutionsizeRemoteActionCompatParcelizer2;
        this.AudioAttributesImplApi26Parcelizer = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer2);
        getResolutionSize<Boolean> getresolutionsizeRemoteActionCompatParcelizer3 = setStartTime.RemoteActionCompatParcelizer(Boolean.TRUE);
        this.AudioAttributesImplApi21Parcelizer = getresolutionsizeRemoteActionCompatParcelizer3;
        this.MediaBrowserCompatItemReceiver = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer3);
        getResolutionSize<StatusCallback> getresolutionsizeRemoteActionCompatParcelizer4 = setStartTime.RemoteActionCompatParcelizer(StatusCallback.IconCompatParcelizer.INSTANCE);
        this.MediaBrowserCompatSearchResultReceiver = getresolutionsizeRemoteActionCompatParcelizer4;
        this.RatingCompat = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer4);
        getResolutionSize<String> getresolutionsizeRemoteActionCompatParcelizer5 = setStartTime.RemoteActionCompatParcelizer("");
        this.MediaDescriptionCompat = getresolutionsizeRemoteActionCompatParcelizer5;
        this.MediaBrowserCompatMediaItem = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer5);
        getresolutionsizeRemoteActionCompatParcelizer4.write(StatusCallback.read.INSTANCE);
    }

    public final setUpdatedStatus<TaskUtil> read() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    public final setUpdatedStatus<setNoBytesRemainingAndMaybeStoreLength> AudioAttributesCompatParcelizer() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    public final setUpdatedStatus<Boolean> IconCompatParcelizer() {
        return this.MediaBrowserCompatItemReceiver;
    }

    public final setUpdatedStatus<StatusCallback> AudioAttributesImplBaseParcelizer() {
        return this.RatingCompat;
    }

    static final class write extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int IconCompatParcelizer;
        private Object RemoteActionCompatParcelizer;
        private int read;
        private Object write;

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
                int r1 = r6.read
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
                com.marrow2.ui.magic_module.done.MagicModuleDoneViewModel r7 = com.marrow2.ui.magic_module.done.MagicModuleDoneViewModel.this
                o.lambdaregister0comgoogleandroidexoplayer2utilNetworkTypeObserver r7 = com.marrow2.ui.magic_module.done.MagicModuleDoneViewModel.AudioAttributesCompatParcelizer(r7)
                r1 = r6
                o.SampleVideos r1 = (kotlin.SampleVideos) r1
                r6.read = r5
                java.lang.Object r7 = r7.AudioAttributesImplApi21Parcelizer(r1)
                if (r7 == r0) goto La1
            L41:
                java.lang.Boolean r7 = (java.lang.Boolean) r7
                boolean r7 = r7.booleanValue()
                if (r7 == 0) goto L93
                com.marrow2.ui.magic_module.done.MagicModuleDoneViewModel r7 = com.marrow2.ui.magic_module.done.MagicModuleDoneViewModel.this
                o.lambdaregister0comgoogleandroidexoplayer2utilNetworkTypeObserver r7 = com.marrow2.ui.magic_module.done.MagicModuleDoneViewModel.AudioAttributesCompatParcelizer(r7)
                r1 = r6
                o.SampleVideos r1 = (kotlin.SampleVideos) r1
                r6.read = r4
                java.lang.Object r7 = r7.IconCompatParcelizer(r1)
                if (r7 == r0) goto La1
            L5a:
                java.lang.Boolean r7 = (java.lang.Boolean) r7
                boolean r7 = r7.booleanValue()
                if (r7 != 0) goto L8e
                com.marrow2.ui.magic_module.done.MagicModuleDoneViewModel r7 = com.marrow2.ui.magic_module.done.MagicModuleDoneViewModel.this
                o.lambdaregister0comgoogleandroidexoplayer2utilNetworkTypeObserver r7 = com.marrow2.ui.magic_module.done.MagicModuleDoneViewModel.AudioAttributesCompatParcelizer(r7)
                r1 = r6
                o.SampleVideos r1 = (kotlin.SampleVideos) r1
                r6.read = r3
                java.lang.Object r7 = r7.read(r1)
                if (r7 == r0) goto La1
            L73:
                java.lang.String r7 = (java.lang.String) r7
                if (r7 == 0) goto L8e
                com.marrow2.ui.magic_module.done.MagicModuleDoneViewModel r1 = com.marrow2.ui.magic_module.done.MagicModuleDoneViewModel.this
                o.resetForTests r1 = com.marrow2.ui.magic_module.done.MagicModuleDoneViewModel.write(r1)
                r3 = 0
                r6.RemoteActionCompatParcelizer = r3
                r6.write = r3
                r3 = 0
                r6.IconCompatParcelizer = r3
                r6.read = r2
                java.lang.Object r7 = r1.IconCompatParcelizer(r7, r6)
                if (r7 != r0) goto L8e
                goto La1
            L8e:
                com.marrow2.ui.magic_module.done.MagicModuleDoneViewModel r7 = com.marrow2.ui.magic_module.done.MagicModuleDoneViewModel.this
                com.marrow2.ui.magic_module.done.MagicModuleDoneViewModel.RemoteActionCompatParcelizer(r7)
            L93:
                com.marrow2.ui.magic_module.done.MagicModuleDoneViewModel r6 = com.marrow2.ui.magic_module.done.MagicModuleDoneViewModel.this
                o.getResolutionSize r6 = com.marrow2.ui.magic_module.done.MagicModuleDoneViewModel.AudioAttributesImplBaseParcelizer(r6)
                o.StatusCallback$IconCompatParcelizer r7 = o.StatusCallback.IconCompatParcelizer.INSTANCE
                r6.write(r7)
                o.getShowPopup r6 = kotlin.getShowPopup.INSTANCE
                return r6
            La1:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.magic_module.done.MagicModuleDoneViewModel.write.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        write(SampleVideos<? super write> sampleVideos) {
            super(1, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return MagicModuleDoneViewModel.this.new write(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((write) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void AudioAttributesImplApi26Parcelizer() {
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new write(null), new MagicModuleSubmissionRequestBody() { // from class: o.toVoidTaskThatFailsOnFalse
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return MagicModuleDoneViewModel.AudioAttributesCompatParcelizer((String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesCompatParcelizer(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return getShowPopup.INSTANCE;
    }

    static final class read extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private Object AudioAttributesCompatParcelizer;
        private int IconCompatParcelizer;
        private int MediaBrowserCompatItemReceiver;
        private Object RemoteActionCompatParcelizer;
        private Object read;
        private Object write;

        /* JADX WARN: Code restructure failed: missing block: B:25:0x00a3, code lost:
        
            if (r2 != r1) goto L26;
         */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0092  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00ab  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00dc  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x00f8  */
        @Override // kotlin.getMonthName
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r19) {
            /*
                Method dump skipped, instruction units count: 434
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.magic_module.done.MagicModuleDoneViewModel.read.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        read(SampleVideos<? super read> sampleVideos) {
            super(1, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return MagicModuleDoneViewModel.this.new read(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((read) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void AudioAttributesImplApi21Parcelizer() {
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new read(null), new MagicModuleSubmissionRequestBody() { // from class: o.trySetResultOrApiException
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return MagicModuleDoneViewModel.read((String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return getShowPopup.INSTANCE;
    }

    public final void IconCompatParcelizer(TaskApiCallBuilder p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, TaskApiCallBuilder.RemoteActionCompatParcelizer.INSTANCE)) {
            AudioAttributesImplApi26Parcelizer();
            return;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, TaskApiCallBuilder.IconCompatParcelizer.INSTANCE)) {
            this.MediaBrowserCompatSearchResultReceiver.write(StatusCallback.IconCompatParcelizer.INSTANCE);
            return;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, TaskApiCallBuilder.AudioAttributesImplBaseParcelizer.INSTANCE)) {
            isSeekPending isseekpending = this.write;
            onConnectionFailed onconnectionfailed = onConnectionFailed.INSTANCE;
            isseekpending.write(onConnectionFailed.write(), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(updateLoadingFinished.IconCompatParcelizer));
            this.MediaBrowserCompatSearchResultReceiver.write(new StatusCallback.write(this.read.IconCompatParcelizer().getAudioAttributesImplApi26Parcelizer()));
            return;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, TaskApiCallBuilder.AudioAttributesImplApi21Parcelizer.INSTANCE)) {
            boolean iconCompatParcelizer = this.read.IconCompatParcelizer().getIconCompatParcelizer();
            getResolutionSize<TaskUtil> getresolutionsize = this.read;
            getresolutionsize.write(TaskUtil.AudioAttributesCompatParcelizer(getresolutionsize.IconCompatParcelizer(), null, null, null, !iconCompatParcelizer, 0, false, false, 119));
            return;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, TaskApiCallBuilder.write.INSTANCE)) {
            getResolutionSize<TaskUtil> getresolutionsize2 = this.read;
            getresolutionsize2.write(TaskUtil.AudioAttributesCompatParcelizer(getresolutionsize2.IconCompatParcelizer(), null, null, null, false, 0, false, false, 63));
            this.AudioAttributesImplApi21Parcelizer.write(Boolean.FALSE);
            this.MediaBrowserCompatSearchResultReceiver.write(StatusCallback.IconCompatParcelizer.INSTANCE);
            return;
        }
        if (p0 instanceof TaskApiCallBuilder.read) {
            this.MediaBrowserCompatSearchResultReceiver.write(new StatusCallback.RemoteActionCompatParcelizer(this.read.IconCompatParcelizer().getAudioAttributesImplApi26Parcelizer(), ((TaskApiCallBuilder.read) p0).IconCompatParcelizer()));
        } else {
            if (!(p0 instanceof TaskApiCallBuilder.AudioAttributesCompatParcelizer)) {
                throw new RenewEligibleCreator();
            }
            TaskApiCallBuilder.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = (TaskApiCallBuilder.AudioAttributesCompatParcelizer) p0;
            if (audioAttributesCompatParcelizer.AudioAttributesCompatParcelizer() >= 0) {
                this.MediaBrowserCompatSearchResultReceiver.write(new StatusCallback.RemoteActionCompatParcelizer(this.read.IconCompatParcelizer().getAudioAttributesImplApi26Parcelizer(), audioAttributesCompatParcelizer.AudioAttributesCompatParcelizer()));
            }
            this.AudioAttributesImplApi21Parcelizer.write(Boolean.FALSE);
        }
    }
}
