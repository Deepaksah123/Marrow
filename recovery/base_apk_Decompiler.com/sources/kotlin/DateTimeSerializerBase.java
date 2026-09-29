package kotlin;

import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import com.google.android.exoplayer2.C;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.EnumSerializer;
import kotlin.StdKeySerializer;
import kotlin._acceptJsonFormatVisitor;
import kotlin._deserializeWithNativeTypeId;
import kotlin._resolveSuperClass;
import kotlin._serializeAsIndex;
import kotlin._serializeAsString;
import kotlin.constructCollectionType;

/* JADX INFO: loaded from: classes2.dex */
public final class DateTimeSerializerBase implements _serializeAsIndex, constructCollectionType.RemoteActionCompatParcelizer<constructGeneralizedType<_asTimestamp>> {
    public static final _serializeAsIndex.AudioAttributesCompatParcelizer AudioAttributesCompatParcelizer = new _serializeAsIndex.AudioAttributesCompatParcelizer() { // from class: o.CollectionSerializer
        @Override // o._serializeAsIndex.AudioAttributesCompatParcelizer
        public final _serializeAsIndex read(_getReferenced _getreferenced, _resolveSuperClass _resolvesuperclass, _isShapeWrittenUsingIndex _isshapewrittenusingindex) {
            return new DateTimeSerializerBase(_getreferenced, _resolvesuperclass, _isshapewrittenusingindex);
        }
    };
    private final CopyOnWriteArrayList<_serializeAsIndex.read> AudioAttributesImplApi21Parcelizer;
    private final HashMap<Uri, RemoteActionCompatParcelizer> AudioAttributesImplApi26Parcelizer;
    private final _resolveSuperClass AudioAttributesImplBaseParcelizer;
    private constructCollectionType IconCompatParcelizer;
    private EnumSerializer MediaBrowserCompatCustomActionResultReceiver;
    private boolean MediaBrowserCompatItemReceiver;
    private final double MediaBrowserCompatMediaItem;
    private final _isShapeWrittenUsingIndex MediaBrowserCompatSearchResultReceiver;
    private _acceptJsonFormatVisitor MediaDescriptionCompat;
    private Handler MediaMetadataCompat;
    private Uri RatingCompat;
    private StdKeySerializer.read RemoteActionCompatParcelizer;
    private _serializeAsIndex.write handleMediaPlayPauseIfPendingOnHandler;
    private final _getReferenced read;
    private long write;

    @Override // o.constructCollectionType.RemoteActionCompatParcelizer
    public final /* synthetic */ void read(constructCollectionType.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer, long j, long j2, boolean z) {
        write((constructGeneralizedType) audioAttributesCompatParcelizer, j, j2);
    }

    public DateTimeSerializerBase(_getReferenced _getreferenced, _resolveSuperClass _resolvesuperclass, _isShapeWrittenUsingIndex _isshapewrittenusingindex) {
        this(_getreferenced, _resolvesuperclass, _isshapewrittenusingindex, (byte) 0);
    }

    private DateTimeSerializerBase(_getReferenced _getreferenced, _resolveSuperClass _resolvesuperclass, _isShapeWrittenUsingIndex _isshapewrittenusingindex, byte b) {
        this.read = _getreferenced;
        this.MediaBrowserCompatSearchResultReceiver = _isshapewrittenusingindex;
        this.AudioAttributesImplBaseParcelizer = _resolvesuperclass;
        this.MediaBrowserCompatMediaItem = 3.5d;
        this.AudioAttributesImplApi21Parcelizer = new CopyOnWriteArrayList<>();
        this.AudioAttributesImplApi26Parcelizer = new HashMap<>();
        this.write = C.TIME_UNSET;
    }

    @Override // kotlin._serializeAsIndex
    public final void read(Uri uri, StdKeySerializer.read readVar, _serializeAsIndex.write writeVar) {
        this.MediaMetadataCompat = LaissezFaireSubTypeValidator.RemoteActionCompatParcelizer();
        this.RemoteActionCompatParcelizer = readVar;
        this.handleMediaPlayPauseIfPendingOnHandler = writeVar;
        constructGeneralizedType constructgeneralizedtype = new constructGeneralizedType(this.read.write(), uri, 4, this.MediaBrowserCompatSearchResultReceiver.read());
        buildTypeSerializer.write(this.IconCompatParcelizer == null);
        constructCollectionType constructcollectiontype = new constructCollectionType("DefaultHlsPlaylistTracker:MultivariantPlaylist");
        this.IconCompatParcelizer = constructcollectiontype;
        readVar.AudioAttributesCompatParcelizer(new StdDelegatingSerializer(constructgeneralizedtype.RemoteActionCompatParcelizer, constructgeneralizedtype.write, constructcollectiontype.read(constructgeneralizedtype, this, this.AudioAttributesImplBaseParcelizer.write(constructgeneralizedtype.read))), constructgeneralizedtype.read);
    }

