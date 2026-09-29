package androidx.core.graphics.drawable;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.versionedparcelable.CustomVersionedParcelable;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.Objects;
import kotlin.configureFromStringCreator;
import org.apache.commons.compress.utils.CharsetNames;

/* JADX INFO: loaded from: classes2.dex */
public class IconCompat extends CustomVersionedParcelable {
    static final PorterDuff.Mode IconCompatParcelizer = PorterDuff.Mode.SRC_IN;
    public int AudioAttributesCompatParcelizer;
    public String AudioAttributesImplApi21Parcelizer;
    public ColorStateList AudioAttributesImplApi26Parcelizer;
    PorterDuff.Mode AudioAttributesImplBaseParcelizer;
    public String MediaBrowserCompatCustomActionResultReceiver;
    public Parcelable MediaBrowserCompatItemReceiver;
    public int RatingCompat;
    public int RemoteActionCompatParcelizer;
    public byte[] read;
    Object write;

    public static IconCompat AudioAttributesCompatParcelizer(Context context, int i) {
        configureFromStringCreator.IconCompatParcelizer(context);
        return RemoteActionCompatParcelizer(context.getResources(), context.getPackageName(), i);
    }

    public static IconCompat RemoteActionCompatParcelizer(Resources resources, String str, int i) {
        configureFromStringCreator.IconCompatParcelizer(str);
        if (i == 0) {
            throw new IllegalArgumentException("Drawable resource ID must not be 0");
        }
        IconCompat iconCompat = new IconCompat(2);
        iconCompat.AudioAttributesCompatParcelizer = i;
        if (resources != null) {
            try {
                iconCompat.write = resources.getResourceName(i);
            } catch (Resources.NotFoundException unused) {
                throw new IllegalArgumentException("Icon resource cannot be found");
            }
        } else {
            iconCompat.write = str;
        }
        iconCompat.AudioAttributesImplApi21Parcelizer = str;
        return iconCompat;
    }

    public static IconCompat read(Bitmap bitmap) {
        configureFromStringCreator.IconCompatParcelizer(bitmap);
        IconCompat iconCompat = new IconCompat(1);
        iconCompat.write = bitmap;
        return iconCompat;
    }

    public static IconCompat RemoteActionCompatParcelizer(String str) {
        configureFromStringCreator.IconCompatParcelizer(str);
        IconCompat iconCompat = new IconCompat(4);
        iconCompat.write = str;
        return iconCompat;
    }

    public static IconCompat write(Uri uri) {
        configureFromStringCreator.IconCompatParcelizer(uri);
        return RemoteActionCompatParcelizer(uri.toString());
    }

    public static IconCompat write(String str) {
        configureFromStringCreator.IconCompatParcelizer(str);
        IconCompat iconCompat = new IconCompat(6);
        iconCompat.write = str;
        return iconCompat;
    }

    public static IconCompat read(Uri uri) {
        configureFromStringCreator.IconCompatParcelizer(uri);
        return write(uri.toString());
    }

    public IconCompat() {
        this.RatingCompat = -1;
        this.read = null;
        this.MediaBrowserCompatItemReceiver = null;
        this.AudioAttributesCompatParcelizer = 0;
        this.RemoteActionCompatParcelizer = 0;
        this.AudioAttributesImplApi26Parcelizer = null;
        this.AudioAttributesImplBaseParcelizer = IconCompatParcelizer;
        this.MediaBrowserCompatCustomActionResultReceiver = null;
    }

    IconCompat(int i) {
        this.read = null;
        this.MediaBrowserCompatItemReceiver = null;
        this.AudioAttributesCompatParcelizer = 0;
        this.RemoteActionCompatParcelizer = 0;
        this.AudioAttributesImplApi26Parcelizer = null;
        this.AudioAttributesImplBaseParcelizer = IconCompatParcelizer;
        this.MediaBrowserCompatCustomActionResultReceiver = null;
        this.RatingCompat = i;
    }

