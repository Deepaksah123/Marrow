package kotlin;

import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B[\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u0010\u0012\n\u0010\u0014\u001a\u00060\u0012j\u0002`\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001c\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\fH\u0000¢\u0006\u0004\b\u001d\u0010\u001bJ\u000f\u0010\u001e\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001e\u0010\u001bJ\u000f\u0010\u001f\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001f\u0010\u001bR\u0011\u0010 \u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b \u0010!R\u0011\u0010\u001a\u001a\u00020\u00048\u0006¢\u0006\u0006\n\u0004\b\"\u0010#R\u0011\u0010\u0018\u001a\u00020\u00068\u0006¢\u0006\u0006\n\u0004\b\u001a\u0010$R\u0017\u0010\"\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006¢\u0006\u0006\n\u0004\b\u0018\u0010%R\u0011\u0010\u001c\u001a\u00020\u000e8\u0006¢\u0006\u0006\n\u0004\b&\u0010'R\u0015\u0010\u001d\u001a\u0006\u0012\u0002\b\u00030\u00108\u0006¢\u0006\u0006\n\u0004\b\u001c\u0010(R\u0015\u0010\u001e\u001a\u00060\u0012j\u0002`\u00138\u0006¢\u0006\u0006\n\u0004\b)\u0010*R&\u0010\u001f\u001a\u0012\u0012\u0004\u0012\u00020,0+j\b\u0012\u0004\u0012\u00020,`-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u0010)\u001a\u0002008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u001c\u00101\u001a\b\u0012\u0004\u0012\u000204038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u00105R\u001a\u00109\u001a\u0002068\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u001e\u00107\u001a\u0004\b \u00108R\"\u0010=\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120:8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u001f\u0010;\u001a\u0004\b\u0018\u0010<R\u0014\u0010.\u001a\u00020\u000e8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b1\u0010>R\u0014\u0010?\u001a\u00020\u000e8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010>"}, d2 = {"Lo/copyHexChars;", "Lo/getInputCodeLatin1;", "Lo/getTokenLineNr;", "p0", "Lo/convertNumberToLong;", "p1", "Lo/_parseIntValue;", "p2", "", "Lo/allocReadIOBuffer;", "p3", "Lkotlin/Function0;", "", "p4", "", "p5", "Lo/_closeInput;", "p6", "", "Lo/SynchronizedObject;", "p7", "<init>", "(Lo/getTokenLineNr;Lo/convertNumberToLong;Lo/_parseIntValue;Ljava/util/Set;Lo/MagicModuleSubmissionRequestBody;ZLo/_closeInput;Ljava/lang/Object;)V", "Lo/isResourceManaged;", "write", "(Lo/isResourceManaged;)Z", "read", "()V", "IconCompatParcelizer", "MediaBrowserCompatItemReceiver", "AudioAttributesImplBaseParcelizer", "AudioAttributesImplApi21Parcelizer", "AudioAttributesCompatParcelizer", "Lo/getTokenLineNr;", "RemoteActionCompatParcelizer", "Lo/convertNumberToLong;", "Lo/_parseIntValue;", "Lo/MagicModuleSubmissionRequestBody;", "MediaBrowserCompatMediaItem", "Z", "Lo/_closeInput;", "AudioAttributesImplApi26Parcelizer", "Ljava/lang/Object;", "Ljava/util/concurrent/atomic/AtomicReference;", "Lo/copyHexBytes;", "Lo/read;", "MediaBrowserCompatSearchResultReceiver", "Ljava/util/concurrent/atomic/AtomicReference;", "", "MediaBrowserCompatCustomActionResultReceiver", "J", "Lo/setButtonDrawable;", "Lo/rawReference;", "Lo/setButtonDrawable;", "Lo/toFftVector;", "Lo/toFftVector;", "()Lo/toFftVector;", "MediaDescriptionCompat", "Lo/allocNameCopyBuffer;", "Lo/allocNameCopyBuffer;", "()Lo/allocNameCopyBuffer;", "MediaMetadataCompat", "()Z", "RatingCompat"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class copyHexChars implements getInputCodeLatin1 {
    private final getTokenLineNr AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private final allocNameCopyBuffer<Object> MediaMetadataCompat;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private final Object AudioAttributesImplBaseParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private final toFftVector MediaDescriptionCompat;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final _closeInput<?> MediaBrowserCompatItemReceiver;

    /* JADX INFO: renamed from: MediaBrowserCompatMediaItem, reason: from kotlin metadata */
    private final boolean IconCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final convertNumberToLong read;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final _parseIntValue write;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final MagicModuleSubmissionRequestBody<_handleUnrecognizedCharacterEscape, Integer, getShowPopup> RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatSearchResultReceiver, reason: from kotlin metadata */
    private AtomicReference<copyHexBytes> AudioAttributesImplApi21Parcelizer = new AtomicReference<>(copyHexBytes.IconCompatParcelizer);

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private long AudioAttributesImplApi26Parcelizer = multiplyConjugateInto.IconCompatParcelizer();

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private setButtonDrawable<rawReference> MediaBrowserCompatCustomActionResultReceiver = setSupportAllCaps.IconCompatParcelizer();

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] RemoteActionCompatParcelizer;

        static {
            int[] iArr = new int[copyHexBytes.values().length];
            try {
                iArr[copyHexBytes.IconCompatParcelizer.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[copyHexBytes.AudioAttributesImplBaseParcelizer.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[copyHexBytes.AudioAttributesImplApi21Parcelizer.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[copyHexBytes.write.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[copyHexBytes.read.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[copyHexBytes.RemoteActionCompatParcelizer.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[copyHexBytes.AudioAttributesCompatParcelizer.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            RemoteActionCompatParcelizer = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public copyHexChars(getTokenLineNr gettokenlinenr, convertNumberToLong convertnumbertolong, _parseIntValue _parseintvalue, Set<allocReadIOBuffer> set, MagicModuleSubmissionRequestBody<? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup> magicModuleSubmissionRequestBody, boolean z, _closeInput<?> _closeinput, Object obj) {
        this.AudioAttributesCompatParcelizer = gettokenlinenr;
        this.read = convertnumbertolong;
        this.write = _parseintvalue;
        this.RemoteActionCompatParcelizer = magicModuleSubmissionRequestBody;
        this.IconCompatParcelizer = z;
        this.MediaBrowserCompatItemReceiver = _closeinput;
        this.AudioAttributesImplBaseParcelizer = obj;
        toFftVector tofftvector = new toFftVector();
        tofftvector.RemoteActionCompatParcelizer(set, _parseintvalue.onSetCaptioningEnabled());
        this.MediaDescriptionCompat = tofftvector;
        this.MediaMetadataCompat = new allocNameCopyBuffer<>(_closeinput.write());
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final toFftVector getMediaDescriptionCompat() {
        return this.MediaDescriptionCompat;
    }

    public final allocNameCopyBuffer<Object> write() {
        return this.MediaMetadataCompat;
    }

    public final boolean MediaBrowserCompatCustomActionResultReceiver() {
        return this.AudioAttributesImplApi21Parcelizer.get() == copyHexBytes.AudioAttributesImplApi21Parcelizer && this.AudioAttributesImplApi26Parcelizer == multiplyConjugateInto.IconCompatParcelizer();
    }

    @Override // kotlin.getInputCodeLatin1
    public final boolean RemoteActionCompatParcelizer() {
        return this.AudioAttributesImplApi21Parcelizer.get().compareTo(copyHexBytes.write) >= 0;
    }

    @Override // kotlin.getInputCodeLatin1
    public final boolean write(isResourceManaged p0) throws Exception {
        try {
            switch (WhenMappings.RemoteActionCompatParcelizer[this.AudioAttributesImplApi21Parcelizer.get().ordinal()]) {
                case 1:
                    if (this.IconCompatParcelizer) {
                        this.write.ParcelableVolumeInfo();
                    }
                    try {
                        this.MediaBrowserCompatCustomActionResultReceiver = this.read.write(this.AudioAttributesCompatParcelizer, p0, this.RemoteActionCompatParcelizer);
                        copyHexBytes copyhexbytes = copyHexBytes.IconCompatParcelizer;
                        copyHexBytes copyhexbytes2 = copyHexBytes.AudioAttributesImplBaseParcelizer;
                        if (!setBackInvokedCallbackEnabled.read(this.AudioAttributesImplApi21Parcelizer, copyhexbytes, copyhexbytes2)) {
                            StringBuilder sb = new StringBuilder("Unexpected state change from: ");
                            sb.append(copyhexbytes);
                            sb.append(" to: ");
                            sb.append(copyhexbytes2);
                            sb.append('.');
                            getInputCodeUtf8JsNames.read(sb.toString());
                        }
                        if (this.MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer()) {
                            AudioAttributesImplBaseParcelizer();
                        }
                        return RemoteActionCompatParcelizer();
                    } finally {
                        if (this.IconCompatParcelizer) {
                            this.write.onPrepareFromUri();
                        }
                    }
                case 2:
                    copyHexBytes copyhexbytes3 = copyHexBytes.AudioAttributesImplBaseParcelizer;
                    copyHexBytes copyhexbytes4 = copyHexBytes.AudioAttributesImplApi21Parcelizer;
                    if (!setBackInvokedCallbackEnabled.read(this.AudioAttributesImplApi21Parcelizer, copyhexbytes3, copyhexbytes4)) {
                        StringBuilder sb2 = new StringBuilder("Unexpected state change from: ");
                        sb2.append(copyhexbytes3);
                        sb2.append(" to: ");
                        sb2.append(copyhexbytes4);
                        sb2.append('.');
                        getInputCodeUtf8JsNames.read(sb2.toString());
                    }
                    long j = this.AudioAttributesImplApi26Parcelizer;
                    try {
                        this.AudioAttributesImplApi26Parcelizer = multiplyConjugateInto.IconCompatParcelizer();
                        this.MediaBrowserCompatCustomActionResultReceiver = this.read.write(this.AudioAttributesCompatParcelizer, p0, this.MediaBrowserCompatCustomActionResultReceiver);
                        if (this.MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer()) {
                            AudioAttributesImplBaseParcelizer();
                        }
                        return RemoteActionCompatParcelizer();
                    } finally {
                        this.AudioAttributesImplApi26Parcelizer = j;
                        copyHexBytes copyhexbytes5 = copyHexBytes.AudioAttributesImplApi21Parcelizer;
                        copyHexBytes copyhexbytes6 = copyHexBytes.AudioAttributesImplBaseParcelizer;
                        if (!setBackInvokedCallbackEnabled.read(this.AudioAttributesImplApi21Parcelizer, copyhexbytes5, copyhexbytes6)) {
                            StringBuilder sb3 = new StringBuilder("Unexpected state change from: ");
                            sb3.append(copyhexbytes5);
                            sb3.append(" to: ");
                            sb3.append(copyhexbytes6);
                            sb3.append('.');
                            getInputCodeUtf8JsNames.read(sb3.toString());
                        }
                    }
                case 3:
                    _validJsonValueList.RemoteActionCompatParcelizer("Recursive call to resume()");
                    throw new PlanDetailsCreator();
                case 4:
                    throw new IllegalStateException("Pausable composition is complete and apply() should be applied".toString());
                case 5:
                    throw new IllegalStateException("The paused composition has been applied".toString());
                case 6:
                    throw new IllegalStateException("The paused composition has been cancelled".toString());
                case 7:
                    throw new IllegalStateException("The paused composition is invalid because of a previous exception".toString());
                default:
                    throw new RenewEligibleCreator();
            }
        } catch (Exception e) {
            this.AudioAttributesImplApi21Parcelizer.set(copyHexBytes.AudioAttributesCompatParcelizer);
            throw e;
        }
    }

    @Override // kotlin.getInputCodeLatin1
    public final void read() throws Exception {
        try {
            switch (WhenMappings.RemoteActionCompatParcelizer[this.AudioAttributesImplApi21Parcelizer.get().ordinal()]) {
                case 1:
                case 2:
                case 3:
                    throw new IllegalStateException("The paused composition has not completed yet".toString());
                case 4:
                    AudioAttributesImplApi21Parcelizer();
                    copyHexBytes copyhexbytes = copyHexBytes.write;
                    copyHexBytes copyhexbytes2 = copyHexBytes.read;
                    if (setBackInvokedCallbackEnabled.read(this.AudioAttributesImplApi21Parcelizer, copyhexbytes, copyhexbytes2)) {
                        return;
                    }
                    StringBuilder sb = new StringBuilder("Unexpected state change from: ");
                    sb.append(copyhexbytes);
                    sb.append(" to: ");
                    sb.append(copyhexbytes2);
                    sb.append('.');
                    getInputCodeUtf8JsNames.read(sb.toString());
                    return;
                case 5:
                    throw new IllegalStateException("The paused composition has already been applied".toString());
                case 6:
                    throw new IllegalStateException("The paused composition has been cancelled".toString());
                case 7:
                    throw new IllegalStateException("The paused composition is invalid because of a previous exception".toString());
                default:
                    throw new RenewEligibleCreator();
            }
        } catch (Exception e) {
            this.AudioAttributesImplApi21Parcelizer.set(copyHexBytes.AudioAttributesCompatParcelizer);
            throw e;
        }
    }

    @Override // kotlin.getInputCodeLatin1
    public final void IconCompatParcelizer() {
        this.AudioAttributesImplApi21Parcelizer.set(copyHexBytes.RemoteActionCompatParcelizer);
        setButtonDrawable<constructReadConstrainedTextBuffer> setbuttondrawableAudioAttributesCompatParcelizer = this.MediaDescriptionCompat.AudioAttributesCompatParcelizer();
        this.MediaDescriptionCompat.read();
        this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(setbuttondrawableAudioAttributesCompatParcelizer);
    }

    public final void MediaBrowserCompatItemReceiver() {
        setBackInvokedCallbackEnabled.read(this.AudioAttributesImplApi21Parcelizer, copyHexBytes.write, copyHexBytes.AudioAttributesImplBaseParcelizer);
    }

    private final void AudioAttributesImplBaseParcelizer() {
        copyHexBytes copyhexbytes = copyHexBytes.AudioAttributesImplBaseParcelizer;
        copyHexBytes copyhexbytes2 = copyHexBytes.write;
        if (setBackInvokedCallbackEnabled.read(this.AudioAttributesImplApi21Parcelizer, copyhexbytes, copyhexbytes2)) {
            return;
        }
        StringBuilder sb = new StringBuilder("Unexpected state change from: ");
        sb.append(copyhexbytes);
        sb.append(" to: ");
        sb.append(copyhexbytes2);
        sb.append('.');
        getInputCodeUtf8JsNames.read(sb.toString());
    }

    private final void AudioAttributesImplApi21Parcelizer() {
        Object objIconCompatParcelizer = multiplyConjugate.INSTANCE.IconCompatParcelizer("PausedComposition:applyChanges");
        try {
            synchronized (this.AudioAttributesImplBaseParcelizer) {
                try {
                    allocNameCopyBuffer<Object> allocnamecopybuffer = this.MediaMetadataCompat;
                    _closeInput<?> _closeinput = this.MediaBrowserCompatItemReceiver;
                    toMagicModuleMetaRepoModel.read(_closeinput, "");
                    allocnamecopybuffer.AudioAttributesCompatParcelizer(_closeinput, this.MediaDescriptionCompat);
                    this.MediaDescriptionCompat.RemoteActionCompatParcelizer();
                    this.MediaDescriptionCompat.write();
                    this.MediaDescriptionCompat.read();
                    this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer((setButtonDrawable<constructReadConstrainedTextBuffer>) null);
                    getShowPopup getshowpopup = getShowPopup.INSTANCE;
                } catch (Throwable th) {
                    this.MediaDescriptionCompat.read();
                    this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer((setButtonDrawable<constructReadConstrainedTextBuffer>) null);
                    throw th;
                }
            }
            getShowPopup getshowpopup2 = getShowPopup.INSTANCE;
        } finally {
            multiplyConjugate.INSTANCE.write(objIconCompatParcelizer);
        }
    }
}
