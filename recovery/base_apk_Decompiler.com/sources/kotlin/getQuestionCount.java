package kotlin;

/* JADX INFO: loaded from: classes.dex */
public final class getQuestionCount<T> extends accessgetEmptyStatecp<T> implements InteractiveVideoElementTransformerKt<T> {
    private final T RemoteActionCompatParcelizer;

    public getQuestionCount(T t) {
        this.RemoteActionCompatParcelizer = t;
    }

    @Override // kotlin.accessgetEmptyStatecp
    public final void read(SchemaUserStatusRSModel<? super T> schemaUserStatusRSModel) {
        schemaUserStatusRSModel.AudioAttributesCompatParcelizer(new setSubscriptionPeriod(schemaUserStatusRSModel, this.RemoteActionCompatParcelizer));
    }

    @Override // kotlin.InteractiveVideoElementTransformerKt, java.util.concurrent.Callable
    public final T call() {
        return this.RemoteActionCompatParcelizer;
    }
}
