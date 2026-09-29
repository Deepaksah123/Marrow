package kotlin;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;

/* JADX INFO: loaded from: classes4.dex */
public final class getLiveTitle implements getLessons {
    private static boolean IconCompatParcelizer;

    @Override // kotlin.getLessons
    public final void RemoteActionCompatParcelizer() {
        new Thread(new Runnable() { // from class: o.getLiveTitle.1
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    InetAddress byName = InetAddress.getByName("api.mixpanel.com");
                    boolean unused = getLiveTitle.IconCompatParcelizer = byName.isLoopbackAddress() || byName.isAnyLocalAddress();
                } catch (Exception unused2) {
                }
            }
        }).start();
    }

    @Override // kotlin.getLessons
    public final boolean RemoteActionCompatParcelizer(Context context, FreeVideoListResponse freeVideoListResponse) {
        if (IconCompatParcelizer || write(freeVideoListResponse)) {
            return false;
        }
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo == null) {
                return true;
            }
            return activeNetworkInfo.isConnectedOrConnecting();
        } catch (SecurityException unused) {
            return true;
        }
    }

    private static boolean write(FreeVideoListResponse freeVideoListResponse) {
        if (freeVideoListResponse == null) {
            return false;
        }
        try {
            return freeVideoListResponse.AudioAttributesCompatParcelizer();
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x00ce A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:101:0x00fc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x011c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0004 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:122:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0117 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00f7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0112 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x00f2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x010d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // kotlin.getLessons
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final byte[] write(java.lang.String r10, java.util.Map<java.lang.String, java.lang.Object> r11, javax.net.ssl.SSLSocketFactory r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 290
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getLiveTitle.write(java.lang.String, java.util.Map, javax.net.ssl.SSLSocketFactory):byte[]");
    }

    private static byte[] read(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[8192];
        while (true) {
            int i = inputStream.read(bArr, 0, 8192);
            if (i != -1) {
                byteArrayOutputStream.write(bArr, 0, i);
            } else {
                byteArrayOutputStream.flush();
                return byteArrayOutputStream.toByteArray();
            }
        }
    }
}
