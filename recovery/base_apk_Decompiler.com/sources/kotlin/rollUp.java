package kotlin;

import android.content.Context;
import com.marrow.data.api.models.MarrowResponse;
import com.marrow.data.api.models.ResponseExtensionsKt;
import com.marrow.data.api.models.request.PlayIntegrityTokenRequestBody;
import com.marrow.data.api.models.request.common.AppInfoRequestBody;
import com.marrow.data.api.models.request.common.AttestationRequestBodyKt;
import com.marrow.data.api.models.request.common.SecurityRequestBody;
import com.marrow.data.api.models.response.common.AttestationResponseBody;
import com.marrow.data.api.models.response.common.FIDResponseBody;
import com.marrow.data.api.models.response.common.SecurityResponseBody;
import com.marrow.data.api.models.response.security.playintegrity.PlayIntegrityResponseBody;
import com.marrow.data.models.user.FIDStatus;
import com.marrow2.data.user.remote.model.ImageTokenRSModel;
import kotlin.parseCea708AccessibilityChannel;

/* JADX INFO: loaded from: classes3.dex */
public final class rollUp implements Cea608DecoderCueBuilderCueStyle {
    private final handleInterleavedBinaryData AudioAttributesCompatParcelizer;
    private final getContentDataSource IconCompatParcelizer;
    private final handleG2Character MediaBrowserCompatCustomActionResultReceiver;
    private final LoaderLoadable RemoteActionCompatParcelizer;
    private final Context read;
    private final getStreamPositionUsForContent write;

    public rollUp(Context context, getStreamPositionUsForContent getstreampositionusforcontent, handleG2Character handleg2character, LoaderLoadable loaderLoadable, getContentDataSource getcontentdatasource, handleInterleavedBinaryData handleinterleavedbinarydata) {
        toMagicModuleMetaRepoModel.write(context, "");
        toMagicModuleMetaRepoModel.write(getstreampositionusforcontent, "");
        toMagicModuleMetaRepoModel.write(handleg2character, "");
        toMagicModuleMetaRepoModel.write(loaderLoadable, "");
        toMagicModuleMetaRepoModel.write(getcontentdatasource, "");
        toMagicModuleMetaRepoModel.write(handleinterleavedbinarydata, "");
        this.read = context;
        this.write = getstreampositionusforcontent;
        this.MediaBrowserCompatCustomActionResultReceiver = handleg2character;
        this.RemoteActionCompatParcelizer = loaderLoadable;
        this.IconCompatParcelizer = getcontentdatasource;
        this.AudioAttributesCompatParcelizer = handleinterleavedbinarydata;
    }

