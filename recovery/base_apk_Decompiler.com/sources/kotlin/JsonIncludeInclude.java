package kotlin;

import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.RendererCapabilities;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.List;
import kotlin.Metadata;
import kotlin._parser;
import org.apache.commons.compress.archivers.cpio.CpioConstants;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a!\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0006\u001a¤\u0002\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u00012\u0013\b\u0002\u0010\u000e\u001a\r\u0012\u0004\u0012\u00020\b0\u000f¢\u0006\u0002\b\u00102\u0013\b\u0002\u0010\u0011\u001a\r\u0012\u0004\u0012\u00020\b0\u000f¢\u0006\u0002\b\u00102\u0019\b\u0002\u0010\u0012\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u0013¢\u0006\u0002\b\u00102\u0013\b\u0002\u0010\u0014\u001a\r\u0012\u0004\u0012\u00020\b0\u000f¢\u0006\u0002\b\u00102\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u00182 \b\u0002\u0010\u0019\u001a\u001a\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\b\u0018\u00010\u0013¢\u0006\u0002\b\u0010¢\u0006\u0002\b\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u00182\b\b\u0002\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020\"2\b\b\u0002\u0010$\u001a\u00020\"2\b\b\u0002\u0010%\u001a\u00020\"2\b\b\u0002\u0010&\u001a\u00020\"2\u0017\u0010'\u001a\u0013\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\b0\u0013¢\u0006\u0002\b\u0010H\u0007¢\u0006\u0004\b)\u0010*\u001a\u009c\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u00012\u0013\b\u0002\u0010\u000e\u001a\r\u0012\u0004\u0012\u00020\b0\u000f¢\u0006\u0002\b\u00102\u0013\b\u0002\u0010\u0011\u001a\r\u0012\u0004\u0012\u00020\b0\u000f¢\u0006\u0002\b\u00102\u0019\b\u0002\u0010\u0012\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u0013¢\u0006\u0002\b\u00102\u0013\b\u0002\u0010\u0014\u001a\r\u0012\u0004\u0012\u00020\b0\u000f¢\u0006\u0002\b\u00102\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u00182 \b\u0002\u0010\u0019\u001a\u001a\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\b\u0018\u00010\u0013¢\u0006\u0002\b\u0010¢\u0006\u0002\b\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u00182\b\b\u0002\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020\"2\b\b\u0002\u0010$\u001a\u00020\"2\b\b\u0002\u0010%\u001a\u00020\"2\b\b\u0002\u0010&\u001a\u00020\"2\u0017\u0010'\u001a\u0013\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\b0\u0013¢\u0006\u0002\b\u0010H\u0007¢\u0006\u0004\b+\u0010,\u001a¥\u0001\u0010-\u001a\u00020\b2\u0006\u0010.\u001a\u00020\u00182\u0006\u0010/\u001a\u00020\u00162\u0016\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\b0\u000f¢\u0006\u0002\b\u0010¢\u0006\u0002\b02\u001c\u0010'\u001a\u0018\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\b0\u0013¢\u0006\u0002\b\u0010¢\u0006\u0002\b02\u0016\u00101\u001a\u0012\u0012\u0004\u0012\u00020\b0\u000f¢\u0006\u0002\b\u0010¢\u0006\u0002\b02\u0016\u00102\u001a\u0012\u0012\u0004\u0012\u00020\b0\u000f¢\u0006\u0002\b\u0010¢\u0006\u0002\b02\u0006\u0010\t\u001a\u00020\n2\u0016\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\b0\u000f¢\u0006\u0002\b\u0010¢\u0006\u0002\b0H\u0003¢\u0006\u0004\b3\u00104\"\u001c\u00105\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010706X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b8\u00109\"\u0010\u0010:\u001a\u00020 X\u0082\u0004¢\u0006\u0004\n\u0002\u0010;¨\u0006<"}, d2 = {"rememberScaffoldState", "Landroidx/compose/material/ScaffoldState;", "drawerState", "Landroidx/compose/material/DrawerState;", "snackbarHostState", "Landroidx/compose/material/SnackbarHostState;", "(Landroidx/compose/material/DrawerState;Landroidx/compose/material/SnackbarHostState;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material/ScaffoldState;", "Scaffold", "", "contentWindowInsets", "Landroidx/compose/foundation/layout/WindowInsets;", "modifier", "Landroidx/compose/ui/Modifier;", "scaffoldState", "topBar", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "bottomBar", "snackbarHost", "Lkotlin/Function1;", "floatingActionButton", "floatingActionButtonPosition", "Landroidx/compose/material/FabPosition;", "isFloatingActionButtonDocked", "", "drawerContent", "Landroidx/compose/foundation/layout/ColumnScope;", "Lkotlin/ExtensionFunctionType;", "drawerGesturesEnabled", "drawerShape", "Landroidx/compose/ui/graphics/Shape;", "drawerElevation", "Landroidx/compose/ui/unit/Dp;", "drawerBackgroundColor", "Landroidx/compose/ui/graphics/Color;", "drawerContentColor", "drawerScrimColor", TtmlNode.ATTR_TTS_BACKGROUND_COLOR, "contentColor", "content", "Landroidx/compose/foundation/layout/PaddingValues;", "Scaffold-u4IkXBM", "(Landroidx/compose/foundation/layout/WindowInsets;Landroidx/compose/ui/Modifier;Landroidx/compose/material/ScaffoldState;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;IZLkotlin/jvm/functions/Function3;ZLandroidx/compose/ui/graphics/Shape;FJJJJJLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "Scaffold-27mzLpw", "(Landroidx/compose/ui/Modifier;Landroidx/compose/material/ScaffoldState;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;IZLkotlin/jvm/functions/Function3;ZLandroidx/compose/ui/graphics/Shape;FJJJJJLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "ScaffoldLayout", "isFabDocked", "fabPosition", "Landroidx/compose/ui/UiComposable;", "snackbar", "fab", "ScaffoldLayout-i1QSOvI", "(ZILkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/foundation/layout/WindowInsets;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "LocalFabPlacement", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Landroidx/compose/material/FabPlacement;", "getLocalFabPlacement", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "FabSpacing", "F", "material"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class JsonIncludeInclude {
    private static final CharacterEscapes<onAnimationUpdate> read = resetAsNaN.read(new getCreatedOnDateMs() { // from class: o.valueFilter
        @Override // kotlin.getCreatedOnDateMs
        public final Object invoke() {
            return JsonIncludeInclude.read();
        }
    });
    private static final float write = assignParameter.IconCompatParcelizer(16.0f);

    /* JADX INFO: Access modifiers changed from: private */
    public static final onAnimationUpdate read() {
        return null;
    }

    public static final JsonManagedReference read(setBaseColor setbasecolor, JsonSubTypes jsonSubTypes, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i, int i2) {
        if ((i2 & 1) != 0) {
            setbasecolor = setAutoStart.read(offset.write, null, _handleunrecognizedcharacterescape, 6, 2);
        }
        if ((i2 & 2) != 0) {
            Object objOnPause = _handleunrecognizedcharacterescape.onPause();
            if (objOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause = new JsonSubTypes();
                _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause);
            }
            jsonSubTypes = (JsonSubTypes) objOnPause;
        }
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesCompatParcelizer(1569641925, i, -1, "androidx.compose.material.rememberScaffoldState (Scaffold.kt:73)");
        }
        Object objOnPause2 = _handleunrecognizedcharacterescape.onPause();
        if (objOnPause2 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
            objOnPause2 = new JsonManagedReference(setbasecolor, jsonSubTypes);
            _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause2);
        }
        JsonManagedReference jsonManagedReference = (JsonManagedReference) objOnPause2;
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesImplApi21Parcelizer();
        }
        return jsonManagedReference;
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x04d6  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x0501  */
    /* JADX WARN: Removed duplicated region for block: B:313:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0121  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void read(final kotlin.onCreateView r37, kotlin._handleOddName r38, kotlin.JsonManagedReference r39, kotlin.MagicModuleSubmissionRequestBody<? super kotlin._handleUnrecognizedCharacterEscape, ? super java.lang.Integer, kotlin.getShowPopup> r40, kotlin.MagicModuleSubmissionRequestBody<? super kotlin._handleUnrecognizedCharacterEscape, ? super java.lang.Integer, kotlin.getShowPopup> r41, kotlin.getModuleData<? super kotlin.JsonSubTypes, ? super kotlin._handleUnrecognizedCharacterEscape, ? super java.lang.Integer, kotlin.getShowPopup> r42, kotlin.MagicModuleSubmissionRequestBody<? super kotlin._handleUnrecognizedCharacterEscape, ? super java.lang.Integer, kotlin.getShowPopup> r43, int r44, boolean r45, kotlin.getModuleData<? super kotlin.DrawerLayoutLayoutParams, ? super kotlin._handleUnrecognizedCharacterEscape, ? super java.lang.Integer, kotlin.getShowPopup> r46, boolean r47, kotlin.findAndAddVirtualProperties r48, float r49, long r50, long r52, long r54, long r56, long r58, final kotlin.getModuleData<? super kotlin.getReturnTransition, ? super kotlin._handleUnrecognizedCharacterEscape, ? super java.lang.Integer, kotlin.getShowPopup> r60, kotlin._handleUnrecognizedCharacterEscape r61, final int r62, final int r63, final int r64) {
        /*
            Method dump skipped, instruction units count: 1308
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.JsonIncludeInclude.read(o.onCreateView, o._handleOddName, o.JsonManagedReference, o.MagicModuleSubmissionRequestBody, o.MagicModuleSubmissionRequestBody, o.getModuleData, o.MagicModuleSubmissionRequestBody, int, boolean, o.getModuleData, boolean, o.findAndAddVirtualProperties, float, long, long, long, long, long, o.getModuleData, o._handleUnrecognizedCharacterEscape, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup write(final getShape getshape, final onCreateView oncreateview, long j, long j2, final boolean z, final int i, final MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody, final getModuleData getmoduledata, final MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody2, final MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody3, final getModuleData getmoduledata2, final JsonManagedReference jsonManagedReference, _handleOddName _handleoddname, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i2) {
        int i3;
        if ((i2 & 6) == 0) {
            i3 = i2 | (_handleunrecognizedcharacterescape.AudioAttributesCompatParcelizer(_handleoddname) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if (!_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer((i3 & 19) != 18, i3 & 1)) {
            _handleunrecognizedcharacterescape.onPrepareFromSearch();
        } else {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(-1236753028, i3, -1, "androidx.compose.material.Scaffold.<anonymous> (Scaffold.kt:200)");
            }
            boolean zAudioAttributesCompatParcelizer = _handleunrecognizedcharacterescape.AudioAttributesCompatParcelizer(getshape);
            boolean zAudioAttributesCompatParcelizer2 = _handleunrecognizedcharacterescape.AudioAttributesCompatParcelizer(oncreateview);
            Object objOnPause = _handleunrecognizedcharacterescape.onPause();
            if ((zAudioAttributesCompatParcelizer | zAudioAttributesCompatParcelizer2) || objOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause = new getAnswerMap() { // from class: o.JsonKey
                    @Override // kotlin.getAnswerMap
                    public final Object invoke(Object obj) {
                        return JsonIncludeInclude.read(getshape, oncreateview, (onCreateView) obj);
                    }
                };
                _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause);
            }
            Nulls.AudioAttributesCompatParcelizer(onCreateOptionsMenu.AudioAttributesCompatParcelizer(_handleoddname, (getAnswerMap) objOnPause), null, j, j2, null, BitmapDescriptorFactory.HUE_RED, multiplyFft.AudioAttributesCompatParcelizer(-1761194824, true, new MagicModuleSubmissionRequestBody() { // from class: o.withContentFilter
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return JsonIncludeInclude.IconCompatParcelizer(z, i, magicModuleSubmissionRequestBody, getmoduledata, magicModuleSubmissionRequestBody2, getshape, magicModuleSubmissionRequestBody3, getmoduledata2, jsonManagedReference, (_handleUnrecognizedCharacterEscape) obj, ((Integer) obj2).intValue());
                }
            }, _handleunrecognizedcharacterescape, 54), _handleunrecognizedcharacterescape, 1572864, 50);
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(getShape getshape, onCreateView oncreateview, onCreateView oncreateview2) {
        getshape.read(onDestroy.AudioAttributesCompatParcelizer(oncreateview, oncreateview2));
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesCompatParcelizer(getModuleData getmoduledata, JsonManagedReference jsonManagedReference, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        if (_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer((i & 3) != 2, i & 1)) {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(545329543, i, -1, "androidx.compose.material.Scaffold.<anonymous>.<anonymous>.<anonymous> (Scaffold.kt:216)");
            }
            getmoduledata.AudioAttributesCompatParcelizer(jsonManagedReference.getAudioAttributesCompatParcelizer(), _handleunrecognizedcharacterescape, 0);
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        } else {
            _handleunrecognizedcharacterescape.onPrepareFromSearch();
        }
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup IconCompatParcelizer(boolean z, int i, MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody, getModuleData getmoduledata, MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody2, getShape getshape, MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody3, final getModuleData getmoduledata2, final JsonManagedReference jsonManagedReference, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i2) {
        if (!_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer((i2 & 3) != 2, i2 & 1)) {
            _handleunrecognizedcharacterescape.onPrepareFromSearch();
        } else {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(-1761194824, i2, -1, "androidx.compose.material.Scaffold.<anonymous>.<anonymous> (Scaffold.kt:210)");
            }
            read(z, i, magicModuleSubmissionRequestBody, getmoduledata, multiplyFft.AudioAttributesCompatParcelizer(545329543, true, new MagicModuleSubmissionRequestBody() { // from class: o.getValueFilter
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return JsonIncludeInclude.AudioAttributesCompatParcelizer(getmoduledata2, jsonManagedReference, (_handleUnrecognizedCharacterEscape) obj, ((Integer) obj2).intValue());
                }
            }, _handleunrecognizedcharacterescape, 54), magicModuleSubmissionRequestBody2, getshape, magicModuleSubmissionRequestBody3, _handleunrecognizedcharacterescape, CpioConstants.C_ISBLK);
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup write(getModuleData getmoduledata, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        if (_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer((i & 3) != 2, i & 1)) {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(-1888468172, i, -1, "androidx.compose.material.Scaffold.<anonymous> (Scaffold.kt:234)");
            }
            getmoduledata.AudioAttributesCompatParcelizer(_handleOddName.INSTANCE, _handleunrecognizedcharacterescape, 54);
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        } else {
            _handleunrecognizedcharacterescape.onPrepareFromSearch();
        }
        return getShowPopup.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x0463  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x048e  */
    /* JADX WARN: Removed duplicated region for block: B:295:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0127  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void IconCompatParcelizer(kotlin._handleOddName r58, kotlin.JsonManagedReference r59, kotlin.MagicModuleSubmissionRequestBody<? super kotlin._handleUnrecognizedCharacterEscape, ? super java.lang.Integer, kotlin.getShowPopup> r60, kotlin.MagicModuleSubmissionRequestBody<? super kotlin._handleUnrecognizedCharacterEscape, ? super java.lang.Integer, kotlin.getShowPopup> r61, kotlin.getModuleData<? super kotlin.JsonSubTypes, ? super kotlin._handleUnrecognizedCharacterEscape, ? super java.lang.Integer, kotlin.getShowPopup> r62, kotlin.MagicModuleSubmissionRequestBody<? super kotlin._handleUnrecognizedCharacterEscape, ? super java.lang.Integer, kotlin.getShowPopup> r63, int r64, boolean r65, kotlin.getModuleData<? super kotlin.DrawerLayoutLayoutParams, ? super kotlin._handleUnrecognizedCharacterEscape, ? super java.lang.Integer, kotlin.getShowPopup> r66, boolean r67, kotlin.findAndAddVirtualProperties r68, float r69, long r70, long r72, long r74, long r76, long r78, final kotlin.getModuleData<? super kotlin.getReturnTransition, ? super kotlin._handleUnrecognizedCharacterEscape, ? super java.lang.Integer, kotlin.getShowPopup> r80, kotlin._handleUnrecognizedCharacterEscape r81, final int r82, final int r83, final int r84) {
        /*
            Method dump skipped, instruction units count: 1196
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.JsonIncludeInclude.IconCompatParcelizer(o._handleOddName, o.JsonManagedReference, o.MagicModuleSubmissionRequestBody, o.MagicModuleSubmissionRequestBody, o.getModuleData, o.MagicModuleSubmissionRequestBody, int, boolean, o.getModuleData, boolean, o.findAndAddVirtualProperties, float, long, long, long, long, long, o.getModuleData, o._handleUnrecognizedCharacterEscape, int, int, int):void");
    }

    private static final void read(final boolean z, final int i, final MagicModuleSubmissionRequestBody<? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup> magicModuleSubmissionRequestBody, final getModuleData<? super getReturnTransition, ? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup> getmoduledata, final MagicModuleSubmissionRequestBody<? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup> magicModuleSubmissionRequestBody2, final MagicModuleSubmissionRequestBody<? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup> magicModuleSubmissionRequestBody3, final onCreateView oncreateview, final MagicModuleSubmissionRequestBody<? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup> magicModuleSubmissionRequestBody4, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, final int i2) {
        int i3;
        int i4;
        _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescapeWrite = _handleunrecognizedcharacterescape.write(675142332);
        if ((i2 & 6) == 0) {
            i3 = (_handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(z) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(i) ? 32 : 16;
        }
        if ((i2 & RendererCapabilities.MODE_SUPPORT_MASK) == 0) {
            i3 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(magicModuleSubmissionRequestBody) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(getmoduledata) ? 2048 : 1024;
        }
        if ((i2 & CpioConstants.C_ISBLK) == 0) {
            i3 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(magicModuleSubmissionRequestBody2) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(magicModuleSubmissionRequestBody3) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE;
        }
        if ((i2 & 1572864) == 0) {
            i3 |= _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(oncreateview) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((i2 & 12582912) == 0) {
            i3 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(magicModuleSubmissionRequestBody4) ? 8388608 : 4194304;
        }
        if (!_handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer((i3 & 4793491) != 4793490, i3 & 1)) {
            _handleunrecognizedcharacterescapeWrite.onPrepareFromSearch();
        } else {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(675142332, i3, -1, "androidx.compose.material.ScaffoldLayout (Scaffold.kt:377)");
            }
            Object objOnPause = _handleunrecognizedcharacterescapeWrite.onPause();
            if (objOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause = new write();
                _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(objOnPause);
            }
            final write writeVar = (write) objOnPause;
            boolean z2 = (i3 & 896) == 256;
            boolean z3 = (57344 & i3) == 16384;
            boolean z4 = (3670016 & i3) == 1048576;
            boolean z5 = (458752 & i3) == 131072;
            boolean z6 = (i3 & 112) == 32;
            boolean z7 = (i3 & 14) == 4;
            boolean z8 = (29360128 & i3) == 8388608;
            boolean z9 = (i3 & 7168) == 2048;
            Object objOnPause2 = _handleunrecognizedcharacterescapeWrite.onPause();
            if (((z5 | z4 | z2 | z3 | z6 | z7 | z8) || z9) || objOnPause2 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                i4 = 0;
                MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody5 = new MagicModuleSubmissionRequestBody() { // from class: o.all
                    @Override // kotlin.MagicModuleSubmissionRequestBody
                    public final Object invoke(Object obj, Object obj2) {
                        return JsonIncludeInclude.read(magicModuleSubmissionRequestBody, magicModuleSubmissionRequestBody2, magicModuleSubmissionRequestBody3, i, z, oncreateview, writeVar, magicModuleSubmissionRequestBody4, getmoduledata, (getNodeType) obj, (PropertyValueAny) obj2);
                    }
                };
                _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(magicModuleSubmissionRequestBody5);
                objOnPause2 = magicModuleSubmissionRequestBody5;
            } else {
                i4 = 0;
            }
            fieldNames.read(null, (MagicModuleSubmissionRequestBody) objOnPause2, _handleunrecognizedcharacterescapeWrite, i4, 1);
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        releaseNameCopyBuffer releasenamecopybufferMediaBrowserCompatSearchResultReceiver = _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatSearchResultReceiver();
        if (releasenamecopybufferMediaBrowserCompatSearchResultReceiver != null) {
            releasenamecopybufferMediaBrowserCompatSearchResultReceiver.read(new MagicModuleSubmissionRequestBody() { // from class: o.access
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return JsonIncludeInclude.RemoteActionCompatParcelizer(z, i, magicModuleSubmissionRequestBody, getmoduledata, magicModuleSubmissionRequestBody2, magicModuleSubmissionRequestBody3, oncreateview, magicModuleSubmissionRequestBody4, i2, (_handleUnrecognizedCharacterEscape) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\bR+\u0010\u0007\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00018G@GX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u0007\u0010\u000e"}, d2 = {"Lo/JsonIncludeInclude$write;", "Lo/getReturnTransition;", "Lo/tryToResolveUnresolved;", "p0", "Lo/assignParameter;", "read", "(Lo/tryToResolveUnresolved;)F", "IconCompatParcelizer", "()F", "RemoteActionCompatParcelizer", "AudioAttributesCompatParcelizer", "Lo/InputAccessor;", "write", "()Lo/getReturnTransition;", "(Lo/getReturnTransition;)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class write implements getReturnTransition {

        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
        private final InputAccessor IconCompatParcelizer = available.RemoteActionCompatParcelizer$default(getParentFragment.AudioAttributesCompatParcelizer(assignParameter.IconCompatParcelizer(BitmapDescriptorFactory.HUE_RED)), null, 2, null);

        write() {
        }

        public final void IconCompatParcelizer(getReturnTransition getreturntransition) {
            this.IconCompatParcelizer.write(getreturntransition);
        }

        public final getReturnTransition write() {
            return (getReturnTransition) this.IconCompatParcelizer.getRemoteActionCompatParcelizer();
        }

        @Override // kotlin.getReturnTransition
        public final float read(tryToResolveUnresolved p0) {
            return write().read(p0);
        }

        @Override // kotlin.getReturnTransition
        /* JADX INFO: renamed from: IconCompatParcelizer */
        public final float getRead() {
            return write().getRead();
        }

        @Override // kotlin.getReturnTransition
        public final float RemoteActionCompatParcelizer(tryToResolveUnresolved p0) {
            return write().RemoteActionCompatParcelizer(p0);
        }

        @Override // kotlin.getReturnTransition
        /* JADX INFO: renamed from: read */
        public final float getRemoteActionCompatParcelizer() {
            return write().getRemoteActionCompatParcelizer();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x026d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin.withHandlersFrom read(kotlin.MagicModuleSubmissionRequestBody r26, kotlin.MagicModuleSubmissionRequestBody r27, kotlin.MagicModuleSubmissionRequestBody r28, int r29, boolean r30, kotlin.onCreateView r31, final o.JsonIncludeInclude.write r32, final kotlin.MagicModuleSubmissionRequestBody r33, final kotlin.getModuleData r34, kotlin.getNodeType r35, kotlin.PropertyValueAny r36) {
        /*
            Method dump skipped, instruction units count: 1048
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.JsonIncludeInclude.read(o.MagicModuleSubmissionRequestBody, o.MagicModuleSubmissionRequestBody, o.MagicModuleSubmissionRequestBody, int, boolean, o.onCreateView, o.JsonIncludeInclude$write, o.MagicModuleSubmissionRequestBody, o.getModuleData, o.getNodeType, o.PropertyValueAny):o.withHandlersFrom");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup RemoteActionCompatParcelizer(onAnimationUpdate onanimationupdate, MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        if (!_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer((i & 3) != 2, i & 1)) {
            _handleunrecognizedcharacterescape.onPrepareFromSearch();
        } else {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(-502652347, i, -1, "androidx.compose.material.ScaffoldLayout.<anonymous>.<anonymous>.<anonymous> (Scaffold.kt:474)");
            }
            resetAsNaN.write(read.AudioAttributesCompatParcelizer(onanimationupdate), magicModuleSubmissionRequestBody, _handleunrecognizedcharacterescape, ContentReference.write);
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup IconCompatParcelizer(getModuleData getmoduledata, write writeVar, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        if (_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer((i & 3) != 2, i & 1)) {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(-574531306, i, -1, "androidx.compose.material.ScaffoldLayout.<anonymous>.<anonymous>.<anonymous> (Scaffold.kt:533)");
            }
            getmoduledata.AudioAttributesCompatParcelizer(writeVar, _handleunrecognizedcharacterescape, 6);
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        } else {
            _handleunrecognizedcharacterescape.onPrepareFromSearch();
        }
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup write(List list, List list2, List list3, List list4, List list5, int i, int i2, int i3, Integer num, onAnimationUpdate onanimationupdate, Integer num2, _parser.IconCompatParcelizer iconCompatParcelizer) {
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            _parser.IconCompatParcelizer.IconCompatParcelizer$default(iconCompatParcelizer, (_parser) list.get(i4), 0, i, BitmapDescriptorFactory.HUE_RED, 4, (Object) null);
        }
        int size2 = list2.size();
        for (int i5 = 0; i5 < size2; i5++) {
            _parser.IconCompatParcelizer.IconCompatParcelizer$default(iconCompatParcelizer, (_parser) list2.get(i5), 0, 0, BitmapDescriptorFactory.HUE_RED, 4, (Object) null);
        }
        int size3 = list3.size();
        for (int i6 = 0; i6 < size3; i6++) {
            _parser.IconCompatParcelizer.IconCompatParcelizer$default(iconCompatParcelizer, (_parser) list3.get(i6), 0, i2 - i3, BitmapDescriptorFactory.HUE_RED, 4, (Object) null);
        }
        int size4 = list4.size();
        for (int i7 = 0; i7 < size4; i7++) {
            _parser.IconCompatParcelizer.IconCompatParcelizer$default(iconCompatParcelizer, (_parser) list4.get(i7), 0, i2 - (num != null ? num.intValue() : 0), BitmapDescriptorFactory.HUE_RED, 4, (Object) null);
        }
        int size5 = list5.size();
        for (int i8 = 0; i8 < size5; i8++) {
            _parser.IconCompatParcelizer.IconCompatParcelizer$default(iconCompatParcelizer, (_parser) list5.get(i8), onanimationupdate != null ? onanimationupdate.getRemoteActionCompatParcelizer() : 0, i2 - (num2 != null ? num2.intValue() : 0), BitmapDescriptorFactory.HUE_RED, 4, (Object) null);
        }
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup RemoteActionCompatParcelizer(boolean z, int i, MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody, getModuleData getmoduledata, MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody2, MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody3, onCreateView oncreateview, MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody4, int i2, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i3) {
        read(z, i, magicModuleSubmissionRequestBody, getmoduledata, magicModuleSubmissionRequestBody2, magicModuleSubmissionRequestBody3, oncreateview, magicModuleSubmissionRequestBody4, _handleunrecognizedcharacterescape, _appendEscaped.RemoteActionCompatParcelizer(i2 | 1));
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(_handleOddName _handleoddname, JsonManagedReference jsonManagedReference, MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody, MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody2, getModuleData getmoduledata, MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody3, int i, boolean z, getModuleData getmoduledata2, boolean z2, findAndAddVirtualProperties findandaddvirtualproperties, float f, long j, long j2, long j3, long j4, long j5, getModuleData getmoduledata3, int i2, int i3, int i4, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i5) {
        IconCompatParcelizer(_handleoddname, jsonManagedReference, magicModuleSubmissionRequestBody, magicModuleSubmissionRequestBody2, getmoduledata, magicModuleSubmissionRequestBody3, i, z, getmoduledata2, z2, findandaddvirtualproperties, f, j, j2, j3, j4, j5, getmoduledata3, _handleunrecognizedcharacterescape, _appendEscaped.RemoteActionCompatParcelizer(i2 | 1), _appendEscaped.RemoteActionCompatParcelizer(i3), i4);
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup IconCompatParcelizer(onCreateView oncreateview, _handleOddName _handleoddname, JsonManagedReference jsonManagedReference, MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody, MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody2, getModuleData getmoduledata, MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody3, int i, boolean z, getModuleData getmoduledata2, boolean z2, findAndAddVirtualProperties findandaddvirtualproperties, float f, long j, long j2, long j3, long j4, long j5, getModuleData getmoduledata3, int i2, int i3, int i4, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i5) {
        read(oncreateview, _handleoddname, jsonManagedReference, (MagicModuleSubmissionRequestBody<? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup>) magicModuleSubmissionRequestBody, (MagicModuleSubmissionRequestBody<? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup>) magicModuleSubmissionRequestBody2, (getModuleData<? super JsonSubTypes, ? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup>) getmoduledata, (MagicModuleSubmissionRequestBody<? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup>) magicModuleSubmissionRequestBody3, i, z, (getModuleData<? super DrawerLayoutLayoutParams, ? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup>) getmoduledata2, z2, findandaddvirtualproperties, f, j, j2, j3, j4, j5, (getModuleData<? super getReturnTransition, ? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup>) getmoduledata3, _handleunrecognizedcharacterescape, _appendEscaped.RemoteActionCompatParcelizer(i2 | 1), _appendEscaped.RemoteActionCompatParcelizer(i3), i4);
        return getShowPopup.INSTANCE;
    }
}
