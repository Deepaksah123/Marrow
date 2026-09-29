package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t"}, d2 = {"Lo/CoordinatorLayoutBehavior;", "", "<init>", "()V", "read", "AudioAttributesCompatParcelizer", "RemoteActionCompatParcelizer", "Lo/CoordinatorLayoutBehavior$RemoteActionCompatParcelizer;", "Lo/CoordinatorLayoutBehavior$AudioAttributesCompatParcelizer;", "Lo/CoordinatorLayoutBehavior$read;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class CoordinatorLayoutBehavior {
    private CoordinatorLayoutBehavior() {
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/CoordinatorLayoutBehavior$read;", "Lo/CoordinatorLayoutBehavior;", "<init>", "()V"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class read extends CoordinatorLayoutBehavior {
        public static final read INSTANCE = new read();

        private read() {
            super(null);
        }
    }

    public /* synthetic */ CoordinatorLayoutBehavior(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this();
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\n\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t"}, d2 = {"Lo/CoordinatorLayoutBehavior$AudioAttributesCompatParcelizer;", "Lo/CoordinatorLayoutBehavior;", "Lo/getArrayBuilders;", "p0", "<init>", "(Lo/getArrayBuilders;)V", "write", "Lo/getArrayBuilders;", "IconCompatParcelizer", "()Lo/getArrayBuilders;", "AudioAttributesCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AudioAttributesCompatParcelizer extends CoordinatorLayoutBehavior {

        /* JADX INFO: renamed from: write, reason: from kotlin metadata */
        private final getArrayBuilders AudioAttributesCompatParcelizer;

        public AudioAttributesCompatParcelizer(getArrayBuilders getarraybuilders) {
            super(null);
            this.AudioAttributesCompatParcelizer = getarraybuilders;
        }

        /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
        public final getArrayBuilders getAudioAttributesCompatParcelizer() {
            return this.AudioAttributesCompatParcelizer;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/CoordinatorLayoutBehavior$RemoteActionCompatParcelizer;", "Lo/CoordinatorLayoutBehavior;", "<init>", "()V"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class RemoteActionCompatParcelizer extends CoordinatorLayoutBehavior {
        public static final RemoteActionCompatParcelizer INSTANCE = new RemoteActionCompatParcelizer();

        private RemoteActionCompatParcelizer() {
            super(null);
        }
    }
}
