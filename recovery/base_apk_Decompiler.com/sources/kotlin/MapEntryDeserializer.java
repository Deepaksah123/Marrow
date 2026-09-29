package kotlin;

import java.util.ArrayList;
import kotlin.JdkDeserializers;

/* JADX INFO: loaded from: classes2.dex */
public final class MapEntryDeserializer {
    private static boolean IconCompatParcelizer(JdkDeserializers.IconCompatParcelizer iconCompatParcelizer, JdkDeserializers.IconCompatParcelizer iconCompatParcelizer2, JdkDeserializers.IconCompatParcelizer iconCompatParcelizer3, JdkDeserializers.IconCompatParcelizer iconCompatParcelizer4) {
        return (iconCompatParcelizer3 == JdkDeserializers.IconCompatParcelizer.FIXED || iconCompatParcelizer3 == JdkDeserializers.IconCompatParcelizer.WRAP_CONTENT || (iconCompatParcelizer3 == JdkDeserializers.IconCompatParcelizer.MATCH_PARENT && iconCompatParcelizer != JdkDeserializers.IconCompatParcelizer.WRAP_CONTENT)) || (iconCompatParcelizer4 == JdkDeserializers.IconCompatParcelizer.FIXED || iconCompatParcelizer4 == JdkDeserializers.IconCompatParcelizer.WRAP_CONTENT || (iconCompatParcelizer4 == JdkDeserializers.IconCompatParcelizer.MATCH_PARENT && iconCompatParcelizer2 != JdkDeserializers.IconCompatParcelizer.WRAP_CONTENT));
    }

    /* JADX WARN: Removed duplicated region for block: B:175:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x037b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean read(kotlin._long r16, o._readAndBind.write r17) {
        /*
            Method dump skipped, instruction units count: 900
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.MapEntryDeserializer.read(o._long, o._readAndBind$write):boolean");
    }

    private static _parseByte RemoteActionCompatParcelizer(ArrayList<_parseByte> arrayList, int i) {
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            _parseByte _parsebyte = arrayList.get(i2);
            if (i == _parsebyte.write()) {
                return _parsebyte;
            }
        }
        return null;
    }

    public static _parseByte write(JdkDeserializers jdkDeserializers, int i, ArrayList<_parseByte> arrayList, _parseByte _parsebyte) {
        int i2;
        int iOnSetRating;
        if (i == 0) {
            i2 = jdkDeserializers.write;
        } else {
            i2 = jdkDeserializers.onSkipToNext;
        }
        if (i2 != -1 && (_parsebyte == null || i2 != _parsebyte.write())) {
            int i3 = 0;
            while (true) {
                if (i3 >= arrayList.size()) {
                    break;
                }
                _parseByte _parsebyte2 = arrayList.get(i3);
                if (_parsebyte2.write() == i2) {
                    if (_parsebyte != null) {
                        _parsebyte.RemoteActionCompatParcelizer(i, _parsebyte2);
                        arrayList.remove(_parsebyte);
                    }
                    _parsebyte = _parsebyte2;
                } else {
                    i3++;
                }
            }
        } else if (i2 != -1) {
            return _parsebyte;
        }
        if (_parsebyte == null) {
            if ((jdkDeserializers instanceof JsonNodeDeserializerArrayDeserializer) && (iOnSetRating = ((JsonNodeDeserializerArrayDeserializer) jdkDeserializers).onSetRating(i)) != -1) {
                int i4 = 0;
                while (true) {
                    if (i4 >= arrayList.size()) {
                        break;
                    }
                    _parseByte _parsebyte3 = arrayList.get(i4);
                    if (_parsebyte3.write() == iOnSetRating) {
                        _parsebyte = _parsebyte3;
                        break;
                    }
                    i4++;
                }
            }
            if (_parsebyte == null) {
                _parsebyte = new _parseByte(i);
            }
            arrayList.add(_parsebyte);
        }
        if (_parsebyte.IconCompatParcelizer(jdkDeserializers)) {
            if (jdkDeserializers instanceof _deserializeUsingCreator) {
                _deserializeUsingCreator _deserializeusingcreator = (_deserializeUsingCreator) jdkDeserializers;
                _deserializeusingcreator.AudioAttributesCompatParcelizer().RemoteActionCompatParcelizer(_deserializeusingcreator.IconCompatParcelizer() == 0 ? 1 : 0, arrayList, _parsebyte);
            }
            if (i == 0) {
                jdkDeserializers.write = _parsebyte.write();
                jdkDeserializers.MediaMetadataCompat.RemoteActionCompatParcelizer(i, arrayList, _parsebyte);
                jdkDeserializers.onPrepareFromMediaId.RemoteActionCompatParcelizer(i, arrayList, _parsebyte);
            } else {
                jdkDeserializers.onSkipToNext = _parsebyte.write();
                jdkDeserializers.onSeekTo.RemoteActionCompatParcelizer(i, arrayList, _parsebyte);
                jdkDeserializers.read.RemoteActionCompatParcelizer(i, arrayList, _parsebyte);
                jdkDeserializers.AudioAttributesImplApi26Parcelizer.RemoteActionCompatParcelizer(i, arrayList, _parsebyte);
            }
            jdkDeserializers.AudioAttributesImplBaseParcelizer.RemoteActionCompatParcelizer(i, arrayList, _parsebyte);
        }
        return _parsebyte;
    }
}
