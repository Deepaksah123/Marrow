package in.juspay.widget.qrscanner.com.google.zxing.qrcode.detector;

/* JADX INFO: loaded from: classes5.dex */
public final class FinderPatternInfo {
    private final FinderPattern a;
    private final FinderPattern b;
    private final FinderPattern c;

    public FinderPatternInfo(FinderPattern[] finderPatternArr) {
        this.a = finderPatternArr[0];
        this.b = finderPatternArr[1];
        this.c = finderPatternArr[2];
    }

    public final FinderPattern getBottomLeft() {
        return this.a;
    }

    public final FinderPattern getTopLeft() {
        return this.b;
    }

    public final FinderPattern getTopRight() {
        return this.c;
    }
}
