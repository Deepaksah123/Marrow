package kotlin;

import androidx.media3.common.DrmInitData;
import androidx.media3.common.Metadata;
import androidx.media3.extractor.metadata.mp4.MotionPhotoMetadata;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.extractor.mp4.Atom;
import com.google.android.exoplayer2.util.MimeTypes;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import kotlin.C0170format;
import kotlin.chainedTransformer;
import kotlin.isCollectionMapOrArray;
import kotlin.withTimeZone;

/* JADX INFO: loaded from: classes2.dex */
public final class NativeImageUtil implements findConstructor, isCollectionMapOrArray {
    private int AudioAttributesCompatParcelizer;
    private int AudioAttributesImplApi21Parcelizer;
    private long AudioAttributesImplApi26Parcelizer;
    private findRawSuperTypes AudioAttributesImplBaseParcelizer;
    private long[][] IconCompatParcelizer;
    private final ArrayDeque<chainedTransformer.RemoteActionCompatParcelizer> MediaBrowserCompatCustomActionResultReceiver;
    private int MediaBrowserCompatItemReceiver;
    private final int MediaBrowserCompatMediaItem;
    private MotionPhotoMetadata MediaBrowserCompatSearchResultReceiver;
    private int MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    private int MediaDescriptionCompat;
    private initExtraTracks<nullOrToString> MediaMetadataCompat;
    private final AsPropertyTypeDeserializer RatingCompat;
    private AsPropertyTypeDeserializer RemoteActionCompatParcelizer;
    private final AsPropertyTypeDeserializer handleMediaPlayPauseIfPendingOnHandler;
    private int onAddQueueItem;
    private int onCommand;
    private int onCustomAction;
    private final List<Metadata.Entry> onFastForward;
    private final _reset onMediaButtonEvent;
    private boolean onPause;
    private int onPlay;
    private final AsPropertyTypeDeserializer onPlayFromMediaId;
    private read[] onPrepareFromMediaId;
    private final withTimeZone.IconCompatParcelizer onPrepareFromSearch;
    private final AsPropertyTypeDeserializer read;
    private long write;

    private static boolean AudioAttributesCompatParcelizer(int i) {
        return i == 1836019574 || i == 1953653099 || i == 1835297121 || i == 1835626086 || i == 1937007212 || i == 1701082227 || i == 1835365473;
    }

    private static int IconCompatParcelizer(int i) {
        if (i != 1751476579) {
            return i != 1903435808 ? 0 : 1;
        }
        return 2;
    }

    static /* synthetic */ ObjectBuffer RemoteActionCompatParcelizer(ObjectBuffer objectBuffer) {
        return objectBuffer;
    }

    private static boolean write(int i) {
        return i == 1835296868 || i == 1836476516 || i == 1751411826 || i == 1937011556 || i == 1937011827 || i == 1937011571 || i == 1668576371 || i == 1701606260 || i == 1937011555 || i == 1937011578 || i == 1937013298 || i == 1937007471 || i == 1668232756 || i == 1953196132 || i == 1718909296 || i == 1969517665 || i == 1801812339 || i == 1768715124;
    }

    @Override // kotlin.isCollectionMapOrArray
    public final boolean IconCompatParcelizer() {
        return true;
    }

    @Override // kotlin.findConstructor
    public final void RemoteActionCompatParcelizer() {
    }

    static {
        new getClassDescription() { // from class: o.isUnsupportedFeatureError
            @Override // kotlin.getClassDescription
            public final findConstructor[] RemoteActionCompatParcelizer() {
                return NativeImageUtil.MediaBrowserCompatCustomActionResultReceiver();
            }
        };
    }

    static /* synthetic */ findConstructor[] MediaBrowserCompatCustomActionResultReceiver() {
        return new findConstructor[]{new NativeImageUtil(withTimeZone.IconCompatParcelizer.AudioAttributesCompatParcelizer, 16)};
    }

    @Deprecated
    public NativeImageUtil() {
        this(withTimeZone.IconCompatParcelizer.AudioAttributesCompatParcelizer, 16);
    }

