package com.google.ads.conversiontracking;

import android.content.Context;
import com.google.ads.conversiontracking.g;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public class e {
    private Context c;
    private f f;
    private final Object a = new Object();
    private boolean d = true;
    private boolean e = false;
    private final List<d> b = new LinkedList();

    public e(Context context) {
        this.c = context;
        this.f = new f(context);
        new Thread(new b()).start();
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
        long jB = (g.b(context) + 300000) - g.a();
        scheduledThreadPoolExecutor.scheduleAtFixedRate(new a(), jB <= 0 ? 0L : jB, 300000L, TimeUnit.MILLISECONDS);
    }

    public void a(String str, g.c cVar, boolean z, boolean z2, boolean z3) {
        final d dVar = new d(str, cVar, z, z2);
        synchronized (this.a) {
            if (!z3) {
                a(new Runnable() { // from class: com.google.ads.conversiontracking.e.1
                    @Override // java.lang.Runnable
                    public void run() throws Throwable {
                        e.this.a(dVar);
                    }
                });
                return;
            }
            this.f.b(dVar);
            if (this.e && g.d(this.c)) {
                this.b.add(dVar);
                this.d = true;
                this.a.notify();
            }
        }
    }

    protected void a(Runnable runnable) {
        new Thread(runnable).start();
    }

    class a implements Runnable {
        private a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (e.this.a) {
                if (e.this.e && g.d(e.this.c) && !e.this.d) {
                    e.this.b.addAll(e.this.f.a(100L));
                    g.c(e.this.c);
                    e.this.d = true;
                    e.this.a.notify();
                }
            }
        }
    }

    public class b implements Runnable {
        protected long a = 0;

        public b() {
        }

        @Override // java.lang.Runnable
        public void run() throws Throwable {
            d dVar;
            try {
                e.this.e = true;
                while (true) {
                    synchronized (e.this.a) {
                        while (e.this.b.isEmpty()) {
                            e.this.d = false;
                            e.this.a.wait();
                        }
                        e.this.d = true;
                        dVar = (d) e.this.b.remove(0);
                    }
                    if (dVar != null) {
                        if (!g.a(e.this.c, dVar.e, dVar.f, dVar.b)) {
                            e.this.f.a(dVar);
                        } else {
                            int iA = e.this.a(dVar);
                            if (iA == 2) {
                                e.this.f.a(dVar);
                                this.a = 0L;
                            } else if (iA == 0) {
                                e.this.f.c(dVar);
                                a();
                                Thread.sleep(this.a);
                            } else {
                                e.this.f.c(dVar);
                                this.a = 0L;
                            }
                        }
                    }
                }
            } catch (InterruptedException unused) {
                e.this.e = false;
            }
        }

        private void a() {
            long j = this.a;
            if (j == 0) {
                this.a = 1000L;
            } else {
                this.a = Math.min(j << 1, 60000L);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0057, code lost:
    
        if (200 > r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0059, code lost:
    
        if (r1 >= 300) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005b, code lost:
    
        r5 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005c, code lost:
    
        if (r5 != 2) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005e, code lost:
    
        b(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0061, code lost:
    
        if (r0 == null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0063, code lost:
    
        r0.disconnect();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0066, code lost:
    
        return r5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected int a(com.google.ads.conversiontracking.d r9) throws java.lang.Throwable {
        /*
            r8 = this;
            java.lang.String r0 = r9.g
            java.lang.String r0 = r9.g
            r1 = 0
            r2 = 0
            r3 = r2
        L7:
            r4 = 5
            r5 = 1
            if (r3 >= r4) goto L79
            java.net.URL r4 = new java.net.URL     // Catch: java.lang.Throwable -> L6c java.io.IOException -> L73
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L6c java.io.IOException -> L73
            java.net.URLConnection r0 = r4.openConnection()     // Catch: java.lang.Throwable -> L6c java.io.IOException -> L73
            java.lang.Object r0 = kotlin.getAvcProfileAndLevel.read(r0)     // Catch: java.lang.Throwable -> L6c java.io.IOException -> L73
            java.net.URLConnection r0 = (java.net.URLConnection) r0     // Catch: java.lang.Throwable -> L6c java.io.IOException -> L73
            java.net.HttpURLConnection r0 = (java.net.HttpURLConnection) r0     // Catch: java.lang.Throwable -> L6c java.io.IOException -> L73
            r0.setInstanceFollowRedirects(r2)     // Catch: java.lang.Throwable -> L67 java.io.IOException -> L6a
            r1 = 60000(0xea60, float:8.4078E-41)
            r0.setConnectTimeout(r1)     // Catch: java.lang.Throwable -> L67 java.io.IOException -> L6a
            r0.setReadTimeout(r1)     // Catch: java.lang.Throwable -> L67 java.io.IOException -> L6a
            r0.setUseCaches(r2)     // Catch: java.lang.Throwable -> L67 java.io.IOException -> L6a
            int r1 = r0.getResponseCode()     // Catch: java.lang.Throwable -> L67 java.io.IOException -> L6a
            r4 = 300(0x12c, float:4.2E-43)
            if (r4 > r1) goto L54
            r6 = 400(0x190, float:5.6E-43)
            if (r1 >= r6) goto L54
            java.lang.String r1 = "Location"
            java.lang.String r1 = r0.getHeaderField(r1)     // Catch: java.lang.Throwable -> L67 java.io.IOException -> L6a
            boolean r4 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L67 java.io.IOException -> L6a
            if (r4 == 0) goto L49
            if (r0 == 0) goto L48
            r0.disconnect()
        L48:
            return r2
        L49:
            if (r0 == 0) goto L4e
            r0.disconnect()
        L4e:
            int r3 = r3 + 1
            r7 = r1
            r1 = r0
            r0 = r7
            goto L7
        L54:
            r3 = 200(0xc8, float:2.8E-43)
            r6 = 2
            if (r3 > r1) goto L5c
            if (r1 >= r4) goto L5c
            r5 = r6
        L5c:
            if (r5 != r6) goto L61
            r8.b(r9)     // Catch: java.lang.Throwable -> L67 java.io.IOException -> L6a
        L61:
            if (r0 == 0) goto L66
            r0.disconnect()
        L66:
            return r5
        L67:
            r8 = move-exception
            r1 = r0
            goto L6d
        L6a:
            r1 = r0
            goto L73
        L6c:
            r8 = move-exception
        L6d:
            if (r1 == 0) goto L72
            r1.disconnect()
        L72:
            throw r8
        L73:
            if (r1 == 0) goto L78
            r1.disconnect()
        L78:
            return r2
        L79:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.conversiontracking.e.a(com.google.ads.conversiontracking.d):int");
    }

    protected void b(d dVar) {
        if (dVar.b || !dVar.a) {
            return;
        }
        g.a(this.c, dVar.e, dVar.f);
    }
}
