package kotlin;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.android.exoplayer2.RendererCapabilities;
import kotlin.zzht;

/* JADX INFO: loaded from: classes4.dex */
public final class setMaskXPercentage {
    public static final void write(_handleOddName _handleoddname, final zzht zzhtVar, final getCreatedOnDateMs<getShowPopup> getcreatedondatems, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, final int i, final int i2) {
        int i3;
        toMagicModuleMetaRepoModel.write(zzhtVar, "");
        toMagicModuleMetaRepoModel.write(getcreatedondatems, "");
        _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescapeWrite = _handleunrecognizedcharacterescape.write(-371471610);
        if ((i & 48) == 0) {
            i3 = (_handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(zzhtVar) ? 32 : 16) | i;
        } else {
            i3 = i;
        }
        if ((i & RendererCapabilities.MODE_SUPPORT_MASK) == 0) {
            i3 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(getcreatedondatems) ? 256 : 128;
        }
        if (!_handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer((i3 & 145) != 144, i3 & 1)) {
            _handleunrecognizedcharacterescapeWrite.onPrepareFromSearch();
        } else {
            if ((i2 & 1) != 0) {
                _handleoddname = _handleOddName.INSTANCE;
            }
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(-371471610, i3, -1, "com.marrow2.ui.test.testReview.ui.ReviewNavigationHandler (ReviewNavigationHandler.kt:14)");
            }
            if (zzhtVar instanceof zzht.AudioAttributesCompatParcelizer) {
                _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(1620223822);
                Context context = (Context) _handleunrecognizedcharacterescapeWrite.write(AndroidCompositionLocals_androidKt.IconCompatParcelizer());
                getShowPopup getshowpopup = getShowPopup.INSTANCE;
                boolean zIconCompatParcelizer = _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(context);
                boolean z = (i3 & 112) == 32;
                boolean z2 = (i3 & 896) == 256;
                IconCompatParcelizer iconCompatParcelizerOnPause = _handleunrecognizedcharacterescapeWrite.onPause();
                if ((z | zIconCompatParcelizer | z2) || iconCompatParcelizerOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                    iconCompatParcelizerOnPause = new IconCompatParcelizer(context, zzhtVar, getcreatedondatems, null);
                    _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(iconCompatParcelizerOnPause);
                }
                StreamReadException.IconCompatParcelizer(getshowpopup, (MagicModuleSubmissionRequestBody) iconCompatParcelizerOnPause, _handleunrecognizedcharacterescapeWrite, 6);
                _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatCustomActionResultReceiver();
            } else {
                if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(zzhtVar, zzht.write.INSTANCE)) {
                    _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(-501926370);
                    _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatCustomActionResultReceiver();
                    throw new RenewEligibleCreator();
                }
                _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(1620464816);
                _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatCustomActionResultReceiver();
            }
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        final _handleOddName _handleoddname2 = _handleoddname;
        releaseNameCopyBuffer releasenamecopybufferMediaBrowserCompatSearchResultReceiver = _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatSearchResultReceiver();
        if (releasenamecopybufferMediaBrowserCompatSearchResultReceiver != null) {
            releasenamecopybufferMediaBrowserCompatSearchResultReceiver.read(new MagicModuleSubmissionRequestBody() { // from class: o.MaterialCheckBox
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return setMaskXPercentage.IconCompatParcelizer(_handleoddname2, zzhtVar, getcreatedondatems, i, i2, (_handleUnrecognizedCharacterEscape) obj);
                }
            });
        }
    }

    static final class IconCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int AudioAttributesCompatParcelizer;
        private /* synthetic */ getCreatedOnDateMs<getShowPopup> IconCompatParcelizer;
        private /* synthetic */ Context RemoteActionCompatParcelizer;
        private /* synthetic */ zzht read;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            getYear.IconCompatParcelizer();
            SdkPayloadData.IconCompatParcelizer(obj);
            CmcdConfigurationRequestConfig.read(this.RemoteActionCompatParcelizer, ((zzht.AudioAttributesCompatParcelizer) this.read).IconCompatParcelizer(), 0);
            this.IconCompatParcelizer.invoke();
            return getShowPopup.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IconCompatParcelizer(Context context, zzht zzhtVar, getCreatedOnDateMs<getShowPopup> getcreatedondatems, SampleVideos<? super IconCompatParcelizer> sampleVideos) {
            super(2, sampleVideos);
            this.RemoteActionCompatParcelizer = context;
            this.read = zzhtVar;
            this.IconCompatParcelizer = getcreatedondatems;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return new IconCompatParcelizer(this.RemoteActionCompatParcelizer, this.read, this.IconCompatParcelizer, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((IconCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup IconCompatParcelizer(_handleOddName _handleoddname, zzht zzhtVar, getCreatedOnDateMs getcreatedondatems, int i, int i2, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape) {
        write(_handleoddname, zzhtVar, getcreatedondatems, _handleunrecognizedcharacterescape, _appendEscaped.RemoteActionCompatParcelizer(i | 1), i2);
        return getShowPopup.INSTANCE;
    }
}
