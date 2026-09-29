package kotlin;

import com.marrow.data.models.content.VideoInfo;
import com.marrow.data.models.lesson.LessonIndex;
import com.marrow.data.models.lesson.tab.LessonTabItem;
import com.marrow.data.models.video.DownloadableResolution;
import com.marrow.data.models.video.cache.VideoCacheInfo;
import com.marrow.ui.fragments.learn.model.ActiveRecallQbankLessonUiModel;
import com.marrow2.ui.qbank.score.model.RevisionSubjectUIModel;
import com.marrow2.ui.video.downloaded_videos.model.MaxDownloadReachedArgs;
import java.util.List;
import kotlin.requestPlayPauseAccessibilityFocus;

/* JADX INFO: loaded from: classes3.dex */
public interface parseAlignment {

    public interface AudioAttributesCompatParcelizer extends getNextEventTime {
        void AudioAttributesImplApi21Parcelizer(String str);

        void AudioAttributesImplBaseParcelizer(String str);

        void addMenuProvider();
    }

    public interface RemoteActionCompatParcelizer {
        void AudioAttributesCompatParcelizer(String str, String str2);

        void RemoteActionCompatParcelizer(String str, VideoInfo videoInfo);

        boolean r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8();

        void write(String str, String str2);
    }

    public interface write extends getBasicChar {
        void AudioAttributesCompatParcelizer(int i);

        void AudioAttributesCompatParcelizer(int i, String str);

        void AudioAttributesCompatParcelizer(LessonIndex lessonIndex);

        void AudioAttributesCompatParcelizer(RevisionSubjectUIModel revisionSubjectUIModel);

        void AudioAttributesCompatParcelizer(boolean z);

        void AudioAttributesCompatParcelizer(boolean z, int i);

        void AudioAttributesImplApi26Parcelizer(int i);

        void AudioAttributesImplApi26Parcelizer(String str);

        void AudioAttributesImplBaseParcelizer(int i);

        void IconCompatParcelizer(int i);

        void IconCompatParcelizer(int i, int i2, maybeSkipComment maybeskipcomment);

        void IconCompatParcelizer(MaxDownloadReachedArgs maxDownloadReachedArgs);

        void IconCompatParcelizer(String str);

        void IconCompatParcelizer(String str, int i, String str2, String str3);

        void IconCompatParcelizer(String str, String str2);

        void IconCompatParcelizer(String str, boolean z, int i, SubtitleDecoderFactory1 subtitleDecoderFactory1, List<? extends LessonTabItem<?>> list, ActiveRecallQbankLessonUiModel activeRecallQbankLessonUiModel);

        void MediaBrowserCompatCustomActionResultReceiver(String str);

        void MediaBrowserCompatItemReceiver(int i);

        void MediaBrowserCompatItemReceiver(String str);

        void MediaBrowserCompatItemReceiver(boolean z);

        void MediaBrowserCompatMediaItem(String str);

        void MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();

        void MediaSessionCompatQueueItem();

        void MediaSessionCompatResultReceiverWrapper();

        void MediaSessionCompatToken();

        void ParcelableVolumeInfo();

        void PlaybackStateCompat();

        void PlaybackStateCompatCustomAction();

        void RatingCompat(String str);

        void RemoteActionCompatParcelizer(float f, int i);

        void RemoteActionCompatParcelizer(String str, int i, int i2, int i3, int i4);

        void RemoteActionCompatParcelizer(String str, boolean z);

        void RemoteActionCompatParcelizer(boolean z);

        boolean RemoteActionCompatParcelizer(VideoCacheInfo videoCacheInfo);

        void ResultReceiver();

        boolean _init_lambda2();

        boolean _init_lambda3();

        boolean _init_lambda4();

        boolean _init_lambda5();

        void accessaddObserverForBackInvoker();

        void accessensureViewModelStore();

        void accessgetReportFullyDrawnExecutorp();

        void addContentView();

        void addObserverForBackInvokerlambda7();

        void addOnConfigurationChangedListener();

        void addOnContextAvailableListener();

        void addOnMultiWindowModeChangedListener();

        void addOnNewIntentListener();

        void addOnPictureInPictureModeChangedListener();

        void addOnTrimMemoryListener();

        void addOnUserLeaveHintListener();

        void createFullyDrawnExecutor();

        void ensureViewModelStore();

        void getOnBackPressedDispatcherannotations();

        void getSavedStateRegistryControllerannotations();

        void menuHostHelperlambda0();

        void onActivityResult();

        void onConfigurationChanged();

        void onCreate();

        void onCreatePanelMenu();

        void onCustomAction();

        void onFastForward();

        void onMediaButtonEvent();

        void onMenuItemSelected();

        void onMultiWindowModeChanged();

        void onNewIntent();

        void onPanelClosed();

        void onPictureInPictureModeChanged();

        void onPlay();

        void onPlayFromMediaId();

        void onPlayFromSearch();

        int onPrepare();

        requestPlayPauseAccessibilityFocus.RemoteActionCompatParcelizer onPrepareFromMediaId();

        void onPreparePanel();

        void onRequestPermissionsResult();

        void onSaveInstanceState();

        void onTrimMemory();

        void r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw();

        boolean r8lambdaKUbBm7ckfqTc9QCgukC86fguu4();

        void r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();

        boolean r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();

        boolean r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0();

        void read(int i);

        void read(ActiveRecallQbankLessonUiModel activeRecallQbankLessonUiModel);

        void read(String str, int i);

        void read(String str, String str2);

        void read(List<DownloadableResolution> list, int i, List<String> list2);

        void read(boolean z);

        void registerForActivityResult();

        void removeMenuProvider();

        void removeOnConfigurationChangedListener();

        void removeOnContextAvailableListener();

        void removeOnMultiWindowModeChangedListener();

        void setSessionImpl();

        void write(VideoInfo videoInfo, String str, String str2, boolean z);

        void write(String str);

        void write(String str, int i, String str2);

        void write(maybeSkipWhitespace maybeskipwhitespace, int i, int i2, maybeSkipComment maybeskipcomment);

        void write(boolean z);
    }

    public interface IconCompatParcelizer extends getExtendedEsFrChar {
        void AudioAttributesCompatParcelizer(boolean z);

        void RemoteActionCompatParcelizer(boolean z);
    }
}
