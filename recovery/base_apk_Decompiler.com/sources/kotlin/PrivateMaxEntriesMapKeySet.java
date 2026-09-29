package kotlin;

import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.RelativeSizeSpan;
import kotlin.getDefaultImpl;

/* JADX INFO: loaded from: classes2.dex */
public final class PrivateMaxEntriesMapKeySet {
    public static float write(int i, float f, int i2, int i3) {
        float f2;
        if (f == -3.4028235E38f) {
            return -3.4028235E38f;
        }
        if (i == 0) {
            f2 = i3;
        } else {
            if (i != 1) {
                if (i != 2) {
                    return -3.4028235E38f;
                }
                return f;
            }
            f2 = i2;
        }
        return f * f2;
    }

    public static void RemoteActionCompatParcelizer(getDefaultImpl.write writeVar) {
        writeVar.IconCompatParcelizer();
        if (writeVar.read() instanceof Spanned) {
            if (!(writeVar.read() instanceof Spannable)) {
                writeVar.RemoteActionCompatParcelizer(SpannableString.valueOf(writeVar.read()));
            }
            read((Spannable) buildTypeSerializer.IconCompatParcelizer(writeVar.read()), new parseTraks() { // from class: o.PrivateMaxEntriesMapKeyIterator
                @Override // kotlin.parseTraks
                public final boolean apply(Object obj) {
                    return PrivateMaxEntriesMapKeySet.read(obj);
                }
            });
        }
        AudioAttributesCompatParcelizer(writeVar);
    }

    static /* synthetic */ boolean read(Object obj) {
        return !(obj instanceof idFromBaseType);
    }

    public static void AudioAttributesCompatParcelizer(getDefaultImpl.write writeVar) {
        writeVar.RemoteActionCompatParcelizer(-3.4028235E38f, Integer.MIN_VALUE);
        if (writeVar.read() instanceof Spanned) {
            if (!(writeVar.read() instanceof Spannable)) {
                writeVar.RemoteActionCompatParcelizer(SpannableString.valueOf(writeVar.read()));
            }
            read((Spannable) buildTypeSerializer.IconCompatParcelizer(writeVar.read()), new parseTraks() { // from class: o.toArray
                @Override // kotlin.parseTraks
                public final boolean apply(Object obj) {
                    return PrivateMaxEntriesMapKeySet.RemoteActionCompatParcelizer(obj);
                }
            });
        }
    }

    static /* synthetic */ boolean RemoteActionCompatParcelizer(Object obj) {
        return (obj instanceof AbsoluteSizeSpan) || (obj instanceof RelativeSizeSpan);
    }

    private static void read(Spannable spannable, parseTraks<Object> parsetraks) {
        for (Object obj : spannable.getSpans(0, spannable.length(), Object.class)) {
            if (parsetraks.apply(obj)) {
                spannable.removeSpan(obj);
            }
        }
    }
}
