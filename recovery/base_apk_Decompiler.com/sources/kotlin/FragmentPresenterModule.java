package kotlin;

import java.text.DateFormat;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public final class FragmentPresenterModule {
    private static final RemoteActionCompatParcelizer AudioAttributesCompatParcelizer = new RemoteActionCompatParcelizer();
    private static final String[] read = {"EEE, dd MMM yyyy HH:mm:ss zzz", "EEEE, dd-MMM-yy HH:mm:ss zzz", "EEE MMM d HH:mm:ss yyyy", "EEE, dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MMM-yyyy HH-mm-ss z", "EEE, dd MMM yy HH:mm:ss z", "EEE dd-MMM-yyyy HH:mm:ss z", "EEE dd MMM yyyy HH:mm:ss z", "EEE dd-MMM-yyyy HH-mm-ss z", "EEE dd-MMM-yy HH:mm:ss z", "EEE dd MMM yy HH:mm:ss z", "EEE,dd-MMM-yy HH:mm:ss z", "EEE,dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MM-yyyy HH:mm:ss z", "EEE MMM d yyyy HH:mm:ss z"};
    private static final DateFormat[] IconCompatParcelizer = new DateFormat[15];

    public static final class RemoteActionCompatParcelizer extends ThreadLocal<DateFormat> {
        RemoteActionCompatParcelizer() {
        }

        @Override // java.lang.ThreadLocal
        public final /* synthetic */ DateFormat initialValue() {
            return write();
        }

        private static DateFormat write() {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
            simpleDateFormat.setLenient(false);
            simpleDateFormat.setTimeZone(FirebaseDataModule.IconCompatParcelizer);
            return simpleDateFormat;
        }
    }

    public static final Date read(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        if (str.length() == 0) {
            return null;
        }
        ParsePosition parsePosition = new ParsePosition(0);
        Date date = AudioAttributesCompatParcelizer.get().parse(str, parsePosition);
        if (parsePosition.getIndex() == str.length()) {
            return date;
        }
        String[] strArr = read;
        synchronized (strArr) {
            int length = strArr.length;
            for (int i = 0; i < length; i++) {
                DateFormat[] dateFormatArr = IconCompatParcelizer;
                SimpleDateFormat simpleDateFormat = dateFormatArr[i];
                if (simpleDateFormat == null) {
                    SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat(read[i], Locale.US);
                    simpleDateFormat2.setTimeZone(FirebaseDataModule.IconCompatParcelizer);
                    simpleDateFormat = simpleDateFormat2;
                    dateFormatArr[i] = simpleDateFormat;
                }
                parsePosition.setIndex(0);
                Date date2 = simpleDateFormat.parse(str, parsePosition);
                if (parsePosition.getIndex() != 0) {
                    return date2;
                }
            }
            getShowPopup getshowpopup = getShowPopup.INSTANCE;
            return null;
        }
    }

    public static final String read(Date date) {
        toMagicModuleMetaRepoModel.write(date, "");
        String str = AudioAttributesCompatParcelizer.get().format(date);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str, "");
        return str;
    }
}
