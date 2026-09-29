package kotlin;

import android.view.View;
import kotlin.Metadata;
import kotlin.onSetPlaybackSpeed;

/* JADX INFO: loaded from: classes.dex */
public final class onSkipToQueueItem {
    public static final void read(View view, onSetShuffleMode onsetshufflemode) {
        toMagicModuleMetaRepoModel.write(view, "");
        toMagicModuleMetaRepoModel.write(onsetshufflemode, "");
        view.setTag(onSetPlaybackSpeed.write.view_tree_on_back_pressed_dispatcher_owner, onsetshufflemode);
    }

    /* JADX INFO: renamed from: o.onSkipToQueueItem$4, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/view/View;", "p0", "read", "(Landroid/view/View;)Landroid/view/View;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass4 extends MagicModuleUseCase implements getAnswerMap<View, View> {
        public static final AnonymousClass4 RemoteActionCompatParcelizer = new AnonymousClass4();

        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public final View invoke(View view) {
            toMagicModuleMetaRepoModel.write(view, "");
            Object parent = view.getParent();
            if (parent instanceof View) {
                return (View) parent;
            }
            return null;
        }

        AnonymousClass4() {
            super(1);
        }
    }

    public static final onSetShuffleMode write(View view) {
        toMagicModuleMetaRepoModel.write(view, "");
        return (onSetShuffleMode) StateResult.AudioAttributesImplBaseParcelizer(StateResult.AudioAttributesCompatParcelizer(StateResult.RemoteActionCompatParcelizer(view, AnonymousClass4.RemoteActionCompatParcelizer), AnonymousClass5.read));
    }

    /* JADX INFO: renamed from: o.onSkipToQueueItem$5, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "p0", "Lo/onSetShuffleMode;", "read", "(Landroid/view/View;)Lo/onSetShuffleMode;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass5 extends MagicModuleUseCase implements getAnswerMap<View, onSetShuffleMode> {
        public static final AnonymousClass5 read = new AnonymousClass5();

        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public final onSetShuffleMode invoke(View view) {
            toMagicModuleMetaRepoModel.write(view, "");
            Object tag = view.getTag(onSetPlaybackSpeed.write.view_tree_on_back_pressed_dispatcher_owner);
            if (tag instanceof onSetShuffleMode) {
                return (onSetShuffleMode) tag;
            }
            return null;
        }

        AnonymousClass5() {
            super(1);
        }
    }
}
