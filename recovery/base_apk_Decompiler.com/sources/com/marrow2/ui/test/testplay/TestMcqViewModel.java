package com.marrow2.ui.test.testplay;

import com.marrow2.ui.test.testplay.TestMcqViewModel;
import kotlin.BaseGmsClient;
import kotlin.CachedContent;
import kotlin.CmcdHeadersFactoryCmcdObjectBuilder;
import kotlin.DataSourceBitmapLoaderExternalSyntheticLambda0;
import kotlin.MagicModuleSubmissionRequestBody;
import kotlin.Metadata;
import kotlin.NetworkTypeObserverApi31DisplayInfoCallback;
import kotlin.POJOPropertyBuilderWithMember;
import kotlin.SampleVideos;
import kotlin.SdkPayloadData;
import kotlin.TypeResolutionContextBasic;
import kotlin.VerifyNewNumberRequest;
import kotlin.checkAvailabilityAndConnect;
import kotlin.getAllRequestedScopes;
import kotlin.getAnswerMap;
import kotlin.getApiFeatures;
import kotlin.getMagicModuleStats;
import kotlin.getResolutionSize;
import kotlin.getShowPopup;
import kotlin.getYear;
import kotlin.lambdaloadBitmap2comgoogleandroidexoplayer2upstreamDataSourceBitmapLoader;
import kotlin.setSdkPayload;
import kotlin.setStartTime;
import kotlin.setStreamingFormat;
import kotlin.setTextAppearanceResource;
import kotlin.setUpdatedStatus;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\r\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\t¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0010\u001a\u00020\tH\u0014¢\u0006\u0004\b\u0010\u0010\u0013R\u0014\u0010\u0012\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0014\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0011\u0010\n\u001a\u00020\u00188G¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0019R \u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u001b0\u001a8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001dR&\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u001b0\u001e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u001f\u001a\u0004\b\n\u0010 R\u0016\u0010\u0016\u001a\u00020\b8\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b\u0012\u0010!R\u0016\u0010\"\u001a\u00020\b8\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b\u0010\u0010!"}, d2 = {"Lcom/marrow2/ui/test/testplay/TestMcqViewModel;", "Lo/POJOPropertyBuilderWithMember;", "Lo/NetworkTypeObserverApi31DisplayInfoCallback;", "p0", "Lo/checkAvailabilityAndConnect;", "p1", "<init>", "(Lo/NetworkTypeObserverApi31DisplayInfoCallback;Lo/checkAvailabilityAndConnect;)V", "", "", "AudioAttributesCompatParcelizer", "(Ljava/lang/String;Ljava/lang/String;)V", "", "RemoteActionCompatParcelizer", "(I)V", "", "write", "(Z)V", "IconCompatParcelizer", "()V", "read", "Lo/NetworkTypeObserverApi31DisplayInfoCallback;", "AudioAttributesImplApi26Parcelizer", "Lo/checkAvailabilityAndConnect;", "Lo/getApiFeatures;", "()Lo/getApiFeatures;", "Lo/getResolutionSize;", "Lo/DataSourceBitmapLoaderExternalSyntheticLambda0;", "Lo/setTextAppearanceResource;", "Lo/getResolutionSize;", "Lo/setUpdatedStatus;", "Lo/setUpdatedStatus;", "()Lo/setUpdatedStatus;", "Ljava/lang/String;", "MediaBrowserCompatItemReceiver"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TestMcqViewModel extends POJOPropertyBuilderWithMember {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final getResolutionSize<DataSourceBitmapLoaderExternalSyntheticLambda0<setTextAppearanceResource>> RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private final checkAvailabilityAndConnect read;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private String AudioAttributesImplApi26Parcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final setUpdatedStatus<DataSourceBitmapLoaderExternalSyntheticLambda0<setTextAppearanceResource>> write;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final NetworkTypeObserverApi31DisplayInfoCallback IconCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private String MediaBrowserCompatItemReceiver;

    @setSdkPayload
    public TestMcqViewModel(NetworkTypeObserverApi31DisplayInfoCallback networkTypeObserverApi31DisplayInfoCallback, checkAvailabilityAndConnect checkavailabilityandconnect) {
        toMagicModuleMetaRepoModel.write(networkTypeObserverApi31DisplayInfoCallback, "");
        toMagicModuleMetaRepoModel.write(checkavailabilityandconnect, "");
        this.IconCompatParcelizer = networkTypeObserverApi31DisplayInfoCallback;
        this.read = checkavailabilityandconnect;
        getResolutionSize<DataSourceBitmapLoaderExternalSyntheticLambda0<setTextAppearanceResource>> getresolutionsizeRemoteActionCompatParcelizer = setStartTime.RemoteActionCompatParcelizer(new setStreamingFormat(null, 1, null));
        this.RemoteActionCompatParcelizer = getresolutionsizeRemoteActionCompatParcelizer;
        this.write = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer);
    }

    public final getApiFeatures read() {
        return this.read;
    }

    public final setUpdatedStatus<DataSourceBitmapLoaderExternalSyntheticLambda0<setTextAppearanceResource>> AudioAttributesCompatParcelizer() {
        return this.write;
    }

    public final void AudioAttributesCompatParcelizer(String p0, String p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        this.AudioAttributesImplApi26Parcelizer = p0;
        this.MediaBrowserCompatItemReceiver = p1;
        lambdaloadBitmap2comgoogleandroidexoplayer2upstreamDataSourceBitmapLoader.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, null);
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new IconCompatParcelizer(p0, p1, null), new MagicModuleSubmissionRequestBody() { // from class: o.setErrorShown
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return TestMcqViewModel.read((String) obj2);
            }
        });
    }

    static final class IconCompatParcelizer extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int IconCompatParcelizer;
        private /* synthetic */ String RemoteActionCompatParcelizer;
        private /* synthetic */ String read;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.IconCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.IconCompatParcelizer = 1;
                obj = TestMcqViewModel.this.IconCompatParcelizer.IconCompatParcelizer(this.RemoteActionCompatParcelizer, this.read, this);
                if (obj == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            CachedContent cachedContent = (CachedContent) obj;
            lambdaloadBitmap2comgoogleandroidexoplayer2upstreamDataSourceBitmapLoader.IconCompatParcelizer(TestMcqViewModel.this.RemoteActionCompatParcelizer, new setTextAppearanceResource(cachedContent.getWrite(), cachedContent.getAudioAttributesCompatParcelizer(), cachedContent.getAudioAttributesImplApi26Parcelizer(), cachedContent.MediaBrowserCompatMediaItem(), cachedContent.getMediaDescriptionCompat(), cachedContent.getMediaBrowserCompatMediaItem(), getAllRequestedScopes.read(cachedContent)));
            return getShowPopup.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IconCompatParcelizer(String str, String str2, SampleVideos<? super IconCompatParcelizer> sampleVideos) {
            super(1, sampleVideos);
            this.RemoteActionCompatParcelizer = str;
            this.read = str2;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return TestMcqViewModel.this.new IconCompatParcelizer(this.RemoteActionCompatParcelizer, this.read, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((IconCompatParcelizer) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return getShowPopup.INSTANCE;
    }

    public final void RemoteActionCompatParcelizer(int p0) {
        getResolutionSize<DataSourceBitmapLoaderExternalSyntheticLambda0<setTextAppearanceResource>> getresolutionsize = this.RemoteActionCompatParcelizer;
        lambdaloadBitmap2comgoogleandroidexoplayer2upstreamDataSourceBitmapLoader.IconCompatParcelizer(getresolutionsize, setTextAppearanceResource.AudioAttributesCompatParcelizer(getresolutionsize.IconCompatParcelizer().read(), null, false, null, null, null, Integer.valueOf(p0), null, 95));
    }

    public final void write(boolean p0) {
        getResolutionSize<DataSourceBitmapLoaderExternalSyntheticLambda0<setTextAppearanceResource>> getresolutionsize = this.RemoteActionCompatParcelizer;
        lambdaloadBitmap2comgoogleandroidexoplayer2upstreamDataSourceBitmapLoader.IconCompatParcelizer(getresolutionsize, setTextAppearanceResource.AudioAttributesCompatParcelizer(getresolutionsize.IconCompatParcelizer().read(), null, p0, null, null, null, null, null, 125));
    }

    public final void IconCompatParcelizer() {
        getResolutionSize<DataSourceBitmapLoaderExternalSyntheticLambda0<setTextAppearanceResource>> getresolutionsize = this.RemoteActionCompatParcelizer;
        lambdaloadBitmap2comgoogleandroidexoplayer2upstreamDataSourceBitmapLoader.IconCompatParcelizer(getresolutionsize, setTextAppearanceResource.AudioAttributesCompatParcelizer(getresolutionsize.IconCompatParcelizer().read(), null, false, null, null, null, null, null, 95));
    }

    @Override // kotlin.POJOPropertyBuilderWithMember
    public final void write() {
        this.read.onEvent(BaseGmsClient.read.INSTANCE);
        super.write();
    }
}
