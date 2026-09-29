package kotlin;

import android.app.Application;
import android.graphics.Color;
import android.text.TextUtils;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.marrow.data.api.models.response.Data;
import com.marrow.data.api.models.response.user.LoggedUserResponse;
import com.marrow.data.models.ResponseError;
import com.marrow.data.models.common.ApplicationData;
import com.marrow2.core.network.model.NetworkApiResponse;
import com.marrow2.data.mcq.remote.McqService;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import kotlin.MagicModuleUseCaseImplWhenMappings;
import kotlin.onDownloadChanged;
import kotlin.setMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class TrackSelectionViewTrackInfo implements isSolved, setSolved {
    private final Application AudioAttributesCompatParcelizer;
    private final unlockFolder AudioAttributesImplApi21Parcelizer;
    private final TopUserCompanion IconCompatParcelizer;
    private final setMinBytesTransferred MediaBrowserCompatCustomActionResultReceiver;
    private final RenewEligible RemoteActionCompatParcelizer;
    private MagicModuleDataKt read;
    private ApplicationData write;

    static final class RemoteActionCompatParcelizer extends getTotalMcq {
        Object AudioAttributesCompatParcelizer;
        int IconCompatParcelizer;
        /* synthetic */ Object RemoteActionCompatParcelizer;

        RemoteActionCompatParcelizer(SampleVideos<? super RemoteActionCompatParcelizer> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.RemoteActionCompatParcelizer = obj;
            this.IconCompatParcelizer |= Integer.MIN_VALUE;
            return TrackSelectionViewTrackInfo.this.IconCompatParcelizer(this);
        }
    }

    static final class write extends getTotalMcq {
        /* synthetic */ Object AudioAttributesCompatParcelizer;
        int read;

        write(SampleVideos<? super write> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.AudioAttributesCompatParcelizer = obj;
            this.read |= Integer.MIN_VALUE;
            return TrackSelectionViewTrackInfo.this.write(this);
        }
    }

    public TrackSelectionViewTrackInfo(Application application, unlockFolder unlockfolder, ApplicationData applicationData, TopUserCompanion topUserCompanion, setMinBytesTransferred setminbytestransferred) {
        toMagicModuleMetaRepoModel.write(application, "");
        toMagicModuleMetaRepoModel.write(unlockfolder, "");
        toMagicModuleMetaRepoModel.write(applicationData, "");
        toMagicModuleMetaRepoModel.write(topUserCompanion, "");
        toMagicModuleMetaRepoModel.write(setminbytestransferred, "");
        this.AudioAttributesCompatParcelizer = application;
        this.AudioAttributesImplApi21Parcelizer = unlockfolder;
        this.write = applicationData;
        this.IconCompatParcelizer = topUserCompanion;
        this.MediaBrowserCompatCustomActionResultReceiver = setminbytestransferred;
        this.RemoteActionCompatParcelizer = getRenewExpiresOn.RemoteActionCompatParcelizer(new getCreatedOnDateMs() { // from class: o.convertVerticalTypeToCss
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return TrackSelectionViewTrackInfo.MediaBrowserCompatCustomActionResultReceiver(this.IconCompatParcelizer);
            }
        });
    }

    public final ApplicationData RemoteActionCompatParcelizer() {
        return this.write;
    }

    private final isAutoSubmitted onPlayFromSearch() {
        return (isAutoSubmitted) this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer();
    }

    static final class AudioAttributesCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private Object AudioAttributesCompatParcelizer;
        private int AudioAttributesImplApi21Parcelizer;
        private Object AudioAttributesImplApi26Parcelizer;
        private Object AudioAttributesImplBaseParcelizer;
        private /* synthetic */ MagicModuleUseCaseImplWhenMappings.IconCompatParcelizer IconCompatParcelizer;
        private Object MediaBrowserCompatCustomActionResultReceiver;
        private Object MediaBrowserCompatItemReceiver;
        private Object RemoteActionCompatParcelizer;
        private Object read;
        private Object write;

        /* JADX WARN: Code restructure failed: missing block: B:32:0x01c5, code lost:
        
            if (r0 != r1) goto L34;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0138  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0162  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x017b  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x0180  */
        @Override // kotlin.getMonthName
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r25) {
            /*
                Method dump skipped, instruction units count: 468
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: o.TrackSelectionViewTrackInfo.AudioAttributesCompatParcelizer.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AudioAttributesCompatParcelizer(MagicModuleUseCaseImplWhenMappings.IconCompatParcelizer iconCompatParcelizer, SampleVideos<? super AudioAttributesCompatParcelizer> sampleVideos) {
            super(2, sampleVideos);
            this.IconCompatParcelizer = iconCompatParcelizer;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return TrackSelectionViewTrackInfo.this.new AudioAttributesCompatParcelizer(this.IconCompatParcelizer, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AudioAttributesCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final isAutoSubmitted MediaBrowserCompatCustomActionResultReceiver(final TrackSelectionViewTrackInfo trackSelectionViewTrackInfo) throws InterruptedException {
        MagicModuleDataKt magicModuleDataKt;
        MagicModuleUseCaseImplWhenMappings.IconCompatParcelizer iconCompatParcelizer = new MagicModuleUseCaseImplWhenMappings.IconCompatParcelizer();
        setModifiedEndTimestampMs.AudioAttributesCompatParcelizer(VideoSessionResponseBody.RemoteActionCompatParcelizer, trackSelectionViewTrackInfo.new AudioAttributesCompatParcelizer(iconCompatParcelizer, null));
        Application application = trackSelectionViewTrackInfo.AudioAttributesCompatParcelizer;
        MagicModuleDataKt magicModuleDataKt2 = trackSelectionViewTrackInfo.read;
        if (magicModuleDataKt2 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            magicModuleDataKt = null;
        } else {
            magicModuleDataKt = magicModuleDataKt2;
        }
        return new isAutoSubmitted(application, magicModuleDataKt, IntermediateLoginResponseBody.RemoteActionCompatParcelizer(new anchorTypeToTranslatePercent(iconCompatParcelizer.AudioAttributesCompatParcelizer)), new MagicModuleSubmissionRequestBody() { // from class: o.onTrackSelectionChanged
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return TrackSelectionViewTrackInfo.RemoteActionCompatParcelizer(this.IconCompatParcelizer, (Exception) obj, (String) obj2);
            }
        }, new getContent_id(new getCreatedOnDateMs() { // from class: o.TrackSelectionViewTrackSelectionListener
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return Boolean.valueOf(TrackSelectionViewTrackInfo.AudioAttributesImplBaseParcelizer(this.AudioAttributesCompatParcelizer));
            }
        }), new InAppRatingThreshHoldRemoteModel(new getCreatedOnDateMs() { // from class: o.convertTextSizeToCss
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return Boolean.valueOf(TrackSelectionViewTrackInfo.MediaDescriptionCompat(this.read));
            }
        }, new getCreatedOnDateMs() { // from class: o.updateWebView
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return Boolean.valueOf(TrackSelectionViewTrackInfo.RatingCompat(this.IconCompatParcelizer));
            }
        }, new getCreatedOnDateMs() { // from class: o.convertCaptionStyleToCssTextShadow
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return TrackSelectionViewTrackInfo.MediaBrowserCompatMediaItem(this.AudioAttributesCompatParcelizer);
            }
        }), new FilterParamsKt(new getCreatedOnDateMs() { // from class: o.getBlockShearTransformFunction
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return Boolean.valueOf(TrackSelectionViewTrackInfo.MediaBrowserCompatSearchResultReceiver(this.IconCompatParcelizer));
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup RemoteActionCompatParcelizer(TrackSelectionViewTrackInfo trackSelectionViewTrackInfo, Exception exc, String str) throws Throwable {
        toMagicModuleMetaRepoModel.write(exc, "");
        toMagicModuleMetaRepoModel.write(str, "");
        try {
            Object[] objArr = {exc, str};
            Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-262503569);
            if (objRemoteActionCompatParcelizer == null) {
                objRemoteActionCompatParcelizer = startForeground.read((char) (Color.blue(0) + 25787), TextUtils.getTrimmedLength("") + 19929, Color.alpha(0) + 15, -1911339014, false, "AudioAttributesCompatParcelizer", new Class[]{Exception.class, String.class});
            }
            getTrackGroup.AudioAttributesCompatParcelizer("font_crash", dispatchTouchEvent.AudioAttributesCompatParcelizer((Map<String, ? extends Object>) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr)));
            trackSelectionViewTrackInfo.write.logFontExceptionCrash(exc, str);
            return getShowPopup.INSTANCE;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean AudioAttributesImplBaseParcelizer(TrackSelectionViewTrackInfo trackSelectionViewTrackInfo) {
        return trackSelectionViewTrackInfo.MediaBrowserCompatCustomActionResultReceiver.RemoteActionCompatParcelizer("font_rendering_mode");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean MediaDescriptionCompat(TrackSelectionViewTrackInfo trackSelectionViewTrackInfo) {
        return trackSelectionViewTrackInfo.MediaBrowserCompatCustomActionResultReceiver.RemoteActionCompatParcelizer("experimental_hardware_rendering");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean RatingCompat(TrackSelectionViewTrackInfo trackSelectionViewTrackInfo) {
        return trackSelectionViewTrackInfo.AudioAttributesImplApi21Parcelizer.write();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup MediaBrowserCompatMediaItem(TrackSelectionViewTrackInfo trackSelectionViewTrackInfo) {
        trackSelectionViewTrackInfo.AudioAttributesImplApi21Parcelizer.RemoteActionCompatParcelizer();
        buildResolutionString.IconCompatParcelizer("NativeEncryption", "Kill switch activated by error 1250 - fallback to legacy");
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean MediaBrowserCompatSearchResultReceiver(TrackSelectionViewTrackInfo trackSelectionViewTrackInfo) {
        return trackSelectionViewTrackInfo.MediaBrowserCompatCustomActionResultReceiver.RemoteActionCompatParcelizer("dark_font_available");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object IconCompatParcelizer(kotlin.SampleVideos<? super java.lang.String> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof o.TrackSelectionViewTrackInfo.RemoteActionCompatParcelizer
            if (r0 == 0) goto L14
            r0 = r7
            o.TrackSelectionViewTrackInfo$RemoteActionCompatParcelizer r0 = (o.TrackSelectionViewTrackInfo.RemoteActionCompatParcelizer) r0
            int r1 = r0.IconCompatParcelizer
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r7 = r0.IconCompatParcelizer
            int r7 = r7 + r2
            r0.IconCompatParcelizer = r7
            goto L19
        L14:
            o.TrackSelectionViewTrackInfo$RemoteActionCompatParcelizer r0 = new o.TrackSelectionViewTrackInfo$RemoteActionCompatParcelizer
            r0.<init>(r7)
        L19:
            java.lang.Object r7 = r0.RemoteActionCompatParcelizer
            java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
            int r2 = r0.IconCompatParcelizer
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3d
            if (r2 == r4) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r6 = r0.AudioAttributesCompatParcelizer
            java.lang.String r6 = (java.lang.String) r6
            kotlin.SdkPayloadData.IconCompatParcelizer(r7)
            goto L5c
        L31:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L39:
            kotlin.SdkPayloadData.IconCompatParcelizer(r7)
            goto L4a
        L3d:
            kotlin.SdkPayloadData.IconCompatParcelizer(r7)
            o.unlockFolder r7 = r6.AudioAttributesImplApi21Parcelizer
            r0.IconCompatParcelizer = r4
            java.lang.Object r7 = r7.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(r0)
            if (r7 == r1) goto L78
        L4a:
            java.lang.String r7 = (java.lang.String) r7
            o.unlockFolder r6 = r6.AudioAttributesImplApi21Parcelizer
            r0.AudioAttributesCompatParcelizer = r7
            r0.IconCompatParcelizer = r3
            java.lang.Object r6 = r6.onSetRepeatMode(r0)
            if (r6 != r1) goto L59
            goto L78
        L59:
            r5 = r7
            r7 = r6
            r6 = r5
        L5c:
            java.lang.String r7 = (java.lang.String) r7
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r7)
            java.lang.String r7 = "://"
            r0.append(r7)
            r0.append(r6)
            java.lang.String r6 = "/v3.1/"
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            return r6
        L78:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.TrackSelectionViewTrackInfo.IconCompatParcelizer(o.SampleVideos):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object write(kotlin.SampleVideos<? super java.lang.String> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof o.TrackSelectionViewTrackInfo.write
            if (r0 == 0) goto L14
            r0 = r5
            o.TrackSelectionViewTrackInfo$write r0 = (o.TrackSelectionViewTrackInfo.write) r0
            int r1 = r0.read
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r5 = r0.read
            int r5 = r5 + r2
            r0.read = r5
            goto L19
        L14:
            o.TrackSelectionViewTrackInfo$write r0 = new o.TrackSelectionViewTrackInfo$write
            r0.<init>(r5)
        L19:
            java.lang.Object r5 = r0.AudioAttributesCompatParcelizer
            java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
            int r2 = r0.read
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            kotlin.SdkPayloadData.IconCompatParcelizer(r5)
            goto L40
        L2a:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L32:
            kotlin.SdkPayloadData.IconCompatParcelizer(r5)
            o.unlockFolder r4 = r4.AudioAttributesImplApi21Parcelizer
            r0.read = r3
            java.lang.Object r5 = r4.onSetRepeatMode(r0)
            if (r5 != r1) goto L40
            return r1
        L40:
            java.lang.String r5 = (java.lang.String) r5
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r5)
            java.lang.String r5 = "://www.marrow.com/api/"
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.TrackSelectionViewTrackInfo.write(o.SampleVideos):java.lang.Object");
    }

    private final void AudioAttributesCompatParcelizer(String str, String str2) throws Throwable {
        isAutoSubmitted isautosubmittedOnPlayFromSearch = onPlayFromSearch();
        MagicModuleDataKt magicModuleDataKt = this.read;
        if (magicModuleDataKt == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            magicModuleDataKt = null;
        }
        int i = setMap.AudioAttributesCompatParcelizer.read();
        isautosubmittedOnPlayFromSearch.RemoteActionCompatParcelizer((MagicModuleDataKt) MagicModuleDataKt.read(setMap.AudioAttributesCompatParcelizer.read(), setMap.AudioAttributesCompatParcelizer.read(), setMap.AudioAttributesCompatParcelizer.read(), -1129835483, 1129835488, new Object[]{magicModuleDataKt, null, null, null, null, null, null, false, null, str2, str, null, null, null, 0, null, 31999}, i));
    }

    @Override // kotlin.isSolved
    public final void AudioAttributesCompatParcelizer(int i, String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        this.write.logout(new ResponseError(i, str, false, 4, null));
    }

    public static final class IconCompatParcelizer extends TypeReference<NetworkApiResponse<LoggedUserResponse>> {
        IconCompatParcelizer() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.isSolved
    public final String IconCompatParcelizer(JSONObject jSONObject) throws Throwable {
        LoggedUserResponse loggedUserResponse;
        toMagicModuleMetaRepoModel.write(jSONObject, "");
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        Object value = objectMapper.readValue(jSONObject.toString(), new IconCompatParcelizer());
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(value, "");
        Data data = ((NetworkApiResponse) value).getData();
        if (data == null || (loggedUserResponse = (LoggedUserResponse) data.data) == null) {
            return null;
        }
        this.write.updateUserTable(LoggedUserResponse.getLoggedUser(loggedUserResponse));
        String str = loggedUserResponse.mUserId;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str, "");
        String str2 = loggedUserResponse.token;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str2, "");
        AudioAttributesCompatParcelizer(str, str2);
        return loggedUserResponse.token;
    }

    @Override // kotlin.isSolved
    public final void read(String str) {
        this.write.promptApiBlockDrivenAction(str);
    }

    @Override // kotlin.isSolved
    public final void onPrepare() {
        this.write.promptContactVerificationFlow();
    }

    public final GlProgram onFastForward() {
        Object[] objArr = {onPlayFromSearch(), GlProgram.class};
        return (GlProgram) isAutoSubmitted.RemoteActionCompatParcelizer(onDownloadChanged.RemoteActionCompatParcelizer.read(), -41351265, 41351266, onDownloadChanged.RemoteActionCompatParcelizer.read(), onDownloadChanged.RemoteActionCompatParcelizer.read(), objArr, onDownloadChanged.RemoteActionCompatParcelizer.read());
    }

    public final focusPlaceholderEglSurface onPlay() {
        Object[] objArr = {onPlayFromSearch(), focusPlaceholderEglSurface.class};
        return (focusPlaceholderEglSurface) isAutoSubmitted.RemoteActionCompatParcelizer(onDownloadChanged.RemoteActionCompatParcelizer.read(), -41351265, 41351266, onDownloadChanged.RemoteActionCompatParcelizer.read(), onDownloadChanged.RemoteActionCompatParcelizer.read(), objArr, onDownloadChanged.RemoteActionCompatParcelizer.read());
    }

    public final setBufferSize MediaBrowserCompatCustomActionResultReceiver() {
        Object[] objArr = {onPlayFromSearch(), setBufferSize.class};
        return (setBufferSize) isAutoSubmitted.RemoteActionCompatParcelizer(onDownloadChanged.RemoteActionCompatParcelizer.read(), -41351265, 41351266, onDownloadChanged.RemoteActionCompatParcelizer.read(), onDownloadChanged.RemoteActionCompatParcelizer.read(), objArr, onDownloadChanged.RemoteActionCompatParcelizer.read());
    }

    public final McqService RatingCompat() {
        Object[] objArr = {onPlayFromSearch(), McqService.class};
        return (McqService) isAutoSubmitted.RemoteActionCompatParcelizer(onDownloadChanged.RemoteActionCompatParcelizer.read(), -41351265, 41351266, onDownloadChanged.RemoteActionCompatParcelizer.read(), onDownloadChanged.RemoteActionCompatParcelizer.read(), objArr, onDownloadChanged.RemoteActionCompatParcelizer.read());
    }

    public final removeValues MediaMetadataCompat() {
        Object[] objArr = {onPlayFromSearch(), removeValues.class};
        return (removeValues) isAutoSubmitted.RemoteActionCompatParcelizer(onDownloadChanged.RemoteActionCompatParcelizer.read(), -41351265, 41351266, onDownloadChanged.RemoteActionCompatParcelizer.read(), onDownloadChanged.RemoteActionCompatParcelizer.read(), objArr, onDownloadChanged.RemoteActionCompatParcelizer.read());
    }

    public final LoadErrorHandlingPolicyFallbackOptions AudioAttributesImplApi26Parcelizer() {
        Object[] objArr = {onPlayFromSearch(), LoadErrorHandlingPolicyFallbackOptions.class};
        return (LoadErrorHandlingPolicyFallbackOptions) isAutoSubmitted.RemoteActionCompatParcelizer(onDownloadChanged.RemoteActionCompatParcelizer.read(), -41351265, 41351266, onDownloadChanged.RemoteActionCompatParcelizer.read(), onDownloadChanged.RemoteActionCompatParcelizer.read(), objArr, onDownloadChanged.RemoteActionCompatParcelizer.read());
    }

    public final InterfaceC0166createEglContext MediaBrowserCompatItemReceiver() {
        Object[] objArr = {onPlayFromSearch(), InterfaceC0166createEglContext.class};
        return (InterfaceC0166createEglContext) isAutoSubmitted.RemoteActionCompatParcelizer(onDownloadChanged.RemoteActionCompatParcelizer.read(), -41351265, 41351266, onDownloadChanged.RemoteActionCompatParcelizer.read(), onDownloadChanged.RemoteActionCompatParcelizer.read(), objArr, onDownloadChanged.RemoteActionCompatParcelizer.read());
    }

    public final getBytesRead AudioAttributesImplBaseParcelizer() {
        Object[] objArr = {onPlayFromSearch(), getBytesRead.class};
        return (getBytesRead) isAutoSubmitted.RemoteActionCompatParcelizer(onDownloadChanged.RemoteActionCompatParcelizer.read(), -41351265, 41351266, onDownloadChanged.RemoteActionCompatParcelizer.read(), onDownloadChanged.RemoteActionCompatParcelizer.read(), objArr, onDownloadChanged.RemoteActionCompatParcelizer.read());
    }

    public final setSlidingWindowMaxWeight write() {
        Object[] objArr = {onPlayFromSearch(), setSlidingWindowMaxWeight.class};
        return (setSlidingWindowMaxWeight) isAutoSubmitted.RemoteActionCompatParcelizer(onDownloadChanged.RemoteActionCompatParcelizer.read(), -41351265, 41351266, onDownloadChanged.RemoteActionCompatParcelizer.read(), onDownloadChanged.RemoteActionCompatParcelizer.read(), objArr, onDownloadChanged.RemoteActionCompatParcelizer.read());
    }

    public final EGLSurfaceTextureSecureMode onPause() {
        Object[] objArr = {onPlayFromSearch(), EGLSurfaceTextureSecureMode.class};
        return (EGLSurfaceTextureSecureMode) isAutoSubmitted.RemoteActionCompatParcelizer(onDownloadChanged.RemoteActionCompatParcelizer.read(), -41351265, 41351266, onDownloadChanged.RemoteActionCompatParcelizer.read(), onDownloadChanged.RemoteActionCompatParcelizer.read(), objArr, onDownloadChanged.RemoteActionCompatParcelizer.read());
    }

    public final CodecSpecificDataUtil onCommand() {
        Object[] objArr = {onPlayFromSearch(), CodecSpecificDataUtil.class};
        return (CodecSpecificDataUtil) isAutoSubmitted.RemoteActionCompatParcelizer(onDownloadChanged.RemoteActionCompatParcelizer.read(), -41351265, 41351266, onDownloadChanged.RemoteActionCompatParcelizer.read(), onDownloadChanged.RemoteActionCompatParcelizer.read(), objArr, onDownloadChanged.RemoteActionCompatParcelizer.read());
    }

    public final createCacheDirectories handleMediaPlayPauseIfPendingOnHandler() {
        Object[] objArr = {onPlayFromSearch(), createCacheDirectories.class};
        return (createCacheDirectories) isAutoSubmitted.RemoteActionCompatParcelizer(onDownloadChanged.RemoteActionCompatParcelizer.read(), -41351265, 41351266, onDownloadChanged.RemoteActionCompatParcelizer.read(), onDownloadChanged.RemoteActionCompatParcelizer.read(), objArr, onDownloadChanged.RemoteActionCompatParcelizer.read());
    }

    public final chooseEGLConfig onMediaButtonEvent() {
        Object[] objArr = {onPlayFromSearch(), chooseEGLConfig.class};
        return (chooseEGLConfig) isAutoSubmitted.RemoteActionCompatParcelizer(onDownloadChanged.RemoteActionCompatParcelizer.read(), -41351265, 41351266, onDownloadChanged.RemoteActionCompatParcelizer.read(), onDownloadChanged.RemoteActionCompatParcelizer.read(), objArr, onDownloadChanged.RemoteActionCompatParcelizer.read());
    }

    public final r8lambda9q_is_UzaTpbA9Go4su0OSFqF4M AudioAttributesCompatParcelizer() {
        Object[] objArr = {onPlayFromSearch(), r8lambda9q_is_UzaTpbA9Go4su0OSFqF4M.class};
        return (r8lambda9q_is_UzaTpbA9Go4su0OSFqF4M) isAutoSubmitted.RemoteActionCompatParcelizer(onDownloadChanged.RemoteActionCompatParcelizer.read(), -41351265, 41351266, onDownloadChanged.RemoteActionCompatParcelizer.read(), onDownloadChanged.RemoteActionCompatParcelizer.read(), objArr, onDownloadChanged.RemoteActionCompatParcelizer.read());
    }

    public final getBinder MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
        Object[] objArr = {onPlayFromSearch(), getBinder.class};
        return (getBinder) isAutoSubmitted.RemoteActionCompatParcelizer(onDownloadChanged.RemoteActionCompatParcelizer.read(), -41351265, 41351266, onDownloadChanged.RemoteActionCompatParcelizer.read(), onDownloadChanged.RemoteActionCompatParcelizer.read(), objArr, onDownloadChanged.RemoteActionCompatParcelizer.read());
    }

    public final isReadingFromCache MediaBrowserCompatMediaItem() {
        Object[] objArr = {onPlayFromSearch(), isReadingFromCache.class};
        return (isReadingFromCache) isAutoSubmitted.RemoteActionCompatParcelizer(onDownloadChanged.RemoteActionCompatParcelizer.read(), -41351265, 41351266, onDownloadChanged.RemoteActionCompatParcelizer.read(), onDownloadChanged.RemoteActionCompatParcelizer.read(), objArr, onDownloadChanged.RemoteActionCompatParcelizer.read());
    }

    public final updateInPlace onAddQueueItem() {
        Object[] objArr = {onPlayFromSearch(), updateInPlace.class};
        return (updateInPlace) isAutoSubmitted.RemoteActionCompatParcelizer(onDownloadChanged.RemoteActionCompatParcelizer.read(), -41351265, 41351266, onDownloadChanged.RemoteActionCompatParcelizer.read(), onDownloadChanged.RemoteActionCompatParcelizer.read(), objArr, onDownloadChanged.RemoteActionCompatParcelizer.read());
    }

    public final readContentMetadata MediaDescriptionCompat() {
        Object[] objArr = {onPlayFromSearch(), readContentMetadata.class};
        return (readContentMetadata) isAutoSubmitted.RemoteActionCompatParcelizer(onDownloadChanged.RemoteActionCompatParcelizer.read(), -41351265, 41351266, onDownloadChanged.RemoteActionCompatParcelizer.read(), onDownloadChanged.RemoteActionCompatParcelizer.read(), objArr, onDownloadChanged.RemoteActionCompatParcelizer.read());
    }

    public final getKeyForId MediaBrowserCompatSearchResultReceiver() {
        Object[] objArr = {onPlayFromSearch(), getKeyForId.class};
        return (getKeyForId) isAutoSubmitted.RemoteActionCompatParcelizer(onDownloadChanged.RemoteActionCompatParcelizer.read(), -41351265, 41351266, onDownloadChanged.RemoteActionCompatParcelizer.read(), onDownloadChanged.RemoteActionCompatParcelizer.read(), objArr, onDownloadChanged.RemoteActionCompatParcelizer.read());
    }

    public final ResolvingDataSourceResolver AudioAttributesImplApi21Parcelizer() {
        Object[] objArr = {onPlayFromSearch(), ResolvingDataSourceResolver.class};
        return (ResolvingDataSourceResolver) isAutoSubmitted.RemoteActionCompatParcelizer(onDownloadChanged.RemoteActionCompatParcelizer.read(), -1587194510, 1587194510, onDownloadChanged.RemoteActionCompatParcelizer.read(), onDownloadChanged.RemoteActionCompatParcelizer.read(), objArr, onDownloadChanged.RemoteActionCompatParcelizer.read());
    }

    public final buildNalUnit onPlayFromMediaId() {
        Object[] objArr = {onPlayFromSearch(), buildNalUnit.class};
        return (buildNalUnit) isAutoSubmitted.RemoteActionCompatParcelizer(onDownloadChanged.RemoteActionCompatParcelizer.read(), -41351265, 41351266, onDownloadChanged.RemoteActionCompatParcelizer.read(), onDownloadChanged.RemoteActionCompatParcelizer.read(), objArr, onDownloadChanged.RemoteActionCompatParcelizer.read());
    }

    public final setAutoSubmitted read() {
        return onPlayFromSearch().AudioAttributesCompatParcelizer();
    }

    public final onDownstreamFormatChanged IconCompatParcelizer() {
        return onPlayFromSearch().write();
    }

    public final toOldModel onCustomAction() {
        return onPlayFromSearch().RemoteActionCompatParcelizer();
    }

    @Override // kotlin.setSolved
    public final void AudioAttributesCompatParcelizer(HashMap<String, String> map) {
        toMagicModuleMetaRepoModel.write(map, "");
    }
}
