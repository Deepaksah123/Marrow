package kotlin;

import com.google.android.exoplayer2.RendererCapabilities;
import kotlin.Metadata;
import kotlin.WindowInsetsCompatImpl30;
import kotlin._skipWSOrEnd;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000R\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u008f\u0001\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u001c\u0010\u0014\u001a\u0018\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00010\u0015¢\u0006\u0002\b\u0017¢\u0006\u0002\b\u0018H\u0007¢\u0006\u0002\u0010\u0019\u001a\u008f\u0001\u0010\u001a\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u001c\u0010\u0014\u001a\u0018\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00010\u0015¢\u0006\u0002\b\u0017¢\u0006\u0002\b\u0018H\u0007¢\u0006\u0002\u0010\u0019\u001a\u008f\u0001\u0010\u001b\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u001c\u0010\u0014\u001a\u0018\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00010\u0015¢\u0006\u0002\b\u0017¢\u0006\u0002\b\u0018H\u0007¢\u0006\u0002\u0010\u0019\u001a\u008f\u0001\u0010\u001c\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u001c\u0010\u0014\u001a\u0018\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00010\u0015¢\u0006\u0002\b\u0017¢\u0006\u0002\b\u0018H\u0007¢\u0006\u0002\u0010\u0019\u001a\u008f\u0001\u0010\u001d\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u001c\u0010\u0014\u001a\u0018\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00010\u0015¢\u0006\u0002\b\u0017¢\u0006\u0002\b\u0018H\u0007¢\u0006\u0002\u0010\u0019¨\u0006\u001e"}, d2 = {"Button", "", "onClick", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "enabled", "", "shape", "Landroidx/compose/ui/graphics/Shape;", "colors", "Landroidx/compose/material3/ButtonColors;", "elevation", "Landroidx/compose/material3/ButtonElevation;", "border", "Landroidx/compose/foundation/BorderStroke;", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/RowScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/ButtonColors;Landroidx/compose/material3/ButtonElevation;Landroidx/compose/foundation/BorderStroke;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "ElevatedButton", "FilledTonalButton", "OutlinedButton", "TextButton", "material3"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class writeEndObject {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:186:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00f8  */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r24v3 */
    /* JADX WARN: Type inference failed for: r24v4, types: [o.hashCode] */
    /* JADX WARN: Type inference failed for: r24v5 */
    /* JADX WARN: Type inference failed for: r9v24 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7, types: [o.hashCode] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void RemoteActionCompatParcelizer(final kotlin.getCreatedOnDateMs<kotlin.getShowPopup> r30, kotlin._handleOddName r31, boolean r32, kotlin.findAndAddVirtualProperties r33, kotlin.writeNull r34, kotlin.writeFieldName r35, kotlin.setUncaughtExceptionHandlerui r36, kotlin.getReturnTransition r37, kotlin.hashCode r38, final kotlin.getModuleData<? super kotlin.getViewLifecycleOwnerLiveData, ? super kotlin._handleUnrecognizedCharacterEscape, ? super java.lang.Integer, kotlin.getShowPopup> r39, kotlin._handleUnrecognizedCharacterEscape r40, final int r41, final int r42) {
        /*
            Method dump skipped, instruction units count: 779
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.writeEndObject.RemoteActionCompatParcelizer(o.getCreatedOnDateMs, o._handleOddName, boolean, o.findAndAddVirtualProperties, o.writeNull, o.writeFieldName, o.setUncaughtExceptionHandlerui, o.getReturnTransition, o.hashCode, o.getModuleData, o._handleUnrecognizedCharacterEscape, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesCompatParcelizer(getConfigOverride getconfigoverride) {
        MapperBuilder.write(getconfigoverride, C0184keyDeserializers.INSTANCE.RemoteActionCompatParcelizer());
        return getShowPopup.INSTANCE;
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class RemoteActionCompatParcelizer implements MagicModuleSubmissionRequestBody<_handleUnrecognizedCharacterEscape, Integer, getShowPopup> {
        final /* synthetic */ long AudioAttributesCompatParcelizer;
        final /* synthetic */ getModuleData<getViewLifecycleOwnerLiveData, _handleUnrecognizedCharacterEscape, Integer, getShowPopup> RemoteActionCompatParcelizer;
        final /* synthetic */ getReturnTransition write;

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
                _validJsonValueList.AudioAttributesCompatParcelizer(-535639973, i, -1, "androidx.compose.material3.Button.<anonymous> (Button.kt:138)");
            }
            long j = this.AudioAttributesCompatParcelizer;
            deserializeWithObjectId mediaDescriptionCompat = getCurrentName.INSTANCE.write(_handleunrecognizedcharacterescape, 6).getMediaDescriptionCompat();
            final getReturnTransition getreturntransition = this.write;
            final getModuleData<getViewLifecycleOwnerLiveData, _handleUnrecognizedCharacterEscape, Integer, getShowPopup> getmoduledata = this.RemoteActionCompatParcelizer;
            SerializableString.RemoteActionCompatParcelizer(j, mediaDescriptionCompat, multiplyFft.AudioAttributesCompatParcelizer(417635459, true, new MagicModuleSubmissionRequestBody<_handleUnrecognizedCharacterEscape, Integer, getShowPopup>() { // from class: o.writeEndObject.RemoteActionCompatParcelizer.4
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final /* synthetic */ getShowPopup invoke(_handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape2, Integer num) {
                    write(_handleunrecognizedcharacterescape2, num.intValue());
                    return getShowPopup.INSTANCE;
                }

                public final void write(_handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape2, int i2) {
                    if (!_handleunrecognizedcharacterescape2.RemoteActionCompatParcelizer((i2 & 3) != 2, i2 & 1)) {
                        _handleunrecognizedcharacterescape2.onPrepareFromSearch();
                        return;
                    }
                    if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                        _validJsonValueList.AudioAttributesCompatParcelizer(417635459, i2, -1, "androidx.compose.material3.Button.<anonymous>.<anonymous> (Button.kt:142)");
                    }
                    _handleOddName _handleoddname = getParentFragment.read(isAdded.AudioAttributesCompatParcelizer(_handleOddName.INSTANCE, writeNumber.IconCompatParcelizer.RemoteActionCompatParcelizer(), writeNumber.IconCompatParcelizer.AudioAttributesCompatParcelizer()), getreturntransition);
                    WindowInsetsCompatImpl30.MediaBrowserCompatItemReceiver mediaBrowserCompatItemReceiver = WindowInsetsCompatImpl30.INSTANCE.read();
                    _skipWSOrEnd.read readVarMediaBrowserCompatCustomActionResultReceiver = _skipWSOrEnd.INSTANCE.MediaBrowserCompatCustomActionResultReceiver();
                    getModuleData<getViewLifecycleOwnerLiveData, _handleUnrecognizedCharacterEscape, Integer, getShowPopup> getmoduledata2 = getmoduledata;
                    withTypeHandler withtypehandlerIconCompatParcelizer = getTag.IconCompatParcelizer(mediaBrowserCompatItemReceiver, readVarMediaBrowserCompatCustomActionResultReceiver, _handleunrecognizedcharacterescape2, 54);
                    int iAudioAttributesCompatParcelizer = _getBigDecimal.AudioAttributesCompatParcelizer(_handleunrecognizedcharacterescape2, 0);
                    _getCharDesc _getchardescHandleMediaPlayPauseIfPendingOnHandler = _handleunrecognizedcharacterescape2.handleMediaPlayPauseIfPendingOnHandler();
                    _handleOddName _handleoddnameRemoteActionCompatParcelizer = _verifyNLZ2.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape2, _handleoddname);
                    getCreatedOnDateMs<getDependencies> getcreatedondatemsIconCompatParcelizer = getDependencies.INSTANCE.IconCompatParcelizer();
                    if (!(_handleunrecognizedcharacterescape2.MediaMetadataCompat() instanceof _closeInput)) {
                        _getBigDecimal.write();
                    }
                    _handleunrecognizedcharacterescape2.onPrepareFromMediaId();
                    if (_handleunrecognizedcharacterescape2.getParcelableVolumeInfo()) {
                        _handleunrecognizedcharacterescape2.read(getcreatedondatemsIconCompatParcelizer);
                    } else {
                        _handleunrecognizedcharacterescape2.onPlayFromUri();
                    }
                    _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape3 = NumberOutput.read(_handleunrecognizedcharacterescape2);
                    NumberOutput.write(_handleunrecognizedcharacterescape3, withtypehandlerIconCompatParcelizer, getDependencies.INSTANCE.AudioAttributesImplBaseParcelizer());
                    NumberOutput.write(_handleunrecognizedcharacterescape3, _getchardescHandleMediaPlayPauseIfPendingOnHandler, getDependencies.INSTANCE.MediaBrowserCompatItemReceiver());
                    MagicModuleSubmissionRequestBody<getDependencies, Integer, getShowPopup> magicModuleSubmissionRequestBodyAudioAttributesCompatParcelizer = getDependencies.INSTANCE.AudioAttributesCompatParcelizer();
                    if (_handleunrecognizedcharacterescape3.getParcelableVolumeInfo() || !toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape3.onPause(), Integer.valueOf(iAudioAttributesCompatParcelizer))) {
                        _handleunrecognizedcharacterescape3.RemoteActionCompatParcelizer(Integer.valueOf(iAudioAttributesCompatParcelizer));
                        _handleunrecognizedcharacterescape3.read(Integer.valueOf(iAudioAttributesCompatParcelizer), magicModuleSubmissionRequestBodyAudioAttributesCompatParcelizer);
                    }
                    NumberOutput.write(_handleunrecognizedcharacterescape3, _handleoddnameRemoteActionCompatParcelizer, getDependencies.INSTANCE.MediaBrowserCompatCustomActionResultReceiver());
                    getmoduledata2.AudioAttributesCompatParcelizer(getView.INSTANCE, _handleunrecognizedcharacterescape2, 6);
                    _handleunrecognizedcharacterescape2.AudioAttributesImplBaseParcelizer();
                    if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                        _validJsonValueList.AudioAttributesImplApi21Parcelizer();
                    }
                }
            }, _handleunrecognizedcharacterescape, 54), _handleunrecognizedcharacterescape, RendererCapabilities.MODE_SUPPORT_MASK);
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        RemoteActionCompatParcelizer(long j, getReturnTransition getreturntransition, getModuleData<? super getViewLifecycleOwnerLiveData, ? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup> getmoduledata) {
            this.AudioAttributesCompatParcelizer = j;
            this.write = getreturntransition;
            this.RemoteActionCompatParcelizer = getmoduledata;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(getCreatedOnDateMs getcreatedondatems, _handleOddName _handleoddname, boolean z, findAndAddVirtualProperties findandaddvirtualproperties, writeNull writenull, writeFieldName writefieldname, setUncaughtExceptionHandlerui setuncaughtexceptionhandlerui, getReturnTransition getreturntransition, hashCode hashcode, getModuleData getmoduledata, int i, int i2, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i3) {
        RemoteActionCompatParcelizer(getcreatedondatems, _handleoddname, z, findandaddvirtualproperties, writenull, writefieldname, setuncaughtexceptionhandlerui, getreturntransition, hashcode, getmoduledata, _handleunrecognizedcharacterescape, _appendEscaped.RemoteActionCompatParcelizer(i | 1), i2);
        return getShowPopup.INSTANCE;
    }
}
