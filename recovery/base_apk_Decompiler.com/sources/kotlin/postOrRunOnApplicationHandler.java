package kotlin;

import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class postOrRunOnApplicationHandler implements lambdaupdateStateAndInformListeners56 {
    private final String AudioAttributesCompatParcelizer;
    private final SimpleBasePlayerPeriodData IconCompatParcelizer;

    public postOrRunOnApplicationHandler(SimpleBasePlayerPeriodData simpleBasePlayerPeriodData, String str) {
        toMagicModuleMetaRepoModel.write(simpleBasePlayerPeriodData, "");
        toMagicModuleMetaRepoModel.write(str, "");
        this.IconCompatParcelizer = simpleBasePlayerPeriodData;
        this.AudioAttributesCompatParcelizer = str;
    }

    @Override // kotlin.lambdaupdateStateAndInformListeners56
    public final void read(JSONArray jSONArray) {
        synchronized (this) {
            toMagicModuleMetaRepoModel.write(jSONArray, "");
            JSONArray jSONArrayAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer();
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                try {
                    jSONArrayAudioAttributesCompatParcelizer.put(jSONArray.getJSONObject(i));
                } catch (Exception e) {
                    e.getMessage();
                    RendererWakeupListener.AudioAttributesImplApi21Parcelizer();
                }
            }
            AudioAttributesCompatParcelizer(jSONArrayAudioAttributesCompatParcelizer);
        }
    }

    @Override // kotlin.lambdaupdateStateAndInformListeners56
    public final void read(JSONObject jSONObject) {
        synchronized (this) {
            toMagicModuleMetaRepoModel.write(jSONObject, "");
            JSONArray jSONArrayAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer();
            onSeekStarted.IconCompatParcelizer(jSONArrayAudioAttributesCompatParcelizer, jSONObject);
            AudioAttributesCompatParcelizer(jSONArrayAudioAttributesCompatParcelizer);
        }
    }

    @Override // kotlin.lambdaupdateStateAndInformListeners56
    public final JSONObject read() {
        synchronized (this) {
            JSONArray jSONArrayAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer();
            if (jSONArrayAudioAttributesCompatParcelizer.length() == 0) {
                return null;
            }
            Object objRemove = jSONArrayAudioAttributesCompatParcelizer.remove(0);
            AudioAttributesCompatParcelizer(jSONArrayAudioAttributesCompatParcelizer);
            return objRemove instanceof JSONObject ? (JSONObject) objRemove : null;
        }
    }

    private final JSONArray AudioAttributesCompatParcelizer() {
        access6500 write = this.IconCompatParcelizer.getWrite();
        return write == null ? new JSONArray() : write.IconCompatParcelizer();
    }

    private final getShowPopup AudioAttributesCompatParcelizer(JSONArray jSONArray) {
        access6500 write = this.IconCompatParcelizer.getWrite();
        if (write == null) {
            return null;
        }
        write.IconCompatParcelizer(jSONArray);
        return getShowPopup.INSTANCE;
    }
}