    @Override // kotlin._serializeAsIndex
    public final void RemoteActionCompatParcelizer() {
        this.RatingCompat = null;
        this.MediaDescriptionCompat = null;
        this.MediaBrowserCompatCustomActionResultReceiver = null;
        this.write = C.TIME_UNSET;
        this.IconCompatParcelizer.AudioAttributesImplBaseParcelizer();
        this.IconCompatParcelizer = null;
        Iterator<RemoteActionCompatParcelizer> it = this.AudioAttributesImplApi26Parcelizer.values().iterator();
        while (it.hasNext()) {
            it.next().RemoteActionCompatParcelizer();
        }
        this.MediaMetadataCompat.removeCallbacksAndMessages(null);
        this.MediaMetadataCompat = null;
        this.AudioAttributesImplApi26Parcelizer.clear();
    }

    @Override // kotlin._serializeAsIndex
    public final void read(_serializeAsIndex.read readVar) {
        this.AudioAttributesImplApi21Parcelizer.add(readVar);
    }

    @Override // kotlin._serializeAsIndex
    public final void RemoteActionCompatParcelizer(_serializeAsIndex.read readVar) {
        this.AudioAttributesImplApi21Parcelizer.remove(readVar);
    }

    @Override // kotlin._serializeAsIndex
    public final EnumSerializer AudioAttributesCompatParcelizer() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    @Override // kotlin._serializeAsIndex
    public final _acceptJsonFormatVisitor IconCompatParcelizer(Uri uri, boolean z) {
        _acceptJsonFormatVisitor _acceptjsonformatvisitor = this.AudioAttributesImplApi26Parcelizer.get(uri).read();
        if (_acceptjsonformatvisitor != null && z) {
            MediaBrowserCompatCustomActionResultReceiver(uri);
            AudioAttributesImplApi26Parcelizer(uri);
        }
        return _acceptjsonformatvisitor;
    }

    @Override // kotlin._serializeAsIndex
    public final long write() {
        return this.write;
    }

    @Override // kotlin._serializeAsIndex
    public final boolean AudioAttributesCompatParcelizer(Uri uri) {
        return this.AudioAttributesImplApi26Parcelizer.get(uri).write();
    }

    @Override // kotlin._serializeAsIndex
    public final void read() throws IOException {
        constructCollectionType constructcollectiontype = this.IconCompatParcelizer;
        if (constructcollectiontype != null) {
            constructcollectiontype.read();
        }
        Uri uri = this.RatingCompat;
        if (uri != null) {
            RemoteActionCompatParcelizer(uri);
        }
    }

    @Override // kotlin._serializeAsIndex
    public final void RemoteActionCompatParcelizer(Uri uri) throws IOException {
        this.AudioAttributesImplApi26Parcelizer.get(uri).AudioAttributesCompatParcelizer();
    }

    @Override // kotlin._serializeAsIndex
    public final void write(Uri uri) {
        this.AudioAttributesImplApi26Parcelizer.get(uri).IconCompatParcelizer(true);
    }

    @Override // kotlin._serializeAsIndex
    public final boolean IconCompatParcelizer() {
        return this.MediaBrowserCompatItemReceiver;
    }

    @Override // kotlin._serializeAsIndex
    public final boolean write(Uri uri, long j) {
        if (this.AudioAttributesImplApi26Parcelizer.get(uri) != null) {
            return !r0.RemoteActionCompatParcelizer(j);
        }
        return false;
    }

