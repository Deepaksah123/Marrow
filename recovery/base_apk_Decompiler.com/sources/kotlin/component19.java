package kotlin;

import java.lang.reflect.Member;
import kotlin.Metadata;
import kotlin.component22;
import kotlin.isVideoNetworkError;

/* JADX INFO: loaded from: classes4.dex */
public class component19<T, V> extends component22<V> implements isVideoNetworkError<T, V> {
    private final RenewEligible<Member> IconCompatParcelizer;
    private final RenewEligible<IconCompatParcelizer<T, V>> RemoteActionCompatParcelizer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public component19(getNavDrawerKey getnavdrawerkey, String str, String str2, Object obj) {
        super(getnavdrawerkey, str, str2, obj);
        toMagicModuleMetaRepoModel.write(getnavdrawerkey, "");
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        this.RemoteActionCompatParcelizer = getRenewExpiresOn.write(RenewEligibleCompanion.write, new AnonymousClass1(this));
        this.IconCompatParcelizer = getRenewExpiresOn.write(RenewEligibleCompanion.write, new AnonymousClass5(this));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public component19(getNavDrawerKey getnavdrawerkey, CourseConfigV2SettingsItems courseConfigV2SettingsItems) {
        super(getnavdrawerkey, courseConfigV2SettingsItems);
        toMagicModuleMetaRepoModel.write(getnavdrawerkey, "");
        toMagicModuleMetaRepoModel.write(courseConfigV2SettingsItems, "");
        this.RemoteActionCompatParcelizer = getRenewExpiresOn.write(RenewEligibleCompanion.write, new AnonymousClass1(this));
        this.IconCompatParcelizer = getRenewExpiresOn.write(RenewEligibleCompanion.write, new AnonymousClass5(this));
    }

    /* JADX INFO: renamed from: o.component19$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0006\b\u0001\u0010\u0001 \u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "V", "Lo/component19$IconCompatParcelizer;", "read", "()Lo/component19$IconCompatParcelizer;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass1 extends MagicModuleUseCase implements getCreatedOnDateMs<IconCompatParcelizer<T, ? extends V>> {
        private /* synthetic */ component19<T, V> IconCompatParcelizer;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public final IconCompatParcelizer<T, V> invoke() {
            return new IconCompatParcelizer<>(this.IconCompatParcelizer);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(component19<T, ? extends V> component19Var) {
            super(0);
            this.IconCompatParcelizer = component19Var;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.component22
    /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public IconCompatParcelizer<T, V> onAddQueueItem() {
        return this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer();
    }

    @Override // kotlin.isVideoNetworkError
    public V AudioAttributesCompatParcelizer(T t) {
        return RemoteActionCompatParcelizer().RemoteActionCompatParcelizer(t);
    }

    /* JADX INFO: renamed from: o.component19$5, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0006\b\u0001\u0010\u0001 \u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "V", "Ljava/lang/reflect/Member;", "write", "()Ljava/lang/reflect/Member;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass5 extends MagicModuleUseCase implements getCreatedOnDateMs<Member> {
        private /* synthetic */ component19<T, V> AudioAttributesCompatParcelizer;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public final Member invoke() {
            return this.AudioAttributesCompatParcelizer.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass5(component19<T, ? extends V> component19Var) {
            super(0);
            this.AudioAttributesCompatParcelizer = component19Var;
        }
    }

    @Override // kotlin.getAnswerMap
    public V invoke(T t) {
        return AudioAttributesCompatParcelizer(t);
    }

    public static final class IconCompatParcelizer<T, V> extends component22.write<V> implements isVideoNetworkError.AudioAttributesCompatParcelizer<T, V> {
        private final component19<T, V> RemoteActionCompatParcelizer;

        /* JADX WARN: Multi-variable type inference failed */
        public IconCompatParcelizer(component19<T, ? extends V> component19Var) {
            toMagicModuleMetaRepoModel.write(component19Var, "");
            this.RemoteActionCompatParcelizer = component19Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // o.component22.AudioAttributesCompatParcelizer
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public component19<T, V> read() {
            return this.RemoteActionCompatParcelizer;
        }

        @Override // kotlin.getAnswerMap
        public final V invoke(T t) {
            return read().AudioAttributesCompatParcelizer(t);
        }
    }
}
