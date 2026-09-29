package kotlin;

import android.content.Context;
import com.google.firebase.perf.util.Timer;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import kotlin.getScore;

/* JADX INFO: loaded from: classes3.dex */
final class maxH264DecodableFrameSize {
    private boolean AudioAttributesCompatParcelizer;
    private final maybeInitCodecOrBypass IconCompatParcelizer;
    private IconCompatParcelizer MediaBrowserCompatItemReceiver;
    private IconCompatParcelizer RemoteActionCompatParcelizer;
    private final double read;
    private final double write;

    public maxH264DecodableFrameSize(Context context, MediaCodecUtilMediaCodecListCompat mediaCodecUtilMediaCodecListCompat) {
        this(mediaCodecUtilMediaCodecListCompat, 500L, new MediaCodecUtilCodecKey(), read(), read(), maybeInitCodecOrBypass.IconCompatParcelizer());
        this.AudioAttributesCompatParcelizer = secureDecodersExplicit.read(context);
    }

    private static double read() {
        return new Random().nextDouble();
    }

    private maxH264DecodableFrameSize(MediaCodecUtilMediaCodecListCompat mediaCodecUtilMediaCodecListCompat, long j, MediaCodecUtilCodecKey mediaCodecUtilCodecKey, double d, double d2, maybeInitCodecOrBypass maybeinitcodecorbypass) {
        this.MediaBrowserCompatItemReceiver = null;
        this.RemoteActionCompatParcelizer = null;
        boolean z = false;
        this.AudioAttributesCompatParcelizer = false;
        secureDecodersExplicit.read(0.0d <= d && d < 1.0d, "Sampling bucket ID should be in range [0.0, 1.0).");
        if (0.0d <= d2 && d2 < 1.0d) {
            z = true;
        }
        secureDecodersExplicit.read(z, "Fragment sampling bucket ID should be in range [0.0, 1.0).");
        this.write = d;
        this.read = d2;
        this.IconCompatParcelizer = maybeinitcodecorbypass;
        this.MediaBrowserCompatItemReceiver = new IconCompatParcelizer(mediaCodecUtilMediaCodecListCompat, 500L, mediaCodecUtilCodecKey, maybeinitcodecorbypass, "Trace", this.AudioAttributesCompatParcelizer);
        this.RemoteActionCompatParcelizer = new IconCompatParcelizer(mediaCodecUtilMediaCodecListCompat, 500L, mediaCodecUtilCodecKey, maybeinitcodecorbypass, "Network", this.AudioAttributesCompatParcelizer);
    }

    private boolean write() {
        return this.write < this.IconCompatParcelizer.onAddQueueItem();
    }

    private boolean AudioAttributesCompatParcelizer() {
        return this.write < this.IconCompatParcelizer.AudioAttributesImplApi26Parcelizer();
    }

    private boolean RemoteActionCompatParcelizer() {
        return this.read < this.IconCompatParcelizer.RemoteActionCompatParcelizer();
    }

    private static boolean read(getWrappedMetadataBytes getwrappedmetadatabytes) {
        return getwrappedmetadatabytes.AudioAttributesImplApi26Parcelizer() && getwrappedmetadatabytes.AudioAttributesImplApi21Parcelizer().MediaBrowserCompatItemReceiver().startsWith("_st_") && getwrappedmetadatabytes.AudioAttributesImplApi21Parcelizer().RemoteActionCompatParcelizer("Hosting_activity");
    }

    final boolean IconCompatParcelizer(getWrappedMetadataBytes getwrappedmetadatabytes) {
        boolean zIconCompatParcelizer;
        if (!AudioAttributesCompatParcelizer(getwrappedmetadatabytes)) {
            return false;
        }
        if (getwrappedmetadatabytes.MediaBrowserCompatItemReceiver()) {
            zIconCompatParcelizer = this.RemoteActionCompatParcelizer.IconCompatParcelizer();
        } else {
            if (!getwrappedmetadatabytes.AudioAttributesImplApi26Parcelizer()) {
                return true;
            }
            zIconCompatParcelizer = this.MediaBrowserCompatItemReceiver.IconCompatParcelizer();
        }
        return !zIconCompatParcelizer;
    }

