package kotlin;

import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.RendererCapabilities;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow.R;
import com.marrow.designsystem.theme.MarrowTheme;
import com.marrow.designsystem.theme.TypeKt;
import java.util.Iterator;
import kotlin._handleOddName;
import org.apache.commons.compress.archivers.cpio.CpioConstants;

/* JADX INFO: loaded from: classes4.dex */
public final class zzmh {
    public static final void read(_handleOddName _handleoddname, final zzli zzliVar, final boolean z, final MagicModuleSubmissionRequestBody<? super String, ? super String, getShowPopup> magicModuleSubmissionRequestBody, final getCreatedOnDateMs<getShowPopup> getcreatedondatems, final MagicModuleSubmissionRequestBody<? super onDisplayInfoChanged, ? super String, getShowPopup> magicModuleSubmissionRequestBody2, final getAnswerMap<? super zzlk, getShowPopup> getanswermap, final getCreatedOnDateMs<getShowPopup> getcreatedondatems2, final getCreatedOnDateMs<getShowPopup> getcreatedondatems3, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, final int i, final int i2) {
        _handleOddName _handleoddname2;
        int i3;
        _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape2;
        _handleOddName _handleoddname3;
        int i4;
        toMagicModuleMetaRepoModel.write(zzliVar, "");
        toMagicModuleMetaRepoModel.write(magicModuleSubmissionRequestBody, "");
        toMagicModuleMetaRepoModel.write(getcreatedondatems, "");
        toMagicModuleMetaRepoModel.write(magicModuleSubmissionRequestBody2, "");
        toMagicModuleMetaRepoModel.write(getanswermap, "");
        toMagicModuleMetaRepoModel.write(getcreatedondatems2, "");
        toMagicModuleMetaRepoModel.write(getcreatedondatems3, "");
        _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescapeWrite = _handleunrecognizedcharacterescape.write(1827685939);
        int i5 = i2 & 1;
        if (i5 != 0) {
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
            i3 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(zzliVar) ? 32 : 16;
        }
        if ((i & RendererCapabilities.MODE_SUPPORT_MASK) == 0) {
            i3 |= _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(magicModuleSubmissionRequestBody) ? 2048 : 1024;
        }
        if ((i & CpioConstants.C_ISBLK) == 0) {
            i3 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(getcreatedondatems) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(magicModuleSubmissionRequestBody2) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE;
        }
        if ((1572864 & i) == 0) {
            i3 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(getanswermap) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((12582912 & i) == 0) {
            i3 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(getcreatedondatems2) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i3 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(getcreatedondatems3) ? 67108864 : 33554432;
        }
        int i6 = i3;
        if (!_handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer((38347923 & i6) != 38347922, i6 & 1)) {
            _handleunrecognizedcharacterescape2 = _handleunrecognizedcharacterescapeWrite;
            _handleunrecognizedcharacterescape2.onPrepareFromSearch();
        } else {
            _handleOddName _handleoddname4 = i5 != 0 ? _handleOddName.INSTANCE : _handleoddname2;
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(1827685939, i6, -1, "com.marrow2.ui.schema.detail.ui.SchemaDetailMainLayout (SchemaDetailMainLayout.kt:35)");
            }
            _handleOddName _handleoddnameIconCompatParcelizer$default = isAdded.IconCompatParcelizer$default(_handleoddname4, BitmapDescriptorFactory.HUE_RED, 1, null);
            withTypeHandler withtypehandlerWrite = AbsSavedState1.write(_skipWSOrEnd.INSTANCE.MediaBrowserCompatSearchResultReceiver(), false);
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
            _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape3 = NumberOutput.read(_handleunrecognizedcharacterescapeWrite);
            NumberOutput.write(_handleunrecognizedcharacterescape3, withtypehandlerWrite, getDependencies.INSTANCE.AudioAttributesImplBaseParcelizer());
            NumberOutput.write(_handleunrecognizedcharacterescape3, _getchardescHandleMediaPlayPauseIfPendingOnHandler, getDependencies.INSTANCE.MediaBrowserCompatItemReceiver());
            NumberOutput.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape3, Integer.valueOf(iHashCode), getDependencies.INSTANCE.AudioAttributesCompatParcelizer());
            NumberOutput.write(_handleunrecognizedcharacterescape3, getDependencies.INSTANCE.write());
            NumberOutput.write(_handleunrecognizedcharacterescape3, _handleoddnameRemoteActionCompatParcelizer, getDependencies.INSTANCE.MediaBrowserCompatCustomActionResultReceiver());
            setDrawerElevation setdrawerelevation = setDrawerElevation.INSTANCE;
            if (z) {
                _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(-651034100);
                _handleoddname3 = _handleoddname4;
                _handleunrecognizedcharacterescape2 = _handleunrecognizedcharacterescapeWrite;
                areCharSequencesEqual.AudioAttributesCompatParcelizer(null, singleArgCreatorDefaultsToProperties.read(R.string.please_wait_text, _handleunrecognizedcharacterescapeWrite, 6), singleArgCreatorDefaultsToProperties.RemoteActionCompatParcelizer(R.string.label_schema_loader_text, new Object[]{zzliVar.getAudioAttributesImplApi21Parcelizer()}, _handleunrecognizedcharacterescapeWrite, 6), _handleunrecognizedcharacterescapeWrite, 0, 1);
                _handleunrecognizedcharacterescape2.MediaBrowserCompatCustomActionResultReceiver();
                i4 = i6;
            } else {
                _handleoddname3 = _handleoddname4;
                _handleunrecognizedcharacterescape2 = _handleunrecognizedcharacterescapeWrite;
                if (zzliVar.getAudioAttributesImplBaseParcelizer()) {
                    _handleunrecognizedcharacterescape2.IconCompatParcelizer(-650709406);
                    i4 = i6;
                    zzmy.RemoteActionCompatParcelizer((_handleOddName) null, getcreatedondatems, _handleunrecognizedcharacterescape2, (i4 >> 9) & 112, 1);
                    _handleunrecognizedcharacterescape2.MediaBrowserCompatCustomActionResultReceiver();
                } else {
                    i4 = i6;
                    _handleunrecognizedcharacterescape2.IconCompatParcelizer(-650573595);
                    _handleOddName.Companion companion = _handleOddName.INSTANCE;
                    getReturnTransition getreturntransitionWrite = getParentFragment.write(VideoRendererEventListenerEventDispatcherExternalSyntheticLambda5.RemoteActionCompatParcelizer(null, assignParameter.IconCompatParcelizer(16.0f), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, _handleunrecognizedcharacterescape2, 48, 13), assignParameter.IconCompatParcelizer(16.0f));
                    boolean zIconCompatParcelizer = _handleunrecognizedcharacterescape2.IconCompatParcelizer(zzliVar);
                    boolean z2 = (i4 & 7168) == 2048;
                    boolean z3 = (458752 & i4) == 131072;
                    Object objOnPause = _handleunrecognizedcharacterescape2.onPause();
                    if ((zIconCompatParcelizer | z2 | z3) || objOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                        objOnPause = new getAnswerMap() { // from class: o.zzmp
                            @Override // kotlin.getAnswerMap
                            public final Object invoke(Object obj) {
                                return zzmh.IconCompatParcelizer(zzliVar, magicModuleSubmissionRequestBody, magicModuleSubmissionRequestBody2, (setReenterTransition) obj);
                            }
                        };
                        _handleunrecognizedcharacterescape2.RemoteActionCompatParcelizer(objOnPause);
                    }
                    performContextItemSelected.write(companion, null, getreturntransitionWrite, false, null, null, null, false, null, (getAnswerMap) objOnPause, _handleunrecognizedcharacterescape2, 6, 506);
                    _handleunrecognizedcharacterescape2.MediaBrowserCompatCustomActionResultReceiver();
                }
            }
            if (zzliVar.getAudioAttributesCompatParcelizer()) {
                _handleunrecognizedcharacterescape2.IconCompatParcelizer(-648951799);
                zzma.RemoteActionCompatParcelizer(null, zzliVar.write(), zzliVar.getAudioAttributesImplApi26Parcelizer(), getanswermap, getcreatedondatems2, getcreatedondatems3, _handleunrecognizedcharacterescape2, (i4 >> 9) & 523264, 1);
            } else {
                _handleunrecognizedcharacterescape2.IconCompatParcelizer(-652576939);
            }
            _handleunrecognizedcharacterescape2.MediaBrowserCompatCustomActionResultReceiver();
            _handleunrecognizedcharacterescape2.AudioAttributesImplBaseParcelizer();
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
            _handleoddname2 = _handleoddname3;
        }
        releaseNameCopyBuffer releasenamecopybufferMediaBrowserCompatSearchResultReceiver = _handleunrecognizedcharacterescape2.MediaBrowserCompatSearchResultReceiver();
        if (releasenamecopybufferMediaBrowserCompatSearchResultReceiver != null) {
            final _handleOddName _handleoddname5 = _handleoddname2;
            releasenamecopybufferMediaBrowserCompatSearchResultReceiver.read(new MagicModuleSubmissionRequestBody() { // from class: o.zzmn
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return zzmh.IconCompatParcelizer(_handleoddname5, zzliVar, z, magicModuleSubmissionRequestBody, getcreatedondatems, magicModuleSubmissionRequestBody2, getanswermap, getcreatedondatems2, getcreatedondatems3, i, i2, (_handleUnrecognizedCharacterEscape) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup IconCompatParcelizer(final zzli zzliVar, final MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody, final MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody2, setReenterTransition setreentertransition) {
        toMagicModuleMetaRepoModel.write(setreentertransition, "");
        setReenterTransition.AudioAttributesCompatParcelizer$default(setreentertransition, null, null, multiplyFft.IconCompatParcelizer(-399834412, true, new getModuleData() { // from class: o.zzmk
            @Override // kotlin.getModuleData
            public final Object AudioAttributesCompatParcelizer(Object obj, Object obj2, Object obj3) {
                return zzmh.IconCompatParcelizer(zzliVar, (performDestroy) obj, (_handleUnrecognizedCharacterEscape) obj2, ((Integer) obj3).intValue());
            }
        }), 3, null);
        if (zzliVar.getAudioAttributesImplApi21Parcelizer().length() > 0 && zzliVar.getWrite() == zzlk.RemoteActionCompatParcelizer) {
            setReenterTransition.AudioAttributesCompatParcelizer$default(setreentertransition, null, null, multiplyFft.IconCompatParcelizer(-1743168103, true, new getModuleData() { // from class: o.zzml
                @Override // kotlin.getModuleData
                public final Object AudioAttributesCompatParcelizer(Object obj, Object obj2, Object obj3) {
                    return zzmh.read(zzliVar, (performDestroy) obj, (_handleUnrecognizedCharacterEscape) obj2, ((Integer) obj3).intValue());
                }
            }), 3, null);
        }
        setReenterTransition.RemoteActionCompatParcelizer$default(setreentertransition, zzliVar.RemoteActionCompatParcelizer().size(), null, null, multiplyFft.IconCompatParcelizer(2128077803, true, new getMagicModuleStat() { // from class: o.zzmo
            @Override // kotlin.getMagicModuleStat
            public final Object write(Object obj, Object obj2, Object obj3, Object obj4) {
                return zzmh.IconCompatParcelizer(zzliVar, magicModuleSubmissionRequestBody, magicModuleSubmissionRequestBody2, (performDestroy) obj, ((Integer) obj2).intValue(), (_handleUnrecognizedCharacterEscape) obj3, ((Integer) obj4).intValue());
            }
        }), 6, null);
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup IconCompatParcelizer(zzli zzliVar, performDestroy performdestroy, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        toMagicModuleMetaRepoModel.write(performdestroy, "");
        if (!_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer((i & 17) != 16, i & 1)) {
            _handleunrecognizedcharacterescape.onPrepareFromSearch();
        } else {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(-399834412, i, -1, "com.marrow2.ui.schema.detail.ui.SchemaDetailMainLayout.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SchemaDetailMainLayout.kt:54)");
            }
            zzme.write(zzliVar.getMediaBrowserCompatItemReceiver(), _handleunrecognizedcharacterescape, 0);
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(zzli zzliVar, performDestroy performdestroy, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        toMagicModuleMetaRepoModel.write(performdestroy, "");
        if (!_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer((i & 17) != 16, i & 1)) {
            _handleunrecognizedcharacterescape.onPrepareFromSearch();
        } else {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(-1743168103, i, -1, "com.marrow2.ui.schema.detail.ui.SchemaDetailMainLayout.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SchemaDetailMainLayout.kt:61)");
            }
            String strRemoteActionCompatParcelizer = singleArgCreatorDefaultsToProperties.RemoteActionCompatParcelizer(R.string.label_schema_covered, new Object[]{zzliVar.getAudioAttributesImplApi21Parcelizer()}, _handleunrecognizedcharacterescape, 6);
            MarrowTheme marrowTheme = MarrowTheme.INSTANCE;
            _copyCurrentStringValue.IconCompatParcelizer(strRemoteActionCompatParcelizer, getParentFragment.write(_handleOddName.INSTANCE, assignParameter.IconCompatParcelizer(2.0f), assignParameter.IconCompatParcelizer(16.0f)), MarrowTheme.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape, MarrowTheme.RemoteActionCompatParcelizer).getOnSetPlaybackSpeed(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, TypeKt.RemoteActionCompatParcelizer(enabled.INSTANCE.IconCompatParcelizer(_handleunrecognizedcharacterescape, enabled.RemoteActionCompatParcelizer)), _handleunrecognizedcharacterescape, 0, 0, 65528);
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup IconCompatParcelizer(zzli zzliVar, MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody, MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody2, performDestroy performdestroy, int i, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i2) {
        toMagicModuleMetaRepoModel.write(performdestroy, "");
        if ((i2 & 48) == 0) {
            i2 |= _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(i) ? 32 : 16;
        }
        int size = 0;
        if (!_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer((i2 & 145) != 144, i2 & 1)) {
            _handleunrecognizedcharacterescape.onPrepareFromSearch();
        } else {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(2128077803, i2, -1, "com.marrow2.ui.schema.detail.ui.SchemaDetailMainLayout.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SchemaDetailMainLayout.kt:77)");
            }
            Iterator it = IntermediateLoginResponseBody.write((Iterable) zzliVar.RemoteActionCompatParcelizer(), i).iterator();
            while (it.hasNext()) {
                size += ((obtainSystemMessage) it.next()).RemoteActionCompatParcelizer().size();
            }
            zzmg.read(zzliVar.RemoteActionCompatParcelizer().get(i), size + 1, (MagicModuleSubmissionRequestBody<? super String, ? super String, getShowPopup>) magicModuleSubmissionRequestBody, (MagicModuleSubmissionRequestBody<? super onDisplayInfoChanged, ? super String, getShowPopup>) magicModuleSubmissionRequestBody2, _handleunrecognizedcharacterescape, 0);
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup IconCompatParcelizer(_handleOddName _handleoddname, zzli zzliVar, boolean z, MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody, getCreatedOnDateMs getcreatedondatems, MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody2, getAnswerMap getanswermap, getCreatedOnDateMs getcreatedondatems2, getCreatedOnDateMs getcreatedondatems3, int i, int i2, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape) {
        read(_handleoddname, zzliVar, z, magicModuleSubmissionRequestBody, getcreatedondatems, magicModuleSubmissionRequestBody2, getanswermap, getcreatedondatems2, getcreatedondatems3, _handleunrecognizedcharacterescape, _appendEscaped.RemoteActionCompatParcelizer(i | 1), i2);
        return getShowPopup.INSTANCE;
    }
}
