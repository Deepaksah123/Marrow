package kotlin;

import com.clevertap.android.sdk.CleverTapInstanceConfig;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR \u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00060\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f"}, d2 = {"Lo/TracksExternalSyntheticLambda0;", "", "<init>", "()V", "Lcom/clevertap/android/sdk/CleverTapInstanceConfig;", "p0", "Lo/isTypeSupported;", "AudioAttributesCompatParcelizer", "(Lcom/clevertap/android/sdk/CleverTapInstanceConfig;)Lo/isTypeSupported;", "Ljava/util/concurrent/ConcurrentHashMap;", "", "IconCompatParcelizer", "Ljava/util/concurrent/ConcurrentHashMap;", "RemoteActionCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TracksExternalSyntheticLambda0 {
    public static final TracksExternalSyntheticLambda0 INSTANCE = new TracksExternalSyntheticLambda0();

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private static final ConcurrentHashMap<String, isTypeSupported> RemoteActionCompatParcelizer = new ConcurrentHashMap<>();

    private TracksExternalSyntheticLambda0() {
    }

    @getMagicModuleMeta
    public static final isTypeSupported AudioAttributesCompatParcelizer(final CleverTapInstanceConfig p0) {
        if (p0 == null) {
            throw new IllegalArgumentException("Can't create task for null config".toString());
        }
        String strWrite = p0.write();
        ConcurrentHashMap<String, isTypeSupported> concurrentHashMap = RemoteActionCompatParcelizer;
        final getAnswerMap getanswermap = new getAnswerMap() { // from class: o.TracksGroup
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return TracksExternalSyntheticLambda0.read(p0, (String) obj);
            }
        };
        isTypeSupported istypesupportedComputeIfAbsent = concurrentHashMap.computeIfAbsent(strWrite, new Function() { // from class: o.isTypeSupportedOrEmpty
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return TracksExternalSyntheticLambda0.read(getanswermap, obj);
            }
        });
        toMagicModuleMetaRepoModel.write(istypesupportedComputeIfAbsent);
        return istypesupportedComputeIfAbsent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final isTypeSupported read(CleverTapInstanceConfig cleverTapInstanceConfig, String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return new isTypeSupported(cleverTapInstanceConfig);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final isTypeSupported read(getAnswerMap getanswermap, Object obj) {
        toMagicModuleMetaRepoModel.write(getanswermap, "");
        return (isTypeSupported) getanswermap.invoke(obj);
    }
}
