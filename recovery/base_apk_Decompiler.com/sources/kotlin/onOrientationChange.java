package kotlin;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
public interface onOrientationChange {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/onOrientationChange$write;", "Lo/onOrientationChange;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class write implements onOrientationChange {
        public static final write INSTANCE = new write();

        private write() {
        }
    }

    public static final class RemoteActionCompatParcelizer implements onOrientationChange {
        private final zaB RemoteActionCompatParcelizer;
        private static final byte[] $$c = {104, -54, 119, 45};
        private static final int $$d = 12;
        private static int $10 = 0;
        private static int $11 = 1;
        private static final byte[] $$a = {67, -110, -113, 74, 8, -1, -8};
        private static final int $$b = 101;
        private static int MediaBrowserCompatItemReceiver = 0;
        private static int AudioAttributesImplBaseParcelizer = 1;
        private static char IconCompatParcelizer = 62524;
        private static char AudioAttributesCompatParcelizer = 61609;
        private static char write = 18171;
        private static char read = 52671;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002d). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static java.lang.String $$e(int r6, short r7, short r8) {
            /*
                int r6 = r6 * 4
                int r6 = 4 - r6
                byte[] r0 = o.onOrientationChange.RemoteActionCompatParcelizer.$$c
                int r8 = r8 * 2
                int r8 = 122 - r8
                int r7 = r7 * 3
                int r1 = r7 + 1
                byte[] r1 = new byte[r1]
                r2 = 0
                if (r0 != 0) goto L17
                r4 = r8
                r3 = r2
                r8 = r6
                goto L2d
            L17:
                r3 = r2
            L18:
                r5 = r8
                r8 = r6
                r6 = r5
                byte r4 = (byte) r6
                r1[r3] = r4
                if (r3 != r7) goto L26
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                return r6
            L26:
                int r3 = r3 + 1
                r4 = r0[r8]
                r5 = r8
                r8 = r6
                r6 = r5
            L2d:
                int r6 = r6 + 1
                int r8 = r8 + r4
                goto L18
            */
            throw new UnsupportedOperationException("Method not decompiled: o.onOrientationChange.RemoteActionCompatParcelizer.$$e(int, short, short):java.lang.String");
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x002e). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static void b(int r6, int r7, byte r8, java.lang.Object[] r9) {
            /*
                int r6 = r6 * 3
                int r6 = 114 - r6
                int r7 = r7 * 3
                int r7 = 4 - r7
                int r8 = r8 * 3
                int r0 = 4 - r8
                byte[] r1 = o.onOrientationChange.RemoteActionCompatParcelizer.$$a
                byte[] r0 = new byte[r0]
                int r8 = 3 - r8
                r2 = 0
                if (r1 != 0) goto L19
                r6 = r7
                r3 = r8
                r4 = r2
                goto L2e
            L19:
                r3 = r2
            L1a:
                byte r4 = (byte) r6
                r0[r3] = r4
                int r4 = r3 + 1
                if (r3 != r8) goto L29
                java.lang.String r6 = new java.lang.String
                r6.<init>(r0, r2)
                r9[r2] = r6
                return
            L29:
                r3 = r1[r7]
                r5 = r7
                r7 = r6
                r6 = r5
            L2e:
                int r3 = -r3
                int r7 = r7 + r3
                int r7 = r7 + (-5)
                int r6 = r6 + 1
                r3 = r4
                r5 = r7
                r7 = r6
                r6 = r5
                goto L1a
            */
            throw new UnsupportedOperationException("Method not decompiled: o.onOrientationChange.RemoteActionCompatParcelizer.b(int, int, byte, java.lang.Object[]):void");
        }

        public RemoteActionCompatParcelizer(zaB zab) {
            toMagicModuleMetaRepoModel.write(zab, "");
            this.RemoteActionCompatParcelizer = zab;
        }

