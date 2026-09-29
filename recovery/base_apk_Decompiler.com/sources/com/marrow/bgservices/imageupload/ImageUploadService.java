package com.marrow.bgservices.imageupload;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.os.Process;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Locale;
import kotlin.MergingMediaSourceIllegalMergeExceptionReason;
import kotlin.Metadata;
import kotlin.ProgressiveMediaExtractor;
import kotlin.getExtendedWestEuropeanChar;
import kotlin.getShowTimeoutMs;
import kotlin.isSpecialNorthAmericanChar;
import kotlin.isStopped;
import kotlin.needsStartedService;
import kotlin.setSdkPayload;
import kotlin.startForeground;
import kotlin.toMagicModuleMetaRepoModel;
import kotlin.toMagicModuleStatusUcModel;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0013\u0010\u0010J7\u0010\u0011\u001a\u00020\u00172\u0006\u0010\u0007\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0011\u0010\u0018J\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0005J\u001f\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0011\u0010\u0019R\"\u0010\u001b\u001a\u00020\u001a8\u0007@\u0007X\u0087.¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 "}, d2 = {"Lcom/marrow/bgservices/imageupload/ImageUploadService;", "Lcom/marrow/bgservices/BaseService;", "Lo/ProgressiveMediaExtractor$IconCompatParcelizer;", "Lo/ProgressiveMediaExtractor$AudioAttributesCompatParcelizer;", "<init>", "()V", "Landroid/content/Intent;", "p0", "", "p1", "p2", "onStartCommand", "(Landroid/content/Intent;II)I", "", "", "read", "(Ljava/lang/String;II)V", "RemoteActionCompatParcelizer", "(Ljava/lang/String;I)V", "IconCompatParcelizer", "p3", "", "p4", "Landroid/app/Notification;", "(Ljava/lang/String;IILjava/lang/String;Z)Landroid/app/Notification;", "(Ljava/lang/String;Ljava/lang/String;)V", "Landroid/app/NotificationManager;", "notificationManager", "Landroid/app/NotificationManager;", "getNotificationManager", "()Landroid/app/NotificationManager;", "setNotificationManager", "(Landroid/app/NotificationManager;)V"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ImageUploadService extends MergingMediaSourceIllegalMergeExceptionReason<ProgressiveMediaExtractor.IconCompatParcelizer> implements ProgressiveMediaExtractor.AudioAttributesCompatParcelizer {

    @setSdkPayload
    public NotificationManager notificationManager;
    private static final byte[] $$l = {18, -127, -77, -105};
    private static final int $$o = 201;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$p = {27, 74, 113, 65, -20, -9, -3, -6, 14, 35, -35, -18, 10, -7, 0, 42, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14, -13, 1, 62, -58, -9, -1, 7, -6, 6, TarConstants.LF_FIFO, -52, -14, 9, -15, 2, 5, 4, TarConstants.LF_DIR, -64, 11, -20, 14, -14, 8, 7, -12, 61, -71, 18, -2, -18, 68, -39, -14, -2, 21, -22, -25, 9, -7, 0, 79, -79, 12, 3, -4, -27, -13, 0, 42, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14};
    private static final int $$q = 87;
    private static final byte[] $$g = {TarConstants.LF_GNUTYPE_LONGNAME, 36, -23, -15, 12, 3, -4, -25, 0, -6, 7, 30, -49, 2, -9, 3, 13, -14, 46, -45, 1, -4, 14, -20, 42, -44, 14, -9, 26, -20, 1, -3, -5, -14, 16, -14, -27, -13, 0, 42, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14, -20, -9, -3, -6, 14, 35, -35, -18, 10, -7, 0, 42, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14, -25, 0, -6, 7, 30, -49, 2, -9, 3, 13, -14, 46, -45, 1, -4, 14, -20, TarConstants.LF_NORMAL, -51, 1, -2, 4, 1, 43, -35, -18, 10, -7, 0, 27, -20, -15, -3, 8, -9, 33, -20, 1, -3, -5, -14, 16, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, 0, -32, -18, -18, 14, -3, -8, 2, -18, 20, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, -5, -27, -18, -18, 14, -3, -8, 2, -18, 20, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 47, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14};
    private static final int $$h = 209;
    private static int AudioAttributesImplBaseParcelizer = 0;
    private static int MediaBrowserCompatItemReceiver = 1;
    private static char[] RemoteActionCompatParcelizer = {6429, 6520, 6410, 6400, 6407, 6473, 6406, 6430, 6424, 6401, 6411, 6426, 6408, 6428, 6465, 6481, 6416, 6471, 6403, 6417, 6491, 6490, 6425, 6431, 6404, 6478, 6470, 6476, 6474, 6402, 6525, 6405, 6469, 6475, 6427, 6477};
    private static char AudioAttributesCompatParcelizer = 11444;
    private static char write = 58879;
    private static char read = 51797;
    private static char IconCompatParcelizer = 56790;
    private static char AudioAttributesImplApi21Parcelizer = 35643;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$r(int r6, byte r7, int r8) {
        /*
            int r7 = r7 * 2
            int r7 = 4 - r7
            int r8 = r8 * 2
            int r8 = r8 + 122
            int r6 = r6 * 2
            int r6 = r6 + 1
            byte[] r0 = com.marrow.bgservices.imageupload.ImageUploadService.$$l
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r8
            r4 = r2
            r8 = r6
            goto L27
        L17:
            r3 = r2
        L18:
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            if (r4 != r6) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L25:
            r3 = r0[r7]
        L27:
            int r7 = r7 + 1
            int r8 = r8 + r3
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow.bgservices.imageupload.ImageUploadService.$$r(int, byte, int):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void k(short r7, short r8, byte r9, java.lang.Object[] r10) {
        /*
            int r8 = 190 - r8
            int r9 = r9 + 65
            int r7 = r7 + 4
            byte[] r0 = com.marrow.bgservices.imageupload.ImageUploadService.$$g
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L11
            r3 = r7
            r9 = r8
            r4 = r2
            goto L29
        L11:
            r3 = r2
        L12:
            int r4 = r3 + 1
            byte r5 = (byte) r9
            r1[r3] = r5
            int r8 = r8 + 1
            if (r4 != r7) goto L23
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L23:
            r3 = r0[r8]
            r6 = r9
            r9 = r8
            r8 = r3
            r3 = r6
        L29:
            int r8 = -r8
            int r3 = r3 + r8
            int r8 = r3 + (-1)
            r3 = r4
            r6 = r9
            r9 = r8
            r8 = r6
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow.bgservices.imageupload.ImageUploadService.k(short, short, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void l(int r6, byte r7, short r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 + 73
            int r0 = 47 - r6
            byte[] r1 = com.marrow.bgservices.imageupload.ImageUploadService.$$p
            int r8 = 77 - r8
            byte[] r0 = new byte[r0]
            int r6 = 46 - r6
            r2 = 0
            if (r1 != 0) goto L13
            r7 = r6
            r3 = r8
            r4 = r2
            goto L29
        L13:
            r3 = r2
        L14:
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r6) goto L21
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L21:
            int r3 = r3 + 1
            r4 = r1[r8]
            r5 = r3
            r3 = r8
            r8 = r4
            r4 = r5
        L29:
            int r8 = -r8
            int r3 = r3 + 1
            int r7 = r7 + r8
            int r7 = r7 + (-1)
            r8 = r3
            r3 = r4
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow.bgservices.imageupload.ImageUploadService.l(int, byte, short, java.lang.Object[]):void");
    }

    public final NotificationManager getNotificationManager() {
        int i = 2 % 2;
        int i2 = AudioAttributesImplBaseParcelizer + 93;
        MediaBrowserCompatItemReceiver = i2 % 128;
        int i3 = i2 % 2;
        NotificationManager notificationManager = this.notificationManager;
        if (notificationManager != null) {
            return notificationManager;
        }
        toMagicModuleMetaRepoModel.IconCompatParcelizer("");
        int i4 = AudioAttributesImplBaseParcelizer + 45;
        MediaBrowserCompatItemReceiver = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 34 / 0;
        }
        return null;
    }

    public final void setNotificationManager(NotificationManager notificationManager) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatItemReceiver + 87;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        if (i2 % 2 == 0) {
            toMagicModuleMetaRepoModel.write(notificationManager, "");
            this.notificationManager = notificationManager;
        } else {
            toMagicModuleMetaRepoModel.write(notificationManager, "");
            this.notificationManager = notificationManager;
            int i3 = 87 / 0;
        }
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent p0, int p1, int p2) {
        int i = 2 % 2;
        int i2 = AudioAttributesImplBaseParcelizer + 97;
        MediaBrowserCompatItemReceiver = i2 % 128;
        int i3 = i2 % 2;
        toMagicModuleMetaRepoModel.write(p0, "");
        super.onStartCommand(p0, p1, p2);
        startForeground(8, RemoteActionCompatParcelizer("Uploading ID Verification Images", 0, 1, "settings", true));
        ((ProgressiveMediaExtractor.IconCompatParcelizer) getPresenter()).IconCompatParcelizer(this);
        int i4 = MediaBrowserCompatItemReceiver + 67;
        AudioAttributesImplBaseParcelizer = i4 % 128;
        int i5 = i4 % 2;
        return 3;
    }

    @Override // o.ProgressiveMediaExtractor.AudioAttributesCompatParcelizer
    public final void read(String p0, int p1, int p2) {
        Notification notificationRemoteActionCompatParcelizer;
        NotificationManager notificationManager;
        int i;
        int i2 = 2 % 2;
        int i3 = MediaBrowserCompatItemReceiver + 23;
        AudioAttributesImplBaseParcelizer = i3 % 128;
        if (i3 % 2 != 0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            notificationRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(p0, p1, p2, "settings", false);
            notificationManager = getNotificationManager();
            i = 90;
        } else {
            toMagicModuleMetaRepoModel.write(p0, "");
            notificationRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(p0, p1 + 1, p2, "settings", false);
            notificationManager = getNotificationManager();
            i = 8;
        }
        notificationManager.notify(i, notificationRemoteActionCompatParcelizer);
    }

    @Override // o.ProgressiveMediaExtractor.AudioAttributesCompatParcelizer
    public final void RemoteActionCompatParcelizer(String p0, int p1) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatItemReceiver + 125;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        int i3 = i2 % 2;
        toMagicModuleMetaRepoModel.write(p0, "");
        getNotificationManager().notify(6, RemoteActionCompatParcelizer(p0, p1, p1, "settings", true));
        int i4 = AudioAttributesImplBaseParcelizer + 25;
        MediaBrowserCompatItemReceiver = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // o.ProgressiveMediaExtractor.AudioAttributesCompatParcelizer
    public final void IconCompatParcelizer(String p0, int p1, int p2) {
        Notification notificationRemoteActionCompatParcelizer;
        NotificationManager notificationManager;
        int i;
        int i2 = 2 % 2;
        int i3 = MediaBrowserCompatItemReceiver + 55;
        AudioAttributesImplBaseParcelizer = i3 % 128;
        if (i3 % 2 != 0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            notificationRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(p0, p1, p2, "kyc", false);
            notificationManager = getNotificationManager();
            i = 71;
        } else {
            toMagicModuleMetaRepoModel.write(p0, "");
            notificationRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(p0, p1, p2, "kyc", true);
            notificationManager = getNotificationManager();
            i = 6;
        }
        notificationManager.notify(i, notificationRemoteActionCompatParcelizer);
    }

    private final Notification RemoteActionCompatParcelizer(String p0, int p1, int p2, String p3, boolean p4) {
        int i;
        int i2 = 2 % 2;
        int i3 = MediaBrowserCompatItemReceiver + 1;
        AudioAttributesImplBaseParcelizer = i3 % 128;
        int i4 = i3 % 2;
        int i5 = p1 - 1;
        toMagicModuleStatusUcModel tomagicmodulestatusucmodel = toMagicModuleStatusUcModel.INSTANCE;
        String str = String.format(Locale.getDefault(), "Uploading : (%d/%d)", Arrays.copyOf(new Object[]{Integer.valueOf(p1), Integer.valueOf(p2)}, 2));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str, "");
        toMagicModuleStatusUcModel tomagicmodulestatusucmodel2 = toMagicModuleStatusUcModel.INSTANCE;
        String str2 = String.format(Locale.getDefault(), "Uploaded : (%d/%d)", Arrays.copyOf(new Object[]{Integer.valueOf(p1), Integer.valueOf(p2)}, 2));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str2, "");
        float f = i5 == 0 ? BitmapDescriptorFactory.HUE_RED : i5 / p2;
        if (p4) {
            i = 100;
        } else {
            int i6 = MediaBrowserCompatItemReceiver + 39;
            AudioAttributesImplBaseParcelizer = i6 % 128;
            i = (int) (i6 % 2 != 0 ? f + 100.0f : f * 100.0f);
        }
        getExtendedWestEuropeanChar getextendedwesteuropeancharIconCompatParcelizer = new getExtendedWestEuropeanChar(this, "notification_upload", "Image Upload Notifications. Eg: ID Verification Image upload").IconCompatParcelizer(p3);
        boolean z = !p4;
        getExtendedWestEuropeanChar getextendedwesteuropeancharRemoteActionCompatParcelizer = getextendedwesteuropeancharIconCompatParcelizer.RemoteActionCompatParcelizer(z);
        if (!p4) {
            getextendedwesteuropeancharRemoteActionCompatParcelizer.IconCompatParcelizer(i);
        }
        getExtendedWestEuropeanChar getextendedwesteuropeancharWrite = getextendedwesteuropeancharRemoteActionCompatParcelizer.write(z);
        if (p4) {
            str = str2;
        }
        getextendedwesteuropeancharWrite.write(str).read(p0);
        Notification notificationRemoteActionCompatParcelizer = getextendedwesteuropeancharRemoteActionCompatParcelizer.write().RemoteActionCompatParcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(notificationRemoteActionCompatParcelizer, "");
        return notificationRemoteActionCompatParcelizer;
    }

    private static void j(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2;
        String str;
        int i3 = 2;
        int i4 = 2 % 2;
        isStopped isstopped = new isStopped();
        char[] cArr2 = new char[cArr.length];
        isstopped.read = 0;
        char[] cArr3 = new char[2];
        int i5 = $10 + 65;
        $11 = i5 % 128;
        int i6 = i5 % 2;
        while (isstopped.read < cArr.length) {
            int i7 = $11 + 61;
            $10 = i7 % 128;
            int i8 = 58224;
            if (i7 % i3 != 0) {
                cArr3[0] = cArr[isstopped.read];
                cArr3[1] = cArr[isstopped.read + 1];
            } else {
                cArr3[0] = cArr[isstopped.read];
                cArr3[1] = cArr[isstopped.read + 1];
            }
            int i9 = 0;
            while (i9 < 16) {
                char c = cArr3[1];
                char c2 = cArr3[0];
                int i10 = (c2 + i8) ^ ((c2 << 4) + ((char) (((long) IconCompatParcelizer) ^ 1193402106669854891L)));
                int i11 = c2 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(AudioAttributesImplApi21Parcelizer);
                    objArr2[i3] = Integer.valueOf(i11);
                    objArr2[1] = Integer.valueOf(i10);
                    objArr2[0] = Integer.valueOf(c);
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(815477582);
                    if (objRemoteActionCompatParcelizer == null) {
                        str = "";
                        byte b = (byte) 0;
                        byte b2 = b;
                        objRemoteActionCompatParcelizer = startForeground.read((char) (ViewConfiguration.getFadingEdgeLength() >> 16), 1504 - TextUtils.indexOf(str, str), 21 - (ViewConfiguration.getJumpTapTimeout() >> 16), 1322448859, false, $$r(b, b2, b2), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    } else {
                        str = "";
                    }
                    char cCharValue = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    Object[] objArr3 = {Integer.valueOf(cArr3[0]), Integer.valueOf((cCharValue + i8) ^ ((cCharValue << 4) + ((char) (((long) write) ^ 1193402106669854891L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(read)};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(815477582);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), 1503 - Process.getGidForName(str), 21 - (TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), 1322448859, false, $$r(b3, b4, b4), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[0] = ((Character) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).charValue();
                    i8 -= 40503;
                    i9++;
                    int i12 = $10 + 59;
                    $11 = i12 % 128;
                    int i13 = i12 % 2;
                    i3 = 2;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2[isstopped.read] = cArr3[0];
            cArr2[isstopped.read + 1] = cArr3[1];
            Object[] objArr4 = {isstopped, isstopped};
            Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-167774474);
            if (objRemoteActionCompatParcelizer3 == null) {
                i2 = 2;
                objRemoteActionCompatParcelizer3 = startForeground.read((char) KeyEvent.normalizeMetaState(0), 9016 - View.resolveSizeAndState(0, 0, 0), 57 - TextUtils.lastIndexOf("", '0', 0, 0), -1950993821, false, "D", new Class[]{Object.class, Object.class});
            } else {
                i2 = 2;
            }
            ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
            i3 = i2;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    @Override // o.ProgressiveMediaExtractor.AudioAttributesCompatParcelizer
    public final void read() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatItemReceiver + 109;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        int i3 = i2 % 2;
        stopForeground(true);
        stopSelf();
        int i4 = MediaBrowserCompatItemReceiver + 3;
        AudioAttributesImplBaseParcelizer = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.ProgressiveMediaExtractor.AudioAttributesCompatParcelizer
    public final void RemoteActionCompatParcelizer(String p0, String p1) {
        int i = 2 % 2;
        int i2 = AudioAttributesImplBaseParcelizer + 35;
        MediaBrowserCompatItemReceiver = i2 % 128;
        if (i2 % 2 != 0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            toMagicModuleMetaRepoModel.write(p1, "");
            isSpecialNorthAmericanChar.Companion companion = isSpecialNorthAmericanChar.INSTANCE;
            getShowTimeoutMs.write(this, isSpecialNorthAmericanChar.Companion.RemoteActionCompatParcelizer(p0, p1));
            return;
        }
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        isSpecialNorthAmericanChar.Companion companion2 = isSpecialNorthAmericanChar.INSTANCE;
        getShowTimeoutMs.write(this, isSpecialNorthAmericanChar.Companion.RemoteActionCompatParcelizer(p0, p1));
        throw null;
    }

    private static void i(byte b, int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2;
        Object obj;
        int i3 = 2 % 2;
        needsStartedService needsstartedservice = new needsStartedService();
        char[] cArr2 = RemoteActionCompatParcelizer;
        Object obj2 = null;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            for (int i4 = 0; i4 < length; i4++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i4])};
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1527982763);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) TextUtils.indexOf("", "", 0, 0), Color.red(0) + 7015, TextUtils.getOffsetBefore("", 0) + 30, -626716224, false, "o", new Class[]{Integer.TYPE});
                    }
                    cArr3[i4] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr3;
        }
        Object[] objArr3 = {Integer.valueOf(AudioAttributesCompatParcelizer)};
        Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-1527982763);
        if (objRemoteActionCompatParcelizer2 == null) {
            objRemoteActionCompatParcelizer2 = startForeground.read((char) ((-1) - ExpandableListView.getPackedPositionChild(0L)), 7014 - ImageFormat.getBitsPerPixel(0), (ViewConfiguration.getTouchSlop() >> 8) + 30, -626716224, false, "o", new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).charValue();
        char[] cArr4 = new char[i];
        if (i % 2 != 0) {
            int i5 = $10 + 69;
            $11 = i5 % 128;
            if (i5 % 2 == 0) {
                i2 = i + 43;
                cArr4[i2] = (char) (cArr[i2] % b);
            } else {
                i2 = i - 1;
                cArr4[i2] = (char) (cArr[i2] - b);
            }
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            needsstartedservice.AudioAttributesCompatParcelizer = 0;
            while (needsstartedservice.AudioAttributesCompatParcelizer < i2) {
                needsstartedservice.write = cArr[needsstartedservice.AudioAttributesCompatParcelizer];
                needsstartedservice.RemoteActionCompatParcelizer = cArr[needsstartedservice.AudioAttributesCompatParcelizer + 1];
                if (needsstartedservice.write == needsstartedservice.RemoteActionCompatParcelizer) {
                    int i6 = $10 + 89;
                    $11 = i6 % 128;
                    if (i6 % 2 == 0) {
                        cArr4[needsstartedservice.AudioAttributesCompatParcelizer] = (char) (needsstartedservice.write * b);
                        cArr4[needsstartedservice.AudioAttributesCompatParcelizer % 1] = (char) (needsstartedservice.RemoteActionCompatParcelizer * b);
                    } else {
                        cArr4[needsstartedservice.AudioAttributesCompatParcelizer] = (char) (needsstartedservice.write - b);
                        cArr4[needsstartedservice.AudioAttributesCompatParcelizer + 1] = (char) (needsstartedservice.RemoteActionCompatParcelizer - b);
                    }
                    obj = obj2;
                } else {
                    Object[] objArr4 = {needsstartedservice, needsstartedservice, Integer.valueOf(cCharValue), needsstartedservice, needsstartedservice, Integer.valueOf(cCharValue), needsstartedservice, needsstartedservice, Integer.valueOf(cCharValue), needsstartedservice, needsstartedservice, Integer.valueOf(cCharValue), needsstartedservice};
                    Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(105000849);
                    if (objRemoteActionCompatParcelizer3 == null) {
                        objRemoteActionCompatParcelizer3 = startForeground.read((char) (AndroidCharacter.getMirror('0') + 48146), 20126 - ExpandableListView.getPackedPositionType(0L), 20 - (KeyEvent.getMaxKeyCode() >> 16), 2014046980, false, "n", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                    }
                    if (((Integer) ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4)).intValue() == needsstartedservice.AudioAttributesImplBaseParcelizer) {
                        int i7 = $10 + 85;
                        $11 = i7 % 128;
                        int i8 = i7 % 2;
                        Object[] objArr5 = {needsstartedservice, needsstartedservice, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), needsstartedservice, needsstartedservice, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), needsstartedservice, Integer.valueOf(cCharValue), needsstartedservice};
                        Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(50135433);
                        if (objRemoteActionCompatParcelizer4 == null) {
                            objRemoteActionCompatParcelizer4 = startForeground.read((char) View.MeasureSpec.makeMeasureSpec(0, 0), ((Process.getThreadPriority(0) + 20) >> 6) + 19368, 18 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 2092221724, false, "k", new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                        }
                        obj = null;
                        int iIntValue = ((Integer) ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5)).intValue();
                        int i9 = (needsstartedservice.read * cCharValue) + needsstartedservice.AudioAttributesImplBaseParcelizer;
                        cArr4[needsstartedservice.AudioAttributesCompatParcelizer] = cArr2[iIntValue];
                        cArr4[needsstartedservice.AudioAttributesCompatParcelizer + 1] = cArr2[i9];
                    } else {
                        obj = null;
                        if (needsstartedservice.IconCompatParcelizer == needsstartedservice.read) {
                            needsstartedservice.MediaBrowserCompatItemReceiver = ((needsstartedservice.MediaBrowserCompatItemReceiver + cCharValue) - 1) % cCharValue;
                            needsstartedservice.AudioAttributesImplBaseParcelizer = ((needsstartedservice.AudioAttributesImplBaseParcelizer + cCharValue) - 1) % cCharValue;
                            int i10 = (needsstartedservice.IconCompatParcelizer * cCharValue) + needsstartedservice.MediaBrowserCompatItemReceiver;
                            int i11 = (needsstartedservice.read * cCharValue) + needsstartedservice.AudioAttributesImplBaseParcelizer;
                            cArr4[needsstartedservice.AudioAttributesCompatParcelizer] = cArr2[i10];
                            cArr4[needsstartedservice.AudioAttributesCompatParcelizer + 1] = cArr2[i11];
                        } else {
                            int i12 = (needsstartedservice.IconCompatParcelizer * cCharValue) + needsstartedservice.AudioAttributesImplBaseParcelizer;
                            int i13 = (needsstartedservice.read * cCharValue) + needsstartedservice.MediaBrowserCompatItemReceiver;
                            cArr4[needsstartedservice.AudioAttributesCompatParcelizer] = cArr2[i12];
                            cArr4[needsstartedservice.AudioAttributesCompatParcelizer + 1] = cArr2[i13];
                        }
                    }
                }
                needsstartedservice.AudioAttributesCompatParcelizer += 2;
                obj2 = obj;
            }
        }
        for (int i14 = 0; i14 < i; i14++) {
            cArr4[i14] = (char) (cArr4[i14] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }

    /* JADX WARN: Removed duplicated region for block: B:129:0x0885 A[Catch: all -> 0x0300, TryCatch #0 {all -> 0x0300, blocks: (B:209:0x0e72, B:211:0x0e78, B:212:0x0ea3, B:245:0x1276, B:247:0x127c, B:248:0x12a7, B:226:0x1058, B:228:0x107b, B:229:0x10cf, B:176:0x0aa8, B:178:0x0aae, B:179:0x0adf, B:127:0x087f, B:129:0x0885, B:130:0x08b1, B:19:0x0101, B:21:0x0107, B:22:0x0131, B:24:0x026a, B:26:0x029b, B:27:0x02fa, B:135:0x0948, B:139:0x0958, B:142:0x0966, B:146:0x0972, B:162:0x0a4b, B:164:0x0a51, B:165:0x0a52, B:167:0x0a54, B:169:0x0a5b, B:170:0x0a5c), top: B:270:0x0101, inners: #13 }] */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0993 A[Catch: all -> 0x0a53, TryCatch #9 {all -> 0x0a53, blocks: (B:151:0x097e, B:153:0x0993, B:154:0x09c4), top: B:286:0x097e, outer: #13 }] */
    /* JADX WARN: Removed duplicated region for block: B:157:0x09d7 A[Catch: all -> 0x0a49, TryCatch #4 {all -> 0x0a49, blocks: (B:155:0x09ca, B:157:0x09d7, B:158:0x0a41), top: B:277:0x09ca, outer: #13 }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0b78  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0bc7  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0c1d  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0e50  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0f3c  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0f89  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0fe4  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x1254  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x0948 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:305:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x00d7  */
    @Override // kotlin.MergingMediaSourceIllegalMergeExceptionReason, com.marrow.bgservices.BaseService, android.app.Service, android.content.ContextWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void attachBaseContext(android.content.Context r33) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 5590
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow.bgservices.imageupload.ImageUploadService.attachBaseContext(android.content.Context):void");
    }

    @Override // kotlin.MergingMediaSourceIllegalMergeExceptionReason, com.marrow.bgservices.BaseService, android.app.Service
    public final void onCreate() {
        int i = 2 % 2;
        int i2 = AudioAttributesImplBaseParcelizer + 95;
        MediaBrowserCompatItemReceiver = i2 % 128;
        int i3 = i2 % 2;
        super.onCreate();
        if (i3 == 0) {
            int i4 = 32 / 0;
        }
    }
}
