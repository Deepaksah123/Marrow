package kotlin;

import com.google.android.exoplayer2.RendererCapabilities;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow.R;
import com.marrow.designsystem.theme.MarrowTheme;
import com.marrow.designsystem.theme.TypeKt;
import kotlin.AbstractDeserializer;
import kotlin._handleOddName;
import kotlin.zznu;

/* JADX INFO: loaded from: classes4.dex */
public final class zzok {
    public static final void read(_handleOddName _handleoddname, final zznu.IconCompatParcelizer iconCompatParcelizer, final getAnswerMap<? super zznu.IconCompatParcelizer, getShowPopup> getanswermap, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, final int i, final int i2) {
        _handleOddName _handleoddname2;
        int i3;
        _handleOddName.Companion companion;
        MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0;
        toMagicModuleMetaRepoModel.write(iconCompatParcelizer, "");
        toMagicModuleMetaRepoModel.write(getanswermap, "");
        _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescapeWrite = _handleunrecognizedcharacterescape.write(-96699275);
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
            i3 |= _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(iconCompatParcelizer) ? 32 : 16;
        }
        if ((i & RendererCapabilities.MODE_SUPPORT_MASK) == 0) {
            i3 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(getanswermap) ? 256 : 128;
        }
        if (!_handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer((i3 & 147) != 146, i3 & 1)) {
            _handleunrecognizedcharacterescapeWrite.onPrepareFromSearch();
            companion = _handleoddname2;
        } else {
            companion = i4 != 0 ? _handleOddName.INSTANCE : _handleoddname2;
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(-96699275, i3, -1, "com.marrow2.ui.schema.incomplete.ui.SchemaIncompleteQBankItemLayout (SchemaIncompleteQBankItemLayout.kt:29)");
            }
            boolean z = (i3 & 896) == 256;
            boolean z2 = (i3 & 112) == 32;
            Object objOnPause = _handleunrecognizedcharacterescapeWrite.onPause();
            if ((z | z2) || objOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause = new getCreatedOnDateMs() { // from class: o.zzon
                    @Override // kotlin.getCreatedOnDateMs
                    public final Object invoke() {
                        return zzok.AudioAttributesCompatParcelizer(getanswermap, iconCompatParcelizer);
                    }
                };
                _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(objOnPause);
            }
            _handleOddName _handleoddnameIconCompatParcelizer$default = isAdded.IconCompatParcelizer$default(getLocalSavedStateRegistryOwner.RemoteActionCompatParcelizer$default(companion, false, null, null, null, (getCreatedOnDateMs) objOnPause, 15, null), BitmapDescriptorFactory.HUE_RED, 1, null);
            withTypeHandler withtypehandlerIconCompatParcelizer = getTag.IconCompatParcelizer(WindowInsetsCompatImpl30.INSTANCE.AudioAttributesImplApi21Parcelizer(), _skipWSOrEnd.INSTANCE.MediaBrowserCompatCustomActionResultReceiver(), _handleunrecognizedcharacterescapeWrite, 48);
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
            NumberOutput.write(_handleunrecognizedcharacterescape2, withtypehandlerIconCompatParcelizer, getDependencies.INSTANCE.AudioAttributesImplBaseParcelizer());
            NumberOutput.write(_handleunrecognizedcharacterescape2, _getchardescHandleMediaPlayPauseIfPendingOnHandler, getDependencies.INSTANCE.MediaBrowserCompatItemReceiver());
            NumberOutput.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape2, Integer.valueOf(iHashCode), getDependencies.INSTANCE.AudioAttributesCompatParcelizer());
            NumberOutput.write(_handleunrecognizedcharacterescape2, getDependencies.INSTANCE.write());
            NumberOutput.write(_handleunrecognizedcharacterescape2, _handleoddnameRemoteActionCompatParcelizer, getDependencies.INSTANCE.MediaBrowserCompatCustomActionResultReceiver());
            getView getview = getView.INSTANCE;
            if (iconCompatParcelizer.read()) {
                _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(1483272829);
                _handleOddName _handleoddnameIconCompatParcelizer = getParentFragment.IconCompatParcelizer(_handleOddName.INSTANCE, assignParameter.IconCompatParcelizer(2.0f));
                isAnnotationBundle isannotationbundleRemoteActionCompatParcelizer = getDefaultSetterInfo.RemoteActionCompatParcelizer(R.drawable.check_circle_rv, _handleunrecognizedcharacterescapeWrite, 6);
                MarrowTheme marrowTheme = MarrowTheme.INSTANCE;
                magicModuleRepositoryImplExternalSyntheticLambda0 = null;
                value.read(isannotationbundleRemoteActionCompatParcelizer, null, _handleoddnameIconCompatParcelizer, MarrowTheme.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, MarrowTheme.RemoteActionCompatParcelizer).getOnPlayFromMediaId(), _handleunrecognizedcharacterescapeWrite, isAnnotationBundle.read | 432, 0);
                _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatCustomActionResultReceiver();
            } else {
                magicModuleRepositoryImplExternalSyntheticLambda0 = null;
                _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(1483548233);
                isInLayout.RemoteActionCompatParcelizer(isAdded.AudioAttributesImplApi26Parcelizer(_handleOddName.INSTANCE, assignParameter.IconCompatParcelizer(22.0f)), _handleunrecognizedcharacterescapeWrite, 6);
                _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatCustomActionResultReceiver();
            }
            _handleOddName _handleoddnameAudioAttributesCompatParcelizer$default = getParentFragment.AudioAttributesCompatParcelizer$default(_handleOddName.INSTANCE, assignParameter.IconCompatParcelizer(4.0f), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null);
            _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(-1614705579);
            AbstractDeserializer.IconCompatParcelizer iconCompatParcelizer2 = new AbstractDeserializer.IconCompatParcelizer(0, 1, magicModuleRepositoryImplExternalSyntheticLambda0);
            _findPropertyUnwrapper _findpropertyunwrapperOnRemoveQueueItemAt = TypeKt.RemoteActionCompatParcelizer(enabled.INSTANCE.IconCompatParcelizer(_handleunrecognizedcharacterescapeWrite, enabled.RemoteActionCompatParcelizer)).onRemoveQueueItemAt();
            MarrowTheme marrowTheme2 = MarrowTheme.INSTANCE;
            int i5 = iconCompatParcelizer2.read(_findpropertyunwrapperOnRemoveQueueItemAt.write((65503 & 1) != 0 ? _findpropertyunwrapperOnRemoveQueueItemAt.read() : MarrowTheme.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, MarrowTheme.RemoteActionCompatParcelizer).getR8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8(), (65503 & 2) != 0 ? _findpropertyunwrapperOnRemoveQueueItemAt.AudioAttributesCompatParcelizer : 0L, (65503 & 4) != 0 ? _findpropertyunwrapperOnRemoveQueueItemAt.RemoteActionCompatParcelizer : null, (65503 & 8) != 0 ? _findpropertyunwrapperOnRemoveQueueItemAt.write : null, (65503 & 16) != 0 ? _findpropertyunwrapperOnRemoveQueueItemAt.read : null, (65503 & 32) != 0 ? _findpropertyunwrapperOnRemoveQueueItemAt.AudioAttributesImplBaseParcelizer : null, (65503 & 64) != 0 ? _findpropertyunwrapperOnRemoveQueueItemAt.MediaBrowserCompatCustomActionResultReceiver : null, (65503 & 128) != 0 ? _findpropertyunwrapperOnRemoveQueueItemAt.MediaBrowserCompatItemReceiver : 0L, (65503 & 256) != 0 ? _findpropertyunwrapperOnRemoveQueueItemAt.AudioAttributesImplApi21Parcelizer : null, (65503 & 512) != 0 ? _findpropertyunwrapperOnRemoveQueueItemAt.AudioAttributesImplApi26Parcelizer : null, (65503 & 1024) != 0 ? _findpropertyunwrapperOnRemoveQueueItemAt.MediaBrowserCompatMediaItem : null, (65503 & 2048) != 0 ? _findpropertyunwrapperOnRemoveQueueItemAt.MediaDescriptionCompat : 0L, (65503 & 4096) != 0 ? _findpropertyunwrapperOnRemoveQueueItemAt.MediaMetadataCompat : null, (65503 & 8192) != 0 ? _findpropertyunwrapperOnRemoveQueueItemAt.MediaBrowserCompatSearchResultReceiver : null, (65503 & 16384) != 0 ? _findpropertyunwrapperOnRemoveQueueItemAt.RatingCompat : null, (65503 & 32768) != 0 ? _findpropertyunwrapperOnRemoveQueueItemAt.onCustomAction : null));
            try {
                String strRemoteActionCompatParcelizer = iconCompatParcelizer.RemoteActionCompatParcelizer();
                StringBuilder sb = new StringBuilder();
                sb.append(strRemoteActionCompatParcelizer);
                sb.append(" ");
                iconCompatParcelizer2.RemoteActionCompatParcelizer(sb.toString());
                getShowPopup getshowpopup = getShowPopup.INSTANCE;
                iconCompatParcelizer2.read(i5);
                _findPropertyUnwrapper _findpropertyunwrapperOnRemoveQueueItemAt2 = enabled.INSTANCE.IconCompatParcelizer(_handleunrecognizedcharacterescapeWrite, enabled.RemoteActionCompatParcelizer).getAudioAttributesImplBaseParcelizer().onRemoveQueueItemAt();
                MarrowTheme marrowTheme3 = MarrowTheme.INSTANCE;
                i5 = iconCompatParcelizer2.read(_findpropertyunwrapperOnRemoveQueueItemAt2.write((65503 & 1) != 0 ? _findpropertyunwrapperOnRemoveQueueItemAt2.read() : MarrowTheme.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, MarrowTheme.RemoteActionCompatParcelizer).getOnSetPlaybackSpeed(), (65503 & 2) != 0 ? _findpropertyunwrapperOnRemoveQueueItemAt2.AudioAttributesCompatParcelizer : 0L, (65503 & 4) != 0 ? _findpropertyunwrapperOnRemoveQueueItemAt2.RemoteActionCompatParcelizer : null, (65503 & 8) != 0 ? _findpropertyunwrapperOnRemoveQueueItemAt2.write : null, (65503 & 16) != 0 ? _findpropertyunwrapperOnRemoveQueueItemAt2.read : null, (65503 & 32) != 0 ? _findpropertyunwrapperOnRemoveQueueItemAt2.AudioAttributesImplBaseParcelizer : null, (65503 & 64) != 0 ? _findpropertyunwrapperOnRemoveQueueItemAt2.MediaBrowserCompatCustomActionResultReceiver : null, (65503 & 128) != 0 ? _findpropertyunwrapperOnRemoveQueueItemAt2.MediaBrowserCompatItemReceiver : 0L, (65503 & 256) != 0 ? _findpropertyunwrapperOnRemoveQueueItemAt2.AudioAttributesImplApi21Parcelizer : null, (65503 & 512) != 0 ? _findpropertyunwrapperOnRemoveQueueItemAt2.AudioAttributesImplApi26Parcelizer : null, (65503 & 1024) != 0 ? _findpropertyunwrapperOnRemoveQueueItemAt2.MediaBrowserCompatMediaItem : null, (65503 & 2048) != 0 ? _findpropertyunwrapperOnRemoveQueueItemAt2.MediaDescriptionCompat : 0L, (65503 & 4096) != 0 ? _findpropertyunwrapperOnRemoveQueueItemAt2.MediaMetadataCompat : null, (65503 & 8192) != 0 ? _findpropertyunwrapperOnRemoveQueueItemAt2.MediaBrowserCompatSearchResultReceiver : null, (65503 & 16384) != 0 ? _findpropertyunwrapperOnRemoveQueueItemAt2.RatingCompat : null, (65503 & 32768) != 0 ? _findpropertyunwrapperOnRemoveQueueItemAt2.onCustomAction : null));
                try {
                    int iIconCompatParcelizer = iconCompatParcelizer.IconCompatParcelizer();
                    StringBuilder sb2 = new StringBuilder("(");
                    sb2.append(iIconCompatParcelizer);
                    sb2.append(")");
                    iconCompatParcelizer2.RemoteActionCompatParcelizer(sb2.toString());
                    getShowPopup getshowpopup2 = getShowPopup.INSTANCE;
                    iconCompatParcelizer2.read(i5);
                    AbstractDeserializer abstractDeserializerRemoteActionCompatParcelizer = iconCompatParcelizer2.RemoteActionCompatParcelizer();
                    _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatCustomActionResultReceiver();
                    _copyCurrentStringValue.read(abstractDeserializerRemoteActionCompatParcelizer, _handleoddnameAudioAttributesCompatParcelizer$default, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, null, _handleunrecognizedcharacterescapeWrite, 48, 0, 262140);
                    _handleunrecognizedcharacterescapeWrite.AudioAttributesImplBaseParcelizer();
                    if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                        _validJsonValueList.AudioAttributesImplApi21Parcelizer();
                    }
                } finally {
                }
            } finally {
            }
        }
        releaseNameCopyBuffer releasenamecopybufferMediaBrowserCompatSearchResultReceiver = _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatSearchResultReceiver();
        if (releasenamecopybufferMediaBrowserCompatSearchResultReceiver != null) {
            final _handleOddName _handleoddname3 = companion;
            releasenamecopybufferMediaBrowserCompatSearchResultReceiver.read(new MagicModuleSubmissionRequestBody() { // from class: o.zzoj
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return zzok.read(_handleoddname3, iconCompatParcelizer, getanswermap, i, i2, (_handleUnrecognizedCharacterEscape) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesCompatParcelizer(getAnswerMap getanswermap, zznu.IconCompatParcelizer iconCompatParcelizer) {
        getanswermap.invoke(iconCompatParcelizer);
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(_handleOddName _handleoddname, zznu.IconCompatParcelizer iconCompatParcelizer, getAnswerMap getanswermap, int i, int i2, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape) {
        read(_handleoddname, iconCompatParcelizer, (getAnswerMap<? super zznu.IconCompatParcelizer, getShowPopup>) getanswermap, _handleunrecognizedcharacterescape, _appendEscaped.RemoteActionCompatParcelizer(i | 1), i2);
        return getShowPopup.INSTANCE;
    }
}
