package kotlin;

import androidx.compose.animation.tooling.ComposeAnimation;
import androidx.compose.animation.tooling.ComposeAnimationType;
import java.util.Set;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0010\b\n\u0002\b\u0004\b\u0001\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0013\b\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Landroidx/compose/ui/tooling/animation/UnsupportedComposeAnimation;", "Landroidx/compose/animation/tooling/ComposeAnimation;", "label", "", "<init>", "(Ljava/lang/String;)V", "getLabel", "()Ljava/lang/String;", "type", "Landroidx/compose/animation/tooling/ComposeAnimationType;", "getType", "()Landroidx/compose/animation/tooling/ComposeAnimationType;", "animationObject", "", "getAnimationObject", "()Ljava/lang/Object;", "states", "", "", "getStates", "()Ljava/util/Set;", "Companion", "ui-tooling"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MergingSettableBeanProperty implements ComposeAnimation {
    private static boolean read;
    private final Object AudioAttributesCompatParcelizer;
    private final Set<Integer> AudioAttributesImplApi21Parcelizer;
    private final ComposeAnimationType AudioAttributesImplApi26Parcelizer;
    private final String IconCompatParcelizer;
    public static final RemoteActionCompatParcelizer RemoteActionCompatParcelizer = new RemoteActionCompatParcelizer(null);
    public static final int write = 8;

    private MergingSettableBeanProperty(String str) {
        this.IconCompatParcelizer = str;
        this.AudioAttributesImplApi26Parcelizer = ComposeAnimationType.UNSUPPORTED;
        this.AudioAttributesCompatParcelizer = 0;
        this.AudioAttributesImplApi21Parcelizer = getKycMessage.read();
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bR$\u0010\f\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\t8\u0007@BX\u0086\u000e¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r"}, d2 = {"Lo/MergingSettableBeanProperty$RemoteActionCompatParcelizer;", "", "<init>", "()V", "", "p0", "Lo/MergingSettableBeanProperty;", "AudioAttributesCompatParcelizer", "(Ljava/lang/String;)Lo/MergingSettableBeanProperty;", "", "read", "Z", "RemoteActionCompatParcelizer", "()Z"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class RemoteActionCompatParcelizer {
        private RemoteActionCompatParcelizer() {
        }

        public final boolean RemoteActionCompatParcelizer() {
            return MergingSettableBeanProperty.read;
        }

        public final MergingSettableBeanProperty AudioAttributesCompatParcelizer(String p0) {
            MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0 = null;
            if (RemoteActionCompatParcelizer()) {
                return new MergingSettableBeanProperty(p0, magicModuleRepositoryImplExternalSyntheticLambda0);
            }
            return null;
        }

        public /* synthetic */ RemoteActionCompatParcelizer(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
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
            if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) composeAnimationTypeArrValues[i].name(), (Object) "UNSUPPORTED")) {
                z = true;
                break;
            }
            i++;
        }
        read = z;
    }

    public /* synthetic */ MergingSettableBeanProperty(String str, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(str);
    }
}
