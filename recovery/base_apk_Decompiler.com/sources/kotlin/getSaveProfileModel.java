package kotlin;

import com.marrow.data.models.ResponseError;
import com.marrow.data.models.video.ThemeState;
import com.marrow.ui.activities.learn.video.overlay.OptionItem;
import com.medengage.video.custom.UiPixelRateModel;
import java.util.ArrayList;
import kotlin.requestPlayPauseAccessibilityFocus;
import kotlin.setUnderlineSpan;

/* JADX INFO: loaded from: classes4.dex */
public interface getSaveProfileModel {

    /* JADX INFO: loaded from: classes5.dex */
    public interface AudioAttributesCompatParcelizer {
        public static final String[] read = {"0.75x", "1x", "1.2x", "1.5x", "1.8x", "2x", "2.5x(Beta)", "3x(Beta)"};
        public static final String[] write = {"5 seconds", "10 seconds", "15 seconds"};
        public static final int[] IconCompatParcelizer = {5, 10, 15};
        public static final Integer[] RemoteActionCompatParcelizer = {0, 3};
    }

    public interface IconCompatParcelizer extends getExtendedEsFrChar, RtspMediaTrack, setUnderlineSpan.IconCompatParcelizer {
        void AudioAttributesCompatParcelizer(ResponseError responseError);

        void AudioAttributesCompatParcelizer(String str);

        void AudioAttributesCompatParcelizer(String str, String str2);

        void AudioAttributesImplBaseParcelizer(boolean z);

        void IconCompatParcelizer(long j, String str);

        void IconCompatParcelizer(ResponseError responseError);

        void IconCompatParcelizer(String str, int i, String str2);

        void MediaBrowserCompatCustomActionResultReceiver(boolean z);

        void MediaBrowserCompatMediaItem(boolean z);

        void MediaBrowserCompatSearchResultReceiver(boolean z);

        void MediaDescriptionCompat(boolean z);

        void MediaMetadataCompat(boolean z);

        void MediaSessionCompatQueueItem();

        void MediaSessionCompatResultReceiverWrapper();

        int MediaSessionCompatToken();

        void ParcelableVolumeInfo();

        void PlaybackStateCompatCustomAction();

        void RatingCompat(boolean z);

        void RemoteActionCompatParcelizer(String str, String str2);

        void ResultReceiver();

        void _init_lambda2();

        void _init_lambda3();

        void _init_lambda5();

        void accessaddObserverForBackInvoker();

        setViewportSize onRewind();

        void onSeekTo();

        void onSetPlaybackSpeed();

        void onSkipToPrevious();

        void r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw();

        void r8lambdaKUbBm7ckfqTc9QCgukC86fguu4();

        void r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();

        void r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();

        void r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8();

        void r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0();

        void read(String str);

        void read(String str, boolean z);

        void setSessionImpl();

        void write(UiPixelRateModel uiPixelRateModel, PlayerNotificationManager1 playerNotificationManager1);

        void write(setViewportSize setviewportsize);
    }

    public interface RemoteActionCompatParcelizer<T> extends getSpecialNorthAmericanChar {
        void AudioAttributesCompatParcelizer(ResponseError responseError, String str, Boolean bool);

        void AudioAttributesCompatParcelizer(ThemeState themeState);

        void AudioAttributesCompatParcelizer(String str, String str2, String str3);

        void AudioAttributesCompatParcelizer(Finalizer finalizer);

        void AudioAttributesImplApi21Parcelizer(String str, String str2);

        void AudioAttributesImplBaseParcelizer(String str);

        void AudioAttributesImplBaseParcelizer(boolean z);

        void IconCompatParcelizer(String str, String str2);

        void IconCompatParcelizer(ArrayList<OptionItem> arrayList, OptionItem.ResolutionOptionItem resolutionOptionItem, Boolean bool);

        void IconCompatParcelizer(ArrayList<OptionItem> arrayList, OptionItem.SeekOptionItem seekOptionItem, Boolean bool);

        void IconCompatParcelizer(Finalizer finalizer);

        void IconCompatParcelizer(boolean z, boolean z2);

        void MediaBrowserCompatCustomActionResultReceiver(String str, String str2);

        void MediaBrowserCompatItemReceiver(String str, String str2);

        void MediaBrowserCompatMediaItem(boolean z);

        void MediaBrowserCompatSearchResultReceiver(String str);

        void MediaDescriptionCompat(String str);

        void MediaDescriptionCompat(boolean z);

        void MediaMetadataCompat(String str);

        void RatingCompat(String str);

        void RemoteActionCompatParcelizer(float f, String str);

        void addContentView();

        void addMenuProvider();

        String addOnPictureInPictureModeChangedListener();

        int getActivityResultRegistry();

        void getFullyDrawnReporter();

        void getOnBackPressedDispatcherannotations();

        requestPlayPauseAccessibilityFocus.RemoteActionCompatParcelizer getSavedStateRegistryControllerannotations();

        void invalidateMenu();

        boolean onConfigurationChanged();

        void onCreatePanelMenu();

        void onMenuItemSelected();

        boolean onMultiWindowModeChanged();

        boolean onNewIntent();

        boolean onPanelClosed();

        void onPreparePanel();

        void onRetainCustomNonConfigurationInstance();

        void onSaveInstanceState();

        void onTrimMemory();

        void onUserLeaveHint();

        void peekAvailableContext();

        void read(float f, String str);

        void read(ThemeState themeState);

        void read$60b2630b(T t);

        void registerForActivityResult();

        void removeMenuProvider();

        void removeOnConfigurationChangedListener();

        void removeOnContextAvailableListener();

        void removeOnMultiWindowModeChangedListener();

        void removeOnNewIntentListener();

        void removeOnPictureInPictureModeChangedListener();

        void setContentView();

        void write(int i);

        void write(ArrayList<OptionItem> arrayList, OptionItem.PlaybackSpeedOptionItem playbackSpeedOptionItem, Boolean bool);
    }

    public interface write extends getNextEventTime {
        void MediaBrowserCompatMediaItem(String str);
    }
}
