package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a)\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a'\u0010\u0007\u001a\u00020\u0000*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\u0000¢\u0006\u0004\b\u0007\u0010\u0006"}, d2 = {"Lo/_handleOddName;", "Lkotlin/Function1;", "Lo/getConfigOverride;", "", "p0", "IconCompatParcelizer", "(Lo/_handleOddName;Lo/getAnswerMap;)Lo/_handleOddName;", "RemoteActionCompatParcelizer"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class isStructStart {
    public static /* synthetic */ _handleOddName IconCompatParcelizer$default(_handleOddName _handleoddname, getAnswerMap getanswermap, int i, Object obj) {
        if ((i & 1) != 0) {
            getanswermap = new getAnswerMap() { // from class: o.ObjectCodec
                @Override // kotlin.getAnswerMap
                public final Object invoke(Object obj2) {
                    return isStructStart.read((getConfigOverride) obj2);
                }
            };
        }
        return IconCompatParcelizer(_handleoddname, getanswermap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(getConfigOverride getconfigoverride) {
        return getShowPopup.INSTANCE;
    }

    public static final _handleOddName IconCompatParcelizer(_handleOddName _handleoddname, getAnswerMap<? super getConfigOverride, getShowPopup> getanswermap) {
        return _handleoddname.AudioAttributesCompatParcelizer(new beforeArrayValues(getanswermap));
    }

    public static final _handleOddName RemoteActionCompatParcelizer(_handleOddName _handleoddname, getAnswerMap<? super getConfigOverride, getShowPopup> getanswermap) {
        return _handleoddname.AudioAttributesCompatParcelizer(new appendQuotedUTF8(getanswermap));
    }
}
