package kotlin;

import com.google.android.exoplayer2.C;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.MapLikeType;
import kotlin.PropertySerializerMapEmpty;
import kotlin.StdKeySerializer;
import kotlin.UUIDSerializer;
import kotlin._resolveSuperClass;
import kotlin.constructCollectionType;

/* JADX INFO: loaded from: classes2.dex */
public final class PlaceholderForType<T extends MapLikeType> implements visitStringFormat, UUIDSerializer, constructCollectionType.RemoteActionCompatParcelizer<CollectionLikeType>, constructCollectionType.read {
    public final int AudioAttributesCompatParcelizer;
    private final int[] AudioAttributesImplApi21Parcelizer;
    private final T AudioAttributesImplApi26Parcelizer;
    private final boolean[] AudioAttributesImplBaseParcelizer;
    private final UUIDSerializer.RemoteActionCompatParcelizer<PlaceholderForType<T>> IconCompatParcelizer;
    private final C0170format[] MediaBrowserCompatCustomActionResultReceiver;
    private final visitIntFormat[] MediaBrowserCompatItemReceiver;
    private final ArrayList<ClassKey> MediaBrowserCompatMediaItem;
    private final _resolveSuperClass MediaBrowserCompatSearchResultReceiver;
    private int MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    private long MediaMetadataCompat;
    private CollectionLikeType RatingCompat;
    private final LogicalType RemoteActionCompatParcelizer;
    private final StdKeySerializer.read handleMediaPlayPauseIfPendingOnHandler;
    private C0170format onAddQueueItem;
    private long onCustomAction;
    private final visitIntFormat onFastForward;
    private final List<ClassKey> onPlay;
    private read<T> onPlayFromMediaId;
    boolean read;
    private ClassKey write;
    private final constructCollectionType MediaDescriptionCompat = new constructCollectionType("ChunkSampleStream");
    private final withKeyType onCommand = new withKeyType();

    public interface read<T extends MapLikeType> {
        void IconCompatParcelizer(PlaceholderForType<T> placeholderForType);
    }

    public PlaceholderForType(int i, int[] iArr, C0170format[] c0170formatArr, T t, UUIDSerializer.RemoteActionCompatParcelizer<PlaceholderForType<T>> remoteActionCompatParcelizer, _findWellKnownSimple _findwellknownsimple, long j, matchesUntyped matchesuntyped, PropertySerializerMapEmpty.read readVar, _resolveSuperClass _resolvesuperclass, StdKeySerializer.read readVar2) {
        this.AudioAttributesCompatParcelizer = i;
        this.AudioAttributesImplApi21Parcelizer = iArr;
        this.MediaBrowserCompatCustomActionResultReceiver = c0170formatArr;
        this.AudioAttributesImplApi26Parcelizer = t;
        this.IconCompatParcelizer = remoteActionCompatParcelizer;
        this.handleMediaPlayPauseIfPendingOnHandler = readVar2;
        this.MediaBrowserCompatSearchResultReceiver = _resolvesuperclass;
        ArrayList<ClassKey> arrayList = new ArrayList<>();
        this.MediaBrowserCompatMediaItem = arrayList;
        this.onPlay = Collections.unmodifiableList(arrayList);
        int length = iArr.length;
        this.MediaBrowserCompatItemReceiver = new visitIntFormat[length];
        this.AudioAttributesImplBaseParcelizer = new boolean[length];
        int i2 = length + 1;
        int[] iArr2 = new int[i2];
        visitIntFormat[] visitintformatArr = new visitIntFormat[i2];
        visitIntFormat visitintformatRemoteActionCompatParcelizer = visitIntFormat.RemoteActionCompatParcelizer(_findwellknownsimple, matchesuntyped, readVar);
        this.onFastForward = visitintformatRemoteActionCompatParcelizer;
        int i3 = 0;
        iArr2[0] = i;
        visitintformatArr[0] = visitintformatRemoteActionCompatParcelizer;
        while (i3 < length) {
            visitIntFormat visitintformatWrite = visitIntFormat.write(_findwellknownsimple);
            this.MediaBrowserCompatItemReceiver[i3] = visitintformatWrite;
            int i4 = i3 + 1;
            visitintformatArr[i4] = visitintformatWrite;
            iArr2[i4] = this.AudioAttributesImplApi21Parcelizer[i3];
            i3 = i4;
        }
        this.RemoteActionCompatParcelizer = new LogicalType(iArr2, visitintformatArr);
        this.onCustomAction = j;
        this.MediaMetadataCompat = j;
    }

