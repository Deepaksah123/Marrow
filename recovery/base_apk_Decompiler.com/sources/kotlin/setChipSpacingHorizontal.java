package kotlin;

import com.marrow.R;
import com.marrow.designsystem.theme.MarrowTheme;

/* JADX INFO: loaded from: classes4.dex */
public final class setChipSpacingHorizontal {
    public static final setChipSpacingHorizontal IconCompatParcelizer = new setChipSpacingHorizontal();
    private static MagicModuleSubmissionRequestBody<_handleUnrecognizedCharacterEscape, Integer, getShowPopup> read = multiplyFft.IconCompatParcelizer(-601115168, false, new MagicModuleSubmissionRequestBody() { // from class: o.setChipSpacingHorizontalResource
        @Override // kotlin.MagicModuleSubmissionRequestBody
        public final Object invoke(Object obj, Object obj2) {
            return setChipSpacingHorizontal.write((_handleUnrecognizedCharacterEscape) obj, ((Integer) obj2).intValue());
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup write(_handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        if (!_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer((i & 3) != 2, i & 1)) {
            _handleunrecognizedcharacterescape.onPrepareFromSearch();
        } else {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(-601115168, i, -1, "com.marrow2.ui.test.testplay.ui.ComposableSingletons$McqLayoutKt.lambda$-601115168.<anonymous> (McqLayout.kt:216)");
            }
            isAnnotationBundle isannotationbundleRemoteActionCompatParcelizer = getDefaultSetterInfo.RemoteActionCompatParcelizer(R.drawable.ic_info, _handleunrecognizedcharacterescape, 6);
            MarrowTheme marrowTheme = MarrowTheme.INSTANCE;
            value.read(isannotationbundleRemoteActionCompatParcelizer, null, null, MarrowTheme.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape, MarrowTheme.RemoteActionCompatParcelizer).getOnSetCaptioningEnabled(), _handleunrecognizedcharacterescape, isAnnotationBundle.read | 48, 4);
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        return getShowPopup.INSTANCE;
    }

    public static MagicModuleSubmissionRequestBody<_handleUnrecognizedCharacterEscape, Integer, getShowPopup> IconCompatParcelizer() {
        return read;
    }
}
