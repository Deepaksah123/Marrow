package kotlin;

import android.util.Pair;
import android.util.SparseArray;
import androidx.media3.common.DrmInitData;
import androidx.media3.extractor.metadata.emsg.EventMessage;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.extractor.mp4.Atom;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.google.android.exoplayer2.util.MimeTypes;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import kotlin.C0170format;
import kotlin.chainedTransformer;
import kotlin.isCollectionMapOrArray;
import kotlin.withTimeZone;

/* JADX INFO: loaded from: classes2.dex */
public final class NameTransformerChained implements findConstructor {
    private static final C0170format read;
    private static final byte[] write;
    private final AsPropertyTypeDeserializer AudioAttributesCompatParcelizer;
    private long AudioAttributesImplApi21Parcelizer;
    private int AudioAttributesImplApi26Parcelizer;
    private int AudioAttributesImplBaseParcelizer;
    private AsPropertyTypeDeserializer IconCompatParcelizer;
    private nonNullString[] MediaBrowserCompatCustomActionResultReceiver;
    private final List<C0170format> MediaBrowserCompatItemReceiver;
    private long MediaBrowserCompatMediaItem;
    private AudioAttributesCompatParcelizer MediaBrowserCompatSearchResultReceiver;
    private final _findEnumCaseInsensitive MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    private final ArrayDeque<chainedTransformer.RemoteActionCompatParcelizer> MediaDescriptionCompat;
    private nonNullString[] MediaMetadataCompat;
    private long RatingCompat;
    private final nonNullString RemoteActionCompatParcelizer;
    private final int handleMediaPlayPauseIfPendingOnHandler;
    private initExtraTracks<nullOrToString> onAddQueueItem;
    private findRawSuperTypes onCommand;
    private boolean onCustomAction;
    private int onFastForward;
    private int onMediaButtonEvent;
    private final AsPropertyTypeDeserializer onPause;
    private final AsPropertyTypeDeserializer onPlay;
    private final AsPropertyTypeDeserializer onPlayFromMediaId;
    private final ArrayDeque<IconCompatParcelizer> onPlayFromSearch;
    private int onPlayFromUri;
    private boolean onPrepare;
    private int onPrepareFromMediaId;
    private long onPrepareFromSearch;
    private final byte[] onPrepareFromUri;
    private int onRemoveQueueItem;
    private long onRemoveQueueItemAt;
    private final AsPropertyTypeDeserializer onRewind;
    private final ObjectBuffer onSeekTo;
    private final SparseArray<AudioAttributesCompatParcelizer> onSetRating;
    private final MinimalClassNameIdResolver onSetRepeatMode;
    private final withTimeZone.IconCompatParcelizer onSetShuffleMode;

    private static boolean AudioAttributesCompatParcelizer(int i) {
        return i == 1751411826 || i == 1835296868 || i == 1836476516 || i == 1936286840 || i == 1937011556 || i == 1937011827 || i == 1668576371 || i == 1937011555 || i == 1937011578 || i == 1937013298 || i == 1937007471 || i == 1668232756 || i == 1937011571 || i == 1952867444 || i == 1952868452 || i == 1953196132 || i == 1953654136 || i == 1953658222 || i == 1886614376 || i == 1935763834 || i == 1935763823 || i == 1936027235 || i == 1970628964 || i == 1935828848 || i == 1936158820 || i == 1701606260 || i == 1835362404 || i == 1701671783;
    }

    protected static ObjectBuffer RemoteActionCompatParcelizer(ObjectBuffer objectBuffer) {
        return objectBuffer;
    }

    private static boolean write(int i) {
        return i == 1836019574 || i == 1953653099 || i == 1835297121 || i == 1835626086 || i == 1937007212 || i == 1836019558 || i == 1953653094 || i == 1836475768 || i == 1701082227;
    }

    @Override // kotlin.findConstructor
    public final void RemoteActionCompatParcelizer() {
    }

