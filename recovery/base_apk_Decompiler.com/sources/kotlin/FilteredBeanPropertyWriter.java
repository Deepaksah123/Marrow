package kotlin;

import android.os.SystemClock;
import android.util.Pair;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.upstream.CmcdHeadersFactory;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kotlin.AttributePropertyWriter;
import kotlin.CollectionType;
import kotlin._deserializeWithNativeTypeId;
import kotlin._fromVariable;
import kotlin._hasTypeResolver;
import kotlin._resolveSuperClass;
import kotlin.addTypedSerializer;
import kotlin.withTimeZone;

/* JADX INFO: loaded from: classes4.dex */
public final class FilteredBeanPropertyWriter implements addTypedSerializer {
    private final _fromClass AudioAttributesCompatParcelizer;
    private FilteredBeanPropertyWriterMultiView AudioAttributesImplApi21Parcelizer;
    private final long AudioAttributesImplApi26Parcelizer;
    private long AudioAttributesImplBaseParcelizer = C.TIME_UNSET;
    private final int[] IconCompatParcelizer;
    private final classForName MediaBrowserCompatCustomActionResultReceiver;
    private IOException MediaBrowserCompatItemReceiver;
    private final int MediaBrowserCompatMediaItem;
    private int MediaBrowserCompatSearchResultReceiver;
    private final int MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    private _verifyAndResolvePlaceholders MediaDescriptionCompat;
    private boolean MediaMetadataCompat;
    private final AttributePropertyWriter.write RatingCompat;
    private final _hasTypeResolver RemoteActionCompatParcelizer;
    private final typedValueSerializer read;
    protected final IconCompatParcelizer[] write;

    public static final class read implements addTypedSerializer.write {
        private final CollectionType.AudioAttributesCompatParcelizer AudioAttributesCompatParcelizer;
        private final _hasTypeResolver.write read;
        private final int write;

        public read(_hasTypeResolver.write writeVar) {
            this(writeVar, (byte) 0);
        }

        private read(_hasTypeResolver.write writeVar, byte b) {
            this(IdentityEqualityType.write, writeVar, 1);
        }

