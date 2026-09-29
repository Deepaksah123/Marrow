package kotlin;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseApp;
import java.lang.ref.WeakReference;
import java.text.DecimalFormat;
import java.util.Collections;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.SynchronousMediaCodecAdapter;
import kotlin.getCodecOutputMediaFormat;
import kotlin.getScore;
import kotlin.getWrappedMetadataBytes;

/* JADX INFO: loaded from: classes3.dex */
public final class sortByScore implements getCodecOutputMediaFormat.write {
    private static final sortByScore AudioAttributesCompatParcelizer;
    private updateCodecOperatingRate AudioAttributesImplApi26Parcelizer;
    private hasSamples AudioAttributesImplBaseParcelizer;
    private SynchronousMediaCodecAdapter.IconCompatParcelizer IconCompatParcelizer;
    private maybeInitCodecOrBypass MediaBrowserCompatCustomActionResultReceiver;
    private FirebaseApp MediaBrowserCompatItemReceiver;
    private isVendorV29 MediaBrowserCompatMediaItem;
    private String MediaDescriptionCompat;
    private onInputBufferAvailable<DrmUtilApi18> RatingCompat;
    private Context RemoteActionCompatParcelizer;
    private String onCommand;
    private maxH264DecodableFrameSize onCustomAction;
    private getCodecOutputMediaFormat read;
    private final Map<String, Integer> write;
    private final ConcurrentLinkedQueue<mp4aAudioObjectTypeToProfile> onAddQueueItem = new ConcurrentLinkedQueue<>();
    private final AtomicBoolean MediaMetadataCompat = new AtomicBoolean(false);
    private boolean MediaBrowserCompatSearchResultReceiver = false;
    private ExecutorService AudioAttributesImplApi21Parcelizer = new ThreadPoolExecutor(0, 1, 10, TimeUnit.SECONDS, new LinkedBlockingQueue());

    static {
        MediaCodecRendererDecoderInitializationException.IconCompatParcelizer();
        AudioAttributesCompatParcelizer = new sortByScore();
    }

