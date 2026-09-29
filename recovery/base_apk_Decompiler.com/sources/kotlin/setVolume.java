package kotlin;

import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
public final class setVolume extends experimentalSetOffloadSchedulingEnabled<lambdanew5> {
    public setVolume(copyWithMediaPeriodId copywithmediaperiodid, InputStream inputStream) {
        super(copywithmediaperiodid, inputStream);
    }

    public final lambdanew5 write(int i) throws ExoPlaybackExceptionType {
        long j = read(i);
        if (j == -1) {
            return write();
        }
        return IconCompatParcelizer(j);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x004b, code lost:
    
        throw new kotlin.ExoPlaybackExceptionType("Unexpected end of stream");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private kotlin.lambdanew5 write() throws kotlin.ExoPlaybackExceptionType {
        /*
            r4 = this;
            o.lambdanew5 r0 = new o.lambdanew5
            r0.<init>()
            r1 = 1
            r0.AudioAttributesCompatParcelizer(r1)
            o.copyWithMediaPeriodId r1 = r4.write
            boolean r1 = r1.write()
            if (r1 == 0) goto L4c
        L11:
            o.copyWithMediaPeriodId r1 = r4.write
            o.lambdanew10 r1 = r1.read()
            o.lambdasetMediaSourceFactory17 r2 = kotlin.lambdasetMediaSourceFactory17.RemoteActionCompatParcelizer
            boolean r2 = r2.equals(r1)
            if (r2 != 0) goto L4c
            o.copyWithMediaPeriodId r2 = r4.write
            o.lambdanew10 r2 = r2.read()
            if (r1 == 0) goto L44
            if (r2 == 0) goto L44
            o.copyWithMediaPeriodId r3 = r4.write
            boolean r3 = r3.MediaBrowserCompatItemReceiver()
            if (r3 == 0) goto L40
            o.lambdanew10 r3 = r0.AudioAttributesCompatParcelizer(r1)
            if (r3 != 0) goto L38
            goto L40
        L38:
            o.ExoPlaybackExceptionType r4 = new o.ExoPlaybackExceptionType
            java.lang.String r0 = "Duplicate key found in map"
            r4.<init>(r0)
            throw r4
        L40:
            r0.IconCompatParcelizer(r1, r2)
            goto L11
        L44:
            o.ExoPlaybackExceptionType r4 = new o.ExoPlaybackExceptionType
            java.lang.String r0 = "Unexpected end of stream"
            r4.<init>(r0)
            throw r4
        L4c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setVolume.write():o.lambdanew5");
    }

    private lambdanew5 IconCompatParcelizer(long j) throws ExoPlaybackExceptionType {
        lambdanew5 lambdanew5Var = new lambdanew5(AudioAttributesCompatParcelizer(j));
        for (long j2 = 0; j2 < j; j2++) {
            lambdanew10 lambdanew10Var = this.write.read();
            lambdanew10 lambdanew10Var2 = this.write.read();
            if (lambdanew10Var == null || lambdanew10Var2 == null) {
                throw new ExoPlaybackExceptionType("Unexpected end of stream");
            }
            if (this.write.MediaBrowserCompatItemReceiver() && lambdanew5Var.AudioAttributesCompatParcelizer(lambdanew10Var) != null) {
                throw new ExoPlaybackExceptionType("Duplicate key found in map");
            }
            lambdanew5Var.IconCompatParcelizer(lambdanew10Var, lambdanew10Var2);
        }
        return lambdanew5Var;
    }
}
