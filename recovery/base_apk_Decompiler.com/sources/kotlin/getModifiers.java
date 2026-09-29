package kotlin;

import android.content.Context;
import java.io.File;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
public final class getModifiers implements PlaybackConfigRootRequestBody<Context, collectAnnotations<AnnotatedMethod>> {
    private final AnnotatedFieldCollector<AnnotatedMethod> AudioAttributesCompatParcelizer;
    private final TopUserCompanion AudioAttributesImplApi21Parcelizer;
    private final String IconCompatParcelizer;
    private volatile collectAnnotations<AnnotatedMethod> RemoteActionCompatParcelizer;
    private final getAnswerMap<Context, List<withAnnotations<AnnotatedMethod>>> read;
    private final Object write;

    /* JADX WARN: Multi-variable type inference failed */
    public getModifiers(String str, AnnotatedFieldCollector<AnnotatedMethod> annotatedFieldCollector, getAnswerMap<? super Context, ? extends List<? extends withAnnotations<AnnotatedMethod>>> getanswermap, TopUserCompanion topUserCompanion) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(getanswermap, "");
        toMagicModuleMetaRepoModel.write(topUserCompanion, "");
        this.IconCompatParcelizer = str;
        this.AudioAttributesCompatParcelizer = annotatedFieldCollector;
        this.read = getanswermap;
        this.AudioAttributesImplApi21Parcelizer = topUserCompanion;
        this.write = new Object();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.PlaybackConfigRootRequestBody
    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public collectAnnotations<AnnotatedMethod> read(Context context, isResolutionNotSupported<?> isresolutionnotsupported) {
        collectAnnotations<AnnotatedMethod> collectannotations;
        toMagicModuleMetaRepoModel.write(context, "");
        toMagicModuleMetaRepoModel.write(isresolutionnotsupported, "");
        collectAnnotations<AnnotatedMethod> collectannotations2 = this.RemoteActionCompatParcelizer;
        if (collectannotations2 != null) {
            return collectannotations2;
        }
        synchronized (this.write) {
            if (this.RemoteActionCompatParcelizer == null) {
                Context applicationContext = context.getApplicationContext();
                AnnotatedMember annotatedMember = AnnotatedMember.INSTANCE;
                AnnotatedFieldCollector<AnnotatedMethod> annotatedFieldCollector = this.AudioAttributesCompatParcelizer;
                getAnswerMap<Context, List<withAnnotations<AnnotatedMethod>>> getanswermap = this.read;
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(applicationContext, "");
                this.RemoteActionCompatParcelizer = AnnotatedMember.read(annotatedFieldCollector, getanswermap.invoke(applicationContext), this.AudioAttributesImplApi21Parcelizer, new AnonymousClass3(applicationContext, this));
            }
            collectannotations = this.RemoteActionCompatParcelizer;
            toMagicModuleMetaRepoModel.write(collectannotations);
        }
        return collectannotations;
    }

    /* JADX INFO: renamed from: o.getModifiers$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljava/io/File;", "read", "()Ljava/io/File;"}, k = 3, mv = {1, 5, 1}, xi = 48)
    static final class AnonymousClass3 extends MagicModuleUseCase implements getCreatedOnDateMs<File> {
        final /* synthetic */ Context $read;
        final /* synthetic */ getModifiers write;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public final File invoke() {
            Context context = this.$read;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(context, "");
            return isTransient.write(context, this.write.IconCompatParcelizer);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(Context context, getModifiers getmodifiers) {
            super(0);
            this.$read = context;
            this.write = getmodifiers;
        }
    }
}
