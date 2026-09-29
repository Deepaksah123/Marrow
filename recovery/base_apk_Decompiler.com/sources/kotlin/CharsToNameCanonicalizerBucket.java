package kotlin;

import java.util.Comparator;
import kotlin.Metadata;
import kotlin._handleOddName;
import kotlin.containedTypeCount;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\u001a/\u0010\u0006\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a'\u0010\b\u001a\u00020\u0004*\u00020\u00002\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\u0002¢\u0006\u0004\b\b\u0010\t\u001a'\u0010\n\u001a\u00020\u0004*\u00020\u00002\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\u0002¢\u0006\u0004\b\n\u0010\t\u001a7\u0010\n\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\u0002¢\u0006\u0004\b\n\u0010\f\u001a7\u0010\r\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\u0002¢\u0006\u0004\b\r\u0010\f\u001a'\u0010\u0006\u001a\u00020\u0004*\u00020\u00002\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\t\u001a'\u0010\u000e\u001a\u00020\u0004*\u00020\u00002\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\u0002¢\u0006\u0004\b\u000e\u0010\t\u001a\u0013\u0010\u000e\u001a\u00020\u0004*\u00020\u0000H\u0002¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Lo/_handleSpillOverflow;", "Lo/_checkNeedForRehash;", "p0", "Lkotlin/Function1;", "", "p1", "read", "(Lo/_handleSpillOverflow;ILo/getAnswerMap;)Z", "AudioAttributesCompatParcelizer", "(Lo/_handleSpillOverflow;Lo/getAnswerMap;)Z", "write", "p2", "(Lo/_handleSpillOverflow;Lo/_handleSpillOverflow;ILo/getAnswerMap;)Z", "RemoteActionCompatParcelizer", "IconCompatParcelizer", "(Lo/_handleSpillOverflow;)Z"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class CharsToNameCanonicalizerBucket {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] AudioAttributesCompatParcelizer;

        static {
            int[] iArr = new int[_addSymbol.values().length];
            try {
                iArr[_addSymbol.write.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[_addSymbol.RemoteActionCompatParcelizer.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[_addSymbol.read.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[_addSymbol.AudioAttributesCompatParcelizer.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            AudioAttributesCompatParcelizer = iArr;
        }
    }

    public static final boolean read(_handleSpillOverflow _handlespilloverflow, int i, getAnswerMap<? super _handleSpillOverflow, Boolean> getanswermap) {
        if (_checkNeedForRehash.IconCompatParcelizer(i, _checkNeedForRehash.INSTANCE.write())) {
            return AudioAttributesCompatParcelizer(_handlespilloverflow, getanswermap);
        }
        if (_checkNeedForRehash.IconCompatParcelizer(i, _checkNeedForRehash.INSTANCE.AudioAttributesImplBaseParcelizer())) {
            return write(_handlespilloverflow, getanswermap);
        }
        throw new IllegalStateException("This function should only be used for 1-D focus search".toString());
    }

    private static final boolean AudioAttributesCompatParcelizer(_handleSpillOverflow _handlespilloverflow, getAnswerMap<? super _handleSpillOverflow, Boolean> getanswermap) {
        int i = WhenMappings.AudioAttributesCompatParcelizer[_handlespilloverflow.AudioAttributesCompatParcelizer().ordinal()];
        if (i == 1) {
            _handleSpillOverflow _handlespilloverflowRemoteActionCompatParcelizer = _hashToIndex.RemoteActionCompatParcelizer(_handlespilloverflow);
            if (_handlespilloverflowRemoteActionCompatParcelizer != null) {
                return AudioAttributesCompatParcelizer(_handlespilloverflowRemoteActionCompatParcelizer, getanswermap) || write(_handlespilloverflow, _handlespilloverflowRemoteActionCompatParcelizer, _checkNeedForRehash.INSTANCE.write(), getanswermap);
            }
            throw new IllegalStateException("ActiveParent must have a focusedChild".toString());
        }
        if (i == 2 || i == 3) {
            return read(_handlespilloverflow, getanswermap);
        }
        if (i != 4) {
            throw new RenewEligibleCreator();
        }
        if (_handlespilloverflow.read().getIconCompatParcelizer()) {
            return getanswermap.invoke(_handlespilloverflow).booleanValue();
        }
        return read(_handlespilloverflow, getanswermap);
    }

    private static final boolean write(_handleSpillOverflow _handlespilloverflow, getAnswerMap<? super _handleSpillOverflow, Boolean> getanswermap) {
        int i = WhenMappings.AudioAttributesCompatParcelizer[_handlespilloverflow.AudioAttributesCompatParcelizer().ordinal()];
        if (i != 1) {
            if (i == 2 || i == 3) {
                return IconCompatParcelizer(_handlespilloverflow, getanswermap);
            }
            if (i == 4) {
                return IconCompatParcelizer(_handlespilloverflow, getanswermap) || (_handlespilloverflow.read().getIconCompatParcelizer() && getanswermap.invoke(_handlespilloverflow).booleanValue());
            }
            throw new RenewEligibleCreator();
        }
        _handleSpillOverflow _handlespilloverflowRemoteActionCompatParcelizer = _hashToIndex.RemoteActionCompatParcelizer(_handlespilloverflow);
        if (_handlespilloverflowRemoteActionCompatParcelizer == null) {
            throw new IllegalStateException("ActiveParent must have a focusedChild".toString());
        }
        int i2 = WhenMappings.AudioAttributesCompatParcelizer[_handlespilloverflowRemoteActionCompatParcelizer.AudioAttributesCompatParcelizer().ordinal()];
        if (i2 == 1) {
            return write(_handlespilloverflowRemoteActionCompatParcelizer, getanswermap) || write(_handlespilloverflow, _handlespilloverflowRemoteActionCompatParcelizer, _checkNeedForRehash.INSTANCE.AudioAttributesImplBaseParcelizer(), getanswermap) || (_handlespilloverflowRemoteActionCompatParcelizer.read().getIconCompatParcelizer() && getanswermap.invoke(_handlespilloverflowRemoteActionCompatParcelizer).booleanValue());
        }
        if (i2 == 2 || i2 == 3) {
            return write(_handlespilloverflow, _handlespilloverflowRemoteActionCompatParcelizer, _checkNeedForRehash.INSTANCE.AudioAttributesImplBaseParcelizer(), getanswermap);
        }
        if (i2 != 4) {
            throw new RenewEligibleCreator();
        }
        throw new IllegalStateException("ActiveParent must have a focusedChild".toString());
    }

    private static final boolean write(_handleSpillOverflow _handlespilloverflow, _handleSpillOverflow _handlespilloverflow2, int i, getAnswerMap<? super _handleSpillOverflow, Boolean> getanswermap) {
        if (RemoteActionCompatParcelizer(_handlespilloverflow, _handlespilloverflow2, i, getanswermap)) {
            return true;
        }
        Boolean bool = (Boolean) getHexChars.RemoteActionCompatParcelizer(_handlespilloverflow, i, new AnonymousClass4(collectLongDefaults.MediaBrowserCompatCustomActionResultReceiver(_handlespilloverflow).getOnPlayFromSearch().read(), _handlespilloverflow, _handlespilloverflow2, i, getanswermap));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    /* JADX INFO: renamed from: o.CharsToNameCanonicalizerBucket$4, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/containedTypeCount$AudioAttributesCompatParcelizer;", "", "read", "(Lo/containedTypeCount$AudioAttributesCompatParcelizer;)Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass4 extends MagicModuleUseCase implements getAnswerMap<containedTypeCount.AudioAttributesCompatParcelizer, Boolean> {
        final /* synthetic */ getAnswerMap<_handleSpillOverflow, Boolean> $AudioAttributesCompatParcelizer;
        final /* synthetic */ int $IconCompatParcelizer;
        final /* synthetic */ _handleSpillOverflow $RemoteActionCompatParcelizer;
        final /* synthetic */ _handleSpillOverflow $read;
        final /* synthetic */ _handleSpillOverflow $write;

        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(containedTypeCount.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
            if (this.$read == collectLongDefaults.MediaBrowserCompatCustomActionResultReceiver(this.$RemoteActionCompatParcelizer).getOnPlayFromSearch().read()) {
                Boolean boolValueOf = Boolean.valueOf(CharsToNameCanonicalizerBucket.RemoteActionCompatParcelizer(this.$RemoteActionCompatParcelizer, this.$write, this.$IconCompatParcelizer, this.$AudioAttributesCompatParcelizer));
                if (boolValueOf.booleanValue() || !audioAttributesCompatParcelizer.getIconCompatParcelizer()) {
                    return boolValueOf;
                }
                return null;
            }
            return Boolean.TRUE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass4(_handleSpillOverflow _handlespilloverflow, _handleSpillOverflow _handlespilloverflow2, _handleSpillOverflow _handlespilloverflow3, int i, getAnswerMap<? super _handleSpillOverflow, Boolean> getanswermap) {
            super(1);
            this.$read = _handlespilloverflow;
            this.$RemoteActionCompatParcelizer = _handlespilloverflow2;
            this.$write = _handlespilloverflow3;
            this.$IconCompatParcelizer = i;
            this.$AudioAttributesCompatParcelizer = getanswermap;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean RemoteActionCompatParcelizer(_handleSpillOverflow _handlespilloverflow, _handleSpillOverflow _handlespilloverflow2, int i, getAnswerMap<? super _handleSpillOverflow, Boolean> getanswermap) {
        if (_handlespilloverflow.AudioAttributesCompatParcelizer() != _addSymbol.write) {
            throw new IllegalStateException("This function should only be used within a parent that has focus.".toString());
        }
        UTF32Reader uTF32Reader = new UTF32Reader(new _handleSpillOverflow[16], 0);
        _handleSpillOverflow _handlespilloverflow3 = _handlespilloverflow;
        int iWrite = _bind.write(1024);
        if (!_handlespilloverflow3.getRead().getRatingCompat()) {
            reportWrongTokenException.read("visitChildren called on an unattached node");
        }
        UTF32Reader uTF32Reader2 = new UTF32Reader(new _handleOddName.IconCompatParcelizer[16], 0);
        _handleOddName.IconCompatParcelizer audioAttributesImplBaseParcelizer = _handlespilloverflow3.getRead().getAudioAttributesImplBaseParcelizer();
        if (audioAttributesImplBaseParcelizer == null) {
            collectLongDefaults.read(uTF32Reader2, _handlespilloverflow3.getRead(), false);
        } else {
            uTF32Reader2.read(audioAttributesImplBaseParcelizer);
        }
        while (uTF32Reader2.getAudioAttributesCompatParcelizer() != 0) {
            _handleOddName.IconCompatParcelizer iconCompatParcelizerWrite = (_handleOddName.IconCompatParcelizer) uTF32Reader2.RemoteActionCompatParcelizer(uTF32Reader2.getAudioAttributesCompatParcelizer() - 1);
            if ((iconCompatParcelizerWrite.getRemoteActionCompatParcelizer() & iWrite) == 0) {
                collectLongDefaults.read(uTF32Reader2, iconCompatParcelizerWrite, false);
            } else {
                while (true) {
                    if (iconCompatParcelizerWrite == null) {
                        break;
                    }
                    if ((iconCompatParcelizerWrite.getWrite() & iWrite) != 0) {
                        UTF32Reader uTF32Reader3 = null;
                        while (iconCompatParcelizerWrite != null) {
                            if (iconCompatParcelizerWrite instanceof _handleSpillOverflow) {
                                uTF32Reader.read((_handleSpillOverflow) iconCompatParcelizerWrite);
                            } else if ((iconCompatParcelizerWrite.getWrite() & iWrite) != 0 && (iconCompatParcelizerWrite instanceof addAbstractTypeResolver)) {
                                int i2 = 0;
                                for (_handleOddName.IconCompatParcelizer iconCompatParcelizer = ((addAbstractTypeResolver) iconCompatParcelizerWrite).getIconCompatParcelizer(); iconCompatParcelizer != null; iconCompatParcelizer = iconCompatParcelizer.getAudioAttributesImplBaseParcelizer()) {
                                    if ((iconCompatParcelizer.getWrite() & iWrite) != 0) {
                                        i2++;
                                        if (i2 == 1) {
                                            iconCompatParcelizerWrite = iconCompatParcelizer;
                                        } else {
                                            if (uTF32Reader3 == null) {
                                                uTF32Reader3 = new UTF32Reader(new _handleOddName.IconCompatParcelizer[16], 0);
                                            }
                                            if (iconCompatParcelizerWrite != null) {
                                                if (uTF32Reader3 != null) {
                                                    uTF32Reader3.read(iconCompatParcelizerWrite);
                                                }
                                                iconCompatParcelizerWrite = null;
                                            }
                                            if (uTF32Reader3 != null) {
                                                uTF32Reader3.read(iconCompatParcelizer);
                                            }
                                        }
                                    }
                                }
                                if (i2 != 1) {
                                }
                            }
                            iconCompatParcelizerWrite = collectLongDefaults.write((UTF32Reader<_handleOddName.IconCompatParcelizer>) uTF32Reader3);
                        }
                    } else {
                        iconCompatParcelizerWrite = iconCompatParcelizerWrite.getAudioAttributesImplBaseParcelizer();
                    }
                }
            }
        }
        uTF32Reader.AudioAttributesCompatParcelizer((Comparator) ResolvedType.IconCompatParcelizer);
        if (!_checkNeedForRehash.IconCompatParcelizer(i, _checkNeedForRehash.INSTANCE.write())) {
            if (!_checkNeedForRehash.IconCompatParcelizer(i, _checkNeedForRehash.INSTANCE.AudioAttributesImplBaseParcelizer())) {
                throw new IllegalStateException("This function should only be used for 1-D focus search".toString());
            }
            newEncryptedObject newencryptedobjectIconCompatParcelizer = getQues.IconCompatParcelizer(0, uTF32Reader.getAudioAttributesCompatParcelizer());
            int read = newencryptedobjectIconCompatParcelizer.getRead();
            int audioAttributesCompatParcelizer = newencryptedobjectIconCompatParcelizer.getAudioAttributesCompatParcelizer();
            if (read <= audioAttributesCompatParcelizer) {
                boolean z = false;
                while (true) {
                    if (z) {
                        _handleSpillOverflow _handlespilloverflow4 = (_handleSpillOverflow) uTF32Reader.IconCompatParcelizer[audioAttributesCompatParcelizer];
                        if (_hashToIndex.AudioAttributesCompatParcelizer(_handlespilloverflow4) && write(_handlespilloverflow4, getanswermap)) {
                            return true;
                        }
                    }
                    if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(uTF32Reader.IconCompatParcelizer[audioAttributesCompatParcelizer], _handlespilloverflow2)) {
                        z = true;
                    }
                    if (audioAttributesCompatParcelizer == read) {
                        break;
                    }
                    audioAttributesCompatParcelizer--;
                }
            }
        } else {
            newEncryptedObject newencryptedobjectIconCompatParcelizer2 = getQues.IconCompatParcelizer(0, uTF32Reader.getAudioAttributesCompatParcelizer());
            int read2 = newencryptedobjectIconCompatParcelizer2.getRead();
            int audioAttributesCompatParcelizer2 = newencryptedobjectIconCompatParcelizer2.getAudioAttributesCompatParcelizer();
            if (read2 <= audioAttributesCompatParcelizer2) {
                boolean z2 = false;
                while (true) {
                    if (z2) {
                        _handleSpillOverflow _handlespilloverflow5 = (_handleSpillOverflow) uTF32Reader.IconCompatParcelizer[read2];
                        if (_hashToIndex.AudioAttributesCompatParcelizer(_handlespilloverflow5) && AudioAttributesCompatParcelizer(_handlespilloverflow5, getanswermap)) {
                            return true;
                        }
                    }
                    if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(uTF32Reader.IconCompatParcelizer[read2], _handlespilloverflow2)) {
                        z2 = true;
                    }
                    if (read2 == audioAttributesCompatParcelizer2) {
                        break;
                    }
                    read2++;
                }
            }
        }
        if (_checkNeedForRehash.IconCompatParcelizer(i, _checkNeedForRehash.INSTANCE.write()) || !_handlespilloverflow.read().getIconCompatParcelizer() || IconCompatParcelizer(_handlespilloverflow)) {
            return false;
        }
        return getanswermap.invoke(_handlespilloverflow).booleanValue();
    }

    private static final boolean IconCompatParcelizer(_handleSpillOverflow _handlespilloverflow) {
        _handleOddName.IconCompatParcelizer iconCompatParcelizer;
        ObjectReader objectReader;
        _handleSpillOverflow _handlespilloverflow2 = _handlespilloverflow;
        int iWrite = _bind.write(1024);
        if (!_handlespilloverflow2.getRead().getRatingCompat()) {
            reportWrongTokenException.read("visitAncestors called on an unattached node");
        }
        _handleOddName.IconCompatParcelizer mediaBrowserCompatItemReceiver = _handlespilloverflow2.getRead().getMediaBrowserCompatItemReceiver();
        _assertNotNull _assertnotnullAudioAttributesImplApi26Parcelizer = collectLongDefaults.AudioAttributesImplApi26Parcelizer(_handlespilloverflow2);
        loop0: while (true) {
            iconCompatParcelizer = null;
            if (_assertnotnullAudioAttributesImplApi26Parcelizer == null) {
                break;
            }
            if ((_assertnotnullAudioAttributesImplApi26Parcelizer.get_init_lambda2().getAudioAttributesImplApi21Parcelizer().getRemoteActionCompatParcelizer() & iWrite) != 0) {
                while (mediaBrowserCompatItemReceiver != null) {
                    if ((mediaBrowserCompatItemReceiver.getWrite() & iWrite) != 0) {
                        _handleOddName.IconCompatParcelizer iconCompatParcelizerWrite = mediaBrowserCompatItemReceiver;
                        UTF32Reader uTF32Reader = null;
                        while (iconCompatParcelizerWrite != null) {
                            if (iconCompatParcelizerWrite instanceof _handleSpillOverflow) {
                                iconCompatParcelizer = iconCompatParcelizerWrite;
                                break loop0;
                            }
                            if ((iconCompatParcelizerWrite.getWrite() & iWrite) != 0 && (iconCompatParcelizerWrite instanceof addAbstractTypeResolver)) {
                                int i = 0;
                                for (_handleOddName.IconCompatParcelizer iconCompatParcelizer2 = ((addAbstractTypeResolver) iconCompatParcelizerWrite).getIconCompatParcelizer(); iconCompatParcelizer2 != null; iconCompatParcelizer2 = iconCompatParcelizer2.getAudioAttributesImplBaseParcelizer()) {
                                    if ((iconCompatParcelizer2.getWrite() & iWrite) != 0) {
                                        i++;
                                        if (i == 1) {
                                            iconCompatParcelizerWrite = iconCompatParcelizer2;
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
                                                uTF32Reader.read(iconCompatParcelizer2);
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
        return iconCompatParcelizer == null;
    }

    private static final boolean read(_handleSpillOverflow _handlespilloverflow, getAnswerMap<? super _handleSpillOverflow, Boolean> getanswermap) {
        UTF32Reader uTF32Reader = new UTF32Reader(new _handleSpillOverflow[16], 0);
        _handleSpillOverflow _handlespilloverflow2 = _handlespilloverflow;
        int iWrite = _bind.write(1024);
        if (!_handlespilloverflow2.getRead().getRatingCompat()) {
            reportWrongTokenException.read("visitChildren called on an unattached node");
        }
        UTF32Reader uTF32Reader2 = new UTF32Reader(new _handleOddName.IconCompatParcelizer[16], 0);
        _handleOddName.IconCompatParcelizer audioAttributesImplBaseParcelizer = _handlespilloverflow2.getRead().getAudioAttributesImplBaseParcelizer();
        if (audioAttributesImplBaseParcelizer == null) {
            collectLongDefaults.read(uTF32Reader2, _handlespilloverflow2.getRead(), false);
        } else {
            uTF32Reader2.read(audioAttributesImplBaseParcelizer);
        }
        while (uTF32Reader2.getAudioAttributesCompatParcelizer() != 0) {
            _handleOddName.IconCompatParcelizer iconCompatParcelizerWrite = (_handleOddName.IconCompatParcelizer) uTF32Reader2.RemoteActionCompatParcelizer(uTF32Reader2.getAudioAttributesCompatParcelizer() - 1);
            if ((iconCompatParcelizerWrite.getRemoteActionCompatParcelizer() & iWrite) == 0) {
                collectLongDefaults.read(uTF32Reader2, iconCompatParcelizerWrite, false);
            } else {
                while (true) {
                    if (iconCompatParcelizerWrite == null) {
                        break;
                    }
                    if ((iconCompatParcelizerWrite.getWrite() & iWrite) != 0) {
                        UTF32Reader uTF32Reader3 = null;
                        while (iconCompatParcelizerWrite != null) {
                            if (iconCompatParcelizerWrite instanceof _handleSpillOverflow) {
                                uTF32Reader.read((_handleSpillOverflow) iconCompatParcelizerWrite);
                            } else if ((iconCompatParcelizerWrite.getWrite() & iWrite) != 0 && (iconCompatParcelizerWrite instanceof addAbstractTypeResolver)) {
                                int i = 0;
                                for (_handleOddName.IconCompatParcelizer iconCompatParcelizer = ((addAbstractTypeResolver) iconCompatParcelizerWrite).getIconCompatParcelizer(); iconCompatParcelizer != null; iconCompatParcelizer = iconCompatParcelizer.getAudioAttributesImplBaseParcelizer()) {
                                    if ((iconCompatParcelizer.getWrite() & iWrite) != 0) {
                                        i++;
                                        if (i == 1) {
                                            iconCompatParcelizerWrite = iconCompatParcelizer;
                                        } else {
                                            if (uTF32Reader3 == null) {
                                                uTF32Reader3 = new UTF32Reader(new _handleOddName.IconCompatParcelizer[16], 0);
                                            }
                                            if (iconCompatParcelizerWrite != null) {
                                                if (uTF32Reader3 != null) {
                                                    uTF32Reader3.read(iconCompatParcelizerWrite);
                                                }
                                                iconCompatParcelizerWrite = null;
                                            }
                                            if (uTF32Reader3 != null) {
                                                uTF32Reader3.read(iconCompatParcelizer);
                                            }
                                        }
                                    }
                                }
                                if (i != 1) {
                                }
                            }
                            iconCompatParcelizerWrite = collectLongDefaults.write((UTF32Reader<_handleOddName.IconCompatParcelizer>) uTF32Reader3);
                        }
                    } else {
                        iconCompatParcelizerWrite = iconCompatParcelizerWrite.getAudioAttributesImplBaseParcelizer();
                    }
                }
            }
        }
        uTF32Reader.AudioAttributesCompatParcelizer((Comparator) ResolvedType.IconCompatParcelizer);
        Object[] objArr = uTF32Reader.IconCompatParcelizer;
        int audioAttributesCompatParcelizer = uTF32Reader.getAudioAttributesCompatParcelizer();
        for (int i2 = 0; i2 < audioAttributesCompatParcelizer; i2++) {
            _handleSpillOverflow _handlespilloverflow3 = (_handleSpillOverflow) objArr[i2];
            if (_hashToIndex.AudioAttributesCompatParcelizer(_handlespilloverflow3) && AudioAttributesCompatParcelizer(_handlespilloverflow3, getanswermap)) {
                return true;
            }
        }
        return false;
    }

    private static final boolean IconCompatParcelizer(_handleSpillOverflow _handlespilloverflow, getAnswerMap<? super _handleSpillOverflow, Boolean> getanswermap) {
        UTF32Reader uTF32Reader = new UTF32Reader(new _handleSpillOverflow[16], 0);
        _handleSpillOverflow _handlespilloverflow2 = _handlespilloverflow;
        int iWrite = _bind.write(1024);
        if (!_handlespilloverflow2.getRead().getRatingCompat()) {
            reportWrongTokenException.read("visitChildren called on an unattached node");
        }
        UTF32Reader uTF32Reader2 = new UTF32Reader(new _handleOddName.IconCompatParcelizer[16], 0);
        _handleOddName.IconCompatParcelizer audioAttributesImplBaseParcelizer = _handlespilloverflow2.getRead().getAudioAttributesImplBaseParcelizer();
        if (audioAttributesImplBaseParcelizer == null) {
            collectLongDefaults.read(uTF32Reader2, _handlespilloverflow2.getRead(), false);
        } else {
            uTF32Reader2.read(audioAttributesImplBaseParcelizer);
        }
        while (uTF32Reader2.getAudioAttributesCompatParcelizer() != 0) {
            _handleOddName.IconCompatParcelizer iconCompatParcelizerWrite = (_handleOddName.IconCompatParcelizer) uTF32Reader2.RemoteActionCompatParcelizer(uTF32Reader2.getAudioAttributesCompatParcelizer() - 1);
            if ((iconCompatParcelizerWrite.getRemoteActionCompatParcelizer() & iWrite) == 0) {
                collectLongDefaults.read(uTF32Reader2, iconCompatParcelizerWrite, false);
            } else {
                while (true) {
                    if (iconCompatParcelizerWrite == null) {
                        break;
                    }
                    if ((iconCompatParcelizerWrite.getWrite() & iWrite) != 0) {
                        UTF32Reader uTF32Reader3 = null;
                        while (iconCompatParcelizerWrite != null) {
                            if (iconCompatParcelizerWrite instanceof _handleSpillOverflow) {
                                uTF32Reader.read((_handleSpillOverflow) iconCompatParcelizerWrite);
                            } else if ((iconCompatParcelizerWrite.getWrite() & iWrite) != 0 && (iconCompatParcelizerWrite instanceof addAbstractTypeResolver)) {
                                int i = 0;
                                for (_handleOddName.IconCompatParcelizer iconCompatParcelizer = ((addAbstractTypeResolver) iconCompatParcelizerWrite).getIconCompatParcelizer(); iconCompatParcelizer != null; iconCompatParcelizer = iconCompatParcelizer.getAudioAttributesImplBaseParcelizer()) {
                                    if ((iconCompatParcelizer.getWrite() & iWrite) != 0) {
                                        i++;
                                        if (i == 1) {
                                            iconCompatParcelizerWrite = iconCompatParcelizer;
                                        } else {
                                            if (uTF32Reader3 == null) {
                                                uTF32Reader3 = new UTF32Reader(new _handleOddName.IconCompatParcelizer[16], 0);
                                            }
                                            if (iconCompatParcelizerWrite != null) {
                                                if (uTF32Reader3 != null) {
                                                    uTF32Reader3.read(iconCompatParcelizerWrite);
                                                }
                                                iconCompatParcelizerWrite = null;
                                            }
                                            if (uTF32Reader3 != null) {
                                                uTF32Reader3.read(iconCompatParcelizer);
                                            }
                                        }
                                    }
                                }
                                if (i != 1) {
                                }
                            }
                            iconCompatParcelizerWrite = collectLongDefaults.write((UTF32Reader<_handleOddName.IconCompatParcelizer>) uTF32Reader3);
                        }
                    } else {
                        iconCompatParcelizerWrite = iconCompatParcelizerWrite.getAudioAttributesImplBaseParcelizer();
                    }
                }
            }
        }
        uTF32Reader.AudioAttributesCompatParcelizer((Comparator) ResolvedType.IconCompatParcelizer);
        int audioAttributesCompatParcelizer = uTF32Reader.getAudioAttributesCompatParcelizer() - 1;
        Object[] objArr = uTF32Reader.IconCompatParcelizer;
        if (audioAttributesCompatParcelizer < objArr.length) {
            while (audioAttributesCompatParcelizer >= 0) {
                _handleSpillOverflow _handlespilloverflow3 = (_handleSpillOverflow) objArr[audioAttributesCompatParcelizer];
                if (_hashToIndex.AudioAttributesCompatParcelizer(_handlespilloverflow3) && write(_handlespilloverflow3, getanswermap)) {
                    return true;
                }
                audioAttributesCompatParcelizer--;
            }
        }
        return false;
    }
}
