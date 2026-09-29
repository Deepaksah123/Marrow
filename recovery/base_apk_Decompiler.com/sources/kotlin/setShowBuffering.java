package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.List;
import kotlin.Metadata;
import kotlin._parser;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J)\u0010\r\u001a\u00020\f*\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010"}, d2 = {"Lo/setShowBuffering;", "Lo/withTypeHandler;", "Lkotlin/Function0;", "", "p0", "<init>", "(Lo/getCreatedOnDateMs;)V", "Lo/withContentValueHandler;", "", "Lo/isTypeOrSuperTypeOf;", "Lo/PropertyValueAny;", "p1", "Lo/withHandlersFrom;", "AudioAttributesCompatParcelizer", "(Lo/withContentValueHandler;Ljava/util/List;J)Lo/withHandlersFrom;", "RemoteActionCompatParcelizer", "Lo/getCreatedOnDateMs;", "IconCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class setShowBuffering implements withTypeHandler {

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final getCreatedOnDateMs<Boolean> IconCompatParcelizer;

    public setShowBuffering(getCreatedOnDateMs<Boolean> getcreatedondatems) {
        this.IconCompatParcelizer = getcreatedondatems;
    }

    @Override // kotlin.withTypeHandler
    public final withHandlersFrom AudioAttributesCompatParcelizer(withContentValueHandler withcontentvaluehandler, final List<? extends isTypeOrSuperTypeOf> list, long j) {
        return withContentValueHandler.AudioAttributesCompatParcelizer$default(withcontentvaluehandler, PropertyValueAny.AudioAttributesImplBaseParcelizer(j), PropertyValueAny.AudioAttributesImplApi21Parcelizer(j), null, new getAnswerMap() { // from class: o.setBottomPaddingFraction
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return setShowBuffering.write(list, this, (_parser.IconCompatParcelizer) obj);
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup write(List list, setShowBuffering setshowbuffering, _parser.IconCompatParcelizer iconCompatParcelizer) {
        List list2 = access1200.read((List<? extends isTypeOrSuperTypeOf>) list, (getCreatedOnDateMs<Boolean>) setshowbuffering.IconCompatParcelizer);
        if (list2 != null) {
            int size = list2.size();
            for (int i = 0; i < size; i++) {
                Pair pair = (Pair) list2.get(i);
                _parser _parserVar = (_parser) pair.RemoteActionCompatParcelizer();
                getCreatedOnDateMs getcreatedondatems = (getCreatedOnDateMs) pair.read();
                _parser.IconCompatParcelizer.write$default(iconCompatParcelizer, _parserVar, getcreatedondatems != null ? ((hasReferringProperties) getcreatedondatems.invoke()).getWrite() : hasReferringProperties.INSTANCE.write(), BitmapDescriptorFactory.HUE_RED, 2, null);
            }
        }
        return getShowPopup.INSTANCE;
    }
}
