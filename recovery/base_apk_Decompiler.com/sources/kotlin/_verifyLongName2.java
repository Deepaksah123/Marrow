package kotlin;

import android.view.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import kotlin.MagicModuleUseCaseImplWhenMappings;
import kotlin.Metadata;
import kotlin._handleOddName;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\u000b\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\r\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u000b\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u000b\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J/\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\r\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\u0018J\u001f\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0016\u0010\u0019J\u0017\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0012\u0010\u0018J\u001f\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0016\u0010\u001aJ7\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0003\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\t2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\n0\u001bH\u0016¢\u0006\u0004\b\u000b\u0010\u001dJ%\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u001e2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\n0\u001fH\u0016¢\u0006\u0004\b\u0012\u0010 J\u0017\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u0016\u0010!J%\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\"2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\n0\u001fH\u0016¢\u0006\u0004\b\u0012\u0010#J\u0017\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020$H\u0016¢\u0006\u0004\b\u0012\u0010%J\u000f\u0010\r\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\r\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0011J\u0017\u0010\u000b\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u000b\u0010&J\u0017\u0010(\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020'H\u0016¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\u000fH\u0016¢\u0006\u0004\b*\u0010\u0011J\u0011\u0010(\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b(\u0010+J\u000f\u0010,\u001a\u00020\nH\u0016¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\nH\u0016¢\u0006\u0004\b.\u0010-J\u0011\u0010/\u001a\u0004\u0018\u00010\u001cH\u0002¢\u0006\u0004\b/\u00100J\u0015\u0010\u0016\u001a\u0004\u0018\u000102*\u000201H\u0002¢\u0006\u0004\b\u0016\u00103J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u001eH\u0002¢\u0006\u0004\b\u000b\u0010!R\u0014\u0010(\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u001c\u0010\u0012\u001a\u00020\u001c8\u0001@\u0000X\u0080\f¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u00100R\u0014\u0010\u000b\u001a\u00020;8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010<R\u001a\u0010\u0016\u001a\u00020=8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b.\u0010>\u001a\u0004\b4\u0010?R\u0018\u00104\u001a\u0004\u0018\u00010@8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\r\u0010AR\u0014\u0010,\u001a\u00020B8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b8\u0010CR \u00108\u001a\b\u0012\u0004\u0012\u00020E0D8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0016\u0010F\u001a\u0004\b6\u0010GR.\u00106\u001a\u0004\u0018\u00010\u001c2\b\u0010\u0003\u001a\u0004\u0018\u00010\u001c8W@WX\u0097\u000e¢\u0006\u0012\n\u0004\b(\u00109\u001a\u0004\b\u0016\u00100\"\u0004\b\r\u0010&R*\u0010.\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\n8\u0017@WX\u0097\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010H\u001a\u0004\bI\u0010-\"\u0004\b(\u0010\u0013"}, d2 = {"Lo/_verifyLongName2;", "Lo/nukeSymbols;", "Lo/CharsToNameCanonicalizerTableInfo;", "p0", "Lo/_configureGenerator;", "p1", "<init>", "(Lo/CharsToNameCanonicalizerTableInfo;Lo/_configureGenerator;)V", "Lo/_checkNeedForRehash;", "Lo/WritableTypeIdInclusion;", "", "AudioAttributesCompatParcelizer", "(Lo/_checkNeedForRehash;Lo/WritableTypeIdInclusion;)Z", "IconCompatParcelizer", "(ILo/WritableTypeIdInclusion;)Z", "", "MediaBrowserCompatSearchResultReceiver", "()V", "RemoteActionCompatParcelizer", "(Z)V", "p2", "p3", "read", "(ZZZI)Z", "(I)Z", "(ZZ)Z", "(IZ)Z", "Lkotlin/Function1;", "Lo/_handleSpillOverflow;", "(ILo/WritableTypeIdInclusion;Lo/getAnswerMap;)Ljava/lang/Boolean;", "Lo/constructType;", "Lkotlin/Function0;", "(Landroid/view/KeyEvent;Lo/getCreatedOnDateMs;)Z", "(Landroid/view/KeyEvent;)Z", "Lo/weirdNativeValueException;", "(Lo/weirdNativeValueException;Lo/getCreatedOnDateMs;)Z", "Lo/DatabindContext;", "(Lo/DatabindContext;)Z", "(Lo/_handleSpillOverflow;)V", "Lo/ByteQuadsCanonicalizer;", "write", "(Lo/ByteQuadsCanonicalizer;)V", "MediaDescriptionCompat", "()Lo/WritableTypeIdInclusion;", "AudioAttributesImplApi26Parcelizer", "()Z", "MediaBrowserCompatItemReceiver", "RatingCompat", "()Lo/_handleSpillOverflow;", "Lo/Module;", "Lo/_handleOddName$IconCompatParcelizer;", "(Lo/Module;)Lo/_handleOddName$IconCompatParcelizer;", "AudioAttributesImplBaseParcelizer", "Lo/CharsToNameCanonicalizerTableInfo;", "MediaBrowserCompatCustomActionResultReceiver", "Lo/_configureGenerator;", "AudioAttributesImplApi21Parcelizer", "Lo/_handleSpillOverflow;", "MediaMetadataCompat", "Lo/_spilloverStart;", "Lo/_spilloverStart;", "Lo/_handleOddName;", "Lo/_handleOddName;", "()Lo/_handleOddName;", "Lo/setCompoundDrawables;", "Lo/setCompoundDrawables;", "Lo/CharsToNameCanonicalizer;", "()Lo/CharsToNameCanonicalizer;", "Lo/setDropDownBackgroundResource;", "Lo/_verifyLongName;", "Lo/setDropDownBackgroundResource;", "()Lo/setDropDownBackgroundResource;", "Z", "MediaBrowserCompatMediaItem"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class _verifyLongName2 implements nukeSymbols {
    private final _spilloverStart AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private final CharsToNameCanonicalizerTableInfo write;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private setCompoundDrawables AudioAttributesImplBaseParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private final _configureGenerator IconCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private boolean MediaBrowserCompatItemReceiver;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private _handleSpillOverflow MediaBrowserCompatCustomActionResultReceiver;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private _handleSpillOverflow RemoteActionCompatParcelizer = new _handleSpillOverflow(hashSeed.INSTANCE.IconCompatParcelizer(), false, null, null, 14, null);

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private final _handleOddName read = new read();

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final setDropDownBackgroundResource<_verifyLongName> AudioAttributesImplApi21Parcelizer = new setDropDownBackgroundResource<>(1);

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] AudioAttributesCompatParcelizer;

        static {
            int[] iArr = new int[_writeFieldName.values().length];
            try {
                iArr[_writeFieldName.RemoteActionCompatParcelizer.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[_writeFieldName.IconCompatParcelizer.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[_writeFieldName.read.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[_writeFieldName.AudioAttributesCompatParcelizer.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            AudioAttributesCompatParcelizer = iArr;
        }
    }

    public _verifyLongName2(CharsToNameCanonicalizerTableInfo charsToNameCanonicalizerTableInfo, _configureGenerator _configuregenerator) {
        this.write = charsToNameCanonicalizerTableInfo;
        this.IconCompatParcelizer = _configuregenerator;
        this.AudioAttributesCompatParcelizer = new _spilloverStart(this, _configuregenerator);
    }

    /* JADX INFO: renamed from: MediaMetadataCompat, reason: from getter */
    public final _handleSpillOverflow getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\u0005\u001a\u0004\u0018\u00010\fH\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Lo/_verifyLongName2$read;", "Lo/writerFor;", "Lo/_handleSpillOverflow;", "RemoteActionCompatParcelizer", "()Lo/_handleSpillOverflow;", "p0", "", "IconCompatParcelizer", "(Lo/_handleSpillOverflow;)V", "", "hashCode", "()I", "", "", "equals", "(Ljava/lang/Object;)Z"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class read extends writerFor<_handleSpillOverflow> {
        @Override // kotlin.writerFor
        public final void IconCompatParcelizer(_handleSpillOverflow p0) {
        }

        public final boolean equals(Object p0) {
            return p0 == this;
        }

        read() {
        }

        @Override // kotlin.writerFor
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final _handleSpillOverflow IconCompatParcelizer() {
            return _verifyLongName2.this.getRemoteActionCompatParcelizer();
        }

        public final int hashCode() {
            return _verifyLongName2.this.getRemoteActionCompatParcelizer().hashCode();
        }
    }

    @Override // kotlin.nukeSymbols
    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from getter */
    public final _handleOddName getRead() {
        return this.read;
    }

    @Override // kotlin.nukeSymbols
    public final boolean AudioAttributesCompatParcelizer(_checkNeedForRehash p0, WritableTypeIdInclusion p1) {
        return this.write.RemoteActionCompatParcelizer(p0, p1);
    }

    /* JADX INFO: renamed from: o._verifyLongName2$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/_handleSpillOverflow;", "p0", "", "read", "(Lo/_handleSpillOverflow;)Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass3 extends MagicModuleUseCase implements getAnswerMap<_handleSpillOverflow, Boolean> {
        final /* synthetic */ int $read;

        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(_handleSpillOverflow _handlespilloverflow) {
            return Boolean.valueOf(_handlespilloverflow.IconCompatParcelizer(this.$read));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(int i) {
            super(1);
            this.$read = i;
        }
    }

    public final boolean IconCompatParcelizer(int p0, WritableTypeIdInclusion p1) {
        Boolean boolAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(p0, p1, new AnonymousClass3(p0));
        if (boolAudioAttributesCompatParcelizer != null) {
            return boolAudioAttributesCompatParcelizer.booleanValue();
        }
        return false;
    }

    @Override // kotlin.nukeSymbols
    public final void MediaBrowserCompatSearchResultReceiver() {
        copyArrays.write(this.RemoteActionCompatParcelizer, true, true);
        if (!_verifyNoLeadingZeroes.MediaBrowserCompatCustomActionResultReceiver || read() == null) {
            return;
        }
        _handleSpillOverflow _handlespilloverflow = read();
        IconCompatParcelizer((_handleSpillOverflow) null);
        if (_handlespilloverflow != null) {
            _handlespilloverflow.read(_addSymbol.RemoteActionCompatParcelizer, _addSymbol.AudioAttributesCompatParcelizer);
        }
    }

    @Override // kotlin.nukeSymbols
    public final void AudioAttributesCompatParcelizer() {
        this.write.IconCompatParcelizer();
    }

    @Override // kotlin._resizeAndFindOffsetForAdd
    public final void RemoteActionCompatParcelizer(boolean p0) {
        read(p0, true, true, _checkNeedForRehash.INSTANCE.AudioAttributesCompatParcelizer());
    }

    @Override // kotlin.nukeSymbols
    public final boolean read(boolean p0, boolean p1, boolean p2, int p3) {
        boolean z;
        if (!p0) {
            int i = WhenMappings.AudioAttributesCompatParcelizer[copyArrays.write(this.RemoteActionCompatParcelizer, p3).ordinal()];
            if (i == 1 || i == 2 || i == 3) {
                z = false;
            } else {
                if (i != 4) {
                    throw new RenewEligibleCreator();
                }
                z = read(p0, p1);
            }
        } else {
            z = read(p0, p1);
        }
        if (z && p2) {
            AudioAttributesCompatParcelizer();
        }
        return z;
    }

    @Override // kotlin.nukeSymbols
    public final boolean IconCompatParcelizer(int p0) {
        if (!read(false, true, false, p0)) {
            return false;
        }
        Boolean boolAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(p0, null, new AnonymousClass4(p0));
        boolean zBooleanValue = boolAudioAttributesCompatParcelizer != null ? boolAudioAttributesCompatParcelizer.booleanValue() : false;
        if (!zBooleanValue) {
            AudioAttributesCompatParcelizer();
        }
        return zBooleanValue;
    }

    /* JADX INFO: renamed from: o._verifyLongName2$4, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/_handleSpillOverflow;", "p0", "", "RemoteActionCompatParcelizer", "(Lo/_handleSpillOverflow;)Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass4 extends MagicModuleUseCase implements getAnswerMap<_handleSpillOverflow, Boolean> {
        final /* synthetic */ int $write;

        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(_handleSpillOverflow _handlespilloverflow) {
            return Boolean.valueOf(_handlespilloverflow.IconCompatParcelizer(this.$write));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass4(int i) {
            super(1);
            this.$write = i;
        }
    }

    private final boolean read(boolean p0, boolean p1) {
        ObjectReader objectReader;
        if (read() == null) {
            return true;
        }
        if (getMediaBrowserCompatItemReceiver() && !p0) {
            return false;
        }
        _handleSpillOverflow _handlespilloverflow = read();
        IconCompatParcelizer((_handleSpillOverflow) null);
        if (p1 && _handlespilloverflow != null) {
            _handlespilloverflow.read(getMediaBrowserCompatItemReceiver() ? _addSymbol.read : _addSymbol.RemoteActionCompatParcelizer, _addSymbol.AudioAttributesCompatParcelizer);
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
                                    ((_handleSpillOverflow) iconCompatParcelizerWrite).read(_addSymbol.write, _addSymbol.AudioAttributesCompatParcelizer);
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
        return true;
    }

    @Override // kotlin._resizeAndFindOffsetForAdd
    public final boolean RemoteActionCompatParcelizer(int p0) {
        return read(p0, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [T, java.lang.Boolean] */
    @Override // kotlin.nukeSymbols
    public final boolean read(int p0, boolean p1) {
        _handleSpillOverflow _handlespilloverflow;
        if ((_verifyNoLeadingZeroes.RemoteActionCompatParcelizer || (_verifyNoLeadingZeroes.read && (_handlespilloverflow = read()) != null && _handlespilloverflow.getRead())) && this.write.IconCompatParcelizer(p0)) {
            return true;
        }
        MagicModuleUseCaseImplWhenMappings.write writeVar = new MagicModuleUseCaseImplWhenMappings.write();
        writeVar.write = Boolean.FALSE;
        _handleSpillOverflow _handlespilloverflow2 = read();
        Boolean boolAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(p0, this.write.read(), new AnonymousClass5(writeVar, p0));
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(boolAudioAttributesCompatParcelizer, Boolean.TRUE) && _handlespilloverflow2 != read()) {
            return true;
        }
        if (boolAudioAttributesCompatParcelizer != null && writeVar.write != 0) {
            if (boolAudioAttributesCompatParcelizer.booleanValue() && ((Boolean) writeVar.write).booleanValue()) {
                return true;
            }
            if (rehash.RemoteActionCompatParcelizer(p0) && p1) {
                return read(false, true, false, p0) && IconCompatParcelizer(p0, null);
            }
            if (!_verifyNoLeadingZeroes.RemoteActionCompatParcelizer && !_verifyNoLeadingZeroes.read) {
                return this.write.IconCompatParcelizer(p0);
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: o._verifyLongName2$5, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/_handleSpillOverflow;", "p0", "", "read", "(Lo/_handleSpillOverflow;)Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass5 extends MagicModuleUseCase implements getAnswerMap<_handleSpillOverflow, Boolean> {
        final /* synthetic */ MagicModuleUseCaseImplWhenMappings.write<Boolean> $read;
        final /* synthetic */ int $write;

        /* JADX WARN: Type inference failed for: r3v2, types: [T, java.lang.Boolean] */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(_handleSpillOverflow _handlespilloverflow) {
            this.$read.write = Boolean.valueOf(_handlespilloverflow.IconCompatParcelizer(this.$write));
            return this.$read.write;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass5(MagicModuleUseCaseImplWhenMappings.write<Boolean> writeVar, int i) {
            super(1);
            this.$read = writeVar;
            this.$write = i;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:93:0x00b5, code lost:
    
        continue;
     */
    @Override // kotlin.nukeSymbols
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Boolean AudioAttributesCompatParcelizer(int r13, kotlin.WritableTypeIdInclusion r14, kotlin.getAnswerMap<? super kotlin._handleSpillOverflow, java.lang.Boolean> r15) {
        /*
            Method dump skipped, instruction units count: 375
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin._verifyLongName2.AudioAttributesCompatParcelizer(int, o.WritableTypeIdInclusion, o.getAnswerMap):java.lang.Boolean");
    }

    /* JADX INFO: renamed from: o._verifyLongName2$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/_handleSpillOverflow;", "p0", "", "IconCompatParcelizer", "(Lo/_handleSpillOverflow;)Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass1 extends MagicModuleUseCase implements getAnswerMap<_handleSpillOverflow, Boolean> {
        final /* synthetic */ getAnswerMap<_handleSpillOverflow, Boolean> $AudioAttributesCompatParcelizer;
        final /* synthetic */ _handleSpillOverflow $RemoteActionCompatParcelizer;
        final /* synthetic */ _verifyLongName2 write;

        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(_handleSpillOverflow _handlespilloverflow) {
            boolean zBooleanValue;
            if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(_handlespilloverflow, this.$RemoteActionCompatParcelizer)) {
                zBooleanValue = false;
            } else {
                if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(_handlespilloverflow, this.write.getRemoteActionCompatParcelizer())) {
                    throw new IllegalStateException("Focus search landed at the root.".toString());
                }
                zBooleanValue = this.$AudioAttributesCompatParcelizer.invoke(_handlespilloverflow).booleanValue();
            }
            return Boolean.valueOf(zBooleanValue);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(_handleSpillOverflow _handlespilloverflow, _verifyLongName2 _verifylongname2, getAnswerMap<? super _handleSpillOverflow, Boolean> getanswermap) {
            super(1);
            this.$RemoteActionCompatParcelizer = _handlespilloverflow;
            this.write = _verifylongname2;
            this.$AudioAttributesCompatParcelizer = getanswermap;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16, types: [o._handleOddName$IconCompatParcelizer] */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v25, types: [o._handleOddName$IconCompatParcelizer] */
    /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v46 */
    /* JADX WARN: Type inference failed for: r0v47 */
    /* JADX WARN: Type inference failed for: r0v48 */
    /* JADX WARN: Type inference failed for: r0v49 */
    /* JADX WARN: Type inference failed for: r0v6, types: [o._handleOddName$IconCompatParcelizer] */
    /* JADX WARN: Type inference failed for: r0v7, types: [o._handleOddName$IconCompatParcelizer] */
    /* JADX WARN: Type inference failed for: r0v8, types: [o._handleOddName$IconCompatParcelizer] */
    /* JADX WARN: Type inference failed for: r0v9, types: [o._handleOddName$IconCompatParcelizer] */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v17, types: [o._handleOddName$IconCompatParcelizer] */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v19, types: [o._handleOddName$IconCompatParcelizer] */
    /* JADX WARN: Type inference failed for: r8v20, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v24 */
    /* JADX WARN: Type inference failed for: r8v25 */
    /* JADX WARN: Type inference failed for: r8v26 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    @Override // kotlin.nukeSymbols
    public final boolean read(KeyEvent p0) {
        resolveAndValidateSubType resolveandvalidatesubtype;
        int size;
        ObjectReader objectReader;
        ?? Write;
        ObjectReader objectReader2;
        if (this.AudioAttributesCompatParcelizer.getAudioAttributesCompatParcelizer()) {
            System.out.println((Object) "FocusRelatedWarning: Dispatching intercepted soft keyboard event while the focus system is invalidated.");
            return false;
        }
        _handleSpillOverflow _handlespilloverflowIconCompatParcelizer = _hashToIndex.IconCompatParcelizer(this.RemoteActionCompatParcelizer);
        if (_handlespilloverflowIconCompatParcelizer != null) {
            _handleSpillOverflow _handlespilloverflow = _handlespilloverflowIconCompatParcelizer;
            int iWrite = _bind.write(131072);
            if (!_handlespilloverflow.getRead().getRatingCompat()) {
                reportWrongTokenException.read("visitAncestors called on an unattached node");
            }
            _handleOddName.IconCompatParcelizer read2 = _handlespilloverflow.getRead();
            _assertNotNull _assertnotnullAudioAttributesImplApi26Parcelizer = collectLongDefaults.AudioAttributesImplApi26Parcelizer(_handlespilloverflow);
            loop0: while (true) {
                if (_assertnotnullAudioAttributesImplApi26Parcelizer == null) {
                    Write = 0;
                    break;
                }
                if ((_assertnotnullAudioAttributesImplApi26Parcelizer.get_init_lambda2().getAudioAttributesImplApi21Parcelizer().getRemoteActionCompatParcelizer() & iWrite) != 0) {
                    while (read2 != null) {
                        if ((read2.getWrite() & iWrite) != 0) {
                            UTF32Reader uTF32Reader = null;
                            Write = read2;
                            while (Write != 0) {
                                if (Write instanceof resolveAndValidateSubType) {
                                    break loop0;
                                }
                                if ((Write.getWrite() & iWrite) != 0 && (Write instanceof addAbstractTypeResolver)) {
                                    _handleOddName.IconCompatParcelizer iconCompatParcelizer = ((addAbstractTypeResolver) Write).getIconCompatParcelizer();
                                    int i = 0;
                                    Write = Write;
                                    while (iconCompatParcelizer != null) {
                                        if ((iconCompatParcelizer.getWrite() & iWrite) != 0) {
                                            i++;
                                            if (i == 1) {
                                                Write = iconCompatParcelizer;
                                            } else {
                                                if (uTF32Reader == null) {
                                                    uTF32Reader = new UTF32Reader(new _handleOddName.IconCompatParcelizer[16], 0);
                                                }
                                                if (Write != 0) {
                                                    if (uTF32Reader != null) {
                                                        uTF32Reader.read(Write);
                                                    }
                                                    Write = 0;
                                                }
                                                if (uTF32Reader != null) {
                                                    uTF32Reader.read(iconCompatParcelizer);
                                                }
                                            }
                                        }
                                        iconCompatParcelizer = iconCompatParcelizer.getAudioAttributesImplBaseParcelizer();
                                        Write = Write;
                                    }
                                    if (i != 1) {
                                    }
                                }
                                Write = collectLongDefaults.write((UTF32Reader<_handleOddName.IconCompatParcelizer>) uTF32Reader);
                            }
                        }
                        read2 = read2.getMediaBrowserCompatItemReceiver();
                    }
                }
                _assertnotnullAudioAttributesImplApi26Parcelizer = _assertnotnullAudioAttributesImplApi26Parcelizer._init_lambda4();
                read2 = (_assertnotnullAudioAttributesImplApi26Parcelizer == null || (objectReader2 = _assertnotnullAudioAttributesImplApi26Parcelizer.get_init_lambda2()) == null) ? null : objectReader2.getAudioAttributesCompatParcelizer();
            }
            resolveandvalidatesubtype = (resolveAndValidateSubType) Write;
        } else {
            resolveandvalidatesubtype = null;
        }
        if (resolveandvalidatesubtype != null) {
            resolveAndValidateSubType resolveandvalidatesubtype2 = resolveandvalidatesubtype;
            int iWrite2 = _bind.write(131072);
            if (!resolveandvalidatesubtype2.getRead().getRatingCompat()) {
                reportWrongTokenException.read("visitAncestors called on an unattached node");
            }
            _handleOddName.IconCompatParcelizer mediaBrowserCompatItemReceiver = resolveandvalidatesubtype2.getRead().getMediaBrowserCompatItemReceiver();
            _assertNotNull _assertnotnullAudioAttributesImplApi26Parcelizer2 = collectLongDefaults.AudioAttributesImplApi26Parcelizer(resolveandvalidatesubtype2);
            ArrayList arrayList = null;
            while (_assertnotnullAudioAttributesImplApi26Parcelizer2 != null) {
                if ((_assertnotnullAudioAttributesImplApi26Parcelizer2.get_init_lambda2().getAudioAttributesImplApi21Parcelizer().getRemoteActionCompatParcelizer() & iWrite2) != 0) {
                    while (mediaBrowserCompatItemReceiver != null) {
                        if ((mediaBrowserCompatItemReceiver.getWrite() & iWrite2) != 0) {
                            _handleOddName.IconCompatParcelizer iconCompatParcelizerWrite = mediaBrowserCompatItemReceiver;
                            UTF32Reader uTF32Reader2 = null;
                            while (iconCompatParcelizerWrite != null) {
                                if (iconCompatParcelizerWrite instanceof resolveAndValidateSubType) {
                                    if (arrayList == null) {
                                        arrayList = new ArrayList();
                                    }
                                    arrayList.add(iconCompatParcelizerWrite);
                                } else if ((iconCompatParcelizerWrite.getWrite() & iWrite2) != 0 && (iconCompatParcelizerWrite instanceof addAbstractTypeResolver)) {
                                    int i2 = 0;
                                    for (_handleOddName.IconCompatParcelizer iconCompatParcelizer2 = ((addAbstractTypeResolver) iconCompatParcelizerWrite).getIconCompatParcelizer(); iconCompatParcelizer2 != null; iconCompatParcelizer2 = iconCompatParcelizer2.getAudioAttributesImplBaseParcelizer()) {
                                        if ((iconCompatParcelizer2.getWrite() & iWrite2) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                iconCompatParcelizerWrite = iconCompatParcelizer2;
                                            } else {
                                                if (uTF32Reader2 == null) {
                                                    uTF32Reader2 = new UTF32Reader(new _handleOddName.IconCompatParcelizer[16], 0);
                                                }
                                                if (iconCompatParcelizerWrite != null) {
                                                    if (uTF32Reader2 != null) {
                                                        uTF32Reader2.read(iconCompatParcelizerWrite);
                                                    }
                                                    iconCompatParcelizerWrite = null;
                                                }
                                                if (uTF32Reader2 != null) {
                                                    uTF32Reader2.read(iconCompatParcelizer2);
                                                }
                                            }
                                        }
                                    }
                                    if (i2 != 1) {
                                    }
                                }
                                iconCompatParcelizerWrite = collectLongDefaults.write((UTF32Reader<_handleOddName.IconCompatParcelizer>) uTF32Reader2);
                            }
                        }
                        mediaBrowserCompatItemReceiver = mediaBrowserCompatItemReceiver.getMediaBrowserCompatItemReceiver();
                    }
                }
                _assertnotnullAudioAttributesImplApi26Parcelizer2 = _assertnotnullAudioAttributesImplApi26Parcelizer2._init_lambda4();
                mediaBrowserCompatItemReceiver = (_assertnotnullAudioAttributesImplApi26Parcelizer2 == null || (objectReader = _assertnotnullAudioAttributesImplApi26Parcelizer2.get_init_lambda2()) == null) ? null : objectReader.getAudioAttributesCompatParcelizer();
            }
            if (arrayList != null && (size = arrayList.size() - 1) >= 0) {
                while (true) {
                    int i3 = size - 1;
                    if (((resolveAndValidateSubType) arrayList.get(size)).RemoteActionCompatParcelizer(p0)) {
                        return true;
                    }
                    if (i3 < 0) {
                        break;
                    }
                    size = i3;
                }
            }
            ?? read3 = resolveandvalidatesubtype2.getRead();
            UTF32Reader uTF32Reader3 = null;
            while (read3 != 0) {
                if (read3 instanceof resolveAndValidateSubType) {
                    if (((resolveAndValidateSubType) read3).RemoteActionCompatParcelizer(p0)) {
                        return true;
                    }
                } else if ((read3.getWrite() & iWrite2) != 0 && (read3 instanceof addAbstractTypeResolver)) {
                    _handleOddName.IconCompatParcelizer iconCompatParcelizer3 = ((addAbstractTypeResolver) read3).getIconCompatParcelizer();
                    int i4 = 0;
                    read3 = read3;
                    while (iconCompatParcelizer3 != null) {
                        if ((iconCompatParcelizer3.getWrite() & iWrite2) != 0) {
                            i4++;
                            if (i4 == 1) {
                                read3 = iconCompatParcelizer3;
                            } else {
                                if (uTF32Reader3 == null) {
                                    uTF32Reader3 = new UTF32Reader(new _handleOddName.IconCompatParcelizer[16], 0);
                                }
                                if (read3 != 0) {
                                    if (uTF32Reader3 != null) {
                                        uTF32Reader3.read(read3);
                                    }
                                    read3 = 0;
                                }
                                if (uTF32Reader3 != null) {
                                    uTF32Reader3.read(iconCompatParcelizer3);
                                }
                            }
                        }
                        iconCompatParcelizer3 = iconCompatParcelizer3.getAudioAttributesImplBaseParcelizer();
                        read3 = read3;
                    }
                    if (i4 != 1) {
                    }
                }
                read3 = collectLongDefaults.write((UTF32Reader<_handleOddName.IconCompatParcelizer>) uTF32Reader3);
            }
            ?? read4 = resolveandvalidatesubtype2.getRead();
            UTF32Reader uTF32Reader4 = null;
            while (read4 != 0) {
                if (read4 instanceof resolveAndValidateSubType) {
                    if (((resolveAndValidateSubType) read4).IconCompatParcelizer(p0)) {
                        return true;
                    }
                } else if ((read4.getWrite() & iWrite2) != 0 && (read4 instanceof addAbstractTypeResolver)) {
                    _handleOddName.IconCompatParcelizer iconCompatParcelizer4 = ((addAbstractTypeResolver) read4).getIconCompatParcelizer();
                    int i5 = 0;
                    read4 = read4;
                    while (iconCompatParcelizer4 != null) {
                        if ((iconCompatParcelizer4.getWrite() & iWrite2) != 0) {
                            i5++;
                            if (i5 == 1) {
                                read4 = iconCompatParcelizer4;
                            } else {
                                if (uTF32Reader4 == null) {
                                    uTF32Reader4 = new UTF32Reader(new _handleOddName.IconCompatParcelizer[16], 0);
                                }
                                if (read4 != 0) {
                                    if (uTF32Reader4 != null) {
                                        uTF32Reader4.read(read4);
                                    }
                                    read4 = 0;
                                }
                                if (uTF32Reader4 != null) {
                                    uTF32Reader4.read(iconCompatParcelizer4);
                                }
                            }
                        }
                        iconCompatParcelizer4 = iconCompatParcelizer4.getAudioAttributesImplBaseParcelizer();
                        read4 = read4;
                    }
                    if (i5 != 1) {
                    }
                }
                read4 = collectLongDefaults.write((UTF32Reader<_handleOddName.IconCompatParcelizer>) uTF32Reader4);
            }
            if (arrayList != null) {
                int size2 = arrayList.size();
                for (int i6 = 0; i6 < size2; i6++) {
                    if (((resolveAndValidateSubType) arrayList.get(i6)).IconCompatParcelizer(p0)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v22, types: [o._handleOddName$IconCompatParcelizer] */
    /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v43 */
    /* JADX WARN: Type inference failed for: r0v44 */
    /* JADX WARN: Type inference failed for: r0v6, types: [o._handleOddName$IconCompatParcelizer] */
    /* JADX WARN: Type inference failed for: r0v7, types: [o._handleOddName$IconCompatParcelizer] */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r15v11 */
    /* JADX WARN: Type inference failed for: r15v12, types: [o._handleOddName$IconCompatParcelizer] */
    /* JADX WARN: Type inference failed for: r15v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v14 */
    /* JADX WARN: Type inference failed for: r15v15 */
    /* JADX WARN: Type inference failed for: r15v16 */
    /* JADX WARN: Type inference failed for: r15v17 */
    /* JADX WARN: Type inference failed for: r15v18 */
    /* JADX WARN: Type inference failed for: r15v19 */
    /* JADX WARN: Type inference failed for: r15v4, types: [o._handleOddName$IconCompatParcelizer] */
    /* JADX WARN: Type inference failed for: r15v5, types: [o._handleOddName$IconCompatParcelizer] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v16, types: [o._handleOddName$IconCompatParcelizer] */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v18, types: [o._handleOddName$IconCompatParcelizer] */
    /* JADX WARN: Type inference failed for: r8v19, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v24 */
    /* JADX WARN: Type inference failed for: r8v25 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7 */
    @Override // kotlin.nukeSymbols
    public final boolean RemoteActionCompatParcelizer(weirdNativeValueException p0, getCreatedOnDateMs<Boolean> p1) {
        reportBadTypeDefinition reportbadtypedefinition;
        int size;
        ObjectReader objectReader;
        ?? Write;
        ObjectReader objectReader2;
        if (this.AudioAttributesCompatParcelizer.getAudioAttributesCompatParcelizer()) {
            System.out.println((Object) "FocusRelatedWarning: Dispatching rotary event while the focus system is invalidated.");
            return false;
        }
        _handleSpillOverflow _handlespilloverflowRatingCompat = RatingCompat();
        if (_handlespilloverflowRatingCompat != null) {
            _handleSpillOverflow _handlespilloverflow = _handlespilloverflowRatingCompat;
            int iWrite = _bind.write(16384);
            if (!_handlespilloverflow.getRead().getRatingCompat()) {
                reportWrongTokenException.read("visitAncestors called on an unattached node");
            }
            _handleOddName.IconCompatParcelizer read2 = _handlespilloverflow.getRead();
            _assertNotNull _assertnotnullAudioAttributesImplApi26Parcelizer = collectLongDefaults.AudioAttributesImplApi26Parcelizer(_handlespilloverflow);
            loop0: while (true) {
                if (_assertnotnullAudioAttributesImplApi26Parcelizer == null) {
                    Write = 0;
                    break;
                }
                if ((_assertnotnullAudioAttributesImplApi26Parcelizer.get_init_lambda2().getAudioAttributesImplApi21Parcelizer().getRemoteActionCompatParcelizer() & iWrite) != 0) {
                    while (read2 != null) {
                        if ((read2.getWrite() & iWrite) != 0) {
                            UTF32Reader uTF32Reader = null;
                            Write = read2;
                            while (Write != 0) {
                                if (Write instanceof reportBadTypeDefinition) {
                                    break loop0;
                                }
                                if ((Write.getWrite() & iWrite) != 0 && (Write instanceof addAbstractTypeResolver)) {
                                    _handleOddName.IconCompatParcelizer iconCompatParcelizer = ((addAbstractTypeResolver) Write).getIconCompatParcelizer();
                                    int i = 0;
                                    Write = Write;
                                    while (iconCompatParcelizer != null) {
                                        if ((iconCompatParcelizer.getWrite() & iWrite) != 0) {
                                            i++;
                                            if (i == 1) {
                                                Write = iconCompatParcelizer;
                                            } else {
                                                if (uTF32Reader == null) {
                                                    uTF32Reader = new UTF32Reader(new _handleOddName.IconCompatParcelizer[16], 0);
                                                }
                                                if (Write != 0) {
                                                    if (uTF32Reader != null) {
                                                        uTF32Reader.read(Write);
                                                    }
                                                    Write = 0;
                                                }
                                                if (uTF32Reader != null) {
                                                    uTF32Reader.read(iconCompatParcelizer);
                                                }
                                            }
                                        }
                                        iconCompatParcelizer = iconCompatParcelizer.getAudioAttributesImplBaseParcelizer();
                                        Write = Write;
                                    }
                                    if (i != 1) {
                                    }
                                }
                                Write = collectLongDefaults.write((UTF32Reader<_handleOddName.IconCompatParcelizer>) uTF32Reader);
                            }
                        }
                        read2 = read2.getMediaBrowserCompatItemReceiver();
                    }
                }
                _assertnotnullAudioAttributesImplApi26Parcelizer = _assertnotnullAudioAttributesImplApi26Parcelizer._init_lambda4();
                read2 = (_assertnotnullAudioAttributesImplApi26Parcelizer == null || (objectReader2 = _assertnotnullAudioAttributesImplApi26Parcelizer.get_init_lambda2()) == null) ? null : objectReader2.getAudioAttributesCompatParcelizer();
            }
            reportbadtypedefinition = (reportBadTypeDefinition) Write;
        } else {
            reportbadtypedefinition = null;
        }
        if (reportbadtypedefinition != null) {
            reportBadTypeDefinition reportbadtypedefinition2 = reportbadtypedefinition;
            int iWrite2 = _bind.write(16384);
            if (!reportbadtypedefinition2.getRead().getRatingCompat()) {
                reportWrongTokenException.read("visitAncestors called on an unattached node");
            }
            _handleOddName.IconCompatParcelizer mediaBrowserCompatItemReceiver = reportbadtypedefinition2.getRead().getMediaBrowserCompatItemReceiver();
            _assertNotNull _assertnotnullAudioAttributesImplApi26Parcelizer2 = collectLongDefaults.AudioAttributesImplApi26Parcelizer(reportbadtypedefinition2);
            ArrayList arrayList = null;
            while (_assertnotnullAudioAttributesImplApi26Parcelizer2 != null) {
                if ((_assertnotnullAudioAttributesImplApi26Parcelizer2.get_init_lambda2().getAudioAttributesImplApi21Parcelizer().getRemoteActionCompatParcelizer() & iWrite2) != 0) {
                    while (mediaBrowserCompatItemReceiver != null) {
                        if ((mediaBrowserCompatItemReceiver.getWrite() & iWrite2) != 0) {
                            _handleOddName.IconCompatParcelizer iconCompatParcelizerWrite = mediaBrowserCompatItemReceiver;
                            UTF32Reader uTF32Reader2 = null;
                            while (iconCompatParcelizerWrite != null) {
                                if (iconCompatParcelizerWrite instanceof reportBadTypeDefinition) {
                                    if (arrayList == null) {
                                        arrayList = new ArrayList();
                                    }
                                    arrayList.add(iconCompatParcelizerWrite);
                                } else if ((iconCompatParcelizerWrite.getWrite() & iWrite2) != 0 && (iconCompatParcelizerWrite instanceof addAbstractTypeResolver)) {
                                    int i2 = 0;
                                    for (_handleOddName.IconCompatParcelizer iconCompatParcelizer2 = ((addAbstractTypeResolver) iconCompatParcelizerWrite).getIconCompatParcelizer(); iconCompatParcelizer2 != null; iconCompatParcelizer2 = iconCompatParcelizer2.getAudioAttributesImplBaseParcelizer()) {
                                        if ((iconCompatParcelizer2.getWrite() & iWrite2) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                iconCompatParcelizerWrite = iconCompatParcelizer2;
                                            } else {
                                                if (uTF32Reader2 == null) {
                                                    uTF32Reader2 = new UTF32Reader(new _handleOddName.IconCompatParcelizer[16], 0);
                                                }
                                                if (iconCompatParcelizerWrite != null) {
                                                    if (uTF32Reader2 != null) {
                                                        uTF32Reader2.read(iconCompatParcelizerWrite);
                                                    }
                                                    iconCompatParcelizerWrite = null;
                                                }
                                                if (uTF32Reader2 != null) {
                                                    uTF32Reader2.read(iconCompatParcelizer2);
                                                }
                                            }
                                        }
                                    }
                                    if (i2 != 1) {
                                    }
                                }
                                iconCompatParcelizerWrite = collectLongDefaults.write((UTF32Reader<_handleOddName.IconCompatParcelizer>) uTF32Reader2);
                            }
                        }
                        mediaBrowserCompatItemReceiver = mediaBrowserCompatItemReceiver.getMediaBrowserCompatItemReceiver();
                    }
                }
                _assertnotnullAudioAttributesImplApi26Parcelizer2 = _assertnotnullAudioAttributesImplApi26Parcelizer2._init_lambda4();
                mediaBrowserCompatItemReceiver = (_assertnotnullAudioAttributesImplApi26Parcelizer2 == null || (objectReader = _assertnotnullAudioAttributesImplApi26Parcelizer2.get_init_lambda2()) == null) ? null : objectReader.getAudioAttributesCompatParcelizer();
            }
            if (arrayList != null && (size = arrayList.size() - 1) >= 0) {
                while (true) {
                    int i3 = size - 1;
                    if (((reportBadTypeDefinition) arrayList.get(size)).AudioAttributesCompatParcelizer(p0)) {
                        return true;
                    }
                    if (i3 < 0) {
                        break;
                    }
                    size = i3;
                }
            }
            ?? read3 = reportbadtypedefinition2.getRead();
            UTF32Reader uTF32Reader3 = null;
            while (read3 != 0) {
                if (read3 instanceof reportBadTypeDefinition) {
                    if (((reportBadTypeDefinition) read3).AudioAttributesCompatParcelizer(p0)) {
                        return true;
                    }
                } else if ((read3.getWrite() & iWrite2) != 0 && (read3 instanceof addAbstractTypeResolver)) {
                    _handleOddName.IconCompatParcelizer iconCompatParcelizer3 = ((addAbstractTypeResolver) read3).getIconCompatParcelizer();
                    int i4 = 0;
                    read3 = read3;
                    while (iconCompatParcelizer3 != null) {
                        if ((iconCompatParcelizer3.getWrite() & iWrite2) != 0) {
                            i4++;
                            if (i4 == 1) {
                                read3 = iconCompatParcelizer3;
                            } else {
                                if (uTF32Reader3 == null) {
                                    uTF32Reader3 = new UTF32Reader(new _handleOddName.IconCompatParcelizer[16], 0);
                                }
                                if (read3 != 0) {
                                    if (uTF32Reader3 != null) {
                                        uTF32Reader3.read(read3);
                                    }
                                    read3 = 0;
                                }
                                if (uTF32Reader3 != null) {
                                    uTF32Reader3.read(iconCompatParcelizer3);
                                }
                            }
                        }
                        iconCompatParcelizer3 = iconCompatParcelizer3.getAudioAttributesImplBaseParcelizer();
                        read3 = read3;
                    }
                    if (i4 != 1) {
                    }
                }
                read3 = collectLongDefaults.write((UTF32Reader<_handleOddName.IconCompatParcelizer>) uTF32Reader3);
            }
            if (p1.invoke().booleanValue()) {
                return true;
            }
            ?? read4 = reportbadtypedefinition2.getRead();
            UTF32Reader uTF32Reader4 = null;
            while (read4 != 0) {
                if (read4 instanceof reportBadTypeDefinition) {
                    if (((reportBadTypeDefinition) read4).write(p0)) {
                        return true;
                    }
                } else if ((read4.getWrite() & iWrite2) != 0 && (read4 instanceof addAbstractTypeResolver)) {
                    _handleOddName.IconCompatParcelizer iconCompatParcelizer4 = ((addAbstractTypeResolver) read4).getIconCompatParcelizer();
                    int i5 = 0;
                    read4 = read4;
                    while (iconCompatParcelizer4 != null) {
                        if ((iconCompatParcelizer4.getWrite() & iWrite2) != 0) {
                            i5++;
                            if (i5 == 1) {
                                read4 = iconCompatParcelizer4;
                            } else {
                                if (uTF32Reader4 == null) {
                                    uTF32Reader4 = new UTF32Reader(new _handleOddName.IconCompatParcelizer[16], 0);
                                }
                                if (read4 != 0) {
                                    if (uTF32Reader4 != null) {
                                        uTF32Reader4.read(read4);
                                    }
                                    read4 = 0;
                                }
                                if (uTF32Reader4 != null) {
                                    uTF32Reader4.read(iconCompatParcelizer4);
                                }
                            }
                        }
                        iconCompatParcelizer4 = iconCompatParcelizer4.getAudioAttributesImplBaseParcelizer();
                        read4 = read4;
                    }
                    if (i5 != 1) {
                    }
                }
                read4 = collectLongDefaults.write((UTF32Reader<_handleOddName.IconCompatParcelizer>) uTF32Reader4);
            }
            if (arrayList != null) {
                int size2 = arrayList.size();
                for (int i6 = 0; i6 < size2; i6++) {
                    if (((reportBadTypeDefinition) arrayList.get(i6)).write(p0)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12, types: [o._handleOddName$IconCompatParcelizer] */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14, types: [o._handleOddName$IconCompatParcelizer] */
    /* JADX WARN: Type inference failed for: r8v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v3 */
    @Override // kotlin.nukeSymbols
    public final boolean RemoteActionCompatParcelizer(DatabindContext p0) {
        _resolveAndValidateGeneric _resolveandvalidategeneric;
        int size;
        int size2;
        ObjectReader objectReader;
        ?? Write;
        ObjectReader objectReader2;
        if (this.AudioAttributesCompatParcelizer.getAudioAttributesCompatParcelizer()) {
            System.out.println((Object) "FocusRelatedWarning: Dispatching indirect pointer event while the focus system is invalidated.");
            return false;
        }
        _handleSpillOverflow _handlespilloverflow = read();
        if (_handlespilloverflow != null) {
            _handleSpillOverflow _handlespilloverflow2 = _handlespilloverflow;
            int iWrite = _bind.write(2097152);
            if (!_handlespilloverflow2.getRead().getRatingCompat()) {
                reportWrongTokenException.read("visitAncestors called on an unattached node");
            }
            _handleOddName.IconCompatParcelizer read2 = _handlespilloverflow2.getRead();
            _assertNotNull _assertnotnullAudioAttributesImplApi26Parcelizer = collectLongDefaults.AudioAttributesImplApi26Parcelizer(_handlespilloverflow2);
            loop0: while (true) {
                if (_assertnotnullAudioAttributesImplApi26Parcelizer == null) {
                    Write = 0;
                    break;
                }
                if ((_assertnotnullAudioAttributesImplApi26Parcelizer.get_init_lambda2().getAudioAttributesImplApi21Parcelizer().getRemoteActionCompatParcelizer() & iWrite) != 0) {
                    while (read2 != null) {
                        if ((read2.getWrite() & iWrite) != 0) {
                            UTF32Reader uTF32Reader = null;
                            Write = read2;
                            while (Write != 0) {
                                if (Write instanceof _resolveAndValidateGeneric) {
                                    break loop0;
                                }
                                if ((Write.getWrite() & iWrite) != 0 && (Write instanceof addAbstractTypeResolver)) {
                                    _handleOddName.IconCompatParcelizer iconCompatParcelizer = ((addAbstractTypeResolver) Write).getIconCompatParcelizer();
                                    int i = 0;
                                    Write = Write;
                                    while (iconCompatParcelizer != null) {
                                        if ((iconCompatParcelizer.getWrite() & iWrite) != 0) {
                                            i++;
                                            if (i == 1) {
                                                Write = iconCompatParcelizer;
                                            } else {
                                                if (uTF32Reader == null) {
                                                    uTF32Reader = new UTF32Reader(new _handleOddName.IconCompatParcelizer[16], 0);
                                                }
                                                if (Write != 0) {
                                                    if (uTF32Reader != null) {
                                                        uTF32Reader.read(Write);
                                                    }
                                                    Write = 0;
                                                }
                                                if (uTF32Reader != null) {
                                                    uTF32Reader.read(iconCompatParcelizer);
                                                }
                                            }
                                        }
                                        iconCompatParcelizer = iconCompatParcelizer.getAudioAttributesImplBaseParcelizer();
                                        Write = Write;
                                    }
                                    if (i != 1) {
                                    }
                                }
                                Write = collectLongDefaults.write((UTF32Reader<_handleOddName.IconCompatParcelizer>) uTF32Reader);
                            }
                        }
                        read2 = read2.getMediaBrowserCompatItemReceiver();
                    }
                }
                _assertnotnullAudioAttributesImplApi26Parcelizer = _assertnotnullAudioAttributesImplApi26Parcelizer._init_lambda4();
                read2 = (_assertnotnullAudioAttributesImplApi26Parcelizer == null || (objectReader2 = _assertnotnullAudioAttributesImplApi26Parcelizer.get_init_lambda2()) == null) ? null : objectReader2.getAudioAttributesCompatParcelizer();
            }
            _resolveandvalidategeneric = (_resolveAndValidateGeneric) Write;
        } else {
            _resolveandvalidategeneric = null;
        }
        if (_resolveandvalidategeneric != null) {
            _resolveAndValidateGeneric _resolveandvalidategeneric2 = _resolveandvalidategeneric;
            int iWrite2 = _bind.write(2097152);
            if (!_resolveandvalidategeneric2.getRead().getRatingCompat()) {
                reportWrongTokenException.read("visitAncestors called on an unattached node");
            }
            _handleOddName.IconCompatParcelizer mediaBrowserCompatItemReceiver = _resolveandvalidategeneric2.getRead().getMediaBrowserCompatItemReceiver();
            _assertNotNull _assertnotnullAudioAttributesImplApi26Parcelizer2 = collectLongDefaults.AudioAttributesImplApi26Parcelizer(_resolveandvalidategeneric2);
            ArrayList arrayList = null;
            while (_assertnotnullAudioAttributesImplApi26Parcelizer2 != null) {
                if ((_assertnotnullAudioAttributesImplApi26Parcelizer2.get_init_lambda2().getAudioAttributesImplApi21Parcelizer().getRemoteActionCompatParcelizer() & iWrite2) != 0) {
                    while (mediaBrowserCompatItemReceiver != null) {
                        if ((mediaBrowserCompatItemReceiver.getWrite() & iWrite2) != 0) {
                            _handleOddName.IconCompatParcelizer iconCompatParcelizerWrite = mediaBrowserCompatItemReceiver;
                            UTF32Reader uTF32Reader2 = null;
                            while (iconCompatParcelizerWrite != null) {
                                if (iconCompatParcelizerWrite instanceof _resolveAndValidateGeneric) {
                                    if (arrayList == null) {
                                        arrayList = new ArrayList();
                                    }
                                    arrayList.add(iconCompatParcelizerWrite);
                                } else if ((iconCompatParcelizerWrite.getWrite() & iWrite2) != 0 && (iconCompatParcelizerWrite instanceof addAbstractTypeResolver)) {
                                    int i2 = 0;
                                    for (_handleOddName.IconCompatParcelizer iconCompatParcelizer2 = ((addAbstractTypeResolver) iconCompatParcelizerWrite).getIconCompatParcelizer(); iconCompatParcelizer2 != null; iconCompatParcelizer2 = iconCompatParcelizer2.getAudioAttributesImplBaseParcelizer()) {
                                        if ((iconCompatParcelizer2.getWrite() & iWrite2) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                iconCompatParcelizerWrite = iconCompatParcelizer2;
                                            } else {
                                                if (uTF32Reader2 == null) {
                                                    uTF32Reader2 = new UTF32Reader(new _handleOddName.IconCompatParcelizer[16], 0);
                                                }
                                                if (iconCompatParcelizerWrite != null) {
                                                    if (uTF32Reader2 != null) {
                                                        uTF32Reader2.read(iconCompatParcelizerWrite);
                                                    }
                                                    iconCompatParcelizerWrite = null;
                                                }
                                                if (uTF32Reader2 != null) {
                                                    uTF32Reader2.read(iconCompatParcelizer2);
                                                }
                                            }
                                        }
                                    }
                                    if (i2 != 1) {
                                    }
                                }
                                iconCompatParcelizerWrite = collectLongDefaults.write((UTF32Reader<_handleOddName.IconCompatParcelizer>) uTF32Reader2);
                            }
                        }
                        mediaBrowserCompatItemReceiver = mediaBrowserCompatItemReceiver.getMediaBrowserCompatItemReceiver();
                    }
                }
                _assertnotnullAudioAttributesImplApi26Parcelizer2 = _assertnotnullAudioAttributesImplApi26Parcelizer2._init_lambda4();
                mediaBrowserCompatItemReceiver = (_assertnotnullAudioAttributesImplApi26Parcelizer2 == null || (objectReader = _assertnotnullAudioAttributesImplApi26Parcelizer2.get_init_lambda2()) == null) ? null : objectReader.getAudioAttributesCompatParcelizer();
            }
            if (arrayList != null && (size2 = arrayList.size() - 1) >= 0) {
                while (true) {
                    int i3 = size2 - 1;
                    ((_resolveAndValidateGeneric) arrayList.get(size2)).write(p0, _shapeForToken.IconCompatParcelizer);
                    if (i3 < 0) {
                        break;
                    }
                    size2 = i3;
                }
            }
            _resolveandvalidategeneric.write(p0, _shapeForToken.IconCompatParcelizer);
            _resolveandvalidategeneric.write(p0, _shapeForToken.AudioAttributesCompatParcelizer);
            if (arrayList != null) {
                int size3 = arrayList.size();
                for (int i4 = 0; i4 < size3; i4++) {
                    ((_resolveAndValidateGeneric) arrayList.get(i4)).write(p0, _shapeForToken.AudioAttributesCompatParcelizer);
                }
            }
            if (arrayList != null && (size = arrayList.size() - 1) >= 0) {
                while (true) {
                    int i5 = size - 1;
                    ((_resolveAndValidateGeneric) arrayList.get(size)).write(p0, _shapeForToken.read);
                    if (i5 < 0) {
                        break;
                    }
                    size = i5;
                }
            }
            _resolveandvalidategeneric.write(p0, _shapeForToken.read);
        }
        List<_colonConcat> listIconCompatParcelizer = p0.IconCompatParcelizer();
        int size4 = listIconCompatParcelizer.size();
        for (int i6 = 0; i6 < size4; i6++) {
            if (listIconCompatParcelizer.get(i6).getMediaBrowserCompatCustomActionResultReceiver()) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12, types: [o._handleOddName$IconCompatParcelizer] */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14, types: [o._handleOddName$IconCompatParcelizer] */
    /* JADX WARN: Type inference failed for: r8v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v3 */
    @Override // kotlin.nukeSymbols
    public final void IconCompatParcelizer() {
        _resolveAndValidateGeneric _resolveandvalidategeneric;
        ObjectReader objectReader;
        ?? Write;
        ObjectReader objectReader2;
        _handleSpillOverflow _handlespilloverflow = read();
        if (_handlespilloverflow != null) {
            _handleSpillOverflow _handlespilloverflow2 = _handlespilloverflow;
            int iWrite = _bind.write(2097152);
            if (!_handlespilloverflow2.getRead().getRatingCompat()) {
                reportWrongTokenException.read("visitAncestors called on an unattached node");
            }
            _handleOddName.IconCompatParcelizer read2 = _handlespilloverflow2.getRead();
            _assertNotNull _assertnotnullAudioAttributesImplApi26Parcelizer = collectLongDefaults.AudioAttributesImplApi26Parcelizer(_handlespilloverflow2);
            loop0: while (true) {
                if (_assertnotnullAudioAttributesImplApi26Parcelizer == null) {
                    Write = 0;
                    break;
                }
                if ((_assertnotnullAudioAttributesImplApi26Parcelizer.get_init_lambda2().getAudioAttributesImplApi21Parcelizer().getRemoteActionCompatParcelizer() & iWrite) != 0) {
                    while (read2 != null) {
                        if ((read2.getWrite() & iWrite) != 0) {
                            UTF32Reader uTF32Reader = null;
                            Write = read2;
                            while (Write != 0) {
                                if (Write instanceof _resolveAndValidateGeneric) {
                                    break loop0;
                                }
                                if ((Write.getWrite() & iWrite) != 0 && (Write instanceof addAbstractTypeResolver)) {
                                    _handleOddName.IconCompatParcelizer iconCompatParcelizer = ((addAbstractTypeResolver) Write).getIconCompatParcelizer();
                                    int i = 0;
                                    Write = Write;
                                    while (iconCompatParcelizer != null) {
                                        if ((iconCompatParcelizer.getWrite() & iWrite) != 0) {
                                            i++;
                                            if (i == 1) {
                                                Write = iconCompatParcelizer;
                                            } else {
                                                if (uTF32Reader == null) {
                                                    uTF32Reader = new UTF32Reader(new _handleOddName.IconCompatParcelizer[16], 0);
                                                }
                                                if (Write != 0) {
                                                    if (uTF32Reader != null) {
                                                        uTF32Reader.read(Write);
                                                    }
                                                    Write = 0;
                                                }
                                                if (uTF32Reader != null) {
                                                    uTF32Reader.read(iconCompatParcelizer);
                                                }
                                            }
                                        }
                                        iconCompatParcelizer = iconCompatParcelizer.getAudioAttributesImplBaseParcelizer();
                                        Write = Write;
                                    }
                                    if (i != 1) {
                                    }
                                }
                                Write = collectLongDefaults.write((UTF32Reader<_handleOddName.IconCompatParcelizer>) uTF32Reader);
                            }
                        }
                        read2 = read2.getMediaBrowserCompatItemReceiver();
                    }
                }
                _assertnotnullAudioAttributesImplApi26Parcelizer = _assertnotnullAudioAttributesImplApi26Parcelizer._init_lambda4();
                read2 = (_assertnotnullAudioAttributesImplApi26Parcelizer == null || (objectReader2 = _assertnotnullAudioAttributesImplApi26Parcelizer.get_init_lambda2()) == null) ? null : objectReader2.getAudioAttributesCompatParcelizer();
            }
            _resolveandvalidategeneric = (_resolveAndValidateGeneric) Write;
        } else {
            _resolveandvalidategeneric = null;
        }
        if (_resolveandvalidategeneric != null) {
            _resolveAndValidateGeneric _resolveandvalidategeneric2 = _resolveandvalidategeneric;
            int iWrite2 = _bind.write(2097152);
            if (!_resolveandvalidategeneric2.getRead().getRatingCompat()) {
                reportWrongTokenException.read("visitAncestors called on an unattached node");
            }
            _handleOddName.IconCompatParcelizer mediaBrowserCompatItemReceiver = _resolveandvalidategeneric2.getRead().getMediaBrowserCompatItemReceiver();
            _assertNotNull _assertnotnullAudioAttributesImplApi26Parcelizer2 = collectLongDefaults.AudioAttributesImplApi26Parcelizer(_resolveandvalidategeneric2);
            ArrayList arrayList = null;
            while (_assertnotnullAudioAttributesImplApi26Parcelizer2 != null) {
                if ((_assertnotnullAudioAttributesImplApi26Parcelizer2.get_init_lambda2().getAudioAttributesImplApi21Parcelizer().getRemoteActionCompatParcelizer() & iWrite2) != 0) {
                    while (mediaBrowserCompatItemReceiver != null) {
                        if ((mediaBrowserCompatItemReceiver.getWrite() & iWrite2) != 0) {
                            _handleOddName.IconCompatParcelizer iconCompatParcelizerWrite = mediaBrowserCompatItemReceiver;
                            UTF32Reader uTF32Reader2 = null;
                            while (iconCompatParcelizerWrite != null) {
                                if (iconCompatParcelizerWrite instanceof _resolveAndValidateGeneric) {
                                    if (arrayList == null) {
                                        arrayList = new ArrayList();
                                    }
                                    arrayList.add(iconCompatParcelizerWrite);
                                } else if ((iconCompatParcelizerWrite.getWrite() & iWrite2) != 0 && (iconCompatParcelizerWrite instanceof addAbstractTypeResolver)) {
                                    int i2 = 0;
                                    for (_handleOddName.IconCompatParcelizer iconCompatParcelizer2 = ((addAbstractTypeResolver) iconCompatParcelizerWrite).getIconCompatParcelizer(); iconCompatParcelizer2 != null; iconCompatParcelizer2 = iconCompatParcelizer2.getAudioAttributesImplBaseParcelizer()) {
                                        if ((iconCompatParcelizer2.getWrite() & iWrite2) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                iconCompatParcelizerWrite = iconCompatParcelizer2;
                                            } else {
                                                if (uTF32Reader2 == null) {
                                                    uTF32Reader2 = new UTF32Reader(new _handleOddName.IconCompatParcelizer[16], 0);
                                                }
                                                if (iconCompatParcelizerWrite != null) {
                                                    if (uTF32Reader2 != null) {
                                                        uTF32Reader2.read(iconCompatParcelizerWrite);
                                                    }
                                                    iconCompatParcelizerWrite = null;
                                                }
                                                if (uTF32Reader2 != null) {
                                                    uTF32Reader2.read(iconCompatParcelizer2);
                                                }
                                            }
                                        }
                                    }
                                    if (i2 != 1) {
                                    }
                                }
                                iconCompatParcelizerWrite = collectLongDefaults.write((UTF32Reader<_handleOddName.IconCompatParcelizer>) uTF32Reader2);
                            }
                        }
                        mediaBrowserCompatItemReceiver = mediaBrowserCompatItemReceiver.getMediaBrowserCompatItemReceiver();
                    }
                }
                _assertnotnullAudioAttributesImplApi26Parcelizer2 = _assertnotnullAudioAttributesImplApi26Parcelizer2._init_lambda4();
                mediaBrowserCompatItemReceiver = (_assertnotnullAudioAttributesImplApi26Parcelizer2 == null || (objectReader = _assertnotnullAudioAttributesImplApi26Parcelizer2.get_init_lambda2()) == null) ? null : objectReader.getAudioAttributesCompatParcelizer();
            }
            _resolveandvalidategeneric.MediaBrowserCompatCustomActionResultReceiver();
            if (arrayList != null) {
                int size = arrayList.size();
                for (int i3 = 0; i3 < size; i3++) {
                    ((_resolveAndValidateGeneric) arrayList.get(i3)).MediaBrowserCompatCustomActionResultReceiver();
                }
            }
        }
    }

    @Override // kotlin.nukeSymbols
    public final void RemoteActionCompatParcelizer() {
        this.write.write();
    }

    @Override // kotlin.nukeSymbols
    public final void AudioAttributesCompatParcelizer(_handleSpillOverflow p0) {
        this.AudioAttributesCompatParcelizer.write(p0);
    }

    @Override // kotlin.nukeSymbols
    public final void write(ByteQuadsCanonicalizer p0) {
        this.AudioAttributesCompatParcelizer.IconCompatParcelizer(p0);
    }

    @Override // kotlin.nukeSymbols
    public final void MediaDescriptionCompat() {
        this.AudioAttributesCompatParcelizer.write();
    }

    @Override // kotlin.nukeSymbols
    public final WritableTypeIdInclusion write() {
        _handleSpillOverflow _handlespilloverflowRatingCompat = RatingCompat();
        if (_handlespilloverflowRatingCompat != null) {
            return _hashToIndex.write(_handlespilloverflowRatingCompat);
        }
        return null;
    }

    @Override // kotlin.nukeSymbols
    public final boolean AudioAttributesImplApi26Parcelizer() {
        if (!this.RemoteActionCompatParcelizer.getRatingCompat()) {
            return false;
        }
        _handleSpillOverflow _handlespilloverflow = this.RemoteActionCompatParcelizer;
        int iWrite = _bind.write(1024);
        if (!_handlespilloverflow.getRead().getRatingCompat()) {
            reportWrongTokenException.read("visitSubtreeIf called on an unattached node");
        }
        UTF32Reader uTF32Reader = new UTF32Reader(new _handleOddName.IconCompatParcelizer[16], 0);
        _handleOddName.IconCompatParcelizer audioAttributesImplBaseParcelizer = _handlespilloverflow.getRead().getAudioAttributesImplBaseParcelizer();
        if (audioAttributesImplBaseParcelizer == null) {
            collectLongDefaults.read(uTF32Reader, _handlespilloverflow.getRead(), false);
        } else {
            uTF32Reader.read(audioAttributesImplBaseParcelizer);
        }
        while (uTF32Reader.getAudioAttributesCompatParcelizer() != 0) {
            _handleOddName.IconCompatParcelizer iconCompatParcelizer = (_handleOddName.IconCompatParcelizer) uTF32Reader.RemoteActionCompatParcelizer(uTF32Reader.getAudioAttributesCompatParcelizer() - 1);
            if ((iconCompatParcelizer.getRemoteActionCompatParcelizer() & iWrite) != 0) {
                for (_handleOddName.IconCompatParcelizer audioAttributesImplBaseParcelizer2 = iconCompatParcelizer; audioAttributesImplBaseParcelizer2 != null && audioAttributesImplBaseParcelizer2.getRatingCompat(); audioAttributesImplBaseParcelizer2 = audioAttributesImplBaseParcelizer2.getAudioAttributesImplBaseParcelizer()) {
                    if ((audioAttributesImplBaseParcelizer2.getWrite() & iWrite) != 0) {
                        _handleOddName.IconCompatParcelizer iconCompatParcelizerWrite = audioAttributesImplBaseParcelizer2;
                        UTF32Reader uTF32Reader2 = null;
                        while (iconCompatParcelizerWrite != null) {
                            if (iconCompatParcelizerWrite instanceof _handleSpillOverflow) {
                                _handleSpillOverflow _handlespilloverflow2 = (_handleSpillOverflow) iconCompatParcelizerWrite;
                                if (_handlespilloverflow2.getRatingCompat() && _handlespilloverflow2.read().getIconCompatParcelizer()) {
                                    return true;
                                }
                            } else if ((iconCompatParcelizerWrite.getWrite() & iWrite) != 0 && (iconCompatParcelizerWrite instanceof addAbstractTypeResolver)) {
                                int i = 0;
                                for (_handleOddName.IconCompatParcelizer iconCompatParcelizer2 = ((addAbstractTypeResolver) iconCompatParcelizerWrite).getIconCompatParcelizer(); iconCompatParcelizer2 != null; iconCompatParcelizer2 = iconCompatParcelizer2.getAudioAttributesImplBaseParcelizer()) {
                                    if ((iconCompatParcelizer2.getWrite() & iWrite) != 0) {
                                        i++;
                                        if (i == 1) {
                                            iconCompatParcelizerWrite = iconCompatParcelizer2;
                                        } else {
                                            if (uTF32Reader2 == null) {
                                                uTF32Reader2 = new UTF32Reader(new _handleOddName.IconCompatParcelizer[16], 0);
                                            }
                                            if (iconCompatParcelizerWrite != null) {
                                                if (uTF32Reader2 != null) {
                                                    uTF32Reader2.read(iconCompatParcelizerWrite);
                                                }
                                                iconCompatParcelizerWrite = null;
                                            }
                                            if (uTF32Reader2 != null) {
                                                uTF32Reader2.read(iconCompatParcelizer2);
                                            }
                                        }
                                    }
                                }
                                if (i != 1) {
                                }
                            }
                            iconCompatParcelizerWrite = collectLongDefaults.write((UTF32Reader<_handleOddName.IconCompatParcelizer>) uTF32Reader2);
                        }
                    }
                }
            }
            collectLongDefaults.read(uTF32Reader, iconCompatParcelizer, false);
        }
        return false;
    }

    @Override // kotlin.nukeSymbols
    public final boolean MediaBrowserCompatItemReceiver() {
        if (!this.RemoteActionCompatParcelizer.getRatingCompat()) {
            return false;
        }
        _handleSpillOverflow _handlespilloverflow = this.RemoteActionCompatParcelizer;
        int iWrite = _bind.write(1024);
        if (!_handlespilloverflow.getRead().getRatingCompat()) {
            reportWrongTokenException.read("visitSubtreeIf called on an unattached node");
        }
        UTF32Reader uTF32Reader = new UTF32Reader(new _handleOddName.IconCompatParcelizer[16], 0);
        _handleOddName.IconCompatParcelizer audioAttributesImplBaseParcelizer = _handlespilloverflow.getRead().getAudioAttributesImplBaseParcelizer();
        if (audioAttributesImplBaseParcelizer == null) {
            collectLongDefaults.read(uTF32Reader, _handlespilloverflow.getRead(), false);
        } else {
            uTF32Reader.read(audioAttributesImplBaseParcelizer);
        }
        while (uTF32Reader.getAudioAttributesCompatParcelizer() != 0) {
            _handleOddName.IconCompatParcelizer iconCompatParcelizer = (_handleOddName.IconCompatParcelizer) uTF32Reader.RemoteActionCompatParcelizer(uTF32Reader.getAudioAttributesCompatParcelizer() - 1);
            if ((iconCompatParcelizer.getRemoteActionCompatParcelizer() & iWrite) != 0) {
                for (_handleOddName.IconCompatParcelizer audioAttributesImplBaseParcelizer2 = iconCompatParcelizer; audioAttributesImplBaseParcelizer2 != null && audioAttributesImplBaseParcelizer2.getRatingCompat(); audioAttributesImplBaseParcelizer2 = audioAttributesImplBaseParcelizer2.getAudioAttributesImplBaseParcelizer()) {
                    if ((audioAttributesImplBaseParcelizer2.getWrite() & iWrite) != 0) {
                        _handleOddName.IconCompatParcelizer iconCompatParcelizerWrite = audioAttributesImplBaseParcelizer2;
                        UTF32Reader uTF32Reader2 = null;
                        while (iconCompatParcelizerWrite != null) {
                            if (iconCompatParcelizerWrite instanceof _handleSpillOverflow) {
                                _handleSpillOverflow _handlespilloverflow2 = (_handleSpillOverflow) iconCompatParcelizerWrite;
                                if (_handlespilloverflow2.getRatingCompat()) {
                                    makeChild makechild = _handlespilloverflow2.read();
                                    if (_handlespilloverflow2.getRatingCompat() && !_handlespilloverflow2.getRead() && makechild.getIconCompatParcelizer()) {
                                        return true;
                                    }
                                }
                            } else if ((iconCompatParcelizerWrite.getWrite() & iWrite) != 0 && (iconCompatParcelizerWrite instanceof addAbstractTypeResolver)) {
                                int i = 0;
                                for (_handleOddName.IconCompatParcelizer iconCompatParcelizer2 = ((addAbstractTypeResolver) iconCompatParcelizerWrite).getIconCompatParcelizer(); iconCompatParcelizer2 != null; iconCompatParcelizer2 = iconCompatParcelizer2.getAudioAttributesImplBaseParcelizer()) {
                                    if ((iconCompatParcelizer2.getWrite() & iWrite) != 0) {
                                        i++;
                                        if (i == 1) {
                                            iconCompatParcelizerWrite = iconCompatParcelizer2;
                                        } else {
                                            if (uTF32Reader2 == null) {
                                                uTF32Reader2 = new UTF32Reader(new _handleOddName.IconCompatParcelizer[16], 0);
                                            }
                                            if (iconCompatParcelizerWrite != null) {
                                                if (uTF32Reader2 != null) {
                                                    uTF32Reader2.read(iconCompatParcelizerWrite);
                                                }
                                                iconCompatParcelizerWrite = null;
                                            }
                                            if (uTF32Reader2 != null) {
                                                uTF32Reader2.read(iconCompatParcelizer2);
                                            }
                                        }
                                    }
                                }
                                if (i != 1) {
                                }
                            }
                            iconCompatParcelizerWrite = collectLongDefaults.write((UTF32Reader<_handleOddName.IconCompatParcelizer>) uTF32Reader2);
                        }
                    }
                }
            }
            collectLongDefaults.read(uTF32Reader, iconCompatParcelizer, false);
        }
        return false;
    }

    private final _handleSpillOverflow RatingCompat() {
        return _hashToIndex.IconCompatParcelizer(this.RemoteActionCompatParcelizer);
    }

    @Override // kotlin.nukeSymbols
    public final CharsToNameCanonicalizer AudioAttributesImplApi21Parcelizer() {
        return this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer();
    }

    @Override // kotlin.nukeSymbols
    public final setDropDownBackgroundResource<_verifyLongName> MediaBrowserCompatCustomActionResultReceiver() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    @Override // kotlin.nukeSymbols
    public final _handleSpillOverflow read() {
        _handleSpillOverflow _handlespilloverflow = this.MediaBrowserCompatCustomActionResultReceiver;
        if (_handlespilloverflow == null || !_handlespilloverflow.getRatingCompat()) {
            return null;
        }
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    @Override // kotlin.nukeSymbols
    public final void IconCompatParcelizer(_handleSpillOverflow _handlespilloverflow) {
        _handleSpillOverflow _handlespilloverflow2 = this.MediaBrowserCompatCustomActionResultReceiver;
        this.MediaBrowserCompatCustomActionResultReceiver = _handlespilloverflow;
        if (_handlespilloverflow == null || _handlespilloverflow2 != _handlespilloverflow) {
            write(false);
        }
        if (_verifyNoLeadingZeroes.AudioAttributesCompatParcelizer) {
            setDropDownBackgroundResource<_verifyLongName> setdropdownbackgroundresourceMediaBrowserCompatCustomActionResultReceiver = MediaBrowserCompatCustomActionResultReceiver();
            Object[] objArr = setdropdownbackgroundresourceMediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer;
            int i = setdropdownbackgroundresourceMediaBrowserCompatCustomActionResultReceiver.RemoteActionCompatParcelizer;
            for (int i2 = 0; i2 < i; i2++) {
                ((_verifyLongName) objArr[i2]).RemoteActionCompatParcelizer(_handlespilloverflow2, _handlespilloverflow);
            }
        }
    }

    @Override // kotlin.nukeSymbols
    /* JADX INFO: renamed from: MediaBrowserCompatMediaItem, reason: from getter */
    public final boolean getMediaBrowserCompatItemReceiver() {
        return this.MediaBrowserCompatItemReceiver;
    }

    public final void write(boolean z) {
        if (z && read() == null) {
            reportWrongTokenException.AudioAttributesCompatParcelizer("Cannot capture focus when the active focus target node is unset");
        }
        this.MediaBrowserCompatItemReceiver = z;
    }

    private final boolean AudioAttributesCompatParcelizer(KeyEvent p0) {
        long jIconCompatParcelizer = _throwSubtypeClassNotAllowed.IconCompatParcelizer(p0);
        int iRemoteActionCompatParcelizer = _throwSubtypeClassNotAllowed.RemoteActionCompatParcelizer(p0);
        if (_throwNotASubtype.read(iRemoteActionCompatParcelizer, _throwNotASubtype.INSTANCE.read())) {
            setCompoundDrawables setcompounddrawables = this.AudioAttributesImplBaseParcelizer;
            if (setcompounddrawables == null) {
                setcompounddrawables = new setCompoundDrawables(3);
                this.AudioAttributesImplBaseParcelizer = setcompounddrawables;
            }
            setcompounddrawables.RemoteActionCompatParcelizer(jIconCompatParcelizer);
        } else if (_throwNotASubtype.read(iRemoteActionCompatParcelizer, _throwNotASubtype.INSTANCE.AudioAttributesCompatParcelizer())) {
            setCompoundDrawables setcompounddrawables2 = this.AudioAttributesImplBaseParcelizer;
            if (setcompounddrawables2 == null || !setcompounddrawables2.AudioAttributesCompatParcelizer(jIconCompatParcelizer)) {
                return false;
            }
            setCompoundDrawables setcompounddrawables3 = this.AudioAttributesImplBaseParcelizer;
            if (setcompounddrawables3 != null) {
                setcompounddrawables3.read(jIconCompatParcelizer);
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00e6 A[Catch: all -> 0x0358, TryCatch #0 {all -> 0x0358, blocks: (B:3:0x0009, B:5:0x0012, B:8:0x001d, B:12:0x0027, B:15:0x0035, B:118:0x0194, B:120:0x01a4, B:121:0x01a7, B:123:0x01b6, B:126:0x01c7, B:134:0x01d8, B:135:0x01df, B:158:0x0224, B:136:0x01e3, B:141:0x01ee, B:143:0x01f8, B:145:0x01ff, B:147:0x0203, B:149:0x0209, B:152:0x0214, B:155:0x021a, B:156:0x021d, B:159:0x0229, B:160:0x022e, B:162:0x0234, B:164:0x023a, B:167:0x0245, B:169:0x024f, B:175:0x0265, B:176:0x0267, B:181:0x0272, B:207:0x02bf, B:185:0x027e, B:190:0x0289, B:192:0x0293, B:194:0x029a, B:196:0x029e, B:198:0x02a4, B:201:0x02af, B:204:0x02b5, B:205:0x02b8, B:208:0x02c4, B:212:0x02d4, B:217:0x02df, B:243:0x032c, B:221:0x02eb, B:226:0x02f6, B:228:0x0300, B:230:0x0307, B:232:0x030b, B:234:0x0311, B:237:0x031c, B:240:0x0322, B:241:0x0325, B:245:0x0333, B:247:0x033d, B:252:0x0350, B:253:0x0352, B:18:0x0040, B:20:0x0050, B:21:0x0053, B:23:0x005d, B:26:0x006e, B:33:0x007d, B:38:0x0088, B:40:0x0092, B:42:0x0099, B:44:0x009d, B:46:0x00a3, B:49:0x00ae, B:52:0x00b4, B:53:0x00b7, B:55:0x00be, B:64:0x00dc, B:66:0x00e0, B:56:0x00c3, B:57:0x00c8, B:59:0x00ce, B:61:0x00d4, B:67:0x00e6, B:69:0x00f8, B:70:0x00fb, B:72:0x0109, B:75:0x011a, B:82:0x0129, B:87:0x0134, B:89:0x013e, B:91:0x0145, B:93:0x0149, B:95:0x014f, B:98:0x015a, B:101:0x0160, B:102:0x0163, B:104:0x016a, B:113:0x0188, B:115:0x018c, B:105:0x016f, B:106:0x0174, B:108:0x017a, B:110:0x0180), top: B:259:0x0009 }] */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v10, types: [o._handleOddName$IconCompatParcelizer] */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v12, types: [o._handleOddName$IconCompatParcelizer] */
    /* JADX WARN: Type inference failed for: r10v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v37 */
    /* JADX WARN: Type inference failed for: r10v58 */
    /* JADX WARN: Type inference failed for: r10v59 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v18, types: [o._handleOddName$IconCompatParcelizer] */
    /* JADX WARN: Type inference failed for: r11v19 */
    /* JADX WARN: Type inference failed for: r11v20, types: [o._handleOddName$IconCompatParcelizer] */
    /* JADX WARN: Type inference failed for: r11v21, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v22 */
    /* JADX WARN: Type inference failed for: r11v23 */
    /* JADX WARN: Type inference failed for: r11v24 */
    /* JADX WARN: Type inference failed for: r11v26 */
    /* JADX WARN: Type inference failed for: r11v42 */
    /* JADX WARN: Type inference failed for: r11v43 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r2v15, types: [o._handleOddName$IconCompatParcelizer] */
    /* JADX WARN: Type inference failed for: r2v16, types: [o._handleOddName$IconCompatParcelizer] */
    /* JADX WARN: Type inference failed for: r2v20, types: [o._handleOddName$IconCompatParcelizer] */
    /* JADX WARN: Type inference failed for: r2v21, types: [o._handleOddName$IconCompatParcelizer] */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v28, types: [o._handleOddName$IconCompatParcelizer] */
    /* JADX WARN: Type inference failed for: r2v29, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v30 */
    /* JADX WARN: Type inference failed for: r2v31 */
    /* JADX WARN: Type inference failed for: r2v32 */
    /* JADX WARN: Type inference failed for: r2v34 */
    /* JADX WARN: Type inference failed for: r2v37 */
    /* JADX WARN: Type inference failed for: r2v38, types: [o._handleOddName$IconCompatParcelizer] */
    /* JADX WARN: Type inference failed for: r2v39, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v40 */
    /* JADX WARN: Type inference failed for: r2v41 */
    /* JADX WARN: Type inference failed for: r2v42 */
    /* JADX WARN: Type inference failed for: r2v44 */
    /* JADX WARN: Type inference failed for: r2v61 */
    /* JADX WARN: Type inference failed for: r2v62 */
    /* JADX WARN: Type inference failed for: r2v63 */
    /* JADX WARN: Type inference failed for: r2v64 */
    /* JADX WARN: Type inference failed for: r9v21 */
    @Override // kotlin.nukeSymbols
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean RemoteActionCompatParcelizer(android.view.KeyEvent r17, kotlin.getCreatedOnDateMs<java.lang.Boolean> r18) {
        /*
            Method dump skipped, instruction units count: 861
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin._verifyLongName2.RemoteActionCompatParcelizer(android.view.KeyEvent, o.getCreatedOnDateMs):boolean");
    }

    private final _handleOddName.IconCompatParcelizer read(Module module) {
        int iWrite = _bind.write(1024) | _bind.write(8192);
        if (!module.getRead().getRatingCompat()) {
            reportWrongTokenException.read("visitLocalDescendants called on an unattached node");
        }
        _handleOddName.IconCompatParcelizer read2 = module.getRead();
        _handleOddName.IconCompatParcelizer iconCompatParcelizer = null;
        if ((read2.getRemoteActionCompatParcelizer() & iWrite) != 0) {
            for (_handleOddName.IconCompatParcelizer audioAttributesImplBaseParcelizer = read2.getAudioAttributesImplBaseParcelizer(); audioAttributesImplBaseParcelizer != null; audioAttributesImplBaseParcelizer = audioAttributesImplBaseParcelizer.getAudioAttributesImplBaseParcelizer()) {
                if ((audioAttributesImplBaseParcelizer.getWrite() & iWrite) != 0) {
                    if ((_bind.write(1024) & audioAttributesImplBaseParcelizer.getWrite()) != 0) {
                        return iconCompatParcelizer;
                    }
                    iconCompatParcelizer = audioAttributesImplBaseParcelizer;
                }
            }
        }
        return iconCompatParcelizer;
    }
}
