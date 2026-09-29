package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin._parser;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B-\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0016\u0010\u0007\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u00050\u0002¢\u0006\u0004\b\b\u0010\tJ)\u0010\u000e\u001a\u00020\r*\u00020\n2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00052\u0006\u0010\u0007\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0010R$\u0010\u0012\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u00050\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010"}, d2 = {"Lo/registerAdapterDataObserver;", "Lo/withTypeHandler;", "Lkotlin/Function0;", "", "p0", "", "Lo/WritableTypeIdInclusion;", "p1", "<init>", "(Lo/getCreatedOnDateMs;Lo/getCreatedOnDateMs;)V", "Lo/withContentValueHandler;", "Lo/isTypeOrSuperTypeOf;", "Lo/PropertyValueAny;", "Lo/withHandlersFrom;", "AudioAttributesCompatParcelizer", "(Lo/withContentValueHandler;Ljava/util/List;J)Lo/withHandlersFrom;", "Lo/getCreatedOnDateMs;", "write", "read"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class registerAdapterDataObserver implements withTypeHandler {
    private final getCreatedOnDateMs<Boolean> AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final getCreatedOnDateMs<List<WritableTypeIdInclusion>> read;

    /* JADX WARN: Multi-variable type inference failed */
    public registerAdapterDataObserver(getCreatedOnDateMs<Boolean> getcreatedondatems, getCreatedOnDateMs<? extends List<WritableTypeIdInclusion>> getcreatedondatems2) {
        this.AudioAttributesCompatParcelizer = getcreatedondatems;
        this.read = getcreatedondatems2;
    }

    @Override // kotlin.withTypeHandler
    public final withHandlersFrom AudioAttributesCompatParcelizer(withContentValueHandler withcontentvaluehandler, List<? extends isTypeOrSuperTypeOf> list, long j) {
        final ArrayList arrayList;
        ArrayList arrayList2;
        Pair pair;
        ArrayList arrayList3 = new ArrayList(list.size());
        List<? extends isTypeOrSuperTypeOf> list2 = list;
        int size = list2.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            isTypeOrSuperTypeOf istypeorsupertypeof = list.get(i2);
            if (!(istypeorsupertypeof.getOnPrepareFromUri() instanceof RecyclerViewLayoutParams)) {
                arrayList3.add(istypeorsupertypeof);
            }
        }
        ArrayList arrayList4 = arrayList3;
        List<WritableTypeIdInclusion> listInvoke = this.read.invoke();
        if (listInvoke != null) {
            ArrayList arrayList5 = new ArrayList(listInvoke.size());
            int size2 = listInvoke.size();
            int i3 = 0;
            while (i3 < size2) {
                WritableTypeIdInclusion writableTypeIdInclusion = listInvoke.get(i3);
                if (writableTypeIdInclusion != null) {
                    _parser _parserVarWrite = ((isTypeOrSuperTypeOf) arrayList4.get(i3)).write(PropertyValueBuffer.read$default(0, (int) Math.floor(writableTypeIdInclusion.getWrite() - writableTypeIdInclusion.getAudioAttributesCompatParcelizer()), 0, (int) Math.floor(writableTypeIdInclusion.getIconCompatParcelizer() - writableTypeIdInclusion.getRemoteActionCompatParcelizer()), 5, null));
                    int iRound = Math.round(writableTypeIdInclusion.getAudioAttributesCompatParcelizer());
                    long jRound = Math.round(writableTypeIdInclusion.getRemoteActionCompatParcelizer());
                    arrayList2 = arrayList5;
                    long j2 = -1;
                    pair = new Pair(_parserVarWrite, hasReferringProperties.write(hasReferringProperties.read((((((long) i) << 32) | (j2 - ((j2 >> 63) << 32))) & jRound) | (((long) iRound) << 32))));
                } else {
                    arrayList2 = arrayList5;
                    pair = null;
                }
                if (pair != null) {
                    arrayList2.add(pair);
                }
                i3++;
                arrayList5 = arrayList2;
                i = 0;
            }
            arrayList = arrayList5;
        } else {
            arrayList = null;
        }
        ArrayList arrayList6 = new ArrayList(list.size());
        int size3 = list2.size();
        for (int i4 = 0; i4 < size3; i4++) {
            isTypeOrSuperTypeOf istypeorsupertypeof2 = list.get(i4);
            if (istypeorsupertypeof2.getOnPrepareFromUri() instanceof RecyclerViewLayoutParams) {
                arrayList6.add(istypeorsupertypeof2);
            }
        }
        final List list3 = access1200.read((List<? extends isTypeOrSuperTypeOf>) arrayList6, (getCreatedOnDateMs<Boolean>) this.AudioAttributesCompatParcelizer);
        return withContentValueHandler.AudioAttributesCompatParcelizer$default(withcontentvaluehandler, PropertyValueAny.AudioAttributesImplBaseParcelizer(j), PropertyValueAny.AudioAttributesImplApi21Parcelizer(j), null, new getAnswerMap() { // from class: o.onViewAttachedToWindow
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return registerAdapterDataObserver.AudioAttributesCompatParcelizer(arrayList, list3, (_parser.IconCompatParcelizer) obj);
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesCompatParcelizer(List list, List list2, _parser.IconCompatParcelizer iconCompatParcelizer) {
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                Pair pair = (Pair) list.get(i);
                _parser.IconCompatParcelizer.write$default(iconCompatParcelizer, (_parser) pair.RemoteActionCompatParcelizer(), ((hasReferringProperties) pair.read()).getWrite(), BitmapDescriptorFactory.HUE_RED, 2, null);
            }
        }
        if (list2 != null) {
            int size2 = list2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                Pair pair2 = (Pair) list2.get(i2);
                _parser _parserVar = (_parser) pair2.RemoteActionCompatParcelizer();
                getCreatedOnDateMs getcreatedondatems = (getCreatedOnDateMs) pair2.read();
                _parser.IconCompatParcelizer.write$default(iconCompatParcelizer, _parserVar, getcreatedondatems != null ? ((hasReferringProperties) getcreatedondatems.invoke()).getWrite() : hasReferringProperties.INSTANCE.write(), BitmapDescriptorFactory.HUE_RED, 2, null);
            }
        }
        return getShowPopup.INSTANCE;
    }
}
