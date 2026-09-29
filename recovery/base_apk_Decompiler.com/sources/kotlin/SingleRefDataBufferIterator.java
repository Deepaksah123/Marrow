package kotlin;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.core.view.WindowInsetsCompat;
import androidx.media3.exoplayer.ExoPlayer;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.RendererCapabilities;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import org.apache.commons.compress.archivers.cpio.CpioConstants;

/* JADX INFO: loaded from: classes3.dex */
public final class SingleRefDataBufferIterator {
    public static final void AudioAttributesCompatParcelizer(final ExoPlayer exoPlayer, final String str, final ClientSettings clientSettings, final getCreatedOnDateMs<Long> getcreatedondatems, final getCreatedOnDateMs<Long> getcreatedondatems2, final getCreatedOnDateMs<getShowPopup> getcreatedondatems3, final getCreatedOnDateMs<getShowPopup> getcreatedondatems4, final getCreatedOnDateMs<getShowPopup> getcreatedondatems5, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, final int i) {
        int i2;
        _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape2;
        toMagicModuleMetaRepoModel.write(exoPlayer, "");
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(clientSettings, "");
        toMagicModuleMetaRepoModel.write(getcreatedondatems, "");
        toMagicModuleMetaRepoModel.write(getcreatedondatems2, "");
        toMagicModuleMetaRepoModel.write(getcreatedondatems3, "");
        toMagicModuleMetaRepoModel.write(getcreatedondatems4, "");
        toMagicModuleMetaRepoModel.write(getcreatedondatems5, "");
        _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescapeWrite = _handleunrecognizedcharacterescape.write(-186191118);
        if ((i & 6) == 0) {
            i2 = (_handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(exoPlayer) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(str) ? 32 : 16;
        }
        if ((i & RendererCapabilities.MODE_SUPPORT_MASK) == 0) {
            i2 |= _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(clientSettings.ordinal()) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(getcreatedondatems) ? 2048 : 1024;
        }
        if ((i & CpioConstants.C_ISBLK) == 0) {
            i2 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(getcreatedondatems2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(getcreatedondatems3) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE;
        }
        if ((1572864 & i) == 0) {
            i2 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(getcreatedondatems4) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(getcreatedondatems5) ? 8388608 : 4194304;
        }
        int i3 = i2;
        if (!_handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer((4793491 & i3) != 4793490, i3 & 1)) {
            _handleunrecognizedcharacterescape2 = _handleunrecognizedcharacterescapeWrite;
            _handleunrecognizedcharacterescape2.onPrepareFromSearch();
        } else {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(-186191118, i3, -1, "com.marrow2.ui.mcq.component.FullscreenVideoDialog (McqFullscreenVideoDialog.kt:39)");
            }
            _handleunrecognizedcharacterescape2 = _handleunrecognizedcharacterescapeWrite;
            _fromInt.AudioAttributesCompatParcelizer(getcreatedondatems5, new CollectionDeserializerCollectionReferring(false, false, false, 3, null), multiplyFft.AudioAttributesCompatParcelizer(-193315831, true, new MagicModuleSubmissionRequestBody() { // from class: o.ImageManager
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return SingleRefDataBufferIterator.RemoteActionCompatParcelizer(exoPlayer, str, clientSettings, getcreatedondatems, getcreatedondatems2, getcreatedondatems3, getcreatedondatems4, getcreatedondatems5, (_handleUnrecognizedCharacterEscape) obj, ((Integer) obj2).intValue());
                }
            }, _handleunrecognizedcharacterescape2, 54), _handleunrecognizedcharacterescape2, ((i3 >> 21) & 14) | 432, 0);
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        releaseNameCopyBuffer releasenamecopybufferMediaBrowserCompatSearchResultReceiver = _handleunrecognizedcharacterescape2.MediaBrowserCompatSearchResultReceiver();
        if (releasenamecopybufferMediaBrowserCompatSearchResultReceiver != null) {
            releasenamecopybufferMediaBrowserCompatSearchResultReceiver.read(new MagicModuleSubmissionRequestBody() { // from class: o.ImageManagerImageReceiver
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return SingleRefDataBufferIterator.read(exoPlayer, str, clientSettings, getcreatedondatems, getcreatedondatems2, getcreatedondatems3, getcreatedondatems4, getcreatedondatems5, i, (_handleUnrecognizedCharacterEscape) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup RemoteActionCompatParcelizer(final ExoPlayer exoPlayer, final String str, final ClientSettings clientSettings, final getCreatedOnDateMs getcreatedondatems, final getCreatedOnDateMs getcreatedondatems2, final getCreatedOnDateMs getcreatedondatems3, final getCreatedOnDateMs getcreatedondatems4, final getCreatedOnDateMs getcreatedondatems5, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        if (!_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer((i & 3) != 2, i & 1)) {
            _handleunrecognizedcharacterescape.onPrepareFromSearch();
        } else {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(-193315831, i, -1, "com.marrow2.ui.mcq.component.FullscreenVideoDialog.<anonymous> (McqFullscreenVideoDialog.kt:45)");
            }
            final Context context = (Context) _handleunrecognizedcharacterescape.write(AndroidCompositionLocals_androidKt.IconCompatParcelizer());
            getShowPopup getshowpopup = getShowPopup.INSTANCE;
            boolean zIconCompatParcelizer = _handleunrecognizedcharacterescape.IconCompatParcelizer(context);
            Object objOnPause = _handleunrecognizedcharacterescape.onPause();
            if (zIconCompatParcelizer || objOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause = new getAnswerMap() { // from class: o.loadImage
                    @Override // kotlin.getAnswerMap
                    public final Object invoke(Object obj) {
                        return SingleRefDataBufferIterator.AudioAttributesCompatParcelizer(context, (StreamConstraintsException) obj);
                    }
                };
                _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause);
            }
            StreamReadException.RemoteActionCompatParcelizer(getshowpopup, (getAnswerMap) objOnPause, _handleunrecognizedcharacterescape, 6);
            View view = (View) _handleunrecognizedcharacterescape.write(AndroidCompositionLocals_androidKt.MediaBrowserCompatItemReceiver());
            boolean zIconCompatParcelizer2 = _handleunrecognizedcharacterescape.IconCompatParcelizer(view);
            Object objOnPause2 = _handleunrecognizedcharacterescape.onPause();
            if (zIconCompatParcelizer2 || objOnPause2 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause2 = (MagicModuleSubmissionRequestBody) new RemoteActionCompatParcelizer(view, null);
                _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause2);
            }
            StreamReadException.IconCompatParcelizer(view, (MagicModuleSubmissionRequestBody) objOnPause2, _handleunrecognizedcharacterescape, 0);
            DrawerLayout.IconCompatParcelizer(getFrameEndSchedulerui.IconCompatParcelizer$default(isAdded.IconCompatParcelizer$default(_handleOddName.INSTANCE, BitmapDescriptorFactory.HUE_RED, 1, null), getBindServiceExecutor.MediaBrowserCompatItemReceiver(), null, 2, null), null, false, multiplyFft.AudioAttributesCompatParcelizer(805907295, true, new getModuleData() { // from class: o.WebImage
                @Override // kotlin.getModuleData
                public final Object AudioAttributesCompatParcelizer(Object obj, Object obj2, Object obj3) {
                    return SingleRefDataBufferIterator.IconCompatParcelizer(exoPlayer, str, clientSettings, getcreatedondatems, getcreatedondatems2, getcreatedondatems3, getcreatedondatems4, getcreatedondatems5, (setDrawerShadow) obj, (_handleUnrecognizedCharacterEscape) obj2, ((Integer) obj3).intValue());
                }
            }, _handleunrecognizedcharacterescape, 54), _handleunrecognizedcharacterescape, 3078, 6);
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final _wrapError AudioAttributesCompatParcelizer(Context context, StreamConstraintsException streamConstraintsException) {
        Activity activity;
        toMagicModuleMetaRepoModel.write(streamConstraintsException, "");
        try {
            activity = CmcdConfigurationRequestConfig.read(context);
        } catch (IllegalStateException unused) {
            activity = null;
        }
        Integer numValueOf = activity != null ? Integer.valueOf(activity.getRequestedOrientation()) : null;
        if (activity != null) {
            activity.setRequestedOrientation(14);
        }
        return new AudioAttributesCompatParcelizer(numValueOf, activity);
    }

    static final class RemoteActionCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private /* synthetic */ View AudioAttributesCompatParcelizer;
        private int IconCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Window read;
            getYear.IconCompatParcelizer();
            SdkPayloadData.IconCompatParcelizer(obj);
            ViewParent parent = this.AudioAttributesCompatParcelizer.getParent();
            resolveForwardReference resolveforwardreference = parent instanceof resolveForwardReference ? (resolveForwardReference) parent : null;
            if (resolveforwardreference == null || (read = resolveforwardreference.getRead()) == null) {
                return getShowPopup.INSTANCE;
            }
            read.setLayout(-1, -1);
            read.setBackgroundDrawable(new ColorDrawable(RequestPayload.IconCompatParcelizer(switchToNext.INSTANCE.AudioAttributesCompatParcelizer())));
            WindowManager.LayoutParams attributes = read.getAttributes();
            attributes.layoutInDisplayCutoutMode = 1;
            read.setAttributes(attributes);
            _IsXOfY.write(read, false);
            read.setStatusBarColor(RequestPayload.IconCompatParcelizer(getBindServiceExecutor.MediaBrowserCompatItemReceiver()));
            read.setNavigationBarColor(RequestPayload.IconCompatParcelizer(getBindServiceExecutor.MediaBrowserCompatItemReceiver()));
            findNameForMutator findnameformutator = new findNameForMutator(read, read.getDecorView());
            findnameformutator.write(WindowInsetsCompat.MediaBrowserCompatItemReceiver.AudioAttributesImplBaseParcelizer());
            findnameformutator.IconCompatParcelizer(2);
            return getShowPopup.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        RemoteActionCompatParcelizer(View view, SampleVideos<? super RemoteActionCompatParcelizer> sampleVideos) {
            super(2, sampleVideos);
            this.AudioAttributesCompatParcelizer = view;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return new RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((RemoteActionCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    public static final class AudioAttributesCompatParcelizer implements _wrapError {
        private /* synthetic */ Integer read;
        private /* synthetic */ Activity write;

        public AudioAttributesCompatParcelizer(Integer num, Activity activity) {
            this.read = num;
            this.write = activity;
        }

        @Override // kotlin._wrapError
        public final void RemoteActionCompatParcelizer() {
            Integer num = this.read;
            if (num != null) {
                this.write.setRequestedOrientation(num.intValue());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup IconCompatParcelizer(ExoPlayer exoPlayer, String str, ClientSettings clientSettings, getCreatedOnDateMs getcreatedondatems, getCreatedOnDateMs getcreatedondatems2, getCreatedOnDateMs getcreatedondatems3, getCreatedOnDateMs getcreatedondatems4, getCreatedOnDateMs getcreatedondatems5, setDrawerShadow setdrawershadow, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        int i2;
        _handleOddName _handleoddnameRemoteActionCompatParcelizer;
        toMagicModuleMetaRepoModel.write(setdrawershadow, "");
        if ((i & 6) == 0) {
            i2 = i | (_handleunrecognizedcharacterescape.AudioAttributesCompatParcelizer(setdrawershadow) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (!_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer((i2 & 19) != 18, i2 & 1)) {
            _handleunrecognizedcharacterescape.onPrepareFromSearch();
        } else {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(805907295, i2, -1, "com.marrow2.ui.mcq.component.FullscreenVideoDialog.<anonymous>.<anonymous> (McqFullscreenVideoDialog.kt:94)");
            }
            boolean z = assignParameter.write(setdrawershadow.write(), setdrawershadow.IconCompatParcelizer()) >= 0;
            _handleOddName _handleoddnameAudioAttributesCompatParcelizer = setdrawershadow.AudioAttributesCompatParcelizer(_handleOddName.INSTANCE, _skipWSOrEnd.INSTANCE.RemoteActionCompatParcelizer());
            if (z) {
                _handleoddnameRemoteActionCompatParcelizer = isAdded.IconCompatParcelizer$default(_handleOddName.INSTANCE, BitmapDescriptorFactory.HUE_RED, 1, null);
            } else {
                _handleoddnameRemoteActionCompatParcelizer = _writeString.RemoteActionCompatParcelizer(isAdded.RemoteActionCompatParcelizer(_handleOddName.INSTANCE, setdrawershadow.IconCompatParcelizer(), setdrawershadow.write()), 90.0f);
            }
            onImageLoaded.IconCompatParcelizer(_handleoddnameAudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(_handleoddnameRemoteActionCompatParcelizer), exoPlayer, str, clientSettings, getcreatedondatems, getcreatedondatems2, true, getcreatedondatems3, getcreatedondatems4, getcreatedondatems5, _handleunrecognizedcharacterescape, 1572864);
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(ExoPlayer exoPlayer, String str, ClientSettings clientSettings, getCreatedOnDateMs getcreatedondatems, getCreatedOnDateMs getcreatedondatems2, getCreatedOnDateMs getcreatedondatems3, getCreatedOnDateMs getcreatedondatems4, getCreatedOnDateMs getcreatedondatems5, int i, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape) {
        AudioAttributesCompatParcelizer(exoPlayer, str, clientSettings, getcreatedondatems, getcreatedondatems2, getcreatedondatems3, getcreatedondatems4, getcreatedondatems5, _handleunrecognizedcharacterescape, _appendEscaped.RemoteActionCompatParcelizer(i | 1));
        return getShowPopup.INSTANCE;
    }
}
