package kotlin;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.getDefaultBottomTab;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u0000 \u0015*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003:\b\u0011\u000f\u0019\u0015\u0013\u001e\u001f B5\b\u0004\u0012\u0006\u0010\u0004\u001a\u00028\u0000\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\b\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\t¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0004\u001a\u0004\u0018\u00010\rH\u0004¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0015\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00078\u0007¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0013\u001a\u00028\u00008\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R \u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00050\u00188\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001bR\u001a\u0010\u000f\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u001c\u001a\u0004\b\u000f\u0010\u001d\u0082\u0001\u0007!\"#$%&'"}, d2 = {"Lo/getEditionUpdatePopup;", "Ljava/lang/reflect/Member;", "M", "Lo/getDefaultBottomTab;", "p0", "Ljava/lang/reflect/Type;", "p1", "Ljava/lang/Class;", "p2", "", "p3", "<init>", "(Ljava/lang/reflect/Member;Ljava/lang/reflect/Type;Ljava/lang/Class;[Ljava/lang/reflect/Type;)V", "", "", "AudioAttributesCompatParcelizer", "(Ljava/lang/Object;)V", "read", "Ljava/lang/Class;", "RemoteActionCompatParcelizer", "()Ljava/lang/Class;", "write", "Ljava/lang/reflect/Member;", "()Ljava/lang/reflect/Member;", "", "IconCompatParcelizer", "Ljava/util/List;", "()Ljava/util/List;", "Ljava/lang/reflect/Type;", "()Ljava/lang/reflect/Type;", "MediaBrowserCompatItemReceiver", "AudioAttributesImplBaseParcelizer", "AudioAttributesImplApi21Parcelizer", "Lo/getEditionUpdatePopup$read;", "Lo/getEditionUpdatePopup$AudioAttributesCompatParcelizer;", "Lo/getEditionUpdatePopup$IconCompatParcelizer;", "Lo/getEditionUpdatePopup$RemoteActionCompatParcelizer;", "Lo/getEditionUpdatePopup$MediaBrowserCompatItemReceiver;", "Lo/getEditionUpdatePopup$AudioAttributesImplBaseParcelizer;", "Lo/getEditionUpdatePopup$AudioAttributesImplApi21Parcelizer;"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class getEditionUpdatePopup<M extends Member> implements getDefaultBottomTab<M> {

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(0);

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final M RemoteActionCompatParcelizer;
    private final List<Type> IconCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final Type AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final Class<?> write;

    /* JADX WARN: Removed duplicated region for block: B:6:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private getEditionUpdatePopup(M r1, java.lang.reflect.Type r2, java.lang.Class<?> r3, java.lang.reflect.Type[] r4) {
        /*
            r0 = this;
            r0.<init>()
            r0.RemoteActionCompatParcelizer = r1
            r0.AudioAttributesCompatParcelizer = r2
            r0.write = r3
            if (r3 == 0) goto L27
            o.MagicModuleMetaUcModel r1 = new o.MagicModuleMetaUcModel
            r2 = 2
            r1.<init>(r2)
            r1.read(r3)
            r1.write(r4)
            int r2 = r1.RemoteActionCompatParcelizer()
            java.lang.reflect.Type[] r2 = new java.lang.reflect.Type[r2]
            java.lang.Object[] r1 = r1.write(r2)
            java.util.List r1 = kotlin.IntermediateLoginResponseBody.RemoteActionCompatParcelizer(r1)
            if (r1 != 0) goto L2b
        L27:
            java.util.List r1 = kotlin.getOrderDetails.onCommand(r4)
        L2b:
            r0.IconCompatParcelizer = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getEditionUpdatePopup.<init>(java.lang.reflect.Member, java.lang.reflect.Type, java.lang.Class, java.lang.reflect.Type[]):void");
    }

    public void read(Object[] objArr) {
        getDefaultBottomTab.AudioAttributesCompatParcelizer.read(this, objArr);
    }

    @Override // kotlin.getDefaultBottomTab
    public final M write() {
        return this.RemoteActionCompatParcelizer;
    }

    @Override // kotlin.getDefaultBottomTab
    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final Type getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final Class<?> RemoteActionCompatParcelizer() {
        return this.write;
    }

    @Override // kotlin.getDefaultBottomTab
    public final List<Type> IconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    protected final void AudioAttributesCompatParcelizer(Object p0) {
        if (p0 == null || !this.RemoteActionCompatParcelizer.getDeclaringClass().isInstance(p0)) {
            throw new IllegalArgumentException("An object member requires the object instance passed as the first argument.");
        }
    }

    public /* synthetic */ getEditionUpdatePopup(Member member, Type type, Class cls, Type[] typeArr, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(member, type, cls, typeArr);
    }

    public static final class RemoteActionCompatParcelizer extends getEditionUpdatePopup<Constructor<?>> {
        /* JADX WARN: Illegal instructions before constructor call */
        public RemoteActionCompatParcelizer(Constructor<?> constructor) {
            toMagicModuleMetaRepoModel.write(constructor, "");
            Constructor<?> constructor2 = constructor;
            Class<?> declaringClass = constructor.getDeclaringClass();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(declaringClass, "");
            Class<?> cls = declaringClass;
            Class<?> declaringClass2 = constructor.getDeclaringClass();
            Class<?> declaringClass3 = declaringClass2.getDeclaringClass();
            declaringClass3 = (declaringClass3 == null || Modifier.isStatic(declaringClass2.getModifiers())) ? null : declaringClass3;
            Type[] genericParameterTypes = constructor.getGenericParameterTypes();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(genericParameterTypes, "");
            super(constructor2, cls, declaringClass3, genericParameterTypes, null);
        }

        @Override // kotlin.getDefaultBottomTab
        public final Object RemoteActionCompatParcelizer(Object[] objArr) {
            toMagicModuleMetaRepoModel.write(objArr, "");
            read(objArr);
            return write().newInstance(Arrays.copyOf(objArr, objArr.length));
        }
    }

    public static final class IconCompatParcelizer extends getEditionUpdatePopup<Constructor<?>> implements getEditionSwitch {
        private final Object RemoteActionCompatParcelizer;

        /* JADX WARN: Illegal instructions before constructor call */
        public IconCompatParcelizer(Constructor<?> constructor, Object obj) {
            toMagicModuleMetaRepoModel.write(constructor, "");
            Class<?> declaringClass = constructor.getDeclaringClass();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(declaringClass, "");
            Type[] genericParameterTypes = constructor.getGenericParameterTypes();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(genericParameterTypes, "");
            super(constructor, declaringClass, null, genericParameterTypes, null);
            this.RemoteActionCompatParcelizer = obj;
        }

        @Override // kotlin.getDefaultBottomTab
        public final Object RemoteActionCompatParcelizer(Object[] objArr) {
            toMagicModuleMetaRepoModel.write(objArr, "");
            read(objArr);
            Constructor<?> constructorWrite = write();
            MagicModuleMetaUcModel magicModuleMetaUcModel = new MagicModuleMetaUcModel(2);
            magicModuleMetaUcModel.read(this.RemoteActionCompatParcelizer);
            magicModuleMetaUcModel.write((Object) objArr);
            return constructorWrite.newInstance(magicModuleMetaUcModel.write(new Object[magicModuleMetaUcModel.RemoteActionCompatParcelizer()]));
        }
    }

    public static final class AudioAttributesCompatParcelizer extends getEditionUpdatePopup<Constructor<?>> {
        /* JADX WARN: Illegal instructions before constructor call */
        public AudioAttributesCompatParcelizer(Constructor<?> constructor) {
            Object objIconCompatParcelizer;
            toMagicModuleMetaRepoModel.write(constructor, "");
            Constructor<?> constructor2 = constructor;
            Class<?> declaringClass = constructor.getDeclaringClass();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(declaringClass, "");
            Class<?> cls = declaringClass;
            Type[] genericParameterTypes = constructor.getGenericParameterTypes();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(genericParameterTypes, "");
            Type[] typeArr = genericParameterTypes;
            if (typeArr.length > 1) {
                objIconCompatParcelizer = getOrderDetails.IconCompatParcelizer(typeArr, 0, typeArr.length - 1);
            } else {
                objIconCompatParcelizer = new Type[0];
            }
            super(constructor2, cls, null, (Type[]) objIconCompatParcelizer, null);
        }

        @Override // kotlin.getDefaultBottomTab
        public final Object RemoteActionCompatParcelizer(Object[] objArr) {
            toMagicModuleMetaRepoModel.write(objArr, "");
            read(objArr);
            Constructor<?> constructorWrite = write();
            MagicModuleMetaUcModel magicModuleMetaUcModel = new MagicModuleMetaUcModel(2);
            magicModuleMetaUcModel.write((Object) objArr);
            magicModuleMetaUcModel.read(null);
            return constructorWrite.newInstance(magicModuleMetaUcModel.write(new Object[magicModuleMetaUcModel.RemoteActionCompatParcelizer()]));
        }
    }

    public static final class read extends getEditionUpdatePopup<Constructor<?>> implements getEditionSwitch {
        private final Object AudioAttributesCompatParcelizer;

        /* JADX WARN: Illegal instructions before constructor call */
        public read(Constructor<?> constructor, Object obj) {
            Object objIconCompatParcelizer;
            toMagicModuleMetaRepoModel.write(constructor, "");
            Constructor<?> constructor2 = constructor;
            Class<?> declaringClass = constructor.getDeclaringClass();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(declaringClass, "");
            Class<?> cls = declaringClass;
            Type[] genericParameterTypes = constructor.getGenericParameterTypes();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(genericParameterTypes, "");
            Type[] typeArr = genericParameterTypes;
            if (typeArr.length > 2) {
                objIconCompatParcelizer = getOrderDetails.IconCompatParcelizer(typeArr, 1, typeArr.length - 1);
            } else {
                objIconCompatParcelizer = new Type[0];
            }
            super(constructor2, cls, null, (Type[]) objIconCompatParcelizer, null);
            this.AudioAttributesCompatParcelizer = obj;
        }

        @Override // kotlin.getDefaultBottomTab
        public final Object RemoteActionCompatParcelizer(Object[] objArr) {
            toMagicModuleMetaRepoModel.write(objArr, "");
            read(objArr);
            Constructor<?> constructorWrite = write();
            MagicModuleMetaUcModel magicModuleMetaUcModel = new MagicModuleMetaUcModel(3);
            magicModuleMetaUcModel.read(this.AudioAttributesCompatParcelizer);
            magicModuleMetaUcModel.write((Object) objArr);
            magicModuleMetaUcModel.read(null);
            return constructorWrite.newInstance(magicModuleMetaUcModel.write(new Object[magicModuleMetaUcModel.RemoteActionCompatParcelizer()]));
        }
    }

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0006\f\u0010\u000e\u0011\u0012\u0013B+\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ'\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u000b2\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0006H\u0004¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f\u0082\u0001\u0006\u0014\u0015\u0016\u0017\u0018\u0019"}, d2 = {"Lo/getEditionUpdatePopup$AudioAttributesImplApi21Parcelizer;", "Lo/getEditionUpdatePopup;", "Ljava/lang/reflect/Method;", "p0", "", "p1", "", "Ljava/lang/reflect/Type;", "p2", "<init>", "(Ljava/lang/reflect/Method;Z[Ljava/lang/reflect/Type;)V", "", "write", "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "AudioAttributesCompatParcelizer", "Z", "IconCompatParcelizer", "RemoteActionCompatParcelizer", "read", "MediaBrowserCompatItemReceiver", "Lo/getEditionUpdatePopup$AudioAttributesImplApi21Parcelizer$write;", "Lo/getEditionUpdatePopup$AudioAttributesImplApi21Parcelizer$IconCompatParcelizer;", "Lo/getEditionUpdatePopup$AudioAttributesImplApi21Parcelizer$AudioAttributesCompatParcelizer;", "Lo/getEditionUpdatePopup$AudioAttributesImplApi21Parcelizer$RemoteActionCompatParcelizer;", "Lo/getEditionUpdatePopup$AudioAttributesImplApi21Parcelizer$read;", "Lo/getEditionUpdatePopup$AudioAttributesImplApi21Parcelizer$MediaBrowserCompatItemReceiver;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static abstract class AudioAttributesImplApi21Parcelizer extends getEditionUpdatePopup<Method> {

        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
        private final boolean write;

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ AudioAttributesImplApi21Parcelizer(Method method, boolean z, Type[] typeArr, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            z = (i & 2) != 0 ? !Modifier.isStatic(method.getModifiers()) : z;
            if ((i & 4) != 0) {
                typeArr = method.getGenericParameterTypes();
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(typeArr, "");
            }
            this(method, z, typeArr, null);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        private AudioAttributesImplApi21Parcelizer(Method method, boolean z, Type[] typeArr) {
            Method method2 = method;
            Type genericReturnType = method.getGenericReturnType();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(genericReturnType, "");
            super(method2, genericReturnType, z ? method.getDeclaringClass() : null, typeArr, null);
            this.write = toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(getAudioAttributesCompatParcelizer(), Void.TYPE);
        }

        protected final Object write(Object p0, Object[] p1) {
            toMagicModuleMetaRepoModel.write(p1, "");
            return this.write ? getShowPopup.INSTANCE : write().invoke(p0, Arrays.copyOf(p1, p1.length));
        }

        public /* synthetic */ AudioAttributesImplApi21Parcelizer(Method method, boolean z, Type[] typeArr, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this(method, z, typeArr);
        }

        public static final class MediaBrowserCompatItemReceiver extends AudioAttributesImplApi21Parcelizer {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public MediaBrowserCompatItemReceiver(Method method) {
                super(method, false, null, 6, null);
                toMagicModuleMetaRepoModel.write(method, "");
            }

            @Override // kotlin.getDefaultBottomTab
            public final Object RemoteActionCompatParcelizer(Object[] objArr) {
                toMagicModuleMetaRepoModel.write(objArr, "");
                read(objArr);
                return write(null, objArr);
            }
        }

        public static final class RemoteActionCompatParcelizer extends AudioAttributesImplApi21Parcelizer {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public RemoteActionCompatParcelizer(Method method) {
                super(method, false, null, 6, null);
                toMagicModuleMetaRepoModel.write(method, "");
            }

            @Override // kotlin.getDefaultBottomTab
            public final Object RemoteActionCompatParcelizer(Object[] objArr) {
                Object[] objArrIconCompatParcelizer;
                toMagicModuleMetaRepoModel.write(objArr, "");
                read(objArr);
                Object obj = objArr[0];
                if (objArr.length > 1) {
                    objArrIconCompatParcelizer = getOrderDetails.IconCompatParcelizer(objArr, 1, objArr.length);
                } else {
                    objArrIconCompatParcelizer = new Object[0];
                }
                return write(obj, objArrIconCompatParcelizer);
            }
        }

        public static final class read extends AudioAttributesImplApi21Parcelizer {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public read(Method method) {
                super(method, true, null, 4, null);
                toMagicModuleMetaRepoModel.write(method, "");
            }

            @Override // kotlin.getDefaultBottomTab
            public final Object RemoteActionCompatParcelizer(Object[] objArr) {
                Object[] objArrIconCompatParcelizer;
                toMagicModuleMetaRepoModel.write(objArr, "");
                read(objArr);
                AudioAttributesCompatParcelizer(getOrderDetails.MediaBrowserCompatCustomActionResultReceiver(objArr));
                if (objArr.length > 1) {
                    objArrIconCompatParcelizer = getOrderDetails.IconCompatParcelizer(objArr, 1, objArr.length);
                } else {
                    objArrIconCompatParcelizer = new Object[0];
                }
                return write(null, objArrIconCompatParcelizer);
            }
        }

        public static final class AudioAttributesCompatParcelizer extends AudioAttributesImplApi21Parcelizer implements getEditionSwitch {
            private final Object RemoteActionCompatParcelizer;

            /* JADX WARN: Illegal instructions before constructor call */
            public AudioAttributesCompatParcelizer(Method method, Object obj) {
                Object objIconCompatParcelizer;
                toMagicModuleMetaRepoModel.write(method, "");
                Type[] genericParameterTypes = method.getGenericParameterTypes();
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(genericParameterTypes, "");
                Type[] typeArr = genericParameterTypes;
                boolean z = false;
                if (typeArr.length > 1) {
                    objIconCompatParcelizer = getOrderDetails.IconCompatParcelizer(typeArr, 1, typeArr.length);
                } else {
                    objIconCompatParcelizer = new Type[0];
                }
                super(method, z, (Type[]) objIconCompatParcelizer, null);
                this.RemoteActionCompatParcelizer = obj;
            }

            @Override // kotlin.getDefaultBottomTab
            public final Object RemoteActionCompatParcelizer(Object[] objArr) {
                toMagicModuleMetaRepoModel.write(objArr, "");
                read(objArr);
                MagicModuleMetaUcModel magicModuleMetaUcModel = new MagicModuleMetaUcModel(2);
                magicModuleMetaUcModel.read(this.RemoteActionCompatParcelizer);
                magicModuleMetaUcModel.write((Object) objArr);
                return write(null, magicModuleMetaUcModel.write(new Object[magicModuleMetaUcModel.RemoteActionCompatParcelizer()]));
            }
        }

        public static final class write extends AudioAttributesImplApi21Parcelizer implements getEditionSwitch {
            private final Object RemoteActionCompatParcelizer;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public write(Method method, Object obj) {
                super(method, false, null, 4, null);
                toMagicModuleMetaRepoModel.write(method, "");
                this.RemoteActionCompatParcelizer = obj;
            }

            @Override // kotlin.getDefaultBottomTab
            public final Object RemoteActionCompatParcelizer(Object[] objArr) {
                toMagicModuleMetaRepoModel.write(objArr, "");
                read(objArr);
                return write(this.RemoteActionCompatParcelizer, objArr);
            }
        }

        public static final class IconCompatParcelizer extends AudioAttributesImplApi21Parcelizer implements getEditionSwitch {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public IconCompatParcelizer(Method method) {
                super(method, false, null, 4, null);
                toMagicModuleMetaRepoModel.write(method, "");
            }

            @Override // kotlin.getDefaultBottomTab
            public final Object RemoteActionCompatParcelizer(Object[] objArr) {
                toMagicModuleMetaRepoModel.write(objArr, "");
                read(objArr);
                return write(null, objArr);
            }
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0005\f\r\n\u000e\u000fB\u0019\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\n\u001a\u0004\u0018\u00010\t2\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\bH\u0016¢\u0006\u0004\b\n\u0010\u000b\u0082\u0001\u0005\u0010\u0011\u0012\u0013\u0014"}, d2 = {"Lo/getEditionUpdatePopup$MediaBrowserCompatItemReceiver;", "Lo/getEditionUpdatePopup;", "Ljava/lang/reflect/Field;", "p0", "", "p1", "<init>", "(Ljava/lang/reflect/Field;Z)V", "", "", "RemoteActionCompatParcelizer", "([Ljava/lang/Object;)Ljava/lang/Object;", "AudioAttributesCompatParcelizer", "IconCompatParcelizer", "write", "read", "Lo/getEditionUpdatePopup$MediaBrowserCompatItemReceiver$AudioAttributesCompatParcelizer;", "Lo/getEditionUpdatePopup$MediaBrowserCompatItemReceiver$IconCompatParcelizer;", "Lo/getEditionUpdatePopup$MediaBrowserCompatItemReceiver$RemoteActionCompatParcelizer;", "Lo/getEditionUpdatePopup$MediaBrowserCompatItemReceiver$write;", "Lo/getEditionUpdatePopup$MediaBrowserCompatItemReceiver$read;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static abstract class MediaBrowserCompatItemReceiver extends getEditionUpdatePopup<Field> {
        /* JADX WARN: Illegal instructions before constructor call */
        private MediaBrowserCompatItemReceiver(Field field, boolean z) {
            Field field2 = field;
            Type genericType = field.getGenericType();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(genericType, "");
            super(field2, genericType, z ? field.getDeclaringClass() : null, new Type[0], null);
        }

        @Override // kotlin.getDefaultBottomTab
        public Object RemoteActionCompatParcelizer(Object[] p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            read(p0);
            return write().get(RemoteActionCompatParcelizer() != null ? getOrderDetails.AudioAttributesImplApi21Parcelizer(p0) : null);
        }

        public static final class read extends MediaBrowserCompatItemReceiver {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public read(Field field) {
                super(field, false, null);
                toMagicModuleMetaRepoModel.write(field, "");
            }
        }

        public static final class RemoteActionCompatParcelizer extends MediaBrowserCompatItemReceiver {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public RemoteActionCompatParcelizer(Field field) {
                super(field, true, null);
                toMagicModuleMetaRepoModel.write(field, "");
            }
        }

        public static final class write extends MediaBrowserCompatItemReceiver {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public write(Field field) {
                super(field, true, null);
                toMagicModuleMetaRepoModel.write(field, "");
            }

            @Override // kotlin.getEditionUpdatePopup
            public final void read(Object[] objArr) {
                toMagicModuleMetaRepoModel.write(objArr, "");
                super.read(objArr);
                AudioAttributesCompatParcelizer(getOrderDetails.MediaBrowserCompatCustomActionResultReceiver(objArr));
            }
        }

        public static final class AudioAttributesCompatParcelizer extends MediaBrowserCompatItemReceiver implements getEditionSwitch {
            private final Object RemoteActionCompatParcelizer;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AudioAttributesCompatParcelizer(Field field, Object obj) {
                super(field, false, null);
                toMagicModuleMetaRepoModel.write(field, "");
                this.RemoteActionCompatParcelizer = obj;
            }

            @Override // o.getEditionUpdatePopup.MediaBrowserCompatItemReceiver, kotlin.getDefaultBottomTab
            public final Object RemoteActionCompatParcelizer(Object[] objArr) {
                toMagicModuleMetaRepoModel.write(objArr, "");
                read(objArr);
                return write().get(this.RemoteActionCompatParcelizer);
            }
        }

        public static final class IconCompatParcelizer extends MediaBrowserCompatItemReceiver implements getEditionSwitch {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public IconCompatParcelizer(Field field) {
                super(field, false, null);
                toMagicModuleMetaRepoModel.write(field, "");
            }
        }

        public /* synthetic */ MediaBrowserCompatItemReceiver(Field field, boolean z, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this(field, z);
        }
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0005\u000b\u0012\u0013\u000e\u0010B!\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u000e\u001a\u00020\r2\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\tH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011\u0082\u0001\u0005\u0014\u0015\u0016\u0017\u0018"}, d2 = {"Lo/getEditionUpdatePopup$AudioAttributesImplBaseParcelizer;", "Lo/getEditionUpdatePopup;", "Ljava/lang/reflect/Field;", "p0", "", "p1", "p2", "<init>", "(Ljava/lang/reflect/Field;ZZ)V", "", "", "RemoteActionCompatParcelizer", "([Ljava/lang/Object;)Ljava/lang/Object;", "", "read", "([Ljava/lang/Object;)V", "IconCompatParcelizer", "Z", "AudioAttributesCompatParcelizer", "write", "Lo/getEditionUpdatePopup$AudioAttributesImplBaseParcelizer$RemoteActionCompatParcelizer;", "Lo/getEditionUpdatePopup$AudioAttributesImplBaseParcelizer$AudioAttributesCompatParcelizer;", "Lo/getEditionUpdatePopup$AudioAttributesImplBaseParcelizer$write;", "Lo/getEditionUpdatePopup$AudioAttributesImplBaseParcelizer$read;", "Lo/getEditionUpdatePopup$AudioAttributesImplBaseParcelizer$IconCompatParcelizer;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static abstract class AudioAttributesImplBaseParcelizer extends getEditionUpdatePopup<Field> {
        private final boolean IconCompatParcelizer;

        /* JADX WARN: Illegal instructions before constructor call */
        private AudioAttributesImplBaseParcelizer(Field field, boolean z, boolean z2) {
            Field field2 = field;
            Class cls = Void.TYPE;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(cls, "");
            Class cls2 = cls;
            Class<?> declaringClass = z2 ? field.getDeclaringClass() : null;
            Type genericType = field.getGenericType();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(genericType, "");
            super(field2, cls2, declaringClass, new Type[]{genericType}, null);
            this.IconCompatParcelizer = z;
        }

        @Override // kotlin.getEditionUpdatePopup
        public void read(Object[] p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            super.read(p0);
            if (this.IconCompatParcelizer && getOrderDetails.MediaMetadataCompat(p0) == null) {
                throw new IllegalArgumentException("null is not allowed as a value for this property.");
            }
        }

        @Override // kotlin.getDefaultBottomTab
        public Object RemoteActionCompatParcelizer(Object[] p0) throws IllegalAccessException {
            toMagicModuleMetaRepoModel.write(p0, "");
            read(p0);
            write().set(RemoteActionCompatParcelizer() != null ? getOrderDetails.AudioAttributesImplApi21Parcelizer(p0) : null, getOrderDetails.MediaMetadataCompat(p0));
            return getShowPopup.INSTANCE;
        }

        public /* synthetic */ AudioAttributesImplBaseParcelizer(Field field, boolean z, boolean z2, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this(field, z, z2);
        }

        public static final class IconCompatParcelizer extends AudioAttributesImplBaseParcelizer {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public IconCompatParcelizer(Field field, boolean z) {
                super(field, z, false, null);
                toMagicModuleMetaRepoModel.write(field, "");
            }
        }

        public static final class write extends AudioAttributesImplBaseParcelizer {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public write(Field field, boolean z) {
                super(field, z, true, null);
                toMagicModuleMetaRepoModel.write(field, "");
            }
        }

        public static final class read extends AudioAttributesImplBaseParcelizer {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public read(Field field, boolean z) {
                super(field, z, true, null);
                toMagicModuleMetaRepoModel.write(field, "");
            }

            @Override // o.getEditionUpdatePopup.AudioAttributesImplBaseParcelizer, kotlin.getEditionUpdatePopup
            public final void read(Object[] objArr) {
                toMagicModuleMetaRepoModel.write(objArr, "");
                super.read(objArr);
                AudioAttributesCompatParcelizer(getOrderDetails.MediaBrowserCompatCustomActionResultReceiver(objArr));
            }
        }

        public static final class RemoteActionCompatParcelizer extends AudioAttributesImplBaseParcelizer implements getEditionSwitch {
            private final Object RemoteActionCompatParcelizer;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public RemoteActionCompatParcelizer(Field field, boolean z, Object obj) {
                super(field, z, false, null);
                toMagicModuleMetaRepoModel.write(field, "");
                this.RemoteActionCompatParcelizer = obj;
            }

            @Override // o.getEditionUpdatePopup.AudioAttributesImplBaseParcelizer, kotlin.getDefaultBottomTab
            public final Object RemoteActionCompatParcelizer(Object[] objArr) throws IllegalAccessException {
                toMagicModuleMetaRepoModel.write(objArr, "");
                read(objArr);
                write().set(this.RemoteActionCompatParcelizer, getOrderDetails.AudioAttributesImplApi21Parcelizer(objArr));
                return getShowPopup.INSTANCE;
            }
        }

        public static final class AudioAttributesCompatParcelizer extends AudioAttributesImplBaseParcelizer implements getEditionSwitch {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AudioAttributesCompatParcelizer(Field field, boolean z) {
                super(field, z, false, null);
                toMagicModuleMetaRepoModel.write(field, "");
            }

            @Override // o.getEditionUpdatePopup.AudioAttributesImplBaseParcelizer, kotlin.getDefaultBottomTab
            public final Object RemoteActionCompatParcelizer(Object[] objArr) throws IllegalAccessException {
                toMagicModuleMetaRepoModel.write(objArr, "");
                read(objArr);
                write().set(null, getOrderDetails.MediaMetadataCompat(objArr));
                return getShowPopup.INSTANCE;
            }
        }
    }

    /* JADX INFO: renamed from: o.getEditionUpdatePopup$write, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(byte b) {
            this();
        }
    }
}
