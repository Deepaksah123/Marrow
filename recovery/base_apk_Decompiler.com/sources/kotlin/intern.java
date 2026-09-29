package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin._handleOddName;
import kotlin._parser;
import kotlin.parseDigitsRecursive;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u001b\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\r\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\n\u001a\u00020\u0010*\u00020\f2\u0006\u0010\u0007\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\n\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0013\u0010\u0016\u001a\u00020\u0006*\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R.\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0016\u0010\u001a\"\u0004\b\u001b\u0010\tR\u0014\u0010\u0016\u001a\u00020\u001d8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010\u001b\u001a\u00020\u001d8\u0017X\u0097D¢\u0006\f\n\u0004\b\u001b\u0010 \u001a\u0004\b!\u0010\u001f"}, d2 = {"Lo/intern;", "Lo/_initForReading;", "Lo/hasIndex;", "Lo/_handleOddName$IconCompatParcelizer;", "Lkotlin/Function1;", "Lo/validateAppend;", "", "p0", "<init>", "(Lo/getAnswerMap;)V", "read", "()V", "Lo/withContentValueHandler;", "Lo/isTypeOrSuperTypeOf;", "Lo/PropertyValueAny;", "p1", "Lo/withHandlersFrom;", "(Lo/withContentValueHandler;Lo/isTypeOrSuperTypeOf;J)Lo/withHandlersFrom;", "", "toString", "()Ljava/lang/String;", "Lo/getConfigOverride;", "write", "(Lo/getConfigOverride;)V", "IconCompatParcelizer", "Lo/getAnswerMap;", "()Lo/getAnswerMap;", "AudioAttributesCompatParcelizer", "RemoteActionCompatParcelizer", "", "AudioAttributesImplBaseParcelizer", "()Z", "Z", "j_"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class intern extends _handleOddName.IconCompatParcelizer implements _initForReading, hasIndex {
    private final boolean AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private getAnswerMap<? super validateAppend, getShowPopup> RemoteActionCompatParcelizer;

    @Override // o._handleOddName.IconCompatParcelizer
    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer */
    public final boolean getRead() {
        return false;
    }

    public intern(getAnswerMap<? super validateAppend, getShowPopup> getanswermap) {
        this.RemoteActionCompatParcelizer = getanswermap;
    }

    public final void AudioAttributesCompatParcelizer(getAnswerMap<? super validateAppend, getShowPopup> getanswermap) {
        this.RemoteActionCompatParcelizer = getanswermap;
    }

    public final getAnswerMap<validateAppend, getShowPopup> write() {
        return this.RemoteActionCompatParcelizer;
    }

    @Override // kotlin.hasIndex
    /* JADX INFO: renamed from: j_, reason: from getter */
    public final boolean getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final void read() {
        _newReader.AudioAttributesCompatParcelizer(this, this.RemoteActionCompatParcelizer);
    }

    /* JADX INFO: renamed from: o.intern$5, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/_parser$IconCompatParcelizer;", "", "IconCompatParcelizer", "(Lo/_parser$IconCompatParcelizer;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass5 extends MagicModuleUseCase implements getAnswerMap<_parser.IconCompatParcelizer, getShowPopup> {
        final /* synthetic */ _parser $write;
        final /* synthetic */ intern read;

        @Override // kotlin.getAnswerMap
        public final /* synthetic */ getShowPopup invoke(_parser.IconCompatParcelizer iconCompatParcelizer) {
            IconCompatParcelizer(iconCompatParcelizer);
            return getShowPopup.INSTANCE;
        }

        public final void IconCompatParcelizer(_parser.IconCompatParcelizer iconCompatParcelizer) {
            _parser.IconCompatParcelizer.read$default(iconCompatParcelizer, this.$write, 0, 0, BitmapDescriptorFactory.HUE_RED, this.read.write(), 4, null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass5(_parser _parserVar, intern internVar) {
            super(1);
            this.$write = _parserVar;
            this.read = internVar;
        }
    }

    @Override // kotlin._initForReading
    public final withHandlersFrom read(withContentValueHandler withcontentvaluehandler, isTypeOrSuperTypeOf istypeorsupertypeof, long j) {
        _parser _parserVarWrite = istypeorsupertypeof.write(j);
        return withContentValueHandler.AudioAttributesCompatParcelizer$default(withcontentvaluehandler, _parserVarWrite.getRead(), _parserVarWrite.getRemoteActionCompatParcelizer(), null, new AnonymousClass5(_parserVarWrite, this), 4, null);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BlockGraphicsLayerModifier(block=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(')');
        return sb.toString();
    }

    @Override // kotlin.hasIndex
    public final void write(getConfigOverride getconfigoverride) {
        findAndAddVirtualProperties onSetRepeatMode;
        boolean onSetRating;
        if (_verifyNoLeadingZeroes.RatingCompat) {
            _bindAndClose _bindandcloseWrite = collectLongDefaults.write((Module) this, _bind.write(2));
            if (!_bindandcloseWrite.getOnSetCaptioningEnabled()) {
                if (expand.RemoteActionCompatParcelizer == null) {
                    expand.RemoteActionCompatParcelizer = new resolveAbstractType();
                } else {
                    resolveAbstractType resolveabstracttype = expand.RemoteActionCompatParcelizer;
                    toMagicModuleMetaRepoModel.write(resolveabstracttype);
                    resolveabstracttype.onPlayFromUri();
                }
                resolveAbstractType resolveabstracttype2 = expand.RemoteActionCompatParcelizer;
                toMagicModuleMetaRepoModel.write(resolveabstracttype2);
                resolveabstracttype2.AudioAttributesCompatParcelizer(_bindandcloseWrite.getIconCompatParcelizer().getOnSkipToQueueItem());
                resolveabstracttype2.MediaBrowserCompatItemReceiver(SetterlessProperty.AudioAttributesCompatParcelizer(_bindandcloseWrite.write()));
                parseDigitsRecursive.Companion companion = parseDigitsRecursive.INSTANCE;
                parseDigitsRecursive parsedigitsrecursiveIconCompatParcelizer = companion.IconCompatParcelizer();
                getAnswerMap<Object, getShowPopup> getanswermapAudioAttributesImplApi26Parcelizer = parsedigitsrecursiveIconCompatParcelizer != null ? parsedigitsrecursiveIconCompatParcelizer.AudioAttributesImplApi26Parcelizer() : null;
                parseDigitsRecursive parsedigitsrecursive = companion.read(parsedigitsrecursiveIconCompatParcelizer);
                try {
                    this.RemoteActionCompatParcelizer.invoke(resolveabstracttype2);
                    getShowPopup getshowpopup = getShowPopup.INSTANCE;
                    companion.AudioAttributesCompatParcelizer(parsedigitsrecursiveIconCompatParcelizer, parsedigitsrecursive, getanswermapAudioAttributesImplApi26Parcelizer);
                    onSetRepeatMode = resolveabstracttype2.getMediaDescriptionCompat();
                    onSetRating = resolveabstracttype2.getOnAddQueueItem();
                } catch (Throwable th) {
                    companion.AudioAttributesCompatParcelizer(parsedigitsrecursiveIconCompatParcelizer, parsedigitsrecursive, getanswermapAudioAttributesImplApi26Parcelizer);
                    throw th;
                }
            } else {
                onSetRepeatMode = _bindandcloseWrite.getOnSetRepeatMode();
                onSetRating = _bindandcloseWrite.getOnSetRating();
            }
            if (onSetRating) {
                MapperBuilder.IconCompatParcelizer(getconfigoverride, onSetRepeatMode);
            }
        }
    }
}
