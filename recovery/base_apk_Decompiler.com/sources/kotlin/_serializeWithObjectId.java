package kotlin;

import android.net.Uri;
import android.text.TextUtils;
import androidx.media3.common.DrmInitData;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.util.MimeTypes;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import kotlin.BeanSerializerBase1;
import kotlin.C0170format;
import kotlin.EnumSerializer;
import kotlin.PropertySerializerMapEmpty;
import kotlin.StdJdkSerializersAtomicIntegerSerializer;
import kotlin.StdKeySerializer;
import kotlin._resolveSuperClass;
import kotlin._serializeAsIndex;

/* JADX INFO: loaded from: classes2.dex */
public final class _serializeWithObjectId implements StdJdkSerializersAtomicIntegerSerializer, _serializeAsIndex.read {
    private final boolean AudioAttributesCompatParcelizer;
    private final _useStatic AudioAttributesImplApi21Parcelizer;
    private final _getReferenced AudioAttributesImplApi26Parcelizer;
    private final PropertySerializerMapEmpty.read AudioAttributesImplBaseParcelizer;
    private final _findWellKnownSimple IconCompatParcelizer;
    private final matchesUntyped MediaBrowserCompatCustomActionResultReceiver;
    private final _getReferencedIfPresent MediaBrowserCompatMediaItem;
    private StdJdkSerializersAtomicIntegerSerializer.AudioAttributesCompatParcelizer MediaBrowserCompatSearchResultReceiver;
    private final int MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    private final StdKeySerializer.read MediaMetadataCompat;
    private final _resolveSuperClass RatingCompat;
    private int RemoteActionCompatParcelizer;
    private final _serializeAsIndex handleMediaPlayPauseIfPendingOnHandler;
    private final modifyArraySerializer onAddQueueItem;
    private final TypeNameIdResolver onCommand;
    private int onCustomAction;
    private final long onPlayFromMediaId;
    private _writeAsBinary onPlayFromSearch;
    private final boolean onPrepare;
    private final _fromClass read;
    private UUIDSerializer write;
    private final BeanSerializerBase1.write onMediaButtonEvent = new write(this, 0);
    private final IdentityHashMap<visitStringFormat, Integer> onPlay = new IdentityHashMap<>();
    private final BooleanSerializerAsNumber onFastForward = new BooleanSerializerAsNumber();
    private BeanSerializerBase1[] onPause = new BeanSerializerBase1[0];
    private BeanSerializerBase1[] MediaBrowserCompatItemReceiver = new BeanSerializerBase1[0];
    private int[][] MediaDescriptionCompat = new int[0][];

    @Override // kotlin.StdJdkSerializersAtomicIntegerSerializer
    public final long E_() {
        return C.TIME_UNSET;
    }

    static /* synthetic */ int RemoteActionCompatParcelizer(_serializeWithObjectId _serializewithobjectid) {
        int i = _serializewithobjectid.onCustomAction - 1;
        _serializewithobjectid.onCustomAction = i;
        return i;
    }

    public _serializeWithObjectId(_getReferencedIfPresent _getreferencedifpresent, _serializeAsIndex _serializeasindex, _getReferenced _getreferenced, TypeNameIdResolver typeNameIdResolver, _fromClass _fromclass, matchesUntyped matchesuntyped, PropertySerializerMapEmpty.read readVar, _resolveSuperClass _resolvesuperclass, StdKeySerializer.read readVar2, _findWellKnownSimple _findwellknownsimple, _useStatic _usestatic, boolean z, int i, boolean z2, modifyArraySerializer modifyarrayserializer, long j) {
        this.MediaBrowserCompatMediaItem = _getreferencedifpresent;
        this.handleMediaPlayPauseIfPendingOnHandler = _serializeasindex;
        this.AudioAttributesImplApi26Parcelizer = _getreferenced;
        this.onCommand = typeNameIdResolver;
        this.read = _fromclass;
        this.MediaBrowserCompatCustomActionResultReceiver = matchesuntyped;
        this.AudioAttributesImplBaseParcelizer = readVar;
        this.RatingCompat = _resolvesuperclass;
        this.MediaMetadataCompat = readVar2;
        this.IconCompatParcelizer = _findwellknownsimple;
        this.AudioAttributesImplApi21Parcelizer = _usestatic;
        this.AudioAttributesCompatParcelizer = z;
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = i;
        this.onPrepare = z2;
        this.onAddQueueItem = modifyarrayserializer;
        this.onPlayFromMediaId = j;
        this.write = _usestatic.read();
    }

