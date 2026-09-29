package kotlin;

import android.view.View;
import androidx.compose.ui.platform.AbstractComposeView;
import kotlin.MagicModuleUseCaseImplWhenMappings;
import kotlin.Metadata;
import kotlin.withPropertyNamingStrategy;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\bf\u0018\u0000 \b2\u00020\u0001:\u0004\b\u0006\t\nJ\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Lo/withPropertyNamingStrategy;", "", "Landroidx/compose/ui/platform/AbstractComposeView;", "p0", "Lkotlin/Function0;", "", "RemoteActionCompatParcelizer", "(Landroidx/compose/ui/platform/AbstractComposeView;)Lo/getCreatedOnDateMs;", "read", "IconCompatParcelizer", "AudioAttributesCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface withPropertyNamingStrategy {

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.IconCompatParcelizer;

    getCreatedOnDateMs<getShowPopup> RemoteActionCompatParcelizer(AbstractComposeView p0);

    /* JADX INFO: renamed from: o.withPropertyNamingStrategy$read, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0005\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006"}, d2 = {"Lo/withPropertyNamingStrategy$read;", "", "<init>", "()V", "Lo/withPropertyNamingStrategy;", "read", "()Lo/withPropertyNamingStrategy;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion IconCompatParcelizer = new Companion();

        private Companion() {
        }

        public final withPropertyNamingStrategy read() {
            return RemoteActionCompatParcelizer.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lo/withPropertyNamingStrategy$RemoteActionCompatParcelizer;", "Lo/withPropertyNamingStrategy;", "<init>", "()V", "Landroidx/compose/ui/platform/AbstractComposeView;", "p0", "Lkotlin/Function0;", "", "RemoteActionCompatParcelizer", "(Landroidx/compose/ui/platform/AbstractComposeView;)Lo/getCreatedOnDateMs;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class RemoteActionCompatParcelizer implements withPropertyNamingStrategy {
        public static final RemoteActionCompatParcelizer INSTANCE = new RemoteActionCompatParcelizer();

        private RemoteActionCompatParcelizer() {
        }

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006"}, d2 = {"Lo/withPropertyNamingStrategy$RemoteActionCompatParcelizer$IconCompatParcelizer;", "Landroid/view/View$OnAttachStateChangeListener;", "Landroid/view/View;", "p0", "", "onViewAttachedToWindow", "(Landroid/view/View;)V", "onViewDetachedFromWindow"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class IconCompatParcelizer implements View.OnAttachStateChangeListener {
            final /* synthetic */ AbstractComposeView read;

            @Override // android.view.View.OnAttachStateChangeListener
            public final void onViewAttachedToWindow(View p0) {
            }

            IconCompatParcelizer(AbstractComposeView abstractComposeView) {
                this.read = abstractComposeView;
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public final void onViewDetachedFromWindow(View p0) {
                if (createPrimordial.RemoteActionCompatParcelizer(this.read)) {
                    return;
                }
                this.read.RemoteActionCompatParcelizer();
            }
        }

        @Override // kotlin.withPropertyNamingStrategy
        public final getCreatedOnDateMs<getShowPopup> RemoteActionCompatParcelizer(final AbstractComposeView p0) {
            IconCompatParcelizer iconCompatParcelizer = new IconCompatParcelizer(p0);
            p0.addOnAttachStateChangeListener(iconCompatParcelizer);
            resolveWithoutSuperTypes resolvewithoutsupertypes = new resolveWithoutSuperTypes() { // from class: o.withAnnotationIntrospector
                @Override // kotlin.resolveWithoutSuperTypes
                public final void AudioAttributesCompatParcelizer() {
                    withPropertyNamingStrategy.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(p0);
                }
            };
            createPrimordial.RemoteActionCompatParcelizer(p0, resolvewithoutsupertypes);
            return new AnonymousClass5(p0, iconCompatParcelizer, resolvewithoutsupertypes);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void AudioAttributesCompatParcelizer(AbstractComposeView abstractComposeView) {
            abstractComposeView.RemoteActionCompatParcelizer();
        }

        /* JADX INFO: renamed from: o.withPropertyNamingStrategy$RemoteActionCompatParcelizer$5, reason: invalid class name */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "IconCompatParcelizer", "()V"}, k = 3, mv = {2, 0, 0}, xi = 48)
        static final class AnonymousClass5 extends MagicModuleUseCase implements getCreatedOnDateMs<getShowPopup> {
            final /* synthetic */ AbstractComposeView $RemoteActionCompatParcelizer;
            final /* synthetic */ IconCompatParcelizer $read;
            final /* synthetic */ resolveWithoutSuperTypes $write;

            @Override // kotlin.getCreatedOnDateMs
            public final /* synthetic */ getShowPopup invoke() {
                IconCompatParcelizer();
                return getShowPopup.INSTANCE;
            }

            public final void IconCompatParcelizer() {
                this.$RemoteActionCompatParcelizer.removeOnAttachStateChangeListener(this.$read);
                createPrimordial.IconCompatParcelizer(this.$RemoteActionCompatParcelizer, this.$write);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass5(AbstractComposeView abstractComposeView, IconCompatParcelizer iconCompatParcelizer, resolveWithoutSuperTypes resolvewithoutsupertypes) {
                super(0);
                this.$RemoteActionCompatParcelizer = abstractComposeView;
                this.$read = iconCompatParcelizer;
                this.$write = resolvewithoutsupertypes;
            }
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lo/withPropertyNamingStrategy$IconCompatParcelizer;", "Lo/withPropertyNamingStrategy;", "<init>", "()V", "Landroidx/compose/ui/platform/AbstractComposeView;", "p0", "Lkotlin/Function0;", "", "RemoteActionCompatParcelizer", "(Landroidx/compose/ui/platform/AbstractComposeView;)Lo/getCreatedOnDateMs;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class IconCompatParcelizer implements withPropertyNamingStrategy {
        public static final IconCompatParcelizer INSTANCE = new IconCompatParcelizer();

        private IconCompatParcelizer() {
        }

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006"}, d2 = {"Lo/withPropertyNamingStrategy$IconCompatParcelizer$write;", "Landroid/view/View$OnAttachStateChangeListener;", "Landroid/view/View;", "p0", "", "onViewAttachedToWindow", "(Landroid/view/View;)V", "onViewDetachedFromWindow"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class write implements View.OnAttachStateChangeListener {
            final /* synthetic */ AbstractComposeView write;

            @Override // android.view.View.OnAttachStateChangeListener
            public final void onViewAttachedToWindow(View p0) {
            }

            write(AbstractComposeView abstractComposeView) {
                this.write = abstractComposeView;
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public final void onViewDetachedFromWindow(View p0) {
                this.write.RemoteActionCompatParcelizer();
            }
        }

        @Override // kotlin.withPropertyNamingStrategy
        public final getCreatedOnDateMs<getShowPopup> RemoteActionCompatParcelizer(AbstractComposeView p0) {
            write writeVar = new write(p0);
            p0.addOnAttachStateChangeListener(writeVar);
            return new AnonymousClass1(p0, writeVar);
        }

        /* JADX INFO: renamed from: o.withPropertyNamingStrategy$IconCompatParcelizer$1, reason: invalid class name */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "RemoteActionCompatParcelizer", "()V"}, k = 3, mv = {2, 0, 0}, xi = 48)
        static final class AnonymousClass1 extends MagicModuleUseCase implements getCreatedOnDateMs<getShowPopup> {
            final /* synthetic */ AbstractComposeView $RemoteActionCompatParcelizer;
            final /* synthetic */ write $write;

            public final void RemoteActionCompatParcelizer() {
                this.$RemoteActionCompatParcelizer.removeOnAttachStateChangeListener(this.$write);
            }

            @Override // kotlin.getCreatedOnDateMs
            public final /* synthetic */ getShowPopup invoke() {
                RemoteActionCompatParcelizer();
                return getShowPopup.INSTANCE;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(AbstractComposeView abstractComposeView, write writeVar) {
                super(0);
                this.$RemoteActionCompatParcelizer = abstractComposeView;
                this.$write = writeVar;
            }
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lo/withPropertyNamingStrategy$AudioAttributesCompatParcelizer;", "Lo/withPropertyNamingStrategy;", "<init>", "()V", "Landroidx/compose/ui/platform/AbstractComposeView;", "p0", "Lkotlin/Function0;", "", "RemoteActionCompatParcelizer", "(Landroidx/compose/ui/platform/AbstractComposeView;)Lo/getCreatedOnDateMs;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AudioAttributesCompatParcelizer implements withPropertyNamingStrategy {
        public static final AudioAttributesCompatParcelizer INSTANCE = new AudioAttributesCompatParcelizer();

        private AudioAttributesCompatParcelizer() {
        }

        /* JADX WARN: Type inference failed for: r1v2, types: [T, o.withPropertyNamingStrategy$AudioAttributesCompatParcelizer$2] */
        @Override // kotlin.withPropertyNamingStrategy
        public final getCreatedOnDateMs<getShowPopup> RemoteActionCompatParcelizer(AbstractComposeView p0) {
            if (p0.isAttachedToWindow()) {
                hasGetter hasgetterWrite = isCreatorVisible.write(p0);
                if (hasgetterWrite != null) {
                    return withInsertedAnnotationIntrospector.AudioAttributesCompatParcelizer(p0, hasgetterWrite.getLifecycle());
                }
                StringBuilder sb = new StringBuilder("View tree for ");
                sb.append(p0);
                sb.append(" has no ViewTreeLifecycleOwner");
                reportWrongTokenException.write(sb.toString());
                throw new PlanDetailsCreator();
            }
            MagicModuleUseCaseImplWhenMappings.write writeVar = new MagicModuleUseCaseImplWhenMappings.write();
            IconCompatParcelizer iconCompatParcelizer = new IconCompatParcelizer(p0, writeVar);
            p0.addOnAttachStateChangeListener(iconCompatParcelizer);
            writeVar.write = new AnonymousClass2(p0, iconCompatParcelizer);
            return new AnonymousClass3(writeVar);
        }

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006"}, d2 = {"Lo/withPropertyNamingStrategy$AudioAttributesCompatParcelizer$IconCompatParcelizer;", "Landroid/view/View$OnAttachStateChangeListener;", "Landroid/view/View;", "p0", "", "onViewAttachedToWindow", "(Landroid/view/View;)V", "onViewDetachedFromWindow"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class IconCompatParcelizer implements View.OnAttachStateChangeListener {
            final /* synthetic */ MagicModuleUseCaseImplWhenMappings.write<getCreatedOnDateMs<getShowPopup>> AudioAttributesCompatParcelizer;
            final /* synthetic */ AbstractComposeView write;

            @Override // android.view.View.OnAttachStateChangeListener
            public final void onViewDetachedFromWindow(View p0) {
            }

            IconCompatParcelizer(AbstractComposeView abstractComposeView, MagicModuleUseCaseImplWhenMappings.write<getCreatedOnDateMs<getShowPopup>> writeVar) {
                this.write = abstractComposeView;
                this.AudioAttributesCompatParcelizer = writeVar;
            }

            /* JADX WARN: Type inference failed for: r3v7, types: [T, o.getCreatedOnDateMs] */
            @Override // android.view.View.OnAttachStateChangeListener
            public final void onViewAttachedToWindow(View p0) {
                hasGetter hasgetterWrite = isCreatorVisible.write(this.write);
                AbstractComposeView abstractComposeView = this.write;
                if (hasgetterWrite == null) {
                    StringBuilder sb = new StringBuilder("View tree for ");
                    sb.append(abstractComposeView);
                    sb.append(" has no ViewTreeLifecycleOwner");
                    reportWrongTokenException.write(sb.toString());
                    throw new PlanDetailsCreator();
                }
                this.AudioAttributesCompatParcelizer.write = withInsertedAnnotationIntrospector.AudioAttributesCompatParcelizer(abstractComposeView, hasgetterWrite.getLifecycle());
                this.write.removeOnAttachStateChangeListener(this);
            }
        }

        /* JADX INFO: renamed from: o.withPropertyNamingStrategy$AudioAttributesCompatParcelizer$2, reason: invalid class name */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "write", "()V"}, k = 3, mv = {2, 0, 0}, xi = 48)
        static final class AnonymousClass2 extends MagicModuleUseCase implements getCreatedOnDateMs<getShowPopup> {
            final /* synthetic */ IconCompatParcelizer $AudioAttributesCompatParcelizer;
            final /* synthetic */ AbstractComposeView $read;

            @Override // kotlin.getCreatedOnDateMs
            public final /* synthetic */ getShowPopup invoke() {
                write();
                return getShowPopup.INSTANCE;
            }

            public final void write() {
                this.$read.removeOnAttachStateChangeListener(this.$AudioAttributesCompatParcelizer);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(AbstractComposeView abstractComposeView, IconCompatParcelizer iconCompatParcelizer) {
                super(0);
                this.$read = abstractComposeView;
                this.$AudioAttributesCompatParcelizer = iconCompatParcelizer;
            }
        }

        /* JADX INFO: renamed from: o.withPropertyNamingStrategy$AudioAttributesCompatParcelizer$3, reason: invalid class name */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "AudioAttributesCompatParcelizer", "()V"}, k = 3, mv = {2, 0, 0}, xi = 48)
        static final class AnonymousClass3 extends MagicModuleUseCase implements getCreatedOnDateMs<getShowPopup> {
            final /* synthetic */ MagicModuleUseCaseImplWhenMappings.write<getCreatedOnDateMs<getShowPopup>> $RemoteActionCompatParcelizer;

            public final void AudioAttributesCompatParcelizer() {
                this.$RemoteActionCompatParcelizer.write.invoke();
            }

            @Override // kotlin.getCreatedOnDateMs
            public final /* synthetic */ getShowPopup invoke() {
                AudioAttributesCompatParcelizer();
                return getShowPopup.INSTANCE;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(MagicModuleUseCaseImplWhenMappings.write<getCreatedOnDateMs<getShowPopup>> writeVar) {
                super(0);
                this.$RemoteActionCompatParcelizer = writeVar;
            }
        }
    }
}
