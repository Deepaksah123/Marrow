package kotlin;

import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.RendererCapabilities;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.JsonFactory;
import kotlin.Metadata;
import org.apache.commons.compress.archivers.cpio.CpioConstants;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u008c\u0001\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\u001aÙ\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0011\u0010\u0006\u001a\r\u0012\u0004\u0012\u00020\u00010\u0007¢\u0006\u0002\b\b2\u0006\u0010\t\u001a\u00020\n2\u0013\u0010\u000b\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0007¢\u0006\u0002\b\b2\u0013\u0010\f\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0007¢\u0006\u0002\b\b2\u0013\u0010\r\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0007¢\u0006\u0002\b\b2\u0013\u0010\u000e\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0007¢\u0006\u0002\b\b2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0013\u0010\u001b\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0007¢\u0006\u0002\b\bH\u0001¢\u0006\u0002\u0010\u001c\u001aQ\u0010\u001d\u001a\u00020\u00012\u0006\u0010\u001e\u001a\u00020\u001f2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010!2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010#2 \u0010$\u001a\u001c\u0012\u0004\u0012\u00020\u00010\u0007¢\u0006\u0002\b\b¢\u0006\f\b%\u0012\b\b&\u0012\u0004\b\u0003\u0010\u0000H\u0001¢\u0006\u0004\b'\u0010(\u001a\u001c\u0010)\u001a\u00020**\u00020*2\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010+\u001a\u00020\u0005H\u0000\u001a\u0012\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010/H\u0000\u001a\u0012\u00100\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010/H\u0000\"\u001a\u00101\u001a\u0004\u0018\u000102*\u0002038@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b4\u00105\"\u000e\u00106\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u00107\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u00108\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u00109\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010:\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010;\u001a\u00020-X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010<\u001a\u00020-X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010=\u001a\u00020-X\u0082T¢\u0006\u0002\n\u0000\"\u0016\u0010>\u001a\u00020?X\u0080\u0004¢\u0006\n\n\u0002\u0010B\u001a\u0004\b@\u0010A\"\u0016\u0010C\u001a\u00020?X\u0080\u0004¢\u0006\n\n\u0002\u0010B\u001a\u0004\bD\u0010A¨\u0006E"}, d2 = {"CommonDecorationBox", "", "type", "Landroidx/compose/material/TextFieldType;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "innerTextField", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "visualTransformation", "Landroidx/compose/ui/text/input/VisualTransformation;", "label", "placeholder", "leadingIcon", "trailingIcon", "singleLine", "", "enabled", "isError", "interactionSource", "Landroidx/compose/foundation/interaction/InteractionSource;", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "shape", "Landroidx/compose/ui/graphics/Shape;", "colors", "Landroidx/compose/material/TextFieldColors;", "border", "(Landroidx/compose/material/TextFieldType;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/text/input/VisualTransformation;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZZZLandroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material/TextFieldColors;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "Decoration", "contentColor", "Landroidx/compose/ui/graphics/Color;", "typography", "Landroidx/compose/ui/text/TextStyle;", "contentAlpha", "", "content", "Landroidx/compose/runtime/ComposableOpenTarget;", "index", "Decoration-euL9pac", "(JLandroidx/compose/ui/text/TextStyle;Ljava/lang/Float;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "defaultErrorSemantics", "Landroidx/compose/ui/Modifier;", "defaultErrorMessage", "widthOrZero", "", "placeable", "Landroidx/compose/ui/layout/Placeable;", "heightOrZero", "layoutId", "", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "getLayoutId", "(Landroidx/compose/ui/layout/IntrinsicMeasurable;)Ljava/lang/Object;", "TextFieldId", "PlaceholderId", "LabelId", "LeadingId", "TrailingId", "AnimationDuration", "PlaceholderAnimationDuration", "PlaceholderAnimationDelayOrDuration", "TextFieldPadding", "Landroidx/compose/ui/unit/Dp;", "getTextFieldPadding", "()F", "F", "HorizontalIconPadding", "getHorizontalIconPadding", "material"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class JsonFactory {
    private static final float AudioAttributesCompatParcelizer = assignParameter.IconCompatParcelizer(16.0f);
    private static final float IconCompatParcelizer = assignParameter.IconCompatParcelizer(12.0f);

    public static final void IconCompatParcelizer(final _copyCurrentIntValue _copycurrentintvalue, final String str, final MagicModuleSubmissionRequestBody<? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup> magicModuleSubmissionRequestBody, final addUnresolvedId addunresolvedid, final MagicModuleSubmissionRequestBody<? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup> magicModuleSubmissionRequestBody2, final MagicModuleSubmissionRequestBody<? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup> magicModuleSubmissionRequestBody3, final MagicModuleSubmissionRequestBody<? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup> magicModuleSubmissionRequestBody4, final MagicModuleSubmissionRequestBody<? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup> magicModuleSubmissionRequestBody5, final boolean z, final boolean z2, final boolean z3, final inset insetVar, final getReturnTransition getreturntransition, final findAndAddVirtualProperties findandaddvirtualproperties, final FormatSchema formatSchema, final MagicModuleSubmissionRequestBody<? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup> magicModuleSubmissionRequestBody6, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, final int i, final int i2) {
        int i3;
        int i4;
        _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape2;
        getUseInput getuseinput;
        _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescapeWrite = _handleunrecognizedcharacterescape.write(418608794);
        if ((i & 6) == 0) {
            i3 = (_handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(_copycurrentintvalue.ordinal()) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(str) ? 32 : 16;
        }
        if ((i & RendererCapabilities.MODE_SUPPORT_MASK) == 0) {
            i3 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(magicModuleSubmissionRequestBody) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(addunresolvedid) ? 2048 : 1024;
        }
        if ((i & CpioConstants.C_ISBLK) == 0) {
            i3 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(magicModuleSubmissionRequestBody2) ? 16384 : 8192;
        }
        if ((i & 196608) == 0) {
            i3 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(magicModuleSubmissionRequestBody3) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i3 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(magicModuleSubmissionRequestBody4) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((i & 12582912) == 0) {
            i3 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(magicModuleSubmissionRequestBody5) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(z) ? 67108864 : 33554432;
        }
        if ((i & C.ENCODING_PCM_32BIT) == 0) {
            i3 |= _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(z2) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (_handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(z3) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(insetVar) ? 32 : 16;
        }
        if ((i2 & RendererCapabilities.MODE_SUPPORT_MASK) == 0) {
            i4 |= _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(getreturntransition) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(findandaddvirtualproperties) ? 2048 : 1024;
        }
        if ((i2 & CpioConstants.C_ISBLK) == 0) {
            i4 |= _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(formatSchema) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i4 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(magicModuleSubmissionRequestBody6) ? 131072 : 65536;
        }
        int i5 = i4;
        if (!_handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(((i3 & 306783379) == 306783378 && (74899 & i5) == 74898) ? false : true, i3 & 1)) {
            _handleunrecognizedcharacterescape2 = _handleunrecognizedcharacterescapeWrite;
            _handleunrecognizedcharacterescape2.onPrepareFromSearch();
        } else {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(418608794, i3, i5, "androidx.compose.material.CommonDecorationBox (TextFieldImpl.kt:78)");
            }
            boolean z4 = (i3 & 112) == 32;
            boolean z5 = (i3 & 7168) == 2048;
            Object objOnPause = _handleunrecognizedcharacterescapeWrite.onPause();
            if ((z5 | z4) || objOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause = addunresolvedid.AudioAttributesCompatParcelizer(new AbstractDeserializer(str, null, 2, null));
                _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(objOnPause);
            }
            String iconCompatParcelizer = ((withDelegate) objOnPause).getAudioAttributesCompatParcelizer().getIconCompatParcelizer();
            if (getSystemWindowInsets.AudioAttributesCompatParcelizer(insetVar, _handleunrecognizedcharacterescapeWrite, (i5 >> 3) & 14).getRemoteActionCompatParcelizer().booleanValue()) {
                getuseinput = getUseInput.write;
            } else {
                getuseinput = iconCompatParcelizer.length() == 0 ? getUseInput.read : getUseInput.IconCompatParcelizer;
            }
            getUseInput getuseinput2 = getuseinput;
            AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = new AudioAttributesCompatParcelizer(formatSchema, z2, z3, insetVar);
            canWriteTypeId canwritetypeidIconCompatParcelizer = enabled.INSTANCE.IconCompatParcelizer(_handleunrecognizedcharacterescapeWrite, 6);
            deserializeWithObjectId audioAttributesImplBaseParcelizer = canwritetypeidIconCompatParcelizer.getAudioAttributesImplBaseParcelizer();
            deserializeWithObjectId mediaDescriptionCompat = canwritetypeidIconCompatParcelizer.getMediaDescriptionCompat();
            boolean z6 = (switchToNext.RemoteActionCompatParcelizer(audioAttributesImplBaseParcelizer.MediaBrowserCompatCustomActionResultReceiver(), switchToNext.INSTANCE.AudioAttributesImplApi21Parcelizer()) && !switchToNext.RemoteActionCompatParcelizer(mediaDescriptionCompat.MediaBrowserCompatCustomActionResultReceiver(), switchToNext.INSTANCE.AudioAttributesImplApi21Parcelizer())) || (!switchToNext.RemoteActionCompatParcelizer(audioAttributesImplBaseParcelizer.MediaBrowserCompatCustomActionResultReceiver(), switchToNext.INSTANCE.AudioAttributesImplApi21Parcelizer()) && switchToNext.RemoteActionCompatParcelizer(mediaDescriptionCompat.MediaBrowserCompatCustomActionResultReceiver(), switchToNext.INSTANCE.AudioAttributesImplApi21Parcelizer()));
            _copyCurrentContents _copycurrentcontents = _copyCurrentContents.read;
            _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(-1443813555);
            long jMediaBrowserCompatCustomActionResultReceiver = enabled.INSTANCE.IconCompatParcelizer(_handleunrecognizedcharacterescapeWrite, 6).getMediaDescriptionCompat().MediaBrowserCompatCustomActionResultReceiver();
            if (z6) {
                _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(-887928539);
                if (jMediaBrowserCompatCustomActionResultReceiver == 16) {
                    jMediaBrowserCompatCustomActionResultReceiver = audioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(getuseinput2, _handleunrecognizedcharacterescapeWrite, 0).getIconCompatParcelizer();
                }
                _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatCustomActionResultReceiver();
            } else {
                _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(1218284988);
                _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatCustomActionResultReceiver();
            }
            long j = jMediaBrowserCompatCustomActionResultReceiver;
            _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatCustomActionResultReceiver();
            _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(-1443806289);
            long jMediaBrowserCompatCustomActionResultReceiver2 = enabled.INSTANCE.IconCompatParcelizer(_handleunrecognizedcharacterescapeWrite, 6).getAudioAttributesImplBaseParcelizer().MediaBrowserCompatCustomActionResultReceiver();
            if (z6) {
                _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(-1026713946);
                if (jMediaBrowserCompatCustomActionResultReceiver2 == 16) {
                    jMediaBrowserCompatCustomActionResultReceiver2 = audioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(getuseinput2, _handleunrecognizedcharacterescapeWrite, 0).getIconCompatParcelizer();
                }
                _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatCustomActionResultReceiver();
            } else {
                _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(798166043);
                _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatCustomActionResultReceiver();
            }
            long j2 = jMediaBrowserCompatCustomActionResultReceiver2;
            _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatCustomActionResultReceiver();
            _handleunrecognizedcharacterescape2 = _handleunrecognizedcharacterescapeWrite;
            _copycurrentcontents.IconCompatParcelizer(getuseinput2, j, j2, audioAttributesCompatParcelizer, magicModuleSubmissionRequestBody2 != null, multiplyFft.AudioAttributesCompatParcelizer(33336375, true, new RemoteActionCompatParcelizer(magicModuleSubmissionRequestBody2, magicModuleSubmissionRequestBody3, iconCompatParcelizer, formatSchema, z2, z3, insetVar, magicModuleSubmissionRequestBody4, magicModuleSubmissionRequestBody5, findandaddvirtualproperties, _copycurrentintvalue, magicModuleSubmissionRequestBody, z, getreturntransition, z6, magicModuleSubmissionRequestBody6), _handleunrecognizedcharacterescape2, 54), _handleunrecognizedcharacterescape2, 1769472);
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        releaseNameCopyBuffer releasenamecopybufferMediaBrowserCompatSearchResultReceiver = _handleunrecognizedcharacterescape2.MediaBrowserCompatSearchResultReceiver();
        if (releasenamecopybufferMediaBrowserCompatSearchResultReceiver != null) {
            releasenamecopybufferMediaBrowserCompatSearchResultReceiver.read(new MagicModuleSubmissionRequestBody() { // from class: o.isBigEndian
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return JsonFactory.RemoteActionCompatParcelizer(_copycurrentintvalue, str, magicModuleSubmissionRequestBody, addunresolvedid, magicModuleSubmissionRequestBody2, magicModuleSubmissionRequestBody3, magicModuleSubmissionRequestBody4, magicModuleSubmissionRequestBody5, z, z2, z3, insetVar, getreturntransition, findandaddvirtualproperties, formatSchema, magicModuleSubmissionRequestBody6, i, i2, (_handleUnrecognizedCharacterEscape) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AudioAttributesCompatParcelizer implements getModuleData<getUseInput, _handleUnrecognizedCharacterEscape, Integer, switchToNext> {
        final /* synthetic */ FormatSchema IconCompatParcelizer;
        final /* synthetic */ inset RemoteActionCompatParcelizer;
        final /* synthetic */ boolean read;
        final /* synthetic */ boolean write;

        @Override // kotlin.getModuleData
        public final /* synthetic */ switchToNext AudioAttributesCompatParcelizer(getUseInput getuseinput, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, Integer num) {
            return switchToNext.write(write(getuseinput, _handleunrecognizedcharacterescape, num.intValue()));
        }

        public final long write(getUseInput getuseinput, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
            _handleunrecognizedcharacterescape.IconCompatParcelizer(1423138213);
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(1423138213, i, -1, "androidx.compose.material.CommonDecorationBox.<anonymous> (TextFieldImpl.kt:95)");
            }
            long iconCompatParcelizer = this.IconCompatParcelizer.RemoteActionCompatParcelizer(this.write, getuseinput == getUseInput.read ? false : this.read, this.RemoteActionCompatParcelizer, _handleunrecognizedcharacterescape, 0).getRemoteActionCompatParcelizer().getIconCompatParcelizer();
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
            _handleunrecognizedcharacterescape.MediaBrowserCompatCustomActionResultReceiver();
            return iconCompatParcelizer;
        }

        AudioAttributesCompatParcelizer(FormatSchema formatSchema, boolean z, boolean z2, inset insetVar) {
            this.IconCompatParcelizer = formatSchema;
            this.write = z;
            this.read = z2;
            this.RemoteActionCompatParcelizer = insetVar;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class RemoteActionCompatParcelizer implements markComplete<Float, switchToNext, switchToNext, Float, _handleUnrecognizedCharacterEscape, Integer, getShowPopup> {
        final /* synthetic */ FormatSchema AudioAttributesCompatParcelizer;
        final /* synthetic */ MagicModuleSubmissionRequestBody<_handleUnrecognizedCharacterEscape, Integer, getShowPopup> AudioAttributesImplApi21Parcelizer;
        final /* synthetic */ MagicModuleSubmissionRequestBody<_handleUnrecognizedCharacterEscape, Integer, getShowPopup> AudioAttributesImplApi26Parcelizer;
        final /* synthetic */ boolean AudioAttributesImplBaseParcelizer;
        final /* synthetic */ boolean IconCompatParcelizer;
        final /* synthetic */ MagicModuleSubmissionRequestBody<_handleUnrecognizedCharacterEscape, Integer, getShowPopup> MediaBrowserCompatCustomActionResultReceiver;
        final /* synthetic */ inset MediaBrowserCompatItemReceiver;
        final /* synthetic */ boolean MediaBrowserCompatMediaItem;
        final /* synthetic */ String MediaBrowserCompatSearchResultReceiver;
        final /* synthetic */ boolean MediaDescriptionCompat;
        final /* synthetic */ MagicModuleSubmissionRequestBody<_handleUnrecognizedCharacterEscape, Integer, getShowPopup> MediaMetadataCompat;
        final /* synthetic */ findAndAddVirtualProperties RatingCompat;
        final /* synthetic */ getReturnTransition RemoteActionCompatParcelizer;
        final /* synthetic */ _copyCurrentIntValue handleMediaPlayPauseIfPendingOnHandler;
        final /* synthetic */ MagicModuleSubmissionRequestBody<_handleUnrecognizedCharacterEscape, Integer, getShowPopup> read;
        final /* synthetic */ MagicModuleSubmissionRequestBody<_handleUnrecognizedCharacterEscape, Integer, getShowPopup> write;

        @Override // kotlin.markComplete
        public final /* synthetic */ getShowPopup AudioAttributesCompatParcelizer(Float f, switchToNext switchtonext, switchToNext switchtonext2, Float f2, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, Integer num) {
            write(f.floatValue(), switchtonext.getIconCompatParcelizer(), switchtonext2.getIconCompatParcelizer(), f2.floatValue(), _handleunrecognizedcharacterescape, num.intValue());
            return getShowPopup.INSTANCE;
        }

        public final void write(final float f, final long j, final long j2, final float f2, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
            int i2;
            int i3;
            boolean z;
            FastIntegerMathUInt128 fastIntegerMathUInt128;
            FastIntegerMathUInt128 fastIntegerMathUInt1282;
            FastIntegerMathUInt128 fastIntegerMathUInt1283;
            FastIntegerMathUInt128 fastIntegerMathUInt1284;
            if ((i & 6) == 0) {
                i2 = (_handleunrecognizedcharacterescape.IconCompatParcelizer(f) ? 4 : 2) | i;
            } else {
                i2 = i;
            }
            if ((i & 48) == 0) {
                i2 |= _handleunrecognizedcharacterescape.IconCompatParcelizer(j) ? 32 : 16;
            }
            if ((i & RendererCapabilities.MODE_SUPPORT_MASK) == 0) {
                i2 |= _handleunrecognizedcharacterescape.IconCompatParcelizer(j2) ? 256 : 128;
            }
            if ((i & 3072) == 0) {
                i2 |= _handleunrecognizedcharacterescape.IconCompatParcelizer(f2) ? 2048 : 1024;
            }
            int i4 = i2;
            if (!_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer((i4 & 9363) != 9362, i4 & 1)) {
                _handleunrecognizedcharacterescape.onPrepareFromSearch();
                return;
            }
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(33336375, i4, -1, "androidx.compose.material.CommonDecorationBox.<anonymous> (TextFieldImpl.kt:128)");
            }
            final MagicModuleSubmissionRequestBody<_handleUnrecognizedCharacterEscape, Integer, getShowPopup> magicModuleSubmissionRequestBody = this.AudioAttributesImplApi26Parcelizer;
            if (magicModuleSubmissionRequestBody == null) {
                _handleunrecognizedcharacterescape.IconCompatParcelizer(986681709);
                _handleunrecognizedcharacterescape.MediaBrowserCompatCustomActionResultReceiver();
                i3 = 54;
                z = true;
                fastIntegerMathUInt128 = null;
            } else {
                _handleunrecognizedcharacterescape.IconCompatParcelizer(986681710);
                final boolean z2 = this.MediaBrowserCompatMediaItem;
                i3 = 54;
                z = true;
                FastIntegerMathUInt128 fastIntegerMathUInt128AudioAttributesCompatParcelizer = multiplyFft.AudioAttributesCompatParcelizer(723429411, true, new MagicModuleSubmissionRequestBody() { // from class: o._createParser
                    @Override // kotlin.MagicModuleSubmissionRequestBody
                    public final Object invoke(Object obj, Object obj2) {
                        return JsonFactory.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(f, j2, magicModuleSubmissionRequestBody, z2, j, (_handleUnrecognizedCharacterEscape) obj, ((Integer) obj2).intValue());
                    }
                }, _handleunrecognizedcharacterescape, 54);
                _handleunrecognizedcharacterescape.MediaBrowserCompatCustomActionResultReceiver();
                fastIntegerMathUInt128 = fastIntegerMathUInt128AudioAttributesCompatParcelizer;
            }
            if (this.MediaBrowserCompatCustomActionResultReceiver != null && this.MediaBrowserCompatSearchResultReceiver.length() == 0 && f2 > BitmapDescriptorFactory.HUE_RED) {
                _handleunrecognizedcharacterescape.IconCompatParcelizer(987666549);
                final FormatSchema formatSchema = this.AudioAttributesCompatParcelizer;
                final boolean z3 = this.IconCompatParcelizer;
                final MagicModuleSubmissionRequestBody<_handleUnrecognizedCharacterEscape, Integer, getShowPopup> magicModuleSubmissionRequestBody2 = this.MediaBrowserCompatCustomActionResultReceiver;
                FastIntegerMathUInt128 fastIntegerMathUInt128AudioAttributesCompatParcelizer2 = multiplyFft.AudioAttributesCompatParcelizer(-426706263, z, new getModuleData() { // from class: o._createUTF8Generator
                    @Override // kotlin.getModuleData
                    public final Object AudioAttributesCompatParcelizer(Object obj, Object obj2, Object obj3) {
                        return JsonFactory.RemoteActionCompatParcelizer.write(f2, formatSchema, z3, magicModuleSubmissionRequestBody2, (_handleOddName) obj, (_handleUnrecognizedCharacterEscape) obj2, ((Integer) obj3).intValue());
                    }
                }, _handleunrecognizedcharacterescape, i3);
                _handleunrecognizedcharacterescape.MediaBrowserCompatCustomActionResultReceiver();
                fastIntegerMathUInt1282 = fastIntegerMathUInt128AudioAttributesCompatParcelizer2;
            } else {
                _handleunrecognizedcharacterescape.IconCompatParcelizer(988093542);
                _handleunrecognizedcharacterescape.MediaBrowserCompatCustomActionResultReceiver();
                fastIntegerMathUInt1282 = null;
            }
            final long iconCompatParcelizer = this.AudioAttributesCompatParcelizer.read(this.IconCompatParcelizer, this.AudioAttributesImplBaseParcelizer, this.MediaBrowserCompatItemReceiver, _handleunrecognizedcharacterescape, 0).getRemoteActionCompatParcelizer().getIconCompatParcelizer();
            final MagicModuleSubmissionRequestBody<_handleUnrecognizedCharacterEscape, Integer, getShowPopup> magicModuleSubmissionRequestBody3 = this.AudioAttributesImplApi21Parcelizer;
            if (magicModuleSubmissionRequestBody3 == null) {
                _handleunrecognizedcharacterescape.IconCompatParcelizer(988282301);
                _handleunrecognizedcharacterescape.MediaBrowserCompatCustomActionResultReceiver();
                fastIntegerMathUInt1283 = null;
            } else {
                _handleunrecognizedcharacterescape.IconCompatParcelizer(988282302);
                FastIntegerMathUInt128 fastIntegerMathUInt128AudioAttributesCompatParcelizer3 = multiplyFft.AudioAttributesCompatParcelizer(-317090443, z, new MagicModuleSubmissionRequestBody() { // from class: o._createWriter
                    @Override // kotlin.MagicModuleSubmissionRequestBody
                    public final Object invoke(Object obj, Object obj2) {
                        return JsonFactory.RemoteActionCompatParcelizer.write(iconCompatParcelizer, magicModuleSubmissionRequestBody3, (_handleUnrecognizedCharacterEscape) obj, ((Integer) obj2).intValue());
                    }
                }, _handleunrecognizedcharacterescape, i3);
                _handleunrecognizedcharacterescape.MediaBrowserCompatCustomActionResultReceiver();
                fastIntegerMathUInt1283 = fastIntegerMathUInt128AudioAttributesCompatParcelizer3;
            }
            final long iconCompatParcelizer2 = this.AudioAttributesCompatParcelizer.IconCompatParcelizer(this.IconCompatParcelizer, this.AudioAttributesImplBaseParcelizer, this.MediaBrowserCompatItemReceiver, _handleunrecognizedcharacterescape, 0).getRemoteActionCompatParcelizer().getIconCompatParcelizer();
            final MagicModuleSubmissionRequestBody<_handleUnrecognizedCharacterEscape, Integer, getShowPopup> magicModuleSubmissionRequestBody4 = this.MediaMetadataCompat;
            if (magicModuleSubmissionRequestBody4 == null) {
                _handleunrecognizedcharacterescape.IconCompatParcelizer(988575964);
                _handleunrecognizedcharacterescape.MediaBrowserCompatCustomActionResultReceiver();
                fastIntegerMathUInt1284 = null;
            } else {
                _handleunrecognizedcharacterescape.IconCompatParcelizer(988575965);
                FastIntegerMathUInt128 fastIntegerMathUInt128AudioAttributesCompatParcelizer4 = multiplyFft.AudioAttributesCompatParcelizer(262889693, z, new MagicModuleSubmissionRequestBody() { // from class: o.canUseCharArrays
                    @Override // kotlin.MagicModuleSubmissionRequestBody
                    public final Object invoke(Object obj, Object obj2) {
                        return JsonFactory.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(iconCompatParcelizer2, magicModuleSubmissionRequestBody4, (_handleUnrecognizedCharacterEscape) obj, ((Integer) obj2).intValue());
                    }
                }, _handleunrecognizedcharacterescape, i3);
                _handleunrecognizedcharacterescape.MediaBrowserCompatCustomActionResultReceiver();
                fastIntegerMathUInt1284 = fastIntegerMathUInt128AudioAttributesCompatParcelizer4;
            }
            _handleOddName _handleoddnameIconCompatParcelizer = getFrameEndSchedulerui.IconCompatParcelizer(_handleOddName.INSTANCE, this.AudioAttributesCompatParcelizer.IconCompatParcelizer(this.IconCompatParcelizer, _handleunrecognizedcharacterescape, 0).getRemoteActionCompatParcelizer().getIconCompatParcelizer(), this.RatingCompat);
            int i5 = JsonFactory$RemoteActionCompatParcelizer$read$WhenMappings.read[this.handleMediaPlayPauseIfPendingOnHandler.ordinal()];
            if (i5 == z) {
                _handleunrecognizedcharacterescape.IconCompatParcelizer(988856360);
                _getBufferRecycler.RemoteActionCompatParcelizer(_handleoddnameIconCompatParcelizer, this.read, fastIntegerMathUInt128, fastIntegerMathUInt1282, fastIntegerMathUInt1283, fastIntegerMathUInt1284, this.MediaDescriptionCompat, f, this.RemoteActionCompatParcelizer, _handleunrecognizedcharacterescape, (i4 << 21) & 29360128);
                _handleunrecognizedcharacterescape.MediaBrowserCompatCustomActionResultReceiver();
            } else {
                if (i5 != 2) {
                    _handleunrecognizedcharacterescape.IconCompatParcelizer(1971561250);
                    _handleunrecognizedcharacterescape.MediaBrowserCompatCustomActionResultReceiver();
                    throw new RenewEligibleCreator();
                }
                _handleunrecognizedcharacterescape.IconCompatParcelizer(989436742);
                Object objOnPause = _handleunrecognizedcharacterescape.onPause();
                if (objOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                    objOnPause = available.RemoteActionCompatParcelizer$default(calloc.read(calloc.INSTANCE.AudioAttributesCompatParcelizer()), null, 2, null);
                    _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause);
                }
                final InputAccessor inputAccessor = (InputAccessor) objOnPause;
                final getReturnTransition getreturntransition = this.RemoteActionCompatParcelizer;
                final MagicModuleSubmissionRequestBody<_handleUnrecognizedCharacterEscape, Integer, getShowPopup> magicModuleSubmissionRequestBody5 = this.write;
                FastIntegerMathUInt128 fastIntegerMathUInt128AudioAttributesCompatParcelizer5 = multiplyFft.AudioAttributesCompatParcelizer(-1107746014, z, new MagicModuleSubmissionRequestBody() { // from class: o._decorate
                    @Override // kotlin.MagicModuleSubmissionRequestBody
                    public final Object invoke(Object obj, Object obj2) {
                        return JsonFactory.RemoteActionCompatParcelizer.IconCompatParcelizer(inputAccessor, getreturntransition, magicModuleSubmissionRequestBody5, (_handleUnrecognizedCharacterEscape) obj, ((Integer) obj2).intValue());
                    }
                }, _handleunrecognizedcharacterescape, i3);
                MagicModuleSubmissionRequestBody<_handleUnrecognizedCharacterEscape, Integer, getShowPopup> magicModuleSubmissionRequestBody6 = this.read;
                boolean z4 = this.MediaDescriptionCompat;
                boolean z5 = (i4 & 14) == 4;
                Object objOnPause2 = _handleunrecognizedcharacterescape.onPause();
                if (z5 || objOnPause2 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                    objOnPause2 = new getAnswerMap() { // from class: o.createGenerator
                        @Override // kotlin.getAnswerMap
                        public final Object invoke(Object obj) {
                            return JsonFactory.RemoteActionCompatParcelizer.IconCompatParcelizer(f, inputAccessor, (calloc) obj);
                        }
                    };
                    _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause2);
                }
                getFeature.write(_handleoddnameIconCompatParcelizer, magicModuleSubmissionRequestBody6, fastIntegerMathUInt1282, fastIntegerMathUInt128, fastIntegerMathUInt1283, fastIntegerMathUInt1284, z4, f, (getAnswerMap<? super calloc, getShowPopup>) objOnPause2, fastIntegerMathUInt128AudioAttributesCompatParcelizer5, this.RemoteActionCompatParcelizer, _handleunrecognizedcharacterescape, ((i4 << 21) & 29360128) | C.ENCODING_PCM_32BIT, 0);
                _handleunrecognizedcharacterescape.MediaBrowserCompatCustomActionResultReceiver();
            }
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final getShowPopup AudioAttributesCompatParcelizer(float f, long j, MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody, boolean z, long j2, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
            deserializeWithObjectId deserializewithobjectidIconCompatParcelizer;
            if (!_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer((i & 3) != 2, i & 1)) {
                _handleunrecognizedcharacterescape.onPrepareFromSearch();
            } else {
                if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                    _validJsonValueList.AudioAttributesCompatParcelizer(723429411, i, -1, "androidx.compose.material.CommonDecorationBox.<anonymous>.<anonymous>.<anonymous> (TextFieldImpl.kt:131)");
                }
                deserializeWithObjectId deserializewithobjectidAudioAttributesCompatParcelizer = injectValues.AudioAttributesCompatParcelizer(enabled.INSTANCE.IconCompatParcelizer(_handleunrecognizedcharacterescape, 6).getAudioAttributesImplBaseParcelizer(), enabled.INSTANCE.IconCompatParcelizer(_handleunrecognizedcharacterescape, 6).getMediaDescriptionCompat(), f);
                if (z) {
                    deserializewithobjectidIconCompatParcelizer = deserializewithobjectidAudioAttributesCompatParcelizer.IconCompatParcelizer((16777212 & 1) != 0 ? deserializewithobjectidAudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer.read() : j2, (16777212 & 2) != 0 ? deserializewithobjectidAudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer.getAudioAttributesCompatParcelizer() : 0L, (16777212 & 4) != 0 ? deserializewithobjectidAudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer.getRemoteActionCompatParcelizer() : null, (16777212 & 8) != 0 ? deserializewithobjectidAudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer.getWrite() : null, (16777212 & 16) != 0 ? deserializewithobjectidAudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer.getRead() : null, (16777212 & 32) != 0 ? deserializewithobjectidAudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer.getAudioAttributesImplBaseParcelizer() : null, (16777212 & 64) != 0 ? deserializewithobjectidAudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer.getMediaBrowserCompatCustomActionResultReceiver() : null, (16777212 & 128) != 0 ? deserializewithobjectidAudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer.getMediaBrowserCompatItemReceiver() : 0L, (16777212 & 256) != 0 ? deserializewithobjectidAudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer.getAudioAttributesImplApi21Parcelizer() : null, (16777212 & 512) != 0 ? deserializewithobjectidAudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer.getAudioAttributesImplApi26Parcelizer() : null, (16777212 & 1024) != 0 ? deserializewithobjectidAudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer.getMediaBrowserCompatMediaItem() : null, (16777212 & 2048) != 0 ? deserializewithobjectidAudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer.getMediaDescriptionCompat() : 0L, (16777212 & 4096) != 0 ? deserializewithobjectidAudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer.getMediaMetadataCompat() : null, (16777212 & 8192) != 0 ? deserializewithobjectidAudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer.getMediaBrowserCompatSearchResultReceiver() : null, (16777212 & 16384) != 0 ? deserializewithobjectidAudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer.getOnCustomAction() : null, (16777212 & 32768) != 0 ? deserializewithobjectidAudioAttributesCompatParcelizer.read.getWrite() : 0, (16777212 & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0 ? deserializewithobjectidAudioAttributesCompatParcelizer.read.getIconCompatParcelizer() : 0, (16777212 & 131072) != 0 ? deserializewithobjectidAudioAttributesCompatParcelizer.read.getRead() : 0L, (16777212 & 262144) != 0 ? deserializewithobjectidAudioAttributesCompatParcelizer.read.getAudioAttributesCompatParcelizer() : null, (16777212 & 524288) != 0 ? deserializewithobjectidAudioAttributesCompatParcelizer.write : null, (16777212 & ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? deserializewithobjectidAudioAttributesCompatParcelizer.read.getAudioAttributesImplApi21Parcelizer() : null, (16777212 & 2097152) != 0 ? deserializewithobjectidAudioAttributesCompatParcelizer.read.getAudioAttributesImplApi26Parcelizer() : 0, (16777212 & 4194304) != 0 ? deserializewithobjectidAudioAttributesCompatParcelizer.read.getMediaBrowserCompatCustomActionResultReceiver() : 0, (16777212 & 8388608) != 0 ? deserializewithobjectidAudioAttributesCompatParcelizer.read.getAudioAttributesImplBaseParcelizer() : null);
                } else {
                    deserializewithobjectidIconCompatParcelizer = deserializewithobjectidAudioAttributesCompatParcelizer;
                }
                JsonFactory.AudioAttributesCompatParcelizer(j, deserializewithobjectidIconCompatParcelizer, null, magicModuleSubmissionRequestBody, _handleunrecognizedcharacterescape, RendererCapabilities.MODE_SUPPORT_MASK, 0);
                if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                    _validJsonValueList.AudioAttributesImplApi21Parcelizer();
                }
            }
            return getShowPopup.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final getShowPopup write(float f, FormatSchema formatSchema, boolean z, MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody, _handleOddName _handleoddname, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
            if ((i & 6) == 0) {
                i |= _handleunrecognizedcharacterescape.AudioAttributesCompatParcelizer(_handleoddname) ? 4 : 2;
            }
            if (!_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer((i & 19) != 18, i & 1)) {
                _handleunrecognizedcharacterescape.onPrepareFromSearch();
            } else {
                if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                    _validJsonValueList.AudioAttributesCompatParcelizer(-426706263, i, -1, "androidx.compose.material.CommonDecorationBox.<anonymous>.<anonymous> (TextFieldImpl.kt:151)");
                }
                _handleOddName _handleoddnameAudioAttributesCompatParcelizer = addName.AudioAttributesCompatParcelizer(_handleoddname, f);
                withTypeHandler withtypehandlerWrite = AbsSavedState1.write(_skipWSOrEnd.INSTANCE.MediaBrowserCompatSearchResultReceiver(), false);
                int iAudioAttributesCompatParcelizer = _getBigDecimal.AudioAttributesCompatParcelizer(_handleunrecognizedcharacterescape, 0);
                _getCharDesc _getchardescHandleMediaPlayPauseIfPendingOnHandler = _handleunrecognizedcharacterescape.handleMediaPlayPauseIfPendingOnHandler();
                _handleOddName _handleoddnameRemoteActionCompatParcelizer = _verifyNLZ2.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape, _handleoddnameAudioAttributesCompatParcelizer);
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
                JsonFactory.AudioAttributesCompatParcelizer(formatSchema.RemoteActionCompatParcelizer(z, _handleunrecognizedcharacterescape, 0).getRemoteActionCompatParcelizer().getIconCompatParcelizer(), enabled.INSTANCE.IconCompatParcelizer(_handleunrecognizedcharacterescape, 6).getAudioAttributesImplBaseParcelizer(), null, magicModuleSubmissionRequestBody, _handleunrecognizedcharacterescape, 0, 4);
                _handleunrecognizedcharacterescape.AudioAttributesImplBaseParcelizer();
                if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                    _validJsonValueList.AudioAttributesImplApi21Parcelizer();
                }
            }
            return getShowPopup.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final getShowPopup write(long j, MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
            if (_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer((i & 3) != 2, i & 1)) {
                if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                    _validJsonValueList.AudioAttributesCompatParcelizer(-317090443, i, -1, "androidx.compose.material.CommonDecorationBox.<anonymous>.<anonymous>.<anonymous> (TextFieldImpl.kt:164)");
                }
                JsonFactory.AudioAttributesCompatParcelizer(j, null, null, magicModuleSubmissionRequestBody, _handleunrecognizedcharacterescape, 0, 6);
                if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                    _validJsonValueList.AudioAttributesImplApi21Parcelizer();
                }
            } else {
                _handleunrecognizedcharacterescape.onPrepareFromSearch();
            }
            return getShowPopup.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final getShowPopup AudioAttributesCompatParcelizer(long j, MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
            if (_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer((i & 3) != 2, i & 1)) {
                if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                    _validJsonValueList.AudioAttributesCompatParcelizer(262889693, i, -1, "androidx.compose.material.CommonDecorationBox.<anonymous>.<anonymous>.<anonymous> (TextFieldImpl.kt:170)");
                }
                JsonFactory.AudioAttributesCompatParcelizer(j, null, null, magicModuleSubmissionRequestBody, _handleunrecognizedcharacterescape, 0, 6);
                if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                    _validJsonValueList.AudioAttributesImplApi21Parcelizer();
                }
            } else {
                _handleunrecognizedcharacterescape.onPrepareFromSearch();
            }
            return getShowPopup.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final getShowPopup IconCompatParcelizer(InputAccessor inputAccessor, getReturnTransition getreturntransition, MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
            if (!_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer((i & 3) != 2, i & 1)) {
                _handleunrecognizedcharacterescape.onPrepareFromSearch();
            } else {
                if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                    _validJsonValueList.AudioAttributesCompatParcelizer(-1107746014, i, -1, "androidx.compose.material.CommonDecorationBox.<anonymous>.<anonymous> (TextFieldImpl.kt:193)");
                }
                _handleOddName _handleoddnameIconCompatParcelizer = getFeature.IconCompatParcelizer(isEnumType.IconCompatParcelizer(_handleOddName.INSTANCE, "border"), ((calloc) inputAccessor.getRemoteActionCompatParcelizer()).getIconCompatParcelizer(), getreturntransition);
                withTypeHandler withtypehandlerWrite = AbsSavedState1.write(_skipWSOrEnd.INSTANCE.MediaBrowserCompatSearchResultReceiver(), true);
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
                NumberOutput.write(_handleunrecognizedcharacterescape2, withtypehandlerWrite, getDependencies.INSTANCE.AudioAttributesImplBaseParcelizer());
                NumberOutput.write(_handleunrecognizedcharacterescape2, _getchardescHandleMediaPlayPauseIfPendingOnHandler, getDependencies.INSTANCE.MediaBrowserCompatItemReceiver());
                MagicModuleSubmissionRequestBody<getDependencies, Integer, getShowPopup> magicModuleSubmissionRequestBodyAudioAttributesCompatParcelizer = getDependencies.INSTANCE.AudioAttributesCompatParcelizer();
                if (_handleunrecognizedcharacterescape2.getParcelableVolumeInfo() || !toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape2.onPause(), Integer.valueOf(iAudioAttributesCompatParcelizer))) {
                    _handleunrecognizedcharacterescape2.RemoteActionCompatParcelizer(Integer.valueOf(iAudioAttributesCompatParcelizer));
                    _handleunrecognizedcharacterescape2.read(Integer.valueOf(iAudioAttributesCompatParcelizer), magicModuleSubmissionRequestBodyAudioAttributesCompatParcelizer);
                }
                NumberOutput.write(_handleunrecognizedcharacterescape2, _handleoddnameRemoteActionCompatParcelizer, getDependencies.INSTANCE.MediaBrowserCompatCustomActionResultReceiver());
                setDrawerElevation setdrawerelevation = setDrawerElevation.INSTANCE;
                if (magicModuleSubmissionRequestBody == null) {
                    _handleunrecognizedcharacterescape.IconCompatParcelizer(-1295979683);
                } else {
                    _handleunrecognizedcharacterescape.IconCompatParcelizer(235288868);
                    magicModuleSubmissionRequestBody.invoke(_handleunrecognizedcharacterescape, 0);
                }
                _handleunrecognizedcharacterescape.MediaBrowserCompatCustomActionResultReceiver();
                _handleunrecognizedcharacterescape.AudioAttributesImplBaseParcelizer();
                if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                    _validJsonValueList.AudioAttributesImplApi21Parcelizer();
                }
            }
            return getShowPopup.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final getShowPopup IconCompatParcelizer(float f, InputAccessor inputAccessor, calloc callocVar) {
            float fIntBitsToFloat = Float.intBitsToFloat((int) (callocVar.getIconCompatParcelizer() >> 32)) * f;
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) callocVar.getIconCompatParcelizer()) * f;
            if (Float.intBitsToFloat((int) (((calloc) inputAccessor.getRemoteActionCompatParcelizer()).getIconCompatParcelizer() >> 32)) != fIntBitsToFloat || Float.intBitsToFloat((int) ((calloc) inputAccessor.getRemoteActionCompatParcelizer()).getIconCompatParcelizer()) != fIntBitsToFloat2) {
                long j = -1;
                inputAccessor.write(calloc.read(calloc.write((((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)))))));
            }
            return getShowPopup.INSTANCE;
        }

        /* JADX WARN: Multi-variable type inference failed */
        RemoteActionCompatParcelizer(MagicModuleSubmissionRequestBody<? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup> magicModuleSubmissionRequestBody, MagicModuleSubmissionRequestBody<? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup> magicModuleSubmissionRequestBody2, String str, FormatSchema formatSchema, boolean z, boolean z2, inset insetVar, MagicModuleSubmissionRequestBody<? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup> magicModuleSubmissionRequestBody3, MagicModuleSubmissionRequestBody<? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup> magicModuleSubmissionRequestBody4, findAndAddVirtualProperties findandaddvirtualproperties, _copyCurrentIntValue _copycurrentintvalue, MagicModuleSubmissionRequestBody<? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup> magicModuleSubmissionRequestBody5, boolean z3, getReturnTransition getreturntransition, boolean z4, MagicModuleSubmissionRequestBody<? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup> magicModuleSubmissionRequestBody6) {
            this.AudioAttributesImplApi26Parcelizer = magicModuleSubmissionRequestBody;
            this.MediaBrowserCompatCustomActionResultReceiver = magicModuleSubmissionRequestBody2;
            this.MediaBrowserCompatSearchResultReceiver = str;
            this.AudioAttributesCompatParcelizer = formatSchema;
            this.IconCompatParcelizer = z;
            this.AudioAttributesImplBaseParcelizer = z2;
            this.MediaBrowserCompatItemReceiver = insetVar;
            this.AudioAttributesImplApi21Parcelizer = magicModuleSubmissionRequestBody3;
            this.MediaMetadataCompat = magicModuleSubmissionRequestBody4;
            this.RatingCompat = findandaddvirtualproperties;
            this.handleMediaPlayPauseIfPendingOnHandler = _copycurrentintvalue;
            this.read = magicModuleSubmissionRequestBody5;
            this.MediaDescriptionCompat = z3;
            this.RemoteActionCompatParcelizer = getreturntransition;
            this.MediaBrowserCompatMediaItem = z4;
            this.write = magicModuleSubmissionRequestBody6;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void AudioAttributesCompatParcelizer(final long r14, kotlin.deserializeWithObjectId r16, java.lang.Float r17, final kotlin.MagicModuleSubmissionRequestBody<? super kotlin._handleUnrecognizedCharacterEscape, ? super java.lang.Integer, kotlin.getShowPopup> r18, kotlin._handleUnrecognizedCharacterEscape r19, final int r20, final int r21) {
        /*
            Method dump skipped, instruction units count: 228
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.JsonFactory.AudioAttributesCompatParcelizer(long, o.deserializeWithObjectId, java.lang.Float, o.MagicModuleSubmissionRequestBody, o._handleUnrecognizedCharacterEscape, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup write(final long j, final Float f, final MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        if (!_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer((i & 3) != 2, i & 1)) {
            _handleunrecognizedcharacterescape.onPrepareFromSearch();
        } else {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(-650790565, i, -1, "androidx.compose.material.Decoration.<anonymous> (TextFieldImpl.kt:239)");
            }
            resetAsNaN.write(R.RemoteActionCompatParcelizer().AudioAttributesCompatParcelizer(switchToNext.write(j)), multiplyFft.AudioAttributesCompatParcelizer(-1624601445, true, new MagicModuleSubmissionRequestBody() { // from class: o.getJavaName
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return JsonFactory.AudioAttributesCompatParcelizer(f, magicModuleSubmissionRequestBody, j, (_handleUnrecognizedCharacterEscape) obj, ((Integer) obj2).intValue());
                }
            }, _handleunrecognizedcharacterescape, 54), _handleunrecognizedcharacterescape, ContentReference.write | 48);
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesCompatParcelizer(Float f, MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody, long j, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        if (_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer((i & 3) != 2, i & 1)) {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(-1624601445, i, -1, "androidx.compose.material.Decoration.<anonymous>.<anonymous> (TextFieldImpl.kt:240)");
            }
            if (f != null) {
                _handleunrecognizedcharacterescape.IconCompatParcelizer(1484860324);
                resetAsNaN.write(AccessToken.AudioAttributesCompatParcelizer().AudioAttributesCompatParcelizer(f), magicModuleSubmissionRequestBody, _handleunrecognizedcharacterescape, ContentReference.write);
                _handleunrecognizedcharacterescape.MediaBrowserCompatCustomActionResultReceiver();
            } else {
                _handleunrecognizedcharacterescape.IconCompatParcelizer(1485059902);
                resetAsNaN.write(AccessToken.AudioAttributesCompatParcelizer().AudioAttributesCompatParcelizer(Float.valueOf(switchToNext.RemoteActionCompatParcelizer(j))), magicModuleSubmissionRequestBody, _handleunrecognizedcharacterescape, ContentReference.write);
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

    public static final _handleOddName AudioAttributesCompatParcelizer(_handleOddName _handleoddname, boolean z, final String str) {
        return z ? withValueInstantiators.read$default(_handleoddname, false, new getAnswerMap() { // from class: o._createContentReference
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return JsonFactory.RemoteActionCompatParcelizer(str, (getConfigOverride) obj);
            }
        }, 1, null) : _handleoddname;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup RemoteActionCompatParcelizer(String str, getConfigOverride getconfigoverride) {
        MapperBuilder.write(getconfigoverride, str);
        return getShowPopup.INSTANCE;
    }

    public static final int read(_parser _parserVar) {
        if (_parserVar != null) {
            return _parserVar.getRead();
        }
        return 0;
    }

    public static final int RemoteActionCompatParcelizer(_parser _parserVar) {
        if (_parserVar != null) {
            return _parserVar.getRemoteActionCompatParcelizer();
        }
        return 0;
    }

    public static final Object read(hasHandlers hashandlers) {
        Object onPrepareFromUri = hashandlers.getOnPrepareFromUri();
        isInterface isinterface = onPrepareFromUri instanceof isInterface ? (isInterface) onPrepareFromUri : null;
        if (isinterface != null) {
            return isinterface.getRemoteActionCompatParcelizer();
        }
        return null;
    }

    public static final float read() {
        return AudioAttributesCompatParcelizer;
    }

    public static final float AudioAttributesCompatParcelizer() {
        return IconCompatParcelizer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup RemoteActionCompatParcelizer(_copyCurrentIntValue _copycurrentintvalue, String str, MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody, addUnresolvedId addunresolvedid, MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody2, MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody3, MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody4, MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody5, boolean z, boolean z2, boolean z3, inset insetVar, getReturnTransition getreturntransition, findAndAddVirtualProperties findandaddvirtualproperties, FormatSchema formatSchema, MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody6, int i, int i2, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i3) {
        IconCompatParcelizer(_copycurrentintvalue, str, magicModuleSubmissionRequestBody, addunresolvedid, magicModuleSubmissionRequestBody2, magicModuleSubmissionRequestBody3, magicModuleSubmissionRequestBody4, magicModuleSubmissionRequestBody5, z, z2, z3, insetVar, getreturntransition, findandaddvirtualproperties, formatSchema, magicModuleSubmissionRequestBody6, _handleunrecognizedcharacterescape, _appendEscaped.RemoteActionCompatParcelizer(i | 1), _appendEscaped.RemoteActionCompatParcelizer(i2));
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup IconCompatParcelizer(long j, deserializeWithObjectId deserializewithobjectid, Float f, MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody, int i, int i2, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i3) {
        AudioAttributesCompatParcelizer(j, deserializewithobjectid, f, magicModuleSubmissionRequestBody, _handleunrecognizedcharacterescape, _appendEscaped.RemoteActionCompatParcelizer(i | 1), i2);
        return getShowPopup.INSTANCE;
    }
}
