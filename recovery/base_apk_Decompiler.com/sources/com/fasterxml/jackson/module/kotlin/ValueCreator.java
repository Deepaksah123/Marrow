package com.fasterxml.jackson.module.kotlin;

import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.MapperFeature;
import java.util.List;
import java.util.Map;
import kotlin.ApplicationData;
import kotlin.MagicModuleRepositoryImplExternalSyntheticLambda0;
import kotlin.Metadata;
import kotlin.getErrorMessageId;
import kotlin.onProfileUpdated;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004J#\u0010\b\u001a\u00028\u00002\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000e8%X¤\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u00128%X¤\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00060\u00168G¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018\u0082\u0001\u0002\u001a\u001b"}, d2 = {"Lcom/fasterxml/jackson/module/kotlin/ValueCreator;", "T", "", "<init>", "()V", "", "Lo/ApplicationData;", "p0", "callBy", "(Ljava/util/Map;)Ljava/lang/Object;", "Lcom/fasterxml/jackson/databind/DeserializationContext;", "", "checkAccessibility", "(Lcom/fasterxml/jackson/databind/DeserializationContext;)V", "", "getAccessible", "()Z", "accessible", "Lkotlin/reflect/KFunction;", "getCallable", "()Lo/getErrorMessageId;", "callable", "", "getValueParameters", "()Ljava/util/List;", "valueParameters", "Lcom/fasterxml/jackson/module/kotlin/ConstructorValueCreator;", "Lcom/fasterxml/jackson/module/kotlin/MethodValueCreator;"}, k = 1, mv = {1, 5, 1}, xi = 48)
public abstract class ValueCreator<T> {
    protected abstract boolean getAccessible();

    protected abstract getErrorMessageId<T> getCallable();

    private ValueCreator() {
    }

    public final List<ApplicationData> getValueParameters() {
        return onProfileUpdated.IconCompatParcelizer(getCallable());
    }

    public final void checkAccessibility(DeserializationContext p0) throws IllegalAccessException {
        toMagicModuleMetaRepoModel.write(p0, "");
        if (getAccessible() || !p0.getConfig().isEnabled(MapperFeature.CAN_OVERRIDE_ACCESS_MODIFIERS)) {
            if (!getAccessible() || !p0.getConfig().isEnabled(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS)) {
                throw new IllegalAccessException(toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer("Cannot access to function or companion object instance, target: ", (Object) getCallable()));
            }
        }
    }

    public final T callBy(Map<ApplicationData, ? extends Object> p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return getCallable().AudioAttributesCompatParcelizer(p0);
    }

    public /* synthetic */ ValueCreator(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this();
    }
}
