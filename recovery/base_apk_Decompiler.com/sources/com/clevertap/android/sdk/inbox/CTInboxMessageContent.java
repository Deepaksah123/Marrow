package com.clevertap.android.sdk.inbox;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import in.juspay.hyper.constants.LogSubCategory;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.RendererWakeupListener;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class CTInboxMessageContent implements Parcelable {
    public static final Parcelable.Creator<CTInboxMessageContent> CREATOR = new Parcelable.Creator<CTInboxMessageContent>() { // from class: com.clevertap.android.sdk.inbox.CTInboxMessageContent.2
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ CTInboxMessageContent createFromParcel(Parcel parcel) {
            return IconCompatParcelizer(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ CTInboxMessageContent[] newArray(int i) {
            return IconCompatParcelizer(i);
        }

        private static CTInboxMessageContent IconCompatParcelizer(Parcel parcel) {
            return new CTInboxMessageContent(parcel);
        }

        private static CTInboxMessageContent[] IconCompatParcelizer(int i) {
            return new CTInboxMessageContent[i];
        }
    };
    private Boolean AudioAttributesCompatParcelizer;
    private String AudioAttributesImplApi21Parcelizer;
    private String AudioAttributesImplApi26Parcelizer;
    private JSONArray AudioAttributesImplBaseParcelizer;
    private Boolean IconCompatParcelizer;
    private String MediaBrowserCompatCustomActionResultReceiver;
    private String MediaBrowserCompatItemReceiver;
    private String MediaBrowserCompatMediaItem;
    private String MediaBrowserCompatSearchResultReceiver;
    private String MediaDescriptionCompat;
    private String RatingCompat;
    private String RemoteActionCompatParcelizer;
    private String read;
    private String write;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    CTInboxMessageContent() {
    }

    protected CTInboxMessageContent(Parcel parcel) {
        this.RatingCompat = parcel.readString();
        this.MediaDescriptionCompat = parcel.readString();
        this.MediaBrowserCompatItemReceiver = parcel.readString();
        this.MediaBrowserCompatSearchResultReceiver = parcel.readString();
        this.MediaBrowserCompatCustomActionResultReceiver = parcel.readString();
        this.AudioAttributesImplApi26Parcelizer = parcel.readString();
        this.IconCompatParcelizer = Boolean.valueOf(parcel.readByte() != 0);
        this.AudioAttributesCompatParcelizer = Boolean.valueOf(parcel.readByte() != 0);
        this.write = parcel.readString();
        this.read = parcel.readString();
        this.AudioAttributesImplApi21Parcelizer = parcel.readString();
        try {
            this.AudioAttributesImplBaseParcelizer = parcel.readByte() == 0 ? null : new JSONArray(parcel.readString());
        } catch (JSONException e) {
            e.getLocalizedMessage();
            RendererWakeupListener.MediaMetadataCompat();
        }
        this.RemoteActionCompatParcelizer = parcel.readString();
        this.MediaBrowserCompatMediaItem = parcel.readString();
    }

    public final String RemoteActionCompatParcelizer() {
        return this.write;
    }

    private String handleMediaPlayPauseIfPendingOnHandler() {
        return this.RemoteActionCompatParcelizer;
    }

    public final String write() {
        return this.read;
    }

    public final String AudioAttributesCompatParcelizer() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    public static String read(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            return jSONObject.has("bg") ? jSONObject.getString("bg") : "";
        } catch (JSONException e) {
            e.getLocalizedMessage();
            RendererWakeupListener.MediaMetadataCompat();
            return null;
        }
    }

    public static String RemoteActionCompatParcelizer(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            return jSONObject.has(TtmlNode.ATTR_TTS_COLOR) ? jSONObject.getString(TtmlNode.ATTR_TTS_COLOR) : "";
        } catch (JSONException e) {
            e.getLocalizedMessage();
            RendererWakeupListener.MediaMetadataCompat();
            return null;
        }
    }

    public static String AudioAttributesCompatParcelizer(JSONObject jSONObject) {
        if (jSONObject == null) {
            return "";
        }
        try {
            JSONObject jSONObject2 = jSONObject.has("copyText") ? jSONObject.getJSONObject("copyText") : null;
            return (jSONObject2 == null || !jSONObject2.has("text")) ? "" : jSONObject2.getString("text");
        } catch (JSONException e) {
            e.getLocalizedMessage();
            RendererWakeupListener.MediaMetadataCompat();
            return "";
        }
    }

    public static HashMap<String, String> IconCompatParcelizer(JSONObject jSONObject) {
        if (jSONObject != null && jSONObject.has("kv")) {
            try {
                JSONObject jSONObject2 = jSONObject.getJSONObject("kv");
                Iterator<String> itKeys = jSONObject2.keys();
                HashMap<String, String> map = new HashMap<>();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    String string = jSONObject2.getString(next);
                    if (!TextUtils.isEmpty(next)) {
                        map.put(next, string);
                    }
                }
                if (map.isEmpty()) {
                    return null;
                }
                return map;
            } catch (JSONException e) {
                e.getLocalizedMessage();
                RendererWakeupListener.MediaMetadataCompat();
            }
        }
        return null;
    }

    public static String write(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            return jSONObject.has("text") ? jSONObject.getString("text") : "";
        } catch (JSONException e) {
            e.getLocalizedMessage();
            RendererWakeupListener.MediaMetadataCompat();
            return null;
        }
    }

    public static String AudioAttributesImplApi26Parcelizer(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            JSONObject jSONObject2 = jSONObject.has("url") ? jSONObject.getJSONObject("url") : null;
            if (jSONObject2 == null) {
                return null;
            }
            JSONObject jSONObject3 = jSONObject2.has(LogSubCategory.LifeCycle.ANDROID) ? jSONObject2.getJSONObject(LogSubCategory.LifeCycle.ANDROID) : null;
            return (jSONObject3 == null || !jSONObject3.has("text")) ? "" : jSONObject3.getString("text");
        } catch (JSONException e) {
            e.getLocalizedMessage();
            RendererWakeupListener.MediaMetadataCompat();
            return null;
        }
    }

    public final JSONArray read() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    public static String AudioAttributesImplBaseParcelizer(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            return jSONObject.has("type") ? jSONObject.getString("type") : "";
        } catch (JSONException e) {
            e.getLocalizedMessage();
            RendererWakeupListener.MediaMetadataCompat();
            return null;
        }
    }

    public static boolean MediaBrowserCompatItemReceiver(JSONObject jSONObject) {
        if (jSONObject == null) {
            return false;
        }
        try {
            if (jSONObject.has("fbSettings")) {
                return jSONObject.getBoolean("fbSettings");
            }
            return false;
        } catch (JSONException e) {
            e.getLocalizedMessage();
            RendererWakeupListener.MediaMetadataCompat();
            return false;
        }
    }

    public final String IconCompatParcelizer() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    public final String AudioAttributesImplApi21Parcelizer() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    public final String AudioAttributesImplApi26Parcelizer() {
        return this.MediaBrowserCompatItemReceiver;
    }

    public final String AudioAttributesImplBaseParcelizer() {
        return this.MediaBrowserCompatSearchResultReceiver;
    }

    public final String MediaBrowserCompatItemReceiver() {
        return this.MediaBrowserCompatMediaItem;
    }

    public final String MediaBrowserCompatCustomActionResultReceiver() {
        return this.RatingCompat;
    }

    public final String MediaBrowserCompatMediaItem() {
        return this.MediaDescriptionCompat;
    }

    public final boolean MediaDescriptionCompat() {
        String strHandleMediaPlayPauseIfPendingOnHandler = handleMediaPlayPauseIfPendingOnHandler();
        return (strHandleMediaPlayPauseIfPendingOnHandler == null || this.MediaBrowserCompatCustomActionResultReceiver == null || !strHandleMediaPlayPauseIfPendingOnHandler.startsWith("audio")) ? false : true;
    }

    public final boolean MediaMetadataCompat() {
        String strHandleMediaPlayPauseIfPendingOnHandler = handleMediaPlayPauseIfPendingOnHandler();
        return (strHandleMediaPlayPauseIfPendingOnHandler == null || this.MediaBrowserCompatCustomActionResultReceiver == null || !strHandleMediaPlayPauseIfPendingOnHandler.equals("image/gif")) ? false : true;
    }

    public final boolean RatingCompat() {
        String strHandleMediaPlayPauseIfPendingOnHandler = handleMediaPlayPauseIfPendingOnHandler();
        return (strHandleMediaPlayPauseIfPendingOnHandler == null || this.MediaBrowserCompatCustomActionResultReceiver == null || !strHandleMediaPlayPauseIfPendingOnHandler.startsWith("image") || strHandleMediaPlayPauseIfPendingOnHandler.equals("image/gif")) ? false : true;
    }

    public final boolean onAddQueueItem() {
        String strHandleMediaPlayPauseIfPendingOnHandler = handleMediaPlayPauseIfPendingOnHandler();
        return (strHandleMediaPlayPauseIfPendingOnHandler == null || this.MediaBrowserCompatCustomActionResultReceiver == null || !strHandleMediaPlayPauseIfPendingOnHandler.startsWith("video")) ? false : true;
    }

    public final boolean MediaBrowserCompatSearchResultReceiver() {
        return MediaDescriptionCompat() || onAddQueueItem();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.RatingCompat);
        parcel.writeString(this.MediaDescriptionCompat);
        parcel.writeString(this.MediaBrowserCompatItemReceiver);
        parcel.writeString(this.MediaBrowserCompatSearchResultReceiver);
        parcel.writeString(this.MediaBrowserCompatCustomActionResultReceiver);
        parcel.writeString(this.AudioAttributesImplApi26Parcelizer);
        parcel.writeByte(this.IconCompatParcelizer.booleanValue() ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.AudioAttributesCompatParcelizer.booleanValue() ? (byte) 1 : (byte) 0);
        parcel.writeString(this.write);
        parcel.writeString(this.read);
        parcel.writeString(this.AudioAttributesImplApi21Parcelizer);
        if (this.AudioAttributesImplBaseParcelizer == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeString(this.AudioAttributesImplBaseParcelizer.toString());
        }
        parcel.writeString(this.RemoteActionCompatParcelizer);
        parcel.writeString(this.MediaBrowserCompatMediaItem);
    }

    final CTInboxMessageContent MediaBrowserCompatCustomActionResultReceiver(JSONObject jSONObject) {
        String str;
        String string;
        try {
            JSONObject jSONObject2 = jSONObject.has("title") ? jSONObject.getJSONObject("title") : null;
            if (jSONObject2 == null) {
                str = "links";
            } else {
                if (jSONObject2.has("text")) {
                    str = "links";
                    string = jSONObject2.getString("text");
                } else {
                    str = "links";
                    string = "";
                }
                this.RatingCompat = string;
                this.MediaDescriptionCompat = jSONObject2.has(TtmlNode.ATTR_TTS_COLOR) ? jSONObject2.getString(TtmlNode.ATTR_TTS_COLOR) : "";
            }
            JSONObject jSONObject3 = jSONObject.has("message") ? jSONObject.getJSONObject("message") : null;
            if (jSONObject3 != null) {
                this.MediaBrowserCompatItemReceiver = jSONObject3.has("text") ? jSONObject3.getString("text") : "";
                this.MediaBrowserCompatSearchResultReceiver = jSONObject3.has(TtmlNode.ATTR_TTS_COLOR) ? jSONObject3.getString(TtmlNode.ATTR_TTS_COLOR) : "";
            }
            JSONObject jSONObject4 = jSONObject.has("icon") ? jSONObject.getJSONObject("icon") : null;
            if (jSONObject4 != null) {
                this.read = jSONObject4.has("url") ? jSONObject4.getString("url") : "";
                this.AudioAttributesImplApi21Parcelizer = jSONObject4.optString("alt_text", "");
            }
            JSONObject jSONObject5 = jSONObject.has("media") ? jSONObject.getJSONObject("media") : null;
            if (jSONObject5 != null) {
                this.MediaBrowserCompatCustomActionResultReceiver = jSONObject5.has("url") ? jSONObject5.getString("url") : "";
                this.AudioAttributesImplApi26Parcelizer = jSONObject5.optString("alt_text", "");
                this.RemoteActionCompatParcelizer = jSONObject5.has("content_type") ? jSONObject5.getString("content_type") : "";
                this.MediaBrowserCompatMediaItem = jSONObject5.has("poster") ? jSONObject5.getString("poster") : "";
            }
            JSONObject jSONObject6 = jSONObject.has("action") ? jSONObject.getJSONObject("action") : null;
            if (jSONObject6 != null) {
                boolean z = true;
                this.IconCompatParcelizer = Boolean.valueOf(jSONObject6.has("hasUrl") && jSONObject6.getBoolean("hasUrl"));
                if (!jSONObject6.has("hasLinks") || !jSONObject6.getBoolean("hasLinks")) {
                    z = false;
                }
                this.AudioAttributesCompatParcelizer = Boolean.valueOf(z);
                JSONObject jSONObject7 = jSONObject6.has("url") ? jSONObject6.getJSONObject("url") : null;
                if (jSONObject7 != null && this.IconCompatParcelizer.booleanValue()) {
                    JSONObject jSONObject8 = jSONObject7.has(LogSubCategory.LifeCycle.ANDROID) ? jSONObject7.getJSONObject(LogSubCategory.LifeCycle.ANDROID) : null;
                    if (jSONObject8 != null) {
                        this.write = jSONObject8.has("text") ? jSONObject8.getString("text") : "";
                    }
                }
                if (jSONObject7 != null && this.AudioAttributesCompatParcelizer.booleanValue()) {
                    String str2 = str;
                    this.AudioAttributesImplBaseParcelizer = jSONObject6.has(str2) ? jSONObject6.getJSONArray(str2) : null;
                }
            }
            return this;
        } catch (JSONException e) {
            e.getLocalizedMessage();
            RendererWakeupListener.MediaMetadataCompat();
            return this;
        }
    }
}