        public final zaB IconCompatParcelizer() {
            int i = 2 % 2;
            int i2 = MediaBrowserCompatItemReceiver + 39;
            int i3 = i2 % 128;
            AudioAttributesImplBaseParcelizer = i3;
            if (i2 % 2 == 0) {
                throw null;
            }
            zaB zab = this.RemoteActionCompatParcelizer;
            int i4 = i3 + 69;
            MediaBrowserCompatItemReceiver = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 10 / 0;
            }
            return zab;
        }

        private static void a(int i, char[] cArr, Object[] objArr) throws Throwable {
            int i2 = 2 % 2;
            isStopped isstopped = new isStopped();
            char[] cArr2 = new char[cArr.length];
            int i3 = 0;
            isstopped.read = 0;
            char[] cArr3 = new char[2];
            while (isstopped.read < cArr.length) {
                cArr3[i3] = cArr[isstopped.read];
                cArr3[1] = cArr[isstopped.read + 1];
                int i4 = $11 + 23;
                $10 = i4 % 128;
                int i5 = i4 % 2;
                int i6 = 58224;
                int i7 = i3;
                while (i7 < 16) {
                    int i8 = $11 + 103;
                    $10 = i8 % 128;
                    int i9 = i8 % 2;
                    char c = cArr3[1];
                    char c2 = cArr3[i3];
                    int i10 = (c2 + i6) ^ ((c2 << 4) + ((char) (((long) write) ^ 1193402106669854891L)));
                    int i11 = c2 >>> 5;
                    try {
                        Object[] objArr2 = new Object[4];
                        objArr2[3] = Integer.valueOf(read);
                        objArr2[2] = Integer.valueOf(i11);
                        objArr2[1] = Integer.valueOf(i10);
                        objArr2[i3] = Integer.valueOf(c);
                        Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(815477582);
                        if (objRemoteActionCompatParcelizer == null) {
                            char packedPositionGroup = (char) ExpandableListView.getPackedPositionGroup(0L);
                            int iGreen = 1504 - Color.green(i3);
                            int iMyTid = (Process.myTid() >> 22) + 21;
                            byte b = (byte) i3;
                            byte b2 = b;
                            String str$$e = $$e(b, b2, b2);
                            Class[] clsArr = new Class[4];
                            clsArr[i3] = Integer.TYPE;
                            clsArr[1] = Integer.TYPE;
                            clsArr[2] = Integer.TYPE;
                            clsArr[3] = Integer.TYPE;
                            objRemoteActionCompatParcelizer = startForeground.read(packedPositionGroup, iGreen, iMyTid, 1322448859, false, str$$e, clsArr);
                        }
                        char cCharValue = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                        cArr3[1] = cCharValue;
                        char[] cArr4 = cArr3;
                        Object[] objArr3 = {Integer.valueOf(cArr3[i3]), Integer.valueOf((cCharValue + i6) ^ ((cCharValue << 4) + ((char) (((long) IconCompatParcelizer) ^ 1193402106669854891L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(AudioAttributesCompatParcelizer)};
                        Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(815477582);
                        if (objRemoteActionCompatParcelizer2 == null) {
                            byte b3 = (byte) 0;
                            byte b4 = b3;
                            objRemoteActionCompatParcelizer2 = startForeground.read((char) ((-1) - TextUtils.lastIndexOf("", '0', 0)), 1504 - ExpandableListView.getPackedPositionGroup(0L), 21 - (ViewConfiguration.getFadingEdgeLength() >> 16), 1322448859, false, $$e(b3, b4, b4), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[0] = ((Character) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).charValue();
                        i6 -= 40503;
                        i7++;
                        cArr3 = cArr4;
                        i3 = 0;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                char[] cArr5 = cArr3;
                cArr2[isstopped.read] = cArr5[0];
                cArr2[isstopped.read + 1] = cArr5[1];
                Object[] objArr4 = {isstopped, isstopped};
                Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-167774474);
                if (objRemoteActionCompatParcelizer3 == null) {
                    objRemoteActionCompatParcelizer3 = startForeground.read((char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 9015, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 59, -1950993821, false, "D", new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
                cArr3 = cArr5;
                i3 = 0;
            }
            objArr[0] = new String(cArr2, 0, i);
        }

        /*  JADX ERROR: NoSuchElementException in pass: ReplaceNewArray
            java.util.NoSuchElementException
            	at java.base/java.util.TreeMap.key(TreeMap.java:1637)
            	at java.base/java.util.TreeMap.lastKey(TreeMap.java:309)
            	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:171)
            	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
            	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
            */
        public static java.lang.Object[] read(int r25, int r26) {
            /*
                Method dump skipped, instruction units count: 1802
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: o.onOrientationChange.RemoteActionCompatParcelizer.read(int, int):java.lang.Object[]");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/onOrientationChange$IconCompatParcelizer;", "Lo/onOrientationChange;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class IconCompatParcelizer implements onOrientationChange {
        public static final IconCompatParcelizer INSTANCE = new IconCompatParcelizer();

        private IconCompatParcelizer() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/onOrientationChange$read;", "Lo/onOrientationChange;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class read implements onOrientationChange {
        public static final read INSTANCE = new read();

        private read() {
        }
    }

    public static final class AudioAttributesImplApi26Parcelizer implements onOrientationChange {
        private final String IconCompatParcelizer;

        public AudioAttributesImplApi26Parcelizer(String str) {
            toMagicModuleMetaRepoModel.write(str, "");
            this.IconCompatParcelizer = str;
        }

        public final String RemoteActionCompatParcelizer() {
            return this.IconCompatParcelizer;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/onOrientationChange$AudioAttributesCompatParcelizer;", "Lo/onOrientationChange;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AudioAttributesCompatParcelizer implements onOrientationChange {
        public static final AudioAttributesCompatParcelizer INSTANCE = new AudioAttributesCompatParcelizer();

        private AudioAttributesCompatParcelizer() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/onOrientationChange$AudioAttributesImplBaseParcelizer;", "Lo/onOrientationChange;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AudioAttributesImplBaseParcelizer implements onOrientationChange {
        public static final AudioAttributesImplBaseParcelizer INSTANCE = new AudioAttributesImplBaseParcelizer();

        private AudioAttributesImplBaseParcelizer() {
        }
    }
}