    public int read() {
        int i = this.RatingCompat;
        return i == -1 ? read.RemoteActionCompatParcelizer(this.write) : i;
    }

    public String RemoteActionCompatParcelizer() {
        int i = this.RatingCompat;
        if (i == -1) {
            return read.write(this.write);
        }
        if (i != 2) {
            throw new IllegalStateException("called getResPackage() on ".concat(String.valueOf(this)));
        }
        String str = this.AudioAttributesImplApi21Parcelizer;
        if (str == null || TextUtils.isEmpty(str)) {
            return ((String) this.write).split(":", -1)[0];
        }
        return this.AudioAttributesImplApi21Parcelizer;
    }

    public int IconCompatParcelizer() {
        int i = this.RatingCompat;
        if (i == -1) {
            return read.read(this.write);
        }
        if (i != 2) {
            throw new IllegalStateException("called getResId() on ".concat(String.valueOf(this)));
        }
        return this.AudioAttributesCompatParcelizer;
    }

    public Bitmap AudioAttributesCompatParcelizer() {
        int i = this.RatingCompat;
        if (i == -1) {
            Object obj = this.write;
            if (obj instanceof Bitmap) {
                return (Bitmap) obj;
            }
            return null;
        }
        if (i == 1) {
            return (Bitmap) this.write;
        }
        if (i == 5) {
            return read((Bitmap) this.write, true);
        }
        throw new IllegalStateException("called getBitmap() on ".concat(String.valueOf(this)));
    }

    public Uri write() {
        int i = this.RatingCompat;
        if (i == -1) {
            return read.AudioAttributesCompatParcelizer(this.write);
        }
        if (i != 4 && i != 6) {
            throw new IllegalStateException("called getUri() on ".concat(String.valueOf(this)));
        }
        return Uri.parse((String) this.write);
    }

    @Deprecated
    public Icon MediaBrowserCompatCustomActionResultReceiver() {
        return AudioAttributesCompatParcelizer((Context) null);
    }

    public Icon AudioAttributesCompatParcelizer(Context context) {
        return read.write(this, context);
    }

    public InputStream write(Context context) {
        Uri uriWrite = write();
        String scheme = uriWrite.getScheme();
        if ("content".equals(scheme) || "file".equals(scheme)) {
            try {
                return context.getContentResolver().openInputStream(uriWrite);
            } catch (Exception unused) {
                Objects.toString(uriWrite);
                return null;
            }
        }
        try {
            return new FileInputStream(new File((String) this.write));
        } catch (FileNotFoundException unused2) {
            Objects.toString(uriWrite);
            return null;
        }
    }

    public Bundle AudioAttributesImplApi26Parcelizer() {
        Bundle bundle = new Bundle();
        switch (this.RatingCompat) {
            case -1:
                bundle.putParcelable("obj", (Parcelable) this.write);
                break;
            case 0:
            default:
                throw new IllegalArgumentException("Invalid icon");
            case 1:
            case 5:
                bundle.putParcelable("obj", (Bitmap) this.write);
                break;
            case 2:
            case 4:
            case 6:
                bundle.putString("obj", (String) this.write);
                break;
            case 3:
                bundle.putByteArray("obj", (byte[]) this.write);
                break;
        }
        bundle.putInt("type", this.RatingCompat);
        bundle.putInt("int1", this.AudioAttributesCompatParcelizer);
        bundle.putInt("int2", this.RemoteActionCompatParcelizer);
        bundle.putString("string1", this.AudioAttributesImplApi21Parcelizer);
        ColorStateList colorStateList = this.AudioAttributesImplApi26Parcelizer;
        if (colorStateList != null) {
            bundle.putParcelable("tint_list", colorStateList);
        }
        PorterDuff.Mode mode = this.AudioAttributesImplBaseParcelizer;
        if (mode != IconCompatParcelizer) {
            bundle.putString("tint_mode", mode.name());
        }
        return bundle;
    }

