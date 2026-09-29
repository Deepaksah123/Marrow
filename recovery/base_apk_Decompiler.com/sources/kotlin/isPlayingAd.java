package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class isPlayingAd {
    public static final isPlayingAd AudioAttributesCompatParcelizer = new isPlayingAd();
    private static getModuleData<MagicModuleSubmissionRequestBody<? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup>, _handleUnrecognizedCharacterEscape, Integer, getShowPopup> RemoteActionCompatParcelizer = multiplyFft.IconCompatParcelizer(559628295, false, new getModuleData() { // from class: o.maybeShowController
        @Override // kotlin.getModuleData
        public final Object AudioAttributesCompatParcelizer(Object obj, Object obj2, Object obj3) {
            return isPlayingAd.read((MagicModuleSubmissionRequestBody) obj, (_handleUnrecognizedCharacterEscape) obj2, ((Integer) obj3).intValue());
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        if ((i & 6) == 0) {
            i |= _handleunrecognizedcharacterescape.IconCompatParcelizer(magicModuleSubmissionRequestBody) ? 4 : 2;
        }
        if (_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer((i & 19) != 18, i & 1)) {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(559628295, i, -1, "androidx.compose.foundation.text.ComposableSingletons$CoreTextFieldKt.lambda$559628295.<anonymous> (CoreTextField.kt:210)");
            }
            magicModuleSubmissionRequestBody.invoke(_handleunrecognizedcharacterescape, Integer.valueOf(i & 14));
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        } else {
            _handleunrecognizedcharacterescape.onPrepareFromSearch();
        }
        return getShowPopup.INSTANCE;
    }

    public final getModuleData<MagicModuleSubmissionRequestBody<? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup>, _handleUnrecognizedCharacterEscape, Integer, getShowPopup> RemoteActionCompatParcelizer() {
        return RemoteActionCompatParcelizer;
    }
}
