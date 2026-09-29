package kotlin;

import com.marrow.data.api.models.response.lesson.VideoBookmarkTimelineModel;
import com.marrow.data.models.content.VideoInfo;
import com.marrow.ui.activities.learn.video.overlay.OptionItem;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public interface DvbParserClutDefinition {

    public interface AudioAttributesCompatParcelizer extends getBasicChar {
        void AudioAttributesCompatParcelizer(int i);

        void AudioAttributesCompatParcelizer(VideoInfo videoInfo, String str, String str2, boolean z);

        void AudioAttributesCompatParcelizer(ChunkHolder chunkHolder);

        void AudioAttributesImplApi26Parcelizer(String str);

        void AudioAttributesImplBaseParcelizer(String str);

        void IconCompatParcelizer(int i);

        void IconCompatParcelizer(String str);

        void MediaBrowserCompatCustomActionResultReceiver(String str);

        void MediaBrowserCompatItemReceiver(String str);

        int MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();

        void MediaSessionCompatQueueItem();

        void MediaSessionCompatResultReceiverWrapper();

        void MediaSessionCompatToken();

        void ParcelableVolumeInfo();

        void PlaybackStateCompat();

        void PlaybackStateCompatCustomAction();

        void RemoteActionCompatParcelizer(ArrayList<OptionItem> arrayList, String str);

        void ResultReceiver();

        void _init_lambda2();

        void onCommand();

        void onCustomAction();

        void onFastForward();

        void onMediaButtonEvent();

        void onPlay();

        void onPlayFromMediaId();

        void onPlayFromSearch();

        boolean onPrepare();

        void onPrepareFromMediaId();

        void r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw();

        void r8lambdaKUbBm7ckfqTc9QCgukC86fguu4();

        void r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();

        void r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8();

        void read(boolean z);

        void setSessionImpl();

        void write(String str);

        void write(List<VideoBookmarkTimelineModel> list);
    }

    public interface read extends getExtendedEsFrChar {
    }
}
