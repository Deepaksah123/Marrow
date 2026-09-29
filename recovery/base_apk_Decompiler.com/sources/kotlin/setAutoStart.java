package kotlin;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import com.google.android.exoplayer2.RendererCapabilities;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.exoplayer2.upstream.CmcdHeadersFactory;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow.data.models.user.NotesDispatchAddressRequestKt;
import kotlin.Metadata;
import kotlin._handleOddName;
import kotlin.setAutoStart;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000~\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a+\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005H\u0007¢\u0006\u0002\u0010\u0007\u001a;\u0010\b\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\n2\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0007¢\u0006\u0002\u0010\u000e\u001a\u0090\u0001\u0010\u000f\u001a\u00020\u00102\u001c\u0010\u0011\u001a\u0018\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00100\u0005¢\u0006\u0002\b\u0013¢\u0006\u0002\b\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u00012\b\b\u0002\u0010\u0018\u001a\u00020\u00062\b\b\u0002\u0010\u0019\u001a\u00020\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u001f\u001a\u00020\u001e2\b\b\u0002\u0010 \u001a\u00020\u001e2\u0011\u0010!\u001a\r\u0012\u0004\u0012\u00020\u00100\"¢\u0006\u0002\b\u0013H\u0007¢\u0006\u0004\b#\u0010$\u001a\u0090\u0001\u0010%\u001a\u00020\u00102\u001c\u0010\u0011\u001a\u0018\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00100\u0005¢\u0006\u0002\b\u0013¢\u0006\u0002\b\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\t2\b\b\u0002\u0010\u0018\u001a\u00020\u00062\b\b\u0002\u0010\u0019\u001a\u00020\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u001f\u001a\u00020\u001e2\b\b\u0002\u0010 \u001a\u00020\u001e2\u0011\u0010!\u001a\r\u0012\u0004\u0012\u00020\u00100\"¢\u0006\u0002\b\u0013H\u0007¢\u0006\u0004\b&\u0010'\u001a \u0010(\u001a\u00020\r2\u0006\u0010)\u001a\u00020\r2\u0006\u0010*\u001a\u00020\r2\u0006\u0010+\u001a\u00020\rH\u0002\u001a-\u0010,\u001a\u00020\u00102\u0006\u0010-\u001a\u00020\u001e2\f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00100\"2\u0006\u0010/\u001a\u00020\u0006H\u0003¢\u0006\u0004\b0\u00101\u001a;\u00102\u001a\u00020\u00102\u0006\u00103\u001a\u00020\u00062\f\u00104\u001a\b\u0012\u0004\u0012\u00020\u00100\"2\f\u00105\u001a\b\u0012\u0004\u0012\u00020\r0\"2\u0006\u0010-\u001a\u00020\u001eH\u0003¢\u0006\u0004\b6\u00107\u001a\u0014\u0010?\u001a\u00020@2\n\u0010A\u001a\u0006\u0012\u0002\b\u00030BH\u0002\"\u0010\u00108\u001a\u00020\u001cX\u0082\u0004¢\u0006\u0004\n\u0002\u00109\"\u0010\u0010:\u001a\u00020\u001cX\u0082\u0004¢\u0006\u0004\n\u0002\u00109\"\u0010\u0010;\u001a\u00020\u001cX\u0082\u0004¢\u0006\u0004\n\u0002\u00109\"\u0014\u0010<\u001a\b\u0012\u0004\u0012\u00020\r0=X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010>\u001a\u00020\rX\u0082T¢\u0006\u0002\n\u0000¨\u0006C²\u0006\n\u0010D\u001a\u00020\rX\u008a\u0084\u0002"}, d2 = {"rememberDrawerState", "Landroidx/compose/material/DrawerState;", "initialValue", "Landroidx/compose/material/DrawerValue;", "confirmStateChange", "Lkotlin/Function1;", "", "(Landroidx/compose/material/DrawerValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material/DrawerState;", "rememberBottomDrawerState", "Landroidx/compose/material/BottomDrawerState;", "Landroidx/compose/material/BottomDrawerValue;", "animationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "", "(Landroidx/compose/material/BottomDrawerValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/animation/core/AnimationSpec;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material/BottomDrawerState;", "ModalDrawer", "", "drawerContent", "Landroidx/compose/foundation/layout/ColumnScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "modifier", "Landroidx/compose/ui/Modifier;", "drawerState", "gesturesEnabled", "drawerShape", "Landroidx/compose/ui/graphics/Shape;", "drawerElevation", "Landroidx/compose/ui/unit/Dp;", "drawerBackgroundColor", "Landroidx/compose/ui/graphics/Color;", "drawerContentColor", "scrimColor", "content", "Lkotlin/Function0;", "ModalDrawer-Gs3lGvM", "(Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/Modifier;Landroidx/compose/material/DrawerState;ZLandroidx/compose/ui/graphics/Shape;FJJJLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "BottomDrawer", "BottomDrawer-Gs3lGvM", "(Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/Modifier;Landroidx/compose/material/BottomDrawerState;ZLandroidx/compose/ui/graphics/Shape;FJJJLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "calculateFraction", CmcdHeadersFactory.OBJECT_TYPE_AUDIO_ONLY, "b", "pos", "BottomDrawerScrim", TtmlNode.ATTR_TTS_COLOR, "onDismiss", "visible", "BottomDrawerScrim-3J-VO9M", "(JLkotlin/jvm/functions/Function0;ZLandroidx/compose/runtime/Composer;I)V", "Scrim", TtmlNode.TEXT_EMPHASIS_MARK_OPEN, "onClose", "fraction", "Scrim-Bx497Mc", "(ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;JLandroidx/compose/runtime/Composer;I)V", "EndDrawerPadding", "F", "DrawerPositionalThreshold", "DrawerVelocityThreshold", "AnimationSpec", "Landroidx/compose/animation/core/TweenSpec;", "BottomDrawerOpenFraction", "ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", NotesDispatchAddressRequestKt.KEY_STATE, "Landroidx/compose/material/AnchoredDraggableState;", "material", "alpha"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class setAutoStart {
    private static final float read = assignParameter.IconCompatParcelizer(56.0f);
    private static final float IconCompatParcelizer = assignParameter.IconCompatParcelizer(56.0f);
    private static final float RemoteActionCompatParcelizer = assignParameter.IconCompatParcelizer(400.0f);
    private static final safeSizeOf<Float> write = new safeSizeOf<>(256, 0, null, 6, null);

    private static final float RemoteActionCompatParcelizer(float f, float f2, float f3) {
        float f4 = (f3 - f) / (f2 - f);
        if (f4 < BitmapDescriptorFactory.HUE_RED) {
            f4 = 0.0f;
        }
        if (f4 > 1.0f) {
            return 1.0f;
        }
        return f4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean write(offset offsetVar) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final setBaseColor AudioAttributesCompatParcelizer(offset offsetVar, getAnswerMap getanswermap) {
        return new setBaseColor(offsetVar, getanswermap);
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:173:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0107  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void AudioAttributesCompatParcelizer(final kotlin.getModuleData<? super kotlin.DrawerLayoutLayoutParams, ? super kotlin._handleUnrecognizedCharacterEscape, ? super java.lang.Integer, kotlin.getShowPopup> r34, kotlin._handleOddName r35, kotlin.setBaseColor r36, boolean r37, kotlin.findAndAddVirtualProperties r38, float r39, long r40, long r42, long r44, final kotlin.MagicModuleSubmissionRequestBody<? super kotlin._handleUnrecognizedCharacterEscape, ? super java.lang.Integer, kotlin.getShowPopup> r46, kotlin._handleUnrecognizedCharacterEscape r47, final int r48, final int r49) {
        /*
            Method dump skipped, instruction units count: 648
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setAutoStart.AudioAttributesCompatParcelizer(o.getModuleData, o._handleOddName, o.setBaseColor, boolean, o.findAndAddVirtualProperties, float, long, long, long, o.MagicModuleSubmissionRequestBody, o._handleUnrecognizedCharacterEscape, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup RemoteActionCompatParcelizer(final setBaseColor setbasecolor, final boolean z, final TopUserCompanion topUserCompanion, long j, findAndAddVirtualProperties findandaddvirtualproperties, long j2, long j3, float f, MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody, final getModuleData getmoduledata, setDrawerShadow setdrawershadow, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        int i2;
        if ((i & 6) == 0) {
            i2 = i | (_handleunrecognizedcharacterescape.AudioAttributesCompatParcelizer(setdrawershadow) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (!_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer((i2 & 19) != 18, i2 & 1)) {
            _handleunrecognizedcharacterescape.onPrepareFromSearch();
        } else {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(-1549911011, i2, -1, "androidx.compose.material.ModalDrawer.<anonymous> (Drawer.kt:464)");
            }
            long j4 = setdrawershadow.getAudioAttributesCompatParcelizer();
            if (!PropertyValueAny.RemoteActionCompatParcelizer(j4)) {
                throw new IllegalStateException("Drawer shouldn't have infinite width");
            }
            final float f2 = -PropertyValueAny.AudioAttributesImplBaseParcelizer(j4);
            final bufferMapProperty buffermapproperty = (bufferMapProperty) _handleunrecognizedcharacterescape.write(getDefaultNullValueSerializer.IconCompatParcelizer());
            boolean zAudioAttributesCompatParcelizer = _handleunrecognizedcharacterescape.AudioAttributesCompatParcelizer(setbasecolor);
            boolean zAudioAttributesCompatParcelizer2 = _handleunrecognizedcharacterescape.AudioAttributesCompatParcelizer(buffermapproperty);
            boolean zIconCompatParcelizer = _handleunrecognizedcharacterescape.IconCompatParcelizer(f2);
            Object objOnPause = _handleunrecognizedcharacterescape.onPause();
            boolean z2 = zAudioAttributesCompatParcelizer | zAudioAttributesCompatParcelizer2 | zIconCompatParcelizer;
            final float f3 = BitmapDescriptorFactory.HUE_RED;
            if (z2 || objOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause = new getCreatedOnDateMs() { // from class: o.setWidthRatio
                    @Override // kotlin.getCreatedOnDateMs
                    public final Object invoke() {
                        return setAutoStart.AudioAttributesCompatParcelizer(setbasecolor, buffermapproperty, f2, f3);
                    }
                };
                _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause);
            }
            StreamReadException.write((getCreatedOnDateMs) objOnPause, _handleunrecognizedcharacterescape, 0);
            _handleOddName _handleoddnameRemoteActionCompatParcelizer$default = LottieAnimationViewSavedState.RemoteActionCompatParcelizer$default(_handleOddName.INSTANCE, setbasecolor.IconCompatParcelizer(), superDispatchKeyEvent.AudioAttributesCompatParcelizer, z, _handleunrecognizedcharacterescape.write(getDefaultNullValueSerializer.RatingCompat()) == tryToResolveUnresolved.RemoteActionCompatParcelizer, null, false, 48, null);
            withTypeHandler withtypehandlerWrite = AbsSavedState1.write(_skipWSOrEnd.INSTANCE.MediaBrowserCompatSearchResultReceiver(), false);
            int iAudioAttributesCompatParcelizer = _getBigDecimal.AudioAttributesCompatParcelizer(_handleunrecognizedcharacterescape, 0);
            _getCharDesc _getchardescHandleMediaPlayPauseIfPendingOnHandler = _handleunrecognizedcharacterescape.handleMediaPlayPauseIfPendingOnHandler();
            _handleOddName _handleoddnameRemoteActionCompatParcelizer = _verifyNLZ2.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape, _handleoddnameRemoteActionCompatParcelizer$default);
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
            MagicModuleSubmissionRequestBody<getDependencies, Integer, getShowPopup> magicModuleSubmissionRequestBodyAudioAttributesCompatParcelizer = getDependencies.INSTANCE.AudioAttributesCompatParcelizer();
            if (_handleunrecognizedcharacterescape2.getParcelableVolumeInfo() || !toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape2.onPause(), Integer.valueOf(iAudioAttributesCompatParcelizer))) {
                _handleunrecognizedcharacterescape2.RemoteActionCompatParcelizer(Integer.valueOf(iAudioAttributesCompatParcelizer));
                _handleunrecognizedcharacterescape2.read(Integer.valueOf(iAudioAttributesCompatParcelizer), magicModuleSubmissionRequestBodyAudioAttributesCompatParcelizer);
            }
            NumberOutput.write(_handleunrecognizedcharacterescape2, _handleoddnameRemoteActionCompatParcelizer, getDependencies.INSTANCE.MediaBrowserCompatCustomActionResultReceiver());
            setDrawerElevation setdrawerelevation = setDrawerElevation.INSTANCE;
            _handleOddName.Companion companion = _handleOddName.INSTANCE;
            withTypeHandler withtypehandlerWrite2 = AbsSavedState1.write(_skipWSOrEnd.INSTANCE.MediaBrowserCompatSearchResultReceiver(), false);
            int iAudioAttributesCompatParcelizer2 = _getBigDecimal.AudioAttributesCompatParcelizer(_handleunrecognizedcharacterescape, 0);
            _getCharDesc _getchardescHandleMediaPlayPauseIfPendingOnHandler2 = _handleunrecognizedcharacterescape.handleMediaPlayPauseIfPendingOnHandler();
            _handleOddName _handleoddnameRemoteActionCompatParcelizer2 = _verifyNLZ2.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape, companion);
            getCreatedOnDateMs<getDependencies> getcreatedondatemsIconCompatParcelizer2 = getDependencies.INSTANCE.IconCompatParcelizer();
            if (!(_handleunrecognizedcharacterescape.MediaMetadataCompat() instanceof _closeInput)) {
                _getBigDecimal.write();
            }
            _handleunrecognizedcharacterescape.onPrepareFromMediaId();
            if (_handleunrecognizedcharacterescape.getParcelableVolumeInfo()) {
                _handleunrecognizedcharacterescape.read(getcreatedondatemsIconCompatParcelizer2);
            } else {
                _handleunrecognizedcharacterescape.onPlayFromUri();
            }
            _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape3 = NumberOutput.read(_handleunrecognizedcharacterescape);
            NumberOutput.write(_handleunrecognizedcharacterescape3, withtypehandlerWrite2, getDependencies.INSTANCE.AudioAttributesImplBaseParcelizer());
            NumberOutput.write(_handleunrecognizedcharacterescape3, _getchardescHandleMediaPlayPauseIfPendingOnHandler2, getDependencies.INSTANCE.MediaBrowserCompatItemReceiver());
            MagicModuleSubmissionRequestBody<getDependencies, Integer, getShowPopup> magicModuleSubmissionRequestBodyAudioAttributesCompatParcelizer2 = getDependencies.INSTANCE.AudioAttributesCompatParcelizer();
            if (_handleunrecognizedcharacterescape3.getParcelableVolumeInfo() || !toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape3.onPause(), Integer.valueOf(iAudioAttributesCompatParcelizer2))) {
                _handleunrecognizedcharacterescape3.RemoteActionCompatParcelizer(Integer.valueOf(iAudioAttributesCompatParcelizer2));
                _handleunrecognizedcharacterescape3.read(Integer.valueOf(iAudioAttributesCompatParcelizer2), magicModuleSubmissionRequestBodyAudioAttributesCompatParcelizer2);
            }
            NumberOutput.write(_handleunrecognizedcharacterescape3, _handleoddnameRemoteActionCompatParcelizer2, getDependencies.INSTANCE.MediaBrowserCompatCustomActionResultReceiver());
            setDrawerElevation setdrawerelevation2 = setDrawerElevation.INSTANCE;
            magicModuleSubmissionRequestBody.invoke(_handleunrecognizedcharacterescape, 0);
            _handleunrecognizedcharacterescape.AudioAttributesImplBaseParcelizer();
            boolean z3 = setbasecolor.read();
            boolean zAudioAttributesCompatParcelizer3 = _handleunrecognizedcharacterescape.AudioAttributesCompatParcelizer(z);
            boolean zAudioAttributesCompatParcelizer4 = _handleunrecognizedcharacterescape.AudioAttributesCompatParcelizer(setbasecolor);
            boolean zIconCompatParcelizer2 = _handleunrecognizedcharacterescape.IconCompatParcelizer(topUserCompanion);
            Object objOnPause2 = _handleunrecognizedcharacterescape.onPause();
            if ((zAudioAttributesCompatParcelizer3 | zAudioAttributesCompatParcelizer4 | zIconCompatParcelizer2) || objOnPause2 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause2 = new getCreatedOnDateMs() { // from class: o.setShape
                    @Override // kotlin.getCreatedOnDateMs
                    public final Object invoke() {
                        return setAutoStart.IconCompatParcelizer(z, setbasecolor, topUserCompanion);
                    }
                };
                _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause2);
            }
            getCreatedOnDateMs getcreatedondatems = (getCreatedOnDateMs) objOnPause2;
            boolean zIconCompatParcelizer3 = _handleunrecognizedcharacterescape.IconCompatParcelizer(f2);
            boolean zAudioAttributesCompatParcelizer5 = _handleunrecognizedcharacterescape.AudioAttributesCompatParcelizer(setbasecolor);
            Object objOnPause3 = _handleunrecognizedcharacterescape.onPause();
            if ((zIconCompatParcelizer3 | zAudioAttributesCompatParcelizer5) || objOnPause3 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                final float f4 = BitmapDescriptorFactory.HUE_RED;
                objOnPause3 = new getCreatedOnDateMs() { // from class: o.setRepeatDelay
                    @Override // kotlin.getCreatedOnDateMs
                    public final Object invoke() {
                        return Float.valueOf(setAutoStart.read(f2, f4, setbasecolor));
                    }
                };
                _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause3);
            }
            AudioAttributesCompatParcelizer(z3, getcreatedondatems, (getCreatedOnDateMs) objOnPause3, j, _handleunrecognizedcharacterescape, 0);
            final String strAudioAttributesCompatParcelizer = getDefaultPropertyName.AudioAttributesCompatParcelizer(JsonTypeInfoNone.INSTANCE.AudioAttributesCompatParcelizer(), _handleunrecognizedcharacterescape, 6);
            bufferMapProperty buffermapproperty2 = (bufferMapProperty) _handleunrecognizedcharacterescape.write(getDefaultNullValueSerializer.IconCompatParcelizer());
            _handleOddName _handleoddnameRemoteActionCompatParcelizer3 = isAdded.RemoteActionCompatParcelizer(_handleOddName.INSTANCE, buffermapproperty2.b_(PropertyValueAny.MediaBrowserCompatItemReceiver(j4)), buffermapproperty2.b_(PropertyValueAny.MediaBrowserCompatCustomActionResultReceiver(j4)), buffermapproperty2.b_(PropertyValueAny.AudioAttributesImplBaseParcelizer(j4)), buffermapproperty2.b_(PropertyValueAny.AudioAttributesImplApi21Parcelizer(j4)));
            boolean zAudioAttributesCompatParcelizer6 = _handleunrecognizedcharacterescape.AudioAttributesCompatParcelizer(setbasecolor);
            Object objOnPause4 = _handleunrecognizedcharacterescape.onPause();
            if (zAudioAttributesCompatParcelizer6 || objOnPause4 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause4 = new getAnswerMap() { // from class: o.setTilt
                    @Override // kotlin.getAnswerMap
                    public final Object invoke(Object obj) {
                        return setAutoStart.RemoteActionCompatParcelizer(setbasecolor, (bufferMapProperty) obj);
                    }
                };
                _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause4);
            }
            _handleOddName _handleoddnameAudioAttributesCompatParcelizer$default = getParentFragment.AudioAttributesCompatParcelizer$default(getExitAnim.IconCompatParcelizer(_handleoddnameRemoteActionCompatParcelizer3, (getAnswerMap<? super bufferMapProperty, hasReferringProperties>) objOnPause4), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, read, BitmapDescriptorFactory.HUE_RED, 11, null);
            boolean zAudioAttributesCompatParcelizer7 = _handleunrecognizedcharacterescape.AudioAttributesCompatParcelizer(strAudioAttributesCompatParcelizer);
            boolean zAudioAttributesCompatParcelizer8 = _handleunrecognizedcharacterescape.AudioAttributesCompatParcelizer(setbasecolor);
            boolean zIconCompatParcelizer4 = _handleunrecognizedcharacterescape.IconCompatParcelizer(topUserCompanion);
            Object objOnPause5 = _handleunrecognizedcharacterescape.onPause();
            if ((zAudioAttributesCompatParcelizer7 | zAudioAttributesCompatParcelizer8 | zIconCompatParcelizer4) || objOnPause5 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause5 = new getAnswerMap() { // from class: o.setDirection
                    @Override // kotlin.getAnswerMap
                    public final Object invoke(Object obj) {
                        return setAutoStart.read(strAudioAttributesCompatParcelizer, setbasecolor, topUserCompanion, (getConfigOverride) obj);
                    }
                };
                _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause5);
            }
            Nulls.AudioAttributesCompatParcelizer(withValueInstantiators.read$default(_handleoddnameAudioAttributesCompatParcelizer$default, false, (getAnswerMap) objOnPause5, 1, null), findandaddvirtualproperties, j2, j3, null, f, multiplyFft.AudioAttributesCompatParcelizer(1265707871, true, new MagicModuleSubmissionRequestBody() { // from class: o.setBaseAlpha
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return setAutoStart.write(getmoduledata, (_handleUnrecognizedCharacterEscape) obj, ((Integer) obj2).intValue());
                }
            }, _handleunrecognizedcharacterescape, 54), _handleunrecognizedcharacterescape, 1572864, 16);
            _handleunrecognizedcharacterescape.AudioAttributesImplBaseParcelizer();
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesCompatParcelizer(setBaseColor setbasecolor, bufferMapProperty buffermapproperty, final float f, final float f2) {
        setbasecolor.RemoteActionCompatParcelizer(buffermapproperty);
        Glide.write$default(setbasecolor.IconCompatParcelizer(), LottieAnimationViewSavedState.write(new getAnswerMap() { // from class: o.setFixedHeight
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return setAutoStart.write(f, f2, (consumeAttributes) obj);
            }
        }), null, 2, null);
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup write(float f, float f2, consumeAttributes consumeattributes) {
        consumeattributes.AudioAttributesCompatParcelizer(offset.write, f);
        consumeattributes.AudioAttributesCompatParcelizer(offset.AudioAttributesCompatParcelizer, f2);
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup IconCompatParcelizer(boolean z, setBaseColor setbasecolor, TopUserCompanion topUserCompanion) {
        if (z && setbasecolor.IconCompatParcelizer().IconCompatParcelizer().invoke(offset.write).booleanValue()) {
            C0201setMcqCount.IconCompatParcelizer(topUserCompanion, null, null, new write(setbasecolor, null), 3);
        }
        return getShowPopup.INSTANCE;
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class write extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        final /* synthetic */ setBaseColor IconCompatParcelizer;
        int write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.write;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.write = 1;
                if (this.IconCompatParcelizer.RemoteActionCompatParcelizer(this) == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            return getShowPopup.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        write(setBaseColor setbasecolor, SampleVideos<? super write> sampleVideos) {
            super(2, sampleVideos);
            this.IconCompatParcelizer = setbasecolor;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return new write(this.IconCompatParcelizer, sampleVideos);
        }

        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((write) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float read(float f, float f2, setBaseColor setbasecolor) {
        return RemoteActionCompatParcelizer(f, f2, setbasecolor.write());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final hasReferringProperties RemoteActionCompatParcelizer(setBaseColor setbasecolor, bufferMapProperty buffermapproperty) {
        return hasReferringProperties.write(hasReferringProperties.read(((long) getOnline.RemoteActionCompatParcelizer(setbasecolor.write())) << 32));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(String str, final setBaseColor setbasecolor, final TopUserCompanion topUserCompanion, getConfigOverride getconfigoverride) {
        MapperBuilder.IconCompatParcelizer(getconfigoverride, str);
        if (setbasecolor.read()) {
            MapperBuilder.read$default(getconfigoverride, (String) null, new getCreatedOnDateMs() { // from class: o.ShimmerColorHighlightBuilder
                @Override // kotlin.getCreatedOnDateMs
                public final Object invoke() {
                    return Boolean.valueOf(setAutoStart.read(setbasecolor, topUserCompanion));
                }
            }, 1, (Object) null);
        }
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean read(setBaseColor setbasecolor, TopUserCompanion topUserCompanion) {
        if (!setbasecolor.IconCompatParcelizer().IconCompatParcelizer().invoke(offset.write).booleanValue()) {
            return true;
        }
        C0201setMcqCount.IconCompatParcelizer(topUserCompanion, null, null, new read(setbasecolor, null), 3);
        return true;
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class read extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        int read;
        final /* synthetic */ setBaseColor write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.read;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.read = 1;
                if (this.write.RemoteActionCompatParcelizer(this) == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            return getShowPopup.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        read(setBaseColor setbasecolor, SampleVideos<? super read> sampleVideos) {
            super(2, sampleVideos);
            this.write = setbasecolor;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return new read(this.write, sampleVideos);
        }

        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((read) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup write(getModuleData getmoduledata, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        if (!_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer((i & 3) != 2, i & 1)) {
            _handleunrecognizedcharacterescape.onPrepareFromSearch();
        } else {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(1265707871, i, -1, "androidx.compose.material.ModalDrawer.<anonymous>.<anonymous>.<anonymous> (Drawer.kt:540)");
            }
            _handleOddName _handleoddnameIconCompatParcelizer$default = isAdded.IconCompatParcelizer$default(_handleOddName.INSTANCE, BitmapDescriptorFactory.HUE_RED, 1, null);
            withTypeHandler withtypehandler = setValue.read(WindowInsetsCompatImpl30.INSTANCE.MediaBrowserCompatCustomActionResultReceiver(), _skipWSOrEnd.INSTANCE.RatingCompat(), _handleunrecognizedcharacterescape, 0);
            int iAudioAttributesCompatParcelizer = _getBigDecimal.AudioAttributesCompatParcelizer(_handleunrecognizedcharacterescape, 0);
            _getCharDesc _getchardescHandleMediaPlayPauseIfPendingOnHandler = _handleunrecognizedcharacterescape.handleMediaPlayPauseIfPendingOnHandler();
            _handleOddName _handleoddnameRemoteActionCompatParcelizer = _verifyNLZ2.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape, _handleoddnameIconCompatParcelizer$default);
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
            NumberOutput.write(_handleunrecognizedcharacterescape2, withtypehandler, getDependencies.INSTANCE.AudioAttributesImplBaseParcelizer());
            NumberOutput.write(_handleunrecognizedcharacterescape2, _getchardescHandleMediaPlayPauseIfPendingOnHandler, getDependencies.INSTANCE.MediaBrowserCompatItemReceiver());
            MagicModuleSubmissionRequestBody<getDependencies, Integer, getShowPopup> magicModuleSubmissionRequestBodyAudioAttributesCompatParcelizer = getDependencies.INSTANCE.AudioAttributesCompatParcelizer();
            if (_handleunrecognizedcharacterescape2.getParcelableVolumeInfo() || !toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape2.onPause(), Integer.valueOf(iAudioAttributesCompatParcelizer))) {
                _handleunrecognizedcharacterescape2.RemoteActionCompatParcelizer(Integer.valueOf(iAudioAttributesCompatParcelizer));
                _handleunrecognizedcharacterescape2.read(Integer.valueOf(iAudioAttributesCompatParcelizer), magicModuleSubmissionRequestBodyAudioAttributesCompatParcelizer);
            }
            NumberOutput.write(_handleunrecognizedcharacterescape2, _handleoddnameRemoteActionCompatParcelizer, getDependencies.INSTANCE.MediaBrowserCompatCustomActionResultReceiver());
            getmoduledata.AudioAttributesCompatParcelizer(DrawerLayoutSavedState.INSTANCE, _handleunrecognizedcharacterescape, 6);
            _handleunrecognizedcharacterescape.AudioAttributesImplBaseParcelizer();
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        return getShowPopup.INSTANCE;
    }

    private static final void AudioAttributesCompatParcelizer(final boolean z, final getCreatedOnDateMs<getShowPopup> getcreatedondatems, final getCreatedOnDateMs<Float> getcreatedondatems2, final long j, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, final int i) {
        int i2;
        _handleOddName.Companion companion;
        _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescapeWrite = _handleunrecognizedcharacterescape.write(1983403750);
        if ((i & 6) == 0) {
            i2 = (_handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(getcreatedondatems) ? 32 : 16;
        }
        if ((i & RendererCapabilities.MODE_SUPPORT_MASK) == 0) {
            i2 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(getcreatedondatems2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(j) ? 2048 : 1024;
        }
        if (!_handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer((i2 & 1171) != 1170, i2 & 1)) {
            _handleunrecognizedcharacterescapeWrite.onPrepareFromSearch();
        } else {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(1983403750, i2, -1, "androidx.compose.material.Scrim (Drawer.kt:751)");
            }
            final String strAudioAttributesCompatParcelizer = getDefaultPropertyName.AudioAttributesCompatParcelizer(JsonTypeInfoNone.INSTANCE.RemoteActionCompatParcelizer(), _handleunrecognizedcharacterescapeWrite, 6);
            if (z) {
                _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(1716213970);
                _handleOddName.Companion companion2 = _handleOddName.INSTANCE;
                int i3 = i2 & 112;
                boolean z2 = i3 == 32;
                RemoteActionCompatParcelizer remoteActionCompatParcelizerOnPause = _handleunrecognizedcharacterescapeWrite.onPause();
                if (z2 || remoteActionCompatParcelizerOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                    remoteActionCompatParcelizerOnPause = new RemoteActionCompatParcelizer(getcreatedondatems);
                    _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(remoteActionCompatParcelizerOnPause);
                }
                _handleOddName _handleoddnameIconCompatParcelizer = hasSomeOfFeatures.IconCompatParcelizer(companion2, getcreatedondatems, (PointerInputEventHandler) remoteActionCompatParcelizerOnPause);
                boolean zAudioAttributesCompatParcelizer = _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(strAudioAttributesCompatParcelizer);
                boolean z3 = i3 == 32;
                Object objOnPause = _handleunrecognizedcharacterescapeWrite.onPause();
                if ((z3 | zAudioAttributesCompatParcelizer) || objOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                    objOnPause = new getAnswerMap() { // from class: o.ShimmerShape
                        @Override // kotlin.getAnswerMap
                        public final Object invoke(Object obj) {
                            return setAutoStart.IconCompatParcelizer(strAudioAttributesCompatParcelizer, getcreatedondatems, (getConfigOverride) obj);
                        }
                    };
                    _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(objOnPause);
                }
                companion = withValueInstantiators.read(_handleoddnameIconCompatParcelizer, true, (getAnswerMap) objOnPause);
                _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatCustomActionResultReceiver();
            } else {
                _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(1716538044);
                _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatCustomActionResultReceiver();
                companion = _handleOddName.INSTANCE;
            }
            _handleOddName _handleoddnameAudioAttributesCompatParcelizer = isAdded.IconCompatParcelizer$default(_handleOddName.INSTANCE, BitmapDescriptorFactory.HUE_RED, 1, null).AudioAttributesCompatParcelizer(companion);
            boolean z4 = (i2 & 7168) == 2048;
            boolean z5 = (i2 & 896) == 256;
            Object objOnPause2 = _handleunrecognizedcharacterescapeWrite.onPause();
            if ((z4 | z5) || objOnPause2 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause2 = new getAnswerMap() { // from class: o.ShimmerDirection
                    @Override // kotlin.getAnswerMap
                    public final Object invoke(Object obj) {
                        return setAutoStart.AudioAttributesCompatParcelizer(j, getcreatedondatems2, (findSetterInfo) obj);
                    }
                };
                _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(objOnPause2);
            }
            setPrimaryDirectionalMotionAxisOverrider2epLt8ui.write(_handleoddnameAudioAttributesCompatParcelizer, (getAnswerMap) objOnPause2, _handleunrecognizedcharacterescapeWrite, 0);
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        releaseNameCopyBuffer releasenamecopybufferMediaBrowserCompatSearchResultReceiver = _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatSearchResultReceiver();
        if (releasenamecopybufferMediaBrowserCompatSearchResultReceiver != null) {
            releasenamecopybufferMediaBrowserCompatSearchResultReceiver.read(new MagicModuleSubmissionRequestBody() { // from class: o.ShimmerDrawable
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return setAutoStart.write(z, getcreatedondatems, getcreatedondatems2, j, i, (_handleUnrecognizedCharacterEscape) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class RemoteActionCompatParcelizer implements PointerInputEventHandler {
        final /* synthetic */ getCreatedOnDateMs<getShowPopup> IconCompatParcelizer;

        /* JADX INFO: Access modifiers changed from: private */
        public static final getShowPopup RemoteActionCompatParcelizer(getCreatedOnDateMs getcreatedondatems, getReferencedType getreferencedtype) {
            getcreatedondatems.invoke();
            return getShowPopup.INSTANCE;
        }

        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
        public final Object invoke(handleBadMerge handlebadmerge, SampleVideos<? super getShowPopup> sampleVideos) {
            final getCreatedOnDateMs<getShowPopup> getcreatedondatems = this.IconCompatParcelizer;
            Object objAudioAttributesCompatParcelizer$default = isSpanStillValid.AudioAttributesCompatParcelizer$default(handlebadmerge, null, null, null, new getAnswerMap() { // from class: o.setHighlightColor
                @Override // kotlin.getAnswerMap
                public final Object invoke(Object obj) {
                    return setAutoStart.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(getcreatedondatems, (getReferencedType) obj);
                }
            }, sampleVideos, 7, null);
            return objAudioAttributesCompatParcelizer$default == getYear.IconCompatParcelizer() ? objAudioAttributesCompatParcelizer$default : getShowPopup.INSTANCE;
        }

        RemoteActionCompatParcelizer(getCreatedOnDateMs<getShowPopup> getcreatedondatems) {
            this.IconCompatParcelizer = getcreatedondatems;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup IconCompatParcelizer(String str, final getCreatedOnDateMs getcreatedondatems, getConfigOverride getconfigoverride) {
        MapperBuilder.AudioAttributesCompatParcelizer(getconfigoverride, str);
        MapperBuilder.MediaBrowserCompatItemReceiver$default(getconfigoverride, null, new getCreatedOnDateMs() { // from class: o.setDropoff
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return Boolean.valueOf(setAutoStart.write(getcreatedondatems));
            }
        }, 1, null);
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean write(getCreatedOnDateMs getcreatedondatems) {
        getcreatedondatems.invoke();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesCompatParcelizer(long j, getCreatedOnDateMs getcreatedondatems, findSetterInfo findsetterinfo) {
        findSetterInfo.read$default(findsetterinfo, j, 0L, 0L, ((Number) getcreatedondatems.invoke()).floatValue(), null, null, 0, 118, null);
        return getShowPopup.INSTANCE;
    }

    public static final setBaseColor read(final offset offsetVar, final getAnswerMap<? super offset, Boolean> getanswermap, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i, int i2) {
        if ((i2 & 2) != 0) {
            Object objOnPause = _handleunrecognizedcharacterescape.onPause();
            if (objOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause = new getAnswerMap() { // from class: o.setHeightRatio
                    @Override // kotlin.getAnswerMap
                    public final Object invoke(Object obj) {
                        return Boolean.valueOf(setAutoStart.write((offset) obj));
                    }
                };
                _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause);
            }
            getanswermap = (getAnswerMap) objOnPause;
        }
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesCompatParcelizer(-1435874229, i, -1, "androidx.compose.material.rememberDrawerState (Drawer.kt:390)");
        }
        Object[] objArr = new Object[0];
        parseManyDecDigits<setBaseColor, offset> parsemanydecdigitsAudioAttributesCompatParcelizer = setBaseColor.INSTANCE.AudioAttributesCompatParcelizer(getanswermap);
        boolean z = true;
        boolean z2 = (((i & 14) ^ 6) > 4 && _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(offsetVar.ordinal())) || (i & 6) == 4;
        if ((((i & 112) ^ 48) <= 32 || !_handleunrecognizedcharacterescape.AudioAttributesCompatParcelizer(getanswermap)) && (i & 48) != 32) {
            z = false;
        }
        Object objOnPause2 = _handleunrecognizedcharacterescape.onPause();
        if ((z2 | z) || objOnPause2 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
            objOnPause2 = new getCreatedOnDateMs() { // from class: o.setIntensity
                @Override // kotlin.getCreatedOnDateMs
                public final Object invoke() {
                    return setAutoStart.AudioAttributesCompatParcelizer(offsetVar, getanswermap);
                }
            };
            _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause2);
        }
        setBaseColor setbasecolor = (setBaseColor) addTimesI.read(objArr, parsemanydecdigitsAudioAttributesCompatParcelizer, (getCreatedOnDateMs) objOnPause2, _handleunrecognizedcharacterescape, 0);
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesImplApi21Parcelizer();
        }
        return setbasecolor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup write(getModuleData getmoduledata, _handleOddName _handleoddname, setBaseColor setbasecolor, boolean z, findAndAddVirtualProperties findandaddvirtualproperties, float f, long j, long j2, long j3, MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody, int i, int i2, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i3) {
        AudioAttributesCompatParcelizer((getModuleData<? super DrawerLayoutLayoutParams, ? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup>) getmoduledata, _handleoddname, setbasecolor, z, findandaddvirtualproperties, f, j, j2, j3, (MagicModuleSubmissionRequestBody<? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup>) magicModuleSubmissionRequestBody, _handleunrecognizedcharacterescape, _appendEscaped.RemoteActionCompatParcelizer(i | 1), i2);
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup write(boolean z, getCreatedOnDateMs getcreatedondatems, getCreatedOnDateMs getcreatedondatems2, long j, int i, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i2) {
        AudioAttributesCompatParcelizer(z, getcreatedondatems, getcreatedondatems2, j, _handleunrecognizedcharacterescape, _appendEscaped.RemoteActionCompatParcelizer(i | 1));
        return getShowPopup.INSTANCE;
    }
}
