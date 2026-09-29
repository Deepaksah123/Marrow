package kotlin;

import kotlin.Metadata;
import kotlin._handleOddName;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\t\u001a#\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001aC\u0010\r\u001a\u0004\u0018\u00010\u000b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u000b0\nH\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\u0013\u0010\u000f\u001a\u00020\b*\u00020\u0000H\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0000*\u00020\u0000H\u0000¢\u0006\u0004\b\u0006\u0010\u0011\u001a\u0015\u0010\u0012\u001a\u0004\u0018\u00010\u0000*\u00020\u0000H\u0002¢\u0006\u0004\b\u0012\u0010\u0011\"\u0018\u0010\u0012\u001a\u00020\u000b*\u00020\u00008AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u0013\"\u001a\u0010\r\u001a\u0004\u0018\u00010\u0000*\u00020\u00008AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0011"}, d2 = {"Lo/_handleSpillOverflow;", "Lo/_checkNeedForRehash;", "p0", "Lo/tryToResolveUnresolved;", "p1", "Lo/secondaryCount;", "IconCompatParcelizer", "(Lo/_handleSpillOverflow;ILo/tryToResolveUnresolved;)Lo/secondaryCount;", "Lo/WritableTypeIdInclusion;", "p2", "Lkotlin/Function1;", "", "p3", "AudioAttributesCompatParcelizer", "(Lo/_handleSpillOverflow;ILo/tryToResolveUnresolved;Lo/WritableTypeIdInclusion;Lo/getAnswerMap;)Ljava/lang/Boolean;", "write", "(Lo/_handleSpillOverflow;)Lo/WritableTypeIdInclusion;", "(Lo/_handleSpillOverflow;)Lo/_handleSpillOverflow;", "read", "(Lo/_handleSpillOverflow;)Z", "RemoteActionCompatParcelizer"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class _hashToIndex {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] read;
        public static final /* synthetic */ int[] write;

        static {
            int[] iArr = new int[tryToResolveUnresolved.values().length];
            try {
                iArr[tryToResolveUnresolved.write.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[tryToResolveUnresolved.RemoteActionCompatParcelizer.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            write = iArr;
            int[] iArr2 = new int[_addSymbol.values().length];
            try {
                iArr2[_addSymbol.RemoteActionCompatParcelizer.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[_addSymbol.write.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[_addSymbol.read.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[_addSymbol.AudioAttributesCompatParcelizer.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            read = iArr2;
        }
    }

    public static final secondaryCount IconCompatParcelizer(_handleSpillOverflow _handlespilloverflow, int i, tryToResolveUnresolved trytoresolveunresolved) {
        secondaryCount mediaBrowserCompatItemReceiver;
        secondaryCount secondarycount;
        secondaryCount audioAttributesImplBaseParcelizer;
        makeChild makechild = _handlespilloverflow.read();
        if (_checkNeedForRehash.IconCompatParcelizer(i, _checkNeedForRehash.INSTANCE.write())) {
            return makechild.getWrite();
        }
        if (_checkNeedForRehash.IconCompatParcelizer(i, _checkNeedForRehash.INSTANCE.AudioAttributesImplBaseParcelizer())) {
            return makechild.getRead();
        }
        if (_checkNeedForRehash.IconCompatParcelizer(i, _checkNeedForRehash.INSTANCE.AudioAttributesImplApi21Parcelizer())) {
            return makechild.getRemoteActionCompatParcelizer();
        }
        if (_checkNeedForRehash.IconCompatParcelizer(i, _checkNeedForRehash.INSTANCE.IconCompatParcelizer())) {
            return makechild.getAudioAttributesCompatParcelizer();
        }
        if (_checkNeedForRehash.IconCompatParcelizer(i, _checkNeedForRehash.INSTANCE.read())) {
            int i2 = WhenMappings.write[trytoresolveunresolved.ordinal()];
            if (i2 == 1) {
                audioAttributesImplBaseParcelizer = makechild.getAudioAttributesImplBaseParcelizer();
            } else {
                if (i2 != 2) {
                    throw new RenewEligibleCreator();
                }
                audioAttributesImplBaseParcelizer = makechild.getMediaBrowserCompatItemReceiver();
            }
            secondarycount = audioAttributesImplBaseParcelizer != secondaryCount.INSTANCE.AudioAttributesCompatParcelizer() ? audioAttributesImplBaseParcelizer : null;
            return secondarycount == null ? makechild.getAudioAttributesImplApi26Parcelizer() : secondarycount;
        }
        if (_checkNeedForRehash.IconCompatParcelizer(i, _checkNeedForRehash.INSTANCE.MediaBrowserCompatItemReceiver())) {
            int i3 = WhenMappings.write[trytoresolveunresolved.ordinal()];
            if (i3 == 1) {
                mediaBrowserCompatItemReceiver = makechild.getMediaBrowserCompatItemReceiver();
            } else {
                if (i3 != 2) {
                    throw new RenewEligibleCreator();
                }
                mediaBrowserCompatItemReceiver = makechild.getAudioAttributesImplBaseParcelizer();
            }
            secondarycount = mediaBrowserCompatItemReceiver != secondaryCount.INSTANCE.AudioAttributesCompatParcelizer() ? mediaBrowserCompatItemReceiver : null;
            return secondarycount == null ? makechild.getAudioAttributesImplApi21Parcelizer() : secondarycount;
        }
        if (_checkNeedForRehash.IconCompatParcelizer(i, _checkNeedForRehash.INSTANCE.RemoteActionCompatParcelizer()) || _checkNeedForRehash.IconCompatParcelizer(i, _checkNeedForRehash.INSTANCE.AudioAttributesCompatParcelizer())) {
            _writeStringASCII _writestringascii = new _writeStringASCII(i, null);
            nukeSymbols onPlayFromSearch = collectLongDefaults.MediaBrowserCompatCustomActionResultReceiver(_handlespilloverflow).getOnPlayFromSearch();
            _handleSpillOverflow _handlespilloverflow2 = onPlayFromSearch.read();
            if (_checkNeedForRehash.IconCompatParcelizer(i, _checkNeedForRehash.INSTANCE.RemoteActionCompatParcelizer())) {
                makechild.AudioAttributesImplApi26Parcelizer().invoke(_writestringascii);
            } else {
                makechild.AudioAttributesImplBaseParcelizer().invoke(_writestringascii);
            }
            if (_writestringascii.getIconCompatParcelizer()) {
                return secondaryCount.INSTANCE.IconCompatParcelizer();
            }
            if (_handlespilloverflow2 != onPlayFromSearch.read()) {
                return secondaryCount.INSTANCE.write();
            }
            return secondaryCount.INSTANCE.AudioAttributesCompatParcelizer();
        }
        throw new IllegalStateException("invalid FocusDirection".toString());
    }

    public static final Boolean AudioAttributesCompatParcelizer(_handleSpillOverflow _handlespilloverflow, int i, tryToResolveUnresolved trytoresolveunresolved, WritableTypeIdInclusion writableTypeIdInclusion, getAnswerMap<? super _handleSpillOverflow, Boolean> getanswermap) {
        int iMediaBrowserCompatItemReceiver;
        if (_checkNeedForRehash.IconCompatParcelizer(i, _checkNeedForRehash.INSTANCE.write()) || _checkNeedForRehash.IconCompatParcelizer(i, _checkNeedForRehash.INSTANCE.AudioAttributesImplBaseParcelizer())) {
            return Boolean.valueOf(CharsToNameCanonicalizerBucket.read(_handlespilloverflow, i, getanswermap));
        }
        if (_checkNeedForRehash.IconCompatParcelizer(i, _checkNeedForRehash.INSTANCE.read()) || _checkNeedForRehash.IconCompatParcelizer(i, _checkNeedForRehash.INSTANCE.MediaBrowserCompatItemReceiver()) || _checkNeedForRehash.IconCompatParcelizer(i, _checkNeedForRehash.INSTANCE.AudioAttributesImplApi21Parcelizer()) || _checkNeedForRehash.IconCompatParcelizer(i, _checkNeedForRehash.INSTANCE.IconCompatParcelizer())) {
            return has.RemoteActionCompatParcelizer(_handlespilloverflow, i, writableTypeIdInclusion, getanswermap);
        }
        if (_checkNeedForRehash.IconCompatParcelizer(i, _checkNeedForRehash.INSTANCE.RemoteActionCompatParcelizer())) {
            int i2 = WhenMappings.write[trytoresolveunresolved.ordinal()];
            if (i2 == 1) {
                iMediaBrowserCompatItemReceiver = _checkNeedForRehash.INSTANCE.MediaBrowserCompatItemReceiver();
            } else {
                if (i2 != 2) {
                    throw new RenewEligibleCreator();
                }
                iMediaBrowserCompatItemReceiver = _checkNeedForRehash.INSTANCE.read();
            }
            _handleSpillOverflow _handlespilloverflowIconCompatParcelizer = IconCompatParcelizer(_handlespilloverflow);
            if (_handlespilloverflowIconCompatParcelizer != null) {
                return has.RemoteActionCompatParcelizer(_handlespilloverflowIconCompatParcelizer, iMediaBrowserCompatItemReceiver, writableTypeIdInclusion, getanswermap);
            }
            return null;
        }
        if (_checkNeedForRehash.IconCompatParcelizer(i, _checkNeedForRehash.INSTANCE.AudioAttributesCompatParcelizer())) {
            _handleSpillOverflow _handlespilloverflowIconCompatParcelizer2 = IconCompatParcelizer(_handlespilloverflow);
            _handleSpillOverflow _handlespilloverflow2 = _handlespilloverflowIconCompatParcelizer2 != null ? read(_handlespilloverflowIconCompatParcelizer2) : null;
            return Boolean.valueOf((_handlespilloverflow2 == null || toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(_handlespilloverflow2, _handlespilloverflow)) ? false : getanswermap.invoke(_handlespilloverflow2).booleanValue());
        }
        StringBuilder sb = new StringBuilder("Focus search invoked with invalid FocusDirection ");
        sb.append((Object) _checkNeedForRehash.RemoteActionCompatParcelizer(i));
        throw new IllegalStateException(sb.toString().toString());
    }

    public static final WritableTypeIdInclusion write(_handleSpillOverflow _handlespilloverflow) {
        isAbstract isabstractRemoteActionCompatParcelizer;
        if (!_handlespilloverflow.getRatingCompat()) {
            return WritableTypeIdInclusion.INSTANCE.write();
        }
        _bindAndClose audioAttributesImplApi21Parcelizer = _handlespilloverflow.getAudioAttributesImplApi21Parcelizer();
        if (audioAttributesImplApi21Parcelizer != null && (isabstractRemoteActionCompatParcelizer = hasRawClass.RemoteActionCompatParcelizer(audioAttributesImplApi21Parcelizer)) != null) {
            if (!isabstractRemoteActionCompatParcelizer.MediaBrowserCompatItemReceiver()) {
                isabstractRemoteActionCompatParcelizer = null;
            }
            if (isabstractRemoteActionCompatParcelizer != null) {
                return _handlespilloverflow.RemoteActionCompatParcelizer(isabstractRemoteActionCompatParcelizer);
            }
        }
        return WritableTypeIdInclusion.INSTANCE.write();
    }

    public static final boolean AudioAttributesCompatParcelizer(_handleSpillOverflow _handlespilloverflow) {
        _assertNotNull iconCompatParcelizer;
        _bindAndClose audioAttributesImplApi21Parcelizer;
        _assertNotNull iconCompatParcelizer2;
        _bindAndClose audioAttributesImplApi21Parcelizer2 = _handlespilloverflow.getAudioAttributesImplApi21Parcelizer();
        return (audioAttributesImplApi21Parcelizer2 == null || (iconCompatParcelizer = audioAttributesImplApi21Parcelizer2.getIconCompatParcelizer()) == null || !iconCompatParcelizer.MediaDescriptionCompat() || (audioAttributesImplApi21Parcelizer = _handlespilloverflow.getAudioAttributesImplApi21Parcelizer()) == null || (iconCompatParcelizer2 = audioAttributesImplApi21Parcelizer.getIconCompatParcelizer()) == null || !iconCompatParcelizer2.AudioAttributesImplApi26Parcelizer()) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:71:0x0042, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin._handleSpillOverflow RemoteActionCompatParcelizer(kotlin._handleSpillOverflow r10) {
        /*
            Method dump skipped, instruction units count: 229
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin._hashToIndex.RemoteActionCompatParcelizer(o._handleSpillOverflow):o._handleSpillOverflow");
    }

    public static final _handleSpillOverflow IconCompatParcelizer(_handleSpillOverflow _handlespilloverflow) {
        _handleSpillOverflow _handlespilloverflow2 = collectLongDefaults.MediaBrowserCompatCustomActionResultReceiver(_handlespilloverflow).getOnPlayFromSearch().read();
        if (_handlespilloverflow2 == null || !_handlespilloverflow2.getRatingCompat()) {
            return null;
        }
        return _handlespilloverflow2;
    }

    private static final _handleSpillOverflow read(_handleSpillOverflow _handlespilloverflow) {
        ObjectReader objectReader;
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
                                _handleSpillOverflow _handlespilloverflow3 = (_handleSpillOverflow) iconCompatParcelizerWrite;
                                if (_handlespilloverflow3.read().getIconCompatParcelizer()) {
                                    return _handlespilloverflow3;
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
        return null;
    }
}
