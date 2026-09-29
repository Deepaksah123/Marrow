package kotlin;

import java.lang.annotation.Annotation;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.clearAllAppData;
import kotlin.component33;

/* JADX INFO: loaded from: classes4.dex */
public final class component26 implements downloadMagicModuleMeta {
    private static /* synthetic */ isResolutionNotSupported<Object>[] write = {toMagicModuleMetaDataUcModel.write(new downloadMagicModuleMetalambda0(toMagicModuleMetaDataUcModel.write(component26.class), "classifier", "getClassifier()Lkotlin/reflect/KClassifier;")), toMagicModuleMetaDataUcModel.write(new downloadMagicModuleMetalambda0(toMagicModuleMetaDataUcModel.write(component26.class), "arguments", "getArguments()Ljava/util/List;"))};
    private final component33.IconCompatParcelizer<Type> AudioAttributesCompatParcelizer;
    private final component33.IconCompatParcelizer IconCompatParcelizer;
    private final getLink RemoteActionCompatParcelizer;
    private final component33.IconCompatParcelizer read;

    public /* synthetic */ component26(getLink getlink) {
        this(getlink, null);
    }

    public component26(getLink getlink, getCreatedOnDateMs<? extends Type> getcreatedondatems) {
        toMagicModuleMetaRepoModel.write(getlink, "");
        this.RemoteActionCompatParcelizer = getlink;
        component33.IconCompatParcelizer<Type> iconCompatParcelizer = null;
        component33.IconCompatParcelizer<Type> iconCompatParcelizer2 = getcreatedondatems instanceof component33.IconCompatParcelizer ? (component33.IconCompatParcelizer) getcreatedondatems : null;
        if (iconCompatParcelizer2 != null) {
            iconCompatParcelizer = iconCompatParcelizer2;
        } else if (getcreatedondatems != null) {
            iconCompatParcelizer = component33.read(getcreatedondatems);
        }
        this.AudioAttributesCompatParcelizer = iconCompatParcelizer;
        this.read = component33.read(new AnonymousClass1());
        this.IconCompatParcelizer = component33.read(new AnonymousClass4(getcreatedondatems));
    }

    public final getLink AudioAttributesCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    @Override // kotlin.downloadMagicModuleMeta
    public final Type write() {
        component33.IconCompatParcelizer<Type> iconCompatParcelizer = this.AudioAttributesCompatParcelizer;
        if (iconCompatParcelizer != null) {
            return iconCompatParcelizer.invoke();
        }
        return null;
    }

