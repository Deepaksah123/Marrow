package kotlin;

import android.media.NotProvisionedException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import androidx.media3.common.DrmInitData;
import com.google.android.exoplayer2.C;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.PropertySerializerMapDouble;
import kotlin.PropertySerializerMapEmpty;
import kotlin.SimpleBeanPropertyFilter1;
import kotlin._resolveSuperClass;

/* JADX INFO: loaded from: classes2.dex */
final class withSerializer implements PropertySerializerMapDouble {
    private SimpleBeanPropertyFilter1.read AudioAttributesCompatParcelizer;
    private final _resolveSuperClass AudioAttributesImplApi21Parcelizer;
    private final boolean AudioAttributesImplApi26Parcelizer;
    private PropertySerializerMapDouble.IconCompatParcelizer AudioAttributesImplBaseParcelizer;
    public final List<DrmInitData.SchemeData> IconCompatParcelizer;
    private final typeProperty<PropertySerializerMapEmpty.read> MediaBrowserCompatCustomActionResultReceiver;
    private final HashMap<String, String> MediaBrowserCompatItemReceiver;
    private final boolean MediaBrowserCompatMediaItem;
    private final int MediaBrowserCompatSearchResultReceiver;
    private write MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    private byte[] MediaDescriptionCompat;
    private final SimpleBeanPropertyFilter1 MediaMetadataCompat;
    private final Looper RatingCompat;
    private SimpleBeanPropertyFilter1.IconCompatParcelizer RemoteActionCompatParcelizer;
    private final IconCompatParcelizer handleMediaPlayPauseIfPendingOnHandler;
    private final RemoteActionCompatParcelizer onAddQueueItem;
    private final modifyArraySerializer onCommand;
    private int onCustomAction;
    private final UUID onFastForward;
    private final AudioAttributesCompatParcelizer onMediaButtonEvent;
    private int onPause;
    private byte[] onPlay;
    private HandlerThread onPlayFromMediaId;
    private final UnknownSerializer read;
    private handleMissingId write;

    public interface IconCompatParcelizer {
        void read(withSerializer withserializer, int i);

        void write(withSerializer withserializer);
    }

    public interface RemoteActionCompatParcelizer {
        void AudioAttributesCompatParcelizer(Exception exc, boolean z);

        void read();

        void read(withSerializer withserializer);
    }

    public static final class MediaBrowserCompatItemReceiver extends IOException {
        public MediaBrowserCompatItemReceiver(Throwable th) {
            super(th);
        }
    }

    public withSerializer(UUID uuid, SimpleBeanPropertyFilter1 simpleBeanPropertyFilter1, RemoteActionCompatParcelizer remoteActionCompatParcelizer, IconCompatParcelizer iconCompatParcelizer, List<DrmInitData.SchemeData> list, int i, boolean z, boolean z2, byte[] bArr, HashMap<String, String> map, UnknownSerializer unknownSerializer, Looper looper, _resolveSuperClass _resolvesuperclass, modifyArraySerializer modifyarrayserializer) {
        this.onFastForward = uuid;
        this.onAddQueueItem = remoteActionCompatParcelizer;
        this.handleMediaPlayPauseIfPendingOnHandler = iconCompatParcelizer;
        this.MediaMetadataCompat = simpleBeanPropertyFilter1;
        this.MediaBrowserCompatSearchResultReceiver = i;
        this.MediaBrowserCompatMediaItem = z;
        this.AudioAttributesImplApi26Parcelizer = z2;
        if (bArr != null) {
            this.MediaDescriptionCompat = bArr;
            this.IconCompatParcelizer = null;
        } else {
            this.IconCompatParcelizer = Collections.unmodifiableList((List) buildTypeSerializer.IconCompatParcelizer(list));
        }
        this.MediaBrowserCompatItemReceiver = map;
        this.read = unknownSerializer;
        this.MediaBrowserCompatCustomActionResultReceiver = new typeProperty<>();
        this.AudioAttributesImplApi21Parcelizer = _resolvesuperclass;
        this.onCommand = modifyarrayserializer;
        this.onPause = 2;
        this.RatingCompat = looper;
        this.onMediaButtonEvent = new AudioAttributesCompatParcelizer(looper);
    }

