package kotlin;

import com.marrow.data.api.models.response.lesson.VideoBookmarkTimeline;
import com.marrow.data.api.models.response.lesson.VideoBookmarkTimelineModel;
import com.marrow.data.models.subject.SubjectFilterModel;
import com.marrow.data.models.video.Timeline;
import kotlin.newSampleStreamArray;
import kotlin.parseCea708AccessibilityChannel;

/* JADX INFO: loaded from: classes3.dex */
public final class embeddedClosedCaptionTrack implements newSampleStreamArray.IconCompatParcelizer {
    private final getStreamPositionUsForContent AudioAttributesCompatParcelizer;
    private final DefaultDashChunkSourceRepresentationHolder IconCompatParcelizer;
    private final updateSelectedBaseUrl read;
    private final getLastAvailableSegmentNum write;

    public embeddedClosedCaptionTrack(updateSelectedBaseUrl updateselectedbaseurl, getStreamPositionUsForContent getstreampositionusforcontent, DefaultDashChunkSourceRepresentationHolder defaultDashChunkSourceRepresentationHolder, getLastAvailableSegmentNum getlastavailablesegmentnum) {
        toMagicModuleMetaRepoModel.write(updateselectedbaseurl, "");
        toMagicModuleMetaRepoModel.write(getstreampositionusforcontent, "");
        toMagicModuleMetaRepoModel.write(defaultDashChunkSourceRepresentationHolder, "");
        toMagicModuleMetaRepoModel.write(getlastavailablesegmentnum, "");
        this.read = updateselectedbaseurl;
        this.AudioAttributesCompatParcelizer = getstreampositionusforcontent;
        this.IconCompatParcelizer = defaultDashChunkSourceRepresentationHolder;
        this.write = getlastavailablesegmentnum;
    }

    @Override // o.newSampleStreamArray.IconCompatParcelizer
    public final accessgetEmptyStatecp<SubjectFilterModel[]> RemoteActionCompatParcelizer() {
        accessgetEmptyStatecp<SubjectFilterModel[]> accessgetemptystatecpAudioAttributesCompatParcelizer = parseCea708AccessibilityChannel.AudioAttributesCompatParcelizer(new parseCea708AccessibilityChannel.RemoteActionCompatParcelizer() { // from class: o.DashMediaPeriodTrackGroupInfo
            @Override // o.parseCea708AccessibilityChannel.RemoteActionCompatParcelizer
            public final Object write() {
                return embeddedClosedCaptionTrack.IconCompatParcelizer(this.AudioAttributesCompatParcelizer);
            }
        });
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(accessgetemptystatecpAudioAttributesCompatParcelizer, "");
        return accessgetemptystatecpAudioAttributesCompatParcelizer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SubjectFilterModel[] IconCompatParcelizer(embeddedClosedCaptionTrack embeddedclosedcaptiontrack) {
        return embeddedclosedcaptiontrack.read.AudioAttributesCompatParcelizer();
    }

    @Override // o.newSampleStreamArray.IconCompatParcelizer
    public final int write() {
        return this.read.IconCompatParcelizer(this.AudioAttributesCompatParcelizer.onPrepareFromUri());
    }

    @Override // o.newSampleStreamArray.IconCompatParcelizer
    public final VideoBookmarkTimelineModel[] IconCompatParcelizer(String str) {
        return this.read.read(str, this.AudioAttributesCompatParcelizer.onPrepareFromUri());
    }

    @Override // o.newSampleStreamArray.IconCompatParcelizer
    public final VideoBookmarkTimeline AudioAttributesCompatParcelizer(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return this.read.AudioAttributesCompatParcelizer("_id =?  AND start_time IS NOT NULL ", new String[]{str}, (String) null);
    }

    @Override // o.newSampleStreamArray.IconCompatParcelizer
    public final void IconCompatParcelizer() {
        this.IconCompatParcelizer.write(this.AudioAttributesCompatParcelizer.onPrepareFromUri());
    }

    @Override // o.newSampleStreamArray.IconCompatParcelizer
    public final int AudioAttributesCompatParcelizer() {
        return this.IconCompatParcelizer.IconCompatParcelizer(this.AudioAttributesCompatParcelizer.onPrepareFromUri());
    }

    @Override // o.newSampleStreamArray.IconCompatParcelizer
    public final Timeline[] RemoteActionCompatParcelizer(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return this.read.AudioAttributesImplApi26Parcelizer(str);
    }
}
