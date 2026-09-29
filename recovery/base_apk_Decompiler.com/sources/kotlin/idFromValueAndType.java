package kotlin;

import android.text.Spannable;
import android.text.style.RelativeSizeSpan;

/* JADX INFO: loaded from: classes2.dex */
public final class idFromValueAndType {
    public static void RemoteActionCompatParcelizer(Spannable spannable, Object obj, int i, int i2) {
        for (Object obj2 : spannable.getSpans(i, i2, obj.getClass())) {
            RemoteActionCompatParcelizer(spannable, obj2, i, i2, 33);
        }
        spannable.setSpan(obj, i, i2, 33);
    }

    public static void RemoteActionCompatParcelizer(Spannable spannable, float f, int i, int i2) {
        for (RelativeSizeSpan relativeSizeSpan : (RelativeSizeSpan[]) spannable.getSpans(i, i2, RelativeSizeSpan.class)) {
            if (spannable.getSpanStart(relativeSizeSpan) <= i && spannable.getSpanEnd(relativeSizeSpan) >= i2) {
                f *= relativeSizeSpan.getSizeChange();
            }
            RemoteActionCompatParcelizer(spannable, relativeSizeSpan, i, i2, 33);
        }
        spannable.setSpan(new RelativeSizeSpan(f), i, i2, 33);
    }

    private static void RemoteActionCompatParcelizer(Spannable spannable, Object obj, int i, int i2, int i3) {
        if (spannable.getSpanStart(obj) == i && spannable.getSpanEnd(obj) == i2 && spannable.getSpanFlags(obj) == 33) {
            spannable.removeSpan(obj);
        }
    }
}
