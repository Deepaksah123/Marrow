package kotlin;

import android.text.Html;
import android.text.Spanned;

/* JADX INFO: loaded from: classes2.dex */
public final class configureFromObjectSettings {
    public static Spanned IconCompatParcelizer(String str, int i) {
        return write.write(str, i);
    }

    public static Spanned read(String str, int i, Html.ImageGetter imageGetter, Html.TagHandler tagHandler) {
        return write.IconCompatParcelizer(str, i, imageGetter, tagHandler);
    }

    static class write {
        static Spanned write(String str, int i) {
            return Html.fromHtml(str, i);
        }

        static Spanned IconCompatParcelizer(String str, int i, Html.ImageGetter imageGetter, Html.TagHandler tagHandler) {
            return Html.fromHtml(str, i, imageGetter, tagHandler);
        }
    }
}
