package kotlin;

import android.media.AudioTrack;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.reflect.Method;
import java.util.Comparator;

/* JADX INFO: loaded from: classes5.dex */
public final class isCausedByUnknownHostException {
    /* JADX WARN: Removed duplicated region for block: B:45:0x0196 A[Catch: all -> 0x0104, TryCatch #0 {all -> 0x0104, blocks: (B:19:0x0098, B:21:0x00b4, B:22:0x00f5, B:36:0x0134, B:38:0x013a, B:39:0x0169, B:43:0x017a, B:45:0x0196, B:46:0x01cc), top: B:54:0x0098 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01de  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.util.List<java.lang.Object> write(java.util.List<com.marrow.data.models.video.cache.CourseDownloadCount> r23, java.util.List<com.marrow2.data.user.remote.model.CourseModelV3> r24, int r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 507
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.isCausedByUnknownHostException.write(java.util.List, java.util.List, int):java.util.List");
    }

    public static final class RemoteActionCompatParcelizer<T> implements Comparator {
        private /* synthetic */ Comparator read;

        @Override // java.util.Comparator
        public final int compare(T t, T t2) throws Throwable {
            int iCompare = this.read.compare(t, t2);
            if (iCompare != 0) {
                return iCompare;
            }
            try {
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1496018599);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) (43694 - ((byte) KeyEvent.getModifierMetaStateMask())), KeyEvent.normalizeMetaState(0) + 23297, TextUtils.indexOf((CharSequence) "", '0') + 16, -660777524, false, "IconCompatParcelizer", new Class[0]);
                }
                Comparable comparable = (Comparable) ((Method) objRemoteActionCompatParcelizer).invoke(t, null);
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-1496018599);
                if (objRemoteActionCompatParcelizer2 == null) {
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) (43695 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), 23297 - View.getDefaultSize(0, 0), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 15, -660777524, false, "IconCompatParcelizer", new Class[0]);
                }
                return getConfigExpirySeconds.read(comparable, (Comparable) ((Method) objRemoteActionCompatParcelizer2).invoke(t2, null));
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }

        public RemoteActionCompatParcelizer(Comparator comparator) {
            this.read = comparator;
        }
    }

    public static final class read<T> implements Comparator {
        private /* synthetic */ Comparator AudioAttributesCompatParcelizer;

        @Override // java.util.Comparator
        public final int compare(T t, T t2) throws Throwable {
            int iCompare = this.AudioAttributesCompatParcelizer.compare(t, t2);
            if (iCompare != 0) {
                return iCompare;
            }
            try {
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-37190931);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) (MotionEvent.axisFromString("") + 43696), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 23297, 15 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), -2088679816, false, "read", new Class[0]);
                }
                Integer numValueOf = Integer.valueOf(((Integer) ((Method) objRemoteActionCompatParcelizer).invoke(t2, null)).intValue());
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-37190931);
                if (objRemoteActionCompatParcelizer2 == null) {
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) (43695 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), (Process.myTid() >> 22) + 23297, TextUtils.getTrimmedLength("") + 15, -2088679816, false, "read", new Class[0]);
                }
                return getConfigExpirySeconds.read(numValueOf, Integer.valueOf(((Integer) ((Method) objRemoteActionCompatParcelizer2).invoke(t, null)).intValue()));
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }

        public read(Comparator comparator) {
            this.AudioAttributesCompatParcelizer = comparator;
        }
    }

    public static final class write<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) throws Throwable {
            try {
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-630314324);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) ((AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 43695), 23297 - (ViewConfiguration.getTapTimeout() >> 16), (ViewConfiguration.getJumpTapTimeout() >> 16) + 15, -1540886983, false, "write", new Class[0]);
                }
                Boolean boolValueOf = Boolean.valueOf(((Boolean) ((Method) objRemoteActionCompatParcelizer).invoke(t2, null)).booleanValue());
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-630314324);
                if (objRemoteActionCompatParcelizer2 == null) {
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) (43695 - KeyEvent.keyCodeFromString("")), 23297 - (TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), 15 - ExpandableListView.getPackedPositionType(0L), -1540886983, false, "write", new Class[0]);
                }
                return getConfigExpirySeconds.read(boolValueOf, Boolean.valueOf(((Boolean) ((Method) objRemoteActionCompatParcelizer2).invoke(t, null)).booleanValue()));
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
    }
}