    private sortByScore() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.write = concurrentHashMap;
        concurrentHashMap.put("KEY_AVAILABLE_TRACES_FOR_CACHING", 50);
        concurrentHashMap.put("KEY_AVAILABLE_NETWORK_REQUESTS_FOR_CACHING", 50);
        concurrentHashMap.put("KEY_AVAILABLE_GAUGES_FOR_CACHING", 50);
    }

    public static sortByScore read() {
        return AudioAttributesCompatParcelizer;
    }

    public final void read(FirebaseApp firebaseApp, hasSamples hassamples, onInputBufferAvailable<DrmUtilApi18> oninputbufferavailable) {
        this.MediaBrowserCompatItemReceiver = firebaseApp;
        this.onCommand = firebaseApp.read().write();
        this.AudioAttributesImplBaseParcelizer = hassamples;
        this.RatingCompat = oninputbufferavailable;
        this.AudioAttributesImplApi21Parcelizer.execute(new Runnable() { // from class: o.vp9ProfileNumberToConst
            @Override // java.lang.Runnable
            public final void run() {
                this.write.AudioAttributesCompatParcelizer();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void AudioAttributesCompatParcelizer() {
        Context contextAudioAttributesCompatParcelizer = this.MediaBrowserCompatItemReceiver.AudioAttributesCompatParcelizer();
        this.RemoteActionCompatParcelizer = contextAudioAttributesCompatParcelizer;
        this.MediaDescriptionCompat = contextAudioAttributesCompatParcelizer.getPackageName();
        this.MediaBrowserCompatCustomActionResultReceiver = maybeInitCodecOrBypass.IconCompatParcelizer();
        this.onCustomAction = new maxH264DecodableFrameSize(this.RemoteActionCompatParcelizer, new MediaCodecUtilMediaCodecListCompat(100L, 1L, TimeUnit.MINUTES));
        this.read = getCodecOutputMediaFormat.RemoteActionCompatParcelizer();
        this.MediaBrowserCompatMediaItem = new isVendorV29(this.RatingCompat, this.MediaBrowserCompatCustomActionResultReceiver.AudioAttributesCompatParcelizer());
        IconCompatParcelizer();
    }

    private void IconCompatParcelizer() {
        this.read.RemoteActionCompatParcelizer(new WeakReference<>(AudioAttributesCompatParcelizer));
        SynchronousMediaCodecAdapter.IconCompatParcelizer iconCompatParcelizerRemoteActionCompatParcelizer = SynchronousMediaCodecAdapter.RemoteActionCompatParcelizer();
        this.IconCompatParcelizer = iconCompatParcelizerRemoteActionCompatParcelizer;
        iconCompatParcelizerRemoteActionCompatParcelizer.write(this.MediaBrowserCompatItemReceiver.read().RemoteActionCompatParcelizer()).RemoteActionCompatParcelizer(MediaCodecUtilMediaCodecListCompatV16.IconCompatParcelizer().RemoteActionCompatParcelizer(this.MediaDescriptionCompat).AudioAttributesCompatParcelizer(setOutputStreamInfo.RemoteActionCompatParcelizer).write(IconCompatParcelizer(this.RemoteActionCompatParcelizer)));
        this.MediaMetadataCompat.set(true);
        while (!this.onAddQueueItem.isEmpty()) {
            final mp4aAudioObjectTypeToProfile mp4aaudioobjecttypetoprofilePoll = this.onAddQueueItem.poll();
            if (mp4aaudioobjecttypetoprofilePoll != null) {
                this.AudioAttributesImplApi21Parcelizer.execute(new Runnable() { // from class: o.vp9LevelNumberToConst
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.read.AudioAttributesCompatParcelizer(mp4aaudioobjecttypetoprofilePoll);
                    }
                });
            }
        }
    }

    final /* synthetic */ void AudioAttributesCompatParcelizer(mp4aAudioObjectTypeToProfile mp4aaudioobjecttypetoprofile) {
        IconCompatParcelizer(mp4aaudioobjecttypetoprofile.read, mp4aaudioobjecttypetoprofile.write);
    }

    @Override // o.getCodecOutputMediaFormat.write
    public final void AudioAttributesCompatParcelizer(lambdasetOnFrameRenderedListener0comgoogleandroidexoplayer2mediacodecSynchronousMediaCodecAdapter lambdasetonframerenderedlistener0comgoogleandroidexoplayer2mediacodecsynchronousmediacodecadapter) {
        this.MediaBrowserCompatSearchResultReceiver = lambdasetonframerenderedlistener0comgoogleandroidexoplayer2mediacodecsynchronousmediacodecadapter == lambdasetOnFrameRenderedListener0comgoogleandroidexoplayer2mediacodecSynchronousMediaCodecAdapter.FOREGROUND;
        if (AudioAttributesImplApi21Parcelizer()) {
            this.AudioAttributesImplApi21Parcelizer.execute(new Runnable() { // from class: o.lambdagetDecoderInfosSortedByFormatSupport0
                @Override // java.lang.Runnable
                public final void run() {
                    this.IconCompatParcelizer.RemoteActionCompatParcelizer();
                }
            });
        }
    }

    final /* synthetic */ void RemoteActionCompatParcelizer() {
        this.onCustomAction.AudioAttributesCompatParcelizer(this.MediaBrowserCompatSearchResultReceiver);
    }

    private boolean AudioAttributesImplApi21Parcelizer() {
        return this.MediaMetadataCompat.get();
    }

    public final void IconCompatParcelizer(final MetadataInputBuffer metadataInputBuffer, final lambdasetOnFrameRenderedListener0comgoogleandroidexoplayer2mediacodecSynchronousMediaCodecAdapter lambdasetonframerenderedlistener0comgoogleandroidexoplayer2mediacodecsynchronousmediacodecadapter) {
        this.AudioAttributesImplApi21Parcelizer.execute(new Runnable() { // from class: o.MediaCodecUtilExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.IconCompatParcelizer.AudioAttributesCompatParcelizer(metadataInputBuffer, lambdasetonframerenderedlistener0comgoogleandroidexoplayer2mediacodecsynchronousmediacodecadapter);
            }
        });
    }

    final /* synthetic */ void AudioAttributesCompatParcelizer(MetadataInputBuffer metadataInputBuffer, lambdasetOnFrameRenderedListener0comgoogleandroidexoplayer2mediacodecSynchronousMediaCodecAdapter lambdasetonframerenderedlistener0comgoogleandroidexoplayer2mediacodecsynchronousmediacodecadapter) {
        IconCompatParcelizer(getWrappedMetadataBytes.write().AudioAttributesCompatParcelizer(metadataInputBuffer), lambdasetonframerenderedlistener0comgoogleandroidexoplayer2mediacodecsynchronousmediacodecadapter);
    }

    public final void AudioAttributesCompatParcelizer(final getWrappedMetadataFormat getwrappedmetadataformat, final lambdasetOnFrameRenderedListener0comgoogleandroidexoplayer2mediacodecSynchronousMediaCodecAdapter lambdasetonframerenderedlistener0comgoogleandroidexoplayer2mediacodecsynchronousmediacodecadapter) {
        this.AudioAttributesImplApi21Parcelizer.execute(new Runnable() { // from class: o.MediaCodecUtilExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                this.AudioAttributesCompatParcelizer.write(getwrappedmetadataformat, lambdasetonframerenderedlistener0comgoogleandroidexoplayer2mediacodecsynchronousmediacodecadapter);
            }
        });
    }

    final /* synthetic */ void write(getWrappedMetadataFormat getwrappedmetadataformat, lambdasetOnFrameRenderedListener0comgoogleandroidexoplayer2mediacodecSynchronousMediaCodecAdapter lambdasetonframerenderedlistener0comgoogleandroidexoplayer2mediacodecsynchronousmediacodecadapter) {
        IconCompatParcelizer(getWrappedMetadataBytes.write().read(getwrappedmetadataformat), lambdasetonframerenderedlistener0comgoogleandroidexoplayer2mediacodecsynchronousmediacodecadapter);
    }

    public final void write(final copyWithAppendedEntriesFrom copywithappendedentriesfrom, final lambdasetOnFrameRenderedListener0comgoogleandroidexoplayer2mediacodecSynchronousMediaCodecAdapter lambdasetonframerenderedlistener0comgoogleandroidexoplayer2mediacodecsynchronousmediacodecadapter) {
        this.AudioAttributesImplApi21Parcelizer.execute(new Runnable() { // from class: o.warmDecoderInfoCache
            @Override // java.lang.Runnable
            public final void run() {
                this.AudioAttributesCompatParcelizer.IconCompatParcelizer(copywithappendedentriesfrom, lambdasetonframerenderedlistener0comgoogleandroidexoplayer2mediacodecsynchronousmediacodecadapter);
            }
        });
    }

    final /* synthetic */ void IconCompatParcelizer(copyWithAppendedEntriesFrom copywithappendedentriesfrom, lambdasetOnFrameRenderedListener0comgoogleandroidexoplayer2mediacodecSynchronousMediaCodecAdapter lambdasetonframerenderedlistener0comgoogleandroidexoplayer2mediacodecsynchronousmediacodecadapter) {
        IconCompatParcelizer(getWrappedMetadataBytes.write().AudioAttributesCompatParcelizer(copywithappendedentriesfrom), lambdasetonframerenderedlistener0comgoogleandroidexoplayer2mediacodecsynchronousmediacodecadapter);
    }

    private void IconCompatParcelizer(getWrappedMetadataBytes.read readVar, lambdasetOnFrameRenderedListener0comgoogleandroidexoplayer2mediacodecSynchronousMediaCodecAdapter lambdasetonframerenderedlistener0comgoogleandroidexoplayer2mediacodecsynchronousmediacodecadapter) {
        if (!AudioAttributesImplApi21Parcelizer()) {
            if (write(readVar)) {
                new Object[]{IconCompatParcelizer(readVar)};
                this.onAddQueueItem.add(new mp4aAudioObjectTypeToProfile(readVar, lambdasetonframerenderedlistener0comgoogleandroidexoplayer2mediacodecsynchronousmediacodecadapter));
                return;
            }
            return;
        }
        getWrappedMetadataBytes getwrappedmetadatabytesRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(readVar, lambdasetonframerenderedlistener0comgoogleandroidexoplayer2mediacodecsynchronousmediacodecadapter);
        if (RemoteActionCompatParcelizer(getwrappedmetadatabytesRemoteActionCompatParcelizer)) {
            write(getwrappedmetadatabytesRemoteActionCompatParcelizer);
            getDecoderInfosInternal.RemoteActionCompatParcelizer().IconCompatParcelizer();
        }
    }

    private boolean write(populateMediaMetadata populatemediametadata) {
        int iIntValue = this.write.get("KEY_AVAILABLE_TRACES_FOR_CACHING").intValue();
        int iIntValue2 = this.write.get("KEY_AVAILABLE_NETWORK_REQUESTS_FOR_CACHING").intValue();
        int iIntValue3 = this.write.get("KEY_AVAILABLE_GAUGES_FOR_CACHING").intValue();
        if (populatemediametadata.AudioAttributesImplApi26Parcelizer() && iIntValue > 0) {
            this.write.put("KEY_AVAILABLE_TRACES_FOR_CACHING", Integer.valueOf(iIntValue - 1));
            return true;
        }
        if (populatemediametadata.MediaBrowserCompatItemReceiver() && iIntValue2 > 0) {
            this.write.put("KEY_AVAILABLE_NETWORK_REQUESTS_FOR_CACHING", Integer.valueOf(iIntValue2 - 1));
            return true;
        }
        if (populatemediametadata.AudioAttributesImplBaseParcelizer() && iIntValue3 > 0) {
            this.write.put("KEY_AVAILABLE_GAUGES_FOR_CACHING", Integer.valueOf(iIntValue3 - 1));
            return true;
        }
        new Object[]{IconCompatParcelizer(populatemediametadata), Integer.valueOf(iIntValue), Integer.valueOf(iIntValue2), Integer.valueOf(iIntValue3)};
        return false;
    }

    private boolean RemoteActionCompatParcelizer(getWrappedMetadataBytes getwrappedmetadatabytes) {
        if (!this.MediaBrowserCompatCustomActionResultReceiver.handleMediaPlayPauseIfPendingOnHandler()) {
            new Object[]{IconCompatParcelizer(getwrappedmetadatabytes)};
            return false;
        }
        if (!getwrappedmetadatabytes.RemoteActionCompatParcelizer().AudioAttributesImplBaseParcelizer()) {
            new Object[]{IconCompatParcelizer(getwrappedmetadatabytes)};
            return false;
        }
        if (!getAlternativeCodecMimeType.IconCompatParcelizer(getwrappedmetadatabytes, this.RemoteActionCompatParcelizer)) {
            new Object[]{IconCompatParcelizer(getwrappedmetadatabytes)};
            return false;
        }
        if (!this.onCustomAction.RemoteActionCompatParcelizer(getwrappedmetadatabytes)) {
            AudioAttributesCompatParcelizer(getwrappedmetadatabytes);
            new Object[]{IconCompatParcelizer(getwrappedmetadatabytes)};
            return false;
        }
        if (!this.onCustomAction.IconCompatParcelizer(getwrappedmetadatabytes)) {
            return true;
        }
        AudioAttributesCompatParcelizer(getwrappedmetadatabytes);
        new Object[]{IconCompatParcelizer(getwrappedmetadatabytes)};
        return false;
    }

    private void write(getWrappedMetadataBytes getwrappedmetadatabytes) {
        if (getwrappedmetadatabytes.AudioAttributesImplApi26Parcelizer()) {
            new Object[]{IconCompatParcelizer(getwrappedmetadatabytes), write(getwrappedmetadatabytes.AudioAttributesImplApi21Parcelizer())};
        } else {
            new Object[]{IconCompatParcelizer(getwrappedmetadatabytes)};
        }
        this.MediaBrowserCompatMediaItem.write(getwrappedmetadatabytes);
    }

    private static String IconCompatParcelizer(Context context) {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            return packageInfo.versionName == null ? "" : packageInfo.versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            return "";
        }
    }

    private getWrappedMetadataBytes RemoteActionCompatParcelizer(getWrappedMetadataBytes.read readVar, lambdasetOnFrameRenderedListener0comgoogleandroidexoplayer2mediacodecSynchronousMediaCodecAdapter lambdasetonframerenderedlistener0comgoogleandroidexoplayer2mediacodecsynchronousmediacodecadapter) {
        AudioAttributesImplBaseParcelizer();
        SynchronousMediaCodecAdapter.IconCompatParcelizer iconCompatParcelizerWrite = this.IconCompatParcelizer.write(lambdasetonframerenderedlistener0comgoogleandroidexoplayer2mediacodecsynchronousmediacodecadapter);
        if (readVar.AudioAttributesImplApi26Parcelizer() || readVar.MediaBrowserCompatItemReceiver()) {
            iconCompatParcelizerWrite = iconCompatParcelizerWrite.MediaMetadataCompat().write(write());
        }
        return readVar.read(iconCompatParcelizerWrite).MediaBrowserCompatMediaItem();
    }

    private Map<String, String> write() {
        MediaBrowserCompatCustomActionResultReceiver();
        updateCodecOperatingRate updatecodecoperatingrate = this.AudioAttributesImplApi26Parcelizer;
        if (updatecodecoperatingrate != null) {
            return updatecodecoperatingrate.AudioAttributesCompatParcelizer();
        }
        return Collections.emptyMap();
    }

    private void MediaBrowserCompatCustomActionResultReceiver() {
        if (this.AudioAttributesImplApi26Parcelizer == null && AudioAttributesImplApi21Parcelizer()) {
            this.AudioAttributesImplApi26Parcelizer = updateCodecOperatingRate.read();
        }
    }

    private void AudioAttributesImplBaseParcelizer() {
        String str;
        if (this.MediaBrowserCompatCustomActionResultReceiver.handleMediaPlayPauseIfPendingOnHandler()) {
            if (!this.IconCompatParcelizer.RemoteActionCompatParcelizer() || this.MediaBrowserCompatSearchResultReceiver) {
                try {
                    str = (String) Tasks.await(this.AudioAttributesImplBaseParcelizer.write(), 60000L, TimeUnit.MILLISECONDS);
                } catch (InterruptedException e) {
                    new Object[]{e.getMessage()};
                    str = null;
                } catch (ExecutionException e2) {
                    new Object[]{e2.getMessage()};
                    str = null;
                } catch (TimeoutException e3) {
                    new Object[]{e3.getMessage()};
                    str = null;
                }
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                this.IconCompatParcelizer.read(str);
            }
        }
    }

    private void AudioAttributesCompatParcelizer(getWrappedMetadataBytes getwrappedmetadatabytes) {
        if (getwrappedmetadatabytes.AudioAttributesImplApi26Parcelizer()) {
            this.read.IconCompatParcelizer(getScore.read.TRACE_EVENT_RATE_LIMITED.toString());
        } else if (getwrappedmetadatabytes.MediaBrowserCompatItemReceiver()) {
            this.read.IconCompatParcelizer(getScore.read.NETWORK_TRACE_EVENT_RATE_LIMITED.toString());
        }
    }

    private static String IconCompatParcelizer(populateMediaMetadata populatemediametadata) {
        if (populatemediametadata.AudioAttributesImplApi26Parcelizer()) {
            return AudioAttributesCompatParcelizer(populatemediametadata.AudioAttributesImplApi21Parcelizer());
        }
        if (populatemediametadata.MediaBrowserCompatItemReceiver()) {
            return write(populatemediametadata.IconCompatParcelizer());
        }
        if (populatemediametadata.AudioAttributesImplBaseParcelizer()) {
            return read(populatemediametadata.read());
        }
        return "log";
    }

    private static String AudioAttributesCompatParcelizer(MetadataInputBuffer metadataInputBuffer) {
        return String.format(Locale.ENGLISH, "trace metric: %s (duration: %sms)", metadataInputBuffer.MediaBrowserCompatItemReceiver(), new DecimalFormat("#.####").format(metadataInputBuffer.AudioAttributesImplApi26Parcelizer() / 1000.0d));
    }

    private static String write(getWrappedMetadataFormat getwrappedmetadataformat) {
        String strValueOf;
        long jMediaBrowserCompatMediaItem = getwrappedmetadataformat.onCustomAction() ? getwrappedmetadataformat.MediaBrowserCompatMediaItem() : 0L;
        if (getwrappedmetadataformat.onAddQueueItem()) {
            strValueOf = String.valueOf(getwrappedmetadataformat.AudioAttributesImplApi21Parcelizer());
        } else {
            strValueOf = "UNKNOWN";
        }
        return String.format(Locale.ENGLISH, "network request trace: %s (responseCode: %s, responseTime: %sms)", getwrappedmetadataformat.MediaBrowserCompatSearchResultReceiver(), strValueOf, new DecimalFormat("#.####").format(jMediaBrowserCompatMediaItem / 1000.0d));
    }

    private static String read(copyWithAppendedEntriesFrom copywithappendedentriesfrom) {
        return String.format(Locale.ENGLISH, "gauges (hasMetadata: %b, cpuGaugeCount: %d, memoryGaugeCount: %d)", Boolean.valueOf(copywithappendedentriesfrom.MediaBrowserCompatItemReceiver()), Integer.valueOf(copywithappendedentriesfrom.read()), Integer.valueOf(copywithappendedentriesfrom.IconCompatParcelizer()));
    }

    private String write(MetadataInputBuffer metadataInputBuffer) {
        String strMediaBrowserCompatItemReceiver = metadataInputBuffer.MediaBrowserCompatItemReceiver();
        if (strMediaBrowserCompatItemReceiver.startsWith("_st_")) {
            return setLogSessionIdToMediaCodecFormat.RemoteActionCompatParcelizer(this.onCommand, this.MediaDescriptionCompat, strMediaBrowserCompatItemReceiver);
        }
        return setLogSessionIdToMediaCodecFormat.IconCompatParcelizer(this.onCommand, this.MediaDescriptionCompat, strMediaBrowserCompatItemReceiver);
    }
}
