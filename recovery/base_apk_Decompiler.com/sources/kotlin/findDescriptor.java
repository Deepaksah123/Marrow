package kotlin;

import android.os.Process;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class findDescriptor {
    public static final DashChunkSource read(getPrimaryStreamIndex getprimarystreamindex, String str) throws JSONException {
        toMagicModuleMetaRepoModel.write(getprimarystreamindex, "");
        toMagicModuleMetaRepoModel.write(str, "");
        JSONObject jSONObject = new JSONObject();
        for (getGroupedAdaptationSetIndices getgroupedadaptationsetindices : getprimarystreamindex.AudioAttributesCompatParcelizer()) {
            jSONObject.put(String.valueOf(getgroupedadaptationsetindices.read().getIconCompatParcelizer()), RemoteActionCompatParcelizer(getgroupedadaptationsetindices));
        }
        String string = jSONObject.toString();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
        return new DashChunkSource(str, string);
    }

    private static final JSONObject RemoteActionCompatParcelizer(getGroupedAdaptationSetIndices getgroupedadaptationsetindices) throws Throwable {
        JSONObject jSONObject = new JSONObject();
        for (buildPrimaryAndEmbeddedTrackGroupInfos buildprimaryandembeddedtrackgroupinfos : getgroupedadaptationsetindices.IconCompatParcelizer()) {
            Enum r2 = buildprimaryandembeddedtrackgroupinfos.read$5e726e45();
            try {
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-882924932);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) (61117 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), (Process.myPid() >> 22) + 11734, 22 - Process.getGidForName(""), -1256823063, false, "AudioAttributesCompatParcelizer", new Class[0]);
                }
                jSONObject.put((String) ((Method) objRemoteActionCompatParcelizer).invoke(r2, null), AudioAttributesCompatParcelizer(buildprimaryandembeddedtrackgroupinfos));
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        return jSONObject;
    }

    private static final JSONObject AudioAttributesCompatParcelizer(buildPrimaryAndEmbeddedTrackGroupInfos buildprimaryandembeddedtrackgroupinfos) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        for (getClosedCaptionTrackFormats getclosedcaptiontrackformats : buildprimaryandembeddedtrackgroupinfos.IconCompatParcelizer()) {
            jSONObject.put(getclosedcaptiontrackformats.getWrite().getWrite(), read(getclosedcaptiontrackformats));
        }
        return jSONObject;
    }

    private static final JSONObject read(getClosedCaptionTrackFormats getclosedcaptiontrackformats) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("cp", getclosedcaptiontrackformats.getRead());
        jSONObject.put("ip", getclosedcaptiontrackformats.getIconCompatParcelizer());
        jSONObject.put("em", getclosedcaptiontrackformats.getAudioAttributesCompatParcelizer());
        return jSONObject;
    }
}
