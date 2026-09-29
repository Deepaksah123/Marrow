package kotlin;

import kotlin.Metadata;
import kotlin.component22;

/* JADX INFO: loaded from: classes4.dex */
public final class component15<D, E, V> extends component21<D, E, V> implements isTimestampInvalidError<D, E, V> {
    private final RenewEligible<RemoteActionCompatParcelizer<D, E, V>> RemoteActionCompatParcelizer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public component15(getNavDrawerKey getnavdrawerkey, CourseConfigV2SettingsItems courseConfigV2SettingsItems) {
        super(getnavdrawerkey, courseConfigV2SettingsItems);
        toMagicModuleMetaRepoModel.write(getnavdrawerkey, "");
        toMagicModuleMetaRepoModel.write(courseConfigV2SettingsItems, "");
        this.RemoteActionCompatParcelizer = getRenewExpiresOn.write(RenewEligibleCompanion.write, new AnonymousClass1(this));
    }

    /* JADX INFO: renamed from: o.component15$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"D", "E", "V", "Lo/component15$RemoteActionCompatParcelizer;", "write", "()Lo/component15$RemoteActionCompatParcelizer;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass1 extends MagicModuleUseCase implements getCreatedOnDateMs<RemoteActionCompatParcelizer<D, E, V>> {
        private /* synthetic */ component15<D, E, V> write;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public final RemoteActionCompatParcelizer<D, E, V> invoke() {
            return new RemoteActionCompatParcelizer<>(this.write);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(component15<D, E, V> component15Var) {
            super(0);
            this.write = component15Var;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.isDbFlushIgnored
    /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
    public RemoteActionCompatParcelizer<D, E, V> aN_() {
        return this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer();
    }

    public final void IconCompatParcelizer(D d, E e, V v) throws onEnvironmentVariableUpdate {
        aN_().RemoteActionCompatParcelizer(d, e, v);
    }

    public static final class RemoteActionCompatParcelizer<D, E, V> extends component22.read<V> implements cancelNotifications<D, E, V> {
        private final component15<D, E, V> AudioAttributesCompatParcelizer;

        public RemoteActionCompatParcelizer(component15<D, E, V> component15Var) {
            toMagicModuleMetaRepoModel.write(component15Var, "");
            this.AudioAttributesCompatParcelizer = component15Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // o.component22.AudioAttributesCompatParcelizer
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public component15<D, E, V> read() {
            return this.AudioAttributesCompatParcelizer;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.getModuleData
        public final /* synthetic */ Object AudioAttributesCompatParcelizer(Object obj, Object obj2, Object obj3) throws onEnvironmentVariableUpdate {
            IconCompatParcelizer(obj, obj2, obj3);
            return getShowPopup.INSTANCE;
        }

        private void IconCompatParcelizer(D d, E e, V v) throws onEnvironmentVariableUpdate {
            read().IconCompatParcelizer(d, e, v);
        }
    }
}
