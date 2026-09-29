package kotlin;

import android.media.ResourceBusyException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import androidx.media3.common.DrmInitData;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.PlaybackException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import kotlin.PropertySerializerMapDouble;
import kotlin.PropertySerializerMapEmpty;
import kotlin.SimpleBeanPropertyFilter1;
import kotlin.matchesUntyped;
import kotlin.withSerializer;

/* JADX INFO: loaded from: classes2.dex */
public final class findAndAddPrimarySerializer implements matchesUntyped {
    private SimpleBeanPropertyFilter1 AudioAttributesCompatParcelizer;
    private final Set<withSerializer> AudioAttributesImplApi21Parcelizer;
    private int AudioAttributesImplApi26Parcelizer;
    private final boolean AudioAttributesImplBaseParcelizer;
    private final UnknownSerializer IconCompatParcelizer;
    private final _resolveSuperClass MediaBrowserCompatCustomActionResultReceiver;
    private final HashMap<String, String> MediaBrowserCompatItemReceiver;
    private byte[] MediaBrowserCompatMediaItem;
    private Handler MediaBrowserCompatSearchResultReceiver;
    private final Set<IconCompatParcelizer> MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    private final boolean MediaDescriptionCompat;
    private withSerializer MediaMetadataCompat;
    private withSerializer RatingCompat;
    volatile read RemoteActionCompatParcelizer;
    private final AudioAttributesImplBaseParcelizer handleMediaPlayPauseIfPendingOnHandler;
    private Looper onAddQueueItem;
    private int onCommand;
    private modifyArraySerializer onCustomAction;
    private final AudioAttributesImplApi26Parcelizer onFastForward;
    private final List<withSerializer> onMediaButtonEvent;
    private final int[] onPause;
    private final long onPlay;
    private final UUID onPlayFromMediaId;
    private final SimpleBeanPropertyFilter1.AudioAttributesCompatParcelizer read;

    /* synthetic */ findAndAddPrimarySerializer(UUID uuid, SimpleBeanPropertyFilter1.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer, UnknownSerializer unknownSerializer, HashMap map, boolean z, int[] iArr, boolean z2, _resolveSuperClass _resolvesuperclass, long j, byte b) {
        this(uuid, audioAttributesCompatParcelizer, unknownSerializer, map, z, iArr, z2, _resolvesuperclass, j);
    }

    static /* synthetic */ withSerializer MediaBrowserCompatSearchResultReceiver(findAndAddPrimarySerializer findandaddprimaryserializer) {
        findandaddprimaryserializer.RatingCompat = null;
        return null;
    }

    static /* synthetic */ withSerializer RemoteActionCompatParcelizer(findAndAddPrimarySerializer findandaddprimaryserializer) {
        findandaddprimaryserializer.MediaMetadataCompat = null;
        return null;
    }

    static /* synthetic */ PropertySerializerMapDouble write(findAndAddPrimarySerializer findandaddprimaryserializer, Looper looper, PropertySerializerMapEmpty.read readVar, C0170format c0170format) {
        return findandaddprimaryserializer.write(looper, readVar, c0170format, false);
    }

    public static final class AudioAttributesCompatParcelizer {
        private boolean AudioAttributesCompatParcelizer;
        private final HashMap<String, String> RemoteActionCompatParcelizer = new HashMap<>();
        private UUID AudioAttributesImplBaseParcelizer = JsonMapFormatVisitor.IconCompatParcelizer;
        private SimpleBeanPropertyFilter1.AudioAttributesCompatParcelizer read = serializeContentsSlow.write;
        private int[] AudioAttributesImplApi26Parcelizer = new int[0];
        private boolean write = true;
        private _resolveSuperClass IconCompatParcelizer = new _unknownType();
        private long AudioAttributesImplApi21Parcelizer = 300000;

        public final AudioAttributesCompatParcelizer AudioAttributesCompatParcelizer(UUID uuid, SimpleBeanPropertyFilter1.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
            this.AudioAttributesImplBaseParcelizer = (UUID) buildTypeSerializer.IconCompatParcelizer(uuid);
            this.read = (SimpleBeanPropertyFilter1.AudioAttributesCompatParcelizer) buildTypeSerializer.IconCompatParcelizer(audioAttributesCompatParcelizer);
            return this;
        }

