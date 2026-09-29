package kotlin;

import android.util.Pair;
import androidx.media3.exoplayer.ExoPlayer;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.MediaPeriodQueue;
import java.util.ArrayList;
import java.util.List;
import kotlin.PolymorphicTypeValidator;
import kotlin.StdKeySerializers;
import kotlin._pojoEquals;
import kotlin.initExtraTracks;

/* JADX INFO: loaded from: classes2.dex */
final class TextNode {
    private int AudioAttributesCompatParcelizer;
    private long AudioAttributesImplApi21Parcelizer;
    private _pojoEquals AudioAttributesImplBaseParcelizer;
    private final _pojoEquals.write IconCompatParcelizer;
    private long MediaBrowserCompatCustomActionResultReceiver;
    private Object MediaBrowserCompatItemReceiver;
    private ExoPlayer.IconCompatParcelizer MediaBrowserCompatSearchResultReceiver;
    private int MediaDescriptionCompat;
    private _pojoEquals MediaMetadataCompat;
    private boolean RatingCompat;
    private final findSerializerByPrimaryType RemoteActionCompatParcelizer;
    private _pojoEquals read;
    private final _usesExternalId write;
    private final PolymorphicTypeValidator.AudioAttributesCompatParcelizer AudioAttributesImplApi26Parcelizer = new PolymorphicTypeValidator.AudioAttributesCompatParcelizer();
    private final PolymorphicTypeValidator.IconCompatParcelizer MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = new PolymorphicTypeValidator.IconCompatParcelizer();
    private List<_pojoEquals> MediaBrowserCompatMediaItem = new ArrayList();

    static boolean IconCompatParcelizer(long j, long j2) {
        return j == C.TIME_UNSET || j == j2;
    }

    public TextNode(findSerializerByPrimaryType findserializerbyprimarytype, _usesExternalId _usesexternalid, _pojoEquals.write writeVar, ExoPlayer.IconCompatParcelizer iconCompatParcelizer) {
        this.RemoteActionCompatParcelizer = findserializerbyprimarytype;
        this.write = _usesexternalid;
        this.IconCompatParcelizer = writeVar;
        this.MediaBrowserCompatSearchResultReceiver = iconCompatParcelizer;
    }

    public final boolean AudioAttributesCompatParcelizer(PolymorphicTypeValidator polymorphicTypeValidator, int i) {
        this.MediaDescriptionCompat = i;
        return AudioAttributesCompatParcelizer(polymorphicTypeValidator);
    }

    public final boolean AudioAttributesCompatParcelizer(PolymorphicTypeValidator polymorphicTypeValidator, boolean z) {
        this.RatingCompat = z;
        return AudioAttributesCompatParcelizer(polymorphicTypeValidator);
    }

    public final void read(PolymorphicTypeValidator polymorphicTypeValidator, ExoPlayer.IconCompatParcelizer iconCompatParcelizer) {
        this.MediaBrowserCompatSearchResultReceiver = iconCompatParcelizer;
        write(polymorphicTypeValidator);
    }

    public final boolean write(StdJdkSerializersAtomicIntegerSerializer stdJdkSerializersAtomicIntegerSerializer) {
        _pojoEquals _pojoequals = this.read;
        return _pojoequals != null && _pojoequals.IconCompatParcelizer == stdJdkSerializersAtomicIntegerSerializer;
    }

    public final void read(long j) {
        _pojoEquals _pojoequals = this.read;
        if (_pojoequals != null) {
            _pojoequals.write(j);
        }
    }

    public final boolean MediaBrowserCompatItemReceiver() {
        _pojoEquals _pojoequals = this.read;
        if (_pojoequals != null) {
            return !_pojoequals.AudioAttributesCompatParcelizer.IconCompatParcelizer && this.read.MediaBrowserCompatCustomActionResultReceiver() && this.read.AudioAttributesCompatParcelizer.read != C.TIME_UNSET && this.AudioAttributesCompatParcelizer < 100;
        }
        return true;
    }

    public final POJONode write(long j, buildEnumSetSerializer buildenumsetserializer) {
        if (this.read == null) {
            return read(buildenumsetserializer);
        }
        return IconCompatParcelizer(buildenumsetserializer.onAddQueueItem, this.read, j);
    }

    public final _pojoEquals AudioAttributesCompatParcelizer(POJONode pOJONode) {
        _pojoEquals _pojoequals = this.read;
        long jAudioAttributesCompatParcelizer = _pojoequals == null ? MediaPeriodQueue.INITIAL_RENDERER_POSITION_OFFSET_US : (_pojoequals.AudioAttributesCompatParcelizer() + this.read.AudioAttributesCompatParcelizer.read) - pOJONode.AudioAttributesImplApi21Parcelizer;
        _pojoEquals _pojoequalsIconCompatParcelizer = IconCompatParcelizer(pOJONode);
        if (_pojoequalsIconCompatParcelizer == null) {
            _pojoequalsIconCompatParcelizer = this.IconCompatParcelizer.write(pOJONode, jAudioAttributesCompatParcelizer);
        } else {
            _pojoequalsIconCompatParcelizer.AudioAttributesCompatParcelizer = pOJONode;
            _pojoequalsIconCompatParcelizer.AudioAttributesCompatParcelizer(jAudioAttributesCompatParcelizer);
        }
        _pojoEquals _pojoequals2 = this.read;
        if (_pojoequals2 != null) {
            _pojoequals2.write(_pojoequalsIconCompatParcelizer);
        } else {
            this.AudioAttributesImplBaseParcelizer = _pojoequalsIconCompatParcelizer;
            this.MediaMetadataCompat = _pojoequalsIconCompatParcelizer;
        }
        this.MediaBrowserCompatItemReceiver = null;
        this.read = _pojoequalsIconCompatParcelizer;
        this.AudioAttributesCompatParcelizer++;
        MediaBrowserCompatCustomActionResultReceiver();
        return _pojoequalsIconCompatParcelizer;
    }

