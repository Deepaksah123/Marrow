package kotlin;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.util.Base64;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.GZIPInputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes2.dex */
public final class ExoPlayerImplExternalSyntheticLambda21 {
    private static final Map<String, onCues<ExoPlayerImplExternalSyntheticLambda19>> AudioAttributesCompatParcelizer = new HashMap();
    private static final Set<onMetadata> read = new HashSet();
    private static final byte[] IconCompatParcelizer = {80, TarConstants.LF_GNUTYPE_LONGLINK, 3, 4};
    private static final byte[] write = {31, -117, 8};

    public static onCues<ExoPlayerImplExternalSyntheticLambda19> IconCompatParcelizer(Context context, String str) {
        return AudioAttributesCompatParcelizer(context, str, "url_".concat(String.valueOf(str)));
    }

    public static onCues<ExoPlayerImplExternalSyntheticLambda19> AudioAttributesCompatParcelizer(final Context context, final String str, final String str2) {
        return read(str2, (Callable<onDroppedFrames<ExoPlayerImplExternalSyntheticLambda19>>) new Callable() { // from class: o.ExoPlayerImplExternalSyntheticLambda20
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return ExoPlayerImplExternalSyntheticLambda21.RemoteActionCompatParcelizer(context, str, str2);
            }
        }, (Runnable) null);
    }

    static /* synthetic */ onDroppedFrames RemoteActionCompatParcelizer(Context context, String str, String str2) throws Exception {
        onDroppedFrames<ExoPlayerImplExternalSyntheticLambda19> ondroppedframes = ExoPlayerImplExternalSyntheticLambda18.RemoteActionCompatParcelizer(context).read(context, str, str2);
        if (str2 != null && ondroppedframes.IconCompatParcelizer() != null) {
            maybeUpdatePlayingPeriod.read().IconCompatParcelizer(str2, ondroppedframes.IconCompatParcelizer());
        }
        return ondroppedframes;
    }

    public static onCues<ExoPlayerImplExternalSyntheticLambda19> AudioAttributesCompatParcelizer(Context context, String str) {
        return IconCompatParcelizer(context, str, "asset_".concat(String.valueOf(str)));
    }

    public static onCues<ExoPlayerImplExternalSyntheticLambda19> IconCompatParcelizer(Context context, final String str, final String str2) {
        final Context applicationContext = context.getApplicationContext();
        return read(str2, (Callable<onDroppedFrames<ExoPlayerImplExternalSyntheticLambda19>>) new Callable() { // from class: o.ExoPlayerImplExternalSyntheticLambda24
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return ExoPlayerImplExternalSyntheticLambda21.read(applicationContext, str, str2);
            }
        }, (Runnable) null);
    }

    public static onDroppedFrames<ExoPlayerImplExternalSyntheticLambda19> read(Context context, String str) {
        return read(context, str, "asset_".concat(String.valueOf(str)));
    }

    public static onDroppedFrames<ExoPlayerImplExternalSyntheticLambda19> read(Context context, String str, String str2) {
        ExoPlayerImplExternalSyntheticLambda19 exoPlayerImplExternalSyntheticLambda19AudioAttributesCompatParcelizer = str2 == null ? null : maybeUpdatePlayingPeriod.read().AudioAttributesCompatParcelizer(str2);
        if (exoPlayerImplExternalSyntheticLambda19AudioAttributesCompatParcelizer != null) {
            return new onDroppedFrames<>(exoPlayerImplExternalSyntheticLambda19AudioAttributesCompatParcelizer);
        }
        try {
            return IconCompatParcelizer(context, context.getAssets().open(str), str2);
        } catch (IOException e) {
            return new onDroppedFrames<>((Throwable) e);
        }
    }

    public static onCues<ExoPlayerImplExternalSyntheticLambda19> RemoteActionCompatParcelizer(Context context, final InputStream inputStream, final String str) {
        final Context applicationContext = context == null ? null : context.getApplicationContext();
        return read(str, (Callable<onDroppedFrames<ExoPlayerImplExternalSyntheticLambda19>>) new Callable() { // from class: o.ExoPlayerImplExternalSyntheticLambda2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return ExoPlayerImplExternalSyntheticLambda21.IconCompatParcelizer(applicationContext, inputStream, str);
            }
        }, (Runnable) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static onDroppedFrames<ExoPlayerImplExternalSyntheticLambda19> IconCompatParcelizer(Context context, InputStream inputStream, String str) {
        ExoPlayerImplExternalSyntheticLambda19 exoPlayerImplExternalSyntheticLambda19AudioAttributesCompatParcelizer = str == null ? null : maybeUpdatePlayingPeriod.read().AudioAttributesCompatParcelizer(str);
        if (exoPlayerImplExternalSyntheticLambda19AudioAttributesCompatParcelizer != null) {
            return new onDroppedFrames<>(exoPlayerImplExternalSyntheticLambda19AudioAttributesCompatParcelizer);
        }
        try {
            LessonCompletedDialog lessonCompletedDialogAudioAttributesCompatParcelizer = CustomAppBarLayout.AudioAttributesCompatParcelizer(CustomAppBarLayout.AudioAttributesCompatParcelizer(inputStream));
            if (RemoteActionCompatParcelizer(lessonCompletedDialogAudioAttributesCompatParcelizer).booleanValue()) {
                return read(context, new ZipInputStream(lessonCompletedDialogAudioAttributesCompatParcelizer.AudioAttributesImplBaseParcelizer()), str);
            }
            if (read(lessonCompletedDialogAudioAttributesCompatParcelizer).booleanValue()) {
                return write(new GZIPInputStream(lessonCompletedDialogAudioAttributesCompatParcelizer.AudioAttributesImplBaseParcelizer()), str);
            }
            return write(Format1.read(lessonCompletedDialogAudioAttributesCompatParcelizer), str);
        } catch (IOException e) {
            return new onDroppedFrames<>((Throwable) e);
        }
    }

    public static onCues<ExoPlayerImplExternalSyntheticLambda19> IconCompatParcelizer(Context context, int i) {
        return IconCompatParcelizer(context, i, RemoteActionCompatParcelizer(context, i));
    }

    public static onCues<ExoPlayerImplExternalSyntheticLambda19> IconCompatParcelizer(Context context, final int i, final String str) {
        final WeakReference weakReference = new WeakReference(context);
        final Context applicationContext = context.getApplicationContext();
        return read(str, (Callable<onDroppedFrames<ExoPlayerImplExternalSyntheticLambda19>>) new Callable() { // from class: o.ExoPlayerImplExternalSyntheticLambda22
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return ExoPlayerImplExternalSyntheticLambda21.read(weakReference, applicationContext, i, str);
            }
        }, (Runnable) null);
    }

    static /* synthetic */ onDroppedFrames read(WeakReference weakReference, Context context, int i, String str) throws Exception {
        Context context2 = (Context) weakReference.get();
        if (context2 != null) {
            context = context2;
        }
        return AudioAttributesCompatParcelizer(context, i, str);
    }

    public static onDroppedFrames<ExoPlayerImplExternalSyntheticLambda19> AudioAttributesCompatParcelizer(Context context, int i) {
        return AudioAttributesCompatParcelizer(context, i, RemoteActionCompatParcelizer(context, i));
    }

    public static onDroppedFrames<ExoPlayerImplExternalSyntheticLambda19> AudioAttributesCompatParcelizer(Context context, int i, String str) {
        ExoPlayerImplExternalSyntheticLambda19 exoPlayerImplExternalSyntheticLambda19AudioAttributesCompatParcelizer = str == null ? null : maybeUpdatePlayingPeriod.read().AudioAttributesCompatParcelizer(str);
        if (exoPlayerImplExternalSyntheticLambda19AudioAttributesCompatParcelizer != null) {
            return new onDroppedFrames<>(exoPlayerImplExternalSyntheticLambda19AudioAttributesCompatParcelizer);
        }
        try {
            LessonCompletedDialog lessonCompletedDialogAudioAttributesCompatParcelizer = CustomAppBarLayout.AudioAttributesCompatParcelizer(CustomAppBarLayout.AudioAttributesCompatParcelizer(context.getResources().openRawResource(i)));
            if (RemoteActionCompatParcelizer(lessonCompletedDialogAudioAttributesCompatParcelizer).booleanValue()) {
                return read(context, new ZipInputStream(lessonCompletedDialogAudioAttributesCompatParcelizer.AudioAttributesImplBaseParcelizer()), str);
            }
            if (read(lessonCompletedDialogAudioAttributesCompatParcelizer).booleanValue()) {
                try {
                    return write(new GZIPInputStream(lessonCompletedDialogAudioAttributesCompatParcelizer.AudioAttributesImplBaseParcelizer()), str);
                } catch (IOException e) {
                    return new onDroppedFrames<>((Throwable) e);
                }
            }
            return write(Format1.read(lessonCompletedDialogAudioAttributesCompatParcelizer), str);
        } catch (Resources.NotFoundException e2) {
            return new onDroppedFrames<>((Throwable) e2);
        }
    }

    private static String RemoteActionCompatParcelizer(Context context, int i) {
        StringBuilder sb = new StringBuilder("rawRes");
        sb.append(write(context) ? "_night_" : "_day_");
        sb.append(i);
        return sb.toString();
    }

    private static boolean write(Context context) {
        return (context.getResources().getConfiguration().uiMode & 48) == 32;
    }

    public static onCues<ExoPlayerImplExternalSyntheticLambda19> RemoteActionCompatParcelizer(final InputStream inputStream, final String str) {
        return read(str, (Callable<onDroppedFrames<ExoPlayerImplExternalSyntheticLambda19>>) new Callable() { // from class: o.ExoPlayerImplExternalSyntheticLambda26
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return ExoPlayerImplExternalSyntheticLambda21.write(inputStream, str);
            }
        }, new Runnable() { // from class: o.ExoPlayerImplExternalSyntheticLambda27
            @Override // java.lang.Runnable
            public final void run() {
                setEncoderPadding.read(inputStream);
            }
        });
    }

    public static onDroppedFrames<ExoPlayerImplExternalSyntheticLambda19> write(InputStream inputStream, String str) {
        return IconCompatParcelizer(inputStream, str);
    }

    private static onDroppedFrames<ExoPlayerImplExternalSyntheticLambda19> IconCompatParcelizer(InputStream inputStream, String str) {
        return IconCompatParcelizer(CustomAppBarLayout.AudioAttributesCompatParcelizer(inputStream), str, true);
    }

    public static onCues<ExoPlayerImplExternalSyntheticLambda19> write(final String str, final String str2) {
        return read(str2, (Callable<onDroppedFrames<ExoPlayerImplExternalSyntheticLambda19>>) new Callable() { // from class: o.ExoPlayerImplExternalSyntheticLambda25
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return ExoPlayerImplExternalSyntheticLambda21.IconCompatParcelizer(str, str2);
            }
        }, (Runnable) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static onDroppedFrames<ExoPlayerImplExternalSyntheticLambda19> IconCompatParcelizer(String str, String str2) {
        return RemoteActionCompatParcelizer(CustomAppBarLayout.AudioAttributesCompatParcelizer(new ByteArrayInputStream(str.getBytes())), str2);
    }

    private static onDroppedFrames<ExoPlayerImplExternalSyntheticLambda19> RemoteActionCompatParcelizer(setLockedFromSeek setlockedfromseek, String str) {
        return IconCompatParcelizer(setlockedfromseek, str, true);
    }

    private static onDroppedFrames<ExoPlayerImplExternalSyntheticLambda19> IconCompatParcelizer(setLockedFromSeek setlockedfromseek, String str, boolean z) {
        return AudioAttributesCompatParcelizer(Format1.read(CustomAppBarLayout.AudioAttributesCompatParcelizer(setlockedfromseek)), str, true);
    }

    private static onDroppedFrames<ExoPlayerImplExternalSyntheticLambda19> write(Format1 format1, String str) {
        return read(format1, str);
    }

    private static onDroppedFrames<ExoPlayerImplExternalSyntheticLambda19> read(Format1 format1, String str) {
        return AudioAttributesCompatParcelizer(format1, str, true);
    }

    private static onDroppedFrames<ExoPlayerImplExternalSyntheticLambda19> AudioAttributesCompatParcelizer(Format1 format1, String str, boolean z) {
        ExoPlayerImplExternalSyntheticLambda19 exoPlayerImplExternalSyntheticLambda19AudioAttributesCompatParcelizer;
        try {
            if (str == null) {
                exoPlayerImplExternalSyntheticLambda19AudioAttributesCompatParcelizer = null;
            } else {
                try {
                    exoPlayerImplExternalSyntheticLambda19AudioAttributesCompatParcelizer = maybeUpdatePlayingPeriod.read().AudioAttributesCompatParcelizer(str);
                } catch (Exception e) {
                    onDroppedFrames<ExoPlayerImplExternalSyntheticLambda19> ondroppedframes = new onDroppedFrames<>(e);
                    if (z) {
                        setEncoderPadding.read(format1);
                    }
                    return ondroppedframes;
                }
            }
            if (exoPlayerImplExternalSyntheticLambda19AudioAttributesCompatParcelizer != null) {
                onDroppedFrames<ExoPlayerImplExternalSyntheticLambda19> ondroppedframes2 = new onDroppedFrames<>(exoPlayerImplExternalSyntheticLambda19AudioAttributesCompatParcelizer);
                if (z) {
                    setEncoderPadding.read(format1);
                }
                return ondroppedframes2;
            }
            ExoPlayerImplExternalSyntheticLambda19 exoPlayerImplExternalSyntheticLambda19IconCompatParcelizer = setPositionDiscontinuity.IconCompatParcelizer(format1);
            if (str != null) {
                maybeUpdatePlayingPeriod.read().IconCompatParcelizer(str, exoPlayerImplExternalSyntheticLambda19IconCompatParcelizer);
            }
            onDroppedFrames<ExoPlayerImplExternalSyntheticLambda19> ondroppedframes3 = new onDroppedFrames<>(exoPlayerImplExternalSyntheticLambda19IconCompatParcelizer);
            if (z) {
                setEncoderPadding.read(format1);
            }
            return ondroppedframes3;
        } catch (Throwable th) {
            if (z) {
                setEncoderPadding.read(format1);
            }
            throw th;
        }
    }

    public static onCues<ExoPlayerImplExternalSyntheticLambda19> read(ZipInputStream zipInputStream, String str) {
        return RemoteActionCompatParcelizer(zipInputStream, str);
    }

    private static onCues<ExoPlayerImplExternalSyntheticLambda19> RemoteActionCompatParcelizer(final ZipInputStream zipInputStream, final String str) {
        final Context context = null;
        return read(str, (Callable<onDroppedFrames<ExoPlayerImplExternalSyntheticLambda19>>) new Callable(context, zipInputStream, str) { // from class: o.ExoPlayerImplExternalSyntheticLambda23
            private /* synthetic */ String IconCompatParcelizer;
            private /* synthetic */ ZipInputStream RemoteActionCompatParcelizer;
            private /* synthetic */ Context read = null;

            {
                this.RemoteActionCompatParcelizer = zipInputStream;
                this.IconCompatParcelizer = str;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return ExoPlayerImplExternalSyntheticLambda21.read(this.read, this.RemoteActionCompatParcelizer, this.IconCompatParcelizer);
            }
        }, new Runnable() { // from class: o.ExoPlayerImplExternalSyntheticLambda7
            @Override // java.lang.Runnable
            public final void run() {
                setEncoderPadding.read(zipInputStream);
            }
        });
    }

    public static onDroppedFrames<ExoPlayerImplExternalSyntheticLambda19> read(Context context, ZipInputStream zipInputStream, String str) {
        return RemoteActionCompatParcelizer(context, zipInputStream, str);
    }

    private static onDroppedFrames<ExoPlayerImplExternalSyntheticLambda19> RemoteActionCompatParcelizer(Context context, ZipInputStream zipInputStream, String str) {
        try {
            return AudioAttributesCompatParcelizer(context, zipInputStream, str);
        } finally {
            setEncoderPadding.read(zipInputStream);
        }
    }

    private static onDroppedFrames<ExoPlayerImplExternalSyntheticLambda19> AudioAttributesCompatParcelizer(Context context, ZipInputStream zipInputStream, String str) {
        ExoPlayerImplExternalSyntheticLambda19 exoPlayerImplExternalSyntheticLambda19AudioAttributesCompatParcelizer;
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        if (str == null) {
            exoPlayerImplExternalSyntheticLambda19AudioAttributesCompatParcelizer = null;
        } else {
            try {
                exoPlayerImplExternalSyntheticLambda19AudioAttributesCompatParcelizer = maybeUpdatePlayingPeriod.read().AudioAttributesCompatParcelizer(str);
            } catch (IOException e) {
                return new onDroppedFrames<>((Throwable) e);
            }
        }
        if (exoPlayerImplExternalSyntheticLambda19AudioAttributesCompatParcelizer != null) {
            return new onDroppedFrames<>(exoPlayerImplExternalSyntheticLambda19AudioAttributesCompatParcelizer);
        }
        ZipEntry nextEntry = zipInputStream.getNextEntry();
        ExoPlayerImplExternalSyntheticLambda19 exoPlayerImplExternalSyntheticLambda19IconCompatParcelizer = null;
        while (nextEntry != null) {
            String name = nextEntry.getName();
            if (name.contains("__MACOSX")) {
                zipInputStream.closeEntry();
            } else if (nextEntry.getName().equalsIgnoreCase("manifest.json")) {
                zipInputStream.closeEntry();
            } else if (nextEntry.getName().contains(".json")) {
                exoPlayerImplExternalSyntheticLambda19IconCompatParcelizer = AudioAttributesCompatParcelizer(Format1.read(CustomAppBarLayout.AudioAttributesCompatParcelizer(CustomAppBarLayout.AudioAttributesCompatParcelizer(zipInputStream))), (String) null, false).IconCompatParcelizer();
            } else if (name.contains(".png") || name.contains(".webp") || name.contains(".jpg") || name.contains(".jpeg")) {
                String[] strArrSplit = name.split("/");
                map.put(strArrSplit[strArrSplit.length - 1], BitmapFactory.decodeStream(zipInputStream));
            } else if (name.contains(".ttf") || name.contains(".otf")) {
                String[] strArrSplit2 = name.split("/");
                String str2 = strArrSplit2[strArrSplit2.length - 1];
                String str3 = str2.split("\\.")[0];
                if (context == null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Unable to extract font ");
                    sb.append(str3);
                    sb.append(" please pass a non-null Context parameter");
                    return new onDroppedFrames<>((Throwable) new IllegalStateException(sb.toString()));
                }
                File file = new File(context.getCacheDir(), str2);
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    try {
                        FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                        try {
                            byte[] bArr = new byte[4096];
                            while (true) {
                                int i = zipInputStream.read(bArr);
                                if (i == -1) {
                                    break;
                                }
                                fileOutputStream2.write(bArr, 0, i);
                            }
                            fileOutputStream2.flush();
                            fileOutputStream2.close();
                            fileOutputStream.close();
                        } catch (Throwable th) {
                            try {
                                fileOutputStream2.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    } catch (Throwable th3) {
                        try {
                            fileOutputStream.close();
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                        }
                        throw th3;
                    }
                } catch (Throwable th5) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Unable to save font ");
                    sb2.append(str3);
                    sb2.append(" to the temporary file: ");
                    sb2.append(str2);
                    sb2.append(". ");
                    access3000.IconCompatParcelizer(sb2.toString(), th5);
                }
                Typeface typefaceCreateFromFile = Typeface.createFromFile(file);
                if (!file.delete()) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("Failed to delete temp font file ");
                    sb3.append(file.getAbsolutePath());
                    sb3.append(".");
                    access3000.AudioAttributesCompatParcelizer(sb3.toString());
                }
                map2.put(str3, typefaceCreateFromFile);
            } else {
                zipInputStream.closeEntry();
            }
            nextEntry = zipInputStream.getNextEntry();
        }
        if (exoPlayerImplExternalSyntheticLambda19IconCompatParcelizer == null) {
            return new onDroppedFrames<>((Throwable) new IllegalArgumentException("Unable to parse composition"));
        }
        for (Map.Entry entry : map.entrySet()) {
            onAudioDisabled onaudiodisabledWrite = write(exoPlayerImplExternalSyntheticLambda19IconCompatParcelizer, (String) entry.getKey());
            if (onaudiodisabledWrite != null) {
                onaudiodisabledWrite.IconCompatParcelizer(setEncoderPadding.read((Bitmap) entry.getValue(), onaudiodisabledWrite.RemoteActionCompatParcelizer(), onaudiodisabledWrite.read()));
            }
        }
        for (Map.Entry entry2 : map2.entrySet()) {
            boolean z = false;
            for (isUsingPlaceholderPeriod isusingplaceholderperiod : exoPlayerImplExternalSyntheticLambda19IconCompatParcelizer.AudioAttributesImplApi26Parcelizer().values()) {
                if (isusingplaceholderperiod.IconCompatParcelizer().equals(entry2.getKey())) {
                    isusingplaceholderperiod.RemoteActionCompatParcelizer((Typeface) entry2.getValue());
                    z = true;
                }
            }
            if (!z) {
                StringBuilder sb4 = new StringBuilder("Parsed font for ");
                sb4.append((String) entry2.getKey());
                sb4.append(" however it was not found in the animation.");
                access3000.AudioAttributesCompatParcelizer(sb4.toString());
            }
        }
        if (map.isEmpty()) {
            Iterator<Map.Entry<String, onAudioDisabled>> it = exoPlayerImplExternalSyntheticLambda19IconCompatParcelizer.AudioAttributesImplBaseParcelizer().entrySet().iterator();
            while (it.hasNext()) {
                onAudioDisabled value = it.next().getValue();
                if (value == null) {
                    return null;
                }
                String strWrite = value.write();
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inScaled = true;
                options.inDensity = 160;
                if (strWrite.startsWith("data:") && strWrite.indexOf("base64,") > 0) {
                    try {
                        byte[] bArrDecode = Base64.decode(strWrite.substring(strWrite.indexOf(44) + 1), 0);
                        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length, options);
                        if (bitmapDecodeByteArray != null) {
                            value.IconCompatParcelizer(setEncoderPadding.read(bitmapDecodeByteArray, value.RemoteActionCompatParcelizer(), value.read()));
                        }
                    } catch (IllegalArgumentException e2) {
                        access3000.IconCompatParcelizer("data URL did not have correct base64 format.", e2);
                        return null;
                    }
                }
            }
        }
        if (str != null) {
            maybeUpdatePlayingPeriod.read().IconCompatParcelizer(str, exoPlayerImplExternalSyntheticLambda19IconCompatParcelizer);
        }
        return new onDroppedFrames<>(exoPlayerImplExternalSyntheticLambda19IconCompatParcelizer);
    }

    private static Boolean RemoteActionCompatParcelizer(LessonCompletedDialog lessonCompletedDialog) {
        return IconCompatParcelizer(lessonCompletedDialog, IconCompatParcelizer);
    }

    private static Boolean read(LessonCompletedDialog lessonCompletedDialog) {
        return IconCompatParcelizer(lessonCompletedDialog, write);
    }

    private static Boolean IconCompatParcelizer(LessonCompletedDialog lessonCompletedDialog, byte[] bArr) {
        try {
            LessonCompletedDialog lessonCompletedDialogAudioAttributesImplApi21Parcelizer = lessonCompletedDialog.AudioAttributesImplApi21Parcelizer();
            for (byte b : bArr) {
                if (lessonCompletedDialogAudioAttributesImplApi21Parcelizer.MediaMetadataCompat() != b) {
                    return Boolean.FALSE;
                }
            }
            lessonCompletedDialogAudioAttributesImplApi21Parcelizer.close();
            return Boolean.TRUE;
        } catch (Exception e) {
            access3000.RemoteActionCompatParcelizer("Failed to check zip file header", e);
            return Boolean.FALSE;
        } catch (NoSuchMethodError unused) {
            return Boolean.FALSE;
        }
    }

    private static onAudioDisabled write(ExoPlayerImplExternalSyntheticLambda19 exoPlayerImplExternalSyntheticLambda19, String str) {
        for (onAudioDisabled onaudiodisabled : exoPlayerImplExternalSyntheticLambda19.AudioAttributesImplBaseParcelizer().values()) {
            if (onaudiodisabled.write().equals(str)) {
                return onaudiodisabled;
            }
        }
        return null;
    }

    private static onCues<ExoPlayerImplExternalSyntheticLambda19> read(final String str, Callable<onDroppedFrames<ExoPlayerImplExternalSyntheticLambda19>> callable, Runnable runnable) {
        ExoPlayerImplExternalSyntheticLambda19 exoPlayerImplExternalSyntheticLambda19AudioAttributesCompatParcelizer = str == null ? null : maybeUpdatePlayingPeriod.read().AudioAttributesCompatParcelizer(str);
        onCues<ExoPlayerImplExternalSyntheticLambda19> oncues = exoPlayerImplExternalSyntheticLambda19AudioAttributesCompatParcelizer != null ? new onCues<>(exoPlayerImplExternalSyntheticLambda19AudioAttributesCompatParcelizer) : null;
        if (str != null) {
            Map<String, onCues<ExoPlayerImplExternalSyntheticLambda19>> map = AudioAttributesCompatParcelizer;
            if (map.containsKey(str)) {
                oncues = map.get(str);
            }
        }
        if (oncues != null) {
            if (runnable != null) {
                runnable.run();
            }
            return oncues;
        }
        onCues<ExoPlayerImplExternalSyntheticLambda19> oncues2 = new onCues<>(callable);
        if (str != null) {
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            oncues2.write(new onAudioEnabled() { // from class: o.ExoPlayerImplExternalSyntheticLambda3
                @Override // kotlin.onAudioEnabled
                public final void onResult(Object obj) {
                    ExoPlayerImplExternalSyntheticLambda21.IconCompatParcelizer(str, atomicBoolean);
                }
            });
            oncues2.read(new onAudioEnabled() { // from class: o.ExoPlayerImplExternalSyntheticLambda4
                @Override // kotlin.onAudioEnabled
                public final void onResult(Object obj) {
                    ExoPlayerImplExternalSyntheticLambda21.read(str, atomicBoolean);
                }
            });
            if (!atomicBoolean.get()) {
                Map<String, onCues<ExoPlayerImplExternalSyntheticLambda19>> map2 = AudioAttributesCompatParcelizer;
                map2.put(str, oncues2);
                if (map2.size() == 1) {
                    RemoteActionCompatParcelizer();
                }
            }
        }
        return oncues2;
    }

    static /* synthetic */ void IconCompatParcelizer(String str, AtomicBoolean atomicBoolean) {
        Map<String, onCues<ExoPlayerImplExternalSyntheticLambda19>> map = AudioAttributesCompatParcelizer;
        map.remove(str);
        atomicBoolean.set(true);
        if (map.size() == 0) {
            RemoteActionCompatParcelizer();
        }
    }

    static /* synthetic */ void read(String str, AtomicBoolean atomicBoolean) {
        Map<String, onCues<ExoPlayerImplExternalSyntheticLambda19>> map = AudioAttributesCompatParcelizer;
        map.remove(str);
        atomicBoolean.set(true);
        if (map.size() == 0) {
            RemoteActionCompatParcelizer();
        }
    }

    private static void RemoteActionCompatParcelizer() {
        ArrayList arrayList = new ArrayList(read);
        for (int i = 0; i < arrayList.size(); i++) {
        }
    }
}