        public final AudioAttributesCompatParcelizer AudioAttributesCompatParcelizer(boolean z) {
            this.AudioAttributesCompatParcelizer = z;
            return this;
        }

        public final AudioAttributesCompatParcelizer RemoteActionCompatParcelizer(int... iArr) {
            for (int i : iArr) {
                boolean z = true;
                if (i != 2 && i != 1) {
                    z = false;
                }
                buildTypeSerializer.IconCompatParcelizer(z);
            }
            this.AudioAttributesImplApi26Parcelizer = (int[]) iArr.clone();
            return this;
        }

        public final AudioAttributesCompatParcelizer read(boolean z) {
            this.write = z;
            return this;
        }

        public final findAndAddPrimarySerializer IconCompatParcelizer(UnknownSerializer unknownSerializer) {
            return new findAndAddPrimarySerializer(this.AudioAttributesImplBaseParcelizer, this.read, unknownSerializer, this.RemoteActionCompatParcelizer, this.AudioAttributesCompatParcelizer, this.AudioAttributesImplApi26Parcelizer, this.write, this.IconCompatParcelizer, this.AudioAttributesImplApi21Parcelizer, (byte) 0);
        }
    }

    public static final class write extends Exception {
        /* synthetic */ write(UUID uuid, byte b) {
            this(uuid);
        }

        private write(UUID uuid) {
            super("Media does not support uuid: ".concat(String.valueOf(uuid)));
        }
    }

    private findAndAddPrimarySerializer(UUID uuid, SimpleBeanPropertyFilter1.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer, UnknownSerializer unknownSerializer, HashMap<String, String> map, boolean z, int[] iArr, boolean z2, _resolveSuperClass _resolvesuperclass, long j) {
        buildTypeSerializer.write(!JsonMapFormatVisitor.write.equals(uuid), "Use C.CLEARKEY_UUID instead");
        this.onPlayFromMediaId = uuid;
        this.read = audioAttributesCompatParcelizer;
        this.IconCompatParcelizer = unknownSerializer;
        this.MediaBrowserCompatItemReceiver = map;
        this.AudioAttributesImplBaseParcelizer = z;
        this.onPause = iArr;
        this.MediaDescriptionCompat = z2;
        this.MediaBrowserCompatCustomActionResultReceiver = _resolvesuperclass;
        this.handleMediaPlayPauseIfPendingOnHandler = new AudioAttributesImplBaseParcelizer();
        this.onFastForward = new AudioAttributesImplApi26Parcelizer(this, (byte) 0);
        this.AudioAttributesImplApi26Parcelizer = 0;
        this.onMediaButtonEvent = new ArrayList();
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = modifyTrack.AudioAttributesCompatParcelizer();
        this.AudioAttributesImplApi21Parcelizer = modifyTrack.AudioAttributesCompatParcelizer();
        this.onPlay = j;
    }

    public final void IconCompatParcelizer(byte[] bArr) {
        buildTypeSerializer.write(this.onMediaButtonEvent.isEmpty());
        this.AudioAttributesImplApi26Parcelizer = 0;
        this.MediaBrowserCompatMediaItem = bArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.matchesUntyped
    public final void IconCompatParcelizer() {
        write(true);
        int i = this.onCommand;
        this.onCommand = i + 1;
        if (i == 0) {
            Object[] objArr = 0;
            if (this.AudioAttributesCompatParcelizer == null) {
                SimpleBeanPropertyFilter1 simpleBeanPropertyFilter1AudioAttributesCompatParcelizer = this.read.AudioAttributesCompatParcelizer(this.onPlayFromMediaId);
                this.AudioAttributesCompatParcelizer = simpleBeanPropertyFilter1AudioAttributesCompatParcelizer;
                simpleBeanPropertyFilter1AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(new RemoteActionCompatParcelizer(this, objArr == true ? 1 : 0));
            } else if (this.onPlay != C.TIME_UNSET) {
                for (int i2 = 0; i2 < this.onMediaButtonEvent.size(); i2++) {
                    this.onMediaButtonEvent.get(i2).AudioAttributesCompatParcelizer((PropertySerializerMapEmpty.read) null);
                }
            }
        }
    }

    @Override // kotlin.matchesUntyped
    public final void write() {
        write(true);
        int i = this.onCommand - 1;
        this.onCommand = i;
        if (i != 0) {
            return;
        }
        if (this.onPlay != C.TIME_UNSET) {
            ArrayList arrayList = new ArrayList(this.onMediaButtonEvent);
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                ((withSerializer) arrayList.get(i2)).read((PropertySerializerMapEmpty.read) null);
            }
        }
        RemoteActionCompatParcelizer();
        read();
    }

