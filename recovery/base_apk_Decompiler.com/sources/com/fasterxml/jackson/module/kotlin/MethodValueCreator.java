package com.fasterxml.jackson.module.kotlin;

import java.lang.reflect.Field;
import kotlin.ApplicationData;
import kotlin.MagicModuleFeedbackRequestBody;
import kotlin.MagicModuleRepositoryImplExternalSyntheticLambda0;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.getErrorMessageId;
import kotlin.isHdPlaybackError;
import kotlin.onProfileUpdated;
import kotlin.promptApiBlockDrivenAction;
import kotlin.setAction;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u001c*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0001\u001cB'\b\u0002\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\u00058\u0015X\u0094\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR \u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0015X\u0095\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\u00020\u00178\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b"}, d2 = {"Lcom/fasterxml/jackson/module/kotlin/MethodValueCreator;", "T", "Lcom/fasterxml/jackson/module/kotlin/ValueCreator;", "Lkotlin/reflect/KFunction;", "p0", "", "p1", "", "p2", "<init>", "(Lo/getErrorMessageId;ZLjava/lang/Object;)V", "accessible", "Z", "getAccessible", "()Z", "callable", "Lo/getErrorMessageId;", "getCallable", "()Lo/getErrorMessageId;", "companionObjectInstance", "Ljava/lang/Object;", "getCompanionObjectInstance", "()Ljava/lang/Object;", "Lo/ApplicationData;", "instanceParameter", "Lo/ApplicationData;", "getInstanceParameter", "()Lo/ApplicationData;", "Companion"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class MethodValueCreator<T> extends ValueCreator<T> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final boolean accessible;
    private final getErrorMessageId<T> callable;
    private final Object companionObjectInstance;
    private final ApplicationData instanceParameter;

    @Override // com.fasterxml.jackson.module.kotlin.ValueCreator
    protected final getErrorMessageId<T> getCallable() {
        return this.callable;
    }

    @Override // com.fasterxml.jackson.module.kotlin.ValueCreator
    protected final boolean getAccessible() {
        return this.accessible;
    }

    public final Object getCompanionObjectInstance() {
        return this.companionObjectInstance;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private MethodValueCreator(getErrorMessageId<? extends T> geterrormessageid, boolean z, Object obj) {
        super(null);
        this.callable = geterrormessageid;
        this.accessible = z;
        this.companionObjectInstance = obj;
        ApplicationData applicationData = onProfileUpdated.read(getCallable());
        toMagicModuleMetaRepoModel.write(applicationData);
        this.instanceParameter = applicationData;
    }

    public final ApplicationData getInstanceParameter() {
        return this.instanceParameter;
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\b\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0007\"\u0004\b\u0001\u0010\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lcom/fasterxml/jackson/module/kotlin/MethodValueCreator$Companion;", "", "<init>", "()V", "T", "Lkotlin/reflect/KFunction;", "p0", "Lcom/fasterxml/jackson/module/kotlin/MethodValueCreator;", "of", "(Lo/getErrorMessageId;)Lcom/fasterxml/jackson/module/kotlin/MethodValueCreator;"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final <T> MethodValueCreator<T> of(getErrorMessageId<? extends T> p0) throws IllegalAccessException {
            Field field;
            Pair pairWrite;
            toMagicModuleMetaRepoModel.write(p0, "");
            getErrorMessageId<? extends T> geterrormessageid = p0;
            MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0 = null;
            if (onProfileUpdated.RemoteActionCompatParcelizer(geterrormessageid) != null) {
                return null;
            }
            ApplicationData applicationData = onProfileUpdated.read(geterrormessageid);
            toMagicModuleMetaRepoModel.write(applicationData);
            isHdPlaybackError ishdplaybackerror = MagicModuleFeedbackRequestBody.read(TypesKt.erasedType(applicationData.read()));
            if (!ishdplaybackerror.MediaBrowserCompatMediaItem()) {
                return null;
            }
            boolean zRemoteActionCompatParcelizer = promptApiBlockDrivenAction.RemoteActionCompatParcelizer(geterrormessageid);
            if (!zRemoteActionCompatParcelizer) {
                promptApiBlockDrivenAction.read(geterrormessageid);
            }
            try {
                Object objMediaBrowserCompatCustomActionResultReceiver = ishdplaybackerror.MediaBrowserCompatCustomActionResultReceiver();
                toMagicModuleMetaRepoModel.write(objMediaBrowserCompatCustomActionResultReceiver);
                pairWrite = setAction.write(objMediaBrowserCompatCustomActionResultReceiver, Boolean.valueOf(zRemoteActionCompatParcelizer));
            } catch (IllegalAccessException e) {
                Field[] declaredFields = MagicModuleFeedbackRequestBody.IconCompatParcelizer(ishdplaybackerror).getEnclosingClass().getDeclaredFields();
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(declaredFields, "");
                Field[] fieldArr = declaredFields;
                int length = fieldArr.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        field = null;
                        break;
                    }
                    field = fieldArr[i];
                    Class<?> type = field.getType();
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(type, "");
                    if (MagicModuleFeedbackRequestBody.read(type).MediaBrowserCompatMediaItem()) {
                        break;
                    }
                    i++;
                }
                Field field2 = field;
                if (field2 == null) {
                    pairWrite = null;
                } else {
                    field2.setAccessible(true);
                    pairWrite = setAction.write(field2.get(null), Boolean.FALSE);
                }
                if (pairWrite == null) {
                    throw e;
                }
            }
            return new MethodValueCreator<>(p0, ((Boolean) pairWrite.read()).booleanValue(), pairWrite.RemoteActionCompatParcelizer(), magicModuleRepositoryImplExternalSyntheticLambda0);
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    public /* synthetic */ MethodValueCreator(getErrorMessageId geterrormessageid, boolean z, Object obj, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(geterrormessageid, z, obj);
    }
}
