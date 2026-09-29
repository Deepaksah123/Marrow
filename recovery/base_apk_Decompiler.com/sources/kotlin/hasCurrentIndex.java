package kotlin;

import android.view.KeyEvent;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.RendererCapabilities;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import com.marrow.data.models.user.NotesDispatchAddressRequestKt;
import kotlin.Metadata;
import kotlin._handleOddName;
import kotlin.hasCurrentIndex;
import org.apache.commons.compress.archivers.cpio.CpioConstants;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000V\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a}\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0011\u0010\u0004\u001a\r\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0002\b\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00052\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\r2\u0011\u0010\u0010\u001a\r\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0002\b\u0006H\u0001¢\u0006\u0002\u0010\u0011\u001aP\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\r0\u00142\u0006\u0010\u000f\u001a\u00020\r2\b\b\u0002\u0010\t\u001a\u00020\n2\u0011\u0010\u0010\u001a\r\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0002\b\u0006H\u0003¢\u0006\u0002\u0010\u0015\u001a^\u0010\u0016\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00052\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\f\u001a\u00020\r2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\r0\u00142\u0011\u0010\u0010\u001a\r\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0002\b\u0006H\u0003¢\u0006\u0002\u0010\u0019\u001a\u001c\u0010\u001a\u001a\u00020\n*\u00020\n2\u0006\u0010\u001b\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\bH\u0002\u001a,\u0010\u001c\u001a\u00020\n*\u00020\n2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001b\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u0018H\u0002\u001a:\u0010\u001f\u001a\u00020\n*\u00020\n2\u0006\u0010\u001b\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u000f\u001a\u00020\r2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\r0\u0014H\u0002\u001a+\u0010 \u001a\u00020\b2\b\b\u0002\u0010!\u001a\u00020\r2\b\b\u0002\u0010\"\u001a\u00020\r2\b\b\u0002\u0010#\u001a\u00020$H\u0001¢\u0006\u0002\u0010%\u001a&\u0010&\u001a\u00020\b2\b\b\u0002\u0010!\u001a\u00020\r2\b\b\u0002\u0010\"\u001a\u00020\r2\b\b\u0002\u0010#\u001a\u00020$H\u0001\u001a\u0013\u0010'\u001a\b\u0012\u0004\u0012\u00020\r0(H\u0003¢\u0006\u0002\u0010)¨\u0006*"}, d2 = {"BasicTooltipBox", "", "positionProvider", "Landroidx/compose/ui/window/PopupPositionProvider;", "tooltip", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", NotesDispatchAddressRequestKt.KEY_STATE, "Landroidx/compose/material3/TooltipState;", "modifier", "Landroidx/compose/ui/Modifier;", "onDismissRequest", "focusable", "", "enableUserInput", "hasAction", "content", "(Landroidx/compose/ui/window/PopupPositionProvider;Lkotlin/jvm/functions/Function2;Landroidx/compose/material3/TooltipState;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;ZZZLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "WrappedAnchor", "forceKeyboardFocusable", "Landroidx/compose/runtime/MutableState;", "(ZLandroidx/compose/material3/TooltipState;Landroidx/compose/runtime/MutableState;ZLandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "TooltipPopup", "scope", "Lkotlinx/coroutines/CoroutineScope;", "(Landroidx/compose/ui/window/PopupPositionProvider;Landroidx/compose/material3/TooltipState;Lkotlin/jvm/functions/Function0;Lkotlinx/coroutines/CoroutineScope;ZLandroidx/compose/runtime/MutableState;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "handleGestures", "enabled", "anchorSemantics", "label", "", "keyboardBehavior", "rememberBasicTooltipState", "initialIsVisible", "isPersistent", "mutatorMutex", "Landroidx/compose/foundation/MutatorMutex;", "(ZZLandroidx/compose/foundation/MutatorMutex;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material3/TooltipState;", "BasicTooltipState", "rememberTouchExplorationOrSwitchAccessServiceState", "Landroidx/compose/runtime/State;", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "material3"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class hasCurrentIndex {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¸\u0006\u0005"}, d2 = {"Lo/StreamConstraintsException$read;", "Lo/_wrapError;", "", "RemoteActionCompatParcelizer", "()V", "o/StreamConstraintsException$read"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class IconCompatParcelizer implements _wrapError {
        final /* synthetic */ compile IconCompatParcelizer;

        public IconCompatParcelizer(compile compileVar) {
            this.IconCompatParcelizer = compileVar;
        }

        @Override // kotlin._wrapError
        public final void RemoteActionCompatParcelizer() {
            this.IconCompatParcelizer.AudioAttributesCompatParcelizer();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:180:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00ff  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void write(final kotlin.DateDeserializersCalendarDeserializer r24, final kotlin.MagicModuleSubmissionRequestBody<? super kotlin._handleUnrecognizedCharacterEscape, ? super java.lang.Integer, kotlin.getShowPopup> r25, final kotlin.compile r26, kotlin._handleOddName r27, kotlin.getCreatedOnDateMs<kotlin.getShowPopup> r28, boolean r29, boolean r30, boolean r31, final kotlin.MagicModuleSubmissionRequestBody<? super kotlin._handleUnrecognizedCharacterEscape, ? super java.lang.Integer, kotlin.getShowPopup> r32, kotlin._handleUnrecognizedCharacterEscape r33, final int r34, final int r35) {
        /*
            Method dump skipped, instruction units count: 802
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.hasCurrentIndex.write(o.DateDeserializersCalendarDeserializer, o.MagicModuleSubmissionRequestBody, o.compile, o._handleOddName, o.getCreatedOnDateMs, boolean, boolean, boolean, o.MagicModuleSubmissionRequestBody, o._handleUnrecognizedCharacterEscape, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:103:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01ad  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final void write(final boolean r16, final kotlin.compile r17, final kotlin.InputAccessor<java.lang.Boolean> r18, final boolean r19, kotlin._handleOddName r20, final kotlin.MagicModuleSubmissionRequestBody<? super kotlin._handleUnrecognizedCharacterEscape, ? super java.lang.Integer, kotlin.getShowPopup> r21, kotlin._handleUnrecognizedCharacterEscape r22, final int r23, final int r24) {
        /*
            Method dump skipped, instruction units count: 463
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.hasCurrentIndex.write(boolean, o.compile, o.InputAccessor, boolean, o._handleOddName, o.MagicModuleSubmissionRequestBody, o._handleUnrecognizedCharacterEscape, int, int):void");
    }

    private static final void write(final DateDeserializersCalendarDeserializer dateDeserializersCalendarDeserializer, final compile compileVar, final getCreatedOnDateMs<getShowPopup> getcreatedondatems, final TopUserCompanion topUserCompanion, final boolean z, final InputAccessor<Boolean> inputAccessor, final MagicModuleSubmissionRequestBody<? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup> magicModuleSubmissionRequestBody, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, final int i) {
        int i2;
        _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescapeWrite = _handleunrecognizedcharacterescape.write(-1413720282);
        if ((i & 6) == 0) {
            i2 = (_handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(dateDeserializersCalendarDeserializer) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(compileVar) : _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(compileVar) ? 32 : 16;
        }
        if ((i & RendererCapabilities.MODE_SUPPORT_MASK) == 0) {
            i2 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(getcreatedondatems) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(topUserCompanion) ? 2048 : 1024;
        }
        if ((i & CpioConstants.C_ISBLK) == 0) {
            i2 |= _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(z) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(inputAccessor) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE;
        }
        if ((1572864 & i) == 0) {
            i2 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(magicModuleSubmissionRequestBody) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if (!_handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer((599187 & i2) != 599186, i2 & 1)) {
            _handleunrecognizedcharacterescapeWrite.onPrepareFromSearch();
        } else {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(-1413720282, i2, -1, "androidx.compose.material3.internal.TooltipPopup (BasicTooltip.kt:169)");
            }
            String str = asString.INSTANCE.read(_handleunrecognizedcharacterescapeWrite, 6);
            boolean z2 = (i2 & 896) == 256;
            boolean z3 = (i2 & 112) == 32 || ((i2 & 64) != 0 && _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(compileVar));
            boolean zIconCompatParcelizer = _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(topUserCompanion);
            boolean z4 = (458752 & i2) == 131072;
            Object objOnPause = _handleunrecognizedcharacterescapeWrite.onPause();
            if ((z3 | z2 | zIconCompatParcelizer | z4) || objOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause = new getCreatedOnDateMs() { // from class: o.startLocation
                    @Override // kotlin.getCreatedOnDateMs
                    public final Object invoke() {
                        return hasCurrentIndex.IconCompatParcelizer(getcreatedondatems, compileVar, topUserCompanion, inputAccessor);
                    }
                };
                _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(objOnPause);
            }
            popOrNull.RemoteActionCompatParcelizer(dateDeserializersCalendarDeserializer, (getCreatedOnDateMs) objOnPause, new withDateFormat(z, false, false, false, 14, (MagicModuleRepositoryImplExternalSyntheticLambda0) null), multiplyFft.AudioAttributesCompatParcelizer(-1287705660, true, new AudioAttributesCompatParcelizer(str, magicModuleSubmissionRequestBody), _handleunrecognizedcharacterescapeWrite, 54), _handleunrecognizedcharacterescapeWrite, (i2 & 14) | 3072, 0);
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        releaseNameCopyBuffer releasenamecopybufferMediaBrowserCompatSearchResultReceiver = _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatSearchResultReceiver();
        if (releasenamecopybufferMediaBrowserCompatSearchResultReceiver != null) {
            releasenamecopybufferMediaBrowserCompatSearchResultReceiver.read(new MagicModuleSubmissionRequestBody() { // from class: o.inArray
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return hasCurrentIndex.write(dateDeserializersCalendarDeserializer, compileVar, getcreatedondatems, topUserCompanion, z, inputAccessor, magicModuleSubmissionRequestBody, i, (_handleUnrecognizedCharacterEscape) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class write extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        int RemoteActionCompatParcelizer;
        final /* synthetic */ compile write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            getYear.IconCompatParcelizer();
            if (this.RemoteActionCompatParcelizer != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            SdkPayloadData.IconCompatParcelizer(obj);
            this.write.RemoteActionCompatParcelizer();
            return getShowPopup.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        write(compile compileVar, SampleVideos<? super write> sampleVideos) {
            super(2, sampleVideos);
            this.write = compileVar;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return new write(this.write, sampleVideos);
        }

        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public final Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((write) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup IconCompatParcelizer(getCreatedOnDateMs getcreatedondatems, compile compileVar, TopUserCompanion topUserCompanion, InputAccessor inputAccessor) {
        if (getcreatedondatems == null) {
            if (compileVar.write()) {
                C0201setMcqCount.IconCompatParcelizer(topUserCompanion, null, null, new write(compileVar, null), 3);
                inputAccessor.write(Boolean.FALSE);
            }
        } else {
            getcreatedondatems.invoke();
        }
        return getShowPopup.INSTANCE;
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AudioAttributesCompatParcelizer implements MagicModuleSubmissionRequestBody<_handleUnrecognizedCharacterEscape, Integer, getShowPopup> {
        final /* synthetic */ String IconCompatParcelizer;
        final /* synthetic */ MagicModuleSubmissionRequestBody<_handleUnrecognizedCharacterEscape, Integer, getShowPopup> write;

        @Override // kotlin.MagicModuleSubmissionRequestBody
        public final /* synthetic */ getShowPopup invoke(_handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, Integer num) {
            read(_handleunrecognizedcharacterescape, num.intValue());
            return getShowPopup.INSTANCE;
        }

        public final void read(_handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
            if (!_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer((i & 3) != 2, i & 1)) {
                _handleunrecognizedcharacterescape.onPrepareFromSearch();
                return;
            }
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(-1287705660, i, -1, "androidx.compose.material3.internal.TooltipPopup.<anonymous> (BasicTooltip.kt:186)");
            }
            _handleOddName.Companion companion = _handleOddName.INSTANCE;
            boolean zAudioAttributesCompatParcelizer = _handleunrecognizedcharacterescape.AudioAttributesCompatParcelizer(this.IconCompatParcelizer);
            final String str = this.IconCompatParcelizer;
            Object objOnPause = _handleunrecognizedcharacterescape.onPause();
            if (zAudioAttributesCompatParcelizer || objOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause = new getAnswerMap() { // from class: o.id
                    @Override // kotlin.getAnswerMap
                    public final Object invoke(Object obj) {
                        return hasCurrentIndex.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(str, (getConfigOverride) obj);
                    }
                };
                _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause);
            }
            _handleOddName _handleoddname = withValueInstantiators.read$default(companion, false, (getAnswerMap) objOnPause, 1, null);
            MagicModuleSubmissionRequestBody<_handleUnrecognizedCharacterEscape, Integer, getShowPopup> magicModuleSubmissionRequestBody = this.write;
            withTypeHandler withtypehandlerWrite = AbsSavedState1.write(_skipWSOrEnd.INSTANCE.MediaBrowserCompatSearchResultReceiver(), false);
            int iAudioAttributesCompatParcelizer = _getBigDecimal.AudioAttributesCompatParcelizer(_handleunrecognizedcharacterescape, 0);
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
            MagicModuleSubmissionRequestBody<getDependencies, Integer, getShowPopup> magicModuleSubmissionRequestBodyAudioAttributesCompatParcelizer = getDependencies.INSTANCE.AudioAttributesCompatParcelizer();
            if (_handleunrecognizedcharacterescape2.getParcelableVolumeInfo() || !toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape2.onPause(), Integer.valueOf(iAudioAttributesCompatParcelizer))) {
                _handleunrecognizedcharacterescape2.RemoteActionCompatParcelizer(Integer.valueOf(iAudioAttributesCompatParcelizer));
                _handleunrecognizedcharacterescape2.read(Integer.valueOf(iAudioAttributesCompatParcelizer), magicModuleSubmissionRequestBodyAudioAttributesCompatParcelizer);
            }
            NumberOutput.write(_handleunrecognizedcharacterescape2, _handleoddnameRemoteActionCompatParcelizer, getDependencies.INSTANCE.MediaBrowserCompatCustomActionResultReceiver());
            setDrawerElevation setdrawerelevation = setDrawerElevation.INSTANCE;
            magicModuleSubmissionRequestBody.invoke(_handleunrecognizedcharacterescape, 0);
            _handleunrecognizedcharacterescape.AudioAttributesImplBaseParcelizer();
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final getShowPopup AudioAttributesCompatParcelizer(String str, getConfigOverride getconfigoverride) {
            MapperBuilder.AudioAttributesCompatParcelizer(getconfigoverride, hasAbstractTypeResolvers.INSTANCE.AudioAttributesCompatParcelizer());
            MapperBuilder.IconCompatParcelizer(getconfigoverride, str);
            return getShowPopup.INSTANCE;
        }

        /* JADX WARN: Multi-variable type inference failed */
        AudioAttributesCompatParcelizer(String str, MagicModuleSubmissionRequestBody<? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup> magicModuleSubmissionRequestBody) {
            this.IconCompatParcelizer = str;
            this.write = magicModuleSubmissionRequestBody;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class read implements PointerInputEventHandler {
        final /* synthetic */ compile RemoteActionCompatParcelizer;

        /* JADX INFO: renamed from: o.hasCurrentIndex$read$5, reason: invalid class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        static final class AnonymousClass5 extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
            final /* synthetic */ compile AudioAttributesCompatParcelizer;
            final /* synthetic */ handleBadMerge IconCompatParcelizer;
            int RemoteActionCompatParcelizer;
            private /* synthetic */ Object read;

            /* JADX INFO: renamed from: o.hasCurrentIndex$read$5$1, reason: invalid class name */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
            static final class AnonymousClass1 extends getTotalSolvedModule implements MagicModuleSubmissionRequestBody<getConstructorDetector, SampleVideos<? super getShowPopup>, Object> {
                long AudioAttributesCompatParcelizer;
                int AudioAttributesImplBaseParcelizer;
                final /* synthetic */ compile IconCompatParcelizer;
                private /* synthetic */ Object MediaBrowserCompatCustomActionResultReceiver;
                Object RemoteActionCompatParcelizer;
                final /* synthetic */ TopUserCompanion read;
                Object write;

                /* JADX WARN: Removed duplicated region for block: B:37:0x00f9  */
                /* JADX WARN: Removed duplicated region for block: B:40:0x00fe A[Catch: all -> 0x0021, TRY_LEAVE, TryCatch #1 {all -> 0x0021, blocks: (B:8:0x001a, B:38:0x00fa, B:40:0x00fe), top: B:49:0x001a }] */
                @Override // kotlin.getMonthName
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object invokeSuspend(java.lang.Object r21) throws java.lang.Throwable {
                    /*
                        Method dump skipped, instruction units count: 277
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: o.hasCurrentIndex.read.AnonymousClass5.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
                }

                /* JADX INFO: renamed from: o.hasCurrentIndex$read$5$1$4, reason: invalid class name */
                @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
                static final class AnonymousClass4 extends getTotalSolvedModule implements MagicModuleSubmissionRequestBody<getConstructorDetector, SampleVideos<? super getArrayBuilders>, Object> {
                    private /* synthetic */ Object IconCompatParcelizer;
                    final /* synthetic */ _shapeForToken RemoteActionCompatParcelizer;
                    int read;

                    @Override // kotlin.getMonthName
                    public final Object invokeSuspend(Object obj) {
                        Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
                        int i = this.read;
                        if (i != 0) {
                            if (i != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            SdkPayloadData.IconCompatParcelizer(obj);
                            return obj;
                        }
                        SdkPayloadData.IconCompatParcelizer(obj);
                        this.read = 1;
                        Object objWrite = isSpanStillValid.write((getConstructorDetector) this.IconCompatParcelizer, this.RemoteActionCompatParcelizer, this);
                        return objWrite == objIconCompatParcelizer ? objIconCompatParcelizer : objWrite;
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass4(_shapeForToken _shapefortoken, SampleVideos<? super AnonymousClass4> sampleVideos) {
                        super(2, sampleVideos);
                        this.RemoteActionCompatParcelizer = _shapefortoken;
                    }

                    @Override // kotlin.getMonthName
                    public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
                        AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.RemoteActionCompatParcelizer, sampleVideos);
                        anonymousClass4.IconCompatParcelizer = obj;
                        return anonymousClass4;
                    }

                    @Override // kotlin.MagicModuleSubmissionRequestBody
                    /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
                    public final Object invoke(getConstructorDetector getconstructordetector, SampleVideos<? super getArrayBuilders> sampleVideos) {
                        return ((AnonymousClass4) create(getconstructordetector, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
                    }
                }

                /* JADX INFO: renamed from: o.hasCurrentIndex$read$5$1$3, reason: invalid class name */
                @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
                static final class AnonymousClass3 extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
                    final /* synthetic */ compile AudioAttributesCompatParcelizer;
                    int RemoteActionCompatParcelizer;
                    final /* synthetic */ getResolutionSize<Boolean> read;
                    Object write;

                    /* JADX WARN: Code restructure failed: missing block: B:19:0x0063, code lost:
                    
                        if (kotlin.VerifyNewNumberRequest.AudioAttributesCompatParcelizer(r7.read, new o.hasCurrentIndex.read.AnonymousClass5.AnonymousClass1.AnonymousClass3.C01121(r7.AudioAttributesCompatParcelizer, null), r7) != r0) goto L20;
                     */
                    @Override // kotlin.getMonthName
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public final java.lang.Object invokeSuspend(java.lang.Object r8) throws java.lang.Throwable {
                        /*
                            r7 = this;
                            java.lang.Object r0 = kotlin.getYear.IconCompatParcelizer()
                            int r1 = r7.RemoteActionCompatParcelizer
                            r2 = 0
                            r3 = 3
                            r4 = 2
                            r5 = 1
                            if (r1 == 0) goto L2a
                            if (r1 == r5) goto L26
                            if (r1 == r4) goto L22
                            if (r1 == r3) goto L1a
                            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                            r7.<init>(r8)
                            throw r7
                        L1a:
                            java.lang.Object r7 = r7.write
                            java.lang.Throwable r7 = (java.lang.Throwable) r7
                            kotlin.SdkPayloadData.IconCompatParcelizer(r8)
                            goto L8d
                        L22:
                            kotlin.SdkPayloadData.IconCompatParcelizer(r8)
                            goto L65
                        L26:
                            kotlin.SdkPayloadData.IconCompatParcelizer(r8)     // Catch: java.lang.Throwable -> L68
                            goto L45
                        L2a:
                            kotlin.SdkPayloadData.IconCompatParcelizer(r8)
                            o.getResolutionSize<java.lang.Boolean> r8 = r7.read     // Catch: java.lang.Throwable -> L68
                            java.lang.Boolean r1 = kotlin.QBankStatsResponse.AudioAttributesCompatParcelizer(r5)     // Catch: java.lang.Throwable -> L68
                            r8.RemoteActionCompatParcelizer(r1)     // Catch: java.lang.Throwable -> L68
                            o.compile r8 = r7.AudioAttributesCompatParcelizer     // Catch: java.lang.Throwable -> L68
                            o.Flow r1 = kotlin.Flow.IconCompatParcelizer     // Catch: java.lang.Throwable -> L68
                            r6 = r7
                            o.SampleVideos r6 = (kotlin.SampleVideos) r6     // Catch: java.lang.Throwable -> L68
                            r7.RemoteActionCompatParcelizer = r5     // Catch: java.lang.Throwable -> L68
                            java.lang.Object r8 = r8.write(r1, r6)     // Catch: java.lang.Throwable -> L68
                            if (r8 == r0) goto L8b
                        L45:
                            o.compile r8 = r7.AudioAttributesCompatParcelizer
                            boolean r8 = r8.write()
                            if (r8 == 0) goto L65
                            o.getResolutionSize<java.lang.Boolean> r8 = r7.read
                            o.NewNumberOtpResendRequest r8 = (kotlin.NewNumberOtpResendRequest) r8
                            o.hasCurrentIndex$read$5$1$3$1 r1 = new o.hasCurrentIndex$read$5$1$3$1
                            o.compile r3 = r7.AudioAttributesCompatParcelizer
                            r1.<init>(r3, r2)
                            o.MagicModuleSubmissionRequestBody r1 = (kotlin.MagicModuleSubmissionRequestBody) r1
                            r2 = r7
                            o.SampleVideos r2 = (kotlin.SampleVideos) r2
                            r7.RemoteActionCompatParcelizer = r4
                            java.lang.Object r7 = kotlin.VerifyNewNumberRequest.AudioAttributesCompatParcelizer(r8, r1, r2)
                            if (r7 == r0) goto L8b
                        L65:
                            o.getShowPopup r7 = kotlin.getShowPopup.INSTANCE
                            return r7
                        L68:
                            r8 = move-exception
                            o.compile r1 = r7.AudioAttributesCompatParcelizer
                            boolean r1 = r1.write()
                            if (r1 == 0) goto L8e
                            o.getResolutionSize<java.lang.Boolean> r1 = r7.read
                            o.NewNumberOtpResendRequest r1 = (kotlin.NewNumberOtpResendRequest) r1
                            o.hasCurrentIndex$read$5$1$3$1 r4 = new o.hasCurrentIndex$read$5$1$3$1
                            o.compile r5 = r7.AudioAttributesCompatParcelizer
                            r4.<init>(r5, r2)
                            o.MagicModuleSubmissionRequestBody r4 = (kotlin.MagicModuleSubmissionRequestBody) r4
                            r2 = r7
                            o.SampleVideos r2 = (kotlin.SampleVideos) r2
                            r7.write = r8
                            r7.RemoteActionCompatParcelizer = r3
                            java.lang.Object r7 = kotlin.VerifyNewNumberRequest.AudioAttributesCompatParcelizer(r1, r4, r2)
                            if (r7 != r0) goto L8c
                        L8b:
                            return r0
                        L8c:
                            r7 = r8
                        L8d:
                            r8 = r7
                        L8e:
                            throw r8
                        */
                        throw new UnsupportedOperationException("Method not decompiled: o.hasCurrentIndex.read.AnonymousClass5.AnonymousClass1.AnonymousClass3.invokeSuspend(java.lang.Object):java.lang.Object");
                    }

                    /* JADX INFO: renamed from: o.hasCurrentIndex$read$5$1$3$1, reason: invalid class name and collision with other inner class name */
                    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "isLongPressed", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
                    static final class C01121 extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<Boolean, SampleVideos<? super getShowPopup>, Object> {
                        /* synthetic */ boolean IconCompatParcelizer;
                        final /* synthetic */ compile read;
                        int write;

                        @Override // kotlin.getMonthName
                        public final Object invokeSuspend(Object obj) {
                            getYear.IconCompatParcelizer();
                            if (this.write != 0) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            SdkPayloadData.IconCompatParcelizer(obj);
                            if (!this.IconCompatParcelizer) {
                                this.read.RemoteActionCompatParcelizer();
                            }
                            return getShowPopup.INSTANCE;
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        C01121(compile compileVar, SampleVideos<? super C01121> sampleVideos) {
                            super(2, sampleVideos);
                            this.read = compileVar;
                        }

                        @Override // kotlin.getMonthName
                        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
                            C01121 c01121 = new C01121(this.read, sampleVideos);
                            c01121.IconCompatParcelizer = ((Boolean) obj).booleanValue();
                            return c01121;
                        }

                        @Override // kotlin.MagicModuleSubmissionRequestBody
                        public final /* synthetic */ Object invoke(Boolean bool, SampleVideos<? super getShowPopup> sampleVideos) {
                            return IconCompatParcelizer(bool.booleanValue(), sampleVideos);
                        }

                        public final Object IconCompatParcelizer(boolean z, SampleVideos<? super getShowPopup> sampleVideos) {
                            return ((C01121) create(Boolean.valueOf(z), sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass3(getResolutionSize<Boolean> getresolutionsize, compile compileVar, SampleVideos<? super AnonymousClass3> sampleVideos) {
                        super(2, sampleVideos);
                        this.read = getresolutionsize;
                        this.AudioAttributesCompatParcelizer = compileVar;
                    }

                    @Override // kotlin.getMonthName
                    public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
                        return new AnonymousClass3(this.read, this.AudioAttributesCompatParcelizer, sampleVideos);
                    }

                    @Override // kotlin.MagicModuleSubmissionRequestBody
                    /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
                    public final Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
                        return ((AnonymousClass3) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(TopUserCompanion topUserCompanion, compile compileVar, SampleVideos<? super AnonymousClass1> sampleVideos) {
                    super(2, sampleVideos);
                    this.read = topUserCompanion;
                    this.IconCompatParcelizer = compileVar;
                }

                @Override // kotlin.getMonthName
                public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.read, this.IconCompatParcelizer, sampleVideos);
                    anonymousClass1.MediaBrowserCompatCustomActionResultReceiver = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.MagicModuleSubmissionRequestBody
                /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
                public final Object invoke(getConstructorDetector getconstructordetector, SampleVideos<? super getShowPopup> sampleVideos) {
                    return ((AnonymousClass1) create(getconstructordetector, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
                }
            }

            @Override // kotlin.getMonthName
            public final Object invokeSuspend(Object obj) {
                Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
                int i = this.RemoteActionCompatParcelizer;
                if (i == 0) {
                    SdkPayloadData.IconCompatParcelizer(obj);
                    TopUserCompanion topUserCompanion = (TopUserCompanion) this.read;
                    this.RemoteActionCompatParcelizer = 1;
                    if (setOnHierarchyChangeListener.IconCompatParcelizer(this.IconCompatParcelizer, new AnonymousClass1(topUserCompanion, this.AudioAttributesCompatParcelizer, null), this) == objIconCompatParcelizer) {
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
            AnonymousClass5(handleBadMerge handlebadmerge, compile compileVar, SampleVideos<? super AnonymousClass5> sampleVideos) {
                super(2, sampleVideos);
                this.IconCompatParcelizer = handlebadmerge;
                this.AudioAttributesCompatParcelizer = compileVar;
            }

            @Override // kotlin.getMonthName
            public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
                AnonymousClass5 anonymousClass5 = new AnonymousClass5(this.IconCompatParcelizer, this.AudioAttributesCompatParcelizer, sampleVideos);
                anonymousClass5.read = obj;
                return anonymousClass5;
            }

            @Override // kotlin.MagicModuleSubmissionRequestBody
            /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
            public final Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
                return ((AnonymousClass5) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
            }
        }

        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
        public final Object invoke(handleBadMerge handlebadmerge, SampleVideos<? super getShowPopup> sampleVideos) {
            Object objIconCompatParcelizer = College.IconCompatParcelizer(new AnonymousClass5(handlebadmerge, this.RemoteActionCompatParcelizer, null), sampleVideos);
            return objIconCompatParcelizer == getYear.IconCompatParcelizer() ? objIconCompatParcelizer : getShowPopup.INSTANCE;
        }

        read(compile compileVar) {
            this.RemoteActionCompatParcelizer = compileVar;
        }
    }

    private static final _handleOddName RemoteActionCompatParcelizer(_handleOddName _handleoddname, boolean z, compile compileVar) {
        return z ? hasSomeOfFeatures.IconCompatParcelizer(hasSomeOfFeatures.IconCompatParcelizer(_handleoddname, compileVar, new read(compileVar)), compileVar, new MediaBrowserCompatCustomActionResultReceiver(compileVar)) : _handleoddname;
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class MediaBrowserCompatCustomActionResultReceiver implements PointerInputEventHandler {
        final /* synthetic */ compile IconCompatParcelizer;

        /* JADX INFO: renamed from: o.hasCurrentIndex$MediaBrowserCompatCustomActionResultReceiver$2, reason: invalid class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        static final class AnonymousClass2 extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
            int AudioAttributesCompatParcelizer;
            private /* synthetic */ Object IconCompatParcelizer;
            final /* synthetic */ handleBadMerge RemoteActionCompatParcelizer;
            final /* synthetic */ compile write;

            /* JADX INFO: renamed from: o.hasCurrentIndex$MediaBrowserCompatCustomActionResultReceiver$2$2, reason: invalid class name and collision with other inner class name */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
            static final class C01102 extends getTotalSolvedModule implements MagicModuleSubmissionRequestBody<getConstructorDetector, SampleVideos<? super getShowPopup>, Object> {
                final /* synthetic */ compile AudioAttributesCompatParcelizer;
                private /* synthetic */ Object IconCompatParcelizer;
                Object RemoteActionCompatParcelizer;
                final /* synthetic */ TopUserCompanion read;
                int write;

                /* JADX WARN: Removed duplicated region for block: B:11:0x0038 A[RETURN] */
                /* JADX WARN: Removed duplicated region for block: B:14:0x0056  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0036 -> B:12:0x0039). Please report as a decompilation issue!!! */
                /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                    jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
                    	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                    	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                    	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                    */
                @Override // kotlin.getMonthName
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object invokeSuspend(java.lang.Object r8) {
                    /*
                        r7 = this;
                        java.lang.Object r0 = kotlin.getYear.IconCompatParcelizer()
                        int r1 = r7.write
                        r2 = 1
                        if (r1 == 0) goto L1f
                        if (r1 != r2) goto L17
                        java.lang.Object r1 = r7.RemoteActionCompatParcelizer
                        o._shapeForToken r1 = (kotlin._shapeForToken) r1
                        java.lang.Object r3 = r7.IconCompatParcelizer
                        o.getConstructorDetector r3 = (kotlin.getConstructorDetector) r3
                        kotlin.SdkPayloadData.IconCompatParcelizer(r8)
                        goto L39
                    L17:
                        java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                        java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                        r7.<init>(r8)
                        throw r7
                    L1f:
                        kotlin.SdkPayloadData.IconCompatParcelizer(r8)
                        java.lang.Object r8 = r7.IconCompatParcelizer
                        o.getConstructorDetector r8 = (kotlin.getConstructorDetector) r8
                        o._shapeForToken r1 = kotlin._shapeForToken.AudioAttributesCompatParcelizer
                        r3 = r8
                    L29:
                        r8 = r7
                        o.SampleVideos r8 = (kotlin.SampleVideos) r8
                        r7.IconCompatParcelizer = r3
                        r7.RemoteActionCompatParcelizer = r1
                        r7.write = r2
                        java.lang.Object r8 = r3.read(r1, r8)
                        if (r8 != r0) goto L39
                        return r0
                    L39:
                        o.DeserializationContext r8 = (kotlin.DeserializationContext) r8
                        java.util.List r4 = r8.AudioAttributesCompatParcelizer()
                        r5 = 0
                        java.lang.Object r4 = r4.get(r5)
                        o.getArrayBuilders r4 = (kotlin.getArrayBuilders) r4
                        int r4 = r4.getMediaBrowserCompatItemReceiver()
                        o.handleWeirdNumberValue$write r5 = kotlin.handleWeirdNumberValue.INSTANCE
                        int r5 = r5.RemoteActionCompatParcelizer()
                        boolean r4 = kotlin.handleWeirdNumberValue.read(r4, r5)
                        if (r4 == 0) goto L29
                        int r8 = r8.getMediaBrowserCompatItemReceiver()
                        o.constructCalendar$IconCompatParcelizer r4 = kotlin.constructCalendar.INSTANCE
                        int r4 = r4.read()
                        boolean r4 = kotlin.constructCalendar.AudioAttributesCompatParcelizer(r8, r4)
                        if (r4 == 0) goto L77
                        o.TopUserCompanion r8 = r7.read
                        o.hasCurrentIndex$MediaBrowserCompatCustomActionResultReceiver$2$2$2 r4 = new o.hasCurrentIndex$MediaBrowserCompatCustomActionResultReceiver$2$2$2
                        o.compile r5 = r7.AudioAttributesCompatParcelizer
                        r6 = 0
                        r4.<init>(r5, r6)
                        o.MagicModuleSubmissionRequestBody r4 = (kotlin.MagicModuleSubmissionRequestBody) r4
                        r5 = 3
                        kotlin.setModifiedEndTimestampMs.AudioAttributesCompatParcelizer(r8, r6, r6, r4, r5)
                        goto L29
                    L77:
                        o.constructCalendar$IconCompatParcelizer r4 = kotlin.constructCalendar.INSTANCE
                        int r4 = r4.AudioAttributesCompatParcelizer()
                        boolean r8 = kotlin.constructCalendar.AudioAttributesCompatParcelizer(r8, r4)
                        if (r8 == 0) goto L29
                        o.compile r8 = r7.AudioAttributesCompatParcelizer
                        r8.RemoteActionCompatParcelizer()
                        goto L29
                    */
                    throw new UnsupportedOperationException("Method not decompiled: o.hasCurrentIndex.MediaBrowserCompatCustomActionResultReceiver.AnonymousClass2.C01102.invokeSuspend(java.lang.Object):java.lang.Object");
                }

                /* JADX INFO: renamed from: o.hasCurrentIndex$MediaBrowserCompatCustomActionResultReceiver$2$2$2, reason: invalid class name and collision with other inner class name */
                @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
                static final class C01112 extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
                    final /* synthetic */ compile IconCompatParcelizer;
                    int write;

                    @Override // kotlin.getMonthName
                    public final Object invokeSuspend(Object obj) {
                        Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
                        int i = this.write;
                        if (i == 0) {
                            SdkPayloadData.IconCompatParcelizer(obj);
                            this.write = 1;
                            if (this.IconCompatParcelizer.write(Flow.AudioAttributesCompatParcelizer, this) == objIconCompatParcelizer) {
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
                    C01112(compile compileVar, SampleVideos<? super C01112> sampleVideos) {
                        super(2, sampleVideos);
                        this.IconCompatParcelizer = compileVar;
                    }

                    @Override // kotlin.getMonthName
                    public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
                        return new C01112(this.IconCompatParcelizer, sampleVideos);
                    }

                    @Override // kotlin.MagicModuleSubmissionRequestBody
                    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
                    public final Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
                        return ((C01112) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C01102(TopUserCompanion topUserCompanion, compile compileVar, SampleVideos<? super C01102> sampleVideos) {
                    super(2, sampleVideos);
                    this.read = topUserCompanion;
                    this.AudioAttributesCompatParcelizer = compileVar;
                }

                @Override // kotlin.getMonthName
                public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
                    C01102 c01102 = new C01102(this.read, this.AudioAttributesCompatParcelizer, sampleVideos);
                    c01102.IconCompatParcelizer = obj;
                    return c01102;
                }

                @Override // kotlin.MagicModuleSubmissionRequestBody
                /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
                public final Object invoke(getConstructorDetector getconstructordetector, SampleVideos<? super getShowPopup> sampleVideos) {
                    return ((C01102) create(getconstructordetector, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
                }
            }

            @Override // kotlin.getMonthName
            public final Object invokeSuspend(Object obj) {
                Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
                int i = this.AudioAttributesCompatParcelizer;
                if (i == 0) {
                    SdkPayloadData.IconCompatParcelizer(obj);
                    TopUserCompanion topUserCompanion = (TopUserCompanion) this.IconCompatParcelizer;
                    this.AudioAttributesCompatParcelizer = 1;
                    if (this.RemoteActionCompatParcelizer.read(new C01102(topUserCompanion, this.write, null), this) == objIconCompatParcelizer) {
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
            AnonymousClass2(handleBadMerge handlebadmerge, compile compileVar, SampleVideos<? super AnonymousClass2> sampleVideos) {
                super(2, sampleVideos);
                this.RemoteActionCompatParcelizer = handlebadmerge;
                this.write = compileVar;
            }

            @Override // kotlin.getMonthName
            public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.RemoteActionCompatParcelizer, this.write, sampleVideos);
                anonymousClass2.IconCompatParcelizer = obj;
                return anonymousClass2;
            }

            @Override // kotlin.MagicModuleSubmissionRequestBody
            /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
            public final Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
                return ((AnonymousClass2) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
            }
        }

        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
        public final Object invoke(handleBadMerge handlebadmerge, SampleVideos<? super getShowPopup> sampleVideos) {
            Object objIconCompatParcelizer = College.IconCompatParcelizer(new AnonymousClass2(handlebadmerge, this.IconCompatParcelizer, null), sampleVideos);
            return objIconCompatParcelizer == getYear.IconCompatParcelizer() ? objIconCompatParcelizer : getShowPopup.INSTANCE;
        }

        MediaBrowserCompatCustomActionResultReceiver(compile compileVar) {
            this.IconCompatParcelizer = compileVar;
        }
    }

    private static final _handleOddName RemoteActionCompatParcelizer(_handleOddName _handleoddname, final String str, boolean z, final compile compileVar, final TopUserCompanion topUserCompanion) {
        return z ? isStructStart.RemoteActionCompatParcelizer(_handleoddname, new getAnswerMap() { // from class: o.asCharArray
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return hasCurrentIndex.IconCompatParcelizer(str, topUserCompanion, compileVar, (getConfigOverride) obj);
            }
        }) : _handleoddname;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup IconCompatParcelizer(String str, final TopUserCompanion topUserCompanion, final compile compileVar, getConfigOverride getconfigoverride) {
        MapperBuilder.AudioAttributesImplApi21Parcelizer(getconfigoverride, str, new getCreatedOnDateMs() { // from class: o.typeDesc
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return Boolean.valueOf(hasCurrentIndex.IconCompatParcelizer(topUserCompanion, compileVar));
            }
        });
        return getShowPopup.INSTANCE;
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class RemoteActionCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        final /* synthetic */ compile AudioAttributesCompatParcelizer;
        int RemoteActionCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.RemoteActionCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.RemoteActionCompatParcelizer = 1;
                if (compile.write$default(this.AudioAttributesCompatParcelizer, null, this, 1, null) == objIconCompatParcelizer) {
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
        RemoteActionCompatParcelizer(compile compileVar, SampleVideos<? super RemoteActionCompatParcelizer> sampleVideos) {
            super(2, sampleVideos);
            this.AudioAttributesCompatParcelizer = compileVar;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return new RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, sampleVideos);
        }

        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((RemoteActionCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean IconCompatParcelizer(TopUserCompanion topUserCompanion, compile compileVar) {
        C0201setMcqCount.IconCompatParcelizer(topUserCompanion, null, null, new RemoteActionCompatParcelizer(compileVar, null), 3);
        return true;
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class MediaBrowserCompatItemReceiver extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        final /* synthetic */ CharsToNameCanonicalizer IconCompatParcelizer;
        int RemoteActionCompatParcelizer;
        final /* synthetic */ compile write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.RemoteActionCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                if (this.IconCompatParcelizer.write()) {
                    this.RemoteActionCompatParcelizer = 1;
                    if (this.write.write(Flow.IconCompatParcelizer, this) == objIconCompatParcelizer) {
                        return objIconCompatParcelizer;
                    }
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            if (this.write.write() && !this.IconCompatParcelizer.write()) {
                this.write.RemoteActionCompatParcelizer();
            }
            return getShowPopup.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        MediaBrowserCompatItemReceiver(CharsToNameCanonicalizer charsToNameCanonicalizer, compile compileVar, SampleVideos<? super MediaBrowserCompatItemReceiver> sampleVideos) {
            super(2, sampleVideos);
            this.IconCompatParcelizer = charsToNameCanonicalizer;
            this.write = compileVar;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return new MediaBrowserCompatItemReceiver(this.IconCompatParcelizer, this.write, sampleVideos);
        }

        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((MediaBrowserCompatItemReceiver) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private static final _handleOddName AudioAttributesCompatParcelizer(_handleOddName _handleoddname, boolean z, final compile compileVar, final TopUserCompanion topUserCompanion, boolean z2, InputAccessor<Boolean> inputAccessor) {
        if (z) {
            return converterInstance.RemoteActionCompatParcelizer(writeRawLong.write(_handleoddname, new getAnswerMap() { // from class: o.inObject
                @Override // kotlin.getAnswerMap
                public final Object invoke(Object obj) {
                    return hasCurrentIndex.read(topUserCompanion, compileVar, (CharsToNameCanonicalizer) obj);
                }
            }), new AudioAttributesImplApi26Parcelizer(compileVar, inputAccessor, z2));
        }
        inputAccessor.write(Boolean.FALSE);
        return _handleoddname;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(TopUserCompanion topUserCompanion, compile compileVar, CharsToNameCanonicalizer charsToNameCanonicalizer) {
        C0201setMcqCount.IconCompatParcelizer(topUserCompanion, null, null, new MediaBrowserCompatItemReceiver(charsToNameCanonicalizer, compileVar, null), 3);
        return getShowPopup.INSTANCE;
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AudioAttributesImplApi26Parcelizer implements getAnswerMap<constructType, Boolean> {
        final /* synthetic */ boolean AudioAttributesCompatParcelizer;
        final /* synthetic */ InputAccessor<Boolean> IconCompatParcelizer;
        final /* synthetic */ compile RemoteActionCompatParcelizer;

        @Override // kotlin.getAnswerMap
        public final /* synthetic */ Boolean invoke(constructType constructtype) {
            return RemoteActionCompatParcelizer(constructtype.getRead());
        }

        public final Boolean RemoteActionCompatParcelizer(KeyEvent keyEvent) {
            boolean zWrite = this.RemoteActionCompatParcelizer.write();
            Boolean bool = Boolean.FALSE;
            if (!zWrite) {
                this.IconCompatParcelizer.write(bool);
            }
            if (!this.AudioAttributesCompatParcelizer || !_throwNotASubtype.read(_throwSubtypeClassNotAllowed.RemoteActionCompatParcelizer(keyEvent), _throwNotASubtype.INSTANCE.read()) || !_quotedString.read(_throwSubtypeClassNotAllowed.IconCompatParcelizer(keyEvent), _quotedString.INSTANCE.onPrepareFromMediaId()) || !this.RemoteActionCompatParcelizer.write()) {
                return bool;
            }
            this.IconCompatParcelizer.write(Boolean.TRUE);
            return Boolean.TRUE;
        }

        AudioAttributesImplApi26Parcelizer(compile compileVar, InputAccessor<Boolean> inputAccessor, boolean z) {
            this.RemoteActionCompatParcelizer = compileVar;
            this.IconCompatParcelizer = inputAccessor;
            this.AudioAttributesCompatParcelizer = z;
        }
    }

    private static final parseDouble<Boolean> write(_handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesCompatParcelizer(1960751094, i, -1, "androidx.compose.material3.internal.rememberTouchExplorationOrSwitchAccessServiceState (BasicTooltip.kt:456)");
        }
        parseDouble<Boolean> parsedoubleAudioAttributesCompatParcelizer = JsonPointerPointerParent.AudioAttributesCompatParcelizer(true, true, false, _handleunrecognizedcharacterescape, 438, 0);
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesImplApi21Parcelizer();
        }
        return parsedoubleAudioAttributesCompatParcelizer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final _wrapError read(compile compileVar, StreamConstraintsException streamConstraintsException) {
        return new IconCompatParcelizer(compileVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(DateDeserializersCalendarDeserializer dateDeserializersCalendarDeserializer, MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody, compile compileVar, _handleOddName _handleoddname, getCreatedOnDateMs getcreatedondatems, boolean z, boolean z2, boolean z3, MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody2, int i, int i2, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i3) {
        write(dateDeserializersCalendarDeserializer, magicModuleSubmissionRequestBody, compileVar, _handleoddname, getcreatedondatems, z, z2, z3, magicModuleSubmissionRequestBody2, _handleunrecognizedcharacterescape, _appendEscaped.RemoteActionCompatParcelizer(i | 1), i2);
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup write(DateDeserializersCalendarDeserializer dateDeserializersCalendarDeserializer, compile compileVar, getCreatedOnDateMs getcreatedondatems, TopUserCompanion topUserCompanion, boolean z, InputAccessor inputAccessor, MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody, int i, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i2) {
        write(dateDeserializersCalendarDeserializer, compileVar, (getCreatedOnDateMs<getShowPopup>) getcreatedondatems, topUserCompanion, z, (InputAccessor<Boolean>) inputAccessor, (MagicModuleSubmissionRequestBody<? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup>) magicModuleSubmissionRequestBody, _handleunrecognizedcharacterescape, _appendEscaped.RemoteActionCompatParcelizer(i | 1));
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup RemoteActionCompatParcelizer(boolean z, compile compileVar, InputAccessor inputAccessor, boolean z2, _handleOddName _handleoddname, MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody, int i, int i2, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i3) {
        write(z, compileVar, (InputAccessor<Boolean>) inputAccessor, z2, _handleoddname, (MagicModuleSubmissionRequestBody<? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup>) magicModuleSubmissionRequestBody, _handleunrecognizedcharacterescape, _appendEscaped.RemoteActionCompatParcelizer(i | 1), i2);
        return getShowPopup.INSTANCE;
    }
}
