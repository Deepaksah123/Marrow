package kotlin;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.AnnotatedFieldCollectorFieldBuilder;
import kotlin.AnnotatedMethod;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J'\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0011H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J#\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0014H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u000f\u001a\u00020\u00028WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0017R\u001a\u0010\f\u001a\u00020\u00058\u0007X\u0087D¢\u0006\f\n\u0004\b\u0015\u0010\u0018\u001a\u0004\b\f\u0010\u0019\u0082\u0002\u0004\n\u0002\b\u0019"}, d2 = {"Lo/_addMemberMethods;", "Lo/constructNonDefaultConstructor;", "Lo/AnnotatedMethod;", "<init>", "()V", "", "p0", "Lo/AnnotatedFieldCollectorFieldBuilder$IconCompatParcelizer;", "p1", "Lo/getAllAnnotations;", "p2", "", "IconCompatParcelizer", "(Ljava/lang/String;Lo/AnnotatedFieldCollectorFieldBuilder$IconCompatParcelizer;Lo/getAllAnnotations;)V", "", "AudioAttributesCompatParcelizer", "(Ljava/lang/Object;)Lo/AnnotatedFieldCollectorFieldBuilder$IconCompatParcelizer;", "Ljava/io/InputStream;", "write", "(Ljava/io/InputStream;)Ljava/lang/Object;", "Ljava/io/OutputStream;", "read", "(Lo/AnnotatedMethod;Ljava/io/OutputStream;)Ljava/lang/Object;", "()Lo/AnnotatedMethod;", "Ljava/lang/String;", "()Ljava/lang/String;"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class _addMemberMethods implements constructNonDefaultConstructor<AnnotatedMethod> {
    public static final _addMemberMethods INSTANCE = new _addMemberMethods();

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private static final String IconCompatParcelizer = "preferences_pb";

    public final /* synthetic */ class IconCompatParcelizer {
        public static final /* synthetic */ int[] IconCompatParcelizer;

        static {
            int[] iArr = new int[AnnotatedFieldCollectorFieldBuilder.IconCompatParcelizer.write.values().length];
            iArr[AnnotatedFieldCollectorFieldBuilder.IconCompatParcelizer.write.BOOLEAN.ordinal()] = 1;
            iArr[AnnotatedFieldCollectorFieldBuilder.IconCompatParcelizer.write.FLOAT.ordinal()] = 2;
            iArr[AnnotatedFieldCollectorFieldBuilder.IconCompatParcelizer.write.DOUBLE.ordinal()] = 3;
            iArr[AnnotatedFieldCollectorFieldBuilder.IconCompatParcelizer.write.INTEGER.ordinal()] = 4;
            iArr[AnnotatedFieldCollectorFieldBuilder.IconCompatParcelizer.write.LONG.ordinal()] = 5;
            iArr[AnnotatedFieldCollectorFieldBuilder.IconCompatParcelizer.write.STRING.ordinal()] = 6;
            iArr[AnnotatedFieldCollectorFieldBuilder.IconCompatParcelizer.write.STRING_SET.ordinal()] = 7;
            iArr[AnnotatedFieldCollectorFieldBuilder.IconCompatParcelizer.write.VALUE_NOT_SET.ordinal()] = 8;
            IconCompatParcelizer = iArr;
        }
    }

    private _addMemberMethods() {
    }

    @Override // kotlin.constructNonDefaultConstructor
    public final /* synthetic */ AnnotatedMethod RemoteActionCompatParcelizer() {
        return read();
    }

    @Override // kotlin.constructNonDefaultConstructor
    public final /* synthetic */ Object write(AnnotatedMethod annotatedMethod, OutputStream outputStream) {
        return read(annotatedMethod, outputStream);
    }

    public static String IconCompatParcelizer() {
        return IconCompatParcelizer;
    }

    private static AnnotatedMethod read() {
        return getRawParameterTypes.read();
    }

    @Override // kotlin.constructNonDefaultConstructor
    public final Object write(InputStream p0) throws IOException {
        AnnotatedFieldCollectorFieldBuilder.RemoteActionCompatParcelizer remoteActionCompatParcelizerWrite = _isIncludableField.INSTANCE.write(p0);
        getAllAnnotations getallannotationsAudioAttributesCompatParcelizer = getRawParameterTypes.AudioAttributesCompatParcelizer(new AnnotatedMethod.write[0]);
        Map<String, AnnotatedFieldCollectorFieldBuilder.IconCompatParcelizer> mapRemoteActionCompatParcelizer = remoteActionCompatParcelizerWrite.RemoteActionCompatParcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(mapRemoteActionCompatParcelizer, "");
        for (Map.Entry<String, AnnotatedFieldCollectorFieldBuilder.IconCompatParcelizer> entry : mapRemoteActionCompatParcelizer.entrySet()) {
            String key = entry.getKey();
            AnnotatedFieldCollectorFieldBuilder.IconCompatParcelizer value = entry.getValue();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(key, "");
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(value, "");
            IconCompatParcelizer(key, value, getallannotationsAudioAttributesCompatParcelizer);
        }
        return getallannotationsAudioAttributesCompatParcelizer.RemoteActionCompatParcelizer();
    }

    private static Object read(AnnotatedMethod p0, OutputStream p1) throws IOException {
        Map<AnnotatedMethod.RemoteActionCompatParcelizer<?>, Object> mapAudioAttributesCompatParcelizer = p0.AudioAttributesCompatParcelizer();
        AnnotatedFieldCollectorFieldBuilder.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer AudioAttributesCompatParcelizer = AnnotatedFieldCollectorFieldBuilder.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer();
        for (Map.Entry<AnnotatedMethod.RemoteActionCompatParcelizer<?>, Object> entry : mapAudioAttributesCompatParcelizer.entrySet()) {
            AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(entry.getKey().IconCompatParcelizer(), AudioAttributesCompatParcelizer(entry.getValue()));
        }
        AudioAttributesCompatParcelizer.write().write(p1);
        return getShowPopup.INSTANCE;
    }

    private static AnnotatedFieldCollectorFieldBuilder.IconCompatParcelizer AudioAttributesCompatParcelizer(Object p0) {
        if (p0 instanceof Boolean) {
            AnnotatedFieldCollectorFieldBuilder.IconCompatParcelizer iconCompatParcelizerWrite = AnnotatedFieldCollectorFieldBuilder.IconCompatParcelizer.AudioAttributesCompatParcelizer().IconCompatParcelizer(((Boolean) p0).booleanValue()).write();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(iconCompatParcelizerWrite, "");
            return iconCompatParcelizerWrite;
        }
        if (p0 instanceof Float) {
            AnnotatedFieldCollectorFieldBuilder.IconCompatParcelizer iconCompatParcelizerWrite2 = AnnotatedFieldCollectorFieldBuilder.IconCompatParcelizer.AudioAttributesCompatParcelizer().IconCompatParcelizer(((Number) p0).floatValue()).write();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(iconCompatParcelizerWrite2, "");
            return iconCompatParcelizerWrite2;
        }
        if (p0 instanceof Double) {
            AnnotatedFieldCollectorFieldBuilder.IconCompatParcelizer iconCompatParcelizerWrite3 = AnnotatedFieldCollectorFieldBuilder.IconCompatParcelizer.AudioAttributesCompatParcelizer().write(((Number) p0).doubleValue()).write();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(iconCompatParcelizerWrite3, "");
            return iconCompatParcelizerWrite3;
        }
        if (p0 instanceof Integer) {
            AnnotatedFieldCollectorFieldBuilder.IconCompatParcelizer iconCompatParcelizerWrite4 = AnnotatedFieldCollectorFieldBuilder.IconCompatParcelizer.AudioAttributesCompatParcelizer().RemoteActionCompatParcelizer(((Number) p0).intValue()).write();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(iconCompatParcelizerWrite4, "");
            return iconCompatParcelizerWrite4;
        }
        if (p0 instanceof Long) {
            AnnotatedFieldCollectorFieldBuilder.IconCompatParcelizer iconCompatParcelizerWrite5 = AnnotatedFieldCollectorFieldBuilder.IconCompatParcelizer.AudioAttributesCompatParcelizer().AudioAttributesCompatParcelizer(((Number) p0).longValue()).write();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(iconCompatParcelizerWrite5, "");
            return iconCompatParcelizerWrite5;
        }
        if (p0 instanceof String) {
            AnnotatedFieldCollectorFieldBuilder.IconCompatParcelizer iconCompatParcelizerWrite6 = AnnotatedFieldCollectorFieldBuilder.IconCompatParcelizer.AudioAttributesCompatParcelizer().AudioAttributesCompatParcelizer((String) p0).write();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(iconCompatParcelizerWrite6, "");
            return iconCompatParcelizerWrite6;
        }
        if (p0 instanceof Set) {
            AnnotatedFieldCollectorFieldBuilder.IconCompatParcelizer iconCompatParcelizerWrite7 = AnnotatedFieldCollectorFieldBuilder.IconCompatParcelizer.AudioAttributesCompatParcelizer().IconCompatParcelizer(AnnotatedFieldCollectorFieldBuilder.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer().AudioAttributesCompatParcelizer((Set) p0)).write();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(iconCompatParcelizerWrite7, "");
            return iconCompatParcelizerWrite7;
        }
        throw new IllegalStateException(toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer("PreferencesSerializer does not support type: ", (Object) p0.getClass().getName()));
    }

    private static void IconCompatParcelizer(String p0, AnnotatedFieldCollectorFieldBuilder.IconCompatParcelizer p1, getAllAnnotations p2) throws AnnotatedConstructorSerialization {
        AnnotatedFieldCollectorFieldBuilder.IconCompatParcelizer.write writeVarRatingCompat = p1.RatingCompat();
        switch (writeVarRatingCompat == null ? -1 : IconCompatParcelizer.IconCompatParcelizer[writeVarRatingCompat.ordinal()]) {
            case -1:
                throw new AnnotatedConstructorSerialization("Value case is null.", null, 2, null);
            case 0:
            default:
                throw new RenewEligibleCreator();
            case 1:
                p2.read(AnnotatedMethodSerialization.write(p0), Boolean.valueOf(p1.write()));
                return;
            case 2:
                p2.read(AnnotatedMethodSerialization.read(p0), Float.valueOf(p1.MediaBrowserCompatCustomActionResultReceiver()));
                return;
            case 3:
                p2.read(AnnotatedMethodSerialization.IconCompatParcelizer(p0), Double.valueOf(p1.RemoteActionCompatParcelizer()));
                return;
            case 4:
                p2.read(AnnotatedMethodSerialization.AudioAttributesCompatParcelizer(p0), Integer.valueOf(p1.AudioAttributesImplApi26Parcelizer()));
                return;
            case 5:
                p2.read(AnnotatedMethodSerialization.RemoteActionCompatParcelizer(p0), Long.valueOf(p1.MediaBrowserCompatItemReceiver()));
                return;
            case 6:
                AnnotatedMethod.RemoteActionCompatParcelizer<String> remoteActionCompatParcelizerMediaBrowserCompatItemReceiver = AnnotatedMethodSerialization.MediaBrowserCompatItemReceiver(p0);
                String strAudioAttributesImplApi21Parcelizer = p1.AudioAttributesImplApi21Parcelizer();
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strAudioAttributesImplApi21Parcelizer, "");
                p2.read(remoteActionCompatParcelizerMediaBrowserCompatItemReceiver, strAudioAttributesImplApi21Parcelizer);
                return;
            case 7:
                AnnotatedMethod.RemoteActionCompatParcelizer<Set<String>> remoteActionCompatParcelizerMediaBrowserCompatCustomActionResultReceiver = AnnotatedMethodSerialization.MediaBrowserCompatCustomActionResultReceiver(p0);
                List<String> list = p1.AudioAttributesImplBaseParcelizer().read();
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(list, "");
                p2.read(remoteActionCompatParcelizerMediaBrowserCompatCustomActionResultReceiver, IntermediateLoginResponseBody.onPlayFromUri(list));
                return;
            case 8:
                throw new AnnotatedConstructorSerialization("Value not set.", null, 2, null);
        }
    }
}
