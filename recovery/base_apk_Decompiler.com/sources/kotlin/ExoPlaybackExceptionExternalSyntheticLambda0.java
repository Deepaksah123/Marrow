package kotlin;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
public final class ExoPlaybackExceptionExternalSyntheticLambda0 extends experimentalSetOffloadSchedulingEnabled<lambdanew13> {
    public ExoPlaybackExceptionExternalSyntheticLambda0(copyWithMediaPeriodId copywithmediaperiodid, InputStream inputStream) {
        super(copywithmediaperiodid, inputStream);
    }

    public final lambdanew13 write(int i) throws ExoPlaybackExceptionType {
        long j = read(i);
        if (j == -1) {
            if (this.write.RemoteActionCompatParcelizer()) {
                return read();
            }
            lambdanew13 lambdanew13Var = new lambdanew13(null);
            lambdanew13Var.AudioAttributesCompatParcelizer(true);
            return lambdanew13Var;
        }
        return read(j);
    }

    private lambdanew13 read() throws ExoPlaybackExceptionType, IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            lambdanew10 lambdanew10Var = this.write.read();
            if (lambdanew10Var == null) {
                throw new ExoPlaybackExceptionType("Unexpected end of stream");
            }
            lambdanew3 lambdanew3Var = lambdanew10Var.read();
            if (!lambdasetMediaSourceFactory17.RemoteActionCompatParcelizer.equals(lambdanew10Var)) {
                if (lambdanew3Var == lambdanew3.BYTE_STRING) {
                    byte[] bArrWrite = ((lambdanew13) lambdanew10Var).write();
                    if (bArrWrite != null) {
                        byteArrayOutputStream.write(bArrWrite, 0, bArrWrite.length);
                    }
                } else {
                    throw new ExoPlaybackExceptionType("Unexpected major type ".concat(String.valueOf(lambdanew3Var)));
                }
            } else {
                return new lambdanew13(byteArrayOutputStream.toByteArray());
            }
        }
    }

    private lambdanew13 read(long j) throws ExoPlaybackExceptionType {
        return new lambdanew13(write(j));
    }
}
