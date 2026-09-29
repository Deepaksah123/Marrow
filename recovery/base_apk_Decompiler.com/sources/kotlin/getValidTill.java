package kotlin;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class getValidTill extends setBasePrice {
    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> boolean IconCompatParcelizer(T[] tArr, T[] tArr2) {
        if (tArr == tArr2) {
            return true;
        }
        if (tArr == 0 || tArr2 == 0 || tArr.length != tArr2.length) {
            return false;
        }
        int length = tArr.length;
        for (int i = 0; i < length; i++) {
            Object[] objArr = tArr[i];
            Object[] objArr2 = tArr2[i];
            if (objArr != objArr2) {
                if (objArr != 0 && objArr2 != 0) {
                    if ((objArr instanceof Object[]) && (objArr2 instanceof Object[])) {
                        if (!getOrderDetails.IconCompatParcelizer(objArr, objArr2)) {
                            return false;
                        }
                    } else if ((objArr instanceof byte[]) && (objArr2 instanceof byte[])) {
                        if (!Arrays.equals((byte[]) objArr, (byte[]) objArr2)) {
                            return false;
                        }
                    } else if ((objArr instanceof short[]) && (objArr2 instanceof short[])) {
                        if (!Arrays.equals((short[]) objArr, (short[]) objArr2)) {
                            return false;
                        }
                    } else if ((objArr instanceof int[]) && (objArr2 instanceof int[])) {
                        if (!Arrays.equals((int[]) objArr, (int[]) objArr2)) {
                            return false;
                        }
                    } else if ((objArr instanceof long[]) && (objArr2 instanceof long[])) {
                        if (!Arrays.equals((long[]) objArr, (long[]) objArr2)) {
                            return false;
                        }
                    } else if ((objArr instanceof float[]) && (objArr2 instanceof float[])) {
                        if (!Arrays.equals((float[]) objArr, (float[]) objArr2)) {
                            return false;
                        }
                    } else if ((objArr instanceof double[]) && (objArr2 instanceof double[])) {
                        if (!Arrays.equals((double[]) objArr, (double[]) objArr2)) {
                            return false;
                        }
                    } else if ((objArr instanceof char[]) && (objArr2 instanceof char[])) {
                        if (!Arrays.equals((char[]) objArr, (char[]) objArr2)) {
                            return false;
                        }
                    } else if ((objArr instanceof boolean[]) && (objArr2 instanceof boolean[])) {
                        if (!Arrays.equals((boolean[]) objArr, (boolean[]) objArr2)) {
                            return false;
                        }
                    } else if ((objArr instanceof setClientAuthTokenExpiry) && (objArr2 instanceof setClientAuthTokenExpiry)) {
                        if (!getConfigMinPlaybackSeconds.IconCompatParcelizer(((setClientAuthTokenExpiry) objArr).read(), ((setClientAuthTokenExpiry) objArr2).read())) {
                            return false;
                        }
                    } else if ((objArr instanceof setCustomerId) && (objArr2 instanceof setCustomerId)) {
                        if (!getConfigMinPlaybackSeconds.read(((setCustomerId) objArr).write(), ((setCustomerId) objArr2).write())) {
                            return false;
                        }
                    } else if ((objArr instanceof setCurrency) && (objArr2 instanceof setCurrency)) {
                        if (!getConfigMinPlaybackSeconds.IconCompatParcelizer(((setCurrency) objArr).RemoteActionCompatParcelizer(), ((setCurrency) objArr2).RemoteActionCompatParcelizer())) {
                            return false;
                        }
                    } else if ((objArr instanceof setOrderId) && (objArr2 instanceof setOrderId)) {
                        if (!getConfigMinPlaybackSeconds.RemoteActionCompatParcelizer(((setOrderId) objArr).IconCompatParcelizer(), ((setOrderId) objArr2).IconCompatParcelizer())) {
                            return false;
                        }
                    } else if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(objArr, objArr2)) {
                    }
                }
                return false;
            }
        }
        return true;
    }
}
