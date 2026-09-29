package androidx.compose.ui.tooling;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.compose.ui.tooling.PreviewActivity;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import kotlin.AbsSavedState1;
import kotlin.JsonIncludeInclude;
import kotlin.MagicModuleSubmissionRequestBody;
import kotlin.MediaBrowserCompatMediaItem;
import kotlin.Metadata;
import kotlin.NumberOutput;
import kotlin.ParcelableVolumeInfo;
import kotlin.TestGroupLSModel;
import kotlin._appendByte;
import kotlin._closeInput;
import kotlin._deserializeMissingToken;
import kotlin._getBigDecimal;
import kotlin._getCharDesc;
import kotlin._handleOddName;
import kotlin._handleUnrecognizedCharacterEscape;
import kotlin._skipWSOrEnd;
import kotlin._validJsonValueList;
import kotlin._verifyNLZ2;
import kotlin.getCreatedOnDateMs;
import kotlin.getDependencies;
import kotlin.getModuleData;
import kotlin.getParentFragment;
import kotlin.getReturnTransition;
import kotlin.getShowPopup;
import kotlin.hasMoreBytes;
import kotlin.injection;
import kotlin.multiplyFft;
import kotlin.onAttachedToWindow;
import kotlin.propertyDef;
import kotlin.setDrawerElevation;
import kotlin.withTypeHandler;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\t8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011"}, d2 = {"Landroidx/compose/ui/tooling/PreviewActivity;", "Lo/MediaBrowserCompatMediaItem;", "<init>", "()V", "Landroid/os/Bundle;", "p0", "", "onCreate", "(Landroid/os/Bundle;)V", "", "RemoteActionCompatParcelizer", "(Ljava/lang/String;)V", "p1", "p2", "AudioAttributesCompatParcelizer", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "read", "Ljava/lang/String;", "write"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PreviewActivity extends MediaBrowserCompatMediaItem {

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final String write = "PreviewActivity";

    @Override // kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public final void onCreate(Bundle p0) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        String stringExtra;
        super.onCreate(p0);
        if ((getApplicationInfo().flags & 2) == 0) {
            finish();
            return;
        }
        Intent intent = getIntent();
        if (intent == null || (stringExtra = intent.getStringExtra("composable")) == null) {
            return;
        }
        RemoteActionCompatParcelizer(stringExtra);
    }

    private final void RemoteActionCompatParcelizer(String p0) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        final String str = TestGroupLSModel.read(p0, '.', p0);
        final String strAudioAttributesCompatParcelizer = TestGroupLSModel.AudioAttributesCompatParcelizer(p0, '.', p0);
        String stringExtra = getIntent().getStringExtra("parameterProviderClassName");
        if (stringExtra == null) {
            ParcelableVolumeInfo.write(this, null, multiplyFft.IconCompatParcelizer(-840626948, true, new MagicModuleSubmissionRequestBody() { // from class: o.ErrorThrowingDeserializer
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return PreviewActivity.RemoteActionCompatParcelizer(str, strAudioAttributesCompatParcelizer, (_handleUnrecognizedCharacterEscape) obj, ((Integer) obj2).intValue());
                }
            }));
        } else {
            AudioAttributesCompatParcelizer(str, strAudioAttributesCompatParcelizer, stringExtra);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup RemoteActionCompatParcelizer(String str, String str2, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) throws Exception {
        if (_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer((i & 3) != 2, i & 1)) {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(-840626948, i, -1, "androidx.compose.ui.tooling.PreviewActivity.setComposableContent.<anonymous> (PreviewActivity.android.kt:74)");
            }
            injection.INSTANCE.read(str, str2, _handleunrecognizedcharacterescape, new Object[0]);
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        } else {
            _handleunrecognizedcharacterescape.onPrepareFromSearch();
        }
        return getShowPopup.INSTANCE;
    }

    private final void AudioAttributesCompatParcelizer(final String p0, final String p1, String p2) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        final Object[] objArrWrite = _deserializeMissingToken.write(_deserializeMissingToken.read(p2), getIntent().getIntExtra("parameterProviderIndex", -1));
        if (objArrWrite.length > 1) {
            ParcelableVolumeInfo.write(this, null, multiplyFft.IconCompatParcelizer(-861939235, true, new MagicModuleSubmissionRequestBody() { // from class: o.setDefaultCreator
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return PreviewActivity.RemoteActionCompatParcelizer(objArrWrite, p0, p1, (_handleUnrecognizedCharacterEscape) obj, ((Integer) obj2).intValue());
                }
            }));
        } else {
            ParcelableVolumeInfo.write(this, null, multiplyFft.IconCompatParcelizer(-1901447514, true, new MagicModuleSubmissionRequestBody() { // from class: o._deserializeAndSet
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return PreviewActivity.AudioAttributesCompatParcelizer(p0, p1, objArrWrite, (_handleUnrecognizedCharacterEscape) obj, ((Integer) obj2).intValue());
                }
            }));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(String str, String str2, Object[] objArr, hasMoreBytes hasmorebytes, getReturnTransition getreturntransition, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) throws Exception {
        if ((i & 6) == 0) {
            i |= _handleunrecognizedcharacterescape.AudioAttributesCompatParcelizer(getreturntransition) ? 4 : 2;
        }
        if (!_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer((i & 19) != 18, i & 1)) {
            _handleunrecognizedcharacterescape.onPrepareFromSearch();
        } else {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(57310875, i, -1, "androidx.compose.ui.tooling.PreviewActivity.setParameterizedContent.<anonymous>.<anonymous> (PreviewActivity.android.kt:107)");
            }
            _handleOddName _handleoddname = getParentFragment.read(_handleOddName.INSTANCE, getreturntransition);
            withTypeHandler withtypehandlerWrite = AbsSavedState1.write(_skipWSOrEnd.INSTANCE.MediaBrowserCompatSearchResultReceiver(), false);
            int iHashCode = Long.hashCode(_getBigDecimal.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape, 0));
            _getCharDesc _getchardescHandleMediaPlayPauseIfPendingOnHandler = _handleunrecognizedcharacterescape.handleMediaPlayPauseIfPendingOnHandler();
            _handleOddName _handleoddnameRemoteActionCompatParcelizer = _verifyNLZ2.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape, _handleoddname);
            getCreatedOnDateMs<getDependencies> getcreatedondatemsIconCompatParcelizer = getDependencies.INSTANCE.IconCompatParcelizer();
            if (!(_handleunrecognizedcharacterescape.MediaMetadataCompat() instanceof _closeInput)) {
                _getBigDecimal.write();
            }
            _handleunrecognizedcharacterescape.onPrepareFromMediaId();
            if (_handleunrecognizedcharacterescape.getParcelableVolumeInfo()) {
                _handleunrecognizedcharacterescape.read(getcreatedondatemsIconCompatParcelizer);
            } else {
                _handleunrecognizedcharacterescape.onPlayFromUri();
            }
            _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape2 = NumberOutput.read(_handleunrecognizedcharacterescape);
            NumberOutput.write(_handleunrecognizedcharacterescape2, withtypehandlerWrite, getDependencies.INSTANCE.AudioAttributesImplBaseParcelizer());
            NumberOutput.write(_handleunrecognizedcharacterescape2, _getchardescHandleMediaPlayPauseIfPendingOnHandler, getDependencies.INSTANCE.MediaBrowserCompatItemReceiver());
            NumberOutput.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape2, Integer.valueOf(iHashCode), getDependencies.INSTANCE.AudioAttributesCompatParcelizer());
            NumberOutput.write(_handleunrecognizedcharacterescape2, getDependencies.INSTANCE.write());
            NumberOutput.write(_handleunrecognizedcharacterescape2, _handleoddnameRemoteActionCompatParcelizer, getDependencies.INSTANCE.MediaBrowserCompatCustomActionResultReceiver());
            setDrawerElevation setdrawerelevation = setDrawerElevation.INSTANCE;
            injection.INSTANCE.read(str, str2, _handleunrecognizedcharacterescape, objArr[hasmorebytes.IconCompatParcelizer()]);
            _handleunrecognizedcharacterescape.AudioAttributesImplBaseParcelizer();
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup RemoteActionCompatParcelizer(final Object[] objArr, final hasMoreBytes hasmorebytes, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        if (!_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer((i & 3) != 2, i & 1)) {
            _handleunrecognizedcharacterescape.onPrepareFromSearch();
        } else {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(958604965, i, -1, "androidx.compose.ui.tooling.PreviewActivity.setParameterizedContent.<anonymous>.<anonymous> (PreviewActivity.android.kt:117)");
            }
            MagicModuleSubmissionRequestBody<_handleUnrecognizedCharacterEscape, Integer, getShowPopup> magicModuleSubmissionRequestBody = propertyDef.read.read();
            boolean zIconCompatParcelizer = _handleunrecognizedcharacterescape.IconCompatParcelizer(objArr);
            Object objOnPause = _handleunrecognizedcharacterescape.onPause();
            if (zIconCompatParcelizer || objOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause = new getCreatedOnDateMs() { // from class: o.ExternalTypeHandler
                    @Override // kotlin.getCreatedOnDateMs
                    public final Object invoke() {
                        return PreviewActivity.read(hasmorebytes, objArr);
                    }
                };
                _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause);
            }
            onAttachedToWindow.IconCompatParcelizer(magicModuleSubmissionRequestBody, (getCreatedOnDateMs) objOnPause, null, null, null, null, 0L, 0L, null, _handleunrecognizedcharacterescape, 6, TarConstants.XSTAR_MAGIC_OFFSET);
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(hasMoreBytes hasmorebytes, Object[] objArr) {
        hasmorebytes.read((hasmorebytes.IconCompatParcelizer() + 1) % objArr.length);
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesCompatParcelizer(String str, String str2, Object[] objArr, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) throws Exception {
        if (!_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer((i & 3) != 2, i & 1)) {
            _handleunrecognizedcharacterescape.onPrepareFromSearch();
        } else {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(-1901447514, i, -1, "androidx.compose.ui.tooling.PreviewActivity.setParameterizedContent.<anonymous> (PreviewActivity.android.kt:128)");
            }
            injection.INSTANCE.read(str, str2, _handleunrecognizedcharacterescape, Arrays.copyOf(objArr, objArr.length));
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup RemoteActionCompatParcelizer(final Object[] objArr, final String str, final String str2, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        if (!_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer((i & 3) != 2, i & 1)) {
            _handleunrecognizedcharacterescape.onPrepareFromSearch();
        } else {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(-861939235, i, -1, "androidx.compose.ui.tooling.PreviewActivity.setParameterizedContent.<anonymous> (PreviewActivity.android.kt:103)");
            }
            Object objOnPause = _handleunrecognizedcharacterescape.onPause();
            if (objOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause = _appendByte.RemoteActionCompatParcelizer(0);
                _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause);
            }
            final hasMoreBytes hasmorebytes = (hasMoreBytes) objOnPause;
            JsonIncludeInclude.IconCompatParcelizer(null, null, null, null, null, multiplyFft.AudioAttributesCompatParcelizer(958604965, true, new MagicModuleSubmissionRequestBody() { // from class: o._handleTypePropertyValue
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return PreviewActivity.RemoteActionCompatParcelizer(objArr, hasmorebytes, (_handleUnrecognizedCharacterEscape) obj, ((Integer) obj2).intValue());
                }
            }, _handleunrecognizedcharacterescape, 54), 0, false, null, false, null, BitmapDescriptorFactory.HUE_RED, 0L, 0L, 0L, 0L, 0L, multiplyFft.AudioAttributesCompatParcelizer(57310875, true, new getModuleData() { // from class: o.verifyNonDup
                @Override // kotlin.getModuleData
                public final Object AudioAttributesCompatParcelizer(Object obj, Object obj2, Object obj3) {
                    return PreviewActivity.read(str, str2, objArr, hasmorebytes, (getReturnTransition) obj, (_handleUnrecognizedCharacterEscape) obj2, ((Integer) obj3).intValue());
                }
            }, _handleunrecognizedcharacterescape, 54), _handleunrecognizedcharacterescape, 196608, 12582912, 131039);
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        return getShowPopup.INSTANCE;
    }

    @Override // kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public final void onStart() {
        super.onStart();
    }

    @Override // kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public final void onResume() {
        super.onResume();
    }

    @Override // kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public final void onPause() {
        super.onPause();
    }

    @Override // kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }
}
