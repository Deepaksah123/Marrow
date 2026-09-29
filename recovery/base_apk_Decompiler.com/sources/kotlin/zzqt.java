package kotlin;

import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.RendererCapabilities;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow.designsystem.theme.MarrowTheme;
import java.util.Iterator;
import java.util.List;
import kotlin._handleOddName;
import org.apache.commons.compress.archivers.cpio.CpioConstants;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes4.dex */
public final class zzqt {

    public static final class AudioAttributesImplApi26Parcelizer implements getAnswerMap {
        public static final AudioAttributesImplApi26Parcelizer RemoteActionCompatParcelizer = new AudioAttributesImplApi26Parcelizer();

        @Override // kotlin.getAnswerMap
        public final /* synthetic */ Object invoke(Object obj) {
            return null;
        }
    }

    public static final class write implements getAnswerMap {
        public static final write RemoteActionCompatParcelizer = new write();

        @Override // kotlin.getAnswerMap
        public final /* synthetic */ Object invoke(Object obj) {
            return null;
        }
    }

    public static final void AudioAttributesCompatParcelizer(_handleOddName _handleoddname, final zzpx zzpxVar, final getAnswerMap<? super String, getShowPopup> getanswermap, final getAnswerMap<? super String, getShowPopup> getanswermap2, final getCreatedOnDateMs<getShowPopup> getcreatedondatems, final getCreatedOnDateMs<getShowPopup> getcreatedondatems2, final getCreatedOnDateMs<getShowPopup> getcreatedondatems3, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, final int i, final int i2) {
        _handleOddName _handleoddname2;
        int i3;
        final _handleOddName _handleoddname3;
        toMagicModuleMetaRepoModel.write(zzpxVar, "");
        toMagicModuleMetaRepoModel.write(getanswermap, "");
        toMagicModuleMetaRepoModel.write(getanswermap2, "");
        toMagicModuleMetaRepoModel.write(getcreatedondatems, "");
        toMagicModuleMetaRepoModel.write(getcreatedondatems2, "");
        toMagicModuleMetaRepoModel.write(getcreatedondatems3, "");
        _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescapeWrite = _handleunrecognizedcharacterescape.write(1001002319);
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
            i3 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(zzpxVar) ? 32 : 16;
        }
        if ((i & RendererCapabilities.MODE_SUPPORT_MASK) == 0) {
            i3 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(getanswermap) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(getanswermap2) ? 2048 : 1024;
        }
        if ((i & CpioConstants.C_ISBLK) == 0) {
            i3 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(getcreatedondatems) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(getcreatedondatems2) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE;
        }
        if ((1572864 & i) == 0) {
            i3 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(getcreatedondatems3) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        int i5 = i3;
        if (!_handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer((599187 & i5) != 599186, i5 & 1)) {
            _handleunrecognizedcharacterescapeWrite.onPrepareFromSearch();
            _handleoddname3 = _handleoddname2;
        } else {
            _handleOddName _handleoddname4 = i4 != 0 ? _handleOddName.INSTANCE : _handleoddname2;
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(1001002319, i5, -1, "com.marrow2.ui.schema.listing.ui.filter.SchemaFilterOverlay (SchemaFilterOverlay.kt:46)");
            }
            StyledPlayerViewControllerVisibilityListener.read(_handleoddname4, getcreatedondatems2, multiplyFft.AudioAttributesCompatParcelizer(-525742995, true, new getModuleData() { // from class: o.zzra
                @Override // kotlin.getModuleData
                public final Object AudioAttributesCompatParcelizer(Object obj, Object obj2, Object obj3) {
                    return zzqt.RemoteActionCompatParcelizer(zzpxVar, getanswermap, getanswermap2, getcreatedondatems3, getcreatedondatems, (writeReplace) obj, (_handleUnrecognizedCharacterEscape) obj2, ((Integer) obj3).intValue());
                }
            }, _handleunrecognizedcharacterescapeWrite, 54), _handleunrecognizedcharacterescapeWrite, (i5 & 14) | RendererCapabilities.MODE_SUPPORT_MASK | ((i5 >> 12) & 112), 0);
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
            _handleoddname3 = _handleoddname4;
        }
        releaseNameCopyBuffer releasenamecopybufferMediaBrowserCompatSearchResultReceiver = _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatSearchResultReceiver();
        if (releasenamecopybufferMediaBrowserCompatSearchResultReceiver != null) {
            releasenamecopybufferMediaBrowserCompatSearchResultReceiver.read(new MagicModuleSubmissionRequestBody() { // from class: o.zzqy
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return zzqt.read(_handleoddname3, zzpxVar, getanswermap, getanswermap2, getcreatedondatems, getcreatedondatems2, getcreatedondatems3, i, i2, (_handleUnrecognizedCharacterEscape) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup RemoteActionCompatParcelizer(final zzpx zzpxVar, final getAnswerMap getanswermap, final getAnswerMap getanswermap2, final getCreatedOnDateMs getcreatedondatems, final getCreatedOnDateMs getcreatedondatems2, writeReplace writereplace, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        Object next;
        toMagicModuleMetaRepoModel.write(writereplace, "");
        if (_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer((i & 17) != 16, i & 1)) {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(-525742995, i, -1, "com.marrow2.ui.schema.listing.ui.filter.SchemaFilterOverlay.<anonymous> (SchemaFilterOverlay.kt:50)");
            }
            boolean zAudioAttributesCompatParcelizer = _handleunrecognizedcharacterescape.AudioAttributesCompatParcelizer(zzpxVar.getAudioAttributesCompatParcelizer());
            Object objOnPause = _handleunrecognizedcharacterescape.onPause();
            if (zAudioAttributesCompatParcelizer || objOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                Iterator<T> it = zzpxVar.RemoteActionCompatParcelizer().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) ((zzpw) next).AudioAttributesCompatParcelizer(), (Object) zzpxVar.getAudioAttributesCompatParcelizer())) {
                        break;
                    }
                }
                zzpw zzpwVar = (zzpw) next;
                objOnPause = available.RemoteActionCompatParcelizer$default(Integer.valueOf(zzpwVar != null ? zzpwVar.IconCompatParcelizer() : 0), null, 2, null);
                _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause);
            }
            _handleOddName.Companion companion = _handleOddName.INSTANCE;
            withTypeHandler withtypehandler = setValue.read(WindowInsetsCompatImpl30.INSTANCE.MediaBrowserCompatCustomActionResultReceiver(), _skipWSOrEnd.INSTANCE.RatingCompat(), _handleunrecognizedcharacterescape, 0);
            int iHashCode = Long.hashCode(_getBigDecimal.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape, 0));
            _getCharDesc _getchardescHandleMediaPlayPauseIfPendingOnHandler = _handleunrecognizedcharacterescape.handleMediaPlayPauseIfPendingOnHandler();
            _handleOddName _handleoddnameRemoteActionCompatParcelizer = _verifyNLZ2.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape, companion);
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
            NumberOutput.write(_handleunrecognizedcharacterescape2, withtypehandler, getDependencies.INSTANCE.AudioAttributesImplBaseParcelizer());
            NumberOutput.write(_handleunrecognizedcharacterescape2, _getchardescHandleMediaPlayPauseIfPendingOnHandler, getDependencies.INSTANCE.MediaBrowserCompatItemReceiver());
            NumberOutput.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape2, Integer.valueOf(iHashCode), getDependencies.INSTANCE.AudioAttributesCompatParcelizer());
            NumberOutput.write(_handleunrecognizedcharacterescape2, getDependencies.INSTANCE.write());
            NumberOutput.write(_handleunrecognizedcharacterescape2, _handleoddnameRemoteActionCompatParcelizer, getDependencies.INSTANCE.MediaBrowserCompatCustomActionResultReceiver());
            _handleOddName _handleoddname = DrawerLayoutLayoutParams.read$default(DrawerLayoutSavedState.INSTANCE, _handleOddName.INSTANCE, 1.0f, false, 2, null);
            boolean zIconCompatParcelizer = _handleunrecognizedcharacterescape.IconCompatParcelizer(zzpxVar);
            boolean zAudioAttributesCompatParcelizer2 = _handleunrecognizedcharacterescape.AudioAttributesCompatParcelizer(getanswermap);
            boolean zAudioAttributesCompatParcelizer3 = _handleunrecognizedcharacterescape.AudioAttributesCompatParcelizer(getanswermap2);
            Object objOnPause2 = _handleunrecognizedcharacterescape.onPause();
            if ((zIconCompatParcelizer | zAudioAttributesCompatParcelizer2 | zAudioAttributesCompatParcelizer3) || objOnPause2 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause2 = new getAnswerMap() { // from class: o.zzqs
                    @Override // kotlin.getAnswerMap
                    public final Object invoke(Object obj) {
                        return zzqt.write(zzpxVar, getanswermap, getanswermap2, (setReenterTransition) obj);
                    }
                };
                _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause2);
            }
            performContextItemSelected.write(_handleoddname, null, null, false, null, null, null, false, null, (getAnswerMap) objOnPause2, _handleunrecognizedcharacterescape, 0, 510);
            _handleOddName _handleoddnameRemoteActionCompatParcelizer$default = isAdded.RemoteActionCompatParcelizer$default(_handleOddName.INSTANCE, BitmapDescriptorFactory.HUE_RED, 1, null);
            MarrowTheme marrowTheme = MarrowTheme.INSTANCE;
            JsonGeneratorFeature.AudioAttributesCompatParcelizer(_handleoddnameRemoteActionCompatParcelizer$default, BitmapDescriptorFactory.HUE_RED, switchToNext.AudioAttributesCompatParcelizer$default(MarrowTheme.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape, MarrowTheme.RemoteActionCompatParcelizer).get_init_lambda3(), 0.3f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null), _handleunrecognizedcharacterescape, 6, 2);
            _handleOddName _handleoddnameIconCompatParcelizer = getParentFragment.IconCompatParcelizer(isAdded.RemoteActionCompatParcelizer$default(_handleOddName.INSTANCE, BitmapDescriptorFactory.HUE_RED, 1, null), assignParameter.IconCompatParcelizer(8.0f));
            withTypeHandler withtypehandlerIconCompatParcelizer = getTag.IconCompatParcelizer(WindowInsetsCompatImpl30.INSTANCE.AudioAttributesImplApi21Parcelizer(), _skipWSOrEnd.INSTANCE.MediaBrowserCompatMediaItem(), _handleunrecognizedcharacterescape, 0);
            int iHashCode2 = Long.hashCode(_getBigDecimal.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape, 0));
            _getCharDesc _getchardescHandleMediaPlayPauseIfPendingOnHandler2 = _handleunrecognizedcharacterescape.handleMediaPlayPauseIfPendingOnHandler();
            _handleOddName _handleoddnameRemoteActionCompatParcelizer2 = _verifyNLZ2.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape, _handleoddnameIconCompatParcelizer);
            getCreatedOnDateMs<getDependencies> getcreatedondatemsIconCompatParcelizer2 = getDependencies.INSTANCE.IconCompatParcelizer();
            if (!(_handleunrecognizedcharacterescape.MediaMetadataCompat() instanceof _closeInput)) {
                _getBigDecimal.write();
            }
            _handleunrecognizedcharacterescape.onPrepareFromMediaId();
            if (_handleunrecognizedcharacterescape.getParcelableVolumeInfo()) {
                _handleunrecognizedcharacterescape.read(getcreatedondatemsIconCompatParcelizer2);
            } else {
                _handleunrecognizedcharacterescape.onPlayFromUri();
            }
            _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape3 = NumberOutput.read(_handleunrecognizedcharacterescape);
            NumberOutput.write(_handleunrecognizedcharacterescape3, withtypehandlerIconCompatParcelizer, getDependencies.INSTANCE.AudioAttributesImplBaseParcelizer());
            NumberOutput.write(_handleunrecognizedcharacterescape3, _getchardescHandleMediaPlayPauseIfPendingOnHandler2, getDependencies.INSTANCE.MediaBrowserCompatItemReceiver());
            NumberOutput.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape3, Integer.valueOf(iHashCode2), getDependencies.INSTANCE.AudioAttributesCompatParcelizer());
            NumberOutput.write(_handleunrecognizedcharacterescape3, getDependencies.INSTANCE.write());
            NumberOutput.write(_handleunrecognizedcharacterescape3, _handleoddnameRemoteActionCompatParcelizer2, getDependencies.INSTANCE.MediaBrowserCompatCustomActionResultReceiver());
            getView getview = getView.INSTANCE;
            _handleOddName _handleoddnameRemoteActionCompatParcelizer$default2 = getViewLifecycleOwnerLiveData.RemoteActionCompatParcelizer$default(getview, _handleOddName.INSTANCE, 1.0f, false, 2, null);
            boolean zAudioAttributesCompatParcelizer4 = _handleunrecognizedcharacterescape.AudioAttributesCompatParcelizer(getcreatedondatems);
            Object objOnPause3 = _handleunrecognizedcharacterescape.onPause();
            if (zAudioAttributesCompatParcelizer4 || objOnPause3 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause3 = new getCreatedOnDateMs() { // from class: o.zzqz
                    @Override // kotlin.getCreatedOnDateMs
                    public final Object invoke() {
                        return zzqt.write(getcreatedondatems);
                    }
                };
                _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause3);
            }
            zzqp zzqpVar = zzqp.IconCompatParcelizer;
            CloseImageView.RemoteActionCompatParcelizer((getCreatedOnDateMs) objOnPause3, _handleoddnameRemoteActionCompatParcelizer$default2, false, null, null, null, null, null, null, zzqp.AudioAttributesCompatParcelizer(), _handleunrecognizedcharacterescape, C.ENCODING_PCM_32BIT, TarConstants.XSTAR_MAGIC_OFFSET);
            isInLayout.RemoteActionCompatParcelizer(isAdded.AudioAttributesImplApi26Parcelizer(_handleOddName.INSTANCE, assignParameter.IconCompatParcelizer(8.0f)), _handleunrecognizedcharacterescape, 6);
            _handleOddName _handleoddnameRemoteActionCompatParcelizer$default3 = isAdded.RemoteActionCompatParcelizer$default(getViewLifecycleOwnerLiveData.RemoteActionCompatParcelizer$default(getview, _handleOddName.INSTANCE, 1.0f, false, 2, null), BitmapDescriptorFactory.HUE_RED, 1, null);
            getReturnTransition getreturntransitionWrite$default = getParentFragment.write$default(BitmapDescriptorFactory.HUE_RED, assignParameter.IconCompatParcelizer(12.0f), 1, null);
            boolean zAudioAttributesCompatParcelizer5 = _handleunrecognizedcharacterescape.AudioAttributesCompatParcelizer(getcreatedondatems2);
            Object objOnPause4 = _handleunrecognizedcharacterescape.onPause();
            if (zAudioAttributesCompatParcelizer5 || objOnPause4 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause4 = new getCreatedOnDateMs() { // from class: o.zzqx
                    @Override // kotlin.getCreatedOnDateMs
                    public final Object invoke() {
                        return zzqt.read(getcreatedondatems2);
                    }
                };
                _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause4);
            }
            getCreatedOnDateMs getcreatedondatems3 = (getCreatedOnDateMs) objOnPause4;
            zzqp zzqpVar2 = zzqp.IconCompatParcelizer;
            CloseImageView.AudioAttributesCompatParcelizer(getcreatedondatems3, _handleoddnameRemoteActionCompatParcelizer$default3, false, null, null, null, null, null, getreturntransitionWrite$default, zzqp.read(), _handleunrecognizedcharacterescape, 905969664, 252);
            _handleunrecognizedcharacterescape.AudioAttributesImplBaseParcelizer();
            _handleunrecognizedcharacterescape.AudioAttributesImplBaseParcelizer();
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        } else {
            _handleunrecognizedcharacterescape.onPrepareFromSearch();
        }
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup write(zzpx zzpxVar, getAnswerMap getanswermap, getAnswerMap getanswermap2, setReenterTransition setreentertransition) {
        toMagicModuleMetaRepoModel.write(setreentertransition, "");
        zzqp zzqpVar = zzqp.IconCompatParcelizer;
        setReenterTransition.AudioAttributesCompatParcelizer$default(setreentertransition, null, null, zzqp.RemoteActionCompatParcelizer(), 3, null);
        List<zzpw> listRemoteActionCompatParcelizer = zzpxVar.RemoteActionCompatParcelizer();
        setreentertransition.RemoteActionCompatParcelizer(listRemoteActionCompatParcelizer.size(), null, new AudioAttributesCompatParcelizer(write.RemoteActionCompatParcelizer, listRemoteActionCompatParcelizer), multiplyFft.IconCompatParcelizer(802480018, true, new IconCompatParcelizer(listRemoteActionCompatParcelizer, zzpxVar, getanswermap)));
        zzqp zzqpVar2 = zzqp.IconCompatParcelizer;
        setReenterTransition.AudioAttributesCompatParcelizer$default(setreentertransition, null, null, zzqp.write(), 3, null);
        List<zzpw> listMediaBrowserCompatItemReceiver = zzpxVar.MediaBrowserCompatItemReceiver();
        setreentertransition.RemoteActionCompatParcelizer(listMediaBrowserCompatItemReceiver.size(), null, new MediaBrowserCompatItemReceiver(AudioAttributesImplApi26Parcelizer.RemoteActionCompatParcelizer, listMediaBrowserCompatItemReceiver), multiplyFft.IconCompatParcelizer(802480018, true, new AudioAttributesImplBaseParcelizer(listMediaBrowserCompatItemReceiver, zzpxVar, getanswermap2)));
        return getShowPopup.INSTANCE;
    }

    static final class RemoteActionCompatParcelizer implements getCreatedOnDateMs<getShowPopup> {
        private /* synthetic */ zzpw IconCompatParcelizer;
        private /* synthetic */ getAnswerMap<String, getShowPopup> write;

        @Override // kotlin.getCreatedOnDateMs
        public final /* synthetic */ getShowPopup invoke() {
            IconCompatParcelizer();
            return getShowPopup.INSTANCE;
        }

        private void IconCompatParcelizer() {
            this.write.invoke(this.IconCompatParcelizer.AudioAttributesCompatParcelizer());
        }

        /* JADX WARN: Multi-variable type inference failed */
        RemoteActionCompatParcelizer(getAnswerMap<? super String, getShowPopup> getanswermap, zzpw zzpwVar) {
            this.write = getanswermap;
            this.IconCompatParcelizer = zzpwVar;
        }
    }

    static final class read implements getCreatedOnDateMs<getShowPopup> {
        private /* synthetic */ getAnswerMap<String, getShowPopup> IconCompatParcelizer;
        private /* synthetic */ zzpw write;

        @Override // kotlin.getCreatedOnDateMs
        public final /* synthetic */ getShowPopup invoke() {
            AudioAttributesCompatParcelizer();
            return getShowPopup.INSTANCE;
        }

        private void AudioAttributesCompatParcelizer() {
            this.IconCompatParcelizer.invoke(this.write.AudioAttributesCompatParcelizer());
        }

        /* JADX WARN: Multi-variable type inference failed */
        read(getAnswerMap<? super String, getShowPopup> getanswermap, zzpw zzpwVar) {
            this.IconCompatParcelizer = getanswermap;
            this.write = zzpwVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup write(getCreatedOnDateMs getcreatedondatems) {
        getcreatedondatems.invoke();
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(getCreatedOnDateMs getcreatedondatems) {
        getcreatedondatems.invoke();
        return getShowPopup.INSTANCE;
    }

    public static final class AudioAttributesCompatParcelizer implements getAnswerMap<Integer, Object> {
        private /* synthetic */ getAnswerMap AudioAttributesCompatParcelizer;
        private /* synthetic */ List write;

        @Override // kotlin.getAnswerMap
        public final /* synthetic */ Object invoke(Integer num) {
            return RemoteActionCompatParcelizer(num.intValue());
        }

        private Object RemoteActionCompatParcelizer(int i) {
            return this.AudioAttributesCompatParcelizer.invoke(this.write.get(i));
        }

        public AudioAttributesCompatParcelizer(getAnswerMap getanswermap, List list) {
            this.AudioAttributesCompatParcelizer = getanswermap;
            this.write = list;
        }
    }

    public static final class MediaBrowserCompatItemReceiver implements getAnswerMap<Integer, Object> {
        private /* synthetic */ List AudioAttributesCompatParcelizer;
        private /* synthetic */ getAnswerMap read;

        @Override // kotlin.getAnswerMap
        public final /* synthetic */ Object invoke(Integer num) {
            return RemoteActionCompatParcelizer(num.intValue());
        }

        private Object RemoteActionCompatParcelizer(int i) {
            return this.read.invoke(this.AudioAttributesCompatParcelizer.get(i));
        }

        public MediaBrowserCompatItemReceiver(getAnswerMap getanswermap, List list) {
            this.read = getanswermap;
            this.AudioAttributesCompatParcelizer = list;
        }
    }

    public static final class AudioAttributesImplBaseParcelizer implements getMagicModuleStat<performDestroy, Integer, _handleUnrecognizedCharacterEscape, Integer, getShowPopup> {
        private /* synthetic */ zzpx AudioAttributesCompatParcelizer;
        private /* synthetic */ List RemoteActionCompatParcelizer;
        private /* synthetic */ getAnswerMap read;

        @Override // kotlin.getMagicModuleStat
        public final /* synthetic */ getShowPopup write(performDestroy performdestroy, Integer num, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, Integer num2) {
            AudioAttributesCompatParcelizer(performdestroy, num.intValue(), _handleunrecognizedcharacterescape, num2.intValue());
            return getShowPopup.INSTANCE;
        }

        private void AudioAttributesCompatParcelizer(performDestroy performdestroy, int i, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i2) {
            int i3;
            if ((i2 & 6) == 0) {
                i3 = (_handleunrecognizedcharacterescape.AudioAttributesCompatParcelizer(performdestroy) ? 4 : 2) | i2;
            } else {
                i3 = i2;
            }
            if ((i2 & 48) == 0) {
                i3 |= _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(i) ? 32 : 16;
            }
            if (!_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer((i3 & 147) != 146, i3 & 1)) {
                _handleunrecognizedcharacterescape.onPrepareFromSearch();
                return;
            }
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(802480018, i3, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
            }
            zzpw zzpwVar = (zzpw) this.RemoteActionCompatParcelizer.get(i);
            _handleunrecognizedcharacterescape.IconCompatParcelizer(1642066537);
            String strWrite = zzpwVar.write();
            int iIconCompatParcelizer = zzpwVar.IconCompatParcelizer();
            StringBuilder sb = new StringBuilder();
            sb.append(strWrite);
            sb.append(" (");
            sb.append(iIconCompatParcelizer);
            sb.append(") ");
            String string = sb.toString();
            int iIconCompatParcelizer2 = zzpwVar.IconCompatParcelizer();
            boolean zRemoteActionCompatParcelizer = toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) zzpwVar.AudioAttributesCompatParcelizer(), (Object) this.AudioAttributesCompatParcelizer.getIconCompatParcelizer());
            boolean zAudioAttributesCompatParcelizer = _handleunrecognizedcharacterescape.AudioAttributesCompatParcelizer(this.read);
            boolean zAudioAttributesCompatParcelizer2 = _handleunrecognizedcharacterescape.AudioAttributesCompatParcelizer(zzpwVar);
            Object objOnPause = _handleunrecognizedcharacterescape.onPause();
            if ((zAudioAttributesCompatParcelizer | zAudioAttributesCompatParcelizer2) || objOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause = (getCreatedOnDateMs) new read(this.read, zzpwVar);
                _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause);
            }
            drawTextLayout.write((_handleOddName) null, string, iIconCompatParcelizer2, zRemoteActionCompatParcelizer, (getCreatedOnDateMs<getShowPopup>) objOnPause, _handleunrecognizedcharacterescape, 0, 1);
            _handleunrecognizedcharacterescape.MediaBrowserCompatCustomActionResultReceiver();
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }

        public AudioAttributesImplBaseParcelizer(List list, zzpx zzpxVar, getAnswerMap getanswermap) {
            this.RemoteActionCompatParcelizer = list;
            this.AudioAttributesCompatParcelizer = zzpxVar;
            this.read = getanswermap;
        }
    }

    public static final class IconCompatParcelizer implements getMagicModuleStat<performDestroy, Integer, _handleUnrecognizedCharacterEscape, Integer, getShowPopup> {
        private /* synthetic */ List IconCompatParcelizer;
        private /* synthetic */ getAnswerMap read;
        private /* synthetic */ zzpx write;

        @Override // kotlin.getMagicModuleStat
        public final /* synthetic */ getShowPopup write(performDestroy performdestroy, Integer num, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, Integer num2) {
            RemoteActionCompatParcelizer(performdestroy, num.intValue(), _handleunrecognizedcharacterescape, num2.intValue());
            return getShowPopup.INSTANCE;
        }

        private void RemoteActionCompatParcelizer(performDestroy performdestroy, int i, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i2) {
            int i3;
            if ((i2 & 6) == 0) {
                i3 = (_handleunrecognizedcharacterescape.AudioAttributesCompatParcelizer(performdestroy) ? 4 : 2) | i2;
            } else {
                i3 = i2;
            }
            if ((i2 & 48) == 0) {
                i3 |= _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(i) ? 32 : 16;
            }
            if (!_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer((i3 & 147) != 146, i3 & 1)) {
                _handleunrecognizedcharacterescape.onPrepareFromSearch();
                return;
            }
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(802480018, i3, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
            }
            zzpw zzpwVar = (zzpw) this.IconCompatParcelizer.get(i);
            _handleunrecognizedcharacterescape.IconCompatParcelizer(-2128696698);
            String strWrite = zzpwVar.write();
            int iIconCompatParcelizer = zzpwVar.IconCompatParcelizer();
            StringBuilder sb = new StringBuilder();
            sb.append(strWrite);
            sb.append(" (");
            sb.append(iIconCompatParcelizer);
            sb.append(") ");
            String string = sb.toString();
            int iIconCompatParcelizer2 = zzpwVar.IconCompatParcelizer();
            boolean zRemoteActionCompatParcelizer = toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) zzpwVar.AudioAttributesCompatParcelizer(), (Object) this.write.getAudioAttributesCompatParcelizer());
            boolean zAudioAttributesCompatParcelizer = _handleunrecognizedcharacterescape.AudioAttributesCompatParcelizer(this.read);
            boolean zAudioAttributesCompatParcelizer2 = _handleunrecognizedcharacterescape.AudioAttributesCompatParcelizer(zzpwVar);
            Object objOnPause = _handleunrecognizedcharacterescape.onPause();
            if ((zAudioAttributesCompatParcelizer | zAudioAttributesCompatParcelizer2) || objOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause = (getCreatedOnDateMs) new RemoteActionCompatParcelizer(this.read, zzpwVar);
                _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause);
            }
            drawTextLayout.write((_handleOddName) null, string, iIconCompatParcelizer2, zRemoteActionCompatParcelizer, (getCreatedOnDateMs<getShowPopup>) objOnPause, _handleunrecognizedcharacterescape, 0, 1);
            _handleunrecognizedcharacterescape.MediaBrowserCompatCustomActionResultReceiver();
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }

        public IconCompatParcelizer(List list, zzpx zzpxVar, getAnswerMap getanswermap) {
            this.IconCompatParcelizer = list;
            this.write = zzpxVar;
            this.read = getanswermap;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(_handleOddName _handleoddname, zzpx zzpxVar, getAnswerMap getanswermap, getAnswerMap getanswermap2, getCreatedOnDateMs getcreatedondatems, getCreatedOnDateMs getcreatedondatems2, getCreatedOnDateMs getcreatedondatems3, int i, int i2, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape) {
        AudioAttributesCompatParcelizer(_handleoddname, zzpxVar, getanswermap, getanswermap2, getcreatedondatems, getcreatedondatems2, getcreatedondatems3, _handleunrecognizedcharacterescape, _appendEscaped.RemoteActionCompatParcelizer(i | 1), i2);
        return getShowPopup.INSTANCE;
    }
}
