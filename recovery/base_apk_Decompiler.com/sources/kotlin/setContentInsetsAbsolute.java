package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\b\u001a5\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a5\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\n\u001a7\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a/\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\r\u001a7\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000e\u0010\f\u001aG\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0007\u0010\u0011"}, d2 = {"", "p0", "p1", "p2", "p3", "p4", "", "read", "(FFFFF)J", "", "(DDDDD)J", "RemoteActionCompatParcelizer", "(DDDDD)D", "(DDDD)D", "write", "p5", "p6", "(DDDDDDD)J"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class setContentInsetsAbsolute {
    public static final long read(float f, float f2, float f3, float f4, float f5) {
        if (f2 == BitmapDescriptorFactory.HUE_RED) {
            return 9223372036854L;
        }
        return read(f, f2, f3, f4, f5);
    }

    public static final long read(double d, double d2, double d3, double d4, double d5) {
        double dSqrt = 2.0d * d2 * Math.sqrt(d);
        double d6 = (dSqrt * dSqrt) - (4.0d * d);
        double dSqrt2 = d6 < 0.0d ? 0.0d : Math.sqrt(d6);
        double d7 = -dSqrt;
        return read((d7 + dSqrt2) * 0.5d, (d6 < 0.0d ? Math.sqrt(Math.abs(d6)) : 0.0d) * 0.5d, (d7 - dSqrt2) * 0.5d, d2, d3, d4, d5);
    }

    private static final double RemoteActionCompatParcelizer(double d, double d2, double d3, double d4, double d5) {
        double d6 = (d4 - (d * d3)) / d2;
        return Math.log(d5 / Math.sqrt((d3 * d3) + (d6 * d6))) / d;
    }

    private static final double RemoteActionCompatParcelizer(double d, double d2, double d3, double d4) {
        double d5 = d4;
        double d6 = d * d2;
        double d7 = d3 - d6;
        double dLog = Math.log(Math.abs(d5 / d2)) / d;
        double dLog2 = Math.log(Math.abs(d5 / d7));
        int i = 0;
        double dLog3 = dLog2;
        for (int i2 = 0; i2 < 6; i2++) {
            dLog3 = dLog2 - Math.log(Math.abs(dLog3 / d));
        }
        double d8 = dLog3 / d;
        if ((Double.doubleToRawLongBits(dLog) & Long.MAX_VALUE) >= 9218868437227405312L) {
            dLog = d8;
        } else if ((Double.doubleToRawLongBits(d8) & Long.MAX_VALUE) < 9218868437227405312L) {
            dLog = Math.max(dLog, d8);
        }
        double d9 = (-(d6 + d7)) / (d * d7);
        double d10 = d * d9;
        double dExp = Math.exp(d10);
        double dExp2 = Math.exp(d10);
        if (Double.isNaN(d9) || d9 <= 0.0d) {
            d5 = -d5;
        } else if (d9 <= 0.0d || (-((dExp * d2) + (d9 * d7 * dExp2))) >= d5) {
            dLog = (-(2.0d / d)) - (d2 / d7);
        } else {
            if (d7 < 0.0d && d2 > 0.0d) {
                dLog = 0.0d;
            }
            d5 = -d5;
        }
        double d11 = Double.MAX_VALUE;
        while (d11 > 0.001d && i < 100) {
            i++;
            double d12 = d * dLog;
            double dExp3 = dLog - ((((d2 + (d7 * dLog)) * Math.exp(d12)) + d5) / ((((1.0d + d12) * d7) + d6) * Math.exp(d12)));
            double dAbs = Math.abs(dLog - dExp3);
            dLog = dExp3;
            d11 = dAbs;
        }
        return dLog;
    }

    private static final double write(double d, double d2, double d3, double d4, double d5) {
        double d6;
        double dLog;
        double d7 = d5;
        double d8 = d - d2;
        double d9 = ((d * d3) - d4) / d8;
        double d10 = d3 - d9;
        double dLog2 = Math.log(Math.abs(d7 / d10)) / d;
        double dLog3 = Math.log(Math.abs(d7 / d9)) / d2;
        if ((Double.doubleToRawLongBits(dLog2) & Long.MAX_VALUE) < 9218868437227405312L) {
            if ((Double.doubleToRawLongBits(dLog3) & Long.MAX_VALUE) < 9218868437227405312L) {
                dLog2 = Math.max(dLog2, dLog3);
            }
            d6 = dLog2;
        } else {
            d6 = dLog3;
        }
        double d11 = d10 * d;
        double dLog4 = Math.log(d11 / ((-d9) * d2)) / (d2 - d);
        if (Double.isNaN(dLog4) || dLog4 <= 0.0d) {
            d7 = -d7;
            dLog = d6;
        } else if (dLog4 <= 0.0d || (-AudioAttributesCompatParcelizer(d10, d, dLog4, d9, d2)) >= d7) {
            dLog = Math.log((-((d9 * d2) * d2)) / (d11 * d)) / d8;
        } else {
            if (d9 > 0.0d && d10 < 0.0d) {
                d6 = 0.0d;
            }
            d7 = -d7;
            dLog = d6;
        }
        double d12 = d9 * d2;
        if (Math.abs((Math.exp(d * dLog) * d11) + (Math.exp(d2 * dLog) * d12)) < 1.0E-4d) {
            return dLog;
        }
        double d13 = Double.MAX_VALUE;
        int i = 0;
        while (d13 > 0.001d && i < 100) {
            i++;
            double d14 = d * dLog;
            double d15 = d2 * dLog;
            double dExp = dLog - ((((Math.exp(d14) * d10) + (Math.exp(d15) * d9)) + d7) / ((Math.exp(d14) * d11) + (Math.exp(d15) * d12)));
            double dAbs = Math.abs(dLog - dExp);
            dLog = dExp;
            d13 = dAbs;
        }
        return dLog;
    }

    private static final double AudioAttributesCompatParcelizer(double d, double d2, double d3, double d4, double d5) {
        return (d * Math.exp(d2 * d3)) + (d4 * Math.exp(d5 * d3));
    }

    private static final long read(double d, double d2, double d3, double d4, double d5, double d6, double d7) {
        double dRemoteActionCompatParcelizer;
        double d8 = d5;
        if (d6 == 0.0d && d8 == 0.0d) {
            return 0L;
        }
        if (d6 < 0.0d) {
            d8 = -d8;
        }
        double dAbs = Math.abs(d6);
        if (d4 > 1.0d) {
            dRemoteActionCompatParcelizer = write(d, d3, dAbs, d8, d7);
        } else if (d4 < 1.0d) {
            dRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(d, d2, dAbs, d8, d7);
        } else {
            dRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(d, dAbs, d8, d7);
        }
        return (long) (dRemoteActionCompatParcelizer * 1000.0d);
    }
}