        private read(CollectionType.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer, _hasTypeResolver.write writeVar, int i) {
            this.AudioAttributesCompatParcelizer = audioAttributesCompatParcelizer;
            this.read = writeVar;
            this.write = 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // o.addTypedSerializer.write
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public read IconCompatParcelizer(withTimeZone.IconCompatParcelizer iconCompatParcelizer) {
            this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(iconCompatParcelizer);
            return this;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // o.addTypedSerializer.write
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public read IconCompatParcelizer(boolean z) {
            this.AudioAttributesCompatParcelizer.write(z);
            return this;
        }

        @Override // o.addTypedSerializer.write
        public final addTypedSerializer AudioAttributesCompatParcelizer(classForName classforname, FilteredBeanPropertyWriterMultiView filteredBeanPropertyWriterMultiView, typedValueSerializer typedvalueserializer, int i, int[] iArr, _verifyAndResolvePlaceholders _verifyandresolveplaceholders, int i2, long j, boolean z, List<C0170format> list, AttributePropertyWriter.write writeVar, TypeNameIdResolver typeNameIdResolver, modifyArraySerializer modifyarrayserializer, _fromClass _fromclass) {
            _hasTypeResolver _hastyperesolverWrite = this.read.write();
            if (typeNameIdResolver != null) {
                _hastyperesolverWrite.read(typeNameIdResolver);
            }
            return new FilteredBeanPropertyWriter(this.AudioAttributesCompatParcelizer, classforname, filteredBeanPropertyWriterMultiView, typedvalueserializer, i, iArr, _verifyandresolveplaceholders, i2, _hastyperesolverWrite, j, this.write, z, list, writeVar, _fromclass);
        }

        @Override // o.addTypedSerializer.write
        public final C0170format read(C0170format c0170format) {
            return this.AudioAttributesCompatParcelizer.IconCompatParcelizer(c0170format);
        }
    }

    public FilteredBeanPropertyWriter(CollectionType.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer, classForName classforname, FilteredBeanPropertyWriterMultiView filteredBeanPropertyWriterMultiView, typedValueSerializer typedvalueserializer, int i, int[] iArr, _verifyAndResolvePlaceholders _verifyandresolveplaceholders, int i2, _hasTypeResolver _hastyperesolver, long j, int i3, boolean z, List<C0170format> list, AttributePropertyWriter.write writeVar, _fromClass _fromclass) {
        this.MediaBrowserCompatCustomActionResultReceiver = classforname;
        this.AudioAttributesImplApi21Parcelizer = filteredBeanPropertyWriterMultiView;
        this.read = typedvalueserializer;
        this.IconCompatParcelizer = iArr;
        this.MediaDescriptionCompat = _verifyandresolveplaceholders;
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = i2;
        this.RemoteActionCompatParcelizer = _hastyperesolver;
        this.MediaBrowserCompatSearchResultReceiver = i;
        this.AudioAttributesImplApi26Parcelizer = j;
        this.MediaBrowserCompatMediaItem = i3;
        this.RatingCompat = writeVar;
        this.AudioAttributesCompatParcelizer = _fromclass;
        long j2 = filteredBeanPropertyWriterMultiView.read(i);
        ArrayList<IndexedStringListSerializer> arrayListIconCompatParcelizer = IconCompatParcelizer();
        this.write = new IconCompatParcelizer[_verifyandresolveplaceholders.MediaBrowserCompatCustomActionResultReceiver()];
        int i4 = 0;
        while (i4 < this.write.length) {
            IndexedStringListSerializer indexedStringListSerializer = arrayListIconCompatParcelizer.get(_verifyandresolveplaceholders.IconCompatParcelizer(i4));
            constructViewBased constructviewbasedWrite = typedvalueserializer.write(indexedStringListSerializer.IconCompatParcelizer);
            IconCompatParcelizer[] iconCompatParcelizerArr = this.write;
            if (constructviewbasedWrite == null) {
                constructviewbasedWrite = indexedStringListSerializer.IconCompatParcelizer.get(0);
            }
            int i5 = i4;
            iconCompatParcelizerArr[i5] = new IconCompatParcelizer(j2, indexedStringListSerializer, constructviewbasedWrite, audioAttributesCompatParcelizer.RemoteActionCompatParcelizer(i2, indexedStringListSerializer.write, z, list, writeVar), 0L, indexedStringListSerializer.RemoteActionCompatParcelizer());
            i4 = i5 + 1;
        }
    }

    @Override // kotlin.MapLikeType
    public final long IconCompatParcelizer(long j, createKeySerializer createkeyserializer) {
        for (IconCompatParcelizer iconCompatParcelizer : this.write) {
            if (iconCompatParcelizer.IconCompatParcelizer != null) {
                long j2 = iconCompatParcelizer.read();
                if (j2 != 0) {
                    long jRemoteActionCompatParcelizer = iconCompatParcelizer.RemoteActionCompatParcelizer(j);
                    long jIconCompatParcelizer = iconCompatParcelizer.IconCompatParcelizer(jRemoteActionCompatParcelizer);
                    return createkeyserializer.write(j, jIconCompatParcelizer, (jIconCompatParcelizer >= j || (j2 != -1 && jRemoteActionCompatParcelizer >= (iconCompatParcelizer.write() + j2) - 1)) ? jIconCompatParcelizer : iconCompatParcelizer.IconCompatParcelizer(jRemoteActionCompatParcelizer + 1));
                }
            }
        }
        return j;
    }

    @Override // kotlin.addTypedSerializer
    public final void RemoteActionCompatParcelizer(FilteredBeanPropertyWriterMultiView filteredBeanPropertyWriterMultiView, int i) {
        try {
            this.AudioAttributesImplApi21Parcelizer = filteredBeanPropertyWriterMultiView;
            this.MediaBrowserCompatSearchResultReceiver = i;
            long j = filteredBeanPropertyWriterMultiView.read(i);
            ArrayList<IndexedStringListSerializer> arrayListIconCompatParcelizer = IconCompatParcelizer();
            for (int i2 = 0; i2 < this.write.length; i2++) {
                IndexedStringListSerializer indexedStringListSerializer = arrayListIconCompatParcelizer.get(this.MediaDescriptionCompat.IconCompatParcelizer(i2));
                IconCompatParcelizer[] iconCompatParcelizerArr = this.write;
                iconCompatParcelizerArr[i2] = iconCompatParcelizerArr[i2].write(j, indexedStringListSerializer);
            }
        } catch (NumberSerializersBase e) {
            this.MediaBrowserCompatItemReceiver = e;
        }
    }

    @Override // kotlin.addTypedSerializer
    public final void RemoteActionCompatParcelizer(_verifyAndResolvePlaceholders _verifyandresolveplaceholders) {
        this.MediaDescriptionCompat = _verifyandresolveplaceholders;
    }

    @Override // kotlin.MapLikeType
    public final void AudioAttributesCompatParcelizer() throws IOException {
        IOException iOException = this.MediaBrowserCompatItemReceiver;
        if (iOException != null) {
            throw iOException;
        }
        this.MediaBrowserCompatCustomActionResultReceiver.read();
    }

    @Override // kotlin.MapLikeType
    public final int read(long j, List<? extends getSelfReferencedType> list) {
        if (this.MediaBrowserCompatItemReceiver != null || this.MediaDescriptionCompat.MediaBrowserCompatCustomActionResultReceiver() < 2) {
            return list.size();
        }
        return this.MediaDescriptionCompat.AudioAttributesCompatParcelizer(j, list);
    }

    @Override // kotlin.MapLikeType
    public final boolean AudioAttributesCompatParcelizer(long j, CollectionLikeType collectionLikeType, List<? extends getSelfReferencedType> list) {
        if (this.MediaBrowserCompatItemReceiver != null) {
            return false;
        }
        return this.MediaDescriptionCompat.AudioAttributesCompatParcelizer(j, collectionLikeType, list);
    }

    @Override // kotlin.MapLikeType
    public final void IconCompatParcelizer(_put _putVar, long j, List<? extends getSelfReferencedType> list, withKeyType withkeytype) {
        int i;
        ResolvedRecursiveType[] resolvedRecursiveTypeArr;
        int i2;
        long j2;
        long j3;
        if (this.MediaBrowserCompatItemReceiver == null) {
            long j4 = _putVar.write;
            long j5 = j - j4;
            long jIconCompatParcelizer = LaissezFaireSubTypeValidator.IconCompatParcelizer(this.AudioAttributesImplApi21Parcelizer.AudioAttributesCompatParcelizer);
            long jIconCompatParcelizer2 = LaissezFaireSubTypeValidator.IconCompatParcelizer(this.AudioAttributesImplApi21Parcelizer.AudioAttributesCompatParcelizer(this.MediaBrowserCompatSearchResultReceiver).IconCompatParcelizer);
            AttributePropertyWriter.write writeVar = this.RatingCompat;
            if (writeVar == null || !writeVar.RemoteActionCompatParcelizer(jIconCompatParcelizer + jIconCompatParcelizer2 + j)) {
                long jIconCompatParcelizer3 = LaissezFaireSubTypeValidator.IconCompatParcelizer(LaissezFaireSubTypeValidator.RemoteActionCompatParcelizer(this.AudioAttributesImplApi26Parcelizer));
                long jAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(jIconCompatParcelizer3);
                getSelfReferencedType getselfreferencedtype = list.isEmpty() ? null : list.get(list.size() - 1);
                int iMediaBrowserCompatCustomActionResultReceiver = this.MediaDescriptionCompat.MediaBrowserCompatCustomActionResultReceiver();
                ResolvedRecursiveType[] resolvedRecursiveTypeArr2 = new ResolvedRecursiveType[iMediaBrowserCompatCustomActionResultReceiver];
                int i3 = 0;
                while (i3 < iMediaBrowserCompatCustomActionResultReceiver) {
                    IconCompatParcelizer iconCompatParcelizer = this.write[i3];
                    if (iconCompatParcelizer.IconCompatParcelizer == null) {
                        resolvedRecursiveTypeArr2[i3] = ResolvedRecursiveType.AudioAttributesCompatParcelizer;
                        i2 = i3;
                        i = iMediaBrowserCompatCustomActionResultReceiver;
                        resolvedRecursiveTypeArr = resolvedRecursiveTypeArr2;
                        j2 = j5;
                        j3 = jIconCompatParcelizer3;
                    } else {
                        long j6 = iconCompatParcelizer.read(jIconCompatParcelizer3);
                        long jWrite = iconCompatParcelizer.write(jIconCompatParcelizer3);
                        i = iMediaBrowserCompatCustomActionResultReceiver;
                        resolvedRecursiveTypeArr = resolvedRecursiveTypeArr2;
                        i2 = i3;
                        j2 = j5;
                        j3 = jIconCompatParcelizer3;
                        long jWrite2 = write(iconCompatParcelizer, getselfreferencedtype, j, j6, jWrite);
                        if (jWrite2 < j6) {
                            resolvedRecursiveTypeArr[i2] = ResolvedRecursiveType.AudioAttributesCompatParcelizer;
                        } else {
                            resolvedRecursiveTypeArr[i2] = new AudioAttributesCompatParcelizer(read(i2), jWrite2, jWrite, jAudioAttributesCompatParcelizer);
                        }
                    }
                    i3 = i2 + 1;
                    jIconCompatParcelizer3 = j3;
                    iMediaBrowserCompatCustomActionResultReceiver = i;
                    resolvedRecursiveTypeArr2 = resolvedRecursiveTypeArr;
                    j5 = j2;
                }
                long j7 = j5;
                long j8 = jIconCompatParcelizer3;
                this.MediaDescriptionCompat.RemoteActionCompatParcelizer(j4, j7, RemoteActionCompatParcelizer(j8, j4), list, resolvedRecursiveTypeArr2);
                int i4 = this.MediaDescriptionCompat.read();
                _fromClass _fromclass = this.AudioAttributesCompatParcelizer;
                _fromVariable.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = _fromclass == null ? null : new _fromVariable.AudioAttributesCompatParcelizer(_fromclass, this.MediaDescriptionCompat, Math.max(0L, j7), _putVar.RemoteActionCompatParcelizer, "d", this.AudioAttributesImplApi21Parcelizer.RemoteActionCompatParcelizer, _putVar.write(this.AudioAttributesImplBaseParcelizer), list.isEmpty());
                this.AudioAttributesImplBaseParcelizer = SystemClock.elapsedRealtime();
                IconCompatParcelizer iconCompatParcelizer2 = read(i4);
                if (iconCompatParcelizer2.RemoteActionCompatParcelizer != null) {
                    IndexedStringListSerializer indexedStringListSerializer = iconCompatParcelizer2.read;
                    _withResolved _withresolvedMediaBrowserCompatCustomActionResultReceiver = iconCompatParcelizer2.RemoteActionCompatParcelizer.write() == null ? indexedStringListSerializer.MediaBrowserCompatCustomActionResultReceiver() : null;
                    _withResolved _withresolved = iconCompatParcelizer2.IconCompatParcelizer == null ? indexedStringListSerializer.read() : null;
                    if (_withresolvedMediaBrowserCompatCustomActionResultReceiver != null || _withresolved != null) {
                        withkeytype.write = AudioAttributesCompatParcelizer(iconCompatParcelizer2, this.RemoteActionCompatParcelizer, this.MediaDescriptionCompat.MediaBrowserCompatItemReceiver(), this.MediaDescriptionCompat.write(), this.MediaDescriptionCompat.AudioAttributesCompatParcelizer(), _withresolvedMediaBrowserCompatCustomActionResultReceiver, _withresolved, audioAttributesCompatParcelizer);
                        return;
                    }
                }
                long j9 = iconCompatParcelizer2.write;
                boolean z = this.AudioAttributesImplApi21Parcelizer.RemoteActionCompatParcelizer && this.MediaBrowserCompatSearchResultReceiver == this.AudioAttributesImplApi21Parcelizer.read() - 1;
                long j10 = C.TIME_UNSET;
                boolean z2 = (z && j9 == C.TIME_UNSET) ? false : true;
                if (iconCompatParcelizer2.read() == 0) {
                    withkeytype.read = z2;
                    return;
                }
                long j11 = iconCompatParcelizer2.read(j8);
                long jWrite3 = iconCompatParcelizer2.write(j8);
                if (z) {
                    long jAudioAttributesCompatParcelizer2 = iconCompatParcelizer2.AudioAttributesCompatParcelizer(jWrite3);
                    z2 &= jAudioAttributesCompatParcelizer2 + (jAudioAttributesCompatParcelizer2 - iconCompatParcelizer2.IconCompatParcelizer(jWrite3)) >= j9;
                }
                boolean z3 = z2;
                long jWrite4 = write(iconCompatParcelizer2, getselfreferencedtype, j, j11, jWrite3);
                if (jWrite4 < j11) {
                    this.MediaBrowserCompatItemReceiver = new NumberSerializersBase();
                    return;
                }
                if (jWrite4 > jWrite3 || (this.MediaMetadataCompat && jWrite4 >= jWrite3)) {
                    withkeytype.read = z3;
                    return;
                }
                if (z3 && iconCompatParcelizer2.IconCompatParcelizer(jWrite4) >= j9) {
                    withkeytype.read = true;
                    return;
                }
                int iMin = (int) Math.min(this.MediaBrowserCompatMediaItem, (jWrite3 - jWrite4) + 1);
                if (j9 != C.TIME_UNSET) {
                    while (iMin > 1 && iconCompatParcelizer2.IconCompatParcelizer((((long) iMin) + jWrite4) - 1) >= j9) {
                        iMin--;
                    }
                }
                int i5 = iMin;
                if (list.isEmpty()) {
                    j10 = j;
                }
                withkeytype.write = IconCompatParcelizer(iconCompatParcelizer2, this.RemoteActionCompatParcelizer, this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, this.MediaDescriptionCompat.MediaBrowserCompatItemReceiver(), this.MediaDescriptionCompat.write(), this.MediaDescriptionCompat.AudioAttributesCompatParcelizer(), jWrite4, i5, j10, jAudioAttributesCompatParcelizer, audioAttributesCompatParcelizer);
            }
        }
    }

    @Override // kotlin.MapLikeType
    public final void read(CollectionLikeType collectionLikeType) {
        _failGetClassMethods _failgetclassmethodsIconCompatParcelizer;
        if (collectionLikeType instanceof actualType) {
            int iRemoteActionCompatParcelizer = this.MediaDescriptionCompat.RemoteActionCompatParcelizer(((actualType) collectionLikeType).MediaDescriptionCompat);
            IconCompatParcelizer iconCompatParcelizer = this.write[iRemoteActionCompatParcelizer];
            if (iconCompatParcelizer.IconCompatParcelizer == null && (_failgetclassmethodsIconCompatParcelizer = ((CollectionType) buildTypeSerializer.AudioAttributesCompatParcelizer(iconCompatParcelizer.RemoteActionCompatParcelizer)).IconCompatParcelizer()) != null) {
                this.write[iRemoteActionCompatParcelizer] = iconCompatParcelizer.read(new FailingSerializer(_failgetclassmethodsIconCompatParcelizer, iconCompatParcelizer.read.read));
            }
        }
        AttributePropertyWriter.write writeVar = this.RatingCompat;
        if (writeVar != null) {
            writeVar.RemoteActionCompatParcelizer(collectionLikeType);
        }
    }

    @Override // kotlin.MapLikeType
    public final boolean AudioAttributesCompatParcelizer(CollectionLikeType collectionLikeType, boolean z, _resolveSuperClass.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer, _resolveSuperClass _resolvesuperclass) {
        _resolveSuperClass.RemoteActionCompatParcelizer remoteActionCompatParcelizer;
        if (!z) {
            return false;
        }
        AttributePropertyWriter.write writeVar = this.RatingCompat;
        if (writeVar != null && writeVar.write(collectionLikeType)) {
            return true;
        }
        if (!this.AudioAttributesImplApi21Parcelizer.RemoteActionCompatParcelizer && (collectionLikeType instanceof getSelfReferencedType) && (audioAttributesCompatParcelizer.IconCompatParcelizer instanceof _deserializeWithNativeTypeId.write) && ((_deserializeWithNativeTypeId.write) audioAttributesCompatParcelizer.IconCompatParcelizer).AudioAttributesImplApi26Parcelizer == 404) {
            IconCompatParcelizer iconCompatParcelizer = this.write[this.MediaDescriptionCompat.RemoteActionCompatParcelizer(collectionLikeType.MediaDescriptionCompat)];
            long j = iconCompatParcelizer.read();
            if (j != -1 && j != 0) {
                if (((getSelfReferencedType) collectionLikeType).C_() > (iconCompatParcelizer.write() + j) - 1) {
                    this.MediaMetadataCompat = true;
                    return true;
                }
            }
        }
        IconCompatParcelizer iconCompatParcelizer2 = this.write[this.MediaDescriptionCompat.RemoteActionCompatParcelizer(collectionLikeType.MediaDescriptionCompat)];
        constructViewBased constructviewbasedWrite = this.read.write(iconCompatParcelizer2.read.IconCompatParcelizer);
        if (constructviewbasedWrite != null && !iconCompatParcelizer2.AudioAttributesCompatParcelizer.equals(constructviewbasedWrite)) {
            return true;
        }
        _resolveSuperClass.read readVarIconCompatParcelizer = IconCompatParcelizer(this.MediaDescriptionCompat, iconCompatParcelizer2.read.IconCompatParcelizer);
        if ((readVarIconCompatParcelizer.write(2) || readVarIconCompatParcelizer.write(1)) && (remoteActionCompatParcelizer = _resolvesuperclass.read(readVarIconCompatParcelizer, audioAttributesCompatParcelizer)) != null && readVarIconCompatParcelizer.write(remoteActionCompatParcelizer.RemoteActionCompatParcelizer)) {
            if (remoteActionCompatParcelizer.RemoteActionCompatParcelizer == 2) {
                _verifyAndResolvePlaceholders _verifyandresolveplaceholders = this.MediaDescriptionCompat;
                return _verifyandresolveplaceholders.RemoteActionCompatParcelizer(_verifyandresolveplaceholders.RemoteActionCompatParcelizer(collectionLikeType.MediaDescriptionCompat), remoteActionCompatParcelizer.AudioAttributesCompatParcelizer);
            }
            if (remoteActionCompatParcelizer.RemoteActionCompatParcelizer == 1) {
                this.read.IconCompatParcelizer(iconCompatParcelizer2.AudioAttributesCompatParcelizer, remoteActionCompatParcelizer.AudioAttributesCompatParcelizer);
                return true;
            }
        }
        return false;
    }

    @Override // kotlin.MapLikeType
    public final void read() {
        for (IconCompatParcelizer iconCompatParcelizer : this.write) {
            CollectionType collectionType = iconCompatParcelizer.RemoteActionCompatParcelizer;
            if (collectionType != null) {
                collectionType.AudioAttributesCompatParcelizer();
            }
        }
    }

    private _resolveSuperClass.read IconCompatParcelizer(_verifyAndResolvePlaceholders _verifyandresolveplaceholders, List<constructViewBased> list) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        int iMediaBrowserCompatCustomActionResultReceiver = _verifyandresolveplaceholders.MediaBrowserCompatCustomActionResultReceiver();
        int i = 0;
        for (int i2 = 0; i2 < iMediaBrowserCompatCustomActionResultReceiver; i2++) {
            if (_verifyandresolveplaceholders.write(i2, jElapsedRealtime)) {
                i++;
            }
        }
        int i3 = typedValueSerializer.read(list);
        return new _resolveSuperClass.read(i3, i3 - this.read.RemoteActionCompatParcelizer(list), iMediaBrowserCompatCustomActionResultReceiver, i);
    }