    public String toString() {
        if (this.RatingCompat == -1) {
            return String.valueOf(this.write);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        sb.append(AudioAttributesCompatParcelizer(this.RatingCompat));
        switch (this.RatingCompat) {
            case 1:
            case 5:
                sb.append(" size=");
                sb.append(((Bitmap) this.write).getWidth());
                sb.append("x");
                sb.append(((Bitmap) this.write).getHeight());
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(this.AudioAttributesImplApi21Parcelizer);
                sb.append(" id=");
                sb.append(String.format("0x%08x", Integer.valueOf(IconCompatParcelizer())));
                break;
            case 3:
                sb.append(" len=");
                sb.append(this.AudioAttributesCompatParcelizer);
                if (this.RemoteActionCompatParcelizer != 0) {
                    sb.append(" off=");
                    sb.append(this.RemoteActionCompatParcelizer);
                }
                break;
            case 4:
            case 6:
                sb.append(" uri=");
                sb.append(this.write);
                break;
        }
        if (this.AudioAttributesImplApi26Parcelizer != null) {
            sb.append(" tint=");
            sb.append(this.AudioAttributesImplApi26Parcelizer);
        }
        if (this.AudioAttributesImplBaseParcelizer != IconCompatParcelizer) {
            sb.append(" mode=");
            sb.append(this.AudioAttributesImplBaseParcelizer);
        }
        sb.append(")");
        return sb.toString();
    }

    @Override // androidx.versionedparcelable.CustomVersionedParcelable
    public void IconCompatParcelizer(boolean z) {
        this.MediaBrowserCompatCustomActionResultReceiver = this.AudioAttributesImplBaseParcelizer.name();
        switch (this.RatingCompat) {
            case -1:
                if (z) {
                    throw new IllegalArgumentException("Can't serialize Icon created with IconCompat#createFromIcon");
                }
                this.MediaBrowserCompatItemReceiver = (Parcelable) this.write;
                return;
            case 0:
            default:
                return;
            case 1:
            case 5:
                if (z) {
                    Bitmap bitmap = (Bitmap) this.write;
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    bitmap.compress(Bitmap.CompressFormat.PNG, 90, byteArrayOutputStream);
                    this.read = byteArrayOutputStream.toByteArray();
                    return;
                }
                this.MediaBrowserCompatItemReceiver = (Parcelable) this.write;
                return;
            case 2:
                this.read = ((String) this.write).getBytes(Charset.forName(CharsetNames.UTF_16));
                return;
            case 3:
                this.read = (byte[]) this.write;
                return;
            case 4:
            case 6:
                this.read = this.write.toString().getBytes(Charset.forName(CharsetNames.UTF_16));
                return;
        }
    }

    @Override // androidx.versionedparcelable.CustomVersionedParcelable
    public void AudioAttributesImplBaseParcelizer() {
        this.AudioAttributesImplBaseParcelizer = PorterDuff.Mode.valueOf(this.MediaBrowserCompatCustomActionResultReceiver);
        switch (this.RatingCompat) {
            case -1:
                Parcelable parcelable = this.MediaBrowserCompatItemReceiver;
                if (parcelable != null) {
                    this.write = parcelable;
                    return;
                }
                throw new IllegalArgumentException("Invalid icon");
            case 0:
            default:
                return;
            case 1:
            case 5:
                Parcelable parcelable2 = this.MediaBrowserCompatItemReceiver;
                if (parcelable2 != null) {
                    this.write = parcelable2;
                    return;
                }
                byte[] bArr = this.read;
                this.write = bArr;
                this.RatingCompat = 3;
                this.AudioAttributesCompatParcelizer = 0;
                this.RemoteActionCompatParcelizer = bArr.length;
                return;
            case 2:
            case 4:
            case 6:
                String str = new String(this.read, Charset.forName(CharsetNames.UTF_16));
                this.write = str;
                if (this.RatingCompat == 2 && this.AudioAttributesImplApi21Parcelizer == null) {
                    this.AudioAttributesImplApi21Parcelizer = str.split(":", -1)[0];
                    return;
                }
                return;
            case 3:
                this.write = this.read;
                return;
        }
    }

    private static String AudioAttributesCompatParcelizer(int i) {
        switch (i) {
            case 1:
                return "BITMAP";
            case 2:
                return "RESOURCE";
            case 3:
                return "DATA";
            case 4:
                return "URI";
            case 5:
                return "BITMAP_MASKABLE";
            case 6:
                return "URI_MASKABLE";
            default:
                return "UNKNOWN";
        }
    }

    public static IconCompat AudioAttributesCompatParcelizer(Bundle bundle) {
        int i = bundle.getInt("type");
        IconCompat iconCompat = new IconCompat(i);
        iconCompat.AudioAttributesCompatParcelizer = bundle.getInt("int1");
        iconCompat.RemoteActionCompatParcelizer = bundle.getInt("int2");
        iconCompat.AudioAttributesImplApi21Parcelizer = bundle.getString("string1");
        if (bundle.containsKey("tint_list")) {
            iconCompat.AudioAttributesImplApi26Parcelizer = (ColorStateList) bundle.getParcelable("tint_list");
        }
        if (bundle.containsKey("tint_mode")) {
            iconCompat.AudioAttributesImplBaseParcelizer = PorterDuff.Mode.valueOf(bundle.getString("tint_mode"));
        }
        switch (i) {
            case -1:
            case 1:
            case 5:
                iconCompat.write = bundle.getParcelable("obj");
                break;
            case 2:
            case 4:
            case 6:
                iconCompat.write = bundle.getString("obj");
                break;
            case 3:
                iconCompat.write = bundle.getByteArray("obj");
                break;
        }
        return iconCompat;
    }

    public static IconCompat RemoteActionCompatParcelizer(Icon icon) {
        return read.IconCompatParcelizer(icon);
    }

    public static IconCompat AudioAttributesCompatParcelizer(Icon icon) {
        if (read.RemoteActionCompatParcelizer(icon) == 2 && read.read(icon) == 0) {
            return null;
        }
        return read.IconCompatParcelizer(icon);
    }

    static Bitmap read(Bitmap bitmap, boolean z) {
        int iMin = (int) (Math.min(bitmap.getWidth(), bitmap.getHeight()) * 0.6666667f);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iMin, iMin, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint(3);
        float f = iMin;
        float f2 = 0.5f * f;
        float f3 = 0.9166667f * f2;
        if (z) {
            float f4 = 0.010416667f * f;
            paint.setColor(0);
            paint.setShadowLayer(f4, BitmapDescriptorFactory.HUE_RED, f * 0.020833334f, 1023410176);
            canvas.drawCircle(f2, f2, f3, paint);
            paint.setShadowLayer(f4, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 503316480);
            canvas.drawCircle(f2, f2, f3, paint);
            paint.clearShadowLayer();
        }
        paint.setColor(-16777216);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setTranslate((-(bitmap.getWidth() - iMin)) / 2.0f, (-(bitmap.getHeight() - iMin)) / 2.0f);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f2, f2, f3, paint);
        canvas.setBitmap(null);
        return bitmapCreateBitmap;
    }