    public final void IconCompatParcelizer(long j, boolean z) {
        if (RemoteActionCompatParcelizer()) {
            return;
        }
        int iIconCompatParcelizer = this.onFastForward.IconCompatParcelizer();
        this.onFastForward.RemoteActionCompatParcelizer(j, z, true);
        int iIconCompatParcelizer2 = this.onFastForward.IconCompatParcelizer();
        if (iIconCompatParcelizer2 > iIconCompatParcelizer) {
            long jAudioAttributesCompatParcelizer = this.onFastForward.AudioAttributesCompatParcelizer();
            int i = 0;
            while (true) {
                visitIntFormat[] visitintformatArr = this.MediaBrowserCompatItemReceiver;
                if (i >= visitintformatArr.length) {
                    break;
                }
                visitintformatArr[i].RemoteActionCompatParcelizer(jAudioAttributesCompatParcelizer, z, this.AudioAttributesImplBaseParcelizer[i]);
                i++;
            }
        }
        AudioAttributesCompatParcelizer(iIconCompatParcelizer2);
    }

    public final PlaceholderForType<T>.AudioAttributesCompatParcelizer AudioAttributesCompatParcelizer(long j, int i) {
        for (int i2 = 0; i2 < this.MediaBrowserCompatItemReceiver.length; i2++) {
            if (this.AudioAttributesImplApi21Parcelizer[i2] == i) {
                buildTypeSerializer.write(!this.AudioAttributesImplBaseParcelizer[i2]);
                this.AudioAttributesImplBaseParcelizer[i2] = true;
                this.MediaBrowserCompatItemReceiver[i2].RemoteActionCompatParcelizer(j, true);
                return new AudioAttributesCompatParcelizer(this, this.MediaBrowserCompatItemReceiver[i2], i2);
            }
        }
        throw new IllegalStateException();
    }

    public final T write() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    @Override // kotlin.UUIDSerializer
    public final long read() {
        if (this.read) {
            return Long.MIN_VALUE;
        }
        if (RemoteActionCompatParcelizer()) {
            return this.onCustomAction;
        }
        long jMax = this.MediaMetadataCompat;
        ClassKey classKeyMediaBrowserCompatCustomActionResultReceiver = MediaBrowserCompatCustomActionResultReceiver();
        if (!classKeyMediaBrowserCompatCustomActionResultReceiver.write()) {
            if (this.MediaBrowserCompatMediaItem.size() > 1) {
                classKeyMediaBrowserCompatCustomActionResultReceiver = this.MediaBrowserCompatMediaItem.get(r2.size() - 2);
            } else {
                classKeyMediaBrowserCompatCustomActionResultReceiver = null;
            }
        }
        if (classKeyMediaBrowserCompatCustomActionResultReceiver != null) {
            jMax = Math.max(jMax, classKeyMediaBrowserCompatCustomActionResultReceiver.AudioAttributesImplApi21Parcelizer);
        }
        return Math.max(jMax, this.onFastForward.MediaBrowserCompatCustomActionResultReceiver());
    }

    public final long read(long j, createKeySerializer createkeyserializer) {
        return this.AudioAttributesImplApi26Parcelizer.IconCompatParcelizer(j, createkeyserializer);
    }

