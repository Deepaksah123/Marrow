package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin._handleOddName;
import kotlin._parser;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\f\u001a\u00020\u000b*\u00020\u00062\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\r"}, d2 = {"Lo/JsonAutoDetectVisibility;", "Lo/_handleOddName$IconCompatParcelizer;", "Lo/getLongMask;", "Lo/_initForReading;", "<init>", "()V", "Lo/withContentValueHandler;", "Lo/isTypeOrSuperTypeOf;", "p0", "Lo/PropertyValueAny;", "p1", "Lo/withHandlersFrom;", "read", "(Lo/withContentValueHandler;Lo/isTypeOrSuperTypeOf;J)Lo/withHandlersFrom;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class JsonAutoDetectVisibility extends _handleOddName.IconCompatParcelizer implements getLongMask, _initForReading {
    public static final int read = _handleOddName.IconCompatParcelizer.MediaBrowserCompatSearchResultReceiver;

    @Override // kotlin._initForReading
    public final withHandlersFrom read(withContentValueHandler withcontentvaluehandler, isTypeOrSuperTypeOf istypeorsupertypeof, long j) {
        int read2;
        int remoteActionCompatParcelizer;
        boolean z = getRatingCompat() && ((Boolean) MappingJsonFactory.write(this, hasId.RemoteActionCompatParcelizer())).booleanValue();
        long j2 = hasId.read;
        final _parser _parserVarWrite = istypeorsupertypeof.write(j);
        if (z) {
            read2 = Math.max(_parserVarWrite.getRead(), withcontentvaluehandler.IconCompatParcelizer(handleIdValue.IconCompatParcelizer(j2)));
        } else {
            read2 = _parserVarWrite.getRead();
        }
        final int i = read2;
        if (z) {
            remoteActionCompatParcelizer = Math.max(_parserVarWrite.getRemoteActionCompatParcelizer(), withcontentvaluehandler.IconCompatParcelizer(handleIdValue.write(j2)));
        } else {
            remoteActionCompatParcelizer = _parserVarWrite.getRemoteActionCompatParcelizer();
        }
        final int i2 = remoteActionCompatParcelizer;
        return withContentValueHandler.AudioAttributesCompatParcelizer$default(withcontentvaluehandler, i, i2, null, new getAnswerMap() { // from class: o.JsonCreatorMode
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return JsonAutoDetectVisibility.read(i, _parserVarWrite, i2, (_parser.IconCompatParcelizer) obj);
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(int i, _parser _parserVar, int i2, _parser.IconCompatParcelizer iconCompatParcelizer) {
        _parser.IconCompatParcelizer.IconCompatParcelizer$default(iconCompatParcelizer, _parserVar, getOnline.RemoteActionCompatParcelizer((i - _parserVar.getRead()) / 2.0f), getOnline.RemoteActionCompatParcelizer((i2 - _parserVar.getRemoteActionCompatParcelizer()) / 2.0f), BitmapDescriptorFactory.HUE_RED, 4, (Object) null);
        return getShowPopup.INSTANCE;
    }
}
