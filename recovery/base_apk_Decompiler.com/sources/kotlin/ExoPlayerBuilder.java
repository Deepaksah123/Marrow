package kotlin;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes2.dex */
public final class ExoPlayerBuilder extends experimentalSetOffloadSchedulingEnabled<lambdasetRenderersFactory16> {
    public ExoPlayerBuilder(copyWithMediaPeriodId copywithmediaperiodid, InputStream inputStream) {
        super(copywithmediaperiodid, inputStream);
    }

    public final lambdasetRenderersFactory16 write(int i) throws ExoPlaybackExceptionType {
        long j = read(i);
        if (j == -1) {
            if (this.write.IconCompatParcelizer()) {
                return write();
            }
            lambdasetRenderersFactory16 lambdasetrenderersfactory16 = new lambdasetRenderersFactory16(null);
            lambdasetrenderersfactory16.AudioAttributesCompatParcelizer(true);
            return lambdasetrenderersfactory16;
        }
        return read(j);
    }

    private lambdasetRenderersFactory16 write() throws ExoPlaybackExceptionType, IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            lambdanew10 lambdanew10Var = this.write.read();
            if (lambdanew10Var == null) {
                throw new ExoPlaybackExceptionType("Unexpected end of stream");
            }
            lambdanew3 lambdanew3Var = lambdanew10Var.read();
            if (!lambdasetMediaSourceFactory17.RemoteActionCompatParcelizer.equals(lambdanew10Var)) {
                if (lambdanew3Var == lambdanew3.UNICODE_STRING) {
                    byte[] bytes = ((lambdasetRenderersFactory16) lambdanew10Var).toString().getBytes(StandardCharsets.UTF_8);
                    byteArrayOutputStream.write(bytes, 0, bytes.length);
                } else {
                    throw new ExoPlaybackExceptionType("Unexpected major type ".concat(String.valueOf(lambdanew3Var)));
                }
            } else {
                return new lambdasetRenderersFactory16(new String(byteArrayOutputStream.toByteArray(), StandardCharsets.UTF_8));
            }
        }
    }

    private lambdasetRenderersFactory16 read(long j) throws ExoPlaybackExceptionType {
        return new lambdasetRenderersFactory16(new String(write(j), StandardCharsets.UTF_8));
    }
}
