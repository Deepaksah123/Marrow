package kotlin;

import java.util.List;
import kotlin.KotlinNamesAnnotationIntrospectorhasCreatorAnnotation2;
import kotlin.Metadata;
import kotlin.getUNIT_TYPE;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u0000 \u000e*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004:\u0001\u000eJ%\u0010\u0007\u001a\u0004\u0018\u00018\u00002\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000b\u001a\u00020\n2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ-\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\r2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\n¢\u0006\u0004\b\u0011\u0010\u0012R&\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00138\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0014\u001a\u0004\b\u000b\u0010\u0015R\u0014\u0010\u0007\u001a\u00020\u00168\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0017R\u0014\u0010\u0011\u001a\u00020\u00188WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0019R\u0016\u0010\u001a\u001a\u00020\n8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b\u0082\u0002\u0004\n\u0002\b\u0019"}, d2 = {"Lo/KotlinKeyDeserializers;", "", "Key", "Value", "Lo/KotlinNamesAnnotationIntrospectorhasCreatorAnnotation2;", "Lo/accessisPrimaryConstructor;", "p0", "read", "(Lo/accessisPrimaryConstructor;)Ljava/lang/Object;", "Lo/KotlinNamesAnnotationIntrospectorhasCreatorAnnotation2$RemoteActionCompatParcelizer;", "", "write", "(Lo/KotlinNamesAnnotationIntrospectorhasCreatorAnnotation2$RemoteActionCompatParcelizer;)I", "Lo/KotlinNamesAnnotationIntrospectorhasCreatorAnnotation2$IconCompatParcelizer;", "RemoteActionCompatParcelizer", "(Lo/KotlinNamesAnnotationIntrospectorhasCreatorAnnotation2$RemoteActionCompatParcelizer;Lo/SampleVideos;)Ljava/lang/Object;", "", "IconCompatParcelizer", "(I)V", "Lo/getUNIT_TYPE;", "Lo/getUNIT_TYPE;", "()Lo/getUNIT_TYPE;", "Lo/CurrentQuery;", "Lo/CurrentQuery;", "", "()Z", "AudioAttributesCompatParcelizer", "I"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class KotlinKeyDeserializers<Key, Value> extends KotlinNamesAnnotationIntrospectorhasCreatorAnnotation2<Key, Value> {
    private static final RemoteActionCompatParcelizer RemoteActionCompatParcelizer = new RemoteActionCompatParcelizer(null);
    private int AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final CurrentQuery read;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final getUNIT_TYPE<Key, Value> RemoteActionCompatParcelizer;

    public final /* synthetic */ class read {
        public static final /* synthetic */ int[] AudioAttributesCompatParcelizer;

        static {
            int[] iArr = new int[getUNIT_TYPE.IconCompatParcelizer.values().length];
            try {
                iArr[getUNIT_TYPE.IconCompatParcelizer.POSITIONAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[getUNIT_TYPE.IconCompatParcelizer.PAGE_KEYED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[getUNIT_TYPE.IconCompatParcelizer.ITEM_KEYED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            AudioAttributesCompatParcelizer = iArr;
        }
    }

    public final getUNIT_TYPE<Key, Value> write() {
        return this.RemoteActionCompatParcelizer;
    }

    public final void IconCompatParcelizer(int p0) {
        int i = this.AudioAttributesCompatParcelizer;
        if (i != Integer.MIN_VALUE && p0 != i) {
            StringBuilder sb = new StringBuilder("Page size is already set to ");
            sb.append(this.AudioAttributesCompatParcelizer);
            sb.append('.');
            throw new IllegalStateException(sb.toString().toString());
        }
        this.AudioAttributesCompatParcelizer = p0;
    }

    private static int write(KotlinNamesAnnotationIntrospectorhasCreatorAnnotation2.RemoteActionCompatParcelizer<Key> p0) {
        if ((p0 instanceof KotlinNamesAnnotationIntrospectorhasCreatorAnnotation2.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer) && p0.getRemoteActionCompatParcelizer() % 3 == 0) {
            return p0.getRemoteActionCompatParcelizer() / 3;
        }
        return p0.getRemoteActionCompatParcelizer();
    }

    @Override // kotlin.KotlinNamesAnnotationIntrospectorhasCreatorAnnotation2
    public final Object RemoteActionCompatParcelizer(KotlinNamesAnnotationIntrospectorhasCreatorAnnotation2.RemoteActionCompatParcelizer<Key> remoteActionCompatParcelizer, SampleVideos<? super KotlinNamesAnnotationIntrospectorhasCreatorAnnotation2.IconCompatParcelizer<Key, Value>> sampleVideos) {
        accessgetStaticJsonKeyGetter accessgetstaticjsonkeygetter;
        if (remoteActionCompatParcelizer instanceof KotlinNamesAnnotationIntrospectorhasCreatorAnnotation2.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer) {
            accessgetstaticjsonkeygetter = accessgetStaticJsonKeyGetter.REFRESH;
        } else if (remoteActionCompatParcelizer instanceof KotlinNamesAnnotationIntrospectorhasCreatorAnnotation2.RemoteActionCompatParcelizer.IconCompatParcelizer) {
            accessgetstaticjsonkeygetter = accessgetStaticJsonKeyGetter.APPEND;
        } else {
            if (!(remoteActionCompatParcelizer instanceof KotlinNamesAnnotationIntrospectorhasCreatorAnnotation2.RemoteActionCompatParcelizer.read)) {
                throw new RenewEligibleCreator();
            }
            accessgetstaticjsonkeygetter = accessgetStaticJsonKeyGetter.PREPEND;
        }
        accessgetStaticJsonKeyGetter accessgetstaticjsonkeygetter2 = accessgetstaticjsonkeygetter;
        if (this.AudioAttributesCompatParcelizer == Integer.MIN_VALUE) {
            System.out.println((Object) "WARNING: pageSize on the LegacyPagingSource is not set.\nWhen using legacy DataSource / DataSourceFactory with Paging3, page size\nshould've been set by the paging library but it is not set yet.\n\nIf you are seeing this message in tests where you are testing DataSource\nin isolation (without a Pager), it is expected and page size will be estimated\nbased on parameters.\n\nIf you are seeing this message despite using a Pager, please file a bug:\nhttps://issuetracker.google.com/issues/new?component=413106");
            this.AudioAttributesCompatParcelizer = write(remoteActionCompatParcelizer);
        }
        return setModifiedEndTimestampMs.RemoteActionCompatParcelizer(this.read, new AudioAttributesCompatParcelizer(this, new getUNIT_TYPE.read(accessgetstaticjsonkeygetter2, remoteActionCompatParcelizer.write(), remoteActionCompatParcelizer.getRemoteActionCompatParcelizer(), remoteActionCompatParcelizer.getIconCompatParcelizer(), this.AudioAttributesCompatParcelizer), remoteActionCompatParcelizer, null), sampleVideos);
    }

    static final class AudioAttributesCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super KotlinNamesAnnotationIntrospectorhasCreatorAnnotation2.IconCompatParcelizer.write<Key, Value>>, Object> {
        final /* synthetic */ KotlinKeyDeserializers<Key, Value> IconCompatParcelizer;
        final /* synthetic */ KotlinNamesAnnotationIntrospectorhasCreatorAnnotation2.RemoteActionCompatParcelizer<Key> RemoteActionCompatParcelizer;
        private int read;
        final /* synthetic */ getUNIT_TYPE.read<Key> write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.read;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                getUNIT_TYPE<Key, Value> getunit_typeWrite = this.IconCompatParcelizer.write();
                this.read = 1;
                obj = getunit_typeWrite.write();
                if (obj == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            KotlinNamesAnnotationIntrospectorhasCreatorAnnotation2.RemoteActionCompatParcelizer<Key> remoteActionCompatParcelizer = this.RemoteActionCompatParcelizer;
            getUNIT_TYPE.write writeVar = (getUNIT_TYPE.write) obj;
            return new KotlinNamesAnnotationIntrospectorhasCreatorAnnotation2.IconCompatParcelizer.write(writeVar.RemoteActionCompatParcelizer, (writeVar.RemoteActionCompatParcelizer.isEmpty() && (remoteActionCompatParcelizer instanceof KotlinNamesAnnotationIntrospectorhasCreatorAnnotation2.RemoteActionCompatParcelizer.read)) ? null : writeVar.getRead(), (writeVar.RemoteActionCompatParcelizer.isEmpty() && (remoteActionCompatParcelizer instanceof KotlinNamesAnnotationIntrospectorhasCreatorAnnotation2.RemoteActionCompatParcelizer.IconCompatParcelizer)) ? null : writeVar.getAudioAttributesCompatParcelizer(), writeVar.getIconCompatParcelizer(), writeVar.getWrite());
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AudioAttributesCompatParcelizer(KotlinKeyDeserializers<Key, Value> kotlinKeyDeserializers, getUNIT_TYPE.read<Key> readVar, KotlinNamesAnnotationIntrospectorhasCreatorAnnotation2.RemoteActionCompatParcelizer<Key> remoteActionCompatParcelizer, SampleVideos<? super AudioAttributesCompatParcelizer> sampleVideos) {
            super(2, sampleVideos);
            this.IconCompatParcelizer = kotlinKeyDeserializers;
            this.write = readVar;
            this.RemoteActionCompatParcelizer = remoteActionCompatParcelizer;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return new AudioAttributesCompatParcelizer(this.IconCompatParcelizer, this.write, this.RemoteActionCompatParcelizer, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super KotlinNamesAnnotationIntrospectorhasCreatorAnnotation2.IconCompatParcelizer.write<Key, Value>> sampleVideos) {
            return ((AudioAttributesCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    @Override // kotlin.KotlinNamesAnnotationIntrospectorhasCreatorAnnotation2
    public final Key read(accessisPrimaryConstructor<Key, Value> p0) {
        Object objAudioAttributesCompatParcelizer;
        toMagicModuleMetaRepoModel.write(p0, "");
        int i = read.AudioAttributesCompatParcelizer[this.RemoteActionCompatParcelizer.getWrite().ordinal()];
        if (i != 1) {
            if (i == 2) {
                return null;
            }
            if (i == 3) {
                Integer numRemoteActionCompatParcelizer = p0.RemoteActionCompatParcelizer();
                if (numRemoteActionCompatParcelizer == null || p0.AudioAttributesCompatParcelizer(numRemoteActionCompatParcelizer.intValue()) == null) {
                    return null;
                }
                return this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer();
            }
            throw new RenewEligibleCreator();
        }
        Integer numRemoteActionCompatParcelizer2 = p0.RemoteActionCompatParcelizer();
        if (numRemoteActionCompatParcelizer2 == null) {
            return null;
        }
        int iIntValue = numRemoteActionCompatParcelizer2.intValue();
        int size = iIntValue - ((accessisPrimaryConstructor) p0).write;
        for (int i2 = 0; i2 < IntermediateLoginResponseBody.write((List) p0.read()) && size > IntermediateLoginResponseBody.write((List) p0.read().get(i2).IconCompatParcelizer()); i2++) {
            size -= p0.read().get(i2).IconCompatParcelizer().size();
        }
        KotlinNamesAnnotationIntrospectorhasCreatorAnnotation2.IconCompatParcelizer.write<Key, Value> writeVarIconCompatParcelizer = p0.IconCompatParcelizer(iIntValue);
        if (writeVarIconCompatParcelizer == null || (objAudioAttributesCompatParcelizer = writeVarIconCompatParcelizer.AudioAttributesCompatParcelizer()) == null) {
            objAudioAttributesCompatParcelizer = 0;
        }
        toMagicModuleMetaRepoModel.read(objAudioAttributesCompatParcelizer, "");
        return (Key) Integer.valueOf(((Integer) objAudioAttributesCompatParcelizer).intValue() + size);
    }

    @Override // kotlin.KotlinNamesAnnotationIntrospectorhasCreatorAnnotation2
    public final boolean read() {
        return this.RemoteActionCompatParcelizer.getWrite() == getUNIT_TYPE.IconCompatParcelizer.POSITIONAL;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/KotlinKeyDeserializers$RemoteActionCompatParcelizer;", "", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    static final class RemoteActionCompatParcelizer {
        private RemoteActionCompatParcelizer() {
        }

        public /* synthetic */ RemoteActionCompatParcelizer(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }
}
