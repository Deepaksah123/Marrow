package kotlin;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseApp;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes.dex */
public final class parseMediaFormat {
    private final Context AudioAttributesCompatParcelizer;
    private needsSpsPps AudioAttributesImplApi21Parcelizer;
    private final ExecutorService AudioAttributesImplApi26Parcelizer;
    private setAll AudioAttributesImplBaseParcelizer;
    private nalUnitData IconCompatParcelizer;
    private final Id3Reader MediaBrowserCompatCustomActionResultReceiver;
    private boolean MediaBrowserCompatItemReceiver;
    private final DefaultTsPayloadReaderFactoryFlags MediaBrowserCompatSearchResultReceiver;
    private final isStartOfTsPacket MediaDescriptionCompat;
    private setAll MediaMetadataCompat;
    private final parseAudioMuxElement RatingCompat;
    private final FirebaseApp RemoteActionCompatParcelizer;
    private final isFirstVclNalUnitOfPicture handleMediaPlayPauseIfPendingOnHandler;
    private final onStartCode read;
    private final H264ReaderSampleReaderSliceHeaderData write;
    private final long onAddQueueItem = System.currentTimeMillis();
    private final parseFrameLength MediaBrowserCompatMediaItem = new parseFrameLength();

    public parseMediaFormat(FirebaseApp firebaseApp, parseAudioMuxElement parseaudiomuxelement, DefaultTsPayloadReaderFactoryFlags defaultTsPayloadReaderFactoryFlags, Id3Reader id3Reader, nalUnitData nalunitdata, onStartCode onstartcode, isStartOfTsPacket isstartoftspacket, ExecutorService executorService, isFirstVclNalUnitOfPicture isfirstvclnalunitofpicture) {
        this.RemoteActionCompatParcelizer = firebaseApp;
        this.MediaBrowserCompatCustomActionResultReceiver = id3Reader;
        this.AudioAttributesCompatParcelizer = firebaseApp.AudioAttributesCompatParcelizer();
        this.RatingCompat = parseaudiomuxelement;
        this.MediaBrowserCompatSearchResultReceiver = defaultTsPayloadReaderFactoryFlags;
        this.IconCompatParcelizer = nalunitdata;
        this.read = onstartcode;
        this.AudioAttributesImplApi26Parcelizer = executorService;
        this.MediaDescriptionCompat = isstartoftspacket;
        this.write = new H264ReaderSampleReaderSliceHeaderData(executorService);
        this.handleMediaPlayPauseIfPendingOnHandler = isfirstvclnalunitofpicture;
    }

