package kotlin;

import android.content.Context;
import android.text.TextUtils;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import java.util.Iterator;
import kotlin.getPeriodIndexFromWindowPosition;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class setPlayerError {
    private final Context IconCompatParcelizer;
    private getPeriodIndexFromWindowPosition RemoteActionCompatParcelizer;
    private final CleverTapInstanceConfig write;

    public setPlayerError(Context context, CleverTapInstanceConfig cleverTapInstanceConfig, getPeriodIndexFromWindowPosition getperiodindexfromwindowposition) {
        this.IconCompatParcelizer = context;
        this.write = cleverTapInstanceConfig;
        this.RemoteActionCompatParcelizer = getperiodindexfromwindowposition;
    }

    public setPlayerError(Context context, CleverTapInstanceConfig cleverTapInstanceConfig) {
        this.IconCompatParcelizer = context;
        this.write = cleverTapInstanceConfig;
    }

    public final void write(String str, String str2, String str3) {
        if (str == null || str2 == null || str3 == null) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        sb.append("_");
        sb.append(str3);
        String string = sb.toString();
        JSONObject jSONObjectAudioAttributesImplApi26Parcelizer = AudioAttributesImplApi26Parcelizer();
        if (jSONObjectAudioAttributesImplApi26Parcelizer.optString(string).equals(str)) {
            return;
        }
        try {
            jSONObjectAudioAttributesImplApi26Parcelizer.put(string, str);
            String strIconCompatParcelizer = this.RemoteActionCompatParcelizer.IconCompatParcelizer(jSONObjectAudioAttributesImplApi26Parcelizer.toString(), str2, getPeriodIndexFromWindowPosition.AudioAttributesCompatParcelizer.read);
            if (strIconCompatParcelizer == null) {
                strIconCompatParcelizer = jSONObjectAudioAttributesImplApi26Parcelizer.toString();
                this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer();
            }
            IconCompatParcelizer(strIconCompatParcelizer, jSONObjectAudioAttributesImplApi26Parcelizer.length());
        } catch (Throwable th) {
            this.write.MediaBrowserCompatItemReceiver().write(this.write.write(), "Error caching guid: ".concat(String.valueOf(th)));
        }
    }

    public final void RemoteActionCompatParcelizer(String str, String str2) {
        if (str == null || str2 == null) {
            return;
        }
        JSONObject jSONObjectAudioAttributesImplApi26Parcelizer = AudioAttributesImplApi26Parcelizer();
        try {
            Iterator<String> itKeys = jSONObjectAudioAttributesImplApi26Parcelizer.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                if (next.toLowerCase().contains(str2.toLowerCase()) && jSONObjectAudioAttributesImplApi26Parcelizer.getString(next).equals(str)) {
                    jSONObjectAudioAttributesImplApi26Parcelizer.remove(next);
                    IconCompatParcelizer(jSONObjectAudioAttributesImplApi26Parcelizer.toString(), jSONObjectAudioAttributesImplApi26Parcelizer.length());
                }
            }
        } catch (Throwable th) {
            this.write.MediaBrowserCompatItemReceiver().write(this.write.write(), "Error removing cached key: ".concat(String.valueOf(th)));
        }
    }

    public final boolean RemoteActionCompatParcelizer() {
        boolean z = MediaBrowserCompatItemReceiver() > 1;
        CleverTapInstanceConfig cleverTapInstanceConfig = this.write;
        StringBuilder sb = new StringBuilder("deviceIsMultiUser:[");
        sb.append(z);
        sb.append("]");
        cleverTapInstanceConfig.read("ON_USER_LOGIN", sb.toString());
        return z;
    }

    private String IconCompatParcelizer() {
        String strIconCompatParcelizer = RendererCapabilitiesFormatSupport.IconCompatParcelizer(this.IconCompatParcelizer, this.write, "cachedGUIDsKey", null);
        CleverTapInstanceConfig cleverTapInstanceConfig = this.write;
        StringBuilder sb = new StringBuilder("getCachedGUIDs:[");
        sb.append(strIconCompatParcelizer);
        sb.append("]");
        cleverTapInstanceConfig.read("ON_USER_LOGIN", sb.toString());
        return strIconCompatParcelizer;
    }

    private JSONObject AudioAttributesImplApi26Parcelizer() {
        String strIconCompatParcelizer = IconCompatParcelizer();
        if (strIconCompatParcelizer != null) {
            strIconCompatParcelizer = this.RemoteActionCompatParcelizer.read(strIconCompatParcelizer, "cgk", getPeriodIndexFromWindowPosition.AudioAttributesCompatParcelizer.read);
        }
        return AnalyticsCollector.IconCompatParcelizer(strIconCompatParcelizer, this.write.MediaBrowserCompatItemReceiver(), this.write.write());
    }

    private void IconCompatParcelizer(String str, int i) {
        if (str == null) {
            return;
        }
        RemoteActionCompatParcelizer(i);
        if (i == 0) {
            AudioAttributesImplApi21Parcelizer();
            return;
        }
        RendererCapabilitiesFormatSupport.AudioAttributesCompatParcelizer(this.IconCompatParcelizer, RendererCapabilitiesFormatSupport.write(this.write.write(), "cachedGUIDsKey"), str);
        CleverTapInstanceConfig cleverTapInstanceConfig = this.write;
        StringBuilder sb = new StringBuilder("setCachedGUIDs:[");
        sb.append(str);
        sb.append("]");
        cleverTapInstanceConfig.read("ON_USER_LOGIN", sb.toString());
    }

    private void RemoteActionCompatParcelizer(int i) {
        RendererCapabilitiesFormatSupport.AudioAttributesCompatParcelizer(this.IconCompatParcelizer, RendererCapabilitiesFormatSupport.write(this.write.write(), "cachedGUIDsLengthKey"), i);
        this.write.read("ON_USER_LOGIN", "Storing size of cachedGUIDs: ".concat(String.valueOf(i)));
    }

    private int MediaBrowserCompatItemReceiver() {
        int iRemoteActionCompatParcelizer = RendererCapabilitiesFormatSupport.RemoteActionCompatParcelizer(this.IconCompatParcelizer, RendererCapabilitiesFormatSupport.write(this.write.write(), "cachedGUIDsLengthKey"), 0);
        this.write.read("ON_USER_LOGIN", "Retrieved size of cachedGUIDs: ".concat(String.valueOf(iRemoteActionCompatParcelizer)));
        return iRemoteActionCompatParcelizer;
    }

    private void AudioAttributesImplApi21Parcelizer() {
        try {
            RendererCapabilitiesFormatSupport.write(this.IconCompatParcelizer, RendererCapabilitiesFormatSupport.write(this.write.write(), "cachedGUIDsKey"));
            this.write.read("ON_USER_LOGIN", "removeCachedGUIDs:[]");
        } catch (Throwable th) {
            this.write.MediaBrowserCompatItemReceiver().write(this.write.write(), "Error removing guid cache: ".concat(String.valueOf(th)));
        }
    }

    public final String read() {
        String strIconCompatParcelizer = RendererCapabilitiesFormatSupport.IconCompatParcelizer(this.IconCompatParcelizer, this.write, "SP_KEY_PROFILE_IDENTITIES", "");
        this.write.read("ON_USER_LOGIN", "getCachedIdentityKeysForAccount:".concat(String.valueOf(strIconCompatParcelizer)));
        return strIconCompatParcelizer;
    }

    public final String IconCompatParcelizer(String str, String str2) {
        if (str == null || str2 == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("_");
        sb.append(str2);
        try {
            String string = AudioAttributesImplApi26Parcelizer().getString(sb.toString());
            CleverTapInstanceConfig cleverTapInstanceConfig = this.write;
            StringBuilder sb2 = new StringBuilder("getGUIDForIdentifier:[Key:");
            sb2.append(str);
            sb2.append(", value:");
            sb2.append(string);
            sb2.append("]");
            cleverTapInstanceConfig.read("ON_USER_LOGIN", sb2.toString());
            return string;
        } catch (Throwable th) {
            this.write.MediaBrowserCompatItemReceiver().write(this.write.write(), "Error reading guid cache: ".concat(String.valueOf(th)));
            return null;
        }
    }

    public final boolean AudioAttributesCompatParcelizer() {
        boolean z = MediaBrowserCompatItemReceiver() == 0;
        CleverTapInstanceConfig cleverTapInstanceConfig = this.write;
        StringBuilder sb = new StringBuilder("isAnonymousDevice:[");
        sb.append(z);
        sb.append("]");
        cleverTapInstanceConfig.read("ON_USER_LOGIN", sb.toString());
        return z;
    }

    public final boolean write() {
        boolean z = MediaBrowserCompatItemReceiver() > 0 && TextUtils.isEmpty(read());
        this.write.read("ON_USER_LOGIN", "isLegacyProfileLoggedIn:".concat(String.valueOf(z)));
        return z;
    }

    public final void write(String str) {
        RendererCapabilitiesFormatSupport.RemoteActionCompatParcelizer(this.IconCompatParcelizer, this.write, "SP_KEY_PROFILE_IDENTITIES", str);
        this.write.read("ON_USER_LOGIN", "saveIdentityKeysForAccount:".concat(String.valueOf(str)));
    }
}
