package kotlin;

import android.content.Context;
import com.google.firebase.perf.session.PerfSession;
import com.google.firebase.perf.util.Timer;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import kotlin.copyWithAppendedEntriesFrom;

/* JADX INFO: loaded from: classes3.dex */
public class isAlias {
    private static final isAlias write;
    private final maybeInitCodecOrBypass AudioAttributesCompatParcelizer;
    private final appendNumberOfSamples<isVendor> AudioAttributesImplApi21Parcelizer;
    private String AudioAttributesImplApi26Parcelizer;
    private final sortByScore AudioAttributesImplBaseParcelizer;
    private lambdasetOnFrameRenderedListener0comgoogleandroidexoplayer2mediacodecSynchronousMediaCodecAdapter IconCompatParcelizer;
    private isSoftwareOnlyV29 MediaBrowserCompatCustomActionResultReceiver;
    private final appendNumberOfSamples<ScheduledExecutorService> MediaBrowserCompatItemReceiver;
    private final appendNumberOfSamples<getHevcProfileAndLevel> RemoteActionCompatParcelizer;
    private ScheduledFuture read;

    static {
        MediaCodecRendererDecoderInitializationException.IconCompatParcelizer();
        write = new isAlias();
    }

    private isAlias() {
        this(new appendNumberOfSamples(new onInputBufferAvailable() { // from class: o.isHardwareAccelerated
            @Override // kotlin.onInputBufferAvailable
            public final Object write() {
                return Executors.newSingleThreadScheduledExecutor();
            }
        }), sortByScore.read(), maybeInitCodecOrBypass.IconCompatParcelizer(), new appendNumberOfSamples(new onInputBufferAvailable() { // from class: o.isSoftwareOnly
            @Override // kotlin.onInputBufferAvailable
            public final Object write() {
                return isAlias.RemoteActionCompatParcelizer();
            }
        }), new appendNumberOfSamples(new onInputBufferAvailable() { // from class: o.isHardwareAcceleratedV29
            @Override // kotlin.onInputBufferAvailable
            public final Object write() {
                return isAlias.IconCompatParcelizer();
            }
        }));
    }

    static /* synthetic */ getHevcProfileAndLevel RemoteActionCompatParcelizer() {
        return new getHevcProfileAndLevel();
    }

    static /* synthetic */ isVendor IconCompatParcelizer() {
        return new isVendor();
    }

    private isAlias(appendNumberOfSamples<ScheduledExecutorService> appendnumberofsamples, sortByScore sortbyscore, maybeInitCodecOrBypass maybeinitcodecorbypass, appendNumberOfSamples<getHevcProfileAndLevel> appendnumberofsamples2, appendNumberOfSamples<isVendor> appendnumberofsamples3) {
        this.read = null;
        this.AudioAttributesImplApi26Parcelizer = null;
        this.IconCompatParcelizer = lambdasetOnFrameRenderedListener0comgoogleandroidexoplayer2mediacodecSynchronousMediaCodecAdapter.APPLICATION_PROCESS_STATE_UNKNOWN;
        this.MediaBrowserCompatItemReceiver = appendnumberofsamples;
        this.AudioAttributesImplBaseParcelizer = sortbyscore;
        this.AudioAttributesCompatParcelizer = maybeinitcodecorbypass;
        this.MediaBrowserCompatCustomActionResultReceiver = null;
        this.RemoteActionCompatParcelizer = appendnumberofsamples2;
        this.AudioAttributesImplApi21Parcelizer = appendnumberofsamples3;
    }

    public final void IconCompatParcelizer(Context context) {
        this.MediaBrowserCompatCustomActionResultReceiver = new isSoftwareOnlyV29(context);
    }

    public static isAlias read() {
        isAlias isalias;
        synchronized (isAlias.class) {
            isalias = write;
        }
        return isalias;
    }

