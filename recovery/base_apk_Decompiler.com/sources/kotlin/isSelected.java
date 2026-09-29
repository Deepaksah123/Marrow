package kotlin;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
final class isSelected<TResult> extends copyWithId<TResult> {
    private final isAdaptiveSupported<TResult> IconCompatParcelizer;

    public isSelected(Executor executor, isAdaptiveSupported<TResult> isadaptivesupported) {
        super(executor);
        this.IconCompatParcelizer = isadaptivesupported;
    }

    @Override // kotlin.copyWithId
    final void read(final TResult tresult) {
        this.write.execute(new Runnable() { // from class: o.isSelected.4
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public final void run() {
                isSelected.this.IconCompatParcelizer.AudioAttributesCompatParcelizer(tresult);
            }
        });
    }
}
