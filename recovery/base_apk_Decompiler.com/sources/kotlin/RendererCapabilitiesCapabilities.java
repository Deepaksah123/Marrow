package kotlin;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes2.dex */
public final class RendererCapabilitiesCapabilities {
    private RemoteActionCompatParcelizer IconCompatParcelizer;
    private final lambdaonAudioDecoderInitialized4 read;
    private final lambdaonAudioCodecError11 write;

    public final /* synthetic */ class IconCompatParcelizer {
        public static final /* synthetic */ int[] AudioAttributesCompatParcelizer;

        static {
            int[] iArr = new int[RemoteActionCompatParcelizer.values().length];
            try {
                iArr[RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RemoteActionCompatParcelizer.RemoteActionCompatParcelizer.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            AudioAttributesCompatParcelizer = iArr;
        }
    }

    public RendererCapabilitiesCapabilities(lambdaonAudioDecoderInitialized4 lambdaonaudiodecoderinitialized4, lambdaonAudioCodecError11 lambdaonaudiocodecerror11) {
        toMagicModuleMetaRepoModel.write(lambdaonaudiodecoderinitialized4, "");
        toMagicModuleMetaRepoModel.write(lambdaonaudiocodecerror11, "");
        this.read = lambdaonaudiodecoderinitialized4;
        this.write = lambdaonaudiocodecerror11;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lo/RendererCapabilitiesCapabilities$RemoteActionCompatParcelizer;", "", "<init>", "(Ljava/lang/String;I)V", "read", "RemoteActionCompatParcelizer", "AudioAttributesCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class RemoteActionCompatParcelizer {
        private static final /* synthetic */ RemoteActionCompatParcelizer[] IconCompatParcelizer;
        public static final RemoteActionCompatParcelizer read = new RemoteActionCompatParcelizer("INT_NUMBER", 0);
        public static final RemoteActionCompatParcelizer RemoteActionCompatParcelizer = new RemoteActionCompatParcelizer("FLOAT_NUMBER", 1);
        public static final RemoteActionCompatParcelizer AudioAttributesCompatParcelizer = new RemoteActionCompatParcelizer("DOUBLE_NUMBER", 2);

        private RemoteActionCompatParcelizer(String str, int i) {
        }

        static {
            RemoteActionCompatParcelizer[] remoteActionCompatParcelizerArrIconCompatParcelizer = IconCompatParcelizer();
            IconCompatParcelizer = remoteActionCompatParcelizerArrIconCompatParcelizer;
            getMagicModuleTimeline.IconCompatParcelizer(remoteActionCompatParcelizerArrIconCompatParcelizer);
        }

        public static RemoteActionCompatParcelizer valueOf(String str) {
            return (RemoteActionCompatParcelizer) Enum.valueOf(RemoteActionCompatParcelizer.class, str);
        }

        public static RemoteActionCompatParcelizer[] values() {
            return (RemoteActionCompatParcelizer[]) IconCompatParcelizer.clone();
        }

        private static final /* synthetic */ RemoteActionCompatParcelizer[] IconCompatParcelizer() {
            return new RemoteActionCompatParcelizer[]{read, RemoteActionCompatParcelizer, AudioAttributesCompatParcelizer};
        }
    }

    public final Number write(Number number, String str, Number number2) {
        int i;
        toMagicModuleMetaRepoModel.write(number, "");
        toMagicModuleMetaRepoModel.write(str, "");
        if (number2 == null) {
            RemoteActionCompatParcelizer remoteActionCompatParcelizerIconCompatParcelizer = IconCompatParcelizer(number);
            i = remoteActionCompatParcelizerIconCompatParcelizer != null ? IconCompatParcelizer.AudioAttributesCompatParcelizer[remoteActionCompatParcelizerIconCompatParcelizer.ordinal()] : -1;
            if (i == 1) {
                if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) str, (Object) "$incr")) {
                    return Double.valueOf(number.doubleValue());
                }
                if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) str, (Object) "$decr")) {
                    return Double.valueOf(-number.doubleValue());
                }
                return null;
            }
            if (i == 2) {
                if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) str, (Object) "$incr")) {
                    return Float.valueOf(number.floatValue());
                }
                if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) str, (Object) "$decr")) {
                    return Float.valueOf(-number.floatValue());
                }
                return null;
            }
            if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) str, (Object) "$incr")) {
                return Integer.valueOf(number.intValue());
            }
            if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) str, (Object) "$decr")) {
                return Integer.valueOf(-number.intValue());
            }
            return null;
        }
        RemoteActionCompatParcelizer remoteActionCompatParcelizerIconCompatParcelizer2 = IconCompatParcelizer(number2);
        i = remoteActionCompatParcelizerIconCompatParcelizer2 != null ? IconCompatParcelizer.AudioAttributesCompatParcelizer[remoteActionCompatParcelizerIconCompatParcelizer2.ordinal()] : -1;
        if (i == 1) {
            if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) str, (Object) "$incr")) {
                return Double.valueOf(number2.doubleValue() + number.doubleValue());
            }
            if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) str, (Object) "$decr")) {
                return Double.valueOf(number2.doubleValue() - number.doubleValue());
            }
            return null;
        }
        if (i == 2) {
            if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) str, (Object) "$incr")) {
                return Float.valueOf(number2.floatValue() + number.floatValue());
            }
            if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) str, (Object) "$decr")) {
                return Float.valueOf(number2.floatValue() - number.floatValue());
            }
            return null;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) str, (Object) "$incr")) {
            return Integer.valueOf(number2.intValue() + number.intValue());
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) str, (Object) "$decr")) {
            return Integer.valueOf(number2.intValue() - number.intValue());
        }
        return null;
    }

    private final RemoteActionCompatParcelizer IconCompatParcelizer(Number number) {
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(number, Integer.valueOf(number.intValue())) ? RemoteActionCompatParcelizer.read : toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(number, Double.valueOf(number.doubleValue())) ? RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer : toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(number, Float.valueOf(number.floatValue())) ? RemoteActionCompatParcelizer.RemoteActionCompatParcelizer : this.IconCompatParcelizer;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final JSONArray write(String str, JSONArray jSONArray, String str2, Object obj) {
        String str3;
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        JSONArray jSONArrayWrite = write(str2, obj);
        toMagicModuleMetaRepoModel.write(jSONArray);
        ArrayList<?> arrayListAudioAttributesCompatParcelizer = AnalyticsCollector.AudioAttributesCompatParcelizer(jSONArray);
        toMagicModuleMetaRepoModel.read(arrayListAudioAttributesCompatParcelizer, "");
        JSONArray jSONArray2 = read(str, arrayListAudioAttributesCompatParcelizer);
        if (jSONArrayWrite == null || jSONArray2 == null) {
            return null;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) str2, (Object) "$remove")) {
            str3 = "multiValuePropertyRemoveValues";
        } else {
            str3 = "multiValuePropertyAddValues";
        }
        generateMediaPeriodEventTime generatemediaperiodeventtimeAudioAttributesCompatParcelizer = this.read.AudioAttributesCompatParcelizer(jSONArrayWrite, jSONArray2, str3, str);
        if (generatemediaperiodeventtimeAudioAttributesCompatParcelizer.write() != 0) {
            this.write.read(generatemediaperiodeventtimeAudioAttributesCompatParcelizer);
        }
        Object obj2 = generatemediaperiodeventtimeAudioAttributesCompatParcelizer.read();
        toMagicModuleMetaRepoModel.read(obj2, "");
        JSONArray jSONArray3 = (JSONArray) obj2;
        if (jSONArray3.length() <= 0) {
            return null;
        }
        return jSONArray3;
    }

    private final JSONArray write(String str, Object obj) {
        boolean zRemoteActionCompatParcelizer = toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) str, (Object) "$remove");
        boolean zRemoteActionCompatParcelizer2 = toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) str, (Object) "$add");
        if (!zRemoteActionCompatParcelizer && !zRemoteActionCompatParcelizer2) {
            return new JSONArray();
        }
        if (obj == null) {
            if (zRemoteActionCompatParcelizer) {
                return null;
            }
            return new JSONArray();
        }
        if (obj instanceof JSONArray) {
            return (JSONArray) obj;
        }
        JSONArray jSONArray = zRemoteActionCompatParcelizer2 ? new JSONArray() : null;
        String strAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(obj);
        return strAudioAttributesCompatParcelizer != null ? new JSONArray().put(strAudioAttributesCompatParcelizer) : jSONArray;
    }

    private final JSONArray read(String str, ArrayList<String> arrayList) {
        if (arrayList == null) {
            return null;
        }
        try {
            JSONArray jSONArray = new JSONArray();
            Iterator<String> it = arrayList.iterator();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(it, "");
            while (it.hasNext()) {
                String next = it.next();
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(next, "");
                String str2 = next;
                generateMediaPeriodEventTime generatemediaperiodeventtime = lambdaonAudioDecoderInitialized4.read(str2);
                if (generatemediaperiodeventtime.write() != 0) {
                    this.write.read(generatemediaperiodeventtime);
                }
                String string = generatemediaperiodeventtime.read() != null ? generatemediaperiodeventtime.read().toString() : null;
                if (str2.length() == 0) {
                    read(str);
                    return null;
                }
                jSONArray.put(string);
            }
            return jSONArray;
        } catch (Throwable unused) {
            RendererWakeupListener.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
            read(str);
            return null;
        }
    }

    private final void read(String str) {
        generateMediaPeriodEventTime generatemediaperiodeventtime = lambdaonAudioDecoderReleased8.read(512, 1, str);
        this.write.read(generatemediaperiodeventtime);
        generatemediaperiodeventtime.RemoteActionCompatParcelizer();
        RendererWakeupListener.MediaMetadataCompat();
    }

    private final String AudioAttributesCompatParcelizer(Object obj) {
        String strIconCompatParcelizer = AnalyticsCollector.IconCompatParcelizer(obj);
        if (strIconCompatParcelizer == null) {
            return strIconCompatParcelizer;
        }
        generateMediaPeriodEventTime generatemediaperiodeventtime = lambdaonAudioDecoderInitialized4.read(strIconCompatParcelizer);
        if (generatemediaperiodeventtime.write() != 0) {
            this.write.read(generatemediaperiodeventtime);
        }
        if (generatemediaperiodeventtime.read() != null) {
            return generatemediaperiodeventtime.read().toString();
        }
        return null;
    }
}
