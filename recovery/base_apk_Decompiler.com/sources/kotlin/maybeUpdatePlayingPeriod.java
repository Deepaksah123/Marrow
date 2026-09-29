package kotlin;

/* JADX INFO: loaded from: classes2.dex */
public final class maybeUpdatePlayingPeriod {
    private static final maybeUpdatePlayingPeriod IconCompatParcelizer = new maybeUpdatePlayingPeriod();
    private final ActionMenuViewLayoutParams<String, ExoPlayerImplExternalSyntheticLambda19> AudioAttributesCompatParcelizer = new ActionMenuViewLayoutParams<>(20);

    public static maybeUpdatePlayingPeriod read() {
        return IconCompatParcelizer;
    }

    maybeUpdatePlayingPeriod() {
    }

    public final ExoPlayerImplExternalSyntheticLambda19 AudioAttributesCompatParcelizer(String str) {
        if (str == null) {
            return null;
        }
        return this.AudioAttributesCompatParcelizer.get(str);
    }

    public final void IconCompatParcelizer(String str, ExoPlayerImplExternalSyntheticLambda19 exoPlayerImplExternalSyntheticLambda19) {
        if (str == null) {
            return;
        }
        this.AudioAttributesCompatParcelizer.put(str, exoPlayerImplExternalSyntheticLambda19);
    }
}
