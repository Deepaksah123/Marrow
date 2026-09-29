package kotlin;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.zzpu;

/* JADX INFO: loaded from: classes4.dex */
public final class zzqc {
    public static final void RemoteActionCompatParcelizer(final zzpu zzpuVar, final getCreatedOnDateMs<getShowPopup> getcreatedondatems, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, final int i) {
        int i2;
        toMagicModuleMetaRepoModel.write(zzpuVar, "");
        toMagicModuleMetaRepoModel.write(getcreatedondatems, "");
        _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescapeWrite = _handleunrecognizedcharacterescape.write(1258210193);
        if ((i & 6) == 0) {
            i2 = (_handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(zzpuVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(getcreatedondatems) ? 32 : 16;
        }
        if (!_handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer((i2 & 19) != 18, i2 & 1)) {
            _handleunrecognizedcharacterescapeWrite.onPrepareFromSearch();
        } else {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(1258210193, i2, -1, "com.marrow2.ui.schema.listing.ui.SchemaListNavigationHandlerLayout (SchemaListNavigationHandlerLayout.kt:10)");
            }
            Context context = (Context) _handleunrecognizedcharacterescapeWrite.write(AndroidCompositionLocals_androidKt.IconCompatParcelizer());
            if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(zzpuVar, zzpu.write.INSTANCE)) {
                _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(1160453039);
                _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatCustomActionResultReceiver();
            } else {
                if (!(zzpuVar instanceof zzpu.AudioAttributesCompatParcelizer)) {
                    _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(-2040777425);
                    _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatCustomActionResultReceiver();
                    throw new RenewEligibleCreator();
                }
                _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(1160502298);
                getShowPopup getshowpopup = getShowPopup.INSTANCE;
                boolean zIconCompatParcelizer = _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(context);
                boolean z = (i2 & 14) == 4;
                boolean z2 = (i2 & 112) == 32;
                AudioAttributesCompatParcelizer audioAttributesCompatParcelizerOnPause = _handleunrecognizedcharacterescapeWrite.onPause();
                if ((z | zIconCompatParcelizer | z2) || audioAttributesCompatParcelizerOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                    audioAttributesCompatParcelizerOnPause = new AudioAttributesCompatParcelizer(context, zzpuVar, getcreatedondatems, null);
                    _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(audioAttributesCompatParcelizerOnPause);
                }
                StreamReadException.IconCompatParcelizer(getshowpopup, (MagicModuleSubmissionRequestBody) audioAttributesCompatParcelizerOnPause, _handleunrecognizedcharacterescapeWrite, 6);
                _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatCustomActionResultReceiver();
            }
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        releaseNameCopyBuffer releasenamecopybufferMediaBrowserCompatSearchResultReceiver = _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatSearchResultReceiver();
        if (releasenamecopybufferMediaBrowserCompatSearchResultReceiver != null) {
            releasenamecopybufferMediaBrowserCompatSearchResultReceiver.read(new MagicModuleSubmissionRequestBody() { // from class: o.zzqk
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return zzqc.IconCompatParcelizer(zzpuVar, getcreatedondatems, i, (_handleUnrecognizedCharacterEscape) obj);
                }
            });
        }
    }

    static final class AudioAttributesCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int AudioAttributesCompatParcelizer;
        private /* synthetic */ Context IconCompatParcelizer;
        private /* synthetic */ getCreatedOnDateMs<getShowPopup> RemoteActionCompatParcelizer;
        private /* synthetic */ zzpu write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            getYear.IconCompatParcelizer();
            SdkPayloadData.IconCompatParcelizer(obj);
            CmcdConfigurationRequestConfig.read(this.IconCompatParcelizer, ((zzpu.AudioAttributesCompatParcelizer) this.write).write(), 0);
            this.RemoteActionCompatParcelizer.invoke();
            return getShowPopup.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AudioAttributesCompatParcelizer(Context context, zzpu zzpuVar, getCreatedOnDateMs<getShowPopup> getcreatedondatems, SampleVideos<? super AudioAttributesCompatParcelizer> sampleVideos) {
            super(2, sampleVideos);
            this.IconCompatParcelizer = context;
            this.write = zzpuVar;
            this.RemoteActionCompatParcelizer = getcreatedondatems;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return new AudioAttributesCompatParcelizer(this.IconCompatParcelizer, this.write, this.RemoteActionCompatParcelizer, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AudioAttributesCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup IconCompatParcelizer(zzpu zzpuVar, getCreatedOnDateMs getcreatedondatems, int i, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape) {
        RemoteActionCompatParcelizer(zzpuVar, getcreatedondatems, _handleunrecognizedcharacterescape, _appendEscaped.RemoteActionCompatParcelizer(i | 1));
        return getShowPopup.INSTANCE;
    }
}
