package kotlin;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class newMonthTestItemdefault {
    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> void RemoteActionCompatParcelizer(Appendable appendable, T t, getAnswerMap<? super T, ? extends CharSequence> getanswermap) throws IOException {
        toMagicModuleMetaRepoModel.write(appendable, "");
        if (getanswermap != null) {
            appendable.append(getanswermap.invoke(t));
            return;
        }
        if (t == 0 || (t instanceof CharSequence)) {
            appendable.append((CharSequence) t);
        } else if (t instanceof Character) {
            appendable.append(((Character) t).charValue());
        } else {
            appendable.append(t.toString());
        }
    }
}
