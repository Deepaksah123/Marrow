package kotlin;

import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes3.dex */
public final class lambdaprepare3comgoogleandroidexoplayer2offlineDownloadHelper {
    private static final TimeZone IconCompatParcelizer = TimeZone.getTimeZone("UTC");

    public static Date RemoteActionCompatParcelizer(String str, ParsePosition parsePosition) throws ParseException {
        String string;
        int i;
        int iRemoteActionCompatParcelizer;
        int i2;
        int iRemoteActionCompatParcelizer2;
        int length;
        TimeZone timeZone;
        int iRemoteActionCompatParcelizer3;
        char cCharAt;
        try {
            int index = parsePosition.getIndex();
            int i3 = index + 4;
            int iRemoteActionCompatParcelizer4 = RemoteActionCompatParcelizer(str, index, i3);
            if (AudioAttributesCompatParcelizer(str, i3, '-')) {
                i3 = index + 5;
            }
            int i4 = i3 + 2;
            int iRemoteActionCompatParcelizer5 = RemoteActionCompatParcelizer(str, i3, i4);
            if (AudioAttributesCompatParcelizer(str, i4, '-')) {
                i4 = i3 + 3;
            }
            int i5 = i4 + 2;
            int iRemoteActionCompatParcelizer6 = RemoteActionCompatParcelizer(str, i4, i5);
            boolean zAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(str, i5, 'T');
            if (!zAudioAttributesCompatParcelizer && str.length() <= i5) {
                GregorianCalendar gregorianCalendar = new GregorianCalendar(iRemoteActionCompatParcelizer4, iRemoteActionCompatParcelizer5 - 1, iRemoteActionCompatParcelizer6);
                gregorianCalendar.setLenient(false);
                parsePosition.setIndex(i5);
                return gregorianCalendar.getTime();
            }
            if (zAudioAttributesCompatParcelizer) {
                int i6 = i4 + 5;
                iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(str, i4 + 3, i6);
                if (AudioAttributesCompatParcelizer(str, i6, ':')) {
                    i6 = i4 + 6;
                }
                int i7 = i6 + 2;
                int iRemoteActionCompatParcelizer7 = RemoteActionCompatParcelizer(str, i6, i7);
                if (AudioAttributesCompatParcelizer(str, i7, ':')) {
                    i7 = i6 + 3;
                }
                if (str.length() <= i7 || (cCharAt = str.charAt(i7)) == 'Z' || cCharAt == '+' || cCharAt == '-') {
                    i5 = i7;
                    iRemoteActionCompatParcelizer2 = 0;
                } else {
                    i5 = i7 + 2;
                    iRemoteActionCompatParcelizer2 = RemoteActionCompatParcelizer(str, i7, i5);
                    if (iRemoteActionCompatParcelizer2 > 59 && iRemoteActionCompatParcelizer2 < 63) {
                        iRemoteActionCompatParcelizer2 = 59;
                    }
                    if (AudioAttributesCompatParcelizer(str, i5, '.')) {
                        int i8 = i7 + 3;
                        int iRemoteActionCompatParcelizer8 = RemoteActionCompatParcelizer(str, i7 + 4);
                        int iMin = Math.min(iRemoteActionCompatParcelizer8, i7 + 6);
                        iRemoteActionCompatParcelizer3 = RemoteActionCompatParcelizer(str, i8, iMin);
                        int i9 = iMin - i8;
                        if (i9 == 1) {
                            iRemoteActionCompatParcelizer3 *= 100;
                        } else if (i9 == 2) {
                            iRemoteActionCompatParcelizer3 *= 10;
                        }
                        i5 = iRemoteActionCompatParcelizer8;
                    }
                    i = iRemoteActionCompatParcelizer7;
                    i2 = iRemoteActionCompatParcelizer3;
                }
                iRemoteActionCompatParcelizer3 = 0;
                i = iRemoteActionCompatParcelizer7;
                i2 = iRemoteActionCompatParcelizer3;
            } else {
                i = 0;
                iRemoteActionCompatParcelizer = 0;
                i2 = 0;
                iRemoteActionCompatParcelizer2 = 0;
            }
            if (str.length() <= i5) {
                throw new IllegalArgumentException("No time zone indicator");
            }
            char cCharAt2 = str.charAt(i5);
            if (cCharAt2 == 'Z') {
                timeZone = IconCompatParcelizer;
                length = i5 + 1;
            } else {
                if (cCharAt2 != '+' && cCharAt2 != '-') {
                    StringBuilder sb = new StringBuilder("Invalid time zone indicator '");
                    sb.append(cCharAt2);
                    sb.append("'");
                    throw new IndexOutOfBoundsException(sb.toString());
                }
                String strSubstring = str.substring(i5);
                if (strSubstring.length() < 5) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(strSubstring);
                    sb2.append(TarConstants.VERSION_POSIX);
                    strSubstring = sb2.toString();
                }
                length = i5 + strSubstring.length();
                if ("+0000".equals(strSubstring) || "+00:00".equals(strSubstring)) {
                    timeZone = IconCompatParcelizer;
                } else {
                    StringBuilder sb3 = new StringBuilder("GMT");
                    sb3.append(strSubstring);
                    String string2 = sb3.toString();
                    TimeZone timeZone2 = TimeZone.getTimeZone(string2);
                    String id = timeZone2.getID();
                    if (!id.equals(string2) && !id.replace(":", "").equals(string2)) {
                        StringBuilder sb4 = new StringBuilder("Mismatching time zone indicator: ");
                        sb4.append(string2);
                        sb4.append(" given, resolves to ");
                        sb4.append(timeZone2.getID());
                        throw new IndexOutOfBoundsException(sb4.toString());
                    }
                    timeZone = timeZone2;
                }
            }
            GregorianCalendar gregorianCalendar2 = new GregorianCalendar(timeZone);
            gregorianCalendar2.setLenient(false);
            gregorianCalendar2.set(1, iRemoteActionCompatParcelizer4);
            gregorianCalendar2.set(2, iRemoteActionCompatParcelizer5 - 1);
            gregorianCalendar2.set(5, iRemoteActionCompatParcelizer6);
            gregorianCalendar2.set(11, iRemoteActionCompatParcelizer);
            gregorianCalendar2.set(12, i);
            gregorianCalendar2.set(13, iRemoteActionCompatParcelizer2);
            gregorianCalendar2.set(14, i2);
            parsePosition.setIndex(length);
            return gregorianCalendar2.getTime();
        } catch (IndexOutOfBoundsException | NumberFormatException | IllegalArgumentException e) {
            if (str == null) {
                string = null;
            } else {
                StringBuilder sb5 = new StringBuilder("\"");
                sb5.append(str);
                sb5.append('\"');
                string = sb5.toString();
            }
            String message = e.getMessage();
            if (message == null || message.isEmpty()) {
                StringBuilder sb6 = new StringBuilder("(");
                sb6.append(e.getClass().getName());
                sb6.append(")");
                message = sb6.toString();
            }
            StringBuilder sb7 = new StringBuilder("Failed to parse date [");
            sb7.append(string);
            sb7.append("]: ");
            sb7.append(message);
            ParseException parseException = new ParseException(sb7.toString(), parsePosition.getIndex());
            parseException.initCause(e);
            throw parseException;
        }
    }

    private static boolean AudioAttributesCompatParcelizer(String str, int i, char c) {
        return i < str.length() && str.charAt(i) == c;
    }

    private static int RemoteActionCompatParcelizer(String str, int i, int i2) throws NumberFormatException {
        int i3;
        int i4;
        if (i < 0 || i2 > str.length() || i > i2) {
            throw new NumberFormatException(str);
        }
        if (i < i2) {
            i4 = i + 1;
            int iDigit = Character.digit(str.charAt(i), 10);
            if (iDigit < 0) {
                StringBuilder sb = new StringBuilder("Invalid number: ");
                sb.append(str.substring(i, i2));
                throw new NumberFormatException(sb.toString());
            }
            i3 = -iDigit;
        } else {
            i3 = 0;
            i4 = i;
        }
        while (i4 < i2) {
            int iDigit2 = Character.digit(str.charAt(i4), 10);
            if (iDigit2 < 0) {
                StringBuilder sb2 = new StringBuilder("Invalid number: ");
                sb2.append(str.substring(i, i2));
                throw new NumberFormatException(sb2.toString());
            }
            i3 = (i3 * 10) - iDigit2;
            i4++;
        }
        return -i3;
    }

    private static int RemoteActionCompatParcelizer(String str, int i) {
        while (i < str.length()) {
            char cCharAt = str.charAt(i);
            if (cCharAt < '0' || cCharAt > '9') {
                return i;
            }
            i++;
        }
        return str.length();
    }
}
