package kotlin;

import android.app.Application;
import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class isRendererEnabled {
    private static final Object AudioAttributesCompatParcelizer = new Object();
    private ExoPlayerImplExternalSyntheticLambda12 IconCompatParcelizer;
    private final Map<String, onAudioDisabled> RemoteActionCompatParcelizer;
    private final Context read;
    private final String write;

    public isRendererEnabled(Drawable.Callback callback, String str, ExoPlayerImplExternalSyntheticLambda12 exoPlayerImplExternalSyntheticLambda12, Map<String, onAudioDisabled> map) {
        if (!TextUtils.isEmpty(str) && str.charAt(str.length() - 1) != '/') {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append('/');
            this.write = sb.toString();
        } else {
            this.write = str;
        }
        this.RemoteActionCompatParcelizer = map;
        read(exoPlayerImplExternalSyntheticLambda12);
        if (!(callback instanceof View)) {
            this.read = null;
        } else {
            this.read = ((View) callback).getContext().getApplicationContext();
        }
    }

    public final void read(ExoPlayerImplExternalSyntheticLambda12 exoPlayerImplExternalSyntheticLambda12) {
        this.IconCompatParcelizer = exoPlayerImplExternalSyntheticLambda12;
    }

    public final Bitmap IconCompatParcelizer(String str) {
        onAudioDisabled onaudiodisabled = this.RemoteActionCompatParcelizer.get(str);
        if (onaudiodisabled == null) {
            return null;
        }
        Bitmap bitmapAudioAttributesCompatParcelizer = onaudiodisabled.AudioAttributesCompatParcelizer();
        if (bitmapAudioAttributesCompatParcelizer != null) {
            return bitmapAudioAttributesCompatParcelizer;
        }
        ExoPlayerImplExternalSyntheticLambda12 exoPlayerImplExternalSyntheticLambda12 = this.IconCompatParcelizer;
        if (exoPlayerImplExternalSyntheticLambda12 != null) {
            Bitmap bitmapIconCompatParcelizer = exoPlayerImplExternalSyntheticLambda12.IconCompatParcelizer();
            if (bitmapIconCompatParcelizer != null) {
                RemoteActionCompatParcelizer(str, bitmapIconCompatParcelizer);
            }
            return bitmapIconCompatParcelizer;
        }
        Context context = this.read;
        if (context == null) {
            return null;
        }
        String strWrite = onaudiodisabled.write();
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inScaled = true;
        options.inDensity = 160;
        if (strWrite.startsWith("data:") && strWrite.indexOf("base64,") > 0) {
            try {
                byte[] bArrDecode = Base64.decode(strWrite.substring(strWrite.indexOf(44) + 1), 0);
                try {
                    Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length, options);
                    if (bitmapDecodeByteArray == null) {
                        StringBuilder sb = new StringBuilder("Decoded image `");
                        sb.append(str);
                        sb.append("` is null.");
                        access3000.AudioAttributesCompatParcelizer(sb.toString());
                        return null;
                    }
                    return RemoteActionCompatParcelizer(str, setEncoderPadding.read(bitmapDecodeByteArray, onaudiodisabled.RemoteActionCompatParcelizer(), onaudiodisabled.read()));
                } catch (IllegalArgumentException e) {
                    StringBuilder sb2 = new StringBuilder("Unable to decode image `");
                    sb2.append(str);
                    sb2.append("`.");
                    access3000.IconCompatParcelizer(sb2.toString(), e);
                    return null;
                }
            } catch (IllegalArgumentException e2) {
                access3000.IconCompatParcelizer("data URL did not have correct base64 format.", e2);
                return null;
            }
        }
        try {
            if (TextUtils.isEmpty(this.write)) {
                throw new IllegalStateException("You must set an images folder before loading an image. Set it with LottieComposition#setImagesFolder or LottieDrawable#setImagesFolder");
            }
            AssetManager assets = context.getAssets();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(this.write);
            sb3.append(strWrite);
            try {
                Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(assets.open(sb3.toString()), null, options);
                if (bitmapDecodeStream == null) {
                    StringBuilder sb4 = new StringBuilder("Decoded image `");
                    sb4.append(str);
                    sb4.append("` is null.");
                    access3000.AudioAttributesCompatParcelizer(sb4.toString());
                    return null;
                }
                return RemoteActionCompatParcelizer(str, setEncoderPadding.read(bitmapDecodeStream, onaudiodisabled.RemoteActionCompatParcelizer(), onaudiodisabled.read()));
            } catch (IllegalArgumentException e3) {
                StringBuilder sb5 = new StringBuilder("Unable to decode image `");
                sb5.append(str);
                sb5.append("`.");
                access3000.IconCompatParcelizer(sb5.toString(), e3);
                return null;
            }
        } catch (IOException e4) {
            access3000.IconCompatParcelizer("Unable to open asset.", e4);
            return null;
        }
    }

    public final boolean write(Context context) {
        if (context == null) {
            return this.read == null;
        }
        if (this.read instanceof Application) {
            context = context.getApplicationContext();
        }
        return context == this.read;
    }

    private Bitmap RemoteActionCompatParcelizer(String str, Bitmap bitmap) {
        synchronized (AudioAttributesCompatParcelizer) {
            this.RemoteActionCompatParcelizer.get(str).IconCompatParcelizer(bitmap);
        }
        return bitmap;
    }
}
