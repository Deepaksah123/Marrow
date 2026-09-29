package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\n0\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0007\u001a\u0004\b\u0006\u0010\t"}, d2 = {"Lo/collectFeatureDefaults;", "", "<init>", "()V", "Lo/MapperConfig;", "", "RemoteActionCompatParcelizer", "Lo/MapperConfig;", "read", "()Lo/MapperConfig;", ""}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class collectFeatureDefaults {
    public static final collectFeatureDefaults INSTANCE = new collectFeatureDefaults();

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private static final MapperConfig<Boolean> read = new MapperConfig<>("TestTagsAsResourceId", false, AnonymousClass2.read, null, 8, null);

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private static final MapperConfig<String> RemoteActionCompatParcelizer = new MapperConfig<>("AccessibilityClassName", true, AnonymousClass4.AudioAttributesCompatParcelizer, null, 8, null);
    public static final int write = 8;

    private collectFeatureDefaults() {
    }

    public final MapperConfig<Boolean> read() {
        return read;
    }

    /* JADX INFO: renamed from: o.collectFeatureDefaults$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0004\u0010\u0003\u001a\u0004\u0018\u00010\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "p0", "p1", "AudioAttributesCompatParcelizer", "(Ljava/lang/Boolean;Z)Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass2 extends MagicModuleUseCase implements MagicModuleSubmissionRequestBody<Boolean, Boolean, Boolean> {
        public static final AnonymousClass2 read = new AnonymousClass2();

        public final Boolean AudioAttributesCompatParcelizer(Boolean bool, boolean z) {
            return bool;
        }

        @Override // kotlin.MagicModuleSubmissionRequestBody
        public final /* synthetic */ Boolean invoke(Boolean bool, Boolean bool2) {
            return AudioAttributesCompatParcelizer(bool, bool2.booleanValue());
        }

        AnonymousClass2() {
            super(2);
        }
    }

    public final MapperConfig<String> RemoteActionCompatParcelizer() {
        return RemoteActionCompatParcelizer;
    }

    /* JADX INFO: renamed from: o.collectFeatureDefaults$4, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0004\u0010\u0003\u001a\u0004\u0018\u00010\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "p0", "p1", "write", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass4 extends MagicModuleUseCase implements MagicModuleSubmissionRequestBody<String, String, String> {
        public static final AnonymousClass4 AudioAttributesCompatParcelizer = new AnonymousClass4();

        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public final String invoke(String str, String str2) {
            return str;
        }

        AnonymousClass4() {
            super(2);
        }
    }
}
