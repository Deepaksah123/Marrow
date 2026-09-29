package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0010\r\n\u0002\u0010\b\n\u0002\b\u0006\u001a\u001b\u0010\u0003\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001b\u0010\u0007\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0007\u0010\u0004"}, d2 = {"", "", "p0", "read", "(Ljava/lang/CharSequence;I)I", "write", "(I)I", "AudioAttributesCompatParcelizer"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class getPathName {
    public static final int read(CharSequence charSequence, int i) {
        return Character.codePointAt(charSequence, i);
    }

    public static final int write(int i) {
        return Character.charCount(i);
    }

    public static final int AudioAttributesCompatParcelizer(CharSequence charSequence, int i) {
        return Character.codePointBefore(charSequence, i);
    }
}