    public final void read(long j) {
        ClassKey classKey;
        boolean zRemoteActionCompatParcelizer;
        this.MediaMetadataCompat = j;
        if (RemoteActionCompatParcelizer()) {
            this.onCustomAction = j;
            return;
        }
        int i = 0;
        for (int i2 = 0; i2 < this.MediaBrowserCompatMediaItem.size(); i2++) {
            classKey = this.MediaBrowserCompatMediaItem.get(i2);
            long j2 = classKey.MediaBrowserCompatItemReceiver;
            if (j2 == j && classKey.AudioAttributesCompatParcelizer == C.TIME_UNSET) {
                break;
            } else {
                if (j2 > j) {
                    break;
                }
            }
        }
        classKey = null;
        if (classKey != null) {
            zRemoteActionCompatParcelizer = this.onFastForward.AudioAttributesCompatParcelizer(classKey.IconCompatParcelizer(0));
        } else {
            zRemoteActionCompatParcelizer = this.onFastForward.RemoteActionCompatParcelizer(j, j < AudioAttributesCompatParcelizer());
        }
        if (zRemoteActionCompatParcelizer) {
            this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = AudioAttributesCompatParcelizer(this.onFastForward.AudioAttributesImplApi26Parcelizer(), 0);
            visitIntFormat[] visitintformatArr = this.MediaBrowserCompatItemReceiver;
            int length = visitintformatArr.length;
            while (i < length) {
                visitintformatArr[i].RemoteActionCompatParcelizer(j, true);
                i++;
            }
            return;
        }
        this.onCustomAction = j;
        this.read = false;
        this.MediaBrowserCompatMediaItem.clear();
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = 0;
        if (this.MediaDescriptionCompat.RemoteActionCompatParcelizer()) {
            this.onFastForward.read();
            visitIntFormat[] visitintformatArr2 = this.MediaBrowserCompatItemReceiver;
            int length2 = visitintformatArr2.length;
            while (i < length2) {
                visitintformatArr2[i].read();
                i++;
            }
            this.MediaDescriptionCompat.AudioAttributesCompatParcelizer();
            return;
        }
        this.MediaDescriptionCompat.write();
        AudioAttributesImplApi21Parcelizer();
    }

    public final void IconCompatParcelizer(read<T> readVar) {
        this.onPlayFromMediaId = readVar;
        this.onFastForward.RatingCompat();
        for (visitIntFormat visitintformat : this.MediaBrowserCompatItemReceiver) {
            visitintformat.RatingCompat();
        }
        this.MediaDescriptionCompat.read(this);
    }

    @Override // o.constructCollectionType.read
    public final void AudioAttributesImplBaseParcelizer() {
        this.onFastForward.onAddQueueItem();
        for (visitIntFormat visitintformat : this.MediaBrowserCompatItemReceiver) {
            visitintformat.onAddQueueItem();
        }
        this.AudioAttributesImplApi26Parcelizer.read();
        read<T> readVar = this.onPlayFromMediaId;
        if (readVar != null) {
            readVar.IconCompatParcelizer(this);
        }
    }

    @Override // kotlin.visitStringFormat
    public final boolean F_() {
        return !RemoteActionCompatParcelizer() && this.onFastForward.write(this.read);
    }

    @Override // kotlin.visitStringFormat
    public final void G_() throws IOException {
        this.MediaDescriptionCompat.read();
        this.onFastForward.MediaMetadataCompat();
        if (this.MediaDescriptionCompat.RemoteActionCompatParcelizer()) {
            return;
        }
        this.AudioAttributesImplApi26Parcelizer.AudioAttributesCompatParcelizer();
    }

    @Override // kotlin.visitStringFormat
    public final int AudioAttributesCompatParcelizer(ObjectNode objectNode, _find _findVar, int i) {
        if (RemoteActionCompatParcelizer()) {
            return -3;
        }
        ClassKey classKey = this.write;
        if (classKey != null && classKey.IconCompatParcelizer(0) <= this.onFastForward.AudioAttributesImplApi26Parcelizer()) {
            return -3;
        }
        MediaBrowserCompatItemReceiver();
        return this.onFastForward.read(objectNode, _findVar, i, this.read);
    }

