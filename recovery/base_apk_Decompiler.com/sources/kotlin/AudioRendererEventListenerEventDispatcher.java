package kotlin;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class AudioRendererEventListenerEventDispatcher {
    public final Object IconCompatParcelizer;
    public final String RemoteActionCompatParcelizer;
    public final AudioProcessor read;

    public AudioRendererEventListenerEventDispatcher(String str, Object obj, AudioProcessor audioProcessor) {
        this.RemoteActionCompatParcelizer = str;
        this.read = audioProcessor;
        Object objWrap = JSONObject.wrap(obj);
        this.IconCompatParcelizer = objWrap == null ? JSONObject.NULL : objWrap;
    }
}
