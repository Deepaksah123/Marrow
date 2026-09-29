package com.razorpay;

import android.content.Context;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/* JADX INFO: loaded from: classes5.dex */
class CacheManager {
    static File cacheDir;

    CacheManager() {
    }

    static void init(Context context) {
        cacheDir = context.getCacheDir();
    }

    static boolean hasExpired(String str) {
        if (str.equalsIgnoreCase("rzp_payment_preferences")) {
            File file = new File(cacheDir.getPath(), str);
            if (!file.exists()) {
                return true;
            }
            try {
                String absolutePath = file.getAbsolutePath();
                StringBuilder sb = new StringBuilder();
                sb.append(file.getPath());
                sb.append("/");
                sb.append(str);
                if (!absolutePath.equalsIgnoreCase(sb.toString())) {
                    return true;
                }
                FileInputStream fileInputStream = new FileInputStream(file);
                ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
                CacheEntry cacheEntry = (CacheEntry) objectInputStream.readObject();
                fileInputStream.close();
                objectInputStream.close();
                if (!l$1_I$l$(cacheEntry.expiryTime)) {
                    StringBuilder sb2 = new StringBuilder("Cache has NOT expired for key ");
                    sb2.append(str);
                    Logger.d(sb2.toString());
                    return false;
                }
                StringBuilder sb3 = new StringBuilder("Cache has expired for key ");
                sb3.append(str);
                Logger.d(sb3.toString());
                return true;
            } catch (Exception e) {
                AnalyticsUtil.reportError(e.getMessage(), "S2", e.getMessage());
                Logger.e("Error fetching cache entry", e);
            }
        }
        return true;
    }

    private static boolean l$1_I$l$(long j) {
        return j <= 0 || System.currentTimeMillis() > j;
    }

    static void put(String str, String str2, long j) {
        if (str.equalsIgnoreCase("rzp_payment_preferences")) {
            File file = new File(cacheDir.getPath(), str);
            if (!file.exists()) {
                try {
                    file.createNewFile();
                } catch (IOException e) {
                    AnalyticsUtil.reportError(e.getMessage(), "S1", e.getMessage());
                    Logger.e("Could not store string in cache", e);
                }
            }
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
                CacheEntry cacheEntry = new CacheEntry(str2, j + System.currentTimeMillis());
                objectOutputStream.writeObject(cacheEntry);
                objectOutputStream.close();
                fileOutputStream.close();
                Logger.d(String.format("%s stored successfully in cache with expiry time of %d", str, Long.valueOf(cacheEntry.expiryTime)));
                StringBuilder sb = new StringBuilder("Cache value: ");
                sb.append(str2);
                Logger.d(sb.toString());
            } catch (Exception e2) {
                AnalyticsUtil.reportError(e2.getMessage(), "S1", e2.getMessage());
                Logger.e("Could not store string in cache", e2);
            }
        }
    }

    static void expireKey(String str) {
        put(str, "", -1L);
    }

    static String get(String str) {
        if (str.equalsIgnoreCase("rzp_payment_preferences")) {
            File file = new File(cacheDir.getPath(), str);
            if (!file.exists()) {
                Logger.e("Error fetching cache entry.");
                return null;
            }
            try {
                String absolutePath = file.getAbsolutePath();
                StringBuilder sb = new StringBuilder();
                sb.append(file.getPath());
                sb.append("/");
                sb.append(str);
                if (!absolutePath.equalsIgnoreCase(sb.toString())) {
                    return null;
                }
                FileInputStream fileInputStream = new FileInputStream(file);
                ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
                CacheEntry cacheEntry = (CacheEntry) objectInputStream.readObject();
                fileInputStream.close();
                objectInputStream.close();
                if (l$1_I$l$(cacheEntry.expiryTime)) {
                    purge(str);
                    return null;
                }
                Logger.d(String.format("%s fetched successfully from cache", str));
                Logger.d(cacheEntry.data);
                return cacheEntry.data;
            } catch (Exception e) {
                AnalyticsUtil.reportError(e.getMessage(), "S2", e.getMessage());
                Logger.e("Error fetching cache entry", e);
            }
        }
        return null;
    }

    static void purge(String str) {
        if (str.equalsIgnoreCase("rzp_payment_preferences")) {
            new File(cacheDir.getPath(), str).delete();
        }
    }
}