    public final void MediaBrowserCompatCustomActionResultReceiver() {
        this.handleMediaPlayPauseIfPendingOnHandler.RemoteActionCompatParcelizer(this);
        for (BeanSerializerBase1 beanSerializerBase1 : this.onPause) {
            beanSerializerBase1.MediaBrowserCompatSearchResultReceiver();
        }
        this.MediaBrowserCompatSearchResultReceiver = null;
    }

    @Override // kotlin.StdJdkSerializersAtomicIntegerSerializer
    public final void IconCompatParcelizer(StdJdkSerializersAtomicIntegerSerializer.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer, long j) {
        this.MediaBrowserCompatSearchResultReceiver = audioAttributesCompatParcelizer;
        this.handleMediaPlayPauseIfPendingOnHandler.read(this);
        read(j);
    }

    @Override // kotlin.StdJdkSerializersAtomicIntegerSerializer
    public final void write() throws IOException {
        for (BeanSerializerBase1 beanSerializerBase1 : this.onPause) {
            beanSerializerBase1.AudioAttributesImplApi21Parcelizer();
        }
    }

    @Override // kotlin.StdJdkSerializersAtomicIntegerSerializer
    public final _writeAsBinary D_() {
        return (_writeAsBinary) buildTypeSerializer.IconCompatParcelizer(this.onPlayFromSearch);
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x00dc  */
    @Override // kotlin.StdJdkSerializersAtomicIntegerSerializer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long read(kotlin._verifyAndResolvePlaceholders[] r22, boolean[] r23, kotlin.visitStringFormat[] r24, boolean[] r25, long r26) {
        /*
            Method dump skipped, instruction units count: 286
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin._serializeWithObjectId.read(o._verifyAndResolvePlaceholders[], boolean[], o.visitStringFormat[], boolean[], long):long");
    }

    @Override // kotlin.StdJdkSerializersAtomicIntegerSerializer
    public final void IconCompatParcelizer(long j, boolean z) {
        for (BeanSerializerBase1 beanSerializerBase1 : this.MediaBrowserCompatItemReceiver) {
            beanSerializerBase1.RemoteActionCompatParcelizer(j, z);
        }
    }

    @Override // kotlin.StdJdkSerializersAtomicIntegerSerializer, kotlin.UUIDSerializer
    public final void RemoteActionCompatParcelizer(long j) {
        this.write.RemoteActionCompatParcelizer(j);
    }

    @Override // kotlin.StdJdkSerializersAtomicIntegerSerializer, kotlin.UUIDSerializer
    public final boolean RemoteActionCompatParcelizer(_put _putVar) {
        if (this.onPlayFromSearch == null) {
            for (BeanSerializerBase1 beanSerializerBase1 : this.onPause) {
                beanSerializerBase1.write();
            }
            return false;
        }
        return this.write.RemoteActionCompatParcelizer(_putVar);
    }

    @Override // kotlin.StdJdkSerializersAtomicIntegerSerializer, kotlin.UUIDSerializer
    public final boolean IconCompatParcelizer() {
        return this.write.IconCompatParcelizer();
    }

    @Override // kotlin.StdJdkSerializersAtomicIntegerSerializer, kotlin.UUIDSerializer
    public final long AudioAttributesCompatParcelizer() {
        return this.write.AudioAttributesCompatParcelizer();
    }

    @Override // kotlin.StdJdkSerializersAtomicIntegerSerializer, kotlin.UUIDSerializer
    public final long read() {
        return this.write.read();
    }

    @Override // kotlin.StdJdkSerializersAtomicIntegerSerializer
    public final long write(long j) {
        BeanSerializerBase1[] beanSerializerBase1Arr = this.MediaBrowserCompatItemReceiver;
        if (beanSerializerBase1Arr.length > 0) {
            boolean zWrite = beanSerializerBase1Arr[0].write(j, false);
            int i = 1;
            while (true) {
                BeanSerializerBase1[] beanSerializerBase1Arr2 = this.MediaBrowserCompatItemReceiver;
                if (i >= beanSerializerBase1Arr2.length) {
                    break;
                }
                beanSerializerBase1Arr2[i].write(j, zWrite);
                i++;
            }
            if (zWrite) {
                this.onFastForward.IconCompatParcelizer();
            }
        }
        return j;
    }

    @Override // kotlin.StdJdkSerializersAtomicIntegerSerializer
    public final long read(long j, createKeySerializer createkeyserializer) {
        for (BeanSerializerBase1 beanSerializerBase1 : this.MediaBrowserCompatItemReceiver) {
            if (beanSerializerBase1.AudioAttributesImplApi26Parcelizer()) {
                return beanSerializerBase1.RemoteActionCompatParcelizer(j, createkeyserializer);
            }
        }
        return j;
    }

    @Override // o._serializeAsIndex.read
    public final void AudioAttributesImplApi26Parcelizer() {
        for (BeanSerializerBase1 beanSerializerBase1 : this.onPause) {
            beanSerializerBase1.MediaBrowserCompatMediaItem();
        }
        this.MediaBrowserCompatSearchResultReceiver.RemoteActionCompatParcelizer(this);
    }

    @Override // o._serializeAsIndex.read
    public final boolean write(Uri uri, _resolveSuperClass.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer, boolean z) {
        boolean zIconCompatParcelizer = true;
        for (BeanSerializerBase1 beanSerializerBase1 : this.onPause) {
            zIconCompatParcelizer &= beanSerializerBase1.IconCompatParcelizer(uri, audioAttributesCompatParcelizer, z);
        }
        this.MediaBrowserCompatSearchResultReceiver.RemoteActionCompatParcelizer(this);
        return zIconCompatParcelizer;
    }

    private void read(long j) {
        Map<String, DrmInitData> mapEmptyMap;
        EnumSerializer enumSerializer = (EnumSerializer) buildTypeSerializer.IconCompatParcelizer(this.handleMediaPlayPauseIfPendingOnHandler.AudioAttributesCompatParcelizer());
        if (this.onPrepare) {
            mapEmptyMap = AudioAttributesCompatParcelizer(enumSerializer.AudioAttributesImplApi26Parcelizer);
        } else {
            mapEmptyMap = Collections.emptyMap();
        }
        Map<String, DrmInitData> map = mapEmptyMap;
        boolean zIsEmpty = enumSerializer.MediaBrowserCompatCustomActionResultReceiver.isEmpty();
        List<EnumSerializer.AudioAttributesCompatParcelizer> list = enumSerializer.AudioAttributesCompatParcelizer;
        List<EnumSerializer.AudioAttributesCompatParcelizer> list2 = enumSerializer.AudioAttributesImplApi21Parcelizer;
        int i = 0;
        this.onCustomAction = 0;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (!zIsEmpty) {
            RemoteActionCompatParcelizer(enumSerializer, j, arrayList, arrayList2, map);
        }
        read(j, list, arrayList, arrayList2, map);
        this.RemoteActionCompatParcelizer = arrayList.size();
        int i2 = 0;
        while (i2 < list2.size()) {
            EnumSerializer.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = list2.get(i2);
            StringBuilder sb = new StringBuilder("subtitle:");
            sb.append(i2);
            sb.append(":");
            sb.append(audioAttributesCompatParcelizer.AudioAttributesCompatParcelizer);
            String string = sb.toString();
            C0170format c0170format = audioAttributesCompatParcelizer.RemoteActionCompatParcelizer;
            int i3 = i2;
            BeanSerializerBase1 beanSerializerBase1IconCompatParcelizer = IconCompatParcelizer(string, 3, new Uri[]{audioAttributesCompatParcelizer.read}, new C0170format[]{c0170format}, null, Collections.emptyList(), map, j);
            arrayList2.add(new int[]{i3});
            arrayList.add(beanSerializerBase1IconCompatParcelizer);
            beanSerializerBase1IconCompatParcelizer.AudioAttributesCompatParcelizer(new setName[]{new setName(string, this.MediaBrowserCompatMediaItem.write(c0170format))}, new int[0]);
            i2 = i3 + 1;
            i = 0;
            map = map;
        }
        int i4 = i;
        this.onPause = (BeanSerializerBase1[]) arrayList.toArray(new BeanSerializerBase1[i4]);
        this.MediaDescriptionCompat = (int[][]) arrayList2.toArray(new int[i4][]);
        this.onCustomAction = this.onPause.length;
        for (int i5 = i4; i5 < this.RemoteActionCompatParcelizer; i5++) {
            this.onPause[i5].IconCompatParcelizer(true);
        }
        BeanSerializerBase1[] beanSerializerBase1Arr = this.onPause;
        int length = beanSerializerBase1Arr.length;
        for (int i6 = i4; i6 < length; i6++) {
            beanSerializerBase1Arr[i6].write();
        }
        this.MediaBrowserCompatItemReceiver = this.onPause;
    }

    private void RemoteActionCompatParcelizer(EnumSerializer enumSerializer, long j, List<BeanSerializerBase1> list, List<int[]> list2, Map<String, DrmInitData> map) {
        int i;
        boolean z;
        boolean z2;
        int size = enumSerializer.MediaBrowserCompatCustomActionResultReceiver.size();
        int[] iArr = new int[size];
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < enumSerializer.MediaBrowserCompatCustomActionResultReceiver.size(); i4++) {
            C0170format c0170format = enumSerializer.MediaBrowserCompatCustomActionResultReceiver.get(i4).RemoteActionCompatParcelizer;
            if (c0170format.MediaMetadataCompat > 0 || LaissezFaireSubTypeValidator.IconCompatParcelizer(c0170format.RemoteActionCompatParcelizer, 2) != null) {
                iArr[i4] = 2;
                i2++;
            } else if (LaissezFaireSubTypeValidator.IconCompatParcelizer(c0170format.RemoteActionCompatParcelizer, 1) != null) {
                iArr[i4] = 1;
                i3++;
            } else {
                iArr[i4] = -1;
            }
        }
        if (i2 > 0) {
            i = i2;
            z2 = false;
            z = true;
        } else if (i3 < size) {
            i = size - i3;
            z = false;
            z2 = true;
        } else {
            i = size;
            z = false;
            z2 = false;
        }
        Uri[] uriArr = new Uri[i];
        C0170format[] c0170formatArr = new C0170format[i];
        int[] iArr2 = new int[i];
        int i5 = 0;
        for (int i6 = 0; i6 < enumSerializer.MediaBrowserCompatCustomActionResultReceiver.size(); i6++) {
            if ((!z || iArr[i6] == 2) && (!z2 || iArr[i6] != 1)) {
                EnumSerializer.IconCompatParcelizer iconCompatParcelizer = enumSerializer.MediaBrowserCompatCustomActionResultReceiver.get(i6);
                uriArr[i5] = iconCompatParcelizer.read;
                c0170formatArr[i5] = iconCompatParcelizer.RemoteActionCompatParcelizer;
                iArr2[i5] = i6;
                i5++;
            }
        }
        String str = c0170formatArr[0].RemoteActionCompatParcelizer;
        int iRemoteActionCompatParcelizer = LaissezFaireSubTypeValidator.RemoteActionCompatParcelizer(str, 2);
        int iRemoteActionCompatParcelizer2 = LaissezFaireSubTypeValidator.RemoteActionCompatParcelizer(str, 1);
        boolean z3 = (iRemoteActionCompatParcelizer2 == 1 || (iRemoteActionCompatParcelizer2 == 0 && enumSerializer.AudioAttributesCompatParcelizer.isEmpty())) && iRemoteActionCompatParcelizer <= 1 && iRemoteActionCompatParcelizer2 + iRemoteActionCompatParcelizer > 0;
        BeanSerializerBase1 beanSerializerBase1IconCompatParcelizer = IconCompatParcelizer("main", (z || iRemoteActionCompatParcelizer2 <= 0) ? 0 : 1, uriArr, c0170formatArr, enumSerializer.read, enumSerializer.MediaBrowserCompatItemReceiver, map, j);
        list.add(beanSerializerBase1IconCompatParcelizer);
        list2.add(iArr2);
        if (this.AudioAttributesCompatParcelizer && z3) {
            ArrayList arrayList = new ArrayList();
            if (iRemoteActionCompatParcelizer > 0) {
                C0170format[] c0170formatArr2 = new C0170format[i];
                for (int i7 = 0; i7 < i; i7++) {
                    c0170formatArr2[i7] = AudioAttributesCompatParcelizer(c0170formatArr[i7]);
                }
                arrayList.add(new setName("main", c0170formatArr2));
                if (iRemoteActionCompatParcelizer2 > 0 && (enumSerializer.read != null || enumSerializer.AudioAttributesCompatParcelizer.isEmpty())) {
                    arrayList.add(new setName("main:audio", read(c0170formatArr[0], enumSerializer.read, false)));
                }
                List<C0170format> list3 = enumSerializer.MediaBrowserCompatItemReceiver;
                if (list3 != null) {
                    for (int i8 = 0; i8 < list3.size(); i8++) {
                        arrayList.add(new setName("main:cc:".concat(String.valueOf(i8)), this.MediaBrowserCompatMediaItem.write(list3.get(i8))));
                    }
                }
            } else {
                C0170format[] c0170formatArr3 = new C0170format[i];
                for (int i9 = 0; i9 < i; i9++) {
                    c0170formatArr3[i9] = read(c0170formatArr[i9], enumSerializer.read, true);
                }
                arrayList.add(new setName("main", c0170formatArr3));
            }
            setName setname = new setName("main:id3", new C0170format.RemoteActionCompatParcelizer().AudioAttributesCompatParcelizer("ID3").AudioAttributesImplApi26Parcelizer(MimeTypes.APPLICATION_ID3).IconCompatParcelizer());
            arrayList.add(setname);
            beanSerializerBase1IconCompatParcelizer.AudioAttributesCompatParcelizer((setName[]) arrayList.toArray(new setName[0]), arrayList.indexOf(setname));
        }
    }

    private void read(long j, List<EnumSerializer.AudioAttributesCompatParcelizer> list, List<BeanSerializerBase1> list2, List<int[]> list3, Map<String, DrmInitData> map) {
        ArrayList arrayList = new ArrayList(list.size());
        ArrayList arrayList2 = new ArrayList(list.size());
        ArrayList arrayList3 = new ArrayList(list.size());
        HashSet hashSet = new HashSet();
        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i).AudioAttributesCompatParcelizer;
            if (hashSet.add(str)) {
                arrayList.clear();
                arrayList2.clear();
                arrayList3.clear();
                boolean z = true;
                for (int i2 = 0; i2 < list.size(); i2++) {
                    if (LaissezFaireSubTypeValidator.read(str, list.get(i2).AudioAttributesCompatParcelizer)) {
                        EnumSerializer.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = list.get(i2);
                        arrayList3.add(Integer.valueOf(i2));
                        arrayList.add(audioAttributesCompatParcelizer.read);
                        arrayList2.add(audioAttributesCompatParcelizer.RemoteActionCompatParcelizer);
                        z &= LaissezFaireSubTypeValidator.RemoteActionCompatParcelizer(audioAttributesCompatParcelizer.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer, 1) == 1;
                    }
                }
                String strConcat = "audio:".concat(String.valueOf(str));
                BeanSerializerBase1 beanSerializerBase1IconCompatParcelizer = IconCompatParcelizer(strConcat, 1, (Uri[]) arrayList.toArray((Uri[]) LaissezFaireSubTypeValidator.AudioAttributesCompatParcelizer(new Uri[0])), (C0170format[]) arrayList2.toArray(new C0170format[0]), null, Collections.emptyList(), map, j);
                list3.add(parseTextAttribute.write(arrayList3));
                list2.add(beanSerializerBase1IconCompatParcelizer);
                if (this.AudioAttributesCompatParcelizer && z) {
                    beanSerializerBase1IconCompatParcelizer.AudioAttributesCompatParcelizer(new setName[]{new setName(strConcat, (C0170format[]) arrayList2.toArray(new C0170format[0]))}, new int[0]);
                }
            }
        }
    }

    private BeanSerializerBase1 IconCompatParcelizer(String str, int i, Uri[] uriArr, C0170format[] c0170formatArr, C0170format c0170format, List<C0170format> list, Map<String, DrmInitData> map, long j) {
        return new BeanSerializerBase1(str, i, this.onMediaButtonEvent, new AsArraySerializerBase(this.MediaBrowserCompatMediaItem, this.handleMediaPlayPauseIfPendingOnHandler, uriArr, c0170formatArr, this.AudioAttributesImplApi26Parcelizer, this.onCommand, this.onFastForward, this.onPlayFromMediaId, list, this.onAddQueueItem, this.read), map, this.IconCompatParcelizer, j, c0170format, this.MediaBrowserCompatCustomActionResultReceiver, this.AudioAttributesImplBaseParcelizer, this.RatingCompat, this.MediaMetadataCompat, this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver);
    }

    private static Map<String, DrmInitData> AudioAttributesCompatParcelizer(List<DrmInitData> list) {
        ArrayList arrayList = new ArrayList(list);
        HashMap map = new HashMap();
        int i = 0;
        while (i < arrayList.size()) {
            DrmInitData drmInitDataAudioAttributesCompatParcelizer = list.get(i);
            String str = drmInitDataAudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer;
            i++;
            int i2 = i;
            while (i2 < arrayList.size()) {
                DrmInitData drmInitData = (DrmInitData) arrayList.get(i2);
                if (TextUtils.equals(drmInitData.AudioAttributesCompatParcelizer, str)) {
                    drmInitDataAudioAttributesCompatParcelizer = drmInitDataAudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(drmInitData);
                    arrayList.remove(i2);
                } else {
                    i2++;
                }
            }
            map.put(str, drmInitDataAudioAttributesCompatParcelizer);
        }
        return map;
    }

    private static C0170format AudioAttributesCompatParcelizer(C0170format c0170format) {
        String strIconCompatParcelizer = LaissezFaireSubTypeValidator.IconCompatParcelizer(c0170format.RemoteActionCompatParcelizer, 2);
        return new C0170format.RemoteActionCompatParcelizer().AudioAttributesCompatParcelizer(c0170format.handleMediaPlayPauseIfPendingOnHandler).write(c0170format.onCustomAction).IconCompatParcelizer(c0170format.onCommand).IconCompatParcelizer(c0170format.AudioAttributesImplApi21Parcelizer).AudioAttributesImplApi26Parcelizer(DefaultBaseTypeLimitingValidator.write(strIconCompatParcelizer)).RemoteActionCompatParcelizer(strIconCompatParcelizer).read(c0170format.onPlay).write(c0170format.IconCompatParcelizer).MediaDescriptionCompat(c0170format.onFastForward).onFastForward(c0170format.onSetCaptioningEnabled).MediaBrowserCompatItemReceiver(c0170format.MediaMetadataCompat).RemoteActionCompatParcelizer(c0170format.RatingCompat).handleMediaPlayPauseIfPendingOnHandler(c0170format.onRewind).MediaBrowserCompatSearchResultReceiver(c0170format.onPrepare).IconCompatParcelizer();
    }

    private static C0170format read(C0170format c0170format, C0170format c0170format2, boolean z) {
        androidx.media3.common.Metadata metadata;
        String str;
        int i;
        int i2;
        int i3;
        String str2;
        String str3;
        List<JsonValueFormatVisitor> list;
        List<JsonValueFormatVisitor> listAudioAttributesImplApi26Parcelizer = initExtraTracks.AudioAttributesImplApi26Parcelizer();
        if (c0170format2 != null) {
            str3 = c0170format2.RemoteActionCompatParcelizer;
            metadata = c0170format2.onPlay;
            i2 = c0170format2.AudioAttributesCompatParcelizer;
            i = c0170format2.onRewind;
            i3 = c0170format2.onPrepare;
            str = c0170format2.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
            str2 = c0170format2.onCustomAction;
            list = c0170format2.onCommand;
        } else {
            String strIconCompatParcelizer = LaissezFaireSubTypeValidator.IconCompatParcelizer(c0170format.RemoteActionCompatParcelizer, 1);
            metadata = c0170format.onPlay;
            if (z) {
                i2 = c0170format.AudioAttributesCompatParcelizer;
                i = c0170format.onRewind;
                i3 = c0170format.onPrepare;
                str = c0170format.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
                str2 = c0170format.onCustomAction;
                listAudioAttributesImplApi26Parcelizer = c0170format.onCommand;
            } else {
                str = null;
                i = 0;
                i2 = -1;
                i3 = 0;
                str2 = null;
            }
            List<JsonValueFormatVisitor> list2 = listAudioAttributesImplApi26Parcelizer;
            str3 = strIconCompatParcelizer;
            list = list2;
        }
        return new C0170format.RemoteActionCompatParcelizer().AudioAttributesCompatParcelizer(c0170format.handleMediaPlayPauseIfPendingOnHandler).write(str2).IconCompatParcelizer(list).IconCompatParcelizer(c0170format.AudioAttributesImplApi21Parcelizer).AudioAttributesImplApi26Parcelizer(DefaultBaseTypeLimitingValidator.write(str3)).RemoteActionCompatParcelizer(str3).read(metadata).write(z ? c0170format.IconCompatParcelizer : -1).MediaDescriptionCompat(z ? c0170format.onFastForward : -1).read(i2).handleMediaPlayPauseIfPendingOnHandler(i).MediaBrowserCompatSearchResultReceiver(i3).read(str).IconCompatParcelizer();
    }

    class write implements BeanSerializerBase1.write {
        private write() {
        }

        /* synthetic */ write(_serializeWithObjectId _serializewithobjectid, byte b) {
            this();
        }

        @Override // o.UUIDSerializer.RemoteActionCompatParcelizer
        public final /* synthetic */ void RemoteActionCompatParcelizer(UUIDSerializer uUIDSerializer) {
            read();
        }

        @Override // o.BeanSerializerBase1.write
        public final void write() {
            if (_serializeWithObjectId.RemoteActionCompatParcelizer(_serializeWithObjectId.this) > 0) {
                return;
            }
            int i = 0;
            for (BeanSerializerBase1 beanSerializerBase1 : _serializeWithObjectId.this.onPause) {
                i += beanSerializerBase1.MediaBrowserCompatItemReceiver().RemoteActionCompatParcelizer;
            }
            setName[] setnameArr = new setName[i];
            int i2 = 0;
            for (BeanSerializerBase1 beanSerializerBase12 : _serializeWithObjectId.this.onPause) {
                int i3 = beanSerializerBase12.MediaBrowserCompatItemReceiver().RemoteActionCompatParcelizer;
                int i4 = 0;
                while (i4 < i3) {
                    setnameArr[i2] = beanSerializerBase12.MediaBrowserCompatItemReceiver().RemoteActionCompatParcelizer(i4);
                    i4++;
                    i2++;
                }
            }
            _serializeWithObjectId.this.onPlayFromSearch = new _writeAsBinary(setnameArr);
            _serializeWithObjectId.this.MediaBrowserCompatSearchResultReceiver.write(_serializeWithObjectId.this);
        }

        @Override // o.BeanSerializerBase1.write
        public final void RemoteActionCompatParcelizer(Uri uri) {
            _serializeWithObjectId.this.handleMediaPlayPauseIfPendingOnHandler.write(uri);
        }

        private void read() {
            _serializeWithObjectId.this.MediaBrowserCompatSearchResultReceiver.RemoteActionCompatParcelizer(_serializeWithObjectId.this);
        }
    }
}
