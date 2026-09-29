package kotlin;

import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
public final class ExoPlayerAudioComponent extends experimentalSetOffloadSchedulingEnabled<lambdanew12> {
    public ExoPlayerAudioComponent(copyWithMediaPeriodId copywithmediaperiodid, InputStream inputStream) {
        super(copywithmediaperiodid, inputStream);
    }

    public final lambdanew12 write(int i) throws ExoPlaybackExceptionType {
        long j = read(i);
        if (j == -1) {
            return RemoteActionCompatParcelizer();
        }
        return read(j);
    }

    private lambdanew12 RemoteActionCompatParcelizer() throws ExoPlaybackExceptionType {
        lambdanew12 lambdanew12Var = new lambdanew12();
        lambdanew12Var.AudioAttributesCompatParcelizer(true);
        if (!this.write.AudioAttributesCompatParcelizer()) {
            return lambdanew12Var;
        }
        while (true) {
            lambdanew10 lambdanew10Var = this.write.read();
            if (lambdanew10Var == null) {
                throw new ExoPlaybackExceptionType("Unexpected end of stream");
            }
            if (lambdasetMediaSourceFactory17.RemoteActionCompatParcelizer.equals(lambdanew10Var)) {
                lambdanew12Var.write(lambdasetMediaSourceFactory17.RemoteActionCompatParcelizer);
                return lambdanew12Var;
            }
            lambdanew12Var.write(lambdanew10Var);
        }
    }

    private lambdanew12 read(long j) throws ExoPlaybackExceptionType {
        lambdanew12 lambdanew12Var = new lambdanew12(AudioAttributesCompatParcelizer(j));
        for (long j2 = 0; j2 < j; j2++) {
            lambdanew10 lambdanew10Var = this.write.read();
            if (lambdanew10Var == null) {
                throw new ExoPlaybackExceptionType("Unexpected end of stream");
            }
            lambdanew12Var.write(lambdanew10Var);
        }
        return lambdanew12Var;
    }
}
