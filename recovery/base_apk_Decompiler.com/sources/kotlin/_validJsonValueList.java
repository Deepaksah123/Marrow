package kotlin;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0004\u001a\r\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a-\u0010\n\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a\r\u0010\f\u001a\u00020\t¢\u0006\u0004\b\f\u0010\r\u001a\u001b\u0010\u0010\u001a\u00020\t*\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0017\u0010\u0010\u001a\u00020\u00122\u0006\u0010\u0004\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u0010\u0010\u0013\u001a\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\n\u0010\u0014\u001a5\u0010\u0010\u001a\u00020\u00182\u0006\u0010\u0004\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u00162\u0006\u0010\u0006\u001a\u00020\u000e2\f\u0010\b\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0017H\u0000¢\u0006\u0004\b\u0010\u0010\u0019\"\u0018\u0010\u001b\u001a\u00020\u0003*\u00020\u000e8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u001a\"\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u001d\"\u001c\u0010 \u001a\u00020\u001f8\u0001@\u0000X\u0081\f¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u001e\u0010\"\"\u001a\u0010\u0010\u001a\u00020#8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\n\u0010$\u001a\u0004\b\u0010\u0010%\"\u001a\u0010\n\u001a\u00020#8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u001b\u0010$\u001a\u0004\b\n\u0010%\"\u001a\u0010\f\u001a\u00020#8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u001e\u0010$\u001a\u0004\b\u001b\u0010%\"\u0014\u0010&\u001a\u00020#8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\f\u0010$\"\u001a\u0010'\u001a\u00020#8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0001\u0010$\u001a\u0004\b \u0010%\"\u001a\u0010\u0001\u001a\u00020#8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b&\u0010$\u001a\u0004\b&\u0010%"}, d2 = {"", "AudioAttributesImplApi26Parcelizer", "()Z", "", "p0", "p1", "p2", "", "p3", "", "AudioAttributesCompatParcelizer", "(IIILjava/lang/String;)V", "AudioAttributesImplApi21Parcelizer", "()V", "Lo/setEncoding;", "Lo/allocConcatBuffer;", "RemoteActionCompatParcelizer", "(Lo/setEncoding;Lo/allocConcatBuffer;)V", "", "(Ljava/lang/String;)Ljava/lang/Void;", "(Ljava/lang/String;)V", "Lo/_reportMissingRootWS;", "Lo/getFilter;", "Lo/_closeInput;", "Lo/checkValue;", "(Lo/_reportMissingRootWS;Lo/getFilter;Lo/setEncoding;Lo/_closeInput;)Lo/checkValue;", "(Lo/setEncoding;)I", "read", "Lo/_longIntegerDesc;", "Lo/_longIntegerDesc;", "write", "Lo/getDupDetector;", "IconCompatParcelizer", "I", "()I", "", "Ljava/lang/Object;", "()Ljava/lang/Object;", "MediaBrowserCompatItemReceiver", "AudioAttributesImplBaseParcelizer"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class _validJsonValueList {
    private static _longIntegerDesc RemoteActionCompatParcelizer;
    private static int IconCompatParcelizer = getDupDetector.INSTANCE.RemoteActionCompatParcelizer();
    private static final Object AudioAttributesCompatParcelizer = new BigIntegerParser("provider");
    private static final Object read = new BigIntegerParser("provider");
    private static final Object write = new BigIntegerParser("compositionLocalMap");
    private static final Object AudioAttributesImplApi21Parcelizer = new BigIntegerParser("providerValues");
    private static final Object AudioAttributesImplApi26Parcelizer = new BigIntegerParser("providers");
    private static final Object MediaBrowserCompatItemReceiver = new BigIntegerParser("reference");

    /* JADX INFO: Access modifiers changed from: private */
    public static final int RemoteActionCompatParcelizer(setEncoding setencoding) {
        return setencoding.getAudioAttributesImplApi26Parcelizer() + setencoding.AudioAttributesImplBaseParcelizer(setencoding.getAudioAttributesImplApi26Parcelizer());
    }

    public static final int write() {
        return IconCompatParcelizer;
    }

    public static final boolean AudioAttributesImplApi26Parcelizer() {
        _longIntegerDesc _longintegerdesc = RemoteActionCompatParcelizer;
        return _longintegerdesc != null && _longintegerdesc.read();
    }

    public static final void AudioAttributesCompatParcelizer(int i, int i2, int i3, String str) {
        _longIntegerDesc _longintegerdesc = RemoteActionCompatParcelizer;
        if (_longintegerdesc != null) {
            _longintegerdesc.write(i, i2, i3, str);
        }
    }

    public static final void AudioAttributesImplApi21Parcelizer() {
        _longIntegerDesc _longintegerdesc = RemoteActionCompatParcelizer;
        if (_longintegerdesc != null) {
            _longintegerdesc.write();
        }
    }

    public static final void RemoteActionCompatParcelizer(setEncoding setencoding, final allocConcatBuffer allocconcatbuffer) {
        setencoding.AudioAttributesCompatParcelizer(setencoding.getAudioAttributesImplApi26Parcelizer(), new MagicModuleSubmissionRequestBody() { // from class: o._validJsonTokenList
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return _validJsonValueList.IconCompatParcelizer(allocconcatbuffer, ((Integer) obj).intValue(), obj2);
            }
        });
        setencoding.MediaBrowserCompatSearchResultReceiver();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup IconCompatParcelizer(allocConcatBuffer allocconcatbuffer, int i, Object obj) {
        if (obj instanceof _getByteArrayBuilder) {
            allocconcatbuffer.read((_getByteArrayBuilder) obj);
        }
        if (obj instanceof constructReadConstrainedTextBuffer) {
            allocconcatbuffer.AudioAttributesCompatParcelizer((constructReadConstrainedTextBuffer) obj);
        }
        if (obj instanceof rawReference) {
            ((rawReference) obj).MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
        }
        return getShowPopup.INSTANCE;
    }

    public static final Object RemoteActionCompatParcelizer() {
        return AudioAttributesCompatParcelizer;
    }

    public static final Object AudioAttributesCompatParcelizer() {
        return read;
    }

    public static final Object read() {
        return write;
    }

    public static final Object IconCompatParcelizer() {
        return AudioAttributesImplApi26Parcelizer;
    }

    public static final Object MediaBrowserCompatItemReceiver() {
        return MediaBrowserCompatItemReceiver;
    }

    public static final Void RemoteActionCompatParcelizer(String str) {
        StringBuilder sb = new StringBuilder("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (");
        sb.append(str);
        sb.append("). Please report to Google or use https://goo.gle/compose-feedback");
        throw new _getNumberFloat(sb.toString());
    }

    public static final void AudioAttributesCompatParcelizer(String str) {
        StringBuilder sb = new StringBuilder("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (");
        sb.append(str);
        sb.append("). Please report to Google or use https://goo.gle/compose-feedback");
        throw new _getNumberFloat(sb.toString());
    }

    public static final checkValue RemoteActionCompatParcelizer(_reportMissingRootWS _reportmissingrootws, getFilter getfilter, setEncoding setencoding, _closeInput<?> _closeinput) {
        releaseTokenBuffer releasetokenbuffer;
        ArrayList arrayListRemoteActionCompatParcelizer;
        setKeyListener setkeylistener;
        long[] jArr;
        int i;
        releaseTokenBuffer releasetokenbuffer2;
        int i2;
        setKeyListener setkeylistener2;
        long[] jArr2;
        int i3;
        int i4;
        long j;
        int i5;
        int i6;
        int i7;
        setKeyListener setkeylistener3;
        long[] jArr3;
        Object[] objArr;
        long[] jArr4;
        Object[] objArr2;
        setKeyListener setkeylistener4;
        int i8;
        int iAudioAttributesImplBaseParcelizer;
        getFilter getfilter2 = getfilter;
        releaseTokenBuffer releasetokenbuffer3 = new releaseTokenBuffer();
        if (setencoding.MediaBrowserCompatItemReceiver()) {
            releasetokenbuffer3.write();
        }
        if (setencoding.read()) {
            releasetokenbuffer3.IconCompatParcelizer();
        }
        int audioAttributesImplApi26Parcelizer = setencoding.getAudioAttributesImplApi26Parcelizer();
        if (_closeinput != null && setencoding.handleMediaPlayPauseIfPendingOnHandler(audioAttributesImplApi26Parcelizer) > 0) {
            int onCommand = setencoding.getOnCommand();
            while (onCommand > 0 && !setencoding.MediaMetadataCompat(onCommand)) {
                onCommand = setencoding.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(onCommand);
            }
            if (onCommand >= 0 && setencoding.MediaMetadataCompat(onCommand)) {
                Object objOnCustomAction = setencoding.onCustomAction(onCommand);
                int i9 = onCommand + 1;
                int iAudioAttributesImplBaseParcelizer2 = setencoding.AudioAttributesImplBaseParcelizer(onCommand);
                int iHandleMediaPlayPauseIfPendingOnHandler = 0;
                while (i9 < onCommand + iAudioAttributesImplBaseParcelizer2 && (iAudioAttributesImplBaseParcelizer = setencoding.AudioAttributesImplBaseParcelizer(i9) + i9) <= audioAttributesImplApi26Parcelizer) {
                    iHandleMediaPlayPauseIfPendingOnHandler += setencoding.MediaMetadataCompat(i9) ? 1 : setencoding.handleMediaPlayPauseIfPendingOnHandler(i9);
                    i9 = iAudioAttributesImplBaseParcelizer;
                }
                int iHandleMediaPlayPauseIfPendingOnHandler2 = setencoding.MediaMetadataCompat(audioAttributesImplApi26Parcelizer) ? 1 : setencoding.handleMediaPlayPauseIfPendingOnHandler(audioAttributesImplApi26Parcelizer);
                _closeinput.AudioAttributesCompatParcelizer(objOnCustomAction);
                _closeinput.AudioAttributesCompatParcelizer(iHandleMediaPlayPauseIfPendingOnHandler, iHandleMediaPlayPauseIfPendingOnHandler2);
                _closeinput.IconCompatParcelizer();
            }
        }
        _parseSlowFloat write2 = getfilter.getWrite();
        if (write2.write()) {
            toMagicModuleMetaRepoModel.read(_reportmissingrootws, "");
            getTokenLineNr gettokenlinenr = (getTokenLineNr) _reportmissingrootws;
            if (getAndClear.RemoteActionCompatParcelizer(gettokenlinenr.MediaDescriptionCompat) > 0) {
                arrayListRemoteActionCompatParcelizer = new ArrayList();
                setKeyListener setkeylistener5 = gettokenlinenr.MediaDescriptionCompat;
                long[] jArr5 = setkeylistener5.RemoteActionCompatParcelizer;
                int length = jArr5.length - 2;
                if (length >= 0) {
                    int i10 = 0;
                    while (true) {
                        long j2 = jArr5[i10];
                        if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i11 = 8;
                            int i12 = 8 - ((~(i10 - length)) >>> 31);
                            int i13 = 0;
                            while (i13 < i12) {
                                if ((j2 & 255) < 128) {
                                    int i14 = (i10 << 3) + i13;
                                    jArr2 = jArr5;
                                    Object obj = setkeylistener5.IconCompatParcelizer[i14];
                                    Object obj2 = setkeylistener5.MediaBrowserCompatItemReceiver[i14];
                                    toMagicModuleMetaRepoModel.read(obj, "");
                                    releasetokenbuffer2 = releasetokenbuffer3;
                                    if (obj2 instanceof setEmojiCompatEnabled) {
                                        toMagicModuleMetaRepoModel.read(obj2, "");
                                        setEmojiCompatEnabled setemojicompatenabled = (setEmojiCompatEnabled) obj2;
                                        Object[] objArr3 = setemojicompatenabled.write;
                                        long[] jArr6 = setemojicompatenabled.AudioAttributesCompatParcelizer;
                                        i3 = length;
                                        int length2 = jArr6.length - 2;
                                        if (length2 >= 0) {
                                            i4 = i10;
                                            j = j2;
                                            int i15 = 0;
                                            while (true) {
                                                long j3 = jArr6[i15];
                                                i2 = i12;
                                                i7 = i14;
                                                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                    int i16 = 8 - ((~(i15 - length2)) >>> 31);
                                                    int i17 = 0;
                                                    while (i17 < i16) {
                                                        if ((j3 & 255) < 128) {
                                                            jArr4 = jArr6;
                                                            int i18 = (i15 << 3) + i17;
                                                            i8 = i13;
                                                            Object obj3 = objArr3[i18];
                                                            objArr2 = objArr3;
                                                            rawReference rawreference = (rawReference) obj;
                                                            setkeylistener4 = setkeylistener5;
                                                            _parseSlowFloat remoteActionCompatParcelizer = rawreference.getRemoteActionCompatParcelizer();
                                                            if (remoteActionCompatParcelizer != null && setencoding.IconCompatParcelizer(write2, remoteActionCompatParcelizer)) {
                                                                arrayListRemoteActionCompatParcelizer.add(setAction.write(rawreference, obj3));
                                                                setemojicompatenabled.read(i18);
                                                            }
                                                        } else {
                                                            jArr4 = jArr6;
                                                            objArr2 = objArr3;
                                                            setkeylistener4 = setkeylistener5;
                                                            i8 = i13;
                                                        }
                                                        j3 >>= 8;
                                                        i17++;
                                                        i13 = i8;
                                                        jArr6 = jArr4;
                                                        objArr3 = objArr2;
                                                        setkeylistener5 = setkeylistener4;
                                                    }
                                                    jArr3 = jArr6;
                                                    objArr = objArr3;
                                                    setkeylistener3 = setkeylistener5;
                                                    i5 = i13;
                                                    if (i16 != 8) {
                                                        break;
                                                    }
                                                } else {
                                                    jArr3 = jArr6;
                                                    objArr = objArr3;
                                                    setkeylistener3 = setkeylistener5;
                                                    i5 = i13;
                                                }
                                                if (i15 == length2) {
                                                    break;
                                                }
                                                i15++;
                                                i12 = i2;
                                                i14 = i7;
                                                i13 = i5;
                                                jArr6 = jArr3;
                                                objArr3 = objArr;
                                                setkeylistener5 = setkeylistener3;
                                            }
                                        } else {
                                            i2 = i12;
                                            i7 = i14;
                                            setkeylistener3 = setkeylistener5;
                                            i4 = i10;
                                            j = j2;
                                            i5 = i13;
                                        }
                                        if (setemojicompatenabled.IconCompatParcelizer()) {
                                            setkeylistener2 = setkeylistener3;
                                            setkeylistener2.AudioAttributesCompatParcelizer(i7);
                                        } else {
                                            setkeylistener2 = setkeylistener3;
                                        }
                                    } else {
                                        i2 = i12;
                                        i7 = i14;
                                        setkeylistener3 = setkeylistener5;
                                        i3 = length;
                                        i4 = i10;
                                        j = j2;
                                        i5 = i13;
                                        toMagicModuleMetaRepoModel.read(obj2, "");
                                        rawReference rawreference2 = (rawReference) obj;
                                        _parseSlowFloat remoteActionCompatParcelizer2 = rawreference2.getRemoteActionCompatParcelizer();
                                        if (remoteActionCompatParcelizer2 != null && setencoding.IconCompatParcelizer(write2, remoteActionCompatParcelizer2)) {
                                            arrayListRemoteActionCompatParcelizer.add(setAction.write(rawreference2, obj2));
                                            setkeylistener2 = setkeylistener3;
                                            setkeylistener2.AudioAttributesCompatParcelizer(i7);
                                        }
                                        setkeylistener2 = setkeylistener3;
                                    }
                                    i6 = 8;
                                } else {
                                    releasetokenbuffer2 = releasetokenbuffer3;
                                    i2 = i12;
                                    setkeylistener2 = setkeylistener5;
                                    jArr2 = jArr5;
                                    i3 = length;
                                    i4 = i10;
                                    j = j2;
                                    i5 = i13;
                                    i6 = i11;
                                }
                                j2 = j >> i6;
                                i13 = i5 + 1;
                                setkeylistener5 = setkeylistener2;
                                i11 = i6;
                                jArr5 = jArr2;
                                releasetokenbuffer3 = releasetokenbuffer2;
                                length = i3;
                                i10 = i4;
                                i12 = i2;
                            }
                            releasetokenbuffer = releasetokenbuffer3;
                            setkeylistener = setkeylistener5;
                            jArr = jArr5;
                            int i19 = length;
                            int i20 = i10;
                            if (i12 != i11) {
                                break;
                            }
                            length = i19;
                            i = i20;
                        } else {
                            releasetokenbuffer = releasetokenbuffer3;
                            setkeylistener = setkeylistener5;
                            jArr = jArr5;
                            i = i10;
                        }
                        if (i == length) {
                            break;
                        }
                        i10 = i + 1;
                        setkeylistener5 = setkeylistener;
                        jArr5 = jArr;
                        releasetokenbuffer3 = releasetokenbuffer;
                    }
                } else {
                    releasetokenbuffer = releasetokenbuffer3;
                }
            } else {
                releasetokenbuffer = releasetokenbuffer3;
                arrayListRemoteActionCompatParcelizer = IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
            }
            getfilter2 = getfilter;
            getfilter2.IconCompatParcelizer(IntermediateLoginResponseBody.AudioAttributesCompatParcelizer((Collection) getfilter.write(), (Iterable) arrayListRemoteActionCompatParcelizer));
        } else {
            releasetokenbuffer = releasetokenbuffer3;
        }
        setEncoding setencodingOnAddQueueItem = releasetokenbuffer.onAddQueueItem();
        try {
            setencodingOnAddQueueItem.AudioAttributesCompatParcelizer();
            setencodingOnAddQueueItem.RemoteActionCompatParcelizer(126665345, getfilter.RemoteActionCompatParcelizer());
            setEncoding.write(setencodingOnAddQueueItem, 0, 1, (Object) null);
            setencodingOnAddQueueItem.AudioAttributesCompatParcelizer(getfilter.getIconCompatParcelizer());
            List<_parseSlowFloat> list = setencoding.read(getfilter.getWrite(), 1, setencodingOnAddQueueItem);
            setencodingOnAddQueueItem.onAddQueueItem();
            setencodingOnAddQueueItem.RemoteActionCompatParcelizer();
            setencodingOnAddQueueItem.write();
            setencodingOnAddQueueItem.read(true);
            releaseTokenBuffer releasetokenbuffer4 = releasetokenbuffer;
            checkValue checkvalue = new checkValue(releasetokenbuffer4);
            if (!rawReference.INSTANCE.RemoteActionCompatParcelizer(releasetokenbuffer4, list)) {
                return checkvalue;
            }
            IconCompatParcelizer iconCompatParcelizer = new IconCompatParcelizer(_reportmissingrootws, getfilter2);
            setencodingOnAddQueueItem = releasetokenbuffer4.onAddQueueItem();
            try {
                rawReference.INSTANCE.write(setencodingOnAddQueueItem, list, iconCompatParcelizer);
                getShowPopup getshowpopup = getShowPopup.INSTANCE;
                setencodingOnAddQueueItem.read(true);
                return checkvalue;
            } finally {
            }
        } finally {
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\n\u0018\u00002\u00020\u0001J!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\r"}, d2 = {"Lo/_validJsonValueList$IconCompatParcelizer;", "Lo/_append;", "Lo/rawReference;", "p0", "", "p1", "Lo/_includeScalar;", "AudioAttributesCompatParcelizer", "(Lo/rawReference;Ljava/lang/Object;)Lo/_includeScalar;", "", "RemoteActionCompatParcelizer", "(Lo/rawReference;)V", "IconCompatParcelizer", "(Ljava/lang/Object;)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class IconCompatParcelizer implements _append {
        final /* synthetic */ _reportMissingRootWS AudioAttributesCompatParcelizer;
        final /* synthetic */ getFilter IconCompatParcelizer;

        @Override // kotlin._append
        public final void IconCompatParcelizer(Object p0) {
        }

        @Override // kotlin._append
        public final void RemoteActionCompatParcelizer(rawReference p0) {
        }

        IconCompatParcelizer(_reportMissingRootWS _reportmissingrootws, getFilter getfilter) {
            this.AudioAttributesCompatParcelizer = _reportmissingrootws;
            this.IconCompatParcelizer = getfilter;
        }

        @Override // kotlin._append
        public final _includeScalar AudioAttributesCompatParcelizer(rawReference p0, Object p1) {
            _includeScalar _includescalarAudioAttributesCompatParcelizer;
            _reportMissingRootWS _reportmissingrootws = this.AudioAttributesCompatParcelizer;
            _append _appendVar = _reportmissingrootws instanceof _append ? (_append) _reportmissingrootws : null;
            if (_appendVar == null || (_includescalarAudioAttributesCompatParcelizer = _appendVar.AudioAttributesCompatParcelizer(p0, p1)) == null) {
                _includescalarAudioAttributesCompatParcelizer = _includeScalar.RemoteActionCompatParcelizer;
            }
            if (_includescalarAudioAttributesCompatParcelizer != _includeScalar.RemoteActionCompatParcelizer) {
                return _includescalarAudioAttributesCompatParcelizer;
            }
            getFilter getfilter = this.IconCompatParcelizer;
            getfilter.IconCompatParcelizer(IntermediateLoginResponseBody.read((Collection<? extends Pair>) getfilter.write(), setAction.write(p0, p1)));
            return _includeScalar.AudioAttributesCompatParcelizer;
        }
    }
}