    @Override // kotlin.visitStringFormat
    public final int IconCompatParcelizer(long j) {
        if (RemoteActionCompatParcelizer()) {
            return 0;
        }
        int iIconCompatParcelizer = this.onFastForward.IconCompatParcelizer(j, this.read);
        ClassKey classKey = this.write;
        if (classKey != null) {
            iIconCompatParcelizer = Math.min(iIconCompatParcelizer, classKey.IconCompatParcelizer(0) - this.onFastForward.AudioAttributesImplApi26Parcelizer());
        }
        this.onFastForward.write(iIconCompatParcelizer);
        MediaBrowserCompatItemReceiver();
        return iIconCompatParcelizer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // o.constructCollectionType.RemoteActionCompatParcelizer
    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public void RemoteActionCompatParcelizer(CollectionLikeType collectionLikeType, long j, long j2) {
        this.RatingCompat = null;
        this.AudioAttributesImplApi26Parcelizer.read(collectionLikeType);
        StdDelegatingSerializer stdDelegatingSerializer = new StdDelegatingSerializer(collectionLikeType.MediaBrowserCompatCustomActionResultReceiver, collectionLikeType.AudioAttributesImplApi26Parcelizer, collectionLikeType.AudioAttributesImplApi26Parcelizer(), collectionLikeType.AudioAttributesImplApi21Parcelizer(), j, j2, collectionLikeType.MediaBrowserCompatCustomActionResultReceiver());
        long j3 = collectionLikeType.MediaBrowserCompatCustomActionResultReceiver;
        this.handleMediaPlayPauseIfPendingOnHandler.RemoteActionCompatParcelizer(stdDelegatingSerializer, collectionLikeType.MediaBrowserCompatSearchResultReceiver, this.AudioAttributesCompatParcelizer, collectionLikeType.MediaDescriptionCompat, collectionLikeType.RatingCompat, collectionLikeType.MediaMetadataCompat, collectionLikeType.MediaBrowserCompatItemReceiver, collectionLikeType.AudioAttributesImplApi21Parcelizer);
        this.IconCompatParcelizer.RemoteActionCompatParcelizer(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // o.constructCollectionType.RemoteActionCompatParcelizer
    /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
    public void read(CollectionLikeType collectionLikeType, long j, long j2, boolean z) {
        this.RatingCompat = null;
        this.write = null;
        StdDelegatingSerializer stdDelegatingSerializer = new StdDelegatingSerializer(collectionLikeType.MediaBrowserCompatCustomActionResultReceiver, collectionLikeType.AudioAttributesImplApi26Parcelizer, collectionLikeType.AudioAttributesImplApi26Parcelizer(), collectionLikeType.AudioAttributesImplApi21Parcelizer(), j, j2, collectionLikeType.MediaBrowserCompatCustomActionResultReceiver());
        long j3 = collectionLikeType.MediaBrowserCompatCustomActionResultReceiver;
        this.handleMediaPlayPauseIfPendingOnHandler.AudioAttributesCompatParcelizer(stdDelegatingSerializer, collectionLikeType.MediaBrowserCompatSearchResultReceiver, this.AudioAttributesCompatParcelizer, collectionLikeType.MediaDescriptionCompat, collectionLikeType.RatingCompat, collectionLikeType.MediaMetadataCompat, collectionLikeType.MediaBrowserCompatItemReceiver, collectionLikeType.AudioAttributesImplApi21Parcelizer);
        if (z) {
            return;
        }
        if (RemoteActionCompatParcelizer()) {
            AudioAttributesImplApi21Parcelizer();
        } else if (RemoteActionCompatParcelizer(collectionLikeType)) {
            RemoteActionCompatParcelizer(this.MediaBrowserCompatMediaItem.size() - 1);
            if (this.MediaBrowserCompatMediaItem.isEmpty()) {
                this.onCustomAction = this.MediaMetadataCompat;
            }
        }
        this.IconCompatParcelizer.RemoteActionCompatParcelizer(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // o.constructCollectionType.RemoteActionCompatParcelizer
    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public constructCollectionType.write AudioAttributesCompatParcelizer(CollectionLikeType collectionLikeType, long j, long j2, IOException iOException, int i) {
        constructCollectionType.write writeVarRemoteActionCompatParcelizer;
        long jMediaBrowserCompatCustomActionResultReceiver = collectionLikeType.MediaBrowserCompatCustomActionResultReceiver();
        boolean zRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(collectionLikeType);
        int size = this.MediaBrowserCompatMediaItem.size() - 1;
        boolean z = (jMediaBrowserCompatCustomActionResultReceiver != 0 && zRemoteActionCompatParcelizer && IconCompatParcelizer(size)) ? false : true;
        StdDelegatingSerializer stdDelegatingSerializer = new StdDelegatingSerializer(collectionLikeType.MediaBrowserCompatCustomActionResultReceiver, collectionLikeType.AudioAttributesImplApi26Parcelizer, collectionLikeType.AudioAttributesImplApi26Parcelizer(), collectionLikeType.AudioAttributesImplApi21Parcelizer(), j, j2, jMediaBrowserCompatCustomActionResultReceiver);
        _resolveSuperClass.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = new _resolveSuperClass.AudioAttributesCompatParcelizer(stdDelegatingSerializer, new StdArraySerializersShortArraySerializer(collectionLikeType.MediaBrowserCompatSearchResultReceiver, this.AudioAttributesCompatParcelizer, collectionLikeType.MediaDescriptionCompat, collectionLikeType.RatingCompat, collectionLikeType.MediaMetadataCompat, LaissezFaireSubTypeValidator.AudioAttributesCompatParcelizer(collectionLikeType.MediaBrowserCompatItemReceiver), LaissezFaireSubTypeValidator.AudioAttributesCompatParcelizer(collectionLikeType.AudioAttributesImplApi21Parcelizer)), iOException, i);
        if (!this.AudioAttributesImplApi26Parcelizer.AudioAttributesCompatParcelizer(collectionLikeType, z, audioAttributesCompatParcelizer, this.MediaBrowserCompatSearchResultReceiver)) {
            writeVarRemoteActionCompatParcelizer = null;
        } else if (z) {
            writeVarRemoteActionCompatParcelizer = constructCollectionType.RemoteActionCompatParcelizer;
            if (zRemoteActionCompatParcelizer) {
                buildTypeSerializer.write(RemoteActionCompatParcelizer(size) == collectionLikeType);
                if (this.MediaBrowserCompatMediaItem.isEmpty()) {
                    this.onCustomAction = this.MediaMetadataCompat;
                }
            }
        } else {
            prune.RemoteActionCompatParcelizer("ChunkSampleStream", "Ignoring attempt to cancel non-cancelable load.");
            writeVarRemoteActionCompatParcelizer = null;
        }
        if (writeVarRemoteActionCompatParcelizer == null) {
            long jWrite = this.MediaBrowserCompatSearchResultReceiver.write(audioAttributesCompatParcelizer);
            if (jWrite != C.TIME_UNSET) {
                writeVarRemoteActionCompatParcelizer = constructCollectionType.RemoteActionCompatParcelizer(false, jWrite);
            } else {
                writeVarRemoteActionCompatParcelizer = constructCollectionType.IconCompatParcelizer;
            }
        }
        boolean z2 = writeVarRemoteActionCompatParcelizer.read();
        this.handleMediaPlayPauseIfPendingOnHandler.RemoteActionCompatParcelizer(stdDelegatingSerializer, collectionLikeType.MediaBrowserCompatSearchResultReceiver, this.AudioAttributesCompatParcelizer, collectionLikeType.MediaDescriptionCompat, collectionLikeType.RatingCompat, collectionLikeType.MediaMetadataCompat, collectionLikeType.MediaBrowserCompatItemReceiver, collectionLikeType.AudioAttributesImplApi21Parcelizer, iOException, !z2);
        if (!z2) {
            this.RatingCompat = null;
            long j3 = collectionLikeType.MediaBrowserCompatCustomActionResultReceiver;
            this.IconCompatParcelizer.RemoteActionCompatParcelizer(this);
        }
        return writeVarRemoteActionCompatParcelizer;
    }

    @Override // kotlin.UUIDSerializer
    public final boolean RemoteActionCompatParcelizer(_put _putVar) {
        List<ClassKey> listEmptyList;
        long j;
        if (this.read || this.MediaDescriptionCompat.RemoteActionCompatParcelizer() || this.MediaDescriptionCompat.IconCompatParcelizer()) {
            return false;
        }
        boolean zRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
        if (zRemoteActionCompatParcelizer) {
            listEmptyList = Collections.emptyList();
            j = this.onCustomAction;
        } else {
            listEmptyList = this.onPlay;
            j = MediaBrowserCompatCustomActionResultReceiver().AudioAttributesImplApi21Parcelizer;
        }
        this.AudioAttributesImplApi26Parcelizer.IconCompatParcelizer(_putVar, j, listEmptyList, this.onCommand);
        boolean z = this.onCommand.read;
        CollectionLikeType collectionLikeType = this.onCommand.write;
        this.onCommand.read();
        if (z) {
            this.onCustomAction = C.TIME_UNSET;
            this.read = true;
            return true;
        }
        if (collectionLikeType == null) {
            return false;
        }
        this.RatingCompat = collectionLikeType;
        if (RemoteActionCompatParcelizer(collectionLikeType)) {
            ClassKey classKey = (ClassKey) collectionLikeType;
            if (zRemoteActionCompatParcelizer) {
                long j2 = classKey.MediaBrowserCompatItemReceiver;
                long j3 = this.onCustomAction;
                if (j2 != j3) {
                    this.onFastForward.AudioAttributesCompatParcelizer(j3);
                    for (visitIntFormat visitintformat : this.MediaBrowserCompatItemReceiver) {
                        visitintformat.AudioAttributesCompatParcelizer(this.onCustomAction);
                    }
                }
                this.onCustomAction = C.TIME_UNSET;
            }
            classKey.write(this.RemoteActionCompatParcelizer);
            this.MediaBrowserCompatMediaItem.add(classKey);
        } else if (collectionLikeType instanceof actualType) {
            ((actualType) collectionLikeType).RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer);
        }
        this.handleMediaPlayPauseIfPendingOnHandler.write(new StdDelegatingSerializer(collectionLikeType.MediaBrowserCompatCustomActionResultReceiver, collectionLikeType.AudioAttributesImplApi26Parcelizer, this.MediaDescriptionCompat.read(collectionLikeType, this, this.MediaBrowserCompatSearchResultReceiver.write(collectionLikeType.MediaBrowserCompatSearchResultReceiver))), collectionLikeType.MediaBrowserCompatSearchResultReceiver, this.AudioAttributesCompatParcelizer, collectionLikeType.MediaDescriptionCompat, collectionLikeType.RatingCompat, collectionLikeType.MediaMetadataCompat, collectionLikeType.MediaBrowserCompatItemReceiver, collectionLikeType.AudioAttributesImplApi21Parcelizer);
        return true;
    }

    @Override // kotlin.UUIDSerializer
    public final boolean IconCompatParcelizer() {
        return this.MediaDescriptionCompat.RemoteActionCompatParcelizer();
    }

    @Override // kotlin.UUIDSerializer
    public final long AudioAttributesCompatParcelizer() {
        if (RemoteActionCompatParcelizer()) {
            return this.onCustomAction;
        }
        if (this.read) {
            return Long.MIN_VALUE;
        }
        return MediaBrowserCompatCustomActionResultReceiver().AudioAttributesImplApi21Parcelizer;
    }

    @Override // kotlin.UUIDSerializer
    public final void RemoteActionCompatParcelizer(long j) {
        if (this.MediaDescriptionCompat.IconCompatParcelizer() || RemoteActionCompatParcelizer()) {
            return;
        }
        if (this.MediaDescriptionCompat.RemoteActionCompatParcelizer()) {
            CollectionLikeType collectionLikeType = (CollectionLikeType) buildTypeSerializer.IconCompatParcelizer(this.RatingCompat);
            if (!(RemoteActionCompatParcelizer(collectionLikeType) && IconCompatParcelizer(this.MediaBrowserCompatMediaItem.size() - 1)) && this.AudioAttributesImplApi26Parcelizer.AudioAttributesCompatParcelizer(j, collectionLikeType, this.onPlay)) {
                this.MediaDescriptionCompat.AudioAttributesCompatParcelizer();
                if (RemoteActionCompatParcelizer(collectionLikeType)) {
                    this.write = (ClassKey) collectionLikeType;
                    return;
                }
                return;
            }
            return;
        }
        int i = this.AudioAttributesImplApi26Parcelizer.read(j, this.onPlay);
        if (i < this.MediaBrowserCompatMediaItem.size()) {
            write(i);
        }
    }

    private void write(int i) {
        buildTypeSerializer.write(!this.MediaDescriptionCompat.RemoteActionCompatParcelizer());
        int size = this.MediaBrowserCompatMediaItem.size();
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (!IconCompatParcelizer(i)) {
                break;
            } else {
                i++;
            }
        }
        if (i == -1) {
            return;
        }
        long j = MediaBrowserCompatCustomActionResultReceiver().AudioAttributesImplApi21Parcelizer;
        ClassKey classKeyRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(i);
        if (this.MediaBrowserCompatMediaItem.isEmpty()) {
            this.onCustomAction = this.MediaMetadataCompat;
        }
        this.read = false;
        this.handleMediaPlayPauseIfPendingOnHandler.write(this.AudioAttributesCompatParcelizer, classKeyRemoteActionCompatParcelizer.MediaBrowserCompatItemReceiver, j);
    }

    private static boolean RemoteActionCompatParcelizer(CollectionLikeType collectionLikeType) {
        return collectionLikeType instanceof ClassKey;
    }

    private void AudioAttributesImplApi21Parcelizer() {
        this.onFastForward.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
        for (visitIntFormat visitintformat : this.MediaBrowserCompatItemReceiver) {
            visitintformat.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
        }
    }

    private boolean IconCompatParcelizer(int i) {
        int iAudioAttributesImplApi26Parcelizer;
        ClassKey classKey = this.MediaBrowserCompatMediaItem.get(i);
        if (this.onFastForward.AudioAttributesImplApi26Parcelizer() > classKey.IconCompatParcelizer(0)) {
            return true;
        }
        int i2 = 0;
        do {
            visitIntFormat[] visitintformatArr = this.MediaBrowserCompatItemReceiver;
            if (i2 >= visitintformatArr.length) {
                return false;
            }
            iAudioAttributesImplApi26Parcelizer = visitintformatArr[i2].AudioAttributesImplApi26Parcelizer();
            i2++;
        } while (iAudioAttributesImplApi26Parcelizer <= classKey.IconCompatParcelizer(i2));
        return true;
    }

    final boolean RemoteActionCompatParcelizer() {
        return this.onCustomAction != C.TIME_UNSET;
    }

    private void AudioAttributesCompatParcelizer(int i) {
        int iMin = Math.min(AudioAttributesCompatParcelizer(i, 0), this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver);
        if (iMin > 0) {
            LaissezFaireSubTypeValidator.RemoteActionCompatParcelizer(this.MediaBrowserCompatMediaItem, 0, iMin);
            this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver -= iMin;
        }
    }

    private void MediaBrowserCompatItemReceiver() {
        int iAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(this.onFastForward.AudioAttributesImplApi26Parcelizer(), this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver - 1);
        while (true) {
            int i = this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
            if (i > iAudioAttributesCompatParcelizer) {
                return;
            }
            this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = i + 1;
            read(i);
        }
    }

    private void read(int i) {
        ClassKey classKey = this.MediaBrowserCompatMediaItem.get(i);
        C0170format c0170format = classKey.MediaDescriptionCompat;
        if (!c0170format.equals(this.onAddQueueItem)) {
            this.handleMediaPlayPauseIfPendingOnHandler.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, c0170format, classKey.RatingCompat, classKey.MediaMetadataCompat, classKey.MediaBrowserCompatItemReceiver);
        }
        this.onAddQueueItem = c0170format;
    }

    private int AudioAttributesCompatParcelizer(int i, int i2) {
        while (true) {
            int i3 = i2 + 1;
            if (i3 < this.MediaBrowserCompatMediaItem.size()) {
                if (this.MediaBrowserCompatMediaItem.get(i3).IconCompatParcelizer(0) > i) {
                    return i2;
                }
                i2 = i3;
            } else {
                return this.MediaBrowserCompatMediaItem.size() - 1;
            }
        }
    }

    private ClassKey MediaBrowserCompatCustomActionResultReceiver() {
        return this.MediaBrowserCompatMediaItem.get(r1.size() - 1);
    }

    private ClassKey RemoteActionCompatParcelizer(int i) {
        ClassKey classKey = this.MediaBrowserCompatMediaItem.get(i);
        ArrayList<ClassKey> arrayList = this.MediaBrowserCompatMediaItem;
        LaissezFaireSubTypeValidator.RemoteActionCompatParcelizer(arrayList, i, arrayList.size());
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = Math.max(this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, this.MediaBrowserCompatMediaItem.size());
        int i2 = 0;
        this.onFastForward.IconCompatParcelizer(classKey.IconCompatParcelizer(0));
        while (true) {
            visitIntFormat[] visitintformatArr = this.MediaBrowserCompatItemReceiver;
            if (i2 >= visitintformatArr.length) {
                return classKey;
            }
            visitIntFormat visitintformat = visitintformatArr[i2];
            i2++;
            visitintformat.IconCompatParcelizer(classKey.IconCompatParcelizer(i2));
        }
    }

    public final class AudioAttributesCompatParcelizer implements visitStringFormat {
        private final visitIntFormat AudioAttributesCompatParcelizer;
        public final PlaceholderForType<T> IconCompatParcelizer;
        private final int RemoteActionCompatParcelizer;
        private boolean write;

        @Override // kotlin.visitStringFormat
        public final void G_() {
        }

        public AudioAttributesCompatParcelizer(PlaceholderForType<T> placeholderForType, visitIntFormat visitintformat, int i) {
            this.IconCompatParcelizer = placeholderForType;
            this.AudioAttributesCompatParcelizer = visitintformat;
            this.RemoteActionCompatParcelizer = i;
        }

        @Override // kotlin.visitStringFormat
        public final boolean F_() {
            return !PlaceholderForType.this.RemoteActionCompatParcelizer() && this.AudioAttributesCompatParcelizer.write(PlaceholderForType.this.read);
        }

        @Override // kotlin.visitStringFormat
        public final int IconCompatParcelizer(long j) {
            if (PlaceholderForType.this.RemoteActionCompatParcelizer()) {
                return 0;
            }
            int iIconCompatParcelizer = this.AudioAttributesCompatParcelizer.IconCompatParcelizer(j, PlaceholderForType.this.read);
            if (PlaceholderForType.this.write != null) {
                iIconCompatParcelizer = Math.min(iIconCompatParcelizer, PlaceholderForType.this.write.IconCompatParcelizer(this.RemoteActionCompatParcelizer + 1) - this.AudioAttributesCompatParcelizer.AudioAttributesImplApi26Parcelizer());
            }
            this.AudioAttributesCompatParcelizer.write(iIconCompatParcelizer);
            if (iIconCompatParcelizer > 0) {
                write();
            }
            return iIconCompatParcelizer;
        }

        @Override // kotlin.visitStringFormat
        public final int AudioAttributesCompatParcelizer(ObjectNode objectNode, _find _findVar, int i) {
            if (PlaceholderForType.this.RemoteActionCompatParcelizer()) {
                return -3;
            }
            if (PlaceholderForType.this.write != null && PlaceholderForType.this.write.IconCompatParcelizer(this.RemoteActionCompatParcelizer + 1) <= this.AudioAttributesCompatParcelizer.AudioAttributesImplApi26Parcelizer()) {
                return -3;
            }
            write();
            return this.AudioAttributesCompatParcelizer.read(objectNode, _findVar, i, PlaceholderForType.this.read);
        }

        public final void read() {
            buildTypeSerializer.write(PlaceholderForType.this.AudioAttributesImplBaseParcelizer[this.RemoteActionCompatParcelizer]);
            PlaceholderForType.this.AudioAttributesImplBaseParcelizer[this.RemoteActionCompatParcelizer] = false;
        }

        private void write() {
            if (this.write) {
                return;
            }
            PlaceholderForType.this.handleMediaPlayPauseIfPendingOnHandler.RemoteActionCompatParcelizer(PlaceholderForType.this.AudioAttributesImplApi21Parcelizer[this.RemoteActionCompatParcelizer], PlaceholderForType.this.MediaBrowserCompatCustomActionResultReceiver[this.RemoteActionCompatParcelizer], 0, null, PlaceholderForType.this.MediaMetadataCompat);
            this.write = true;
        }
    }
}
