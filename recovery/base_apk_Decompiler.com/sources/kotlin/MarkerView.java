package kotlin;

/* JADX INFO: loaded from: classes.dex */
public final class MarkerView {
    public static boolean IconCompatParcelizer() {
        return setChartView.IconCompatParcelizer();
    }

    public static void AudioAttributesCompatParcelizer(String str) {
        BarEntry.write(write(str));
    }

    public static void RemoteActionCompatParcelizer() {
        BarEntry.RemoteActionCompatParcelizer();
    }

    public static void write(String str, int i) {
        setChartView.write(write(str), i);
    }

    public static void IconCompatParcelizer(String str, int i) {
        setChartView.RemoteActionCompatParcelizer(write(str), i);
    }

    private static String write(String str) {
        return str.length() <= 127 ? str : str.substring(0, 127);
    }
}
