package kotlin;

import android.util.Pair;
import android.util.SparseArray;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.util.MimeTypes;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.AttributePropertyWriter;
import kotlin.C0170format;
import kotlin.PlaceholderForType;
import kotlin.PropertySerializerMapEmpty;
import kotlin.StdJdkSerializersAtomicIntegerSerializer;
import kotlin.StdKeySerializer;
import kotlin.UUIDSerializer;
import kotlin.addTypedSerializer;

/* JADX INFO: loaded from: classes2.dex */
public final class _suppressableValue implements StdJdkSerializersAtomicIntegerSerializer, UUIDSerializer.RemoteActionCompatParcelizer<PlaceholderForType<addTypedSerializer>>, PlaceholderForType.read<addTypedSerializer> {
    private static final Pattern read = Pattern.compile("CC([1-4])=(.+)");
    private static final Pattern write = Pattern.compile("([1-4])=lang:(\\w+)(,.+)?");
    private final typedValueSerializer AudioAttributesCompatParcelizer;
    private final _fromClass AudioAttributesImplApi21Parcelizer;
    private UUIDSerializer AudioAttributesImplApi26Parcelizer;
    private StdJdkSerializersAtomicIntegerSerializer.AudioAttributesCompatParcelizer AudioAttributesImplBaseParcelizer;
    private final _findWellKnownSimple IconCompatParcelizer;
    private final _useStatic MediaBrowserCompatCustomActionResultReceiver;
    private final addTypedSerializer.write MediaBrowserCompatItemReceiver;
    private final long MediaBrowserCompatMediaItem;
    private int MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    private final matchesUntyped MediaDescriptionCompat;
    private List<serializeTypedContents> MediaMetadataCompat;
    private final PropertySerializerMapEmpty.read RatingCompat;
    public final int RemoteActionCompatParcelizer;
    private final StdKeySerializer.read handleMediaPlayPauseIfPendingOnHandler;
    private final _resolveSuperClass onAddQueueItem;
    private final classForName onCommand;
    private FilteredBeanPropertyWriterMultiView onCustomAction;
    private final AttributePropertyWriter onPause;
    private final modifyArraySerializer onPlay;
    private final read[] onPlayFromMediaId;
    private final TypeNameIdResolver onPrepare;
    private final _writeAsBinary onPrepareFromMediaId;
    private PlaceholderForType<addTypedSerializer>[] onFastForward = write(0);
    private BeanAsArraySerializer[] MediaBrowserCompatSearchResultReceiver = new BeanAsArraySerializer[0];
    private final IdentityHashMap<PlaceholderForType<addTypedSerializer>, AttributePropertyWriter.write> onMediaButtonEvent = new IdentityHashMap<>();

    @Override // kotlin.StdJdkSerializersAtomicIntegerSerializer
    public final long E_() {
        return C.TIME_UNSET;
    }

    @Override // o.UUIDSerializer.RemoteActionCompatParcelizer
    public final /* synthetic */ void RemoteActionCompatParcelizer(UUIDSerializer uUIDSerializer) {
        AudioAttributesImplApi26Parcelizer();
    }