    private static long write(IconCompatParcelizer iconCompatParcelizer, getSelfReferencedType getselfreferencedtype, long j, long j2, long j3) {
        if (getselfreferencedtype != null) {
            return getselfreferencedtype.C_();
        }
        return LaissezFaireSubTypeValidator.read(iconCompatParcelizer.RemoteActionCompatParcelizer(j), j2, j3);
    }

    private ArrayList<IndexedStringListSerializer> IconCompatParcelizer() {
        List<FilteredBeanPropertyWriterSingleView> list = this.AudioAttributesImplApi21Parcelizer.AudioAttributesCompatParcelizer(this.MediaBrowserCompatSearchResultReceiver).RemoteActionCompatParcelizer;
        ArrayList<IndexedStringListSerializer> arrayList = new ArrayList<>();
        for (int i : this.IconCompatParcelizer) {
            arrayList.addAll(list.get(i).IconCompatParcelizer);
        }
        return arrayList;
    }

    private long RemoteActionCompatParcelizer(long j, long j2) {
        if (!this.AudioAttributesImplApi21Parcelizer.RemoteActionCompatParcelizer || this.write[0].read() == 0) {
            return C.TIME_UNSET;
        }
        return Math.max(0L, Math.min(AudioAttributesCompatParcelizer(j), this.write[0].AudioAttributesCompatParcelizer(this.write[0].write(j))) - j2);
    }

