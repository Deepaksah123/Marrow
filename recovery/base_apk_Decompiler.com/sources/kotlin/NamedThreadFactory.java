package kotlin;

import com.google.android.exoplayer2.RendererCapabilities;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow.designsystem.theme.MarrowTheme;
import com.marrow.designsystem.theme.TypeKt;
import java.util.List;
import kotlin.AbstractDeserializer;

/* JADX INFO: loaded from: classes4.dex */
public final class NamedThreadFactory {
    public static final void read(_handleOddName _handleoddname, final String str, final List<String> list, final long j, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, final int i, final int i2) {
        _handleOddName _handleoddname2;
        int i3;
        final _handleOddName _handleoddname3;
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(list, "");
        _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescapeWrite = _handleunrecognizedcharacterescape.write(240256135);
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
            i3 |= _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(str) ? 32 : 16;
        }
        if ((i & RendererCapabilities.MODE_SUPPORT_MASK) == 0) {
            i3 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(list) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(j) ? 2048 : 1024;
        }
        if (!_handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer((i3 & 1171) != 1170, i3 & 1)) {
            _handleunrecognizedcharacterescapeWrite.onPrepareFromSearch();
            _handleoddname3 = _handleoddname2;
        } else {
            _handleOddName _handleoddname4 = i4 != 0 ? _handleOddName.INSTANCE : _handleoddname2;
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(240256135, i3, -1, "com.marrow2.ui.plan.membership_detail.ui.main.ui.MembershipDetail (MembershipDetail.kt:25)");
            }
            withTypeHandler withtypehandler = setValue.read(WindowInsetsCompatImpl30.INSTANCE.MediaBrowserCompatCustomActionResultReceiver(), _skipWSOrEnd.INSTANCE.RatingCompat(), _handleunrecognizedcharacterescapeWrite, 0);
            int iHashCode = Long.hashCode(_getBigDecimal.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, 0));
            _getCharDesc _getchardescHandleMediaPlayPauseIfPendingOnHandler = _handleunrecognizedcharacterescapeWrite.handleMediaPlayPauseIfPendingOnHandler();
            _handleOddName _handleoddnameRemoteActionCompatParcelizer = _verifyNLZ2.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, _handleoddname4);
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
            DrawerLayoutSavedState drawerLayoutSavedState = DrawerLayoutSavedState.INSTANCE;
            _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(-1057071154);
            AbstractDeserializer.IconCompatParcelizer iconCompatParcelizer = new AbstractDeserializer.IconCompatParcelizer(0, 1, null);
            int i5 = iconCompatParcelizer.read(enabled.INSTANCE.IconCompatParcelizer(_handleunrecognizedcharacterescapeWrite, enabled.RemoteActionCompatParcelizer).getMediaBrowserCompatCustomActionResultReceiver().onRemoveQueueItemAt());
            try {
                iconCompatParcelizer.RemoteActionCompatParcelizer(str);
                iconCompatParcelizer.RemoteActionCompatParcelizer("\t\t");
                getShowPopup getshowpopup = getShowPopup.INSTANCE;
                iconCompatParcelizer.read(i5);
                i5 = iconCompatParcelizer.read(TypeKt.AudioAttributesImplApi26Parcelizer(enabled.INSTANCE.IconCompatParcelizer(_handleunrecognizedcharacterescapeWrite, enabled.RemoteActionCompatParcelizer)).onRemoveQueueItemAt());
                try {
                    iconCompatParcelizer.RemoteActionCompatParcelizer("•");
                    iconCompatParcelizer.RemoteActionCompatParcelizer("\t\t");
                    iconCompatParcelizer.RemoteActionCompatParcelizer("Valid till ");
                    getShowPopup getshowpopup2 = getShowPopup.INSTANCE;
                    iconCompatParcelizer.read(i5);
                    i5 = iconCompatParcelizer.read(TypeKt.MediaBrowserCompatItemReceiver(enabled.INSTANCE.IconCompatParcelizer(_handleunrecognizedcharacterescapeWrite, enabled.RemoteActionCompatParcelizer)).onRemoveQueueItemAt());
                    try {
                        iconCompatParcelizer.RemoteActionCompatParcelizer(loadBitmap.RemoteActionCompatParcelizer(j, "dd MMM yyyy"));
                        getShowPopup getshowpopup3 = getShowPopup.INSTANCE;
                        iconCompatParcelizer.read(i5);
                        AbstractDeserializer abstractDeserializerRemoteActionCompatParcelizer = iconCompatParcelizer.RemoteActionCompatParcelizer();
                        _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatCustomActionResultReceiver();
                        _handleoddname3 = _handleoddname4;
                        _copyCurrentStringValue.read(abstractDeserializerRemoteActionCompatParcelizer, null, enabled.INSTANCE.write(_handleunrecognizedcharacterescapeWrite, enabled.RemoteActionCompatParcelizer).IconCompatParcelizer(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, null, _handleunrecognizedcharacterescapeWrite, 0, 0, 262138);
                        int i6 = 6;
                        isInLayout.RemoteActionCompatParcelizer(isAdded.AudioAttributesCompatParcelizer(_handleOddName.INSTANCE, assignParameter.IconCompatParcelizer(8.0f)), _handleunrecognizedcharacterescapeWrite, 6);
                        _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(-1057043137);
                        for (String str2 : list) {
                            _handleOddName _handleoddnameAudioAttributesCompatParcelizer$default = getParentFragment.AudioAttributesCompatParcelizer$default(_handleOddName.INSTANCE, assignParameter.IconCompatParcelizer(8.0f), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null);
                            MarrowTheme marrowTheme = MarrowTheme.INSTANCE;
                            int i7 = i6;
                            StyledPlayerControlViewLayoutManager4.IconCompatParcelizer(_handleoddnameAudioAttributesCompatParcelizer$default, str2, TypeKt.AudioAttributesImplApi26Parcelizer(enabled.INSTANCE.IconCompatParcelizer(_handleunrecognizedcharacterescapeWrite, enabled.RemoteActionCompatParcelizer)), MarrowTheme.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, MarrowTheme.RemoteActionCompatParcelizer).getOnSetPlaybackSpeed(), _handleunrecognizedcharacterescapeWrite, 6, 0);
                            isInLayout.RemoteActionCompatParcelizer(isAdded.AudioAttributesCompatParcelizer(_handleOddName.INSTANCE, assignParameter.IconCompatParcelizer(8.0f)), _handleunrecognizedcharacterescapeWrite, i7);
                            i6 = i7;
                        }
                        _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatCustomActionResultReceiver();
                        _handleunrecognizedcharacterescapeWrite.AudioAttributesImplBaseParcelizer();
                        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                            _validJsonValueList.AudioAttributesImplApi21Parcelizer();
                        }
                    } finally {
                    }
                } finally {
                }
            } finally {
            }
        }
        releaseNameCopyBuffer releasenamecopybufferMediaBrowserCompatSearchResultReceiver = _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatSearchResultReceiver();
        if (releasenamecopybufferMediaBrowserCompatSearchResultReceiver != null) {
            releasenamecopybufferMediaBrowserCompatSearchResultReceiver.read(new MagicModuleSubmissionRequestBody() { // from class: o.isCallerInstantApp
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return NamedThreadFactory.RemoteActionCompatParcelizer(_handleoddname3, str, list, j, i, i2, (_handleUnrecognizedCharacterEscape) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup RemoteActionCompatParcelizer(_handleOddName _handleoddname, String str, List list, long j, int i, int i2, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape) {
        read(_handleoddname, str, list, j, _handleunrecognizedcharacterescape, _appendEscaped.RemoteActionCompatParcelizer(i | 1), i2);
        return getShowPopup.INSTANCE;
    }
}
