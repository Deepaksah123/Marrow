package kotlin;

import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.os.Build;
import android.os.LocaleList;

/* JADX INFO: loaded from: classes2.dex */
public final class onSurfaceTextureDestroyed extends Paint {
    @Override // android.graphics.Paint
    public final void setTextLocales(LocaleList localeList) {
    }

    public onSurfaceTextureDestroyed() {
    }

    public onSurfaceTextureDestroyed(int i) {
        super(i);
    }

    public onSurfaceTextureDestroyed(PorterDuff.Mode mode) {
        setXfermode(new PorterDuffXfermode(mode));
    }

    public onSurfaceTextureDestroyed(PorterDuff.Mode mode, byte b) {
        super(1);
        setXfermode(new PorterDuffXfermode(mode));
    }

    @Override // android.graphics.Paint
    public final void setAlpha(int i) {
        if (Build.VERSION.SDK_INT < 30) {
            setColor((setColorInfo.RemoteActionCompatParcelizer(i) << 24) | (getColor() & 16777215));
        } else {
            super.setAlpha(setColorInfo.RemoteActionCompatParcelizer(i));
        }
    }
}