    @Override // kotlin.matchesUntyped
    public final void write(Looper looper, modifyArraySerializer modifyarrayserializer) {
        IconCompatParcelizer(looper);
        this.onCustomAction = modifyarrayserializer;
    }

    @Override // kotlin.matchesUntyped
    public final matchesUntyped.AudioAttributesCompatParcelizer IconCompatParcelizer(PropertySerializerMapEmpty.read readVar, C0170format c0170format) {
        buildTypeSerializer.write(this.onCommand > 0);
        buildTypeSerializer.AudioAttributesCompatParcelizer(this.onAddQueueItem);
        IconCompatParcelizer iconCompatParcelizer = new IconCompatParcelizer(readVar);
        iconCompatParcelizer.read(c0170format);
        return iconCompatParcelizer;
    }

    @Override // kotlin.matchesUntyped
    public final PropertySerializerMapDouble AudioAttributesCompatParcelizer(PropertySerializerMapEmpty.read readVar, C0170format c0170format) {
        write(false);
        buildTypeSerializer.write(this.onCommand > 0);
        buildTypeSerializer.AudioAttributesCompatParcelizer(this.onAddQueueItem);
        return write(this.onAddQueueItem, readVar, c0170format, true);
    }

    private PropertySerializerMapDouble write(Looper looper, PropertySerializerMapEmpty.read readVar, C0170format c0170format, boolean z) {
        List<DrmInitData.SchemeData> listRemoteActionCompatParcelizer;
        read(looper);
        if (c0170format.MediaBrowserCompatMediaItem == null) {
            return write(DefaultBaseTypeLimitingValidator.IconCompatParcelizer(c0170format.onPlayFromUri), z);
        }
        withSerializer withserializer = null;
        byte b = 0;
        if (this.MediaBrowserCompatMediaItem == null) {
            listRemoteActionCompatParcelizer = RemoteActionCompatParcelizer((DrmInitData) buildTypeSerializer.IconCompatParcelizer(c0170format.MediaBrowserCompatMediaItem), this.onPlayFromMediaId, false);
            if (listRemoteActionCompatParcelizer.isEmpty()) {
                write writeVar = new write(this.onPlayFromMediaId, b);
                prune.read("DefaultDrmSessionMgr", "DRM error", writeVar);
                if (readVar != null) {
                    readVar.AudioAttributesCompatParcelizer(writeVar);
                }
                return new StringArraySerializer(new PropertySerializerMapDouble.IconCompatParcelizer(writeVar, PlaybackException.ERROR_CODE_DRM_CONTENT_ERROR));
            }
        } else {
            listRemoteActionCompatParcelizer = null;
        }
        if (!this.AudioAttributesImplBaseParcelizer) {
            withserializer = this.MediaMetadataCompat;
        } else {
            Iterator<withSerializer> it = this.onMediaButtonEvent.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                withSerializer next = it.next();
                if (LaissezFaireSubTypeValidator.read(next.IconCompatParcelizer, listRemoteActionCompatParcelizer)) {
                    withserializer = next;
                    break;
                }
            }
        }
        if (withserializer == null) {
            withSerializer withserializerWrite = write(listRemoteActionCompatParcelizer, false, readVar, z);
            if (!this.AudioAttributesImplBaseParcelizer) {
                this.MediaMetadataCompat = withserializerWrite;
            }
            this.onMediaButtonEvent.add(withserializerWrite);
            return withserializerWrite;
        }
        withserializer.AudioAttributesCompatParcelizer(readVar);
        return withserializer;
    }

    @Override // kotlin.matchesUntyped
    public final int AudioAttributesCompatParcelizer(C0170format c0170format) {
        write(false);
        int iAudioAttributesCompatParcelizer = ((SimpleBeanPropertyFilter1) buildTypeSerializer.IconCompatParcelizer(this.AudioAttributesCompatParcelizer)).AudioAttributesCompatParcelizer();
        if (c0170format.MediaBrowserCompatMediaItem == null) {
            if (LaissezFaireSubTypeValidator.IconCompatParcelizer(this.onPause, DefaultBaseTypeLimitingValidator.IconCompatParcelizer(c0170format.onPlayFromUri)) == -1) {
                return 0;
            }
        } else if (!AudioAttributesCompatParcelizer(c0170format.MediaBrowserCompatMediaItem)) {
            return 1;
        }
        return iAudioAttributesCompatParcelizer;
    }

    private PropertySerializerMapDouble write(int i, boolean z) {
        SimpleBeanPropertyFilter1 simpleBeanPropertyFilter1 = (SimpleBeanPropertyFilter1) buildTypeSerializer.IconCompatParcelizer(this.AudioAttributesCompatParcelizer);
        if ((simpleBeanPropertyFilter1.AudioAttributesCompatParcelizer() == 2 && StringCollectionSerializer.read) || LaissezFaireSubTypeValidator.IconCompatParcelizer(this.onPause, i) == -1 || simpleBeanPropertyFilter1.AudioAttributesCompatParcelizer() == 1) {
            return null;
        }
        withSerializer withserializer = this.RatingCompat;
        if (withserializer == null) {
            withSerializer withserializerWrite = write((List<DrmInitData.SchemeData>) initExtraTracks.AudioAttributesImplApi26Parcelizer(), true, (PropertySerializerMapEmpty.read) null, z);
            this.onMediaButtonEvent.add(withserializerWrite);
            this.RatingCompat = withserializerWrite;
        } else {
            withserializer.AudioAttributesCompatParcelizer((PropertySerializerMapEmpty.read) null);
        }
        return this.RatingCompat;
    }

    private boolean AudioAttributesCompatParcelizer(DrmInitData drmInitData) {
        if (this.MediaBrowserCompatMediaItem != null) {
            return true;
        }
        if (RemoteActionCompatParcelizer(drmInitData, this.onPlayFromMediaId, true).isEmpty()) {
            if (drmInitData.IconCompatParcelizer != 1 || !drmInitData.write(0).read(JsonMapFormatVisitor.write)) {
                return false;
            }
            StringBuilder sb = new StringBuilder("DrmInitData only contains common PSSH SchemeData. Assuming support for: ");
            sb.append(this.onPlayFromMediaId);
            prune.RemoteActionCompatParcelizer("DefaultDrmSessionMgr", sb.toString());
        }
        String str = drmInitData.AudioAttributesCompatParcelizer;
        if (str == null || C.CENC_TYPE_cenc.equals(str)) {
            return true;
        }
        return C.CENC_TYPE_cbcs.equals(str) ? LaissezFaireSubTypeValidator.MediaBrowserCompatCustomActionResultReceiver >= 25 : (C.CENC_TYPE_cbc1.equals(str) || C.CENC_TYPE_cens.equals(str)) ? false : true;
    }

    private void IconCompatParcelizer(Looper looper) {
        synchronized (this) {
            Looper looper2 = this.onAddQueueItem;
            if (looper2 == null) {
                this.onAddQueueItem = looper;
                this.MediaBrowserCompatSearchResultReceiver = new Handler(looper);
            } else {
                buildTypeSerializer.write(looper2 == looper);
            }
        }
    }

    private void read(Looper looper) {
        if (this.RemoteActionCompatParcelizer == null) {
            this.RemoteActionCompatParcelizer = new read(looper);
        }
    }

    private withSerializer write(List<DrmInitData.SchemeData> list, boolean z, PropertySerializerMapEmpty.read readVar, boolean z2) {
        withSerializer withserializerIconCompatParcelizer = IconCompatParcelizer(list, z, readVar);
        if (RemoteActionCompatParcelizer(withserializerIconCompatParcelizer) && !this.AudioAttributesImplApi21Parcelizer.isEmpty()) {
            AudioAttributesCompatParcelizer();
            IconCompatParcelizer(withserializerIconCompatParcelizer, readVar);
            withserializerIconCompatParcelizer = IconCompatParcelizer(list, z, readVar);
        }
        if (!RemoteActionCompatParcelizer(withserializerIconCompatParcelizer) || !z2 || this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.isEmpty()) {
            return withserializerIconCompatParcelizer;
        }
        RemoteActionCompatParcelizer();
        if (!this.AudioAttributesImplApi21Parcelizer.isEmpty()) {
            AudioAttributesCompatParcelizer();
        }
        IconCompatParcelizer(withserializerIconCompatParcelizer, readVar);
        return IconCompatParcelizer(list, z, readVar);
    }

    private static boolean RemoteActionCompatParcelizer(PropertySerializerMapDouble propertySerializerMapDouble) {
        if (propertySerializerMapDouble.IconCompatParcelizer() != 1) {
            return false;
        }
        Throwable cause = ((PropertySerializerMapDouble.IconCompatParcelizer) buildTypeSerializer.IconCompatParcelizer(propertySerializerMapDouble.write())).getCause();
        return (cause instanceof ResourceBusyException) || matchesTyped.AudioAttributesCompatParcelizer(cause);
    }

    private void IconCompatParcelizer(PropertySerializerMapDouble propertySerializerMapDouble, PropertySerializerMapEmpty.read readVar) {
        propertySerializerMapDouble.read(readVar);
        if (this.onPlay != C.TIME_UNSET) {
            propertySerializerMapDouble.read(null);
        }
    }

    private void AudioAttributesCompatParcelizer() {
        Iterator it = onEmsgLeafAtomRead.RemoteActionCompatParcelizer((Collection) this.AudioAttributesImplApi21Parcelizer).iterator();
        while (it.hasNext()) {
            ((PropertySerializerMapDouble) it.next()).read(null);
        }
    }

    private void RemoteActionCompatParcelizer() {
        Iterator it = onEmsgLeafAtomRead.RemoteActionCompatParcelizer((Collection) this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver).iterator();
        while (it.hasNext()) {
            ((IconCompatParcelizer) it.next()).AudioAttributesCompatParcelizer();
        }
    }

    private withSerializer IconCompatParcelizer(List<DrmInitData.SchemeData> list, boolean z, PropertySerializerMapEmpty.read readVar) {
        withSerializer withserializer = new withSerializer(this.onPlayFromMediaId, this.AudioAttributesCompatParcelizer, this.handleMediaPlayPauseIfPendingOnHandler, this.onFastForward, list, 0, this.MediaDescriptionCompat | z, z, this.MediaBrowserCompatMediaItem, this.MediaBrowserCompatItemReceiver, this.IconCompatParcelizer, (Looper) buildTypeSerializer.IconCompatParcelizer(this.onAddQueueItem), this.MediaBrowserCompatCustomActionResultReceiver, (modifyArraySerializer) buildTypeSerializer.IconCompatParcelizer(this.onCustomAction));
        withserializer.AudioAttributesCompatParcelizer(readVar);
        if (this.onPlay != C.TIME_UNSET) {
            withserializer.AudioAttributesCompatParcelizer((PropertySerializerMapEmpty.read) null);
        }
        return withserializer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void read() {
        if (this.AudioAttributesCompatParcelizer != null && this.onCommand == 0 && this.onMediaButtonEvent.isEmpty() && this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.isEmpty()) {
            ((SimpleBeanPropertyFilter1) buildTypeSerializer.IconCompatParcelizer(this.AudioAttributesCompatParcelizer)).write();
            this.AudioAttributesCompatParcelizer = null;
        }
    }

    private void write(boolean z) {
        if (z && this.onAddQueueItem == null) {
            prune.write("DefaultDrmSessionMgr", "DefaultDrmSessionManager accessed before setPlayer(), possibly on the wrong thread.", new IllegalStateException());
            return;
        }
        if (Thread.currentThread() != ((Looper) buildTypeSerializer.IconCompatParcelizer(this.onAddQueueItem)).getThread()) {
            StringBuilder sb = new StringBuilder("DefaultDrmSessionManager accessed on the wrong thread.\nCurrent thread: ");
            sb.append(Thread.currentThread().getName());
            sb.append("\nExpected thread: ");
            sb.append(this.onAddQueueItem.getThread().getName());
            prune.write("DefaultDrmSessionMgr", sb.toString(), new IllegalStateException());
        }
    }

    private static List<DrmInitData.SchemeData> RemoteActionCompatParcelizer(DrmInitData drmInitData, UUID uuid, boolean z) {
        ArrayList arrayList = new ArrayList(drmInitData.IconCompatParcelizer);
        for (int i = 0; i < drmInitData.IconCompatParcelizer; i++) {
            DrmInitData.SchemeData schemeDataWrite = drmInitData.write(i);
            if ((schemeDataWrite.read(uuid) || (JsonMapFormatVisitor.AudioAttributesCompatParcelizer.equals(uuid) && schemeDataWrite.read(JsonMapFormatVisitor.write))) && (schemeDataWrite.read != null || z)) {
                arrayList.add(schemeDataWrite);
            }
        }
        return arrayList;
    }

    class read extends Handler {
        public read(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            byte[] bArr = (byte[]) message.obj;
            if (bArr != null) {
                for (withSerializer withserializer : findAndAddPrimarySerializer.this.onMediaButtonEvent) {
                    if (withserializer.write(bArr)) {
                        withserializer.read(message.what);
                        return;
                    }
                }
            }
        }
    }

    class AudioAttributesImplBaseParcelizer implements withSerializer.RemoteActionCompatParcelizer {
        private final Set<withSerializer> RemoteActionCompatParcelizer = new HashSet();
        private withSerializer write;

        public AudioAttributesImplBaseParcelizer() {
        }

        @Override // o.withSerializer.RemoteActionCompatParcelizer
        public final void read(withSerializer withserializer) {
            this.RemoteActionCompatParcelizer.add(withserializer);
            if (this.write != null) {
                return;
            }
            this.write = withserializer;
            withserializer.AudioAttributesImplApi26Parcelizer();
        }

        @Override // o.withSerializer.RemoteActionCompatParcelizer
        public final void read() {
            this.write = null;
            initExtraTracks initextratracksWrite = initExtraTracks.write(this.RemoteActionCompatParcelizer);
            this.RemoteActionCompatParcelizer.clear();
            Iterator it = initextratracksWrite.iterator();
            while (it.hasNext()) {
                ((withSerializer) it.next()).RemoteActionCompatParcelizer();
            }
        }

        @Override // o.withSerializer.RemoteActionCompatParcelizer
        public final void AudioAttributesCompatParcelizer(Exception exc, boolean z) {
            this.write = null;
            initExtraTracks initextratracksWrite = initExtraTracks.write(this.RemoteActionCompatParcelizer);
            this.RemoteActionCompatParcelizer.clear();
            Iterator it = initextratracksWrite.iterator();
            while (it.hasNext()) {
                ((withSerializer) it.next()).read(exc, z);
            }
        }

        public final void write(withSerializer withserializer) {
            this.RemoteActionCompatParcelizer.remove(withserializer);
            if (this.write == withserializer) {
                this.write = null;
                if (this.RemoteActionCompatParcelizer.isEmpty()) {
                    return;
                }
                withSerializer next = this.RemoteActionCompatParcelizer.iterator().next();
                this.write = next;
                next.AudioAttributesImplApi26Parcelizer();
            }
        }
    }

    class AudioAttributesImplApi26Parcelizer implements withSerializer.IconCompatParcelizer {
        private AudioAttributesImplApi26Parcelizer() {
        }

        /* synthetic */ AudioAttributesImplApi26Parcelizer(findAndAddPrimarySerializer findandaddprimaryserializer, byte b) {
            this();
        }

        @Override // o.withSerializer.IconCompatParcelizer
        public final void write(withSerializer withserializer) {
            if (findAndAddPrimarySerializer.this.onPlay != C.TIME_UNSET) {
                findAndAddPrimarySerializer.this.AudioAttributesImplApi21Parcelizer.remove(withserializer);
                ((Handler) buildTypeSerializer.IconCompatParcelizer(findAndAddPrimarySerializer.this.MediaBrowserCompatSearchResultReceiver)).removeCallbacksAndMessages(withserializer);
            }
        }

        @Override // o.withSerializer.IconCompatParcelizer
        public final void read(final withSerializer withserializer, int i) {
            if (i == 1 && findAndAddPrimarySerializer.this.onCommand > 0 && findAndAddPrimarySerializer.this.onPlay != C.TIME_UNSET) {
                findAndAddPrimarySerializer.this.AudioAttributesImplApi21Parcelizer.add(withserializer);
                ((Handler) buildTypeSerializer.IconCompatParcelizer(findAndAddPrimarySerializer.this.MediaBrowserCompatSearchResultReceiver)).postAtTime(new Runnable() { // from class: o.newWith
                    @Override // java.lang.Runnable
                    public final void run() {
                        withserializer.read((PropertySerializerMapEmpty.read) null);
                    }
                }, withserializer, SystemClock.uptimeMillis() + findAndAddPrimarySerializer.this.onPlay);
            } else if (i == 0) {
                findAndAddPrimarySerializer.this.onMediaButtonEvent.remove(withserializer);
                if (findAndAddPrimarySerializer.this.RatingCompat == withserializer) {
                    findAndAddPrimarySerializer.MediaBrowserCompatSearchResultReceiver(findAndAddPrimarySerializer.this);
                }
                if (findAndAddPrimarySerializer.this.MediaMetadataCompat == withserializer) {
                    findAndAddPrimarySerializer.RemoteActionCompatParcelizer(findAndAddPrimarySerializer.this);
                }
                findAndAddPrimarySerializer.this.handleMediaPlayPauseIfPendingOnHandler.write(withserializer);
                if (findAndAddPrimarySerializer.this.onPlay != C.TIME_UNSET) {
                    ((Handler) buildTypeSerializer.IconCompatParcelizer(findAndAddPrimarySerializer.this.MediaBrowserCompatSearchResultReceiver)).removeCallbacksAndMessages(withserializer);
                    findAndAddPrimarySerializer.this.AudioAttributesImplApi21Parcelizer.remove(withserializer);
                }
            }
            findAndAddPrimarySerializer.this.read();
        }
    }

    class RemoteActionCompatParcelizer implements SimpleBeanPropertyFilter1.RemoteActionCompatParcelizer {
        private RemoteActionCompatParcelizer() {
        }

        /* synthetic */ RemoteActionCompatParcelizer(findAndAddPrimarySerializer findandaddprimaryserializer, byte b) {
            this();
        }

        @Override // o.SimpleBeanPropertyFilter1.RemoteActionCompatParcelizer
        public final void read(byte[] bArr, int i) {
            ((read) buildTypeSerializer.IconCompatParcelizer(findAndAddPrimarySerializer.this.RemoteActionCompatParcelizer)).obtainMessage(i, bArr).sendToTarget();
        }
    }

    class IconCompatParcelizer implements matchesUntyped.AudioAttributesCompatParcelizer {
        private final PropertySerializerMapEmpty.read AudioAttributesCompatParcelizer;
        private boolean RemoteActionCompatParcelizer;
        private PropertySerializerMapDouble write;

        public IconCompatParcelizer(PropertySerializerMapEmpty.read readVar) {
            this.AudioAttributesCompatParcelizer = readVar;
        }

        public final void read(final C0170format c0170format) {
            ((Handler) buildTypeSerializer.IconCompatParcelizer(findAndAddPrimarySerializer.this.MediaBrowserCompatSearchResultReceiver)).post(new Runnable() { // from class: o.emptyForProperties
                @Override // java.lang.Runnable
                public final void run() {
                    this.RemoteActionCompatParcelizer.IconCompatParcelizer(c0170format);
                }
            });
        }

        final /* synthetic */ void IconCompatParcelizer(C0170format c0170format) {
            if (findAndAddPrimarySerializer.this.onCommand == 0 || this.RemoteActionCompatParcelizer) {
                return;
            }
            findAndAddPrimarySerializer findandaddprimaryserializer = findAndAddPrimarySerializer.this;
            this.write = findAndAddPrimarySerializer.write(findandaddprimaryserializer, (Looper) buildTypeSerializer.IconCompatParcelizer(findandaddprimaryserializer.onAddQueueItem), this.AudioAttributesCompatParcelizer, c0170format);
            findAndAddPrimarySerializer.this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.add(this);
        }

        @Override // o.matchesUntyped.AudioAttributesCompatParcelizer
        public final void AudioAttributesCompatParcelizer() {
            LaissezFaireSubTypeValidator.read((Handler) buildTypeSerializer.IconCompatParcelizer(findAndAddPrimarySerializer.this.MediaBrowserCompatSearchResultReceiver), new Runnable() { // from class: o.serializerFor
                @Override // java.lang.Runnable
                public final void run() {
                    this.read.read();
                }
            });
        }

        final /* synthetic */ void read() {
            if (this.RemoteActionCompatParcelizer) {
                return;
            }
            PropertySerializerMapDouble propertySerializerMapDouble = this.write;
            if (propertySerializerMapDouble != null) {
                propertySerializerMapDouble.read(this.AudioAttributesCompatParcelizer);
            }
            findAndAddPrimarySerializer.this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.remove(this);
            this.RemoteActionCompatParcelizer = true;
        }
    }
}
