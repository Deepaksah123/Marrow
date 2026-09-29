package kotlin;

import kotlin.Metadata;
import kotlin._assertNotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u001a2\u00020\u0001:\u0002\u000e\u001aB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u000fJ\u0017\u0010\u000b\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000b\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0011\u0010\u000fJ'\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0014¢\u0006\u0004\b\u0010\u0010\u0017J5\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00132\u0014\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0018H\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001c\u0010\bJ\u0017\u0010\u000b\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u000b\u0010\u001eJ!\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u001f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u000b\u0010 J7\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020!2\u0006\u0010\u0014\u001a\u00020\"2\u0006\u0010\u0016\u001a\u00020#2\u0006\u0010%\u001a\u00020$2\u0006\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b\u001a\u0010(R\u001a\u0010\u0011\u001a\u00020)8\u0017X\u0096\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R.\u0010\u000b\u001a\u0004\u0018\u00010.2\b\u0010\u0003\u001a\u0004\u0018\u00010.8\u0017@UX\u0097\u000e¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b\u000b\u00103"}, d2 = {"Lo/registerSubtypes;", "Lo/_bindAndClose;", "Lo/_assertNotNull;", "p0", "<init>", "(Lo/_assertNotNull;)V", "", "RatingCompat", "()V", "Lo/PropertyValueAny;", "Lo/_parser;", "write", "(J)Lo/_parser;", "", "AudioAttributesCompatParcelizer", "(I)I", "read", "IconCompatParcelizer", "Lo/hasReferringProperties;", "", "p1", "Lo/hasAnyGetter;", "p2", "(JFLo/hasAnyGetter;)V", "Lkotlin/Function1;", "Lo/validateAppend;", "RemoteActionCompatParcelizer", "(JFLo/getAnswerMap;)V", "onCustomAction", "Lo/weirdNumberException;", "(Lo/weirdNumberException;)I", "Lo/JsonParserDelegate;", "(Lo/JsonParserDelegate;Lo/hasAnyGetter;)V", "Lo/_bindAndClose$RemoteActionCompatParcelizer;", "Lo/getReferencedType;", "Lo/addValueInstantiators;", "Lo/handleWeirdNumberValue;", "p3", "", "p4", "(Lo/_bindAndClose$RemoteActionCompatParcelizer;JLo/addValueInstantiators;IZ)V", "Lo/withMergeInfo;", "MediaBrowserCompatCustomActionResultReceiver", "Lo/withMergeInfo;", "onCommand", "()Lo/withMergeInfo;", "Lo/readerFor;", "MediaBrowserCompatItemReceiver", "Lo/readerFor;", "MediaMetadataCompat", "()Lo/readerFor;", "(Lo/readerFor;)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class registerSubtypes extends _bindAndClose {
    private static final releaseBuffers read;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private final withMergeInfo IconCompatParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private readerFor write;

    public registerSubtypes(_assertNotNull _assertnotnull) {
        super(_assertnotnull);
        this.IconCompatParcelizer = new withMergeInfo();
        MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver().RemoteActionCompatParcelizer(this);
        this.write = _assertnotnull.getMediaBrowserCompatSearchResultReceiver() != null ? new AudioAttributesCompatParcelizer() : null;
    }

    @Override // kotlin._bindAndClose
    /* JADX INFO: renamed from: onCommand, reason: from getter and merged with bridge method [inline-methods] */
    public final withMergeInfo MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
        return this.IconCompatParcelizer;
    }

    @Override // kotlin._bindAndClose
    /* JADX INFO: renamed from: MediaMetadataCompat, reason: from getter */
    public final readerFor getAudioAttributesCompatParcelizer() {
        return this.write;
    }

    @Override // kotlin._bindAndClose
    protected final void write(readerFor readerfor) {
        this.write = readerfor;
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u0007\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0007\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0011\u0010\u0010J\u0017\u0010\u0007\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0007\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0012\u0010\u0010"}, d2 = {"Lo/registerSubtypes$AudioAttributesCompatParcelizer;", "Lo/readerFor;", "<init>", "(Lo/registerSubtypes;)V", "Lo/PropertyValueAny;", "p0", "Lo/_parser;", "write", "(J)Lo/_parser;", "Lo/weirdNumberException;", "", "(Lo/weirdNumberException;)I", "", "RemoteActionCompatParcelizer", "()V", "AudioAttributesCompatParcelizer", "(I)I", "read", "IconCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
    final class AudioAttributesCompatParcelizer extends readerFor {
        public AudioAttributesCompatParcelizer() {
            super(registerSubtypes.this);
        }

        @Override // kotlin.isTypeOrSuperTypeOf
        public final _parser write(long p0) {
            AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = this;
            audioAttributesCompatParcelizer.AudioAttributesImplApi26Parcelizer(p0);
            UTF32Reader<_assertNotNull> uTF32ReaderAddObserverForBackInvoker = getIconCompatParcelizer().addObserverForBackInvoker();
            _assertNotNull[] _assertnotnullArr = uTF32ReaderAddObserverForBackInvoker.IconCompatParcelizer;
            int audioAttributesCompatParcelizer2 = uTF32ReaderAddObserverForBackInvoker.getAudioAttributesCompatParcelizer();
            for (int i = 0; i < audioAttributesCompatParcelizer2; i++) {
                setPropertyNamingStrategy setpropertynamingstrategyMediaSessionCompatToken = _assertnotnullArr[i].MediaSessionCompatToken();
                toMagicModuleMetaRepoModel.write(setpropertynamingstrategyMediaSessionCompatToken);
                setpropertynamingstrategyMediaSessionCompatToken.write(_assertNotNull.MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer);
            }
            audioAttributesCompatParcelizer.read(getIconCompatParcelizer().getOnSkipToPrevious().AudioAttributesCompatParcelizer(this, getIconCompatParcelizer().onMediaButtonEvent(), p0));
            return audioAttributesCompatParcelizer;
        }

        @Override // kotlin.createDeserializationContext
        public final int write(weirdNumberException p0) {
            Integer num = MediaBrowserCompatItemReceiver().RemoteActionCompatParcelizer().get(p0);
            int iIntValue = num != null ? num.intValue() : Integer.MIN_VALUE;
            MediaMetadataCompat().RemoteActionCompatParcelizer(p0, iIntValue);
            return iIntValue;
        }

        @Override // kotlin.readerFor
        protected final void RemoteActionCompatParcelizer() {
            setPropertyNamingStrategy setpropertynamingstrategyMediaSessionCompatToken = getIconCompatParcelizer().MediaSessionCompatToken();
            toMagicModuleMetaRepoModel.write(setpropertynamingstrategyMediaSessionCompatToken);
            setpropertynamingstrategyMediaSessionCompatToken.onPrepareFromMediaId();
        }

        @Override // kotlin.readerFor, kotlin.hasHandlers
        public final int AudioAttributesCompatParcelizer(int p0) {
            return getIconCompatParcelizer().AudioAttributesImplApi21Parcelizer(p0);
        }

        @Override // kotlin.readerFor, kotlin.hasHandlers
        public final int read(int p0) {
            return getIconCompatParcelizer().AudioAttributesImplApi26Parcelizer(p0);
        }

        @Override // kotlin.readerFor, kotlin.hasHandlers
        public final int write(int p0) {
            return getIconCompatParcelizer().read(p0);
        }

        @Override // kotlin.readerFor, kotlin.hasHandlers
        public final int IconCompatParcelizer(int p0) {
            return getIconCompatParcelizer().write(p0);
        }
    }

    @Override // kotlin._bindAndClose
    public final void RatingCompat() {
        if (getAudioAttributesCompatParcelizer() == null) {
            write(new AudioAttributesCompatParcelizer());
        }
    }

    @Override // kotlin.isTypeOrSuperTypeOf
    public final _parser write(long p0) {
        if (getAudioAttributesCompatParcelizer()) {
            readerFor write = getAudioAttributesCompatParcelizer();
            toMagicModuleMetaRepoModel.write(write);
            p0 = write.RatingCompat();
        }
        AudioAttributesImplApi26Parcelizer(p0);
        UTF32Reader<_assertNotNull> uTF32ReaderAddObserverForBackInvoker = getIconCompatParcelizer().addObserverForBackInvoker();
        _assertNotNull[] _assertnotnullArr = uTF32ReaderAddObserverForBackInvoker.IconCompatParcelizer;
        int audioAttributesCompatParcelizer = uTF32ReaderAddObserverForBackInvoker.getAudioAttributesCompatParcelizer();
        for (int i = 0; i < audioAttributesCompatParcelizer; i++) {
            _assertnotnullArr[i].ParcelableVolumeInfo().RemoteActionCompatParcelizer(_assertNotNull.MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer);
        }
        RemoteActionCompatParcelizer(getIconCompatParcelizer().getOnSkipToPrevious().AudioAttributesCompatParcelizer(this, getIconCompatParcelizer().onFastForward(), p0));
        r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0();
        return this;
    }

    @Override // kotlin.hasHandlers
    public final int AudioAttributesCompatParcelizer(int p0) {
        return getIconCompatParcelizer().AudioAttributesImplBaseParcelizer(p0);
    }

    @Override // kotlin.hasHandlers
    public final int read(int p0) {
        return getIconCompatParcelizer().MediaBrowserCompatCustomActionResultReceiver(p0);
    }

    @Override // kotlin.hasHandlers
    public final int write(int p0) {
        return getIconCompatParcelizer().IconCompatParcelizer(p0);
    }

    @Override // kotlin.hasHandlers
    public final int IconCompatParcelizer(int p0) {
        return getIconCompatParcelizer().AudioAttributesCompatParcelizer(p0);
    }

    @Override // kotlin._bindAndClose, kotlin._parser
    public final void read(long p0, float p1, hasAnyGetter p2) {
        super.read(p0, p1, p2);
        onCustomAction();
    }

    @Override // kotlin._bindAndClose, kotlin._parser
    public final void RemoteActionCompatParcelizer(long p0, float p1, getAnswerMap<? super validateAppend, getShowPopup> p2) {
        super.RemoteActionCompatParcelizer(p0, p1, p2);
        onCustomAction();
    }

    private final void onCustomAction() {
        if (getRatingCompat()) {
            return;
        }
        getIconCompatParcelizer().ParcelableVolumeInfo().onSeekTo();
    }

    @Override // kotlin.createDeserializationContext
    public final int write(weirdNumberException p0) {
        readerFor write = getAudioAttributesCompatParcelizer();
        if (write != null) {
            return write.write(p0);
        }
        Integer num = onSetPlaybackSpeed().RemoteActionCompatParcelizer().get(p0);
        if (num != null) {
            return num.intValue();
        }
        return Integer.MIN_VALUE;
    }

    @Override // kotlin._bindAndClose
    public final void write(JsonParserDelegate p0, hasAnyGetter p1) throws Throwable {
        _configureGenerator _configuregeneratorAudioAttributesCompatParcelizer = _serializerProvider.AudioAttributesCompatParcelizer(getIconCompatParcelizer());
        UTF32Reader<_assertNotNull> uTF32ReaderAccessonBackPresseds1027565324 = getIconCompatParcelizer().accessonBackPresseds1027565324();
        _assertNotNull[] _assertnotnullArr = uTF32ReaderAccessonBackPresseds1027565324.IconCompatParcelizer;
        int audioAttributesCompatParcelizer = uTF32ReaderAccessonBackPresseds1027565324.getAudioAttributesCompatParcelizer();
        for (int i = 0; i < audioAttributesCompatParcelizer; i++) {
            _assertNotNull _assertnotnull = _assertnotnullArr[i];
            if (_assertnotnull.MediaDescriptionCompat()) {
                _assertnotnull.RemoteActionCompatParcelizer(p0, p1);
            }
        }
        if (_configuregeneratorAudioAttributesCompatParcelizer.getShowLayoutBounds()) {
            AudioAttributesCompatParcelizer(p0, read);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    @Override // kotlin._bindAndClose
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void RemoteActionCompatParcelizer(o._bindAndClose.RemoteActionCompatParcelizer r17, long r18, kotlin.addValueInstantiators r20, int r21, boolean r22) {
        /*
            r16 = this;
            r0 = r16
            r7 = r18
            o._assertNotNull r1 = r16.getIconCompatParcelizer()
            r9 = r17
            boolean r1 = r9.RemoteActionCompatParcelizer(r1)
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L42
            boolean r1 = r0.RatingCompat(r7)
            if (r1 == 0) goto L1d
            r10 = r21
            r3 = r22
            goto L3f
        L1d:
            o.handleWeirdNumberValue$write r1 = kotlin.handleWeirdNumberValue.INSTANCE
            int r1 = r1.AudioAttributesCompatParcelizer()
            r10 = r21
            boolean r1 = kotlin.handleWeirdNumberValue.read(r10, r1)
            if (r1 == 0) goto L44
            long r4 = r16.onSkipToQueueItem()
            float r1 = r0.write(r7, r4)
            int r1 = java.lang.Float.floatToRawIntBits(r1)
            r4 = 2147483647(0x7fffffff, float:NaN)
            r1 = r1 & r4
            r4 = 2139095040(0x7f800000, float:Infinity)
            if (r1 >= r4) goto L44
        L3f:
            r11 = r3
            r3 = r2
            goto L45
        L42:
            r10 = r21
        L44:
            r11 = r3
        L45:
            if (r3 == 0) goto L90
            int r12 = kotlin.addValueInstantiators.read(r20)
            o._assertNotNull r0 = r16.getIconCompatParcelizer()
            o.UTF32Reader r0 = r0.accessonBackPresseds1027565324()
            T[] r13 = r0.IconCompatParcelizer
            int r0 = r0.getAudioAttributesCompatParcelizer()
            int r0 = r0 - r2
            r14 = r0
        L5b:
            if (r14 < 0) goto L8b
            r0 = r13[r14]
            r15 = r0
            o._assertNotNull r15 = (kotlin._assertNotNull) r15
            boolean r0 = r15.MediaDescriptionCompat()
            if (r0 == 0) goto L88
            r0 = r17
            r1 = r15
            r2 = r18
            r4 = r20
            r5 = r21
            r6 = r11
            r0.IconCompatParcelizer(r1, r2, r4, r5, r6)
            boolean r0 = r20.write()
            if (r0 == 0) goto L88
            o._bindAndClose r0 = r15.r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8()
            boolean r0 = r0._init_lambda5()
            if (r0 == 0) goto L8b
            r20.IconCompatParcelizer()
        L88:
            int r14 = r14 + (-1)
            goto L5b
        L8b:
            r0 = r20
            kotlin.addValueInstantiators.AudioAttributesCompatParcelizer(r0, r12)
        L90:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.registerSubtypes.RemoteActionCompatParcelizer(o._bindAndClose$RemoteActionCompatParcelizer, long, o.addValueInstantiators, int, boolean):void");
    }

    static {
        releaseBuffers releasebuffersAudioAttributesCompatParcelizer = fromInitial.AudioAttributesCompatParcelizer();
        releasebuffersAudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(switchToNext.INSTANCE.read());
        releasebuffersAudioAttributesCompatParcelizer.write(1.0f);
        releasebuffersAudioAttributesCompatParcelizer.write(ThreadLocalBufferManager.INSTANCE.write());
        read = releasebuffersAudioAttributesCompatParcelizer;
    }
}
