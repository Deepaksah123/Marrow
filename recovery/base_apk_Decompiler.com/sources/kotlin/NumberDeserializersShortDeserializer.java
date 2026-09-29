package kotlin;

import android.content.Context;
import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;

/* JADX INFO: loaded from: classes2.dex */
public final class NumberDeserializersShortDeserializer {
    public static void read(String str) {
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        int iMin = Math.min(2, stackTrace.length - 1);
        String string = " ";
        for (int i = 1; i <= iMin; i++) {
            StackTraceElement stackTraceElement = stackTrace[i];
            StringBuilder sb = new StringBuilder(".(");
            sb.append(stackTrace[i].getFileName());
            sb.append(":");
            sb.append(stackTrace[i].getLineNumber());
            sb.append(") ");
            sb.append(stackTrace[i].getMethodName());
            sb.toString();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(string);
            sb2.append(" ");
            string = sb2.toString();
        }
    }

    public static String write(View view) {
        try {
            return view.getContext().getResources().getResourceEntryName(view.getId());
        } catch (Exception unused) {
            return "UNKNOWN";
        }
    }

    public static String IconCompatParcelizer(Context context, int i) {
        if (i != -1) {
            try {
                return context.getResources().getResourceEntryName(i);
            } catch (Exception unused) {
                return "?".concat(String.valueOf(i));
            }
        }
        return "UNKNOWN";
    }

    public static String write(MotionLayout motionLayout, int i) {
        return IconCompatParcelizer(motionLayout, i);
    }

    private static String IconCompatParcelizer(MotionLayout motionLayout, int i) {
        if (i == -1) {
            return "UNDEFINED";
        }
        return motionLayout.getContext().getResources().getResourceEntryName(i);
    }

    public static String RemoteActionCompatParcelizer() {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        StringBuilder sb = new StringBuilder(".(");
        sb.append(stackTraceElement.getFileName());
        sb.append(":");
        sb.append(stackTraceElement.getLineNumber());
        sb.append(")");
        return sb.toString();
    }

    public static String read() {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        StringBuilder sb = new StringBuilder(".(");
        sb.append(stackTraceElement.getFileName());
        sb.append(":");
        sb.append(stackTraceElement.getLineNumber());
        sb.append(") ");
        sb.append(stackTraceElement.getMethodName());
        sb.append("()");
        return sb.toString();
    }
}
