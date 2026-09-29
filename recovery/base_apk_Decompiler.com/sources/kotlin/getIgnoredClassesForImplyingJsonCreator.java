package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0001B7\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00018\u0000\u0012\u0018\u0010\t\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\b0\u0007¢\u0006\u0004\b\n\u0010\u000bBK\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00018\u0000\u0012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\f\u0012\u0018\u0010\r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\b0\u0007¢\u0006\u0004\b\n\u0010\u000eR#\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00100\u000f8\u0007¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014"}, d2 = {"Lo/getIgnoredClassesForImplyingJsonCreator;", "", "Key", "Value", "Lo/accessfilterOutSingleStringCallables;", "p0", "p1", "Lkotlin/Function0;", "Lo/KotlinNamesAnnotationIntrospectorhasCreatorAnnotation2;", "p2", "<init>", "(Lo/accessfilterOutSingleStringCallables;Ljava/lang/Object;Lo/getCreatedOnDateMs;)V", "Lo/isKotlinConstructorWithParameters;", "p3", "(Lo/accessfilterOutSingleStringCallables;Ljava/lang/Object;Lo/getCreatedOnDateMs;B)V", "Lo/NewNumberOtpResendRequest;", "Lo/accessisKotlinConstructorWithParameters;", "RemoteActionCompatParcelizer", "Lo/NewNumberOtpResendRequest;", "read", "()Lo/NewNumberOtpResendRequest;", "write"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class getIgnoredClassesForImplyingJsonCreator<Key, Value> {

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final NewNumberOtpResendRequest<accessisKotlinConstructorWithParameters<Value>> write;

    private getIgnoredClassesForImplyingJsonCreator(accessfilterOutSingleStringCallables accessfilteroutsinglestringcallables, Key key, getCreatedOnDateMs<? extends KotlinNamesAnnotationIntrospectorhasCreatorAnnotation2<Key, Value>> getcreatedondatems, byte b) {
        write writeVar;
        toMagicModuleMetaRepoModel.write(accessfilteroutsinglestringcallables, "");
        toMagicModuleMetaRepoModel.write(getcreatedondatems, "");
        if (getcreatedondatems instanceof accessgetStaticJsonValueGetter) {
            writeVar = new RemoteActionCompatParcelizer(getcreatedondatems);
        } else {
            writeVar = new write(getcreatedondatems, null);
        }
        this.write = new findKotlinParameterName(writeVar, key, accessfilteroutsinglestringcallables, null).write();
    }

    public /* synthetic */ getIgnoredClassesForImplyingJsonCreator(accessfilterOutSingleStringCallables accessfilteroutsinglestringcallables, Object obj, getCreatedOnDateMs getcreatedondatems, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(accessfilteroutsinglestringcallables, (i & 2) != 0 ? null : obj, getcreatedondatems);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    private getIgnoredClassesForImplyingJsonCreator(accessfilterOutSingleStringCallables accessfilteroutsinglestringcallables, Key key, getCreatedOnDateMs<? extends KotlinNamesAnnotationIntrospectorhasCreatorAnnotation2<Key, Value>> getcreatedondatems) {
        this(accessfilteroutsinglestringcallables, key, getcreatedondatems, (byte) 0);
        toMagicModuleMetaRepoModel.write(accessfilteroutsinglestringcallables, "");
        toMagicModuleMetaRepoModel.write(getcreatedondatems, "");
    }

    public final NewNumberOtpResendRequest<accessisKotlinConstructorWithParameters<Value>> read() {
        return this.write;
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    final /* synthetic */ class RemoteActionCompatParcelizer extends MagicModuleRepositoryImpl_Factory implements getAnswerMap<SampleVideos<? super KotlinNamesAnnotationIntrospectorhasCreatorAnnotation2<Key, Value>>, Object>, getUserTimezone {
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public final Object invoke(SampleVideos<? super KotlinNamesAnnotationIntrospectorhasCreatorAnnotation2<Key, Value>> sampleVideos) {
            return ((accessgetStaticJsonValueGetter) this.AudioAttributesImplApi26Parcelizer).AudioAttributesCompatParcelizer(sampleVideos);
        }

        RemoteActionCompatParcelizer(Object obj) {
            super(1, obj, accessgetStaticJsonValueGetter.class, "create", "create(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }
    }

    static final class write extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super KotlinNamesAnnotationIntrospectorhasCreatorAnnotation2<Key, Value>>, Object> {
        private int IconCompatParcelizer;
        final /* synthetic */ getCreatedOnDateMs<KotlinNamesAnnotationIntrospectorhasCreatorAnnotation2<Key, Value>> write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            getYear.IconCompatParcelizer();
            SdkPayloadData.IconCompatParcelizer(obj);
            return this.write.invoke();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        write(getCreatedOnDateMs<? extends KotlinNamesAnnotationIntrospectorhasCreatorAnnotation2<Key, Value>> getcreatedondatems, SampleVideos<? super write> sampleVideos) {
            super(1, sampleVideos);
            this.write = getcreatedondatems;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return new write(this.write, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super KotlinNamesAnnotationIntrospectorhasCreatorAnnotation2<Key, Value>> sampleVideos) {
            return ((write) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }
}
