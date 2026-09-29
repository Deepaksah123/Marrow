package kotlin;

import kotlin.Metadata;
import kotlin.ResponseErrorCompanion;
import kotlin.component22;

/* JADX INFO: loaded from: classes4.dex */
public class component20<V> extends component22<V> implements ResponseErrorCompanion<V> {
    private final RenewEligible<IconCompatParcelizer<V>> IconCompatParcelizer;
    private final RenewEligible<Object> RemoteActionCompatParcelizer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public component20(getNavDrawerKey getnavdrawerkey, CourseConfigV2SettingsItems courseConfigV2SettingsItems) {
        super(getnavdrawerkey, courseConfigV2SettingsItems);
        toMagicModuleMetaRepoModel.write(getnavdrawerkey, "");
        toMagicModuleMetaRepoModel.write(courseConfigV2SettingsItems, "");
        this.IconCompatParcelizer = getRenewExpiresOn.write(RenewEligibleCompanion.write, new AnonymousClass3(this));
        this.RemoteActionCompatParcelizer = getRenewExpiresOn.write(RenewEligibleCompanion.write, new AnonymousClass1(this));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public component20(getNavDrawerKey getnavdrawerkey, String str, String str2, Object obj) {
        super(getnavdrawerkey, str, str2, obj);
        toMagicModuleMetaRepoModel.write(getnavdrawerkey, "");
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        this.IconCompatParcelizer = getRenewExpiresOn.write(RenewEligibleCompanion.write, new AnonymousClass3(this));
        this.RemoteActionCompatParcelizer = getRenewExpiresOn.write(RenewEligibleCompanion.write, new AnonymousClass1(this));
    }

    /* JADX INFO: renamed from: o.component20$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0006\b\u0000\u0010\u0000 \u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"V", "Lo/component20$IconCompatParcelizer;", "RemoteActionCompatParcelizer", "()Lo/component20$IconCompatParcelizer;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass3 extends MagicModuleUseCase implements getCreatedOnDateMs<IconCompatParcelizer<? extends V>> {
        private /* synthetic */ component20<V> IconCompatParcelizer;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final IconCompatParcelizer<V> invoke() {
            return new IconCompatParcelizer<>(this.IconCompatParcelizer);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass3(component20<? extends V> component20Var) {
            super(0);
            this.IconCompatParcelizer = component20Var;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.component22
    /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public IconCompatParcelizer<V> onAddQueueItem() {
        return this.IconCompatParcelizer.RemoteActionCompatParcelizer();
    }

    @Override // kotlin.ResponseErrorCompanion
    public V read() {
        return RemoteActionCompatParcelizer().RemoteActionCompatParcelizer(new Object[0]);
    }

    /* JADX INFO: renamed from: o.component20$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001\"\u0006\b\u0000\u0010\u0000 \u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"V", "", "invoke", "()Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass1 extends MagicModuleUseCase implements getCreatedOnDateMs<Object> {
        private /* synthetic */ component20<V> AudioAttributesCompatParcelizer;

        @Override // kotlin.getCreatedOnDateMs
        public final Object invoke() {
            component20<V> component20Var = this.AudioAttributesCompatParcelizer;
            return component20Var.read(component20Var.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver());
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(component20<? extends V> component20Var) {
            super(0);
            this.AudioAttributesCompatParcelizer = component20Var;
        }
    }

    @Override // kotlin.getCreatedOnDateMs
    public V invoke() {
        return read();
    }

    public static final class IconCompatParcelizer<R> extends component22.write<R> implements ResponseErrorCompanion.IconCompatParcelizer<R> {
        private final component20<R> AudioAttributesCompatParcelizer;

        /* JADX WARN: Multi-variable type inference failed */
        public IconCompatParcelizer(component20<? extends R> component20Var) {
            toMagicModuleMetaRepoModel.write(component20Var, "");
            this.AudioAttributesCompatParcelizer = component20Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // o.component22.AudioAttributesCompatParcelizer
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public component20<R> read() {
            return this.AudioAttributesCompatParcelizer;
        }

        @Override // kotlin.getCreatedOnDateMs
        public final R invoke() {
            return RemoteActionCompatParcelizer().read();
        }
    }
}
