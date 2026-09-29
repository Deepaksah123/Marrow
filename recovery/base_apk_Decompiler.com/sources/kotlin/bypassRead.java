package kotlin;

import android.content.res.Resources;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import java.util.Arrays;
import java.util.MissingFormatArgumentException;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: loaded from: classes5.dex */
public final class bypassRead {
    private final Bundle write;

    public bypassRead(Bundle bundle) {
        if (bundle == null) {
            throw new NullPointerException("data");
        }
        this.write = new Bundle(bundle);
    }

    final Integer AudioAttributesCompatParcelizer() {
        Integer numAudioAttributesImplBaseParcelizer = AudioAttributesImplBaseParcelizer("gcm.n.notification_count");
        if (numAudioAttributesImplBaseParcelizer == null) {
            return null;
        }
        if (numAudioAttributesImplBaseParcelizer.intValue() >= 0) {
            return numAudioAttributesImplBaseParcelizer;
        }
        Objects.toString(numAudioAttributesImplBaseParcelizer);
        return null;
    }

    final Integer read() {
        Integer numAudioAttributesImplBaseParcelizer = AudioAttributesImplBaseParcelizer("gcm.n.notification_priority");
        if (numAudioAttributesImplBaseParcelizer == null) {
            return null;
        }
        if (numAudioAttributesImplBaseParcelizer.intValue() >= -2 && numAudioAttributesImplBaseParcelizer.intValue() <= 2) {
            return numAudioAttributesImplBaseParcelizer;
        }
        Objects.toString(numAudioAttributesImplBaseParcelizer);
        return null;
    }

    final Integer AudioAttributesImplApi21Parcelizer() {
        Integer numAudioAttributesImplBaseParcelizer = AudioAttributesImplBaseParcelizer("gcm.n.visibility");
        if (numAudioAttributesImplBaseParcelizer == null) {
            return null;
        }
        if (numAudioAttributesImplBaseParcelizer.intValue() >= -1 && numAudioAttributesImplBaseParcelizer.intValue() <= 1) {
            return numAudioAttributesImplBaseParcelizer;
        }
        Objects.toString(numAudioAttributesImplBaseParcelizer);
        return null;
    }

    public final String write(String str) {
        return this.write.getString(MediaBrowserCompatItemReceiver(str));
    }

    private String MediaBrowserCompatItemReceiver(String str) {
        if (!this.write.containsKey(str) && str.startsWith("gcm.n.")) {
            String strAudioAttributesImplApi21Parcelizer = AudioAttributesImplApi21Parcelizer(str);
            if (this.write.containsKey(strAudioAttributesImplApi21Parcelizer)) {
                return strAudioAttributesImplApi21Parcelizer;
            }
        }
        return str;
    }

    public final boolean RemoteActionCompatParcelizer(String str) {
        String strWrite = write(str);
        return IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE.equals(strWrite) || Boolean.parseBoolean(strWrite);
    }