    private long AudioAttributesCompatParcelizer(long j) {
        return this.AudioAttributesImplApi21Parcelizer.AudioAttributesCompatParcelizer == C.TIME_UNSET ? C.TIME_UNSET : j - LaissezFaireSubTypeValidator.IconCompatParcelizer(this.AudioAttributesImplApi21Parcelizer.AudioAttributesCompatParcelizer + this.AudioAttributesImplApi21Parcelizer.AudioAttributesCompatParcelizer(this.MediaBrowserCompatSearchResultReceiver).IconCompatParcelizer);
    }

    private static CollectionLikeType AudioAttributesCompatParcelizer(IconCompatParcelizer iconCompatParcelizer, _hasTypeResolver _hastyperesolver, C0170format c0170format, int i, Object obj, _withResolved _withresolved, _withResolved _withresolved2, _fromVariable.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
        IndexedStringListSerializer indexedStringListSerializer = iconCompatParcelizer.read;
        if (_withresolved != null) {
            _withResolved _withresolvedIconCompatParcelizer = _withresolved.IconCompatParcelizer(_withresolved2, iconCompatParcelizer.AudioAttributesCompatParcelizer.IconCompatParcelizer);
            if (_withresolvedIconCompatParcelizer != null) {
                _withresolved = _withresolvedIconCompatParcelizer;
            }
        } else {
            _withresolved = (_withResolved) buildTypeSerializer.IconCompatParcelizer(_withresolved2);
        }
        SubTypeValidator subTypeValidatorWrite = serializeAsArray.write(indexedStringListSerializer, iconCompatParcelizer.AudioAttributesCompatParcelizer.IconCompatParcelizer, _withresolved, 0, onMoovContainerAtomRead.AudioAttributesCompatParcelizer());
        if (audioAttributesCompatParcelizer != null) {
            subTypeValidatorWrite = audioAttributesCompatParcelizer.RemoteActionCompatParcelizer(CmcdHeadersFactory.OBJECT_TYPE_INIT_SEGMENT).IconCompatParcelizer().read(subTypeValidatorWrite);
        }
        return new actualType(_hastyperesolver, subTypeValidatorWrite, c0170format, i, obj, iconCompatParcelizer.RemoteActionCompatParcelizer);
    }

