package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin._handleOddName;
import kotlin._parser;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\f\u001a\u00020\u000b*\u00020\u00062\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\f\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\f\u0010\u0011J\u001b\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u000e0\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015R$\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017"}, d2 = {"Lo/getNumberType;", "Lo/_handleOddName$IconCompatParcelizer;", "Lo/getLongMask;", "Lo/_initForReading;", "<init>", "()V", "Lo/withContentValueHandler;", "Lo/isTypeOrSuperTypeOf;", "p0", "Lo/PropertyValueAny;", "p1", "Lo/withHandlersFrom;", "read", "(Lo/withContentValueHandler;Lo/isTypeOrSuperTypeOf;J)Lo/withHandlersFrom;", "", "Lo/_parser;", "", "(ILo/_parser;)V", "", "Lo/weirdNumberException;", "write", "()Ljava/util/Map;", "IconCompatParcelizer", "Ljava/util/Map;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class getNumberType extends _handleOddName.IconCompatParcelizer implements getLongMask, _initForReading {

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private Map<weirdNumberException, Integer> read;

    @Override // kotlin._initForReading
    public final withHandlersFrom read(withContentValueHandler withcontentvaluehandler, isTypeOrSuperTypeOf istypeorsupertypeof, long j) {
        final int read;
        final int remoteActionCompatParcelizer;
        float fIconCompatParcelizer = assignParameter.IconCompatParcelizer(getQues.read(((assignParameter) MappingJsonFactory.write(this, currentTokenId.IconCompatParcelizer())).getRemoteActionCompatParcelizer(), assignParameter.IconCompatParcelizer(BitmapDescriptorFactory.HUE_RED)));
        final _parser _parserVarWrite = istypeorsupertypeof.write(j);
        boolean z = getRatingCompat() && !Float.isNaN(fIconCompatParcelizer) && assignParameter.write(fIconCompatParcelizer, assignParameter.IconCompatParcelizer(BitmapDescriptorFactory.HUE_RED)) > 0;
        int iIconCompatParcelizer = Float.isNaN(fIconCompatParcelizer) ? 0 : withcontentvaluehandler.IconCompatParcelizer(fIconCompatParcelizer);
        if (z) {
            read = Math.max(_parserVarWrite.getRead(), iIconCompatParcelizer);
        } else {
            read = _parserVarWrite.getRead();
        }
        if (z) {
            remoteActionCompatParcelizer = Math.max(_parserVarWrite.getRemoteActionCompatParcelizer(), iIconCompatParcelizer);
        } else {
            remoteActionCompatParcelizer = _parserVarWrite.getRemoteActionCompatParcelizer();
        }
        if (z) {
            read(iIconCompatParcelizer, _parserVarWrite);
        }
        Map<weirdNumberException, Integer> map = this.read;
        if (map == null) {
            map = VideoTimelineResponseBody.read();
        }
        return withcontentvaluehandler.AudioAttributesCompatParcelizer(read, remoteActionCompatParcelizer, map, new getAnswerMap() { // from class: o.getLongValue
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return getNumberType.AudioAttributesCompatParcelizer(read, _parserVarWrite, remoteActionCompatParcelizer, (_parser.IconCompatParcelizer) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesCompatParcelizer(int i, _parser _parserVar, int i2, _parser.IconCompatParcelizer iconCompatParcelizer) {
        _parser.IconCompatParcelizer.IconCompatParcelizer$default(iconCompatParcelizer, _parserVar, getOnline.RemoteActionCompatParcelizer((i - _parserVar.getRead()) / 2.0f), getOnline.RemoteActionCompatParcelizer((i2 - _parserVar.getRemoteActionCompatParcelizer()) / 2.0f), BitmapDescriptorFactory.HUE_RED, 4, (Object) null);
        return getShowPopup.INSTANCE;
    }

    private final void read(int p0, _parser p1) {
        Map<weirdNumberException, Integer> mapWrite = write();
        mapWrite.put(currentTokenId.RemoteActionCompatParcelizer(), Integer.valueOf(getQues.write(Math.round((p0 - p1.getRead()) / 2.0f), 0)));
        mapWrite.put(currentTokenId.read(), Integer.valueOf(getQues.write(Math.round((p0 - p1.getRemoteActionCompatParcelizer()) / 2.0f), 0)));
    }

    private final Map<weirdNumberException, Integer> write() {
        Map<weirdNumberException, Integer> map = this.read;
        if (map != null) {
            return map;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(2);
        this.read = linkedHashMap;
        return linkedHashMap;
    }
}
