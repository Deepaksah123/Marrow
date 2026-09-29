package kotlin;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.android.exoplayer2.RendererCapabilities;
import com.marrow.R;
import kotlin.zzll;

/* JADX INFO: loaded from: classes4.dex */
public final class zzlr {
    public static final void write(final zzll zzllVar, final JsonManagedReference jsonManagedReference, final getCreatedOnDateMs<getShowPopup> getcreatedondatems, final getCreatedOnDateMs<getShowPopup> getcreatedondatems2, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, final int i) {
        int i2;
        getShowPopup getshowpopup;
        int i3;
        toMagicModuleMetaRepoModel.write(zzllVar, "");
        toMagicModuleMetaRepoModel.write(jsonManagedReference, "");
        toMagicModuleMetaRepoModel.write(getcreatedondatems, "");
        toMagicModuleMetaRepoModel.write(getcreatedondatems2, "");
        _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescapeWrite = _handleunrecognizedcharacterescape.write(-1876385962);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(zzllVar) : _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(zzllVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(jsonManagedReference) ? 32 : 16;
        }
        if ((i & RendererCapabilities.MODE_SUPPORT_MASK) == 0) {
            i2 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(getcreatedondatems) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(getcreatedondatems2) ? 2048 : 1024;
        }
        if (!_handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer((i2 & 1171) != 1170, i2 & 1)) {
            _handleunrecognizedcharacterescapeWrite.onPrepareFromSearch();
        } else {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(-1876385962, i2, -1, "com.marrow2.ui.schema.detail.ui.SchemaCompleteUiStateNavigationHandlerLayout (SchemaCompleteNavigationHandlerLayout.kt:14)");
            }
            Context context = (Context) _handleunrecognizedcharacterescapeWrite.write(AndroidCompositionLocals_androidKt.IconCompatParcelizer());
            if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(zzllVar, zzll.read.INSTANCE)) {
                _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(-414585462);
                _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatCustomActionResultReceiver();
            } else if (zzllVar instanceof zzll.RemoteActionCompatParcelizer) {
                _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(-414536203);
                getShowPopup getshowpopup2 = getShowPopup.INSTANCE;
                boolean zIconCompatParcelizer = _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(context);
                boolean z = (i2 & 14) == 4 || ((i2 & 8) != 0 && _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(zzllVar));
                boolean z2 = (i2 & 896) == 256;
                AudioAttributesCompatParcelizer audioAttributesCompatParcelizerOnPause = _handleunrecognizedcharacterescapeWrite.onPause();
                if ((z | zIconCompatParcelizer | z2) || audioAttributesCompatParcelizerOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                    audioAttributesCompatParcelizerOnPause = new AudioAttributesCompatParcelizer(context, zzllVar, getcreatedondatems, null);
                    _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(audioAttributesCompatParcelizerOnPause);
                }
                StreamReadException.IconCompatParcelizer(getshowpopup2, (MagicModuleSubmissionRequestBody) audioAttributesCompatParcelizerOnPause, _handleunrecognizedcharacterescapeWrite, 6);
                _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatCustomActionResultReceiver();
            } else {
                if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(zzllVar, zzll.IconCompatParcelizer.INSTANCE)) {
                    _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(679362188);
                    _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatCustomActionResultReceiver();
                    throw new RenewEligibleCreator();
                }
                _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(-414321497);
                String str = singleArgCreatorDefaultsToProperties.read(R.string.app_error_no_internet, _handleunrecognizedcharacterescapeWrite, 6);
                String str2 = singleArgCreatorDefaultsToProperties.read(R.string.btn_retry, _handleunrecognizedcharacterescapeWrite, 6);
                getShowPopup getshowpopup3 = getShowPopup.INSTANCE;
                boolean z3 = (i2 & 112) == 32;
                boolean zAudioAttributesCompatParcelizer = _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(str);
                boolean zAudioAttributesCompatParcelizer2 = _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(str2);
                boolean z4 = (i2 & 7168) == 2048;
                boolean z5 = (i2 & 896) == 256;
                IconCompatParcelizer iconCompatParcelizerOnPause = _handleunrecognizedcharacterescapeWrite.onPause();
                if (((z3 | zAudioAttributesCompatParcelizer | zAudioAttributesCompatParcelizer2 | z4) || z5) || iconCompatParcelizerOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                    getshowpopup = getshowpopup3;
                    i3 = 6;
                    iconCompatParcelizerOnPause = new IconCompatParcelizer(jsonManagedReference, str, str2, getcreatedondatems2, getcreatedondatems, null);
                    _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(iconCompatParcelizerOnPause);
                } else {
                    getshowpopup = getshowpopup3;
                    i3 = 6;
                }
                StreamReadException.IconCompatParcelizer(getshowpopup, (MagicModuleSubmissionRequestBody) iconCompatParcelizerOnPause, _handleunrecognizedcharacterescapeWrite, i3);
                _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatCustomActionResultReceiver();
            }
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        releaseNameCopyBuffer releasenamecopybufferMediaBrowserCompatSearchResultReceiver = _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatSearchResultReceiver();
        if (releasenamecopybufferMediaBrowserCompatSearchResultReceiver != null) {
            releasenamecopybufferMediaBrowserCompatSearchResultReceiver.read(new MagicModuleSubmissionRequestBody() { // from class: o.zzlx
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return zzlr.IconCompatParcelizer(zzllVar, jsonManagedReference, getcreatedondatems, getcreatedondatems2, i, (_handleUnrecognizedCharacterEscape) obj);
                }
            });
        }
    }

    static final class AudioAttributesCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private /* synthetic */ zzll AudioAttributesCompatParcelizer;
        private /* synthetic */ getCreatedOnDateMs<getShowPopup> IconCompatParcelizer;
        private int RemoteActionCompatParcelizer;
        private /* synthetic */ Context write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            getYear.IconCompatParcelizer();
            SdkPayloadData.IconCompatParcelizer(obj);
            CmcdConfigurationRequestConfig.read(this.write, ((zzll.RemoteActionCompatParcelizer) this.AudioAttributesCompatParcelizer).write(), 0);
            this.IconCompatParcelizer.invoke();
            return getShowPopup.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AudioAttributesCompatParcelizer(Context context, zzll zzllVar, getCreatedOnDateMs<getShowPopup> getcreatedondatems, SampleVideos<? super AudioAttributesCompatParcelizer> sampleVideos) {
            super(2, sampleVideos);
            this.write = context;
            this.AudioAttributesCompatParcelizer = zzllVar;
            this.IconCompatParcelizer = getcreatedondatems;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return new AudioAttributesCompatParcelizer(this.write, this.AudioAttributesCompatParcelizer, this.IconCompatParcelizer, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AudioAttributesCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    static final class IconCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private /* synthetic */ String AudioAttributesCompatParcelizer;
        private /* synthetic */ getCreatedOnDateMs<getShowPopup> IconCompatParcelizer;
        private int MediaBrowserCompatItemReceiver;
        private /* synthetic */ JsonManagedReference RemoteActionCompatParcelizer;
        private /* synthetic */ getCreatedOnDateMs<getShowPopup> read;
        private /* synthetic */ String write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.MediaBrowserCompatItemReceiver;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.MediaBrowserCompatItemReceiver = 1;
                obj = this.RemoteActionCompatParcelizer.getAudioAttributesCompatParcelizer().RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, this.write, JsonPropertyDescription.read, this);
                if (obj == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            if (((JsonTypeName) obj) == JsonTypeName.IconCompatParcelizer) {
                this.read.invoke();
            }
            this.IconCompatParcelizer.invoke();
            return getShowPopup.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IconCompatParcelizer(JsonManagedReference jsonManagedReference, String str, String str2, getCreatedOnDateMs<getShowPopup> getcreatedondatems, getCreatedOnDateMs<getShowPopup> getcreatedondatems2, SampleVideos<? super IconCompatParcelizer> sampleVideos) {
            super(2, sampleVideos);
            this.RemoteActionCompatParcelizer = jsonManagedReference;
            this.AudioAttributesCompatParcelizer = str;
            this.write = str2;
            this.read = getcreatedondatems;
            this.IconCompatParcelizer = getcreatedondatems2;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return new IconCompatParcelizer(this.RemoteActionCompatParcelizer, this.AudioAttributesCompatParcelizer, this.write, this.read, this.IconCompatParcelizer, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((IconCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup IconCompatParcelizer(zzll zzllVar, JsonManagedReference jsonManagedReference, getCreatedOnDateMs getcreatedondatems, getCreatedOnDateMs getcreatedondatems2, int i, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape) {
        write(zzllVar, jsonManagedReference, getcreatedondatems, getcreatedondatems2, _handleunrecognizedcharacterescape, _appendEscaped.RemoteActionCompatParcelizer(i | 1));
        return getShowPopup.INSTANCE;
    }
}
