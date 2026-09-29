package kotlin;

/* JADX INFO: loaded from: classes5.dex */
public final class WavExtractorImaAdPcmOutputWriter implements WavExtractorOutputWriter {
    private final int AudioAttributesCompatParcelizer = 1024;

    public WavExtractorImaAdPcmOutputWriter(int i) {
    }

    @Override // kotlin.WavExtractorOutputWriter
    public final StackTraceElement[] IconCompatParcelizer(StackTraceElement[] stackTraceElementArr) {
        int length = stackTraceElementArr.length;
        int i = this.AudioAttributesCompatParcelizer;
        if (length <= i) {
            return stackTraceElementArr;
        }
        int i2 = i / 2;
        int i3 = i - i2;
        StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[i];
        System.arraycopy(stackTraceElementArr, 0, stackTraceElementArr2, 0, i3);
        System.arraycopy(stackTraceElementArr, stackTraceElementArr.length - i2, stackTraceElementArr2, i3, i2);
        return stackTraceElementArr2;
    }
}
