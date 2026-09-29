package kotlin;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.os.Build;
import android.provider.Settings;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Display;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\nH\u0007¢\u0006\u0004\b\b\u0010\u000bJ\u001f\u0010\b\u001a\u00020\u000e2\b\u0010\u0005\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0007\u001a\u00020\r¢\u0006\u0004\b\b\u0010\u000fJ\u0017\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0011\u0010\b\u001a\u00020\r*\u00020\u0011¢\u0006\u0004\b\b\u0010\u0015J\u0011\u0010\u0016\u001a\u00020\r*\u00020\u0004¢\u0006\u0004\b\u0016\u0010\u0017"}, d2 = {"Lo/updateNavigation;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "", "p1", "read", "(Landroid/content/Context;I)I", "", "(Landroid/content/Context;F)F", "Landroid/widget/EditText;", "", "", "(Landroid/widget/EditText;)V", "(Landroid/content/Context;)I", "Landroid/app/Activity;", "", "IconCompatParcelizer", "(Landroid/app/Activity;)D", "(Landroid/app/Activity;)Z", "RemoteActionCompatParcelizer", "(Landroid/content/Context;)Z"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class updateNavigation {
    public static final updateNavigation INSTANCE = new updateNavigation();

    private updateNavigation() {
    }

    @getMagicModuleMeta
    public static final int read(Context p0, int p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return (int) TypedValue.applyDimension(1, p1, p0.getResources().getDisplayMetrics());
    }

    @getMagicModuleMeta
    public static final float read(Context p0, float p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return p1 / p0.getResources().getDisplayMetrics().density;
    }

    public static void read(EditText editText) {
        if (editText != null) {
            editText.requestFocus();
            editText.setText(editText.getText());
            editText.setSelection(editText.getText().length());
            editText.setCursorVisible(true);
            Object systemService = editText.getContext().getSystemService("input_method");
            toMagicModuleMetaRepoModel.read(systemService, "");
            ((InputMethodManager) systemService).showSoftInput(editText, 0);
        }
    }

    @getMagicModuleMeta
    public static final int read(Context p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        Point point = new Point();
        Object systemService = p0.getSystemService("window");
        toMagicModuleMetaRepoModel.read(systemService, "");
        ((WindowManager) systemService).getDefaultDisplay().getSize(point);
        return point.x;
    }

    public static double IconCompatParcelizer(Activity p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        DisplayMetrics displayMetrics = new DisplayMetrics();
        p0.getResources().getDisplayMetrics();
        p0.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        float f = displayMetrics.heightPixels / displayMetrics.ydpi;
        float f2 = displayMetrics.widthPixels / displayMetrics.xdpi;
        return Math.sqrt((f2 * f2) + (f * f));
    }

    public static boolean read(Activity activity) {
        Integer numValueOf;
        toMagicModuleMetaRepoModel.write(activity, "");
        if (Build.VERSION.SDK_INT >= 30) {
            Display display = activity.getDisplay();
            numValueOf = display != null ? Integer.valueOf(display.getRotation()) : null;
        } else {
            numValueOf = Integer.valueOf(activity.getWindowManager().getDefaultDisplay().getRotation());
        }
        if (numValueOf == null || numValueOf.intValue() != 0) {
            return numValueOf != null && numValueOf.intValue() == 2;
        }
        return true;
    }

    public static boolean RemoteActionCompatParcelizer(Context context) {
        toMagicModuleMetaRepoModel.write(context, "");
        return Settings.System.getInt(context.getContentResolver(), "accelerometer_rotation", 0) == 1;
    }
}
