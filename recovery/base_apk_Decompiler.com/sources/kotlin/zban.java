package kotlin;

import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.RendererCapabilities;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow2.ui.qbank.play.QBankPlayViewModel;
import java.util.List;
import org.apache.commons.compress.archivers.cpio.CpioConstants;

/* JADX INFO: loaded from: classes4.dex */
public final class zban {
    public static final void RemoteActionCompatParcelizer(final _handleOddName _handleoddname, final List<String> list, final String str, final QBankPlayViewModel qBankPlayViewModel, final boolean z, final getLocality getlocality, final zzhs zzhsVar, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, final int i) {
        int i2;
        _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape2;
        toMagicModuleMetaRepoModel.write(_handleoddname, "");
        toMagicModuleMetaRepoModel.write(list, "");
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(qBankPlayViewModel, "");
        toMagicModuleMetaRepoModel.write(getlocality, "");
        toMagicModuleMetaRepoModel.write(zzhsVar, "");
        _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescapeWrite = _handleunrecognizedcharacterescape.write(-588741365);
        if ((i & 6) == 0) {
            i2 = (_handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(_handleoddname) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(list) ? 32 : 16;
        }
        if ((i & RendererCapabilities.MODE_SUPPORT_MASK) == 0) {
            i2 |= _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(str) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(qBankPlayViewModel) ? 2048 : 1024;
        }
        if ((i & CpioConstants.C_ISBLK) == 0) {
            i2 |= _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(z) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(getlocality) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE;
        }
        if ((1572864 & i) == 0) {
            i2 |= _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(zzhsVar.ordinal()) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if (!_handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer((599187 & i2) != 599186, i2 & 1)) {
            _handleunrecognizedcharacterescape2 = _handleunrecognizedcharacterescapeWrite;
            _handleunrecognizedcharacterescape2.onPrepareFromSearch();
        } else {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(-588741365, i2, -1, "com.marrow2.ui.qbank.play.ui.QBankMcqPagerView (QBankMcqPagerView.kt:20)");
            }
            _handleunrecognizedcharacterescape2 = _handleunrecognizedcharacterescapeWrite;
            getAdministrativeArea.IconCompatParcelizer(isAdded.IconCompatParcelizer$default(_handleoddname, BitmapDescriptorFactory.HUE_RED, 1, null), list, str, zzhsVar, z, qBankPlayViewModel, getlocality, _handleunrecognizedcharacterescapeWrite, ((i2 << 3) & 3670016) | ((i2 << 6) & 458752) | (i2 & AnalyticsListener.EVENT_AUDIO_DECODER_INITIALIZED) | ((i2 >> 9) & 7168) | (57344 & i2), 0);
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        releaseNameCopyBuffer releasenamecopybufferMediaBrowserCompatSearchResultReceiver = _handleunrecognizedcharacterescape2.MediaBrowserCompatSearchResultReceiver();
        if (releasenamecopybufferMediaBrowserCompatSearchResultReceiver != null) {
            releasenamecopybufferMediaBrowserCompatSearchResultReceiver.read(new MagicModuleSubmissionRequestBody() { // from class: o.zbao
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return zban.IconCompatParcelizer(_handleoddname, list, str, qBankPlayViewModel, z, getlocality, zzhsVar, i, (_handleUnrecognizedCharacterEscape) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup IconCompatParcelizer(_handleOddName _handleoddname, List list, String str, QBankPlayViewModel qBankPlayViewModel, boolean z, getLocality getlocality, zzhs zzhsVar, int i, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape) {
        RemoteActionCompatParcelizer(_handleoddname, list, str, qBankPlayViewModel, z, getlocality, zzhsVar, _handleunrecognizedcharacterescape, _appendEscaped.RemoteActionCompatParcelizer(i | 1));
        return getShowPopup.INSTANCE;
    }
}
