package kotlin;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin._assertNotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a#\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lo/getValueHandler;", "p0", "", "Lo/isTypeOrSuperTypeOf;", "RemoteActionCompatParcelizer", "(Lo/getValueHandler;)Ljava/util/List;", "Lo/_assertNotNull;", "", "IconCompatParcelizer", "(Lo/_assertNotNull;)Z"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class writeValueAsString {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] RemoteActionCompatParcelizer;

        static {
            int[] iArr = new int[_assertNotNull.RemoteActionCompatParcelizer.values().length];
            try {
                iArr[_assertNotNull.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[_assertNotNull.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[_assertNotNull.RemoteActionCompatParcelizer.write.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[_assertNotNull.RemoteActionCompatParcelizer.read.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[_assertNotNull.RemoteActionCompatParcelizer.IconCompatParcelizer.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            RemoteActionCompatParcelizer = iArr;
        }
    }

    public static final List<List<isTypeOrSuperTypeOf>> RemoteActionCompatParcelizer(getValueHandler getvaluehandler) {
        toMagicModuleMetaRepoModel.read(getvaluehandler, "");
        _assertNotNull iconCompatParcelizer = ((getSerializationConfig) getvaluehandler).getIconCompatParcelizer();
        boolean zIconCompatParcelizer = IconCompatParcelizer(iconCompatParcelizer);
        List<_assertNotNull> listOnPrepareFromMediaId = iconCompatParcelizer.onPrepareFromMediaId();
        ArrayList arrayList = new ArrayList(listOnPrepareFromMediaId.size());
        int size = listOnPrepareFromMediaId.size();
        for (int i = 0; i < size; i++) {
            ArrayList arrayList2 = arrayList;
            _assertNotNull _assertnotnull = listOnPrepareFromMediaId.get(i);
            arrayList2.add(zIconCompatParcelizer ? _assertnotnull.onMediaButtonEvent() : _assertnotnull.onFastForward());
        }
        return arrayList;
    }

    private static final boolean IconCompatParcelizer(_assertNotNull _assertnotnull) {
        int i = WhenMappings.RemoteActionCompatParcelizer[_assertnotnull.onSkipToQueueItem().ordinal()];
        if (i == 1 || i == 2) {
            return true;
        }
        if (i == 3 || i == 4) {
            return false;
        }
        if (i != 5) {
            throw new RenewEligibleCreator();
        }
        _assertNotNull _assertnotnull_init_lambda4 = _assertnotnull._init_lambda4();
        if (_assertnotnull_init_lambda4 != null) {
            return IconCompatParcelizer(_assertnotnull_init_lambda4);
        }
        throw new IllegalArgumentException("no parent for idle node".toString());
    }
}
