package kotlin;

import java.util.Map;
import kotlin.Metadata;
import kotlin._assertNotNull;
import kotlin._parser;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b \u0018\u0000 \t2\u00020\u00012\u00020\u00022\u00020\u0003:\u00024\tB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u000bH\u0086\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u000bH&¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\bH ¢\u0006\u0004\b\u0010\u0010\u0005J\u0013\u0010\u000f\u001a\u00020\b*\u00020\u0011H\u0004¢\u0006\u0004\b\u000f\u0010\u0012J\u001d\u0010\u000f\u001a\u00020\u00142\u0006\u0010\u0007\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u000f\u0010\u0016J\u001f\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u000f\u0010\u0018J\u0017\u0010\t\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\t\u0010\u0019J\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0013H\u0000¢\u0006\u0004\b\r\u0010\u001aJ]\u0010\r\u001a\u00020\"2\u0006\u0010\u0007\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\f2\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\u001b2\u0014\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\b\u0018\u00010\u001d2\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\b0\u001dH\u0016¢\u0006\u0004\b\r\u0010#J\u0019\u0010\u000f\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\"H\u0000¢\u0006\u0004\b\u000f\u0010$J+\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020%2\b\b\u0002\u0010\u0015\u001a\u00020&2\b\b\u0002\u0010\u001c\u001a\u00020'H\u0002¢\u0006\u0004\b\u000f\u0010(J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020%H\u0002¢\u0006\u0004\b\t\u0010)J#\u0010\u000f\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170+0*H\u0002¢\u0006\u0004\b\u000f\u0010,J\u001d\u0010-\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b-\u0010.R\u0014\u0010\u000f\u001a\u00020&8'X¦\u0004¢\u0006\u0006\u001a\u0004\b/\u00100R\u0016\u0010\r\u001a\u0004\u0018\u00010\u00008'X¦\u0004¢\u0006\u0006\u001a\u0004\b1\u00102R\u0016\u00104\u001a\u0004\u0018\u00010\u00008'X¦\u0004¢\u0006\u0006\u001a\u0004\b3\u00102R\u0014\u0010\t\u001a\u00020\u00068'X¦\u0004¢\u0006\u0006\u001a\u0004\b5\u00106R\u0014\u0010-\u001a\u00020\u00178'X¦\u0004¢\u0006\u0006\u001a\u0004\b7\u00108R\u0014\u0010<\u001a\u0002098'X¦\u0004¢\u0006\u0006\u001a\u0004\b:\u0010;R\u001c\u0010?\u001a\b\u0018\u00010=R\u00020\u00008\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\r\u0010>R$\u0010B\u001a\u0010\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\b\u0018\u00010\u001d8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\u0018\u0010D\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b-\u0010CR\"\u0010G\u001a\u00020\u00068\u0017@\u0017X\u0097\u000e¢\u0006\u0012\n\u0004\b4\u0010E\u001a\u0004\bF\u00106\"\u0004\b\r\u0010\nR\u0018\u0010J\u001a\u00060=R\u00020\u00008CX\u0082\u0004¢\u0006\u0006\u001a\u0004\bH\u0010IR\"\u0010H\u001a\u00020\u00068\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b?\u0010E\u001a\u0004\bK\u00106\"\u0004\b4\u0010\nR\u0014\u0010N\u001a\u00020\"8!X \u0004¢\u0006\u0006\u001a\u0004\bL\u0010MR\"\u0010@\u001a\u00020\u00068\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\bG\u0010E\u001a\u0004\bO\u00106\"\u0004\b-\u0010\nR\u001a\u0010S\u001a\u00020 8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bD\u0010P\u001a\u0004\bQ\u0010RR\u0014\u0010U\u001a\u00020\u00068WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bT\u00106R\u0018\u0010X\u001a\u0004\u0018\u00010V8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b<\u0010WR0\u00101\u001a\u001c\u0012\u0004\u0012\u00020\u0013\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170+0*\u0018\u00010Y8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bB\u0010Z"}, d2 = {"Lo/createDeserializationContext;", "Lo/_parser;", "Lo/getSerializationConfig;", "Lo/ObjectMapper1;", "<init>", "()V", "", "p0", "", "IconCompatParcelizer", "(Z)V", "Lo/weirdNumberException;", "", "AudioAttributesCompatParcelizer", "(Lo/weirdNumberException;)I", "write", "onRewind", "Lo/_bindAndClose;", "(Lo/_bindAndClose;)V", "Lo/asText;", "", "p1", "(Lo/asText;F)F", "Lo/_assertNotNull;", "(Lo/_assertNotNull;Lo/asText;)V", "(Lo/asText;)Lo/createDeserializationContext;", "(Lo/asText;)V", "", "p2", "Lkotlin/Function1;", "Lo/JsonNode;", "p3", "Lo/_parser$IconCompatParcelizer;", "p4", "Lo/withHandlersFrom;", "(IILjava/util/Map;Lo/getAnswerMap;Lo/getAnswerMap;)Lo/withHandlersFrom;", "(Lo/withHandlersFrom;)V", "Lo/ObjectWriterGeneratorSettings;", "Lo/hasReferringProperties;", "Lo/getKey;", "(Lo/ObjectWriterGeneratorSettings;JJ)V", "(Lo/ObjectWriterGeneratorSettings;)V", "Lo/setEmojiCompatEnabled;", "Lo/createForTypeOverride;", "(Lo/setEmojiCompatEnabled;)V", "RemoteActionCompatParcelizer", "(Lo/asText;F)V", "onPrepare", "()J", "onAddQueueItem", "()Lo/createDeserializationContext;", "onPlayFromMediaId", "read", "onPlay", "()Z", "onPause", "()Lo/_assertNotNull;", "Lo/isAbstract;", "onFastForward", "()Lo/isAbstract;", "AudioAttributesImplBaseParcelizer", "Lo/createDeserializationContext$read;", "Lo/createDeserializationContext$read;", "MediaBrowserCompatCustomActionResultReceiver", "MediaBrowserCompatMediaItem", "Lo/getAnswerMap;", "AudioAttributesImplApi21Parcelizer", "Lo/ObjectWriterGeneratorSettings;", "AudioAttributesImplApi26Parcelizer", "Z", "onPrepareFromMediaId", "MediaBrowserCompatItemReceiver", "RatingCompat", "()Lo/createDeserializationContext$read;", "MediaMetadataCompat", "onPlayFromSearch", "onMediaButtonEvent", "()Lo/withHandlersFrom;", "MediaBrowserCompatSearchResultReceiver", "onPlayFromUri", "Lo/_parser$IconCompatParcelizer;", "onPrepareFromSearch", "()Lo/_parser$IconCompatParcelizer;", "MediaDescriptionCompat", "r_", "handleMediaPlayPauseIfPendingOnHandler", "Lo/getMergeInfo;", "Lo/getMergeInfo;", "MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver", "Lo/setKeyListener;", "Lo/setKeyListener;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class createDeserializationContext extends _parser implements getSerializationConfig, ObjectMapper1 {
    private static final getAnswerMap<ObjectWriterGeneratorSettings, getShowPopup> write = AnonymousClass4.IconCompatParcelizer;

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private read MediaBrowserCompatCustomActionResultReceiver;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private setKeyListener<asText, setEmojiCompatEnabled<createForTypeOverride<_assertNotNull>>> onAddQueueItem;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private final _parser.IconCompatParcelizer MediaDescriptionCompat = fromUnexpectedIOE.write(this);

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private getMergeInfo MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private boolean RatingCompat;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private boolean MediaBrowserCompatMediaItem;

    /* JADX INFO: renamed from: MediaBrowserCompatMediaItem, reason: from kotlin metadata */
    private getAnswerMap<? super JsonNode, getShowPopup> AudioAttributesImplApi21Parcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private ObjectWriterGeneratorSettings AudioAttributesImplApi26Parcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private boolean MediaBrowserCompatItemReceiver;

    public abstract createDeserializationContext onAddQueueItem();

    public abstract isAbstract onFastForward();

    public abstract withHandlersFrom onMediaButtonEvent();

    /* JADX INFO: renamed from: onPause */
    public abstract _assertNotNull getIconCompatParcelizer();

    public abstract boolean onPlay();

    public abstract createDeserializationContext onPlayFromMediaId();

    /* JADX INFO: renamed from: onPrepare */
    public abstract long getOnPrepareFromSearch();

    public abstract void onRewind();

    @Override // kotlin.getValueHandler
    public boolean r_() {
        return false;
    }

    public abstract int write(weirdNumberException p0);

    public void AudioAttributesCompatParcelizer(boolean z) {
        this.MediaBrowserCompatItemReceiver = z;
    }

    /* JADX INFO: renamed from: onPrepareFromMediaId, reason: from getter */
    public boolean getMediaBrowserCompatItemReceiver() {
        return this.MediaBrowserCompatItemReceiver;
    }

    @Override // kotlin.ObjectMapper1
    public void IconCompatParcelizer(boolean p0) {
        createDeserializationContext createdeserializationcontextOnPlayFromMediaId = onPlayFromMediaId();
        _assertNotNull iconCompatParcelizer = createdeserializationcontextOnPlayFromMediaId != null ? createdeserializationcontextOnPlayFromMediaId.getIconCompatParcelizer() : null;
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(iconCompatParcelizer, getIconCompatParcelizer())) {
            AudioAttributesCompatParcelizer(p0);
            return;
        }
        if ((iconCompatParcelizer != null ? iconCompatParcelizer.onSkipToQueueItem() : null) != _assertNotNull.RemoteActionCompatParcelizer.read) {
            if ((iconCompatParcelizer != null ? iconCompatParcelizer.onSkipToQueueItem() : null) != _assertNotNull.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer) {
                return;
            }
        }
        AudioAttributesCompatParcelizer(p0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final read RatingCompat() {
        read readVar = this.MediaBrowserCompatCustomActionResultReceiver;
        if (readVar != null) {
            return readVar;
        }
        read readVar2 = new read();
        this.MediaBrowserCompatCustomActionResultReceiver = readVar2;
        return readVar2;
    }

    @Override // kotlin.withStaticTyping
    public final int AudioAttributesCompatParcelizer(weirdNumberException p0) {
        int iWrite;
        int iAudioAttributesCompatParcelizer;
        if (!onPlay() || (iWrite = write(p0)) == Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        if (p0 instanceof findValue) {
            iAudioAttributesCompatParcelizer = hasReferringProperties.IconCompatParcelizer(getAudioAttributesImplBaseParcelizer());
        } else {
            iAudioAttributesCompatParcelizer = hasReferringProperties.AudioAttributesCompatParcelizer(getAudioAttributesImplBaseParcelizer());
        }
        return iWrite + iAudioAttributesCompatParcelizer;
    }

    /* JADX INFO: renamed from: onPlayFromSearch, reason: from getter */
    public final boolean getRatingCompat() {
        return this.RatingCompat;
    }

    public final void read(boolean z) {
        this.RatingCompat = z;
    }

    public final void RemoteActionCompatParcelizer(boolean z) {
        this.MediaBrowserCompatMediaItem = z;
    }

    /* JADX INFO: renamed from: onPlayFromUri, reason: from getter */
    public final boolean getMediaBrowserCompatMediaItem() {
        return this.MediaBrowserCompatMediaItem;
    }

    /* JADX INFO: renamed from: onPrepareFromSearch, reason: from getter */
    public final _parser.IconCompatParcelizer getMediaDescriptionCompat() {
        return this.MediaDescriptionCompat;
    }

    protected final void write(_bindAndClose _bindandclose) {
        properties propertiesVarIconCompatParcelizer;
        _bindAndClose read2 = _bindandclose.getRead();
        if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(read2 != null ? read2.getIconCompatParcelizer() : null, _bindandclose.getIconCompatParcelizer())) {
            _bindandclose.onSetPlaybackSpeed().IconCompatParcelizer().AudioAttributesImplApi21Parcelizer();
            return;
        }
        KeyDeserializer keyDeserializerAudioAttributesCompatParcelizer = _bindandclose.onSetPlaybackSpeed().AudioAttributesCompatParcelizer();
        if (keyDeserializerAudioAttributesCompatParcelizer == null || (propertiesVarIconCompatParcelizer = keyDeserializerAudioAttributesCompatParcelizer.IconCompatParcelizer()) == null) {
            return;
        }
        propertiesVarIconCompatParcelizer.AudioAttributesImplApi21Parcelizer();
    }

    public final float write(asText p0, float p1) {
        if (this.MediaBrowserCompatMediaItem) {
            return p1;
        }
        createDeserializationContext createdeserializationcontext = this;
        while (true) {
            getMergeInfo getmergeinfo = createdeserializationcontext.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
            float fIconCompatParcelizer = getmergeinfo != null ? getmergeinfo.IconCompatParcelizer(p0, Float.NaN) : Float.NaN;
            if (!Float.isNaN(fIconCompatParcelizer)) {
                createdeserializationcontext.write(getIconCompatParcelizer(), p0);
                return p0.IconCompatParcelizer(fIconCompatParcelizer, createdeserializationcontext.onFastForward(), onFastForward());
            }
            createDeserializationContext createdeserializationcontextOnPlayFromMediaId = createdeserializationcontext.onPlayFromMediaId();
            if (createdeserializationcontextOnPlayFromMediaId == null) {
                createdeserializationcontext.write(getIconCompatParcelizer(), p0);
                return p1;
            }
            createdeserializationcontext = createdeserializationcontextOnPlayFromMediaId;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void write(_assertNotNull p0, asText p1) {
        int i;
        int i2;
        long[] jArr;
        int i3;
        long[] jArr2;
        int i4;
        int i5;
        int i6;
        Object[] objArr;
        long[] jArr3;
        Object[] objArr2;
        long[] jArr4;
        setKeyListener<asText, setEmojiCompatEnabled<createForTypeOverride<_assertNotNull>>> setkeylistener = this.onAddQueueItem;
        long j = 255;
        char c = 7;
        long j2 = -9187201950435737472L;
        int i7 = 8;
        if (setkeylistener != null) {
            setKeyListener<asText, setEmojiCompatEnabled<createForTypeOverride<_assertNotNull>>> setkeylistener2 = setkeylistener;
            Object[] objArr3 = setkeylistener2.MediaBrowserCompatItemReceiver;
            long[] jArr5 = setkeylistener2.RemoteActionCompatParcelizer;
            int length = jArr5.length - 2;
            if (length >= 0) {
                int i8 = 0;
                while (true) {
                    long j3 = jArr5[i8];
                    if ((((~j3) << c) & j3 & j2) != j2) {
                        int i9 = 8 - ((~(i8 - length)) >>> 31);
                        int i10 = 0;
                        while (i10 < i9) {
                            if ((j3 & j) < 128) {
                                setEmojiCompatEnabled setemojicompatenabled = (setEmojiCompatEnabled) objArr3[(i8 << 3) + i10];
                                Object[] objArr4 = setemojicompatenabled.write;
                                long[] jArr6 = setemojicompatenabled.AudioAttributesCompatParcelizer;
                                int length2 = jArr6.length - 2;
                                if (length2 >= 0) {
                                    jArr2 = jArr5;
                                    int i11 = 0;
                                    while (true) {
                                        long j4 = jArr6[i11];
                                        i4 = length;
                                        i5 = i8;
                                        if ((((~j4) << c) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i12 = 8 - ((~(i11 - length2)) >>> 31);
                                            int i13 = 0;
                                            while (i13 < i12) {
                                                if ((j4 & 255) < 128) {
                                                    int i14 = (i11 << 3) + i13;
                                                    _assertNotNull _assertnotnull = (_assertNotNull) ((createForTypeOverride) objArr4[i14]).get();
                                                    objArr2 = objArr4;
                                                    if (_assertnotnull != null) {
                                                        boolean zAudioAttributesImplApi26Parcelizer = _assertnotnull.AudioAttributesImplApi26Parcelizer();
                                                        jArr4 = jArr6;
                                                        if (zAudioAttributesImplApi26Parcelizer) {
                                                        }
                                                    } else {
                                                        jArr4 = jArr6;
                                                    }
                                                    setemojicompatenabled.read(i14);
                                                } else {
                                                    objArr2 = objArr4;
                                                    jArr4 = jArr6;
                                                }
                                                j4 >>= 8;
                                                i13++;
                                                jArr6 = jArr4;
                                                objArr4 = objArr2;
                                            }
                                            objArr = objArr4;
                                            jArr3 = jArr6;
                                            if (i12 != 8) {
                                                break;
                                            }
                                        } else {
                                            objArr = objArr4;
                                            jArr3 = jArr6;
                                        }
                                        if (i11 == length2) {
                                            break;
                                        }
                                        i11++;
                                        length = i4;
                                        i8 = i5;
                                        jArr6 = jArr3;
                                        objArr4 = objArr;
                                        c = 7;
                                    }
                                } else {
                                    jArr2 = jArr5;
                                    i4 = length;
                                    i5 = i8;
                                }
                                i6 = 8;
                            } else {
                                jArr2 = jArr5;
                                i4 = length;
                                i5 = i8;
                                i6 = i7;
                            }
                            j3 >>= i6;
                            i10++;
                            i7 = i6;
                            jArr5 = jArr2;
                            length = i4;
                            i8 = i5;
                            j = 255;
                            c = 7;
                        }
                        jArr = jArr5;
                        int i15 = length;
                        int i16 = i8;
                        if (i9 != i7) {
                            break;
                        }
                        length = i15;
                        i3 = i16;
                    } else {
                        jArr = jArr5;
                        i3 = i8;
                    }
                    if (i3 == length) {
                        break;
                    }
                    i8 = i3 + 1;
                    jArr5 = jArr;
                    j = 255;
                    c = 7;
                    j2 = -9187201950435737472L;
                    i7 = 8;
                }
            }
        }
        setKeyListener<asText, setEmojiCompatEnabled<createForTypeOverride<_assertNotNull>>> setkeylistener3 = this.onAddQueueItem;
        if (setkeylistener3 != null) {
            long[] jArr7 = setkeylistener3.RemoteActionCompatParcelizer;
            int length3 = jArr7.length - 2;
            if (length3 >= 0) {
                int i17 = 0;
                while (true) {
                    long j5 = jArr7[i17];
                    if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i18 = 8 - ((~(i17 - length3)) >>> 31);
                        for (int i19 = 0; i19 < i18; i19++) {
                            if ((j5 & 255) < 128) {
                                int i20 = (i17 << 3) + i19;
                                if (((setEmojiCompatEnabled) setkeylistener3.MediaBrowserCompatItemReceiver[i20]).IconCompatParcelizer()) {
                                    setkeylistener3.AudioAttributesCompatParcelizer(i20);
                                }
                            }
                            j5 >>= 8;
                        }
                        if (i18 != 8) {
                            break;
                        }
                    }
                    if (i17 == length3) {
                        break;
                    } else {
                        i17++;
                    }
                }
            }
        }
        setKeyListener<asText, setEmojiCompatEnabled<createForTypeOverride<_assertNotNull>>> setkeylistener4 = this.onAddQueueItem;
        MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0 = null;
        if (setkeylistener4 == null) {
            i = 0;
            i2 = 1;
            setkeylistener4 = new setKeyListener<>(i, i2, magicModuleRepositoryImplExternalSyntheticLambda0);
            this.onAddQueueItem = setkeylistener4;
        } else {
            i = 0;
            i2 = 1;
        }
        setEmojiCompatEnabled<createForTypeOverride<_assertNotNull>> setemojicompatenabledAudioAttributesImplApi26Parcelizer = setkeylistener4.AudioAttributesImplApi26Parcelizer(p1);
        if (setemojicompatenabledAudioAttributesImplApi26Parcelizer == null) {
            setemojicompatenabledAudioAttributesImplApi26Parcelizer = new setEmojiCompatEnabled<>(i, i2, magicModuleRepositoryImplExternalSyntheticLambda0);
            setkeylistener4.RemoteActionCompatParcelizer(p1, setemojicompatenabledAudioAttributesImplApi26Parcelizer);
        }
        setemojicompatenabledAudioAttributesImplApi26Parcelizer.IconCompatParcelizer(new createForTypeOverride<>(p0));
    }

    private final createDeserializationContext IconCompatParcelizer(asText p0) {
        createDeserializationContext createdeserializationcontextOnPlayFromMediaId;
        while (true) {
            getMergeInfo getmergeinfo = this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
            if ((getmergeinfo != null && getmergeinfo.IconCompatParcelizer(p0)) || (createdeserializationcontextOnPlayFromMediaId = this.onPlayFromMediaId()) == null) {
                return this;
            }
            this = createdeserializationcontextOnPlayFromMediaId;
        }
    }

    public final void AudioAttributesCompatParcelizer(asText p0) {
        setKeyListener<asText, setEmojiCompatEnabled<createForTypeOverride<_assertNotNull>>> setkeylistener = IconCompatParcelizer(p0).onAddQueueItem;
        setEmojiCompatEnabled<createForTypeOverride<_assertNotNull>> setemojicompatenabledIconCompatParcelizer = setkeylistener != null ? setkeylistener.IconCompatParcelizer(p0) : null;
        if (setemojicompatenabledIconCompatParcelizer != null) {
            write(setemojicompatenabledIconCompatParcelizer);
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00058WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00058WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007R \u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00050\u000b8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\"\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00108WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lo/createDeserializationContext$write;", "Lo/withHandlersFrom;", "", "onMediaButtonEvent", "()V", "", "onFastForward", "()I", "write", "onAddQueueItem", "read", "", "Lo/weirdNumberException;", "AudioAttributesImplApi26Parcelizer", "()Ljava/util/Map;", "AudioAttributesCompatParcelizer", "Lkotlin/Function1;", "Lo/JsonNode;", "onPause", "()Lo/getAnswerMap;", "IconCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class write implements withHandlersFrom {
        final /* synthetic */ int AudioAttributesCompatParcelizer;
        final /* synthetic */ createDeserializationContext AudioAttributesImplApi21Parcelizer;
        final /* synthetic */ getAnswerMap<JsonNode, getShowPopup> IconCompatParcelizer;
        final /* synthetic */ Map<weirdNumberException, Integer> RemoteActionCompatParcelizer;
        final /* synthetic */ int read;
        final /* synthetic */ getAnswerMap<_parser.IconCompatParcelizer, getShowPopup> write;

        /* JADX WARN: Multi-variable type inference failed */
        write(int i, int i2, Map<weirdNumberException, Integer> map, getAnswerMap<? super JsonNode, getShowPopup> getanswermap, getAnswerMap<? super _parser.IconCompatParcelizer, getShowPopup> getanswermap2, createDeserializationContext createdeserializationcontext) {
            this.AudioAttributesCompatParcelizer = i;
            this.read = i2;
            this.RemoteActionCompatParcelizer = map;
            this.IconCompatParcelizer = getanswermap;
            this.write = getanswermap2;
            this.AudioAttributesImplApi21Parcelizer = createdeserializationcontext;
        }

        @Override // kotlin.withHandlersFrom
        /* JADX INFO: renamed from: onFastForward, reason: from getter */
        public final int getAudioAttributesCompatParcelizer() {
            return this.AudioAttributesCompatParcelizer;
        }

        @Override // kotlin.withHandlersFrom
        /* JADX INFO: renamed from: onAddQueueItem, reason: from getter */
        public final int getRead() {
            return this.read;
        }

        @Override // kotlin.withHandlersFrom
        public final Map<weirdNumberException, Integer> AudioAttributesImplApi26Parcelizer() {
            return this.RemoteActionCompatParcelizer;
        }

        @Override // kotlin.withHandlersFrom
        public final getAnswerMap<JsonNode, getShowPopup> onPause() {
            return this.IconCompatParcelizer;
        }

        @Override // kotlin.withHandlersFrom
        public final void onMediaButtonEvent() {
            this.write.invoke(this.AudioAttributesImplApi21Parcelizer.getMediaDescriptionCompat());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b3 A[PHI: r2 r4
      0x00b3: PHI (r2v4 long) = (r2v2 long), (r2v6 long) binds: [B:32:0x0083, B:36:0x00af] A[DONT_GENERATE, DONT_INLINE]
      0x00b3: PHI (r4v3 long) = (r4v1 long), (r4v4 long) binds: [B:32:0x0083, B:36:0x00af] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void write(kotlin.withHandlersFrom r23) {
        /*
            Method dump skipped, instruction units count: 301
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.createDeserializationContext.write(o.withHandlersFrom):void");
    }

    static /* synthetic */ void write$default(createDeserializationContext createdeserializationcontext, ObjectWriterGeneratorSettings objectWriterGeneratorSettings, long j, long j2, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: captureRulers-OSxE8f4");
        }
        if ((i & 2) != 0) {
            j = hasReferringProperties.INSTANCE.RemoteActionCompatParcelizer();
        }
        long j3 = j;
        if ((i & 4) != 0) {
            j2 = getKey.INSTANCE.RemoteActionCompatParcelizer();
        }
        createdeserializationcontext.write(objectWriterGeneratorSettings, j3, j2);
    }

    private final void write(ObjectWriterGeneratorSettings p0, long p1, long p2) {
        PropertyMetadata addOnNewIntentListener;
        setKeyListener<asText, setEmojiCompatEnabled<createForTypeOverride<_assertNotNull>>> setkeylistener = this.onAddQueueItem;
        getMergeInfo getmergeinfo = this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        if (getmergeinfo == null) {
            getmergeinfo = new getMergeInfo();
            this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = getmergeinfo;
        }
        getMergeInfo getmergeinfo2 = getmergeinfo;
        _configureGenerator onMediaButtonEvent = getIconCompatParcelizer().getOnMediaButtonEvent();
        if (onMediaButtonEvent != null && (addOnNewIntentListener = onMediaButtonEvent.getAddOnNewIntentListener()) != null) {
            addOnNewIntentListener.IconCompatParcelizer.IconCompatParcelizer(p0, write, new AnonymousClass5(p1, p2, p0));
        }
        getmergeinfo2.IconCompatParcelizer(r_(), this, setkeylistener);
    }

    /* JADX INFO: renamed from: o.createDeserializationContext$5, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "read", "()V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass5 extends MagicModuleUseCase implements getCreatedOnDateMs<getShowPopup> {
        final /* synthetic */ long $AudioAttributesCompatParcelizer;
        final /* synthetic */ ObjectWriterGeneratorSettings $read;
        final /* synthetic */ long $write;

        @Override // kotlin.getCreatedOnDateMs
        public final /* synthetic */ getShowPopup invoke() {
            read();
            return getShowPopup.INSTANCE;
        }

        public final void read() {
            createDeserializationContext.this.RatingCompat().RemoteActionCompatParcelizer(false);
            createDeserializationContext.this.RatingCompat().AudioAttributesImplApi26Parcelizer(this.$AudioAttributesCompatParcelizer);
            createDeserializationContext.this.RatingCompat().MediaBrowserCompatCustomActionResultReceiver(this.$write);
            getAnswerMap<JsonNode, getShowPopup> getanswermapOnPause = this.$read.getRead().onPause();
            if (getanswermapOnPause != null) {
                getanswermapOnPause.invoke(createDeserializationContext.this.RatingCompat());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass5(long j, long j2, ObjectWriterGeneratorSettings objectWriterGeneratorSettings) {
            super(0);
            this.$AudioAttributesCompatParcelizer = j;
            this.$write = j2;
            this.$read = objectWriterGeneratorSettings;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void IconCompatParcelizer(kotlin.ObjectWriterGeneratorSettings r15) {
        /*
            r14 = this;
            boolean r0 = r14.MediaBrowserCompatMediaItem
            if (r0 != 0) goto L6b
            o.withHandlersFrom r0 = r15.getRead()
            o.getAnswerMap r0 = r0.onPause()
            o.setKeyListener<o.asText, o.setEmojiCompatEnabled<o.createForTypeOverride<o._assertNotNull>>> r1 = r14.onAddQueueItem
            if (r0 != 0) goto L5e
            if (r1 == 0) goto L6b
            r15 = r1
            o.AppCompatButton r15 = (kotlin.AppCompatButton) r15
            java.lang.Object[] r0 = r15.MediaBrowserCompatItemReceiver
            long[] r15 = r15.RemoteActionCompatParcelizer
            int r2 = r15.length
            int r2 = r2 + (-2)
            if (r2 < 0) goto L5a
            r3 = 0
            r4 = r3
        L20:
            r5 = r15[r4]
            long r7 = ~r5
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L55
            int r7 = r4 - r2
            int r7 = ~r7
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r3
        L3a:
            if (r9 >= r7) goto L53
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.3E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L4f
            int r10 = r4 << 3
            int r10 = r10 + r9
            r10 = r0[r10]
            o.setEmojiCompatEnabled r10 = (kotlin.setEmojiCompatEnabled) r10
            r14.write(r10)
        L4f:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L3a
        L53:
            if (r7 != r8) goto L5a
        L55:
            if (r4 == r2) goto L5a
            int r4 = r4 + 1
            goto L20
        L5a:
            r1.AudioAttributesCompatParcelizer()
            goto L6b
        L5e:
            r7 = 0
            r9 = 0
            r11 = 6
            r12 = 0
            r5 = r14
            r6 = r15
            write$default(r5, r6, r7, r9, r11, r12)
            r14.AudioAttributesImplApi21Parcelizer = r0
        L6b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.createDeserializationContext.IconCompatParcelizer(o.ObjectWriterGeneratorSettings):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void write(setEmojiCompatEnabled<createForTypeOverride<_assertNotNull>> p0) {
        _assertNotNull _assertnotnull;
        setEmojiCompatEnabled<createForTypeOverride<_assertNotNull>> setemojicompatenabled = p0;
        Object[] objArr = setemojicompatenabled.write;
        long[] jArr = setemojicompatenabled.AudioAttributesCompatParcelizer;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128 && (_assertnotnull = (_assertNotNull) ((createForTypeOverride) objArr[(i << 3) + i3]).get()) != null) {
                        if (r_()) {
                            _assertnotnull.write(false);
                        } else {
                            _assertnotnull.AudioAttributesCompatParcelizer(false);
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    public final void RemoteActionCompatParcelizer(asText p0, float p1) {
        getMergeInfo getmergeinfo = this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        if (getmergeinfo == null) {
            getmergeinfo = new getMergeInfo();
            this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = getmergeinfo;
        }
        getmergeinfo.AudioAttributesCompatParcelizer(p0, p1);
    }

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\b\u001a\u00020\u0007*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0005H\u0096\u0004¢\u0006\u0004\b\b\u0010\tR\"\u0010\b\u001a\u00020\n8\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\b\u0010\u000fR\"\u0010\u0016\u001a\u00020\u00108\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\b\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\r\u001a\u00020\u00178\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0012\u001a\u0004\b\u0014\u0010\u0013\"\u0004\b\u0018\u0010\u0015R\u0014\u0010\u000b\u001a\u00020\u00198WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u001aR\u0014\u0010\u0011\u001a\u00020\u00058WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\u00058WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u001b"}, d2 = {"Lo/createDeserializationContext$read;", "Lo/JsonNode;", "<init>", "(Lo/createDeserializationContext;)V", "Lo/asText;", "", "p0", "", "RemoteActionCompatParcelizer", "(Lo/asText;F)V", "", "IconCompatParcelizer", "Z", "read", "()Z", "(Z)V", "Lo/hasReferringProperties;", "AudioAttributesCompatParcelizer", "J", "()J", "AudioAttributesImplApi26Parcelizer", "(J)V", "write", "Lo/getKey;", "MediaBrowserCompatCustomActionResultReceiver", "Lo/isAbstract;", "()Lo/isAbstract;", "()F", "AudioAttributesImplApi21Parcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
    final class read implements JsonNode {

        /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
        private boolean RemoteActionCompatParcelizer;

        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
        private long write = hasReferringProperties.INSTANCE.RemoteActionCompatParcelizer();

        /* JADX INFO: renamed from: write, reason: from kotlin metadata */
        private long read = getKey.INSTANCE.RemoteActionCompatParcelizer();

        public read() {
        }

        public final void RemoteActionCompatParcelizer(boolean z) {
            this.RemoteActionCompatParcelizer = z;
        }

        /* JADX INFO: renamed from: read, reason: from getter */
        public final boolean getRemoteActionCompatParcelizer() {
            return this.RemoteActionCompatParcelizer;
        }

        public final void AudioAttributesImplApi26Parcelizer(long j) {
            this.write = j;
        }

        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
        public final long getWrite() {
            return this.write;
        }

        /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from getter */
        public final long getRead() {
            return this.read;
        }

        public final void MediaBrowserCompatCustomActionResultReceiver(long j) {
            this.read = j;
        }

        @Override // kotlin.JsonNode
        public final isAbstract write() {
            this.RemoteActionCompatParcelizer = true;
            isAbstract isabstractOnFastForward = createDeserializationContext.this.onFastForward();
            if (hasReferringProperties.write(this.write, hasReferringProperties.INSTANCE.RemoteActionCompatParcelizer())) {
                this.write = referringProperties.AudioAttributesCompatParcelizer(hasRawClass.MediaBrowserCompatCustomActionResultReceiver(isabstractOnFastForward));
                this.read = isabstractOnFastForward.write();
            }
            createDeserializationContext.this.getIconCompatParcelizer().getAccessaddObserverForBackInvoker().onRewind();
            return isabstractOnFastForward;
        }

        @Override // kotlin.JsonNode
        public final void RemoteActionCompatParcelizer(asText astext, float f) {
            createDeserializationContext.this.RemoteActionCompatParcelizer(astext, f);
        }

        @Override // kotlin.bufferMapProperty
        /* JADX INFO: renamed from: IconCompatParcelizer */
        public final float getAudioAttributesCompatParcelizer() {
            return createDeserializationContext.this.getAudioAttributesCompatParcelizer();
        }

        @Override // kotlin.getParameter
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer */
        public final float getIconCompatParcelizer() {
            return createDeserializationContext.this.getIconCompatParcelizer();
        }
    }

    /* JADX INFO: renamed from: o.createDeserializationContext$4, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/ObjectWriterGeneratorSettings;", "p0", "", "RemoteActionCompatParcelizer", "(Lo/ObjectWriterGeneratorSettings;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass4 extends MagicModuleUseCase implements getAnswerMap<ObjectWriterGeneratorSettings, getShowPopup> {
        public static final AnonymousClass4 IconCompatParcelizer = new AnonymousClass4();

        @Override // kotlin.getAnswerMap
        public final /* synthetic */ getShowPopup invoke(ObjectWriterGeneratorSettings objectWriterGeneratorSettings) {
            RemoteActionCompatParcelizer(objectWriterGeneratorSettings);
            return getShowPopup.INSTANCE;
        }

        public final void RemoteActionCompatParcelizer(ObjectWriterGeneratorSettings objectWriterGeneratorSettings) {
            if (objectWriterGeneratorSettings.onRemoveQueueItem()) {
                objectWriterGeneratorSettings.getIconCompatParcelizer().IconCompatParcelizer(objectWriterGeneratorSettings);
            }
        }

        AnonymousClass4() {
            super(1);
        }
    }

    @Override // kotlin.withContentValueHandler
    public withHandlersFrom AudioAttributesCompatParcelizer(int p0, int p1, Map<weirdNumberException, Integer> p2, getAnswerMap<? super JsonNode, getShowPopup> p3, getAnswerMap<? super _parser.IconCompatParcelizer, getShowPopup> p4) {
        if ((p0 & (-16777216)) != 0 || ((-16777216) & p1) != 0) {
            StringBuilder sb = new StringBuilder("Size(");
            sb.append(p0);
            sb.append(" x ");
            sb.append(p1);
            sb.append(") is out of range. Each dimension must be between 0 and 16777215.");
            reportWrongTokenException.read(sb.toString());
        }
        return new write(p0, p1, p2, p3, p4, this);
    }
}
