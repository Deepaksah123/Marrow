package kotlin;

import android.text.method.PasswordTransformationMethod;
import android.util.Patterns;
import android.view.View;
import android.widget.TextView;

/* JADX INFO: loaded from: classes2.dex */
public class DefaultAnalyticsCollectorExternalSyntheticLambda16 {
    public static boolean write(View view) {
        if (!getMinWindowSequenceNumber.IconCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda16.class) && (view instanceof TextView)) {
            try {
                TextView textView = (TextView) view;
                if (write(textView) || IconCompatParcelizer(textView) || RemoteActionCompatParcelizer(textView) || AudioAttributesImplApi26Parcelizer(textView) || read(textView)) {
                    return true;
                }
                return AudioAttributesCompatParcelizer(textView);
            } catch (Throwable th) {
                getMinWindowSequenceNumber.read(th, DefaultAnalyticsCollectorExternalSyntheticLambda16.class);
            }
        }
        return false;
    }

    private static boolean write(TextView textView) {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda16.class)) {
            return false;
        }
        try {
            if (textView.getInputType() == 128) {
                return true;
            }
            return textView.getTransformationMethod() instanceof PasswordTransformationMethod;
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, DefaultAnalyticsCollectorExternalSyntheticLambda16.class);
            return false;
        }
    }

    private static boolean AudioAttributesCompatParcelizer(TextView textView) {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda16.class)) {
            return false;
        }
        try {
            if (textView.getInputType() == 32) {
                return true;
            }
            String strMediaBrowserCompatItemReceiver = DefaultAnalyticsCollectorExternalSyntheticLambda17.MediaBrowserCompatItemReceiver(textView);
            if (strMediaBrowserCompatItemReceiver != null && strMediaBrowserCompatItemReceiver.length() != 0) {
                return Patterns.EMAIL_ADDRESS.matcher(strMediaBrowserCompatItemReceiver).matches();
            }
            return false;
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, DefaultAnalyticsCollectorExternalSyntheticLambda16.class);
            return false;
        }
    }

    private static boolean RemoteActionCompatParcelizer(TextView textView) {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda16.class)) {
            return false;
        }
        try {
            return textView.getInputType() == 96;
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, DefaultAnalyticsCollectorExternalSyntheticLambda16.class);
            return false;
        }
    }

    private static boolean AudioAttributesImplApi26Parcelizer(TextView textView) {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda16.class)) {
            return false;
        }
        try {
            return textView.getInputType() == 112;
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, DefaultAnalyticsCollectorExternalSyntheticLambda16.class);
            return false;
        }
    }

    private static boolean read(TextView textView) {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda16.class)) {
            return false;
        }
        try {
            return textView.getInputType() == 3;
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, DefaultAnalyticsCollectorExternalSyntheticLambda16.class);
            return false;
        }
    }

    private static boolean IconCompatParcelizer(TextView textView) {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda16.class)) {
            return false;
        }
        try {
            String strReplaceAll = DefaultAnalyticsCollectorExternalSyntheticLambda17.MediaBrowserCompatItemReceiver(textView).replaceAll("\\s", "");
            int length = strReplaceAll.length();
            if (length >= 12 && length <= 19) {
                int i = 0;
                boolean z = false;
                for (int i2 = length - 1; i2 >= 0; i2--) {
                    char cCharAt = strReplaceAll.charAt(i2);
                    if (cCharAt < '0' || cCharAt > '9') {
                        return false;
                    }
                    int i3 = cCharAt - '0';
                    if (z && (i3 = i3 << 1) > 9) {
                        i3 = (i3 % 10) + 1;
                    }
                    i += i3;
                    z = !z;
                }
                if (i % 10 == 0) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, DefaultAnalyticsCollectorExternalSyntheticLambda16.class);
            return false;
        }
    }
}
