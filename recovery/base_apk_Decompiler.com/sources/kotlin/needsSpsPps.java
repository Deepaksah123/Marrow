package kotlin;

import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.StatFs;
import android.util.Base64;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import in.juspay.hypersdk.core.PaymentConstants;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.SortedSet;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.H265ReaderSampleReader;
import kotlin.access108;
import kotlin.fillBufferWithAtLeastOnePacket;

/* JADX INFO: loaded from: classes3.dex */
final class needsSpsPps {
    private static FilenameFilter write = new FilenameFilter() { // from class: o.H265Reader
        @Override // java.io.FilenameFilter
        public final boolean accept(File file, String str) {
            return str.startsWith(".ae");
        }
    };
    private H265ReaderSampleReader AudioAttributesImplApi21Parcelizer;
    private final setAll AudioAttributesImplApi26Parcelizer;
    private final onDataEnd IconCompatParcelizer;
    private final Id3Reader MediaBrowserCompatCustomActionResultReceiver;
    private final Context MediaBrowserCompatItemReceiver;
    private final DefaultTsPayloadReaderFactoryFlags MediaBrowserCompatMediaItem;
    private final parseAudioMuxElement MediaBrowserCompatSearchResultReceiver;
    private final isStartOfTsPacket MediaDescriptionCompat;
    private final peekIntAtPosition RatingCompat;
    private final H264ReaderSampleReaderSliceHeaderData RemoteActionCompatParcelizer;
    private final parseStreamMuxConfig handleMediaPlayPauseIfPendingOnHandler;
    private final skipToEndOfCurrentPack onAddQueueItem;
    private final onStartCode read;
    private readFormat MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = null;
    private TaskCompletionSource<Boolean> onCommand = new TaskCompletionSource<>();
    private TaskCompletionSource<Boolean> MediaMetadataCompat = new TaskCompletionSource<>();
    final TaskCompletionSource<Void> AudioAttributesCompatParcelizer = new TaskCompletionSource<>();
    private AtomicBoolean AudioAttributesImplBaseParcelizer = new AtomicBoolean(false);

    needsSpsPps(Context context, H264ReaderSampleReaderSliceHeaderData h264ReaderSampleReaderSliceHeaderData, parseAudioMuxElement parseaudiomuxelement, Id3Reader id3Reader, isStartOfTsPacket isstartoftspacket, setAll setall, onDataEnd ondataend, skipToEndOfCurrentPack skiptoendofcurrentpack, peekIntAtPosition peekintatposition, parseStreamMuxConfig parsestreammuxconfig, DefaultTsPayloadReaderFactoryFlags defaultTsPayloadReaderFactoryFlags, onStartCode onstartcode) {
        this.MediaBrowserCompatItemReceiver = context;
        this.RemoteActionCompatParcelizer = h264ReaderSampleReaderSliceHeaderData;
        this.MediaBrowserCompatSearchResultReceiver = parseaudiomuxelement;
        this.MediaBrowserCompatCustomActionResultReceiver = id3Reader;
        this.MediaDescriptionCompat = isstartoftspacket;
        this.AudioAttributesImplApi26Parcelizer = setall;
        this.IconCompatParcelizer = ondataend;
        this.onAddQueueItem = skiptoendofcurrentpack;
        this.RatingCompat = peekintatposition;
        this.MediaBrowserCompatMediaItem = defaultTsPayloadReaderFactoryFlags;
        this.read = onstartcode;
        this.handleMediaPlayPauseIfPendingOnHandler = parsestreammuxconfig;
    }