    public final void write(PolymorphicTypeValidator polymorphicTypeValidator) {
        _pojoEquals _pojoequals;
        if (this.MediaBrowserCompatSearchResultReceiver.AudioAttributesCompatParcelizer == C.TIME_UNSET || (_pojoequals = this.read) == null) {
            AudioAttributesImplApi26Parcelizer();
            return;
        }
        ArrayList arrayList = new ArrayList();
        Pair<Object, Long> pair = read(polymorphicTypeValidator, _pojoequals.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer);
        if (pair != null && !polymorphicTypeValidator.RemoteActionCompatParcelizer(polymorphicTypeValidator.RemoteActionCompatParcelizer(pair.first, this.AudioAttributesImplApi26Parcelizer).AudioAttributesImplBaseParcelizer, this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver).AudioAttributesImplApi26Parcelizer()) {
            long jRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(pair.first);
            if (jRemoteActionCompatParcelizer == -1) {
                jRemoteActionCompatParcelizer = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = 1 + jRemoteActionCompatParcelizer;
            }
            POJONode pOJONode = read(polymorphicTypeValidator, pair.first, ((Long) pair.second).longValue(), jRemoteActionCompatParcelizer);
            _pojoEquals _pojoequalsIconCompatParcelizer = IconCompatParcelizer(pOJONode);
            if (_pojoequalsIconCompatParcelizer == null) {
                _pojoequalsIconCompatParcelizer = this.IconCompatParcelizer.write(pOJONode, (_pojoequals.AudioAttributesCompatParcelizer() + _pojoequals.AudioAttributesCompatParcelizer.read) - pOJONode.AudioAttributesImplApi21Parcelizer);
            }
            arrayList.add(_pojoequalsIconCompatParcelizer);
        }
        read(arrayList);
    }

    public final void AudioAttributesImplApi26Parcelizer() {
        if (this.MediaBrowserCompatMediaItem.isEmpty()) {
            return;
        }
        read(new ArrayList());
    }

    private _pojoEquals IconCompatParcelizer(POJONode pOJONode) {
        for (int i = 0; i < this.MediaBrowserCompatMediaItem.size(); i++) {
            if (this.MediaBrowserCompatMediaItem.get(i).AudioAttributesCompatParcelizer(pOJONode)) {
                return this.MediaBrowserCompatMediaItem.remove(i);
            }
        }
        return null;
    }

    private void read(List<_pojoEquals> list) {
        for (int i = 0; i < this.MediaBrowserCompatMediaItem.size(); i++) {
            this.MediaBrowserCompatMediaItem.get(i).AudioAttributesImplApi26Parcelizer();
        }
        this.MediaBrowserCompatMediaItem = list;
    }

    private POJONode read(PolymorphicTypeValidator polymorphicTypeValidator, Object obj, long j, long j2) {
        StdKeySerializers.write writeVar = read(polymorphicTypeValidator, obj, j, j2, this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, this.AudioAttributesImplApi26Parcelizer);
        if (writeVar.IconCompatParcelizer()) {
            return write(polymorphicTypeValidator, writeVar.AudioAttributesCompatParcelizer, writeVar.write, writeVar.read, j, writeVar.RemoteActionCompatParcelizer);
        }
        return write(polymorphicTypeValidator, writeVar.AudioAttributesCompatParcelizer, j, C.TIME_UNSET, writeVar.RemoteActionCompatParcelizer);
    }

    private Pair<Object, Long> read(PolymorphicTypeValidator polymorphicTypeValidator, Object obj) {
        int iIconCompatParcelizer = polymorphicTypeValidator.IconCompatParcelizer(polymorphicTypeValidator.RemoteActionCompatParcelizer(obj, this.AudioAttributesImplApi26Parcelizer).AudioAttributesImplBaseParcelizer, this.MediaDescriptionCompat, this.RatingCompat);
        if (iIconCompatParcelizer != -1) {
            return polymorphicTypeValidator.write(this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, this.AudioAttributesImplApi26Parcelizer, iIconCompatParcelizer, C.TIME_UNSET, 0L);
        }
        return null;
    }

    public final _pojoEquals IconCompatParcelizer() {
        return this.read;
    }

    public final _pojoEquals read() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    public final _pojoEquals AudioAttributesImplBaseParcelizer() {
        return this.MediaMetadataCompat;
    }

    public final _pojoEquals RemoteActionCompatParcelizer() {
        this.MediaMetadataCompat = ((_pojoEquals) buildTypeSerializer.AudioAttributesCompatParcelizer(this.MediaMetadataCompat)).RemoteActionCompatParcelizer();
        MediaBrowserCompatCustomActionResultReceiver();
        return (_pojoEquals) buildTypeSerializer.AudioAttributesCompatParcelizer(this.MediaMetadataCompat);
    }

