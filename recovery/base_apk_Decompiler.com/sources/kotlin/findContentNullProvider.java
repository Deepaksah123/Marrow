package kotlin;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import com.marrow.data.models.ResponseError;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.StdScalarDeserializer;
import kotlin._parseInteger;

/* JADX INFO: loaded from: classes2.dex */
class findContentNullProvider {
    private ConcurrentHashMap<Long, _parseInteger.RemoteActionCompatParcelizer> RemoteActionCompatParcelizer = new ConcurrentHashMap<>();

    interface AudioAttributesCompatParcelizer<T> {
        boolean RemoteActionCompatParcelizer(T t);

        int read(T t);
    }

    findContentNullProvider() {
    }

    private static <T> T IconCompatParcelizer(T[] tArr, int i, AudioAttributesCompatParcelizer<T> audioAttributesCompatParcelizer) {
        return (T) write(tArr, (i & 1) == 0 ? ResponseError.NO_INTERNET_ERROR : 700, (i & 2) != 0, audioAttributesCompatParcelizer);
    }

    private static <T> T write(T[] tArr, int i, boolean z, AudioAttributesCompatParcelizer<T> audioAttributesCompatParcelizer) {
        T t = null;
        int i2 = Integer.MAX_VALUE;
        for (T t2 : tArr) {
            int iAbs = (Math.abs(audioAttributesCompatParcelizer.read(t2) - i) << 1) + (audioAttributesCompatParcelizer.RemoteActionCompatParcelizer(t2) == z ? 0 : 1);
            if (t == null || i2 > iAbs) {
                t = t2;
                i2 = iAbs;
            }
        }
        return t;
    }

    private static long write(Typeface typeface) {
        if (typeface == null) {
            return 0L;
        }
        try {
            Field declaredField = Typeface.class.getDeclaredField("native_instance");
            declaredField.setAccessible(true);
            return ((Number) declaredField.get(typeface)).longValue();
        } catch (IllegalAccessException | NoSuchFieldException unused) {
            return 0L;
        }
    }

    protected StdScalarDeserializer.AudioAttributesCompatParcelizer RemoteActionCompatParcelizer(StdScalarDeserializer.AudioAttributesCompatParcelizer[] audioAttributesCompatParcelizerArr, int i) {
        return (StdScalarDeserializer.AudioAttributesCompatParcelizer) IconCompatParcelizer(audioAttributesCompatParcelizerArr, i, new AudioAttributesCompatParcelizer<StdScalarDeserializer.AudioAttributesCompatParcelizer>() { // from class: o.findContentNullProvider.5
            @Override // o.findContentNullProvider.AudioAttributesCompatParcelizer
            public int read(StdScalarDeserializer.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
                return audioAttributesCompatParcelizer.read();
            }

            @Override // o.findContentNullProvider.AudioAttributesCompatParcelizer
            /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
            public boolean RemoteActionCompatParcelizer(StdScalarDeserializer.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
                return audioAttributesCompatParcelizer.AudioAttributesCompatParcelizer();
            }
        });
    }

    protected Typeface AudioAttributesCompatParcelizer(Context context, InputStream inputStream) {
        File fileRemoteActionCompatParcelizer = _verifyStringForScalarCoercion.RemoteActionCompatParcelizer(context);
        if (fileRemoteActionCompatParcelizer == null) {
            return null;
        }
        try {
            if (_verifyStringForScalarCoercion.read(fileRemoteActionCompatParcelizer, inputStream)) {
                return Typeface.createFromFile(fileRemoteActionCompatParcelizer.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            fileRemoteActionCompatParcelizer.delete();
        }
    }

    public Typeface read(Context context, CancellationSignal cancellationSignal, StdScalarDeserializer.AudioAttributesCompatParcelizer[] audioAttributesCompatParcelizerArr, int i) throws Throwable {
        InputStream inputStreamOpenInputStream;
        InputStream inputStream = null;
        if (audioAttributesCompatParcelizerArr.length <= 0) {
            return null;
        }
        try {
            inputStreamOpenInputStream = context.getContentResolver().openInputStream(RemoteActionCompatParcelizer(audioAttributesCompatParcelizerArr, i).IconCompatParcelizer());
        } catch (IOException unused) {
            inputStreamOpenInputStream = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            Typeface typefaceAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(context, inputStreamOpenInputStream);
            _verifyStringForScalarCoercion.RemoteActionCompatParcelizer(inputStreamOpenInputStream);
            return typefaceAudioAttributesCompatParcelizer;
        } catch (IOException unused2) {
            _verifyStringForScalarCoercion.RemoteActionCompatParcelizer(inputStreamOpenInputStream);
            return null;
        } catch (Throwable th2) {
            th = th2;
            inputStream = inputStreamOpenInputStream;
            _verifyStringForScalarCoercion.RemoteActionCompatParcelizer(inputStream);
            throw th;
        }
    }

    public Typeface read(Context context, CancellationSignal cancellationSignal, List<StdScalarDeserializer.AudioAttributesCompatParcelizer[]> list, int i) {
        throw new IllegalStateException("createFromFontInfoWithFallback must only be called on API 29+");
    }

    private _parseInteger.read write(_parseInteger.RemoteActionCompatParcelizer remoteActionCompatParcelizer, int i) {
        return (_parseInteger.read) IconCompatParcelizer(remoteActionCompatParcelizer.AudioAttributesCompatParcelizer(), i, new AudioAttributesCompatParcelizer<_parseInteger.read>() { // from class: o.findContentNullProvider.2
            @Override // o.findContentNullProvider.AudioAttributesCompatParcelizer
            /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public int read(_parseInteger.read readVar) {
                return readVar.IconCompatParcelizer();
            }

            @Override // o.findContentNullProvider.AudioAttributesCompatParcelizer
            /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
            public boolean RemoteActionCompatParcelizer(_parseInteger.read readVar) {
                return readVar.AudioAttributesImplApi26Parcelizer();
            }
        });
    }

    public Typeface RemoteActionCompatParcelizer(Context context, _parseInteger.RemoteActionCompatParcelizer remoteActionCompatParcelizer, Resources resources, int i) {
        _parseInteger.read readVarWrite = write(remoteActionCompatParcelizer, i);
        if (readVarWrite == null) {
            return null;
        }
        Typeface typefaceWrite = findConvertingContentDeserializer.write(context, resources, readVarWrite.AudioAttributesCompatParcelizer(), readVarWrite.write(), 0, i);
        AudioAttributesCompatParcelizer(typefaceWrite, remoteActionCompatParcelizer);
        return typefaceWrite;
    }

    public Typeface RemoteActionCompatParcelizer(Context context, Resources resources, int i, String str, int i2) {
        File fileRemoteActionCompatParcelizer = _verifyStringForScalarCoercion.RemoteActionCompatParcelizer(context);
        if (fileRemoteActionCompatParcelizer == null) {
            return null;
        }
        try {
            if (_verifyStringForScalarCoercion.RemoteActionCompatParcelizer(fileRemoteActionCompatParcelizer, resources, i)) {
                return Typeface.createFromFile(fileRemoteActionCompatParcelizer.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            fileRemoteActionCompatParcelizer.delete();
        }
    }

    private void AudioAttributesCompatParcelizer(Typeface typeface, _parseInteger.RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        long jWrite = write(typeface);
        if (jWrite != 0) {
            this.RemoteActionCompatParcelizer.put(Long.valueOf(jWrite), remoteActionCompatParcelizer);
        }
    }
}
