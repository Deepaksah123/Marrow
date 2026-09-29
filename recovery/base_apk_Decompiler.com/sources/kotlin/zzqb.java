package kotlin;

import com.marrow.R;
import com.marrow.designsystem.theme.MarrowTheme;

/* JADX INFO: loaded from: classes4.dex */
public final class zzqb {
    public static final zzqb read = new zzqb();
    private static MagicModuleSubmissionRequestBody<_handleUnrecognizedCharacterEscape, Integer, getShowPopup> IconCompatParcelizer = multiplyFft.IconCompatParcelizer(976609889, false, new MagicModuleSubmissionRequestBody() { // from class: o.zzqg
        @Override // kotlin.MagicModuleSubmissionRequestBody
        public final Object invoke(Object obj, Object obj2) {
            return zzqb.write((_handleUnrecognizedCharacterEscape) obj, ((Integer) obj2).intValue());
        }
    });
    private static MagicModuleSubmissionRequestBody<_handleUnrecognizedCharacterEscape, Integer, getShowPopup> RemoteActionCompatParcelizer = multiplyFft.IconCompatParcelizer(-1416154241, false, new MagicModuleSubmissionRequestBody() { // from class: o.zzqd
        @Override // kotlin.MagicModuleSubmissionRequestBody
        public final Object invoke(Object obj, Object obj2) {
            return zzqb.IconCompatParcelizer((_handleUnrecognizedCharacterEscape) obj, ((Integer) obj2).intValue());
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup write(_handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        if (!_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer((i & 3) != 2, i & 1)) {
            _handleunrecognizedcharacterescape.onPrepareFromSearch();
        } else {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(976609889, i, -1, "com.marrow2.ui.schema.listing.ui.ComposableSingletons$TopBarKt.lambda$976609889.<anonymous> (TopBar.kt:48)");
            }
            value.read(getDefaultSetterInfo.RemoteActionCompatParcelizer(R.drawable.ic_info_revamp, _handleunrecognizedcharacterescape, 6), null, null, 0L, _handleunrecognizedcharacterescape, isAnnotationBundle.read | 48, 12);
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup IconCompatParcelizer(_handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        if (!_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer((i & 3) != 2, i & 1)) {
            _handleunrecognizedcharacterescape.onPrepareFromSearch();
        } else {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(-1416154241, i, -1, "com.marrow2.ui.schema.listing.ui.ComposableSingletons$TopBarKt.lambda$-1416154241.<anonymous> (TopBar.kt:56)");
            }
            isAnnotationBundle isannotationbundleRemoteActionCompatParcelizer = getDefaultSetterInfo.RemoteActionCompatParcelizer(R.drawable.arrow_back_rv, _handleunrecognizedcharacterescape, 6);
            MarrowTheme marrowTheme = MarrowTheme.INSTANCE;
            value.read(isannotationbundleRemoteActionCompatParcelizer, null, null, MarrowTheme.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape, MarrowTheme.RemoteActionCompatParcelizer).getOnFastForward(), _handleunrecognizedcharacterescape, isAnnotationBundle.read | 48, 4);
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        return getShowPopup.INSTANCE;
    }

    public static MagicModuleSubmissionRequestBody<_handleUnrecognizedCharacterEscape, Integer, getShowPopup> RemoteActionCompatParcelizer() {
        return RemoteActionCompatParcelizer;
    }

    public static MagicModuleSubmissionRequestBody<_handleUnrecognizedCharacterEscape, Integer, getShowPopup> write() {
        return IconCompatParcelizer;
    }
}