    private Integer AudioAttributesImplBaseParcelizer(String str) {
        String strWrite = write(str);
        if (TextUtils.isEmpty(strWrite)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(strWrite));
        } catch (NumberFormatException unused) {
            AudioAttributesImplApi26Parcelizer(str);
            return null;
        }
    }

    public final Long read(String str) {
        String strWrite = write(str);
        if (TextUtils.isEmpty(strWrite)) {
            return null;
        }
        try {
            return Long.valueOf(Long.parseLong(strWrite));
        } catch (NumberFormatException unused) {
            AudioAttributesImplApi26Parcelizer(str);
            return null;
        }
    }

    private String RatingCompat(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("_loc_key");
        return write(sb.toString());
    }

    private Object[] MediaMetadataCompat(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("_loc_args");
        JSONArray jSONArrayMediaBrowserCompatMediaItem = MediaBrowserCompatMediaItem(sb.toString());
        if (jSONArrayMediaBrowserCompatMediaItem == null) {
            return null;
        }
        int length = jSONArrayMediaBrowserCompatMediaItem.length();
        String[] strArr = new String[length];
        for (int i = 0; i < length; i++) {
            strArr[i] = jSONArrayMediaBrowserCompatMediaItem.optString(i);
        }
        return strArr;
    }

    private JSONArray MediaBrowserCompatMediaItem(String str) {
        String strWrite = write(str);
        if (TextUtils.isEmpty(strWrite)) {
            return null;
        }
        try {
            return new JSONArray(strWrite);
        } catch (JSONException unused) {
            AudioAttributesImplApi26Parcelizer(str);
            return null;
        }
    }

    private static String AudioAttributesImplApi26Parcelizer(String str) {
        return str.startsWith("gcm.n.") ? str.substring(6) : str;
    }

    public final Uri RemoteActionCompatParcelizer() {
        String strWrite = write("gcm.n.link_android");
        if (TextUtils.isEmpty(strWrite)) {
            strWrite = write("gcm.n.link");
        }
        if (TextUtils.isEmpty(strWrite)) {
            return null;
        }
        return Uri.parse(strWrite);
    }

    public final String AudioAttributesImplApi26Parcelizer() {
        String strWrite = write("gcm.n.sound2");
        return TextUtils.isEmpty(strWrite) ? write("gcm.n.sound") : strWrite;
    }

    public final long[] MediaBrowserCompatCustomActionResultReceiver() {
        JSONArray jSONArrayMediaBrowserCompatMediaItem = MediaBrowserCompatMediaItem("gcm.n.vibrate_timings");
        if (jSONArrayMediaBrowserCompatMediaItem == null) {
            return null;
        }
        try {
            if (jSONArrayMediaBrowserCompatMediaItem.length() <= 1) {
                throw new JSONException("vibrateTimings have invalid length");
            }
            int length = jSONArrayMediaBrowserCompatMediaItem.length();
            long[] jArr = new long[length];
            for (int i = 0; i < length; i++) {
                jArr[i] = jSONArrayMediaBrowserCompatMediaItem.optLong(i);
            }
            return jArr;
        } catch (NumberFormatException | JSONException unused) {
            Objects.toString(jSONArrayMediaBrowserCompatMediaItem);
            return null;
        }
    }

    final int[] IconCompatParcelizer() {
        JSONArray jSONArrayMediaBrowserCompatMediaItem = MediaBrowserCompatMediaItem("gcm.n.light_settings");
        if (jSONArrayMediaBrowserCompatMediaItem == null) {
            return null;
        }
        int[] iArr = new int[3];
        try {
            if (jSONArrayMediaBrowserCompatMediaItem.length() != 3) {
                throw new JSONException("lightSettings don't have all three fields");
            }
            iArr[0] = IconCompatParcelizer(jSONArrayMediaBrowserCompatMediaItem.optString(0));
            iArr[1] = jSONArrayMediaBrowserCompatMediaItem.optInt(1);
            iArr[2] = jSONArrayMediaBrowserCompatMediaItem.optInt(2);
            return iArr;
        } catch (IllegalArgumentException e) {
            Objects.toString(jSONArrayMediaBrowserCompatMediaItem);
            e.getMessage();
            return null;
        } catch (JSONException unused) {
            Objects.toString(jSONArrayMediaBrowserCompatMediaItem);
            return null;
        }
    }

    public final Bundle AudioAttributesImplBaseParcelizer() {
        Bundle bundle = new Bundle(this.write);
        for (String str : this.write.keySet()) {
            if (MediaBrowserCompatCustomActionResultReceiver(str)) {
                bundle.remove(str);
            }
        }
        return bundle;
    }

    public final Bundle MediaBrowserCompatItemReceiver() {
        Bundle bundle = new Bundle(this.write);
        for (String str : this.write.keySet()) {
            if (!AudioAttributesCompatParcelizer(str)) {
                bundle.remove(str);
            }
        }
        return bundle;
    }

    private String read(Resources resources, String str, String str2) {
        String strRatingCompat = RatingCompat(str2);
        if (TextUtils.isEmpty(strRatingCompat)) {
            return null;
        }
        int identifier = resources.getIdentifier(strRatingCompat, "string", str);
        if (identifier == 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append("_loc_key");
            AudioAttributesImplApi26Parcelizer(sb.toString());
            return null;
        }
        Object[] objArrMediaMetadataCompat = MediaMetadataCompat(str2);
        if (objArrMediaMetadataCompat == null) {
            return resources.getString(identifier);
        }
        try {
            return resources.getString(identifier, objArrMediaMetadataCompat);
        } catch (MissingFormatArgumentException unused) {
            AudioAttributesImplApi26Parcelizer(str2);
            Arrays.toString(objArrMediaMetadataCompat);
            return null;
        }
    }

    public final String write(Resources resources, String str, String str2) {
        String strWrite = write(str2);
        return !TextUtils.isEmpty(strWrite) ? strWrite : read(resources, str, str2);
    }

    public final String write() {
        return write("gcm.n.android_channel_id");
    }

    private static boolean AudioAttributesCompatParcelizer(String str) {
        return str.startsWith("google.c.a.") || str.equals("from");
    }

    private static boolean MediaBrowserCompatCustomActionResultReceiver(String str) {
        return str.startsWith("google.c.") || str.startsWith("gcm.n.") || str.startsWith("gcm.notification.");
    }

    private static int IconCompatParcelizer(String str) {
        int color = Color.parseColor(str);
        if (color != -16777216) {
            return color;
        }
        throw new IllegalArgumentException("Transparent color is invalid");
    }

    public static boolean write(Bundle bundle) {
        return IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE.equals(bundle.getString("gcm.n.e")) || IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE.equals(bundle.getString(AudioAttributesImplApi21Parcelizer("gcm.n.e")));
    }

    private static String AudioAttributesImplApi21Parcelizer(String str) {
        return !str.startsWith("gcm.n.") ? str : str.replace("gcm.n.", "gcm.notification.");
    }
}
