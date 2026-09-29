package kotlin;

import android.content.Context;
import com.facebook.GraphRequest;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.util.Arrays;
import kotlin.Metadata;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\n\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0011\u0010\r\u001a\u0004\u0018\u00010\fH\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0007\u0010\u0010J\u001b\u0010\u0011\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0004\b\u0011\u0010\u000bJ\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0004\b\u0007\u0010\u0012J\u0019\u0010\r\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u000fH\u0007¢\u0006\u0004\b\r\u0010\u0013J\u0015\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\f0\u0014H\u0007¢\u0006\u0004\b\u0011\u0010\u0015J\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\f0\u0014H\u0007¢\u0006\u0004\b\u0016\u0010\u0015J\u0015\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u0014H\u0007¢\u0006\u0004\b\n\u0010\u0015J#\u0010\u0016\u001a\u0004\u0018\u00010\u00182\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0017\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0016\u0010\u0019J+\u0010\u0011\u001a\u00020\u001d2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0017\u001a\u00020\u001a2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0007¢\u0006\u0004\b\u0011\u0010\u001eJ#\u0010\u0016\u001a\u00020\u001d2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0017\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0016\u0010\u001f"}, d2 = {"Lo/getReadingMediaPeriod;", "", "<init>", "()V", "", "p0", "", "write", "(Ljava/lang/String;)Z", "", "IconCompatParcelizer", "(Ljava/lang/Throwable;)Ljava/lang/String;", "Ljava/io/File;", "read", "()Ljava/io/File;", "Ljava/lang/Thread;", "(Ljava/lang/Thread;)Ljava/lang/String;", "RemoteActionCompatParcelizer", "(Ljava/lang/Throwable;)Z", "(Ljava/lang/Thread;)Z", "", "()[Ljava/io/File;", "AudioAttributesCompatParcelizer", "p1", "Lorg/json/JSONObject;", "(Ljava/lang/String;)Lorg/json/JSONObject;", "Lorg/json/JSONArray;", "Lcom/facebook/GraphRequest$write;", "p2", "", "(Ljava/lang/String;Lorg/json/JSONArray;Lcom/facebook/GraphRequest$write;)V", "(Ljava/lang/String;Ljava/lang/String;)V"}, k = 1, mv = {1, 4, 0})
public final class getReadingMediaPeriod {
    public static final getReadingMediaPeriod INSTANCE = new getReadingMediaPeriod();

    private getReadingMediaPeriod() {
    }

    @getMagicModuleMeta
    public static final String IconCompatParcelizer(Throwable p0) {
        if (p0 == null) {
            return null;
        }
        if (p0.getCause() == null) {
            return p0.toString();
        }
        return String.valueOf(p0.getCause());
    }

    @getMagicModuleMeta
    public static final String RemoteActionCompatParcelizer(Throwable p0) {
        Throwable th = null;
        if (p0 == null) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        while (p0 != null && p0 != th) {
            for (StackTraceElement stackTraceElement : p0.getStackTrace()) {
                jSONArray.put(stackTraceElement.toString());
            }
            th = p0;
            p0 = p0.getCause();
        }
        return jSONArray.toString();
    }

    @getMagicModuleMeta
    public static final String write(Thread p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        StackTraceElement[] stackTrace = p0.getStackTrace();
        JSONArray jSONArray = new JSONArray();
        for (StackTraceElement stackTraceElement : stackTrace) {
            jSONArray.put(stackTraceElement.toString());
        }
        return jSONArray.toString();
    }

    @getMagicModuleMeta
    public static final boolean write(Throwable p0) {
        if (p0 == null) {
            return false;
        }
        Throwable th = null;
        while (p0 != null && p0 != th) {
            for (StackTraceElement stackTraceElement : p0.getStackTrace()) {
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(stackTraceElement, "");
                String className = stackTraceElement.getClassName();
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(className, "");
                if (TestGroupLSModel.MediaBrowserCompatCustomActionResultReceiver(className, "com.facebook")) {
                    return true;
                }
            }
            th = p0;
            p0 = p0.getCause();
        }
        return false;
    }

