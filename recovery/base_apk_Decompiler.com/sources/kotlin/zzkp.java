package kotlin;

import androidx.compose.ui.platform.ComposeView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.RendererCapabilities;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow.designsystem.theme.AppTheme;
import com.marrow.designsystem.theme.ThemeKt;

/* JADX INFO: loaded from: classes4.dex */
public final class zzkp extends RecyclerView.onMediaButtonEvent {
    private final ComposeView AudioAttributesCompatParcelizer;

    public final ComposeView AudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzkp(ComposeView composeView) {
        super(composeView);
        toMagicModuleMetaRepoModel.write(composeView, "");
        this.AudioAttributesCompatParcelizer = composeView;
    }

    public final void write(final String str, final String str2, final int i, final zzhs zzhsVar, final boolean z, final InputAccessor<Boolean> inputAccessor, final setUpdatedStatus<Integer> setupdatedstatus) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        toMagicModuleMetaRepoModel.write(zzhsVar, "");
        toMagicModuleMetaRepoModel.write(inputAccessor, "");
        toMagicModuleMetaRepoModel.write(setupdatedstatus, "");
        this.AudioAttributesCompatParcelizer.setContent(multiplyFft.IconCompatParcelizer(1111360113, true, new MagicModuleSubmissionRequestBody() { // from class: o.zzkm
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return zzkp.write(setupdatedstatus, inputAccessor, i, zzhsVar, str2, str, z, (_handleUnrecognizedCharacterEscape) obj, ((Integer) obj2).intValue());
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup write(setUpdatedStatus setupdatedstatus, final InputAccessor inputAccessor, final int i, final zzhs zzhsVar, final String str, final String str2, final boolean z, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i2) {
        if (!_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer((i2 & 3) != 2, i2 & 1)) {
            _handleunrecognizedcharacterescape.onPrepareFromSearch();
        } else {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(1111360113, i2, -1, "com.marrow2.ui.review_components.ui.pagers.McqPagerViewHolder.bind.<anonymous> (McqHorizontalPagerNativeWrapper.kt:132)");
            }
            final parseDouble parsedoubleAudioAttributesCompatParcelizer = isSetterVisible.AudioAttributesCompatParcelizer(setupdatedstatus, _handleunrecognizedcharacterescape, 0);
            ThemeKt.read((AppTheme) null, false, (MagicModuleSubmissionRequestBody<? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup>) multiplyFft.AudioAttributesCompatParcelizer(-2105565967, true, new MagicModuleSubmissionRequestBody() { // from class: o.zzko
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return zzkp.IconCompatParcelizer(inputAccessor, i, zzhsVar, str, str2, z, parsedoubleAudioAttributesCompatParcelizer, (_handleUnrecognizedCharacterEscape) obj, ((Integer) obj2).intValue());
                }
            }, _handleunrecognizedcharacterescape, 54), _handleunrecognizedcharacterescape, RendererCapabilities.MODE_SUPPORT_MASK, 3);
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup IconCompatParcelizer(InputAccessor inputAccessor, int i, zzhs zzhsVar, String str, String str2, boolean z, parseDouble parsedouble, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i2) {
        if (!_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer((i2 & 3) != 2, i2 & 1)) {
            _handleunrecognizedcharacterescape.onPrepareFromSearch();
        } else {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(-2105565967, i2, -1, "com.marrow2.ui.review_components.ui.pagers.McqPagerViewHolder.bind.<anonymous>.<anonymous> (McqHorizontalPagerNativeWrapper.kt:134)");
            }
            zzhy.read(isAdded.IconCompatParcelizer$default(_handleOddName.INSTANCE, BitmapDescriptorFactory.HUE_RED, 1, null), ((Boolean) inputAccessor.getRemoteActionCompatParcelizer()).booleanValue(), zzhsVar, str, zzjc.IconCompatParcelizer, str2, i + 1, z, null, null, false, null, i == IconCompatParcelizer(parsedouble), _handleunrecognizedcharacterescape, 24582, 6, 2816);
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        return getShowPopup.INSTANCE;
    }

    private static final int IconCompatParcelizer(parseDouble<Integer> parsedouble) {
        return parsedouble.getRemoteActionCompatParcelizer().intValue();
    }
}
