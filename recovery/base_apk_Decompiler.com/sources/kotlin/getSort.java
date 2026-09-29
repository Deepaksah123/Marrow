package kotlin;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.google.android.exoplayer2.source.rtsp.SessionDescription;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;

/* JADX INFO: loaded from: classes4.dex */
public final class getSort {
    private boolean RemoteActionCompatParcelizer = true;
    private final Context read;

    public getSort(Context context) {
        this.read = context;
    }

    public final boolean AudioAttributesImplApi21Parcelizer() {
        return MediaBrowserCompatCustomActionResultReceiver() || read() || RemoteActionCompatParcelizer("su") || IconCompatParcelizer() || write() || MediaBrowserCompatItemReceiver() || AudioAttributesCompatParcelizer() || RemoteActionCompatParcelizer() || MediaDescriptionCompat();
    }

    @Deprecated
    public final boolean AudioAttributesImplBaseParcelizer() {
        return AudioAttributesImplApi21Parcelizer();
    }

    public static boolean MediaBrowserCompatItemReceiver() {
        String str = Build.TAGS;
        return str != null && str.contains("test-keys");
    }

    public final boolean MediaBrowserCompatCustomActionResultReceiver() {
        return onAddQueueItem();
    }

    private boolean onAddQueueItem() {
        return RemoteActionCompatParcelizer(new ArrayList(Arrays.asList(setSort.write)));
    }

    public final boolean read() {
        return MediaBrowserCompatSearchResultReceiver();
    }

    private boolean MediaBrowserCompatSearchResultReceiver() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(Arrays.asList(setSort.AudioAttributesCompatParcelizer));
        return RemoteActionCompatParcelizer(arrayList);
    }

    private static boolean MediaDescriptionCompat() {
        return RemoteActionCompatParcelizer("magisk");
    }

    public static boolean RemoteActionCompatParcelizer(String str) {
        boolean z = false;
        for (String str2 : setSort.write()) {
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append(str);
            String string = sb.toString();
            if (new File(str2, str).exists()) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(string);
                sb2.append(" binary detected!");
                getLessonAuthor.RemoteActionCompatParcelizer(sb2.toString());
                z = true;
            }
        }
        return z;
    }

    public final void AudioAttributesImplApi26Parcelizer() {
        this.RemoteActionCompatParcelizer = false;
        getLessonAuthor.read = 0;
    }

    private static String[] MediaMetadataCompat() {
        try {
            InputStream inputStream = Runtime.getRuntime().exec("getprop").getInputStream();
            if (inputStream == null) {
                return null;
            }
            return new Scanner(inputStream).useDelimiter("\\A").next().split("\n");
        } catch (IOException | NoSuchElementException e) {
            getLessonAuthor.AudioAttributesCompatParcelizer(e);
            return null;
        }
    }

    private static String[] RatingCompat() {
        try {
            InputStream inputStream = Runtime.getRuntime().exec("mount").getInputStream();
            if (inputStream == null) {
                return null;
            }
            return new Scanner(inputStream).useDelimiter("\\A").next().split("\n");
        } catch (IOException | NoSuchElementException e) {
            getLessonAuthor.AudioAttributesCompatParcelizer(e);
            return null;
        }
    }

    private boolean RemoteActionCompatParcelizer(List<String> list) {
        PackageManager packageManager = this.read.getPackageManager();
        boolean z = false;
        for (String str : list) {
            try {
                packageManager.getPackageInfo(str, 0);
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" ROOT management app detected!");
                getLessonAuthor.write(sb.toString());
                z = true;
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        return z;
    }

    public static boolean IconCompatParcelizer() {
        HashMap map = new HashMap();
        map.put("ro.debuggable", IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
        map.put("ro.secure", SessionDescription.SUPPORTED_SDP_VERSION);
        String[] strArrMediaMetadataCompat = MediaMetadataCompat();
        if (strArrMediaMetadataCompat == null) {
            return false;
        }
        boolean z = false;
        for (String str : strArrMediaMetadataCompat) {
            for (String str2 : map.keySet()) {
                if (str.contains(str2)) {
                    String str3 = (String) map.get(str2);
                    StringBuilder sb = new StringBuilder("[");
                    sb.append(str3);
                    sb.append("]");
                    String string = sb.toString();
                    if (str.contains(string)) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(str2);
                        sb2.append(" = ");
                        sb2.append(string);
                        sb2.append(" detected!");
                        getLessonAuthor.RemoteActionCompatParcelizer(sb2.toString());
                        z = true;
                    }
                }
            }
        }
        return z;
    }

    public static boolean write() {
        String[] strArrRatingCompat = RatingCompat();
        int i = 0;
        if (strArrRatingCompat == null) {
            return false;
        }
        int length = strArrRatingCompat.length;
        int i2 = 0;
        boolean z = false;
        while (i2 < length) {
            String str = strArrRatingCompat[i2];
            String[] strArrSplit = str.split(" ");
            if (strArrSplit.length < 6) {
                getLessonAuthor.write("Error formatting mount line: ".concat(String.valueOf(str)));
            } else {
                String str2 = strArrSplit[2];
                String strReplace = strArrSplit[5];
                String[] strArr = setSort.RemoteActionCompatParcelizer;
                int length2 = strArr.length;
                int i3 = i;
                while (i3 < length2) {
                    String str3 = strArr[i3];
                    if (str2.equalsIgnoreCase(str3)) {
                        strReplace = strReplace.replace("(", "").replace(")", "");
                        String[] strArrSplit2 = strReplace.split(",");
                        int length3 = strArrSplit2.length;
                        int i4 = i;
                        while (true) {
                            if (i4 >= length3) {
                                break;
                            }
                            if (strArrSplit2[i4].equalsIgnoreCase("rw")) {
                                StringBuilder sb = new StringBuilder();
                                sb.append(str3);
                                sb.append(" path is mounted with rw permissions! ");
                                sb.append(str);
                                getLessonAuthor.RemoteActionCompatParcelizer(sb.toString());
                                z = true;
                                break;
                            }
                            i4++;
                        }
                    }
                    i3++;
                    i = 0;
                }
            }
            i2++;
            i = 0;
        }
        return z;
    }

    public static boolean AudioAttributesCompatParcelizer() {
        Process processExec = null;
        try {
            processExec = Runtime.getRuntime().exec(new String[]{"which", "su"});
            boolean z = new BufferedReader(new InputStreamReader(processExec.getInputStream())).readLine() != null;
            if (processExec != null) {
                processExec.destroy();
            }
            return z;
        } catch (Throwable unused) {
            if (processExec != null) {
                processExec.destroy();
            }
            return false;
        }
    }

    private static boolean MediaBrowserCompatMediaItem() {
        new setLessons();
        return setLessons.read();
    }

    public final boolean RemoteActionCompatParcelizer() {
        if (!MediaBrowserCompatMediaItem()) {
            getLessonAuthor.write("We could not load the native library to test for root");
            return false;
        }
        String[] strArrWrite = setSort.write();
        int length = strArrWrite.length;
        String[] strArr = new String[length];
        for (int i = 0; i < length; i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(strArrWrite[i]);
            sb.append("su");
            strArr[i] = sb.toString();
        }
        setLessons setlessons = new setLessons();
        try {
            setlessons.read(this.RemoteActionCompatParcelizer);
        } catch (UnsatisfiedLinkError unused) {
        }
        return setlessons.write(strArr) > 0;
    }
}
