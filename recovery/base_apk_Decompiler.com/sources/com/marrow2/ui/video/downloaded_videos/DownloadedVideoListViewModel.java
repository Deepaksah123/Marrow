package com.marrow2.ui.video.downloaded_videos;

import com.marrow2.ui.video.downloaded_videos.DownloadedVideoListViewModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.CmcdHeadersFactoryCmcdObjectBuilder;
import kotlin.IntermediateLoginResponseBody;
import kotlin.MagicModuleSubmissionRequestBody;
import kotlin.Metadata;
import kotlin.POJOPropertyBuilderWithMember;
import kotlin.RenewEligibleCreator;
import kotlin.SampleVideos;
import kotlin.SdkPayloadData;
import kotlin.SwitchMaterial;
import kotlin.TopUserCompanion;
import kotlin.TypeResolutionContextBasic;
import kotlin.VerifyNewNumberRequest;
import kotlin.getAnswerMap;
import kotlin.getContentMetadata;
import kotlin.getMagicModuleStats;
import kotlin.getPlatform;
import kotlin.getResolutionSize;
import kotlin.getShowPopup;
import kotlin.getTotalMcq;
import kotlin.getYear;
import kotlin.inferContentTypeForExtension;
import kotlin.isSeekPending;
import kotlin.isTrafficRestricted;
import kotlin.setInlineLabel;
import kotlin.setMaxInlineActionWidth;
import kotlin.setModifiedEndTimestampMs;
import kotlin.setOnTabSelectedListener;
import kotlin.setSdkPayload;
import kotlin.setSelectedTabIndicator;
import kotlin.setStartTime;
import kotlin.setUpdatedStatus;
import kotlin.skipH265ScalingList;
import kotlin.toMagicModuleMetaRepoModel;
import kotlin.traverseForStyle;
import kotlin.updateLoadingFinished;
import org.apache.commons.compress.archivers.zip.UnixStat;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u000eH\u0082@¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0012\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0012\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0003\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u001b¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001e\u0010\u0010J\u001e\u0010 \u001a\u00020\u000e2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00170\u001fH\u0082@¢\u0006\u0004\b \u0010!J\u001d\u0010\u001c\u001a\u00020\u000e2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00170\u001fH\u0002¢\u0006\u0004\b\u001c\u0010\"J\u000f\u0010#\u001a\u00020\u000eH\u0002¢\u0006\u0004\b#\u0010\u0010J\r\u0010%\u001a\u00020$¢\u0006\u0004\b%\u0010&R\u0014\u0010\u0012\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010\u0019\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010\u001c\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010 \u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u00101\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u001a\u0010/\u001a\b\u0012\u0004\u0012\u000203028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u001d\u00104\u001a\b\u0012\u0004\u0012\u000203068\u0007¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b4\u00109R\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020:028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0019\u00105R \u0010-\u001a\b\u0012\u0004\u0012\u00020:068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b#\u00108\u001a\u0004\b\u0012\u00109R\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u0017028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0012\u00105R \u0010'\u001a\b\u0012\u0004\u0012\u00020\u0017068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u00108\u001a\u0004\b/\u00109R\u001c\u0010#\u001a\b\u0012\u0004\u0012\u00020;028\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b \u00105R \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020;068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u00108\u001a\u0004\b1\u00109R\u001c\u0010<\u001a\b\u0012\u0004\u0012\u00020;028\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001c\u00105R \u0010\u001e\u001a\b\u0012\u0004\u0012\u00020;068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b<\u00108\u001a\u0004\b-\u00109R\u001a\u0010>\u001a\b\u0012\u0004\u0012\u00020=028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b1\u00105R \u0010?\u001a\b\u0012\u0004\u0012\u00020=068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u00108\u001a\u0004\b\u001c\u00109R\u0016\u00107\u001a\u00020\u00178\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b%\u0010@"}, d2 = {"Lcom/marrow2/ui/video/downloaded_videos/DownloadedVideoListViewModel;", "Lo/POJOPropertyBuilderWithMember;", "Lo/inferContentTypeForExtension;", "p0", "Lo/skipH265ScalingList;", "p1", "", "p2", "Lo/isSeekPending;", "p3", "Lo/getPlatform;", "p4", "<init>", "(Lo/inferContentTypeForExtension;Lo/skipH265ScalingList;Ljava/lang/Object;Lo/isSeekPending;Lo/getPlatform;)V", "", "MediaMetadataCompat", "()V", "MediaBrowserCompatCustomActionResultReceiver", "AudioAttributesCompatParcelizer", "(Lo/SampleVideos;)Ljava/lang/Object;", "Lo/getContentMetadata;", "", "(Lo/getContentMetadata;)F", "", "", "write", "(Ljava/lang/String;)Z", "Lo/setOnTabSelectedListener;", "IconCompatParcelizer", "(Lo/setOnTabSelectedListener;)V", "MediaBrowserCompatMediaItem", "", "RemoteActionCompatParcelizer", "(Ljava/util/List;Lo/SampleVideos;)Ljava/lang/Object;", "(Ljava/util/List;)V", "MediaBrowserCompatSearchResultReceiver", "", "AudioAttributesImplApi26Parcelizer", "()I", "MediaDescriptionCompat", "Lo/inferContentTypeForExtension;", "handleMediaPlayPauseIfPendingOnHandler", "Lo/skipH265ScalingList;", "onCommand", "Ljava/lang/Object;", "MediaBrowserCompatItemReceiver", "Lo/isSeekPending;", "AudioAttributesImplBaseParcelizer", "Lo/getPlatform;", "read", "Lo/getResolutionSize;", "Lo/SwitchMaterial;", "AudioAttributesImplApi21Parcelizer", "Lo/getResolutionSize;", "Lo/setUpdatedStatus;", "onCustomAction", "Lo/setUpdatedStatus;", "()Lo/setUpdatedStatus;", "Lo/setInlineLabel;", "Lo/setSelectedTabIndicator;", "RatingCompat", "Lo/setMaxInlineActionWidth;", "onAddQueueItem", "MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver", "Ljava/lang/String;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class DownloadedVideoListViewModel extends POJOPropertyBuilderWithMember {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final getResolutionSize<String> MediaBrowserCompatCustomActionResultReceiver;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private final getResolutionSize<SwitchMaterial> AudioAttributesImplBaseParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private String onCustomAction;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private final getPlatform read;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private getResolutionSize<setSelectedTabIndicator> RatingCompat;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private final setUpdatedStatus<setMaxInlineActionWidth> MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private final isSeekPending RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatMediaItem, reason: from kotlin metadata */
    private final setUpdatedStatus<String> MediaDescriptionCompat;

    /* JADX INFO: renamed from: MediaBrowserCompatSearchResultReceiver, reason: from kotlin metadata */
    private final setUpdatedStatus<setInlineLabel> MediaBrowserCompatItemReceiver;

    /* JADX INFO: renamed from: MediaDescriptionCompat, reason: from kotlin metadata */
    private final inferContentTypeForExtension AudioAttributesCompatParcelizer;
    private final setUpdatedStatus<setSelectedTabIndicator> MediaMetadataCompat;

    /* JADX INFO: renamed from: RatingCompat, reason: from kotlin metadata */
    private final setUpdatedStatus<setSelectedTabIndicator> MediaBrowserCompatMediaItem;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private getResolutionSize<setSelectedTabIndicator> MediaBrowserCompatSearchResultReceiver;

    /* JADX INFO: renamed from: handleMediaPlayPauseIfPendingOnHandler, reason: from kotlin metadata */
    private final skipH265ScalingList write;

    /* JADX INFO: renamed from: onCommand, reason: from kotlin metadata */
    private final Object IconCompatParcelizer;

    /* JADX INFO: renamed from: onCustomAction, reason: from kotlin metadata */
    private final setUpdatedStatus<SwitchMaterial> AudioAttributesImplApi21Parcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final getResolutionSize<setMaxInlineActionWidth> onAddQueueItem;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final getResolutionSize<setInlineLabel> AudioAttributesImplApi26Parcelizer;

    static final class write extends getTotalMcq {
        /* synthetic */ Object AudioAttributesCompatParcelizer;
        int IconCompatParcelizer;
        int RemoteActionCompatParcelizer;
        int read;

        write(SampleVideos<? super write> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.AudioAttributesCompatParcelizer = obj;
            this.IconCompatParcelizer |= Integer.MIN_VALUE;
            return DownloadedVideoListViewModel.this.AudioAttributesCompatParcelizer(this);
        }
    }

    @setSdkPayload
    public DownloadedVideoListViewModel(inferContentTypeForExtension infercontenttypeforextension, skipH265ScalingList skiph265scalinglist, Object obj, isSeekPending isseekpending, getPlatform getplatform) {
        toMagicModuleMetaRepoModel.write(infercontenttypeforextension, "");
        toMagicModuleMetaRepoModel.write(skiph265scalinglist, "");
        toMagicModuleMetaRepoModel.write(obj, "");
        toMagicModuleMetaRepoModel.write(isseekpending, "");
        toMagicModuleMetaRepoModel.write(getplatform, "");
        this.AudioAttributesCompatParcelizer = infercontenttypeforextension;
        this.write = skiph265scalinglist;
        this.IconCompatParcelizer = obj;
        this.RemoteActionCompatParcelizer = isseekpending;
        this.read = getplatform;
        getResolutionSize<SwitchMaterial> getresolutionsizeRemoteActionCompatParcelizer = setStartTime.RemoteActionCompatParcelizer(SwitchMaterial.AudioAttributesCompatParcelizer.INSTANCE);
        this.AudioAttributesImplBaseParcelizer = getresolutionsizeRemoteActionCompatParcelizer;
        this.AudioAttributesImplApi21Parcelizer = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer);
        getResolutionSize<setInlineLabel> getresolutionsizeRemoteActionCompatParcelizer2 = setStartTime.RemoteActionCompatParcelizer(new setInlineLabel(false, 0, false, false, 0, 0, false, null, false, UnixStat.DEFAULT_LINK_PERM, null));
        this.AudioAttributesImplApi26Parcelizer = getresolutionsizeRemoteActionCompatParcelizer2;
        this.MediaBrowserCompatItemReceiver = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer2);
        getResolutionSize<String> getresolutionsizeRemoteActionCompatParcelizer3 = setStartTime.RemoteActionCompatParcelizer("");
        this.MediaBrowserCompatCustomActionResultReceiver = getresolutionsizeRemoteActionCompatParcelizer3;
        this.MediaDescriptionCompat = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer3);
        setSelectedTabIndicator.read readVar = setSelectedTabIndicator.write;
        getResolutionSize<setSelectedTabIndicator> getresolutionsizeRemoteActionCompatParcelizer4 = setStartTime.RemoteActionCompatParcelizer(setSelectedTabIndicator.read.RemoteActionCompatParcelizer());
        this.MediaBrowserCompatSearchResultReceiver = getresolutionsizeRemoteActionCompatParcelizer4;
        this.MediaMetadataCompat = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer4);
        setSelectedTabIndicator.read readVar2 = setSelectedTabIndicator.write;
        getResolutionSize<setSelectedTabIndicator> getresolutionsizeRemoteActionCompatParcelizer5 = setStartTime.RemoteActionCompatParcelizer(setSelectedTabIndicator.read.RemoteActionCompatParcelizer());
        this.RatingCompat = getresolutionsizeRemoteActionCompatParcelizer5;
        this.MediaBrowserCompatMediaItem = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer5);
        getResolutionSize<setMaxInlineActionWidth> getresolutionsizeRemoteActionCompatParcelizer6 = setStartTime.RemoteActionCompatParcelizer(new setMaxInlineActionWidth(false, false, 3, null));
        this.onAddQueueItem = getresolutionsizeRemoteActionCompatParcelizer6;
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer6);
        this.onCustomAction = "";
        MediaMetadataCompat();
    }

    public final setUpdatedStatus<SwitchMaterial> AudioAttributesImplApi21Parcelizer() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    public final setUpdatedStatus<setInlineLabel> AudioAttributesCompatParcelizer() {
        return this.MediaBrowserCompatItemReceiver;
    }

    public final setUpdatedStatus<String> AudioAttributesImplBaseParcelizer() {
        return this.MediaDescriptionCompat;
    }

    public final setUpdatedStatus<setSelectedTabIndicator> read() {
        return this.MediaMetadataCompat;
    }

    public final setUpdatedStatus<setSelectedTabIndicator> MediaBrowserCompatItemReceiver() {
        return this.MediaBrowserCompatMediaItem;
    }

    public final setUpdatedStatus<setMaxInlineActionWidth> IconCompatParcelizer() {
        return this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    }

    static final class IconCompatParcelizer extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private Object RemoteActionCompatParcelizer;
        private Object read;
        private int write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            setMaxInlineActionWidth setmaxinlineactionwidth;
            getResolutionSize getresolutionsize;
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.write;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                getResolutionSize getresolutionsize2 = DownloadedVideoListViewModel.this.onAddQueueItem;
                setMaxInlineActionWidth setmaxinlineactionwidth2 = (setMaxInlineActionWidth) DownloadedVideoListViewModel.this.onAddQueueItem.IconCompatParcelizer();
                this.read = getresolutionsize2;
                this.RemoteActionCompatParcelizer = setmaxinlineactionwidth2;
                this.write = 1;
                Object objRemoteActionCompatParcelizer = DownloadedVideoListViewModel.this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(this);
                if (objRemoteActionCompatParcelizer == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
                setmaxinlineactionwidth = setmaxinlineactionwidth2;
                obj = objRemoteActionCompatParcelizer;
                getresolutionsize = getresolutionsize2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                setmaxinlineactionwidth = (setMaxInlineActionWidth) this.RemoteActionCompatParcelizer;
                getresolutionsize = (getResolutionSize) this.read;
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            getresolutionsize.write(setMaxInlineActionWidth.IconCompatParcelizer(setmaxinlineactionwidth, ((Boolean) obj).booleanValue(), false, 2));
            return getShowPopup.INSTANCE;
        }

        IconCompatParcelizer(SampleVideos<? super IconCompatParcelizer> sampleVideos) {
            super(1, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return DownloadedVideoListViewModel.this.new IconCompatParcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((IconCompatParcelizer) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void MediaMetadataCompat() {
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new IconCompatParcelizer(null), new MagicModuleSubmissionRequestBody() { // from class: o.setLabelBehavior
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return DownloadedVideoListViewModel.write(this.read, (String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup write(DownloadedVideoListViewModel downloadedVideoListViewModel, String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        downloadedVideoListViewModel.MediaBrowserCompatCustomActionResultReceiver.write(str);
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void MediaBrowserCompatCustomActionResultReceiver() {
        getResolutionSize<setSelectedTabIndicator> getresolutionsize = this.MediaBrowserCompatSearchResultReceiver;
        getresolutionsize.write(setSelectedTabIndicator.RemoteActionCompatParcelizer(getresolutionsize.IconCompatParcelizer(), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(), null, 2));
        getResolutionSize<setSelectedTabIndicator> getresolutionsize2 = this.RatingCompat;
        getresolutionsize2.write(setSelectedTabIndicator.RemoteActionCompatParcelizer(getresolutionsize2.IconCompatParcelizer(), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(), null, 2));
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new AudioAttributesCompatParcelizer(null), new MagicModuleSubmissionRequestBody() { // from class: o.setLabelFormatter
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return DownloadedVideoListViewModel.read(this.RemoteActionCompatParcelizer, (String) obj2);
            }
        });
    }

    static final class AudioAttributesCompatParcelizer extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private float AudioAttributesCompatParcelizer;
        private int AudioAttributesImplApi21Parcelizer;
        private Object AudioAttributesImplApi26Parcelizer;
        private int AudioAttributesImplBaseParcelizer;
        private int IconCompatParcelizer;
        private Object MediaBrowserCompatCustomActionResultReceiver;
        private Object MediaBrowserCompatItemReceiver;
        private Object MediaBrowserCompatMediaItem;
        private Object MediaBrowserCompatSearchResultReceiver;
        private Object MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        private Object MediaDescriptionCompat;
        private Object MediaMetadataCompat;
        private Object RatingCompat;
        private int RemoteActionCompatParcelizer;
        private Object handleMediaPlayPauseIfPendingOnHandler;
        private Object onAddQueueItem;
        private Object onCommand;
        private Object onCustomAction;
        private boolean onFastForward;
        private boolean onMediaButtonEvent;
        private Object onPause;
        private Object onPlay;
        private boolean onPlayFromMediaId;
        private int onPrepareFromSearch;
        private int read;
        private int write;

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0152, code lost:
        
            if (r2 == r1) goto L14;
         */
        /* JADX WARN: Path cross not found for [B:40:0x0328, B:43:0x0331], limit reached: 78 */
        /* JADX WARN: Removed duplicated region for block: B:20:0x016a  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0209  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x020c  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0274  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x029f  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x02a4  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x0306  */
        /* JADX WARN: Removed duplicated region for block: B:45:0x0342  */
        /* JADX WARN: Removed duplicated region for block: B:77:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:78:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x0306 -> B:38:0x0320). Please report as a decompilation issue!!! */
        @Override // kotlin.getMonthName
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r32) {
            /*
                Method dump skipped, instruction units count: 1324
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.video.downloaded_videos.DownloadedVideoListViewModel.AudioAttributesCompatParcelizer.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        AudioAttributesCompatParcelizer(SampleVideos<? super AudioAttributesCompatParcelizer> sampleVideos) {
            super(1, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return DownloadedVideoListViewModel.this.new AudioAttributesCompatParcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AudioAttributesCompatParcelizer) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(DownloadedVideoListViewModel downloadedVideoListViewModel, String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        downloadedVideoListViewModel.MediaBrowserCompatCustomActionResultReceiver.write(str);
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0093 A[Catch: all -> 0x0175, TryCatch #0 {all -> 0x0175, blocks: (B:32:0x00d8, B:34:0x00e5, B:35:0x0111, B:37:0x0129, B:38:0x0157, B:24:0x0080, B:26:0x0093, B:27:0x00c0), top: B:47:0x0080 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00e5 A[Catch: all -> 0x0175, TryCatch #0 {all -> 0x0175, blocks: (B:32:0x00d8, B:34:0x00e5, B:35:0x0111, B:37:0x0129, B:38:0x0157, B:24:0x0080, B:26:0x0093, B:27:0x00c0), top: B:47:0x0080 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0129 A[Catch: all -> 0x0175, TryCatch #0 {all -> 0x0175, blocks: (B:32:0x00d8, B:34:0x00e5, B:35:0x0111, B:37:0x0129, B:38:0x0157, B:24:0x0080, B:26:0x0093, B:27:0x00c0), top: B:47:0x0080 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object AudioAttributesCompatParcelizer(kotlin.SampleVideos<? super kotlin.getShowPopup> r27) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 383
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.video.downloaded_videos.DownloadedVideoListViewModel.AudioAttributesCompatParcelizer(o.SampleVideos):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static float AudioAttributesCompatParcelizer(getContentMetadata p0) {
        return p0.getMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() / p0.getOnAddQueueItem();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean write(String p0) {
        return this.MediaBrowserCompatSearchResultReceiver.IconCompatParcelizer().read().contains(p0) || this.RatingCompat.IconCompatParcelizer().read().contains(p0);
    }

    public final void IconCompatParcelizer(setOnTabSelectedListener p0) {
        SwitchMaterial.AudioAttributesImplBaseParcelizer iconCompatParcelizer;
        toMagicModuleMetaRepoModel.write(p0, "");
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, setOnTabSelectedListener.RemoteActionCompatParcelizer.INSTANCE)) {
            this.AudioAttributesImplBaseParcelizer.write(SwitchMaterial.AudioAttributesCompatParcelizer.INSTANCE);
            return;
        }
        if (p0 instanceof setOnTabSelectedListener.MediaBrowserCompatSearchResultReceiver) {
            if (((setOnTabSelectedListener.MediaBrowserCompatSearchResultReceiver) p0).write()) {
                getResolutionSize<setSelectedTabIndicator> getresolutionsize = this.MediaBrowserCompatSearchResultReceiver;
                setSelectedTabIndicator setselectedtabindicatorIconCompatParcelizer = getresolutionsize.IconCompatParcelizer();
                List<isTrafficRestricted.RemoteActionCompatParcelizer> listWrite = this.MediaBrowserCompatSearchResultReceiver.IconCompatParcelizer().write();
                ArrayList arrayList = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) listWrite, 10));
                Iterator<T> it = listWrite.iterator();
                while (it.hasNext()) {
                    arrayList.add(((isTrafficRestricted.RemoteActionCompatParcelizer) it.next()).MediaBrowserCompatItemReceiver());
                }
                getresolutionsize.write(setSelectedTabIndicator.RemoteActionCompatParcelizer(setselectedtabindicatorIconCompatParcelizer, null, arrayList, 1));
                getResolutionSize<setSelectedTabIndicator> getresolutionsize2 = this.RatingCompat;
                setSelectedTabIndicator setselectedtabindicatorIconCompatParcelizer2 = getresolutionsize2.IconCompatParcelizer();
                List<isTrafficRestricted.RemoteActionCompatParcelizer> listWrite2 = this.RatingCompat.IconCompatParcelizer().write();
                ArrayList arrayList2 = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) listWrite2, 10));
                Iterator<T> it2 = listWrite2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((isTrafficRestricted.RemoteActionCompatParcelizer) it2.next()).MediaBrowserCompatItemReceiver());
                }
                getresolutionsize2.write(setSelectedTabIndicator.RemoteActionCompatParcelizer(setselectedtabindicatorIconCompatParcelizer2, null, arrayList2, 1));
            } else {
                getResolutionSize<setSelectedTabIndicator> getresolutionsize3 = this.MediaBrowserCompatSearchResultReceiver;
                getresolutionsize3.write(setSelectedTabIndicator.RemoteActionCompatParcelizer(getresolutionsize3.IconCompatParcelizer(), null, IntermediateLoginResponseBody.RemoteActionCompatParcelizer(), 1));
                getResolutionSize<setSelectedTabIndicator> getresolutionsize4 = this.RatingCompat;
                getresolutionsize4.write(setSelectedTabIndicator.RemoteActionCompatParcelizer(getresolutionsize4.IconCompatParcelizer(), null, IntermediateLoginResponseBody.RemoteActionCompatParcelizer(), 1));
            }
            MediaBrowserCompatMediaItem();
            return;
        }
        int i = 0;
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, setOnTabSelectedListener.MediaBrowserCompatCustomActionResultReceiver.INSTANCE)) {
            if (this.AudioAttributesImplApi26Parcelizer.IconCompatParcelizer().getAudioAttributesImplApi21Parcelizer()) {
                getResolutionSize<setMaxInlineActionWidth> getresolutionsize5 = this.onAddQueueItem;
                getresolutionsize5.write(setMaxInlineActionWidth.IconCompatParcelizer(getresolutionsize5.IconCompatParcelizer(), false, false, 1));
                getResolutionSize<setInlineLabel> getresolutionsize6 = this.AudioAttributesImplApi26Parcelizer;
                setInlineLabel setinlinelabelIconCompatParcelizer = getresolutionsize6.IconCompatParcelizer();
                getresolutionsize6.write(setInlineLabel.RemoteActionCompatParcelizer((507 & 1) != 0 ? setinlinelabelIconCompatParcelizer.AudioAttributesImplApi21Parcelizer : false, (507 & 2) != 0 ? setinlinelabelIconCompatParcelizer.RemoteActionCompatParcelizer : 0, (507 & 4) != 0 ? setinlinelabelIconCompatParcelizer.AudioAttributesImplApi26Parcelizer : false, (507 & 8) != 0 ? setinlinelabelIconCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver : false, (507 & 16) != 0 ? setinlinelabelIconCompatParcelizer.read : 0, (507 & 32) != 0 ? setinlinelabelIconCompatParcelizer.MediaBrowserCompatItemReceiver : 0, (507 & 64) != 0 ? setinlinelabelIconCompatParcelizer.AudioAttributesCompatParcelizer : false, (507 & 128) != 0 ? setinlinelabelIconCompatParcelizer.IconCompatParcelizer : null, (507 & 256) != 0 ? setinlinelabelIconCompatParcelizer.write : false));
                getResolutionSize<setSelectedTabIndicator> getresolutionsize7 = this.MediaBrowserCompatSearchResultReceiver;
                getresolutionsize7.write(setSelectedTabIndicator.RemoteActionCompatParcelizer(getresolutionsize7.IconCompatParcelizer(), null, IntermediateLoginResponseBody.RemoteActionCompatParcelizer(), 1));
                getResolutionSize<setSelectedTabIndicator> getresolutionsize8 = this.RatingCompat;
                getresolutionsize8.write(setSelectedTabIndicator.RemoteActionCompatParcelizer(getresolutionsize8.IconCompatParcelizer(), null, IntermediateLoginResponseBody.RemoteActionCompatParcelizer(), 1));
            } else {
                getResolutionSize<setMaxInlineActionWidth> getresolutionsize9 = this.onAddQueueItem;
                getresolutionsize9.write(setMaxInlineActionWidth.IconCompatParcelizer(getresolutionsize9.IconCompatParcelizer(), false, true, 1));
            }
            boolean audioAttributesImplApi21Parcelizer = this.AudioAttributesImplApi26Parcelizer.IconCompatParcelizer().getAudioAttributesImplApi21Parcelizer();
            getResolutionSize<setInlineLabel> getresolutionsize10 = this.AudioAttributesImplApi26Parcelizer;
            setInlineLabel setinlinelabelIconCompatParcelizer2 = getresolutionsize10.IconCompatParcelizer();
            getresolutionsize10.write(setInlineLabel.RemoteActionCompatParcelizer((507 & 1) != 0 ? setinlinelabelIconCompatParcelizer2.AudioAttributesImplApi21Parcelizer : !audioAttributesImplApi21Parcelizer, (507 & 2) != 0 ? setinlinelabelIconCompatParcelizer2.RemoteActionCompatParcelizer : 0, (507 & 4) != 0 ? setinlinelabelIconCompatParcelizer2.AudioAttributesImplApi26Parcelizer : false, (507 & 8) != 0 ? setinlinelabelIconCompatParcelizer2.MediaBrowserCompatCustomActionResultReceiver : false, (507 & 16) != 0 ? setinlinelabelIconCompatParcelizer2.read : 0, (507 & 32) != 0 ? setinlinelabelIconCompatParcelizer2.MediaBrowserCompatItemReceiver : 0, (507 & 64) != 0 ? setinlinelabelIconCompatParcelizer2.AudioAttributesCompatParcelizer : false, (507 & 128) != 0 ? setinlinelabelIconCompatParcelizer2.IconCompatParcelizer : null, (507 & 256) != 0 ? setinlinelabelIconCompatParcelizer2.write : false));
            MediaBrowserCompatMediaItem();
            return;
        }
        if (p0 instanceof setOnTabSelectedListener.AudioAttributesCompatParcelizer) {
            setOnTabSelectedListener.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = (setOnTabSelectedListener.AudioAttributesCompatParcelizer) p0;
            if (audioAttributesCompatParcelizer.RemoteActionCompatParcelizer() == -2 || audioAttributesCompatParcelizer.RemoteActionCompatParcelizer() == -1) {
                MediaBrowserCompatCustomActionResultReceiver();
                return;
            }
            if (audioAttributesCompatParcelizer.RemoteActionCompatParcelizer() < 100 && this.onCustomAction.length() > 0 && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) audioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(), (Object) this.onCustomAction)) {
                List listMediaBrowserCompatItemReceiver = IntermediateLoginResponseBody.MediaBrowserCompatItemReceiver((Collection) this.RatingCompat.IconCompatParcelizer().write());
                Iterator it3 = listMediaBrowserCompatItemReceiver.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        i = -1;
                        break;
                    } else if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) ((isTrafficRestricted.RemoteActionCompatParcelizer) it3.next()).MediaBrowserCompatItemReceiver(), (Object) this.onCustomAction)) {
                        break;
                    } else {
                        i++;
                    }
                }
                if (i == -1) {
                    return;
                }
                isTrafficRestricted.RemoteActionCompatParcelizer remoteActionCompatParcelizer = (isTrafficRestricted.RemoteActionCompatParcelizer) listMediaBrowserCompatItemReceiver.get(i);
                listMediaBrowserCompatItemReceiver.set(i, isTrafficRestricted.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(-2, audioAttributesCompatParcelizer.RemoteActionCompatParcelizer(), remoteActionCompatParcelizer.MediaBrowserCompatItemReceiver, remoteActionCompatParcelizer.AudioAttributesImplBaseParcelizer, remoteActionCompatParcelizer.MediaBrowserCompatMediaItem, remoteActionCompatParcelizer.MediaMetadataCompat, remoteActionCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver, remoteActionCompatParcelizer.AudioAttributesImplApi26Parcelizer, remoteActionCompatParcelizer.MediaDescriptionCompat, remoteActionCompatParcelizer.RemoteActionCompatParcelizer, remoteActionCompatParcelizer.write, remoteActionCompatParcelizer.AudioAttributesImplApi21Parcelizer, remoteActionCompatParcelizer.IconCompatParcelizer));
                getResolutionSize<setSelectedTabIndicator> getresolutionsize11 = this.RatingCompat;
                getresolutionsize11.write(setSelectedTabIndicator.RemoteActionCompatParcelizer(getresolutionsize11.IconCompatParcelizer(), listMediaBrowserCompatItemReceiver, null, 2));
                return;
            }
            String strAudioAttributesCompatParcelizer = audioAttributesCompatParcelizer.AudioAttributesCompatParcelizer();
            this.onCustomAction = strAudioAttributesCompatParcelizer != null ? strAudioAttributesCompatParcelizer : "";
            MediaBrowserCompatCustomActionResultReceiver();
            return;
        }
        if (p0 instanceof setOnTabSelectedListener.IconCompatParcelizer) {
            getResolutionSize<setSelectedTabIndicator> getresolutionsize12 = this.MediaBrowserCompatSearchResultReceiver;
            getresolutionsize12.write(setSelectedTabIndicator.RemoteActionCompatParcelizer(getresolutionsize12.IconCompatParcelizer(), null, ((setOnTabSelectedListener.IconCompatParcelizer) p0).read(), 1));
            MediaBrowserCompatMediaItem();
            return;
        }
        if (p0 instanceof setOnTabSelectedListener.AudioAttributesImplBaseParcelizer) {
            getResolutionSize<setSelectedTabIndicator> getresolutionsize13 = this.RatingCompat;
            getresolutionsize13.write(setSelectedTabIndicator.RemoteActionCompatParcelizer(getresolutionsize13.IconCompatParcelizer(), null, ((setOnTabSelectedListener.AudioAttributesImplBaseParcelizer) p0).IconCompatParcelizer(), 1));
            MediaBrowserCompatMediaItem();
            return;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, setOnTabSelectedListener.write.INSTANCE)) {
            CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new read(null), new MagicModuleSubmissionRequestBody() { // from class: o.setStepSize
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return DownloadedVideoListViewModel.RemoteActionCompatParcelizer((String) obj2);
                }
            });
            return;
        }
        if (p0 instanceof setOnTabSelectedListener.read) {
            CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new AudioAttributesImplApi26Parcelizer(p0, this, null), new MagicModuleSubmissionRequestBody() { // from class: o.setThumbElevationResource
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return DownloadedVideoListViewModel.AudioAttributesImplBaseParcelizer((String) obj2);
                }
            });
            return;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, setOnTabSelectedListener.AudioAttributesImplApi26Parcelizer.INSTANCE)) {
            MediaBrowserCompatCustomActionResultReceiver();
            return;
        }
        if (p0 instanceof setOnTabSelectedListener.AudioAttributesImplApi21Parcelizer) {
            getResolutionSize<SwitchMaterial> getresolutionsize14 = this.AudioAttributesImplBaseParcelizer;
            setOnTabSelectedListener.AudioAttributesImplApi21Parcelizer audioAttributesImplApi21Parcelizer2 = (setOnTabSelectedListener.AudioAttributesImplApi21Parcelizer) p0;
            if (audioAttributesImplApi21Parcelizer2.AudioAttributesCompatParcelizer()) {
                iconCompatParcelizer = new SwitchMaterial.IconCompatParcelizer(audioAttributesImplApi21Parcelizer2.IconCompatParcelizer());
            } else {
                iconCompatParcelizer = SwitchMaterial.AudioAttributesImplBaseParcelizer.INSTANCE;
            }
            getresolutionsize14.write(iconCompatParcelizer);
            return;
        }
        if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, setOnTabSelectedListener.MediaBrowserCompatItemReceiver.INSTANCE)) {
            throw new RenewEligibleCreator();
        }
        this.AudioAttributesImplBaseParcelizer.write(SwitchMaterial.RemoteActionCompatParcelizer.INSTANCE);
    }

    static final class read extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private Object read;
        private int write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.write;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(((setSelectedTabIndicator) DownloadedVideoListViewModel.this.MediaBrowserCompatSearchResultReceiver.IconCompatParcelizer()).read());
                arrayList.addAll(((setSelectedTabIndicator) DownloadedVideoListViewModel.this.RatingCompat.IconCompatParcelizer()).read());
                this.read = null;
                this.write = 1;
                if (DownloadedVideoListViewModel.this.RemoteActionCompatParcelizer(arrayList, this) == objIconCompatParcelizer) {
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

        read(SampleVideos<? super read> sampleVideos) {
            super(1, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return DownloadedVideoListViewModel.this.new read(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((read) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup RemoteActionCompatParcelizer(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return getShowPopup.INSTANCE;
    }

    static final class AudioAttributesImplApi26Parcelizer extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private Object AudioAttributesCompatParcelizer;
        private int IconCompatParcelizer;
        private /* synthetic */ DownloadedVideoListViewModel RemoteActionCompatParcelizer;
        private /* synthetic */ setOnTabSelectedListener read;
        private Object write;

        /* JADX WARN: Code restructure failed: missing block: B:32:0x00bf, code lost:
        
            if (r9 == r0) goto L53;
         */
        /* JADX WARN: Code restructure failed: missing block: B:50:0x0169, code lost:
        
            if (r8.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer((java.util.List<java.lang.String>) kotlin.IntermediateLoginResponseBody.RemoteActionCompatParcelizer(((o.setOnTabSelectedListener.read) r8.read).write()), r8) == r0) goto L53;
         */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0061  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x006e  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x008b  */
        @Override // kotlin.getMonthName
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                Method dump skipped, instruction units count: 440
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.video.downloaded_videos.DownloadedVideoListViewModel.AudioAttributesImplApi26Parcelizer.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AudioAttributesImplApi26Parcelizer(setOnTabSelectedListener setontabselectedlistener, DownloadedVideoListViewModel downloadedVideoListViewModel, SampleVideos<? super AudioAttributesImplApi26Parcelizer> sampleVideos) {
            super(1, sampleVideos);
            this.read = setontabselectedlistener;
            this.RemoteActionCompatParcelizer = downloadedVideoListViewModel;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return new AudioAttributesImplApi26Parcelizer(this.read, this.RemoteActionCompatParcelizer, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AudioAttributesImplApi26Parcelizer) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesImplBaseParcelizer(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return getShowPopup.INSTANCE;
    }

    private final void MediaBrowserCompatMediaItem() {
        int size = this.MediaBrowserCompatSearchResultReceiver.IconCompatParcelizer().read().size() + this.RatingCompat.IconCompatParcelizer().read().size();
        getResolutionSize<setInlineLabel> getresolutionsize = this.AudioAttributesImplApi26Parcelizer;
        setInlineLabel setinlinelabelIconCompatParcelizer = getresolutionsize.IconCompatParcelizer();
        getresolutionsize.write(setInlineLabel.RemoteActionCompatParcelizer((507 & 1) != 0 ? setinlinelabelIconCompatParcelizer.AudioAttributesImplApi21Parcelizer : false, (507 & 2) != 0 ? setinlinelabelIconCompatParcelizer.RemoteActionCompatParcelizer : 0, (507 & 4) != 0 ? setinlinelabelIconCompatParcelizer.AudioAttributesImplApi26Parcelizer : false, (507 & 8) != 0 ? setinlinelabelIconCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver : false, (507 & 16) != 0 ? setinlinelabelIconCompatParcelizer.read : 0, (507 & 32) != 0 ? setinlinelabelIconCompatParcelizer.MediaBrowserCompatItemReceiver : size, (507 & 64) != 0 ? setinlinelabelIconCompatParcelizer.AudioAttributesCompatParcelizer : false, (507 & 128) != 0 ? setinlinelabelIconCompatParcelizer.IconCompatParcelizer : null, (507 & 256) != 0 ? setinlinelabelIconCompatParcelizer.write : false));
        if (size > 0) {
            getResolutionSize<setInlineLabel> getresolutionsize2 = this.AudioAttributesImplApi26Parcelizer;
            setInlineLabel setinlinelabelIconCompatParcelizer2 = getresolutionsize2.IconCompatParcelizer();
            getresolutionsize2.write(setInlineLabel.RemoteActionCompatParcelizer((507 & 1) != 0 ? setinlinelabelIconCompatParcelizer2.AudioAttributesImplApi21Parcelizer : false, (507 & 2) != 0 ? setinlinelabelIconCompatParcelizer2.RemoteActionCompatParcelizer : 0, (507 & 4) != 0 ? setinlinelabelIconCompatParcelizer2.AudioAttributesImplApi26Parcelizer : false, (507 & 8) != 0 ? setinlinelabelIconCompatParcelizer2.MediaBrowserCompatCustomActionResultReceiver : true, (507 & 16) != 0 ? setinlinelabelIconCompatParcelizer2.read : 0, (507 & 32) != 0 ? setinlinelabelIconCompatParcelizer2.MediaBrowserCompatItemReceiver : 0, (507 & 64) != 0 ? setinlinelabelIconCompatParcelizer2.AudioAttributesCompatParcelizer : false, (507 & 128) != 0 ? setinlinelabelIconCompatParcelizer2.IconCompatParcelizer : null, (507 & 256) != 0 ? setinlinelabelIconCompatParcelizer2.write : false));
        } else {
            getResolutionSize<setInlineLabel> getresolutionsize3 = this.AudioAttributesImplApi26Parcelizer;
            setInlineLabel setinlinelabelIconCompatParcelizer3 = getresolutionsize3.IconCompatParcelizer();
            getresolutionsize3.write(setInlineLabel.RemoteActionCompatParcelizer((507 & 1) != 0 ? setinlinelabelIconCompatParcelizer3.AudioAttributesImplApi21Parcelizer : false, (507 & 2) != 0 ? setinlinelabelIconCompatParcelizer3.RemoteActionCompatParcelizer : 0, (507 & 4) != 0 ? setinlinelabelIconCompatParcelizer3.AudioAttributesImplApi26Parcelizer : false, (507 & 8) != 0 ? setinlinelabelIconCompatParcelizer3.MediaBrowserCompatCustomActionResultReceiver : false, (507 & 16) != 0 ? setinlinelabelIconCompatParcelizer3.read : 0, (507 & 32) != 0 ? setinlinelabelIconCompatParcelizer3.MediaBrowserCompatItemReceiver : 0, (507 & 64) != 0 ? setinlinelabelIconCompatParcelizer3.AudioAttributesCompatParcelizer : false, (507 & 128) != 0 ? setinlinelabelIconCompatParcelizer3.IconCompatParcelizer : null, (507 & 256) != 0 ? setinlinelabelIconCompatParcelizer3.write : false));
        }
        if (size == this.MediaBrowserCompatSearchResultReceiver.IconCompatParcelizer().write().size() + this.RatingCompat.IconCompatParcelizer().write().size()) {
            getResolutionSize<setInlineLabel> getresolutionsize4 = this.AudioAttributesImplApi26Parcelizer;
            setInlineLabel setinlinelabelIconCompatParcelizer4 = getresolutionsize4.IconCompatParcelizer();
            getresolutionsize4.write(setInlineLabel.RemoteActionCompatParcelizer((507 & 1) != 0 ? setinlinelabelIconCompatParcelizer4.AudioAttributesImplApi21Parcelizer : false, (507 & 2) != 0 ? setinlinelabelIconCompatParcelizer4.RemoteActionCompatParcelizer : 0, (507 & 4) != 0 ? setinlinelabelIconCompatParcelizer4.AudioAttributesImplApi26Parcelizer : false, (507 & 8) != 0 ? setinlinelabelIconCompatParcelizer4.MediaBrowserCompatCustomActionResultReceiver : false, (507 & 16) != 0 ? setinlinelabelIconCompatParcelizer4.read : 0, (507 & 32) != 0 ? setinlinelabelIconCompatParcelizer4.MediaBrowserCompatItemReceiver : 0, (507 & 64) != 0 ? setinlinelabelIconCompatParcelizer4.AudioAttributesCompatParcelizer : true, (507 & 128) != 0 ? setinlinelabelIconCompatParcelizer4.IconCompatParcelizer : null, (507 & 256) != 0 ? setinlinelabelIconCompatParcelizer4.write : false));
        } else {
            getResolutionSize<setInlineLabel> getresolutionsize5 = this.AudioAttributesImplApi26Parcelizer;
            setInlineLabel setinlinelabelIconCompatParcelizer5 = getresolutionsize5.IconCompatParcelizer();
            getresolutionsize5.write(setInlineLabel.RemoteActionCompatParcelizer((507 & 1) != 0 ? setinlinelabelIconCompatParcelizer5.AudioAttributesImplApi21Parcelizer : false, (507 & 2) != 0 ? setinlinelabelIconCompatParcelizer5.RemoteActionCompatParcelizer : 0, (507 & 4) != 0 ? setinlinelabelIconCompatParcelizer5.AudioAttributesImplApi26Parcelizer : false, (507 & 8) != 0 ? setinlinelabelIconCompatParcelizer5.MediaBrowserCompatCustomActionResultReceiver : false, (507 & 16) != 0 ? setinlinelabelIconCompatParcelizer5.read : 0, (507 & 32) != 0 ? setinlinelabelIconCompatParcelizer5.MediaBrowserCompatItemReceiver : 0, (507 & 64) != 0 ? setinlinelabelIconCompatParcelizer5.AudioAttributesCompatParcelizer : false, (507 & 128) != 0 ? setinlinelabelIconCompatParcelizer5.IconCompatParcelizer : null, (507 & 256) != 0 ? setinlinelabelIconCompatParcelizer5.write : false));
        }
    }

    static final class RemoteActionCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private /* synthetic */ List<String> IconCompatParcelizer;
        private int RemoteActionCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.RemoteActionCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.RemoteActionCompatParcelizer = 1;
                if (DownloadedVideoListViewModel.this.AudioAttributesCompatParcelizer.write(this.IconCompatParcelizer, this) == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            DownloadedVideoListViewModel.this.MediaBrowserCompatSearchResultReceiver();
            DownloadedVideoListViewModel.this.IconCompatParcelizer(this.IconCompatParcelizer);
            getResolutionSize getresolutionsize = DownloadedVideoListViewModel.this.AudioAttributesImplApi26Parcelizer;
            setInlineLabel setinlinelabel = (setInlineLabel) DownloadedVideoListViewModel.this.AudioAttributesImplApi26Parcelizer.IconCompatParcelizer();
            getresolutionsize.write(setInlineLabel.RemoteActionCompatParcelizer((507 & 1) != 0 ? setinlinelabel.AudioAttributesImplApi21Parcelizer : false, (507 & 2) != 0 ? setinlinelabel.RemoteActionCompatParcelizer : 0, (507 & 4) != 0 ? setinlinelabel.AudioAttributesImplApi26Parcelizer : false, (507 & 8) != 0 ? setinlinelabel.MediaBrowserCompatCustomActionResultReceiver : false, (507 & 16) != 0 ? setinlinelabel.read : 0, (507 & 32) != 0 ? setinlinelabel.MediaBrowserCompatItemReceiver : 0, (507 & 64) != 0 ? setinlinelabel.AudioAttributesCompatParcelizer : false, (507 & 128) != 0 ? setinlinelabel.IconCompatParcelizer : null, (507 & 256) != 0 ? setinlinelabel.write : false));
            DownloadedVideoListViewModel.this.onAddQueueItem.write(setMaxInlineActionWidth.IconCompatParcelizer((setMaxInlineActionWidth) DownloadedVideoListViewModel.this.onAddQueueItem.IconCompatParcelizer(), false, false, 1));
            return getShowPopup.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        RemoteActionCompatParcelizer(List<String> list, SampleVideos<? super RemoteActionCompatParcelizer> sampleVideos) {
            super(2, sampleVideos);
            this.IconCompatParcelizer = list;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return DownloadedVideoListViewModel.this.new RemoteActionCompatParcelizer(this.IconCompatParcelizer, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((RemoteActionCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object RemoteActionCompatParcelizer(List<String> list, SampleVideos<? super getShowPopup> sampleVideos) {
        Object objRemoteActionCompatParcelizer = setModifiedEndTimestampMs.RemoteActionCompatParcelizer(this.read, new RemoteActionCompatParcelizer(list, null), sampleVideos);
        return objRemoteActionCompatParcelizer == getYear.IconCompatParcelizer() ? objRemoteActionCompatParcelizer : getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void IconCompatParcelizer(List<String> p0) {
        Iterator<T> it = p0.iterator();
        while (it.hasNext()) {
            this.RemoteActionCompatParcelizer.write(traverseForStyle.write((String) it.next()), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(updateLoadingFinished.IconCompatParcelizer));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void MediaBrowserCompatSearchResultReceiver() {
        getResolutionSize<setSelectedTabIndicator> getresolutionsize = this.MediaBrowserCompatSearchResultReceiver;
        getresolutionsize.write(setSelectedTabIndicator.RemoteActionCompatParcelizer(getresolutionsize.IconCompatParcelizer(), null, IntermediateLoginResponseBody.RemoteActionCompatParcelizer(), 1));
        getResolutionSize<setSelectedTabIndicator> getresolutionsize2 = this.RatingCompat;
        getresolutionsize2.write(setSelectedTabIndicator.RemoteActionCompatParcelizer(getresolutionsize2.IconCompatParcelizer(), null, IntermediateLoginResponseBody.RemoteActionCompatParcelizer(), 1));
        MediaBrowserCompatCustomActionResultReceiver();
    }

    public final int AudioAttributesImplApi26Parcelizer() {
        return this.MediaBrowserCompatSearchResultReceiver.IconCompatParcelizer().read().size() + this.RatingCompat.IconCompatParcelizer().read().size();
    }
}
