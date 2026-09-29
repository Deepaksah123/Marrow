package kotlin;

import android.content.Context;
import android.content.SharedPreferences;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class lambdaclearVideoOutput21 {
    private final CleverTapInstanceConfig AudioAttributesCompatParcelizer;
    private final Context read;
    private final lambdasetDeviceMuted29 write;

    public lambdaclearVideoOutput21(Context context, CleverTapInstanceConfig cleverTapInstanceConfig, lambdasetDeviceMuted29 lambdasetdevicemuted29) {
        toMagicModuleMetaRepoModel.write(context, "");
        toMagicModuleMetaRepoModel.write(cleverTapInstanceConfig, "");
        toMagicModuleMetaRepoModel.write(lambdasetdevicemuted29, "");
        this.read = context;
        this.AudioAttributesCompatParcelizer = cleverTapInstanceConfig;
        this.write = lambdasetdevicemuted29;
    }

    public final String IconCompatParcelizer() {
        return RendererCapabilitiesFormatSupport.IconCompatParcelizer(this.read, this.AudioAttributesCompatParcelizer, "cachedGUIDsKey", null);
    }

    public final JSONObject RemoteActionCompatParcelizer() {
        JSONObject jSONObjectIconCompatParcelizer = AnalyticsCollector.IconCompatParcelizer(IconCompatParcelizer(), this.AudioAttributesCompatParcelizer.MediaBrowserCompatItemReceiver(), this.AudioAttributesCompatParcelizer.write());
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(jSONObjectIconCompatParcelizer, "");
        return jSONObjectIconCompatParcelizer;
    }

    public final void write(String str) {
        RendererCapabilitiesFormatSupport.AudioAttributesCompatParcelizer(this.read, RendererCapabilitiesFormatSupport.write(this.AudioAttributesCompatParcelizer.write(), "cachedGUIDsKey"), str);
    }

    public final void read() {
        RendererCapabilitiesFormatSupport.write(this.read, RendererCapabilitiesFormatSupport.write(this.AudioAttributesCompatParcelizer.write(), "cachedGUIDsKey"));
    }

    public final void read(int i) {
        RendererCapabilitiesFormatSupport.AudioAttributesCompatParcelizer(this.read, RendererCapabilitiesFormatSupport.write(this.AudioAttributesCompatParcelizer.write(), "cachedGUIDsLengthKey"), i);
    }

    public final Map<String, JSONObject> AudioAttributesCompatParcelizer() {
        return this.write.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer.write());
    }

    public final long AudioAttributesCompatParcelizer(String str, JSONObject jSONObject) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(jSONObject, "");
        return this.write.read(this.AudioAttributesCompatParcelizer.write(), str, jSONObject);
    }

    public final void write(List<String> list, getAnswerMap<? super String, String> getanswermap) {
        toMagicModuleMetaRepoModel.write(list, "");
        toMagicModuleMetaRepoModel.write(getanswermap, "");
        File[] fileArrListFiles = new File(this.read.getApplicationInfo().dataDir, "shared_prefs").listFiles(new FilenameFilter() { // from class: o.getStateWithNewPlaylist
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str) {
                return lambdaclearVideoOutput21.RemoteActionCompatParcelizer(this.read, str);
            }
        });
        if (fileArrListFiles != null) {
            ArrayList<SharedPreferences> arrayList = new ArrayList(fileArrListFiles.length);
            for (File file : fileArrListFiles) {
                toMagicModuleMetaRepoModel.write(file);
                arrayList.add(this.read.getSharedPreferences(downloadMagicModuleDetail.AudioAttributesImplApi26Parcelizer(file), 0));
            }
            for (SharedPreferences sharedPreferences : arrayList) {
                for (String str : list) {
                    String string = sharedPreferences.getString(str, null);
                    if (string != null) {
                        sharedPreferences.edit().putString(str, getanswermap.invoke(string)).apply();
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean RemoteActionCompatParcelizer(lambdaclearVideoOutput21 lambdaclearvideooutput21, String str) {
        toMagicModuleMetaRepoModel.write(lambdaclearvideooutput21, "");
        toMagicModuleMetaRepoModel.write((Object) str);
        if (!TestGroupLSModel.MediaBrowserCompatCustomActionResultReceiver(str, "inApp")) {
            return false;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(lambdaclearvideooutput21.AudioAttributesCompatParcelizer.write());
        sb.append(".xml");
        return TestGroupLSModel.AudioAttributesImplApi21Parcelizer(str, sb.toString());
    }
}
