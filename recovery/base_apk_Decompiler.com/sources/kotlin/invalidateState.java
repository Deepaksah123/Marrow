package kotlin;

import com.clevertap.android.sdk.inapp.CTInAppNotificationMedia;
import com.clevertap.android.sdk.inapp.customtemplates.CustomTemplateInAppData;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0000\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J+\u0010\u000b\u001a\u00020\n2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\u000b\u001a\u00020\n2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\rR%\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000e8\u0007¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R(\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u000b\u0010\u0014R(\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0012\u001a\u0004\b\u0011\u0010\u0014R(\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0012\u001a\u0004\b\u0015\u0010\u0014R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\t0\u001a8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\t0\u001a8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001cR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\t0\u001a8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001cR \u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\t0\u001a8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\u001c\u001a\u0004\b \u0010!R,\u0010 \u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\"0\u000e0\u001a8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u001c\u001a\u0004\b\u001f\u0010!R\u001a\u0010\u0011\u001a\u00020#8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010$\u001a\u0004\b\u0019\u0010%R\u001a\u0010\u001d\u001a\u00020#8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010$\u001a\u0004\b\u0016\u0010%R\u001a\u0010(\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010&\u001a\u0004\b\u0018\u0010'R(\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010\u0012\u001a\u0004\b\u001e\u0010\u0014"}, d2 = {"Lo/invalidateState;", "", "Lorg/json/JSONObject;", "p0", "Lo/handleRelease;", "p1", "<init>", "(Lorg/json/JSONObject;Lo/handleRelease;)V", "", "", "", "RemoteActionCompatParcelizer", "(Ljava/util/List;Ljava/util/List;)V", "(Ljava/util/List;Lo/handleRelease;)V", "Lo/getSubscriptionExpiresOn;", "", "Lorg/json/JSONArray;", "AudioAttributesImplBaseParcelizer", "Lo/getSubscriptionExpiresOn;", "MediaBrowserCompatItemReceiver", "()Lo/getSubscriptionExpiresOn;", "read", "AudioAttributesCompatParcelizer", "MediaDescriptionCompat", "write", "IconCompatParcelizer", "", "MediaBrowserCompatMediaItem", "Ljava/util/List;", "RatingCompat", "AudioAttributesImplApi26Parcelizer", "MediaBrowserCompatCustomActionResultReceiver", "AudioAttributesImplApi21Parcelizer", "()Ljava/util/List;", "Lo/lambdaaddMediaItems3comgoogleandroidexoplayer2SimpleBasePlayer;", "", "I", "()I", "Ljava/lang/String;", "()Ljava/lang/String;", "MediaBrowserCompatSearchResultReceiver", "MediaMetadataCompat"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class invalidateState {

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final int RatingCompat;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private final List<String> AudioAttributesImplApi26Parcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private final List<String> MediaBrowserCompatCustomActionResultReceiver;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private final Pair<Boolean, JSONArray> RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private final List<Pair<String, lambdaaddMediaItems3comgoogleandroidexoplayer2SimpleBasePlayer>> AudioAttributesImplApi21Parcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private final int AudioAttributesImplBaseParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatMediaItem, reason: from kotlin metadata */
    private final List<String> read;

    /* JADX INFO: renamed from: MediaDescriptionCompat, reason: from kotlin metadata */
    private final Pair<Boolean, JSONArray> write;

    /* JADX INFO: renamed from: MediaMetadataCompat, reason: from kotlin metadata */
    private final Pair<Boolean, JSONArray> MediaDescriptionCompat;

    /* JADX INFO: renamed from: RatingCompat, reason: from kotlin metadata */
    private final List<String> MediaBrowserCompatItemReceiver;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final String MediaBrowserCompatSearchResultReceiver;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final Pair<Boolean, JSONArray> AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final Pair<Boolean, JSONArray> IconCompatParcelizer;

    public invalidateState(JSONObject jSONObject, handleRelease handlerelease) throws JSONException {
        toMagicModuleMetaRepoModel.write(jSONObject, "");
        toMagicModuleMetaRepoModel.write(handlerelease, "");
        this.RemoteActionCompatParcelizer = PlayerPlaybackSuppressionReason.AudioAttributesCompatParcelizer(jSONObject, "inapp_notifs");
        this.AudioAttributesCompatParcelizer = PlayerPlaybackSuppressionReason.read(jSONObject, "inapp_notifs_cs");
        this.write = PlayerPlaybackSuppressionReason.read(jSONObject, "inapp_notifs_ss");
        this.IconCompatParcelizer = PlayerPlaybackSuppressionReason.AudioAttributesCompatParcelizer(jSONObject, "inapp_notifs_applaunched");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        RemoteActionCompatParcelizer(arrayList, arrayList2);
        RemoteActionCompatParcelizer(arrayList3, handlerelease);
        this.read = arrayList;
        this.MediaBrowserCompatItemReceiver = arrayList2;
        this.MediaBrowserCompatCustomActionResultReceiver = arrayList3;
        ArrayList arrayList4 = arrayList2;
        ArrayList arrayList5 = arrayList3;
        this.AudioAttributesImplApi26Parcelizer = IntermediateLoginResponseBody.AudioAttributesCompatParcelizer((Collection) IntermediateLoginResponseBody.AudioAttributesCompatParcelizer((Collection) arrayList, (Iterable) arrayList4), (Iterable) arrayList5);
        ArrayList arrayList6 = arrayList;
        ArrayList arrayList7 = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) arrayList6, 10));
        Iterator it = arrayList6.iterator();
        while (it.hasNext()) {
            arrayList7.add(new Pair((String) it.next(), lambdaaddMediaItems3comgoogleandroidexoplayer2SimpleBasePlayer.IconCompatParcelizer));
        }
        ArrayList arrayList8 = arrayList7;
        ArrayList arrayList9 = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) arrayList4, 10));
        Iterator it2 = arrayList4.iterator();
        while (it2.hasNext()) {
            arrayList9.add(new Pair((String) it2.next(), lambdaaddMediaItems3comgoogleandroidexoplayer2SimpleBasePlayer.read));
        }
        List listAudioAttributesCompatParcelizer = IntermediateLoginResponseBody.AudioAttributesCompatParcelizer((Collection) arrayList8, (Iterable) arrayList9);
        ArrayList arrayList10 = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) arrayList5, 10));
        Iterator it3 = arrayList5.iterator();
        while (it3.hasNext()) {
            arrayList10.add(new Pair((String) it3.next(), lambdaaddMediaItems3comgoogleandroidexoplayer2SimpleBasePlayer.RemoteActionCompatParcelizer));
        }
        List listAudioAttributesCompatParcelizer2 = IntermediateLoginResponseBody.AudioAttributesCompatParcelizer((Collection) listAudioAttributesCompatParcelizer, (Iterable) arrayList10);
        HashSet hashSet = new HashSet();
        ArrayList arrayList11 = new ArrayList();
        for (Object obj : listAudioAttributesCompatParcelizer2) {
            if (hashSet.add((String) ((Pair) obj).write())) {
                arrayList11.add(obj);
            }
        }
        this.AudioAttributesImplApi21Parcelizer = arrayList11;
        this.AudioAttributesImplBaseParcelizer = jSONObject.optInt("imc", 10);
        this.RatingCompat = jSONObject.optInt("imp", 10);
        String strOptString = jSONObject.optString("inapp_delivery_mode", "");
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strOptString, "");
        this.MediaBrowserCompatSearchResultReceiver = strOptString;
        this.MediaDescriptionCompat = PlayerPlaybackSuppressionReason.AudioAttributesCompatParcelizer(jSONObject, "inapp_stale");
    }

    /* JADX INFO: renamed from: o.invalidateState$IconCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lo/invalidateState$IconCompatParcelizer;", "", "<init>", "()V", "Lorg/json/JSONObject;", "p0", "", "Lo/lambdanew0comgoogleandroidexoplayer2SimpleBasePlayer;", "write", "(Lorg/json/JSONObject;)Ljava/util/List;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @getMagicModuleMeta
        public static List<lambdanew0comgoogleandroidexoplayer2SimpleBasePlayer> write(JSONObject p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            JSONArray jSONArray = PlayerPlaybackSuppressionReason.read(p0.optJSONArray("frequencyLimits"));
            ArrayList arrayList = new ArrayList();
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                Object obj = jSONArray.get(i);
                if (obj instanceof JSONObject) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = arrayList;
            ArrayList arrayList3 = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) arrayList2, 10));
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList3.add(new lambdanew0comgoogleandroidexoplayer2SimpleBasePlayer((JSONObject) it.next()));
            }
            return IntermediateLoginResponseBody.MediaBrowserCompatItemReceiver((Collection) arrayList3);
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    public final Pair<Boolean, JSONArray> MediaBrowserCompatItemReceiver() {
        return this.RemoteActionCompatParcelizer;
    }

    public final Pair<Boolean, JSONArray> RemoteActionCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final Pair<Boolean, JSONArray> AudioAttributesImplBaseParcelizer() {
        return this.write;
    }

    public final Pair<Boolean, JSONArray> read() {
        return this.IconCompatParcelizer;
    }

    public final List<String> AudioAttributesImplApi21Parcelizer() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    public final List<Pair<String, lambdaaddMediaItems3comgoogleandroidexoplayer2SimpleBasePlayer>> MediaBrowserCompatCustomActionResultReceiver() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    private final void RemoteActionCompatParcelizer(List<String> p0, List<String> p1) throws JSONException {
        JSONArray jSONArrayIconCompatParcelizer;
        if (!this.AudioAttributesCompatParcelizer.write().booleanValue() || (jSONArrayIconCompatParcelizer = this.AudioAttributesCompatParcelizer.IconCompatParcelizer()) == null) {
            return;
        }
        int length = jSONArrayIconCompatParcelizer.length();
        for (int i = 0; i < length; i++) {
            Object obj = jSONArrayIconCompatParcelizer.get(i);
            if (obj instanceof JSONObject) {
                JSONObject jSONObject = (JSONObject) obj;
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("media");
                if (jSONObjectOptJSONObject != null) {
                    CTInAppNotificationMedia.Companion companion = CTInAppNotificationMedia.INSTANCE;
                    CTInAppNotificationMedia cTInAppNotificationMediaIconCompatParcelizer = CTInAppNotificationMedia.Companion.IconCompatParcelizer(jSONObjectOptJSONObject, 1);
                    if (cTInAppNotificationMediaIconCompatParcelizer != null && !TestGroupLSModel.IconCompatParcelizer((CharSequence) cTInAppNotificationMediaIconCompatParcelizer.getRemoteActionCompatParcelizer())) {
                        if (cTInAppNotificationMediaIconCompatParcelizer.AudioAttributesImplApi21Parcelizer()) {
                            p0.add(cTInAppNotificationMediaIconCompatParcelizer.getRemoteActionCompatParcelizer());
                        } else if (cTInAppNotificationMediaIconCompatParcelizer.AudioAttributesCompatParcelizer()) {
                            p1.add(cTInAppNotificationMediaIconCompatParcelizer.getRemoteActionCompatParcelizer());
                        }
                    }
                }
                JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("mediaLandscape");
                if (jSONObjectOptJSONObject2 != null) {
                    CTInAppNotificationMedia.Companion companion2 = CTInAppNotificationMedia.INSTANCE;
                    CTInAppNotificationMedia cTInAppNotificationMediaIconCompatParcelizer2 = CTInAppNotificationMedia.Companion.IconCompatParcelizer(jSONObjectOptJSONObject2, 2);
                    if (cTInAppNotificationMediaIconCompatParcelizer2 != null && !TestGroupLSModel.IconCompatParcelizer((CharSequence) cTInAppNotificationMediaIconCompatParcelizer2.getRemoteActionCompatParcelizer())) {
                        if (cTInAppNotificationMediaIconCompatParcelizer2.AudioAttributesImplApi21Parcelizer()) {
                            p0.add(cTInAppNotificationMediaIconCompatParcelizer2.getRemoteActionCompatParcelizer());
                        } else if (cTInAppNotificationMediaIconCompatParcelizer2.AudioAttributesCompatParcelizer()) {
                            p1.add(cTInAppNotificationMediaIconCompatParcelizer2.getRemoteActionCompatParcelizer());
                        }
                    }
                }
            }
        }
    }

    private final void RemoteActionCompatParcelizer(List<String> p0, handleRelease p1) {
        JSONArray jSONArrayIconCompatParcelizer;
        if (!this.AudioAttributesCompatParcelizer.write().booleanValue() || (jSONArrayIconCompatParcelizer = this.AudioAttributesCompatParcelizer.IconCompatParcelizer()) == null) {
            return;
        }
        int length = jSONArrayIconCompatParcelizer.length();
        for (int i = 0; i < length; i++) {
            CustomTemplateInAppData.Companion companion = CustomTemplateInAppData.INSTANCE;
            CustomTemplateInAppData customTemplateInAppDataIconCompatParcelizer = CustomTemplateInAppData.Companion.IconCompatParcelizer(jSONArrayIconCompatParcelizer.optJSONObject(i));
            if (customTemplateInAppDataIconCompatParcelizer != null) {
                customTemplateInAppDataIconCompatParcelizer.read(p1, p0);
            }
        }
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final int getAudioAttributesImplBaseParcelizer() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final int getRatingCompat() {
        return this.RatingCompat;
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final String getMediaBrowserCompatSearchResultReceiver() {
        return this.MediaBrowserCompatSearchResultReceiver;
    }

    public final Pair<Boolean, JSONArray> AudioAttributesImplApi26Parcelizer() {
        return this.MediaDescriptionCompat;
    }
}
