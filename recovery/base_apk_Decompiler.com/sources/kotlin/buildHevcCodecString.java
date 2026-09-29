package kotlin;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes5.dex */
public final class buildHevcCodecString {

    public static final /* synthetic */ class read {
        public static final /* synthetic */ int[] IconCompatParcelizer;

        static {
            try {
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-405204607);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) TextUtils.getOffsetAfter("", 0), (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 17729, 13 - (ViewConfiguration.getTouchSlop() >> 8), -1718561516, false, "values", new Class[0]);
                }
                int[] iArr = new int[((Object[]) ((Method) objRemoteActionCompatParcelizer).invoke(null, null)).length];
                try {
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-734896599);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (ViewConfiguration.getEdgeSlop() >> 16) + 17730, (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 12, -1434740036, false, "RemoteActionCompatParcelizer", null);
                    }
                    iArr[((Enum) ((Field) objRemoteActionCompatParcelizer2).get(null)).ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-317187063);
                    if (objRemoteActionCompatParcelizer3 == null) {
                        objRemoteActionCompatParcelizer3 = startForeground.read((char) View.resolveSizeAndState(0, 0, 0), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 17730, 12 - ((byte) KeyEvent.getModifierMetaStateMask()), -1823352676, false, "write", null);
                    }
                    iArr[((Enum) ((Field) objRemoteActionCompatParcelizer3).get(null)).ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-212393722);
                    if (objRemoteActionCompatParcelizer4 == null) {
                        objRemoteActionCompatParcelizer4 = startForeground.read((char) ((-1) - MotionEvent.axisFromString("")), 17730 - ExpandableListView.getPackedPositionGroup(0L), ImageFormat.getBitsPerPixel(0) + 14, -1927354989, false, "IconCompatParcelizer", null);
                    }
                    iArr[((Enum) ((Field) objRemoteActionCompatParcelizer4).get(null)).ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                IconCompatParcelizer = iArr;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
    }

    public static final buildAvcCodecString write$23574ff(Object obj) throws Throwable {
        String str;
        toMagicModuleMetaRepoModel.write(obj, "");
        try {
            Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1209084401);
            if (objRemoteActionCompatParcelizer == null) {
                objRemoteActionCompatParcelizer = startForeground.read((char) (ViewConfiguration.getScrollBarSize() >> 8), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 24221, TextUtils.lastIndexOf("", '0') + 25, -911797606, false, "RemoteActionCompatParcelizer", new Class[0]);
            }
            int i = read.IconCompatParcelizer[((Enum) ((Method) objRemoteActionCompatParcelizer).invoke(obj, null)).ordinal()];
            if (i == 1) {
                str = "N";
            } else if (i == 2) {
                str = "SB";
            } else {
                if (i != 3) {
                    throw new RenewEligibleCreator();
                }
                str = "DE";
            }
            Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(234643136);
            if (objRemoteActionCompatParcelizer2 == null) {
                objRemoteActionCompatParcelizer2 = startForeground.read((char) (ViewConfiguration.getEdgeSlop() >> 16), AndroidCharacter.getMirror('0') + 24173, (ViewConfiguration.getScrollBarSize() >> 8) + 24, 1941281365, false, "read", new Class[0]);
            }
            String strRemoteActionCompatParcelizer = IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) ((Method) objRemoteActionCompatParcelizer2).invoke(obj, null), ",", null, null, 0, null, new getAnswerMap() { // from class: o.findNalStartCode
                @Override // kotlin.getAnswerMap
                public final Object invoke(Object obj2) {
                    return buildHevcCodecString.read$4b0273aa((Enum) obj2);
                }
            }, 30);
            Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-753609808);
            if (objRemoteActionCompatParcelizer3 == null) {
                objRemoteActionCompatParcelizer3 = startForeground.read((char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1), Color.argb(0, 0, 0, 0) + 24221, 23 - MotionEvent.axisFromString(""), -1386408155, false, "AudioAttributesCompatParcelizer", new Class[0]);
            }
            return new buildAvcCodecString(strRemoteActionCompatParcelizer, str, ((Integer) ((Method) objRemoteActionCompatParcelizer3).invoke(obj, null)).intValue());
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence read$4b0273aa(Enum r10) throws Throwable {
        toMagicModuleMetaRepoModel.write(r10, "");
        try {
            Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(157908140);
            if (objRemoteActionCompatParcelizer == null) {
                objRemoteActionCompatParcelizer = startForeground.read((char) (14694 - TextUtils.getCapsMode("", 0, 0)), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 17742, TextUtils.indexOf((CharSequence) "", '0') + 7, 1998633017, false, "write", new Class[0]);
            }
            return (CharSequence) ((Method) objRemoteActionCompatParcelizer).invoke(r10, null);
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }
}
