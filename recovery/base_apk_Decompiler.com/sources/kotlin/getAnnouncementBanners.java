package kotlin;

import java.lang.reflect.Method;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
public final class getAnnouncementBanners {

    /* JADX INFO: renamed from: o.getAnnouncementBanners$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0001\u001a\u000e\u0012\u0002\b\u0003*\u0006\u0012\u0002\b\u00030\u00000\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ljava/lang/Class;", "p0", "", "write", "(Ljava/lang/Class;)Ljava/lang/CharSequence;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass2 extends MagicModuleUseCase implements getAnswerMap<Class<?>, CharSequence> {
        public static final AnonymousClass2 read = new AnonymousClass2();

        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(Class<?> cls) {
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(cls, "");
            return getFinalImageUrl.IconCompatParcelizer(cls);
        }

        AnonymousClass2() {
            super(1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String write(Method method) {
        StringBuilder sb = new StringBuilder();
        sb.append(method.getName());
        Class<?>[] parameterTypes = method.getParameterTypes();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(parameterTypes, "");
        sb.append(getOrderDetails.RemoteActionCompatParcelizer(parameterTypes, "", "(", ")", 0, (CharSequence) null, AnonymousClass2.read, 24));
        Class<?> returnType = method.getReturnType();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(returnType, "");
        sb.append(getFinalImageUrl.IconCompatParcelizer(returnType));
        return sb.toString();
    }
}
