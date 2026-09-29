package com.marrow.ui.activities.learn.video.overlay.timelines;

import com.marrow.data.api.models.Failed;
import com.marrow.data.api.models.MarrowError;
import com.marrow.data.api.models.MarrowResponse;
import com.marrow.data.api.models.Success;
import com.marrow.data.api.models.response.timeline.VideoTimelineResponseBody;
import com.marrow.data.models.video.Timeline;
import com.marrow.ui.activities.learn.video.overlay.VideoTimelineItem;
import com.marrow.ui.activities.learn.video.overlay.timelines.VideoTimelineSideSheetViewModel;
import com.marrow.ui.fragments.learn.model.ActiveRecallQbankLessonUiModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.CmcdHeadersFactoryCmcdObjectBuilder;
import kotlin.DefaultBandwidthMeter1;
import kotlin.IntermediateLoginResponseBody;
import kotlin.MagicModuleSubmissionRequestBody;
import kotlin.Metadata;
import kotlin.NewNumberOtpResendRequest;
import kotlin.POJOPropertyBuilder5;
import kotlin.POJOPropertyBuilderWithMember;
import kotlin.RenewEligibleCreator;
import kotlin.SampleVideos;
import kotlin.SdkPayloadData;
import kotlin.TopUserCompanion;
import kotlin.TypeResolutionContextBasic;
import kotlin.VerifyNewNumberRequest;
import kotlin.accessgetEmptyStatecp;
import kotlin.attachFontFace;
import kotlin.closeCurrentOutputStream;
import kotlin.createEmptyAdGroups;
import kotlin.fromCursor;
import kotlin.getAnswerMap;
import kotlin.getContentMetadata;
import kotlin.getIds;
import kotlin.getLastName;
import kotlin.getLatestBitrateEstimate;
import kotlin.getMagicModuleStats;
import kotlin.getPlatform;
import kotlin.getResolutionSize;
import kotlin.getRoot;
import kotlin.getShowPopup;
import kotlin.getSno;
import kotlin.getTimelineId;
import kotlin.getYear;
import kotlin.setFontFamily;
import kotlin.setFontSize;
import kotlin.setItalic;
import kotlin.setModifiedEndTimestampMs;
import kotlin.setSdkPayload;
import kotlin.setStartTime;
import kotlin.setUpdatedStatus;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001BA\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u001a2\u0006\u0010\u0005\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0012\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u001f2\u0006\u0010\u0005\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0018\u0010 J\u001f\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u001f2\u0006\u0010\u0005\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001d\u0010 J\u001f\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u001f2\u0006\u0010\u0005\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0015\u0010 J\u000f\u0010!\u001a\u00020\u0011H\u0014¢\u0006\u0004\b!\u0010\u0013R\u0014\u0010!\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\"R\u0014\u0010\u0018\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\u0015\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010$R\u0014\u0010\u001d\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\u0012\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010#\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010&\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010-R\u0014\u0010*\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010/R\u001a\u00103\u001a\b\u0012\u0004\u0012\u000201008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u00102R\u001d\u0010(\u001a\b\u0012\u0004\u0012\u000201048\u0007¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b\u0018\u00107R\u001a\u0010%\u001a\b\u0012\u0004\u0012\u000209088\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b!\u0010:R \u0010?\u001a\b\u0012\u0004\u0012\u0002090;8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b\u001d\u0010>R\u0014\u0010<\u001a\u00020@8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b?\u0010AR\u0014\u00105\u001a\u00020@8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b3\u0010A"}, d2 = {"Lcom/marrow/ui/activities/learn/video/overlay/timelines/VideoTimelineSideSheetViewModel;", "Lo/POJOPropertyBuilderWithMember;", "Lo/createEmptyAdGroups;", "p0", "Lo/getIds;", "p1", "p2", "Lo/getPlatform;", "p3", "Lo/DefaultBandwidthMeter1;", "p4", "Lo/closeCurrentOutputStream;", "p5", "Lo/POJOPropertyBuilder5;", "p6", "<init>", "(Lo/createEmptyAdGroups;Lo/getIds;Lo/getIds;Lo/getPlatform;Lo/DefaultBandwidthMeter1;Lo/closeCurrentOutputStream;Lo/POJOPropertyBuilder5;)V", "", "AudioAttributesCompatParcelizer", "()V", "Lo/getRoot;", "RemoteActionCompatParcelizer", "(Lo/getRoot;)V", "", "read", "(I)V", "Lcom/marrow/data/models/video/Timeline;", "(Lcom/marrow/data/models/video/Timeline;I)V", "", "IconCompatParcelizer", "(Ljava/lang/Throwable;)V", "", "(Ljava/lang/String;I)V", "write", "Lo/createEmptyAdGroups;", "AudioAttributesImplBaseParcelizer", "Lo/getIds;", "RatingCompat", "AudioAttributesImplApi21Parcelizer", "Lo/getPlatform;", "MediaBrowserCompatCustomActionResultReceiver", "Lo/DefaultBandwidthMeter1;", "MediaBrowserCompatItemReceiver", "Lo/closeCurrentOutputStream;", "Lo/setFontSize;", "Lo/setFontSize;", "Lo/getSno;", "Lo/getSno;", "Lo/getResolutionSize;", "Lo/attachFontFace;", "Lo/getResolutionSize;", "AudioAttributesImplApi26Parcelizer", "Lo/setUpdatedStatus;", "MediaBrowserCompatSearchResultReceiver", "Lo/setUpdatedStatus;", "()Lo/setUpdatedStatus;", "Lo/fromCursor;", "Lo/setFontFamily;", "Lo/fromCursor;", "Lo/NewNumberOtpResendRequest;", "MediaBrowserCompatMediaItem", "Lo/NewNumberOtpResendRequest;", "()Lo/NewNumberOtpResendRequest;", "MediaDescriptionCompat", "", "Z"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class VideoTimelineSideSheetViewModel extends POJOPropertyBuilderWithMember {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final createEmptyAdGroups write;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private final getPlatform IconCompatParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private final boolean MediaBrowserCompatSearchResultReceiver;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private final getIds read;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final getSno MediaBrowserCompatItemReceiver;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private final DefaultBandwidthMeter1 AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private final closeCurrentOutputStream AudioAttributesImplBaseParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatMediaItem, reason: from kotlin metadata */
    private final NewNumberOtpResendRequest<setFontFamily> MediaDescriptionCompat;

    /* JADX INFO: renamed from: MediaBrowserCompatSearchResultReceiver, reason: from kotlin metadata */
    private final setUpdatedStatus<attachFontFace> MediaBrowserCompatCustomActionResultReceiver;

    /* JADX INFO: renamed from: MediaDescriptionCompat, reason: from kotlin metadata */
    private final boolean MediaBrowserCompatMediaItem;

    /* JADX INFO: renamed from: RatingCompat, reason: from kotlin metadata */
    private final getIds RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final getResolutionSize<attachFontFace> AudioAttributesImplApi26Parcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final setFontSize AudioAttributesImplApi21Parcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final fromCursor<setFontFamily> RatingCompat;

    @setSdkPayload
    public VideoTimelineSideSheetViewModel(createEmptyAdGroups createemptyadgroups, getIds getids, getIds getids2, getPlatform getplatform, DefaultBandwidthMeter1 defaultBandwidthMeter1, closeCurrentOutputStream closecurrentoutputstream, POJOPropertyBuilder5 pOJOPropertyBuilder5) {
        attachFontFace attachfontfaceIconCompatParcelizer;
        attachFontFace attachfontface;
        ArrayList<VideoTimelineItem> arrayList;
        ArrayList<VideoTimelineItem> arrayList2;
        toMagicModuleMetaRepoModel.write(createemptyadgroups, "");
        toMagicModuleMetaRepoModel.write(getids, "");
        toMagicModuleMetaRepoModel.write(getids2, "");
        toMagicModuleMetaRepoModel.write(getplatform, "");
        toMagicModuleMetaRepoModel.write(defaultBandwidthMeter1, "");
        toMagicModuleMetaRepoModel.write(closecurrentoutputstream, "");
        toMagicModuleMetaRepoModel.write(pOJOPropertyBuilder5, "");
        this.write = createemptyadgroups;
        this.read = getids;
        this.RemoteActionCompatParcelizer = getids2;
        this.IconCompatParcelizer = getplatform;
        this.AudioAttributesCompatParcelizer = defaultBandwidthMeter1;
        this.AudioAttributesImplBaseParcelizer = closecurrentoutputstream;
        setFontSize.write writeVar = setFontSize.read;
        setFontSize setfontsize = setFontSize.write.read(pOJOPropertyBuilder5);
        this.AudioAttributesImplApi21Parcelizer = setfontsize;
        this.MediaBrowserCompatItemReceiver = new getSno();
        getResolutionSize<attachFontFace> getresolutionsizeRemoteActionCompatParcelizer = setStartTime.RemoteActionCompatParcelizer(new attachFontFace(null, null, false, false, 15, null));
        this.AudioAttributesImplApi26Parcelizer = getresolutionsizeRemoteActionCompatParcelizer;
        this.MediaBrowserCompatCustomActionResultReceiver = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer);
        fromCursor<setFontFamily> fromcursor = getLastName.read(0, null, 7);
        this.RatingCompat = fromcursor;
        this.MediaDescriptionCompat = VerifyNewNumberRequest.AudioAttributesCompatParcelizer(fromcursor);
        Boolean bool = (Boolean) pOJOPropertyBuilder5.write("should_show_collapsed_timeline");
        boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
        this.MediaBrowserCompatMediaItem = zBooleanValue;
        Boolean bool2 = (Boolean) pOJOPropertyBuilder5.write("is_expand_button_intereacted");
        boolean zBooleanValue2 = bool2 != null ? bool2.booleanValue() : false;
        this.MediaBrowserCompatSearchResultReceiver = zBooleanValue2;
        boolean z = zBooleanValue2 ? false : zBooleanValue && (arrayList2 = setfontsize.read()) != null && arrayList2.size() > 2;
        do {
            attachfontfaceIconCompatParcelizer = getresolutionsizeRemoteActionCompatParcelizer.IconCompatParcelizer();
            attachfontface = attachfontfaceIconCompatParcelizer;
            arrayList = this.AudioAttributesImplApi21Parcelizer.read();
        } while (!getresolutionsizeRemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(attachfontfaceIconCompatParcelizer, attachFontFace.RemoteActionCompatParcelizer(attachfontface, arrayList == null ? new ArrayList<>() : arrayList, null, false, z, 2)));
        AudioAttributesCompatParcelizer();
    }

    public final setUpdatedStatus<attachFontFace> read() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    public final NewNumberOtpResendRequest<setFontFamily> IconCompatParcelizer() {
        return this.MediaDescriptionCompat;
    }

    static final class RemoteActionCompatParcelizer extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int AudioAttributesCompatParcelizer;

        /* JADX INFO: renamed from: com.marrow.ui.activities.learn.video.overlay.timelines.VideoTimelineSideSheetViewModel$RemoteActionCompatParcelizer$1, reason: invalid class name */
        static final class AnonymousClass1 extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
            private int AudioAttributesCompatParcelizer;
            private /* synthetic */ VideoTimelineSideSheetViewModel IconCompatParcelizer;
            private int RemoteActionCompatParcelizer;
            private Object read;
            private Object write;

            @Override // kotlin.getMonthName
            public final Object invokeSuspend(Object obj) {
                VideoTimelineSideSheetViewModel videoTimelineSideSheetViewModel;
                Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
                int i = this.AudioAttributesCompatParcelizer;
                if (i == 0) {
                    SdkPayloadData.IconCompatParcelizer(obj);
                    String audioAttributesCompatParcelizer = this.IconCompatParcelizer.AudioAttributesImplApi21Parcelizer.getAudioAttributesCompatParcelizer();
                    if (audioAttributesCompatParcelizer != null) {
                        VideoTimelineSideSheetViewModel videoTimelineSideSheetViewModel2 = this.IconCompatParcelizer;
                        closeCurrentOutputStream closecurrentoutputstream = videoTimelineSideSheetViewModel2.AudioAttributesImplBaseParcelizer;
                        this.write = videoTimelineSideSheetViewModel2;
                        this.read = null;
                        this.RemoteActionCompatParcelizer = 0;
                        this.AudioAttributesCompatParcelizer = 1;
                        obj = closecurrentoutputstream.AudioAttributesImplApi21Parcelizer(audioAttributesCompatParcelizer, this);
                        if (obj == objIconCompatParcelizer) {
                            return objIconCompatParcelizer;
                        }
                        videoTimelineSideSheetViewModel = videoTimelineSideSheetViewModel2;
                    }
                    return getShowPopup.INSTANCE;
                }
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                videoTimelineSideSheetViewModel = (VideoTimelineSideSheetViewModel) this.write;
                SdkPayloadData.IconCompatParcelizer(obj);
                getContentMetadata getcontentmetadata = (getContentMetadata) obj;
                ActiveRecallQbankLessonUiModel activeRecallQbankLessonUiModelRemoteActionCompatParcelizer = getcontentmetadata != null ? setItalic.RemoteActionCompatParcelizer(getcontentmetadata) : null;
                if (activeRecallQbankLessonUiModelRemoteActionCompatParcelizer != null) {
                    videoTimelineSideSheetViewModel.AudioAttributesImplApi26Parcelizer.write(attachFontFace.RemoteActionCompatParcelizer(videoTimelineSideSheetViewModel.read().IconCompatParcelizer(), null, activeRecallQbankLessonUiModelRemoteActionCompatParcelizer, false, false, 13));
                }
                return getShowPopup.INSTANCE;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(VideoTimelineSideSheetViewModel videoTimelineSideSheetViewModel, SampleVideos<? super AnonymousClass1> sampleVideos) {
                super(2, sampleVideos);
                this.IconCompatParcelizer = videoTimelineSideSheetViewModel;
            }

            @Override // kotlin.getMonthName
            public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
                return new AnonymousClass1(this.IconCompatParcelizer, sampleVideos);
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // kotlin.MagicModuleSubmissionRequestBody
            /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
            public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
                return ((AnonymousClass1) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
            }
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.AudioAttributesCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.AudioAttributesCompatParcelizer = 1;
                if (setModifiedEndTimestampMs.RemoteActionCompatParcelizer(VideoTimelineSideSheetViewModel.this.IconCompatParcelizer, new AnonymousClass1(VideoTimelineSideSheetViewModel.this, null), this) == objIconCompatParcelizer) {
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
            return VideoTimelineSideSheetViewModel.this.new RemoteActionCompatParcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((RemoteActionCompatParcelizer) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void AudioAttributesCompatParcelizer() {
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new RemoteActionCompatParcelizer(null), new MagicModuleSubmissionRequestBody() { // from class: o.setTextAlign
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return VideoTimelineSideSheetViewModel.AudioAttributesImplBaseParcelizer((String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesImplBaseParcelizer(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return getShowPopup.INSTANCE;
    }

    public final void RemoteActionCompatParcelizer(getRoot p0) {
        attachFontFace attachfontfaceIconCompatParcelizer;
        attachFontFace attachfontfaceIconCompatParcelizer2;
        toMagicModuleMetaRepoModel.write(p0, "");
        if (p0 instanceof getRoot.AudioAttributesCompatParcelizer) {
            List<VideoTimelineItem> listAudioAttributesCompatParcelizer = this.AudioAttributesImplApi26Parcelizer.IconCompatParcelizer().AudioAttributesCompatParcelizer();
            ArrayList arrayList = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) listAudioAttributesCompatParcelizer, 10));
            for (VideoTimelineItem videoTimelineItem : listAudioAttributesCompatParcelizer) {
                arrayList.add(VideoTimelineItem.AudioAttributesCompatParcelizer(videoTimelineItem, null, toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) videoTimelineItem.getRemoteActionCompatParcelizer().getTimelineId(), (Object) ((getRoot.AudioAttributesCompatParcelizer) p0).AudioAttributesCompatParcelizer().getRemoteActionCompatParcelizer().getTimelineId()), 0, 5));
            }
            ArrayList arrayList2 = arrayList;
            getResolutionSize<attachFontFace> getresolutionsize = this.AudioAttributesImplApi26Parcelizer;
            do {
                attachfontfaceIconCompatParcelizer2 = getresolutionsize.IconCompatParcelizer();
            } while (!getresolutionsize.AudioAttributesCompatParcelizer(attachfontfaceIconCompatParcelizer2, attachFontFace.RemoteActionCompatParcelizer(attachfontfaceIconCompatParcelizer2, arrayList2, null, false, false, 14)));
            read(((getRoot.AudioAttributesCompatParcelizer) p0).AudioAttributesCompatParcelizer().getRemoteActionCompatParcelizer().getStartTime());
            return;
        }
        if (p0 instanceof getRoot.write) {
            getRoot.write writeVar = (getRoot.write) p0;
            int i = !writeVar.write().RemoteActionCompatParcelizer() ? 1 : 0;
            IconCompatParcelizer(writeVar.write().getRemoteActionCompatParcelizer().getTimelineId(), i);
            AudioAttributesCompatParcelizer(writeVar.write().getRemoteActionCompatParcelizer(), i);
            return;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, getRoot.IconCompatParcelizer.INSTANCE)) {
            CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new AudioAttributesCompatParcelizer(null), new MagicModuleSubmissionRequestBody() { // from class: o.setLinethrough
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return VideoTimelineSideSheetViewModel.MediaBrowserCompatSearchResultReceiver((String) obj2);
                }
            });
            return;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, getRoot.MediaBrowserCompatCustomActionResultReceiver.INSTANCE)) {
            getResolutionSize<attachFontFace> getresolutionsize2 = this.AudioAttributesImplApi26Parcelizer;
            do {
                attachfontfaceIconCompatParcelizer = getresolutionsize2.IconCompatParcelizer();
            } while (!getresolutionsize2.AudioAttributesCompatParcelizer(attachfontfaceIconCompatParcelizer, attachFontFace.RemoteActionCompatParcelizer(attachfontfaceIconCompatParcelizer, null, null, false, false, 7)));
            CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new write(null), new MagicModuleSubmissionRequestBody() { // from class: o.TtmlStyleFontSizeUnit
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return VideoTimelineSideSheetViewModel.MediaDescriptionCompat((String) obj2);
                }
            });
            return;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, getRoot.read.INSTANCE)) {
            AudioAttributesCompatParcelizer();
        } else {
            if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, getRoot.RemoteActionCompatParcelizer.INSTANCE)) {
                throw new RenewEligibleCreator();
            }
            CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new read(null), new MagicModuleSubmissionRequestBody() { // from class: o.setUnderline
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return VideoTimelineSideSheetViewModel.MediaMetadataCompat((String) obj2);
                }
            });
        }
    }

    static final class AudioAttributesCompatParcelizer extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int RemoteActionCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.RemoteActionCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.RemoteActionCompatParcelizer = 1;
                if (VideoTimelineSideSheetViewModel.this.RatingCompat.RemoteActionCompatParcelizer(setFontFamily.write.INSTANCE, this) == objIconCompatParcelizer) {
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

        AudioAttributesCompatParcelizer(SampleVideos<? super AudioAttributesCompatParcelizer> sampleVideos) {
            super(1, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return VideoTimelineSideSheetViewModel.this.new AudioAttributesCompatParcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AudioAttributesCompatParcelizer) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup MediaBrowserCompatSearchResultReceiver(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return getShowPopup.INSTANCE;
    }

    static final class write extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int IconCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.IconCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.IconCompatParcelizer = 1;
                if (VideoTimelineSideSheetViewModel.this.RatingCompat.RemoteActionCompatParcelizer(setFontFamily.AudioAttributesCompatParcelizer.INSTANCE, this) == objIconCompatParcelizer) {
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

        write(SampleVideos<? super write> sampleVideos) {
            super(1, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return VideoTimelineSideSheetViewModel.this.new write(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((write) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup MediaDescriptionCompat(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return getShowPopup.INSTANCE;
    }

    static final class read extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int RemoteActionCompatParcelizer;
        private int read;
        private Object write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.RemoteActionCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                String audioAttributesCompatParcelizer = VideoTimelineSideSheetViewModel.this.AudioAttributesImplApi21Parcelizer.getAudioAttributesCompatParcelizer();
                if (audioAttributesCompatParcelizer != null) {
                    fromCursor fromcursor = VideoTimelineSideSheetViewModel.this.RatingCompat;
                    setFontFamily.RemoteActionCompatParcelizer remoteActionCompatParcelizer = new setFontFamily.RemoteActionCompatParcelizer(audioAttributesCompatParcelizer);
                    this.write = null;
                    this.read = 0;
                    this.RemoteActionCompatParcelizer = 1;
                    if (fromcursor.RemoteActionCompatParcelizer(remoteActionCompatParcelizer, this) == objIconCompatParcelizer) {
                        return objIconCompatParcelizer;
                    }
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
            return VideoTimelineSideSheetViewModel.this.new read(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((read) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup MediaMetadataCompat(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return getShowPopup.INSTANCE;
    }

    static final class IconCompatParcelizer extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private /* synthetic */ int RemoteActionCompatParcelizer;
        private int read;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.read;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.read = 1;
                if (VideoTimelineSideSheetViewModel.this.RatingCompat.RemoteActionCompatParcelizer(new setFontFamily.IconCompatParcelizer(this.RemoteActionCompatParcelizer), this) == objIconCompatParcelizer) {
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
        IconCompatParcelizer(int i, SampleVideos<? super IconCompatParcelizer> sampleVideos) {
            super(1, sampleVideos);
            this.RemoteActionCompatParcelizer = i;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return VideoTimelineSideSheetViewModel.this.new IconCompatParcelizer(this.RemoteActionCompatParcelizer, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((IconCompatParcelizer) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void read(int p0) {
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new IconCompatParcelizer(p0, null), new MagicModuleSubmissionRequestBody() { // from class: o.setTextCombine
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return VideoTimelineSideSheetViewModel.MediaBrowserCompatMediaItem((String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup MediaBrowserCompatMediaItem(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return getShowPopup.INSTANCE;
    }

    private final void AudioAttributesCompatParcelizer(final Timeline p0, final int p1) {
        String audioAttributesImplApi26Parcelizer = this.AudioAttributesImplApi21Parcelizer.getAudioAttributesImplApi26Parcelizer();
        getLatestBitrateEstimate.MediaDescriptionCompat.AudioAttributesCompatParcelizer(this.AudioAttributesImplApi21Parcelizer.getRemoteActionCompatParcelizer(), this.AudioAttributesImplApi21Parcelizer.getWrite(), "player", p0.getBookmarkType());
        accessgetEmptyStatecp<MarrowResponse<VideoTimelineResponseBody>> accessgetemptystatecpAudioAttributesCompatParcelizer = this.write.read(p0.toVideoBookmarkTimeline(audioAttributesImplApi26Parcelizer), p1).RemoteActionCompatParcelizer(this.read).AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer);
        final getAnswerMap getanswermap = new getAnswerMap() { // from class: o.TtmlSubtitle
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return VideoTimelineSideSheetViewModel.IconCompatParcelizer(this.read, p0, p1, (MarrowResponse) obj);
            }
        };
        getTimelineId<? super MarrowResponse<VideoTimelineResponseBody>> gettimelineid = new getTimelineId() { // from class: o.TtmlStyleStyleFlags
            @Override // kotlin.getTimelineId
            public final void RemoteActionCompatParcelizer(Object obj) {
                VideoTimelineSideSheetViewModel.AudioAttributesCompatParcelizer(getanswermap, obj);
            }
        };
        final getAnswerMap getanswermap2 = new getAnswerMap() { // from class: o.setShearPercentage
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return VideoTimelineSideSheetViewModel.AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer, p0, p1, (Throwable) obj);
            }
        };
        this.MediaBrowserCompatItemReceiver.read(accessgetemptystatecpAudioAttributesCompatParcelizer.IconCompatParcelizer(gettimelineid, new getTimelineId() { // from class: o.setRubyPosition
            @Override // kotlin.getTimelineId
            public final void RemoteActionCompatParcelizer(Object obj) {
                VideoTimelineSideSheetViewModel.RemoteActionCompatParcelizer(getanswermap2, obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AudioAttributesCompatParcelizer(getAnswerMap getanswermap, Object obj) {
        getanswermap.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup IconCompatParcelizer(VideoTimelineSideSheetViewModel videoTimelineSideSheetViewModel, Timeline timeline, int i, MarrowResponse marrowResponse) {
        if (marrowResponse instanceof Failed) {
            videoTimelineSideSheetViewModel.RemoteActionCompatParcelizer(timeline.getTimelineId(), i);
        } else if (marrowResponse instanceof MarrowError) {
            videoTimelineSideSheetViewModel.RemoteActionCompatParcelizer(timeline.getTimelineId(), i);
            toMagicModuleMetaRepoModel.read(marrowResponse, "");
            videoTimelineSideSheetViewModel.IconCompatParcelizer(((MarrowError) marrowResponse).getThrowable());
        } else {
            if (!(marrowResponse instanceof Success)) {
                throw new RenewEligibleCreator();
            }
            videoTimelineSideSheetViewModel.read(timeline.getTimelineId(), i);
        }
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void RemoteActionCompatParcelizer(getAnswerMap getanswermap, Object obj) {
        getanswermap.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesCompatParcelizer(VideoTimelineSideSheetViewModel videoTimelineSideSheetViewModel, Timeline timeline, int i, Throwable th) {
        videoTimelineSideSheetViewModel.RemoteActionCompatParcelizer(timeline.getTimelineId(), i);
        toMagicModuleMetaRepoModel.write((Object) th);
        videoTimelineSideSheetViewModel.IconCompatParcelizer(th);
        return getShowPopup.INSTANCE;
    }

    static final class AudioAttributesImplApi21Parcelizer extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int RemoteActionCompatParcelizer;
        private /* synthetic */ Throwable read;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.RemoteActionCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.RemoteActionCompatParcelizer = 1;
                if (DefaultBandwidthMeter1.AudioAttributesCompatParcelizer(VideoTimelineSideSheetViewModel.this.AudioAttributesCompatParcelizer, this.read, "video_detail_bookmark", null, this, 4) == objIconCompatParcelizer) {
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
        AudioAttributesImplApi21Parcelizer(Throwable th, SampleVideos<? super AudioAttributesImplApi21Parcelizer> sampleVideos) {
            super(1, sampleVideos);
            this.read = th;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return VideoTimelineSideSheetViewModel.this.new AudioAttributesImplApi21Parcelizer(this.read, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AudioAttributesImplApi21Parcelizer) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void IconCompatParcelizer(Throwable p0) {
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new AudioAttributesImplApi21Parcelizer(p0, null), new MagicModuleSubmissionRequestBody() { // from class: o.setTextEmphasis
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return VideoTimelineSideSheetViewModel.RatingCompat((String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup RatingCompat(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return getShowPopup.INSTANCE;
    }

    static final class MediaBrowserCompatItemReceiver extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private /* synthetic */ int AudioAttributesCompatParcelizer;
        private /* synthetic */ String RemoteActionCompatParcelizer;
        private int read;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.read;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.read = 1;
                if (VideoTimelineSideSheetViewModel.this.RatingCompat.RemoteActionCompatParcelizer(new setFontFamily.read(this.RemoteActionCompatParcelizer, this.AudioAttributesCompatParcelizer), this) == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            VideoTimelineSideSheetViewModel.this.IconCompatParcelizer(this.RemoteActionCompatParcelizer, this.AudioAttributesCompatParcelizer);
            return getShowPopup.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        MediaBrowserCompatItemReceiver(String str, int i, SampleVideos<? super MediaBrowserCompatItemReceiver> sampleVideos) {
            super(1, sampleVideos);
            this.RemoteActionCompatParcelizer = str;
            this.AudioAttributesCompatParcelizer = i;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return VideoTimelineSideSheetViewModel.this.new MediaBrowserCompatItemReceiver(this.RemoteActionCompatParcelizer, this.AudioAttributesCompatParcelizer, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((MediaBrowserCompatItemReceiver) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void read(String p0, int p1) {
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new MediaBrowserCompatItemReceiver(p0, p1, null), new MagicModuleSubmissionRequestBody() { // from class: o.setRubyType
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return VideoTimelineSideSheetViewModel.handleMediaPlayPauseIfPendingOnHandler((String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup handleMediaPlayPauseIfPendingOnHandler(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void IconCompatParcelizer(String p0, int p1) {
        attachFontFace attachfontfaceIconCompatParcelizer;
        List<VideoTimelineItem> listAudioAttributesCompatParcelizer = this.AudioAttributesImplApi26Parcelizer.IconCompatParcelizer().AudioAttributesCompatParcelizer();
        ArrayList arrayList = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) listAudioAttributesCompatParcelizer, 10));
        for (VideoTimelineItem videoTimelineItemAudioAttributesCompatParcelizer : listAudioAttributesCompatParcelizer) {
            if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) videoTimelineItemAudioAttributesCompatParcelizer.getRemoteActionCompatParcelizer().getTimelineId(), (Object) p0)) {
                videoTimelineItemAudioAttributesCompatParcelizer.getRemoteActionCompatParcelizer().setBookmarkType(p1);
                videoTimelineItemAudioAttributesCompatParcelizer = VideoTimelineItem.AudioAttributesCompatParcelizer(videoTimelineItemAudioAttributesCompatParcelizer, null, false, p1, 3);
            }
            arrayList.add(videoTimelineItemAudioAttributesCompatParcelizer);
        }
        ArrayList arrayList2 = arrayList;
        getResolutionSize<attachFontFace> getresolutionsize = this.AudioAttributesImplApi26Parcelizer;
        do {
            attachfontfaceIconCompatParcelizer = getresolutionsize.IconCompatParcelizer();
        } while (!getresolutionsize.AudioAttributesCompatParcelizer(attachfontfaceIconCompatParcelizer, attachFontFace.RemoteActionCompatParcelizer(attachfontfaceIconCompatParcelizer, arrayList2, null, false, false, 14)));
    }

    static final class MediaBrowserCompatCustomActionResultReceiver extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private /* synthetic */ VideoTimelineSideSheetViewModel AudioAttributesCompatParcelizer;
        private int IconCompatParcelizer;
        private /* synthetic */ int RemoteActionCompatParcelizer;
        private int read;
        private /* synthetic */ String write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.IconCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                int i2 = this.RemoteActionCompatParcelizer == 0 ? 1 : 0;
                this.AudioAttributesCompatParcelizer.IconCompatParcelizer(this.write, i2);
                this.read = i2;
                this.IconCompatParcelizer = 1;
                if (this.AudioAttributesCompatParcelizer.RatingCompat.RemoteActionCompatParcelizer(setFontFamily.MediaBrowserCompatCustomActionResultReceiver.INSTANCE, this) == objIconCompatParcelizer) {
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
        MediaBrowserCompatCustomActionResultReceiver(int i, VideoTimelineSideSheetViewModel videoTimelineSideSheetViewModel, String str, SampleVideos<? super MediaBrowserCompatCustomActionResultReceiver> sampleVideos) {
            super(1, sampleVideos);
            this.RemoteActionCompatParcelizer = i;
            this.AudioAttributesCompatParcelizer = videoTimelineSideSheetViewModel;
            this.write = str;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return new MediaBrowserCompatCustomActionResultReceiver(this.RemoteActionCompatParcelizer, this.AudioAttributesCompatParcelizer, this.write, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((MediaBrowserCompatCustomActionResultReceiver) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void RemoteActionCompatParcelizer(String p0, int p1) {
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new MediaBrowserCompatCustomActionResultReceiver(p1, this, p0, null), new MagicModuleSubmissionRequestBody() { // from class: o.setMultiRowAlign
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return VideoTimelineSideSheetViewModel.onAddQueueItem((String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup onAddQueueItem(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return getShowPopup.INSTANCE;
    }

    @Override // kotlin.POJOPropertyBuilderWithMember
    public final void write() {
        this.MediaBrowserCompatItemReceiver.read();
        super.write();
    }
}
