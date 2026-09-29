package kotlin;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
public final class getValueClassBoxConverter {
    public static final RemoteActionCompatParcelizer IconCompatParcelizer;

    public interface RemoteActionCompatParcelizer {
        void IconCompatParcelizer(int i, Object obj);

        void RemoteActionCompatParcelizer(int i, Object obj);
    }

    private static void RemoteActionCompatParcelizer(Executor executor, final RemoteActionCompatParcelizer remoteActionCompatParcelizer, final int i, final Object obj) {
        executor.execute(new Runnable() { // from class: o.valueCreatorFromJava
            @Override // java.lang.Runnable
            public final void run() {
                remoteActionCompatParcelizer.IconCompatParcelizer(i, obj);
            }
        });
    }

    static {
        new RemoteActionCompatParcelizer() { // from class: o.getValueClassBoxConverter.4
            @Override // o.getValueClassBoxConverter.RemoteActionCompatParcelizer
            public final void IconCompatParcelizer(int i, Object obj) {
            }

            @Override // o.getValueClassBoxConverter.RemoteActionCompatParcelizer
            public final void RemoteActionCompatParcelizer(int i, Object obj) {
            }
        };
        IconCompatParcelizer = new RemoteActionCompatParcelizer() { // from class: o.getValueClassBoxConverter.5
            @Override // o.getValueClassBoxConverter.RemoteActionCompatParcelizer
            public final void RemoteActionCompatParcelizer(int i, Object obj) {
            }

            @Override // o.getValueClassBoxConverter.RemoteActionCompatParcelizer
            public final void IconCompatParcelizer(int i, Object obj) {
                if (i == 6 || i == 7 || i == 8) {
                }
            }
        };
    }

    private static void write(PackageInfo packageInfo, File file) {
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat")));
            try {
                dataOutputStream.writeLong(packageInfo.lastUpdateTime);
                dataOutputStream.close();
            } finally {
            }
        } catch (IOException unused) {
        }
    }

    private static boolean RemoteActionCompatParcelizer(File file) {
        return new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat").delete();
    }

    private static boolean IconCompatParcelizer(AssetManager assetManager, String str, PackageInfo packageInfo, File file, String str2, Executor executor, RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        PackageVersion packageVersion = new PackageVersion(assetManager, executor, remoteActionCompatParcelizer, str2, "dexopt/baseline.prof", "dexopt/baseline.profm", new File(new File("/data/misc/profiles/cur/0", str), "primary.prof"));
        if (!packageVersion.IconCompatParcelizer()) {
            return false;
        }
        boolean zRemoteActionCompatParcelizer = packageVersion.read().AudioAttributesCompatParcelizer().RemoteActionCompatParcelizer();
        if (zRemoteActionCompatParcelizer) {
            write(packageInfo, file);
        }
        return zRemoteActionCompatParcelizer;
    }

    public static void RemoteActionCompatParcelizer(Context context, Executor executor, RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        Context applicationContext = context.getApplicationContext();
        String packageName = applicationContext.getPackageName();
        ApplicationInfo applicationInfo = applicationContext.getApplicationInfo();
        AssetManager assets = applicationContext.getAssets();
        String name = new File(applicationInfo.sourceDir).getName();
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            File filesDir = context.getFilesDir();
            context.getPackageName();
            accessgetFALSEcp.read(context, IconCompatParcelizer(assets, packageName, packageInfo, filesDir, name, executor, remoteActionCompatParcelizer));
        } catch (PackageManager.NameNotFoundException e) {
            remoteActionCompatParcelizer.IconCompatParcelizer(7, e);
            accessgetFALSEcp.read(context, false);
        }
    }

    public static void read(Context context, Executor executor, RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        try {
            write(context.getPackageManager().getPackageInfo(context.getApplicationContext().getPackageName(), 0), context.getFilesDir());
            RemoteActionCompatParcelizer(executor, remoteActionCompatParcelizer, 10, null);
        } catch (PackageManager.NameNotFoundException e) {
            RemoteActionCompatParcelizer(executor, remoteActionCompatParcelizer, 7, e);
        }
    }

    public static void write(Context context, Executor executor, RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        RemoteActionCompatParcelizer(context.getFilesDir());
        RemoteActionCompatParcelizer(executor, remoteActionCompatParcelizer, 11, null);
    }
}