    static {
        new getClassDescription() { // from class: o.transform
            @Override // kotlin.getClassDescription
            public final findConstructor[] RemoteActionCompatParcelizer() {
                return NameTransformerChained.read();
            }
        };
        write = new byte[]{-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
        read = new C0170format.RemoteActionCompatParcelizer().AudioAttributesImplApi26Parcelizer(MimeTypes.APPLICATION_EMSG).IconCompatParcelizer();
    }

    static /* synthetic */ findConstructor[] read() {
        return new findConstructor[]{new NameTransformerChained(withTimeZone.IconCompatParcelizer.AudioAttributesCompatParcelizer, 32)};
    }

    @Deprecated
    public NameTransformerChained() {
        this(withTimeZone.IconCompatParcelizer.AudioAttributesCompatParcelizer, 32, null, initExtraTracks.AudioAttributesImplApi26Parcelizer(), null);
    }

    public NameTransformerChained(withTimeZone.IconCompatParcelizer iconCompatParcelizer, int i) {
        this(iconCompatParcelizer, i, null, initExtraTracks.AudioAttributesImplApi26Parcelizer(), null);
    }

    public NameTransformerChained(withTimeZone.IconCompatParcelizer iconCompatParcelizer, int i, MinimalClassNameIdResolver minimalClassNameIdResolver, List<C0170format> list, nonNullString nonnullstring) {
        this.onSetShuffleMode = iconCompatParcelizer;
        this.handleMediaPlayPauseIfPendingOnHandler = i;
        this.onSetRepeatMode = minimalClassNameIdResolver;
        this.onSeekTo = null;
        this.MediaBrowserCompatItemReceiver = Collections.unmodifiableList(list);
        this.RemoteActionCompatParcelizer = nonnullstring;
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = new _findEnumCaseInsensitive();
        this.AudioAttributesCompatParcelizer = new AsPropertyTypeDeserializer(16);
        this.onPause = new AsPropertyTypeDeserializer(noTypeInfoBuilder.AudioAttributesCompatParcelizer);
        this.onPlayFromMediaId = new AsPropertyTypeDeserializer(5);
        this.onPlay = new AsPropertyTypeDeserializer();
        byte[] bArr = new byte[16];
        this.onPrepareFromUri = bArr;
        this.onRewind = new AsPropertyTypeDeserializer(bArr);
        this.MediaDescriptionCompat = new ArrayDeque<>();
        this.onPlayFromSearch = new ArrayDeque<>();
        this.onSetRating = new SparseArray<>();
        this.onAddQueueItem = initExtraTracks.AudioAttributesImplApi26Parcelizer();
        this.RatingCompat = C.TIME_UNSET;
        this.onPrepareFromSearch = C.TIME_UNSET;
        this.onRemoveQueueItemAt = C.TIME_UNSET;
        this.onCommand = findRawSuperTypes.IconCompatParcelizer;
        this.MediaMetadataCompat = new nonNullString[0];
        this.MediaBrowserCompatCustomActionResultReceiver = new nonNullString[0];
    }

    @Override // kotlin.findConstructor
    public final boolean read(closeOnFailAndThrowAsIOE closeonfailandthrowasioe) throws IOException {
        nullOrToString nullortostring = needsReflectionConfiguration.read(closeonfailandthrowasioe);
        this.onAddQueueItem = nullortostring != null ? initExtraTracks.read(nullortostring) : initExtraTracks.AudioAttributesImplApi26Parcelizer();
        return nullortostring == null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.findConstructor
    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: merged with bridge method [inline-methods] */
    public initExtraTracks<nullOrToString> AudioAttributesCompatParcelizer() {
        return this.onAddQueueItem;
    }

    @Override // kotlin.findConstructor
    public final void read(findRawSuperTypes findrawsupertypes) {
        this.onCommand = (this.handleMediaPlayPauseIfPendingOnHandler & 32) == 0 ? new _appendNativeIds(findrawsupertypes, this.onSetShuffleMode) : findrawsupertypes;
        IconCompatParcelizer();
        AudioAttributesImplApi26Parcelizer();
        ObjectBuffer objectBuffer = this.onSeekTo;
        if (objectBuffer != null) {
            this.onSetRating.put(0, new AudioAttributesCompatParcelizer(findrawsupertypes.IconCompatParcelizer(0, objectBuffer.AudioAttributesImplApi26Parcelizer), new initialCapacity(this.onSeekTo, new long[0], new int[0], 0, new long[0], new int[0], 0L), new NameTransformer(0, 0, 0, 0)));
            this.onCommand.RemoteActionCompatParcelizer();
        }
    }

    @Override // kotlin.findConstructor
    public final void write(long j, long j2) {
        int size = this.onSetRating.size();
        for (int i = 0; i < size; i++) {
            this.onSetRating.valueAt(i).MediaBrowserCompatItemReceiver();
        }
        this.onPlayFromSearch.clear();
        this.onFastForward = 0;
        this.onPrepareFromSearch = j2;
        this.MediaDescriptionCompat.clear();
        IconCompatParcelizer();
    }

    @Override // kotlin.findConstructor
    public final int RemoteActionCompatParcelizer(closeOnFailAndThrowAsIOE closeonfailandthrowasioe, isJacksonStdImpl isjacksonstdimpl) throws IOException {
        while (true) {
            int i = this.onMediaButtonEvent;
            if (i != 0) {
                if (i == 1) {
                    RemoteActionCompatParcelizer(closeonfailandthrowasioe);
                } else if (i == 2) {
                    IconCompatParcelizer(closeonfailandthrowasioe);
                } else if (write(closeonfailandthrowasioe)) {
                    return 0;
                }
            } else if (!AudioAttributesCompatParcelizer(closeonfailandthrowasioe)) {
                return -1;
            }
        }
    }

    private void IconCompatParcelizer() {
        this.onMediaButtonEvent = 0;
        this.AudioAttributesImplBaseParcelizer = 0;
    }

    private boolean AudioAttributesCompatParcelizer(closeOnFailAndThrowAsIOE closeonfailandthrowasioe) throws IOException {
        if (this.AudioAttributesImplBaseParcelizer == 0) {
            if (!closeonfailandthrowasioe.AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(), 0, 8, true)) {
                return false;
            }
            this.AudioAttributesImplBaseParcelizer = 8;
            this.AudioAttributesCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver(0);
            this.AudioAttributesImplApi21Parcelizer = this.AudioAttributesCompatParcelizer.onMediaButtonEvent();
            this.AudioAttributesImplApi26Parcelizer = this.AudioAttributesCompatParcelizer.MediaBrowserCompatItemReceiver();
        }
        long j = this.AudioAttributesImplApi21Parcelizer;
        if (j == 1) {
            closeonfailandthrowasioe.IconCompatParcelizer(this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(), 8, 8);
            this.AudioAttributesImplBaseParcelizer += 8;
            this.AudioAttributesImplApi21Parcelizer = this.AudioAttributesCompatParcelizer.onPlayFromUri();
        } else if (j == 0) {
            long j2 = closeonfailandthrowasioe.read();
            if (j2 == -1 && !this.MediaDescriptionCompat.isEmpty()) {
                j2 = this.MediaDescriptionCompat.peek().IconCompatParcelizer;
            }
            if (j2 != -1) {
                this.AudioAttributesImplApi21Parcelizer = (j2 - closeonfailandthrowasioe.IconCompatParcelizer()) + ((long) this.AudioAttributesImplBaseParcelizer);
            }
        }
        if (this.AudioAttributesImplApi21Parcelizer < this.AudioAttributesImplBaseParcelizer) {
            throw SchemaAware.RemoteActionCompatParcelizer("Atom size less than header length (unsupported).");
        }
        long jIconCompatParcelizer = closeonfailandthrowasioe.IconCompatParcelizer() - ((long) this.AudioAttributesImplBaseParcelizer);
        int i = this.AudioAttributesImplApi26Parcelizer;
        if ((i == 1836019558 || i == 1835295092) && !this.onCustomAction) {
            this.onCommand.read(new isCollectionMapOrArray.write(this.RatingCompat, jIconCompatParcelizer));
            this.onCustomAction = true;
        }
        if (this.AudioAttributesImplApi26Parcelizer == 1836019558) {
            int size = this.onSetRating.size();
            for (int i2 = 0; i2 < size; i2++) {
                completeAndClearBuffer completeandclearbuffer = this.onSetRating.valueAt(i2).AudioAttributesImplApi26Parcelizer;
                completeandclearbuffer.IconCompatParcelizer = jIconCompatParcelizer;
                completeandclearbuffer.AudioAttributesCompatParcelizer = jIconCompatParcelizer;
                completeandclearbuffer.read = jIconCompatParcelizer;
            }
        }
        int i3 = this.AudioAttributesImplApi26Parcelizer;
        if (i3 == 1835295092) {
            this.MediaBrowserCompatSearchResultReceiver = null;
            this.MediaBrowserCompatMediaItem = jIconCompatParcelizer + this.AudioAttributesImplApi21Parcelizer;
            this.onMediaButtonEvent = 2;
            return true;
        }
        if (write(i3)) {
            long jIconCompatParcelizer2 = (closeonfailandthrowasioe.IconCompatParcelizer() + this.AudioAttributesImplApi21Parcelizer) - 8;
            this.MediaDescriptionCompat.push(new chainedTransformer.RemoteActionCompatParcelizer(this.AudioAttributesImplApi26Parcelizer, jIconCompatParcelizer2));
            if (this.AudioAttributesImplApi21Parcelizer == this.AudioAttributesImplBaseParcelizer) {
                AudioAttributesCompatParcelizer(jIconCompatParcelizer2);
            } else {
                IconCompatParcelizer();
            }
        } else if (AudioAttributesCompatParcelizer(this.AudioAttributesImplApi26Parcelizer)) {
            if (this.AudioAttributesImplBaseParcelizer != 8) {
                throw SchemaAware.RemoteActionCompatParcelizer("Leaf atom defines extended atom size (unsupported).");
            }
            if (this.AudioAttributesImplApi21Parcelizer > 2147483647L) {
                throw SchemaAware.RemoteActionCompatParcelizer("Leaf atom with length > 2147483647 (unsupported).");
            }
            AsPropertyTypeDeserializer asPropertyTypeDeserializer = new AsPropertyTypeDeserializer((int) this.AudioAttributesImplApi21Parcelizer);
            System.arraycopy(this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(), 0, asPropertyTypeDeserializer.RemoteActionCompatParcelizer(), 0, 8);
            this.IconCompatParcelizer = asPropertyTypeDeserializer;
            this.onMediaButtonEvent = 1;
        } else {
            if (this.AudioAttributesImplApi21Parcelizer > 2147483647L) {
                throw SchemaAware.RemoteActionCompatParcelizer("Skipping atom with length > 2147483647 (unsupported).");
            }
            this.IconCompatParcelizer = null;
            this.onMediaButtonEvent = 1;
        }
        return true;
    }

    private void RemoteActionCompatParcelizer(closeOnFailAndThrowAsIOE closeonfailandthrowasioe) throws IOException {
        int i = ((int) this.AudioAttributesImplApi21Parcelizer) - this.AudioAttributesImplBaseParcelizer;
        AsPropertyTypeDeserializer asPropertyTypeDeserializer = this.IconCompatParcelizer;
        if (asPropertyTypeDeserializer != null) {
            closeonfailandthrowasioe.IconCompatParcelizer(asPropertyTypeDeserializer.RemoteActionCompatParcelizer(), 8, i);
            write(new chainedTransformer.IconCompatParcelizer(this.AudioAttributesImplApi26Parcelizer, asPropertyTypeDeserializer), closeonfailandthrowasioe.IconCompatParcelizer());
        } else {
            closeonfailandthrowasioe.IconCompatParcelizer(i);
        }
        AudioAttributesCompatParcelizer(closeonfailandthrowasioe.IconCompatParcelizer());
    }

    private void AudioAttributesCompatParcelizer(long j) throws SchemaAware {
        while (!this.MediaDescriptionCompat.isEmpty() && this.MediaDescriptionCompat.peek().IconCompatParcelizer == j) {
            write(this.MediaDescriptionCompat.pop());
        }
        IconCompatParcelizer();
    }

    private void write(chainedTransformer.IconCompatParcelizer iconCompatParcelizer, long j) throws SchemaAware {
        if (!this.MediaDescriptionCompat.isEmpty()) {
            this.MediaDescriptionCompat.peek().IconCompatParcelizer(iconCompatParcelizer);
            return;
        }
        if (iconCompatParcelizer.AudioAttributesCompatParcelizer == 1936286840) {
            Pair<Long, _failGetClassMethods> pairIconCompatParcelizer = IconCompatParcelizer(iconCompatParcelizer.write, j);
            this.onRemoveQueueItemAt = ((Long) pairIconCompatParcelizer.first).longValue();
            this.onCommand.read((isCollectionMapOrArray) pairIconCompatParcelizer.second);
            this.onCustomAction = true;
            return;
        }
        if (iconCompatParcelizer.AudioAttributesCompatParcelizer == 1701671783) {
            AudioAttributesCompatParcelizer(iconCompatParcelizer.write);
        }
    }

    private void write(chainedTransformer.RemoteActionCompatParcelizer remoteActionCompatParcelizer) throws SchemaAware {
        if (remoteActionCompatParcelizer.AudioAttributesCompatParcelizer == 1836019574) {
            AudioAttributesCompatParcelizer(remoteActionCompatParcelizer);
        } else if (remoteActionCompatParcelizer.AudioAttributesCompatParcelizer == 1836019558) {
            read(remoteActionCompatParcelizer);
        } else {
            if (this.MediaDescriptionCompat.isEmpty()) {
                return;
            }
            this.MediaDescriptionCompat.peek().write(remoteActionCompatParcelizer);
        }
    }

    private void AudioAttributesCompatParcelizer(chainedTransformer.RemoteActionCompatParcelizer remoteActionCompatParcelizer) throws SchemaAware {
        int i = 0;
        buildTypeSerializer.read(this.onSeekTo == null, "Unexpected moov box.");
        DrmInitData drmInitData = read(remoteActionCompatParcelizer.read);
        chainedTransformer.RemoteActionCompatParcelizer remoteActionCompatParcelizer2 = (chainedTransformer.RemoteActionCompatParcelizer) buildTypeSerializer.IconCompatParcelizer(remoteActionCompatParcelizer.read(Atom.TYPE_mvex));
        SparseArray sparseArray = new SparseArray();
        int size = remoteActionCompatParcelizer2.read.size();
        long jIconCompatParcelizer = -9223372036854775807L;
        for (int i2 = 0; i2 < size; i2++) {
            chainedTransformer.IconCompatParcelizer iconCompatParcelizer = remoteActionCompatParcelizer2.read.get(i2);
            if (iconCompatParcelizer.AudioAttributesCompatParcelizer == 1953654136) {
                Pair<Integer, NameTransformer> pairRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(iconCompatParcelizer.write);
                sparseArray.put(((Integer) pairRemoteActionCompatParcelizer.first).intValue(), (NameTransformer) pairRemoteActionCompatParcelizer.second);
            } else if (iconCompatParcelizer.AudioAttributesCompatParcelizer == 1835362404) {
                jIconCompatParcelizer = IconCompatParcelizer(iconCompatParcelizer.write);
            }
        }
        List<initialCapacity> listAudioAttributesCompatParcelizer = linkNext.AudioAttributesCompatParcelizer(remoteActionCompatParcelizer, new hasClass(), jIconCompatParcelizer, drmInitData, (this.handleMediaPlayPauseIfPendingOnHandler & 16) != 0, false, (parseMvhd<ObjectBuffer, ObjectBuffer>) new parseMvhd() { // from class: o.NameTransformer1
            @Override // kotlin.parseMvhd
            public final Object apply(Object obj) {
                return NameTransformerChained.RemoteActionCompatParcelizer((ObjectBuffer) obj);
            }
        });
        int size2 = listAudioAttributesCompatParcelizer.size();
        if (this.onSetRating.size() == 0) {
            while (i < size2) {
                initialCapacity initialcapacity = listAudioAttributesCompatParcelizer.get(i);
                ObjectBuffer objectBuffer = initialcapacity.AudioAttributesImplApi21Parcelizer;
                this.onSetRating.put(objectBuffer.RemoteActionCompatParcelizer, new AudioAttributesCompatParcelizer(this.onCommand.IconCompatParcelizer(i, objectBuffer.AudioAttributesImplApi26Parcelizer), initialcapacity, IconCompatParcelizer((SparseArray<NameTransformer>) sparseArray, objectBuffer.RemoteActionCompatParcelizer)));
                this.RatingCompat = Math.max(this.RatingCompat, objectBuffer.IconCompatParcelizer);
                i++;
            }
            this.onCommand.RemoteActionCompatParcelizer();
            return;
        }
        buildTypeSerializer.write(this.onSetRating.size() == size2);
        while (i < size2) {
            initialCapacity initialcapacity2 = listAudioAttributesCompatParcelizer.get(i);
            ObjectBuffer objectBuffer2 = initialcapacity2.AudioAttributesImplApi21Parcelizer;
            this.onSetRating.get(objectBuffer2.RemoteActionCompatParcelizer).RemoteActionCompatParcelizer(initialcapacity2, IconCompatParcelizer((SparseArray<NameTransformer>) sparseArray, objectBuffer2.RemoteActionCompatParcelizer));
            i++;
        }
    }

    private static NameTransformer IconCompatParcelizer(SparseArray<NameTransformer> sparseArray, int i) {
        if (sparseArray.size() == 1) {
            return sparseArray.valueAt(0);
        }
        return (NameTransformer) buildTypeSerializer.IconCompatParcelizer(sparseArray.get(i));
    }

    private void read(chainedTransformer.RemoteActionCompatParcelizer remoteActionCompatParcelizer) throws SchemaAware {
        IconCompatParcelizer(remoteActionCompatParcelizer, this.onSetRating, this.onSeekTo != null, this.handleMediaPlayPauseIfPendingOnHandler, this.onPrepareFromUri);
        DrmInitData drmInitData = read(remoteActionCompatParcelizer.read);
        if (drmInitData != null) {
            int size = this.onSetRating.size();
            for (int i = 0; i < size; i++) {
                this.onSetRating.valueAt(i).write(drmInitData);
            }
        }
        if (this.onPrepareFromSearch != C.TIME_UNSET) {
            int size2 = this.onSetRating.size();
            for (int i2 = 0; i2 < size2; i2++) {
                this.onSetRating.valueAt(i2).IconCompatParcelizer(this.onPrepareFromSearch);
            }
            this.onPrepareFromSearch = C.TIME_UNSET;
        }
    }

    private void AudioAttributesImplApi26Parcelizer() {
        int i;
        nonNullString[] nonnullstringArr = new nonNullString[2];
        this.MediaMetadataCompat = nonnullstringArr;
        nonNullString nonnullstring = this.RemoteActionCompatParcelizer;
        int i2 = 0;
        if (nonnullstring != null) {
            nonnullstringArr[0] = nonnullstring;
            i = 1;
        } else {
            i = 0;
        }
        int i3 = 100;
        if ((this.handleMediaPlayPauseIfPendingOnHandler & 4) != 0) {
            nonnullstringArr[i] = this.onCommand.IconCompatParcelizer(100, 5);
            i++;
            i3 = 101;
        }
        nonNullString[] nonnullstringArr2 = (nonNullString[]) LaissezFaireSubTypeValidator.AudioAttributesCompatParcelizer(this.MediaMetadataCompat, i);
        this.MediaMetadataCompat = nonnullstringArr2;
        for (nonNullString nonnullstring2 : nonnullstringArr2) {
            nonnullstring2.write(read);
        }
        this.MediaBrowserCompatCustomActionResultReceiver = new nonNullString[this.MediaBrowserCompatItemReceiver.size()];
        while (i2 < this.MediaBrowserCompatCustomActionResultReceiver.length) {
            nonNullString nonnullstringIconCompatParcelizer = this.onCommand.IconCompatParcelizer(i3, 3);
            nonnullstringIconCompatParcelizer.write(this.MediaBrowserCompatItemReceiver.get(i2));
            this.MediaBrowserCompatCustomActionResultReceiver[i2] = nonnullstringIconCompatParcelizer;
            i2++;
            i3++;
        }
    }

    private void AudioAttributesCompatParcelizer(AsPropertyTypeDeserializer asPropertyTypeDeserializer) {
        long jAudioAttributesCompatParcelizer;
        String str;
        long jAudioAttributesCompatParcelizer2;
        String str2;
        long jOnMediaButtonEvent;
        long jRemoteActionCompatParcelizer;
        if (this.MediaMetadataCompat.length != 0) {
            asPropertyTypeDeserializer.MediaBrowserCompatCustomActionResultReceiver(8);
            int iAudioAttributesCompatParcelizer = chainedTransformer.AudioAttributesCompatParcelizer(asPropertyTypeDeserializer.MediaBrowserCompatItemReceiver());
            if (iAudioAttributesCompatParcelizer == 0) {
                String str3 = (String) buildTypeSerializer.IconCompatParcelizer(asPropertyTypeDeserializer.onAddQueueItem());
                String str4 = (String) buildTypeSerializer.IconCompatParcelizer(asPropertyTypeDeserializer.onAddQueueItem());
                long jOnMediaButtonEvent2 = asPropertyTypeDeserializer.onMediaButtonEvent();
                jAudioAttributesCompatParcelizer = LaissezFaireSubTypeValidator.AudioAttributesCompatParcelizer(asPropertyTypeDeserializer.onMediaButtonEvent(), 1000000L, jOnMediaButtonEvent2);
                long j = this.onRemoveQueueItemAt;
                long j2 = j != C.TIME_UNSET ? j + jAudioAttributesCompatParcelizer : -9223372036854775807L;
                str = str3;
                jAudioAttributesCompatParcelizer2 = LaissezFaireSubTypeValidator.AudioAttributesCompatParcelizer(asPropertyTypeDeserializer.onMediaButtonEvent(), 1000L, jOnMediaButtonEvent2);
                str2 = str4;
                jOnMediaButtonEvent = asPropertyTypeDeserializer.onMediaButtonEvent();
                jRemoteActionCompatParcelizer = j2;
            } else if (iAudioAttributesCompatParcelizer == 1) {
                long jOnMediaButtonEvent3 = asPropertyTypeDeserializer.onMediaButtonEvent();
                jRemoteActionCompatParcelizer = LaissezFaireSubTypeValidator.AudioAttributesCompatParcelizer(asPropertyTypeDeserializer.onPlayFromUri(), 1000000L, jOnMediaButtonEvent3);
                long jAudioAttributesCompatParcelizer3 = LaissezFaireSubTypeValidator.AudioAttributesCompatParcelizer(asPropertyTypeDeserializer.onMediaButtonEvent(), 1000L, jOnMediaButtonEvent3);
                long jOnMediaButtonEvent4 = asPropertyTypeDeserializer.onMediaButtonEvent();
                str = (String) buildTypeSerializer.IconCompatParcelizer(asPropertyTypeDeserializer.onAddQueueItem());
                jAudioAttributesCompatParcelizer2 = jAudioAttributesCompatParcelizer3;
                jOnMediaButtonEvent = jOnMediaButtonEvent4;
                str2 = (String) buildTypeSerializer.IconCompatParcelizer(asPropertyTypeDeserializer.onAddQueueItem());
                jAudioAttributesCompatParcelizer = -9223372036854775807L;
            } else {
                prune.RemoteActionCompatParcelizer("FragmentedMp4Extractor", "Skipping unsupported emsg version: ".concat(String.valueOf(iAudioAttributesCompatParcelizer)));
                return;
            }
            byte[] bArr = new byte[asPropertyTypeDeserializer.IconCompatParcelizer()];
            asPropertyTypeDeserializer.write(bArr, 0, asPropertyTypeDeserializer.IconCompatParcelizer());
            AsPropertyTypeDeserializer asPropertyTypeDeserializer2 = new AsPropertyTypeDeserializer(this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.IconCompatParcelizer(new EventMessage(str, str2, jAudioAttributesCompatParcelizer2, jOnMediaButtonEvent, bArr)));
            int iIconCompatParcelizer = asPropertyTypeDeserializer2.IconCompatParcelizer();
            for (nonNullString nonnullstring : this.MediaMetadataCompat) {
                asPropertyTypeDeserializer2.MediaBrowserCompatCustomActionResultReceiver(0);
                nonnullstring.RemoteActionCompatParcelizer(asPropertyTypeDeserializer2, iIconCompatParcelizer);
            }
            if (jRemoteActionCompatParcelizer == C.TIME_UNSET) {
                this.onPlayFromSearch.addLast(new IconCompatParcelizer(jAudioAttributesCompatParcelizer, true, iIconCompatParcelizer));
                this.onFastForward += iIconCompatParcelizer;
                return;
            }
            if (!this.onPlayFromSearch.isEmpty()) {
                this.onPlayFromSearch.addLast(new IconCompatParcelizer(jRemoteActionCompatParcelizer, false, iIconCompatParcelizer));
                this.onFastForward += iIconCompatParcelizer;
                return;
            }
            MinimalClassNameIdResolver minimalClassNameIdResolver = this.onSetRepeatMode;
            if (minimalClassNameIdResolver != null && !minimalClassNameIdResolver.read()) {
                this.onPlayFromSearch.addLast(new IconCompatParcelizer(jRemoteActionCompatParcelizer, false, iIconCompatParcelizer));
                this.onFastForward += iIconCompatParcelizer;
                return;
            }
            MinimalClassNameIdResolver minimalClassNameIdResolver2 = this.onSetRepeatMode;
            if (minimalClassNameIdResolver2 != null) {
                jRemoteActionCompatParcelizer = minimalClassNameIdResolver2.RemoteActionCompatParcelizer(jRemoteActionCompatParcelizer);
            }
            for (nonNullString nonnullstring2 : this.MediaMetadataCompat) {
                nonnullstring2.IconCompatParcelizer(jRemoteActionCompatParcelizer, 1, iIconCompatParcelizer, 0, null);
            }
        }
    }

    private static Pair<Integer, NameTransformer> RemoteActionCompatParcelizer(AsPropertyTypeDeserializer asPropertyTypeDeserializer) {
        asPropertyTypeDeserializer.MediaBrowserCompatCustomActionResultReceiver(12);
        return Pair.create(Integer.valueOf(asPropertyTypeDeserializer.MediaBrowserCompatItemReceiver()), new NameTransformer(asPropertyTypeDeserializer.MediaBrowserCompatItemReceiver() - 1, asPropertyTypeDeserializer.MediaBrowserCompatItemReceiver(), asPropertyTypeDeserializer.MediaBrowserCompatItemReceiver(), asPropertyTypeDeserializer.MediaBrowserCompatItemReceiver()));
    }

    private static long IconCompatParcelizer(AsPropertyTypeDeserializer asPropertyTypeDeserializer) {
        asPropertyTypeDeserializer.MediaBrowserCompatCustomActionResultReceiver(8);
        return chainedTransformer.AudioAttributesCompatParcelizer(asPropertyTypeDeserializer.MediaBrowserCompatItemReceiver()) == 0 ? asPropertyTypeDeserializer.onMediaButtonEvent() : asPropertyTypeDeserializer.onPlayFromUri();
    }

    private static void IconCompatParcelizer(chainedTransformer.RemoteActionCompatParcelizer remoteActionCompatParcelizer, SparseArray<AudioAttributesCompatParcelizer> sparseArray, boolean z, int i, byte[] bArr) throws SchemaAware {
        int size = remoteActionCompatParcelizer.write.size();
        for (int i2 = 0; i2 < size; i2++) {
            chainedTransformer.RemoteActionCompatParcelizer remoteActionCompatParcelizer2 = remoteActionCompatParcelizer.write.get(i2);
            if (remoteActionCompatParcelizer2.AudioAttributesCompatParcelizer == 1953653094) {
                RemoteActionCompatParcelizer(remoteActionCompatParcelizer2, sparseArray, z, i, bArr);
            }
        }
    }

    private static void RemoteActionCompatParcelizer(chainedTransformer.RemoteActionCompatParcelizer remoteActionCompatParcelizer, SparseArray<AudioAttributesCompatParcelizer> sparseArray, boolean z, int i, byte[] bArr) throws SchemaAware {
        AudioAttributesCompatParcelizer audioAttributesCompatParcelizerWrite = write(((chainedTransformer.IconCompatParcelizer) buildTypeSerializer.IconCompatParcelizer(remoteActionCompatParcelizer.IconCompatParcelizer(Atom.TYPE_tfhd))).write, sparseArray, z);
        if (audioAttributesCompatParcelizerWrite != null) {
            completeAndClearBuffer completeandclearbuffer = audioAttributesCompatParcelizerWrite.AudioAttributesImplApi26Parcelizer;
            long j = completeandclearbuffer.AudioAttributesImplBaseParcelizer;
            boolean z2 = completeandclearbuffer.AudioAttributesImplApi26Parcelizer;
            audioAttributesCompatParcelizerWrite.MediaBrowserCompatItemReceiver();
            AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(audioAttributesCompatParcelizerWrite);
            chainedTransformer.IconCompatParcelizer IconCompatParcelizer2 = remoteActionCompatParcelizer.IconCompatParcelizer(Atom.TYPE_tfdt);
            if (IconCompatParcelizer2 != null && (i & 2) == 0) {
                completeandclearbuffer.AudioAttributesImplBaseParcelizer = write(IconCompatParcelizer2.write);
                completeandclearbuffer.AudioAttributesImplApi26Parcelizer = true;
            } else {
                completeandclearbuffer.AudioAttributesImplBaseParcelizer = j;
                completeandclearbuffer.AudioAttributesImplApi26Parcelizer = z2;
            }
            AudioAttributesCompatParcelizer(remoteActionCompatParcelizer, audioAttributesCompatParcelizerWrite, i);
            bufferedSize bufferedsizeIconCompatParcelizer = audioAttributesCompatParcelizerWrite.MediaBrowserCompatCustomActionResultReceiver.AudioAttributesImplApi21Parcelizer.IconCompatParcelizer(((NameTransformer) buildTypeSerializer.IconCompatParcelizer(completeandclearbuffer.write)).IconCompatParcelizer);
            chainedTransformer.IconCompatParcelizer IconCompatParcelizer3 = remoteActionCompatParcelizer.IconCompatParcelizer(Atom.TYPE_saiz);
            if (IconCompatParcelizer3 != null) {
                AudioAttributesCompatParcelizer((bufferedSize) buildTypeSerializer.IconCompatParcelizer(bufferedsizeIconCompatParcelizer), IconCompatParcelizer3.write, completeandclearbuffer);
            }
            chainedTransformer.IconCompatParcelizer IconCompatParcelizer4 = remoteActionCompatParcelizer.IconCompatParcelizer(Atom.TYPE_saio);
            if (IconCompatParcelizer4 != null) {
                write(IconCompatParcelizer4.write, completeandclearbuffer);
            }
            chainedTransformer.IconCompatParcelizer IconCompatParcelizer5 = remoteActionCompatParcelizer.IconCompatParcelizer(Atom.TYPE_senc);
            if (IconCompatParcelizer5 != null) {
                IconCompatParcelizer(IconCompatParcelizer5.write, completeandclearbuffer);
            }
            RemoteActionCompatParcelizer(remoteActionCompatParcelizer, bufferedsizeIconCompatParcelizer != null ? bufferedsizeIconCompatParcelizer.IconCompatParcelizer : null, completeandclearbuffer);
            int size = remoteActionCompatParcelizer.read.size();
            for (int i2 = 0; i2 < size; i2++) {
                chainedTransformer.IconCompatParcelizer iconCompatParcelizer = remoteActionCompatParcelizer.read.get(i2);
                if (iconCompatParcelizer.AudioAttributesCompatParcelizer == 1970628964) {
                    IconCompatParcelizer(iconCompatParcelizer.write, completeandclearbuffer, bArr);
                }
            }
        }
    }

    private static void AudioAttributesCompatParcelizer(chainedTransformer.RemoteActionCompatParcelizer remoteActionCompatParcelizer, AudioAttributesCompatParcelizer audioAttributesCompatParcelizer, int i) throws SchemaAware {
        List<chainedTransformer.IconCompatParcelizer> list = remoteActionCompatParcelizer.read;
        int size = list.size();
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            chainedTransformer.IconCompatParcelizer iconCompatParcelizer = list.get(i4);
            if (iconCompatParcelizer.AudioAttributesCompatParcelizer == 1953658222) {
                AsPropertyTypeDeserializer asPropertyTypeDeserializer = iconCompatParcelizer.write;
                asPropertyTypeDeserializer.MediaBrowserCompatCustomActionResultReceiver(12);
                int iOnPrepareFromSearch = asPropertyTypeDeserializer.onPrepareFromSearch();
                if (iOnPrepareFromSearch > 0) {
                    i3 += iOnPrepareFromSearch;
                    i2++;
                }
            }
        }
        audioAttributesCompatParcelizer.AudioAttributesCompatParcelizer = 0;
        audioAttributesCompatParcelizer.write = 0;
        audioAttributesCompatParcelizer.read = 0;
        audioAttributesCompatParcelizer.AudioAttributesImplApi26Parcelizer.write(i2, i3);
        int i5 = 0;
        int iWrite = 0;
        for (int i6 = 0; i6 < size; i6++) {
            chainedTransformer.IconCompatParcelizer iconCompatParcelizer2 = list.get(i6);
            if (iconCompatParcelizer2.AudioAttributesCompatParcelizer == 1953658222) {
                iWrite = write(audioAttributesCompatParcelizer, i5, i, iconCompatParcelizer2.write, iWrite);
                i5++;
            }
        }
    }

