package kotlin;

import android.content.Context;
import android.text.TextUtils;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import java.io.File;

/* JADX INFO: loaded from: classes2.dex */
public class AnalyticsListenerEventTime {
    private final CleverTapInstanceConfig RemoteActionCompatParcelizer;
    private final Context read;

    public AnalyticsListenerEventTime(Context context, CleverTapInstanceConfig cleverTapInstanceConfig) {
        this.read = context;
        this.RemoteActionCompatParcelizer = cleverTapInstanceConfig;
    }

    public final void IconCompatParcelizer(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            synchronized (AnalyticsListenerEventTime.class) {
                File file = new File(this.read.getFilesDir(), str);
                if (file.exists()) {
                    if (file.delete()) {
                        RendererWakeupListener rendererWakeupListenerMediaBrowserCompatItemReceiver = this.RemoteActionCompatParcelizer.MediaBrowserCompatItemReceiver();
                        String strWrite = this.RemoteActionCompatParcelizer.write();
                        StringBuilder sb = new StringBuilder("File Deleted:");
                        sb.append(str);
                        rendererWakeupListenerMediaBrowserCompatItemReceiver.write(strWrite, sb.toString());
                    } else {
                        RendererWakeupListener rendererWakeupListenerMediaBrowserCompatItemReceiver2 = this.RemoteActionCompatParcelizer.MediaBrowserCompatItemReceiver();
                        String strWrite2 = this.RemoteActionCompatParcelizer.write();
                        StringBuilder sb2 = new StringBuilder("Failed to delete file");
                        sb2.append(str);
                        rendererWakeupListenerMediaBrowserCompatItemReceiver2.write(strWrite2, sb2.toString());
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            RendererWakeupListener rendererWakeupListenerMediaBrowserCompatItemReceiver3 = this.RemoteActionCompatParcelizer.MediaBrowserCompatItemReceiver();
            String strWrite3 = this.RemoteActionCompatParcelizer.write();
            StringBuilder sb3 = new StringBuilder("writeFileOnInternalStorage: failed");
            sb3.append(str);
            sb3.append(" Error:");
            sb3.append(e.getLocalizedMessage());
            rendererWakeupListenerMediaBrowserCompatItemReceiver3.write(strWrite3, sb3.toString());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String RemoteActionCompatParcelizer(java.lang.String r8) throws java.lang.Throwable {
        /*
            r7 = this;
            r0 = 0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L60 java.lang.Exception -> L64
            r1.<init>()     // Catch: java.lang.Throwable -> L60 java.lang.Exception -> L64
            android.content.Context r2 = r7.read     // Catch: java.lang.Throwable -> L60 java.lang.Exception -> L64
            java.io.File r2 = r2.getFilesDir()     // Catch: java.lang.Throwable -> L60 java.lang.Exception -> L64
            r1.append(r2)     // Catch: java.lang.Throwable -> L60 java.lang.Exception -> L64
            java.lang.String r2 = "/"
            r1.append(r2)     // Catch: java.lang.Throwable -> L60 java.lang.Exception -> L64
            r1.append(r8)     // Catch: java.lang.Throwable -> L60 java.lang.Exception -> L64
            java.lang.String r8 = r1.toString()     // Catch: java.lang.Throwable -> L60 java.lang.Exception -> L64
            java.io.File r1 = new java.io.File     // Catch: java.lang.Throwable -> L60 java.lang.Exception -> L64
            r1.<init>(r8)     // Catch: java.lang.Throwable -> L60 java.lang.Exception -> L64
            java.io.FileInputStream r8 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L60 java.lang.Exception -> L64
            r8.<init>(r1)     // Catch: java.lang.Throwable -> L60 java.lang.Exception -> L64
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L58 java.lang.Exception -> L5b
            r1.<init>()     // Catch: java.lang.Throwable -> L58 java.lang.Exception -> L5b
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L58 java.lang.Exception -> L5b
            r2.<init>(r8)     // Catch: java.lang.Throwable -> L58 java.lang.Exception -> L5b
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L54 java.lang.Exception -> L56
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L54 java.lang.Exception -> L56
        L34:
            java.lang.String r0 = r3.readLine()     // Catch: java.lang.Throwable -> L4f java.lang.Exception -> L51
            if (r0 == 0) goto L3e
            r1.append(r0)     // Catch: java.lang.Throwable -> L4f java.lang.Exception -> L51
            goto L34
        L3e:
            r8.close()     // Catch: java.lang.Throwable -> L4f java.lang.Exception -> L51
            java.lang.String r7 = r1.toString()     // Catch: java.lang.Throwable -> L4f java.lang.Exception -> L51
            r8.close()
            r2.close()
            r3.close()
            return r7
        L4f:
            r7 = move-exception
            goto La0
        L51:
            r0 = move-exception
            r1 = r0
            goto L5e
        L54:
            r7 = move-exception
            goto La1
        L56:
            r1 = move-exception
            goto L5d
        L58:
            r7 = move-exception
            r2 = r0
            goto La1
        L5b:
            r1 = move-exception
            r2 = r0
        L5d:
            r3 = r0
        L5e:
            r0 = r2
            goto L68
        L60:
            r7 = move-exception
            r8 = r0
            r2 = r8
            goto La4
        L64:
            r8 = move-exception
            r1 = r8
            r8 = r0
            r3 = r8
        L68:
            com.clevertap.android.sdk.CleverTapInstanceConfig r2 = r7.RemoteActionCompatParcelizer     // Catch: java.lang.Throwable -> L9e
            o.RendererWakeupListener r2 = r2.MediaBrowserCompatItemReceiver()     // Catch: java.lang.Throwable -> L9e
            com.clevertap.android.sdk.CleverTapInstanceConfig r7 = r7.RemoteActionCompatParcelizer     // Catch: java.lang.Throwable -> L9e
            java.lang.String r7 = r7.write()     // Catch: java.lang.Throwable -> L9e
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L9e
            r4.<init>()     // Catch: java.lang.Throwable -> L9e
            java.lang.String r5 = "[Exception While Reading: "
            r4.append(r5)     // Catch: java.lang.Throwable -> L9e
            java.lang.String r1 = r1.getLocalizedMessage()     // Catch: java.lang.Throwable -> L9e
            r4.append(r1)     // Catch: java.lang.Throwable -> L9e
            java.lang.String r1 = r4.toString()     // Catch: java.lang.Throwable -> L9e
            r2.write(r7, r1)     // Catch: java.lang.Throwable -> L9e
            if (r8 == 0) goto L91
            r8.close()
        L91:
            if (r0 == 0) goto L96
            r0.close()
        L96:
            if (r3 == 0) goto L9b
            r3.close()
        L9b:
            java.lang.String r7 = ""
            return r7
        L9e:
            r7 = move-exception
            r2 = r0
        La0:
            r0 = r3
        La1:
            r6 = r0
            r0 = r8
            r8 = r6
        La4:
            if (r0 == 0) goto La9
            r0.close()
        La9:
            if (r2 == 0) goto Lae
            r2.close()
        Lae:
            if (r8 == 0) goto Lb3
            r8.close()
        Lb3:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.AnalyticsListenerEventTime.RemoteActionCompatParcelizer(java.lang.String):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x007e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void read(java.lang.String r5, java.lang.String r6, org.json.JSONObject r7) throws java.io.IOException {
        /*
            r4 = this;
            if (r7 == 0) goto L82
            r0 = 0
            boolean r1 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L4e
            if (r1 != 0) goto L82
            boolean r1 = android.text.TextUtils.isEmpty(r6)     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L4e
            if (r1 == 0) goto L10
            return
        L10:
            java.lang.Class<o.AnalyticsListenerEventTime> r1 = kotlin.AnalyticsListenerEventTime.class
            monitor-enter(r1)     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L4e
            java.io.File r2 = new java.io.File     // Catch: java.lang.Throwable -> L49
            android.content.Context r3 = r4.read     // Catch: java.lang.Throwable -> L49
            java.io.File r3 = r3.getFilesDir()     // Catch: java.lang.Throwable -> L49
            r2.<init>(r3, r5)     // Catch: java.lang.Throwable -> L49
            boolean r5 = r2.exists()     // Catch: java.lang.Throwable -> L49
            if (r5 != 0) goto L2c
            boolean r5 = r2.mkdir()     // Catch: java.lang.Throwable -> L49
            if (r5 != 0) goto L2c
            monitor-exit(r1)
            return
        L2c:
            java.io.File r5 = new java.io.File     // Catch: java.lang.Throwable -> L49
            r5.<init>(r2, r6)     // Catch: java.lang.Throwable -> L49
            java.io.FileWriter r6 = new java.io.FileWriter     // Catch: java.lang.Throwable -> L49
            r2 = 0
            r6.<init>(r5, r2)     // Catch: java.lang.Throwable -> L49
            java.lang.String r5 = r7.toString()     // Catch: java.lang.Throwable -> L46
            r6.append(r5)     // Catch: java.lang.Throwable -> L46
            r6.flush()     // Catch: java.lang.Throwable -> L46
            monitor-exit(r1)
            r6.close()
            return
        L46:
            r5 = move-exception
            r0 = r6
            goto L4a
        L49:
            r5 = move-exception
        L4a:
            monitor-exit(r1)
            throw r5     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L4e
        L4c:
            r4 = move-exception
            goto L7c
        L4e:
            r5 = move-exception
            r5.printStackTrace()     // Catch: java.lang.Throwable -> L4c
            com.clevertap.android.sdk.CleverTapInstanceConfig r6 = r4.RemoteActionCompatParcelizer     // Catch: java.lang.Throwable -> L4c
            o.RendererWakeupListener r6 = r6.MediaBrowserCompatItemReceiver()     // Catch: java.lang.Throwable -> L4c
            com.clevertap.android.sdk.CleverTapInstanceConfig r4 = r4.RemoteActionCompatParcelizer     // Catch: java.lang.Throwable -> L4c
            java.lang.String r4 = r4.write()     // Catch: java.lang.Throwable -> L4c
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4c
            r7.<init>()     // Catch: java.lang.Throwable -> L4c
            java.lang.String r1 = "writeFileOnInternalStorage: failed"
            r7.append(r1)     // Catch: java.lang.Throwable -> L4c
            java.lang.String r5 = r5.getLocalizedMessage()     // Catch: java.lang.Throwable -> L4c
            r7.append(r5)     // Catch: java.lang.Throwable -> L4c
            java.lang.String r5 = r7.toString()     // Catch: java.lang.Throwable -> L4c
            r6.write(r4, r5)     // Catch: java.lang.Throwable -> L4c
            if (r0 == 0) goto L82
            r0.close()
            return
        L7c:
            if (r0 == 0) goto L81
            r0.close()
        L81:
            throw r4
        L82:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.AnalyticsListenerEventTime.read(java.lang.String, java.lang.String, org.json.JSONObject):void");
    }
}
