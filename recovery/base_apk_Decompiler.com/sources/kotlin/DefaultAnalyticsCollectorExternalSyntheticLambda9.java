package kotlin;

import java.util.EnumSet;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\t\n\u0002\b\t\b\u0086\u0001\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\n\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t"}, d2 = {"Lo/DefaultAnalyticsCollectorExternalSyntheticLambda9;", "", "", "p0", "<init>", "(Ljava/lang/String;IJ)V", "read", "J", "RemoteActionCompatParcelizer", "()J", "IconCompatParcelizer", "AudioAttributesCompatParcelizer"}, k = 1, mv = {1, 4, 0})
public enum DefaultAnalyticsCollectorExternalSyntheticLambda9 {
    /* JADX INFO: Fake field, exist only in values array */
    None(0),
    /* JADX INFO: Fake field, exist only in values array */
    Enabled(1),
    /* JADX INFO: Fake field, exist only in values array */
    RequireConfirm(2);


    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final EnumSet<DefaultAnalyticsCollectorExternalSyntheticLambda9> IconCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final long IconCompatParcelizer;

    DefaultAnalyticsCollectorExternalSyntheticLambda9(long j) {
        this.IconCompatParcelizer = j;
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final long getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    static {
        EnumSet<DefaultAnalyticsCollectorExternalSyntheticLambda9> enumSetAllOf = EnumSet.allOf(DefaultAnalyticsCollectorExternalSyntheticLambda9.class);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(enumSetAllOf, "");
        IconCompatParcelizer = enumSetAllOf;
    }

    /* JADX INFO: renamed from: o.DefaultAnalyticsCollectorExternalSyntheticLambda9$AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b"}, d2 = {"Lo/DefaultAnalyticsCollectorExternalSyntheticLambda9$AudioAttributesCompatParcelizer;", "", "<init>", "()V", "", "p0", "Ljava/util/EnumSet;", "Lo/DefaultAnalyticsCollectorExternalSyntheticLambda9;", "write", "(J)Ljava/util/EnumSet;", "IconCompatParcelizer", "Ljava/util/EnumSet;"}, k = 1, mv = {1, 4, 0})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }

        @getMagicModuleMeta
        public static EnumSet<DefaultAnalyticsCollectorExternalSyntheticLambda9> write(long p0) {
            EnumSet<DefaultAnalyticsCollectorExternalSyntheticLambda9> enumSetNoneOf = EnumSet.noneOf(DefaultAnalyticsCollectorExternalSyntheticLambda9.class);
            for (DefaultAnalyticsCollectorExternalSyntheticLambda9 defaultAnalyticsCollectorExternalSyntheticLambda9 : DefaultAnalyticsCollectorExternalSyntheticLambda9.IconCompatParcelizer) {
                if ((defaultAnalyticsCollectorExternalSyntheticLambda9.getIconCompatParcelizer() & p0) != 0) {
                    enumSetNoneOf.add(defaultAnalyticsCollectorExternalSyntheticLambda9);
                }
            }
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(enumSetNoneOf, "");
            return enumSetNoneOf;
        }
    }
}