    private static void AudioAttributesCompatParcelizer(bufferedSize bufferedsize, AsPropertyTypeDeserializer asPropertyTypeDeserializer, completeAndClearBuffer completeandclearbuffer) throws SchemaAware {
        int i;
        int i2 = bufferedsize.write;
        asPropertyTypeDeserializer.MediaBrowserCompatCustomActionResultReceiver(8);
        if ((chainedTransformer.write(asPropertyTypeDeserializer.MediaBrowserCompatItemReceiver()) & 1) == 1) {
            asPropertyTypeDeserializer.AudioAttributesImplBaseParcelizer(8);
        }
        int iOnPlayFromMediaId = asPropertyTypeDeserializer.onPlayFromMediaId();
        int iOnPrepareFromSearch = asPropertyTypeDeserializer.onPrepareFromSearch();
        if (iOnPrepareFromSearch > completeandclearbuffer.MediaBrowserCompatItemReceiver) {
            StringBuilder sb = new StringBuilder("Saiz sample count ");
            sb.append(iOnPrepareFromSearch);
            sb.append(" is greater than fragment sample count");
            sb.append(completeandclearbuffer.MediaBrowserCompatItemReceiver);
            throw SchemaAware.RemoteActionCompatParcelizer(sb.toString(), null);
        }
        if (iOnPlayFromMediaId == 0) {
            boolean[] zArr = completeandclearbuffer.MediaDescriptionCompat;
            i = 0;
            for (int i3 = 0; i3 < iOnPrepareFromSearch; i3++) {
                int iOnPlayFromMediaId2 = asPropertyTypeDeserializer.onPlayFromMediaId();
                i += iOnPlayFromMediaId2;
                zArr[i3] = iOnPlayFromMediaId2 > i2;
            }
        } else {
            i = iOnPlayFromMediaId * iOnPrepareFromSearch;
            Arrays.fill(completeandclearbuffer.MediaDescriptionCompat, 0, iOnPrepareFromSearch, iOnPlayFromMediaId > i2);
        }
        Arrays.fill(completeandclearbuffer.MediaDescriptionCompat, iOnPrepareFromSearch, completeandclearbuffer.MediaBrowserCompatItemReceiver, false);
        if (i > 0) {
            completeandclearbuffer.AudioAttributesCompatParcelizer(i);
        }
    }

