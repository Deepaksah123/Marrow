package kotlin;

import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.RendererCapabilities;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import com.marrow.R;
import com.marrow.designsystem.theme.MarrowTheme;
import com.marrow.designsystem.theme.TypeKt;
import kotlin.AbstractDeserializer;
import kotlin._handleOddName;
import org.apache.commons.compress.archivers.cpio.CpioConstants;

/* JADX INFO: loaded from: classes4.dex */
public final class logEventAndBundle {
    public static final void RemoteActionCompatParcelizer(_handleOddName _handleoddname, final String str, final boolean z, final int i, final Integer num, final int i2, final boolean z2, final int i3, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, final int i4, final int i5) {
        _handleOddName _handleoddname2;
        int i6;
        long jMediaBrowserCompatItemReceiver;
        int i7;
        long j;
        toMagicModuleMetaRepoModel.write(str, "");
        _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescapeWrite = _handleunrecognizedcharacterescape.write(511249490);
        int i8 = i5 & 1;
        if (i8 != 0) {
            i6 = i4 | 6;
            _handleoddname2 = _handleoddname;
        } else if ((i4 & 6) == 0) {
            _handleoddname2 = _handleoddname;
            i6 = (_handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(_handleoddname2) ? 4 : 2) | i4;
        } else {
            _handleoddname2 = _handleoddname;
            i6 = i4;
        }
        if ((i4 & 48) == 0) {
            i6 |= _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(str) ? 32 : 16;
        }
        if ((i4 & RendererCapabilities.MODE_SUPPORT_MASK) == 0) {
            i6 |= _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(z) ? 256 : 128;
        }
        if ((i4 & 3072) == 0) {
            i6 |= _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(i) ? 2048 : 1024;
        }
        if ((i4 & CpioConstants.C_ISBLK) == 0) {
            i6 |= _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(num) ? 16384 : 8192;
        }
        if ((196608 & i4) == 0) {
            i6 |= _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(i2) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE;
        }
        if ((1572864 & i4) == 0) {
            i6 |= _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(z2) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((12582912 & i4) == 0) {
            i6 |= _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(i3) ? 8388608 : 4194304;
        }
        int i9 = i6;
        if (!_handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer((4793491 & i9) != 4793490, i9 & 1)) {
            _handleunrecognizedcharacterescapeWrite.onPrepareFromSearch();
        } else {
            _handleOddName.Companion companion = i8 != 0 ? _handleOddName.INSTANCE : _handleoddname2;
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(511249490, i9, -1, "com.marrow2.ui.review_components.ui.description.child.OptionText (OptionText.kt:34)");
            }
            withTypeHandler withtypehandlerIconCompatParcelizer = getTag.IconCompatParcelizer(WindowInsetsCompatImpl30.INSTANCE.AudioAttributesImplApi21Parcelizer(), _skipWSOrEnd.INSTANCE.MediaBrowserCompatCustomActionResultReceiver(), _handleunrecognizedcharacterescapeWrite, 48);
            int iHashCode = Long.hashCode(_getBigDecimal.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, 0));
            _getCharDesc _getchardescHandleMediaPlayPauseIfPendingOnHandler = _handleunrecognizedcharacterescapeWrite.handleMediaPlayPauseIfPendingOnHandler();
            _handleOddName _handleoddnameRemoteActionCompatParcelizer = _verifyNLZ2.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, companion);
            getCreatedOnDateMs<getDependencies> getcreatedondatemsIconCompatParcelizer = getDependencies.INSTANCE.IconCompatParcelizer();
            _handleOddName _handleoddname3 = companion;
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
            int i10 = i + 1;
            boolean z3 = i10 == i2;
            boolean z4 = (num == null || i10 != num.intValue() || i2 == num.intValue()) ? false : true;
            if (z3) {
                _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(1537435389);
                MarrowTheme marrowTheme = MarrowTheme.INSTANCE;
                jMediaBrowserCompatItemReceiver = MarrowTheme.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, MarrowTheme.RemoteActionCompatParcelizer).getOnPlayFromUri();
                _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatCustomActionResultReceiver();
            } else if (z4) {
                _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(1537437626);
                MarrowTheme marrowTheme2 = MarrowTheme.INSTANCE;
                jMediaBrowserCompatItemReceiver = MarrowTheme.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, MarrowTheme.RemoteActionCompatParcelizer).getOnPrepareFromMediaId();
                _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatCustomActionResultReceiver();
            } else {
                _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(1537439351);
                jMediaBrowserCompatItemReceiver = enabled.INSTANCE.write(_handleunrecognizedcharacterescapeWrite, enabled.RemoteActionCompatParcelizer).MediaBrowserCompatItemReceiver();
                _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatCustomActionResultReceiver();
            }
            long j2 = jMediaBrowserCompatItemReceiver;
            if (z && (z3 || (z4 && z2))) {
                _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(416106944);
                i7 = i9;
                value.read(getDefaultSetterInfo.RemoteActionCompatParcelizer(z3 ? R.drawable.check_circle_rv : R.drawable.cancel_rv, _handleunrecognizedcharacterescapeWrite, 0), null, isAdded.AudioAttributesImplBaseParcelizer(_handleOddName.INSTANCE, assignParameter.IconCompatParcelizer(20.0f)), j2, _handleunrecognizedcharacterescapeWrite, isAnnotationBundle.read | 432, 0);
                isInLayout.RemoteActionCompatParcelizer(isAdded.AudioAttributesImplApi26Parcelizer(_handleOddName.INSTANCE, assignParameter.IconCompatParcelizer(10.0f)), _handleunrecognizedcharacterescapeWrite, 6);
                _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatCustomActionResultReceiver();
            } else {
                i7 = i9;
                _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(1537456598);
                isInLayout.RemoteActionCompatParcelizer(isAdded.AudioAttributesImplApi26Parcelizer(_handleOddName.INSTANCE, assignParameter.IconCompatParcelizer(30.0f)), _handleunrecognizedcharacterescapeWrite, 6);
                _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatCustomActionResultReceiver();
            }
            boolean z5 = (i7 & 7168) == 2048;
            Object objOnPause = _handleunrecognizedcharacterescapeWrite.onPause();
            if (z5 || objOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause = available.RemoteActionCompatParcelizer$default(Character.valueOf(isAccessibilityFocused.write(i)), null, 2, null);
                _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(objOnPause);
            }
            _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(1537463543);
            AbstractDeserializer.IconCompatParcelizer iconCompatParcelizer = new AbstractDeserializer.IconCompatParcelizer(0, 1, null);
            char upperCase = Character.toUpperCase(RemoteActionCompatParcelizer((InputAccessor) objOnPause));
            StringBuilder sb = new StringBuilder();
            sb.append(upperCase);
            sb.append(".  ");
            iconCompatParcelizer.RemoteActionCompatParcelizer(sb.toString());
            iconCompatParcelizer.RemoteActionCompatParcelizer(str);
            if (z) {
                _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(-2109502477);
                int i11 = iconCompatParcelizer.read(enabled.INSTANCE.IconCompatParcelizer(_handleunrecognizedcharacterescapeWrite, enabled.RemoteActionCompatParcelizer).getAudioAttributesImplBaseParcelizer().onRemoveQueueItemAt());
                try {
                    StringBuilder sb2 = new StringBuilder("  [");
                    sb2.append(i3);
                    sb2.append("%]");
                    iconCompatParcelizer.RemoteActionCompatParcelizer(sb2.toString());
                    getShowPopup getshowpopup = getShowPopup.INSTANCE;
                } finally {
                    iconCompatParcelizer.read(i11);
                }
            } else {
                _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(-972708545);
            }
            _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatCustomActionResultReceiver();
            AbstractDeserializer abstractDeserializerRemoteActionCompatParcelizer = iconCompatParcelizer.RemoteActionCompatParcelizer();
            _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatCustomActionResultReceiver();
            deserializeWithObjectId deserializewithobjectid = TypeKt.read(enabled.INSTANCE.IconCompatParcelizer(_handleunrecognizedcharacterescapeWrite, enabled.RemoteActionCompatParcelizer));
            if (z) {
                _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(1537476760);
                _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatCustomActionResultReceiver();
                j = j2;
            } else {
                _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(1537477943);
                long jMediaBrowserCompatItemReceiver2 = enabled.INSTANCE.write(_handleunrecognizedcharacterescapeWrite, enabled.RemoteActionCompatParcelizer).MediaBrowserCompatItemReceiver();
                _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatCustomActionResultReceiver();
                j = jMediaBrowserCompatItemReceiver2;
            }
            _copyCurrentStringValue.read(abstractDeserializerRemoteActionCompatParcelizer, null, j, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, deserializewithobjectid, _handleunrecognizedcharacterescapeWrite, 0, 0, 131066);
            _handleunrecognizedcharacterescapeWrite.AudioAttributesImplBaseParcelizer();
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
            _handleoddname2 = _handleoddname3;
        }
        releaseNameCopyBuffer releasenamecopybufferMediaBrowserCompatSearchResultReceiver = _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatSearchResultReceiver();
        if (releasenamecopybufferMediaBrowserCompatSearchResultReceiver != null) {
            final _handleOddName _handleoddname4 = _handleoddname2;
            releasenamecopybufferMediaBrowserCompatSearchResultReceiver.read(new MagicModuleSubmissionRequestBody() { // from class: o.setConditionalUserProperty
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return logEventAndBundle.IconCompatParcelizer(_handleoddname4, str, z, i, num, i2, z2, i3, i4, i5, (_handleUnrecognizedCharacterEscape) obj);
                }
            });
        }
    }

    private static final char RemoteActionCompatParcelizer(InputAccessor<Character> inputAccessor) {
        return inputAccessor.getRemoteActionCompatParcelizer().charValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup IconCompatParcelizer(_handleOddName _handleoddname, String str, boolean z, int i, Integer num, int i2, boolean z2, int i3, int i4, int i5, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape) {
        RemoteActionCompatParcelizer(_handleoddname, str, z, i, num, i2, z2, i3, _handleunrecognizedcharacterescape, _appendEscaped.RemoteActionCompatParcelizer(i4 | 1), i5);
        return getShowPopup.INSTANCE;
    }
}
