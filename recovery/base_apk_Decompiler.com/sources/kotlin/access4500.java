package kotlin;

import java.io.File;

/* JADX INFO: loaded from: classes2.dex */
public interface access4500<T> {
    <A> A AudioAttributesCompatParcelizer(String str, access5500<A> access5500Var);

    <A> A IconCompatParcelizer(String str, access5500<A> access5500Var);

    Pair<T, File> IconCompatParcelizer(String str);

    File RemoteActionCompatParcelizer(String str);

    boolean RemoteActionCompatParcelizer(String str, Pair<? extends T, ? extends File> pair);

    Pair<T, File> read(String str);

    File write(String str, byte[] bArr);

    boolean write(String str);
}
