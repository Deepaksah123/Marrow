package kotlin;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.KotlinKeySerializersKt;
import kotlin.MagicModuleUseCaseImplWhenMappings;
import kotlin.Metadata;
import kotlin.isKotlinConstructorWithParameters;
import kotlin.isRequiredByAnnotation;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000 \u001a*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004:\u0001\u001aB#\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u000f\u001a\u00020\u000eH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u000f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\rJ\u000f\u0010\u0011\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0011\u0010\rJ+\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00122\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0013H\u0016¢\u0006\u0004\b\u000f\u0010\u0014J#\u0010\u0015\u001a\u00020\u000b2\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J#\u0010\u000f\u001a\u00020\u000b2\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0013H\u0016¢\u0006\u0004\b\u000f\u0010\u0016J;\u0010\f\u001a\u00020\u000b*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00172\u0006\u0010\u0006\u001a\u00020\u00122\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0013H\u0002¢\u0006\u0004\b\f\u0010\u0018R \u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0019R\u0014\u0010\u000f\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u001cR \u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u001dR\u0014\u0010\u0011\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001eR\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020 0\u001f8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010!\u0082\u0002\u0004\n\u0002\b\u0019"}, d2 = {"Lo/accessisPossibleSingleString;", "", "Key", "Value", "Lo/isPossibleSingleString;", "Lo/TopUserCompanion;", "p0", "Lo/isKotlinConstructorWithParameters;", "p1", "<init>", "(Lo/TopUserCompanion;Lo/isKotlinConstructorWithParameters;)V", "", "write", "()V", "Lo/isKotlinConstructorWithParameters$IconCompatParcelizer;", "AudioAttributesCompatParcelizer", "(Lo/SampleVideos;)Ljava/lang/Object;", "read", "Lo/accessgetStaticJsonKeyGetter;", "Lo/accessisPrimaryConstructor;", "(Lo/accessgetStaticJsonKeyGetter;Lo/accessisPrimaryConstructor;)V", "RemoteActionCompatParcelizer", "(Lo/accessisPrimaryConstructor;)V", "Lo/isGetterLike;", "(Lo/isGetterLike;Lo/accessgetStaticJsonKeyGetter;Lo/accessisPrimaryConstructor;)V", "Lo/isGetterLike;", "IconCompatParcelizer", "Lo/getStaticJsonValueGetter;", "Lo/getStaticJsonValueGetter;", "Lo/isKotlinConstructorWithParameters;", "Lo/TopUserCompanion;", "Lo/setUpdatedStatus;", "Lo/KotlinKeySerializers;", "()Lo/setUpdatedStatus;"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class accessisPossibleSingleString<Key, Value> implements isPossibleSingleString<Key, Value> {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final TopUserCompanion read;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final isKotlinConstructorWithParameters<Key, Value> write;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final isGetterLike<Key, Value> IconCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final getStaticJsonValueGetter AudioAttributesCompatParcelizer;

    static final class AudioAttributesCompatParcelizer extends getTotalMcq {
        /* synthetic */ Object AudioAttributesCompatParcelizer;
        int IconCompatParcelizer;
        Object RemoteActionCompatParcelizer;
        final /* synthetic */ accessisPossibleSingleString<Key, Value> read;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AudioAttributesCompatParcelizer(accessisPossibleSingleString<Key, Value> accessispossiblesinglestring, SampleVideos<? super AudioAttributesCompatParcelizer> sampleVideos) {
            super(sampleVideos);
            this.read = accessispossiblesinglestring;
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.AudioAttributesCompatParcelizer = obj;
            this.IconCompatParcelizer |= Integer.MIN_VALUE;
            return this.read.AudioAttributesCompatParcelizer(this);
        }
    }

    public final /* synthetic */ class read {
        public static final /* synthetic */ int[] write;

        static {
            int[] iArr = new int[accessgetStaticJsonKeyGetter.values().length];
            try {
                iArr[accessgetStaticJsonKeyGetter.REFRESH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            write = iArr;
        }
    }

    public accessisPossibleSingleString(TopUserCompanion topUserCompanion, isKotlinConstructorWithParameters<Key, Value> iskotlinconstructorwithparameters) {
        toMagicModuleMetaRepoModel.write(topUserCompanion, "");
        toMagicModuleMetaRepoModel.write(iskotlinconstructorwithparameters, "");
        this.read = topUserCompanion;
        this.write = iskotlinconstructorwithparameters;
        this.IconCompatParcelizer = new isGetterLike<>();
        this.AudioAttributesCompatParcelizer = new getStaticJsonValueGetter(false);
    }

    @Override // kotlin.isPossibleSingleString
    public final setUpdatedStatus<KotlinKeySerializers> IconCompatParcelizer() {
        return this.IconCompatParcelizer.RemoteActionCompatParcelizer();
    }

    /* JADX INFO: renamed from: o.accessisPossibleSingleString$4, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "Key", "Value", "Lo/isRequiredByAnnotation;", "p0", "", "RemoteActionCompatParcelizer", "(Lo/isRequiredByAnnotation;)V"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass4 extends MagicModuleUseCase implements getAnswerMap<isRequiredByAnnotation<Key, Value>, getShowPopup> {
        final /* synthetic */ accessisPrimaryConstructor<Key, Value> $AudioAttributesCompatParcelizer;
        final /* synthetic */ accessisPossibleSingleString<Key, Value> write;

        @Override // kotlin.getAnswerMap
        public final /* synthetic */ getShowPopup invoke(Object obj) {
            RemoteActionCompatParcelizer((isRequiredByAnnotation) obj);
            return getShowPopup.INSTANCE;
        }

        public final void RemoteActionCompatParcelizer(isRequiredByAnnotation<Key, Value> isrequiredbyannotation) {
            toMagicModuleMetaRepoModel.write(isrequiredbyannotation, "");
            if (isrequiredbyannotation.AudioAttributesImplApi21Parcelizer()) {
                isrequiredbyannotation.AudioAttributesCompatParcelizer(false);
                accessisPossibleSingleString<Key, Value> accessispossiblesinglestring = this.write;
                accessispossiblesinglestring.write(((accessisPossibleSingleString) accessispossiblesinglestring).IconCompatParcelizer, accessgetStaticJsonKeyGetter.REFRESH, this.$AudioAttributesCompatParcelizer);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass4(accessisPossibleSingleString<Key, Value> accessispossiblesinglestring, accessisPrimaryConstructor<Key, Value> accessisprimaryconstructor) {
            super(1);
            this.write = accessispossiblesinglestring;
            this.$AudioAttributesCompatParcelizer = accessisprimaryconstructor;
        }
    }

    @Override // kotlin.KotlinObjectSingletonDeserializer
    public final void RemoteActionCompatParcelizer(accessisPrimaryConstructor<Key, Value> p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        this.IconCompatParcelizer.AudioAttributesCompatParcelizer(new AnonymousClass4(this, p0));
    }

    /* JADX INFO: renamed from: o.accessisPossibleSingleString$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "Key", "Value", "Lo/isRequiredByAnnotation;", "p0", "", "RemoteActionCompatParcelizer", "(Lo/isRequiredByAnnotation;)V"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass3 extends MagicModuleUseCase implements getAnswerMap<isRequiredByAnnotation<Key, Value>, getShowPopup> {
        public static final AnonymousClass3 AudioAttributesCompatParcelizer = new AnonymousClass3();

        public final void RemoteActionCompatParcelizer(isRequiredByAnnotation<Key, Value> isrequiredbyannotation) {
            toMagicModuleMetaRepoModel.write(isrequiredbyannotation, "");
            isrequiredbyannotation.AudioAttributesCompatParcelizer(true);
        }

        @Override // kotlin.getAnswerMap
        public final /* synthetic */ getShowPopup invoke(Object obj) {
            RemoteActionCompatParcelizer((isRequiredByAnnotation) obj);
            return getShowPopup.INSTANCE;
        }

        AnonymousClass3() {
            super(1);
        }
    }

    @Override // kotlin.KotlinObjectSingletonDeserializer
    public final void write() {
        this.IconCompatParcelizer.AudioAttributesCompatParcelizer(AnonymousClass3.AudioAttributesCompatParcelizer);
    }

    @Override // kotlin.KotlinObjectSingletonDeserializer
    public final void AudioAttributesCompatParcelizer(accessgetStaticJsonKeyGetter p0, accessisPrimaryConstructor<Key, Value> p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        write(this.IconCompatParcelizer, p0, p1);
    }

    /* JADX INFO: renamed from: o.accessisPossibleSingleString$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "Key", "Value", "Lo/isRequiredByAnnotation;", "p0", "", "AudioAttributesCompatParcelizer", "(Lo/isRequiredByAnnotation;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass2 extends MagicModuleUseCase implements getAnswerMap<isRequiredByAnnotation<Key, Value>, Boolean> {
        final /* synthetic */ accessgetStaticJsonKeyGetter $IconCompatParcelizer;
        final /* synthetic */ accessisPrimaryConstructor<Key, Value> $RemoteActionCompatParcelizer;

        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(isRequiredByAnnotation<Key, Value> isrequiredbyannotation) {
            toMagicModuleMetaRepoModel.write(isrequiredbyannotation, "");
            return Boolean.valueOf(isrequiredbyannotation.read(this.$IconCompatParcelizer, this.$RemoteActionCompatParcelizer));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(accessgetStaticJsonKeyGetter accessgetstaticjsonkeygetter, accessisPrimaryConstructor<Key, Value> accessisprimaryconstructor) {
            super(1);
            this.$IconCompatParcelizer = accessgetstaticjsonkeygetter;
            this.$RemoteActionCompatParcelizer = accessisprimaryconstructor;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void write(isGetterLike<Key, Value> isgetterlike, accessgetStaticJsonKeyGetter accessgetstaticjsonkeygetter, accessisPrimaryConstructor<Key, Value> accessisprimaryconstructor) {
        if (((Boolean) isgetterlike.AudioAttributesCompatParcelizer(new AnonymousClass2(accessgetstaticjsonkeygetter, accessisprimaryconstructor))).booleanValue()) {
            if (read.write[accessgetstaticjsonkeygetter.ordinal()] == 1) {
                read();
            } else {
                AudioAttributesCompatParcelizer();
            }
        }
    }

    static final class RemoteActionCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private Object AudioAttributesCompatParcelizer;
        private int IconCompatParcelizer;
        final /* synthetic */ accessisPossibleSingleString<Key, Value> RemoteActionCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            MagicModuleUseCaseImplWhenMappings.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer;
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.IconCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                MagicModuleUseCaseImplWhenMappings.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer2 = new MagicModuleUseCaseImplWhenMappings.AudioAttributesCompatParcelizer();
                this.AudioAttributesCompatParcelizer = audioAttributesCompatParcelizer2;
                this.IconCompatParcelizer = 1;
                if (((accessisPossibleSingleString) this.RemoteActionCompatParcelizer).AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(2, new AnonymousClass1(this.RemoteActionCompatParcelizer, audioAttributesCompatParcelizer2, null), this) == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
                audioAttributesCompatParcelizer = audioAttributesCompatParcelizer2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                audioAttributesCompatParcelizer = (MagicModuleUseCaseImplWhenMappings.AudioAttributesCompatParcelizer) this.AudioAttributesCompatParcelizer;
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            if (audioAttributesCompatParcelizer.IconCompatParcelizer) {
                this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer();
            }
            return getShowPopup.INSTANCE;
        }

        /* JADX INFO: renamed from: o.accessisPossibleSingleString$RemoteActionCompatParcelizer$1, reason: invalid class name */
        static final class AnonymousClass1 extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
            private Object AudioAttributesCompatParcelizer;
            final /* synthetic */ accessisPossibleSingleString<Key, Value> IconCompatParcelizer;
            private Object RemoteActionCompatParcelizer;
            private int read;
            final /* synthetic */ MagicModuleUseCaseImplWhenMappings.AudioAttributesCompatParcelizer write;

            @Override // kotlin.getMonthName
            public final Object invokeSuspend(Object obj) {
                MagicModuleUseCaseImplWhenMappings.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer;
                accessisPossibleSingleString<Key, Value> accessispossiblesinglestring;
                boolean zBooleanValue;
                Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
                int i = this.read;
                if (i == 0) {
                    SdkPayloadData.IconCompatParcelizer(obj);
                    if (((accessisPrimaryConstructor) ((accessisPossibleSingleString) this.IconCompatParcelizer).IconCompatParcelizer.AudioAttributesCompatParcelizer(AnonymousClass4.write)) != null) {
                        accessisPossibleSingleString<Key, Value> accessispossiblesinglestring2 = this.IconCompatParcelizer;
                        MagicModuleUseCaseImplWhenMappings.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer2 = this.write;
                        isKotlinConstructorWithParameters iskotlinconstructorwithparameters = ((accessisPossibleSingleString) accessispossiblesinglestring2).write;
                        accessgetStaticJsonKeyGetter accessgetstaticjsonkeygetter = accessgetStaticJsonKeyGetter.REFRESH;
                        this.RemoteActionCompatParcelizer = accessispossiblesinglestring2;
                        this.AudioAttributesCompatParcelizer = audioAttributesCompatParcelizer2;
                        this.read = 1;
                        Object objIconCompatParcelizer2 = iskotlinconstructorwithparameters.IconCompatParcelizer();
                        if (objIconCompatParcelizer2 == objIconCompatParcelizer) {
                            return objIconCompatParcelizer;
                        }
                        audioAttributesCompatParcelizer = audioAttributesCompatParcelizer2;
                        obj = objIconCompatParcelizer2;
                        accessispossiblesinglestring = accessispossiblesinglestring2;
                    }
                    return getShowPopup.INSTANCE;
                }
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                audioAttributesCompatParcelizer = (MagicModuleUseCaseImplWhenMappings.AudioAttributesCompatParcelizer) this.AudioAttributesCompatParcelizer;
                accessispossiblesinglestring = (accessisPossibleSingleString) this.RemoteActionCompatParcelizer;
                SdkPayloadData.IconCompatParcelizer(obj);
                isKotlinConstructorWithParameters.write writeVar = (isKotlinConstructorWithParameters.write) obj;
                if (writeVar instanceof isKotlinConstructorWithParameters.write.read) {
                    zBooleanValue = ((Boolean) ((accessisPossibleSingleString) accessispossiblesinglestring).IconCompatParcelizer.AudioAttributesCompatParcelizer(new AnonymousClass3(writeVar))).booleanValue();
                } else if (writeVar instanceof isKotlinConstructorWithParameters.write.RemoteActionCompatParcelizer) {
                    zBooleanValue = ((Boolean) ((accessisPossibleSingleString) accessispossiblesinglestring).IconCompatParcelizer.AudioAttributesCompatParcelizer(new C00621(writeVar))).booleanValue();
                } else {
                    throw new RenewEligibleCreator();
                }
                audioAttributesCompatParcelizer.IconCompatParcelizer = zBooleanValue;
                return getShowPopup.INSTANCE;
            }

            /* JADX INFO: renamed from: o.accessisPossibleSingleString$RemoteActionCompatParcelizer$1$4, reason: invalid class name */
            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "Key", "Value", "Lo/isRequiredByAnnotation;", "p0", "Lo/accessisPrimaryConstructor;", "AudioAttributesCompatParcelizer", "(Lo/isRequiredByAnnotation;)Lo/accessisPrimaryConstructor;"}, k = 3, mv = {1, 8, 0}, xi = 48)
            static final class AnonymousClass4 extends MagicModuleUseCase implements getAnswerMap<isRequiredByAnnotation<Key, Value>, accessisPrimaryConstructor<Key, Value>> {
                public static final AnonymousClass4 write = new AnonymousClass4();

                @Override // kotlin.getAnswerMap
                /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
                public final accessisPrimaryConstructor<Key, Value> invoke(isRequiredByAnnotation<Key, Value> isrequiredbyannotation) {
                    toMagicModuleMetaRepoModel.write(isrequiredbyannotation, "");
                    return isrequiredbyannotation.RemoteActionCompatParcelizer();
                }

                AnonymousClass4() {
                    super(1);
                }
            }

            /* JADX INFO: renamed from: o.accessisPossibleSingleString$RemoteActionCompatParcelizer$1$3, reason: invalid class name */
            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "Key", "Value", "Lo/isRequiredByAnnotation;", "p0", "", "IconCompatParcelizer", "(Lo/isRequiredByAnnotation;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
            static final class AnonymousClass3 extends MagicModuleUseCase implements getAnswerMap<isRequiredByAnnotation<Key, Value>, Boolean> {
                final /* synthetic */ isKotlinConstructorWithParameters.write $RemoteActionCompatParcelizer;

                @Override // kotlin.getAnswerMap
                /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
                public final Boolean invoke(isRequiredByAnnotation<Key, Value> isrequiredbyannotation) {
                    toMagicModuleMetaRepoModel.write(isrequiredbyannotation, "");
                    isrequiredbyannotation.AudioAttributesCompatParcelizer(accessgetStaticJsonKeyGetter.REFRESH);
                    if (((isKotlinConstructorWithParameters.write.read) this.$RemoteActionCompatParcelizer).RemoteActionCompatParcelizer()) {
                        isrequiredbyannotation.write(accessgetStaticJsonKeyGetter.REFRESH, isRequiredByAnnotation.read.COMPLETED);
                        isrequiredbyannotation.write(accessgetStaticJsonKeyGetter.PREPEND, isRequiredByAnnotation.read.COMPLETED);
                        isrequiredbyannotation.write(accessgetStaticJsonKeyGetter.APPEND, isRequiredByAnnotation.read.COMPLETED);
                        isrequiredbyannotation.write();
                    } else {
                        isrequiredbyannotation.write(accessgetStaticJsonKeyGetter.PREPEND, isRequiredByAnnotation.read.UNBLOCKED);
                        isrequiredbyannotation.write(accessgetStaticJsonKeyGetter.APPEND, isRequiredByAnnotation.read.UNBLOCKED);
                    }
                    isrequiredbyannotation.write(accessgetStaticJsonKeyGetter.PREPEND, (KotlinKeySerializersKt.write) null);
                    isrequiredbyannotation.write(accessgetStaticJsonKeyGetter.APPEND, (KotlinKeySerializersKt.write) null);
                    return Boolean.valueOf(isrequiredbyannotation.IconCompatParcelizer() != null);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass3(isKotlinConstructorWithParameters.write writeVar) {
                    super(1);
                    this.$RemoteActionCompatParcelizer = writeVar;
                }
            }

            /* JADX INFO: renamed from: o.accessisPossibleSingleString$RemoteActionCompatParcelizer$1$1, reason: invalid class name and collision with other inner class name */
            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "Key", "Value", "Lo/isRequiredByAnnotation;", "p0", "", "IconCompatParcelizer", "(Lo/isRequiredByAnnotation;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
            static final class C00621 extends MagicModuleUseCase implements getAnswerMap<isRequiredByAnnotation<Key, Value>, Boolean> {
                final /* synthetic */ isKotlinConstructorWithParameters.write $read;

                @Override // kotlin.getAnswerMap
                /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
                public final Boolean invoke(isRequiredByAnnotation<Key, Value> isrequiredbyannotation) {
                    toMagicModuleMetaRepoModel.write(isrequiredbyannotation, "");
                    isrequiredbyannotation.AudioAttributesCompatParcelizer(accessgetStaticJsonKeyGetter.REFRESH);
                    isrequiredbyannotation.write(accessgetStaticJsonKeyGetter.REFRESH, new KotlinKeySerializersKt.write(((isKotlinConstructorWithParameters.write.RemoteActionCompatParcelizer) this.$read).read()));
                    return Boolean.valueOf(isrequiredbyannotation.IconCompatParcelizer() != null);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C00621(isKotlinConstructorWithParameters.write writeVar) {
                    super(1);
                    this.$read = writeVar;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(accessisPossibleSingleString<Key, Value> accessispossiblesinglestring, MagicModuleUseCaseImplWhenMappings.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer, SampleVideos<? super AnonymousClass1> sampleVideos) {
                super(1, sampleVideos);
                this.IconCompatParcelizer = accessispossiblesinglestring;
                this.write = audioAttributesCompatParcelizer;
            }

            @Override // kotlin.getMonthName
            public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
                return new AnonymousClass1(this.IconCompatParcelizer, this.write, sampleVideos);
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // kotlin.getAnswerMap
            /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
            public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
                return ((AnonymousClass1) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        RemoteActionCompatParcelizer(accessisPossibleSingleString<Key, Value> accessispossiblesinglestring, SampleVideos<? super RemoteActionCompatParcelizer> sampleVideos) {
            super(2, sampleVideos);
            this.RemoteActionCompatParcelizer = accessispossiblesinglestring;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return new RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((RemoteActionCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void read() {
        C0201setMcqCount.IconCompatParcelizer(this.read, null, null, new RemoteActionCompatParcelizer(this, null), 3);
    }

    static final class write extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int AudioAttributesCompatParcelizer;
        final /* synthetic */ accessisPossibleSingleString<Key, Value> RemoteActionCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.AudioAttributesCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.AudioAttributesCompatParcelizer = 1;
                if (((accessisPossibleSingleString) this.RemoteActionCompatParcelizer).AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(1, new AnonymousClass1(this.RemoteActionCompatParcelizer, null), this) == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            return getShowPopup.INSTANCE;
        }

        /* JADX INFO: renamed from: o.accessisPossibleSingleString$write$1, reason: invalid class name */
        static final class AnonymousClass1 extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
            private int IconCompatParcelizer;
            final /* synthetic */ accessisPossibleSingleString<Key, Value> RemoteActionCompatParcelizer;
            private Object write;

            /* JADX WARN: Removed duplicated region for block: B:11:0x0030  */
            /* JADX WARN: Removed duplicated region for block: B:13:0x0033  */
            /* JADX WARN: Removed duplicated region for block: B:18:0x0059  */
            /* JADX WARN: Removed duplicated region for block: B:19:0x006a  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0050 -> B:16:0x0053). Please report as a decompilation issue!!! */
            @Override // kotlin.getMonthName
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r6) {
                /*
                    r5 = this;
                    java.lang.Object r0 = kotlin.getYear.IconCompatParcelizer()
                    int r1 = r5.IconCompatParcelizer
                    r2 = 1
                    if (r1 == 0) goto L1b
                    if (r1 != r2) goto L13
                    java.lang.Object r1 = r5.write
                    o.accessgetStaticJsonKeyGetter r1 = (kotlin.accessgetStaticJsonKeyGetter) r1
                    kotlin.SdkPayloadData.IconCompatParcelizer(r6)
                    goto L53
                L13:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L1b:
                    kotlin.SdkPayloadData.IconCompatParcelizer(r6)
                L1e:
                    o.accessisPossibleSingleString<Key, Value> r6 = r5.RemoteActionCompatParcelizer
                    o.isGetterLike r6 = kotlin.accessisPossibleSingleString.AudioAttributesCompatParcelizer(r6)
                    o.accessisPossibleSingleString$write$1$1 r1 = o.accessisPossibleSingleString.write.AnonymousClass1.C00631.write
                    o.getAnswerMap r1 = (kotlin.getAnswerMap) r1
                    java.lang.Object r6 = r6.AudioAttributesCompatParcelizer(r1)
                    o.getSubscriptionExpiresOn r6 = (kotlin.Pair) r6
                    if (r6 != 0) goto L33
                    o.getShowPopup r5 = kotlin.getShowPopup.INSTANCE
                    return r5
                L33:
                    java.lang.Object r1 = r6.RemoteActionCompatParcelizer()
                    o.accessgetStaticJsonKeyGetter r1 = (kotlin.accessgetStaticJsonKeyGetter) r1
                    java.lang.Object r6 = r6.read()
                    o.accessisPrimaryConstructor r6 = (kotlin.accessisPrimaryConstructor) r6
                    o.accessisPossibleSingleString<Key, Value> r6 = r5.RemoteActionCompatParcelizer
                    o.isKotlinConstructorWithParameters r6 = kotlin.accessisPossibleSingleString.read(r6)
                    r3 = r5
                    o.SampleVideos r3 = (kotlin.SampleVideos) r3
                    r5.write = r1
                    r5.IconCompatParcelizer = r2
                    java.lang.Object r6 = r6.IconCompatParcelizer()
                    if (r6 != r0) goto L53
                    return r0
                L53:
                    o.isKotlinConstructorWithParameters$write r6 = (o.isKotlinConstructorWithParameters.write) r6
                    boolean r3 = r6 instanceof o.isKotlinConstructorWithParameters.write.read
                    if (r3 == 0) goto L6a
                    o.accessisPossibleSingleString<Key, Value> r3 = r5.RemoteActionCompatParcelizer
                    o.isGetterLike r3 = kotlin.accessisPossibleSingleString.AudioAttributesCompatParcelizer(r3)
                    o.accessisPossibleSingleString$write$1$3 r4 = new o.accessisPossibleSingleString$write$1$3
                    r4.<init>(r1, r6)
                    o.getAnswerMap r4 = (kotlin.getAnswerMap) r4
                    r3.AudioAttributesCompatParcelizer(r4)
                    goto L1e
                L6a:
                    boolean r3 = r6 instanceof o.isKotlinConstructorWithParameters.write.RemoteActionCompatParcelizer
                    if (r3 == 0) goto L1e
                    o.accessisPossibleSingleString<Key, Value> r3 = r5.RemoteActionCompatParcelizer
                    o.isGetterLike r3 = kotlin.accessisPossibleSingleString.AudioAttributesCompatParcelizer(r3)
                    o.accessisPossibleSingleString$write$1$4 r4 = new o.accessisPossibleSingleString$write$1$4
                    r4.<init>(r1, r6)
                    o.getAnswerMap r4 = (kotlin.getAnswerMap) r4
                    r3.AudioAttributesCompatParcelizer(r4)
                    goto L1e
                */
                throw new UnsupportedOperationException("Method not decompiled: o.accessisPossibleSingleString.write.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            /* JADX INFO: renamed from: o.accessisPossibleSingleString$write$1$1, reason: invalid class name and collision with other inner class name */
            @Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\u001c\u0012\u0004\u0012\u00020\u0006\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007\u0018\u00010\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"", "Key", "Value", "Lo/isRequiredByAnnotation;", "p0", "Lo/getSubscriptionExpiresOn;", "Lo/accessgetStaticJsonKeyGetter;", "Lo/accessisPrimaryConstructor;", "write", "(Lo/isRequiredByAnnotation;)Lo/getSubscriptionExpiresOn;"}, k = 3, mv = {1, 8, 0}, xi = 48)
            static final class C00631 extends MagicModuleUseCase implements getAnswerMap<isRequiredByAnnotation<Key, Value>, Pair<? extends accessgetStaticJsonKeyGetter, ? extends accessisPrimaryConstructor<Key, Value>>> {
                public static final C00631 write = new C00631();

                @Override // kotlin.getAnswerMap
                /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
                public final Pair<accessgetStaticJsonKeyGetter, accessisPrimaryConstructor<Key, Value>> invoke(isRequiredByAnnotation<Key, Value> isrequiredbyannotation) {
                    toMagicModuleMetaRepoModel.write(isrequiredbyannotation, "");
                    return isrequiredbyannotation.IconCompatParcelizer();
                }

                C00631() {
                    super(1);
                }
            }

            /* JADX INFO: renamed from: o.accessisPossibleSingleString$write$1$3, reason: invalid class name */
            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "Key", "Value", "Lo/isRequiredByAnnotation;", "p0", "", "read", "(Lo/isRequiredByAnnotation;)V"}, k = 3, mv = {1, 8, 0}, xi = 48)
            static final class AnonymousClass3 extends MagicModuleUseCase implements getAnswerMap<isRequiredByAnnotation<Key, Value>, getShowPopup> {
                final /* synthetic */ accessgetStaticJsonKeyGetter $AudioAttributesCompatParcelizer;
                final /* synthetic */ isKotlinConstructorWithParameters.write $read;

                @Override // kotlin.getAnswerMap
                public final /* synthetic */ getShowPopup invoke(Object obj) {
                    read((isRequiredByAnnotation) obj);
                    return getShowPopup.INSTANCE;
                }

                public final void read(isRequiredByAnnotation<Key, Value> isrequiredbyannotation) {
                    toMagicModuleMetaRepoModel.write(isrequiredbyannotation, "");
                    isrequiredbyannotation.AudioAttributesCompatParcelizer(this.$AudioAttributesCompatParcelizer);
                    if (((isKotlinConstructorWithParameters.write.read) this.$read).RemoteActionCompatParcelizer()) {
                        isrequiredbyannotation.write(this.$AudioAttributesCompatParcelizer, isRequiredByAnnotation.read.COMPLETED);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass3(accessgetStaticJsonKeyGetter accessgetstaticjsonkeygetter, isKotlinConstructorWithParameters.write writeVar) {
                    super(1);
                    this.$AudioAttributesCompatParcelizer = accessgetstaticjsonkeygetter;
                    this.$read = writeVar;
                }
            }

            /* JADX INFO: renamed from: o.accessisPossibleSingleString$write$1$4, reason: invalid class name */
            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "Key", "Value", "Lo/isRequiredByAnnotation;", "p0", "", "read", "(Lo/isRequiredByAnnotation;)V"}, k = 3, mv = {1, 8, 0}, xi = 48)
            static final class AnonymousClass4 extends MagicModuleUseCase implements getAnswerMap<isRequiredByAnnotation<Key, Value>, getShowPopup> {
                final /* synthetic */ accessgetStaticJsonKeyGetter $read;
                final /* synthetic */ isKotlinConstructorWithParameters.write $write;

                @Override // kotlin.getAnswerMap
                public final /* synthetic */ getShowPopup invoke(Object obj) {
                    read((isRequiredByAnnotation) obj);
                    return getShowPopup.INSTANCE;
                }

                public final void read(isRequiredByAnnotation<Key, Value> isrequiredbyannotation) {
                    toMagicModuleMetaRepoModel.write(isrequiredbyannotation, "");
                    isrequiredbyannotation.AudioAttributesCompatParcelizer(this.$read);
                    isrequiredbyannotation.write(this.$read, new KotlinKeySerializersKt.write(((isKotlinConstructorWithParameters.write.RemoteActionCompatParcelizer) this.$write).read()));
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass4(accessgetStaticJsonKeyGetter accessgetstaticjsonkeygetter, isKotlinConstructorWithParameters.write writeVar) {
                    super(1);
                    this.$read = accessgetstaticjsonkeygetter;
                    this.$write = writeVar;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(accessisPossibleSingleString<Key, Value> accessispossiblesinglestring, SampleVideos<? super AnonymousClass1> sampleVideos) {
                super(1, sampleVideos);
                this.RemoteActionCompatParcelizer = accessispossiblesinglestring;
            }

            @Override // kotlin.getMonthName
            public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
                return new AnonymousClass1(this.RemoteActionCompatParcelizer, sampleVideos);
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // kotlin.getAnswerMap
            /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
            public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
                return ((AnonymousClass1) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        write(accessisPossibleSingleString<Key, Value> accessispossiblesinglestring, SampleVideos<? super write> sampleVideos) {
            super(2, sampleVideos);
            this.RemoteActionCompatParcelizer = accessispossiblesinglestring;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return new write(this.RemoteActionCompatParcelizer, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((write) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void AudioAttributesCompatParcelizer() {
        C0201setMcqCount.IconCompatParcelizer(this.read, null, null, new write(this, null), 3);
    }

    /* JADX INFO: renamed from: o.accessisPossibleSingleString$5, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "Key", "Value", "Lo/isRequiredByAnnotation;", "p0", "", "read", "(Lo/isRequiredByAnnotation;)V"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass5 extends MagicModuleUseCase implements getAnswerMap<isRequiredByAnnotation<Key, Value>, getShowPopup> {
        final /* synthetic */ List<accessgetStaticJsonKeyGetter> $AudioAttributesCompatParcelizer;

        @Override // kotlin.getAnswerMap
        public final /* synthetic */ getShowPopup invoke(Object obj) {
            read((isRequiredByAnnotation) obj);
            return getShowPopup.INSTANCE;
        }

        public final void read(isRequiredByAnnotation<Key, Value> isrequiredbyannotation) {
            toMagicModuleMetaRepoModel.write(isrequiredbyannotation, "");
            KotlinKeySerializers kotlinKeySerializersAudioAttributesCompatParcelizer = isrequiredbyannotation.AudioAttributesCompatParcelizer();
            boolean z = kotlinKeySerializersAudioAttributesCompatParcelizer.getRead() instanceof KotlinKeySerializersKt.write;
            isrequiredbyannotation.read();
            if (z) {
                this.$AudioAttributesCompatParcelizer.add(accessgetStaticJsonKeyGetter.REFRESH);
                isrequiredbyannotation.write(accessgetStaticJsonKeyGetter.REFRESH, isRequiredByAnnotation.read.UNBLOCKED);
            }
            if (kotlinKeySerializersAudioAttributesCompatParcelizer.getIconCompatParcelizer() instanceof KotlinKeySerializersKt.write) {
                if (!z) {
                    this.$AudioAttributesCompatParcelizer.add(accessgetStaticJsonKeyGetter.APPEND);
                }
                isrequiredbyannotation.AudioAttributesCompatParcelizer(accessgetStaticJsonKeyGetter.APPEND);
            }
            if (kotlinKeySerializersAudioAttributesCompatParcelizer.getRemoteActionCompatParcelizer() instanceof KotlinKeySerializersKt.write) {
                if (!z) {
                    this.$AudioAttributesCompatParcelizer.add(accessgetStaticJsonKeyGetter.PREPEND);
                }
                isrequiredbyannotation.AudioAttributesCompatParcelizer(accessgetStaticJsonKeyGetter.PREPEND);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass5(List<accessgetStaticJsonKeyGetter> list) {
            super(1);
            this.$AudioAttributesCompatParcelizer = list;
        }
    }

    @Override // kotlin.KotlinObjectSingletonDeserializer
    public final void AudioAttributesCompatParcelizer(accessisPrimaryConstructor<Key, Value> p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        ArrayList arrayList = new ArrayList();
        this.IconCompatParcelizer.AudioAttributesCompatParcelizer(new AnonymousClass5(arrayList));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AudioAttributesCompatParcelizer((accessgetStaticJsonKeyGetter) it.next(), p0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // kotlin.isPossibleSingleString
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object AudioAttributesCompatParcelizer(kotlin.SampleVideos<? super o.isKotlinConstructorWithParameters.IconCompatParcelizer> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof o.accessisPossibleSingleString.AudioAttributesCompatParcelizer
            if (r0 == 0) goto L14
            r0 = r5
            o.accessisPossibleSingleString$AudioAttributesCompatParcelizer r0 = (o.accessisPossibleSingleString.AudioAttributesCompatParcelizer) r0
            int r1 = r0.IconCompatParcelizer
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r5 = r0.IconCompatParcelizer
            int r5 = r5 + r2
            r0.IconCompatParcelizer = r5
            goto L19
        L14:
            o.accessisPossibleSingleString$AudioAttributesCompatParcelizer r0 = new o.accessisPossibleSingleString$AudioAttributesCompatParcelizer
            r0.<init>(r4, r5)
        L19:
            java.lang.Object r5 = r0.AudioAttributesCompatParcelizer
            java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
            int r2 = r0.IconCompatParcelizer
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r4 = r0.RemoteActionCompatParcelizer
            o.accessisPossibleSingleString r4 = (kotlin.accessisPossibleSingleString) r4
            kotlin.SdkPayloadData.IconCompatParcelizer(r5)
            goto L44
        L2e:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L36:
            kotlin.SdkPayloadData.IconCompatParcelizer(r5)
            r0.RemoteActionCompatParcelizer = r4
            r0.IconCompatParcelizer = r3
            java.lang.Object r5 = kotlin.isKotlinConstructorWithParameters.RemoteActionCompatParcelizer()
            if (r5 != r1) goto L44
            return r1
        L44:
            r0 = r5
            o.isKotlinConstructorWithParameters$IconCompatParcelizer r0 = (o.isKotlinConstructorWithParameters.IconCompatParcelizer) r0
            o.isKotlinConstructorWithParameters$IconCompatParcelizer r1 = o.isKotlinConstructorWithParameters.IconCompatParcelizer.LAUNCH_INITIAL_REFRESH
            if (r0 != r1) goto L54
            o.isGetterLike<Key, Value> r4 = r4.IconCompatParcelizer
            o.accessisPossibleSingleString$1 r0 = kotlin.accessisPossibleSingleString.AnonymousClass1.AudioAttributesCompatParcelizer
            o.getAnswerMap r0 = (kotlin.getAnswerMap) r0
            r4.AudioAttributesCompatParcelizer(r0)
        L54:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.accessisPossibleSingleString.AudioAttributesCompatParcelizer(o.SampleVideos):java.lang.Object");
    }

    /* JADX INFO: renamed from: o.accessisPossibleSingleString$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "Key", "Value", "Lo/isRequiredByAnnotation;", "p0", "", "IconCompatParcelizer", "(Lo/isRequiredByAnnotation;)V"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass1 extends MagicModuleUseCase implements getAnswerMap<isRequiredByAnnotation<Key, Value>, getShowPopup> {
        public static final AnonymousClass1 AudioAttributesCompatParcelizer = new AnonymousClass1();

        @Override // kotlin.getAnswerMap
        public final /* synthetic */ getShowPopup invoke(Object obj) {
            IconCompatParcelizer((isRequiredByAnnotation) obj);
            return getShowPopup.INSTANCE;
        }

        public final void IconCompatParcelizer(isRequiredByAnnotation<Key, Value> isrequiredbyannotation) {
            toMagicModuleMetaRepoModel.write(isrequiredbyannotation, "");
            isrequiredbyannotation.write(accessgetStaticJsonKeyGetter.APPEND, isRequiredByAnnotation.read.REQUIRES_REFRESH);
            isrequiredbyannotation.write(accessgetStaticJsonKeyGetter.PREPEND, isRequiredByAnnotation.read.REQUIRES_REFRESH);
        }

        AnonymousClass1() {
            super(1);
        }
    }
}
