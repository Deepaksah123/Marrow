package kotlin;

import android.content.ContentProvider;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.content.ContextWrapper;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteQueryBuilder;
import android.graphics.Color;
import android.media.AudioTrack;
import android.net.Uri;
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
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes5.dex */
public class parseSelectionFlags extends ContentProvider {
    private SQLiteOpenHelper write;
    private static final byte[] $$a = {36, 33, 122, TarConstants.LF_DIR};
    private static final int $$b = 224;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static char[] AudioAttributesCompatParcelizer = {45014, 44860, 44825, 44804, 44833, 44859, 44863, 44858, 44836, 44838, 44837, 44850, 44859, 44835, 44836, 44863, 44844, 44814, 44984, 44998, 44984, 44992, 45038, 44995, 44987, 44998, 45039, 44997, 44978, 44997, 44999, 44992, 44992, 44984, 44987, 44987, 44992, 44993, 44990, 44999, 45033, 45032, 45032, 44998, 44999, 44993, 44988, 44989, 44988, 44978, 44997, 45039, 45038, 44998, 44984, 44993, 45038, 45033, 45032, 45035, 44993, 44991, 44990, 44988, 44997, 45039, 44947, 44990, 44985, 44995, 45033, 45039, 44998, 44993, 44994, 44987, 44992, 44995, 44992, 44993, 44987, 44993, 44998, 44998, 45033, 45033, 44996, 44998, 44992, 44988, 44990, 44985, 44990, 44988, 44996, 45038, 44997, 44991, 44984, 44984, 44987, 44987, 44995, 45035, 44998, 44996, 45038, 45032, 44998, 44990, 44985, 44998, 45038, 44996, 44999, 44992, 44987, 44992, 45032, 44995, 44995, 44999, 44989, 44988, 44988, 44998, 44993, 44993, 44995, 44992};
    private static long read = 465789680624410736L;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(int r6, short r7, byte r8) {
        /*
            int r7 = r7 * 2
            int r7 = 121 - r7
            int r8 = r8 * 3
            int r8 = r8 + 4
            byte[] r0 = kotlin.parseSelectionFlags.$$a
            int r6 = r6 * 2
            int r1 = 1 - r6
            byte[] r1 = new byte[r1]
            r2 = 0
            int r6 = 0 - r6
            if (r0 != 0) goto L19
            r3 = r6
            r7 = r8
            r4 = r2
            goto L2c
        L19:
            r3 = r2
        L1a:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r6) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L27:
            r3 = r0[r8]
            r5 = r8
            r8 = r7
            r7 = r5
        L2c:
            int r8 = r8 + r3
            int r7 = r7 + 1
            r3 = r4
            r5 = r8
            r8 = r7
            r7 = r5
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.parseSelectionFlags.$$c(int, short, byte):java.lang.String");
    }

    private static void b(int i, char[] cArr, Object[] objArr) throws Throwable {
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
                    byte b2 = b;
                    objRemoteActionCompatParcelizer = startForeground.read((char) (View.resolveSize(0, 0) + 38461), (ViewConfiguration.getTouchSlop() >> 8) + 532, 8 - Color.green(0), -735610793, false, $$c(b, b2, b2), new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i3] = ((Long) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).longValue() ^ (read ^ 2192498202983240651L);
                try {
                    Object[] objArr3 = {notifydownloadchanged, notifydownloadchanged};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(1971306176);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = (byte) (b3 + 1);
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 36621), 2340 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 27, 188119637, false, $$c(b3, b4, (byte) (b4 - 1)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3);
                    int i4 = $10 + 67;
                    $11 = i4 % 128;
                    int i5 = i4 % 2;
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
        char[] cArr2 = new char[length];
        notifydownloadchanged.AudioAttributesCompatParcelizer = 0;
        while (notifydownloadchanged.AudioAttributesCompatParcelizer < cArr.length) {
            int i6 = $10 + 55;
            $11 = i6 % 128;
            if (i6 % 2 == 0) {
                cArr2[notifydownloadchanged.AudioAttributesCompatParcelizer] = (char) jArr[notifydownloadchanged.AudioAttributesCompatParcelizer];
                Object[] objArr4 = {notifydownloadchanged, notifydownloadchanged};
                Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(1971306176);
                if (objRemoteActionCompatParcelizer3 == null) {
                    byte b5 = (byte) 0;
                    byte b6 = (byte) (b5 + 1);
                    objRemoteActionCompatParcelizer3 = startForeground.read((char) (36622 - (AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1))), 2339 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (-16777188) - Color.rgb(0, 0, 0), 188119637, false, $$c(b5, b6, (byte) (b6 - 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
                throw null;
            }
            cArr2[notifydownloadchanged.AudioAttributesCompatParcelizer] = (char) jArr[notifydownloadchanged.AudioAttributesCompatParcelizer];
            Object[] objArr5 = {notifydownloadchanged, notifydownloadchanged};
            Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(1971306176);
            if (objRemoteActionCompatParcelizer4 == null) {
                byte b7 = (byte) 0;
                byte b8 = (byte) (b7 + 1);
                objRemoteActionCompatParcelizer4 = startForeground.read((char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 36621), 2339 - ((byte) KeyEvent.getModifierMetaStateMask()), (TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 28, 188119637, false, $$c(b7, b8, (byte) (b8 - 1)), new Class[]{Object.class, Object.class});
            }
            ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr2);
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() throws Throwable {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 65;
        IconCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = new Object[1];
        a(new byte[]{0, 0, 1, 0, 1, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0}, new int[]{0, 18, 69, 10}, true, objArr);
        Class<?> cls = Class.forName((String) objArr[0]);
        Object[] objArr2 = new Object[1];
        b(2656 - Process.getGidForName(""), new char[]{46038, 47523, 42796, 44273, 39515}, objArr2);
        int iIntValue = ((Integer) cls.getDeclaredMethod((String) objArr2[0], new Class[0]).invoke(null, new Object[0])).intValue() % 100000;
        if (iIntValue < 99000 || iIntValue > 99999) {
            Object[] objArr3 = new Object[1];
            b(45756 - TextUtils.lastIndexOf("", '0'), new char[]{46042, 360, 54949, 44030, 31008, 52835, 33713, 20670, 9778, 64366, 18601, 7562, 54054, 41025, 30105, 51905, 38941, 27999, 8837, 63429, 17707, 6738, 61431, 48421, 29282, 51114}, objArr3);
            Class<?> cls2 = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            b(View.resolveSize(0, 0) + 6491, new char[]{46040, 43669, 33151, 65496, 54962, 52498, 11245, 647, 30995, 22520, 20057, 42299, 33692, 64069, 53557, 53127, 9828, 7390}, objArr4);
            Context applicationContext = (Context) cls2.getMethod((String) objArr4[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                if ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) {
                    applicationContext = null;
                } else {
                    applicationContext = applicationContext.getApplicationContext();
                    int i4 = IconCompatParcelizer + 53;
                    RemoteActionCompatParcelizer = i4 % 128;
                    int i5 = i4 % 2;
                }
            }
            if (applicationContext != null) {
                try {
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1407079962);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) (4535 - (TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1))), 6054 - Color.argb(0, 0, 0, 0), 42 - (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), -764908173, false, "IconCompatParcelizer", new Class[0]);
                    }
                    Object objInvoke = ((Method) objRemoteActionCompatParcelizer).invoke(null, null);
                    Object[] objArr5 = new Object[1];
                    a(new byte[]{0, 1, 1, 1, 0, 1, 1, 0, 1, 1, 1, 0, 0, 1, 0, 0, 1, 0, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 0, 0, 1, 1, 1, 1, 0, 0, 1, 0, 1, 1, 1, 1, 0, 0, 1, 0, 0, 1}, new int[]{18, 48, 0, 34}, false, objArr5);
                    String str = (String) objArr5[0];
                    Object[] objArr6 = new Object[1];
                    b(View.MeasureSpec.getSize(0) + 35257, new char[]{45963, 14945, 41130, 11936, 38248, 839, 35290, 30594, 65094, 25613, 53989, 22826, 50983, 19951, 15297, 41562, 10314, 38551, 7384, 35641, 29177, 65454, 26217, 60445, 23169, 49307, 20288, 13576, 41918, 10873, 36903, 7916, 33963, 29526, 63819, 26563, 60889, 21556, 49918, 18596, 14187, 48429, 11139, 37324, 6163, 34392, 3252, 64296, 24891, 61419, 21932, 56400, 18974, 12495, 48777, 9521, 37883, 6636, 32820, 3707, 62674, 25291, 59718, 22283}, objArr6);
                    String str2 = (String) objArr6[0];
                    Object[] objArr7 = new Object[1];
                    a(new byte[]{1, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 1, 0, 1, 1, 1, 0, 1, 1, 0, 1, 1, 0, 1, 1, 1, 1, 1, 0, 0, 1, 1, 1, 0, 1, 0, 0, 1, 1, 1, 1, 1, 0, 1, 0, 0, 1, 1, 0, 1, 1, 1, 0}, new int[]{66, 64, 0, 55}, true, objArr7);
                    String str3 = (String) objArr7[0];
                    Object[] objArr8 = new Object[1];
                    b((ViewConfiguration.getDoubleTapTimeout() >> 16) + 10061, new char[]{46035, 38018, 64853, 50732, 12028, 30464, 22618, 41103, 35255, 53871, 15056, 920, 25694, 19744, 38370, 65101, 50949, 12226, 28834, 22818, 41419, 35458, 54103, 13365, 7394, 25930, 19978, 38597, 65444, 49270, 10387, 29071, 23150, 41783, 35827, 60504, 13596, 7659, 26272, 20321, 38849, 63627, 49463, 10807, 29416, 23391, 48194, 34041, 60859, 13935, 7838, 26501, 18545, 37165, 63968, 49731, 11031, 29617, 21695, 48438, 34200, 61063, 14187, 6189, 24725, 18754, 37394}, objArr8);
                    String str4 = (String) objArr8[0];
                    Object[] objArr9 = new Object[1];
                    b(46993 - ExpandableListView.getPackedPositionGroup(0L), new char[]{45954, 1028, 56488, 38204, 28113, 9820}, objArr9);
                    String str5 = (String) objArr9[0];
                    Object[] objArr10 = new Object[1];
                    b(22907 - ExpandableListView.getPackedPositionType(0L), new char[]{45961, 60145, 303, 49149, 54881, 3310, 43880, 49623, 30798, 38608, 52499, 27594, 33305, 14505, 22325, 36280, 9279, 17063, 63792, 6051, 20037, 58526, 793, 47515, 53333, 3727, 42404, 56432, 31480, 37169, 53170, 26168, 40170, 15105, 20955, 34908}, objArr10);
                    Object[] objArr11 = {applicationContext, str, str2, str3, str4, true, str5, (String) objArr10[0], 86400};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(448819875);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) ExpandableListView.getPackedPositionGroup(0L), 6030 - (ViewConfiguration.getFadingEdgeLength() >> 16), 24 - Color.argb(0, 0, 0, 0), 1686746678, false, "AudioAttributesCompatParcelizer", new Class[]{Context.class, String.class, String.class, String.class, String.class, Boolean.TYPE, String.class, String.class, Integer.TYPE});
                    }
                    ((Method) objRemoteActionCompatParcelizer2).invoke(objInvoke, objArr11);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            }
        }
        this.write = parseOptionalLongAttr.RemoteActionCompatParcelizer(getContext());
        return true;
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        Cursor cursorQuery;
        int i = 2 % 2;
        write writeVar = new write(uri, str, strArr2);
        SQLiteQueryBuilder sQLiteQueryBuilder = new SQLiteQueryBuilder();
        sQLiteQueryBuilder.setTables(writeVar.write);
        SQLiteDatabase readableDatabase = this.write.getReadableDatabase();
        Cursor cursor = null;
        try {
            if (writeVar.read) {
                cursorQuery = readableDatabase.rawQuery(writeVar.AudioAttributesCompatParcelizer, null);
                int i2 = RemoteActionCompatParcelizer + 121;
                IconCompatParcelizer = i2 % 128;
                int i3 = i2 % 2;
            } else {
                cursorQuery = sQLiteQueryBuilder.query(readableDatabase, strArr, writeVar.RemoteActionCompatParcelizer, writeVar.IconCompatParcelizer, null, null, str2);
            }
            cursor = cursorQuery;
            cursor.setNotificationUri(getContext().getContentResolver(), uri);
            int i4 = RemoteActionCompatParcelizer + 9;
            IconCompatParcelizer = i4 % 128;
            int i5 = i4 % 2;
            return cursor;
        } catch (SQLException unused) {
            return cursor;
        } catch (IllegalArgumentException e) {
            try {
                uri.toString();
                if (strArr2 != null) {
                    Arrays.toString(strArr2);
                }
            } catch (Throwable unused2) {
            }
            throw e;
        }
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        int i = 2 % 2;
        write writeVar = new write(uri, null, null);
        if (TextUtils.isEmpty(writeVar.RemoteActionCompatParcelizer)) {
            StringBuilder sb = new StringBuilder("vnd.android.cursor.dir/");
            sb.append(writeVar.write);
            return sb.toString();
        }
        StringBuilder sb2 = new StringBuilder("vnd.android.cursor.item/");
        sb2.append(writeVar.write);
        String string = sb2.toString();
        int i2 = IconCompatParcelizer + 45;
        RemoteActionCompatParcelizer = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 9 / 0;
        }
        return string;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v10 long, still in use, count: 2, list:
          (r1v10 long) from 0x003d: PHI (r1v7 long) = (r1v6 long), (r1v10 long) binds: [B:8:0x002d, B:5:0x001c] A[DONT_GENERATE, DONT_INLINE]
          (r1v10 long) from 0x001a: CMP_L (r1v10 long), (1 long) A[WRAPPED]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:114)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:62)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:45)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:67)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:35)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    @Override // android.content.ContentProvider
    public android.net.Uri insert(android.net.Uri r6, android.content.ContentValues r7) {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = kotlin.parseSelectionFlags.IconCompatParcelizer
            int r1 = r1 + 79
            int r2 = r1 % 128
            kotlin.parseSelectionFlags.RemoteActionCompatParcelizer = r2
            int r1 = r1 % r0
            if (r1 != 0) goto L1f
            android.database.sqlite.SQLiteOpenHelper r1 = r5.write
            android.database.sqlite.SQLiteDatabase r1 = r1.getWritableDatabase()
            long r1 = RemoteActionCompatParcelizer(r1, r6, r7)
            r3 = 1
            int r7 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r7 > 0) goto L3d
            goto L2f
        L1f:
            android.database.sqlite.SQLiteOpenHelper r1 = r5.write
            android.database.sqlite.SQLiteDatabase r1 = r1.getWritableDatabase()
            long r1 = RemoteActionCompatParcelizer(r1, r6, r7)
            r3 = 0
            int r7 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r7 > 0) goto L3d
        L2f:
            int r5 = kotlin.parseSelectionFlags.IconCompatParcelizer
            int r5 = r5 + 23
            int r6 = r5 % 128
            kotlin.parseSelectionFlags.RemoteActionCompatParcelizer = r6
            int r5 = r5 % r0
            r6 = 0
            if (r5 == 0) goto L3c
            return r6
        L3c:
            throw r6
        L3d:
            android.net.Uri r6 = android.content.ContentUris.withAppendedId(r6, r1)
            r5.IconCompatParcelizer(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.parseSelectionFlags.insert(android.net.Uri, android.content.ContentValues):android.net.Uri");
    }

    private static long RemoteActionCompatParcelizer(SQLiteDatabase sQLiteDatabase, Uri uri, ContentValues contentValues) {
        int i = 2 % 2;
        long jInsertWithOnConflict = sQLiteDatabase.insertWithOnConflict(new write(uri).write, null, contentValues, 5);
        int i2 = IconCompatParcelizer + 73;
        RemoteActionCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        return jInsertWithOnConflict;
    }

    static class write {
        public String AudioAttributesCompatParcelizer;
        public final String[] IconCompatParcelizer;
        public final String RemoteActionCompatParcelizer;
        public boolean read;
        public final String write;

        write(Uri uri, String str, String[] strArr) {
            this.read = false;
            String queryParameter = uri.getQueryParameter("customquery");
            if (queryParameter != null && queryParameter.trim().equals("true")) {
                this.read = true;
                this.AudioAttributesCompatParcelizer = str;
            }
            if (uri.getPathSegments().size() == 1) {
                this.write = uri.getPathSegments().get(0);
                this.RemoteActionCompatParcelizer = str;
                this.IconCompatParcelizer = strArr;
            } else {
                if (uri.getPathSegments().size() != 2) {
                    if (!this.read) {
                        throw new IllegalArgumentException("Invalid URI: ".concat(String.valueOf(uri)));
                    }
                    this.write = "";
                    this.RemoteActionCompatParcelizer = str;
                    this.IconCompatParcelizer = strArr;
                    return;
                }
                this.write = uri.getPathSegments().get(0);
                StringBuilder sb = new StringBuilder("_id=");
                sb.append(ContentUris.parseId(uri));
                this.RemoteActionCompatParcelizer = sb.toString();
                this.IconCompatParcelizer = null;
            }
        }

        write(Uri uri) {
            this.read = false;
            if (uri.getPathSegments().size() == 1) {
                this.write = uri.getPathSegments().get(0);
                this.RemoteActionCompatParcelizer = null;
                this.IconCompatParcelizer = null;
                return;
            }
            throw new IllegalArgumentException("Invalid URI: ".concat(String.valueOf(uri)));
        }
    }

    @Override // android.content.ContentProvider
    public int bulkInsert(Uri uri, ContentValues[] contentValuesArr) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 117;
        RemoteActionCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        SQLiteDatabase writableDatabase = this.write.getWritableDatabase();
        writableDatabase.beginTransaction();
        try {
            int length = contentValuesArr.length;
            int i4 = 0;
            while (i4 < length) {
                RemoteActionCompatParcelizer(writableDatabase, uri, contentValuesArr[i4]);
                i4++;
                int i5 = IconCompatParcelizer + 77;
                RemoteActionCompatParcelizer = i5 % 128;
                int i6 = i5 % 2;
            }
            writableDatabase.setTransactionSuccessful();
            writableDatabase.endTransaction();
            return contentValuesArr.length;
        } catch (Throwable th) {
            writableDatabase.endTransaction();
            throw th;
        }
    }

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) throws SQLException {
        int i = 2 % 2;
        write writeVar = new write(uri, str, strArr);
        int iDelete = this.write.getWritableDatabase().delete(writeVar.write, writeVar.RemoteActionCompatParcelizer, writeVar.IconCompatParcelizer);
        if (iDelete > 0) {
            int i2 = RemoteActionCompatParcelizer + 63;
            IconCompatParcelizer = i2 % 128;
            int i3 = i2 % 2;
            IconCompatParcelizer(uri);
            int i4 = RemoteActionCompatParcelizer + 75;
            IconCompatParcelizer = i4 % 128;
            int i5 = i4 % 2;
        }
        int i6 = IconCompatParcelizer + 21;
        RemoteActionCompatParcelizer = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 45 / 0;
        }
        return iDelete;
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) throws SQLException {
        int i = 2 % 2;
        write writeVar = new write(uri, str, strArr);
        int iUpdate = this.write.getWritableDatabase().update(writeVar.write, contentValues, writeVar.RemoteActionCompatParcelizer, writeVar.IconCompatParcelizer);
        if (iUpdate > 0) {
            int i2 = IconCompatParcelizer + 31;
            RemoteActionCompatParcelizer = i2 % 128;
            int i3 = i2 % 2;
            IconCompatParcelizer(uri);
            if (i3 == 0) {
                int i4 = 16 / 0;
            }
        }
        return iUpdate;
    }

    private static void a(byte[] bArr, int[] iArr, boolean z, Object[] objArr) throws Throwable {
        int i = 2 % 2;
        buildSetStopReasonIntent buildsetstopreasonintent = new buildSetStopReasonIntent();
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        char[] cArr = AudioAttributesCompatParcelizer;
        if (cArr != null) {
            int i6 = $11 + 75;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            int length = cArr.length;
            char[] cArr2 = new char[length];
            for (int i8 = 0; i8 < length; i8++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[i8])};
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-338863922);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) (ViewConfiguration.getJumpTapTimeout() >> 16), (ViewConfiguration.getLongPressTimeout() >> 16) + 11613, AndroidCharacter.getMirror('0') - 28, -1786471333, false, "u", new Class[]{Integer.TYPE});
                    }
                    cArr2[i8] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
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
            int i9 = $11 + 85;
            $10 = i9 % 128;
            int i10 = i9 % 2;
            char[] cArr4 = new char[i3];
            buildsetstopreasonintent.RemoteActionCompatParcelizer = 0;
            char c = 0;
            while (buildsetstopreasonintent.RemoteActionCompatParcelizer < i3) {
                if (bArr[buildsetstopreasonintent.RemoteActionCompatParcelizer] == 1) {
                    int i11 = $11 + 33;
                    $10 = i11 % 128;
                    if (i11 % 2 != 0) {
                        int i12 = buildsetstopreasonintent.RemoteActionCompatParcelizer;
                        Object[] objArr3 = {Integer.valueOf(cArr3[buildsetstopreasonintent.RemoteActionCompatParcelizer]), Integer.valueOf(c)};
                        Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-1429458299);
                        if (objRemoteActionCompatParcelizer2 == null) {
                            objRemoteActionCompatParcelizer2 = startForeground.read((char) Color.argb(0, 0, 0, 0), 22959 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 42, -729418224, false, "x", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i12] = ((Character) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).charValue();
                        int i13 = 24 / 0;
                    } else {
                        int i14 = buildsetstopreasonintent.RemoteActionCompatParcelizer;
                        Object[] objArr4 = {Integer.valueOf(cArr3[buildsetstopreasonintent.RemoteActionCompatParcelizer]), Integer.valueOf(c)};
                        Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1429458299);
                        if (objRemoteActionCompatParcelizer3 == null) {
                            objRemoteActionCompatParcelizer3 = startForeground.read((char) Color.green(0), Color.red(0) + 22959, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 43, -729418224, false, "x", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i14] = ((Character) ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4)).charValue();
                    }
                } else {
                    int i15 = buildsetstopreasonintent.RemoteActionCompatParcelizer;
                    Object[] objArr5 = {Integer.valueOf(cArr3[buildsetstopreasonintent.RemoteActionCompatParcelizer]), Integer.valueOf(c)};
                    Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(1859710730);
                    if (objRemoteActionCompatParcelizer4 == null) {
                        objRemoteActionCompatParcelizer4 = startForeground.read((char) (31589 - TextUtils.indexOf("", "")), 9863 - (TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), 65 - TextUtils.indexOf("", ""), 277949343, false, "v", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i15] = ((Character) ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5)).charValue();
                }
                c = cArr4[buildsetstopreasonintent.RemoteActionCompatParcelizer];
                Object[] objArr6 = {buildsetstopreasonintent, buildsetstopreasonintent};
                Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(1104966666);
                if (objRemoteActionCompatParcelizer5 == null) {
                    objRemoteActionCompatParcelizer5 = startForeground.read((char) (37822 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 9754, TextUtils.indexOf("", "", 0) + 27, 1066774687, false, "B", new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer5).invoke(null, objArr6);
            }
            cArr3 = cArr4;
        }
        if (i5 > 0) {
            int i16 = $10 + 45;
            $11 = i16 % 128;
            int i17 = i16 % 2;
            char[] cArr5 = new char[i3];
            System.arraycopy(cArr3, 0, cArr5, 0, i3);
            int i18 = i3 - i5;
            System.arraycopy(cArr5, 0, cArr3, i18, i5);
            System.arraycopy(cArr5, i5, cArr3, 0, i18);
        }
        if (z) {
            char[] cArr6 = new char[i3];
            buildsetstopreasonintent.RemoteActionCompatParcelizer = 0;
            while (buildsetstopreasonintent.RemoteActionCompatParcelizer < i3) {
                cArr6[buildsetstopreasonintent.RemoteActionCompatParcelizer] = cArr3[(i3 - buildsetstopreasonintent.RemoteActionCompatParcelizer) - 1];
                buildsetstopreasonintent.RemoteActionCompatParcelizer++;
            }
            cArr3 = cArr6;
        }
        if (i4 > 0) {
            int i19 = $11 + 53;
            $10 = i19 % 128;
            char c2 = 2;
            int i20 = i19 % 2;
            buildsetstopreasonintent.RemoteActionCompatParcelizer = 0;
            while (buildsetstopreasonintent.RemoteActionCompatParcelizer < i3) {
                cArr3[buildsetstopreasonintent.RemoteActionCompatParcelizer] = (char) (cArr3[buildsetstopreasonintent.RemoteActionCompatParcelizer] - iArr[c2]);
                buildsetstopreasonintent.RemoteActionCompatParcelizer++;
                int i21 = $10 + 1;
                $11 = i21 % 128;
                c2 = 2;
                int i22 = i21 % 2;
            }
        }
        objArr[0] = new String(cArr3);
    }

    private void IconCompatParcelizer(Uri uri) {
        int i = 2 % 2;
        String queryParameter = uri.getQueryParameter("notify");
        if (queryParameter != null) {
            int i2 = IconCompatParcelizer + 19;
            RemoteActionCompatParcelizer = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 85 / 0;
                if (!"true".equals(queryParameter)) {
                    return;
                }
            } else if (!"true".equals(queryParameter)) {
                return;
            }
        }
        getContext().getContentResolver().notifyChange(uri, null);
        int i4 = RemoteActionCompatParcelizer + 65;
        IconCompatParcelizer = i4 % 128;
        int i5 = i4 % 2;
    }
}
