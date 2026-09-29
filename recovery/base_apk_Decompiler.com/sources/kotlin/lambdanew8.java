package kotlin;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes2.dex */
public final class lambdanew8 extends lambdanew12 {
    public lambdanew8(lambdanew6 lambdanew6Var, lambdanew6 lambdanew6Var2) throws ExoPlaybackExceptionType {
        write(30L);
        if (lambdanew6Var == null) {
            throw new ExoPlaybackExceptionType("Numerator is null");
        }
        if (lambdanew6Var2 == null) {
            throw new ExoPlaybackExceptionType("Denominator is null");
        }
        if (lambdanew6Var2.RemoteActionCompatParcelizer().equals(BigInteger.ZERO)) {
            throw new ExoPlaybackExceptionType("Denominator is zero");
        }
        write(lambdanew6Var);
        write(lambdanew6Var2);
    }
}
