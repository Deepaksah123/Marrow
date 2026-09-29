package com.fasterxml.jackson.module.kotlin;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.Iterator;
import kotlin.MagicModuleRepositoryImplExternalSyntheticLambda0;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\b\u0086\u0001\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\rB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0007\u001a\u00020\u00068\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012"}, d2 = {"Lcom/fasterxml/jackson/module/kotlin/KotlinFeature;", "", "", "p0", "<init>", "(Ljava/lang/String;IZ)V", "Ljava/util/BitSet;", "bitSet", "Ljava/util/BitSet;", "getBitSet$jackson_module_kotlin", "()Ljava/util/BitSet;", "enabledByDefault", "Z", "Companion", "NullToEmptyCollection", "NullToEmptyMap", "NullIsSameAsDefault", "SingletonSupport", "StrictNullChecks"}, k = 1, mv = {1, 5, 1}, xi = 48)
public enum KotlinFeature {
    NullToEmptyCollection(false),
    NullToEmptyMap(false),
    NullIsSameAsDefault(false),
    SingletonSupport(false),
    StrictNullChecks(false);


    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final BitSet bitSet = ExtensionsKt.toBitSet((int) Math.pow(2.0d, ordinal()));
    private final boolean enabledByDefault;

    KotlinFeature(boolean z) {
        this.enabledByDefault = z;
    }

    /* JADX INFO: renamed from: getBitSet$jackson_module_kotlin, reason: from getter */
    public final BitSet getBitSet() {
        return this.bitSet;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/fasterxml/jackson/module/kotlin/KotlinFeature$Companion;", "", "<init>", "()V", "Ljava/util/BitSet;", "getDefaults$jackson_module_kotlin", "()Ljava/util/BitSet;", "defaults"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final BitSet getDefaults$jackson_module_kotlin() {
            BitSet bitSet = ExtensionsKt.toBitSet(0);
            KotlinFeature[] kotlinFeatureArrValues = KotlinFeature.values();
            ArrayList arrayList = new ArrayList();
            for (KotlinFeature kotlinFeature : kotlinFeatureArrValues) {
                if (kotlinFeature.enabledByDefault) {
                    arrayList.add(kotlinFeature);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                bitSet.or(((KotlinFeature) it.next()).getBitSet());
            }
            return bitSet;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }
}