    private CollectionLikeType IconCompatParcelizer(IconCompatParcelizer iconCompatParcelizer, _hasTypeResolver _hastyperesolver, int i, C0170format c0170format, int i2, Object obj, long j, int i3, long j2, long j3, _fromVariable.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
        SubTypeValidator subTypeValidator;
        IndexedStringListSerializer indexedStringListSerializer = iconCompatParcelizer.read;
        long jIconCompatParcelizer = iconCompatParcelizer.IconCompatParcelizer(j);
        _withResolved _withresolvedAudioAttributesImplBaseParcelizer = iconCompatParcelizer.AudioAttributesImplBaseParcelizer(j);
        if (iconCompatParcelizer.RemoteActionCompatParcelizer == null) {
            long jAudioAttributesCompatParcelizer = iconCompatParcelizer.AudioAttributesCompatParcelizer(j);
            SubTypeValidator subTypeValidatorWrite = serializeAsArray.write(indexedStringListSerializer, iconCompatParcelizer.AudioAttributesCompatParcelizer.IconCompatParcelizer, _withresolvedAudioAttributesImplBaseParcelizer, iconCompatParcelizer.AudioAttributesCompatParcelizer(j, j3) ? 0 : 8, onMoovContainerAtomRead.AudioAttributesCompatParcelizer());
            if (audioAttributesCompatParcelizer != null) {
                audioAttributesCompatParcelizer.read(jAudioAttributesCompatParcelizer - jIconCompatParcelizer).RemoteActionCompatParcelizer(_fromVariable.AudioAttributesCompatParcelizer.read(this.MediaDescriptionCompat));
                Pair<String, String> pairIconCompatParcelizer = IconCompatParcelizer(j, _withresolvedAudioAttributesImplBaseParcelizer, iconCompatParcelizer);
                if (pairIconCompatParcelizer != null) {
                    audioAttributesCompatParcelizer.read((String) pairIconCompatParcelizer.first).write((String) pairIconCompatParcelizer.second);
                }
                subTypeValidatorWrite = audioAttributesCompatParcelizer.IconCompatParcelizer().read(subTypeValidatorWrite);
            }
            return new _unsupported(_hastyperesolver, subTypeValidatorWrite, c0170format, i2, obj, jIconCompatParcelizer, jAudioAttributesCompatParcelizer, j, i, c0170format);
        }
        int i4 = 1;
        int i5 = 1;
        while (i4 < i3) {
            _withResolved _withresolvedIconCompatParcelizer = _withresolvedAudioAttributesImplBaseParcelizer.IconCompatParcelizer(iconCompatParcelizer.AudioAttributesImplBaseParcelizer(((long) i4) + j), iconCompatParcelizer.AudioAttributesCompatParcelizer.IconCompatParcelizer);
            if (_withresolvedIconCompatParcelizer == null) {
                break;
            }
            i5++;
            i4++;
            _withresolvedAudioAttributesImplBaseParcelizer = _withresolvedIconCompatParcelizer;
        }
        long j4 = (((long) i5) + j) - 1;
        long jAudioAttributesCompatParcelizer2 = iconCompatParcelizer.AudioAttributesCompatParcelizer(j4);
        long j5 = iconCompatParcelizer.write;
        long j6 = C.TIME_UNSET;
        if (j5 != C.TIME_UNSET && j5 <= jAudioAttributesCompatParcelizer2) {
            j6 = j5;
        }
        SubTypeValidator subTypeValidatorWrite2 = serializeAsArray.write(indexedStringListSerializer, iconCompatParcelizer.AudioAttributesCompatParcelizer.IconCompatParcelizer, _withresolvedAudioAttributesImplBaseParcelizer, iconCompatParcelizer.AudioAttributesCompatParcelizer(j4, j3) ? 0 : 8, onMoovContainerAtomRead.AudioAttributesCompatParcelizer());
        if (audioAttributesCompatParcelizer != null) {
            audioAttributesCompatParcelizer.read(jAudioAttributesCompatParcelizer2 - jIconCompatParcelizer).RemoteActionCompatParcelizer(_fromVariable.AudioAttributesCompatParcelizer.read(this.MediaDescriptionCompat));
            Pair<String, String> pairIconCompatParcelizer2 = IconCompatParcelizer(j, _withresolvedAudioAttributesImplBaseParcelizer, iconCompatParcelizer);
            if (pairIconCompatParcelizer2 != null) {
                audioAttributesCompatParcelizer.read((String) pairIconCompatParcelizer2.first).write((String) pairIconCompatParcelizer2.second);
            }
            subTypeValidator = audioAttributesCompatParcelizer.IconCompatParcelizer().read(subTypeValidatorWrite2);
        } else {
            subTypeValidator = subTypeValidatorWrite2;
        }
        long j7 = -indexedStringListSerializer.read;
        if (DefaultBaseTypeLimitingValidator.AudioAttributesImplBaseParcelizer(c0170format.onPlayFromUri)) {
            j7 += jIconCompatParcelizer;
        }
        return new withKeyValueHandler(_hastyperesolver, subTypeValidator, c0170format, i2, obj, jIconCompatParcelizer, jAudioAttributesCompatParcelizer2, j2, j6, j, i5, j7, iconCompatParcelizer.RemoteActionCompatParcelizer);
    }

