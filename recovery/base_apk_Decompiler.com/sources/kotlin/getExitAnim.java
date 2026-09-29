package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a%\u0010\u0004\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a%\u0010\t\u001a\u00020\u0000*\u00020\u00002\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lo/_handleOddName;", "Lo/assignParameter;", "p0", "p1", "write", "(Lo/_handleOddName;FF)Lo/_handleOddName;", "Lkotlin/Function1;", "Lo/bufferMapProperty;", "Lo/hasReferringProperties;", "IconCompatParcelizer", "(Lo/_handleOddName;Lo/getAnswerMap;)Lo/_handleOddName;"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class getExitAnim {
    public static final _handleOddName write(_handleOddName _handleoddname, final float f, final float f2) {
        return _handleoddname.AudioAttributesCompatParcelizer(new getExitTransitionCallback(f, f2, true, new getAnswerMap() { // from class: o.getFocusedView
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return getExitAnim.IconCompatParcelizer(f, f2, (as) obj);
            }
        }, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup IconCompatParcelizer(float f, float f2, as asVar) {
        asVar.write("offset");
        asVar.getIconCompatParcelizer().IconCompatParcelizer("x", assignParameter.read(f));
        asVar.getIconCompatParcelizer().IconCompatParcelizer("y", assignParameter.read(f2));
        return getShowPopup.INSTANCE;
    }

    public static final _handleOddName IconCompatParcelizer(_handleOddName _handleoddname, final getAnswerMap<? super bufferMapProperty, hasReferringProperties> getanswermap) {
        return _handleoddname.AudioAttributesCompatParcelizer(new getLayoutInflater(getanswermap, true, new getAnswerMap() { // from class: o.getEnterTransition
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return getExitAnim.IconCompatParcelizer(getanswermap, (as) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup IconCompatParcelizer(getAnswerMap getanswermap, as asVar) {
        asVar.write("offset");
        asVar.getIconCompatParcelizer().IconCompatParcelizer("offset", getanswermap);
        return getShowPopup.INSTANCE;
    }

    public static /* synthetic */ _handleOddName write$default(_handleOddName _handleoddname, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = assignParameter.IconCompatParcelizer(BitmapDescriptorFactory.HUE_RED);
        }
        if ((i & 2) != 0) {
            f2 = assignParameter.IconCompatParcelizer(BitmapDescriptorFactory.HUE_RED);
        }
        return write(_handleoddname, f, f2);
    }
}
