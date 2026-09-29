package kotlin;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import kotlin.StdScalarDeserializer;

/* JADX INFO: loaded from: classes2.dex */
final class StdValueInstantiator {
    private static ActionMenuViewLayoutParams<String, Typeface> read = new ActionMenuViewLayoutParams<>(16);
    private static final ExecutorService AudioAttributesCompatParcelizer = configureFromBigDecimalCreator.IconCompatParcelizer("fonts-androidx");
    static final Object RemoteActionCompatParcelizer = new Object();
    static final AppCompatCheckBox<String, ArrayList<wrapAsJsonMappingException<read>>> IconCompatParcelizer = new AppCompatCheckBox<>();

    static Typeface RemoteActionCompatParcelizer(final Context context, final StdKeyDeserializersExternalSyntheticLambda0 stdKeyDeserializersExternalSyntheticLambda0, constructEnumKeyDeserializer constructenumkeydeserializer, final int i, int i2) {
        final String str = read(findFormatFeature.RemoteActionCompatParcelizer(new Object[]{stdKeyDeserializersExternalSyntheticLambda0}), i);
        Typeface typeface = read.get(str);
        if (typeface != null) {
            constructenumkeydeserializer.IconCompatParcelizer(new read(typeface));
            return typeface;
        }
        if (i2 == -1) {
            read readVarAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(str, context, findFormatFeature.RemoteActionCompatParcelizer(new Object[]{stdKeyDeserializersExternalSyntheticLambda0}), i);
            constructenumkeydeserializer.IconCompatParcelizer(readVarAudioAttributesCompatParcelizer);
            return readVarAudioAttributesCompatParcelizer.IconCompatParcelizer;
        }
        try {
            read readVar = (read) configureFromBigDecimalCreator.read(AudioAttributesCompatParcelizer, new Callable<read>() { // from class: o.StdValueInstantiator.2
                /* JADX INFO: Access modifiers changed from: private */
                @Override // java.util.concurrent.Callable
                /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
                public read call() {
                    return StdValueInstantiator.AudioAttributesCompatParcelizer(str, context, findFormatFeature.RemoteActionCompatParcelizer(new Object[]{stdKeyDeserializersExternalSyntheticLambda0}), i);
                }
            }, i2);
            constructenumkeydeserializer.IconCompatParcelizer(readVar);
            return readVar.IconCompatParcelizer;
        } catch (InterruptedException unused) {
            constructenumkeydeserializer.IconCompatParcelizer(new read(-3));
            return null;
        }
    }

    static Typeface write(final Context context, final List<StdKeyDeserializersExternalSyntheticLambda0> list, final int i, final constructEnumKeyDeserializer constructenumkeydeserializer) {
        final String str = read(list, i);
        Typeface typeface = read.get(str);
        if (typeface != null) {
            constructenumkeydeserializer.IconCompatParcelizer(new read(typeface));
            return typeface;
        }
        wrapAsJsonMappingException<read> wrapasjsonmappingexception = new wrapAsJsonMappingException<read>() { // from class: o.StdValueInstantiator.1
            /* JADX INFO: Access modifiers changed from: private */
            @Override // kotlin.wrapAsJsonMappingException
            /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
            public void AudioAttributesCompatParcelizer(read readVar) {
                if (readVar == null) {
                    readVar = new read(-3);
                }
                constructenumkeydeserializer.IconCompatParcelizer(readVar);
            }
        };
        synchronized (RemoteActionCompatParcelizer) {
            AppCompatCheckBox<String, ArrayList<wrapAsJsonMappingException<read>>> appCompatCheckBox = IconCompatParcelizer;
            ArrayList<wrapAsJsonMappingException<read>> arrayList = appCompatCheckBox.get(str);
            if (arrayList != null) {
                arrayList.add(wrapasjsonmappingexception);
                return null;
            }
            ArrayList<wrapAsJsonMappingException<read>> arrayList2 = new ArrayList<>();
            arrayList2.add(wrapasjsonmappingexception);
            appCompatCheckBox.put(str, arrayList2);
            configureFromBigDecimalCreator.write(AudioAttributesCompatParcelizer, new Callable<read>() { // from class: o.StdValueInstantiator.5
                /* JADX INFO: Access modifiers changed from: private */
                @Override // java.util.concurrent.Callable
                /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
                public read call() {
                    try {
                        return StdValueInstantiator.AudioAttributesCompatParcelizer(str, context, list, i);
                    } catch (Throwable unused) {
                        return new read(-3);
                    }
                }
            }, new wrapAsJsonMappingException<read>() { // from class: o.StdValueInstantiator.3
                /* JADX INFO: Access modifiers changed from: private */
                @Override // kotlin.wrapAsJsonMappingException
                /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
                public void AudioAttributesCompatParcelizer(read readVar) {
                    synchronized (StdValueInstantiator.RemoteActionCompatParcelizer) {
                        ArrayList<wrapAsJsonMappingException<read>> arrayList3 = StdValueInstantiator.IconCompatParcelizer.get(str);
                        if (arrayList3 == null) {
                            return;
                        }
                        StdValueInstantiator.IconCompatParcelizer.remove(str);
                        for (int i2 = 0; i2 < arrayList3.size(); i2++) {
                            arrayList3.get(i2).AudioAttributesCompatParcelizer(readVar);
                        }
                    }
                }
            });
            return null;
        }
    }

