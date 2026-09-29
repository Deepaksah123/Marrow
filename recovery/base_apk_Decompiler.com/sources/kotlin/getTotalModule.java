package kotlin;

import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes.dex */
public final class getTotalModule {
    public static final StackTraceElement RemoteActionCompatParcelizer(getMonthName getmonthname) {
        String string;
        toMagicModuleMetaRepoModel.write(getmonthname, "");
        getTotalSolvedMcq gettotalsolvedmcq = read(getmonthname);
        if (gettotalsolvedmcq == null || gettotalsolvedmcq.IconCompatParcelizer() <= 0) {
            return null;
        }
        int iAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(getmonthname);
        int i = iAudioAttributesCompatParcelizer < 0 ? -1 : gettotalsolvedmcq.RemoteActionCompatParcelizer()[iAudioAttributesCompatParcelizer];
        getWeekDays getweekdays = getWeekDays.INSTANCE;
        String str = getWeekDays.read(getmonthname);
        if (str == null) {
            string = gettotalsolvedmcq.read();
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append('/');
            sb.append(gettotalsolvedmcq.read());
            string = sb.toString();
        }
        return new StackTraceElement(string, gettotalsolvedmcq.AudioAttributesCompatParcelizer(), gettotalsolvedmcq.write(), i);
    }

    private static final getTotalSolvedMcq read(getMonthName getmonthname) {
        return (getTotalSolvedMcq) getmonthname.getClass().getAnnotation(getTotalSolvedMcq.class);
    }

    private static final int AudioAttributesCompatParcelizer(getMonthName getmonthname) {
        try {
            Field declaredField = getmonthname.getClass().getDeclaredField("label");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(getmonthname);
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            return (num != null ? num.intValue() : 0) - 1;
        } catch (Exception unused) {
            return -1;
        }
    }
}
