package kotlin;

import android.content.Context;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class getCurrentUnixTimeMs extends TimelinePeriodExternalSyntheticLambda0 {
    private final RendererWakeupListener AudioAttributesCompatParcelizer;
    private final setSurfaceSize RemoteActionCompatParcelizer;
    private final CleverTapInstanceConfig read;

    public getCurrentUnixTimeMs(CleverTapInstanceConfig cleverTapInstanceConfig, setSurfaceSize setsurfacesize) {
        toMagicModuleMetaRepoModel.write(cleverTapInstanceConfig, "");
        toMagicModuleMetaRepoModel.write(setsurfacesize, "");
        this.read = cleverTapInstanceConfig;
        this.RemoteActionCompatParcelizer = setsurfacesize;
        RendererWakeupListener rendererWakeupListenerMediaBrowserCompatItemReceiver = cleverTapInstanceConfig.MediaBrowserCompatItemReceiver();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(rendererWakeupListenerMediaBrowserCompatItemReceiver, "");
        this.AudioAttributesCompatParcelizer = rendererWakeupListenerMediaBrowserCompatItemReceiver;
    }

    @Override // kotlin.getPositionInWindowUs
    public final void IconCompatParcelizer(JSONObject jSONObject, String str, Context context) {
        toMagicModuleMetaRepoModel.write(context, "");
        this.AudioAttributesCompatParcelizer.write(this.read.write(), "Processing Content Fetch response...");
        if (this.read.MediaMetadataCompat()) {
            this.AudioAttributesCompatParcelizer.write(this.read.write(), "CleverTap instance is configured to analytics only, not processing Content Fetch response");
            return;
        }
        if (jSONObject == null) {
            this.AudioAttributesCompatParcelizer.write(this.read.write(), "Can't parse Content Fetch Response, JSON response object is null");
            return;
        }
        if (!jSONObject.has("content_fetch")) {
            this.AudioAttributesCompatParcelizer.write(this.read.write(), "JSON object doesn't contain the content_fetch key");
            return;
        }
        try {
            this.AudioAttributesCompatParcelizer.write(this.read.write(), "Processing Content Fetch response");
            JSONArray jSONArray = jSONObject.getJSONArray("content_fetch");
            toMagicModuleMetaRepoModel.write(jSONArray);
            RemoteActionCompatParcelizer(jSONArray, context);
        } catch (Throwable unused) {
            RendererWakeupListener rendererWakeupListener = this.AudioAttributesCompatParcelizer;
            this.read.write();
            rendererWakeupListener.IconCompatParcelizer();
        }
    }

    private final void RemoteActionCompatParcelizer(JSONArray jSONArray, Context context) {
        if (jSONArray.length() == 0) {
            this.AudioAttributesCompatParcelizer.write(this.read.write(), "No content fetch items to process");
            return;
        }
        RendererWakeupListener rendererWakeupListener = this.AudioAttributesCompatParcelizer;
        String strWrite = this.read.write();
        StringBuilder sb = new StringBuilder("Found ");
        sb.append(jSONArray.length());
        sb.append(" content fetch items");
        rendererWakeupListener.write(strWrite, sb.toString());
        setSurfaceSize setsurfacesize = this.RemoteActionCompatParcelizer;
        String packageName = context.getPackageName();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(packageName, "");
        setsurfacesize.AudioAttributesCompatParcelizer(jSONArray, packageName);
    }
}
