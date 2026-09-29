package kotlin;

import com.google.android.exoplayer2.RendererCapabilities;
import com.marrow.designsystem.theme.AppTheme;
import com.marrow.designsystem.theme.ThemeKt;
import com.marrow2.ui.plan.membership_detail.ui.main.MembershipDetailViewModel;
import java.util.List;
import kotlin.withFieldVisibility;

/* JADX INFO: loaded from: classes4.dex */
public final class Predicate {
    public static final Predicate RemoteActionCompatParcelizer = new Predicate();
    private static MagicModuleSubmissionRequestBody<_handleUnrecognizedCharacterEscape, Integer, getShowPopup> AudioAttributesCompatParcelizer = multiplyFft.IconCompatParcelizer(1485283437, false, new MagicModuleSubmissionRequestBody() { // from class: o.toScopeString
        @Override // kotlin.MagicModuleSubmissionRequestBody
        public final Object invoke(Object obj, Object obj2) {
            return Predicate.read((_handleUnrecognizedCharacterEscape) obj, ((Integer) obj2).intValue());
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup IconCompatParcelizer(List list, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        if (!_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer((i & 3) != 2, i & 1)) {
            _handleunrecognizedcharacterescape.onPrepareFromSearch();
        } else {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(1986123245, i, -1, "com.marrow2.ui.plan.membership_detail.ui.main.ComposableSingletons$MembershipDetailFragmentKt.lambda$1485283437.<anonymous>.<anonymous> (MembershipDetailFragment.kt:50)");
            }
            RetainForClient.write(list, _handleunrecognizedcharacterescape, 0);
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(_handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        withFieldVisibility.write defaultViewModelCreationExtras;
        if (!_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer((i & 3) != 2, i & 1)) {
            _handleunrecognizedcharacterescape.onPrepareFromSearch();
        } else {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(1485283437, i, -1, "com.marrow2.ui.plan.membership_detail.ui.main.ComposableSingletons$MembershipDetailFragmentKt.lambda$1485283437.<anonymous> (MembershipDetailFragment.kt:45)");
            }
            JDK14Util jDK14Util = JDK14Util.INSTANCE;
            TypeResolutionContext typeResolutionContextIconCompatParcelizer = JDK14Util.IconCompatParcelizer(_handleunrecognizedcharacterescape, 6);
            if (typeResolutionContextIconCompatParcelizer == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            if (typeResolutionContextIconCompatParcelizer instanceof anyExplicitsWithoutIgnoral) {
                defaultViewModelCreationExtras = ((anyExplicitsWithoutIgnoral) typeResolutionContextIconCompatParcelizer).getDefaultViewModelCreationExtras();
            } else {
                defaultViewModelCreationExtras = withFieldVisibility.write.INSTANCE;
            }
            final List list = (List) isSetterVisible.AudioAttributesCompatParcelizer(((MembershipDetailViewModel) JDK14UtilRawTypeName.IconCompatParcelizer(toMagicModuleMetaDataUcModel.write(MembershipDetailViewModel.class), typeResolutionContextIconCompatParcelizer, null, defaultViewModelCreationExtras, _handleunrecognizedcharacterescape, 0)).AudioAttributesCompatParcelizer(), _handleunrecognizedcharacterescape, 0).getRemoteActionCompatParcelizer();
            ThemeKt.read((AppTheme) null, false, (MagicModuleSubmissionRequestBody<? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup>) multiplyFft.AudioAttributesCompatParcelizer(1986123245, true, new MagicModuleSubmissionRequestBody() { // from class: o.getMyProcessName
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return Predicate.IconCompatParcelizer(list, (_handleUnrecognizedCharacterEscape) obj, ((Integer) obj2).intValue());
                }
            }, _handleunrecognizedcharacterescape, 54), _handleunrecognizedcharacterescape, RendererCapabilities.MODE_SUPPORT_MASK, 3);
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        return getShowPopup.INSTANCE;
    }

    public static MagicModuleSubmissionRequestBody<_handleUnrecognizedCharacterEscape, Integer, getShowPopup> AudioAttributesCompatParcelizer() {
        return AudioAttributesCompatParcelizer;
    }
}
