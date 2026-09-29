package kotlin;

import com.google.android.exoplayer2.RendererCapabilities;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow.designsystem.theme.AppTheme;
import com.marrow.designsystem.theme.ThemeKt;

/* JADX INFO: loaded from: classes4.dex */
public final class zzG {
    public static final zzG read = new zzG();
    private static MagicModuleSubmissionRequestBody<_handleUnrecognizedCharacterEscape, Integer, getShowPopup> AudioAttributesCompatParcelizer = multiplyFft.IconCompatParcelizer(-1862256432, false, new MagicModuleSubmissionRequestBody() { // from class: o.zzga
        @Override // kotlin.MagicModuleSubmissionRequestBody
        public final Object invoke(Object obj, Object obj2) {
            return zzG.AudioAttributesCompatParcelizer((_handleUnrecognizedCharacterEscape) obj, ((Integer) obj2).intValue());
        }
    });
    private static MagicModuleSubmissionRequestBody<_handleUnrecognizedCharacterEscape, Integer, getShowPopup> IconCompatParcelizer = multiplyFft.IconCompatParcelizer(-1625906352, false, new MagicModuleSubmissionRequestBody() { // from class: o.zzF
        @Override // kotlin.MagicModuleSubmissionRequestBody
        public final Object invoke(Object obj, Object obj2) {
            return zzG.RemoteActionCompatParcelizer((_handleUnrecognizedCharacterEscape) obj, ((Integer) obj2).intValue());
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup RemoteActionCompatParcelizer(_handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        if (!_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer((i & 3) != 2, i & 1)) {
            _handleunrecognizedcharacterescape.onPrepareFromSearch();
        } else {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(-1625906352, i, -1, "com.marrow2.ui.recent_updates.fragments.ComposableSingletons$RecentUpdateDetailFragmentKt.lambda$-1625906352.<anonymous> (RecentUpdateDetailFragment.kt:24)");
            }
            ThemeKt.read((AppTheme) null, false, (MagicModuleSubmissionRequestBody<? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup>) AudioAttributesCompatParcelizer, _handleunrecognizedcharacterescape, RendererCapabilities.MODE_SUPPORT_MASK, 3);
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesCompatParcelizer(_handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        if (!_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer((i & 3) != 2, i & 1)) {
            _handleunrecognizedcharacterescape.onPrepareFromSearch();
        } else {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(-1862256432, i, -1, "com.marrow2.ui.recent_updates.fragments.ComposableSingletons$RecentUpdateDetailFragmentKt.lambda$-1862256432.<anonymous> (RecentUpdateDetailFragment.kt:25)");
            }
            zzH.IconCompatParcelizer(isAdded.RemoteActionCompatParcelizer$default(_handleOddName.INSTANCE, BitmapDescriptorFactory.HUE_RED, 1, null), _handleunrecognizedcharacterescape, 6, 0);
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        return getShowPopup.INSTANCE;
    }

    public static MagicModuleSubmissionRequestBody<_handleUnrecognizedCharacterEscape, Integer, getShowPopup> IconCompatParcelizer() {
        return IconCompatParcelizer;
    }
}
