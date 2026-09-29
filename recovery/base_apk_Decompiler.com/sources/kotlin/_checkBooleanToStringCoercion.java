package kotlin;

import android.app.Activity;
import android.app.SharedElementCallback;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.PackageManager;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import kotlin._checkBooleanToStringCoercion;
import kotlin._intOverflow;

/* JADX INFO: loaded from: classes.dex */
public class _checkBooleanToStringCoercion extends _isNaN {
    private static IconCompatParcelizer IconCompatParcelizer;

    public interface AudioAttributesImplApi26Parcelizer {
        void validateRequestPermissionsRequestCode(int i);
    }

    /* JADX INFO: loaded from: classes2.dex */
    public interface IconCompatParcelizer {
        boolean RemoteActionCompatParcelizer(Activity activity, String[] strArr, int i);
    }

    protected _checkBooleanToStringCoercion() {
    }

    public static void read(Activity activity, Intent intent, int i, Bundle bundle) {
        activity.startActivityForResult(intent, i, bundle);
    }

    public static void IconCompatParcelizer(Activity activity, IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws IntentSender.SendIntentException {
        activity.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }

    public static void RemoteActionCompatParcelizer(Activity activity) {
        activity.finishAffinity();
    }

    public static void write(Activity activity) {
        write.read(activity);
    }

    public static void IconCompatParcelizer(Activity activity, _intOverflow _intoverflow) {
        write.read(activity, _intoverflow != null ? new MediaBrowserCompatItemReceiver(_intoverflow) : null);
    }

    public static void read(Activity activity, _intOverflow _intoverflow) {
        write.RemoteActionCompatParcelizer(activity, _intoverflow != null ? new MediaBrowserCompatItemReceiver(_intoverflow) : null);
    }

    public static void read(Activity activity) {
        write.AudioAttributesCompatParcelizer(activity);
    }

    public static void AudioAttributesCompatParcelizer(Activity activity) {
        write.write(activity);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void AudioAttributesCompatParcelizer(Activity activity, String[] strArr, int i) {
        IconCompatParcelizer iconCompatParcelizer = IconCompatParcelizer;
        if (iconCompatParcelizer == null || !iconCompatParcelizer.RemoteActionCompatParcelizer(activity, strArr, i)) {
            HashSet hashSet = new HashSet();
            for (int i2 = 0; i2 < strArr.length; i2++) {
                if (TextUtils.isEmpty(strArr[i2])) {
                    StringBuilder sb = new StringBuilder("Permission request for permissions ");
                    sb.append(Arrays.toString(strArr));
                    sb.append(" must not contain null or empty values");
                    throw new IllegalArgumentException(sb.toString());
                }
                if (Build.VERSION.SDK_INT < 33 && TextUtils.equals(strArr[i2], "android.permission.POST_NOTIFICATIONS")) {
                    hashSet.add(Integer.valueOf(i2));
                }
            }
            int size = hashSet.size();
            String[] strArr2 = size > 0 ? new String[strArr.length - size] : strArr;
            if (size > 0) {
                if (size == strArr.length) {
                    return;
                }
                int i3 = 0;
                for (int i4 = 0; i4 < strArr.length; i4++) {
                    if (!hashSet.contains(Integer.valueOf(i4))) {
                        strArr2[i3] = strArr[i4];
                        i3++;
                    }
                }
            }
            if (activity instanceof AudioAttributesImplApi26Parcelizer) {
                ((AudioAttributesImplApi26Parcelizer) activity).validateRequestPermissionsRequestCode(i);
            }
            RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(activity, strArr, i);
        }
    }

    public static boolean write(Activity activity, String str) {
        if (Build.VERSION.SDK_INT < 33 && TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 32) {
            return read.read(activity, str);
        }
        if (Build.VERSION.SDK_INT == 31) {
            return AudioAttributesCompatParcelizer.IconCompatParcelizer(activity, str);
        }
        return RemoteActionCompatParcelizer.write(activity, str);
    }

    public static void IconCompatParcelizer(Activity activity) {
        activity.recreate();
    }

    /* JADX INFO: loaded from: classes4.dex */
    static class MediaBrowserCompatItemReceiver extends SharedElementCallback {
        private final _intOverflow read;

        @Override // android.app.SharedElementCallback
        public void onMapSharedElements(List<String> list, Map<String, View> map) {
        }

        @Override // android.app.SharedElementCallback
        public void onRejectSharedElements(List<View> list) {
        }

        @Override // android.app.SharedElementCallback
        public void onSharedElementEnd(List<String> list, List<View> list2, List<View> list3) {
        }

        @Override // android.app.SharedElementCallback
        public void onSharedElementStart(List<String> list, List<View> list2, List<View> list3) {
        }

        MediaBrowserCompatItemReceiver(_intOverflow _intoverflow) {
            this.read = _intoverflow;
        }

        @Override // android.app.SharedElementCallback
        public Parcelable onCaptureSharedElementSnapshot(View view, Matrix matrix, RectF rectF) {
            return this.read.write(view, matrix, rectF);
        }

        @Override // android.app.SharedElementCallback
        public View onCreateSnapshotView(Context context, Parcelable parcelable) {
            return _intOverflow.IconCompatParcelizer(context, parcelable);
        }

        @Override // android.app.SharedElementCallback
        public void onSharedElementsArrived(List<String> list, List<View> list2, final SharedElementCallback.OnSharedElementsReadyListener onSharedElementsReadyListener) {
            _intOverflow.write(new _intOverflow.read() { // from class: o._checkDoubleSpecialValue
                @Override // o._intOverflow.read
                public final void IconCompatParcelizer() {
                    _checkBooleanToStringCoercion.RemoteActionCompatParcelizer.IconCompatParcelizer(onSharedElementsReadyListener);
                }
            });
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    static class AudioAttributesCompatParcelizer {
        static boolean IconCompatParcelizer(Activity activity, String str) {
            try {
                return ((Boolean) PackageManager.class.getMethod("shouldShowRequestPermissionRationale", String.class).invoke(activity.getApplication().getPackageManager(), str)).booleanValue();
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                return activity.shouldShowRequestPermissionRationale(str);
            }
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    static class read {
        static boolean read(Activity activity, String str) {
            return activity.shouldShowRequestPermissionRationale(str);
        }
    }

    /* JADX INFO: loaded from: classes4.dex */
    static class write {
        static void read(Activity activity) {
            activity.finishAfterTransition();
        }

        static void read(Activity activity, SharedElementCallback sharedElementCallback) {
            activity.setEnterSharedElementCallback(sharedElementCallback);
        }

        static void RemoteActionCompatParcelizer(Activity activity, SharedElementCallback sharedElementCallback) {
            activity.setExitSharedElementCallback(sharedElementCallback);
        }

        static void AudioAttributesCompatParcelizer(Activity activity) {
            activity.postponeEnterTransition();
        }

        static void write(Activity activity) {
            activity.startPostponedEnterTransition();
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    static class RemoteActionCompatParcelizer {
        static void RemoteActionCompatParcelizer(Activity activity, String[] strArr, int i) {
            activity.requestPermissions(strArr, i);
        }

        static boolean write(Activity activity, String str) {
            return activity.shouldShowRequestPermissionRationale(str);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public static void IconCompatParcelizer(Object obj) {
            ((SharedElementCallback.OnSharedElementsReadyListener) obj).onSharedElementsReady();
        }
    }
}
