package com.google.android.exoplayer2.ui;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import com.google.android.exoplayer2.offline.Download;
import com.google.android.exoplayer2.util.Util;
import java.util.List;
import kotlin._coercedTypeDesc;

/* JADX INFO: loaded from: classes5.dex */
@Deprecated
public final class DownloadNotificationHelper {
    private static final int NULL_STRING_ID = 0;
    private final _coercedTypeDesc.AudioAttributesImplBaseParcelizer notificationBuilder;

    public DownloadNotificationHelper(Context context, String str) {
        this.notificationBuilder = new _coercedTypeDesc.AudioAttributesImplBaseParcelizer(context.getApplicationContext(), str);
    }

    @Deprecated
    public final Notification buildProgressNotification(Context context, int i, PendingIntent pendingIntent, String str, List<Download> list) {
        return buildProgressNotification(context, i, pendingIntent, str, list, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.app.Notification buildProgressNotification(android.content.Context r22, int r23, android.app.PendingIntent r24, java.lang.String r25, java.util.List<com.google.android.exoplayer2.offline.Download> r26, int r27) {
        /*
            r21 = this;
            r0 = 0
            r1 = 0
            r2 = 1
            r3 = r1
            r4 = r3
            r5 = r4
            r6 = r5
            r7 = r6
            r9 = r7
            r8 = r2
        La:
            int r10 = r26.size()
            if (r3 >= r10) goto L4a
            r10 = r26
            java.lang.Object r11 = r10.get(r3)
            com.google.android.exoplayer2.offline.Download r11 = (com.google.android.exoplayer2.offline.Download) r11
            int r12 = r11.state
            if (r12 == 0) goto L46
            r13 = 2
            if (r12 == r13) goto L28
            r13 = 5
            if (r12 == r13) goto L26
            r13 = 7
            if (r12 == r13) goto L28
            goto L47
        L26:
            r6 = r2
            goto L47
        L28:
            float r4 = r11.getPercentDownloaded()
            r12 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r12 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r12 == 0) goto L34
            float r0 = r0 + r4
            r8 = r1
        L34:
            long r11 = r11.getBytesDownloaded()
            r13 = 0
            int r4 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r4 <= 0) goto L40
            r4 = r2
            goto L41
        L40:
            r4 = r1
        L41:
            r9 = r9 | r4
            int r7 = r7 + 1
            r4 = r2
            goto L47
        L46:
            r5 = r2
        L47:
            int r3 = r3 + 1
            goto La
        L4a:
            if (r4 == 0) goto L4f
            int r3 = com.google.android.exoplayer2.core.R.string.exo_download_downloading
            goto L6c
        L4f:
            if (r5 == 0) goto L66
            if (r27 == 0) goto L66
            r3 = r27 & 2
            if (r3 == 0) goto L5a
            int r3 = com.google.android.exoplayer2.core.R.string.exo_download_paused_for_wifi
            goto L63
        L5a:
            r3 = r27 & 1
            if (r3 == 0) goto L61
            int r3 = com.google.android.exoplayer2.core.R.string.exo_download_paused_for_network
            goto L63
        L61:
            int r3 = com.google.android.exoplayer2.core.R.string.exo_download_paused
        L63:
            r15 = r3
            r3 = r1
            goto L6e
        L66:
            if (r6 == 0) goto L6b
            int r3 = com.google.android.exoplayer2.core.R.string.exo_download_removing
            goto L6c
        L6b:
            r3 = r1
        L6c:
            r15 = r3
            r3 = r2
        L6e:
            if (r3 == 0) goto L85
            if (r4 == 0) goto L7a
            float r3 = (float) r7
            float r0 = r0 / r3
            int r0 = (int) r0
            if (r8 == 0) goto L7c
            if (r9 == 0) goto L7c
            goto L7b
        L7a:
            r0 = r1
        L7b:
            r1 = r2
        L7c:
            r2 = 100
            r17 = r0
            r18 = r1
            r16 = r2
            goto L8b
        L85:
            r16 = r1
            r17 = r16
            r18 = r17
        L8b:
            r19 = 1
            r20 = 0
            r10 = r21
            r11 = r22
            r12 = r23
            r13 = r24
            r14 = r25
            android.app.Notification r0 = r10.buildNotification(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.ui.DownloadNotificationHelper.buildProgressNotification(android.content.Context, int, android.app.PendingIntent, java.lang.String, java.util.List, int):android.app.Notification");
    }

    public final Notification buildDownloadCompletedNotification(Context context, int i, PendingIntent pendingIntent, String str) {
        return buildEndStateNotification(context, i, pendingIntent, str, com.google.android.exoplayer2.core.R.string.exo_download_completed);
    }

    public final Notification buildDownloadFailedNotification(Context context, int i, PendingIntent pendingIntent, String str) {
        return buildEndStateNotification(context, i, pendingIntent, str, com.google.android.exoplayer2.core.R.string.exo_download_failed);
    }

    private Notification buildEndStateNotification(Context context, int i, PendingIntent pendingIntent, String str, int i2) {
        return buildNotification(context, i, pendingIntent, str, i2, 0, 0, false, false, true);
    }

    private Notification buildNotification(Context context, int i, PendingIntent pendingIntent, String str, int i2, int i3, int i4, boolean z, boolean z2, boolean z3) {
        this.notificationBuilder.MediaBrowserCompatItemReceiver(i);
        this.notificationBuilder.RemoteActionCompatParcelizer((CharSequence) (i2 == 0 ? null : context.getResources().getString(i2)));
        this.notificationBuilder.read(pendingIntent);
        this.notificationBuilder.read(str != null ? new _coercedTypeDesc.AudioAttributesImplApi21Parcelizer().AudioAttributesCompatParcelizer(str) : null);
        this.notificationBuilder.IconCompatParcelizer(i3, i4, z);
        this.notificationBuilder.MediaBrowserCompatCustomActionResultReceiver(z2);
        this.notificationBuilder.AudioAttributesImplApi21Parcelizer(z3);
        if (Util.SDK_INT >= 31) {
            Api31.setForegroundServiceBehavior(this.notificationBuilder);
        }
        return this.notificationBuilder.RemoteActionCompatParcelizer();
    }

    static final class Api31 {
        private Api31() {
        }

        public static void setForegroundServiceBehavior(_coercedTypeDesc.AudioAttributesImplBaseParcelizer audioAttributesImplBaseParcelizer) {
            audioAttributesImplBaseParcelizer.AudioAttributesCompatParcelizer(1);
        }
    }
}
