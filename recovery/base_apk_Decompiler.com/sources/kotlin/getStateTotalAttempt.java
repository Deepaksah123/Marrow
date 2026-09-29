package kotlin;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public class getStateTotalAttempt extends getStateRank {
    public static final char MediaDescriptionCompat(CharSequence charSequence) {
        toMagicModuleMetaRepoModel.write(charSequence, "");
        if (charSequence.length() == 0) {
            throw new NoSuchElementException("Char sequence is empty.");
        }
        return charSequence.charAt(0);
    }

    public static final char MediaBrowserCompatSearchResultReceiver(CharSequence charSequence) {
        toMagicModuleMetaRepoModel.write(charSequence, "");
        if (charSequence.length() == 0) {
            throw new NoSuchElementException("Char sequence is empty.");
        }
        return charSequence.charAt(TestGroupLSModel.write(charSequence));
    }

    public static final String IconCompatParcelizer(String str, int i) {
        toMagicModuleMetaRepoModel.write(str, "");
        if (i < 0) {
            StringBuilder sb = new StringBuilder("Requested character count ");
            sb.append(i);
            sb.append(" is less than zero.");
            throw new IllegalArgumentException(sb.toString().toString());
        }
        String strSubstring = str.substring(getQues.RemoteActionCompatParcelizer(i, str.length()));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strSubstring, "");
        return strSubstring;
    }

    public static final String RemoteActionCompatParcelizer(String str, int i) {
        toMagicModuleMetaRepoModel.write(str, "");
        if (i < 0) {
            StringBuilder sb = new StringBuilder("Requested character count ");
            sb.append(i);
            sb.append(" is less than zero.");
            throw new IllegalArgumentException(sb.toString().toString());
        }
        String strSubstring = str.substring(0, getQues.RemoteActionCompatParcelizer(i, str.length()));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strSubstring, "");
        return strSubstring;
    }

    public static final String RatingCompat(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        int length = str.length();
        String strSubstring = str.substring(length - getQues.RemoteActionCompatParcelizer(5, length));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strSubstring, "");
        return strSubstring;
    }

    public static final List<String> RemoteActionCompatParcelizer(CharSequence charSequence, int i) {
        toMagicModuleMetaRepoModel.write(charSequence, "");
        return TestGroupLSModel.AudioAttributesCompatParcelizer(charSequence, i, i);
    }

    public static final List<String> AudioAttributesCompatParcelizer(CharSequence charSequence, int i, int i2) {
        toMagicModuleMetaRepoModel.write(charSequence, "");
        return TestGroupLSModel.IconCompatParcelizer(charSequence, i, i2, true, new getAnswerMap() { // from class: o.getTimeLeft
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return getStateTotalAttempt.RatingCompat((CharSequence) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String RatingCompat(CharSequence charSequence) {
        toMagicModuleMetaRepoModel.write(charSequence, "");
        return charSequence.toString();
    }

    public static final <R> List<R> IconCompatParcelizer(CharSequence charSequence, int i, int i2, boolean z, getAnswerMap<? super CharSequence, ? extends R> getanswermap) {
        toMagicModuleMetaRepoModel.write(charSequence, "");
        toMagicModuleMetaRepoModel.write(getanswermap, "");
        LoggedUserResponse.IconCompatParcelizer(i, i2);
        int length = charSequence.length();
        int i3 = 0;
        ArrayList arrayList = new ArrayList((length / i2) + (length % i2 == 0 ? 0 : 1));
        while (i3 >= 0 && i3 < length) {
            int i4 = i3 + i;
            if (i4 < 0 || i4 > length) {
                i4 = length;
            }
            arrayList.add(getanswermap.invoke(charSequence.subSequence(i3, i4)));
            i3 += i2;
        }
        return arrayList;
    }
}