    public final void IconCompatParcelizer(PerfSession perfSession, final lambdasetOnFrameRenderedListener0comgoogleandroidexoplayer2mediacodecSynchronousMediaCodecAdapter lambdasetonframerenderedlistener0comgoogleandroidexoplayer2mediacodecsynchronousmediacodecadapter) {
        if (this.AudioAttributesImplApi26Parcelizer != null) {
            AudioAttributesCompatParcelizer();
        }
        long j = read(lambdasetonframerenderedlistener0comgoogleandroidexoplayer2mediacodecsynchronousmediacodecadapter, perfSession.RemoteActionCompatParcelizer());
        if (j == -1) {
            return;
        }
        final String strWrite = perfSession.write();
        this.AudioAttributesImplApi26Parcelizer = strWrite;
        this.IconCompatParcelizer = lambdasetonframerenderedlistener0comgoogleandroidexoplayer2mediacodecsynchronousmediacodecadapter;
        try {
            long j2 = j * 20;
            this.read = this.MediaBrowserCompatItemReceiver.write().scheduleAtFixedRate(new Runnable() { // from class: o.isCodecUsableDecoder
                @Override // java.lang.Runnable
                public final void run() {
                    this.read.IconCompatParcelizer(strWrite, lambdasetonframerenderedlistener0comgoogleandroidexoplayer2mediacodecsynchronousmediacodecadapter);
                }
            }, j2, j2, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e) {
            e.getMessage();
        }
    }

    private long read(lambdasetOnFrameRenderedListener0comgoogleandroidexoplayer2mediacodecSynchronousMediaCodecAdapter lambdasetonframerenderedlistener0comgoogleandroidexoplayer2mediacodecsynchronousmediacodecadapter, Timer timer) {
        long jWrite = write(lambdasetonframerenderedlistener0comgoogleandroidexoplayer2mediacodecsynchronousmediacodecadapter);
        if (!write(jWrite, timer)) {
            jWrite = -1;
        }
        long j = read(lambdasetonframerenderedlistener0comgoogleandroidexoplayer2mediacodecsynchronousmediacodecadapter);
        return read(j, timer) ? jWrite == -1 ? j : Math.min(jWrite, j) : jWrite;
    }

    public final void AudioAttributesCompatParcelizer() {
        final String str = this.AudioAttributesImplApi26Parcelizer;
        if (str == null) {
            return;
        }
        final lambdasetOnFrameRenderedListener0comgoogleandroidexoplayer2mediacodecSynchronousMediaCodecAdapter lambdasetonframerenderedlistener0comgoogleandroidexoplayer2mediacodecsynchronousmediacodecadapter = this.IconCompatParcelizer;
        this.RemoteActionCompatParcelizer.write().write();
        this.AudioAttributesImplApi21Parcelizer.write().write();
        ScheduledFuture scheduledFuture = this.read;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.MediaBrowserCompatItemReceiver.write().schedule(new Runnable() { // from class: o.isAliasV29
            @Override // java.lang.Runnable
            public final void run() {
                this.RemoteActionCompatParcelizer.write(str, lambdasetonframerenderedlistener0comgoogleandroidexoplayer2mediacodecsynchronousmediacodecadapter);
            }
        }, 20L, TimeUnit.MILLISECONDS);
        this.AudioAttributesImplApi26Parcelizer = null;
        this.IconCompatParcelizer = lambdasetOnFrameRenderedListener0comgoogleandroidexoplayer2mediacodecSynchronousMediaCodecAdapter.APPLICATION_PROCESS_STATE_UNKNOWN;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public void write(String str, lambdasetOnFrameRenderedListener0comgoogleandroidexoplayer2mediacodecSynchronousMediaCodecAdapter lambdasetonframerenderedlistener0comgoogleandroidexoplayer2mediacodecsynchronousmediacodecadapter) {
        copyWithAppendedEntriesFrom.IconCompatParcelizer iconCompatParcelizerRemoteActionCompatParcelizer = copyWithAppendedEntriesFrom.RemoteActionCompatParcelizer();
        while (!this.RemoteActionCompatParcelizer.write().RemoteActionCompatParcelizer.isEmpty()) {
            iconCompatParcelizerRemoteActionCompatParcelizer.write(this.RemoteActionCompatParcelizer.write().RemoteActionCompatParcelizer.poll());
        }
        while (!this.AudioAttributesImplApi21Parcelizer.write().read.isEmpty()) {
            iconCompatParcelizerRemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(this.AudioAttributesImplApi21Parcelizer.write().read.poll());
        }
        iconCompatParcelizerRemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(str);
        this.AudioAttributesImplBaseParcelizer.write(iconCompatParcelizerRemoteActionCompatParcelizer.MediaBrowserCompatMediaItem(), lambdasetonframerenderedlistener0comgoogleandroidexoplayer2mediacodecsynchronousmediacodecadapter);
    }

    public final boolean read(String str, lambdasetOnFrameRenderedListener0comgoogleandroidexoplayer2mediacodecSynchronousMediaCodecAdapter lambdasetonframerenderedlistener0comgoogleandroidexoplayer2mediacodecsynchronousmediacodecadapter) {
        if (this.MediaBrowserCompatCustomActionResultReceiver == null) {
            return false;
        }
        this.AudioAttributesImplBaseParcelizer.write(copyWithAppendedEntriesFrom.RemoteActionCompatParcelizer().AudioAttributesCompatParcelizer(str).AudioAttributesCompatParcelizer(MediaBrowserCompatItemReceiver()).MediaBrowserCompatMediaItem(), lambdasetonframerenderedlistener0comgoogleandroidexoplayer2mediacodecsynchronousmediacodecadapter);
        return true;
    }

    private copyWithPresentationTimeUs MediaBrowserCompatItemReceiver() {
        return copyWithPresentationTimeUs.RemoteActionCompatParcelizer().RemoteActionCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver.AudioAttributesCompatParcelizer()).AudioAttributesCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver.read()).read(this.MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer()).MediaBrowserCompatMediaItem();
    }

