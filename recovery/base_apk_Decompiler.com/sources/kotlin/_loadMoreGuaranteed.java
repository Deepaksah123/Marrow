package kotlin;

import kotlin.Metadata;
import kotlin._handleOddName;
import kotlin._parser;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\f\u001a\u00020\u000b*\u00020\u00072\u0006\u0010\u0004\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\"\u0010\u0014\u001a\u00020\u00038\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\f\u0010\u0013\"\u0004\b\u0011\u0010\u0006"}, d2 = {"Lo/_loadMoreGuaranteed;", "Lo/_initForReading;", "Lo/_handleOddName$IconCompatParcelizer;", "", "p0", "<init>", "(F)V", "Lo/withContentValueHandler;", "Lo/isTypeOrSuperTypeOf;", "Lo/PropertyValueAny;", "p1", "Lo/withHandlersFrom;", "read", "(Lo/withContentValueHandler;Lo/isTypeOrSuperTypeOf;J)Lo/withHandlersFrom;", "", "toString", "()Ljava/lang/String;", "AudioAttributesCompatParcelizer", "F", "()F", "RemoteActionCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class _loadMoreGuaranteed extends _handleOddName.IconCompatParcelizer implements _initForReading {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private float RemoteActionCompatParcelizer;

    public _loadMoreGuaranteed(float f) {
        this.RemoteActionCompatParcelizer = f;
    }

    public final void AudioAttributesCompatParcelizer(float f) {
        this.RemoteActionCompatParcelizer = f;
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final float getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    /* JADX INFO: renamed from: o._loadMoreGuaranteed$5, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/_parser$IconCompatParcelizer;", "", "write", "(Lo/_parser$IconCompatParcelizer;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass5 extends MagicModuleUseCase implements getAnswerMap<_parser.IconCompatParcelizer, getShowPopup> {
        final /* synthetic */ _parser $read;
        final /* synthetic */ _loadMoreGuaranteed AudioAttributesCompatParcelizer;

        @Override // kotlin.getAnswerMap
        public final /* synthetic */ getShowPopup invoke(_parser.IconCompatParcelizer iconCompatParcelizer) {
            write(iconCompatParcelizer);
            return getShowPopup.INSTANCE;
        }

        public final void write(_parser.IconCompatParcelizer iconCompatParcelizer) {
            iconCompatParcelizer.IconCompatParcelizer(this.$read, 0, 0, this.AudioAttributesCompatParcelizer.getRemoteActionCompatParcelizer());
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass5(_parser _parserVar, _loadMoreGuaranteed _loadmoreguaranteed) {
            super(1);
            this.$read = _parserVar;
            this.AudioAttributesCompatParcelizer = _loadmoreguaranteed;
        }
    }

    @Override // kotlin._initForReading
    public final withHandlersFrom read(withContentValueHandler withcontentvaluehandler, isTypeOrSuperTypeOf istypeorsupertypeof, long j) {
        _parser _parserVarWrite = istypeorsupertypeof.write(j);
        return withContentValueHandler.AudioAttributesCompatParcelizer$default(withcontentvaluehandler, _parserVarWrite.getRead(), _parserVarWrite.getRemoteActionCompatParcelizer(), null, new AnonymousClass5(_parserVarWrite, this), 4, null);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ZIndexModifier(zIndex=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(')');
        return sb.toString();
    }
}
