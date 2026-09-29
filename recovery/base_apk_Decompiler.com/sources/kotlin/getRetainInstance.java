package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin._handleOddName;
import kotlin._parser;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\f\u001a\u00020\u000b*\u00020\u00072\u0006\u0010\u0004\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rR\u001c\u0010\u0011\u001a\u00020\u00038\u0006@\u0007X\u0086\u000e¢\u0006\f\n\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0006"}, d2 = {"Lo/getRetainInstance;", "Lo/_initForReading;", "Lo/_handleOddName$IconCompatParcelizer;", "Lo/getReturnTransition;", "p0", "<init>", "(Lo/getReturnTransition;)V", "Lo/withContentValueHandler;", "Lo/isTypeOrSuperTypeOf;", "Lo/PropertyValueAny;", "p1", "Lo/withHandlersFrom;", "read", "(Lo/withContentValueHandler;Lo/isTypeOrSuperTypeOf;J)Lo/withHandlersFrom;", "RemoteActionCompatParcelizer", "Lo/getReturnTransition;", "IconCompatParcelizer", "AudioAttributesCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class getRetainInstance extends _handleOddName.IconCompatParcelizer implements _initForReading {

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private getReturnTransition AudioAttributesCompatParcelizer;

    public getRetainInstance(getReturnTransition getreturntransition) {
        this.AudioAttributesCompatParcelizer = getreturntransition;
    }

    public final void IconCompatParcelizer(getReturnTransition getreturntransition) {
        this.AudioAttributesCompatParcelizer = getreturntransition;
    }

    @Override // kotlin._initForReading
    public final withHandlersFrom read(withContentValueHandler withcontentvaluehandler, isTypeOrSuperTypeOf istypeorsupertypeof, long j) {
        float f = this.AudioAttributesCompatParcelizer.read(withcontentvaluehandler.getAudioAttributesCompatParcelizer());
        float read = this.AudioAttributesCompatParcelizer.getRead();
        float fRemoteActionCompatParcelizer = this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(withcontentvaluehandler.getAudioAttributesCompatParcelizer());
        float remoteActionCompatParcelizer = this.AudioAttributesCompatParcelizer.getRemoteActionCompatParcelizer();
        boolean z = assignParameter.write(f, assignParameter.IconCompatParcelizer(BitmapDescriptorFactory.HUE_RED)) >= 0;
        boolean z2 = assignParameter.write(read, assignParameter.IconCompatParcelizer(BitmapDescriptorFactory.HUE_RED)) >= 0;
        if (!(z & z2 & (assignParameter.write(fRemoteActionCompatParcelizer, assignParameter.IconCompatParcelizer(BitmapDescriptorFactory.HUE_RED)) >= 0) & (assignParameter.write(remoteActionCompatParcelizer, assignParameter.IconCompatParcelizer(BitmapDescriptorFactory.HUE_RED)) >= 0))) {
            performCreate.IconCompatParcelizer("Padding must be non-negative");
        }
        final int iIconCompatParcelizer = withcontentvaluehandler.IconCompatParcelizer(f);
        int iIconCompatParcelizer2 = withcontentvaluehandler.IconCompatParcelizer(fRemoteActionCompatParcelizer) + iIconCompatParcelizer;
        final int iIconCompatParcelizer3 = withcontentvaluehandler.IconCompatParcelizer(read);
        int iIconCompatParcelizer4 = withcontentvaluehandler.IconCompatParcelizer(remoteActionCompatParcelizer) + iIconCompatParcelizer3;
        final _parser _parserVarWrite = istypeorsupertypeof.write(PropertyValueBuffer.IconCompatParcelizer(j, -iIconCompatParcelizer2, -iIconCompatParcelizer4));
        return withContentValueHandler.AudioAttributesCompatParcelizer$default(withcontentvaluehandler, PropertyValueBuffer.IconCompatParcelizer(j, _parserVarWrite.getRead() + iIconCompatParcelizer2), PropertyValueBuffer.RemoteActionCompatParcelizer(j, _parserVarWrite.getRemoteActionCompatParcelizer() + iIconCompatParcelizer4), null, new getAnswerMap() { // from class: o.getSharedElementSourceNames
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return getRetainInstance.read(_parserVarWrite, iIconCompatParcelizer, iIconCompatParcelizer3, (_parser.IconCompatParcelizer) obj);
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(_parser _parserVar, int i, int i2, _parser.IconCompatParcelizer iconCompatParcelizer) {
        _parser.IconCompatParcelizer.IconCompatParcelizer$default(iconCompatParcelizer, _parserVar, i, i2, BitmapDescriptorFactory.HUE_RED, 4, (Object) null);
        return getShowPopup.INSTANCE;
    }
}
