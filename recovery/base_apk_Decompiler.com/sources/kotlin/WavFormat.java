package kotlin;

/* JADX INFO: loaded from: classes3.dex */
public final class WavFormat {
    public final String AudioAttributesCompatParcelizer;
    public final WavFormat IconCompatParcelizer;
    public final StackTraceElement[] RemoteActionCompatParcelizer;
    public final String read;

    public WavFormat(Throwable th, WavExtractorOutputWriter wavExtractorOutputWriter) {
        this.AudioAttributesCompatParcelizer = th.getLocalizedMessage();
        this.read = th.getClass().getName();
        this.RemoteActionCompatParcelizer = wavExtractorOutputWriter.IconCompatParcelizer(th.getStackTrace());
        Throwable cause = th.getCause();
        this.IconCompatParcelizer = cause != null ? new WavFormat(cause, wavExtractorOutputWriter) : null;
    }
}
