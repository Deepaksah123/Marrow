package kotlin;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.RendererCapabilities;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow.R;
import com.marrow.designsystem.theme.MarrowTheme;
import java.util.Locale;
import kotlin._handleOddName;
import org.apache.commons.compress.archivers.cpio.CpioConstants;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes4.dex */
public final class zzJ {

    public static final /* synthetic */ class IconCompatParcelizer {
        public static final /* synthetic */ int[] AudioAttributesCompatParcelizer;

        static {
            int[] iArr = new int[setDouble.values().length];
            try {
                iArr[setDouble.read.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[setDouble.write.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            AudioAttributesCompatParcelizer = iArr;
        }
    }

    public static final void AudioAttributesCompatParcelizer(_handleOddName _handleoddname, final onDisplayInfoChanged ondisplayinfochanged, final String str, final boolean z, final setDouble setdouble, final getCreatedOnDateMs<getShowPopup> getcreatedondatems, final MagicModuleSubmissionRequestBody<? super onDisplayInfoChanged, ? super String, getShowPopup> magicModuleSubmissionRequestBody, final getCreatedOnDateMs<getShowPopup> getcreatedondatems2, final getCreatedOnDateMs<getShowPopup> getcreatedondatems3, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, final int i, final int i2) {
        _handleOddName _handleoddname2;
        int i3;
        _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape2;
        final _handleOddName _handleoddname3;
        toMagicModuleMetaRepoModel.write(ondisplayinfochanged, "");
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(setdouble, "");
        toMagicModuleMetaRepoModel.write(getcreatedondatems, "");
        toMagicModuleMetaRepoModel.write(magicModuleSubmissionRequestBody, "");
        toMagicModuleMetaRepoModel.write(getcreatedondatems2, "");
        toMagicModuleMetaRepoModel.write(getcreatedondatems3, "");
        _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescapeWrite = _handleunrecognizedcharacterescape.write(673834721);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            _handleoddname2 = _handleoddname;
        } else if ((i & 6) == 0) {
            _handleoddname2 = _handleoddname;
            i3 = (_handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(_handleoddname2) ? 4 : 2) | i;
        } else {
            _handleoddname2 = _handleoddname;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(ondisplayinfochanged.ordinal()) ? 32 : 16;
        }
        if ((i & RendererCapabilities.MODE_SUPPORT_MASK) == 0) {
            i3 |= _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(str) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(z) ? 2048 : 1024;
        }
        if ((i & CpioConstants.C_ISBLK) == 0) {
            i3 |= _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(setdouble.ordinal()) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(getcreatedondatems) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE;
        }
        if ((1572864 & i) == 0) {
            i3 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(magicModuleSubmissionRequestBody) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((12582912 & i) == 0) {
            i3 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(getcreatedondatems2) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i3 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(getcreatedondatems3) ? 67108864 : 33554432;
        }
        int i5 = i3;
        if (!_handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer((38347923 & i5) != 38347922, i5 & 1)) {
            _handleunrecognizedcharacterescape2 = _handleunrecognizedcharacterescapeWrite;
            _handleunrecognizedcharacterescape2.onPrepareFromSearch();
            _handleoddname3 = _handleoddname2;
        } else {
            _handleOddName _handleoddname4 = i4 != 0 ? _handleOddName.INSTANCE : _handleoddname2;
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(673834721, i5, -1, "com.marrow2.ui.review_components.ui.description.child.QBankActionBottomLayout (QBankActionsBottomLayout.kt:30)");
            }
            withTypeHandler withtypehandlerIconCompatParcelizer = getTag.IconCompatParcelizer(WindowInsetsCompatImpl30.INSTANCE.AudioAttributesImplApi21Parcelizer(), _skipWSOrEnd.INSTANCE.MediaBrowserCompatCustomActionResultReceiver(), _handleunrecognizedcharacterescapeWrite, 48);
            int iHashCode = Long.hashCode(_getBigDecimal.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, 0));
            _getCharDesc _getchardescHandleMediaPlayPauseIfPendingOnHandler = _handleunrecognizedcharacterescapeWrite.handleMediaPlayPauseIfPendingOnHandler();
            _handleOddName _handleoddnameRemoteActionCompatParcelizer = _verifyNLZ2.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, _handleoddname4);
            getCreatedOnDateMs<getDependencies> getcreatedondatemsIconCompatParcelizer = getDependencies.INSTANCE.IconCompatParcelizer();
            if (!(_handleunrecognizedcharacterescapeWrite.MediaMetadataCompat() instanceof _closeInput)) {
                _getBigDecimal.write();
            }
            _handleunrecognizedcharacterescapeWrite.onPrepareFromMediaId();
            if (_handleunrecognizedcharacterescapeWrite.getParcelableVolumeInfo()) {
                _handleunrecognizedcharacterescapeWrite.read(getcreatedondatemsIconCompatParcelizer);
            } else {
                _handleunrecognizedcharacterescapeWrite.onPlayFromUri();
            }
            _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape3 = NumberOutput.read(_handleunrecognizedcharacterescapeWrite);
            NumberOutput.write(_handleunrecognizedcharacterescape3, withtypehandlerIconCompatParcelizer, getDependencies.INSTANCE.AudioAttributesImplBaseParcelizer());
            NumberOutput.write(_handleunrecognizedcharacterescape3, _getchardescHandleMediaPlayPauseIfPendingOnHandler, getDependencies.INSTANCE.MediaBrowserCompatItemReceiver());
            NumberOutput.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape3, Integer.valueOf(iHashCode), getDependencies.INSTANCE.AudioAttributesCompatParcelizer());
            NumberOutput.write(_handleunrecognizedcharacterescape3, getDependencies.INSTANCE.write());
            NumberOutput.write(_handleunrecognizedcharacterescape3, _handleoddnameRemoteActionCompatParcelizer, getDependencies.INSTANCE.MediaBrowserCompatCustomActionResultReceiver());
            getView getview = getView.INSTANCE;
            _handleOddName.Companion companion = _handleOddName.INSTANCE;
            boolean z2 = (29360128 & i5) == 8388608;
            Object objOnPause = _handleunrecognizedcharacterescapeWrite.onPause();
            if (z2 || objOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause = new getCreatedOnDateMs() { // from class: o.zzL
                    @Override // kotlin.getCreatedOnDateMs
                    public final Object invoke() {
                        return zzJ.IconCompatParcelizer(getcreatedondatems2);
                    }
                };
                _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(objOnPause);
            }
            _handleOddName.Companion companion2 = companion;
            getHoles getholes = getHoles.read;
            CloseImageView.RemoteActionCompatParcelizer((getCreatedOnDateMs) objOnPause, companion2, false, null, null, null, null, null, null, getHoles.read(), _handleunrecognizedcharacterescapeWrite, 805306416, TarConstants.XSTAR_MAGIC_OFFSET);
            _handleOddName _handleoddnameAudioAttributesImplApi26Parcelizer = isAdded.AudioAttributesImplApi26Parcelizer(isAdded.AudioAttributesCompatParcelizer(_handleOddName.INSTANCE, assignParameter.IconCompatParcelizer(32.0f)), assignParameter.IconCompatParcelizer(1.0f));
            float fIconCompatParcelizer = assignParameter.IconCompatParcelizer(1.0f);
            MarrowTheme marrowTheme = MarrowTheme.INSTANCE;
            updatePositions.read(_handleoddnameAudioAttributesImplApi26Parcelizer, MarrowTheme.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, MarrowTheme.RemoteActionCompatParcelizer).get_init_lambda3(), fIconCompatParcelizer, BitmapDescriptorFactory.HUE_RED, _handleunrecognizedcharacterescapeWrite, 390, 8);
            if (z) {
                _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(-1867202674);
                isInLayout.RemoteActionCompatParcelizer(_handleOddName.INSTANCE, _handleunrecognizedcharacterescapeWrite, 6);
                _handleOddName.Companion companion3 = _handleOddName.INSTANCE;
                boolean z3 = (458752 & i5) == 131072;
                Object objOnPause2 = _handleunrecognizedcharacterescapeWrite.onPause();
                if (z3 || objOnPause2 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                    objOnPause2 = new getCreatedOnDateMs() { // from class: o.zzK
                        @Override // kotlin.getCreatedOnDateMs
                        public final Object invoke() {
                            return zzJ.write(getcreatedondatems);
                        }
                    };
                    _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(objOnPause2);
                }
                _handleOddName.Companion companion4 = companion3;
                getHoles getholes2 = getHoles.read;
                CloseImageView.RemoteActionCompatParcelizer((getCreatedOnDateMs) objOnPause2, companion4, false, null, null, null, null, null, null, getHoles.IconCompatParcelizer(), _handleunrecognizedcharacterescapeWrite, 805306416, TarConstants.XSTAR_MAGIC_OFFSET);
            } else {
                _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(-1868922275);
            }
            _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatCustomActionResultReceiver();
            isInLayout.RemoteActionCompatParcelizer(getViewLifecycleOwnerLiveData.RemoteActionCompatParcelizer$default(getview, _handleOddName.INSTANCE, 1.0f, false, 2, null), _handleunrecognizedcharacterescapeWrite, 0);
            _handleOddName _handleoddname5 = _handleoddname4;
            zzij.RemoteActionCompatParcelizer(getview.IconCompatParcelizer(_handleoddname4, _skipWSOrEnd.INSTANCE.MediaBrowserCompatCustomActionResultReceiver()), ondisplayinfochanged, str, false, magicModuleSubmissionRequestBody, _handleunrecognizedcharacterescapeWrite, (i5 & 112) | 3072 | (i5 & 896) | ((i5 >> 6) & 57344), 0);
            _handleunrecognizedcharacterescape2 = _handleunrecognizedcharacterescapeWrite;
            CloseImageView.AudioAttributesCompatParcelizer(getcreatedondatems3, getParentFragment.AudioAttributesCompatParcelizer$default(_handleOddName.INSTANCE, assignParameter.IconCompatParcelizer(16.0f), BitmapDescriptorFactory.HUE_RED, assignParameter.IconCompatParcelizer(16.0f), BitmapDescriptorFactory.HUE_RED, 10, null), false, null, null, null, null, null, null, multiplyFft.AudioAttributesCompatParcelizer(-1986968523, true, new getModuleData() { // from class: o.zzW
                @Override // kotlin.getModuleData
                public final Object AudioAttributesCompatParcelizer(Object obj, Object obj2, Object obj3) {
                    return zzJ.read(setdouble, (getViewLifecycleOwnerLiveData) obj, (_handleUnrecognizedCharacterEscape) obj2, ((Integer) obj3).intValue());
                }
            }, _handleunrecognizedcharacterescape2, 54), _handleunrecognizedcharacterescape2, ((i5 >> 24) & 14) | 805306416, TarConstants.XSTAR_MAGIC_OFFSET);
            _handleunrecognizedcharacterescape2.AudioAttributesImplBaseParcelizer();
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
            _handleoddname3 = _handleoddname5;
        }
        releaseNameCopyBuffer releasenamecopybufferMediaBrowserCompatSearchResultReceiver = _handleunrecognizedcharacterescape2.MediaBrowserCompatSearchResultReceiver();
        if (releasenamecopybufferMediaBrowserCompatSearchResultReceiver != null) {
            releasenamecopybufferMediaBrowserCompatSearchResultReceiver.read(new MagicModuleSubmissionRequestBody() { // from class: o.zzX
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return zzJ.read(_handleoddname3, ondisplayinfochanged, str, z, setdouble, getcreatedondatems, magicModuleSubmissionRequestBody, getcreatedondatems2, getcreatedondatems3, i, i2, (_handleUnrecognizedCharacterEscape) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup IconCompatParcelizer(getCreatedOnDateMs getcreatedondatems) {
        getcreatedondatems.invoke();
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup write(getCreatedOnDateMs getcreatedondatems) {
        getcreatedondatems.invoke();
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(setDouble setdouble, getViewLifecycleOwnerLiveData getviewlifecycleownerlivedata, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        toMagicModuleMetaRepoModel.write(getviewlifecycleownerlivedata, "");
        if (!_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer((i & 17) != 16, i & 1)) {
            _handleunrecognizedcharacterescape.onPrepareFromSearch();
        } else {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(-1986968523, i, -1, "com.marrow2.ui.review_components.ui.description.child.QBankActionBottomLayout.<anonymous>.<anonymous> (QBankActionsBottomLayout.kt:78)");
            }
            _handleOddName _handleoddnameAudioAttributesCompatParcelizer$default = getParentFragment.AudioAttributesCompatParcelizer$default(_handleOddName.INSTANCE, assignParameter.IconCompatParcelizer(21.0f), BitmapDescriptorFactory.HUE_RED, assignParameter.IconCompatParcelizer(21.0f), BitmapDescriptorFactory.HUE_RED, 10, null);
            Context context = (Context) _handleunrecognizedcharacterescape.write(AndroidCompositionLocals_androidKt.IconCompatParcelizer());
            int i2 = IconCompatParcelizer.AudioAttributesCompatParcelizer[setdouble.ordinal()];
            String string = context.getString(i2 != 1 ? i2 != 2 ? R.string.next : R.string.done : R.string.complete);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
            Locale locale = Locale.ROOT;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(locale, "");
            String upperCase = string.toUpperCase(locale);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(upperCase, "");
            _copyCurrentStringValue.IconCompatParcelizer(upperCase, _handleoddnameAudioAttributesCompatParcelizer$default, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, _handleunrecognizedcharacterescape, 48, 0, 131068);
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(_handleOddName _handleoddname, onDisplayInfoChanged ondisplayinfochanged, String str, boolean z, setDouble setdouble, getCreatedOnDateMs getcreatedondatems, MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody, getCreatedOnDateMs getcreatedondatems2, getCreatedOnDateMs getcreatedondatems3, int i, int i2, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape) {
        AudioAttributesCompatParcelizer(_handleoddname, ondisplayinfochanged, str, z, setdouble, getcreatedondatems, magicModuleSubmissionRequestBody, getcreatedondatems2, getcreatedondatems3, _handleunrecognizedcharacterescape, _appendEscaped.RemoteActionCompatParcelizer(i | 1), i2);
        return getShowPopup.INSTANCE;
    }
}