    public final boolean write(byte[] bArr) {
        RatingCompat();
        return Arrays.equals(this.onPlay, bArr);
    }

    final void read(int i) {
        if (i != 2) {
            return;
        }
        MediaBrowserCompatSearchResultReceiver();
    }

    final void AudioAttributesImplApi26Parcelizer() {
        this.RemoteActionCompatParcelizer = this.MediaMetadataCompat.RemoteActionCompatParcelizer();
        ((write) LaissezFaireSubTypeValidator.IconCompatParcelizer(this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver)).AudioAttributesCompatParcelizer(1, buildTypeSerializer.IconCompatParcelizer(this.RemoteActionCompatParcelizer), true);
    }

    final void RemoteActionCompatParcelizer() {
        if (MediaDescriptionCompat()) {
            AudioAttributesCompatParcelizer(true);
        }
    }

    final void read(Exception exc, boolean z) {
        read(exc, z ? 1 : 3);
    }

    @Override // kotlin.PropertySerializerMapDouble
    public final int IconCompatParcelizer() {
        RatingCompat();
        return this.onPause;
    }

    @Override // kotlin.PropertySerializerMapDouble
    public final boolean MediaBrowserCompatCustomActionResultReceiver() {
        RatingCompat();
        return this.MediaBrowserCompatMediaItem;
    }

    @Override // kotlin.PropertySerializerMapDouble
    public final PropertySerializerMapDouble.IconCompatParcelizer write() {
        RatingCompat();
        if (this.onPause == 1) {
            return this.AudioAttributesImplBaseParcelizer;
        }
        return null;
    }

    @Override // kotlin.PropertySerializerMapDouble
    public final UUID read() {
        RatingCompat();
        return this.onFastForward;
    }

    @Override // kotlin.PropertySerializerMapDouble
    public final handleMissingId AudioAttributesCompatParcelizer() {
        RatingCompat();
        return this.write;
    }

    @Override // kotlin.PropertySerializerMapDouble
    public final Map<String, String> MediaBrowserCompatItemReceiver() {
        RatingCompat();
        byte[] bArr = this.onPlay;
        if (bArr == null) {
            return null;
        }
        return this.MediaMetadataCompat.write(bArr);
    }

    @Override // kotlin.PropertySerializerMapDouble
    public final boolean AudioAttributesCompatParcelizer(String str) {
        RatingCompat();
        return this.MediaMetadataCompat.RemoteActionCompatParcelizer((byte[]) buildTypeSerializer.AudioAttributesCompatParcelizer(this.onPlay), str);
    }

    @Override // kotlin.PropertySerializerMapDouble
    public final void AudioAttributesCompatParcelizer(PropertySerializerMapEmpty.read readVar) {
        RatingCompat();
        if (this.onCustomAction < 0) {
            StringBuilder sb = new StringBuilder("Session reference count less than zero: ");
            sb.append(this.onCustomAction);
            prune.AudioAttributesCompatParcelizer("DefaultDrmSession", sb.toString());
            this.onCustomAction = 0;
        }
        if (readVar != null) {
            this.MediaBrowserCompatCustomActionResultReceiver.AudioAttributesCompatParcelizer(readVar);
        }
        int i = this.onCustomAction + 1;
        this.onCustomAction = i;
        if (i == 1) {
            buildTypeSerializer.write(this.onPause == 2);
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:DrmRequestHandler");
            this.onPlayFromMediaId = handlerThread;
            handlerThread.start();
            this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = new write(this.onPlayFromMediaId.getLooper());
            if (MediaDescriptionCompat()) {
                AudioAttributesCompatParcelizer(true);
            }
        } else if (readVar != null && AudioAttributesImplApi21Parcelizer() && this.MediaBrowserCompatCustomActionResultReceiver.write(readVar) == 1) {
            readVar.read(this.onPause);
        }
        this.handleMediaPlayPauseIfPendingOnHandler.write(this);
    }

