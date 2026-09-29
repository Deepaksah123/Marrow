package kotlin;

import android.content.Context;
import android.content.pm.PackageItemInfo;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import kotlin.RendererCapabilitiesAdaptiveSupport;
import kotlin.SimpleExoPlayer;
import kotlin._coercedTypeDesc;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes2.dex */
public final class TimelineExternalSyntheticLambda0 implements getAdCountInAdGroup, setAvailableCommands {
    private String IconCompatParcelizer;
    private int RemoteActionCompatParcelizer;
    private String write;

    @Override // kotlin.getAdCountInAdGroup
    public final Object read(Bundle bundle) {
        return bundle.get("wzrk_ck");
    }

    @Override // kotlin.getAdCountInAdGroup
    public final String AudioAttributesCompatParcelizer(Bundle bundle) {
        String string = bundle.getString("nm");
        this.IconCompatParcelizer = string;
        return string;
    }

    @Override // kotlin.getAdCountInAdGroup
    public final String RemoteActionCompatParcelizer(Bundle bundle, Context context) {
        String string = bundle.getString("nt", "");
        if (string.isEmpty()) {
            string = ((PackageItemInfo) context.getApplicationInfo()).name;
        }
        this.write = string;
        return string;
    }

    private static Uri IconCompatParcelizer(String str, Context context, CleverTapInstanceConfig cleverTapInstanceConfig) {
        return RendererCapabilitiesListener.AudioAttributesCompatParcelizer(str, context, cleverTapInstanceConfig, onDroppedVideoFrames.IconCompatParcelizer);
    }

    private static SimpleExoPlayer RemoteActionCompatParcelizer(String str, Context context, CleverTapInstanceConfig cleverTapInstanceConfig) {
        if (str == null || !str.startsWith("http")) {
            r8lambda3UPcXNC6yMkWYB4Djn0NvTHj24 r8lambda3upcxnc6ymkwyb4djn0nvthj24 = r8lambda3UPcXNC6yMkWYB4Djn0NvTHj24.RemoteActionCompatParcelizer;
            return r8lambda3UPcXNC6yMkWYB4Djn0NvTHj24.read(SimpleExoPlayer.write.RemoteActionCompatParcelizer);
        }
        r8lambda3UPcXNC6yMkWYB4Djn0NvTHj24 r8lambda3upcxnc6ymkwyb4djn0nvthj242 = r8lambda3UPcXNC6yMkWYB4Djn0NvTHj24.RemoteActionCompatParcelizer;
        SimpleExoPlayer simpleExoPlayerAudioAttributesCompatParcelizer = r8lambda3UPcXNC6yMkWYB4Djn0NvTHj24.read(SimpleExoPlayer.write.IconCompatParcelizer);
        try {
            simpleExoPlayerAudioAttributesCompatParcelizer = RendererCapabilitiesListener.AudioAttributesCompatParcelizer(str, false, context, cleverTapInstanceConfig, 5000L);
            if (simpleExoPlayerAudioAttributesCompatParcelizer.getRead() != null) {
                simpleExoPlayerAudioAttributesCompatParcelizer.getWrite();
                cleverTapInstanceConfig.MediaBrowserCompatItemReceiver().read();
            }
            return simpleExoPlayerAudioAttributesCompatParcelizer;
        } catch (Throwable unused) {
            RendererWakeupListener rendererWakeupListenerMediaBrowserCompatItemReceiver = cleverTapInstanceConfig.MediaBrowserCompatItemReceiver();
            cleverTapInstanceConfig.write();
            rendererWakeupListenerMediaBrowserCompatItemReceiver.IconCompatParcelizer();
            return simpleExoPlayerAudioAttributesCompatParcelizer;
        }
    }

    private static void write(_coercedTypeDesc.RatingCompat ratingCompat, Bundle bundle, Context context) {
        if (Build.VERSION.SDK_INT < 31 || !(ratingCompat instanceof _coercedTypeDesc.read)) {
            return;
        }
        ((_coercedTypeDesc.read) ratingCompat).read((CharSequence) bundle.getString("alt_text_wzrk_bp", context.getString(RendererCapabilitiesAdaptiveSupport.RemoteActionCompatParcelizer.ct_notification_big_picture_alt_text)));
    }

