package kotlin;

import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.inputmethod.EditorInfo;
import org.apache.commons.compress.archivers.zip.UnixStat;

/* JADX INFO: loaded from: classes2.dex */
public final class forRecord {
    private static final String[] IconCompatParcelizer = new String[0];

    private static boolean RemoteActionCompatParcelizer(int i) {
        int i2 = i & UnixStat.PERM_MASK;
        return i2 == 129 || i2 == 225 || i2 == 18;
    }

    public static void write(EditorInfo editorInfo, String[] strArr) {
        editorInfo.contentMimeTypes = strArr;
    }

    public static void AudioAttributesCompatParcelizer(EditorInfo editorInfo, boolean z) {
        if (Build.VERSION.SDK_INT >= 35) {
            read.IconCompatParcelizer(editorInfo, z);
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putBoolean("androidx.core.view.inputmethod.EditorInfoCompat.STYLUS_HANDWRITING_ENABLED", z);
    }

    public static void RemoteActionCompatParcelizer(EditorInfo editorInfo, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 30) {
            AudioAttributesCompatParcelizer.read(editorInfo, charSequence, 0);
        } else {
            IconCompatParcelizer(editorInfo, charSequence, 0);
        }
    }

    public static void IconCompatParcelizer(EditorInfo editorInfo, CharSequence charSequence, int i) {
        int i2;
        int i3;
        if (Build.VERSION.SDK_INT >= 30) {
            AudioAttributesCompatParcelizer.read(editorInfo, charSequence, i);
            return;
        }
        if (editorInfo.initialSelStart > editorInfo.initialSelEnd) {
            i2 = editorInfo.initialSelEnd;
        } else {
            i2 = editorInfo.initialSelStart;
        }
        int i4 = i2 - i;
        if (editorInfo.initialSelStart > editorInfo.initialSelEnd) {
            i3 = editorInfo.initialSelStart;
        } else {
            i3 = editorInfo.initialSelEnd;
        }
        int i5 = i3 - i;
        int length = charSequence.length();
        if (i < 0 || i4 < 0 || i5 > length) {
            read(editorInfo, null, 0, 0);
            return;
        }
        if (RemoteActionCompatParcelizer(editorInfo.inputType)) {
            read(editorInfo, null, 0, 0);
        } else if (length <= 2048) {
            read(editorInfo, charSequence, i4, i5);
        } else {
            write(editorInfo, charSequence, i4, i5);
        }
    }

    private static void write(EditorInfo editorInfo, CharSequence charSequence, int i, int i2) {
        CharSequence charSequenceSubSequence;
        int i3 = i2 - i;
        int i4 = i3 > 1024 ? 0 : i3;
        int i5 = 2048 - i4;
        int iMin = Math.min(charSequence.length() - i2, i5 - Math.min(i, (int) (((double) i5) * 0.8d)));
        int iMin2 = Math.min(i, i5 - iMin);
        int i6 = i - iMin2;
        if (AudioAttributesCompatParcelizer(charSequence, i6, 0)) {
            i6++;
            iMin2--;
        }
        if (AudioAttributesCompatParcelizer(charSequence, (i2 + iMin) - 1, 1)) {
            iMin--;
        }
        if (i4 != i3) {
            charSequenceSubSequence = TextUtils.concat(charSequence.subSequence(i6, i6 + iMin2), charSequence.subSequence(i2, iMin + i2));
        } else {
            charSequenceSubSequence = charSequence.subSequence(i6, iMin2 + i4 + iMin + i6);
        }
        read(editorInfo, charSequenceSubSequence, iMin2, i4 + iMin2);
    }

    private static boolean AudioAttributesCompatParcelizer(CharSequence charSequence, int i, int i2) {
        if (i2 == 0) {
            return Character.isLowSurrogate(charSequence.charAt(i));
        }
        if (i2 != 1) {
            return false;
        }
        return Character.isHighSurrogate(charSequence.charAt(i));
    }

    private static void read(EditorInfo editorInfo, CharSequence charSequence, int i, int i2) {
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putCharSequence("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT", charSequence != null ? new SpannableStringBuilder(charSequence) : null);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD", i);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END", i2);
    }

    @Deprecated
    public forRecord() {
    }

    static class AudioAttributesCompatParcelizer {
        static void read(EditorInfo editorInfo, CharSequence charSequence, int i) {
            editorInfo.setInitialSurroundingSubText(charSequence, i);
        }
    }

    static class read {
        static void IconCompatParcelizer(EditorInfo editorInfo, boolean z) {
            editorInfo.setStylusHandwritingEnabled(z);
        }
    }
}
