package com.google.android.exoplayer2.offline;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Process;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.exoplayer2.offline.DownloadManager;
import com.google.android.exoplayer2.scheduler.Requirements;
import com.google.android.exoplayer2.scheduler.Scheduler;
import com.google.android.exoplayer2.upstream.CmcdHeadersFactory;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.Util;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import kotlin.clearDownloadManagerHelpers;
import kotlin.startForeground;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes5.dex */
@Deprecated
public abstract class DownloadService extends Service {
    public static final String ACTION_ADD_DOWNLOAD = "com.google.android.exoplayer.downloadService.action.ADD_DOWNLOAD";
    public static final String ACTION_INIT = "com.google.android.exoplayer.downloadService.action.INIT";
    public static final String ACTION_PAUSE_DOWNLOADS = "com.google.android.exoplayer.downloadService.action.PAUSE_DOWNLOADS";
    public static final String ACTION_REMOVE_ALL_DOWNLOADS = "com.google.android.exoplayer.downloadService.action.REMOVE_ALL_DOWNLOADS";
    public static final String ACTION_REMOVE_DOWNLOAD = "com.google.android.exoplayer.downloadService.action.REMOVE_DOWNLOAD";
    private static final String ACTION_RESTART = "com.google.android.exoplayer.downloadService.action.RESTART";
    public static final String ACTION_RESUME_DOWNLOADS = "com.google.android.exoplayer.downloadService.action.RESUME_DOWNLOADS";
    public static final String ACTION_SET_REQUIREMENTS = "com.google.android.exoplayer.downloadService.action.SET_REQUIREMENTS";
    public static final String ACTION_SET_STOP_REASON = "com.google.android.exoplayer.downloadService.action.SET_STOP_REASON";
    private static int AudioAttributesCompatParcelizer = 0;
    private static short[] AudioAttributesImplBaseParcelizer = null;
    public static final long DEFAULT_FOREGROUND_NOTIFICATION_UPDATE_INTERVAL = 1000;
    public static final int FOREGROUND_NOTIFICATION_ID_NONE = 0;
    private static byte[] IconCompatParcelizer = null;
    public static final String KEY_CONTENT_ID = "content_id";
    public static final String KEY_DOWNLOAD_REQUEST = "download_request";
    public static final String KEY_FOREGROUND = "foreground";
    public static final String KEY_REQUIREMENTS = "requirements";
    public static final String KEY_STOP_REASON = "stop_reason";
    private static int MediaBrowserCompatCustomActionResultReceiver = 0;
    private static int RemoteActionCompatParcelizer = 0;
    private static final String TAG = "DownloadService";
    private static final HashMap<Class<? extends DownloadService>, DownloadManagerHelper> downloadManagerHelpers;
    private static int read;
    private static int write;
    private final int channelDescriptionResourceId;
    private final String channelId;
    private final int channelNameResourceId;
    private DownloadManagerHelper downloadManagerHelper;
    private final ForegroundNotificationUpdater foregroundNotificationUpdater;
    private boolean isDestroyed;
    private boolean isStopped;
    private int lastStartId;
    private boolean startedInForeground;
    private boolean taskRemoved;
    private static final byte[] $$c = {99, -29, 19, 27};
    private static final int $$f = 34;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {67, -110, -113, 74, 25, 14, 8, 11, -9, -30, 40, 23, -5, 12, 5, -37, TarConstants.LF_SYMLINK, 4, 9, -9, 25, -30, 23, 23, -9, 8, 13, 3, 23, -15, 19, 18, 4, -57, 63, 14, 6, -2, 11, -1, -49, 57, 19, -4, 20, 3, 0, 1, -48, 69, -6, 25, -9, 19, -3, -2, 17, -56, 59, 11, 7, 13, -60, 27, 43, 7, 13, -70, 19, 1, -3, 17, -9};
    private static final int $$e = 102;
    private static final byte[] $$a = {32, -59, 22, 74, 12, 3, -4, -25, 0, -6, 7, 30, -49, 2, -9, 3, 13, -14, 46, -45, 1, -4, 14, -20, 42, -44, 14, -9, 26, -20, 1, -3, -5, -14, 16, -14, -27, -13, 0, 42, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14, -20, -9, -3, -6, 14, 35, -35, -18, 10, -7, 0, 42, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14, -25, 0, -6, 7, 30, -49, 2, -9, 3, 13, -14, 46, -45, 1, -4, 14, -20, TarConstants.LF_NORMAL, -51, 1, -2, 4, 1, 43, -35, -18, 10, -7, 0, 27, -20, -15, -3, 8, -9, 33, -20, 1, -3, -5, -14, 16, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, 0, -32, -18, -18, 14, -3, -8, 2, -18, 20, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, -5, -27, -18, -18, 14, -3, -8, 2, -18, 20, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 47, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14};
    private static final int $$b = 217;
    private static int AudioAttributesImplApi21Parcelizer = 0;
    private static int AudioAttributesImplApi26Parcelizer = 1;
    private static int MediaBrowserCompatItemReceiver = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$g(byte r7, int r8, byte r9) {
        /*
            int r8 = r8 * 4
            int r8 = 4 - r8
            int r9 = r9 * 4
            int r9 = 112 - r9
            int r7 = r7 * 4
            int r7 = 1 - r7
            byte[] r0 = com.google.android.exoplayer2.offline.DownloadService.$$c
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r7
            r9 = r8
            r5 = r2
            goto L2d
        L17:
            r3 = r2
        L18:
            r6 = r9
            r9 = r8
            r8 = r6
            byte r4 = (byte) r8
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r7) goto L28
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L28:
            r3 = r0[r9]
            r6 = r9
            r9 = r8
            r8 = r6
        L2d:
            int r8 = r8 + 1
            int r9 = r9 + r3
            r3 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.offline.DownloadService.$$g(byte, int, byte):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void c(short r6, int r7, byte r8, java.lang.Object[] r9) {
        /*
            int r0 = 44 - r6
            byte[] r1 = com.google.android.exoplayer2.offline.DownloadService.$$a
            int r8 = r8 + 65
            int r7 = r7 + 4
            byte[] r0 = new byte[r0]
            int r6 = 43 - r6
            r2 = 0
            if (r1 != 0) goto L13
            r3 = r6
            r8 = r7
            r4 = r2
            goto L2b
        L13:
            r3 = r2
        L14:
            int r7 = r7 + 1
            byte r4 = (byte) r8
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r6) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L25:
            r3 = r1[r7]
            r5 = r8
            r8 = r7
            r7 = r3
            r3 = r5
        L2b:
            int r7 = -r7
            int r3 = r3 + r7
            int r7 = r3 + (-1)
            r3 = r4
            r5 = r8
            r8 = r7
            r7 = r5
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.offline.DownloadService.c(short, int, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0020 -> B:11:0x0024). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void d(byte r5, byte r6, short r7, java.lang.Object[] r8) {
        /*
            int r0 = 39 - r7
            int r5 = 119 - r5
            byte[] r1 = com.google.android.exoplayer2.offline.DownloadService.$$d
            int r6 = 69 - r6
            byte[] r0 = new byte[r0]
            int r7 = 38 - r7
            r2 = 0
            if (r1 != 0) goto L12
            r4 = r6
            r3 = r2
            goto L24
        L12:
            r3 = r2
        L13:
            byte r4 = (byte) r5
            r0[r3] = r4
            if (r3 != r7) goto L20
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            r8[r2] = r5
            return
        L20:
            int r3 = r3 + 1
            r4 = r1[r6]
        L24:
            int r6 = r6 + 1
            int r5 = r5 + r4
            int r5 = r5 + (-6)
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.offline.DownloadService.d(byte, byte, short, java.lang.Object[]):void");
    }

    protected abstract DownloadManager getDownloadManager();

    protected abstract Notification getForegroundNotification(List<Download> list, int i);

    protected abstract Scheduler getScheduler();

    static /* synthetic */ DownloadManagerHelper access$200(DownloadService downloadService) {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi26Parcelizer;
        int i3 = i2 + 111;
        AudioAttributesImplApi21Parcelizer = i3 % 128;
        int i4 = i3 % 2;
        DownloadManagerHelper downloadManagerHelper = downloadService.downloadManagerHelper;
        if (i4 != 0) {
            throw null;
        }
        int i5 = i2 + 35;
        AudioAttributesImplApi21Parcelizer = i5 % 128;
        if (i5 % 2 == 0) {
            return downloadManagerHelper;
        }
        throw null;
    }

    static /* synthetic */ void access$300(DownloadService downloadService, List list) {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi21Parcelizer + 111;
        AudioAttributesImplApi26Parcelizer = i2 % 128;
        int i3 = i2 % 2;
        downloadService.notifyDownloads(list);
        if (i3 == 0) {
            int i4 = 82 / 0;
        }
    }

    static /* synthetic */ void access$400(DownloadService downloadService, Download download) {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi21Parcelizer + 81;
        AudioAttributesImplApi26Parcelizer = i2 % 128;
        int i3 = i2 % 2;
        downloadService.notifyDownloadChanged(download);
        if (i3 == 0) {
            throw null;
        }
    }

    static /* synthetic */ boolean access$500(int i) {
        int i2 = 2 % 2;
        int i3 = AudioAttributesImplApi26Parcelizer + 59;
        AudioAttributesImplApi21Parcelizer = i3 % 128;
        int i4 = i3 % 2;
        boolean zNeedsStartedService = needsStartedService(i);
        int i5 = AudioAttributesImplApi26Parcelizer + 3;
        AudioAttributesImplApi21Parcelizer = i5 % 128;
        int i6 = i5 % 2;
        return zNeedsStartedService;
    }

    static /* synthetic */ void access$600(DownloadService downloadService) {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi21Parcelizer + 119;
        AudioAttributesImplApi26Parcelizer = i2 % 128;
        int i3 = i2 % 2;
        downloadService.notifyDownloadRemoved();
        if (i3 == 0) {
            int i4 = 46 / 0;
        }
    }

    static /* synthetic */ void access$700(DownloadService downloadService) {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi21Parcelizer + 87;
        AudioAttributesImplApi26Parcelizer = i2 % 128;
        int i3 = i2 % 2;
        downloadService.onIdle();
        if (i3 == 0) {
            throw null;
        }
    }

    static /* synthetic */ boolean access$800(DownloadService downloadService) {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi26Parcelizer + 13;
        AudioAttributesImplApi21Parcelizer = i2 % 128;
        int i3 = i2 % 2;
        boolean zIsStopped = downloadService.isStopped();
        int i4 = AudioAttributesImplApi26Parcelizer + 73;
        AudioAttributesImplApi21Parcelizer = i4 % 128;
        int i5 = i4 % 2;
        return zIsStopped;
    }

    static /* synthetic */ Intent access$900(Context context, Class cls, String str) {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi21Parcelizer + 31;
        AudioAttributesImplApi26Parcelizer = i2 % 128;
        if (i2 % 2 != 0) {
            return getIntent(context, cls, str);
        }
        getIntent(context, cls, str);
        throw null;
    }

    private static void a(int i, boolean z, char[] cArr, int i2, int i3, Object[] objArr) throws Throwable {
        int i4 = 2 % 2;
        clearDownloadManagerHelpers cleardownloadmanagerhelpers = new clearDownloadManagerHelpers();
        char[] cArr2 = new char[i2];
        cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer = 0;
        int i5 = $11 + 33;
        $10 = i5 % 128;
        int i6 = i5 % 2;
        while (cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer < i2) {
            cleardownloadmanagerhelpers.RemoteActionCompatParcelizer = cArr[cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer];
            cArr2[cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer] = (char) (i3 + cleardownloadmanagerhelpers.RemoteActionCompatParcelizer);
            int i7 = cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i7]), Integer.valueOf(write)};
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-579447922);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) (ViewConfiguration.getTapTimeout() >> 16), 23704 - ((Process.getThreadPriority(0) + 20) >> 6), 32 - (ViewConfiguration.getDoubleTapTimeout() >> 16), -1556113637, false, CmcdHeadersFactory.OBJECT_TYPE_AUDIO_ONLY, new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i7] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {cleardownloadmanagerhelpers, cleardownloadmanagerhelpers};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-322440307);
                if (objRemoteActionCompatParcelizer2 == null) {
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) (44861 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), (-16758272) - Color.rgb(0, 0, 0), 28 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), -1836173544, false, "c", new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        if (i > 0) {
            cleardownloadmanagerhelpers.write = i;
            char[] cArr3 = new char[i2];
            System.arraycopy(cArr2, 0, cArr3, 0, i2);
            System.arraycopy(cArr3, 0, cArr2, i2 - cleardownloadmanagerhelpers.write, cleardownloadmanagerhelpers.write);
            System.arraycopy(cArr3, cleardownloadmanagerhelpers.write, cArr2, 0, i2 - cleardownloadmanagerhelpers.write);
            int i8 = $10 + 89;
            $11 = i8 % 128;
            int i9 = i8 % 2;
        }
        if (z) {
            char[] cArr4 = new char[i2];
            cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer = 0;
            while (cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer < i2) {
                cArr4[cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer] = cArr2[(i2 - cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer) - 1];
                Object[] objArr4 = {cleardownloadmanagerhelpers, cleardownloadmanagerhelpers};
                Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-322440307);
                if (objRemoteActionCompatParcelizer3 == null) {
                    objRemoteActionCompatParcelizer3 = startForeground.read((char) (44862 - View.MeasureSpec.makeMeasureSpec(0, 0)), TextUtils.indexOf("", "") + 18944, 29 - (AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), -1836173544, false, "c", new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    static {
        MediaBrowserCompatCustomActionResultReceiver = 1;
        AudioAttributesCompatParcelizer();
        downloadManagerHelpers = new HashMap<>();
        int i = MediaBrowserCompatItemReceiver + 11;
        MediaBrowserCompatCustomActionResultReceiver = i % 128;
        int i2 = i % 2;
    }

    protected DownloadService(int i) {
        this(i, 1000L);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void b(int r24, short r25, int r26, int r27, byte r28, java.lang.Object[] r29) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 665
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.offline.DownloadService.b(int, short, int, int, byte, java.lang.Object[]):void");
    }

    protected DownloadService(int i, long j) {
        this(i, j, null, 0, 0);
    }

    protected DownloadService(int i, long j, String str, int i2, int i3) {
        if (i == 0) {
            this.foregroundNotificationUpdater = null;
            this.channelId = null;
            this.channelNameResourceId = 0;
            this.channelDescriptionResourceId = 0;
            int i4 = AudioAttributesImplApi21Parcelizer + 41;
            AudioAttributesImplApi26Parcelizer = i4 % 128;
            int i5 = i4 % 2;
            return;
        }
        this.foregroundNotificationUpdater = new ForegroundNotificationUpdater(i, j);
        this.channelId = str;
        this.channelNameResourceId = i2;
        this.channelDescriptionResourceId = i3;
        int i6 = AudioAttributesImplApi26Parcelizer + 125;
        AudioAttributesImplApi21Parcelizer = i6 % 128;
        if (i6 % 2 != 0) {
            throw null;
        }
    }

    public static Intent buildAddDownloadIntent(Context context, Class<? extends DownloadService> cls, DownloadRequest downloadRequest, boolean z) {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi21Parcelizer + 1;
        AudioAttributesImplApi26Parcelizer = i2 % 128;
        int i3 = i2 % 2;
        Intent intentBuildAddDownloadIntent = buildAddDownloadIntent(context, cls, downloadRequest, 0, z);
        int i4 = AudioAttributesImplApi21Parcelizer + 113;
        AudioAttributesImplApi26Parcelizer = i4 % 128;
        int i5 = i4 % 2;
        return intentBuildAddDownloadIntent;
    }

    public static Intent buildAddDownloadIntent(Context context, Class<? extends DownloadService> cls, DownloadRequest downloadRequest, int i, boolean z) {
        int i2 = 2 % 2;
        int i3 = AudioAttributesImplApi21Parcelizer + 55;
        AudioAttributesImplApi26Parcelizer = i3 % 128;
        int i4 = i3 % 2;
        Intent intentPutExtra = getIntent(context, cls, ACTION_ADD_DOWNLOAD, z).putExtra(KEY_DOWNLOAD_REQUEST, downloadRequest).putExtra(KEY_STOP_REASON, i);
        int i5 = AudioAttributesImplApi21Parcelizer + 101;
        AudioAttributesImplApi26Parcelizer = i5 % 128;
        int i6 = i5 % 2;
        return intentPutExtra;
    }

    public static Intent buildRemoveDownloadIntent(Context context, Class<? extends DownloadService> cls, String str, boolean z) {
        Intent intentPutExtra;
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi21Parcelizer + 3;
        AudioAttributesImplApi26Parcelizer = i2 % 128;
        if (i2 % 2 == 0) {
            intentPutExtra = getIntent(context, cls, ACTION_REMOVE_DOWNLOAD, z).putExtra(KEY_CONTENT_ID, str);
            int i3 = 72 / 0;
        } else {
            intentPutExtra = getIntent(context, cls, ACTION_REMOVE_DOWNLOAD, z).putExtra(KEY_CONTENT_ID, str);
        }
        int i4 = AudioAttributesImplApi26Parcelizer + 65;
        AudioAttributesImplApi21Parcelizer = i4 % 128;
        int i5 = i4 % 2;
        return intentPutExtra;
    }

    public static Intent buildRemoveAllDownloadsIntent(Context context, Class<? extends DownloadService> cls, boolean z) {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi26Parcelizer + 43;
        AudioAttributesImplApi21Parcelizer = i2 % 128;
        if (i2 % 2 != 0) {
            getIntent(context, cls, ACTION_REMOVE_ALL_DOWNLOADS, z);
            throw null;
        }
        Intent intent = getIntent(context, cls, ACTION_REMOVE_ALL_DOWNLOADS, z);
        int i3 = AudioAttributesImplApi21Parcelizer + 39;
        AudioAttributesImplApi26Parcelizer = i3 % 128;
        int i4 = i3 % 2;
        return intent;
    }

    public static Intent buildResumeDownloadsIntent(Context context, Class<? extends DownloadService> cls, boolean z) {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi26Parcelizer + 97;
        AudioAttributesImplApi21Parcelizer = i2 % 128;
        int i3 = i2 % 2;
        Intent intent = getIntent(context, cls, ACTION_RESUME_DOWNLOADS, z);
        if (i3 != 0) {
            int i4 = 48 / 0;
        }
        int i5 = AudioAttributesImplApi26Parcelizer + 119;
        AudioAttributesImplApi21Parcelizer = i5 % 128;
        if (i5 % 2 == 0) {
            return intent;
        }
        throw null;
    }

    public static Intent buildPauseDownloadsIntent(Context context, Class<? extends DownloadService> cls, boolean z) {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi21Parcelizer + 111;
        AudioAttributesImplApi26Parcelizer = i2 % 128;
        int i3 = i2 % 2;
        Intent intent = getIntent(context, cls, ACTION_PAUSE_DOWNLOADS, z);
        int i4 = AudioAttributesImplApi21Parcelizer + 117;
        AudioAttributesImplApi26Parcelizer = i4 % 128;
        int i5 = i4 % 2;
        return intent;
    }

    public static Intent buildSetStopReasonIntent(Context context, Class<? extends DownloadService> cls, String str, int i, boolean z) {
        int i2 = 2 % 2;
        int i3 = AudioAttributesImplApi26Parcelizer + 61;
        AudioAttributesImplApi21Parcelizer = i3 % 128;
        if (i3 % 2 != 0) {
            Intent intentPutExtra = getIntent(context, cls, ACTION_SET_STOP_REASON, z).putExtra(KEY_CONTENT_ID, str).putExtra(KEY_STOP_REASON, i);
            int i4 = 22 / 0;
            return intentPutExtra;
        }
        return getIntent(context, cls, ACTION_SET_STOP_REASON, z).putExtra(KEY_CONTENT_ID, str).putExtra(KEY_STOP_REASON, i);
    }

    public static Intent buildSetRequirementsIntent(Context context, Class<? extends DownloadService> cls, Requirements requirements, boolean z) {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi21Parcelizer + 3;
        AudioAttributesImplApi26Parcelizer = i2 % 128;
        int i3 = i2 % 2;
        Intent intentPutExtra = getIntent(context, cls, ACTION_SET_REQUIREMENTS, z).putExtra(KEY_REQUIREMENTS, requirements);
        int i4 = AudioAttributesImplApi21Parcelizer + 49;
        AudioAttributesImplApi26Parcelizer = i4 % 128;
        int i5 = i4 % 2;
        return intentPutExtra;
    }

    public static void sendAddDownload(Context context, Class<? extends DownloadService> cls, DownloadRequest downloadRequest, boolean z) {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi21Parcelizer + 103;
        AudioAttributesImplApi26Parcelizer = i2 % 128;
        if (i2 % 2 != 0) {
            startService(context, buildAddDownloadIntent(context, cls, downloadRequest, z), z);
            int i3 = AudioAttributesImplApi21Parcelizer + 89;
            AudioAttributesImplApi26Parcelizer = i3 % 128;
            int i4 = i3 % 2;
            return;
        }
        startService(context, buildAddDownloadIntent(context, cls, downloadRequest, z), z);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static void sendAddDownload(Context context, Class<? extends DownloadService> cls, DownloadRequest downloadRequest, int i, boolean z) {
        int i2 = 2 % 2;
        int i3 = AudioAttributesImplApi26Parcelizer + 91;
        AudioAttributesImplApi21Parcelizer = i3 % 128;
        if (i3 % 2 != 0) {
            startService(context, buildAddDownloadIntent(context, cls, downloadRequest, i, z), z);
            int i4 = 54 / 0;
        } else {
            startService(context, buildAddDownloadIntent(context, cls, downloadRequest, i, z), z);
        }
        int i5 = AudioAttributesImplApi26Parcelizer + 77;
        AudioAttributesImplApi21Parcelizer = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static void sendRemoveDownload(Context context, Class<? extends DownloadService> cls, String str, boolean z) {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi26Parcelizer + 17;
        AudioAttributesImplApi21Parcelizer = i2 % 128;
        int i3 = i2 % 2;
        startService(context, buildRemoveDownloadIntent(context, cls, str, z), z);
        int i4 = AudioAttributesImplApi21Parcelizer + 27;
        AudioAttributesImplApi26Parcelizer = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public static void sendRemoveAllDownloads(Context context, Class<? extends DownloadService> cls, boolean z) {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi26Parcelizer + 87;
        AudioAttributesImplApi21Parcelizer = i2 % 128;
        if (i2 % 2 == 0) {
            startService(context, buildRemoveAllDownloadsIntent(context, cls, z), z);
            return;
        }
        startService(context, buildRemoveAllDownloadsIntent(context, cls, z), z);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static void sendResumeDownloads(Context context, Class<? extends DownloadService> cls, boolean z) {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi26Parcelizer + 7;
        AudioAttributesImplApi21Parcelizer = i2 % 128;
        int i3 = i2 % 2;
        startService(context, buildResumeDownloadsIntent(context, cls, z), z);
        int i4 = AudioAttributesImplApi21Parcelizer + 65;
        AudioAttributesImplApi26Parcelizer = i4 % 128;
        int i5 = i4 % 2;
    }

    public static void sendPauseDownloads(Context context, Class<? extends DownloadService> cls, boolean z) {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi26Parcelizer + 109;
        AudioAttributesImplApi21Parcelizer = i2 % 128;
        int i3 = i2 % 2;
        startService(context, buildPauseDownloadsIntent(context, cls, z), z);
        int i4 = AudioAttributesImplApi26Parcelizer + 61;
        AudioAttributesImplApi21Parcelizer = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public static void sendSetStopReason(Context context, Class<? extends DownloadService> cls, String str, int i, boolean z) {
        int i2 = 2 % 2;
        int i3 = AudioAttributesImplApi21Parcelizer + 11;
        AudioAttributesImplApi26Parcelizer = i3 % 128;
        if (i3 % 2 != 0) {
            startService(context, buildSetStopReasonIntent(context, cls, str, i, z), z);
            return;
        }
        startService(context, buildSetStopReasonIntent(context, cls, str, i, z), z);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static void sendSetRequirements(Context context, Class<? extends DownloadService> cls, Requirements requirements, boolean z) {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi26Parcelizer + 83;
        AudioAttributesImplApi21Parcelizer = i2 % 128;
        int i3 = i2 % 2;
        startService(context, buildSetRequirementsIntent(context, cls, requirements, z), z);
        int i4 = AudioAttributesImplApi26Parcelizer + 59;
        AudioAttributesImplApi21Parcelizer = i4 % 128;
        int i5 = i4 % 2;
    }

    public static void start(Context context, Class<? extends DownloadService> cls) {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi21Parcelizer + 57;
        AudioAttributesImplApi26Parcelizer = i2 % 128;
        int i3 = i2 % 2;
        context.startService(getIntent(context, cls, ACTION_INIT));
        if (i3 == 0) {
            throw null;
        }
    }

    public static void startForeground(Context context, Class<? extends DownloadService> cls) {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi21Parcelizer + 65;
        AudioAttributesImplApi26Parcelizer = i2 % 128;
        int i3 = i2 % 2;
        Util.startForegroundService(context, getIntent(context, cls, ACTION_INIT, true));
        int i4 = AudioAttributesImplApi21Parcelizer + 75;
        AudioAttributesImplApi26Parcelizer = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 33 / 0;
        }
    }

    public static void clearDownloadManagerHelpers() {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi26Parcelizer + 79;
        AudioAttributesImplApi21Parcelizer = i2 % 128;
        int i3 = i2 % 2;
        downloadManagerHelpers.clear();
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0049  */
    @Override // android.app.Service
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onCreate() {
        /*
            r11 = this;
            r0 = 2
            int r1 = r0 % r0
            java.lang.String r1 = r11.channelId
            if (r1 == 0) goto Le
            int r2 = r11.channelNameResourceId
            int r3 = r11.channelDescriptionResourceId
            com.google.android.exoplayer2.util.NotificationUtil.createNotificationChannel(r11, r1, r2, r3, r0)
        Le:
            java.lang.Class r1 = r11.getClass()
            java.util.HashMap<java.lang.Class<? extends com.google.android.exoplayer2.offline.DownloadService>, com.google.android.exoplayer2.offline.DownloadService$DownloadManagerHelper> r2 = com.google.android.exoplayer2.offline.DownloadService.downloadManagerHelpers
            java.lang.Object r3 = r2.get(r1)
            com.google.android.exoplayer2.offline.DownloadService$DownloadManagerHelper r3 = (com.google.android.exoplayer2.offline.DownloadService.DownloadManagerHelper) r3
            if (r3 != 0) goto L61
            com.google.android.exoplayer2.offline.DownloadService$ForegroundNotificationUpdater r3 = r11.foregroundNotificationUpdater
            r4 = 0
            r5 = 1
            if (r3 == 0) goto L2d
            int r3 = com.google.android.exoplayer2.offline.DownloadService.AudioAttributesImplApi21Parcelizer
            int r3 = r3 + 35
            int r6 = r3 % 128
            com.google.android.exoplayer2.offline.DownloadService.AudioAttributesImplApi26Parcelizer = r6
            int r3 = r3 % r0
            r7 = r5
            goto L2e
        L2d:
            r7 = r4
        L2e:
            int r3 = com.google.android.exoplayer2.util.Util.SDK_INT
            r6 = 31
            if (r3 < r6) goto L35
            goto L36
        L35:
            r4 = r5
        L36:
            if (r7 == r5) goto L39
            goto L49
        L39:
            int r3 = com.google.android.exoplayer2.offline.DownloadService.AudioAttributesImplApi26Parcelizer
            int r3 = r3 + 11
            int r5 = r3 % 128
            com.google.android.exoplayer2.offline.DownloadService.AudioAttributesImplApi21Parcelizer = r5
            int r3 = r3 % r0
            if (r4 == 0) goto L49
            com.google.android.exoplayer2.scheduler.Scheduler r0 = r11.getScheduler()
            goto L4a
        L49:
            r0 = 0
        L4a:
            r8 = r0
            com.google.android.exoplayer2.offline.DownloadManager r6 = r11.getDownloadManager()
            r6.resumeDownloads()
            com.google.android.exoplayer2.offline.DownloadService$DownloadManagerHelper r3 = new com.google.android.exoplayer2.offline.DownloadService$DownloadManagerHelper
            android.content.Context r5 = r11.getApplicationContext()
            r10 = 0
            r4 = r3
            r9 = r1
            r4.<init>(r5, r6, r7, r8, r9)
            r2.put(r1, r3)
        L61:
            r11.downloadManagerHelper = r3
            r3.attachService(r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.offline.DownloadService.onCreate():void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00e8  */
    @Override // android.app.Service
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int onStartCommand(android.content.Intent r10, int r11, int r12) {
        /*
            Method dump skipped, instruction units count: 500
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.offline.DownloadService.onStartCommand(android.content.Intent, int, int):int");
    }

    @Override // android.app.Service
    public void onTaskRemoved(Intent intent) {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi26Parcelizer + 111;
        AudioAttributesImplApi21Parcelizer = i2 % 128;
        this.taskRemoved = i2 % 2 == 0;
    }

    @Override // android.app.Service
    public void onDestroy() {
        ForegroundNotificationUpdater foregroundNotificationUpdater;
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi26Parcelizer + 17;
        AudioAttributesImplApi21Parcelizer = i2 % 128;
        if (i2 % 2 != 0) {
            this.isDestroyed = true;
            ((DownloadManagerHelper) Assertions.checkNotNull(this.downloadManagerHelper)).detachService(this);
            foregroundNotificationUpdater = this.foregroundNotificationUpdater;
            if (foregroundNotificationUpdater == null) {
                return;
            }
        } else {
            this.isDestroyed = true;
            ((DownloadManagerHelper) Assertions.checkNotNull(this.downloadManagerHelper)).detachService(this);
            foregroundNotificationUpdater = this.foregroundNotificationUpdater;
            if (foregroundNotificationUpdater == null) {
                return;
            }
        }
        foregroundNotificationUpdater.stopPeriodicUpdates();
        int i3 = AudioAttributesImplApi21Parcelizer + 15;
        AudioAttributesImplApi26Parcelizer = i3 % 128;
        int i4 = i3 % 2;
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        int i = 2 % 2;
        throw new UnsupportedOperationException();
    }

    protected final void invalidateForegroundNotification() {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi26Parcelizer;
        int i3 = i2 + 77;
        AudioAttributesImplApi21Parcelizer = i3 % 128;
        int i4 = i3 % 2;
        ForegroundNotificationUpdater foregroundNotificationUpdater = this.foregroundNotificationUpdater;
        if (foregroundNotificationUpdater != null) {
            int i5 = i2 + 29;
            AudioAttributesImplApi21Parcelizer = i5 % 128;
            int i6 = i5 % 2;
            if (this.isDestroyed) {
                return;
            }
            foregroundNotificationUpdater.invalidate();
            int i7 = AudioAttributesImplApi21Parcelizer + 85;
            AudioAttributesImplApi26Parcelizer = i7 % 128;
            int i8 = i7 % 2;
        }
    }

    private void notifyDownloads(List<Download> list) {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi26Parcelizer;
        int i3 = i2 + 63;
        AudioAttributesImplApi21Parcelizer = i3 % 128;
        int i4 = i3 % 2;
        if (this.foregroundNotificationUpdater != null) {
            int i5 = i2 + 15;
            AudioAttributesImplApi21Parcelizer = i5 % 128;
            for (int i6 = i5 % 2 != 0 ? 1 : 0; i6 < list.size(); i6++) {
                if (needsStartedService(list.get(i6).state)) {
                    int i7 = AudioAttributesImplApi26Parcelizer + 117;
                    AudioAttributesImplApi21Parcelizer = i7 % 128;
                    if (i7 % 2 == 0) {
                        this.foregroundNotificationUpdater.startPeriodicUpdates();
                        return;
                    } else {
                        this.foregroundNotificationUpdater.startPeriodicUpdates();
                        throw null;
                    }
                }
            }
        }
    }

    private void notifyDownloadChanged(Download download) {
        int i = 2 % 2;
        if (this.foregroundNotificationUpdater != null) {
            int i2 = AudioAttributesImplApi21Parcelizer + 117;
            AudioAttributesImplApi26Parcelizer = i2 % 128;
            if (i2 % 2 == 0) {
                needsStartedService(download.state);
                throw null;
            }
            if (needsStartedService(download.state)) {
                int i3 = AudioAttributesImplApi26Parcelizer + 13;
                AudioAttributesImplApi21Parcelizer = i3 % 128;
                int i4 = i3 % 2;
                this.foregroundNotificationUpdater.startPeriodicUpdates();
                return;
            }
            this.foregroundNotificationUpdater.invalidate();
        }
        int i5 = AudioAttributesImplApi21Parcelizer + 27;
        AudioAttributesImplApi26Parcelizer = i5 % 128;
        int i6 = i5 % 2;
    }

    private void notifyDownloadRemoved() {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi26Parcelizer + 1;
        AudioAttributesImplApi21Parcelizer = i2 % 128;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        ForegroundNotificationUpdater foregroundNotificationUpdater = this.foregroundNotificationUpdater;
        if (foregroundNotificationUpdater != null) {
            foregroundNotificationUpdater.invalidate();
        }
        int i3 = AudioAttributesImplApi26Parcelizer + 1;
        AudioAttributesImplApi21Parcelizer = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 25 / 0;
        }
    }

    private boolean isStopped() {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi26Parcelizer;
        int i3 = i2 + 43;
        AudioAttributesImplApi21Parcelizer = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.isStopped;
        int i5 = i2 + 43;
        AudioAttributesImplApi21Parcelizer = i5 % 128;
        if (i5 % 2 == 0) {
            return z;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private void onIdle() {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi26Parcelizer + 9;
        int i3 = i2 % 128;
        AudioAttributesImplApi21Parcelizer = i3;
        int i4 = i2 % 2;
        ForegroundNotificationUpdater foregroundNotificationUpdater = this.foregroundNotificationUpdater;
        if (foregroundNotificationUpdater != null) {
            int i5 = i3 + 77;
            AudioAttributesImplApi26Parcelizer = i5 % 128;
            if (i5 % 2 == 0) {
                foregroundNotificationUpdater.stopPeriodicUpdates();
                int i6 = 37 / 0;
            } else {
                foregroundNotificationUpdater.stopPeriodicUpdates();
            }
        }
        if (((DownloadManagerHelper) Assertions.checkNotNull(this.downloadManagerHelper)).updateScheduler()) {
            if (Util.SDK_INT < 28 && this.taskRemoved) {
                stopSelf();
                this.isStopped = true;
            } else {
                this.isStopped |= stopSelfResult(this.lastStartId);
            }
        }
    }

    private static Intent getIntent(Context context, Class<? extends DownloadService> cls, String str, boolean z) {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi21Parcelizer + 119;
        AudioAttributesImplApi26Parcelizer = i2 % 128;
        int i3 = i2 % 2;
        Intent intentPutExtra = getIntent(context, cls, str).putExtra(KEY_FOREGROUND, z);
        int i4 = AudioAttributesImplApi21Parcelizer + 87;
        AudioAttributesImplApi26Parcelizer = i4 % 128;
        int i5 = i4 % 2;
        return intentPutExtra;
    }

    private static Intent getIntent(Context context, Class<? extends DownloadService> cls, String str) {
        int i = 2 % 2;
        Intent action = new Intent(context, cls).setAction(str);
        int i2 = AudioAttributesImplApi26Parcelizer + 95;
        AudioAttributesImplApi21Parcelizer = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 2 / 0;
        }
        return action;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0023, code lost:
    
        r3.startService(r4);
        r3 = com.google.android.exoplayer2.offline.DownloadService.AudioAttributesImplApi21Parcelizer + 61;
        com.google.android.exoplayer2.offline.DownloadService.AudioAttributesImplApi26Parcelizer = r3 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002f, code lost:
    
        if ((r3 % 2) == 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0031, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0032, code lost:
    
        r3 = null;
        r3.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0036, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
    
        if (r5 != true) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (r5 != false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        r2 = r2 + 77;
        com.google.android.exoplayer2.offline.DownloadService.AudioAttributesImplApi26Parcelizer = r2 % 128;
        r2 = r2 % 2;
        com.google.android.exoplayer2.util.Util.startForegroundService(r3, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0022, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void startService(android.content.Context r3, android.content.Intent r4, boolean r5) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.google.android.exoplayer2.offline.DownloadService.AudioAttributesImplApi26Parcelizer
            int r1 = r1 + 5
            int r2 = r1 % 128
            com.google.android.exoplayer2.offline.DownloadService.AudioAttributesImplApi21Parcelizer = r2
            int r1 = r1 % r0
            if (r1 == 0) goto L16
            r1 = 55
            int r1 = r1 / 0
            r1 = 1
            if (r5 == r1) goto L18
            goto L23
        L16:
            if (r5 == 0) goto L23
        L18:
            int r2 = r2 + 77
            int r5 = r2 % 128
            com.google.android.exoplayer2.offline.DownloadService.AudioAttributesImplApi26Parcelizer = r5
            int r2 = r2 % r0
            com.google.android.exoplayer2.util.Util.startForegroundService(r3, r4)
            return
        L23:
            r3.startService(r4)
            int r3 = com.google.android.exoplayer2.offline.DownloadService.AudioAttributesImplApi21Parcelizer
            int r3 = r3 + 61
            int r4 = r3 % 128
            com.google.android.exoplayer2.offline.DownloadService.AudioAttributesImplApi26Parcelizer = r4
            int r3 = r3 % r0
            if (r3 == 0) goto L32
            return
        L32:
            r3 = 0
            r3.hashCode()
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.offline.DownloadService.startService(android.content.Context, android.content.Intent, boolean):void");
    }

    final class ForegroundNotificationUpdater {
        private final Handler handler = new Handler(Looper.getMainLooper());
        private boolean notificationDisplayed;
        private final int notificationId;
        private boolean periodicUpdatesStarted;
        private final long updateInterval;

        public ForegroundNotificationUpdater(int i, long j) {
            this.notificationId = i;
            this.updateInterval = j;
        }

        public final void startPeriodicUpdates() {
            this.periodicUpdatesStarted = true;
            update();
        }

        public final void stopPeriodicUpdates() {
            this.periodicUpdatesStarted = false;
            this.handler.removeCallbacksAndMessages(null);
        }

        public final void showNotificationIfNotAlready() {
            if (this.notificationDisplayed) {
                return;
            }
            update();
        }

        public final void invalidate() {
            if (this.notificationDisplayed) {
                update();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void update() {
            DownloadManager downloadManager = ((DownloadManagerHelper) Assertions.checkNotNull(DownloadService.access$200(DownloadService.this))).downloadManager;
            Notification foregroundNotification = DownloadService.this.getForegroundNotification(downloadManager.getCurrentDownloads(), downloadManager.getNotMetRequirements());
            if (!this.notificationDisplayed) {
                DownloadService.this.startForeground(this.notificationId, foregroundNotification);
                this.notificationDisplayed = true;
            } else {
                ((NotificationManager) DownloadService.this.getSystemService("notification")).notify(this.notificationId, foregroundNotification);
            }
            if (this.periodicUpdatesStarted) {
                this.handler.removeCallbacksAndMessages(null);
                this.handler.postDelayed(new Runnable() { // from class: com.google.android.exoplayer2.offline.DownloadService$ForegroundNotificationUpdater$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.update();
                    }
                }, this.updateInterval);
            }
        }
    }

    static final class DownloadManagerHelper implements DownloadManager.Listener {
        private final Context context;
        private final DownloadManager downloadManager;
        private DownloadService downloadService;
        private final boolean foregroundAllowed;
        private Requirements scheduledRequirements;
        private final Scheduler scheduler;
        private final Class<? extends DownloadService> serviceClass;

        private DownloadManagerHelper(Context context, DownloadManager downloadManager, boolean z, Scheduler scheduler, Class<? extends DownloadService> cls) {
            this.context = context;
            this.downloadManager = downloadManager;
            this.foregroundAllowed = z;
            this.scheduler = scheduler;
            this.serviceClass = cls;
            downloadManager.addListener(this);
            updateScheduler();
        }

        public final void attachService(final DownloadService downloadService) {
            Assertions.checkState(this.downloadService == null);
            this.downloadService = downloadService;
            if (this.downloadManager.isInitialized()) {
                Util.createHandlerForCurrentOrMainLooper().postAtFrontOfQueue(new Runnable() { // from class: com.google.android.exoplayer2.offline.DownloadService$DownloadManagerHelper$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.m97lambda$attachService$0$comgoogleandroidexoplayer2offlineDownloadService$DownloadManagerHelper(downloadService);
                    }
                });
            }
        }

        /* JADX INFO: renamed from: lambda$attachService$0$com-google-android-exoplayer2-offline-DownloadService$DownloadManagerHelper, reason: not valid java name */
        final /* synthetic */ void m97lambda$attachService$0$comgoogleandroidexoplayer2offlineDownloadService$DownloadManagerHelper(DownloadService downloadService) {
            DownloadService.access$300(downloadService, this.downloadManager.getCurrentDownloads());
        }

        public final void detachService(DownloadService downloadService) {
            Assertions.checkState(this.downloadService == downloadService);
            this.downloadService = null;
        }

        public final boolean updateScheduler() {
            boolean zIsWaitingForRequirements = this.downloadManager.isWaitingForRequirements();
            if (this.scheduler == null) {
                return !zIsWaitingForRequirements;
            }
            if (!zIsWaitingForRequirements) {
                cancelScheduler();
                return true;
            }
            Requirements requirements = this.downloadManager.getRequirements();
            if (!this.scheduler.getSupportedRequirements(requirements).equals(requirements)) {
                cancelScheduler();
                return false;
            }
            if (!schedulerNeedsUpdate(requirements)) {
                return true;
            }
            if (this.scheduler.schedule(requirements, this.context.getPackageName(), DownloadService.ACTION_RESTART)) {
                this.scheduledRequirements = requirements;
                return true;
            }
            Log.w(DownloadService.TAG, "Failed to schedule restart");
            cancelScheduler();
            return false;
        }

        @Override // com.google.android.exoplayer2.offline.DownloadManager.Listener
        public final void onInitialized(DownloadManager downloadManager) {
            DownloadService downloadService = this.downloadService;
            if (downloadService != null) {
                DownloadService.access$300(downloadService, downloadManager.getCurrentDownloads());
            }
        }

        @Override // com.google.android.exoplayer2.offline.DownloadManager.Listener
        public final void onDownloadChanged(DownloadManager downloadManager, Download download, Exception exc) {
            DownloadService downloadService = this.downloadService;
            if (downloadService != null) {
                DownloadService.access$400(downloadService, download);
            }
            if (serviceMayNeedRestart() && DownloadService.access$500(download.state)) {
                Log.w(DownloadService.TAG, "DownloadService wasn't running. Restarting.");
                restartService();
            }
        }

        @Override // com.google.android.exoplayer2.offline.DownloadManager.Listener
        public final void onDownloadRemoved(DownloadManager downloadManager, Download download) {
            DownloadService downloadService = this.downloadService;
            if (downloadService != null) {
                DownloadService.access$600(downloadService);
            }
        }

        @Override // com.google.android.exoplayer2.offline.DownloadManager.Listener
        public final void onIdle(DownloadManager downloadManager) {
            DownloadService downloadService = this.downloadService;
            if (downloadService != null) {
                DownloadService.access$700(downloadService);
            }
        }

        @Override // com.google.android.exoplayer2.offline.DownloadManager.Listener
        public final void onRequirementsStateChanged(DownloadManager downloadManager, Requirements requirements, int i) {
            updateScheduler();
        }

        @Override // com.google.android.exoplayer2.offline.DownloadManager.Listener
        public final void onWaitingForRequirementsChanged(DownloadManager downloadManager, boolean z) {
            if (z || downloadManager.getDownloadsPaused() || !serviceMayNeedRestart()) {
                return;
            }
            List<Download> currentDownloads = downloadManager.getCurrentDownloads();
            for (int i = 0; i < currentDownloads.size(); i++) {
                if (currentDownloads.get(i).state == 0) {
                    restartService();
                    return;
                }
            }
        }

        private boolean schedulerNeedsUpdate(Requirements requirements) {
            return !Util.areEqual(this.scheduledRequirements, requirements);
        }

        private void cancelScheduler() {
            Requirements requirements = new Requirements(0);
            if (schedulerNeedsUpdate(requirements)) {
                this.scheduler.cancel();
                this.scheduledRequirements = requirements;
            }
        }

        private boolean serviceMayNeedRestart() {
            DownloadService downloadService = this.downloadService;
            return downloadService == null || DownloadService.access$800(downloadService);
        }

        private void restartService() {
            if (this.foregroundAllowed) {
                try {
                    Util.startForegroundService(this.context, DownloadService.access$900(this.context, this.serviceClass, DownloadService.ACTION_RESTART));
                    return;
                } catch (IllegalStateException unused) {
                    Log.w(DownloadService.TAG, "Failed to restart (foreground launch restriction)");
                    return;
                }
            }
            try {
                this.context.startService(DownloadService.access$900(this.context, this.serviceClass, DownloadService.ACTION_INIT));
            } catch (IllegalStateException unused2) {
                Log.w(DownloadService.TAG, "Failed to restart (process is idle)");
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:140:0x0d95 A[Catch: all -> 0x0e56, TryCatch #9 {all -> 0x0e56, blocks: (B:138:0x0d81, B:140:0x0d95, B:141:0x0dc4), top: B:275:0x0d81, outer: #13 }] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0dd7 A[Catch: all -> 0x0e4c, TryCatch #5 {all -> 0x0e4c, blocks: (B:142:0x0dca, B:144:0x0dd7, B:145:0x0e44), top: B:267:0x0dca, outer: #13 }] */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0fbf  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x100e  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x1072  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x13fc  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x14d8  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x152a  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x1581  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x19e9  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x0d52 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:287:? A[RETURN, SYNTHETIC] */
    @Override // android.app.Service, android.content.ContextWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void attachBaseContext(android.content.Context r37) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 7216
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.offline.DownloadService.attachBaseContext(android.content.Context):void");
    }

    private static boolean needsStartedService(int i) {
        int i2 = 2 % 2;
        if (i == 2) {
            return true;
        }
        int i3 = AudioAttributesImplApi26Parcelizer + 23;
        int i4 = i3 % 128;
        AudioAttributesImplApi21Parcelizer = i4;
        if (i3 % 2 != 0) {
            if (i == 3) {
                return true;
            }
        } else if (i == 5) {
            return true;
        }
        int i5 = i4 + 121;
        int i6 = i5 % 128;
        AudioAttributesImplApi26Parcelizer = i6;
        if (i5 % 2 == 0) {
            if (i == 74) {
                return true;
            }
        } else if (i == 7) {
            return true;
        }
        int i7 = i6 + 33;
        AudioAttributesImplApi21Parcelizer = i7 % 128;
        int i8 = i7 % 2;
        int i9 = i6 + 13;
        AudioAttributesImplApi21Parcelizer = i9 % 128;
        if (i9 % 2 == 0) {
            return false;
        }
        throw null;
    }

    static void AudioAttributesCompatParcelizer() {
        write = 1000326321;
        AudioAttributesCompatParcelizer = 1335262354;
        read = -819363157;
        RemoteActionCompatParcelizer = 244541614;
        IconCompatParcelizer = new byte[]{-109, 15, 69, 91, -71, -107, -106, 101, 10, 12, -110, 3, 12, -110, -105, 4, 71, 90, 66, 9, 11, 9, 98, -106, 3, -88, 12, 71, 90, -68, 101, 15, 11, -107, -110, -107, 4, -106, 11, 70, 100, 0, -105, 9, -88, -77, -105, 15, 98, -71, 90, 12, 69, -107, TarConstants.LF_PAX_EXTENDED_HEADER_LC, 9, -106, -106, -67, 97, 14, TarConstants.LF_PAX_EXTENDED_HEADER_UC, 11, 90, -112, 7, -64, TarConstants.LF_DIR, 23, 61, -48, 25, 90, -113, 67, -51, -56, 24, 5, -63, -60, 0, 5, TarConstants.LF_CONTIG, -36, 12, 24, -54, -47, 117, 27, 61, 42, -62, 24, TarConstants.LF_CONTIG, 28, 61, 42, -56, -59, 68, -51, 60, 24, 23, 59, 26, 27, TarConstants.LF_BLK, 18, -128, 67, TarConstants.LF_CONTIG, 16, 5, -64, 25, 5, -55, -53, TarConstants.LF_FIFO, 25, -47, -50, 17, 15, -53, 26, -50, -54, 93, 77, 19, 74, 74, 28, -65, 13, -46, 61, -56, 0, -5, 43, 2, -34, 23, -34, 38, -6, -5, -35, 22, 9, -13, 0, -5, 15, 4, -60, 43, -33, 43, 8, -7, 13, -4, -7, -4, -46, 62, -4, 67, 58, 78, 23, 96, 78, 41, 34, 116, 62, TarConstants.LF_NORMAL, 78, 61, TarConstants.LF_SYMLINK, 58, 64, 68, 123, 39, 8, 43, 42, 127, 18, 13, 126, 113, 34, 46, 8, 38};
    }
}
