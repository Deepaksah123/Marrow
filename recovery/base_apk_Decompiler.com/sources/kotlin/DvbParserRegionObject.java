package kotlin;

import com.marrow.R;
import com.marrow.data.api.models.Failed;
import com.marrow.data.api.models.MarrowError;
import com.marrow.data.api.models.MarrowResponse;
import com.marrow.data.api.models.Success;
import com.marrow.data.api.models.response.lesson.VideoBookmarkTimelineModel;
import com.marrow.data.models.ResponseError;
import com.marrow.data.models.content.VideoInfo;
import com.marrow.data.models.lesson.LessonIndex;
import com.marrow.data.models.lesson.StepIndex;
import com.marrow.data.models.subject.SubjectFilterModel;
import com.marrow.data.utils.product.exceptions.EmptyResponseException;
import com.marrow.ui.activities.learn.video.overlay.OptionItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.AdsMediaSourceAdLoadException;
import kotlin.DvbParserClutDefinition;
import kotlin.Metadata;
import kotlin.getSampleFormats;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000À\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 82\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u00018B\u0089\u0001\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0016\u001a\u00020\u0014\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u0019\u001a\u00020\u0002\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#J\u000f\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020$H\u0002¢\u0006\u0004\b'\u0010&J\u0017\u0010)\u001a\u00020$2\u0006\u0010\u0005\u001a\u00020(H\u0002¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020$H\u0002¢\u0006\u0004\b+\u0010&J\u000f\u0010-\u001a\u00020,H\u0016¢\u0006\u0004\b-\u0010.J\u001d\u0010)\u001a\u00020$2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002000/H\u0002¢\u0006\u0004\b)\u00101J\u001f\u00103\u001a\u00020$2\u0006\u0010\u0005\u001a\u0002022\u0006\u0010\u0007\u001a\u000202H\u0016¢\u0006\u0004\b3\u00104J\u000f\u00106\u001a\u000205H\u0002¢\u0006\u0004\b6\u00107J\u0017\u00108\u001a\u00020$2\u0006\u0010\u0005\u001a\u000202H\u0002¢\u0006\u0004\b8\u00109J\u000f\u0010:\u001a\u00020$H\u0016¢\u0006\u0004\b:\u0010&J\u0017\u0010<\u001a\u00020$2\u0006\u0010\u0005\u001a\u00020;H\u0002¢\u0006\u0004\b<\u0010=J\u001f\u0010)\u001a\u00020$2\u0006\u0010\u0005\u001a\u00020>2\u0006\u0010\u0007\u001a\u000202H\u0002¢\u0006\u0004\b)\u0010?J\u0017\u00103\u001a\u00020$2\u0006\u0010\u0005\u001a\u000200H\u0016¢\u0006\u0004\b3\u0010@J\u000f\u0010A\u001a\u00020$H\u0016¢\u0006\u0004\bA\u0010&J\u000f\u0010B\u001a\u00020$H\u0002¢\u0006\u0004\bB\u0010&J\u000f\u0010C\u001a\u00020$H\u0016¢\u0006\u0004\bC\u0010&J\u000f\u0010D\u001a\u00020$H\u0016¢\u0006\u0004\bD\u0010&J\u000f\u0010E\u001a\u00020$H\u0016¢\u0006\u0004\bE\u0010&J\u0017\u0010<\u001a\u00020$2\u0006\u0010\u0005\u001a\u000200H\u0016¢\u0006\u0004\b<\u0010@J\u000f\u0010F\u001a\u00020$H\u0016¢\u0006\u0004\bF\u0010&J\u000f\u0010G\u001a\u00020$H\u0016¢\u0006\u0004\bG\u0010&J\r\u0010H\u001a\u00020$¢\u0006\u0004\bH\u0010&J\u000f\u0010I\u001a\u00020$H\u0016¢\u0006\u0004\bI\u0010&J\u000f\u0010J\u001a\u00020$H\u0002¢\u0006\u0004\bJ\u0010&J\u000f\u0010K\u001a\u000202H\u0016¢\u0006\u0004\bK\u0010LJ\u000f\u0010M\u001a\u00020$H\u0016¢\u0006\u0004\bM\u0010&J\u0017\u0010<\u001a\u00020$2\u0006\u0010\u0005\u001a\u00020NH\u0016¢\u0006\u0004\b<\u0010OJ\u000f\u0010P\u001a\u00020$H\u0016¢\u0006\u0004\bP\u0010&R\u0014\u0010R\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u0014\u0010<\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010SR\u0014\u00108\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010UR\u0014\u00103\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010VR\u0014\u0010)\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010WR\u0014\u0010Y\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010XR\u0014\u0010A\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010ZR\u0014\u0010\\\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010[R\u0014\u0010T\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u0010]R\u0014\u0010:\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010^R\u0014\u0010G\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010_R\u0016\u0010K\u001a\u0002028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010`R\u0016\u0010b\u001a\u0002058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bY\u0010aR\u0016\u0010-\u001a\u0002028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010`R\u0016\u0010H\u001a\u00020,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010cR\u0016\u0010M\u001a\u0002058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bb\u0010aR\u001c\u0010C\u001a\b\u0012\u0004\u0012\u00020e0d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010fR\u0018\u0010P\u001a\u0004\u0018\u00010N8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010g"}, d2 = {"Lo/DvbParserRegionObject;", "Lo/isRtspStartLine;", "Lo/DvbParserClutDefinition$AudioAttributesCompatParcelizer;", "Lo/DvbParserClutDefinition$read;", "Lo/ChunkHolder;", "p0", "Lo/RtspMediaSource1;", "p1", "Lo/AdsMediaSourceAdLoadException$IconCompatParcelizer;", "p2", "Lo/endsWithLivePostrollPlaceHolder;", "p3", "Lo/getSampleFormats;", "p4", "Lo/AdsMediaSourceAdPrepareListener;", "p5", "Lo/withAdGroupTimeUs;", "p6", "Lo/getChannel;", "p7", "Lo/getIds;", "p8", "p9", "Lo/parseLongAttr;", "p10", "p11", "Lo/newSampleStreamArray;", "p12", "Lo/createEmptyAdGroups;", "p13", "Lo/getStreamPositionUsForContent;", "p14", "Lo/isSeekPending;", "p15", "<init>", "(Lo/ChunkHolder;Lo/RtspMediaSource1;Lo/AdsMediaSourceAdLoadException$IconCompatParcelizer;Lo/endsWithLivePostrollPlaceHolder;Lo/getSampleFormats;Lo/AdsMediaSourceAdPrepareListener;Lo/withAdGroupTimeUs;Lo/getChannel;Lo/getIds;Lo/getIds;Lo/parseLongAttr;Lo/DvbParserClutDefinition$AudioAttributesCompatParcelizer;Lo/newSampleStreamArray;Lo/createEmptyAdGroups;Lo/getStreamPositionUsForContent;Lo/isSeekPending;)V", "", "onCustomAction", "()V", "onPlayFromMediaId", "", "read", "(Ljava/lang/Throwable;)V", "onPlayFromSearch", "", "MediaDescriptionCompat", "()F", "", "Lcom/marrow/data/api/models/response/lesson/VideoBookmarkTimelineModel;", "([Lcom/marrow/data/api/models/response/lesson/VideoBookmarkTimelineModel;)V", "", "write", "(Ljava/lang/String;Ljava/lang/String;)V", "", "onPlay", "()Z", "AudioAttributesCompatParcelizer", "(Ljava/lang/String;)V", "AudioAttributesImplApi26Parcelizer", "Lcom/marrow/data/models/lesson/LessonIndex;", "RemoteActionCompatParcelizer", "(Lcom/marrow/data/models/lesson/LessonIndex;)V", "Lcom/marrow/data/models/content/VideoInfo;", "(Lcom/marrow/data/models/content/VideoInfo;Ljava/lang/String;)V", "(Lcom/marrow/data/api/models/response/lesson/VideoBookmarkTimelineModel;)V", "MediaBrowserCompatCustomActionResultReceiver", "onPrepareFromSearch", "onCommand", "onPrepare", "onPause", "onMediaButtonEvent", "MediaBrowserCompatMediaItem", "MediaMetadataCompat", "MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver", "onFastForward", "RatingCompat", "()Ljava/lang/String;", "handleMediaPlayPauseIfPendingOnHandler", "Lo/RtspMediaTrack;", "(Lo/RtspMediaTrack;)V", "onAddQueueItem", "Lo/ChunkHolder;", "IconCompatParcelizer", "Lo/RtspMediaSource1;", "MediaBrowserCompatItemReceiver", "Lo/AdsMediaSourceAdLoadException$IconCompatParcelizer;", "Lo/getSampleFormats;", "Lo/AdsMediaSourceAdPrepareListener;", "Lo/withAdGroupTimeUs;", "AudioAttributesImplApi21Parcelizer", "Lo/getChannel;", "Lo/newSampleStreamArray;", "AudioAttributesImplBaseParcelizer", "Lo/createEmptyAdGroups;", "Lo/getStreamPositionUsForContent;", "Lo/isSeekPending;", "Ljava/lang/String;", "Z", "MediaBrowserCompatSearchResultReceiver", "F", "", "Lcom/marrow/data/models/subject/SubjectFilterModel;", "Ljava/util/List;", "Lo/RtspMediaTrack;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class DvbParserRegionObject extends isRtspStartLine<DvbParserClutDefinition.AudioAttributesCompatParcelizer> implements DvbParserClutDefinition.read {

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private boolean MediaBrowserCompatSearchResultReceiver;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private String MediaDescriptionCompat;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private final getStreamPositionUsForContent AudioAttributesImplApi26Parcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final isSeekPending MediaBrowserCompatMediaItem;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private final withAdGroupTimeUs AudioAttributesImplApi21Parcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private final AdsMediaSourceAdLoadException.IconCompatParcelizer AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatMediaItem, reason: from kotlin metadata */
    private String RatingCompat;

    /* JADX INFO: renamed from: MediaBrowserCompatSearchResultReceiver, reason: from kotlin metadata */
    private boolean handleMediaPlayPauseIfPendingOnHandler;

    /* JADX INFO: renamed from: MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, reason: from kotlin metadata */
    private float MediaMetadataCompat;

    /* JADX INFO: renamed from: MediaDescriptionCompat, reason: from kotlin metadata */
    private final AdsMediaSourceAdPrepareListener read;

    /* JADX INFO: renamed from: MediaMetadataCompat, reason: from kotlin metadata */
    private final RtspMediaSource1 RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: RatingCompat, reason: from kotlin metadata */
    private final getSampleFormats write;

    /* JADX INFO: renamed from: handleMediaPlayPauseIfPendingOnHandler, reason: from kotlin metadata */
    private List<SubjectFilterModel> onCommand;

    /* JADX INFO: renamed from: onAddQueueItem, reason: from kotlin metadata */
    private final ChunkHolder IconCompatParcelizer;

    /* JADX INFO: renamed from: onCommand, reason: from kotlin metadata */
    private RtspMediaTrack onAddQueueItem;

    /* JADX INFO: renamed from: onCustomAction, reason: from kotlin metadata */
    private final newSampleStreamArray AudioAttributesImplBaseParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final getChannel MediaBrowserCompatCustomActionResultReceiver;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final createEmptyAdGroups MediaBrowserCompatItemReceiver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @setSdkPayload
    public DvbParserRegionObject(ChunkHolder chunkHolder, RtspMediaSource1 rtspMediaSource1, AdsMediaSourceAdLoadException.IconCompatParcelizer iconCompatParcelizer, endsWithLivePostrollPlaceHolder endswithlivepostrollplaceholder, getSampleFormats getsampleformats, AdsMediaSourceAdPrepareListener adsMediaSourceAdPrepareListener, withAdGroupTimeUs withadgrouptimeus, getChannel getchannel, getIds getids, getIds getids2, parseLongAttr parselongattr, DvbParserClutDefinition.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer, newSampleStreamArray newsamplestreamarray, createEmptyAdGroups createemptyadgroups, getStreamPositionUsForContent getstreampositionusforcontent, isSeekPending isseekpending) {
        super(parselongattr, endswithlivepostrollplaceholder, getids, getids2, audioAttributesCompatParcelizer);
        toMagicModuleMetaRepoModel.write(chunkHolder, "");
        toMagicModuleMetaRepoModel.write(rtspMediaSource1, "");
        toMagicModuleMetaRepoModel.write(iconCompatParcelizer, "");
        toMagicModuleMetaRepoModel.write(endswithlivepostrollplaceholder, "");
        toMagicModuleMetaRepoModel.write(getsampleformats, "");
        toMagicModuleMetaRepoModel.write(adsMediaSourceAdPrepareListener, "");
        toMagicModuleMetaRepoModel.write(withadgrouptimeus, "");
        toMagicModuleMetaRepoModel.write(getchannel, "");
        toMagicModuleMetaRepoModel.write(getids, "");
        toMagicModuleMetaRepoModel.write(getids2, "");
        toMagicModuleMetaRepoModel.write(parselongattr, "");
        toMagicModuleMetaRepoModel.write(audioAttributesCompatParcelizer, "");
        toMagicModuleMetaRepoModel.write(newsamplestreamarray, "");
        toMagicModuleMetaRepoModel.write(createemptyadgroups, "");
        toMagicModuleMetaRepoModel.write(getstreampositionusforcontent, "");
        toMagicModuleMetaRepoModel.write(isseekpending, "");
        this.IconCompatParcelizer = chunkHolder;
        this.RemoteActionCompatParcelizer = rtspMediaSource1;
        this.AudioAttributesCompatParcelizer = iconCompatParcelizer;
        this.write = getsampleformats;
        this.read = adsMediaSourceAdPrepareListener;
        this.AudioAttributesImplApi21Parcelizer = withadgrouptimeus;
        this.MediaBrowserCompatCustomActionResultReceiver = getchannel;
        this.AudioAttributesImplBaseParcelizer = newsamplestreamarray;
        this.MediaBrowserCompatItemReceiver = createemptyadgroups;
        this.AudioAttributesImplApi26Parcelizer = getstreampositionusforcontent;
        this.MediaBrowserCompatMediaItem = isseekpending;
        this.RatingCompat = "";
        this.MediaBrowserCompatSearchResultReceiver = true;
        this.MediaDescriptionCompat = "";
        this.MediaMetadataCompat = 0.5f;
        this.onCommand = IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
    }

    public final void onCustomAction() {
        this.AudioAttributesImplApi26Parcelizer.IconCompatParcelizer(false);
        if (onPlay()) {
            getSampleFormats getsampleformats = this.write;
            getSampleFormats.Companion companion = getSampleFormats.INSTANCE;
            if (getsampleformats.read(getSampleFormats.Companion.MediaDescriptionCompat()) > 0) {
                int iWrite = this.RemoteActionCompatParcelizer.write();
                getSampleFormats getsampleformats2 = this.write;
                getSampleFormats.Companion companion2 = getSampleFormats.INSTANCE;
                if (iWrite > getsampleformats2.read(getSampleFormats.Companion.MediaDescriptionCompat())) {
                    getSampleFormats getsampleformats3 = this.write;
                    getSampleFormats.Companion companion3 = getSampleFormats.INSTANCE;
                    buildResolutionString.IconCompatParcelizer("ROOTING_STATUS_VALUE", String.valueOf(getsampleformats3.read(getSampleFormats.Companion.MediaDescriptionCompat())));
                    ((DvbParserClutDefinition.AudioAttributesCompatParcelizer) this.RemoteActionCompatParcelizer).read(read(R.string.toast_rooted_device_video_blocked_warning));
                    ((DvbParserClutDefinition.AudioAttributesCompatParcelizer) this.RemoteActionCompatParcelizer).AudioAttributesImplBaseParcelizer();
                    return;
                }
            }
            ((DvbParserClutDefinition.AudioAttributesCompatParcelizer) this.RemoteActionCompatParcelizer).AudioAttributesCompatParcelizer(this.IconCompatParcelizer);
            ((DvbParserClutDefinition.AudioAttributesCompatParcelizer) this.RemoteActionCompatParcelizer).read(this.AudioAttributesImplApi26Parcelizer.RatingCompat());
            int iRemoteActionCompatParcelizer = this.AudioAttributesImplBaseParcelizer.RemoteActionCompatParcelizer();
            if (iRemoteActionCompatParcelizer > 0) {
                ((DvbParserClutDefinition.AudioAttributesCompatParcelizer) this.RemoteActionCompatParcelizer).IconCompatParcelizer(iRemoteActionCompatParcelizer);
            }
            if (this.AudioAttributesImplBaseParcelizer.read() == 0) {
                onPlayFromSearch();
            } else {
                onFastForward();
                onPlayFromMediaId();
            }
        }
    }

    private final void onPlayFromMediaId() {
        ((DvbParserClutDefinition.AudioAttributesCompatParcelizer) this.RemoteActionCompatParcelizer).ResultReceiver();
        accessgetEmptyStatecp<VideoBookmarkTimelineModel[]> accessgetemptystatecpAudioAttributesCompatParcelizer = this.AudioAttributesImplBaseParcelizer.read(this.RatingCompat).RemoteActionCompatParcelizer(al_()).AudioAttributesCompatParcelizer(aq_());
        final read readVar = new read(this);
        getTimelineId<? super VideoBookmarkTimelineModel[]> gettimelineid = new getTimelineId() { // from class: o.DvbParserPageRegion
            @Override // kotlin.getTimelineId
            public final void RemoteActionCompatParcelizer(Object obj) {
                DvbParserRegionObject.AudioAttributesImplApi21Parcelizer(readVar, obj);
            }
        };
        final RemoteActionCompatParcelizer remoteActionCompatParcelizer = new RemoteActionCompatParcelizer(this);
        an_().read(accessgetemptystatecpAudioAttributesCompatParcelizer.IconCompatParcelizer(gettimelineid, new getTimelineId() { // from class: o.mergeFrom
            @Override // kotlin.getTimelineId
            public final void RemoteActionCompatParcelizer(Object obj) {
                DvbParserRegionObject.AudioAttributesImplBaseParcelizer(remoteActionCompatParcelizer, obj);
            }
        }));
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final /* synthetic */ class RemoteActionCompatParcelizer extends MagicModuleRepositoryImpl_Factory implements getAnswerMap<Throwable, getShowPopup> {
        @Override // kotlin.getAnswerMap
        public final /* synthetic */ getShowPopup invoke(Throwable th) {
            read(th);
            return getShowPopup.INSTANCE;
        }

        public final void read(Throwable th) {
            toMagicModuleMetaRepoModel.write(th, "");
            ((DvbParserRegionObject) this.AudioAttributesImplApi26Parcelizer).read(th);
        }

        RemoteActionCompatParcelizer(Object obj) {
            super(1, obj, DvbParserRegionObject.class, "read", "read(Ljava/lang/Throwable;)V", 0);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final /* synthetic */ class read extends MagicModuleRepositoryImpl_Factory implements getAnswerMap<VideoBookmarkTimelineModel[], getShowPopup> {
        public final void IconCompatParcelizer(VideoBookmarkTimelineModel[] videoBookmarkTimelineModelArr) {
            toMagicModuleMetaRepoModel.write(videoBookmarkTimelineModelArr, "");
            ((DvbParserRegionObject) this.AudioAttributesImplApi26Parcelizer).read(videoBookmarkTimelineModelArr);
        }

        @Override // kotlin.getAnswerMap
        public final /* synthetic */ getShowPopup invoke(VideoBookmarkTimelineModel[] videoBookmarkTimelineModelArr) {
            IconCompatParcelizer(videoBookmarkTimelineModelArr);
            return getShowPopup.INSTANCE;
        }

        read(Object obj) {
            super(1, obj, DvbParserRegionObject.class, "read", "read([Lcom/marrow/data/api/models/response/lesson/VideoBookmarkTimelineModel;)V", 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AudioAttributesImplApi21Parcelizer(getAnswerMap getanswermap, Object obj) {
        getanswermap.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AudioAttributesImplBaseParcelizer(getAnswerMap getanswermap, Object obj) {
        getanswermap.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void read(Throwable p0) {
        ((DvbParserClutDefinition.AudioAttributesCompatParcelizer) this.RemoteActionCompatParcelizer).onPlayFromMediaId();
        onPlayFromSearch();
        RemoteActionCompatParcelizer(p0, "video_bookmark_timelines");
    }

    private final void onPlayFromSearch() {
        ((DvbParserClutDefinition.AudioAttributesCompatParcelizer) this.RemoteActionCompatParcelizer).MediaSessionCompatResultReceiverWrapper();
        ((DvbParserClutDefinition.AudioAttributesCompatParcelizer) this.RemoteActionCompatParcelizer).PlaybackStateCompatCustomAction();
        ((DvbParserClutDefinition.AudioAttributesCompatParcelizer) this.RemoteActionCompatParcelizer).onCustomAction();
        ((DvbParserClutDefinition.AudioAttributesCompatParcelizer) this.RemoteActionCompatParcelizer).onFastForward();
    }

    /* JADX INFO: renamed from: MediaDescriptionCompat, reason: from getter */
    public final float getMediaMetadataCompat() {
        return this.MediaMetadataCompat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void read(VideoBookmarkTimelineModel[] p0) {
        this.MediaBrowserCompatSearchResultReceiver = true;
        ((DvbParserClutDefinition.AudioAttributesCompatParcelizer) this.RemoteActionCompatParcelizer).onPlayFromMediaId();
        if (p0.length == 0) {
            onPlayFromSearch();
        } else {
            ((DvbParserClutDefinition.AudioAttributesCompatParcelizer) this.RemoteActionCompatParcelizer).onCommand();
            ((DvbParserClutDefinition.AudioAttributesCompatParcelizer) this.RemoteActionCompatParcelizer).setSessionImpl();
            ((DvbParserClutDefinition.AudioAttributesCompatParcelizer) this.RemoteActionCompatParcelizer).MediaSessionCompatQueueItem();
            ((DvbParserClutDefinition.AudioAttributesCompatParcelizer) this.RemoteActionCompatParcelizer).write(getOrderDetails.onCommand(p0));
            write((VideoBookmarkTimelineModel) getOrderDetails.AudioAttributesImplApi21Parcelizer(p0));
            if (this.RatingCompat.length() == 0) {
                ((DvbParserClutDefinition.AudioAttributesCompatParcelizer) this.RemoteActionCompatParcelizer).write(read(R.string.all_subjects));
            }
        }
        ((DvbParserClutDefinition.AudioAttributesCompatParcelizer) this.RemoteActionCompatParcelizer).AudioAttributesImplApi26Parcelizer(IconCompatParcelizer(p0.length, p0.length));
    }

    public final void write(String p0, String p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.RatingCompat, (Object) p0)) {
            return;
        }
        ((DvbParserClutDefinition.AudioAttributesCompatParcelizer) this.RemoteActionCompatParcelizer).write(p1);
        this.RatingCompat = p0;
        onPlayFromMediaId();
    }

    private final boolean onPlay() {
        boolean zAudioAttributesCompatParcelizer = this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer();
        if (this.RemoteActionCompatParcelizer.read()) {
            ((DvbParserClutDefinition.AudioAttributesCompatParcelizer) this.RemoteActionCompatParcelizer).r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            ((DvbParserClutDefinition.AudioAttributesCompatParcelizer) this.RemoteActionCompatParcelizer).PlaybackStateCompat();
            return false;
        }
        if (!zAudioAttributesCompatParcelizer) {
            return true;
        }
        ((DvbParserClutDefinition.AudioAttributesCompatParcelizer) this.RemoteActionCompatParcelizer).r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8();
        ((DvbParserClutDefinition.AudioAttributesCompatParcelizer) this.RemoteActionCompatParcelizer).PlaybackStateCompat();
        return false;
    }

    private final void AudioAttributesCompatParcelizer(final String p0) {
        if (!this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(p0)) {
            ((DvbParserClutDefinition.AudioAttributesCompatParcelizer) this.RemoteActionCompatParcelizer).ResultReceiver();
        }
        IconCompatParcelizer(this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(p0), new getAnswerMap() { // from class: o.DvbParserSubtitleService
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return DvbParserRegionObject.read(this.write, (LessonIndex) obj);
            }
        }, new getAnswerMap() { // from class: o.DvbParserRegionComposition
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return DvbParserRegionObject.IconCompatParcelizer(this.read, p0, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(DvbParserRegionObject dvbParserRegionObject, LessonIndex lessonIndex) {
        toMagicModuleMetaRepoModel.write(lessonIndex, "");
        dvbParserRegionObject.RemoteActionCompatParcelizer(lessonIndex);
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup IconCompatParcelizer(DvbParserRegionObject dvbParserRegionObject, String str, Throwable th) {
        toMagicModuleMetaRepoModel.write(th, "");
        ((DvbParserClutDefinition.AudioAttributesCompatParcelizer) dvbParserRegionObject.RemoteActionCompatParcelizer).onPlayFromMediaId();
        if (th instanceof EmptyResponseException) {
            ((DvbParserClutDefinition.AudioAttributesCompatParcelizer) dvbParserRegionObject.RemoteActionCompatParcelizer).write(ResponseError.INSTANCE.customError(dvbParserRegionObject.read(R.string.err_text_video_access_failure)));
            ((DvbParserClutDefinition.AudioAttributesCompatParcelizer) dvbParserRegionObject.RemoteActionCompatParcelizer).AudioAttributesImplBaseParcelizer();
            return getShowPopup.INSTANCE;
        }
        dvbParserRegionObject.IconCompatParcelizer(th, "video_lesson_bookmark_detail", str);
        ((DvbParserClutDefinition.AudioAttributesCompatParcelizer) dvbParserRegionObject.RemoteActionCompatParcelizer).PlaybackStateCompat();
        return getShowPopup.INSTANCE;
    }

    @Override // kotlin.isRtspStartLine, kotlin.getExtendedEsFrChar
    public final void AudioAttributesImplApi26Parcelizer() {
        ao_().read();
        super.AudioAttributesImplApi26Parcelizer();
    }

    private final void RemoteActionCompatParcelizer(LessonIndex p0) {
        AdsMediaSourceAdPrepareListener adsMediaSourceAdPrepareListener = this.read;
        String id = p0.getId();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(id, "");
        StepIndex stepIndex = adsMediaSourceAdPrepareListener.read(id, 0);
        if (stepIndex == null) {
            ((DvbParserClutDefinition.AudioAttributesCompatParcelizer) this.RemoteActionCompatParcelizer).r8lambdaKUbBm7ckfqTc9QCgukC86fguu4();
            ((DvbParserClutDefinition.AudioAttributesCompatParcelizer) this.RemoteActionCompatParcelizer).PlaybackStateCompat();
            return;
        }
        if (this.MediaBrowserCompatSearchResultReceiver && stepIndex.isAspectRatioValid()) {
            this.MediaMetadataCompat = (float) stepIndex.getVideoAspectRatio();
            ((DvbParserClutDefinition.AudioAttributesCompatParcelizer) this.RemoteActionCompatParcelizer).MediaSessionCompatToken();
        }
        ((DvbParserClutDefinition.AudioAttributesCompatParcelizer) this.RemoteActionCompatParcelizer).onPlayFromMediaId();
        VideoInfo videoInfoIconCompatParcelizer = this.AudioAttributesImplApi21Parcelizer.IconCompatParcelizer(stepIndex);
        toMagicModuleMetaRepoModel.write(videoInfoIconCompatParcelizer);
        String id2 = p0.getId();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(id2, "");
        read(videoInfoIconCompatParcelizer, id2);
    }

    private final void read(VideoInfo p0, String p1) {
        ((DvbParserClutDefinition.AudioAttributesCompatParcelizer) this.RemoteActionCompatParcelizer).AudioAttributesCompatParcelizer(p0, p1, this.MediaDescriptionCompat, !this.MediaBrowserCompatSearchResultReceiver);
        if (this.MediaBrowserCompatSearchResultReceiver) {
            this.MediaBrowserCompatSearchResultReceiver = false;
        }
    }

    public final void write(VideoBookmarkTimelineModel p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        if (this.MediaBrowserCompatSearchResultReceiver || !toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.MediaDescriptionCompat, (Object) p0.getTimelineId())) {
            ((DvbParserClutDefinition.AudioAttributesCompatParcelizer) this.RemoteActionCompatParcelizer)._init_lambda2();
            ((DvbParserClutDefinition.AudioAttributesCompatParcelizer) this.RemoteActionCompatParcelizer).onMediaButtonEvent();
            if (PlayerControlViewComponentListener.read(this.IconCompatParcelizer, p0.isLessonPaid(), true, p0.getSubjectId())) {
                ((DvbParserClutDefinition.AudioAttributesCompatParcelizer) this.RemoteActionCompatParcelizer).MediaBrowserCompatItemReceiver(p0.getTimelineTitle());
                ((DvbParserClutDefinition.AudioAttributesCompatParcelizer) this.RemoteActionCompatParcelizer).AudioAttributesImplBaseParcelizer(read(R.string.text_lesson_in_subject, p0.getLessonTitle(), p0.getSubjectTitle()));
                this.MediaDescriptionCompat = p0.getTimelineId();
                ((DvbParserClutDefinition.AudioAttributesCompatParcelizer) this.RemoteActionCompatParcelizer).IconCompatParcelizer(this.MediaDescriptionCompat);
                AudioAttributesCompatParcelizer(p0.getLessonId());
                return;
            }
            ((DvbParserClutDefinition.AudioAttributesCompatParcelizer) this.RemoteActionCompatParcelizer).onPlayFromMediaId();
            onPrepareFromSearch();
        }
    }

    @Override // kotlin.isRtspStartLine, kotlin.getExtendedEsFrChar
    public final void MediaBrowserCompatCustomActionResultReceiver() {
        super.MediaBrowserCompatCustomActionResultReceiver();
        MediaMetadataCompat();
    }

    private final void onPrepareFromSearch() {
        ((DvbParserClutDefinition.AudioAttributesCompatParcelizer) this.RemoteActionCompatParcelizer).onPlay();
        ((DvbParserClutDefinition.AudioAttributesCompatParcelizer) this.RemoteActionCompatParcelizer).r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw();
        this.MediaBrowserCompatSearchResultReceiver = false;
    }

    public final void onCommand() {
        ((DvbParserClutDefinition.AudioAttributesCompatParcelizer) this.RemoteActionCompatParcelizer).PlaybackStateCompat();
    }

    private void onPrepare() {
        ((DvbParserClutDefinition.AudioAttributesCompatParcelizer) this.RemoteActionCompatParcelizer).onPlayFromSearch();
    }

    public final void onPause() {
        ArrayList<OptionItem> arrayList = new ArrayList<>();
        if (!this.onCommand.isEmpty()) {
            String str = read(R.string.all_subjects);
            Iterator<T> it = this.onCommand.iterator();
            int count = 0;
            while (it.hasNext()) {
                count += ((SubjectFilterModel) it.next()).getCount();
            }
            arrayList.add(new OptionItem.SubjectTextOptionItem("", str, count));
        }
        ArrayList<OptionItem> arrayList2 = arrayList;
        for (SubjectFilterModel subjectFilterModel : this.onCommand) {
            arrayList2.add(new OptionItem.SubjectTextOptionItem(subjectFilterModel.getId(), subjectFilterModel.getTitle(), subjectFilterModel.getCount()));
        }
        ((DvbParserClutDefinition.AudioAttributesCompatParcelizer) this.RemoteActionCompatParcelizer).RemoteActionCompatParcelizer(arrayList, this.RatingCompat);
    }

    public final void RemoteActionCompatParcelizer(final VideoBookmarkTimelineModel p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        if (!this.MediaBrowserCompatCustomActionResultReceiver.aC_()) {
            ((DvbParserClutDefinition.AudioAttributesCompatParcelizer) this.RemoteActionCompatParcelizer).MediaBrowserCompatMediaItem();
            return;
        }
        ((DvbParserClutDefinition.AudioAttributesCompatParcelizer) this.RemoteActionCompatParcelizer).MediaBrowserCompatCustomActionResultReceiver(p0.getTimelineId());
        this.handleMediaPlayPauseIfPendingOnHandler = true;
        read(this.MediaBrowserCompatItemReceiver.read(p0.toVideoBookmarkTimeline(), p0.getBookmarkType()), new getAnswerMap() { // from class: o.DvbSubtitle
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return DvbParserRegionObject.RemoteActionCompatParcelizer(this.write, p0, (MarrowResponse) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup RemoteActionCompatParcelizer(DvbParserRegionObject dvbParserRegionObject, VideoBookmarkTimelineModel videoBookmarkTimelineModel, MarrowResponse marrowResponse) {
        toMagicModuleMetaRepoModel.write(marrowResponse, "");
        if (dvbParserRegionObject.handleMediaPlayPauseIfPendingOnHandler) {
            dvbParserRegionObject.onFastForward();
        }
        if (!(marrowResponse instanceof Success)) {
            if (!(marrowResponse instanceof Failed) && !(marrowResponse instanceof MarrowError)) {
                throw new RenewEligibleCreator();
            }
            ((DvbParserClutDefinition.AudioAttributesCompatParcelizer) dvbParserRegionObject.RemoteActionCompatParcelizer).MediaBrowserCompatCustomActionResultReceiver(videoBookmarkTimelineModel.getTimelineId());
        }
        return getShowPopup.INSTANCE;
    }

    public final void onMediaButtonEvent() {
        this.MediaBrowserCompatMediaItem.write("security_suspicious_activity", StyledPlayerControlViewLayoutManagerExternalSyntheticLambda12.RemoteActionCompatParcelizer("VideoWatch"), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(updateLoadingFinished.IconCompatParcelizer));
    }

    public final void MediaBrowserCompatMediaItem() {
        this.AudioAttributesImplBaseParcelizer.IconCompatParcelizer();
    }

    public final void MediaMetadataCompat() {
        if (((DvbParserClutDefinition.AudioAttributesCompatParcelizer) this.RemoteActionCompatParcelizer).onPrepare()) {
            this.MediaBrowserCompatMediaItem.write("security_suspicious_activity", StyledPlayerControlViewLayoutManagerExternalSyntheticLambda12.read("adb_enabled"), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(updateLoadingFinished.IconCompatParcelizer));
            onPrepare();
            ((DvbParserClutDefinition.AudioAttributesCompatParcelizer) this.RemoteActionCompatParcelizer).ParcelableVolumeInfo();
        }
    }

    public final void MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
        ((DvbParserClutDefinition.AudioAttributesCompatParcelizer) this.RemoteActionCompatParcelizer).AudioAttributesCompatParcelizer(((DvbParserClutDefinition.AudioAttributesCompatParcelizer) this.RemoteActionCompatParcelizer).MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() + 1);
    }

    private final void onFastForward() {
        IconCompatParcelizer(this.AudioAttributesImplBaseParcelizer.write(), new getAnswerMap() { // from class: o.maybeInflateData
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return DvbParserRegionObject.RemoteActionCompatParcelizer(this.IconCompatParcelizer, (SubjectFilterModel[]) obj);
            }
        }, "subject_load");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup RemoteActionCompatParcelizer(DvbParserRegionObject dvbParserRegionObject, SubjectFilterModel[] subjectFilterModelArr) {
        toMagicModuleMetaRepoModel.write(subjectFilterModelArr, "");
        if (subjectFilterModelArr.length != 0) {
            dvbParserRegionObject.onCommand = getOrderDetails.onCommand(subjectFilterModelArr);
            dvbParserRegionObject.handleMediaPlayPauseIfPendingOnHandler = false;
        }
        return getShowPopup.INSTANCE;
    }

    public final String RatingCompat() {
        String strAudioAttributesImplBaseParcelizer = this.AudioAttributesImplApi26Parcelizer.AudioAttributesImplBaseParcelizer();
        return strAudioAttributesImplBaseParcelizer == null ? "" : strAudioAttributesImplBaseParcelizer;
    }

    public final void handleMediaPlayPauseIfPendingOnHandler() {
        RtspMediaTrack rtspMediaTrack = this.onAddQueueItem;
        if (rtspMediaTrack != null) {
            rtspMediaTrack.read(true);
        }
    }

    public final void RemoteActionCompatParcelizer(RtspMediaTrack p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        this.onAddQueueItem = p0;
    }

    public final void onAddQueueItem() {
        ((DvbParserClutDefinition.AudioAttributesCompatParcelizer) this.RemoteActionCompatParcelizer).onPrepareFromMediaId();
    }
}
