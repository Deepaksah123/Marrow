package com.marrow2.ui.learn_more.viewmodel;

import com.marrow.data.models.common.CourseConfigV2;
import com.marrow2.data.user.remote.model.onboarding.PhoneNumberDetails;
import com.marrow2.ui.learn_more.viewmodel.LearnMoreViewModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.CmcdHeadersFactoryCmcdObjectBuilder;
import kotlin.DataSourceBitmapLoaderExternalSyntheticLambda0;
import kotlin.IStatusCallback;
import kotlin.IntermediateLoginResponseBody;
import kotlin.LogLogLevel;
import kotlin.LogLogger1;
import kotlin.LongArray;
import kotlin.MagicModuleSubmissionRequestBody;
import kotlin.Metadata;
import kotlin.POJOPropertyBuilderWithMember;
import kotlin.QBankStatsResponse;
import kotlin.RenewEligibleCreator;
import kotlin.SampleVideos;
import kotlin.SdkPayloadData;
import kotlin.TopUserCompanion;
import kotlin.TypeResolutionContextBasic;
import kotlin.VerifyNewNumberRequest;
import kotlin.asInterface;
import kotlin.endSectionV18;
import kotlin.getAnswerMap;
import kotlin.getCallbackOrNull;
import kotlin.getChimeraLifecycleFragmentImpl;
import kotlin.getDisplaySizeV17;
import kotlin.getFragment;
import kotlin.getListenerKey;
import kotlin.getMagicModuleStats;
import kotlin.getResolutionSize;
import kotlin.getShowPopup;
import kotlin.getYear;
import kotlin.isSeekPending;
import kotlin.lambdaloadBitmap2comgoogleandroidexoplayer2upstreamDataSourceBitmapLoader;
import kotlin.removeQueryParameter;
import kotlin.setFastestInterval;
import kotlin.setMbbsVerificationYear;
import kotlin.setModifiedEndTimestampMs;
import kotlin.setSdkPayload;
import kotlin.setStartTime;
import kotlin.setStreamingFormat;
import kotlin.setUpdatedStatus;
import kotlin.toMagicModuleMetaRepoModel;
import kotlin.updateLoadingFinished;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0015\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0016\u0010\u0014J\u000f\u0010\u0017\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0017\u0010\u0014J\u000f\u0010\u0018\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0018\u0010\u0014J\u000f\u0010\u0019\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0019\u0010\u0014R\u0014\u0010\u001b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u001aR\u0014\u0010\u0011\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u001dR\u0014\u0010\u000e\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\"\u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\"0!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010$R#\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\"0&8\u0007¢\u0006\f\n\u0004\b\u0013\u0010'\u001a\u0004\b\u001b\u0010(R\u001c\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020)0!8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010$R \u0010\u0018\u001a\b\u0012\u0004\u0012\u00020)0&8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010'\u001a\u0004\b+\u0010(R\"\u0010+\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020-0,0!8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010$R&\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020-0,0&8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010'\u001a\u0004\b\u000e\u0010(R\u001c\u0010/\u001a\b\u0012\u0004\u0012\u00020.0!8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b%\u0010$R \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020.0&8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010'\u001a\u0004\b%\u0010(R\u001c\u0010*\u001a\b\u0012\u0004\u0012\u0002000!8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010$R\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u0002000&8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b/\u0010'"}, d2 = {"Lcom/marrow2/ui/learn_more/viewmodel/LearnMoreViewModel;", "Lo/POJOPropertyBuilderWithMember;", "Lo/LogLogLevel;", "p0", "Lo/getDisplaySizeV17;", "p1", "Lo/isSeekPending;", "p2", "Lo/endSectionV18;", "p3", "<init>", "(Lo/LogLogLevel;Lo/getDisplaySizeV17;Lo/isSeekPending;Lo/endSectionV18;)V", "Lo/getChimeraLifecycleFragmentImpl;", "", "read", "(Lo/getChimeraLifecycleFragmentImpl;)V", "", "write", "(Ljava/lang/String;Ljava/lang/String;)V", "MediaBrowserCompatItemReceiver", "()V", "MediaBrowserCompatCustomActionResultReceiver", "MediaBrowserCompatMediaItem", "AudioAttributesImplApi21Parcelizer", "AudioAttributesImplApi26Parcelizer", "MediaDescriptionCompat", "Lo/LogLogLevel;", "IconCompatParcelizer", "Lo/getDisplaySizeV17;", "Lo/isSeekPending;", "RemoteActionCompatParcelizer", "RatingCompat", "Lo/endSectionV18;", "Lo/getResolutionSize;", "Lo/DataSourceBitmapLoaderExternalSyntheticLambda0;", "Lo/IStatusCallback;", "Lo/getResolutionSize;", "AudioAttributesCompatParcelizer", "Lo/setUpdatedStatus;", "Lo/setUpdatedStatus;", "()Lo/setUpdatedStatus;", "Lo/getFragment;", "MediaBrowserCompatSearchResultReceiver", "AudioAttributesImplBaseParcelizer", "", "Lo/asInterface;", "Lo/getCallbackOrNull;", "MediaMetadataCompat", ""}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class LearnMoreViewModel extends POJOPropertyBuilderWithMember {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private getResolutionSize<getCallbackOrNull> MediaMetadataCompat;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private final LogLogLevel IconCompatParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private final isSeekPending RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private final setUpdatedStatus<getCallbackOrNull> MediaBrowserCompatMediaItem;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private getResolutionSize<getFragment> AudioAttributesImplApi21Parcelizer;
    private final setUpdatedStatus<List<asInterface>> MediaBrowserCompatCustomActionResultReceiver;
    private final setUpdatedStatus<DataSourceBitmapLoaderExternalSyntheticLambda0<IStatusCallback>> MediaBrowserCompatItemReceiver;

    /* JADX INFO: renamed from: MediaBrowserCompatMediaItem, reason: from kotlin metadata */
    private final getDisplaySizeV17 write;

    /* JADX INFO: renamed from: MediaBrowserCompatSearchResultReceiver, reason: from kotlin metadata */
    private final setUpdatedStatus<getFragment> AudioAttributesImplApi26Parcelizer;

    /* JADX INFO: renamed from: MediaMetadataCompat, reason: from kotlin metadata */
    private final setUpdatedStatus<Boolean> RatingCompat;

    /* JADX INFO: renamed from: RatingCompat, reason: from kotlin metadata */
    private final endSectionV18 read;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private getResolutionSize<DataSourceBitmapLoaderExternalSyntheticLambda0<IStatusCallback>> AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private getResolutionSize<List<asInterface>> AudioAttributesImplBaseParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private getResolutionSize<Boolean> MediaBrowserCompatSearchResultReceiver;

    @setSdkPayload
    public LearnMoreViewModel(LogLogLevel logLogLevel, getDisplaySizeV17 getdisplaysizev17, isSeekPending isseekpending, endSectionV18 endsectionv18) {
        toMagicModuleMetaRepoModel.write(logLogLevel, "");
        toMagicModuleMetaRepoModel.write(getdisplaysizev17, "");
        toMagicModuleMetaRepoModel.write(isseekpending, "");
        toMagicModuleMetaRepoModel.write(endsectionv18, "");
        this.IconCompatParcelizer = logLogLevel;
        this.write = getdisplaysizev17;
        this.RemoteActionCompatParcelizer = isseekpending;
        this.read = endsectionv18;
        getResolutionSize<DataSourceBitmapLoaderExternalSyntheticLambda0<IStatusCallback>> getresolutionsizeRemoteActionCompatParcelizer = setStartTime.RemoteActionCompatParcelizer(new setStreamingFormat(null, 1, null));
        this.AudioAttributesCompatParcelizer = getresolutionsizeRemoteActionCompatParcelizer;
        this.MediaBrowserCompatItemReceiver = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer);
        getResolutionSize<getFragment> getresolutionsizeRemoteActionCompatParcelizer2 = setStartTime.RemoteActionCompatParcelizer(new getFragment(false, false, false, false, false, false, 63, null));
        this.AudioAttributesImplApi21Parcelizer = getresolutionsizeRemoteActionCompatParcelizer2;
        this.AudioAttributesImplApi26Parcelizer = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer2);
        getResolutionSize<List<asInterface>> getresolutionsizeRemoteActionCompatParcelizer3 = setStartTime.RemoteActionCompatParcelizer(IntermediateLoginResponseBody.RemoteActionCompatParcelizer());
        this.AudioAttributesImplBaseParcelizer = getresolutionsizeRemoteActionCompatParcelizer3;
        this.MediaBrowserCompatCustomActionResultReceiver = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer3);
        getResolutionSize<getCallbackOrNull> getresolutionsizeRemoteActionCompatParcelizer4 = setStartTime.RemoteActionCompatParcelizer(getCallbackOrNull.read.INSTANCE);
        this.MediaMetadataCompat = getresolutionsizeRemoteActionCompatParcelizer4;
        this.MediaBrowserCompatMediaItem = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer4);
        getResolutionSize<Boolean> getresolutionsizeRemoteActionCompatParcelizer5 = setStartTime.RemoteActionCompatParcelizer(Boolean.FALSE);
        this.MediaBrowserCompatSearchResultReceiver = getresolutionsizeRemoteActionCompatParcelizer5;
        this.RatingCompat = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer5);
        AudioAttributesImplApi21Parcelizer();
        MediaDescriptionCompat();
    }

    public final setUpdatedStatus<DataSourceBitmapLoaderExternalSyntheticLambda0<IStatusCallback>> IconCompatParcelizer() {
        return this.MediaBrowserCompatItemReceiver;
    }

    public final setUpdatedStatus<getFragment> AudioAttributesImplBaseParcelizer() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    public final setUpdatedStatus<List<asInterface>> read() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    public final setUpdatedStatus<getCallbackOrNull> AudioAttributesCompatParcelizer() {
        return this.MediaBrowserCompatMediaItem;
    }

    public final void read(getChimeraLifecycleFragmentImpl p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, getChimeraLifecycleFragmentImpl.RemoteActionCompatParcelizer.INSTANCE)) {
            this.MediaMetadataCompat.write(getCallbackOrNull.write.INSTANCE);
            return;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, getChimeraLifecycleFragmentImpl.read.INSTANCE)) {
            this.MediaMetadataCompat.write(getCallbackOrNull.IconCompatParcelizer.INSTANCE);
            return;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, getChimeraLifecycleFragmentImpl.AudioAttributesCompatParcelizer.INSTANCE)) {
            this.MediaMetadataCompat.write(getCallbackOrNull.AudioAttributesCompatParcelizer.INSTANCE);
            return;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, getChimeraLifecycleFragmentImpl.AudioAttributesImplApi26Parcelizer.INSTANCE)) {
            this.MediaMetadataCompat.write(getCallbackOrNull.RemoteActionCompatParcelizer.INSTANCE);
            return;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, getChimeraLifecycleFragmentImpl.MediaBrowserCompatItemReceiver.INSTANCE)) {
            MediaBrowserCompatCustomActionResultReceiver();
            return;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, getChimeraLifecycleFragmentImpl.MediaBrowserCompatCustomActionResultReceiver.INSTANCE)) {
            MediaBrowserCompatMediaItem();
            return;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, getChimeraLifecycleFragmentImpl.write.INSTANCE)) {
            MediaBrowserCompatItemReceiver();
            return;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, getChimeraLifecycleFragmentImpl.IconCompatParcelizer.INSTANCE)) {
            this.MediaMetadataCompat.write(getCallbackOrNull.read.INSTANCE);
            return;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, getChimeraLifecycleFragmentImpl.AudioAttributesImplApi21Parcelizer.INSTANCE)) {
            AudioAttributesImplApi21Parcelizer();
            return;
        }
        if (!(p0 instanceof getChimeraLifecycleFragmentImpl.AudioAttributesImplBaseParcelizer)) {
            throw new RenewEligibleCreator();
        }
        isSeekPending isseekpending = this.RemoteActionCompatParcelizer;
        setFastestInterval setfastestinterval = setFastestInterval.INSTANCE;
        isseekpending.write(setFastestInterval.IconCompatParcelizer(setFastestInterval.IconCompatParcelizer.AudioAttributesCompatParcelizer), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(updateLoadingFinished.IconCompatParcelizer));
        getChimeraLifecycleFragmentImpl.AudioAttributesImplBaseParcelizer audioAttributesImplBaseParcelizer = (getChimeraLifecycleFragmentImpl.AudioAttributesImplBaseParcelizer) p0;
        write(new PhoneNumberDetails(audioAttributesImplBaseParcelizer.IconCompatParcelizer(), audioAttributesImplBaseParcelizer.write(), 0, 4, null).asSingleEntity(), audioAttributesImplBaseParcelizer.read());
    }

    static final class IconCompatParcelizer extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private /* synthetic */ String IconCompatParcelizer;
        private /* synthetic */ String RemoteActionCompatParcelizer;
        private int read;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.read;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                LearnMoreViewModel.this.MediaBrowserCompatSearchResultReceiver.write(QBankStatsResponse.AudioAttributesCompatParcelizer(true));
                this.read = 1;
                if (LearnMoreViewModel.this.write.write(this.IconCompatParcelizer, this.RemoteActionCompatParcelizer, "knowmore", this) == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            LearnMoreViewModel.this.MediaBrowserCompatSearchResultReceiver.write(QBankStatsResponse.AudioAttributesCompatParcelizer(false));
            LearnMoreViewModel.this.MediaMetadataCompat.write(getCallbackOrNull.MediaBrowserCompatSearchResultReceiver.INSTANCE);
            return getShowPopup.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IconCompatParcelizer(String str, String str2, SampleVideos<? super IconCompatParcelizer> sampleVideos) {
            super(1, sampleVideos);
            this.IconCompatParcelizer = str;
            this.RemoteActionCompatParcelizer = str2;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return LearnMoreViewModel.this.new IconCompatParcelizer(this.IconCompatParcelizer, this.RemoteActionCompatParcelizer, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((IconCompatParcelizer) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void write(String p0, String p1) {
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new IconCompatParcelizer(p1, p0, null), new MagicModuleSubmissionRequestBody() { // from class: o.toIdString
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return LearnMoreViewModel.AudioAttributesImplBaseParcelizer(this.AudioAttributesCompatParcelizer, (String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesImplBaseParcelizer(LearnMoreViewModel learnMoreViewModel, String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        learnMoreViewModel.MediaMetadataCompat.write(new getCallbackOrNull.MediaBrowserCompatMediaItem(str));
        learnMoreViewModel.MediaBrowserCompatSearchResultReceiver.write(Boolean.FALSE);
        return getShowPopup.INSTANCE;
    }

    public static final class AudioAttributesCompatParcelizer extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private Object IconCompatParcelizer;
        private Object RemoteActionCompatParcelizer;
        private int write;

        /* JADX WARN: Code restructure failed: missing block: B:13:0x007f, code lost:
        
            if (r8.AudioAttributesCompatParcelizer(r1, r3, new kotlin.ListenerHolderNotifier(r6), r7) == r0) goto L17;
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
                int r1 = r7.write
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L26
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                kotlin.SdkPayloadData.IconCompatParcelizer(r8)
                goto L82
            L12:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L1a:
                java.lang.Object r1 = r7.RemoteActionCompatParcelizer
                o.LifecycleCallback r1 = (kotlin.LifecycleCallback) r1
                java.lang.Object r1 = r7.IconCompatParcelizer
                o.isSeekPending r1 = (kotlin.isSeekPending) r1
                kotlin.SdkPayloadData.IconCompatParcelizer(r8)
                goto L46
            L26:
                kotlin.SdkPayloadData.IconCompatParcelizer(r8)
                com.marrow2.ui.learn_more.viewmodel.LearnMoreViewModel r8 = com.marrow2.ui.learn_more.viewmodel.LearnMoreViewModel.this
                o.isSeekPending r1 = com.marrow2.ui.learn_more.viewmodel.LearnMoreViewModel.RemoteActionCompatParcelizer(r8)
                o.LifecycleCallback r8 = kotlin.LifecycleCallback.AudioAttributesCompatParcelizer
                com.marrow2.ui.learn_more.viewmodel.LearnMoreViewModel r4 = com.marrow2.ui.learn_more.viewmodel.LearnMoreViewModel.this
                o.getDisplaySizeV17 r4 = com.marrow2.ui.learn_more.viewmodel.LearnMoreViewModel.AudioAttributesCompatParcelizer(r4)
                r5 = r7
                o.SampleVideos r5 = (kotlin.SampleVideos) r5
                r7.IconCompatParcelizer = r1
                r7.RemoteActionCompatParcelizer = r8
                r7.write = r3
                java.lang.Object r8 = r4.onPlayFromMediaId(r5)
                if (r8 == r0) goto L85
            L46:
                java.lang.Boolean r8 = (java.lang.Boolean) r8
                boolean r8 = r8.booleanValue()
                r8 = r8 ^ r3
                o.getSubscriptionExpiresOn r8 = kotlin.LifecycleCallback.write(r8)
                kotlin.isSeekPending.read(r1, r8)
                com.marrow2.ui.learn_more.viewmodel.LearnMoreViewModel r8 = com.marrow2.ui.learn_more.viewmodel.LearnMoreViewModel.this
                o.getDisplaySizeV17 r8 = com.marrow2.ui.learn_more.viewmodel.LearnMoreViewModel.AudioAttributesCompatParcelizer(r8)
                com.marrow2.ui.learn_more.viewmodel.LearnMoreViewModel$AudioAttributesCompatParcelizer$4 r1 = new com.marrow2.ui.learn_more.viewmodel.LearnMoreViewModel$AudioAttributesCompatParcelizer$4
                com.marrow2.ui.learn_more.viewmodel.LearnMoreViewModel r3 = com.marrow2.ui.learn_more.viewmodel.LearnMoreViewModel.this
                r4 = 0
                r1.<init>(r3, r4)
                o.MagicModuleSubmissionRequestBody r1 = (kotlin.MagicModuleSubmissionRequestBody) r1
                o.ListenerHolderListenerKey r3 = new o.ListenerHolderListenerKey
                com.marrow2.ui.learn_more.viewmodel.LearnMoreViewModel r5 = com.marrow2.ui.learn_more.viewmodel.LearnMoreViewModel.this
                r3.<init>()
                o.ListenerHolderNotifier r5 = new o.ListenerHolderNotifier
                com.marrow2.ui.learn_more.viewmodel.LearnMoreViewModel r6 = com.marrow2.ui.learn_more.viewmodel.LearnMoreViewModel.this
                r5.<init>()
                r6 = r7
                o.SampleVideos r6 = (kotlin.SampleVideos) r6
                r7.IconCompatParcelizer = r4
                r7.RemoteActionCompatParcelizer = r4
                r7.write = r2
                java.lang.Object r7 = r8.AudioAttributesCompatParcelizer(r1, r3, r5, r6)
                if (r7 != r0) goto L82
                goto L85
            L82:
                o.getShowPopup r7 = kotlin.getShowPopup.INSTANCE
                return r7
            L85:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.learn_more.viewmodel.LearnMoreViewModel.AudioAttributesCompatParcelizer.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX INFO: renamed from: com.marrow2.ui.learn_more.viewmodel.LearnMoreViewModel$AudioAttributesCompatParcelizer$4, reason: invalid class name */
        static final class AnonymousClass4 extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<String, SampleVideos<? super getShowPopup>, Object> {
            private /* synthetic */ Object AudioAttributesCompatParcelizer;
            private /* synthetic */ LearnMoreViewModel IconCompatParcelizer;
            private int RemoteActionCompatParcelizer;

            @Override // kotlin.getMonthName
            public final Object invokeSuspend(Object obj) {
                String str = (String) this.AudioAttributesCompatParcelizer;
                getYear.IconCompatParcelizer();
                SdkPayloadData.IconCompatParcelizer(obj);
                this.IconCompatParcelizer.MediaMetadataCompat.write(new getCallbackOrNull.AudioAttributesImplBaseParcelizer(str));
                return getShowPopup.INSTANCE;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass4(LearnMoreViewModel learnMoreViewModel, SampleVideos<? super AnonymousClass4> sampleVideos) {
                super(2, sampleVideos);
                this.IconCompatParcelizer = learnMoreViewModel;
            }

            @Override // kotlin.getMonthName
            public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
                AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.IconCompatParcelizer, sampleVideos);
                anonymousClass4.AudioAttributesCompatParcelizer = obj;
                return anonymousClass4;
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // kotlin.MagicModuleSubmissionRequestBody
            /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
            public Object invoke(String str, SampleVideos<? super getShowPopup> sampleVideos) {
                return ((AnonymousClass4) create(str, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final getShowPopup write(LearnMoreViewModel learnMoreViewModel) {
            learnMoreViewModel.MediaMetadataCompat.write(getCallbackOrNull.AudioAttributesImplApi21Parcelizer.INSTANCE);
            return getShowPopup.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final getShowPopup RemoteActionCompatParcelizer(LearnMoreViewModel learnMoreViewModel) {
            learnMoreViewModel.MediaMetadataCompat.write(getCallbackOrNull.MediaBrowserCompatCustomActionResultReceiver.INSTANCE);
            return getShowPopup.INSTANCE;
        }

        AudioAttributesCompatParcelizer(SampleVideos<? super AudioAttributesCompatParcelizer> sampleVideos) {
            super(1, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return LearnMoreViewModel.this.new AudioAttributesCompatParcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AudioAttributesCompatParcelizer) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void MediaBrowserCompatItemReceiver() {
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new AudioAttributesCompatParcelizer(null), new MagicModuleSubmissionRequestBody() { // from class: o.ListenerHolder
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return LearnMoreViewModel.write((String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup write(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return getShowPopup.INSTANCE;
    }

    static final class read extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int AudioAttributesCompatParcelizer;
        private Object IconCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            getResolutionSize getresolutionsize;
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.AudioAttributesCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                getResolutionSize getresolutionsize2 = LearnMoreViewModel.this.MediaMetadataCompat;
                this.IconCompatParcelizer = getresolutionsize2;
                this.AudioAttributesCompatParcelizer = 1;
                Object objIconCompatParcelizer2 = LearnMoreViewModel.this.IconCompatParcelizer.IconCompatParcelizer(this);
                if (objIconCompatParcelizer2 == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
                obj = objIconCompatParcelizer2;
                getresolutionsize = getresolutionsize2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                getresolutionsize = (getResolutionSize) this.IconCompatParcelizer;
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            getresolutionsize.write(new getCallbackOrNull.AudioAttributesImplApi26Parcelizer(((Number) obj).intValue()));
            return getShowPopup.INSTANCE;
        }

        read(SampleVideos<? super read> sampleVideos) {
            super(1, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return LearnMoreViewModel.this.new read(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((read) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void MediaBrowserCompatCustomActionResultReceiver() {
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new read(null), new MagicModuleSubmissionRequestBody() { // from class: o.hasListener
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return LearnMoreViewModel.AudioAttributesImplApi21Parcelizer(this.IconCompatParcelizer, (String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesImplApi21Parcelizer(LearnMoreViewModel learnMoreViewModel, String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        learnMoreViewModel.MediaMetadataCompat.write(new getCallbackOrNull.MediaBrowserCompatMediaItem(str));
        return getShowPopup.INSTANCE;
    }

    static final class AudioAttributesImplApi26Parcelizer extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int RemoteActionCompatParcelizer;

        /* JADX INFO: renamed from: com.marrow2.ui.learn_more.viewmodel.LearnMoreViewModel$AudioAttributesImplApi26Parcelizer$2, reason: invalid class name */
        static final class AnonymousClass2 extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
            private Object AudioAttributesCompatParcelizer;
            private /* synthetic */ LearnMoreViewModel IconCompatParcelizer;
            private Object RemoteActionCompatParcelizer;
            private int read;

            @Override // kotlin.getMonthName
            public final Object invokeSuspend(Object obj) {
                getResolutionSize getresolutionsize;
                removeQueryParameter removequeryparameter;
                Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
                int i = this.read;
                if (i == 0) {
                    SdkPayloadData.IconCompatParcelizer(obj);
                    this.read = 1;
                    obj = this.IconCompatParcelizer.read.read(this);
                    if (obj != objIconCompatParcelizer) {
                    }
                    return objIconCompatParcelizer;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    getresolutionsize = (getResolutionSize) this.AudioAttributesCompatParcelizer;
                    removequeryparameter = (removeQueryParameter) this.RemoteActionCompatParcelizer;
                    SdkPayloadData.IconCompatParcelizer(obj);
                    getresolutionsize.write(new getCallbackOrNull.MediaBrowserCompatItemReceiver((String) obj, removequeryparameter.AudioAttributesCompatParcelizer(), removequeryparameter.write()));
                    return getShowPopup.INSTANCE;
                }
                SdkPayloadData.IconCompatParcelizer(obj);
                removeQueryParameter removequeryparameter2 = (removeQueryParameter) obj;
                getResolutionSize getresolutionsize2 = this.IconCompatParcelizer.MediaMetadataCompat;
                this.RemoteActionCompatParcelizer = removequeryparameter2;
                this.AudioAttributesCompatParcelizer = getresolutionsize2;
                this.read = 2;
                Object objAudioAttributesCompatParcelizer = this.IconCompatParcelizer.IconCompatParcelizer.AudioAttributesCompatParcelizer(this);
                if (objAudioAttributesCompatParcelizer != objIconCompatParcelizer) {
                    getresolutionsize = getresolutionsize2;
                    obj = objAudioAttributesCompatParcelizer;
                    removequeryparameter = removequeryparameter2;
                    getresolutionsize.write(new getCallbackOrNull.MediaBrowserCompatItemReceiver((String) obj, removequeryparameter.AudioAttributesCompatParcelizer(), removequeryparameter.write()));
                    return getShowPopup.INSTANCE;
                }
                return objIconCompatParcelizer;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(LearnMoreViewModel learnMoreViewModel, SampleVideos<? super AnonymousClass2> sampleVideos) {
                super(2, sampleVideos);
                this.IconCompatParcelizer = learnMoreViewModel;
            }

            @Override // kotlin.getMonthName
            public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
                return new AnonymousClass2(this.IconCompatParcelizer, sampleVideos);
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // kotlin.MagicModuleSubmissionRequestBody
            /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
            public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
                return ((AnonymousClass2) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
            }
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.RemoteActionCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.RemoteActionCompatParcelizer = 1;
                if (setModifiedEndTimestampMs.RemoteActionCompatParcelizer(setMbbsVerificationYear.write(), new AnonymousClass2(LearnMoreViewModel.this, null), this) == objIconCompatParcelizer) {
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

        AudioAttributesImplApi26Parcelizer(SampleVideos<? super AudioAttributesImplApi26Parcelizer> sampleVideos) {
            super(1, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return LearnMoreViewModel.this.new AudioAttributesImplApi26Parcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AudioAttributesImplApi26Parcelizer) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void MediaBrowserCompatMediaItem() {
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new AudioAttributesImplApi26Parcelizer(null), new MagicModuleSubmissionRequestBody() { // from class: o.ListenerHolders
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return LearnMoreViewModel.MediaBrowserCompatCustomActionResultReceiver(this.RemoteActionCompatParcelizer, (String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup MediaBrowserCompatCustomActionResultReceiver(LearnMoreViewModel learnMoreViewModel, String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        learnMoreViewModel.MediaMetadataCompat.write(new getCallbackOrNull.MediaBrowserCompatMediaItem(str));
        return getShowPopup.INSTANCE;
    }

    static final class write extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int AudioAttributesCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.AudioAttributesCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.AudioAttributesCompatParcelizer = 1;
                obj = LearnMoreViewModel.this.IconCompatParcelizer.RatingCompat(this);
                if (obj == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            LogLogger1 logLogger1 = (LogLogger1) obj;
            if (logLogger1.AudioAttributesImplApi26Parcelizer()) {
                LearnMoreViewModel.this.AudioAttributesImplApi26Parcelizer();
            }
            lambdaloadBitmap2comgoogleandroidexoplayer2upstreamDataSourceBitmapLoader.IconCompatParcelizer(LearnMoreViewModel.this.AudioAttributesCompatParcelizer, getListenerKey.AudioAttributesCompatParcelizer(logLogger1));
            return getShowPopup.INSTANCE;
        }

        write(SampleVideos<? super write> sampleVideos) {
            super(1, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return LearnMoreViewModel.this.new write(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((write) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void AudioAttributesImplApi21Parcelizer() {
        lambdaloadBitmap2comgoogleandroidexoplayer2upstreamDataSourceBitmapLoader.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, null);
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new write(null), new MagicModuleSubmissionRequestBody() { // from class: o.getLifecycleActivity
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return LearnMoreViewModel.AudioAttributesCompatParcelizer(this.write, ((Integer) obj).intValue(), (String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesCompatParcelizer(LearnMoreViewModel learnMoreViewModel, int i, String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        lambdaloadBitmap2comgoogleandroidexoplayer2upstreamDataSourceBitmapLoader.read(learnMoreViewModel.AudioAttributesCompatParcelizer, i, str, null);
        return getShowPopup.INSTANCE;
    }

    static final class RemoteActionCompatParcelizer extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int IconCompatParcelizer;
        private Object RemoteActionCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            List list;
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.IconCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                ArrayList arrayList = new ArrayList();
                this.RemoteActionCompatParcelizer = arrayList;
                this.IconCompatParcelizer = 1;
                Object objAudioAttributesImplApi21Parcelizer = LearnMoreViewModel.this.IconCompatParcelizer.AudioAttributesImplApi21Parcelizer(this);
                if (objAudioAttributesImplApi21Parcelizer == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
                list = arrayList;
                obj = objAudioAttributesImplApi21Parcelizer;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                list = (List) this.RemoteActionCompatParcelizer;
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            for (LongArray longArray : (List) obj) {
                list.add(new asInterface(longArray.AudioAttributesCompatParcelizer(), longArray.RemoteActionCompatParcelizer(), longArray.read()));
            }
            LearnMoreViewModel.this.AudioAttributesImplBaseParcelizer.write(list);
            return getShowPopup.INSTANCE;
        }

        RemoteActionCompatParcelizer(SampleVideos<? super RemoteActionCompatParcelizer> sampleVideos) {
            super(1, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return LearnMoreViewModel.this.new RemoteActionCompatParcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((RemoteActionCompatParcelizer) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void AudioAttributesImplApi26Parcelizer() {
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new RemoteActionCompatParcelizer(null), new MagicModuleSubmissionRequestBody() { // from class: o.createListenerHolder
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return LearnMoreViewModel.AudioAttributesImplApi26Parcelizer(this.AudioAttributesCompatParcelizer, (String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesImplApi26Parcelizer(LearnMoreViewModel learnMoreViewModel, String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        learnMoreViewModel.MediaMetadataCompat.write(new getCallbackOrNull.MediaBrowserCompatMediaItem(str));
        return getShowPopup.INSTANCE;
    }

    static final class MediaBrowserCompatItemReceiver extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private Object read;
        private int write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            List<CourseConfigV2.SupportItem> list;
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.write;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.write = 1;
                obj = LearnMoreViewModel.this.IconCompatParcelizer.write(this);
                if (obj != objIconCompatParcelizer) {
                }
                return objIconCompatParcelizer;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                list = (List) this.read;
                SdkPayloadData.IconCompatParcelizer(obj);
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                getResolutionSize getresolutionsize = LearnMoreViewModel.this.AudioAttributesImplApi21Parcelizer;
                getresolutionsize.write(getFragment.read(list.contains(CourseConfigV2.SupportItem.FAQ), list.contains(CourseConfigV2.SupportItem.GET_CALL), list.contains(CourseConfigV2.SupportItem.SUPPORT_MAIL), list.contains(CourseConfigV2.SupportItem.PRIVACY_POLICY), list.contains(CourseConfigV2.SupportItem.CANCEL_POLICY), zBooleanValue));
                return getShowPopup.INSTANCE;
            }
            SdkPayloadData.IconCompatParcelizer(obj);
            List<CourseConfigV2.SupportItem> supportViews = ((CourseConfigV2) obj).getSupportViews();
            this.read = supportViews;
            this.write = 2;
            Object objOnPlayFromMediaId = LearnMoreViewModel.this.write.onPlayFromMediaId(this);
            if (objOnPlayFromMediaId != objIconCompatParcelizer) {
                list = supportViews;
                obj = objOnPlayFromMediaId;
                boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                getResolutionSize getresolutionsize2 = LearnMoreViewModel.this.AudioAttributesImplApi21Parcelizer;
                getresolutionsize2.write(getFragment.read(list.contains(CourseConfigV2.SupportItem.FAQ), list.contains(CourseConfigV2.SupportItem.GET_CALL), list.contains(CourseConfigV2.SupportItem.SUPPORT_MAIL), list.contains(CourseConfigV2.SupportItem.PRIVACY_POLICY), list.contains(CourseConfigV2.SupportItem.CANCEL_POLICY), zBooleanValue2));
                return getShowPopup.INSTANCE;
            }
            return objIconCompatParcelizer;
        }

        MediaBrowserCompatItemReceiver(SampleVideos<? super MediaBrowserCompatItemReceiver> sampleVideos) {
            super(1, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return LearnMoreViewModel.this.new MediaBrowserCompatItemReceiver(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((MediaBrowserCompatItemReceiver) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void MediaDescriptionCompat() {
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new MediaBrowserCompatItemReceiver(null), new MagicModuleSubmissionRequestBody() { // from class: o.isCreated
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return LearnMoreViewModel.MediaBrowserCompatItemReceiver(this.IconCompatParcelizer, (String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup MediaBrowserCompatItemReceiver(LearnMoreViewModel learnMoreViewModel, String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        learnMoreViewModel.MediaMetadataCompat.write(new getCallbackOrNull.MediaBrowserCompatMediaItem(str));
        return getShowPopup.INSTANCE;
    }
}