    private static void write(AsPropertyTypeDeserializer asPropertyTypeDeserializer, completeAndClearBuffer completeandclearbuffer) throws SchemaAware {
        asPropertyTypeDeserializer.MediaBrowserCompatCustomActionResultReceiver(8);
        int iMediaBrowserCompatItemReceiver = asPropertyTypeDeserializer.MediaBrowserCompatItemReceiver();
        if ((chainedTransformer.write(iMediaBrowserCompatItemReceiver) & 1) == 1) {
            asPropertyTypeDeserializer.AudioAttributesImplBaseParcelizer(8);
        }
        int iOnPrepareFromSearch = asPropertyTypeDeserializer.onPrepareFromSearch();
        if (iOnPrepareFromSearch != 1) {
            throw SchemaAware.RemoteActionCompatParcelizer("Unexpected saio entry count: ".concat(String.valueOf(iOnPrepareFromSearch)), null);
        }
        completeandclearbuffer.AudioAttributesCompatParcelizer += chainedTransformer.AudioAttributesCompatParcelizer(iMediaBrowserCompatItemReceiver) == 0 ? asPropertyTypeDeserializer.onMediaButtonEvent() : asPropertyTypeDeserializer.onPlayFromUri();
    }

    private static AudioAttributesCompatParcelizer write(AsPropertyTypeDeserializer asPropertyTypeDeserializer, SparseArray<AudioAttributesCompatParcelizer> sparseArray, boolean z) {
        int iMediaBrowserCompatItemReceiver;
        int iMediaBrowserCompatItemReceiver2;
        int iMediaBrowserCompatItemReceiver3;
        int iMediaBrowserCompatItemReceiver4;
        asPropertyTypeDeserializer.MediaBrowserCompatCustomActionResultReceiver(8);
        int iWrite = chainedTransformer.write(asPropertyTypeDeserializer.MediaBrowserCompatItemReceiver());
        AudioAttributesCompatParcelizer audioAttributesCompatParcelizerValueAt = z ? sparseArray.valueAt(0) : sparseArray.get(asPropertyTypeDeserializer.MediaBrowserCompatItemReceiver());
        if (audioAttributesCompatParcelizerValueAt == null) {
            return null;
        }
        if ((iWrite & 1) != 0) {
            long jOnPlayFromUri = asPropertyTypeDeserializer.onPlayFromUri();
            audioAttributesCompatParcelizerValueAt.AudioAttributesImplApi26Parcelizer.read = jOnPlayFromUri;
            audioAttributesCompatParcelizerValueAt.AudioAttributesImplApi26Parcelizer.AudioAttributesCompatParcelizer = jOnPlayFromUri;
        }
        NameTransformer nameTransformer = audioAttributesCompatParcelizerValueAt.IconCompatParcelizer;
        if ((iWrite & 2) != 0) {
            iMediaBrowserCompatItemReceiver = asPropertyTypeDeserializer.MediaBrowserCompatItemReceiver() - 1;
        } else {
            iMediaBrowserCompatItemReceiver = nameTransformer.IconCompatParcelizer;
        }
        if ((iWrite & 8) != 0) {
            iMediaBrowserCompatItemReceiver2 = asPropertyTypeDeserializer.MediaBrowserCompatItemReceiver();
        } else {
            iMediaBrowserCompatItemReceiver2 = nameTransformer.read;
        }
        if ((iWrite & 16) != 0) {
            iMediaBrowserCompatItemReceiver3 = asPropertyTypeDeserializer.MediaBrowserCompatItemReceiver();
        } else {
            iMediaBrowserCompatItemReceiver3 = nameTransformer.write;
        }
        if ((iWrite & 32) != 0) {
            iMediaBrowserCompatItemReceiver4 = asPropertyTypeDeserializer.MediaBrowserCompatItemReceiver();
        } else {
            iMediaBrowserCompatItemReceiver4 = nameTransformer.RemoteActionCompatParcelizer;
        }
        audioAttributesCompatParcelizerValueAt.AudioAttributesImplApi26Parcelizer.write = new NameTransformer(iMediaBrowserCompatItemReceiver, iMediaBrowserCompatItemReceiver2, iMediaBrowserCompatItemReceiver3, iMediaBrowserCompatItemReceiver4);
        return audioAttributesCompatParcelizerValueAt;
    }

