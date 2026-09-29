package kotlin;

import androidx.compose.ui.platform.AbstractComposeView;
import kotlin.Metadata;
import kotlin.anyIgnorals;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a%\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroidx/compose/ui/platform/AbstractComposeView;", "p0", "Lo/anyIgnorals;", "p1", "Lkotlin/Function0;", "", "AudioAttributesCompatParcelizer", "(Landroidx/compose/ui/platform/AbstractComposeView;Lo/anyIgnorals;)Lo/getCreatedOnDateMs;"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class withInsertedAnnotationIntrospector {
    /* JADX INFO: Access modifiers changed from: private */
    public static final getCreatedOnDateMs<getShowPopup> AudioAttributesCompatParcelizer(final AbstractComposeView abstractComposeView, anyIgnorals anyignorals) {
        if (anyignorals.getAudioAttributesImplApi26Parcelizer().compareTo(anyIgnorals.write.AudioAttributesCompatParcelizer) <= 0) {
            StringBuilder sb = new StringBuilder("Cannot configure ");
            sb.append(abstractComposeView);
            sb.append(" to disposeComposition at Lifecycle ON_DESTROY: ");
            sb.append(anyignorals);
            sb.append("is already destroyed");
            throw new IllegalStateException(sb.toString().toString());
        }
        findAccess findaccess = new findAccess() { // from class: o.findAction
            @Override // kotlin.findAccess
            public final void read(hasGetter hasgetter, anyIgnorals.read readVar) {
                withInsertedAnnotationIntrospector.RemoteActionCompatParcelizer(abstractComposeView, hasgetter, readVar);
            }
        };
        anyignorals.IconCompatParcelizer(findaccess);
        return new AnonymousClass2(anyignorals, findaccess);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void RemoteActionCompatParcelizer(AbstractComposeView abstractComposeView, hasGetter hasgetter, anyIgnorals.read readVar) {
        if (readVar == anyIgnorals.read.ON_DESTROY) {
            abstractComposeView.RemoteActionCompatParcelizer();
        }
    }

    /* JADX INFO: renamed from: o.withInsertedAnnotationIntrospector$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "write", "()V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass2 extends MagicModuleUseCase implements getCreatedOnDateMs<getShowPopup> {
        final /* synthetic */ findAccess $read;
        final /* synthetic */ anyIgnorals $write;

        @Override // kotlin.getCreatedOnDateMs
        public final /* synthetic */ getShowPopup invoke() {
            write();
            return getShowPopup.INSTANCE;
        }

        public final void write() {
            this.$write.AudioAttributesCompatParcelizer(this.$read);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(anyIgnorals anyignorals, findAccess findaccess) {
            super(0);
            this.$write = anyignorals;
            this.$read = findaccess;
        }
    }
}
