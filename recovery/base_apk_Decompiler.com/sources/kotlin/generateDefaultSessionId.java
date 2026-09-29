package kotlin;

import com.facebook.GraphRequest;
import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import kotlin.Metadata;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0003J\u0015\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0007¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\f\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0007¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000e\u0010\u0003"}, d2 = {"Lo/generateDefaultSessionId;", "", "<init>", "()V", "", "AudioAttributesCompatParcelizer", "", "Ljava/io/File;", "IconCompatParcelizer", "()[Ljava/io/File;", "", "p0", "read", "(Ljava/lang/String;)V", "RemoteActionCompatParcelizer"}, k = 1, mv = {1, 4, 0})
public final class generateDefaultSessionId {
    public static final generateDefaultSessionId INSTANCE = new generateDefaultSessionId();

    private generateDefaultSessionId() {
    }

    @getMagicModuleMeta
    public static final void read(String p0) {
        try {
            new clearCurrentSession(p0).write();
        } catch (Exception unused) {
        }
    }

    @getMagicModuleMeta
    public static final void AudioAttributesCompatParcelizer() {
        if (lambdaonMediaMetadataChanged48.AudioAttributesImplApi26Parcelizer()) {
            RemoteActionCompatParcelizer();
        }
    }

    @getMagicModuleMeta
    private static void RemoteActionCompatParcelizer() {
        if (DefaultAnalyticsCollectorMediaPeriodQueueTracker.MediaBrowserCompatCustomActionResultReceiver()) {
            return;
        }
        File[] fileArrIconCompatParcelizer = IconCompatParcelizer();
        final ArrayList arrayList = new ArrayList();
        for (File file : fileArrIconCompatParcelizer) {
            clearCurrentSession clearcurrentsession = new clearCurrentSession(file);
            if (clearcurrentsession.AudioAttributesCompatParcelizer()) {
                arrayList.add(clearcurrentsession);
            }
        }
        IntermediateLoginResponseBody.IconCompatParcelizer(arrayList, new Comparator<clearCurrentSession>() { // from class: o.generateDefaultSessionId.4
            @Override // java.util.Comparator
            /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
            public final int compare(clearCurrentSession clearcurrentsession2, clearCurrentSession clearcurrentsession3) {
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(clearcurrentsession3, "");
                return clearcurrentsession2.write(clearcurrentsession3);
            }
        });
        JSONArray jSONArray = new JSONArray();
        for (int i = 0; i < arrayList.size() && i < 1000; i++) {
            jSONArray.put(arrayList.get(i));
        }
        getReadingMediaPeriod.RemoteActionCompatParcelizer("error_reports", jSONArray, new GraphRequest.write() { // from class: o.generateDefaultSessionId.2
            @Override // com.facebook.GraphRequest.write
            public final void IconCompatParcelizer(lambdaonPlayerError41 lambdaonplayererror41) {
                JSONObject jSONObject;
                toMagicModuleMetaRepoModel.write(lambdaonplayererror41, "");
                try {
                    if (lambdaonplayererror41.getWrite() == null && (jSONObject = lambdaonplayererror41.getAudioAttributesImplBaseParcelizer()) != null && jSONObject.getBoolean("success")) {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            ((clearCurrentSession) it.next()).IconCompatParcelizer();
                        }
                    }
                } catch (JSONException unused) {
                }
            }
        });
    }

    @getMagicModuleMeta
    private static File[] IconCompatParcelizer() {
        File file = getReadingMediaPeriod.read();
        if (file == null) {
            return new File[0];
        }
        File[] fileArrListFiles = file.listFiles(new FilenameFilter() { // from class: o.generateDefaultSessionId.5
            @Override // java.io.FilenameFilter
            public final boolean accept(File file2, String str) {
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str, "");
                toMagicModuleStatusUcModel tomagicmodulestatusucmodel = toMagicModuleStatusUcModel.INSTANCE;
                String str2 = String.format("^%s[0-9]+.json$", Arrays.copyOf(new Object[]{"error_log_"}, 1));
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str2, "");
                return new newYearNameItem(str2).write(str);
            }
        });
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(fileArrListFiles, "");
        return fileArrListFiles;
    }
}
