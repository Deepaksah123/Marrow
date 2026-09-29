package com.razorpay;

import android.content.Context;
import in.juspay.hypersdk.core.PaymentConstants;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executors;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.razorpay.$O0Oo$oo0o, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public class C$O0Oo$oo0o {
    private static C$O0Oo$oo0o instance;
    public String buildNumber;
    public String checkoutPublicUrl;
    private Context context;
    public String publicPageResponse;
    public boolean areAllFilesDownloaded = false;
    public boolean isCachingDisabled = false;
    private boolean shouldClearCache = false;
    public boolean isFetchedPublicPageUsed = false;
    public HashMap<String, String> files = new HashMap<>();
    private HashMap<String, String> fileLocations = new HashMap<>();
    Map<String, Object> props = new HashMap();

    private C$O0Oo$oo0o() {
    }

    public static C$O0Oo$oo0o getInstance() {
        if (instance == null) {
            instance = new C$O0Oo$oo0o();
        }
        return instance;
    }

    public void startPrefetchForPublicPage() {
        this.checkoutPublicUrl = "https://api.razorpay.com/v1/checkout/public?platform=android&version=1.7.18&library=checkoutjs";
        Owl.get("https://api.razorpay.com/v1/checkout/public?platform=android&version=1.7.18&library=checkoutjs", new Callback() { // from class: com.razorpay.$O0Oo$oo0o$$ExternalSyntheticLambda3
            @Override // com.razorpay.Callback
            public final void run(ResponseObject responseObject) {
                this.f$0.m210lambda$startPrefetchForPublicPage$0$comrazorpay$O0Oo$oo0o(responseObject);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$startPrefetchForPublicPage$0$com-razorpay-$O0Oo$oo0o, reason: not valid java name */
    /* synthetic */ void m210lambda$startPrefetchForPublicPage$0$comrazorpay$O0Oo$oo0o(ResponseObject responseObject) {
        if (responseObject.getResponseCode() > 400) {
            this.isCachingDisabled = true;
        } else {
            this.publicPageResponse = responseObject.getResponseResult();
        }
    }

    public void startPrefetch(final Context context) {
        Executors.newSingleThreadExecutor().execute(new Runnable() { // from class: com.razorpay.$O0Oo$oo0o$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m206lambda$startPrefetch$1$comrazorpay$O0Oo$oo0o(context);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$startPrefetch$1$com-razorpay-$O0Oo$oo0o, reason: not valid java name */
    /* synthetic */ void m206lambda$startPrefetch$1$comrazorpay$O0Oo$oo0o(Context context) {
        this.context = context;
        startPrefetch();
    }

    private void trackEvent(AnalyticsEvent analyticsEvent, String str, Object obj) {
        this.props.clear();
        this.props.put(str, obj);
        AnalyticsUtil.trackEvent(analyticsEvent, this.props);
    }

    public void startPrefetch() {
        StringBuilder sb = new StringBuilder("LOAD_TIME Merchant initialized checkout: ");
        sb.append(System.currentTimeMillis());
        Logger.d(sb.toString());
        trackEvent(AnalyticsEvent.CHECKOUT_PREFETCH_STARTED, PaymentConstants.TIMESTAMP, Long.valueOf(System.currentTimeMillis()));
        Owl.get("https://checkout.razorpay.com/v1/prefetch.json", new Callback() { // from class: com.razorpay.$O0Oo$oo0o$$ExternalSyntheticLambda4
            @Override // com.razorpay.Callback
            public final void run(ResponseObject responseObject) {
                this.f$0.m209lambda$startPrefetch$4$comrazorpay$O0Oo$oo0o(responseObject);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$startPrefetch$4$com-razorpay-$O0Oo$oo0o, reason: not valid java name */
    /* synthetic */ void m209lambda$startPrefetch$4$comrazorpay$O0Oo$oo0o(ResponseObject responseObject) {
        trackEvent(AnalyticsEvent.CHECKOUT_PREFETCH_FILE_DOWNLOADED, PaymentConstants.TIMESTAMP, Long.valueOf(System.currentTimeMillis()));
        if (isErrorOrIsCachingDisabled(responseObject)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(responseObject.getResponseResult());
            this.buildNumber = jSONObject.getString("build");
            final JSONArray jSONArray = jSONObject.getJSONArray("files");
            String strOptString = jSONObject.optString("traffic_env");
            StringBuilder sb = new StringBuilder("https://api.razorpay.com/v1/checkout/public?platform=android&version=1.7.18&library=checkoutjs&build=");
            sb.append(this.buildNumber);
            this.checkoutPublicUrl = sb.toString();
            if (!strOptString.isEmpty()) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(this.checkoutPublicUrl);
                sb2.append("&traffic_env=");
                sb2.append(strOptString);
                this.checkoutPublicUrl = sb2.toString();
            }
            trackEvent(AnalyticsEvent.CHECKOUT_PREFETCH_PUBLIC_PAGE_DOWNLOAD_START, PaymentConstants.TIMESTAMP, Long.valueOf(System.currentTimeMillis()));
            Owl.get(this.checkoutPublicUrl, new Callback() { // from class: com.razorpay.$O0Oo$oo0o$$ExternalSyntheticLambda0
                @Override // com.razorpay.Callback
                public final void run(ResponseObject responseObject2) {
                    this.f$0.m207lambda$startPrefetch$2$comrazorpay$O0Oo$oo0o(responseObject2);
                }
            });
            if (doesBuildNumberExist(this.buildNumber)) {
                AnalyticsUtil.trackEvent(AnalyticsEvent.CHECKOUT_PREFETCH_BUILD_EXISTS);
                StringBuilder sb3 = new StringBuilder();
                sb3.append(this.context.getFilesDir());
                sb3.append("/razorpay/");
                sb3.append(this.buildNumber);
                File file = new File(sb3.toString());
                for (int i = 0; i < jSONArray.length(); i++) {
                    Logger.d("build number exists");
                    String string = jSONArray.getString(i);
                    String strSubstring = string.substring(string.lastIndexOf("/") + 1);
                    String fileIfBuildExists = getFileIfBuildExists(strSubstring);
                    if (fileIfBuildExists != null && !fileIfBuildExists.isEmpty()) {
                        this.files.put(strSubstring, fileIfBuildExists);
                        Logger.d(this.files.toString());
                    }
                    AnalyticsUtil.trackEvent(AnalyticsEvent.CHECKOUT_PREFETCH_BUILD_EXISTS_FILE_ERROR);
                    deleteRecursive(file);
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("File data is empty or null for file ");
                    sb4.append(strSubstring);
                    Logger.d(sb4.toString());
                    startPrefetch();
                }
                if (this.files != null) {
                    trackEvent(AnalyticsEvent.CHECKOUT_PREFETCH_BUILD_LOCAL_ASSETS_LOADED, PaymentConstants.TIMESTAMP, Long.valueOf(System.currentTimeMillis()));
                    return;
                }
            }
            trackEvent(AnalyticsEvent.CHECKOUT_PREFETCH_ASSET_FILES_DOWNLOAD_START, PaymentConstants.TIMESTAMP, Long.valueOf(System.currentTimeMillis()));
            for (final int i2 = 0; i2 < jSONArray.length(); i2++) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append("FileName: ");
                sb5.append(jSONArray.getString(i2));
                Logger.d(sb5.toString());
                final String string2 = jSONArray.getString(i2);
                HashMap map = new HashMap();
                map.put("accept-encoding", "gzip");
                Owl.get(string2, map, new Callback() { // from class: com.razorpay.$O0Oo$oo0o$$ExternalSyntheticLambda1
                    @Override // com.razorpay.Callback
                    public final void run(ResponseObject responseObject2) {
                        this.f$0.m208lambda$startPrefetch$3$comrazorpay$O0Oo$oo0o(string2, i2, jSONArray, responseObject2);
                    }
                });
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: lambda$startPrefetch$2$com-razorpay-$O0Oo$oo0o, reason: not valid java name */
    /* synthetic */ void m207lambda$startPrefetch$2$comrazorpay$O0Oo$oo0o(ResponseObject responseObject) {
        trackEvent(AnalyticsEvent.CHECKOUT_PREFETCH_PUBLIC_PAGE_DOWNLOAD_COMPLETE, PaymentConstants.TIMESTAMP, Long.valueOf(System.currentTimeMillis()));
        if (responseObject.getResponseCode() > 400) {
            trackEvent(AnalyticsEvent.CHECKOUT_PREFETCH_PUBLIC_PAGE_DOWNLOAD_FAILED, PaymentConstants.TIMESTAMP, Long.valueOf(System.currentTimeMillis()));
            this.isCachingDisabled = true;
        } else {
            this.publicPageResponse = responseObject.getResponseResult();
        }
    }

    /* JADX INFO: renamed from: lambda$startPrefetch$3$com-razorpay-$O0Oo$oo0o, reason: not valid java name */
    /* synthetic */ void m208lambda$startPrefetch$3$comrazorpay$O0Oo$oo0o(String str, int i, JSONArray jSONArray, ResponseObject responseObject) {
        if (responseObject.getResponseResult() == null) {
            trackEvent(AnalyticsEvent.CHECKOUT_PREFETCH_ASSET_FILES_DOWNLOAD_INTERRUPTED, "filename", str);
            return;
        }
        try {
            Logger.d(responseObject.getResponseResult());
            this.files.put(str.substring(str.lastIndexOf("/") + 1), responseObject.getResponseResult());
            Logger.d(str);
            if (i == jSONArray.length() - 1) {
                StringBuilder sb = new StringBuilder("LOAD_TIME all files are downloaded ");
                sb.append(System.currentTimeMillis());
                Logger.d(sb.toString());
                trackEvent(AnalyticsEvent.CHECKOUT_PREFETCH_ASSET_FILES_DOWNLOAD_END, PaymentConstants.TIMESTAMP, Long.valueOf(System.currentTimeMillis()));
                this.areAllFilesDownloaded = true;
                Context context = this.context;
                if (context != null) {
                    saveFilesToCache(context);
                }
            }
        } catch (Exception unused) {
            trackEvent(AnalyticsEvent.CHECKOUT_PREFETCH_DECOMPRESS_FAILED, "filename", str);
        }
    }

    private boolean doesBuildNumberExist(String str) {
        if (this.context == null) {
            return false;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.context.getFilesDir());
        sb.append("/razorpay/");
        sb.append(str);
        return new File(sb.toString()).exists();
    }

    private boolean isErrorOrIsCachingDisabled(ResponseObject responseObject) {
        if (responseObject.getResponseCode() > 400) {
            if (responseObject.getResponseCode() == 404) {
                clearCacheFilesWhenActivityIsAvailable();
            }
            return true;
        }
        try {
            if (new JSONObject(responseObject.getResponseResult()).getBoolean("enabled")) {
                return false;
            }
            clearCacheFilesWhenActivityIsAvailable();
            return true;
        } catch (Exception unused) {
            clearCacheFilesWhenActivityIsAvailable();
            return true;
        }
    }

    private void clearCacheFilesWhenActivityIsAvailable() {
        this.isCachingDisabled = true;
        this.shouldClearCache = true;
        if (this.context != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.context.getFilesDir());
            sb.append("/razorpay");
            deleteRecursive(new File(sb.toString()));
            reset();
        }
    }

    public void saveFilesToCache(Context context) {
        trackEvent(AnalyticsEvent.CHECKOUT_PREFETCH_ASSET_FILES_STORING_START, PaymentConstants.TIMESTAMP, Long.valueOf(System.currentTimeMillis()));
        StringBuilder sb = new StringBuilder("LOAD_TIME saveFilesToCache with context: ");
        sb.append(System.currentTimeMillis());
        Logger.d(sb.toString());
        this.context = context;
        if (this.isCachingDisabled) {
            if (this.shouldClearCache) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(context.getFilesDir());
                sb2.append("/razorpay");
                deleteRecursive(new File(sb2.toString()));
                reset();
                return;
            }
            return;
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(context.getFilesDir());
        sb3.append("/razorpay/");
        String string = sb3.toString();
        StringBuilder sb4 = new StringBuilder();
        sb4.append(context.getFilesDir());
        sb4.append("/razorpay/");
        sb4.append(this.buildNumber);
        String string2 = sb4.toString();
        File file = new File(string2);
        if (file.exists() || !this.areAllFilesDownloaded) {
            return;
        }
        File file2 = new File(string);
        File[] fileArrListFiles = file2.listFiles();
        if (fileArrListFiles != null && fileArrListFiles.length >= 3) {
            deleteRecursive(file2);
        }
        file.mkdirs();
        for (Map.Entry<String, String> entry : this.files.entrySet()) {
            if (entry.getValue() == null || entry.getValue().isEmpty()) {
                deleteRecursive(file2);
                return;
            }
            if (entry.getValue() == null) {
                return;
            }
            HashMap<String, String> map = this.fileLocations;
            String key = entry.getKey();
            StringBuilder sb5 = new StringBuilder();
            sb5.append(string2);
            sb5.append("/");
            sb5.append(entry.getKey());
            map.put(key, sb5.toString());
            try {
                StringBuilder sb6 = new StringBuilder();
                sb6.append(string2);
                sb6.append("/");
                sb6.append(entry.getKey());
                File file3 = new File(sb6.toString());
                file3.createNewFile();
                FileOutputStream fileOutputStream = new FileOutputStream(file3);
                fileOutputStream.write(entry.getValue().getBytes());
                fileOutputStream.close();
            } catch (Exception unused) {
                HashMap map2 = new HashMap();
                map2.put("filename", entry.getKey());
                map2.put(PaymentConstants.TIMESTAMP, Long.valueOf(System.currentTimeMillis()));
                AnalyticsUtil.trackEvent(AnalyticsEvent.CHECKOUT_PREFETCH_ASSET_FILES_STORING_FAILED, map2);
            }
        }
        trackEvent(AnalyticsEvent.CHECKOUT_PREFETCH_ASSET_FILES_STORING_END, PaymentConstants.TIMESTAMP, Long.valueOf(System.currentTimeMillis()));
    }

    private void deleteRecursive(File file) {
        if (file.isDirectory()) {
            for (File file2 : file.listFiles()) {
                deleteRecursive(file2);
            }
        }
        file.delete();
    }

    public String getFileIfBuildExists(String str) {
        if (this.isCachingDisabled) {
            return "";
        }
        if (this.files.get(str) != null) {
            HashMap map = new HashMap();
            map.put("filename", str);
            map.put(PaymentConstants.TIMESTAMP, Long.valueOf(System.currentTimeMillis()));
            AnalyticsUtil.trackEvent(AnalyticsEvent.CHECKOUT_PREFETCH_LOCAL_ASSET_FILE_LOADED, map);
            StringBuilder sb = new StringBuilder("file ");
            sb.append(str);
            sb.append(" found in fileSet: loading from cache");
            Logger.d(sb.toString());
            return this.files.get(str);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.context.getFilesDir());
        sb2.append("/razorpay/");
        File file = new File(sb2.toString());
        if (file.exists()) {
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles.length > 0) {
                File file2 = fileArrListFiles[0];
                StringBuilder sb3 = new StringBuilder();
                sb3.append(file2.getPath());
                sb3.append("/");
                sb3.append(str);
                String string = sb3.toString();
                File file3 = new File(string);
                if (file3.exists()) {
                    StringBuilder sb4 = new StringBuilder("checkFileName:");
                    sb4.append(string);
                    Logger.d(sb4.toString());
                    try {
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file3)));
                        StringBuilder sb5 = new StringBuilder();
                        while (true) {
                            String line = bufferedReader.readLine();
                            if (line != null) {
                                sb5.append(line);
                            } else {
                                String string2 = sb5.toString();
                                StringBuilder sb6 = new StringBuilder();
                                sb6.append("fileContents for ");
                                sb6.append(str);
                                sb6.append(": \n");
                                sb6.append(string2);
                                Logger.d(sb6.toString());
                                return string2;
                            }
                        }
                    } catch (IOException e) {
                        StringBuilder sb7 = new StringBuilder();
                        sb7.append("fileNotFoundException : ");
                        sb7.append(e.getLocalizedMessage());
                        Logger.e(sb7.toString());
                        StringBuilder sb8 = new StringBuilder();
                        sb8.append("fileContents for ");
                        sb8.append(str);
                        sb8.append(": \n");
                        Logger.d(sb8.toString());
                        AnalyticsUtil.trackEvent(AnalyticsEvent.CHECKOUT_PREFETCH_LOCAL_ASSET_FILE_LOADED, this.props);
                        return "";
                    }
                } else {
                    AnalyticsUtil.trackEvent(AnalyticsEvent.CHECKOUT_PREFETCH_LOCAL_ASSET_FILE_LOAD_FAILED, this.props);
                }
            }
        }
        return "";
    }

    public void reset() {
        this.areAllFilesDownloaded = false;
        this.shouldClearCache = false;
        this.buildNumber = null;
        this.publicPageResponse = null;
        this.files = new HashMap<>();
        this.checkoutPublicUrl = null;
        this.publicPageResponse = null;
        this.isFetchedPublicPageUsed = false;
    }
}
