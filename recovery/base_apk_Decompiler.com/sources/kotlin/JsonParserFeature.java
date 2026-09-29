package kotlin;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.JsonParserFeature;
import kotlin.Metadata;
import kotlin._handleOddName;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\\\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aj\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\u0011\u0010\u000e\u001a\r\u0012\u0004\u0012\u00020\u00010\u000f¢\u0006\u0002\b\u0010H\u0007¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u008e\u0001\u0010\u0000\u001a\u00020\u00012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00010\u000f2\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0011\u0010\u000e\u001a\r\u0012\u0004\u0012\u00020\u00010\u000f¢\u0006\u0002\b\u0010H\u0007¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u0096\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u00152\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00010\u000f2\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0011\u0010\u000e\u001a\r\u0012\u0004\u0012\u00020\u00010\u000f¢\u0006\u0002\b\u0010H\u0007¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u009c\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u00152\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00010\u001f2\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0011\u0010\u000e\u001a\r\u0012\u0004\u0012\u00020\u00010\u000f¢\u0006\u0002\b\u0010H\u0007¢\u0006\u0004\b\u001b\u0010 \u001a5\u0010!\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020\u00072\b\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000b\u001a\u00020#H\u0003¢\u0006\u0004\b$\u0010%\u001a\u001f\u0010&\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010'\u001a\u00020\nH\u0003¢\u0006\u0004\b(\u0010)\"\u0017\u0010*\u001a\b\u0012\u0004\u0012\u00020\n0+¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-¨\u0006."}, d2 = {"Surface", "", "modifier", "Landroidx/compose/ui/Modifier;", "shape", "Landroidx/compose/ui/graphics/Shape;", TtmlNode.ATTR_TTS_COLOR, "Landroidx/compose/ui/graphics/Color;", "contentColor", "tonalElevation", "Landroidx/compose/ui/unit/Dp;", "shadowElevation", "border", "Landroidx/compose/foundation/BorderStroke;", "content", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "Surface-T9BRK9s", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JJFFLandroidx/compose/foundation/BorderStroke;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "onClick", "enabled", "", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "Surface-o_FOJdg", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;JJFFLandroidx/compose/foundation/BorderStroke;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)V", "selected", "Surface-d85dljk", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;JJFFLandroidx/compose/foundation/BorderStroke;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)V", "checked", "onCheckedChange", "Lkotlin/Function1;", "(ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;JJFFLandroidx/compose/foundation/BorderStroke;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)V", "surface", TtmlNode.ATTR_TTS_BACKGROUND_COLOR, "", "surface-XO-JAsU", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JLandroidx/compose/foundation/BorderStroke;F)Landroidx/compose/ui/Modifier;", "surfaceColorAtElevation", "elevation", "surfaceColorAtElevation-CLU3JFs", "(JFLandroidx/compose/runtime/Composer;I)J", "LocalAbsoluteTonalElevation", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "getLocalAbsoluteTonalElevation", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "material3"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class JsonParserFeature {
    private static final CharacterEscapes<assignParameter> RemoteActionCompatParcelizer = resetAsNaN.RemoteActionCompatParcelizer$default(null, new getCreatedOnDateMs() { // from class: o.skipChildren
        @Override // kotlin.getCreatedOnDateMs
        public final Object invoke() {
            return JsonParserFeature.write();
        }
    }, 1, null);

    public static final void RemoteActionCompatParcelizer(_handleOddName _handleoddname, findAndAddVirtualProperties findandaddvirtualproperties, long j, long j2, float f, float f2, setUncaughtExceptionHandlerui setuncaughtexceptionhandlerui, MagicModuleSubmissionRequestBody<? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup> magicModuleSubmissionRequestBody, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i, int i2) {
        _handleOddName.Companion companion = (i2 & 1) != 0 ? _handleOddName.INSTANCE : _handleoddname;
        findAndAddVirtualProperties findandaddvirtualproperties2 = (i2 & 2) != 0 ? parseVersion.read() : findandaddvirtualproperties;
        long handleMediaPlayPauseIfPendingOnHandler = (i2 & 4) != 0 ? getCurrentName.INSTANCE.AudioAttributesCompatParcelizer(_handleunrecognizedcharacterescape, 6).getHandleMediaPlayPauseIfPendingOnHandler() : j;
        long jRemoteActionCompatParcelizer = (i2 & 8) != 0 ? writeOmittedField.RemoteActionCompatParcelizer(handleMediaPlayPauseIfPendingOnHandler, _handleunrecognizedcharacterescape, (i >> 6) & 14) : j2;
        float fIconCompatParcelizer = (i2 & 16) != 0 ? assignParameter.IconCompatParcelizer(BitmapDescriptorFactory.HUE_RED) : f;
        float fIconCompatParcelizer2 = (i2 & 32) != 0 ? assignParameter.IconCompatParcelizer(BitmapDescriptorFactory.HUE_RED) : f2;
        setUncaughtExceptionHandlerui setuncaughtexceptionhandlerui2 = (i2 & 64) != 0 ? null : setuncaughtexceptionhandlerui;
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesCompatParcelizer(-1093433818, i, -1, "androidx.compose.material3.Surface (Surface.kt:104)");
        }
        CharacterEscapes<assignParameter> characterEscapes = RemoteActionCompatParcelizer;
        float fIconCompatParcelizer3 = assignParameter.IconCompatParcelizer(((assignParameter) _handleunrecognizedcharacterescape.write(characterEscapes)).getRemoteActionCompatParcelizer() + fIconCompatParcelizer);
        resetAsNaN.AudioAttributesCompatParcelizer(new ContentReference[]{writeTypeSuffix.IconCompatParcelizer().AudioAttributesCompatParcelizer(switchToNext.write(jRemoteActionCompatParcelizer)), characterEscapes.AudioAttributesCompatParcelizer(assignParameter.read(fIconCompatParcelizer3))}, multiplyFft.AudioAttributesCompatParcelizer(421772006, true, new AudioAttributesCompatParcelizer(companion, findandaddvirtualproperties2, handleMediaPlayPauseIfPendingOnHandler, fIconCompatParcelizer3, setuncaughtexceptionhandlerui2, fIconCompatParcelizer2, magicModuleSubmissionRequestBody), _handleunrecognizedcharacterescape, 54), _handleunrecognizedcharacterescape, ContentReference.write | 48);
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesImplApi21Parcelizer();
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AudioAttributesCompatParcelizer implements MagicModuleSubmissionRequestBody<_handleUnrecognizedCharacterEscape, Integer, getShowPopup> {
        final /* synthetic */ setUncaughtExceptionHandlerui AudioAttributesCompatParcelizer;
        final /* synthetic */ findAndAddVirtualProperties AudioAttributesImplApi26Parcelizer;
        final /* synthetic */ float AudioAttributesImplBaseParcelizer;
        final /* synthetic */ _handleOddName IconCompatParcelizer;
        final /* synthetic */ long RemoteActionCompatParcelizer;
        final /* synthetic */ MagicModuleSubmissionRequestBody<_handleUnrecognizedCharacterEscape, Integer, getShowPopup> read;
        final /* synthetic */ float write;

        @Override // kotlin.MagicModuleSubmissionRequestBody
        public final /* synthetic */ getShowPopup invoke(_handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, Integer num) {
            AudioAttributesCompatParcelizer(_handleunrecognizedcharacterescape, num.intValue());
            return getShowPopup.INSTANCE;
        }

        public final void AudioAttributesCompatParcelizer(_handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
            if (_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer((i & 3) != 2, i & 1)) {
                if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                    _validJsonValueList.AudioAttributesCompatParcelizer(421772006, i, -1, "androidx.compose.material3.Surface.<anonymous> (Surface.kt:110)");
                }
                _handleOddName _handleoddnameIconCompatParcelizer = JsonParserFeature.IconCompatParcelizer(this.IconCompatParcelizer, this.AudioAttributesImplApi26Parcelizer, JsonParserFeature.read(this.RemoteActionCompatParcelizer, this.write, _handleunrecognizedcharacterescape, 0), this.AudioAttributesCompatParcelizer, ((bufferMapProperty) _handleunrecognizedcharacterescape.write(getDefaultNullValueSerializer.IconCompatParcelizer())).AudioAttributesCompatParcelizer(this.AudioAttributesImplBaseParcelizer));
                Object objOnPause = _handleunrecognizedcharacterescape.onPause();
                if (objOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                    objOnPause = new getAnswerMap() { // from class: o.JsonPointer
                        @Override // kotlin.getAnswerMap
                        public final Object invoke(Object obj) {
                            return JsonParserFeature.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer((getConfigOverride) obj);
                        }
                    };
                    _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause);
                }
                _handleOddName _handleoddname = withValueInstantiators.read(_handleoddnameIconCompatParcelizer, false, (getAnswerMap) objOnPause);
                getShowPopup getshowpopup = getShowPopup.INSTANCE;
                RemoteActionCompatParcelizer remoteActionCompatParcelizerOnPause = _handleunrecognizedcharacterescape.onPause();
                if (remoteActionCompatParcelizerOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                    remoteActionCompatParcelizerOnPause = RemoteActionCompatParcelizer.write;
                    _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(remoteActionCompatParcelizerOnPause);
                }
                _handleOddName _handleoddnameIconCompatParcelizer2 = hasSomeOfFeatures.IconCompatParcelizer(_handleoddname, getshowpopup, (PointerInputEventHandler) remoteActionCompatParcelizerOnPause);
                MagicModuleSubmissionRequestBody<_handleUnrecognizedCharacterEscape, Integer, getShowPopup> magicModuleSubmissionRequestBody = this.read;
                withTypeHandler withtypehandlerWrite = AbsSavedState1.write(_skipWSOrEnd.INSTANCE.MediaBrowserCompatSearchResultReceiver(), true);
                int iAudioAttributesCompatParcelizer = _getBigDecimal.AudioAttributesCompatParcelizer(_handleunrecognizedcharacterescape, 0);
                _getCharDesc _getchardescHandleMediaPlayPauseIfPendingOnHandler = _handleunrecognizedcharacterescape.handleMediaPlayPauseIfPendingOnHandler();
                _handleOddName _handleoddnameRemoteActionCompatParcelizer = _verifyNLZ2.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape, _handleoddnameIconCompatParcelizer2);
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
                    return;
                }
                return;
            }
            _handleunrecognizedcharacterescape.onPrepareFromSearch();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final getShowPopup RemoteActionCompatParcelizer(getConfigOverride getconfigoverride) {
            MapperBuilder.RemoteActionCompatParcelizer(getconfigoverride, true);
            return getShowPopup.INSTANCE;
        }

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        static final class RemoteActionCompatParcelizer implements PointerInputEventHandler {
            public static final RemoteActionCompatParcelizer write = new RemoteActionCompatParcelizer();

            @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
            public final Object invoke(handleBadMerge handlebadmerge, SampleVideos<? super getShowPopup> sampleVideos) {
                return getShowPopup.INSTANCE;
            }

            RemoteActionCompatParcelizer() {
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        AudioAttributesCompatParcelizer(_handleOddName _handleoddname, findAndAddVirtualProperties findandaddvirtualproperties, long j, float f, setUncaughtExceptionHandlerui setuncaughtexceptionhandlerui, float f2, MagicModuleSubmissionRequestBody<? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup> magicModuleSubmissionRequestBody) {
            this.IconCompatParcelizer = _handleoddname;
            this.AudioAttributesImplApi26Parcelizer = findandaddvirtualproperties;
            this.RemoteActionCompatParcelizer = j;
            this.write = f;
            this.AudioAttributesCompatParcelizer = setuncaughtexceptionhandlerui;
            this.AudioAttributesImplBaseParcelizer = f2;
            this.read = magicModuleSubmissionRequestBody;
        }
    }

    public static final void write(getCreatedOnDateMs<getShowPopup> getcreatedondatems, _handleOddName _handleoddname, boolean z, findAndAddVirtualProperties findandaddvirtualproperties, long j, long j2, float f, float f2, setUncaughtExceptionHandlerui setuncaughtexceptionhandlerui, hashCode hashcode, MagicModuleSubmissionRequestBody<? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup> magicModuleSubmissionRequestBody, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i, int i2, int i3) {
        _handleOddName _handleoddname2 = (i3 & 2) != 0 ? _handleOddName.INSTANCE : _handleoddname;
        boolean z2 = (i3 & 4) != 0 ? true : z;
        findAndAddVirtualProperties findandaddvirtualproperties2 = (i3 & 8) != 0 ? parseVersion.read() : findandaddvirtualproperties;
        long handleMediaPlayPauseIfPendingOnHandler = (i3 & 16) != 0 ? getCurrentName.INSTANCE.AudioAttributesCompatParcelizer(_handleunrecognizedcharacterescape, 6).getHandleMediaPlayPauseIfPendingOnHandler() : j;
        long jRemoteActionCompatParcelizer = (i3 & 32) != 0 ? writeOmittedField.RemoteActionCompatParcelizer(handleMediaPlayPauseIfPendingOnHandler, _handleunrecognizedcharacterescape, (i >> 12) & 14) : j2;
        float fIconCompatParcelizer = (i3 & 64) != 0 ? assignParameter.IconCompatParcelizer(BitmapDescriptorFactory.HUE_RED) : f;
        float fIconCompatParcelizer2 = (i3 & 128) != 0 ? assignParameter.IconCompatParcelizer(BitmapDescriptorFactory.HUE_RED) : f2;
        setUncaughtExceptionHandlerui setuncaughtexceptionhandlerui2 = (i3 & 256) != 0 ? null : setuncaughtexceptionhandlerui;
        hashCode hashcode2 = (i3 & 512) == 0 ? hashcode : null;
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesCompatParcelizer(-1472753265, i, i2, "androidx.compose.material3.Surface (Surface.kt:207)");
        }
        if (hashcode2 == null) {
            _handleunrecognizedcharacterescape.IconCompatParcelizer(-1701037204);
            Object objOnPause = _handleunrecognizedcharacterescape.onPause();
            if (objOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause = isConsumed.RemoteActionCompatParcelizer();
                _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause);
            }
            hashcode2 = (hashCode) objOnPause;
        } else {
            _handleunrecognizedcharacterescape.IconCompatParcelizer(2023337163);
        }
        _handleunrecognizedcharacterescape.MediaBrowserCompatCustomActionResultReceiver();
        CharacterEscapes<assignParameter> characterEscapes = RemoteActionCompatParcelizer;
        float fIconCompatParcelizer3 = assignParameter.IconCompatParcelizer(((assignParameter) _handleunrecognizedcharacterescape.write(characterEscapes)).getRemoteActionCompatParcelizer() + fIconCompatParcelizer);
        resetAsNaN.AudioAttributesCompatParcelizer(new ContentReference[]{writeTypeSuffix.IconCompatParcelizer().AudioAttributesCompatParcelizer(switchToNext.write(jRemoteActionCompatParcelizer)), characterEscapes.AudioAttributesCompatParcelizer(assignParameter.read(fIconCompatParcelizer3))}, multiplyFft.AudioAttributesCompatParcelizer(849208527, true, new IconCompatParcelizer(_handleoddname2, findandaddvirtualproperties2, handleMediaPlayPauseIfPendingOnHandler, fIconCompatParcelizer3, setuncaughtexceptionhandlerui2, hashcode2, z2, getcreatedondatems, fIconCompatParcelizer2, magicModuleSubmissionRequestBody), _handleunrecognizedcharacterescape, 54), _handleunrecognizedcharacterescape, ContentReference.write | 48);
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesImplApi21Parcelizer();
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class IconCompatParcelizer implements MagicModuleSubmissionRequestBody<_handleUnrecognizedCharacterEscape, Integer, getShowPopup> {
        final /* synthetic */ MagicModuleSubmissionRequestBody<_handleUnrecognizedCharacterEscape, Integer, getShowPopup> AudioAttributesCompatParcelizer;
        final /* synthetic */ hashCode AudioAttributesImplApi21Parcelizer;
        final /* synthetic */ findAndAddVirtualProperties AudioAttributesImplApi26Parcelizer;
        final /* synthetic */ _handleOddName AudioAttributesImplBaseParcelizer;
        final /* synthetic */ boolean IconCompatParcelizer;
        final /* synthetic */ getCreatedOnDateMs<getShowPopup> MediaBrowserCompatCustomActionResultReceiver;
        final /* synthetic */ float MediaBrowserCompatItemReceiver;
        final /* synthetic */ float RemoteActionCompatParcelizer;
        final /* synthetic */ long read;
        final /* synthetic */ setUncaughtExceptionHandlerui write;

        @Override // kotlin.MagicModuleSubmissionRequestBody
        public final /* synthetic */ getShowPopup invoke(_handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, Integer num) {
            RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape, num.intValue());
            return getShowPopup.INSTANCE;
        }

        public final void RemoteActionCompatParcelizer(_handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
            if (!_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer((i & 3) != 2, i & 1)) {
                _handleunrecognizedcharacterescape.onPrepareFromSearch();
                return;
            }
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(849208527, i, -1, "androidx.compose.material3.Surface.<anonymous> (Surface.kt:215)");
            }
            _handleOddName _handleoddnameIconCompatParcelizer$default = isStructStart.IconCompatParcelizer$default(getLocalSavedStateRegistryOwner.IconCompatParcelizer$default(JsonParserFeature.IconCompatParcelizer(currentTokenId.read(this.AudioAttributesImplBaseParcelizer), this.AudioAttributesImplApi26Parcelizer, JsonParserFeature.read(this.read, this.RemoteActionCompatParcelizer, _handleunrecognizedcharacterescape, 0), this.write, ((bufferMapProperty) _handleunrecognizedcharacterescape.write(getDefaultNullValueSerializer.IconCompatParcelizer())).AudioAttributesCompatParcelizer(this.MediaBrowserCompatItemReceiver)), this.AudioAttributesImplApi21Parcelizer, hasTextCharacters.write$default(false, BitmapDescriptorFactory.HUE_RED, 0L, 7, null), this.IconCompatParcelizer, null, null, this.MediaBrowserCompatCustomActionResultReceiver, 24, null), null, 1, null);
            MagicModuleSubmissionRequestBody<_handleUnrecognizedCharacterEscape, Integer, getShowPopup> magicModuleSubmissionRequestBody = this.AudioAttributesCompatParcelizer;
            withTypeHandler withtypehandlerWrite = AbsSavedState1.write(_skipWSOrEnd.INSTANCE.MediaBrowserCompatSearchResultReceiver(), true);
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

        /* JADX WARN: Multi-variable type inference failed */
        IconCompatParcelizer(_handleOddName _handleoddname, findAndAddVirtualProperties findandaddvirtualproperties, long j, float f, setUncaughtExceptionHandlerui setuncaughtexceptionhandlerui, hashCode hashcode, boolean z, getCreatedOnDateMs<getShowPopup> getcreatedondatems, float f2, MagicModuleSubmissionRequestBody<? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup> magicModuleSubmissionRequestBody) {
            this.AudioAttributesImplBaseParcelizer = _handleoddname;
            this.AudioAttributesImplApi26Parcelizer = findandaddvirtualproperties;
            this.read = j;
            this.RemoteActionCompatParcelizer = f;
            this.write = setuncaughtexceptionhandlerui;
            this.AudioAttributesImplApi21Parcelizer = hashcode;
            this.IconCompatParcelizer = z;
            this.MediaBrowserCompatCustomActionResultReceiver = getcreatedondatems;
            this.MediaBrowserCompatItemReceiver = f2;
            this.AudioAttributesCompatParcelizer = magicModuleSubmissionRequestBody;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final _handleOddName IconCompatParcelizer(_handleOddName _handleoddname, findAndAddVirtualProperties findandaddvirtualproperties, long j, setUncaughtExceptionHandlerui setuncaughtexceptionhandlerui, float f) {
        _handleOddName.Companion companionAudioAttributesCompatParcelizer$default;
        findAndAddVirtualProperties findandaddvirtualproperties2;
        _handleOddName.Companion companionWrite;
        if (f > BitmapDescriptorFactory.HUE_RED) {
            companionAudioAttributesCompatParcelizer$default = expand.AudioAttributesCompatParcelizer$default(_handleOddName.INSTANCE, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 0L, findandaddvirtualproperties, false, null, 0L, 0L, 0, 124895, null);
        } else {
            companionAudioAttributesCompatParcelizer$default = _handleOddName.INSTANCE;
        }
        _handleOddName _handleoddnameAudioAttributesCompatParcelizer = _handleoddname.AudioAttributesCompatParcelizer(companionAudioAttributesCompatParcelizer$default);
        if (setuncaughtexceptionhandlerui != null) {
            findandaddvirtualproperties2 = findandaddvirtualproperties;
            companionWrite = setConfiguration.write(_handleOddName.INSTANCE, setuncaughtexceptionhandlerui, findandaddvirtualproperties2);
        } else {
            findandaddvirtualproperties2 = findandaddvirtualproperties;
            companionWrite = _handleOddName.INSTANCE;
        }
        return _handleUnexpectedValue.RemoteActionCompatParcelizer(getFrameEndSchedulerui.IconCompatParcelizer(_handleoddnameAudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(companionWrite), j, findandaddvirtualproperties2), findandaddvirtualproperties2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long read(long j, float f, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesCompatParcelizer(-2079918090, i, -1, "androidx.compose.material3.surfaceColorAtElevation (Surface.kt:478)");
        }
        long j2 = writeOmittedField.read(getCurrentName.INSTANCE.AudioAttributesCompatParcelizer(_handleunrecognizedcharacterescape, 6), j, f, _handleunrecognizedcharacterescape, (i << 3) & AnalyticsListener.EVENT_AUDIO_DECODER_INITIALIZED);
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesImplApi21Parcelizer();
        }
        return j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final assignParameter write() {
        return assignParameter.read(assignParameter.IconCompatParcelizer(BitmapDescriptorFactory.HUE_RED));
    }
}
