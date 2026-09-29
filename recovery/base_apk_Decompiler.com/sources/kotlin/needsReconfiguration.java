package kotlin;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.exoplayer2.upstream.CmcdHeadersFactory;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes3.dex */
public final class needsReconfiguration {
    private final String IconCompatParcelizer;
    private final Map<Class<?>, Object> write;
    private static final byte[] $$a = {TarConstants.LF_FIFO, -78, 96, -9};
    private static final int $$b = 112;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static int MediaBrowserCompatItemReceiver = 1;
    private static long AudioAttributesCompatParcelizer = 4216593927095582492L;
    private static int read = 1000326319;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(int r5, byte r6, short r7) {
        /*
            int r7 = r7 * 2
            int r7 = r7 + 119
            int r5 = r5 * 4
            int r0 = r5 + 1
            int r6 = r6 * 3
            int r6 = 4 - r6
            byte[] r1 = kotlin.needsReconfiguration.$$a
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L17
            r4 = r7
            r3 = r2
            r7 = r5
            goto L27
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r5) goto L23
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            return r5
        L23:
            r4 = r1[r6]
            int r3 = r3 + 1
        L27:
            int r7 = r7 + r4
            int r6 = r6 + 1
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.needsReconfiguration.$$c(int, byte, short):java.lang.String");
    }

    /* synthetic */ needsReconfiguration(String str, Map map, byte b) {
        this(str, map);
    }

    private needsReconfiguration(String str, Map<Class<?>, Object> map) {
        this.IconCompatParcelizer = str;
        this.write = map;
    }

    public final String read() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 87;
        int i3 = i2 % 128;
        MediaBrowserCompatItemReceiver = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        String str = this.IconCompatParcelizer;
        int i4 = i3 + 33;
        RemoteActionCompatParcelizer = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final <T extends Annotation> T read(Class<T> cls) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 33;
        MediaBrowserCompatItemReceiver = i2 % 128;
        int i3 = i2 % 2;
        T t = (T) this.write.get(cls);
        int i4 = RemoteActionCompatParcelizer + 37;
        MediaBrowserCompatItemReceiver = i4 % 128;
        int i5 = i4 % 2;
        return t;
    }

