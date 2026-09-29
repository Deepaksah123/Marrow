package kotlin;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import kotlin.PlanSubscriptionRSModel;

/* JADX INFO: loaded from: classes4.dex */
final class SchemaDetailRSModel extends PlanSubscriptionRSModel.IconCompatParcelizer {
    private boolean AudioAttributesCompatParcelizer = true;

    SchemaDetailRSModel() {
    }

    @Override // o.PlanSubscriptionRSModel.IconCompatParcelizer
    public final PlanSubscriptionRSModel<ActivityAdapterModule, ?> RemoteActionCompatParcelizer(Type type, Annotation[] annotationArr, GTNudgeRequestModel gTNudgeRequestModel) {
        if (type == ActivityAdapterModule.class) {
            if (GTSubjectAnalyticsV2ResponseModel.RemoteActionCompatParcelizer(annotationArr, (Class<? extends Annotation>) SubjectStatV2ResponseModel.class)) {
                return write.AudioAttributesCompatParcelizer;
            }
            return read.write;
        }
        if (type == Void.class) {
            return AudioAttributesImplApi26Parcelizer.AudioAttributesCompatParcelizer;
        }
        if (!this.AudioAttributesCompatParcelizer || type != getShowPopup.class) {
            return null;
        }
        try {
            return RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer;
        } catch (NoClassDefFoundError unused) {
            this.AudioAttributesCompatParcelizer = false;
            return null;
        }
    }

    @Override // o.PlanSubscriptionRSModel.IconCompatParcelizer
    public final PlanSubscriptionRSModel<?, ThemeKtExternalSyntheticLambda2> write(Type type) {
        if (ThemeKtExternalSyntheticLambda2.class.isAssignableFrom(GTSubjectAnalyticsV2ResponseModel.RemoteActionCompatParcelizer(type))) {
            return IconCompatParcelizer.IconCompatParcelizer;
        }
        return null;
    }

    static final class AudioAttributesImplApi26Parcelizer implements PlanSubscriptionRSModel<ActivityAdapterModule, Void> {
        static final AudioAttributesImplApi26Parcelizer AudioAttributesCompatParcelizer = new AudioAttributesImplApi26Parcelizer();

        AudioAttributesImplApi26Parcelizer() {
        }

        @Override // kotlin.PlanSubscriptionRSModel
        public final /* synthetic */ Void IconCompatParcelizer(ActivityAdapterModule activityAdapterModule) throws IOException {
            return read(activityAdapterModule);
        }

        private static Void read(ActivityAdapterModule activityAdapterModule) {
            activityAdapterModule.close();
            return null;
        }
    }

    static final class RemoteActionCompatParcelizer implements PlanSubscriptionRSModel<ActivityAdapterModule, getShowPopup> {
        static final RemoteActionCompatParcelizer AudioAttributesCompatParcelizer = new RemoteActionCompatParcelizer();

        RemoteActionCompatParcelizer() {
        }

        @Override // kotlin.PlanSubscriptionRSModel
        public final /* synthetic */ getShowPopup IconCompatParcelizer(ActivityAdapterModule activityAdapterModule) throws IOException {
            return AudioAttributesCompatParcelizer(activityAdapterModule);
        }

        private static getShowPopup AudioAttributesCompatParcelizer(ActivityAdapterModule activityAdapterModule) {
            activityAdapterModule.close();
            return getShowPopup.INSTANCE;
        }
    }

    static final class IconCompatParcelizer implements PlanSubscriptionRSModel<ThemeKtExternalSyntheticLambda2, ThemeKtExternalSyntheticLambda2> {
        static final IconCompatParcelizer IconCompatParcelizer = new IconCompatParcelizer();

        private static ThemeKtExternalSyntheticLambda2 RemoteActionCompatParcelizer(ThemeKtExternalSyntheticLambda2 themeKtExternalSyntheticLambda2) {
            return themeKtExternalSyntheticLambda2;
        }

        IconCompatParcelizer() {
        }

        @Override // kotlin.PlanSubscriptionRSModel
        public final /* synthetic */ ThemeKtExternalSyntheticLambda2 IconCompatParcelizer(ThemeKtExternalSyntheticLambda2 themeKtExternalSyntheticLambda2) throws IOException {
            return RemoteActionCompatParcelizer(themeKtExternalSyntheticLambda2);
        }
    }

    static final class write implements PlanSubscriptionRSModel<ActivityAdapterModule, ActivityAdapterModule> {
        static final write AudioAttributesCompatParcelizer = new write();

        private static ActivityAdapterModule write(ActivityAdapterModule activityAdapterModule) {
            return activityAdapterModule;
        }

        write() {
        }

        @Override // kotlin.PlanSubscriptionRSModel
        public final /* synthetic */ ActivityAdapterModule IconCompatParcelizer(ActivityAdapterModule activityAdapterModule) throws IOException {
            return write(activityAdapterModule);
        }
    }

    static final class read implements PlanSubscriptionRSModel<ActivityAdapterModule, ActivityAdapterModule> {
        static final read write = new read();

        read() {
        }

        @Override // kotlin.PlanSubscriptionRSModel
        public final /* synthetic */ ActivityAdapterModule IconCompatParcelizer(ActivityAdapterModule activityAdapterModule) throws IOException {
            return write(activityAdapterModule);
        }

        private static ActivityAdapterModule write(ActivityAdapterModule activityAdapterModule) throws IOException {
            try {
                return GTSubjectAnalyticsV2ResponseModel.write(activityAdapterModule);
            } finally {
                activityAdapterModule.close();
            }
        }
    }

    static final class AudioAttributesCompatParcelizer implements PlanSubscriptionRSModel<Object, String> {
        static final AudioAttributesCompatParcelizer RemoteActionCompatParcelizer = new AudioAttributesCompatParcelizer();

        AudioAttributesCompatParcelizer() {
        }

        @Override // kotlin.PlanSubscriptionRSModel
        public final /* synthetic */ String IconCompatParcelizer(Object obj) throws IOException {
            return read(obj);
        }

        private static String read(Object obj) {
            return obj.toString();
        }
    }
}
