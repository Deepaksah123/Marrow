package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin._handleOddName;
import kotlin._parser;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B1\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0007¢\u0006\u0004\b\f\u0010\rJ#\u0010\u0012\u001a\u00020\u0011*\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0012\u001a\u00020\u00038\u0006@\u0007X\u0086\u000e¢\u0006\f\n\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001c\u0010\u001b\u001a\u00020\u00058\u0006@\u0007X\u0087\u000e¢\u0006\f\n\u0004\b\u0018\u0010\u0019\"\u0004\b\u0012\u0010\u001aR.\u0010\u0014\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u00078\u0006@\u0007X\u0087\u000e¢\u0006\f\n\u0004\b\u0016\u0010\u001c\"\u0004\b\u0016\u0010\u001d"}, d2 = {"Lo/performConfigurationChanged;", "Lo/_initForReading;", "Lo/_handleOddName$IconCompatParcelizer;", "Lo/access100;", "p0", "", "p1", "Lkotlin/Function2;", "Lo/getKey;", "Lo/tryToResolveUnresolved;", "Lo/hasReferringProperties;", "p2", "<init>", "(Lo/access100;ZLo/MagicModuleSubmissionRequestBody;)V", "Lo/withContentValueHandler;", "Lo/isTypeOrSuperTypeOf;", "Lo/PropertyValueAny;", "Lo/withHandlersFrom;", "read", "(Lo/withContentValueHandler;Lo/isTypeOrSuperTypeOf;J)Lo/withHandlersFrom;", "write", "Lo/access100;", "IconCompatParcelizer", "(Lo/access100;)V", "RemoteActionCompatParcelizer", "Z", "(Z)V", "AudioAttributesCompatParcelizer", "Lo/MagicModuleSubmissionRequestBody;", "(Lo/MagicModuleSubmissionRequestBody;)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class performConfigurationChanged extends _handleOddName.IconCompatParcelizer implements _initForReading {

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private MagicModuleSubmissionRequestBody<? super getKey, ? super tryToResolveUnresolved, hasReferringProperties> write;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private boolean AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private access100 read;

    public performConfigurationChanged(access100 access100Var, boolean z, MagicModuleSubmissionRequestBody<? super getKey, ? super tryToResolveUnresolved, hasReferringProperties> magicModuleSubmissionRequestBody) {
        this.read = access100Var;
        this.AudioAttributesCompatParcelizer = z;
        this.write = magicModuleSubmissionRequestBody;
    }

    public final void IconCompatParcelizer(access100 access100Var) {
        this.read = access100Var;
    }

    public final void read(boolean z) {
        this.AudioAttributesCompatParcelizer = z;
    }

    public final void IconCompatParcelizer(MagicModuleSubmissionRequestBody<? super getKey, ? super tryToResolveUnresolved, hasReferringProperties> magicModuleSubmissionRequestBody) {
        this.write = magicModuleSubmissionRequestBody;
    }

    @Override // kotlin._initForReading
    public final withHandlersFrom read(final withContentValueHandler withcontentvaluehandler, isTypeOrSuperTypeOf istypeorsupertypeof, long j) {
        final _parser _parserVarWrite = istypeorsupertypeof.write(PropertyValueBuffer.read(this.read != access100.AudioAttributesCompatParcelizer ? 0 : PropertyValueAny.MediaBrowserCompatItemReceiver(j), (this.read == access100.AudioAttributesCompatParcelizer || !this.AudioAttributesCompatParcelizer) ? PropertyValueAny.AudioAttributesImplBaseParcelizer(j) : Integer.MAX_VALUE, this.read == access100.RemoteActionCompatParcelizer ? PropertyValueAny.MediaBrowserCompatCustomActionResultReceiver(j) : 0, (this.read == access100.RemoteActionCompatParcelizer || !this.AudioAttributesCompatParcelizer) ? PropertyValueAny.AudioAttributesImplApi21Parcelizer(j) : Integer.MAX_VALUE));
        final int iWrite = getQues.write(_parserVarWrite.getRead(), PropertyValueAny.MediaBrowserCompatItemReceiver(j), PropertyValueAny.AudioAttributesImplBaseParcelizer(j));
        final int iWrite2 = getQues.write(_parserVarWrite.getRemoteActionCompatParcelizer(), PropertyValueAny.MediaBrowserCompatCustomActionResultReceiver(j), PropertyValueAny.AudioAttributesImplApi21Parcelizer(j));
        return withContentValueHandler.AudioAttributesCompatParcelizer$default(withcontentvaluehandler, iWrite, iWrite2, null, new getAnswerMap() { // from class: o.performActivityCreated
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return performConfigurationChanged.write(this.read, iWrite, _parserVarWrite, iWrite2, withcontentvaluehandler, (_parser.IconCompatParcelizer) obj);
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup write(performConfigurationChanged performconfigurationchanged, int i, _parser _parserVar, int i2, withContentValueHandler withcontentvaluehandler, _parser.IconCompatParcelizer iconCompatParcelizer) {
        long j = -1;
        _parser.IconCompatParcelizer.write$default(iconCompatParcelizer, _parserVar, performconfigurationchanged.write.invoke(getKey.AudioAttributesCompatParcelizer(getKey.read((((long) (i2 - _parserVar.getRemoteActionCompatParcelizer())) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)))) | ((i - _parserVar.getRead()) << 32))), withcontentvaluehandler.getRead()).getWrite(), BitmapDescriptorFactory.HUE_RED, 2, null);
        return getShowPopup.INSTANCE;
    }
}
