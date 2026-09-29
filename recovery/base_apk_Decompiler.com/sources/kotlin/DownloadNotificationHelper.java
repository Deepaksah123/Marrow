package kotlin;

import android.content.Context;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class DownloadNotificationHelper {
    public static boolean AudioAttributesCompatParcelizer(Context context) {
        return new RtspMediaPeriodRtpLoadInfoExternalSyntheticLambda0(context, null, new excludeTrack()).MediaBrowserCompatCustomActionResultReceiver();
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [boolean] */
    public static boolean IconCompatParcelizer(Context context) {
        return r8lambdaQAwTGBaHnJis76pEz40bQxUjV4.RemoteActionCompatParcelizer(context) > 1 || DefaultTrackNameProvider.IconCompatParcelizer(context)._init_lambda3() > 0 || updateShuffleButton.write(context) > 0 || AudioAttributesCompatParcelizer(context) > 0;
    }

    public static JSONObject read(Context context) throws Throwable {
        RtspMediaPeriodRtpLoadInfoExternalSyntheticLambda0 rtspMediaPeriodRtpLoadInfoExternalSyntheticLambda0 = new RtspMediaPeriodRtpLoadInfoExternalSyntheticLambda0(context, null, new excludeTrack());
        getStreamPositionUsForContent getstreampositionusforcontentIconCompatParcelizer = DefaultTrackNameProvider.IconCompatParcelizer(context);
        int iRemoteActionCompatParcelizer = r8lambdaQAwTGBaHnJis76pEz40bQxUjV4.RemoteActionCompatParcelizer(context);
        int i_init_lambda3 = getstreampositionusforcontentIconCompatParcelizer._init_lambda3();
        int iWrite = updateShuffleButton.write(context);
        boolean zMediaBrowserCompatCustomActionResultReceiver = rtspMediaPeriodRtpLoadInfoExternalSyntheticLambda0.MediaBrowserCompatCustomActionResultReceiver();
        JSONObject jSONObject = new JSONObject();
        isDvbProfileDeclared.read(jSONObject, "rooting_status", Integer.valueOf(iRemoteActionCompatParcelizer));
        isDvbProfileDeclared.read(jSONObject, "screen_secure_status", Integer.valueOf(i_init_lambda3));
        isDvbProfileDeclared.read(jSONObject, "mobile_status", Integer.valueOf(iWrite));
        isDvbProfileDeclared.read(jSONObject, "safety_net_status", (Number) (-1));
        isDvbProfileDeclared.read(jSONObject, "casting_status", Integer.valueOf(zMediaBrowserCompatCustomActionResultReceiver ? 1 : 0));
        return jSONObject;
    }

    public static JSONObject write(Context context) throws Throwable {
        JSONObject jSONObjectIconCompatParcelizer = new RtspMediaPeriodRtpLoadInfoExternalSyntheticLambda0(context, null, new excludeTrack()).IconCompatParcelizer();
        JSONObject jSONObjectAudioAttributesCompatParcelizer = r8lambdaQAwTGBaHnJis76pEz40bQxUjV4.AudioAttributesCompatParcelizer(context);
        JSONObject jSONObjectWrite = updateButton.write(context);
        JSONObject jSONObjectRemoteActionCompatParcelizer = updateShuffleButton.RemoteActionCompatParcelizer(context);
        JSONObject jSONObjectAudioAttributesCompatParcelizer2 = getTrackName.AudioAttributesCompatParcelizer(context);
        JSONObject jSONObject = new JSONObject();
        isDvbProfileDeclared.read(jSONObject, "casting_info", jSONObjectIconCompatParcelizer);
        isDvbProfileDeclared.read(jSONObject, "rooting_detail_info", jSONObjectAudioAttributesCompatParcelizer);
        isDvbProfileDeclared.read(jSONObject, "mobile_status_info", jSONObjectRemoteActionCompatParcelizer);
        isDvbProfileDeclared.read(jSONObject, "user_sign_info", jSONObjectWrite);
        isDvbProfileDeclared.read(jSONObject, "connection_info", jSONObjectAudioAttributesCompatParcelizer2);
        return jSONObject;
    }
}
