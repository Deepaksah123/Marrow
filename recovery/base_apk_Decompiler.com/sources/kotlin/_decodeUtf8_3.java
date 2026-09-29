package kotlin;

import kotlin.MagicModuleUseCaseImplWhenMappings;
import kotlin.Metadata;
import kotlin._handleOddName;
import kotlin.createForPropertyOverride;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 \u001c2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006:\u0001\u001cB?\u0012\u001c\b\u0002\u0010\u000b\u001a\u0016\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007\u0012\u0018\b\u0002\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\f¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0014\u001a\u00020\u00162\u0006\u0010\u000b\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0014\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001a\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001b\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001c\u0010\u0019J\u0017\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u000b\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001d\u0010\u0017J\u0017\u0010\u001e\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001e\u0010\u0019R*\u0010\u001d\u001a\u0016\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\u00078\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001fR$\u0010\u001e\u001a\u0012\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\f8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010 R\u001a\u0010\u0014\u001a\u00020!8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u001b\u0010\"\u001a\u0004\b\u0018\u0010#R\u0014\u0010\u001c\u001a\u00020$8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010%R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010&R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u001c\u0010,\u001a\u00020\u00138\u0001@\u0000X\u0081\f¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b\u001a\u0010+"}, d2 = {"Lo/_decodeUtf8_3;", "Lo/_handleOddName$IconCompatParcelizer;", "Lo/createForPropertyOverride;", "Lo/_decodeUtf8_4;", "Lo/_padLastQuad;", "Lo/_skipWS2;", "Lo/_skipUtf8_3;", "Lkotlin/Function2;", "Lo/_skipUtf8_4;", "Lo/getReferencedType;", "", "p0", "Lkotlin/Function1;", "Lo/_closeArrayScope;", "p1", "<init>", "(Lo/MagicModuleSubmissionRequestBody;Lo/getAnswerMap;)V", "MediaDescriptionCompat", "()V", "Lo/getKey;", "AudioAttributesCompatParcelizer", "(J)V", "", "(Lo/_closeArrayScope;)Z", "MediaBrowserCompatItemReceiver", "(Lo/_closeArrayScope;)V", "read", "AudioAttributesImplApi21Parcelizer", "write", "RemoteActionCompatParcelizer", "IconCompatParcelizer", "Lo/MagicModuleSubmissionRequestBody;", "Lo/getAnswerMap;", "", "Ljava/lang/Object;", "()Ljava/lang/Object;", "Lo/_decodeUtf8_3fast;", "()Lo/_decodeUtf8_3fast;", "Lo/_decodeUtf8_3;", "MediaBrowserCompatCustomActionResultReceiver", "Lo/_skipUtf8_3;", "AudioAttributesImplApi26Parcelizer", "J", "()J", "AudioAttributesImplBaseParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class _decodeUtf8_3 extends _handleOddName.IconCompatParcelizer implements createForPropertyOverride, _decodeUtf8_4, _padLastQuad, _skipWS2 {

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private final Object AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private long AudioAttributesImplBaseParcelizer;
    private final getAnswerMap<_closeArrayScope, _skipUtf8_3> IconCompatParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private _skipUtf8_3 MediaBrowserCompatItemReceiver;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private _decodeUtf8_3 read;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private MagicModuleSubmissionRequestBody<? super _skipUtf8_4, ? super getReferencedType, getShowPopup> RemoteActionCompatParcelizer;
    private static final write write = new write(null);
    public static final int AudioAttributesCompatParcelizer = 8;

    /* JADX WARN: Multi-variable type inference failed */
    public _decodeUtf8_3(MagicModuleSubmissionRequestBody<? super _skipUtf8_4, ? super getReferencedType, getShowPopup> magicModuleSubmissionRequestBody, getAnswerMap<? super _closeArrayScope, ? extends _skipUtf8_3> getanswermap) {
        this.RemoteActionCompatParcelizer = magicModuleSubmissionRequestBody;
        this.IconCompatParcelizer = getanswermap;
        this.AudioAttributesCompatParcelizer = write.IconCompatParcelizer.INSTANCE;
        this.AudioAttributesImplBaseParcelizer = getKey.INSTANCE.RemoteActionCompatParcelizer();
    }

    public /* synthetic */ _decodeUtf8_3(MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody, getAnswerMap getanswermap, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i & 1) != 0 ? null : magicModuleSubmissionRequestBody, (i & 2) != 0 ? null : getanswermap);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/_decodeUtf8_3$write;", "", "<init>", "()V", "IconCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class write {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/_decodeUtf8_3$write$IconCompatParcelizer;", "", "<init>", "()V"}, k = 1, mv = {2, 0, 0}, xi = 48)
        static final class IconCompatParcelizer {
            public static final IconCompatParcelizer INSTANCE = new IconCompatParcelizer();

            private IconCompatParcelizer() {
            }
        }

        private write() {
        }

        public /* synthetic */ write(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    @Override // kotlin.createForPropertyOverride
    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from getter */
    public final Object getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final _decodeUtf8_3fast write() {
        return collectLongDefaults.MediaBrowserCompatCustomActionResultReceiver(this).MediaBrowserCompatSearchResultReceiver();
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final long getAudioAttributesImplBaseParcelizer() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    @Override // o._handleOddName.IconCompatParcelizer
    public final void MediaDescriptionCompat() {
        this.MediaBrowserCompatItemReceiver = null;
        this.read = null;
    }

    @Override // kotlin._writeCloseable
    public final void AudioAttributesCompatParcelizer(long p0) {
        this.AudioAttributesImplBaseParcelizer = p0;
    }

    public final boolean AudioAttributesCompatParcelizer(_closeArrayScope p0) {
        MagicModuleUseCaseImplWhenMappings.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = new MagicModuleUseCaseImplWhenMappings.AudioAttributesCompatParcelizer();
        _decodeUtf8_2.read(this, (getAnswerMap<? super _decodeUtf8_3, ? extends createForPropertyOverride.Companion.IconCompatParcelizer>) ((getAnswerMap<? super createForPropertyOverride, ? extends createForPropertyOverride.Companion.IconCompatParcelizer>) new AnonymousClass2(p0, this, audioAttributesCompatParcelizer)));
        return audioAttributesCompatParcelizer.IconCompatParcelizer;
    }

    /* JADX INFO: renamed from: o._decodeUtf8_3$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/_decodeUtf8_3;", "p0", "Lo/createForPropertyOverride$write$IconCompatParcelizer;", "AudioAttributesCompatParcelizer", "(Lo/_decodeUtf8_3;)Lo/createForPropertyOverride$write$IconCompatParcelizer;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass2 extends MagicModuleUseCase implements getAnswerMap<_decodeUtf8_3, createForPropertyOverride.Companion.IconCompatParcelizer> {
        final /* synthetic */ _closeArrayScope $AudioAttributesCompatParcelizer;
        final /* synthetic */ MagicModuleUseCaseImplWhenMappings.AudioAttributesCompatParcelizer $IconCompatParcelizer;
        final /* synthetic */ _decodeUtf8_3 RemoteActionCompatParcelizer;

        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final createForPropertyOverride.Companion.IconCompatParcelizer invoke(_decodeUtf8_3 _decodeutf8_3) {
            if (_decodeutf8_3.getRatingCompat()) {
                if (_decodeutf8_3.MediaBrowserCompatItemReceiver != null) {
                    reportWrongTokenException.read("DragAndDropTarget self reference must be null at the start of a drag and drop session");
                }
                getAnswerMap getanswermap = _decodeutf8_3.IconCompatParcelizer;
                _decodeutf8_3.MediaBrowserCompatItemReceiver = getanswermap != null ? (_skipUtf8_3) getanswermap.invoke(this.$AudioAttributesCompatParcelizer) : null;
                boolean z = _decodeutf8_3.MediaBrowserCompatItemReceiver != null;
                if (z) {
                    this.RemoteActionCompatParcelizer.write().IconCompatParcelizer(_decodeutf8_3);
                }
                MagicModuleUseCaseImplWhenMappings.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = this.$IconCompatParcelizer;
                audioAttributesCompatParcelizer.IconCompatParcelizer = audioAttributesCompatParcelizer.IconCompatParcelizer || z;
                return createForPropertyOverride.Companion.IconCompatParcelizer.read;
            }
            return createForPropertyOverride.Companion.IconCompatParcelizer.IconCompatParcelizer;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(_closeArrayScope _closearrayscope, _decodeUtf8_3 _decodeutf8_3, MagicModuleUseCaseImplWhenMappings.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
            super(1);
            this.$AudioAttributesCompatParcelizer = _closearrayscope;
            this.RemoteActionCompatParcelizer = _decodeutf8_3;
            this.$IconCompatParcelizer = audioAttributesCompatParcelizer;
        }
    }

    @Override // kotlin._skipUtf8_3
    public final void MediaBrowserCompatItemReceiver(_closeArrayScope p0) {
        _skipUtf8_3 _skiputf8_3 = this.MediaBrowserCompatItemReceiver;
        if (_skiputf8_3 == null) {
            _decodeUtf8_3 _decodeutf8_3 = this.read;
            if (_decodeutf8_3 != null) {
                _decodeutf8_3.MediaBrowserCompatItemReceiver(p0);
                return;
            }
            return;
        }
        _skiputf8_3.MediaBrowserCompatItemReceiver(p0);
    }

    @Override // kotlin._skipUtf8_3
    public final void read(_closeArrayScope p0) {
        _skipUtf8_3 _skiputf8_3 = this.MediaBrowserCompatItemReceiver;
        if (_skiputf8_3 == null) {
            _decodeUtf8_3 _decodeutf8_3 = this.read;
            if (_decodeutf8_3 != null) {
                _decodeutf8_3.read(p0);
                return;
            }
            return;
        }
        _skiputf8_3.read(p0);
    }

    @Override // kotlin._skipUtf8_3
    public final void AudioAttributesImplApi21Parcelizer(_closeArrayScope p0) {
        createForPropertyOverride createforpropertyoverride;
        _decodeUtf8_3 _decodeutf8_3;
        _decodeUtf8_3 _decodeutf8_32 = this.read;
        if (_decodeutf8_32 == null || !_decodeUtf8_2.IconCompatParcelizer(_decodeutf8_32, _skipUtf8_2.read(p0))) {
            _decodeUtf8_3 _decodeutf8_33 = this;
            if (_decodeutf8_33.getRead().getRatingCompat()) {
                MagicModuleUseCaseImplWhenMappings.write writeVar = new MagicModuleUseCaseImplWhenMappings.write();
                PropertyName.read(_decodeutf8_33, (getAnswerMap<? super _decodeUtf8_3, ? extends createForPropertyOverride.Companion.IconCompatParcelizer>) new AnonymousClass4(writeVar, this, p0));
                createforpropertyoverride = (createForPropertyOverride) writeVar.write;
            } else {
                createforpropertyoverride = null;
            }
            _decodeutf8_3 = (_decodeUtf8_3) createforpropertyoverride;
        } else {
            _decodeutf8_3 = _decodeutf8_32;
        }
        if (_decodeutf8_3 != null && _decodeutf8_32 == null) {
            _decodeUtf8_2.RemoteActionCompatParcelizer(_decodeutf8_3, p0);
            _skipUtf8_3 _skiputf8_3 = this.MediaBrowserCompatItemReceiver;
            if (_skiputf8_3 != null) {
                _skiputf8_3.write(p0);
            }
        } else if (_decodeutf8_3 == null && _decodeutf8_32 != null) {
            _skipUtf8_3 _skiputf8_32 = this.MediaBrowserCompatItemReceiver;
            if (_skiputf8_32 != null) {
                _decodeUtf8_2.RemoteActionCompatParcelizer(_skiputf8_32, p0);
            }
            _decodeutf8_32.write(p0);
        } else if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(_decodeutf8_3, _decodeutf8_32)) {
            if (_decodeutf8_3 != null) {
                _decodeUtf8_2.RemoteActionCompatParcelizer(_decodeutf8_3, p0);
            }
            if (_decodeutf8_32 != null) {
                _decodeutf8_32.write(p0);
            }
        } else if (_decodeutf8_3 != null) {
            _decodeutf8_3.AudioAttributesImplApi21Parcelizer(p0);
        } else {
            _skipUtf8_3 _skiputf8_33 = this.MediaBrowserCompatItemReceiver;
            if (_skiputf8_33 != null) {
                _skiputf8_33.AudioAttributesImplApi21Parcelizer(p0);
            }
        }
        this.read = _decodeutf8_3;
    }

    @Override // kotlin._skipUtf8_3
    public final void write(_closeArrayScope p0) {
        _skipUtf8_3 _skiputf8_3 = this.MediaBrowserCompatItemReceiver;
        if (_skiputf8_3 != null) {
            _skiputf8_3.write(p0);
        }
        _decodeUtf8_3 _decodeutf8_3 = this.read;
        if (_decodeutf8_3 != null) {
            _decodeutf8_3.write(p0);
        }
        this.read = null;
    }

    @Override // kotlin._skipUtf8_3
    public final boolean RemoteActionCompatParcelizer(_closeArrayScope p0) {
        _decodeUtf8_3 _decodeutf8_3 = this.read;
        if (_decodeutf8_3 == null) {
            _skipUtf8_3 _skiputf8_3 = this.MediaBrowserCompatItemReceiver;
            if (_skiputf8_3 != null) {
                return _skiputf8_3.RemoteActionCompatParcelizer(p0);
            }
            return false;
        }
        return _decodeutf8_3.RemoteActionCompatParcelizer(p0);
    }

    @Override // kotlin._skipUtf8_3
    public final void IconCompatParcelizer(_closeArrayScope p0) {
        _decodeUtf8_2.read(this, (getAnswerMap<? super _decodeUtf8_3, ? extends createForPropertyOverride.Companion.IconCompatParcelizer>) ((getAnswerMap<? super createForPropertyOverride, ? extends createForPropertyOverride.Companion.IconCompatParcelizer>) new AnonymousClass5(p0)));
    }

    /* JADX INFO: renamed from: o._decodeUtf8_3$5, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/_decodeUtf8_3;", "p0", "Lo/createForPropertyOverride$write$IconCompatParcelizer;", "read", "(Lo/_decodeUtf8_3;)Lo/createForPropertyOverride$write$IconCompatParcelizer;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass5 extends MagicModuleUseCase implements getAnswerMap<_decodeUtf8_3, createForPropertyOverride.Companion.IconCompatParcelizer> {
        final /* synthetic */ _closeArrayScope $read;

        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public final createForPropertyOverride.Companion.IconCompatParcelizer invoke(_decodeUtf8_3 _decodeutf8_3) {
            if (_decodeutf8_3.getRead().getRatingCompat()) {
                _skipUtf8_3 _skiputf8_3 = _decodeutf8_3.MediaBrowserCompatItemReceiver;
                if (_skiputf8_3 != null) {
                    _skiputf8_3.IconCompatParcelizer(this.$read);
                }
                _decodeutf8_3.MediaBrowserCompatItemReceiver = null;
                _decodeutf8_3.read = null;
                return createForPropertyOverride.Companion.IconCompatParcelizer.read;
            }
            return createForPropertyOverride.Companion.IconCompatParcelizer.IconCompatParcelizer;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass5(_closeArrayScope _closearrayscope) {
            super(1);
            this.$read = _closearrayscope;
        }
    }

    /* JADX INFO: renamed from: o._decodeUtf8_3$4, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lo/createForPropertyOverride;", "T", "p0", "Lo/createForPropertyOverride$write$IconCompatParcelizer;", "write", "(Lo/createForPropertyOverride;)Lo/createForPropertyOverride$write$IconCompatParcelizer;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class AnonymousClass4 extends MagicModuleUseCase implements getAnswerMap<_decodeUtf8_3, createForPropertyOverride.Companion.IconCompatParcelizer> {
        final /* synthetic */ _closeArrayScope $IconCompatParcelizer;
        final /* synthetic */ MagicModuleUseCaseImplWhenMappings.write $RemoteActionCompatParcelizer;
        final /* synthetic */ _decodeUtf8_3 read;

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public final createForPropertyOverride.Companion.IconCompatParcelizer invoke(_decodeUtf8_3 _decodeutf8_3) {
            _decodeUtf8_3 _decodeutf8_32 = _decodeutf8_3;
            if (this.read.write().AudioAttributesCompatParcelizer(_decodeutf8_32) && _decodeUtf8_2.IconCompatParcelizer(_decodeutf8_32, _skipUtf8_2.read(this.$IconCompatParcelizer))) {
                this.$RemoteActionCompatParcelizer.write = _decodeutf8_3;
                return createForPropertyOverride.Companion.IconCompatParcelizer.write;
            }
            return createForPropertyOverride.Companion.IconCompatParcelizer.read;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(MagicModuleUseCaseImplWhenMappings.write writeVar, _decodeUtf8_3 _decodeutf8_3, _closeArrayScope _closearrayscope) {
            super(1);
            this.$RemoteActionCompatParcelizer = writeVar;
            this.read = _decodeutf8_3;
            this.$IconCompatParcelizer = _closearrayscope;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public _decodeUtf8_3() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
