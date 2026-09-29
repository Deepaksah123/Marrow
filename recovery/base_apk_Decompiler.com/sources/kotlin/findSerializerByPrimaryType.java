package kotlin;

import android.os.Looper;
import java.util.List;
import kotlin.StdKeySerializers;
import kotlin._fromWellKnownInterface;
import kotlin.isUnsafeBaseType;
import kotlin.serializePolymorphic;

/* JADX INFO: loaded from: classes2.dex */
public interface findSerializerByPrimaryType extends isUnsafeBaseType.AudioAttributesCompatParcelizer, StdKeySerializer, _fromWellKnownInterface.IconCompatParcelizer, PropertySerializerMapEmpty {
    void AudioAttributesCompatParcelizer(long j, int i);

    void AudioAttributesCompatParcelizer(Exception exc);

    void AudioAttributesCompatParcelizer(String str);

    void AudioAttributesCompatParcelizer(_at _atVar);

    void AudioAttributesCompatParcelizer(findSerializerByAnnotations findserializerbyannotations);

    void IconCompatParcelizer(Exception exc);

    void IconCompatParcelizer(_at _atVar);

    void RemoteActionCompatParcelizer(long j);

    void RemoteActionCompatParcelizer(Exception exc);

    void RemoteActionCompatParcelizer(List<StdKeySerializers.write> list, StdKeySerializers.write writeVar);

    void RemoteActionCompatParcelizer(_at _atVar);

    void RemoteActionCompatParcelizer(C0170format c0170format, findMapLikeSerializer findmaplikeserializer);

    void RemoteActionCompatParcelizer(isUnsafeBaseType isunsafebasetype, Looper looper);

    void RemoteActionCompatParcelizer(serializePolymorphic.read readVar);

    void read();

    void read(int i, long j, long j2);

    void read(String str);

    void read(String str, long j, long j2);

    void read(serializePolymorphic.read readVar);

    void write();

    void write(int i, long j);

    void write(Object obj, long j);

    void write(String str, long j, long j2);

    void write(_at _atVar);

    void write(findSerializerByAnnotations findserializerbyannotations);

    void write(C0170format c0170format, findMapLikeSerializer findmaplikeserializer);
}
