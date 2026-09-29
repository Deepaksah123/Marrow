package kotlin;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public class mpdEventTrack {

    /* JADX INFO: loaded from: classes3.dex */
    public static class write {
        private final String IconCompatParcelizer;

        write(String str) {
            this.IconCompatParcelizer = str;
        }
    }

    static {
        new write("CREATE TABLE IF NOT EXISTS %s AS SELECT * FROM %s");
        new write("DROP TABLE IF EXISTS %s");
    }

    public static String IconCompatParcelizer(String str, LinkedHashMap<String, String> linkedHashMap) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for (String str2 : linkedHashMap.keySet()) {
            if (i != 0) {
                sb.append(", ");
            }
            sb.append(str2);
            sb.append(" ");
            sb.append(linkedHashMap.get(str2));
            i++;
        }
        return String.format("CREATE TABLE IF NOT EXISTS %s (%s) ", str, sb.toString());
    }
}
