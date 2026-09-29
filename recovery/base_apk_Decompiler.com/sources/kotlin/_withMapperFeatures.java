package kotlin;

import kotlin.MagicModuleUseCaseImplWhenMappings;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001f\u0010\t\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\b*\u00020\u0007*\u00028\u0000H\u0002¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lo/DatabindException;", "p0", "Lo/reportBadDefinition;", "p1", "Lo/Module;", "IconCompatParcelizer", "(Lo/DatabindException;Lo/reportBadDefinition;)Lo/Module;", "Lo/createForPropertyOverride;", "T", "RemoteActionCompatParcelizer", "(Lo/createForPropertyOverride;)Lo/createForPropertyOverride;"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class _withMapperFeatures {
    public static final Module IconCompatParcelizer(DatabindException databindException, reportBadDefinition reportbaddefinition) {
        return new DeserializationConfig(databindException, reportbaddefinition);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T extends createForPropertyOverride> T RemoteActionCompatParcelizer(T t) {
        MagicModuleUseCaseImplWhenMappings.write writeVar = new MagicModuleUseCaseImplWhenMappings.write();
        PropertyName.RemoteActionCompatParcelizer(t, new AnonymousClass4(writeVar));
        return (T) writeVar.write;
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: o._withMapperFeatures$4, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lo/createForPropertyOverride;", "T", "p0", "", "write", "(Lo/createForPropertyOverride;)Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass4<T> extends MagicModuleUseCase implements getAnswerMap<T, Boolean> {
        final /* synthetic */ MagicModuleUseCaseImplWhenMappings.write<T> $read;

        /* JADX WARN: Incorrect types in method signature: (TT;)Ljava/lang/Boolean; */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(createForPropertyOverride createforpropertyoverride) {
            boolean z;
            if (createforpropertyoverride.getRead().getRatingCompat()) {
                this.$read.write = createforpropertyoverride;
                z = false;
            } else {
                z = true;
            }
            return Boolean.valueOf(z);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass4(MagicModuleUseCaseImplWhenMappings.write<T> writeVar) {
            super(1);
            this.$read = writeVar;
        }
    }
}
