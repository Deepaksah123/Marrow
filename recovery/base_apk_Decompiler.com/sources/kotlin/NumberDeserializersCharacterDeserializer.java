package kotlin;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.StackTraceElementDeserializer;

/* JADX INFO: loaded from: classes2.dex */
public final class NumberDeserializersCharacterDeserializer {
    private static int RemoteActionCompatParcelizer(int i) {
        int i2 = (i & (~(i >> 31))) - 255;
        return (i2 & (i2 >> 31)) + 255;
    }

    public static void IconCompatParcelizer(StackTraceElementDeserializer stackTraceElementDeserializer, View view, float[] fArr) {
        Class<?> cls = view.getClass();
        StringBuilder sb = new StringBuilder("set");
        sb.append(stackTraceElementDeserializer.write());
        String string = sb.toString();
        try {
            switch (AnonymousClass4.AudioAttributesCompatParcelizer[stackTraceElementDeserializer.read().ordinal()]) {
                case 1:
                    cls.getMethod(string, Integer.TYPE).invoke(view, Integer.valueOf((int) fArr[0]));
                    return;
                case 2:
                    cls.getMethod(string, Float.TYPE).invoke(view, Float.valueOf(fArr[0]));
                    return;
                case 3:
                    Method method = cls.getMethod(string, Drawable.class);
                    int iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer((int) (((float) Math.pow(fArr[0], 0.45454545454545453d)) * 255.0f));
                    int iRemoteActionCompatParcelizer2 = RemoteActionCompatParcelizer((int) (((float) Math.pow(fArr[1], 0.45454545454545453d)) * 255.0f));
                    int iRemoteActionCompatParcelizer3 = RemoteActionCompatParcelizer((int) (((float) Math.pow(fArr[2], 0.45454545454545453d)) * 255.0f));
                    int iRemoteActionCompatParcelizer4 = RemoteActionCompatParcelizer((int) (fArr[3] * 255.0f));
                    ColorDrawable colorDrawable = new ColorDrawable();
                    colorDrawable.setColor((iRemoteActionCompatParcelizer4 << 24) | (iRemoteActionCompatParcelizer << 16) | (iRemoteActionCompatParcelizer2 << 8) | iRemoteActionCompatParcelizer3);
                    method.invoke(view, colorDrawable);
                    return;
                case 4:
                    cls.getMethod(string, Integer.TYPE).invoke(view, Integer.valueOf((RemoteActionCompatParcelizer((int) (fArr[3] * 255.0f)) << 24) | (RemoteActionCompatParcelizer((int) (((float) Math.pow(fArr[0], 0.45454545454545453d)) * 255.0f)) << 16) | (RemoteActionCompatParcelizer((int) (((float) Math.pow(fArr[1], 0.45454545454545453d)) * 255.0f)) << 8) | RemoteActionCompatParcelizer((int) (((float) Math.pow(fArr[2], 0.45454545454545453d)) * 255.0f))));
                    return;
                case 5:
                    StringBuilder sb2 = new StringBuilder("unable to interpolate strings ");
                    sb2.append(stackTraceElementDeserializer.write());
                    throw new RuntimeException(sb2.toString());
                case 6:
                    cls.getMethod(string, Boolean.TYPE).invoke(view, Boolean.valueOf(fArr[0] > 0.5f));
                    return;
                case 7:
                    cls.getMethod(string, Float.TYPE).invoke(view, Float.valueOf(fArr[0]));
                    return;
                default:
                    return;
            }
        } catch (IllegalAccessException e) {
            NumberDeserializersShortDeserializer.write(view);
            e.printStackTrace();
        } catch (NoSuchMethodException e2) {
            NumberDeserializersShortDeserializer.write(view);
            e2.printStackTrace();
        } catch (InvocationTargetException e3) {
            e3.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: o.NumberDeserializersCharacterDeserializer$4, reason: invalid class name */
    static /* synthetic */ class AnonymousClass4 {
        static final /* synthetic */ int[] AudioAttributesCompatParcelizer;

        static {
            int[] iArr = new int[StackTraceElementDeserializer.RemoteActionCompatParcelizer.values().length];
            AudioAttributesCompatParcelizer = iArr;
            try {
                iArr[StackTraceElementDeserializer.RemoteActionCompatParcelizer.INT_TYPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                AudioAttributesCompatParcelizer[StackTraceElementDeserializer.RemoteActionCompatParcelizer.FLOAT_TYPE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AudioAttributesCompatParcelizer[StackTraceElementDeserializer.RemoteActionCompatParcelizer.COLOR_DRAWABLE_TYPE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AudioAttributesCompatParcelizer[StackTraceElementDeserializer.RemoteActionCompatParcelizer.COLOR_TYPE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                AudioAttributesCompatParcelizer[StackTraceElementDeserializer.RemoteActionCompatParcelizer.STRING_TYPE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                AudioAttributesCompatParcelizer[StackTraceElementDeserializer.RemoteActionCompatParcelizer.BOOLEAN_TYPE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                AudioAttributesCompatParcelizer[StackTraceElementDeserializer.RemoteActionCompatParcelizer.DIMENSION_TYPE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }
}
