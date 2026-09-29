package kotlin;

import kotlin.StdKeySerializers;
import kotlin.findSerializerByAnnotations;

/* JADX INFO: loaded from: classes2.dex */
public interface modifyCollectionSerializer {

    public interface write {
        void IconCompatParcelizer(findSerializerByAnnotations.RemoteActionCompatParcelizer remoteActionCompatParcelizer, String str);

        void write(findSerializerByAnnotations.RemoteActionCompatParcelizer remoteActionCompatParcelizer, String str);
    }

    void AudioAttributesCompatParcelizer(findSerializerByAnnotations.RemoteActionCompatParcelizer remoteActionCompatParcelizer);

    void AudioAttributesCompatParcelizer(findSerializerByAnnotations.RemoteActionCompatParcelizer remoteActionCompatParcelizer, int i);

    void IconCompatParcelizer(findSerializerByAnnotations.RemoteActionCompatParcelizer remoteActionCompatParcelizer);

    void IconCompatParcelizer(write writeVar);

    String RemoteActionCompatParcelizer(PolymorphicTypeValidator polymorphicTypeValidator, StdKeySerializers.write writeVar);

    String write();

    void write(findSerializerByAnnotations.RemoteActionCompatParcelizer remoteActionCompatParcelizer);
}
