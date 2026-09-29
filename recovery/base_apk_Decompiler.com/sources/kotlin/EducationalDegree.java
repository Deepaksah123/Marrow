package kotlin;

import java.io.Closeable;
import java.util.concurrent.Executor;
import kotlin.CurrentQuery;
import kotlin.EducationalDegree;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b&\u0018\u0000 \r2\u00020\u00012\u00020\u00022\u00060\u0004j\u0002`\u0003:\u0001\rB\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u000b\u001a\u00020\fH&R\u0012\u0010\u0007\u001a\u00020\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Lkotlinx/coroutines/ExecutorCoroutineDispatcher;", "Lkotlinx/coroutines/CoroutineDispatcher;", "Ljava/io/Closeable;", "Lkotlin/AutoCloseable;", "Ljava/lang/AutoCloseable;", "<init>", "()V", "executor", "Ljava/util/concurrent/Executor;", "getExecutor", "()Ljava/util/concurrent/Executor;", "close", "", "Key", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class EducationalDegree extends getPlatform implements Closeable, AutoCloseable {
    public static final write AudioAttributesCompatParcelizer = new write(null);

    public abstract Executor read();

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lo/EducationalDegree$write;", "Lo/PlaybackSettingsCompanion;", "Lo/getPlatform;", "Lo/EducationalDegree;", "<init>", "()V"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class write extends PlaybackSettingsCompanion<getPlatform, EducationalDegree> {
        private write() {
            super(getPlatform.read, new getAnswerMap() { // from class: o.getDefaultCourse
                @Override // kotlin.getAnswerMap
                public final Object invoke(Object obj) {
                    return EducationalDegree.write.read((CurrentQuery.write) obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final EducationalDegree read(CurrentQuery.write writeVar) {
            if (writeVar instanceof EducationalDegree) {
                return (EducationalDegree) writeVar;
            }
            return null;
        }

        public /* synthetic */ write(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }
}
