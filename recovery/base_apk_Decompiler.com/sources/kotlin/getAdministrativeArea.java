package kotlin;

import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.RendererCapabilities;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow2.ui.qbank.play.QBankMcqViewModel;
import com.marrow2.ui.qbank.play.QBankPlayViewModel;
import java.util.HashMap;
import java.util.List;
import kotlin.getAddress3;
import org.apache.commons.compress.archivers.cpio.CpioConstants;

/* JADX INFO: loaded from: classes4.dex */
public final class getAdministrativeArea {
    public static final void IconCompatParcelizer(_handleOddName _handleoddname, final List<String> list, final String str, final zzhs zzhsVar, final boolean z, final QBankPlayViewModel qBankPlayViewModel, final getLocality getlocality, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, final int i, final int i2) {
        _handleOddName _handleoddname2;
        int i3;
        toMagicModuleMetaRepoModel.write(list, "");
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(zzhsVar, "");
        toMagicModuleMetaRepoModel.write(qBankPlayViewModel, "");
        toMagicModuleMetaRepoModel.write(getlocality, "");
        _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescapeWrite = _handleunrecognizedcharacterescape.write(1207480901);
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
            i3 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(list) ? 32 : 16;
        }
        if ((i & RendererCapabilities.MODE_SUPPORT_MASK) == 0) {
            i3 |= _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(str) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(zzhsVar.ordinal()) ? 2048 : 1024;
        }
        if ((i & CpioConstants.C_ISBLK) == 0) {
            i3 |= _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(z) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(qBankPlayViewModel) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE;
        }
        if ((1572864 & i) == 0) {
            i3 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(getlocality) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if (_handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer((599187 & i3) != 599186, i3 & 1)) {
            _handleOddName _handleoddname3 = i4 != 0 ? _handleOddName.INSTANCE : _handleoddname2;
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(1207480901, i3, -1, "com.marrow2.ui.qbank.play.ui.QBankHorizontalPagerNativeWrapper (QBankHorizontalPagerNativeWrapper.kt:44)");
            }
            final DataSourceBitmapLoaderExternalSyntheticLambda0 dataSourceBitmapLoaderExternalSyntheticLambda0 = (DataSourceBitmapLoaderExternalSyntheticLambda0) isSetterVisible.AudioAttributesCompatParcelizer(qBankPlayViewModel.read(), _handleunrecognizedcharacterescapeWrite, 0).getRemoteActionCompatParcelizer();
            if (dataSourceBitmapLoaderExternalSyntheticLambda0 instanceof decodeBitmap) {
                _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(1712893450);
                withTypeHandler withtypehandlerWrite = AbsSavedState1.write(_skipWSOrEnd.INSTANCE.MediaBrowserCompatSearchResultReceiver(), false);
                int iHashCode = Long.hashCode(_getBigDecimal.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, 0));
                _getCharDesc _getchardescHandleMediaPlayPauseIfPendingOnHandler = _handleunrecognizedcharacterescapeWrite.handleMediaPlayPauseIfPendingOnHandler();
                _handleOddName _handleoddnameRemoteActionCompatParcelizer = _verifyNLZ2.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, _handleoddname3);
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
                NumberOutput.write(_handleunrecognizedcharacterescape2, withtypehandlerWrite, getDependencies.INSTANCE.AudioAttributesImplBaseParcelizer());
                NumberOutput.write(_handleunrecognizedcharacterescape2, _getchardescHandleMediaPlayPauseIfPendingOnHandler, getDependencies.INSTANCE.MediaBrowserCompatItemReceiver());
                NumberOutput.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape2, Integer.valueOf(iHashCode), getDependencies.INSTANCE.AudioAttributesCompatParcelizer());
                NumberOutput.write(_handleunrecognizedcharacterescape2, getDependencies.INSTANCE.write());
                NumberOutput.write(_handleunrecognizedcharacterescape2, _handleoddnameRemoteActionCompatParcelizer, getDependencies.INSTANCE.MediaBrowserCompatCustomActionResultReceiver());
                setDrawerElevation setdrawerelevation = setDrawerElevation.INSTANCE;
                boolean z2 = (i3 & 896) == 256;
                boolean z3 = (i3 & 7168) == 2048;
                boolean z4 = (57344 & i3) == 16384;
                boolean zIconCompatParcelizer = _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(qBankPlayViewModel);
                Object objOnPause = _handleunrecognizedcharacterescapeWrite.onPause();
                if ((z2 | z3 | z4 | zIconCompatParcelizer) || objOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                    objOnPause = new getAnswerMap() { // from class: o.getEmailAddress
                        @Override // kotlin.getAnswerMap
                        public final Object invoke(Object obj) {
                            return getAdministrativeArea.RemoteActionCompatParcelizer(str, zzhsVar, z, qBankPlayViewModel, (Context) obj);
                        }
                    };
                    _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(objOnPause);
                }
                getAnswerMap getanswermap = (getAnswerMap) objOnPause;
                boolean zIconCompatParcelizer2 = _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(list);
                boolean zIconCompatParcelizer3 = _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(getlocality);
                boolean zIconCompatParcelizer4 = _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(dataSourceBitmapLoaderExternalSyntheticLambda0);
                Object objOnPause2 = _handleunrecognizedcharacterescapeWrite.onPause();
                if ((zIconCompatParcelizer2 | zIconCompatParcelizer3 | zIconCompatParcelizer4) || objOnPause2 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                    objOnPause2 = new getAnswerMap() { // from class: o.isPostBox
                        @Override // kotlin.getAnswerMap
                        public final Object invoke(Object obj) {
                            return getAdministrativeArea.write(getlocality, list, dataSourceBitmapLoaderExternalSyntheticLambda0, (ViewPager2) obj);
                        }
                    };
                    _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(objOnPause2);
                }
                AtomicLongDeserializer.AudioAttributesCompatParcelizer(getanswermap, null, (getAnswerMap) objOnPause2, _handleunrecognizedcharacterescapeWrite, 0, 2);
                _handleunrecognizedcharacterescapeWrite.AudioAttributesImplBaseParcelizer();
                _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatCustomActionResultReceiver();
            } else {
                _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(1715851067);
                _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatCustomActionResultReceiver();
            }
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
            _handleoddname2 = _handleoddname3;
        } else {
            _handleunrecognizedcharacterescapeWrite.onPrepareFromSearch();
        }
        releaseNameCopyBuffer releasenamecopybufferMediaBrowserCompatSearchResultReceiver = _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatSearchResultReceiver();
        if (releasenamecopybufferMediaBrowserCompatSearchResultReceiver != null) {
            final _handleOddName _handleoddname4 = _handleoddname2;
            releasenamecopybufferMediaBrowserCompatSearchResultReceiver.read(new MagicModuleSubmissionRequestBody() { // from class: o.zbaa
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return getAdministrativeArea.AudioAttributesCompatParcelizer(_handleoddname4, list, str, zzhsVar, z, qBankPlayViewModel, getlocality, i, i2, (_handleUnrecognizedCharacterEscape) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ViewPager2 RemoteActionCompatParcelizer(String str, zzhs zzhsVar, boolean z, QBankPlayViewModel qBankPlayViewModel, Context context) {
        toMagicModuleMetaRepoModel.write(context, "");
        ViewPager2 viewPager2 = new ViewPager2(context);
        viewPager2.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        viewPager2.setOffscreenPageLimit(1);
        viewPager2.setAdapter(new C0265zzbe(str, zzhsVar, z, qBankPlayViewModel));
        viewPager2.AudioAttributesCompatParcelizer(new RemoteActionCompatParcelizer(qBankPlayViewModel, viewPager2));
        return viewPager2;
    }

    public static final class RemoteActionCompatParcelizer extends ViewPager2.write {
        private /* synthetic */ ViewPager2 AudioAttributesCompatParcelizer;
        private /* synthetic */ QBankPlayViewModel write;

        RemoteActionCompatParcelizer(QBankPlayViewModel qBankPlayViewModel, ViewPager2 viewPager2) {
            this.write = qBankPlayViewModel;
            this.AudioAttributesCompatParcelizer = viewPager2;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.write
        public final void AudioAttributesCompatParcelizer(int i, float f, int i2) {
            super.AudioAttributesCompatParcelizer(i, f, i2);
            HashMap<String, Integer> mapRemoteActionCompatParcelizer = this.write.read().IconCompatParcelizer().RemoteActionCompatParcelizer();
            if (mapRemoteActionCompatParcelizer == null) {
                mapRemoteActionCompatParcelizer = VideoTimelineResponseBody.read();
            }
            if (f > 0.5d) {
                if ((i < this.write.getMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() - 1 || !mapRemoteActionCompatParcelizer.containsKey(this.write.AudioAttributesImplApi26Parcelizer().IconCompatParcelizer().RemoteActionCompatParcelizer().get(i))) && !mapRemoteActionCompatParcelizer.isEmpty()) {
                    ViewPager2 viewPager2 = this.AudioAttributesCompatParcelizer;
                    viewPager2.setCurrentItem(viewPager2.read(), false);
                }
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.write
        public final void RemoteActionCompatParcelizer(int i) {
            this.write.IconCompatParcelizer(new getAddress3.RemoteActionCompatParcelizer(i));
            super.RemoteActionCompatParcelizer(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final getShowPopup write(getLocality getlocality, List list, DataSourceBitmapLoaderExternalSyntheticLambda0 dataSourceBitmapLoaderExternalSyntheticLambda0, ViewPager2 viewPager2) {
        toMagicModuleMetaRepoModel.write(viewPager2, "");
        viewPager2.setOffscreenPageLimit(1);
        RecyclerView.IconCompatParcelizer iconCompatParcelizerRemoteActionCompatParcelizer = viewPager2.RemoteActionCompatParcelizer();
        C0265zzbe c0265zzbe = iconCompatParcelizerRemoteActionCompatParcelizer instanceof C0265zzbe ? (C0265zzbe) iconCompatParcelizerRemoteActionCompatParcelizer : null;
        if (c0265zzbe != null && !toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(c0265zzbe.read(), list)) {
            c0265zzbe.read().clear();
            c0265zzbe.read().addAll(list);
            c0265zzbe.notifyDataSetChanged();
        }
        if (viewPager2.read() != getlocality.getRemoteActionCompatParcelizer()) {
            viewPager2.setCurrentItem(getlocality.getRemoteActionCompatParcelizer(), false);
        }
        if (!list.isEmpty() && ((HashMap) ((decodeBitmap) dataSourceBitmapLoaderExternalSyntheticLambda0).RemoteActionCompatParcelizer()).containsKey(list.get(viewPager2.read()))) {
            viewPager2.setUserInputEnabled(true);
        } else {
            viewPager2.setUserInputEnabled(false);
            viewPager2.setCurrentItem(viewPager2.read(), false);
        }
        return getShowPopup.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00e6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void AudioAttributesCompatParcelizer(final java.lang.String r30, final int r31, final kotlin.zzhs r32, final boolean r33, final com.marrow2.ui.qbank.play.QBankPlayViewModel r34, final java.lang.String r35, kotlin._handleUnrecognizedCharacterEscape r36, final int r37) {
        /*
            Method dump skipped, instruction units count: 732
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getAdministrativeArea.AudioAttributesCompatParcelizer(java.lang.String, int, o.zzhs, boolean, com.marrow2.ui.qbank.play.QBankPlayViewModel, java.lang.String, o._handleUnrecognizedCharacterEscape, int):void");
    }

    static final class read extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int AudioAttributesCompatParcelizer;
        private /* synthetic */ boolean IconCompatParcelizer;
        private /* synthetic */ String RemoteActionCompatParcelizer;
        private /* synthetic */ String read;
        private /* synthetic */ QBankMcqViewModel write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            getYear.IconCompatParcelizer();
            SdkPayloadData.IconCompatParcelizer(obj);
            this.write.AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer, this.read, this.IconCompatParcelizer);
            return getShowPopup.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        read(QBankMcqViewModel qBankMcqViewModel, String str, String str2, boolean z, SampleVideos<? super read> sampleVideos) {
            super(2, sampleVideos);
            this.write = qBankMcqViewModel;
            this.RemoteActionCompatParcelizer = str;
            this.read = str2;
            this.IconCompatParcelizer = z;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return new read(this.write, this.RemoteActionCompatParcelizer, this.read, this.IconCompatParcelizer, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((read) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    static final class write extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int AudioAttributesCompatParcelizer;
        private /* synthetic */ String RemoteActionCompatParcelizer;
        private /* synthetic */ QBankPlayViewModel read;
        private /* synthetic */ DataSourceBitmapLoaderExternalSyntheticLambda0<getAddress4> write;

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            getYear.IconCompatParcelizer();
            SdkPayloadData.IconCompatParcelizer(obj);
            Integer numMediaBrowserCompatItemReceiver = ((getAddress4) ((decodeBitmap) this.write).RemoteActionCompatParcelizer()).MediaBrowserCompatItemReceiver();
            if (numMediaBrowserCompatItemReceiver != null) {
                this.read.IconCompatParcelizer(new getAddress3.IconCompatParcelizer(this.RemoteActionCompatParcelizer, numMediaBrowserCompatItemReceiver.intValue()));
            }
            return getShowPopup.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        write(DataSourceBitmapLoaderExternalSyntheticLambda0<getAddress4> dataSourceBitmapLoaderExternalSyntheticLambda0, QBankPlayViewModel qBankPlayViewModel, String str, SampleVideos<? super write> sampleVideos) {
            super(2, sampleVideos);
            this.write = dataSourceBitmapLoaderExternalSyntheticLambda0;
            this.read = qBankPlayViewModel;
            this.RemoteActionCompatParcelizer = str;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return new write(this.write, this.read, this.RemoteActionCompatParcelizer, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((write) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup IconCompatParcelizer(DataSourceBitmapLoaderExternalSyntheticLambda0 dataSourceBitmapLoaderExternalSyntheticLambda0, final QBankPlayViewModel qBankPlayViewModel, String str, getLocality getlocality, zzhs zzhsVar, String str2, final int i, boolean z, boolean z2, setSupportImageTintMode setsupportimagetintmode, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i2) {
        toMagicModuleMetaRepoModel.write(setsupportimagetintmode, "");
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesCompatParcelizer(-487255824, i2, -1, "com.marrow2.ui.qbank.play.ui.QBankPlayDecider.<anonymous> (QBankHorizontalPagerNativeWrapper.kt:247)");
        }
        boolean zIconCompatParcelizer = _handleunrecognizedcharacterescape.IconCompatParcelizer(dataSourceBitmapLoaderExternalSyntheticLambda0);
        boolean zIconCompatParcelizer2 = _handleunrecognizedcharacterescape.IconCompatParcelizer(qBankPlayViewModel);
        boolean zAudioAttributesCompatParcelizer = _handleunrecognizedcharacterescape.AudioAttributesCompatParcelizer(str);
        write writeVarOnPause = _handleunrecognizedcharacterescape.onPause();
        if ((zIconCompatParcelizer | zIconCompatParcelizer2 | zAudioAttributesCompatParcelizer) || writeVarOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
            writeVarOnPause = new write(dataSourceBitmapLoaderExternalSyntheticLambda0, qBankPlayViewModel, str, null);
            _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(writeVarOnPause);
        }
        StreamReadException.IconCompatParcelizer(Boolean.TRUE, (MagicModuleSubmissionRequestBody) writeVarOnPause, _handleunrecognizedcharacterescape, 6);
        _handleOddName _handleoddnameIconCompatParcelizer$default = isAdded.IconCompatParcelizer$default(_handleOddName.INSTANCE, BitmapDescriptorFactory.HUE_RED, 1, null);
        setDouble read2 = getlocality.getRead();
        zzjc zzjcVar = zzjc.write;
        boolean zIconCompatParcelizer3 = _handleunrecognizedcharacterescape.IconCompatParcelizer(qBankPlayViewModel);
        boolean zRemoteActionCompatParcelizer = _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(i);
        Object objOnPause = _handleunrecognizedcharacterescape.onPause();
        if ((zIconCompatParcelizer3 | zRemoteActionCompatParcelizer) || objOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
            objOnPause = new getCreatedOnDateMs() { // from class: o.getPostalCode
                @Override // kotlin.getCreatedOnDateMs
                public final Object invoke() {
                    return getAdministrativeArea.write(qBankPlayViewModel, i);
                }
            };
            _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause);
        }
        zzhy.read(_handleoddnameIconCompatParcelizer$default, true, zzhsVar, str, zzjcVar, str2, i, z, read2, (getCreatedOnDateMs) objOnPause, true, null, z2, _handleunrecognizedcharacterescape, 24630, 6, 2048);
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesImplApi21Parcelizer();
        }
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup write(QBankPlayViewModel qBankPlayViewModel, int i) {
        qBankPlayViewModel.IconCompatParcelizer(new getAddress3.AudioAttributesCompatParcelizer(i));
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(final QBankMcqViewModel qBankMcqViewModel, getLocality getlocality, boolean z, final String str, final QBankPlayViewModel qBankPlayViewModel, final DataSourceBitmapLoaderExternalSyntheticLambda0 dataSourceBitmapLoaderExternalSyntheticLambda0, setSupportImageTintMode setsupportimagetintmode, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        toMagicModuleMetaRepoModel.write(setsupportimagetintmode, "");
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesCompatParcelizer(-193957799, i, -1, "com.marrow2.ui.qbank.play.ui.QBankPlayDecider.<anonymous> (QBankHorizontalPagerNativeWrapper.kt:280)");
        }
        _handleOddName _handleoddnameWrite = getParentFragment.write(isAdded.IconCompatParcelizer$default(_handleOddName.INSTANCE, BitmapDescriptorFactory.HUE_RED, 1, null), assignParameter.IconCompatParcelizer(20.0f), assignParameter.IconCompatParcelizer(16.0f));
        boolean mediaBrowserCompatCustomActionResultReceiver = getlocality.getMediaBrowserCompatCustomActionResultReceiver();
        boolean zIconCompatParcelizer = _handleunrecognizedcharacterescape.IconCompatParcelizer(qBankPlayViewModel);
        boolean zAudioAttributesCompatParcelizer = _handleunrecognizedcharacterescape.AudioAttributesCompatParcelizer(str);
        boolean zIconCompatParcelizer2 = _handleunrecognizedcharacterescape.IconCompatParcelizer(dataSourceBitmapLoaderExternalSyntheticLambda0);
        boolean zIconCompatParcelizer3 = _handleunrecognizedcharacterescape.IconCompatParcelizer(qBankMcqViewModel);
        Object objOnPause = _handleunrecognizedcharacterescape.onPause();
        if ((zIconCompatParcelizer | zAudioAttributesCompatParcelizer | zIconCompatParcelizer2 | zIconCompatParcelizer3) || objOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
            objOnPause = new getAnswerMap() { // from class: o.zbab
                @Override // kotlin.getAnswerMap
                public final Object invoke(Object obj) {
                    return getAdministrativeArea.IconCompatParcelizer(qBankPlayViewModel, str, dataSourceBitmapLoaderExternalSyntheticLambda0, qBankMcqViewModel, ((Integer) obj).intValue());
                }
            };
            _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause);
        }
        zbap.AudioAttributesCompatParcelizer(_handleoddnameWrite, qBankMcqViewModel, mediaBrowserCompatCustomActionResultReceiver, z, str, (getAnswerMap<? super Integer, getShowPopup>) objOnPause, _handleunrecognizedcharacterescape, 6, 0);
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesImplApi21Parcelizer();
        }
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final getShowPopup IconCompatParcelizer(QBankPlayViewModel qBankPlayViewModel, String str, DataSourceBitmapLoaderExternalSyntheticLambda0 dataSourceBitmapLoaderExternalSyntheticLambda0, QBankMcqViewModel qBankMcqViewModel, int i) {
        getAddress4 getaddress4 = (getAddress4) ((decodeBitmap) dataSourceBitmapLoaderExternalSyntheticLambda0).RemoteActionCompatParcelizer();
        qBankPlayViewModel.IconCompatParcelizer(new getAddress3.write(str, i, getaddress4 != null ? getaddress4.write() : -1));
        qBankMcqViewModel.IconCompatParcelizer(i);
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesCompatParcelizer(_handleOddName _handleoddname, List list, String str, zzhs zzhsVar, boolean z, QBankPlayViewModel qBankPlayViewModel, getLocality getlocality, int i, int i2, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape) {
        IconCompatParcelizer(_handleoddname, list, str, zzhsVar, z, qBankPlayViewModel, getlocality, _handleunrecognizedcharacterescape, _appendEscaped.RemoteActionCompatParcelizer(i | 1), i2);
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup RemoteActionCompatParcelizer(String str, int i, zzhs zzhsVar, boolean z, QBankPlayViewModel qBankPlayViewModel, String str2, int i2, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape) {
        AudioAttributesCompatParcelizer(str, i, zzhsVar, z, qBankPlayViewModel, str2, _handleunrecognizedcharacterescape, _appendEscaped.RemoteActionCompatParcelizer(i2 | 1));
        return getShowPopup.INSTANCE;
    }
}