    public final _pojoEquals write() {
        _pojoEquals _pojoequals = this.AudioAttributesImplBaseParcelizer;
        if (_pojoequals == null) {
            return null;
        }
        if (_pojoequals == this.MediaMetadataCompat) {
            this.MediaMetadataCompat = _pojoequals.RemoteActionCompatParcelizer();
        }
        this.AudioAttributesImplBaseParcelizer.AudioAttributesImplApi26Parcelizer();
        int i = this.AudioAttributesCompatParcelizer - 1;
        this.AudioAttributesCompatParcelizer = i;
        if (i == 0) {
            this.read = null;
            this.MediaBrowserCompatItemReceiver = this.AudioAttributesImplBaseParcelizer.AudioAttributesImplApi21Parcelizer;
            this.MediaBrowserCompatCustomActionResultReceiver = this.AudioAttributesImplBaseParcelizer.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer;
        }
        this.AudioAttributesImplBaseParcelizer = this.AudioAttributesImplBaseParcelizer.RemoteActionCompatParcelizer();
        MediaBrowserCompatCustomActionResultReceiver();
        return this.AudioAttributesImplBaseParcelizer;
    }

    public final boolean read(_pojoEquals _pojoequals) {
        buildTypeSerializer.AudioAttributesCompatParcelizer(_pojoequals);
        boolean z = false;
        if (_pojoequals.equals(this.read)) {
            return false;
        }
        this.read = _pojoequals;
        while (_pojoequals.RemoteActionCompatParcelizer() != null) {
            _pojoequals = (_pojoEquals) buildTypeSerializer.IconCompatParcelizer(_pojoequals.RemoteActionCompatParcelizer());
            if (_pojoequals == this.MediaMetadataCompat) {
                this.MediaMetadataCompat = this.AudioAttributesImplBaseParcelizer;
                z = true;
            }
            _pojoequals.AudioAttributesImplApi26Parcelizer();
            this.AudioAttributesCompatParcelizer--;
        }
        ((_pojoEquals) buildTypeSerializer.IconCompatParcelizer(this.read)).write((_pojoEquals) null);
        MediaBrowserCompatCustomActionResultReceiver();
        return z;
    }

    public final void AudioAttributesCompatParcelizer() {
        if (this.AudioAttributesCompatParcelizer == 0) {
            return;
        }
        _pojoEquals _pojoequalsRemoteActionCompatParcelizer = (_pojoEquals) buildTypeSerializer.AudioAttributesCompatParcelizer(this.AudioAttributesImplBaseParcelizer);
        this.MediaBrowserCompatItemReceiver = _pojoequalsRemoteActionCompatParcelizer.AudioAttributesImplApi21Parcelizer;
        this.MediaBrowserCompatCustomActionResultReceiver = _pojoequalsRemoteActionCompatParcelizer.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer;
        while (_pojoequalsRemoteActionCompatParcelizer != null) {
            _pojoequalsRemoteActionCompatParcelizer.AudioAttributesImplApi26Parcelizer();
            _pojoequalsRemoteActionCompatParcelizer = _pojoequalsRemoteActionCompatParcelizer.RemoteActionCompatParcelizer();
        }
        this.AudioAttributesImplBaseParcelizer = null;
        this.read = null;
        this.MediaMetadataCompat = null;
        this.AudioAttributesCompatParcelizer = 0;
        MediaBrowserCompatCustomActionResultReceiver();
    }

