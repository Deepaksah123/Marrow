package kotlin;

import android.content.Context;
import android.os.Build;
import androidx.profileinstaller.ProfileInstallReceiver;
import java.io.File;

/* JADX INFO: loaded from: classes4.dex */
public final class getValueClassReturnType {
    public static void AudioAttributesCompatParcelizer(Context context, ProfileInstallReceiver.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
        File fileAudioAttributesCompatParcelizer;
        if (Build.VERSION.SDK_INT >= 34) {
            fileAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer.IconCompatParcelizer(context).getCacheDir();
        } else {
            fileAudioAttributesCompatParcelizer = write.AudioAttributesCompatParcelizer(AudioAttributesCompatParcelizer.IconCompatParcelizer(context));
        }
        if (AudioAttributesCompatParcelizer(fileAudioAttributesCompatParcelizer)) {
            audioAttributesCompatParcelizer.IconCompatParcelizer(14, null);
        } else {
            audioAttributesCompatParcelizer.IconCompatParcelizer(15, null);
        }
    }

    private static boolean AudioAttributesCompatParcelizer(File file) {
        if (file.isDirectory()) {
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles == null) {
                return false;
            }
            boolean z = true;
            for (File file2 : fileArrListFiles) {
                z = AudioAttributesCompatParcelizer(file2) && z;
            }
            return z;
        }
        file.delete();
        return true;
    }

    static class write {
        static File AudioAttributesCompatParcelizer(Context context) {
            return context.getCodeCacheDir();
        }
    }

    static class AudioAttributesCompatParcelizer {
        static Context IconCompatParcelizer(Context context) {
            return context.createDeviceProtectedStorageContext();
        }
    }
}