    private static long write(AsPropertyTypeDeserializer asPropertyTypeDeserializer) {
        asPropertyTypeDeserializer.MediaBrowserCompatCustomActionResultReceiver(8);
        return chainedTransformer.AudioAttributesCompatParcelizer(asPropertyTypeDeserializer.MediaBrowserCompatItemReceiver()) == 1 ? asPropertyTypeDeserializer.onPlayFromUri() : asPropertyTypeDeserializer.onMediaButtonEvent();
    }

    private static boolean read(ObjectBuffer objectBuffer) {
        if (objectBuffer.read != null && objectBuffer.read.length == 1 && objectBuffer.AudioAttributesCompatParcelizer != null) {
            if (objectBuffer.read[0] == 0) {
                return true;
            }
            if (LaissezFaireSubTypeValidator.AudioAttributesCompatParcelizer(objectBuffer.read[0] + objectBuffer.AudioAttributesCompatParcelizer[0], 1000000L, objectBuffer.AudioAttributesImplBaseParcelizer) >= objectBuffer.IconCompatParcelizer) {
                return true;
            }
        }
        return false;
    }

    private static int write(AudioAttributesCompatParcelizer audioAttributesCompatParcelizer, int i, int i2, AsPropertyTypeDeserializer asPropertyTypeDeserializer, int i3) throws SchemaAware {
        boolean z;
        int iMediaBrowserCompatItemReceiver;
        boolean z2;
        int iMediaBrowserCompatItemReceiver2;
        boolean z3;
        boolean z4;
        boolean z5;
        int iMediaBrowserCompatItemReceiver3;
        AudioAttributesCompatParcelizer audioAttributesCompatParcelizer2 = audioAttributesCompatParcelizer;
        asPropertyTypeDeserializer.MediaBrowserCompatCustomActionResultReceiver(8);
        int iWrite = chainedTransformer.write(asPropertyTypeDeserializer.MediaBrowserCompatItemReceiver());
        ObjectBuffer objectBuffer = audioAttributesCompatParcelizer2.MediaBrowserCompatCustomActionResultReceiver.AudioAttributesImplApi21Parcelizer;
        completeAndClearBuffer completeandclearbuffer = audioAttributesCompatParcelizer2.AudioAttributesImplApi26Parcelizer;
        NameTransformer nameTransformer = (NameTransformer) LaissezFaireSubTypeValidator.IconCompatParcelizer(completeandclearbuffer.write);
        completeandclearbuffer.onAddQueueItem[i] = asPropertyTypeDeserializer.onPrepareFromSearch();
        completeandclearbuffer.handleMediaPlayPauseIfPendingOnHandler[i] = completeandclearbuffer.read;
        if ((iWrite & 1) != 0) {
            long[] jArr = completeandclearbuffer.handleMediaPlayPauseIfPendingOnHandler;
            jArr[i] = jArr[i] + ((long) asPropertyTypeDeserializer.MediaBrowserCompatItemReceiver());
        }
        boolean z6 = (iWrite & 4) != 0;
        int iMediaBrowserCompatItemReceiver4 = nameTransformer.RemoteActionCompatParcelizer;
        if (z6) {
            iMediaBrowserCompatItemReceiver4 = asPropertyTypeDeserializer.MediaBrowserCompatItemReceiver();
        }
        boolean z7 = (iWrite & 256) != 0;
        boolean z8 = (iWrite & 512) != 0;
        boolean z9 = (iWrite & 1024) != 0;
        boolean z10 = (iWrite & 2048) != 0;
        long j = read(objectBuffer) ? ((long[]) LaissezFaireSubTypeValidator.IconCompatParcelizer(objectBuffer.AudioAttributesCompatParcelizer))[0] : 0L;
        int[] iArr = completeandclearbuffer.RatingCompat;
        long[] jArr2 = completeandclearbuffer.MediaMetadataCompat;
        boolean[] zArr = completeandclearbuffer.MediaBrowserCompatMediaItem;
        int i4 = iMediaBrowserCompatItemReceiver4;
        boolean z11 = objectBuffer.AudioAttributesImplApi26Parcelizer == 2 && (i2 & 1) != 0;
        int i5 = i3 + completeandclearbuffer.onAddQueueItem[i];
        boolean z12 = z11;
        long j2 = objectBuffer.AudioAttributesImplApi21Parcelizer;
        long j3 = completeandclearbuffer.AudioAttributesImplBaseParcelizer;
        int i6 = i3;
        while (i6 < i5) {
            int i7 = read(z7 ? asPropertyTypeDeserializer.MediaBrowserCompatItemReceiver() : nameTransformer.read);
            if (z8) {
                iMediaBrowserCompatItemReceiver = asPropertyTypeDeserializer.MediaBrowserCompatItemReceiver();
                z = z7;
            } else {
                z = z7;
                iMediaBrowserCompatItemReceiver = nameTransformer.write;
            }
            int i8 = read(iMediaBrowserCompatItemReceiver);
            if (z9) {
                z2 = z6;
                iMediaBrowserCompatItemReceiver2 = asPropertyTypeDeserializer.MediaBrowserCompatItemReceiver();
            } else if (i6 == 0 && z6) {
                z2 = z6;
                iMediaBrowserCompatItemReceiver2 = i4;
            } else {
                z2 = z6;
                iMediaBrowserCompatItemReceiver2 = nameTransformer.RemoteActionCompatParcelizer;
            }
            if (z10) {
                z3 = z10;
                z4 = z8;
                z5 = z9;
                iMediaBrowserCompatItemReceiver3 = asPropertyTypeDeserializer.MediaBrowserCompatItemReceiver();
            } else {
                z3 = z10;
                z4 = z8;
                z5 = z9;
                iMediaBrowserCompatItemReceiver3 = 0;
            }
            jArr2[i6] = LaissezFaireSubTypeValidator.AudioAttributesCompatParcelizer((((long) iMediaBrowserCompatItemReceiver3) + j3) - j, 1000000L, j2);
            if (!completeandclearbuffer.AudioAttributesImplApi26Parcelizer) {
                jArr2[i6] = jArr2[i6] + audioAttributesCompatParcelizer2.MediaBrowserCompatCustomActionResultReceiver.read;
            }
            iArr[i6] = i8;
            zArr[i6] = ((iMediaBrowserCompatItemReceiver2 >> 16) & 1) == 0 && (!z12 || i6 == 0);
            j3 += (long) i7;
            i6++;
            audioAttributesCompatParcelizer2 = audioAttributesCompatParcelizer;
            z7 = z;
            z6 = z2;
            z10 = z3;
            z8 = z4;
            z9 = z5;
        }
        completeandclearbuffer.AudioAttributesImplBaseParcelizer = j3;
        return i5;
    }

    private static int read(int i) throws SchemaAware {
        if (i >= 0) {
            return i;
        }
        throw SchemaAware.RemoteActionCompatParcelizer("Unexpected negative value: ".concat(String.valueOf(i)), null);
    }

    private static void IconCompatParcelizer(AsPropertyTypeDeserializer asPropertyTypeDeserializer, completeAndClearBuffer completeandclearbuffer, byte[] bArr) throws SchemaAware {
        asPropertyTypeDeserializer.MediaBrowserCompatCustomActionResultReceiver(8);
        asPropertyTypeDeserializer.write(bArr, 0, 16);
        if (Arrays.equals(bArr, write)) {
            IconCompatParcelizer(asPropertyTypeDeserializer, 16, completeandclearbuffer);
        }
    }

    private static void IconCompatParcelizer(AsPropertyTypeDeserializer asPropertyTypeDeserializer, completeAndClearBuffer completeandclearbuffer) throws SchemaAware {
        IconCompatParcelizer(asPropertyTypeDeserializer, 0, completeandclearbuffer);
    }

