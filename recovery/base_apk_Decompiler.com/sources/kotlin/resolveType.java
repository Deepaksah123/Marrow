package kotlin;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes2.dex */
public class resolveType {
    public static ColorStateList write(ImageView imageView) {
        return read.AudioAttributesCompatParcelizer(imageView);
    }

    public static void AudioAttributesCompatParcelizer(ImageView imageView, ColorStateList colorStateList) {
        read.read(imageView, colorStateList);
    }

    public static PorterDuff.Mode read(ImageView imageView) {
        return read.IconCompatParcelizer(imageView);
    }

    public static void read(ImageView imageView, PorterDuff.Mode mode) {
        read.RemoteActionCompatParcelizer(imageView, mode);
    }

    static class read {
        static ColorStateList AudioAttributesCompatParcelizer(ImageView imageView) {
            return imageView.getImageTintList();
        }

        static void read(ImageView imageView, ColorStateList colorStateList) {
            imageView.setImageTintList(colorStateList);
        }

        static PorterDuff.Mode IconCompatParcelizer(ImageView imageView) {
            return imageView.getImageTintMode();
        }

        static void RemoteActionCompatParcelizer(ImageView imageView, PorterDuff.Mode mode) {
            imageView.setImageTintMode(mode);
        }
    }
}
