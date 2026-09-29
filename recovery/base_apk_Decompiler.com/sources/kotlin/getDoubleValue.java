package kotlin;

import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.RendererCapabilities;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin._handleOddName;
import kotlin.setLayoutInflater;
import org.apache.commons.compress.archivers.cpio.CpioConstants;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0007\n\u0002\b\u0006\u001a\u0083\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u001c\u0010\u0015\u001a\u0018\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00010\u0016¢\u0006\u0002\b\u0018¢\u0006\u0002\b\u0019H\u0001¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u0082\u0001\u0010\u001c\u001a\u00020\u00012\u0011\u0010\u001d\u001a\r\u0012\u0004\u0012\u00020\u00010\u001e¢\u0006\u0002\b\u00182\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00010\u001e2\u0006\u0010\u0002\u001a\u00020\u00032\u0013\u0010 \u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u001e¢\u0006\u0002\b\u00182\u0013\u0010!\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u001e¢\u0006\u0002\b\u00182\u0006\u0010\"\u001a\u00020\u00062\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010(H\u0001¢\u0006\u0002\u0010)\u001a\u001d\u0010*\u001a\u00020\t2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020,H\u0000¢\u0006\u0002\u0010.\"\u0016\u0010/\u001a\u00020\u0011X\u0080\u0004¢\u0006\n\n\u0002\u00102\u001a\u0004\b0\u00101\"\u0010\u00103\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0004\n\u0002\u00102\"\u0010\u00104\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0004\n\u0002\u00102\"\u0016\u00105\u001a\u00020\u0011X\u0080\u0004¢\u0006\n\n\u0002\u00102\u001a\u0004\b6\u00101\"\u0010\u00107\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0004\n\u0002\u00102\"\u0010\u00108\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0004\n\u0002\u00102\"\u000e\u00109\u001a\u00020:X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010;\u001a\u00020:X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010<\u001a\u00020:X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010=\u001a\u00020:X\u0080T¢\u0006\u0002\n\u0000¨\u0006>²\u0006\n\u0010?\u001a\u00020:X\u008a\u0084\u0002²\u0006\n\u0010@\u001a\u00020:X\u008a\u0084\u0002"}, d2 = {"DropdownMenuContent", "", "modifier", "Landroidx/compose/ui/Modifier;", "expandedState", "Landroidx/compose/animation/core/MutableTransitionState;", "", "transformOriginState", "Landroidx/compose/runtime/MutableState;", "Landroidx/compose/ui/graphics/TransformOrigin;", "scrollState", "Landroidx/compose/foundation/ScrollState;", "shape", "Landroidx/compose/ui/graphics/Shape;", "containerColor", "Landroidx/compose/ui/graphics/Color;", "tonalElevation", "Landroidx/compose/ui/unit/Dp;", "shadowElevation", "border", "Landroidx/compose/foundation/BorderStroke;", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/ColumnScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "DropdownMenuContent-Qj0Zi0g", "(Landroidx/compose/ui/Modifier;Landroidx/compose/animation/core/MutableTransitionState;Landroidx/compose/runtime/MutableState;Landroidx/compose/foundation/ScrollState;Landroidx/compose/ui/graphics/Shape;JFFLandroidx/compose/foundation/BorderStroke;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V", "DropdownMenuItemContent", "text", "Lkotlin/Function0;", "onClick", "leadingIcon", "trailingIcon", "enabled", "colors", "Landroidx/compose/material3/MenuItemColors;", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/material3/MenuItemColors;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;I)V", "calculateTransformOrigin", "anchorBounds", "Landroidx/compose/ui/unit/IntRect;", "menuBounds", "(Landroidx/compose/ui/unit/IntRect;Landroidx/compose/ui/unit/IntRect;)J", "MenuVerticalMargin", "getMenuVerticalMargin", "()F", "F", "MenuListItemContainerHeight", "DropdownMenuItemHorizontalPadding", "DropdownMenuVerticalPadding", "getDropdownMenuVerticalPadding", "DropdownMenuItemDefaultMinWidth", "DropdownMenuItemDefaultMaxWidth", "ExpandedScaleTarget", "", "ClosedScaleTarget", "ExpandedAlphaTarget", "ClosedAlphaTarget", "material3", "scale", "alpha"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class getDoubleValue {
    private static final float AudioAttributesImplBaseParcelizer = assignParameter.IconCompatParcelizer(48.0f);
    private static final float AudioAttributesCompatParcelizer = assignParameter.IconCompatParcelizer(48.0f);
    private static final float IconCompatParcelizer = assignParameter.IconCompatParcelizer(12.0f);
    private static final float write = assignParameter.IconCompatParcelizer(8.0f);
    private static final float read = assignParameter.IconCompatParcelizer(112.0f);
    private static final float RemoteActionCompatParcelizer = assignParameter.IconCompatParcelizer(280.0f);

    public static final void write(final _handleOddName _handleoddname, final setCollapseIcon<Boolean> setcollapseicon, final InputAccessor<findCreatorAnnotation> inputAccessor, final setTranslationY settranslationy, final findAndAddVirtualProperties findandaddvirtualproperties, final long j, final float f, final float f2, final setUncaughtExceptionHandlerui setuncaughtexceptionhandlerui, final getModuleData<? super DrawerLayoutLayoutParams, ? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup> getmoduledata, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, final int i) throws Throwable {
        int i2;
        int i3;
        _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescapeWrite = _handleunrecognizedcharacterescape.write(848986741);
        if ((i & 6) == 0) {
            i2 = (_handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(_handleoddname) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(setcollapseicon) : _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(setcollapseicon) ? 32 : 16;
        }
        if ((i & RendererCapabilities.MODE_SUPPORT_MASK) == 0) {
            i2 |= _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(inputAccessor) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(settranslationy) ? 2048 : 1024;
        }
        if ((i & CpioConstants.C_ISBLK) == 0) {
            i2 |= _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(findandaddvirtualproperties) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(j) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE;
        }
        if ((1572864 & i) == 0) {
            i2 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(f) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((i & 12582912) == 0) {
            i2 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(f2) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i2 |= _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(setuncaughtexceptionhandlerui) ? 67108864 : 33554432;
        }
        if ((i & C.ENCODING_PCM_32BIT) == 0) {
            i2 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(getmoduledata) ? 536870912 : 268435456;
        }
        if (!_handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer((i2 & 306783379) != 306783378, i2 & 1)) {
            _handleunrecognizedcharacterescapeWrite.onPrepareFromSearch();
        } else {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(848986741, i2, -1, "androidx.compose.material3.DropdownMenuContent (Menu.kt:369)");
            }
            setLayoutInflater setlayoutinflaterAudioAttributesCompatParcelizer = setCardElevation.AudioAttributesCompatParcelizer((setCollapseIcon) setcollapseicon, "DropDownMenu", _handleunrecognizedcharacterescapeWrite, setCollapseIcon.write | 48 | ((i2 >> 3) & 14), 0);
            SwitchCompat switchCompatAudioAttributesCompatParcelizer = getTextCharacters.AudioAttributesCompatParcelizer(TreeNode.write, _handleunrecognizedcharacterescapeWrite, 6);
            SwitchCompat switchCompatAudioAttributesCompatParcelizer2 = getTextCharacters.AudioAttributesCompatParcelizer(TreeNode.RemoteActionCompatParcelizer, _handleunrecognizedcharacterescapeWrite, 6);
            IconCompatParcelizer iconCompatParcelizer = new IconCompatParcelizer(switchCompatAudioAttributesCompatParcelizer);
            evictionCount<Float, setHoverListener> evictioncountRemoteActionCompatParcelizer = hitCount.RemoteActionCompatParcelizer(MagicModuleRepositoryImplExternalSyntheticLambda1.INSTANCE);
            boolean zBooleanValue = ((Boolean) setlayoutinflaterAudioAttributesCompatParcelizer.RemoteActionCompatParcelizer()).booleanValue();
            _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(143964305);
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(143964305, 0, -1, "androidx.compose.material3.DropdownMenuContent.<anonymous> (Menu.kt:377)");
            }
            float f3 = zBooleanValue ? 1.0f : 0.8f;
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
            _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatCustomActionResultReceiver();
            Float fValueOf = Float.valueOf(f3);
            boolean zBooleanValue2 = ((Boolean) setlayoutinflaterAudioAttributesCompatParcelizer.AudioAttributesImplApi26Parcelizer()).booleanValue();
            _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(143964305);
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(143964305, 0, -1, "androidx.compose.material3.DropdownMenuContent.<anonymous> (Menu.kt:377)");
            }
            float f4 = zBooleanValue2 ? 1.0f : 0.8f;
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
            _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatCustomActionResultReceiver();
            final parseDouble parsedoubleAudioAttributesCompatParcelizer = setCardElevation.AudioAttributesCompatParcelizer(setlayoutinflaterAudioAttributesCompatParcelizer, fValueOf, Float.valueOf(f4), iconCompatParcelizer.AudioAttributesCompatParcelizer(setlayoutinflaterAudioAttributesCompatParcelizer.AudioAttributesImplBaseParcelizer(), _handleunrecognizedcharacterescapeWrite, 0), evictioncountRemoteActionCompatParcelizer, "FloatAnimation", _handleunrecognizedcharacterescapeWrite, 0);
            AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = new AudioAttributesCompatParcelizer(switchCompatAudioAttributesCompatParcelizer2);
            evictionCount<Float, setHoverListener> evictioncountRemoteActionCompatParcelizer2 = hitCount.RemoteActionCompatParcelizer(MagicModuleRepositoryImplExternalSyntheticLambda1.INSTANCE);
            boolean zBooleanValue3 = ((Boolean) setlayoutinflaterAudioAttributesCompatParcelizer.RemoteActionCompatParcelizer()).booleanValue();
            _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(892761509);
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(892761509, 0, -1, "androidx.compose.material3.DropdownMenuContent.<anonymous> (Menu.kt:382)");
            }
            float f5 = zBooleanValue3 ? 1.0f : 0.0f;
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
            _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatCustomActionResultReceiver();
            boolean zBooleanValue4 = ((Boolean) setlayoutinflaterAudioAttributesCompatParcelizer.AudioAttributesImplApi26Parcelizer()).booleanValue();
            _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(892761509);
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(892761509, 0, -1, "androidx.compose.material3.DropdownMenuContent.<anonymous> (Menu.kt:382)");
            }
            float f6 = zBooleanValue4 ? 1.0f : 0.0f;
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
            _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatCustomActionResultReceiver();
            final parseDouble parsedoubleAudioAttributesCompatParcelizer2 = setCardElevation.AudioAttributesCompatParcelizer(setlayoutinflaterAudioAttributesCompatParcelizer, Float.valueOf(f5), Float.valueOf(f6), audioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(setlayoutinflaterAudioAttributesCompatParcelizer.AudioAttributesImplBaseParcelizer(), _handleunrecognizedcharacterescapeWrite, 0), evictioncountRemoteActionCompatParcelizer2, "FloatAnimation", _handleunrecognizedcharacterescapeWrite, 0);
            final boolean zBooleanValue5 = ((Boolean) _handleunrecognizedcharacterescapeWrite.write(JsonDeserialize.AudioAttributesCompatParcelizer())).booleanValue();
            _handleOddName.Companion companion = _handleOddName.INSTANCE;
            boolean zAudioAttributesCompatParcelizer = _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(zBooleanValue5);
            boolean zAudioAttributesCompatParcelizer2 = _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(parsedoubleAudioAttributesCompatParcelizer);
            boolean z = (i2 & 112) == 32 || ((i2 & 64) != 0 && _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(setcollapseicon));
            boolean zAudioAttributesCompatParcelizer3 = _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(parsedoubleAudioAttributesCompatParcelizer2);
            boolean z2 = (i2 & 896) == 256;
            Object objOnPause = _handleunrecognizedcharacterescapeWrite.onPause();
            if (((zAudioAttributesCompatParcelizer | zAudioAttributesCompatParcelizer2 | z | zAudioAttributesCompatParcelizer3) || z2) || objOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                i3 = i2;
                getAnswerMap getanswermap = new getAnswerMap() { // from class: o.getNumberValueDeferred
                    @Override // kotlin.getAnswerMap
                    public final Object invoke(Object obj) {
                        return getDoubleValue.read(zBooleanValue5, setcollapseicon, inputAccessor, parsedoubleAudioAttributesCompatParcelizer, parsedoubleAudioAttributesCompatParcelizer2, (validateAppend) obj);
                    }
                };
                _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(getanswermap);
                objOnPause = getanswermap;
            } else {
                i3 = i2;
            }
            int i4 = i3 >> 9;
            int i5 = i3 >> 6;
            JsonParserFeature.RemoteActionCompatParcelizer(expand.IconCompatParcelizer(companion, (getAnswerMap) objOnPause), findandaddvirtualproperties, j, 0L, f, f2, setuncaughtexceptionhandlerui, multiplyFft.AudioAttributesCompatParcelizer(-1463404422, true, new write(_handleoddname, settranslationy, getmoduledata), _handleunrecognizedcharacterescapeWrite, 54), _handleunrecognizedcharacterescapeWrite, (i4 & 112) | 12582912 | (i4 & 896) | (57344 & i5) | (458752 & i5) | (i5 & 3670016), 8);
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        releaseNameCopyBuffer releasenamecopybufferMediaBrowserCompatSearchResultReceiver = _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatSearchResultReceiver();
        if (releasenamecopybufferMediaBrowserCompatSearchResultReceiver != null) {
            releasenamecopybufferMediaBrowserCompatSearchResultReceiver.read(new MagicModuleSubmissionRequestBody() { // from class: o.getObjectId
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return getDoubleValue.read(_handleoddname, setcollapseicon, inputAccessor, settranslationy, findandaddvirtualproperties, j, f, f2, setuncaughtexceptionhandlerui, getmoduledata, i, (_handleUnrecognizedCharacterEscape) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class IconCompatParcelizer implements getModuleData<setLayoutInflater.write<Boolean>, _handleUnrecognizedCharacterEscape, Integer, SwitchCompat<Float>> {
        final /* synthetic */ SwitchCompat<Float> read;

        @Override // kotlin.getModuleData
        public final /* bridge */ /* synthetic */ SwitchCompat<Float> AudioAttributesCompatParcelizer(setLayoutInflater.write<Boolean> writeVar, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, Integer num) {
            return AudioAttributesCompatParcelizer(writeVar, _handleunrecognizedcharacterescape, num.intValue());
        }

        public final SwitchCompat<Float> AudioAttributesCompatParcelizer(setLayoutInflater.write<Boolean> writeVar, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
            _handleunrecognizedcharacterescape.IconCompatParcelizer(-745957716);
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(-745957716, i, -1, "androidx.compose.material3.DropdownMenuContent.<anonymous> (Menu.kt:376)");
            }
            SwitchCompat<Float> switchCompat = this.read;
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
            _handleunrecognizedcharacterescape.MediaBrowserCompatCustomActionResultReceiver();
            return switchCompat;
        }

        IconCompatParcelizer(SwitchCompat<Float> switchCompat) {
            this.read = switchCompat;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AudioAttributesCompatParcelizer implements getModuleData<setLayoutInflater.write<Boolean>, _handleUnrecognizedCharacterEscape, Integer, SwitchCompat<Float>> {
        final /* synthetic */ SwitchCompat<Float> write;

        @Override // kotlin.getModuleData
        public final /* synthetic */ SwitchCompat<Float> AudioAttributesCompatParcelizer(setLayoutInflater.write<Boolean> writeVar, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, Integer num) {
            return IconCompatParcelizer(writeVar, _handleunrecognizedcharacterescape, num.intValue());
        }

        public final SwitchCompat<Float> IconCompatParcelizer(setLayoutInflater.write<Boolean> writeVar, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
            _handleunrecognizedcharacterescape.IconCompatParcelizer(2839488);
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(2839488, i, -1, "androidx.compose.material3.DropdownMenuContent.<anonymous> (Menu.kt:381)");
            }
            SwitchCompat<Float> switchCompat = this.write;
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
            _handleunrecognizedcharacterescape.MediaBrowserCompatCustomActionResultReceiver();
            return switchCompat;
        }

        AudioAttributesCompatParcelizer(SwitchCompat<Float> switchCompat) {
            this.write = switchCompat;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final getShowPopup read(boolean z, setCollapseIcon setcollapseicon, InputAccessor inputAccessor, parseDouble parsedouble, parseDouble parsedouble2, validateAppend validateappend) {
        float fAudioAttributesCompatParcelizer;
        float fAudioAttributesCompatParcelizer2 = 0.8f;
        float fIconCompatParcelizer = 1.0f;
        if (!z) {
            fAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(parsedouble);
        } else {
            fAudioAttributesCompatParcelizer = ((Boolean) setcollapseicon.AudioAttributesCompatParcelizer()).booleanValue() ? 1.0f : 0.8f;
        }
        validateappend.MediaBrowserCompatSearchResultReceiver(fAudioAttributesCompatParcelizer);
        if (!z) {
            fAudioAttributesCompatParcelizer2 = AudioAttributesCompatParcelizer(parsedouble);
        } else if (((Boolean) setcollapseicon.AudioAttributesCompatParcelizer()).booleanValue()) {
            fAudioAttributesCompatParcelizer2 = 1.0f;
        }
        validateappend.MediaDescriptionCompat(fAudioAttributesCompatParcelizer2);
        if (!z) {
            fIconCompatParcelizer = IconCompatParcelizer(parsedouble2);
        } else if (!((Boolean) setcollapseicon.AudioAttributesCompatParcelizer()).booleanValue()) {
            fIconCompatParcelizer = BitmapDescriptorFactory.HUE_RED;
        }
        validateappend.MediaBrowserCompatItemReceiver(fIconCompatParcelizer);
        validateappend.MediaBrowserCompatCustomActionResultReceiver(((findCreatorAnnotation) inputAccessor.getRemoteActionCompatParcelizer()).getRead());
        return getShowPopup.INSTANCE;
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class write implements MagicModuleSubmissionRequestBody<_handleUnrecognizedCharacterEscape, Integer, getShowPopup> {
        final /* synthetic */ getModuleData<DrawerLayoutLayoutParams, _handleUnrecognizedCharacterEscape, Integer, getShowPopup> IconCompatParcelizer;
        final /* synthetic */ _handleOddName read;
        final /* synthetic */ setTranslationY write;

        @Override // kotlin.MagicModuleSubmissionRequestBody
        public final /* synthetic */ getShowPopup invoke(_handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, Integer num) {
            IconCompatParcelizer(_handleunrecognizedcharacterescape, num.intValue());
            return getShowPopup.INSTANCE;
        }

        public final void IconCompatParcelizer(_handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
            if (!_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer((i & 3) != 2, i & 1)) {
                _handleunrecognizedcharacterescape.onPrepareFromSearch();
                return;
            }
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(-1463404422, i, -1, "androidx.compose.material3.DropdownMenuContent.<anonymous> (Menu.kt:406)");
            }
            _handleOddName _handleoddnameIconCompatParcelizer = setVerticalAlign.IconCompatParcelizer(getAllowEnterTransitionOverlap.AudioAttributesCompatParcelizer(getParentFragment.write$default(this.read, BitmapDescriptorFactory.HUE_RED, getDoubleValue.IconCompatParcelizer(), 1, null), dump.read), this.write, false, null, false, 14, null);
            getModuleData<DrawerLayoutLayoutParams, _handleUnrecognizedCharacterEscape, Integer, getShowPopup> getmoduledata = this.IconCompatParcelizer;
            withTypeHandler withtypehandler = setValue.read(WindowInsetsCompatImpl30.INSTANCE.MediaBrowserCompatCustomActionResultReceiver(), _skipWSOrEnd.INSTANCE.RatingCompat(), _handleunrecognizedcharacterescape, 0);
            int iAudioAttributesCompatParcelizer = _getBigDecimal.AudioAttributesCompatParcelizer(_handleunrecognizedcharacterescape, 0);
            _getCharDesc _getchardescHandleMediaPlayPauseIfPendingOnHandler = _handleunrecognizedcharacterescape.handleMediaPlayPauseIfPendingOnHandler();
            _handleOddName _handleoddnameRemoteActionCompatParcelizer = _verifyNLZ2.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape, _handleoddnameIconCompatParcelizer);
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

        /* JADX WARN: Multi-variable type inference failed */
        write(_handleOddName _handleoddname, setTranslationY settranslationy, getModuleData<? super DrawerLayoutLayoutParams, ? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup> getmoduledata) {
            this.read = _handleoddname;
            this.write = settranslationy;
            this.IconCompatParcelizer = getmoduledata;
        }
    }

    public static final void IconCompatParcelizer(final MagicModuleSubmissionRequestBody<? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup> magicModuleSubmissionRequestBody, final getCreatedOnDateMs<getShowPopup> getcreatedondatems, final _handleOddName _handleoddname, final MagicModuleSubmissionRequestBody<? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup> magicModuleSubmissionRequestBody2, final MagicModuleSubmissionRequestBody<? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup> magicModuleSubmissionRequestBody3, final boolean z, final getFloatValue getfloatvalue, final getReturnTransition getreturntransition, final hashCode hashcode, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, final int i) {
        int i2;
        _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescapeWrite = _handleunrecognizedcharacterescape.write(-1325192924);
        if ((i & 6) == 0) {
            i2 = (_handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(magicModuleSubmissionRequestBody) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(getcreatedondatems) ? 32 : 16;
        }
        if ((i & RendererCapabilities.MODE_SUPPORT_MASK) == 0) {
            i2 |= _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(_handleoddname) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(magicModuleSubmissionRequestBody2) ? 2048 : 1024;
        }
        if ((i & CpioConstants.C_ISBLK) == 0) {
            i2 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(magicModuleSubmissionRequestBody3) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(z) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE;
        }
        if ((1572864 & i) == 0) {
            i2 |= _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(getfloatvalue) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(getreturntransition) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(hashcode) ? 67108864 : 33554432;
        }
        if (!_handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer((38347923 & i2) != 38347922, i2 & 1)) {
            _handleunrecognizedcharacterescapeWrite.onPrepareFromSearch();
        } else {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(-1325192924, i2, -1, "androidx.compose.material3.DropdownMenuItemContent (Menu.kt:428)");
            }
            _handleOddName _handleoddname2 = getParentFragment.read(isAdded.RemoteActionCompatParcelizer$default(isAdded.RemoteActionCompatParcelizer$default(getLocalSavedStateRegistryOwner.IconCompatParcelizer$default(_handleoddname, hashcode, hasTextCharacters.write$default(true, BitmapDescriptorFactory.HUE_RED, 0L, 6, null), z, null, null, getcreatedondatems, 24, null), BitmapDescriptorFactory.HUE_RED, 1, null), read, AudioAttributesCompatParcelizer, RemoteActionCompatParcelizer, BitmapDescriptorFactory.HUE_RED, 8, null), getreturntransition);
            withTypeHandler withtypehandlerIconCompatParcelizer = getTag.IconCompatParcelizer(WindowInsetsCompatImpl30.INSTANCE.AudioAttributesImplApi21Parcelizer(), _skipWSOrEnd.INSTANCE.MediaBrowserCompatCustomActionResultReceiver(), _handleunrecognizedcharacterescapeWrite, 48);
            int iAudioAttributesCompatParcelizer = _getBigDecimal.AudioAttributesCompatParcelizer(_handleunrecognizedcharacterescapeWrite, 0);
            _getCharDesc _getchardescHandleMediaPlayPauseIfPendingOnHandler = _handleunrecognizedcharacterescapeWrite.handleMediaPlayPauseIfPendingOnHandler();
            _handleOddName _handleoddnameRemoteActionCompatParcelizer = _verifyNLZ2.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, _handleoddname2);
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
            MagicModuleSubmissionRequestBody<getDependencies, Integer, getShowPopup> magicModuleSubmissionRequestBodyAudioAttributesCompatParcelizer = getDependencies.INSTANCE.AudioAttributesCompatParcelizer();
            if (_handleunrecognizedcharacterescape2.getParcelableVolumeInfo() || !toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape2.onPause(), Integer.valueOf(iAudioAttributesCompatParcelizer))) {
                _handleunrecognizedcharacterescape2.RemoteActionCompatParcelizer(Integer.valueOf(iAudioAttributesCompatParcelizer));
                _handleunrecognizedcharacterescape2.read(Integer.valueOf(iAudioAttributesCompatParcelizer), magicModuleSubmissionRequestBodyAudioAttributesCompatParcelizer);
            }
            NumberOutput.write(_handleunrecognizedcharacterescape2, _handleoddnameRemoteActionCompatParcelizer, getDependencies.INSTANCE.MediaBrowserCompatCustomActionResultReceiver());
            C0208streamReadConstraints.read(getCurrentName.INSTANCE.write(_handleunrecognizedcharacterescapeWrite, 6).getMediaDescriptionCompat(), multiplyFft.AudioAttributesCompatParcelizer(865999929, true, new RemoteActionCompatParcelizer(magicModuleSubmissionRequestBody2, getfloatvalue, z, magicModuleSubmissionRequestBody3, getView.INSTANCE, magicModuleSubmissionRequestBody), _handleunrecognizedcharacterescapeWrite, 54), _handleunrecognizedcharacterescapeWrite, 48);
            _handleunrecognizedcharacterescapeWrite.AudioAttributesImplBaseParcelizer();
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        releaseNameCopyBuffer releasenamecopybufferMediaBrowserCompatSearchResultReceiver = _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatSearchResultReceiver();
        if (releasenamecopybufferMediaBrowserCompatSearchResultReceiver != null) {
            releasenamecopybufferMediaBrowserCompatSearchResultReceiver.read(new MagicModuleSubmissionRequestBody() { // from class: o.getEmbeddedObject
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return getDoubleValue.IconCompatParcelizer(magicModuleSubmissionRequestBody, getcreatedondatems, _handleoddname, magicModuleSubmissionRequestBody2, magicModuleSubmissionRequestBody3, z, getfloatvalue, getreturntransition, hashcode, i, (_handleUnrecognizedCharacterEscape) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class RemoteActionCompatParcelizer implements MagicModuleSubmissionRequestBody<_handleUnrecognizedCharacterEscape, Integer, getShowPopup> {
        final /* synthetic */ getViewLifecycleOwnerLiveData AudioAttributesCompatParcelizer;
        final /* synthetic */ MagicModuleSubmissionRequestBody<_handleUnrecognizedCharacterEscape, Integer, getShowPopup> AudioAttributesImplBaseParcelizer;
        final /* synthetic */ MagicModuleSubmissionRequestBody<_handleUnrecognizedCharacterEscape, Integer, getShowPopup> IconCompatParcelizer;
        final /* synthetic */ MagicModuleSubmissionRequestBody<_handleUnrecognizedCharacterEscape, Integer, getShowPopup> RemoteActionCompatParcelizer;
        final /* synthetic */ getFloatValue read;
        final /* synthetic */ boolean write;

        @Override // kotlin.MagicModuleSubmissionRequestBody
        public final /* synthetic */ getShowPopup invoke(_handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, Integer num) {
            IconCompatParcelizer(_handleunrecognizedcharacterescape, num.intValue());
            return getShowPopup.INSTANCE;
        }

        public final void IconCompatParcelizer(_handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
            if (!_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer((i & 3) != 2, i & 1)) {
                _handleunrecognizedcharacterescape.onPrepareFromSearch();
                return;
            }
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(865999929, i, -1, "androidx.compose.material3.DropdownMenuItemContent.<anonymous>.<anonymous> (Menu.kt:450)");
            }
            if (this.IconCompatParcelizer != null) {
                _handleunrecognizedcharacterescape.IconCompatParcelizer(-864613220);
                ContentReference<switchToNext> contentReferenceAudioAttributesCompatParcelizer = writeTypeSuffix.IconCompatParcelizer().AudioAttributesCompatParcelizer(switchToNext.write(this.read.IconCompatParcelizer(this.write)));
                final MagicModuleSubmissionRequestBody<_handleUnrecognizedCharacterEscape, Integer, getShowPopup> magicModuleSubmissionRequestBody = this.IconCompatParcelizer;
                resetAsNaN.write(contentReferenceAudioAttributesCompatParcelizer, multiplyFft.AudioAttributesCompatParcelizer(1241781204, true, new MagicModuleSubmissionRequestBody<_handleUnrecognizedCharacterEscape, Integer, getShowPopup>() { // from class: o.getDoubleValue.RemoteActionCompatParcelizer.1
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
                            _validJsonValueList.AudioAttributesCompatParcelizer(1241781204, i2, -1, "androidx.compose.material3.DropdownMenuItemContent.<anonymous>.<anonymous>.<anonymous> (Menu.kt:454)");
                        }
                        _handleOddName _handleoddnameAudioAttributesCompatParcelizer$default = isAdded.AudioAttributesCompatParcelizer$default(_handleOddName.INSTANCE, mappedFeature.INSTANCE.AudioAttributesImplApi26Parcelizer(), BitmapDescriptorFactory.HUE_RED, 2, (Object) null);
                        MagicModuleSubmissionRequestBody<_handleUnrecognizedCharacterEscape, Integer, getShowPopup> magicModuleSubmissionRequestBody2 = magicModuleSubmissionRequestBody;
                        withTypeHandler withtypehandlerWrite = AbsSavedState1.write(_skipWSOrEnd.INSTANCE.MediaBrowserCompatSearchResultReceiver(), false);
                        int iAudioAttributesCompatParcelizer = _getBigDecimal.AudioAttributesCompatParcelizer(_handleunrecognizedcharacterescape2, 0);
                        _getCharDesc _getchardescHandleMediaPlayPauseIfPendingOnHandler = _handleunrecognizedcharacterescape2.handleMediaPlayPauseIfPendingOnHandler();
                        _handleOddName _handleoddnameRemoteActionCompatParcelizer = _verifyNLZ2.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape2, _handleoddnameAudioAttributesCompatParcelizer$default);
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
                        NumberOutput.write(_handleunrecognizedcharacterescape3, withtypehandlerWrite, getDependencies.INSTANCE.AudioAttributesImplBaseParcelizer());
                        NumberOutput.write(_handleunrecognizedcharacterescape3, _getchardescHandleMediaPlayPauseIfPendingOnHandler, getDependencies.INSTANCE.MediaBrowserCompatItemReceiver());
                        MagicModuleSubmissionRequestBody<getDependencies, Integer, getShowPopup> magicModuleSubmissionRequestBodyAudioAttributesCompatParcelizer = getDependencies.INSTANCE.AudioAttributesCompatParcelizer();
                        if (_handleunrecognizedcharacterescape3.getParcelableVolumeInfo() || !toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape3.onPause(), Integer.valueOf(iAudioAttributesCompatParcelizer))) {
                            _handleunrecognizedcharacterescape3.RemoteActionCompatParcelizer(Integer.valueOf(iAudioAttributesCompatParcelizer));
                            _handleunrecognizedcharacterescape3.read(Integer.valueOf(iAudioAttributesCompatParcelizer), magicModuleSubmissionRequestBodyAudioAttributesCompatParcelizer);
                        }
                        NumberOutput.write(_handleunrecognizedcharacterescape3, _handleoddnameRemoteActionCompatParcelizer, getDependencies.INSTANCE.MediaBrowserCompatCustomActionResultReceiver());
                        setDrawerElevation setdrawerelevation = setDrawerElevation.INSTANCE;
                        magicModuleSubmissionRequestBody2.invoke(_handleunrecognizedcharacterescape2, 0);
                        _handleunrecognizedcharacterescape2.AudioAttributesImplBaseParcelizer();
                        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                            _validJsonValueList.AudioAttributesImplApi21Parcelizer();
                        }
                    }
                }, _handleunrecognizedcharacterescape, 54), _handleunrecognizedcharacterescape, ContentReference.write | 48);
                _handleunrecognizedcharacterescape.MediaBrowserCompatCustomActionResultReceiver();
            } else {
                _handleunrecognizedcharacterescape.IconCompatParcelizer(-864293207);
                _handleunrecognizedcharacterescape.MediaBrowserCompatCustomActionResultReceiver();
            }
            ContentReference<switchToNext> contentReferenceAudioAttributesCompatParcelizer2 = writeTypeSuffix.IconCompatParcelizer().AudioAttributesCompatParcelizer(switchToNext.write(this.read.AudioAttributesCompatParcelizer(this.write)));
            final getViewLifecycleOwnerLiveData getviewlifecycleownerlivedata = this.AudioAttributesCompatParcelizer;
            final MagicModuleSubmissionRequestBody<_handleUnrecognizedCharacterEscape, Integer, getShowPopup> magicModuleSubmissionRequestBody2 = this.IconCompatParcelizer;
            final MagicModuleSubmissionRequestBody<_handleUnrecognizedCharacterEscape, Integer, getShowPopup> magicModuleSubmissionRequestBody3 = this.AudioAttributesImplBaseParcelizer;
            final MagicModuleSubmissionRequestBody<_handleUnrecognizedCharacterEscape, Integer, getShowPopup> magicModuleSubmissionRequestBody4 = this.RemoteActionCompatParcelizer;
            resetAsNaN.write(contentReferenceAudioAttributesCompatParcelizer2, multiplyFft.AudioAttributesCompatParcelizer(-893579015, true, new MagicModuleSubmissionRequestBody<_handleUnrecognizedCharacterEscape, Integer, getShowPopup>() { // from class: o.getDoubleValue.RemoteActionCompatParcelizer.5
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final /* synthetic */ getShowPopup invoke(_handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape2, Integer num) {
                    RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape2, num.intValue());
                    return getShowPopup.INSTANCE;
                }

                public final void RemoteActionCompatParcelizer(_handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape2, int i2) {
                    float fIconCompatParcelizer;
                    float fIconCompatParcelizer2;
                    if (!_handleunrecognizedcharacterescape2.RemoteActionCompatParcelizer((i2 & 3) != 2, i2 & 1)) {
                        _handleunrecognizedcharacterescape2.onPrepareFromSearch();
                        return;
                    }
                    if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                        _validJsonValueList.AudioAttributesCompatParcelizer(-893579015, i2, -1, "androidx.compose.material3.DropdownMenuItemContent.<anonymous>.<anonymous>.<anonymous> (Menu.kt:460)");
                    }
                    _handleOddName _handleoddnameRemoteActionCompatParcelizer$default = getViewLifecycleOwnerLiveData.RemoteActionCompatParcelizer$default(getviewlifecycleownerlivedata, _handleOddName.INSTANCE, 1.0f, false, 2, null);
                    if (magicModuleSubmissionRequestBody2 != null) {
                        fIconCompatParcelizer = getDoubleValue.IconCompatParcelizer;
                    } else {
                        fIconCompatParcelizer = assignParameter.IconCompatParcelizer(BitmapDescriptorFactory.HUE_RED);
                    }
                    float f = fIconCompatParcelizer;
                    if (magicModuleSubmissionRequestBody3 != null) {
                        fIconCompatParcelizer2 = getDoubleValue.IconCompatParcelizer;
                    } else {
                        fIconCompatParcelizer2 = assignParameter.IconCompatParcelizer(BitmapDescriptorFactory.HUE_RED);
                    }
                    _handleOddName _handleoddnameAudioAttributesCompatParcelizer$default = getParentFragment.AudioAttributesCompatParcelizer$default(_handleoddnameRemoteActionCompatParcelizer$default, f, BitmapDescriptorFactory.HUE_RED, fIconCompatParcelizer2, BitmapDescriptorFactory.HUE_RED, 10, null);
                    MagicModuleSubmissionRequestBody<_handleUnrecognizedCharacterEscape, Integer, getShowPopup> magicModuleSubmissionRequestBody5 = magicModuleSubmissionRequestBody4;
                    withTypeHandler withtypehandlerWrite = AbsSavedState1.write(_skipWSOrEnd.INSTANCE.MediaBrowserCompatSearchResultReceiver(), false);
                    int iAudioAttributesCompatParcelizer = _getBigDecimal.AudioAttributesCompatParcelizer(_handleunrecognizedcharacterescape2, 0);
                    _getCharDesc _getchardescHandleMediaPlayPauseIfPendingOnHandler = _handleunrecognizedcharacterescape2.handleMediaPlayPauseIfPendingOnHandler();
                    _handleOddName _handleoddnameRemoteActionCompatParcelizer = _verifyNLZ2.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape2, _handleoddnameAudioAttributesCompatParcelizer$default);
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
                    NumberOutput.write(_handleunrecognizedcharacterescape3, withtypehandlerWrite, getDependencies.INSTANCE.AudioAttributesImplBaseParcelizer());
                    NumberOutput.write(_handleunrecognizedcharacterescape3, _getchardescHandleMediaPlayPauseIfPendingOnHandler, getDependencies.INSTANCE.MediaBrowserCompatItemReceiver());
                    MagicModuleSubmissionRequestBody<getDependencies, Integer, getShowPopup> magicModuleSubmissionRequestBodyAudioAttributesCompatParcelizer = getDependencies.INSTANCE.AudioAttributesCompatParcelizer();
                    if (_handleunrecognizedcharacterescape3.getParcelableVolumeInfo() || !toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape3.onPause(), Integer.valueOf(iAudioAttributesCompatParcelizer))) {
                        _handleunrecognizedcharacterescape3.RemoteActionCompatParcelizer(Integer.valueOf(iAudioAttributesCompatParcelizer));
                        _handleunrecognizedcharacterescape3.read(Integer.valueOf(iAudioAttributesCompatParcelizer), magicModuleSubmissionRequestBodyAudioAttributesCompatParcelizer);
                    }
                    NumberOutput.write(_handleunrecognizedcharacterescape3, _handleoddnameRemoteActionCompatParcelizer, getDependencies.INSTANCE.MediaBrowserCompatCustomActionResultReceiver());
                    setDrawerElevation setdrawerelevation = setDrawerElevation.INSTANCE;
                    magicModuleSubmissionRequestBody5.invoke(_handleunrecognizedcharacterescape2, 0);
                    _handleunrecognizedcharacterescape2.AudioAttributesImplBaseParcelizer();
                    if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                        _validJsonValueList.AudioAttributesImplApi21Parcelizer();
                    }
                }
            }, _handleunrecognizedcharacterescape, 54), _handleunrecognizedcharacterescape, ContentReference.write | 48);
            if (this.AudioAttributesImplBaseParcelizer != null) {
                _handleunrecognizedcharacterescape.IconCompatParcelizer(-863394951);
                ContentReference<switchToNext> contentReferenceAudioAttributesCompatParcelizer3 = writeTypeSuffix.IconCompatParcelizer().AudioAttributesCompatParcelizer(switchToNext.write(this.read.RemoteActionCompatParcelizer(this.write)));
                final MagicModuleSubmissionRequestBody<_handleUnrecognizedCharacterEscape, Integer, getShowPopup> magicModuleSubmissionRequestBody5 = this.AudioAttributesImplBaseParcelizer;
                resetAsNaN.write(contentReferenceAudioAttributesCompatParcelizer3, multiplyFft.AudioAttributesCompatParcelizer(-782441013, true, new MagicModuleSubmissionRequestBody<_handleUnrecognizedCharacterEscape, Integer, getShowPopup>() { // from class: o.getDoubleValue.RemoteActionCompatParcelizer.4
                    @Override // kotlin.MagicModuleSubmissionRequestBody
                    public final /* synthetic */ getShowPopup invoke(_handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape2, Integer num) {
                        AudioAttributesCompatParcelizer(_handleunrecognizedcharacterescape2, num.intValue());
                        return getShowPopup.INSTANCE;
                    }

                    public final void AudioAttributesCompatParcelizer(_handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape2, int i2) {
                        if (!_handleunrecognizedcharacterescape2.RemoteActionCompatParcelizer((i2 & 3) != 2, i2 & 1)) {
                            _handleunrecognizedcharacterescape2.onPrepareFromSearch();
                            return;
                        }
                        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                            _validJsonValueList.AudioAttributesCompatParcelizer(-782441013, i2, -1, "androidx.compose.material3.DropdownMenuItemContent.<anonymous>.<anonymous>.<anonymous> (Menu.kt:484)");
                        }
                        _handleOddName _handleoddnameAudioAttributesCompatParcelizer$default = isAdded.AudioAttributesCompatParcelizer$default(_handleOddName.INSTANCE, mappedFeature.INSTANCE.RatingCompat(), BitmapDescriptorFactory.HUE_RED, 2, (Object) null);
                        MagicModuleSubmissionRequestBody<_handleUnrecognizedCharacterEscape, Integer, getShowPopup> magicModuleSubmissionRequestBody6 = magicModuleSubmissionRequestBody5;
                        withTypeHandler withtypehandlerWrite = AbsSavedState1.write(_skipWSOrEnd.INSTANCE.MediaBrowserCompatSearchResultReceiver(), false);
                        int iAudioAttributesCompatParcelizer = _getBigDecimal.AudioAttributesCompatParcelizer(_handleunrecognizedcharacterescape2, 0);
                        _getCharDesc _getchardescHandleMediaPlayPauseIfPendingOnHandler = _handleunrecognizedcharacterescape2.handleMediaPlayPauseIfPendingOnHandler();
                        _handleOddName _handleoddnameRemoteActionCompatParcelizer = _verifyNLZ2.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape2, _handleoddnameAudioAttributesCompatParcelizer$default);
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
                        NumberOutput.write(_handleunrecognizedcharacterescape3, withtypehandlerWrite, getDependencies.INSTANCE.AudioAttributesImplBaseParcelizer());
                        NumberOutput.write(_handleunrecognizedcharacterescape3, _getchardescHandleMediaPlayPauseIfPendingOnHandler, getDependencies.INSTANCE.MediaBrowserCompatItemReceiver());
                        MagicModuleSubmissionRequestBody<getDependencies, Integer, getShowPopup> magicModuleSubmissionRequestBodyAudioAttributesCompatParcelizer = getDependencies.INSTANCE.AudioAttributesCompatParcelizer();
                        if (_handleunrecognizedcharacterescape3.getParcelableVolumeInfo() || !toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape3.onPause(), Integer.valueOf(iAudioAttributesCompatParcelizer))) {
                            _handleunrecognizedcharacterescape3.RemoteActionCompatParcelizer(Integer.valueOf(iAudioAttributesCompatParcelizer));
                            _handleunrecognizedcharacterescape3.read(Integer.valueOf(iAudioAttributesCompatParcelizer), magicModuleSubmissionRequestBodyAudioAttributesCompatParcelizer);
                        }
                        NumberOutput.write(_handleunrecognizedcharacterescape3, _handleoddnameRemoteActionCompatParcelizer, getDependencies.INSTANCE.MediaBrowserCompatCustomActionResultReceiver());
                        setDrawerElevation setdrawerelevation = setDrawerElevation.INSTANCE;
                        magicModuleSubmissionRequestBody6.invoke(_handleunrecognizedcharacterescape2, 0);
                        _handleunrecognizedcharacterescape2.AudioAttributesImplBaseParcelizer();
                        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                            _validJsonValueList.AudioAttributesImplApi21Parcelizer();
                        }
                    }
                }, _handleunrecognizedcharacterescape, 54), _handleunrecognizedcharacterescape, ContentReference.write | 48);
                _handleunrecognizedcharacterescape.MediaBrowserCompatCustomActionResultReceiver();
            } else {
                _handleunrecognizedcharacterescape.IconCompatParcelizer(-863072055);
                _handleunrecognizedcharacterescape.MediaBrowserCompatCustomActionResultReceiver();
            }
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        RemoteActionCompatParcelizer(MagicModuleSubmissionRequestBody<? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup> magicModuleSubmissionRequestBody, getFloatValue getfloatvalue, boolean z, MagicModuleSubmissionRequestBody<? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup> magicModuleSubmissionRequestBody2, getViewLifecycleOwnerLiveData getviewlifecycleownerlivedata, MagicModuleSubmissionRequestBody<? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup> magicModuleSubmissionRequestBody3) {
            this.IconCompatParcelizer = magicModuleSubmissionRequestBody;
            this.read = getfloatvalue;
            this.write = z;
            this.AudioAttributesImplBaseParcelizer = magicModuleSubmissionRequestBody2;
            this.AudioAttributesCompatParcelizer = getviewlifecycleownerlivedata;
            this.RemoteActionCompatParcelizer = magicModuleSubmissionRequestBody3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final long AudioAttributesCompatParcelizer(kotlin.appendReferring r5, kotlin.appendReferring r6) {
        /*
            int r0 = r6.getRead()
            int r1 = r5.getAudioAttributesCompatParcelizer()
            r2 = 0
            r3 = 1065353216(0x3f800000, float:1.0)
            if (r0 < r1) goto Le
            goto L48
        Le:
            int r0 = r6.getAudioAttributesCompatParcelizer()
            int r1 = r5.getRead()
            if (r0 > r1) goto L1a
            r0 = r3
            goto L49
        L1a:
            int r0 = r6.MediaBrowserCompatItemReceiver()
            if (r0 == 0) goto L48
            int r0 = r5.getRead()
            int r1 = r6.getRead()
            int r0 = java.lang.Math.max(r0, r1)
            int r1 = r5.getAudioAttributesCompatParcelizer()
            int r4 = r6.getAudioAttributesCompatParcelizer()
            int r1 = java.lang.Math.min(r1, r4)
            int r0 = r0 + r1
            int r0 = r0 / 2
            int r1 = r6.getRead()
            int r0 = r0 - r1
            float r0 = (float) r0
            int r1 = r6.MediaBrowserCompatItemReceiver()
            float r1 = (float) r1
            float r0 = r0 / r1
            goto L49
        L48:
            r0 = r2
        L49:
            int r1 = r6.getWrite()
            int r4 = r5.getIconCompatParcelizer()
            if (r1 < r4) goto L54
            goto L8e
        L54:
            int r1 = r6.getIconCompatParcelizer()
            int r4 = r5.getWrite()
            if (r1 <= r4) goto L8d
            int r1 = r6.IconCompatParcelizer()
            if (r1 == 0) goto L8e
            int r1 = r5.getWrite()
            int r2 = r6.getWrite()
            int r1 = java.lang.Math.max(r1, r2)
            int r5 = r5.getIconCompatParcelizer()
            int r2 = r6.getIconCompatParcelizer()
            int r5 = java.lang.Math.min(r5, r2)
            int r1 = r1 + r5
            int r1 = r1 / 2
            int r5 = r6.getWrite()
            int r1 = r1 - r5
            float r5 = (float) r1
            int r6 = r6.IconCompatParcelizer()
            float r6 = (float) r6
            float r2 = r5 / r6
            goto L8e
        L8d:
            r2 = r3
        L8e:
            long r5 = kotlin.findDeserializationConverter.read(r0, r2)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getDoubleValue.AudioAttributesCompatParcelizer(o.appendReferring, o.appendReferring):long");
    }

    public static final float AudioAttributesCompatParcelizer() {
        return AudioAttributesImplBaseParcelizer;
    }

    public static final float IconCompatParcelizer() {
        return write;
    }

    private static final float AudioAttributesCompatParcelizer(parseDouble<Float> parsedouble) {
        return parsedouble.getRemoteActionCompatParcelizer().floatValue();
    }

    private static final float IconCompatParcelizer(parseDouble<Float> parsedouble) {
        return parsedouble.getRemoteActionCompatParcelizer().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(_handleOddName _handleoddname, setCollapseIcon setcollapseicon, InputAccessor inputAccessor, setTranslationY settranslationy, findAndAddVirtualProperties findandaddvirtualproperties, long j, float f, float f2, setUncaughtExceptionHandlerui setuncaughtexceptionhandlerui, getModuleData getmoduledata, int i, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i2) throws Throwable {
        write(_handleoddname, setcollapseicon, inputAccessor, settranslationy, findandaddvirtualproperties, j, f, f2, setuncaughtexceptionhandlerui, getmoduledata, _handleunrecognizedcharacterescape, _appendEscaped.RemoteActionCompatParcelizer(i | 1));
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup IconCompatParcelizer(MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody, getCreatedOnDateMs getcreatedondatems, _handleOddName _handleoddname, MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody2, MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody3, boolean z, getFloatValue getfloatvalue, getReturnTransition getreturntransition, hashCode hashcode, int i, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i2) {
        IconCompatParcelizer(magicModuleSubmissionRequestBody, getcreatedondatems, _handleoddname, magicModuleSubmissionRequestBody2, magicModuleSubmissionRequestBody3, z, getfloatvalue, getreturntransition, hashcode, _handleunrecognizedcharacterescape, _appendEscaped.RemoteActionCompatParcelizer(i | 1));
        return getShowPopup.INSTANCE;
    }
}
