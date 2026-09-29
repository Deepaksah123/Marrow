package kotlin;

import android.os.Bundle;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.setOnChartValueSelectedListener;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00142\u00020\u0001:\u0002\u001b\u0014B\u001f\b\u0016\u0012\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006B\t\b\u0016¢\u0006\u0004\b\u0005\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\t\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u0003H\u0086\u0002¢\u0006\u0004\b\t\u0010\fJ)\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f\"\u0004\b\u0000\u0010\r2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00028\u0000¢\u0006\u0004\b\u0010\u0010\u0011J \u0010\u0010\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\r2\u0006\u0010\u0004\u001a\u00020\u0003H\u0086\u0002¢\u0006\u0004\b\u0010\u0010\u0012J(\u0010\u0014\u001a\u00020\u0013\"\u0004\b\u0000\u0010\r2\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u000e\u001a\u0004\u0018\u00018\u0000H\u0086\u0002¢\u0006\u0004\b\u0014\u0010\u0015R$\u0010\u0019\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00170\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0018R\u0016\u0010\u0014\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c"}, d2 = {"Lo/POJOPropertyBuilder5;", "", "", "", "p0", "<init>", "(Ljava/util/Map;)V", "()V", "Lo/setOnChartValueSelectedListener$AudioAttributesCompatParcelizer;", "IconCompatParcelizer", "()Lo/setOnChartValueSelectedListener$AudioAttributesCompatParcelizer;", "", "(Ljava/lang/String;)Z", "T", "p1", "Lo/setUpdatedStatus;", "write", "(Ljava/lang/String;Ljava/lang/Object;)Lo/setUpdatedStatus;", "(Ljava/lang/String;)Ljava/lang/Object;", "", "AudioAttributesCompatParcelizer", "(Ljava/lang/String;Ljava/lang/Object;)V", "", "Lo/POJOPropertyBuilder5$read;", "Ljava/util/Map;", "RemoteActionCompatParcelizer", "Lo/withCreatorVisibility;", "read", "Lo/withCreatorVisibility;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class POJOPropertyBuilder5 {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private withCreatorVisibility AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final Map<String, read<?>> RemoteActionCompatParcelizer;

    public POJOPropertyBuilder5(Map<String, ? extends Object> map) {
        toMagicModuleMetaRepoModel.write(map, "");
        this.RemoteActionCompatParcelizer = new LinkedHashMap();
        this.AudioAttributesCompatParcelizer = new withCreatorVisibility(map);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public POJOPropertyBuilder5() {
        this.RemoteActionCompatParcelizer = new LinkedHashMap();
        this.AudioAttributesCompatParcelizer = new withCreatorVisibility(null, 1, 0 == true ? 1 : 0);
    }

    public final setOnChartValueSelectedListener.AudioAttributesCompatParcelizer IconCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer.getAudioAttributesCompatParcelizer();
    }

    public final boolean IconCompatParcelizer(String p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return this.AudioAttributesCompatParcelizer.IconCompatParcelizer(p0);
    }

    public final <T> setUpdatedStatus<T> write(String p0, T p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        if (this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer().containsKey(p0)) {
            return VerifyNewNumberRequest.read((getResolutionSize) this.AudioAttributesCompatParcelizer.read(p0, p1));
        }
        return this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(p0, p1);
    }

    public final <T> T write(String p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return (T) this.AudioAttributesCompatParcelizer.write(p0);
    }

    public final <T> void AudioAttributesCompatParcelizer(String p0, T p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        if (!Companion.IconCompatParcelizer(p1)) {
            StringBuilder sb = new StringBuilder("Can't put value with type ");
            toMagicModuleMetaRepoModel.write(p1);
            sb.append(p1.getClass());
            sb.append(" into saved state");
            throw new IllegalArgumentException(sb.toString().toString());
        }
        read<?> readVar = this.RemoteActionCompatParcelizer.get(p0);
        read<?> readVar2 = readVar instanceof POJOPropertyBuilder2 ? readVar : null;
        if (readVar2 != null) {
            readVar2.IconCompatParcelizer(p1);
        }
        this.AudioAttributesCompatParcelizer.write(p0, p1);
    }

    public static final class read<T> extends POJOPropertyBuilder2<T> {
        private POJOPropertyBuilder5 write;

        @Override // kotlin.POJOPropertyBuilder2, kotlin.removeIgnored
        public final void IconCompatParcelizer(T t) {
            super.IconCompatParcelizer(t);
        }
    }

    /* JADX INFO: renamed from: o.POJOPropertyBuilder5$AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J(\u0010\u0004\u001a\u00020\u00052\u000e\u0010\u0006\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\b2\u000e\u0010\t\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\bH\u0007J\u0012\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001H\u0007¨\u0006\r"}, d2 = {"Landroidx/lifecycle/SavedStateHandle$Companion;", "", "<init>", "()V", "createHandle", "Landroidx/lifecycle/SavedStateHandle;", "restoredState", "Landroid/os/Bundle;", "Landroidx/savedstate/SavedState;", "defaultState", "validateValue", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @getMagicModuleMeta
        public static POJOPropertyBuilder5 IconCompatParcelizer(Bundle bundle, Bundle bundle2) {
            if (bundle == null) {
                bundle = bundle2;
            }
            if (bundle == null) {
                return new POJOPropertyBuilder5();
            }
            ClassLoader classLoader = POJOPropertyBuilder5.class.getClassLoader();
            toMagicModuleMetaRepoModel.write(classLoader);
            bundle.setClassLoader(classLoader);
            return new POJOPropertyBuilder5(setUnbindEnabled.AudioAttributesCompatParcelizer(setUnbindEnabled.RemoteActionCompatParcelizer(bundle)));
        }

        public static boolean IconCompatParcelizer(Object obj) {
            return withSetterVisibility.RemoteActionCompatParcelizer(obj);
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }
}
