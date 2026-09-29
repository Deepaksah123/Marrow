package kotlin;

import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0006\bf\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0002H&¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0002H&¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0002H&¢\u0006\u0004\b\u000f\u0010\u0004J\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\t\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\t\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0010H&¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0016H&¢\u0006\u0004\b\r\u0010\u0017J\u000f\u0010\u0011\u001a\u00020\u000bH&¢\u0006\u0004\b\u0011\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0002H&¢\u0006\u0004\b\u0019\u0010\u0004J\u000f\u0010\u001a\u001a\u00020\u000bH&¢\u0006\u0004\b\u001a\u0010\u0018J\u000f\u0010\u001b\u001a\u00020\u0002H&¢\u0006\u0004\b\u001b\u0010\u0004J\u000f\u0010\u001c\u001a\u00020\u0002H&¢\u0006\u0004\b\u001c\u0010\u0004À\u0006\u0003"}, d2 = {"Lo/getSampleFormats;", "", "", "MediaBrowserCompatItemReceiver", "()Z", "AudioAttributesImplApi21Parcelizer", "MediaBrowserCompatSearchResultReceiver", "AudioAttributesImplApi26Parcelizer", "", "RemoteActionCompatParcelizer", "()V", "", "p0", "AudioAttributesCompatParcelizer", "(Ljava/lang/String;)Z", "MediaMetadataCompat", "", "read", "(Ljava/lang/String;)I", "(Ljava/lang/String;)Ljava/lang/String;", "write", "()I", "", "()Ljava/util/List;", "()Ljava/lang/String;", "MediaBrowserCompatCustomActionResultReceiver", "IconCompatParcelizer", "RatingCompat", "AudioAttributesImplBaseParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface getSampleFormats {

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.AudioAttributesCompatParcelizer;

    List<String> AudioAttributesCompatParcelizer();

    boolean AudioAttributesCompatParcelizer(String p0);

    boolean AudioAttributesImplApi21Parcelizer();

    boolean AudioAttributesImplApi26Parcelizer();

    boolean AudioAttributesImplBaseParcelizer();

    String IconCompatParcelizer();

    boolean MediaBrowserCompatCustomActionResultReceiver();

    boolean MediaBrowserCompatItemReceiver();

    boolean MediaBrowserCompatSearchResultReceiver();

    boolean MediaMetadataCompat();

    boolean RatingCompat();

    String RemoteActionCompatParcelizer(String p0);

    void RemoteActionCompatParcelizer();

    int read(String p0);

    String read();

    int write();

    /* JADX INFO: renamed from: o.getSampleFormats$read, reason: from kotlin metadata */
    public static final class Companion {
        static final /* synthetic */ Companion AudioAttributesCompatParcelizer = new Companion();
        private static final String onCustomAction = "trigger_upgrade_plan_v2";
        private static final String MediaMetadataCompat = "trigger_upgrade_plan_b";
        private static final String MediaBrowserCompatMediaItem = "rooting_status_block";
        private static final String RatingCompat = "should_send_heartbeat";
        private static final String IconCompatParcelizer = "eoi_callback_restriction";
        private static final String AudioAttributesImplBaseParcelizer = "enable_os_not_supported";
        private static final String MediaBrowserCompatCustomActionResultReceiver = "os_not_supported";
        private static final String read = "in_app_update";
        private static final String write = "in_app_update_time_diff";
        private static final String handleMediaPlayPauseIfPendingOnHandler = "watch_next_video_duration";
        private static final String AudioAttributesImplApi21Parcelizer = "last_os_supported_version";
        private static final String onPlayFromMediaId = "enable_referral_coupon";
        private static final String onCommand = "yoa_start_year";
        private static final String onPlay = "enable_referral_payment";
        private static final String onAddQueueItem = "nav_know_more";
        private static final String onPause = "nav_slides_notes";
        private static final String onFastForward = "nav_share_app";
        private static final String MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = "nav_about_us";
        private static final String MediaDescriptionCompat = "show_video_rating_cross_button_prod";
        private static final String AudioAttributesImplApi26Parcelizer = "marrow_decorder_config_changes";
        private static final String MediaBrowserCompatSearchResultReceiver = "player_time_out";
        private static final String RemoteActionCompatParcelizer = "decoder_fallback_enabled";
        private static final String MediaBrowserCompatItemReceiver = "apprating_threshold";

        private Companion() {
        }

        public static String MediaBrowserCompatSearchResultReceiver() {
            return onCustomAction;
        }

        public static String RatingCompat() {
            return MediaMetadataCompat;
        }

        public static String MediaDescriptionCompat() {
            return MediaBrowserCompatMediaItem;
        }

        public static String MediaBrowserCompatMediaItem() {
            return RatingCompat;
        }

        public static String write() {
            return IconCompatParcelizer;
        }

        public static String AudioAttributesCompatParcelizer() {
            return AudioAttributesImplBaseParcelizer;
        }

        public static String AudioAttributesImplApi26Parcelizer() {
            return MediaBrowserCompatCustomActionResultReceiver;
        }

        public static String RemoteActionCompatParcelizer() {
            return read;
        }

        public static String IconCompatParcelizer() {
            return write;
        }

        public static String MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
            return handleMediaPlayPauseIfPendingOnHandler;
        }

        public static String AudioAttributesImplApi21Parcelizer() {
            return AudioAttributesImplApi21Parcelizer;
        }

        public static String onFastForward() {
            return onPlayFromMediaId;
        }

        public static String onAddQueueItem() {
            return onCommand;
        }

        public static String onPlayFromMediaId() {
            return onPlay;
        }

        public static String onCustomAction() {
            return onAddQueueItem;
        }

        public static String onMediaButtonEvent() {
            return onPause;
        }

        public static String onCommand() {
            return onFastForward;
        }

        public static String handleMediaPlayPauseIfPendingOnHandler() {
            return MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        }

        public static String MediaMetadataCompat() {
            return MediaDescriptionCompat;
        }

        public static String AudioAttributesImplBaseParcelizer() {
            return AudioAttributesImplApi26Parcelizer;
        }

        public static String MediaBrowserCompatItemReceiver() {
            return MediaBrowserCompatSearchResultReceiver;
        }

        public static String read() {
            return RemoteActionCompatParcelizer;
        }

        public static String MediaBrowserCompatCustomActionResultReceiver() {
            return MediaBrowserCompatItemReceiver;
        }
    }
}