    final boolean RemoteActionCompatParcelizer(getWrappedMetadataBytes getwrappedmetadatabytes) {
        if (getwrappedmetadatabytes.AudioAttributesImplApi26Parcelizer() && !write() && !write(getwrappedmetadatabytes.AudioAttributesImplApi21Parcelizer().AudioAttributesImplBaseParcelizer())) {
            return false;
        }
        if (!read(getwrappedmetadatabytes) || RemoteActionCompatParcelizer() || write(getwrappedmetadatabytes.AudioAttributesImplApi21Parcelizer().AudioAttributesImplBaseParcelizer())) {
            return !getwrappedmetadatabytes.MediaBrowserCompatItemReceiver() || AudioAttributesCompatParcelizer() || write(getwrappedmetadatabytes.IconCompatParcelizer().MediaBrowserCompatItemReceiver());
        }
        return false;
    }

    private static boolean write(List<MetadataDecoderFactory> list) {
        return list.size() > 0 && list.get(0).RemoteActionCompatParcelizer() > 0 && list.get(0).read() == MetadataDecoderFactory1.GAUGES_AND_SYSTEM_EVENTS;
    }

    private static boolean AudioAttributesCompatParcelizer(getWrappedMetadataBytes getwrappedmetadatabytes) {
        return (!getwrappedmetadatabytes.AudioAttributesImplApi26Parcelizer() || (!(getwrappedmetadatabytes.AudioAttributesImplApi21Parcelizer().MediaBrowserCompatItemReceiver().equals(getScore.AudioAttributesCompatParcelizer.FOREGROUND_TRACE_NAME.toString()) || getwrappedmetadatabytes.AudioAttributesImplApi21Parcelizer().MediaBrowserCompatItemReceiver().equals(getScore.AudioAttributesCompatParcelizer.BACKGROUND_TRACE_NAME.toString())) || getwrappedmetadatabytes.AudioAttributesImplApi21Parcelizer().AudioAttributesCompatParcelizer() <= 0)) && !getwrappedmetadatabytes.AudioAttributesImplBaseParcelizer();
    }

    final void AudioAttributesCompatParcelizer(boolean z) {
        this.MediaBrowserCompatItemReceiver.read(z);
        this.RemoteActionCompatParcelizer.read(z);
    }

    static class IconCompatParcelizer {
        private static final long read;
        private long AudioAttributesCompatParcelizer;
        private MediaCodecUtilMediaCodecListCompat AudioAttributesImplApi21Parcelizer;
        private MediaCodecUtilMediaCodecListCompat AudioAttributesImplApi26Parcelizer;
        private Timer AudioAttributesImplBaseParcelizer = MediaCodecUtilCodecKey.AudioAttributesCompatParcelizer();
        private long IconCompatParcelizer;
        private final boolean MediaBrowserCompatCustomActionResultReceiver;
        private long MediaBrowserCompatItemReceiver;
        private double MediaBrowserCompatSearchResultReceiver;
        private final MediaCodecUtilCodecKey RemoteActionCompatParcelizer;
        private MediaCodecUtilMediaCodecListCompat write;

        static {
            MediaCodecRendererDecoderInitializationException.IconCompatParcelizer();
            read = TimeUnit.SECONDS.toMicros(1L);
        }

        IconCompatParcelizer(MediaCodecUtilMediaCodecListCompat mediaCodecUtilMediaCodecListCompat, long j, MediaCodecUtilCodecKey mediaCodecUtilCodecKey, maybeInitCodecOrBypass maybeinitcodecorbypass, String str, boolean z) {
            this.RemoteActionCompatParcelizer = mediaCodecUtilCodecKey;
            this.AudioAttributesCompatParcelizer = j;
            this.AudioAttributesImplApi26Parcelizer = mediaCodecUtilMediaCodecListCompat;
            this.MediaBrowserCompatSearchResultReceiver = j;
            write(maybeinitcodecorbypass, str, z);
            this.MediaBrowserCompatCustomActionResultReceiver = z;
        }

