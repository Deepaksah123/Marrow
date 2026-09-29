package kotlin;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public interface enums {
    void AudioAttributesCompatParcelizer(int i, int i2, closeOnFailAndThrowAsIOE closeonfailandthrowasioe) throws IOException;

    boolean AudioAttributesCompatParcelizer(int i);

    void IconCompatParcelizer(int i, String str) throws SchemaAware;

    int read(int i);

    void read(int i, double d) throws SchemaAware;

    void write(int i) throws SchemaAware;

    void write(int i, long j) throws SchemaAware;

    void write(int i, long j, long j2) throws SchemaAware;
}
