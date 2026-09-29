package kotlin;

import android.content.Context;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.firebase.FirebaseApp;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
@getPlanOldPrice
public class updateCodecOperatingRate {
    private static final MediaCodecRendererDecoderInitializationException AudioAttributesCompatParcelizer = MediaCodecRendererDecoderInitializationException.IconCompatParcelizer();
    private final onInputBufferAvailable<DrmUtilApi18> AudioAttributesImplApi21Parcelizer;
    private final MediaCodecUtilExternalSyntheticLambda3 AudioAttributesImplApi26Parcelizer;
    private final Map<String, String> AudioAttributesImplBaseParcelizer = new ConcurrentHashMap();
    private final onInputBufferAvailable<ChapterTocFrame1> IconCompatParcelizer;
    private Boolean MediaBrowserCompatItemReceiver;
    private final FirebaseApp RemoteActionCompatParcelizer;
    private final maybeInitCodecOrBypass read;
    private final hasSamples write;

    public static updateCodecOperatingRate read() {
        return (updateCodecOperatingRate) FirebaseApp.write().AudioAttributesCompatParcelizer(updateCodecOperatingRate.class);
    }

    @setSdkPayload
    updateCodecOperatingRate(FirebaseApp firebaseApp, onInputBufferAvailable<ChapterTocFrame1> oninputbufferavailable, hasSamples hassamples, onInputBufferAvailable<DrmUtilApi18> oninputbufferavailable2, onProcessedOutputBuffer onprocessedoutputbuffer, maybeInitCodecOrBypass maybeinitcodecorbypass, getDecoderInfosInternal getdecoderinfosinternal) {
        this.MediaBrowserCompatItemReceiver = null;
        this.RemoteActionCompatParcelizer = firebaseApp;
        this.IconCompatParcelizer = oninputbufferavailable;
        this.write = hassamples;
        this.AudioAttributesImplApi21Parcelizer = oninputbufferavailable2;
        if (firebaseApp == null) {
            this.MediaBrowserCompatItemReceiver = Boolean.FALSE;
            this.read = maybeinitcodecorbypass;
            this.AudioAttributesImplApi26Parcelizer = new MediaCodecUtilExternalSyntheticLambda3(new Bundle());
            return;
        }
        sortByScore.read().read(firebaseApp, hassamples, oninputbufferavailable2);
        Context contextAudioAttributesCompatParcelizer = firebaseApp.AudioAttributesCompatParcelizer();
        MediaCodecUtilExternalSyntheticLambda3 mediaCodecUtilExternalSyntheticLambda3 = read(contextAudioAttributesCompatParcelizer);
        this.AudioAttributesImplApi26Parcelizer = mediaCodecUtilExternalSyntheticLambda3;
        onprocessedoutputbuffer.read(oninputbufferavailable);
        this.read = maybeinitcodecorbypass;
        maybeinitcodecorbypass.AudioAttributesCompatParcelizer(mediaCodecUtilExternalSyntheticLambda3);
        maybeinitcodecorbypass.read(contextAudioAttributesCompatParcelizer);
        getdecoderinfosinternal.RemoteActionCompatParcelizer(contextAudioAttributesCompatParcelizer);
        this.MediaBrowserCompatItemReceiver = maybeinitcodecorbypass.write();
        if (AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer() && IconCompatParcelizer()) {
            new Object[]{setLogSessionIdToMediaCodecFormat.read(firebaseApp.read().write(), contextAudioAttributesCompatParcelizer.getPackageName())};
        }
    }

    private boolean IconCompatParcelizer() {
        Boolean bool = this.MediaBrowserCompatItemReceiver;
        if (bool != null) {
            return bool.booleanValue();
        }
        return FirebaseApp.write().AudioAttributesImplApi26Parcelizer();
    }

    public final Map<String, String> AudioAttributesCompatParcelizer() {
        return new HashMap(this.AudioAttributesImplBaseParcelizer);
    }

    private static MediaCodecUtilExternalSyntheticLambda3 read(Context context) {
        Bundle bundle;
        try {
            bundle = ((PackageItemInfo) context.getPackageManager().getApplicationInfo(context.getPackageName(), 128)).metaData;
        } catch (PackageManager.NameNotFoundException | NullPointerException e) {
            e.getMessage();
            bundle = null;
        }
        return bundle != null ? new MediaCodecUtilExternalSyntheticLambda3(bundle) : new MediaCodecUtilExternalSyntheticLambda3();
    }
}
