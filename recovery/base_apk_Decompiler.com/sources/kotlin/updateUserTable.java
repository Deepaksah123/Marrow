package kotlin;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
public final class updateUserTable {
    private static final refreshSubscription<CourseConfigSerializer<? extends Object>> write = ContentResetResponse.RemoteActionCompatParcelizer(AnonymousClass2.write);
    private static final refreshSubscription<component16> IconCompatParcelizer = ContentResetResponse.RemoteActionCompatParcelizer(AnonymousClass1.IconCompatParcelizer);
    private static final refreshSubscription<deleteOfflineDownloadedFiles> RemoteActionCompatParcelizer = ContentResetResponse.RemoteActionCompatParcelizer(AnonymousClass5.read);
    private static final refreshSubscription<deleteOfflineDownloadedFiles> read = ContentResetResponse.RemoteActionCompatParcelizer(AnonymousClass4.read);
    private static final refreshSubscription<ConcurrentHashMap<Pair<List<clearAllAppData>, Boolean>, deleteOfflineDownloadedFiles>> AudioAttributesCompatParcelizer = ContentResetResponse.RemoteActionCompatParcelizer(IconCompatParcelizer.RemoteActionCompatParcelizer);

    /* JADX INFO: renamed from: o.updateUserTable$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\n\b\u0001\u0012\u0006*\u00020\u00030\u00030\u00022\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ljava/lang/Class;", "p0", "Lo/CourseConfigSerializer;", "", "write", "(Ljava/lang/Class;)Lo/CourseConfigSerializer;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass2 extends MagicModuleUseCase implements getAnswerMap<Class<?>, CourseConfigSerializer<? extends Object>> {
        public static final AnonymousClass2 write = new AnonymousClass2();

        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public final CourseConfigSerializer<? extends Object> invoke(Class<?> cls) {
            toMagicModuleMetaRepoModel.write(cls, "");
            return new CourseConfigSerializer<>(cls);
        }

        AnonymousClass2() {
            super(1);
        }
    }

    /* JADX INFO: renamed from: o.updateUserTable$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ljava/lang/Class;", "p0", "Lo/component16;", "write", "(Ljava/lang/Class;)Lo/component16;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass1 extends MagicModuleUseCase implements getAnswerMap<Class<?>, component16> {
        public static final AnonymousClass1 IconCompatParcelizer = new AnonymousClass1();

        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public final component16 invoke(Class<?> cls) {
            toMagicModuleMetaRepoModel.write(cls, "");
            return new component16(cls);
        }

        AnonymousClass1() {
            super(1);
        }
    }

    public static final <T> CourseConfigSerializer<T> IconCompatParcelizer(Class<T> cls) {
        toMagicModuleMetaRepoModel.write(cls, "");
        CourseConfigKeyConstantsKt courseConfigKeyConstantsKtWrite = write.write(cls);
        toMagicModuleMetaRepoModel.read(courseConfigKeyConstantsKtWrite, "");
        return (CourseConfigSerializer) courseConfigKeyConstantsKtWrite;
    }

    public static final <T> isAuthError read(Class<T> cls) {
        toMagicModuleMetaRepoModel.write(cls, "");
        return IconCompatParcelizer.write(cls);
    }

    /* JADX INFO: renamed from: o.updateUserTable$5, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ljava/lang/Class;", "p0", "Lo/deleteOfflineDownloadedFiles;", "write", "(Ljava/lang/Class;)Lo/deleteOfflineDownloadedFiles;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass5 extends MagicModuleUseCase implements getAnswerMap<Class<?>, deleteOfflineDownloadedFiles> {
        public static final AnonymousClass5 read = new AnonymousClass5();

        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public final deleteOfflineDownloadedFiles invoke(Class<?> cls) {
            toMagicModuleMetaRepoModel.write(cls, "");
            return logFirebaseException.read(updateUserTable.IconCompatParcelizer(cls), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(), false, IntermediateLoginResponseBody.RemoteActionCompatParcelizer());
        }

        AnonymousClass5() {
            super(1);
        }
    }

    /* JADX INFO: renamed from: o.updateUserTable$4, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ljava/lang/Class;", "p0", "Lo/deleteOfflineDownloadedFiles;", "read", "(Ljava/lang/Class;)Lo/deleteOfflineDownloadedFiles;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass4 extends MagicModuleUseCase implements getAnswerMap<Class<?>, deleteOfflineDownloadedFiles> {
        public static final AnonymousClass4 read = new AnonymousClass4();

        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public final deleteOfflineDownloadedFiles invoke(Class<?> cls) {
            toMagicModuleMetaRepoModel.write(cls, "");
            return logFirebaseException.read(updateUserTable.IconCompatParcelizer(cls), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(), true, IntermediateLoginResponseBody.RemoteActionCompatParcelizer());
        }

        AnonymousClass4() {
            super(1);
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a$\u0012\u001a\u0012\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u00050\u0002j\u0002`\u0006\u0012\u0004\u0012\u00020\u00070\u00012\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\tH\n¢\u0006\u0002\b\n"}, d2 = {"<anonymous>", "Ljava/util/concurrent/ConcurrentHashMap;", "Lkotlin/Pair;", "", "Lkotlin/reflect/KTypeProjection;", "", "Lkotlin/reflect/jvm/internal/Key;", "Lkotlin/reflect/KType;", "it", "Ljava/lang/Class;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class IconCompatParcelizer extends MagicModuleUseCase implements getAnswerMap<Class<?>, ConcurrentHashMap<Pair<? extends List<? extends clearAllAppData>, ? extends Boolean>, deleteOfflineDownloadedFiles>> {
        public static final IconCompatParcelizer RemoteActionCompatParcelizer = new IconCompatParcelizer();

        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final ConcurrentHashMap<Pair<List<clearAllAppData>, Boolean>, deleteOfflineDownloadedFiles> invoke(Class<?> cls) {
            toMagicModuleMetaRepoModel.write(cls, "");
            return new ConcurrentHashMap<>();
        }

        IconCompatParcelizer() {
            super(1);
        }
    }

    public static final <T> deleteOfflineDownloadedFiles RemoteActionCompatParcelizer(Class<T> cls, List<clearAllAppData> list, boolean z) {
        toMagicModuleMetaRepoModel.write(cls, "");
        toMagicModuleMetaRepoModel.write(list, "");
        if (list.isEmpty()) {
            return read.write(cls);
        }
        return read(cls, list, true);
    }

    private static final <T> deleteOfflineDownloadedFiles read(Class<T> cls, List<clearAllAppData> list, boolean z) {
        deleteOfflineDownloadedFiles deleteofflinedownloadedfilesPutIfAbsent;
        ConcurrentHashMap<Pair<List<clearAllAppData>, Boolean>, deleteOfflineDownloadedFiles> concurrentHashMapWrite = AudioAttributesCompatParcelizer.write(cls);
        Pair<List<clearAllAppData>, Boolean> pairWrite = setAction.write(list, Boolean.valueOf(z));
        deleteOfflineDownloadedFiles deleteofflinedownloadedfiles = concurrentHashMapWrite.get(pairWrite);
        if (deleteofflinedownloadedfiles == null && (deleteofflinedownloadedfilesPutIfAbsent = concurrentHashMapWrite.putIfAbsent(pairWrite, (deleteofflinedownloadedfiles = logFirebaseException.read(IconCompatParcelizer(cls), list, z, IntermediateLoginResponseBody.RemoteActionCompatParcelizer())))) != null) {
            deleteofflinedownloadedfiles = deleteofflinedownloadedfilesPutIfAbsent;
        }
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(deleteofflinedownloadedfiles, "");
        return deleteofflinedownloadedfiles;
    }
}