    public static needsReconfiguration AudioAttributesCompatParcelizer(String str) {
        int i = 2 % 2;
        needsReconfiguration needsreconfiguration = new needsReconfiguration(str, Collections.emptyMap());
        int i2 = MediaBrowserCompatItemReceiver + 117;
        RemoteActionCompatParcelizer = i2 % 128;
        if (i2 % 2 == 0) {
            return needsreconfiguration;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static write RemoteActionCompatParcelizer(String str) {
        int i = 2 % 2;
        write writeVar = new write(str);
        int i2 = RemoteActionCompatParcelizer + 13;
        MediaBrowserCompatItemReceiver = i2 % 128;
        int i3 = i2 % 2;
        return writeVar;
    }

    private static void a(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        notifyDownloadChanged notifydownloadchanged = new notifyDownloadChanged();
        notifydownloadchanged.read = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        notifydownloadchanged.AudioAttributesCompatParcelizer = 0;
        int i3 = $10 + 115;
        $11 = i3 % 128;
        int i4 = i3 % 2;
        while (notifydownloadchanged.AudioAttributesCompatParcelizer < cArr.length) {
            int i5 = $10 + 93;
            $11 = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = notifydownloadchanged.AudioAttributesCompatParcelizer;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[notifydownloadchanged.AudioAttributesCompatParcelizer]), notifydownloadchanged, notifydownloadchanged};
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1435583294);
                    if (objRemoteActionCompatParcelizer == null) {
                        byte b = (byte) 0;
                        byte b2 = b;
                        objRemoteActionCompatParcelizer = startForeground.read((char) (38461 - (ViewConfiguration.getTouchSlop() >> 8)), View.resolveSize(0, 0) + 532, (ViewConfiguration.getScrollBarSize() >> 8) + 8, -735610793, false, $$c(b, b2, (byte) (b2 + 1)), new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i6] = ((Long) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).longValue() - (AudioAttributesCompatParcelizer & 2192498202983240651L);
                    Object[] objArr3 = {notifydownloadchanged, notifydownloadchanged};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(1971306176);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) (36622 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), 2340 - Color.argb(0, 0, 0, 0), 29 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), 188119637, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } else {
                int i7 = notifydownloadchanged.AudioAttributesCompatParcelizer;
                Object[] objArr4 = {Integer.valueOf(cArr[notifydownloadchanged.AudioAttributesCompatParcelizer]), notifydownloadchanged, notifydownloadchanged};
                Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1435583294);
                if (objRemoteActionCompatParcelizer3 == null) {
                    byte b5 = (byte) 0;
                    byte b6 = b5;
                    objRemoteActionCompatParcelizer3 = startForeground.read((char) (AndroidCharacter.getMirror('0') + 38413), 532 - TextUtils.getOffsetAfter("", 0), Drawable.resolveOpacity(0, 0) + 8, -735610793, false, $$c(b5, b6, (byte) (b6 + 1)), new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i7] = ((Long) ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4)).longValue() ^ (AudioAttributesCompatParcelizer ^ 2192498202983240651L);
                Object[] objArr5 = {notifydownloadchanged, notifydownloadchanged};
                Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(1971306176);
                if (objRemoteActionCompatParcelizer4 == null) {
                    byte b7 = (byte) 0;
                    byte b8 = b7;
                    objRemoteActionCompatParcelizer4 = startForeground.read((char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 36620), Gravity.getAbsoluteGravity(0, 0) + 2340, 28 - (AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), 188119637, false, $$c(b7, b8, b8), new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5);
            }
        }
        char[] cArr2 = new char[length];
        notifydownloadchanged.AudioAttributesCompatParcelizer = 0;
        while (notifydownloadchanged.AudioAttributesCompatParcelizer < cArr.length) {
            cArr2[notifydownloadchanged.AudioAttributesCompatParcelizer] = (char) jArr[notifydownloadchanged.AudioAttributesCompatParcelizer];
            Object[] objArr6 = {notifydownloadchanged, notifydownloadchanged};
            Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(1971306176);
            if (objRemoteActionCompatParcelizer5 == null) {
                byte b9 = (byte) 0;
                byte b10 = b9;
                objRemoteActionCompatParcelizer5 = startForeground.read((char) (36621 - View.MeasureSpec.getSize(0)), 2341 - (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), Color.blue(0) + 28, 188119637, false, $$c(b9, b10, b10), new Class[]{Object.class, Object.class});
            }
            ((Method) objRemoteActionCompatParcelizer5).invoke(null, objArr6);
        }
        objArr[0] = new String(cArr2);
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = RemoteActionCompatParcelizer + 123;
            MediaBrowserCompatItemReceiver = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (obj instanceof needsReconfiguration) {
            needsReconfiguration needsreconfiguration = (needsReconfiguration) obj;
            if (!(!this.IconCompatParcelizer.equals(needsreconfiguration.IconCompatParcelizer)) && this.write.equals(needsreconfiguration.write)) {
                return true;
            }
            int i4 = MediaBrowserCompatItemReceiver + 25;
            RemoteActionCompatParcelizer = i4 % 128;
            if (i4 % 2 == 0) {
                return false;
            }
            throw null;
        }
        int i5 = RemoteActionCompatParcelizer;
        int i6 = i5 + 69;
        MediaBrowserCompatItemReceiver = i6 % 128;
        int i7 = i6 % 2;
        int i8 = i5 + 85;
        MediaBrowserCompatItemReceiver = i8 % 128;
        if (i8 % 2 != 0) {
            return false;
        }
        throw null;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatItemReceiver + 89;
        RemoteActionCompatParcelizer = i2 % 128;
        return i2 % 2 != 0 ? (this.IconCompatParcelizer.hashCode() >> 122) % this.write.hashCode() : (this.IconCompatParcelizer.hashCode() * 31) + this.write.hashCode();
    }

    public final String toString() {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder("FieldDescriptor{name=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", properties=");
        sb.append(this.write.values());
        sb.append("}");
        String string = sb.toString();
        int i2 = RemoteActionCompatParcelizer + 75;
        MediaBrowserCompatItemReceiver = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 97 / 0;
        }
        return string;
    }

    /* JADX INFO: loaded from: classes5.dex */
    public static final class write {
        private Map<Class<?>, Object> AudioAttributesCompatParcelizer = null;
        private final String read;

        write(String str) {
            this.read = str;
        }

        public final <T extends Annotation> write AudioAttributesCompatParcelizer(T t) {
            if (this.AudioAttributesCompatParcelizer == null) {
                this.AudioAttributesCompatParcelizer = new HashMap();
            }
            this.AudioAttributesCompatParcelizer.put(t.annotationType(), t);
            return this;
        }

        public final needsReconfiguration IconCompatParcelizer() {
            Map mapUnmodifiableMap;
            String str = this.read;
            if (this.AudioAttributesCompatParcelizer == null) {
                mapUnmodifiableMap = Collections.emptyMap();
            } else {
                mapUnmodifiableMap = Collections.unmodifiableMap(new HashMap(this.AudioAttributesCompatParcelizer));
            }
            return new needsReconfiguration(str, mapUnmodifiableMap, (byte) 0);
        }
    }

    private static void b(int i, int i2, boolean z, char[] cArr, int i3, Object[] objArr) throws Throwable {
        int i4 = 2 % 2;
        clearDownloadManagerHelpers cleardownloadmanagerhelpers = new clearDownloadManagerHelpers();
        char[] cArr2 = new char[i2];
        cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer = 0;
        while (cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer < i2) {
            cleardownloadmanagerhelpers.RemoteActionCompatParcelizer = cArr[cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer];
            cArr2[cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer] = (char) (i + cleardownloadmanagerhelpers.RemoteActionCompatParcelizer);
            int i5 = cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i5]), Integer.valueOf(read)};
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-579447922);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) Drawable.resolveOpacity(0, 0), ExpandableListView.getPackedPositionGroup(0L) + 23704, 32 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), -1556113637, false, CmcdHeadersFactory.OBJECT_TYPE_AUDIO_ONLY, new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i5] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                try {
                    Object[] objArr3 = {cleardownloadmanagerhelpers, cleardownloadmanagerhelpers};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-322440307);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) ((AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 44862), Color.red(0) + 18944, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 28, -1836173544, false, "c", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3);
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
        if (i3 > 0) {
            int i6 = $10 + 75;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            cleardownloadmanagerhelpers.write = i3;
            char[] cArr3 = new char[i2];
            System.arraycopy(cArr2, 0, cArr3, 0, i2);
            System.arraycopy(cArr3, 0, cArr2, i2 - cleardownloadmanagerhelpers.write, cleardownloadmanagerhelpers.write);
            System.arraycopy(cArr3, cleardownloadmanagerhelpers.write, cArr2, 0, i2 - cleardownloadmanagerhelpers.write);
            int i8 = $11 + 57;
            $10 = i8 % 128;
            int i9 = i8 % 2;
        }
        if (z) {
            int i10 = $10 + 111;
            $11 = i10 % 128;
            int i11 = i10 % 2;
            char[] cArr4 = new char[i2];
            cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer = 0;
            int i12 = $10 + 95;
            $11 = i12 % 128;
            int i13 = i12 % 2;
            while (cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer < i2) {
                cArr4[cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer] = cArr2[(i2 - cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer) - 1];
                Object[] objArr4 = {cleardownloadmanagerhelpers, cleardownloadmanagerhelpers};
                Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-322440307);
                if (objRemoteActionCompatParcelizer3 == null) {
                    objRemoteActionCompatParcelizer3 = startForeground.read((char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 44861), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 18944, TextUtils.getTrimmedLength("") + 28, -1836173544, false, "c", new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    /*  JADX ERROR: NoSuchElementException in pass: ReplaceNewArray
        java.util.NoSuchElementException
        	at java.base/java.util.TreeMap.key(TreeMap.java:1637)
        	at java.base/java.util.TreeMap.lastKey(TreeMap.java:309)
        	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:171)
        	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
        	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
        */
    public static java.lang.Object[] IconCompatParcelizer(android.content.Context r31, int r32, int r33) {
        /*
            Method dump skipped, instruction units count: 3987
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.needsReconfiguration.IconCompatParcelizer(android.content.Context, int, int):java.lang.Object[]");
    }
}
