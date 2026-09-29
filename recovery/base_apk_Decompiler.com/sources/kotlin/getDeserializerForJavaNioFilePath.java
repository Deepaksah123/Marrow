package kotlin;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.view.InputDevice;
import android.view.ViewConfiguration;
import in.juspay.hyper.constants.LogSubCategory;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class getDeserializerForJavaNioFilePath {
    public static float AudioAttributesCompatParcelizer(ViewConfiguration viewConfiguration, Context context) {
        return read.RemoteActionCompatParcelizer(viewConfiguration);
    }

    public static float RemoteActionCompatParcelizer(ViewConfiguration viewConfiguration, Context context) {
        return read.AudioAttributesCompatParcelizer(viewConfiguration);
    }

    public static boolean write(ViewConfiguration viewConfiguration, Context context) {
        return AudioAttributesCompatParcelizer.write(viewConfiguration);
    }

    public static int IconCompatParcelizer(Context context, final ViewConfiguration viewConfiguration, int i, int i2, int i3) {
        if (Build.VERSION.SDK_INT >= 34) {
            return RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(viewConfiguration, i, i2, i3);
        }
        if (!AudioAttributesCompatParcelizer(i, i2, i3)) {
            return Integer.MAX_VALUE;
        }
        Resources resources = context.getResources();
        int iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(resources, i3, i2);
        Objects.requireNonNull(viewConfiguration);
        return IconCompatParcelizer(resources, iRemoteActionCompatParcelizer, new TokenBufferDeserializer() { // from class: o.UnrecognizedPropertyException
            @Override // kotlin.TokenBufferDeserializer
            public final Object read() {
                return Integer.valueOf(viewConfiguration.getScaledMinimumFlingVelocity());
            }
        }, Integer.MAX_VALUE);
    }

    public static int read(Context context, final ViewConfiguration viewConfiguration, int i, int i2, int i3) {
        if (Build.VERSION.SDK_INT >= 34) {
            return RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(viewConfiguration, i, i2, i3);
        }
        if (!AudioAttributesCompatParcelizer(i, i2, i3)) {
            return Integer.MIN_VALUE;
        }
        Resources resources = context.getResources();
        int i4 = read(resources, i3, i2);
        Objects.requireNonNull(viewConfiguration);
        return IconCompatParcelizer(resources, i4, new TokenBufferDeserializer() { // from class: o.PropertyBindingException
            @Override // kotlin.TokenBufferDeserializer
            public final Object read() {
                return Integer.valueOf(viewConfiguration.getScaledMaximumFlingVelocity());
            }
        }, Integer.MIN_VALUE);
    }

    static class read {
        static float RemoteActionCompatParcelizer(ViewConfiguration viewConfiguration) {
            return viewConfiguration.getScaledHorizontalScrollFactor();
        }

        static float AudioAttributesCompatParcelizer(ViewConfiguration viewConfiguration) {
            return viewConfiguration.getScaledVerticalScrollFactor();
        }
    }

    static class AudioAttributesCompatParcelizer {
        static boolean write(ViewConfiguration viewConfiguration) {
            return viewConfiguration.shouldShowMenuShortcutsWhenKeyboardPresent();
        }
    }

    /* JADX INFO: loaded from: classes4.dex */
    static class RemoteActionCompatParcelizer {
        static int AudioAttributesCompatParcelizer(ViewConfiguration viewConfiguration, int i, int i2, int i3) {
            return viewConfiguration.getScaledMaximumFlingVelocity(i, i2, i3);
        }

        static int RemoteActionCompatParcelizer(ViewConfiguration viewConfiguration, int i, int i2, int i3) {
            return viewConfiguration.getScaledMinimumFlingVelocity(i, i2, i3);
        }
    }

    private static int read(Resources resources, int i, int i2) {
        if (i == 4194304 && i2 == 26) {
            return write(resources, "config_viewMaxRotaryEncoderFlingVelocity", "dimen");
        }
        return -1;
    }

    private static int RemoteActionCompatParcelizer(Resources resources, int i, int i2) {
        if (i == 4194304 && i2 == 26) {
            return write(resources, "config_viewMinRotaryEncoderFlingVelocity", "dimen");
        }
        return -1;
    }

    private static int write(Resources resources, String str, String str2) {
        return resources.getIdentifier(str, str2, LogSubCategory.LifeCycle.ANDROID);
    }

    private static boolean AudioAttributesCompatParcelizer(int i, int i2, int i3) {
        InputDevice device = InputDevice.getDevice(i);
        return (device == null || device.getMotionRange(i2, i3) == null) ? false : true;
    }

    private static int IconCompatParcelizer(Resources resources, int i, TokenBufferDeserializer<Integer> tokenBufferDeserializer, int i2) {
        int dimensionPixelSize;
        if (i != -1) {
            return (i == 0 || (dimensionPixelSize = resources.getDimensionPixelSize(i)) < 0) ? i2 : dimensionPixelSize;
        }
        return tokenBufferDeserializer.read().intValue();
    }
}