    static class IconCompatParcelizer {
        static String write(Object obj) {
            return ((Icon) obj).getResPackage();
        }

        static int AudioAttributesCompatParcelizer(Object obj) {
            return ((Icon) obj).getType();
        }

        static int RemoteActionCompatParcelizer(Object obj) {
            return ((Icon) obj).getResId();
        }

        static Uri IconCompatParcelizer(Object obj) {
            return ((Icon) obj).getUri();
        }
    }

    static class RemoteActionCompatParcelizer {
        static Icon AudioAttributesCompatParcelizer(Bitmap bitmap) {
            return Icon.createWithAdaptiveBitmap(bitmap);
        }
    }

    static class AudioAttributesCompatParcelizer {
        static Icon RemoteActionCompatParcelizer(Uri uri) {
            return Icon.createWithAdaptiveBitmapContentUri(uri);
        }
    }

    static class read {
        static int RemoteActionCompatParcelizer(Object obj) {
            return IconCompatParcelizer.AudioAttributesCompatParcelizer(obj);
        }

        static String write(Object obj) {
            return IconCompatParcelizer.write(obj);
        }

        static IconCompat IconCompatParcelizer(Object obj) {
            int iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(obj);
            if (iRemoteActionCompatParcelizer == 2) {
                return IconCompat.RemoteActionCompatParcelizer(null, write(obj), read(obj));
            }
            if (iRemoteActionCompatParcelizer == 4) {
                return IconCompat.write(AudioAttributesCompatParcelizer(obj));
            }
            if (iRemoteActionCompatParcelizer == 6) {
                return IconCompat.read(AudioAttributesCompatParcelizer(obj));
            }
            IconCompat iconCompat = new IconCompat(-1);
            iconCompat.write = obj;
            return iconCompat;
        }

