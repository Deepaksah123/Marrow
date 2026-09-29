package kotlin;

import android.os.Bundle;
import android.view.ViewStructure;

/* JADX INFO: loaded from: classes.dex */
public class findOverride {
    private final Object read;

    public static findOverride IconCompatParcelizer(ViewStructure viewStructure) {
        return new findOverride(viewStructure);
    }

    public ViewStructure IconCompatParcelizer() {
        return (ViewStructure) this.read;
    }

    private findOverride(ViewStructure viewStructure) {
        this.read = viewStructure;
    }

    public void IconCompatParcelizer(int i, String str, String str2, String str3) {
        write.AudioAttributesCompatParcelizer((ViewStructure) this.read, i, str, str2, str3);
    }

    public void write(CharSequence charSequence) {
        write.AudioAttributesCompatParcelizer((ViewStructure) this.read, charSequence);
    }

    public void AudioAttributesCompatParcelizer(String str) {
        write.write((ViewStructure) this.read, str);
    }

    public void AudioAttributesCompatParcelizer(float f, int i, int i2, int i3) {
        write.IconCompatParcelizer((ViewStructure) this.read, f, i, i2, i3);
    }

    public void read(CharSequence charSequence) {
        write.read((ViewStructure) this.read, charSequence);
    }

    public void IconCompatParcelizer(int i, int i2, int i3, int i4, int i5, int i6) {
        write.RemoteActionCompatParcelizer((ViewStructure) this.read, i, i2, i3, i4, i5, i6);
    }

    public Bundle AudioAttributesCompatParcelizer() {
        return write.read((ViewStructure) this.read);
    }

    static class write {
        static void AudioAttributesCompatParcelizer(ViewStructure viewStructure, int i, String str, String str2, String str3) {
            viewStructure.setId(i, str, str2, str3);
        }

        static void RemoteActionCompatParcelizer(ViewStructure viewStructure, int i, int i2, int i3, int i4, int i5, int i6) {
            viewStructure.setDimens(i, i2, i3, i4, i5, i6);
        }

        static void AudioAttributesCompatParcelizer(ViewStructure viewStructure, CharSequence charSequence) {
            viewStructure.setText(charSequence);
        }

        static void write(ViewStructure viewStructure, String str) {
            viewStructure.setClassName(str);
        }

        static void read(ViewStructure viewStructure, CharSequence charSequence) {
            viewStructure.setContentDescription(charSequence);
        }

        static void IconCompatParcelizer(ViewStructure viewStructure, float f, int i, int i2, int i3) {
            viewStructure.setTextStyle(f, i, i2, i3);
        }

        static Bundle read(ViewStructure viewStructure) {
            return viewStructure.getExtras();
        }
    }
}
