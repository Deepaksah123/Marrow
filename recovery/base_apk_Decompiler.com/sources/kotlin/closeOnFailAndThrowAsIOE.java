package kotlin;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public interface closeOnFailAndThrowAsIOE extends JsonNullFormatVisitor {
    @Override // kotlin.JsonNullFormatVisitor
    int AudioAttributesCompatParcelizer(byte[] bArr, int i, int i2) throws IOException;

    boolean AudioAttributesCompatParcelizer(byte[] bArr, int i, int i2, boolean z) throws IOException;

    long IconCompatParcelizer();

    void IconCompatParcelizer(int i) throws IOException;

    void IconCompatParcelizer(byte[] bArr, int i, int i2) throws IOException;

    void RemoteActionCompatParcelizer();

    void RemoteActionCompatParcelizer(byte[] bArr, int i, int i2) throws IOException;

    boolean RemoteActionCompatParcelizer(byte[] bArr, int i, int i2, boolean z) throws IOException;

    int read(int i) throws IOException;

    int read(byte[] bArr, int i, int i2) throws IOException;

    long read();

    long write();

    void write(int i) throws IOException;

    boolean write(int i, boolean z) throws IOException;
}