    private static Pair<String, String> IconCompatParcelizer(long j, _withResolved _withresolved, IconCompatParcelizer iconCompatParcelizer) {
        long j2 = j + 1;
        if (j2 >= iconCompatParcelizer.read()) {
            return null;
        }
        _withResolved _withresolvedAudioAttributesImplBaseParcelizer = iconCompatParcelizer.AudioAttributesImplBaseParcelizer(j2);
        String strWrite = _idFrom.write(_withresolved.AudioAttributesCompatParcelizer(iconCompatParcelizer.AudioAttributesCompatParcelizer.IconCompatParcelizer), _withresolvedAudioAttributesImplBaseParcelizer.AudioAttributesCompatParcelizer(iconCompatParcelizer.AudioAttributesCompatParcelizer.IconCompatParcelizer));
        StringBuilder sb = new StringBuilder();
        sb.append(_withresolvedAudioAttributesImplBaseParcelizer.RemoteActionCompatParcelizer);
        sb.append("-");
        String string = sb.toString();
        if (_withresolvedAudioAttributesImplBaseParcelizer.AudioAttributesCompatParcelizer != -1) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(string);
            sb2.append(_withresolvedAudioAttributesImplBaseParcelizer.RemoteActionCompatParcelizer + _withresolvedAudioAttributesImplBaseParcelizer.AudioAttributesCompatParcelizer);
            string = sb2.toString();
        }
        return new Pair<>(strWrite, string);
    }