    public final boolean write(onDataEnd ondataend, readFormat readformat) {
        if (!IconCompatParcelizer(ondataend.IconCompatParcelizer, putSps.AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer, "com.crashlytics.RequireBuildId"))) {
            throw new IllegalStateException("The Crashlytics build ID is missing. This occurs when the Crashlytics Gradle plugin is missing from your app's build configuration. Please review the Firebase Crashlytics onboarding instructions at https://firebase.google.com/docs/crashlytics/get-started?platform=android#add-plugin");
        }
        String string = new putPps(this.RatingCompat).toString();
        try {
            this.AudioAttributesImplBaseParcelizer = new setAll("crash_marker", this.MediaDescriptionCompat);
            this.MediaMetadataCompat = new setAll("initialization_marker", this.MediaDescriptionCompat);
            skipToEndOfCurrentPack skiptoendofcurrentpack = new skipToEndOfCurrentPack(string, this.MediaDescriptionCompat, this.write);
            peekIntAtPosition peekintatposition = new peekIntAtPosition(this.MediaDescriptionCompat);
            this.AudioAttributesImplApi21Parcelizer = new needsSpsPps(this.AudioAttributesCompatParcelizer, this.write, this.RatingCompat, this.MediaBrowserCompatCustomActionResultReceiver, this.MediaDescriptionCompat, this.AudioAttributesImplBaseParcelizer, ondataend, skiptoendofcurrentpack, peekintatposition, parseStreamMuxConfig.IconCompatParcelizer(this.AudioAttributesCompatParcelizer, this.RatingCompat, this.MediaDescriptionCompat, ondataend, peekintatposition, skiptoendofcurrentpack, new writeSampleMetadata(new WavHeaderReader(10)), readformat, this.MediaBrowserCompatMediaItem, this.handleMediaPlayPauseIfPendingOnHandler), this.MediaBrowserCompatSearchResultReceiver, this.read);
            boolean zAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer();
            RemoteActionCompatParcelizer();
            this.AudioAttributesImplApi21Parcelizer.RemoteActionCompatParcelizer(string, Thread.getDefaultUncaughtExceptionHandler(), readformat);
            if (zAudioAttributesCompatParcelizer && putSps.IconCompatParcelizer(this.AudioAttributesCompatParcelizer)) {
                DvbSubtitleReader.read().IconCompatParcelizer("Crashlytics did not finish previous background initialization. Initializing synchronously.");
                AudioAttributesCompatParcelizer(readformat);
                return false;
            }
            DvbSubtitleReader.read().IconCompatParcelizer("Successfully configured exception handler.");
            return true;
        } catch (Exception unused) {
            DvbSubtitleReader.read().write();
            this.AudioAttributesImplApi21Parcelizer = null;
            return false;
        }
    }

    public final Task<Void> IconCompatParcelizer(final readFormat readformat) {
        return parsePayloadMux.AudioAttributesCompatParcelizer(this.AudioAttributesImplApi26Parcelizer, new Callable<Task<Void>>() { // from class: o.parseMediaFormat.3
            /* JADX INFO: Access modifiers changed from: private */
            @Override // java.util.concurrent.Callable
            /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
            public Task<Void> call() throws Exception {
                return parseMediaFormat.this.read(readformat);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Task<Void> read(readFormat readformat) {
        read();
        try {
            this.IconCompatParcelizer.RemoteActionCompatParcelizer(new H264Reader() { // from class: o.setSliceType
                @Override // kotlin.H264Reader
                public final void AudioAttributesCompatParcelizer(String str) {
                    this.IconCompatParcelizer.IconCompatParcelizer(str);
                }
            });
            this.AudioAttributesImplApi21Parcelizer.read();
            if (!readformat.IconCompatParcelizer().read.IconCompatParcelizer) {
                DvbSubtitleReader.read().IconCompatParcelizer("Collection of crash reports disabled in Crashlytics settings.");
                return Tasks.forException(new RuntimeException("Collection of crash reports disabled in Crashlytics settings."));
            }
            if (!this.AudioAttributesImplApi21Parcelizer.AudioAttributesCompatParcelizer(readformat)) {
                DvbSubtitleReader.read().read("Previous sessions could not be finalized.");
            }
            return this.AudioAttributesImplApi21Parcelizer.AudioAttributesCompatParcelizer(readformat.read());
        } catch (Exception e) {
            DvbSubtitleReader.read().write();
            return Tasks.forException(e);
        } finally {
            write();
        }
    }

    public static String IconCompatParcelizer() {
        return "18.4.0";
    }

    public final void IconCompatParcelizer(Throwable th) {
        this.AudioAttributesImplApi21Parcelizer.IconCompatParcelizer(Thread.currentThread(), th);
    }

    public final void IconCompatParcelizer(String str) {
        this.AudioAttributesImplApi21Parcelizer.AudioAttributesCompatParcelizer(System.currentTimeMillis() - this.onAddQueueItem, str);
    }

    public final void AudioAttributesCompatParcelizer(String str) {
        this.AudioAttributesImplApi21Parcelizer.write(str);
    }

    public final void IconCompatParcelizer(String str, String str2) {
        this.AudioAttributesImplApi21Parcelizer.read(str, str2);
    }

    private void AudioAttributesCompatParcelizer(final readFormat readformat) {
        Future<?> futureSubmit = this.AudioAttributesImplApi26Parcelizer.submit(new Runnable() { // from class: o.parseMediaFormat.2
            @Override // java.lang.Runnable
            public final void run() {
                parseMediaFormat.this.read(readformat);
            }
        });
        DvbSubtitleReader.read().IconCompatParcelizer("Crashlytics detected incomplete initialization on previous app launch. Will initialize synchronously.");
        try {
            futureSubmit.get(3L, TimeUnit.SECONDS);
        } catch (InterruptedException unused) {
            DvbSubtitleReader.read().write();
        } catch (ExecutionException unused2) {
            DvbSubtitleReader.read().write();
        } catch (TimeoutException unused3) {
            DvbSubtitleReader.read().write();
        }
    }

    private void read() {
        this.write.read();
        this.MediaMetadataCompat.write();
        DvbSubtitleReader.read().AudioAttributesCompatParcelizer("Initialization marker file was created.");
    }

    private void write() {
        this.write.RemoteActionCompatParcelizer(new Callable<Boolean>() { // from class: o.parseMediaFormat.5
            /* JADX INFO: Access modifiers changed from: private */
            @Override // java.util.concurrent.Callable
            /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
            public Boolean call() throws Exception {
                try {
                    boolean z = parseMediaFormat.this.MediaMetadataCompat.read();
                    if (!z) {
                        DvbSubtitleReader.read().read("Initialization marker file was not properly removed.");
                    }
                    return Boolean.valueOf(z);
                } catch (Exception unused) {
                    DvbSubtitleReader.read().write();
                    return Boolean.FALSE;
                }
            }
        });
    }

    private boolean AudioAttributesCompatParcelizer() {
        return this.MediaMetadataCompat.AudioAttributesCompatParcelizer();
    }

    private void RemoteActionCompatParcelizer() {
        try {
            this.MediaBrowserCompatItemReceiver = Boolean.TRUE.equals((Boolean) parsePayloadMux.RemoteActionCompatParcelizer(this.write.RemoteActionCompatParcelizer(new Callable<Boolean>() { // from class: o.parseMediaFormat.4
                /* JADX INFO: Access modifiers changed from: private */
                @Override // java.util.concurrent.Callable
                /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
                public Boolean call() throws Exception {
                    return Boolean.valueOf(parseMediaFormat.this.AudioAttributesImplApi21Parcelizer.IconCompatParcelizer());
                }
            })));
        } catch (Exception unused) {
            this.MediaBrowserCompatItemReceiver = false;
        }
    }

    private static boolean IconCompatParcelizer(String str, boolean z) {
        if (z) {
            return !TextUtils.isEmpty(str);
        }
        DvbSubtitleReader.read().AudioAttributesCompatParcelizer("Configured not to require a build ID.");
        return true;
    }
}