    @Override // kotlin._serializeAsIndex
    public final void IconCompatParcelizer(Uri uri) {
        RemoteActionCompatParcelizer remoteActionCompatParcelizer = this.AudioAttributesImplApi26Parcelizer.get(uri);
        if (remoteActionCompatParcelizer != null) {
            remoteActionCompatParcelizer.write(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // o.constructCollectionType.RemoteActionCompatParcelizer
    public void RemoteActionCompatParcelizer(constructGeneralizedType<_asTimestamp> constructgeneralizedtype, long j, long j2) {
        EnumSerializer enumSerializerRemoteActionCompatParcelizer;
        _asTimestamp _astimestampRemoteActionCompatParcelizer = constructgeneralizedtype.RemoteActionCompatParcelizer();
        boolean z = _astimestampRemoteActionCompatParcelizer instanceof _acceptJsonFormatVisitor;
        if (z) {
            enumSerializerRemoteActionCompatParcelizer = EnumSerializer.RemoteActionCompatParcelizer(_astimestampRemoteActionCompatParcelizer.handleMediaPlayPauseIfPendingOnHandler);
        } else {
            enumSerializerRemoteActionCompatParcelizer = (EnumSerializer) _astimestampRemoteActionCompatParcelizer;
        }
        this.MediaBrowserCompatCustomActionResultReceiver = enumSerializerRemoteActionCompatParcelizer;
        this.RatingCompat = enumSerializerRemoteActionCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver.get(0).read;
        this.AudioAttributesImplApi21Parcelizer.add(new AudioAttributesCompatParcelizer(this, (byte) 0));
        read(enumSerializerRemoteActionCompatParcelizer.IconCompatParcelizer);
        StdDelegatingSerializer stdDelegatingSerializer = new StdDelegatingSerializer(constructgeneralizedtype.RemoteActionCompatParcelizer, constructgeneralizedtype.write, constructgeneralizedtype.MediaBrowserCompatCustomActionResultReceiver(), constructgeneralizedtype.read(), j, j2, constructgeneralizedtype.write());
        RemoteActionCompatParcelizer remoteActionCompatParcelizer = this.AudioAttributesImplApi26Parcelizer.get(this.RatingCompat);
        if (!z) {
            remoteActionCompatParcelizer.IconCompatParcelizer(false);
        } else {
            remoteActionCompatParcelizer.write((_acceptJsonFormatVisitor) _astimestampRemoteActionCompatParcelizer, stdDelegatingSerializer);
        }
        long j3 = constructgeneralizedtype.RemoteActionCompatParcelizer;
        this.RemoteActionCompatParcelizer.read(stdDelegatingSerializer, 4);
    }

    private void write(constructGeneralizedType<_asTimestamp> constructgeneralizedtype, long j, long j2) {
        StdDelegatingSerializer stdDelegatingSerializer = new StdDelegatingSerializer(constructgeneralizedtype.RemoteActionCompatParcelizer, constructgeneralizedtype.write, constructgeneralizedtype.MediaBrowserCompatCustomActionResultReceiver(), constructgeneralizedtype.read(), j, j2, constructgeneralizedtype.write());
        long j3 = constructgeneralizedtype.RemoteActionCompatParcelizer;
        this.RemoteActionCompatParcelizer.IconCompatParcelizer(stdDelegatingSerializer, 4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // o.constructCollectionType.RemoteActionCompatParcelizer
    /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public constructCollectionType.write AudioAttributesCompatParcelizer(constructGeneralizedType<_asTimestamp> constructgeneralizedtype, long j, long j2, IOException iOException, int i) {
        StdDelegatingSerializer stdDelegatingSerializer = new StdDelegatingSerializer(constructgeneralizedtype.RemoteActionCompatParcelizer, constructgeneralizedtype.write, constructgeneralizedtype.MediaBrowserCompatCustomActionResultReceiver(), constructgeneralizedtype.read(), j, j2, constructgeneralizedtype.write());
        long jWrite = this.AudioAttributesImplBaseParcelizer.write(new _resolveSuperClass.AudioAttributesCompatParcelizer(stdDelegatingSerializer, new StdArraySerializersShortArraySerializer(constructgeneralizedtype.read), iOException, i));
        boolean z = jWrite == C.TIME_UNSET;
        this.RemoteActionCompatParcelizer.read(stdDelegatingSerializer, constructgeneralizedtype.read, iOException, z);
        if (z) {
            long j3 = constructgeneralizedtype.RemoteActionCompatParcelizer;
        }
        if (z) {
            return constructCollectionType.IconCompatParcelizer;
        }
        return constructCollectionType.RemoteActionCompatParcelizer(false, jWrite);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean MediaBrowserCompatCustomActionResultReceiver() {
        List<EnumSerializer.IconCompatParcelizer> list = this.MediaBrowserCompatCustomActionResultReceiver.MediaBrowserCompatCustomActionResultReceiver;
        int size = list.size();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        for (int i = 0; i < size; i++) {
            RemoteActionCompatParcelizer remoteActionCompatParcelizer = (RemoteActionCompatParcelizer) buildTypeSerializer.IconCompatParcelizer(this.AudioAttributesImplApi26Parcelizer.get(list.get(i).read));
            if (jElapsedRealtime > remoteActionCompatParcelizer.RemoteActionCompatParcelizer) {
                Uri uri = remoteActionCompatParcelizer.MediaDescriptionCompat;
                this.RatingCompat = uri;
                remoteActionCompatParcelizer.IconCompatParcelizer(read(uri));
                return true;
            }
        }
        return false;
    }

    private void MediaBrowserCompatCustomActionResultReceiver(Uri uri) {
        if (uri.equals(this.RatingCompat) || !AudioAttributesImplApi21Parcelizer(uri)) {
            return;
        }
        _acceptJsonFormatVisitor _acceptjsonformatvisitor = this.MediaDescriptionCompat;
        if (_acceptjsonformatvisitor == null || !_acceptjsonformatvisitor.RemoteActionCompatParcelizer) {
            this.RatingCompat = uri;
            RemoteActionCompatParcelizer remoteActionCompatParcelizer = this.AudioAttributesImplApi26Parcelizer.get(uri);
            _acceptJsonFormatVisitor _acceptjsonformatvisitor2 = remoteActionCompatParcelizer.RatingCompat;
            if (_acceptjsonformatvisitor2 != null && _acceptjsonformatvisitor2.RemoteActionCompatParcelizer) {
                this.MediaDescriptionCompat = _acceptjsonformatvisitor2;
                this.handleMediaPlayPauseIfPendingOnHandler.onPrimaryPlaylistRefreshed(_acceptjsonformatvisitor2);
            } else {
                remoteActionCompatParcelizer.IconCompatParcelizer(read(uri));
            }
        }
    }

    private void AudioAttributesImplApi26Parcelizer(Uri uri) {
        RemoteActionCompatParcelizer remoteActionCompatParcelizer = this.AudioAttributesImplApi26Parcelizer.get(uri);
        _acceptJsonFormatVisitor _acceptjsonformatvisitor = remoteActionCompatParcelizer.read();
        if (remoteActionCompatParcelizer.IconCompatParcelizer()) {
            return;
        }
        remoteActionCompatParcelizer.write(true);
        if (_acceptjsonformatvisitor == null || _acceptjsonformatvisitor.RemoteActionCompatParcelizer) {
            return;
        }
        remoteActionCompatParcelizer.IconCompatParcelizer(true);
    }

    private Uri read(Uri uri) {
        _acceptJsonFormatVisitor.IconCompatParcelizer iconCompatParcelizer;
        _acceptJsonFormatVisitor _acceptjsonformatvisitor = this.MediaDescriptionCompat;
        if (_acceptjsonformatvisitor == null || !_acceptjsonformatvisitor.RatingCompat.IconCompatParcelizer || (iconCompatParcelizer = this.MediaDescriptionCompat.MediaBrowserCompatSearchResultReceiver.get(uri)) == null) {
            return uri;
        }
        Uri.Builder builderBuildUpon = uri.buildUpon();
        builderBuildUpon.appendQueryParameter("_HLS_msn", String.valueOf(iconCompatParcelizer.RemoteActionCompatParcelizer));
        if (iconCompatParcelizer.IconCompatParcelizer != -1) {
            builderBuildUpon.appendQueryParameter("_HLS_part", String.valueOf(iconCompatParcelizer.IconCompatParcelizer));
        }
        return builderBuildUpon.build();
    }

    private boolean AudioAttributesImplApi21Parcelizer(Uri uri) {
        List<EnumSerializer.IconCompatParcelizer> list = this.MediaBrowserCompatCustomActionResultReceiver.MediaBrowserCompatCustomActionResultReceiver;
        for (int i = 0; i < list.size(); i++) {
            if (uri.equals(list.get(i).read)) {
                return true;
            }
        }
        return false;
    }

    private void read(List<Uri> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Uri uri = list.get(i);
            this.AudioAttributesImplApi26Parcelizer.put(uri, new RemoteActionCompatParcelizer(uri));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void read(Uri uri, _acceptJsonFormatVisitor _acceptjsonformatvisitor) {
        if (uri.equals(this.RatingCompat)) {
            if (this.MediaDescriptionCompat == null) {
                this.MediaBrowserCompatItemReceiver = !_acceptjsonformatvisitor.RemoteActionCompatParcelizer;
                this.write = _acceptjsonformatvisitor.onCommand;
            }
            this.MediaDescriptionCompat = _acceptjsonformatvisitor;
            this.handleMediaPlayPauseIfPendingOnHandler.onPrimaryPlaylistRefreshed(_acceptjsonformatvisitor);
        }
        Iterator<_serializeAsIndex.read> it = this.AudioAttributesImplApi21Parcelizer.iterator();
        while (it.hasNext()) {
            it.next().AudioAttributesImplApi26Parcelizer();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean read(Uri uri, _resolveSuperClass.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer, boolean z) {
        Iterator<_serializeAsIndex.read> it = this.AudioAttributesImplApi21Parcelizer.iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            z2 |= !it.next().write(uri, audioAttributesCompatParcelizer, z);
        }
        return z2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public _acceptJsonFormatVisitor AudioAttributesCompatParcelizer(_acceptJsonFormatVisitor _acceptjsonformatvisitor, _acceptJsonFormatVisitor _acceptjsonformatvisitor2) {
        if (_acceptjsonformatvisitor2.write(_acceptjsonformatvisitor)) {
            return _acceptjsonformatvisitor2.write(RemoteActionCompatParcelizer(_acceptjsonformatvisitor, _acceptjsonformatvisitor2), IconCompatParcelizer(_acceptjsonformatvisitor, _acceptjsonformatvisitor2));
        }
        return _acceptjsonformatvisitor2.RemoteActionCompatParcelizer ? _acceptjsonformatvisitor.RemoteActionCompatParcelizer() : _acceptjsonformatvisitor;
    }

    private long RemoteActionCompatParcelizer(_acceptJsonFormatVisitor _acceptjsonformatvisitor, _acceptJsonFormatVisitor _acceptjsonformatvisitor2) {
        if (_acceptjsonformatvisitor2.AudioAttributesImplApi26Parcelizer) {
            return _acceptjsonformatvisitor2.onCommand;
        }
        _acceptJsonFormatVisitor _acceptjsonformatvisitor3 = this.MediaDescriptionCompat;
        long j = _acceptjsonformatvisitor3 != null ? _acceptjsonformatvisitor3.onCommand : 0L;
        if (_acceptjsonformatvisitor != null) {
            int size = _acceptjsonformatvisitor.MediaDescriptionCompat.size();
            _acceptJsonFormatVisitor.write writeVar = read(_acceptjsonformatvisitor, _acceptjsonformatvisitor2);
            if (writeVar != null) {
                return _acceptjsonformatvisitor.onCommand + writeVar.MediaBrowserCompatMediaItem;
            }
            if (size == _acceptjsonformatvisitor2.AudioAttributesImplBaseParcelizer - _acceptjsonformatvisitor.AudioAttributesImplBaseParcelizer) {
                return _acceptjsonformatvisitor.IconCompatParcelizer();
            }
        }
        return j;
    }

    private int IconCompatParcelizer(_acceptJsonFormatVisitor _acceptjsonformatvisitor, _acceptJsonFormatVisitor _acceptjsonformatvisitor2) {
        _acceptJsonFormatVisitor.write writeVar;
        if (_acceptjsonformatvisitor2.IconCompatParcelizer) {
            return _acceptjsonformatvisitor2.write;
        }
        _acceptJsonFormatVisitor _acceptjsonformatvisitor3 = this.MediaDescriptionCompat;
        int i = _acceptjsonformatvisitor3 != null ? _acceptjsonformatvisitor3.write : 0;
        return (_acceptjsonformatvisitor == null || (writeVar = read(_acceptjsonformatvisitor, _acceptjsonformatvisitor2)) == null) ? i : (_acceptjsonformatvisitor.write + writeVar.MediaMetadataCompat) - _acceptjsonformatvisitor2.MediaDescriptionCompat.get(0).MediaMetadataCompat;
    }

    private static _acceptJsonFormatVisitor.write read(_acceptJsonFormatVisitor _acceptjsonformatvisitor, _acceptJsonFormatVisitor _acceptjsonformatvisitor2) {
        int i = (int) (_acceptjsonformatvisitor2.AudioAttributesImplBaseParcelizer - _acceptjsonformatvisitor.AudioAttributesImplBaseParcelizer);
        List<_acceptJsonFormatVisitor.write> list = _acceptjsonformatvisitor.MediaDescriptionCompat;
        if (i < list.size()) {
            return list.get(i);
        }
        return null;
    }

    final class RemoteActionCompatParcelizer implements constructCollectionType.RemoteActionCompatParcelizer<constructGeneralizedType<_asTimestamp>> {
        private long AudioAttributesCompatParcelizer;
        private boolean AudioAttributesImplApi21Parcelizer;
        private long AudioAttributesImplApi26Parcelizer;
        private IOException AudioAttributesImplBaseParcelizer;
        private final _hasTypeResolver MediaBrowserCompatCustomActionResultReceiver;
        private final constructCollectionType MediaBrowserCompatItemReceiver = new constructCollectionType("DefaultHlsPlaylistTracker:MediaPlaylist");
        private final Uri MediaDescriptionCompat;
        private _acceptJsonFormatVisitor RatingCompat;
        private long RemoteActionCompatParcelizer;
        private boolean read;
        private long write;

        @Override // o.constructCollectionType.RemoteActionCompatParcelizer
        public final /* bridge */ /* synthetic */ void read(constructCollectionType.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer, long j, long j2, boolean z) {
            read((constructGeneralizedType) audioAttributesCompatParcelizer, j, j2);
        }

        public RemoteActionCompatParcelizer(Uri uri) {
            this.MediaDescriptionCompat = uri;
            this.MediaBrowserCompatCustomActionResultReceiver = DateTimeSerializerBase.this.read.write();
        }

        public final _acceptJsonFormatVisitor read() {
            return this.RatingCompat;
        }

        public final boolean write() {
            if (this.RatingCompat == null) {
                return false;
            }
            return this.RatingCompat.RemoteActionCompatParcelizer || this.RatingCompat.MediaBrowserCompatItemReceiver == 2 || this.RatingCompat.MediaBrowserCompatItemReceiver == 1 || this.AudioAttributesImplApi26Parcelizer + Math.max(30000L, LaissezFaireSubTypeValidator.AudioAttributesCompatParcelizer(this.RatingCompat.AudioAttributesCompatParcelizer)) > SystemClock.elapsedRealtime();
        }

        public final void IconCompatParcelizer(boolean z) {
            IconCompatParcelizer(z ? AudioAttributesImplApi21Parcelizer() : this.MediaDescriptionCompat);
        }

        public final void AudioAttributesCompatParcelizer() throws IOException {
            this.MediaBrowserCompatItemReceiver.read();
            IOException iOException = this.AudioAttributesImplBaseParcelizer;
            if (iOException != null) {
                throw iOException;
            }
        }

        public final boolean IconCompatParcelizer() {
            return this.read;
        }

        public final void write(boolean z) {
            this.read = z;
        }

        public final void RemoteActionCompatParcelizer() {
            this.MediaBrowserCompatItemReceiver.AudioAttributesImplBaseParcelizer();
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // o.constructCollectionType.RemoteActionCompatParcelizer
        public void RemoteActionCompatParcelizer(constructGeneralizedType<_asTimestamp> constructgeneralizedtype, long j, long j2) {
            _asTimestamp _astimestampRemoteActionCompatParcelizer = constructgeneralizedtype.RemoteActionCompatParcelizer();
            StdDelegatingSerializer stdDelegatingSerializer = new StdDelegatingSerializer(constructgeneralizedtype.RemoteActionCompatParcelizer, constructgeneralizedtype.write, constructgeneralizedtype.MediaBrowserCompatCustomActionResultReceiver(), constructgeneralizedtype.read(), j, j2, constructgeneralizedtype.write());
            if (_astimestampRemoteActionCompatParcelizer instanceof _acceptJsonFormatVisitor) {
                write((_acceptJsonFormatVisitor) _astimestampRemoteActionCompatParcelizer, stdDelegatingSerializer);
                DateTimeSerializerBase.this.RemoteActionCompatParcelizer.read(stdDelegatingSerializer, 4);
            } else {
                this.AudioAttributesImplBaseParcelizer = SchemaAware.AudioAttributesCompatParcelizer("Loaded playlist has unexpected type.", null);
                DateTimeSerializerBase.this.RemoteActionCompatParcelizer.read(stdDelegatingSerializer, 4, this.AudioAttributesImplBaseParcelizer, true);
            }
            _resolveSuperClass unused = DateTimeSerializerBase.this.AudioAttributesImplBaseParcelizer;
            long j3 = constructgeneralizedtype.RemoteActionCompatParcelizer;
        }

        private void read(constructGeneralizedType<_asTimestamp> constructgeneralizedtype, long j, long j2) {
            StdDelegatingSerializer stdDelegatingSerializer = new StdDelegatingSerializer(constructgeneralizedtype.RemoteActionCompatParcelizer, constructgeneralizedtype.write, constructgeneralizedtype.MediaBrowserCompatCustomActionResultReceiver(), constructgeneralizedtype.read(), j, j2, constructgeneralizedtype.write());
            _resolveSuperClass unused = DateTimeSerializerBase.this.AudioAttributesImplBaseParcelizer;
            long j3 = constructgeneralizedtype.RemoteActionCompatParcelizer;
            DateTimeSerializerBase.this.RemoteActionCompatParcelizer.IconCompatParcelizer(stdDelegatingSerializer, 4);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // o.constructCollectionType.RemoteActionCompatParcelizer
        public constructCollectionType.write AudioAttributesCompatParcelizer(constructGeneralizedType<_asTimestamp> constructgeneralizedtype, long j, long j2, IOException iOException, int i) {
            constructCollectionType.write writeVarRemoteActionCompatParcelizer;
            StdDelegatingSerializer stdDelegatingSerializer = new StdDelegatingSerializer(constructgeneralizedtype.RemoteActionCompatParcelizer, constructgeneralizedtype.write, constructgeneralizedtype.MediaBrowserCompatCustomActionResultReceiver(), constructgeneralizedtype.read(), j, j2, constructgeneralizedtype.write());
            boolean z = iOException instanceof _serializeAsString.read;
            if ((constructgeneralizedtype.MediaBrowserCompatCustomActionResultReceiver().getQueryParameter("_HLS_msn") != null) || z) {
                int i2 = iOException instanceof _deserializeWithNativeTypeId.write ? ((_deserializeWithNativeTypeId.write) iOException).AudioAttributesImplApi26Parcelizer : Integer.MAX_VALUE;
                if (z || i2 == 400 || i2 == 503) {
                    this.AudioAttributesCompatParcelizer = SystemClock.elapsedRealtime();
                    IconCompatParcelizer(false);
                    ((StdKeySerializer.read) LaissezFaireSubTypeValidator.IconCompatParcelizer(DateTimeSerializerBase.this.RemoteActionCompatParcelizer)).read(stdDelegatingSerializer, constructgeneralizedtype.read, iOException, true);
                    return constructCollectionType.RemoteActionCompatParcelizer;
                }
            }
            _resolveSuperClass.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = new _resolveSuperClass.AudioAttributesCompatParcelizer(stdDelegatingSerializer, new StdArraySerializersShortArraySerializer(constructgeneralizedtype.read), iOException, i);
            if (DateTimeSerializerBase.this.read(this.MediaDescriptionCompat, audioAttributesCompatParcelizer, false)) {
                long jWrite = DateTimeSerializerBase.this.AudioAttributesImplBaseParcelizer.write(audioAttributesCompatParcelizer);
                if (jWrite != C.TIME_UNSET) {
                    writeVarRemoteActionCompatParcelizer = constructCollectionType.RemoteActionCompatParcelizer(false, jWrite);
                } else {
                    writeVarRemoteActionCompatParcelizer = constructCollectionType.IconCompatParcelizer;
                }
            } else {
                writeVarRemoteActionCompatParcelizer = constructCollectionType.RemoteActionCompatParcelizer;
            }
            boolean z2 = writeVarRemoteActionCompatParcelizer.read();
            DateTimeSerializerBase.this.RemoteActionCompatParcelizer.read(stdDelegatingSerializer, constructgeneralizedtype.read, iOException, !z2);
            if (!z2) {
                _resolveSuperClass unused = DateTimeSerializerBase.this.AudioAttributesImplBaseParcelizer;
                long j3 = constructgeneralizedtype.RemoteActionCompatParcelizer;
            }
            return writeVarRemoteActionCompatParcelizer;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void IconCompatParcelizer(final Uri uri) {
            this.RemoteActionCompatParcelizer = 0L;
            if (this.AudioAttributesImplApi21Parcelizer || this.MediaBrowserCompatItemReceiver.RemoteActionCompatParcelizer() || this.MediaBrowserCompatItemReceiver.IconCompatParcelizer()) {
                return;
            }
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (jElapsedRealtime < this.AudioAttributesCompatParcelizer) {
                this.AudioAttributesImplApi21Parcelizer = true;
                DateTimeSerializerBase.this.MediaMetadataCompat.postDelayed(new Runnable() { // from class: o.withFormat
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(uri);
                    }
                }, this.AudioAttributesCompatParcelizer - jElapsedRealtime);
            } else {
                AudioAttributesCompatParcelizer(uri);
            }
        }

        final /* synthetic */ void RemoteActionCompatParcelizer(Uri uri) {
            this.AudioAttributesImplApi21Parcelizer = false;
            AudioAttributesCompatParcelizer(uri);
        }

        private void AudioAttributesCompatParcelizer(Uri uri) {
            constructGeneralizedType constructgeneralizedtype = new constructGeneralizedType(this.MediaBrowserCompatCustomActionResultReceiver, uri, 4, DateTimeSerializerBase.this.MediaBrowserCompatSearchResultReceiver.AudioAttributesCompatParcelizer(DateTimeSerializerBase.this.MediaBrowserCompatCustomActionResultReceiver, this.RatingCompat));
            DateTimeSerializerBase.this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(new StdDelegatingSerializer(constructgeneralizedtype.RemoteActionCompatParcelizer, constructgeneralizedtype.write, this.MediaBrowserCompatItemReceiver.read(constructgeneralizedtype, this, DateTimeSerializerBase.this.AudioAttributesImplBaseParcelizer.write(constructgeneralizedtype.read))), constructgeneralizedtype.read);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void write(_acceptJsonFormatVisitor _acceptjsonformatvisitor, StdDelegatingSerializer stdDelegatingSerializer) {
            boolean z;
            long j;
            _acceptJsonFormatVisitor _acceptjsonformatvisitor2 = this.RatingCompat;
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            this.AudioAttributesImplApi26Parcelizer = jElapsedRealtime;
            _acceptJsonFormatVisitor _acceptjsonformatvisitorAudioAttributesCompatParcelizer = DateTimeSerializerBase.this.AudioAttributesCompatParcelizer(_acceptjsonformatvisitor2, _acceptjsonformatvisitor);
            this.RatingCompat = _acceptjsonformatvisitorAudioAttributesCompatParcelizer;
            IOException iconCompatParcelizer = null;
            if (_acceptjsonformatvisitorAudioAttributesCompatParcelizer != _acceptjsonformatvisitor2) {
                this.AudioAttributesImplBaseParcelizer = null;
                this.write = jElapsedRealtime;
                DateTimeSerializerBase.this.read(this.MediaDescriptionCompat, _acceptjsonformatvisitorAudioAttributesCompatParcelizer);
            } else if (!_acceptjsonformatvisitorAudioAttributesCompatParcelizer.RemoteActionCompatParcelizer) {
                if (_acceptjsonformatvisitor.AudioAttributesImplBaseParcelizer + ((long) _acceptjsonformatvisitor.MediaDescriptionCompat.size()) < this.RatingCompat.AudioAttributesImplBaseParcelizer) {
                    iconCompatParcelizer = new _serializeAsIndex.RemoteActionCompatParcelizer(this.MediaDescriptionCompat);
                    z = true;
                } else {
                    z = false;
                    if (jElapsedRealtime - this.write > LaissezFaireSubTypeValidator.AudioAttributesCompatParcelizer(this.RatingCompat.onCustomAction) * DateTimeSerializerBase.this.MediaBrowserCompatMediaItem) {
                        iconCompatParcelizer = new _serializeAsIndex.IconCompatParcelizer(this.MediaDescriptionCompat);
                    }
                }
                if (iconCompatParcelizer != null) {
                    this.AudioAttributesImplBaseParcelizer = iconCompatParcelizer;
                    DateTimeSerializerBase.this.read(this.MediaDescriptionCompat, new _resolveSuperClass.AudioAttributesCompatParcelizer(stdDelegatingSerializer, new StdArraySerializersShortArraySerializer(4), iconCompatParcelizer, 1), z);
                }
            }
            if (this.RatingCompat.RatingCompat.IconCompatParcelizer) {
                j = 0;
            } else {
                _acceptJsonFormatVisitor _acceptjsonformatvisitor3 = this.RatingCompat;
                if (_acceptjsonformatvisitor3 != _acceptjsonformatvisitor2) {
                    j = _acceptjsonformatvisitor3.onCustomAction;
                } else {
                    j = _acceptjsonformatvisitor3.onCustomAction / 2;
                }
            }
            this.AudioAttributesCompatParcelizer = (jElapsedRealtime + LaissezFaireSubTypeValidator.AudioAttributesCompatParcelizer(j)) - stdDelegatingSerializer.write;
            if (this.RatingCompat.RemoteActionCompatParcelizer) {
                return;
            }
            if (this.MediaDescriptionCompat.equals(DateTimeSerializerBase.this.RatingCompat) || this.read) {
                IconCompatParcelizer(AudioAttributesImplApi21Parcelizer());
            }
        }

        private Uri AudioAttributesImplApi21Parcelizer() {
            _acceptJsonFormatVisitor _acceptjsonformatvisitor = this.RatingCompat;
            if (_acceptjsonformatvisitor == null || (_acceptjsonformatvisitor.RatingCompat.write == C.TIME_UNSET && !this.RatingCompat.RatingCompat.IconCompatParcelizer)) {
                return this.MediaDescriptionCompat;
            }
            Uri.Builder builderBuildUpon = this.MediaDescriptionCompat.buildUpon();
            if (this.RatingCompat.RatingCompat.IconCompatParcelizer) {
                builderBuildUpon.appendQueryParameter("_HLS_msn", String.valueOf(this.RatingCompat.AudioAttributesImplBaseParcelizer + ((long) this.RatingCompat.MediaDescriptionCompat.size())));
                if (this.RatingCompat.AudioAttributesImplApi21Parcelizer != C.TIME_UNSET) {
                    List<_acceptJsonFormatVisitor.read> list = this.RatingCompat.onAddQueueItem;
                    int size = list.size();
                    if (!list.isEmpty() && ((_acceptJsonFormatVisitor.read) onMoofContainerAtomRead.AudioAttributesCompatParcelizer(list)).read) {
                        size--;
                    }
                    builderBuildUpon.appendQueryParameter("_HLS_part", String.valueOf(size));
                }
            }
            if (this.RatingCompat.RatingCompat.write != C.TIME_UNSET) {
                builderBuildUpon.appendQueryParameter("_HLS_skip", this.RatingCompat.RatingCompat.RemoteActionCompatParcelizer ? "v2" : "YES");
            }
            return builderBuildUpon.build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean RemoteActionCompatParcelizer(long j) {
            this.RemoteActionCompatParcelizer = SystemClock.elapsedRealtime() + j;
            return this.MediaDescriptionCompat.equals(DateTimeSerializerBase.this.RatingCompat) && !DateTimeSerializerBase.this.MediaBrowserCompatCustomActionResultReceiver();
        }
    }

    class AudioAttributesCompatParcelizer implements _serializeAsIndex.read {
        private AudioAttributesCompatParcelizer() {
        }

        /* synthetic */ AudioAttributesCompatParcelizer(DateTimeSerializerBase dateTimeSerializerBase, byte b) {
            this();
        }

        @Override // o._serializeAsIndex.read
        public final void AudioAttributesImplApi26Parcelizer() {
            DateTimeSerializerBase.this.AudioAttributesImplApi21Parcelizer.remove(this);
        }

        @Override // o._serializeAsIndex.read
        public final boolean write(Uri uri, _resolveSuperClass.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer, boolean z) {
            RemoteActionCompatParcelizer remoteActionCompatParcelizer;
            if (DateTimeSerializerBase.this.MediaDescriptionCompat == null) {
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                List<EnumSerializer.IconCompatParcelizer> list = ((EnumSerializer) LaissezFaireSubTypeValidator.IconCompatParcelizer(DateTimeSerializerBase.this.MediaBrowserCompatCustomActionResultReceiver)).MediaBrowserCompatCustomActionResultReceiver;
                int i = 0;
                for (int i2 = 0; i2 < list.size(); i2++) {
                    RemoteActionCompatParcelizer remoteActionCompatParcelizer2 = (RemoteActionCompatParcelizer) DateTimeSerializerBase.this.AudioAttributesImplApi26Parcelizer.get(list.get(i2).read);
                    if (remoteActionCompatParcelizer2 != null && jElapsedRealtime < remoteActionCompatParcelizer2.RemoteActionCompatParcelizer) {
                        i++;
                    }
                }
                _resolveSuperClass.RemoteActionCompatParcelizer remoteActionCompatParcelizer3 = DateTimeSerializerBase.this.AudioAttributesImplBaseParcelizer.read(new _resolveSuperClass.read(1, 0, DateTimeSerializerBase.this.MediaBrowserCompatCustomActionResultReceiver.MediaBrowserCompatCustomActionResultReceiver.size(), i), audioAttributesCompatParcelizer);
                if (remoteActionCompatParcelizer3 != null && remoteActionCompatParcelizer3.RemoteActionCompatParcelizer == 2 && (remoteActionCompatParcelizer = (RemoteActionCompatParcelizer) DateTimeSerializerBase.this.AudioAttributesImplApi26Parcelizer.get(uri)) != null) {
                    remoteActionCompatParcelizer.RemoteActionCompatParcelizer(remoteActionCompatParcelizer3.AudioAttributesCompatParcelizer);
                }
            }
            return false;
        }
    }
}