    public final boolean RemoteActionCompatParcelizer(PolymorphicTypeValidator polymorphicTypeValidator, long j, long j2) {
        boolean z;
        POJONode pOJONodeIconCompatParcelizer;
        _pojoEquals _pojoequalsRemoteActionCompatParcelizer = this.AudioAttributesImplBaseParcelizer;
        _pojoEquals _pojoequals = null;
        while (_pojoequalsRemoteActionCompatParcelizer != null) {
            POJONode pOJONode = _pojoequalsRemoteActionCompatParcelizer.AudioAttributesCompatParcelizer;
            if (_pojoequals == null) {
                pOJONodeIconCompatParcelizer = IconCompatParcelizer(polymorphicTypeValidator, pOJONode);
            } else {
                POJONode pOJONodeIconCompatParcelizer2 = IconCompatParcelizer(polymorphicTypeValidator, _pojoequals, j);
                if (pOJONodeIconCompatParcelizer2 == null) {
                    z = read(_pojoequals);
                } else if (IconCompatParcelizer(pOJONode, pOJONodeIconCompatParcelizer2)) {
                    pOJONodeIconCompatParcelizer = pOJONodeIconCompatParcelizer2;
                } else {
                    z = read(_pojoequals);
                }
                return !z;
            }
            _pojoequalsRemoteActionCompatParcelizer.AudioAttributesCompatParcelizer = pOJONodeIconCompatParcelizer.IconCompatParcelizer(pOJONode.AudioAttributesImplBaseParcelizer);
            if (!IconCompatParcelizer(pOJONode.read, pOJONodeIconCompatParcelizer.read)) {
                _pojoequalsRemoteActionCompatParcelizer.MediaDescriptionCompat();
                return (read(_pojoequalsRemoteActionCompatParcelizer) || (_pojoequalsRemoteActionCompatParcelizer == this.MediaMetadataCompat && !_pojoequalsRemoteActionCompatParcelizer.AudioAttributesCompatParcelizer.write && ((j2 > Long.MIN_VALUE ? 1 : (j2 == Long.MIN_VALUE ? 0 : -1)) == 0 || (j2 > ((pOJONodeIconCompatParcelizer.read > C.TIME_UNSET ? 1 : (pOJONodeIconCompatParcelizer.read == C.TIME_UNSET ? 0 : -1)) == 0 ? Long.MAX_VALUE : _pojoequalsRemoteActionCompatParcelizer.read(pOJONodeIconCompatParcelizer.read)) ? 1 : (j2 == ((pOJONodeIconCompatParcelizer.read > C.TIME_UNSET ? 1 : (pOJONodeIconCompatParcelizer.read == C.TIME_UNSET ? 0 : -1)) == 0 ? Long.MAX_VALUE : _pojoequalsRemoteActionCompatParcelizer.read(pOJONodeIconCompatParcelizer.read)) ? 0 : -1)) >= 0))) ? false : true;
            }
            _pojoequals = _pojoequalsRemoteActionCompatParcelizer;
            _pojoequalsRemoteActionCompatParcelizer = _pojoequalsRemoteActionCompatParcelizer.RemoteActionCompatParcelizer();
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final kotlin.POJONode IconCompatParcelizer(kotlin.PolymorphicTypeValidator r19, kotlin.POJONode r20) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            o.StdKeySerializers$write r3 = r2.AudioAttributesCompatParcelizer
            boolean r11 = AudioAttributesCompatParcelizer(r3)
            boolean r12 = r0.RemoteActionCompatParcelizer(r1, r3)
            boolean r13 = r0.read(r1, r3, r11)
            o.StdKeySerializers$write r4 = r2.AudioAttributesCompatParcelizer
            java.lang.Object r4 = r4.AudioAttributesCompatParcelizer
            o.PolymorphicTypeValidator$AudioAttributesCompatParcelizer r5 = r0.AudioAttributesImplApi26Parcelizer
            r1.RemoteActionCompatParcelizer(r4, r5)
            boolean r1 = r3.IconCompatParcelizer()
            r4 = -1
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r1 != 0) goto L36
            int r1 = r3.IconCompatParcelizer
            if (r1 == r4) goto L36
            o.PolymorphicTypeValidator$AudioAttributesCompatParcelizer r1 = r0.AudioAttributesImplApi26Parcelizer
            int r7 = r3.IconCompatParcelizer
            long r7 = r1.write(r7)
            goto L37
        L36:
            r7 = r5
        L37:
            boolean r1 = r3.IconCompatParcelizer()
            if (r1 == 0) goto L49
            o.PolymorphicTypeValidator$AudioAttributesCompatParcelizer r1 = r0.AudioAttributesImplApi26Parcelizer
            int r5 = r3.write
            int r6 = r3.read
            long r5 = r1.RemoteActionCompatParcelizer(r5, r6)
        L47:
            r9 = r5
            goto L5c
        L49:
            int r1 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r1 == 0) goto L55
            r5 = -9223372036854775808
            int r1 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r1 == 0) goto L55
            r9 = r7
            goto L5c
        L55:
            o.PolymorphicTypeValidator$AudioAttributesCompatParcelizer r1 = r0.AudioAttributesImplApi26Parcelizer
            long r5 = r1.RemoteActionCompatParcelizer()
            goto L47
        L5c:
            boolean r1 = r3.IconCompatParcelizer()
            if (r1 == 0) goto L6c
            o.PolymorphicTypeValidator$AudioAttributesCompatParcelizer r0 = r0.AudioAttributesImplApi26Parcelizer
            int r1 = r3.write
            boolean r0 = r0.AudioAttributesImplBaseParcelizer(r1)
        L6a:
            r14 = r0
            goto L7e
        L6c:
            int r1 = r3.IconCompatParcelizer
            if (r1 == r4) goto L7c
            o.PolymorphicTypeValidator$AudioAttributesCompatParcelizer r0 = r0.AudioAttributesImplApi26Parcelizer
            int r1 = r3.IconCompatParcelizer
            boolean r0 = r0.AudioAttributesImplBaseParcelizer(r1)
            if (r0 == 0) goto L7c
            r0 = 1
            goto L6a
        L7c:
            r0 = 0
            goto L6a
        L7e:
            o.POJONode r15 = new o.POJONode
            long r4 = r2.AudioAttributesImplApi21Parcelizer
            long r1 = r2.AudioAttributesImplBaseParcelizer
            r0 = r15
            r16 = r1
            r1 = r3
            r2 = r4
            r4 = r16
            r6 = r7
            r8 = r9
            r10 = r14
            r0.<init>(r1, r2, r4, r6, r8, r10, r11, r12, r13)
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.TextNode.IconCompatParcelizer(o.PolymorphicTypeValidator, o.POJONode):o.POJONode");
    }

    private static StdKeySerializers.write read(PolymorphicTypeValidator polymorphicTypeValidator, Object obj, long j, long j2, PolymorphicTypeValidator.IconCompatParcelizer iconCompatParcelizer, PolymorphicTypeValidator.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
        polymorphicTypeValidator.RemoteActionCompatParcelizer(obj, audioAttributesCompatParcelizer);
        polymorphicTypeValidator.RemoteActionCompatParcelizer(audioAttributesCompatParcelizer.AudioAttributesImplBaseParcelizer, iconCompatParcelizer);
        Object objIconCompatParcelizer = obj;
        for (int i = polymorphicTypeValidator.read(obj); AudioAttributesCompatParcelizer(audioAttributesCompatParcelizer) && i <= iconCompatParcelizer.AudioAttributesImplBaseParcelizer; i++) {
            polymorphicTypeValidator.RemoteActionCompatParcelizer(i, audioAttributesCompatParcelizer, true);
            objIconCompatParcelizer = buildTypeSerializer.IconCompatParcelizer(audioAttributesCompatParcelizer.write);
        }
        polymorphicTypeValidator.RemoteActionCompatParcelizer(objIconCompatParcelizer, audioAttributesCompatParcelizer);
        int i2 = audioAttributesCompatParcelizer.read(j);
        if (i2 == -1) {
            return new StdKeySerializers.write(objIconCompatParcelizer, j2, audioAttributesCompatParcelizer.write(j));
        }
        return new StdKeySerializers.write(objIconCompatParcelizer, i2, audioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(i2), j2);
    }

    private static boolean AudioAttributesCompatParcelizer(PolymorphicTypeValidator.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
        int iWrite = audioAttributesCompatParcelizer.write();
        if (iWrite != 0 && ((iWrite != 1 || !audioAttributesCompatParcelizer.MediaBrowserCompatItemReceiver(0)) && audioAttributesCompatParcelizer.AudioAttributesImplBaseParcelizer(audioAttributesCompatParcelizer.AudioAttributesImplBaseParcelizer()))) {
            long jRemoteActionCompatParcelizer = 0;
            if (audioAttributesCompatParcelizer.read(0L) == -1) {
                if (audioAttributesCompatParcelizer.read == 0) {
                    return true;
                }
                int i = audioAttributesCompatParcelizer.MediaBrowserCompatItemReceiver(iWrite + (-1)) ? 2 : 1;
                for (int i2 = 0; i2 <= iWrite - i; i2++) {
                    jRemoteActionCompatParcelizer += audioAttributesCompatParcelizer.RemoteActionCompatParcelizer(i2);
                }
                if (audioAttributesCompatParcelizer.read <= jRemoteActionCompatParcelizer) {
                    return true;
                }
            }
        }
        return false;
    }

    public final StdKeySerializers.write RemoteActionCompatParcelizer(PolymorphicTypeValidator polymorphicTypeValidator, Object obj, long j) {
        long jWrite = write(polymorphicTypeValidator, obj);
        polymorphicTypeValidator.RemoteActionCompatParcelizer(obj, this.AudioAttributesImplApi26Parcelizer);
        polymorphicTypeValidator.RemoteActionCompatParcelizer(this.AudioAttributesImplApi26Parcelizer.AudioAttributesImplBaseParcelizer, this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver);
        boolean z = false;
        for (int i = polymorphicTypeValidator.read(obj); i >= this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.RemoteActionCompatParcelizer; i--) {
            polymorphicTypeValidator.RemoteActionCompatParcelizer(i, this.AudioAttributesImplApi26Parcelizer, true);
            boolean z2 = this.AudioAttributesImplApi26Parcelizer.write() > 0;
            z |= z2;
            PolymorphicTypeValidator.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = this.AudioAttributesImplApi26Parcelizer;
            if (audioAttributesCompatParcelizer.read(audioAttributesCompatParcelizer.read) != -1) {
                obj = buildTypeSerializer.IconCompatParcelizer(this.AudioAttributesImplApi26Parcelizer.write);
            }
            if (z && (!z2 || this.AudioAttributesImplApi26Parcelizer.read != 0)) {
                break;
            }
        }
        return read(polymorphicTypeValidator, obj, j, jWrite, this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, this.AudioAttributesImplApi26Parcelizer);
    }

    private void MediaBrowserCompatCustomActionResultReceiver() {
        final initExtraTracks.IconCompatParcelizer iconCompatParcelizerMediaBrowserCompatCustomActionResultReceiver = initExtraTracks.MediaBrowserCompatCustomActionResultReceiver();
        for (_pojoEquals _pojoequalsRemoteActionCompatParcelizer = this.AudioAttributesImplBaseParcelizer; _pojoequalsRemoteActionCompatParcelizer != null; _pojoequalsRemoteActionCompatParcelizer = _pojoequalsRemoteActionCompatParcelizer.RemoteActionCompatParcelizer()) {
            iconCompatParcelizerMediaBrowserCompatCustomActionResultReceiver.read(_pojoequalsRemoteActionCompatParcelizer.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer);
        }
        _pojoEquals _pojoequals = this.MediaMetadataCompat;
        final StdKeySerializers.write writeVar = _pojoequals == null ? null : _pojoequals.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer;
        this.write.IconCompatParcelizer(new Runnable() { // from class: o.serializeFilteredContents
            @Override // java.lang.Runnable
            public final void run() {
                this.read.write(iconCompatParcelizerMediaBrowserCompatCustomActionResultReceiver, writeVar);
            }
        });
    }

    final /* synthetic */ void write(initExtraTracks.IconCompatParcelizer iconCompatParcelizer, StdKeySerializers.write writeVar) {
        this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(iconCompatParcelizer.IconCompatParcelizer(), writeVar);
    }

    private long write(PolymorphicTypeValidator polymorphicTypeValidator, Object obj) {
        int i;
        int i2 = polymorphicTypeValidator.RemoteActionCompatParcelizer(obj, this.AudioAttributesImplApi26Parcelizer).AudioAttributesImplBaseParcelizer;
        Object obj2 = this.MediaBrowserCompatItemReceiver;
        if (obj2 != null && (i = polymorphicTypeValidator.read(obj2)) != -1 && polymorphicTypeValidator.AudioAttributesCompatParcelizer(i, this.AudioAttributesImplApi26Parcelizer).AudioAttributesImplBaseParcelizer == i2) {
            return this.MediaBrowserCompatCustomActionResultReceiver;
        }
        for (_pojoEquals _pojoequalsRemoteActionCompatParcelizer = this.AudioAttributesImplBaseParcelizer; _pojoequalsRemoteActionCompatParcelizer != null; _pojoequalsRemoteActionCompatParcelizer = _pojoequalsRemoteActionCompatParcelizer.RemoteActionCompatParcelizer()) {
            if (_pojoequalsRemoteActionCompatParcelizer.AudioAttributesImplApi21Parcelizer.equals(obj)) {
                return _pojoequalsRemoteActionCompatParcelizer.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer;
            }
        }
        for (_pojoEquals _pojoequalsRemoteActionCompatParcelizer2 = this.AudioAttributesImplBaseParcelizer; _pojoequalsRemoteActionCompatParcelizer2 != null; _pojoequalsRemoteActionCompatParcelizer2 = _pojoequalsRemoteActionCompatParcelizer2.RemoteActionCompatParcelizer()) {
            int i3 = polymorphicTypeValidator.read(_pojoequalsRemoteActionCompatParcelizer2.AudioAttributesImplApi21Parcelizer);
            if (i3 != -1 && polymorphicTypeValidator.AudioAttributesCompatParcelizer(i3, this.AudioAttributesImplApi26Parcelizer).AudioAttributesImplBaseParcelizer == i2) {
                return _pojoequalsRemoteActionCompatParcelizer2.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer;
            }
        }
        long jRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(obj);
        if (jRemoteActionCompatParcelizer != -1) {
            return jRemoteActionCompatParcelizer;
        }
        long j = this.AudioAttributesImplApi21Parcelizer;
        this.AudioAttributesImplApi21Parcelizer = 1 + j;
        if (this.AudioAttributesImplBaseParcelizer == null) {
            this.MediaBrowserCompatItemReceiver = obj;
            this.MediaBrowserCompatCustomActionResultReceiver = j;
        }
        return j;
    }

    private long RemoteActionCompatParcelizer(Object obj) {
        for (int i = 0; i < this.MediaBrowserCompatMediaItem.size(); i++) {
            _pojoEquals _pojoequals = this.MediaBrowserCompatMediaItem.get(i);
            if (_pojoequals.AudioAttributesImplApi21Parcelizer.equals(obj)) {
                return _pojoequals.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer;
            }
        }
        return -1L;
    }

    private static boolean IconCompatParcelizer(POJONode pOJONode, POJONode pOJONode2) {
        return pOJONode.AudioAttributesImplApi21Parcelizer == pOJONode2.AudioAttributesImplApi21Parcelizer && pOJONode.AudioAttributesCompatParcelizer.equals(pOJONode2.AudioAttributesCompatParcelizer);
    }

    private boolean AudioAttributesCompatParcelizer(PolymorphicTypeValidator polymorphicTypeValidator) {
        _pojoEquals _pojoequalsRemoteActionCompatParcelizer = this.AudioAttributesImplBaseParcelizer;
        if (_pojoequalsRemoteActionCompatParcelizer == null) {
            return true;
        }
        int iWrite = polymorphicTypeValidator.read(_pojoequalsRemoteActionCompatParcelizer.AudioAttributesImplApi21Parcelizer);
        while (true) {
            iWrite = polymorphicTypeValidator.write(iWrite, this.AudioAttributesImplApi26Parcelizer, this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, this.MediaDescriptionCompat, this.RatingCompat);
            while (((_pojoEquals) buildTypeSerializer.IconCompatParcelizer(_pojoequalsRemoteActionCompatParcelizer)).RemoteActionCompatParcelizer() != null && !_pojoequalsRemoteActionCompatParcelizer.AudioAttributesCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver) {
                _pojoequalsRemoteActionCompatParcelizer = _pojoequalsRemoteActionCompatParcelizer.RemoteActionCompatParcelizer();
            }
            _pojoEquals _pojoequalsRemoteActionCompatParcelizer2 = _pojoequalsRemoteActionCompatParcelizer.RemoteActionCompatParcelizer();
            if (iWrite == -1 || _pojoequalsRemoteActionCompatParcelizer2 == null || polymorphicTypeValidator.read(_pojoequalsRemoteActionCompatParcelizer2.AudioAttributesImplApi21Parcelizer) != iWrite) {
                break;
            }
            _pojoequalsRemoteActionCompatParcelizer = _pojoequalsRemoteActionCompatParcelizer2;
        }
        boolean z = read(_pojoequalsRemoteActionCompatParcelizer);
        _pojoequalsRemoteActionCompatParcelizer.AudioAttributesCompatParcelizer = IconCompatParcelizer(polymorphicTypeValidator, _pojoequalsRemoteActionCompatParcelizer.AudioAttributesCompatParcelizer);
        return !z;
    }

    private POJONode read(buildEnumSetSerializer buildenumsetserializer) {
        return RemoteActionCompatParcelizer(buildenumsetserializer.onAddQueueItem, buildenumsetserializer.RemoteActionCompatParcelizer, buildenumsetserializer.MediaMetadataCompat, buildenumsetserializer.RatingCompat);
    }

    private POJONode IconCompatParcelizer(PolymorphicTypeValidator polymorphicTypeValidator, _pojoEquals _pojoequals, long j) {
        POJONode pOJONode = _pojoequals.AudioAttributesCompatParcelizer;
        long jAudioAttributesCompatParcelizer = (_pojoequals.AudioAttributesCompatParcelizer() + pOJONode.read) - j;
        if (pOJONode.MediaBrowserCompatCustomActionResultReceiver) {
            return read(polymorphicTypeValidator, _pojoequals, jAudioAttributesCompatParcelizer);
        }
        return AudioAttributesCompatParcelizer(polymorphicTypeValidator, _pojoequals, jAudioAttributesCompatParcelizer);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00c8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private kotlin.POJONode read(kotlin.PolymorphicTypeValidator r20, kotlin._pojoEquals r21, long r22) {
        /*
            Method dump skipped, instruction units count: 212
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.TextNode.read(o.PolymorphicTypeValidator, o._pojoEquals, long):o.POJONode");
    }

    private POJONode AudioAttributesCompatParcelizer(PolymorphicTypeValidator polymorphicTypeValidator, _pojoEquals _pojoequals, long j) {
        POJONode pOJONode = _pojoequals.AudioAttributesCompatParcelizer;
        StdKeySerializers.write writeVar = pOJONode.AudioAttributesCompatParcelizer;
        polymorphicTypeValidator.RemoteActionCompatParcelizer(writeVar.AudioAttributesCompatParcelizer, this.AudioAttributesImplApi26Parcelizer);
        if (writeVar.IconCompatParcelizer()) {
            int i = writeVar.write;
            int i2 = this.AudioAttributesImplApi26Parcelizer.read(i);
            if (i2 == -1) {
                return null;
            }
            int iAudioAttributesCompatParcelizer = this.AudioAttributesImplApi26Parcelizer.AudioAttributesCompatParcelizer(i, writeVar.read);
            if (iAudioAttributesCompatParcelizer < i2) {
                return write(polymorphicTypeValidator, writeVar.AudioAttributesCompatParcelizer, i, iAudioAttributesCompatParcelizer, pOJONode.AudioAttributesImplBaseParcelizer, writeVar.RemoteActionCompatParcelizer);
            }
            long jLongValue = pOJONode.AudioAttributesImplBaseParcelizer;
            if (jLongValue == C.TIME_UNSET) {
                PolymorphicTypeValidator.IconCompatParcelizer iconCompatParcelizer = this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
                PolymorphicTypeValidator.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = this.AudioAttributesImplApi26Parcelizer;
                Pair<Object, Long> pairWrite = polymorphicTypeValidator.write(iconCompatParcelizer, audioAttributesCompatParcelizer, audioAttributesCompatParcelizer.AudioAttributesImplBaseParcelizer, C.TIME_UNSET, Math.max(0L, j));
                if (pairWrite == null) {
                    return null;
                }
                jLongValue = ((Long) pairWrite.second).longValue();
            }
            return write(polymorphicTypeValidator, writeVar.AudioAttributesCompatParcelizer, Math.max(IconCompatParcelizer(polymorphicTypeValidator, writeVar.AudioAttributesCompatParcelizer, writeVar.write), jLongValue), pOJONode.AudioAttributesImplBaseParcelizer, writeVar.RemoteActionCompatParcelizer);
        }
        if (writeVar.IconCompatParcelizer != -1 && this.AudioAttributesImplApi26Parcelizer.MediaBrowserCompatItemReceiver(writeVar.IconCompatParcelizer)) {
            return read(polymorphicTypeValidator, _pojoequals, j);
        }
        int iAudioAttributesCompatParcelizer2 = this.AudioAttributesImplApi26Parcelizer.AudioAttributesCompatParcelizer(writeVar.IconCompatParcelizer);
        boolean z = this.AudioAttributesImplApi26Parcelizer.AudioAttributesImplBaseParcelizer(writeVar.IconCompatParcelizer) && this.AudioAttributesImplApi26Parcelizer.IconCompatParcelizer(writeVar.IconCompatParcelizer, iAudioAttributesCompatParcelizer2) == 3;
        if (iAudioAttributesCompatParcelizer2 == this.AudioAttributesImplApi26Parcelizer.read(writeVar.IconCompatParcelizer) || z) {
            return write(polymorphicTypeValidator, writeVar.AudioAttributesCompatParcelizer, IconCompatParcelizer(polymorphicTypeValidator, writeVar.AudioAttributesCompatParcelizer, writeVar.IconCompatParcelizer), pOJONode.read, writeVar.RemoteActionCompatParcelizer);
        }
        return write(polymorphicTypeValidator, writeVar.AudioAttributesCompatParcelizer, writeVar.IconCompatParcelizer, iAudioAttributesCompatParcelizer2, pOJONode.read, writeVar.RemoteActionCompatParcelizer);
    }

    private boolean write(Object obj, PolymorphicTypeValidator polymorphicTypeValidator) {
        int iWrite = polymorphicTypeValidator.RemoteActionCompatParcelizer(obj, this.AudioAttributesImplApi26Parcelizer).write();
        int iAudioAttributesImplBaseParcelizer = this.AudioAttributesImplApi26Parcelizer.AudioAttributesImplBaseParcelizer();
        if (iWrite <= 0 || !this.AudioAttributesImplApi26Parcelizer.AudioAttributesImplBaseParcelizer(iAudioAttributesImplBaseParcelizer)) {
            return false;
        }
        return iWrite > 1 || this.AudioAttributesImplApi26Parcelizer.write(iAudioAttributesImplBaseParcelizer) != Long.MIN_VALUE;
    }

    private POJONode RemoteActionCompatParcelizer(PolymorphicTypeValidator polymorphicTypeValidator, StdKeySerializers.write writeVar, long j, long j2) {
        polymorphicTypeValidator.RemoteActionCompatParcelizer(writeVar.AudioAttributesCompatParcelizer, this.AudioAttributesImplApi26Parcelizer);
        if (writeVar.IconCompatParcelizer()) {
            return write(polymorphicTypeValidator, writeVar.AudioAttributesCompatParcelizer, writeVar.write, writeVar.read, j, writeVar.RemoteActionCompatParcelizer);
        }
        return write(polymorphicTypeValidator, writeVar.AudioAttributesCompatParcelizer, j2, j, writeVar.RemoteActionCompatParcelizer);
    }

    private POJONode write(PolymorphicTypeValidator polymorphicTypeValidator, Object obj, int i, int i2, long j, long j2) {
        StdKeySerializers.write writeVar = new StdKeySerializers.write(obj, i, i2, j2);
        long jRemoteActionCompatParcelizer = polymorphicTypeValidator.RemoteActionCompatParcelizer(writeVar.AudioAttributesCompatParcelizer, this.AudioAttributesImplApi26Parcelizer).RemoteActionCompatParcelizer(writeVar.write, writeVar.read);
        long j3 = i2 == this.AudioAttributesImplApi26Parcelizer.AudioAttributesCompatParcelizer(i) ? this.AudioAttributesImplApi26Parcelizer.read() : 0L;
        return new POJONode(writeVar, (jRemoteActionCompatParcelizer == C.TIME_UNSET || j3 < jRemoteActionCompatParcelizer) ? j3 : Math.max(0L, jRemoteActionCompatParcelizer - 1), j, C.TIME_UNSET, jRemoteActionCompatParcelizer, this.AudioAttributesImplApi26Parcelizer.AudioAttributesImplBaseParcelizer(writeVar.write), false, false, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private kotlin.POJONode write(kotlin.PolymorphicTypeValidator r26, java.lang.Object r27, long r28, long r30, long r32) {
        /*
            Method dump skipped, instruction units count: 211
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.TextNode.write(o.PolymorphicTypeValidator, java.lang.Object, long, long, long):o.POJONode");
    }

    private static boolean AudioAttributesCompatParcelizer(StdKeySerializers.write writeVar) {
        return !writeVar.IconCompatParcelizer() && writeVar.IconCompatParcelizer == -1;
    }

    private boolean RemoteActionCompatParcelizer(PolymorphicTypeValidator polymorphicTypeValidator, StdKeySerializers.write writeVar) {
        if (AudioAttributesCompatParcelizer(writeVar)) {
            return polymorphicTypeValidator.RemoteActionCompatParcelizer(polymorphicTypeValidator.RemoteActionCompatParcelizer(writeVar.AudioAttributesCompatParcelizer, this.AudioAttributesImplApi26Parcelizer).AudioAttributesImplBaseParcelizer, this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver).AudioAttributesImplBaseParcelizer == polymorphicTypeValidator.read(writeVar.AudioAttributesCompatParcelizer);
        }
        return false;
    }

    private boolean read(PolymorphicTypeValidator polymorphicTypeValidator, StdKeySerializers.write writeVar, boolean z) {
        int i = polymorphicTypeValidator.read(writeVar.AudioAttributesCompatParcelizer);
        return !polymorphicTypeValidator.RemoteActionCompatParcelizer(polymorphicTypeValidator.AudioAttributesCompatParcelizer(i, this.AudioAttributesImplApi26Parcelizer).AudioAttributesImplBaseParcelizer, this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver).write && polymorphicTypeValidator.IconCompatParcelizer(i, this.AudioAttributesImplApi26Parcelizer, this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, this.MediaDescriptionCompat, this.RatingCompat) && z;
    }

    private long IconCompatParcelizer(PolymorphicTypeValidator polymorphicTypeValidator, Object obj, int i) {
        polymorphicTypeValidator.RemoteActionCompatParcelizer(obj, this.AudioAttributesImplApi26Parcelizer);
        long jWrite = this.AudioAttributesImplApi26Parcelizer.write(i);
        if (jWrite == Long.MIN_VALUE) {
            return this.AudioAttributesImplApi26Parcelizer.read;
        }
        return jWrite + this.AudioAttributesImplApi26Parcelizer.RemoteActionCompatParcelizer(i);
    }
}
