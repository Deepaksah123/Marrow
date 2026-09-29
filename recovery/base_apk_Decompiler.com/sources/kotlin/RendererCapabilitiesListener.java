package kotlin;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.location.Location;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.telephony.TelephonyManager;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.google.firebase.messaging.RemoteMessage;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Scanner;
import java.util.regex.Pattern;
import kotlin.SimpleExoPlayer;
import kotlin.getContentPositionMsInternal;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class RendererCapabilitiesListener {
    private static final Pattern IconCompatParcelizer = Pattern.compile("\\s+");

    public static boolean read(Collection<String> collection, String str) {
        if (collection == null || str == null) {
            return false;
        }
        Iterator<String> it = collection.iterator();
        while (it.hasNext()) {
            if (str.equalsIgnoreCase(it.next())) {
                return true;
            }
        }
        return false;
    }

    public static HashMap<String, Object> RemoteActionCompatParcelizer(Bundle bundle) {
        HashMap<String, Object> map = new HashMap<>();
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            if (obj instanceof Bundle) {
                map.putAll(RemoteActionCompatParcelizer((Bundle) obj));
            } else {
                map.put(str, bundle.get(str));
            }
        }
        return map;
    }

    public static ArrayList<HashMap<String, Object>> write(JSONArray jSONArray) {
        ArrayList<HashMap<String, Object>> arrayList = new ArrayList<>();
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                arrayList.add(write(jSONArray.getJSONObject(i)));
            } catch (JSONException e) {
                e.getMessage();
                RendererWakeupListener.MediaMetadataCompat();
            }
        }
        return arrayList;
    }

    public static ArrayList<String> RemoteActionCompatParcelizer(JSONArray jSONArray) {
        ArrayList<String> arrayList = new ArrayList<>();
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                arrayList.add(jSONArray.getString(i));
            } catch (JSONException e) {
                e.getMessage();
                RendererWakeupListener.MediaMetadataCompat();
            }
        }
        return arrayList;
    }

    public static HashMap<String, Object> write(JSONObject jSONObject) {
        HashMap<String, Object> map = new HashMap<>();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            try {
                String next = itKeys.next();
                Object obj = jSONObject.get(next);
                if (obj instanceof JSONObject) {
                    map.putAll(write((JSONObject) obj));
                } else {
                    map.put(next, jSONObject.get(next));
                }
            } catch (Throwable unused) {
            }
        }
        return map;
    }

    public static String IconCompatParcelizer(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        for (char lowerCase : str.toCharArray()) {
            if (Character.isSpaceChar(lowerCase)) {
                z = true;
            } else if (z) {
                lowerCase = Character.toTitleCase(lowerCase);
                z = false;
            } else {
                lowerCase = Character.toLowerCase(lowerCase);
            }
            sb.append(lowerCase);
        }
        return sb.toString();
    }

    public static long AudioAttributesCompatParcelizer() {
        return System.currentTimeMillis();
    }

    public static String write(Context context) {
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager == null) {
                return "Unavailable";
            }
            NetworkInfo networkInfo = connectivityManager.getNetworkInfo(1);
            if (networkInfo != null && networkInfo.isConnected()) {
                return "WiFi";
            }
            return RemoteActionCompatParcelizer(context);
        } catch (Throwable unused) {
            return "Unavailable";
        }
    }

    public static String RemoteActionCompatParcelizer(Context context) {
        int networkType;
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        if (telephonyManager == null) {
            return "Unavailable";
        }
        if (Build.VERSION.SDK_INT >= 30) {
            if (RemoteActionCompatParcelizer(context, "android.permission.READ_PHONE_STATE")) {
                try {
                    networkType = telephonyManager.getDataNetworkType();
                } catch (SecurityException e) {
                    e.getMessage();
                    RendererWakeupListener.MediaBrowserCompatItemReceiver();
                    networkType = 0;
                }
            } else {
                RendererWakeupListener.MediaBrowserCompatItemReceiver();
                networkType = 0;
            }
        } else {
            networkType = telephonyManager.getNetworkType();
        }
        if (networkType != 20) {
            switch (networkType) {
                case 1:
                case 2:
                case 4:
                case 7:
                case 11:
                    return "2G";
                case 3:
                case 5:
                case 6:
                case 8:
                case 9:
                case 10:
                case 12:
                case 14:
                case 15:
                    return "3G";
                case 13:
                    return "4G";
                default:
                    return "Unknown";
            }
        }
        return "5G";
    }

    public static long RemoteActionCompatParcelizer() {
        return Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
    }

    public static SimpleExoPlayer RemoteActionCompatParcelizer(boolean z, Context context, SimpleExoPlayer simpleExoPlayer) {
        return (simpleExoPlayer.getRead() == null && z) ? IconCompatParcelizer(context) : simpleExoPlayer;
    }

    public static SimpleExoPlayer AudioAttributesCompatParcelizer(String str, boolean z, Context context, CleverTapInstanceConfig cleverTapInstanceConfig, long j) throws NullPointerException {
        return getContentPositionMsInternal.RemoteActionCompatParcelizer(getContentPositionMsInternal.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer, new SeekParameters(str, z, context, cleverTapInstanceConfig, j));
    }

    private static SimpleExoPlayer write(String str, Context context, CleverTapInstanceConfig cleverTapInstanceConfig) {
        if (str != null) {
            try {
                if (str.toLowerCase().endsWith(".gif")) {
                    SimpleExoPlayer simpleExoPlayerRemoteActionCompatParcelizer = getContentPositionMsInternal.RemoteActionCompatParcelizer(getContentPositionMsInternal.RemoteActionCompatParcelizer.read, new SeekParameters(str, false, context, cleverTapInstanceConfig, 5000L, -1));
                    RendererWakeupListener rendererWakeupListenerMediaBrowserCompatItemReceiver = cleverTapInstanceConfig.MediaBrowserCompatItemReceiver();
                    String strWrite = cleverTapInstanceConfig.write();
                    StringBuilder sb = new StringBuilder("Downloaded GIF in : ");
                    sb.append(simpleExoPlayerRemoteActionCompatParcelizer.getWrite());
                    rendererWakeupListenerMediaBrowserCompatItemReceiver.IconCompatParcelizer(strWrite, sb.toString());
                    if (simpleExoPlayerRemoteActionCompatParcelizer.getAudioAttributesCompatParcelizer() == SimpleExoPlayer.write.MediaBrowserCompatItemReceiver && simpleExoPlayerRemoteActionCompatParcelizer.getIconCompatParcelizer() != null) {
                        return simpleExoPlayerRemoteActionCompatParcelizer;
                    }
                    RendererWakeupListener rendererWakeupListenerMediaBrowserCompatItemReceiver2 = cleverTapInstanceConfig.MediaBrowserCompatItemReceiver();
                    String strWrite2 = cleverTapInstanceConfig.write();
                    StringBuilder sb2 = new StringBuilder("Failed to download gif ");
                    sb2.append(simpleExoPlayerRemoteActionCompatParcelizer.getAudioAttributesCompatParcelizer().getAudioAttributesCompatParcelizer());
                    rendererWakeupListenerMediaBrowserCompatItemReceiver2.IconCompatParcelizer(strWrite2, sb2.toString());
                    return null;
                }
            } catch (Exception e) {
                RendererWakeupListener rendererWakeupListenerMediaBrowserCompatItemReceiver3 = cleverTapInstanceConfig.MediaBrowserCompatItemReceiver();
                String strWrite3 = cleverTapInstanceConfig.write();
                StringBuilder sb3 = new StringBuilder("Couldn't download gif for notification: ");
                sb3.append(e.getMessage());
                rendererWakeupListenerMediaBrowserCompatItemReceiver3.IconCompatParcelizer(strWrite3, sb3.toString());
            }
        }
        return null;
    }

    private static Uri AudioAttributesCompatParcelizer(byte[] bArr, Context context, CleverTapInstanceConfig cleverTapInstanceConfig, onDroppedVideoFrames ondroppedvideoframes) {
        try {
            File dir = context.getDir("CleverTap.Push", 0);
            if (dir == null) {
                cleverTapInstanceConfig.MediaBrowserCompatItemReceiver().IconCompatParcelizer(cleverTapInstanceConfig.write(), "CleverTap.Push dir not available for gif");
                return null;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(ondroppedvideoframes.AudioAttributesCompatParcelizer());
            sb.append(".gif");
            File file = new File(dir, sb.toString());
            Files.write(file.toPath(), bArr, new OpenOption[0]);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(context.getPackageName());
            sb2.append(".clevertap.fileprovider");
            return _isNegInf.AudioAttributesCompatParcelizer(context, sb2.toString(), file);
        } catch (Exception e) {
            cleverTapInstanceConfig.MediaBrowserCompatItemReceiver().IconCompatParcelizer(cleverTapInstanceConfig.write(), "Failed to write gif to file or create URI: ".concat(String.valueOf(e)));
            return null;
        }
    }

    public static Uri AudioAttributesCompatParcelizer(String str, Context context, CleverTapInstanceConfig cleverTapInstanceConfig, onDroppedVideoFrames ondroppedvideoframes) {
        SimpleExoPlayer simpleExoPlayerWrite = write(str, context, cleverTapInstanceConfig);
        if (simpleExoPlayerWrite == null) {
            return null;
        }
        return AudioAttributesCompatParcelizer(simpleExoPlayerWrite.getIconCompatParcelizer(), context, cleverTapInstanceConfig, ondroppedvideoframes);
    }

    public static void write(Context context, CleverTapInstanceConfig cleverTapInstanceConfig, onDroppedVideoFrames ondroppedvideoframes) {
        File[] fileArrListFiles;
        File dir = context.getDir("CleverTap.Push", 0);
        if (dir != null) {
            try {
                if (dir.exists() && (fileArrListFiles = dir.listFiles()) != null) {
                    long jAudioAttributesCompatParcelizer = ondroppedvideoframes.AudioAttributesCompatParcelizer();
                    int i = 0;
                    for (File file : fileArrListFiles) {
                        if (file.isFile() && file.getName().endsWith(".gif")) {
                            try {
                                String name = file.getName();
                                if (jAudioAttributesCompatParcelizer - Long.parseLong(name.substring(0, name.lastIndexOf(".gif"))) >= 86400000) {
                                    if (file.delete()) {
                                        i++;
                                    } else {
                                        RendererWakeupListener rendererWakeupListenerMediaBrowserCompatItemReceiver = cleverTapInstanceConfig.MediaBrowserCompatItemReceiver();
                                        String strWrite = cleverTapInstanceConfig.write();
                                        StringBuilder sb = new StringBuilder();
                                        sb.append("Failed to delete old GIF file: ");
                                        sb.append(file.getName());
                                        rendererWakeupListenerMediaBrowserCompatItemReceiver.IconCompatParcelizer(strWrite, sb.toString());
                                    }
                                }
                            } catch (Exception unused) {
                                RendererWakeupListener rendererWakeupListenerMediaBrowserCompatItemReceiver2 = cleverTapInstanceConfig.MediaBrowserCompatItemReceiver();
                                String strWrite2 = cleverTapInstanceConfig.write();
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append("Skipping file with invalid file name format: ");
                                sb2.append(file.getName());
                                rendererWakeupListenerMediaBrowserCompatItemReceiver2.IconCompatParcelizer(strWrite2, sb2.toString());
                            }
                        }
                    }
                    if (i > 0) {
                        RendererWakeupListener rendererWakeupListenerMediaBrowserCompatItemReceiver3 = cleverTapInstanceConfig.MediaBrowserCompatItemReceiver();
                        String strWrite3 = cleverTapInstanceConfig.write();
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("Cleaned up ");
                        sb3.append(i);
                        sb3.append(" old animated notification files");
                        rendererWakeupListenerMediaBrowserCompatItemReceiver3.IconCompatParcelizer(strWrite3, sb3.toString());
                    }
                }
            } catch (Exception e) {
                RendererWakeupListener rendererWakeupListenerMediaBrowserCompatItemReceiver4 = cleverTapInstanceConfig.MediaBrowserCompatItemReceiver();
                String strWrite4 = cleverTapInstanceConfig.write();
                StringBuilder sb4 = new StringBuilder("Error during animated image cleanup: ");
                sb4.append(e.getMessage());
                rendererWakeupListenerMediaBrowserCompatItemReceiver4.IconCompatParcelizer(strWrite4, sb4.toString());
            }
        }
    }

    public static int read(Context context, String str) {
        if (context != null) {
            return context.getResources().getIdentifier(str, "drawable", context.getPackageName());
        }
        return -1;
    }

    public static boolean RemoteActionCompatParcelizer(Context context, String str) {
        try {
            return _isNaN.checkSelfPermission(context, str) == 0;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean read(Activity activity) {
        return activity == null || activity.isFinishing() || activity.isDestroyed();
    }

    public static boolean IconCompatParcelizer(Context context, Class cls) {
        int i;
        if (cls == null) {
            return false;
        }
        try {
        } catch (PackageManager.NameNotFoundException e) {
            e.getLocalizedMessage();
            RendererWakeupListener.MediaBrowserCompatItemReceiver();
        }
        for (ServiceInfo serviceInfo : context.getPackageManager().getPackageInfo(context.getPackageName(), 4).services) {
            if (((PackageItemInfo) serviceInfo).name.equals(cls.getName())) {
                String str = ((PackageItemInfo) serviceInfo).name;
                RendererWakeupListener.MediaMetadataCompat();
                return true;
            }
            return false;
        }
        return false;
    }

    public static void AudioAttributesCompatParcelizer(Runnable runnable) {
        if (runnable != null) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                runnable.run();
            } else {
                new Handler(Looper.getMainLooper()).post(runnable);
            }
        }
    }

    public static void RemoteActionCompatParcelizer(Context context, Intent intent) {
        List<ResolveInfo> listQueryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 0);
        if (listQueryIntentActivities != null) {
            String packageName = context.getPackageName();
            Iterator<ResolveInfo> it = listQueryIntentActivities.iterator();
            while (it.hasNext()) {
                if (packageName.equals(((PackageItemInfo) it.next().activityInfo).packageName)) {
                    intent.setPackage(packageName);
                    return;
                }
            }
        }
    }

    public static boolean write(String str) {
        if (str == null) {
            RendererWakeupListener.MediaBrowserCompatCustomActionResultReceiver();
            return false;
        }
        if (str.isEmpty()) {
            RendererWakeupListener.MediaBrowserCompatCustomActionResultReceiver();
            return false;
        }
        if (str.length() > 64) {
            RendererWakeupListener.MediaBrowserCompatCustomActionResultReceiver();
            return false;
        }
        if (str.matches("[=|<>;+.A-Za-z0-9()!:$@_-]*")) {
            return true;
        }
        RendererWakeupListener.MediaBrowserCompatCustomActionResultReceiver();
        return false;
    }

    private static Bitmap AudioAttributesCompatParcelizer(Drawable drawable) throws NullPointerException {
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        return bitmapCreateBitmap;
    }

    private static SimpleExoPlayer IconCompatParcelizer(Context context) throws NullPointerException {
        try {
            Drawable applicationLogo = context.getPackageManager().getApplicationLogo(context.getApplicationInfo());
            if (applicationLogo == null) {
                throw new Exception("Logo is null");
            }
            r8lambda3UPcXNC6yMkWYB4Djn0NvTHj24 r8lambda3upcxnc6ymkwyb4djn0nvthj24 = r8lambda3UPcXNC6yMkWYB4Djn0NvTHj24.RemoteActionCompatParcelizer;
            return r8lambda3UPcXNC6yMkWYB4Djn0NvTHj24.RemoteActionCompatParcelizer(AudioAttributesCompatParcelizer(applicationLogo), 0L, null);
        } catch (Exception e) {
            e.printStackTrace();
            r8lambda3UPcXNC6yMkWYB4Djn0NvTHj24 r8lambda3upcxnc6ymkwyb4djn0nvthj242 = r8lambda3UPcXNC6yMkWYB4Djn0NvTHj24.RemoteActionCompatParcelizer;
            return r8lambda3UPcXNC6yMkWYB4Djn0NvTHj24.RemoteActionCompatParcelizer(AudioAttributesCompatParcelizer(context.getPackageManager().getApplicationIcon(context.getApplicationInfo())), 0L, null);
        }
    }

    public static String RemoteActionCompatParcelizer(String str) {
        String[] strArrSplit = str.split("\\.", 2);
        StringBuilder sb = new StringBuilder();
        sb.append(strArrSplit[0]);
        sb.append(".auth.");
        sb.append(strArrSplit[1]);
        return sb.toString();
    }

    public static boolean RemoteActionCompatParcelizer(RemoteMessage remoteMessage) {
        return !Boolean.parseBoolean(remoteMessage.IconCompatParcelizer().get("wzrk_tsr_fb")) && Boolean.parseBoolean(remoteMessage.IconCompatParcelizer().get("wzrk_fallback"));
    }

    public static void read(Context context) {
        Intent intent = new Intent();
        intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
        intent.putExtra("android.provider.extra.APP_PACKAGE", context.getPackageName());
        intent.addFlags(268435456);
        context.startActivity(intent);
    }

    public static boolean AudioAttributesCompatParcelizer(Context context, String str) {
        try {
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses();
            int iMyPid = Process.myPid();
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (runningAppProcessInfo.pid == iMyPid && str.equals(runningAppProcessInfo.processName)) {
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public static List<JSONObject> AudioAttributesCompatParcelizer(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(jSONArray.getJSONObject(i));
        }
        return arrayList;
    }

    public static double read(Location location, Location location2) {
        double latitude = location.getLatitude();
        double latitude2 = location2.getLatitude();
        double latitude3 = location2.getLatitude();
        double latitude4 = location.getLatitude();
        double longitude = location2.getLongitude();
        double longitude2 = location.getLongitude();
        double dSin = Math.sin(((latitude3 - latitude4) * 0.017453292519943295d) / 2.0d);
        double dSin2 = Math.sin(((longitude - longitude2) * 0.017453292519943295d) / 2.0d);
        double dCos = (dSin * dSin) + (Math.cos(latitude * 0.017453292519943295d) * Math.cos(latitude2 * 0.017453292519943295d) * dSin2 * dSin2);
        return Math.atan2(Math.sqrt(dCos), Math.sqrt(1.0d - dCos)) * 12756.4d;
    }

    public static String write(Context context, String str) throws IOException {
        InputStream inputStreamOpen = context.getAssets().open(str);
        try {
            String next = new Scanner(inputStreamOpen).useDelimiter("\\A").next();
            if (inputStreamOpen != null) {
                inputStreamOpen.close();
            }
            return next;
        } catch (Throwable th) {
            if (inputStreamOpen != null) {
                try {
                    inputStreamOpen.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public static String AudioAttributesCompatParcelizer(String str) {
        if (str == null) {
            return null;
        }
        return IconCompatParcelizer.matcher(str).replaceAll("").toLowerCase(Locale.ENGLISH);
    }

    public static boolean RemoteActionCompatParcelizer(String str, String str2) {
        return Objects.equals(AudioAttributesCompatParcelizer(str), AudioAttributesCompatParcelizer(str2));
    }
}
