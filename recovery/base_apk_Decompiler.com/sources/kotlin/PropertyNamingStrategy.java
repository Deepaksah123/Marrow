package kotlin;

import android.content.Context;
import android.view.accessibility.AccessibilityManager;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J/\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f"}, d2 = {"Lo/PropertyNamingStrategy;", "Lo/internSimpleName;", "Landroid/content/Context;", "p0", "<init>", "(Landroid/content/Context;)V", "", "", "p1", "p2", "p3", "AudioAttributesCompatParcelizer", "(JZZZ)J", "Landroid/view/accessibility/AccessibilityManager;", "write", "Landroid/view/accessibility/AccessibilityManager;", "read"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PropertyNamingStrategy implements internSimpleName {
    private final AccessibilityManager write;
    private static final read read = new read(null);
    public static final int IconCompatParcelizer = 8;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/PropertyNamingStrategy$read;", "", "<init>", "()V"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class read {
        private read() {
        }

        public /* synthetic */ read(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    public PropertyNamingStrategy(Context context) {
        Object systemService = context.getSystemService("accessibility");
        toMagicModuleMetaRepoModel.read(systemService, "");
        this.write = (AccessibilityManager) systemService;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // kotlin.internSimpleName
    public final long AudioAttributesCompatParcelizer(long p0, boolean p1, boolean p2, boolean p3) {
        int i = p1;
        if (p0 >= 2147483647L) {
            return p0;
        }
        if (p2) {
            i = (p1 ? 1 : 0) | 2;
        }
        if (p3) {
            i = (i == true ? 1 : 0) | 4;
        }
        int i2 = defaultSerializeNull.INSTANCE.read(this.write, (int) p0, i);
        if (i2 == Integer.MAX_VALUE) {
            return Long.MAX_VALUE;
        }
        return i2;
    }
}