        final boolean IconCompatParcelizer() {
            synchronized (this) {
                Timer timerAudioAttributesCompatParcelizer = MediaCodecUtilCodecKey.AudioAttributesCompatParcelizer();
                double dWrite = (this.AudioAttributesImplBaseParcelizer.write(timerAudioAttributesCompatParcelizer) * this.AudioAttributesImplApi26Parcelizer.IconCompatParcelizer()) / read;
                if (dWrite > 0.0d) {
                    this.MediaBrowserCompatSearchResultReceiver = Math.min(this.MediaBrowserCompatSearchResultReceiver + dWrite, this.AudioAttributesCompatParcelizer);
                    this.AudioAttributesImplBaseParcelizer = timerAudioAttributesCompatParcelizer;
                }
                double d = this.MediaBrowserCompatSearchResultReceiver;
                if (d < 1.0d) {
                    return false;
                }
                this.MediaBrowserCompatSearchResultReceiver = d - 1.0d;
                return true;
            }
        }

        final void read(boolean z) {
            synchronized (this) {
                this.AudioAttributesImplApi26Parcelizer = z ? this.AudioAttributesImplApi21Parcelizer : this.write;
                this.AudioAttributesCompatParcelizer = z ? this.MediaBrowserCompatItemReceiver : this.IconCompatParcelizer;
            }
        }

        private void write(maybeInitCodecOrBypass maybeinitcodecorbypass, String str, boolean z) {
            long j = read(maybeinitcodecorbypass, str);
            long jWrite = write(maybeinitcodecorbypass, str);
            MediaCodecUtilMediaCodecListCompat mediaCodecUtilMediaCodecListCompat = new MediaCodecUtilMediaCodecListCompat(jWrite, j, TimeUnit.SECONDS);
            this.AudioAttributesImplApi21Parcelizer = mediaCodecUtilMediaCodecListCompat;
            this.MediaBrowserCompatItemReceiver = jWrite;
            if (z) {
                new Object[]{str, mediaCodecUtilMediaCodecListCompat, Long.valueOf(jWrite)};
            }
            long jIconCompatParcelizer = IconCompatParcelizer(maybeinitcodecorbypass, str);
            long jRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(maybeinitcodecorbypass, str);
            MediaCodecUtilMediaCodecListCompat mediaCodecUtilMediaCodecListCompat2 = new MediaCodecUtilMediaCodecListCompat(jRemoteActionCompatParcelizer, jIconCompatParcelizer, TimeUnit.SECONDS);
            this.write = mediaCodecUtilMediaCodecListCompat2;
            this.IconCompatParcelizer = jRemoteActionCompatParcelizer;
            if (z) {
                new Object[]{str, mediaCodecUtilMediaCodecListCompat2, Long.valueOf(jRemoteActionCompatParcelizer)};
            }
        }

        private static long read(maybeInitCodecOrBypass maybeinitcodecorbypass, String str) {
            if (str == "Trace") {
                return maybeinitcodecorbypass.MediaBrowserCompatItemReceiver();
            }
            return maybeinitcodecorbypass.MediaBrowserCompatItemReceiver();
        }

        private static long write(maybeInitCodecOrBypass maybeinitcodecorbypass, String str) {
            if (str == "Trace") {
                return maybeinitcodecorbypass.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
            }
            return maybeinitcodecorbypass.AudioAttributesImplBaseParcelizer();
        }

        private static long IconCompatParcelizer(maybeInitCodecOrBypass maybeinitcodecorbypass, String str) {
            if (str == "Trace") {
                return maybeinitcodecorbypass.MediaBrowserCompatItemReceiver();
            }
            return maybeinitcodecorbypass.MediaBrowserCompatItemReceiver();
        }

        private static long RemoteActionCompatParcelizer(maybeInitCodecOrBypass maybeinitcodecorbypass, String str) {
            if (str == "Trace") {
                return maybeinitcodecorbypass.onCustomAction();
            }
            return maybeinitcodecorbypass.AudioAttributesImplApi21Parcelizer();
        }
    }
}
