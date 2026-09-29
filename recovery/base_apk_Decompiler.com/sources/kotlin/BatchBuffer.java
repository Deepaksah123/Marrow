package kotlin;

import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseApp;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.MediaCodecInfo;
import kotlin.adjustMaxInputChannelCount;
import kotlin.getFirstSampleTimeUs;

/* JADX INFO: loaded from: classes.dex */
public final class BatchBuffer implements hasSamples {
    private static final Object RemoteActionCompatParcelizer = new Object();
    private final forceDisableAsynchronous AudioAttributesCompatParcelizer;
    private final FirebaseApp AudioAttributesImplApi21Parcelizer;
    private final appendNumberOfSamples<capacity> AudioAttributesImplApi26Parcelizer;
    private final Executor AudioAttributesImplBaseParcelizer;
    private Set<doubleArraySize> IconCompatParcelizer;
    private final List<MediaCodecAdapter> MediaBrowserCompatCustomActionResultReceiver;
    private final Object MediaBrowserCompatItemReceiver;
    private final MediaCodecAdapterConfiguration MediaBrowserCompatSearchResultReceiver;
    private final IntArrayQueue MediaDescriptionCompat;
    private final MediaCodecAdapterFactory RatingCompat;
    private String read;
    private final ExecutorService write;

    static {
        new ThreadFactory() { // from class: o.BatchBuffer.5
            private final AtomicInteger AudioAttributesCompatParcelizer = new AtomicInteger(1);

            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return new Thread(runnable, String.format("firebase-installations-executor-%d", Integer.valueOf(this.AudioAttributesCompatParcelizer.getAndIncrement())));
            }
        };
    }

    public BatchBuffer(final FirebaseApp firebaseApp, onInputBufferAvailable<AsynchronousMediaCodecCallback> oninputbufferavailable, ExecutorService executorService, Executor executor) {
        this(executorService, executor, firebaseApp, new MediaCodecAdapterConfiguration(firebaseApp.AudioAttributesCompatParcelizer(), oninputbufferavailable), new MediaCodecAdapterFactory(firebaseApp), IntArrayQueue.RemoteActionCompatParcelizer(), new appendNumberOfSamples(new onInputBufferAvailable() { // from class: o.canAppendSampleBuffer
            @Override // kotlin.onInputBufferAvailable
            public final Object write() {
                return BatchBuffer.IconCompatParcelizer(firebaseApp);
            }
        }), new forceDisableAsynchronous());
    }

    static /* synthetic */ capacity IconCompatParcelizer(FirebaseApp firebaseApp) {
        return new capacity(firebaseApp);
    }

    private BatchBuffer(ExecutorService executorService, Executor executor, FirebaseApp firebaseApp, MediaCodecAdapterConfiguration mediaCodecAdapterConfiguration, MediaCodecAdapterFactory mediaCodecAdapterFactory, IntArrayQueue intArrayQueue, appendNumberOfSamples<capacity> appendnumberofsamples, forceDisableAsynchronous forcedisableasynchronous) {
        this.MediaBrowserCompatItemReceiver = new Object();
        this.IconCompatParcelizer = new HashSet();
        this.MediaBrowserCompatCustomActionResultReceiver = new ArrayList();
        this.AudioAttributesImplApi21Parcelizer = firebaseApp;
        this.MediaBrowserCompatSearchResultReceiver = mediaCodecAdapterConfiguration;
        this.RatingCompat = mediaCodecAdapterFactory;
        this.MediaDescriptionCompat = intArrayQueue;
        this.AudioAttributesImplApi26Parcelizer = appendnumberofsamples;
        this.AudioAttributesCompatParcelizer = forcedisableasynchronous;
        this.write = executorService;
        this.AudioAttributesImplBaseParcelizer = executor;
    }

    private void MediaDescriptionCompat() {
        Preconditions.checkNotEmpty(MediaBrowserCompatMediaItem(), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        Preconditions.checkNotEmpty(MediaMetadataCompat(), "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        Preconditions.checkNotEmpty(MediaBrowserCompatSearchResultReceiver(), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        Preconditions.checkArgument(IntArrayQueue.read(MediaBrowserCompatMediaItem()), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        Preconditions.checkArgument(IntArrayQueue.IconCompatParcelizer(MediaBrowserCompatSearchResultReceiver()), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
    }

    private String MediaMetadataCompat() {
        return this.AudioAttributesImplApi21Parcelizer.read().write();
    }

    public static BatchBuffer read() {
        return write(FirebaseApp.write());
    }

    public static BatchBuffer write(FirebaseApp firebaseApp) {
        Preconditions.checkArgument(firebaseApp != null, "Null is not a valid value of FirebaseApp.");
        return (BatchBuffer) firebaseApp.AudioAttributesCompatParcelizer(hasSamples.class);
    }

    private String MediaBrowserCompatMediaItem() {
        return this.AudioAttributesImplApi21Parcelizer.read().RemoteActionCompatParcelizer();
    }

    private String MediaBrowserCompatSearchResultReceiver() {
        return this.AudioAttributesImplApi21Parcelizer.read().AudioAttributesCompatParcelizer();
    }

    @Override // kotlin.hasSamples
    public final Task<String> write() {
        MediaDescriptionCompat();
        String strAudioAttributesImplApi26Parcelizer = AudioAttributesImplApi26Parcelizer();
        if (strAudioAttributesImplApi26Parcelizer != null) {
            return Tasks.forResult(strAudioAttributesImplApi26Parcelizer);
        }
        Task<String> taskAudioAttributesImplBaseParcelizer = AudioAttributesImplBaseParcelizer();
        this.write.execute(new Runnable() { // from class: o.getLastSampleTimeUs
            @Override // java.lang.Runnable
            public final void run() {
                this.AudioAttributesCompatParcelizer.IconCompatParcelizer();
            }
        });
        return taskAudioAttributesImplBaseParcelizer;
    }

    final /* synthetic */ void IconCompatParcelizer() {
        AudioAttributesCompatParcelizer(false);
    }

    @Override // kotlin.hasSamples
    public final Task<getLastOutputBufferPresentationTimeUs> RemoteActionCompatParcelizer() {
        MediaDescriptionCompat();
        Task<getLastOutputBufferPresentationTimeUs> taskAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer();
        final boolean z = false;
        this.write.execute(new Runnable(z) { // from class: o.C2Mp3TimestampTracker
            private /* synthetic */ boolean write = false;

            @Override // java.lang.Runnable
            public final void run() {
                this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(this.write);
            }
        });
        return taskAudioAttributesCompatParcelizer;
    }

    private Task<String> AudioAttributesImplBaseParcelizer() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        IconCompatParcelizer(new getBufferTimestampUs(taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    private Task<getLastOutputBufferPresentationTimeUs> AudioAttributesCompatParcelizer() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        IconCompatParcelizer(new updateAndGetPresentationTimeUs(this.MediaDescriptionCompat, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    private void IconCompatParcelizer(MediaCodecAdapter mediaCodecAdapter) {
        synchronized (this.MediaBrowserCompatItemReceiver) {
            this.MediaBrowserCompatCustomActionResultReceiver.add(mediaCodecAdapter);
        }
    }

    private void IconCompatParcelizer(createForVideoDecoding createforvideodecoding) {
        synchronized (this.MediaBrowserCompatItemReceiver) {
            Iterator<MediaCodecAdapter> it = this.MediaBrowserCompatCustomActionResultReceiver.iterator();
            while (it.hasNext()) {
                if (it.next().RemoteActionCompatParcelizer(createforvideodecoding)) {
                    it.remove();
                }
            }
        }
    }

    private void AudioAttributesCompatParcelizer(Exception exc) {
        synchronized (this.MediaBrowserCompatItemReceiver) {
            Iterator<MediaCodecAdapter> it = this.MediaBrowserCompatCustomActionResultReceiver.iterator();
            while (it.hasNext()) {
                if (it.next().write(exc)) {
                    it.remove();
                }
            }
        }
    }

    private void read(String str) {
        synchronized (this) {
            this.read = str;
        }
    }

    private String AudioAttributesImplApi26Parcelizer() {
        String str;
        synchronized (this) {
            str = this.read;
        }
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
    public final void AudioAttributesCompatParcelizer(final boolean z) {
        createForVideoDecoding createforvideodecodingMediaBrowserCompatCustomActionResultReceiver = MediaBrowserCompatCustomActionResultReceiver();
        if (z) {
            createforvideodecodingMediaBrowserCompatCustomActionResultReceiver = createforvideodecodingMediaBrowserCompatCustomActionResultReceiver.MediaBrowserCompatMediaItem();
        }
        IconCompatParcelizer(createforvideodecodingMediaBrowserCompatCustomActionResultReceiver);
        this.AudioAttributesImplBaseParcelizer.execute(new Runnable() { // from class: o.setMaxSampleCount
            @Override // java.lang.Runnable
            public final void run() {
                this.read.RemoteActionCompatParcelizer(z);
            }
        });
    }

    private capacity AudioAttributesImplApi21Parcelizer() {
        return this.AudioAttributesImplApi26Parcelizer.write();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
    public void RemoteActionCompatParcelizer(boolean z) {
        createForVideoDecoding createforvideodecodingAudioAttributesCompatParcelizer;
        createForVideoDecoding createforvideodecodingMediaBrowserCompatItemReceiver = MediaBrowserCompatItemReceiver();
        try {
            if (createforvideodecodingMediaBrowserCompatItemReceiver.MediaBrowserCompatItemReceiver() || createforvideodecodingMediaBrowserCompatItemReceiver.RatingCompat()) {
                createforvideodecodingAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(createforvideodecodingMediaBrowserCompatItemReceiver);
            } else {
                if (!z && !this.MediaDescriptionCompat.IconCompatParcelizer(createforvideodecodingMediaBrowserCompatItemReceiver)) {
                    return;
                }
                createforvideodecodingAudioAttributesCompatParcelizer = read(createforvideodecodingMediaBrowserCompatItemReceiver);
            }
            write(createforvideodecodingAudioAttributesCompatParcelizer);
            IconCompatParcelizer(createforvideodecodingMediaBrowserCompatItemReceiver, createforvideodecodingAudioAttributesCompatParcelizer);
            if (createforvideodecodingAudioAttributesCompatParcelizer.MediaDescriptionCompat()) {
                read(createforvideodecodingAudioAttributesCompatParcelizer.write());
            }
            if (createforvideodecodingAudioAttributesCompatParcelizer.MediaBrowserCompatItemReceiver()) {
                AudioAttributesCompatParcelizer(new getFirstSampleTimeUs(getFirstSampleTimeUs.read.BAD_CONFIG));
            } else if (createforvideodecodingAudioAttributesCompatParcelizer.MediaBrowserCompatSearchResultReceiver()) {
                AudioAttributesCompatParcelizer(new IOException("Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request."));
            } else {
                IconCompatParcelizer(createforvideodecodingAudioAttributesCompatParcelizer);
            }
        } catch (getFirstSampleTimeUs e) {
            AudioAttributesCompatParcelizer(e);
        }
    }

    private void IconCompatParcelizer(createForVideoDecoding createforvideodecoding, createForVideoDecoding createforvideodecoding2) {
        synchronized (this) {
            if (this.IconCompatParcelizer.size() != 0 && !TextUtils.equals(createforvideodecoding.write(), createforvideodecoding2.write())) {
                for (doubleArraySize doublearraysize : this.IconCompatParcelizer) {
                    createforvideodecoding2.write();
                }
            }
        }
    }

    private void write(createForVideoDecoding createforvideodecoding) {
        synchronized (RemoteActionCompatParcelizer) {
            onOutputBufferAvailable onoutputbufferavailableWrite = onOutputBufferAvailable.write(this.AudioAttributesImplApi21Parcelizer.AudioAttributesCompatParcelizer(), "generatefid.lock");
            try {
                this.RatingCompat.RemoteActionCompatParcelizer(createforvideodecoding);
            } finally {
                if (onoutputbufferavailableWrite != null) {
                    onoutputbufferavailableWrite.IconCompatParcelizer();
                }
            }
        }
    }

    private createForVideoDecoding MediaBrowserCompatCustomActionResultReceiver() {
        createForVideoDecoding createforvideodecodingRemoteActionCompatParcelizer;
        synchronized (RemoteActionCompatParcelizer) {
            onOutputBufferAvailable onoutputbufferavailableWrite = onOutputBufferAvailable.write(this.AudioAttributesImplApi21Parcelizer.AudioAttributesCompatParcelizer(), "generatefid.lock");
            try {
                createforvideodecodingRemoteActionCompatParcelizer = this.RatingCompat.read();
                if (createforvideodecodingRemoteActionCompatParcelizer.MediaBrowserCompatSearchResultReceiver()) {
                    createforvideodecodingRemoteActionCompatParcelizer = this.RatingCompat.RemoteActionCompatParcelizer(createforvideodecodingRemoteActionCompatParcelizer.IconCompatParcelizer(RemoteActionCompatParcelizer(createforvideodecodingRemoteActionCompatParcelizer)));
                }
            } finally {
                if (onoutputbufferavailableWrite != null) {
                    onoutputbufferavailableWrite.IconCompatParcelizer();
                }
            }
        }
        return createforvideodecodingRemoteActionCompatParcelizer;
    }

    private String RemoteActionCompatParcelizer(createForVideoDecoding createforvideodecoding) {
        if ((!this.AudioAttributesImplApi21Parcelizer.IconCompatParcelizer().equals("CHIME_ANDROID_SDK") && !this.AudioAttributesImplApi21Parcelizer.AudioAttributesImplApi21Parcelizer()) || !createforvideodecoding.MediaMetadataCompat()) {
            return forceDisableAsynchronous.AudioAttributesCompatParcelizer();
        }
        String strIconCompatParcelizer = AudioAttributesImplApi21Parcelizer().IconCompatParcelizer();
        return TextUtils.isEmpty(strIconCompatParcelizer) ? forceDisableAsynchronous.AudioAttributesCompatParcelizer() : strIconCompatParcelizer;
    }

    private createForVideoDecoding AudioAttributesCompatParcelizer(createForVideoDecoding createforvideodecoding) throws getFirstSampleTimeUs {
        MediaCodecInfo mediaCodecInfoIconCompatParcelizer = this.MediaBrowserCompatSearchResultReceiver.IconCompatParcelizer(MediaBrowserCompatSearchResultReceiver(), createforvideodecoding.write(), MediaMetadataCompat(), MediaBrowserCompatMediaItem(), (createforvideodecoding.write() == null || createforvideodecoding.write().length() != 11) ? null : AudioAttributesImplApi21Parcelizer().write());
        int i = AnonymousClass2.IconCompatParcelizer[mediaCodecInfoIconCompatParcelizer.AudioAttributesCompatParcelizer().ordinal()];
        if (i == 1) {
            return createforvideodecoding.AudioAttributesCompatParcelizer(mediaCodecInfoIconCompatParcelizer.read(), mediaCodecInfoIconCompatParcelizer.RemoteActionCompatParcelizer(), this.MediaDescriptionCompat.IconCompatParcelizer(), mediaCodecInfoIconCompatParcelizer.write().read(), mediaCodecInfoIconCompatParcelizer.write().IconCompatParcelizer());
        }
        if (i == 2) {
            return createforvideodecoding.write("BAD CONFIG");
        }
        throw new getFirstSampleTimeUs("Firebase Installations Service is unavailable. Please try again later.", getFirstSampleTimeUs.read.UNAVAILABLE);
    }

    private createForVideoDecoding read(createForVideoDecoding createforvideodecoding) throws getFirstSampleTimeUs {
        adjustMaxInputChannelCount adjustmaxinputchannelcountWrite = this.MediaBrowserCompatSearchResultReceiver.write(MediaBrowserCompatSearchResultReceiver(), createforvideodecoding.write(), MediaMetadataCompat(), createforvideodecoding.IconCompatParcelizer());
        int i = AnonymousClass2.RemoteActionCompatParcelizer[adjustmaxinputchannelcountWrite.write().ordinal()];
        if (i == 1) {
            return createforvideodecoding.IconCompatParcelizer(adjustmaxinputchannelcountWrite.read(), adjustmaxinputchannelcountWrite.IconCompatParcelizer(), this.MediaDescriptionCompat.IconCompatParcelizer());
        }
        if (i == 2) {
            return createforvideodecoding.write("BAD CONFIG");
        }
        if (i == 3) {
            read((String) null);
            return createforvideodecoding.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
        }
        throw new getFirstSampleTimeUs("Firebase Installations Service is unavailable. Please try again later.", getFirstSampleTimeUs.read.UNAVAILABLE);
    }

    /* JADX INFO: renamed from: o.BatchBuffer$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] IconCompatParcelizer;
        static final /* synthetic */ int[] RemoteActionCompatParcelizer;

        static {
            int[] iArr = new int[adjustMaxInputChannelCount.IconCompatParcelizer.values().length];
            RemoteActionCompatParcelizer = iArr;
            try {
                iArr[adjustMaxInputChannelCount.IconCompatParcelizer.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                RemoteActionCompatParcelizer[adjustMaxInputChannelCount.IconCompatParcelizer.BAD_CONFIG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                RemoteActionCompatParcelizer[adjustMaxInputChannelCount.IconCompatParcelizer.AUTH_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[MediaCodecInfo.read.values().length];
            IconCompatParcelizer = iArr2;
            try {
                iArr2[MediaCodecInfo.read.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                IconCompatParcelizer[MediaCodecInfo.read.BAD_CONFIG.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    private createForVideoDecoding MediaBrowserCompatItemReceiver() {
        createForVideoDecoding createforvideodecoding;
        synchronized (RemoteActionCompatParcelizer) {
            onOutputBufferAvailable onoutputbufferavailableWrite = onOutputBufferAvailable.write(this.AudioAttributesImplApi21Parcelizer.AudioAttributesCompatParcelizer(), "generatefid.lock");
            try {
                createforvideodecoding = this.RatingCompat.read();
            } finally {
                if (onoutputbufferavailableWrite != null) {
                    onoutputbufferavailableWrite.IconCompatParcelizer();
                }
            }
        }
        return createforvideodecoding;
    }
}
