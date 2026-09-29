package kotlin;

import android.content.Context;
import android.os.Bundle;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.google.android.exoplayer2.source.rtsp.SessionDescription;

/* JADX INFO: loaded from: classes2.dex */
public final class getAdGroupCount implements setAdPositionMs {
    @Override // kotlin.setAdPositionMs
    public final boolean IconCompatParcelizer(Context context, Bundle bundle, int i) {
        return false;
    }

    /* synthetic */ getAdGroupCount(byte b) {
        this();
    }

    static class write {
        private static final getAdGroupCount IconCompatParcelizer = new getAdGroupCount(0);
    }

    public static setCurrentAd IconCompatParcelizer() {
        return write.IconCompatParcelizer;
    }

    public static boolean IconCompatParcelizer(Bundle bundle) {
        if (bundle == null) {
            return false;
        }
        String string = bundle.getString("pt_id");
        return (SessionDescription.SUPPORTED_SDP_VERSION.equals(string) || string == null || string.isEmpty()) ? false : true;
    }

    private static boolean AudioAttributesCompatParcelizer(Bundle bundle) {
        if (bundle == null) {
            return false;
        }
        return "signedcall".equals(bundle.getString("source"));
    }

    private getAdGroupCount() {
    }

    @Override // kotlin.setCurrentAd
    public final boolean RemoteActionCompatParcelizer(Context context, Bundle bundle, String str) {
        synchronized (this) {
            bundle.putLong("omr_invoke_time_in_millis", System.currentTimeMillis());
            PlayerTimelineChangeReason playerTimelineChangeReasonWrite = PlayerTimelineChangeReason.write(context, getAdState.RemoteActionCompatParcelizer(bundle));
            if (!PlayerTimelineChangeReason.write(bundle).IconCompatParcelizer) {
                return false;
            }
            if (playerTimelineChangeReasonWrite != null) {
                CleverTapInstanceConfig cleverTapInstanceConfigAudioAttributesImplApi26Parcelizer = playerTimelineChangeReasonWrite.MediaBrowserCompatCustomActionResultReceiver().AudioAttributesImplApi26Parcelizer();
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append("received notification from CleverTap: ");
                sb.append(bundle.toString());
                cleverTapInstanceConfigAudioAttributesImplApi26Parcelizer.read("PushProvider", sb.toString());
                if (IconCompatParcelizer(bundle) && PlayerTimelineChangeReason.read() != null) {
                    PlayerTimelineChangeReason.read().RemoteActionCompatParcelizer(context, bundle, str);
                } else {
                    if (AudioAttributesCompatParcelizer(bundle)) {
                        PlayerTimelineChangeReason.AudioAttributesCompatParcelizer();
                    }
                    playerTimelineChangeReasonWrite.write(new TimelineExternalSyntheticLambda0(), context, bundle);
                }
            } else {
                bundle.toString();
                RendererWakeupListener.AudioAttributesImplApi21Parcelizer();
                RendererWakeupListener.AudioAttributesImplApi21Parcelizer();
            }
            return true;
        }
    }
}
