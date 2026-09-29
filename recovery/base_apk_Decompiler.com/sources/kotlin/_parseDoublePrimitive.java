package kotlin;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import android.util.TypedValue;
import java.io.IOException;
import java.util.WeakHashMap;
import kotlin._parseInteger;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes2.dex */
public final class _parseDoublePrimitive {
    private static final ThreadLocal<TypedValue> IconCompatParcelizer = new ThreadLocal<>();
    private static final WeakHashMap<write, SparseArray<RemoteActionCompatParcelizer>> RemoteActionCompatParcelizer = new WeakHashMap<>(0);
    private static final Object read = new Object();

    public static Drawable read(Resources resources, int i, Resources.Theme theme) throws Resources.NotFoundException {
        return read.IconCompatParcelizer(resources, i, theme);
    }

    public static int RemoteActionCompatParcelizer(Resources resources, int i, Resources.Theme theme) throws Resources.NotFoundException {
        return AudioAttributesCompatParcelizer.read(resources, i, theme);
    }

    public static ColorStateList write(Resources resources, int i, Resources.Theme theme) throws Resources.NotFoundException {
        write writeVar = new write(resources, theme);
        ColorStateList colorStateListIconCompatParcelizer = IconCompatParcelizer(writeVar, i);
        if (colorStateListIconCompatParcelizer != null) {
            return colorStateListIconCompatParcelizer;
        }
        ColorStateList colorStateListAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(resources, i, theme);
        if (colorStateListAudioAttributesCompatParcelizer != null) {
            write(writeVar, i, colorStateListAudioAttributesCompatParcelizer, theme);
            return colorStateListAudioAttributesCompatParcelizer;
        }
        return AudioAttributesCompatParcelizer.write(resources, i, theme);
    }

    private static ColorStateList AudioAttributesCompatParcelizer(Resources resources, int i, Resources.Theme theme) {
        if (read(resources, i)) {
            return null;
        }
        try {
            return _parseBytePrimitive.read(resources, resources.getXml(i), theme);
        } catch (Exception unused) {
            return null;
        }
    }

    private static ColorStateList IconCompatParcelizer(write writeVar, int i) {
        RemoteActionCompatParcelizer remoteActionCompatParcelizer;
        synchronized (read) {
            SparseArray<RemoteActionCompatParcelizer> sparseArray = RemoteActionCompatParcelizer.get(writeVar);
            if (sparseArray != null && sparseArray.size() > 0 && (remoteActionCompatParcelizer = sparseArray.get(i)) != null) {
                if (remoteActionCompatParcelizer.RemoteActionCompatParcelizer.equals(writeVar.IconCompatParcelizer.getConfiguration()) && ((writeVar.write == null && remoteActionCompatParcelizer.IconCompatParcelizer == 0) || (writeVar.write != null && remoteActionCompatParcelizer.IconCompatParcelizer == writeVar.write.hashCode()))) {
                    return remoteActionCompatParcelizer.read;
                }
                sparseArray.remove(i);
            }
            return null;
        }
    }

    private static void write(write writeVar, int i, ColorStateList colorStateList, Resources.Theme theme) {
        synchronized (read) {
            WeakHashMap<write, SparseArray<RemoteActionCompatParcelizer>> weakHashMap = RemoteActionCompatParcelizer;
            SparseArray<RemoteActionCompatParcelizer> sparseArray = weakHashMap.get(writeVar);
            if (sparseArray == null) {
                sparseArray = new SparseArray<>();
                weakHashMap.put(writeVar, sparseArray);
            }
            sparseArray.append(i, new RemoteActionCompatParcelizer(colorStateList, writeVar.IconCompatParcelizer.getConfiguration(), theme));
        }
    }

    private static boolean read(Resources resources, int i) {
        TypedValue typedValueAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer();
        resources.getValue(i, typedValueAudioAttributesCompatParcelizer, true);
        return typedValueAudioAttributesCompatParcelizer.type >= 28 && typedValueAudioAttributesCompatParcelizer.type <= 31;
    }

