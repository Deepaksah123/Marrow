package com.fasterxml.jackson.module.kotlin;

import kotlin.Metadata;
import kotlin.getErrorMessageId;
import kotlin.promptApiBlockDrivenAction;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\b\u001a\u00020\u00078\u0015X\u0094\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR \u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0015X\u0095\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/fasterxml/jackson/module/kotlin/ConstructorValueCreator;", "T", "Lcom/fasterxml/jackson/module/kotlin/ValueCreator;", "Lkotlin/reflect/KFunction;", "p0", "<init>", "(Lo/getErrorMessageId;)V", "", "accessible", "Z", "getAccessible", "()Z", "callable", "Lo/getErrorMessageId;", "getCallable", "()Lo/getErrorMessageId;"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class ConstructorValueCreator<T> extends ValueCreator<T> {
    private final boolean accessible;
    private final getErrorMessageId<T> callable;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ConstructorValueCreator(getErrorMessageId<? extends T> geterrormessageid) {
        super(null);
        toMagicModuleMetaRepoModel.write(geterrormessageid, "");
        this.callable = geterrormessageid;
        this.accessible = promptApiBlockDrivenAction.RemoteActionCompatParcelizer(getCallable());
        if (getAccessible()) {
            return;
        }
        promptApiBlockDrivenAction.read(getCallable());
    }

    @Override // com.fasterxml.jackson.module.kotlin.ValueCreator
    protected final getErrorMessageId<T> getCallable() {
        return this.callable;
    }

    @Override // com.fasterxml.jackson.module.kotlin.ValueCreator
    protected final boolean getAccessible() {
        return this.accessible;
    }
}
