package kotlin;

import android.graphics.Color;
import android.graphics.PointF;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.reflect.Method;
import java.net.URI;
import java.net.URL;
import java.util.Arrays;
import java.util.Comparator;
import java.util.function.ToIntFunction;

/* JADX INFO: loaded from: classes5.dex */
public final class FirebaseSyncResponseVersion extends buildFormat {
    public static String IconCompatParcelizer(String str) {
        return RemoteActionCompatParcelizer(str);
    }

    private static String RemoteActionCompatParcelizer(String str) {
        try {
            URL url = new URL(str);
            return new URI(url.getProtocol(), url.getUserInfo(), url.getHost(), url.getPort(), url.getPath(), url.getQuery(), url.getRef()).toASCIIString();
        } catch (Exception e) {
            getSegmentEndTimeUs.IconCompatParcelizer(e);
            return str;
        }
    }

    public static Object IconCompatParcelizer$e29a841(Object[] objArr, PlayerNotificationManager1 playerNotificationManager1) throws Throwable {
        if (objArr == null) {
            return null;
        }
        Arrays.sort(objArr, Comparator.comparingInt(new ToIntFunction() { // from class: o.FreeVideoResponse
            @Override // java.util.function.ToIntFunction
            public final int applyAsInt(Object obj) throws Throwable {
                try {
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-462377156);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) (TextUtils.lastIndexOf("", '0', 0) + 57776), 24417 - (ViewConfiguration.getScrollBarSize() >> 8), 25 - TextUtils.getCapsMode("", 0, 0), -1707512919, false, "read", new Class[0]);
                    }
                    return ((Integer) ((Method) objRemoteActionCompatParcelizer).invoke(obj, null)).intValue();
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            }
        }));
        for (Object obj : objArr) {
            try {
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-462377156);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) (57775 - (Process.myTid() >> 22)), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 24417, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 25, -1707512919, false, "read", new Class[0]);
                }
                Object[] objArr2 = {Integer.valueOf(((Integer) ((Method) objRemoteActionCompatParcelizer).invoke(obj, null)).intValue())};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(1798552305);
                if (objRemoteActionCompatParcelizer2 == null) {
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) ((ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) - 1), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 12444, 18 - KeyEvent.keyCodeFromString(""), 360349284, false, "AudioAttributesCompatParcelizer", new Class[]{Integer.TYPE});
                }
                if (((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr2) == playerNotificationManager1) {
                    return obj;
                }
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        return null;
    }

    public static float read(String str) {
        if (str.endsWith("x")) {
            str = str.substring(0, str.length() - 1);
        } else if (str.endsWith("x(Beta)")) {
            str = str.substring(0, str.length() - 7);
        }
        return Float.parseFloat(str);
    }

    public static cloneAndClear write$47c666ea(Object obj, Object obj2) throws Throwable {
        try {
            Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1101036163);
            if (objRemoteActionCompatParcelizer == null) {
                objRemoteActionCompatParcelizer = startForeground.read((char) (10850 - (ViewConfiguration.getTapTimeout() >> 16)), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 12540, (ViewConfiguration.getLongPressTimeout() >> 16) + 41, -1072283160, false, "AudioAttributesImplApi21Parcelizer", new Class[0]);
            }
            if (((Boolean) ((Method) objRemoteActionCompatParcelizer).invoke(obj, null)).booleanValue()) {
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(814928870);
                if (objRemoteActionCompatParcelizer2 == null) {
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) (ViewConfiguration.getDoubleTapTimeout() >> 16), (ViewConfiguration.getLongPressTimeout() >> 16) + 12507, (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 34, 1322981235, false, "write", new Class[0]);
                }
                if (!((Boolean) ((Method) objRemoteActionCompatParcelizer2).invoke(obj2, null)).booleanValue()) {
                    return cloneAndClear.IconCompatParcelizer;
                }
            }
            return cloneAndClear.AudioAttributesCompatParcelizer;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public static Enum AudioAttributesCompatParcelizer$58854885(Object obj, Object obj2, Object obj3) throws Throwable {
        try {
            Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1101036163);
            if (objRemoteActionCompatParcelizer == null) {
                objRemoteActionCompatParcelizer = startForeground.read((char) (10851 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), 12540 - TextUtils.lastIndexOf("", '0', 0), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 40, -1072283160, false, "AudioAttributesImplApi21Parcelizer", new Class[0]);
            }
            if (((Boolean) ((Method) objRemoteActionCompatParcelizer).invoke(obj, null)).booleanValue()) {
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(814928870);
                if (objRemoteActionCompatParcelizer2 == null) {
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), 12507 - Color.red(0), (ViewConfiguration.getScrollBarSize() >> 8) + 34, 1322981235, false, "write", new Class[0]);
                }
                if (!((Boolean) ((Method) objRemoteActionCompatParcelizer2).invoke(obj2, null)).booleanValue()) {
                    Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-44272116);
                    if (objRemoteActionCompatParcelizer3 == null) {
                        objRemoteActionCompatParcelizer3 = startForeground.read((char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 10849), 12541 - (ViewConfiguration.getWindowTouchSlop() >> 8), 40 - TextUtils.indexOf((CharSequence) "", '0'), -2095730023, false, "IconCompatParcelizer", new Class[0]);
                    }
                    return (Enum) ((Method) objRemoteActionCompatParcelizer3).invoke(obj, null);
                }
            }
            Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(520356595);
            if (objRemoteActionCompatParcelizer4 == null) {
                objRemoteActionCompatParcelizer4 = startForeground.read((char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), 12462 - TextUtils.indexOf("", ""), 34 - TextUtils.indexOf((CharSequence) "", '0'), 1632487014, false, "RemoteActionCompatParcelizer", new Class[0]);
            }
            Object objInvoke = ((Method) objRemoteActionCompatParcelizer4).invoke(obj3, null);
            Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(1677702039);
            if (objRemoteActionCompatParcelizer5 == null) {
                objRemoteActionCompatParcelizer5 = startForeground.read((char) View.MeasureSpec.getMode(0), 12424 - (ViewConfiguration.getWindowTouchSlop() >> 8), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 19, 498497282, false, "read", new Class[0]);
            }
            Object[] objArr = {((Method) objRemoteActionCompatParcelizer5).invoke(objInvoke, null)};
            Object objRemoteActionCompatParcelizer6 = startForeground.RemoteActionCompatParcelizer(-169007502);
            if (objRemoteActionCompatParcelizer6 == null) {
                objRemoteActionCompatParcelizer6 = startForeground.read((char) (TextUtils.indexOf("", "", 0, 0) + 21328), (ViewConfiguration.getTapTimeout() >> 16) + 13711, 56 - ((Process.getThreadPriority(0) + 20) >> 6), -1952128281, false, "read", new Class[]{(Class) startForeground.IconCompatParcelizer((char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 30377), Color.blue(0) + 13468, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 21)});
            }
            return (Enum) ((Method) objRemoteActionCompatParcelizer6).invoke(null, objArr);
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }
}
