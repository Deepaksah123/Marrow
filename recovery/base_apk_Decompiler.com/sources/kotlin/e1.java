package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\u0018\u0000 \b2\u00020\u0001:\u0002\u0019\bB\u0011\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004B\u001b\b\u0010\u0012\u0010\u0010\u0002\u001a\f\u0012\u0004\u0012\u00020\u0006\u0012\u0002\b\u00030\u0005¢\u0006\u0004\b\u0003\u0010\u0007J\u0017\u0010\b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0002\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ)\u0010\u000e\u001a\u00020\r\"\u0004\b\u0000\u0010\n2\u0006\u0010\u0002\u001a\u00020\u00062\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0013\u001a\u00020\r2\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0015\u0010\u0012J\u000f\u0010\u0016\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\"\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0018R\u001f\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00058G¢\u0006\u0006\u001a\u0004\b\b\u0010\u001a"}, d2 = {"Lo/e1;", "", "p0", "<init>", "(Lo/e1;)V", "", "", "(Ljava/util/Map;)V", "read", "(Ljava/lang/String;)Ljava/lang/String;", "T", "Ljava/lang/Class;", "p1", "", "RemoteActionCompatParcelizer", "(Ljava/lang/String;Ljava/lang/Class;)Z", "", "write", "()I", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "()Ljava/lang/String;", "Ljava/util/Map;", "IconCompatParcelizer", "()Ljava/util/Map;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class e1 {

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final Map<String, Object> IconCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final e1 IconCompatParcelizer = new IconCompatParcelizer().IconCompatParcelizer();

    public e1(e1 e1Var) {
        toMagicModuleMetaRepoModel.write(e1Var, "");
        this.IconCompatParcelizer = new HashMap(e1Var.IconCompatParcelizer);
    }

    public e1(Map<String, ?> map) {
        toMagicModuleMetaRepoModel.write(map, "");
        this.IconCompatParcelizer = new HashMap(map);
    }

    public final String read(String p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        Object obj = this.IconCompatParcelizer.get(p0);
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    public final Map<String, Object> read() {
        Map<String, Object> mapUnmodifiableMap = Collections.unmodifiableMap(this.IconCompatParcelizer);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(mapUnmodifiableMap, "");
        return mapUnmodifiableMap;
    }

    public final <T> boolean RemoteActionCompatParcelizer(String p0, Class<T> p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        Object obj = this.IconCompatParcelizer.get(p0);
        return obj != null && p1.isAssignableFrom(obj.getClass());
    }

    public final int write() {
        return this.IconCompatParcelizer.size();
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x006f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x002e A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean equals(java.lang.Object r9) {
        /*
            r8 = this;
            r0 = 1
            if (r8 != r9) goto L4
            return r0
        L4:
            r1 = 0
            if (r9 == 0) goto L71
            java.lang.Class r2 = r8.getClass()
            java.lang.Class r3 = r9.getClass()
            boolean r2 = kotlin.toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(r2, r3)
            if (r2 == 0) goto L71
            o.e1 r9 = (kotlin.e1) r9
            java.util.Map<java.lang.String, java.lang.Object> r2 = r8.IconCompatParcelizer
            java.util.Set r2 = r2.keySet()
            java.util.Map<java.lang.String, java.lang.Object> r3 = r9.IconCompatParcelizer
            java.util.Set r3 = r3.keySet()
            boolean r3 = kotlin.toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(r2, r3)
            if (r3 != 0) goto L2a
            return r1
        L2a:
            java.util.Iterator r2 = r2.iterator()
        L2e:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L70
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            java.util.Map<java.lang.String, java.lang.Object> r4 = r8.IconCompatParcelizer
            java.lang.Object r4 = r4.get(r3)
            java.util.Map<java.lang.String, java.lang.Object> r5 = r9.IconCompatParcelizer
            java.lang.Object r3 = r5.get(r3)
            if (r4 == 0) goto L6c
            if (r3 == 0) goto L6c
            boolean r5 = r4 instanceof java.lang.Object[]
            if (r5 == 0) goto L65
            r5 = r4
            java.lang.Object[] r5 = (java.lang.Object[]) r5
            boolean r6 = r5 instanceof java.lang.Object[]
            if (r6 == 0) goto L65
            boolean r6 = r3 instanceof java.lang.Object[]
            if (r6 == 0) goto L65
            r6 = r3
            java.lang.Object[] r6 = (java.lang.Object[]) r6
            boolean r7 = r6 instanceof java.lang.Object[]
            if (r7 == 0) goto L65
            boolean r3 = kotlin.getOrderDetails.IconCompatParcelizer(r5, r6)
            goto L69
        L65:
            boolean r3 = kotlin.toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(r4, r3)
        L69:
            if (r3 != 0) goto L2e
            goto L6f
        L6c:
            if (r4 != r3) goto L6f
            goto L2e
        L6f:
            return r1
        L70:
            return r0
        L71:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.e1.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int iHashCode;
        int i = 0;
        for (Map.Entry<String, Object> entry : this.IconCompatParcelizer.entrySet()) {
            Object value = entry.getValue();
            if (value instanceof Object[]) {
                iHashCode = Objects.hashCode(entry.getKey()) ^ getOrderDetails.IconCompatParcelizer((Object[]) value);
            } else {
                iHashCode = entry.hashCode();
            }
            i += iHashCode;
        }
        return i * 31;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Data {");
        sb.append(IntermediateLoginResponseBody.RemoteActionCompatParcelizer(this.IconCompatParcelizer.entrySet(), null, null, null, 0, null, new getAnswerMap() { // from class: o.d
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return e1.write((Map.Entry) obj);
            }
        }, 31));
        sb.append("}");
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence write(Map.Entry entry) {
        toMagicModuleMetaRepoModel.write(entry, "");
        String str = (String) entry.getKey();
        Object value = entry.getValue();
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" : ");
        if (value instanceof Object[]) {
            value = Arrays.toString((Object[]) value);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(value, "");
        }
        sb.append(value);
        return sb.toString();
    }

    public static final class IconCompatParcelizer {
        private final Map<String, Object> read = new LinkedHashMap();

        private final IconCompatParcelizer AudioAttributesCompatParcelizer(String str, Object obj) {
            this.read.put(str, obj);
            return this;
        }

        public final IconCompatParcelizer AudioAttributesCompatParcelizer(String str, String str2) {
            toMagicModuleMetaRepoModel.write(str, "");
            return AudioAttributesCompatParcelizer(str, (Object) str2);
        }

        public final IconCompatParcelizer RemoteActionCompatParcelizer(e1 e1Var) {
            toMagicModuleMetaRepoModel.write(e1Var, "");
            IconCompatParcelizer(e1Var.IconCompatParcelizer);
            return this;
        }

        public final IconCompatParcelizer read(String str, Object obj) {
            toMagicModuleMetaRepoModel.write(str, "");
            Map<String, Object> map = this.read;
            if (obj == null) {
                obj = null;
            } else {
                isHdPlaybackError ishdplaybackerrorWrite = toMagicModuleMetaDataUcModel.write(obj.getClass());
                if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(ishdplaybackerrorWrite, toMagicModuleMetaDataUcModel.write(Boolean.TYPE)) && !toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(ishdplaybackerrorWrite, toMagicModuleMetaDataUcModel.write(Byte.TYPE)) && !toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(ishdplaybackerrorWrite, toMagicModuleMetaDataUcModel.write(Integer.TYPE)) && !toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(ishdplaybackerrorWrite, toMagicModuleMetaDataUcModel.write(Long.TYPE)) && !toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(ishdplaybackerrorWrite, toMagicModuleMetaDataUcModel.write(Float.TYPE)) && !toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(ishdplaybackerrorWrite, toMagicModuleMetaDataUcModel.write(Double.TYPE)) && !toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(ishdplaybackerrorWrite, toMagicModuleMetaDataUcModel.write(String.class)) && !toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(ishdplaybackerrorWrite, toMagicModuleMetaDataUcModel.write(Boolean[].class)) && !toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(ishdplaybackerrorWrite, toMagicModuleMetaDataUcModel.write(Byte[].class)) && !toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(ishdplaybackerrorWrite, toMagicModuleMetaDataUcModel.write(Integer[].class)) && !toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(ishdplaybackerrorWrite, toMagicModuleMetaDataUcModel.write(Long[].class)) && !toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(ishdplaybackerrorWrite, toMagicModuleMetaDataUcModel.write(Float[].class)) && !toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(ishdplaybackerrorWrite, toMagicModuleMetaDataUcModel.write(Double[].class)) && !toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(ishdplaybackerrorWrite, toMagicModuleMetaDataUcModel.write(String[].class))) {
                    if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(ishdplaybackerrorWrite, toMagicModuleMetaDataUcModel.write(boolean[].class))) {
                        obj = f.RemoteActionCompatParcelizer((boolean[]) obj);
                    } else if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(ishdplaybackerrorWrite, toMagicModuleMetaDataUcModel.write(byte[].class))) {
                        obj = f.read((byte[]) obj);
                    } else if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(ishdplaybackerrorWrite, toMagicModuleMetaDataUcModel.write(int[].class))) {
                        obj = f.IconCompatParcelizer((int[]) obj);
                    } else if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(ishdplaybackerrorWrite, toMagicModuleMetaDataUcModel.write(long[].class))) {
                        obj = f.read((long[]) obj);
                    } else if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(ishdplaybackerrorWrite, toMagicModuleMetaDataUcModel.write(float[].class))) {
                        obj = f.read((float[]) obj);
                    } else if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(ishdplaybackerrorWrite, toMagicModuleMetaDataUcModel.write(double[].class))) {
                        obj = f.read((double[]) obj);
                    } else {
                        StringBuilder sb = new StringBuilder("Key ");
                        sb.append(str);
                        sb.append(" has invalid type ");
                        sb.append(ishdplaybackerrorWrite);
                        throw new IllegalArgumentException(sb.toString());
                    }
                }
            }
            map.put(str, obj);
            return this;
        }

        public final e1 IconCompatParcelizer() {
            e1 e1Var = new e1((Map<String, ?>) this.read);
            Companion companion = e1.INSTANCE;
            Companion.IconCompatParcelizer(e1Var);
            return e1Var;
        }

        public final IconCompatParcelizer IconCompatParcelizer(Map<String, ? extends Object> map) {
            toMagicModuleMetaRepoModel.write(map, "");
            for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
                read(entry.getKey(), entry.getValue());
            }
            return this;
        }
    }

    /* JADX INFO: renamed from: o.e1$read, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0007\u0010\tR\u0011\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\u0006\n\u0004\b\u0007\u0010\n"}, d2 = {"Lo/e1$read;", "", "<init>", "()V", "Lo/e1;", "p0", "", "IconCompatParcelizer", "(Lo/e1;)[B", "([B)Lo/e1;", "Lo/e1;", "RemoteActionCompatParcelizer"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        private static final void IconCompatParcelizer(DataOutputStream dataOutputStream) throws IOException {
            dataOutputStream.writeShort(-21521);
            dataOutputStream.writeShort(1);
        }

        private static final void RemoteActionCompatParcelizer(DataOutputStream dataOutputStream, Object[] objArr) throws IOException {
            int i;
            isHdPlaybackError ishdplaybackerrorWrite = toMagicModuleMetaDataUcModel.write(objArr.getClass());
            if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(ishdplaybackerrorWrite, toMagicModuleMetaDataUcModel.write(Boolean[].class))) {
                i = 8;
            } else if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(ishdplaybackerrorWrite, toMagicModuleMetaDataUcModel.write(Byte[].class))) {
                i = 9;
            } else if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(ishdplaybackerrorWrite, toMagicModuleMetaDataUcModel.write(Integer[].class))) {
                i = 10;
            } else if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(ishdplaybackerrorWrite, toMagicModuleMetaDataUcModel.write(Long[].class))) {
                i = 11;
            } else if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(ishdplaybackerrorWrite, toMagicModuleMetaDataUcModel.write(Float[].class))) {
                i = 12;
            } else if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(ishdplaybackerrorWrite, toMagicModuleMetaDataUcModel.write(Double[].class))) {
                i = 13;
            } else {
                if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(ishdplaybackerrorWrite, toMagicModuleMetaDataUcModel.write(String[].class))) {
                    StringBuilder sb = new StringBuilder("Unsupported value type ");
                    sb.append(toMagicModuleMetaDataUcModel.write(objArr.getClass()).AudioAttributesImplBaseParcelizer());
                    throw new IllegalArgumentException(sb.toString());
                }
                i = 14;
            }
            dataOutputStream.writeByte(i);
            dataOutputStream.writeInt(objArr.length);
            for (Object obj : objArr) {
                if (i == 8) {
                    Boolean bool = obj instanceof Boolean ? (Boolean) obj : null;
                    dataOutputStream.writeBoolean(bool != null ? bool.booleanValue() : false);
                } else if (i == 9) {
                    Byte b = obj instanceof Byte ? (Byte) obj : null;
                    dataOutputStream.writeByte(b != null ? b.byteValue() : (byte) 0);
                } else if (i == 10) {
                    Integer num = obj instanceof Integer ? (Integer) obj : null;
                    dataOutputStream.writeInt(num != null ? num.intValue() : 0);
                } else if (i == 11) {
                    Long l = obj instanceof Long ? (Long) obj : null;
                    dataOutputStream.writeLong(l != null ? l.longValue() : 0L);
                } else if (i == 12) {
                    Float f = obj instanceof Float ? (Float) obj : null;
                    dataOutputStream.writeFloat(f != null ? f.floatValue() : BitmapDescriptorFactory.HUE_RED);
                } else if (i == 13) {
                    Double d = obj instanceof Double ? (Double) obj : null;
                    dataOutputStream.writeDouble(d != null ? d.doubleValue() : 0.0d);
                } else if (i == 14) {
                    String str = obj instanceof String ? (String) obj : null;
                    if (str == null) {
                        str = "androidx.work.Data-95ed6082-b8e9-46e8-a73f-ff56f00f5d9d";
                    }
                    dataOutputStream.writeUTF(str);
                }
            }
        }

        private static final void AudioAttributesCompatParcelizer(DataOutputStream dataOutputStream, String str, Object obj) throws IOException {
            if (obj == null) {
                dataOutputStream.writeByte(0);
            } else if (obj instanceof Boolean) {
                dataOutputStream.writeByte(1);
                dataOutputStream.writeBoolean(((Boolean) obj).booleanValue());
            } else if (obj instanceof Byte) {
                dataOutputStream.writeByte(2);
                dataOutputStream.writeByte(((Number) obj).byteValue());
            } else if (obj instanceof Integer) {
                dataOutputStream.writeByte(3);
                dataOutputStream.writeInt(((Number) obj).intValue());
            } else if (obj instanceof Long) {
                dataOutputStream.writeByte(4);
                dataOutputStream.writeLong(((Number) obj).longValue());
            } else if (obj instanceof Float) {
                dataOutputStream.writeByte(5);
                dataOutputStream.writeFloat(((Number) obj).floatValue());
            } else if (obj instanceof Double) {
                dataOutputStream.writeByte(6);
                dataOutputStream.writeDouble(((Number) obj).doubleValue());
            } else if (obj instanceof String) {
                dataOutputStream.writeByte(7);
                dataOutputStream.writeUTF((String) obj);
            } else if (obj instanceof Object[]) {
                RemoteActionCompatParcelizer(dataOutputStream, (Object[]) obj);
            } else {
                StringBuilder sb = new StringBuilder("Unsupported value type ");
                sb.append(toMagicModuleMetaDataUcModel.write(obj.getClass()).AudioAttributesImplApi26Parcelizer());
                throw new IllegalArgumentException(sb.toString());
            }
            dataOutputStream.writeUTF(str);
        }

        @getMagicModuleMeta
        public static byte[] IconCompatParcelizer(e1 p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
                try {
                    DataOutputStream dataOutputStream2 = dataOutputStream;
                    IconCompatParcelizer(dataOutputStream2);
                    dataOutputStream2.writeInt(p0.write());
                    for (Map.Entry entry : p0.IconCompatParcelizer.entrySet()) {
                        AudioAttributesCompatParcelizer(dataOutputStream2, (String) entry.getKey(), entry.getValue());
                    }
                    dataOutputStream2.flush();
                    if (dataOutputStream2.size() > 10240) {
                        throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized".toString());
                    }
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    MagicModuleMetaLSModel.IconCompatParcelizer(dataOutputStream, null);
                    toMagicModuleMetaRepoModel.write(byteArray);
                    return byteArray;
                } finally {
                }
            } catch (IOException e) {
                String unused = f.read;
                n.write();
                return new byte[0];
            }
        }

        private static final boolean RemoteActionCompatParcelizer(ByteArrayInputStream byteArrayInputStream) throws IOException {
            byte[] bArr = new byte[2];
            byteArrayInputStream.read(bArr);
            boolean z = false;
            if (bArr[0] == -84 && bArr[1] == -19) {
                z = true;
            }
            byteArrayInputStream.reset();
            return z;
        }

        private static final void IconCompatParcelizer(DataInputStream dataInputStream) throws IOException {
            short s = dataInputStream.readShort();
            if (s != -21521) {
                throw new IllegalStateException("Magic number doesn't match: ".concat(String.valueOf((int) s)).toString());
            }
            short s2 = dataInputStream.readShort();
            if (s2 != 1) {
                throw new IllegalStateException("Unsupported version number: ".concat(String.valueOf((int) s2)).toString());
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        private static final Object AudioAttributesCompatParcelizer(DataInputStream dataInputStream, byte b) throws IOException {
            if (b == 0) {
                return null;
            }
            if (b == 1) {
                return Boolean.valueOf(dataInputStream.readBoolean());
            }
            if (b == 2) {
                return Byte.valueOf(dataInputStream.readByte());
            }
            if (b == 3) {
                return Integer.valueOf(dataInputStream.readInt());
            }
            if (b == 4) {
                return Long.valueOf(dataInputStream.readLong());
            }
            if (b == 5) {
                return Float.valueOf(dataInputStream.readFloat());
            }
            if (b == 6) {
                return Double.valueOf(dataInputStream.readDouble());
            }
            if (b == 7) {
                return dataInputStream.readUTF();
            }
            int i = 0;
            if (b == 8) {
                int i2 = dataInputStream.readInt();
                Boolean[] boolArr = new Boolean[i2];
                while (i < i2) {
                    boolArr[i] = Boolean.valueOf(dataInputStream.readBoolean());
                    i++;
                }
                return (Serializable) boolArr;
            }
            if (b == 9) {
                int i3 = dataInputStream.readInt();
                Byte[] bArr = new Byte[i3];
                while (i < i3) {
                    bArr[i] = Byte.valueOf(dataInputStream.readByte());
                    i++;
                }
                return (Serializable) bArr;
            }
            if (b == 10) {
                int i4 = dataInputStream.readInt();
                Integer[] numArr = new Integer[i4];
                while (i < i4) {
                    numArr[i] = Integer.valueOf(dataInputStream.readInt());
                    i++;
                }
                return (Serializable) numArr;
            }
            if (b == 11) {
                int i5 = dataInputStream.readInt();
                Long[] lArr = new Long[i5];
                while (i < i5) {
                    lArr[i] = Long.valueOf(dataInputStream.readLong());
                    i++;
                }
                return (Serializable) lArr;
            }
            if (b == 12) {
                int i6 = dataInputStream.readInt();
                Float[] fArr = new Float[i6];
                while (i < i6) {
                    fArr[i] = Float.valueOf(dataInputStream.readFloat());
                    i++;
                }
                return (Serializable) fArr;
            }
            if (b == 13) {
                int i7 = dataInputStream.readInt();
                Double[] dArr = new Double[i7];
                while (i < i7) {
                    dArr[i] = Double.valueOf(dataInputStream.readDouble());
                    i++;
                }
                return (Serializable) dArr;
            }
            if (b == 14) {
                int i8 = dataInputStream.readInt();
                String[] strArr = new String[i8];
                while (i < i8) {
                    String utf = dataInputStream.readUTF();
                    if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) utf, (Object) "androidx.work.Data-95ed6082-b8e9-46e8-a73f-ff56f00f5d9d")) {
                        utf = null;
                    }
                    strArr[i] = utf;
                    i++;
                }
                return (Serializable) strArr;
            }
            throw new IllegalStateException("Unsupported type ".concat(String.valueOf((int) b)));
        }

        @getMagicModuleMeta
        public static e1 IconCompatParcelizer(byte[] p0) {
            DataInputStream dataInputStream;
            toMagicModuleMetaRepoModel.write(p0, "");
            if (p0.length > 10240) {
                throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized".toString());
            }
            if (p0.length == 0) {
                return e1.IconCompatParcelizer;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            try {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(p0);
                int i = 0;
                if (RemoteActionCompatParcelizer(byteArrayInputStream)) {
                    dataInputStream = new ObjectInputStream(byteArrayInputStream);
                    try {
                        ObjectInputStream objectInputStream = dataInputStream;
                        int i2 = objectInputStream.readInt();
                        while (i < i2) {
                            linkedHashMap.put(objectInputStream.readUTF(), objectInputStream.readObject());
                            i++;
                        }
                        MagicModuleMetaLSModel.IconCompatParcelizer(dataInputStream, null);
                    } finally {
                    }
                } else {
                    dataInputStream = new DataInputStream(byteArrayInputStream);
                    try {
                        DataInputStream dataInputStream2 = dataInputStream;
                        IconCompatParcelizer(dataInputStream2);
                        int i3 = dataInputStream2.readInt();
                        while (i < i3) {
                            linkedHashMap.put(dataInputStream2.readUTF(), AudioAttributesCompatParcelizer(dataInputStream2, dataInputStream2.readByte()));
                            i++;
                        }
                        MagicModuleMetaLSModel.IconCompatParcelizer(dataInputStream, null);
                    } finally {
                        try {
                            throw th;
                        } finally {
                        }
                    }
                }
            } catch (IOException e) {
                String unused = f.read;
                n.write();
            } catch (ClassNotFoundException e2) {
                String unused2 = f.read;
                n.write();
            }
            return new e1(linkedHashMap);
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }
}
