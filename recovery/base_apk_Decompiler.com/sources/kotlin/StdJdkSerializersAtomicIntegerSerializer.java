package kotlin;

import java.io.IOException;
import kotlin.UUIDSerializer;

/* JADX INFO: loaded from: classes2.dex */
public interface StdJdkSerializersAtomicIntegerSerializer extends UUIDSerializer {

    public interface AudioAttributesCompatParcelizer extends UUIDSerializer.RemoteActionCompatParcelizer<StdJdkSerializersAtomicIntegerSerializer> {
        void write(StdJdkSerializersAtomicIntegerSerializer stdJdkSerializersAtomicIntegerSerializer);
    }

    @Override // kotlin.UUIDSerializer
    long AudioAttributesCompatParcelizer();

    _writeAsBinary D_();

    long E_();

    void IconCompatParcelizer(long j, boolean z);

    void IconCompatParcelizer(AudioAttributesCompatParcelizer audioAttributesCompatParcelizer, long j);

    @Override // kotlin.UUIDSerializer
    boolean IconCompatParcelizer();

    @Override // kotlin.UUIDSerializer
    void RemoteActionCompatParcelizer(long j);

    @Override // kotlin.UUIDSerializer
    boolean RemoteActionCompatParcelizer(_put _putVar);

    @Override // kotlin.UUIDSerializer
    long read();

    long read(long j, createKeySerializer createkeyserializer);

    long read(_verifyAndResolvePlaceholders[] _verifyandresolveplaceholdersArr, boolean[] zArr, visitStringFormat[] visitstringformatArr, boolean[] zArr2, long j);

    long write(long j);

    void write() throws IOException;
}