    public NativeImageUtil(withTimeZone.IconCompatParcelizer iconCompatParcelizer, int i) {
        this.onPrepareFromSearch = iconCompatParcelizer;
        this.MediaBrowserCompatMediaItem = i;
        this.MediaMetadataCompat = initExtraTracks.AudioAttributesImplApi26Parcelizer();
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = (i & 4) != 0 ? 3 : 0;
        this.onMediaButtonEvent = new _reset();
        this.onFastForward = new ArrayList();
        this.read = new AsPropertyTypeDeserializer(16);
        this.MediaBrowserCompatCustomActionResultReceiver = new ArrayDeque<>();
        this.handleMediaPlayPauseIfPendingOnHandler = new AsPropertyTypeDeserializer(noTypeInfoBuilder.AudioAttributesCompatParcelizer);
        this.RatingCompat = new AsPropertyTypeDeserializer(4);
        this.onPlayFromMediaId = new AsPropertyTypeDeserializer();
        this.onPlay = -1;
        this.AudioAttributesImplBaseParcelizer = findRawSuperTypes.IconCompatParcelizer;
        this.onPrepareFromMediaId = new read[0];
    }

    @Override // kotlin.findConstructor
    public final boolean read(closeOnFailAndThrowAsIOE closeonfailandthrowasioe) throws IOException {
        nullOrToString nullortostring = needsReflectionConfiguration.read(closeonfailandthrowasioe, (this.MediaBrowserCompatMediaItem & 2) != 0);
        this.MediaMetadataCompat = nullortostring != null ? initExtraTracks.read(nullortostring) : initExtraTracks.AudioAttributesImplApi26Parcelizer();
        return nullortostring == null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.findConstructor
    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: merged with bridge method [inline-methods] */
    public initExtraTracks<nullOrToString> AudioAttributesCompatParcelizer() {
        return this.MediaMetadataCompat;
    }

    @Override // kotlin.findConstructor
    public final void read(findRawSuperTypes findrawsupertypes) {
        if ((this.MediaBrowserCompatMediaItem & 16) == 0) {
            findrawsupertypes = new _appendNativeIds(findrawsupertypes, this.onPrepareFromSearch);
        }
        this.AudioAttributesImplBaseParcelizer = findrawsupertypes;
    }

    @Override // kotlin.findConstructor
    public final void write(long j, long j2) {
        this.MediaBrowserCompatCustomActionResultReceiver.clear();
        this.AudioAttributesCompatParcelizer = 0;
        this.onPlay = -1;
        this.onCommand = 0;
        this.onAddQueueItem = 0;
        this.onCustomAction = 0;
        if (j == 0) {
            if (this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver != 3) {
                AudioAttributesImplApi26Parcelizer();
                return;
            } else {
                this.onMediaButtonEvent.IconCompatParcelizer();
                this.onFastForward.clear();
                return;
            }
        }
        for (read readVar : this.onPrepareFromMediaId) {
            IconCompatParcelizer(readVar, j2);
            if (readVar.write != null) {
                readVar.write.IconCompatParcelizer();
            }
        }
    }

    @Override // kotlin.findConstructor
    public final int RemoteActionCompatParcelizer(closeOnFailAndThrowAsIOE closeonfailandthrowasioe, isJacksonStdImpl isjacksonstdimpl) throws IOException {
        while (true) {
            int i = this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        return read(closeonfailandthrowasioe, isjacksonstdimpl);
                    }
                    if (i == 3) {
                        return write(closeonfailandthrowasioe, isjacksonstdimpl);
                    }
                    throw new IllegalStateException();
                }
                if (AudioAttributesCompatParcelizer(closeonfailandthrowasioe, isjacksonstdimpl)) {
                    return 1;
                }
            } else if (!write(closeonfailandthrowasioe)) {
                return -1;
            }
        }
    }

    @Override // kotlin.isCollectionMapOrArray
    public final long read() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    @Override // kotlin.isCollectionMapOrArray
    public final isCollectionMapOrArray.read write(long j) {
        return RemoteActionCompatParcelizer(j);
    }

    private isCollectionMapOrArray.read RemoteActionCompatParcelizer(long j) {
        long j2;
        long jIconCompatParcelizer;
        long j3;
        long j4;
        int iRemoteActionCompatParcelizer;
        read[] readVarArr = this.onPrepareFromMediaId;
        if (readVarArr.length == 0) {
            return new isCollectionMapOrArray.read(isLocalType.AudioAttributesCompatParcelizer);
        }
        int i = this.MediaDescriptionCompat;
        if (i != -1) {
            initialCapacity initialcapacity = readVarArr[i].read;
            int iRemoteActionCompatParcelizer2 = RemoteActionCompatParcelizer(initialcapacity, j);
            if (iRemoteActionCompatParcelizer2 == -1) {
                return new isCollectionMapOrArray.read(isLocalType.AudioAttributesCompatParcelizer);
            }
            long j5 = initialcapacity.AudioAttributesImplApi26Parcelizer[iRemoteActionCompatParcelizer2];
            j2 = initialcapacity.AudioAttributesCompatParcelizer[iRemoteActionCompatParcelizer2];
            if (j5 >= j || iRemoteActionCompatParcelizer2 >= initialcapacity.write - 1 || (iRemoteActionCompatParcelizer = initialcapacity.RemoteActionCompatParcelizer(j)) == -1 || iRemoteActionCompatParcelizer == iRemoteActionCompatParcelizer2) {
                j4 = -1;
                j3 = -9223372036854775807L;
            } else {
                j3 = initialcapacity.AudioAttributesImplApi26Parcelizer[iRemoteActionCompatParcelizer];
                j4 = initialcapacity.AudioAttributesCompatParcelizer[iRemoteActionCompatParcelizer];
            }
            jIconCompatParcelizer = j4;
            j = j5;
        } else {
            j2 = Long.MAX_VALUE;
            jIconCompatParcelizer = -1;
            j3 = -9223372036854775807L;
        }
        int i2 = 0;
        while (true) {
            read[] readVarArr2 = this.onPrepareFromMediaId;
            if (i2 >= readVarArr2.length) {
                break;
            }
            if (i2 != this.MediaDescriptionCompat) {
                initialCapacity initialcapacity2 = readVarArr2[i2].read;
                long jIconCompatParcelizer2 = IconCompatParcelizer(initialcapacity2, j, j2);
                if (j3 != C.TIME_UNSET) {
                    jIconCompatParcelizer = IconCompatParcelizer(initialcapacity2, j3, jIconCompatParcelizer);
                }
                j2 = jIconCompatParcelizer2;
            }
            i2++;
        }
        isLocalType islocaltype = new isLocalType(j, j2);
        if (j3 == C.TIME_UNSET) {
            return new isCollectionMapOrArray.read(islocaltype);
        }
        return new isCollectionMapOrArray.read(islocaltype, new isLocalType(j3, jIconCompatParcelizer));
    }

    private void AudioAttributesImplApi26Parcelizer() {
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = 0;
        this.AudioAttributesCompatParcelizer = 0;
    }

    private boolean write(closeOnFailAndThrowAsIOE closeonfailandthrowasioe) throws IOException {
        chainedTransformer.RemoteActionCompatParcelizer remoteActionCompatParcelizerPeek;
        if (this.AudioAttributesCompatParcelizer == 0) {
            if (!closeonfailandthrowasioe.AudioAttributesCompatParcelizer(this.read.RemoteActionCompatParcelizer(), 0, 8, true)) {
                AudioAttributesImplBaseParcelizer();
                return false;
            }
            this.AudioAttributesCompatParcelizer = 8;
            this.read.MediaBrowserCompatCustomActionResultReceiver(0);
            this.write = this.read.onMediaButtonEvent();
            this.AudioAttributesImplApi21Parcelizer = this.read.MediaBrowserCompatItemReceiver();
        }
        long j = this.write;
        if (j == 1) {
            closeonfailandthrowasioe.IconCompatParcelizer(this.read.RemoteActionCompatParcelizer(), 8, 8);
            this.AudioAttributesCompatParcelizer += 8;
            this.write = this.read.onPlayFromUri();
        } else if (j == 0) {
            long j2 = closeonfailandthrowasioe.read();
            if (j2 == -1 && (remoteActionCompatParcelizerPeek = this.MediaBrowserCompatCustomActionResultReceiver.peek()) != null) {
                j2 = remoteActionCompatParcelizerPeek.IconCompatParcelizer;
            }
            if (j2 != -1) {
                this.write = (j2 - closeonfailandthrowasioe.IconCompatParcelizer()) + ((long) this.AudioAttributesCompatParcelizer);
            }
        }
        if (this.write < this.AudioAttributesCompatParcelizer) {
            throw SchemaAware.RemoteActionCompatParcelizer("Atom size less than header length (unsupported).");
        }
        if (AudioAttributesCompatParcelizer(this.AudioAttributesImplApi21Parcelizer)) {
            long jIconCompatParcelizer = closeonfailandthrowasioe.IconCompatParcelizer();
            long j3 = this.write;
            long j4 = this.AudioAttributesCompatParcelizer;
            long j5 = (jIconCompatParcelizer + j3) - j4;
            if (j3 != j4 && this.AudioAttributesImplApi21Parcelizer == 1835365473) {
                RemoteActionCompatParcelizer(closeonfailandthrowasioe);
            }
            this.MediaBrowserCompatCustomActionResultReceiver.push(new chainedTransformer.RemoteActionCompatParcelizer(this.AudioAttributesImplApi21Parcelizer, j5));
            if (this.write == this.AudioAttributesCompatParcelizer) {
                IconCompatParcelizer(j5);
            } else {
                AudioAttributesImplApi26Parcelizer();
            }
        } else if (write(this.AudioAttributesImplApi21Parcelizer)) {
            buildTypeSerializer.write(this.AudioAttributesCompatParcelizer == 8);
            buildTypeSerializer.write(this.write <= 2147483647L);
            AsPropertyTypeDeserializer asPropertyTypeDeserializer = new AsPropertyTypeDeserializer((int) this.write);
            System.arraycopy(this.read.RemoteActionCompatParcelizer(), 0, asPropertyTypeDeserializer.RemoteActionCompatParcelizer(), 0, 8);
            this.RemoteActionCompatParcelizer = asPropertyTypeDeserializer;
            this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = 1;
        } else {
            read(closeonfailandthrowasioe.IconCompatParcelizer() - ((long) this.AudioAttributesCompatParcelizer));
            this.RemoteActionCompatParcelizer = null;
            this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = 1;
        }
        return true;
    }

    private boolean AudioAttributesCompatParcelizer(closeOnFailAndThrowAsIOE closeonfailandthrowasioe, isJacksonStdImpl isjacksonstdimpl) throws IOException {
        boolean z;
        long j = this.write - ((long) this.AudioAttributesCompatParcelizer);
        long jIconCompatParcelizer = closeonfailandthrowasioe.IconCompatParcelizer();
        AsPropertyTypeDeserializer asPropertyTypeDeserializer = this.RemoteActionCompatParcelizer;
        if (asPropertyTypeDeserializer != null) {
            closeonfailandthrowasioe.IconCompatParcelizer(asPropertyTypeDeserializer.RemoteActionCompatParcelizer(), this.AudioAttributesCompatParcelizer, (int) j);
            if (this.AudioAttributesImplApi21Parcelizer == 1718909296) {
                this.onPause = true;
                this.MediaBrowserCompatItemReceiver = RemoteActionCompatParcelizer(asPropertyTypeDeserializer);
            } else if (!this.MediaBrowserCompatCustomActionResultReceiver.isEmpty()) {
                this.MediaBrowserCompatCustomActionResultReceiver.peek().IconCompatParcelizer(new chainedTransformer.IconCompatParcelizer(this.AudioAttributesImplApi21Parcelizer, asPropertyTypeDeserializer));
            }
        } else {
            if (!this.onPause && this.AudioAttributesImplApi21Parcelizer == 1835295092) {
                this.MediaBrowserCompatItemReceiver = 1;
            }
            if (j < 262144) {
                closeonfailandthrowasioe.IconCompatParcelizer((int) j);
            } else {
                isjacksonstdimpl.AudioAttributesCompatParcelizer = closeonfailandthrowasioe.IconCompatParcelizer() + j;
                z = true;
                IconCompatParcelizer(jIconCompatParcelizer + j);
                return (z || this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver == 2) ? false : true;
            }
        }
        z = false;
        IconCompatParcelizer(jIconCompatParcelizer + j);
        if (z) {
        }
    }

    private int write(closeOnFailAndThrowAsIOE closeonfailandthrowasioe, isJacksonStdImpl isjacksonstdimpl) throws IOException {
        this.onMediaButtonEvent.AudioAttributesCompatParcelizer(closeonfailandthrowasioe, isjacksonstdimpl, this.onFastForward);
        if (isjacksonstdimpl.AudioAttributesCompatParcelizer != 0) {
            return 1;
        }
        AudioAttributesImplApi26Parcelizer();
        return 1;
    }

    private void IconCompatParcelizer(long j) throws SchemaAware {
        while (!this.MediaBrowserCompatCustomActionResultReceiver.isEmpty() && this.MediaBrowserCompatCustomActionResultReceiver.peek().IconCompatParcelizer == j) {
            chainedTransformer.RemoteActionCompatParcelizer remoteActionCompatParcelizerPop = this.MediaBrowserCompatCustomActionResultReceiver.pop();
            if (remoteActionCompatParcelizerPop.AudioAttributesCompatParcelizer == 1836019574) {
                IconCompatParcelizer(remoteActionCompatParcelizerPop);
                this.MediaBrowserCompatCustomActionResultReceiver.clear();
                this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = 2;
            } else if (!this.MediaBrowserCompatCustomActionResultReceiver.isEmpty()) {
                this.MediaBrowserCompatCustomActionResultReceiver.peek().write(remoteActionCompatParcelizerPop);
            }
        }
        if (this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver != 2) {
            AudioAttributesImplApi26Parcelizer();
        }
    }

    private void IconCompatParcelizer(chainedTransformer.RemoteActionCompatParcelizer remoteActionCompatParcelizer) throws SchemaAware {
        androidx.media3.common.Metadata metadata;
        List<initialCapacity> list;
        int i;
        int i2;
        ArrayList arrayList = new ArrayList();
        boolean z = this.MediaBrowserCompatItemReceiver == 1;
        hasClass hasclass = new hasClass();
        chainedTransformer.IconCompatParcelizer IconCompatParcelizer = remoteActionCompatParcelizer.IconCompatParcelizer(Atom.TYPE_udta);
        if (IconCompatParcelizer != null) {
            androidx.media3.common.Metadata metadataAudioAttributesCompatParcelizer = linkNext.AudioAttributesCompatParcelizer(IconCompatParcelizer);
            hasclass.IconCompatParcelizer(metadataAudioAttributesCompatParcelizer);
            metadata = metadataAudioAttributesCompatParcelizer;
        } else {
            metadata = null;
        }
        chainedTransformer.RemoteActionCompatParcelizer remoteActionCompatParcelizer2 = remoteActionCompatParcelizer.read(Atom.TYPE_meta);
        androidx.media3.common.Metadata metadata2 = remoteActionCompatParcelizer2 != null ? linkNext.read(remoteActionCompatParcelizer2) : null;
        androidx.media3.common.Metadata metadata3 = new androidx.media3.common.Metadata(linkNext.read(((chainedTransformer.IconCompatParcelizer) buildTypeSerializer.IconCompatParcelizer(remoteActionCompatParcelizer.IconCompatParcelizer(Atom.TYPE_mvhd))).write));
        List<initialCapacity> listAudioAttributesCompatParcelizer = linkNext.AudioAttributesCompatParcelizer(remoteActionCompatParcelizer, hasclass, C.TIME_UNSET, (DrmInitData) null, (this.MediaBrowserCompatMediaItem & 1) != 0, z, (parseMvhd<ObjectBuffer, ObjectBuffer>) new parseMvhd() { // from class: o.NameTransformerNopTransformer
            @Override // kotlin.parseMvhd
            public final Object apply(Object obj) {
                return NativeImageUtil.RemoteActionCompatParcelizer((ObjectBuffer) obj);
            }
        });
        long j = C.TIME_UNSET;
        long j2 = -9223372036854775807L;
        int i3 = 0;
        int i4 = 0;
        int size = -1;
        while (i3 < listAudioAttributesCompatParcelizer.size()) {
            initialCapacity initialcapacity = listAudioAttributesCompatParcelizer.get(i3);
            if (initialcapacity.write != 0) {
                ObjectBuffer objectBuffer = initialcapacity.AudioAttributesImplApi21Parcelizer;
                i = i3;
                long j3 = objectBuffer.IconCompatParcelizer != j ? objectBuffer.IconCompatParcelizer : initialcapacity.read;
                long jMax = Math.max(j2, j3);
                list = listAudioAttributesCompatParcelizer;
                read readVar = new read(objectBuffer, initialcapacity, this.AudioAttributesImplBaseParcelizer.IconCompatParcelizer(i4, objectBuffer.AudioAttributesImplApi26Parcelizer));
                if (MimeTypes.AUDIO_TRUEHD.equals(objectBuffer.write.onPlayFromUri)) {
                    i2 = initialcapacity.IconCompatParcelizer << 4;
                } else {
                    i2 = initialcapacity.IconCompatParcelizer + 30;
                }
                C0170format.RemoteActionCompatParcelizer remoteActionCompatParcelizerWrite = objectBuffer.write.write();
                remoteActionCompatParcelizerWrite.AudioAttributesImplApi26Parcelizer(i2);
                if (objectBuffer.AudioAttributesImplApi26Parcelizer == 2) {
                    if ((this.MediaBrowserCompatMediaItem & 8) != 0) {
                        remoteActionCompatParcelizerWrite.MediaBrowserCompatSearchResultReceiver(objectBuffer.write.onPrepare | (size == -1 ? 1 : 2));
                    }
                    if (j3 > 0 && initialcapacity.write > 0) {
                        remoteActionCompatParcelizerWrite.RemoteActionCompatParcelizer(initialcapacity.write / (j3 / 1000000.0f));
                    }
                }
                isRunningInNativeImage.read(objectBuffer.AudioAttributesImplApi26Parcelizer, hasclass, remoteActionCompatParcelizerWrite);
                int i5 = objectBuffer.AudioAttributesImplApi26Parcelizer;
                androidx.media3.common.Metadata[] metadataArr = new androidx.media3.common.Metadata[3];
                metadataArr[0] = this.onFastForward.isEmpty() ? null : new androidx.media3.common.Metadata(this.onFastForward);
                metadataArr[1] = metadata;
                metadataArr[2] = metadata3;
                isRunningInNativeImage.read(i5, metadata2, remoteActionCompatParcelizerWrite, metadataArr);
                readVar.RemoteActionCompatParcelizer.write(remoteActionCompatParcelizerWrite.IconCompatParcelizer());
                if (objectBuffer.AudioAttributesImplApi26Parcelizer == 2 && size == -1) {
                    size = arrayList.size();
                }
                arrayList.add(readVar);
                i4++;
                j2 = jMax;
            } else {
                list = listAudioAttributesCompatParcelizer;
                i = i3;
            }
            i3 = i + 1;
            listAudioAttributesCompatParcelizer = list;
            j = C.TIME_UNSET;
        }
        this.MediaDescriptionCompat = size;
        this.AudioAttributesImplApi26Parcelizer = j2;
        read[] readVarArr = (read[]) arrayList.toArray(new read[0]);
        this.onPrepareFromMediaId = readVarArr;
        this.IconCompatParcelizer = write(readVarArr);
        this.AudioAttributesImplBaseParcelizer.RemoteActionCompatParcelizer();
        this.AudioAttributesImplBaseParcelizer.read(this);
    }

    private int read(closeOnFailAndThrowAsIOE closeonfailandthrowasioe, isJacksonStdImpl isjacksonstdimpl) throws IOException {
        int i;
        long jIconCompatParcelizer = closeonfailandthrowasioe.IconCompatParcelizer();
        if (this.onPlay == -1) {
            int iAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(jIconCompatParcelizer);
            this.onPlay = iAudioAttributesCompatParcelizer;
            if (iAudioAttributesCompatParcelizer == -1) {
                return -1;
            }
        }
        read readVar = this.onPrepareFromMediaId[this.onPlay];
        nonNullString nonnullstring = readVar.RemoteActionCompatParcelizer;
        int i2 = readVar.IconCompatParcelizer;
        long j = readVar.read.AudioAttributesCompatParcelizer[i2];
        int i3 = readVar.read.AudioAttributesImplBaseParcelizer[i2];
        nameOf nameof = readVar.write;
        long j2 = (j - jIconCompatParcelizer) + ((long) this.onCommand);
        if (j2 < 0 || j2 >= 262144) {
            isjacksonstdimpl.AudioAttributesCompatParcelizer = j;
            return 1;
        }
        if (readVar.AudioAttributesCompatParcelizer.MediaBrowserCompatItemReceiver == 1) {
            j2 += 8;
            i3 -= 8;
        }
        closeonfailandthrowasioe.IconCompatParcelizer((int) j2);
        if (readVar.AudioAttributesCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver != 0) {
            byte[] bArrRemoteActionCompatParcelizer = this.RatingCompat.RemoteActionCompatParcelizer();
            bArrRemoteActionCompatParcelizer[0] = 0;
            bArrRemoteActionCompatParcelizer[1] = 0;
            bArrRemoteActionCompatParcelizer[2] = 0;
            int i4 = readVar.AudioAttributesCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver;
            int i5 = 4;
            int i6 = 4 - readVar.AudioAttributesCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver;
            while (this.onAddQueueItem < i3) {
                int i7 = this.onCustomAction;
                if (i7 == 0) {
                    closeonfailandthrowasioe.IconCompatParcelizer(bArrRemoteActionCompatParcelizer, i6, i4);
                    this.onCommand += i4;
                    this.RatingCompat.MediaBrowserCompatCustomActionResultReceiver(0);
                    int iMediaBrowserCompatItemReceiver = this.RatingCompat.MediaBrowserCompatItemReceiver();
                    if (iMediaBrowserCompatItemReceiver < 0) {
                        throw SchemaAware.RemoteActionCompatParcelizer("Invalid NAL length", null);
                    }
                    this.onCustomAction = iMediaBrowserCompatItemReceiver;
                    this.handleMediaPlayPauseIfPendingOnHandler.MediaBrowserCompatCustomActionResultReceiver(0);
                    nonnullstring.RemoteActionCompatParcelizer(this.handleMediaPlayPauseIfPendingOnHandler, i5);
                    this.onAddQueueItem += i5;
                    i3 += i6;
                } else {
                    int iAudioAttributesCompatParcelizer2 = nonnullstring.AudioAttributesCompatParcelizer(closeonfailandthrowasioe, i7, false);
                    this.onCommand += iAudioAttributesCompatParcelizer2;
                    this.onAddQueueItem += iAudioAttributesCompatParcelizer2;
                    this.onCustomAction -= iAudioAttributesCompatParcelizer2;
                    i5 = 4;
                }
            }
        } else {
            if (MimeTypes.AUDIO_AC4.equals(readVar.AudioAttributesCompatParcelizer.write.onPlayFromUri)) {
                if (this.onAddQueueItem == 0) {
                    _interfaces.AudioAttributesCompatParcelizer(i3, this.onPlayFromMediaId);
                    nonnullstring.RemoteActionCompatParcelizer(this.onPlayFromMediaId, 7);
                    this.onAddQueueItem += 7;
                }
                i3 += 7;
            } else if (nameof != null) {
                nameof.read(closeonfailandthrowasioe);
            }
            while (true) {
                int i8 = this.onAddQueueItem;
                if (i8 >= i3) {
                    break;
                }
                int iAudioAttributesCompatParcelizer3 = nonnullstring.AudioAttributesCompatParcelizer(closeonfailandthrowasioe, i3 - i8, false);
                this.onCommand += iAudioAttributesCompatParcelizer3;
                this.onAddQueueItem += iAudioAttributesCompatParcelizer3;
                this.onCustomAction -= iAudioAttributesCompatParcelizer3;
            }
        }
        int i9 = i3;
        long j3 = readVar.read.AudioAttributesImplApi26Parcelizer[i2];
        int i10 = readVar.read.RemoteActionCompatParcelizer[i2];
        if (nameof != null) {
            nameof.write(nonnullstring, j3, i10, i9, 0, null);
            if (i2 + 1 == readVar.read.write) {
                nameof.AudioAttributesCompatParcelizer(nonnullstring, null);
            }
            i = 0;
        } else {
            i = 0;
            nonnullstring.IconCompatParcelizer(j3, i10, i9, 0, null);
        }
        readVar.IconCompatParcelizer++;
        this.onPlay = -1;
        this.onCommand = i;
        this.onAddQueueItem = i;
        this.onCustomAction = i;
        return i;
    }

    private int AudioAttributesCompatParcelizer(long j) {
        NativeImageUtil nativeImageUtil = this;
        int i = -1;
        int i2 = -1;
        int i3 = 0;
        long j2 = Long.MAX_VALUE;
        boolean z = true;
        long j3 = Long.MAX_VALUE;
        boolean z2 = true;
        long j4 = Long.MAX_VALUE;
        while (true) {
            read[] readVarArr = nativeImageUtil.onPrepareFromMediaId;
            if (i3 >= readVarArr.length) {
                break;
            }
            read readVar = readVarArr[i3];
            int i4 = readVar.IconCompatParcelizer;
            if (i4 != readVar.read.write) {
                long j5 = readVar.read.AudioAttributesCompatParcelizer[i4];
                long j6 = ((long[][]) LaissezFaireSubTypeValidator.IconCompatParcelizer(nativeImageUtil.IconCompatParcelizer))[i3][i4];
                long j7 = j5 - j;
                boolean z3 = j7 < 0 || j7 >= 262144;
                if ((!z3 && z2) || (z3 == z2 && j7 < j4)) {
                    z2 = z3;
                    j4 = j7;
                    j3 = j6;
                    i = i3;
                }
                if (j6 < j2) {
                    z = z3;
                    j2 = j6;
                    i2 = i3;
                }
            }
            i3++;
            nativeImageUtil = this;
        }
        return (j2 == Long.MAX_VALUE || !z || j3 < j2 + 10485760) ? i : i2;
    }

    private static void IconCompatParcelizer(read readVar, long j) {
        initialCapacity initialcapacity = readVar.read;
        int iWrite = initialcapacity.write(j);
        if (iWrite == -1) {
            iWrite = initialcapacity.RemoteActionCompatParcelizer(j);
        }
        readVar.IconCompatParcelizer = iWrite;
    }

    private void AudioAttributesImplBaseParcelizer() {
        if (this.MediaBrowserCompatItemReceiver != 2 || (this.MediaBrowserCompatMediaItem & 2) == 0) {
            return;
        }
        nonNullString nonnullstringIconCompatParcelizer = this.AudioAttributesImplBaseParcelizer.IconCompatParcelizer(0, 4);
        MotionPhotoMetadata motionPhotoMetadata = this.MediaBrowserCompatSearchResultReceiver;
        nonnullstringIconCompatParcelizer.write(new C0170format.RemoteActionCompatParcelizer().read(motionPhotoMetadata == null ? null : new androidx.media3.common.Metadata(motionPhotoMetadata)).IconCompatParcelizer());
        this.AudioAttributesImplBaseParcelizer.RemoteActionCompatParcelizer();
        this.AudioAttributesImplBaseParcelizer.read(new isCollectionMapOrArray.write(C.TIME_UNSET));
    }

    private void RemoteActionCompatParcelizer(closeOnFailAndThrowAsIOE closeonfailandthrowasioe) throws IOException {
        this.onPlayFromMediaId.write(8);
        closeonfailandthrowasioe.RemoteActionCompatParcelizer(this.onPlayFromMediaId.RemoteActionCompatParcelizer(), 0, 8);
        linkNext.RemoteActionCompatParcelizer(this.onPlayFromMediaId);
        closeonfailandthrowasioe.IconCompatParcelizer(this.onPlayFromMediaId.write());
        closeonfailandthrowasioe.RemoteActionCompatParcelizer();
    }

    private void read(long j) {
        if (this.AudioAttributesImplApi21Parcelizer == 1836086884) {
            long j2 = this.AudioAttributesCompatParcelizer;
            this.MediaBrowserCompatSearchResultReceiver = new MotionPhotoMetadata(0L, j, C.TIME_UNSET, j + j2, this.write - j2);
        }
    }

    private static long[][] write(read[] readVarArr) {
        long[][] jArr = new long[readVarArr.length][];
        int[] iArr = new int[readVarArr.length];
        long[] jArr2 = new long[readVarArr.length];
        boolean[] zArr = new boolean[readVarArr.length];
        for (int i = 0; i < readVarArr.length; i++) {
            jArr[i] = new long[readVarArr[i].read.write];
            jArr2[i] = readVarArr[i].read.AudioAttributesImplApi26Parcelizer[0];
        }
        long j = 0;
        int i2 = 0;
        while (i2 < readVarArr.length) {
            long j2 = Long.MAX_VALUE;
            int i3 = -1;
            for (int i4 = 0; i4 < readVarArr.length; i4++) {
                if (!zArr[i4]) {
                    long j3 = jArr2[i4];
                    if (j3 <= j2) {
                        i3 = i4;
                        j2 = j3;
                    }
                }
            }
            int i5 = iArr[i3];
            jArr[i3][i5] = j;
            j += (long) readVarArr[i3].read.AudioAttributesImplBaseParcelizer[i5];
            int i6 = i5 + 1;
            iArr[i3] = i6;
            if (i6 < jArr[i3].length) {
                jArr2[i3] = readVarArr[i3].read.AudioAttributesImplApi26Parcelizer[i6];
            } else {
                zArr[i3] = true;
                i2++;
            }
        }
        return jArr;
    }

    private static long IconCompatParcelizer(initialCapacity initialcapacity, long j, long j2) {
        int iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(initialcapacity, j);
        return iRemoteActionCompatParcelizer == -1 ? j2 : Math.min(initialcapacity.AudioAttributesCompatParcelizer[iRemoteActionCompatParcelizer], j2);
    }

    private static int RemoteActionCompatParcelizer(initialCapacity initialcapacity, long j) {
        int iWrite = initialcapacity.write(j);
        return iWrite == -1 ? initialcapacity.RemoteActionCompatParcelizer(j) : iWrite;
    }

    private static int RemoteActionCompatParcelizer(AsPropertyTypeDeserializer asPropertyTypeDeserializer) {
        asPropertyTypeDeserializer.MediaBrowserCompatCustomActionResultReceiver(8);
        int iIconCompatParcelizer = IconCompatParcelizer(asPropertyTypeDeserializer.MediaBrowserCompatItemReceiver());
        if (iIconCompatParcelizer != 0) {
            return iIconCompatParcelizer;
        }
        asPropertyTypeDeserializer.AudioAttributesImplBaseParcelizer(4);
        while (asPropertyTypeDeserializer.IconCompatParcelizer() > 0) {
            int iIconCompatParcelizer2 = IconCompatParcelizer(asPropertyTypeDeserializer.MediaBrowserCompatItemReceiver());
            if (iIconCompatParcelizer2 != 0) {
                return iIconCompatParcelizer2;
            }
        }
        return 0;
    }

    static final class read {
        public final ObjectBuffer AudioAttributesCompatParcelizer;
        public int IconCompatParcelizer;
        public final nonNullString RemoteActionCompatParcelizer;
        public final initialCapacity read;
        public final nameOf write;

        public read(ObjectBuffer objectBuffer, initialCapacity initialcapacity, nonNullString nonnullstring) {
            this.AudioAttributesCompatParcelizer = objectBuffer;
            this.read = initialcapacity;
            this.RemoteActionCompatParcelizer = nonnullstring;
            this.write = MimeTypes.AUDIO_TRUEHD.equals(objectBuffer.write.onPlayFromUri) ? new nameOf() : null;
        }
    }
}
