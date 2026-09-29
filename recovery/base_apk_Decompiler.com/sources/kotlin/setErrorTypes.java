package kotlin;

import android.content.res.Configuration;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.android.exoplayer2.RendererCapabilities;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow.R;
import com.marrow.designsystem.theme.MarrowTheme;
import com.marrow.designsystem.theme.TypeKt;
import kotlin._handleOddName;
import kotlin.switchAndReturnNext;
import org.apache.commons.compress.archivers.cpio.CpioConstants;

/* JADX INFO: loaded from: classes4.dex */
public final class setErrorTypes {
    public static final void RemoteActionCompatParcelizer(final String str, final long j, final boolean z, final getCreatedOnDateMs<getShowPopup> getcreatedondatems, final MagicModuleSubmissionRequestBody<? super hasReferringProperties, ? super Integer, getShowPopup> magicModuleSubmissionRequestBody, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, final int i) {
        int i2;
        _handleOddName.Companion companion;
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(getcreatedondatems, "");
        toMagicModuleMetaRepoModel.write(magicModuleSubmissionRequestBody, "");
        _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescapeWrite = _handleunrecognizedcharacterescape.write(28937474);
        if ((i & 6) == 0) {
            i2 = (_handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(j) ? 32 : 16;
        }
        if ((i & RendererCapabilities.MODE_SUPPORT_MASK) == 0) {
            i2 |= _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(getcreatedondatems) ? 2048 : 1024;
        }
        if ((i & CpioConstants.C_ISBLK) == 0) {
            i2 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(magicModuleSubmissionRequestBody) ? 16384 : 8192;
        }
        if (!_handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer((i2 & 9363) != 9362, i2 & 1)) {
            _handleunrecognizedcharacterescapeWrite.onPrepareFromSearch();
        } else {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(28937474, i2, -1, "com.marrow2.ui.video.revision_video.zen_area.RevisionZenAreaToolbar (RevisionZenAreaToolbar.kt:44)");
            }
            Object objOnPause = _handleunrecognizedcharacterescapeWrite.onPause();
            if (objOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause = new write();
                _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(objOnPause);
            }
            final write writeVar = (write) objOnPause;
            parseDouble<switchToNext> parsedouble = setTextMetricsParamsCompat.read(j, setVerticalGravity.RemoteActionCompatParcelizer$default(300, 0, setShowText.AudioAttributesCompatParcelizer(), 2, (Object) null), null, null, _handleunrecognizedcharacterescapeWrite, (i2 >> 3) & 14, 12);
            _handleOddName _handleoddnameRemoteActionCompatParcelizer$default = isAdded.RemoteActionCompatParcelizer$default(_handleOddName.INSTANCE, BitmapDescriptorFactory.HUE_RED, 1, null);
            CmcdHeadersFactory1 cmcdHeadersFactory1 = CmcdHeadersFactory1.INSTANCE;
            _handleOddName _handleoddnameIconCompatParcelizer = onInflate.IconCompatParcelizer(getFrameEndSchedulerui.IconCompatParcelizer$default(_handleoddnameRemoteActionCompatParcelizer$default, CmcdHeadersFactory1.RemoteActionCompatParcelizer() ? read(parsedouble) : j, null, 2, null));
            if (((Configuration) _handleunrecognizedcharacterescapeWrite.write(AndroidCompositionLocals_androidKt.read())).orientation == 2) {
                companion = onInflate.read(_handleOddName.INSTANCE);
            } else {
                companion = _handleOddName.INSTANCE;
            }
            _handleOddName _handleoddnameIconCompatParcelizer2 = getParentFragment.IconCompatParcelizer(_handleoddnameIconCompatParcelizer.AudioAttributesCompatParcelizer(companion), assignParameter.IconCompatParcelizer(16.0f));
            withTypeHandler withtypehandlerIconCompatParcelizer = getTag.IconCompatParcelizer(WindowInsetsCompatImpl30.INSTANCE.AudioAttributesImplApi21Parcelizer(), _skipWSOrEnd.INSTANCE.MediaBrowserCompatCustomActionResultReceiver(), _handleunrecognizedcharacterescapeWrite, 48);
            int iHashCode = Long.hashCode(_getBigDecimal.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, 0));
            _getCharDesc _getchardescHandleMediaPlayPauseIfPendingOnHandler = _handleunrecognizedcharacterescapeWrite.handleMediaPlayPauseIfPendingOnHandler();
            _handleOddName _handleoddnameRemoteActionCompatParcelizer = _verifyNLZ2.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, _handleoddnameIconCompatParcelizer2);
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
            IconCompatParcelizer(getcreatedondatems, _handleunrecognizedcharacterescapeWrite, (i2 >> 9) & 14);
            _handleOddName _handleoddnameRemoteActionCompatParcelizer$default2 = getViewLifecycleOwnerLiveData.RemoteActionCompatParcelizer$default(getview, getParentFragment.AudioAttributesCompatParcelizer$default(_handleOddName.INSTANCE, assignParameter.IconCompatParcelizer(16.0f), BitmapDescriptorFactory.HUE_RED, assignParameter.IconCompatParcelizer(8.0f), BitmapDescriptorFactory.HUE_RED, 10, null), 1.0f, false, 2, null);
            String str2 = str;
            if (str2.length() == 0) {
                str2 = "Revision Videos";
            }
            String str3 = str2;
            int i3 = paramName.INSTANCE.read();
            deserializeWithObjectId audioAttributesCompatParcelizer = enabled.INSTANCE.IconCompatParcelizer(_handleunrecognizedcharacterescapeWrite, enabled.RemoteActionCompatParcelizer).getAudioAttributesCompatParcelizer();
            MarrowTheme marrowTheme = MarrowTheme.INSTANCE;
            _copyCurrentStringValue.IconCompatParcelizer(str3, _handleoddnameRemoteActionCompatParcelizer$default2, MarrowTheme.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, MarrowTheme.RemoteActionCompatParcelizer).getOnFastForward(), 0L, null, null, null, 0L, null, assignIndexes.write(assignIndexes.INSTANCE.AudioAttributesImplBaseParcelizer()), 0L, i3, false, 1, 0, null, audioAttributesCompatParcelizer, _handleunrecognizedcharacterescapeWrite, 0, 3120, 54776);
            if (z) {
                _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(-602649506);
                _handleOddName.Companion companion2 = _handleOddName.INSTANCE;
                boolean zIconCompatParcelizer = _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(writeVar);
                Object objOnPause2 = _handleunrecognizedcharacterescapeWrite.onPause();
                if (zIconCompatParcelizer || objOnPause2 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                    objOnPause2 = new getAnswerMap() { // from class: o.getDocSide
                        @Override // kotlin.getAnswerMap
                        public final Object invoke(Object obj) {
                            return setErrorTypes.RemoteActionCompatParcelizer(writeVar, (isAbstract) obj);
                        }
                    };
                    _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(objOnPause2);
                }
                _handleOddName _handleoddnameWrite = getNullAccessPattern.write(companion2, (getAnswerMap) objOnPause2);
                boolean z2 = (i2 & 57344) == 16384;
                boolean zIconCompatParcelizer2 = _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(writeVar);
                Object objOnPause3 = _handleunrecognizedcharacterescapeWrite.onPause();
                if ((zIconCompatParcelizer2 | z2) || objOnPause3 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                    objOnPause3 = new getCreatedOnDateMs() { // from class: o.MarkCustomModuleCompleteRequestBody
                        @Override // kotlin.getCreatedOnDateMs
                        public final Object invoke() {
                            return setErrorTypes.AudioAttributesCompatParcelizer(magicModuleSubmissionRequestBody, writeVar);
                        }
                    };
                    _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(objOnPause3);
                }
                write(_handleoddnameWrite, (getCreatedOnDateMs) objOnPause3, _handleunrecognizedcharacterescapeWrite, 0, 0);
            } else {
                _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(-605730844);
            }
            _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatCustomActionResultReceiver();
            _handleunrecognizedcharacterescapeWrite.AudioAttributesImplBaseParcelizer();
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        releaseNameCopyBuffer releasenamecopybufferMediaBrowserCompatSearchResultReceiver = _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatSearchResultReceiver();
        if (releasenamecopybufferMediaBrowserCompatSearchResultReceiver != null) {
            releasenamecopybufferMediaBrowserCompatSearchResultReceiver.read(new MagicModuleSubmissionRequestBody() { // from class: o.setBase64
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return setErrorTypes.AudioAttributesCompatParcelizer(str, j, z, getcreatedondatems, magicModuleSubmissionRequestBody, i, (_handleUnrecognizedCharacterEscape) obj);
                }
            });
        }
    }

    public static final class write {
        private long RemoteActionCompatParcelizer = hasReferringProperties.INSTANCE.write();
        private int read;

        write() {
        }

        public final long IconCompatParcelizer() {
            return this.RemoteActionCompatParcelizer;
        }

        public final void RemoteActionCompatParcelizer(long j) {
            this.RemoteActionCompatParcelizer = j;
        }

        public final int AudioAttributesCompatParcelizer() {
            return this.read;
        }

        public final void IconCompatParcelizer(int i) {
            this.read = i;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup RemoteActionCompatParcelizer(write writeVar, isAbstract isabstract) {
        toMagicModuleMetaRepoModel.write(isabstract, "");
        long jAudioAttributesCompatParcelizer = hasRawClass.AudioAttributesCompatParcelizer(isabstract);
        long j = -1;
        writeVar.RemoteActionCompatParcelizer(hasReferringProperties.read((((long) ((int) Float.intBitsToFloat((int) jAudioAttributesCompatParcelizer))) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)))) | (((long) ((int) Float.intBitsToFloat((int) (jAudioAttributesCompatParcelizer >> 32)))) << 32)));
        writeVar.IconCompatParcelizer((int) isabstract.write());
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesCompatParcelizer(MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody, write writeVar) {
        magicModuleSubmissionRequestBody.invoke(hasReferringProperties.write(writeVar.IconCompatParcelizer()), Integer.valueOf(writeVar.AudioAttributesCompatParcelizer()));
        return getShowPopup.INSTANCE;
    }

    private static final void IconCompatParcelizer(final getCreatedOnDateMs<getShowPopup> getcreatedondatems, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, final int i) {
        int i2;
        _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescapeWrite = _handleunrecognizedcharacterescape.write(539599197);
        if ((i & 6) == 0) {
            i2 = (_handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(getcreatedondatems) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (!_handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer((i2 & 3) != 2, i2 & 1)) {
            _handleunrecognizedcharacterescapeWrite.onPrepareFromSearch();
        } else {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(539599197, i2, -1, "com.marrow2.ui.video.revision_video.zen_area.BackButton (RevisionZenAreaToolbar.kt:101)");
            }
            _handleOddName _handleoddnameIconCompatParcelizer = getParentFragment.IconCompatParcelizer(splitRtspMessageBody.write(isAdded.AudioAttributesImplBaseParcelizer(_handleOddName.INSTANCE, assignParameter.IconCompatParcelizer(24.0f)), getcreatedondatems), assignParameter.IconCompatParcelizer(4.0f));
            isAnnotationBundle isannotationbundleRemoteActionCompatParcelizer = getDefaultSetterInfo.RemoteActionCompatParcelizer(R.drawable.ic_back_v2, _handleunrecognizedcharacterescapeWrite, 6);
            switchAndReturnNext.Companion companion = switchAndReturnNext.INSTANCE;
            MarrowTheme marrowTheme = MarrowTheme.INSTANCE;
            ViewFactoryHolder.write(isannotationbundleRemoteActionCompatParcelizer, "Back", _handleoddnameIconCompatParcelizer, null, null, BitmapDescriptorFactory.HUE_RED, switchAndReturnNext.Companion.IconCompatParcelizer$default(companion, MarrowTheme.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, MarrowTheme.RemoteActionCompatParcelizer).getOnFastForward(), 0, 2, null), _handleunrecognizedcharacterescapeWrite, isAnnotationBundle.read | 48, 56);
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        releaseNameCopyBuffer releasenamecopybufferMediaBrowserCompatSearchResultReceiver = _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatSearchResultReceiver();
        if (releasenamecopybufferMediaBrowserCompatSearchResultReceiver != null) {
            releasenamecopybufferMediaBrowserCompatSearchResultReceiver.read(new MagicModuleSubmissionRequestBody() { // from class: o.SecurityRequestBody
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return setErrorTypes.write(getcreatedondatems, i, (_handleUnrecognizedCharacterEscape) obj);
                }
            });
        }
    }

    private static final void write(_handleOddName _handleoddname, final getCreatedOnDateMs<getShowPopup> getcreatedondatems, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, final int i, final int i2) {
        final _handleOddName _handleoddname2;
        int i3;
        _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape2;
        _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescapeWrite = _handleunrecognizedcharacterescape.write(-577261153);
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
            i3 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(getcreatedondatems) ? 32 : 16;
        }
        if (!_handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer((i3 & 19) != 18, i3 & 1)) {
            _handleunrecognizedcharacterescape2 = _handleunrecognizedcharacterescapeWrite;
            _handleunrecognizedcharacterescape2.onPrepareFromSearch();
        } else {
            _handleOddName _handleoddname3 = i4 != 0 ? _handleOddName.INSTANCE : _handleoddname2;
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(-577261153, i3, -1, "com.marrow2.ui.video.revision_video.zen_area.IndexButton (RevisionZenAreaToolbar.kt:117)");
            }
            _handleOddName _handleoddnameRemoteActionCompatParcelizer$default = getLocalSavedStateRegistryOwner.RemoteActionCompatParcelizer$default(_handleoddname3, false, null, null, null, getcreatedondatems, 15, null);
            withTypeHandler withtypehandlerIconCompatParcelizer = getTag.IconCompatParcelizer(WindowInsetsCompatImpl30.INSTANCE.RemoteActionCompatParcelizer(assignParameter.IconCompatParcelizer(4.0f)), _skipWSOrEnd.INSTANCE.MediaBrowserCompatCustomActionResultReceiver(), _handleunrecognizedcharacterescapeWrite, 54);
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
            NumberOutput.write(_handleunrecognizedcharacterescape3, withtypehandlerIconCompatParcelizer, getDependencies.INSTANCE.AudioAttributesImplBaseParcelizer());
            NumberOutput.write(_handleunrecognizedcharacterescape3, _getchardescHandleMediaPlayPauseIfPendingOnHandler, getDependencies.INSTANCE.MediaBrowserCompatItemReceiver());
            NumberOutput.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape3, Integer.valueOf(iHashCode), getDependencies.INSTANCE.AudioAttributesCompatParcelizer());
            NumberOutput.write(_handleunrecognizedcharacterescape3, getDependencies.INSTANCE.write());
            NumberOutput.write(_handleunrecognizedcharacterescape3, _handleoddnameRemoteActionCompatParcelizer, getDependencies.INSTANCE.MediaBrowserCompatCustomActionResultReceiver());
            getView getview = getView.INSTANCE;
            _handleOddName _handleoddnameAudioAttributesImplBaseParcelizer = isAdded.AudioAttributesImplBaseParcelizer(_handleOddName.INSTANCE, assignParameter.IconCompatParcelizer(20.0f));
            isAnnotationBundle isannotationbundleRemoteActionCompatParcelizer = getDefaultSetterInfo.RemoteActionCompatParcelizer(R.drawable.ic_index, _handleunrecognizedcharacterescapeWrite, 6);
            MarrowTheme marrowTheme = MarrowTheme.INSTANCE;
            _handleunrecognizedcharacterescape2 = _handleunrecognizedcharacterescapeWrite;
            currentToken.IconCompatParcelizer(isannotationbundleRemoteActionCompatParcelizer, "Index", _handleoddnameAudioAttributesImplBaseParcelizer, MarrowTheme.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, MarrowTheme.RemoteActionCompatParcelizer).getOnFastForward(), _handleunrecognizedcharacterescape2, isAnnotationBundle.read | 432, 0);
            deserializeWithObjectId deserializewithobjectidRemoteActionCompatParcelizer = TypeKt.RemoteActionCompatParcelizer(enabled.INSTANCE.IconCompatParcelizer(_handleunrecognizedcharacterescape2, enabled.RemoteActionCompatParcelizer));
            MarrowTheme marrowTheme2 = MarrowTheme.INSTANCE;
            _copyCurrentStringValue.IconCompatParcelizer("Index", null, MarrowTheme.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape2, MarrowTheme.RemoteActionCompatParcelizer).getOnFastForward(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, deserializewithobjectidRemoteActionCompatParcelizer, _handleunrecognizedcharacterescape2, 6, 0, 65530);
            _handleunrecognizedcharacterescape2.AudioAttributesImplBaseParcelizer();
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
            _handleoddname2 = _handleoddname3;
        }
        releaseNameCopyBuffer releasenamecopybufferMediaBrowserCompatSearchResultReceiver = _handleunrecognizedcharacterescape2.MediaBrowserCompatSearchResultReceiver();
        if (releasenamecopybufferMediaBrowserCompatSearchResultReceiver != null) {
            releasenamecopybufferMediaBrowserCompatSearchResultReceiver.read(new MagicModuleSubmissionRequestBody() { // from class: o.getBase64
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return setErrorTypes.RemoteActionCompatParcelizer(_handleoddname2, getcreatedondatems, i, i2, (_handleUnrecognizedCharacterEscape) obj);
                }
            });
        }
    }

    private static final long read(parseDouble<switchToNext> parsedouble) {
        return parsedouble.getRemoteActionCompatParcelizer().getIconCompatParcelizer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup write(getCreatedOnDateMs getcreatedondatems, int i, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape) {
        IconCompatParcelizer(getcreatedondatems, _handleunrecognizedcharacterescape, _appendEscaped.RemoteActionCompatParcelizer(i | 1));
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup RemoteActionCompatParcelizer(_handleOddName _handleoddname, getCreatedOnDateMs getcreatedondatems, int i, int i2, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape) {
        write(_handleoddname, getcreatedondatems, _handleunrecognizedcharacterescape, _appendEscaped.RemoteActionCompatParcelizer(i | 1), i2);
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesCompatParcelizer(String str, long j, boolean z, getCreatedOnDateMs getcreatedondatems, MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody, int i, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape) {
        RemoteActionCompatParcelizer(str, j, z, (getCreatedOnDateMs<getShowPopup>) getcreatedondatems, (MagicModuleSubmissionRequestBody<? super hasReferringProperties, ? super Integer, getShowPopup>) magicModuleSubmissionRequestBody, _handleunrecognizedcharacterescape, _appendEscaped.RemoteActionCompatParcelizer(i | 1));
        return getShowPopup.INSTANCE;
    }
}
