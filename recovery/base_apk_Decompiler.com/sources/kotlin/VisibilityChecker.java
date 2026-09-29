package kotlin;

import android.app.Application;
import java.lang.reflect.InvocationTargetException;
import kotlin.Metadata;
import kotlin.withFieldVisibility;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0016\u0018\u0000 \u00162\u00020\u0001:\u0005\u0011\u0019\u001a\u001b\u0016B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bB\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0004\u0010\rJ(\u0010\u0011\u001a\u00028\u0000\"\b\b\u0000\u0010\u000f*\u00020\u000e2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010H\u0086\u0002¢\u0006\u0004\b\u0011\u0010\u0012J(\u0010\u0011\u001a\u00028\u0000\"\b\b\u0000\u0010\u000f*\u00020\u000e2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013H\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0014J0\u0010\u0016\u001a\u00028\u0000\"\b\b\u0000\u0010\u000f*\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00152\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010H\u0086\u0002¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0016\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0018"}, d2 = {"Lo/VisibilityChecker;", "", "Lo/defaultInstance;", "p0", "<init>", "(Lo/defaultInstance;)V", "Lo/hasMixIns;", "Lo/VisibilityChecker$RemoteActionCompatParcelizer;", "p1", "Lo/withFieldVisibility;", "p2", "(Lo/hasMixIns;Lo/VisibilityChecker$RemoteActionCompatParcelizer;Lo/withFieldVisibility;)V", "Lo/TypeResolutionContext;", "(Lo/TypeResolutionContext;Lo/VisibilityChecker$RemoteActionCompatParcelizer;)V", "Lo/POJOPropertyBuilderWithMember;", "T", "Lo/isHdPlaybackError;", "RemoteActionCompatParcelizer", "(Lo/isHdPlaybackError;)Lo/POJOPropertyBuilderWithMember;", "Ljava/lang/Class;", "(Ljava/lang/Class;)Lo/POJOPropertyBuilderWithMember;", "", "write", "(Ljava/lang/String;Lo/isHdPlaybackError;)Lo/POJOPropertyBuilderWithMember;", "Lo/defaultInstance;", "IconCompatParcelizer", "read", "AudioAttributesCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class VisibilityChecker {
    public static final withFieldVisibility.read<String> IconCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final defaultInstance write;

    public static final class MediaBrowserCompatCustomActionResultReceiver implements withFieldVisibility.read<String> {
    }

    private VisibilityChecker(defaultInstance defaultinstance) {
        this.write = defaultinstance;
    }

    public /* synthetic */ VisibilityChecker(hasMixIns hasmixins, RemoteActionCompatParcelizer remoteActionCompatParcelizer, withFieldVisibility.write writeVar, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(hasmixins, remoteActionCompatParcelizer, (i & 4) != 0 ? withFieldVisibility.write.INSTANCE : writeVar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public VisibilityChecker(hasMixIns hasmixins, RemoteActionCompatParcelizer remoteActionCompatParcelizer, withFieldVisibility withfieldvisibility) {
        this(new defaultInstance(hasmixins, remoteActionCompatParcelizer, withfieldvisibility));
        toMagicModuleMetaRepoModel.write(hasmixins, "");
        toMagicModuleMetaRepoModel.write(remoteActionCompatParcelizer, "");
        toMagicModuleMetaRepoModel.write(withfieldvisibility, "");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public VisibilityChecker(TypeResolutionContext typeResolutionContext, RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        toMagicModuleMetaRepoModel.write(typeResolutionContext, "");
        toMagicModuleMetaRepoModel.write(remoteActionCompatParcelizer, "");
        hasMixIns viewModelStore = typeResolutionContext.getViewModelStore();
        itemsFormat itemsformat = itemsFormat.INSTANCE;
        this(viewModelStore, remoteActionCompatParcelizer, itemsFormat.RemoteActionCompatParcelizer(typeResolutionContext));
    }

    public final <T extends POJOPropertyBuilderWithMember> T RemoteActionCompatParcelizer(isHdPlaybackError<T> p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return (T) defaultInstance.IconCompatParcelizer(this.write, p0);
    }

    /* JADX INFO: renamed from: o.VisibilityChecker$write, reason: from kotlin metadata */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0007J$\u0010\u0004\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0007R\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Landroidx/lifecycle/ViewModelProvider$Companion;", "", "<init>", "()V", "create", "Landroidx/lifecycle/ViewModelProvider;", "owner", "Landroidx/lifecycle/ViewModelStoreOwner;", "factory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "extras", "Landroidx/lifecycle/viewmodel/CreationExtras;", "store", "Landroidx/lifecycle/ViewModelStore;", "VIEW_MODEL_KEY", "Landroidx/lifecycle/viewmodel/CreationExtras$Key;", "", "lifecycle-viewmodel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public static /* synthetic */ VisibilityChecker IconCompatParcelizer(TypeResolutionContext typeResolutionContext, RemoteActionCompatParcelizer remoteActionCompatParcelizer, withFieldVisibility withfieldvisibility, int i) {
            if ((i & 2) != 0) {
                itemsFormat itemsformat = itemsFormat.INSTANCE;
                remoteActionCompatParcelizer = itemsFormat.read(typeResolutionContext);
            }
            if ((i & 4) != 0) {
                itemsFormat itemsformat2 = itemsFormat.INSTANCE;
                withfieldvisibility = itemsFormat.RemoteActionCompatParcelizer(typeResolutionContext);
            }
            return IconCompatParcelizer(typeResolutionContext, remoteActionCompatParcelizer, withfieldvisibility);
        }

        private Companion() {
        }

        @getMagicModuleMeta
        private static VisibilityChecker IconCompatParcelizer(TypeResolutionContext typeResolutionContext, RemoteActionCompatParcelizer remoteActionCompatParcelizer, withFieldVisibility withfieldvisibility) {
            toMagicModuleMetaRepoModel.write(typeResolutionContext, "");
            toMagicModuleMetaRepoModel.write(remoteActionCompatParcelizer, "");
            toMagicModuleMetaRepoModel.write(withfieldvisibility, "");
            return new VisibilityChecker(typeResolutionContext.getViewModelStore(), remoteActionCompatParcelizer, withfieldvisibility);
        }

        @getMagicModuleMeta
        public static VisibilityChecker read(hasMixIns hasmixins, RemoteActionCompatParcelizer remoteActionCompatParcelizer, withFieldVisibility withfieldvisibility) {
            toMagicModuleMetaRepoModel.write(hasmixins, "");
            toMagicModuleMetaRepoModel.write(remoteActionCompatParcelizer, "");
            toMagicModuleMetaRepoModel.write(withfieldvisibility, "");
            return new VisibilityChecker(hasmixins, remoteActionCompatParcelizer, withfieldvisibility);
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    public final <T extends POJOPropertyBuilderWithMember> T RemoteActionCompatParcelizer(Class<T> p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return (T) RemoteActionCompatParcelizer(MagicModuleFeedbackRequestBody.read(p0));
    }

    public final <T extends POJOPropertyBuilderWithMember> T write(String p0, isHdPlaybackError<T> p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        return (T) this.write.IconCompatParcelizer(p1, p0);
    }

    /* JADX INFO: loaded from: classes.dex */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bf\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006J'\u0010\u0006\u001a\u00028\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H&¢\u0006\u0004\b\u0006\u0010\u0007J/\u0010\n\u001a\u00028\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\n\u0010\u000bJ/\u0010\n\u001a\u00028\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\f2\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\n\u0010\rø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Lo/VisibilityChecker$RemoteActionCompatParcelizer;", "", "Lo/POJOPropertyBuilderWithMember;", "T", "Ljava/lang/Class;", "p0", "read", "(Ljava/lang/Class;)Lo/POJOPropertyBuilderWithMember;", "Lo/withFieldVisibility;", "p1", "AudioAttributesCompatParcelizer", "(Ljava/lang/Class;Lo/withFieldVisibility;)Lo/POJOPropertyBuilderWithMember;", "Lo/isHdPlaybackError;", "(Lo/isHdPlaybackError;Lo/withFieldVisibility;)Lo/POJOPropertyBuilderWithMember;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface RemoteActionCompatParcelizer {

        /* JADX INFO: renamed from: read, reason: from kotlin metadata */
        public static final Companion INSTANCE = Companion.write;

        default <T extends POJOPropertyBuilderWithMember> T read(Class<T> p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            itemsFormat itemsformat = itemsFormat.INSTANCE;
            return (T) itemsFormat.write();
        }

        default <T extends POJOPropertyBuilderWithMember> T AudioAttributesCompatParcelizer(Class<T> p0, withFieldVisibility p1) {
            toMagicModuleMetaRepoModel.write(p0, "");
            toMagicModuleMetaRepoModel.write(p1, "");
            return (T) read(p0);
        }

        default <T extends POJOPropertyBuilderWithMember> T AudioAttributesCompatParcelizer(isHdPlaybackError<T> p0, withFieldVisibility p1) {
            toMagicModuleMetaRepoModel.write(p0, "");
            toMagicModuleMetaRepoModel.write(p1, "");
            return (T) AudioAttributesCompatParcelizer(MagicModuleFeedbackRequestBody.IconCompatParcelizer(p0), p1);
        }

        /* JADX INFO: renamed from: o.VisibilityChecker$RemoteActionCompatParcelizer$read, reason: from kotlin metadata */
        /* JADX INFO: loaded from: classes2.dex */
        public static final class Companion {
            static final /* synthetic */ Companion write = new Companion();

            private Companion() {
            }
        }
    }

    public static class IconCompatParcelizer {
        public void AudioAttributesCompatParcelizer(POJOPropertyBuilderWithMember pOJOPropertyBuilderWithMember) {
            toMagicModuleMetaRepoModel.write(pOJOPropertyBuilderWithMember, "");
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\b\u001a\u00028\u0000\"\b\b\u0000\u0010\u0005*\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ/\u0010\f\u001a\u00028\u0000\"\b\b\u0000\u0010\u0005*\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ/\u0010\f\u001a\u00028\u0000\"\b\b\u0000\u0010\u0005*\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\u000f"}, d2 = {"Lo/VisibilityChecker$read;", "Lo/VisibilityChecker$RemoteActionCompatParcelizer;", "<init>", "()V", "Lo/POJOPropertyBuilderWithMember;", "T", "Ljava/lang/Class;", "p0", "read", "(Ljava/lang/Class;)Lo/POJOPropertyBuilderWithMember;", "Lo/withFieldVisibility;", "p1", "AudioAttributesCompatParcelizer", "(Ljava/lang/Class;Lo/withFieldVisibility;)Lo/POJOPropertyBuilderWithMember;", "Lo/isHdPlaybackError;", "(Lo/isHdPlaybackError;Lo/withFieldVisibility;)Lo/POJOPropertyBuilderWithMember;", "read_"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static class read implements RemoteActionCompatParcelizer {
        private static read AudioAttributesCompatParcelizer;

        /* JADX INFO: renamed from: read_, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final withFieldVisibility.read<String> write = VisibilityChecker.IconCompatParcelizer;

        @Override // o.VisibilityChecker.RemoteActionCompatParcelizer
        public <T extends POJOPropertyBuilderWithMember> T read(Class<T> p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            JsonMapperBuilder jsonMapperBuilder = JsonMapperBuilder.INSTANCE;
            return (T) JsonMapperBuilder.read(p0);
        }

        @Override // o.VisibilityChecker.RemoteActionCompatParcelizer
        public <T extends POJOPropertyBuilderWithMember> T AudioAttributesCompatParcelizer(Class<T> p0, withFieldVisibility p1) {
            toMagicModuleMetaRepoModel.write(p0, "");
            toMagicModuleMetaRepoModel.write(p1, "");
            return (T) read(p0);
        }

        @Override // o.VisibilityChecker.RemoteActionCompatParcelizer
        public final <T extends POJOPropertyBuilderWithMember> T AudioAttributesCompatParcelizer(isHdPlaybackError<T> p0, withFieldVisibility p1) {
            toMagicModuleMetaRepoModel.write(p0, "");
            toMagicModuleMetaRepoModel.write(p1, "");
            return (T) AudioAttributesCompatParcelizer(MagicModuleFeedbackRequestBody.IconCompatParcelizer(p0), p1);
        }

        /* JADX INFO: renamed from: o.VisibilityChecker$read$read_, reason: from kotlin metadata */
        /* JADX INFO: loaded from: classes2.dex */
        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r"}, d2 = {"Lo/VisibilityChecker$read$read_;", "", "<init>", "()V", "Lo/VisibilityChecker$read;", "AudioAttributesCompatParcelizer", "Lo/VisibilityChecker$read;", "read", "()Lo/VisibilityChecker$read;", "write", "Lo/withFieldVisibility$read;", "", "IconCompatParcelizer", "Lo/withFieldVisibility$read;"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public static read read() {
                if (read.AudioAttributesCompatParcelizer == null) {
                    read.AudioAttributesCompatParcelizer = new read();
                }
                read readVar = read.AudioAttributesCompatParcelizer;
                toMagicModuleMetaRepoModel.write(readVar);
                return readVar;
            }

            public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
                this();
            }
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0016\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u001b\b\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\t\b\u0016¢\u0006\u0004\b\u0006\u0010\bB\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\tJ/\u0010\u000e\u001a\u00028\u0000\"\b\b\u0000\u0010\u000b*\u00020\n2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\f2\u0006\u0010\u0005\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0010\u001a\u00028\u0000\"\b\b\u0000\u0010\u000b*\u00020\n2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J/\u0010\u0010\u001a\u00028\u0000\"\b\b\u0000\u0010\u000b*\u00020\n2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\f2\u0006\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0010\u0010\u0012R\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014"}, d2 = {"Lo/VisibilityChecker$AudioAttributesCompatParcelizer;", "Lo/VisibilityChecker$read;", "Landroid/app/Application;", "p0", "", "p1", "<init>", "(Landroid/app/Application;B)V", "()V", "(Landroid/app/Application;)V", "Lo/POJOPropertyBuilderWithMember;", "T", "Ljava/lang/Class;", "Lo/withFieldVisibility;", "AudioAttributesCompatParcelizer", "(Ljava/lang/Class;Lo/withFieldVisibility;)Lo/POJOPropertyBuilderWithMember;", "read", "(Ljava/lang/Class;)Lo/POJOPropertyBuilderWithMember;", "(Ljava/lang/Class;Landroid/app/Application;)Lo/POJOPropertyBuilderWithMember;", "AudioAttributesImplBaseParcelizer", "Landroid/app/Application;", "IconCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static class AudioAttributesCompatParcelizer extends read {
        public static final withFieldVisibility.read<Application> AudioAttributesCompatParcelizer;

        /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static AudioAttributesCompatParcelizer RemoteActionCompatParcelizer;

        /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
        private final Application AudioAttributesCompatParcelizer;

        public static final class RemoteActionCompatParcelizer implements withFieldVisibility.read<Application> {
        }

        private AudioAttributesCompatParcelizer(Application application, byte b) {
            this.AudioAttributesCompatParcelizer = application;
        }

        public AudioAttributesCompatParcelizer() {
            this(null, (byte) 0);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public AudioAttributesCompatParcelizer(Application application) {
            this(application, (byte) 0);
            toMagicModuleMetaRepoModel.write(application, "");
        }

        @Override // o.VisibilityChecker.read, o.VisibilityChecker.RemoteActionCompatParcelizer
        public final <T extends POJOPropertyBuilderWithMember> T AudioAttributesCompatParcelizer(Class<T> p0, withFieldVisibility p1) {
            toMagicModuleMetaRepoModel.write(p0, "");
            toMagicModuleMetaRepoModel.write(p1, "");
            if (this.AudioAttributesCompatParcelizer != null) {
                return (T) read(p0);
            }
            Application application = (Application) p1.read(AudioAttributesCompatParcelizer);
            if (application != null) {
                return (T) read(p0, application);
            }
            if (addAll.class.isAssignableFrom(p0)) {
                throw new IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
            }
            return (T) super.read(p0);
        }

        @Override // o.VisibilityChecker.read, o.VisibilityChecker.RemoteActionCompatParcelizer
        public final <T extends POJOPropertyBuilderWithMember> T read(Class<T> p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            Application application = this.AudioAttributesCompatParcelizer;
            if (application == null) {
                throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
            }
            return (T) read(p0, application);
        }

        private final <T extends POJOPropertyBuilderWithMember> T read(Class<T> p0, Application p1) {
            if (addAll.class.isAssignableFrom(p0)) {
                try {
                    T tNewInstance = p0.getConstructor(Application.class).newInstance(p1);
                    toMagicModuleMetaRepoModel.write(tNewInstance);
                    return tNewInstance;
                } catch (IllegalAccessException e) {
                    throw new RuntimeException("Cannot create an instance of ".concat(String.valueOf(p0)), e);
                } catch (InstantiationException e2) {
                    throw new RuntimeException("Cannot create an instance of ".concat(String.valueOf(p0)), e2);
                } catch (NoSuchMethodException e3) {
                    throw new RuntimeException("Cannot create an instance of ".concat(String.valueOf(p0)), e3);
                } catch (InvocationTargetException e4) {
                    throw new RuntimeException("Cannot create an instance of ".concat(String.valueOf(p0)), e4);
                }
            }
            return (T) super.read(p0);
        }

        /* JADX INFO: renamed from: o.VisibilityChecker$AudioAttributesCompatParcelizer$IconCompatParcelizer, reason: from kotlin metadata */
        /* JADX INFO: loaded from: classes2.dex */
        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\f8\u0006¢\u0006\u0006\n\u0004\b\r\u0010\u000e"}, d2 = {"Lo/VisibilityChecker$AudioAttributesCompatParcelizer$IconCompatParcelizer;", "", "<init>", "()V", "Landroid/app/Application;", "p0", "Lo/VisibilityChecker$AudioAttributesCompatParcelizer;", "read", "(Landroid/app/Application;)Lo/VisibilityChecker$AudioAttributesCompatParcelizer;", "RemoteActionCompatParcelizer", "Lo/VisibilityChecker$AudioAttributesCompatParcelizer;", "IconCompatParcelizer", "Lo/withFieldVisibility$read;", "AudioAttributesCompatParcelizer", "Lo/withFieldVisibility$read;", "write"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @getMagicModuleMeta
            public static AudioAttributesCompatParcelizer read(Application p0) {
                toMagicModuleMetaRepoModel.write(p0, "");
                if (AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer == null) {
                    AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer = new AudioAttributesCompatParcelizer(p0);
                }
                AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer;
                toMagicModuleMetaRepoModel.write(audioAttributesCompatParcelizer);
                return audioAttributesCompatParcelizer;
            }

            public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
                this();
            }
        }

        static {
            withFieldVisibility.Companion companion = withFieldVisibility.INSTANCE;
            AudioAttributesCompatParcelizer = new RemoteActionCompatParcelizer();
        }
    }

    static {
        withFieldVisibility.Companion companion = withFieldVisibility.INSTANCE;
        IconCompatParcelizer = new MediaBrowserCompatCustomActionResultReceiver();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public VisibilityChecker(hasMixIns hasmixins, RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        this(hasmixins, remoteActionCompatParcelizer, null, 4, null);
        toMagicModuleMetaRepoModel.write(hasmixins, "");
        toMagicModuleMetaRepoModel.write(remoteActionCompatParcelizer, "");
    }
}
