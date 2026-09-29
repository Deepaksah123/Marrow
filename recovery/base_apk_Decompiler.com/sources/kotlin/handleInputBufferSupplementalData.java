package kotlin;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ExpandableListView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.compress.utils.CharsetNames;

/* JADX INFO: loaded from: classes3.dex */
final class handleInputBufferSupplementalData {
    handleInputBufferSupplementalData() {
    }

    protected static final class IconCompatParcelizer extends getOutputStreamOffsetUs<Boolean> {
        private static IconCompatParcelizer read;

        private IconCompatParcelizer() {
        }

        protected static IconCompatParcelizer RemoteActionCompatParcelizer() {
            IconCompatParcelizer iconCompatParcelizer;
            synchronized (IconCompatParcelizer.class) {
                if (read == null) {
                    read = new IconCompatParcelizer();
                }
                iconCompatParcelizer = read;
            }
            return iconCompatParcelizer;
        }

        protected static Boolean write() {
            return Boolean.FALSE;
        }

        @Override // kotlin.getOutputStreamOffsetUs
        protected final String IconCompatParcelizer() {
            return "firebase_performance_collection_deactivated";
        }
    }

    protected static final class AudioAttributesCompatParcelizer extends getOutputStreamOffsetUs<Boolean> {
        private static AudioAttributesCompatParcelizer read;

        private AudioAttributesCompatParcelizer() {
        }

        protected static AudioAttributesCompatParcelizer RemoteActionCompatParcelizer() {
            AudioAttributesCompatParcelizer audioAttributesCompatParcelizer;
            synchronized (AudioAttributesCompatParcelizer.class) {
                if (read == null) {
                    read = new AudioAttributesCompatParcelizer();
                }
                audioAttributesCompatParcelizer = read;
            }
            return audioAttributesCompatParcelizer;
        }

        @Override // kotlin.getOutputStreamOffsetUs
        protected final String IconCompatParcelizer() {
            return "firebase_performance_collection_enabled";
        }

        @Override // kotlin.getOutputStreamOffsetUs
        protected final String ad_() {
            return "isEnabled";
        }
    }

    protected static final class MediaMetadataCompat extends getOutputStreamOffsetUs<Boolean> {
        private static MediaMetadataCompat AudioAttributesCompatParcelizer;

        protected MediaMetadataCompat() {
        }

        protected static MediaMetadataCompat AudioAttributesCompatParcelizer() {
            MediaMetadataCompat mediaMetadataCompat;
            synchronized (MediaMetadataCompat.class) {
                if (AudioAttributesCompatParcelizer == null) {
                    AudioAttributesCompatParcelizer = new MediaMetadataCompat();
                }
                mediaMetadataCompat = AudioAttributesCompatParcelizer;
            }
            return mediaMetadataCompat;
        }

        protected static Boolean read() {
            return Boolean.TRUE;
        }

        @Override // kotlin.getOutputStreamOffsetUs
        protected final String ae_() {
            return "fpr_enabled";
        }

        @Override // kotlin.getOutputStreamOffsetUs
        protected final String ad_() {
            return "com.google.firebase.perf.SdkEnabled";
        }
    }

    protected static final class AudioAttributesImplApi26Parcelizer extends getOutputStreamOffsetUs<String> {
        private static AudioAttributesImplApi26Parcelizer read;

        protected AudioAttributesImplApi26Parcelizer() {
        }

        protected static AudioAttributesImplApi26Parcelizer read() {
            AudioAttributesImplApi26Parcelizer audioAttributesImplApi26Parcelizer;
            synchronized (AudioAttributesImplApi26Parcelizer.class) {
                if (read == null) {
                    read = new AudioAttributesImplApi26Parcelizer();
                }
                audioAttributesImplApi26Parcelizer = read;
            }
            return audioAttributesImplApi26Parcelizer;
        }

        protected static String AudioAttributesCompatParcelizer() {
            return "";
        }

        @Override // kotlin.getOutputStreamOffsetUs
        protected final String ae_() {
            return "fpr_disabled_android_versions";
        }

        @Override // kotlin.getOutputStreamOffsetUs
        protected final String ad_() {
            return "com.google.firebase.perf.SdkDisabledVersions";
        }
    }

    protected static final class MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver extends getOutputStreamOffsetUs<Double> {
        private static MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver write;

        private MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
        }

        protected static MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver AudioAttributesCompatParcelizer() {
            MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
            synchronized (MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.class) {
                if (write == null) {
                    write = new MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
                }
                mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = write;
            }
            return mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        }

        protected static Double read() {
            return Double.valueOf(1.0d);
        }

        protected static Double AudioAttributesImplApi26Parcelizer() {
            return Double.valueOf(read().doubleValue() / 1000.0d);
        }

        @Override // kotlin.getOutputStreamOffsetUs
        protected final String ae_() {
            return "fpr_vc_trace_sampling_rate";
        }

