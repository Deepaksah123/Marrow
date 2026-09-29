package com.google.firebase;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.android.gms.common.api.internal.BackgroundDetector;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.util.ProcessUtils;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.provider.FirebaseInitProvider;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.FlacReaderFlacOggSeeker;
import kotlin.OpusReader;
import kotlin.TrackTransformation;
import kotlin._findExplicitStringFactoryMethod;
import kotlin.appendNumberOfSamples;
import kotlin.buildSeiReader;
import kotlin.calculatePacketSize;
import kotlin.flushHandlerThread;
import kotlin.getDownloads;
import kotlin.getMaxSupportedInstancesV23;
import kotlin.inferMimeType;
import kotlin.onInputBufferAvailable;
import kotlin.setBackInvokedCallbackEnabled;
import kotlin.setPendingRuntimeException;
import kotlin.setTitleOptional;
import kotlin.sniffInternal;
import kotlin.trimPayload;

/* JADX INFO: loaded from: classes.dex */
public class FirebaseApp {
    private static final Object AudioAttributesCompatParcelizer = new Object();
    static final Map<String, FirebaseApp> IconCompatParcelizer = new setTitleOptional();
    private final appendNumberOfSamples<getMaxSupportedInstancesV23> AudioAttributesImplApi21Parcelizer;
    private final onInputBufferAvailable<setPendingRuntimeException> MediaBrowserCompatCustomActionResultReceiver;
    private final OpusReader MediaBrowserCompatItemReceiver;
    private final sniffInternal MediaDescriptionCompat;
    private final String RatingCompat;
    private final Context write;
    private final AtomicBoolean RemoteActionCompatParcelizer = new AtomicBoolean(false);
    private final AtomicBoolean AudioAttributesImplApi26Parcelizer = new AtomicBoolean();
    private final List<RemoteActionCompatParcelizer> read = new CopyOnWriteArrayList();
    private final List<Object> AudioAttributesImplBaseParcelizer = new CopyOnWriteArrayList();

    public interface RemoteActionCompatParcelizer {
        void write(boolean z);
    }

    public final Context AudioAttributesCompatParcelizer() {
        AudioAttributesImplBaseParcelizer();
        return this.write;
    }

    public final String IconCompatParcelizer() {
        AudioAttributesImplBaseParcelizer();
        return this.RatingCompat;
    }

    public final sniffInternal read() {
        AudioAttributesImplBaseParcelizer();
        return this.MediaDescriptionCompat;
    }

    public boolean equals(Object obj) {
        if (obj instanceof FirebaseApp) {
            return this.RatingCompat.equals(((FirebaseApp) obj).IconCompatParcelizer());
        }
        return false;
    }

    public int hashCode() {
        return this.RatingCompat.hashCode();
    }

    public String toString() {
        return Objects.toStringHelper(this).add("name", this.RatingCompat).add("options", this.MediaDescriptionCompat).toString();
    }

    public static FirebaseApp write() {
        FirebaseApp firebaseApp;
        synchronized (AudioAttributesCompatParcelizer) {
            firebaseApp = IconCompatParcelizer.get("[DEFAULT]");
            if (firebaseApp == null) {
                StringBuilder sb = new StringBuilder("Default FirebaseApp is not initialized in this process ");
                sb.append(ProcessUtils.getMyProcessName());
                sb.append(". Make sure to call FirebaseApp.initializeApp(Context) first.");
                throw new IllegalStateException(sb.toString());
            }
            firebaseApp.MediaBrowserCompatCustomActionResultReceiver.write().AudioAttributesImplApi21Parcelizer();
        }
        return firebaseApp;
    }

    public static FirebaseApp RemoteActionCompatParcelizer(Context context) {
        synchronized (AudioAttributesCompatParcelizer) {
            if (IconCompatParcelizer.containsKey("[DEFAULT]")) {
                return write();
            }
            sniffInternal sniffinternalWrite = sniffInternal.write(context);
            if (sniffinternalWrite == null) {
                return null;
            }
            return IconCompatParcelizer(context, sniffinternalWrite);
        }
    }

    private static FirebaseApp IconCompatParcelizer(Context context, sniffInternal sniffinternal) {
        return AudioAttributesCompatParcelizer(context, sniffinternal, "[DEFAULT]");
    }

