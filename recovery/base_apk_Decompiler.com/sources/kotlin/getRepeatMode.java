package kotlin;

/* JADX INFO: loaded from: classes2.dex */
public final class getRepeatMode {
    public static long AudioAttributesCompatParcelizer(CharSequence charSequence) {
        if (charSequence == null) {
            return 0L;
        }
        int length = charSequence.length();
        long jCharAt = -3750763034362895579L;
        for (int i = 0; i < length; i++) {
            jCharAt = (jCharAt ^ ((long) charSequence.charAt(i))) * 1099511628211L;
        }
        return jCharAt;
    }
}
