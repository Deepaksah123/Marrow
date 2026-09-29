package kotlin;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
public final class KotlinInstantiators<Key, Value> implements filterOutSingleStringCallables<Key, Value> {
    private final CopyOnWriteArrayList<KotlinNamesAnnotationIntrospectorhasCreatorAnnotation2<Key, Value>> AudioAttributesCompatParcelizer;
    private final getCreatedOnDateMs<KotlinNamesAnnotationIntrospectorhasCreatorAnnotation2<Key, Value>> RemoteActionCompatParcelizer;

    /* JADX WARN: Multi-variable type inference failed */
    public KotlinInstantiators(getCreatedOnDateMs<? extends KotlinNamesAnnotationIntrospectorhasCreatorAnnotation2<Key, Value>> getcreatedondatems) {
        toMagicModuleMetaRepoModel.write(getcreatedondatems, "");
        this.RemoteActionCompatParcelizer = getcreatedondatems;
        this.AudioAttributesCompatParcelizer = new CopyOnWriteArrayList<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.getCreatedOnDateMs
    /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public KotlinNamesAnnotationIntrospectorhasCreatorAnnotation2<Key, Value> invoke() {
        KotlinNamesAnnotationIntrospectorhasCreatorAnnotation2<Key, Value> kotlinNamesAnnotationIntrospectorhasCreatorAnnotation2Invoke = this.RemoteActionCompatParcelizer.invoke();
        this.AudioAttributesCompatParcelizer.add(kotlinNamesAnnotationIntrospectorhasCreatorAnnotation2Invoke);
        return kotlinNamesAnnotationIntrospectorhasCreatorAnnotation2Invoke;
    }

    public final void RemoteActionCompatParcelizer() {
        for (KotlinNamesAnnotationIntrospectorhasCreatorAnnotation2<Key, Value> kotlinNamesAnnotationIntrospectorhasCreatorAnnotation2 : this.AudioAttributesCompatParcelizer) {
            if (!kotlinNamesAnnotationIntrospectorhasCreatorAnnotation2.AudioAttributesCompatParcelizer()) {
                kotlinNamesAnnotationIntrospectorhasCreatorAnnotation2.IconCompatParcelizer();
            }
        }
        IntermediateLoginResponseBody.read((List) this.AudioAttributesCompatParcelizer, (getAnswerMap) AnonymousClass1.RemoteActionCompatParcelizer);
    }

    /* JADX INFO: renamed from: o.KotlinInstantiators$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00002\"\u0010\u0004\u001a\u001e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "Key", "Value", "Lo/KotlinNamesAnnotationIntrospectorhasCreatorAnnotation2;", "p0", "", "read", "(Lo/KotlinNamesAnnotationIntrospectorhasCreatorAnnotation2;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass1 extends MagicModuleUseCase implements getAnswerMap<KotlinNamesAnnotationIntrospectorhasCreatorAnnotation2<Key, Value>, Boolean> {
        public static final AnonymousClass1 RemoteActionCompatParcelizer = new AnonymousClass1();

        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(KotlinNamesAnnotationIntrospectorhasCreatorAnnotation2<Key, Value> kotlinNamesAnnotationIntrospectorhasCreatorAnnotation2) {
            return Boolean.valueOf(kotlinNamesAnnotationIntrospectorhasCreatorAnnotation2.AudioAttributesCompatParcelizer());
        }

        AnonymousClass1() {
            super(1);
        }
    }
}