        static int read(Object obj) {
            return IconCompatParcelizer.RemoteActionCompatParcelizer(obj);
        }

        static Uri AudioAttributesCompatParcelizer(Object obj) {
            return IconCompatParcelizer.IconCompatParcelizer(obj);
        }

        static Icon write(IconCompat iconCompat, Context context) {
            Icon iconCreateWithBitmap;
            switch (iconCompat.RatingCompat) {
                case -1:
                    return (Icon) iconCompat.write;
                case 0:
                default:
                    throw new IllegalArgumentException("Unknown type");
                case 1:
                    iconCreateWithBitmap = Icon.createWithBitmap((Bitmap) iconCompat.write);
                    break;
                case 2:
                    iconCreateWithBitmap = Icon.createWithResource(iconCompat.RemoteActionCompatParcelizer(), iconCompat.AudioAttributesCompatParcelizer);
                    break;
                case 3:
                    iconCreateWithBitmap = Icon.createWithData((byte[]) iconCompat.write, iconCompat.AudioAttributesCompatParcelizer, iconCompat.RemoteActionCompatParcelizer);
                    break;
                case 4:
                    iconCreateWithBitmap = Icon.createWithContentUri((String) iconCompat.write);
                    break;
                case 5:
                    iconCreateWithBitmap = RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer((Bitmap) iconCompat.write);
                    break;
                case 6:
                    if (Build.VERSION.SDK_INT >= 30) {
                        iconCreateWithBitmap = AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(iconCompat.write());
                    } else {
                        if (context == null) {
                            StringBuilder sb = new StringBuilder("Context is required to resolve the file uri of the icon: ");
                            sb.append(iconCompat.write());
                            throw new IllegalArgumentException(sb.toString());
                        }
                        InputStream inputStreamWrite = iconCompat.write(context);
                        if (inputStreamWrite == null) {
                            StringBuilder sb2 = new StringBuilder("Cannot load adaptive icon from uri: ");
                            sb2.append(iconCompat.write());
                            throw new IllegalStateException(sb2.toString());
                        }
                        iconCreateWithBitmap = RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(BitmapFactory.decodeStream(inputStreamWrite));
                    }
                    break;
            }
            if (iconCompat.AudioAttributesImplApi26Parcelizer != null) {
                iconCreateWithBitmap.setTintList(iconCompat.AudioAttributesImplApi26Parcelizer);
            }
            if (iconCompat.AudioAttributesImplBaseParcelizer != IconCompat.IconCompatParcelizer) {
                iconCreateWithBitmap.setTintMode(iconCompat.AudioAttributesImplBaseParcelizer);
            }
            return iconCreateWithBitmap;
        }
    }
}
