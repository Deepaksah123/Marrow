package kotlin;

import android.os.Trace;
import kotlin.MagicModuleUseCaseImplWhenMappings;
import kotlin.Metadata;
import kotlin._handleOddName;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006:\u0001\"BQ\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\u001c\b\u0002\u0010\u000e\u001a\u0016\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b\u0012\u0016\b\u0002\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\r\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0019\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001a\u0010\u0018J\u0017\u0010\u001c\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0000¢\u0006\u0004\b\u001f\u0010 J\u001b\u0010\"\u001a\u00020!2\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u001bH\u0000¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\rH\u0000¢\u0006\u0004\b$\u0010\u0018J\u001f\u0010\u001f\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\fH\u0000¢\u0006\u0004\b\u001f\u0010%R\u0017\u0010\u001f\u001a\u00020\t8\u0007¢\u0006\f\n\u0004\b\"\u0010&\u001a\u0004\b'\u0010(R(\u0010\"\u001a\u0016\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\"\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\r\u0018\u00010\u000f8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b$\u0010+R\u0016\u0010\u001c\u001a\u00020\t8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010&R\u0016\u0010\u0016\u001a\u00020\t8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010&R\u0018\u0010)\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010-R\u001a\u0010'\u001a\u00020\t8\u0017X\u0097D¢\u0006\f\n\u0004\b.\u0010&\u001a\u0004\b/\u0010(R\u0014\u0010$\u001a\u00020,8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b.\u00100R\u001c\u0010/\u001a\u00020\u00078\u0017@VX\u0097\f¢\u0006\f\n\u0004\b\u0014\u00101\u001a\u0004\b)\u00102R\u0013\u0010.\u001a\u0004\u0018\u0001038G¢\u0006\u0006\u001a\u0004\b\u001c\u00104"}, d2 = {"Lo/_handleSpillOverflow;", "Lo/getLongMask;", "Lo/_writeCloseable;", "Lo/_findSymbol2;", "Lo/_prefetchRootDeserializer;", "Lo/JsonSerializer;", "Lo/_handleOddName$IconCompatParcelizer;", "Lo/hashSeed;", "p0", "", "p1", "Lkotlin/Function2;", "Lo/CharsToNameCanonicalizer;", "", "p2", "Lkotlin/Function1;", "p3", "<init>", "(IZLo/MagicModuleSubmissionRequestBody;Lo/getAnswerMap;Lo/MagicModuleRepositoryImplExternalSyntheticLambda0;)V", "Lo/_checkNeedForRehash;", "IconCompatParcelizer", "(I)Z", "AudioAttributesCompatParcelizer", "MediaMetadataCompat", "()V", "p_", "MediaDescriptionCompat", "Lo/isAbstract;", "write", "(Lo/isAbstract;)V", "Lo/makeChild;", "read", "()Lo/makeChild;", "Lo/WritableTypeIdInclusion;", "RemoteActionCompatParcelizer", "(Lo/isAbstract;)Lo/WritableTypeIdInclusion;", "AudioAttributesImplApi21Parcelizer", "(Lo/CharsToNameCanonicalizer;Lo/CharsToNameCanonicalizer;)V", "Z", "MediaBrowserCompatCustomActionResultReceiver", "()Z", "AudioAttributesImplApi26Parcelizer", "Lo/MagicModuleSubmissionRequestBody;", "Lo/getAnswerMap;", "Lo/_addSymbol;", "Lo/_addSymbol;", "MediaBrowserCompatItemReceiver", "AudioAttributesImplBaseParcelizer", "()Lo/_addSymbol;", "I", "()I", "Lo/containedTypeCount;", "()Lo/containedTypeCount;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class _handleSpillOverflow extends _handleOddName.IconCompatParcelizer implements getLongMask, _writeCloseable, _findSymbol2, _prefetchRootDeserializer, JsonSerializer {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private _addSymbol AudioAttributesImplApi26Parcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private final getAnswerMap<_handleSpillOverflow, getShowPopup> IconCompatParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private final MagicModuleSubmissionRequestBody<CharsToNameCanonicalizer, CharsToNameCanonicalizer, getShowPopup> RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private int AudioAttributesImplBaseParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private final boolean MediaBrowserCompatCustomActionResultReceiver;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final boolean read;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private boolean write;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private boolean AudioAttributesCompatParcelizer;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] AudioAttributesCompatParcelizer;
        public static final /* synthetic */ int[] write;

        static {
            int[] iArr = new int[_writeFieldName.values().length];
            try {
                iArr[_writeFieldName.AudioAttributesCompatParcelizer.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[_writeFieldName.RemoteActionCompatParcelizer.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[_writeFieldName.IconCompatParcelizer.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[_writeFieldName.read.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            AudioAttributesCompatParcelizer = iArr;
            int[] iArr2 = new int[_addSymbol.values().length];
            try {
                iArr2[_addSymbol.RemoteActionCompatParcelizer.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[_addSymbol.read.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[_addSymbol.write.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[_addSymbol.AudioAttributesCompatParcelizer.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            write = iArr2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private _handleSpillOverflow(int i, boolean z, MagicModuleSubmissionRequestBody<? super CharsToNameCanonicalizer, ? super CharsToNameCanonicalizer, getShowPopup> magicModuleSubmissionRequestBody, getAnswerMap<? super _handleSpillOverflow, getShowPopup> getanswermap) {
        this.read = z;
        this.RemoteActionCompatParcelizer = magicModuleSubmissionRequestBody;
        this.IconCompatParcelizer = getanswermap;
        this.AudioAttributesImplBaseParcelizer = i;
    }

    public /* synthetic */ _handleSpillOverflow(int i, boolean z, MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody, getAnswerMap getanswermap, int i2, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i2 & 1) != 0 ? hashSeed.INSTANCE.read() : i, (i2 & 2) != 0 ? false : z, (i2 & 4) != 0 ? null : magicModuleSubmissionRequestBody, (i2 & 8) != 0 ? null : getanswermap, null);
    }

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from getter */
    public final boolean getRead() {
        return this.read;
    }

    @Override // o._handleOddName.IconCompatParcelizer
    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from getter */
    public final boolean getRead() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    @Override // kotlin._findSymbol2
    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: merged with bridge method [inline-methods] */
    public final _addSymbol AudioAttributesCompatParcelizer() {
        nukeSymbols onPlayFromSearch;
        _handleSpillOverflow _handlespilloverflow;
        ObjectReader objectReader;
        if (getRatingCompat() && (_handlespilloverflow = (onPlayFromSearch = collectLongDefaults.MediaBrowserCompatCustomActionResultReceiver(this).getOnPlayFromSearch()).read()) != null) {
            if (this == _handlespilloverflow) {
                return onPlayFromSearch.MediaBrowserCompatMediaItem() ? _addSymbol.read : _addSymbol.RemoteActionCompatParcelizer;
            }
            if (_handlespilloverflow.getRatingCompat()) {
                _handleSpillOverflow _handlespilloverflow2 = _handlespilloverflow;
                int iWrite = _bind.write(1024);
                if (!_handlespilloverflow2.getRead().getRatingCompat()) {
                    reportWrongTokenException.read("visitAncestors called on an unattached node");
                }
                _handleOddName.IconCompatParcelizer mediaBrowserCompatItemReceiver = _handlespilloverflow2.getRead().getMediaBrowserCompatItemReceiver();
                _assertNotNull _assertnotnullAudioAttributesImplApi26Parcelizer = collectLongDefaults.AudioAttributesImplApi26Parcelizer(_handlespilloverflow2);
                while (_assertnotnullAudioAttributesImplApi26Parcelizer != null) {
                    if ((_assertnotnullAudioAttributesImplApi26Parcelizer.get_init_lambda2().getAudioAttributesImplApi21Parcelizer().getRemoteActionCompatParcelizer() & iWrite) != 0) {
                        while (mediaBrowserCompatItemReceiver != null) {
                            if ((mediaBrowserCompatItemReceiver.getWrite() & iWrite) != 0) {
                                _handleOddName.IconCompatParcelizer iconCompatParcelizerWrite = mediaBrowserCompatItemReceiver;
                                UTF32Reader uTF32Reader = null;
                                while (iconCompatParcelizerWrite != null) {
                                    if (iconCompatParcelizerWrite instanceof _handleSpillOverflow) {
                                        if (this == ((_handleSpillOverflow) iconCompatParcelizerWrite)) {
                                            return _addSymbol.write;
                                        }
                                    } else if ((iconCompatParcelizerWrite.getWrite() & iWrite) != 0 && (iconCompatParcelizerWrite instanceof addAbstractTypeResolver)) {
                                        int i = 0;
                                        for (_handleOddName.IconCompatParcelizer iconCompatParcelizer = ((addAbstractTypeResolver) iconCompatParcelizerWrite).getIconCompatParcelizer(); iconCompatParcelizer != null; iconCompatParcelizer = iconCompatParcelizer.getAudioAttributesImplBaseParcelizer()) {
                                            if ((iconCompatParcelizer.getWrite() & iWrite) != 0) {
                                                i++;
                                                if (i == 1) {
                                                    iconCompatParcelizerWrite = iconCompatParcelizer;
                                                } else {
                                                    if (uTF32Reader == null) {
                                                        uTF32Reader = new UTF32Reader(new _handleOddName.IconCompatParcelizer[16], 0);
                                                    }
                                                    if (iconCompatParcelizerWrite != null) {
                                                        if (uTF32Reader != null) {
                                                            uTF32Reader.read(iconCompatParcelizerWrite);
                                                        }
                                                        iconCompatParcelizerWrite = null;
                                                    }
                                                    if (uTF32Reader != null) {
                                                        uTF32Reader.read(iconCompatParcelizer);
                                                    }
                                                }
                                            }
                                        }
                                        if (i != 1) {
                                        }
                                    }
                                    iconCompatParcelizerWrite = collectLongDefaults.write((UTF32Reader<_handleOddName.IconCompatParcelizer>) uTF32Reader);
                                }
                            }
                            mediaBrowserCompatItemReceiver = mediaBrowserCompatItemReceiver.getMediaBrowserCompatItemReceiver();
                        }
                    }
                    _assertnotnullAudioAttributesImplApi26Parcelizer = _assertnotnullAudioAttributesImplApi26Parcelizer._init_lambda4();
                    mediaBrowserCompatItemReceiver = (_assertnotnullAudioAttributesImplApi26Parcelizer == null || (objectReader = _assertnotnullAudioAttributesImplApi26Parcelizer.get_init_lambda2()) == null) ? null : objectReader.getAudioAttributesCompatParcelizer();
                }
            }
            return _addSymbol.AudioAttributesCompatParcelizer;
        }
        return _addSymbol.AudioAttributesCompatParcelizer;
    }

    /* JADX INFO: renamed from: o._handleSpillOverflow$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/_handleSpillOverflow;", "p0", "", "AudioAttributesCompatParcelizer", "(Lo/_handleSpillOverflow;)Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass3 extends MagicModuleUseCase implements getAnswerMap<_handleSpillOverflow, Boolean> {
        final /* synthetic */ int $read;

        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(_handleSpillOverflow _handlespilloverflow) {
            return Boolean.valueOf(_handlespilloverflow.AudioAttributesCompatParcelizer(this.$read));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(int i) {
            super(1);
            this.$read = i;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean AudioAttributesCompatParcelizer(int p0) {
        int i = WhenMappings.AudioAttributesCompatParcelizer[copyArrays.RemoteActionCompatParcelizer(this, p0).ordinal()];
        if (i == 1) {
            return copyArrays.AudioAttributesCompatParcelizer(this);
        }
        if (i == 2) {
            return true;
        }
        if (i == 3 || i == 4) {
            return false;
        }
        throw new RenewEligibleCreator();
    }

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from getter */
    public final int getAudioAttributesImplBaseParcelizer() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    public final containedTypeCount write() {
        return collectLongDefaults.RemoteActionCompatParcelizer(this);
    }

    @Override // kotlin._prefetchRootDeserializer
    public final void MediaMetadataCompat() {
        AudioAttributesImplApi21Parcelizer();
    }

    @Override // o._handleOddName.IconCompatParcelizer
    public final void p_() {
        if (AudioAttributesCompatParcelizer().write()) {
            collectLongDefaults.MediaBrowserCompatCustomActionResultReceiver(this).getOnPlayFromSearch().read(true, true, true, _checkNeedForRehash.INSTANCE.AudioAttributesCompatParcelizer());
        }
    }

    @Override // o._handleOddName.IconCompatParcelizer
    public final void MediaDescriptionCompat() {
        nukeSymbols onPlayFromSearch;
        int i = WhenMappings.write[AudioAttributesCompatParcelizer().ordinal()];
        if (i == 1 || i == 2) {
            onPlayFromSearch = collectLongDefaults.MediaBrowserCompatCustomActionResultReceiver(this).getOnPlayFromSearch();
            onPlayFromSearch.read(true, true, false, _checkNeedForRehash.INSTANCE.AudioAttributesCompatParcelizer());
            if (this.read) {
                onPlayFromSearch.AudioAttributesCompatParcelizer(null, null);
            }
        } else {
            if (i == 3) {
                onPlayFromSearch = collectLongDefaults.MediaBrowserCompatCustomActionResultReceiver(this).getOnPlayFromSearch();
                _handleSpillOverflow _handlespilloverflowIconCompatParcelizer = _hashToIndex.IconCompatParcelizer(this);
                if (_handlespilloverflowIconCompatParcelizer != null && _handlespilloverflowIconCompatParcelizer.read) {
                    onPlayFromSearch.AudioAttributesCompatParcelizer(null, null);
                }
            } else if (i != 4) {
                throw new RenewEligibleCreator();
            }
            this.AudioAttributesImplApi26Parcelizer = null;
        }
        onPlayFromSearch.MediaDescriptionCompat();
        this.AudioAttributesImplApi26Parcelizer = null;
    }

    @Override // kotlin._writeCloseable
    public final void write(isAbstract p0) {
        if (_verifyNoLeadingZeroes.AudioAttributesImplApi21Parcelizer) {
            collectLongDefaults.MediaBrowserCompatCustomActionResultReceiver(getRead()).getOnPlayFromSearch().RemoteActionCompatParcelizer();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v14 */
    public final makeChild read() {
        ObjectReader objectReader;
        calcHash calchash = new calcHash();
        calchash.read(hashSeed.IconCompatParcelizer(getAudioAttributesImplBaseParcelizer(), (getLongMask) this));
        _handleSpillOverflow _handlespilloverflow = this;
        int iWrite = _bind.write(2048);
        int iWrite2 = _bind.write(1024);
        _handleOddName.IconCompatParcelizer read = _handlespilloverflow.getRead();
        int i = iWrite | iWrite2;
        if (!_handlespilloverflow.getRead().getRatingCompat()) {
            reportWrongTokenException.read("visitAncestors called on an unattached node");
        }
        _handleOddName.IconCompatParcelizer read2 = _handlespilloverflow.getRead();
        _assertNotNull _assertnotnullAudioAttributesImplApi26Parcelizer = collectLongDefaults.AudioAttributesImplApi26Parcelizer(_handlespilloverflow);
        loop0: while (_assertnotnullAudioAttributesImplApi26Parcelizer != null) {
            if ((_assertnotnullAudioAttributesImplApi26Parcelizer.get_init_lambda2().getAudioAttributesImplApi21Parcelizer().getRemoteActionCompatParcelizer() & i) != 0) {
                while (read2 != null) {
                    if ((read2.getWrite() & i) != 0) {
                        if (read2 != read && (read2.getWrite() & iWrite2) != 0) {
                            break loop0;
                        }
                        if ((read2.getWrite() & iWrite) != 0) {
                            _handleOddName.IconCompatParcelizer iconCompatParcelizerWrite = read2;
                            UTF32Reader uTF32Reader = null;
                            while (iconCompatParcelizerWrite != 0) {
                                if (iconCompatParcelizerWrite instanceof _reportTooManyCollisions) {
                                    ((_reportTooManyCollisions) iconCompatParcelizerWrite).RemoteActionCompatParcelizer(calchash);
                                } else if ((iconCompatParcelizerWrite.getWrite() & iWrite) != 0 && (iconCompatParcelizerWrite instanceof addAbstractTypeResolver)) {
                                    _handleOddName.IconCompatParcelizer iconCompatParcelizer = ((addAbstractTypeResolver) iconCompatParcelizerWrite).getIconCompatParcelizer();
                                    int i2 = 0;
                                    iconCompatParcelizerWrite = iconCompatParcelizerWrite;
                                    while (iconCompatParcelizer != null) {
                                        if ((iconCompatParcelizer.getWrite() & iWrite) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                iconCompatParcelizerWrite = iconCompatParcelizer;
                                            } else {
                                                if (uTF32Reader == null) {
                                                    uTF32Reader = new UTF32Reader(new _handleOddName.IconCompatParcelizer[16], 0);
                                                }
                                                if (iconCompatParcelizerWrite != 0) {
                                                    if (uTF32Reader != null) {
                                                        uTF32Reader.read(iconCompatParcelizerWrite);
                                                    }
                                                    iconCompatParcelizerWrite = 0;
                                                }
                                                if (uTF32Reader != null) {
                                                    uTF32Reader.read(iconCompatParcelizer);
                                                }
                                            }
                                        }
                                        iconCompatParcelizer = iconCompatParcelizer.getAudioAttributesImplBaseParcelizer();
                                        iconCompatParcelizerWrite = iconCompatParcelizerWrite;
                                    }
                                    if (i2 != 1) {
                                    }
                                }
                                iconCompatParcelizerWrite = collectLongDefaults.write((UTF32Reader<_handleOddName.IconCompatParcelizer>) uTF32Reader);
                            }
                        }
                    }
                    read2 = read2.getMediaBrowserCompatItemReceiver();
                }
            }
            _assertnotnullAudioAttributesImplApi26Parcelizer = _assertnotnullAudioAttributesImplApi26Parcelizer._init_lambda4();
            read2 = (_assertnotnullAudioAttributesImplApi26Parcelizer == null || (objectReader = _assertnotnullAudioAttributesImplApi26Parcelizer.get_init_lambda2()) == null) ? null : objectReader.getAudioAttributesCompatParcelizer();
        }
        return calchash;
    }

    public static /* synthetic */ WritableTypeIdInclusion RemoteActionCompatParcelizer$default(_handleSpillOverflow _handlespilloverflow, isAbstract isabstract, int i, Object obj) {
        if ((i & 1) != 0) {
            isabstract = null;
        }
        return _handlespilloverflow.RemoteActionCompatParcelizer(isabstract);
    }

    public final WritableTypeIdInclusion RemoteActionCompatParcelizer(isAbstract p0) {
        WritableTypeIdInclusion writableTypeIdInclusionWrite;
        WritableTypeIdInclusion mediaBrowserCompatSearchResultReceiver = read().getMediaBrowserCompatSearchResultReceiver();
        return mediaBrowserCompatSearchResultReceiver != makeChild.INSTANCE.RemoteActionCompatParcelizer() ? p0 == null ? mediaBrowserCompatSearchResultReceiver : mediaBrowserCompatSearchResultReceiver.RemoteActionCompatParcelizer(isAbstract.IconCompatParcelizer$default(p0, collectLongDefaults.AudioAttributesImplApi21Parcelizer(this), 0L, false, 6, null)) : (p0 == null || (writableTypeIdInclusionWrite = p0.write(collectLongDefaults.AudioAttributesImplApi21Parcelizer(this), false)) == null) ? BufferRecycler.read(getReferencedType.INSTANCE.write(), SetterlessProperty.AudioAttributesCompatParcelizer(collectLongDefaults.AudioAttributesImplApi21Parcelizer(this).write())) : writableTypeIdInclusionWrite;
    }

    public final void AudioAttributesImplApi21Parcelizer() {
        makeChild makechild;
        int i = WhenMappings.write[AudioAttributesCompatParcelizer().ordinal()];
        if (i != 1 && i != 2) {
            if (i != 3 && i != 4) {
                throw new RenewEligibleCreator();
            }
            return;
        }
        MagicModuleUseCaseImplWhenMappings.write writeVar = new MagicModuleUseCaseImplWhenMappings.write();
        _detectBindAndClose.read(this, new AnonymousClass5(writeVar, this));
        if (writeVar.write == 0) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            makechild = null;
        } else {
            makechild = (makeChild) writeVar.write;
        }
        if (makechild.getIconCompatParcelizer()) {
            return;
        }
        collectLongDefaults.MediaBrowserCompatCustomActionResultReceiver(this).getOnPlayFromSearch().RemoteActionCompatParcelizer(true);
    }

    /* JADX INFO: renamed from: o._handleSpillOverflow$5, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "write", "()V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass5 extends MagicModuleUseCase implements getCreatedOnDateMs<getShowPopup> {
        final /* synthetic */ MagicModuleUseCaseImplWhenMappings.write<makeChild> $IconCompatParcelizer;
        final /* synthetic */ _handleSpillOverflow read;

        @Override // kotlin.getCreatedOnDateMs
        public final /* synthetic */ getShowPopup invoke() {
            write();
            return getShowPopup.INSTANCE;
        }

        /* JADX WARN: Type inference failed for: r1v2, types: [T, o.makeChild] */
        public final void write() {
            this.$IconCompatParcelizer.write = this.read.read();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass5(MagicModuleUseCaseImplWhenMappings.write<makeChild> writeVar, _handleSpillOverflow _handlespilloverflow) {
            super(0);
            this.$IconCompatParcelizer = writeVar;
            this.read = _handlespilloverflow;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v14 */
    public final void read(CharsToNameCanonicalizer p0, CharsToNameCanonicalizer p1) {
        ObjectReader objectReader;
        MagicModuleSubmissionRequestBody<CharsToNameCanonicalizer, CharsToNameCanonicalizer, getShowPopup> magicModuleSubmissionRequestBody;
        _handleSpillOverflow _handlespilloverflow = this;
        nukeSymbols onPlayFromSearch = collectLongDefaults.MediaBrowserCompatCustomActionResultReceiver(_handlespilloverflow).getOnPlayFromSearch();
        _handleSpillOverflow _handlespilloverflow2 = onPlayFromSearch.read();
        if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, p1) && (magicModuleSubmissionRequestBody = this.RemoteActionCompatParcelizer) != null) {
            magicModuleSubmissionRequestBody.invoke(p0, p1);
        }
        int iWrite = _bind.write(4096);
        int iWrite2 = _bind.write(1024);
        _handleOddName.IconCompatParcelizer read = _handlespilloverflow.getRead();
        int i = iWrite | iWrite2;
        if (!_handlespilloverflow.getRead().getRatingCompat()) {
            reportWrongTokenException.read("visitAncestors called on an unattached node");
        }
        _handleOddName.IconCompatParcelizer read2 = _handlespilloverflow.getRead();
        _assertNotNull _assertnotnullAudioAttributesImplApi26Parcelizer = collectLongDefaults.AudioAttributesImplApi26Parcelizer(_handlespilloverflow);
        loop0: while (_assertnotnullAudioAttributesImplApi26Parcelizer != null) {
            if ((_assertnotnullAudioAttributesImplApi26Parcelizer.get_init_lambda2().getAudioAttributesImplApi21Parcelizer().getRemoteActionCompatParcelizer() & i) != 0) {
                while (read2 != null) {
                    if ((read2.getWrite() & i) != 0) {
                        if (read2 != read && (read2.getWrite() & iWrite2) != 0) {
                            break loop0;
                        }
                        if ((read2.getWrite() & iWrite) != 0) {
                            _handleOddName.IconCompatParcelizer iconCompatParcelizerWrite = read2;
                            UTF32Reader uTF32Reader = null;
                            while (iconCompatParcelizerWrite != 0) {
                                if (!(iconCompatParcelizerWrite instanceof ByteQuadsCanonicalizer)) {
                                    if ((iconCompatParcelizerWrite.getWrite() & iWrite) != 0 && (iconCompatParcelizerWrite instanceof addAbstractTypeResolver)) {
                                        _handleOddName.IconCompatParcelizer iconCompatParcelizer = ((addAbstractTypeResolver) iconCompatParcelizerWrite).getIconCompatParcelizer();
                                        int i2 = 0;
                                        iconCompatParcelizerWrite = iconCompatParcelizerWrite;
                                        while (iconCompatParcelizer != null) {
                                            if ((iconCompatParcelizer.getWrite() & iWrite) != 0) {
                                                i2++;
                                                if (i2 == 1) {
                                                    iconCompatParcelizerWrite = iconCompatParcelizer;
                                                } else {
                                                    if (uTF32Reader == null) {
                                                        uTF32Reader = new UTF32Reader(new _handleOddName.IconCompatParcelizer[16], 0);
                                                    }
                                                    if (iconCompatParcelizerWrite != 0) {
                                                        if (uTF32Reader != null) {
                                                            uTF32Reader.read(iconCompatParcelizerWrite);
                                                        }
                                                        iconCompatParcelizerWrite = 0;
                                                    }
                                                    if (uTF32Reader != null) {
                                                        uTF32Reader.read(iconCompatParcelizer);
                                                    }
                                                }
                                            }
                                            iconCompatParcelizer = iconCompatParcelizer.getAudioAttributesImplBaseParcelizer();
                                            iconCompatParcelizerWrite = iconCompatParcelizerWrite;
                                        }
                                        if (i2 != 1) {
                                        }
                                    }
                                } else {
                                    ByteQuadsCanonicalizer byteQuadsCanonicalizer = (ByteQuadsCanonicalizer) iconCompatParcelizerWrite;
                                    if (_handlespilloverflow2 == onPlayFromSearch.read()) {
                                        byteQuadsCanonicalizer.AudioAttributesCompatParcelizer(p1);
                                    }
                                }
                                iconCompatParcelizerWrite = collectLongDefaults.write((UTF32Reader<_handleOddName.IconCompatParcelizer>) uTF32Reader);
                            }
                        }
                    }
                    read2 = read2.getMediaBrowserCompatItemReceiver();
                }
            }
            _assertnotnullAudioAttributesImplApi26Parcelizer = _assertnotnullAudioAttributesImplApi26Parcelizer._init_lambda4();
            read2 = (_assertnotnullAudioAttributesImplApi26Parcelizer == null || (objectReader = _assertnotnullAudioAttributesImplApi26Parcelizer.get_init_lambda2()) == null) ? null : objectReader.getAudioAttributesCompatParcelizer();
        }
        getAnswerMap<_handleSpillOverflow, getShowPopup> getanswermap = this.IconCompatParcelizer;
        if (getanswermap != null) {
            getanswermap.invoke(this);
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0007\u001a\u0004\u0018\u00010\u000eH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011"}, d2 = {"Lo/_handleSpillOverflow$RemoteActionCompatParcelizer;", "Lo/writerFor;", "Lo/_handleSpillOverflow;", "<init>", "()V", "read", "()Lo/_handleSpillOverflow;", "p0", "", "AudioAttributesCompatParcelizer", "(Lo/_handleSpillOverflow;)V", "", "hashCode", "()I", "", "", "equals", "(Ljava/lang/Object;)Z"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class RemoteActionCompatParcelizer extends writerFor<_handleSpillOverflow> {
        public static final RemoteActionCompatParcelizer INSTANCE = new RemoteActionCompatParcelizer();

        @Override // kotlin.writerFor
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final void IconCompatParcelizer(_handleSpillOverflow p0) {
        }

        public final boolean equals(Object p0) {
            return p0 == this;
        }

        private RemoteActionCompatParcelizer() {
        }

        @Override // kotlin.writerFor
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public final _handleSpillOverflow IconCompatParcelizer() {
            return new _handleSpillOverflow(0, false, null, null, 15, null);
        }

        public final int hashCode() {
            return "focusTarget".hashCode();
        }
    }

    @Override // kotlin._findSymbol2
    public final boolean IconCompatParcelizer(int p0) {
        boolean zWrite;
        Trace.beginSection("FocusTransactions:requestFocus");
        try {
            if (_verifyNoLeadingZeroes.AudioAttributesImplBaseParcelizer) {
                if (read().getIconCompatParcelizer()) {
                    zWrite = AudioAttributesCompatParcelizer(p0);
                } else {
                    zWrite = has.write(this, p0, new AnonymousClass3(p0));
                }
            } else {
                zWrite = read().getIconCompatParcelizer() && AudioAttributesCompatParcelizer(p0);
            }
            return zWrite;
        } finally {
            Trace.endSection();
        }
    }

    public /* synthetic */ _handleSpillOverflow(int i, boolean z, MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody, getAnswerMap getanswermap, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(i, z, magicModuleSubmissionRequestBody, getanswermap);
    }
}
