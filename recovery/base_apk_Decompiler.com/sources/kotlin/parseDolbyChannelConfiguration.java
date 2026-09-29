package kotlin;

import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.google.android.exoplayer2.upstream.CmcdConfiguration;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.io.UnsupportedEncodingException;
import java.text.NumberFormat;
import java.util.Locale;
import org.apache.commons.compress.utils.CharsetNames;

/* JADX INFO: loaded from: classes.dex */
public final class parseDolbyChannelConfiguration {
    public static int write(String str) {
        try {
            return Integer.parseInt(AudioAttributesImplApi26Parcelizer(str));
        } catch (Throwable unused) {
            return 0;
        }
    }

    public static long AudioAttributesImplApi21Parcelizer(String str) {
        try {
            return Long.parseLong(AudioAttributesImplApi26Parcelizer(str));
        } catch (Throwable unused) {
            return 0L;
        }
    }

    public static boolean IconCompatParcelizer(String str, boolean z) {
        try {
            String strAudioAttributesImplApi26Parcelizer = AudioAttributesImplApi26Parcelizer(str);
            if (RemoteActionCompatParcelizer(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE, strAudioAttributesImplApi26Parcelizer)) {
                return true;
            }
            return Boolean.parseBoolean(strAudioAttributesImplApi26Parcelizer);
        } catch (Throwable unused) {
            return z;
        }
    }

    public static String AudioAttributesImplApi26Parcelizer(String str) {
        return str.contains(" ") ? str.replace(" ", "") : str;
    }

    public static float RemoteActionCompatParcelizer(String str) {
        try {
            return Float.parseFloat(AudioAttributesImplApi26Parcelizer(str));
        } catch (Throwable unused) {
            return BitmapDescriptorFactory.HUE_RED;
        }
    }

    private static String AudioAttributesCompatParcelizer(int i) {
        int i2 = i % 100;
        if (i2 == 11 || i2 == 12 || i2 == 13) {
            return "th";
        }
        int i3 = i % 10;
        if (i3 == 1) {
            return CmcdConfiguration.KEY_STREAM_TYPE;
        }
        if (i3 == 2) {
            return "nd";
        }
        return i3 == 3 ? "rd" : "th";
    }

    public static String write(String[] strArr) {
        StringBuilder sb = new StringBuilder("[");
        if (strArr != null) {
            for (int i = 0; i < strArr.length; i++) {
                if (i != 0) {
                    sb.append(", ");
                }
                sb.append(strArr[i]);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public static boolean AudioAttributesCompatParcelizer(CharSequence charSequence) {
        return charSequence == null || charSequence.length() == 0;
    }

    public static String read(double d) {
        double dFloor = Math.floor(d);
        NumberFormat currencyInstance = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
        currencyInstance.setMaximumFractionDigits(0);
        return currencyInstance.format(dFloor);
    }

    public static String read(int i) {
        if (i < 30) {
            StringBuilder sb = new StringBuilder();
            sb.append(i);
            sb.append(i > 1 ? " Days" : " Day");
            return sb.toString();
        }
        int i2 = i / 30;
        if (i2 == 1) {
            return "1 Month";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(i2);
        sb2.append(" Months");
        return sb2.toString();
    }

    public static String[] read(String str) {
        String strSubstring;
        String[] strArr = new String[2];
        if (str.length() > 54) {
            String strSubstring2 = str.substring(0, 54);
            int iLastIndexOf = strSubstring2.lastIndexOf(32);
            if (iLastIndexOf > 0) {
                strSubstring2 = strSubstring2.substring(0, iLastIndexOf);
                strSubstring = str.substring(iLastIndexOf + 1);
            } else {
                strSubstring = str.substring(54);
            }
            strArr[0] = strSubstring2;
            strArr[1] = strSubstring;
            return strArr;
        }
        strArr[0] = str;
        return strArr;
    }

    public static boolean RemoteActionCompatParcelizer(String str, String str2) {
        if (str == null || str2 == null) {
            return false;
        }
        return str.equals(str2);
    }

    public static boolean AudioAttributesCompatParcelizer(String str, String str2) {
        if (str == null && str2 == null) {
            return true;
        }
        if (str == null || str2 == null) {
            return false;
        }
        return str.equals(str2);
    }

    public static int IconCompatParcelizer(String[] strArr, String str) {
        if (strArr == null) {
            return -1;
        }
        for (int i = 0; i < strArr.length; i++) {
            if (RemoteActionCompatParcelizer(strArr[i], str)) {
                return i;
            }
        }
        return -1;
    }

    public static String write(int i) {
        return AudioAttributesCompatParcelizer(i);
    }

    public static String IconCompatParcelizer(String str) {
        if (str == null || str.length() <= 0) {
            return null;
        }
        String[] strArrSplit = str.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String str2 : strArrSplit) {
            if (!AudioAttributesCompatParcelizer((CharSequence) str2) && str2.length() > 0) {
                String upperCase = str2.substring(0, 1).toUpperCase();
                String strSubstring = str2.substring(1);
                sb.append(upperCase);
                sb.append(strSubstring);
                sb.append(" ");
            }
        }
        return sb.toString().trim();
    }

    public static String[] write(String[] strArr, String str) {
        int i = 0;
        int length = strArr != null ? strArr.length : 0;
        String[] strArr2 = new String[length + 1];
        strArr2[0] = str;
        int i2 = 1;
        while (i < length) {
            strArr2[i2] = strArr[i];
            i++;
            i2++;
        }
        return strArr2;
    }

    public static byte[] AudioAttributesCompatParcelizer(String str) {
        try {
            return str.getBytes(CharsetNames.US_ASCII);
        } catch (UnsupportedEncodingException unused) {
            return null;
        }
    }

    public static String RemoteActionCompatParcelizer(byte[] bArr) {
        try {
            return new String(bArr, CharsetNames.US_ASCII);
        } catch (UnsupportedEncodingException unused) {
            return null;
        }
    }
}
