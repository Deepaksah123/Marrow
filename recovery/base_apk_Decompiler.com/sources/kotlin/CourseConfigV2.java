package kotlin;

import kotlin.Metadata;
import kotlin.component22;
import kotlin.isLogoutRequired;

/* JADX INFO: loaded from: classes4.dex */
public final class CourseConfigV2<V> extends component20<V> implements isLogoutRequired<V> {
    private final RenewEligible<read<V>> read;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CourseConfigV2(getNavDrawerKey getnavdrawerkey, CourseConfigV2SettingsItems courseConfigV2SettingsItems) {
        super(getnavdrawerkey, courseConfigV2SettingsItems);
        toMagicModuleMetaRepoModel.write(getnavdrawerkey, "");
        toMagicModuleMetaRepoModel.write(courseConfigV2SettingsItems, "");
        this.read = getRenewExpiresOn.write(RenewEligibleCompanion.write, new AnonymousClass4(this));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CourseConfigV2(getNavDrawerKey getnavdrawerkey, String str, String str2, Object obj) {
        super(getnavdrawerkey, str, str2, obj);
        toMagicModuleMetaRepoModel.write(getnavdrawerkey, "");
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        this.read = getRenewExpiresOn.write(RenewEligibleCompanion.write, new AnonymousClass4(this));
    }

    /* JADX INFO: renamed from: o.CourseConfigV2$4, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"V", "Lo/CourseConfigV2$read;", "write", "()Lo/CourseConfigV2$read;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass4 extends MagicModuleUseCase implements getCreatedOnDateMs<read<V>> {
        private /* synthetic */ CourseConfigV2<V> read;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public final read<V> invoke() {
            return new read<>(this.read);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass4(CourseConfigV2<V> courseConfigV2) {
            super(0);
            this.read = courseConfigV2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.isDbFlushIgnored
    /* JADX INFO: renamed from: onFastForward, reason: merged with bridge method [inline-methods] */
    public read<V> aN_() {
        return this.read.RemoteActionCompatParcelizer();
    }

    public final void AudioAttributesCompatParcelizer(V v) throws onEnvironmentVariableUpdate {
        aN_().RemoteActionCompatParcelizer(v);
    }

    public static final class read<R> extends component22.read<R> implements isLogoutRequired.IconCompatParcelizer<R> {
        private final CourseConfigV2<R> RemoteActionCompatParcelizer;

        public read(CourseConfigV2<R> courseConfigV2) {
            toMagicModuleMetaRepoModel.write(courseConfigV2, "");
            this.RemoteActionCompatParcelizer = courseConfigV2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // o.component22.AudioAttributesCompatParcelizer
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public CourseConfigV2<R> read() {
            return this.RemoteActionCompatParcelizer;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.getAnswerMap
        public final /* synthetic */ getShowPopup invoke(Object obj) throws onEnvironmentVariableUpdate {
            RemoteActionCompatParcelizer(obj);
            return getShowPopup.INSTANCE;
        }

        private void RemoteActionCompatParcelizer(R r) throws onEnvironmentVariableUpdate {
            read().AudioAttributesCompatParcelizer(r);
        }
    }
}
