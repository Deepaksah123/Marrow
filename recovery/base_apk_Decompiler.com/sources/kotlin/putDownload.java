package kotlin;

import java.lang.reflect.Field;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public enum putDownload implements setStopReason {
    IDENTITY { // from class: o.putDownload.5
        @Override // kotlin.setStopReason
        public final String write(Field field) {
            return field.getName();
        }
    },
    /* JADX INFO: Fake field, exist only in values array */
    UPPER_CAMEL_CASE { // from class: o.putDownload.2
        @Override // kotlin.setStopReason
        public final String write(Field field) {
            return RemoteActionCompatParcelizer(field.getName());
        }
    },
    /* JADX INFO: Fake field, exist only in values array */
    UPPER_CAMEL_CASE_WITH_SPACES { // from class: o.putDownload.1
        @Override // kotlin.setStopReason
        public final String write(Field field) {
            return RemoteActionCompatParcelizer(AudioAttributesCompatParcelizer(field.getName(), ' '));
        }
    },
    /* JADX INFO: Fake field, exist only in values array */
    UPPER_CASE_WITH_UNDERSCORES { // from class: o.putDownload.3
        @Override // kotlin.setStopReason
        public final String write(Field field) {
            return AudioAttributesCompatParcelizer(field.getName(), '_').toUpperCase(Locale.ENGLISH);
        }
    },
    /* JADX INFO: Fake field, exist only in values array */
    LOWER_CASE_WITH_UNDERSCORES { // from class: o.putDownload.4
        @Override // kotlin.setStopReason
        public final String write(Field field) {
            return AudioAttributesCompatParcelizer(field.getName(), '_').toLowerCase(Locale.ENGLISH);
        }
    },
    /* JADX INFO: Fake field, exist only in values array */
    LOWER_CASE_WITH_DASHES { // from class: o.putDownload.8
        @Override // kotlin.setStopReason
        public final String write(Field field) {
            return AudioAttributesCompatParcelizer(field.getName(), '-').toLowerCase(Locale.ENGLISH);
        }
    },
    /* JADX INFO: Fake field, exist only in values array */
    LOWER_CASE_WITH_DOTS { // from class: o.putDownload.6
        @Override // kotlin.setStopReason
        public final String write(Field field) {
            return AudioAttributesCompatParcelizer(field.getName(), '.').toLowerCase(Locale.ENGLISH);
        }
    };

    /* synthetic */ putDownload(byte b) {
        this();
    }

    static String AudioAttributesCompatParcelizer(String str, char c) {
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (Character.isUpperCase(cCharAt) && sb.length() != 0) {
                sb.append(c);
            }
            sb.append(cCharAt);
        }
        return sb.toString();
    }

    static String RemoteActionCompatParcelizer(String str) {
        int length = str.length();
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            char cCharAt = str.charAt(i);
            if (!Character.isLetter(cCharAt)) {
                i++;
            } else if (!Character.isUpperCase(cCharAt)) {
                char upperCase = Character.toUpperCase(cCharAt);
                if (i == 0) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(upperCase);
                    sb.append(str.substring(1));
                    return sb.toString();
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str.substring(0, i));
                sb2.append(upperCase);
                sb2.append(str.substring(i + 1));
                return sb2.toString();
            }
        }
        return str;
    }
}
