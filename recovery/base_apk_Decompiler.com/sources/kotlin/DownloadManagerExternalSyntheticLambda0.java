package kotlin;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public interface DownloadManagerExternalSyntheticLambda0 extends setRequirements {

    public interface read extends setRequirements, Cloneable {
        DownloadManagerExternalSyntheticLambda0 MediaBrowserCompatMediaItem();

        DownloadManagerExternalSyntheticLambda0 RatingCompat();
    }

    DownloadIndex onPlay();

    int onRemoveQueueItem();

    read onSetPlaybackSpeed();

    read onSetRating();

    void write(DownloadManager downloadManager) throws IOException;
}
