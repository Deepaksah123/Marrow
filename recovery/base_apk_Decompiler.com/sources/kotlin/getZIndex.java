package kotlin;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.RendererCapabilities;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import com.marrow2.ui.review_components.ui.pagers.ReviewPagerViewModel;
import java.util.List;
import kotlin.updateAll;
import kotlin.withFieldVisibility;
import org.apache.commons.compress.archivers.cpio.CpioConstants;

/* JADX INFO: loaded from: classes4.dex */
public final class getZIndex {
    public static final void AudioAttributesCompatParcelizer(final _handleOddName _handleoddname, final List<String> list, final int i, final String str, final boolean z, final zzhs zzhsVar, final boolean z2, final zzhx zzhxVar, final getAnswerMap<? super Integer, getShowPopup> getanswermap, final getCreatedOnDateMs<getShowPopup> getcreatedondatems, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, final int i2) {
        int i3;
        _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape2;
        withFieldVisibility.write defaultViewModelCreationExtras;
        int i4;
        toMagicModuleMetaRepoModel.write(_handleoddname, "");
        toMagicModuleMetaRepoModel.write(list, "");
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(zzhsVar, "");
        toMagicModuleMetaRepoModel.write(zzhxVar, "");
        toMagicModuleMetaRepoModel.write(getanswermap, "");
        toMagicModuleMetaRepoModel.write(getcreatedondatems, "");
        _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescapeWrite = _handleunrecognizedcharacterescape.write(-1628796520);
        if ((i2 & 6) == 0) {
            i3 = (_handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(_handleoddname) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(list) ? 32 : 16;
        }
        if ((i2 & RendererCapabilities.MODE_SUPPORT_MASK) == 0) {
            i3 |= _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(i) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(str) ? 2048 : 1024;
        }
        if ((i2 & CpioConstants.C_ISBLK) == 0) {
            i3 |= _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(z) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(zzhsVar.ordinal()) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE;
        }
        if ((1572864 & i2) == 0) {
            i3 |= _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(z2) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((12582912 & i2) == 0) {
            i3 |= _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(zzhxVar.ordinal()) ? 8388608 : 4194304;
        }
        if ((100663296 & i2) == 0) {
            i3 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(getanswermap) ? 67108864 : 33554432;
        }
        if ((805306368 & i2) == 0) {
            i3 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(getcreatedondatems) ? 536870912 : 268435456;
        }
        int i5 = i3;
        if (!_handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer((306783379 & i5) != 306783378, i5 & 1)) {
            _handleunrecognizedcharacterescape2 = _handleunrecognizedcharacterescapeWrite;
            _handleunrecognizedcharacterescape2.onPrepareFromSearch();
        } else {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(-1628796520, i5, -1, "com.marrow2.ui.review_components.ui.ReviewMcqPager (ReviewMcqPager.kt:35)");
            }
            withTypeHandler withtypehandlerWrite = AbsSavedState1.write(_skipWSOrEnd.INSTANCE.MediaBrowserCompatSearchResultReceiver(), false);
            int iHashCode = Long.hashCode(_getBigDecimal.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, 0));
            _getCharDesc _getchardescHandleMediaPlayPauseIfPendingOnHandler = _handleunrecognizedcharacterescapeWrite.handleMediaPlayPauseIfPendingOnHandler();
            _handleOddName _handleoddnameRemoteActionCompatParcelizer = _verifyNLZ2.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, _handleoddname);
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
            JDK14Util jDK14Util = JDK14Util.INSTANCE;
            TypeResolutionContext typeResolutionContextIconCompatParcelizer = JDK14Util.IconCompatParcelizer(_handleunrecognizedcharacterescapeWrite, 6);
            if (typeResolutionContextIconCompatParcelizer == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            if (typeResolutionContextIconCompatParcelizer instanceof anyExplicitsWithoutIgnoral) {
                defaultViewModelCreationExtras = ((anyExplicitsWithoutIgnoral) typeResolutionContextIconCompatParcelizer).getDefaultViewModelCreationExtras();
            } else {
                defaultViewModelCreationExtras = withFieldVisibility.write.INSTANCE;
            }
            final ReviewPagerViewModel reviewPagerViewModel = (ReviewPagerViewModel) JDK14UtilRawTypeName.IconCompatParcelizer(toMagicModuleMetaDataUcModel.write(ReviewPagerViewModel.class), typeResolutionContextIconCompatParcelizer, null, defaultViewModelCreationExtras, _handleunrecognizedcharacterescapeWrite, 0);
            final Context context = (Context) _handleunrecognizedcharacterescapeWrite.write(AndroidCompositionLocals_androidKt.IconCompatParcelizer());
            zzkn zzknVar = (zzkn) isSetterVisible.AudioAttributesCompatParcelizer(reviewPagerViewModel.AudioAttributesCompatParcelizer(), _handleunrecognizedcharacterescapeWrite, 0).getRemoteActionCompatParcelizer();
            if (!zzknVar.getIconCompatParcelizer() && !zzknVar.getAudioAttributesCompatParcelizer() && !zzknVar.getWrite()) {
                _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(-1458777808);
                _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatCustomActionResultReceiver();
                i4 = 536870912;
            } else {
                _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(-1457094105);
                _handleOddName _handleoddnameIconCompatParcelizer = _parseFloatThatStartsWithPeriod.IconCompatParcelizer(_handleOddName.INSTANCE, 10.0f);
                boolean iconCompatParcelizer = zzknVar.getIconCompatParcelizer();
                boolean audioAttributesCompatParcelizer = zzknVar.getAudioAttributesCompatParcelizer();
                boolean write = zzknVar.getWrite();
                boolean zIconCompatParcelizer = _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(reviewPagerViewModel);
                Object objOnPause = _handleunrecognizedcharacterescapeWrite.onPause();
                if (zIconCompatParcelizer || objOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                    objOnPause = new getCreatedOnDateMs() { // from class: o.getPoints
                        @Override // kotlin.getCreatedOnDateMs
                        public final Object invoke() {
                            return getZIndex.RemoteActionCompatParcelizer(reviewPagerViewModel);
                        }
                    };
                    _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(objOnPause);
                }
                getCreatedOnDateMs getcreatedondatems2 = (getCreatedOnDateMs) objOnPause;
                i4 = 536870912;
                boolean z3 = (i5 & 1879048192) == 536870912;
                boolean zIconCompatParcelizer2 = _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(reviewPagerViewModel);
                Object objOnPause2 = _handleunrecognizedcharacterescapeWrite.onPause();
                if ((zIconCompatParcelizer2 | z3) || objOnPause2 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                    objOnPause2 = new getStartCap(getcreatedondatems, reviewPagerViewModel);
                    _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(objOnPause2);
                }
                getCreatedOnDateMs getcreatedondatems3 = (getCreatedOnDateMs) objOnPause2;
                boolean zIconCompatParcelizer3 = _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(reviewPagerViewModel);
                Object objOnPause3 = _handleunrecognizedcharacterescapeWrite.onPause();
                if (zIconCompatParcelizer3 || objOnPause3 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                    objOnPause3 = new getCreatedOnDateMs() { // from class: o.getJointType
                        @Override // kotlin.getCreatedOnDateMs
                        public final Object invoke() {
                            return getZIndex.read(reviewPagerViewModel);
                        }
                    };
                    _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(objOnPause3);
                }
                zzie.write(_handleoddnameIconCompatParcelizer, audioAttributesCompatParcelizer, iconCompatParcelizer, write, (getCreatedOnDateMs<getShowPopup>) getcreatedondatems2, (getCreatedOnDateMs<getShowPopup>) getcreatedondatems3, (getCreatedOnDateMs<getShowPopup>) objOnPause3, _handleunrecognizedcharacterescapeWrite, 6, 0);
                _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatCustomActionResultReceiver();
            }
            getShowPopup getshowpopup = getShowPopup.INSTANCE;
            boolean zIconCompatParcelizer4 = _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(context);
            boolean z4 = (1879048192 & i5) == i4;
            Object objOnPause4 = _handleunrecognizedcharacterescapeWrite.onPause();
            if ((zIconCompatParcelizer4 | z4) || objOnPause4 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause4 = new getAnswerMap() { // from class: o.getEndCap
                    @Override // kotlin.getAnswerMap
                    public final Object invoke(Object obj) {
                        return getZIndex.read(context, getcreatedondatems, (StreamConstraintsException) obj);
                    }
                };
                _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(objOnPause4);
            }
            StreamReadException.RemoteActionCompatParcelizer(getshowpopup, (getAnswerMap) objOnPause4, _handleunrecognizedcharacterescapeWrite, 6);
            if (zzhxVar == zzhx.RemoteActionCompatParcelizer) {
                _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(-1455791144);
                int i6 = i5 >> 3;
                zzki.IconCompatParcelizer(_handleoddname, list, i, str, zzhsVar, z, z2, getanswermap, _handleunrecognizedcharacterescapeWrite, (i5 & 3670016) | (i5 & 8190) | (57344 & i6) | ((i5 << 3) & 458752) | (i6 & 29360128), 0);
                _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatCustomActionResultReceiver();
                _handleunrecognizedcharacterescape2 = _handleunrecognizedcharacterescapeWrite;
            } else {
                _handleunrecognizedcharacterescape2 = _handleunrecognizedcharacterescapeWrite;
                _handleunrecognizedcharacterescape2.IconCompatParcelizer(-1455380580);
                zzjx.IconCompatParcelizer(_handleoddname, list, i, str, z, zzhsVar, z2, getanswermap, _handleunrecognizedcharacterescape2, (4194302 & i5) | ((i5 >> 3) & 29360128));
                _handleunrecognizedcharacterescape2.MediaBrowserCompatCustomActionResultReceiver();
            }
            _handleunrecognizedcharacterescape2.AudioAttributesImplBaseParcelizer();
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        releaseNameCopyBuffer releasenamecopybufferMediaBrowserCompatSearchResultReceiver = _handleunrecognizedcharacterescape2.MediaBrowserCompatSearchResultReceiver();
        if (releasenamecopybufferMediaBrowserCompatSearchResultReceiver != null) {
            releasenamecopybufferMediaBrowserCompatSearchResultReceiver.read(new MagicModuleSubmissionRequestBody() { // from class: o.isGeodesic
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return getZIndex.RemoteActionCompatParcelizer(_handleoddname, list, i, str, z, zzhsVar, z2, zzhxVar, getanswermap, getcreatedondatems, i2, (_handleUnrecognizedCharacterEscape) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesCompatParcelizer(getCreatedOnDateMs getcreatedondatems, ReviewPagerViewModel reviewPagerViewModel) {
        getcreatedondatems.invoke();
        reviewPagerViewModel.AudioAttributesImplBaseParcelizer();
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup RemoteActionCompatParcelizer(ReviewPagerViewModel reviewPagerViewModel) {
        reviewPagerViewModel.AudioAttributesImplApi26Parcelizer();
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(ReviewPagerViewModel reviewPagerViewModel) {
        reviewPagerViewModel.MediaBrowserCompatCustomActionResultReceiver();
        return getShowPopup.INSTANCE;
    }

    public static final class read implements updateAll.write {
        private /* synthetic */ Context IconCompatParcelizer;
        private /* synthetic */ getCreatedOnDateMs<getShowPopup> RemoteActionCompatParcelizer;

        read(Context context, getCreatedOnDateMs<getShowPopup> getcreatedondatems) {
            this.IconCompatParcelizer = context;
            this.RemoteActionCompatParcelizer = getcreatedondatems;
        }

        @Override // o.updateAll.write
        public final void write() {
            dispatchTouchEvent.RemoteActionCompatParcelizer(this.IconCompatParcelizer, 100L);
            this.RemoteActionCompatParcelizer.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final _wrapError read(Context context, getCreatedOnDateMs getcreatedondatems, StreamConstraintsException streamConstraintsException) {
        toMagicModuleMetaRepoModel.write(streamConstraintsException, "");
        updateAll updateall = new updateAll(context, new read(context, getcreatedondatems));
        updateall.write();
        return new AudioAttributesCompatParcelizer(updateall);
    }

    public static final class AudioAttributesCompatParcelizer implements _wrapError {
        private /* synthetic */ updateAll read;

        public AudioAttributesCompatParcelizer(updateAll updateall) {
            this.read = updateall;
        }

        @Override // kotlin._wrapError
        public final void RemoteActionCompatParcelizer() {
            this.read.read();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup RemoteActionCompatParcelizer(_handleOddName _handleoddname, List list, int i, String str, boolean z, zzhs zzhsVar, boolean z2, zzhx zzhxVar, getAnswerMap getanswermap, getCreatedOnDateMs getcreatedondatems, int i2, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape) {
        AudioAttributesCompatParcelizer(_handleoddname, list, i, str, z, zzhsVar, z2, zzhxVar, getanswermap, getcreatedondatems, _handleunrecognizedcharacterescape, _appendEscaped.RemoteActionCompatParcelizer(i2 | 1));
        return getShowPopup.INSTANCE;
    }
}
