package kotlin;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow.R;
import in.juspay.hyper.constants.LogCategory;
import java.lang.reflect.Method;
import kotlin.Metadata;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lo/setAppId;", "Lo/addObserverForBackInvoker;", "<init>", "()V", "Landroid/os/Bundle;", "p0", "", "onCreate", "(Landroid/os/Bundle;)V", "read"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class setAppId extends getAllAppIds {
    private static char AudioAttributesCompatParcelizer;
    private static int AudioAttributesImplApi26Parcelizer;
    private static char[] IconCompatParcelizer;
    private static int RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static long write;
    private static final byte[] $$c = {98, -46, 102, 39};
    private static final int $$f = 219;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$j = {5, 107, -8, 109, -9, 5, 66, -54, -5, 3, 11, -2, 10, 58, -48, -10, 13, -11, 6, 9, 8, 57, -54, -3, -3, 72, -50, -9, 5, 3, 1, 4, 67, -68, 4, 14, 0, 65, -73, 3, 28, 16, 7, 0, -16, -5, 1, -2, 18, 39, -31, -14, 14, -3, 4, 46, -41, 5, 0, 18, -16, 39, -14, -14, 18, 1, -4, 6, -14, 24, -10, 68, -28, -21, 4, -2, 11, 33, -41, 14, 2, 5, 16, -16, 8, 2, -7, 32, -16, -6, 13, 2, -10, 16, -10, TarConstants.LF_SYMLINK, -41, 14, 2, 5, 25, -17, -20, 37, -8, -8, -6, 19, -11};
    private static final int $$k = 224;
    private static final byte[] $$d = {3, -109, TarConstants.LF_PAX_EXTENDED_HEADER_UC, -57, -25, 0, -6, 7, 30, -49, 2, -9, 3, 13, -14, 46, -45, 1, -4, 14, -20, TarConstants.LF_NORMAL, -51, 1, -2, 4, 1, 43, -35, -18, 10, -7, 0, 27, -20, -15, -3, 8, -9, 33, -20, 1, -3, -5, -14, 16, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, 0, -32, -18, -18, 14, -3, -8, 2, -18, 20, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, -5, -27, -18, -18, 14, -3, -8, 2, -18, 20, -14, 12, 3, -4, -25, 0, -6, 7, 30, -49, 2, -9, 3, 13, -14, 46, -45, 1, -4, 14, -20, 42, -44, 14, -9, 26, -20, 1, -3, -5, -14, 16, -14, -27, -13, 0, 42, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14, -20, -9, -3, -6, 14, 35, -35, -18, 10, -7, 0, 42, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 47, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14};
    private static final int $$e = 45;
    private static int MediaBrowserCompatItemReceiver = 0;
    private static int AudioAttributesImplBaseParcelizer = 1;
    private static int MediaBrowserCompatCustomActionResultReceiver = 0;

    private static String $$i(int i, short s, int i2) {
        int i3 = 103 - (i * 2);
        int i4 = 4 - (s * 4);
        int i5 = i2 * 2;
        byte[] bArr = $$c;
        byte[] bArr2 = new byte[i5 + 1];
        int i6 = -1;
        if (bArr == null) {
            i3 += -i5;
            i4++;
        }
        while (true) {
            i6++;
            bArr2[i6] = (byte) i3;
            if (i6 == i5) {
                return new String(bArr2, 0);
            }
            i3 += -bArr[i4];
            i4++;
        }
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
            byte[] r0 = kotlin.setAppId.$$d
            int r9 = 44 - r9
            int r8 = 114 - r8
            int r7 = r7 + 4
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L11
            r3 = r8
            r4 = r2
            r8 = r7
            goto L26
        L11:
            r3 = r2
        L12:
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            if (r4 != r9) goto L21
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L21:
            r3 = r0[r7]
            r6 = r8
            r8 = r7
            r7 = r6
        L26:
            int r3 = -r3
            int r7 = r7 + r3
            int r8 = r8 + 1
            int r7 = r7 + (-1)
            r3 = r4
            r6 = r8
            r8 = r7
            r7 = r6
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setAppId.g(short, int, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0020 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void h(int r6, short r7, short r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 + 4
            int r6 = 114 - r6
            byte[] r0 = kotlin.setAppId.$$j
            int r1 = r7 + 4
            byte[] r1 = new byte[r1]
            int r7 = r7 + 3
            r2 = 0
            if (r0 != 0) goto L12
            r3 = r8
            r4 = r2
            goto L28
        L12:
            r3 = r2
        L13:
            byte r4 = (byte) r6
            r1[r3] = r4
            if (r3 != r7) goto L20
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L20:
            int r3 = r3 + 1
            r4 = r0[r8]
            r5 = r3
            r3 = r8
            r8 = r4
            r4 = r5
        L28:
            int r8 = -r8
            int r6 = r6 + r8
            int r8 = r3 + 1
            int r6 = r6 + 3
            r3 = r4
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setAppId.h(int, short, short, java.lang.Object[]):void");
    }

    public setAppId() {
        super((byte) 0);
    }

    /* JADX INFO: renamed from: o.setAppId$read, reason: from kotlin metadata */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J<\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00052\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/marrow2/ui/qbank/play/QBankPlayActivity$Companion;", "", "<init>", "()V", "STEP_ID", "", "LESSON_TITLE", "KEY_PARENT_ID", "KEY_PARENT_TYPE", "KEY_BOOKMARK_START_INDEX", "KEY_BOOKMARK_START_MCQ_ID", "KEY_RESULT_INDEX", "getLaunchIntent", "Landroid/content/Intent;", LogCategory.CONTEXT, "Landroid/content/Context;", "qbankId", "lessonTitle", "parentType", "Lcom/marrow2/data/mcq/local/model/McqParentType;", "startIndex", "", "startMcqId", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static /* synthetic */ Intent write(Context context, String str, String str2, readBlockToCache readblocktocache, int i, String str3, int i2) {
            if ((i2 & 8) != 0) {
                readblocktocache = readBlockToCache.AudioAttributesImplBaseParcelizer;
            }
            readBlockToCache readblocktocache2 = readblocktocache;
            if ((i2 & 16) != 0) {
                i = 0;
            }
            int i3 = i;
            if ((i2 & 32) != 0) {
                str3 = "";
            }
            return write(context, str, str2, readblocktocache2, i3, str3);
        }

        private static Intent write(Context context, String str, String str2, readBlockToCache readblocktocache, int i, String str3) {
            toMagicModuleMetaRepoModel.write(context, "");
            toMagicModuleMetaRepoModel.write(str, "");
            toMagicModuleMetaRepoModel.write(str2, "");
            toMagicModuleMetaRepoModel.write(readblocktocache, "");
            toMagicModuleMetaRepoModel.write(str3, "");
            buildResolutionString.IconCompatParcelizer("CustomModule", "qBankId ".concat(String.valueOf(str)));
            Intent intent = new Intent(context, (Class<?>) setAppId.class);
            intent.putExtra("step_id", str);
            intent.putExtra("lesson_title", str2);
            intent.putExtra("McqActivityPlayContract_Parent_Type", readblocktocache);
            intent.putExtra("bookmarkStartIndex", i);
            intent.putExtra("bookmarkStartMcqId", str3);
            return intent;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    private static void f(char c, int i, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        notifyDownloadRemoved notifydownloadremoved = new notifyDownloadRemoved();
        int length = cArr2.length;
        char[] cArr4 = new char[length];
        int length2 = cArr3.length;
        char[] cArr5 = new char[length2];
        System.arraycopy(cArr2, 0, cArr4, 0, length);
        System.arraycopy(cArr3, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr.length;
        char[] cArr6 = new char[length3];
        notifydownloadremoved.AudioAttributesCompatParcelizer = 0;
        int i3 = $11 + 89;
        $10 = i3 % 128;
        int i4 = i3 % 2;
        while (notifydownloadremoved.AudioAttributesCompatParcelizer < length3) {
            try {
                Object[] objArr2 = {notifydownloadremoved};
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(718099963);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) Color.argb(0, 0, 0, 0), 22747 - ImageFormat.getBitsPerPixel(0), 36 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), 1417974126, false, "j", new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {notifydownloadremoved};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(247211480);
                if (objRemoteActionCompatParcelizer2 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 31369), 2721 - Color.red(0), 38 - (ViewConfiguration.getJumpTapTimeout() >> 16), 1895162189, false, $$i(b, b2, b2), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {notifydownloadremoved, Integer.valueOf(cArr4[notifydownloadremoved.AudioAttributesCompatParcelizer % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1336303982);
                if (objRemoteActionCompatParcelizer3 == null) {
                    objRemoteActionCompatParcelizer3 = startForeground.read((char) KeyEvent.getDeadChar(0, 0), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 15713, ExpandableListView.getPackedPositionType(0L) + 64, -837789177, false, "f", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-1602228082);
                if (objRemoteActionCompatParcelizer4 == null) {
                    objRemoteActionCompatParcelizer4 = startForeground.read((char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 40976), 6121 - TextUtils.indexOf((CharSequence) "", '0', 0), View.MeasureSpec.getSize(0) + 29, -566873061, false, "m", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr5[iIntValue2] = ((Character) ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = notifydownloadremoved.write;
                cArr6[notifydownloadremoved.AudioAttributesCompatParcelizer] = (char) (((((long) (cArr4[iIntValue2] ^ cArr[notifydownloadremoved.AudioAttributesCompatParcelizer])) ^ (write ^ (-3498762522182953692L))) ^ ((long) ((int) (((long) RemoteActionCompatParcelizer) ^ (-3498762522182953692L))))) ^ ((long) ((char) (((long) AudioAttributesCompatParcelizer) ^ (-3498762522182953692L)))));
                notifydownloadremoved.AudioAttributesCompatParcelizer++;
                int i5 = $11 + 19;
                $10 = i5 % 128;
                int i6 = i5 % 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArr6);
    }

    private static void e(byte[] bArr, int[] iArr, boolean z, Object[] objArr) throws Throwable {
        int i = 2 % 2;
        buildSetStopReasonIntent buildsetstopreasonintent = new buildSetStopReasonIntent();
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        char[] cArr = IconCompatParcelizer;
        float f = BitmapDescriptorFactory.HUE_RED;
        Object obj = null;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i6 = 0;
            while (i6 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[i6])};
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-338863922);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) (AudioTrack.getMinVolume() > f ? 1 : (AudioTrack.getMinVolume() == f ? 0 : -1)), 11613 - Color.green(0), ImageFormat.getBitsPerPixel(0) + 21, -1786471333, false, "u", new Class[]{Integer.TYPE});
                    }
                    cArr2[i6] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                    i6++;
                    f = BitmapDescriptorFactory.HUE_RED;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr = cArr2;
        }
        char[] cArr3 = new char[i3];
        System.arraycopy(cArr, i2, cArr3, 0, i3);
        if (bArr != null) {
            char[] cArr4 = new char[i3];
            buildsetstopreasonintent.RemoteActionCompatParcelizer = 0;
            char c = 0;
            while (buildsetstopreasonintent.RemoteActionCompatParcelizer < i3) {
                if (bArr[buildsetstopreasonintent.RemoteActionCompatParcelizer] == 1) {
                    int i7 = buildsetstopreasonintent.RemoteActionCompatParcelizer;
                    Object[] objArr3 = {Integer.valueOf(cArr3[buildsetstopreasonintent.RemoteActionCompatParcelizer]), Integer.valueOf(c)};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-1429458299);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) ((-1) - TextUtils.indexOf((CharSequence) "", '0')), View.combineMeasuredStates(0, 0) + 22959, 43 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), -729418224, false, "x", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i7] = ((Character) ((Method) objRemoteActionCompatParcelizer2).invoke(obj, objArr3)).charValue();
                } else {
                    int i8 = buildsetstopreasonintent.RemoteActionCompatParcelizer;
                    Object[] objArr4 = {Integer.valueOf(cArr3[buildsetstopreasonintent.RemoteActionCompatParcelizer]), Integer.valueOf(c)};
                    Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(1859710730);
                    if (objRemoteActionCompatParcelizer3 == null) {
                        objRemoteActionCompatParcelizer3 = startForeground.read((char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 31588), 9863 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (ViewConfiguration.getScrollBarSize() >> 8) + 65, 277949343, false, "v", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i8] = ((Character) ((Method) objRemoteActionCompatParcelizer3).invoke(obj, objArr4)).charValue();
                }
                c = cArr4[buildsetstopreasonintent.RemoteActionCompatParcelizer];
                Object[] objArr5 = {buildsetstopreasonintent, buildsetstopreasonintent};
                Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(1104966666);
                if (objRemoteActionCompatParcelizer4 == null) {
                    objRemoteActionCompatParcelizer4 = startForeground.read((char) ((ViewConfiguration.getEdgeSlop() >> 16) + 37822), 9754 - (ViewConfiguration.getEdgeSlop() >> 16), (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 26, 1066774687, false, "B", new Class[]{Object.class, Object.class});
                }
                obj = null;
                ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5);
            }
            cArr3 = cArr4;
        }
        if (i5 > 0) {
            char[] cArr5 = new char[i3];
            System.arraycopy(cArr3, 0, cArr5, 0, i3);
            int i9 = i3 - i5;
            System.arraycopy(cArr5, 0, cArr3, i9, i5);
            System.arraycopy(cArr5, i5, cArr3, 0, i9);
        }
        if (z) {
            char[] cArr6 = new char[i3];
            buildsetstopreasonintent.RemoteActionCompatParcelizer = 0;
            while (buildsetstopreasonintent.RemoteActionCompatParcelizer < i3) {
                cArr6[buildsetstopreasonintent.RemoteActionCompatParcelizer] = cArr3[(i3 - buildsetstopreasonintent.RemoteActionCompatParcelizer) - 1];
                buildsetstopreasonintent.RemoteActionCompatParcelizer++;
                int i10 = $10 + 125;
                $11 = i10 % 128;
                int i11 = i10 % 2;
            }
            cArr3 = cArr6;
        }
        if (i4 > 0) {
            int i12 = $11 + 29;
            $10 = i12 % 128;
            if (i12 % 2 != 0) {
                buildsetstopreasonintent.RemoteActionCompatParcelizer = 1;
            } else {
                buildsetstopreasonintent.RemoteActionCompatParcelizer = 0;
            }
            while (buildsetstopreasonintent.RemoteActionCompatParcelizer < i3) {
                cArr3[buildsetstopreasonintent.RemoteActionCompatParcelizer] = (char) (cArr3[buildsetstopreasonintent.RemoteActionCompatParcelizer] - iArr[2]);
                buildsetstopreasonintent.RemoteActionCompatParcelizer++;
                int i13 = $10 + 21;
                $11 = i13 % 128;
                int i14 = i13 % 2;
            }
        }
        objArr[0] = new String(cArr3);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x078a  */
    @Override // kotlin.getAllAppIds, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onCreate(android.os.Bundle r36) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2511
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setAppId.onCreate(android.os.Bundle):void");
    }

    @Override // kotlin.getAllAppIds, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public final void onResume() throws Throwable {
        int i = 2 % 2;
        Context baseContext = getBaseContext();
        Object obj = null;
        if (baseContext == null) {
            Object[] objArr = new Object[1];
            f((char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 57255), TextUtils.getTrimmedLength(""), new char[]{20392, 16289, 44294, 61704, 21790, 42231, 6741, 39277, 739, 33403, 62082, 9697, 19811, 313, 27121, 37129, 23380, 46034, 34345, 6367, 17723, 7898, 51550, 31920, 47098, 41695}, new char[]{681, 61817, 51802, 8415}, new char[]{57498, 52758, 65058, 53692}, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            f((char) ((KeyEvent.getMaxKeyCode() >> 16) + 43835), ViewConfiguration.getPressedStateDuration() >> 16, new char[]{44043, 35055, 13756, 52608, 57654, 1654, 36009, 29433, 25777, 29182, 53651, 65198, 56195, 54776, 2434, 30837, 45052, 7125}, new char[]{26237, 7311, 15314, 56235}, new char[]{57498, 52758, 65058, 53692}, objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
            int i2 = AudioAttributesImplBaseParcelizer + 7;
            MediaBrowserCompatItemReceiver = i2 % 128;
            int i3 = i2 % 2;
        }
        if (baseContext != null) {
            int i4 = AudioAttributesImplBaseParcelizer + 91;
            MediaBrowserCompatItemReceiver = i4 % 128;
            if (i4 % 2 != 0) {
                boolean z = baseContext instanceof ContextWrapper;
                obj.hashCode();
                throw null;
            }
            baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
        }
        if (baseContext != null) {
            try {
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1407079962);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 4535), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 6054, 42 - Color.red(0), -764908173, false, "IconCompatParcelizer", new Class[0]);
                }
                Object objInvoke = ((Method) objRemoteActionCompatParcelizer).invoke(null, null);
                Object[] objArr3 = {baseContext};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(823471051);
                if (objRemoteActionCompatParcelizer2 == null) {
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) KeyEvent.getDeadChar(0, 0), 6029 - Process.getGidForName(""), 24 - TextUtils.indexOf("", "", 0, 0), 1331490654, false, "RemoteActionCompatParcelizer", new Class[]{Context.class});
                }
                ((Method) objRemoteActionCompatParcelizer2).invoke(objInvoke, objArr3);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        super.onResume();
        int i5 = AudioAttributesImplBaseParcelizer + 105;
        MediaBrowserCompatItemReceiver = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // kotlin.getAllAppIds, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public final void onPause() throws Throwable {
        int i = 2 % 2;
        int i2 = AudioAttributesImplBaseParcelizer + 65;
        MediaBrowserCompatItemReceiver = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            getBaseContext();
            obj.hashCode();
            throw null;
        }
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            int i3 = AudioAttributesImplBaseParcelizer + 107;
            MediaBrowserCompatItemReceiver = i3 % 128;
            int i4 = i3 % 2;
            Object[] objArr = new Object[1];
            f((char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 57255), AndroidCharacter.getMirror('0') - '0', new char[]{20392, 16289, 44294, 61704, 21790, 42231, 6741, 39277, 739, 33403, 62082, 9697, 19811, 313, 27121, 37129, 23380, 46034, 34345, 6367, 17723, 7898, 51550, 31920, 47098, 41695}, new char[]{681, 61817, 51802, 8415}, new char[]{57498, 52758, 65058, 53692}, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            f((char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).codePointAt(1) + 43786), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 10, new char[]{44043, 35055, 13756, 52608, 57654, 1654, 36009, 29433, 25777, 29182, 53651, 65198, 56195, 54776, 2434, 30837, 45052, 7125}, new char[]{26237, 7311, 15314, 56235}, new char[]{57498, 52758, 65058, 53692}, objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
        }
        if (baseContext != null) {
            int i5 = MediaBrowserCompatItemReceiver + 37;
            AudioAttributesImplBaseParcelizer = i5 % 128;
            int i6 = i5 % 2;
            baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
        }
        if (baseContext != null) {
            try {
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1407079962);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) (4534 - ImageFormat.getBitsPerPixel(0)), 6055 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), MotionEvent.axisFromString("") + 43, -764908173, false, "IconCompatParcelizer", new Class[0]);
                }
                Object objInvoke = ((Method) objRemoteActionCompatParcelizer).invoke(null, null);
                Object[] objArr3 = {baseContext};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-1293416902);
                if (objRemoteActionCompatParcelizer2 == null) {
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) Color.red(0), View.MeasureSpec.getSize(0) + 6030, 24 - Color.alpha(0), -861814097, false, "read", new Class[]{Context.class});
                }
                ((Method) objRemoteActionCompatParcelizer2).invoke(objInvoke, objArr3);
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

    /* JADX WARN: Removed duplicated region for block: B:10:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x08a4 A[Catch: all -> 0x0314, TryCatch #11 {all -> 0x0314, blocks: (B:131:0x089e, B:133:0x08a4, B:134:0x08d2, B:175:0x0b09, B:177:0x0b0f, B:178:0x0b3b, B:214:0x0f32, B:216:0x0f38, B:217:0x0f68, B:250:0x12f4, B:252:0x12fa, B:253:0x131f, B:231:0x111e, B:233:0x1140, B:234:0x1187, B:21:0x00a5, B:23:0x00ab, B:24:0x00d5, B:26:0x0285, B:28:0x02b6, B:29:0x030e), top: B:294:0x00a5 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0318  */
    @Override // kotlin.getAllAppIds, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void attachBaseContext(android.content.Context r31) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 5677
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setAppId.attachBaseContext(android.content.Context):void");
    }

    static {
        AudioAttributesImplApi26Parcelizer = 1;
        AudioAttributesImplApi26Parcelizer();
        INSTANCE = new Companion(null);
        int i = MediaBrowserCompatCustomActionResultReceiver + 9;
        AudioAttributesImplApi26Parcelizer = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    @Override // kotlin.getAllAppIds, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public final void onStart() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatItemReceiver + 47;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        int i4 = MediaBrowserCompatItemReceiver + 119;
        AudioAttributesImplBaseParcelizer = i4 % 128;
        int i5 = i4 % 2;
    }

    static void AudioAttributesImplApi26Parcelizer() {
        IconCompatParcelizer = new char[]{45046, 44915, 44920, 44896, 44901, 44924, 44909, 44879, 44892, 44925, 44894, 44869, 44902, 44920, 44924, 44923, 44901, 44903, 45049, 44899, 44904, 44896, 44924, 45019, 44842, 44861, 44850, 44861, 44869, 44890, 44848, 44843, 44821, 44843, 44842, 44817, 44823, 44840, 44821, 44863, 44863, 44860, 44890, 44869, 44868, 44861, 44840, 44821, 44822, 44823, 44861, 44861, 44863, 44860, 44823, 44817, 44822, 44821, 44841, 44821, 44817, 44822, 44862, 44850, 44843, 44843, 44840, 44840, 44850, 44868, 44868, 44860, 44850, 44863, 44817, 44862, 44868, 44850, 44843, 44842, 44843, 44861, 44861, 44820, 44862, 44868, 44862, 44950, 44984, 44965, 44987, 44987, 44990, 44988, 44998, 44995, 44987, 44990, 44988, 44993, 44995, 44993, 45038, 45038, 44996, 44990, 44995, 44998, 44996, 44995, 44964, 44987, 44992, 44999, 44985, 44984, 44991, 44991, 44991, 44986, 44995, 44997, 44997, 44971, 45023, 45031, 45024, 45022, 45034, 45052, 45028, 45028, 45051, 45027, 45038, 45036, 45037, 45038, 45027, 44991, 45037, 45027, 45031, 45021, 45010, 45027, 45030, 45049, 45052, 45036, 45002, 45018, 45051, 44996, 44995, 45036, 45030, 45050, 45025, 45027, 45037, 44884, 44892, 44865, 44869, 44854, 44868, 44869, 44887, 44880, 44865, 44892, 44869, 44869, 44893, 44889};
        write = 2219456748115408318L;
        RemoteActionCompatParcelizer = -136981212;
        AudioAttributesCompatParcelizer = (char) 54564;
    }
}