        @Override // kotlin.getOutputStreamOffsetUs
        protected final String ad_() {
            return "com.google.firebase.perf.TraceSamplingRate";
        }
    }

    protected static final class MediaBrowserCompatCustomActionResultReceiver extends getOutputStreamOffsetUs<Double> {
        private static MediaBrowserCompatCustomActionResultReceiver write;

        private MediaBrowserCompatCustomActionResultReceiver() {
        }

        protected static MediaBrowserCompatCustomActionResultReceiver read() {
            MediaBrowserCompatCustomActionResultReceiver mediaBrowserCompatCustomActionResultReceiver;
            synchronized (MediaBrowserCompatCustomActionResultReceiver.class) {
                if (write == null) {
                    write = new MediaBrowserCompatCustomActionResultReceiver();
                }
                mediaBrowserCompatCustomActionResultReceiver = write;
            }
            return mediaBrowserCompatCustomActionResultReceiver;
        }

        protected static Double AudioAttributesCompatParcelizer() {
            return Double.valueOf(1.0d);
        }

        protected static Double AudioAttributesImplApi26Parcelizer() {
            return Double.valueOf(AudioAttributesCompatParcelizer().doubleValue() / 1000.0d);
        }

        @Override // kotlin.getOutputStreamOffsetUs
        protected final String ae_() {
            return "fpr_vc_network_request_sampling_rate";
        }

        @Override // kotlin.getOutputStreamOffsetUs
        protected final String ad_() {
            return "com.google.firebase.perf.NetworkRequestSamplingRate";
        }
    }

    /* JADX INFO: loaded from: classes5.dex */
    protected static final class RatingCompat extends getOutputStreamOffsetUs<Long> {
        private static RatingCompat IconCompatParcelizer;

        private RatingCompat() {
        }

        public static RatingCompat read() {
            RatingCompat ratingCompat;
            synchronized (RatingCompat.class) {
                if (IconCompatParcelizer == null) {
                    IconCompatParcelizer = new RatingCompat();
                }
                ratingCompat = IconCompatParcelizer;
            }
            return ratingCompat;
        }

        protected static Long AudioAttributesCompatParcelizer() {
            return 100L;
        }

        protected static Long AudioAttributesImplApi26Parcelizer() {
            return Long.valueOf(AudioAttributesCompatParcelizer().longValue() * 3);
        }

        @Override // kotlin.getOutputStreamOffsetUs
        protected final String ae_() {
            return "fpr_session_gauge_cpu_capture_frequency_fg_ms";
        }

        @Override // kotlin.getOutputStreamOffsetUs
        protected final String IconCompatParcelizer() {
            return "sessions_cpu_capture_frequency_fg_ms";
        }

        @Override // kotlin.getOutputStreamOffsetUs
        protected final String ad_() {
            return "com.google.firebase.perf.SessionsCpuCaptureFrequencyForegroundMs";
        }
    }

    /* JADX INFO: loaded from: classes5.dex */
    protected static final class MediaBrowserCompatSearchResultReceiver extends getOutputStreamOffsetUs<Long> {
        private static MediaBrowserCompatSearchResultReceiver IconCompatParcelizer;

        private MediaBrowserCompatSearchResultReceiver() {
        }

        public static MediaBrowserCompatSearchResultReceiver AudioAttributesCompatParcelizer() {
            MediaBrowserCompatSearchResultReceiver mediaBrowserCompatSearchResultReceiver;
            synchronized (MediaBrowserCompatSearchResultReceiver.class) {
                if (IconCompatParcelizer == null) {
                    IconCompatParcelizer = new MediaBrowserCompatSearchResultReceiver();
                }
                mediaBrowserCompatSearchResultReceiver = IconCompatParcelizer;
            }
            return mediaBrowserCompatSearchResultReceiver;
        }

        protected static Long read() {
            return 0L;
        }

        @Override // kotlin.getOutputStreamOffsetUs
        protected final String ae_() {
            return "fpr_session_gauge_cpu_capture_frequency_bg_ms";
        }

        @Override // kotlin.getOutputStreamOffsetUs
        protected final String IconCompatParcelizer() {
            return "sessions_cpu_capture_frequency_bg_ms";
        }

        @Override // kotlin.getOutputStreamOffsetUs
        protected final String ad_() {
            return "com.google.firebase.perf.SessionsCpuCaptureFrequencyBackgroundMs";
        }
    }

    /* JADX INFO: loaded from: classes5.dex */
    protected static final class onCustomAction extends getOutputStreamOffsetUs<Long> {
        private static onCustomAction IconCompatParcelizer;

        private onCustomAction() {
        }

        public static onCustomAction read() {
            onCustomAction oncustomaction;
            synchronized (onCustomAction.class) {
                if (IconCompatParcelizer == null) {
                    IconCompatParcelizer = new onCustomAction();
                }
                oncustomaction = IconCompatParcelizer;
            }
            return oncustomaction;
        }

        protected static Long AudioAttributesCompatParcelizer() {
            return 100L;
        }

        protected static Long AudioAttributesImplApi21Parcelizer() {
            return Long.valueOf(AudioAttributesCompatParcelizer().longValue() * 3);
        }

        @Override // kotlin.getOutputStreamOffsetUs
        protected final String ae_() {
            return "fpr_session_gauge_memory_capture_frequency_fg_ms";
        }

        @Override // kotlin.getOutputStreamOffsetUs
        protected final String IconCompatParcelizer() {
            return "sessions_memory_capture_frequency_fg_ms";
        }

        @Override // kotlin.getOutputStreamOffsetUs
        protected final String ad_() {
            return "com.google.firebase.perf.SessionsMemoryCaptureFrequencyForegroundMs";
        }
    }

    /* JADX INFO: loaded from: classes5.dex */
    protected static final class MediaBrowserCompatMediaItem extends getOutputStreamOffsetUs<Long> {
        private static MediaBrowserCompatMediaItem IconCompatParcelizer;

        private MediaBrowserCompatMediaItem() {
        }

        public static MediaBrowserCompatMediaItem read() {
            MediaBrowserCompatMediaItem mediaBrowserCompatMediaItem;
            synchronized (MediaBrowserCompatMediaItem.class) {
                if (IconCompatParcelizer == null) {
                    IconCompatParcelizer = new MediaBrowserCompatMediaItem();
                }
                mediaBrowserCompatMediaItem = IconCompatParcelizer;
            }
            return mediaBrowserCompatMediaItem;
        }

        protected static Long AudioAttributesCompatParcelizer() {
            return 0L;
        }

        @Override // kotlin.getOutputStreamOffsetUs
        protected final String ae_() {
            return "fpr_session_gauge_memory_capture_frequency_bg_ms";
        }

        @Override // kotlin.getOutputStreamOffsetUs
        protected final String IconCompatParcelizer() {
            return "sessions_memory_capture_frequency_bg_ms";
        }

        @Override // kotlin.getOutputStreamOffsetUs
        protected final String ad_() {
            return "com.google.firebase.perf.SessionsMemoryCaptureFrequencyBackgroundMs";
        }
    }

    protected static final class MediaDescriptionCompat extends getOutputStreamOffsetUs<Long> {
        private static MediaDescriptionCompat RemoteActionCompatParcelizer;

        private MediaDescriptionCompat() {
        }

        public static MediaDescriptionCompat AudioAttributesCompatParcelizer() {
            MediaDescriptionCompat mediaDescriptionCompat;
            synchronized (MediaDescriptionCompat.class) {
                if (RemoteActionCompatParcelizer == null) {
                    RemoteActionCompatParcelizer = new MediaDescriptionCompat();
                }
                mediaDescriptionCompat = RemoteActionCompatParcelizer;
            }
            return mediaDescriptionCompat;
        }

        protected static Long read() {
            return 240L;
        }

        @Override // kotlin.getOutputStreamOffsetUs
        protected final String ae_() {
            return "fpr_session_max_duration_min";
        }

        @Override // kotlin.getOutputStreamOffsetUs
        protected final String IconCompatParcelizer() {
            return "sessions_max_length_minutes";
        }

        @Override // kotlin.getOutputStreamOffsetUs
        protected final String ad_() {
            return "com.google.firebase.perf.SessionsMaxDurationMinutes";
        }
    }

    /* JADX INFO: loaded from: classes5.dex */
    protected static final class onAddQueueItem extends getOutputStreamOffsetUs<Long> {
        private static onAddQueueItem write;

        private onAddQueueItem() {
        }

        public static onAddQueueItem read() {
            onAddQueueItem onaddqueueitem;
            synchronized (onAddQueueItem.class) {
                if (write == null) {
                    write = new onAddQueueItem();
                }
                onaddqueueitem = write;
            }
            return onaddqueueitem;
        }

        protected static Long AudioAttributesCompatParcelizer() {
            return 300L;
        }

        @Override // kotlin.getOutputStreamOffsetUs
        protected final String ae_() {
            return "fpr_rl_trace_event_count_fg";
        }

        @Override // kotlin.getOutputStreamOffsetUs
        protected final String ad_() {
            return "com.google.firebase.perf.TraceEventCountForeground";
        }
    }

    /* JADX INFO: loaded from: classes5.dex */
    protected static final class onCommand extends getOutputStreamOffsetUs<Long> {
        private static onCommand write;

        private onCommand() {
        }

        public static onCommand read() {
            onCommand oncommand;
            synchronized (onCommand.class) {
                if (write == null) {
                    write = new onCommand();
                }
                oncommand = write;
            }
            return oncommand;
        }

        protected static Long AudioAttributesCompatParcelizer() {
            return 30L;
        }

        @Override // kotlin.getOutputStreamOffsetUs
        protected final String ae_() {
            return "fpr_rl_trace_event_count_bg";
        }

        @Override // kotlin.getOutputStreamOffsetUs
        protected final String ad_() {
            return "com.google.firebase.perf.TraceEventCountBackground";
        }
    }

    /* JADX INFO: loaded from: classes5.dex */
    protected static final class MediaBrowserCompatItemReceiver extends getOutputStreamOffsetUs<Long> {
        private static MediaBrowserCompatItemReceiver read;

        private MediaBrowserCompatItemReceiver() {
        }

        public static MediaBrowserCompatItemReceiver AudioAttributesCompatParcelizer() {
            MediaBrowserCompatItemReceiver mediaBrowserCompatItemReceiver;
            synchronized (MediaBrowserCompatItemReceiver.class) {
                if (read == null) {
                    read = new MediaBrowserCompatItemReceiver();
                }
                mediaBrowserCompatItemReceiver = read;
            }
            return mediaBrowserCompatItemReceiver;
        }

        protected static Long read() {
            return 700L;
        }

        @Override // kotlin.getOutputStreamOffsetUs
        protected final String ae_() {
            return "fpr_rl_network_event_count_fg";
        }

        @Override // kotlin.getOutputStreamOffsetUs
        protected final String ad_() {
            return "com.google.firebase.perf.NetworkEventCountForeground";
        }
    }

    /* JADX INFO: loaded from: classes5.dex */
    protected static final class AudioAttributesImplBaseParcelizer extends getOutputStreamOffsetUs<Long> {
        private static AudioAttributesImplBaseParcelizer AudioAttributesCompatParcelizer;

        private AudioAttributesImplBaseParcelizer() {
        }

        public static AudioAttributesImplBaseParcelizer read() {
            AudioAttributesImplBaseParcelizer audioAttributesImplBaseParcelizer;
            synchronized (AudioAttributesImplBaseParcelizer.class) {
                if (AudioAttributesCompatParcelizer == null) {
                    AudioAttributesCompatParcelizer = new AudioAttributesImplBaseParcelizer();
                }
                audioAttributesImplBaseParcelizer = AudioAttributesCompatParcelizer;
            }
            return audioAttributesImplBaseParcelizer;
        }

        protected static Long AudioAttributesCompatParcelizer() {
            return 70L;
        }

        @Override // kotlin.getOutputStreamOffsetUs
        protected final String ae_() {
            return "fpr_rl_network_event_count_bg";
        }

        @Override // kotlin.getOutputStreamOffsetUs
        protected final String ad_() {
            return "com.google.firebase.perf.NetworkEventCountBackground";
        }
    }

    /* JADX INFO: loaded from: classes5.dex */
    protected static final class AudioAttributesImplApi21Parcelizer extends getOutputStreamOffsetUs<Long> {
        private static AudioAttributesImplApi21Parcelizer read;

        private AudioAttributesImplApi21Parcelizer() {
        }

        public static AudioAttributesImplApi21Parcelizer AudioAttributesCompatParcelizer() {
            AudioAttributesImplApi21Parcelizer audioAttributesImplApi21Parcelizer;
            synchronized (AudioAttributesImplApi21Parcelizer.class) {
                if (read == null) {
                    read = new AudioAttributesImplApi21Parcelizer();
                }
                audioAttributesImplApi21Parcelizer = read;
            }
            return audioAttributesImplApi21Parcelizer;
        }

        protected static Long read() {
            return 600L;
        }

        @Override // kotlin.getOutputStreamOffsetUs
        protected final String ae_() {
            return "fpr_rl_time_limit_sec";
        }

        @Override // kotlin.getOutputStreamOffsetUs
        protected final String ad_() {
            return "com.google.firebase.perf.TimeLimitSec";
        }
    }

    protected static final class handleMediaPlayPauseIfPendingOnHandler extends getOutputStreamOffsetUs<Double> {
        private static handleMediaPlayPauseIfPendingOnHandler read;

        private handleMediaPlayPauseIfPendingOnHandler() {
        }

        public static handleMediaPlayPauseIfPendingOnHandler AudioAttributesCompatParcelizer() {
            handleMediaPlayPauseIfPendingOnHandler handlemediaplaypauseifpendingonhandler;
            synchronized (handleMediaPlayPauseIfPendingOnHandler.class) {
                if (read == null) {
                    read = new handleMediaPlayPauseIfPendingOnHandler();
                }
                handlemediaplaypauseifpendingonhandler = read;
            }
            return handlemediaplaypauseifpendingonhandler;
        }

        protected static Double read() {
            return Double.valueOf(0.01d);
        }

        protected static Double AudioAttributesImplApi26Parcelizer() {
            return Double.valueOf(read().doubleValue() / 1000.0d);
        }

        @Override // kotlin.getOutputStreamOffsetUs
        protected final String ad_() {
            return "com.google.firebase.perf.SessionSamplingRate";
        }

        @Override // kotlin.getOutputStreamOffsetUs
        protected final String ae_() {
            return "fpr_vc_session_sampling_rate";
        }

        @Override // kotlin.getOutputStreamOffsetUs
        protected final String IconCompatParcelizer() {
            return "sessions_sampling_percentage";
        }
    }

    /* JADX INFO: loaded from: classes5.dex */
    protected static final class RemoteActionCompatParcelizer extends getOutputStreamOffsetUs<String> {
        private static RemoteActionCompatParcelizer AudioAttributesCompatParcelizer;
        private static final Map<Long, String> write = Collections.unmodifiableMap(new HashMap<Long, String>() { // from class: o.handleInputBufferSupplementalData.RemoteActionCompatParcelizer.5
            private static long AudioAttributesCompatParcelizer;
            private static char[] write;
            private static final byte[] $$c = {87, 74, -120, 12};
            private static final int $$d = 20;
            private static int $10 = 0;
            private static int $11 = 1;
            private static final byte[] $$a = {81, -92, 74, -108, -8, 9, -19, -10, -3, 20, -6, 5};
            private static final int $$b = 249;
            private static int RemoteActionCompatParcelizer = 0;
            private static int IconCompatParcelizer = 1;

            /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002c). Please report as a decompilation issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            private static java.lang.String $$e(byte r6, short r7, int r8) {
                /*
                    int r7 = r7 * 3
                    int r7 = 101 - r7
                    byte[] r0 = o.handleInputBufferSupplementalData.RemoteActionCompatParcelizer.AnonymousClass5.$$c
                    int r6 = r6 * 4
                    int r6 = r6 + 4
                    int r8 = r8 * 4
                    int r1 = 1 - r8
                    byte[] r1 = new byte[r1]
                    r2 = 0
                    int r8 = 0 - r8
                    if (r0 != 0) goto L18
                    r3 = r8
                    r4 = r2
                    goto L2c
                L18:
                    r3 = r2
                L19:
                    byte r4 = (byte) r7
                    r1[r3] = r4
                    if (r3 != r8) goto L24
                    java.lang.String r6 = new java.lang.String
                    r6.<init>(r1, r2)
                    return r6
                L24:
                    int r3 = r3 + 1
                    r4 = r0[r6]
                    r5 = r3
                    r3 = r7
                    r7 = r4
                    r4 = r5
                L2c:
                    int r7 = -r7
                    int r7 = r7 + r3
                    int r6 = r6 + 1
                    r3 = r4
                    goto L19
                */
                throw new UnsupportedOperationException("Method not decompiled: o.handleInputBufferSupplementalData.RemoteActionCompatParcelizer.AnonymousClass5.$$e(byte, short, int):java.lang.String");
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0020 -> B:11:0x0026). Please report as a decompilation issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            private static void b(int r5, short r6, int r7, java.lang.Object[] r8) {
                /*
                    int r7 = r7 + 4
                    byte[] r0 = o.handleInputBufferSupplementalData.RemoteActionCompatParcelizer.AnonymousClass5.$$a
                    int r1 = r6 + 3
                    int r5 = 114 - r5
                    byte[] r1 = new byte[r1]
                    int r6 = r6 + 2
                    r2 = 0
                    if (r0 != 0) goto L12
                    r4 = r6
                    r3 = r2
                    goto L26
                L12:
                    r3 = r2
                L13:
                    byte r4 = (byte) r5
                    r1[r3] = r4
                    if (r3 != r6) goto L20
                    java.lang.String r5 = new java.lang.String
                    r5.<init>(r1, r2)
                    r8[r2] = r5
                    return
                L20:
                    int r7 = r7 + 1
                    int r3 = r3 + 1
                    r4 = r0[r7]
                L26:
                    int r5 = r5 + r4
                    int r5 = r5 + 6
                    goto L13
                */
                throw new UnsupportedOperationException("Method not decompiled: o.handleInputBufferSupplementalData.RemoteActionCompatParcelizer.AnonymousClass5.b(int, short, int, java.lang.Object[]):void");
            }

            private static void a(char c, int i, int i2, Object[] objArr) throws Throwable {
                int i3 = 2 % 2;
                DownloadService downloadService = new DownloadService();
                long[] jArr = new long[i2];
                downloadService.write = 0;
                while (downloadService.write < i2) {
                    int i4 = downloadService.write;
                    try {
                        Object[] objArr2 = {Integer.valueOf(write[i + i4])};
                        Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(1659892375);
                        if (objRemoteActionCompatParcelizer == null) {
                            byte b = (byte) 0;
                            byte b2 = b;
                            objRemoteActionCompatParcelizer = startForeground.read((char) (36620 - TextUtils.lastIndexOf("", '0', 0, 0)), (AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 2339, 28 - TextUtils.getOffsetAfter("", 0), 480654850, false, $$e(b, b2, b2), new Class[]{Integer.TYPE});
                        }
                        Object[] objArr3 = {Long.valueOf(((Long) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).longValue()), Long.valueOf(i4), Long.valueOf(AudioAttributesCompatParcelizer), Integer.valueOf(c)};
                        Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(955774634);
                        if (objRemoteActionCompatParcelizer2 == null) {
                            objRemoteActionCompatParcelizer2 = startForeground.read((char) (MotionEvent.axisFromString("") + 1), 9701 - View.MeasureSpec.getSize(0), ExpandableListView.getPackedPositionType(0L) + 26, 1186869823, false, "d", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                        }
                        jArr[i4] = ((Long) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).longValue();
                        Object[] objArr4 = {downloadService, downloadService};
                        Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-452087292);
                        if (objRemoteActionCompatParcelizer3 == null) {
                            objRemoteActionCompatParcelizer3 = startForeground.read((char) (TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), Process.getGidForName("") + 23785, TextUtils.indexOf((CharSequence) "", '0') + 34, -1690012015, false, "b", new Class[]{Object.class, Object.class});
                        }
                        ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
                        int i5 = $10 + 105;
                        $11 = i5 % 128;
                        int i6 = i5 % 2;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                char[] cArr = new char[i2];
                downloadService.write = 0;
                while (downloadService.write < i2) {
                    int i7 = $11 + 57;
                    $10 = i7 % 128;
                    int i8 = i7 % 2;
                    cArr[downloadService.write] = (char) jArr[downloadService.write];
                    Object[] objArr5 = {downloadService, downloadService};
                    Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-452087292);
                    if (objRemoteActionCompatParcelizer4 == null) {
                        objRemoteActionCompatParcelizer4 = startForeground.read((char) Color.argb(0, 0, 0, 0), 23784 - View.resolveSizeAndState(0, 0, 0), TextUtils.indexOf((CharSequence) "", '0') + 34, -1690012015, false, "b", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5);
                }
                String str = new String(cArr);
                int i9 = $11 + 53;
                $10 = i9 % 128;
                int i10 = i9 % 2;
                objArr[0] = str;
            }

            {
                put(461L, "FIREPERF_AUTOPUSH");
                put(462L, "FIREPERF");
                put(675L, "FIREPERF_INTERNAL_LOW");
                put(676L, "FIREPERF_INTERNAL_HIGH");
            }

            /*  JADX ERROR: NoSuchElementException in pass: ReplaceNewArray
                java.util.NoSuchElementException
                	at java.base/java.util.TreeMap.key(TreeMap.java:1637)
                	at java.base/java.util.TreeMap.lastKey(TreeMap.java:309)
                	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:171)
                	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
                	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
                */
            public static java.lang.Object[] AudioAttributesCompatParcelizer(android.content.Context r64, int r65, int r66, int r67) {
                /*
                    Method dump skipped, instruction units count: 14542
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: o.handleInputBufferSupplementalData.RemoteActionCompatParcelizer.AnonymousClass5.AudioAttributesCompatParcelizer(android.content.Context, int, int, int):java.lang.Object[]");
            }

            static {
                char[] cArr = new char[2156];
                ByteBuffer.wrap(" ·\u0000rááAD\"\u008f\u00829c£Ã\u0016¤\u008c\u0004\u0000å}Fñ&X\u0087ñg=È®¨\u001c\t\u0084é\u0001Ja+ó\u008balßÌ*\u00ad©\r%î\u0091í«Mn¬ý\fXo\u0093Ï%.¿\u008e\né\u0090I\u001c¨a\u000bíkDÊí*0\u0085¿å\u0014D\u008f¤'\u0007jfìÆP!Ó\u00812à°Ü#|æ\u009du=Ð^\u001bþ\u00ad\u001f7¿\u0082Ø\u0018x\u0094\u0099é:eZÌûe\u001b»´'Ô\u0082u\u0001¢\u0012\u0002ÀãXCä *\u0080\u0096a\u0006Á»¦8\u0006¯çÔD\b$ò\u0085de\u0095Ê\u000bª»\u000b:ë²Hß)z\u0089ùnhÎ\u008b¯\u0019\u000f\u0086ì#L¾¬Ñ\f\u0015í\u0096M7.é\u008e\\oÍÏ2¨þ\bré\u001dJ\u0094¼\u0005\u001cÁýB]ã>=\u009e\u009f\u007f\u0017ß¥¸t\u0018¤ùÔZ_:òÜ#|ñ\u009dt=Å^Uþ¸\u001f<¿ÁØ.x´\u0099Í:yZÒû_\u001b\u008c´?Ô\u0098u\u0003üv\\³½$\u001d\u0087~\u0000Þ°?#\u009fØøYXÒ¹¼\u001a-z\u0097Û\u0000)$\u0089·hdÈ\u009e«\u0001\u000bÿêvJ\u009a-T\u008dÍl¾Ï>¯\u0091\u000e\tîöA[!Ø\u0080]`ÞÃ\u0083¢*\u0002\u009eå\u0011E¥Ü~|í\u009d>=Ä^[þ¥\u001f,¿ÀØ\u000ex\u0097\u0099ä:dZËûS\u001b¬´\u0001Ô\u0082u\u0007\u0095\u00846ÙWp÷Ä\u0010K°üÜ#|ñ\u009di=Õ^@þ¯\u001f5¿ÁØ\u0010x\u009b\u0099â:9ZÈûS\u001bª´0Ô\u008euL\u0095\u00836éñÊQO°Ó\u0010lsÿÓ\u0016\u009b5;çÚ\u007fzÃ\u0019V¹¹X#ø×\u009f\b?\u008dÞø}/\u001dÜ¼I\\³ó=\u0093¬29ÒËqþ\u0010g°ÑW[÷õ\u0096)6«Õ\u0018u\u0094\u0014à«cKÒ\u0096 6r×êwV\u0014Ã´,U¶õB\u0092\u009d2\u0018Ómpº\u0010I±ÜQ&þ¨\u009e9?¬ß^|u\u001då½FZËÜ#|ñ\u009di=Õ^@þ¯\u001f5¿ÁØ\u0010x\u009b\u0099â:9ZÈûS\u001bª´0Ô\u0089u\u000f\u0095\u00856ÐWY÷Ú\u0010J°¡Ñ,qü\u0092\u00132\u0099Ü#|æ\u009du=Ð^\u001bþ¤\u001f=¿\u0083Ø\tx\u0095\u0099õ:sZ×ûNÖ\u009fv\f\u0097ß7%T ôB\u0015ÕµkÒ³r{\u0093\u000e0\u0084P1Ã×cR\u0082Ä\"`AäáQ\u0000\u0083 >Ç½Ü#|ò\u009db=É^Wþå\u001f>¿\u0087Ø\u0010x\u0097\u0099ó:oZ×ûN\u001b\u00ad´3Ô\u009f«f\u000bãêyJ×)C\u0089¨ÜP|Ã#,\u0083¿blÂ\u0084¡\u0014\u0001÷àn@É'M\u0087ÔfüÅ)¥\u0097\u0004\u0006äïKj+ß\u008aSjÖÉ¡¨4\b\u009dï\u0018\u008fô/xÎán@êáJz«ÿ\u000bHhÀÈ$)±\u0089]î\u0092N\u0016¯n\f¥l[ÍÃ-{\u0082§â\u0014C\u009d£\u0018\u0000|a§ÁP&Õ\u0086&çïG)¤\u009c\u0004\u0000e|ÚØ:R\u009bÓû$X\u0080¸?\u0019\u009ey\u0007Þs?à\u009fAüÄ\\]×ëwp\u0096õ6BUÊõ.\u0014»´WÓ\u0098s\u001c\u0092d1¯QQðÉ\u0010q¿\u00adß\u001e~\u0097\u009e\u0012=v\\\u00adüZ\u001bß»,Úåz#\u0099\u00969\nXvçÒ\u0007X¦ÙÆ.e\u008a\u00851$\u0094D\rãy\u0002à¢Kv\u007fÖä7a\u0097Öô^Tºµ/\u0015Ãr\fÒ\u00883ð\u0090;ðÅQ]±å\u001e9~\u008aß\u0003?\u0086\u009câý9]ÛºT\u001aã{<Û 8\nÜ||ç\u009db=Õ^]þ¹\u001f,¿ÀØ\u000fx\u008b\u0099ó:8ZÆû^\u001bæ´:Ô\u0089u\u0000\u0095\u00856áW:÷Ø\u0010W°àÑ0q³\u0092\u0003Ü||ç\u009db=Õ^]þ¹\u001f,¿ÀØ\u000fx\u008b\u0099ó:8ZÆû^\u001bæ´:Ô\u0089u\u0000\u0095\u00856áW:÷Ø\u0010W°àÑ1q±\u0092\u0003Ü||ç\u009db=Õ^]þ¹\u001f,¿ÀØ\u000fx\u008b\u0099ó:8ZÆû^\u001bæ´:Ô\u0089u\u0000\u0095\u00856áW:÷Ø\u0010W°àÑ1q¼\u0092\u0003n5Î¯/0\u008f\u0091ì\bLã\u008c=,ìÍ|m×\u000eI®ûO+ï\u009f\u0088\u0006(\u0099Éòjm\nÉJ®ê4\u000b««\nÈ\u0087hk\u0089é)INÜ'\u0013\u0087ÁfYÆå¥p\u0005\u009fä\u0005Dñ#*\u0083°bÑÁK¡ñ\u0000}à\u0097O\u001c/·\u008e}n·Íß¬J\fþëgK\u0089*\u001f\u008aÏi#É¿¨Ç\u0017^÷ýVc6£\u0095\u0001u\u0085Ô$´²\u0013ßòZR°1f\u0091ãp\u0002ê\fJÛ«Z\u000bçh\u007fÈ\u008a)\u0005\u0089îî?N´¯Í\f\u000fl¿Í:-\u008f\u0082\u0006âìC,£ª\u0000ÍaRÁê&9\u0086\u0091ç\u0001G\u0094¤\"\u0004¸eÙÚL:©\u009bfû\u008aX\u0003¸\u009b\u0019&y¬ÞÖ?\u0019\u009fòü|'s\u0087¤f%Æ\u0098¥\u0000\u0005õäzD\u0091#@\u0083Ëb²Áp¡À\u0000EàðOy/\u0093\u008eZn×Íµ¬+\f\u0097ë\u0018Kñ*\u007f\u008açiBÉ\u0088¨£\u0017#÷\u0096V\n6ó\u0095euóÔ\u0018´×\u0013µ\u0088\n(ØÉ@iü\niª\u0086K\u001cëè\u008c9,²ÍËn\t\u000e¹¯<O\u0082à\u001b\u0080ª!>Á½bð\u0003\\£êDuä\u008b\u0085*%\u0092Æ'f«\u0007È¸AXçùv\u0099\u0086:\u000eÚÔ{,\u001b\u00ad¼Ó]\u001fýô\u009ez(\u0012\u0088ÖiUÉôª*\n\u0092ë\u0007K¶,9\u008cìmØÎI®ü\u000f\u007fï×@\f ±\u0081<a´ÂÓ£V\u0003þä{D\u0089%\u0004\u0085\u0080f4Æé§Ç\u0018HI»é\u0017\b\u008e¨/Ë©kU\u008aÜ*wMãíl&\u008c\u0086\u0019g\u008eÇ=¤®\u0004HåÃVQöÔ\u0017\\·÷Ôgt\u009d\u0095\u00135½Ü~|í\u009d>=Ö^Fþ¥\u001f<¿\u009bØ\u001fx\u0086\u0099®:rZÁûL\u001b¡´=Ô\u0089Üz|à\u009d\u007f=Þ^\fþü\u001f(Ük|ç\u009d~=Ã^Fþ£\u001f;Ük|ç\u009d~=Ã^Fþ£\u001f;¿±Ø\u0004xÊ\u0099¶\u0002ª¢&C¿ã\u0002\u0080\u0087 bÁúap\u0006Å¦\u000bGwä\u0088\u0084S%ÏáãAp £\u0000KcÛÃ8\"¡\u0082\u0006å\u0082E\u001b¤3\u0007ægVÆÃ&0\u0089¯\u0083\u001a#\u0083Â\u001eîþNx¯ò\u000f]lÂÌ)- \u008d\u000bÜM|ò\u009d`=\u0086^fþ¿\u001f6¿\u009aØ\u0015x\u009f\u0099å:6ZÂûU\u001bº´~Ô¯u\n\u0095\u00826éWy÷ÏÜM|ì\u009dt=Ô^[þ£\u001f<¿ÎØ/x¶\u0099Ë:6ZÆûO\u001b¡´2Ô\u0098uB\u0095\u00966éWf÷\u008a\u0010@°öÑjÜM|ì\u009dt=Ô^[þ£\u001f<¿ÎØ/x¶\u0099Ë:6ZÆûO\u001b¡´2Ô\u0098uB\u0095\u00966éWf÷\u008a\u0010@°öÑjq\u008d\u0092V2Âµn\u0015ýô.TÞ7E\u0097¨v,Ö\u0089±\r\u0011\u0090ðõføÆ~'ï\u0087QäÁD0¥¸\u0005\u0015Üz|à\u009d\u007f=Þ^\fþüÜ~|ã\u009d~=Å^\\þ¿34\u0093§rtÒ\u009c±\f\u0011ïðvPÑ7U\u0097ÌväÕ>µ\u009c\u0014\u0011ôì[p<(\u009c»}hÝ\u009b¾\u0007\u001eîÿ`_Ý8F\u0098\u008ay§Ú%º\u009f\u001b\u0019ö Ü~|í\u009d>=Õ^Qþ©\u001f-¿\u009cØ\u0019\u0001ÝÜ~|í\u009d>=Ä^Aþ£\u001f4¿\u008aØRx\u0082\u0099ò:yZÀûO\u001b«´*Üj|÷\u009d|=Ê^kþ²\u001f`¿ØÜ~|í\u009d>=Ä^Aþ£\u001f4¿\u008aØRx\u0094\u0099é:xZÃû_\u001bº´.Ô\u009eu\u000b\u0095\u009e6òÜk|ç\u009d~=Ã^Fþ£\u001f;¿ÁØ\u000fx\u0096\u0099ë:9ZÃû_\u001b¦´;Ô\u009eu\u000b\u0095\u0093¤o\u0004ãåzEÇ&B\u0086§g?Çµ \u0000\u0000Îá²B=\"Ó\u0083Zc§Ì\u0005¬\u0090\r^íÂN\u00ad/w\u008fËhRÈ¯©*\t¿ê\u0007J\u00ad+ø\u0094&t\u009aÅEeÉ\u0084P$íGhç\u008d\u0006\u0015¦ïÁ5a³\u0080Á#_Cæâq\u0002¹\u00ad\u0003Í¦l'\u008cñ/ÏN_îê\ts©\u0092È\u001bh\u009fÜk|ç\u009d~=Ã^Fþ£\u001f;¿ÁØ\nx\u0090\u0099ï:nZ\u009cû\f\u001b¸´qÔ\u009au\u0000\u0095\u009f6þW,÷\u009c\u0010HÜk|í\u009d\u007f=Á^Xþ¯\u001fw¿\u009dØ\u0018x\u0099\u0099ß:qZÔûR\u001b§´0Ô\u0089u=\u0095\u00886¾W\"÷\u0085\u0010_°«Ñ2q·\u0092\u00122\u009fSçìE\fÐ\u00ad\u0006ÍúÜ~|í\u009d>=Ä^[þ¥\u001f,¿\u0082Ø\u0013x\u0093\u0099ä:sZÖÜ~|í\u009d>=Ä^[þ¥\u001f,¿\u0087Ø\u0011x\u0093\u0099ç:sZ\u008aûX\u001b½´7Ô\u0080u\u0006\u0095Þ6àW}÷Ä\u0010_°«Ñ.q¢\u0092\u00122\u009fSêìnl³Ì\u0012-\u008a\u008d*î¥N]¯Â\u000f=húÈ4)Ho\u0099Ï\n.Ù\u008e#í¦MD¬Ó\fmkµËq*\u000e\u0089\u0082é3H±¨N\u0007Àg%Æì&sÜx|ç\u009dc=Ò^\u0019\u0018£¸*Y¿ù\u0014\u009aÜ:\u007fÛè{K\u001c\u0094¼E]#þ½\u009e\u0017?Ñß~pê\u0010E±ÔQEÜ}|ç\u009d}=Ó^\u001aþ¢\u001f/¿ÀØ\u0011x\u0093\u0099é:xZÏû_\u001b±´-Ü}|ç\u009d}=Ó^\u001aþ¹\u001f>¿ÀØ\u001ax\u0093\u0099ë:sZûûY\u001b©´3Ô\u0089u\u0010\u0095\u0091ïHOÒ®H\u000eæm/Í\u008c,\u000b\u008cõë%K¤ªÑ\t|iõÈj(\u0093\u0087\u0018ç°F#¦¼Ü~|í\u009d>=Í^Qþ¸\u001f6¿\u008bØ\u0010xÜ\u0099á:xZÀûH\u001b§´7Ô\u0088uL\u0095\u00816ãWy÷ß\u0010\\Ü~|í\u009d>=Ä^[þ¥\u001f,¿ÀØ\rx\u0097\u0099í:cZ\u008aû[\u001b¾´:Ô³u\f\u0095\u00916ëWqÜ~|í\u009d>=É^Pþ§\u001fv¿\u008cØ\tx\u009b\u0099ì:rZ\u008aû\\\u001b¡´0Ô\u008bu\u0007\u0095\u00826öWf÷Ã\u0010V°ºEeåö\u0004%¤ÍÇ]g¾\u0086'&\u0080A\u0004á\u009d\u0000µ£oÃÊbH\u0082¿-!MÙì\u001f\f\u0082¯óÎhnÔ\u0089Q)¥H5è \u000b\u0015«\u0099g\u001eÇ\u008d&^\u0086µå-EÙ¤L\u0004ëcqÃ¼\"\u0082\u0081\u0003á\u00ad@6 Ì\u000f\u0010oêÎk.þ\u008d\u0081ì\u0011L¸«(\u000bÜjUÊÜ)tÜ~|í\u009d>=Õ^Mþ¹\u001f,¿\u008bØ\u0011x\u00ad\u0099å:nZÐû\u0014\u001bª´+Ô\u0085u\u000e\u0095\u00946¨Wr÷Ã\u0010V°©Ñ9q \u0092\u00102\u0084Síìt\fÜ\u009as:àÛ3{Ý\u0018\\¸©Y1ù\u008c\u009e\u0003>Ñßï|n\u001cÀ½[]¡ò}\u0092\u00873\u0006Ó\u0093pì\u0011|±ÕVEö±\u009787±Ô\u0019Ü~|í\u009d>=Ð^Qþ¤\u001f<¿\u0081Ø\u000ex\u00ad\u0099ä:zZÏûW\u001bæ´<Ô\u0099u\u000b\u0095\u009c6âW:÷Ì\u0010Q° Ñ;q·\u0092\u00122\u0086Söìs\fÆ\u00adJÜ$í\u009cM\u001eÜ6\u0086\u009cG\bçÍ\u0006^¦ûÅ0e\u0090\u0084\u0016$¨C\"ã\u0086\u0002Û¡TÁÿ`t4Ý\u0094\u0018u\u008bÕ.¶å\u0016G÷ÉWs0é\u0090iq\nÒÇ²8\u0013¥óE\\Å<p\u009dý}`Þ\u001c¿µ\u001f3ø£X^9Û\u0099HÜ#|æ\u009du=Ð^\u001bþ¹\u001f7¿\u008dØ\u0017x\u0097\u0099ô:9ZÃû_\u001b¦´'Ô\u0088Ukõ®\u0014=´\u0098×Swñ\u0096\u007f6ÅQ_ñß\u0010¼³qÓ\u009dr\u0017\u0092í=c]À2ï\u0092=s¥Ó\u0019°×\u0010wññQO6Å\u0096aw8Ô¨´\t\u0015\u0095õaØ\u000fxÝ\u0099E9ùZlú\u0083\u001b\u0019»íÜ<|·\u009dÎ>\u0015^äÿ\u007f\u001f\u0086°\u0011Ð\u009fq#\u0091½2ÆSTóé\u0014w´½Õ\u0014u\u009b\u0096.6¯WÏèi\bõ©wÉ\u008dj\u001b\u008aÒ+9K·ùåY ¸³\u0018\u0016{ÝÛn:í\u009a\\ýå]S¼6\u001f£Ü#|æ\u009du=Ð^\u001bþ¨\u001f+¿\u009aØ#x\u0086\u0099é:{ZÁÜ#|æ\u009du=Ð^\u001bþ¹\u001f7¿\u008dØ\u0017x\u0097\u0099ô:9ZÆûI\u001b¼´8Ô\u0083u\u000e\u0095\u00946ãWf÷ÎIèé:\b¢¨\u001eË\u008bkd\u008aþ*\nMÛíP\f)¯òÏ\u0003n\u0098\u008ea!÷ATàÝ\u0000]£\"Â³b\u0005\u0085\u0096%wDÈäs\u0007Å§TÆay¢\u0099\fÜ#|æ\u009du=Ð^\u001bþ¨\u001f+¿\u009aØ\u001dx\u0091\u0099ã:sh\u0000ÈÅ)V\u0089óê8J\u008b«\b\u000b¹l8Ì¨-Ñ\u008eZ\u001aÐº\u0015[\u0086û#\u0098è8[ÙØyi\u001eâ¾d_\u0014ü\u008bÜ#|æ\u009du=Ð^\u001bþ¨\u001f+¿\u009aØ\u0013x\u0080\u0099é:s\u0081e! À3`\u0096\u0003]£îBmâÜ\u0085L%ÙÄµg7\u0088Z(\u009fÉ\fi©\nbªÑKRëã\u008cu,ìÍ\u0098n\u0006\u000e\u00ad¯ Wå÷ \u0016³¶\u0016ÕÝun\u0094í4\\Såó]\u0012+±µÜ#|æ\u009dq=Ò^Uþå\u001f<¿\u0081Ø\u000bx\u009c\u0099ì:yZÅû^\u001b»´qÔÂu\u001a\u0095\u00926©Wv÷Ù\u0010L°¥¬\b\fÄíUMù.0\u008e\u0096o\u001aÏ«¨3\b¶éÜJN* \u008bSk\u0090Ä\u0001¤\u0094\u0005!åºFß'Z\u0087å`UÀ\u008a¡\u001b\u0001\u009dâ.B¯\u0017¤·uVåöN\u0095Ð5bÔ¶t\u0006\u0013\u008b³\u001aRuñå\u0091PÜ<|ä\u009dv=\u0086^\u000eÜ#|ò\u009db=É^Wþå\u001f+¿\u008bØ\u0010x\u0094\u0099¯:{ZÅûJ\u001b»J,ê·\u000b6«\u008dÈ\u001fhâ\u0089|)\u0087N\\îÚ\u000f«¬5Ì\u0085m\u0014\u008dü\"qB\u0085ãV\u0003Øo\u0015Ï\u009e.\u0007\u008e\u0094í\rMú¬~\fÄkkËô*\u0081\u0089Mé¢H ¬c\f§í$M\u0085.[\u008eço}ÏÊ¨U\bÓé\u009fJ5*\u008b\u008b\u001ekíÄ}¤ß\u0005\fåÈF«'8RUòÕ\u0013^³øÐ|p\u0085\u0091\u00021¶V,öºG\u009cçX\u0006Û¦zÅ¤e\u0018\u0084\u0088$$C\u00adã9\u0002L\u00adQ\r\u0094ì\u0003L /'\u008f\u0097nNÎó©y\tîè\u009eK\u000b+·\u008a,jÉÅ\u0003¥°\u0004täòGÛ&\u0007\u0086¨a:ÁÏ \u0000\u0000Øã\u007fCèÜ#|ò\u009db=É^Wþå\u001f;¿\u009eØ\tx\u009b\u0099î:pZËÜK|í\u009d|=Â^Rþ£\u001f+¿\u0086^µþp\u001fç¿DÜÃ|s\u009d£=\u0011Z\u0099ú\u0007\u001b9¸ðØ@yÃ\u009986¡V\u0016÷\u0091\u0017\u0015´?ÕáuI\u0092Ü2wSúók\u0010\u0095°\u000fÑ\u007fn¢\u008eS/ÁO9ì¦\f)\u00ad\u0086Í\u000bjn\u008bú+\u0016HÇèA\t»©5Æ\u009bf\u0001\u0087{".getBytes(CharsetNames.ISO_8859_1)).asCharBuffer().get(cArr, 0, 2156);
                write = cArr;
                AudioAttributesCompatParcelizer = -6428703623784727422L;
            }
        });

        private RemoteActionCompatParcelizer() {
        }

        public static RemoteActionCompatParcelizer AudioAttributesCompatParcelizer() {
            RemoteActionCompatParcelizer remoteActionCompatParcelizer;
            synchronized (RemoteActionCompatParcelizer.class) {
                if (AudioAttributesCompatParcelizer == null) {
                    AudioAttributesCompatParcelizer = new RemoteActionCompatParcelizer();
                }
                remoteActionCompatParcelizer = AudioAttributesCompatParcelizer;
            }
            return remoteActionCompatParcelizer;
        }

        protected static String AudioAttributesCompatParcelizer(long j) {
            return write.get(Long.valueOf(j));
        }

        protected static boolean IconCompatParcelizer(long j) {
            return write.containsKey(Long.valueOf(j));
        }

        protected static String read() {
            return setOutputStreamInfo.read;
        }

        @Override // kotlin.getOutputStreamOffsetUs
        protected final String ae_() {
            return "fpr_log_source";
        }

        @Override // kotlin.getOutputStreamOffsetUs
        protected final String ad_() {
            return "com.google.firebase.perf.LogSourceName";
        }
    }

    protected static final class write extends getOutputStreamOffsetUs<Double> {
        private static write write;

        private write() {
        }

        protected static write AudioAttributesCompatParcelizer() {
            write writeVar;
            synchronized (write.class) {
                if (write == null) {
                    write = new write();
                }
                writeVar = write;
            }
            return writeVar;
        }

        protected static Double read() {
            return Double.valueOf(0.0d);
        }

        @Override // kotlin.getOutputStreamOffsetUs
        protected final String ae_() {
            return "fpr_vc_fragment_sampling_rate";
        }

        @Override // kotlin.getOutputStreamOffsetUs
        protected final String ad_() {
            return "com.google.firebase.perf.FragmentSamplingRate";
        }

        @Override // kotlin.getOutputStreamOffsetUs
        protected final String IconCompatParcelizer() {
            return "fragment_sampling_percentage";
        }
    }

    protected static final class read extends getOutputStreamOffsetUs<Boolean> {
        private static read AudioAttributesCompatParcelizer;

        private read() {
        }

        protected static read read() {
            read readVar;
            synchronized (read.class) {
                if (AudioAttributesCompatParcelizer == null) {
                    AudioAttributesCompatParcelizer = new read();
                }
                readVar = AudioAttributesCompatParcelizer;
            }
            return readVar;
        }

        protected static Boolean AudioAttributesCompatParcelizer() {
            return Boolean.FALSE;
        }

        @Override // kotlin.getOutputStreamOffsetUs
        protected final String ae_() {
            return "fpr_experiment_app_start_ttid";
        }

        @Override // kotlin.getOutputStreamOffsetUs
        protected final String ad_() {
            return "com.google.firebase.perf.ExperimentTTID";
        }

        @Override // kotlin.getOutputStreamOffsetUs
        protected final String IconCompatParcelizer() {
            return "experiment_app_start_ttid";
        }
    }
}
