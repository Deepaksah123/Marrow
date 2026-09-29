package com.marrow.ui.adapter.video.timeline;

import com.airbnb.epoxy.TypedEpoxyController;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.marrow.data.api.models.response.lesson.VideoBookmarkTimelineModel;
import java.util.Iterator;
import java.util.List;
import kotlin.ChunkHolder;
import kotlin.Metadata;
import kotlin.buildAdaptationSet;
import kotlin.lambdagetCues0;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001:\u0001'B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\t\u001a\u00020\b2\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0014¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\rJ\r\u0010\u000f\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0011\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\"\u0010\u0016\u001a\u00020\u00158\u0007@\u0007X\u0087.¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\"\u0010\u001d\u001a\u00020\u001c8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001d\u0010\u001f\"\u0004\b \u0010!R$\u0010#\u001a\u00020\"2\u0006\u0010\u0005\u001a\u00020\"8\u0007@BX\u0087\u000e¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&"}, d2 = {"Lcom/marrow/ui/adapter/video/timeline/BookmarkTimelineModelController;", "Lcom/airbnb/epoxy/TypedEpoxyController;", "", "Lcom/marrow/data/api/models/response/lesson/VideoBookmarkTimelineModel;", "Lcom/marrow/ui/adapter/video/timeline/BookmarkTimelineModelController$AudioAttributesCompatParcelizer;", "p0", "<init>", "(Lcom/marrow/ui/adapter/video/timeline/BookmarkTimelineModelController$AudioAttributesCompatParcelizer;)V", "", "buildModels", "(Ljava/util/List;)V", "", "updateTimelineSelection", "(Ljava/lang/String;)V", "toggleTimelineBookmarkState", "resetCurrentSelectedPosition", "()V", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/marrow/ui/adapter/video/timeline/BookmarkTimelineModelController$AudioAttributesCompatParcelizer;", "getListener", "()Lcom/marrow/ui/adapter/video/timeline/BookmarkTimelineModelController$AudioAttributesCompatParcelizer;", "Lo/ChunkHolder;", "subscriptionDataProvider", "Lo/ChunkHolder;", "getSubscriptionDataProvider", "()Lo/ChunkHolder;", "setSubscriptionDataProvider", "(Lo/ChunkHolder;)V", "", "isConciseModeOn", "Z", "()Z", "setConciseModeOn", "(Z)V", "", "currentSelectedPosition", "I", "getCurrentSelectedPosition", "()I", "AudioAttributesCompatParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class BookmarkTimelineModelController extends TypedEpoxyController<List<? extends VideoBookmarkTimelineModel>> {
    public static final int $stable = 8;
    private int currentSelectedPosition;
    private boolean isConciseModeOn;
    private final AudioAttributesCompatParcelizer listener;
    public ChunkHolder subscriptionDataProvider;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0007\u0010\u0006À\u0006\u0003"}, d2 = {"Lcom/marrow/ui/adapter/video/timeline/BookmarkTimelineModelController$AudioAttributesCompatParcelizer;", "", "Lcom/marrow/data/api/models/response/lesson/VideoBookmarkTimelineModel;", "p0", "", "read", "(Lcom/marrow/data/api/models/response/lesson/VideoBookmarkTimelineModel;)V", "RemoteActionCompatParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface AudioAttributesCompatParcelizer {
        void RemoteActionCompatParcelizer(VideoBookmarkTimelineModel p0);

        void read(VideoBookmarkTimelineModel p0);
    }

    public BookmarkTimelineModelController(AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
        toMagicModuleMetaRepoModel.write(audioAttributesCompatParcelizer, "");
        this.listener = audioAttributesCompatParcelizer;
    }

    @Override // com.airbnb.epoxy.TypedEpoxyController
    public final /* bridge */ /* synthetic */ void buildModels(List<? extends VideoBookmarkTimelineModel> list) {
        buildModels2((List<VideoBookmarkTimelineModel>) list);
    }

    public final AudioAttributesCompatParcelizer getListener() {
        return this.listener;
    }

    public final ChunkHolder getSubscriptionDataProvider() {
        ChunkHolder chunkHolder = this.subscriptionDataProvider;
        if (chunkHolder != null) {
            return chunkHolder;
        }
        toMagicModuleMetaRepoModel.IconCompatParcelizer("");
        return null;
    }

    public final void setSubscriptionDataProvider(ChunkHolder chunkHolder) {
        toMagicModuleMetaRepoModel.write(chunkHolder, "");
        this.subscriptionDataProvider = chunkHolder;
    }

    /* JADX INFO: renamed from: isConciseModeOn, reason: from getter */
    public final boolean getIsConciseModeOn() {
        return this.isConciseModeOn;
    }

    public final void setConciseModeOn(boolean z) {
        this.isConciseModeOn = z;
    }

    public final int getCurrentSelectedPosition() {
        return this.currentSelectedPosition;
    }

    /* JADX INFO: renamed from: buildModels, reason: avoid collision after fix types in other method */
    protected final void buildModels2(List<VideoBookmarkTimelineModel> p0) {
        if (p0 != null) {
            for (VideoBookmarkTimelineModel videoBookmarkTimelineModel : p0) {
                lambdagetCues0 lambdagetcues0 = new lambdagetCues0();
                lambdagetCues0 lambdagetcues02 = lambdagetcues0;
                String timelineId = videoBookmarkTimelineModel.getTimelineId();
                String lessonId = videoBookmarkTimelineModel.getLessonId();
                String filterType = videoBookmarkTimelineModel.getFilterType();
                StringBuilder sb = new StringBuilder();
                sb.append(timelineId);
                sb.append("_");
                sb.append(lessonId);
                sb.append("_");
                sb.append(filterType);
                lambdagetcues02.RemoteActionCompatParcelizer(sb.toString());
                lambdagetcues02.read(buildAdaptationSet.read(getSubscriptionDataProvider(), videoBookmarkTimelineModel.isLessonPaid(), true, videoBookmarkTimelineModel.getSubjectId()));
                lambdagetcues02.read(videoBookmarkTimelineModel);
                lambdagetcues02.read(this.listener);
                lambdagetcues02.RemoteActionCompatParcelizer(this.isConciseModeOn);
                add(lambdagetcues0);
            }
        }
    }

    public final void updateTimelineSelection(String p0) {
        VideoBookmarkTimelineModel videoBookmarkTimelineModel;
        VideoBookmarkTimelineModel videoBookmarkTimelineModel2;
        VideoBookmarkTimelineModel videoBookmarkTimelineModel3;
        VideoBookmarkTimelineModel videoBookmarkTimelineModel4;
        toMagicModuleMetaRepoModel.write(p0, "");
        List<? extends VideoBookmarkTimelineModel> currentData = getCurrentData();
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) ((currentData == null || (videoBookmarkTimelineModel4 = currentData.get(this.currentSelectedPosition)) == null) ? null : videoBookmarkTimelineModel4.getTimelineId()), (Object) p0)) {
            List<? extends VideoBookmarkTimelineModel> currentData2 = getCurrentData();
            if (currentData2 != null && (videoBookmarkTimelineModel3 = currentData2.get(this.currentSelectedPosition)) != null) {
                videoBookmarkTimelineModel3.setSelected(true);
            }
            notifyModelChanged(this.currentSelectedPosition);
            return;
        }
        List<? extends VideoBookmarkTimelineModel> currentData3 = getCurrentData();
        int i = 0;
        if (currentData3 != null && (videoBookmarkTimelineModel2 = currentData3.get(this.currentSelectedPosition)) != null) {
            videoBookmarkTimelineModel2.setSelected(false);
        }
        notifyModelChanged(this.currentSelectedPosition);
        List<? extends VideoBookmarkTimelineModel> currentData4 = getCurrentData();
        if (currentData4 != null) {
            Iterator<? extends VideoBookmarkTimelineModel> it = currentData4.iterator();
            while (it.hasNext()) {
                if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) it.next().getTimelineId(), (Object) p0)) {
                    break;
                } else {
                    i++;
                }
            }
            i = -1;
        } else {
            i = -1;
        }
        if (i != -1) {
            List<? extends VideoBookmarkTimelineModel> currentData5 = getCurrentData();
            if (currentData5 != null && (videoBookmarkTimelineModel = currentData5.get(i)) != null) {
                videoBookmarkTimelineModel.setSelected(true);
            }
            notifyModelChanged(i);
            this.currentSelectedPosition = i;
        }
    }

    public final void toggleTimelineBookmarkState(String p0) {
        int i;
        VideoBookmarkTimelineModel videoBookmarkTimelineModel;
        VideoBookmarkTimelineModel videoBookmarkTimelineModel2;
        toMagicModuleMetaRepoModel.write(p0, "");
        List<? extends VideoBookmarkTimelineModel> currentData = getCurrentData();
        if (currentData != null) {
            Iterator<? extends VideoBookmarkTimelineModel> it = currentData.iterator();
            i = 0;
            while (it.hasNext()) {
                if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) it.next().getTimelineId(), (Object) p0)) {
                    break;
                } else {
                    i++;
                }
            }
            i = -1;
        } else {
            i = -1;
        }
        if (i != -1) {
            List<? extends VideoBookmarkTimelineModel> currentData2 = getCurrentData();
            Integer numValueOf = (currentData2 == null || (videoBookmarkTimelineModel2 = currentData2.get(i)) == null) ? null : Integer.valueOf(videoBookmarkTimelineModel2.getBookmarkType());
            List<? extends VideoBookmarkTimelineModel> currentData3 = getCurrentData();
            if (currentData3 != null && (videoBookmarkTimelineModel = currentData3.get(i)) != null) {
                videoBookmarkTimelineModel.setBookmarkType((numValueOf == null || numValueOf.intValue() != 1) ? 1 : 0);
            }
            notifyModelChanged(i);
        }
    }

    public final void resetCurrentSelectedPosition() {
        this.currentSelectedPosition = 0;
    }
}
