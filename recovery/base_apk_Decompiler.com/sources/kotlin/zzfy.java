package kotlin;

import com.marrow.R;
import com.marrow.designsystem.theme.MarrowTheme;

/* JADX INFO: loaded from: classes4.dex */
public final class zzfy {
    public static final zzfy AudioAttributesCompatParcelizer = new zzfy();
    private static MagicModuleSubmissionRequestBody<_handleUnrecognizedCharacterEscape, Integer, getShowPopup> write = multiplyFft.IconCompatParcelizer(-1122547695, false, new MagicModuleSubmissionRequestBody() { // from class: o.zzE
        @Override // kotlin.MagicModuleSubmissionRequestBody
        public final Object invoke(Object obj, Object obj2) {
            return zzfy.read((_handleUnrecognizedCharacterEscape) obj, ((Integer) obj2).intValue());
        }
    });
    private static MagicModuleSubmissionRequestBody<_handleUnrecognizedCharacterEscape, Integer, getShowPopup> IconCompatParcelizer = multiplyFft.IconCompatParcelizer(207901363, false, new MagicModuleSubmissionRequestBody() { // from class: o.zzfz
        @Override // kotlin.MagicModuleSubmissionRequestBody
        public final Object invoke(Object obj, Object obj2) {
            return zzfy.RemoteActionCompatParcelizer((_handleUnrecognizedCharacterEscape) obj, ((Integer) obj2).intValue());
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(_handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        if (!_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer((i & 3) != 2, i & 1)) {
            _handleunrecognizedcharacterescape.onPrepareFromSearch();
        } else {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(-1122547695, i, -1, "com.marrow2.ui.recent_updates.fragments.ComposableSingletons$RecentUpdateDetailComposeLayoutKt.lambda$-1122547695.<anonymous> (RecentUpdateDetailComposeLayout.kt:99)");
            }
            String str = singleArgCreatorDefaultsToProperties.read(R.string.label_recent_updates, _handleunrecognizedcharacterescape, 6);
            deserializeWithObjectId audioAttributesCompatParcelizer = enabled.INSTANCE.IconCompatParcelizer(_handleunrecognizedcharacterescape, enabled.RemoteActionCompatParcelizer).getAudioAttributesCompatParcelizer();
            MarrowTheme marrowTheme = MarrowTheme.INSTANCE;
            _copyCurrentStringValue.IconCompatParcelizer(str, null, MarrowTheme.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape, MarrowTheme.RemoteActionCompatParcelizer).getOnFastForward(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, audioAttributesCompatParcelizer, _handleunrecognizedcharacterescape, 0, 0, 65530);
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup RemoteActionCompatParcelizer(_handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        if (!_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer((i & 3) != 2, i & 1)) {
            _handleunrecognizedcharacterescape.onPrepareFromSearch();
        } else {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(207901363, i, -1, "com.marrow2.ui.recent_updates.fragments.ComposableSingletons$RecentUpdateDetailComposeLayoutKt.lambda$207901363.<anonymous> (RecentUpdateDetailComposeLayout.kt:113)");
            }
            isAnnotationBundle isannotationbundleRemoteActionCompatParcelizer = getDefaultSetterInfo.RemoteActionCompatParcelizer(R.drawable.ic_back_v2, _handleunrecognizedcharacterescape, 6);
            MarrowTheme marrowTheme = MarrowTheme.INSTANCE;
            value.read(isannotationbundleRemoteActionCompatParcelizer, null, null, MarrowTheme.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape, MarrowTheme.RemoteActionCompatParcelizer).getOnFastForward(), _handleunrecognizedcharacterescape, isAnnotationBundle.read | 48, 4);
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        return getShowPopup.INSTANCE;
    }

    public static MagicModuleSubmissionRequestBody<_handleUnrecognizedCharacterEscape, Integer, getShowPopup> AudioAttributesCompatParcelizer() {
        return write;
    }

    public static MagicModuleSubmissionRequestBody<_handleUnrecognizedCharacterEscape, Integer, getShowPopup> read() {
        return IconCompatParcelizer;
    }
}
