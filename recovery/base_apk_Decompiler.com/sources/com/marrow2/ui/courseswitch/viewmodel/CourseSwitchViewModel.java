package com.marrow2.ui.courseswitch.viewmodel;

import com.marrow.TrainingApplication;
import com.marrow2.data.user.remote.model.CourseModelV3;
import com.marrow2.data.user.remote.model.EditionsModelV3;
import com.marrow2.ui.courseswitch.viewmodel.CourseSwitchViewModel;
import java.util.Iterator;
import java.util.List;
import kotlin.CmcdHeadersFactoryCmcdObjectBuilder;
import kotlin.LogLogLevel;
import kotlin.MagicModuleSubmissionRequestBody;
import kotlin.Metadata;
import kotlin.POJOPropertyBuilder5;
import kotlin.POJOPropertyBuilderWithMember;
import kotlin.RenewEligibleCreator;
import kotlin.SampleVideos;
import kotlin.SdkPayloadData;
import kotlin.TypeResolutionContextBasic;
import kotlin.VerifyNewNumberRequest;
import kotlin.addVideoSurfaceListener;
import kotlin.getAnswerMap;
import kotlin.getCameraMotionListener;
import kotlin.getDisplaySizeV17;
import kotlin.getMagicModuleStats;
import kotlin.getResolutionSize;
import kotlin.getShowPopup;
import kotlin.getTotalMcq;
import kotlin.getVideoFrameMetadataListener;
import kotlin.getYear;
import kotlin.inferContentTypeForExtension;
import kotlin.lambdaonDetachedFromWindow0comgoogleandroidexoplayer2videosphericalSphericalGLSurfaceView;
import kotlin.peekChar;
import kotlin.setSdkPayload;
import kotlin.setStartTime;
import kotlin.setUpdatedStatus;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0018\u00002\u00020\u0001B9\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010H\u0082@¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0010H\u0082@¢\u0006\u0004\b\u0013\u0010\u0012J\u0011\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u001d¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0010H\u0002¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\"\u0010!J\u000f\u0010#\u001a\u00020\u0010H\u0002¢\u0006\u0004\b#\u0010!J\u000f\u0010$\u001a\u00020\u0010H\u0002¢\u0006\u0004\b$\u0010!R\u0014\u0010\u0013\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\u001e\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010+\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010\u0011\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010/\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010.R\u0014\u0010#\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u0010\"\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0016\u0010$\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00103R\u001e\u0010)\u001a\n\u0012\u0004\u0012\u000206\u0018\u0001058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u00107R\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u00109R\u001f\u00100\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0:8\u0007¢\u0006\f\n\u0004\b\u001b\u0010;\u001a\u0004\b/\u0010<R\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020=088\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0013\u00109R \u0010'\u001a\b\u0012\u0004\u0012\u00020=0:8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b>\u0010;\u001a\u0004\b+\u0010<R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020?088\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b+\u00109R \u0010\u001b\u001a\b\u0012\u0004\u0012\u00020?0:8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010;\u001a\u0004\b)\u0010<R\u001a\u0010>\u001a\b\u0012\u0004\u0012\u00020@088\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b/\u00109R \u00102\u001a\b\u0012\u0004\u0012\u00020@0:8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010;\u001a\u0004\b\u0013\u0010<R\u001a\u0010,\u001a\b\u0012\u0004\u0012\u00020A0:8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010;R\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020\u001a088\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001e\u00109R\u001a\u00104\u001a\b\u0012\u0004\u0012\u00020\u001a0:8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b \u0010;"}, d2 = {"Lcom/marrow2/ui/courseswitch/viewmodel/CourseSwitchViewModel;", "Lo/POJOPropertyBuilderWithMember;", "Lo/getDisplaySizeV17;", "p0", "Lo/peekChar;", "p1", "Lcom/marrow/TrainingApplication;", "p2", "Lo/POJOPropertyBuilder5;", "p3", "Lo/LogLogLevel;", "p4", "Lo/inferContentTypeForExtension;", "p5", "<init>", "(Lo/getDisplaySizeV17;Lo/peekChar;Lcom/marrow/TrainingApplication;Lo/POJOPropertyBuilder5;Lo/LogLogLevel;Lo/inferContentTypeForExtension;)V", "", "RemoteActionCompatParcelizer", "(Lo/SampleVideos;)Ljava/lang/Object;", "read", "Lcom/marrow2/data/user/remote/model/EditionsModelV3;", "MediaBrowserCompatMediaItem", "()Lcom/marrow2/data/user/remote/model/EditionsModelV3;", "", "AudioAttributesImplApi26Parcelizer", "()I", "", "MediaBrowserCompatSearchResultReceiver", "()Ljava/lang/String;", "Lo/getVideoFrameMetadataListener;", "write", "(Lo/getVideoFrameMetadataListener;)V", "RatingCompat", "()V", "MediaBrowserCompatItemReceiver", "AudioAttributesImplBaseParcelizer", "AudioAttributesImplApi21Parcelizer", "handleMediaPlayPauseIfPendingOnHandler", "Lo/getDisplaySizeV17;", "MediaDescriptionCompat", "Lo/peekChar;", "MediaBrowserCompatCustomActionResultReceiver", "Lcom/marrow/TrainingApplication;", "AudioAttributesCompatParcelizer", "onCustomAction", "Lo/POJOPropertyBuilder5;", "Lo/LogLogLevel;", "IconCompatParcelizer", "MediaMetadataCompat", "Lo/inferContentTypeForExtension;", "onAddQueueItem", "I", "MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver", "", "Lcom/marrow2/data/user/remote/model/CourseModelV3;", "Ljava/util/List;", "Lo/getResolutionSize;", "Lo/getResolutionSize;", "Lo/setUpdatedStatus;", "Lo/setUpdatedStatus;", "()Lo/setUpdatedStatus;", "Lo/lambdaonDetachedFromWindow0comgoogleandroidexoplayer2videosphericalSphericalGLSurfaceView;", "onCommand", "", "Lo/addVideoSurfaceListener;", "Lo/getCameraMotionListener;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CourseSwitchViewModel extends POJOPropertyBuilderWithMember {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final getResolutionSize<Boolean> MediaBrowserCompatMediaItem;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private final LogLogLevel IconCompatParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private final setUpdatedStatus<getCameraMotionListener> onCustomAction;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private List<CourseModelV3> MediaBrowserCompatCustomActionResultReceiver;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final getResolutionSize<addVideoSurfaceListener> onCommand;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private final TrainingApplication AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private final setUpdatedStatus<addVideoSurfaceListener> onAddQueueItem;

    /* JADX INFO: renamed from: MediaBrowserCompatMediaItem, reason: from kotlin metadata */
    private final setUpdatedStatus<Boolean> MediaBrowserCompatSearchResultReceiver;

    /* JADX INFO: renamed from: MediaBrowserCompatSearchResultReceiver, reason: from kotlin metadata */
    private final setUpdatedStatus<String> MediaMetadataCompat;

    /* JADX INFO: renamed from: MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, reason: from kotlin metadata */
    private int AudioAttributesImplApi21Parcelizer;

    /* JADX INFO: renamed from: MediaDescriptionCompat, reason: from kotlin metadata */
    private final peekChar write;

    /* JADX INFO: renamed from: MediaMetadataCompat, reason: from kotlin metadata */
    private final inferContentTypeForExtension AudioAttributesImplBaseParcelizer;

    /* JADX INFO: renamed from: RatingCompat, reason: from kotlin metadata */
    private final setUpdatedStatus<String> MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final getResolutionSize<String> AudioAttributesImplApi26Parcelizer;

    /* JADX INFO: renamed from: handleMediaPlayPauseIfPendingOnHandler, reason: from kotlin metadata */
    private final getDisplaySizeV17 read;

    /* JADX INFO: renamed from: onAddQueueItem, reason: from kotlin metadata */
    private int MediaBrowserCompatItemReceiver;

    /* JADX INFO: renamed from: onCommand, reason: from kotlin metadata */
    private final setUpdatedStatus<lambdaonDetachedFromWindow0comgoogleandroidexoplayer2videosphericalSphericalGLSurfaceView> MediaDescriptionCompat;

    /* JADX INFO: renamed from: onCustomAction, reason: from kotlin metadata */
    private final POJOPropertyBuilder5 RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final getResolutionSize<lambdaonDetachedFromWindow0comgoogleandroidexoplayer2videosphericalSphericalGLSurfaceView> RatingCompat;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final getResolutionSize<String> handleMediaPlayPauseIfPendingOnHandler;

    static final class write extends getTotalMcq {
        int AudioAttributesCompatParcelizer;
        Object IconCompatParcelizer;
        Object RemoteActionCompatParcelizer;
        /* synthetic */ Object read;
        int write;

        write(SampleVideos<? super write> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.read = obj;
            this.write |= Integer.MIN_VALUE;
            return CourseSwitchViewModel.this.read(this);
        }
    }

    @setSdkPayload
    public CourseSwitchViewModel(getDisplaySizeV17 getdisplaysizev17, peekChar peekchar, TrainingApplication trainingApplication, POJOPropertyBuilder5 pOJOPropertyBuilder5, LogLogLevel logLogLevel, inferContentTypeForExtension infercontenttypeforextension) {
        toMagicModuleMetaRepoModel.write(getdisplaysizev17, "");
        toMagicModuleMetaRepoModel.write(peekchar, "");
        toMagicModuleMetaRepoModel.write(trainingApplication, "");
        toMagicModuleMetaRepoModel.write(pOJOPropertyBuilder5, "");
        toMagicModuleMetaRepoModel.write(logLogLevel, "");
        toMagicModuleMetaRepoModel.write(infercontenttypeforextension, "");
        this.read = getdisplaysizev17;
        this.write = peekchar;
        this.AudioAttributesCompatParcelizer = trainingApplication;
        this.RemoteActionCompatParcelizer = pOJOPropertyBuilder5;
        this.IconCompatParcelizer = logLogLevel;
        this.AudioAttributesImplBaseParcelizer = infercontenttypeforextension;
        this.MediaBrowserCompatItemReceiver = -1;
        this.AudioAttributesImplApi21Parcelizer = -1;
        getResolutionSize<String> getresolutionsizeRemoteActionCompatParcelizer = setStartTime.RemoteActionCompatParcelizer(null);
        this.AudioAttributesImplApi26Parcelizer = getresolutionsizeRemoteActionCompatParcelizer;
        this.MediaMetadataCompat = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer);
        getResolutionSize<lambdaonDetachedFromWindow0comgoogleandroidexoplayer2videosphericalSphericalGLSurfaceView> getresolutionsizeRemoteActionCompatParcelizer2 = setStartTime.RemoteActionCompatParcelizer(lambdaonDetachedFromWindow0comgoogleandroidexoplayer2videosphericalSphericalGLSurfaceView.IconCompatParcelizer.INSTANCE);
        this.RatingCompat = getresolutionsizeRemoteActionCompatParcelizer2;
        this.MediaDescriptionCompat = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer2);
        getResolutionSize<Boolean> getresolutionsizeRemoteActionCompatParcelizer3 = setStartTime.RemoteActionCompatParcelizer(Boolean.FALSE);
        this.MediaBrowserCompatMediaItem = getresolutionsizeRemoteActionCompatParcelizer3;
        this.MediaBrowserCompatSearchResultReceiver = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer3);
        getResolutionSize<addVideoSurfaceListener> getresolutionsizeRemoteActionCompatParcelizer4 = setStartTime.RemoteActionCompatParcelizer(new addVideoSurfaceListener(null, 0, 0, 7, null));
        this.onCommand = getresolutionsizeRemoteActionCompatParcelizer4;
        this.onAddQueueItem = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer4);
        getCameraMotionListener.Companion companion = getCameraMotionListener.INSTANCE;
        this.onCustomAction = setStartTime.RemoteActionCompatParcelizer(getCameraMotionListener.Companion.RemoteActionCompatParcelizer(pOJOPropertyBuilder5));
        getResolutionSize<String> getresolutionsizeRemoteActionCompatParcelizer5 = setStartTime.RemoteActionCompatParcelizer("");
        this.handleMediaPlayPauseIfPendingOnHandler = getresolutionsizeRemoteActionCompatParcelizer5;
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer5);
        AudioAttributesImplBaseParcelizer();
        AudioAttributesImplApi21Parcelizer();
    }

    public final setUpdatedStatus<String> IconCompatParcelizer() {
        return this.MediaMetadataCompat;
    }

    public final setUpdatedStatus<lambdaonDetachedFromWindow0comgoogleandroidexoplayer2videosphericalSphericalGLSurfaceView> AudioAttributesCompatParcelizer() {
        return this.MediaDescriptionCompat;
    }

    public final setUpdatedStatus<Boolean> MediaBrowserCompatCustomActionResultReceiver() {
        return this.MediaBrowserCompatSearchResultReceiver;
    }

    public final setUpdatedStatus<addVideoSurfaceListener> read() {
        return this.onAddQueueItem;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object RemoteActionCompatParcelizer(SampleVideos<? super getShowPopup> sampleVideos) {
        if (this.onCustomAction.IconCompatParcelizer().getWrite()) {
            Object obj = read(sampleVideos);
            return obj == getYear.IconCompatParcelizer() ? obj : getShowPopup.INSTANCE;
        }
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object read(kotlin.SampleVideos<? super kotlin.getShowPopup> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.marrow2.ui.courseswitch.viewmodel.CourseSwitchViewModel.write
            if (r0 == 0) goto L14
            r0 = r6
            com.marrow2.ui.courseswitch.viewmodel.CourseSwitchViewModel$write r0 = (com.marrow2.ui.courseswitch.viewmodel.CourseSwitchViewModel.write) r0
            int r1 = r0.write
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r6 = r0.write
            int r6 = r6 + r2
            r0.write = r6
            goto L19
        L14:
            com.marrow2.ui.courseswitch.viewmodel.CourseSwitchViewModel$write r0 = new com.marrow2.ui.courseswitch.viewmodel.CourseSwitchViewModel$write
            r0.<init>(r6)
        L19:
            java.lang.Object r6 = r0.read
            java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
            int r2 = r0.write
            r3 = 1
            if (r2 == 0) goto L3c
            if (r2 != r3) goto L34
            int r1 = r0.AudioAttributesCompatParcelizer
            java.lang.Object r1 = r0.RemoteActionCompatParcelizer
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.IconCompatParcelizer
            java.lang.String r0 = (java.lang.String) r0
            kotlin.SdkPayloadData.IconCompatParcelizer(r6)
            goto L6c
        L34:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3c:
            kotlin.SdkPayloadData.IconCompatParcelizer(r6)
            java.lang.String r6 = r5.MediaBrowserCompatSearchResultReceiver()
            int r2 = r5.AudioAttributesImplApi26Parcelizer()
            o.setUpdatedStatus<o.getCameraMotionListener> r4 = r5.onCustomAction
            java.lang.Object r4 = r4.IconCompatParcelizer()
            o.getCameraMotionListener r4 = (kotlin.getCameraMotionListener) r4
            int r4 = r4.getRemoteActionCompatParcelizer()
            if (r4 == r2) goto L57
            r4 = r6
            goto L59
        L57:
            java.lang.String r4 = ""
        L59:
            r0.IconCompatParcelizer = r6
            r0.RemoteActionCompatParcelizer = r4
            r0.AudioAttributesCompatParcelizer = r2
            r0.write = r3
            r2 = 100
            java.lang.Object r0 = kotlin.setCountry.IconCompatParcelizer(r2, r0)
            if (r0 != r1) goto L6a
            return r1
        L6a:
            r0 = r6
            r1 = r4
        L6c:
            o.getResolutionSize<o.lambdaonDetachedFromWindow0comgoogleandroidexoplayer2videosphericalSphericalGLSurfaceView> r5 = r5.RatingCompat
            o.lambdaonDetachedFromWindow0comgoogleandroidexoplayer2videosphericalSphericalGLSurfaceView$AudioAttributesCompatParcelizer r6 = new o.lambdaonDetachedFromWindow0comgoogleandroidexoplayer2videosphericalSphericalGLSurfaceView$AudioAttributesCompatParcelizer
            r6.<init>(r0, r1)
            r5.write(r6)
            o.getShowPopup r5 = kotlin.getShowPopup.INSTANCE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.courseswitch.viewmodel.CourseSwitchViewModel.read(o.SampleVideos):java.lang.Object");
    }

    private final EditionsModelV3 MediaBrowserCompatMediaItem() {
        Object next;
        List<EditionsModelV3> editions;
        List<CourseModelV3> list = this.MediaBrowserCompatCustomActionResultReceiver;
        Object obj = null;
        if (list == null) {
            return null;
        }
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Integer.parseInt(((CourseModelV3) next).getCourseId()) == this.MediaBrowserCompatItemReceiver) {
                break;
            }
        }
        CourseModelV3 courseModelV3 = (CourseModelV3) next;
        if (courseModelV3 == null || (editions = courseModelV3.getEditions()) == null) {
            return null;
        }
        Iterator<T> it2 = editions.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next2 = it2.next();
            if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(((EditionsModelV3) next2).isDefault(), Boolean.TRUE)) {
                obj = next2;
                break;
            }
        }
        return (EditionsModelV3) obj;
    }

    private final int AudioAttributesImplApi26Parcelizer() {
        Integer id;
        EditionsModelV3 editionsModelV3MediaBrowserCompatMediaItem = MediaBrowserCompatMediaItem();
        if (editionsModelV3MediaBrowserCompatMediaItem == null || (id = editionsModelV3MediaBrowserCompatMediaItem.getId()) == null) {
            return 0;
        }
        return id.intValue();
    }

    private final String MediaBrowserCompatSearchResultReceiver() {
        EditionsModelV3 editionsModelV3MediaBrowserCompatMediaItem = MediaBrowserCompatMediaItem();
        String title = editionsModelV3MediaBrowserCompatMediaItem != null ? editionsModelV3MediaBrowserCompatMediaItem.getTitle() : null;
        return title == null ? "" : title;
    }

    public final void write(getVideoFrameMetadataListener p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, getVideoFrameMetadataListener.write.INSTANCE)) {
            this.RatingCompat.write(lambdaonDetachedFromWindow0comgoogleandroidexoplayer2videosphericalSphericalGLSurfaceView.IconCompatParcelizer.INSTANCE);
            return;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, getVideoFrameMetadataListener.read.INSTANCE)) {
            RatingCompat();
            return;
        }
        if (p0 instanceof getVideoFrameMetadataListener.IconCompatParcelizer) {
            getVideoFrameMetadataListener.IconCompatParcelizer iconCompatParcelizer = (getVideoFrameMetadataListener.IconCompatParcelizer) p0;
            this.MediaBrowserCompatItemReceiver = iconCompatParcelizer.write();
            this.AudioAttributesImplApi21Parcelizer = iconCompatParcelizer.RemoteActionCompatParcelizer();
            getResolutionSize<addVideoSurfaceListener> getresolutionsize = this.onCommand;
            getresolutionsize.write(addVideoSurfaceListener.AudioAttributesCompatParcelizer(getresolutionsize.IconCompatParcelizer().read, this.MediaBrowserCompatItemReceiver, this.AudioAttributesImplApi21Parcelizer));
            return;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, getVideoFrameMetadataListener.AudioAttributesCompatParcelizer.INSTANCE)) {
            MediaBrowserCompatItemReceiver();
            return;
        }
        if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, getVideoFrameMetadataListener.RemoteActionCompatParcelizer.INSTANCE)) {
            throw new RenewEligibleCreator();
        }
        this.MediaBrowserCompatItemReceiver = this.onCustomAction.IconCompatParcelizer().getAudioAttributesCompatParcelizer();
        this.AudioAttributesImplApi21Parcelizer = this.onCustomAction.IconCompatParcelizer().getRemoteActionCompatParcelizer();
        getResolutionSize<addVideoSurfaceListener> getresolutionsize2 = this.onCommand;
        getresolutionsize2.write(addVideoSurfaceListener.AudioAttributesCompatParcelizer(getresolutionsize2.IconCompatParcelizer().read, this.MediaBrowserCompatItemReceiver, this.AudioAttributesImplApi21Parcelizer));
        MediaBrowserCompatItemReceiver();
    }

    static final class AudioAttributesCompatParcelizer extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int AudioAttributesCompatParcelizer;
        private int write;

        /* JADX WARN: Removed duplicated region for block: B:21:0x0081  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0089  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x008f  */
        @Override // kotlin.getMonthName
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                java.lang.Object r0 = kotlin.getYear.IconCompatParcelizer()
                int r1 = r4.write
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L20
                if (r1 == r3) goto L1c
                if (r1 != r2) goto L14
                int r0 = r4.AudioAttributesCompatParcelizer
                kotlin.SdkPayloadData.IconCompatParcelizer(r5)
                goto L50
            L14:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r5)
                throw r4
            L1c:
                kotlin.SdkPayloadData.IconCompatParcelizer(r5)
                goto L34
            L20:
                kotlin.SdkPayloadData.IconCompatParcelizer(r5)
                com.marrow2.ui.courseswitch.viewmodel.CourseSwitchViewModel r5 = com.marrow2.ui.courseswitch.viewmodel.CourseSwitchViewModel.this
                o.getDisplaySizeV17 r5 = com.marrow2.ui.courseswitch.viewmodel.CourseSwitchViewModel.AudioAttributesImplApi26Parcelizer(r5)
                r1 = r4
                o.SampleVideos r1 = (kotlin.SampleVideos) r1
                r4.write = r3
                java.lang.Object r5 = r5.AudioAttributesImplApi26Parcelizer(r1)
                if (r5 == r0) goto L9d
            L34:
                java.lang.Number r5 = (java.lang.Number) r5
                int r5 = r5.intValue()
                com.marrow2.ui.courseswitch.viewmodel.CourseSwitchViewModel r1 = com.marrow2.ui.courseswitch.viewmodel.CourseSwitchViewModel.this
                o.getDisplaySizeV17 r1 = com.marrow2.ui.courseswitch.viewmodel.CourseSwitchViewModel.AudioAttributesImplApi26Parcelizer(r1)
                r3 = r4
                o.SampleVideos r3 = (kotlin.SampleVideos) r3
                r4.AudioAttributesCompatParcelizer = r5
                r4.write = r2
                java.lang.Object r1 = r1.MediaBrowserCompatMediaItem(r3)
                if (r1 != r0) goto L4e
                goto L9d
            L4e:
                r0 = r5
                r5 = r1
            L50:
                java.lang.Number r5 = (java.lang.Number) r5
                int r5 = r5.intValue()
                com.marrow2.ui.courseswitch.viewmodel.CourseSwitchViewModel r1 = com.marrow2.ui.courseswitch.viewmodel.CourseSwitchViewModel.this
                int r1 = com.marrow2.ui.courseswitch.viewmodel.CourseSwitchViewModel.AudioAttributesImplBaseParcelizer(r1)
                if (r0 != r1) goto L81
                com.marrow2.ui.courseswitch.viewmodel.CourseSwitchViewModel r1 = com.marrow2.ui.courseswitch.viewmodel.CourseSwitchViewModel.this
                int r1 = com.marrow2.ui.courseswitch.viewmodel.CourseSwitchViewModel.AudioAttributesImplApi21Parcelizer(r1)
                if (r5 != r1) goto L81
                com.marrow2.ui.courseswitch.viewmodel.CourseSwitchViewModel r5 = com.marrow2.ui.courseswitch.viewmodel.CourseSwitchViewModel.this
                o.getResolutionSize r5 = com.marrow2.ui.courseswitch.viewmodel.CourseSwitchViewModel.MediaBrowserCompatMediaItem(r5)
                o.lambdaonDetachedFromWindow0comgoogleandroidexoplayer2videosphericalSphericalGLSurfaceView$read r0 = new o.lambdaonDetachedFromWindow0comgoogleandroidexoplayer2videosphericalSphericalGLSurfaceView$read
                com.marrow2.ui.courseswitch.viewmodel.CourseSwitchViewModel r1 = com.marrow2.ui.courseswitch.viewmodel.CourseSwitchViewModel.this
                int r1 = com.marrow2.ui.courseswitch.viewmodel.CourseSwitchViewModel.AudioAttributesImplApi21Parcelizer(r1)
                com.marrow2.ui.courseswitch.viewmodel.CourseSwitchViewModel r4 = com.marrow2.ui.courseswitch.viewmodel.CourseSwitchViewModel.this
                int r4 = com.marrow2.ui.courseswitch.viewmodel.CourseSwitchViewModel.AudioAttributesImplBaseParcelizer(r4)
                r0.<init>(r1, r4)
                r5.write(r0)
                goto L9a
            L81:
                com.marrow2.ui.courseswitch.viewmodel.CourseSwitchViewModel r5 = com.marrow2.ui.courseswitch.viewmodel.CourseSwitchViewModel.this
                int r5 = com.marrow2.ui.courseswitch.viewmodel.CourseSwitchViewModel.AudioAttributesImplBaseParcelizer(r5)
                if (r0 != r5) goto L8f
                com.marrow2.ui.courseswitch.viewmodel.CourseSwitchViewModel r4 = com.marrow2.ui.courseswitch.viewmodel.CourseSwitchViewModel.this
                com.marrow2.ui.courseswitch.viewmodel.CourseSwitchViewModel.IconCompatParcelizer(r4)
                goto L9a
            L8f:
                com.marrow2.ui.courseswitch.viewmodel.CourseSwitchViewModel r4 = com.marrow2.ui.courseswitch.viewmodel.CourseSwitchViewModel.this
                o.getResolutionSize r4 = com.marrow2.ui.courseswitch.viewmodel.CourseSwitchViewModel.MediaBrowserCompatMediaItem(r4)
                o.lambdaonDetachedFromWindow0comgoogleandroidexoplayer2videosphericalSphericalGLSurfaceView$RemoteActionCompatParcelizer r5 = o.lambdaonDetachedFromWindow0comgoogleandroidexoplayer2videosphericalSphericalGLSurfaceView.RemoteActionCompatParcelizer.INSTANCE
                r4.write(r5)
            L9a:
                o.getShowPopup r4 = kotlin.getShowPopup.INSTANCE
                return r4
            L9d:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.courseswitch.viewmodel.CourseSwitchViewModel.AudioAttributesCompatParcelizer.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        AudioAttributesCompatParcelizer(SampleVideos<? super AudioAttributesCompatParcelizer> sampleVideos) {
            super(1, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return CourseSwitchViewModel.this.new AudioAttributesCompatParcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AudioAttributesCompatParcelizer) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void RatingCompat() {
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new AudioAttributesCompatParcelizer(null), new MagicModuleSubmissionRequestBody() { // from class: o.SphericalGLSurfaceViewRenderer
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return CourseSwitchViewModel.IconCompatParcelizer(this.IconCompatParcelizer, (String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup IconCompatParcelizer(CourseSwitchViewModel courseSwitchViewModel, String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        courseSwitchViewModel.handleMediaPlayPauseIfPendingOnHandler.write(str);
        return getShowPopup.INSTANCE;
    }

    static final class read extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int AudioAttributesCompatParcelizer;
        private Object RemoteActionCompatParcelizer;
        private int read;
        private int write;

        /* JADX WARN: Code restructure failed: missing block: B:43:0x018c, code lost:
        
            if (r10.IconCompatParcelizer.IconCompatParcelizer.read(r10) != r0) goto L44;
         */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x01c8, code lost:
        
            if (r10.IconCompatParcelizer.write.read(r10.IconCompatParcelizer.MediaBrowserCompatItemReceiver, r10.IconCompatParcelizer.AudioAttributesImplApi21Parcelizer, r10) != r0) goto L48;
         */
        /* JADX WARN: Removed duplicated region for block: B:18:0x009c  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x00af  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x00b2  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x00c9 A[PHI: r1 r11
          0x00c9: PHI (r1v5 java.lang.String) = (r1v3 java.lang.String), (r1v8 java.lang.String) binds: [B:23:0x00c7, B:12:0x005c] A[DONT_GENERATE, DONT_INLINE]
          0x00c9: PHI (r11v16 java.lang.Object) = (r11v13 java.lang.Object), (r11v0 java.lang.Object) binds: [B:23:0x00c7, B:12:0x005c] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:26:0x00e5  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x0122  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x013c A[PHI: r1 r4
          0x013c: PHI (r1v14 int) = (r1v12 int), (r1v15 int) binds: [B:35:0x013a, B:9:0x0036] A[DONT_GENERATE, DONT_INLINE]
          0x013c: PHI (r4v22 int) = (r4v20 int), (r4v23 int) binds: [B:35:0x013a, B:9:0x0036] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:38:0x014d  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x0176  */
        /* JADX WARN: Removed duplicated region for block: B:45:0x01a0 A[PHI: r1 r4
          0x01a0: PHI (r1v18 int) = (r1v16 int), (r1v20 int) binds: [B:41:0x0174, B:44:0x018e] A[DONT_GENERATE, DONT_INLINE]
          0x01a0: PHI (r4v26 int) = (r4v24 int), (r4v27 int) binds: [B:41:0x0174, B:44:0x018e] A[DONT_GENERATE, DONT_INLINE]] */
        @Override // kotlin.getMonthName
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 524
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.courseswitch.viewmodel.CourseSwitchViewModel.read.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        read(SampleVideos<? super read> sampleVideos) {
            super(1, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return CourseSwitchViewModel.this.new read(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((read) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void MediaBrowserCompatItemReceiver() {
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new read(null), new MagicModuleSubmissionRequestBody() { // from class: o.SphericalGLSurfaceViewExternalSyntheticLambda0
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return CourseSwitchViewModel.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, ((Integer) obj).intValue(), (String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup RemoteActionCompatParcelizer(CourseSwitchViewModel courseSwitchViewModel, int i, String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        courseSwitchViewModel.MediaBrowserCompatMediaItem.write(Boolean.FALSE);
        if (i == 502) {
            courseSwitchViewModel.RatingCompat.write(lambdaonDetachedFromWindow0comgoogleandroidexoplayer2videosphericalSphericalGLSurfaceView.write.INSTANCE);
        } else {
            courseSwitchViewModel.RatingCompat.write(new lambdaonDetachedFromWindow0comgoogleandroidexoplayer2videosphericalSphericalGLSurfaceView.MediaBrowserCompatCustomActionResultReceiver(str));
        }
        return getShowPopup.INSTANCE;
    }

    static final class IconCompatParcelizer extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private Object IconCompatParcelizer;
        private Object RemoteActionCompatParcelizer;
        private int write;

        /* JADX WARN: Code restructure failed: missing block: B:17:0x00ba, code lost:
        
            if (r7.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(r7) != r0) goto L19;
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
                r2 = 3
                r3 = 2
                r4 = 0
                r5 = 1
                if (r1 == 0) goto L2b
                if (r1 == r5) goto L27
                if (r1 == r3) goto L1f
                if (r1 != r2) goto L17
                kotlin.SdkPayloadData.IconCompatParcelizer(r8)
                goto Lbd
            L17:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L1f:
                java.lang.Object r1 = r7.RemoteActionCompatParcelizer
                com.marrow2.ui.courseswitch.viewmodel.CourseSwitchViewModel r1 = (com.marrow2.ui.courseswitch.viewmodel.CourseSwitchViewModel) r1
                kotlin.SdkPayloadData.IconCompatParcelizer(r8)
                goto L75
            L27:
                kotlin.SdkPayloadData.IconCompatParcelizer(r8)
                goto L4c
            L2b:
                kotlin.SdkPayloadData.IconCompatParcelizer(r8)
                com.marrow2.ui.courseswitch.viewmodel.CourseSwitchViewModel r8 = com.marrow2.ui.courseswitch.viewmodel.CourseSwitchViewModel.this
                o.getResolutionSize r8 = com.marrow2.ui.courseswitch.viewmodel.CourseSwitchViewModel.MediaDescriptionCompat(r8)
                java.lang.Boolean r1 = kotlin.QBankStatsResponse.AudioAttributesCompatParcelizer(r5)
                r8.write(r1)
                com.marrow2.ui.courseswitch.viewmodel.CourseSwitchViewModel r8 = com.marrow2.ui.courseswitch.viewmodel.CourseSwitchViewModel.this
                o.getDisplaySizeV17 r8 = com.marrow2.ui.courseswitch.viewmodel.CourseSwitchViewModel.AudioAttributesImplApi26Parcelizer(r8)
                r1 = r7
                o.SampleVideos r1 = (kotlin.SampleVideos) r1
                r7.write = r5
                java.lang.Object r8 = r8.onPlay(r1)
                if (r8 == r0) goto Lc0
            L4c:
                o.getLocaleLanguageTagV21 r8 = (kotlin.getLocaleLanguageTagV21) r8
                com.marrow2.ui.courseswitch.viewmodel.CourseSwitchViewModel r1 = com.marrow2.ui.courseswitch.viewmodel.CourseSwitchViewModel.this
                int r5 = r8.RemoteActionCompatParcelizer()
                com.marrow2.ui.courseswitch.viewmodel.CourseSwitchViewModel.read(r1, r5)
                com.marrow2.ui.courseswitch.viewmodel.CourseSwitchViewModel r1 = com.marrow2.ui.courseswitch.viewmodel.CourseSwitchViewModel.this
                int r8 = r8.MediaBrowserCompatCustomActionResultReceiver()
                com.marrow2.ui.courseswitch.viewmodel.CourseSwitchViewModel.AudioAttributesCompatParcelizer(r1, r8)
                com.marrow2.ui.courseswitch.viewmodel.CourseSwitchViewModel r1 = com.marrow2.ui.courseswitch.viewmodel.CourseSwitchViewModel.this
                o.peekChar r8 = com.marrow2.ui.courseswitch.viewmodel.CourseSwitchViewModel.MediaBrowserCompatItemReceiver(r1)
                r5 = r7
                o.SampleVideos r5 = (kotlin.SampleVideos) r5
                r7.IconCompatParcelizer = r4
                r7.RemoteActionCompatParcelizer = r1
                r7.write = r3
                java.lang.Object r8 = r8.AudioAttributesCompatParcelizer(r5)
                if (r8 == r0) goto Lc0
            L75:
                java.util.List r8 = (java.util.List) r8
                com.marrow2.ui.courseswitch.viewmodel.CourseSwitchViewModel.read(r1, r8)
                com.marrow2.ui.courseswitch.viewmodel.CourseSwitchViewModel r8 = com.marrow2.ui.courseswitch.viewmodel.CourseSwitchViewModel.this
                o.getResolutionSize r8 = com.marrow2.ui.courseswitch.viewmodel.CourseSwitchViewModel.MediaBrowserCompatCustomActionResultReceiver(r8)
                com.marrow2.ui.courseswitch.viewmodel.CourseSwitchViewModel r1 = com.marrow2.ui.courseswitch.viewmodel.CourseSwitchViewModel.this
                java.util.List r1 = com.marrow2.ui.courseswitch.viewmodel.CourseSwitchViewModel.read(r1)
                kotlin.toMagicModuleMetaRepoModel.write(r1)
                o.addVideoSurfaceListener r3 = new o.addVideoSurfaceListener
                com.marrow2.ui.courseswitch.viewmodel.CourseSwitchViewModel r5 = com.marrow2.ui.courseswitch.viewmodel.CourseSwitchViewModel.this
                int r5 = com.marrow2.ui.courseswitch.viewmodel.CourseSwitchViewModel.AudioAttributesImplBaseParcelizer(r5)
                com.marrow2.ui.courseswitch.viewmodel.CourseSwitchViewModel r6 = com.marrow2.ui.courseswitch.viewmodel.CourseSwitchViewModel.this
                int r6 = com.marrow2.ui.courseswitch.viewmodel.CourseSwitchViewModel.AudioAttributesImplApi21Parcelizer(r6)
                r3.<init>(r1, r5, r6)
                r8.write(r3)
                com.marrow2.ui.courseswitch.viewmodel.CourseSwitchViewModel r8 = com.marrow2.ui.courseswitch.viewmodel.CourseSwitchViewModel.this
                o.getResolutionSize r8 = com.marrow2.ui.courseswitch.viewmodel.CourseSwitchViewModel.MediaDescriptionCompat(r8)
                r1 = 0
                java.lang.Boolean r1 = kotlin.QBankStatsResponse.AudioAttributesCompatParcelizer(r1)
                r8.write(r1)
                com.marrow2.ui.courseswitch.viewmodel.CourseSwitchViewModel r8 = com.marrow2.ui.courseswitch.viewmodel.CourseSwitchViewModel.this
                r1 = r7
                o.SampleVideos r1 = (kotlin.SampleVideos) r1
                r7.IconCompatParcelizer = r4
                r7.RemoteActionCompatParcelizer = r4
                r7.write = r2
                java.lang.Object r7 = com.marrow2.ui.courseswitch.viewmodel.CourseSwitchViewModel.read(r8, r1)
                if (r7 != r0) goto Lbd
                goto Lc0
            Lbd:
                o.getShowPopup r7 = kotlin.getShowPopup.INSTANCE
                return r7
            Lc0:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.courseswitch.viewmodel.CourseSwitchViewModel.IconCompatParcelizer.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        IconCompatParcelizer(SampleVideos<? super IconCompatParcelizer> sampleVideos) {
            super(1, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return CourseSwitchViewModel.this.new IconCompatParcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((IconCompatParcelizer) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void AudioAttributesImplBaseParcelizer() {
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new IconCompatParcelizer(null), new MagicModuleSubmissionRequestBody() { // from class: o.getVideoSurface
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return CourseSwitchViewModel.read(this.AudioAttributesCompatParcelizer, ((Integer) obj).intValue(), (String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(CourseSwitchViewModel courseSwitchViewModel, int i, String str) {
        lambdaonDetachedFromWindow0comgoogleandroidexoplayer2videosphericalSphericalGLSurfaceView.MediaBrowserCompatCustomActionResultReceiver mediaBrowserCompatCustomActionResultReceiver;
        toMagicModuleMetaRepoModel.write(str, "");
        courseSwitchViewModel.MediaBrowserCompatMediaItem.write(Boolean.FALSE);
        getResolutionSize<lambdaonDetachedFromWindow0comgoogleandroidexoplayer2videosphericalSphericalGLSurfaceView> getresolutionsize = courseSwitchViewModel.RatingCompat;
        if (i == 502) {
            mediaBrowserCompatCustomActionResultReceiver = lambdaonDetachedFromWindow0comgoogleandroidexoplayer2videosphericalSphericalGLSurfaceView.write.INSTANCE;
        } else {
            mediaBrowserCompatCustomActionResultReceiver = new lambdaonDetachedFromWindow0comgoogleandroidexoplayer2videosphericalSphericalGLSurfaceView.MediaBrowserCompatCustomActionResultReceiver(str);
        }
        getresolutionsize.write(mediaBrowserCompatCustomActionResultReceiver);
        return getShowPopup.INSTANCE;
    }

    static final class RemoteActionCompatParcelizer extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int AudioAttributesCompatParcelizer;
        private Object IconCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            getResolutionSize getresolutionsize;
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.AudioAttributesCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                getResolutionSize getresolutionsize2 = CourseSwitchViewModel.this.AudioAttributesImplApi26Parcelizer;
                this.IconCompatParcelizer = getresolutionsize2;
                this.AudioAttributesCompatParcelizer = 1;
                Object objAudioAttributesImplApi21Parcelizer = CourseSwitchViewModel.this.read.AudioAttributesImplApi21Parcelizer(this);
                if (objAudioAttributesImplApi21Parcelizer == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
                obj = objAudioAttributesImplApi21Parcelizer;
                getresolutionsize = getresolutionsize2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                getresolutionsize = (getResolutionSize) this.IconCompatParcelizer;
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            getresolutionsize.write(obj);
            return getShowPopup.INSTANCE;
        }

        RemoteActionCompatParcelizer(SampleVideos<? super RemoteActionCompatParcelizer> sampleVideos) {
            super(1, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return CourseSwitchViewModel.this.new RemoteActionCompatParcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((RemoteActionCompatParcelizer) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void AudioAttributesImplApi21Parcelizer() {
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new RemoteActionCompatParcelizer(null), new MagicModuleSubmissionRequestBody() { // from class: o.SphericalGLSurfaceViewExternalSyntheticLambda1
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return CourseSwitchViewModel.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, (String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup RemoteActionCompatParcelizer(CourseSwitchViewModel courseSwitchViewModel, String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        courseSwitchViewModel.handleMediaPlayPauseIfPendingOnHandler.write(str);
        return getShowPopup.INSTANCE;
    }
}