    private static FirebaseApp AudioAttributesCompatParcelizer(Context context, sniffInternal sniffinternal, String str) {
        FirebaseApp firebaseApp;
        read.read(context);
        String strRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(str);
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (AudioAttributesCompatParcelizer) {
            Map<String, FirebaseApp> map = IconCompatParcelizer;
            boolean zContainsKey = map.containsKey(strRemoteActionCompatParcelizer);
            StringBuilder sb = new StringBuilder("FirebaseApp name ");
            sb.append(strRemoteActionCompatParcelizer);
            sb.append(" already exists!");
            Preconditions.checkState(!zContainsKey, sb.toString());
            Preconditions.checkNotNull(context, "Application context cannot be null.");
            firebaseApp = new FirebaseApp(context, strRemoteActionCompatParcelizer, sniffinternal);
            map.put(strRemoteActionCompatParcelizer, firebaseApp);
        }
        firebaseApp.MediaBrowserCompatItemReceiver();
        return firebaseApp;
    }

    public final <T> T AudioAttributesCompatParcelizer(Class<T> cls) {
        AudioAttributesImplBaseParcelizer();
        return (T) this.MediaBrowserCompatItemReceiver.read(cls);
    }

    public final boolean AudioAttributesImplApi26Parcelizer() {
        AudioAttributesImplBaseParcelizer();
        return this.AudioAttributesImplApi21Parcelizer.write().AudioAttributesCompatParcelizer();
    }

    private FirebaseApp(final Context context, String str, sniffInternal sniffinternal) {
        this.write = (Context) Preconditions.checkNotNull(context);
        this.RatingCompat = Preconditions.checkNotEmpty(str);
        this.MediaDescriptionCompat = (sniffInternal) Preconditions.checkNotNull(sniffinternal);
        TrackTransformation trackTransformationIconCompatParcelizer = FirebaseInitProvider.IconCompatParcelizer();
        inferMimeType.write("Firebase");
        inferMimeType.write("ComponentDiscovery");
        List<onInputBufferAvailable<ComponentRegistrar>> listIconCompatParcelizer = trimPayload.RemoteActionCompatParcelizer(context, calculatePacketSize.class).IconCompatParcelizer();
        inferMimeType.IconCompatParcelizer();
        inferMimeType.write("Runtime");
        OpusReader.write writeVarRemoteActionCompatParcelizer = OpusReader.RemoteActionCompatParcelizer(buildSeiReader.INSTANCE).write(listIconCompatParcelizer).read(new FirebaseCommonRegistrar()).read(new ExecutorsRegistrar()).RemoteActionCompatParcelizer(FlacReaderFlacOggSeeker.write(context, Context.class, new Class[0])).RemoteActionCompatParcelizer(FlacReaderFlacOggSeeker.write(this, FirebaseApp.class, new Class[0])).RemoteActionCompatParcelizer(FlacReaderFlacOggSeeker.write(sniffinternal, sniffInternal.class, new Class[0])).RemoteActionCompatParcelizer(new getDownloads());
        if (_findExplicitStringFactoryMethod.read(context) && FirebaseInitProvider.RemoteActionCompatParcelizer()) {
            writeVarRemoteActionCompatParcelizer.RemoteActionCompatParcelizer(FlacReaderFlacOggSeeker.write(trackTransformationIconCompatParcelizer, TrackTransformation.class, new Class[0]));
        }
        OpusReader opusReaderIconCompatParcelizer = writeVarRemoteActionCompatParcelizer.IconCompatParcelizer();
        this.MediaBrowserCompatItemReceiver = opusReaderIconCompatParcelizer;
        inferMimeType.IconCompatParcelizer();
        this.AudioAttributesImplApi21Parcelizer = new appendNumberOfSamples<>(new onInputBufferAvailable() { // from class: o.sniffFragmented
            @Override // kotlin.onInputBufferAvailable
            public final Object write() {
                return this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(context);
            }
        });
        this.MediaBrowserCompatCustomActionResultReceiver = opusReaderIconCompatParcelizer.write(setPendingRuntimeException.class);
        AudioAttributesCompatParcelizer(new RemoteActionCompatParcelizer() { // from class: o.readSlowMotionData
            @Override // com.google.firebase.FirebaseApp.RemoteActionCompatParcelizer
            public final void write(boolean z) {
                this.AudioAttributesCompatParcelizer.write(z);
            }
        });
        inferMimeType.IconCompatParcelizer();
    }

    public final /* synthetic */ getMaxSupportedInstancesV23 AudioAttributesCompatParcelizer(Context context) {
        return new getMaxSupportedInstancesV23(context, MediaBrowserCompatCustomActionResultReceiver(), (flushHandlerThread) this.MediaBrowserCompatItemReceiver.read(flushHandlerThread.class));
    }