    private IconCompatParcelizer read(int i) {
        IconCompatParcelizer iconCompatParcelizer = this.write[i];
        constructViewBased constructviewbasedWrite = this.read.write(iconCompatParcelizer.read.IconCompatParcelizer);
        if (constructviewbasedWrite == null || constructviewbasedWrite.equals(iconCompatParcelizer.AudioAttributesCompatParcelizer)) {
            return iconCompatParcelizer;
        }
        IconCompatParcelizer iconCompatParcelizerAudioAttributesCompatParcelizer = iconCompatParcelizer.AudioAttributesCompatParcelizer(constructviewbasedWrite);
        this.write[i] = iconCompatParcelizerAudioAttributesCompatParcelizer;
        return iconCompatParcelizerAudioAttributesCompatParcelizer;
    }

    protected static final class AudioAttributesCompatParcelizer extends buildCanonicalName {
        private final IconCompatParcelizer read;
        private final long write;

        public AudioAttributesCompatParcelizer(IconCompatParcelizer iconCompatParcelizer, long j, long j2, long j3) {
            super(j, j2);
            this.read = iconCompatParcelizer;
            this.write = j3;
        }

        @Override // kotlin.ResolvedRecursiveType
        public final long RemoteActionCompatParcelizer() {
            write();
            return this.read.IconCompatParcelizer(IconCompatParcelizer());
        }

        @Override // kotlin.ResolvedRecursiveType
        public final long AudioAttributesCompatParcelizer() {
            write();
            return this.read.AudioAttributesCompatParcelizer(IconCompatParcelizer());
        }
    }

    protected static final class IconCompatParcelizer {
        public final constructViewBased AudioAttributesCompatParcelizer;
        private final long AudioAttributesImplApi21Parcelizer;
        public final Serializers IconCompatParcelizer;
        final CollectionType RemoteActionCompatParcelizer;
        public final IndexedStringListSerializer read;
        private final long write;

        IconCompatParcelizer(long j, IndexedStringListSerializer indexedStringListSerializer, constructViewBased constructviewbased, CollectionType collectionType, long j2, Serializers serializers) {
            this.write = j;
            this.read = indexedStringListSerializer;
            this.AudioAttributesCompatParcelizer = constructviewbased;
            this.AudioAttributesImplApi21Parcelizer = j2;
            this.RemoteActionCompatParcelizer = collectionType;
            this.IconCompatParcelizer = serializers;
        }