    public _suppressableValue(int i, FilteredBeanPropertyWriterMultiView filteredBeanPropertyWriterMultiView, typedValueSerializer typedvalueserializer, int i2, addTypedSerializer.write writeVar, TypeNameIdResolver typeNameIdResolver, _fromClass _fromclass, matchesUntyped matchesuntyped, PropertySerializerMapEmpty.read readVar, _resolveSuperClass _resolvesuperclass, StdKeySerializer.read readVar2, long j, classForName classforname, _findWellKnownSimple _findwellknownsimple, _useStatic _usestatic, AttributePropertyWriter.IconCompatParcelizer iconCompatParcelizer, modifyArraySerializer modifyarrayserializer) {
        this.RemoteActionCompatParcelizer = i;
        this.onCustomAction = filteredBeanPropertyWriterMultiView;
        this.AudioAttributesCompatParcelizer = typedvalueserializer;
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = i2;
        this.MediaBrowserCompatItemReceiver = writeVar;
        this.onPrepare = typeNameIdResolver;
        this.AudioAttributesImplApi21Parcelizer = _fromclass;
        this.MediaDescriptionCompat = matchesuntyped;
        this.RatingCompat = readVar;
        this.onAddQueueItem = _resolvesuperclass;
        this.handleMediaPlayPauseIfPendingOnHandler = readVar2;
        this.MediaBrowserCompatMediaItem = j;
        this.onCommand = classforname;
        this.IconCompatParcelizer = _findwellknownsimple;
        this.MediaBrowserCompatCustomActionResultReceiver = _usestatic;
        this.onPlay = modifyarrayserializer;
        this.onPause = new AttributePropertyWriter(filteredBeanPropertyWriterMultiView, iconCompatParcelizer, _findwellknownsimple);
        this.AudioAttributesImplApi26Parcelizer = _usestatic.read();
        serializeContents serializecontentsAudioAttributesCompatParcelizer = filteredBeanPropertyWriterMultiView.AudioAttributesCompatParcelizer(i2);
        this.MediaMetadataCompat = serializecontentsAudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer;
        Pair<_writeAsBinary, read[]> pair = read(matchesuntyped, writeVar, serializecontentsAudioAttributesCompatParcelizer.RemoteActionCompatParcelizer, this.MediaMetadataCompat);
        this.onPrepareFromMediaId = (_writeAsBinary) pair.first;
        this.onPlayFromMediaId = (read[]) pair.second;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void read(kotlin.FilteredBeanPropertyWriterMultiView r10, int r11) {
        /*
            r9 = this;
            r9.onCustomAction = r10
            r9.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = r11
            o.AttributePropertyWriter r0 = r9.onPause
            r0.RemoteActionCompatParcelizer(r10)
            o.PlaceholderForType<o.addTypedSerializer>[] r0 = r9.onFastForward
            r1 = 0
            if (r0 == 0) goto L25
            int r2 = r0.length
            r3 = r1
        L10:
            if (r3 >= r2) goto L20
            r4 = r0[r3]
            o.MapLikeType r4 = r4.write()
            o.addTypedSerializer r4 = (kotlin.addTypedSerializer) r4
            r4.RemoteActionCompatParcelizer(r10, r11)
            int r3 = r3 + 1
            goto L10
        L20:
            o.StdJdkSerializersAtomicIntegerSerializer$AudioAttributesCompatParcelizer r0 = r9.AudioAttributesImplBaseParcelizer
            r0.RemoteActionCompatParcelizer(r9)
        L25:
            o.serializeContents r0 = r10.AudioAttributesCompatParcelizer(r11)
            java.util.List<o.serializeTypedContents> r0 = r0.AudioAttributesCompatParcelizer
            r9.MediaMetadataCompat = r0
            o.BeanAsArraySerializer[] r0 = r9.MediaBrowserCompatSearchResultReceiver
            int r2 = r0.length
            r3 = r1
        L31:
            if (r3 >= r2) goto L68
            r4 = r0[r3]
            java.util.List<o.serializeTypedContents> r5 = r9.MediaMetadataCompat
            java.util.Iterator r5 = r5.iterator()
        L3b:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L65
            java.lang.Object r6 = r5.next()
            o.serializeTypedContents r6 = (kotlin.serializeTypedContents) r6
            java.lang.String r7 = r6.AudioAttributesCompatParcelizer()
            java.lang.String r8 = r4.RemoteActionCompatParcelizer()
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L3b
            int r5 = r10.read()
            boolean r7 = r10.RemoteActionCompatParcelizer
            if (r7 == 0) goto L61
            r7 = 1
            int r5 = r5 - r7
            if (r11 == r5) goto L62
        L61:
            r7 = r1
        L62:
            r4.AudioAttributesCompatParcelizer(r6, r7)
        L65:
            int r3 = r3 + 1
            goto L31
        L68:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin._suppressableValue.read(o.FilteredBeanPropertyWriterMultiView, int):void");
    }

    public final void MediaBrowserCompatCustomActionResultReceiver() {
        this.onPause.AudioAttributesCompatParcelizer();
        for (PlaceholderForType<addTypedSerializer> placeholderForType : this.onFastForward) {
            placeholderForType.IconCompatParcelizer(this);
        }
        this.AudioAttributesImplBaseParcelizer = null;
    }

    @Override // o.PlaceholderForType.read
    public final void IconCompatParcelizer(PlaceholderForType<addTypedSerializer> placeholderForType) {
        synchronized (this) {
            AttributePropertyWriter.write writeVarRemove = this.onMediaButtonEvent.remove(placeholderForType);
            if (writeVarRemove != null) {
                writeVarRemove.read();
            }
        }
    }

    @Override // kotlin.StdJdkSerializersAtomicIntegerSerializer
    public final void IconCompatParcelizer(StdJdkSerializersAtomicIntegerSerializer.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer, long j) {
        this.AudioAttributesImplBaseParcelizer = audioAttributesCompatParcelizer;
        audioAttributesCompatParcelizer.write(this);
    }

    @Override // kotlin.StdJdkSerializersAtomicIntegerSerializer
    public final void write() throws IOException {
        this.onCommand.read();
    }

    @Override // kotlin.StdJdkSerializersAtomicIntegerSerializer
    public final _writeAsBinary D_() {
        return this.onPrepareFromMediaId;
    }

    @Override // kotlin.StdJdkSerializersAtomicIntegerSerializer
    public final long read(_verifyAndResolvePlaceholders[] _verifyandresolveplaceholdersArr, boolean[] zArr, visitStringFormat[] visitstringformatArr, boolean[] zArr2, long j) {
        int[] iArrRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(_verifyandresolveplaceholdersArr);
        IconCompatParcelizer(_verifyandresolveplaceholdersArr, zArr, visitstringformatArr);
        write(_verifyandresolveplaceholdersArr, visitstringformatArr, iArrRemoteActionCompatParcelizer);
        RemoteActionCompatParcelizer(_verifyandresolveplaceholdersArr, visitstringformatArr, zArr2, j, iArrRemoteActionCompatParcelizer);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (visitStringFormat visitstringformat : visitstringformatArr) {
            if (visitstringformat instanceof PlaceholderForType) {
                arrayList.add((PlaceholderForType) visitstringformat);
            } else if (visitstringformat instanceof BeanAsArraySerializer) {
                arrayList2.add((BeanAsArraySerializer) visitstringformat);
            }
        }
        PlaceholderForType<addTypedSerializer>[] placeholderForTypeArrWrite = write(arrayList.size());
        this.onFastForward = placeholderForTypeArrWrite;
        arrayList.toArray(placeholderForTypeArrWrite);
        BeanAsArraySerializer[] beanAsArraySerializerArr = new BeanAsArraySerializer[arrayList2.size()];
        this.MediaBrowserCompatSearchResultReceiver = beanAsArraySerializerArr;
        arrayList2.toArray(beanAsArraySerializerArr);
        this.AudioAttributesImplApi26Parcelizer = this.MediaBrowserCompatCustomActionResultReceiver.write(arrayList, parseMehd.RemoteActionCompatParcelizer((List) arrayList, new parseMvhd() { // from class: o.VirtualBeanPropertyWriter
            @Override // kotlin.parseMvhd
            public final Object apply(Object obj) {
                return initExtraTracks.read(Integer.valueOf(((PlaceholderForType) obj).AudioAttributesCompatParcelizer));
            }
        }));
        return j;
    }

    @Override // kotlin.StdJdkSerializersAtomicIntegerSerializer
    public final void IconCompatParcelizer(long j, boolean z) {
        for (PlaceholderForType<addTypedSerializer> placeholderForType : this.onFastForward) {
            placeholderForType.IconCompatParcelizer(j, z);
        }
    }

    @Override // kotlin.StdJdkSerializersAtomicIntegerSerializer, kotlin.UUIDSerializer
    public final void RemoteActionCompatParcelizer(long j) {
        this.AudioAttributesImplApi26Parcelizer.RemoteActionCompatParcelizer(j);
    }

    @Override // kotlin.StdJdkSerializersAtomicIntegerSerializer, kotlin.UUIDSerializer
    public final boolean RemoteActionCompatParcelizer(_put _putVar) {
        return this.AudioAttributesImplApi26Parcelizer.RemoteActionCompatParcelizer(_putVar);
    }

    @Override // kotlin.StdJdkSerializersAtomicIntegerSerializer, kotlin.UUIDSerializer
    public final boolean IconCompatParcelizer() {
        return this.AudioAttributesImplApi26Parcelizer.IconCompatParcelizer();
    }

    @Override // kotlin.StdJdkSerializersAtomicIntegerSerializer, kotlin.UUIDSerializer
    public final long AudioAttributesCompatParcelizer() {
        return this.AudioAttributesImplApi26Parcelizer.AudioAttributesCompatParcelizer();
    }

    @Override // kotlin.StdJdkSerializersAtomicIntegerSerializer, kotlin.UUIDSerializer
    public final long read() {
        return this.AudioAttributesImplApi26Parcelizer.read();
    }

    @Override // kotlin.StdJdkSerializersAtomicIntegerSerializer
    public final long write(long j) {
        for (PlaceholderForType<addTypedSerializer> placeholderForType : this.onFastForward) {
            placeholderForType.read(j);
        }
        for (BeanAsArraySerializer beanAsArraySerializer : this.MediaBrowserCompatSearchResultReceiver) {
            beanAsArraySerializer.read(j);
        }
        return j;
    }

    @Override // kotlin.StdJdkSerializersAtomicIntegerSerializer
    public final long read(long j, createKeySerializer createkeyserializer) {
        for (PlaceholderForType<addTypedSerializer> placeholderForType : this.onFastForward) {
            if (placeholderForType.AudioAttributesCompatParcelizer == 2) {
                return placeholderForType.read(j, createkeyserializer);
            }
        }
        return j;
    }

    private void AudioAttributesImplApi26Parcelizer() {
        this.AudioAttributesImplBaseParcelizer.RemoteActionCompatParcelizer(this);
    }

    private int[] RemoteActionCompatParcelizer(_verifyAndResolvePlaceholders[] _verifyandresolveplaceholdersArr) {
        int[] iArr = new int[_verifyandresolveplaceholdersArr.length];
        for (int i = 0; i < _verifyandresolveplaceholdersArr.length; i++) {
            _verifyAndResolvePlaceholders _verifyandresolveplaceholders = _verifyandresolveplaceholdersArr[i];
            if (_verifyandresolveplaceholders != null) {
                iArr[i] = this.onPrepareFromMediaId.RemoteActionCompatParcelizer(_verifyandresolveplaceholders.AudioAttributesImplBaseParcelizer());
            } else {
                iArr[i] = -1;
            }
        }
        return iArr;
    }

    private void IconCompatParcelizer(_verifyAndResolvePlaceholders[] _verifyandresolveplaceholdersArr, boolean[] zArr, visitStringFormat[] visitstringformatArr) {
        for (int i = 0; i < _verifyandresolveplaceholdersArr.length; i++) {
            if (_verifyandresolveplaceholdersArr[i] == null || !zArr[i]) {
                visitStringFormat visitstringformat = visitstringformatArr[i];
                if (visitstringformat instanceof PlaceholderForType) {
                    ((PlaceholderForType) visitstringformat).IconCompatParcelizer(this);
                } else if (visitstringformat instanceof PlaceholderForType.AudioAttributesCompatParcelizer) {
                    ((PlaceholderForType.AudioAttributesCompatParcelizer) visitstringformat).read();
                }
                visitstringformatArr[i] = null;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void write(kotlin._verifyAndResolvePlaceholders[] r5, kotlin.visitStringFormat[] r6, int[] r7) {
        /*
            r4 = this;
            r0 = 0
        L1:
            int r1 = r5.length
            if (r0 >= r1) goto L3c
            r1 = r6[r0]
            boolean r2 = r1 instanceof kotlin.StdArraySerializersIntArraySerializer
            if (r2 != 0) goto Le
            boolean r1 = r1 instanceof o.PlaceholderForType.AudioAttributesCompatParcelizer
            if (r1 == 0) goto L39
        Le:
            int r1 = r4.write(r0, r7)
            r2 = -1
            if (r1 != r2) goto L1c
            r1 = r6[r0]
            boolean r1 = r1 instanceof kotlin.StdArraySerializersIntArraySerializer
            if (r1 != 0) goto L39
            goto L2b
        L1c:
            r2 = r6[r0]
            boolean r3 = r2 instanceof o.PlaceholderForType.AudioAttributesCompatParcelizer
            if (r3 == 0) goto L2b
            o.PlaceholderForType$AudioAttributesCompatParcelizer r2 = (o.PlaceholderForType.AudioAttributesCompatParcelizer) r2
            o.PlaceholderForType<T extends o.MapLikeType> r2 = r2.IconCompatParcelizer
            r1 = r6[r1]
            if (r2 != r1) goto L2b
            goto L39
        L2b:
            r1 = r6[r0]
            boolean r2 = r1 instanceof o.PlaceholderForType.AudioAttributesCompatParcelizer
            if (r2 == 0) goto L36
            o.PlaceholderForType$AudioAttributesCompatParcelizer r1 = (o.PlaceholderForType.AudioAttributesCompatParcelizer) r1
            r1.read()
        L36:
            r1 = 0
            r6[r0] = r1
        L39:
            int r0 = r0 + 1
            goto L1
        L3c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin._suppressableValue.write(o._verifyAndResolvePlaceholders[], o.visitStringFormat[], int[]):void");
    }

    private void RemoteActionCompatParcelizer(_verifyAndResolvePlaceholders[] _verifyandresolveplaceholdersArr, visitStringFormat[] visitstringformatArr, boolean[] zArr, long j, int[] iArr) {
        for (int i = 0; i < _verifyandresolveplaceholdersArr.length; i++) {
            _verifyAndResolvePlaceholders _verifyandresolveplaceholders = _verifyandresolveplaceholdersArr[i];
            if (_verifyandresolveplaceholders != null) {
                visitStringFormat visitstringformat = visitstringformatArr[i];
                if (visitstringformat == null) {
                    zArr[i] = true;
                    read readVar = this.onPlayFromMediaId[iArr[i]];
                    if (readVar.MediaBrowserCompatCustomActionResultReceiver == 0) {
                        visitstringformatArr[i] = IconCompatParcelizer(readVar, _verifyandresolveplaceholders, j);
                    } else if (readVar.MediaBrowserCompatCustomActionResultReceiver == 2) {
                        visitstringformatArr[i] = new BeanAsArraySerializer(this.MediaMetadataCompat.get(readVar.read), _verifyandresolveplaceholders.AudioAttributesImplBaseParcelizer().AudioAttributesCompatParcelizer(0), this.onCustomAction.RemoteActionCompatParcelizer);
                    }
                } else if (visitstringformat instanceof PlaceholderForType) {
                    ((addTypedSerializer) ((PlaceholderForType) visitstringformat).write()).RemoteActionCompatParcelizer(_verifyandresolveplaceholders);
                }
            }
        }
        for (int i2 = 0; i2 < _verifyandresolveplaceholdersArr.length; i2++) {
            if (visitstringformatArr[i2] == null && _verifyandresolveplaceholdersArr[i2] != null) {
                read readVar2 = this.onPlayFromMediaId[iArr[i2]];
                if (readVar2.MediaBrowserCompatCustomActionResultReceiver == 1) {
                    int iWrite = write(i2, iArr);
                    if (iWrite == -1) {
                        visitstringformatArr[i2] = new StdArraySerializersIntArraySerializer();
                    } else {
                        visitstringformatArr[i2] = ((PlaceholderForType) visitstringformatArr[iWrite]).AudioAttributesCompatParcelizer(j, readVar2.MediaBrowserCompatItemReceiver);
                    }
                }
            }
        }
    }

    private int write(int i, int[] iArr) {
        int i2 = iArr[i];
        if (i2 == -1) {
            return -1;
        }
        int i3 = this.onPlayFromMediaId[i2].AudioAttributesImplApi21Parcelizer;
        for (int i4 = 0; i4 < iArr.length; i4++) {
            int i5 = iArr[i4];
            if (i5 == i3 && this.onPlayFromMediaId[i5].MediaBrowserCompatCustomActionResultReceiver == 0) {
                return i4;
            }
        }
        return -1;
    }

    private static Pair<_writeAsBinary, read[]> read(matchesUntyped matchesuntyped, addTypedSerializer.write writeVar, List<FilteredBeanPropertyWriterSingleView> list, List<serializeTypedContents> list2) {
        int[][] iArrWrite = write(list);
        int length = iArrWrite.length;
        boolean[] zArr = new boolean[length];
        C0170format[][] c0170formatArr = new C0170format[length][];
        int iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(length, list, iArrWrite, zArr, c0170formatArr) + length + list2.size();
        setName[] setnameArr = new setName[iRemoteActionCompatParcelizer];
        read[] readVarArr = new read[iRemoteActionCompatParcelizer];
        write(list2, setnameArr, readVarArr, read(matchesuntyped, writeVar, list, iArrWrite, length, zArr, c0170formatArr, setnameArr, readVarArr));
        return Pair.create(new _writeAsBinary(setnameArr), readVarArr);
    }

    private static int[][] write(List<FilteredBeanPropertyWriterSingleView> list) {
        IndexedListSerializer indexedListSerializerIconCompatParcelizer;
        Integer num;
        int size = list.size();
        HashMap map = parseSaiz.read(size);
        ArrayList arrayList = new ArrayList(size);
        SparseArray sparseArray = new SparseArray(size);
        for (int i = 0; i < size; i++) {
            map.put(Long.valueOf(list.get(i).read), Integer.valueOf(i));
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(Integer.valueOf(i));
            arrayList.add(arrayList2);
            sparseArray.put(i, arrayList2);
        }
        for (int i2 = 0; i2 < size; i2++) {
            FilteredBeanPropertyWriterSingleView filteredBeanPropertyWriterSingleView = list.get(i2);
            IndexedListSerializer indexedListSerializer = read(filteredBeanPropertyWriterSingleView.write);
            if (indexedListSerializer == null) {
                indexedListSerializer = read(filteredBeanPropertyWriterSingleView.AudioAttributesCompatParcelizer);
            }
            int iIntValue = (indexedListSerializer == null || (num = (Integer) map.get(Long.valueOf(Long.parseLong(indexedListSerializer.RemoteActionCompatParcelizer)))) == null) ? i2 : num.intValue();
            if (iIntValue == i2 && (indexedListSerializerIconCompatParcelizer = IconCompatParcelizer(filteredBeanPropertyWriterSingleView.AudioAttributesCompatParcelizer)) != null) {
                for (String str : LaissezFaireSubTypeValidator.AudioAttributesCompatParcelizer(indexedListSerializerIconCompatParcelizer.RemoteActionCompatParcelizer, ",")) {
                    Integer num2 = (Integer) map.get(Long.valueOf(Long.parseLong(str)));
                    if (num2 != null) {
                        iIntValue = Math.min(iIntValue, num2.intValue());
                    }
                }
            }
            if (iIntValue != i2) {
                List list2 = (List) sparseArray.get(i2);
                List list3 = (List) sparseArray.get(iIntValue);
                list3.addAll(list2);
                sparseArray.put(i2, list3);
                arrayList.remove(list2);
            }
        }
        int size2 = arrayList.size();
        int[][] iArr = new int[size2][];
        for (int i3 = 0; i3 < size2; i3++) {
            int[] iArrWrite = parseTextAttribute.write((Collection<? extends Number>) arrayList.get(i3));
            iArr[i3] = iArrWrite;
            Arrays.sort(iArrWrite);
        }
        return iArr;
    }

    private static int RemoteActionCompatParcelizer(int i, List<FilteredBeanPropertyWriterSingleView> list, int[][] iArr, boolean[] zArr, C0170format[][] c0170formatArr) {
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            if (write(list, iArr[i3])) {
                zArr[i3] = true;
                i2++;
            }
            C0170format[] c0170formatArrIconCompatParcelizer = IconCompatParcelizer(list, iArr[i3]);
            c0170formatArr[i3] = c0170formatArrIconCompatParcelizer;
            if (c0170formatArrIconCompatParcelizer.length != 0) {
                i2++;
            }
        }
        return i2;
    }

    private static int read(matchesUntyped matchesuntyped, addTypedSerializer.write writeVar, List<FilteredBeanPropertyWriterSingleView> list, int[][] iArr, int i, boolean[] zArr, C0170format[][] c0170formatArr, setName[] setnameArr, read[] readVarArr) {
        String strConcat;
        int i2;
        int i3;
        int i4 = 0;
        int i5 = 0;
        while (i4 < i) {
            int[] iArr2 = iArr[i4];
            ArrayList arrayList = new ArrayList();
            for (int i6 : iArr2) {
                arrayList.addAll(list.get(i6).IconCompatParcelizer);
            }
            int size = arrayList.size();
            C0170format[] c0170formatArr2 = new C0170format[size];
            for (int i7 = 0; i7 < size; i7++) {
                C0170format c0170format = ((IndexedStringListSerializer) arrayList.get(i7)).write;
                c0170formatArr2[i7] = c0170format.write().RemoteActionCompatParcelizer(matchesuntyped.AudioAttributesCompatParcelizer(c0170format)).IconCompatParcelizer();
            }
            FilteredBeanPropertyWriterSingleView filteredBeanPropertyWriterSingleView = list.get(iArr2[0]);
            if (filteredBeanPropertyWriterSingleView.read != -1) {
                strConcat = Long.toString(filteredBeanPropertyWriterSingleView.read);
            } else {
                strConcat = "unset:".concat(String.valueOf(i4));
            }
            int i8 = i5 + 1;
            if (zArr[i4]) {
                i2 = i8;
                i8 = i5 + 2;
            } else {
                i2 = -1;
            }
            if (c0170formatArr[i4].length != 0) {
                i3 = i8 + 1;
            } else {
                i3 = i8;
                i8 = -1;
            }
            read(writeVar, c0170formatArr2);
            setnameArr[i5] = new setName(strConcat, c0170formatArr2);
            readVarArr[i5] = read.RemoteActionCompatParcelizer(filteredBeanPropertyWriterSingleView.AudioAttributesImplApi21Parcelizer, iArr2, i5, i2, i8);
            if (i2 != -1) {
                StringBuilder sb = new StringBuilder();
                sb.append(strConcat);
                sb.append(":emsg");
                String string = sb.toString();
                setnameArr[i2] = new setName(string, new C0170format.RemoteActionCompatParcelizer().AudioAttributesCompatParcelizer(string).AudioAttributesImplApi26Parcelizer(MimeTypes.APPLICATION_EMSG).IconCompatParcelizer());
                readVarArr[i2] = read.IconCompatParcelizer(iArr2, i5);
            }
            if (i8 != -1) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(strConcat);
                sb2.append(":cc");
                String string2 = sb2.toString();
                readVarArr[i8] = read.IconCompatParcelizer(iArr2, i5, initExtraTracks.write(c0170formatArr[i4]));
                read(writeVar, c0170formatArr[i4]);
                setnameArr[i8] = new setName(string2, c0170formatArr[i4]);
            }
            i4++;
            i5 = i3;
        }
        return i5;
    }

    private static void write(List<serializeTypedContents> list, setName[] setnameArr, read[] readVarArr, int i) {
        int i2 = 0;
        while (i2 < list.size()) {
            serializeTypedContents serializetypedcontents = list.get(i2);
            C0170format c0170formatIconCompatParcelizer = new C0170format.RemoteActionCompatParcelizer().AudioAttributesCompatParcelizer(serializetypedcontents.AudioAttributesCompatParcelizer()).AudioAttributesImplApi26Parcelizer(MimeTypes.APPLICATION_EMSG).IconCompatParcelizer();
            StringBuilder sb = new StringBuilder();
            sb.append(serializetypedcontents.AudioAttributesCompatParcelizer());
            sb.append(":");
            sb.append(i2);
            setnameArr[i] = new setName(sb.toString(), c0170formatIconCompatParcelizer);
            readVarArr[i] = read.read(i2);
            i2++;
            i++;
        }
    }

    private PlaceholderForType<addTypedSerializer> IconCompatParcelizer(read readVar, _verifyAndResolvePlaceholders _verifyandresolveplaceholders, long j) {
        setName setnameRemoteActionCompatParcelizer;
        int i;
        initExtraTracks<C0170format> initextratracksAudioAttributesImplApi26Parcelizer;
        int i2;
        boolean z = readVar.AudioAttributesCompatParcelizer != -1;
        AttributePropertyWriter.write writeVarIconCompatParcelizer = null;
        if (z) {
            setnameRemoteActionCompatParcelizer = this.onPrepareFromMediaId.RemoteActionCompatParcelizer(readVar.AudioAttributesCompatParcelizer);
            i = 1;
        } else {
            setnameRemoteActionCompatParcelizer = null;
            i = 0;
        }
        if (readVar.write != -1) {
            initextratracksAudioAttributesImplApi26Parcelizer = this.onPlayFromMediaId[readVar.write].RemoteActionCompatParcelizer;
        } else {
            initextratracksAudioAttributesImplApi26Parcelizer = initExtraTracks.AudioAttributesImplApi26Parcelizer();
        }
        int size = i + initextratracksAudioAttributesImplApi26Parcelizer.size();
        C0170format[] c0170formatArr = new C0170format[size];
        int[] iArr = new int[size];
        if (z) {
            c0170formatArr[0] = setnameRemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(0);
            iArr[0] = 5;
            i2 = 1;
        } else {
            i2 = 0;
        }
        ArrayList arrayList = new ArrayList();
        for (int i3 = 0; i3 < initextratracksAudioAttributesImplApi26Parcelizer.size(); i3++) {
            C0170format c0170format = initextratracksAudioAttributesImplApi26Parcelizer.get(i3);
            c0170formatArr[i2] = c0170format;
            iArr[i2] = 3;
            arrayList.add(c0170format);
            i2++;
        }
        if (this.onCustomAction.RemoteActionCompatParcelizer && z) {
            writeVarIconCompatParcelizer = this.onPause.IconCompatParcelizer();
        }
        AttributePropertyWriter.write writeVar = writeVarIconCompatParcelizer;
        PlaceholderForType<addTypedSerializer> placeholderForType = new PlaceholderForType<>(readVar.MediaBrowserCompatItemReceiver, iArr, c0170formatArr, this.MediaBrowserCompatItemReceiver.AudioAttributesCompatParcelizer(this.onCommand, this.onCustomAction, this.AudioAttributesCompatParcelizer, this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, readVar.IconCompatParcelizer, _verifyandresolveplaceholders, readVar.MediaBrowserCompatItemReceiver, this.MediaBrowserCompatMediaItem, z, arrayList, writeVar, this.onPrepare, this.onPlay, this.AudioAttributesImplApi21Parcelizer), this, this.IconCompatParcelizer, j, this.MediaDescriptionCompat, this.RatingCompat, this.onAddQueueItem, this.handleMediaPlayPauseIfPendingOnHandler);
        synchronized (this) {
            this.onMediaButtonEvent.put(placeholderForType, writeVar);
        }
        return placeholderForType;
    }

    private static IndexedListSerializer IconCompatParcelizer(List<IndexedListSerializer> list) {
        return RemoteActionCompatParcelizer(list, "urn:mpeg:dash:adaptation-set-switching:2016");
    }

    private static IndexedListSerializer read(List<IndexedListSerializer> list) {
        return RemoteActionCompatParcelizer(list, "http://dashif.org/guidelines/trickmode");
    }

    private static IndexedListSerializer RemoteActionCompatParcelizer(List<IndexedListSerializer> list, String str) {
        for (int i = 0; i < list.size(); i++) {
            IndexedListSerializer indexedListSerializer = list.get(i);
            if (str.equals(indexedListSerializer.write)) {
                return indexedListSerializer;
            }
        }
        return null;
    }

    private static boolean write(List<FilteredBeanPropertyWriterSingleView> list, int[] iArr) {
        for (int i : iArr) {
            List<IndexedStringListSerializer> list2 = list.get(i).IconCompatParcelizer;
            for (int i2 = 0; i2 < list2.size(); i2++) {
                if (!list2.get(i2).AudioAttributesCompatParcelizer.isEmpty()) {
                    return true;
                }
            }
        }
        return false;
    }

    private static C0170format[] IconCompatParcelizer(List<FilteredBeanPropertyWriterSingleView> list, int[] iArr) {
        for (int i : iArr) {
            FilteredBeanPropertyWriterSingleView filteredBeanPropertyWriterSingleView = list.get(i);
            List<IndexedListSerializer> list2 = list.get(i).RemoteActionCompatParcelizer;
            for (int i2 = 0; i2 < list2.size(); i2++) {
                IndexedListSerializer indexedListSerializer = list2.get(i2);
                if ("urn:scte:dash:cc:cea-608:2015".equals(indexedListSerializer.write)) {
                    C0170format.RemoteActionCompatParcelizer remoteActionCompatParcelizerAudioAttributesImplApi26Parcelizer = new C0170format.RemoteActionCompatParcelizer().AudioAttributesImplApi26Parcelizer(MimeTypes.APPLICATION_CEA608);
                    StringBuilder sb = new StringBuilder();
                    sb.append(filteredBeanPropertyWriterSingleView.read);
                    sb.append(":cea608");
                    return RemoteActionCompatParcelizer(indexedListSerializer, read, remoteActionCompatParcelizerAudioAttributesImplApi26Parcelizer.AudioAttributesCompatParcelizer(sb.toString()).IconCompatParcelizer());
                }
                if ("urn:scte:dash:cc:cea-708:2015".equals(indexedListSerializer.write)) {
                    C0170format.RemoteActionCompatParcelizer remoteActionCompatParcelizerAudioAttributesImplApi26Parcelizer2 = new C0170format.RemoteActionCompatParcelizer().AudioAttributesImplApi26Parcelizer(MimeTypes.APPLICATION_CEA708);
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(filteredBeanPropertyWriterSingleView.read);
                    sb2.append(":cea708");
                    return RemoteActionCompatParcelizer(indexedListSerializer, write, remoteActionCompatParcelizerAudioAttributesImplApi26Parcelizer2.AudioAttributesCompatParcelizer(sb2.toString()).IconCompatParcelizer());
                }
            }
        }
        return new C0170format[0];
    }

    private static C0170format[] RemoteActionCompatParcelizer(IndexedListSerializer indexedListSerializer, Pattern pattern, C0170format c0170format) {
        String str = indexedListSerializer.RemoteActionCompatParcelizer;
        if (str == null) {
            return new C0170format[]{c0170format};
        }
        String[] strArrAudioAttributesCompatParcelizer = LaissezFaireSubTypeValidator.AudioAttributesCompatParcelizer(str, ";");
        C0170format[] c0170formatArr = new C0170format[strArrAudioAttributesCompatParcelizer.length];
        for (int i = 0; i < strArrAudioAttributesCompatParcelizer.length; i++) {
            Matcher matcher = pattern.matcher(strArrAudioAttributesCompatParcelizer[i]);
            if (!matcher.matches()) {
                return new C0170format[]{c0170format};
            }
            int i2 = Integer.parseInt(matcher.group(1));
            C0170format.RemoteActionCompatParcelizer remoteActionCompatParcelizerWrite = c0170format.write();
            StringBuilder sb = new StringBuilder();
            sb.append(c0170format.handleMediaPlayPauseIfPendingOnHandler);
            sb.append(":");
            sb.append(i2);
            c0170formatArr[i] = remoteActionCompatParcelizerWrite.AudioAttributesCompatParcelizer(sb.toString()).AudioAttributesCompatParcelizer(i2).read(matcher.group(2)).IconCompatParcelizer();
        }
        return c0170formatArr;
    }

    private static void read(addTypedSerializer.write writeVar, C0170format[] c0170formatArr) {
        for (int i = 0; i < c0170formatArr.length; i++) {
            c0170formatArr[i] = writeVar.read(c0170formatArr[i]);
        }
    }

    private static PlaceholderForType<addTypedSerializer>[] write(int i) {
        return new PlaceholderForType[i];
    }

    static final class read {
        public final int AudioAttributesCompatParcelizer;
        public final int AudioAttributesImplApi21Parcelizer;
        public final int[] IconCompatParcelizer;
        public final int MediaBrowserCompatCustomActionResultReceiver;
        public final int MediaBrowserCompatItemReceiver;
        public final initExtraTracks<C0170format> RemoteActionCompatParcelizer;
        public final int read;
        public final int write;

        public static read RemoteActionCompatParcelizer(int i, int[] iArr, int i2, int i3, int i4) {
            return new read(i, 0, iArr, i2, i3, i4, -1, initExtraTracks.AudioAttributesImplApi26Parcelizer());
        }

        public static read IconCompatParcelizer(int[] iArr, int i) {
            return new read(5, 1, iArr, i, -1, -1, -1, initExtraTracks.AudioAttributesImplApi26Parcelizer());
        }

        public static read IconCompatParcelizer(int[] iArr, int i, initExtraTracks<C0170format> initextratracks) {
            return new read(3, 1, iArr, i, -1, -1, -1, initextratracks);
        }

        public static read read(int i) {
            return new read(5, 2, new int[0], -1, -1, -1, i, initExtraTracks.AudioAttributesImplApi26Parcelizer());
        }

        private read(int i, int i2, int[] iArr, int i3, int i4, int i5, int i6, initExtraTracks<C0170format> initextratracks) {
            this.MediaBrowserCompatItemReceiver = i;
            this.IconCompatParcelizer = iArr;
            this.MediaBrowserCompatCustomActionResultReceiver = i2;
            this.AudioAttributesImplApi21Parcelizer = i3;
            this.AudioAttributesCompatParcelizer = i4;
            this.write = i5;
            this.read = i6;
            this.RemoteActionCompatParcelizer = initextratracks;
        }
    }
}
