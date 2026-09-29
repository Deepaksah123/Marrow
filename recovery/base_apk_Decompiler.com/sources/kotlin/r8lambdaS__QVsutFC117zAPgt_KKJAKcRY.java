package kotlin;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public interface r8lambdaS__QVsutFC117zAPgt_KKJAKcRY<T> {

    public interface RemoteActionCompatParcelizer<T> {
        Class<T> IconCompatParcelizer();

        r8lambdaS__QVsutFC117zAPgt_KKJAKcRY<T> write(T t);
    }

    T IconCompatParcelizer() throws IOException;

    void read();
}
