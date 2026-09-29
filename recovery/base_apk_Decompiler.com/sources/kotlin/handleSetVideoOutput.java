package kotlin;

import android.location.Location;
import com.clevertap.android.sdk.inapp.customtemplates.CustomTemplateInAppData;
import com.google.android.gms.common.Scopes;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.lambdareplaceMediaItems5comgoogleandroidexoplayer2SimpleBasePlayer;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class handleSetVideoOutput implements getStarRating {
    private Map<String, List<Map<String, Object>>> AudioAttributesCompatParcelizer;
    private final SimpleBasePlayerExternalSyntheticLambda15 AudioAttributesImplApi21Parcelizer;
    private final lambdaupdateStateForPendingOperation61comgoogleandroidexoplayer2SimpleBasePlayer IconCompatParcelizer;
    private final handleRelease MediaBrowserCompatCustomActionResultReceiver;
    private final lambdaupdateStateAndInformListeners59 MediaBrowserCompatItemReceiver;
    private Map<String, List<Long>> RemoteActionCompatParcelizer;
    private final SimpleDateFormat read;
    private final SimpleBasePlayerPeriodData write;

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean AudioAttributesCompatParcelizer(long j, long j2) {
        return j2 == j;
    }

    public handleSetVideoOutput(SimpleBasePlayerExternalSyntheticLambda15 simpleBasePlayerExternalSyntheticLambda15, lambdaupdateStateAndInformListeners59 lambdaupdatestateandinformlisteners59, lambdaupdateStateForPendingOperation61comgoogleandroidexoplayer2SimpleBasePlayer lambdaupdatestateforpendingoperation61comgoogleandroidexoplayer2simplebaseplayer, SimpleBasePlayerPeriodData simpleBasePlayerPeriodData, handleRelease handlerelease) {
        toMagicModuleMetaRepoModel.write(simpleBasePlayerExternalSyntheticLambda15, "");
        toMagicModuleMetaRepoModel.write(lambdaupdatestateandinformlisteners59, "");
        toMagicModuleMetaRepoModel.write(lambdaupdatestateforpendingoperation61comgoogleandroidexoplayer2simplebaseplayer, "");
        toMagicModuleMetaRepoModel.write(simpleBasePlayerPeriodData, "");
        toMagicModuleMetaRepoModel.write(handlerelease, "");
        this.AudioAttributesImplApi21Parcelizer = simpleBasePlayerExternalSyntheticLambda15;
        this.MediaBrowserCompatItemReceiver = lambdaupdatestateandinformlisteners59;
        this.IconCompatParcelizer = lambdaupdatestateforpendingoperation61comgoogleandroidexoplayer2simplebaseplayer;
        this.write = simpleBasePlayerPeriodData;
        this.MediaBrowserCompatCustomActionResultReceiver = handlerelease;
        this.RemoteActionCompatParcelizer = VideoTimelineResponseBody.write(setAction.write("raised", new ArrayList()), setAction.write(Scopes.PROFILE, new ArrayList()));
        this.AudioAttributesCompatParcelizer = VideoTimelineResponseBody.write(setAction.write("raised", new ArrayList()), setAction.write(Scopes.PROFILE, new ArrayList()));
        this.read = new SimpleDateFormat("yyyyMMdd", Locale.getDefault());
    }

    public final JSONArray write(String str, Map<String, ? extends Object> map, Location location) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(map, "");
        List<lambdasetMediaItemsInternal2comgoogleandroidexoplayer2SimpleBasePlayer> listRemoteActionCompatParcelizer = IntermediateLoginResponseBody.RemoteActionCompatParcelizer(new lambdasetMediaItemsInternal2comgoogleandroidexoplayer2SimpleBasePlayer(str, map, null, location, null, 20, null));
        AudioAttributesCompatParcelizer(listRemoteActionCompatParcelizer);
        return RemoteActionCompatParcelizer(listRemoteActionCompatParcelizer);
    }

    public final JSONArray read(Map<String, ? extends Object> map, List<? extends Map<String, ? extends Object>> list, Location location) {
        toMagicModuleMetaRepoModel.write(map, "");
        toMagicModuleMetaRepoModel.write(list, "");
        List<lambdasetMediaItemsInternal2comgoogleandroidexoplayer2SimpleBasePlayer> listRemoteActionCompatParcelizer = IntermediateLoginResponseBody.RemoteActionCompatParcelizer(new lambdasetMediaItemsInternal2comgoogleandroidexoplayer2SimpleBasePlayer("Charged", map, list, location, null, 16, null));
        AudioAttributesCompatParcelizer(listRemoteActionCompatParcelizer);
        return RemoteActionCompatParcelizer(listRemoteActionCompatParcelizer);
    }

    public final JSONArray IconCompatParcelizer(Map<String, ? extends Object> map, Location location) {
        toMagicModuleMetaRepoModel.write(map, "");
        return RemoteActionCompatParcelizer(IntermediateLoginResponseBody.RemoteActionCompatParcelizer(new lambdasetMediaItemsInternal2comgoogleandroidexoplayer2SimpleBasePlayer("App Launched", map, null, location, null, 20, null)));
    }

    public final JSONArray write(List<? extends JSONObject> list, Map<String, ? extends Object> map, Location location) {
        toMagicModuleMetaRepoModel.write(list, "");
        toMagicModuleMetaRepoModel.write(map, "");
        boolean z = false;
        for (JSONObject jSONObject : read((List<? extends JSONObject>) RemoteActionCompatParcelizer(this, new lambdasetMediaItemsInternal2comgoogleandroidexoplayer2SimpleBasePlayer("App Launched", map, null, location, null, 20, null), list))) {
            if (!write(jSONObject)) {
                if (z) {
                    RemoteActionCompatParcelizer();
                }
                JSONArray jSONArray = new JSONArray();
                jSONArray.put(jSONObject);
                return jSONArray;
            }
            write(jSONObject, lambdareplaceMediaItems5comgoogleandroidexoplayer2SimpleBasePlayer.read);
            z = true;
        }
        if (z) {
            RemoteActionCompatParcelizer();
        }
        return new JSONArray();
    }

    public final boolean IconCompatParcelizer(List<lambdanew0comgoogleandroidexoplayer2SimpleBasePlayer> list, String str) {
        toMagicModuleMetaRepoModel.write(list, "");
        toMagicModuleMetaRepoModel.write(str, "");
        return this.IconCompatParcelizer.IconCompatParcelizer(list, str);
    }

    private void AudioAttributesCompatParcelizer(List<lambdasetMediaItemsInternal2comgoogleandroidexoplayer2SimpleBasePlayer> list) throws JSONException {
        toMagicModuleMetaRepoModel.write(list, "");
        ArrayList arrayList = new ArrayList();
        access6500 write = this.write.getWrite();
        if (write != null) {
            Iterator<lambdasetMediaItemsInternal2comgoogleandroidexoplayer2SimpleBasePlayer> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                lambdasetMediaItemsInternal2comgoogleandroidexoplayer2SimpleBasePlayer next = it.next();
                JSONArray jSONArrayRemoteActionCompatParcelizer = write.RemoteActionCompatParcelizer();
                ArrayList arrayList2 = new ArrayList();
                int length = jSONArrayRemoteActionCompatParcelizer.length();
                for (int i = 0; i < length; i++) {
                    Object obj = jSONArrayRemoteActionCompatParcelizer.get(i);
                    if (obj instanceof JSONObject) {
                        arrayList2.add(obj);
                    }
                }
                arrayList.addAll(RemoteActionCompatParcelizer(this, next, arrayList2));
            }
            Iterator it2 = arrayList.iterator();
            boolean z = false;
            while (it2.hasNext()) {
                long jOptLong = ((JSONObject) it2.next()).optLong("ti");
                if (jOptLong != 0) {
                    lambdareplaceMediaItems5comgoogleandroidexoplayer2SimpleBasePlayer.Companion companion = lambdareplaceMediaItems5comgoogleandroidexoplayer2SimpleBasePlayer.INSTANCE;
                    List<Long> list2 = this.RemoteActionCompatParcelizer.get(lambdareplaceMediaItems5comgoogleandroidexoplayer2SimpleBasePlayer.Companion.write(list.get(0).AudioAttributesImplApi26Parcelizer()).getIconCompatParcelizer());
                    if (list2 != null) {
                        list2.add(Long.valueOf(jOptLong));
                    }
                    z = true;
                }
            }
            if (z) {
                write();
            }
        }
    }

    private JSONArray RemoteActionCompatParcelizer(List<lambdasetMediaItemsInternal2comgoogleandroidexoplayer2SimpleBasePlayer> list) throws JSONException {
        toMagicModuleMetaRepoModel.write(list, "");
        ArrayList arrayList = new ArrayList();
        access6500 write = this.write.getWrite();
        if (write != null) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                lambdasetMediaItemsInternal2comgoogleandroidexoplayer2SimpleBasePlayer lambdasetmediaitemsinternal2comgoogleandroidexoplayer2simplebaseplayer = (lambdasetMediaItemsInternal2comgoogleandroidexoplayer2SimpleBasePlayer) it.next();
                Object obj = lambdasetmediaitemsinternal2comgoogleandroidexoplayer2simplebaseplayer.AudioAttributesCompatParcelizer().get("oldValue");
                Object obj2 = lambdasetmediaitemsinternal2comgoogleandroidexoplayer2simplebaseplayer.AudioAttributesCompatParcelizer().get("newValue");
                if (obj2 == null || !toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(obj2, obj)) {
                    JSONArray jSONArray = write.read();
                    ArrayList arrayList2 = new ArrayList();
                    int length = jSONArray.length();
                    for (int i = 0; i < length; i++) {
                        Object obj3 = jSONArray.get(i);
                        if (obj3 instanceof JSONObject) {
                            arrayList2.add(obj3);
                        }
                    }
                    arrayList.addAll(RemoteActionCompatParcelizer(this, lambdasetmediaitemsinternal2comgoogleandroidexoplayer2simplebaseplayer, arrayList2));
                }
            }
            boolean z = false;
            for (JSONObject jSONObject : read(arrayList)) {
                if (!write(jSONObject)) {
                    if (z) {
                        RemoteActionCompatParcelizer();
                    }
                    AudioAttributesImplApi26Parcelizer(jSONObject);
                    JSONArray jSONArray2 = new JSONArray();
                    jSONArray2.put(jSONObject);
                    return jSONArray2;
                }
                lambdareplaceMediaItems5comgoogleandroidexoplayer2SimpleBasePlayer.Companion companion = lambdareplaceMediaItems5comgoogleandroidexoplayer2SimpleBasePlayer.INSTANCE;
                write(jSONObject, lambdareplaceMediaItems5comgoogleandroidexoplayer2SimpleBasePlayer.Companion.write(list.get(0).AudioAttributesImplApi26Parcelizer()));
                z = true;
            }
            if (z) {
                RemoteActionCompatParcelizer();
            }
            getShowPopup getshowpopup = getShowPopup.INSTANCE;
        }
        return new JSONArray();
    }

    private static /* synthetic */ List RemoteActionCompatParcelizer(handleSetVideoOutput handlesetvideooutput, lambdasetMediaItemsInternal2comgoogleandroidexoplayer2SimpleBasePlayer lambdasetmediaitemsinternal2comgoogleandroidexoplayer2simplebaseplayer, List list) {
        return handlesetvideooutput.AudioAttributesCompatParcelizer(lambdasetmediaitemsinternal2comgoogleandroidexoplayer2simplebaseplayer, (List<? extends JSONObject>) list, new getAnswerMap() { // from class: o.handleSetVolume
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return handleSetVideoOutput.read((String) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return getShowPopup.INSTANCE;
    }

    private List<JSONObject> AudioAttributesCompatParcelizer(lambdasetMediaItemsInternal2comgoogleandroidexoplayer2SimpleBasePlayer lambdasetmediaitemsinternal2comgoogleandroidexoplayer2simplebaseplayer, List<? extends JSONObject> list, getAnswerMap<? super String, getShowPopup> getanswermap) {
        toMagicModuleMetaRepoModel.write(lambdasetmediaitemsinternal2comgoogleandroidexoplayer2simplebaseplayer, "");
        toMagicModuleMetaRepoModel.write(list, "");
        toMagicModuleMetaRepoModel.write(getanswermap, "");
        ArrayList arrayList = new ArrayList();
        for (JSONObject jSONObject : list) {
            CustomTemplateInAppData.Companion companion = CustomTemplateInAppData.INSTANCE;
            CustomTemplateInAppData customTemplateInAppDataIconCompatParcelizer = CustomTemplateInAppData.Companion.IconCompatParcelizer(jSONObject);
            String remoteActionCompatParcelizer = customTemplateInAppDataIconCompatParcelizer != null ? customTemplateInAppDataIconCompatParcelizer.getRemoteActionCompatParcelizer() : null;
            if (remoteActionCompatParcelizer == null || this.MediaBrowserCompatCustomActionResultReceiver.AudioAttributesCompatParcelizer(remoteActionCompatParcelizer)) {
                String strOptString = jSONObject.optString("ti");
                if (this.AudioAttributesImplApi21Parcelizer.read(MediaBrowserCompatItemReceiver(jSONObject), lambdasetmediaitemsinternal2comgoogleandroidexoplayer2simplebaseplayer)) {
                    lambdasetmediaitemsinternal2comgoogleandroidexoplayer2simplebaseplayer.getAudioAttributesCompatParcelizer();
                    RendererWakeupListener.RatingCompat();
                    lambdaupdateStateAndInformListeners59 lambdaupdatestateandinformlisteners59 = this.MediaBrowserCompatItemReceiver;
                    toMagicModuleMetaRepoModel.write((Object) strOptString);
                    lambdaupdatestateandinformlisteners59.read(strOptString);
                    boolean zIconCompatParcelizer = this.IconCompatParcelizer.IconCompatParcelizer(AudioAttributesImplApi21Parcelizer(jSONObject), strOptString);
                    if (this.IconCompatParcelizer.RemoteActionCompatParcelizer(AudioAttributesImplApi21Parcelizer(jSONObject), strOptString)) {
                        getanswermap.invoke("");
                    }
                    if (zIconCompatParcelizer) {
                        lambdasetmediaitemsinternal2comgoogleandroidexoplayer2simplebaseplayer.getAudioAttributesCompatParcelizer();
                        RendererWakeupListener.RatingCompat();
                        arrayList.add(jSONObject);
                    } else {
                        lambdasetmediaitemsinternal2comgoogleandroidexoplayer2simplebaseplayer.getAudioAttributesCompatParcelizer();
                        RendererWakeupListener.RatingCompat();
                    }
                } else {
                    lambdasetmediaitemsinternal2comgoogleandroidexoplayer2simplebaseplayer.getAudioAttributesCompatParcelizer();
                    RendererWakeupListener.RatingCompat();
                }
            }
        }
        return arrayList;
    }

    private static List<SimpleBasePlayerExternalSyntheticLambda0> MediaBrowserCompatItemReceiver(JSONObject jSONObject) throws JSONException {
        toMagicModuleMetaRepoModel.write(jSONObject, "");
        JSONArray jSONArray = PlayerPlaybackSuppressionReason.read(jSONObject.optJSONArray("whenTriggers"));
        newEncryptedObject newencryptedobjectIconCompatParcelizer = getQues.IconCompatParcelizer(0, jSONArray.length());
        ArrayList arrayList = new ArrayList();
        Iterator<Integer> it = newencryptedobjectIconCompatParcelizer.iterator();
        while (it.hasNext()) {
            Object obj = jSONArray.get(((getSINGLE_SYNC_RESULT) it).RemoteActionCompatParcelizer());
            JSONObject jSONObject2 = obj instanceof JSONObject ? (JSONObject) obj : null;
            SimpleBasePlayerExternalSyntheticLambda0 simpleBasePlayerExternalSyntheticLambda0 = jSONObject2 != null ? new SimpleBasePlayerExternalSyntheticLambda0(jSONObject2) : null;
            if (simpleBasePlayerExternalSyntheticLambda0 != null) {
                arrayList.add(simpleBasePlayerExternalSyntheticLambda0);
            }
        }
        return arrayList;
    }

    private static List<lambdanew0comgoogleandroidexoplayer2SimpleBasePlayer> AudioAttributesImplApi21Parcelizer(JSONObject jSONObject) throws JSONException {
        toMagicModuleMetaRepoModel.write(jSONObject, "");
        JSONArray jSONArray = PlayerPlaybackSuppressionReason.read(jSONObject.optJSONArray("frequencyLimits"));
        JSONArray jSONArray2 = PlayerPlaybackSuppressionReason.read(jSONObject.optJSONArray("occurrenceLimits"));
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            Object obj = jSONArray.get(i);
            if (obj instanceof JSONObject) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = arrayList;
        ArrayList arrayList3 = new ArrayList();
        int length2 = jSONArray2.length();
        for (int i2 = 0; i2 < length2; i2++) {
            Object obj2 = jSONArray2.get(i2);
            if (obj2 instanceof JSONObject) {
                arrayList3.add(obj2);
            }
        }
        List<JSONObject> listAudioAttributesCompatParcelizer = IntermediateLoginResponseBody.AudioAttributesCompatParcelizer((Collection) arrayList2, (Iterable) arrayList3);
        ArrayList arrayList4 = new ArrayList();
        for (JSONObject jSONObject2 : listAudioAttributesCompatParcelizer) {
            lambdanew0comgoogleandroidexoplayer2SimpleBasePlayer lambdanew0comgoogleandroidexoplayer2simplebaseplayer = PlayerPlaybackSuppressionReason.write(jSONObject2) ? new lambdanew0comgoogleandroidexoplayer2SimpleBasePlayer(jSONObject2) : null;
            if (lambdanew0comgoogleandroidexoplayer2simplebaseplayer != null) {
                arrayList4.add(lambdanew0comgoogleandroidexoplayer2simplebaseplayer);
            }
        }
        return arrayList4;
    }

    private static List<JSONObject> read(List<? extends JSONObject> list) {
        toMagicModuleMetaRepoModel.write(list, "");
        final getAnswerMap getanswermap = new getAnswerMap() { // from class: o.lambdaremoveMediaItems6comgoogleandroidexoplayer2SimpleBasePlayer
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return Integer.valueOf(handleSetVideoOutput.RemoteActionCompatParcelizer((JSONObject) obj));
            }
        };
        final getAnswerMap getanswermap2 = new getAnswerMap() { // from class: o.lambdamoveMediaItems4comgoogleandroidexoplayer2SimpleBasePlayer
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return handleSetVideoOutput.AudioAttributesCompatParcelizer((JSONObject) obj);
            }
        };
        final Comparator comparator = new Comparator() { // from class: o.handleSetVideoOutput.2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return getConfigExpirySeconds.read((Comparable) getanswermap.invoke((JSONObject) t2), (Comparable) getanswermap.invoke((JSONObject) t));
            }
        };
        return IntermediateLoginResponseBody.AudioAttributesCompatParcelizer((Iterable) list, new Comparator() { // from class: o.handleSetVideoOutput.4
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                int iCompare = comparator.compare(t, t2);
                if (iCompare != 0) {
                    return iCompare;
                }
                return getConfigExpirySeconds.read((Comparable) getanswermap2.invoke((JSONObject) t), (Comparable) getanswermap2.invoke((JSONObject) t2));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int RemoteActionCompatParcelizer(JSONObject jSONObject) {
        toMagicModuleMetaRepoModel.write(jSONObject, "");
        return jSONObject.optInt("priority", 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String AudioAttributesCompatParcelizer(JSONObject jSONObject) {
        toMagicModuleMetaRepoModel.write(jSONObject, "");
        return jSONObject.optString("ti", String.valueOf(onDroppedVideoFrames.IconCompatParcelizer.read().getTime() / 1000));
    }

    private static boolean write(JSONObject jSONObject) {
        return jSONObject.optBoolean("suppressed");
    }

    private void write(JSONObject jSONObject, lambdareplaceMediaItems5comgoogleandroidexoplayer2SimpleBasePlayer lambdareplacemediaitems5comgoogleandroidexoplayer2simplebaseplayer) {
        toMagicModuleMetaRepoModel.write(jSONObject, "");
        toMagicModuleMetaRepoModel.write(lambdareplacemediaitems5comgoogleandroidexoplayer2simplebaseplayer, "");
        String strOptString = jSONObject.optString("ti");
        toMagicModuleMetaRepoModel.write((Object) strOptString);
        String strAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(this, strOptString);
        String strOptString2 = jSONObject.optString("wzrk_pivot", "wzrk_default");
        int iOptInt = jSONObject.optInt("wzrk_cgId");
        List<Map<String, Object>> list = this.AudioAttributesCompatParcelizer.get(lambdareplacemediaitems5comgoogleandroidexoplayer2simplebaseplayer.getIconCompatParcelizer());
        if (list != null) {
            list.add(VideoTimelineResponseBody.RemoteActionCompatParcelizer(setAction.write("wzrk_id", strAudioAttributesCompatParcelizer), setAction.write("wzrk_pivot", strOptString2), setAction.write("wzrk_cgId", Integer.valueOf(iOptInt))));
        }
    }

    private static /* synthetic */ String AudioAttributesCompatParcelizer(handleSetVideoOutput handlesetvideooutput, String str) {
        return handlesetvideooutput.IconCompatParcelizer(str, onDroppedVideoFrames.IconCompatParcelizer);
    }

    private String IconCompatParcelizer(String str, onDroppedVideoFrames ondroppedvideoframes) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(ondroppedvideoframes, "");
        String str2 = this.read.format(ondroppedvideoframes.read());
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append('_');
        sb.append(str2);
        return sb.toString();
    }

    private static /* synthetic */ void AudioAttributesImplApi26Parcelizer(JSONObject jSONObject) throws JSONException {
        read(jSONObject, onDroppedVideoFrames.IconCompatParcelizer);
    }

    private static void read(JSONObject jSONObject, onDroppedVideoFrames ondroppedvideoframes) throws JSONException {
        toMagicModuleMetaRepoModel.write(jSONObject, "");
        toMagicModuleMetaRepoModel.write(ondroppedvideoframes, "");
        Object objOpt = jSONObject.opt("wzrk_ttl_offset");
        Long l = objOpt instanceof Long ? (Long) objOpt : null;
        if (l != null) {
            jSONObject.put("wzrk_ttl", ondroppedvideoframes.RemoteActionCompatParcelizer() + l.longValue());
        } else {
            jSONObject.remove("wzrk_ttl");
        }
    }

    private final void read(JSONObject jSONObject, lambdareplaceMediaItems5comgoogleandroidexoplayer2SimpleBasePlayer lambdareplacemediaitems5comgoogleandroidexoplayer2simplebaseplayer) {
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("inapps_eval");
        if (jSONArrayOptJSONArray != null) {
            int length = jSONArrayOptJSONArray.length();
            boolean z = false;
            for (int i = 0; i < length; i++) {
                final long jOptLong = jSONArrayOptJSONArray.optLong(i);
                if (jOptLong != 0) {
                    List<Long> list = this.RemoteActionCompatParcelizer.get(lambdareplacemediaitems5comgoogleandroidexoplayer2simplebaseplayer.getIconCompatParcelizer());
                    if (list != null) {
                        IntermediateLoginResponseBody.read((List) list, new getAnswerMap() { // from class: o.handleStop
                            @Override // kotlin.getAnswerMap
                            public final Object invoke(Object obj) {
                                return Boolean.valueOf(handleSetVideoOutput.AudioAttributesCompatParcelizer(jOptLong, ((Long) obj).longValue()));
                            }
                        });
                    }
                    z = true;
                }
            }
            if (z) {
                write();
            }
        }
    }

    private final void IconCompatParcelizer(JSONObject jSONObject, lambdareplaceMediaItems5comgoogleandroidexoplayer2SimpleBasePlayer lambdareplacemediaitems5comgoogleandroidexoplayer2simplebaseplayer) {
        List<Map<String, Object>> list;
        Iterator<Map<String, Object>> it;
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("inapps_suppressed");
        if (jSONArrayOptJSONArray == null || (list = this.AudioAttributesCompatParcelizer.get(lambdareplacemediaitems5comgoogleandroidexoplayer2simplebaseplayer.getIconCompatParcelizer())) == null || (it = list.iterator()) == null) {
            return;
        }
        boolean z = false;
        while (it.hasNext()) {
            Object obj = it.next().get("wzrk_id");
            String str = obj instanceof String ? (String) obj : null;
            if (str != null) {
                String string = jSONArrayOptJSONArray.toString();
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
                if (TestGroupLSModel.write((CharSequence) string, (CharSequence) str, false)) {
                    it.remove();
                    z = true;
                }
            }
        }
        if (z) {
            RemoteActionCompatParcelizer();
        }
    }

    @Override // kotlin.getStarRating
    public final JSONObject IconCompatParcelizer(StarRating starRating, lambdareplaceMediaItems5comgoogleandroidexoplayer2SimpleBasePlayer lambdareplacemediaitems5comgoogleandroidexoplayer2simplebaseplayer) throws JSONException {
        toMagicModuleMetaRepoModel.write(starRating, "");
        toMagicModuleMetaRepoModel.write(lambdareplacemediaitems5comgoogleandroidexoplayer2simplebaseplayer, "");
        JSONObject jSONObject = new JSONObject();
        if (starRating == StarRating.IconCompatParcelizer) {
            List<Long> list = this.RemoteActionCompatParcelizer.get(lambdareplacemediaitems5comgoogleandroidexoplayer2simplebaseplayer.getIconCompatParcelizer());
            if (list != null) {
                if (list.isEmpty()) {
                    list = null;
                }
                if (list != null) {
                    jSONObject.put("inapps_eval", lambdaonAudioSessionIdChanged54.IconCompatParcelizer(list));
                }
            }
            List<Map<String, Object>> list2 = this.AudioAttributesCompatParcelizer.get(lambdareplacemediaitems5comgoogleandroidexoplayer2simplebaseplayer.getIconCompatParcelizer());
            if (list2 != null) {
                if (list2.isEmpty()) {
                    list2 = null;
                }
                if (list2 != null) {
                    jSONObject.put("inapps_suppressed", lambdaonAudioSessionIdChanged54.IconCompatParcelizer(list2));
                }
            }
        }
        if (PlayerPlaybackSuppressionReason.write(jSONObject)) {
            return jSONObject;
        }
        return null;
    }

    @Override // kotlin.getStarRating
    public final void AudioAttributesCompatParcelizer(JSONObject jSONObject, StarRating starRating, lambdareplaceMediaItems5comgoogleandroidexoplayer2SimpleBasePlayer lambdareplacemediaitems5comgoogleandroidexoplayer2simplebaseplayer) {
        toMagicModuleMetaRepoModel.write(jSONObject, "");
        toMagicModuleMetaRepoModel.write(starRating, "");
        toMagicModuleMetaRepoModel.write(lambdareplacemediaitems5comgoogleandroidexoplayer2simplebaseplayer, "");
        if (starRating == StarRating.IconCompatParcelizer) {
            read(jSONObject, lambdareplacemediaitems5comgoogleandroidexoplayer2simplebaseplayer);
            IconCompatParcelizer(jSONObject, lambdareplacemediaitems5comgoogleandroidexoplayer2simplebaseplayer);
        }
    }

    public final void AudioAttributesCompatParcelizer() {
        access6500 write = this.write.getWrite();
        if (write != null) {
            Map mapIconCompatParcelizer = lambdaonAudioSessionIdChanged54.IconCompatParcelizer(write.write());
            toMagicModuleMetaRepoModel.write(mapIconCompatParcelizer);
            LinkedHashMap linkedHashMap = new LinkedHashMap(VideoTimelineResponseBody.read(mapIconCompatParcelizer.size()));
            for (Map.Entry entry : mapIconCompatParcelizer.entrySet()) {
                Object key = entry.getKey();
                Object value = entry.getValue();
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(value, "");
                Iterable iterable = (Iterable) value;
                ArrayList arrayList = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer(iterable, 10));
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(Long.valueOf(((Number) it.next()).longValue()));
                }
                linkedHashMap.put(key, IntermediateLoginResponseBody.MediaBrowserCompatItemReceiver((Collection) arrayList));
            }
            this.RemoteActionCompatParcelizer.putAll(linkedHashMap);
            Map<String, List<Map<String, Object>>> map = this.AudioAttributesCompatParcelizer;
            Map<? extends String, ? extends List<Map<String, Object>>> mapIconCompatParcelizer2 = lambdaonAudioSessionIdChanged54.IconCompatParcelizer(write.AudioAttributesCompatParcelizer());
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(mapIconCompatParcelizer2, "");
            map.putAll(mapIconCompatParcelizer2);
        }
    }

    private void write() {
        access6500 write = this.write.getWrite();
        if (write != null) {
            write.read(new JSONObject(VideoTimelineResponseBody.AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer)));
        }
    }

    private void RemoteActionCompatParcelizer() {
        access6500 write = this.write.getWrite();
        if (write != null) {
            write.RemoteActionCompatParcelizer(new JSONObject(VideoTimelineResponseBody.AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer)));
        }
    }

    public final JSONArray write(Map<String, ? extends Map<String, ? extends Object>> map, Location location, Map<String, ? extends Object> map2) {
        toMagicModuleMetaRepoModel.write(map, "");
        toMagicModuleMetaRepoModel.write(map2, "");
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, ? extends Map<String, ? extends Object>> entry : map.entrySet()) {
            Map mapIconCompatParcelizer = VideoTimelineResponseBody.IconCompatParcelizer(entry.getValue());
            mapIconCompatParcelizer.putAll(map2);
            StringBuilder sb = new StringBuilder();
            sb.append(entry.getKey());
            sb.append("_CTUserAttributeChange");
            arrayList.add(new lambdasetMediaItemsInternal2comgoogleandroidexoplayer2SimpleBasePlayer(sb.toString(), mapIconCompatParcelizer, null, location, entry.getKey(), 4, null));
        }
        ArrayList arrayList2 = arrayList;
        AudioAttributesCompatParcelizer(arrayList2);
        return RemoteActionCompatParcelizer(arrayList2);
    }
}
