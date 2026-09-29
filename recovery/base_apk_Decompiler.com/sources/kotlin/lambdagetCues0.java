package kotlin;

import com.marrow.R;
import com.marrow.data.api.models.response.lesson.VideoBookmarkTimelineModel;
import com.marrow.ui.adapter.video.timeline.BookmarkTimelineModelController;
import kotlin.parseTimestampUs;

/* JADX INFO: loaded from: classes3.dex */
public final class lambdagetCues0 extends parseTimestampUs implements getPlayWhenReady<parseTimestampUs.IconCompatParcelizer>, addCheckpoint {
    private getTrackSelectionParameters<lambdagetCues0, parseTimestampUs.IconCompatParcelizer> AudioAttributesCompatParcelizer;
    private lambdanew2comgoogleandroidexoplayer2ExoPlayerImpl<lambdagetCues0, parseTimestampUs.IconCompatParcelizer> AudioAttributesImplApi21Parcelizer;
    private lambdaupdateAvailableCommands26comgoogleandroidexoplayer2ExoPlayerImpl<lambdagetCues0, parseTimestampUs.IconCompatParcelizer> AudioAttributesImplBaseParcelizer;
    private lambdasetPlaylistMetadata7comgoogleandroidexoplayer2ExoPlayerImpl<lambdagetCues0, parseTimestampUs.IconCompatParcelizer> read;

    @Override // kotlin.getCurrentPeriodIndex
    public final int RemoteActionCompatParcelizer() {
        return R.layout.layout_bookmark_timeline;
    }

    @Override // kotlin.getPlayWhenReady
    public final /* bridge */ /* synthetic */ void IconCompatParcelizer(parseTimestampUs.IconCompatParcelizer iconCompatParcelizer, int i) {
        IconCompatParcelizer(i);
    }

    @Override // kotlin.getMediaMetadata
    public final /* synthetic */ getCurrentTracks RatingCompat() {
        return MediaBrowserCompatMediaItem();
    }

    @Override // kotlin.getPlayWhenReady
    public final /* synthetic */ void read(parseTimestampUs.IconCompatParcelizer iconCompatParcelizer, int i) {
        AudioAttributesCompatParcelizer(i);
    }

    @Override // kotlin.getCurrentPeriodIndex
    public final void write(getContentBufferedPosition getcontentbufferedposition) {
        super.write(getcontentbufferedposition);
        read(getcontentbufferedposition);
    }

    private void AudioAttributesCompatParcelizer(int i) {
        write("The model was changed between being added to the controller and being bound.", i);
    }

    private void IconCompatParcelizer(int i) {
        write("The model was changed during the bind call.", i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.addCheckpoint
    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public lambdagetCues0 read(VideoBookmarkTimelineModel videoBookmarkTimelineModel) {
        AudioAttributesImplBaseParcelizer();
        ((parseTimestampUs) this).RemoteActionCompatParcelizer = videoBookmarkTimelineModel;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.addCheckpoint
    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public lambdagetCues0 read(BookmarkTimelineModelController.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
        AudioAttributesImplBaseParcelizer();
        this.write = audioAttributesCompatParcelizer;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.addCheckpoint
    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: merged with bridge method [inline-methods] */
    public lambdagetCues0 read(boolean z) {
        AudioAttributesImplBaseParcelizer();
        super.write(z);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.addCheckpoint
    /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public lambdagetCues0 RemoteActionCompatParcelizer(boolean z) {
        AudioAttributesImplBaseParcelizer();
        super.AudioAttributesCompatParcelizer(z);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.getCurrentPeriodIndex
    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public lambdagetCues0 read(long j) {
        super.read(j);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.addCheckpoint
    /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public lambdagetCues0 RemoteActionCompatParcelizer(CharSequence charSequence) {
        super.write(charSequence);
        return this;
    }

    private static parseTimestampUs.IconCompatParcelizer MediaBrowserCompatMediaItem() {
        return new parseTimestampUs.IconCompatParcelizer();
    }

    @Override // kotlin.getCurrentPeriodIndex
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof lambdagetCues0) || !super.equals(obj)) {
            return false;
        }
        lambdagetCues0 lambdagetcues0 = (lambdagetCues0) obj;
        getTrackSelectionParameters<lambdagetCues0, parseTimestampUs.IconCompatParcelizer> gettrackselectionparameters = lambdagetcues0.AudioAttributesCompatParcelizer;
        lambdasetPlaylistMetadata7comgoogleandroidexoplayer2ExoPlayerImpl<lambdagetCues0, parseTimestampUs.IconCompatParcelizer> lambdasetplaylistmetadata7comgoogleandroidexoplayer2exoplayerimpl = lambdagetcues0.read;
        lambdaupdateAvailableCommands26comgoogleandroidexoplayer2ExoPlayerImpl<lambdagetCues0, parseTimestampUs.IconCompatParcelizer> lambdaupdateavailablecommands26comgoogleandroidexoplayer2exoplayerimpl = lambdagetcues0.AudioAttributesImplBaseParcelizer;
        lambdanew2comgoogleandroidexoplayer2ExoPlayerImpl<lambdagetCues0, parseTimestampUs.IconCompatParcelizer> lambdanew2comgoogleandroidexoplayer2exoplayerimpl = lambdagetcues0.AudioAttributesImplApi21Parcelizer;
        if (((parseTimestampUs) this).RemoteActionCompatParcelizer == null ? ((parseTimestampUs) lambdagetcues0).RemoteActionCompatParcelizer != null : !((parseTimestampUs) this).RemoteActionCompatParcelizer.equals(((parseTimestampUs) lambdagetcues0).RemoteActionCompatParcelizer)) {
            return false;
        }
        if (this.write == null ? lambdagetcues0.write == null : this.write.equals(lambdagetcues0.write)) {
            return MediaDescriptionCompat() == lambdagetcues0.MediaDescriptionCompat() && MediaMetadataCompat() == lambdagetcues0.MediaMetadataCompat();
        }
        return false;
    }

    @Override // kotlin.getCurrentPeriodIndex
    public final int hashCode() {
        int iHashCode = super.hashCode();
        return (((((((iHashCode * 28629151) + (((parseTimestampUs) this).RemoteActionCompatParcelizer != null ? ((parseTimestampUs) this).RemoteActionCompatParcelizer.hashCode() : 0)) * 31) + (this.write != null ? this.write.hashCode() : 0)) * 31) + (MediaDescriptionCompat() ? 1 : 0)) * 31) + (MediaMetadataCompat() ? 1 : 0);
    }

    @Override // kotlin.getCurrentPeriodIndex
    public final String toString() {
        StringBuilder sb = new StringBuilder("BookmarkTimelineModel_{timeline=");
        sb.append(((parseTimestampUs) this).RemoteActionCompatParcelizer);
        sb.append(", listener=");
        sb.append(this.write);
        sb.append(", hasAccess=");
        sb.append(MediaDescriptionCompat());
        sb.append(", conciseModeStatus=");
        sb.append(MediaMetadataCompat());
        sb.append("}");
        sb.append(super.toString());
        return sb.toString();
    }
}
