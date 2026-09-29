package in.juspay.widget.qrscanner.com.journeyapps.barcodescanner.l;

/* JADX INFO: loaded from: classes5.dex */
public class d {
    private int a = -1;
    private boolean b = false;
    private boolean c = false;
    private boolean d = false;
    private boolean e = true;
    private boolean f = false;
    private boolean g = false;
    private a h = a.AUTO;

    public enum a {
        AUTO,
        CONTINUOUS,
        INFINITY,
        MACRO
    }

    public a a() {
        return this.h;
    }

    public void a(int i) {
        this.a = i;
    }

    public int b() {
        return this.a;
    }

    public boolean c() {
        return this.e;
    }

    public boolean d() {
        return this.g;
    }

    public boolean e() {
        return this.c;
    }

    public boolean f() {
        return this.f;
    }

    public boolean g() {
        return this.d;
    }

    public boolean h() {
        return this.b;
    }
}
