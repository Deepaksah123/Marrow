package kotlin;

import com.google.android.exoplayer2.RendererCapabilities;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow.R;
import com.marrow.designsystem.theme.MarrowTheme;
import com.marrow.designsystem.theme.TypeKt;
import kotlin._handleOddName;
import kotlin._skipWSOrEnd;
import org.apache.commons.compress.archivers.cpio.CpioConstants;

/* JADX INFO: loaded from: classes4.dex */
public final class zzre {
    public static final void write(_handleOddName _handleoddname, final boolean z, final zzpy zzpyVar, final getCreatedOnDateMs<getShowPopup> getcreatedondatems, final getAnswerMap<? super zzpy, getShowPopup> getanswermap, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, final int i, final int i2) {
        _handleOddName _handleoddname2;
        int i3;
        _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape2;
        final _handleOddName _handleoddname3;
        toMagicModuleMetaRepoModel.write(zzpyVar, "");
        toMagicModuleMetaRepoModel.write(getcreatedondatems, "");
        toMagicModuleMetaRepoModel.write(getanswermap, "");
        _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescapeWrite = _handleunrecognizedcharacterescape.write(862830428);
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
            i3 |= _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(z) ? 32 : 16;
        }
        if ((i & RendererCapabilities.MODE_SUPPORT_MASK) == 0) {
            i3 |= _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(zzpyVar.ordinal()) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(getcreatedondatems) ? 2048 : 1024;
        }
        if ((i & CpioConstants.C_ISBLK) == 0) {
            i3 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(getanswermap) ? 16384 : 8192;
        }
        int i5 = i3;
        if (!_handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer((i5 & 9363) != 9362, i5 & 1)) {
            _handleunrecognizedcharacterescape2 = _handleunrecognizedcharacterescapeWrite;
            _handleunrecognizedcharacterescape2.onPrepareFromSearch();
            _handleoddname3 = _handleoddname2;
        } else {
            _handleOddName _handleoddname4 = i4 != 0 ? _handleOddName.INSTANCE : _handleoddname2;
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(862830428, i5, -1, "com.marrow2.ui.schema.listing.ui.header.SchemaListSortDropdownLayout (SchemaListSortDropdownLayout.kt:42)");
            }
            int i6 = i5 & 7168;
            boolean z2 = i6 == 2048;
            Object objOnPause = _handleunrecognizedcharacterescapeWrite.onPause();
            if (z2 || objOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause = new getCreatedOnDateMs() { // from class: o.zzrc
                    @Override // kotlin.getCreatedOnDateMs
                    public final Object invoke() {
                        return zzre.RemoteActionCompatParcelizer(getcreatedondatems);
                    }
                };
                _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(objOnPause);
            }
            _handleOddName _handleoddnameRemoteActionCompatParcelizer$default = getLocalSavedStateRegistryOwner.RemoteActionCompatParcelizer$default(_handleoddname4, false, null, null, null, (getCreatedOnDateMs) objOnPause, 15, null);
            withTypeHandler withtypehandlerWrite = AbsSavedState1.write(_skipWSOrEnd.INSTANCE.MediaBrowserCompatSearchResultReceiver(), false);
            int iHashCode = Long.hashCode(_getBigDecimal.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, 0));
            _getCharDesc _getchardescHandleMediaPlayPauseIfPendingOnHandler = _handleunrecognizedcharacterescapeWrite.handleMediaPlayPauseIfPendingOnHandler();
            _handleOddName _handleoddnameRemoteActionCompatParcelizer = _verifyNLZ2.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, _handleoddnameRemoteActionCompatParcelizer$default);
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
            NumberOutput.write(_handleunrecognizedcharacterescape3, withtypehandlerWrite, getDependencies.INSTANCE.AudioAttributesImplBaseParcelizer());
            NumberOutput.write(_handleunrecognizedcharacterescape3, _getchardescHandleMediaPlayPauseIfPendingOnHandler, getDependencies.INSTANCE.MediaBrowserCompatItemReceiver());
            NumberOutput.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape3, Integer.valueOf(iHashCode), getDependencies.INSTANCE.AudioAttributesCompatParcelizer());
            NumberOutput.write(_handleunrecognizedcharacterescape3, getDependencies.INSTANCE.write());
            NumberOutput.write(_handleunrecognizedcharacterescape3, _handleoddnameRemoteActionCompatParcelizer, getDependencies.INSTANCE.MediaBrowserCompatCustomActionResultReceiver());
            setDrawerElevation setdrawerelevation = setDrawerElevation.INSTANCE;
            _skipWSOrEnd.read readVarMediaBrowserCompatCustomActionResultReceiver = _skipWSOrEnd.INSTANCE.MediaBrowserCompatCustomActionResultReceiver();
            _handleOddName.Companion companion = _handleOddName.INSTANCE;
            withTypeHandler withtypehandlerIconCompatParcelizer = getTag.IconCompatParcelizer(WindowInsetsCompatImpl30.INSTANCE.AudioAttributesImplApi21Parcelizer(), readVarMediaBrowserCompatCustomActionResultReceiver, _handleunrecognizedcharacterescapeWrite, 48);
            int iHashCode2 = Long.hashCode(_getBigDecimal.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, 0));
            _getCharDesc _getchardescHandleMediaPlayPauseIfPendingOnHandler2 = _handleunrecognizedcharacterescapeWrite.handleMediaPlayPauseIfPendingOnHandler();
            _handleOddName _handleoddnameRemoteActionCompatParcelizer2 = _verifyNLZ2.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, companion);
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
            NumberOutput.write(_handleunrecognizedcharacterescape4, withtypehandlerIconCompatParcelizer, getDependencies.INSTANCE.AudioAttributesImplBaseParcelizer());
            NumberOutput.write(_handleunrecognizedcharacterescape4, _getchardescHandleMediaPlayPauseIfPendingOnHandler2, getDependencies.INSTANCE.MediaBrowserCompatItemReceiver());
            NumberOutput.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape4, Integer.valueOf(iHashCode2), getDependencies.INSTANCE.AudioAttributesCompatParcelizer());
            NumberOutput.write(_handleunrecognizedcharacterescape4, getDependencies.INSTANCE.write());
            NumberOutput.write(_handleunrecognizedcharacterescape4, _handleoddnameRemoteActionCompatParcelizer2, getDependencies.INSTANCE.MediaBrowserCompatCustomActionResultReceiver());
            getView getview = getView.INSTANCE;
            String str = singleArgCreatorDefaultsToProperties.read(R.string.sort_by_schema, _handleunrecognizedcharacterescapeWrite, 6);
            _handleOddName _handleoddnameAudioAttributesCompatParcelizer$default = getParentFragment.AudioAttributesCompatParcelizer$default(_handleOddName.INSTANCE, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, assignParameter.IconCompatParcelizer(4.0f), BitmapDescriptorFactory.HUE_RED, 11, null);
            MarrowTheme marrowTheme = MarrowTheme.INSTANCE;
            _copyCurrentStringValue.IconCompatParcelizer(str, _handleoddnameAudioAttributesCompatParcelizer$default, MarrowTheme.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, MarrowTheme.RemoteActionCompatParcelizer).getOnSetRating(), 0L, null, null, null, 0L, null, assignIndexes.write(assignIndexes.INSTANCE.AudioAttributesCompatParcelizer()), 0L, 0, false, 0, 0, null, TypeKt.AudioAttributesImplApi26Parcelizer(enabled.INSTANCE.IconCompatParcelizer(_handleunrecognizedcharacterescapeWrite, enabled.RemoteActionCompatParcelizer)), _handleunrecognizedcharacterescapeWrite, 48, 0, 65016);
            isInLayout.RemoteActionCompatParcelizer(isAdded.AudioAttributesImplApi26Parcelizer(_handleOddName.INSTANCE, assignParameter.IconCompatParcelizer(1.0f)), _handleunrecognizedcharacterescapeWrite, 6);
            _copyCurrentStringValue.IconCompatParcelizer(zzpyVar.getWrite(), null, enabled.INSTANCE.write(_handleunrecognizedcharacterescapeWrite, enabled.RemoteActionCompatParcelizer).IconCompatParcelizer(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, TypeKt.MediaBrowserCompatItemReceiver(enabled.INSTANCE.IconCompatParcelizer(_handleunrecognizedcharacterescapeWrite, enabled.RemoteActionCompatParcelizer)), _handleunrecognizedcharacterescapeWrite, 0, 0, 65530);
            _handleOddName _handleoddnameIconCompatParcelizer = getParentFragment.IconCompatParcelizer(isAdded.AudioAttributesImplBaseParcelizer(_handleOddName.INSTANCE, assignParameter.IconCompatParcelizer(20.0f)), assignParameter.IconCompatParcelizer(6.0f));
            isAnnotationBundle isannotationbundleRemoteActionCompatParcelizer = getDefaultSetterInfo.RemoteActionCompatParcelizer(z ? R.drawable.ic_arrow_up_revamp : R.drawable.ic_arrow_down_revamp, _handleunrecognizedcharacterescapeWrite, 0);
            MarrowTheme marrowTheme2 = MarrowTheme.INSTANCE;
            value.read(isannotationbundleRemoteActionCompatParcelizer, null, _handleoddnameIconCompatParcelizer, MarrowTheme.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, MarrowTheme.RemoteActionCompatParcelizer).getOnSetRating(), _handleunrecognizedcharacterescapeWrite, isAnnotationBundle.read | 432, 0);
            _handleunrecognizedcharacterescapeWrite.AudioAttributesImplBaseParcelizer();
            _handleOddName _handleoddnameAudioAttributesImplApi26Parcelizer = isAdded.AudioAttributesImplApi26Parcelizer(getFrameEndSchedulerui.IconCompatParcelizer$default(_writeSegment.IconCompatParcelizer$default(_handleOddName.INSTANCE, assignParameter.IconCompatParcelizer(4.0f), null, false, 0L, 0L, 30, null), enabled.INSTANCE.write(_handleunrecognizedcharacterescapeWrite, enabled.RemoteActionCompatParcelizer).MediaBrowserCompatSearchResultReceiver(), null, 2, null), assignParameter.IconCompatParcelizer(220.0f));
            boolean z3 = i6 == 2048;
            Object objOnPause2 = _handleunrecognizedcharacterescapeWrite.onPause();
            if (z3 || objOnPause2 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause2 = new getCreatedOnDateMs() { // from class: o.zzrh
                    @Override // kotlin.getCreatedOnDateMs
                    public final Object invoke() {
                        return zzre.IconCompatParcelizer(getcreatedondatems);
                    }
                };
                _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(objOnPause2);
            }
            _handleunrecognizedcharacterescape2 = _handleunrecognizedcharacterescapeWrite;
            decrementValue.IconCompatParcelizer(z, (getCreatedOnDateMs<getShowPopup>) objOnPause2, _handleoddnameAudioAttributesImplApi26Parcelizer, 0L, (setTranslationY) null, (withDateFormat) null, multiplyFft.AudioAttributesCompatParcelizer(-191571051, true, new getModuleData() { // from class: o.zzrg
                @Override // kotlin.getModuleData
                public final Object AudioAttributesCompatParcelizer(Object obj, Object obj2, Object obj3) {
                    return zzre.read(zzpyVar, getanswermap, (DrawerLayoutLayoutParams) obj, (_handleUnrecognizedCharacterEscape) obj2, ((Integer) obj3).intValue());
                }
            }, _handleunrecognizedcharacterescapeWrite, 54), _handleunrecognizedcharacterescapeWrite, ((i5 >> 3) & 14) | 1572864, 56);
            _handleunrecognizedcharacterescape2.AudioAttributesImplBaseParcelizer();
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
            _handleoddname3 = _handleoddname4;
        }
        releaseNameCopyBuffer releasenamecopybufferMediaBrowserCompatSearchResultReceiver = _handleunrecognizedcharacterescape2.MediaBrowserCompatSearchResultReceiver();
        if (releasenamecopybufferMediaBrowserCompatSearchResultReceiver != null) {
            releasenamecopybufferMediaBrowserCompatSearchResultReceiver.read(new MagicModuleSubmissionRequestBody() { // from class: o.zzrj
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return zzre.IconCompatParcelizer(_handleoddname3, z, zzpyVar, getcreatedondatems, getanswermap, i, i2, (_handleUnrecognizedCharacterEscape) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup RemoteActionCompatParcelizer(getCreatedOnDateMs getcreatedondatems) {
        getcreatedondatems.invoke();
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup IconCompatParcelizer(getCreatedOnDateMs getcreatedondatems) {
        getcreatedondatems.invoke();
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(zzpy zzpyVar, final getAnswerMap getanswermap, DrawerLayoutLayoutParams drawerLayoutLayoutParams, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        toMagicModuleMetaRepoModel.write(drawerLayoutLayoutParams, "");
        if (!_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer((i & 17) != 16, i & 1)) {
            _handleunrecognizedcharacterescape.onPrepareFromSearch();
        } else {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(-191571051, i, -1, "com.marrow2.ui.schema.listing.ui.header.SchemaListSortDropdownLayout.<anonymous>.<anonymous> (SchemaListSortDropdownLayout.kt:79)");
            }
            zzpy[] zzpyVarArrValues = zzpy.values();
            int length = zzpyVarArrValues.length;
            int i2 = 0;
            int i3 = 0;
            while (i3 < length) {
                final zzpy zzpyVar2 = zzpyVarArrValues[i3];
                final boolean z = zzpyVar2 == zzpyVar;
                _handleOddName _handleoddnameIconCompatParcelizer$default = getFrameEndSchedulerui.IconCompatParcelizer$default(_handleOddName.INSTANCE, enabled.INSTANCE.write(_handleunrecognizedcharacterescape, enabled.RemoteActionCompatParcelizer).MediaBrowserCompatSearchResultReceiver(), null, 2, null);
                getReturnTransition getreturntransitionWrite = getParentFragment.write(assignParameter.IconCompatParcelizer(8.0f), assignParameter.IconCompatParcelizer(4.0f));
                boolean zAudioAttributesCompatParcelizer = _handleunrecognizedcharacterescape.AudioAttributesCompatParcelizer(getanswermap);
                boolean zRemoteActionCompatParcelizer = _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(zzpyVar2.ordinal());
                Object objOnPause = _handleunrecognizedcharacterescape.onPause();
                if ((zAudioAttributesCompatParcelizer | zRemoteActionCompatParcelizer) || objOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                    objOnPause = new getCreatedOnDateMs() { // from class: o.zzrb
                        @Override // kotlin.getCreatedOnDateMs
                        public final Object invoke() {
                            return zzre.AudioAttributesCompatParcelizer(getanswermap, zzpyVar2);
                        }
                    };
                    _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause);
                }
                int i4 = i2;
                decrementValue.AudioAttributesCompatParcelizer((getCreatedOnDateMs) objOnPause, _handleoddnameIconCompatParcelizer$default, false, getreturntransitionWrite, null, multiplyFft.AudioAttributesCompatParcelizer(20891680, true, new getModuleData() { // from class: o.zzrf
                    @Override // kotlin.getModuleData
                    public final Object AudioAttributesCompatParcelizer(Object obj, Object obj2, Object obj3) {
                        return zzre.write(z, zzpyVar2, (getViewLifecycleOwnerLiveData) obj, (_handleUnrecognizedCharacterEscape) obj2, ((Integer) obj3).intValue());
                    }
                }, _handleunrecognizedcharacterescape, 54), _handleunrecognizedcharacterescape, 196608, 20);
                if (i4 == zzpy.values().length - 1) {
                    _handleunrecognizedcharacterescape.IconCompatParcelizer(-1016191515);
                } else {
                    _handleunrecognizedcharacterescape.IconCompatParcelizer(-1011908121);
                    MarrowTheme marrowTheme = MarrowTheme.INSTANCE;
                    updatePositions.read(null, MarrowTheme.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape, MarrowTheme.RemoteActionCompatParcelizer).get_init_lambda3(), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, _handleunrecognizedcharacterescape, 0, 13);
                }
                _handleunrecognizedcharacterescape.MediaBrowserCompatCustomActionResultReceiver();
                i3++;
                i2 = i4 + 1;
            }
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesCompatParcelizer(getAnswerMap getanswermap, zzpy zzpyVar) {
        getanswermap.invoke(zzpyVar);
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup write(boolean z, zzpy zzpyVar, getViewLifecycleOwnerLiveData getviewlifecycleownerlivedata, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        deserializeWithObjectId mediaBrowserCompatCustomActionResultReceiver;
        toMagicModuleMetaRepoModel.write(getviewlifecycleownerlivedata, "");
        if (!_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer((i & 17) != 16, i & 1)) {
            _handleunrecognizedcharacterescape.onPrepareFromSearch();
        } else {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(20891680, i, -1, "com.marrow2.ui.schema.listing.ui.header.SchemaListSortDropdownLayout.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SchemaListSortDropdownLayout.kt:91)");
            }
            isAnnotationBundle isannotationbundleRemoteActionCompatParcelizer = getDefaultSetterInfo.RemoteActionCompatParcelizer(R.drawable.ic_blue_check, _handleunrecognizedcharacterescape, 6);
            _handleOddName _handleoddnameAudioAttributesCompatParcelizer = addName.AudioAttributesCompatParcelizer(_handleOddName.INSTANCE, z ? 1.0f : BitmapDescriptorFactory.HUE_RED);
            MarrowTheme marrowTheme = MarrowTheme.INSTANCE;
            value.read(isannotationbundleRemoteActionCompatParcelizer, null, _handleoddnameAudioAttributesCompatParcelizer, MarrowTheme.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape, MarrowTheme.RemoteActionCompatParcelizer).getOnPrepareFromUri(), _handleunrecognizedcharacterescape, isAnnotationBundle.read | 48, 0);
            String write = zzpyVar.getWrite();
            _handleOddName _handleoddnameAudioAttributesCompatParcelizer$default = getParentFragment.AudioAttributesCompatParcelizer$default(_handleOddName.INSTANCE, assignParameter.IconCompatParcelizer(8.0f), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null);
            if (z) {
                _handleunrecognizedcharacterescape.IconCompatParcelizer(-1397914974);
                mediaBrowserCompatCustomActionResultReceiver = enabled.INSTANCE.IconCompatParcelizer(_handleunrecognizedcharacterescape, enabled.RemoteActionCompatParcelizer).getMediaBrowserCompatCustomActionResultReceiver();
            } else {
                _handleunrecognizedcharacterescape.IconCompatParcelizer(-1397913911);
                mediaBrowserCompatCustomActionResultReceiver = TypeKt.read(enabled.INSTANCE.IconCompatParcelizer(_handleunrecognizedcharacterescape, enabled.RemoteActionCompatParcelizer));
            }
            _handleunrecognizedcharacterescape.MediaBrowserCompatCustomActionResultReceiver();
            _copyCurrentStringValue.IconCompatParcelizer(write, _handleoddnameAudioAttributesCompatParcelizer$default, enabled.INSTANCE.write(_handleunrecognizedcharacterescape, enabled.RemoteActionCompatParcelizer).MediaBrowserCompatItemReceiver(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mediaBrowserCompatCustomActionResultReceiver, _handleunrecognizedcharacterescape, 48, 0, 65528);
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup IconCompatParcelizer(_handleOddName _handleoddname, boolean z, zzpy zzpyVar, getCreatedOnDateMs getcreatedondatems, getAnswerMap getanswermap, int i, int i2, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape) {
        write(_handleoddname, z, zzpyVar, getcreatedondatems, getanswermap, _handleunrecognizedcharacterescape, _appendEscaped.RemoteActionCompatParcelizer(i | 1), i2);
        return getShowPopup.INSTANCE;
    }
}
