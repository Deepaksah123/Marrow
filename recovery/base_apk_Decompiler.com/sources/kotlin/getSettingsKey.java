package kotlin;

import java.util.Comparator;

/* JADX INFO: loaded from: classes4.dex */
final class getSettingsKey implements Comparator {
    private final MagicModuleSubmissionRequestBody read;

    public getSettingsKey(MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody) {
        this.read = magicModuleSubmissionRequestBody;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return getNavDrawerKey.write(this.read, obj, obj2);
    }
}
