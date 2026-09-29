package kotlin;

import androidx.compose.animation.tooling.ComposeAnimation;
import androidx.compose.animation.tooling.ComposeAnimationType;
import java.util.Set;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 \u0017*\u0004\b\u0000\u0010\u00012\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003:\u0001\u0017B/\b\u0002\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\t\u001a\u0004\u0018\u00010\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u0014X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Landroidx/compose/ui/tooling/animation/AnimatedContentComposeAnimation;", "T", "Landroidx/compose/animation/tooling/ComposeAnimation;", "Landroidx/compose/ui/tooling/animation/TransitionBasedAnimation;", "animationObject", "Landroidx/compose/animation/core/Transition;", "states", "", "", "label", "", "<init>", "(Landroidx/compose/animation/core/Transition;Ljava/util/Set;Ljava/lang/String;)V", "getAnimationObject", "()Landroidx/compose/animation/core/Transition;", "getStates", "()Ljava/util/Set;", "getLabel", "()Ljava/lang/String;", "type", "Landroidx/compose/animation/tooling/ComposeAnimationType;", "getType", "()Landroidx/compose/animation/tooling/ComposeAnimationType;", "Companion", "ui-tooling"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class hasDefaultType<T> implements ComposeAnimation, convert<T> {
    public static final AudioAttributesCompatParcelizer AudioAttributesCompatParcelizer = new AudioAttributesCompatParcelizer(null);
    public static final int read = 8;
    private static boolean write;
    private final Set<Object> AudioAttributesImplApi26Parcelizer;
    private final String IconCompatParcelizer;
    private final ComposeAnimationType MediaBrowserCompatCustomActionResultReceiver;
    private final setLayoutInflater<T> RemoteActionCompatParcelizer;

    private hasDefaultType(setLayoutInflater<T> setlayoutinflater, Set<? extends Object> set, String str) {
        this.RemoteActionCompatParcelizer = setlayoutinflater;
        this.AudioAttributesImplApi26Parcelizer = set;
        this.IconCompatParcelizer = str;
        this.MediaBrowserCompatCustomActionResultReceiver = ComposeAnimationType.ANIMATED_CONTENT;
    }

    @Override // kotlin.convert
    public final setLayoutInflater<T> AudioAttributesCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0006\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0005*\u0006\u0012\u0002\b\u00030\u0004¢\u0006\u0004\b\u0006\u0010\u0007R$\u0010\n\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b8\u0007@BX\u0086\u000e¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\f"}, d2 = {"Lo/hasDefaultType$AudioAttributesCompatParcelizer;", "", "<init>", "()V", "Lo/setLayoutInflater;", "Lo/hasDefaultType;", "AudioAttributesCompatParcelizer", "(Lo/setLayoutInflater;)Lo/hasDefaultType;", "", "p0", "write", "Z", "()Z"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AudioAttributesCompatParcelizer {
        private AudioAttributesCompatParcelizer() {
        }

        public final boolean write() {
            return hasDefaultType.write;
        }

        public final hasDefaultType<?> AudioAttributesCompatParcelizer(setLayoutInflater<?> setlayoutinflater) {
            Object objRemoteActionCompatParcelizer;
            Set setHandleMediaPlayPauseIfPendingOnHandler;
            MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0 = null;
            if (!write() || (objRemoteActionCompatParcelizer = setlayoutinflater.RemoteActionCompatParcelizer()) == null) {
                return null;
            }
            Object[] enumConstants = objRemoteActionCompatParcelizer.getClass().getEnumConstants();
            if (enumConstants == null || (setHandleMediaPlayPauseIfPendingOnHandler = getOrderDetails.handleMediaPlayPauseIfPendingOnHandler(enumConstants)) == null) {
                setHandleMediaPlayPauseIfPendingOnHandler = getKycMessage.read(objRemoteActionCompatParcelizer);
            }
            String write = setlayoutinflater.getWrite();
            if (write == null) {
                write = toMagicModuleMetaDataUcModel.write(objRemoteActionCompatParcelizer.getClass()).AudioAttributesImplApi26Parcelizer();
            }
            return new hasDefaultType<>(setlayoutinflater, setHandleMediaPlayPauseIfPendingOnHandler, write, magicModuleRepositoryImplExternalSyntheticLambda0);
        }

        public /* synthetic */ AudioAttributesCompatParcelizer(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    static {
        ComposeAnimationType[] composeAnimationTypeArrValues = ComposeAnimationType.values();
        int length = composeAnimationTypeArrValues.length;
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) composeAnimationTypeArrValues[i].name(), (Object) "ANIMATED_CONTENT")) {
                z = true;
                break;
            }
            i++;
        }
        write = z;
    }

    public /* synthetic */ hasDefaultType(setLayoutInflater setlayoutinflater, Set set, String str, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(setlayoutinflater, set, str);
    }
}
