package kotlin;

import com.marrow.R;
import kotlin.setCursorVisible;

/* JADX INFO: loaded from: classes4.dex */
public final class ClockFaceView extends setCursorVisible implements getPlayWhenReady<setCursorVisible.IconCompatParcelizer>, ClockHandView {
    private lambdasetPlaylistMetadata7comgoogleandroidexoplayer2ExoPlayerImpl<ClockFaceView, setCursorVisible.IconCompatParcelizer> AudioAttributesCompatParcelizer;
    private lambdanew2comgoogleandroidexoplayer2ExoPlayerImpl<ClockFaceView, setCursorVisible.IconCompatParcelizer> AudioAttributesImplApi26Parcelizer;
    private lambdaupdateAvailableCommands26comgoogleandroidexoplayer2ExoPlayerImpl<ClockFaceView, setCursorVisible.IconCompatParcelizer> MediaBrowserCompatCustomActionResultReceiver;
    private getTrackSelectionParameters<ClockFaceView, setCursorVisible.IconCompatParcelizer> write;

    @Override // kotlin.getCurrentPeriodIndex
    public final int RemoteActionCompatParcelizer() {
        return R.layout.item_video_subject;
    }

    @Override // kotlin.getPlayWhenReady
    public final /* synthetic */ void IconCompatParcelizer(setCursorVisible.IconCompatParcelizer iconCompatParcelizer, int i) {
        AudioAttributesCompatParcelizer(i);
    }

    @Override // kotlin.getMediaMetadata
    public final /* synthetic */ getCurrentTracks RatingCompat() {
        return MediaMetadataCompat();
    }

    @Override // kotlin.getPlayWhenReady
    public final /* synthetic */ void read(setCursorVisible.IconCompatParcelizer iconCompatParcelizer, int i) {
        write(i);
    }

    @Override // kotlin.getCurrentPeriodIndex
    public final void write(getContentBufferedPosition getcontentbufferedposition) {
        super.write(getcontentbufferedposition);
        read(getcontentbufferedposition);
    }

    private void write(int i) {
        write("The model was changed between being added to the controller and being bound.", i);
    }

    private void AudioAttributesCompatParcelizer(int i) {
        write("The model was changed during the bind call.", i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.ClockHandView
    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public ClockFaceView write(proceedNonBlocking proceednonblocking) {
        AudioAttributesImplBaseParcelizer();
        ((setCursorVisible) this).read = proceednonblocking;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.ClockHandView
    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public ClockFaceView read(setCursorVisible.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
        AudioAttributesImplBaseParcelizer();
        ((setCursorVisible) this).RemoteActionCompatParcelizer = audioAttributesCompatParcelizer;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.getCurrentPeriodIndex
    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public ClockFaceView read(long j) {
        super.read(j);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.ClockHandView
    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ClockFaceView write(CharSequence charSequence) {
        super.write(charSequence);
        return this;
    }

    private static setCursorVisible.IconCompatParcelizer MediaMetadataCompat() {
        return new setCursorVisible.IconCompatParcelizer();
    }

    @Override // kotlin.getCurrentPeriodIndex
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ClockFaceView) || !super.equals(obj)) {
            return false;
        }
        ClockFaceView clockFaceView = (ClockFaceView) obj;
        getTrackSelectionParameters<ClockFaceView, setCursorVisible.IconCompatParcelizer> gettrackselectionparameters = clockFaceView.write;
        lambdasetPlaylistMetadata7comgoogleandroidexoplayer2ExoPlayerImpl<ClockFaceView, setCursorVisible.IconCompatParcelizer> lambdasetplaylistmetadata7comgoogleandroidexoplayer2exoplayerimpl = clockFaceView.AudioAttributesCompatParcelizer;
        lambdaupdateAvailableCommands26comgoogleandroidexoplayer2ExoPlayerImpl<ClockFaceView, setCursorVisible.IconCompatParcelizer> lambdaupdateavailablecommands26comgoogleandroidexoplayer2exoplayerimpl = clockFaceView.MediaBrowserCompatCustomActionResultReceiver;
        lambdanew2comgoogleandroidexoplayer2ExoPlayerImpl<ClockFaceView, setCursorVisible.IconCompatParcelizer> lambdanew2comgoogleandroidexoplayer2exoplayerimpl = clockFaceView.AudioAttributesImplApi26Parcelizer;
        if (((setCursorVisible) this).read == null ? ((setCursorVisible) clockFaceView).read == null : ((setCursorVisible) this).read.equals(((setCursorVisible) clockFaceView).read)) {
            return ((setCursorVisible) this).RemoteActionCompatParcelizer == null ? ((setCursorVisible) clockFaceView).RemoteActionCompatParcelizer == null : ((setCursorVisible) this).RemoteActionCompatParcelizer.equals(((setCursorVisible) clockFaceView).RemoteActionCompatParcelizer);
        }
        return false;
    }

    @Override // kotlin.getCurrentPeriodIndex
    public final int hashCode() {
        int iHashCode = super.hashCode();
        return (((iHashCode * 28629151) + (((setCursorVisible) this).read != null ? ((setCursorVisible) this).read.hashCode() : 0)) * 31) + (((setCursorVisible) this).RemoteActionCompatParcelizer != null ? ((setCursorVisible) this).RemoteActionCompatParcelizer.hashCode() : 0);
    }

    @Override // kotlin.getCurrentPeriodIndex
    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoSubjectsModel_{subjectInfo=");
        sb.append(((setCursorVisible) this).read);
        sb.append(", subjectClickListener=");
        sb.append(((setCursorVisible) this).RemoteActionCompatParcelizer);
        sb.append("}");
        sb.append(super.toString());
        return sb.toString();
    }
}
