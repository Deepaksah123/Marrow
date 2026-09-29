package kotlin;

import android.content.Context;
import android.graphics.Color;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.calculateNextSearchBytePosition;

/* JADX INFO: loaded from: classes3.dex */
public final class DefaultExtractorsFactoryExtensionLoaderConstructorSupplier {
    private static final int IconCompatParcelizer = (int) Math.round(5.1000000000000005d);
    private final int AudioAttributesCompatParcelizer;
    private final boolean AudioAttributesImplApi21Parcelizer;
    private final float RemoteActionCompatParcelizer;
    private final int read;
    private final int write;

    public DefaultExtractorsFactoryExtensionLoaderConstructorSupplier(Context context) {
        this(SeekPoint.AudioAttributesCompatParcelizer(context, calculateNextSearchBytePosition.IconCompatParcelizer.elevationOverlayEnabled, false), createExtractors.write(context, calculateNextSearchBytePosition.IconCompatParcelizer.elevationOverlayColor, 0), createExtractors.write(context, calculateNextSearchBytePosition.IconCompatParcelizer.elevationOverlayAccentColor, 0), createExtractors.write(context, calculateNextSearchBytePosition.IconCompatParcelizer.colorSurface, 0), context.getResources().getDisplayMetrics().density);
    }

    private DefaultExtractorsFactoryExtensionLoaderConstructorSupplier(boolean z, int i, int i2, int i3, float f) {
        this.AudioAttributesImplApi21Parcelizer = z;
        this.write = i;
        this.AudioAttributesCompatParcelizer = i2;
        this.read = i3;
        this.RemoteActionCompatParcelizer = f;
    }

    public final int RemoteActionCompatParcelizer(float f) {
        return RemoteActionCompatParcelizer(this.read, f);
    }

    public final int RemoteActionCompatParcelizer(int i, float f) {
        return (this.AudioAttributesImplApi21Parcelizer && write(i)) ? read(i, f) : i;
    }

    private int read(int i, float f) {
        int i2;
        float fWrite = write(f);
        int iAlpha = Color.alpha(i);
        int iWrite = createExtractors.write(_verifyNumberForScalarCoercion.AudioAttributesCompatParcelizer(i, 255), this.write, fWrite);
        if (fWrite > BitmapDescriptorFactory.HUE_RED && (i2 = this.AudioAttributesCompatParcelizer) != 0) {
            iWrite = createExtractors.read(iWrite, _verifyNumberForScalarCoercion.AudioAttributesCompatParcelizer(i2, IconCompatParcelizer));
        }
        return _verifyNumberForScalarCoercion.AudioAttributesCompatParcelizer(iWrite, iAlpha);
    }

    private float write(float f) {
        return (this.RemoteActionCompatParcelizer <= BitmapDescriptorFactory.HUE_RED || f <= BitmapDescriptorFactory.HUE_RED) ? BitmapDescriptorFactory.HUE_RED : Math.min(((((float) Math.log1p(f / r2)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
    }

    public final boolean write() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    private boolean write(int i) {
        return _verifyNumberForScalarCoercion.AudioAttributesCompatParcelizer(i, 255) == this.read;
    }
}