    @Override // kotlin.PropertySerializerMapDouble
    public final void read(PropertySerializerMapEmpty.read readVar) {
        RatingCompat();
        int i = this.onCustomAction;
        if (i <= 0) {
            prune.AudioAttributesCompatParcelizer("DefaultDrmSession", "release() called on a session that's already fully released.");
            return;
        }
        int i2 = i - 1;
        this.onCustomAction = i2;
        if (i2 == 0) {
            this.onPause = 0;
            ((AudioAttributesCompatParcelizer) LaissezFaireSubTypeValidator.IconCompatParcelizer(this.onMediaButtonEvent)).removeCallbacksAndMessages(null);
            ((write) LaissezFaireSubTypeValidator.IconCompatParcelizer(this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver)).read();
            this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = null;
            ((HandlerThread) LaissezFaireSubTypeValidator.IconCompatParcelizer(this.onPlayFromMediaId)).quit();
            this.onPlayFromMediaId = null;
            this.write = null;
            this.AudioAttributesImplBaseParcelizer = null;
            this.AudioAttributesCompatParcelizer = null;
            this.RemoteActionCompatParcelizer = null;
            byte[] bArr = this.onPlay;
            if (bArr != null) {
                this.MediaMetadataCompat.AudioAttributesCompatParcelizer(bArr);
                this.onPlay = null;
            }
        }
        if (readVar != null) {
            this.MediaBrowserCompatCustomActionResultReceiver.RemoteActionCompatParcelizer(readVar);
            if (this.MediaBrowserCompatCustomActionResultReceiver.write(readVar) == 0) {
                readVar.AudioAttributesCompatParcelizer();
            }
        }
        this.handleMediaPlayPauseIfPendingOnHandler.read(this, this.onCustomAction);
    }

