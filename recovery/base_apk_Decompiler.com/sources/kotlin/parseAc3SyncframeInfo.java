package kotlin;

/* JADX INFO: loaded from: classes2.dex */
public final class parseAc3SyncframeInfo implements parseAc3AnnexFFormat {
    private DefaultAudioTrackBufferSizeProvider IconCompatParcelizer;
    private parseGaSpecificConfig RemoteActionCompatParcelizer = new parseGaSpecificConfig();

    public parseAc3SyncframeInfo(DefaultAudioTrackBufferSizeProvider defaultAudioTrackBufferSizeProvider) {
        this.IconCompatParcelizer = defaultAudioTrackBufferSizeProvider;
    }

    @Override // kotlin.parseAc3AnnexFFormat
    public final byte[] read(byte[] bArr) {
        throw new NotImplementedError(null, 1, null);
    }

    @Override // kotlin.parseAc3AnnexFFormat
    public final byte[] RemoteActionCompatParcelizer(byte[] bArr) {
        Object obj;
        DefaultAudioSinkApi31 defaultAudioSinkApi31Write = DefaultAudioSinkConfiguration.write(onProcessedStreamChange.read(new onForeground(bArr)));
        if (defaultAudioSinkApi31Write instanceof Ac4Util) {
            PlaybackStatsListenerPlaybackStatsTracker playbackStatsListenerPlaybackStatsTracker = (PlaybackStatsListenerPlaybackStatsTracker) ((Ac4Util) defaultAudioSinkApi31Write).RemoteActionCompatParcelizer;
            defaultAudioSinkApi31Write = !playbackStatsListenerPlaybackStatsTracker.read ? new Ac4Util(playbackStatsListenerPlaybackStatsTracker.RemoteActionCompatParcelizer) : onProcessedStreamChange.read(new throwExceptionIfDeadlineIsReached(playbackStatsListenerPlaybackStatsTracker.RemoteActionCompatParcelizer));
        } else if (!(defaultAudioSinkApi31Write instanceof codecNeedsDiscardChannelsWorkaround)) {
            throw new RenewEligibleCreator();
        }
        if (defaultAudioSinkApi31Write instanceof Ac4Util) {
            obj = ((Ac4Util) defaultAudioSinkApi31Write).RemoteActionCompatParcelizer;
        } else {
            if (!(defaultAudioSinkApi31Write instanceof codecNeedsDiscardChannelsWorkaround)) {
                throw new RenewEligibleCreator();
            }
            obj = new byte[0];
        }
        return (byte[]) obj;
    }
}