        final IconCompatParcelizer write(long j, IndexedStringListSerializer indexedStringListSerializer) throws NumberSerializersBase {
            long j2;
            long jRemoteActionCompatParcelizer;
            long jRemoteActionCompatParcelizer2;
            Serializers serializersRemoteActionCompatParcelizer = this.read.RemoteActionCompatParcelizer();
            Serializers serializersRemoteActionCompatParcelizer2 = indexedStringListSerializer.RemoteActionCompatParcelizer();
            if (serializersRemoteActionCompatParcelizer == null) {
                return new IconCompatParcelizer(j, indexedStringListSerializer, this.AudioAttributesCompatParcelizer, this.RemoteActionCompatParcelizer, this.AudioAttributesImplApi21Parcelizer, serializersRemoteActionCompatParcelizer);
            }
            if (!serializersRemoteActionCompatParcelizer.IconCompatParcelizer()) {
                return new IconCompatParcelizer(j, indexedStringListSerializer, this.AudioAttributesCompatParcelizer, this.RemoteActionCompatParcelizer, this.AudioAttributesImplApi21Parcelizer, serializersRemoteActionCompatParcelizer2);
            }
            long jAudioAttributesCompatParcelizer = serializersRemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(j);
            if (jAudioAttributesCompatParcelizer == 0) {
                return new IconCompatParcelizer(j, indexedStringListSerializer, this.AudioAttributesCompatParcelizer, this.RemoteActionCompatParcelizer, this.AudioAttributesImplApi21Parcelizer, serializersRemoteActionCompatParcelizer2);
            }
            buildTypeSerializer.AudioAttributesCompatParcelizer(serializersRemoteActionCompatParcelizer2);
            long jAudioAttributesCompatParcelizer2 = serializersRemoteActionCompatParcelizer.AudioAttributesCompatParcelizer();
            long jWrite = serializersRemoteActionCompatParcelizer.write(jAudioAttributesCompatParcelizer2);
            long j3 = jAudioAttributesCompatParcelizer + jAudioAttributesCompatParcelizer2;
            long j4 = j3 - 1;
            long jWrite2 = serializersRemoteActionCompatParcelizer.write(j4);
            long jIconCompatParcelizer = serializersRemoteActionCompatParcelizer.IconCompatParcelizer(j4, j);
            long jAudioAttributesCompatParcelizer3 = serializersRemoteActionCompatParcelizer2.AudioAttributesCompatParcelizer();
            long jWrite3 = serializersRemoteActionCompatParcelizer2.write(jAudioAttributesCompatParcelizer3);
            long j5 = this.AudioAttributesImplApi21Parcelizer;
            long j6 = jWrite2 + jIconCompatParcelizer;
            if (j6 == jWrite3) {
                jRemoteActionCompatParcelizer = j3 - jAudioAttributesCompatParcelizer3;
                j2 = j5;
            } else {
                if (j6 < jWrite3) {
                    throw new NumberSerializersBase();
                }
                if (jWrite3 < jWrite) {
                    jRemoteActionCompatParcelizer2 = j5 - (serializersRemoteActionCompatParcelizer2.RemoteActionCompatParcelizer(jWrite, j) - jAudioAttributesCompatParcelizer2);
                    return new IconCompatParcelizer(j, indexedStringListSerializer, this.AudioAttributesCompatParcelizer, this.RemoteActionCompatParcelizer, jRemoteActionCompatParcelizer2, serializersRemoteActionCompatParcelizer2);
                }
                j2 = j5;
                jRemoteActionCompatParcelizer = serializersRemoteActionCompatParcelizer.RemoteActionCompatParcelizer(jWrite3, j) - jAudioAttributesCompatParcelizer3;
            }
            jRemoteActionCompatParcelizer2 = j2 + jRemoteActionCompatParcelizer;
            return new IconCompatParcelizer(j, indexedStringListSerializer, this.AudioAttributesCompatParcelizer, this.RemoteActionCompatParcelizer, jRemoteActionCompatParcelizer2, serializersRemoteActionCompatParcelizer2);
        }

        final IconCompatParcelizer read(Serializers serializers) {
            return new IconCompatParcelizer(this.write, this.read, this.AudioAttributesCompatParcelizer, this.RemoteActionCompatParcelizer, this.AudioAttributesImplApi21Parcelizer, serializers);
        }

        final IconCompatParcelizer AudioAttributesCompatParcelizer(constructViewBased constructviewbased) {
            return new IconCompatParcelizer(this.write, this.read, constructviewbased, this.RemoteActionCompatParcelizer, this.AudioAttributesImplApi21Parcelizer, this.IconCompatParcelizer);
        }

        public final long write() {
            return ((Serializers) buildTypeSerializer.AudioAttributesCompatParcelizer(this.IconCompatParcelizer)).AudioAttributesCompatParcelizer() + this.AudioAttributesImplApi21Parcelizer;
        }

        public final long read(long j) {
            return ((Serializers) buildTypeSerializer.AudioAttributesCompatParcelizer(this.IconCompatParcelizer)).read(this.write, j) + this.AudioAttributesImplApi21Parcelizer;
        }

        public final long read() {
            return ((Serializers) buildTypeSerializer.AudioAttributesCompatParcelizer(this.IconCompatParcelizer)).AudioAttributesCompatParcelizer(this.write);
        }

        public final long IconCompatParcelizer(long j) {
            return ((Serializers) buildTypeSerializer.AudioAttributesCompatParcelizer(this.IconCompatParcelizer)).write(j - this.AudioAttributesImplApi21Parcelizer);
        }

        public final long AudioAttributesCompatParcelizer(long j) {
            return IconCompatParcelizer(j) + ((Serializers) buildTypeSerializer.AudioAttributesCompatParcelizer(this.IconCompatParcelizer)).IconCompatParcelizer(j - this.AudioAttributesImplApi21Parcelizer, this.write);
        }

        public final long RemoteActionCompatParcelizer(long j) {
            return ((Serializers) buildTypeSerializer.AudioAttributesCompatParcelizer(this.IconCompatParcelizer)).RemoteActionCompatParcelizer(j, this.write) + this.AudioAttributesImplApi21Parcelizer;
        }

        public final _withResolved AudioAttributesImplBaseParcelizer(long j) {
            return ((Serializers) buildTypeSerializer.AudioAttributesCompatParcelizer(this.IconCompatParcelizer)).IconCompatParcelizer(j - this.AudioAttributesImplApi21Parcelizer);
        }

        public final long write(long j) {
            return (read(j) + ((Serializers) buildTypeSerializer.AudioAttributesCompatParcelizer(this.IconCompatParcelizer)).write(this.write, j)) - 1;
        }

        public final boolean AudioAttributesCompatParcelizer(long j, long j2) {
            return ((Serializers) buildTypeSerializer.AudioAttributesCompatParcelizer(this.IconCompatParcelizer)).IconCompatParcelizer() || j2 == C.TIME_UNSET || AudioAttributesCompatParcelizer(j) <= j2;
        }
    }
}
