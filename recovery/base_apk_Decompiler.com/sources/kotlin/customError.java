package kotlin;

import kotlin.getDecryptedContent;
import kotlin.newEncryptedObject;

/* JADX INFO: loaded from: classes.dex */
public class customError extends ResponseError {
    public static final double AudioAttributesCompatParcelizer(double d) {
        if (d < 0.0d) {
            return 0.0d;
        }
        return d;
    }

    public static final long AudioAttributesCompatParcelizer(long j, long j2) {
        return j > j2 ? j2 : j;
    }

    public static final int RemoteActionCompatParcelizer(int i, int i2) {
        return i > i2 ? i2 : i;
    }

    public static final double read(double d) {
        if (d > 1.0d) {
            return 1.0d;
        }
        return d;
    }

    public static final float read(float f, float f2) {
        return f < f2 ? f2 : f;
    }

    public static final float write(float f, float f2) {
        return f > f2 ? f2 : f;
    }

    public static final int write(int i, int i2) {
        return i < i2 ? i2 : i;
    }

    public static final long write(long j, long j2) {
        return j < j2 ? j2 : j;
    }

    public static final getDecryptedContent read(int i, int i2) {
        getDecryptedContent.Companion companion = getDecryptedContent.INSTANCE;
        return getDecryptedContent.Companion.RemoteActionCompatParcelizer(i, i2, -1);
    }

    public static final getDecryptedContent write(getDecryptedContent getdecryptedcontent) {
        toMagicModuleMetaRepoModel.write(getdecryptedcontent, "");
        getDecryptedContent.Companion companion = getDecryptedContent.INSTANCE;
        return getDecryptedContent.Companion.RemoteActionCompatParcelizer(getdecryptedcontent.getAudioAttributesCompatParcelizer(), getdecryptedcontent.getRead(), -getdecryptedcontent.getIconCompatParcelizer());
    }

    public static final getDecryptedContent write(getDecryptedContent getdecryptedcontent, int i) {
        toMagicModuleMetaRepoModel.write(getdecryptedcontent, "");
        getQues.RemoteActionCompatParcelizer(i > 0, Integer.valueOf(i));
        getDecryptedContent.Companion companion = getDecryptedContent.INSTANCE;
        int read = getdecryptedcontent.getRead();
        int audioAttributesCompatParcelizer = getdecryptedcontent.getAudioAttributesCompatParcelizer();
        if (getdecryptedcontent.getIconCompatParcelizer() <= 0) {
            i = -i;
        }
        return getDecryptedContent.Companion.RemoteActionCompatParcelizer(read, audioAttributesCompatParcelizer, i);
    }

    public static final newEncryptedObject IconCompatParcelizer(int i, int i2) {
        if (i2 <= Integer.MIN_VALUE) {
            newEncryptedObject.Companion companion = newEncryptedObject.INSTANCE;
            return newEncryptedObject.Companion.IconCompatParcelizer();
        }
        return new newEncryptedObject(i, i2 - 1);
    }

    public static final int write(int i, int i2, int i3) {
        if (i2 <= i3) {
            return i < i2 ? i2 : i > i3 ? i3 : i;
        }
        StringBuilder sb = new StringBuilder("Cannot coerce value to an empty range: maximum ");
        sb.append(i3);
        sb.append(" is less than minimum ");
        sb.append(i2);
        sb.append('.');
        throw new IllegalArgumentException(sb.toString());
    }

    public static final long AudioAttributesCompatParcelizer(long j, long j2, long j3) {
        if (j2 <= j3) {
            return j < j2 ? j2 : j > j3 ? j3 : j;
        }
        StringBuilder sb = new StringBuilder("Cannot coerce value to an empty range: maximum ");
        sb.append(j3);
        sb.append(" is less than minimum ");
        sb.append(j2);
        sb.append('.');
        throw new IllegalArgumentException(sb.toString());
    }

    public static final float read(float f, float f2, float f3) {
        if (f2 <= f3) {
            return f < f2 ? f2 : f > f3 ? f3 : f;
        }
        StringBuilder sb = new StringBuilder("Cannot coerce value to an empty range: maximum ");
        sb.append(f3);
        sb.append(" is less than minimum ");
        sb.append(f2);
        sb.append('.');
        throw new IllegalArgumentException(sb.toString());
    }

    public static final double read(double d, double d2, double d3) {
        if (d2 <= d3) {
            return d < d2 ? d2 : d > d3 ? d3 : d;
        }
        StringBuilder sb = new StringBuilder("Cannot coerce value to an empty range: maximum ");
        sb.append(d3);
        sb.append(" is less than minimum ");
        sb.append(d2);
        sb.append('.');
        throw new IllegalArgumentException(sb.toString());
    }

    public static final <T extends Comparable<? super T>> T read(T t, initEncryptedContent<T> initencryptedcontent) {
        toMagicModuleMetaRepoModel.write(t, "");
        toMagicModuleMetaRepoModel.write(initencryptedcontent, "");
        if (!initencryptedcontent.AudioAttributesCompatParcelizer()) {
            return (!initencryptedcontent.read(t, initencryptedcontent.write()) || initencryptedcontent.read(initencryptedcontent.write(), t)) ? (!initencryptedcontent.read(initencryptedcontent.IconCompatParcelizer(), t) || initencryptedcontent.read(t, initencryptedcontent.IconCompatParcelizer())) ? t : initencryptedcontent.IconCompatParcelizer() : initencryptedcontent.write();
        }
        StringBuilder sb = new StringBuilder("Cannot coerce value to an empty range: ");
        sb.append(initencryptedcontent);
        sb.append('.');
        throw new IllegalArgumentException(sb.toString());
    }
}
