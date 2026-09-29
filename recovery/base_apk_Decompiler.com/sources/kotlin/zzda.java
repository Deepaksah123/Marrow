package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow.R;
import com.marrow.designsystem.theme.MarrowTheme;
import com.marrow2.ui.qbank.score.model.RevisionSubjectUIModel;
import kotlin._handleOddName;
import kotlin._skipWSOrEnd;

/* JADX INFO: loaded from: classes4.dex */
public final class zzda {
    public static final void AudioAttributesCompatParcelizer(final RevisionSubjectUIModel revisionSubjectUIModel, final boolean z, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, final int i) {
        int i2;
        _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape2;
        toMagicModuleMetaRepoModel.write(revisionSubjectUIModel, "");
        _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescapeWrite = _handleunrecognizedcharacterescape.write(637324248);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(revisionSubjectUIModel) : _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(revisionSubjectUIModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(z) ? 32 : 16;
        }
        int i3 = i2;
        if (!_handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer((i3 & 19) != 18, i3 & 1)) {
            _handleunrecognizedcharacterescape2 = _handleunrecognizedcharacterescapeWrite;
            _handleunrecognizedcharacterescape2.onPrepareFromSearch();
        } else {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(637324248, i3, -1, "com.marrow2.ui.qbank.score.compose.RevisionSubjectCompletedComposable (RevisionSubjectCompletedComposable.kt:34)");
            }
            if (zzec.read(revisionSubjectUIModel)) {
                _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(-1523570931);
                isInLayout.RemoteActionCompatParcelizer(isAdded.AudioAttributesCompatParcelizer(_handleOddName.INSTANCE, assignParameter.IconCompatParcelizer(20.0f)), _handleunrecognizedcharacterescapeWrite, 6);
                read((_handleOddName) null, 0L, _handleunrecognizedcharacterescapeWrite, 0, 3);
                isInLayout.RemoteActionCompatParcelizer(isAdded.AudioAttributesCompatParcelizer(_handleOddName.INSTANCE, assignParameter.IconCompatParcelizer(16.0f)), _handleunrecognizedcharacterescapeWrite, 6);
                AudioAttributesCompatParcelizer(revisionSubjectUIModel.getAudioAttributesCompatParcelizer(), revisionSubjectUIModel.getRead(), revisionSubjectUIModel.getIconCompatParcelizer(), revisionSubjectUIModel.getMediaBrowserCompatItemReceiver(), z, (_handleOddName) null, 0L, 0L, 0L, _handleunrecognizedcharacterescapeWrite, (i3 << 9) & 57344, 480);
                _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatCustomActionResultReceiver();
                _handleunrecognizedcharacterescape2 = _handleunrecognizedcharacterescapeWrite;
            } else {
                _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(-1523052642);
                isInLayout.RemoteActionCompatParcelizer(isAdded.AudioAttributesCompatParcelizer(_handleOddName.INSTANCE, assignParameter.IconCompatParcelizer(12.0f)), _handleunrecognizedcharacterescapeWrite, 6);
                _skipWSOrEnd.read readVarMediaBrowserCompatCustomActionResultReceiver = _skipWSOrEnd.INSTANCE.MediaBrowserCompatCustomActionResultReceiver();
                _handleOddName.Companion companion = _handleOddName.INSTANCE;
                withTypeHandler withtypehandlerIconCompatParcelizer = getTag.IconCompatParcelizer(WindowInsetsCompatImpl30.INSTANCE.AudioAttributesImplApi21Parcelizer(), readVarMediaBrowserCompatCustomActionResultReceiver, _handleunrecognizedcharacterescapeWrite, 48);
                int iHashCode = Long.hashCode(_getBigDecimal.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, 0));
                _getCharDesc _getchardescHandleMediaPlayPauseIfPendingOnHandler = _handleunrecognizedcharacterescapeWrite.handleMediaPlayPauseIfPendingOnHandler();
                _handleOddName _handleoddnameRemoteActionCompatParcelizer = _verifyNLZ2.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, companion);
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
                NumberOutput.write(_handleunrecognizedcharacterescape3, withtypehandlerIconCompatParcelizer, getDependencies.INSTANCE.AudioAttributesImplBaseParcelizer());
                NumberOutput.write(_handleunrecognizedcharacterescape3, _getchardescHandleMediaPlayPauseIfPendingOnHandler, getDependencies.INSTANCE.MediaBrowserCompatItemReceiver());
                NumberOutput.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape3, Integer.valueOf(iHashCode), getDependencies.INSTANCE.AudioAttributesCompatParcelizer());
                NumberOutput.write(_handleunrecognizedcharacterescape3, getDependencies.INSTANCE.write());
                NumberOutput.write(_handleunrecognizedcharacterescape3, _handleoddnameRemoteActionCompatParcelizer, getDependencies.INSTANCE.MediaBrowserCompatCustomActionResultReceiver());
                getView getview = getView.INSTANCE;
                ViewFactoryHolder.write(getDefaultSetterInfo.RemoteActionCompatParcelizer(R.drawable.ic_schema, _handleunrecognizedcharacterescapeWrite, 6), null, isAdded.AudioAttributesImplBaseParcelizer(_handleOddName.INSTANCE, assignParameter.IconCompatParcelizer(20.0f)), null, null, BitmapDescriptorFactory.HUE_RED, null, _handleunrecognizedcharacterescapeWrite, isAnnotationBundle.read | 432, 120);
                isInLayout.RemoteActionCompatParcelizer(isAdded.AudioAttributesImplApi26Parcelizer(_handleOddName.INSTANCE, assignParameter.IconCompatParcelizer(8.0f)), _handleunrecognizedcharacterescapeWrite, 6);
                _handleunrecognizedcharacterescape2 = _handleunrecognizedcharacterescapeWrite;
                _copyCurrentStringValue.IconCompatParcelizer(singleArgCreatorDefaultsToProperties.RemoteActionCompatParcelizer(R.string.related_schema_solved_data_text, new Object[]{Integer.valueOf(revisionSubjectUIModel.getIconCompatParcelizer()), Integer.valueOf(revisionSubjectUIModel.getMediaBrowserCompatItemReceiver())}, _handleunrecognizedcharacterescapeWrite, 6), null, enabled.INSTANCE.write(_handleunrecognizedcharacterescapeWrite, enabled.RemoteActionCompatParcelizer).MediaBrowserCompatItemReceiver(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, enabled.INSTANCE.IconCompatParcelizer(_handleunrecognizedcharacterescapeWrite, enabled.RemoteActionCompatParcelizer).getMediaBrowserCompatCustomActionResultReceiver(), _handleunrecognizedcharacterescape2, 0, 0, 65530);
                _handleunrecognizedcharacterescape2.AudioAttributesImplBaseParcelizer();
                _handleunrecognizedcharacterescape2.MediaBrowserCompatCustomActionResultReceiver();
            }
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        releaseNameCopyBuffer releasenamecopybufferMediaBrowserCompatSearchResultReceiver = _handleunrecognizedcharacterescape2.MediaBrowserCompatSearchResultReceiver();
        if (releasenamecopybufferMediaBrowserCompatSearchResultReceiver != null) {
            releasenamecopybufferMediaBrowserCompatSearchResultReceiver.read(new MagicModuleSubmissionRequestBody() { // from class: o.zzdb
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return zzda.RemoteActionCompatParcelizer(revisionSubjectUIModel, z, i, (_handleUnrecognizedCharacterEscape) obj);
                }
            });
        }
    }

    public static final void read(_handleOddName _handleoddname, long j, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, final int i, final int i2) {
        _handleOddName _handleoddname2;
        int i3;
        long r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
        _handleOddName.Companion companion;
        long j2;
        _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescapeWrite = _handleunrecognizedcharacterescape.write(624968965);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            _handleoddname2 = _handleoddname;
        } else if ((i & 6) == 0) {
            _handleoddname2 = _handleoddname;
            i3 = i | (_handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(_handleoddname) ? 4 : 2);
        } else {
            _handleoddname2 = _handleoddname;
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = j;
                int i5 = _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(j) ? 32 : 16;
                i3 |= i5;
            } else {
                r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = j;
            }
            i3 |= i5;
        } else {
            r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = j;
        }
        if (_handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer((i3 & 19) != 18, i3 & 1)) {
            _handleunrecognizedcharacterescapeWrite.onPrepare();
            if ((i & 1) != 0 && !_handleunrecognizedcharacterescapeWrite.onFastForward()) {
                _handleunrecognizedcharacterescapeWrite.onPrepareFromSearch();
                if ((i2 & 2) != 0) {
                    i3 &= -113;
                }
                companion = _handleoddname2;
            } else {
                companion = i4 != 0 ? _handleOddName.INSTANCE : _handleoddname2;
                if ((i2 & 2) != 0) {
                    MarrowTheme marrowTheme = MarrowTheme.INSTANCE;
                    r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = MarrowTheme.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, MarrowTheme.RemoteActionCompatParcelizer).getR8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                    i3 &= -113;
                }
            }
            j2 = r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
            _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer();
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(624968965, i3, -1, "com.marrow2.ui.qbank.score.compose.RevisionDivider (RevisionSubjectCompletedComposable.kt:72)");
            }
            _handleOddName _handleoddnameRemoteActionCompatParcelizer$default = isAdded.RemoteActionCompatParcelizer$default(companion, BitmapDescriptorFactory.HUE_RED, 1, null);
            withTypeHandler withtypehandlerIconCompatParcelizer = getTag.IconCompatParcelizer(WindowInsetsCompatImpl30.INSTANCE.AudioAttributesImplApi21Parcelizer(), _skipWSOrEnd.INSTANCE.MediaBrowserCompatCustomActionResultReceiver(), _handleunrecognizedcharacterescapeWrite, 48);
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
            _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape2 = NumberOutput.read(_handleunrecognizedcharacterescapeWrite);
            NumberOutput.write(_handleunrecognizedcharacterescape2, withtypehandlerIconCompatParcelizer, getDependencies.INSTANCE.AudioAttributesImplBaseParcelizer());
            NumberOutput.write(_handleunrecognizedcharacterescape2, _getchardescHandleMediaPlayPauseIfPendingOnHandler, getDependencies.INSTANCE.MediaBrowserCompatItemReceiver());
            NumberOutput.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape2, Integer.valueOf(iHashCode), getDependencies.INSTANCE.AudioAttributesCompatParcelizer());
            NumberOutput.write(_handleunrecognizedcharacterescape2, getDependencies.INSTANCE.write());
            NumberOutput.write(_handleunrecognizedcharacterescape2, _handleoddnameRemoteActionCompatParcelizer, getDependencies.INSTANCE.MediaBrowserCompatCustomActionResultReceiver());
            getView getview = getView.INSTANCE;
            AbsSavedState1.RemoteActionCompatParcelizer(getFrameEndSchedulerui.IconCompatParcelizer$default(_handleUnexpectedValue.RemoteActionCompatParcelizer(isAdded.AudioAttributesImplBaseParcelizer(_handleOddName.INSTANCE, assignParameter.IconCompatParcelizer(6.0f)), setPlayer.IconCompatParcelizer()), j2, null, 2, null), _handleunrecognizedcharacterescapeWrite, 0);
            AbsSavedState1.RemoteActionCompatParcelizer(getFrameEndSchedulerui.IconCompatParcelizer$default(isAdded.AudioAttributesCompatParcelizer(getViewLifecycleOwnerLiveData.RemoteActionCompatParcelizer$default(getview, _handleOddName.INSTANCE, 1.0f, false, 2, null), assignParameter.IconCompatParcelizer(1.0f)), j2, null, 2, null), _handleunrecognizedcharacterescapeWrite, 0);
            AbsSavedState1.RemoteActionCompatParcelizer(getFrameEndSchedulerui.IconCompatParcelizer$default(_handleUnexpectedValue.RemoteActionCompatParcelizer(isAdded.AudioAttributesImplBaseParcelizer(_handleOddName.INSTANCE, assignParameter.IconCompatParcelizer(6.0f)), setPlayer.IconCompatParcelizer()), j2, null, 2, null), _handleunrecognizedcharacterescapeWrite, 0);
            _handleunrecognizedcharacterescapeWrite.AudioAttributesImplBaseParcelizer();
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        } else {
            _handleunrecognizedcharacterescapeWrite.onPrepareFromSearch();
            companion = _handleoddname2;
            j2 = r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
        }
        releaseNameCopyBuffer releasenamecopybufferMediaBrowserCompatSearchResultReceiver = _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatSearchResultReceiver();
        if (releasenamecopybufferMediaBrowserCompatSearchResultReceiver != null) {
            final _handleOddName _handleoddname3 = companion;
            final long j3 = j2;
            releasenamecopybufferMediaBrowserCompatSearchResultReceiver.read(new MagicModuleSubmissionRequestBody() { // from class: o.zzdc
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return zzda.write(_handleoddname3, j3, i, i2, (_handleUnrecognizedCharacterEscape) obj);
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:155:0x0486  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0496  */
    /* JADX WARN: Removed duplicated region for block: B:160:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00f0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void AudioAttributesCompatParcelizer(final int r29, final int r30, final int r31, final int r32, final boolean r33, kotlin._handleOddName r34, long r35, long r37, long r39, kotlin._handleUnrecognizedCharacterEscape r41, final int r42, final int r43) {
        /*
            Method dump skipped, instruction units count: 1210
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.zzda.AudioAttributesCompatParcelizer(int, int, int, int, boolean, o._handleOddName, long, long, long, o._handleUnrecognizedCharacterEscape, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:73:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x028a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final void write(final int r36, final java.lang.String r37, final java.lang.String r38, long r39, long r41, kotlin._handleUnrecognizedCharacterEscape r43, final int r44, final int r45) {
        /*
            Method dump skipped, instruction units count: 687
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.zzda.write(int, java.lang.String, java.lang.String, long, long, o._handleUnrecognizedCharacterEscape, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup write(_handleOddName _handleoddname, long j, int i, int i2, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape) {
        read(_handleoddname, j, _handleunrecognizedcharacterescape, _appendEscaped.RemoteActionCompatParcelizer(i | 1), i2);
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup RemoteActionCompatParcelizer(int i, int i2, int i3, int i4, boolean z, _handleOddName _handleoddname, long j, long j2, long j3, int i5, int i6, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape) {
        AudioAttributesCompatParcelizer(i, i2, i3, i4, z, _handleoddname, j, j2, j3, _handleunrecognizedcharacterescape, _appendEscaped.RemoteActionCompatParcelizer(i5 | 1), i6);
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup RemoteActionCompatParcelizer(RevisionSubjectUIModel revisionSubjectUIModel, boolean z, int i, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape) {
        AudioAttributesCompatParcelizer(revisionSubjectUIModel, z, _handleunrecognizedcharacterescape, _appendEscaped.RemoteActionCompatParcelizer(i | 1));
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(int i, String str, String str2, long j, long j2, int i2, int i3, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape) {
        write(i, str, str2, j, j2, _handleunrecognizedcharacterescape, _appendEscaped.RemoteActionCompatParcelizer(i2 | 1), i3);
        return getShowPopup.INSTANCE;
    }
}
