package kotlin;

import kotlin.Metadata;
import kotlin.component22;
import kotlin.isRateLimitingError;

/* JADX INFO: loaded from: classes4.dex */
public final class component18<T, V> extends component19<T, V> implements isRateLimitingError<T, V> {
    private final RenewEligible<AudioAttributesCompatParcelizer<T, V>> read;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public component18(getNavDrawerKey getnavdrawerkey, String str, String str2, Object obj) {
        super(getnavdrawerkey, str, str2, obj);
        toMagicModuleMetaRepoModel.write(getnavdrawerkey, "");
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        this.read = getRenewExpiresOn.write(RenewEligibleCompanion.write, new AnonymousClass1(this));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public component18(getNavDrawerKey getnavdrawerkey, CourseConfigV2SettingsItems courseConfigV2SettingsItems) {
        super(getnavdrawerkey, courseConfigV2SettingsItems);
        toMagicModuleMetaRepoModel.write(getnavdrawerkey, "");
        toMagicModuleMetaRepoModel.write(courseConfigV2SettingsItems, "");
        this.read = getRenewExpiresOn.write(RenewEligibleCompanion.write, new AnonymousClass1(this));
    }

    /* JADX INFO: renamed from: o.component18$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "V", "Lo/component18$AudioAttributesCompatParcelizer;", "read", "()Lo/component18$AudioAttributesCompatParcelizer;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass1 extends MagicModuleUseCase implements getCreatedOnDateMs<AudioAttributesCompatParcelizer<T, V>> {
        private /* synthetic */ component18<T, V> read;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public final AudioAttributesCompatParcelizer<T, V> invoke() {
            return new AudioAttributesCompatParcelizer<>(this.read);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(component18<T, V> component18Var) {
            super(0);
            this.read = component18Var;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.isRateLimitingError
    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public AudioAttributesCompatParcelizer<T, V> aN_() {
        return this.read.RemoteActionCompatParcelizer();
    }

    public final void read(T t, V v) throws onEnvironmentVariableUpdate {
        aN_().RemoteActionCompatParcelizer(t, v);
    }

    public static final class AudioAttributesCompatParcelizer<T, V> extends component22.read<V> implements isRateLimitingError.read<T, V> {
        private final component18<T, V> RemoteActionCompatParcelizer;

        public AudioAttributesCompatParcelizer(component18<T, V> component18Var) {
            toMagicModuleMetaRepoModel.write(component18Var, "");
            this.RemoteActionCompatParcelizer = component18Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // o.component22.AudioAttributesCompatParcelizer
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public component18<T, V> read() {
            return this.RemoteActionCompatParcelizer;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        public final /* synthetic */ getShowPopup invoke(Object obj, Object obj2) throws onEnvironmentVariableUpdate {
            AudioAttributesCompatParcelizer(obj, obj2);
            return getShowPopup.INSTANCE;
        }

        private void AudioAttributesCompatParcelizer(T t, V v) throws onEnvironmentVariableUpdate {
            read().read(t, v);
        }
    }
}
