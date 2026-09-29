package kotlin;

import com.clevertap.android.sdk.inapp.CTInAppNotification;
import com.clevertap.android.sdk.inapp.CTInAppNotificationMedia;
import com.clevertap.android.sdk.inapp.customtemplates.CustomTemplateInAppData;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.setIsPlaceholder;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0013B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ%\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J%\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u00152\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00110\u0016H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0013\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u001a\u0010\u0019J%\u0010\u001b\u001a\u00020\u00122\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00110\u00162\u0006\u0010\u0005\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001a\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u001dR\u0014\u0010\u0013\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001eR\u0014\u0010 \u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001fR\u0014\u0010\u001b\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010!R\u001b\u0010\u0017\u001a\u00020\t8CX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010\"\u001a\u0004\b\u0013\u0010#"}, d2 = {"Lo/lambdaupdateStateAndInformListeners52;", "", "Lo/SimpleBasePlayerPeriodData;", "p0", "Lo/handleRelease;", "p1", "Lo/isTypeSupported;", "p2", "Lkotlin/Function0;", "Lo/SimpleBasePlayerExternalSyntheticLambda6;", "p3", "", "p4", "<init>", "(Lo/SimpleBasePlayerPeriodData;Lo/handleRelease;Lo/isTypeSupported;Lo/getCreatedOnDateMs;Z)V", "Lorg/json/JSONObject;", "", "Lo/lambdaupdateStateAndInformListeners52$read;", "", "read", "(Lorg/json/JSONObject;Ljava/lang/String;Lo/lambdaupdateStateAndInformListeners52$read;)V", "Lcom/clevertap/android/sdk/inapp/CTInAppNotification;", "Ljava/lang/ref/WeakReference;", "AudioAttributesCompatParcelizer", "(Lcom/clevertap/android/sdk/inapp/CTInAppNotification;Ljava/lang/ref/WeakReference;)V", "(Lcom/clevertap/android/sdk/inapp/CTInAppNotification;)V", "IconCompatParcelizer", "write", "(Ljava/lang/ref/WeakReference;Lcom/clevertap/android/sdk/inapp/CTInAppNotification;)V", "Lo/SimpleBasePlayerPeriodData;", "Lo/handleRelease;", "Lo/isTypeSupported;", "RemoteActionCompatParcelizer", "Z", "Lo/RenewEligible;", "()Lo/SimpleBasePlayerExternalSyntheticLambda6;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class lambdaupdateStateAndInformListeners52 {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final SimpleBasePlayerPeriodData IconCompatParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final boolean write;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final RenewEligible AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final isTypeSupported RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final handleRelease read;

    public interface read {
        void RemoteActionCompatParcelizer(CTInAppNotification cTInAppNotification);
    }

    private lambdaupdateStateAndInformListeners52(SimpleBasePlayerPeriodData simpleBasePlayerPeriodData, handleRelease handlerelease, isTypeSupported istypesupported, getCreatedOnDateMs<SimpleBasePlayerExternalSyntheticLambda6> getcreatedondatems, boolean z) {
        toMagicModuleMetaRepoModel.write(simpleBasePlayerPeriodData, "");
        toMagicModuleMetaRepoModel.write(handlerelease, "");
        toMagicModuleMetaRepoModel.write(istypesupported, "");
        toMagicModuleMetaRepoModel.write(getcreatedondatems, "");
        this.IconCompatParcelizer = simpleBasePlayerPeriodData;
        this.read = handlerelease;
        this.RemoteActionCompatParcelizer = istypesupported;
        this.write = z;
        this.AudioAttributesCompatParcelizer = getRenewExpiresOn.RemoteActionCompatParcelizer(getcreatedondatems);
    }

    public /* synthetic */ lambdaupdateStateAndInformListeners52(SimpleBasePlayerPeriodData simpleBasePlayerPeriodData, handleRelease handlerelease, isTypeSupported istypesupported, getCreatedOnDateMs getcreatedondatems, boolean z, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(simpleBasePlayerPeriodData, handlerelease, istypesupported, getcreatedondatems, (i & 16) != 0 ? lambdaonDownstreamFormatChanged28.IconCompatParcelizer : z);
    }

    private final SimpleBasePlayerExternalSyntheticLambda6 read() {
        return (SimpleBasePlayerExternalSyntheticLambda6) this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer();
    }

    public final void read(final JSONObject p0, String p1, read p2) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        toMagicModuleMetaRepoModel.write(p2, "");
        final WeakReference weakReference = new WeakReference(p2);
        isTrackSupported istracksupportedAudioAttributesCompatParcelizer = this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer("TAG_FEATURE_IN_APPS");
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(istracksupportedAudioAttributesCompatParcelizer, "");
        istracksupportedAudioAttributesCompatParcelizer.read(p1, new Callable() { // from class: o.lambdaupdateStateAndInformListeners53
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return lambdaupdateStateAndInformListeners52.RemoteActionCompatParcelizer(p0, this, weakReference);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup RemoteActionCompatParcelizer(JSONObject jSONObject, lambdaupdateStateAndInformListeners52 lambdaupdatestateandinformlisteners52, WeakReference weakReference) {
        toMagicModuleMetaRepoModel.write(jSONObject, "");
        toMagicModuleMetaRepoModel.write(lambdaupdatestateandinformlisteners52, "");
        toMagicModuleMetaRepoModel.write(weakReference, "");
        CTInAppNotification cTInAppNotification = new CTInAppNotification(jSONObject, lambdaupdatestateandinformlisteners52.write);
        if (cTInAppNotification.getOnPrepareFromSearch() != null) {
            lambdaupdatestateandinformlisteners52.write(weakReference, cTInAppNotification);
            return getShowPopup.INSTANCE;
        }
        lambdaupdatestateandinformlisteners52.AudioAttributesCompatParcelizer(cTInAppNotification, weakReference);
        return getShowPopup.INSTANCE;
    }

    private final void AudioAttributesCompatParcelizer(CTInAppNotification p0, WeakReference<read> p1) {
        if (lambdaupdateStateAndInformListeners41.AudioAttributesImplApi21Parcelizer == p0.getWrite()) {
            read(p0);
        } else {
            IconCompatParcelizer(p0);
        }
        write(p1, p0);
    }

    private final void read(CTInAppNotification p0) {
        CustomTemplateInAppData onFastForward = p0.getOnFastForward();
        List<String> listIconCompatParcelizer = onFastForward != null ? onFastForward.IconCompatParcelizer(this.read) : IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
        Pair pair = new Pair(this.IconCompatParcelizer.getRead(), this.IconCompatParcelizer.getIconCompatParcelizer());
        for (String str : listIconCompatParcelizer) {
            byte[] bArrWrite = read().write(str);
            if (bArrWrite != null && bArrWrite.length != 0) {
                setIsPlaceholder.write writeVar = setIsPlaceholder.write;
                setIsPlaceholder.write.RemoteActionCompatParcelizer(new Pair(str, lambdaaddMediaItems3comgoogleandroidexoplayer2SimpleBasePlayer.RemoteActionCompatParcelizer), pair);
            } else {
                p0.RemoteActionCompatParcelizer("Error processing the custom code in-app template: file download failed.");
                return;
            }
        }
    }

    private final void IconCompatParcelizer(CTInAppNotification p0) {
        for (CTInAppNotificationMedia cTInAppNotificationMedia : p0.onAddQueueItem()) {
            if (cTInAppNotificationMedia.AudioAttributesCompatParcelizer()) {
                byte[] bArrAudioAttributesImplApi21Parcelizer = read().AudioAttributesImplApi21Parcelizer(cTInAppNotificationMedia.getRemoteActionCompatParcelizer());
                if (bArrAudioAttributesImplApi21Parcelizer == null || bArrAudioAttributesImplApi21Parcelizer.length == 0) {
                    p0.RemoteActionCompatParcelizer("Error processing GIF");
                    return;
                }
            } else if (cTInAppNotificationMedia.AudioAttributesImplApi21Parcelizer()) {
                if (read().AudioAttributesImplApi26Parcelizer(cTInAppNotificationMedia.getRemoteActionCompatParcelizer()) == null) {
                    p0.RemoteActionCompatParcelizer("Error processing image as bitmap was NULL");
                    return;
                }
            } else if (cTInAppNotificationMedia.AudioAttributesImplBaseParcelizer() || cTInAppNotificationMedia.read()) {
                if (!this.write) {
                    p0.RemoteActionCompatParcelizer("InApp Video/Audio is not supported");
                    return;
                }
            }
        }
    }

    private final void write(WeakReference<read> p0, final CTInAppNotification p1) {
        final read readVar = p0.get();
        if (readVar != null) {
            this.RemoteActionCompatParcelizer.write().read("InAppNotificationInflater:onNotificationReady", new Callable() { // from class: o.lambdaupdateStateAndInformListeners55
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return lambdaupdateStateAndInformListeners52.read(readVar, p1);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(read readVar, CTInAppNotification cTInAppNotification) {
        toMagicModuleMetaRepoModel.write(cTInAppNotification, "");
        readVar.RemoteActionCompatParcelizer(cTInAppNotification);
        return getShowPopup.INSTANCE;
    }
}
