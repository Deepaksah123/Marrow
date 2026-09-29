package kotlin;

import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.getDefaultBottomTab;
import kotlin.getEditionUpdatePopup;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001:\u0002\u000b\u0012B\u001f\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\u000b\u001a\u0004\u0018\u00010\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\t2\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\nH\u0004¢\u0006\u0004\b\u000b\u0010\fR\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0014\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015\u0082\u0001\u0002\u0016\u0017"}, d2 = {"Lo/getPlanScreenConfig;", "Lo/getDefaultBottomTab;", "Ljava/lang/reflect/Method;", "p0", "", "Ljava/lang/reflect/Type;", "p1", "<init>", "(Ljava/lang/reflect/Method;Ljava/util/List;)V", "", "", "read", "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "RemoteActionCompatParcelizer", "Ljava/util/List;", "IconCompatParcelizer", "()Ljava/util/List;", "Ljava/lang/reflect/Type;", "AudioAttributesCompatParcelizer", "()Ljava/lang/reflect/Type;", "write", "Ljava/lang/reflect/Method;", "Lo/getPlanScreenConfig$read;", "Lo/getPlanScreenConfig$AudioAttributesCompatParcelizer;"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class getPlanScreenConfig implements getDefaultBottomTab<Method> {

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final List<Type> read;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final Type write;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final Method IconCompatParcelizer;

    @Override // kotlin.getDefaultBottomTab
    public final /* synthetic */ Member write() {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private getPlanScreenConfig(Method method, List<? extends Type> list) {
        this.IconCompatParcelizer = method;
        this.read = list;
        Class<?> returnType = method.getReturnType();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(returnType, "");
        this.write = returnType;
    }

    public final void write(Object[] objArr) {
        getDefaultBottomTab.AudioAttributesCompatParcelizer.read(this, objArr);
    }

    @Override // kotlin.getDefaultBottomTab
    public final List<Type> IconCompatParcelizer() {
        return this.read;
    }

    @Override // kotlin.getDefaultBottomTab
    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final Type getWrite() {
        return this.write;
    }

    protected final Object read(Object p0, Object[] p1) {
        toMagicModuleMetaRepoModel.write(p1, "");
        return this.IconCompatParcelizer.invoke(p0, Arrays.copyOf(p1, p1.length));
    }

    public /* synthetic */ getPlanScreenConfig(Method method, List list, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(method, list);
    }

    public static final class AudioAttributesCompatParcelizer extends getPlanScreenConfig {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AudioAttributesCompatParcelizer(Method method) {
            super(method, IntermediateLoginResponseBody.RemoteActionCompatParcelizer(method.getDeclaringClass()), null);
            toMagicModuleMetaRepoModel.write(method, "");
        }

        @Override // kotlin.getDefaultBottomTab
        public final Object RemoteActionCompatParcelizer(Object[] objArr) {
            Object[] objArrIconCompatParcelizer;
            toMagicModuleMetaRepoModel.write(objArr, "");
            write(objArr);
            Object obj = objArr[0];
            getEditionUpdatePopup.Companion companion = getEditionUpdatePopup.INSTANCE;
            if (objArr.length > 1) {
                objArrIconCompatParcelizer = getOrderDetails.IconCompatParcelizer(objArr, 1, objArr.length);
            } else {
                objArrIconCompatParcelizer = new Object[0];
            }
            return read(obj, objArrIconCompatParcelizer);
        }
    }

    public static final class read extends getPlanScreenConfig implements getEditionSwitch {
        private final Object IconCompatParcelizer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public read(Method method, Object obj) {
            super(method, IntermediateLoginResponseBody.RemoteActionCompatParcelizer(), null);
            toMagicModuleMetaRepoModel.write(method, "");
            this.IconCompatParcelizer = obj;
        }

        @Override // kotlin.getDefaultBottomTab
        public final Object RemoteActionCompatParcelizer(Object[] objArr) {
            toMagicModuleMetaRepoModel.write(objArr, "");
            write(objArr);
            return read(this.IconCompatParcelizer, objArr);
        }
    }
}
