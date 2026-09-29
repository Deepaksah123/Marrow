package kotlin;

import android.content.res.Configuration;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.android.exoplayer2.RendererCapabilities;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow.R;
import com.marrow.designsystem.theme.MarrowTheme;
import com.marrow2.ui.qbank.play.QBankPlayViewModel;
import java.lang.reflect.Method;
import java.util.List;
import kotlin._handleOddName;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes4.dex */
public final class zbaf {
    public static final void IconCompatParcelizer(_handleOddName _handleoddname, final QBankPlayViewModel qBankPlayViewModel, final getCreatedOnDateMs<getShowPopup> getcreatedondatems, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, final int i, final int i2) {
        _handleOddName _handleoddname2;
        int i3;
        final _handleOddName _handleoddname3;
        String str;
        getCompanyName getcompanyname;
        int i4;
        toMagicModuleMetaRepoModel.write(qBankPlayViewModel, "");
        toMagicModuleMetaRepoModel.write(getcreatedondatems, "");
        _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescapeWrite = _handleunrecognizedcharacterescape.write(-1571746508);
        int i5 = i2 & 1;
        if (i5 != 0) {
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
            i3 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(qBankPlayViewModel) ? 32 : 16;
        }
        if ((i & RendererCapabilities.MODE_SUPPORT_MASK) == 0) {
            i3 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(getcreatedondatems) ? 256 : 128;
        }
        int i6 = i3;
        if (!_handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer((i6 & 147) != 146, i6 & 1)) {
            _handleunrecognizedcharacterescapeWrite.onPrepareFromSearch();
            _handleoddname3 = _handleoddname2;
        } else {
            _handleOddName _handleoddname4 = i5 != 0 ? _handleOddName.INSTANCE : _handleoddname2;
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(-1571746508, i6, -1, "com.marrow2.ui.qbank.play.ui.QBankMcqHeaderMainLayout (QBankMcqHeaderMainLayout.kt:44)");
            }
            float fFloatValue = ((Number) isSetterVisible.AudioAttributesCompatParcelizer(qBankPlayViewModel.AudioAttributesCompatParcelizer(), _handleunrecognizedcharacterescapeWrite, 0).getRemoteActionCompatParcelizer()).floatValue() / 100.0f;
            List list = (List) isSetterVisible.AudioAttributesCompatParcelizer(qBankPlayViewModel.AudioAttributesImplApi21Parcelizer(), _handleunrecognizedcharacterescapeWrite, 0).getRemoteActionCompatParcelizer();
            getCompanyName getcompanyname2 = (getCompanyName) isSetterVisible.AudioAttributesCompatParcelizer(qBankPlayViewModel.MediaBrowserCompatSearchResultReceiver(), _handleunrecognizedcharacterescapeWrite, 0).getRemoteActionCompatParcelizer();
            boolean zBooleanValue = ((Boolean) isSetterVisible.AudioAttributesCompatParcelizer(qBankPlayViewModel.MediaBrowserCompatCustomActionResultReceiver(), _handleunrecognizedcharacterescapeWrite, 0).getRemoteActionCompatParcelizer()).booleanValue();
            getcompanyname2.getWrite();
            String str2 = singleArgCreatorDefaultsToProperties.AudioAttributesCompatParcelizer(R.array.qbank_steak_second_star_array, _handleunrecognizedcharacterescapeWrite, 0)[getcompanyname2.getIconCompatParcelizer()];
            withTypeHandler withtypehandlerWrite = AbsSavedState1.write(_skipWSOrEnd.INSTANCE.MediaBrowserCompatSearchResultReceiver(), false);
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
            _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape2 = NumberOutput.read(_handleunrecognizedcharacterescapeWrite);
            NumberOutput.write(_handleunrecognizedcharacterescape2, withtypehandlerWrite, getDependencies.INSTANCE.AudioAttributesImplBaseParcelizer());
            NumberOutput.write(_handleunrecognizedcharacterescape2, _getchardescHandleMediaPlayPauseIfPendingOnHandler, getDependencies.INSTANCE.MediaBrowserCompatItemReceiver());
            NumberOutput.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape2, Integer.valueOf(iHashCode), getDependencies.INSTANCE.AudioAttributesCompatParcelizer());
            NumberOutput.write(_handleunrecognizedcharacterescape2, getDependencies.INSTANCE.write());
            NumberOutput.write(_handleunrecognizedcharacterescape2, _handleoddnameRemoteActionCompatParcelizer, getDependencies.INSTANCE.MediaBrowserCompatCustomActionResultReceiver());
            setDrawerElevation setdrawerelevation = setDrawerElevation.INSTANCE;
            withTypeHandler withtypehandler = setValue.read(WindowInsetsCompatImpl30.INSTANCE.MediaBrowserCompatCustomActionResultReceiver(), _skipWSOrEnd.INSTANCE.RatingCompat(), _handleunrecognizedcharacterescapeWrite, 0);
            int iHashCode2 = Long.hashCode(_getBigDecimal.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, 0));
            _getCharDesc _getchardescHandleMediaPlayPauseIfPendingOnHandler2 = _handleunrecognizedcharacterescapeWrite.handleMediaPlayPauseIfPendingOnHandler();
            _handleOddName _handleoddnameRemoteActionCompatParcelizer2 = _verifyNLZ2.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, _handleoddname4);
            getCreatedOnDateMs<getDependencies> getcreatedondatemsIconCompatParcelizer2 = getDependencies.INSTANCE.IconCompatParcelizer();
            if (!(_handleunrecognizedcharacterescapeWrite.MediaMetadataCompat() instanceof _closeInput)) {
                _getBigDecimal.write();
            }
            _handleunrecognizedcharacterescapeWrite.onPrepareFromMediaId();
            if (_handleunrecognizedcharacterescapeWrite.getParcelableVolumeInfo()) {
                _handleunrecognizedcharacterescapeWrite.read(getcreatedondatemsIconCompatParcelizer2);
            } else {
                _handleunrecognizedcharacterescapeWrite.onPlayFromUri();
            }
            _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape3 = NumberOutput.read(_handleunrecognizedcharacterescapeWrite);
            NumberOutput.write(_handleunrecognizedcharacterescape3, withtypehandler, getDependencies.INSTANCE.AudioAttributesImplBaseParcelizer());
            NumberOutput.write(_handleunrecognizedcharacterescape3, _getchardescHandleMediaPlayPauseIfPendingOnHandler2, getDependencies.INSTANCE.MediaBrowserCompatItemReceiver());
            NumberOutput.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape3, Integer.valueOf(iHashCode2), getDependencies.INSTANCE.AudioAttributesCompatParcelizer());
            NumberOutput.write(_handleunrecognizedcharacterescape3, getDependencies.INSTANCE.write());
            NumberOutput.write(_handleunrecognizedcharacterescape3, _handleoddnameRemoteActionCompatParcelizer2, getDependencies.INSTANCE.MediaBrowserCompatCustomActionResultReceiver());
            DrawerLayoutSavedState drawerLayoutSavedState = DrawerLayoutSavedState.INSTANCE;
            if (zBooleanValue) {
                _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(-2011297540);
                _handleOddName _handleoddnameAudioAttributesCompatParcelizer = isAdded.AudioAttributesCompatParcelizer(isAdded.RemoteActionCompatParcelizer$default(_handleOddName.INSTANCE, BitmapDescriptorFactory.HUE_RED, 1, null), assignParameter.IconCompatParcelizer(4.0f));
                MarrowTheme marrowTheme = MarrowTheme.INSTANCE;
                str = str2;
                getcompanyname = getcompanyname2;
                JsonIdentityReference.RemoteActionCompatParcelizer(fFloatValue, _handleoddnameAudioAttributesCompatParcelizer, MarrowTheme.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, MarrowTheme.RemoteActionCompatParcelizer).getRemoteActionCompatParcelizer(), 0L, 0, _handleunrecognizedcharacterescapeWrite, 48, 24);
                _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatCustomActionResultReceiver();
                _handleoddname3 = _handleoddname4;
                i4 = 6;
            } else {
                str = str2;
                getcompanyname = getcompanyname2;
                _handleoddname3 = _handleoddname4;
                _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(-2011288104);
                i4 = 6;
                isInLayout.RemoteActionCompatParcelizer(isAdded.AudioAttributesCompatParcelizer(_handleOddName.INSTANCE, assignParameter.IconCompatParcelizer(4.0f)), _handleunrecognizedcharacterescapeWrite, 6);
                _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatCustomActionResultReceiver();
            }
            RemoteActionCompatParcelizer(getParentFragment.AudioAttributesCompatParcelizer$default(_handleoddname3, BitmapDescriptorFactory.HUE_RED, assignParameter.IconCompatParcelizer(20.0f), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13, null), getcreatedondatems, _handleunrecognizedcharacterescapeWrite, (i6 >> 3) & 112, 0);
            if (qBankPlayViewModel.getOnPrepare() != readBlockToCache.RemoteActionCompatParcelizer) {
                _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(-2011274885);
                AudioAttributesCompatParcelizer(getParentFragment.AudioAttributesCompatParcelizer$default(_handleOddName.INSTANCE, BitmapDescriptorFactory.HUE_RED, assignParameter.IconCompatParcelizer(20.0f), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13, null), (List<readBytesAsString>) list, _handleunrecognizedcharacterescapeWrite, i4, 0);
            } else {
                _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(2071423410);
            }
            _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatCustomActionResultReceiver();
            _handleunrecognizedcharacterescapeWrite.AudioAttributesImplBaseParcelizer();
            final getCompanyName getcompanyname3 = getcompanyname;
            final String str3 = str;
            AppCompatPopupWindow.RemoteActionCompatParcelizer(getcompanyname.getAudioAttributesImplApi26Parcelizer(), null, null, null, null, multiplyFft.AudioAttributesCompatParcelizer(1442658578, true, new getModuleData() { // from class: o.zbaj
                @Override // kotlin.getModuleData
                public final Object AudioAttributesCompatParcelizer(Object obj, Object obj2, Object obj3) {
                    return zbaf.AudioAttributesCompatParcelizer(getcompanyname3, _handleoddname3, str3, (setSupportImageTintMode) obj, (_handleUnrecognizedCharacterEscape) obj2, ((Integer) obj3).intValue());
                }
            }, _handleunrecognizedcharacterescapeWrite, 54), _handleunrecognizedcharacterescapeWrite, 196608, 30);
            _handleunrecognizedcharacterescapeWrite.AudioAttributesImplBaseParcelizer();
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        releaseNameCopyBuffer releasenamecopybufferMediaBrowserCompatSearchResultReceiver = _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatSearchResultReceiver();
        if (releasenamecopybufferMediaBrowserCompatSearchResultReceiver != null) {
            final _handleOddName _handleoddname5 = _handleoddname3;
            releasenamecopybufferMediaBrowserCompatSearchResultReceiver.read(new MagicModuleSubmissionRequestBody() { // from class: o.zbal
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return zbaf.read(_handleoddname5, qBankPlayViewModel, getcreatedondatems, i, i2, (_handleUnrecognizedCharacterEscape) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesCompatParcelizer(getCompanyName getcompanyname, _handleOddName _handleoddname, String str, setSupportImageTintMode setsupportimagetintmode, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        toMagicModuleMetaRepoModel.write(setsupportimagetintmode, "");
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesCompatParcelizer(1442658578, i, -1, "com.marrow2.ui.qbank.play.ui.QBankMcqHeaderMainLayout.<anonymous>.<anonymous> (QBankMcqHeaderMainLayout.kt:91)");
        }
        AudioAttributesCompatParcelizer(_handleoddname, getcompanyname.getRemoteActionCompatParcelizer(), str, _handleunrecognizedcharacterescape, 0, 0);
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesImplApi21Parcelizer();
        }
        return getShowPopup.INSTANCE;
    }

    private static void RemoteActionCompatParcelizer(_handleOddName _handleoddname, final getCreatedOnDateMs<getShowPopup> getcreatedondatems, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, final int i, final int i2) {
        final _handleOddName _handleoddname2;
        int i3;
        float fIconCompatParcelizer;
        toMagicModuleMetaRepoModel.write(getcreatedondatems, "");
        _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescapeWrite = _handleunrecognizedcharacterescape.write(725695476);
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
            i3 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(getcreatedondatems) ? 32 : 16;
        }
        int i5 = i3;
        if (!_handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer((i5 & 19) != 18, i5 & 1)) {
            _handleunrecognizedcharacterescapeWrite.onPrepareFromSearch();
        } else {
            _handleOddName _handleoddname3 = i4 != 0 ? _handleOddName.INSTANCE : _handleoddname2;
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(725695476, i5, -1, "com.marrow2.ui.qbank.play.ui.QBankIconAndCloseLayout (QBankMcqHeaderMainLayout.kt:105)");
            }
            getReturnTransition getreturntransitionWrite = onDestroy.write(onPrimaryNavigationFragmentChanged.RemoteActionCompatParcelizer(onCreateView.INSTANCE, _handleunrecognizedcharacterescapeWrite, 6), _handleunrecognizedcharacterescapeWrite, 0);
            if (VideoRendererEventListenerEventDispatcherExternalSyntheticLambda8.read((Configuration) _handleunrecognizedcharacterescapeWrite.write(AndroidCompositionLocals_androidKt.read()))) {
                fIconCompatParcelizer = getreturntransitionWrite.getRead();
            } else {
                fIconCompatParcelizer = assignParameter.IconCompatParcelizer(BitmapDescriptorFactory.HUE_RED);
            }
            _handleOddName _handleoddnameAudioAttributesCompatParcelizer$default = getParentFragment.AudioAttributesCompatParcelizer$default(_handleoddname3, BitmapDescriptorFactory.HUE_RED, fIconCompatParcelizer, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13, null);
            withTypeHandler withtypehandlerIconCompatParcelizer = getTag.IconCompatParcelizer(WindowInsetsCompatImpl30.INSTANCE.AudioAttributesImplApi21Parcelizer(), _skipWSOrEnd.INSTANCE.MediaBrowserCompatMediaItem(), _handleunrecognizedcharacterescapeWrite, 0);
            int iHashCode = Long.hashCode(_getBigDecimal.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, 0));
            _getCharDesc _getchardescHandleMediaPlayPauseIfPendingOnHandler = _handleunrecognizedcharacterescapeWrite.handleMediaPlayPauseIfPendingOnHandler();
            _handleOddName _handleoddnameRemoteActionCompatParcelizer = _verifyNLZ2.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, _handleoddnameAudioAttributesCompatParcelizer$default);
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
            _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape2 = NumberOutput.read(_handleunrecognizedcharacterescapeWrite);
            NumberOutput.write(_handleunrecognizedcharacterescape2, withtypehandlerIconCompatParcelizer, getDependencies.INSTANCE.AudioAttributesImplBaseParcelizer());
            NumberOutput.write(_handleunrecognizedcharacterescape2, _getchardescHandleMediaPlayPauseIfPendingOnHandler, getDependencies.INSTANCE.MediaBrowserCompatItemReceiver());
            NumberOutput.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape2, Integer.valueOf(iHashCode), getDependencies.INSTANCE.AudioAttributesCompatParcelizer());
            NumberOutput.write(_handleunrecognizedcharacterescape2, getDependencies.INSTANCE.write());
            NumberOutput.write(_handleunrecognizedcharacterescape2, _handleoddnameRemoteActionCompatParcelizer, getDependencies.INSTANCE.MediaBrowserCompatCustomActionResultReceiver());
            getView getview = getView.INSTANCE;
            value.read(getDefaultSetterInfo.RemoteActionCompatParcelizer(R.drawable.ic_marrow_logo_know_more, _handleunrecognizedcharacterescapeWrite, 6), null, isAdded.AudioAttributesCompatParcelizer(getParentFragment.AudioAttributesCompatParcelizer$default(_handleOddName.INSTANCE, assignParameter.IconCompatParcelizer(20.0f), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null), assignParameter.IconCompatParcelizer(20.0f)), enabled.INSTANCE.write(_handleunrecognizedcharacterescapeWrite, enabled.RemoteActionCompatParcelizer).AudioAttributesImplApi26Parcelizer(), _handleunrecognizedcharacterescapeWrite, isAnnotationBundle.read | 432, 0);
            isInLayout.RemoteActionCompatParcelizer(getViewLifecycleOwnerLiveData.RemoteActionCompatParcelizer$default(getview, _handleOddName.INSTANCE, 2.0f, false, 2, null), _handleunrecognizedcharacterescapeWrite, 0);
            isAnnotationBundle isannotationbundleRemoteActionCompatParcelizer = getDefaultSetterInfo.RemoteActionCompatParcelizer(R.drawable.ic_close_blue, _handleunrecognizedcharacterescapeWrite, 6);
            long jAudioAttributesImplApi26Parcelizer = enabled.INSTANCE.write(_handleunrecognizedcharacterescapeWrite, enabled.RemoteActionCompatParcelizer).AudioAttributesImplApi26Parcelizer();
            _handleOddName _handleoddnameAudioAttributesCompatParcelizer$default2 = getParentFragment.AudioAttributesCompatParcelizer$default(_handleOddName.INSTANCE, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, assignParameter.IconCompatParcelizer(20.0f), BitmapDescriptorFactory.HUE_RED, 11, null);
            boolean z = (i5 & 112) == 32;
            Object objOnPause = _handleunrecognizedcharacterescapeWrite.onPause();
            if (z || objOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause = new getCreatedOnDateMs() { // from class: o.zbad
                    private static long AudioAttributesImplBaseParcelizer;
                    private static long IconCompatParcelizer;
                    private static char[] MediaBrowserCompatCustomActionResultReceiver;
                    private static int RemoteActionCompatParcelizer;
                    private static char[] read;
                    private static int write;
                    private static final byte[] $$c = {9, -34, 82, 56};
                    private static final int $$d = 170;
                    private static int $10 = 0;
                    private static int $11 = 1;
                    private static final byte[] $$a = {66, 100, 74, -7, -26, -12, 1, 43, -44, 2, -3, 15, -19, 36, -17, -17, 15, -2, -7, 3, -17, 21, -13};
                    private static final int $$b = 104;
                    private static final byte[] MediaBrowserCompatItemReceiver = {81, -92, 74, -108, 13, -10, 14, -3, -6, -5, -54, 70, -15, 19, -4, -70, 38, 17, 19, -4, -31, 31, -11, 3, 7, 5, -10, 1, 19, -41, 23, -9, 21, -21, -51, 62, -11, 13, -7, -57, 21, 37, -7, 17, -31, 18, 12, 4, -16, 9, -11, 2, 13, -10, 14, -3, -6, -5, -54, 72, -13, -4, 18, -73, 40, 19, -4, 18, -52, 44, -1, -8, 3, -2, 14, -3, -17, 19, -11, 6, -1, -2, 15, -48, 43, 6, -19, 10, -7, -17, 13, 15, -28, 21, 4, -8, 10, 6, -1, 13, -10, 14, -3, -6, -5, -54, 57, 11, -17, 15, -8, 1, -6, 16, -69, 21, 44, -3, 3, 3, -13, -1, -2, 15, -32, 27, 6, -18, 5, -21, 25, 3, 1, -2, 15, -39, 28, 5, -5, 4, 8, -8, -39, 38, -3, 5, -7, -17, 15, 7, 3, -12, 6, 11, 5, 13, -10, 14, -3, -6, -5, -54, 65, 4, -69, 37, 38, -6, 1, -15, 8, -42, 41, 3, -12, 8, 18, -3, 0, -13, 9, 6, -32, 20, 10, -13, -4, 3, -16, 21, 4, -8, -24, 28, 3, 0, -3, 10, -9, 21, -21, -51, 62, -11, 13, -7, -57, 37, 33, -2, -9, 5, -7, -3, -4, -3, 11, -9, 21, -21, -51, 62, -11, 13, -7, -57, 27, 37, 6, -15, 2, -2, 13, -21, 11, 9, -16, -22, 23, 5, 6, -30, 11, 11, 9, -16, -2, 15, -33, 16, 15, -3, -3, 0, -42, 31, 17, -31, 22, 17, -21, -2, 15, -41, 26, 20, -39, 19, 11, -11, -4, 19, -32, 21, 4, -8, 10, 6, -1, 13, -10, 14, -3, -6, -5, -54, 65, 4, -69, 34, 34, -3, -12, 2, 14, 0, 12, -41, 25, -5, -9, 21, -21, -51, 62, -11, 13, -7, -57, 38, 20, 10, -3, 8, -22, 1, 10, -7, -2, 15, -49, 30, 20, -2, -14, -9, 21, -21, -51, 62, -11, 13, -7, -57, 33, 19, 8, -5, -2, 17, -9, 21, -21, -51, 62, -11, 13, -7, -57, 30, 35, -1, -7, 5, -9, -11, -9, 21, -21, -51, 62, -11, 13, -7, -57, 68, -13, 1, 6, -7, -2, 17, -70, 19, 34, 0, 2, 14, 0, -10, -7, 10, -7, -22, 19, 8, -5, -2, 17, -14, 15, -51, 34, 0, 2, 14, 0, -10, -7, 10, -7, -9, 21, -21, -51, 62, -11, 13, -7, -57, 68, -13, 1, 6, -7, -2, 17, -70, 31, 24, 15, -12, 7, -11, 5, 8, -7, -4, -6, -15, 30, -9, 21, -21, -51, 62, -11, 13, -7, -57, 33, 19, 8, -5, -2, 17, -57, -9, 21, -21, -51, 62, -11, 13, -7, -57, 23, TarConstants.LF_CHR, -21, 2, 11, 4, -11, 6, -1};
                    private static final int AudioAttributesImplApi21Parcelizer = 196;

                    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
                    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
                    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002a). Please report as a decompilation issue!!! */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    private static java.lang.String $$e(byte r7, short r8, int r9) {
                        /*
                            int r7 = r7 * 4
                            int r7 = r7 + 1
                            byte[] r0 = kotlin.zbad.$$c
                            int r8 = r8 * 4
                            int r8 = r8 + 101
                            int r9 = r9 * 3
                            int r9 = 4 - r9
                            byte[] r1 = new byte[r7]
                            r2 = 0
                            if (r0 != 0) goto L17
                            r8 = r7
                            r3 = r9
                            r4 = r2
                            goto L2a
                        L17:
                            r3 = r2
                        L18:
                            int r4 = r3 + 1
                            byte r5 = (byte) r8
                            r1[r3] = r5
                            if (r4 != r7) goto L25
                            java.lang.String r7 = new java.lang.String
                            r7.<init>(r1, r2)
                            return r7
                        L25:
                            r3 = r0[r9]
                            r6 = r3
                            r3 = r9
                            r9 = r6
                        L2a:
                            int r9 = -r9
                            int r8 = r8 + r9
                            int r9 = r3 + 1
                            r3 = r4
                            goto L18
                        */
                        throw new UnsupportedOperationException("Method not decompiled: kotlin.zbad.$$e(byte, short, int):java.lang.String");
                    }

                    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
                    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
                    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002e). Please report as a decompilation issue!!! */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    private static void d(short r6, short r7, int r8, java.lang.Object[] r9) {
                        /*
                            int r7 = r7 * 4
                            int r7 = 73 - r7
                            byte[] r0 = kotlin.zbad.$$a
                            int r8 = r8 * 2
                            int r8 = 4 - r8
                            int r6 = r6 * 2
                            int r1 = 20 - r6
                            byte[] r1 = new byte[r1]
                            int r6 = 19 - r6
                            r2 = 0
                            if (r0 != 0) goto L19
                            r4 = r6
                            r7 = r8
                            r3 = r2
                            goto L2e
                        L19:
                            r3 = r2
                        L1a:
                            byte r4 = (byte) r7
                            r1[r3] = r4
                            if (r3 != r6) goto L27
                            java.lang.String r6 = new java.lang.String
                            r6.<init>(r1, r2)
                            r9[r2] = r6
                            return
                        L27:
                            int r3 = r3 + 1
                            r4 = r0[r8]
                            r5 = r8
                            r8 = r7
                            r7 = r5
                        L2e:
                            int r4 = -r4
                            int r8 = r8 + r4
                            int r7 = r7 + 1
                            r5 = r8
                            r8 = r7
                            r7 = r5
                            goto L1a
                        */
                        throw new UnsupportedOperationException("Method not decompiled: kotlin.zbad.d(short, short, int, java.lang.Object[]):void");
                    }

                    private static void b(char c, int i6, int i7, Object[] objArr) throws Throwable {
                        DownloadService downloadService = new DownloadService();
                        long[] jArr = new long[i6];
                        downloadService.write = 0;
                        while (downloadService.write < i6) {
                            int i8 = downloadService.write;
                            try {
                                Object[] objArr2 = {Integer.valueOf(MediaBrowserCompatCustomActionResultReceiver[i7 + i8])};
                                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(1659892375);
                                if (objRemoteActionCompatParcelizer == null) {
                                    byte b = (byte) 0;
                                    byte b2 = b;
                                    objRemoteActionCompatParcelizer = startForeground.read((char) (36621 - Gravity.getAbsoluteGravity(0, 0)), 2340 - (Process.myTid() >> 22), 29 - (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), 480654850, false, $$e(b, b2, b2), new Class[]{Integer.TYPE});
                                }
                                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).longValue()), Long.valueOf(i8), Long.valueOf(AudioAttributesImplBaseParcelizer), Integer.valueOf(c)};
                                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(955774634);
                                if (objRemoteActionCompatParcelizer2 == null) {
                                    objRemoteActionCompatParcelizer2 = startForeground.read((char) Color.red(0), (Process.myPid() >> 22) + 9701, 26 - (ViewConfiguration.getDoubleTapTimeout() >> 16), 1186869823, false, "d", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                                }
                                jArr[i8] = ((Long) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).longValue();
                                Object[] objArr4 = {downloadService, downloadService};
                                Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-452087292);
                                if (objRemoteActionCompatParcelizer3 == null) {
                                    objRemoteActionCompatParcelizer3 = startForeground.read((char) (ViewConfiguration.getTouchSlop() >> 8), 23784 - (ViewConfiguration.getEdgeSlop() >> 16), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 32, -1690012015, false, "b", new Class[]{Object.class, Object.class});
                                }
                                ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
                            } catch (Throwable th) {
                                Throwable cause = th.getCause();
                                if (cause == null) {
                                    throw th;
                                }
                                throw cause;
                            }
                        }
                        char[] cArr = new char[i6];
                        downloadService.write = 0;
                        while (downloadService.write < i6) {
                            cArr[downloadService.write] = (char) jArr[downloadService.write];
                            Object[] objArr5 = {downloadService, downloadService};
                            Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-452087292);
                            if (objRemoteActionCompatParcelizer4 == null) {
                                objRemoteActionCompatParcelizer4 = startForeground.read((char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 1), 23784 - (AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), 33 - Gravity.getAbsoluteGravity(0, 0), -1690012015, false, "b", new Class[]{Object.class, Object.class});
                            }
                            ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5);
                        }
                        objArr[0] = new String(cArr);
                    }

                    private static void c(char c, int i6, int i7, Object[] objArr) throws Throwable {
                        int i8 = 2 % 2;
                        DownloadService downloadService = new DownloadService();
                        long[] jArr = new long[i6];
                        downloadService.write = 0;
                        while (downloadService.write < i6) {
                            int i9 = $11 + 81;
                            $10 = i9 % 128;
                            if (i9 % 2 != 0) {
                                int i10 = downloadService.write;
                                try {
                                    Object[] objArr2 = {Integer.valueOf(read[i7 - i10])};
                                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(1659892375);
                                    if (objRemoteActionCompatParcelizer == null) {
                                        byte b = (byte) 0;
                                        byte b2 = b;
                                        objRemoteActionCompatParcelizer = startForeground.read((char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 36621), 2340 - (ViewConfiguration.getFadingEdgeLength() >> 16), 28 - Color.red(0), 480654850, false, $$e(b, b2, b2), new Class[]{Integer.TYPE});
                                    }
                                    Object[] objArr3 = {Long.valueOf(((Long) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).longValue()), Long.valueOf(i10), Long.valueOf(IconCompatParcelizer), Integer.valueOf(c)};
                                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(955774634);
                                    if (objRemoteActionCompatParcelizer2 == null) {
                                        objRemoteActionCompatParcelizer2 = startForeground.read((char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1), ExpandableListView.getPackedPositionChild(0L) + 9702, TextUtils.getCapsMode("", 0, 0) + 26, 1186869823, false, "d", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                                    }
                                    jArr[i10] = ((Long) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).longValue();
                                    Object[] objArr4 = {downloadService, downloadService};
                                    Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-452087292);
                                    if (objRemoteActionCompatParcelizer3 == null) {
                                        objRemoteActionCompatParcelizer3 = startForeground.read((char) (ViewConfiguration.getEdgeSlop() >> 16), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 23783, (AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 32, -1690012015, false, "b", new Class[]{Object.class, Object.class});
                                    }
                                    ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
                                } catch (Throwable th) {
                                    Throwable cause = th.getCause();
                                    if (cause == null) {
                                        throw th;
                                    }
                                    throw cause;
                                }
                            } else {
                                int i11 = downloadService.write;
                                Object[] objArr5 = {Integer.valueOf(read[i7 + i11])};
                                Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(1659892375);
                                if (objRemoteActionCompatParcelizer4 == null) {
                                    byte b3 = (byte) 0;
                                    byte b4 = b3;
                                    objRemoteActionCompatParcelizer4 = startForeground.read((char) ((TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 36621), 2340 - (ViewConfiguration.getFadingEdgeLength() >> 16), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 27, 480654850, false, $$e(b3, b4, b4), new Class[]{Integer.TYPE});
                                }
                                Object[] objArr6 = {Long.valueOf(((Long) ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5)).longValue()), Long.valueOf(i11), Long.valueOf(IconCompatParcelizer), Integer.valueOf(c)};
                                Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(955774634);
                                if (objRemoteActionCompatParcelizer5 == null) {
                                    objRemoteActionCompatParcelizer5 = startForeground.read((char) (ViewConfiguration.getEdgeSlop() >> 16), 9700 - TextUtils.lastIndexOf("", '0', 0, 0), 26 - (ViewConfiguration.getJumpTapTimeout() >> 16), 1186869823, false, "d", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                                }
                                jArr[i11] = ((Long) ((Method) objRemoteActionCompatParcelizer5).invoke(null, objArr6)).longValue();
                                Object[] objArr7 = {downloadService, downloadService};
                                Object objRemoteActionCompatParcelizer6 = startForeground.RemoteActionCompatParcelizer(-452087292);
                                if (objRemoteActionCompatParcelizer6 == null) {
                                    objRemoteActionCompatParcelizer6 = startForeground.read((char) Gravity.getAbsoluteGravity(0, 0), 23784 - ExpandableListView.getPackedPositionType(0L), 32 - ImageFormat.getBitsPerPixel(0), -1690012015, false, "b", new Class[]{Object.class, Object.class});
                                }
                                ((Method) objRemoteActionCompatParcelizer6).invoke(null, objArr7);
                            }
                        }
                        char[] cArr = new char[i6];
                        downloadService.write = 0;
                        while (downloadService.write < i6) {
                            int i12 = $11 + 81;
                            $10 = i12 % 128;
                            int i13 = i12 % 2;
                            cArr[downloadService.write] = (char) jArr[downloadService.write];
                            Object[] objArr8 = {downloadService, downloadService};
                            Object objRemoteActionCompatParcelizer7 = startForeground.RemoteActionCompatParcelizer(-452087292);
                            if (objRemoteActionCompatParcelizer7 == null) {
                                objRemoteActionCompatParcelizer7 = startForeground.read((char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 23783, 33 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), -1690012015, false, "b", new Class[]{Object.class, Object.class});
                            }
                            ((Method) objRemoteActionCompatParcelizer7).invoke(null, objArr8);
                        }
                        objArr[0] = new String(cArr);
                    }

                    @Override // kotlin.getCreatedOnDateMs
                    public final Object invoke() {
                        int i6 = 2 % 2;
                        int i7 = write + 91;
                        RemoteActionCompatParcelizer = i7 % 128;
                        int i8 = i7 % 2;
                        getShowPopup getshowpopupAudioAttributesCompatParcelizer = zbaf.AudioAttributesCompatParcelizer(getcreatedondatems);
                        int i9 = write + 13;
                        RemoteActionCompatParcelizer = i9 % 128;
                        int i10 = i9 % 2;
                        return getshowpopupAudioAttributesCompatParcelizer;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:126:0x0751 A[Catch: all -> 0x079f, TryCatch #20 {all -> 0x079f, blocks: (B:116:0x073c, B:134:0x0770, B:124:0x074a, B:126:0x0751, B:127:0x0752, B:133:0x0765, B:136:0x0775, B:137:0x078b), top: B:250:0x073c }] */
                    /* JADX WARN: Removed duplicated region for block: B:127:0x0752 A[Catch: all -> 0x079f, TryCatch #20 {all -> 0x079f, blocks: (B:116:0x073c, B:134:0x0770, B:124:0x074a, B:126:0x0751, B:127:0x0752, B:133:0x0765, B:136:0x0775, B:137:0x078b), top: B:250:0x073c }] */
                    /* JADX WARN: Removed duplicated region for block: B:174:0x0832 A[PHI: r18 r19
                      0x0832: PHI (r18v10 int) = (r18v0 int), (r18v1 int), (r18v3 int), (r18v6 int), (r18v11 int) binds: [B:162:0x07f9, B:158:0x07da, B:138:0x0798, B:148:0x07c1, B:19:0x030d] A[DONT_GENERATE, DONT_INLINE]
                      0x0832: PHI (r19v25 short) = (r19v7 short), (r19v8 short), (r19v12 short), (r19v17 short), (r19v26 short) binds: [B:162:0x07f9, B:158:0x07da, B:138:0x0798, B:148:0x07c1, B:19:0x030d] A[DONT_GENERATE, DONT_INLINE]] */
                    /* JADX WARN: Removed duplicated region for block: B:181:0x0845  */
                    /* JADX WARN: Removed duplicated region for block: B:185:0x0852  */
                    /* JADX WARN: Removed duplicated region for block: B:199:0x08ae  */
                    /* JADX WARN: Removed duplicated region for block: B:201:0x08b2  */
                    /* JADX WARN: Removed duplicated region for block: B:261:0x08c1 A[SYNTHETIC] */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public static void write(android.content.Context r20, long r21, long r23) throws java.lang.Throwable {
                        /*
                            Method dump skipped, instruction units count: 2328
                            To view this dump change 'Code comments level' option to 'DEBUG'
                        */
                        throw new UnsupportedOperationException("Method not decompiled: kotlin.zbad.write(android.content.Context, long, long):void");
                    }

                    static {
                        AudioAttributesCompatParcelizer();
                        write = 0;
                        RemoteActionCompatParcelizer = 1;
                        read = new char[]{56424, 15722, 7784};
                        IconCompatParcelizer = 2498590341212028175L;
                    }

                    static void AudioAttributesCompatParcelizer() {
                        MediaBrowserCompatCustomActionResultReceiver = new char[]{56353, 13498, 3374, 26024, 32316, 22173, 44810, 34702, 38936, 61574, 51558, 8684, 14954, 4859, 27480, 17353, 21579, 44247, 34122, 40485, 63149, 53036, 10170, 14356, 4232, 26898, 16778, 23069, 45797, 35699, 58354, 62564, 52445, 9543, 15827, 5707, 28380, 18338, 22579, 45233, 35109, 57765, 64006, 53900, 11022, 923, 5247, 27901, 17776, 24054, 46693, 36549, 59217, 65479, 53338, 10528, 444, 6703, 29367, 19240, 41860, 46090, 35983, 58629, 64992, 54905, 12018, 1909, 8189, 28766, 18647, 41297, 47558, 37441, 60198, 50092, 54313, 11430, 1282, 7575, 30223, 20119, 42783, 49144, 36978, 59635, 49508, 55769, 12872, 2769, 25416, 31709, 19621, 42294, 48557, 38457, 61086, 50973, 57230, 12299, 2183, 24931, 31220, 21093, 43768, 33633, 39891, 60493, 50379, 56647, 13858, 3766, 26413, 32695, 20543, 43160, 33044, 39315, 61979, 51964, 9073, 15343, 3176, 25826, 32068, 21962, 44623, 34499, 40864, 61498, 51386, 8501, 14755, 4637, 27274, 17168, 23429, 44036, 34022, 40306, 62955, 52859, 9949, 16209, 6096, 26710, 16579, 22961, 45612, 35500, 58151, 64385, 52233, 9362, 15619, 5533, 28281, 18175, 24434, 47078, 34904, 57543, 63823, 53707, 10816, 803, 7092, 27690, 17592, 23840, 46495, 36365, 59029, 65285, 55295, 10345, 238, 6505, 29182, 19012, 41682, 47949, 37850, 58559, 64823, 54703, 11817, 1703, 7940, 30602, 18444, 41094, 47456, 37368, 60021, 49909, 56189, 13277, 1106, 7377, 30041, 19905, 42687, 48941, 38827, 59439, 49282, 55574, 12677, 2583, 25222, 31609, 21484, 42098, 48356, 38235, 60872, 50769, 57033, 14173, 2108, 24759, 31026, 20920, 43550, 33436, 39694, 62356, 50178, 56567, 13674, 3568, 26214, 32490, 22342, 45004, 32842, 39118, 61858, 51752, 8879, 15147, 5054, 25629, 31890, 21779, 44418, 34430, 40680, 63351, 53230, 8317, 14556, 4434, 27090, 16961, 23356, 45991, 33839, 40106, 62753, 52611, 9748, 16014, 5912, 28551, 16506, 22765, 45429, 35300, 57948, 64201, 54097, 11208, 15425, 5413, 28077, 17964, 24226, 46849, 36745, 57362, 63627, 53533, 10747, 624, 6898, 29537, 19419, 23623, 46287, 36171, 58820, 65187, 55083, 12206, '!', 6335, 28958, 18840, 41492, 47770, 37757, 60403, 64624, 54510, 11618, 1477, 7757, 30412, 20288, 40993, 47273, 37170, 59819, 49725, 55941, 13078, 2959, 56352};
                        AudioAttributesImplBaseParcelizer = 382076970778768523L;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
                    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
                    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0020 -> B:11:0x0022). Please report as a decompilation issue!!! */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    private static void a(short r5, short r6, byte r7, java.lang.Object[] r8) {
                        /*
                            int r5 = 447 - r5
                            int r6 = 118 - r6
                            byte[] r0 = kotlin.zbad.MediaBrowserCompatItemReceiver
                            int r7 = r7 + 3
                            byte[] r1 = new byte[r7]
                            r2 = 0
                            if (r0 != 0) goto L10
                            r4 = r7
                            r3 = r2
                            goto L22
                        L10:
                            r3 = r2
                        L11:
                            byte r4 = (byte) r6
                            r1[r3] = r4
                            int r3 = r3 + 1
                            if (r3 != r7) goto L20
                            java.lang.String r5 = new java.lang.String
                            r5.<init>(r1, r2)
                            r8[r2] = r5
                            return
                        L20:
                            r4 = r0[r5]
                        L22:
                            int r5 = r5 + 1
                            int r6 = r6 + r4
                            goto L11
                        */
                        throw new UnsupportedOperationException("Method not decompiled: kotlin.zbad.a(short, short, byte, java.lang.Object[]):void");
                    }
                };
                _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(objOnPause);
            }
            value.read(isannotationbundleRemoteActionCompatParcelizer, null, getLocalSavedStateRegistryOwner.RemoteActionCompatParcelizer$default(_handleoddnameAudioAttributesCompatParcelizer$default2, false, null, null, null, (getCreatedOnDateMs) objOnPause, 15, null), jAudioAttributesImplApi26Parcelizer, _handleunrecognizedcharacterescapeWrite, isAnnotationBundle.read | 48, 0);
            _handleunrecognizedcharacterescapeWrite.AudioAttributesImplBaseParcelizer();
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
            _handleoddname2 = _handleoddname3;
        }
        releaseNameCopyBuffer releasenamecopybufferMediaBrowserCompatSearchResultReceiver = _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatSearchResultReceiver();
        if (releasenamecopybufferMediaBrowserCompatSearchResultReceiver != null) {
            releasenamecopybufferMediaBrowserCompatSearchResultReceiver.read(new MagicModuleSubmissionRequestBody() { // from class: o.zbah
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return zbaf.IconCompatParcelizer(_handleoddname2, getcreatedondatems, i, i2, (_handleUnrecognizedCharacterEscape) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesCompatParcelizer(getCreatedOnDateMs getcreatedondatems) {
        getcreatedondatems.invoke();
        return getShowPopup.INSTANCE;
    }

    private static void AudioAttributesCompatParcelizer(_handleOddName _handleoddname, final List<readBytesAsString> list, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, final int i, final int i2) {
        final _handleOddName _handleoddname2;
        int i3;
        toMagicModuleMetaRepoModel.write(list, "");
        _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescapeWrite = _handleunrecognizedcharacterescape.write(466440142);
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
            i3 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(list) ? 32 : 16;
        }
        if (!_handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer((i3 & 19) != 18, i3 & 1)) {
            _handleunrecognizedcharacterescapeWrite.onPrepareFromSearch();
        } else {
            _handleOddName _handleoddname3 = i4 != 0 ? _handleOddName.INSTANCE : _handleoddname2;
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(466440142, i3, -1, "com.marrow2.ui.qbank.play.ui.QBankQuestionIndicatorMain (QBankMcqHeaderMainLayout.kt:144)");
            }
            dismissNow.AudioAttributesCompatParcelizer(getParentFragment.AudioAttributesCompatParcelizer$default(_handleoddname3, assignParameter.IconCompatParcelizer(20.0f), BitmapDescriptorFactory.HUE_RED, assignParameter.IconCompatParcelizer(20.0f), BitmapDescriptorFactory.HUE_RED, 10, null), WindowInsetsCompatImpl30.INSTANCE.AudioAttributesImplApi21Parcelizer(), null, null, 0, 0, multiplyFft.AudioAttributesCompatParcelizer(1562987891, true, new getModuleData() { // from class: o.zbam
                @Override // kotlin.getModuleData
                public final Object AudioAttributesCompatParcelizer(Object obj, Object obj2, Object obj3) {
                    return zbaf.AudioAttributesCompatParcelizer(list, (setCancelable) obj, (_handleUnrecognizedCharacterEscape) obj2, ((Integer) obj3).intValue());
                }
            }, _handleunrecognizedcharacterescapeWrite, 54), _handleunrecognizedcharacterescapeWrite, 1572912, 60);
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
            _handleoddname2 = _handleoddname3;
        }
        releaseNameCopyBuffer releasenamecopybufferMediaBrowserCompatSearchResultReceiver = _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatSearchResultReceiver();
        if (releasenamecopybufferMediaBrowserCompatSearchResultReceiver != null) {
            releasenamecopybufferMediaBrowserCompatSearchResultReceiver.read(new MagicModuleSubmissionRequestBody() { // from class: o.zbaq
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return zbaf.AudioAttributesCompatParcelizer(_handleoddname2, list, i, i2, (_handleUnrecognizedCharacterEscape) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesCompatParcelizer(List list, setCancelable setcancelable, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        long onSetCaptioningEnabled;
        toMagicModuleMetaRepoModel.write(setcancelable, "");
        if (!_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer((i & 17) != 16, i & 1)) {
            _handleunrecognizedcharacterescape.onPrepareFromSearch();
        } else {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(1562987891, i, -1, "com.marrow2.ui.qbank.play.ui.QBankQuestionIndicatorMain.<anonymous> (QBankMcqHeaderMainLayout.kt:149)");
            }
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                int remoteActionCompatParcelizer = ((readBytesAsString) list.get(i2)).getRemoteActionCompatParcelizer();
                if (remoteActionCompatParcelizer == -2) {
                    _handleunrecognizedcharacterescape.IconCompatParcelizer(-2049422153);
                    MarrowTheme marrowTheme = MarrowTheme.INSTANCE;
                    onSetCaptioningEnabled = MarrowTheme.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape, MarrowTheme.RemoteActionCompatParcelizer).getOnSetCaptioningEnabled();
                    _handleunrecognizedcharacterescape.MediaBrowserCompatCustomActionResultReceiver();
                } else if (remoteActionCompatParcelizer == -1 || remoteActionCompatParcelizer == 0) {
                    _handleunrecognizedcharacterescape.IconCompatParcelizer(-2049418193);
                    MarrowTheme marrowTheme2 = MarrowTheme.INSTANCE;
                    onSetCaptioningEnabled = MarrowTheme.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape, MarrowTheme.RemoteActionCompatParcelizer).getOnPrepareFromMediaId();
                    _handleunrecognizedcharacterescape.MediaBrowserCompatCustomActionResultReceiver();
                } else {
                    _handleunrecognizedcharacterescape.IconCompatParcelizer(-2049416270);
                    MarrowTheme marrowTheme3 = MarrowTheme.INSTANCE;
                    onSetCaptioningEnabled = MarrowTheme.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape, MarrowTheme.RemoteActionCompatParcelizer).getOnPrepareFromSearch();
                    _handleunrecognizedcharacterescape.MediaBrowserCompatCustomActionResultReceiver();
                }
                read(onSetCaptioningEnabled, _handleunrecognizedcharacterescape, 0);
            }
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        return getShowPopup.INSTANCE;
    }

    private static void read(final long j, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, final int i) {
        int i2;
        _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescapeWrite = _handleunrecognizedcharacterescape.write(-1441716713);
        if ((i & 6) == 0) {
            i2 = (_handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(j) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (!_handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer((i2 & 3) != 2, i2 & 1)) {
            _handleunrecognizedcharacterescapeWrite.onPrepareFromSearch();
        } else {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(-1441716713, i2, -1, "com.marrow2.ui.qbank.play.ui.QBankQuestionIndicator (QBankMcqHeaderMainLayout.kt:163)");
            }
            _handleOddName _handleoddnameAudioAttributesImplBaseParcelizer = isAdded.AudioAttributesImplBaseParcelizer(getParentFragment.write(_handleOddName.INSTANCE, assignParameter.IconCompatParcelizer(2.0f), assignParameter.IconCompatParcelizer(4.0f)), assignParameter.IconCompatParcelizer(8.0f));
            boolean z = (i2 & 14) == 4;
            Object objOnPause = _handleunrecognizedcharacterescapeWrite.onPause();
            if (z || objOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause = new getAnswerMap() { // from class: o.zbak
                    @Override // kotlin.getAnswerMap
                    public final Object invoke(Object obj) {
                        return zbaf.RemoteActionCompatParcelizer(j, (findSetterInfo) obj);
                    }
                };
                _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(objOnPause);
            }
            setPrimaryDirectionalMotionAxisOverrider2epLt8ui.write(_handleoddnameAudioAttributesImplBaseParcelizer, (getAnswerMap) objOnPause, _handleunrecognizedcharacterescapeWrite, 0);
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        releaseNameCopyBuffer releasenamecopybufferMediaBrowserCompatSearchResultReceiver = _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatSearchResultReceiver();
        if (releasenamecopybufferMediaBrowserCompatSearchResultReceiver != null) {
            releasenamecopybufferMediaBrowserCompatSearchResultReceiver.read(new MagicModuleSubmissionRequestBody() { // from class: o.zbai
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return zbaf.IconCompatParcelizer(j, i, (_handleUnrecognizedCharacterEscape) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup RemoteActionCompatParcelizer(long j, findSetterInfo findsetterinfo) {
        toMagicModuleMetaRepoModel.write(findsetterinfo, "");
        findSetterInfo.AudioAttributesCompatParcelizer$default(findsetterinfo, j, BitmapDescriptorFactory.HUE_RED, 0L, BitmapDescriptorFactory.HUE_RED, null, null, 0, 126, null);
        return getShowPopup.INSTANCE;
    }

    public static final void AudioAttributesCompatParcelizer(_handleOddName _handleoddname, final int i, final String str, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, final int i2, final int i3) {
        _handleOddName _handleoddname2;
        int i4;
        _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape2;
        _handleOddName _handleoddname3;
        toMagicModuleMetaRepoModel.write(str, "");
        _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescapeWrite = _handleunrecognizedcharacterescape.write(874207703);
        int i5 = i3 & 1;
        if (i5 != 0) {
            i4 = i2 | 6;
            _handleoddname2 = _handleoddname;
        } else if ((i2 & 6) == 0) {
            _handleoddname2 = _handleoddname;
            i4 = (_handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(_handleoddname2) ? 4 : 2) | i2;
        } else {
            _handleoddname2 = _handleoddname;
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(i) ? 32 : 16;
        }
        if ((i2 & RendererCapabilities.MODE_SUPPORT_MASK) == 0) {
            i4 |= _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(str) ? 256 : 128;
        }
        int i6 = i4;
        int i7 = 0;
        if (!_handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer((i6 & 147) != 146, i6 & 1)) {
            _handleunrecognizedcharacterescape2 = _handleunrecognizedcharacterescapeWrite;
            _handleunrecognizedcharacterescape2.onPrepareFromSearch();
            _handleoddname3 = _handleoddname2;
        } else {
            _handleoddname3 = i5 != 0 ? _handleOddName.INSTANCE : _handleoddname2;
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(874207703, i6, -1, "com.marrow2.ui.qbank.play.ui.SteakLayout (QBankMcqHeaderMainLayout.kt:178)");
            }
            _handleOddName.Companion companion = _handleOddName.INSTANCE;
            withTypeHandler withtypehandlerWrite = AbsSavedState1.write(_skipWSOrEnd.INSTANCE.MediaBrowserCompatSearchResultReceiver(), false);
            int iHashCode = Long.hashCode(_getBigDecimal.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, 0));
            _getCharDesc _getchardescHandleMediaPlayPauseIfPendingOnHandler = _handleunrecognizedcharacterescapeWrite.handleMediaPlayPauseIfPendingOnHandler();
            _handleOddName _handleoddnameRemoteActionCompatParcelizer = _verifyNLZ2.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, companion);
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
            NumberOutput.write(_handleunrecognizedcharacterescape3, withtypehandlerWrite, getDependencies.INSTANCE.AudioAttributesImplBaseParcelizer());
            NumberOutput.write(_handleunrecognizedcharacterescape3, _getchardescHandleMediaPlayPauseIfPendingOnHandler, getDependencies.INSTANCE.MediaBrowserCompatItemReceiver());
            NumberOutput.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape3, Integer.valueOf(iHashCode), getDependencies.INSTANCE.AudioAttributesCompatParcelizer());
            NumberOutput.write(_handleunrecognizedcharacterescape3, getDependencies.INSTANCE.write());
            NumberOutput.write(_handleunrecognizedcharacterescape3, _handleoddnameRemoteActionCompatParcelizer, getDependencies.INSTANCE.MediaBrowserCompatCustomActionResultReceiver());
            setDrawerElevation setdrawerelevation = setDrawerElevation.INSTANCE;
            MarrowTheme marrowTheme = MarrowTheme.INSTANCE;
            _handleOddName _handleoddnameRemoteActionCompatParcelizer$default = isAdded.RemoteActionCompatParcelizer$default(getParentFragment.IconCompatParcelizer(getFrameEndSchedulerui.IconCompatParcelizer$default(_handleoddname3, MarrowTheme.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, MarrowTheme.RemoteActionCompatParcelizer).getR8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0(), null, 2, null), assignParameter.IconCompatParcelizer(10.0f)), BitmapDescriptorFactory.HUE_RED, 1, null);
            withTypeHandler withtypehandler = setValue.read(WindowInsetsCompatImpl30.INSTANCE.MediaBrowserCompatCustomActionResultReceiver(), _skipWSOrEnd.INSTANCE.AudioAttributesImplApi21Parcelizer(), _handleunrecognizedcharacterescapeWrite, 48);
            int iHashCode2 = Long.hashCode(_getBigDecimal.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, 0));
            _getCharDesc _getchardescHandleMediaPlayPauseIfPendingOnHandler2 = _handleunrecognizedcharacterescapeWrite.handleMediaPlayPauseIfPendingOnHandler();
            _handleOddName _handleoddnameRemoteActionCompatParcelizer2 = _verifyNLZ2.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, _handleoddnameRemoteActionCompatParcelizer$default);
            getCreatedOnDateMs<getDependencies> getcreatedondatemsIconCompatParcelizer2 = getDependencies.INSTANCE.IconCompatParcelizer();
            if (!(_handleunrecognizedcharacterescapeWrite.MediaMetadataCompat() instanceof _closeInput)) {
                _getBigDecimal.write();
            }
            _handleunrecognizedcharacterescapeWrite.onPrepareFromMediaId();
            if (_handleunrecognizedcharacterescapeWrite.getParcelableVolumeInfo()) {
                _handleunrecognizedcharacterescapeWrite.read(getcreatedondatemsIconCompatParcelizer2);
            } else {
                _handleunrecognizedcharacterescapeWrite.onPlayFromUri();
            }
            _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape4 = NumberOutput.read(_handleunrecognizedcharacterescapeWrite);
            NumberOutput.write(_handleunrecognizedcharacterescape4, withtypehandler, getDependencies.INSTANCE.AudioAttributesImplBaseParcelizer());
            NumberOutput.write(_handleunrecognizedcharacterescape4, _getchardescHandleMediaPlayPauseIfPendingOnHandler2, getDependencies.INSTANCE.MediaBrowserCompatItemReceiver());
            NumberOutput.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape4, Integer.valueOf(iHashCode2), getDependencies.INSTANCE.AudioAttributesCompatParcelizer());
            NumberOutput.write(_handleunrecognizedcharacterescape4, getDependencies.INSTANCE.write());
            NumberOutput.write(_handleunrecognizedcharacterescape4, _handleoddnameRemoteActionCompatParcelizer2, getDependencies.INSTANCE.MediaBrowserCompatCustomActionResultReceiver());
            DrawerLayoutSavedState drawerLayoutSavedState = DrawerLayoutSavedState.INSTANCE;
            _handleOddName.Companion companion2 = _handleOddName.INSTANCE;
            withTypeHandler withtypehandlerIconCompatParcelizer = getTag.IconCompatParcelizer(WindowInsetsCompatImpl30.INSTANCE.AudioAttributesImplApi21Parcelizer(), _skipWSOrEnd.INSTANCE.MediaBrowserCompatMediaItem(), _handleunrecognizedcharacterescapeWrite, 0);
            int iHashCode3 = Long.hashCode(_getBigDecimal.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, 0));
            _getCharDesc _getchardescHandleMediaPlayPauseIfPendingOnHandler3 = _handleunrecognizedcharacterescapeWrite.handleMediaPlayPauseIfPendingOnHandler();
            _handleOddName _handleoddnameRemoteActionCompatParcelizer3 = _verifyNLZ2.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, companion2);
            getCreatedOnDateMs<getDependencies> getcreatedondatemsIconCompatParcelizer3 = getDependencies.INSTANCE.IconCompatParcelizer();
            if (!(_handleunrecognizedcharacterescapeWrite.MediaMetadataCompat() instanceof _closeInput)) {
                _getBigDecimal.write();
            }
            _handleunrecognizedcharacterescapeWrite.onPrepareFromMediaId();
            if (_handleunrecognizedcharacterescapeWrite.getParcelableVolumeInfo()) {
                _handleunrecognizedcharacterescapeWrite.read(getcreatedondatemsIconCompatParcelizer3);
            } else {
                _handleunrecognizedcharacterescapeWrite.onPlayFromUri();
            }
            _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape5 = NumberOutput.read(_handleunrecognizedcharacterescapeWrite);
            NumberOutput.write(_handleunrecognizedcharacterescape5, withtypehandlerIconCompatParcelizer, getDependencies.INSTANCE.AudioAttributesImplBaseParcelizer());
            NumberOutput.write(_handleunrecognizedcharacterescape5, _getchardescHandleMediaPlayPauseIfPendingOnHandler3, getDependencies.INSTANCE.MediaBrowserCompatItemReceiver());
            NumberOutput.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape5, Integer.valueOf(iHashCode3), getDependencies.INSTANCE.AudioAttributesCompatParcelizer());
            NumberOutput.write(_handleunrecognizedcharacterescape5, getDependencies.INSTANCE.write());
            NumberOutput.write(_handleunrecognizedcharacterescape5, _handleoddnameRemoteActionCompatParcelizer3, getDependencies.INSTANCE.MediaBrowserCompatCustomActionResultReceiver());
            getView getview = getView.INSTANCE;
            _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(227774651);
            int i8 = 0;
            while (i8 < 5) {
                ViewFactoryHolder.write(getDefaultSetterInfo.RemoteActionCompatParcelizer(i8 < i ? R.drawable.ic_rating_star_yellow : R.drawable.ic_rating_star, _handleunrecognizedcharacterescapeWrite, i7), null, getParentFragment.AudioAttributesCompatParcelizer$default(isAdded.AudioAttributesImplApi26Parcelizer(isAdded.AudioAttributesCompatParcelizer(_handleOddName.INSTANCE, assignParameter.IconCompatParcelizer(44.0f)), assignParameter.IconCompatParcelizer(44.0f)), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, assignParameter.IconCompatParcelizer(4.0f), BitmapDescriptorFactory.HUE_RED, 11, null), null, null, BitmapDescriptorFactory.HUE_RED, null, _handleunrecognizedcharacterescapeWrite, isAnnotationBundle.read | 432, 120);
                i8++;
                i7 = i7;
            }
            _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatCustomActionResultReceiver();
            _handleunrecognizedcharacterescapeWrite.AudioAttributesImplBaseParcelizer();
            deserializeWithObjectId remoteActionCompatParcelizer = enabled.INSTANCE.IconCompatParcelizer(_handleunrecognizedcharacterescapeWrite, enabled.RemoteActionCompatParcelizer).getRemoteActionCompatParcelizer();
            MarrowTheme marrowTheme2 = MarrowTheme.INSTANCE;
            _handleunrecognizedcharacterescape2 = _handleunrecognizedcharacterescapeWrite;
            _copyCurrentStringValue.IconCompatParcelizer(str, null, MarrowTheme.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, MarrowTheme.RemoteActionCompatParcelizer).getOnFastForward(), setResolver.RemoteActionCompatParcelizer(12), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, remoteActionCompatParcelizer, _handleunrecognizedcharacterescape2, ((i6 >> 6) & 14) | 3072, 0, 65522);
            _handleunrecognizedcharacterescape2.AudioAttributesImplBaseParcelizer();
            _handleunrecognizedcharacterescape2.AudioAttributesImplBaseParcelizer();
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        releaseNameCopyBuffer releasenamecopybufferMediaBrowserCompatSearchResultReceiver = _handleunrecognizedcharacterescape2.MediaBrowserCompatSearchResultReceiver();
        if (releasenamecopybufferMediaBrowserCompatSearchResultReceiver != null) {
            final _handleOddName _handleoddname4 = _handleoddname3;
            releasenamecopybufferMediaBrowserCompatSearchResultReceiver.read(new MagicModuleSubmissionRequestBody() { // from class: o.zbae
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return zbaf.read(_handleoddname4, i, str, i2, i3, (_handleUnrecognizedCharacterEscape) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup IconCompatParcelizer(_handleOddName _handleoddname, getCreatedOnDateMs getcreatedondatems, int i, int i2, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape) {
        RemoteActionCompatParcelizer(_handleoddname, getcreatedondatems, _handleunrecognizedcharacterescape, _appendEscaped.RemoteActionCompatParcelizer(i | 1), i2);
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(_handleOddName _handleoddname, QBankPlayViewModel qBankPlayViewModel, getCreatedOnDateMs getcreatedondatems, int i, int i2, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape) {
        IconCompatParcelizer(_handleoddname, qBankPlayViewModel, (getCreatedOnDateMs<getShowPopup>) getcreatedondatems, _handleunrecognizedcharacterescape, _appendEscaped.RemoteActionCompatParcelizer(i | 1), i2);
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesCompatParcelizer(_handleOddName _handleoddname, List list, int i, int i2, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape) {
        AudioAttributesCompatParcelizer(_handleoddname, (List<readBytesAsString>) list, _handleunrecognizedcharacterescape, _appendEscaped.RemoteActionCompatParcelizer(i | 1), i2);
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup IconCompatParcelizer(long j, int i, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape) {
        read(j, _handleunrecognizedcharacterescape, _appendEscaped.RemoteActionCompatParcelizer(i | 1));
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(_handleOddName _handleoddname, int i, String str, int i2, int i3, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape) {
        AudioAttributesCompatParcelizer(_handleoddname, i, str, _handleunrecognizedcharacterescape, _appendEscaped.RemoteActionCompatParcelizer(i2 | 1), i3);
        return getShowPopup.INSTANCE;
    }
}
