package kotlin;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.fragment.app.FragmentManager;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow.R;
import in.juspay.hyper.constants.LogCategory;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.zzgo;
import kotlin.zzgr;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\u0003J\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0016\u0010\u000f\u001a\u00020\r8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000b\u0010\u000e"}, d2 = {"Lo/zzfl;", "Lo/addObserverForBackInvoker;", "<init>", "()V", "Landroid/os/Bundle;", "p0", "", "onCreate", "(Landroid/os/Bundle;)V", "AudioAttributesImplApi21Parcelizer", "", "IconCompatParcelizer", "(Ljava/lang/String;)V", "Lo/parseUtcTiming;", "Lo/parseUtcTiming;", "AudioAttributesCompatParcelizer", "RemoteActionCompatParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class zzfl extends zzfo {
    private static long AudioAttributesCompatParcelizer;
    private static int AudioAttributesImplApi21Parcelizer;
    private static char AudioAttributesImplApi26Parcelizer;
    private static char AudioAttributesImplBaseParcelizer;
    private static char MediaBrowserCompatCustomActionResultReceiver;
    private static char MediaBrowserCompatItemReceiver;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static int read;
    private static char write;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private parseUtcTiming AudioAttributesCompatParcelizer;
    private static final byte[] $$c = {70, -23, 8, 77};
    private static final int $$f = 70;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$j = {99, -29, 19, 27, TarConstants.LF_FIFO, -68, -9, -26, 21, -38, -16, 8, -22, 31, -62, 4, -11, -10, -24, 2, -10, 21, -60, -8, 6, -30, 0, -17, -10, 14, -41, 68, -40, -63, 6, -16, -17, 35, -62, -11, -9, -2, -4, -30, -10, 4, -25, 37, -55, -9, -14, 4, -30, 25, -28, -28, 4, -13, -18, -8, -28, 10, -24, 2, -7, -14, -30, -19, -13, -16, 4, 25, -45, -28, 0, -17, -10, 32, -55, -9, -14, 4, -30, 25, -28, -28, 4, -13, -18, -8, -28, 10, -24, TarConstants.LF_FIFO, -68, -9, -26, 35, -52, -10, -17, 22, -33, -28, 10, 5, -36, -6, -22, 69, -57, -30, -19, -13, -16, 4, 25, -45, -28, 0, -17, -10, 32, -55, -9, -14, 4, -30, 25, -28, -28, 4, -13, -18, -8, -28, 10, -24, 8};
    private static final int $$k = 162;
    private static final byte[] $$d = {TarConstants.LF_SYMLINK, 124, -128, 125, 25, 0, 6, -7, -30, TarConstants.LF_LINK, -2, 9, -3, -13, 14, -46, 45, -1, 4, -14, 20, -48, TarConstants.LF_CHR, -1, 2, -4, -1, -43, 35, 18, -10, 7, 0, -27, 20, 15, 3, -8, 9, -33, 20, -1, 3, 5, 14, -16, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 0, 32, 18, 18, -14, 3, 8, -2, 18, -20, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 5, 27, 18, 18, -14, 3, 8, -2, 18, -20, 14, -12, -3, 4, 25, 0, 6, -7, -30, TarConstants.LF_LINK, -2, 9, -3, -13, 14, -46, 45, -1, 4, -14, 20, -42, 44, -14, 9, -26, 20, -1, 3, 5, 14, -16, 14, 27, 13, 0, -42, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14, 20, 9, 3, 6, -14, -35, 35, 18, -10, 7, 0, -42, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -47, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14};
    private static final int $$e = 182;
    private static int MediaBrowserCompatMediaItem = 0;
    private static int MediaDescriptionCompat = 1;
    private static int RatingCompat = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$i(byte r6, short r7, byte r8) {
        /*
            int r7 = r7 * 4
            int r7 = 4 - r7
            int r6 = r6 * 19
            int r6 = 122 - r6
            byte[] r0 = kotlin.zzfl.$$c
            int r8 = r8 * 2
            int r1 = r8 + 1
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L17
            r6 = r7
            r3 = r8
            r4 = r2
            goto L2d
        L17:
            r3 = r2
        L18:
            r5 = r7
            r7 = r6
            r6 = r5
            byte r4 = (byte) r7
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r8) goto L28
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L28:
            r3 = r0[r6]
            r5 = r7
            r7 = r6
            r6 = r5
        L2d:
            int r7 = r7 + 1
            int r6 = r6 + r3
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.zzfl.$$i(byte, short, byte):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void g(short r7, int r8, short r9, java.lang.Object[] r10) {
        /*
            int r9 = r9 + 4
            byte[] r0 = kotlin.zzfl.$$d
            int r7 = 114 - r7
            int r8 = 191 - r8
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L11
            r7 = r8
            r3 = r9
            r5 = r2
            goto L26
        L11:
            r3 = r2
        L12:
            byte r4 = (byte) r7
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r9) goto L21
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L21:
            r3 = r0[r8]
            r6 = r8
            r8 = r7
            r7 = r6
        L26:
            int r8 = r8 + r3
            int r8 = r8 + (-1)
            int r7 = r7 + 1
            r3 = r5
            r6 = r8
            r8 = r7
            r7 = r6
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.zzfl.g(short, int, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void h(byte r6, short r7, short r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 + 82
            byte[] r0 = kotlin.zzfl.$$j
            int r8 = 60 - r8
            int r6 = r6 + 4
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L11
            r7 = r6
            r3 = r8
            r4 = r2
            goto L2a
        L11:
            r3 = r2
        L12:
            int r6 = r6 + 1
            byte r4 = (byte) r7
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r8) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L23:
            r4 = r0[r6]
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2a:
            int r6 = -r6
            int r3 = r3 + r6
            int r6 = r3 + (-11)
            r3 = r4
            r5 = r7
            r7 = r6
            r6 = r5
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.zzfl.h(byte, short, short, java.lang.Object[]):void");
    }

    /* JADX INFO: renamed from: o.zzfl$RemoteActionCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u0005H\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/marrow2/ui/recent_updates/activity/RecentUpdatesActivity$Companion;", "", "<init>", "()V", "KEY_RECENT_UPDATE_ID", "", "getLaunchIntent", "Landroid/content/Intent;", LogCategory.CONTEXT, "Landroid/content/Context;", "id", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @getMagicModuleMeta
        public static Intent AudioAttributesCompatParcelizer(Context context, String str) {
            toMagicModuleMetaRepoModel.write(context, "");
            toMagicModuleMetaRepoModel.write(str, "");
            Intent intent = new Intent(context, (Class<?>) zzfl.class);
            intent.putExtra("recent_update_id", str);
            return intent;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    private static void f(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        isStopped isstopped = new isStopped();
        char[] cArr2 = new char[cArr.length];
        isstopped.read = 0;
        char[] cArr3 = new char[2];
        while (isstopped.read < cArr.length) {
            cArr3[0] = cArr[isstopped.read];
            cArr3[1] = cArr[isstopped.read + 1];
            int i3 = 58224;
            for (int i4 = 0; i4 < 16; i4++) {
                int i5 = $10 + 7;
                $11 = i5 % 128;
                int i6 = i5 % 2;
                char c = cArr3[1];
                char c2 = cArr3[0];
                try {
                    Object[] objArr2 = {Integer.valueOf(c), Integer.valueOf((c2 + i3) ^ ((c2 << 4) + ((char) (((long) MediaBrowserCompatItemReceiver) ^ 1193402106669854891L)))), Integer.valueOf(c2 >>> 5), Integer.valueOf(MediaBrowserCompatCustomActionResultReceiver)};
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(815477582);
                    if (objRemoteActionCompatParcelizer == null) {
                        byte b = (byte) 0;
                        byte b2 = b;
                        objRemoteActionCompatParcelizer = startForeground.read((char) (ImageFormat.getBitsPerPixel(0) + 1), ((byte) KeyEvent.getModifierMetaStateMask()) + 1505, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 20, 1322448859, false, $$i(b, b2, b2), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    char cCharValue = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    Object[] objArr3 = {Integer.valueOf(cArr3[0]), Integer.valueOf((cCharValue + i3) ^ ((cCharValue << 4) + ((char) (((long) AudioAttributesImplBaseParcelizer) ^ 1193402106669854891L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(AudioAttributesImplApi26Parcelizer)};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(815477582);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), MotionEvent.axisFromString("") + 1505, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 22, 1322448859, false, $$i(b3, b4, b4), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[0] = ((Character) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).charValue();
                    i3 -= 40503;
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
                objRemoteActionCompatParcelizer3 = startForeground.read((char) View.MeasureSpec.getMode(0), 9016 - (AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), AndroidCharacter.getMirror('0') + '\n', -1950993821, false, "D", new Class[]{Object.class, Object.class});
            }
            ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
            int i7 = $11 + 99;
            $10 = i7 % 128;
            int i8 = i7 % 2;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    private static void e(char[] cArr, int i, char[] cArr2, char[] cArr3, char c, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        notifyDownloadRemoved notifydownloadremoved = new notifyDownloadRemoved();
        int length = cArr3.length;
        char[] cArr4 = new char[length];
        int length2 = cArr.length;
        char[] cArr5 = new char[length2];
        System.arraycopy(cArr3, 0, cArr4, 0, length);
        System.arraycopy(cArr, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr2.length;
        char[] cArr6 = new char[length3];
        notifydownloadremoved.AudioAttributesCompatParcelizer = 0;
        while (notifydownloadremoved.AudioAttributesCompatParcelizer < length3) {
            int i4 = $11 + 123;
            $10 = i4 % 128;
            int i5 = i4 % i2;
            try {
                Object[] objArr2 = {notifydownloadremoved};
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(718099963);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) (Process.myTid() >> 22), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 22748, 36 - KeyEvent.keyCodeFromString(""), 1417974126, false, "j", new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {notifydownloadremoved};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(247211480);
                if (objRemoteActionCompatParcelizer2 == null) {
                    byte b = (byte) 1;
                    byte b2 = (byte) (b - 1);
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 31369), 2722 - (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), (ViewConfiguration.getJumpTapTimeout() >> 16) + 38, 1895162189, false, $$i(b, b2, b2), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {notifydownloadremoved, Integer.valueOf(cArr4[notifydownloadremoved.AudioAttributesCompatParcelizer % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1336303982);
                if (objRemoteActionCompatParcelizer3 == null) {
                    objRemoteActionCompatParcelizer3 = startForeground.read((char) TextUtils.getCapsMode("", 0, 0), 15713 - View.MeasureSpec.makeMeasureSpec(0, 0), 65 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), -837789177, false, "f", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-1602228082);
                if (objRemoteActionCompatParcelizer4 == null) {
                    objRemoteActionCompatParcelizer4 = startForeground.read((char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 40976), ((byte) KeyEvent.getModifierMetaStateMask()) + 6123, (ViewConfiguration.getJumpTapTimeout() >> 16) + 29, -566873061, false, "m", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr5[iIntValue2] = ((Character) ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = notifydownloadremoved.write;
                cArr6[notifydownloadremoved.AudioAttributesCompatParcelizer] = (char) (((((long) (cArr4[iIntValue2] ^ cArr2[notifydownloadremoved.AudioAttributesCompatParcelizer])) ^ (AudioAttributesCompatParcelizer ^ (-3498762522182953692L))) ^ ((long) ((int) (((long) read) ^ (-3498762522182953692L))))) ^ ((long) ((char) (((long) write) ^ (-3498762522182953692L)))));
                notifydownloadremoved.AudioAttributesCompatParcelizer++;
                i2 = 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        String str = new String(cArr6);
        int i6 = $11 + 75;
        $10 = i6 % 128;
        if (i6 % 2 == 0) {
            objArr[0] = str;
        } else {
            int i7 = 75 / 0;
            objArr[0] = str;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x00a4  */
    @Override // kotlin.zzfo, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onCreate(android.os.Bundle r40) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2722
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.zzfl.onCreate(android.os.Bundle):void");
    }

    private final void AudioAttributesImplApi21Parcelizer() {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 27;
        MediaBrowserCompatMediaItem = i2 % 128;
        if (i2 % 2 == 0) {
            FragmentManager supportFragmentManager = getSupportFragmentManager();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(supportFragmentManager, "");
            _doAddInjectable _doaddinjectableIconCompatParcelizer = supportFragmentManager.IconCompatParcelizer();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(_doaddinjectableIconCompatParcelizer, "");
            zzgo.Companion audioAttributesCompatParcelizer = zzgo.INSTANCE;
            _doaddinjectableIconCompatParcelizer.IconCompatParcelizer(R.id.container, zzgo.Companion.AudioAttributesCompatParcelizer());
            _doaddinjectableIconCompatParcelizer.write();
            return;
        }
        FragmentManager supportFragmentManager2 = getSupportFragmentManager();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(supportFragmentManager2, "");
        _doAddInjectable _doaddinjectableIconCompatParcelizer2 = supportFragmentManager2.IconCompatParcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(_doaddinjectableIconCompatParcelizer2, "");
        zzgo.Companion audioAttributesCompatParcelizer2 = zzgo.INSTANCE;
        _doaddinjectableIconCompatParcelizer2.IconCompatParcelizer(R.id.container, zzgo.Companion.AudioAttributesCompatParcelizer());
        _doaddinjectableIconCompatParcelizer2.write();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final void IconCompatParcelizer(String p0) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 61;
        MediaDescriptionCompat = i2 % 128;
        int i3 = i2 % 2;
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(supportFragmentManager, "");
        _doAddInjectable _doaddinjectableIconCompatParcelizer = supportFragmentManager.IconCompatParcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(_doaddinjectableIconCompatParcelizer, "");
        zzgr.Companion iconCompatParcelizer = zzgr.INSTANCE;
        _doaddinjectableIconCompatParcelizer.IconCompatParcelizer(R.id.container, zzgr.Companion.AudioAttributesCompatParcelizer(p0));
        _doaddinjectableIconCompatParcelizer.write();
        int i4 = MediaDescriptionCompat + 77;
        MediaBrowserCompatMediaItem = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // kotlin.zzfo, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public final void onResume() throws Throwable {
        int i = 2 % 2;
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            Object[] objArr = new Object[1];
            e(new char[]{0, 0, 0, 0}, ViewConfiguration.getPressedStateDuration() >> 16, new char[]{45398, 44580, 31290, 19720, 46103, 21519, 47449, 46086, 29311, 43788, 44286, 61668, 38296, 13827, 7445, 65309, 5778, 46439, 22771, 953, 21507, 17587, 868, 64876, 37724, 47855}, new char[]{59679, 9770, 21440, 39741}, (char) (15699 - KeyEvent.normalizeMetaState(0)), objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            f((TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 18, new char[]{25170, 21908, 26088, 12022, 27165, 51004, 10847, 60499, 46969, 14956, 60608, 48445, 65229, 45713, 64894, 13181, 50107, 27419}, objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
            int i2 = MediaBrowserCompatMediaItem + 109;
            MediaDescriptionCompat = i2 % 128;
            int i3 = i2 % 2;
        }
        if (baseContext != null) {
            baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
        }
        if (baseContext != null) {
            try {
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1407079962);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) (4536 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), 6054 - View.MeasureSpec.getMode(0), 42 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), -764908173, false, "IconCompatParcelizer", new Class[0]);
                }
                Object objInvoke = ((Method) objRemoteActionCompatParcelizer).invoke(null, null);
                Object[] objArr3 = {baseContext};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(823471051);
                if (objRemoteActionCompatParcelizer2 == null) {
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) (ViewConfiguration.getWindowTouchSlop() >> 8), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 6031, KeyEvent.keyCodeFromString("") + 24, 1331490654, false, "RemoteActionCompatParcelizer", new Class[]{Context.class});
                }
                ((Method) objRemoteActionCompatParcelizer2).invoke(objInvoke, objArr3);
                int i4 = MediaBrowserCompatMediaItem + 11;
                MediaDescriptionCompat = i4 % 128;
                int i5 = i4 % 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        super.onResume();
    }

    @Override // kotlin.zzfo, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public final void onPause() throws Throwable {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 119;
        MediaBrowserCompatMediaItem = i2 % 128;
        int i3 = i2 % 2;
        Context baseContext = getBaseContext();
        Object obj = null;
        if (baseContext == null) {
            int i4 = MediaDescriptionCompat + 19;
            MediaBrowserCompatMediaItem = i4 % 128;
            int i5 = i4 % 2;
            Object[] objArr = new Object[1];
            e(new char[]{0, 0, 0, 0}, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1, new char[]{45398, 44580, 31290, 19720, 46103, 21519, 47449, 46086, 29311, 43788, 44286, 61668, 38296, 13827, 7445, 65309, 5778, 46439, 22771, 953, 21507, 17587, 868, 64876, 37724, 47855}, new char[]{59679, 9770, 21440, 39741}, (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 15700), objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            f(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(8) - 93, new char[]{25170, 21908, 26088, 12022, 27165, 51004, 10847, 60499, 46969, 14956, 60608, 48445, 65229, 45713, 64894, 13181, 50107, 27419}, objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
        }
        if (baseContext != null) {
            int i6 = MediaDescriptionCompat + 13;
            MediaBrowserCompatMediaItem = i6 % 128;
            if (i6 % 2 != 0) {
                boolean z = baseContext instanceof ContextWrapper;
                obj.hashCode();
                throw null;
            }
            baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
        }
        if (baseContext != null) {
            int i7 = MediaDescriptionCompat + 83;
            MediaBrowserCompatMediaItem = i7 % 128;
            try {
                if (i7 % 2 != 0) {
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1407079962);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) (4536 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), 6054 - TextUtils.getOffsetBefore("", 0), 42 - Gravity.getAbsoluteGravity(0, 0), -764908173, false, "IconCompatParcelizer", new Class[0]);
                    }
                    Object objInvoke = ((Method) objRemoteActionCompatParcelizer).invoke(null, null);
                    Object[] objArr3 = {baseContext};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-1293416902);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) TextUtils.indexOf("", ""), 6031 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), View.getDefaultSize(0, 0) + 24, -861814097, false, "read", new Class[]{Context.class});
                    }
                    ((Method) objRemoteActionCompatParcelizer2).invoke(objInvoke, objArr3);
                    int i8 = 32 / 0;
                } else {
                    Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1407079962);
                    if (objRemoteActionCompatParcelizer3 == null) {
                        objRemoteActionCompatParcelizer3 = startForeground.read((char) (MotionEvent.axisFromString("") + 4536), 6053 - ImageFormat.getBitsPerPixel(0), Color.green(0) + 42, -764908173, false, "IconCompatParcelizer", new Class[0]);
                    }
                    Object objInvoke2 = ((Method) objRemoteActionCompatParcelizer3).invoke(null, null);
                    Object[] objArr4 = {baseContext};
                    Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-1293416902);
                    if (objRemoteActionCompatParcelizer4 == null) {
                        objRemoteActionCompatParcelizer4 = startForeground.read((char) (ViewConfiguration.getEdgeSlop() >> 16), (ViewConfiguration.getEdgeSlop() >> 16) + 6030, 24 - KeyEvent.keyCodeFromString(""), -861814097, false, "read", new Class[]{Context.class});
                    }
                    ((Method) objRemoteActionCompatParcelizer4).invoke(objInvoke2, objArr4);
                }
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        super.onPause();
    }

    /* JADX WARN: Removed duplicated region for block: B:135:0x0994 A[Catch: all -> 0x0a55, TryCatch #10 {all -> 0x0a55, blocks: (B:133:0x097f, B:135:0x0994, B:136:0x09c2), top: B:269:0x097f, outer: #11 }] */
    /* JADX WARN: Removed duplicated region for block: B:139:0x09d5 A[Catch: all -> 0x0a4b, TryCatch #6 {all -> 0x0a4b, blocks: (B:137:0x09c8, B:139:0x09d5, B:140:0x0a43), top: B:263:0x09c8, outer: #11 }] */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0b89  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0bdb  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0c34  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0eab  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0f9c  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0fe5  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x1040  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x12dc  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0952 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:284:? A[RETURN, SYNTHETIC] */
    @Override // kotlin.zzfo, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void attachBaseContext(android.content.Context r33) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 5792
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.zzfl.attachBaseContext(android.content.Context):void");
    }

    static {
        AudioAttributesImplApi21Parcelizer = 0;
        AudioAttributesImplApi26Parcelizer();
        INSTANCE = new Companion(null);
        int i = RatingCompat + 63;
        AudioAttributesImplApi21Parcelizer = i % 128;
        int i2 = i % 2;
    }

    @getMagicModuleMeta
    public static final Intent IconCompatParcelizer(Context context, String str) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 11;
        MediaDescriptionCompat = i2 % 128;
        int i3 = i2 % 2;
        Intent intentAudioAttributesCompatParcelizer = Companion.AudioAttributesCompatParcelizer(context, str);
        int i4 = MediaDescriptionCompat + 105;
        MediaBrowserCompatMediaItem = i4 % 128;
        int i5 = i4 % 2;
        return intentAudioAttributesCompatParcelizer;
    }

    @Override // kotlin.zzfo, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public final void onStart() {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 125;
        MediaBrowserCompatMediaItem = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        int i4 = MediaDescriptionCompat + 75;
        MediaBrowserCompatMediaItem = i4 % 128;
        int i5 = i4 % 2;
    }

    static void AudioAttributesImplApi26Parcelizer() {
        AudioAttributesCompatParcelizer = -3498762522182953692L;
        read = -136981212;
        write = (char) 38711;
        AudioAttributesImplBaseParcelizer = (char) 2849;
        AudioAttributesImplApi26Parcelizer = (char) 27892;
        MediaBrowserCompatItemReceiver = (char) 50357;
        MediaBrowserCompatCustomActionResultReceiver = (char) 20059;
    }
}
