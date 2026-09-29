package kotlin;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class onDataEnd {
    public final String AudioAttributesCompatParcelizer;
    public final String AudioAttributesImplBaseParcelizer;
    public final String IconCompatParcelizer;
    public final String MediaBrowserCompatCustomActionResultReceiver;
    public final String MediaBrowserCompatItemReceiver;
    public final parseCsdBuffer RemoteActionCompatParcelizer;
    public final List<H264ReaderSampleReader> read;
    public final String write;

    public static onDataEnd read(Context context, parseAudioMuxElement parseaudiomuxelement, String str, String str2, List<H264ReaderSampleReader> list, parseCsdBuffer parsecsdbuffer) throws PackageManager.NameNotFoundException {
        String packageName = context.getPackageName();
        String strWrite = parseaudiomuxelement.write();
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
        return new onDataEnd(str, str2, list, strWrite, packageName, AudioAttributesCompatParcelizer(packageInfo), packageInfo.versionName == null ? "0.0" : packageInfo.versionName, parsecsdbuffer);
    }

    private static String AudioAttributesCompatParcelizer(PackageInfo packageInfo) {
        return Long.toString(packageInfo.getLongVersionCode());
    }

    private onDataEnd(String str, String str2, List<H264ReaderSampleReader> list, String str3, String str4, String str5, String str6, parseCsdBuffer parsecsdbuffer) {
        this.AudioAttributesCompatParcelizer = str;
        this.IconCompatParcelizer = str2;
        this.read = list;
        this.write = str3;
        this.MediaBrowserCompatCustomActionResultReceiver = str4;
        this.MediaBrowserCompatItemReceiver = str5;
        this.AudioAttributesImplBaseParcelizer = str6;
        this.RemoteActionCompatParcelizer = parsecsdbuffer;
    }
}