    private static void IconCompatParcelizer(AsPropertyTypeDeserializer asPropertyTypeDeserializer, int i, completeAndClearBuffer completeandclearbuffer) throws SchemaAware {
        asPropertyTypeDeserializer.MediaBrowserCompatCustomActionResultReceiver(i + 8);
        int iWrite = chainedTransformer.write(asPropertyTypeDeserializer.MediaBrowserCompatItemReceiver());
        if ((iWrite & 1) != 0) {
            throw SchemaAware.RemoteActionCompatParcelizer("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z = (iWrite & 2) != 0;
        int iOnPrepareFromSearch = asPropertyTypeDeserializer.onPrepareFromSearch();
        if (iOnPrepareFromSearch == 0) {
            Arrays.fill(completeandclearbuffer.MediaDescriptionCompat, 0, completeandclearbuffer.MediaBrowserCompatItemReceiver, false);
            return;
        }
        if (iOnPrepareFromSearch != completeandclearbuffer.MediaBrowserCompatItemReceiver) {
            StringBuilder sb = new StringBuilder("Senc sample count ");
            sb.append(iOnPrepareFromSearch);
            sb.append(" is different from fragment sample count");
            sb.append(completeandclearbuffer.MediaBrowserCompatItemReceiver);
            throw SchemaAware.RemoteActionCompatParcelizer(sb.toString(), null);
        }
        Arrays.fill(completeandclearbuffer.MediaDescriptionCompat, 0, iOnPrepareFromSearch, z);
        completeandclearbuffer.AudioAttributesCompatParcelizer(asPropertyTypeDeserializer.IconCompatParcelizer());
        completeandclearbuffer.RemoteActionCompatParcelizer(asPropertyTypeDeserializer);
    }

    private static void RemoteActionCompatParcelizer(chainedTransformer.RemoteActionCompatParcelizer remoteActionCompatParcelizer, String str, completeAndClearBuffer completeandclearbuffer) throws SchemaAware {
        byte[] bArr;
        AsPropertyTypeDeserializer asPropertyTypeDeserializer = null;
        AsPropertyTypeDeserializer asPropertyTypeDeserializer2 = null;
        for (int i = 0; i < remoteActionCompatParcelizer.read.size(); i++) {
            chainedTransformer.IconCompatParcelizer iconCompatParcelizer = remoteActionCompatParcelizer.read.get(i);
            AsPropertyTypeDeserializer asPropertyTypeDeserializer3 = iconCompatParcelizer.write;
            if (iconCompatParcelizer.AudioAttributesCompatParcelizer == 1935828848) {
                asPropertyTypeDeserializer3.MediaBrowserCompatCustomActionResultReceiver(12);
                if (asPropertyTypeDeserializer3.MediaBrowserCompatItemReceiver() == 1936025959) {
                    asPropertyTypeDeserializer = asPropertyTypeDeserializer3;
                }
            } else if (iconCompatParcelizer.AudioAttributesCompatParcelizer == 1936158820) {
                asPropertyTypeDeserializer3.MediaBrowserCompatCustomActionResultReceiver(12);
                if (asPropertyTypeDeserializer3.MediaBrowserCompatItemReceiver() == 1936025959) {
                    asPropertyTypeDeserializer2 = asPropertyTypeDeserializer3;
                }
            }
        }
        if (asPropertyTypeDeserializer == null || asPropertyTypeDeserializer2 == null) {
            return;
        }
        asPropertyTypeDeserializer.MediaBrowserCompatCustomActionResultReceiver(8);
        int iAudioAttributesCompatParcelizer = chainedTransformer.AudioAttributesCompatParcelizer(asPropertyTypeDeserializer.MediaBrowserCompatItemReceiver());
        asPropertyTypeDeserializer.AudioAttributesImplBaseParcelizer(4);
        if (iAudioAttributesCompatParcelizer == 1) {
            asPropertyTypeDeserializer.AudioAttributesImplBaseParcelizer(4);
        }
        if (asPropertyTypeDeserializer.MediaBrowserCompatItemReceiver() != 1) {
            throw SchemaAware.RemoteActionCompatParcelizer("Entry count in sbgp != 1 (unsupported).");
        }
        asPropertyTypeDeserializer2.MediaBrowserCompatCustomActionResultReceiver(8);
        int iAudioAttributesCompatParcelizer2 = chainedTransformer.AudioAttributesCompatParcelizer(asPropertyTypeDeserializer2.MediaBrowserCompatItemReceiver());
        asPropertyTypeDeserializer2.AudioAttributesImplBaseParcelizer(4);
        if (iAudioAttributesCompatParcelizer2 == 1) {
            if (asPropertyTypeDeserializer2.onMediaButtonEvent() == 0) {
                throw SchemaAware.RemoteActionCompatParcelizer("Variable length description in sgpd found (unsupported)");
            }
        } else if (iAudioAttributesCompatParcelizer2 >= 2) {
            asPropertyTypeDeserializer2.AudioAttributesImplBaseParcelizer(4);
        }
        if (asPropertyTypeDeserializer2.onMediaButtonEvent() != 1) {
            throw SchemaAware.RemoteActionCompatParcelizer("Entry count in sgpd != 1 (unsupported).");
        }
        asPropertyTypeDeserializer2.AudioAttributesImplBaseParcelizer(1);
        int iOnPlayFromMediaId = asPropertyTypeDeserializer2.onPlayFromMediaId();
        if (asPropertyTypeDeserializer2.onPlayFromMediaId() == 1) {
            int iOnPlayFromMediaId2 = asPropertyTypeDeserializer2.onPlayFromMediaId();
            byte[] bArr2 = new byte[16];
            asPropertyTypeDeserializer2.write(bArr2, 0, 16);
            if (iOnPlayFromMediaId2 == 0) {
                int iOnPlayFromMediaId3 = asPropertyTypeDeserializer2.onPlayFromMediaId();
                byte[] bArr3 = new byte[iOnPlayFromMediaId3];
                asPropertyTypeDeserializer2.write(bArr3, 0, iOnPlayFromMediaId3);
                bArr = bArr3;
            } else {
                bArr = null;
            }
            completeandclearbuffer.RemoteActionCompatParcelizer = true;
            completeandclearbuffer.MediaBrowserCompatSearchResultReceiver = new bufferedSize(true, str, iOnPlayFromMediaId2, bArr2, (iOnPlayFromMediaId & PsExtractor.VIDEO_STREAM_MASK) >> 4, iOnPlayFromMediaId & 15, bArr);
        }
    }

    private static Pair<Long, _failGetClassMethods> IconCompatParcelizer(AsPropertyTypeDeserializer asPropertyTypeDeserializer, long j) throws SchemaAware {
        long jOnPlayFromUri;
        long jOnPlayFromUri2;
        asPropertyTypeDeserializer.MediaBrowserCompatCustomActionResultReceiver(8);
        int iAudioAttributesCompatParcelizer = chainedTransformer.AudioAttributesCompatParcelizer(asPropertyTypeDeserializer.MediaBrowserCompatItemReceiver());
        asPropertyTypeDeserializer.AudioAttributesImplBaseParcelizer(4);
        long jOnMediaButtonEvent = asPropertyTypeDeserializer.onMediaButtonEvent();
        if (iAudioAttributesCompatParcelizer == 0) {
            jOnPlayFromUri = asPropertyTypeDeserializer.onMediaButtonEvent();
            jOnPlayFromUri2 = asPropertyTypeDeserializer.onMediaButtonEvent();
        } else {
            jOnPlayFromUri = asPropertyTypeDeserializer.onPlayFromUri();
            jOnPlayFromUri2 = asPropertyTypeDeserializer.onPlayFromUri();
        }
        long j2 = jOnPlayFromUri;
        long j3 = jOnPlayFromUri2;
        long jAudioAttributesCompatParcelizer = LaissezFaireSubTypeValidator.AudioAttributesCompatParcelizer(j2, 1000000L, jOnMediaButtonEvent);
        asPropertyTypeDeserializer.AudioAttributesImplBaseParcelizer(2);
        int iOnPrepare = asPropertyTypeDeserializer.onPrepare();
        int[] iArr = new int[iOnPrepare];
        long[] jArr = new long[iOnPrepare];
        long[] jArr2 = new long[iOnPrepare];
        long[] jArr3 = new long[iOnPrepare];
        long j4 = j + j3;
        int i = 0;
        long j5 = jAudioAttributesCompatParcelizer;
        long j6 = j2;
        long j7 = j4;
        while (i < iOnPrepare) {
            int iMediaBrowserCompatItemReceiver = asPropertyTypeDeserializer.MediaBrowserCompatItemReceiver();
            if ((iMediaBrowserCompatItemReceiver & Integer.MIN_VALUE) != 0) {
                throw SchemaAware.RemoteActionCompatParcelizer("Unhandled indirect reference", null);
            }
            long jOnMediaButtonEvent2 = asPropertyTypeDeserializer.onMediaButtonEvent();
            iArr[i] = iMediaBrowserCompatItemReceiver & Integer.MAX_VALUE;
            jArr[i] = j7;
            jArr3[i] = j5;
            long j8 = j6 + jOnMediaButtonEvent2;
            long[] jArr4 = jArr2;
            long[] jArr5 = jArr3;
            int i2 = iOnPrepare;
            int[] iArr2 = iArr;
            long jAudioAttributesCompatParcelizer2 = LaissezFaireSubTypeValidator.AudioAttributesCompatParcelizer(j8, 1000000L, jOnMediaButtonEvent);
            jArr4[i] = jAudioAttributesCompatParcelizer2 - jArr5[i];
            asPropertyTypeDeserializer.AudioAttributesImplBaseParcelizer(4);
            j7 += (long) iArr2[i];
            i++;
            iArr = iArr2;
            jArr3 = jArr5;
            jArr2 = jArr4;
            jArr = jArr;
            iOnPrepare = i2;
            jAudioAttributesCompatParcelizer = jAudioAttributesCompatParcelizer;
            j6 = j8;
            j5 = jAudioAttributesCompatParcelizer2;
        }
        long j9 = jAudioAttributesCompatParcelizer;
        return Pair.create(Long.valueOf(j9), new _failGetClassMethods(iArr, jArr, jArr2, jArr3));
    }

    private void IconCompatParcelizer(closeOnFailAndThrowAsIOE closeonfailandthrowasioe) throws IOException {
        int size = this.onSetRating.size();
        long j = Long.MAX_VALUE;
        AudioAttributesCompatParcelizer audioAttributesCompatParcelizerValueAt = null;
        for (int i = 0; i < size; i++) {
            completeAndClearBuffer completeandclearbuffer = this.onSetRating.valueAt(i).AudioAttributesImplApi26Parcelizer;
            if (completeandclearbuffer.MediaBrowserCompatCustomActionResultReceiver && completeandclearbuffer.AudioAttributesCompatParcelizer < j) {
                j = completeandclearbuffer.AudioAttributesCompatParcelizer;
                audioAttributesCompatParcelizerValueAt = this.onSetRating.valueAt(i);
            }
        }
        if (audioAttributesCompatParcelizerValueAt == null) {
            this.onMediaButtonEvent = 3;
            return;
        }
        int iIconCompatParcelizer = (int) (j - closeonfailandthrowasioe.IconCompatParcelizer());
        if (iIconCompatParcelizer < 0) {
            throw SchemaAware.RemoteActionCompatParcelizer("Offset to encryption data was negative.", null);
        }
        closeonfailandthrowasioe.IconCompatParcelizer(iIconCompatParcelizer);
        audioAttributesCompatParcelizerValueAt.AudioAttributesImplApi26Parcelizer.AudioAttributesCompatParcelizer(closeonfailandthrowasioe);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private boolean write(closeOnFailAndThrowAsIOE closeonfailandthrowasioe) throws IOException {
        int iAudioAttributesCompatParcelizer;
        AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = this.MediaBrowserCompatSearchResultReceiver;
        Throwable th = null;
        if (audioAttributesCompatParcelizer == null) {
            audioAttributesCompatParcelizer = read(this.onSetRating);
            if (audioAttributesCompatParcelizer == null) {
                int iIconCompatParcelizer = (int) (this.MediaBrowserCompatMediaItem - closeonfailandthrowasioe.IconCompatParcelizer());
                if (iIconCompatParcelizer < 0) {
                    throw SchemaAware.RemoteActionCompatParcelizer("Offset to end of mdat was negative.", null);
                }
                closeonfailandthrowasioe.IconCompatParcelizer(iIconCompatParcelizer);
                IconCompatParcelizer();
                return false;
            }
            int iWrite = (int) (audioAttributesCompatParcelizer.write() - closeonfailandthrowasioe.IconCompatParcelizer());
            if (iWrite < 0) {
                prune.RemoteActionCompatParcelizer("FragmentedMp4Extractor", "Ignoring negative offset to sample data.");
                iWrite = 0;
            }
            closeonfailandthrowasioe.IconCompatParcelizer(iWrite);
            this.MediaBrowserCompatSearchResultReceiver = audioAttributesCompatParcelizer;
        }
        int i = 4;
        int i2 = 1;
        if (this.onMediaButtonEvent == 3) {
            this.onRemoveQueueItem = audioAttributesCompatParcelizer.RemoteActionCompatParcelizer();
            if (audioAttributesCompatParcelizer.read < audioAttributesCompatParcelizer.RemoteActionCompatParcelizer) {
                closeonfailandthrowasioe.IconCompatParcelizer(this.onRemoveQueueItem);
                audioAttributesCompatParcelizer.AudioAttributesImplBaseParcelizer();
                if (!audioAttributesCompatParcelizer.AudioAttributesImplApi21Parcelizer()) {
                    this.MediaBrowserCompatSearchResultReceiver = null;
                }
                this.onMediaButtonEvent = 3;
                return true;
            }
            if (audioAttributesCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver.AudioAttributesImplApi21Parcelizer.MediaBrowserCompatItemReceiver == 1) {
                this.onRemoveQueueItem -= 8;
                closeonfailandthrowasioe.IconCompatParcelizer(8);
            }
            if (MimeTypes.AUDIO_AC4.equals(audioAttributesCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver.AudioAttributesImplApi21Parcelizer.write.onPlayFromUri)) {
                this.onPrepareFromMediaId = audioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(this.onRemoveQueueItem, 7);
                _interfaces.AudioAttributesCompatParcelizer(this.onRemoveQueueItem, this.onRewind);
                audioAttributesCompatParcelizer.MediaBrowserCompatItemReceiver.RemoteActionCompatParcelizer(this.onRewind, 7);
                this.onPrepareFromMediaId += 7;
            } else {
                this.onPrepareFromMediaId = audioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(this.onRemoveQueueItem, 0);
            }
            this.onRemoveQueueItem += this.onPrepareFromMediaId;
            this.onMediaButtonEvent = 4;
            this.onPlayFromUri = 0;
        }
        ObjectBuffer objectBuffer = audioAttributesCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver.AudioAttributesImplApi21Parcelizer;
        nonNullString nonnullstring = audioAttributesCompatParcelizer.MediaBrowserCompatItemReceiver;
        long jAudioAttributesCompatParcelizer = audioAttributesCompatParcelizer.AudioAttributesCompatParcelizer();
        MinimalClassNameIdResolver minimalClassNameIdResolver = this.onSetRepeatMode;
        if (minimalClassNameIdResolver != null) {
            jAudioAttributesCompatParcelizer = minimalClassNameIdResolver.RemoteActionCompatParcelizer(jAudioAttributesCompatParcelizer);
        }
        long j = jAudioAttributesCompatParcelizer;
        if (objectBuffer.MediaBrowserCompatCustomActionResultReceiver == 0) {
            while (true) {
                int i3 = this.onPrepareFromMediaId;
                int i4 = this.onRemoveQueueItem;
                if (i3 >= i4) {
                    break;
                }
                this.onPrepareFromMediaId += nonnullstring.AudioAttributesCompatParcelizer(closeonfailandthrowasioe, i4 - i3, false);
            }
        } else {
            byte[] bArrRemoteActionCompatParcelizer = this.onPlayFromMediaId.RemoteActionCompatParcelizer();
            bArrRemoteActionCompatParcelizer[0] = 0;
            bArrRemoteActionCompatParcelizer[1] = 0;
            bArrRemoteActionCompatParcelizer[2] = 0;
            int i5 = objectBuffer.MediaBrowserCompatCustomActionResultReceiver;
            int i6 = 4 - objectBuffer.MediaBrowserCompatCustomActionResultReceiver;
            while (this.onPrepareFromMediaId < this.onRemoveQueueItem) {
                int i7 = this.onPlayFromUri;
                if (i7 == 0) {
                    closeonfailandthrowasioe.IconCompatParcelizer(bArrRemoteActionCompatParcelizer, i6, i5 + 1);
                    this.onPlayFromMediaId.MediaBrowserCompatCustomActionResultReceiver(0);
                    int iMediaBrowserCompatItemReceiver = this.onPlayFromMediaId.MediaBrowserCompatItemReceiver();
                    if (iMediaBrowserCompatItemReceiver <= 0) {
                        throw SchemaAware.RemoteActionCompatParcelizer("Invalid NAL length", th);
                    }
                    this.onPlayFromUri = iMediaBrowserCompatItemReceiver - 1;
                    this.onPause.MediaBrowserCompatCustomActionResultReceiver(0);
                    nonnullstring.RemoteActionCompatParcelizer(this.onPause, i);
                    nonnullstring.RemoteActionCompatParcelizer(this.onPlayFromMediaId, i2);
                    this.onPrepare = (this.MediaBrowserCompatCustomActionResultReceiver.length <= 0 || !noTypeInfoBuilder.IconCompatParcelizer(objectBuffer.write.onPlayFromUri, bArrRemoteActionCompatParcelizer[i])) ? 0 : i2;
                    this.onPrepareFromMediaId += 5;
                    this.onRemoveQueueItem += i6;
                } else {
                    if (this.onPrepare) {
                        this.onPlay.write(i7);
                        closeonfailandthrowasioe.IconCompatParcelizer(this.onPlay.RemoteActionCompatParcelizer(), 0, this.onPlayFromUri);
                        nonnullstring.RemoteActionCompatParcelizer(this.onPlay, this.onPlayFromUri);
                        iAudioAttributesCompatParcelizer = this.onPlayFromUri;
                        int iIconCompatParcelizer2 = noTypeInfoBuilder.IconCompatParcelizer(this.onPlay.RemoteActionCompatParcelizer(), this.onPlay.read());
                        this.onPlay.MediaBrowserCompatCustomActionResultReceiver(MimeTypes.VIDEO_H265.equals(objectBuffer.write.onPlayFromUri) ? 1 : 0);
                        this.onPlay.AudioAttributesCompatParcelizer(iIconCompatParcelizer2);
                        ClassUtil.read(j, this.onPlay, this.MediaBrowserCompatCustomActionResultReceiver);
                    } else {
                        iAudioAttributesCompatParcelizer = nonnullstring.AudioAttributesCompatParcelizer(closeonfailandthrowasioe, i7, false);
                    }
                    this.onPrepareFromMediaId += iAudioAttributesCompatParcelizer;
                    this.onPlayFromUri -= iAudioAttributesCompatParcelizer;
                    th = null;
                    i = 4;
                    i2 = 1;
                }
            }
        }
        int i8 = audioAttributesCompatParcelizer.read();
        bufferedSize bufferedsizeIconCompatParcelizer = audioAttributesCompatParcelizer.IconCompatParcelizer();
        nonnullstring.IconCompatParcelizer(j, i8, this.onRemoveQueueItem, 0, bufferedsizeIconCompatParcelizer != null ? bufferedsizeIconCompatParcelizer.AudioAttributesCompatParcelizer : null);
        read(j);
        if (!audioAttributesCompatParcelizer.AudioAttributesImplApi21Parcelizer()) {
            this.MediaBrowserCompatSearchResultReceiver = null;
        }
        this.onMediaButtonEvent = 3;
        return true;
    }

    private void read(long j) {
        while (!this.onPlayFromSearch.isEmpty()) {
            IconCompatParcelizer iconCompatParcelizerRemoveFirst = this.onPlayFromSearch.removeFirst();
            this.onFastForward -= iconCompatParcelizerRemoveFirst.IconCompatParcelizer;
            long jRemoteActionCompatParcelizer = iconCompatParcelizerRemoveFirst.read;
            if (iconCompatParcelizerRemoveFirst.write) {
                jRemoteActionCompatParcelizer += j;
            }
            MinimalClassNameIdResolver minimalClassNameIdResolver = this.onSetRepeatMode;
            if (minimalClassNameIdResolver != null) {
                jRemoteActionCompatParcelizer = minimalClassNameIdResolver.RemoteActionCompatParcelizer(jRemoteActionCompatParcelizer);
            }
            for (nonNullString nonnullstring : this.MediaMetadataCompat) {
                nonnullstring.IconCompatParcelizer(jRemoteActionCompatParcelizer, 1, iconCompatParcelizerRemoveFirst.IconCompatParcelizer, this.onFastForward, null);
            }
        }
    }

    private static AudioAttributesCompatParcelizer read(SparseArray<AudioAttributesCompatParcelizer> sparseArray) {
        int size = sparseArray.size();
        AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = null;
        long j = Long.MAX_VALUE;
        for (int i = 0; i < size; i++) {
            AudioAttributesCompatParcelizer audioAttributesCompatParcelizerValueAt = sparseArray.valueAt(i);
            if ((audioAttributesCompatParcelizerValueAt.AudioAttributesImplBaseParcelizer || audioAttributesCompatParcelizerValueAt.read != audioAttributesCompatParcelizerValueAt.MediaBrowserCompatCustomActionResultReceiver.write) && (!audioAttributesCompatParcelizerValueAt.AudioAttributesImplBaseParcelizer || audioAttributesCompatParcelizerValueAt.AudioAttributesCompatParcelizer != audioAttributesCompatParcelizerValueAt.AudioAttributesImplApi26Parcelizer.onCustomAction)) {
                long jWrite = audioAttributesCompatParcelizerValueAt.write();
                if (jWrite < j) {
                    audioAttributesCompatParcelizer = audioAttributesCompatParcelizerValueAt;
                    j = jWrite;
                }
            }
        }
        return audioAttributesCompatParcelizer;
    }

    private static DrmInitData read(List<chainedTransformer.IconCompatParcelizer> list) {
        int size = list.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            chainedTransformer.IconCompatParcelizer iconCompatParcelizer = list.get(i);
            if (iconCompatParcelizer.AudioAttributesCompatParcelizer == 1886614376) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] bArrRemoteActionCompatParcelizer = iconCompatParcelizer.write.RemoteActionCompatParcelizer();
                UUID uuidRemoteActionCompatParcelizer = appendCompletedChunk.RemoteActionCompatParcelizer(bArrRemoteActionCompatParcelizer);
                if (uuidRemoteActionCompatParcelizer == null) {
                    prune.RemoteActionCompatParcelizer("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList.add(new DrmInitData.SchemeData(uuidRemoteActionCompatParcelizer, MimeTypes.VIDEO_MP4, bArrRemoteActionCompatParcelizer));
                }
            }
        }
        if (arrayList == null) {
            return null;
        }
        return new DrmInitData(arrayList);
    }

    static final class IconCompatParcelizer {
        public final int IconCompatParcelizer;
        public final long read;
        public final boolean write;

        public IconCompatParcelizer(long j, boolean z, int i) {
            this.read = j;
            this.write = z;
            this.IconCompatParcelizer = i;
        }
    }

    static final class AudioAttributesCompatParcelizer {
        public int AudioAttributesCompatParcelizer;
        private boolean AudioAttributesImplBaseParcelizer;
        public NameTransformer IconCompatParcelizer;
        public initialCapacity MediaBrowserCompatCustomActionResultReceiver;
        public final nonNullString MediaBrowserCompatItemReceiver;
        public int RemoteActionCompatParcelizer;
        public int read;
        public int write;
        public final completeAndClearBuffer AudioAttributesImplApi26Parcelizer = new completeAndClearBuffer();
        public final AsPropertyTypeDeserializer AudioAttributesImplApi21Parcelizer = new AsPropertyTypeDeserializer();
        private final AsPropertyTypeDeserializer MediaBrowserCompatMediaItem = new AsPropertyTypeDeserializer(1);
        private final AsPropertyTypeDeserializer MediaDescriptionCompat = new AsPropertyTypeDeserializer();

        static /* synthetic */ boolean RemoteActionCompatParcelizer(AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
            audioAttributesCompatParcelizer.AudioAttributesImplBaseParcelizer = true;
            return true;
        }

        public AudioAttributesCompatParcelizer(nonNullString nonnullstring, initialCapacity initialcapacity, NameTransformer nameTransformer) {
            this.MediaBrowserCompatItemReceiver = nonnullstring;
            this.MediaBrowserCompatCustomActionResultReceiver = initialcapacity;
            this.IconCompatParcelizer = nameTransformer;
            RemoteActionCompatParcelizer(initialcapacity, nameTransformer);
        }

        public final void RemoteActionCompatParcelizer(initialCapacity initialcapacity, NameTransformer nameTransformer) {
            this.MediaBrowserCompatCustomActionResultReceiver = initialcapacity;
            this.IconCompatParcelizer = nameTransformer;
            this.MediaBrowserCompatItemReceiver.write(initialcapacity.AudioAttributesImplApi21Parcelizer.write);
            MediaBrowserCompatItemReceiver();
        }

        public final void write(DrmInitData drmInitData) {
            bufferedSize bufferedsizeIconCompatParcelizer = this.MediaBrowserCompatCustomActionResultReceiver.AudioAttributesImplApi21Parcelizer.IconCompatParcelizer(((NameTransformer) LaissezFaireSubTypeValidator.IconCompatParcelizer(this.AudioAttributesImplApi26Parcelizer.write)).IconCompatParcelizer);
            this.MediaBrowserCompatItemReceiver.write(this.MediaBrowserCompatCustomActionResultReceiver.AudioAttributesImplApi21Parcelizer.write.write().AudioAttributesCompatParcelizer(drmInitData.IconCompatParcelizer(bufferedsizeIconCompatParcelizer != null ? bufferedsizeIconCompatParcelizer.IconCompatParcelizer : null)).IconCompatParcelizer());
        }

        public final void MediaBrowserCompatItemReceiver() {
            this.AudioAttributesImplApi26Parcelizer.IconCompatParcelizer();
            this.read = 0;
            this.AudioAttributesCompatParcelizer = 0;
            this.write = 0;
            this.RemoteActionCompatParcelizer = 0;
            this.AudioAttributesImplBaseParcelizer = false;
        }

        public final void IconCompatParcelizer(long j) {
            for (int i = this.read; i < this.AudioAttributesImplApi26Parcelizer.MediaBrowserCompatItemReceiver && this.AudioAttributesImplApi26Parcelizer.IconCompatParcelizer(i) <= j; i++) {
                if (this.AudioAttributesImplApi26Parcelizer.MediaBrowserCompatMediaItem[i]) {
                    this.RemoteActionCompatParcelizer = i;
                }
            }
        }

        public final long AudioAttributesCompatParcelizer() {
            if (!this.AudioAttributesImplBaseParcelizer) {
                return this.MediaBrowserCompatCustomActionResultReceiver.AudioAttributesImplApi26Parcelizer[this.read];
            }
            return this.AudioAttributesImplApi26Parcelizer.IconCompatParcelizer(this.read);
        }

        public final long write() {
            if (!this.AudioAttributesImplBaseParcelizer) {
                return this.MediaBrowserCompatCustomActionResultReceiver.AudioAttributesCompatParcelizer[this.read];
            }
            return this.AudioAttributesImplApi26Parcelizer.handleMediaPlayPauseIfPendingOnHandler[this.AudioAttributesCompatParcelizer];
        }

        public final int RemoteActionCompatParcelizer() {
            if (!this.AudioAttributesImplBaseParcelizer) {
                return this.MediaBrowserCompatCustomActionResultReceiver.AudioAttributesImplBaseParcelizer[this.read];
            }
            return this.AudioAttributesImplApi26Parcelizer.RatingCompat[this.read];
        }

        public final int read() {
            int i;
            if (!this.AudioAttributesImplBaseParcelizer) {
                i = this.MediaBrowserCompatCustomActionResultReceiver.RemoteActionCompatParcelizer[this.read];
            } else {
                i = this.AudioAttributesImplApi26Parcelizer.MediaBrowserCompatMediaItem[this.read] ? 1 : 0;
            }
            return IconCompatParcelizer() != null ? 1073741824 | i : i;
        }

        public final boolean AudioAttributesImplApi21Parcelizer() {
            this.read++;
            if (!this.AudioAttributesImplBaseParcelizer) {
                return false;
            }
            int i = this.write + 1;
            this.write = i;
            int[] iArr = this.AudioAttributesImplApi26Parcelizer.onAddQueueItem;
            int i2 = this.AudioAttributesCompatParcelizer;
            if (i != iArr[i2]) {
                return true;
            }
            this.AudioAttributesCompatParcelizer = i2 + 1;
            this.write = 0;
            return false;
        }

        public final int AudioAttributesCompatParcelizer(int i, int i2) {
            AsPropertyTypeDeserializer asPropertyTypeDeserializer;
            int length;
            bufferedSize bufferedsizeIconCompatParcelizer = IconCompatParcelizer();
            if (bufferedsizeIconCompatParcelizer == null) {
                return 0;
            }
            if (bufferedsizeIconCompatParcelizer.write != 0) {
                asPropertyTypeDeserializer = this.AudioAttributesImplApi26Parcelizer.AudioAttributesImplApi21Parcelizer;
                length = bufferedsizeIconCompatParcelizer.write;
            } else {
                byte[] bArr = (byte[]) LaissezFaireSubTypeValidator.IconCompatParcelizer(bufferedsizeIconCompatParcelizer.read);
                this.MediaDescriptionCompat.IconCompatParcelizer(bArr, bArr.length);
                asPropertyTypeDeserializer = this.MediaDescriptionCompat;
                length = bArr.length;
            }
            boolean z = this.AudioAttributesImplApi26Parcelizer.read(this.read);
            boolean z2 = z || i2 != 0;
            this.MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer()[0] = (byte) ((z2 ? 128 : 0) | length);
            this.MediaBrowserCompatMediaItem.MediaBrowserCompatCustomActionResultReceiver(0);
            this.MediaBrowserCompatItemReceiver.IconCompatParcelizer(this.MediaBrowserCompatMediaItem, 1, 1);
            this.MediaBrowserCompatItemReceiver.IconCompatParcelizer(asPropertyTypeDeserializer, length, 1);
            if (!z2) {
                return length + 1;
            }
            if (!z) {
                this.AudioAttributesImplApi21Parcelizer.write(8);
                byte[] bArrRemoteActionCompatParcelizer = this.AudioAttributesImplApi21Parcelizer.RemoteActionCompatParcelizer();
                bArrRemoteActionCompatParcelizer[0] = 0;
                bArrRemoteActionCompatParcelizer[1] = 1;
                bArrRemoteActionCompatParcelizer[2] = (byte) (i2 >> 8);
                bArrRemoteActionCompatParcelizer[3] = (byte) i2;
                bArrRemoteActionCompatParcelizer[4] = (byte) (i >>> 24);
                bArrRemoteActionCompatParcelizer[5] = (byte) (i >> 16);
                bArrRemoteActionCompatParcelizer[6] = (byte) (i >> 8);
                bArrRemoteActionCompatParcelizer[7] = (byte) i;
                this.MediaBrowserCompatItemReceiver.IconCompatParcelizer(this.AudioAttributesImplApi21Parcelizer, 8, 1);
                return length + 9;
            }
            AsPropertyTypeDeserializer asPropertyTypeDeserializer2 = this.AudioAttributesImplApi26Parcelizer.AudioAttributesImplApi21Parcelizer;
            int iOnPrepare = asPropertyTypeDeserializer2.onPrepare();
            asPropertyTypeDeserializer2.AudioAttributesImplBaseParcelizer(-2);
            int i3 = (iOnPrepare * 6) + 2;
            if (i2 != 0) {
                this.AudioAttributesImplApi21Parcelizer.write(i3);
                byte[] bArrRemoteActionCompatParcelizer2 = this.AudioAttributesImplApi21Parcelizer.RemoteActionCompatParcelizer();
                asPropertyTypeDeserializer2.write(bArrRemoteActionCompatParcelizer2, 0, i3);
                int i4 = (((bArrRemoteActionCompatParcelizer2[2] & 255) << 8) | (bArrRemoteActionCompatParcelizer2[3] & 255)) + i2;
                bArrRemoteActionCompatParcelizer2[2] = (byte) (i4 >> 8);
                bArrRemoteActionCompatParcelizer2[3] = (byte) i4;
                asPropertyTypeDeserializer2 = this.AudioAttributesImplApi21Parcelizer;
            }
            this.MediaBrowserCompatItemReceiver.IconCompatParcelizer(asPropertyTypeDeserializer2, i3, 1);
            return length + 1 + i3;
        }

        public final void AudioAttributesImplBaseParcelizer() {
            bufferedSize bufferedsizeIconCompatParcelizer = IconCompatParcelizer();
            if (bufferedsizeIconCompatParcelizer != null) {
                AsPropertyTypeDeserializer asPropertyTypeDeserializer = this.AudioAttributesImplApi26Parcelizer.AudioAttributesImplApi21Parcelizer;
                if (bufferedsizeIconCompatParcelizer.write != 0) {
                    asPropertyTypeDeserializer.AudioAttributesImplBaseParcelizer(bufferedsizeIconCompatParcelizer.write);
                }
                if (this.AudioAttributesImplApi26Parcelizer.read(this.read)) {
                    asPropertyTypeDeserializer.AudioAttributesImplBaseParcelizer(asPropertyTypeDeserializer.onPrepare() * 6);
                }
            }
        }

        public final bufferedSize IconCompatParcelizer() {
            bufferedSize bufferedsizeIconCompatParcelizer;
            if (!this.AudioAttributesImplBaseParcelizer) {
                return null;
            }
            int i = ((NameTransformer) LaissezFaireSubTypeValidator.IconCompatParcelizer(this.AudioAttributesImplApi26Parcelizer.write)).IconCompatParcelizer;
            if (this.AudioAttributesImplApi26Parcelizer.MediaBrowserCompatSearchResultReceiver != null) {
                bufferedsizeIconCompatParcelizer = this.AudioAttributesImplApi26Parcelizer.MediaBrowserCompatSearchResultReceiver;
            } else {
                bufferedsizeIconCompatParcelizer = this.MediaBrowserCompatCustomActionResultReceiver.AudioAttributesImplApi21Parcelizer.IconCompatParcelizer(i);
            }
            if (bufferedsizeIconCompatParcelizer == null || !bufferedsizeIconCompatParcelizer.RemoteActionCompatParcelizer) {
                return null;
            }
            return bufferedsizeIconCompatParcelizer;
        }
    }
}