    final void RemoteActionCompatParcelizer(String str, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, readFormat readformat) {
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = readformat;
        MediaBrowserCompatCustomActionResultReceiver(str);
        H265ReaderSampleReader h265ReaderSampleReader = new H265ReaderSampleReader(new H265ReaderSampleReader.write() { // from class: o.needsSpsPps.5
            @Override // o.H265ReaderSampleReader.write
            public final void write(readFormat readformat2, Thread thread, Throwable th) {
                needsSpsPps.this.AudioAttributesCompatParcelizer(readformat2, thread, th);
            }
        }, readformat, uncaughtExceptionHandler, this.MediaBrowserCompatMediaItem);
        this.AudioAttributesImplApi21Parcelizer = h265ReaderSampleReader;
        Thread.setDefaultUncaughtExceptionHandler(h265ReaderSampleReader);
    }

    final void AudioAttributesCompatParcelizer(readFormat readformat, Thread thread, Throwable th) {
        IconCompatParcelizer(readformat, thread, th);
    }

    private void IconCompatParcelizer(readFormat readformat, Thread thread, Throwable th) {
        synchronized (this) {
            DvbSubtitleReader dvbSubtitleReader = DvbSubtitleReader.read();
            StringBuilder sb = new StringBuilder("Handling uncaught exception \"");
            sb.append(th);
            sb.append("\" from thread ");
            sb.append(thread.getName());
            dvbSubtitleReader.IconCompatParcelizer(sb.toString());
            try {
                parsePayloadMux.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer.write(new Callable<Task<Void>>(System.currentTimeMillis(), th, thread, readformat, false) { // from class: o.needsSpsPps.2
                    final /* synthetic */ boolean AudioAttributesCompatParcelizer = false;
                    private /* synthetic */ long AudioAttributesImplApi21Parcelizer;
                    private /* synthetic */ readFormat RemoteActionCompatParcelizer;
                    private /* synthetic */ Thread read;
                    private /* synthetic */ Throwable write;

                    /* JADX INFO: Access modifiers changed from: private */
                    @Override // java.util.concurrent.Callable
                    /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
                    public Task<Void> call() throws Exception {
                        long j = needsSpsPps.read(this.AudioAttributesImplApi21Parcelizer);
                        final String strMediaBrowserCompatItemReceiver = needsSpsPps.this.MediaBrowserCompatItemReceiver();
                        if (strMediaBrowserCompatItemReceiver != null) {
                            needsSpsPps.this.AudioAttributesImplApi26Parcelizer.write();
                            needsSpsPps.this.handleMediaPlayPauseIfPendingOnHandler.RemoteActionCompatParcelizer(this.write, this.read, strMediaBrowserCompatItemReceiver, j);
                            needsSpsPps.this.AudioAttributesCompatParcelizer(this.AudioAttributesImplApi21Parcelizer);
                            needsSpsPps.this.read(this.RemoteActionCompatParcelizer);
                            needsSpsPps.this.read(new putPps(needsSpsPps.this.MediaBrowserCompatSearchResultReceiver).toString());
                            if (needsSpsPps.this.MediaBrowserCompatCustomActionResultReceiver.write()) {
                                final Executor executorAudioAttributesCompatParcelizer = needsSpsPps.this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer();
                                return this.RemoteActionCompatParcelizer.read().onSuccessTask(executorAudioAttributesCompatParcelizer, new SuccessContinuation<readFileType, Void>() { // from class: o.needsSpsPps.2.4
                                    /* JADX INFO: Access modifiers changed from: private */
                                    @Override // com.google.android.gms.tasks.SuccessContinuation
                                    /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
                                    public Task<Void> then(readFileType readfiletype) throws Exception {
                                        if (readfiletype == null) {
                                            DvbSubtitleReader.read().read("Received null app settings, cannot send reports at crash time.");
                                            return Tasks.forResult(null);
                                        }
                                        Task[] taskArr = new Task[2];
                                        taskArr[0] = needsSpsPps.this.MediaBrowserCompatCustomActionResultReceiver();
                                        taskArr[1] = needsSpsPps.this.handleMediaPlayPauseIfPendingOnHandler.RemoteActionCompatParcelizer(executorAudioAttributesCompatParcelizer, AnonymousClass2.this.AudioAttributesCompatParcelizer ? strMediaBrowserCompatItemReceiver : null);
                                        return Tasks.whenAll((Task<?>[]) taskArr);
                                    }
                                });
                            }
                            return Tasks.forResult(null);
                        }
                        DvbSubtitleReader.read().RemoteActionCompatParcelizer("Tried to write a fatal exception while no session was open.");
                        return Tasks.forResult(null);
                    }
                }));
            } catch (TimeoutException unused) {
                DvbSubtitleReader.read().RemoteActionCompatParcelizer("Cannot send reports. Timed out while fetching settings.");
            } catch (Exception unused2) {
                DvbSubtitleReader.read().write();
            }
        }
    }

    private Task<Boolean> MediaDescriptionCompat() {
        boolean zWrite = this.MediaBrowserCompatCustomActionResultReceiver.write();
        Boolean bool = Boolean.TRUE;
        if (zWrite) {
            DvbSubtitleReader.read().IconCompatParcelizer("Automatic data collection is enabled. Allowing upload.");
            this.onCommand.trySetResult(Boolean.FALSE);
            return Tasks.forResult(bool);
        }
        DvbSubtitleReader.read().IconCompatParcelizer("Automatic data collection is disabled.");
        DvbSubtitleReader.read().AudioAttributesCompatParcelizer("Notifying that unsent reports are available.");
        this.onCommand.trySetResult(bool);
        Task<TContinuationResult> taskOnSuccessTask = this.MediaBrowserCompatCustomActionResultReceiver.read().onSuccessTask(new SuccessContinuation<Void, Boolean>() { // from class: o.needsSpsPps.1
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final /* synthetic */ Task<Boolean> then(Void r1) throws Exception {
                return RemoteActionCompatParcelizer();
            }

            private static Task<Boolean> RemoteActionCompatParcelizer() throws Exception {
                return Tasks.forResult(Boolean.TRUE);
            }
        });
        DvbSubtitleReader.read().IconCompatParcelizer("Waiting for send/deleteUnsentReports to be called.");
        return parsePayloadMux.read(taskOnSuccessTask, this.MediaMetadataCompat.getTask());
    }

    final boolean IconCompatParcelizer() {
        if (!this.AudioAttributesImplApi26Parcelizer.AudioAttributesCompatParcelizer()) {
            String strMediaBrowserCompatItemReceiver = MediaBrowserCompatItemReceiver();
            return strMediaBrowserCompatItemReceiver != null && this.MediaBrowserCompatMediaItem.IconCompatParcelizer(strMediaBrowserCompatItemReceiver);
        }
        DvbSubtitleReader.read().AudioAttributesCompatParcelizer("Found previous crash marker.");
        this.AudioAttributesImplApi26Parcelizer.read();
        return true;
    }

    final Task<Void> AudioAttributesCompatParcelizer(Task<readFileType> task) {
        if (!this.handleMediaPlayPauseIfPendingOnHandler.read()) {
            DvbSubtitleReader.read().AudioAttributesCompatParcelizer("No crash reports are available to be sent.");
            this.onCommand.trySetResult(Boolean.FALSE);
            return Tasks.forResult(null);
        }
        DvbSubtitleReader.read().AudioAttributesCompatParcelizer("Crash reports are available to be sent.");
        return MediaDescriptionCompat().onSuccessTask(new AnonymousClass4(task));
    }

    /* JADX INFO: renamed from: o.needsSpsPps$4, reason: invalid class name */
    /* JADX INFO: loaded from: classes5.dex */
    final class AnonymousClass4 implements SuccessContinuation<Boolean, Void> {
        final /* synthetic */ Task IconCompatParcelizer;

        AnonymousClass4(Task task) {
            this.IconCompatParcelizer = task;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.google.android.gms.tasks.SuccessContinuation
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public Task<Void> then(final Boolean bool) throws Exception {
            return needsSpsPps.this.RemoteActionCompatParcelizer.write(new Callable<Task<Void>>() { // from class: o.needsSpsPps.4.1
                /* JADX INFO: Access modifiers changed from: private */
                @Override // java.util.concurrent.Callable
                /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
                public Task<Void> call() throws Exception {
                    if (!bool.booleanValue()) {
                        DvbSubtitleReader.read().AudioAttributesCompatParcelizer("Deleting cached crash reports...");
                        needsSpsPps.write(needsSpsPps.this.write());
                        needsSpsPps.this.handleMediaPlayPauseIfPendingOnHandler.write();
                        needsSpsPps.this.AudioAttributesCompatParcelizer.trySetResult(null);
                        return Tasks.forResult(null);
                    }
                    DvbSubtitleReader.read().IconCompatParcelizer("Sending cached crash reports...");
                    needsSpsPps.this.MediaBrowserCompatCustomActionResultReceiver.RemoteActionCompatParcelizer(bool.booleanValue());
                    final Executor executorAudioAttributesCompatParcelizer = needsSpsPps.this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer();
                    return AnonymousClass4.this.IconCompatParcelizer.onSuccessTask(executorAudioAttributesCompatParcelizer, new SuccessContinuation<readFileType, Void>() { // from class: o.needsSpsPps.4.1.1
                        /* JADX INFO: Access modifiers changed from: private */
                        @Override // com.google.android.gms.tasks.SuccessContinuation
                        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
                        public Task<Void> then(readFileType readfiletype) throws Exception {
                            if (readfiletype != null) {
                                needsSpsPps.this.MediaBrowserCompatCustomActionResultReceiver();
                                needsSpsPps.this.handleMediaPlayPauseIfPendingOnHandler.AudioAttributesCompatParcelizer(executorAudioAttributesCompatParcelizer);
                                needsSpsPps.this.AudioAttributesCompatParcelizer.trySetResult(null);
                                return Tasks.forResult(null);
                            }
                            DvbSubtitleReader.read().read("Received null app settings at app startup. Cannot send cached reports");
                            return Tasks.forResult(null);
                        }
                    });
                }
            });
        }
    }

    final void AudioAttributesCompatParcelizer(final long j, final String str) {
        this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(new Callable<Void>() { // from class: o.needsSpsPps.3
            /* JADX INFO: Access modifiers changed from: private */
            @Override // java.util.concurrent.Callable
            /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
            public Void call() throws Exception {
                if (needsSpsPps.this.RemoteActionCompatParcelizer()) {
                    return null;
                }
                needsSpsPps.this.RatingCompat.IconCompatParcelizer(j, str);
                return null;
            }
        });
    }

    final void IconCompatParcelizer(final Thread thread, final Throwable th) {
        final long jCurrentTimeMillis = System.currentTimeMillis();
        this.RemoteActionCompatParcelizer.IconCompatParcelizer(new Runnable() { // from class: o.needsSpsPps.8
            @Override // java.lang.Runnable
            public final void run() {
                if (needsSpsPps.this.RemoteActionCompatParcelizer()) {
                    return;
                }
                long j = needsSpsPps.read(jCurrentTimeMillis);
                String strMediaBrowserCompatItemReceiver = needsSpsPps.this.MediaBrowserCompatItemReceiver();
                if (strMediaBrowserCompatItemReceiver != null) {
                    needsSpsPps.this.handleMediaPlayPauseIfPendingOnHandler.write(th, thread, strMediaBrowserCompatItemReceiver, j);
                } else {
                    DvbSubtitleReader.read().read("Tried to write a non-fatal exception while no session was open.");
                }
            }
        });
    }

    final void write(String str) {
        this.onAddQueueItem.read(str);
    }

    final void read(String str, String str2) {
        try {
            this.onAddQueueItem.write(str, str2);
        } catch (IllegalArgumentException e) {
            Context context = this.MediaBrowserCompatItemReceiver;
            if (context != null && putSps.MediaBrowserCompatItemReceiver(context)) {
                throw e;
            }
            DvbSubtitleReader.read().RemoteActionCompatParcelizer("Attempting to set custom attribute with null key, ignoring.");
        }
    }

    private void IconCompatParcelizer(String str, String str2) {
        try {
            this.onAddQueueItem.read(str, str2);
        } catch (IllegalArgumentException e) {
            Context context = this.MediaBrowserCompatItemReceiver;
            if (context != null && putSps.MediaBrowserCompatItemReceiver(context)) {
                throw e;
            }
            DvbSubtitleReader.read().RemoteActionCompatParcelizer("Attempting to set custom attribute with null key, ignoring.");
        }
    }

    private void MediaBrowserCompatCustomActionResultReceiver(final String str) {
        this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(new Callable<Void>() { // from class: o.needsSpsPps.6
            /* JADX INFO: Access modifiers changed from: private */
            @Override // java.util.concurrent.Callable
            /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
            public Void call() throws Exception {
                needsSpsPps.this.read(str);
                return null;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String MediaBrowserCompatItemReceiver() {
        SortedSet<String> sortedSetRemoteActionCompatParcelizer = this.handleMediaPlayPauseIfPendingOnHandler.RemoteActionCompatParcelizer();
        if (sortedSetRemoteActionCompatParcelizer.isEmpty()) {
            return null;
        }
        return sortedSetRemoteActionCompatParcelizer.first();
    }

    final boolean AudioAttributesCompatParcelizer(readFormat readformat) {
        this.RemoteActionCompatParcelizer.read();
        if (RemoteActionCompatParcelizer()) {
            DvbSubtitleReader.read().read("Skipping session finalization because a crash has already occurred.");
            return false;
        }
        DvbSubtitleReader.read().AudioAttributesCompatParcelizer("Finalizing previously open sessions.");
        try {
            IconCompatParcelizer(true, readformat);
            DvbSubtitleReader.read().AudioAttributesCompatParcelizer("Closed all previously open sessions.");
            return true;
        } catch (Exception unused) {
            DvbSubtitleReader.read().write();
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void read(String str) {
        long jAudioAttributesImplApi26Parcelizer = AudioAttributesImplApi26Parcelizer();
        DvbSubtitleReader.read().IconCompatParcelizer("Opening a new session with ID ".concat(String.valueOf(str)));
        this.MediaBrowserCompatMediaItem.write(str, String.format(Locale.US, "Crashlytics Android SDK/%s", parseMediaFormat.IconCompatParcelizer()), jAudioAttributesImplApi26Parcelizer, access108.AudioAttributesCompatParcelizer(read(this.MediaBrowserCompatSearchResultReceiver, this.IconCompatParcelizer), AudioAttributesImplApi21Parcelizer(), AudioAttributesCompatParcelizer()));
        this.RatingCompat.write(str);
        this.handleMediaPlayPauseIfPendingOnHandler.AudioAttributesCompatParcelizer(str, jAudioAttributesImplApi26Parcelizer);
    }

    final void read(readFormat readformat) {
        IconCompatParcelizer(false, readformat);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void IconCompatParcelizer(boolean z, readFormat readformat) {
        ArrayList arrayList = new ArrayList(this.handleMediaPlayPauseIfPendingOnHandler.RemoteActionCompatParcelizer());
        if (arrayList.size() <= z) {
            DvbSubtitleReader.read().AudioAttributesCompatParcelizer("No open sessions to be closed.");
            return;
        }
        String str = (String) arrayList.get(z ? 1 : 0);
        if (readformat.IconCompatParcelizer().read.AudioAttributesCompatParcelizer) {
            MediaBrowserCompatItemReceiver(str);
        } else {
            DvbSubtitleReader.read().AudioAttributesCompatParcelizer("ANR feature disabled.");
        }
        if (this.MediaBrowserCompatMediaItem.IconCompatParcelizer(str)) {
            RemoteActionCompatParcelizer(str);
        }
        this.handleMediaPlayPauseIfPendingOnHandler.IconCompatParcelizer(AudioAttributesImplApi26Parcelizer(), z != 0 ? (String) arrayList.get(0) : null);
    }

    final List<File> write() {
        return this.MediaDescriptionCompat.read(write);
    }

    final void read() {
        try {
            String strRatingCompat = RatingCompat();
            if (strRatingCompat != null) {
                IconCompatParcelizer("com.crashlytics.version-control-info", strRatingCompat);
                DvbSubtitleReader.read().write("Saved version control info");
            }
        } catch (IOException unused) {
            DvbSubtitleReader.read().RemoteActionCompatParcelizer();
        }
    }

    private String RatingCompat() throws IOException {
        InputStream inputStreamAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer("META-INF/version-control-info.textproto");
        if (inputStreamAudioAttributesCompatParcelizer == null) {
            return null;
        }
        DvbSubtitleReader.read().IconCompatParcelizer("Read version control info");
        return Base64.encodeToString(RemoteActionCompatParcelizer(inputStreamAudioAttributesCompatParcelizer), 0);
    }

    private InputStream AudioAttributesCompatParcelizer(String str) {
        ClassLoader classLoader = getClass().getClassLoader();
        if (classLoader == null) {
            DvbSubtitleReader.read().read("Couldn't get Class Loader");
            return null;
        }
        InputStream resourceAsStream = classLoader.getResourceAsStream(str);
        if (resourceAsStream != null) {
            return resourceAsStream;
        }
        DvbSubtitleReader.read().write("No version control information found");
        return null;
    }

    private static byte[] RemoteActionCompatParcelizer(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[1024];
        while (true) {
            int i = inputStream.read(bArr);
            if (i != -1) {
                byteArrayOutputStream.write(bArr, 0, i);
            } else {
                return byteArrayOutputStream.toByteArray();
            }
        }
    }

    private void RemoteActionCompatParcelizer(String str) {
        DvbSubtitleReader.read().AudioAttributesCompatParcelizer("Finalizing native report for session ".concat(String.valueOf(str)));
        this.MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer(str);
        if (RemoteActionCompatParcelizer(str, (File) null, (fillBufferWithAtLeastOnePacket.IconCompatParcelizer) null)) {
            DvbSubtitleReader.read().read("No native core present");
            return;
        }
        throw null;
    }

    private static boolean RemoteActionCompatParcelizer(String str, File file, fillBufferWithAtLeastOnePacket.IconCompatParcelizer iconCompatParcelizer) {
        DvbSubtitleReader.read().read("No minidump data found for session ".concat(String.valueOf(str)));
        DvbSubtitleReader.read().write("No Tombstones data found for session ".concat(String.valueOf(str)));
        return true;
    }

    private static long AudioAttributesImplApi26Parcelizer() {
        return read(System.currentTimeMillis());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long read(long j) {
        return j / 1000;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void AudioAttributesCompatParcelizer(long j) {
        try {
            isStartOfTsPacket isstartoftspacket = this.MediaDescriptionCompat;
            StringBuilder sb = new StringBuilder(".ae");
            sb.append(j);
            if (isstartoftspacket.read(sb.toString()).createNewFile()) {
            } else {
                throw new IOException("Create new file failed.");
            }
        } catch (IOException unused) {
            DvbSubtitleReader.read().RemoteActionCompatParcelizer();
        }
    }

    private static access108.read read(parseAudioMuxElement parseaudiomuxelement, onDataEnd ondataend) {
        return access108.read.AudioAttributesCompatParcelizer(parseaudiomuxelement.AudioAttributesCompatParcelizer(), ondataend.MediaBrowserCompatItemReceiver, ondataend.AudioAttributesImplBaseParcelizer, parseaudiomuxelement.read().IconCompatParcelizer(), isPrefixNalUnit.RemoteActionCompatParcelizer(ondataend.write).IconCompatParcelizer(), ondataend.RemoteActionCompatParcelizer);
    }

    private static access108.RemoteActionCompatParcelizer AudioAttributesImplApi21Parcelizer() {
        return access108.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(Build.VERSION.RELEASE, Build.VERSION.CODENAME, putSps.write());
    }

    private static access108.write AudioAttributesCompatParcelizer() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        return access108.write.IconCompatParcelizer(putSps.IconCompatParcelizer(), Build.MODEL, Runtime.getRuntime().availableProcessors(), putSps.read(), ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize()), putSps.RemoteActionCompatParcelizer(), putSps.AudioAttributesCompatParcelizer(), Build.MANUFACTURER, Build.PRODUCT);
    }

    final boolean RemoteActionCompatParcelizer() {
        H265ReaderSampleReader h265ReaderSampleReader = this.AudioAttributesImplApi21Parcelizer;
        return h265ReaderSampleReader != null && h265ReaderSampleReader.AudioAttributesCompatParcelizer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Task<Void> MediaBrowserCompatCustomActionResultReceiver() {
        ArrayList arrayList = new ArrayList();
        for (File file : write()) {
            try {
                arrayList.add(RemoteActionCompatParcelizer(Long.parseLong(file.getName().substring(3))));
            } catch (NumberFormatException unused) {
                DvbSubtitleReader dvbSubtitleReader = DvbSubtitleReader.read();
                StringBuilder sb = new StringBuilder("Could not parse app exception timestamp from file ");
                sb.append(file.getName());
                dvbSubtitleReader.read(sb.toString());
            }
            file.delete();
        }
        return Tasks.whenAll(arrayList);
    }

    private Task<Void> RemoteActionCompatParcelizer(final long j) {
        if (AudioAttributesImplBaseParcelizer()) {
            DvbSubtitleReader.read().read("Skipping logging Crashlytics event to Firebase, FirebaseCrash exists");
            return Tasks.forResult(null);
        }
        DvbSubtitleReader.read().IconCompatParcelizer("Logging app exception event to Firebase Analytics");
        return Tasks.call(new ScheduledThreadPoolExecutor(1), new Callable<Void>() { // from class: o.needsSpsPps.10
            /* JADX INFO: Access modifiers changed from: private */
            @Override // java.util.concurrent.Callable
            /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
            public Void call() throws Exception {
                Bundle bundle = new Bundle();
                bundle.putInt("fatal", 1);
                bundle.putLong(PaymentConstants.TIMESTAMP, j);
                needsSpsPps.this.read.write("_ae", bundle);
                return null;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void write(List<File> list) {
        Iterator<File> it = list.iterator();
        while (it.hasNext()) {
            it.next().delete();
        }
    }

    private static boolean AudioAttributesImplBaseParcelizer() {
        try {
            Class.forName("com.google.firebase.crash.FirebaseCrash");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    private void MediaBrowserCompatItemReceiver(String str) {
        if (Build.VERSION.SDK_INT >= 30) {
            List<ApplicationExitInfo> historicalProcessExitReasons = ((ActivityManager) this.MediaBrowserCompatItemReceiver.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
            if (historicalProcessExitReasons.size() != 0) {
                this.handleMediaPlayPauseIfPendingOnHandler.read(str, historicalProcessExitReasons, new peekIntAtPosition(this.MediaDescriptionCompat, str), skipToEndOfCurrentPack.AudioAttributesCompatParcelizer(str, this.MediaDescriptionCompat, this.RemoteActionCompatParcelizer));
                return;
            }
            DvbSubtitleReader.read().AudioAttributesCompatParcelizer("No ApplicationExitInfo available. Session: ".concat(String.valueOf(str)));
            return;
        }
        DvbSubtitleReader dvbSubtitleReader = DvbSubtitleReader.read();
        StringBuilder sb = new StringBuilder("ANR feature enabled, but device is API ");
        sb.append(Build.VERSION.SDK_INT);
        dvbSubtitleReader.AudioAttributesCompatParcelizer(sb.toString());
    }
}