    private _coercedTypeDesc.RatingCompat read(Bundle bundle, Context context, CleverTapInstanceConfig cleverTapInstanceConfig) {
        Uri uriIconCompatParcelizer;
        String string = bundle.getString("wzrk_bp");
        String string2 = bundle.getString("wzrk_gif");
        String string3 = bundle.getString("wzrk_nms", this.IconCompatParcelizer);
        try {
            if (Build.VERSION.SDK_INT >= 34 && string2 != null && string2.startsWith("http") && (uriIconCompatParcelizer = IconCompatParcelizer(string2, context, cleverTapInstanceConfig)) != null) {
                _coercedTypeDesc.read readVarAudioAttributesCompatParcelizer = new _coercedTypeDesc.read().AudioAttributesCompatParcelizer(string3).AudioAttributesCompatParcelizer(Icon.createWithContentUri(uriIconCompatParcelizer));
                write(readVarAudioAttributesCompatParcelizer, bundle, context);
                bundle.putString("wzrk_bpds", SimpleExoPlayer.write.read.getAudioAttributesCompatParcelizer());
                return readVarAudioAttributesCompatParcelizer;
            }
        } catch (Exception unused) {
            RendererWakeupListener rendererWakeupListenerMediaBrowserCompatItemReceiver = cleverTapInstanceConfig.MediaBrowserCompatItemReceiver();
            cleverTapInstanceConfig.write();
            rendererWakeupListenerMediaBrowserCompatItemReceiver.IconCompatParcelizer();
        }
        SimpleExoPlayer simpleExoPlayerRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(string, context, cleverTapInstanceConfig);
        bundle.putString("wzrk_bpds", simpleExoPlayerRemoteActionCompatParcelizer.getAudioAttributesCompatParcelizer().getAudioAttributesCompatParcelizer());
        try {
            Bitmap read = simpleExoPlayerRemoteActionCompatParcelizer.getRead();
            if (read != null) {
                _coercedTypeDesc.read readVarWrite = new _coercedTypeDesc.read().AudioAttributesCompatParcelizer(string3).write(read);
                write(readVarWrite, bundle, context);
                return readVarWrite;
            }
        } catch (Exception unused2) {
            RendererWakeupListener rendererWakeupListenerMediaBrowserCompatItemReceiver2 = cleverTapInstanceConfig.MediaBrowserCompatItemReceiver();
            cleverTapInstanceConfig.write();
            rendererWakeupListenerMediaBrowserCompatItemReceiver2.IconCompatParcelizer();
        }
        return new _coercedTypeDesc.AudioAttributesImplApi21Parcelizer().AudioAttributesCompatParcelizer(this.IconCompatParcelizer);
    }

    @Override // kotlin.getAdCountInAdGroup
    public final _coercedTypeDesc.AudioAttributesImplBaseParcelizer write(Bundle bundle, Context context, _coercedTypeDesc.AudioAttributesImplBaseParcelizer audioAttributesImplBaseParcelizer, CleverTapInstanceConfig cleverTapInstanceConfig, int i) {
        _coercedTypeDesc.RatingCompat ratingCompat = read(bundle, context, cleverTapInstanceConfig);
        AudioAttributesCompatParcelizer(bundle, context, audioAttributesImplBaseParcelizer, cleverTapInstanceConfig, i);
        return RemoteActionCompatParcelizer(audioAttributesImplBaseParcelizer, bundle, context, cleverTapInstanceConfig, ratingCompat);
    }

    private void AudioAttributesCompatParcelizer(Bundle bundle, Context context, _coercedTypeDesc.AudioAttributesImplBaseParcelizer audioAttributesImplBaseParcelizer, CleverTapInstanceConfig cleverTapInstanceConfig, int i) {
        String string = bundle.getString("wzrk_acts");
        if (string != null) {
            try {
                read(context, bundle, i, audioAttributesImplBaseParcelizer, new JSONArray(string));
            } catch (Throwable th) {
                RendererWakeupListener rendererWakeupListenerMediaBrowserCompatItemReceiver = cleverTapInstanceConfig.MediaBrowserCompatItemReceiver();
                String strWrite = cleverTapInstanceConfig.write();
                StringBuilder sb = new StringBuilder("error parsing notification actions: ");
                sb.append(th.getLocalizedMessage());
                rendererWakeupListenerMediaBrowserCompatItemReceiver.IconCompatParcelizer(strWrite, sb.toString());
            }
        }
    }

    private _coercedTypeDesc.AudioAttributesImplBaseParcelizer RemoteActionCompatParcelizer(_coercedTypeDesc.AudioAttributesImplBaseParcelizer audioAttributesImplBaseParcelizer, Bundle bundle, Context context, CleverTapInstanceConfig cleverTapInstanceConfig, _coercedTypeDesc.RatingCompat ratingCompat) {
        if (bundle.containsKey("wzrk_st")) {
            audioAttributesImplBaseParcelizer.AudioAttributesImplApi21Parcelizer(bundle.getString("wzrk_st"));
        }
        if (bundle.containsKey("wzrk_clr")) {
            audioAttributesImplBaseParcelizer.IconCompatParcelizer(Color.parseColor(bundle.getString("wzrk_clr")));
            audioAttributesImplBaseParcelizer.AudioAttributesCompatParcelizer(true);
        }
        audioAttributesImplBaseParcelizer.RemoteActionCompatParcelizer((CharSequence) this.write).read((CharSequence) this.IconCompatParcelizer).read(getAdGroupIndexForPositionUs.IconCompatParcelizer(bundle, context)).RemoteActionCompatParcelizer(true).read(ratingCompat).MediaBrowserCompatItemReceiver(this.RemoteActionCompatParcelizer);
        String string = bundle.getString("ico");
        if (!"true".equalsIgnoreCase(bundle.getString("wzrk_hide_large_icon"))) {
            audioAttributesImplBaseParcelizer.AudioAttributesCompatParcelizer(RendererCapabilitiesListener.AudioAttributesCompatParcelizer(string, true, context, cleverTapInstanceConfig, 2000L).getRead());
        }
        return audioAttributesImplBaseParcelizer;
    }