    private static String read(List<StdKeyDeserializersExternalSyntheticLambda0> list, int i) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < list.size(); i2++) {
            sb.append(list.get(i2).read());
            sb.append("-");
            sb.append(i);
            if (i2 < list.size() - 1) {
                sb.append(";");
            }
        }
        return sb.toString();
    }

    static read AudioAttributesCompatParcelizer(String str, Context context, List<StdKeyDeserializersExternalSyntheticLambda0> list, int i) {
        MarkerView.AudioAttributesCompatParcelizer("getFontSync");
        try {
            ActionMenuViewLayoutParams<String, Typeface> actionMenuViewLayoutParams = read;
            Typeface typeface = actionMenuViewLayoutParams.get(str);
            if (typeface != null) {
                return new read(typeface);
            }
            StdScalarDeserializer.IconCompatParcelizer iconCompatParcelizerAudioAttributesCompatParcelizer = findStringBasedKeyDeserializer.AudioAttributesCompatParcelizer(context, list);
            int iIconCompatParcelizer = IconCompatParcelizer(iconCompatParcelizerAudioAttributesCompatParcelizer);
            if (iIconCompatParcelizer != 0) {
                return new read(iIconCompatParcelizer);
            }
            Typeface typefaceWrite = iconCompatParcelizerAudioAttributesCompatParcelizer.write() ? findConvertingContentDeserializer.write(context, null, iconCompatParcelizerAudioAttributesCompatParcelizer.IconCompatParcelizer(), i) : findConvertingContentDeserializer.AudioAttributesCompatParcelizer(context, null, iconCompatParcelizerAudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(), i);
            if (typefaceWrite == null) {
                return new read(-3);
            }
            actionMenuViewLayoutParams.put(str, typefaceWrite);
            return new read(typefaceWrite);
        } catch (PackageManager.NameNotFoundException unused) {
            return new read(-1);
        } finally {
            MarkerView.RemoteActionCompatParcelizer();
        }
    }

    private static int IconCompatParcelizer(StdScalarDeserializer.IconCompatParcelizer iconCompatParcelizer) {
        int i = 1;
        if (iconCompatParcelizer.read() != 0) {
            return iconCompatParcelizer.read() != 1 ? -3 : -2;
        }
        StdScalarDeserializer.AudioAttributesCompatParcelizer[] audioAttributesCompatParcelizerArrRemoteActionCompatParcelizer = iconCompatParcelizer.RemoteActionCompatParcelizer();
        if (audioAttributesCompatParcelizerArrRemoteActionCompatParcelizer != null && audioAttributesCompatParcelizerArrRemoteActionCompatParcelizer.length != 0) {
            i = 0;
            for (StdScalarDeserializer.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer : audioAttributesCompatParcelizerArrRemoteActionCompatParcelizer) {
                int iWrite = audioAttributesCompatParcelizer.write();
                if (iWrite != 0) {
                    if (iWrite < 0) {
                        return -3;
                    }
                    return iWrite;
                }
            }
        }
        return i;
    }

    static final class read {
        final Typeface IconCompatParcelizer;
        final int read;

        read(int i) {
            this.IconCompatParcelizer = null;
            this.read = i;
        }

        read(Typeface typeface) {
            this.IconCompatParcelizer = typeface;
            this.read = 0;
        }

        final boolean RemoteActionCompatParcelizer() {
            return this.read == 0;
        }
    }
}
