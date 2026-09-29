package kotlin;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.FirebaseApp;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class Id3Reader {
    private boolean AudioAttributesCompatParcelizer;
    private final Object AudioAttributesImplApi21Parcelizer;
    private final SharedPreferences AudioAttributesImplApi26Parcelizer;
    private boolean AudioAttributesImplBaseParcelizer;
    private final TaskCompletionSource<Void> IconCompatParcelizer;
    private final FirebaseApp RemoteActionCompatParcelizer;
    private Boolean read;
    private TaskCompletionSource<Void> write;

    public Id3Reader(FirebaseApp firebaseApp) {
        Object obj = new Object();
        this.AudioAttributesImplApi21Parcelizer = obj;
        this.write = new TaskCompletionSource<>();
        this.AudioAttributesImplBaseParcelizer = false;
        this.AudioAttributesCompatParcelizer = false;
        this.IconCompatParcelizer = new TaskCompletionSource<>();
        Context contextAudioAttributesCompatParcelizer = firebaseApp.AudioAttributesCompatParcelizer();
        this.RemoteActionCompatParcelizer = firebaseApp;
        this.AudioAttributesImplApi26Parcelizer = putSps.AudioAttributesImplApi26Parcelizer(contextAudioAttributesCompatParcelizer);
        Boolean boolIconCompatParcelizer = IconCompatParcelizer();
        this.read = boolIconCompatParcelizer == null ? write(contextAudioAttributesCompatParcelizer) : boolIconCompatParcelizer;
        synchronized (obj) {
            if (write()) {
                this.write.trySetResult(null);
                this.AudioAttributesImplBaseParcelizer = true;
            }
        }
    }

    public final boolean write() {
        boolean zAudioAttributesImplApi26Parcelizer;
        synchronized (this) {
            Boolean bool = this.read;
            if (bool != null) {
                zAudioAttributesImplApi26Parcelizer = bool.booleanValue();
            } else {
                zAudioAttributesImplApi26Parcelizer = this.RemoteActionCompatParcelizer.AudioAttributesImplApi26Parcelizer();
            }
            AudioAttributesCompatParcelizer(zAudioAttributesImplApi26Parcelizer);
        }
        return zAudioAttributesImplApi26Parcelizer;
    }

    public final Task<Void> read() {
        Task<Void> task;
        synchronized (this.AudioAttributesImplApi21Parcelizer) {
            task = this.write.getTask();
        }
        return task;
    }

    public final Task<Void> write(Executor executor) {
        return parsePayloadMux.IconCompatParcelizer(executor, this.IconCompatParcelizer.getTask(), read());
    }

    public final void RemoteActionCompatParcelizer(boolean z) {
        if (!z) {
            throw new IllegalStateException("An invalid data collection token was used.");
        }
        this.IconCompatParcelizer.trySetResult(null);
    }

    private void AudioAttributesCompatParcelizer(boolean z) {
        String str;
        String str2 = z ? "ENABLED" : "DISABLED";
        if (this.read == null) {
            str = "global Firebase setting";
        } else {
            str = this.AudioAttributesCompatParcelizer ? "firebase_crashlytics_collection_enabled manifest flag" : "API";
        }
        DvbSubtitleReader.read().IconCompatParcelizer(String.format("Crashlytics automatic data collection %s by %s.", str2, str));
    }

    private Boolean IconCompatParcelizer() {
        if (!this.AudioAttributesImplApi26Parcelizer.contains("firebase_crashlytics_collection_enabled")) {
            return null;
        }
        this.AudioAttributesCompatParcelizer = false;
        return Boolean.valueOf(this.AudioAttributesImplApi26Parcelizer.getBoolean("firebase_crashlytics_collection_enabled", true));
    }

    private Boolean write(Context context) {
        Boolean boolRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(context);
        if (boolRemoteActionCompatParcelizer == null) {
            this.AudioAttributesCompatParcelizer = false;
            return null;
        }
        this.AudioAttributesCompatParcelizer = true;
        return Boolean.valueOf(Boolean.TRUE.equals(boolRemoteActionCompatParcelizer));
    }

    private static Boolean RemoteActionCompatParcelizer(Context context) {
        ApplicationInfo applicationInfo;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) == null || ((PackageItemInfo) applicationInfo).metaData == null || !((PackageItemInfo) applicationInfo).metaData.containsKey("firebase_crashlytics_collection_enabled")) {
                return null;
            }
            return Boolean.valueOf(((PackageItemInfo) applicationInfo).metaData.getBoolean("firebase_crashlytics_collection_enabled"));
        } catch (PackageManager.NameNotFoundException unused) {
            DvbSubtitleReader.read().write();
            return null;
        }
    }
}
