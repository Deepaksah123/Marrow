package kotlin;

import java.util.Iterator;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;

/* JADX INFO: loaded from: classes4.dex */
public final class TestContainerCompanion {
    /* JADX INFO: Access modifiers changed from: private */
    public static final newPrevYearTestContainer RemoteActionCompatParcelizer(Matcher matcher, int i, CharSequence charSequence) {
        if (matcher.find(i)) {
            return new newMonthTestItem(matcher, charSequence);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final newPrevYearTestContainer write(Matcher matcher, CharSequence charSequence) {
        if (matcher.matches()) {
            return new newMonthTestItem(matcher, charSequence);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final newEncryptedObject write(MatchResult matchResult) {
        return getQues.IconCompatParcelizer(matchResult.start(), matchResult.end());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final newEncryptedObject write(MatchResult matchResult, int i) {
        return getQues.IconCompatParcelizer(matchResult.start(i), matchResult.end(i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int IconCompatParcelizer(Iterable<? extends setSubmissionTimestamp> iterable) {
        Iterator<? extends setSubmissionTimestamp> it = iterable.iterator();
        int value = 0;
        while (it.hasNext()) {
            value |= it.next().getValue();
        }
        return value;
    }
}
