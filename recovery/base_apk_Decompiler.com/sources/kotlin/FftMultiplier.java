package kotlin;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\b\u0000\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\u0011J\"\u0010\u0010\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0012J,\u0010\u000e\u001a\u0004\u0018\u00010\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u0013J6\u0010\u0015\u001a\u0004\u0018\u00010\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016J@\u0010\u0010\u001a\u0004\u0018\u00010\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0018JJ\u0010\u001a\u001a\u0004\u0018\u00010\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u001a\u0010\u001bJT\u0010\u000e\u001a\u0004\u0018\u00010\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0019\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u001dJ^\u0010\u0015\u001a\u0004\u0018\u00010\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u00062\b\u0010\u0019\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u001c\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u001fR\u0011\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\u001a\u0010 R\u0014\u0010\u0015\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010!R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\"R\u0018\u0010\u0010\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010$R\u001e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010&"}, d2 = {"Lo/FftMultiplier;", "Lo/FastIntegerMathUInt128;", "", "p0", "", "p1", "", "p2", "<init>", "(IZLjava/lang/Object;)V", "", "read", "()V", "Lo/_handleUnrecognizedCharacterEscape;", "AudioAttributesCompatParcelizer", "(Lo/_handleUnrecognizedCharacterEscape;)V", "RemoteActionCompatParcelizer", "(Ljava/lang/Object;)V", "(Lo/_handleUnrecognizedCharacterEscape;I)Ljava/lang/Object;", "(Ljava/lang/Object;Lo/_handleUnrecognizedCharacterEscape;I)Ljava/lang/Object;", "p3", "IconCompatParcelizer", "(Ljava/lang/Object;Ljava/lang/Object;Lo/_handleUnrecognizedCharacterEscape;I)Ljava/lang/Object;", "p4", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lo/_handleUnrecognizedCharacterEscape;I)Ljava/lang/Object;", "p5", "write", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lo/_handleUnrecognizedCharacterEscape;I)Ljava/lang/Object;", "p6", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lo/_handleUnrecognizedCharacterEscape;I)Ljava/lang/Object;", "p7", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lo/_handleUnrecognizedCharacterEscape;I)Ljava/lang/Object;", "I", "Z", "Ljava/lang/Object;", "Lo/escapesFor;", "Lo/escapesFor;", "", "Ljava/util/List;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FftMultiplier implements FastIntegerMathUInt128 {
    private Object AudioAttributesCompatParcelizer;
    private final boolean IconCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private List<escapesFor> write;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private escapesFor RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final int read;

    public FftMultiplier(int i, boolean z, Object obj) {
        this.read = i;
        this.IconCompatParcelizer = z;
        this.AudioAttributesCompatParcelizer = obj;
    }

    @Override // kotlin.getModuleData
    public final /* bridge */ /* synthetic */ Object AudioAttributesCompatParcelizer(Object obj, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, Integer num) {
        return AudioAttributesCompatParcelizer(obj, _handleunrecognizedcharacterescape, num.intValue());
    }

    @Override // kotlin.markComplete
    public final /* synthetic */ Object AudioAttributesCompatParcelizer(Object obj, Object obj2, Object obj3, Object obj4, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, Integer num) {
        return write(obj, obj2, obj3, obj4, _handleunrecognizedcharacterescape, num.intValue());
    }

    @Override // kotlin.MagicModuleRepository
    public final /* bridge */ /* synthetic */ Object RemoteActionCompatParcelizer(Object obj, Object obj2, Object obj3, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, Integer num) {
        return RemoteActionCompatParcelizer(obj, obj2, obj3, _handleunrecognizedcharacterescape, num.intValue());
    }

    @Override // kotlin.MagicModuleSubmissionRequestBody
    public final /* synthetic */ Object invoke(_handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, Integer num) {
        return RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape, num.intValue());
    }

    @Override // kotlin.isDetailDownloaded
    public final /* synthetic */ Object read(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, Integer num) {
        return AudioAttributesCompatParcelizer(obj, obj2, obj3, obj4, obj5, _handleunrecognizedcharacterescape, num.intValue());
    }

    @Override // kotlin.saveMagicModuleModule
    public final /* synthetic */ Object read(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, Integer num) {
        return IconCompatParcelizer(obj, obj2, obj3, obj4, obj5, obj6, _handleunrecognizedcharacterescape, num.intValue());
    }

    @Override // kotlin.getMagicModuleStat
    public final /* synthetic */ Object write(Object obj, Object obj2, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, Integer num) {
        return IconCompatParcelizer(obj, obj2, _handleunrecognizedcharacterescape, num.intValue());
    }

    private final void read() {
        if (this.IconCompatParcelizer) {
            escapesFor escapesfor = this.RemoteActionCompatParcelizer;
            if (escapesfor != null) {
                escapesfor.AudioAttributesCompatParcelizer();
                this.RemoteActionCompatParcelizer = null;
            }
            List<escapesFor> list = this.write;
            if (list != null) {
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    list.get(i).AudioAttributesCompatParcelizer();
                }
                list.clear();
            }
        }
    }

    private final void AudioAttributesCompatParcelizer(_handleUnrecognizedCharacterEscape p0) {
        escapesFor escapesforOnMediaButtonEvent;
        if (!this.IconCompatParcelizer || (escapesforOnMediaButtonEvent = p0.onMediaButtonEvent()) == null) {
            return;
        }
        p0.write(escapesforOnMediaButtonEvent);
        if (multiplyFft.read(this.RemoteActionCompatParcelizer, escapesforOnMediaButtonEvent)) {
            this.RemoteActionCompatParcelizer = escapesforOnMediaButtonEvent;
            return;
        }
        List<escapesFor> list = this.write;
        if (list == null) {
            ArrayList arrayList = new ArrayList();
            this.write = arrayList;
            arrayList.add(escapesforOnMediaButtonEvent);
            return;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (multiplyFft.read(list.get(i), escapesforOnMediaButtonEvent)) {
                list.set(i, escapesforOnMediaButtonEvent);
                return;
            }
        }
        list.add(escapesforOnMediaButtonEvent);
    }

    public final void RemoteActionCompatParcelizer(Object p0) {
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, p0)) {
            return;
        }
        boolean z = this.AudioAttributesCompatParcelizer == null;
        this.AudioAttributesCompatParcelizer = p0;
        if (z) {
            return;
        }
        read();
    }

    public final Object RemoteActionCompatParcelizer(_handleUnrecognizedCharacterEscape p0, int p1) {
        _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescapeWrite = p0.write(this.read);
        AudioAttributesCompatParcelizer(_handleunrecognizedcharacterescapeWrite);
        int iWrite = _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(this) ? multiplyFft.read(0) : multiplyFft.write(0);
        Object obj = this.AudioAttributesCompatParcelizer;
        toMagicModuleMetaRepoModel.read(obj, "");
        Object objInvoke = ((MagicModuleSubmissionRequestBody) toMagicModuleStatsLSModel.RemoteActionCompatParcelizer(obj, 2)).invoke(_handleunrecognizedcharacterescapeWrite, Integer.valueOf(p1 | iWrite));
        releaseNameCopyBuffer releasenamecopybufferMediaBrowserCompatSearchResultReceiver = _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatSearchResultReceiver();
        if (releasenamecopybufferMediaBrowserCompatSearchResultReceiver != null) {
            releasenamecopybufferMediaBrowserCompatSearchResultReceiver.read(new read(this));
        }
        return objInvoke;
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final /* synthetic */ class read extends downloadMagicModuleModule implements MagicModuleSubmissionRequestBody<_handleUnrecognizedCharacterEscape, Integer, getShowPopup> {
        public final void IconCompatParcelizer(_handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
            ((FftMultiplier) this.write).RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape, i);
        }

        @Override // kotlin.MagicModuleSubmissionRequestBody
        public final /* synthetic */ getShowPopup invoke(_handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, Integer num) {
            IconCompatParcelizer(_handleunrecognizedcharacterescape, num.intValue());
            return getShowPopup.INSTANCE;
        }

        read(Object obj) {
            super(2, obj, FftMultiplier.class, "invoke", "invoke(Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;", 8);
        }
    }

    public final Object AudioAttributesCompatParcelizer(final Object p0, _handleUnrecognizedCharacterEscape p1, final int p2) {
        _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescapeWrite = p1.write(this.read);
        AudioAttributesCompatParcelizer(_handleunrecognizedcharacterescapeWrite);
        int iWrite = _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(this) ? multiplyFft.read(1) : multiplyFft.write(1);
        Object obj = this.AudioAttributesCompatParcelizer;
        toMagicModuleMetaRepoModel.read(obj, "");
        Object objAudioAttributesCompatParcelizer = ((getModuleData) toMagicModuleStatsLSModel.RemoteActionCompatParcelizer(obj, 3)).AudioAttributesCompatParcelizer(p0, _handleunrecognizedcharacterescapeWrite, Integer.valueOf(iWrite | p2));
        releaseNameCopyBuffer releasenamecopybufferMediaBrowserCompatSearchResultReceiver = _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatSearchResultReceiver();
        if (releasenamecopybufferMediaBrowserCompatSearchResultReceiver != null) {
            releasenamecopybufferMediaBrowserCompatSearchResultReceiver.read(new MagicModuleSubmissionRequestBody() { // from class: o.fft3
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj2, Object obj3) {
                    return FftMultiplier.AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer, p0, p2, (_handleUnrecognizedCharacterEscape) obj2, ((Integer) obj3).intValue());
                }
            });
        }
        return objAudioAttributesCompatParcelizer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesCompatParcelizer(FftMultiplier fftMultiplier, Object obj, int i, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i2) {
        fftMultiplier.AudioAttributesCompatParcelizer(obj, _handleunrecognizedcharacterescape, _appendEscaped.RemoteActionCompatParcelizer(i) | 1);
        return getShowPopup.INSTANCE;
    }

    public final Object IconCompatParcelizer(final Object p0, final Object p1, _handleUnrecognizedCharacterEscape p2, final int p3) {
        _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescapeWrite = p2.write(this.read);
        AudioAttributesCompatParcelizer(_handleunrecognizedcharacterescapeWrite);
        int iWrite = _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(this) ? multiplyFft.read(2) : multiplyFft.write(2);
        Object obj = this.AudioAttributesCompatParcelizer;
        toMagicModuleMetaRepoModel.read(obj, "");
        Object objWrite = ((getMagicModuleStat) toMagicModuleStatsLSModel.RemoteActionCompatParcelizer(obj, 4)).write(p0, p1, _handleunrecognizedcharacterescapeWrite, Integer.valueOf(iWrite | p3));
        releaseNameCopyBuffer releasenamecopybufferMediaBrowserCompatSearchResultReceiver = _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatSearchResultReceiver();
        if (releasenamecopybufferMediaBrowserCompatSearchResultReceiver != null) {
            releasenamecopybufferMediaBrowserCompatSearchResultReceiver.read(new MagicModuleSubmissionRequestBody() { // from class: o.fftMixedRadix
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj2, Object obj3) {
                    return FftMultiplier.RemoteActionCompatParcelizer(this.read, p0, p1, p3, (_handleUnrecognizedCharacterEscape) obj2, ((Integer) obj3).intValue());
                }
            });
        }
        return objWrite;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup RemoteActionCompatParcelizer(FftMultiplier fftMultiplier, Object obj, Object obj2, int i, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i2) {
        fftMultiplier.IconCompatParcelizer(obj, obj2, _handleunrecognizedcharacterescape, _appendEscaped.RemoteActionCompatParcelizer(i) | 1);
        return getShowPopup.INSTANCE;
    }

    public final Object RemoteActionCompatParcelizer(final Object p0, final Object p1, final Object p2, _handleUnrecognizedCharacterEscape p3, final int p4) {
        _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescapeWrite = p3.write(this.read);
        AudioAttributesCompatParcelizer(_handleunrecognizedcharacterescapeWrite);
        int iWrite = _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(this) ? multiplyFft.read(3) : multiplyFft.write(3);
        Object obj = this.AudioAttributesCompatParcelizer;
        toMagicModuleMetaRepoModel.read(obj, "");
        Object objRemoteActionCompatParcelizer = ((MagicModuleRepository) toMagicModuleStatsLSModel.RemoteActionCompatParcelizer(obj, 5)).RemoteActionCompatParcelizer(p0, p1, p2, _handleunrecognizedcharacterescapeWrite, Integer.valueOf(iWrite | p4));
        releaseNameCopyBuffer releasenamecopybufferMediaBrowserCompatSearchResultReceiver = _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatSearchResultReceiver();
        if (releasenamecopybufferMediaBrowserCompatSearchResultReceiver != null) {
            releasenamecopybufferMediaBrowserCompatSearchResultReceiver.read(new MagicModuleSubmissionRequestBody() { // from class: o.fft
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj2, Object obj3) {
                    return FftMultiplier.read(this.read, p0, p1, p2, p4, (_handleUnrecognizedCharacterEscape) obj2, ((Integer) obj3).intValue());
                }
            });
        }
        return objRemoteActionCompatParcelizer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(FftMultiplier fftMultiplier, Object obj, Object obj2, Object obj3, int i, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i2) {
        fftMultiplier.RemoteActionCompatParcelizer(obj, obj2, obj3, _handleunrecognizedcharacterescape, _appendEscaped.RemoteActionCompatParcelizer(i) | 1);
        return getShowPopup.INSTANCE;
    }

    public final Object write(final Object p0, final Object p1, final Object p2, final Object p3, _handleUnrecognizedCharacterEscape p4, final int p5) {
        _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescapeWrite = p4.write(this.read);
        AudioAttributesCompatParcelizer(_handleunrecognizedcharacterescapeWrite);
        int iWrite = _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(this) ? multiplyFft.read(4) : multiplyFft.write(4);
        Object obj = this.AudioAttributesCompatParcelizer;
        toMagicModuleMetaRepoModel.read(obj, "");
        Object objAudioAttributesCompatParcelizer = ((markComplete) toMagicModuleStatsLSModel.RemoteActionCompatParcelizer(obj, 6)).AudioAttributesCompatParcelizer(p0, p1, p2, p3, _handleunrecognizedcharacterescapeWrite, Integer.valueOf(iWrite | p5));
        releaseNameCopyBuffer releasenamecopybufferMediaBrowserCompatSearchResultReceiver = _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatSearchResultReceiver();
        if (releasenamecopybufferMediaBrowserCompatSearchResultReceiver != null) {
            releasenamecopybufferMediaBrowserCompatSearchResultReceiver.read(new MagicModuleSubmissionRequestBody() { // from class: o.getRootsOfUnity2
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj2, Object obj3) {
                    return FftMultiplier.read(this.RemoteActionCompatParcelizer, p0, p1, p2, p3, p5, (_handleUnrecognizedCharacterEscape) obj2, ((Integer) obj3).intValue());
                }
            });
        }
        return objAudioAttributesCompatParcelizer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(FftMultiplier fftMultiplier, Object obj, Object obj2, Object obj3, Object obj4, int i, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i2) {
        fftMultiplier.write(obj, obj2, obj3, obj4, _handleunrecognizedcharacterescape, _appendEscaped.RemoteActionCompatParcelizer(i) | 1);
        return getShowPopup.INSTANCE;
    }

    public final Object AudioAttributesCompatParcelizer(final Object p0, final Object p1, final Object p2, final Object p3, final Object p4, _handleUnrecognizedCharacterEscape p5, final int p6) {
        _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescapeWrite = p5.write(this.read);
        AudioAttributesCompatParcelizer(_handleunrecognizedcharacterescapeWrite);
        int iWrite = _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(this) ? multiplyFft.read(5) : multiplyFft.write(5);
        Object obj = this.AudioAttributesCompatParcelizer;
        toMagicModuleMetaRepoModel.read(obj, "");
        Object obj2 = ((isDetailDownloaded) toMagicModuleStatsLSModel.RemoteActionCompatParcelizer(obj, 7)).read(p0, p1, p2, p3, p4, _handleunrecognizedcharacterescapeWrite, Integer.valueOf(p6 | iWrite));
        releaseNameCopyBuffer releasenamecopybufferMediaBrowserCompatSearchResultReceiver = _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatSearchResultReceiver();
        if (releasenamecopybufferMediaBrowserCompatSearchResultReceiver != null) {
            releasenamecopybufferMediaBrowserCompatSearchResultReceiver.read(new MagicModuleSubmissionRequestBody() { // from class: o.fromFftVector
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj3, Object obj4) {
                    return FftMultiplier.IconCompatParcelizer(this.AudioAttributesCompatParcelizer, p0, p1, p2, p3, p4, p6, (_handleUnrecognizedCharacterEscape) obj3, ((Integer) obj4).intValue());
                }
            });
        }
        return obj2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup IconCompatParcelizer(FftMultiplier fftMultiplier, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i2) {
        fftMultiplier.AudioAttributesCompatParcelizer(obj, obj2, obj3, obj4, obj5, _handleunrecognizedcharacterescape, _appendEscaped.RemoteActionCompatParcelizer(i) | 1);
        return getShowPopup.INSTANCE;
    }

    public final Object IconCompatParcelizer(final Object p0, final Object p1, final Object p2, final Object p3, final Object p4, final Object p5, _handleUnrecognizedCharacterEscape p6, final int p7) {
        _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescapeWrite = p6.write(this.read);
        AudioAttributesCompatParcelizer(_handleunrecognizedcharacterescapeWrite);
        int iWrite = _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(this) ? multiplyFft.read(6) : multiplyFft.write(6);
        Object obj = this.AudioAttributesCompatParcelizer;
        toMagicModuleMetaRepoModel.read(obj, "");
        Object obj2 = ((saveMagicModuleModule) toMagicModuleStatsLSModel.RemoteActionCompatParcelizer(obj, 8)).read(p0, p1, p2, p3, p4, p5, _handleunrecognizedcharacterescapeWrite, Integer.valueOf(p7 | iWrite));
        releaseNameCopyBuffer releasenamecopybufferMediaBrowserCompatSearchResultReceiver = _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatSearchResultReceiver();
        if (releasenamecopybufferMediaBrowserCompatSearchResultReceiver != null) {
            releasenamecopybufferMediaBrowserCompatSearchResultReceiver.read(new MagicModuleSubmissionRequestBody() { // from class: o.getRootsOfUnity3
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj3, Object obj4) {
                    return FftMultiplier.AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer, p0, p1, p2, p3, p4, p5, p7, (_handleUnrecognizedCharacterEscape) obj3, ((Integer) obj4).intValue());
                }
            });
        }
        return obj2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesCompatParcelizer(FftMultiplier fftMultiplier, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i2) {
        fftMultiplier.IconCompatParcelizer(obj, obj2, obj3, obj4, obj5, obj6, _handleunrecognizedcharacterescape, _appendEscaped.RemoteActionCompatParcelizer(i) | 1);
        return getShowPopup.INSTANCE;
    }
}
