package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u001a3\u0010\u0007\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b\u001a\u0011\u0010\t\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lo/_handleOddName;", "", "p0", "Lo/initEncryptedContent;", "p1", "", "p2", "write", "(Lo/_handleOddName;FLo/initEncryptedContent;I)Lo/_handleOddName;", "read", "(Lo/_handleOddName;)Lo/_handleOddName;"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class setPaddingBottom {
    public static /* synthetic */ _handleOddName write$default(_handleOddName _handleoddname, float f, initEncryptedContent initencryptedcontent, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            initencryptedcontent = getQues.AudioAttributesCompatParcelizer(BitmapDescriptorFactory.HUE_RED, 1.0f);
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return write(_handleoddname, f, initencryptedcontent, i);
    }

    public static final _handleOddName write(_handleOddName _handleoddname, final float f, final initEncryptedContent<Float> initencryptedcontent, final int i) {
        return withValueInstantiators.read(_handleoddname, true, new getAnswerMap() { // from class: o.setMaxElementsWrap
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return setPaddingBottom.IconCompatParcelizer(f, initencryptedcontent, i, (getConfigOverride) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup IconCompatParcelizer(float f, initEncryptedContent initencryptedcontent, int i, getConfigOverride getconfigoverride) {
        MapperBuilder.read(getconfigoverride, new hasValueInstantiators(((Number) getQues.read(Float.valueOf(f), (initEncryptedContent<Float>) initencryptedcontent)).floatValue(), initencryptedcontent, i));
        return getShowPopup.INSTANCE;
    }

    public static final _handleOddName read(_handleOddName _handleoddname) {
        return withValueInstantiators.read(_handleoddname, true, new getAnswerMap() { // from class: o.setVerticalGap
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return setPaddingBottom.AudioAttributesCompatParcelizer((getConfigOverride) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesCompatParcelizer(getConfigOverride getconfigoverride) {
        MapperBuilder.read(getconfigoverride, hasValueInstantiators.INSTANCE.read());
        return getShowPopup.INSTANCE;
    }
}
