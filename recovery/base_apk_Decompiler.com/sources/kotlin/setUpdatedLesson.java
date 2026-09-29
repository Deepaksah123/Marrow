package kotlin;

/* JADX INFO: loaded from: classes4.dex */
public final class setUpdatedLesson {
    public static final boolean read(setPublishedTime setpublishedtime) {
        toMagicModuleMetaRepoModel.write(setpublishedtime, "");
        return IconCompatParcelizer(setpublishedtime);
    }

    private static boolean IconCompatParcelizer(setPublishedTime setpublishedtime) {
        toMagicModuleMetaRepoModel.write(setpublishedtime, "");
        return (setpublishedtime.AudioAttributesCompatParcelizer() == 1 && setpublishedtime.read() >= 4) || setpublishedtime.AudioAttributesCompatParcelizer() > 1;
    }
}
