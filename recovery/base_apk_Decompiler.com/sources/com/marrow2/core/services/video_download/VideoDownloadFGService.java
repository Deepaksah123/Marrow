package com.marrow2.core.services.video_download;

import android.app.Notification;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.gms.common.internal.zaac;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow.R;
import com.marrow.data.models.video.DownloadAnalyticEvent;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.C0201setMcqCount;
import kotlin.DownloadService;
import kotlin.InitializationChunk;
import kotlin.MagicModuleRepositoryImplExternalSyntheticLambda0;
import kotlin.MagicModuleSubmissionRequestBody;
import kotlin.Metadata;
import kotlin.RenewEligibleCreator;
import kotlin.SampleVideos;
import kotlin.VideoTimelineResponseBody;
import kotlin.buildResolutionString;
import kotlin.buildSetStopReasonIntent;
import kotlin.component1;
import kotlin.fromMemberAnnotations;
import kotlin.getAnswerMap;
import kotlin.getInternalName;
import kotlin.getIsInitSegment;
import kotlin.getShowPopup;
import kotlin.setAction;
import kotlin.setEndIconDrawable;
import kotlin.setSdkPayload;
import kotlin.shouldSkip;
import kotlin.startForeground;
import kotlin.toMagicModuleMetaRepoModel;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 \u00112\u00020\u00012\u00020\u0002:\u0001\u0011B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0004J)\u0010\f\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u000f\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u000f\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0013\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0013\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0013\u0010\u0004J\u0017\u0010\u0013\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0013\u0010\u0018J!\u0010\u0013\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u000e2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\u0013\u0010\u0019J\u001f\u0010\u000f\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u001aJ/\u0010\u001d\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010\u001f\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001f\u0010\u001aJ\u001f\u0010\u0013\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0013\u0010\u001aJ'\u0010 \u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\u0014H\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\"\u0010\u0016J\u000f\u0010\u0011\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0011\u0010\u0004J\u000f\u0010\u001f\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u001f\u0010\u0004J\u001f\u0010\u001d\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001d\u0010#J\u001f\u0010$\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u0005H\u0016¢\u0006\u0004\b&\u0010\u0004R\"\u0010'\u001a\u00020\u00148\u0007@\u0007X\u0087.¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010\u0016R\"\u0010-\u001a\u00020,8\u0007@\u0007X\u0087.¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\"\u00103\u001a\u00020\u00148\u0007@\u0007X\u0087.¢\u0006\u0012\n\u0004\b3\u0010(\u001a\u0004\b4\u0010*\"\u0004\b5\u0010\u0016R\"\u00106\u001a\u00020\u00148\u0007@\u0007X\u0087.¢\u0006\u0012\n\u0004\b6\u0010(\u001a\u0004\b7\u0010*\"\u0004\b8\u0010\u0016"}, d2 = {"Lcom/marrow2/core/services/video_download/VideoDownloadFGService;", "Lo/trimByVisibility;", "Lo/component1;", "<init>", "()V", "", "onCreate", "Landroid/content/Intent;", "p0", "", "p1", "p2", "onStartCommand", "(Landroid/content/Intent;II)I", "", "IconCompatParcelizer", "(Ljava/lang/Integer;Ljava/lang/String;)V", "write", "(Ljava/lang/String;)V", "AudioAttributesCompatParcelizer", "", "IconCompatParcelizer$3e9d3cda", "(Ljava/lang/Object;)V", "", "(Z)V", "(Ljava/lang/String;Ljava/lang/Integer;)V", "(Ljava/lang/String;Ljava/lang/String;)V", "", "p3", "RemoteActionCompatParcelizer", "(Ljava/lang/String;Ljava/lang/String;FLjava/lang/String;)V", "read", "RemoteActionCompatParcelizer$5bd1d356", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "write$3e9d3cda", "(Ljava/lang/String;I)V", "onTimeout", "(II)V", "onDestroy", "useCase", "Ljava/lang/Object;", "getUseCase$7db7d271", "()Ljava/lang/Object;", "setUseCase$4b7f6877", "Lo/InitializationChunk;", "videoAnalyticPublisher", "Lo/InitializationChunk;", "getVideoAnalyticPublisher", "()Lo/InitializationChunk;", "setVideoAnalyticPublisher", "(Lo/InitializationChunk;)V", "downloadJob", "getDownloadJob$12849663", "setDownloadJob$5c6ddce9", "networkObserver", "getNetworkObserver$4f979d99", "setNetworkObserver$60ccab25"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class VideoDownloadFGService extends shouldSkip implements component1 {
    private static long AudioAttributesCompatParcelizer;
    private static int AudioAttributesImplBaseParcelizer;
    private static char[] RemoteActionCompatParcelizer;
    private static char[] read;
    public static final Object write;

    @setSdkPayload
    public Object downloadJob;

    @setSdkPayload
    public Object networkObserver;

    @setSdkPayload
    public Object useCase;

    @setSdkPayload
    public InitializationChunk videoAnalyticPublisher;
    private static final byte[] $$l = {66, 100, 74, -7};
    private static final int $$m = 63;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$j = {112, -40, -93, -59, 8, 12, -8, 18, 16, 7, 0, -16, -5, 1, -2, 18, 39, -31, -14, 14, -3, 4, 46, -41, 5, 0, 18, -16, 39, -14, -14, 18, 1, -4, 6, -14, 24, -10, -49, 20, -2, -3, TarConstants.LF_LINK, -48, 3, 5, 12, 10, -16, 4, 18, -11, TarConstants.LF_CHR, -41, 5, 0, 18, -16, 39, -14, -14, 18, 1, -4, 6, -14, 24, -10, -9, 5, 66, -54, -5, 3, 11, -2, 10, 58, -48, -10, 13, -11, 6, 9, 8, 57, -54, -3, -3, 72, -50, -9, 5, 3, 1, 4, 67, -68, 4, 14, 0, 65, -73, 3, 28};
    private static final int $$k = 39;
    private static final byte[] $$d = {62, -102, -38, -78, 20, 9, 3, 6, -14, -35, 35, 18, -10, 7, 0, -42, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14, -12, -3, 4, 25, 0, 6, -7, -30, TarConstants.LF_LINK, -2, 9, -3, -13, 14, -46, 45, -1, 4, -14, 20, -42, 44, -14, 9, -26, 20, -1, 3, 5, 14, -16, 14, 27, 13, 0, -42, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14, 25, 0, 6, -7, -30, TarConstants.LF_LINK, -2, 9, -3, -13, 14, -46, 45, -1, 4, -14, 20, -48, TarConstants.LF_CHR, -1, 2, -4, -1, -43, 35, 18, -10, 7, 0, -27, 20, 15, 3, -8, 9, -33, 20, -1, 3, 5, 14, -16, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 0, 32, 18, 18, -14, 3, 8, -2, 18, -20, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 5, 27, 18, 18, -14, 3, 8, -2, 18, -20, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -47, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14};
    private static final int $$e = 221;
    private static int MediaBrowserCompatCustomActionResultReceiver = 1;
    private static int IconCompatParcelizer = 0;
    private static int AudioAttributesImplApi26Parcelizer = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$n(short r7, byte r8, short r9) {
        /*
            int r9 = r9 * 3
            int r9 = 101 - r9
            int r8 = r8 * 4
            int r8 = r8 + 4
            int r7 = r7 * 4
            int r7 = 1 - r7
            byte[] r0 = com.marrow2.core.services.video_download.VideoDownloadFGService.$$l
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r9
            r5 = r2
            r9 = r8
            goto L2b
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r9
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r7) goto L25
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L25:
            r3 = r0[r8]
            r6 = r9
            r9 = r8
            r8 = r3
            r3 = r6
        L2b:
            int r8 = -r8
            int r8 = r8 + r3
            int r9 = r9 + 1
            r3 = r5
            r6 = r9
            r9 = r8
            r8 = r6
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow2.core.services.video_download.VideoDownloadFGService.$$n(short, byte, short):java.lang.String");
    }

    public static /* synthetic */ Object RemoteActionCompatParcelizer(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) throws Throwable {
        Object obj;
        int i7 = (~(i5 | i2)) | i4;
        int i8 = ~i5;
        int i9 = ~((~i4) | i8 | i2);
        int i10 = (~(i2 | i4)) | (~(i8 | (~i2)));
        int i11 = i5 + i4 + i6 + (1616745821 * i) + (2077170981 * i3);
        int i12 = i11 * i11;
        int i13 = (i5 * (-1558553916)) + 318941677 + (i4 * (-1558553002)) + (i7 * (-457)) + (i9 * 457) + (i10 * 457) + ((-1558553459) * i6) + (397062201 * i) + (609114465 * i3) + (i12 * (-138936320));
        int i14 = ((-162656556) * i5) + 1587019776 + (806482222 * i4) + ((-484569389) * i7) + (i9 * 484569389) + (484569389 * i10) + (321912832 * i6) + ((-395313152) * i) + (904921088 * i3) + (345505792 * i12) + (i13 * i13 * 1630011392);
        if (i14 == 1) {
            return RemoteActionCompatParcelizer(objArr);
        }
        if (i14 == 2) {
            return IconCompatParcelizer(objArr);
        }
        try {
            if (i14 == 3) {
                obj = null;
                VideoDownloadFGService videoDownloadFGService = (VideoDownloadFGService) objArr[0];
                String str = (String) objArr[1];
                int i15 = 2 % 2;
                videoDownloadFGService.RemoteActionCompatParcelizer(str, 3);
                Object[] objArr2 = {str};
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1427906682);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1), TextUtils.lastIndexOf("", '0') + 19271, 23 - TextUtils.getOffsetBefore("", 0), -727049453, false, null, new Class[]{String.class});
                }
                videoDownloadFGService.IconCompatParcelizer$3e9d3cda(((Constructor) objRemoteActionCompatParcelizer).newInstance(objArr2));
                int i16 = IconCompatParcelizer + 115;
                AudioAttributesImplApi26Parcelizer = i16 % 128;
                int i17 = i16 % 2;
            } else {
                if (i14 != 4) {
                    return i14 != 5 ? write(objArr) : read(objArr);
                }
                VideoDownloadFGService videoDownloadFGService2 = (VideoDownloadFGService) objArr[0];
                String str2 = (String) objArr[1];
                String str3 = (String) objArr[2];
                int i18 = 2 % 2;
                int i19 = IconCompatParcelizer + 19;
                AudioAttributesImplApi26Parcelizer = i19 % 128;
                int i20 = i19 % 2;
                toMagicModuleMetaRepoModel.write(str2, "");
                toMagicModuleMetaRepoModel.write(str3, "");
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(723570348);
                if (objRemoteActionCompatParcelizer2 == null) {
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 7220), 19315 - View.getDefaultSize(0, 0), 13 - View.MeasureSpec.getSize(0), 1432947257, false, "AudioAttributesCompatParcelizer", null);
                }
                Object obj2 = ((Field) objRemoteActionCompatParcelizer2).get(null);
                Object[] objArr3 = {videoDownloadFGService2, str2, str3};
                Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1655417682);
                if (objRemoteActionCompatParcelizer3 == null) {
                    char cMyTid = (char) (7220 - (Process.myTid() >> 22));
                    int touchSlop = 19315 - (ViewConfiguration.getTouchSlop() >> 8);
                    int iRgb = Color.rgb(0, 0, 0) + 16777229;
                    byte b = $$j[10];
                    Object[] objArr4 = new Object[1];
                    e(b, r17[13], b, objArr4);
                    objRemoteActionCompatParcelizer3 = startForeground.read(cMyTid, touchSlop, iRgb, -484601797, false, (String) objArr4[0], new Class[]{Service.class, String.class, String.class});
                }
                ((Method) objRemoteActionCompatParcelizer3).invoke(obj2, objArr3);
                Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(1200052891);
                if (objRemoteActionCompatParcelizer4 == null) {
                    objRemoteActionCompatParcelizer4 = startForeground.read((char) (TextUtils.lastIndexOf("", '0', 0, 0) + 5290), 19329 - (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), 21 - Color.argb(0, 0, 0, 0), 969842190, false, "INSTANCE", null);
                }
                Object obj3 = ((Field) objRemoteActionCompatParcelizer4).get(null);
                Object[] objArr5 = {videoDownloadFGService2, str2, Float.valueOf(100.0f)};
                Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(1257716957);
                if (objRemoteActionCompatParcelizer5 == null) {
                    objRemoteActionCompatParcelizer5 = startForeground.read((char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 5289), 19327 - Process.getGidForName(""), 21 - KeyEvent.getDeadChar(0, 0), 884930632, false, "IconCompatParcelizer", new Class[]{Context.class, String.class, Float.TYPE});
                }
                ((Method) objRemoteActionCompatParcelizer5).invoke(obj3, objArr5);
                Object objRemoteActionCompatParcelizer6 = startForeground.RemoteActionCompatParcelizer(1878932737);
                if (objRemoteActionCompatParcelizer6 == null) {
                    objRemoteActionCompatParcelizer6 = startForeground.read((char) (TextUtils.indexOf("", "", 0, 0) + 35583), TextUtils.getOffsetBefore("", 0) + 19137, 49 - (ViewConfiguration.getScrollBarSize() >> 8), 297269652, false, "INSTANCE", null);
                }
                obj = null;
                videoDownloadFGService2.IconCompatParcelizer$3e9d3cda(((Field) objRemoteActionCompatParcelizer6).get(null));
                int i21 = IconCompatParcelizer + 21;
                AudioAttributesImplApi26Parcelizer = i21 % 128;
                int i22 = i21 % 2;
            }
            return obj;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void e(byte r6, byte r7, int r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 + 4
            int r0 = r7 + 4
            byte[] r1 = com.marrow2.core.services.video_download.VideoDownloadFGService.$$j
            int r6 = 119 - r6
            byte[] r0 = new byte[r0]
            int r7 = r7 + 3
            r2 = 0
            if (r1 != 0) goto L13
            r3 = r8
            r4 = r2
            r8 = r7
            goto L2a
        L13:
            r3 = r2
        L14:
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r7) goto L21
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L21:
            r4 = r1[r8]
            int r3 = r3 + 1
            r5 = r8
            r8 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2a:
            int r6 = -r6
            int r8 = r8 + r6
            int r6 = r8 + 3
            int r8 = r3 + 1
            r3 = r4
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow2.core.services.video_download.VideoDownloadFGService.e(byte, byte, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0024). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void h(short r5, short r6, int r7, java.lang.Object[] r8) {
        /*
            int r0 = r7 + 4
            int r5 = r5 + 65
            int r6 = r6 + 4
            byte[] r1 = com.marrow2.core.services.video_download.VideoDownloadFGService.$$d
            byte[] r0 = new byte[r0]
            int r7 = r7 + 3
            r2 = 0
            if (r1 != 0) goto L12
            r3 = r7
            r4 = r2
            goto L24
        L12:
            r3 = r2
        L13:
            byte r4 = (byte) r5
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L22
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            r8[r2] = r5
            return
        L22:
            r3 = r1[r6]
        L24:
            int r5 = r5 + r3
            int r6 = r6 + 1
            int r5 = r5 + (-1)
            r3 = r4
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow2.core.services.video_download.VideoDownloadFGService.h(short, short, int, java.lang.Object[]):void");
    }

    private static /* synthetic */ Object IconCompatParcelizer(Object[] objArr) throws Throwable {
        VideoDownloadFGService videoDownloadFGService = (VideoDownloadFGService) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 93;
        AudioAttributesImplApi26Parcelizer = i2 % 128;
        int i3 = i2 % 2;
        videoDownloadFGService.AudioAttributesCompatParcelizer(zBooleanValue);
        int i4 = IconCompatParcelizer + 123;
        AudioAttributesImplApi26Parcelizer = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    public static final /* synthetic */ void IconCompatParcelizer(VideoDownloadFGService videoDownloadFGService, String str) throws Throwable {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi26Parcelizer + 49;
        IconCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        videoDownloadFGService.AudioAttributesCompatParcelizer(str);
        if (i3 != 0) {
            int i4 = 20 / 0;
        }
    }

    public static final /* synthetic */ void RemoteActionCompatParcelizer(VideoDownloadFGService videoDownloadFGService, String str, Integer num) throws Throwable {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi26Parcelizer + 61;
        IconCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        videoDownloadFGService.AudioAttributesCompatParcelizer(str, num);
        if (i3 != 0) {
            throw null;
        }
        int i4 = AudioAttributesImplApi26Parcelizer + 109;
        IconCompatParcelizer = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final /* synthetic */ void read(VideoDownloadFGService videoDownloadFGService, String str) throws Throwable {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi26Parcelizer + 119;
        IconCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        videoDownloadFGService.write(str);
        int i4 = IconCompatParcelizer + 3;
        AudioAttributesImplApi26Parcelizer = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object write(Object[] objArr) throws Throwable {
        VideoDownloadFGService videoDownloadFGService = (VideoDownloadFGService) objArr[0];
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi26Parcelizer + 33;
        IconCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        videoDownloadFGService.AudioAttributesCompatParcelizer();
        if (i3 == 0) {
            return null;
        }
        int i4 = 85 / 0;
        return null;
    }

    public static final /* synthetic */ void write(VideoDownloadFGService videoDownloadFGService, String str) throws Throwable {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 21;
        AudioAttributesImplApi26Parcelizer = i2 % 128;
        int i3 = i2 % 2;
        int iAudioAttributesCompatParcelizer = setEndIconDrawable.AudioAttributesCompatParcelizer();
        int iAudioAttributesCompatParcelizer2 = setEndIconDrawable.AudioAttributesCompatParcelizer();
        RemoteActionCompatParcelizer(setEndIconDrawable.AudioAttributesCompatParcelizer(), iAudioAttributesCompatParcelizer, setEndIconDrawable.AudioAttributesCompatParcelizer(), -1585530188, 1585530191, new Object[]{videoDownloadFGService, str}, iAudioAttributesCompatParcelizer2);
        int i4 = AudioAttributesImplApi26Parcelizer + 111;
        IconCompatParcelizer = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public final Object getUseCase$7db7d271() {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi26Parcelizer;
        int i3 = i2 + 121;
        IconCompatParcelizer = i3 % 128;
        int i4 = i3 % 2;
        Object obj = this.useCase;
        if (obj == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            return null;
        }
        int i5 = i2 + 61;
        IconCompatParcelizer = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 66 / 0;
        }
        return obj;
    }

    public final void setUseCase$4b7f6877(Object obj) {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi26Parcelizer + 15;
        IconCompatParcelizer = i2 % 128;
        if (i2 % 2 != 0) {
            toMagicModuleMetaRepoModel.write(obj, "");
            this.useCase = obj;
            throw null;
        }
        toMagicModuleMetaRepoModel.write(obj, "");
        this.useCase = obj;
        int i3 = AudioAttributesImplApi26Parcelizer + 51;
        IconCompatParcelizer = i3 % 128;
        int i4 = i3 % 2;
    }

    public final InitializationChunk getVideoAnalyticPublisher() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 89;
        AudioAttributesImplApi26Parcelizer = i3 % 128;
        int i4 = i3 % 2;
        InitializationChunk initializationChunk = this.videoAnalyticPublisher;
        if (initializationChunk != null) {
            int i5 = i2 + 91;
            AudioAttributesImplApi26Parcelizer = i5 % 128;
            if (i5 % 2 != 0) {
                return initializationChunk;
            }
            throw null;
        }
        toMagicModuleMetaRepoModel.IconCompatParcelizer("");
        int i6 = IconCompatParcelizer + 27;
        AudioAttributesImplApi26Parcelizer = i6 % 128;
        int i7 = i6 % 2;
        return null;
    }

    public final void setVideoAnalyticPublisher(InitializationChunk initializationChunk) {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi26Parcelizer + 87;
        IconCompatParcelizer = i2 % 128;
        if (i2 % 2 != 0) {
            toMagicModuleMetaRepoModel.write(initializationChunk, "");
            this.videoAnalyticPublisher = initializationChunk;
            throw null;
        }
        toMagicModuleMetaRepoModel.write(initializationChunk, "");
        this.videoAnalyticPublisher = initializationChunk;
        int i3 = AudioAttributesImplApi26Parcelizer + 95;
        IconCompatParcelizer = i3 % 128;
        int i4 = i3 % 2;
    }

    public final Object getDownloadJob$12849663() {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi26Parcelizer;
        int i3 = i2 + 87;
        IconCompatParcelizer = i3 % 128;
        int i4 = i3 % 2;
        Object obj = this.downloadJob;
        if (obj == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            return null;
        }
        int i5 = i2 + 105;
        IconCompatParcelizer = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 56 / 0;
        }
        return obj;
    }

    public final void setDownloadJob$5c6ddce9(Object obj) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 13;
        AudioAttributesImplApi26Parcelizer = i2 % 128;
        if (i2 % 2 == 0) {
            toMagicModuleMetaRepoModel.write(obj, "");
            this.downloadJob = obj;
            int i3 = 43 / 0;
        } else {
            toMagicModuleMetaRepoModel.write(obj, "");
            this.downloadJob = obj;
        }
        int i4 = IconCompatParcelizer + 69;
        AudioAttributesImplApi26Parcelizer = i4 % 128;
        int i5 = i4 % 2;
    }

    public final Object getNetworkObserver$4f979d99() {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi26Parcelizer + 115;
        int i3 = i2 % 128;
        IconCompatParcelizer = i3;
        int i4 = i2 % 2;
        Object obj = this.networkObserver;
        if (obj == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            return null;
        }
        int i5 = i3 + 95;
        AudioAttributesImplApi26Parcelizer = i5 % 128;
        if (i5 % 2 != 0) {
            return obj;
        }
        throw null;
    }

    public final void setNetworkObserver$60ccab25(Object obj) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 17;
        AudioAttributesImplApi26Parcelizer = i2 % 128;
        int i3 = i2 % 2;
        toMagicModuleMetaRepoModel.write(obj, "");
        this.networkObserver = obj;
        int i4 = AudioAttributesImplApi26Parcelizer + 35;
        IconCompatParcelizer = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    @Override // kotlin.shouldSkip, kotlin.trimByVisibility, android.app.Service
    public final void onCreate() throws Throwable {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi26Parcelizer + 77;
        IconCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        super.onCreate();
        read();
        int i4 = IconCompatParcelizer + 81;
        AudioAttributesImplApi26Parcelizer = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // kotlin.trimByVisibility, android.app.Service
    public final int onStartCommand(Intent p0, int p1, int p2) throws Throwable {
        Integer numValueOf;
        int i = 2 % 2;
        super.onStartCommand(p0, p1, p2);
        String stringExtra = null;
        if (p0 != null) {
            int i2 = AudioAttributesImplApi26Parcelizer + 121;
            IconCompatParcelizer = i2 % 128;
            int i3 = i2 % 2;
            numValueOf = Integer.valueOf(p0.getIntExtra("___type", 0));
        } else {
            numValueOf = null;
        }
        if (p0 != null) {
            int i4 = AudioAttributesImplApi26Parcelizer + 79;
            IconCompatParcelizer = i4 % 128;
            int i5 = i4 % 2;
            stringExtra = p0.getStringExtra("___lesson_id");
        }
        if (stringExtra != null) {
            AudioAttributesCompatParcelizer(stringExtra, numValueOf);
            IconCompatParcelizer(numValueOf, stringExtra);
            return 2;
        }
        stopSelf(p2);
        int i6 = AudioAttributesImplApi26Parcelizer + 125;
        IconCompatParcelizer = i6 % 128;
        int i7 = i6 % 2;
        return 2;
    }

    private final void IconCompatParcelizer(Integer p0, String p1) throws Throwable {
        int i = 2 % 2;
        fromMemberAnnotations frommemberannotationsRemoteActionCompatParcelizer = getInternalName.RemoteActionCompatParcelizer(this);
        try {
            Object[] objArr = {this, p0, p1, null};
            Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(764250982);
            if (objRemoteActionCompatParcelizer == null) {
                objRemoteActionCompatParcelizer = startForeground.read((char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 37462), 18216 - (AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), (TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 95, 1405374451, false, null, new Class[]{VideoDownloadFGService.class, Integer.class, String.class, SampleVideos.class});
            }
            C0201setMcqCount.IconCompatParcelizer(frommemberannotationsRemoteActionCompatParcelizer, null, null, (MagicModuleSubmissionRequestBody) ((Constructor) objRemoteActionCompatParcelizer).newInstance(objArr), 3);
            int i2 = IconCompatParcelizer + 113;
            AudioAttributesImplApi26Parcelizer = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 72 / 0;
            }
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    private final void write(String p0) throws Throwable {
        int i = 2 % 2;
        Object downloadJob$12849663 = getDownloadJob$12849663();
        try {
            Object[] objArr = {this, p0, null};
            Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-638346377);
            if (objRemoteActionCompatParcelizer == null) {
                objRemoteActionCompatParcelizer = startForeground.read((char) (1618 - View.MeasureSpec.makeMeasureSpec(0, 0)), View.MeasureSpec.getMode(0) + 18850, 94 - KeyEvent.normalizeMetaState(0), -1480957982, false, null, new Class[]{VideoDownloadFGService.class, String.class, SampleVideos.class});
            }
            Object[] objArr2 = {(MagicModuleSubmissionRequestBody) ((Constructor) objRemoteActionCompatParcelizer).newInstance(objArr)};
            Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-677719761);
            if (objRemoteActionCompatParcelizer2 == null) {
                objRemoteActionCompatParcelizer2 = startForeground.read((char) (62858 - ((Process.getThreadPriority(0) + 20) >> 6)), 18971 - TextUtils.indexOf((CharSequence) "", '0', 0), MotionEvent.axisFromString("") + 44, -1445784134, false, "read", new Class[]{MagicModuleSubmissionRequestBody.class});
            }
            ((Method) objRemoteActionCompatParcelizer2).invoke(downloadJob$12849663, objArr2);
            int i2 = AudioAttributesImplApi26Parcelizer + 31;
            IconCompatParcelizer = i2 % 128;
            int i3 = i2 % 2;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    private static void f(char c, int i, int i2, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        DownloadService downloadService = new DownloadService();
        long[] jArr = new long[i2];
        downloadService.write = 0;
        while (downloadService.write < i2) {
            int i4 = downloadService.write;
            try {
                Object[] objArr2 = {Integer.valueOf(read[i + i4])};
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(1659892375);
                if (objRemoteActionCompatParcelizer == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objRemoteActionCompatParcelizer = startForeground.read((char) (36621 - View.MeasureSpec.makeMeasureSpec(0, 0)), 2340 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (ViewConfiguration.getTapTimeout() >> 16) + 28, 480654850, false, $$n(b, b2, b2), new Class[]{Integer.TYPE});
                }
                try {
                    Object[] objArr3 = {Long.valueOf(((Long) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).longValue()), Long.valueOf(i4), Long.valueOf(AudioAttributesCompatParcelizer), Integer.valueOf(c)};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(955774634);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), 9702 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), 26 - KeyEvent.normalizeMetaState(0), 1186869823, false, "d", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                    }
                    jArr[i4] = ((Long) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).longValue();
                    try {
                        Object[] objArr4 = {downloadService, downloadService};
                        Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-452087292);
                        if (objRemoteActionCompatParcelizer3 == null) {
                            objRemoteActionCompatParcelizer3 = startForeground.read((char) View.getDefaultSize(0, 0), 23783 - TextUtils.indexOf((CharSequence) "", '0', 0), (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 32, -1690012015, false, "b", new Class[]{Object.class, Object.class});
                        }
                        ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
                        int i5 = $11 + 107;
                        $10 = i5 % 128;
                        int i6 = i5 % 2;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            } catch (Throwable th3) {
                Throwable cause3 = th3.getCause();
                if (cause3 == null) {
                    throw th3;
                }
                throw cause3;
            }
        }
        char[] cArr = new char[i2];
        downloadService.write = 0;
        while (downloadService.write < i2) {
            int i7 = $11 + 117;
            $10 = i7 % 128;
            if (i7 % 2 != 0) {
                cArr[downloadService.write] = (char) jArr[downloadService.write];
                Object[] objArr5 = {downloadService, downloadService};
                Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-452087292);
                if (objRemoteActionCompatParcelizer4 == null) {
                    objRemoteActionCompatParcelizer4 = startForeground.read((char) TextUtils.getOffsetAfter("", 0), 23784 - (ViewConfiguration.getKeyRepeatDelay() >> 16), TextUtils.getOffsetAfter("", 0) + 33, -1690012015, false, "b", new Class[]{Object.class, Object.class});
                }
                Object obj = null;
                ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5);
                obj.hashCode();
                throw null;
            }
            cArr[downloadService.write] = (char) jArr[downloadService.write];
            Object[] objArr6 = {downloadService, downloadService};
            Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(-452087292);
            if (objRemoteActionCompatParcelizer5 == null) {
                objRemoteActionCompatParcelizer5 = startForeground.read((char) (ViewConfiguration.getEdgeSlop() >> 16), 23784 - Color.blue(0), 33 - (KeyEvent.getMaxKeyCode() >> 16), -1690012015, false, "b", new Class[]{Object.class, Object.class});
            }
            ((Method) objRemoteActionCompatParcelizer5).invoke(null, objArr6);
        }
        objArr[0] = new String(cArr);
    }

    private final void AudioAttributesCompatParcelizer(String p0) throws Throwable {
        int i = 2 % 2;
        Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(1200052891);
        if (objRemoteActionCompatParcelizer == null) {
            objRemoteActionCompatParcelizer = startForeground.read((char) (5289 - (ViewConfiguration.getJumpTapTimeout() >> 16)), 19327 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (-16777195) - Color.rgb(0, 0, 0), 969842190, false, "INSTANCE", null);
        }
        Object obj = ((Field) objRemoteActionCompatParcelizer).get(null);
        try {
            Object[] objArr = {this, p0};
            Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-1138863211);
            if (objRemoteActionCompatParcelizer2 == null) {
                objRemoteActionCompatParcelizer2 = startForeground.read((char) (5289 - ExpandableListView.getPackedPositionGroup(0L)), (ViewConfiguration.getJumpTapTimeout() >> 16) + 19328, 22 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), -1034447104, false, "AudioAttributesCompatParcelizer", new Class[]{Context.class, String.class});
            }
            ((Method) objRemoteActionCompatParcelizer2).invoke(obj, objArr);
            RemoteActionCompatParcelizer(p0, 4);
            try {
                Object[] objArr2 = {true};
                Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(919445963);
                if (objRemoteActionCompatParcelizer3 == null) {
                    objRemoteActionCompatParcelizer3 = startForeground.read((char) (28867 - Color.argb(0, 0, 0, 0)), 19293 - (KeyEvent.getMaxKeyCode() >> 16), (ViewConfiguration.getPressedStateDuration() >> 16) + 22, 1216636254, false, null, new Class[]{Boolean.TYPE});
                }
                IconCompatParcelizer$3e9d3cda(((Constructor) objRemoteActionCompatParcelizer3).newInstance(objArr2));
                int i2 = AudioAttributesImplApi26Parcelizer + 71;
                IconCompatParcelizer = i2 % 128;
                int i3 = i2 % 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 == null) {
                throw th2;
            }
            throw cause2;
        }
    }

    private final void IconCompatParcelizer$3e9d3cda(Object p0) throws Throwable {
        int i = 2 % 2;
        Object downloadJob$12849663 = getDownloadJob$12849663();
        try {
            Object[] objArr = {this};
            Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(761954306);
            if (objRemoteActionCompatParcelizer == null) {
                objRemoteActionCompatParcelizer = startForeground.read((char) (29499 - View.MeasureSpec.makeMeasureSpec(0, 0)), 18041 - TextUtils.lastIndexOf("", '0', 0, 0), 20 - KeyEvent.keyCodeFromString(""), 1394820247, false, null, new Class[]{VideoDownloadFGService.class});
            }
            try {
                Object[] objArr2 = {p0, ((Constructor) objRemoteActionCompatParcelizer).newInstance(objArr)};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(543113632);
                if (objRemoteActionCompatParcelizer2 == null) {
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) ((KeyEvent.getMaxKeyCode() >> 16) + 62858), 18972 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), TextUtils.indexOf("", "", 0, 0) + 43, 1578534197, false, "IconCompatParcelizer", new Class[]{(Class) startForeground.IconCompatParcelizer((char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 55856), 19121 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), 17 - TextUtils.indexOf("", "", 0)), getAnswerMap.class});
                }
                ((Method) objRemoteActionCompatParcelizer2).invoke(downloadJob$12849663, objArr2);
                int i2 = IconCompatParcelizer + 5;
                AudioAttributesImplApi26Parcelizer = i2 % 128;
                int i3 = i2 % 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 == null) {
                throw th2;
            }
            throw cause2;
        }
    }

    private static final getShowPopup write$33407d51(VideoDownloadFGService videoDownloadFGService, Object obj) throws Throwable {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi26Parcelizer + 75;
        IconCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        toMagicModuleMetaRepoModel.write(obj, "");
        videoDownloadFGService.write$3e9d3cda(obj);
        getShowPopup getshowpopup = getShowPopup.INSTANCE;
        int i4 = IconCompatParcelizer + 39;
        AudioAttributesImplApi26Parcelizer = i4 % 128;
        int i5 = i4 % 2;
        return getshowpopup;
    }

    private final void AudioAttributesCompatParcelizer() throws Throwable {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi26Parcelizer + 7;
        IconCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        Object downloadJob$12849663 = getDownloadJob$12849663();
        try {
            Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1915716974);
            if (objRemoteActionCompatParcelizer == null) {
                objRemoteActionCompatParcelizer = startForeground.read((char) (62858 - (ViewConfiguration.getEdgeSlop() >> 16)), 18971 - Process.getGidForName(""), 42 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), -208028153, false, "read", new Class[0]);
            }
            if (!((Boolean) ((Method) objRemoteActionCompatParcelizer).invoke(downloadJob$12849663, null)).booleanValue()) {
                int i4 = IconCompatParcelizer + 99;
                AudioAttributesImplApi26Parcelizer = i4 % 128;
                if (i4 % 2 == 0) {
                    AudioAttributesCompatParcelizer(false);
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(1200052891);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) (5289 - TextUtils.indexOf("", "", 0)), 19328 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 21, 969842190, false, "INSTANCE", null);
                    }
                    Object[] objArr = {((Field) objRemoteActionCompatParcelizer2).get(null), this, null, 5, null};
                    Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1927061138);
                    if (objRemoteActionCompatParcelizer3 == null) {
                        objRemoteActionCompatParcelizer3 = startForeground.read((char) (5289 - Drawable.resolveOpacity(0, 0)), 19328 - Color.argb(0, 0, 0, 0), View.MeasureSpec.getMode(0) + 21, -211114501, false, "AudioAttributesCompatParcelizer$default", new Class[]{(Class) startForeground.IconCompatParcelizer((char) (5289 - Color.alpha(0)), 19328 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 20), Context.class, String.class, Integer.TYPE, Object.class});
                    }
                    ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr);
                    return;
                }
                AudioAttributesCompatParcelizer(true);
                Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(1200052891);
                if (objRemoteActionCompatParcelizer4 == null) {
                    objRemoteActionCompatParcelizer4 = startForeground.read((char) (5290 - (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1))), View.resolveSize(0, 0) + 19328, 21 - TextUtils.indexOf("", "", 0, 0), 969842190, false, "INSTANCE", null);
                }
                Object[] objArr2 = {((Field) objRemoteActionCompatParcelizer4).get(null), this, null, 2, null};
                Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(-1927061138);
                if (objRemoteActionCompatParcelizer5 == null) {
                    objRemoteActionCompatParcelizer5 = startForeground.read((char) (View.resolveSize(0, 0) + 5289), 19327 - TextUtils.lastIndexOf("", '0', 0), (KeyEvent.getMaxKeyCode() >> 16) + 21, -211114501, false, "AudioAttributesCompatParcelizer$default", new Class[]{(Class) startForeground.IconCompatParcelizer((char) (TextUtils.getTrimmedLength("") + 5289), 19327 - TextUtils.lastIndexOf("", '0', 0, 0), 21 - View.resolveSizeAndState(0, 0, 0)), Context.class, String.class, Integer.TYPE, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer5).invoke(null, objArr2);
            }
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    private final void AudioAttributesCompatParcelizer(boolean p0) throws Throwable {
        int i = 2 % 2;
        if (p0) {
            int i2 = IconCompatParcelizer + 125;
            AudioAttributesImplApi26Parcelizer = i2 % 128;
            try {
                if (i2 % 2 == 0) {
                    stopForeground(0);
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(723570348);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) (7220 - (Process.myPid() >> 22)), 19315 - (ViewConfiguration.getWindowTouchSlop() >> 8), 13 - (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), 1432947257, false, "AudioAttributesCompatParcelizer", null);
                    }
                    Object obj = ((Field) objRemoteActionCompatParcelizer).get(null);
                    Object[] objArr = {this, 0, null};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-1495856321);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        char keyRepeatDelay = (char) (7220 - (ViewConfiguration.getKeyRepeatDelay() >> 16));
                        int iLastIndexOf = TextUtils.lastIndexOf("", '0') + 19316;
                        int iIndexOf = 13 - TextUtils.indexOf("", "", 0);
                        byte b = $$j[10];
                        Object[] objArr2 = new Object[1];
                        e(b, r4[13], b, objArr2);
                        objRemoteActionCompatParcelizer2 = startForeground.read(keyRepeatDelay, iLastIndexOf, iIndexOf, -660680790, false, (String) objArr2[0], new Class[]{Context.class, Integer.TYPE, Notification.class});
                    }
                    ((Method) objRemoteActionCompatParcelizer2).invoke(obj, objArr);
                } else {
                    stopForeground(1);
                    Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(723570348);
                    if (objRemoteActionCompatParcelizer3 == null) {
                        objRemoteActionCompatParcelizer3 = startForeground.read((char) (Gravity.getAbsoluteGravity(0, 0) + 7220), 19315 - (ViewConfiguration.getJumpTapTimeout() >> 16), KeyEvent.getDeadChar(0, 0) + 13, 1432947257, false, "AudioAttributesCompatParcelizer", null);
                    }
                    Object obj2 = ((Field) objRemoteActionCompatParcelizer3).get(null);
                    Object[] objArr3 = {this, 1, null};
                    Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-1495856321);
                    if (objRemoteActionCompatParcelizer4 == null) {
                        char cIndexOf = (char) (TextUtils.indexOf("", "", 0, 0) + 7220);
                        int iIndexOf2 = 19314 - TextUtils.indexOf((CharSequence) "", '0', 0, 0);
                        int iArgb = Color.argb(0, 0, 0, 0) + 13;
                        byte b2 = $$j[10];
                        Object[] objArr4 = new Object[1];
                        e(b2, r4[13], b2, objArr4);
                        objRemoteActionCompatParcelizer4 = startForeground.read(cIndexOf, iIndexOf2, iArgb, -660680790, false, (String) objArr4[0], new Class[]{Context.class, Integer.TYPE, Notification.class});
                    }
                    ((Method) objRemoteActionCompatParcelizer4).invoke(obj2, objArr3);
                }
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        } else {
            stopForeground(2);
            int i3 = IconCompatParcelizer + 43;
            AudioAttributesImplApi26Parcelizer = i3 % 128;
            int i4 = i3 % 2;
        }
        stopSelf();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void AudioAttributesCompatParcelizer(java.lang.String r14, java.lang.Integer r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 294
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow2.core.services.video_download.VideoDownloadFGService.AudioAttributesCompatParcelizer(java.lang.String, java.lang.Integer):void");
    }

    public final void IconCompatParcelizer(String p0, String p1) throws Throwable {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 17;
        AudioAttributesImplApi26Parcelizer = i2 % 128;
        try {
            if (i2 % 2 == 0) {
                toMagicModuleMetaRepoModel.write(p0, "");
                toMagicModuleMetaRepoModel.write(p1, "");
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(723570348);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) (7220 - (TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1))), Color.red(0) + 19315, View.MeasureSpec.getMode(0) + 13, 1432947257, false, "AudioAttributesCompatParcelizer", null);
                }
                Object[] objArr = {((Field) objRemoteActionCompatParcelizer).get(null), this, p0, p1, getString(R.string.starting_download), Float.valueOf(1.0f), 61, null};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(563376043);
                if (objRemoteActionCompatParcelizer2 == null) {
                    char cIndexOf = (char) (7220 - TextUtils.indexOf("", "", 0, 0));
                    int iMyPid = 19315 - (Process.myPid() >> 22);
                    int offsetBefore = TextUtils.getOffsetBefore("", 0) + 13;
                    byte[] bArr = $$j;
                    Object[] objArr2 = new Object[1];
                    e(bArr[24], bArr[10], bArr[21], objArr2);
                    objRemoteActionCompatParcelizer2 = startForeground.read(cIndexOf, iMyPid, offsetBefore, 1608362814, false, (String) objArr2[0], new Class[]{(Class) startForeground.IconCompatParcelizer((char) (7219 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), 19315 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), TextUtils.indexOf((CharSequence) "", '0') + 14), Service.class, String.class, String.class, String.class, Float.TYPE, Integer.TYPE, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr);
                return;
            }
            toMagicModuleMetaRepoModel.write(p0, "");
            toMagicModuleMetaRepoModel.write(p1, "");
            Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(723570348);
            if (objRemoteActionCompatParcelizer3 == null) {
                objRemoteActionCompatParcelizer3 = startForeground.read((char) (7220 - (ViewConfiguration.getPressedStateDuration() >> 16)), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 19314, 13 - (ViewConfiguration.getScrollBarSize() >> 8), 1432947257, false, "AudioAttributesCompatParcelizer", null);
            }
            Object[] objArr3 = {((Field) objRemoteActionCompatParcelizer3).get(null), this, p0, p1, getString(R.string.starting_download), Float.valueOf(BitmapDescriptorFactory.HUE_RED), 16, null};
            Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(563376043);
            if (objRemoteActionCompatParcelizer4 == null) {
                char gidForName = (char) (Process.getGidForName("") + 7221);
                int windowTouchSlop = 19315 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                int doubleTapTimeout = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 13;
                byte[] bArr2 = $$j;
                Object[] objArr4 = new Object[1];
                e(bArr2[24], bArr2[10], bArr2[21], objArr4);
                objRemoteActionCompatParcelizer4 = startForeground.read(gidForName, windowTouchSlop, doubleTapTimeout, 1608362814, false, (String) objArr4[0], new Class[]{(Class) startForeground.IconCompatParcelizer((char) (7220 - Gravity.getAbsoluteGravity(0, 0)), 19315 - View.combineMeasuredStates(0, 0), 13 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))), Service.class, String.class, String.class, String.class, Float.TYPE, Integer.TYPE, Object.class});
            }
            ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr3);
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    public final void RemoteActionCompatParcelizer(String p0, String p1, float p2, String p3) throws Throwable {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi26Parcelizer + 65;
        IconCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        toMagicModuleMetaRepoModel.write(p3, "");
        Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(723570348);
        if (objRemoteActionCompatParcelizer == null) {
            objRemoteActionCompatParcelizer = startForeground.read((char) ((ViewConfiguration.getScrollBarSize() >> 8) + 7220), 19314 - TextUtils.indexOf((CharSequence) "", '0', 0), 14 - (AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), 1432947257, false, "AudioAttributesCompatParcelizer", null);
        }
        Object obj = ((Field) objRemoteActionCompatParcelizer).get(null);
        try {
            Object[] objArr = {this, p0, p1, p3, Float.valueOf(p2)};
            Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-1357882464);
            if (objRemoteActionCompatParcelizer2 == null) {
                char cLastIndexOf = (char) (7219 - TextUtils.lastIndexOf("", '0', 0, 0));
                int iKeyCodeFromString = KeyEvent.keyCodeFromString("") + 19315;
                int iResolveOpacity = Drawable.resolveOpacity(0, 0) + 13;
                byte b = (byte) ($$k - 2);
                byte[] bArr = $$j;
                Object[] objArr2 = new Object[1];
                e(b, bArr[36], bArr[9], objArr2);
                objRemoteActionCompatParcelizer2 = startForeground.read(cLastIndexOf, iKeyCodeFromString, iResolveOpacity, -782655691, false, (String) objArr2[0], new Class[]{Service.class, String.class, String.class, String.class, Float.TYPE});
            }
            ((Method) objRemoteActionCompatParcelizer2).invoke(obj, objArr);
            Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(1200052891);
            if (objRemoteActionCompatParcelizer3 == null) {
                objRemoteActionCompatParcelizer3 = startForeground.read((char) (5289 - ((Process.getThreadPriority(0) + 20) >> 6)), 19328 - (ViewConfiguration.getDoubleTapTimeout() >> 16), View.MeasureSpec.getSize(0) + 21, 969842190, false, "INSTANCE", null);
            }
            Object obj2 = ((Field) objRemoteActionCompatParcelizer3).get(null);
            Object[] objArr3 = {this, p0, Float.valueOf(p2)};
            Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(1257716957);
            if (objRemoteActionCompatParcelizer4 == null) {
                objRemoteActionCompatParcelizer4 = startForeground.read((char) (5289 - Gravity.getAbsoluteGravity(0, 0)), 19327 - ExpandableListView.getPackedPositionChild(0L), 20 - TextUtils.lastIndexOf("", '0', 0, 0), 884930632, false, "IconCompatParcelizer", new Class[]{Context.class, String.class, Float.TYPE});
            }
            ((Method) objRemoteActionCompatParcelizer4).invoke(obj2, objArr3);
            int i4 = AudioAttributesImplApi26Parcelizer + 51;
            IconCompatParcelizer = i4 % 128;
            int i5 = i4 % 2;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    public final void read(String p0, String p1) throws Throwable {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi26Parcelizer + 111;
        IconCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        buildResolutionString.read(getClass(), "onExtractionStarted");
        Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(723570348);
        if (objRemoteActionCompatParcelizer == null) {
            objRemoteActionCompatParcelizer = startForeground.read((char) (TextUtils.lastIndexOf("", '0', 0) + 7221), ((Process.getThreadPriority(0) + 20) >> 6) + 19315, (ViewConfiguration.getLongPressTimeout() >> 16) + 13, 1432947257, false, "AudioAttributesCompatParcelizer", null);
        }
        Object obj = ((Field) objRemoteActionCompatParcelizer).get(null);
        try {
            Object[] objArr = {this, p0, p1};
            Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-1241075115);
            if (objRemoteActionCompatParcelizer2 == null) {
                char cMyTid = (char) ((Process.myTid() >> 22) + 7220);
                int i4 = (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 19314;
                int i5 = 13 - (AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1));
                byte[] bArr = $$j;
                Object[] objArr2 = new Object[1];
                e(bArr[24], bArr[10], bArr[21], objArr2);
                objRemoteActionCompatParcelizer2 = startForeground.read(cMyTid, i4, i5, -934316352, false, (String) objArr2[0], new Class[]{Service.class, String.class, String.class});
            }
            ((Method) objRemoteActionCompatParcelizer2).invoke(obj, objArr);
            int i6 = IconCompatParcelizer + 61;
            AudioAttributesImplApi26Parcelizer = i6 % 128;
            int i7 = i6 % 2;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    private static void g(boolean z, byte[] bArr, int[] iArr, Object[] objArr) throws Throwable {
        char[] cArr;
        int i = 2 % 2;
        buildSetStopReasonIntent buildsetstopreasonintent = new buildSetStopReasonIntent();
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        char[] cArr2 = RemoteActionCompatParcelizer;
        Object obj = null;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            for (int i6 = 0; i6 < length; i6++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i6])};
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-338863922);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) Color.argb(0, 0, 0, 0), 11613 - View.MeasureSpec.makeMeasureSpec(0, 0), 21 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), -1786471333, false, "u", new Class[]{Integer.TYPE});
                    }
                    cArr3[i6] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
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
        char[] cArr4 = new char[i3];
        System.arraycopy(cArr2, i2, cArr4, 0, i3);
        if (bArr != null) {
            char[] cArr5 = new char[i3];
            buildsetstopreasonintent.RemoteActionCompatParcelizer = 0;
            char c = 0;
            while (buildsetstopreasonintent.RemoteActionCompatParcelizer < i3) {
                if (bArr[buildsetstopreasonintent.RemoteActionCompatParcelizer] == 1) {
                    int i7 = $11 + 13;
                    $10 = i7 % 128;
                    if (i7 % 2 != 0) {
                        int i8 = buildsetstopreasonintent.RemoteActionCompatParcelizer;
                        Object[] objArr3 = {Integer.valueOf(cArr4[buildsetstopreasonintent.RemoteActionCompatParcelizer]), Integer.valueOf(c)};
                        Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-1429458299);
                        if (objRemoteActionCompatParcelizer2 == null) {
                            objRemoteActionCompatParcelizer2 = startForeground.read((char) ('0' - AndroidCharacter.getMirror('0')), TextUtils.indexOf((CharSequence) "", '0') + 22960, (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 43, -729418224, false, "x", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr5[i8] = ((Character) ((Method) objRemoteActionCompatParcelizer2).invoke(obj, objArr3)).charValue();
                        int i9 = 32 / 0;
                    } else {
                        int i10 = buildsetstopreasonintent.RemoteActionCompatParcelizer;
                        Object[] objArr4 = {Integer.valueOf(cArr4[buildsetstopreasonintent.RemoteActionCompatParcelizer]), Integer.valueOf(c)};
                        Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1429458299);
                        if (objRemoteActionCompatParcelizer3 == null) {
                            objRemoteActionCompatParcelizer3 = startForeground.read((char) ((Process.getThreadPriority(0) + 20) >> 6), 22959 - Drawable.resolveOpacity(0, 0), 44 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), -729418224, false, "x", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr5[i10] = ((Character) ((Method) objRemoteActionCompatParcelizer3).invoke(obj, objArr4)).charValue();
                    }
                } else {
                    int i11 = buildsetstopreasonintent.RemoteActionCompatParcelizer;
                    Object[] objArr5 = {Integer.valueOf(cArr4[buildsetstopreasonintent.RemoteActionCompatParcelizer]), Integer.valueOf(c)};
                    Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(1859710730);
                    if (objRemoteActionCompatParcelizer4 == null) {
                        objRemoteActionCompatParcelizer4 = startForeground.read((char) (31588 - TextUtils.lastIndexOf("", '0', 0)), 9863 - Color.red(0), (ViewConfiguration.getFadingEdgeLength() >> 16) + 65, 277949343, false, "v", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr5[i11] = ((Character) ((Method) objRemoteActionCompatParcelizer4).invoke(obj, objArr5)).charValue();
                }
                c = cArr5[buildsetstopreasonintent.RemoteActionCompatParcelizer];
                Object[] objArr6 = {buildsetstopreasonintent, buildsetstopreasonintent};
                Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(1104966666);
                if (objRemoteActionCompatParcelizer5 == null) {
                    objRemoteActionCompatParcelizer5 = startForeground.read((char) (ExpandableListView.getPackedPositionChild(0L) + 37823), 9754 - Color.blue(0), 27 - KeyEvent.getDeadChar(0, 0), 1066774687, false, "B", new Class[]{Object.class, Object.class});
                }
                obj = null;
                ((Method) objRemoteActionCompatParcelizer5).invoke(null, objArr6);
            }
            cArr4 = cArr5;
        }
        if (i5 > 0) {
            char[] cArr6 = new char[i3];
            System.arraycopy(cArr4, 0, cArr6, 0, i3);
            int i12 = i3 - i5;
            System.arraycopy(cArr6, 0, cArr4, i12, i5);
            System.arraycopy(cArr6, i5, cArr4, 0, i12);
        }
        if (z) {
            int i13 = $10 + 27;
            $11 = i13 % 128;
            if (i13 % 2 == 0) {
                cArr = new char[i3];
                buildsetstopreasonintent.RemoteActionCompatParcelizer = 1;
            } else {
                cArr = new char[i3];
                buildsetstopreasonintent.RemoteActionCompatParcelizer = 0;
            }
            while (buildsetstopreasonintent.RemoteActionCompatParcelizer < i3) {
                int i14 = $10 + 79;
                $11 = i14 % 128;
                int i15 = i14 % 2;
                cArr[buildsetstopreasonintent.RemoteActionCompatParcelizer] = cArr4[(i3 - buildsetstopreasonintent.RemoteActionCompatParcelizer) - 1];
                buildsetstopreasonintent.RemoteActionCompatParcelizer++;
            }
            cArr4 = cArr;
        }
        if (i4 > 0) {
            int i16 = $11 + 5;
            $10 = i16 % 128;
            if (i16 % 2 != 0) {
                buildsetstopreasonintent.RemoteActionCompatParcelizer = 1;
            } else {
                buildsetstopreasonintent.RemoteActionCompatParcelizer = 0;
            }
            while (buildsetstopreasonintent.RemoteActionCompatParcelizer < i3) {
                int i17 = $10 + 43;
                $11 = i17 % 128;
                if (i17 % 2 == 0) {
                    cArr4[buildsetstopreasonintent.RemoteActionCompatParcelizer] = (char) (cArr4[buildsetstopreasonintent.RemoteActionCompatParcelizer] >>> iArr[5]);
                    buildsetstopreasonintent.RemoteActionCompatParcelizer = buildsetstopreasonintent.RemoteActionCompatParcelizer;
                } else {
                    cArr4[buildsetstopreasonintent.RemoteActionCompatParcelizer] = (char) (cArr4[buildsetstopreasonintent.RemoteActionCompatParcelizer] - iArr[2]);
                    buildsetstopreasonintent.RemoteActionCompatParcelizer++;
                }
            }
        }
        objArr[0] = new String(cArr4);
    }

    public final void RemoteActionCompatParcelizer$5bd1d356(String p0, String p1, Object p2) throws Throwable {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 57;
        AudioAttributesImplApi26Parcelizer = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            toMagicModuleMetaRepoModel.write(p1, "");
            toMagicModuleMetaRepoModel.write(p2, "");
            ((Class) startForeground.IconCompatParcelizer((char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), 23784 - (ViewConfiguration.getWindowTouchSlop() >> 8), 33 - KeyEvent.normalizeMetaState(0))).isInstance(p2);
            throw null;
        }
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        toMagicModuleMetaRepoModel.write(p2, "");
        try {
            if (((Class) startForeground.IconCompatParcelizer((char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), 23784 - (ViewConfiguration.getKeyRepeatDelay() >> 16), TextUtils.getTrimmedLength("") + 33)).isInstance(p2)) {
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(1200052891);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) (5289 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))), (ViewConfiguration.getFadingEdgeLength() >> 16) + 19328, (TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 21, 969842190, false, "INSTANCE", null);
                }
                Object obj2 = ((Field) objRemoteActionCompatParcelizer).get(null);
                VideoDownloadFGService videoDownloadFGService = this;
                Object[] objArr = {videoDownloadFGService, p0};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-1138863211);
                if (objRemoteActionCompatParcelizer2 == null) {
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) ((TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 5289), 19328 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 22 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), -1034447104, false, "AudioAttributesCompatParcelizer", new Class[]{Context.class, String.class});
                }
                ((Method) objRemoteActionCompatParcelizer2).invoke(obj2, objArr);
                Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(1003438116);
                if (objRemoteActionCompatParcelizer3 == null) {
                    objRemoteActionCompatParcelizer3 = startForeground.read((char) View.resolveSize(0, 0), TextUtils.lastIndexOf("", '0') + 23785, 34 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), 1166443697, false, "AudioAttributesCompatParcelizer", new Class[0]);
                }
                if (((Boolean) ((Method) objRemoteActionCompatParcelizer3).invoke(p2, null)).booleanValue()) {
                    Object[] objArr2 = {true};
                    Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(919445963);
                    if (objRemoteActionCompatParcelizer4 == null) {
                        objRemoteActionCompatParcelizer4 = startForeground.read((char) (MotionEvent.axisFromString("") + 28868), (AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 19293, (KeyEvent.getMaxKeyCode() >> 16) + 22, 1216636254, false, null, new Class[]{Boolean.TYPE});
                    }
                    IconCompatParcelizer$3e9d3cda(((Constructor) objRemoteActionCompatParcelizer4).newInstance(objArr2));
                    return;
                }
                if (!getIsInitSegment.write(videoDownloadFGService)) {
                    Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(723570348);
                    if (objRemoteActionCompatParcelizer5 == null) {
                        objRemoteActionCompatParcelizer5 = startForeground.read((char) (TextUtils.getCapsMode("", 0, 0) + 7220), (ViewConfiguration.getEdgeSlop() >> 16) + 19315, 13 - KeyEvent.normalizeMetaState(0), 1432947257, false, "AudioAttributesCompatParcelizer", null);
                    }
                    Object[] objArr3 = {((Field) objRemoteActionCompatParcelizer5).get(null), this, p0, p1, getString(R.string.waiting_for_internet), Float.valueOf(BitmapDescriptorFactory.HUE_RED), 16, null};
                    Object objRemoteActionCompatParcelizer6 = startForeground.RemoteActionCompatParcelizer(563376043);
                    if (objRemoteActionCompatParcelizer6 == null) {
                        char cLastIndexOf = (char) (7219 - TextUtils.lastIndexOf("", '0', 0, 0));
                        int windowTouchSlop = 19315 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                        int i3 = 14 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                        byte[] bArr = $$j;
                        Object[] objArr4 = new Object[1];
                        e(bArr[24], bArr[10], bArr[21], objArr4);
                        objRemoteActionCompatParcelizer6 = startForeground.read(cLastIndexOf, windowTouchSlop, i3, 1608362814, false, (String) objArr4[0], new Class[]{(Class) startForeground.IconCompatParcelizer((char) (View.MeasureSpec.getSize(0) + 7220), (TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 19315, TextUtils.getOffsetAfter("", 0) + 13), Service.class, String.class, String.class, String.class, Float.TYPE, Integer.TYPE, Object.class});
                    }
                    ((Method) objRemoteActionCompatParcelizer6).invoke(null, objArr3);
                    return;
                }
                int i4 = AudioAttributesImplApi26Parcelizer + 91;
                IconCompatParcelizer = i4 % 128;
                if (i4 % 2 == 0) {
                    Object objRemoteActionCompatParcelizer7 = startForeground.RemoteActionCompatParcelizer(723570348);
                    if (objRemoteActionCompatParcelizer7 == null) {
                        objRemoteActionCompatParcelizer7 = startForeground.read((char) (7220 - (TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1))), 19315 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), 13 - ExpandableListView.getPackedPositionType(0L), 1432947257, false, "AudioAttributesCompatParcelizer", null);
                    }
                    Object obj3 = ((Field) objRemoteActionCompatParcelizer7).get(null);
                    Object[] objArr5 = {this, p0, p1, getString(R.string.internet_issue)};
                    Object objRemoteActionCompatParcelizer8 = startForeground.RemoteActionCompatParcelizer(817974824);
                    if (objRemoteActionCompatParcelizer8 == null) {
                        char maxKeyCode = (char) ((KeyEvent.getMaxKeyCode() >> 16) + 7220);
                        int i5 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 19314;
                        int iMyPid = (Process.myPid() >> 22) + 13;
                        byte b = (byte) ($$k - 2);
                        byte[] bArr2 = $$j;
                        Object[] objArr6 = new Object[1];
                        e(b, bArr2[36], bArr2[9], objArr6);
                        objRemoteActionCompatParcelizer8 = startForeground.read(maxKeyCode, i5, iMyPid, 1317571261, false, (String) objArr6[0], new Class[]{Service.class, String.class, String.class, String.class});
                    }
                    ((Method) objRemoteActionCompatParcelizer8).invoke(obj3, objArr5);
                    return;
                }
                Object objRemoteActionCompatParcelizer9 = startForeground.RemoteActionCompatParcelizer(723570348);
                if (objRemoteActionCompatParcelizer9 == null) {
                    objRemoteActionCompatParcelizer9 = startForeground.read((char) (Color.blue(0) + 7220), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 19315, Color.alpha(0) + 13, 1432947257, false, "AudioAttributesCompatParcelizer", null);
                }
                Object obj4 = ((Field) objRemoteActionCompatParcelizer9).get(null);
                Object[] objArr7 = {this, p0, p1, getString(R.string.internet_issue)};
                Object objRemoteActionCompatParcelizer10 = startForeground.RemoteActionCompatParcelizer(817974824);
                if (objRemoteActionCompatParcelizer10 == null) {
                    char packedPositionChild = (char) (7219 - ExpandableListView.getPackedPositionChild(0L));
                    int minimumFlingVelocity = 19315 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                    int iBlue = Color.blue(0) + 13;
                    byte b2 = (byte) ($$k - 2);
                    byte[] bArr3 = $$j;
                    Object[] objArr8 = new Object[1];
                    e(b2, bArr3[36], bArr3[9], objArr8);
                    objRemoteActionCompatParcelizer10 = startForeground.read(packedPositionChild, minimumFlingVelocity, iBlue, 1317571261, false, (String) objArr8[0], new Class[]{Service.class, String.class, String.class, String.class});
                }
                ((Method) objRemoteActionCompatParcelizer10).invoke(obj4, objArr7);
                obj.hashCode();
                throw null;
            }
            if (((Class) startForeground.IconCompatParcelizer((char) (View.combineMeasuredStates(0, 0) + 49531), (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 23816, (ViewConfiguration.getScrollDefaultDelay() >> 16) + 56)).isInstance(p2)) {
                Object objRemoteActionCompatParcelizer11 = startForeground.RemoteActionCompatParcelizer(1200052891);
                if (objRemoteActionCompatParcelizer11 == null) {
                    objRemoteActionCompatParcelizer11 = startForeground.read((char) (5289 - (ViewConfiguration.getLongPressTimeout() >> 16)), 19328 - Gravity.getAbsoluteGravity(0, 0), 21 - ((Process.getThreadPriority(0) + 20) >> 6), 969842190, false, "INSTANCE", null);
                }
                Object obj5 = ((Field) objRemoteActionCompatParcelizer11).get(null);
                VideoDownloadFGService videoDownloadFGService2 = this;
                Object objRemoteActionCompatParcelizer12 = startForeground.RemoteActionCompatParcelizer(1813249822);
                if (objRemoteActionCompatParcelizer12 == null) {
                    objRemoteActionCompatParcelizer12 = startForeground.read((char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 49531), 23816 - TextUtils.lastIndexOf("", '0', 0, 0), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 55, 307903371, false, "IconCompatParcelizer", new Class[0]);
                }
                Object[] objArr9 = {videoDownloadFGService2, p0, ((Method) objRemoteActionCompatParcelizer12).invoke(p2, null)};
                Object objRemoteActionCompatParcelizer13 = startForeground.RemoteActionCompatParcelizer(-302842921);
                if (objRemoteActionCompatParcelizer13 == null) {
                    objRemoteActionCompatParcelizer13 = startForeground.read((char) ((Process.myPid() >> 22) + 5289), ExpandableListView.getPackedPositionChild(0L) + 19329, 22 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), -1816445118, false, "AudioAttributesCompatParcelizer", new Class[]{Context.class, String.class, String.class});
                }
                ((Method) objRemoteActionCompatParcelizer13).invoke(obj5, objArr9);
                Object objRemoteActionCompatParcelizer14 = startForeground.RemoteActionCompatParcelizer(723570348);
                if (objRemoteActionCompatParcelizer14 == null) {
                    objRemoteActionCompatParcelizer14 = startForeground.read((char) (AndroidCharacter.getMirror('0') + 7172), KeyEvent.keyCodeFromString("") + 19315, 13 - ExpandableListView.getPackedPositionType(0L), 1432947257, false, "AudioAttributesCompatParcelizer", null);
                }
                Object obj6 = ((Field) objRemoteActionCompatParcelizer14).get(null);
                VideoDownloadFGService videoDownloadFGService3 = this;
                Object objRemoteActionCompatParcelizer15 = startForeground.RemoteActionCompatParcelizer(1813249822);
                if (objRemoteActionCompatParcelizer15 == null) {
                    objRemoteActionCompatParcelizer15 = startForeground.read((char) (49530 - TextUtils.indexOf((CharSequence) "", '0', 0)), Color.alpha(0) + 23817, Color.argb(0, 0, 0, 0) + 56, 307903371, false, "IconCompatParcelizer", new Class[0]);
                }
                Object[] objArr10 = {videoDownloadFGService3, p0, p1, ((Method) objRemoteActionCompatParcelizer15).invoke(p2, null)};
                Object objRemoteActionCompatParcelizer16 = startForeground.RemoteActionCompatParcelizer(320313241);
                if (objRemoteActionCompatParcelizer16 == null) {
                    char cResolveOpacity = (char) (7220 - Drawable.resolveOpacity(0, 0));
                    int iAxisFromString = 19314 - MotionEvent.axisFromString("");
                    int i6 = (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 12;
                    byte b3 = (byte) (-$$j[71]);
                    Object[] objArr11 = new Object[1];
                    e(b3, (byte) (b3 >>> 1), (byte) ($$k - 5), objArr11);
                    objRemoteActionCompatParcelizer16 = startForeground.read(cResolveOpacity, iAxisFromString, i6, 1834898188, false, (String) objArr11[0], new Class[]{Service.class, String.class, String.class, String.class});
                }
                ((Method) objRemoteActionCompatParcelizer16).invoke(obj6, objArr10);
                Object[] objArr12 = {false};
                Object objRemoteActionCompatParcelizer17 = startForeground.RemoteActionCompatParcelizer(919445963);
                if (objRemoteActionCompatParcelizer17 == null) {
                    objRemoteActionCompatParcelizer17 = startForeground.read((char) ((Process.myTid() >> 22) + 28867), 19293 - KeyEvent.getDeadChar(0, 0), 22 - (ViewConfiguration.getScrollDefaultDelay() >> 16), 1216636254, false, null, new Class[]{Boolean.TYPE});
                }
                IconCompatParcelizer$3e9d3cda(((Constructor) objRemoteActionCompatParcelizer17).newInstance(objArr12));
                return;
            }
            Object objRemoteActionCompatParcelizer18 = startForeground.RemoteActionCompatParcelizer(-2096222183);
            if (objRemoteActionCompatParcelizer18 == null) {
                objRemoteActionCompatParcelizer18 = startForeground.read((char) (TextUtils.indexOf((CharSequence) "", '0') + 1), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 23736, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 47, -45615988, false, "INSTANCE", null);
            }
            if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p2, ((Field) objRemoteActionCompatParcelizer18).get(null))) {
                int i7 = AudioAttributesImplApi26Parcelizer + 27;
                IconCompatParcelizer = i7 % 128;
                int i8 = i7 % 2;
                Object objRemoteActionCompatParcelizer19 = startForeground.RemoteActionCompatParcelizer(723570348);
                if (objRemoteActionCompatParcelizer19 == null) {
                    objRemoteActionCompatParcelizer19 = startForeground.read((char) (Color.green(0) + 7220), 19315 - (ViewConfiguration.getScrollBarSize() >> 8), TextUtils.indexOf("", "", 0) + 13, 1432947257, false, "AudioAttributesCompatParcelizer", null);
                }
                Object[] objArr13 = {((Field) objRemoteActionCompatParcelizer19).get(null), this, p0, p1, getString(R.string.waiting_for_internet), Float.valueOf(BitmapDescriptorFactory.HUE_RED), 16, null};
                Object objRemoteActionCompatParcelizer20 = startForeground.RemoteActionCompatParcelizer(563376043);
                if (objRemoteActionCompatParcelizer20 == null) {
                    char gidForName = (char) (Process.getGidForName("") + 7221);
                    int iMyTid = (Process.myTid() >> 22) + 19315;
                    int keyRepeatTimeout = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 13;
                    byte[] bArr4 = $$j;
                    Object[] objArr14 = new Object[1];
                    e(bArr4[24], bArr4[10], bArr4[21], objArr14);
                    objRemoteActionCompatParcelizer20 = startForeground.read(gidForName, iMyTid, keyRepeatTimeout, 1608362814, false, (String) objArr14[0], new Class[]{(Class) startForeground.IconCompatParcelizer((char) (7220 - TextUtils.indexOf("", "")), 19315 - Color.red(0), 13 - (ViewConfiguration.getTouchSlop() >> 8)), Service.class, String.class, String.class, String.class, Float.TYPE, Integer.TYPE, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer20).invoke(null, objArr13);
                return;
            }
            Object objRemoteActionCompatParcelizer21 = startForeground.RemoteActionCompatParcelizer(1363110498);
            if (objRemoteActionCompatParcelizer21 == null) {
                objRemoteActionCompatParcelizer21 = startForeground.read((char) (View.resolveSizeAndState(0, 0, 0) + 10469), 23935 - (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), 72 - Color.blue(0), 796307191, false, "INSTANCE", null);
            }
            if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p2, ((Field) objRemoteActionCompatParcelizer21).get(null))) {
                AudioAttributesCompatParcelizer(p0);
                return;
            }
            if (((Class) startForeground.IconCompatParcelizer((char) (TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), TextUtils.indexOf((CharSequence) "", '0', 0) + 23705, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 32)).isInstance(p2)) {
                Object objRemoteActionCompatParcelizer22 = startForeground.RemoteActionCompatParcelizer(-1838968456);
                if (objRemoteActionCompatParcelizer22 == null) {
                    objRemoteActionCompatParcelizer22 = startForeground.read((char) ('0' - AndroidCharacter.getMirror('0')), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 23704, 32 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), -332769811, false, "write", new Class[0]);
                }
                write$3e9d3cda(((Method) objRemoteActionCompatParcelizer22).invoke(p2, null));
                int i9 = IconCompatParcelizer + 63;
                AudioAttributesImplApi26Parcelizer = i9 % 128;
                if (i9 % 2 != 0) {
                    return;
                }
                obj.hashCode();
                throw null;
            }
            if (!((Class) startForeground.IconCompatParcelizer((char) (TextUtils.indexOf("", "", 0, 0) + 6614), 23873 - View.MeasureSpec.getSize(0), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 62)).isInstance(p2)) {
                if (!((Class) startForeground.IconCompatParcelizer((char) Color.argb(0, 0, 0, 0), 23645 - (ViewConfiguration.getEdgeSlop() >> 16), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 59)).isInstance(p2)) {
                    throw new RenewEligibleCreator();
                }
                Object objRemoteActionCompatParcelizer23 = startForeground.RemoteActionCompatParcelizer(1200052891);
                if (objRemoteActionCompatParcelizer23 == null) {
                    objRemoteActionCompatParcelizer23 = startForeground.read((char) (5289 - ExpandableListView.getPackedPositionType(0L)), (ViewConfiguration.getTouchSlop() >> 8) + 19328, 21 - Color.green(0), 969842190, false, "INSTANCE", null);
                }
                Object obj7 = ((Field) objRemoteActionCompatParcelizer23).get(null);
                Object[] objArr15 = {this, p0};
                Object objRemoteActionCompatParcelizer24 = startForeground.RemoteActionCompatParcelizer(-1138863211);
                if (objRemoteActionCompatParcelizer24 == null) {
                    objRemoteActionCompatParcelizer24 = startForeground.read((char) (TextUtils.indexOf("", "") + 5289), ((Process.getThreadPriority(0) + 20) >> 6) + 19328, View.getDefaultSize(0, 0) + 21, -1034447104, false, "AudioAttributesCompatParcelizer", new Class[]{Context.class, String.class});
                }
                ((Method) objRemoteActionCompatParcelizer24).invoke(obj7, objArr15);
                return;
            }
            Object objRemoteActionCompatParcelizer25 = startForeground.RemoteActionCompatParcelizer(1200052891);
            if (objRemoteActionCompatParcelizer25 == null) {
                objRemoteActionCompatParcelizer25 = startForeground.read((char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 5289), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 19327, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 20, 969842190, false, "INSTANCE", null);
            }
            Object obj8 = ((Field) objRemoteActionCompatParcelizer25).get(null);
            VideoDownloadFGService videoDownloadFGService4 = this;
            Object objRemoteActionCompatParcelizer26 = startForeground.RemoteActionCompatParcelizer(-316674164);
            if (objRemoteActionCompatParcelizer26 == null) {
                objRemoteActionCompatParcelizer26 = startForeground.read((char) (6614 - View.MeasureSpec.makeMeasureSpec(0, 0)), 23873 - (ViewConfiguration.getJumpTapTimeout() >> 16), (TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 62, -1823069415, false, "AudioAttributesCompatParcelizer", new Class[0]);
            }
            Object[] objArr16 = {videoDownloadFGService4, p0, ((Method) objRemoteActionCompatParcelizer26).invoke(p2, null)};
            Object objRemoteActionCompatParcelizer27 = startForeground.RemoteActionCompatParcelizer(-302842921);
            if (objRemoteActionCompatParcelizer27 == null) {
                objRemoteActionCompatParcelizer27 = startForeground.read((char) (5289 - ExpandableListView.getPackedPositionGroup(0L)), TextUtils.indexOf((CharSequence) "", '0') + 19329, 22 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), -1816445118, false, "AudioAttributesCompatParcelizer", new Class[]{Context.class, String.class, String.class});
            }
            ((Method) objRemoteActionCompatParcelizer27).invoke(obj8, objArr16);
            Object objRemoteActionCompatParcelizer28 = startForeground.RemoteActionCompatParcelizer(723570348);
            if (objRemoteActionCompatParcelizer28 == null) {
                objRemoteActionCompatParcelizer28 = startForeground.read((char) ((ViewConfiguration.getEdgeSlop() >> 16) + 7220), 19315 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 14 - (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), 1432947257, false, "AudioAttributesCompatParcelizer", null);
            }
            Object obj9 = ((Field) objRemoteActionCompatParcelizer28).get(null);
            VideoDownloadFGService videoDownloadFGService5 = this;
            Object objRemoteActionCompatParcelizer29 = startForeground.RemoteActionCompatParcelizer(873716836);
            if (objRemoteActionCompatParcelizer29 == null) {
                objRemoteActionCompatParcelizer29 = startForeground.read((char) ((-16770602) - Color.rgb(0, 0, 0)), ExpandableListView.getPackedPositionChild(0L) + 23874, 61 - TextUtils.lastIndexOf("", '0'), 1247418609, false, "read", new Class[0]);
            }
            Object[] objArr17 = {videoDownloadFGService5, p0, p1, ((Method) objRemoteActionCompatParcelizer29).invoke(p2, null)};
            Object objRemoteActionCompatParcelizer30 = startForeground.RemoteActionCompatParcelizer(320313241);
            if (objRemoteActionCompatParcelizer30 == null) {
                char jumpTapTimeout = (char) (7220 - (ViewConfiguration.getJumpTapTimeout() >> 16));
                int i10 = 19316 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                int mode = View.MeasureSpec.getMode(0) + 13;
                byte b4 = (byte) (-$$j[71]);
                Object[] objArr18 = new Object[1];
                e(b4, (byte) (b4 >>> 1), (byte) ($$k - 5), objArr18);
                objRemoteActionCompatParcelizer30 = startForeground.read(jumpTapTimeout, i10, mode, 1834898188, false, (String) objArr18[0], new Class[]{Service.class, String.class, String.class, String.class});
            }
            ((Method) objRemoteActionCompatParcelizer30).invoke(obj9, objArr17);
            Object objRemoteActionCompatParcelizer31 = startForeground.RemoteActionCompatParcelizer(1838022677);
            if (objRemoteActionCompatParcelizer31 == null) {
                objRemoteActionCompatParcelizer31 = startForeground.read((char) (6613 - TextUtils.lastIndexOf("", '0', 0, 0)), 23872 - TextUtils.lastIndexOf("", '0', 0, 0), TextUtils.lastIndexOf("", '0', 0, 0) + 63, 331859072, false, "write", new Class[0]);
            }
            Object[] objArr19 = {Boolean.valueOf(((Boolean) ((Method) objRemoteActionCompatParcelizer31).invoke(p2, null)).booleanValue())};
            Object objRemoteActionCompatParcelizer32 = startForeground.RemoteActionCompatParcelizer(919445963);
            if (objRemoteActionCompatParcelizer32 == null) {
                objRemoteActionCompatParcelizer32 = startForeground.read((char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 28867), (AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 19293, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 23, 1216636254, false, null, new Class[]{Boolean.TYPE});
            }
            IconCompatParcelizer$3e9d3cda(((Constructor) objRemoteActionCompatParcelizer32).newInstance(objArr19));
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    private void write$3e9d3cda(Object p0) throws Throwable {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 45;
        AudioAttributesImplApi26Parcelizer = i2 % 128;
        int i3 = i2 % 2;
        toMagicModuleMetaRepoModel.write(p0, "");
        try {
            if (((Class) startForeground.IconCompatParcelizer((char) TextUtils.indexOf("", "", 0, 0), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 19269, Color.red(0) + 23)).isInstance(p0)) {
                fromMemberAnnotations frommemberannotationsRemoteActionCompatParcelizer = getInternalName.RemoteActionCompatParcelizer(this);
                Object[] objArr = {p0, this, null};
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(871949780);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) KeyEvent.normalizeMetaState(0), 18782 - TextUtils.getTrimmedLength(""), MotionEvent.axisFromString("") + 69, 1303454017, false, null, new Class[]{(Class) startForeground.IconCompatParcelizer((char) (55856 - (KeyEvent.getMaxKeyCode() >> 16)), Gravity.getAbsoluteGravity(0, 0) + 19120, 17 - TextUtils.indexOf("", "", 0, 0)), VideoDownloadFGService.class, SampleVideos.class});
                }
                C0201setMcqCount.IconCompatParcelizer(frommemberannotationsRemoteActionCompatParcelizer, null, null, (MagicModuleSubmissionRequestBody) ((Constructor) objRemoteActionCompatParcelizer).newInstance(objArr), 3);
                return;
            }
            Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(1878932737);
            if (objRemoteActionCompatParcelizer2 == null) {
                objRemoteActionCompatParcelizer2 = startForeground.read((char) (TextUtils.lastIndexOf("", '0', 0, 0) + 35584), 19136 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), Drawable.resolveOpacity(0, 0) + 49, 297269652, false, "INSTANCE", null);
            }
            if (!(!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, ((Field) objRemoteActionCompatParcelizer2).get(null)))) {
                write();
                return;
            }
            Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-80790034);
            if (objRemoteActionCompatParcelizer3 == null) {
                objRemoteActionCompatParcelizer3 = startForeground.read((char) TextUtils.indexOf("", "", 0, 0), 19186 - (ViewConfiguration.getEdgeSlop() >> 16), Color.alpha(0) + 46, -2056849029, false, "INSTANCE", null);
            }
            if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, ((Field) objRemoteActionCompatParcelizer3).get(null))) {
                AudioAttributesCompatParcelizer(true);
                int i4 = AudioAttributesImplApi26Parcelizer + 125;
                IconCompatParcelizer = i4 % 128;
                int i5 = i4 % 2;
                return;
            }
            Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(1262722737);
            if (objRemoteActionCompatParcelizer4 == null) {
                objRemoteActionCompatParcelizer4 = startForeground.read((char) KeyEvent.normalizeMetaState(0), Color.red(0) + 19232, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 37, 889870884, false, "INSTANCE", null);
            }
            if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, ((Field) objRemoteActionCompatParcelizer4).get(null))) {
                if (!((Class) startForeground.IconCompatParcelizer((char) (Color.green(0) + 28867), (AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 19292, (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 22)).isInstance(p0)) {
                    throw new RenewEligibleCreator();
                }
                Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(1838908217);
                if (objRemoteActionCompatParcelizer5 == null) {
                    objRemoteActionCompatParcelizer5 = startForeground.read((char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 28867), 19293 - (ViewConfiguration.getFadingEdgeLength() >> 16), 22 - (ViewConfiguration.getLongPressTimeout() >> 16), 332548012, false, "read", new Class[0]);
                }
                AudioAttributesCompatParcelizer(((Boolean) ((Method) objRemoteActionCompatParcelizer5).invoke(p0, null)).booleanValue());
            }
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    private final void write() throws Throwable {
        int i = 2 % 2;
        fromMemberAnnotations frommemberannotationsRemoteActionCompatParcelizer = getInternalName.RemoteActionCompatParcelizer(this);
        try {
            Object[] objArr = {this, null};
            Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-2018185585);
            if (objRemoteActionCompatParcelizer == null) {
                objRemoteActionCompatParcelizer = startForeground.read((char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 18132 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), 84 - TextUtils.getCapsMode("", 0, 0), -100849126, false, null, new Class[]{VideoDownloadFGService.class, SampleVideos.class});
            }
            C0201setMcqCount.IconCompatParcelizer(frommemberannotationsRemoteActionCompatParcelizer, null, null, (MagicModuleSubmissionRequestBody) ((Constructor) objRemoteActionCompatParcelizer).newInstance(objArr), 3);
            int i2 = AudioAttributesImplApi26Parcelizer + 41;
            IconCompatParcelizer = i2 % 128;
            int i3 = i2 % 2;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    private final void read() throws Throwable {
        int i = 2 % 2;
        fromMemberAnnotations frommemberannotationsRemoteActionCompatParcelizer = getInternalName.RemoteActionCompatParcelizer(this);
        try {
            Object[] objArr = {this, null};
            Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1287431246);
            if (objRemoteActionCompatParcelizer == null) {
                objRemoteActionCompatParcelizer = startForeground.read((char) (46743 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), 18310 - Color.blue(0), 92 - (ViewConfiguration.getWindowTouchSlop() >> 8), -854941913, false, null, new Class[]{VideoDownloadFGService.class, SampleVideos.class});
            }
            C0201setMcqCount.IconCompatParcelizer(frommemberannotationsRemoteActionCompatParcelizer, null, null, (MagicModuleSubmissionRequestBody) ((Constructor) objRemoteActionCompatParcelizer).newInstance(objArr), 3);
            int i2 = IconCompatParcelizer + 85;
            AudioAttributesImplApi26Parcelizer = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    private final void RemoteActionCompatParcelizer(String p0, int p1) {
        int i = 2 % 2;
        getVideoAnalyticPublisher().read(new DownloadAnalyticEvent(p1, VideoTimelineResponseBody.AudioAttributesCompatParcelizer(setAction.write("lesson_id", p0))));
        int i2 = IconCompatParcelizer + 69;
        AudioAttributesImplApi26Parcelizer = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 62 / 0;
        }
    }

    private static /* synthetic */ Object read(Object[] objArr) throws Throwable {
        VideoDownloadFGService videoDownloadFGService = (VideoDownloadFGService) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        int iIntValue2 = ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi26Parcelizer + 119;
        IconCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        super.onTimeout(iIntValue, iIntValue2);
        buildResolutionString.IconCompatParcelizer("SERVICE TIMEOUT", "onTimeout: TIMEOUT CALLED");
        videoDownloadFGService.RemoteActionCompatParcelizer("", 5);
        videoDownloadFGService.AudioAttributesCompatParcelizer(true);
        int i4 = IconCompatParcelizer + 107;
        AudioAttributesImplApi26Parcelizer = i4 % 128;
        if (i4 % 2 != 0) {
            return null;
        }
        throw null;
    }

    @Override // kotlin.trimByVisibility, android.app.Service
    public final void onDestroy() throws Throwable {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 125;
        AudioAttributesImplApi26Parcelizer = i2 % 128;
        int i3 = i2 % 2;
        Object downloadJob$12849663 = getDownloadJob$12849663();
        try {
            Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1509956450);
            if (objRemoteActionCompatParcelizer == null) {
                objRemoteActionCompatParcelizer = startForeground.read((char) (TextUtils.indexOf("", "", 0, 0) + 62858), (ViewConfiguration.getWindowTouchSlop() >> 8) + 18972, 43 - (Process.myTid() >> 22), -608821237, false, "AudioAttributesCompatParcelizer", new Class[0]);
            }
            ((Method) objRemoteActionCompatParcelizer).invoke(downloadJob$12849663, null);
            super.onDestroy();
            int i4 = IconCompatParcelizer + 101;
            AudioAttributesImplApi26Parcelizer = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 72 / 0;
            }
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(40:0|2|(2:(2:9|(1:15)(1:14))(1:16)|(9:18|284|19|(1:21)|22|23|24|(1:26)|27)(1:7))(0)|31|277|(26:33|(4:35|36|(3:38|41|(1:43)(9:44|292|51|(1:53)|54|282|55|(1:57)|58))|45)(3:39|(2:41|(0)(0))|45)|82|296|83|(2:278|85)|89|90|(5:92|93|(1:95)|96|97)(22:98|99|291|100|101|280|102|(1:104)|105|106|304|107|(1:109)|110|111|112|(1:114)|115|(1:117)|118|(1:120)|121)|122|(5:125|126|(13:309|128|(3:130|(3:133|134|131)|313)|135|294|136|(1:138)|139|140|141|285|142|312)(1:311)|310|123)|308|181|(1:183)|184|(3:186|(1:188)|189)(13:191|287|192|193|(1:195)|196|306|197|198|(1:200)|201|(1:203)|204)|190|205|(6:207|208|(1:210)|211|212|213)|214|(1:216)|217|(2:219|(4:221|(1:223)|224|225)(3:226|(1:228)|229))(14:231|232|(1:234)|235|236|(1:238)|239|298|240|241|(1:243)|244|(1:246)|247)|230|248|(7:250|251|(1:253)|254|255|256|257)(1:314))(1:49)|50|292|51|(0)|54|282|55|(0)|58|82|296|83|(0)|89|90|(0)(0)|122|(1:123)|308|181|(0)|184|(0)(0)|190|205|(0)|214|(0)|217|(0)(0)|230|248|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x0a92, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x0a93, code lost:
    
        r10 = r28;
     */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0958  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0b2e A[Catch: all -> 0x0348, TryCatch #4 {all -> 0x0348, blocks: (B:208:0x0fb3, B:210:0x0fb9, B:211:0x0fe2, B:251:0x14de, B:253:0x14e4, B:254:0x1512, B:232:0x126b, B:234:0x128a, B:235:0x12d9, B:175:0x0b28, B:177:0x0b2e, B:178:0x0b5b, B:76:0x049f, B:78:0x04a5, B:79:0x04cf, B:19:0x00ee, B:21:0x00f4, B:22:0x011c, B:24:0x02b8, B:26:0x02e5, B:27:0x0340, B:36:0x0361, B:41:0x036f, B:62:0x0448, B:64:0x044e, B:65:0x044f, B:67:0x0451, B:69:0x0458, B:70:0x0459, B:45:0x037c, B:39:0x0369, B:55:0x03ca, B:57:0x03d7, B:58:0x043e, B:51:0x0388, B:53:0x0399, B:54:0x03c4), top: B:284:0x00ee, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0bed  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0c3a  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0c95  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0f94  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x1070  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x10c0  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x117d  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x14be  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x0560 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:314:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0378  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0379  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0399 A[Catch: all -> 0x0450, TryCatch #9 {all -> 0x0450, blocks: (B:51:0x0388, B:53:0x0399, B:54:0x03c4), top: B:292:0x0388, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x03d7 A[Catch: all -> 0x0446, TryCatch #3 {all -> 0x0446, blocks: (B:55:0x03ca, B:57:0x03d7, B:58:0x043e), top: B:282:0x03ca, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x05b5  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0611 A[Catch: all -> 0x0a92, TRY_ENTER, TRY_LEAVE, TryCatch #11 {all -> 0x0a92, blocks: (B:83:0x055a, B:89:0x05a8, B:98:0x0611), top: B:296:0x055a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static /* synthetic */ java.lang.Object RemoteActionCompatParcelizer(java.lang.Object[] r36) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 5694
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow2.core.services.video_download.VideoDownloadFGService.RemoteActionCompatParcelizer(java.lang.Object[]):java.lang.Object");
    }

    public static /* synthetic */ getShowPopup RemoteActionCompatParcelizer$33407d51(VideoDownloadFGService videoDownloadFGService, Object obj) throws Throwable {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi26Parcelizer + 63;
        IconCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        getShowPopup getshowpopupWrite$33407d51 = write$33407d51(videoDownloadFGService, obj);
        if (i3 != 0) {
            int i4 = 87 / 0;
        }
        int i5 = AudioAttributesImplApi26Parcelizer + 123;
        IconCompatParcelizer = i5 % 128;
        if (i5 % 2 == 0) {
            return getshowpopupWrite$33407d51;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    static {
        AudioAttributesImplBaseParcelizer = 0;
        RemoteActionCompatParcelizer();
        try {
            Object[] objArr = {null};
            Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(1332128347);
            if (objRemoteActionCompatParcelizer == null) {
                objRemoteActionCompatParcelizer = startForeground.read((char) ((ViewConfiguration.getTapTimeout() >> 16) + 38891), 18062 - View.MeasureSpec.getMode(0), Color.green(0) + 69, 825192142, false, null, new Class[]{MagicModuleRepositoryImplExternalSyntheticLambda0.class});
            }
            write = ((Constructor) objRemoteActionCompatParcelizer).newInstance(objArr);
            int i = MediaBrowserCompatCustomActionResultReceiver + 55;
            AudioAttributesImplBaseParcelizer = i % 128;
            if (i % 2 != 0) {
                int i2 = 9 / 0;
            }
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    public static final /* synthetic */ void AudioAttributesCompatParcelizer(VideoDownloadFGService videoDownloadFGService, boolean z) throws Throwable {
        Object[] objArr = {videoDownloadFGService, Boolean.valueOf(z)};
        RemoteActionCompatParcelizer(setEndIconDrawable.AudioAttributesCompatParcelizer(), setEndIconDrawable.AudioAttributesCompatParcelizer(), setEndIconDrawable.AudioAttributesCompatParcelizer(), -1199573964, 1199573966, objArr, setEndIconDrawable.AudioAttributesCompatParcelizer());
    }

    public static final /* synthetic */ void AudioAttributesCompatParcelizer(VideoDownloadFGService videoDownloadFGService) throws Throwable {
        int iAudioAttributesCompatParcelizer = setEndIconDrawable.AudioAttributesCompatParcelizer();
        int iAudioAttributesCompatParcelizer2 = setEndIconDrawable.AudioAttributesCompatParcelizer();
        RemoteActionCompatParcelizer(setEndIconDrawable.AudioAttributesCompatParcelizer(), iAudioAttributesCompatParcelizer, setEndIconDrawable.AudioAttributesCompatParcelizer(), 1659327457, -1659327457, new Object[]{videoDownloadFGService}, iAudioAttributesCompatParcelizer2);
    }

    private final void IconCompatParcelizer(String p0) throws Throwable {
        int iAudioAttributesCompatParcelizer = setEndIconDrawable.AudioAttributesCompatParcelizer();
        int iAudioAttributesCompatParcelizer2 = setEndIconDrawable.AudioAttributesCompatParcelizer();
        RemoteActionCompatParcelizer(setEndIconDrawable.AudioAttributesCompatParcelizer(), iAudioAttributesCompatParcelizer, setEndIconDrawable.AudioAttributesCompatParcelizer(), -1585530188, 1585530191, new Object[]{this, p0}, iAudioAttributesCompatParcelizer2);
    }

    public final void AudioAttributesCompatParcelizer(String p0, String p1) throws Throwable {
        int iAudioAttributesCompatParcelizer = setEndIconDrawable.AudioAttributesCompatParcelizer();
        int iAudioAttributesCompatParcelizer2 = setEndIconDrawable.AudioAttributesCompatParcelizer();
        RemoteActionCompatParcelizer(setEndIconDrawable.AudioAttributesCompatParcelizer(), iAudioAttributesCompatParcelizer, setEndIconDrawable.AudioAttributesCompatParcelizer(), -1492357739, 1492357743, new Object[]{this, p0, p1}, iAudioAttributesCompatParcelizer2);
    }

    public final void onTimeout(int p0, int p1) throws Throwable {
        Object[] objArr = {this, Integer.valueOf(p0), Integer.valueOf(p1)};
        RemoteActionCompatParcelizer(setEndIconDrawable.AudioAttributesCompatParcelizer(), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 483492874, setEndIconDrawable.AudioAttributesCompatParcelizer(), -673195862, 673195867, objArr, setEndIconDrawable.AudioAttributesCompatParcelizer());
    }

    @Override // kotlin.shouldSkip, kotlin.trimByVisibility, android.app.Service, android.content.ContextWrapper
    public final void attachBaseContext(Context context) throws Throwable {
        int iWrite = zaac.write();
        int iAudioAttributesCompatParcelizer = setEndIconDrawable.AudioAttributesCompatParcelizer();
        RemoteActionCompatParcelizer(zaac.write(), iWrite, zaac.write(), 1802753324, -1802753323, new Object[]{this, context}, iAudioAttributesCompatParcelizer);
    }

    static void RemoteActionCompatParcelizer() {
        read = new char[]{40103, 38590, 34958, 33526, 46321, 44737, 40998, 55922, 52249, 50803, 63540, 62052, 58812, 8119, 4497, 3049, 15829, 14275, 56430, 54827, 51265, 49706, 62565, 61008, 57579, 39598, 36056, 34478, 47333, 45775, 42300, 24435, 20828, 19234, 32084, 30491, 27106, 25503, 5510, 4083, 475, 15300, 11813, 8271, 55892, 52327, 50775, 63556, 62121, 58526, 40696, 37051, 35543, 48491, 46965, 43335, 41851, 21808, 20301, 16824, 31733, 28046, 26535, 6624, 5064, 1639, 14361, 12894, 9254, 56847, 53317, 51892, 64667, 63189, 59629, 57992, 38085, 36732, 33042, 47877, 44398, 42846, 20922, 23483, 17822, 20469, 31221, 25567, 16414, 18955, 21602, 24153, 26690, 29296, 31897, 1671, 4273, 6866, 9366, 12006, 14658, 49951, 52524, 55120, 57720, 60269, 62861, 65463, 35318, 37840, 40440, 43003, 45658, 48189, 18033, 20556, 23155, 25655, 28379, 30944, 733, 3227, 5878, 8472, 12763, 15302, 9707, 12178, 6599, 947, 3412, 30533, 24934, 27481, 21822, 24378, 18634, 45787, 48352, 42646, 49543, 52124, 54695, 57282, 59842, 62441, 64798, 34573, 37142, 39753, 42305, 44916, 47269, 17055, 19646, 22209, 56429, 54900, 51268, 49724, 62523, 60939, 57580, 39608, 36051, 34489, 47358, 45741, 42365, 24417, 20812, 19235, 32001, 30521, 27116, 25537, 5591, 4009, 28786, 31341, 25690, 28197, 22588, 16924, 19703, 14047, 8386, 10928, 5287, 7825, 2422, 62308, 64838, 34721, 36273, 37760, 39395, 45044, 46541, 47910, 49469, 55068, 56677, 58233};
        AudioAttributesCompatParcelizer = 3007956162278708762L;
        RemoteActionCompatParcelizer = new char[]{44990, 45036, 45026, 45049, 45037, 44947, 44993, 44992, 44987, 44987, 44984, 44992, 44992, 44999, 44997, 44978, 44997, 45039, 44998, 44987, 44995, 45038, 44992, 44984, 44998, 45039, 45039, 44997, 44988, 44990, 44991, 44993, 45035, 45032, 45033, 45038, 44993, 44984, 44998, 45038, 45039, 44997, 44978, 44988, 44989, 44988, 44993, 44999, 44998, 45032, 45032, 45033, 44999, 44967, 45011, 45050, 45051, 45050, 44802, 44803, 45049, 45008, 45010, 45008, 45011, 45022, 45020, 45009, 45010, 45028, 45028, 45029, 44803, 44802, 44813, 45050, 45009, 45010, 45023, 45020, 45050, 45050, 45028, 45029, 45020, 45022, 45023, 45010, 45014, 45010, 45022, 45023, 45031, 45051, 45008, 45008, 45009, 45009, 45051, 44813, 44813, 45029, 45051, 45028, 45022, 45031, 44813, 45051, 45008, 45011, 45008, 45050, 45050, 45021, 45031, 44813, 45031, 44976, 45028, 45031, 45049, 45051, 45027, 45031, 45031, 44992, 44986, 45022, 45016, 45019, 45049, 45030, 45036, 45024, 45025, 44998, 44998, 45030, 45026, 44994, 44996, 45028, 45027, 44994, 44995, 45025, 45027, 45025, 45049, 45048, 45025, 45025, 45027, 45025, 45028, 44992, 45019, 45049, 45024, 45032, 45025, 45024, 45033, 45025, 45031, 45028, 45019, 45018, 45025, 45027, 45051, 45048, 45050, 45055, 45048, 45024, 45039, 45032, 44995, 44965, 44990, 45020, 45051, 45048, 45051, 44884, 44887, 44887, 44886, 44887, 44885, 44907, 44907, 44884, 44887};
    }
}
