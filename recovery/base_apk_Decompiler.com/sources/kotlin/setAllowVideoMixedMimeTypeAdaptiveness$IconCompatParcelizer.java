package kotlin;

import com.google.android.exoplayer2.SimpleExoPlayer;
import com.marrow.data.api.models.response.lesson.InteractiveMcqOption;
import com.marrow.data.models.video.ThemeState;
import com.marrow.data.models.video.Timeline;
import com.marrow.ui.activities.learn.video.overlay.SettingsItem;
import com.marrow.ui.activities.learn.video.overlay.VideoTimelineItem;
import com.marrow.ui.fragments.learn.model.ActiveRecallQbankLessonUiModel;
import com.marrow.ui.views.DefaultTimeBar;
import java.util.ArrayList;
import java.util.List;
import kotlin.getSaveProfileModel;

/* JADX INFO: loaded from: classes3.dex */
public interface setAllowVideoMixedMimeTypeAdaptiveness$IconCompatParcelizer extends getSaveProfileModel.RemoteActionCompatParcelizer<SimpleExoPlayer> {
    void AudioAttributesCompatParcelizer(float f, float f2);

    void AudioAttributesCompatParcelizer(int i);

    void AudioAttributesCompatParcelizer(long j);

    void AudioAttributesCompatParcelizer(String str, String str2);

    void AudioAttributesCompatParcelizer(setViewportSize setviewportsize);

    void AudioAttributesCompatParcelizer(boolean z);

    void AudioAttributesCompatParcelizer(boolean z, int i, int i2, int i3, int i4);

    void AudioAttributesCompatParcelizer(DefaultTimeBar.RemoteActionCompatParcelizer[] remoteActionCompatParcelizerArr);

    void AudioAttributesCompatParcelizer(String[] strArr, ThemeState themeState);

    void AudioAttributesCompatParcelizer(boolean[] zArr);

    void AudioAttributesImplApi21Parcelizer(String str);

    void AudioAttributesImplApi21Parcelizer(boolean z);

    void AudioAttributesImplApi26Parcelizer();

    void AudioAttributesImplApi26Parcelizer(String str);

    void AudioAttributesImplApi26Parcelizer(boolean z);

    void AudioAttributesImplBaseParcelizer();

    void IconCompatParcelizer();

    void IconCompatParcelizer(float f);

    void IconCompatParcelizer(String str);

    void IconCompatParcelizer(String str, int i, SubtitleDecoderFactory1 subtitleDecoderFactory1, long j);

    void IconCompatParcelizer(String str, boolean z);

    void IconCompatParcelizer(boolean z);

    void MediaBrowserCompatCustomActionResultReceiver();

    void MediaBrowserCompatCustomActionResultReceiver(String str);

    void MediaBrowserCompatCustomActionResultReceiver(boolean z);

    void MediaBrowserCompatItemReceiver();

    void MediaBrowserCompatItemReceiver(String str);

    void MediaBrowserCompatItemReceiver(boolean z);

    void MediaBrowserCompatSearchResultReceiver();

    void MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();

    void MediaDescriptionCompat();

    void MediaMetadataCompat();

    void MediaSessionCompatQueueItem();

    void MediaSessionCompatResultReceiverWrapper();

    void MediaSessionCompatToken();

    void ParcelableVolumeInfo();

    void PlaybackStateCompat();

    void PlaybackStateCompatCustomAction();

    void RatingCompat();

    void RemoteActionCompatParcelizer(float f);

    void RemoteActionCompatParcelizer(ActiveRecallQbankLessonUiModel activeRecallQbankLessonUiModel);

    void RemoteActionCompatParcelizer(String str);

    void RemoteActionCompatParcelizer(String str, ThemeState themeState);

    void RemoteActionCompatParcelizer(List<InteractiveMcqOption> list, InteractiveMcqOption interactiveMcqOption, InteractiveMcqOption interactiveMcqOption2, boolean z);

    void RemoteActionCompatParcelizer(DefaultTimeBar.AudioAttributesCompatParcelizer[] audioAttributesCompatParcelizerArr);

    void RemoteActionCompatParcelizer(String[] strArr, ThemeState themeState);

    void ResultReceiver();

    void _init_lambda2();

    void _init_lambda3();

    void _init_lambda4();

    void _init_lambda5();

    void accessaddObserverForBackInvoker();

    void accessensureViewModelStore();

    void accessgetReportFullyDrawnExecutorp();

    void accessonBackPresseds1027565324();

    void addObserverForBackInvoker();

    void addObserverForBackInvokerlambda7();

    void createFullyDrawnExecutor();

    void ensureViewModelStore();

    void handleMediaPlayPauseIfPendingOnHandler();

    void onAddQueueItem();

    void onCommand();

    void onCustomAction();

    void onFastForward();

    void onMediaButtonEvent();

    void onPlay();

    void onPlayFromMediaId();

    void onPlayFromSearch();

    void onPlayFromUri();

    void onPrepare();

    void onPrepareFromMediaId();

    void onPrepareFromSearch();

    void onPrepareFromUri();

    void onRemoveQueueItem();

    void onRewind();

    void onSeekTo();

    void onSetCaptioningEnabled();

    void onSetRating();

    void onSetRepeatMode();

    void onSetShuffleMode();

    void onSkipToNext();

    boolean onSkipToPrevious();

    boolean onSkipToQueueItem();

    void r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw();

    void r8lambdaKUbBm7ckfqTc9QCgukC86fguu4();

    void r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();

    void r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();

    void r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8();

    void r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0();

    void read(int i);

    void read(String str, String str2);

    void read(boolean z);

    void setSessionImpl();

    void write(Timeline timeline, boolean z, boolean z2);

    void write(String str);

    void write(String str, String str2);

    void write(ArrayList<SettingsItem> arrayList, Boolean bool);

    void write(ArrayList<VideoTimelineItem> arrayList, boolean z, boolean z2, String str, String str2, String str3, String str4, boolean z3);

    void write(boolean z);

    void write(boolean z, setViewportSize setviewportsize);

    void write(boolean z, boolean z2);
}
