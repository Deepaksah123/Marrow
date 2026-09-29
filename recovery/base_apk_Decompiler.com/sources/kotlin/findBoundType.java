package kotlin;

import android.content.Context;
import android.graphics.Point;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.Spatializer;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.util.MimeTypes;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import java.util.concurrent.Executor;
import kotlin.SubtypeResolver;
import kotlin._verifyAndResolvePlaceholders;
import kotlin.buildIterableSerializer;
import kotlin.createIfNeeded;
import kotlin.findBoundType;
import kotlin.initExtraTracks;
import kotlin.unknownType;

/* JADX INFO: loaded from: classes2.dex */
public final class findBoundType extends unknownType implements buildIterableSerializer.write {
    private static final parseTruns<Integer> read = parseTruns.IconCompatParcelizer(new Comparator() { // from class: o.getBoundType
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return findBoundType.write((Integer) obj, (Integer) obj2);
        }
    });
    private final Object AudioAttributesCompatParcelizer;
    private write AudioAttributesImplApi26Parcelizer;
    private final _verifyAndResolvePlaceholders.AudioAttributesCompatParcelizer AudioAttributesImplBaseParcelizer;
    private final boolean IconCompatParcelizer;
    private AudioAttributesImplBaseParcelizer MediaBrowserCompatItemReceiver;
    public final Context RemoteActionCompatParcelizer;
    private JsonIntegerFormatVisitor write;

    @Override // kotlin._constructSimple
    public final buildIterableSerializer.write RemoteActionCompatParcelizer() {
        return this;
    }

    @Override // kotlin._constructSimple
    public final boolean write() {
        return true;
    }

    public static final class write extends SubtypeResolver {
        public static final write onPrepareFromMediaId = new C0086write().read();
        private final SparseBooleanArray MediaSessionCompatToken;
        private final SparseArray<Map<_writeAsBinary, AudioAttributesCompatParcelizer>> ParcelableVolumeInfo;
        public final boolean onPrepareFromUri;
        public final boolean onRemoveQueueItem;
        public final boolean onRemoveQueueItemAt;
        public final boolean onRewind;
        public final boolean onSeekTo;
        public final boolean onSetCaptioningEnabled;
        public final boolean onSetPlaybackSpeed;
        public final boolean onSetRating;
        public final boolean onSetRepeatMode;
        public final boolean onSetShuffleMode;
        public final boolean onSkipToNext;
        public final boolean onSkipToPrevious;
        public final boolean onSkipToQueueItem;
        public final boolean onStop;
        public final boolean setSessionImpl;

        /* synthetic */ write(C0086write c0086write, byte b) {
            this(c0086write);
        }

        /* JADX INFO: renamed from: o.findBoundType$write$write, reason: collision with other inner class name */
        public static final class C0086write extends SubtypeResolver.AudioAttributesCompatParcelizer {
            private boolean AudioAttributesCompatParcelizer;
            private boolean AudioAttributesImplApi21Parcelizer;
            private boolean AudioAttributesImplApi26Parcelizer;
            private boolean AudioAttributesImplBaseParcelizer;
            private boolean IconCompatParcelizer;
            private boolean MediaBrowserCompatCustomActionResultReceiver;
            private boolean MediaBrowserCompatItemReceiver;
            private boolean MediaBrowserCompatMediaItem;
            private boolean MediaBrowserCompatSearchResultReceiver;
            private boolean MediaDescriptionCompat;
            private final SparseBooleanArray MediaMetadataCompat;
            private boolean RatingCompat;
            private boolean RemoteActionCompatParcelizer;
            private boolean onCommand;
            private final SparseArray<Map<_writeAsBinary, AudioAttributesCompatParcelizer>> onCustomAction;
            private boolean read;
            private boolean write;

            /* synthetic */ C0086write(write writeVar, byte b) {
                this(writeVar);
            }

            @Deprecated
            public C0086write() {
                this.onCustomAction = new SparseArray<>();
                this.MediaMetadataCompat = new SparseBooleanArray();
                IconCompatParcelizer();
            }

            public C0086write(Context context) {
                super(context);
                this.onCustomAction = new SparseArray<>();
                this.MediaMetadataCompat = new SparseBooleanArray();
                IconCompatParcelizer();
            }

            private C0086write(write writeVar) {
                super(writeVar);
                this.MediaBrowserCompatSearchResultReceiver = writeVar.setSessionImpl;
                this.AudioAttributesImplBaseParcelizer = writeVar.onSetPlaybackSpeed;
                this.MediaBrowserCompatItemReceiver = writeVar.onSetRepeatMode;
                this.AudioAttributesImplApi21Parcelizer = writeVar.onSetShuffleMode;
                this.RatingCompat = writeVar.onSkipToQueueItem;
                this.write = writeVar.onSeekTo;
                this.read = writeVar.onPrepareFromUri;
                this.IconCompatParcelizer = writeVar.onRemoveQueueItemAt;
                this.AudioAttributesCompatParcelizer = writeVar.onRemoveQueueItem;
                this.RemoteActionCompatParcelizer = writeVar.onRewind;
                this.MediaBrowserCompatMediaItem = writeVar.onStop;
                this.MediaDescriptionCompat = writeVar.onSkipToPrevious;
                this.onCommand = writeVar.onSkipToNext;
                this.AudioAttributesImplApi26Parcelizer = writeVar.onSetCaptioningEnabled;
                this.MediaBrowserCompatCustomActionResultReceiver = writeVar.onSetRating;
                this.onCustomAction = write((SparseArray<Map<_writeAsBinary, AudioAttributesCompatParcelizer>>) writeVar.ParcelableVolumeInfo);
                this.MediaMetadataCompat = writeVar.MediaSessionCompatToken.clone();
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // o.SubtypeResolver.AudioAttributesCompatParcelizer
            /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
            public final C0086write read(SubtypeResolver subtypeResolver) {
                super.read(subtypeResolver);
                return this;
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // o.SubtypeResolver.AudioAttributesCompatParcelizer
            /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
            public C0086write read(Context context, boolean z) {
                super.read(context, z);
                return this;
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // o.SubtypeResolver.AudioAttributesCompatParcelizer
            /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
            public C0086write read(int i, int i2, boolean z) {
                super.read(i, i2, z);
                return this;
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // o.SubtypeResolver.AudioAttributesCompatParcelizer
            /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
            public C0086write write(Context context) {
                super.write(context);
                return this;
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // o.SubtypeResolver.AudioAttributesCompatParcelizer
            /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
            public C0086write AudioAttributesCompatParcelizer(int i) {
                super.AudioAttributesCompatParcelizer(i);
                return this;
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // o.SubtypeResolver.AudioAttributesCompatParcelizer
            /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
            public C0086write write(TypeDeserializer typeDeserializer) {
                super.write(typeDeserializer);
                return this;
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // o.SubtypeResolver.AudioAttributesCompatParcelizer
            /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
            public C0086write write(int i) {
                super.write(i);
                return this;
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // o.SubtypeResolver.AudioAttributesCompatParcelizer
            /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
            public C0086write AudioAttributesCompatParcelizer(int i, boolean z) {
                super.AudioAttributesCompatParcelizer(i, z);
                return this;
            }

            @Override // o.SubtypeResolver.AudioAttributesCompatParcelizer
            /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
            public final write read() {
                return new write(this, (byte) 0);
            }

            private void IconCompatParcelizer() {
                this.MediaBrowserCompatSearchResultReceiver = true;
                this.AudioAttributesImplBaseParcelizer = false;
                this.MediaBrowserCompatItemReceiver = true;
                this.AudioAttributesImplApi21Parcelizer = false;
                this.RatingCompat = true;
                this.write = false;
                this.read = false;
                this.IconCompatParcelizer = false;
                this.AudioAttributesCompatParcelizer = false;
                this.RemoteActionCompatParcelizer = true;
                this.MediaBrowserCompatMediaItem = true;
                this.MediaDescriptionCompat = true;
                this.onCommand = false;
                this.AudioAttributesImplApi26Parcelizer = true;
                this.MediaBrowserCompatCustomActionResultReceiver = false;
            }

            private static SparseArray<Map<_writeAsBinary, AudioAttributesCompatParcelizer>> write(SparseArray<Map<_writeAsBinary, AudioAttributesCompatParcelizer>> sparseArray) {
                SparseArray<Map<_writeAsBinary, AudioAttributesCompatParcelizer>> sparseArray2 = new SparseArray<>();
                for (int i = 0; i < sparseArray.size(); i++) {
                    sparseArray2.put(sparseArray.keyAt(i), new HashMap(sparseArray.valueAt(i)));
                }
                return sparseArray2;
            }
        }

        static {
            LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(1000);
            LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(1001);
            LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(1002);
            LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(1003);
            LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(1004);
            LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(1005);
            LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(AnalyticsListener.EVENT_BANDWIDTH_ESTIMATE);
            LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(AnalyticsListener.EVENT_AUDIO_ENABLED);
            LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(AnalyticsListener.EVENT_AUDIO_DECODER_INITIALIZED);
            LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(AnalyticsListener.EVENT_AUDIO_INPUT_FORMAT_CHANGED);
            LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(AnalyticsListener.EVENT_AUDIO_POSITION_ADVANCING);
            LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(AnalyticsListener.EVENT_AUDIO_UNDERRUN);
            LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(AnalyticsListener.EVENT_AUDIO_DECODER_RELEASED);
            LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(AnalyticsListener.EVENT_AUDIO_DISABLED);
            LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(AnalyticsListener.EVENT_AUDIO_SINK_ERROR);
            LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(AnalyticsListener.EVENT_VIDEO_ENABLED);
            LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(AnalyticsListener.EVENT_VIDEO_DECODER_INITIALIZED);
            LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(AnalyticsListener.EVENT_VIDEO_INPUT_FORMAT_CHANGED);
            LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(AnalyticsListener.EVENT_DROPPED_VIDEO_FRAMES);
        }

        public static write IconCompatParcelizer(Context context) {
            return new C0086write(context).read();
        }

        private write(C0086write c0086write) {
            super(c0086write);
            this.setSessionImpl = c0086write.MediaBrowserCompatSearchResultReceiver;
            this.onSetPlaybackSpeed = c0086write.AudioAttributesImplBaseParcelizer;
            this.onSetRepeatMode = c0086write.MediaBrowserCompatItemReceiver;
            this.onSetShuffleMode = c0086write.AudioAttributesImplApi21Parcelizer;
            this.onSkipToQueueItem = c0086write.RatingCompat;
            this.onSeekTo = c0086write.write;
            this.onPrepareFromUri = c0086write.read;
            this.onRemoveQueueItemAt = c0086write.IconCompatParcelizer;
            this.onRemoveQueueItem = c0086write.AudioAttributesCompatParcelizer;
            this.onRewind = c0086write.RemoteActionCompatParcelizer;
            this.onStop = c0086write.MediaBrowserCompatMediaItem;
            this.onSkipToPrevious = c0086write.MediaDescriptionCompat;
            this.onSkipToNext = c0086write.onCommand;
            this.onSetCaptioningEnabled = c0086write.AudioAttributesImplApi26Parcelizer;
            this.onSetRating = c0086write.MediaBrowserCompatCustomActionResultReceiver;
            this.ParcelableVolumeInfo = c0086write.onCustomAction;
            this.MediaSessionCompatToken = c0086write.MediaMetadataCompat;
        }

        public final boolean read(int i) {
            return this.MediaSessionCompatToken.get(i);
        }

        @Deprecated
        public final boolean AudioAttributesCompatParcelizer(int i, _writeAsBinary _writeasbinary) {
            Map<_writeAsBinary, AudioAttributesCompatParcelizer> map = this.ParcelableVolumeInfo.get(i);
            return map != null && map.containsKey(_writeasbinary);
        }

        @Deprecated
        public final AudioAttributesCompatParcelizer write(int i, _writeAsBinary _writeasbinary) {
            Map<_writeAsBinary, AudioAttributesCompatParcelizer> map = this.ParcelableVolumeInfo.get(i);
            if (map != null) {
                return map.get(_writeasbinary);
            }
            return null;
        }

        @Override // kotlin.SubtypeResolver
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final C0086write write() {
            return new C0086write(this, (byte) 0);
        }

        @Override // kotlin.SubtypeResolver
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            write writeVar = (write) obj;
            return super.equals(writeVar) && this.setSessionImpl == writeVar.setSessionImpl && this.onSetPlaybackSpeed == writeVar.onSetPlaybackSpeed && this.onSetRepeatMode == writeVar.onSetRepeatMode && this.onSetShuffleMode == writeVar.onSetShuffleMode && this.onSkipToQueueItem == writeVar.onSkipToQueueItem && this.onSeekTo == writeVar.onSeekTo && this.onPrepareFromUri == writeVar.onPrepareFromUri && this.onRemoveQueueItemAt == writeVar.onRemoveQueueItemAt && this.onRemoveQueueItem == writeVar.onRemoveQueueItem && this.onRewind == writeVar.onRewind && this.onStop == writeVar.onStop && this.onSkipToPrevious == writeVar.onSkipToPrevious && this.onSkipToNext == writeVar.onSkipToNext && this.onSetCaptioningEnabled == writeVar.onSetCaptioningEnabled && this.onSetRating == writeVar.onSetRating && RemoteActionCompatParcelizer(this.MediaSessionCompatToken, writeVar.MediaSessionCompatToken) && IconCompatParcelizer(this.ParcelableVolumeInfo, writeVar.ParcelableVolumeInfo);
        }

        @Override // kotlin.SubtypeResolver
        public final int hashCode() {
            return ((((((((((((((((((((((((((((((super.hashCode() + 31) * 31) + (this.setSessionImpl ? 1 : 0)) * 31) + (this.onSetPlaybackSpeed ? 1 : 0)) * 31) + (this.onSetRepeatMode ? 1 : 0)) * 31) + (this.onSetShuffleMode ? 1 : 0)) * 31) + (this.onSkipToQueueItem ? 1 : 0)) * 31) + (this.onSeekTo ? 1 : 0)) * 31) + (this.onPrepareFromUri ? 1 : 0)) * 31) + (this.onRemoveQueueItemAt ? 1 : 0)) * 31) + (this.onRemoveQueueItem ? 1 : 0)) * 31) + (this.onRewind ? 1 : 0)) * 31) + (this.onStop ? 1 : 0)) * 31) + (this.onSkipToPrevious ? 1 : 0)) * 31) + (this.onSkipToNext ? 1 : 0)) * 31) + (this.onSetCaptioningEnabled ? 1 : 0)) * 31) + (this.onSetRating ? 1 : 0);
        }

        private static boolean RemoteActionCompatParcelizer(SparseBooleanArray sparseBooleanArray, SparseBooleanArray sparseBooleanArray2) {
            int size = sparseBooleanArray.size();
            if (sparseBooleanArray2.size() != size) {
                return false;
            }
            for (int i = 0; i < size; i++) {
                if (sparseBooleanArray2.indexOfKey(sparseBooleanArray.keyAt(i)) < 0) {
                    return false;
                }
            }
            return true;
        }

        private static boolean IconCompatParcelizer(SparseArray<Map<_writeAsBinary, AudioAttributesCompatParcelizer>> sparseArray, SparseArray<Map<_writeAsBinary, AudioAttributesCompatParcelizer>> sparseArray2) {
            int size = sparseArray.size();
            if (sparseArray2.size() != size) {
                return false;
            }
            for (int i = 0; i < size; i++) {
                int iIndexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i));
                if (iIndexOfKey < 0 || !AudioAttributesCompatParcelizer(sparseArray.valueAt(i), sparseArray2.valueAt(iIndexOfKey))) {
                    return false;
                }
            }
            return true;
        }

        private static boolean AudioAttributesCompatParcelizer(Map<_writeAsBinary, AudioAttributesCompatParcelizer> map, Map<_writeAsBinary, AudioAttributesCompatParcelizer> map2) {
            if (map2.size() != map.size()) {
                return false;
            }
            for (Map.Entry<_writeAsBinary, AudioAttributesCompatParcelizer> entry : map.entrySet()) {
                _writeAsBinary key = entry.getKey();
                if (!map2.containsKey(key) || !LaissezFaireSubTypeValidator.read(entry.getValue(), map2.get(key))) {
                    return false;
                }
            }
            return true;
        }
    }

    public static final class AudioAttributesCompatParcelizer {
        public final int IconCompatParcelizer;
        public final int[] RemoteActionCompatParcelizer;
        public final int read;

        public final int hashCode() {
            return (((this.read * 31) + Arrays.hashCode(this.RemoteActionCompatParcelizer)) * 31) + this.IconCompatParcelizer;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = (AudioAttributesCompatParcelizer) obj;
            return this.read == audioAttributesCompatParcelizer.read && Arrays.equals(this.RemoteActionCompatParcelizer, audioAttributesCompatParcelizer.RemoteActionCompatParcelizer) && this.IconCompatParcelizer == audioAttributesCompatParcelizer.IconCompatParcelizer;
        }

        static {
            LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(0);
            LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(1);
            LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(2);
        }
    }

    static /* synthetic */ int write(Integer num, Integer num2) {
        if (num.intValue() == -1) {
            return num2.intValue() == -1 ? 0 : -1;
        }
        if (num2.intValue() == -1) {
            return 1;
        }
        return num.intValue() - num2.intValue();
    }

    public findBoundType(Context context) {
        this(context, new createIfNeeded.read());
    }

    public findBoundType(Context context, _verifyAndResolvePlaceholders.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
        this(context, write.IconCompatParcelizer(context), audioAttributesCompatParcelizer);
    }

    private findBoundType(Context context, SubtypeResolver subtypeResolver, _verifyAndResolvePlaceholders.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
        this(subtypeResolver, audioAttributesCompatParcelizer, context);
    }

    private findBoundType(SubtypeResolver subtypeResolver, _verifyAndResolvePlaceholders.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer, Context context) {
        this.AudioAttributesCompatParcelizer = new Object();
        this.RemoteActionCompatParcelizer = context != null ? context.getApplicationContext() : null;
        this.AudioAttributesImplBaseParcelizer = audioAttributesCompatParcelizer;
        if (subtypeResolver instanceof write) {
            this.AudioAttributesImplApi26Parcelizer = (write) subtypeResolver;
        } else {
            this.AudioAttributesImplApi26Parcelizer = (context == null ? write.onPrepareFromMediaId : write.IconCompatParcelizer(context)).write().read(subtypeResolver).read();
        }
        this.write = JsonIntegerFormatVisitor.write;
        boolean z = context != null && LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(context);
        this.IconCompatParcelizer = z;
        if (!z && context != null && LaissezFaireSubTypeValidator.MediaBrowserCompatCustomActionResultReceiver >= 32) {
            this.MediaBrowserCompatItemReceiver = AudioAttributesImplBaseParcelizer.AudioAttributesCompatParcelizer(context);
        }
        if (this.AudioAttributesImplApi26Parcelizer.onStop && context == null) {
            prune.RemoteActionCompatParcelizer("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
    }

    @Override // kotlin._constructSimple
    public final void read() {
        AudioAttributesImplBaseParcelizer audioAttributesImplBaseParcelizer;
        synchronized (this.AudioAttributesCompatParcelizer) {
            if (LaissezFaireSubTypeValidator.MediaBrowserCompatCustomActionResultReceiver >= 32 && (audioAttributesImplBaseParcelizer = this.MediaBrowserCompatItemReceiver) != null) {
                audioAttributesImplBaseParcelizer.write();
            }
        }
        super.read();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin._constructSimple
    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: merged with bridge method [inline-methods] */
    public write AudioAttributesCompatParcelizer() {
        write writeVar;
        synchronized (this.AudioAttributesCompatParcelizer) {
            writeVar = this.AudioAttributesImplApi26Parcelizer;
        }
        return writeVar;
    }

    @Override // kotlin._constructSimple
    public final void read(SubtypeResolver subtypeResolver) {
        if (subtypeResolver instanceof write) {
            AudioAttributesCompatParcelizer((write) subtypeResolver);
        }
        AudioAttributesCompatParcelizer(new write.C0086write(AudioAttributesCompatParcelizer(), (byte) 0).read(subtypeResolver).read());
    }

    @Override // kotlin._constructSimple
    public final void write(JsonIntegerFormatVisitor jsonIntegerFormatVisitor) {
        boolean zEquals;
        synchronized (this.AudioAttributesCompatParcelizer) {
            zEquals = this.write.equals(jsonIntegerFormatVisitor);
            this.write = jsonIntegerFormatVisitor;
        }
        if (zEquals) {
            return;
        }
        AudioAttributesImplApi26Parcelizer();
    }

    private void AudioAttributesCompatParcelizer(write writeVar) {
        boolean zEquals;
        synchronized (this.AudioAttributesCompatParcelizer) {
            zEquals = this.AudioAttributesImplApi26Parcelizer.equals(writeVar);
            this.AudioAttributesImplApi26Parcelizer = writeVar;
        }
        if (zEquals) {
            return;
        }
        if (writeVar.onStop && this.RemoteActionCompatParcelizer == null) {
            prune.RemoteActionCompatParcelizer("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
        MediaBrowserCompatCustomActionResultReceiver();
    }

    @Override // o.buildIterableSerializer.write
    public final void AudioAttributesCompatParcelizer(buildIndexedListSerializer buildindexedlistserializer) {
        IconCompatParcelizer(buildindexedlistserializer);
    }

    @Override // kotlin.unknownType
    protected final Pair<buildIteratorSerializer[], _verifyAndResolvePlaceholders[]> read(unknownType.write writeVar, int[][][] iArr, int[] iArr2) throws addNull {
        write writeVar2;
        AudioAttributesImplBaseParcelizer audioAttributesImplBaseParcelizer;
        synchronized (this.AudioAttributesCompatParcelizer) {
            writeVar2 = this.AudioAttributesImplApi26Parcelizer;
            if (writeVar2.onStop && LaissezFaireSubTypeValidator.MediaBrowserCompatCustomActionResultReceiver >= 32 && (audioAttributesImplBaseParcelizer = this.MediaBrowserCompatItemReceiver) != null) {
                audioAttributesImplBaseParcelizer.AudioAttributesCompatParcelizer(this, (Looper) buildTypeSerializer.AudioAttributesCompatParcelizer(Looper.myLooper()));
            }
        }
        int iWrite = writeVar.write();
        _verifyAndResolvePlaceholders.write[] writeVarArrWrite = write(writeVar, iArr, iArr2, writeVar2);
        AudioAttributesCompatParcelizer(writeVar, (SubtypeResolver) writeVar2, writeVarArrWrite);
        AudioAttributesCompatParcelizer(writeVar, writeVar2, writeVarArrWrite);
        for (int i = 0; i < iWrite; i++) {
            int i2 = writeVar.read(i);
            if (writeVar2.read(i) || writeVar2.read.contains(Integer.valueOf(i2))) {
                writeVarArrWrite[i] = null;
            }
        }
        _verifyAndResolvePlaceholders[] _verifyandresolveplaceholdersArrWrite = this.AudioAttributesImplBaseParcelizer.write(writeVarArrWrite, AudioAttributesImplBaseParcelizer());
        buildIteratorSerializer[] builditeratorserializerArr = new buildIteratorSerializer[iWrite];
        for (int i3 = 0; i3 < iWrite; i3++) {
            builditeratorserializerArr[i3] = (writeVar2.read(i3) || writeVar2.read.contains(Integer.valueOf(writeVar.read(i3))) || (writeVar.read(i3) != -2 && _verifyandresolveplaceholdersArrWrite[i3] == null)) ? null : buildIteratorSerializer.read;
        }
        if (writeVar2.onSkipToNext) {
            IconCompatParcelizer(writeVar, iArr, builditeratorserializerArr, _verifyandresolveplaceholdersArrWrite);
        }
        if (writeVar2.write.read != 0) {
            AudioAttributesCompatParcelizer(writeVar2, writeVar, iArr, builditeratorserializerArr, _verifyandresolveplaceholdersArrWrite);
        }
        return Pair.create(builditeratorserializerArr, _verifyandresolveplaceholdersArrWrite);
    }

    private _verifyAndResolvePlaceholders.write[] write(unknownType.write writeVar, int[][][] iArr, int[] iArr2, write writeVar2) throws addNull {
        int iWrite = writeVar.write();
        _verifyAndResolvePlaceholders.write[] writeVarArr = new _verifyAndResolvePlaceholders.write[iWrite];
        Pair<_verifyAndResolvePlaceholders.write, Integer> pairRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(writeVar, iArr, iArr2, writeVar2);
        Pair<_verifyAndResolvePlaceholders.write, Integer> pairAudioAttributesCompatParcelizer = (writeVar2.AudioAttributesImplBaseParcelizer || pairRemoteActionCompatParcelizer == null) ? AudioAttributesCompatParcelizer(writeVar, iArr, writeVar2) : null;
        if (pairAudioAttributesCompatParcelizer != null) {
            writeVarArr[((Integer) pairAudioAttributesCompatParcelizer.second).intValue()] = (_verifyAndResolvePlaceholders.write) pairAudioAttributesCompatParcelizer.first;
        } else if (pairRemoteActionCompatParcelizer != null) {
            writeVarArr[((Integer) pairRemoteActionCompatParcelizer.second).intValue()] = (_verifyAndResolvePlaceholders.write) pairRemoteActionCompatParcelizer.first;
        }
        Pair<_verifyAndResolvePlaceholders.write, Integer> pairAudioAttributesCompatParcelizer2 = AudioAttributesCompatParcelizer(writeVar, iArr, iArr2, writeVar2);
        if (pairAudioAttributesCompatParcelizer2 != null) {
            writeVarArr[((Integer) pairAudioAttributesCompatParcelizer2.second).intValue()] = (_verifyAndResolvePlaceholders.write) pairAudioAttributesCompatParcelizer2.first;
        }
        Pair<_verifyAndResolvePlaceholders.write, Integer> pairWrite = write(writeVar, iArr, writeVar2, pairAudioAttributesCompatParcelizer2 != null ? ((_verifyAndResolvePlaceholders.write) pairAudioAttributesCompatParcelizer2.first).read.AudioAttributesCompatParcelizer(((_verifyAndResolvePlaceholders.write) pairAudioAttributesCompatParcelizer2.first).IconCompatParcelizer[0]).MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver : null);
        if (pairWrite != null) {
            writeVarArr[((Integer) pairWrite.second).intValue()] = (_verifyAndResolvePlaceholders.write) pairWrite.first;
        }
        for (int i = 0; i < iWrite; i++) {
            int i2 = writeVar.read(i);
            if (i2 != 2 && i2 != 1 && i2 != 3 && i2 != 4) {
                writeVarArr[i] = read(writeVar.write(i), iArr[i], writeVar2);
            }
        }
        return writeVarArr;
    }

    private static Pair<_verifyAndResolvePlaceholders.write, Integer> RemoteActionCompatParcelizer(unknownType.write writeVar, int[][][] iArr, final int[] iArr2, final write writeVar2) throws addNull {
        if (writeVar2.write.read == 2) {
            return null;
        }
        return AudioAttributesCompatParcelizer(2, writeVar, iArr, new AudioAttributesImplApi21Parcelizer.IconCompatParcelizer() { // from class: o.typeParameterArray
            @Override // o.findBoundType.AudioAttributesImplApi21Parcelizer.IconCompatParcelizer
            public final List read(int i, setName setname, int[] iArr3) {
                return findBoundType.MediaBrowserCompatCustomActionResultReceiver.AudioAttributesCompatParcelizer(i, setname, writeVar2, iArr3, iArr2[i]);
            }
        }, new Comparator() { // from class: o.TypeBindingsAsKey
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return findBoundType.MediaBrowserCompatCustomActionResultReceiver.write((List<findBoundType.MediaBrowserCompatCustomActionResultReceiver>) obj, (List<findBoundType.MediaBrowserCompatCustomActionResultReceiver>) obj2);
            }
        });
    }

    private Pair<_verifyAndResolvePlaceholders.write, Integer> AudioAttributesCompatParcelizer(unknownType.write writeVar, int[][][] iArr, final int[] iArr2, final write writeVar2) throws addNull {
        final boolean z = false;
        int i = 0;
        while (true) {
            if (i < writeVar.write()) {
                if (2 == writeVar.read(i) && writeVar.write(i).RemoteActionCompatParcelizer > 0) {
                    z = true;
                    break;
                }
                i++;
            } else {
                break;
            }
        }
        return AudioAttributesCompatParcelizer(1, writeVar, iArr, new AudioAttributesImplApi21Parcelizer.IconCompatParcelizer() { // from class: o.withUnboundVariable
            @Override // o.findBoundType.AudioAttributesImplApi21Parcelizer.IconCompatParcelizer
            public final List read(int i2, setName setname, int[] iArr3) {
                return this.AudioAttributesCompatParcelizer.read(writeVar2, z, iArr2, i2, setname, iArr3);
            }
        }, new Comparator() { // from class: o.paramsFor1
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return findBoundType.RemoteActionCompatParcelizer.write((List) obj, (List) obj2);
            }
        });
    }

    final /* synthetic */ List read(write writeVar, boolean z, int[] iArr, int i, setName setname, int[] iArr2) {
        return RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(i, setname, writeVar, iArr2, z, new parseTraks() { // from class: o.hasUnbound
            @Override // kotlin.parseTraks
            public final boolean apply(Object obj) {
                return this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer((C0170format) obj);
            }
        }, iArr[i]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean AudioAttributesCompatParcelizer(kotlin.C0170format r4) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.AudioAttributesCompatParcelizer
            monitor-enter(r0)
            o.findBoundType$write r1 = r3.AudioAttributesImplApi26Parcelizer     // Catch: java.lang.Throwable -> L56
            boolean r1 = r1.onStop     // Catch: java.lang.Throwable -> L56
            if (r1 == 0) goto L53
            boolean r1 = r3.IconCompatParcelizer     // Catch: java.lang.Throwable -> L56
            if (r1 != 0) goto L53
            int r1 = r4.AudioAttributesCompatParcelizer     // Catch: java.lang.Throwable -> L56
            r2 = 2
            if (r1 <= r2) goto L53
            boolean r1 = IconCompatParcelizer(r4)     // Catch: java.lang.Throwable -> L56
            r2 = 32
            if (r1 == 0) goto L28
            int r1 = kotlin.LaissezFaireSubTypeValidator.MediaBrowserCompatCustomActionResultReceiver     // Catch: java.lang.Throwable -> L56
            if (r1 < r2) goto L53
            o.findBoundType$AudioAttributesImplBaseParcelizer r1 = r3.MediaBrowserCompatItemReceiver     // Catch: java.lang.Throwable -> L56
            if (r1 == 0) goto L53
            boolean r1 = r1.AudioAttributesCompatParcelizer()     // Catch: java.lang.Throwable -> L56
            if (r1 == 0) goto L53
        L28:
            int r1 = kotlin.LaissezFaireSubTypeValidator.MediaBrowserCompatCustomActionResultReceiver     // Catch: java.lang.Throwable -> L56
            if (r1 < r2) goto L51
            o.findBoundType$AudioAttributesImplBaseParcelizer r1 = r3.MediaBrowserCompatItemReceiver     // Catch: java.lang.Throwable -> L56
            if (r1 == 0) goto L51
            boolean r1 = r1.AudioAttributesCompatParcelizer()     // Catch: java.lang.Throwable -> L56
            if (r1 == 0) goto L51
            o.findBoundType$AudioAttributesImplBaseParcelizer r1 = r3.MediaBrowserCompatItemReceiver     // Catch: java.lang.Throwable -> L56
            boolean r1 = r1.IconCompatParcelizer()     // Catch: java.lang.Throwable -> L56
            if (r1 == 0) goto L51
            o.findBoundType$AudioAttributesImplBaseParcelizer r1 = r3.MediaBrowserCompatItemReceiver     // Catch: java.lang.Throwable -> L56
            boolean r1 = r1.RemoteActionCompatParcelizer()     // Catch: java.lang.Throwable -> L56
            if (r1 == 0) goto L51
            o.findBoundType$AudioAttributesImplBaseParcelizer r1 = r3.MediaBrowserCompatItemReceiver     // Catch: java.lang.Throwable -> L56
            o.JsonIntegerFormatVisitor r3 = r3.write     // Catch: java.lang.Throwable -> L56
            boolean r3 = r1.IconCompatParcelizer(r3, r4)     // Catch: java.lang.Throwable -> L56
            if (r3 == 0) goto L51
            goto L53
        L51:
            r3 = 0
            goto L54
        L53:
            r3 = 1
        L54:
            monitor-exit(r0)
            return r3
        L56:
            r3 = move-exception
            monitor-exit(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.findBoundType.AudioAttributesCompatParcelizer(o.format):boolean");
    }

    private static Pair<_verifyAndResolvePlaceholders.write, Integer> write(unknownType.write writeVar, int[][][] iArr, final write writeVar2, final String str) throws addNull {
        if (writeVar2.write.read == 2) {
            return null;
        }
        return AudioAttributesCompatParcelizer(3, writeVar, iArr, new AudioAttributesImplApi21Parcelizer.IconCompatParcelizer() { // from class: o._bindingsForSubtype
            @Override // o.findBoundType.AudioAttributesImplApi21Parcelizer.IconCompatParcelizer
            public final List read(int i, setName setname, int[] iArr2) {
                return findBoundType.AudioAttributesImplApi26Parcelizer.read(i, setname, writeVar2, iArr2, str);
            }
        }, new Comparator() { // from class: o.paramsFor2
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return findBoundType.AudioAttributesImplApi26Parcelizer.IconCompatParcelizer((List) obj, (List) obj2);
            }
        });
    }

    private static Pair<_verifyAndResolvePlaceholders.write, Integer> AudioAttributesCompatParcelizer(unknownType.write writeVar, int[][][] iArr, final write writeVar2) throws addNull {
        if (writeVar2.write.read == 2) {
            return null;
        }
        return AudioAttributesCompatParcelizer(4, writeVar, iArr, new AudioAttributesImplApi21Parcelizer.IconCompatParcelizer() { // from class: o.getTypeParameters
            @Override // o.findBoundType.AudioAttributesImplApi21Parcelizer.IconCompatParcelizer
            public final List read(int i, setName setname, int[] iArr2) {
                return findBoundType.IconCompatParcelizer.write(i, setname, writeVar2, iArr2);
            }
        }, new Comparator() { // from class: o.TypeBindingsTypeParamStash
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return findBoundType.IconCompatParcelizer.IconCompatParcelizer((List) obj, (List) obj2);
            }
        });
    }

    private static _verifyAndResolvePlaceholders.write read(_writeAsBinary _writeasbinary, int[][] iArr, write writeVar) throws addNull {
        if (writeVar.write.read == 2) {
            return null;
        }
        int i = 0;
        setName setname = null;
        read readVar = null;
        for (int i2 = 0; i2 < _writeasbinary.RemoteActionCompatParcelizer; i2++) {
            setName setnameRemoteActionCompatParcelizer = _writeasbinary.RemoteActionCompatParcelizer(i2);
            int[] iArr2 = iArr[i2];
            for (int i3 = 0; i3 < setnameRemoteActionCompatParcelizer.write; i3++) {
                if (buildIterableSerializer.read(iArr2[i3], writeVar.onSkipToPrevious)) {
                    read readVar2 = new read(setnameRemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(i3), iArr2[i3]);
                    if (readVar == null || readVar2.compareTo(readVar) > 0) {
                        setname = setnameRemoteActionCompatParcelizer;
                        i = i3;
                        readVar = readVar2;
                    }
                }
            }
        }
        if (setname == null) {
            return null;
        }
        return new _verifyAndResolvePlaceholders.write(setname, i);
    }

    private static <T extends AudioAttributesImplApi21Parcelizer<T>> Pair<_verifyAndResolvePlaceholders.write, Integer> AudioAttributesCompatParcelizer(int i, unknownType.write writeVar, int[][][] iArr, AudioAttributesImplApi21Parcelizer.IconCompatParcelizer<T> iconCompatParcelizer, Comparator<List<T>> comparator) {
        int i2;
        RandomAccess randomAccess;
        unknownType.write writeVar2 = writeVar;
        ArrayList arrayList = new ArrayList();
        int iWrite = writeVar.write();
        int i3 = 0;
        while (i3 < iWrite) {
            if (i == writeVar2.read(i3)) {
                _writeAsBinary _writeasbinaryWrite = writeVar2.write(i3);
                for (int i4 = 0; i4 < _writeasbinaryWrite.RemoteActionCompatParcelizer; i4++) {
                    setName setnameRemoteActionCompatParcelizer = _writeasbinaryWrite.RemoteActionCompatParcelizer(i4);
                    List<T> list = iconCompatParcelizer.read(i3, setnameRemoteActionCompatParcelizer, iArr[i3][i4]);
                    boolean[] zArr = new boolean[setnameRemoteActionCompatParcelizer.write];
                    int i5 = 0;
                    while (i5 < setnameRemoteActionCompatParcelizer.write) {
                        T t = list.get(i5);
                        int iRemoteActionCompatParcelizer = t.RemoteActionCompatParcelizer();
                        if (zArr[i5] || iRemoteActionCompatParcelizer == 0) {
                            i2 = iWrite;
                        } else {
                            if (iRemoteActionCompatParcelizer == 1) {
                                randomAccess = initExtraTracks.read(t);
                                i2 = iWrite;
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(t);
                                int i6 = i5 + 1;
                                while (i6 < setnameRemoteActionCompatParcelizer.write) {
                                    T t2 = list.get(i6);
                                    int i7 = iWrite;
                                    if (t2.RemoteActionCompatParcelizer() == 2 && t.RemoteActionCompatParcelizer(t2)) {
                                        arrayList2.add(t2);
                                        zArr[i6] = true;
                                    }
                                    i6++;
                                    iWrite = i7;
                                }
                                i2 = iWrite;
                                randomAccess = arrayList2;
                            }
                            arrayList.add(randomAccess);
                        }
                        i5++;
                        iWrite = i2;
                    }
                }
            }
            i3++;
            writeVar2 = writeVar;
            iWrite = iWrite;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list2 = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list2.size()];
        for (int i8 = 0; i8 < list2.size(); i8++) {
            iArr2[i8] = ((AudioAttributesImplApi21Parcelizer) list2.get(i8)).AudioAttributesCompatParcelizer;
        }
        AudioAttributesImplApi21Parcelizer audioAttributesImplApi21Parcelizer = (AudioAttributesImplApi21Parcelizer) list2.get(0);
        return Pair.create(new _verifyAndResolvePlaceholders.write(audioAttributesImplApi21Parcelizer.write, iArr2), Integer.valueOf(audioAttributesImplApi21Parcelizer.RemoteActionCompatParcelizer));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void AudioAttributesImplApi26Parcelizer() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.AudioAttributesCompatParcelizer
            monitor-enter(r0)
            o.findBoundType$write r1 = r3.AudioAttributesImplApi26Parcelizer     // Catch: java.lang.Throwable -> L27
            boolean r1 = r1.onStop     // Catch: java.lang.Throwable -> L27
            if (r1 == 0) goto L1f
            boolean r1 = r3.IconCompatParcelizer     // Catch: java.lang.Throwable -> L27
            if (r1 != 0) goto L1f
            int r1 = kotlin.LaissezFaireSubTypeValidator.MediaBrowserCompatCustomActionResultReceiver     // Catch: java.lang.Throwable -> L27
            r2 = 32
            if (r1 < r2) goto L1f
            o.findBoundType$AudioAttributesImplBaseParcelizer r1 = r3.MediaBrowserCompatItemReceiver     // Catch: java.lang.Throwable -> L27
            if (r1 == 0) goto L1f
            boolean r1 = r1.AudioAttributesCompatParcelizer()     // Catch: java.lang.Throwable -> L27
            if (r1 == 0) goto L1f
            r1 = 1
            goto L20
        L1f:
            r1 = 0
        L20:
            monitor-exit(r0)
            if (r1 == 0) goto L26
            r3.MediaBrowserCompatCustomActionResultReceiver()
        L26:
            return
        L27:
            r3 = move-exception
            monitor-exit(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.findBoundType.AudioAttributesImplApi26Parcelizer():void");
    }

    private void IconCompatParcelizer(buildIndexedListSerializer buildindexedlistserializer) {
        boolean z;
        synchronized (this.AudioAttributesCompatParcelizer) {
            z = this.AudioAttributesImplApi26Parcelizer.onSetRating;
        }
        if (z) {
            MediaBrowserCompatItemReceiver();
        }
    }

    private static void AudioAttributesCompatParcelizer(unknownType.write writeVar, SubtypeResolver subtypeResolver, _verifyAndResolvePlaceholders.write[] writeVarArr) {
        int iWrite = writeVar.write();
        HashMap map = new HashMap();
        for (int i = 0; i < iWrite; i++) {
            AudioAttributesCompatParcelizer(writeVar.write(i), subtypeResolver, map);
        }
        AudioAttributesCompatParcelizer(writeVar.IconCompatParcelizer(), subtypeResolver, map);
        for (int i2 = 0; i2 < iWrite; i2++) {
            TypeDeserializer typeDeserializer = (TypeDeserializer) map.get(Integer.valueOf(writeVar.read(i2)));
            if (typeDeserializer != null) {
                writeVarArr[i2] = (typeDeserializer.RemoteActionCompatParcelizer.isEmpty() || writeVar.write(i2).RemoteActionCompatParcelizer(typeDeserializer.read) == -1) ? null : new _verifyAndResolvePlaceholders.write(typeDeserializer.read, parseTextAttribute.write(typeDeserializer.RemoteActionCompatParcelizer));
            }
        }
    }

    private static void AudioAttributesCompatParcelizer(_writeAsBinary _writeasbinary, SubtypeResolver subtypeResolver, Map<Integer, TypeDeserializer> map) {
        TypeDeserializer typeDeserializer;
        for (int i = 0; i < _writeasbinary.RemoteActionCompatParcelizer; i++) {
            TypeDeserializer typeDeserializer2 = subtypeResolver.onAddQueueItem.get(_writeasbinary.RemoteActionCompatParcelizer(i));
            if (typeDeserializer2 != null && ((typeDeserializer = map.get(Integer.valueOf(typeDeserializer2.IconCompatParcelizer()))) == null || (typeDeserializer.RemoteActionCompatParcelizer.isEmpty() && !typeDeserializer2.RemoteActionCompatParcelizer.isEmpty()))) {
                map.put(Integer.valueOf(typeDeserializer2.IconCompatParcelizer()), typeDeserializer2);
            }
        }
    }

    private static void AudioAttributesCompatParcelizer(unknownType.write writeVar, write writeVar2, _verifyAndResolvePlaceholders.write[] writeVarArr) {
        int iWrite = writeVar.write();
        for (int i = 0; i < iWrite; i++) {
            _writeAsBinary _writeasbinaryWrite = writeVar.write(i);
            if (writeVar2.AudioAttributesCompatParcelizer(i, _writeasbinaryWrite)) {
                AudioAttributesCompatParcelizer audioAttributesCompatParcelizerWrite = writeVar2.write(i, _writeasbinaryWrite);
                writeVarArr[i] = (audioAttributesCompatParcelizerWrite == null || audioAttributesCompatParcelizerWrite.RemoteActionCompatParcelizer.length == 0) ? null : new _verifyAndResolvePlaceholders.write(_writeasbinaryWrite.RemoteActionCompatParcelizer(audioAttributesCompatParcelizerWrite.read), audioAttributesCompatParcelizerWrite.RemoteActionCompatParcelizer, audioAttributesCompatParcelizerWrite.IconCompatParcelizer);
            }
        }
    }

    private static void IconCompatParcelizer(unknownType.write writeVar, int[][][] iArr, buildIteratorSerializer[] builditeratorserializerArr, _verifyAndResolvePlaceholders[] _verifyandresolveplaceholdersArr) {
        boolean z;
        int i = -1;
        int i2 = -1;
        for (int i3 = 0; i3 < writeVar.write(); i3++) {
            int i4 = writeVar.read(i3);
            _verifyAndResolvePlaceholders _verifyandresolveplaceholders = _verifyandresolveplaceholdersArr[i3];
            if ((i4 == 1 || i4 == 2) && _verifyandresolveplaceholders != null && read(iArr[i3], writeVar.write(i3), _verifyandresolveplaceholders)) {
                if (i4 == 1) {
                    if (i2 != -1) {
                        z = false;
                        break;
                    }
                    i2 = i3;
                } else {
                    if (i != -1) {
                        z = false;
                        break;
                    }
                    i = i3;
                }
            }
        }
        z = true;
        if (z && ((i2 == -1 || i == -1) ? false : true)) {
            buildIteratorSerializer builditeratorserializer = new buildIteratorSerializer(0, true);
            builditeratorserializerArr[i2] = builditeratorserializer;
            builditeratorserializerArr[i] = builditeratorserializer;
        }
    }

    private static boolean read(int[][] iArr, _writeAsBinary _writeasbinary, _verifyAndResolvePlaceholders _verifyandresolveplaceholders) {
        if (_verifyandresolveplaceholders == null) {
            return false;
        }
        int iRemoteActionCompatParcelizer = _writeasbinary.RemoteActionCompatParcelizer(_verifyandresolveplaceholders.AudioAttributesImplBaseParcelizer());
        for (int i = 0; i < _verifyandresolveplaceholders.MediaBrowserCompatCustomActionResultReceiver(); i++) {
            if (buildIterableSerializer.MediaBrowserCompatCustomActionResultReceiver(iArr[iRemoteActionCompatParcelizer][_verifyandresolveplaceholders.IconCompatParcelizer(i)]) != 32) {
                return false;
            }
        }
        return true;
    }

    private static void AudioAttributesCompatParcelizer(write writeVar, unknownType.write writeVar2, int[][][] iArr, buildIteratorSerializer[] builditeratorserializerArr, _verifyAndResolvePlaceholders[] _verifyandresolveplaceholdersArr) {
        int i = -1;
        boolean z = false;
        int i2 = 0;
        for (int i3 = 0; i3 < writeVar2.write(); i3++) {
            int i4 = writeVar2.read(i3);
            _verifyAndResolvePlaceholders _verifyandresolveplaceholders = _verifyandresolveplaceholdersArr[i3];
            if (i4 != 1 && _verifyandresolveplaceholders != null) {
                return;
            }
            if (i4 == 1 && _verifyandresolveplaceholders != null && _verifyandresolveplaceholders.MediaBrowserCompatCustomActionResultReceiver() == 1) {
                if (IconCompatParcelizer(writeVar, iArr[i3][writeVar2.write(i3).RemoteActionCompatParcelizer(_verifyandresolveplaceholders.AudioAttributesImplBaseParcelizer())][_verifyandresolveplaceholders.IconCompatParcelizer(0)], _verifyandresolveplaceholders.MediaBrowserCompatItemReceiver())) {
                    i2++;
                    i = i3;
                }
            }
        }
        if (i2 == 1) {
            int i5 = writeVar.write.write ? 1 : 2;
            buildIteratorSerializer builditeratorserializer = builditeratorserializerArr[i];
            if (builditeratorserializer != null && builditeratorserializer.RemoteActionCompatParcelizer) {
                z = true;
            }
            builditeratorserializerArr[i] = new buildIteratorSerializer(i5, z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean IconCompatParcelizer(write writeVar, int i, C0170format c0170format) {
        if (buildIterableSerializer.RemoteActionCompatParcelizer(i) == 0) {
            return false;
        }
        if (writeVar.write.AudioAttributesCompatParcelizer && (buildIterableSerializer.RemoteActionCompatParcelizer(i) & 2048) == 0) {
            return false;
        }
        if (writeVar.write.write) {
            boolean z = (c0170format.MediaDescriptionCompat == 0 && c0170format.MediaBrowserCompatSearchResultReceiver == 0) ? false : true;
            boolean z2 = (buildIterableSerializer.RemoteActionCompatParcelizer(i) & 1024) != 0;
            if (z && !z2) {
                return false;
            }
        }
        return true;
    }

    protected static String AudioAttributesCompatParcelizer(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, C.LANGUAGE_UNDETERMINED)) {
            return null;
        }
        return str;
    }

    protected static int write(C0170format c0170format, String str, boolean z) {
        if (!TextUtils.isEmpty(str) && str.equals(c0170format.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver)) {
            return 4;
        }
        String strAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(str);
        String strAudioAttributesCompatParcelizer2 = AudioAttributesCompatParcelizer(c0170format.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver);
        if (strAudioAttributesCompatParcelizer2 == null || strAudioAttributesCompatParcelizer == null) {
            return (z && strAudioAttributesCompatParcelizer2 == null) ? 1 : 0;
        }
        if (strAudioAttributesCompatParcelizer2.startsWith(strAudioAttributesCompatParcelizer) || strAudioAttributesCompatParcelizer.startsWith(strAudioAttributesCompatParcelizer2)) {
            return 3;
        }
        return LaissezFaireSubTypeValidator.RemoteActionCompatParcelizer(strAudioAttributesCompatParcelizer2, "-")[0].equals(LaissezFaireSubTypeValidator.RemoteActionCompatParcelizer(strAudioAttributesCompatParcelizer, "-")[0]) ? 2 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int IconCompatParcelizer(setName setname, int i, int i2, boolean z) {
        int i3 = Integer.MAX_VALUE;
        if (i != Integer.MAX_VALUE && i2 != Integer.MAX_VALUE) {
            for (int i4 = 0; i4 < setname.write; i4++) {
                C0170format c0170formatAudioAttributesCompatParcelizer = setname.AudioAttributesCompatParcelizer(i4);
                if (c0170formatAudioAttributesCompatParcelizer.onSetCaptioningEnabled > 0 && c0170formatAudioAttributesCompatParcelizer.MediaMetadataCompat > 0) {
                    Point pointIconCompatParcelizer = IconCompatParcelizer(z, i, i2, c0170formatAudioAttributesCompatParcelizer.onSetCaptioningEnabled, c0170formatAudioAttributesCompatParcelizer.MediaMetadataCompat);
                    int i5 = c0170formatAudioAttributesCompatParcelizer.onSetCaptioningEnabled * c0170formatAudioAttributesCompatParcelizer.MediaMetadataCompat;
                    if (c0170formatAudioAttributesCompatParcelizer.onSetCaptioningEnabled >= ((int) (pointIconCompatParcelizer.x * 0.98f)) && c0170formatAudioAttributesCompatParcelizer.MediaMetadataCompat >= ((int) (pointIconCompatParcelizer.y * 0.98f)) && i5 < i3) {
                        i3 = i5;
                    }
                }
            }
        }
        return i3;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x000f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static android.graphics.Point IconCompatParcelizer(boolean r3, int r4, int r5, int r6, int r7) {
        /*
            if (r3 == 0) goto Lf
            r3 = 0
            r0 = 1
            if (r6 <= r7) goto L8
            r1 = r0
            goto L9
        L8:
            r1 = r3
        L9:
            if (r4 > r5) goto Lc
            goto Ld
        Lc:
            r3 = r0
        Ld:
            if (r1 != r3) goto L12
        Lf:
            r2 = r5
            r5 = r4
            r4 = r2
        L12:
            int r3 = r6 * r4
            int r0 = r7 * r5
            if (r3 < r0) goto L22
            android.graphics.Point r3 = new android.graphics.Point
            int r4 = kotlin.LaissezFaireSubTypeValidator.RemoteActionCompatParcelizer(r0, r6)
            r3.<init>(r5, r4)
            return r3
        L22:
            android.graphics.Point r5 = new android.graphics.Point
            int r3 = kotlin.LaissezFaireSubTypeValidator.RemoteActionCompatParcelizer(r3, r7)
            r5.<init>(r3, r4)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.findBoundType.IconCompatParcelizer(boolean, int, int, int, int):android.graphics.Point");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int IconCompatParcelizer(int i, int i2) {
        if (i == 0 || i != i2) {
            return Integer.bitCount(i & i2);
        }
        return Integer.MAX_VALUE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int write(java.lang.String r6) {
        /*
            r0 = 0
            if (r6 != 0) goto L4
            return r0
        L4:
            r6.hashCode()
            int r1 = r6.hashCode()
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            switch(r1) {
                case -1851077871: goto L3b;
                case -1662735862: goto L31;
                case -1662541442: goto L27;
                case 1331836730: goto L1d;
                case 1599127257: goto L13;
                default: goto L12;
            }
        L12:
            goto L45
        L13:
            java.lang.String r1 = "video/x-vnd.on2.vp9"
            boolean r6 = r6.equals(r1)
            if (r6 == 0) goto L45
            r6 = r2
            goto L46
        L1d:
            java.lang.String r1 = "video/avc"
            boolean r6 = r6.equals(r1)
            if (r6 == 0) goto L45
            r6 = r3
            goto L46
        L27:
            java.lang.String r1 = "video/hevc"
            boolean r6 = r6.equals(r1)
            if (r6 == 0) goto L45
            r6 = r4
            goto L46
        L31:
            java.lang.String r1 = "video/av01"
            boolean r6 = r6.equals(r1)
            if (r6 == 0) goto L45
            r6 = r5
            goto L46
        L3b:
            java.lang.String r1 = "video/dolby-vision"
            boolean r6 = r6.equals(r1)
            if (r6 == 0) goto L45
            r6 = r0
            goto L46
        L45:
            r6 = -1
        L46:
            if (r6 == 0) goto L55
            if (r6 == r5) goto L54
            if (r6 == r4) goto L53
            if (r6 == r3) goto L52
            if (r6 == r2) goto L51
            return r0
        L51:
            return r4
        L52:
            return r5
        L53:
            return r3
        L54:
            return r2
        L55:
            r6 = 5
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.findBoundType.write(java.lang.String):int");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static boolean IconCompatParcelizer(kotlin.C0170format r5) {
        /*
            java.lang.String r0 = r5.onPlayFromUri
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            java.lang.String r5 = r5.onPlayFromUri
            r5.hashCode()
            int r0 = r5.hashCode()
            r2 = 3
            r3 = 2
            r4 = 1
            switch(r0) {
                case -2123537834: goto L34;
                case 187078296: goto L2a;
                case 187078297: goto L20;
                case 1504578661: goto L16;
                default: goto L15;
            }
        L15:
            goto L3e
        L16:
            java.lang.String r0 = "audio/eac3"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L3e
            r5 = r2
            goto L3f
        L20:
            java.lang.String r0 = "audio/ac4"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L3e
            r5 = r3
            goto L3f
        L2a:
            java.lang.String r0 = "audio/ac3"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L3e
            r5 = r4
            goto L3f
        L34:
            java.lang.String r0 = "audio/eac3-joc"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L3e
            r5 = r1
            goto L3f
        L3e:
            r5 = -1
        L3f:
            if (r5 == 0) goto L48
            if (r5 == r4) goto L48
            if (r5 == r3) goto L48
            if (r5 == r2) goto L48
            return r1
        L48:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.findBoundType.IconCompatParcelizer(o.format):boolean");
    }

    static abstract class AudioAttributesImplApi21Parcelizer<T extends AudioAttributesImplApi21Parcelizer<T>> {
        public final int AudioAttributesCompatParcelizer;
        public final C0170format IconCompatParcelizer;
        public final int RemoteActionCompatParcelizer;
        public final setName write;

        public interface IconCompatParcelizer<T extends AudioAttributesImplApi21Parcelizer<T>> {
            List<T> read(int i, setName setname, int[] iArr);
        }

        public abstract int RemoteActionCompatParcelizer();

        public abstract boolean RemoteActionCompatParcelizer(T t);

        public AudioAttributesImplApi21Parcelizer(int i, setName setname, int i2) {
            this.RemoteActionCompatParcelizer = i;
            this.write = setname;
            this.AudioAttributesCompatParcelizer = i2;
            this.IconCompatParcelizer = setname.AudioAttributesCompatParcelizer(i2);
        }
    }

    static final class MediaBrowserCompatCustomActionResultReceiver extends AudioAttributesImplApi21Parcelizer<MediaBrowserCompatCustomActionResultReceiver> {
        private final boolean AudioAttributesImplApi21Parcelizer;
        private final boolean AudioAttributesImplApi26Parcelizer;
        private final boolean AudioAttributesImplBaseParcelizer;
        private final int MediaBrowserCompatCustomActionResultReceiver;
        private final int MediaBrowserCompatItemReceiver;
        private final write MediaBrowserCompatMediaItem;
        private final boolean MediaBrowserCompatSearchResultReceiver;
        private final boolean MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        private final int MediaDescriptionCompat;
        private final boolean MediaMetadataCompat;
        private final int RatingCompat;
        private final int handleMediaPlayPauseIfPendingOnHandler;
        private final int onCommand;
        private final boolean onCustomAction;
        private final boolean read;

        public static initExtraTracks<MediaBrowserCompatCustomActionResultReceiver> AudioAttributesCompatParcelizer(int i, setName setname, write writeVar, int[] iArr, int i2) {
            int iIconCompatParcelizer = findBoundType.IconCompatParcelizer(setname, writeVar.onPlayFromUri, writeVar.onPrepareFromSearch, writeVar.onPrepare);
            initExtraTracks.IconCompatParcelizer iconCompatParcelizerMediaBrowserCompatCustomActionResultReceiver = initExtraTracks.MediaBrowserCompatCustomActionResultReceiver();
            for (int i3 = 0; i3 < setname.write; i3++) {
                int iAudioAttributesCompatParcelizer = setname.AudioAttributesCompatParcelizer(i3).AudioAttributesCompatParcelizer();
                iconCompatParcelizerMediaBrowserCompatCustomActionResultReceiver.read(new MediaBrowserCompatCustomActionResultReceiver(i, setname, i3, writeVar, iArr[i3], i2, iIconCompatParcelizer == Integer.MAX_VALUE || (iAudioAttributesCompatParcelizer != -1 && iAudioAttributesCompatParcelizer <= iIconCompatParcelizer)));
            }
            return iconCompatParcelizerMediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer();
        }

        private MediaBrowserCompatCustomActionResultReceiver(int i, setName setname, int i2, write writeVar, int i3, int i4, boolean z) {
            super(i, setname, i2);
            this.MediaBrowserCompatMediaItem = writeVar;
            int i5 = writeVar.onSetRepeatMode ? 24 : 16;
            this.read = writeVar.onSetPlaybackSpeed && (i4 & i5) != 0;
            this.AudioAttributesImplApi26Parcelizer = z && (this.IconCompatParcelizer.onSetCaptioningEnabled == -1 || this.IconCompatParcelizer.onSetCaptioningEnabled <= writeVar.MediaBrowserCompatSearchResultReceiver) && ((this.IconCompatParcelizer.MediaMetadataCompat == -1 || this.IconCompatParcelizer.MediaMetadataCompat <= writeVar.MediaBrowserCompatMediaItem) && ((this.IconCompatParcelizer.RatingCompat == -1.0f || this.IconCompatParcelizer.RatingCompat <= ((float) writeVar.MediaDescriptionCompat)) && (this.IconCompatParcelizer.read == -1 || this.IconCompatParcelizer.read <= writeVar.AudioAttributesImplApi21Parcelizer)));
            this.MediaBrowserCompatSearchResultReceiver = z && (this.IconCompatParcelizer.onSetCaptioningEnabled == -1 || this.IconCompatParcelizer.onSetCaptioningEnabled >= writeVar.onCommand) && ((this.IconCompatParcelizer.MediaMetadataCompat == -1 || this.IconCompatParcelizer.MediaMetadataCompat >= writeVar.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) && ((this.IconCompatParcelizer.RatingCompat == -1.0f || this.IconCompatParcelizer.RatingCompat >= ((float) writeVar.RatingCompat)) && (this.IconCompatParcelizer.read == -1 || this.IconCompatParcelizer.read >= writeVar.MediaMetadataCompat)));
            this.MediaMetadataCompat = buildIterableSerializer.read(i3, false);
            this.AudioAttributesImplBaseParcelizer = this.IconCompatParcelizer.RatingCompat != -1.0f && this.IconCompatParcelizer.RatingCompat >= 10.0f;
            this.MediaBrowserCompatItemReceiver = this.IconCompatParcelizer.read;
            this.MediaDescriptionCompat = this.IconCompatParcelizer.AudioAttributesCompatParcelizer();
            this.handleMediaPlayPauseIfPendingOnHandler = findBoundType.IconCompatParcelizer(this.IconCompatParcelizer.onPrepare, writeVar.onMediaButtonEvent);
            this.AudioAttributesImplApi21Parcelizer = this.IconCompatParcelizer.onPrepare == 0 || (this.IconCompatParcelizer.onPrepare & 1) != 0;
            int i6 = 0;
            while (true) {
                if (i6 >= writeVar.onPlayFromMediaId.size()) {
                    i6 = Integer.MAX_VALUE;
                    break;
                } else if (this.IconCompatParcelizer.onPlayFromUri != null && this.IconCompatParcelizer.onPlayFromUri.equals(writeVar.onPlayFromMediaId.get(i6))) {
                    break;
                } else {
                    i6++;
                }
            }
            this.RatingCompat = i6;
            this.onCustomAction = buildIterableSerializer.IconCompatParcelizer(i3) == 128;
            this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = buildIterableSerializer.AudioAttributesImplApi21Parcelizer(i3) == 64;
            this.MediaBrowserCompatCustomActionResultReceiver = findBoundType.write(this.IconCompatParcelizer.onPlayFromUri);
            this.onCommand = RemoteActionCompatParcelizer(i3, i5);
        }

        @Override // o.findBoundType.AudioAttributesImplApi21Parcelizer
        public final int RemoteActionCompatParcelizer() {
            return this.onCommand;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // o.findBoundType.AudioAttributesImplApi21Parcelizer
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public boolean RemoteActionCompatParcelizer(MediaBrowserCompatCustomActionResultReceiver mediaBrowserCompatCustomActionResultReceiver) {
            if (!this.read && !LaissezFaireSubTypeValidator.read(this.IconCompatParcelizer.onPlayFromUri, mediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer.onPlayFromUri)) {
                return false;
            }
            if (this.MediaBrowserCompatMediaItem.onSetShuffleMode) {
                return true;
            }
            return this.onCustomAction == mediaBrowserCompatCustomActionResultReceiver.onCustomAction && this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver == mediaBrowserCompatCustomActionResultReceiver.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        }

        private int RemoteActionCompatParcelizer(int i, int i2) {
            if ((this.IconCompatParcelizer.onPrepare & 16384) != 0 || !buildIterableSerializer.read(i, this.MediaBrowserCompatMediaItem.onSkipToPrevious)) {
                return 0;
            }
            if (this.AudioAttributesImplApi26Parcelizer || this.MediaBrowserCompatMediaItem.setSessionImpl) {
                return (!buildIterableSerializer.read(i, false) || !this.MediaBrowserCompatSearchResultReceiver || !this.AudioAttributesImplApi26Parcelizer || this.IconCompatParcelizer.read == -1 || this.MediaBrowserCompatMediaItem.IconCompatParcelizer || this.MediaBrowserCompatMediaItem.AudioAttributesCompatParcelizer || (i & i2) == 0) ? 1 : 2;
            }
            return 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static int AudioAttributesCompatParcelizer(MediaBrowserCompatCustomActionResultReceiver mediaBrowserCompatCustomActionResultReceiver, MediaBrowserCompatCustomActionResultReceiver mediaBrowserCompatCustomActionResultReceiver2) {
            checkNonNegative checknonnegativeIconCompatParcelizer = checkNonNegative.write().IconCompatParcelizer(mediaBrowserCompatCustomActionResultReceiver.MediaMetadataCompat, mediaBrowserCompatCustomActionResultReceiver2.MediaMetadataCompat).AudioAttributesCompatParcelizer(mediaBrowserCompatCustomActionResultReceiver.handleMediaPlayPauseIfPendingOnHandler, mediaBrowserCompatCustomActionResultReceiver2.handleMediaPlayPauseIfPendingOnHandler).IconCompatParcelizer(mediaBrowserCompatCustomActionResultReceiver.AudioAttributesImplApi21Parcelizer, mediaBrowserCompatCustomActionResultReceiver2.AudioAttributesImplApi21Parcelizer).IconCompatParcelizer(mediaBrowserCompatCustomActionResultReceiver.AudioAttributesImplBaseParcelizer, mediaBrowserCompatCustomActionResultReceiver2.AudioAttributesImplBaseParcelizer).IconCompatParcelizer(mediaBrowserCompatCustomActionResultReceiver.AudioAttributesImplApi26Parcelizer, mediaBrowserCompatCustomActionResultReceiver2.AudioAttributesImplApi26Parcelizer).IconCompatParcelizer(mediaBrowserCompatCustomActionResultReceiver.MediaBrowserCompatSearchResultReceiver, mediaBrowserCompatCustomActionResultReceiver2.MediaBrowserCompatSearchResultReceiver);
            int i = mediaBrowserCompatCustomActionResultReceiver.RatingCompat;
            int i2 = mediaBrowserCompatCustomActionResultReceiver2.RatingCompat;
            checkNonNegative checknonnegativeIconCompatParcelizer2 = checknonnegativeIconCompatParcelizer.AudioAttributesCompatParcelizer(Integer.valueOf(i), Integer.valueOf(i2), parseTruns.IconCompatParcelizer().AudioAttributesCompatParcelizer()).IconCompatParcelizer(mediaBrowserCompatCustomActionResultReceiver.onCustomAction, mediaBrowserCompatCustomActionResultReceiver2.onCustomAction).IconCompatParcelizer(mediaBrowserCompatCustomActionResultReceiver.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, mediaBrowserCompatCustomActionResultReceiver2.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver);
            if (mediaBrowserCompatCustomActionResultReceiver.onCustomAction && mediaBrowserCompatCustomActionResultReceiver.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) {
                checknonnegativeIconCompatParcelizer2 = checknonnegativeIconCompatParcelizer2.AudioAttributesCompatParcelizer(mediaBrowserCompatCustomActionResultReceiver.MediaBrowserCompatCustomActionResultReceiver, mediaBrowserCompatCustomActionResultReceiver2.MediaBrowserCompatCustomActionResultReceiver);
            }
            return checknonnegativeIconCompatParcelizer2.read();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static int write(MediaBrowserCompatCustomActionResultReceiver mediaBrowserCompatCustomActionResultReceiver, MediaBrowserCompatCustomActionResultReceiver mediaBrowserCompatCustomActionResultReceiver2) {
            parseTruns parsetrunsAudioAttributesCompatParcelizer = (mediaBrowserCompatCustomActionResultReceiver.AudioAttributesImplApi26Parcelizer && mediaBrowserCompatCustomActionResultReceiver.MediaMetadataCompat) ? findBoundType.read : findBoundType.read.AudioAttributesCompatParcelizer();
            checkNonNegative checknonnegativeWrite = checkNonNegative.write();
            if (mediaBrowserCompatCustomActionResultReceiver.MediaBrowserCompatMediaItem.AudioAttributesCompatParcelizer) {
                checknonnegativeWrite = checknonnegativeWrite.AudioAttributesCompatParcelizer(Integer.valueOf(mediaBrowserCompatCustomActionResultReceiver.MediaBrowserCompatItemReceiver), Integer.valueOf(mediaBrowserCompatCustomActionResultReceiver2.MediaBrowserCompatItemReceiver), findBoundType.read.AudioAttributesCompatParcelizer());
            }
            return checknonnegativeWrite.AudioAttributesCompatParcelizer(Integer.valueOf(mediaBrowserCompatCustomActionResultReceiver.MediaDescriptionCompat), Integer.valueOf(mediaBrowserCompatCustomActionResultReceiver2.MediaDescriptionCompat), parsetrunsAudioAttributesCompatParcelizer).AudioAttributesCompatParcelizer(Integer.valueOf(mediaBrowserCompatCustomActionResultReceiver.MediaBrowserCompatItemReceiver), Integer.valueOf(mediaBrowserCompatCustomActionResultReceiver2.MediaBrowserCompatItemReceiver), parsetrunsAudioAttributesCompatParcelizer).read();
        }

        public static int write(List<MediaBrowserCompatCustomActionResultReceiver> list, List<MediaBrowserCompatCustomActionResultReceiver> list2) {
            return checkNonNegative.write().AudioAttributesCompatParcelizer((MediaBrowserCompatCustomActionResultReceiver) Collections.max(list, new Comparator() { // from class: o._mapType
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return findBoundType.MediaBrowserCompatCustomActionResultReceiver.AudioAttributesCompatParcelizer((findBoundType.MediaBrowserCompatCustomActionResultReceiver) obj, (findBoundType.MediaBrowserCompatCustomActionResultReceiver) obj2);
                }
            }), (MediaBrowserCompatCustomActionResultReceiver) Collections.max(list2, new Comparator() { // from class: o._mapType
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return findBoundType.MediaBrowserCompatCustomActionResultReceiver.AudioAttributesCompatParcelizer((findBoundType.MediaBrowserCompatCustomActionResultReceiver) obj, (findBoundType.MediaBrowserCompatCustomActionResultReceiver) obj2);
                }
            }), new Comparator() { // from class: o._mapType
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return findBoundType.MediaBrowserCompatCustomActionResultReceiver.AudioAttributesCompatParcelizer((findBoundType.MediaBrowserCompatCustomActionResultReceiver) obj, (findBoundType.MediaBrowserCompatCustomActionResultReceiver) obj2);
                }
            }).AudioAttributesCompatParcelizer(list.size(), list2.size()).AudioAttributesCompatParcelizer((MediaBrowserCompatCustomActionResultReceiver) Collections.max(list, new Comparator() { // from class: o._collectionType
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return findBoundType.MediaBrowserCompatCustomActionResultReceiver.write((findBoundType.MediaBrowserCompatCustomActionResultReceiver) obj, (findBoundType.MediaBrowserCompatCustomActionResultReceiver) obj2);
                }
            }), (MediaBrowserCompatCustomActionResultReceiver) Collections.max(list2, new Comparator() { // from class: o._collectionType
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return findBoundType.MediaBrowserCompatCustomActionResultReceiver.write((findBoundType.MediaBrowserCompatCustomActionResultReceiver) obj, (findBoundType.MediaBrowserCompatCustomActionResultReceiver) obj2);
                }
            }), new Comparator() { // from class: o._collectionType
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return findBoundType.MediaBrowserCompatCustomActionResultReceiver.write((findBoundType.MediaBrowserCompatCustomActionResultReceiver) obj, (findBoundType.MediaBrowserCompatCustomActionResultReceiver) obj2);
                }
            }).read();
        }
    }

    static final class RemoteActionCompatParcelizer extends AudioAttributesImplApi21Parcelizer<RemoteActionCompatParcelizer> implements Comparable<RemoteActionCompatParcelizer> {
        private final boolean AudioAttributesImplApi21Parcelizer;
        private final boolean AudioAttributesImplApi26Parcelizer;
        private final int AudioAttributesImplBaseParcelizer;
        private final boolean MediaBrowserCompatCustomActionResultReceiver;
        private final int MediaBrowserCompatItemReceiver;
        private final boolean MediaBrowserCompatMediaItem;
        private final String MediaBrowserCompatSearchResultReceiver;
        private final int MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        private final write MediaDescriptionCompat;
        private final int MediaMetadataCompat;
        private final int RatingCompat;
        private final int handleMediaPlayPauseIfPendingOnHandler;
        private final int onAddQueueItem;
        private final int onCommand;
        private final int onCustomAction;
        private final int onMediaButtonEvent;
        private final boolean onPause;
        private final boolean onPlayFromMediaId;
        private final boolean read;

        public static initExtraTracks<RemoteActionCompatParcelizer> AudioAttributesCompatParcelizer(int i, setName setname, write writeVar, int[] iArr, boolean z, parseTraks<C0170format> parsetraks, int i2) {
            initExtraTracks.IconCompatParcelizer iconCompatParcelizerMediaBrowserCompatCustomActionResultReceiver = initExtraTracks.MediaBrowserCompatCustomActionResultReceiver();
            for (int i3 = 0; i3 < setname.write; i3++) {
                iconCompatParcelizerMediaBrowserCompatCustomActionResultReceiver.read(new RemoteActionCompatParcelizer(i, setname, i3, writeVar, iArr[i3], z, parsetraks, i2));
            }
            return iconCompatParcelizerMediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer();
        }

        private RemoteActionCompatParcelizer(int i, setName setname, int i2, write writeVar, int i3, boolean z, parseTraks<C0170format> parsetraks, int i4) {
            int i5;
            int iWrite;
            int iWrite2;
            super(i, setname, i2);
            this.MediaDescriptionCompat = writeVar;
            int i6 = writeVar.onRewind ? 24 : 16;
            this.read = writeVar.onSeekTo && (i4 & i6) != 0;
            this.MediaBrowserCompatSearchResultReceiver = findBoundType.AudioAttributesCompatParcelizer(this.IconCompatParcelizer.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver);
            this.MediaBrowserCompatMediaItem = buildIterableSerializer.read(i3, false);
            int i7 = 0;
            while (true) {
                i5 = Integer.MAX_VALUE;
                if (i7 >= writeVar.handleMediaPlayPauseIfPendingOnHandler.size()) {
                    iWrite = 0;
                    i7 = Integer.MAX_VALUE;
                    break;
                } else {
                    iWrite = findBoundType.write(this.IconCompatParcelizer, writeVar.handleMediaPlayPauseIfPendingOnHandler.get(i7), false);
                    if (iWrite > 0) {
                        break;
                    } else {
                        i7++;
                    }
                }
            }
            this.onAddQueueItem = i7;
            this.onCustomAction = iWrite;
            this.onCommand = findBoundType.IconCompatParcelizer(this.IconCompatParcelizer.onPrepare, writeVar.onPlay);
            this.AudioAttributesImplApi26Parcelizer = this.IconCompatParcelizer.onPrepare == 0 || (this.IconCompatParcelizer.onPrepare & 1) != 0;
            this.AudioAttributesImplApi21Parcelizer = (this.IconCompatParcelizer.onRewind & 1) != 0;
            this.MediaBrowserCompatItemReceiver = this.IconCompatParcelizer.AudioAttributesCompatParcelizer;
            this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = this.IconCompatParcelizer.onPrepareFromUri;
            this.AudioAttributesImplBaseParcelizer = this.IconCompatParcelizer.read;
            this.MediaBrowserCompatCustomActionResultReceiver = (this.IconCompatParcelizer.read == -1 || this.IconCompatParcelizer.read <= writeVar.AudioAttributesImplApi26Parcelizer) && (this.IconCompatParcelizer.AudioAttributesCompatParcelizer == -1 || this.IconCompatParcelizer.AudioAttributesCompatParcelizer <= writeVar.MediaBrowserCompatItemReceiver) && parsetraks.apply(this.IconCompatParcelizer);
            String[] strArrAudioAttributesCompatParcelizer = LaissezFaireSubTypeValidator.AudioAttributesCompatParcelizer();
            int i8 = 0;
            while (true) {
                if (i8 >= strArrAudioAttributesCompatParcelizer.length) {
                    iWrite2 = 0;
                    i8 = Integer.MAX_VALUE;
                    break;
                } else {
                    iWrite2 = findBoundType.write(this.IconCompatParcelizer, strArrAudioAttributesCompatParcelizer[i8], false);
                    if (iWrite2 > 0) {
                        break;
                    } else {
                        i8++;
                    }
                }
            }
            this.RatingCompat = i8;
            this.MediaMetadataCompat = iWrite2;
            int i9 = 0;
            while (true) {
                if (i9 < writeVar.onCustomAction.size()) {
                    if (this.IconCompatParcelizer.onPlayFromUri != null && this.IconCompatParcelizer.onPlayFromUri.equals(writeVar.onCustomAction.get(i9))) {
                        i5 = i9;
                        break;
                    }
                    i9++;
                } else {
                    break;
                }
            }
            this.handleMediaPlayPauseIfPendingOnHandler = i5;
            this.onPause = buildIterableSerializer.IconCompatParcelizer(i3) == 128;
            this.onPlayFromMediaId = buildIterableSerializer.AudioAttributesImplApi21Parcelizer(i3) == 64;
            this.onMediaButtonEvent = read(i3, z, i6);
        }

        @Override // o.findBoundType.AudioAttributesImplApi21Parcelizer
        public final int RemoteActionCompatParcelizer() {
            return this.onMediaButtonEvent;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // o.findBoundType.AudioAttributesImplApi21Parcelizer
        public boolean RemoteActionCompatParcelizer(RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
            if (!this.MediaDescriptionCompat.onRemoveQueueItemAt && (this.IconCompatParcelizer.AudioAttributesCompatParcelizer == -1 || this.IconCompatParcelizer.AudioAttributesCompatParcelizer != remoteActionCompatParcelizer.IconCompatParcelizer.AudioAttributesCompatParcelizer)) {
                return false;
            }
            if (!this.read && (this.IconCompatParcelizer.onPlayFromUri == null || !TextUtils.equals(this.IconCompatParcelizer.onPlayFromUri, remoteActionCompatParcelizer.IconCompatParcelizer.onPlayFromUri))) {
                return false;
            }
            if (!this.MediaDescriptionCompat.onPrepareFromUri && (this.IconCompatParcelizer.onPrepareFromUri == -1 || this.IconCompatParcelizer.onPrepareFromUri != remoteActionCompatParcelizer.IconCompatParcelizer.onPrepareFromUri)) {
                return false;
            }
            if (this.MediaDescriptionCompat.onRemoveQueueItem) {
                return true;
            }
            return this.onPause == remoteActionCompatParcelizer.onPause && this.onPlayFromMediaId == remoteActionCompatParcelizer.onPlayFromMediaId;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public int compareTo(RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
            parseTruns parsetrunsAudioAttributesCompatParcelizer = (this.MediaBrowserCompatCustomActionResultReceiver && this.MediaBrowserCompatMediaItem) ? findBoundType.read : findBoundType.read.AudioAttributesCompatParcelizer();
            checkNonNegative checknonnegativeAudioAttributesCompatParcelizer = checkNonNegative.write().IconCompatParcelizer(this.MediaBrowserCompatMediaItem, remoteActionCompatParcelizer.MediaBrowserCompatMediaItem).AudioAttributesCompatParcelizer(Integer.valueOf(this.onAddQueueItem), Integer.valueOf(remoteActionCompatParcelizer.onAddQueueItem), parseTruns.IconCompatParcelizer().AudioAttributesCompatParcelizer()).AudioAttributesCompatParcelizer(this.onCustomAction, remoteActionCompatParcelizer.onCustomAction).AudioAttributesCompatParcelizer(this.onCommand, remoteActionCompatParcelizer.onCommand).IconCompatParcelizer(this.AudioAttributesImplApi21Parcelizer, remoteActionCompatParcelizer.AudioAttributesImplApi21Parcelizer).IconCompatParcelizer(this.AudioAttributesImplApi26Parcelizer, remoteActionCompatParcelizer.AudioAttributesImplApi26Parcelizer).AudioAttributesCompatParcelizer(Integer.valueOf(this.RatingCompat), Integer.valueOf(remoteActionCompatParcelizer.RatingCompat), parseTruns.IconCompatParcelizer().AudioAttributesCompatParcelizer()).AudioAttributesCompatParcelizer(this.MediaMetadataCompat, remoteActionCompatParcelizer.MediaMetadataCompat).IconCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver, remoteActionCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver).AudioAttributesCompatParcelizer(Integer.valueOf(this.handleMediaPlayPauseIfPendingOnHandler), Integer.valueOf(remoteActionCompatParcelizer.handleMediaPlayPauseIfPendingOnHandler), parseTruns.IconCompatParcelizer().AudioAttributesCompatParcelizer());
            if (this.MediaDescriptionCompat.AudioAttributesCompatParcelizer) {
                checknonnegativeAudioAttributesCompatParcelizer = checknonnegativeAudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(Integer.valueOf(this.AudioAttributesImplBaseParcelizer), Integer.valueOf(remoteActionCompatParcelizer.AudioAttributesImplBaseParcelizer), findBoundType.read.AudioAttributesCompatParcelizer());
            }
            checkNonNegative checknonnegativeAudioAttributesCompatParcelizer2 = checknonnegativeAudioAttributesCompatParcelizer.IconCompatParcelizer(this.onPause, remoteActionCompatParcelizer.onPause).IconCompatParcelizer(this.onPlayFromMediaId, remoteActionCompatParcelizer.onPlayFromMediaId).AudioAttributesCompatParcelizer(Integer.valueOf(this.MediaBrowserCompatItemReceiver), Integer.valueOf(remoteActionCompatParcelizer.MediaBrowserCompatItemReceiver), parsetrunsAudioAttributesCompatParcelizer).AudioAttributesCompatParcelizer(Integer.valueOf(this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver), Integer.valueOf(remoteActionCompatParcelizer.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver), parsetrunsAudioAttributesCompatParcelizer);
            if (LaissezFaireSubTypeValidator.read(this.MediaBrowserCompatSearchResultReceiver, remoteActionCompatParcelizer.MediaBrowserCompatSearchResultReceiver)) {
                checknonnegativeAudioAttributesCompatParcelizer2 = checknonnegativeAudioAttributesCompatParcelizer2.AudioAttributesCompatParcelizer(Integer.valueOf(this.AudioAttributesImplBaseParcelizer), Integer.valueOf(remoteActionCompatParcelizer.AudioAttributesImplBaseParcelizer), parsetrunsAudioAttributesCompatParcelizer);
            }
            return checknonnegativeAudioAttributesCompatParcelizer2.read();
        }

        private int read(int i, boolean z, int i2) {
            if (!buildIterableSerializer.read(i, this.MediaDescriptionCompat.onSkipToPrevious)) {
                return 0;
            }
            if (!this.MediaBrowserCompatCustomActionResultReceiver && !this.MediaDescriptionCompat.onSkipToQueueItem) {
                return 0;
            }
            if (this.MediaDescriptionCompat.write.read == 2 && !findBoundType.IconCompatParcelizer(this.MediaDescriptionCompat, i, this.IconCompatParcelizer)) {
                return 0;
            }
            if (!buildIterableSerializer.read(i, false) || !this.MediaBrowserCompatCustomActionResultReceiver || this.IconCompatParcelizer.read == -1 || this.MediaDescriptionCompat.IconCompatParcelizer || this.MediaDescriptionCompat.AudioAttributesCompatParcelizer) {
                return 1;
            }
            return ((!this.MediaDescriptionCompat.onSetCaptioningEnabled && z) || this.MediaDescriptionCompat.write.read == 2 || (i & i2) == 0) ? 1 : 2;
        }

        public static int write(List<RemoteActionCompatParcelizer> list, List<RemoteActionCompatParcelizer> list2) {
            return ((RemoteActionCompatParcelizer) Collections.max(list)).compareTo((RemoteActionCompatParcelizer) Collections.max(list2));
        }
    }

    static final class AudioAttributesImplApi26Parcelizer extends AudioAttributesImplApi21Parcelizer<AudioAttributesImplApi26Parcelizer> implements Comparable<AudioAttributesImplApi26Parcelizer> {
        private final boolean AudioAttributesImplApi21Parcelizer;
        private final int AudioAttributesImplApi26Parcelizer;
        private final int AudioAttributesImplBaseParcelizer;
        private final boolean MediaBrowserCompatCustomActionResultReceiver;
        private final boolean MediaBrowserCompatItemReceiver;
        private final int MediaBrowserCompatMediaItem;
        private final int MediaBrowserCompatSearchResultReceiver;
        private final int RatingCompat;
        private final boolean read;

        @Override // o.findBoundType.AudioAttributesImplApi21Parcelizer
        public final /* synthetic */ boolean RemoteActionCompatParcelizer(AudioAttributesImplApi21Parcelizer audioAttributesImplApi21Parcelizer) {
            return false;
        }

        public static initExtraTracks<AudioAttributesImplApi26Parcelizer> read(int i, setName setname, write writeVar, int[] iArr, String str) {
            initExtraTracks.IconCompatParcelizer iconCompatParcelizerMediaBrowserCompatCustomActionResultReceiver = initExtraTracks.MediaBrowserCompatCustomActionResultReceiver();
            for (int i2 = 0; i2 < setname.write; i2++) {
                iconCompatParcelizerMediaBrowserCompatCustomActionResultReceiver.read(new AudioAttributesImplApi26Parcelizer(i, setname, i2, writeVar, iArr[i2], str));
            }
            return iconCompatParcelizerMediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer();
        }

        private AudioAttributesImplApi26Parcelizer(int i, setName setname, int i2, write writeVar, int i3, String str) {
            initExtraTracks<String> initextratracks;
            int iWrite;
            super(i, setname, i2);
            int i4 = 0;
            this.MediaBrowserCompatItemReceiver = buildIterableSerializer.read(i3, false);
            int i5 = this.IconCompatParcelizer.onRewind & (~writeVar.MediaBrowserCompatCustomActionResultReceiver);
            this.MediaBrowserCompatCustomActionResultReceiver = (i5 & 1) != 0;
            this.AudioAttributesImplApi21Parcelizer = (i5 & 2) != 0;
            if (writeVar.onFastForward.isEmpty()) {
                initextratracks = initExtraTracks.read("");
            } else {
                initextratracks = writeVar.onFastForward;
            }
            int i6 = 0;
            while (true) {
                if (i6 >= initextratracks.size()) {
                    i6 = Integer.MAX_VALUE;
                    iWrite = 0;
                    break;
                } else {
                    iWrite = findBoundType.write(this.IconCompatParcelizer, initextratracks.get(i6), writeVar.onPlayFromSearch);
                    if (iWrite > 0) {
                        break;
                    } else {
                        i6++;
                    }
                }
            }
            this.AudioAttributesImplApi26Parcelizer = i6;
            this.AudioAttributesImplBaseParcelizer = iWrite;
            int iIconCompatParcelizer = findBoundType.IconCompatParcelizer(this.IconCompatParcelizer.onPrepare, writeVar.onPause);
            this.MediaBrowserCompatSearchResultReceiver = iIconCompatParcelizer;
            this.read = (this.IconCompatParcelizer.onPrepare & 1088) != 0;
            int iWrite2 = findBoundType.write(this.IconCompatParcelizer, str, findBoundType.AudioAttributesCompatParcelizer(str) == null);
            this.MediaBrowserCompatMediaItem = iWrite2;
            boolean z = iWrite > 0 || (writeVar.onFastForward.isEmpty() && iIconCompatParcelizer > 0) || this.MediaBrowserCompatCustomActionResultReceiver || (this.AudioAttributesImplApi21Parcelizer && iWrite2 > 0);
            if (buildIterableSerializer.read(i3, writeVar.onSkipToPrevious) && z) {
                i4 = 1;
            }
            this.RatingCompat = i4;
        }

        @Override // o.findBoundType.AudioAttributesImplApi21Parcelizer
        public final int RemoteActionCompatParcelizer() {
            return this.RatingCompat;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public int compareTo(AudioAttributesImplApi26Parcelizer audioAttributesImplApi26Parcelizer) {
            checkNonNegative checknonnegativeAudioAttributesCompatParcelizer = checkNonNegative.write().IconCompatParcelizer(this.MediaBrowserCompatItemReceiver, audioAttributesImplApi26Parcelizer.MediaBrowserCompatItemReceiver).AudioAttributesCompatParcelizer(Integer.valueOf(this.AudioAttributesImplApi26Parcelizer), Integer.valueOf(audioAttributesImplApi26Parcelizer.AudioAttributesImplApi26Parcelizer), parseTruns.IconCompatParcelizer().AudioAttributesCompatParcelizer()).AudioAttributesCompatParcelizer(this.AudioAttributesImplBaseParcelizer, audioAttributesImplApi26Parcelizer.AudioAttributesImplBaseParcelizer).AudioAttributesCompatParcelizer(this.MediaBrowserCompatSearchResultReceiver, audioAttributesImplApi26Parcelizer.MediaBrowserCompatSearchResultReceiver).IconCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver, audioAttributesImplApi26Parcelizer.MediaBrowserCompatCustomActionResultReceiver).AudioAttributesCompatParcelizer(Boolean.valueOf(this.AudioAttributesImplApi21Parcelizer), Boolean.valueOf(audioAttributesImplApi26Parcelizer.AudioAttributesImplApi21Parcelizer), this.AudioAttributesImplBaseParcelizer == 0 ? parseTruns.IconCompatParcelizer() : parseTruns.IconCompatParcelizer().AudioAttributesCompatParcelizer()).AudioAttributesCompatParcelizer(this.MediaBrowserCompatMediaItem, audioAttributesImplApi26Parcelizer.MediaBrowserCompatMediaItem);
            if (this.MediaBrowserCompatSearchResultReceiver == 0) {
                checknonnegativeAudioAttributesCompatParcelizer = checknonnegativeAudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(this.read, audioAttributesImplApi26Parcelizer.read);
            }
            return checknonnegativeAudioAttributesCompatParcelizer.read();
        }

        public static int IconCompatParcelizer(List<AudioAttributesImplApi26Parcelizer> list, List<AudioAttributesImplApi26Parcelizer> list2) {
            return list.get(0).compareTo(list2.get(0));
        }
    }

    static final class IconCompatParcelizer extends AudioAttributesImplApi21Parcelizer<IconCompatParcelizer> implements Comparable<IconCompatParcelizer> {
        private final int AudioAttributesImplApi21Parcelizer;
        private final int read;

        @Override // o.findBoundType.AudioAttributesImplApi21Parcelizer
        public final /* synthetic */ boolean RemoteActionCompatParcelizer(AudioAttributesImplApi21Parcelizer audioAttributesImplApi21Parcelizer) {
            return false;
        }

        public static initExtraTracks<IconCompatParcelizer> write(int i, setName setname, write writeVar, int[] iArr) {
            initExtraTracks.IconCompatParcelizer iconCompatParcelizerMediaBrowserCompatCustomActionResultReceiver = initExtraTracks.MediaBrowserCompatCustomActionResultReceiver();
            for (int i2 = 0; i2 < setname.write; i2++) {
                iconCompatParcelizerMediaBrowserCompatCustomActionResultReceiver.read(new IconCompatParcelizer(i, setname, i2, writeVar, iArr[i2]));
            }
            return iconCompatParcelizerMediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer();
        }

        private IconCompatParcelizer(int i, setName setname, int i2, write writeVar, int i3) {
            super(i, setname, i2);
            this.AudioAttributesImplApi21Parcelizer = buildIterableSerializer.read(i3, writeVar.onSkipToPrevious) ? 1 : 0;
            this.read = this.IconCompatParcelizer.AudioAttributesCompatParcelizer();
        }

        @Override // o.findBoundType.AudioAttributesImplApi21Parcelizer
        public final int RemoteActionCompatParcelizer() {
            return this.AudioAttributesImplApi21Parcelizer;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public int compareTo(IconCompatParcelizer iconCompatParcelizer) {
            return Integer.compare(this.read, iconCompatParcelizer.read);
        }

        public static int IconCompatParcelizer(List<IconCompatParcelizer> list, List<IconCompatParcelizer> list2) {
            return list.get(0).compareTo(list2.get(0));
        }
    }

    static final class read implements Comparable<read> {
        private final boolean RemoteActionCompatParcelizer;
        private final boolean read;

        public read(C0170format c0170format, int i) {
            this.RemoteActionCompatParcelizer = (c0170format.onRewind & 1) != 0;
            this.read = buildIterableSerializer.read(i, false);
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public final int compareTo(read readVar) {
            return checkNonNegative.write().IconCompatParcelizer(this.read, readVar.read).IconCompatParcelizer(this.RemoteActionCompatParcelizer, readVar.RemoteActionCompatParcelizer).read();
        }
    }

    static class AudioAttributesImplBaseParcelizer {
        private Handler AudioAttributesCompatParcelizer;
        private final Spatializer IconCompatParcelizer;
        private Spatializer.OnSpatializerStateChangedListener RemoteActionCompatParcelizer;
        private final boolean read;

        public static AudioAttributesImplBaseParcelizer AudioAttributesCompatParcelizer(Context context) {
            AudioManager audioManager = (AudioManager) context.getSystemService("audio");
            if (audioManager == null) {
                return null;
            }
            return new AudioAttributesImplBaseParcelizer(audioManager.getSpatializer());
        }

        private AudioAttributesImplBaseParcelizer(Spatializer spatializer) {
            this.IconCompatParcelizer = spatializer;
            this.read = spatializer.getImmersiveAudioLevel() != 0;
        }

        public final void AudioAttributesCompatParcelizer(final findBoundType findboundtype, Looper looper) {
            if (this.RemoteActionCompatParcelizer == null && this.AudioAttributesCompatParcelizer == null) {
                this.RemoteActionCompatParcelizer = new Spatializer.OnSpatializerStateChangedListener() { // from class: o.findBoundType.AudioAttributesImplBaseParcelizer.4
                    @Override // android.media.Spatializer.OnSpatializerStateChangedListener
                    public final void onSpatializerEnabledChanged(Spatializer spatializer, boolean z) {
                        findboundtype.AudioAttributesImplApi26Parcelizer();
                    }

                    @Override // android.media.Spatializer.OnSpatializerStateChangedListener
                    public final void onSpatializerAvailableChanged(Spatializer spatializer, boolean z) {
                        findboundtype.AudioAttributesImplApi26Parcelizer();
                    }
                };
                final Handler handler = new Handler(looper);
                this.AudioAttributesCompatParcelizer = handler;
                this.IconCompatParcelizer.addOnSpatializerStateChangedListener(new Executor() { // from class: o.TypeFactory
                    @Override // java.util.concurrent.Executor
                    public final void execute(Runnable runnable) {
                        handler.post(runnable);
                    }
                }, this.RemoteActionCompatParcelizer);
            }
        }

        public final boolean AudioAttributesCompatParcelizer() {
            return this.read;
        }

        public final boolean IconCompatParcelizer() {
            return this.IconCompatParcelizer.isAvailable();
        }

        public final boolean RemoteActionCompatParcelizer() {
            return this.IconCompatParcelizer.isEnabled();
        }

        public final boolean IconCompatParcelizer(JsonIntegerFormatVisitor jsonIntegerFormatVisitor, C0170format c0170format) {
            int iRemoteActionCompatParcelizer = LaissezFaireSubTypeValidator.RemoteActionCompatParcelizer((MimeTypes.AUDIO_E_AC3_JOC.equals(c0170format.onPlayFromUri) && c0170format.AudioAttributesCompatParcelizer == 16) ? 12 : c0170format.AudioAttributesCompatParcelizer);
            if (iRemoteActionCompatParcelizer == 0) {
                return false;
            }
            AudioFormat.Builder channelMask = new AudioFormat.Builder().setEncoding(2).setChannelMask(iRemoteActionCompatParcelizer);
            if (c0170format.onPrepareFromUri != -1) {
                channelMask.setSampleRate(c0170format.onPrepareFromUri);
            }
            return this.IconCompatParcelizer.canBeSpatialized(jsonIntegerFormatVisitor.RemoteActionCompatParcelizer().IconCompatParcelizer, channelMask.build());
        }

        public final void write() {
            Spatializer.OnSpatializerStateChangedListener onSpatializerStateChangedListener = this.RemoteActionCompatParcelizer;
            if (onSpatializerStateChangedListener == null || this.AudioAttributesCompatParcelizer == null) {
                return;
            }
            this.IconCompatParcelizer.removeOnSpatializerStateChangedListener(onSpatializerStateChangedListener);
            ((Handler) LaissezFaireSubTypeValidator.IconCompatParcelizer(this.AudioAttributesCompatParcelizer)).removeCallbacksAndMessages(null);
            this.AudioAttributesCompatParcelizer = null;
            this.RemoteActionCompatParcelizer = null;
        }
    }
}
