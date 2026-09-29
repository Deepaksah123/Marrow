package kotlin;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.getSchemaTitle;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0005\u0007\b\t\n\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0001\u0005\u000b\f\r\u000e\u000f"}, d2 = {"Lo/ContentResetResponseLesson;", "", "<init>", "()V", "", "IconCompatParcelizer", "()Ljava/lang/String;", "write", "read", "RemoteActionCompatParcelizer", "AudioAttributesCompatParcelizer", "Lo/ContentResetResponseLesson$write;", "Lo/ContentResetResponseLesson$read;", "Lo/ContentResetResponseLesson$RemoteActionCompatParcelizer;", "Lo/ContentResetResponseLesson$AudioAttributesCompatParcelizer;", "Lo/ContentResetResponseLesson$IconCompatParcelizer;"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class ContentResetResponseLesson {
    public abstract String IconCompatParcelizer();

    private ContentResetResponseLesson() {
    }

    public /* synthetic */ ContentResetResponseLesson(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this();
    }

    public static final class IconCompatParcelizer extends ContentResetResponseLesson {
        private final String IconCompatParcelizer;
        private final getSchemaTitle.IconCompatParcelizer RemoteActionCompatParcelizer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IconCompatParcelizer(getSchemaTitle.IconCompatParcelizer iconCompatParcelizer) {
            super(null);
            toMagicModuleMetaRepoModel.write(iconCompatParcelizer, "");
            this.RemoteActionCompatParcelizer = iconCompatParcelizer;
            this.IconCompatParcelizer = iconCompatParcelizer.IconCompatParcelizer();
        }

        public final String AudioAttributesCompatParcelizer() {
            return this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer();
        }

        public final String RemoteActionCompatParcelizer() {
            return this.RemoteActionCompatParcelizer.write();
        }

        @Override // kotlin.ContentResetResponseLesson
        public final String IconCompatParcelizer() {
            return this.IconCompatParcelizer;
        }
    }

    public static final class AudioAttributesCompatParcelizer extends ContentResetResponseLesson {
        private final String IconCompatParcelizer;
        private final getSchemaTitle.IconCompatParcelizer read;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AudioAttributesCompatParcelizer(getSchemaTitle.IconCompatParcelizer iconCompatParcelizer) {
            super(null);
            toMagicModuleMetaRepoModel.write(iconCompatParcelizer, "");
            this.read = iconCompatParcelizer;
            this.IconCompatParcelizer = iconCompatParcelizer.IconCompatParcelizer();
        }

        public final String RemoteActionCompatParcelizer() {
            return this.read.write();
        }

        @Override // kotlin.ContentResetResponseLesson
        public final String IconCompatParcelizer() {
            return this.IconCompatParcelizer;
        }
    }

    public static final class RemoteActionCompatParcelizer extends ContentResetResponseLesson {
        private final Method write;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RemoteActionCompatParcelizer(Method method) {
            super(null);
            toMagicModuleMetaRepoModel.write(method, "");
            this.write = method;
        }

        public final Method RemoteActionCompatParcelizer() {
            return this.write;
        }

        @Override // kotlin.ContentResetResponseLesson
        public final String IconCompatParcelizer() {
            return getAnnouncementBanners.write(this.write);
        }
    }

    public static final class read extends ContentResetResponseLesson {
        private final Constructor<?> read;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public read(Constructor<?> constructor) {
            super(null);
            toMagicModuleMetaRepoModel.write(constructor, "");
            this.read = constructor;
        }

        public final Constructor<?> AudioAttributesCompatParcelizer() {
            return this.read;
        }

        /* JADX INFO: renamed from: o.ContentResetResponseLesson$read$4, reason: invalid class name */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0001\u001a\u000e\u0012\u0002\b\u0003*\u0006\u0012\u0002\b\u00030\u00000\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ljava/lang/Class;", "p0", "", "AudioAttributesCompatParcelizer", "(Ljava/lang/Class;)Ljava/lang/CharSequence;"}, k = 3, mv = {1, 8, 0}, xi = 48)
        static final class AnonymousClass4 extends MagicModuleUseCase implements getAnswerMap<Class<?>, CharSequence> {
            public static final AnonymousClass4 RemoteActionCompatParcelizer = new AnonymousClass4();

            @Override // kotlin.getAnswerMap
            /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
            public final CharSequence invoke(Class<?> cls) {
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(cls, "");
                return getFinalImageUrl.IconCompatParcelizer(cls);
            }

            AnonymousClass4() {
                super(1);
            }
        }

        @Override // kotlin.ContentResetResponseLesson
        public final String IconCompatParcelizer() {
            Class<?>[] parameterTypes = this.read.getParameterTypes();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(parameterTypes, "");
            return getOrderDetails.RemoteActionCompatParcelizer(parameterTypes, "", "<init>(", ")V", 0, (CharSequence) null, AnonymousClass4.RemoteActionCompatParcelizer, 24);
        }
    }

    public static final class write extends ContentResetResponseLesson {
        private final Class<?> IconCompatParcelizer;
        private final List<Method> write;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public write(Class<?> cls) {
            super(null);
            toMagicModuleMetaRepoModel.write(cls, "");
            this.IconCompatParcelizer = cls;
            Method[] declaredMethods = cls.getDeclaredMethods();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(declaredMethods, "");
            this.write = getOrderDetails.RemoteActionCompatParcelizer((Object[]) declaredMethods, new Comparator() { // from class: o.ContentResetResponseLesson.write.4
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return getConfigExpirySeconds.read(((Method) t).getName(), ((Method) t2).getName());
                }
            });
        }

        public final List<Method> AudioAttributesCompatParcelizer() {
            return this.write;
        }

        /* JADX INFO: renamed from: o.ContentResetResponseLesson$write$3, reason: invalid class name */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\n\u0010\u0001\u001a\u0006*\u00020\u00000\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ljava/lang/reflect/Method;", "p0", "", "read", "(Ljava/lang/reflect/Method;)Ljava/lang/CharSequence;"}, k = 3, mv = {1, 8, 0}, xi = 48)
        static final class AnonymousClass3 extends MagicModuleUseCase implements getAnswerMap<Method, CharSequence> {
            public static final AnonymousClass3 AudioAttributesCompatParcelizer = new AnonymousClass3();

            @Override // kotlin.getAnswerMap
            /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
            public final CharSequence invoke(Method method) {
                Class<?> returnType = method.getReturnType();
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(returnType, "");
                return getFinalImageUrl.IconCompatParcelizer(returnType);
            }

            AnonymousClass3() {
                super(1);
            }
        }

        @Override // kotlin.ContentResetResponseLesson
        public final String IconCompatParcelizer() {
            return IntermediateLoginResponseBody.RemoteActionCompatParcelizer(this.write, "", "<init>(", ")V", 0, null, AnonymousClass3.AudioAttributesCompatParcelizer, 24);
        }
    }
}
