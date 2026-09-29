package kotlin;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.FirebaseApp;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.handleInputBufferSupplementalData;

/* JADX INFO: loaded from: classes3.dex */
public final class onProcessedOutputBuffer {
    private static final onProcessedOutputBuffer AudioAttributesCompatParcelizer;
    private static final long read;
    private final isBypassPossible AudioAttributesImplApi21Parcelizer;
    private final Executor AudioAttributesImplApi26Parcelizer;
    private long AudioAttributesImplBaseParcelizer;
    private final long IconCompatParcelizer;
    private onInputBufferAvailable<ChapterTocFrame1> MediaBrowserCompatCustomActionResultReceiver;
    private FirebaseRemoteConfig MediaBrowserCompatItemReceiver;
    private final ConcurrentHashMap<String, getSubFrameCount> RemoteActionCompatParcelizer;
    private final long write;

    static {
        MediaCodecRendererDecoderInitializationException.IconCompatParcelizer();
        AudioAttributesCompatParcelizer = new onProcessedOutputBuffer();
        read = TimeUnit.HOURS.toMillis(12L);
    }

    private onProcessedOutputBuffer() {
        this(isBypassPossible.AudioAttributesCompatParcelizer(), new ThreadPoolExecutor(0, 1, 0L, TimeUnit.SECONDS, new LinkedBlockingQueue()), ((long) new Random().nextInt(25000)) + 5000, read());
    }

    private static long read() {
        TrackTransformation trackTransformation = (TrackTransformation) FirebaseApp.write().AudioAttributesCompatParcelizer(TrackTransformation.class);
        if (trackTransformation != null) {
            return trackTransformation.write();
        }
        return System.currentTimeMillis();
    }

    private onProcessedOutputBuffer(isBypassPossible isbypasspossible, Executor executor, long j, long j2) {
        this.AudioAttributesImplBaseParcelizer = 0L;
        this.AudioAttributesImplApi21Parcelizer = isbypasspossible;
        this.AudioAttributesImplApi26Parcelizer = executor;
        this.MediaBrowserCompatItemReceiver = null;
        this.RemoteActionCompatParcelizer = new ConcurrentHashMap<>();
        this.write = j2;
        this.IconCompatParcelizer = j;
    }

    public static onProcessedOutputBuffer write() {
        return AudioAttributesCompatParcelizer;
    }

    public final void read(onInputBufferAvailable<ChapterTocFrame1> oninputbufferavailable) {
        this.MediaBrowserCompatCustomActionResultReceiver = oninputbufferavailable;
    }

    public final MediaCodecUtilDecoderQueryException<Double> RemoteActionCompatParcelizer(String str) {
        if (str == null) {
            return MediaCodecUtilDecoderQueryException.IconCompatParcelizer();
        }
        getSubFrameCount getsubframecountWrite = write(str);
        if (getsubframecountWrite != null) {
            try {
                return MediaCodecUtilDecoderQueryException.write(Double.valueOf(getsubframecountWrite.read()));
            } catch (IllegalArgumentException unused) {
                if (!getsubframecountWrite.RemoteActionCompatParcelizer().isEmpty()) {
                    new Object[]{getsubframecountWrite.RemoteActionCompatParcelizer(), str};
                }
            }
        }
        return MediaCodecUtilDecoderQueryException.IconCompatParcelizer();
    }

    public final MediaCodecUtilDecoderQueryException<Long> read(String str) {
        if (str == null) {
            return MediaCodecUtilDecoderQueryException.IconCompatParcelizer();
        }
        getSubFrameCount getsubframecountWrite = write(str);
        if (getsubframecountWrite != null) {
            try {
                return MediaCodecUtilDecoderQueryException.write(Long.valueOf(getsubframecountWrite.IconCompatParcelizer()));
            } catch (IllegalArgumentException unused) {
                if (!getsubframecountWrite.RemoteActionCompatParcelizer().isEmpty()) {
                    new Object[]{getsubframecountWrite.RemoteActionCompatParcelizer(), str};
                }
            }
        }
        return MediaCodecUtilDecoderQueryException.IconCompatParcelizer();
    }

    public final MediaCodecUtilDecoderQueryException<Boolean> AudioAttributesCompatParcelizer(String str) {
        if (str == null) {
            return MediaCodecUtilDecoderQueryException.IconCompatParcelizer();
        }
        getSubFrameCount getsubframecountWrite = write(str);
        if (getsubframecountWrite != null) {
            try {
                return MediaCodecUtilDecoderQueryException.write(Boolean.valueOf(getsubframecountWrite.AudioAttributesCompatParcelizer()));
            } catch (IllegalArgumentException unused) {
                if (!getsubframecountWrite.RemoteActionCompatParcelizer().isEmpty()) {
                    new Object[]{getsubframecountWrite.RemoteActionCompatParcelizer(), str};
                }
            }
        }
        return MediaCodecUtilDecoderQueryException.IconCompatParcelizer();
    }

    public final MediaCodecUtilDecoderQueryException<String> IconCompatParcelizer(String str) {
        if (str == null) {
            return MediaCodecUtilDecoderQueryException.IconCompatParcelizer();
        }
        getSubFrameCount getsubframecountWrite = write(str);
        if (getsubframecountWrite != null) {
            return MediaCodecUtilDecoderQueryException.write(getsubframecountWrite.RemoteActionCompatParcelizer());
        }
        return MediaCodecUtilDecoderQueryException.IconCompatParcelizer();
    }