    @getMagicModuleMeta
    public static final boolean read(Thread p0) {
        StackTraceElement[] stackTrace;
        if (p0 != null && (stackTrace = p0.getStackTrace()) != null) {
            for (StackTraceElement stackTraceElement : stackTrace) {
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(stackTraceElement, "");
                String className = stackTraceElement.getClassName();
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(className, "");
                if (TestGroupLSModel.MediaBrowserCompatCustomActionResultReceiver(className, "com.facebook")) {
                    String className2 = stackTraceElement.getClassName();
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(className2, "");
                    if (!TestGroupLSModel.MediaBrowserCompatCustomActionResultReceiver(className2, "com.facebook.appevents.codeless")) {
                        String className3 = stackTraceElement.getClassName();
                        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(className3, "");
                        if (!TestGroupLSModel.MediaBrowserCompatCustomActionResultReceiver(className3, "com.facebook.appevents.suggestedevents")) {
                            return true;
                        }
                    }
                    String methodName = stackTraceElement.getMethodName();
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(methodName, "");
                    if (TestGroupLSModel.MediaBrowserCompatCustomActionResultReceiver(methodName, "onClick")) {
                        continue;
                    } else {
                        String methodName2 = stackTraceElement.getMethodName();
                        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(methodName2, "");
                        if (TestGroupLSModel.MediaBrowserCompatCustomActionResultReceiver(methodName2, "onItemClick")) {
                            continue;
                        } else {
                            String methodName3 = stackTraceElement.getMethodName();
                            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(methodName3, "");
                            if (!TestGroupLSModel.MediaBrowserCompatCustomActionResultReceiver(methodName3, "onTouch")) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @getMagicModuleMeta
    public static final File[] RemoteActionCompatParcelizer() {
        File file = read();
        if (file == null) {
            return new File[0];
        }
        File[] fileArrListFiles = file.listFiles(new FilenameFilter() { // from class: o.getReadingMediaPeriod.3
            @Override // java.io.FilenameFilter
            public final boolean accept(File file2, String str) {
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str, "");
                toMagicModuleStatusUcModel tomagicmodulestatusucmodel = toMagicModuleStatusUcModel.INSTANCE;
                String str2 = String.format("^%s[0-9]+.json$", Arrays.copyOf(new Object[]{"anr_log_"}, 1));
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str2, "");
                return new newYearNameItem(str2).write(str);
            }
        });
        return fileArrListFiles != null ? fileArrListFiles : new File[0];
    }

    @getMagicModuleMeta
    public static final File[] AudioAttributesCompatParcelizer() {
        File file = read();
        if (file == null) {
            return new File[0];
        }
        File[] fileArrListFiles = file.listFiles(new FilenameFilter() { // from class: o.getReadingMediaPeriod.5
            @Override // java.io.FilenameFilter
            public final boolean accept(File file2, String str) {
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str, "");
                toMagicModuleStatusUcModel tomagicmodulestatusucmodel = toMagicModuleStatusUcModel.INSTANCE;
                String str2 = String.format("^%s[0-9]+.json$", Arrays.copyOf(new Object[]{"analysis_log_"}, 1));
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str2, "");
                return new newYearNameItem(str2).write(str);
            }
        });
        return fileArrListFiles != null ? fileArrListFiles : new File[0];
    }

    @getMagicModuleMeta
    public static final File[] IconCompatParcelizer() {
        File file = read();
        if (file == null) {
            return new File[0];
        }
        File[] fileArrListFiles = file.listFiles(new FilenameFilter() { // from class: o.getReadingMediaPeriod.2
            @Override // java.io.FilenameFilter
            public final boolean accept(File file2, String str) {
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str, "");
                toMagicModuleStatusUcModel tomagicmodulestatusucmodel = toMagicModuleStatusUcModel.INSTANCE;
                String str2 = String.format("^(%s|%s|%s)[0-9]+.json$", Arrays.copyOf(new Object[]{"crash_log_", "shield_log_", "thread_check_log_"}, 3));
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str2, "");
                return new newYearNameItem(str2).write(str);
            }
        });
        return fileArrListFiles != null ? fileArrListFiles : new File[0];
    }

    @getMagicModuleMeta
    public static final JSONObject AudioAttributesCompatParcelizer(String str) {
        File file = read();
        if (file == null || str == null) {
            return null;
        }
        try {
            return new JSONObject(DefaultAnalyticsCollectorMediaPeriodQueueTracker.write(new FileInputStream(new File(file, str))));
        } catch (Exception unused) {
            write(str);
            return null;
        }
    }

    @getMagicModuleMeta
    public static final void AudioAttributesCompatParcelizer(String p0, String p1) {
        File file = read();
        if (file == null || p0 == null || p1 == null) {
            return;
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(file, p0));
            byte[] bytes = p1.getBytes(getSubmissionTimestamp.IconCompatParcelizer);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(bytes, "");
            fileOutputStream.write(bytes);
            fileOutputStream.close();
        } catch (Exception unused) {
        }
    }

    @getMagicModuleMeta
    public static final boolean write(String p0) {
        File file = read();
        if (file == null || p0 == null) {
            return false;
        }
        return new File(file, p0).delete();
    }

    @getMagicModuleMeta
    public static final void RemoteActionCompatParcelizer(String p0, JSONArray p1, GraphRequest.write p2) {
        toMagicModuleMetaRepoModel.write(p1, "");
        if (p1.length() != 0) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(p0, p1.toString());
                GraphRequest.Companion iconCompatParcelizer = GraphRequest.INSTANCE;
                toMagicModuleStatusUcModel tomagicmodulestatusucmodel = toMagicModuleStatusUcModel.INSTANCE;
                String str = String.format("%s/instruments", Arrays.copyOf(new Object[]{lambdaonMediaMetadataChanged48.write()}, 1));
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str, "");
                GraphRequest.Companion.AudioAttributesCompatParcelizer(null, str, jSONObject, p2).AudioAttributesImplApi26Parcelizer();
            } catch (JSONException unused) {
            }
        }
    }

    @getMagicModuleMeta
    public static final File read() {
        Context contextAudioAttributesCompatParcelizer = lambdaonMediaMetadataChanged48.AudioAttributesCompatParcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextAudioAttributesCompatParcelizer, "");
        File file = new File(contextAudioAttributesCompatParcelizer.getCacheDir(), "instrument");
        if (file.exists() || file.mkdirs()) {
            return file;
        }
        return null;
    }
}
