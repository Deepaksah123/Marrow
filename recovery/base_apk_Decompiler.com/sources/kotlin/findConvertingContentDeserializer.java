package kotlin;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.os.Handler;
import java.util.List;
import kotlin.StdScalarDeserializer;
import kotlin._parseDoublePrimitive;
import kotlin._parseInteger;

/* JADX INFO: loaded from: classes2.dex */
public class findConvertingContentDeserializer {
    private static final ActionMenuViewLayoutParams<String, Typeface> AudioAttributesCompatParcelizer;
    private static final findContentNullProvider write;

    static {
        MarkerView.AudioAttributesCompatParcelizer("TypefaceCompat static init");
        write = new findContentNullStyle();
        AudioAttributesCompatParcelizer = new ActionMenuViewLayoutParams<>(16);
        MarkerView.RemoteActionCompatParcelizer();
    }

    public static Typeface RemoteActionCompatParcelizer(Resources resources, int i, String str, int i2, int i3) {
        return AudioAttributesCompatParcelizer.get(read(resources, i, str, i2, i3));
    }

    private static String read(Resources resources, int i, String str, int i2, int i3) {
        StringBuilder sb = new StringBuilder();
        sb.append(resources.getResourcePackageName(i));
        sb.append('-');
        sb.append(str);
        sb.append('-');
        sb.append(i2);
        sb.append('-');
        sb.append(i);
        sb.append('-');
        sb.append(i3);
        return sb.toString();
    }

    private static Typeface RemoteActionCompatParcelizer(String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        Typeface typefaceCreate = Typeface.create(str, 0);
        Typeface typefaceCreate2 = Typeface.create(Typeface.DEFAULT, 0);
        if (typefaceCreate == null || typefaceCreate.equals(typefaceCreate2)) {
            return null;
        }
        return typefaceCreate;
    }

    public static Typeface AudioAttributesCompatParcelizer(Context context, _parseInteger.write writeVar, Resources resources, int i, String str, int i2, int i3, _parseDoublePrimitive.IconCompatParcelizer iconCompatParcelizer, Handler handler, boolean z) {
        Typeface typefaceRemoteActionCompatParcelizer;
        if (writeVar instanceof _parseInteger.AudioAttributesCompatParcelizer) {
            _parseInteger.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = (_parseInteger.AudioAttributesCompatParcelizer) writeVar;
            Typeface typefaceRemoteActionCompatParcelizer2 = RemoteActionCompatParcelizer(audioAttributesCompatParcelizer.IconCompatParcelizer());
            if (typefaceRemoteActionCompatParcelizer2 != null) {
                if (iconCompatParcelizer != null) {
                    iconCompatParcelizer.AudioAttributesCompatParcelizer(typefaceRemoteActionCompatParcelizer2, handler);
                }
                return typefaceRemoteActionCompatParcelizer2;
            }
            typefaceRemoteActionCompatParcelizer = StdScalarDeserializer.read(context, audioAttributesCompatParcelizer.read() != null ? findFormatFeature.RemoteActionCompatParcelizer(new Object[]{audioAttributesCompatParcelizer.RemoteActionCompatParcelizer(), audioAttributesCompatParcelizer.read()}) : findFormatFeature.RemoteActionCompatParcelizer(new Object[]{audioAttributesCompatParcelizer.RemoteActionCompatParcelizer()}), i3, !z ? iconCompatParcelizer != null : audioAttributesCompatParcelizer.AudioAttributesCompatParcelizer() != 0, z ? audioAttributesCompatParcelizer.write() : -1, _parseDoublePrimitive.IconCompatParcelizer.AudioAttributesCompatParcelizer(handler), new RemoteActionCompatParcelizer(iconCompatParcelizer));
        } else {
            typefaceRemoteActionCompatParcelizer = write.RemoteActionCompatParcelizer(context, (_parseInteger.RemoteActionCompatParcelizer) writeVar, resources, i3);
            if (iconCompatParcelizer != null) {
                if (typefaceRemoteActionCompatParcelizer != null) {
                    iconCompatParcelizer.AudioAttributesCompatParcelizer(typefaceRemoteActionCompatParcelizer, handler);
                } else {
                    iconCompatParcelizer.IconCompatParcelizer(-3, handler);
                }
            }
        }
        if (typefaceRemoteActionCompatParcelizer != null) {
            AudioAttributesCompatParcelizer.put(read(resources, i, str, i2, i3), typefaceRemoteActionCompatParcelizer);
        }
        return typefaceRemoteActionCompatParcelizer;
    }

    public static Typeface write(Context context, Resources resources, int i, String str, int i2, int i3) {
        Typeface typefaceRemoteActionCompatParcelizer = write.RemoteActionCompatParcelizer(context, resources, i, str, i3);
        if (typefaceRemoteActionCompatParcelizer != null) {
            AudioAttributesCompatParcelizer.put(read(resources, i, str, i2, i3), typefaceRemoteActionCompatParcelizer);
        }
        return typefaceRemoteActionCompatParcelizer;
    }

    public static Typeface AudioAttributesCompatParcelizer(Context context, CancellationSignal cancellationSignal, StdScalarDeserializer.AudioAttributesCompatParcelizer[] audioAttributesCompatParcelizerArr, int i) {
        MarkerView.AudioAttributesCompatParcelizer("TypefaceCompat.createFromFontInfo");
        try {
            return write.read(context, cancellationSignal, audioAttributesCompatParcelizerArr, i);
        } finally {
            MarkerView.RemoteActionCompatParcelizer();
        }
    }

    public static Typeface write(Context context, CancellationSignal cancellationSignal, List<StdScalarDeserializer.AudioAttributesCompatParcelizer[]> list, int i) {
        MarkerView.AudioAttributesCompatParcelizer("TypefaceCompat.createFromFontInfoWithFallback");
        try {
            return write.read(context, cancellationSignal, list, i);
        } finally {
            MarkerView.RemoteActionCompatParcelizer();
        }
    }

    public static Typeface read(Context context, Typeface typeface, int i) {
        if (context == null) {
            throw new IllegalArgumentException("Context cannot be null");
        }
        return Typeface.create(typeface, i);
    }

    public static class RemoteActionCompatParcelizer extends StdScalarDeserializer.write {
        private _parseDoublePrimitive.IconCompatParcelizer RemoteActionCompatParcelizer;

        public RemoteActionCompatParcelizer(_parseDoublePrimitive.IconCompatParcelizer iconCompatParcelizer) {
            this.RemoteActionCompatParcelizer = iconCompatParcelizer;
        }

        @Override // o.StdScalarDeserializer.write
        public void read(Typeface typeface) {
            _parseDoublePrimitive.IconCompatParcelizer iconCompatParcelizer = this.RemoteActionCompatParcelizer;
            if (iconCompatParcelizer != null) {
                iconCompatParcelizer.RemoteActionCompatParcelizer(typeface);
            }
        }

        @Override // o.StdScalarDeserializer.write
        public void AudioAttributesCompatParcelizer(int i) {
            _parseDoublePrimitive.IconCompatParcelizer iconCompatParcelizer = this.RemoteActionCompatParcelizer;
            if (iconCompatParcelizer != null) {
                iconCompatParcelizer.IconCompatParcelizer(i);
            }
        }
    }
}
