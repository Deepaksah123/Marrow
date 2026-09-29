package kotlin;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class _getIndexResolver {
    public static final Bundle write(Pair<String, ? extends Object>... pairArr) {
        Bundle bundle = new Bundle(pairArr.length);
        for (Pair<String, ? extends Object> pair : pairArr) {
            String strRemoteActionCompatParcelizer = pair.RemoteActionCompatParcelizer();
            Object obj = pair.read();
            if (obj == null) {
                bundle.putString(strRemoteActionCompatParcelizer, null);
            } else if (obj instanceof Boolean) {
                bundle.putBoolean(strRemoteActionCompatParcelizer, ((Boolean) obj).booleanValue());
            } else if (obj instanceof Byte) {
                bundle.putByte(strRemoteActionCompatParcelizer, ((Number) obj).byteValue());
            } else if (obj instanceof Character) {
                bundle.putChar(strRemoteActionCompatParcelizer, ((Character) obj).charValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(strRemoteActionCompatParcelizer, ((Number) obj).doubleValue());
            } else if (obj instanceof Float) {
                bundle.putFloat(strRemoteActionCompatParcelizer, ((Number) obj).floatValue());
            } else if (obj instanceof Integer) {
                bundle.putInt(strRemoteActionCompatParcelizer, ((Number) obj).intValue());
            } else if (obj instanceof Long) {
                bundle.putLong(strRemoteActionCompatParcelizer, ((Number) obj).longValue());
            } else if (obj instanceof Short) {
                bundle.putShort(strRemoteActionCompatParcelizer, ((Number) obj).shortValue());
            } else if (obj instanceof Bundle) {
                bundle.putBundle(strRemoteActionCompatParcelizer, (Bundle) obj);
            } else if (obj instanceof CharSequence) {
                bundle.putCharSequence(strRemoteActionCompatParcelizer, (CharSequence) obj);
            } else if (obj instanceof Parcelable) {
                bundle.putParcelable(strRemoteActionCompatParcelizer, (Parcelable) obj);
            } else if (obj instanceof boolean[]) {
                bundle.putBooleanArray(strRemoteActionCompatParcelizer, (boolean[]) obj);
            } else if (obj instanceof byte[]) {
                bundle.putByteArray(strRemoteActionCompatParcelizer, (byte[]) obj);
            } else if (obj instanceof char[]) {
                bundle.putCharArray(strRemoteActionCompatParcelizer, (char[]) obj);
            } else if (obj instanceof double[]) {
                bundle.putDoubleArray(strRemoteActionCompatParcelizer, (double[]) obj);
            } else if (obj instanceof float[]) {
                bundle.putFloatArray(strRemoteActionCompatParcelizer, (float[]) obj);
            } else if (obj instanceof int[]) {
                bundle.putIntArray(strRemoteActionCompatParcelizer, (int[]) obj);
            } else if (obj instanceof long[]) {
                bundle.putLongArray(strRemoteActionCompatParcelizer, (long[]) obj);
            } else if (obj instanceof short[]) {
                bundle.putShortArray(strRemoteActionCompatParcelizer, (short[]) obj);
            } else if (obj instanceof Object[]) {
                Class<?> componentType = obj.getClass().getComponentType();
                toMagicModuleMetaRepoModel.write(componentType);
                if (Parcelable.class.isAssignableFrom(componentType)) {
                    toMagicModuleMetaRepoModel.read(obj, "");
                    bundle.putParcelableArray(strRemoteActionCompatParcelizer, (Parcelable[]) obj);
                } else if (String.class.isAssignableFrom(componentType)) {
                    toMagicModuleMetaRepoModel.read(obj, "");
                    bundle.putStringArray(strRemoteActionCompatParcelizer, (String[]) obj);
                } else if (CharSequence.class.isAssignableFrom(componentType)) {
                    toMagicModuleMetaRepoModel.read(obj, "");
                    bundle.putCharSequenceArray(strRemoteActionCompatParcelizer, (CharSequence[]) obj);
                } else if (Serializable.class.isAssignableFrom(componentType)) {
                    bundle.putSerializable(strRemoteActionCompatParcelizer, (Serializable) obj);
                } else {
                    String canonicalName = componentType.getCanonicalName();
                    StringBuilder sb = new StringBuilder("Illegal value array type ");
                    sb.append(canonicalName);
                    sb.append(" for key \"");
                    sb.append(strRemoteActionCompatParcelizer);
                    sb.append('\"');
                    throw new IllegalArgumentException(sb.toString());
                }
            } else if (obj instanceof Serializable) {
                bundle.putSerializable(strRemoteActionCompatParcelizer, (Serializable) obj);
            } else if (obj instanceof IBinder) {
                bundle.putBinder(strRemoteActionCompatParcelizer, (IBinder) obj);
            } else if (obj instanceof Size) {
                StdKeyDeserializerEnumKD.AudioAttributesCompatParcelizer(bundle, strRemoteActionCompatParcelizer, (Size) obj);
            } else if (obj instanceof SizeF) {
                StdKeyDeserializerEnumKD.IconCompatParcelizer(bundle, strRemoteActionCompatParcelizer, (SizeF) obj);
            } else {
                String canonicalName2 = obj.getClass().getCanonicalName();
                StringBuilder sb2 = new StringBuilder("Illegal value type ");
                sb2.append(canonicalName2);
                sb2.append(" for key \"");
                sb2.append(strRemoteActionCompatParcelizer);
                sb2.append('\"');
                throw new IllegalArgumentException(sb2.toString());
            }
        }
        return bundle;
    }

    public static final Bundle AudioAttributesCompatParcelizer() {
        return new Bundle(0);
    }
}