    /* JADX INFO: renamed from: o.component26$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lo/isApiBlockError;", "AudioAttributesCompatParcelizer", "()Lo/isApiBlockError;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass1 extends MagicModuleUseCase implements getCreatedOnDateMs<isApiBlockError> {
        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final isApiBlockError invoke() {
            component26 component26Var = component26.this;
            return component26Var.write(component26Var.AudioAttributesCompatParcelizer());
        }

        AnonymousClass1() {
            super(0);
        }
    }

    @Override // kotlin.deleteOfflineDownloadedFiles
    /* JADX INFO: renamed from: read */
    public final isApiBlockError getAudioAttributesCompatParcelizer() {
        component33.IconCompatParcelizer iconCompatParcelizer = this.read;
        isResolutionNotSupported<Object> isresolutionnotsupported = write[0];
        return (isApiBlockError) iconCompatParcelizer.write();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final isApiBlockError write(getLink getlink) {
        getLink getlinkAudioAttributesCompatParcelizer;
        getQuestionLimit getquestionlimitRemoteActionCompatParcelizer = getlink.AudioAttributesImplApi21Parcelizer().RemoteActionCompatParcelizer();
        if (getquestionlimitRemoteActionCompatParcelizer instanceof CourseConfigV2CustomModuleQuestionSource) {
            Class<?> clsAudioAttributesCompatParcelizer = getCourseStrings.AudioAttributesCompatParcelizer((CourseConfigV2CustomModuleQuestionSource) getquestionlimitRemoteActionCompatParcelizer);
            if (clsAudioAttributesCompatParcelizer == null) {
                return null;
            }
            if (clsAudioAttributesCompatParcelizer.isArray()) {
                setDefault setdefault = (setDefault) IntermediateLoginResponseBody.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver((List) getlink.bb_());
                if (setdefault == null || (getlinkAudioAttributesCompatParcelizer = setdefault.AudioAttributesCompatParcelizer()) == null) {
                    return new CourseConfigSerializer(clsAudioAttributesCompatParcelizer);
                }
                isApiBlockError isapiblockerrorWrite = write(getlinkAudioAttributesCompatParcelizer);
                if (isapiblockerrorWrite == null) {
                    throw new component28("Cannot determine classifier for array element type: ".concat(String.valueOf(this)));
                }
                return new CourseConfigSerializer(getCourseStrings.IconCompatParcelizer((Class<?>) MagicModuleFeedbackRequestBody.IconCompatParcelizer(promptContactVerificationFlow.AudioAttributesCompatParcelizer(isapiblockerrorWrite))));
            }
            if (!setPlanAddOns.write(getlink)) {
                Class<?> clsWrite = getFinalImageUrl.write(clsAudioAttributesCompatParcelizer);
                if (clsWrite != null) {
                    clsAudioAttributesCompatParcelizer = clsWrite;
                }
                return new CourseConfigSerializer(clsAudioAttributesCompatParcelizer);
            }
            return new CourseConfigSerializer(clsAudioAttributesCompatParcelizer);
        }
        if (getquestionlimitRemoteActionCompatParcelizer instanceof getBadgeText) {
            return new component27(null, (getBadgeText) getquestionlimitRemoteActionCompatParcelizer);
        }
        if (getquestionlimitRemoteActionCompatParcelizer instanceof CourseConfigV2VideoProperties) {
            throw new NotImplementedError("An operation is not implemented: Type alias classifiers are not yet supported");
        }
        return null;
    }

    /* JADX INFO: renamed from: o.component26$4, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "Lo/clearAllAppData;", "IconCompatParcelizer", "()Ljava/util/List;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass4 extends MagicModuleUseCase implements getCreatedOnDateMs<List<? extends clearAllAppData>> {
        private /* synthetic */ getCreatedOnDateMs<Type> $IconCompatParcelizer;

        /* JADX INFO: renamed from: o.component26$4$RemoteActionCompatParcelizer */
        public final /* synthetic */ class RemoteActionCompatParcelizer {
            public static final /* synthetic */ int[] RemoteActionCompatParcelizer;

            static {
                int[] iArr = new int[getTotalSubject.values().length];
                try {
                    iArr[getTotalSubject.INVARIANT.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[getTotalSubject.IN_VARIANCE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[getTotalSubject.OUT_VARIANCE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                RemoteActionCompatParcelizer = iArr;
            }
        }

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final List<clearAllAppData> invoke() {
            clearAllAppData clearallappdataAudioAttributesCompatParcelizer;
            List<setDefault> listBb_ = component26.this.AudioAttributesCompatParcelizer().bb_();
            if (listBb_.isEmpty()) {
                return IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
            }
            RenewEligible renewEligibleWrite = getRenewExpiresOn.write(RenewEligibleCompanion.write, new AnonymousClass5(component26.this));
            List<setDefault> list = listBb_;
            getCreatedOnDateMs<Type> getcreatedondatems = this.$IconCompatParcelizer;
            component26 component26Var = component26.this;
            ArrayList arrayList = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) list, 10));
            int i = 0;
            for (Object obj : list) {
                if (i < 0) {
                    IntermediateLoginResponseBody.read();
                }
                setDefault setdefault = (setDefault) obj;
                if (setdefault.write()) {
                    clearAllAppData.Companion companion = clearAllAppData.INSTANCE;
                    clearallappdataAudioAttributesCompatParcelizer = clearAllAppData.Companion.write();
                } else {
                    getLink getlinkAudioAttributesCompatParcelizer = setdefault.AudioAttributesCompatParcelizer();
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getlinkAudioAttributesCompatParcelizer, "");
                    component26 component26Var2 = new component26(getlinkAudioAttributesCompatParcelizer, getcreatedondatems == null ? null : new AnonymousClass2(component26Var, i, renewEligibleWrite));
                    int i2 = RemoteActionCompatParcelizer.RemoteActionCompatParcelizer[setdefault.read().ordinal()];
                    if (i2 == 1) {
                        clearAllAppData.Companion companion2 = clearAllAppData.INSTANCE;
                        clearallappdataAudioAttributesCompatParcelizer = clearAllAppData.Companion.AudioAttributesCompatParcelizer(component26Var2);
                    } else if (i2 == 2) {
                        clearAllAppData.Companion companion3 = clearAllAppData.INSTANCE;
                        clearallappdataAudioAttributesCompatParcelizer = clearAllAppData.Companion.write(component26Var2);
                    } else {
                        if (i2 != 3) {
                            throw new RenewEligibleCreator();
                        }
                        clearAllAppData.Companion companion4 = clearAllAppData.INSTANCE;
                        clearallappdataAudioAttributesCompatParcelizer = clearAllAppData.Companion.IconCompatParcelizer(component26Var2);
                    }
                }
                arrayList.add(clearallappdataAudioAttributesCompatParcelizer);
                i++;
            }
            return arrayList;
        }

        /* JADX INFO: renamed from: o.component26$4$5, reason: invalid class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "Ljava/lang/reflect/Type;", "IconCompatParcelizer", "()Ljava/util/List;"}, k = 3, mv = {1, 8, 0}, xi = 48)
        static final class AnonymousClass5 extends MagicModuleUseCase implements getCreatedOnDateMs<List<? extends Type>> {
            private /* synthetic */ component26 AudioAttributesCompatParcelizer;

            @Override // kotlin.getCreatedOnDateMs
            /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
            public final List<Type> invoke() {
                Type typeWrite = this.AudioAttributesCompatParcelizer.write();
                toMagicModuleMetaRepoModel.write(typeWrite);
                return getFinalImageUrl.read(typeWrite);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass5(component26 component26Var) {
                super(0);
                this.AudioAttributesCompatParcelizer = component26Var;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List<Type> write(RenewEligible<? extends List<? extends Type>> renewEligible) {
            return (List) renewEligible.RemoteActionCompatParcelizer();
        }

        /* JADX INFO: renamed from: o.component26$4$2, reason: invalid class name */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljava/lang/reflect/Type;", "RemoteActionCompatParcelizer", "()Ljava/lang/reflect/Type;"}, k = 3, mv = {1, 8, 0}, xi = 48)
        static final class AnonymousClass2 extends MagicModuleUseCase implements getCreatedOnDateMs<Type> {
            private /* synthetic */ int $IconCompatParcelizer;
            private /* synthetic */ RenewEligible<List<Type>> $write;
            private /* synthetic */ component26 RemoteActionCompatParcelizer;

            @Override // kotlin.getCreatedOnDateMs
            /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
            public final Type invoke() {
                Type typeWrite = this.RemoteActionCompatParcelizer.write();
                if (typeWrite instanceof Class) {
                    Class cls = (Class) typeWrite;
                    Class componentType = cls.isArray() ? cls.getComponentType() : Object.class;
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(componentType, "");
                    return componentType;
                }
                if (typeWrite instanceof GenericArrayType) {
                    if (this.$IconCompatParcelizer != 0) {
                        StringBuilder sb = new StringBuilder("Array type has been queried for a non-0th argument: ");
                        sb.append(this.RemoteActionCompatParcelizer);
                        throw new component28(sb.toString());
                    }
                    Type genericComponentType = ((GenericArrayType) typeWrite).getGenericComponentType();
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(genericComponentType, "");
                    return genericComponentType;
                }
                if (typeWrite instanceof ParameterizedType) {
                    Type type = (Type) AnonymousClass4.write(this.$write).get(this.$IconCompatParcelizer);
                    if (type instanceof WildcardType) {
                        WildcardType wildcardType = (WildcardType) type;
                        Type[] lowerBounds = wildcardType.getLowerBounds();
                        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(lowerBounds, "");
                        Type type2 = (Type) getOrderDetails.MediaBrowserCompatCustomActionResultReceiver(lowerBounds);
                        if (type2 == null) {
                            Type[] upperBounds = wildcardType.getUpperBounds();
                            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(upperBounds, "");
                            type = (Type) getOrderDetails.AudioAttributesImplApi21Parcelizer(upperBounds);
                        } else {
                            type = type2;
                        }
                    }
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(type, "");
                    return type;
                }
                StringBuilder sb2 = new StringBuilder("Non-generic type has been queried for arguments: ");
                sb2.append(this.RemoteActionCompatParcelizer);
                throw new component28(sb2.toString());
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass2(component26 component26Var, int i, RenewEligible<? extends List<? extends Type>> renewEligible) {
                super(0);
                this.RemoteActionCompatParcelizer = component26Var;
                this.$IconCompatParcelizer = i;
                this.$write = renewEligible;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass4(getCreatedOnDateMs<? extends Type> getcreatedondatems) {
            super(0);
            this.$IconCompatParcelizer = getcreatedondatems;
        }
    }

    @Override // kotlin.deleteOfflineDownloadedFiles
    public final List<clearAllAppData> aM_() {
        component33.IconCompatParcelizer iconCompatParcelizer = this.IconCompatParcelizer;
        isResolutionNotSupported<Object> isresolutionnotsupported = write[1];
        T tWrite = iconCompatParcelizer.write();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(tWrite, "");
        return (List) tWrite;
    }

    @Override // kotlin.deleteOfflineDownloadedFiles
    public final boolean IconCompatParcelizer() {
        return this.RemoteActionCompatParcelizer.ba_();
    }

    @Override // kotlin.McqFaq
    public final List<Annotation> MediaBrowserCompatItemReceiver() {
        return getCourseStrings.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof component26)) {
            return false;
        }
        component26 component26Var = (component26) obj;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, component26Var.RemoteActionCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(getAudioAttributesCompatParcelizer(), component26Var.getAudioAttributesCompatParcelizer()) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(aM_(), component26Var.aM_());
    }

    public final int hashCode() {
        int iHashCode = this.RemoteActionCompatParcelizer.hashCode();
        isApiBlockError isapiblockerror = getAudioAttributesCompatParcelizer();
        return (((iHashCode * 31) + (isapiblockerror != null ? isapiblockerror.hashCode() : 0)) * 31) + aM_().hashCode();
    }

    public final String toString() {
        component29 component29Var = component29.read;
        return component29.read(this.RemoteActionCompatParcelizer);
    }
}