    private boolean write(long j, Timer timer) {
        if (j == -1) {
            return false;
        }
        this.RemoteActionCompatParcelizer.write().IconCompatParcelizer(j, timer);
        return true;
    }

    private boolean read(long j, Timer timer) {
        if (j == -1) {
            return false;
        }
        this.AudioAttributesImplApi21Parcelizer.write().write(j, timer);
        return true;
    }

    public final void IconCompatParcelizer(Timer timer) {
        read(this.RemoteActionCompatParcelizer.write(), this.AudioAttributesImplApi21Parcelizer.write(), timer);
    }

    private static void read(getHevcProfileAndLevel gethevcprofileandlevel, isVendor isvendor, Timer timer) {
        gethevcprofileandlevel.IconCompatParcelizer(timer);
        isvendor.IconCompatParcelizer(timer);
    }

    /* JADX INFO: renamed from: o.isAlias$5, reason: invalid class name */
    static /* synthetic */ class AnonymousClass5 {
        static final /* synthetic */ int[] AudioAttributesCompatParcelizer;

        static {
            int[] iArr = new int[lambdasetOnFrameRenderedListener0comgoogleandroidexoplayer2mediacodecSynchronousMediaCodecAdapter.values().length];
            AudioAttributesCompatParcelizer = iArr;
            try {
                iArr[lambdasetOnFrameRenderedListener0comgoogleandroidexoplayer2mediacodecSynchronousMediaCodecAdapter.BACKGROUND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                AudioAttributesCompatParcelizer[lambdasetOnFrameRenderedListener0comgoogleandroidexoplayer2mediacodecSynchronousMediaCodecAdapter.FOREGROUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    private long write(lambdasetOnFrameRenderedListener0comgoogleandroidexoplayer2mediacodecSynchronousMediaCodecAdapter lambdasetonframerenderedlistener0comgoogleandroidexoplayer2mediacodecsynchronousmediacodecadapter) {
        long jMediaBrowserCompatCustomActionResultReceiver;
        int i = AnonymousClass5.AudioAttributesCompatParcelizer[lambdasetonframerenderedlistener0comgoogleandroidexoplayer2mediacodecsynchronousmediacodecadapter.ordinal()];
        if (i == 1) {
            jMediaBrowserCompatCustomActionResultReceiver = this.AudioAttributesCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver();
        } else {
            jMediaBrowserCompatCustomActionResultReceiver = i != 2 ? -1L : this.AudioAttributesCompatParcelizer.MediaBrowserCompatMediaItem();
        }
        if (getHevcProfileAndLevel.write(jMediaBrowserCompatCustomActionResultReceiver)) {
            return -1L;
        }
        return jMediaBrowserCompatCustomActionResultReceiver;
    }

    private long read(lambdasetOnFrameRenderedListener0comgoogleandroidexoplayer2mediacodecSynchronousMediaCodecAdapter lambdasetonframerenderedlistener0comgoogleandroidexoplayer2mediacodecsynchronousmediacodecadapter) {
        long jMediaDescriptionCompat;
        int i = AnonymousClass5.AudioAttributesCompatParcelizer[lambdasetonframerenderedlistener0comgoogleandroidexoplayer2mediacodecsynchronousmediacodecadapter.ordinal()];
        if (i == 1) {
            jMediaDescriptionCompat = this.AudioAttributesCompatParcelizer.MediaDescriptionCompat();
        } else {
            jMediaDescriptionCompat = i != 2 ? -1L : this.AudioAttributesCompatParcelizer.MediaMetadataCompat();
        }
        if (isVendor.read(jMediaDescriptionCompat)) {
            return -1L;
        }
        return jMediaDescriptionCompat;
    }
}
