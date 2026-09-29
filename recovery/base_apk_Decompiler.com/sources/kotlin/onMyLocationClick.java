package kotlin;

import android.net.Uri;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.RendererCapabilities;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow.R;
import com.marrow.designsystem.theme.MarrowTheme;
import com.marrow.designsystem.theme.TypeKt;
import kotlin.AbstractDeserializer;
import org.apache.commons.compress.archivers.cpio.CpioConstants;

/* JADX INFO: loaded from: classes4.dex */
public final class onMyLocationClick {
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
    public static final void IconCompatParcelizer(final Uri uri, final Uri uri2, final String str, final getCreatedOnDateMs<getShowPopup> getcreatedondatems, final getCreatedOnDateMs<getShowPopup> getcreatedondatems2, final getCreatedOnDateMs<getShowPopup> getcreatedondatems3, final getCreatedOnDateMs<getShowPopup> getcreatedondatems4, final getCreatedOnDateMs<getShowPopup> getcreatedondatems5, final getCreatedOnDateMs<getShowPopup> getcreatedondatems6, final int i, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, final int i2) {
        int i3;
        _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape2;
        toMagicModuleMetaRepoModel.write(uri, "");
        toMagicModuleMetaRepoModel.write(uri2, "");
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(getcreatedondatems, "");
        toMagicModuleMetaRepoModel.write(getcreatedondatems2, "");
        toMagicModuleMetaRepoModel.write(getcreatedondatems3, "");
        toMagicModuleMetaRepoModel.write(getcreatedondatems4, "");
        toMagicModuleMetaRepoModel.write(getcreatedondatems5, "");
        toMagicModuleMetaRepoModel.write(getcreatedondatems6, "");
        _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescapeWrite = _handleunrecognizedcharacterescape.write(1238320620);
        if ((i2 & 6) == 0) {
            i3 = (_handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(uri) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(uri2) ? 32 : 16;
        }
        if ((i2 & RendererCapabilities.MODE_SUPPORT_MASK) == 0) {
            i3 |= _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(str) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(getcreatedondatems) ? 2048 : 1024;
        }
        if ((i2 & CpioConstants.C_ISBLK) == 0) {
            i3 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(getcreatedondatems2) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(getcreatedondatems3) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE;
        }
        if ((1572864 & i2) == 0) {
            i3 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(getcreatedondatems4) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((12582912 & i2) == 0) {
            i3 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(getcreatedondatems5) ? 8388608 : 4194304;
        }
        if ((100663296 & i2) == 0) {
            i3 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(getcreatedondatems6) ? 67108864 : 33554432;
        }
        if ((805306368 & i2) == 0) {
            i3 |= _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(i) ? 536870912 : 268435456;
        }
        if (!_handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer((i3 & 306783379) != 306783378, i3 & 1)) {
            _handleunrecognizedcharacterescape2 = _handleunrecognizedcharacterescapeWrite;
            _handleunrecognizedcharacterescape2.onPrepareFromSearch();
        } else {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(1238320620, i3, -1, "com.marrow2.ui.settings.kyc.upload.KycImageUploadLayout (KycImageUploadLayout.kt:52)");
            }
            Object objOnPause = _handleunrecognizedcharacterescapeWrite.onPause();
            if (objOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause = new secondaryCount();
                _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(objOnPause);
            }
            secondaryCount secondarycount = (secondaryCount) objOnPause;
            setTranslationY settranslationyWrite = setVerticalAlign.write(0, _handleunrecognizedcharacterescapeWrite, 0, 1);
            getShowPopup getshowpopup = getShowPopup.INSTANCE;
            boolean zIconCompatParcelizer = _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(uri2);
            boolean zIconCompatParcelizer2 = _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(uri);
            boolean zAudioAttributesCompatParcelizer = _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(settranslationyWrite);
            IconCompatParcelizer iconCompatParcelizerOnPause = _handleunrecognizedcharacterescapeWrite.onPause();
            if ((zIconCompatParcelizer | zIconCompatParcelizer2 | zAudioAttributesCompatParcelizer) || iconCompatParcelizerOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                iconCompatParcelizerOnPause = new IconCompatParcelizer(uri2, uri, settranslationyWrite, null);
                _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(iconCompatParcelizerOnPause);
            }
            StreamReadException.IconCompatParcelizer(getshowpopup, (MagicModuleSubmissionRequestBody) iconCompatParcelizerOnPause, _handleunrecognizedcharacterescapeWrite, 6);
            _handleOddName _handleoddnameAudioAttributesCompatParcelizer$default = getParentFragment.AudioAttributesCompatParcelizer$default(getFrameEndSchedulerui.IconCompatParcelizer$default(isAdded.IconCompatParcelizer$default(_handleOddName.INSTANCE, BitmapDescriptorFactory.HUE_RED, 1, null), enabled.INSTANCE.write(_handleunrecognizedcharacterescapeWrite, enabled.RemoteActionCompatParcelizer).read(), null, 2, null), BitmapDescriptorFactory.HUE_RED, assignParameter.IconCompatParcelizer(10.0f), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13, null);
            withTypeHandler withtypehandler = setValue.read(WindowInsetsCompatImpl30.INSTANCE.MediaBrowserCompatCustomActionResultReceiver(), _skipWSOrEnd.INSTANCE.RatingCompat(), _handleunrecognizedcharacterescapeWrite, 0);
            int iHashCode = Long.hashCode(_getBigDecimal.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, 0));
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
            _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape3 = NumberOutput.read(_handleunrecognizedcharacterescapeWrite);
            NumberOutput.write(_handleunrecognizedcharacterescape3, withtypehandler, getDependencies.INSTANCE.AudioAttributesImplBaseParcelizer());
            NumberOutput.write(_handleunrecognizedcharacterescape3, _getchardescHandleMediaPlayPauseIfPendingOnHandler, getDependencies.INSTANCE.MediaBrowserCompatItemReceiver());
            NumberOutput.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape3, Integer.valueOf(iHashCode), getDependencies.INSTANCE.AudioAttributesCompatParcelizer());
            NumberOutput.write(_handleunrecognizedcharacterescape3, getDependencies.INSTANCE.write());
            NumberOutput.write(_handleunrecognizedcharacterescape3, _handleoddnameRemoteActionCompatParcelizer, getDependencies.INSTANCE.MediaBrowserCompatCustomActionResultReceiver());
            _handleOddName _handleoddnameIconCompatParcelizer = setVerticalAlign.IconCompatParcelizer(getParentFragment.write$default(DrawerLayoutLayoutParams.read$default(DrawerLayoutSavedState.INSTANCE, _handleOddName.INSTANCE, 1.0f, false, 2, null), assignParameter.IconCompatParcelizer(20.0f), BitmapDescriptorFactory.HUE_RED, 2, null), settranslationyWrite, false, null, false, 14, null);
            withTypeHandler withtypehandler2 = setValue.read(WindowInsetsCompatImpl30.INSTANCE.MediaBrowserCompatCustomActionResultReceiver(), _skipWSOrEnd.INSTANCE.RatingCompat(), _handleunrecognizedcharacterescapeWrite, 0);
            int iHashCode2 = Long.hashCode(_getBigDecimal.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, 0));
            _getCharDesc _getchardescHandleMediaPlayPauseIfPendingOnHandler2 = _handleunrecognizedcharacterescapeWrite.handleMediaPlayPauseIfPendingOnHandler();
            _handleOddName _handleoddnameRemoteActionCompatParcelizer2 = _verifyNLZ2.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, _handleoddnameIconCompatParcelizer);
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
            _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape4 = NumberOutput.read(_handleunrecognizedcharacterescapeWrite);
            NumberOutput.write(_handleunrecognizedcharacterescape4, withtypehandler2, getDependencies.INSTANCE.AudioAttributesImplBaseParcelizer());
            NumberOutput.write(_handleunrecognizedcharacterescape4, _getchardescHandleMediaPlayPauseIfPendingOnHandler2, getDependencies.INSTANCE.MediaBrowserCompatItemReceiver());
            NumberOutput.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape4, Integer.valueOf(iHashCode2), getDependencies.INSTANCE.AudioAttributesCompatParcelizer());
            NumberOutput.write(_handleunrecognizedcharacterescape4, getDependencies.INSTANCE.write());
            NumberOutput.write(_handleunrecognizedcharacterescape4, _handleoddnameRemoteActionCompatParcelizer2, getDependencies.INSTANCE.MediaBrowserCompatCustomActionResultReceiver());
            DrawerLayoutSavedState drawerLayoutSavedState = DrawerLayoutSavedState.INSTANCE;
            _handleOddName _handleoddnameAudioAttributesCompatParcelizer$default2 = getParentFragment.AudioAttributesCompatParcelizer$default(_handleOddName.INSTANCE, BitmapDescriptorFactory.HUE_RED, assignParameter.IconCompatParcelizer(10.0f), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13, null);
            boolean z = (29360128 & i3) == 8388608;
            Object objOnPause2 = _handleunrecognizedcharacterescapeWrite.onPause();
            if (z || objOnPause2 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause2 = new getCreatedOnDateMs() { // from class: o.GoogleMapOnPolygonClickListener
                    @Override // kotlin.getCreatedOnDateMs
                    public final Object invoke() {
                        return onMyLocationClick.write(getcreatedondatems5);
                    }
                };
                _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(objOnPause2);
            }
            deactivate.read(_handleoddnameAudioAttributesCompatParcelizer$default2, 3, i, null, (getCreatedOnDateMs) objOnPause2, _handleunrecognizedcharacterescapeWrite, ((i3 >> 21) & 896) | 54, 8);
            _copyCurrentStringValue.IconCompatParcelizer(singleArgCreatorDefaultsToProperties.RemoteActionCompatParcelizer(R.string.upload_title, new Object[]{str}, _handleunrecognizedcharacterescapeWrite, 6), isAdded.RemoteActionCompatParcelizer$default(getParentFragment.AudioAttributesCompatParcelizer$default(_handleOddName.INSTANCE, BitmapDescriptorFactory.HUE_RED, assignParameter.IconCompatParcelizer(10.0f), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13, null), BitmapDescriptorFactory.HUE_RED, 1, null), enabled.INSTANCE.write(_handleunrecognizedcharacterescapeWrite, enabled.RemoteActionCompatParcelizer).IconCompatParcelizer(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, enabled.INSTANCE.IconCompatParcelizer(_handleunrecognizedcharacterescapeWrite, enabled.RemoteActionCompatParcelizer).getAudioAttributesCompatParcelizer(), _handleunrecognizedcharacterescapeWrite, 48, 0, 65528);
            String str2 = singleArgCreatorDefaultsToProperties.read(R.string.kindly_upload_doc, _handleunrecognizedcharacterescapeWrite, 6);
            deserializeWithObjectId deserializewithobjectidAudioAttributesCompatParcelizer = TypeKt.AudioAttributesCompatParcelizer(enabled.INSTANCE.IconCompatParcelizer(_handleunrecognizedcharacterescapeWrite, enabled.RemoteActionCompatParcelizer));
            MarrowTheme marrowTheme = MarrowTheme.INSTANCE;
            _copyCurrentStringValue.IconCompatParcelizer(str2, isAdded.RemoteActionCompatParcelizer$default(getParentFragment.AudioAttributesCompatParcelizer$default(_handleOddName.INSTANCE, BitmapDescriptorFactory.HUE_RED, assignParameter.IconCompatParcelizer(12.0f), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13, null), BitmapDescriptorFactory.HUE_RED, 1, null), MarrowTheme.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, MarrowTheme.RemoteActionCompatParcelizer).getOnSetPlaybackSpeed(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, deserializewithobjectidAudioAttributesCompatParcelizer, _handleunrecognizedcharacterescapeWrite, 48, 0, 65528);
            String str3 = singleArgCreatorDefaultsToProperties.read(R.string.kyc_upload_warning, _handleunrecognizedcharacterescapeWrite, 6);
            deserializeWithObjectId deserializewithobjectidAudioAttributesImplBaseParcelizer = TypeKt.AudioAttributesImplBaseParcelizer(enabled.INSTANCE.IconCompatParcelizer(_handleunrecognizedcharacterescapeWrite, enabled.RemoteActionCompatParcelizer));
            MarrowTheme marrowTheme2 = MarrowTheme.INSTANCE;
            _copyCurrentStringValue.IconCompatParcelizer(str3, getParentFragment.AudioAttributesCompatParcelizer$default(_handleOddName.INSTANCE, BitmapDescriptorFactory.HUE_RED, assignParameter.IconCompatParcelizer(8.0f), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13, null), MarrowTheme.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, MarrowTheme.RemoteActionCompatParcelizer).getOnPrepareFromMediaId(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 1, 0, null, deserializewithobjectidAudioAttributesImplBaseParcelizer, _handleunrecognizedcharacterescapeWrite, 48, 3072, 57336);
            String str4 = singleArgCreatorDefaultsToProperties.read(R.string.text_kyc_upload_front, _handleunrecognizedcharacterescapeWrite, 6);
            boolean z2 = (458752 & i3) == 131072;
            Object objOnPause3 = _handleunrecognizedcharacterescapeWrite.onPause();
            if (z2 || objOnPause3 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause3 = new getCreatedOnDateMs() { // from class: o.onPoiClick
                    @Override // kotlin.getCreatedOnDateMs
                    public final Object invoke() {
                        return onMyLocationClick.read(getcreatedondatems3);
                    }
                };
                _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(objOnPause3);
            }
            getCreatedOnDateMs getcreatedondatems7 = (getCreatedOnDateMs) objOnPause3;
            boolean zIconCompatParcelizer3 = _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(uri2);
            boolean z3 = (i3 & 7168) == 2048;
            Object objOnPause4 = _handleunrecognizedcharacterescapeWrite.onPause();
            if ((zIconCompatParcelizer3 | z3) || objOnPause4 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause4 = new getCreatedOnDateMs() { // from class: o.GoogleMapOnMyLocationClickListener
                    @Override // kotlin.getCreatedOnDateMs
                    public final Object invoke() {
                        return onMyLocationClick.RemoteActionCompatParcelizer(uri2, getcreatedondatems);
                    }
                };
                _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(objOnPause4);
            }
            int i4 = i3;
            GoogleMapOnIndoorStateChangeListener.IconCompatParcelizer(null, uri2, str4, getcreatedondatems7, (getCreatedOnDateMs) objOnPause4, _handleunrecognizedcharacterescapeWrite, i3 & 112, 1);
            _handleOddName _handleoddnameAudioAttributesCompatParcelizer$default3 = getSavedStateRegistryOwner.AudioAttributesCompatParcelizer$default(spilloverCount.AudioAttributesCompatParcelizer(_handleOddName.INSTANCE, secondarycount), false, null, 3, null);
            _handleunrecognizedcharacterescape2 = _handleunrecognizedcharacterescapeWrite;
            String str5 = singleArgCreatorDefaultsToProperties.read(R.string.text_kyc_upload_back, _handleunrecognizedcharacterescape2, 6);
            boolean z4 = (i4 & 3670016) == 1048576;
            Object objOnPause5 = _handleunrecognizedcharacterescape2.onPause();
            if (z4 || objOnPause5 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause5 = new getCreatedOnDateMs() { // from class: o.GoogleMapOnPoiClickListener
                    @Override // kotlin.getCreatedOnDateMs
                    public final Object invoke() {
                        return onMyLocationClick.MediaBrowserCompatCustomActionResultReceiver(getcreatedondatems4);
                    }
                };
                _handleunrecognizedcharacterescape2.RemoteActionCompatParcelizer(objOnPause5);
            }
            getCreatedOnDateMs getcreatedondatems8 = (getCreatedOnDateMs) objOnPause5;
            boolean zIconCompatParcelizer4 = _handleunrecognizedcharacterescape2.IconCompatParcelizer(uri);
            boolean z5 = (i4 & 57344) == 16384;
            Object objOnPause6 = _handleunrecognizedcharacterescape2.onPause();
            if ((zIconCompatParcelizer4 | z5) || objOnPause6 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause6 = new getCreatedOnDateMs() { // from class: o.GoogleMapSnapshotReadyCallback
                    @Override // kotlin.getCreatedOnDateMs
                    public final Object invoke() {
                        return onMyLocationClick.write(uri, getcreatedondatems2);
                    }
                };
                _handleunrecognizedcharacterescape2.RemoteActionCompatParcelizer(objOnPause6);
            }
            GoogleMapOnIndoorStateChangeListener.IconCompatParcelizer(_handleoddnameAudioAttributesCompatParcelizer$default3, uri, str5, getcreatedondatems8, (getCreatedOnDateMs) objOnPause6, _handleunrecognizedcharacterescape2, (i4 << 3) & 112, 0);
            _handleunrecognizedcharacterescape2.AudioAttributesImplBaseParcelizer();
            _handleOddName _handleoddnameIconCompatParcelizer$default = getFrameEndSchedulerui.IconCompatParcelizer$default(isAdded.RemoteActionCompatParcelizer$default(getParentFragment.AudioAttributesCompatParcelizer$default(_handleOddName.INSTANCE, BitmapDescriptorFactory.HUE_RED, assignParameter.IconCompatParcelizer(12.0f), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13, null), BitmapDescriptorFactory.HUE_RED, 1, null), enabled.INSTANCE.write(_handleunrecognizedcharacterescape2, enabled.RemoteActionCompatParcelizer).MediaBrowserCompatSearchResultReceiver(), null, 2, null);
            withTypeHandler withtypehandler3 = setValue.read(WindowInsetsCompatImpl30.INSTANCE.MediaBrowserCompatCustomActionResultReceiver(), _skipWSOrEnd.INSTANCE.RatingCompat(), _handleunrecognizedcharacterescape2, 0);
            int iHashCode3 = Long.hashCode(_getBigDecimal.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape2, 0));
            _getCharDesc _getchardescHandleMediaPlayPauseIfPendingOnHandler3 = _handleunrecognizedcharacterescape2.handleMediaPlayPauseIfPendingOnHandler();
            _handleOddName _handleoddnameRemoteActionCompatParcelizer3 = _verifyNLZ2.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape2, _handleoddnameIconCompatParcelizer$default);
            getCreatedOnDateMs<getDependencies> getcreatedondatemsIconCompatParcelizer3 = getDependencies.INSTANCE.IconCompatParcelizer();
            if (!(_handleunrecognizedcharacterescape2.MediaMetadataCompat() instanceof _closeInput)) {
                _getBigDecimal.write();
            }
            _handleunrecognizedcharacterescape2.onPrepareFromMediaId();
            if (_handleunrecognizedcharacterescape2.getParcelableVolumeInfo()) {
                _handleunrecognizedcharacterescape2.read(getcreatedondatemsIconCompatParcelizer3);
            } else {
                _handleunrecognizedcharacterescape2.onPlayFromUri();
            }
            _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape5 = NumberOutput.read(_handleunrecognizedcharacterescape2);
            NumberOutput.write(_handleunrecognizedcharacterescape5, withtypehandler3, getDependencies.INSTANCE.AudioAttributesImplBaseParcelizer());
            NumberOutput.write(_handleunrecognizedcharacterescape5, _getchardescHandleMediaPlayPauseIfPendingOnHandler3, getDependencies.INSTANCE.MediaBrowserCompatItemReceiver());
            NumberOutput.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape5, Integer.valueOf(iHashCode3), getDependencies.INSTANCE.AudioAttributesCompatParcelizer());
            NumberOutput.write(_handleunrecognizedcharacterescape5, getDependencies.INSTANCE.write());
            NumberOutput.write(_handleunrecognizedcharacterescape5, _handleoddnameRemoteActionCompatParcelizer3, getDependencies.INSTANCE.MediaBrowserCompatCustomActionResultReceiver());
            DrawerLayoutSavedState drawerLayoutSavedState2 = DrawerLayoutSavedState.INSTANCE;
            Object[] objArr = new Object[0];
            Object objOnPause7 = _handleunrecognizedcharacterescape2.onPause();
            if (objOnPause7 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause7 = new getCreatedOnDateMs() { // from class: o.onPolylineClick
                    @Override // kotlin.getCreatedOnDateMs
                    public final Object invoke() {
                        return onMyLocationClick.read();
                    }
                };
                _handleunrecognizedcharacterescape2.RemoteActionCompatParcelizer(objOnPause7);
            }
            final InputAccessor inputAccessor = (InputAccessor) addTimesI.read(objArr, (getCreatedOnDateMs) objOnPause7, _handleunrecognizedcharacterescape2, 48);
            _handleunrecognizedcharacterescape2.IconCompatParcelizer(1425220386);
            AbstractDeserializer.IconCompatParcelizer iconCompatParcelizer = new AbstractDeserializer.IconCompatParcelizer(0, 1, null);
            _handleunrecognizedcharacterescape2.IconCompatParcelizer(1425221364);
            _findPropertyUnwrapper _findpropertyunwrapperOnRemoveQueueItemAt = TypeKt.AudioAttributesCompatParcelizer(enabled.INSTANCE.IconCompatParcelizer(_handleunrecognizedcharacterescape2, enabled.RemoteActionCompatParcelizer)).onRemoveQueueItemAt();
            MarrowTheme marrowTheme3 = MarrowTheme.INSTANCE;
            int i5 = iconCompatParcelizer.read(_findpropertyunwrapperOnRemoveQueueItemAt.write((65503 & 1) != 0 ? _findpropertyunwrapperOnRemoveQueueItemAt.read() : MarrowTheme.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape2, MarrowTheme.RemoteActionCompatParcelizer).getOnSetPlaybackSpeed(), (65503 & 2) != 0 ? _findpropertyunwrapperOnRemoveQueueItemAt.AudioAttributesCompatParcelizer : 0L, (65503 & 4) != 0 ? _findpropertyunwrapperOnRemoveQueueItemAt.RemoteActionCompatParcelizer : null, (65503 & 8) != 0 ? _findpropertyunwrapperOnRemoveQueueItemAt.write : null, (65503 & 16) != 0 ? _findpropertyunwrapperOnRemoveQueueItemAt.read : null, (65503 & 32) != 0 ? _findpropertyunwrapperOnRemoveQueueItemAt.AudioAttributesImplBaseParcelizer : null, (65503 & 64) != 0 ? _findpropertyunwrapperOnRemoveQueueItemAt.MediaBrowserCompatCustomActionResultReceiver : null, (65503 & 128) != 0 ? _findpropertyunwrapperOnRemoveQueueItemAt.MediaBrowserCompatItemReceiver : 0L, (65503 & 256) != 0 ? _findpropertyunwrapperOnRemoveQueueItemAt.AudioAttributesImplApi21Parcelizer : null, (65503 & 512) != 0 ? _findpropertyunwrapperOnRemoveQueueItemAt.AudioAttributesImplApi26Parcelizer : null, (65503 & 1024) != 0 ? _findpropertyunwrapperOnRemoveQueueItemAt.MediaBrowserCompatMediaItem : null, (65503 & 2048) != 0 ? _findpropertyunwrapperOnRemoveQueueItemAt.MediaDescriptionCompat : 0L, (65503 & 4096) != 0 ? _findpropertyunwrapperOnRemoveQueueItemAt.MediaMetadataCompat : null, (65503 & 8192) != 0 ? _findpropertyunwrapperOnRemoveQueueItemAt.MediaBrowserCompatSearchResultReceiver : null, (65503 & 16384) != 0 ? _findpropertyunwrapperOnRemoveQueueItemAt.RatingCompat : null, (65503 & 32768) != 0 ? _findpropertyunwrapperOnRemoveQueueItemAt.onCustomAction : null));
            try {
                iconCompatParcelizer.RemoteActionCompatParcelizer(singleArgCreatorDefaultsToProperties.read(R.string.doc_acknowlegment, _handleunrecognizedcharacterescape2, 6));
                iconCompatParcelizer.RemoteActionCompatParcelizer(" ");
                getShowPopup getshowpopup2 = getShowPopup.INSTANCE;
                iconCompatParcelizer.read(i5);
                _handleunrecognizedcharacterescape2.MediaBrowserCompatCustomActionResultReceiver();
                _findPropertyUnwrapper _findpropertyunwrapperOnRemoveQueueItemAt2 = TypeKt.RemoteActionCompatParcelizer(enabled.INSTANCE.IconCompatParcelizer(_handleunrecognizedcharacterescape2, enabled.RemoteActionCompatParcelizer)).onRemoveQueueItemAt();
                MarrowTheme marrowTheme4 = MarrowTheme.INSTANCE;
                i5 = iconCompatParcelizer.read(_findpropertyunwrapperOnRemoveQueueItemAt2.write((65503 & 1) != 0 ? _findpropertyunwrapperOnRemoveQueueItemAt2.read() : MarrowTheme.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape2, MarrowTheme.RemoteActionCompatParcelizer).getOnSetShuffleMode(), (65503 & 2) != 0 ? _findpropertyunwrapperOnRemoveQueueItemAt2.AudioAttributesCompatParcelizer : 0L, (65503 & 4) != 0 ? _findpropertyunwrapperOnRemoveQueueItemAt2.RemoteActionCompatParcelizer : null, (65503 & 8) != 0 ? _findpropertyunwrapperOnRemoveQueueItemAt2.write : null, (65503 & 16) != 0 ? _findpropertyunwrapperOnRemoveQueueItemAt2.read : null, (65503 & 32) != 0 ? _findpropertyunwrapperOnRemoveQueueItemAt2.AudioAttributesImplBaseParcelizer : null, (65503 & 64) != 0 ? _findpropertyunwrapperOnRemoveQueueItemAt2.MediaBrowserCompatCustomActionResultReceiver : null, (65503 & 128) != 0 ? _findpropertyunwrapperOnRemoveQueueItemAt2.MediaBrowserCompatItemReceiver : 0L, (65503 & 256) != 0 ? _findpropertyunwrapperOnRemoveQueueItemAt2.AudioAttributesImplApi21Parcelizer : null, (65503 & 512) != 0 ? _findpropertyunwrapperOnRemoveQueueItemAt2.AudioAttributesImplApi26Parcelizer : null, (65503 & 1024) != 0 ? _findpropertyunwrapperOnRemoveQueueItemAt2.MediaBrowserCompatMediaItem : null, (65503 & 2048) != 0 ? _findpropertyunwrapperOnRemoveQueueItemAt2.MediaDescriptionCompat : 0L, (65503 & 4096) != 0 ? _findpropertyunwrapperOnRemoveQueueItemAt2.MediaMetadataCompat : null, (65503 & 8192) != 0 ? _findpropertyunwrapperOnRemoveQueueItemAt2.MediaBrowserCompatSearchResultReceiver : null, (65503 & 16384) != 0 ? _findpropertyunwrapperOnRemoveQueueItemAt2.RatingCompat : null, (65503 & 32768) != 0 ? _findpropertyunwrapperOnRemoveQueueItemAt2.onCustomAction : null));
                try {
                    iconCompatParcelizer.RemoteActionCompatParcelizer(str);
                    getShowPopup getshowpopup3 = getShowPopup.INSTANCE;
                    iconCompatParcelizer.read(i5);
                    AbstractDeserializer abstractDeserializerRemoteActionCompatParcelizer = iconCompatParcelizer.RemoteActionCompatParcelizer();
                    _handleunrecognizedcharacterescape2.MediaBrowserCompatCustomActionResultReceiver();
                    if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(uri2, Uri.EMPTY) && !toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(uri, Uri.EMPTY)) {
                        _handleunrecognizedcharacterescape2.IconCompatParcelizer(1232841411);
                        _handleOddName _handleoddnameIconCompatParcelizer$default2 = getFrameEndSchedulerui.IconCompatParcelizer$default(getParentFragment.AudioAttributesCompatParcelizer$default(getParentFragment.write$default(isAdded.RemoteActionCompatParcelizer$default(_handleOddName.INSTANCE, BitmapDescriptorFactory.HUE_RED, 1, null), assignParameter.IconCompatParcelizer(30.0f), BitmapDescriptorFactory.HUE_RED, 2, null), BitmapDescriptorFactory.HUE_RED, assignParameter.IconCompatParcelizer(18.0f), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13, null), enabled.INSTANCE.write(_handleunrecognizedcharacterescape2, enabled.RemoteActionCompatParcelizer).MediaBrowserCompatSearchResultReceiver(), null, 2, null);
                        boolean zAudioAttributesCompatParcelizer2 = _handleunrecognizedcharacterescape2.AudioAttributesCompatParcelizer(inputAccessor);
                        Object objOnPause8 = _handleunrecognizedcharacterescape2.onPause();
                        if (zAudioAttributesCompatParcelizer2 || objOnPause8 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                            objOnPause8 = new getAnswerMap() { // from class: o.onPolygonClick
                                @Override // kotlin.getAnswerMap
                                public final Object invoke(Object obj) {
                                    return onMyLocationClick.AudioAttributesCompatParcelizer(inputAccessor, ((Boolean) obj).booleanValue());
                                }
                            };
                            _handleunrecognizedcharacterescape2.RemoteActionCompatParcelizer(objOnPause8);
                        }
                        deactivate.RemoteActionCompatParcelizer(_handleoddnameIconCompatParcelizer$default2, abstractDeserializerRemoteActionCompatParcelizer, (getAnswerMap<? super Boolean, getShowPopup>) objOnPause8, _handleunrecognizedcharacterescape2, 0, 0);
                        _handleunrecognizedcharacterescape2.MediaBrowserCompatCustomActionResultReceiver();
                    } else {
                        _handleunrecognizedcharacterescape2.IconCompatParcelizer(1233253184);
                        _handleunrecognizedcharacterescape2.MediaBrowserCompatCustomActionResultReceiver();
                        RemoteActionCompatParcelizer((InputAccessor<Boolean>) inputAccessor, false);
                    }
                    _handleOddName _handleoddnameIconCompatParcelizer$default3 = getFrameEndSchedulerui.IconCompatParcelizer$default(isAdded.RemoteActionCompatParcelizer$default(getParentFragment.write(_handleOddName.INSTANCE, assignParameter.IconCompatParcelizer(22.0f), assignParameter.IconCompatParcelizer(4.0f)), BitmapDescriptorFactory.HUE_RED, 1, null), enabled.INSTANCE.write(_handleunrecognizedcharacterescape2, enabled.RemoteActionCompatParcelizer).MediaBrowserCompatSearchResultReceiver(), null, 2, null);
                    String str6 = singleArgCreatorDefaultsToProperties.read(R.string.proceed, _handleunrecognizedcharacterescape2, 6);
                    boolean zWrite = write((InputAccessor<Boolean>) inputAccessor);
                    boolean zAudioAttributesCompatParcelizer3 = _handleunrecognizedcharacterescape2.AudioAttributesCompatParcelizer(inputAccessor);
                    boolean z6 = (i4 & 234881024) == 67108864;
                    Object objOnPause9 = _handleunrecognizedcharacterescape2.onPause();
                    if ((zAudioAttributesCompatParcelizer3 | z6) || objOnPause9 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                        objOnPause9 = new getCreatedOnDateMs() { // from class: o.onSnapshotReady
                            @Override // kotlin.getCreatedOnDateMs
                            public final Object invoke() {
                                return onMyLocationClick.AudioAttributesCompatParcelizer(getcreatedondatems6, inputAccessor);
                            }
                        };
                        _handleunrecognizedcharacterescape2.RemoteActionCompatParcelizer(objOnPause9);
                    }
                    deactivate.write(str6, _handleoddnameIconCompatParcelizer$default3, BitmapDescriptorFactory.HUE_RED, 0L, zWrite, 0L, (getCreatedOnDateMs<getShowPopup>) objOnPause9, _handleunrecognizedcharacterescape2, 0, 44);
                    _handleunrecognizedcharacterescape2.AudioAttributesImplBaseParcelizer();
                    _handleunrecognizedcharacterescape2.AudioAttributesImplBaseParcelizer();
                    if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                        _validJsonValueList.AudioAttributesImplApi21Parcelizer();
                    }
                } finally {
                }
            } finally {
            }
        }
        releaseNameCopyBuffer releasenamecopybufferMediaBrowserCompatSearchResultReceiver = _handleunrecognizedcharacterescape2.MediaBrowserCompatSearchResultReceiver();
        if (releasenamecopybufferMediaBrowserCompatSearchResultReceiver != null) {
            releasenamecopybufferMediaBrowserCompatSearchResultReceiver.read(new MagicModuleSubmissionRequestBody() { // from class: o.GoogleMapOnPolylineClickListener
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return onMyLocationClick.AudioAttributesCompatParcelizer(uri, uri2, str, getcreatedondatems, getcreatedondatems2, getcreatedondatems3, getcreatedondatems4, getcreatedondatems5, getcreatedondatems6, i, i2, (_handleUnrecognizedCharacterEscape) obj);
                }
            });
        }
    }

    static final class IconCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private /* synthetic */ Uri AudioAttributesCompatParcelizer;
        private /* synthetic */ setTranslationY IconCompatParcelizer;
        private /* synthetic */ Uri RemoteActionCompatParcelizer;
        private int write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.write;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, Uri.EMPTY) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, Uri.EMPTY)) {
                    this.write = 1;
                    if (setTranslationY.AudioAttributesCompatParcelizer$default(this.IconCompatParcelizer, Integer.MAX_VALUE, (setOrientation) null, this, 2, (Object) null) == objIconCompatParcelizer) {
                        return objIconCompatParcelizer;
                    }
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
        IconCompatParcelizer(Uri uri, Uri uri2, setTranslationY settranslationy, SampleVideos<? super IconCompatParcelizer> sampleVideos) {
            super(2, sampleVideos);
            this.RemoteActionCompatParcelizer = uri;
            this.AudioAttributesCompatParcelizer = uri2;
            this.IconCompatParcelizer = settranslationy;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return new IconCompatParcelizer(this.RemoteActionCompatParcelizer, this.AudioAttributesCompatParcelizer, this.IconCompatParcelizer, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((IconCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup write(getCreatedOnDateMs getcreatedondatems) {
        getcreatedondatems.invoke();
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(getCreatedOnDateMs getcreatedondatems) {
        getcreatedondatems.invoke();
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup RemoteActionCompatParcelizer(Uri uri, getCreatedOnDateMs getcreatedondatems) {
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(uri, Uri.EMPTY)) {
            getcreatedondatems.invoke();
        }
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup MediaBrowserCompatCustomActionResultReceiver(getCreatedOnDateMs getcreatedondatems) {
        getcreatedondatems.invoke();
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup write(Uri uri, getCreatedOnDateMs getcreatedondatems) {
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(uri, Uri.EMPTY)) {
            getcreatedondatems.invoke();
        }
        return getShowPopup.INSTANCE;
    }

    private static final boolean write(InputAccessor<Boolean> inputAccessor) {
        return inputAccessor.getRemoteActionCompatParcelizer().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InputAccessor read() {
        return available.RemoteActionCompatParcelizer$default(Boolean.FALSE, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesCompatParcelizer(InputAccessor inputAccessor, boolean z) {
        RemoteActionCompatParcelizer((InputAccessor<Boolean>) inputAccessor, z);
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesCompatParcelizer(getCreatedOnDateMs getcreatedondatems, InputAccessor inputAccessor) {
        if (write((InputAccessor<Boolean>) inputAccessor)) {
            getcreatedondatems.invoke();
        }
        return getShowPopup.INSTANCE;
    }

    private static final void RemoteActionCompatParcelizer(InputAccessor<Boolean> inputAccessor, boolean z) {
        inputAccessor.write(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesCompatParcelizer(Uri uri, Uri uri2, String str, getCreatedOnDateMs getcreatedondatems, getCreatedOnDateMs getcreatedondatems2, getCreatedOnDateMs getcreatedondatems3, getCreatedOnDateMs getcreatedondatems4, getCreatedOnDateMs getcreatedondatems5, getCreatedOnDateMs getcreatedondatems6, int i, int i2, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape) {
        IconCompatParcelizer(uri, uri2, str, (getCreatedOnDateMs<getShowPopup>) getcreatedondatems, (getCreatedOnDateMs<getShowPopup>) getcreatedondatems2, (getCreatedOnDateMs<getShowPopup>) getcreatedondatems3, (getCreatedOnDateMs<getShowPopup>) getcreatedondatems4, (getCreatedOnDateMs<getShowPopup>) getcreatedondatems5, (getCreatedOnDateMs<getShowPopup>) getcreatedondatems6, i, _handleunrecognizedcharacterescape, _appendEscaped.RemoteActionCompatParcelizer(i2 | 1));
        return getShowPopup.INSTANCE;
    }
}
