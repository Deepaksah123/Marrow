package kotlin;

import android.content.Context;
import android.os.Bundle;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.android.exoplayer2.RendererCapabilities;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.marrow.R;
import com.marrow.designsystem.theme.AppTheme;
import com.marrow.designsystem.theme.ThemeKt;
import com.marrow2.ui.pearl.viewmodel.PearlDetailInnerViewModel;
import java.util.List;
import kotlin.CeaDecoderExternalSyntheticLambda0;
import kotlin._skipWSOrEnd;
import kotlin.buildCacheKey;
import kotlin.withFieldVisibility;
import org.apache.commons.compress.archivers.cpio.CpioConstants;

/* JADX INFO: loaded from: classes3.dex */
public final class ModuleInstallRequest {
    public static final void AudioAttributesCompatParcelizer(final _handleOddName _handleoddname, final String str, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, final int i, final int i2) {
        int i3;
        withFieldVisibility.write defaultViewModelCreationExtras;
        toMagicModuleMetaRepoModel.write(str, "");
        _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescapeWrite = _handleunrecognizedcharacterescape.write(-1330566864);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (_handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(_handleoddname) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(str) ? 32 : 16;
        }
        if (!_handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer((i3 & 19) != 18, i3 & 1)) {
            _handleunrecognizedcharacterescapeWrite.onPrepareFromSearch();
        } else {
            if (i4 != 0) {
                _handleoddname = _handleOddName.INSTANCE;
            }
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(-1330566864, i3, -1, "com.marrow2.ui.pearl.fragment.PearlContentComposeLayout (PearlDetailContentComposeLayout.kt:46)");
            }
            Bundle bundleWrite = new ConnectionTracker(str, null, 2, null).write();
            JDK14Util jDK14Util = JDK14Util.INSTANCE;
            TypeResolutionContext typeResolutionContextIconCompatParcelizer = JDK14Util.IconCompatParcelizer(_handleunrecognizedcharacterescapeWrite, JDK14Util.write);
            if (typeResolutionContextIconCompatParcelizer == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            Object objOnPause = _handleunrecognizedcharacterescapeWrite.onPause();
            if (objOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                toMagicModuleMetaRepoModel.read(typeResolutionContextIconCompatParcelizer, "");
                objOnPause = new CmcdHeadersFactory((anyExplicitsWithoutIgnoral) typeResolutionContextIconCompatParcelizer, bundleWrite);
                _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(objOnPause);
            }
            CmcdHeadersFactory cmcdHeadersFactory = (CmcdHeadersFactory) objOnPause;
            if (cmcdHeadersFactory instanceof anyExplicitsWithoutIgnoral) {
                defaultViewModelCreationExtras = cmcdHeadersFactory.getDefaultViewModelCreationExtras();
            } else {
                defaultViewModelCreationExtras = withFieldVisibility.write.INSTANCE;
            }
            final PearlDetailInnerViewModel pearlDetailInnerViewModel = (PearlDetailInnerViewModel) JDK14UtilRawTypeName.IconCompatParcelizer(toMagicModuleMetaDataUcModel.write(PearlDetailInnerViewModel.class), cmcdHeadersFactory, str, defaultViewModelCreationExtras, _handleunrecognizedcharacterescapeWrite, (((((i3 >> 3) & 14) << 3) & 112) << 3) & 896);
            Object[] objArr = new Object[0];
            Object objOnPause2 = _handleunrecognizedcharacterescapeWrite.onPause();
            if (objOnPause2 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause2 = new getCreatedOnDateMs() { // from class: o.installModules
                    @Override // kotlin.getCreatedOnDateMs
                    public final Object invoke() {
                        return ModuleInstallRequest.RemoteActionCompatParcelizer();
                    }
                };
                _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(objOnPause2);
            }
            final InputAccessor inputAccessor = (InputAccessor) addTimesI.read(objArr, (getCreatedOnDateMs) objOnPause2, _handleunrecognizedcharacterescapeWrite, 48);
            ThemeKt.read((AppTheme) null, false, (MagicModuleSubmissionRequestBody<? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup>) multiplyFft.AudioAttributesCompatParcelizer(-429924688, true, new MagicModuleSubmissionRequestBody() { // from class: o.ModuleInstallIntentResponse
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return ModuleInstallRequest.write(pearlDetailInnerViewModel, inputAccessor, _handleoddname, (_handleUnrecognizedCharacterEscape) obj, ((Integer) obj2).intValue());
                }
            }, _handleunrecognizedcharacterescapeWrite, 54), _handleunrecognizedcharacterescapeWrite, RendererCapabilities.MODE_SUPPORT_MASK, 3);
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        releaseNameCopyBuffer releasenamecopybufferMediaBrowserCompatSearchResultReceiver = _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatSearchResultReceiver();
        if (releasenamecopybufferMediaBrowserCompatSearchResultReceiver != null) {
            releasenamecopybufferMediaBrowserCompatSearchResultReceiver.read(new MagicModuleSubmissionRequestBody() { // from class: o.getInstallModulesIntent
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return ModuleInstallRequest.AudioAttributesCompatParcelizer(_handleoddname, str, i, i2, (_handleUnrecognizedCharacterEscape) obj);
                }
            });
        }
    }

    private static final boolean AudioAttributesCompatParcelizer(InputAccessor<Boolean> inputAccessor) {
        return inputAccessor.getRemoteActionCompatParcelizer().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InputAccessor RemoteActionCompatParcelizer() {
        return available.RemoteActionCompatParcelizer$default(Boolean.FALSE, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final getShowPopup write(PearlDetailInnerViewModel pearlDetailInnerViewModel, final InputAccessor inputAccessor, _handleOddName _handleoddname, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        SampleVideos sampleVideos;
        DataSourceBitmapLoaderExternalSyntheticLambda0 dataSourceBitmapLoaderExternalSyntheticLambda0;
        if (!_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer((i & 3) != 2, i & 1)) {
            _handleunrecognizedcharacterescape.onPrepareFromSearch();
        } else {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(-429924688, i, -1, "com.marrow2.ui.pearl.fragment.PearlContentComposeLayout.<anonymous> (PearlDetailContentComposeLayout.kt:50)");
            }
            final Context context = (Context) _handleunrecognizedcharacterescape.write(AndroidCompositionLocals_androidKt.IconCompatParcelizer());
            DataSourceBitmapLoaderExternalSyntheticLambda0 dataSourceBitmapLoaderExternalSyntheticLambda02 = (DataSourceBitmapLoaderExternalSyntheticLambda0) isSetterVisible.RemoteActionCompatParcelizer(pearlDetailInnerViewModel.AudioAttributesImplApi21Parcelizer(), new setStreamingFormat(null, 1, null), _handleunrecognizedcharacterescape, 0).getRemoteActionCompatParcelizer();
            if (dataSourceBitmapLoaderExternalSyntheticLambda02 instanceof decodeBitmap) {
                _handleunrecognizedcharacterescape.IconCompatParcelizer(-293682907);
                if (AudioAttributesCompatParcelizer(inputAccessor)) {
                    _handleunrecognizedcharacterescape.IconCompatParcelizer(-293636593);
                    String str = singleArgCreatorDefaultsToProperties.read(R.string.title_image_citation, _handleunrecognizedcharacterescape, 6);
                    String strMediaBrowserCompatCustomActionResultReceiver = ((StatsEvent) ((decodeBitmap) dataSourceBitmapLoaderExternalSyntheticLambda02).RemoteActionCompatParcelizer()).getIconCompatParcelizer().MediaBrowserCompatCustomActionResultReceiver();
                    String str2 = singleArgCreatorDefaultsToProperties.read(R.string.text_okay, _handleunrecognizedcharacterescape, 6);
                    boolean zAudioAttributesCompatParcelizer = _handleunrecognizedcharacterescape.AudioAttributesCompatParcelizer(inputAccessor);
                    Object objOnPause = _handleunrecognizedcharacterescape.onPause();
                    if (zAudioAttributesCompatParcelizer || objOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                        objOnPause = new getCreatedOnDateMs() { // from class: o.releaseModules
                            @Override // kotlin.getCreatedOnDateMs
                            public final Object invoke() {
                                return ModuleInstallRequest.IconCompatParcelizer(inputAccessor);
                            }
                        };
                        _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause);
                    }
                    getCreatedOnDateMs getcreatedondatems = (getCreatedOnDateMs) objOnPause;
                    boolean zAudioAttributesCompatParcelizer2 = _handleunrecognizedcharacterescape.AudioAttributesCompatParcelizer(inputAccessor);
                    Object objOnPause2 = _handleunrecognizedcharacterescape.onPause();
                    if (zAudioAttributesCompatParcelizer2 || objOnPause2 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                        objOnPause2 = new getCreatedOnDateMs() { // from class: o.ModuleInstallRequestBuilder
                            @Override // kotlin.getCreatedOnDateMs
                            public final Object invoke() {
                                return ModuleInstallRequest.MediaBrowserCompatCustomActionResultReceiver(inputAccessor);
                            }
                        };
                        _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause2);
                    }
                    dataSourceBitmapLoaderExternalSyntheticLambda0 = dataSourceBitmapLoaderExternalSyntheticLambda02;
                    sampleVideos = null;
                    zbd.write((_handleOddName) null, str, strMediaBrowserCompatCustomActionResultReceiver, str2, true, (getCreatedOnDateMs<getShowPopup>) getcreatedondatems, (getCreatedOnDateMs<getShowPopup>) objOnPause2, false, false, _handleunrecognizedcharacterescape, 100687872, TsExtractor.TS_STREAM_TYPE_AC3);
                } else {
                    dataSourceBitmapLoaderExternalSyntheticLambda0 = dataSourceBitmapLoaderExternalSyntheticLambda02;
                    sampleVideos = null;
                    _handleunrecognizedcharacterescape.IconCompatParcelizer(-295932174);
                }
                _handleunrecognizedcharacterescape.MediaBrowserCompatCustomActionResultReceiver();
                decodeBitmap decodebitmap = (decodeBitmap) dataSourceBitmapLoaderExternalSyntheticLambda0;
                StatsEvent statsEvent = (StatsEvent) decodebitmap.RemoteActionCompatParcelizer();
                String audioAttributesCompatParcelizer = ((StatsEvent) decodebitmap.RemoteActionCompatParcelizer()).getAudioAttributesCompatParcelizer();
                boolean zIconCompatParcelizer = _handleunrecognizedcharacterescape.IconCompatParcelizer(context);
                Object objOnPause3 = _handleunrecognizedcharacterescape.onPause();
                if (zIconCompatParcelizer || objOnPause3 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                    objOnPause3 = new getAnswerMap() { // from class: o.getApis
                        @Override // kotlin.getAnswerMap
                        public final Object invoke(Object obj) {
                            return ModuleInstallRequest.write(context, (String) obj);
                        }
                    };
                    _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause3);
                }
                getAnswerMap getanswermap = (getAnswerMap) objOnPause3;
                boolean zAudioAttributesCompatParcelizer3 = _handleunrecognizedcharacterescape.AudioAttributesCompatParcelizer(inputAccessor);
                Object objOnPause4 = _handleunrecognizedcharacterescape.onPause();
                if (zAudioAttributesCompatParcelizer3 || objOnPause4 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                    objOnPause4 = new getCreatedOnDateMs() { // from class: o.newBuilder
                        @Override // kotlin.getCreatedOnDateMs
                        public final Object invoke() {
                            return ModuleInstallRequest.MediaBrowserCompatItemReceiver(inputAccessor);
                        }
                    };
                    _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause4);
                }
                AudioAttributesCompatParcelizer(_handleoddname, statsEvent, audioAttributesCompatParcelizer, (getAnswerMap<? super String, getShowPopup>) getanswermap, (getCreatedOnDateMs<getShowPopup>) objOnPause4, _handleunrecognizedcharacterescape, 0, 0);
                _handleunrecognizedcharacterescape.MediaBrowserCompatCustomActionResultReceiver();
            } else {
                sampleVideos = null;
                _handleunrecognizedcharacterescape.IconCompatParcelizer(-292664464);
                _handleunrecognizedcharacterescape.MediaBrowserCompatCustomActionResultReceiver();
            }
            String str3 = (String) isSetterVisible.RemoteActionCompatParcelizer(pearlDetailInnerViewModel.read(), "", _handleunrecognizedcharacterescape, 48).getRemoteActionCompatParcelizer();
            boolean zAudioAttributesCompatParcelizer4 = _handleunrecognizedcharacterescape.AudioAttributesCompatParcelizer(str3);
            boolean zIconCompatParcelizer2 = _handleunrecognizedcharacterescape.IconCompatParcelizer(context);
            Object objOnPause5 = _handleunrecognizedcharacterescape.onPause();
            if ((zAudioAttributesCompatParcelizer4 | zIconCompatParcelizer2) || objOnPause5 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause5 = (MagicModuleSubmissionRequestBody) new IconCompatParcelizer(str3, context, sampleVideos);
                _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause5);
            }
            StreamReadException.IconCompatParcelizer(str3, (MagicModuleSubmissionRequestBody) objOnPause5, _handleunrecognizedcharacterescape, 0);
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup IconCompatParcelizer(InputAccessor inputAccessor) {
        RemoteActionCompatParcelizer((InputAccessor<Boolean>) inputAccessor, false);
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup MediaBrowserCompatCustomActionResultReceiver(InputAccessor inputAccessor) {
        RemoteActionCompatParcelizer((InputAccessor<Boolean>) inputAccessor, false);
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup write(Context context, String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        CeaDecoderExternalSyntheticLambda0.Companion companion = CeaDecoderExternalSyntheticLambda0.INSTANCE;
        context.startActivity(CeaDecoderExternalSyntheticLambda0.Companion.RemoteActionCompatParcelizer(context, str));
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup MediaBrowserCompatItemReceiver(InputAccessor inputAccessor) {
        RemoteActionCompatParcelizer((InputAccessor<Boolean>) inputAccessor, true);
        return getShowPopup.INSTANCE;
    }

    static final class IconCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int AudioAttributesCompatParcelizer;
        private /* synthetic */ Context RemoteActionCompatParcelizer;
        private /* synthetic */ String write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            getYear.IconCompatParcelizer();
            SdkPayloadData.IconCompatParcelizer(obj);
            if (this.write.length() > 0) {
                CmcdConfigurationRequestConfig.read(this.RemoteActionCompatParcelizer, this.write, 0);
            }
            return getShowPopup.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IconCompatParcelizer(String str, Context context, SampleVideos<? super IconCompatParcelizer> sampleVideos) {
            super(2, sampleVideos);
            this.write = str;
            this.RemoteActionCompatParcelizer = context;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return new IconCompatParcelizer(this.write, this.RemoteActionCompatParcelizer, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((IconCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private static void AudioAttributesCompatParcelizer(_handleOddName _handleoddname, final StatsEvent statsEvent, final String str, final getAnswerMap<? super String, getShowPopup> getanswermap, final getCreatedOnDateMs<getShowPopup> getcreatedondatems, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, final int i, final int i2) {
        _handleOddName _handleoddname2;
        int i3;
        _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape2;
        _handleOddName _handleoddname3;
        toMagicModuleMetaRepoModel.write(statsEvent, "");
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(getanswermap, "");
        toMagicModuleMetaRepoModel.write(getcreatedondatems, "");
        _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescapeWrite = _handleunrecognizedcharacterescape.write(1064125606);
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
            i3 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(statsEvent) ? 32 : 16;
        }
        if ((i & RendererCapabilities.MODE_SUPPORT_MASK) == 0) {
            i3 |= _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(str) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(getanswermap) ? 2048 : 1024;
        }
        if ((i & CpioConstants.C_ISBLK) == 0) {
            i3 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(getcreatedondatems) ? 16384 : 8192;
        }
        if (!_handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer((i3 & 9363) != 9362, i3 & 1)) {
            _handleunrecognizedcharacterescape2 = _handleunrecognizedcharacterescapeWrite;
            _handleunrecognizedcharacterescape2.onPrepareFromSearch();
            _handleoddname3 = _handleoddname2;
        } else {
            _handleOddName _handleoddname4 = i4 != 0 ? _handleOddName.INSTANCE : _handleoddname2;
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(1064125606, i3, -1, "com.marrow2.ui.pearl.fragment.RenderPearlDetail (PearlDetailContentComposeLayout.kt:94)");
            }
            withTypeHandler withtypehandlerWrite = AbsSavedState1.write(_skipWSOrEnd.INSTANCE.MediaBrowserCompatSearchResultReceiver(), false);
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
            _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape3 = NumberOutput.read(_handleunrecognizedcharacterescapeWrite);
            NumberOutput.write(_handleunrecognizedcharacterescape3, withtypehandlerWrite, getDependencies.INSTANCE.AudioAttributesImplBaseParcelizer());
            NumberOutput.write(_handleunrecognizedcharacterescape3, _getchardescHandleMediaPlayPauseIfPendingOnHandler, getDependencies.INSTANCE.MediaBrowserCompatItemReceiver());
            NumberOutput.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape3, Integer.valueOf(iHashCode), getDependencies.INSTANCE.AudioAttributesCompatParcelizer());
            NumberOutput.write(_handleunrecognizedcharacterescape3, getDependencies.INSTANCE.write());
            NumberOutput.write(_handleunrecognizedcharacterescape3, _handleoddnameRemoteActionCompatParcelizer, getDependencies.INSTANCE.MediaBrowserCompatCustomActionResultReceiver());
            setDrawerElevation setdrawerelevation = setDrawerElevation.INSTANCE;
            withTypeHandler withtypehandler = setValue.read(WindowInsetsCompatImpl30.INSTANCE.MediaBrowserCompatCustomActionResultReceiver(), _skipWSOrEnd.INSTANCE.RatingCompat(), _handleunrecognizedcharacterescapeWrite, 0);
            int iHashCode2 = Long.hashCode(_getBigDecimal.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, 0));
            _getCharDesc _getchardescHandleMediaPlayPauseIfPendingOnHandler2 = _handleunrecognizedcharacterescapeWrite.handleMediaPlayPauseIfPendingOnHandler();
            _handleOddName _handleoddnameRemoteActionCompatParcelizer2 = _verifyNLZ2.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, _handleoddname4);
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
            _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape4 = NumberOutput.read(_handleunrecognizedcharacterescapeWrite);
            NumberOutput.write(_handleunrecognizedcharacterescape4, withtypehandler, getDependencies.INSTANCE.AudioAttributesImplBaseParcelizer());
            NumberOutput.write(_handleunrecognizedcharacterescape4, _getchardescHandleMediaPlayPauseIfPendingOnHandler2, getDependencies.INSTANCE.MediaBrowserCompatItemReceiver());
            NumberOutput.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape4, Integer.valueOf(iHashCode2), getDependencies.INSTANCE.AudioAttributesCompatParcelizer());
            NumberOutput.write(_handleunrecognizedcharacterescape4, getDependencies.INSTANCE.write());
            NumberOutput.write(_handleunrecognizedcharacterescape4, _handleoddnameRemoteActionCompatParcelizer2, getDependencies.INSTANCE.MediaBrowserCompatCustomActionResultReceiver());
            DrawerLayoutSavedState drawerLayoutSavedState = DrawerLayoutSavedState.INSTANCE;
            resetAnalyticsData.IconCompatParcelizer(null, statsEvent.getIconCompatParcelizer().MediaDescriptionCompat(), statsEvent.getAudioAttributesCompatParcelizer(), statsEvent.getIconCompatParcelizer().read(), statsEvent.getRead(), statsEvent.getMediaBrowserCompatCustomActionResultReceiver(), statsEvent.getWrite(), statsEvent.getRemoteActionCompatParcelizer(), statsEvent.getIconCompatParcelizer().AudioAttributesImplApi21Parcelizer(), statsEvent.getIconCompatParcelizer().write(), statsEvent.getIconCompatParcelizer().AudioAttributesImplBaseParcelizer(), getanswermap, statsEvent.getIconCompatParcelizer().MediaBrowserCompatSearchResultReceiver(), getcreatedondatems, _handleunrecognizedcharacterescapeWrite, 0, ((i3 >> 6) & 112) | ((i3 >> 3) & 7168), 1);
            isInLayout.RemoteActionCompatParcelizer(isAdded.AudioAttributesCompatParcelizer(_handleOddName.INSTANCE, assignParameter.IconCompatParcelizer(8.0f)), _handleunrecognizedcharacterescapeWrite, 6);
            _handleOddName _handleoddnameIconCompatParcelizer$default = isAdded.IconCompatParcelizer$default((_handleOddName) _handleOddName.INSTANCE, (_skipWSOrEnd.read) null, false, 3, (Object) null);
            List<buildCacheKey.IconCompatParcelizer> listRemoteActionCompatParcelizer = statsEvent.getIconCompatParcelizer().RemoteActionCompatParcelizer();
            Object objOnPause = _handleunrecognizedcharacterescapeWrite.onPause();
            if (objOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause = new getCreatedOnDateMs() { // from class: o.getListener
                    @Override // kotlin.getCreatedOnDateMs
                    public final Object invoke() {
                        return ModuleInstallRequest.read();
                    }
                };
                _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(objOnPause);
            }
            _handleoddname3 = _handleoddname4;
            _handleunrecognizedcharacterescape2 = _handleunrecognizedcharacterescapeWrite;
            getCachedAppInstanceId.read(_handleoddnameIconCompatParcelizer$default, listRemoteActionCompatParcelizer, str, false, (getCreatedOnDateMs) objOnPause, _handleunrecognizedcharacterescapeWrite, (i3 & 896) | 27654, 0);
            _handleunrecognizedcharacterescape2.AudioAttributesImplBaseParcelizer();
            _handleunrecognizedcharacterescape2.AudioAttributesImplBaseParcelizer();
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        releaseNameCopyBuffer releasenamecopybufferMediaBrowserCompatSearchResultReceiver = _handleunrecognizedcharacterescape2.MediaBrowserCompatSearchResultReceiver();
        if (releasenamecopybufferMediaBrowserCompatSearchResultReceiver != null) {
            final _handleOddName _handleoddname5 = _handleoddname3;
            releasenamecopybufferMediaBrowserCompatSearchResultReceiver.read(new MagicModuleSubmissionRequestBody() { // from class: o.getListenerExecutor
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return ModuleInstallRequest.AudioAttributesCompatParcelizer(_handleoddname5, statsEvent, str, getanswermap, getcreatedondatems, i, i2, (_handleUnrecognizedCharacterEscape) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read() {
        return getShowPopup.INSTANCE;
    }

    private static final void RemoteActionCompatParcelizer(InputAccessor<Boolean> inputAccessor, boolean z) {
        inputAccessor.write(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesCompatParcelizer(_handleOddName _handleoddname, String str, int i, int i2, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape) {
        AudioAttributesCompatParcelizer(_handleoddname, str, _handleunrecognizedcharacterescape, _appendEscaped.RemoteActionCompatParcelizer(i | 1), i2);
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesCompatParcelizer(_handleOddName _handleoddname, StatsEvent statsEvent, String str, getAnswerMap getanswermap, getCreatedOnDateMs getcreatedondatems, int i, int i2, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape) {
        AudioAttributesCompatParcelizer(_handleoddname, statsEvent, str, (getAnswerMap<? super String, getShowPopup>) getanswermap, (getCreatedOnDateMs<getShowPopup>) getcreatedondatems, _handleunrecognizedcharacterescape, _appendEscaped.RemoteActionCompatParcelizer(i | 1), i2);
        return getShowPopup.INSTANCE;
    }
}
