package kotlin;

import android.graphics.Color;

/* JADX INFO: loaded from: classes4.dex */
public final class PrivateMaxEntriesMap {
    public static String AudioAttributesCompatParcelizer(int i) {
        return LaissezFaireSubTypeValidator.read("rgba(%d,%d,%d,%.3f)", Integer.valueOf(Color.red(i)), Integer.valueOf(Color.green(i)), Integer.valueOf(Color.blue(i)), Double.valueOf(((double) Color.alpha(i)) / 255.0d));
    }

    public static String read(String str) {
        StringBuilder sb = new StringBuilder(".");
        sb.append(str);
        sb.append(",.");
        sb.append(str);
        sb.append(" *");
        return sb.toString();
    }
}
