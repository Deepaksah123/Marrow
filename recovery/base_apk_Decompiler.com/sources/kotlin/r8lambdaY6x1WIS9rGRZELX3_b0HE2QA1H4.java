package kotlin;

import android.os.Bundle;
import android.webkit.JavascriptInterface;
import com.clevertap.android.sdk.inapp.CTInAppAction;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class r8lambdaY6x1WIS9rGRZELX3_b0HE2QA1H4 {
    private WeakReference<SimpleBasePlayerExternalSyntheticLambda14> RemoteActionCompatParcelizer;
    private WeakReference<PlayerTimelineChangeReason> read;

    @JavascriptInterface
    public int getSdkVersion() {
        return 70500;
    }

    public r8lambdaY6x1WIS9rGRZELX3_b0HE2QA1H4(PlayerTimelineChangeReason playerTimelineChangeReason, SimpleBasePlayerExternalSyntheticLambda14 simpleBasePlayerExternalSyntheticLambda14) {
        this.read = new WeakReference<>(null);
        this.RemoteActionCompatParcelizer = new WeakReference<>(null);
        this.read = new WeakReference<>(playerTimelineChangeReason);
        this.RemoteActionCompatParcelizer = new WeakReference<>(simpleBasePlayerExternalSyntheticLambda14);
    }

    @JavascriptInterface
    public void promptPushPermission(boolean z) {
        PlayerTimelineChangeReason playerTimelineChangeReason = this.read.get();
        if (playerTimelineChangeReason == null) {
            RendererWakeupListener.MediaBrowserCompatItemReceiver();
        } else {
            dismissInAppNotification();
            playerTimelineChangeReason.IconCompatParcelizer(z);
        }
    }

    @JavascriptInterface
    public void dismissInAppNotification() {
        if (this.read.get() == null) {
            RendererWakeupListener.MediaBrowserCompatItemReceiver();
            return;
        }
        SimpleBasePlayerExternalSyntheticLambda14 simpleBasePlayerExternalSyntheticLambda14 = this.RemoteActionCompatParcelizer.get();
        if (simpleBasePlayerExternalSyntheticLambda14 != null) {
            simpleBasePlayerExternalSyntheticLambda14.RemoteActionCompatParcelizer(null);
        }
    }

    @JavascriptInterface
    public void addMultiValueForKey(String str, String str2) {
        PlayerTimelineChangeReason playerTimelineChangeReason = this.read.get();
        if (playerTimelineChangeReason == null) {
            RendererWakeupListener.MediaBrowserCompatItemReceiver();
        } else {
            playerTimelineChangeReason.AudioAttributesCompatParcelizer(str, str2);
        }
    }

    @JavascriptInterface
    public void incrementValue(String str, double d) {
        PlayerTimelineChangeReason playerTimelineChangeReason = this.read.get();
        if (playerTimelineChangeReason == null) {
            RendererWakeupListener.MediaBrowserCompatItemReceiver();
        } else {
            playerTimelineChangeReason.write(str, Double.valueOf(d));
        }
    }

    @JavascriptInterface
    public void decrementValue(String str, double d) {
        PlayerTimelineChangeReason playerTimelineChangeReason = this.read.get();
        if (playerTimelineChangeReason == null) {
            RendererWakeupListener.MediaBrowserCompatItemReceiver();
        } else {
            playerTimelineChangeReason.IconCompatParcelizer(str, Double.valueOf(d));
        }
    }

    @JavascriptInterface
    public void addMultiValuesForKey(String str, String str2) {
        PlayerTimelineChangeReason playerTimelineChangeReason = this.read.get();
        if (playerTimelineChangeReason == null) {
            RendererWakeupListener.MediaBrowserCompatItemReceiver();
            return;
        }
        if (str == null) {
            RendererWakeupListener.MediaMetadataCompat();
            return;
        }
        if (str2 != null) {
            try {
                playerTimelineChangeReason.IconCompatParcelizer(str, RendererCapabilitiesListener.RemoteActionCompatParcelizer(new JSONArray(str2)));
                return;
            } catch (JSONException e) {
                e.getLocalizedMessage();
                RendererWakeupListener.MediaMetadataCompat();
                return;
            }
        }
        RendererWakeupListener.MediaMetadataCompat();
    }

    @JavascriptInterface
    public void pushChargedEvent(String str, String str2) {
        ArrayList<HashMap<String, Object>> arrayListWrite;
        PlayerTimelineChangeReason playerTimelineChangeReason = this.read.get();
        if (playerTimelineChangeReason == null) {
            RendererWakeupListener.MediaBrowserCompatItemReceiver();
            return;
        }
        HashMap<String, Object> map = new HashMap<>();
        if (str != null) {
            try {
                map = RendererCapabilitiesListener.write(new JSONObject(str));
            } catch (JSONException e) {
                e.getLocalizedMessage();
                RendererWakeupListener.MediaMetadataCompat();
            }
            if (str2 != null) {
                try {
                    arrayListWrite = RendererCapabilitiesListener.write(new JSONArray(str2));
                } catch (JSONException e2) {
                    e2.getLocalizedMessage();
                    RendererWakeupListener.MediaMetadataCompat();
                    arrayListWrite = null;
                }
                playerTimelineChangeReason.write(map, arrayListWrite);
                return;
            }
            return;
        }
        RendererWakeupListener.MediaMetadataCompat();
    }

    @JavascriptInterface
    public void pushEvent(String str) {
        PlayerTimelineChangeReason playerTimelineChangeReason = this.read.get();
        if (playerTimelineChangeReason == null) {
            RendererWakeupListener.MediaBrowserCompatItemReceiver();
        } else {
            playerTimelineChangeReason.IconCompatParcelizer(str);
        }
    }

    @JavascriptInterface
    public void pushEvent(String str, String str2) {
        PlayerTimelineChangeReason playerTimelineChangeReason = this.read.get();
        if (playerTimelineChangeReason == null) {
            RendererWakeupListener.MediaBrowserCompatItemReceiver();
            return;
        }
        if (str2 != null) {
            try {
                playerTimelineChangeReason.read(str, RendererCapabilitiesListener.write(new JSONObject(str2)));
                return;
            } catch (JSONException e) {
                e.getLocalizedMessage();
                RendererWakeupListener.MediaMetadataCompat();
                return;
            }
        }
        RendererWakeupListener.MediaMetadataCompat();
    }

    @JavascriptInterface
    public void pushProfile(String str) {
        PlayerTimelineChangeReason playerTimelineChangeReason = this.read.get();
        if (playerTimelineChangeReason == null) {
            RendererWakeupListener.MediaBrowserCompatItemReceiver();
            return;
        }
        if (str != null) {
            try {
                playerTimelineChangeReason.read(RendererCapabilitiesListener.write(new JSONObject(str)));
                return;
            } catch (JSONException e) {
                e.getLocalizedMessage();
                RendererWakeupListener.MediaMetadataCompat();
                return;
            }
        }
        RendererWakeupListener.MediaMetadataCompat();
    }

    @JavascriptInterface
    public void removeMultiValueForKey(String str, String str2) {
        PlayerTimelineChangeReason playerTimelineChangeReason = this.read.get();
        if (playerTimelineChangeReason == null) {
            RendererWakeupListener.MediaBrowserCompatItemReceiver();
            return;
        }
        if (str == null) {
            RendererWakeupListener.MediaMetadataCompat();
        } else if (str2 == null) {
            RendererWakeupListener.MediaMetadataCompat();
        } else {
            playerTimelineChangeReason.read(str, str2);
        }
    }

    @JavascriptInterface
    public void removeMultiValuesForKey(String str, String str2) {
        PlayerTimelineChangeReason playerTimelineChangeReason = this.read.get();
        if (playerTimelineChangeReason == null) {
            RendererWakeupListener.MediaBrowserCompatItemReceiver();
            return;
        }
        if (str == null) {
            RendererWakeupListener.MediaMetadataCompat();
            return;
        }
        if (str2 != null) {
            try {
                playerTimelineChangeReason.AudioAttributesCompatParcelizer(str, RendererCapabilitiesListener.RemoteActionCompatParcelizer(new JSONArray(str2)));
                return;
            } catch (JSONException e) {
                e.getLocalizedMessage();
                RendererWakeupListener.MediaMetadataCompat();
                return;
            }
        }
        RendererWakeupListener.MediaMetadataCompat();
    }

    @JavascriptInterface
    public void removeValueForKey(String str) {
        PlayerTimelineChangeReason playerTimelineChangeReason = this.read.get();
        if (playerTimelineChangeReason == null) {
            RendererWakeupListener.MediaBrowserCompatItemReceiver();
        } else if (str == null) {
            RendererWakeupListener.MediaMetadataCompat();
        } else {
            playerTimelineChangeReason.MediaBrowserCompatCustomActionResultReceiver(str);
        }
    }

    @JavascriptInterface
    public void setMultiValueForKey(String str, String str2) {
        PlayerTimelineChangeReason playerTimelineChangeReason = this.read.get();
        if (playerTimelineChangeReason == null) {
            RendererWakeupListener.MediaBrowserCompatItemReceiver();
            return;
        }
        if (str == null) {
            RendererWakeupListener.MediaMetadataCompat();
            return;
        }
        if (str2 != null) {
            try {
                playerTimelineChangeReason.RemoteActionCompatParcelizer(str, RendererCapabilitiesListener.RemoteActionCompatParcelizer(new JSONArray(str2)));
                return;
            } catch (JSONException e) {
                e.getLocalizedMessage();
                RendererWakeupListener.MediaMetadataCompat();
                return;
            }
        }
        RendererWakeupListener.MediaMetadataCompat();
    }

    @JavascriptInterface
    public void onUserLogin(String str) {
        PlayerTimelineChangeReason playerTimelineChangeReason = this.read.get();
        if (playerTimelineChangeReason == null) {
            RendererWakeupListener.MediaBrowserCompatItemReceiver();
            return;
        }
        if (str != null) {
            try {
                playerTimelineChangeReason.RemoteActionCompatParcelizer(RendererCapabilitiesListener.write(new JSONObject(str)));
                return;
            } catch (JSONException e) {
                e.getLocalizedMessage();
                RendererWakeupListener.MediaMetadataCompat();
                return;
            }
        }
        RendererWakeupListener.MediaMetadataCompat();
    }

    @JavascriptInterface
    public void triggerInAppAction(String str, String str2, String str3) throws UnsupportedEncodingException {
        if (this.read.get() == null) {
            RendererWakeupListener.MediaBrowserCompatItemReceiver();
            return;
        }
        SimpleBasePlayerExternalSyntheticLambda14 simpleBasePlayerExternalSyntheticLambda14 = this.RemoteActionCompatParcelizer.get();
        if (simpleBasePlayerExternalSyntheticLambda14 == null) {
            RendererWakeupListener.MediaBrowserCompatItemReceiver();
            return;
        }
        if (str == null) {
            RendererWakeupListener.MediaBrowserCompatItemReceiver();
            return;
        }
        try {
            CTInAppAction cTInAppActionAudioAttributesCompatParcelizer = CTInAppAction.AudioAttributesCompatParcelizer(new JSONObject(str));
            if (cTInAppActionAudioAttributesCompatParcelizer == null) {
                RendererWakeupListener.MediaBrowserCompatItemReceiver();
                return;
            }
            Bundle bundle = new Bundle();
            if (str3 != null) {
                bundle.putString("button_id", str3);
            }
            simpleBasePlayerExternalSyntheticLambda14.write(cTInAppActionAudioAttributesCompatParcelizer, str2, bundle);
        } catch (JSONException unused) {
            RendererWakeupListener.MediaBrowserCompatItemReceiver();
        }
    }
}