    private boolean MediaDescriptionCompat() {
        if (AudioAttributesImplApi21Parcelizer()) {
            return true;
        }
        try {
            byte[] bArr = this.MediaMetadataCompat.read();
            this.onPlay = bArr;
            this.MediaMetadataCompat.AudioAttributesCompatParcelizer(bArr, this.onCommand);
            this.write = this.MediaMetadataCompat.IconCompatParcelizer(this.onPlay);
            this.onPause = 3;
            AudioAttributesCompatParcelizer(new TypeSerializer() { // from class: o.MapEntrySerializer1
                public final /* synthetic */ int IconCompatParcelizer = 3;

                @Override // kotlin.TypeSerializer
                public final void read(Object obj) {
                    ((PropertySerializerMapEmpty.read) obj).read(this.IconCompatParcelizer);
                }
            });
            return true;
        } catch (NotProvisionedException unused) {
            this.onAddQueueItem.read(this);
            return false;
        } catch (Exception | NoSuchMethodError e) {
            if (matchesTyped.IconCompatParcelizer(e)) {
                this.onAddQueueItem.read(this);
                return false;
            }
            read(e, 1);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void RemoteActionCompatParcelizer(Object obj, Object obj2) {
        if (obj == this.RemoteActionCompatParcelizer) {
            if (this.onPause == 2 || AudioAttributesImplApi21Parcelizer()) {
                this.RemoteActionCompatParcelizer = null;
                if (obj2 instanceof Exception) {
                    this.onAddQueueItem.AudioAttributesCompatParcelizer((Exception) obj2, false);
                    return;
                }
                try {
                    this.MediaMetadataCompat.read((byte[]) obj2);
                    this.onAddQueueItem.read();
                } catch (Exception e) {
                    this.onAddQueueItem.AudioAttributesCompatParcelizer(e, true);
                }
            }
        }
    }

    private void AudioAttributesCompatParcelizer(boolean z) {
        if (this.AudioAttributesImplApi26Parcelizer) {
            return;
        }
        byte[] bArr = (byte[]) LaissezFaireSubTypeValidator.IconCompatParcelizer(this.onPlay);
        int i = this.MediaBrowserCompatSearchResultReceiver;
        if (i != 0 && i != 1) {
            if (i != 2) {
                if (i == 3) {
                    RemoteActionCompatParcelizer(this.MediaDescriptionCompat, 3, z);
                    return;
                }
                return;
            } else {
                if (this.MediaDescriptionCompat == null || MediaBrowserCompatMediaItem()) {
                    RemoteActionCompatParcelizer(bArr, 2, z);
                    return;
                }
                return;
            }
        }
        if (this.MediaDescriptionCompat == null) {
            RemoteActionCompatParcelizer(bArr, 1, z);
            return;
        }
        if (this.onPause == 4 || MediaBrowserCompatMediaItem()) {
            long jAudioAttributesImplBaseParcelizer = AudioAttributesImplBaseParcelizer();
            if (this.MediaBrowserCompatSearchResultReceiver == 0 && jAudioAttributesImplBaseParcelizer <= 60) {
                prune.IconCompatParcelizer("DefaultDrmSession", "Offline license has expired or will expire soon. Remaining seconds: ".concat(String.valueOf(jAudioAttributesImplBaseParcelizer)));
                RemoteActionCompatParcelizer(bArr, 2, z);
            } else if (jAudioAttributesImplBaseParcelizer <= 0) {
                read(new C0215typeSerializer(), 2);
            } else {
                this.onPause = 4;
                AudioAttributesCompatParcelizer(new TypeSerializer() { // from class: o.findAndAddSecondarySerializer
                    @Override // kotlin.TypeSerializer
                    public final void read(Object obj) {
                        ((PropertySerializerMapEmpty.read) obj).RemoteActionCompatParcelizer();
                    }
                });
            }
        }
    }

    private boolean MediaBrowserCompatMediaItem() {
        try {
            this.MediaMetadataCompat.RemoteActionCompatParcelizer(this.onPlay, this.MediaDescriptionCompat);
            return true;
        } catch (Exception | NoSuchMethodError e) {
            read(e, 1);
            return false;
        }
    }

    private long AudioAttributesImplBaseParcelizer() {
        if (!JsonMapFormatVisitor.IconCompatParcelizer.equals(this.onFastForward)) {
            return Long.MAX_VALUE;
        }
        Pair pair = (Pair) buildTypeSerializer.IconCompatParcelizer(UnwrappingBeanSerializer.IconCompatParcelizer(this));
        return Math.min(((Long) pair.first).longValue(), ((Long) pair.second).longValue());
    }

    private void RemoteActionCompatParcelizer(byte[] bArr, int i, boolean z) {
        try {
            this.AudioAttributesCompatParcelizer = this.MediaMetadataCompat.AudioAttributesCompatParcelizer(bArr, this.IconCompatParcelizer, i, this.MediaBrowserCompatItemReceiver);
            ((write) LaissezFaireSubTypeValidator.IconCompatParcelizer(this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver)).AudioAttributesCompatParcelizer(2, buildTypeSerializer.IconCompatParcelizer(this.AudioAttributesCompatParcelizer), z);
        } catch (Exception | NoSuchMethodError e) {
            read(e, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void AudioAttributesCompatParcelizer(Object obj, Object obj2) {
        if (obj == this.AudioAttributesCompatParcelizer && AudioAttributesImplApi21Parcelizer()) {
            this.AudioAttributesCompatParcelizer = null;
            if ((obj2 instanceof Exception) || (obj2 instanceof NoSuchMethodError)) {
                read((Throwable) obj2, false);
                return;
            }
            try {
                byte[] bArr = (byte[]) obj2;
                if (this.MediaBrowserCompatSearchResultReceiver == 3) {
                    this.MediaMetadataCompat.AudioAttributesCompatParcelizer((byte[]) LaissezFaireSubTypeValidator.IconCompatParcelizer(this.MediaDescriptionCompat), bArr);
                    AudioAttributesCompatParcelizer(new TypeSerializer() { // from class: o.PropertySerializerMap
                        @Override // kotlin.TypeSerializer
                        public final void read(Object obj3) {
                            ((PropertySerializerMapEmpty.read) obj3).write();
                        }
                    });
                    return;
                }
                byte[] bArrAudioAttributesCompatParcelizer = this.MediaMetadataCompat.AudioAttributesCompatParcelizer(this.onPlay, bArr);
                int i = this.MediaBrowserCompatSearchResultReceiver;
                if ((i == 2 || (i == 0 && this.MediaDescriptionCompat != null)) && bArrAudioAttributesCompatParcelizer != null && bArrAudioAttributesCompatParcelizer.length != 0) {
                    this.MediaDescriptionCompat = bArrAudioAttributesCompatParcelizer;
                }
                this.onPause = 4;
                AudioAttributesCompatParcelizer(new TypeSerializer() { // from class: o.addSerializer
                    @Override // kotlin.TypeSerializer
                    public final void read(Object obj3) {
                        ((PropertySerializerMapEmpty.read) obj3).IconCompatParcelizer();
                    }
                });
            } catch (Exception | NoSuchMethodError e) {
                read(e, true);
            }
        }
    }

    private void MediaBrowserCompatSearchResultReceiver() {
        if (this.MediaBrowserCompatSearchResultReceiver == 0 && this.onPause == 4) {
            LaissezFaireSubTypeValidator.IconCompatParcelizer(this.onPlay);
            AudioAttributesCompatParcelizer(false);
        }
    }

    private void read(Throwable th, boolean z) {
        if ((th instanceof NotProvisionedException) || matchesTyped.IconCompatParcelizer(th)) {
            this.onAddQueueItem.read(this);
        } else {
            read(th, z ? 1 : 2);
        }
    }

    private void read(final Throwable th, int i) {
        this.AudioAttributesImplBaseParcelizer = new PropertySerializerMapDouble.IconCompatParcelizer(th, matchesTyped.AudioAttributesCompatParcelizer(th, i));
        prune.read("DefaultDrmSession", "DRM session error", th);
        if (th instanceof Exception) {
            AudioAttributesCompatParcelizer(new TypeSerializer() { // from class: o.findAndAddKeySerializer
                @Override // kotlin.TypeSerializer
                public final void read(Object obj) {
                    ((PropertySerializerMapEmpty.read) obj).AudioAttributesCompatParcelizer((Exception) th);
                }
            });
        } else if (th instanceof Error) {
            if (!matchesTyped.AudioAttributesCompatParcelizer(th) && !matchesTyped.IconCompatParcelizer(th)) {
                throw ((Error) th);
            }
        } else {
            throw new IllegalStateException("Unexpected Throwable subclass", th);
        }
        if (this.onPause != 4) {
            this.onPause = 1;
        }
    }

    private boolean AudioAttributesImplApi21Parcelizer() {
        int i = this.onPause;
        return i == 3 || i == 4;
    }

    private void AudioAttributesCompatParcelizer(TypeSerializer<PropertySerializerMapEmpty.read> typeSerializer) {
        Iterator<PropertySerializerMapEmpty.read> it = this.MediaBrowserCompatCustomActionResultReceiver.read().iterator();
        while (it.hasNext()) {
            typeSerializer.read(it.next());
        }
    }

    private void RatingCompat() {
        if (Thread.currentThread() != this.RatingCompat.getThread()) {
            StringBuilder sb = new StringBuilder("DefaultDrmSession accessed on the wrong thread.\nCurrent thread: ");
            sb.append(Thread.currentThread().getName());
            sb.append("\nExpected thread: ");
            sb.append(this.RatingCompat.getThread().getName());
            prune.write("DefaultDrmSession", sb.toString(), new IllegalStateException());
        }
    }

    class AudioAttributesCompatParcelizer extends Handler {
        public AudioAttributesCompatParcelizer(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            Pair pair = (Pair) message.obj;
            Object obj = pair.first;
            Object obj2 = pair.second;
            int i = message.what;
            if (i == 1) {
                withSerializer.this.RemoteActionCompatParcelizer(obj, obj2);
            } else {
                if (i != 2) {
                    return;
                }
                withSerializer.this.AudioAttributesCompatParcelizer(obj, obj2);
            }
        }
    }

    class write extends Handler {
        private boolean IconCompatParcelizer;

        public write(Looper looper) {
            super(looper);
        }

        final void AudioAttributesCompatParcelizer(int i, Object obj, boolean z) {
            obtainMessage(i, new read(StdDelegatingSerializer.AudioAttributesCompatParcelizer(), z, SystemClock.elapsedRealtime(), obj)).sendToTarget();
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            Object objWrite;
            read readVar = (read) message.obj;
            try {
                int i = message.what;
                if (i == 1) {
                    UnknownSerializer unknownSerializer = withSerializer.this.read;
                    UUID unused = withSerializer.this.onFastForward;
                    objWrite = unknownSerializer.write((SimpleBeanPropertyFilter1.IconCompatParcelizer) readVar.read);
                } else if (i == 2) {
                    objWrite = withSerializer.this.read.IconCompatParcelizer(withSerializer.this.onFastForward, (SimpleBeanPropertyFilter1.read) readVar.read);
                } else {
                    throw new RuntimeException();
                }
            } catch (writeAsId e) {
                boolean z = read(message, e);
                objWrite = e;
                if (z) {
                    return;
                }
            } catch (Exception e2) {
                prune.write("DefaultDrmSession", "Key/provisioning request produced an unexpected exception. Not retrying.", e2);
                objWrite = e2;
            }
            _resolveSuperClass unused2 = withSerializer.this.AudioAttributesImplApi21Parcelizer;
            long j = readVar.write;
            synchronized (this) {
                if (!this.IconCompatParcelizer) {
                    withSerializer.this.onMediaButtonEvent.obtainMessage(message.what, Pair.create(readVar.read, objWrite)).sendToTarget();
                }
            }
        }

        private boolean read(Message message, writeAsId writeasid) {
            IOException mediaBrowserCompatItemReceiver;
            read readVar = (read) message.obj;
            if (!readVar.RemoteActionCompatParcelizer) {
                return false;
            }
            readVar.IconCompatParcelizer++;
            if (readVar.IconCompatParcelizer > withSerializer.this.AudioAttributesImplApi21Parcelizer.write(3)) {
                return false;
            }
            StdDelegatingSerializer stdDelegatingSerializer = new StdDelegatingSerializer(readVar.write, writeasid.RemoteActionCompatParcelizer, writeasid.read, writeasid.write, SystemClock.elapsedRealtime(), SystemClock.elapsedRealtime() - readVar.AudioAttributesCompatParcelizer, writeasid.AudioAttributesCompatParcelizer);
            StdArraySerializersShortArraySerializer stdArraySerializersShortArraySerializer = new StdArraySerializersShortArraySerializer(3);
            if (writeasid.getCause() instanceof IOException) {
                mediaBrowserCompatItemReceiver = (IOException) writeasid.getCause();
            } else {
                mediaBrowserCompatItemReceiver = new MediaBrowserCompatItemReceiver(writeasid.getCause());
            }
            long jWrite = withSerializer.this.AudioAttributesImplApi21Parcelizer.write(new _resolveSuperClass.AudioAttributesCompatParcelizer(stdDelegatingSerializer, stdArraySerializersShortArraySerializer, mediaBrowserCompatItemReceiver, readVar.IconCompatParcelizer));
            if (jWrite == C.TIME_UNSET) {
                return false;
            }
            synchronized (this) {
                if (this.IconCompatParcelizer) {
                    return false;
                }
                sendMessageDelayed(Message.obtain(message), jWrite);
                return true;
            }
        }

        public final void read() {
            synchronized (this) {
                removeCallbacksAndMessages(null);
                this.IconCompatParcelizer = true;
            }
        }
    }

    static final class read {
        public final long AudioAttributesCompatParcelizer;
        public int IconCompatParcelizer;
        public final boolean RemoteActionCompatParcelizer;
        public final Object read;
        public final long write;

        public read(long j, boolean z, long j2, Object obj) {
            this.write = j;
            this.RemoteActionCompatParcelizer = z;
            this.AudioAttributesCompatParcelizer = j2;
            this.read = obj;
        }
    }
}
