package kotlin;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import com.google.android.exoplayer2.RendererCapabilities;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow.R;
import com.marrow.designsystem.theme.AppTheme;
import com.marrow.designsystem.theme.MarrowTheme;
import com.marrow.designsystem.theme.ThemeKt;
import java.util.Iterator;
import java.util.List;
import kotlin._handleOddName;
import kotlin.renderOutputBufferNow;

/* JADX INFO: loaded from: classes3.dex */
public final class renderOutputBufferNow {

    public static final /* synthetic */ class IconCompatParcelizer {
        public static final /* synthetic */ int[] write;

        static {
            int[] iArr = new int[onDisplayInfoChanged.values().length];
            try {
                iArr[onDisplayInfoChanged.read.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[onDisplayInfoChanged.AudioAttributesCompatParcelizer.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[onDisplayInfoChanged.IconCompatParcelizer.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[onDisplayInfoChanged.write.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            write = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup write() {
        return getShowPopup.INSTANCE;
    }

    public static final void write(final onDisplayInfoChanged ondisplayinfochanged, final List<clearSurfaceFrameRate> list, final getAnswerMap<? super onDisplayInfoChanged, getShowPopup> getanswermap, final getCreatedOnDateMs<getShowPopup> getcreatedondatems, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, final int i, final int i2) {
        int i3;
        toMagicModuleMetaRepoModel.write(ondisplayinfochanged, "");
        toMagicModuleMetaRepoModel.write(list, "");
        toMagicModuleMetaRepoModel.write(getanswermap, "");
        _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescapeWrite = _handleunrecognizedcharacterescape.write(-1165847691);
        if ((i & 6) == 0) {
            i3 = (_handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(ondisplayinfochanged.ordinal()) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(list) ? 32 : 16;
        }
        if ((i & RendererCapabilities.MODE_SUPPORT_MASK) == 0) {
            i3 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(getanswermap) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(getcreatedondatems) ? 2048 : 1024;
        }
        if (!_handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer((i3 & 1171) != 1170, i3 & 1)) {
            _handleunrecognizedcharacterescapeWrite.onPrepareFromSearch();
        } else {
            if (i4 != 0) {
                Object objOnPause = _handleunrecognizedcharacterescapeWrite.onPause();
                if (objOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                    objOnPause = new getCreatedOnDateMs() { // from class: o.shouldForceRender
                        @Override // kotlin.getCreatedOnDateMs
                        public final Object invoke() {
                            return renderOutputBufferNow.write();
                        }
                    };
                    _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(objOnPause);
                }
                getcreatedondatems = (getCreatedOnDateMs) objOnPause;
            }
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(-1165847691, i3, -1, "com.marrow2.ui.bookmark.detail.listing.ui.BookmarkSelectionDialog (BookmarkSelectionDialog.kt:68)");
            }
            ThemeKt.read((AppTheme) null, true, (MagicModuleSubmissionRequestBody<? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup>) multiplyFft.AudioAttributesCompatParcelizer(-2067216139, true, new MagicModuleSubmissionRequestBody() { // from class: o.getSurface
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return renderOutputBufferNow.read(getcreatedondatems, list, ondisplayinfochanged, getanswermap, (_handleUnrecognizedCharacterEscape) obj, ((Integer) obj2).intValue());
                }
            }, _handleunrecognizedcharacterescapeWrite, 54), _handleunrecognizedcharacterescapeWrite, 432, 1);
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        final getCreatedOnDateMs<getShowPopup> getcreatedondatems2 = getcreatedondatems;
        releaseNameCopyBuffer releasenamecopybufferMediaBrowserCompatSearchResultReceiver = _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatSearchResultReceiver();
        if (releasenamecopybufferMediaBrowserCompatSearchResultReceiver != null) {
            releasenamecopybufferMediaBrowserCompatSearchResultReceiver.read(new MagicModuleSubmissionRequestBody() { // from class: o.onProcessedTunneledBuffer
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return renderOutputBufferNow.write(ondisplayinfochanged, list, getanswermap, getcreatedondatems2, i, i2, (_handleUnrecognizedCharacterEscape) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(final getCreatedOnDateMs getcreatedondatems, final List list, final onDisplayInfoChanged ondisplayinfochanged, final getAnswerMap getanswermap, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        if (!_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer((i & 3) != 2, i & 1)) {
            _handleunrecognizedcharacterescape.onPrepareFromSearch();
        } else {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(-2067216139, i, -1, "com.marrow2.ui.bookmark.detail.listing.ui.BookmarkSelectionDialog.<anonymous> (BookmarkSelectionDialog.kt:70)");
            }
            popOrNull.AudioAttributesCompatParcelizer(null, 0L, null, new withDateFormat(true, false, false, false, 14, (MagicModuleRepositoryImplExternalSyntheticLambda0) null), multiplyFft.AudioAttributesCompatParcelizer(-1048489550, true, new MagicModuleSubmissionRequestBody() { // from class: o.doesDisplaySupportDolbyVision
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return renderOutputBufferNow.RemoteActionCompatParcelizer(getcreatedondatems, list, ondisplayinfochanged, getanswermap, (_handleUnrecognizedCharacterEscape) obj, ((Integer) obj2).intValue());
                }
            }, _handleunrecognizedcharacterescape, 54), _handleunrecognizedcharacterescape, 27648, 7);
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup RemoteActionCompatParcelizer(getCreatedOnDateMs getcreatedondatems, final List list, final onDisplayInfoChanged ondisplayinfochanged, final getAnswerMap getanswermap, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        if (!_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer((i & 3) != 2, i & 1)) {
            _handleunrecognizedcharacterescape.onPrepareFromSearch();
        } else {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(-1048489550, i, -1, "com.marrow2.ui.bookmark.detail.listing.ui.BookmarkSelectionDialog.<anonymous>.<anonymous> (BookmarkSelectionDialog.kt:75)");
            }
            _handleOddName _handleoddnameIconCompatParcelizer = _parseFloatThatStartsWithPeriod.IconCompatParcelizer(getFrameEndSchedulerui.IconCompatParcelizer$default(onInflate.read(isAdded.IconCompatParcelizer$default(_handleOddName.INSTANCE, BitmapDescriptorFactory.HUE_RED, 1, null)), switchToNext.AudioAttributesCompatParcelizer$default(switchToNext.INSTANCE.AudioAttributesCompatParcelizer(), 0.3f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null), null, 2, null), 6.0f);
            getShowPopup getshowpopup = getShowPopup.INSTANCE;
            boolean zAudioAttributesCompatParcelizer = _handleunrecognizedcharacterescape.AudioAttributesCompatParcelizer(getcreatedondatems);
            write writeVarOnPause = _handleunrecognizedcharacterescape.onPause();
            if (zAudioAttributesCompatParcelizer || writeVarOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                writeVarOnPause = new write(getcreatedondatems);
                _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(writeVarOnPause);
            }
            _handleOddName _handleoddnameIconCompatParcelizer2 = hasSomeOfFeatures.IconCompatParcelizer(_handleoddnameIconCompatParcelizer, getshowpopup, (PointerInputEventHandler) writeVarOnPause);
            withTypeHandler withtypehandlerWrite = AbsSavedState1.write(_skipWSOrEnd.INSTANCE.MediaBrowserCompatSearchResultReceiver(), false);
            int iHashCode = Long.hashCode(_getBigDecimal.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape, 0));
            _getCharDesc _getchardescHandleMediaPlayPauseIfPendingOnHandler = _handleunrecognizedcharacterescape.handleMediaPlayPauseIfPendingOnHandler();
            _handleOddName _handleoddnameRemoteActionCompatParcelizer = _verifyNLZ2.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape, _handleoddnameIconCompatParcelizer2);
            getCreatedOnDateMs<getDependencies> getcreatedondatemsIconCompatParcelizer = getDependencies.INSTANCE.IconCompatParcelizer();
            if (!(_handleunrecognizedcharacterescape.MediaMetadataCompat() instanceof _closeInput)) {
                _getBigDecimal.write();
            }
            _handleunrecognizedcharacterescape.onPrepareFromMediaId();
            if (_handleunrecognizedcharacterescape.getParcelableVolumeInfo()) {
                _handleunrecognizedcharacterescape.read(getcreatedondatemsIconCompatParcelizer);
            } else {
                _handleunrecognizedcharacterescape.onPlayFromUri();
            }
            _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape2 = NumberOutput.read(_handleunrecognizedcharacterescape);
            NumberOutput.write(_handleunrecognizedcharacterescape2, withtypehandlerWrite, getDependencies.INSTANCE.AudioAttributesImplBaseParcelizer());
            NumberOutput.write(_handleunrecognizedcharacterescape2, _getchardescHandleMediaPlayPauseIfPendingOnHandler, getDependencies.INSTANCE.MediaBrowserCompatItemReceiver());
            NumberOutput.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape2, Integer.valueOf(iHashCode), getDependencies.INSTANCE.AudioAttributesCompatParcelizer());
            NumberOutput.write(_handleunrecognizedcharacterescape2, getDependencies.INSTANCE.write());
            NumberOutput.write(_handleunrecognizedcharacterescape2, _handleoddnameRemoteActionCompatParcelizer, getDependencies.INSTANCE.MediaBrowserCompatCustomActionResultReceiver());
            Nulls.AudioAttributesCompatParcelizer(getParentFragment.AudioAttributesCompatParcelizer$default(onInflate.write(setDrawerElevation.INSTANCE.AudioAttributesCompatParcelizer(_handleOddName.INSTANCE, _skipWSOrEnd.INSTANCE.MediaMetadataCompat())), BitmapDescriptorFactory.HUE_RED, assignParameter.IconCompatParcelizer(46.0f), assignParameter.IconCompatParcelizer(16.0f), BitmapDescriptorFactory.HUE_RED, 9, null), setPlayer.RemoteActionCompatParcelizer(assignParameter.IconCompatParcelizer(4.0f)), 0L, 0L, null, BitmapDescriptorFactory.HUE_RED, multiplyFft.AudioAttributesCompatParcelizer(-1308466896, true, new MagicModuleSubmissionRequestBody() { // from class: o.setOutputSurfaceV23
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return renderOutputBufferNow.read(list, ondisplayinfochanged, getanswermap, (_handleUnrecognizedCharacterEscape) obj, ((Integer) obj2).intValue());
                }
            }, _handleunrecognizedcharacterescape, 54), _handleunrecognizedcharacterescape, 1572864, 60);
            _handleunrecognizedcharacterescape.AudioAttributesImplBaseParcelizer();
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        return getShowPopup.INSTANCE;
    }

    static final class write implements PointerInputEventHandler {
        private /* synthetic */ getCreatedOnDateMs<getShowPopup> RemoteActionCompatParcelizer;

        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
        public final Object invoke(handleBadMerge handlebadmerge, SampleVideos<? super getShowPopup> sampleVideos) {
            final getCreatedOnDateMs<getShowPopup> getcreatedondatems = this.RemoteActionCompatParcelizer;
            Object objAudioAttributesCompatParcelizer$default = isSpanStillValid.AudioAttributesCompatParcelizer$default(handlebadmerge, null, null, null, new getAnswerMap() { // from class: o.MediaCodecVideoRendererApi26
                @Override // kotlin.getAnswerMap
                public final Object invoke(Object obj) {
                    return renderOutputBufferNow.write.read(getcreatedondatems);
                }
            }, sampleVideos, 7, null);
            return objAudioAttributesCompatParcelizer$default == getYear.IconCompatParcelizer() ? objAudioAttributesCompatParcelizer$default : getShowPopup.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final getShowPopup read(getCreatedOnDateMs getcreatedondatems) {
            getcreatedondatems.invoke();
            return getShowPopup.INSTANCE;
        }

        write(getCreatedOnDateMs<getShowPopup> getcreatedondatems) {
            this.RemoteActionCompatParcelizer = getcreatedondatems;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(List list, onDisplayInfoChanged ondisplayinfochanged, getAnswerMap getanswermap, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        if (!_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer((i & 3) != 2, i & 1)) {
            _handleunrecognizedcharacterescape.onPrepareFromSearch();
        } else {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(-1308466896, i, -1, "com.marrow2.ui.bookmark.detail.listing.ui.BookmarkSelectionDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous> (BookmarkSelectionDialog.kt:94)");
            }
            IconCompatParcelizer(list, ondisplayinfochanged, getanswermap, _handleunrecognizedcharacterescape, 0);
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        return getShowPopup.INSTANCE;
    }

    private static void IconCompatParcelizer(final List<clearSurfaceFrameRate> list, final onDisplayInfoChanged ondisplayinfochanged, final getAnswerMap<? super onDisplayInfoChanged, getShowPopup> getanswermap, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, final int i) {
        int i2;
        _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape2;
        int i3;
        int i4;
        long r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
        int i5;
        int i6;
        _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape3;
        toMagicModuleMetaRepoModel.write(list, "");
        toMagicModuleMetaRepoModel.write(ondisplayinfochanged, "");
        toMagicModuleMetaRepoModel.write(getanswermap, "");
        _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescapeWrite = _handleunrecognizedcharacterescape.write(88245957);
        if ((i & 6) == 0) {
            i2 = (_handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(list) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(ondisplayinfochanged.ordinal()) ? 32 : 16;
        }
        int i7 = 256;
        if ((i & RendererCapabilities.MODE_SUPPORT_MASK) == 0) {
            i2 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(getanswermap) ? 256 : 128;
        }
        int i8 = i2;
        int i9 = 0;
        if (!_handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer((i8 & 147) != 146, i8 & 1)) {
            _handleunrecognizedcharacterescape2 = _handleunrecognizedcharacterescapeWrite;
            _handleunrecognizedcharacterescape2.onPrepareFromSearch();
        } else {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(88245957, i8, -1, "com.marrow2.ui.bookmark.detail.listing.ui.BookmarkRadioGroup (BookmarkSelectionDialog.kt:111)");
            }
            _handleOddName.Companion companion = _handleOddName.INSTANCE;
            int i10 = 48;
            withTypeHandler withtypehandler = setValue.read(WindowInsetsCompatImpl30.INSTANCE.MediaBrowserCompatCustomActionResultReceiver(), _skipWSOrEnd.INSTANCE.AudioAttributesImplApi21Parcelizer(), _handleunrecognizedcharacterescapeWrite, 48);
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
            _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape4 = NumberOutput.read(_handleunrecognizedcharacterescapeWrite);
            NumberOutput.write(_handleunrecognizedcharacterescape4, withtypehandler, getDependencies.INSTANCE.AudioAttributesImplBaseParcelizer());
            NumberOutput.write(_handleunrecognizedcharacterescape4, _getchardescHandleMediaPlayPauseIfPendingOnHandler, getDependencies.INSTANCE.MediaBrowserCompatItemReceiver());
            NumberOutput.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape4, Integer.valueOf(iHashCode), getDependencies.INSTANCE.AudioAttributesCompatParcelizer());
            NumberOutput.write(_handleunrecognizedcharacterescape4, getDependencies.INSTANCE.write());
            NumberOutput.write(_handleunrecognizedcharacterescape4, _handleoddnameRemoteActionCompatParcelizer, getDependencies.INSTANCE.MediaBrowserCompatCustomActionResultReceiver());
            DrawerLayoutSavedState drawerLayoutSavedState = DrawerLayoutSavedState.INSTANCE;
            _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(1940874041);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                final clearSurfaceFrameRate clearsurfaceframerate = (clearSurfaceFrameRate) it.next();
                isInLayout.RemoteActionCompatParcelizer(isAdded.AudioAttributesCompatParcelizer(_handleOddName.INSTANCE, assignParameter.IconCompatParcelizer(8.0f)), _handleunrecognizedcharacterescapeWrite, 6);
                _handleOddName _handleoddnameRemoteActionCompatParcelizer$default = isAdded.RemoteActionCompatParcelizer$default(_handleOddName.INSTANCE, assignParameter.IconCompatParcelizer(160.0f), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null);
                int i11 = i8 & 896;
                int i12 = i11 == i7 ? 1 : i9;
                boolean zAudioAttributesCompatParcelizer = _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(clearsurfaceframerate);
                Object objOnPause = _handleunrecognizedcharacterescapeWrite.onPause();
                if ((i12 | (zAudioAttributesCompatParcelizer ? 1 : 0)) != 0 || objOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                    objOnPause = new getCreatedOnDateMs() { // from class: o.getCodecMaxValues
                        @Override // kotlin.getCreatedOnDateMs
                        public final Object invoke() {
                            return renderOutputBufferNow.RemoteActionCompatParcelizer(getanswermap, clearsurfaceframerate);
                        }
                    };
                    _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(objOnPause);
                }
                _handleOddName _handleoddnameRemoteActionCompatParcelizer$default2 = getLocalSavedStateRegistryOwner.RemoteActionCompatParcelizer$default(_handleoddnameRemoteActionCompatParcelizer$default, false, null, null, null, (getCreatedOnDateMs) objOnPause, 15, null);
                withTypeHandler withtypehandlerIconCompatParcelizer = getTag.IconCompatParcelizer(WindowInsetsCompatImpl30.INSTANCE.AudioAttributesImplApi21Parcelizer(), _skipWSOrEnd.INSTANCE.MediaBrowserCompatCustomActionResultReceiver(), _handleunrecognizedcharacterescapeWrite, i10);
                int iHashCode2 = Long.hashCode(_getBigDecimal.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, i9));
                _getCharDesc _getchardescHandleMediaPlayPauseIfPendingOnHandler2 = _handleunrecognizedcharacterescapeWrite.handleMediaPlayPauseIfPendingOnHandler();
                _handleOddName _handleoddnameRemoteActionCompatParcelizer2 = _verifyNLZ2.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, _handleoddnameRemoteActionCompatParcelizer$default2);
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
                _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape5 = NumberOutput.read(_handleunrecognizedcharacterescapeWrite);
                NumberOutput.write(_handleunrecognizedcharacterescape5, withtypehandlerIconCompatParcelizer, getDependencies.INSTANCE.AudioAttributesImplBaseParcelizer());
                NumberOutput.write(_handleunrecognizedcharacterescape5, _getchardescHandleMediaPlayPauseIfPendingOnHandler2, getDependencies.INSTANCE.MediaBrowserCompatItemReceiver());
                NumberOutput.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape5, Integer.valueOf(iHashCode2), getDependencies.INSTANCE.AudioAttributesCompatParcelizer());
                NumberOutput.write(_handleunrecognizedcharacterescape5, getDependencies.INSTANCE.write());
                NumberOutput.write(_handleunrecognizedcharacterescape5, _handleoddnameRemoteActionCompatParcelizer2, getDependencies.INSTANCE.MediaBrowserCompatCustomActionResultReceiver());
                getView getview = getView.INSTANCE;
                boolean z = ondisplayinfochanged == clearsurfaceframerate.getIconCompatParcelizer();
                boolean z2 = i11 == i7;
                boolean zAudioAttributesCompatParcelizer2 = _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(clearsurfaceframerate);
                Object objOnPause2 = _handleunrecognizedcharacterescapeWrite.onPause();
                if ((z2 | zAudioAttributesCompatParcelizer2) || objOnPause2 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                    objOnPause2 = new getCreatedOnDateMs() { // from class: o.experimentalGetVideoFrameProcessorColorConfiguration
                        @Override // kotlin.getCreatedOnDateMs
                        public final Object invoke() {
                            return renderOutputBufferNow.IconCompatParcelizer(getanswermap, clearsurfaceframerate);
                        }
                    };
                    _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(objOnPause2);
                }
                _merge _mergeVar = _merge.write;
                long jAudioAttributesImplApi26Parcelizer = enabled.INSTANCE.write(_handleunrecognizedcharacterescapeWrite, enabled.RemoteActionCompatParcelizer).AudioAttributesImplApi26Parcelizer();
                MarrowTheme marrowTheme = MarrowTheme.INSTANCE;
                Iterator it2 = it;
                int i13 = i8;
                int i14 = i7;
                content.IconCompatParcelizer(z, (getCreatedOnDateMs) objOnPause2, null, true, null, _mergeVar.IconCompatParcelizer(jAudioAttributesImplApi26Parcelizer, MarrowTheme.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, MarrowTheme.RemoteActionCompatParcelizer).getR8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM(), 0L, _handleunrecognizedcharacterescapeWrite, _merge.IconCompatParcelizer << 9, 4), _handleunrecognizedcharacterescapeWrite, 3072, 20);
                isInLayout.RemoteActionCompatParcelizer(isAdded.AudioAttributesImplApi26Parcelizer(_handleOddName.INSTANCE, assignParameter.IconCompatParcelizer(4.0f)), _handleunrecognizedcharacterescapeWrite, 6);
                if (clearsurfaceframerate.getIconCompatParcelizer() == onDisplayInfoChanged.read) {
                    _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(-1464393736);
                    _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape6 = _handleunrecognizedcharacterescapeWrite;
                    _copyCurrentStringValue.IconCompatParcelizer(singleArgCreatorDefaultsToProperties.read(R.string.text_all, _handleunrecognizedcharacterescapeWrite, 6), null, enabled.INSTANCE.write(_handleunrecognizedcharacterescapeWrite, enabled.RemoteActionCompatParcelizer).MediaBrowserCompatItemReceiver(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, enabled.INSTANCE.IconCompatParcelizer(_handleunrecognizedcharacterescapeWrite, enabled.RemoteActionCompatParcelizer).getMediaBrowserCompatCustomActionResultReceiver(), _handleunrecognizedcharacterescape6, 0, 0, 65530);
                    isInLayout.RemoteActionCompatParcelizer(isAdded.AudioAttributesImplApi26Parcelizer(_handleOddName.INSTANCE, assignParameter.IconCompatParcelizer(8.0f)), _handleunrecognizedcharacterescape6, 6);
                    int remoteActionCompatParcelizer = clearsurfaceframerate.getRemoteActionCompatParcelizer();
                    StringBuilder sb = new StringBuilder(" (");
                    sb.append(remoteActionCompatParcelizer);
                    sb.append(")");
                    _handleunrecognizedcharacterescape3 = _handleunrecognizedcharacterescape6;
                    _copyCurrentStringValue.IconCompatParcelizer(sb.toString(), null, enabled.INSTANCE.write(_handleunrecognizedcharacterescape6, enabled.RemoteActionCompatParcelizer).MediaBrowserCompatItemReceiver(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, enabled.INSTANCE.IconCompatParcelizer(_handleunrecognizedcharacterescape6, enabled.RemoteActionCompatParcelizer).getMediaBrowserCompatCustomActionResultReceiver(), _handleunrecognizedcharacterescape3, 0, 0, 65530);
                    _handleunrecognizedcharacterescape3.MediaBrowserCompatCustomActionResultReceiver();
                    i6 = 0;
                } else {
                    _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape7 = _handleunrecognizedcharacterescapeWrite;
                    _handleunrecognizedcharacterescape7.IconCompatParcelizer(-1463812145);
                    int i15 = IconCompatParcelizer.write[clearsurfaceframerate.getIconCompatParcelizer().ordinal()];
                    if (i15 != 1) {
                        i4 = 2;
                        if (i15 == 2) {
                            i3 = 4;
                            _handleunrecognizedcharacterescape7.IconCompatParcelizer(1753901486);
                            MarrowTheme marrowTheme2 = MarrowTheme.INSTANCE;
                            r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = MarrowTheme.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape7, MarrowTheme.RemoteActionCompatParcelizer).getOnPrepareFromUri();
                            _handleunrecognizedcharacterescape7.MediaBrowserCompatCustomActionResultReceiver();
                        } else if (i15 != 3) {
                            i3 = 4;
                            if (i15 != 4) {
                                _handleunrecognizedcharacterescape7.IconCompatParcelizer(1753895603);
                                _handleunrecognizedcharacterescape7.MediaBrowserCompatCustomActionResultReceiver();
                                throw new RenewEligibleCreator();
                            }
                            _handleunrecognizedcharacterescape7.IconCompatParcelizer(1753906896);
                            MarrowTheme marrowTheme3 = MarrowTheme.INSTANCE;
                            r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = MarrowTheme.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape7, MarrowTheme.RemoteActionCompatParcelizer).getOnSeekTo();
                            _handleunrecognizedcharacterescape7.MediaBrowserCompatCustomActionResultReceiver();
                        } else {
                            i3 = 4;
                            _handleunrecognizedcharacterescape7.IconCompatParcelizer(1753904141);
                            MarrowTheme marrowTheme4 = MarrowTheme.INSTANCE;
                            r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = MarrowTheme.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape7, MarrowTheme.RemoteActionCompatParcelizer).getOnPrepareFromMediaId();
                            _handleunrecognizedcharacterescape7.MediaBrowserCompatCustomActionResultReceiver();
                        }
                    } else {
                        i3 = 4;
                        i4 = 2;
                        _handleunrecognizedcharacterescape7.IconCompatParcelizer(1753898611);
                        MarrowTheme marrowTheme5 = MarrowTheme.INSTANCE;
                        r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = MarrowTheme.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape7, MarrowTheme.RemoteActionCompatParcelizer).getR8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                        _handleunrecognizedcharacterescape7.MediaBrowserCompatCustomActionResultReceiver();
                    }
                    long j = r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
                    int i16 = IconCompatParcelizer.write[clearsurfaceframerate.getIconCompatParcelizer().ordinal()];
                    if (i16 == 1 || i16 == i4) {
                        i5 = R.drawable.bookmark_rv;
                    } else if (i16 == 3) {
                        i5 = R.drawable.star_rv;
                    } else {
                        if (i16 != i3) {
                            throw new RenewEligibleCreator();
                        }
                        i5 = R.drawable.help_rv;
                    }
                    i6 = 0;
                    value.read(getDefaultSetterInfo.RemoteActionCompatParcelizer(i5, _handleunrecognizedcharacterescape7, 0), null, isAdded.AudioAttributesImplBaseParcelizer(_handleOddName.INSTANCE, assignParameter.IconCompatParcelizer(20.0f)), j, _handleunrecognizedcharacterescape7, isAnnotationBundle.read | 432, 0);
                    isInLayout.RemoteActionCompatParcelizer(isAdded.AudioAttributesImplApi26Parcelizer(_handleOddName.INSTANCE, assignParameter.IconCompatParcelizer(8.0f)), _handleunrecognizedcharacterescape7, 6);
                    int remoteActionCompatParcelizer2 = clearsurfaceframerate.getRemoteActionCompatParcelizer();
                    StringBuilder sb2 = new StringBuilder("(");
                    sb2.append(remoteActionCompatParcelizer2);
                    sb2.append(")");
                    _handleunrecognizedcharacterescape3 = _handleunrecognizedcharacterescape7;
                    _copyCurrentStringValue.IconCompatParcelizer(sb2.toString(), null, enabled.INSTANCE.write(_handleunrecognizedcharacterescape7, enabled.RemoteActionCompatParcelizer).MediaBrowserCompatItemReceiver(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, enabled.INSTANCE.IconCompatParcelizer(_handleunrecognizedcharacterescape7, enabled.RemoteActionCompatParcelizer).getMediaBrowserCompatCustomActionResultReceiver(), _handleunrecognizedcharacterescape3, 0, 0, 65530);
                    _handleunrecognizedcharacterescape3.MediaBrowserCompatCustomActionResultReceiver();
                }
                _handleunrecognizedcharacterescape3.AudioAttributesImplBaseParcelizer();
                _handleunrecognizedcharacterescapeWrite = _handleunrecognizedcharacterescape3;
                i10 = 48;
                i8 = i13;
                i9 = i6;
                i7 = i14;
                it = it2;
            }
            _handleunrecognizedcharacterescape2 = _handleunrecognizedcharacterescapeWrite;
            _handleunrecognizedcharacterescape2.MediaBrowserCompatCustomActionResultReceiver();
            _handleunrecognizedcharacterescape2.AudioAttributesImplBaseParcelizer();
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        releaseNameCopyBuffer releasenamecopybufferMediaBrowserCompatSearchResultReceiver = _handleunrecognizedcharacterescape2.MediaBrowserCompatSearchResultReceiver();
        if (releasenamecopybufferMediaBrowserCompatSearchResultReceiver != null) {
            releasenamecopybufferMediaBrowserCompatSearchResultReceiver.read(new MagicModuleSubmissionRequestBody() { // from class: o.codecNeedsSetOutputSurfaceWorkaround
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return renderOutputBufferNow.RemoteActionCompatParcelizer(list, ondisplayinfochanged, getanswermap, i, (_handleUnrecognizedCharacterEscape) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup RemoteActionCompatParcelizer(getAnswerMap getanswermap, clearSurfaceFrameRate clearsurfaceframerate) {
        getanswermap.invoke(clearsurfaceframerate.getIconCompatParcelizer());
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup IconCompatParcelizer(getAnswerMap getanswermap, clearSurfaceFrameRate clearsurfaceframerate) {
        getanswermap.invoke(clearsurfaceframerate.getIconCompatParcelizer());
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup RemoteActionCompatParcelizer(List list, onDisplayInfoChanged ondisplayinfochanged, getAnswerMap getanswermap, int i, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape) {
        IconCompatParcelizer(list, ondisplayinfochanged, getanswermap, _handleunrecognizedcharacterescape, _appendEscaped.RemoteActionCompatParcelizer(i | 1));
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup write(onDisplayInfoChanged ondisplayinfochanged, List list, getAnswerMap getanswermap, getCreatedOnDateMs getcreatedondatems, int i, int i2, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape) {
        write(ondisplayinfochanged, (List<clearSurfaceFrameRate>) list, (getAnswerMap<? super onDisplayInfoChanged, getShowPopup>) getanswermap, (getCreatedOnDateMs<getShowPopup>) getcreatedondatems, _handleunrecognizedcharacterescape, _appendEscaped.RemoteActionCompatParcelizer(i | 1), i2);
        return getShowPopup.INSTANCE;
    }
}
