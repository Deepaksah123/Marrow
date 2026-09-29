package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class setHandler {
    public static final setHandler write = new setHandler();
    private static MagicModuleSubmissionRequestBody<_handleUnrecognizedCharacterEscape, Integer, getShowPopup> AudioAttributesCompatParcelizer = multiplyFft.IconCompatParcelizer(-1216856915, false, new MagicModuleSubmissionRequestBody() { // from class: o.FacebookRequestError
        @Override // kotlin.MagicModuleSubmissionRequestBody
        public final Object invoke(Object obj, Object obj2) {
            return setHandler.RemoteActionCompatParcelizer((_handleUnrecognizedCharacterEscape) obj, ((Integer) obj2).intValue());
        }
    });
    private static MagicModuleSubmissionRequestBody<_handleUnrecognizedCharacterEscape, Integer, getShowPopup> RemoteActionCompatParcelizer = multiplyFft.IconCompatParcelizer(-222041980, false, new MagicModuleSubmissionRequestBody() { // from class: o.Profile
        @Override // kotlin.MagicModuleSubmissionRequestBody
        public final Object invoke(Object obj, Object obj2) {
            return setHandler.write((_handleUnrecognizedCharacterEscape) obj, ((Integer) obj2).intValue());
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup RemoteActionCompatParcelizer(_handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        if (_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer((i & 3) != 2, i & 1)) {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(-1216856915, i, -1, "androidx.compose.material.ComposableSingletons$TabRowKt.lambda$-1216856915.<anonymous> (TabRow.kt:143)");
            }
            Base64Variant.write.IconCompatParcelizer(null, BitmapDescriptorFactory.HUE_RED, 0L, _handleunrecognizedcharacterescape, 3072, 7);
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        } else {
            _handleunrecognizedcharacterescape.onPrepareFromSearch();
        }
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup write(_handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        if (_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer((i & 3) != 2, i & 1)) {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(-222041980, i, -1, "androidx.compose.material.ComposableSingletons$TabRowKt.lambda$-222041980.<anonymous> (TabRow.kt:234)");
            }
            Base64Variant.write.IconCompatParcelizer(null, BitmapDescriptorFactory.HUE_RED, 0L, _handleunrecognizedcharacterescape, 3072, 7);
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        } else {
            _handleunrecognizedcharacterescape.onPrepareFromSearch();
        }
        return getShowPopup.INSTANCE;
    }

    public final MagicModuleSubmissionRequestBody<_handleUnrecognizedCharacterEscape, Integer, getShowPopup> AudioAttributesCompatParcelizer() {
        return AudioAttributesCompatParcelizer;
    }

    public final MagicModuleSubmissionRequestBody<_handleUnrecognizedCharacterEscape, Integer, getShowPopup> IconCompatParcelizer() {
        return RemoteActionCompatParcelizer;
    }
}
