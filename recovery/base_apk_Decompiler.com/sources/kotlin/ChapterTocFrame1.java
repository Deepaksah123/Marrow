package kotlin;

import android.app.Application;
import android.content.Context;
import com.google.android.gms.common.api.internal.BackgroundDetector;
import com.google.android.gms.common.util.BiConsumer;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseApp;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public class ChapterTocFrame1 {
    private final Context AudioAttributesImplApi21Parcelizer;
    private final ScheduledExecutorService AudioAttributesImplApi26Parcelizer;
    private final schemeToCryptoMode AudioAttributesImplBaseParcelizer;
    private final onInputBufferAvailable<TrackSampleTable> IconCompatParcelizer;
    private final FirebaseApp MediaBrowserCompatCustomActionResultReceiver;
    private Map<String, String> MediaBrowserCompatItemReceiver;
    private final Map<String, FirebaseRemoteConfig> MediaBrowserCompatMediaItem;
    private final hasSamples MediaMetadataCompat;
    private final String read;
    private static final Clock write = DefaultClock.getInstance();
    private static final Random RemoteActionCompatParcelizer = new Random();
    private static final Map<String, FirebaseRemoteConfig> AudioAttributesCompatParcelizer = new HashMap();

    static /* synthetic */ TrackSampleTable IconCompatParcelizer() {
        return null;
    }

    public ChapterTocFrame1(Context context, ScheduledExecutorService scheduledExecutorService, FirebaseApp firebaseApp, hasSamples hassamples, schemeToCryptoMode schemetocryptomode, onInputBufferAvailable<TrackSampleTable> oninputbufferavailable) {
        this(context, scheduledExecutorService, firebaseApp, hassamples, schemetocryptomode, oninputbufferavailable, (byte) 0);
    }

    private ChapterTocFrame1(Context context, ScheduledExecutorService scheduledExecutorService, FirebaseApp firebaseApp, hasSamples hassamples, schemeToCryptoMode schemetocryptomode, onInputBufferAvailable<TrackSampleTable> oninputbufferavailable, byte b) {
        this.MediaBrowserCompatMediaItem = new HashMap();
        this.MediaBrowserCompatItemReceiver = new HashMap();
        this.AudioAttributesImplApi21Parcelizer = context;
        this.AudioAttributesImplApi26Parcelizer = scheduledExecutorService;
        this.MediaBrowserCompatCustomActionResultReceiver = firebaseApp;
        this.MediaMetadataCompat = hassamples;
        this.AudioAttributesImplBaseParcelizer = schemetocryptomode;
        this.IconCompatParcelizer = oninputbufferavailable;
        this.read = firebaseApp.read().RemoteActionCompatParcelizer();
        write.RemoteActionCompatParcelizer(context);
        Tasks.call(scheduledExecutorService, new Callable() { // from class: o.Id3Decoder
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer();
            }
        });
    }

    public final FirebaseRemoteConfig RemoteActionCompatParcelizer() {
        return read("firebase");
    }

    public final FirebaseRemoteConfig read(String str) {
        FirebaseRemoteConfig firebaseRemoteConfigIconCompatParcelizer;
        synchronized (this) {
            try {
                decodeCommentFrame decodecommentframeIconCompatParcelizer = IconCompatParcelizer(str, "fetch");
                decodeCommentFrame decodecommentframeIconCompatParcelizer2 = IconCompatParcelizer(str, "activate");
                decodeCommentFrame decodecommentframeIconCompatParcelizer3 = IconCompatParcelizer(str, "defaults");
                decodeUrlLinkFrame decodeurllinkframeRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(this.AudioAttributesImplApi21Parcelizer, this.read, str);
                getCharset getcharsetWrite = write(decodecommentframeIconCompatParcelizer2, decodecommentframeIconCompatParcelizer3);
                final MlltFrame1 mlltFrame1Write = write(this.MediaBrowserCompatCustomActionResultReceiver, str, this.IconCompatParcelizer);
                if (mlltFrame1Write != null) {
                    Objects.requireNonNull(mlltFrame1Write);
                    getcharsetWrite.IconCompatParcelizer(new BiConsumer() { // from class: o.GeobFrame1
                        @Override // com.google.android.gms.common.util.BiConsumer
                        public final void accept(Object obj, Object obj2) {
                            mlltFrame1Write.RemoteActionCompatParcelizer((String) obj, (decodeGeobFrame) obj2);
                        }
                    });
                }
                firebaseRemoteConfigIconCompatParcelizer = IconCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver, str, this.MediaMetadataCompat, this.AudioAttributesImplBaseParcelizer, this.AudioAttributesImplApi26Parcelizer, decodecommentframeIconCompatParcelizer, decodecommentframeIconCompatParcelizer2, decodecommentframeIconCompatParcelizer3, read(str, decodecommentframeIconCompatParcelizer, decodeurllinkframeRemoteActionCompatParcelizer), getcharsetWrite, decodeurllinkframeRemoteActionCompatParcelizer);
            } catch (Throwable th) {
                throw th;
            }
        }
        return firebaseRemoteConfigIconCompatParcelizer;
    }

    private FirebaseRemoteConfig IconCompatParcelizer(FirebaseApp firebaseApp, String str, hasSamples hassamples, schemeToCryptoMode schemetocryptomode, Executor executor, decodeCommentFrame decodecommentframe, decodeCommentFrame decodecommentframe2, decodeCommentFrame decodecommentframe3, decodeTextInformationFrame decodetextinformationframe, getCharset getcharset, decodeUrlLinkFrame decodeurllinkframe) {
        FirebaseRemoteConfig firebaseRemoteConfig;
        synchronized (this) {
            if (!this.MediaBrowserCompatMediaItem.containsKey(str)) {
                FirebaseRemoteConfig firebaseRemoteConfig2 = new FirebaseRemoteConfig(this.AudioAttributesImplApi21Parcelizer, firebaseApp, hassamples, read(firebaseApp, str) ? schemetocryptomode : null, executor, decodecommentframe, decodecommentframe2, decodecommentframe3, decodetextinformationframe, getcharset, decodeurllinkframe, RemoteActionCompatParcelizer(firebaseApp, hassamples, decodetextinformationframe, decodecommentframe2, this.AudioAttributesImplApi21Parcelizer, str, decodeurllinkframe));
                firebaseRemoteConfig2.MediaBrowserCompatItemReceiver();
                this.MediaBrowserCompatMediaItem.put(str, firebaseRemoteConfig2);
                AudioAttributesCompatParcelizer.put(str, firebaseRemoteConfig2);
            }
            firebaseRemoteConfig = this.MediaBrowserCompatMediaItem.get(str);
        }
        return firebaseRemoteConfig;
    }

    private decodeCommentFrame IconCompatParcelizer(String str, String str2) {
        return decodeCommentFrame.read(this.AudioAttributesImplApi26Parcelizer, removeUnsynchronization.read(this.AudioAttributesImplApi21Parcelizer, String.format("%s_%s_%s_%s.json", "frc", this.read, str, str2)));
    }

    private decodeTxxxFrame AudioAttributesCompatParcelizer(String str, String str2, decodeUrlLinkFrame decodeurllinkframe) {
        return new decodeTxxxFrame(this.AudioAttributesImplApi21Parcelizer, this.MediaBrowserCompatCustomActionResultReceiver.read().RemoteActionCompatParcelizer(), str, str2, decodeurllinkframe.read(), decodeurllinkframe.read());
    }

    private decodeTextInformationFrame read(String str, decodeCommentFrame decodecommentframe, decodeUrlLinkFrame decodeurllinkframe) {
        decodeTextInformationFrame decodetextinformationframe;
        synchronized (this) {
            decodetextinformationframe = new decodeTextInformationFrame(this.MediaMetadataCompat, write(this.MediaBrowserCompatCustomActionResultReceiver) ? this.IconCompatParcelizer : new onInputBufferAvailable() { // from class: o.copyOfRangeIfValid
                @Override // kotlin.onInputBufferAvailable
                public final Object write() {
                    return ChapterTocFrame1.IconCompatParcelizer();
                }
            }, this.AudioAttributesImplApi26Parcelizer, write, RemoteActionCompatParcelizer, decodecommentframe, AudioAttributesCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver.read().AudioAttributesCompatParcelizer(), str, decodeurllinkframe), decodeurllinkframe, this.MediaBrowserCompatItemReceiver);
        }
        return decodetextinformationframe;
    }

    private indexOfTerminator RemoteActionCompatParcelizer(FirebaseApp firebaseApp, hasSamples hassamples, decodeTextInformationFrame decodetextinformationframe, decodeCommentFrame decodecommentframe, Context context, String str, decodeUrlLinkFrame decodeurllinkframe) {
        indexOfTerminator indexofterminator;
        synchronized (this) {
            indexofterminator = new indexOfTerminator(firebaseApp, hassamples, decodetextinformationframe, decodecommentframe, context, str, decodeurllinkframe, this.AudioAttributesImplApi26Parcelizer);
        }
        return indexofterminator;
    }

    private getCharset write(decodeCommentFrame decodecommentframe, decodeCommentFrame decodecommentframe2) {
        return new getCharset(this.AudioAttributesImplApi26Parcelizer, decodecommentframe, decodecommentframe2);
    }

    private static decodeUrlLinkFrame RemoteActionCompatParcelizer(Context context, String str, String str2) {
        return new decodeUrlLinkFrame(context.getSharedPreferences(String.format("%s_%s_%s_%s", "frc", str, str2, "settings"), 0));
    }

    private static MlltFrame1 write(FirebaseApp firebaseApp, String str, onInputBufferAvailable<TrackSampleTable> oninputbufferavailable) {
        if (write(firebaseApp) && str.equals("firebase")) {
            return new MlltFrame1(oninputbufferavailable);
        }
        return null;
    }

    private static boolean read(FirebaseApp firebaseApp, String str) {
        return str.equals("firebase") && write(firebaseApp);
    }

    private static boolean write(FirebaseApp firebaseApp) {
        return firebaseApp.IconCompatParcelizer().equals("[DEFAULT]");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void read(boolean z) {
        synchronized (ChapterTocFrame1.class) {
            Iterator<FirebaseRemoteConfig> it = AudioAttributesCompatParcelizer.values().iterator();
            while (it.hasNext()) {
                it.next().IconCompatParcelizer(z);
            }
        }
    }

    /* JADX INFO: loaded from: classes5.dex */
    static class write implements BackgroundDetector.BackgroundStateChangeListener {
        private static final AtomicReference<write> read = new AtomicReference<>();

        private write() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void RemoteActionCompatParcelizer(Context context) {
            Application application = (Application) context.getApplicationContext();
            AtomicReference<write> atomicReference = read;
            if (atomicReference.get() == null) {
                write writeVar = new write();
                if (setBackInvokedCallbackEnabled.read(atomicReference, null, writeVar)) {
                    BackgroundDetector.initialize(application);
                    BackgroundDetector.getInstance().addListener(writeVar);
                }
            }
        }

        @Override // com.google.android.gms.common.api.internal.BackgroundDetector.BackgroundStateChangeListener
        public final void onBackgroundStateChanged(boolean z) {
            ChapterTocFrame1.read(z);
        }
    }
}
