package com.marrow2.ui.settings.kyc.upload.service;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Intent;
import android.graphics.Color;
import android.media.AudioTrack;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow2.ui.settings.kyc.upload.service.ImageUploadService;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import kotlin.CmcdHeadersFactoryCmcdObjectBuilder;
import kotlin.DownloadService;
import kotlin.MagicModuleSubmissionRequestBody;
import kotlin.MapFragment;
import kotlin.Metadata;
import kotlin.SampleVideos;
import kotlin.UtilExternalSyntheticLambda1;
import kotlin.getAnswerMap;
import kotlin.getExtendedWestEuropeanChar;
import kotlin.getInternalName;
import kotlin.getMagicModuleStats;
import kotlin.getShowPopup;
import kotlin.getShowTimeoutMs;
import kotlin.getTotalMcq;
import kotlin.isSpecialNorthAmericanChar;
import kotlin.notifyDownloadChanged;
import kotlin.setSdkPayload;
import kotlin.skipShortTermReferencePictureSets;
import kotlin.startForeground;
import kotlin.toMagicModuleMetaRepoModel;
import kotlin.toMagicModuleStatusUcModel;
import kotlin.unescapeStream;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\t\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\u0003J\u0017\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0010\u0010\u0003J\u001e\u0010\u0013\u001a\u00020\r2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0082@¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u0003J\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00152\u0006\u0010\u0007\u001a\u00020\u0015¢\u0006\u0004\b\f\u0010\u0016J%\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00152\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\u0013\u0010\u0017J\u001f\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00152\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\u0018J'\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00152\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0019\u0010\u0017J7\u0010\f\u001a\u00020\u001c2\u0006\u0010\u0005\u001a\u00020\u00152\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\rH\u0002¢\u0006\u0004\b\f\u0010\u001dR\"\u0010\u001f\u001a\u00020\u001e8\u0007@\u0007X\u0087.¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\"\u0010&\u001a\u00020%8\u0007@\u0007X\u0087.¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+"}, d2 = {"Lcom/marrow2/ui/settings/kyc/upload/service/ImageUploadService;", "Lo/trimByVisibility;", "<init>", "()V", "Landroid/content/Intent;", "p0", "", "p1", "p2", "onStartCommand", "(Landroid/content/Intent;II)I", "", "read", "", "AudioAttributesCompatParcelizer", "(Z)V", "write", "", "Lo/unescapeStream;", "IconCompatParcelizer", "(Ljava/util/List;Lo/SampleVideos;)Ljava/lang/Object;", "", "(Ljava/lang/String;Ljava/lang/String;)V", "(Ljava/lang/String;II)V", "(Ljava/lang/String;I)V", "RemoteActionCompatParcelizer", "p3", "p4", "Landroid/app/Notification;", "(Ljava/lang/String;IILjava/lang/String;Z)Landroid/app/Notification;", "Lo/skipShortTermReferencePictureSets;", "kycUseCase", "Lo/skipShortTermReferencePictureSets;", "getKycUseCase", "()Lo/skipShortTermReferencePictureSets;", "setKycUseCase", "(Lo/skipShortTermReferencePictureSets;)V", "Landroid/app/NotificationManager;", "notificationManager", "Landroid/app/NotificationManager;", "getNotificationManager", "()Landroid/app/NotificationManager;", "setNotificationManager", "(Landroid/app/NotificationManager;)V"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ImageUploadService extends MapFragment {
    private static char[] AudioAttributesCompatParcelizer;
    private static int MediaBrowserCompatItemReceiver;
    private static long read;
    private static long write;

    @setSdkPayload
    public skipShortTermReferencePictureSets kycUseCase;

    @setSdkPayload
    public NotificationManager notificationManager;
    private static final byte[] $$l = {124, -87, 60, -63};
    private static final int $$m = 235;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$j = {36, 0, 10, -55, -17, -6, 0, -3, 17, 38, -32, -15, 13, -4, 3, 45, -42, 4, -1, 17, -17, 38, -15, -15, 17, 0, -5, 5, -15, 23, -11, 67, -55, 4, -13, TarConstants.LF_SYMLINK, -35, 7, 20, -17, 37, -49, 17, 2, 3, -11, 80, -81, 7, 11, -9, 17, -50, 19, -3, -4, TarConstants.LF_NORMAL, -49, 2, 4, 11, 9, -17, 3, 17, -12, TarConstants.LF_SYMLINK, -42, 4, -1, 17, -17, 38, -15, -15, 17, 0, -5, 5, -15, 23, -11};
    private static final int $$k = 162;
    private static final byte[] $$d = {61, 46, 102, -127, -20, -9, -3, -6, 14, 35, -35, -18, 10, -7, 0, 42, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14, 12, 3, -4, -25, 0, -6, 7, 30, -49, 2, -9, 3, 13, -14, 46, -45, 1, -4, 14, -20, 42, -44, 14, -9, 26, -20, 1, -3, -5, -14, 16, -14, -27, -13, 0, 42, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14, -25, 0, -6, 7, 30, -49, 2, -9, 3, 13, -14, 46, -45, 1, -4, 14, -20, TarConstants.LF_NORMAL, -51, 1, -2, 4, 1, 43, -35, -18, 10, -7, 0, 27, -20, -15, -3, 8, -9, 33, -20, 1, -3, -5, -14, 16, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, 0, -32, -18, -18, 14, -3, -8, 2, -18, 20, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, -5, -27, -18, -18, 14, -3, -8, 2, -18, 20, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 47, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14};
    private static final int $$e = 89;
    private static int AudioAttributesImplApi21Parcelizer = 0;
    private static int RemoteActionCompatParcelizer = 0;
    private static int AudioAttributesImplApi26Parcelizer = 1;

    static final class read extends getTotalMcq {
        int AudioAttributesCompatParcelizer;
        Object AudioAttributesImplApi21Parcelizer;
        Object AudioAttributesImplApi26Parcelizer;
        Object AudioAttributesImplBaseParcelizer;
        int IconCompatParcelizer;
        Object MediaBrowserCompatCustomActionResultReceiver;
        Object MediaBrowserCompatItemReceiver;
        int MediaBrowserCompatMediaItem;
        Object MediaMetadataCompat;
        /* synthetic */ Object RatingCompat;
        int RemoteActionCompatParcelizer;
        int read;
        int write;

        read(SampleVideos<? super read> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.RatingCompat = obj;
            this.MediaBrowserCompatMediaItem |= Integer.MIN_VALUE;
            return ImageUploadService.read(ImageUploadService.this, (List) null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$n(int r6, int r7, byte r8) {
        /*
            byte[] r0 = com.marrow2.ui.settings.kyc.upload.service.ImageUploadService.$$l
            int r7 = r7 + 4
            int r6 = r6 * 2
            int r6 = 121 - r6
            int r8 = r8 * 2
            int r1 = 1 - r8
            byte[] r1 = new byte[r1]
            r2 = 0
            int r8 = 0 - r8
            if (r0 != 0) goto L17
            r3 = r7
            r6 = r8
            r4 = r2
            goto L2c
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r7 = r7 + 1
            int r4 = r3 + 1
            if (r3 != r8) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L27:
            r3 = r0[r7]
            r5 = r3
            r3 = r7
            r7 = r5
        L2c:
            int r6 = r6 + r7
            r7 = r3
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.settings.kyc.upload.service.ImageUploadService.$$n(int, int, byte):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void g(short r7, int r8, short r9, java.lang.Object[] r10) {
        /*
            byte[] r0 = com.marrow2.ui.settings.kyc.upload.service.ImageUploadService.$$d
            int r9 = r9 + 65
            int r8 = 190 - r8
            int r7 = r7 + 4
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
        throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.settings.kyc.upload.service.ImageUploadService.g(short, int, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void h(short r7, byte r8, byte r9, java.lang.Object[] r10) {
        /*
            int r7 = 111 - r7
            int r8 = r8 * 3
            int r8 = 31 - r8
            int r9 = r9 * 3
            int r9 = r9 + 4
            byte[] r0 = com.marrow2.ui.settings.kyc.upload.service.ImageUploadService.$$j
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r9
            r5 = r2
            goto L29
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r7
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r8) goto L24
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L24:
            r3 = r0[r9]
            r6 = r3
            r3 = r9
            r9 = r6
        L29:
            int r9 = -r9
            int r7 = r7 + r9
            int r9 = r3 + 1
            int r7 = r7 + 2
            r3 = r5
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.settings.kyc.upload.service.ImageUploadService.h(short, byte, byte, java.lang.Object[]):void");
    }

    public static /* synthetic */ Object read(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) {
        int i7 = ~i;
        int i8 = ~i3;
        int i9 = ~(i7 | i8);
        int i10 = ~(i4 | i3);
        int i11 = i9 | i10;
        int i12 = ~i4;
        int i13 = i9 | (~(i12 | i)) | i10;
        int i14 = (~(i3 | i4 | i)) | (~(i7 | i12 | i8));
        int i15 = i4 + i + i5 + (1322235619 * i6) + (440487356 * i2);
        int i16 = i15 * i15;
        int i17 = (((-1102165783) * i4) - 2100690944) + ((-281430247) * i) + ((-820735536) * i11) + (i13 * 410367768) + (410367768 * i14) + ((-691798016) * i5) + ((-942931968) * i6) + ((-1410334720) * i2) + (1251606528 * i16);
        int i18 = (i4 * 157034417) + 1376579869 + (i * 157036385) + (i11 * (-1968)) + (i13 * 984) + (i14 * 984) + (i5 * 157035401) + (i6 * (-982187909)) + (i2 * (-1869533796)) + (i16 * (-899022848));
        int i19 = i17 + (i18 * i18 * (-511311872));
        if (i19 == 1) {
            return write(objArr);
        }
        if (i19 != 2) {
            return read(objArr);
        }
        ImageUploadService imageUploadService = (ImageUploadService) objArr[0];
        String str = (String) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i20 = 2 % 2;
        int i21 = AudioAttributesImplApi26Parcelizer + 121;
        RemoteActionCompatParcelizer = i21 % 128;
        int i22 = i21 % 2;
        imageUploadService.getNotificationManager().notify(6, imageUploadService.read(str, iIntValue, iIntValue, "settings", true));
        int i23 = AudioAttributesImplApi26Parcelizer + 7;
        RemoteActionCompatParcelizer = i23 % 128;
        int i24 = i23 % 2;
        return null;
    }

    public static final /* synthetic */ Object read(ImageUploadService imageUploadService, List list, SampleVideos sampleVideos) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 33;
        AudioAttributesImplApi26Parcelizer = i2 % 128;
        int i3 = i2 % 2;
        Object objIconCompatParcelizer = imageUploadService.IconCompatParcelizer((List<unescapeStream>) list, (SampleVideos<? super Boolean>) sampleVideos);
        int i4 = RemoteActionCompatParcelizer + 81;
        AudioAttributesImplApi26Parcelizer = i4 % 128;
        if (i4 % 2 != 0) {
            return objIconCompatParcelizer;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object read(Object[] objArr) {
        ImageUploadService imageUploadService = (ImageUploadService) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 59;
        AudioAttributesImplApi26Parcelizer = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr2 = {imageUploadService, Boolean.valueOf(zBooleanValue)};
        read(103244679, UtilExternalSyntheticLambda1.AudioAttributesCompatParcelizer(), UtilExternalSyntheticLambda1.AudioAttributesCompatParcelizer(), objArr2, -103244678, UtilExternalSyntheticLambda1.AudioAttributesCompatParcelizer(), UtilExternalSyntheticLambda1.AudioAttributesCompatParcelizer());
        int i4 = AudioAttributesImplApi26Parcelizer + 79;
        RemoteActionCompatParcelizer = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 81 / 0;
        }
        return null;
    }

    public final skipShortTermReferencePictureSets getKycUseCase() {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi26Parcelizer + 69;
        RemoteActionCompatParcelizer = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        skipShortTermReferencePictureSets skipshorttermreferencepicturesets = this.kycUseCase;
        if (skipshorttermreferencepicturesets != null) {
            return skipshorttermreferencepicturesets;
        }
        toMagicModuleMetaRepoModel.IconCompatParcelizer("");
        int i3 = RemoteActionCompatParcelizer + 105;
        AudioAttributesImplApi26Parcelizer = i3 % 128;
        int i4 = i3 % 2;
        return null;
    }

    public final void setKycUseCase(skipShortTermReferencePictureSets skipshorttermreferencepicturesets) {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi26Parcelizer + 7;
        RemoteActionCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        toMagicModuleMetaRepoModel.write(skipshorttermreferencepicturesets, "");
        this.kycUseCase = skipshorttermreferencepicturesets;
        int i4 = AudioAttributesImplApi26Parcelizer + 13;
        RemoteActionCompatParcelizer = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 60 / 0;
        }
    }

    public final NotificationManager getNotificationManager() {
        int i = 2 % 2;
        NotificationManager notificationManager = this.notificationManager;
        if (notificationManager == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            return null;
        }
        int i2 = RemoteActionCompatParcelizer + 101;
        int i3 = i2 % 128;
        AudioAttributesImplApi26Parcelizer = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 65;
        RemoteActionCompatParcelizer = i5 % 128;
        int i6 = i5 % 2;
        return notificationManager;
    }

    public final void setNotificationManager(NotificationManager notificationManager) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 115;
        AudioAttributesImplApi26Parcelizer = i2 % 128;
        if (i2 % 2 == 0) {
            toMagicModuleMetaRepoModel.write(notificationManager, "");
            this.notificationManager = notificationManager;
            int i3 = 55 / 0;
        } else {
            toMagicModuleMetaRepoModel.write(notificationManager, "");
            this.notificationManager = notificationManager;
        }
        int i4 = AudioAttributesImplApi26Parcelizer + 113;
        RemoteActionCompatParcelizer = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 84 / 0;
        }
    }

    static final class write extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private Object IconCompatParcelizer;
        private int read;

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0042, code lost:
        
            if (r8 == r0) goto L17;
         */
        @Override // kotlin.getMonthName
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = kotlin.getYear.IconCompatParcelizer()
                int r1 = r7.read
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                kotlin.SdkPayloadData.IconCompatParcelizer(r8)
                goto L45
            L12:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L1a:
                kotlin.SdkPayloadData.IconCompatParcelizer(r8)
                goto L32
            L1e:
                kotlin.SdkPayloadData.IconCompatParcelizer(r8)
                com.marrow2.ui.settings.kyc.upload.service.ImageUploadService r8 = com.marrow2.ui.settings.kyc.upload.service.ImageUploadService.this
                o.skipShortTermReferencePictureSets r8 = r8.getKycUseCase()
                r1 = r7
                o.SampleVideos r1 = (kotlin.SampleVideos) r1
                r7.read = r3
                java.lang.Object r8 = r8.write(r3, r1)
                if (r8 == r0) goto L71
            L32:
                java.util.List r8 = (java.util.List) r8
                com.marrow2.ui.settings.kyc.upload.service.ImageUploadService r1 = com.marrow2.ui.settings.kyc.upload.service.ImageUploadService.this
                r3 = r7
                o.SampleVideos r3 = (kotlin.SampleVideos) r3
                r4 = 0
                r7.IconCompatParcelizer = r4
                r7.read = r2
                java.lang.Object r8 = com.marrow2.ui.settings.kyc.upload.service.ImageUploadService.read(r1, r8, r3)
                if (r8 != r0) goto L45
                goto L71
            L45:
                java.lang.Boolean r8 = (java.lang.Boolean) r8
                boolean r8 = r8.booleanValue()
                com.marrow2.ui.settings.kyc.upload.service.ImageUploadService r7 = com.marrow2.ui.settings.kyc.upload.service.ImageUploadService.this
                java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)
                java.lang.Object[] r3 = new java.lang.Object[]{r7, r8}
                int r2 = kotlin.UtilExternalSyntheticLambda1.AudioAttributesCompatParcelizer()
                int r5 = kotlin.UtilExternalSyntheticLambda1.AudioAttributesCompatParcelizer()
                int r6 = kotlin.UtilExternalSyntheticLambda1.AudioAttributesCompatParcelizer()
                int r1 = kotlin.UtilExternalSyntheticLambda1.AudioAttributesCompatParcelizer()
                r4 = 1436547319(0x559ff8f7, float:2.1986456E13)
                r0 = -1436547319(0xffffffffaa600709, float:-1.9897637E-13)
                com.marrow2.ui.settings.kyc.upload.service.ImageUploadService.read(r0, r1, r2, r3, r4, r5, r6)
                o.getShowPopup r7 = kotlin.getShowPopup.INSTANCE
                return r7
            L71:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.settings.kyc.upload.service.ImageUploadService.write.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        write(SampleVideos<? super write> sampleVideos) {
            super(1, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return ImageUploadService.this.new write(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((write) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    @Override // kotlin.trimByVisibility, android.app.Service
    public final int onStartCommand(Intent p0, int p1, int p2) {
        int i = 2 % 2;
        super.onStartCommand(p0, p1, p2);
        startForeground(8, read("Uploading ID Verification Images", 0, 1, "settings", true));
        Object obj = null;
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(getInternalName.RemoteActionCompatParcelizer(this), new write(null), new MagicModuleSubmissionRequestBody() { // from class: o.LocationSource
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj2, Object obj3) {
                return ImageUploadService.read(this.AudioAttributesCompatParcelizer, ((Integer) obj2).intValue(), (String) obj3);
            }
        });
        int i2 = RemoteActionCompatParcelizer + 53;
        AudioAttributesImplApi26Parcelizer = i2 % 128;
        if (i2 % 2 != 0) {
            return 3;
        }
        obj.hashCode();
        throw null;
    }

    private static final getShowPopup AudioAttributesCompatParcelizer(ImageUploadService imageUploadService, int i, String str) {
        int i2 = 2 % 2;
        int i3 = AudioAttributesImplApi26Parcelizer + 89;
        RemoteActionCompatParcelizer = i3 % 128;
        int i4 = i3 % 2;
        toMagicModuleMetaRepoModel.write(str, "");
        if (i == 502) {
            int i5 = RemoteActionCompatParcelizer + 49;
            AudioAttributesImplApi26Parcelizer = i5 % 128;
            if (i5 % 2 == 0) {
                imageUploadService.read();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            imageUploadService.read();
        } else {
            imageUploadService.write();
            int i6 = AudioAttributesImplApi26Parcelizer + 73;
            RemoteActionCompatParcelizer = i6 % 128;
            int i7 = i6 % 2;
        }
        getShowPopup getshowpopup = getShowPopup.INSTANCE;
        int i8 = AudioAttributesImplApi26Parcelizer + 49;
        RemoteActionCompatParcelizer = i8 % 128;
        int i9 = i8 % 2;
        return getshowpopup;
    }

    private final void read() {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi26Parcelizer + 125;
        RemoteActionCompatParcelizer = i2 % 128;
        if (i2 % 2 != 0) {
            read("KycImageUploadService", "KycNoInternet");
            AudioAttributesCompatParcelizer();
            int i3 = 97 / 0;
        } else {
            read("KycImageUploadService", "KycNoInternet");
            AudioAttributesCompatParcelizer();
        }
        int i4 = AudioAttributesImplApi26Parcelizer + 11;
        RemoteActionCompatParcelizer = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object write(Object[] objArr) {
        String str;
        ImageUploadService imageUploadService = (ImageUploadService) objArr[0];
        int i = 2 % 2;
        if (((Boolean) objArr[1]).booleanValue()) {
            int i2 = AudioAttributesImplApi26Parcelizer + 81;
            RemoteActionCompatParcelizer = i2 % 128;
            int i3 = i2 % 2;
            str = "KycImageUploadPass";
        } else {
            str = "KycImageUploadFailed";
            int i4 = AudioAttributesImplApi26Parcelizer + 95;
            RemoteActionCompatParcelizer = i4 % 128;
            int i5 = i4 % 2;
        }
        imageUploadService.read("KycImageUploadService", str);
        imageUploadService.AudioAttributesCompatParcelizer();
        return null;
    }

    private static void e(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        notifyDownloadChanged notifydownloadchanged = new notifyDownloadChanged();
        notifydownloadchanged.read = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        notifydownloadchanged.AudioAttributesCompatParcelizer = 0;
        while (notifydownloadchanged.AudioAttributesCompatParcelizer < cArr.length) {
            int i3 = notifydownloadchanged.AudioAttributesCompatParcelizer;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[notifydownloadchanged.AudioAttributesCompatParcelizer]), notifydownloadchanged, notifydownloadchanged};
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1435583294);
                if (objRemoteActionCompatParcelizer == null) {
                    byte b = (byte) 0;
                    byte b2 = (byte) (b - 1);
                    objRemoteActionCompatParcelizer = startForeground.read((char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 38461), TextUtils.lastIndexOf("", '0', 0, 0) + 533, KeyEvent.keyCodeFromString("") + 8, -735610793, false, $$n(b, b2, (byte) (b2 + 1)), new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i3] = ((Long) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).longValue() ^ (read ^ 2192498202983240651L);
                Object[] objArr3 = {notifydownloadchanged, notifydownloadchanged};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(1971306176);
                if (objRemoteActionCompatParcelizer2 == null) {
                    char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0', 0) + 36622);
                    int iRed = 2340 - Color.red(0);
                    int iLastIndexOf = 27 - TextUtils.lastIndexOf("", '0');
                    byte b3 = (byte) ($$m & 5);
                    byte b4 = (byte) (-b3);
                    objRemoteActionCompatParcelizer2 = startForeground.read(cLastIndexOf, iRed, iLastIndexOf, 188119637, false, $$n(b3, b4, (byte) (b4 + 1)), new Class[]{Object.class, Object.class});
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
        char[] cArr2 = new char[length];
        notifydownloadchanged.AudioAttributesCompatParcelizer = 0;
        while (notifydownloadchanged.AudioAttributesCompatParcelizer < cArr.length) {
            int i4 = $10 + 3;
            $11 = i4 % 128;
            int i5 = i4 % 2;
            cArr2[notifydownloadchanged.AudioAttributesCompatParcelizer] = (char) jArr[notifydownloadchanged.AudioAttributesCompatParcelizer];
            Object[] objArr4 = {notifydownloadchanged, notifydownloadchanged};
            Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(1971306176);
            if (objRemoteActionCompatParcelizer3 == null) {
                char keyRepeatTimeout = (char) (36621 - (ViewConfiguration.getKeyRepeatTimeout() >> 16));
                int deadChar = 2340 - KeyEvent.getDeadChar(0, 0);
                int maxKeyCode = (KeyEvent.getMaxKeyCode() >> 16) + 28;
                byte b5 = (byte) ($$m & 5);
                byte b6 = (byte) (-b5);
                objRemoteActionCompatParcelizer3 = startForeground.read(keyRepeatTimeout, deadChar, maxKeyCode, 188119637, false, $$n(b5, b6, (byte) (b6 + 1)), new Class[]{Object.class, Object.class});
            }
            ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
            int i6 = $11 + 29;
            $10 = i6 % 128;
            int i7 = i6 % 2;
        }
        objArr[0] = new String(cArr2);
    }

    private final void write() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 91;
        AudioAttributesImplApi26Parcelizer = i2 % 128;
        if (i2 % 2 == 0) {
            read("KycImageUploadService", "KycImageUploadFailed");
            AudioAttributesCompatParcelizer();
            int i3 = 54 / 0;
        } else {
            read("KycImageUploadService", "KycImageUploadFailed");
            AudioAttributesCompatParcelizer();
        }
    }

    private static void f(int i, char c, int i2, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        DownloadService downloadService = new DownloadService();
        long[] jArr = new long[i];
        downloadService.write = 0;
        while (downloadService.write < i) {
            int i4 = $10 + 53;
            $11 = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = downloadService.write;
                try {
                    Object[] objArr2 = {Integer.valueOf(AudioAttributesCompatParcelizer[i2 << i5])};
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(1659892375);
                    if (objRemoteActionCompatParcelizer == null) {
                        byte b = (byte) (-1);
                        objRemoteActionCompatParcelizer = startForeground.read((char) (36621 - Color.green(0)), 2340 - (AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), 28 - Color.red(0), 480654850, false, $$n((byte) ($$m & 30), b, (byte) (b + 1)), new Class[]{Integer.TYPE});
                    }
                    Object[] objArr3 = {Long.valueOf(((Long) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).longValue()), Long.valueOf(i5), Long.valueOf(write), Integer.valueOf(c)};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(955774634);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) (ViewConfiguration.getTapTimeout() >> 16), 9701 - (ViewConfiguration.getEdgeSlop() >> 16), View.combineMeasuredStates(0, 0) + 26, 1186869823, false, "d", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                    }
                    jArr[i5] = ((Long) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).longValue();
                    Object[] objArr4 = {downloadService, downloadService};
                    Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-452087292);
                    if (objRemoteActionCompatParcelizer3 == null) {
                        objRemoteActionCompatParcelizer3 = startForeground.read((char) (KeyEvent.getMaxKeyCode() >> 16), 23785 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 33 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), -1690012015, false, "b", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } else {
                int i6 = downloadService.write;
                Object[] objArr5 = {Integer.valueOf(AudioAttributesCompatParcelizer[i2 + i6])};
                Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(1659892375);
                if (objRemoteActionCompatParcelizer4 == null) {
                    byte b2 = (byte) (-1);
                    objRemoteActionCompatParcelizer4 = startForeground.read((char) (TextUtils.getCapsMode("", 0, 0) + 36621), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 2339, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 27, 480654850, false, $$n((byte) ($$m & 30), b2, (byte) (b2 + 1)), new Class[]{Integer.TYPE});
                }
                Object[] objArr6 = {Long.valueOf(((Long) ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5)).longValue()), Long.valueOf(i6), Long.valueOf(write), Integer.valueOf(c)};
                Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(955774634);
                if (objRemoteActionCompatParcelizer5 == null) {
                    objRemoteActionCompatParcelizer5 = startForeground.read((char) (ViewConfiguration.getScrollDefaultDelay() >> 16), 9700 - TextUtils.lastIndexOf("", '0', 0, 0), 26 - KeyEvent.keyCodeFromString(""), 1186869823, false, "d", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i6] = ((Long) ((Method) objRemoteActionCompatParcelizer5).invoke(null, objArr6)).longValue();
                Object[] objArr7 = {downloadService, downloadService};
                Object objRemoteActionCompatParcelizer6 = startForeground.RemoteActionCompatParcelizer(-452087292);
                if (objRemoteActionCompatParcelizer6 == null) {
                    objRemoteActionCompatParcelizer6 = startForeground.read((char) (ViewConfiguration.getScrollBarSize() >> 8), 23784 - KeyEvent.getDeadChar(0, 0), ((byte) KeyEvent.getModifierMetaStateMask()) + 34, -1690012015, false, "b", new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer6).invoke(null, objArr7);
            }
        }
        char[] cArr = new char[i];
        downloadService.write = 0;
        int i7 = $10 + 85;
        $11 = i7 % 128;
        int i8 = i7 % 2;
        while (downloadService.write < i) {
            int i9 = $11 + 101;
            $10 = i9 % 128;
            if (i9 % 2 != 0) {
                cArr[downloadService.write] = (char) jArr[downloadService.write];
                try {
                    Object[] objArr8 = {downloadService, downloadService};
                    Object objRemoteActionCompatParcelizer7 = startForeground.RemoteActionCompatParcelizer(-452087292);
                    if (objRemoteActionCompatParcelizer7 == null) {
                        objRemoteActionCompatParcelizer7 = startForeground.read((char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 1), TextUtils.getCapsMode("", 0, 0) + 23784, (TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 33, -1690012015, false, "b", new Class[]{Object.class, Object.class});
                    }
                    Object obj = null;
                    ((Method) objRemoteActionCompatParcelizer7).invoke(null, objArr8);
                    obj.hashCode();
                    throw null;
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
            cArr[downloadService.write] = (char) jArr[downloadService.write];
            Object[] objArr9 = {downloadService, downloadService};
            Object objRemoteActionCompatParcelizer8 = startForeground.RemoteActionCompatParcelizer(-452087292);
            if (objRemoteActionCompatParcelizer8 == null) {
                objRemoteActionCompatParcelizer8 = startForeground.read((char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 23784 - (KeyEvent.getMaxKeyCode() >> 16), 33 - Color.argb(0, 0, 0, 0), -1690012015, false, "b", new Class[]{Object.class, Object.class});
            }
            ((Method) objRemoteActionCompatParcelizer8).invoke(null, objArr9);
        }
        objArr[0] = new String(cArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00fb  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00dd -> B:36:0x00de). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object IconCompatParcelizer(java.util.List<kotlin.unescapeStream> r14, kotlin.SampleVideos<? super java.lang.Boolean> r15) {
        /*
            Method dump skipped, instruction units count: 320
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.settings.kyc.upload.service.ImageUploadService.IconCompatParcelizer(java.util.List, o.SampleVideos):java.lang.Object");
    }

    private void AudioAttributesCompatParcelizer() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 91;
        AudioAttributesImplApi26Parcelizer = i2 % 128;
        int i3 = i2 % 2;
        stopForeground(true);
        stopSelf();
        int i4 = RemoteActionCompatParcelizer + 47;
        AudioAttributesImplApi26Parcelizer = i4 % 128;
        int i5 = i4 % 2;
    }

    private void read(String p0, String p1) {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi26Parcelizer + 83;
        RemoteActionCompatParcelizer = i2 % 128;
        if (i2 % 2 == 0) {
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
        int i3 = 84 / 0;
    }

    private void IconCompatParcelizer(String p0, int p1, int p2) {
        Notification notification;
        NotificationManager notificationManager;
        int i;
        int i2 = 2 % 2;
        int i3 = RemoteActionCompatParcelizer + 55;
        AudioAttributesImplApi26Parcelizer = i3 % 128;
        if (i3 % 2 == 0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            notification = read(p0, p1 % 1, p2, "settings", true);
            notificationManager = getNotificationManager();
            i = 94;
        } else {
            toMagicModuleMetaRepoModel.write(p0, "");
            notification = read(p0, p1 + 1, p2, "settings", false);
            notificationManager = getNotificationManager();
            i = 8;
        }
        notificationManager.notify(i, notification);
        int i4 = AudioAttributesImplApi26Parcelizer + 99;
        RemoteActionCompatParcelizer = i4 % 128;
        int i5 = i4 % 2;
    }

    private final void RemoteActionCompatParcelizer(String p0, int p1, int p2) {
        Notification notification;
        NotificationManager notificationManager;
        int i;
        int i2 = 2 % 2;
        int i3 = RemoteActionCompatParcelizer + 87;
        AudioAttributesImplApi26Parcelizer = i3 % 128;
        if (i3 % 2 == 0) {
            notification = read(p0, p1, p2, "kyc", true);
            notificationManager = getNotificationManager();
            i = 33;
        } else {
            notification = read(p0, p1, p2, "kyc", true);
            notificationManager = getNotificationManager();
            i = 6;
        }
        notificationManager.notify(i, notification);
        int i4 = AudioAttributesImplApi26Parcelizer + 121;
        RemoteActionCompatParcelizer = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 64 / 0;
        }
    }

    private final Notification read(String p0, int p1, int p2, String p3, boolean p4) {
        float f;
        int i;
        int i2 = 2 % 2;
        int i3 = p1 - 1;
        toMagicModuleStatusUcModel tomagicmodulestatusucmodel = toMagicModuleStatusUcModel.INSTANCE;
        String str = String.format(Locale.getDefault(), "Uploading : (%d/%d)", Arrays.copyOf(new Object[]{Integer.valueOf(p1), Integer.valueOf(p2)}, 2));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str, "");
        toMagicModuleStatusUcModel tomagicmodulestatusucmodel2 = toMagicModuleStatusUcModel.INSTANCE;
        String str2 = String.format(Locale.getDefault(), "Uploaded : (%d/%d)", Arrays.copyOf(new Object[]{Integer.valueOf(p1), Integer.valueOf(p2)}, 2));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str2, "");
        if (i3 == 0) {
            int i4 = AudioAttributesImplApi26Parcelizer + 45;
            RemoteActionCompatParcelizer = i4 % 128;
            f = i4 % 2 != 0 ? 2.0f : BitmapDescriptorFactory.HUE_RED;
        } else {
            f = i3 / p2;
            int i5 = RemoteActionCompatParcelizer + 75;
            AudioAttributesImplApi26Parcelizer = i5 % 128;
            int i6 = i5 % 2;
        }
        if (p4) {
            i = 100;
        } else {
            int i7 = AudioAttributesImplApi26Parcelizer + 97;
            RemoteActionCompatParcelizer = i7 % 128;
            int i8 = i7 % 2;
            i = (int) (f * 100.0f);
        }
        getExtendedWestEuropeanChar getextendedwesteuropeancharIconCompatParcelizer = new getExtendedWestEuropeanChar(this, "notification_upload", "Image Upload Notifications. Eg: ID Verification Image upload").IconCompatParcelizer(p3);
        boolean z = !p4;
        getExtendedWestEuropeanChar getextendedwesteuropeancharRemoteActionCompatParcelizer = getextendedwesteuropeancharIconCompatParcelizer.RemoteActionCompatParcelizer(z);
        if (!p4) {
            int i9 = AudioAttributesImplApi26Parcelizer + 123;
            RemoteActionCompatParcelizer = i9 % 128;
            int i10 = i9 % 2;
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

    /* JADX WARN: Removed duplicated region for block: B:11:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00e0  */
    @Override // kotlin.MapFragment, kotlin.trimByVisibility, android.app.Service, android.content.ContextWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void attachBaseContext(android.content.Context r34) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 5397
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.settings.kyc.upload.service.ImageUploadService.attachBaseContext(android.content.Context):void");
    }

    public static /* synthetic */ getShowPopup read(ImageUploadService imageUploadService, int i, String str) {
        int i2 = 2 % 2;
        int i3 = RemoteActionCompatParcelizer + 73;
        AudioAttributesImplApi26Parcelizer = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            AudioAttributesCompatParcelizer(imageUploadService, i, str);
            obj.hashCode();
            throw null;
        }
        getShowPopup getshowpopupAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(imageUploadService, i, str);
        int i4 = RemoteActionCompatParcelizer + 69;
        AudioAttributesImplApi26Parcelizer = i4 % 128;
        if (i4 % 2 != 0) {
            return getshowpopupAudioAttributesCompatParcelizer;
        }
        obj.hashCode();
        throw null;
    }

    static {
        MediaBrowserCompatItemReceiver = 1;
        RemoteActionCompatParcelizer();
        INSTANCE = new Companion(null);
        int i = AudioAttributesImplApi21Parcelizer + 105;
        MediaBrowserCompatItemReceiver = i % 128;
        int i2 = i % 2;
    }

    public static final /* synthetic */ void IconCompatParcelizer(ImageUploadService imageUploadService, boolean z) {
        Object[] objArr = {imageUploadService, Boolean.valueOf(z)};
        read(-1436547319, UtilExternalSyntheticLambda1.AudioAttributesCompatParcelizer(), UtilExternalSyntheticLambda1.AudioAttributesCompatParcelizer(), objArr, 1436547319, UtilExternalSyntheticLambda1.AudioAttributesCompatParcelizer(), UtilExternalSyntheticLambda1.AudioAttributesCompatParcelizer());
    }

    private final void AudioAttributesCompatParcelizer(boolean p0) {
        Object[] objArr = {this, Boolean.valueOf(p0)};
        read(103244679, UtilExternalSyntheticLambda1.AudioAttributesCompatParcelizer(), UtilExternalSyntheticLambda1.AudioAttributesCompatParcelizer(), objArr, -103244678, UtilExternalSyntheticLambda1.AudioAttributesCompatParcelizer(), UtilExternalSyntheticLambda1.AudioAttributesCompatParcelizer());
    }

    private final void AudioAttributesCompatParcelizer(String p0, int p1) {
        Object[] objArr = {this, p0, Integer.valueOf(p1)};
        read(1416698776, UtilExternalSyntheticLambda1.AudioAttributesCompatParcelizer(), UtilExternalSyntheticLambda1.AudioAttributesCompatParcelizer(), objArr, -1416698774, UtilExternalSyntheticLambda1.AudioAttributesCompatParcelizer(), UtilExternalSyntheticLambda1.AudioAttributesCompatParcelizer());
    }

    @Override // kotlin.MapFragment, kotlin.trimByVisibility, android.app.Service
    public final void onCreate() {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi26Parcelizer + 59;
        RemoteActionCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        super.onCreate();
        int i4 = RemoteActionCompatParcelizer + 13;
        AudioAttributesImplApi26Parcelizer = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 56 / 0;
        }
    }

    static void RemoteActionCompatParcelizer() {
        read = -3116265358883214235L;
        AudioAttributesCompatParcelizer = new char[]{50836, 28356, 38436, 15964, 26509, 56380, 29739, 36071, 9456, 32043, 38201, 11683, 17894, 40473, 13919, 20160, 59010, 16140, 22345, 61392, 1990, 22573, 61677, 2213, 41273, 63850, 4512, 43488, 49705, 6670, 45721, 51925, 25360, 47941, 54159, 27590, 48128, 54460, 27900, 34150, 56691, 30202, 36330, 9767, 32352, 38548, 11999, 18246, 40708, 14296, 20382, 57349, 14356, 20732, 59697, 369, 22960, 61933, 2593, 41568, 64165, 4820, 43854, 49921, 7107, 46025, 50269, 7239, 46215, 56430, 29817, 36069, 9380, 32045, 38250, 11767, 17896, 40520, 13836, 20113, 59089, 16132, 22297, 61392, 1940, 22644, 61673, 2214, 41265, 63854, 4521, 43495, 49698, 6741, 45773, 51840, 25369, 47951, 54158, 27589, 48136, 54456, 27817, 34099, 56613, 30205, 36285, 9767, 32310, 38557, 11994, 18241, 40784, 14303, 20426, 57348, 14353, 20729, 59756, 290, 23009, 61933, 2606, 41575, 64243, 4829, 43850, 50001, 7106, 46026, 50191, 7234, 46216, 56373, 29798, 36021, 9460, 32050, 38250, 56382, 29817, 36070, 9463, 32042, 38250, 11685, 17889, 40449, 13904, 20162, 59096, 16218, 22357, 61312, 1990, 22648, 61631, 2281, 41273, 63806, 4522, 43492, 49725, 6666, 45727, 51845, 25362, 47947, 54237, 27543, 48214, 54461, 27817, 34098, 56694, 31411, 54014, 10805, 33399, 56239, 13292, 35620, 58223, 14493, 37085, 59415, 56429, 29734, 36064, 9394, 32115, 38193, 11760, 17918, 40515, 13851, 20106, 59059, 16197, 22283, 61376, 1941, 22561, 61643, 2216, 41327, 63807, 4595};
        write = 8207619006324831304L;
    }
}
