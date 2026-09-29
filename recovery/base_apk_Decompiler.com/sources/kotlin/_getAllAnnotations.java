package kotlin;

import androidx.hilt.work.WorkerFactoryModule;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class _getAllAnnotations implements getSubmittedOn<_removeIgnored> {
    private final getTestId<Map<String, setDescriptionList<_mergeAnnotations<? extends j>>>> write;

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.setDescriptionList
    /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public _removeIgnored get() {
        return IconCompatParcelizer(this.write.get());
    }

    public static _removeIgnored IconCompatParcelizer(Map<String, setDescriptionList<_mergeAnnotations<? extends j>>> map) {
        return (_removeIgnored) setPossibleScore.write(WorkerFactoryModule.write(map));
    }
}
