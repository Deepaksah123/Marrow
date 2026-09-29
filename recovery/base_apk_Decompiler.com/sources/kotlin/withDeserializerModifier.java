package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a'\u0010\u0004\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Lo/valueInstantiators;", "Lo/MapperConfig;", "p0", "read", "(Lo/valueInstantiators;Lo/MapperConfig;)Ljava/lang/Object;"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class withDeserializerModifier {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: o.withDeserializerModifier$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0003\u0010\u0001\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"T", "invoke", "()Ljava/lang/Object;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass1<T> extends MagicModuleUseCase implements getCreatedOnDateMs<T> {
        public static final AnonymousClass1 RemoteActionCompatParcelizer = new AnonymousClass1();

        @Override // kotlin.getCreatedOnDateMs
        public final T invoke() {
            return null;
        }

        AnonymousClass1() {
            super(0);
        }
    }

    public static final <T> T read(C0216valueInstantiators c0216valueInstantiators, MapperConfig<T> mapperConfig) {
        return (T) c0216valueInstantiators.read(mapperConfig, AnonymousClass1.RemoteActionCompatParcelizer);
    }
}