    @Override // kotlin.getAdCountInAdGroup
    public final void write(int i, Context context) {
        this.RemoteActionCompatParcelizer = i;
    }

    @Override // kotlin.getAdCountInAdGroup
    public final String AudioAttributesCompatParcelizer() {
        return "ico";
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x007a  */
    @Override // kotlin.setAvailableCommands
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final o._coercedTypeDesc.AudioAttributesImplBaseParcelizer RemoteActionCompatParcelizer(android.content.Context r2, android.os.Bundle r3, o._coercedTypeDesc.AudioAttributesImplBaseParcelizer r4, com.clevertap.android.sdk.CleverTapInstanceConfig r5) {
        /*
            r1 = this;
            java.lang.String r1 = "wzrk_sound"
            boolean r0 = r3.containsKey(r1)     // Catch: java.lang.Throwable -> L81
            if (r0 == 0) goto L80
            java.lang.Object r1 = r3.get(r1)     // Catch: java.lang.Throwable -> L81
            boolean r3 = r1 instanceof java.lang.Boolean     // Catch: java.lang.Throwable -> L81
            r0 = 2
            if (r3 == 0) goto L1f
            r3 = r1
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch: java.lang.Throwable -> L81
            boolean r3 = r3.booleanValue()     // Catch: java.lang.Throwable -> L81
            if (r3 == 0) goto L1f
            android.net.Uri r1 = android.media.RingtoneManager.getDefaultUri(r0)     // Catch: java.lang.Throwable -> L81
            goto L7b
        L1f:
            boolean r3 = r1 instanceof java.lang.String
            if (r3 == 0) goto L7a
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L81
            java.lang.String r3 = "true"
            boolean r3 = r1.equals(r3)     // Catch: java.lang.Throwable -> L81
            if (r3 == 0) goto L32
            android.net.Uri r1 = android.media.RingtoneManager.getDefaultUri(r0)     // Catch: java.lang.Throwable -> L81
            goto L7b
        L32:
            boolean r3 = r1.isEmpty()     // Catch: java.lang.Throwable -> L81
            if (r3 != 0) goto L7a
            java.lang.String r3 = ".mp3"
            boolean r3 = r1.contains(r3)     // Catch: java.lang.Throwable -> L81
            if (r3 != 0) goto L50
            java.lang.String r3 = ".ogg"
            boolean r3 = r1.contains(r3)     // Catch: java.lang.Throwable -> L81
            if (r3 != 0) goto L50
            java.lang.String r3 = ".wav"
            boolean r3 = r1.contains(r3)     // Catch: java.lang.Throwable -> L81
            if (r3 == 0) goto L5b
        L50:
            int r3 = r1.length()     // Catch: java.lang.Throwable -> L81
            int r3 = r3 + (-4)
            r0 = 0
            java.lang.String r1 = r1.substring(r0, r3)     // Catch: java.lang.Throwable -> L81
        L5b:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L81
            java.lang.String r0 = "android.resource://"
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L81
            java.lang.String r2 = r2.getPackageName()     // Catch: java.lang.Throwable -> L81
            r3.append(r2)     // Catch: java.lang.Throwable -> L81
            java.lang.String r2 = "/raw/"
            r3.append(r2)     // Catch: java.lang.Throwable -> L81
            r3.append(r1)     // Catch: java.lang.Throwable -> L81
            java.lang.String r1 = r3.toString()     // Catch: java.lang.Throwable -> L81
            android.net.Uri r1 = android.net.Uri.parse(r1)     // Catch: java.lang.Throwable -> L81
            goto L7b
        L7a:
            r1 = 0
        L7b:
            if (r1 == 0) goto L80
            r4.AudioAttributesCompatParcelizer(r1)     // Catch: java.lang.Throwable -> L81
        L80:
            return r4
        L81:
            o.RendererWakeupListener r1 = r5.MediaBrowserCompatItemReceiver()
            r5.write()
            r1.write()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.TimelineExternalSyntheticLambda0.RemoteActionCompatParcelizer(android.content.Context, android.os.Bundle, o._coercedTypeDesc$AudioAttributesImplBaseParcelizer, com.clevertap.android.sdk.CleverTapInstanceConfig):o._coercedTypeDesc$AudioAttributesImplBaseParcelizer");
    }
}
