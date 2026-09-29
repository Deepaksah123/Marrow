package kotlin;

import android.content.Context;
import android.net.Uri;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.RendererCapabilities;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow.R;
import com.marrow.designsystem.theme.MarrowTheme;
import com.marrow.designsystem.theme.TypeKt;
import kotlin.ExoPlayerBuilderExternalSyntheticLambda10;
import kotlin._handleOddName;
import kotlin.lambdamaybeNotifySurfaceSizeChanged27;
import org.apache.commons.compress.archivers.cpio.CpioConstants;

/* JADX INFO: loaded from: classes4.dex */
public final class setMapStyle {
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final void write(_handleOddName _handleoddname, final String str, final String str2, final String str3, final Uri uri, final getCreatedOnDateMs<getShowPopup> getcreatedondatems, final getAnswerMap<? super String, getShowPopup> getanswermap, final int i, final getCreatedOnDateMs<getShowPopup> getcreatedondatems2, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, final int i2, final int i3) {
        _handleOddName _handleoddname2;
        int i4;
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        toMagicModuleMetaRepoModel.write(str3, "");
        toMagicModuleMetaRepoModel.write(uri, "");
        toMagicModuleMetaRepoModel.write(getcreatedondatems, "");
        toMagicModuleMetaRepoModel.write(getanswermap, "");
        toMagicModuleMetaRepoModel.write(getcreatedondatems2, "");
        _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescapeWrite = _handleunrecognizedcharacterescape.write(2025200457);
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
            i4 |= _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(str) ? 32 : 16;
        }
        if ((i2 & RendererCapabilities.MODE_SUPPORT_MASK) == 0) {
            i4 |= _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(str2) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(str3) ? 2048 : 1024;
        }
        if ((i2 & CpioConstants.C_ISBLK) == 0) {
            i4 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(uri) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i4 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(getcreatedondatems) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE;
        }
        if ((1572864 & i2) == 0) {
            i4 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(getanswermap) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((12582912 & i2) == 0) {
            i4 |= _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(i) ? 8388608 : 4194304;
        }
        if ((i2 & 100663296) == 0) {
            i4 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(getcreatedondatems2) ? 67108864 : 33554432;
        }
        if (!_handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer((i4 & 38347923) != 38347922, i4 & 1)) {
            _handleunrecognizedcharacterescapeWrite.onPrepareFromSearch();
        } else {
            _handleOddName.Companion companion = i5 != 0 ? _handleOddName.INSTANCE : _handleoddname2;
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(2025200457, i4, -1, "com.marrow2.ui.settings.kyc.name.KycNameConfirmationView (KycNameConfirmationLayout.kt:53)");
            }
            final BaseSettings baseSettings = (BaseSettings) _handleunrecognizedcharacterescapeWrite.write(getDefaultNullValueSerializer.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver());
            _handleOddName _handleoddnameIconCompatParcelizer$default = getFrameEndSchedulerui.IconCompatParcelizer$default(isAdded.IconCompatParcelizer$default(companion, BitmapDescriptorFactory.HUE_RED, 1, null), enabled.INSTANCE.write(_handleunrecognizedcharacterescapeWrite, enabled.RemoteActionCompatParcelizer).read(), null, 2, null);
            _handleOddName _handleoddname3 = companion;
            withTypeHandler withtypehandler = setValue.read(WindowInsetsCompatImpl30.INSTANCE.MediaBrowserCompatCustomActionResultReceiver(), _skipWSOrEnd.INSTANCE.RatingCompat(), _handleunrecognizedcharacterescapeWrite, 0);
            int iHashCode = Long.hashCode(_getBigDecimal.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, 0));
            _getCharDesc _getchardescHandleMediaPlayPauseIfPendingOnHandler = _handleunrecognizedcharacterescapeWrite.handleMediaPlayPauseIfPendingOnHandler();
            _handleOddName _handleoddnameRemoteActionCompatParcelizer = _verifyNLZ2.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, _handleoddnameIconCompatParcelizer$default);
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
            NumberOutput.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape2, Integer.valueOf(iHashCode), getDependencies.INSTANCE.AudioAttributesCompatParcelizer());
            NumberOutput.write(_handleunrecognizedcharacterescape2, getDependencies.INSTANCE.write());
            NumberOutput.write(_handleunrecognizedcharacterescape2, _handleoddnameRemoteActionCompatParcelizer, getDependencies.INSTANCE.MediaBrowserCompatCustomActionResultReceiver());
            _handleOddName _handleoddnameIconCompatParcelizer$default2 = isAdded.IconCompatParcelizer$default(setVerticalAlign.IconCompatParcelizer(getParentFragment.write$default(DrawerLayoutLayoutParams.read$default(DrawerLayoutSavedState.INSTANCE, _handleOddName.INSTANCE, 1.0f, false, 2, null), assignParameter.IconCompatParcelizer(20.0f), BitmapDescriptorFactory.HUE_RED, 2, null), setVerticalAlign.write(0, _handleunrecognizedcharacterescapeWrite, 0, 1), false, null, false, 14, null), BitmapDescriptorFactory.HUE_RED, 1, null);
            withTypeHandler withtypehandler2 = setValue.read(WindowInsetsCompatImpl30.INSTANCE.MediaBrowserCompatCustomActionResultReceiver(), _skipWSOrEnd.INSTANCE.RatingCompat(), _handleunrecognizedcharacterescapeWrite, 0);
            int iHashCode2 = Long.hashCode(_getBigDecimal.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, 0));
            _getCharDesc _getchardescHandleMediaPlayPauseIfPendingOnHandler2 = _handleunrecognizedcharacterescapeWrite.handleMediaPlayPauseIfPendingOnHandler();
            _handleOddName _handleoddnameRemoteActionCompatParcelizer2 = _verifyNLZ2.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, _handleoddnameIconCompatParcelizer$default2);
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
            NumberOutput.write(_handleunrecognizedcharacterescape3, withtypehandler2, getDependencies.INSTANCE.AudioAttributesImplBaseParcelizer());
            NumberOutput.write(_handleunrecognizedcharacterescape3, _getchardescHandleMediaPlayPauseIfPendingOnHandler2, getDependencies.INSTANCE.MediaBrowserCompatItemReceiver());
            NumberOutput.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape3, Integer.valueOf(iHashCode2), getDependencies.INSTANCE.AudioAttributesCompatParcelizer());
            NumberOutput.write(_handleunrecognizedcharacterescape3, getDependencies.INSTANCE.write());
            NumberOutput.write(_handleunrecognizedcharacterescape3, _handleoddnameRemoteActionCompatParcelizer2, getDependencies.INSTANCE.MediaBrowserCompatCustomActionResultReceiver());
            DrawerLayoutSavedState drawerLayoutSavedState = DrawerLayoutSavedState.INSTANCE;
            _handleOddName _handleoddnameAudioAttributesCompatParcelizer$default = getParentFragment.AudioAttributesCompatParcelizer$default(_handleOddName.INSTANCE, BitmapDescriptorFactory.HUE_RED, assignParameter.IconCompatParcelizer(20.0f), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13, null);
            boolean z = (234881024 & i4) == 67108864;
            Object objOnPause = _handleunrecognizedcharacterescapeWrite.onPause();
            if (z || objOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause = new getCreatedOnDateMs() { // from class: o.setLocationSource
                    @Override // kotlin.getCreatedOnDateMs
                    public final Object invoke() {
                        return setMapStyle.read(getcreatedondatems2);
                    }
                };
                _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(objOnPause);
            }
            int i6 = i4;
            deactivate.read(_handleoddnameAudioAttributesCompatParcelizer$default, 4, i, null, (getCreatedOnDateMs) objOnPause, _handleunrecognizedcharacterescapeWrite, ((i4 >> 15) & 896) | 54, 8);
            _copyCurrentStringValue.IconCompatParcelizer(singleArgCreatorDefaultsToProperties.read(R.string.confirm_name_on_doc, _handleunrecognizedcharacterescapeWrite, 6), isAdded.RemoteActionCompatParcelizer$default(getParentFragment.AudioAttributesCompatParcelizer$default(_handleOddName.INSTANCE, BitmapDescriptorFactory.HUE_RED, assignParameter.IconCompatParcelizer(10.0f), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13, null), BitmapDescriptorFactory.HUE_RED, 1, null), enabled.INSTANCE.write(_handleunrecognizedcharacterescapeWrite, enabled.RemoteActionCompatParcelizer).MediaBrowserCompatItemReceiver(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, enabled.INSTANCE.IconCompatParcelizer(_handleunrecognizedcharacterescapeWrite, enabled.RemoteActionCompatParcelizer).getAudioAttributesCompatParcelizer(), _handleunrecognizedcharacterescapeWrite, 48, 0, 65528);
            _copyCurrentStringValue.IconCompatParcelizer(singleArgCreatorDefaultsToProperties.RemoteActionCompatParcelizer(R.string.confirm_marrow_name, new Object[]{str, str3}, _handleunrecognizedcharacterescapeWrite, 6), isAdded.RemoteActionCompatParcelizer$default(getParentFragment.AudioAttributesCompatParcelizer$default(_handleOddName.INSTANCE, BitmapDescriptorFactory.HUE_RED, assignParameter.IconCompatParcelizer(2.0f), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13, null), BitmapDescriptorFactory.HUE_RED, 1, null), enabled.INSTANCE.write(_handleunrecognizedcharacterescapeWrite, enabled.RemoteActionCompatParcelizer).MediaBrowserCompatItemReceiver(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, TypeKt.AudioAttributesCompatParcelizer(enabled.INSTANCE.IconCompatParcelizer(_handleunrecognizedcharacterescapeWrite, enabled.RemoteActionCompatParcelizer)), _handleunrecognizedcharacterescapeWrite, 48, 0, 65528);
            Object objOnPause2 = _handleunrecognizedcharacterescapeWrite.onPause();
            if (objOnPause2 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause2 = new secondaryCount();
                _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(objOnPause2);
            }
            secondaryCount secondarycount = (secondaryCount) objOnPause2;
            Object[] objArr = new Object[0];
            Object objOnPause3 = _handleunrecognizedcharacterescapeWrite.onPause();
            if (objOnPause3 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause3 = new getCreatedOnDateMs() { // from class: o.setMaxZoomPreference
                    @Override // kotlin.getCreatedOnDateMs
                    public final Object invoke() {
                        return setMapStyle.IconCompatParcelizer();
                    }
                };
                _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(objOnPause3);
            }
            final InputAccessor inputAccessor = (InputAccessor) addTimesI.read(objArr, (getCreatedOnDateMs) objOnPause3, _handleunrecognizedcharacterescapeWrite, 48);
            Object objOnPause4 = _handleunrecognizedcharacterescapeWrite.onPause();
            if (objOnPause4 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause4 = available.RemoteActionCompatParcelizer$default(new hasValueTypeDeserializer("", 0L, (findProperty) null, 6, (MagicModuleRepositoryImplExternalSyntheticLambda0) null), null, 2, null);
                _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(objOnPause4);
            }
            final InputAccessor inputAccessor2 = (InputAccessor) objOnPause4;
            boolean z2 = (i6 & 896) == 256;
            RemoteActionCompatParcelizer remoteActionCompatParcelizerOnPause = _handleunrecognizedcharacterescapeWrite.onPause();
            if (z2 || remoteActionCompatParcelizerOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                remoteActionCompatParcelizerOnPause = new RemoteActionCompatParcelizer(str2, inputAccessor2, null);
                _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(remoteActionCompatParcelizerOnPause);
            }
            StreamReadException.IconCompatParcelizer(str2, (MagicModuleSubmissionRequestBody) remoteActionCompatParcelizerOnPause, _handleunrecognizedcharacterescapeWrite, (i6 >> 6) & 14);
            hasValueTypeDeserializer hasvaluetypedeserializerAudioAttributesImplApi21Parcelizer = AudioAttributesImplApi21Parcelizer(inputAccessor2);
            _handleOddName _handleoddnameRemoteActionCompatParcelizer$default = isAdded.RemoteActionCompatParcelizer$default(getParentFragment.AudioAttributesCompatParcelizer$default(spilloverCount.AudioAttributesCompatParcelizer(_handleOddName.INSTANCE, secondarycount), BitmapDescriptorFactory.HUE_RED, assignParameter.IconCompatParcelizer(30.0f), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13, null), BitmapDescriptorFactory.HUE_RED, 1, null);
            boolean zAudioAttributesCompatParcelizer = _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(inputAccessor);
            Object objOnPause5 = _handleunrecognizedcharacterescapeWrite.onPause();
            if (zAudioAttributesCompatParcelizer || objOnPause5 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause5 = new getCreatedOnDateMs() { // from class: o.setLatLngBoundsForCameraTarget
                    @Override // kotlin.getCreatedOnDateMs
                    public final Object invoke() {
                        return setMapStyle.AudioAttributesImplBaseParcelizer(inputAccessor);
                    }
                };
                _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(objOnPause5);
            }
            _handleOddName _handleoddnameRemoteActionCompatParcelizer$default2 = getLocalSavedStateRegistryOwner.RemoteActionCompatParcelizer$default(_handleoddnameRemoteActionCompatParcelizer$default, false, null, null, null, (getCreatedOnDateMs) objOnPause5, 15, null);
            setKeepContentOnPlayerReset setkeepcontentonplayerreset = new setKeepContentOnPlayerReset(0, null, getPropertyName.INSTANCE.AudioAttributesCompatParcelizer(), ResolvableDeserializer.INSTANCE.RemoteActionCompatParcelizer(), null, null, null, 115, null);
            boolean zAudioAttributesCompatParcelizer2 = _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(baseSettings);
            Object objOnPause6 = _handleunrecognizedcharacterescapeWrite.onPause();
            if (zAudioAttributesCompatParcelizer2 || objOnPause6 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause6 = new getAnswerMap() { // from class: o.setMapType
                    @Override // kotlin.getAnswerMap
                    public final Object invoke(Object obj) {
                        return setMapStyle.read(baseSettings, (setDefaultArtwork) obj);
                    }
                };
                _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(objOnPause6);
            }
            setErrorMessageProvider seterrormessageprovider = new setErrorMessageProvider((getAnswerMap) objOnPause6, null, null, null, null, null, 62, null);
            FormatFeature formatFeature = FormatFeature.write;
            long j = enabled.INSTANCE.write(_handleunrecognizedcharacterescapeWrite, enabled.RemoteActionCompatParcelizer).read();
            MarrowTheme marrowTheme = MarrowTheme.INSTANCE;
            long onSetPlaybackSpeed = MarrowTheme.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, MarrowTheme.RemoteActionCompatParcelizer).getOnSetPlaybackSpeed();
            MarrowTheme marrowTheme2 = MarrowTheme.INSTANCE;
            long onPrepareFromUri = MarrowTheme.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, MarrowTheme.RemoteActionCompatParcelizer).getOnPrepareFromUri();
            long jMediaBrowserCompatItemReceiver = enabled.INSTANCE.write(_handleunrecognizedcharacterescapeWrite, enabled.RemoteActionCompatParcelizer).MediaBrowserCompatItemReceiver();
            MarrowTheme marrowTheme3 = MarrowTheme.INSTANCE;
            long onSetPlaybackSpeed2 = MarrowTheme.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, MarrowTheme.RemoteActionCompatParcelizer).getOnSetPlaybackSpeed();
            MarrowTheme marrowTheme4 = MarrowTheme.INSTANCE;
            long onSetPlaybackSpeed3 = MarrowTheme.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, MarrowTheme.RemoteActionCompatParcelizer).getOnSetPlaybackSpeed();
            MarrowTheme marrowTheme5 = MarrowTheme.INSTANCE;
            FormatSchema formatSchema = formatFeature.read(jMediaBrowserCompatItemReceiver, 0L, j, onSetPlaybackSpeed3, 0L, onPrepareFromUri, onSetPlaybackSpeed, 0L, 0L, onSetPlaybackSpeed2, 0L, 0L, 0L, 0L, 0L, MarrowTheme.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, MarrowTheme.RemoteActionCompatParcelizer).getOnSetPlaybackSpeed(), 0L, 0L, 0L, 0L, 0L, _handleunrecognizedcharacterescapeWrite, 0, 0, 48, 2063762);
            boolean zAudioAttributesImplApi26Parcelizer = AudioAttributesImplApi26Parcelizer(inputAccessor);
            boolean z3 = (3670016 & i6) == 1048576;
            Object objOnPause7 = _handleunrecognizedcharacterescapeWrite.onPause();
            if (z3 || objOnPause7 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause7 = new getAnswerMap() { // from class: o.setOnCameraChangeListener
                    @Override // kotlin.getAnswerMap
                    public final Object invoke(Object obj) {
                        return setMapStyle.RemoteActionCompatParcelizer(getanswermap, inputAccessor2, (hasValueTypeDeserializer) obj);
                    }
                };
                _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(objOnPause7);
            }
            getMapType getmaptype = getMapType.AudioAttributesCompatParcelizer;
            _getBufferRecycler.AudioAttributesCompatParcelizer(hasvaluetypedeserializerAudioAttributesImplApi21Parcelizer, (getAnswerMap) objOnPause7, _handleoddnameRemoteActionCompatParcelizer$default2, zAudioAttributesImplApi26Parcelizer, false, null, getMapType.read(), null, null, multiplyFft.AudioAttributesCompatParcelizer(-1897789906, true, new MagicModuleSubmissionRequestBody() { // from class: o.setMyLocationEnabled
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return setMapStyle.RemoteActionCompatParcelizer(inputAccessor, (_handleUnrecognizedCharacterEscape) obj, ((Integer) obj2).intValue());
                }
            }, _handleunrecognizedcharacterescapeWrite, 54), false, null, setkeepcontentonplayerreset, seterrormessageprovider, true, 0, 0, null, null, formatSchema, _handleunrecognizedcharacterescapeWrite, 806879232, 24960, 495024);
            boolean zAudioAttributesImplApi26Parcelizer2 = AudioAttributesImplApi26Parcelizer(inputAccessor);
            boolean zAudioAttributesCompatParcelizer3 = _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(inputAccessor);
            AudioAttributesCompatParcelizer audioAttributesCompatParcelizerOnPause = _handleunrecognizedcharacterescapeWrite.onPause();
            if (zAudioAttributesCompatParcelizer3 || audioAttributesCompatParcelizerOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                audioAttributesCompatParcelizerOnPause = new AudioAttributesCompatParcelizer(secondarycount, inputAccessor, null);
                _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(audioAttributesCompatParcelizerOnPause);
            }
            StreamReadException.IconCompatParcelizer(Boolean.valueOf(zAudioAttributesImplApi26Parcelizer2), (MagicModuleSubmissionRequestBody) audioAttributesCompatParcelizerOnPause, _handleunrecognizedcharacterescapeWrite, 0);
            _handleunrecognizedcharacterescapeWrite.read(604400049);
            ExoPlayerBuilderExternalSyntheticLambda10.RemoteActionCompatParcelizer remoteActionCompatParcelizer = ExoPlayerBuilderExternalSyntheticLambda10.RemoteActionCompatParcelizer.IconCompatParcelizer;
            setAnalyticsCollector setanalyticscollectorIconCompatParcelizer = ExoPlayerBuilderExternalSyntheticLambda1.IconCompatParcelizer(ExoPlayerBuilderExternalSyntheticLambda16.read(), _handleunrecognizedcharacterescapeWrite);
            _handleunrecognizedcharacterescapeWrite.read(604401387);
            lambdamaybeNotifySurfaceSizeChanged27.read readVar = new lambdamaybeNotifySurfaceSizeChanged27.read((Context) _handleunrecognizedcharacterescapeWrite.write(AndroidCompositionLocals_androidKt.IconCompatParcelizer())).read(uri);
            getShowPopup getshowpopup = getShowPopup.INSTANCE;
            ExoPlayerBuilderExternalSyntheticLambda10 exoPlayerBuilderExternalSyntheticLambda10 = ExoPlayerBuilderExternalSyntheticLambda12.read(readVar.RemoteActionCompatParcelizer(), setanalyticscollectorIconCompatParcelizer, remoteActionCompatParcelizer, _handleunrecognizedcharacterescapeWrite, 0);
            _handleunrecognizedcharacterescapeWrite.RatingCompat();
            _handleunrecognizedcharacterescapeWrite.RatingCompat();
            ExoPlayerBuilderExternalSyntheticLambda10 exoPlayerBuilderExternalSyntheticLambda102 = exoPlayerBuilderExternalSyntheticLambda10;
            _handleOddName _handleoddnameRemoteActionCompatParcelizer$default3 = isAdded.RemoteActionCompatParcelizer$default(getParentFragment.AudioAttributesCompatParcelizer$default(_handleOddName.INSTANCE, BitmapDescriptorFactory.HUE_RED, assignParameter.IconCompatParcelizer(22.0f), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13, null), BitmapDescriptorFactory.HUE_RED, 1, null);
            MarrowTheme marrowTheme6 = MarrowTheme.INSTANCE;
            ViewFactoryHolder.write(exoPlayerBuilderExternalSyntheticLambda102, null, isAdded.AudioAttributesCompatParcelizer$default(getFrameEndSchedulerui.IconCompatParcelizer$default(_handleoddnameRemoteActionCompatParcelizer$default3, MarrowTheme.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, MarrowTheme.RemoteActionCompatParcelizer).get_init_lambda3(), null, 2, null), BitmapDescriptorFactory.HUE_RED, assignParameter.IconCompatParcelizer(176.0f), 1, (Object) null), _skipWSOrEnd.INSTANCE.RemoteActionCompatParcelizer(), null, BitmapDescriptorFactory.HUE_RED, null, _handleunrecognizedcharacterescapeWrite, 3120, 112);
            _handleunrecognizedcharacterescapeWrite.AudioAttributesImplBaseParcelizer();
            String str4 = singleArgCreatorDefaultsToProperties.read(R.string.send_for_verification, _handleunrecognizedcharacterescapeWrite, 6);
            boolean z4 = str2.length() > 0;
            _handleOddName _handleoddnameWrite = getParentFragment.write(getFrameEndSchedulerui.IconCompatParcelizer$default(isAdded.RemoteActionCompatParcelizer$default(_handleOddName.INSTANCE, BitmapDescriptorFactory.HUE_RED, 1, null), enabled.INSTANCE.write(_handleunrecognizedcharacterescapeWrite, enabled.RemoteActionCompatParcelizer).MediaBrowserCompatSearchResultReceiver(), null, 2, null), assignParameter.IconCompatParcelizer(30.0f), assignParameter.IconCompatParcelizer(18.0f));
            boolean z5 = (458752 & i6) == 131072;
            Object objOnPause8 = _handleunrecognizedcharacterescapeWrite.onPause();
            if (z5 || objOnPause8 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause8 = new getCreatedOnDateMs() { // from class: o.setOnCameraMoveCanceledListener
                    @Override // kotlin.getCreatedOnDateMs
                    public final Object invoke() {
                        return setMapStyle.AudioAttributesCompatParcelizer(getcreatedondatems);
                    }
                };
                _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(objOnPause8);
            }
            deactivate.write(str4, _handleoddnameWrite, BitmapDescriptorFactory.HUE_RED, 0L, z4, 0L, (getCreatedOnDateMs<getShowPopup>) objOnPause8, _handleunrecognizedcharacterescapeWrite, 0, 44);
            _handleunrecognizedcharacterescapeWrite.AudioAttributesImplBaseParcelizer();
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
            _handleoddname2 = _handleoddname3;
        }
        releaseNameCopyBuffer releasenamecopybufferMediaBrowserCompatSearchResultReceiver = _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatSearchResultReceiver();
        if (releasenamecopybufferMediaBrowserCompatSearchResultReceiver != null) {
            final _handleOddName _handleoddname4 = _handleoddname2;
            releasenamecopybufferMediaBrowserCompatSearchResultReceiver.read(new MagicModuleSubmissionRequestBody() { // from class: o.setOnCameraIdleListener
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return setMapStyle.read(_handleoddname4, str, str2, str3, uri, getcreatedondatems, getanswermap, i, getcreatedondatems2, i2, i3, (_handleUnrecognizedCharacterEscape) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(getCreatedOnDateMs getcreatedondatems) {
        getcreatedondatems.invoke();
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean AudioAttributesImplApi26Parcelizer(InputAccessor<Boolean> inputAccessor) {
        return inputAccessor.getRemoteActionCompatParcelizer().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InputAccessor IconCompatParcelizer() {
        return available.RemoteActionCompatParcelizer$default(Boolean.FALSE, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final hasValueTypeDeserializer AudioAttributesImplApi21Parcelizer(InputAccessor<hasValueTypeDeserializer> inputAccessor) {
        return inputAccessor.getRemoteActionCompatParcelizer();
    }

    static final class RemoteActionCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private /* synthetic */ InputAccessor<hasValueTypeDeserializer> AudioAttributesCompatParcelizer;
        private /* synthetic */ String RemoteActionCompatParcelizer;
        private int read;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            getYear.IconCompatParcelizer();
            SdkPayloadData.IconCompatParcelizer(obj);
            if (setMapStyle.AudioAttributesImplApi21Parcelizer(this.AudioAttributesCompatParcelizer).AudioAttributesCompatParcelizer().length() == 0) {
                InputAccessor<hasValueTypeDeserializer> inputAccessor = this.AudioAttributesCompatParcelizer;
                String str = this.RemoteActionCompatParcelizer;
                setMapStyle.write(inputAccessor, new hasValueTypeDeserializer(str, getValueInstantiator.IconCompatParcelizer(str.length()), (findProperty) null, 4, (MagicModuleRepositoryImplExternalSyntheticLambda0) null));
            }
            return getShowPopup.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        RemoteActionCompatParcelizer(String str, InputAccessor<hasValueTypeDeserializer> inputAccessor, SampleVideos<? super RemoteActionCompatParcelizer> sampleVideos) {
            super(2, sampleVideos);
            this.RemoteActionCompatParcelizer = str;
            this.AudioAttributesCompatParcelizer = inputAccessor;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return new RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, this.AudioAttributesCompatParcelizer, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((RemoteActionCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesImplBaseParcelizer(InputAccessor inputAccessor) {
        AudioAttributesCompatParcelizer((InputAccessor<Boolean>) inputAccessor, !AudioAttributesImplApi26Parcelizer(inputAccessor));
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup RemoteActionCompatParcelizer(getAnswerMap getanswermap, InputAccessor inputAccessor, hasValueTypeDeserializer hasvaluetypedeserializer) {
        toMagicModuleMetaRepoModel.write(hasvaluetypedeserializer, "");
        if (hasvaluetypedeserializer.AudioAttributesCompatParcelizer().length() <= 60) {
            if (new newYearNameItem("^[a-z A-Z]*$").AudioAttributesCompatParcelizer(hasvaluetypedeserializer.AudioAttributesCompatParcelizer())) {
                getanswermap.invoke(hasvaluetypedeserializer.AudioAttributesCompatParcelizer());
                write(inputAccessor, hasvaluetypedeserializer);
            }
        }
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(BaseSettings baseSettings, setDefaultArtwork setdefaultartwork) {
        toMagicModuleMetaRepoModel.write(setdefaultartwork, "");
        if (baseSettings != null) {
            baseSettings.read();
        }
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup RemoteActionCompatParcelizer(final InputAccessor inputAccessor, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        if (!_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer((i & 3) != 2, i & 1)) {
            _handleunrecognizedcharacterescape.onPrepareFromSearch();
        } else {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(-1897789906, i, -1, "com.marrow2.ui.settings.kyc.name.KycNameConfirmationView.<anonymous>.<anonymous>.<anonymous> (KycNameConfirmationLayout.kt:154)");
            }
            boolean zAudioAttributesCompatParcelizer = _handleunrecognizedcharacterescape.AudioAttributesCompatParcelizer(inputAccessor);
            Object objOnPause = _handleunrecognizedcharacterescape.onPause();
            if (zAudioAttributesCompatParcelizer || objOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause = new getCreatedOnDateMs() { // from class: o.setMinZoomPreference
                    @Override // kotlin.getCreatedOnDateMs
                    public final Object invoke() {
                        return setMapStyle.AudioAttributesCompatParcelizer(inputAccessor);
                    }
                };
                _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause);
            }
            JacksonInjectValue.IconCompatParcelizer((getCreatedOnDateMs) objOnPause, null, false, null, multiplyFft.AudioAttributesCompatParcelizer(941126930, true, new MagicModuleSubmissionRequestBody() { // from class: o.setOnCameraMoveListener
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return setMapStyle.write(inputAccessor, (_handleUnrecognizedCharacterEscape) obj, ((Integer) obj2).intValue());
                }
            }, _handleunrecognizedcharacterescape, 54), _handleunrecognizedcharacterescape, CpioConstants.C_ISBLK, 14);
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesCompatParcelizer(InputAccessor inputAccessor) {
        AudioAttributesCompatParcelizer((InputAccessor<Boolean>) inputAccessor, !AudioAttributesImplApi26Parcelizer(inputAccessor));
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup write(InputAccessor inputAccessor, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        long jMediaBrowserCompatItemReceiver;
        if (!_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer((i & 3) != 2, i & 1)) {
            _handleunrecognizedcharacterescape.onPrepareFromSearch();
        } else {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(941126930, i, -1, "com.marrow2.ui.settings.kyc.name.KycNameConfirmationView.<anonymous>.<anonymous>.<anonymous>.<anonymous> (KycNameConfirmationLayout.kt:158)");
            }
            isAnnotationBundle isannotationbundleRemoteActionCompatParcelizer = getDefaultSetterInfo.RemoteActionCompatParcelizer(R.drawable.ic_edit_pencil, _handleunrecognizedcharacterescape, 6);
            if (AudioAttributesImplApi26Parcelizer(inputAccessor)) {
                _handleunrecognizedcharacterescape.IconCompatParcelizer(-1815113543);
                jMediaBrowserCompatItemReceiver = enabled.INSTANCE.write(_handleunrecognizedcharacterescape, enabled.RemoteActionCompatParcelizer).AudioAttributesImplApi26Parcelizer();
            } else {
                _handleunrecognizedcharacterescape.IconCompatParcelizer(-1815112453);
                jMediaBrowserCompatItemReceiver = enabled.INSTANCE.write(_handleunrecognizedcharacterescape, enabled.RemoteActionCompatParcelizer).MediaBrowserCompatItemReceiver();
            }
            _handleunrecognizedcharacterescape.MediaBrowserCompatCustomActionResultReceiver();
            value.read(isannotationbundleRemoteActionCompatParcelizer, "editing ".concat(String.valueOf(AudioAttributesImplApi26Parcelizer(inputAccessor))), null, jMediaBrowserCompatItemReceiver, _handleunrecognizedcharacterescape, isAnnotationBundle.read, 4);
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        return getShowPopup.INSTANCE;
    }

    static final class AudioAttributesCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private /* synthetic */ InputAccessor<Boolean> RemoteActionCompatParcelizer;
        private /* synthetic */ secondaryCount read;
        private int write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.write;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                if (setMapStyle.AudioAttributesImplApi26Parcelizer(this.RemoteActionCompatParcelizer)) {
                    this.write = 1;
                    if (setCountry.IconCompatParcelizer(50L, this) == objIconCompatParcelizer) {
                        return objIconCompatParcelizer;
                    }
                }
                return getShowPopup.INSTANCE;
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            SdkPayloadData.IconCompatParcelizer(obj);
            secondaryCount.RemoteActionCompatParcelizer$default(this.read, 0, 1, null);
            return getShowPopup.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AudioAttributesCompatParcelizer(secondaryCount secondarycount, InputAccessor<Boolean> inputAccessor, SampleVideos<? super AudioAttributesCompatParcelizer> sampleVideos) {
            super(2, sampleVideos);
            this.read = secondarycount;
            this.RemoteActionCompatParcelizer = inputAccessor;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return new AudioAttributesCompatParcelizer(this.read, this.RemoteActionCompatParcelizer, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AudioAttributesCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesCompatParcelizer(getCreatedOnDateMs getcreatedondatems) {
        getcreatedondatems.invoke();
        return getShowPopup.INSTANCE;
    }

    private static final void AudioAttributesCompatParcelizer(InputAccessor<Boolean> inputAccessor, boolean z) {
        inputAccessor.write(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void write(InputAccessor<hasValueTypeDeserializer> inputAccessor, hasValueTypeDeserializer hasvaluetypedeserializer) {
        inputAccessor.write(hasvaluetypedeserializer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(_handleOddName _handleoddname, String str, String str2, String str3, Uri uri, getCreatedOnDateMs getcreatedondatems, getAnswerMap getanswermap, int i, getCreatedOnDateMs getcreatedondatems2, int i2, int i3, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape) {
        write(_handleoddname, str, str2, str3, uri, getcreatedondatems, getanswermap, i, getcreatedondatems2, _handleunrecognizedcharacterescape, _appendEscaped.RemoteActionCompatParcelizer(i2 | 1), i3);
        return getShowPopup.INSTANCE;
    }
}
