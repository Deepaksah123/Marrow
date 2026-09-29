package kotlin;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.android.exoplayer2.RendererCapabilities;
import com.marrow.R;
import kotlin.zznt;

/* JADX INFO: loaded from: classes4.dex */
public final class zzol {
    public static final void write(final zznt zzntVar, final JsonManagedReference jsonManagedReference, final getCreatedOnDateMs<getShowPopup> getcreatedondatems, final getCreatedOnDateMs<getShowPopup> getcreatedondatems2, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, final int i) {
        int i2;
        getShowPopup getshowpopup;
        int i3;
        toMagicModuleMetaRepoModel.write(zzntVar, "");
        toMagicModuleMetaRepoModel.write(jsonManagedReference, "");
        toMagicModuleMetaRepoModel.write(getcreatedondatems, "");
        toMagicModuleMetaRepoModel.write(getcreatedondatems2, "");
        _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescapeWrite = _handleunrecognizedcharacterescape.write(-1975800951);
        if ((i & 6) == 0) {
            i2 = (_handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(zzntVar) ? 4 : 2) | i;
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
                _validJsonValueList.AudioAttributesCompatParcelizer(-1975800951, i2, -1, "com.marrow2.ui.schema.incomplete.ui.SchemaIncompleteUiStateNavigationHandlerLayout (SchemaIncompleteNavigationHandlerLayout.kt:14)");
            }
            Context context = (Context) _handleunrecognizedcharacterescapeWrite.write(AndroidCompositionLocals_androidKt.IconCompatParcelizer());
            if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(zzntVar, zznt.AudioAttributesCompatParcelizer.INSTANCE)) {
                _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(1440911479);
                _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatCustomActionResultReceiver();
            } else if (zzntVar instanceof zznt.RemoteActionCompatParcelizer) {
                _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(1440960738);
                getShowPopup getshowpopup2 = getShowPopup.INSTANCE;
                boolean zIconCompatParcelizer = _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(context);
                boolean z = (i2 & 14) == 4;
                boolean z2 = (i2 & 896) == 256;
                read readVarOnPause = _handleunrecognizedcharacterescapeWrite.onPause();
                if ((z | zIconCompatParcelizer | z2) || readVarOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                    readVarOnPause = new read(context, zzntVar, getcreatedondatems, null);
                    _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(readVarOnPause);
                }
                StreamReadException.IconCompatParcelizer(getshowpopup2, (MagicModuleSubmissionRequestBody) readVarOnPause, _handleunrecognizedcharacterescapeWrite, 6);
                _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatCustomActionResultReceiver();
            } else {
                if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(zzntVar, zznt.write.INSTANCE)) {
                    _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(-369161733);
                    _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatCustomActionResultReceiver();
                    throw new RenewEligibleCreator();
                }
                _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(1441171476);
                String str = singleArgCreatorDefaultsToProperties.read(R.string.app_error_no_internet, _handleunrecognizedcharacterescapeWrite, 6);
                String str2 = singleArgCreatorDefaultsToProperties.read(R.string.btn_retry, _handleunrecognizedcharacterescapeWrite, 6);
                getShowPopup getshowpopup3 = getShowPopup.INSTANCE;
                boolean z3 = (i2 & 112) == 32;
                boolean zAudioAttributesCompatParcelizer = _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(str);
                boolean zAudioAttributesCompatParcelizer2 = _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(str2);
                boolean z4 = (i2 & 7168) == 2048;
                boolean z5 = (i2 & 896) == 256;
                RemoteActionCompatParcelizer remoteActionCompatParcelizerOnPause = _handleunrecognizedcharacterescapeWrite.onPause();
                if (((z3 | zAudioAttributesCompatParcelizer | zAudioAttributesCompatParcelizer2 | z4) || z5) || remoteActionCompatParcelizerOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                    getshowpopup = getshowpopup3;
                    i3 = 6;
                    remoteActionCompatParcelizerOnPause = new RemoteActionCompatParcelizer(jsonManagedReference, str, str2, getcreatedondatems2, getcreatedondatems, null);
                    _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(remoteActionCompatParcelizerOnPause);
                } else {
                    getshowpopup = getshowpopup3;
                    i3 = 6;
                }
                StreamReadException.IconCompatParcelizer(getshowpopup, (MagicModuleSubmissionRequestBody) remoteActionCompatParcelizerOnPause, _handleunrecognizedcharacterescapeWrite, i3);
                _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatCustomActionResultReceiver();
            }
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        releaseNameCopyBuffer releasenamecopybufferMediaBrowserCompatSearchResultReceiver = _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatSearchResultReceiver();
        if (releasenamecopybufferMediaBrowserCompatSearchResultReceiver != null) {
            releasenamecopybufferMediaBrowserCompatSearchResultReceiver.read(new MagicModuleSubmissionRequestBody() { // from class: o.zzom
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return zzol.read(zzntVar, jsonManagedReference, getcreatedondatems, getcreatedondatems2, i, (_handleUnrecognizedCharacterEscape) obj);
                }
            });
        }
    }

    static final class read extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int AudioAttributesCompatParcelizer;
        private /* synthetic */ zznt IconCompatParcelizer;
        private /* synthetic */ Context RemoteActionCompatParcelizer;
        private /* synthetic */ getCreatedOnDateMs<getShowPopup> write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            getYear.IconCompatParcelizer();
            SdkPayloadData.IconCompatParcelizer(obj);
            CmcdConfigurationRequestConfig.read(this.RemoteActionCompatParcelizer, ((zznt.RemoteActionCompatParcelizer) this.IconCompatParcelizer).RemoteActionCompatParcelizer(), 0);
            this.write.invoke();
            return getShowPopup.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        read(Context context, zznt zzntVar, getCreatedOnDateMs<getShowPopup> getcreatedondatems, SampleVideos<? super read> sampleVideos) {
            super(2, sampleVideos);
            this.RemoteActionCompatParcelizer = context;
            this.IconCompatParcelizer = zzntVar;
            this.write = getcreatedondatems;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return new read(this.RemoteActionCompatParcelizer, this.IconCompatParcelizer, this.write, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((read) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    static final class RemoteActionCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private /* synthetic */ String AudioAttributesCompatParcelizer;
        private int AudioAttributesImplApi26Parcelizer;
        private /* synthetic */ getCreatedOnDateMs<getShowPopup> IconCompatParcelizer;
        private /* synthetic */ String RemoteActionCompatParcelizer;
        private /* synthetic */ JsonManagedReference read;
        private /* synthetic */ getCreatedOnDateMs<getShowPopup> write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.AudioAttributesImplApi26Parcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.AudioAttributesImplApi26Parcelizer = 1;
                obj = this.read.getAudioAttributesCompatParcelizer().RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, this.AudioAttributesCompatParcelizer, JsonPropertyDescription.read, this);
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
                this.write.invoke();
            }
            this.IconCompatParcelizer.invoke();
            return getShowPopup.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        RemoteActionCompatParcelizer(JsonManagedReference jsonManagedReference, String str, String str2, getCreatedOnDateMs<getShowPopup> getcreatedondatems, getCreatedOnDateMs<getShowPopup> getcreatedondatems2, SampleVideos<? super RemoteActionCompatParcelizer> sampleVideos) {
            super(2, sampleVideos);
            this.read = jsonManagedReference;
            this.RemoteActionCompatParcelizer = str;
            this.AudioAttributesCompatParcelizer = str2;
            this.write = getcreatedondatems;
            this.IconCompatParcelizer = getcreatedondatems2;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return new RemoteActionCompatParcelizer(this.read, this.RemoteActionCompatParcelizer, this.AudioAttributesCompatParcelizer, this.write, this.IconCompatParcelizer, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((RemoteActionCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(zznt zzntVar, JsonManagedReference jsonManagedReference, getCreatedOnDateMs getcreatedondatems, getCreatedOnDateMs getcreatedondatems2, int i, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape) {
        write(zzntVar, jsonManagedReference, getcreatedondatems, getcreatedondatems2, _handleunrecognizedcharacterescape, _appendEscaped.RemoteActionCompatParcelizer(i | 1));
        return getShowPopup.INSTANCE;
    }
}