    private static TypedValue AudioAttributesCompatParcelizer() {
        ThreadLocal<TypedValue> threadLocal = IconCompatParcelizer;
        TypedValue typedValue = threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }

    static final class write {
        final Resources IconCompatParcelizer;
        final Resources.Theme write;

        write(Resources resources, Resources.Theme theme) {
            this.IconCompatParcelizer = resources;
            this.write = theme;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            write writeVar = (write) obj;
            return this.IconCompatParcelizer.equals(writeVar.IconCompatParcelizer) && configureFromStringCreator.RemoteActionCompatParcelizer(this.write, writeVar.write);
        }

        public final int hashCode() {
            return configureFromStringCreator.RemoteActionCompatParcelizer(this.IconCompatParcelizer, this.write);
        }
    }

    static class RemoteActionCompatParcelizer {
        final int IconCompatParcelizer;
        final Configuration RemoteActionCompatParcelizer;
        final ColorStateList read;

        RemoteActionCompatParcelizer(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
            this.read = colorStateList;
            this.RemoteActionCompatParcelizer = configuration;
            this.IconCompatParcelizer = theme == null ? 0 : theme.hashCode();
        }
    }

    public static Typeface IconCompatParcelizer(Context context, int i) throws Resources.NotFoundException {
        if (context.isRestricted()) {
            return null;
        }
        return IconCompatParcelizer(context, i, new TypedValue(), 0, null, null, false, false);
    }

    public static Typeface RemoteActionCompatParcelizer(Context context, int i) throws Resources.NotFoundException {
        if (context.isRestricted()) {
            return null;
        }
        return IconCompatParcelizer(context, i, new TypedValue(), 0, null, null, false, true);
    }

    public static abstract class IconCompatParcelizer {
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public abstract void IconCompatParcelizer(int i);

        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public abstract void RemoteActionCompatParcelizer(Typeface typeface);

        public final void AudioAttributesCompatParcelizer(final Typeface typeface, Handler handler) {
            AudioAttributesCompatParcelizer(handler).post(new Runnable() { // from class: o._parseShortPrimitive
                @Override // java.lang.Runnable
                public final void run() {
                    this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(typeface);
                }
            });
        }

        public final void IconCompatParcelizer(final int i, Handler handler) {
            AudioAttributesCompatParcelizer(handler).post(new Runnable() { // from class: o._reportFailedNullCoerce
                @Override // java.lang.Runnable
                public final void run() {
                    this.AudioAttributesCompatParcelizer.IconCompatParcelizer(i);
                }
            });
        }

        public static Handler AudioAttributesCompatParcelizer(Handler handler) {
            return handler == null ? new Handler(Looper.getMainLooper()) : handler;
        }
    }

    public static void read(Context context, int i, IconCompatParcelizer iconCompatParcelizer, Handler handler) throws Resources.NotFoundException {
        if (context.isRestricted()) {
            iconCompatParcelizer.IconCompatParcelizer(-4, handler);
        } else {
            IconCompatParcelizer(context, i, new TypedValue(), 0, iconCompatParcelizer, handler, false, false);
        }
    }

    public static Typeface read(Context context, int i, TypedValue typedValue, int i2, IconCompatParcelizer iconCompatParcelizer) throws Resources.NotFoundException {
        if (context.isRestricted()) {
            return null;
        }
        return IconCompatParcelizer(context, i, typedValue, i2, iconCompatParcelizer, null, true, false);
    }

