package kotlin;

/* JADX INFO: loaded from: classes5.dex */
public final class writeSampleMetadata implements WavExtractorOutputWriter {
    private final int AudioAttributesCompatParcelizer = 1024;
    private final WavExtractorImaAdPcmOutputWriter IconCompatParcelizer = new WavExtractorImaAdPcmOutputWriter(1024);
    private final WavExtractorOutputWriter[] write;

    public writeSampleMetadata(WavExtractorOutputWriter... wavExtractorOutputWriterArr) {
        this.write = wavExtractorOutputWriterArr;
    }

    @Override // kotlin.WavExtractorOutputWriter
    public final StackTraceElement[] IconCompatParcelizer(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= this.AudioAttributesCompatParcelizer) {
            return stackTraceElementArr;
        }
        StackTraceElement[] stackTraceElementArrIconCompatParcelizer = stackTraceElementArr;
        for (WavExtractorOutputWriter wavExtractorOutputWriter : this.write) {
            if (stackTraceElementArrIconCompatParcelizer.length <= this.AudioAttributesCompatParcelizer) {
                break;
            }
            stackTraceElementArrIconCompatParcelizer = wavExtractorOutputWriter.IconCompatParcelizer(stackTraceElementArr);
        }
        return stackTraceElementArrIconCompatParcelizer.length > this.AudioAttributesCompatParcelizer ? this.IconCompatParcelizer.IconCompatParcelizer(stackTraceElementArrIconCompatParcelizer) : stackTraceElementArrIconCompatParcelizer;
    }
}
