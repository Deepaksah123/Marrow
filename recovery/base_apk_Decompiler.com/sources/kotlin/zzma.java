package kotlin;

import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.RendererCapabilities;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow.R;
import com.marrow.designsystem.theme.MarrowTheme;
import com.marrow.designsystem.theme.TypeKt;
import java.util.List;
import java.util.Locale;
import kotlin._handleOddName;
import kotlin.zzli;
import org.apache.commons.compress.archivers.cpio.CpioConstants;

/* JADX INFO: loaded from: classes4.dex */
public final class zzma {

    public static final /* synthetic */ class write {
        public static final /* synthetic */ int[] RemoteActionCompatParcelizer;

        static {
            int[] iArr = new int[zzlk.values().length];
            try {
                iArr[zzlk.RemoteActionCompatParcelizer.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[zzlk.IconCompatParcelizer.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[zzlk.write.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[zzlk.read.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            RemoteActionCompatParcelizer = iArr;
        }
    }

    public static final void RemoteActionCompatParcelizer(_handleOddName _handleoddname, final List<zzli.RemoteActionCompatParcelizer> list, final zzlk zzlkVar, final getAnswerMap<? super zzlk, getShowPopup> getanswermap, final getCreatedOnDateMs<getShowPopup> getcreatedondatems, final getCreatedOnDateMs<getShowPopup> getcreatedondatems2, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, final int i, final int i2) {
        _handleOddName _handleoddname2;
        int i3;
        _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape2;
        toMagicModuleMetaRepoModel.write(list, "");
        toMagicModuleMetaRepoModel.write(zzlkVar, "");
        toMagicModuleMetaRepoModel.write(getanswermap, "");
        toMagicModuleMetaRepoModel.write(getcreatedondatems, "");
        toMagicModuleMetaRepoModel.write(getcreatedondatems2, "");
        _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescapeWrite = _handleunrecognizedcharacterescape.write(-1606038864);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            _handleoddname2 = _handleoddname;
        } else if ((i & 6) == 0) {
            _handleoddname2 = _handleoddname;
            i3 = (_handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(_handleoddname2) ? 4 : 2) | i;
        } else {
            _handleoddname2 = _handleoddname;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(list) ? 32 : 16;
        }
        if ((i & RendererCapabilities.MODE_SUPPORT_MASK) == 0) {
            i3 |= _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(zzlkVar.ordinal()) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(getanswermap) ? 2048 : 1024;
        }
        if ((i & CpioConstants.C_ISBLK) == 0) {
            i3 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(getcreatedondatems) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(getcreatedondatems2) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE;
        }
        if (!_handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer((74899 & i3) != 74898, i3 & 1)) {
            _handleunrecognizedcharacterescape2 = _handleunrecognizedcharacterescapeWrite;
            _handleunrecognizedcharacterescape2.onPrepareFromSearch();
        } else {
            _handleOddName _handleoddname3 = i4 != 0 ? _handleOddName.INSTANCE : _handleoddname2;
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(-1606038864, i3, -1, "com.marrow2.ui.schema.detail.ui.SchemaDetailFilter (SchemaDetailFilter.kt:42)");
            }
            int i5 = 458752 & i3;
            boolean z = i5 == 131072;
            Object objOnPause = _handleunrecognizedcharacterescapeWrite.onPause();
            if (z || objOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause = new getCreatedOnDateMs() { // from class: o.zzly
                    @Override // kotlin.getCreatedOnDateMs
                    public final Object invoke() {
                        return zzma.IconCompatParcelizer(getcreatedondatems2);
                    }
                };
                _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(objOnPause);
            }
            MediaSessionCompatToken.write(false, (getCreatedOnDateMs) objOnPause, _handleunrecognizedcharacterescapeWrite, 0, 1);
            _handleOddName _handleoddname4 = _handleoddname3;
            _handleOddName _handleoddnameIconCompatParcelizer = _parseFloatThatStartsWithPeriod.IconCompatParcelizer(isAdded.IconCompatParcelizer$default(_handleoddname3, BitmapDescriptorFactory.HUE_RED, 1, null), 6.0f);
            withTypeHandler withtypehandler = setValue.read(WindowInsetsCompatImpl30.INSTANCE.MediaBrowserCompatCustomActionResultReceiver(), _skipWSOrEnd.INSTANCE.RatingCompat(), _handleunrecognizedcharacterescapeWrite, 0);
            int iHashCode = Long.hashCode(_getBigDecimal.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, 0));
            _getCharDesc _getchardescHandleMediaPlayPauseIfPendingOnHandler = _handleunrecognizedcharacterescapeWrite.handleMediaPlayPauseIfPendingOnHandler();
            _handleOddName _handleoddnameRemoteActionCompatParcelizer = _verifyNLZ2.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, _handleoddnameIconCompatParcelizer);
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
            DrawerLayoutSavedState drawerLayoutSavedState = DrawerLayoutSavedState.INSTANCE;
            _handleOddName.Companion companion = _handleOddName.INSTANCE;
            boolean z2 = i5 == 131072;
            Object objOnPause2 = _handleunrecognizedcharacterescapeWrite.onPause();
            if (z2 || objOnPause2 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause2 = new getCreatedOnDateMs() { // from class: o.zzlz
                    @Override // kotlin.getCreatedOnDateMs
                    public final Object invoke() {
                        return zzma.RemoteActionCompatParcelizer(getcreatedondatems2);
                    }
                };
                _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(objOnPause2);
            }
            _handleOddName _handleoddnameIconCompatParcelizer$default = isAdded.IconCompatParcelizer$default(splitRtspMessageBody.write(companion, (getCreatedOnDateMs) objOnPause2), BitmapDescriptorFactory.HUE_RED, 1, null);
            MarrowTheme marrowTheme = MarrowTheme.INSTANCE;
            _handleOddName _handleoddnameIconCompatParcelizer$default2 = getFrameEndSchedulerui.IconCompatParcelizer$default(_handleoddnameIconCompatParcelizer$default, MarrowTheme.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, MarrowTheme.RemoteActionCompatParcelizer).getOnSkipToPrevious(), null, 2, null);
            withTypeHandler withtypehandlerWrite = AbsSavedState1.write(_skipWSOrEnd.INSTANCE.MediaBrowserCompatSearchResultReceiver(), false);
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
            _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape4 = NumberOutput.read(_handleunrecognizedcharacterescapeWrite);
            NumberOutput.write(_handleunrecognizedcharacterescape4, withtypehandlerWrite, getDependencies.INSTANCE.AudioAttributesImplBaseParcelizer());
            NumberOutput.write(_handleunrecognizedcharacterescape4, _getchardescHandleMediaPlayPauseIfPendingOnHandler2, getDependencies.INSTANCE.MediaBrowserCompatItemReceiver());
            NumberOutput.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape4, Integer.valueOf(iHashCode2), getDependencies.INSTANCE.AudioAttributesCompatParcelizer());
            NumberOutput.write(_handleunrecognizedcharacterescape4, getDependencies.INSTANCE.write());
            NumberOutput.write(_handleunrecognizedcharacterescape4, _handleoddnameRemoteActionCompatParcelizer2, getDependencies.INSTANCE.MediaBrowserCompatCustomActionResultReceiver());
            setDrawerElevation setdrawerelevation = setDrawerElevation.INSTANCE;
            _handleOddName.Companion companion2 = _handleOddName.INSTANCE;
            Object objOnPause3 = _handleunrecognizedcharacterescapeWrite.onPause();
            if (objOnPause3 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause3 = new getCreatedOnDateMs() { // from class: o.zzlw
                    @Override // kotlin.getCreatedOnDateMs
                    public final Object invoke() {
                        return zzma.IconCompatParcelizer();
                    }
                };
                _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(objOnPause3);
            }
            _handleOddName _handleoddnameIconCompatParcelizer$default3 = getFrameEndSchedulerui.IconCompatParcelizer$default(isAdded.AudioAttributesImplApi26Parcelizer(setdrawerelevation.AudioAttributesCompatParcelizer(splitRtspMessageBody.write(companion2, (getCreatedOnDateMs) objOnPause3), _skipWSOrEnd.INSTANCE.MediaMetadataCompat()), assignParameter.IconCompatParcelizer(265.0f)), enabled.INSTANCE.write(_handleunrecognizedcharacterescapeWrite, enabled.RemoteActionCompatParcelizer).MediaBrowserCompatSearchResultReceiver(), null, 2, null);
            withTypeHandler withtypehandlerWrite2 = AbsSavedState1.write(_skipWSOrEnd.INSTANCE.MediaBrowserCompatSearchResultReceiver(), false);
            int iHashCode3 = Long.hashCode(_getBigDecimal.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, 0));
            _getCharDesc _getchardescHandleMediaPlayPauseIfPendingOnHandler3 = _handleunrecognizedcharacterescapeWrite.handleMediaPlayPauseIfPendingOnHandler();
            _handleOddName _handleoddnameRemoteActionCompatParcelizer3 = _verifyNLZ2.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, _handleoddnameIconCompatParcelizer$default3);
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
            _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape5 = NumberOutput.read(_handleunrecognizedcharacterescapeWrite);
            NumberOutput.write(_handleunrecognizedcharacterescape5, withtypehandlerWrite2, getDependencies.INSTANCE.AudioAttributesImplBaseParcelizer());
            NumberOutput.write(_handleunrecognizedcharacterescape5, _getchardescHandleMediaPlayPauseIfPendingOnHandler3, getDependencies.INSTANCE.MediaBrowserCompatItemReceiver());
            NumberOutput.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape5, Integer.valueOf(iHashCode3), getDependencies.INSTANCE.AudioAttributesCompatParcelizer());
            NumberOutput.write(_handleunrecognizedcharacterescape5, getDependencies.INSTANCE.write());
            NumberOutput.write(_handleunrecognizedcharacterescape5, _handleoddnameRemoteActionCompatParcelizer3, getDependencies.INSTANCE.MediaBrowserCompatCustomActionResultReceiver());
            setDrawerElevation setdrawerelevation2 = setDrawerElevation.INSTANCE;
            _handleOddName.Companion companion3 = _handleOddName.INSTANCE;
            withTypeHandler withtypehandler2 = setValue.read(WindowInsetsCompatImpl30.INSTANCE.MediaBrowserCompatCustomActionResultReceiver(), _skipWSOrEnd.INSTANCE.RatingCompat(), _handleunrecognizedcharacterescapeWrite, 0);
            int iHashCode4 = Long.hashCode(_getBigDecimal.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, 0));
            _getCharDesc _getchardescHandleMediaPlayPauseIfPendingOnHandler4 = _handleunrecognizedcharacterescapeWrite.handleMediaPlayPauseIfPendingOnHandler();
            _handleOddName _handleoddnameRemoteActionCompatParcelizer4 = _verifyNLZ2.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, companion3);
            getCreatedOnDateMs<getDependencies> getcreatedondatemsIconCompatParcelizer4 = getDependencies.INSTANCE.IconCompatParcelizer();
            if (!(_handleunrecognizedcharacterescapeWrite.MediaMetadataCompat() instanceof _closeInput)) {
                _getBigDecimal.write();
            }
            _handleunrecognizedcharacterescapeWrite.onPrepareFromMediaId();
            if (_handleunrecognizedcharacterescapeWrite.getParcelableVolumeInfo()) {
                _handleunrecognizedcharacterescapeWrite.read(getcreatedondatemsIconCompatParcelizer4);
            } else {
                _handleunrecognizedcharacterescapeWrite.onPlayFromUri();
            }
            _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape6 = NumberOutput.read(_handleunrecognizedcharacterescapeWrite);
            NumberOutput.write(_handleunrecognizedcharacterescape6, withtypehandler2, getDependencies.INSTANCE.AudioAttributesImplBaseParcelizer());
            NumberOutput.write(_handleunrecognizedcharacterescape6, _getchardescHandleMediaPlayPauseIfPendingOnHandler4, getDependencies.INSTANCE.MediaBrowserCompatItemReceiver());
            NumberOutput.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape6, Integer.valueOf(iHashCode4), getDependencies.INSTANCE.AudioAttributesCompatParcelizer());
            NumberOutput.write(_handleunrecognizedcharacterescape6, getDependencies.INSTANCE.write());
            NumberOutput.write(_handleunrecognizedcharacterescape6, _handleoddnameRemoteActionCompatParcelizer4, getDependencies.INSTANCE.MediaBrowserCompatCustomActionResultReceiver());
            DrawerLayoutSavedState drawerLayoutSavedState2 = DrawerLayoutSavedState.INSTANCE;
            isInLayout.RemoteActionCompatParcelizer(isAdded.AudioAttributesCompatParcelizer(_handleOddName.INSTANCE, assignParameter.IconCompatParcelizer(12.0f)), _handleunrecognizedcharacterescapeWrite, 6);
            _handleOddName _handleoddnameWrite = getParentFragment.write(getFrameEndSchedulerui.IconCompatParcelizer$default(isAdded.RemoteActionCompatParcelizer$default(_handleOddName.INSTANCE, BitmapDescriptorFactory.HUE_RED, 1, null), enabled.INSTANCE.write(_handleunrecognizedcharacterescapeWrite, enabled.RemoteActionCompatParcelizer).read(), null, 2, null), assignParameter.IconCompatParcelizer(16.0f), assignParameter.IconCompatParcelizer(5.0f));
            String upperCase = singleArgCreatorDefaultsToProperties.read(R.string.text_filter_by, _handleunrecognizedcharacterescapeWrite, 6).toUpperCase(Locale.ROOT);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(upperCase, "");
            deserializeWithObjectId deserializewithobjectidMediaBrowserCompatItemReceiver = TypeKt.MediaBrowserCompatItemReceiver(enabled.INSTANCE.IconCompatParcelizer(_handleunrecognizedcharacterescapeWrite, enabled.RemoteActionCompatParcelizer));
            MarrowTheme marrowTheme2 = MarrowTheme.INSTANCE;
            int i6 = i3;
            _copyCurrentStringValue.IconCompatParcelizer(upperCase, _handleoddnameWrite, MarrowTheme.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, MarrowTheme.RemoteActionCompatParcelizer).getOnSetRating(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, deserializewithobjectidMediaBrowserCompatItemReceiver, _handleunrecognizedcharacterescapeWrite, 0, 0, 65528);
            _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape7 = _handleunrecognizedcharacterescapeWrite;
            isInLayout.RemoteActionCompatParcelizer(isAdded.AudioAttributesCompatParcelizer(_handleOddName.INSTANCE, assignParameter.IconCompatParcelizer(6.0f)), _handleunrecognizedcharacterescape7, 6);
            _handleunrecognizedcharacterescape7.IconCompatParcelizer(-1757592385);
            for (final zzli.RemoteActionCompatParcelizer remoteActionCompatParcelizer : list) {
                String strRemoteActionCompatParcelizer = singleArgCreatorDefaultsToProperties.RemoteActionCompatParcelizer(RemoteActionCompatParcelizer(remoteActionCompatParcelizer.AudioAttributesCompatParcelizer()), new Object[]{Integer.valueOf(remoteActionCompatParcelizer.RemoteActionCompatParcelizer())}, _handleunrecognizedcharacterescape7, 0);
                int iRemoteActionCompatParcelizer = remoteActionCompatParcelizer.RemoteActionCompatParcelizer();
                boolean z3 = remoteActionCompatParcelizer.AudioAttributesCompatParcelizer() == zzlkVar;
                boolean z4 = (i6 & 7168) == 2048;
                boolean zAudioAttributesCompatParcelizer = _handleunrecognizedcharacterescape7.AudioAttributesCompatParcelizer(remoteActionCompatParcelizer);
                Object objOnPause4 = _handleunrecognizedcharacterescape7.onPause();
                if ((z4 | zAudioAttributesCompatParcelizer) || objOnPause4 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                    objOnPause4 = new getCreatedOnDateMs() { // from class: o.zzmc
                        @Override // kotlin.getCreatedOnDateMs
                        public final Object invoke() {
                            return zzma.RemoteActionCompatParcelizer(getanswermap, remoteActionCompatParcelizer);
                        }
                    };
                    _handleunrecognizedcharacterescape7.RemoteActionCompatParcelizer(objOnPause4);
                }
                drawTextLayout.write((_handleOddName) null, strRemoteActionCompatParcelizer, iRemoteActionCompatParcelizer, z3, (getCreatedOnDateMs<getShowPopup>) objOnPause4, _handleunrecognizedcharacterescape7, 0, 1);
                _handleunrecognizedcharacterescape7 = _handleunrecognizedcharacterescape7;
            }
            _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape8 = _handleunrecognizedcharacterescape7;
            _handleunrecognizedcharacterescape8.MediaBrowserCompatCustomActionResultReceiver();
            _handleOddName _handleoddnameRemoteActionCompatParcelizer$default = isAdded.RemoteActionCompatParcelizer$default(_handleOddName.INSTANCE, BitmapDescriptorFactory.HUE_RED, 1, null);
            MarrowTheme marrowTheme3 = MarrowTheme.INSTANCE;
            _handleunrecognizedcharacterescape2 = _handleunrecognizedcharacterescape8;
            updatePositions.read(_handleoddnameRemoteActionCompatParcelizer$default, MarrowTheme.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape8, MarrowTheme.RemoteActionCompatParcelizer).get_init_lambda3(), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, _handleunrecognizedcharacterescape8, 6, 12);
            _handleOddName _handleoddnameWrite2 = getParentFragment.write(isAdded.RemoteActionCompatParcelizer$default(_handleOddName.INSTANCE, BitmapDescriptorFactory.HUE_RED, 1, null), assignParameter.IconCompatParcelizer(60.0f), assignParameter.IconCompatParcelizer(8.0f));
            withTypeHandler withtypehandlerWrite3 = AbsSavedState1.write(_skipWSOrEnd.INSTANCE.MediaBrowserCompatSearchResultReceiver(), false);
            int iHashCode5 = Long.hashCode(_getBigDecimal.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape2, 0));
            _getCharDesc _getchardescHandleMediaPlayPauseIfPendingOnHandler5 = _handleunrecognizedcharacterescape2.handleMediaPlayPauseIfPendingOnHandler();
            _handleOddName _handleoddnameRemoteActionCompatParcelizer5 = _verifyNLZ2.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape2, _handleoddnameWrite2);
            getCreatedOnDateMs<getDependencies> getcreatedondatemsIconCompatParcelizer5 = getDependencies.INSTANCE.IconCompatParcelizer();
            if (!(_handleunrecognizedcharacterescape2.MediaMetadataCompat() instanceof _closeInput)) {
                _getBigDecimal.write();
            }
            _handleunrecognizedcharacterescape2.onPrepareFromMediaId();
            if (_handleunrecognizedcharacterescape2.getParcelableVolumeInfo()) {
                _handleunrecognizedcharacterescape2.read(getcreatedondatemsIconCompatParcelizer5);
            } else {
                _handleunrecognizedcharacterescape2.onPlayFromUri();
            }
            _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape9 = NumberOutput.read(_handleunrecognizedcharacterescape2);
            NumberOutput.write(_handleunrecognizedcharacterescape9, withtypehandlerWrite3, getDependencies.INSTANCE.AudioAttributesImplBaseParcelizer());
            NumberOutput.write(_handleunrecognizedcharacterescape9, _getchardescHandleMediaPlayPauseIfPendingOnHandler5, getDependencies.INSTANCE.MediaBrowserCompatItemReceiver());
            NumberOutput.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape9, Integer.valueOf(iHashCode5), getDependencies.INSTANCE.AudioAttributesCompatParcelizer());
            NumberOutput.write(_handleunrecognizedcharacterescape9, getDependencies.INSTANCE.write());
            NumberOutput.write(_handleunrecognizedcharacterescape9, _handleoddnameRemoteActionCompatParcelizer5, getDependencies.INSTANCE.MediaBrowserCompatCustomActionResultReceiver());
            setDrawerElevation setdrawerelevation3 = setDrawerElevation.INSTANCE;
            _handleOddName _handleoddnameRemoteActionCompatParcelizer$default2 = isAdded.RemoteActionCompatParcelizer$default(_handleOddName.INSTANCE, BitmapDescriptorFactory.HUE_RED, 1, null);
            getReturnTransition getreturntransitionWrite$default = getParentFragment.write$default(BitmapDescriptorFactory.HUE_RED, assignParameter.IconCompatParcelizer(12.0f), 1, null);
            boolean z5 = (i6 & 57344) == 16384;
            Object objOnPause5 = _handleunrecognizedcharacterescape2.onPause();
            if (z5 || objOnPause5 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause5 = new getCreatedOnDateMs() { // from class: o.zzmf
                    @Override // kotlin.getCreatedOnDateMs
                    public final Object invoke() {
                        return zzma.AudioAttributesImplApi21Parcelizer(getcreatedondatems);
                    }
                };
                _handleunrecognizedcharacterescape2.RemoteActionCompatParcelizer(objOnPause5);
            }
            getCreatedOnDateMs getcreatedondatems3 = (getCreatedOnDateMs) objOnPause5;
            zzlp zzlpVar = zzlp.write;
            CloseImageView.AudioAttributesCompatParcelizer(getcreatedondatems3, _handleoddnameRemoteActionCompatParcelizer$default2, false, null, null, null, null, null, getreturntransitionWrite$default, zzlp.write(), _handleunrecognizedcharacterescape2, 905969712, 252);
            _handleunrecognizedcharacterescape2.AudioAttributesImplBaseParcelizer();
            _handleunrecognizedcharacterescape2.AudioAttributesImplBaseParcelizer();
            _handleunrecognizedcharacterescape2.AudioAttributesImplBaseParcelizer();
            _handleunrecognizedcharacterescape2.AudioAttributesImplBaseParcelizer();
            _handleunrecognizedcharacterescape2.AudioAttributesImplBaseParcelizer();
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
            _handleoddname2 = _handleoddname4;
        }
        releaseNameCopyBuffer releasenamecopybufferMediaBrowserCompatSearchResultReceiver = _handleunrecognizedcharacterescape2.MediaBrowserCompatSearchResultReceiver();
        if (releasenamecopybufferMediaBrowserCompatSearchResultReceiver != null) {
            final _handleOddName _handleoddname5 = _handleoddname2;
            releasenamecopybufferMediaBrowserCompatSearchResultReceiver.read(new MagicModuleSubmissionRequestBody() { // from class: o.zzmd
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return zzma.write(_handleoddname5, list, zzlkVar, getanswermap, getcreatedondatems, getcreatedondatems2, i, i2, (_handleUnrecognizedCharacterEscape) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup IconCompatParcelizer(getCreatedOnDateMs getcreatedondatems) {
        getcreatedondatems.invoke();
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup RemoteActionCompatParcelizer(getCreatedOnDateMs getcreatedondatems) {
        getcreatedondatems.invoke();
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup IconCompatParcelizer() {
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup RemoteActionCompatParcelizer(getAnswerMap getanswermap, zzli.RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        getanswermap.invoke(remoteActionCompatParcelizer.AudioAttributesCompatParcelizer());
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesImplApi21Parcelizer(getCreatedOnDateMs getcreatedondatems) {
        getcreatedondatems.invoke();
        return getShowPopup.INSTANCE;
    }

    private static int RemoteActionCompatParcelizer(zzlk zzlkVar) {
        toMagicModuleMetaRepoModel.write(zzlkVar, "");
        int i = write.RemoteActionCompatParcelizer[zzlkVar.ordinal()];
        if (i == 1) {
            return R.string.text_review_filter_all;
        }
        if (i == 2) {
            return R.string.text_review_filter_correct;
        }
        if (i == 3) {
            return R.string.text_review_filter_wrong;
        }
        if (i == 4) {
            return R.string.text_review_filter_skip;
        }
        throw new RenewEligibleCreator();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup write(_handleOddName _handleoddname, List list, zzlk zzlkVar, getAnswerMap getanswermap, getCreatedOnDateMs getcreatedondatems, getCreatedOnDateMs getcreatedondatems2, int i, int i2, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape) {
        RemoteActionCompatParcelizer(_handleoddname, list, zzlkVar, getanswermap, getcreatedondatems, getcreatedondatems2, _handleunrecognizedcharacterescape, _appendEscaped.RemoteActionCompatParcelizer(i | 1), i2);
        return getShowPopup.INSTANCE;
    }
}