    private static Typeface IconCompatParcelizer(Context context, int i, TypedValue typedValue, int i2, IconCompatParcelizer iconCompatParcelizer, Handler handler, boolean z, boolean z2) {
        Resources resources = context.getResources();
        resources.getValue(i, typedValue, true);
        Typeface typefaceRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(context, resources, typedValue, i, i2, iconCompatParcelizer, handler, z, z2);
        if (typefaceRemoteActionCompatParcelizer != null || iconCompatParcelizer != null || z2) {
            return typefaceRemoteActionCompatParcelizer;
        }
        StringBuilder sb = new StringBuilder("Font resource ID #0x");
        sb.append(Integer.toHexString(i));
        sb.append(" could not be retrieved.");
        throw new Resources.NotFoundException(sb.toString());
    }

    private static Typeface RemoteActionCompatParcelizer(Context context, Resources resources, TypedValue typedValue, int i, int i2, IconCompatParcelizer iconCompatParcelizer, Handler handler, boolean z, boolean z2) {
        if (typedValue.string == null) {
            StringBuilder sb = new StringBuilder("Resource \"");
            sb.append(resources.getResourceName(i));
            sb.append("\" (");
            sb.append(Integer.toHexString(i));
            sb.append(") is not a Font: ");
            sb.append(typedValue);
            throw new Resources.NotFoundException(sb.toString());
        }
        String string = typedValue.string.toString();
        if (!string.startsWith("res/")) {
            if (iconCompatParcelizer != null) {
                iconCompatParcelizer.IconCompatParcelizer(-3, handler);
            }
            return null;
        }
        Typeface typefaceRemoteActionCompatParcelizer = findConvertingContentDeserializer.RemoteActionCompatParcelizer(resources, i, string, typedValue.assetCookie, i2);
        if (typefaceRemoteActionCompatParcelizer != null) {
            if (iconCompatParcelizer != null) {
                iconCompatParcelizer.AudioAttributesCompatParcelizer(typefaceRemoteActionCompatParcelizer, handler);
            }
            return typefaceRemoteActionCompatParcelizer;
        }
        if (z2) {
            return null;
        }
        try {
            if (string.toLowerCase().endsWith(".xml")) {
                _parseInteger.write writeVarWrite = _parseInteger.write(resources.getXml(i), resources);
                if (writeVarWrite != null) {
                    return findConvertingContentDeserializer.AudioAttributesCompatParcelizer(context, writeVarWrite, resources, i, string, typedValue.assetCookie, i2, iconCompatParcelizer, handler, z);
                }
                if (iconCompatParcelizer != null) {
                    iconCompatParcelizer.IconCompatParcelizer(-3, handler);
                }
                return null;
            }
            Typeface typefaceWrite = findConvertingContentDeserializer.write(context, resources, i, string, typedValue.assetCookie, i2);
            if (iconCompatParcelizer != null) {
                if (typefaceWrite != null) {
                    iconCompatParcelizer.AudioAttributesCompatParcelizer(typefaceWrite, handler);
                    return typefaceWrite;
                }
                iconCompatParcelizer.IconCompatParcelizer(-3, handler);
            }
            return typefaceWrite;
        } catch (IOException | XmlPullParserException unused) {
            if (iconCompatParcelizer != null) {
                iconCompatParcelizer.IconCompatParcelizer(-3, handler);
            }
            return null;
        }
    }

    static class AudioAttributesCompatParcelizer {
        static ColorStateList write(Resources resources, int i, Resources.Theme theme) {
            return resources.getColorStateList(i, theme);
        }

        static int read(Resources resources, int i, Resources.Theme theme) {
            return resources.getColor(i, theme);
        }
    }

    static class read {
        static Drawable IconCompatParcelizer(Resources resources, int i, Resources.Theme theme) {
            return resources.getDrawable(i, theme);
        }
    }

    public static final class MediaBrowserCompatCustomActionResultReceiver {
        public static void AudioAttributesCompatParcelizer(Resources.Theme theme) {
            write.AudioAttributesCompatParcelizer(theme);
        }

        static class write {
            static void AudioAttributesCompatParcelizer(Resources.Theme theme) {
                theme.rebase();
            }
        }
    }
}
