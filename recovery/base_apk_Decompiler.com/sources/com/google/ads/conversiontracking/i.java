package com.google.ads.conversiontracking;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import com.google.ads.conversiontracking.q;
import java.io.IOException;
import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateNotYetValidException;

/* JADX INFO: loaded from: classes4.dex */
public final class i {

    public static final class a {
        private final String a;
        private final boolean b;

        public a(String str, boolean z) {
            this.a = str;
            this.b = z;
        }

        public final String a() {
            return this.a;
        }

        public final boolean b() {
            return this.b;
        }
    }

    public static a a(Context context) throws IllegalStateException, k, IOException, j {
        p.a("Calling this from your main thread can lead to deadlock");
        return a(context, b(context));
    }

    static a a(Context context, n nVar) throws IOException {
        try {
            try {
                q qVarA = q.a.a(nVar.a());
                return new a(qVarA.a(), qVarA.a(true));
            } finally {
                try {
                    context.unbindService(nVar);
                } catch (IllegalArgumentException unused) {
                }
            }
        } catch (RemoteException unused2) {
            throw new IOException("Remote exception");
        } catch (InterruptedException unused3) {
            throw new IOException("Interrupted exception");
        }
    }

    private static n b(Context context) throws k, CertificateNotYetValidException, IOException, j, CertificateExpiredException {
        try {
            context.getPackageManager().getPackageInfo("com.android.vending", 0);
            try {
                l.b(context);
                n nVar = new n();
                Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                intent.setPackage("com.google.android.gms");
                if (context.bindService(intent, nVar, 1)) {
                    return nVar;
                }
                throw new IOException("Connection failure");
            } catch (j e) {
                throw new IOException(e);
            }
        } catch (PackageManager.NameNotFoundException unused) {
            throw new j(9);
        }
    }
}
