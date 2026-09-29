package kotlin;

import androidx.compose.ui.platform.ComposeView;
import androidx.recyclerview.widget.RecyclerView;
import com.marrow2.ui.qbank.play.QBankPlayViewModel;
import java.util.List;

/* JADX INFO: renamed from: o.zzbd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0264zzbd extends RecyclerView.onMediaButtonEvent {
    private final ComposeView IconCompatParcelizer;

    public final ComposeView read() {
        return this.IconCompatParcelizer;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0264zzbd(ComposeView composeView) {
        super(composeView);
        toMagicModuleMetaRepoModel.write(composeView, "");
        this.IconCompatParcelizer = composeView;
    }

    public final void RemoteActionCompatParcelizer(final String str, List<String> list, final int i, final zzhs zzhsVar, final boolean z, final QBankPlayViewModel qBankPlayViewModel, final String str2) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(list, "");
        toMagicModuleMetaRepoModel.write(zzhsVar, "");
        toMagicModuleMetaRepoModel.write(qBankPlayViewModel, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        this.IconCompatParcelizer.setContent(multiplyFft.IconCompatParcelizer(-1686499934, true, new MagicModuleSubmissionRequestBody() { // from class: o.zzbb
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return C0264zzbd.write(str, i, zzhsVar, z, qBankPlayViewModel, str2, (_handleUnrecognizedCharacterEscape) obj, ((Integer) obj2).intValue());
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup write(String str, int i, zzhs zzhsVar, boolean z, QBankPlayViewModel qBankPlayViewModel, String str2, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i2) {
        if (!_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer((i2 & 3) != 2, i2 & 1)) {
            _handleunrecognizedcharacterescape.onPrepareFromSearch();
        } else {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(-1686499934, i2, -1, "com.marrow2.ui.qbank.play.ui.QBankPagerViewHolder.bind.<anonymous> (QBankHorizontalPagerNativeWrapper.kt:187)");
            }
            getAdministrativeArea.AudioAttributesCompatParcelizer(str, i, zzhsVar, z, qBankPlayViewModel, str2, _handleunrecognizedcharacterescape, 0);
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        return getShowPopup.INSTANCE;
    }
}
