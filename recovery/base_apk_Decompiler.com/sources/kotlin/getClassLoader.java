package kotlin;

import android.content.Context;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.util.MimeTypes;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import kotlin.ArrayBuilders;
import kotlin.ArrayBuilders1;
import kotlin.C0170format;
import kotlin.collectAndResolveSubtypesByClass;
import kotlin.deserializeIfNatural;
import kotlin.getClassLoader;
import kotlin.getDefaultSchemaNode;
import kotlin.validateSubType;

/* JADX INFO: loaded from: classes2.dex */
public final class getClassLoader implements ArrayBuildersFloatBuilder, deserializeIfNatural.AudioAttributesCompatParcelizer {
    private static final Executor IconCompatParcelizer = new Executor() { // from class: o.uncheckedSimpleType
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            getClassLoader.read();
        }
    };
    private Pair<Surface, AsWrapperTypeSerializer> AudioAttributesCompatParcelizer;
    private int AudioAttributesImplApi21Parcelizer;
    private C0170format AudioAttributesImplApi26Parcelizer;
    private final validateSubType.read AudioAttributesImplBaseParcelizer;
    private final CopyOnWriteArraySet<IconCompatParcelizer> MediaBrowserCompatCustomActionResultReceiver;
    private _usesExternalId MediaBrowserCompatItemReceiver;
    private validateSubType MediaBrowserCompatMediaItem;
    private getRemainingInput MediaBrowserCompatSearchResultReceiver;
    private final MediaBrowserCompatCustomActionResultReceiver MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    private final ArrayBuilders MediaDescriptionCompat;
    private int MediaMetadataCompat;
    private final getArrayComparator RatingCompat;
    private final buildTypeDeserializer RemoteActionCompatParcelizer;
    private long read;
    private final Context write;

    public interface IconCompatParcelizer {
        void IconCompatParcelizer();

        void IconCompatParcelizer(deserializeTypedFromObject deserializetypedfromobject);

        void read();
    }

    static /* synthetic */ void read() {
    }

    /* synthetic */ getClassLoader(read readVar, byte b) {
        this(readVar);
    }

    public static final class read {
        private collectAndResolveSubtypesByClass.RemoteActionCompatParcelizer AudioAttributesCompatParcelizer;
        private final getArrayComparator AudioAttributesImplApi21Parcelizer;
        private validateSubType.read IconCompatParcelizer;
        private boolean RemoteActionCompatParcelizer;
        private final Context read;
        private buildTypeDeserializer write = buildTypeDeserializer.write;

        public read(Context context, getArrayComparator getarraycomparator) {
            this.read = context.getApplicationContext();
            this.AudioAttributesImplApi21Parcelizer = getarraycomparator;
        }

        public final read AudioAttributesCompatParcelizer(buildTypeDeserializer buildtypedeserializer) {
            this.write = buildtypedeserializer;
            return this;
        }

        public final getClassLoader read() {
            buildTypeSerializer.write(!this.RemoteActionCompatParcelizer);
            byte b = 0;
            if (this.IconCompatParcelizer == null) {
                if (this.AudioAttributesCompatParcelizer == null) {
                    this.AudioAttributesCompatParcelizer = new RemoteActionCompatParcelizer(b);
                }
                this.IconCompatParcelizer = new AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer);
            }
            getClassLoader getclassloader = new getClassLoader(this, b);
            this.RemoteActionCompatParcelizer = true;
            return getclassloader;
        }
    }

    private getClassLoader(read readVar) {
        Context context = readVar.read;
        this.write = context;
        MediaBrowserCompatCustomActionResultReceiver mediaBrowserCompatCustomActionResultReceiver = new MediaBrowserCompatCustomActionResultReceiver(context);
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = mediaBrowserCompatCustomActionResultReceiver;
        buildTypeDeserializer buildtypedeserializer = readVar.write;
        this.RemoteActionCompatParcelizer = buildtypedeserializer;
        getArrayComparator getarraycomparator = readVar.AudioAttributesImplApi21Parcelizer;
        this.RatingCompat = getarraycomparator;
        getarraycomparator.RemoteActionCompatParcelizer(buildtypedeserializer);
        this.MediaDescriptionCompat = new ArrayBuilders(new write(this, (byte) 0), getarraycomparator);
        this.AudioAttributesImplBaseParcelizer = (validateSubType.read) buildTypeSerializer.AudioAttributesCompatParcelizer(readVar.IconCompatParcelizer);
        this.MediaBrowserCompatCustomActionResultReceiver = new CopyOnWriteArraySet<>();
        this.MediaMetadataCompat = 0;
        AudioAttributesCompatParcelizer(mediaBrowserCompatCustomActionResultReceiver);
    }

    private void AudioAttributesCompatParcelizer(IconCompatParcelizer iconCompatParcelizer) {
        this.MediaBrowserCompatCustomActionResultReceiver.add(iconCompatParcelizer);
    }

    @Override // kotlin.ArrayBuildersFloatBuilder
    public final ArrayBuilders1 write() {
        return this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    }

    public final void RemoteActionCompatParcelizer(Surface surface, AsWrapperTypeSerializer asWrapperTypeSerializer) {
        Pair<Surface, AsWrapperTypeSerializer> pair = this.AudioAttributesCompatParcelizer;
        if (pair != null && ((Surface) pair.first).equals(surface) && ((AsWrapperTypeSerializer) this.AudioAttributesCompatParcelizer.second).equals(asWrapperTypeSerializer)) {
            return;
        }
        this.AudioAttributesCompatParcelizer = Pair.create(surface, asWrapperTypeSerializer);
        write(surface, asWrapperTypeSerializer.RemoteActionCompatParcelizer(), asWrapperTypeSerializer.IconCompatParcelizer());
    }

    public final void RemoteActionCompatParcelizer() {
        write(null, AsWrapperTypeSerializer.read.RemoteActionCompatParcelizer(), AsWrapperTypeSerializer.read.IconCompatParcelizer());
        this.AudioAttributesCompatParcelizer = null;
    }

    public final void IconCompatParcelizer() {
        if (this.MediaMetadataCompat == 2) {
            return;
        }
        _usesExternalId _usesexternalid = this.MediaBrowserCompatItemReceiver;
        if (_usesexternalid != null) {
            _usesexternalid.read();
        }
        this.AudioAttributesCompatParcelizer = null;
        this.MediaMetadataCompat = 2;
    }

    public final void AudioAttributesCompatParcelizer(long j, long j2) throws addNull {
        if (this.AudioAttributesImplApi21Parcelizer == 0) {
            this.MediaDescriptionCompat.AudioAttributesCompatParcelizer(j, j2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public collectAndResolveSubtypesByClass IconCompatParcelizer(C0170format c0170format) throws ArrayBuilders1.read {
        buildTypeSerializer.write(this.MediaMetadataCompat == 0);
        keyFormat keyformatWrite = read(c0170format.AudioAttributesImplBaseParcelizer);
        if (keyformatWrite.AudioAttributesCompatParcelizer == 7 && LaissezFaireSubTypeValidator.MediaBrowserCompatCustomActionResultReceiver < 34) {
            keyformatWrite = keyformatWrite.write().RemoteActionCompatParcelizer(6).write();
        }
        keyFormat keyformat = keyformatWrite;
        this.MediaBrowserCompatItemReceiver = this.RemoteActionCompatParcelizer.read((Looper) buildTypeSerializer.AudioAttributesCompatParcelizer(Looper.myLooper()), null);
        try {
            validateSubType.read readVar = this.AudioAttributesImplBaseParcelizer;
            Context context = this.write;
            numberType numbertype = numberType.write;
            final _usesExternalId _usesexternalid = this.MediaBrowserCompatItemReceiver;
            Objects.requireNonNull(_usesexternalid);
            this.MediaBrowserCompatMediaItem = readVar.read(context, keyformat, numbertype, this, new Executor() { // from class: o.constructParametricType
                @Override // java.util.concurrent.Executor
                public final void execute(Runnable runnable) {
                    _usesexternalid.IconCompatParcelizer(runnable);
                }
            }, initExtraTracks.AudioAttributesImplApi26Parcelizer(), 0L);
            Pair<Surface, AsWrapperTypeSerializer> pair = this.AudioAttributesCompatParcelizer;
            if (pair != null) {
                Surface surface = (Surface) pair.first;
                AsWrapperTypeSerializer asWrapperTypeSerializer = (AsWrapperTypeSerializer) this.AudioAttributesCompatParcelizer.second;
                write(surface, asWrapperTypeSerializer.RemoteActionCompatParcelizer(), asWrapperTypeSerializer.IconCompatParcelizer());
            }
            validateSubType validatesubtype = this.MediaBrowserCompatMediaItem;
            this.MediaMetadataCompat = 1;
            return validatesubtype.IconCompatParcelizer();
        } catch (collectAndResolveSubtypes e) {
            throw new ArrayBuilders1.read(e, c0170format);
        }
    }

    private boolean AudioAttributesImplApi26Parcelizer() {
        return this.MediaMetadataCompat == 1;
    }

    private void write(Surface surface, int i, int i2) {
        if (this.MediaBrowserCompatMediaItem != null) {
            if (surface != null) {
                new PolymorphicTypeValidatorBase(surface, i, i2);
            }
            this.RatingCompat.AudioAttributesCompatParcelizer(surface);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean AudioAttributesImplBaseParcelizer() {
        return this.AudioAttributesImplApi21Parcelizer == 0 && this.MediaDescriptionCompat.IconCompatParcelizer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean AudioAttributesCompatParcelizer(long j) {
        return this.AudioAttributesImplApi21Parcelizer == 0 && this.MediaDescriptionCompat.AudioAttributesCompatParcelizer(j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void MediaBrowserCompatItemReceiver() {
        if (AudioAttributesImplApi26Parcelizer()) {
            this.AudioAttributesImplApi21Parcelizer++;
            this.MediaDescriptionCompat.AudioAttributesCompatParcelizer();
            ((_usesExternalId) buildTypeSerializer.AudioAttributesCompatParcelizer(this.MediaBrowserCompatItemReceiver)).IconCompatParcelizer(new Runnable() { // from class: o.modifyType
                @Override // java.lang.Runnable
                public final void run() {
                    this.write.AudioAttributesImplApi21Parcelizer();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void AudioAttributesImplApi21Parcelizer() {
        int i = this.AudioAttributesImplApi21Parcelizer - 1;
        this.AudioAttributesImplApi21Parcelizer = i;
        if (i > 0) {
            return;
        }
        if (i < 0) {
            throw new IllegalStateException(String.valueOf(this.AudioAttributesImplApi21Parcelizer));
        }
        this.MediaDescriptionCompat.AudioAttributesCompatParcelizer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void write(getRemainingInput getremaininginput) {
        this.MediaBrowserCompatSearchResultReceiver = getremaininginput;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void write(float f) {
        this.MediaDescriptionCompat.AudioAttributesCompatParcelizer(f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void AudioAttributesCompatParcelizer(long j, long j2, long j3) {
        this.read = j;
        this.MediaDescriptionCompat.RemoteActionCompatParcelizer(j2, j3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static keyFormat read(keyFormat keyformat) {
        return (keyformat == null || !keyformat.read()) ? keyFormat.IconCompatParcelizer : keyformat;
    }

    final class MediaBrowserCompatCustomActionResultReceiver implements ArrayBuilders1, IconCompatParcelizer {
        private long AudioAttributesCompatParcelizer;
        private C0170format AudioAttributesImplApi26Parcelizer;
        private long AudioAttributesImplBaseParcelizer;
        private boolean IconCompatParcelizer;
        private int MediaBrowserCompatItemReceiver;
        private JsonValueFormat MediaDescriptionCompat;
        private long MediaMetadataCompat;
        private boolean RatingCompat;
        private final int onAddQueueItem;
        private collectAndResolveSubtypesByClass onCustomAction;
        private final Context read;
        private final ArrayList<JsonValueFormat> MediaBrowserCompatMediaItem = new ArrayList<>();
        private long write = C.TIME_UNSET;
        private long AudioAttributesImplApi21Parcelizer = C.TIME_UNSET;
        private ArrayBuilders1.IconCompatParcelizer MediaBrowserCompatCustomActionResultReceiver = ArrayBuilders1.IconCompatParcelizer.write;
        private Executor MediaBrowserCompatSearchResultReceiver = getClassLoader.IconCompatParcelizer;

        public MediaBrowserCompatCustomActionResultReceiver(Context context) {
            this.read = context;
            this.onAddQueueItem = LaissezFaireSubTypeValidator.IconCompatParcelizer(context);
        }

        @Override // kotlin.ArrayBuilders1
        public final void AudioAttributesCompatParcelizer(boolean z) {
            getClassLoader.this.RatingCompat.AudioAttributesCompatParcelizer(z);
        }

        @Override // kotlin.ArrayBuilders1
        public final void AudioAttributesImplApi26Parcelizer() {
            getClassLoader.this.RatingCompat.RemoteActionCompatParcelizer();
        }

        @Override // kotlin.ArrayBuilders1
        public final void MediaDescriptionCompat() {
            getClassLoader.this.RatingCompat.AudioAttributesCompatParcelizer();
        }

        @Override // kotlin.ArrayBuilders1
        public final void RatingCompat() {
            getClassLoader.this.RatingCompat.AudioAttributesImplApi26Parcelizer();
        }

        @Override // kotlin.ArrayBuilders1
        public final void write(ArrayBuilders1.IconCompatParcelizer iconCompatParcelizer, Executor executor) {
            this.MediaBrowserCompatCustomActionResultReceiver = iconCompatParcelizer;
            this.MediaBrowserCompatSearchResultReceiver = executor;
        }

        @Override // kotlin.ArrayBuilders1
        public final void AudioAttributesCompatParcelizer(C0170format c0170format) throws ArrayBuilders1.read {
            buildTypeSerializer.write(!AudioAttributesImplApi21Parcelizer());
            this.onCustomAction = getClassLoader.this.IconCompatParcelizer(c0170format);
        }

        @Override // kotlin.ArrayBuilders1
        public final boolean AudioAttributesImplApi21Parcelizer() {
            return this.onCustomAction != null;
        }

        @Override // kotlin.ArrayBuilders1
        public final void RemoteActionCompatParcelizer(boolean z) {
            AudioAttributesImplApi21Parcelizer();
            this.IconCompatParcelizer = false;
            this.write = C.TIME_UNSET;
            this.AudioAttributesImplApi21Parcelizer = C.TIME_UNSET;
            getClassLoader.this.MediaBrowserCompatItemReceiver();
            if (z) {
                getClassLoader.this.RatingCompat.MediaBrowserCompatItemReceiver();
            }
        }

        @Override // kotlin.ArrayBuilders1
        public final boolean MediaBrowserCompatItemReceiver() {
            return AudioAttributesImplApi21Parcelizer() && getClassLoader.this.AudioAttributesImplBaseParcelizer();
        }

        @Override // kotlin.ArrayBuilders1
        public final boolean AudioAttributesImplBaseParcelizer() {
            if (!AudioAttributesImplApi21Parcelizer()) {
                return false;
            }
            long j = this.write;
            return j != C.TIME_UNSET && getClassLoader.this.AudioAttributesCompatParcelizer(j);
        }

        @Override // kotlin.ArrayBuilders1
        public final void IconCompatParcelizer(C0170format c0170format) {
            C0170format c0170format2;
            buildTypeSerializer.write(AudioAttributesImplApi21Parcelizer());
            getClassLoader.this.RatingCompat.RemoteActionCompatParcelizer(c0170format.RatingCompat);
            if (LaissezFaireSubTypeValidator.MediaBrowserCompatCustomActionResultReceiver < 21 && c0170format.onPlayFromSearch != -1 && c0170format.onPlayFromSearch != 0) {
                if (this.MediaDescriptionCompat == null || (c0170format2 = this.AudioAttributesImplApi26Parcelizer) == null || c0170format2.onPlayFromSearch != c0170format.onPlayFromSearch) {
                    this.MediaDescriptionCompat = MediaBrowserCompatItemReceiver.write(c0170format.onPlayFromSearch);
                }
            } else {
                this.MediaDescriptionCompat = null;
            }
            this.MediaBrowserCompatItemReceiver = 1;
            this.AudioAttributesImplApi26Parcelizer = c0170format;
            if (!this.IconCompatParcelizer) {
                MediaMetadataCompat();
                this.IconCompatParcelizer = true;
                this.MediaMetadataCompat = C.TIME_UNSET;
            } else {
                buildTypeSerializer.write(this.AudioAttributesImplApi21Parcelizer != C.TIME_UNSET);
                this.MediaMetadataCompat = this.AudioAttributesImplApi21Parcelizer;
            }
        }

        @Override // kotlin.ArrayBuilders1
        public final boolean MediaBrowserCompatCustomActionResultReceiver() {
            return LaissezFaireSubTypeValidator.MediaBrowserCompatCustomActionResultReceiver(this.read);
        }

        @Override // kotlin.ArrayBuilders1
        public final Surface write() {
            buildTypeSerializer.write(AudioAttributesImplApi21Parcelizer());
            return ((collectAndResolveSubtypesByClass) buildTypeSerializer.AudioAttributesCompatParcelizer(this.onCustomAction)).RemoteActionCompatParcelizer();
        }

        @Override // kotlin.ArrayBuilders1
        public final void read(getRemainingInput getremaininginput) {
            getClassLoader.this.write(getremaininginput);
        }

        @Override // kotlin.ArrayBuilders1
        public final void RemoteActionCompatParcelizer(float f) {
            getClassLoader.this.write(f);
        }

        @Override // kotlin.ArrayBuilders1
        public final void AudioAttributesCompatParcelizer(List<JsonValueFormat> list) {
            if (this.MediaBrowserCompatMediaItem.equals(list)) {
                return;
            }
            IconCompatParcelizer(list);
            MediaMetadataCompat();
        }

        private void IconCompatParcelizer(List<JsonValueFormat> list) {
            this.MediaBrowserCompatMediaItem.clear();
            this.MediaBrowserCompatMediaItem.addAll(list);
        }

        @Override // kotlin.ArrayBuilders1
        public final void RemoteActionCompatParcelizer(long j, long j2) {
            this.RatingCompat |= (this.AudioAttributesImplBaseParcelizer == j && this.AudioAttributesCompatParcelizer == 0) ? false : true;
            this.AudioAttributesImplBaseParcelizer = j;
            this.AudioAttributesCompatParcelizer = 0L;
        }

        @Override // kotlin.ArrayBuilders1
        public final void read(Surface surface, AsWrapperTypeSerializer asWrapperTypeSerializer) {
            getClassLoader.this.RemoteActionCompatParcelizer(surface, asWrapperTypeSerializer);
        }

        @Override // kotlin.ArrayBuilders1
        public final void RemoteActionCompatParcelizer() {
            getClassLoader.this.RemoteActionCompatParcelizer();
        }

        @Override // kotlin.ArrayBuilders1
        public final void AudioAttributesCompatParcelizer() {
            getClassLoader.this.RatingCompat.write();
        }

        @Override // kotlin.ArrayBuilders1
        public final long RemoteActionCompatParcelizer(long j, boolean z) {
            buildTypeSerializer.write(AudioAttributesImplApi21Parcelizer());
            buildTypeSerializer.write(this.onAddQueueItem != -1);
            long j2 = this.MediaMetadataCompat;
            if (j2 != C.TIME_UNSET) {
                if (!getClassLoader.this.AudioAttributesCompatParcelizer(j2)) {
                    return C.TIME_UNSET;
                }
                MediaMetadataCompat();
                this.MediaMetadataCompat = C.TIME_UNSET;
            }
            if (((collectAndResolveSubtypesByClass) buildTypeSerializer.AudioAttributesCompatParcelizer(this.onCustomAction)).IconCompatParcelizer() >= this.onAddQueueItem || !((collectAndResolveSubtypesByClass) buildTypeSerializer.AudioAttributesCompatParcelizer(this.onCustomAction)).write()) {
                return C.TIME_UNSET;
            }
            long j3 = j - this.AudioAttributesCompatParcelizer;
            AudioAttributesCompatParcelizer(j3);
            this.AudioAttributesImplApi21Parcelizer = j3;
            if (z) {
                this.write = j3;
            }
            return j * 1000;
        }

        @Override // kotlin.ArrayBuilders1
        public final void write(long j, long j2) throws ArrayBuilders1.read {
            try {
                getClassLoader.this.AudioAttributesCompatParcelizer(j, j2);
            } catch (addNull e) {
                C0170format c0170formatIconCompatParcelizer = this.AudioAttributesImplApi26Parcelizer;
                if (c0170formatIconCompatParcelizer == null) {
                    c0170formatIconCompatParcelizer = new C0170format.RemoteActionCompatParcelizer().IconCompatParcelizer();
                }
                throw new ArrayBuilders1.read(e, c0170formatIconCompatParcelizer);
            }
        }

        @Override // kotlin.ArrayBuilders1
        public final void MediaBrowserCompatMediaItem() {
            getClassLoader.this.IconCompatParcelizer();
        }

        private void AudioAttributesCompatParcelizer(long j) {
            if (this.RatingCompat) {
                getClassLoader.this.AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer, j, this.AudioAttributesImplBaseParcelizer);
                this.RatingCompat = false;
            }
        }

        private void MediaMetadataCompat() {
            if (this.AudioAttributesImplApi26Parcelizer == null) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            JsonValueFormat jsonValueFormat = this.MediaDescriptionCompat;
            if (jsonValueFormat != null) {
                arrayList.add(jsonValueFormat);
            }
            arrayList.addAll(this.MediaBrowserCompatMediaItem);
            C0170format c0170format = (C0170format) buildTypeSerializer.IconCompatParcelizer(this.AudioAttributesImplApi26Parcelizer);
            new getDefaultSchemaNode.IconCompatParcelizer(getClassLoader.read(c0170format.AudioAttributesImplBaseParcelizer), c0170format.onSetCaptioningEnabled, c0170format.MediaMetadataCompat).AudioAttributesCompatParcelizer(c0170format.onPrepareFromSearch).IconCompatParcelizer();
            this.write = C.TIME_UNSET;
        }

        @Override // o.getClassLoader.IconCompatParcelizer
        public final void read() {
            final ArrayBuilders1.IconCompatParcelizer iconCompatParcelizer = this.MediaBrowserCompatCustomActionResultReceiver;
            this.MediaBrowserCompatSearchResultReceiver.execute(new Runnable() { // from class: o._problem
                @Override // java.lang.Runnable
                public final void run() {
                    iconCompatParcelizer.RemoteActionCompatParcelizer();
                }
            });
        }

        @Override // o.getClassLoader.IconCompatParcelizer
        public final void IconCompatParcelizer() {
            final ArrayBuilders1.IconCompatParcelizer iconCompatParcelizer = this.MediaBrowserCompatCustomActionResultReceiver;
            this.MediaBrowserCompatSearchResultReceiver.execute(new Runnable() { // from class: o.parseType
                @Override // java.lang.Runnable
                public final void run() {
                    this.IconCompatParcelizer.AudioAttributesCompatParcelizer(iconCompatParcelizer);
                }
            });
        }

        final /* synthetic */ void AudioAttributesCompatParcelizer(ArrayBuilders1.IconCompatParcelizer iconCompatParcelizer) {
            iconCompatParcelizer.AudioAttributesCompatParcelizer();
        }

        @Override // o.getClassLoader.IconCompatParcelizer
        public final void IconCompatParcelizer(final deserializeTypedFromObject deserializetypedfromobject) {
            final ArrayBuilders1.IconCompatParcelizer iconCompatParcelizer = this.MediaBrowserCompatCustomActionResultReceiver;
            this.MediaBrowserCompatSearchResultReceiver.execute(new Runnable() { // from class: o.TypeModifier
                @Override // java.lang.Runnable
                public final void run() {
                }
            });
        }
    }

    final class write implements ArrayBuilders.RemoteActionCompatParcelizer {
        private write() {
        }

        /* synthetic */ write(getClassLoader getclassloader, byte b) {
            this();
        }

        @Override // o.ArrayBuilders.RemoteActionCompatParcelizer
        public final void IconCompatParcelizer(deserializeTypedFromObject deserializetypedfromobject) {
            getClassLoader.this.AudioAttributesImplApi26Parcelizer = new C0170format.RemoteActionCompatParcelizer().onFastForward(deserializetypedfromobject.write).MediaBrowserCompatItemReceiver(deserializetypedfromobject.AudioAttributesCompatParcelizer).AudioAttributesImplApi26Parcelizer(MimeTypes.VIDEO_RAW).IconCompatParcelizer();
            Iterator it = getClassLoader.this.MediaBrowserCompatCustomActionResultReceiver.iterator();
            while (it.hasNext()) {
                ((IconCompatParcelizer) it.next()).IconCompatParcelizer(deserializetypedfromobject);
            }
        }

        @Override // o.ArrayBuilders.RemoteActionCompatParcelizer
        public final void read(long j, boolean z) {
            if (z && getClassLoader.this.AudioAttributesCompatParcelizer != null) {
                Iterator it = getClassLoader.this.MediaBrowserCompatCustomActionResultReceiver.iterator();
                while (it.hasNext()) {
                    ((IconCompatParcelizer) it.next()).read();
                }
            }
            if (getClassLoader.this.MediaBrowserCompatSearchResultReceiver != null) {
                getClassLoader.this.MediaBrowserCompatSearchResultReceiver.RemoteActionCompatParcelizer(j, getClassLoader.this.RemoteActionCompatParcelizer.read(), getClassLoader.this.AudioAttributesImplApi26Parcelizer == null ? new C0170format.RemoteActionCompatParcelizer().IconCompatParcelizer() : getClassLoader.this.AudioAttributesImplApi26Parcelizer, null);
            }
        }

        @Override // o.ArrayBuilders.RemoteActionCompatParcelizer
        public final void write() {
            Iterator it = getClassLoader.this.MediaBrowserCompatCustomActionResultReceiver.iterator();
            while (it.hasNext()) {
                ((IconCompatParcelizer) it.next()).IconCompatParcelizer();
            }
        }
    }

    static final class AudioAttributesCompatParcelizer implements validateSubType.read {
        private final collectAndResolveSubtypesByClass.RemoteActionCompatParcelizer IconCompatParcelizer;

        public AudioAttributesCompatParcelizer(collectAndResolveSubtypesByClass.RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
            this.IconCompatParcelizer = remoteActionCompatParcelizer;
        }

        @Override // o.validateSubType.read
        public final validateSubType read(Context context, keyFormat keyformat, numberType numbertype, deserializeIfNatural.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer, Executor executor, List<JsonValueFormat> list, long j) throws collectAndResolveSubtypes {
            try {
                return ((validateSubType.read) Class.forName("androidx.media3.effect.PreviewingSingleInputVideoGraph$Factory").getConstructor(collectAndResolveSubtypesByClass.RemoteActionCompatParcelizer.class).newInstance(this.IconCompatParcelizer)).read(context, keyformat, numbertype, audioAttributesCompatParcelizer, executor, list, j);
            } catch (Exception e) {
                throw collectAndResolveSubtypes.RemoteActionCompatParcelizer(e);
            }
        }
    }

    static final class RemoteActionCompatParcelizer implements collectAndResolveSubtypesByClass.RemoteActionCompatParcelizer {
        private RemoteActionCompatParcelizer() {
        }

        /* synthetic */ RemoteActionCompatParcelizer(byte b) {
            this();
        }

        static {
            AtomParsersChunkIterator.read(new parseUdtaMeta() { // from class: o.TypeParser
                @Override // kotlin.parseUdtaMeta
                public final Object get() {
                    return getClassLoader.RemoteActionCompatParcelizer.IconCompatParcelizer();
                }
            });
        }

        static /* synthetic */ collectAndResolveSubtypesByClass.RemoteActionCompatParcelizer IconCompatParcelizer() {
            try {
                Class<?> cls = Class.forName("androidx.media3.effect.DefaultVideoFrameProcessor$Factory$Builder");
                return (collectAndResolveSubtypesByClass.RemoteActionCompatParcelizer) buildTypeSerializer.IconCompatParcelizer(cls.getMethod("build", new Class[0]).invoke(cls.getConstructor(new Class[0]).newInstance(new Object[0]), new Object[0]));
            } catch (Exception e) {
                throw new IllegalStateException(e);
            }
        }
    }

    static final class MediaBrowserCompatItemReceiver {
        private static Method AudioAttributesCompatParcelizer;
        private static Method IconCompatParcelizer;
        private static Constructor<?> RemoteActionCompatParcelizer;

        public static JsonValueFormat write(float f) {
            try {
                RemoteActionCompatParcelizer();
                Object objNewInstance = RemoteActionCompatParcelizer.newInstance(new Object[0]);
                IconCompatParcelizer.invoke(objNewInstance, Float.valueOf(f));
                return (JsonValueFormat) buildTypeSerializer.IconCompatParcelizer(AudioAttributesCompatParcelizer.invoke(objNewInstance, new Object[0]));
            } catch (Exception e) {
                throw new IllegalStateException(e);
            }
        }

        private static void RemoteActionCompatParcelizer() throws NoSuchMethodException, ClassNotFoundException {
            if (RemoteActionCompatParcelizer == null || IconCompatParcelizer == null || AudioAttributesCompatParcelizer == null) {
                Class<?> cls = Class.forName("androidx.media3.effect.ScaleAndRotateTransformation$Builder");
                RemoteActionCompatParcelizer = cls.getConstructor(new Class[0]);
                IconCompatParcelizer = cls.getMethod("setRotationDegrees", Float.TYPE);
                AudioAttributesCompatParcelizer = cls.getMethod("build", new Class[0]);
            }
        }
    }
}
