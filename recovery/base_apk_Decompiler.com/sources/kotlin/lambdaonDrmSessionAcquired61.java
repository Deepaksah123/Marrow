package kotlin;

import com.google.android.exoplayer2.DeviceInfo;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.MediaMetadata;
import com.google.android.exoplayer2.PlaybackException;
import com.google.android.exoplayer2.PlaybackParameters;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.Tracks;
import com.google.android.exoplayer2.audio.AudioAttributes;
import com.google.android.exoplayer2.text.Cue;
import com.google.android.exoplayer2.text.CueGroup;
import com.google.android.exoplayer2.trackselection.TrackSelectionParameters;
import com.google.android.exoplayer2.video.VideoSize;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class lambdaonDrmSessionAcquired61 implements Player.Listener {
    @Override // com.google.android.exoplayer2.Player.Listener
    public void onAudioSessionIdChanged(int i) {
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public void onDeviceVolumeChanged(int i, boolean z) {
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public void onIsLoadingChanged(boolean z) {
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public void onIsPlayingChanged(boolean z) {
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public void onMaxSeekToPreviousPositionChanged(long j) {
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public void onMediaItemTransition(MediaItem mediaItem, int i) {
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public void onPlayWhenReadyChanged(boolean z, int i) {
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public void onPlaybackSuppressionReasonChanged(int i) {
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public void onPlayerErrorChanged(PlaybackException playbackException) {
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public void onPlayerStateChanged(boolean z, int i) {
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public void onPositionDiscontinuity(int i) {
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public void onRenderedFirstFrame() {
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public void onRepeatModeChanged(int i) {
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public void onSeekBackIncrementChanged(long j) {
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public void onSeekForwardIncrementChanged(long j) {
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public void onShuffleModeEnabledChanged(boolean z) {
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public void onSkipSilenceEnabledChanged(boolean z) {
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public void onSurfaceSizeChanged(int i, int i2) {
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public void onVolumeChanged(float f) {
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public void onAudioAttributesChanged(AudioAttributes audioAttributes) {
        toMagicModuleMetaRepoModel.write(audioAttributes, "");
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public void onAvailableCommandsChanged(Player.Commands commands) {
        toMagicModuleMetaRepoModel.write(commands, "");
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public void onCues(CueGroup cueGroup) {
        toMagicModuleMetaRepoModel.write(cueGroup, "");
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public void onCues(List<Cue> list) {
        toMagicModuleMetaRepoModel.write(list, "");
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public void onDeviceInfoChanged(DeviceInfo deviceInfo) {
        toMagicModuleMetaRepoModel.write(deviceInfo, "");
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public void onEvents(Player player, Player.Events events) {
        toMagicModuleMetaRepoModel.write(player, "");
        toMagicModuleMetaRepoModel.write(events, "");
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public void onMediaMetadataChanged(MediaMetadata mediaMetadata) {
        toMagicModuleMetaRepoModel.write(mediaMetadata, "");
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public void onMetadata(com.google.android.exoplayer2.metadata.Metadata metadata) {
        toMagicModuleMetaRepoModel.write(metadata, "");
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public void onPlaybackParametersChanged(PlaybackParameters playbackParameters) {
        toMagicModuleMetaRepoModel.write(playbackParameters, "");
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public void onPlayerError(PlaybackException playbackException) {
        toMagicModuleMetaRepoModel.write(playbackException, "");
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public void onPlaylistMetadataChanged(MediaMetadata mediaMetadata) {
        toMagicModuleMetaRepoModel.write(mediaMetadata, "");
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public void onPositionDiscontinuity(Player.PositionInfo positionInfo, Player.PositionInfo positionInfo2, int i) {
        toMagicModuleMetaRepoModel.write(positionInfo, "");
        toMagicModuleMetaRepoModel.write(positionInfo2, "");
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public void onTimelineChanged(Timeline timeline, int i) {
        toMagicModuleMetaRepoModel.write(timeline, "");
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public void onTrackSelectionParametersChanged(TrackSelectionParameters trackSelectionParameters) {
        toMagicModuleMetaRepoModel.write(trackSelectionParameters, "");
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public void onTracksChanged(Tracks tracks) {
        toMagicModuleMetaRepoModel.write(tracks, "");
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public void onVideoSizeChanged(VideoSize videoSize) {
        toMagicModuleMetaRepoModel.write(videoSize, "");
    }
}
