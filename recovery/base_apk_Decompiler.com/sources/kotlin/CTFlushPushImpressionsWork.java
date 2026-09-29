package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class CTFlushPushImpressionsWork {
    public static final CTFlushPushImpressionsWork RemoteActionCompatParcelizer = new CTFlushPushImpressionsWork();
    private static getModuleData<namespace, _handleUnrecognizedCharacterEscape, Integer, getShowPopup> IconCompatParcelizer = multiplyFft.IconCompatParcelizer(1890101041, false, new getModuleData() { // from class: o.requestToken
        @Override // kotlin.getModuleData
        public final Object AudioAttributesCompatParcelizer(Object obj, Object obj2, Object obj3) {
            return CTFlushPushImpressionsWork.IconCompatParcelizer((namespace) obj, (_handleUnrecognizedCharacterEscape) obj2, ((Integer) obj3).intValue());
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup IconCompatParcelizer(namespace namespaceVar, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        int i2;
        if ((i & 6) == 0) {
            i2 = i | ((i & 8) == 0 ? _handleunrecognizedcharacterescape.AudioAttributesCompatParcelizer(namespaceVar) : _handleunrecognizedcharacterescape.IconCompatParcelizer(namespaceVar) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer((i2 & 19) != 18, i2 & 1)) {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(1890101041, i2, -1, "androidx.compose.material.ComposableSingletons$SnackbarHostKt.lambda$1890101041.<anonymous> (SnackbarHost.kt:154)");
            }
            failOnRepeatedNames.read(namespaceVar, null, false, null, 0L, 0L, 0L, BitmapDescriptorFactory.HUE_RED, _handleunrecognizedcharacterescape, i2 & 14, 254);
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        } else {
            _handleunrecognizedcharacterescape.onPrepareFromSearch();
        }
        return getShowPopup.INSTANCE;
    }

    public final getModuleData<namespace, _handleUnrecognizedCharacterEscape, Integer, getShowPopup> read() {
        return IconCompatParcelizer;
    }
}
