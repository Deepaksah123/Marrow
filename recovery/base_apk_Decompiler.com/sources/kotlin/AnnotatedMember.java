package kotlin;

import java.io.File;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JM\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u000f2\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\b0\u00072\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u0010\u0010\u0011"}, d2 = {"Lo/AnnotatedMember;", "", "<init>", "()V", "Lo/AnnotatedFieldCollector;", "Lo/AnnotatedMethod;", "p0", "", "Lo/withAnnotations;", "p1", "Lo/TopUserCompanion;", "p2", "Lkotlin/Function0;", "Ljava/io/File;", "p3", "Lo/collectAnnotations;", "read", "(Lo/AnnotatedFieldCollector;Ljava/util/List;Lo/TopUserCompanion;Lo/getCreatedOnDateMs;)Lo/collectAnnotations;"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class AnnotatedMember {
    public static final AnnotatedMember INSTANCE = new AnnotatedMember();

    private AnnotatedMember() {
    }

    public static collectAnnotations<AnnotatedMethod> read(AnnotatedFieldCollector<AnnotatedMethod> p0, List<? extends withAnnotations<AnnotatedMethod>> p1, TopUserCompanion p2, getCreatedOnDateMs<? extends File> p3) {
        toMagicModuleMetaRepoModel.write(p1, "");
        toMagicModuleMetaRepoModel.write(p2, "");
        toMagicModuleMetaRepoModel.write(p3, "");
        _findPotentialFactories _findpotentialfactories = _findPotentialFactories.INSTANCE;
        return new callOnWith(_findPotentialFactories.IconCompatParcelizer(_addMemberMethods.INSTANCE, p0, p1, p2, new AnonymousClass5(p3)));
    }

    /* JADX INFO: renamed from: o.AnnotatedMember$5, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljava/io/File;", "RemoteActionCompatParcelizer", "()Ljava/io/File;"}, k = 3, mv = {1, 5, 1}, xi = 48)
    static final class AnonymousClass5 extends MagicModuleUseCase implements getCreatedOnDateMs<File> {
        final /* synthetic */ getCreatedOnDateMs<File> $AudioAttributesCompatParcelizer;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final File invoke() {
            File fileInvoke = this.$AudioAttributesCompatParcelizer.invoke();
            String strAudioAttributesImplApi21Parcelizer = downloadMagicModuleDetail.AudioAttributesImplApi21Parcelizer(fileInvoke);
            _addMemberMethods _addmembermethods = _addMemberMethods.INSTANCE;
            if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) strAudioAttributesImplApi21Parcelizer, (Object) _addMemberMethods.IconCompatParcelizer())) {
                return fileInvoke;
            }
            StringBuilder sb = new StringBuilder("File extension for file: ");
            sb.append(fileInvoke);
            sb.append(" does not match required extension for Preferences file: ");
            _addMemberMethods _addmembermethods2 = _addMemberMethods.INSTANCE;
            sb.append(_addMemberMethods.IconCompatParcelizer());
            throw new IllegalStateException(sb.toString().toString());
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass5(getCreatedOnDateMs<? extends File> getcreatedondatems) {
            super(0);
            this.$AudioAttributesCompatParcelizer = getcreatedondatems;
        }
    }
}