    public final /* synthetic */ void write(boolean z) {
        if (z) {
            return;
        }
        this.MediaBrowserCompatCustomActionResultReceiver.write().AudioAttributesImplApi21Parcelizer();
    }

    private void AudioAttributesImplBaseParcelizer() {
        Preconditions.checkState(!this.AudioAttributesImplApi26Parcelizer.get(), "FirebaseApp was deleted");
    }

    public final boolean AudioAttributesImplApi21Parcelizer() {
        return "[DEFAULT]".equals(IconCompatParcelizer());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void AudioAttributesCompatParcelizer(boolean z) {
        Iterator<RemoteActionCompatParcelizer> it = this.read.iterator();
        while (it.hasNext()) {
            it.next().write(z);
        }
    }

    private void AudioAttributesCompatParcelizer(RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        AudioAttributesImplBaseParcelizer();
        if (this.RemoteActionCompatParcelizer.get() && BackgroundDetector.getInstance().isInBackground()) {
            remoteActionCompatParcelizer.write(true);
        }
        this.read.add(remoteActionCompatParcelizer);
    }

    public final String MediaBrowserCompatCustomActionResultReceiver() {
        StringBuilder sb = new StringBuilder();
        sb.append(Base64Utils.encodeUrlSafeNoPadding(IconCompatParcelizer().getBytes(Charset.defaultCharset())));
        sb.append("+");
        sb.append(Base64Utils.encodeUrlSafeNoPadding(read().RemoteActionCompatParcelizer().getBytes(Charset.defaultCharset())));
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void MediaBrowserCompatItemReceiver() {
        if (!_findExplicitStringFactoryMethod.read(this.write)) {
            IconCompatParcelizer();
            AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(this.write);
        } else {
            IconCompatParcelizer();
            this.MediaBrowserCompatItemReceiver.IconCompatParcelizer(AudioAttributesImplApi21Parcelizer());
            this.MediaBrowserCompatCustomActionResultReceiver.write().AudioAttributesImplApi21Parcelizer();
        }
    }

    private static String RemoteActionCompatParcelizer(String str) {
        return str.trim();
    }

    static class AudioAttributesCompatParcelizer extends BroadcastReceiver {
        private static AtomicReference<AudioAttributesCompatParcelizer> RemoteActionCompatParcelizer = new AtomicReference<>();
        private final Context read;

        private AudioAttributesCompatParcelizer(Context context) {
            this.read = context;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void RemoteActionCompatParcelizer(Context context) {
            if (RemoteActionCompatParcelizer.get() == null) {
                AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = new AudioAttributesCompatParcelizer(context);
                if (setBackInvokedCallbackEnabled.read(RemoteActionCompatParcelizer, null, audioAttributesCompatParcelizer)) {
                    context.registerReceiver(audioAttributesCompatParcelizer, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                }
            }
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            synchronized (FirebaseApp.AudioAttributesCompatParcelizer) {
                Iterator<FirebaseApp> it = FirebaseApp.IconCompatParcelizer.values().iterator();
                while (it.hasNext()) {
                    it.next().MediaBrowserCompatItemReceiver();
                }
            }
            read();
        }

        private void read() {
            this.read.unregisterReceiver(this);
        }
    }

    static class read implements BackgroundDetector.BackgroundStateChangeListener {
        private static AtomicReference<read> IconCompatParcelizer = new AtomicReference<>();

        private read() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void read(Context context) {
            if (PlatformVersion.isAtLeastIceCreamSandwich() && (context.getApplicationContext() instanceof Application)) {
                Application application = (Application) context.getApplicationContext();
                if (IconCompatParcelizer.get() == null) {
                    read readVar = new read();
                    if (setBackInvokedCallbackEnabled.read(IconCompatParcelizer, null, readVar)) {
                        BackgroundDetector.initialize(application);
                        BackgroundDetector.getInstance().addListener(readVar);
                    }
                }
            }
        }

        @Override // com.google.android.gms.common.api.internal.BackgroundDetector.BackgroundStateChangeListener
        public final void onBackgroundStateChanged(boolean z) {
            synchronized (FirebaseApp.AudioAttributesCompatParcelizer) {
                for (FirebaseApp firebaseApp : new ArrayList(FirebaseApp.IconCompatParcelizer.values())) {
                    if (firebaseApp.RemoteActionCompatParcelizer.get()) {
                        firebaseApp.AudioAttributesCompatParcelizer(z);
                    }
                }
            }
        }
    }
}