    public final <T> T read(String str, T t) {
        getSubFrameCount getsubframecountWrite = write(str);
        if (getsubframecountWrite != null) {
            try {
                if (t instanceof Long) {
                    return (T) Long.valueOf(getsubframecountWrite.IconCompatParcelizer());
                }
                T t2 = (T) getsubframecountWrite.RemoteActionCompatParcelizer();
                try {
                    new Object[]{t};
                    return t2;
                } catch (IllegalArgumentException unused) {
                    t = t2;
                    if (!getsubframecountWrite.RemoteActionCompatParcelizer().isEmpty()) {
                        new Object[]{getsubframecountWrite.RemoteActionCompatParcelizer(), str};
                    }
                    return t;
                }
            } catch (IllegalArgumentException unused2) {
            }
        }
        return t;
    }

    private getSubFrameCount write(String str) {
        AudioAttributesImplApi26Parcelizer();
        if (!AudioAttributesImplBaseParcelizer() || !this.RemoteActionCompatParcelizer.containsKey(str)) {
            return null;
        }
        getSubFrameCount getsubframecount = this.RemoteActionCompatParcelizer.get(str);
        if (getsubframecount.write() != 2) {
            return null;
        }
        new Object[]{getsubframecount.RemoteActionCompatParcelizer(), str};
        return getsubframecount;
    }

    public final boolean AudioAttributesCompatParcelizer() {
        FirebaseRemoteConfig firebaseRemoteConfig = this.MediaBrowserCompatItemReceiver;
        return firebaseRemoteConfig == null || firebaseRemoteConfig.AudioAttributesImplBaseParcelizer().read() == 1 || this.MediaBrowserCompatItemReceiver.AudioAttributesImplBaseParcelizer().read() == 2;
    }

    private void AudioAttributesImplApi26Parcelizer() {
        if (AudioAttributesImplBaseParcelizer()) {
            if (this.RemoteActionCompatParcelizer.isEmpty()) {
                this.RemoteActionCompatParcelizer.putAll(this.MediaBrowserCompatItemReceiver.MediaBrowserCompatCustomActionResultReceiver());
            }
            if (RemoteActionCompatParcelizer()) {
                MediaBrowserCompatCustomActionResultReceiver();
            }
        }
    }

    private void MediaBrowserCompatCustomActionResultReceiver() {
        this.AudioAttributesImplBaseParcelizer = MediaBrowserCompatItemReceiver();
        this.MediaBrowserCompatItemReceiver.RemoteActionCompatParcelizer().addOnSuccessListener(this.AudioAttributesImplApi26Parcelizer, new OnSuccessListener() { // from class: o.resetCodecStateForFlush
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                this.read.IconCompatParcelizer();
            }
        }).addOnFailureListener(this.AudioAttributesImplApi26Parcelizer, new OnFailureListener() { // from class: o.releaseCodec
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                this.RemoteActionCompatParcelizer.IconCompatParcelizer(exc);
            }
        });
    }

    final /* synthetic */ void IconCompatParcelizer() {
        read(this.MediaBrowserCompatItemReceiver.MediaBrowserCompatCustomActionResultReceiver());
    }

    final /* synthetic */ void IconCompatParcelizer(Exception exc) {
        new Object[]{exc};
        this.AudioAttributesImplBaseParcelizer = 0L;
    }

    private void read(Map<String, getSubFrameCount> map) {
        this.RemoteActionCompatParcelizer.putAll(map);
        for (String str : this.RemoteActionCompatParcelizer.keySet()) {
            if (!map.containsKey(str)) {
                this.RemoteActionCompatParcelizer.remove(str);
            }
        }
        handleInputBufferSupplementalData.read readVar = handleInputBufferSupplementalData.read.read();
        getSubFrameCount getsubframecount = this.RemoteActionCompatParcelizer.get(readVar.ae_());
        if (getsubframecount != null) {
            try {
                this.AudioAttributesImplApi21Parcelizer.IconCompatParcelizer(readVar.ad_(), getsubframecount.AudioAttributesCompatParcelizer());
            } catch (Exception unused) {
            }
        }
    }

    private static long MediaBrowserCompatItemReceiver() {
        return System.currentTimeMillis();
    }

    private boolean AudioAttributesImplBaseParcelizer() {
        onInputBufferAvailable<ChapterTocFrame1> oninputbufferavailable;
        ChapterTocFrame1 chapterTocFrame1Write;
        if (this.MediaBrowserCompatItemReceiver == null && (oninputbufferavailable = this.MediaBrowserCompatCustomActionResultReceiver) != null && (chapterTocFrame1Write = oninputbufferavailable.write()) != null) {
            this.MediaBrowserCompatItemReceiver = chapterTocFrame1Write.read("fireperf");
        }
        return this.MediaBrowserCompatItemReceiver != null;
    }

    private boolean RemoteActionCompatParcelizer() {
        long jMediaBrowserCompatItemReceiver = MediaBrowserCompatItemReceiver();
        return read(jMediaBrowserCompatItemReceiver) && RemoteActionCompatParcelizer(jMediaBrowserCompatItemReceiver);
    }

    private boolean read(long j) {
        return j - this.write >= this.IconCompatParcelizer;
    }

    private boolean RemoteActionCompatParcelizer(long j) {
        return j - this.AudioAttributesImplBaseParcelizer > read;
    }
}