    @Override // kotlin.Cea608DecoderCueBuilderCueStyle
    public final LessonDynamicResponseBody<MarrowResponse<FIDResponseBody>> RemoteActionCompatParcelizer() {
        return ResponseExtensionsKt.flatMapResponse(AudioAttributesCompatParcelizer(), new getAnswerMap() { // from class: o.handleC1Command
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return rollUp.RemoteActionCompatParcelizer(this.write, (SecurityResponseBody) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LessonDynamicResponseBody RemoteActionCompatParcelizer(rollUp rollup, SecurityResponseBody securityResponseBody) {
        toMagicModuleMetaRepoModel.write(securityResponseBody, "");
        if (securityResponseBody.fidRequirementStatus == FIDStatus.REQUIRED_TO_REGISTER.getValue()) {
            String str = securityResponseBody.fidKey;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str, "");
            return rollup.AudioAttributesCompatParcelizer(str);
        }
        LessonDynamicResponseBody lessonDynamicResponseBodyRemoteActionCompatParcelizer = LessonDynamicResponseBody.RemoteActionCompatParcelizer(getSegmentStartTimeUs.AudioAttributesCompatParcelizer(new FIDResponseBody()));
        toMagicModuleMetaRepoModel.write(lessonDynamicResponseBodyRemoteActionCompatParcelizer);
        return lessonDynamicResponseBodyRemoteActionCompatParcelizer;
    }

    @Override // kotlin.Cea608DecoderCueBuilderCueStyle
    public final LessonDynamicResponseBody<MarrowResponse<FIDResponseBody>> IconCompatParcelizer(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return AudioAttributesCompatParcelizer(str);
    }

    @Override // kotlin.Cea608DecoderCueBuilderCueStyle
    public final LessonDynamicResponseBody<MarrowResponse<SecurityResponseBody>> AudioAttributesCompatParcelizer() {
        LessonDynamicResponseBody<SecurityRequestBody> lessonDynamicResponseBodyAudioAttributesImplApi21Parcelizer = AudioAttributesImplApi21Parcelizer();
        final getAnswerMap getanswermap = new getAnswerMap() { // from class: o.handleG0Character
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return rollUp.AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer, (SecurityRequestBody) obj);
            }
        };
        LessonDynamicResponseBody lessonDynamicResponseBodyRemoteActionCompatParcelizer = lessonDynamicResponseBodyAudioAttributesImplApi21Parcelizer.RemoteActionCompatParcelizer(new getSubjectTitle() { // from class: o.handleSetPenAttributes
            @Override // kotlin.getSubjectTitle
            public final Object apply(Object obj) {
                return rollUp.read(getanswermap, obj);
            }
        });
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(lessonDynamicResponseBodyRemoteActionCompatParcelizer, "");
        return lessonDynamicResponseBodyRemoteActionCompatParcelizer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final setRootSubjectId read(getAnswerMap getanswermap, Object obj) {
        toMagicModuleMetaRepoModel.write(obj, "");
        return (setRootSubjectId) getanswermap.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final setRootSubjectId AudioAttributesCompatParcelizer(rollUp rollup, SecurityRequestBody securityRequestBody) {
        toMagicModuleMetaRepoModel.write(securityRequestBody, "");
        return ResponseExtensionsKt.toMarrowResponse(rollup.MediaBrowserCompatCustomActionResultReceiver.AudioAttributesCompatParcelizer(securityRequestBody));
    }

    @Override // kotlin.Cea608DecoderCueBuilderCueStyle
    public final LessonDynamicResponseBody<MarrowResponse<AttestationResponseBody>> IconCompatParcelizer() {
        LessonDynamicResponseBody lessonDynamicResponseBodyWrite = parseCea708AccessibilityChannel.write(new parseCea708AccessibilityChannel.RemoteActionCompatParcelizer() { // from class: o.handleC0Command
            @Override // o.parseCea708AccessibilityChannel.RemoteActionCompatParcelizer
            public final Object write() {
                return rollUp.AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer);
            }
        });
        final getAnswerMap getanswermap = new getAnswerMap() { // from class: o.handleG3Character
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return rollUp.write(this.RemoteActionCompatParcelizer, (ThemeKtExternalSyntheticLambda2) obj);
            }
        };
        LessonDynamicResponseBody<MarrowResponse<AttestationResponseBody>> lessonDynamicResponseBodyRemoteActionCompatParcelizer = lessonDynamicResponseBodyWrite.RemoteActionCompatParcelizer(new getSubjectTitle() { // from class: o.handleG1Character
            @Override // kotlin.getSubjectTitle
            public final Object apply(Object obj) {
                return rollUp.IconCompatParcelizer(getanswermap, obj);
            }
        });
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(lessonDynamicResponseBodyRemoteActionCompatParcelizer, "");
        return lessonDynamicResponseBodyRemoteActionCompatParcelizer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ThemeKtExternalSyntheticLambda2 AudioAttributesCompatParcelizer(rollUp rollup) {
        return AttestationRequestBodyKt.toAttestationRequestBody(registerInterleavedBinaryDataListener.write(rollup.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final setRootSubjectId IconCompatParcelizer(getAnswerMap getanswermap, Object obj) {
        toMagicModuleMetaRepoModel.write(obj, "");
        return (setRootSubjectId) getanswermap.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final setRootSubjectId write(rollUp rollup, ThemeKtExternalSyntheticLambda2 themeKtExternalSyntheticLambda2) {
        toMagicModuleMetaRepoModel.write(themeKtExternalSyntheticLambda2, "");
        return ResponseExtensionsKt.toMarrowResponse(rollup.MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer(themeKtExternalSyntheticLambda2));
    }

    @Override // kotlin.Cea608DecoderCueBuilderCueStyle
    public final LessonDynamicResponseBody<MarrowResponse<ImageTokenRSModel>> write() {
        return ResponseExtensionsKt.toMarrowResponse(this.MediaBrowserCompatCustomActionResultReceiver.RemoteActionCompatParcelizer(this.IconCompatParcelizer.RemoteActionCompatParcelizer()));
    }

    @Override // kotlin.Cea608DecoderCueBuilderCueStyle
    public final LessonDynamicResponseBody<MarrowResponse<PlayIntegrityResponseBody>> RemoteActionCompatParcelizer(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        handleG2Character handleg2character = this.MediaBrowserCompatCustomActionResultReceiver;
        String packageName = this.read.getPackageName();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(packageName, "");
        return ResponseExtensionsKt.toMarrowResponse(handleg2character.RemoteActionCompatParcelizer(new PlayIntegrityTokenRequestBody(str, packageName)));
    }

    private final LessonDynamicResponseBody<MarrowResponse<FIDResponseBody>> AudioAttributesCompatParcelizer(String str) {
        String strAudioAttributesImplBaseParcelizer = this.write.AudioAttributesImplBaseParcelizer();
        if (strAudioAttributesImplBaseParcelizer == null) {
            strAudioAttributesImplBaseParcelizer = "xxx";
        }
        String strAudioAttributesCompatParcelizer = parseDuration.AudioAttributesCompatParcelizer(this.read);
        StringBuilder sb = new StringBuilder();
        sb.append(strAudioAttributesImplBaseParcelizer);
        sb.append("_");
        sb.append(strAudioAttributesCompatParcelizer);
        String string = sb.toString();
        this.RemoteActionCompatParcelizer.IconCompatParcelizer(str, "https://api-af.marrow.com/");
        buildResolutionString.IconCompatParcelizer("SecurityAudit", "FID KeyId :".concat(String.valueOf(string)));
        LessonDynamicResponseBody<String> lessonDynamicResponseBody = this.RemoteActionCompatParcelizer.read(string);
        final getAnswerMap getanswermap = new getAnswerMap() { // from class: o.handleC2Command
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return rollUp.read(this.RemoteActionCompatParcelizer, (String) obj);
            }
        };
        LessonDynamicResponseBody lessonDynamicResponseBodyRemoteActionCompatParcelizer = lessonDynamicResponseBody.RemoteActionCompatParcelizer(new getSubjectTitle() { // from class: o.handleDefineWindow
            @Override // kotlin.getSubjectTitle
            public final Object apply(Object obj) {
                return rollUp.AudioAttributesImplBaseParcelizer(getanswermap, obj);
            }
        });
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(lessonDynamicResponseBodyRemoteActionCompatParcelizer, "");
        return lessonDynamicResponseBodyRemoteActionCompatParcelizer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final setRootSubjectId AudioAttributesImplBaseParcelizer(getAnswerMap getanswermap, Object obj) {
        toMagicModuleMetaRepoModel.write(obj, "");
        return (setRootSubjectId) getanswermap.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final setRootSubjectId read(rollUp rollup, String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        buildResolutionString.IconCompatParcelizer("SecurityAudit", "Generated FID :".concat(String.valueOf(str)));
        return ResponseExtensionsKt.toMarrowResponse(rollup.MediaBrowserCompatCustomActionResultReceiver.read(rollup.write(str)));
    }

    private final LessonDynamicResponseBody<SecurityRequestBody> AudioAttributesImplApi21Parcelizer() {
        LessonDynamicResponseBody<SecurityRequestBody> lessonDynamicResponseBodyWrite = parseCea708AccessibilityChannel.write(new parseCea708AccessibilityChannel.RemoteActionCompatParcelizer() { // from class: o.handleC3Command
            @Override // o.parseCea708AccessibilityChannel.RemoteActionCompatParcelizer
            public final Object write() {
                return rollUp.RemoteActionCompatParcelizer(this.IconCompatParcelizer);
            }
        });
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(lessonDynamicResponseBodyWrite, "");
        return lessonDynamicResponseBodyWrite;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SecurityRequestBody RemoteActionCompatParcelizer(rollUp rollup) {
        String strAudioAttributesImplBaseParcelizer = rollup.write.AudioAttributesImplBaseParcelizer();
        if (strAudioAttributesImplBaseParcelizer == null) {
            strAudioAttributesImplBaseParcelizer = "";
        }
        SecurityRequestBody securityRequestBody = new SecurityRequestBody(rollup.write.onRemoveQueueItem());
        Object[] objArr = {rollup.read, strAudioAttributesImplBaseParcelizer};
        int iIconCompatParcelizer = MediaSessionConnectorCustomActionProvider.IconCompatParcelizer();
        securityRequestBody.drDvInfo = (String) updateShuffleButton.IconCompatParcelizer(MediaSessionConnectorCustomActionProvider.IconCompatParcelizer(), -713556361, MediaSessionConnectorCustomActionProvider.IconCompatParcelizer(), MediaSessionConnectorCustomActionProvider.IconCompatParcelizer(), 713556361, objArr, iIconCompatParcelizer);
        securityRequestBody.appInfoRequestBody = rollup.read();
        return securityRequestBody;
    }

    private final SecurityRequestBody write(String str) {
        String strAudioAttributesImplBaseParcelizer = this.write.AudioAttributesImplBaseParcelizer();
        if (strAudioAttributesImplBaseParcelizer == null) {
            strAudioAttributesImplBaseParcelizer = "";
        }
        SecurityRequestBody securityRequestBody = new SecurityRequestBody(this.write.onRemoveQueueItem());
        securityRequestBody.drDvInfo = updateShuffleButton.IconCompatParcelizer(this.read, strAudioAttributesImplBaseParcelizer, str);
        securityRequestBody.appInfoRequestBody = read();
        return securityRequestBody;
    }

    private final AppInfoRequestBody read() {
        return new AppInfoRequestBody(this.write.onSkipToQueueItem(), this.write.onSkipToNext(), this.write.onStop(), this.write.onPrepare(), 496, this.write.onRemoveQueueItemAt());
    }
}
