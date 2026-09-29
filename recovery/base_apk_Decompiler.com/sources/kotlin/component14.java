package kotlin;

/* JADX INFO: loaded from: classes5.dex */
public final class component14 extends LessonIndexResponseBody<Object> implements InteractiveVideoElementTransformerKt<Object> {
    public static final LessonIndexResponseBody<Object> IconCompatParcelizer = new component14();

    @Override // kotlin.InteractiveVideoElementTransformerKt, java.util.concurrent.Callable
    public final Object call() {
        return null;
    }

    private component14() {
    }

    @Override // kotlin.LessonIndexResponseBody
    public final void AudioAttributesCompatParcelizer(getUpdates<? super Object> getupdates) {
        isLessonPaid.write(getupdates);
    }
}
