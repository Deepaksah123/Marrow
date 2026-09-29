package kotlin;

import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin._handleOddName;
import kotlin._parser;
import kotlin.failOnRepeatedNames;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0014\u001au\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0015\b\u0002\u0010\u0004\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0005¢\u0006\u0002\b\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\u0011\u0010\u0010\u001a\r\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0002\b\u0006H\u0007¢\u0006\u0004\b\u0011\u0010\u0012\u001a]\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u0015\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0016\u0010\u0017\u001a \u0010\u0018\u001a\u00020\u00012\u0011\u0010\u0010\u001a\r\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0002\b\u0006H\u0003¢\u0006\u0002\u0010\u0019\u001a3\u0010\u001a\u001a\u00020\u00012\u0011\u0010\u001b\u001a\r\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0002\b\u00062\u0011\u0010\u0004\u001a\r\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0002\b\u0006H\u0003¢\u0006\u0002\u0010\u001c\u001a3\u0010\u001d\u001a\u00020\u00012\u0011\u0010\u001b\u001a\r\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0002\b\u00062\u0011\u0010\u0004\u001a\r\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0002\b\u0006H\u0003¢\u0006\u0002\u0010\u001c\"\u0010\u0010\u001e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u001f\"\u0010\u0010 \u001a\u00020\u000fX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u001f\"\u0010\u0010!\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u001f\"\u0010\u0010\"\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u001f\"\u0010\u0010#\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u001f\"\u0010\u0010$\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u001f\"\u0010\u0010%\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u001f\"\u0010\u0010&\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u001f\"\u0010\u0010'\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u001f¨\u0006("}, d2 = {"Snackbar", "", "modifier", "Landroidx/compose/ui/Modifier;", "action", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "actionOnNewLine", "", "shape", "Landroidx/compose/ui/graphics/Shape;", TtmlNode.ATTR_TTS_BACKGROUND_COLOR, "Landroidx/compose/ui/graphics/Color;", "contentColor", "elevation", "Landroidx/compose/ui/unit/Dp;", "content", "Snackbar-7zSek6w", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/ui/graphics/Shape;JJFLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "snackbarData", "Landroidx/compose/material/SnackbarData;", "actionColor", "Snackbar-sPrSdHI", "(Landroidx/compose/material/SnackbarData;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;JJJFLandroidx/compose/runtime/Composer;II)V", "TextOnlySnackbar", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "NewLineButtonSnackbar", "text", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "OneRowSnackbar", "HeightToFirstLine", "F", "HorizontalSpacing", "HorizontalSpacingButtonSide", "SeparateButtonExtraY", "SnackbarVerticalPadding", "TextEndExtraSpacing", "LongButtonVerticalOffset", "SnackbarMinHeightOneLine", "SnackbarMinHeightTwoLines", "material"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class failOnRepeatedNames {
    private static final float RemoteActionCompatParcelizer = assignParameter.IconCompatParcelizer(30.0f);
    private static final float AudioAttributesCompatParcelizer = assignParameter.IconCompatParcelizer(16.0f);
    private static final float read = assignParameter.IconCompatParcelizer(8.0f);
    private static final float write = assignParameter.IconCompatParcelizer(2.0f);
    private static final float MediaBrowserCompatCustomActionResultReceiver = assignParameter.IconCompatParcelizer(6.0f);
    private static final float AudioAttributesImplApi21Parcelizer = assignParameter.IconCompatParcelizer(8.0f);
    private static final float IconCompatParcelizer = assignParameter.IconCompatParcelizer(12.0f);
    private static final float AudioAttributesImplApi26Parcelizer = assignParameter.IconCompatParcelizer(48.0f);
    private static final float MediaBrowserCompatItemReceiver = assignParameter.IconCompatParcelizer(68.0f);

    /* JADX WARN: Removed duplicated region for block: B:137:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:142:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0100  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void RemoteActionCompatParcelizer(kotlin._handleOddName r29, kotlin.MagicModuleSubmissionRequestBody<? super kotlin._handleUnrecognizedCharacterEscape, ? super java.lang.Integer, kotlin.getShowPopup> r30, boolean r31, kotlin.findAndAddVirtualProperties r32, long r33, long r35, float r37, final kotlin.MagicModuleSubmissionRequestBody<? super kotlin._handleUnrecognizedCharacterEscape, ? super java.lang.Integer, kotlin.getShowPopup> r38, kotlin._handleUnrecognizedCharacterEscape r39, final int r40, final int r41) {
        /*
            Method dump skipped, instruction units count: 537
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.failOnRepeatedNames.RemoteActionCompatParcelizer(o._handleOddName, o.MagicModuleSubmissionRequestBody, boolean, o.findAndAddVirtualProperties, long, long, float, o.MagicModuleSubmissionRequestBody, o._handleUnrecognizedCharacterEscape, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup write(final MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody, final MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody2, final boolean z, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        if (!_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer((i & 3) != 2, i & 1)) {
            _handleunrecognizedcharacterescape.onPrepareFromSearch();
        } else {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(-1429068516, i, -1, "androidx.compose.material.Snackbar.<anonymous> (Snackbar.kt:101)");
            }
            resetAsNaN.write(AccessToken.AudioAttributesCompatParcelizer().AudioAttributesCompatParcelizer(Float.valueOf(GraphRequestParcelableResourceWithMimeType.INSTANCE.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape, 6))), multiplyFft.AudioAttributesCompatParcelizer(1236486620, true, new MagicModuleSubmissionRequestBody() { // from class: o.JsonTypeInfo
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return failOnRepeatedNames.AudioAttributesCompatParcelizer(magicModuleSubmissionRequestBody, magicModuleSubmissionRequestBody2, z, (_handleUnrecognizedCharacterEscape) obj, ((Integer) obj2).intValue());
                }
            }, _handleunrecognizedcharacterescape, 54), _handleunrecognizedcharacterescape, ContentReference.write | 48);
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesCompatParcelizer(final MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody, final MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody2, final boolean z, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        if (!_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer((i & 3) != 2, i & 1)) {
            _handleunrecognizedcharacterescape.onPrepareFromSearch();
        } else {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(1236486620, i, -1, "androidx.compose.material.Snackbar.<anonymous>.<anonymous> (Snackbar.kt:102)");
            }
            _copyCurrentStringValue.RemoteActionCompatParcelizer(enabled.INSTANCE.IconCompatParcelizer(_handleunrecognizedcharacterescape, 6).getMediaBrowserCompatItemReceiver(), multiplyFft.AudioAttributesCompatParcelizer(1789628237, true, new MagicModuleSubmissionRequestBody() { // from class: o.use
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return failOnRepeatedNames.MediaBrowserCompatCustomActionResultReceiver(magicModuleSubmissionRequestBody, magicModuleSubmissionRequestBody2, z, (_handleUnrecognizedCharacterEscape) obj, ((Integer) obj2).intValue());
                }
            }, _handleunrecognizedcharacterescape, 54), _handleunrecognizedcharacterescape, 48);
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup MediaBrowserCompatCustomActionResultReceiver(MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody, MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody2, boolean z, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        if (_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer((i & 3) != 2, i & 1)) {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(1789628237, i, -1, "androidx.compose.material.Snackbar.<anonymous>.<anonymous>.<anonymous> (Snackbar.kt:104)");
            }
            if (magicModuleSubmissionRequestBody == null) {
                _handleunrecognizedcharacterescape.IconCompatParcelizer(1845819398);
                write((MagicModuleSubmissionRequestBody<? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup>) magicModuleSubmissionRequestBody2, _handleunrecognizedcharacterescape, 0);
                _handleunrecognizedcharacterescape.MediaBrowserCompatCustomActionResultReceiver();
            } else if (z) {
                _handleunrecognizedcharacterescape.IconCompatParcelizer(1845821491);
                IconCompatParcelizer(magicModuleSubmissionRequestBody2, magicModuleSubmissionRequestBody, _handleunrecognizedcharacterescape, 0);
                _handleunrecognizedcharacterescape.MediaBrowserCompatCustomActionResultReceiver();
            } else {
                _handleunrecognizedcharacterescape.IconCompatParcelizer(1845823628);
                RemoteActionCompatParcelizer((MagicModuleSubmissionRequestBody<? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup>) magicModuleSubmissionRequestBody2, (MagicModuleSubmissionRequestBody<? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup>) magicModuleSubmissionRequestBody, _handleunrecognizedcharacterescape, 0);
                _handleunrecognizedcharacterescape.MediaBrowserCompatCustomActionResultReceiver();
            }
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        } else {
            _handleunrecognizedcharacterescape.onPrepareFromSearch();
        }
        return getShowPopup.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:145:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:150:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00ff  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void read(final kotlin.namespace r27, kotlin._handleOddName r28, boolean r29, kotlin.findAndAddVirtualProperties r30, long r31, long r33, long r35, float r37, kotlin._handleUnrecognizedCharacterEscape r38, final int r39, final int r40) {
        /*
            Method dump skipped, instruction units count: 609
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.failOnRepeatedNames.read(o.namespace, o._handleOddName, boolean, o.findAndAddVirtualProperties, long, long, long, float, o._handleUnrecognizedCharacterEscape, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup RemoteActionCompatParcelizer(long j, final namespace namespaceVar, final String str, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        if (!_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer((i & 3) != 2, i & 1)) {
            _handleunrecognizedcharacterescape.onPrepareFromSearch();
        } else {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(1843479216, i, -1, "androidx.compose.material.Snackbar.<anonymous> (Snackbar.kt:170)");
            }
            HorizontalSquareImageView horizontalSquareImageViewRemoteActionCompatParcelizer = CleverTapInstanceConfig.write.RemoteActionCompatParcelizer(0L, j, 0L, _handleunrecognizedcharacterescape, 3072, 5);
            boolean zIconCompatParcelizer = _handleunrecognizedcharacterescape.IconCompatParcelizer(namespaceVar);
            Object objOnPause = _handleunrecognizedcharacterescape.onPause();
            if (zIconCompatParcelizer || objOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause = new getCreatedOnDateMs() { // from class: o.JsonTypeId
                    @Override // kotlin.getCreatedOnDateMs
                    public final Object invoke() {
                        return failOnRepeatedNames.AudioAttributesCompatParcelizer(namespaceVar);
                    }
                };
                _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause);
            }
            CloseImageView.RemoteActionCompatParcelizer((getCreatedOnDateMs) objOnPause, null, false, null, null, null, null, horizontalSquareImageViewRemoteActionCompatParcelizer, null, multiplyFft.AudioAttributesCompatParcelizer(-929149933, true, new getModuleData() { // from class: o.nonDefaultContentNulls
                @Override // kotlin.getModuleData
                public final Object AudioAttributesCompatParcelizer(Object obj, Object obj2, Object obj3) {
                    return failOnRepeatedNames.RemoteActionCompatParcelizer(str, (getViewLifecycleOwnerLiveData) obj, (_handleUnrecognizedCharacterEscape) obj2, ((Integer) obj3).intValue());
                }
            }, _handleunrecognizedcharacterescape, 54), _handleunrecognizedcharacterescape, C.ENCODING_PCM_32BIT, 382);
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesCompatParcelizer(namespace namespaceVar) {
        namespaceVar.AudioAttributesCompatParcelizer();
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup RemoteActionCompatParcelizer(String str, getViewLifecycleOwnerLiveData getviewlifecycleownerlivedata, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        if (_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer((i & 17) != 16, i & 1)) {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(-929149933, i, -1, "androidx.compose.material.Snackbar.<anonymous>.<anonymous> (Snackbar.kt:173)");
            }
            _copyCurrentStringValue.IconCompatParcelizer(str, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, _handleunrecognizedcharacterescape, 0, 0, 131070);
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        } else {
            _handleunrecognizedcharacterescape.onPrepareFromSearch();
        }
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup RemoteActionCompatParcelizer(namespace namespaceVar, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        if (_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer((i & 3) != 2, i & 1)) {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(-261845785, i, -1, "androidx.compose.material.Snackbar.<anonymous> (Snackbar.kt:181)");
            }
            _copyCurrentStringValue.IconCompatParcelizer(namespaceVar.getAudioAttributesCompatParcelizer(), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, _handleunrecognizedcharacterescape, 0, 0, 131070);
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        } else {
            _handleunrecognizedcharacterescape.onPrepareFromSearch();
        }
        return getShowPopup.INSTANCE;
    }

    private static final void write(final MagicModuleSubmissionRequestBody<? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup> magicModuleSubmissionRequestBody, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, final int i) {
        int i2;
        _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescapeWrite = _handleunrecognizedcharacterescape.write(343813818);
        if ((i & 6) == 0) {
            i2 = (_handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(magicModuleSubmissionRequestBody) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (!_handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer((i2 & 3) != 2, i2 & 1)) {
            _handleunrecognizedcharacterescapeWrite.onPrepareFromSearch();
        } else {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(343813818, i2, -1, "androidx.compose.material.TextOnlySnackbar (Snackbar.kt:235)");
            }
            read readVarOnPause = _handleunrecognizedcharacterescapeWrite.onPause();
            if (readVarOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                readVarOnPause = read.IconCompatParcelizer;
                _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(readVarOnPause);
            }
            withTypeHandler withtypehandler = (withTypeHandler) readVarOnPause;
            _handleOddName.Companion companion = _handleOddName.INSTANCE;
            int iAudioAttributesCompatParcelizer = _getBigDecimal.AudioAttributesCompatParcelizer(_handleunrecognizedcharacterescapeWrite, 0);
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
            _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape2 = NumberOutput.read(_handleunrecognizedcharacterescapeWrite);
            NumberOutput.write(_handleunrecognizedcharacterescape2, withtypehandler, getDependencies.INSTANCE.AudioAttributesImplBaseParcelizer());
            NumberOutput.write(_handleunrecognizedcharacterescape2, _getchardescHandleMediaPlayPauseIfPendingOnHandler, getDependencies.INSTANCE.MediaBrowserCompatItemReceiver());
            MagicModuleSubmissionRequestBody<getDependencies, Integer, getShowPopup> magicModuleSubmissionRequestBodyAudioAttributesCompatParcelizer = getDependencies.INSTANCE.AudioAttributesCompatParcelizer();
            if (_handleunrecognizedcharacterescape2.getParcelableVolumeInfo() || !toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape2.onPause(), Integer.valueOf(iAudioAttributesCompatParcelizer))) {
                _handleunrecognizedcharacterescape2.RemoteActionCompatParcelizer(Integer.valueOf(iAudioAttributesCompatParcelizer));
                _handleunrecognizedcharacterescape2.read(Integer.valueOf(iAudioAttributesCompatParcelizer), magicModuleSubmissionRequestBodyAudioAttributesCompatParcelizer);
            }
            NumberOutput.write(_handleunrecognizedcharacterescape2, _handleoddnameRemoteActionCompatParcelizer, getDependencies.INSTANCE.MediaBrowserCompatCustomActionResultReceiver());
            _handleOddName _handleoddnameWrite = getParentFragment.write(_handleOddName.INSTANCE, AudioAttributesCompatParcelizer, MediaBrowserCompatCustomActionResultReceiver);
            withTypeHandler withtypehandlerWrite = AbsSavedState1.write(_skipWSOrEnd.INSTANCE.MediaBrowserCompatSearchResultReceiver(), false);
            int iAudioAttributesCompatParcelizer2 = _getBigDecimal.AudioAttributesCompatParcelizer(_handleunrecognizedcharacterescapeWrite, 0);
            _getCharDesc _getchardescHandleMediaPlayPauseIfPendingOnHandler2 = _handleunrecognizedcharacterescapeWrite.handleMediaPlayPauseIfPendingOnHandler();
            _handleOddName _handleoddnameRemoteActionCompatParcelizer2 = _verifyNLZ2.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, _handleoddnameWrite);
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
            NumberOutput.write(_handleunrecognizedcharacterescape3, withtypehandlerWrite, getDependencies.INSTANCE.AudioAttributesImplBaseParcelizer());
            NumberOutput.write(_handleunrecognizedcharacterescape3, _getchardescHandleMediaPlayPauseIfPendingOnHandler2, getDependencies.INSTANCE.MediaBrowserCompatItemReceiver());
            MagicModuleSubmissionRequestBody<getDependencies, Integer, getShowPopup> magicModuleSubmissionRequestBodyAudioAttributesCompatParcelizer2 = getDependencies.INSTANCE.AudioAttributesCompatParcelizer();
            if (_handleunrecognizedcharacterescape3.getParcelableVolumeInfo() || !toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape3.onPause(), Integer.valueOf(iAudioAttributesCompatParcelizer2))) {
                _handleunrecognizedcharacterescape3.RemoteActionCompatParcelizer(Integer.valueOf(iAudioAttributesCompatParcelizer2));
                _handleunrecognizedcharacterescape3.read(Integer.valueOf(iAudioAttributesCompatParcelizer2), magicModuleSubmissionRequestBodyAudioAttributesCompatParcelizer2);
            }
            NumberOutput.write(_handleunrecognizedcharacterescape3, _handleoddnameRemoteActionCompatParcelizer2, getDependencies.INSTANCE.MediaBrowserCompatCustomActionResultReceiver());
            setDrawerElevation setdrawerelevation = setDrawerElevation.INSTANCE;
            magicModuleSubmissionRequestBody.invoke(_handleunrecognizedcharacterescapeWrite, Integer.valueOf(i2 & 14));
            _handleunrecognizedcharacterescapeWrite.AudioAttributesImplBaseParcelizer();
            _handleunrecognizedcharacterescapeWrite.AudioAttributesImplBaseParcelizer();
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        releaseNameCopyBuffer releasenamecopybufferMediaBrowserCompatSearchResultReceiver = _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatSearchResultReceiver();
        if (releasenamecopybufferMediaBrowserCompatSearchResultReceiver != null) {
            releasenamecopybufferMediaBrowserCompatSearchResultReceiver.read(new MagicModuleSubmissionRequestBody() { // from class: o.include
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return failOnRepeatedNames.read(magicModuleSubmissionRequestBody, i, (_handleUnrecognizedCharacterEscape) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class read implements withTypeHandler {
        public static final read IconCompatParcelizer = new read();

        @Override // kotlin.withTypeHandler
        public final withHandlersFrom AudioAttributesCompatParcelizer(withContentValueHandler withcontentvaluehandler, List<? extends isTypeOrSuperTypeOf> list, long j) {
            final ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            boolean z = false;
            int iAudioAttributesCompatParcelizer = Integer.MIN_VALUE;
            int iAudioAttributesCompatParcelizer2 = Integer.MIN_VALUE;
            int iMax = 0;
            for (int i = 0; i < size; i++) {
                _parser _parserVarWrite = list.get(i).write(j);
                arrayList.add(_parserVarWrite);
                if (_parserVarWrite.AudioAttributesCompatParcelizer(wrongTokenException.RemoteActionCompatParcelizer()) != Integer.MIN_VALUE && (iAudioAttributesCompatParcelizer == Integer.MIN_VALUE || _parserVarWrite.AudioAttributesCompatParcelizer(wrongTokenException.RemoteActionCompatParcelizer()) < iAudioAttributesCompatParcelizer)) {
                    iAudioAttributesCompatParcelizer = _parserVarWrite.AudioAttributesCompatParcelizer(wrongTokenException.RemoteActionCompatParcelizer());
                }
                if (_parserVarWrite.AudioAttributesCompatParcelizer(wrongTokenException.IconCompatParcelizer()) != Integer.MIN_VALUE && (iAudioAttributesCompatParcelizer2 == Integer.MIN_VALUE || _parserVarWrite.AudioAttributesCompatParcelizer(wrongTokenException.IconCompatParcelizer()) > iAudioAttributesCompatParcelizer2)) {
                    iAudioAttributesCompatParcelizer2 = _parserVarWrite.AudioAttributesCompatParcelizer(wrongTokenException.IconCompatParcelizer());
                }
                iMax = Math.max(iMax, _parserVarWrite.getRemoteActionCompatParcelizer());
            }
            if (iAudioAttributesCompatParcelizer != Integer.MIN_VALUE && iAudioAttributesCompatParcelizer2 != Integer.MIN_VALUE) {
                z = true;
            }
            final int iMax2 = Math.max(withcontentvaluehandler.IconCompatParcelizer((iAudioAttributesCompatParcelizer == iAudioAttributesCompatParcelizer2 || !z) ? failOnRepeatedNames.AudioAttributesImplApi26Parcelizer : failOnRepeatedNames.MediaBrowserCompatItemReceiver), iMax);
            return withContentValueHandler.AudioAttributesCompatParcelizer$default(withcontentvaluehandler, PropertyValueAny.AudioAttributesImplBaseParcelizer(j), iMax2, null, new getAnswerMap() { // from class: o.prefix
                @Override // kotlin.getAnswerMap
                public final Object invoke(Object obj) {
                    return failOnRepeatedNames.read.AudioAttributesCompatParcelizer(arrayList, iMax2, (_parser.IconCompatParcelizer) obj);
                }
            }, 4, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final getShowPopup AudioAttributesCompatParcelizer(ArrayList arrayList, int i, _parser.IconCompatParcelizer iconCompatParcelizer) {
            ArrayList arrayList2 = arrayList;
            int size = arrayList2.size();
            for (int i2 = 0; i2 < size; i2++) {
                _parser _parserVar = (_parser) arrayList2.get(i2);
                _parser.IconCompatParcelizer.AudioAttributesCompatParcelizer$default(iconCompatParcelizer, _parserVar, 0, (i - _parserVar.getRemoteActionCompatParcelizer()) / 2, BitmapDescriptorFactory.HUE_RED, 4, (Object) null);
            }
            return getShowPopup.INSTANCE;
        }

        read() {
        }
    }

    private static final void IconCompatParcelizer(final MagicModuleSubmissionRequestBody<? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup> magicModuleSubmissionRequestBody, final MagicModuleSubmissionRequestBody<? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup> magicModuleSubmissionRequestBody2, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, final int i) {
        int i2;
        _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescapeWrite = _handleunrecognizedcharacterescape.write(-1534293206);
        if ((i & 6) == 0) {
            i2 = (_handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(magicModuleSubmissionRequestBody) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(magicModuleSubmissionRequestBody2) ? 32 : 16;
        }
        if (!_handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer((i2 & 19) != 18, i2 & 1)) {
            _handleunrecognizedcharacterescapeWrite.onPrepareFromSearch();
        } else {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(-1534293206, i2, -1, "androidx.compose.material.NewLineButtonSnackbar (Snackbar.kt:289)");
            }
            _handleOddName _handleoddnameRemoteActionCompatParcelizer$default = isAdded.RemoteActionCompatParcelizer$default(_handleOddName.INSTANCE, BitmapDescriptorFactory.HUE_RED, 1, null);
            float f = AudioAttributesCompatParcelizer;
            float f2 = read;
            _handleOddName _handleoddnameAudioAttributesCompatParcelizer$default = getParentFragment.AudioAttributesCompatParcelizer$default(_handleoddnameRemoteActionCompatParcelizer$default, f, BitmapDescriptorFactory.HUE_RED, f2, write, 2, null);
            withTypeHandler withtypehandler = setValue.read(WindowInsetsCompatImpl30.INSTANCE.MediaBrowserCompatCustomActionResultReceiver(), _skipWSOrEnd.INSTANCE.RatingCompat(), _handleunrecognizedcharacterescapeWrite, 0);
            int iAudioAttributesCompatParcelizer = _getBigDecimal.AudioAttributesCompatParcelizer(_handleunrecognizedcharacterescapeWrite, 0);
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
            NumberOutput.write(_handleunrecognizedcharacterescape2, withtypehandler, getDependencies.INSTANCE.AudioAttributesImplBaseParcelizer());
            NumberOutput.write(_handleunrecognizedcharacterescape2, _getchardescHandleMediaPlayPauseIfPendingOnHandler, getDependencies.INSTANCE.MediaBrowserCompatItemReceiver());
            MagicModuleSubmissionRequestBody<getDependencies, Integer, getShowPopup> magicModuleSubmissionRequestBodyAudioAttributesCompatParcelizer = getDependencies.INSTANCE.AudioAttributesCompatParcelizer();
            if (_handleunrecognizedcharacterescape2.getParcelableVolumeInfo() || !toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape2.onPause(), Integer.valueOf(iAudioAttributesCompatParcelizer))) {
                _handleunrecognizedcharacterescape2.RemoteActionCompatParcelizer(Integer.valueOf(iAudioAttributesCompatParcelizer));
                _handleunrecognizedcharacterescape2.read(Integer.valueOf(iAudioAttributesCompatParcelizer), magicModuleSubmissionRequestBodyAudioAttributesCompatParcelizer);
            }
            NumberOutput.write(_handleunrecognizedcharacterescape2, _handleoddnameRemoteActionCompatParcelizer, getDependencies.INSTANCE.MediaBrowserCompatCustomActionResultReceiver());
            DrawerLayoutSavedState drawerLayoutSavedState = DrawerLayoutSavedState.INSTANCE;
            _handleOddName _handleoddnameAudioAttributesCompatParcelizer$default2 = getParentFragment.AudioAttributesCompatParcelizer$default(WindowInsetsCompatImpl21.write(_handleOddName.INSTANCE, RemoteActionCompatParcelizer, IconCompatParcelizer), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, f2, BitmapDescriptorFactory.HUE_RED, 11, null);
            withTypeHandler withtypehandlerWrite = AbsSavedState1.write(_skipWSOrEnd.INSTANCE.MediaBrowserCompatSearchResultReceiver(), false);
            int iAudioAttributesCompatParcelizer2 = _getBigDecimal.AudioAttributesCompatParcelizer(_handleunrecognizedcharacterescapeWrite, 0);
            _getCharDesc _getchardescHandleMediaPlayPauseIfPendingOnHandler2 = _handleunrecognizedcharacterescapeWrite.handleMediaPlayPauseIfPendingOnHandler();
            _handleOddName _handleoddnameRemoteActionCompatParcelizer2 = _verifyNLZ2.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, _handleoddnameAudioAttributesCompatParcelizer$default2);
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
            NumberOutput.write(_handleunrecognizedcharacterescape3, withtypehandlerWrite, getDependencies.INSTANCE.AudioAttributesImplBaseParcelizer());
            NumberOutput.write(_handleunrecognizedcharacterescape3, _getchardescHandleMediaPlayPauseIfPendingOnHandler2, getDependencies.INSTANCE.MediaBrowserCompatItemReceiver());
            MagicModuleSubmissionRequestBody<getDependencies, Integer, getShowPopup> magicModuleSubmissionRequestBodyAudioAttributesCompatParcelizer2 = getDependencies.INSTANCE.AudioAttributesCompatParcelizer();
            if (_handleunrecognizedcharacterescape3.getParcelableVolumeInfo() || !toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape3.onPause(), Integer.valueOf(iAudioAttributesCompatParcelizer2))) {
                _handleunrecognizedcharacterescape3.RemoteActionCompatParcelizer(Integer.valueOf(iAudioAttributesCompatParcelizer2));
                _handleunrecognizedcharacterescape3.read(Integer.valueOf(iAudioAttributesCompatParcelizer2), magicModuleSubmissionRequestBodyAudioAttributesCompatParcelizer2);
            }
            NumberOutput.write(_handleunrecognizedcharacterescape3, _handleoddnameRemoteActionCompatParcelizer2, getDependencies.INSTANCE.MediaBrowserCompatCustomActionResultReceiver());
            setDrawerElevation setdrawerelevation = setDrawerElevation.INSTANCE;
            magicModuleSubmissionRequestBody.invoke(_handleunrecognizedcharacterescapeWrite, Integer.valueOf(i2 & 14));
            _handleunrecognizedcharacterescapeWrite.AudioAttributesImplBaseParcelizer();
            _handleOddName _handleoddnameAudioAttributesCompatParcelizer = drawerLayoutSavedState.AudioAttributesCompatParcelizer(_handleOddName.INSTANCE, _skipWSOrEnd.INSTANCE.AudioAttributesImplBaseParcelizer());
            withTypeHandler withtypehandlerWrite2 = AbsSavedState1.write(_skipWSOrEnd.INSTANCE.MediaBrowserCompatSearchResultReceiver(), false);
            int iAudioAttributesCompatParcelizer3 = _getBigDecimal.AudioAttributesCompatParcelizer(_handleunrecognizedcharacterescapeWrite, 0);
            _getCharDesc _getchardescHandleMediaPlayPauseIfPendingOnHandler3 = _handleunrecognizedcharacterescapeWrite.handleMediaPlayPauseIfPendingOnHandler();
            _handleOddName _handleoddnameRemoteActionCompatParcelizer3 = _verifyNLZ2.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, _handleoddnameAudioAttributesCompatParcelizer);
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
            _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape4 = NumberOutput.read(_handleunrecognizedcharacterescapeWrite);
            NumberOutput.write(_handleunrecognizedcharacterescape4, withtypehandlerWrite2, getDependencies.INSTANCE.AudioAttributesImplBaseParcelizer());
            NumberOutput.write(_handleunrecognizedcharacterescape4, _getchardescHandleMediaPlayPauseIfPendingOnHandler3, getDependencies.INSTANCE.MediaBrowserCompatItemReceiver());
            MagicModuleSubmissionRequestBody<getDependencies, Integer, getShowPopup> magicModuleSubmissionRequestBodyAudioAttributesCompatParcelizer3 = getDependencies.INSTANCE.AudioAttributesCompatParcelizer();
            if (_handleunrecognizedcharacterescape4.getParcelableVolumeInfo() || !toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape4.onPause(), Integer.valueOf(iAudioAttributesCompatParcelizer3))) {
                _handleunrecognizedcharacterescape4.RemoteActionCompatParcelizer(Integer.valueOf(iAudioAttributesCompatParcelizer3));
                _handleunrecognizedcharacterescape4.read(Integer.valueOf(iAudioAttributesCompatParcelizer3), magicModuleSubmissionRequestBodyAudioAttributesCompatParcelizer3);
            }
            NumberOutput.write(_handleunrecognizedcharacterescape4, _handleoddnameRemoteActionCompatParcelizer3, getDependencies.INSTANCE.MediaBrowserCompatCustomActionResultReceiver());
            setDrawerElevation setdrawerelevation2 = setDrawerElevation.INSTANCE;
            magicModuleSubmissionRequestBody2.invoke(_handleunrecognizedcharacterescapeWrite, Integer.valueOf((i2 >> 3) & 14));
            _handleunrecognizedcharacterescapeWrite.AudioAttributesImplBaseParcelizer();
            _handleunrecognizedcharacterescapeWrite.AudioAttributesImplBaseParcelizer();
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        releaseNameCopyBuffer releasenamecopybufferMediaBrowserCompatSearchResultReceiver = _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatSearchResultReceiver();
        if (releasenamecopybufferMediaBrowserCompatSearchResultReceiver != null) {
            releasenamecopybufferMediaBrowserCompatSearchResultReceiver.read(new MagicModuleSubmissionRequestBody() { // from class: o.defaultImpl
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return failOnRepeatedNames.read(magicModuleSubmissionRequestBody, magicModuleSubmissionRequestBody2, i, (_handleUnrecognizedCharacterEscape) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void RemoteActionCompatParcelizer(final MagicModuleSubmissionRequestBody<? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup> magicModuleSubmissionRequestBody, final MagicModuleSubmissionRequestBody<? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup> magicModuleSubmissionRequestBody2, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, final int i) {
        int i2;
        _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescapeWrite = _handleunrecognizedcharacterescape.write(1302703572);
        if ((i & 6) == 0) {
            i2 = (_handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(magicModuleSubmissionRequestBody) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(magicModuleSubmissionRequestBody2) ? 32 : 16;
        }
        if (!_handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer((i2 & 19) != 18, i2 & 1)) {
            _handleunrecognizedcharacterescapeWrite.onPrepareFromSearch();
        } else {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(1302703572, i2, -1, "androidx.compose.material.OneRowSnackbar (Snackbar.kt:310)");
            }
            _handleOddName _handleoddnameAudioAttributesCompatParcelizer$default = getParentFragment.AudioAttributesCompatParcelizer$default(_handleOddName.INSTANCE, AudioAttributesCompatParcelizer, BitmapDescriptorFactory.HUE_RED, read, BitmapDescriptorFactory.HUE_RED, 10, null);
            AudioAttributesCompatParcelizer audioAttributesCompatParcelizerOnPause = _handleunrecognizedcharacterescapeWrite.onPause();
            if (audioAttributesCompatParcelizerOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                audioAttributesCompatParcelizerOnPause = new AudioAttributesCompatParcelizer("action", "text");
                _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(audioAttributesCompatParcelizerOnPause);
            }
            withTypeHandler withtypehandler = (withTypeHandler) audioAttributesCompatParcelizerOnPause;
            int iAudioAttributesCompatParcelizer = _getBigDecimal.AudioAttributesCompatParcelizer(_handleunrecognizedcharacterescapeWrite, 0);
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
            NumberOutput.write(_handleunrecognizedcharacterescape2, withtypehandler, getDependencies.INSTANCE.AudioAttributesImplBaseParcelizer());
            NumberOutput.write(_handleunrecognizedcharacterescape2, _getchardescHandleMediaPlayPauseIfPendingOnHandler, getDependencies.INSTANCE.MediaBrowserCompatItemReceiver());
            MagicModuleSubmissionRequestBody<getDependencies, Integer, getShowPopup> magicModuleSubmissionRequestBodyAudioAttributesCompatParcelizer = getDependencies.INSTANCE.AudioAttributesCompatParcelizer();
            if (_handleunrecognizedcharacterescape2.getParcelableVolumeInfo() || !toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape2.onPause(), Integer.valueOf(iAudioAttributesCompatParcelizer))) {
                _handleunrecognizedcharacterescape2.RemoteActionCompatParcelizer(Integer.valueOf(iAudioAttributesCompatParcelizer));
                _handleunrecognizedcharacterescape2.read(Integer.valueOf(iAudioAttributesCompatParcelizer), magicModuleSubmissionRequestBodyAudioAttributesCompatParcelizer);
            }
            NumberOutput.write(_handleunrecognizedcharacterescape2, _handleoddnameRemoteActionCompatParcelizer, getDependencies.INSTANCE.MediaBrowserCompatCustomActionResultReceiver());
            _handleOddName _handleoddnameWrite$default = getParentFragment.write$default(isEnumType.IconCompatParcelizer(_handleOddName.INSTANCE, "text"), BitmapDescriptorFactory.HUE_RED, MediaBrowserCompatCustomActionResultReceiver, 1, null);
            withTypeHandler withtypehandlerWrite = AbsSavedState1.write(_skipWSOrEnd.INSTANCE.MediaBrowserCompatSearchResultReceiver(), false);
            int iAudioAttributesCompatParcelizer2 = _getBigDecimal.AudioAttributesCompatParcelizer(_handleunrecognizedcharacterescapeWrite, 0);
            _getCharDesc _getchardescHandleMediaPlayPauseIfPendingOnHandler2 = _handleunrecognizedcharacterescapeWrite.handleMediaPlayPauseIfPendingOnHandler();
            _handleOddName _handleoddnameRemoteActionCompatParcelizer2 = _verifyNLZ2.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, _handleoddnameWrite$default);
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
            NumberOutput.write(_handleunrecognizedcharacterescape3, withtypehandlerWrite, getDependencies.INSTANCE.AudioAttributesImplBaseParcelizer());
            NumberOutput.write(_handleunrecognizedcharacterescape3, _getchardescHandleMediaPlayPauseIfPendingOnHandler2, getDependencies.INSTANCE.MediaBrowserCompatItemReceiver());
            MagicModuleSubmissionRequestBody<getDependencies, Integer, getShowPopup> magicModuleSubmissionRequestBodyAudioAttributesCompatParcelizer2 = getDependencies.INSTANCE.AudioAttributesCompatParcelizer();
            if (_handleunrecognizedcharacterescape3.getParcelableVolumeInfo() || !toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape3.onPause(), Integer.valueOf(iAudioAttributesCompatParcelizer2))) {
                _handleunrecognizedcharacterescape3.RemoteActionCompatParcelizer(Integer.valueOf(iAudioAttributesCompatParcelizer2));
                _handleunrecognizedcharacterescape3.read(Integer.valueOf(iAudioAttributesCompatParcelizer2), magicModuleSubmissionRequestBodyAudioAttributesCompatParcelizer2);
            }
            NumberOutput.write(_handleunrecognizedcharacterescape3, _handleoddnameRemoteActionCompatParcelizer2, getDependencies.INSTANCE.MediaBrowserCompatCustomActionResultReceiver());
            setDrawerElevation setdrawerelevation = setDrawerElevation.INSTANCE;
            magicModuleSubmissionRequestBody.invoke(_handleunrecognizedcharacterescapeWrite, Integer.valueOf(i2 & 14));
            _handleunrecognizedcharacterescapeWrite.AudioAttributesImplBaseParcelizer();
            _handleOddName _handleoddnameIconCompatParcelizer = isEnumType.IconCompatParcelizer(_handleOddName.INSTANCE, "action");
            withTypeHandler withtypehandlerWrite2 = AbsSavedState1.write(_skipWSOrEnd.INSTANCE.MediaBrowserCompatSearchResultReceiver(), false);
            int iAudioAttributesCompatParcelizer3 = _getBigDecimal.AudioAttributesCompatParcelizer(_handleunrecognizedcharacterescapeWrite, 0);
            _getCharDesc _getchardescHandleMediaPlayPauseIfPendingOnHandler3 = _handleunrecognizedcharacterescapeWrite.handleMediaPlayPauseIfPendingOnHandler();
            _handleOddName _handleoddnameRemoteActionCompatParcelizer3 = _verifyNLZ2.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, _handleoddnameIconCompatParcelizer);
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
            _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape4 = NumberOutput.read(_handleunrecognizedcharacterescapeWrite);
            NumberOutput.write(_handleunrecognizedcharacterescape4, withtypehandlerWrite2, getDependencies.INSTANCE.AudioAttributesImplBaseParcelizer());
            NumberOutput.write(_handleunrecognizedcharacterescape4, _getchardescHandleMediaPlayPauseIfPendingOnHandler3, getDependencies.INSTANCE.MediaBrowserCompatItemReceiver());
            MagicModuleSubmissionRequestBody<getDependencies, Integer, getShowPopup> magicModuleSubmissionRequestBodyAudioAttributesCompatParcelizer3 = getDependencies.INSTANCE.AudioAttributesCompatParcelizer();
            if (_handleunrecognizedcharacterescape4.getParcelableVolumeInfo() || !toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape4.onPause(), Integer.valueOf(iAudioAttributesCompatParcelizer3))) {
                _handleunrecognizedcharacterescape4.RemoteActionCompatParcelizer(Integer.valueOf(iAudioAttributesCompatParcelizer3));
                _handleunrecognizedcharacterescape4.read(Integer.valueOf(iAudioAttributesCompatParcelizer3), magicModuleSubmissionRequestBodyAudioAttributesCompatParcelizer3);
            }
            NumberOutput.write(_handleunrecognizedcharacterescape4, _handleoddnameRemoteActionCompatParcelizer3, getDependencies.INSTANCE.MediaBrowserCompatCustomActionResultReceiver());
            setDrawerElevation setdrawerelevation2 = setDrawerElevation.INSTANCE;
            magicModuleSubmissionRequestBody2.invoke(_handleunrecognizedcharacterescapeWrite, Integer.valueOf((i2 >> 3) & 14));
            _handleunrecognizedcharacterescapeWrite.AudioAttributesImplBaseParcelizer();
            _handleunrecognizedcharacterescapeWrite.AudioAttributesImplBaseParcelizer();
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        releaseNameCopyBuffer releasenamecopybufferMediaBrowserCompatSearchResultReceiver = _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatSearchResultReceiver();
        if (releasenamecopybufferMediaBrowserCompatSearchResultReceiver != null) {
            releasenamecopybufferMediaBrowserCompatSearchResultReceiver.read(new MagicModuleSubmissionRequestBody() { // from class: o.JsonTypeInfoId
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return failOnRepeatedNames.IconCompatParcelizer(magicModuleSubmissionRequestBody, magicModuleSubmissionRequestBody2, i, (_handleUnrecognizedCharacterEscape) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AudioAttributesCompatParcelizer implements withTypeHandler {
        final /* synthetic */ String AudioAttributesCompatParcelizer;
        final /* synthetic */ String write;

        @Override // kotlin.withTypeHandler
        public final withHandlersFrom AudioAttributesCompatParcelizer(withContentValueHandler withcontentvaluehandler, List<? extends isTypeOrSuperTypeOf> list, long j) {
            int iMax;
            final int i;
            final int remoteActionCompatParcelizer;
            String str = this.AudioAttributesCompatParcelizer;
            List<? extends isTypeOrSuperTypeOf> list2 = list;
            int size = list2.size();
            for (int i2 = 0; i2 < size; i2++) {
                isTypeOrSuperTypeOf istypeorsupertypeof = list.get(i2);
                if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(isEnumType.IconCompatParcelizer(istypeorsupertypeof), (Object) str)) {
                    final _parser _parserVarWrite = istypeorsupertypeof.write(j);
                    int iWrite = getQues.write((PropertyValueAny.AudioAttributesImplBaseParcelizer(j) - _parserVarWrite.getRead()) - withcontentvaluehandler.IconCompatParcelizer(failOnRepeatedNames.AudioAttributesImplApi21Parcelizer), PropertyValueAny.MediaBrowserCompatItemReceiver(j));
                    String str2 = this.write;
                    int size2 = list2.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        isTypeOrSuperTypeOf istypeorsupertypeof2 = list.get(i3);
                        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(isEnumType.IconCompatParcelizer(istypeorsupertypeof2), (Object) str2)) {
                            final _parser _parserVarWrite2 = istypeorsupertypeof2.write(PropertyValueAny.AudioAttributesCompatParcelizer$default(j, 0, iWrite, 0, 0, 9, null));
                            int iAudioAttributesCompatParcelizer = _parserVarWrite2.AudioAttributesCompatParcelizer(wrongTokenException.RemoteActionCompatParcelizer());
                            int iAudioAttributesCompatParcelizer2 = _parserVarWrite2.AudioAttributesCompatParcelizer(wrongTokenException.IconCompatParcelizer());
                            boolean z = true;
                            boolean z2 = (iAudioAttributesCompatParcelizer == Integer.MIN_VALUE || iAudioAttributesCompatParcelizer2 == Integer.MIN_VALUE) ? false : true;
                            if (iAudioAttributesCompatParcelizer != iAudioAttributesCompatParcelizer2 && z2) {
                                z = false;
                            }
                            int iAudioAttributesImplBaseParcelizer = PropertyValueAny.AudioAttributesImplBaseParcelizer(j);
                            int read = _parserVarWrite.getRead();
                            if (!z) {
                                int iIconCompatParcelizer = withcontentvaluehandler.IconCompatParcelizer(failOnRepeatedNames.RemoteActionCompatParcelizer) - iAudioAttributesCompatParcelizer;
                                int iMax2 = Math.max(withcontentvaluehandler.IconCompatParcelizer(failOnRepeatedNames.MediaBrowserCompatItemReceiver), _parserVarWrite2.getRemoteActionCompatParcelizer() + iIconCompatParcelizer);
                                iMax = iMax2;
                                i = iIconCompatParcelizer;
                                remoteActionCompatParcelizer = (iMax2 - _parserVarWrite.getRemoteActionCompatParcelizer()) / 2;
                            } else {
                                iMax = Math.max(withcontentvaluehandler.IconCompatParcelizer(failOnRepeatedNames.AudioAttributesImplApi26Parcelizer), _parserVarWrite.getRemoteActionCompatParcelizer());
                                int remoteActionCompatParcelizer2 = (iMax - _parserVarWrite2.getRemoteActionCompatParcelizer()) / 2;
                                int iAudioAttributesCompatParcelizer3 = _parserVarWrite.AudioAttributesCompatParcelizer(wrongTokenException.RemoteActionCompatParcelizer());
                                remoteActionCompatParcelizer = iAudioAttributesCompatParcelizer3 != Integer.MIN_VALUE ? (iAudioAttributesCompatParcelizer + remoteActionCompatParcelizer2) - iAudioAttributesCompatParcelizer3 : 0;
                                i = remoteActionCompatParcelizer2;
                            }
                            final int i4 = iAudioAttributesImplBaseParcelizer - read;
                            return withContentValueHandler.AudioAttributesCompatParcelizer$default(withcontentvaluehandler, PropertyValueAny.AudioAttributesImplBaseParcelizer(j), iMax, null, new getAnswerMap() { // from class: o.JsonUnwrapped
                                @Override // kotlin.getAnswerMap
                                public final Object invoke(Object obj) {
                                    return failOnRepeatedNames.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(_parserVarWrite2, i, _parserVarWrite, i4, remoteActionCompatParcelizer, (_parser.IconCompatParcelizer) obj);
                                }
                            }, 4, null);
                        }
                    }
                    ArrayBlockingQueueDeserializer.RemoteActionCompatParcelizer("Collection contains no element matching the predicate.");
                    throw new PlanDetailsCreator();
                }
            }
            ArrayBlockingQueueDeserializer.RemoteActionCompatParcelizer("Collection contains no element matching the predicate.");
            throw new PlanDetailsCreator();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final getShowPopup AudioAttributesCompatParcelizer(_parser _parserVar, int i, _parser _parserVar2, int i2, int i3, _parser.IconCompatParcelizer iconCompatParcelizer) {
            _parser.IconCompatParcelizer.AudioAttributesCompatParcelizer$default(iconCompatParcelizer, _parserVar, 0, i, BitmapDescriptorFactory.HUE_RED, 4, (Object) null);
            _parser.IconCompatParcelizer.AudioAttributesCompatParcelizer$default(iconCompatParcelizer, _parserVar2, i2, i3, BitmapDescriptorFactory.HUE_RED, 4, (Object) null);
            return getShowPopup.INSTANCE;
        }

        AudioAttributesCompatParcelizer(String str, String str2) {
            this.AudioAttributesCompatParcelizer = str;
            this.write = str2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody, MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody2, int i, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i2) {
        IconCompatParcelizer(magicModuleSubmissionRequestBody, magicModuleSubmissionRequestBody2, _handleunrecognizedcharacterescape, _appendEscaped.RemoteActionCompatParcelizer(i | 1));
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup IconCompatParcelizer(MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody, MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody2, int i, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i2) {
        RemoteActionCompatParcelizer((MagicModuleSubmissionRequestBody<? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup>) magicModuleSubmissionRequestBody, (MagicModuleSubmissionRequestBody<? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup>) magicModuleSubmissionRequestBody2, _handleunrecognizedcharacterescape, _appendEscaped.RemoteActionCompatParcelizer(i | 1));
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup RemoteActionCompatParcelizer(_handleOddName _handleoddname, MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody, boolean z, findAndAddVirtualProperties findandaddvirtualproperties, long j, long j2, float f, MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody2, int i, int i2, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i3) {
        RemoteActionCompatParcelizer(_handleoddname, magicModuleSubmissionRequestBody, z, findandaddvirtualproperties, j, j2, f, magicModuleSubmissionRequestBody2, _handleunrecognizedcharacterescape, _appendEscaped.RemoteActionCompatParcelizer(i | 1), i2);
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesCompatParcelizer(namespace namespaceVar, _handleOddName _handleoddname, boolean z, findAndAddVirtualProperties findandaddvirtualproperties, long j, long j2, long j3, float f, int i, int i2, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i3) {
        read(namespaceVar, _handleoddname, z, findandaddvirtualproperties, j, j2, j3, f, _handleunrecognizedcharacterescape, _appendEscaped.RemoteActionCompatParcelizer(i | 1), i2);
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody, int i, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i2) {
        write((MagicModuleSubmissionRequestBody<? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup>) magicModuleSubmissionRequestBody, _handleunrecognizedcharacterescape, _appendEscaped.RemoteActionCompatParcelizer(i | 1));
        return getShowPopup.INSTANCE;
    }
}
