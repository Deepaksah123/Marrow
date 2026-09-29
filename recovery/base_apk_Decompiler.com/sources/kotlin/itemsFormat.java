package kotlin;

import kotlin.Metadata;
import kotlin.VisibilityChecker;
import kotlin.withFieldVisibility;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b\"\b\b\u0000\u0010\u0005*\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0000¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\f\u001a\u00028\u0000\"\b\b\u0000\u0010\u000b*\u00020\u0004H\u0000¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u0013\u0010\u0014"}, d2 = {"Lo/itemsFormat;", "", "<init>", "()V", "Lo/POJOPropertyBuilderWithMember;", "T", "Lo/isHdPlaybackError;", "p0", "", "AudioAttributesCompatParcelizer", "(Lo/isHdPlaybackError;)Ljava/lang/String;", "VM", "write", "()Lo/POJOPropertyBuilderWithMember;", "Lo/TypeResolutionContext;", "Lo/VisibilityChecker$RemoteActionCompatParcelizer;", "read", "(Lo/TypeResolutionContext;)Lo/VisibilityChecker$RemoteActionCompatParcelizer;", "Lo/withFieldVisibility;", "RemoteActionCompatParcelizer", "(Lo/TypeResolutionContext;)Lo/withFieldVisibility;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class itemsFormat {
    public static final itemsFormat INSTANCE = new itemsFormat();

    private itemsFormat() {
    }

    public static <T extends POJOPropertyBuilderWithMember> String AudioAttributesCompatParcelizer(isHdPlaybackError<T> p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        String strWrite = locate.write(p0);
        if (strWrite == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels".toString());
        }
        return "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(String.valueOf(strWrite));
    }

    public static <VM extends POJOPropertyBuilderWithMember> VM write() {
        throw new UnsupportedOperationException("`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error.");
    }

    public static VisibilityChecker.RemoteActionCompatParcelizer read(TypeResolutionContext p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        if (p0 instanceof anyExplicitsWithoutIgnoral) {
            return ((anyExplicitsWithoutIgnoral) p0).getDefaultViewModelProviderFactory();
        }
        return getRecordFields.INSTANCE;
    }

    public static withFieldVisibility RemoteActionCompatParcelizer(TypeResolutionContext p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        if (p0 instanceof anyExplicitsWithoutIgnoral) {
            return ((anyExplicitsWithoutIgnoral) p0).getDefaultViewModelCreationExtras();
        }
        return withFieldVisibility.write.INSTANCE;
    }
}
