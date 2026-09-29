package kotlin;

import java.util.Arrays;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u001f\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001aG\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007\"\u0004\b\u0000\u0010\u0005\"\u0004\b\u0001\u0010\u0006*\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00028\u00002\u0006\u0010\t\u001a\u00028\u0001H\u0002¢\u0006\u0004\b\n\u0010\u000b\u001aC\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007*\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u000e\u0010\t\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\fH\u0002¢\u0006\u0004\b\r\u0010\u000e\u001aO\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007\"\u0004\b\u0000\u0010\u0005\"\u0004\b\u0001\u0010\u0006*\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\t\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00028\u0001H\u0002¢\u0006\u0004\b\u0010\u0010\u0011\u001a+\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007*\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00072\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0012\u0010\u0013\u001a+\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007*\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00072\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0003\u0010\u0013"}, d2 = {"", "p0", "p1", "read", "(II)I", "K", "V", "", "", "p2", "write", "([Ljava/lang/Object;ILjava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;", "Lo/tryToParseEightHexDigits;", "RemoteActionCompatParcelizer", "([Ljava/lang/Object;IILo/tryToParseEightHexDigits;)[Ljava/lang/Object;", "p3", "IconCompatParcelizer", "([Ljava/lang/Object;IILjava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;", "AudioAttributesCompatParcelizer", "([Ljava/lang/Object;I)[Ljava/lang/Object;"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class writeIntBE {
    public static final int read(int i, int i2) {
        return (i >> i2) & 31;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <K, V> Object[] write(Object[] objArr, int i, K k, V v) {
        Object[] objArr2 = new Object[objArr.length + 2];
        getOrderDetails.read(objArr, objArr2, 0, i, 6);
        getOrderDetails.RemoteActionCompatParcelizer(objArr, objArr2, i + 2, i, objArr.length);
        objArr2[i] = k;
        objArr2[i + 1] = v;
        return objArr2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object[] RemoteActionCompatParcelizer(Object[] objArr, int i, int i2, tryToParseEightHexDigits<?, ?> trytoparseeighthexdigits) {
        Object[] objArr2 = new Object[objArr.length - 1];
        getOrderDetails.read(objArr, objArr2, 0, i, 6);
        getOrderDetails.RemoteActionCompatParcelizer(objArr, objArr2, i, i + 2, i2);
        objArr2[i2 - 2] = trytoparseeighthexdigits;
        getOrderDetails.RemoteActionCompatParcelizer(objArr, objArr2, i2 - 1, i2, objArr.length);
        return objArr2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <K, V> Object[] IconCompatParcelizer(Object[] objArr, int i, int i2, K k, V v) {
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length + 1);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(objArrCopyOf, "");
        getOrderDetails.RemoteActionCompatParcelizer(objArrCopyOf, objArrCopyOf, i + 2, i + 1, objArr.length);
        getOrderDetails.RemoteActionCompatParcelizer(objArrCopyOf, objArrCopyOf, i2 + 2, i2, i);
        objArrCopyOf[i2] = k;
        objArrCopyOf[i2 + 1] = v;
        return objArrCopyOf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object[] AudioAttributesCompatParcelizer(Object[] objArr, int i) {
        Object[] objArr2 = new Object[objArr.length - 2];
        getOrderDetails.read(objArr, objArr2, 0, i, 6);
        getOrderDetails.RemoteActionCompatParcelizer(objArr, objArr2, i, i + 2, objArr.length);
        return objArr2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object[] read(Object[] objArr, int i) {
        Object[] objArr2 = new Object[objArr.length - 1];
        getOrderDetails.read(objArr, objArr2, 0, i, 6);
        getOrderDetails.RemoteActionCompatParcelizer(objArr, objArr2, i, i + 1, objArr.length);
        return objArr2;
    }
}
